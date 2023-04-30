package com.cedulasservicegrpc.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: cedulas.proto")
public final class cedulasServiceGrpc {

  private cedulasServiceGrpc() {}

  public static final String SERVICE_NAME = "cedulasService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.cedulasservicegrpc.grpc.Empty,
      com.cedulasservicegrpc.grpc.CedulasResponse> getObtenerCedulasMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ObtenerCedulas",
      requestType = com.cedulasservicegrpc.grpc.Empty.class,
      responseType = com.cedulasservicegrpc.grpc.CedulasResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cedulasservicegrpc.grpc.Empty,
      com.cedulasservicegrpc.grpc.CedulasResponse> getObtenerCedulasMethod() {
    io.grpc.MethodDescriptor<com.cedulasservicegrpc.grpc.Empty, com.cedulasservicegrpc.grpc.CedulasResponse> getObtenerCedulasMethod;
    if ((getObtenerCedulasMethod = cedulasServiceGrpc.getObtenerCedulasMethod) == null) {
      synchronized (cedulasServiceGrpc.class) {
        if ((getObtenerCedulasMethod = cedulasServiceGrpc.getObtenerCedulasMethod) == null) {
          cedulasServiceGrpc.getObtenerCedulasMethod = getObtenerCedulasMethod = 
              io.grpc.MethodDescriptor.<com.cedulasservicegrpc.grpc.Empty, com.cedulasservicegrpc.grpc.CedulasResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "cedulasService", "ObtenerCedulas"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cedulasservicegrpc.grpc.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cedulasservicegrpc.grpc.CedulasResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new cedulasServiceMethodDescriptorSupplier("ObtenerCedulas"))
                  .build();
          }
        }
     }
     return getObtenerCedulasMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static cedulasServiceStub newStub(io.grpc.Channel channel) {
    return new cedulasServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static cedulasServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new cedulasServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static cedulasServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new cedulasServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class cedulasServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void obtenerCedulas(com.cedulasservicegrpc.grpc.Empty request,
        io.grpc.stub.StreamObserver<com.cedulasservicegrpc.grpc.CedulasResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getObtenerCedulasMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getObtenerCedulasMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.cedulasservicegrpc.grpc.Empty,
                com.cedulasservicegrpc.grpc.CedulasResponse>(
                  this, METHODID_OBTENER_CEDULAS)))
          .build();
    }
  }

  /**
   */
  public static final class cedulasServiceStub extends io.grpc.stub.AbstractStub<cedulasServiceStub> {
    private cedulasServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private cedulasServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected cedulasServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new cedulasServiceStub(channel, callOptions);
    }

    /**
     */
    public void obtenerCedulas(com.cedulasservicegrpc.grpc.Empty request,
        io.grpc.stub.StreamObserver<com.cedulasservicegrpc.grpc.CedulasResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getObtenerCedulasMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class cedulasServiceBlockingStub extends io.grpc.stub.AbstractStub<cedulasServiceBlockingStub> {
    private cedulasServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private cedulasServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected cedulasServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new cedulasServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.cedulasservicegrpc.grpc.CedulasResponse obtenerCedulas(com.cedulasservicegrpc.grpc.Empty request) {
      return blockingUnaryCall(
          getChannel(), getObtenerCedulasMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class cedulasServiceFutureStub extends io.grpc.stub.AbstractStub<cedulasServiceFutureStub> {
    private cedulasServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private cedulasServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected cedulasServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new cedulasServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cedulasservicegrpc.grpc.CedulasResponse> obtenerCedulas(
        com.cedulasservicegrpc.grpc.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getObtenerCedulasMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_OBTENER_CEDULAS = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final cedulasServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(cedulasServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_OBTENER_CEDULAS:
          serviceImpl.obtenerCedulas((com.cedulasservicegrpc.grpc.Empty) request,
              (io.grpc.stub.StreamObserver<com.cedulasservicegrpc.grpc.CedulasResponse>) responseObserver);
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

  private static abstract class cedulasServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    cedulasServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.cedulasservicegrpc.grpc.Cedulas.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("cedulasService");
    }
  }

  private static final class cedulasServiceFileDescriptorSupplier
      extends cedulasServiceBaseDescriptorSupplier {
    cedulasServiceFileDescriptorSupplier() {}
  }

  private static final class cedulasServiceMethodDescriptorSupplier
      extends cedulasServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    cedulasServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (cedulasServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new cedulasServiceFileDescriptorSupplier())
              .addMethod(getObtenerCedulasMethod())
              .build();
        }
      }
    }
    return result;
  }
}
