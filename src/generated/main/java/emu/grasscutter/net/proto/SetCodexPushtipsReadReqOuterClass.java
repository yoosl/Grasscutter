// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SetCodexPushtipsReadReq.proto

package emu.grasscutter.net.proto;

public final class SetCodexPushtipsReadReqOuterClass {
  private SetCodexPushtipsReadReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SetCodexPushtipsReadReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SetCodexPushtipsReadReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 GMMHIHAOJIM = 12;</code>
     * @return The gMMHIHAOJIM.
     */
    int getGMMHIHAOJIM();

    /**
     * <code>uint32 HFJNAAGCKFJ = 15;</code>
     * @return The hFJNAAGCKFJ.
     */
    int getHFJNAAGCKFJ();
  }
  /**
   * <pre>
   * CmdId: 4205
   * Obf: PHKFECLEDJN
   * </pre>
   *
   * Protobuf type {@code SetCodexPushtipsReadReq}
   */
  public static final class SetCodexPushtipsReadReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SetCodexPushtipsReadReq)
      SetCodexPushtipsReadReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SetCodexPushtipsReadReq.newBuilder() to construct.
    private SetCodexPushtipsReadReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SetCodexPushtipsReadReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SetCodexPushtipsReadReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SetCodexPushtipsReadReq(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 96: {

              gMMHIHAOJIM_ = input.readUInt32();
              break;
            }
            case 120: {

              hFJNAAGCKFJ_ = input.readUInt32();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.SetCodexPushtipsReadReqOuterClass.internal_static_SetCodexPushtipsReadReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.SetCodexPushtipsReadReqOuterClass.internal_static_SetCodexPushtipsReadReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.SetCodexPushtipsReadReqOuterClass.SetCodexPushtipsReadReq.class, emu.grasscutter.net.proto.SetCodexPushtipsReadReqOuterClass.SetCodexPushtipsReadReq.Builder.class);
    }

    public static final int GMMHIHAOJIM_FIELD_NUMBER = 12;
    private int gMMHIHAOJIM_;
    /**
     * <code>uint32 GMMHIHAOJIM = 12;</code>
     * @return The gMMHIHAOJIM.
     */
    @java.lang.Override
    public int getGMMHIHAOJIM() {
      return gMMHIHAOJIM_;
    }

    public static final int HFJNAAGCKFJ_FIELD_NUMBER = 15;
    private int hFJNAAGCKFJ_;
    /**
     * <code>uint32 HFJNAAGCKFJ = 15;</code>
     * @return The hFJNAAGCKFJ.
     */
    @java.lang.Override
    public int getHFJNAAGCKFJ() {
      return hFJNAAGCKFJ_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (gMMHIHAOJIM_ != 0) {
        output.writeUInt32(12, gMMHIHAOJIM_);
      }
      if (hFJNAAGCKFJ_ != 0) {
        output.writeUInt32(15, hFJNAAGCKFJ_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (gMMHIHAOJIM_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, gMMHIHAOJIM_);
      }
      if (hFJNAAGCKFJ_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, hFJNAAGCKFJ_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.SetCodexPushtipsReadReqOuterClass.SetCodexPushtipsReadReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.SetCodexPushtipsReadReqOuterClass.SetCodexPushtipsReadReq other = (emu.grasscutter.net.proto.SetCodexPushtipsReadReqOuterClass.SetCodexPushtipsReadReq) obj;

      if (getGMMHIHAOJIM()
          != other.getGMMHIHAOJIM()) return false;
      if (getHFJNAAGCKFJ()
          != other.getHFJNAAGCKFJ()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + GMMHIHAOJIM_FIELD_NUMBER;
      hash = (53 * hash) + getGMMHIHAOJIM();
      hash = (37 * hash) + HFJNAAGCKFJ_FIELD_NUMBER;
      hash = (53 * hash) + getHFJNAAGCKFJ();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.SetCodexPushtipsReadReqOuterClass.SetCodexPushtipsReadReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SetCodexPushtipsReadReqOuterClass.SetCodexPushtipsReadReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SetCodexPushtipsReadReqOuterClass.SetCodexPushtipsReadReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SetCodexPushtipsReadReqOuterClass.SetCodexPushtipsReadReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SetCodexPushtipsReadReqOuterClass.SetCodexPushtipsReadReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SetCodexPushtipsReadReqOuterClass.SetCodexPushtipsReadReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SetCodexPushtipsReadReqOuterClass.SetCodexPushtipsReadReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SetCodexPushtipsReadReqOuterClass.SetCodexPushtipsReadReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SetCodexPushtipsReadReqOuterClass.SetCodexPushtipsReadReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SetCodexPushtipsReadReqOuterClass.SetCodexPushtipsReadReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SetCodexPushtipsReadReqOuterClass.SetCodexPushtipsReadReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SetCodexPushtipsReadReqOuterClass.SetCodexPushtipsReadReq parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.SetCodexPushtipsReadReqOuterClass.SetCodexPushtipsReadReq prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * CmdId: 4205
     * Obf: PHKFECLEDJN
     * </pre>
     *
     * Protobuf type {@code SetCodexPushtipsReadReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SetCodexPushtipsReadReq)
        emu.grasscutter.net.proto.SetCodexPushtipsReadReqOuterClass.SetCodexPushtipsReadReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.SetCodexPushtipsReadReqOuterClass.internal_static_SetCodexPushtipsReadReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.SetCodexPushtipsReadReqOuterClass.internal_static_SetCodexPushtipsReadReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.SetCodexPushtipsReadReqOuterClass.SetCodexPushtipsReadReq.class, emu.grasscutter.net.proto.SetCodexPushtipsReadReqOuterClass.SetCodexPushtipsReadReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.SetCodexPushtipsReadReqOuterClass.SetCodexPushtipsReadReq.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        gMMHIHAOJIM_ = 0;

        hFJNAAGCKFJ_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.SetCodexPushtipsReadReqOuterClass.internal_static_SetCodexPushtipsReadReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SetCodexPushtipsReadReqOuterClass.SetCodexPushtipsReadReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.SetCodexPushtipsReadReqOuterClass.SetCodexPushtipsReadReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SetCodexPushtipsReadReqOuterClass.SetCodexPushtipsReadReq build() {
        emu.grasscutter.net.proto.SetCodexPushtipsReadReqOuterClass.SetCodexPushtipsReadReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SetCodexPushtipsReadReqOuterClass.SetCodexPushtipsReadReq buildPartial() {
        emu.grasscutter.net.proto.SetCodexPushtipsReadReqOuterClass.SetCodexPushtipsReadReq result = new emu.grasscutter.net.proto.SetCodexPushtipsReadReqOuterClass.SetCodexPushtipsReadReq(this);
        result.gMMHIHAOJIM_ = gMMHIHAOJIM_;
        result.hFJNAAGCKFJ_ = hFJNAAGCKFJ_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.SetCodexPushtipsReadReqOuterClass.SetCodexPushtipsReadReq) {
          return mergeFrom((emu.grasscutter.net.proto.SetCodexPushtipsReadReqOuterClass.SetCodexPushtipsReadReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.SetCodexPushtipsReadReqOuterClass.SetCodexPushtipsReadReq other) {
        if (other == emu.grasscutter.net.proto.SetCodexPushtipsReadReqOuterClass.SetCodexPushtipsReadReq.getDefaultInstance()) return this;
        if (other.getGMMHIHAOJIM() != 0) {
          setGMMHIHAOJIM(other.getGMMHIHAOJIM());
        }
        if (other.getHFJNAAGCKFJ() != 0) {
          setHFJNAAGCKFJ(other.getHFJNAAGCKFJ());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.SetCodexPushtipsReadReqOuterClass.SetCodexPushtipsReadReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.SetCodexPushtipsReadReqOuterClass.SetCodexPushtipsReadReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int gMMHIHAOJIM_ ;
      /**
       * <code>uint32 GMMHIHAOJIM = 12;</code>
       * @return The gMMHIHAOJIM.
       */
      @java.lang.Override
      public int getGMMHIHAOJIM() {
        return gMMHIHAOJIM_;
      }
      /**
       * <code>uint32 GMMHIHAOJIM = 12;</code>
       * @param value The gMMHIHAOJIM to set.
       * @return This builder for chaining.
       */
      public Builder setGMMHIHAOJIM(int value) {
        
        gMMHIHAOJIM_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 GMMHIHAOJIM = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearGMMHIHAOJIM() {
        
        gMMHIHAOJIM_ = 0;
        onChanged();
        return this;
      }

      private int hFJNAAGCKFJ_ ;
      /**
       * <code>uint32 HFJNAAGCKFJ = 15;</code>
       * @return The hFJNAAGCKFJ.
       */
      @java.lang.Override
      public int getHFJNAAGCKFJ() {
        return hFJNAAGCKFJ_;
      }
      /**
       * <code>uint32 HFJNAAGCKFJ = 15;</code>
       * @param value The hFJNAAGCKFJ to set.
       * @return This builder for chaining.
       */
      public Builder setHFJNAAGCKFJ(int value) {
        
        hFJNAAGCKFJ_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 HFJNAAGCKFJ = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearHFJNAAGCKFJ() {
        
        hFJNAAGCKFJ_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:SetCodexPushtipsReadReq)
    }

    // @@protoc_insertion_point(class_scope:SetCodexPushtipsReadReq)
    private static final emu.grasscutter.net.proto.SetCodexPushtipsReadReqOuterClass.SetCodexPushtipsReadReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.SetCodexPushtipsReadReqOuterClass.SetCodexPushtipsReadReq();
    }

    public static emu.grasscutter.net.proto.SetCodexPushtipsReadReqOuterClass.SetCodexPushtipsReadReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SetCodexPushtipsReadReq>
        PARSER = new com.google.protobuf.AbstractParser<SetCodexPushtipsReadReq>() {
      @java.lang.Override
      public SetCodexPushtipsReadReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SetCodexPushtipsReadReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SetCodexPushtipsReadReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SetCodexPushtipsReadReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.SetCodexPushtipsReadReqOuterClass.SetCodexPushtipsReadReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SetCodexPushtipsReadReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SetCodexPushtipsReadReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035SetCodexPushtipsReadReq.proto\"C\n\027SetCo" +
      "dexPushtipsReadReq\022\023\n\013GMMHIHAOJIM\030\014 \001(\r\022" +
      "\023\n\013HFJNAAGCKFJ\030\017 \001(\rB\033\n\031emu.grasscutter." +
      "net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_SetCodexPushtipsReadReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SetCodexPushtipsReadReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SetCodexPushtipsReadReq_descriptor,
        new java.lang.String[] { "GMMHIHAOJIM", "HFJNAAGCKFJ", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
