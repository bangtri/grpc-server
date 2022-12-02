package bang.nt.grpc.server.grpcservice;

import bang.nt.grpc.server.domain.SystemParam;
import bang.nt.grpc.server.service.GenericService;
import bang.nt.grpc.server.service.read.SystemParamReadService;
import grpc.service.param.*;
import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.http.HttpStatus;

import java.util.Objects;

@GrpcService
@RequiredArgsConstructor
public class ParameterService extends SystemParamServiceGrpc.SystemParamServiceImplBase {

    private final GenericService genericService;

    private final SystemParamReadService systemParamReadService;

    @Override
    public void findParamByCode(DetailParamRequest request, StreamObserver<DetailParamResponse> observer) {
        SystemParam systemParam = systemParamReadService.findParamByCode(request.getCode());
        DetailParamResponse detailParamResponse;
        if (Objects.nonNull(systemParam)) {
            detailParamResponse = DetailParamResponse.newBuilder()
                    .setResult(Result.newBuilder()
                            .setStatus(HttpStatus.OK.value())
                            .setMessage(genericService.message("global.message.ok"))
                            .build())
                    .setData(Data.newBuilder()
                            .setCode(systemParam.getCode())
                            .setValue(systemParam.getValue())
                            .setType(systemParam.getType())
                            .setDescription(systemParam.getDescription())
                            .setCreatedDate(String.valueOf(systemParam.getCreatedDate()))
                            .setModifiedDate(String.valueOf(systemParam.getModifiedDate()))
                            .setCreatedBy(systemParam.getCreatedBy())
                            .setModifiedBy(systemParam.getModifiedBy())
                            .build())
                    .build();
        } else {
            detailParamResponse = DetailParamResponse.newBuilder()
                    .setResult(Result.newBuilder()
                            .setStatus(HttpStatus.NOT_FOUND.value())
                            .setMessage(genericService.message("global.message.not-found"))
                            .build())
                    .build();
        }
        observer.onNext(detailParamResponse);
        observer.onCompleted();
    }

}
