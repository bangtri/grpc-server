package grpc.service.param;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.51.0)",
    comments = "Source: systemparam.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SystemParamServiceGrpc {

  private SystemParamServiceGrpc() {}

  public static final String SERVICE_NAME = "grpc.service.param.SystemParamService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<grpc.service.param.DetailParamRequest,
      grpc.service.param.DetailParamResponse> getFindParamByCodeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "findParamByCode",
      requestType = grpc.service.param.DetailParamRequest.class,
      responseType = grpc.service.param.DetailParamResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.service.param.DetailParamRequest,
      grpc.service.param.DetailParamResponse> getFindParamByCodeMethod() {
    io.grpc.MethodDescriptor<grpc.service.param.DetailParamRequest, grpc.service.param.DetailParamResponse> getFindParamByCodeMethod;
    if ((getFindParamByCodeMethod = SystemParamServiceGrpc.getFindParamByCodeMethod) == null) {
      synchronized (SystemParamServiceGrpc.class) {
        if ((getFindParamByCodeMethod = SystemParamServiceGrpc.getFindParamByCodeMethod) == null) {
          SystemParamServiceGrpc.getFindParamByCodeMethod = getFindParamByCodeMethod =
              io.grpc.MethodDescriptor.<grpc.service.param.DetailParamRequest, grpc.service.param.DetailParamResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "findParamByCode"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.service.param.DetailParamRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.service.param.DetailParamResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SystemParamServiceMethodDescriptorSupplier("findParamByCode"))
              .build();
        }
      }
    }
    return getFindParamByCodeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SystemParamServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SystemParamServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SystemParamServiceStub>() {
        @java.lang.Override
        public SystemParamServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SystemParamServiceStub(channel, callOptions);
        }
      };
    return SystemParamServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SystemParamServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SystemParamServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SystemParamServiceBlockingStub>() {
        @java.lang.Override
        public SystemParamServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SystemParamServiceBlockingStub(channel, callOptions);
        }
      };
    return SystemParamServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SystemParamServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SystemParamServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SystemParamServiceFutureStub>() {
        @java.lang.Override
        public SystemParamServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SystemParamServiceFutureStub(channel, callOptions);
        }
      };
    return SystemParamServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class SystemParamServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void findParamByCode(grpc.service.param.DetailParamRequest request,
        io.grpc.stub.StreamObserver<grpc.service.param.DetailParamResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindParamByCodeMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getFindParamByCodeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                grpc.service.param.DetailParamRequest,
                grpc.service.param.DetailParamResponse>(
                  this, METHODID_FIND_PARAM_BY_CODE)))
          .build();
    }
  }

  /**
   */
  public static final class SystemParamServiceStub extends io.grpc.stub.AbstractAsyncStub<SystemParamServiceStub> {
    private SystemParamServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SystemParamServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SystemParamServiceStub(channel, callOptions);
    }

    /**
     */
    public void findParamByCode(grpc.service.param.DetailParamRequest request,
        io.grpc.stub.StreamObserver<grpc.service.param.DetailParamResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindParamByCodeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SystemParamServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<SystemParamServiceBlockingStub> {
    private SystemParamServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SystemParamServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SystemParamServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public grpc.service.param.DetailParamResponse findParamByCode(grpc.service.param.DetailParamRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindParamByCodeMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SystemParamServiceFutureStub extends io.grpc.stub.AbstractFutureStub<SystemParamServiceFutureStub> {
    private SystemParamServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SystemParamServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SystemParamServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.service.param.DetailParamResponse> findParamByCode(
        grpc.service.param.DetailParamRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindParamByCodeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_FIND_PARAM_BY_CODE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SystemParamServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SystemParamServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_FIND_PARAM_BY_CODE:
          serviceImpl.findParamByCode((grpc.service.param.DetailParamRequest) request,
              (io.grpc.stub.StreamObserver<grpc.service.param.DetailParamResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class SystemParamServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SystemParamServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpc.service.param.Systemparam.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SystemParamService");
    }
  }

  private static final class SystemParamServiceFileDescriptorSupplier
      extends SystemParamServiceBaseDescriptorSupplier {
    SystemParamServiceFileDescriptorSupplier() {}
  }

  private static final class SystemParamServiceMethodDescriptorSupplier
      extends SystemParamServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SystemParamServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (SystemParamServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SystemParamServiceFileDescriptorSupplier())
              .addMethod(getFindParamByCodeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
