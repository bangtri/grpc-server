// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: systemparam.proto

package grpc.service.param;

public final class Systemparam {
  private Systemparam() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grpc_service_param_Result_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grpc_service_param_Result_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grpc_service_param_Data_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grpc_service_param_Data_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grpc_service_param_DetailParamRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grpc_service_param_DetailParamRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grpc_service_param_DetailParamResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grpc_service_param_DetailParamResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021systemparam.proto\022\022grpc.service.param\"" +
      ")\n\006Result\022\016\n\006status\030\001 \001(\005\022\017\n\007message\030\002 \001" +
      "(\t\"\230\001\n\004Data\022\014\n\004code\030\001 \001(\t\022\r\n\005value\030\002 \001(\t" +
      "\022\014\n\004type\030\003 \001(\t\022\023\n\013description\030\004 \001(\t\022\023\n\013c" +
      "reatedDate\030\005 \001(\t\022\024\n\014modifiedDate\030\006 \001(\t\022\021" +
      "\n\tcreatedBy\030\007 \001(\t\022\022\n\nmodifiedBy\030\010 \001(\t\"\"\n" +
      "\022DetailParamRequest\022\014\n\004code\030\001 \001(\t\"i\n\023Det" +
      "ailParamResponse\022*\n\006result\030\001 \001(\0132\032.grpc." +
      "service.param.Result\022&\n\004data\030\002 \001(\0132\030.grp" +
      "c.service.param.Data2x\n\022SystemParamServi" +
      "ce\022b\n\017findParamByCode\022&.grpc.service.par" +
      "am.DetailParamRequest\032\'.grpc.service.par" +
      "am.DetailParamResponseB\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_grpc_service_param_Result_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_grpc_service_param_Result_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grpc_service_param_Result_descriptor,
        new java.lang.String[] { "Status", "Message", });
    internal_static_grpc_service_param_Data_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_grpc_service_param_Data_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grpc_service_param_Data_descriptor,
        new java.lang.String[] { "Code", "Value", "Type", "Description", "CreatedDate", "ModifiedDate", "CreatedBy", "ModifiedBy", });
    internal_static_grpc_service_param_DetailParamRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_grpc_service_param_DetailParamRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grpc_service_param_DetailParamRequest_descriptor,
        new java.lang.String[] { "Code", });
    internal_static_grpc_service_param_DetailParamResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_grpc_service_param_DetailParamResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grpc_service_param_DetailParamResponse_descriptor,
        new java.lang.String[] { "Result", "Data", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
