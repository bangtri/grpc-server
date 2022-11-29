package bang.nt.grpc.server.grpcservice;

import grpc.service.hello.HelloRequest;
import grpc.service.hello.HelloResponse;
import grpc.service.hello.HelloServiceGrpc;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class HelloService extends HelloServiceGrpc.HelloServiceImplBase {

    @Override
    public void helloService(HelloRequest request, StreamObserver<HelloResponse> observer) {
        HelloResponse response = HelloResponse.newBuilder()
                .setStatus("200")
                .setMessage("Success")
                .setResponse(request.getRequest())
                .build();
        observer.onNext(response);
        observer.onCompleted();
    }

}
