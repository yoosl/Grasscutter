// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IrodoriFillPoetryRsp.proto

package emu.grasscutter.net.proto;

public final class IrodoriFillPoetryRspOuterClass {
  private IrodoriFillPoetryRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface IrodoriFillPoetryRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:IrodoriFillPoetryRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 14;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>.IrodoriPoetryThemeData theme_data = 8;</code>
     * @return Whether the themeData field is set.
     */
    boolean hasThemeData();
    /**
     * <code>.IrodoriPoetryThemeData theme_data = 8;</code>
     * @return The themeData.
     */
    emu.grasscutter.net.proto.IrodoriPoetryThemeDataOuterClass.IrodoriPoetryThemeData getThemeData();
    /**
     * <code>.IrodoriPoetryThemeData theme_data = 8;</code>
     */
    emu.grasscutter.net.proto.IrodoriPoetryThemeDataOuterClass.IrodoriPoetryThemeDataOrBuilder getThemeDataOrBuilder();
  }
  /**
   * <pre>
   * CmdId: 8240
   * Obf: HJMIABNAPAF
   * </pre>
   *
   * Protobuf type {@code IrodoriFillPoetryRsp}
   */
  public static final class IrodoriFillPoetryRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:IrodoriFillPoetryRsp)
      IrodoriFillPoetryRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use IrodoriFillPoetryRsp.newBuilder() to construct.
    private IrodoriFillPoetryRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private IrodoriFillPoetryRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new IrodoriFillPoetryRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private IrodoriFillPoetryRsp(
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
            case 66: {
              emu.grasscutter.net.proto.IrodoriPoetryThemeDataOuterClass.IrodoriPoetryThemeData.Builder subBuilder = null;
              if (themeData_ != null) {
                subBuilder = themeData_.toBuilder();
              }
              themeData_ = input.readMessage(emu.grasscutter.net.proto.IrodoriPoetryThemeDataOuterClass.IrodoriPoetryThemeData.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(themeData_);
                themeData_ = subBuilder.buildPartial();
              }

              break;
            }
            case 112: {

              retcode_ = input.readInt32();
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
      return emu.grasscutter.net.proto.IrodoriFillPoetryRspOuterClass.internal_static_IrodoriFillPoetryRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.IrodoriFillPoetryRspOuterClass.internal_static_IrodoriFillPoetryRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.IrodoriFillPoetryRspOuterClass.IrodoriFillPoetryRsp.class, emu.grasscutter.net.proto.IrodoriFillPoetryRspOuterClass.IrodoriFillPoetryRsp.Builder.class);
    }

    public static final int RETCODE_FIELD_NUMBER = 14;
    private int retcode_;
    /**
     * <code>int32 retcode = 14;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int THEME_DATA_FIELD_NUMBER = 8;
    private emu.grasscutter.net.proto.IrodoriPoetryThemeDataOuterClass.IrodoriPoetryThemeData themeData_;
    /**
     * <code>.IrodoriPoetryThemeData theme_data = 8;</code>
     * @return Whether the themeData field is set.
     */
    @java.lang.Override
    public boolean hasThemeData() {
      return themeData_ != null;
    }
    /**
     * <code>.IrodoriPoetryThemeData theme_data = 8;</code>
     * @return The themeData.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.IrodoriPoetryThemeDataOuterClass.IrodoriPoetryThemeData getThemeData() {
      return themeData_ == null ? emu.grasscutter.net.proto.IrodoriPoetryThemeDataOuterClass.IrodoriPoetryThemeData.getDefaultInstance() : themeData_;
    }
    /**
     * <code>.IrodoriPoetryThemeData theme_data = 8;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.IrodoriPoetryThemeDataOuterClass.IrodoriPoetryThemeDataOrBuilder getThemeDataOrBuilder() {
      return getThemeData();
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
      if (themeData_ != null) {
        output.writeMessage(8, getThemeData());
      }
      if (retcode_ != 0) {
        output.writeInt32(14, retcode_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (themeData_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(8, getThemeData());
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(14, retcode_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.IrodoriFillPoetryRspOuterClass.IrodoriFillPoetryRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.IrodoriFillPoetryRspOuterClass.IrodoriFillPoetryRsp other = (emu.grasscutter.net.proto.IrodoriFillPoetryRspOuterClass.IrodoriFillPoetryRsp) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
      if (hasThemeData() != other.hasThemeData()) return false;
      if (hasThemeData()) {
        if (!getThemeData()
            .equals(other.getThemeData())) return false;
      }
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
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      if (hasThemeData()) {
        hash = (37 * hash) + THEME_DATA_FIELD_NUMBER;
        hash = (53 * hash) + getThemeData().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.IrodoriFillPoetryRspOuterClass.IrodoriFillPoetryRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.IrodoriFillPoetryRspOuterClass.IrodoriFillPoetryRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.IrodoriFillPoetryRspOuterClass.IrodoriFillPoetryRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.IrodoriFillPoetryRspOuterClass.IrodoriFillPoetryRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.IrodoriFillPoetryRspOuterClass.IrodoriFillPoetryRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.IrodoriFillPoetryRspOuterClass.IrodoriFillPoetryRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.IrodoriFillPoetryRspOuterClass.IrodoriFillPoetryRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.IrodoriFillPoetryRspOuterClass.IrodoriFillPoetryRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.IrodoriFillPoetryRspOuterClass.IrodoriFillPoetryRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.IrodoriFillPoetryRspOuterClass.IrodoriFillPoetryRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.IrodoriFillPoetryRspOuterClass.IrodoriFillPoetryRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.IrodoriFillPoetryRspOuterClass.IrodoriFillPoetryRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.IrodoriFillPoetryRspOuterClass.IrodoriFillPoetryRsp prototype) {
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
     * CmdId: 8240
     * Obf: HJMIABNAPAF
     * </pre>
     *
     * Protobuf type {@code IrodoriFillPoetryRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:IrodoriFillPoetryRsp)
        emu.grasscutter.net.proto.IrodoriFillPoetryRspOuterClass.IrodoriFillPoetryRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.IrodoriFillPoetryRspOuterClass.internal_static_IrodoriFillPoetryRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.IrodoriFillPoetryRspOuterClass.internal_static_IrodoriFillPoetryRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.IrodoriFillPoetryRspOuterClass.IrodoriFillPoetryRsp.class, emu.grasscutter.net.proto.IrodoriFillPoetryRspOuterClass.IrodoriFillPoetryRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.IrodoriFillPoetryRspOuterClass.IrodoriFillPoetryRsp.newBuilder()
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
        retcode_ = 0;

        if (themeDataBuilder_ == null) {
          themeData_ = null;
        } else {
          themeData_ = null;
          themeDataBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.IrodoriFillPoetryRspOuterClass.internal_static_IrodoriFillPoetryRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.IrodoriFillPoetryRspOuterClass.IrodoriFillPoetryRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.IrodoriFillPoetryRspOuterClass.IrodoriFillPoetryRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.IrodoriFillPoetryRspOuterClass.IrodoriFillPoetryRsp build() {
        emu.grasscutter.net.proto.IrodoriFillPoetryRspOuterClass.IrodoriFillPoetryRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.IrodoriFillPoetryRspOuterClass.IrodoriFillPoetryRsp buildPartial() {
        emu.grasscutter.net.proto.IrodoriFillPoetryRspOuterClass.IrodoriFillPoetryRsp result = new emu.grasscutter.net.proto.IrodoriFillPoetryRspOuterClass.IrodoriFillPoetryRsp(this);
        result.retcode_ = retcode_;
        if (themeDataBuilder_ == null) {
          result.themeData_ = themeData_;
        } else {
          result.themeData_ = themeDataBuilder_.build();
        }
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
        if (other instanceof emu.grasscutter.net.proto.IrodoriFillPoetryRspOuterClass.IrodoriFillPoetryRsp) {
          return mergeFrom((emu.grasscutter.net.proto.IrodoriFillPoetryRspOuterClass.IrodoriFillPoetryRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.IrodoriFillPoetryRspOuterClass.IrodoriFillPoetryRsp other) {
        if (other == emu.grasscutter.net.proto.IrodoriFillPoetryRspOuterClass.IrodoriFillPoetryRsp.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.hasThemeData()) {
          mergeThemeData(other.getThemeData());
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
        emu.grasscutter.net.proto.IrodoriFillPoetryRspOuterClass.IrodoriFillPoetryRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.IrodoriFillPoetryRspOuterClass.IrodoriFillPoetryRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 14;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 14;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private emu.grasscutter.net.proto.IrodoriPoetryThemeDataOuterClass.IrodoriPoetryThemeData themeData_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.IrodoriPoetryThemeDataOuterClass.IrodoriPoetryThemeData, emu.grasscutter.net.proto.IrodoriPoetryThemeDataOuterClass.IrodoriPoetryThemeData.Builder, emu.grasscutter.net.proto.IrodoriPoetryThemeDataOuterClass.IrodoriPoetryThemeDataOrBuilder> themeDataBuilder_;
      /**
       * <code>.IrodoriPoetryThemeData theme_data = 8;</code>
       * @return Whether the themeData field is set.
       */
      public boolean hasThemeData() {
        return themeDataBuilder_ != null || themeData_ != null;
      }
      /**
       * <code>.IrodoriPoetryThemeData theme_data = 8;</code>
       * @return The themeData.
       */
      public emu.grasscutter.net.proto.IrodoriPoetryThemeDataOuterClass.IrodoriPoetryThemeData getThemeData() {
        if (themeDataBuilder_ == null) {
          return themeData_ == null ? emu.grasscutter.net.proto.IrodoriPoetryThemeDataOuterClass.IrodoriPoetryThemeData.getDefaultInstance() : themeData_;
        } else {
          return themeDataBuilder_.getMessage();
        }
      }
      /**
       * <code>.IrodoriPoetryThemeData theme_data = 8;</code>
       */
      public Builder setThemeData(emu.grasscutter.net.proto.IrodoriPoetryThemeDataOuterClass.IrodoriPoetryThemeData value) {
        if (themeDataBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          themeData_ = value;
          onChanged();
        } else {
          themeDataBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.IrodoriPoetryThemeData theme_data = 8;</code>
       */
      public Builder setThemeData(
          emu.grasscutter.net.proto.IrodoriPoetryThemeDataOuterClass.IrodoriPoetryThemeData.Builder builderForValue) {
        if (themeDataBuilder_ == null) {
          themeData_ = builderForValue.build();
          onChanged();
        } else {
          themeDataBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.IrodoriPoetryThemeData theme_data = 8;</code>
       */
      public Builder mergeThemeData(emu.grasscutter.net.proto.IrodoriPoetryThemeDataOuterClass.IrodoriPoetryThemeData value) {
        if (themeDataBuilder_ == null) {
          if (themeData_ != null) {
            themeData_ =
              emu.grasscutter.net.proto.IrodoriPoetryThemeDataOuterClass.IrodoriPoetryThemeData.newBuilder(themeData_).mergeFrom(value).buildPartial();
          } else {
            themeData_ = value;
          }
          onChanged();
        } else {
          themeDataBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.IrodoriPoetryThemeData theme_data = 8;</code>
       */
      public Builder clearThemeData() {
        if (themeDataBuilder_ == null) {
          themeData_ = null;
          onChanged();
        } else {
          themeData_ = null;
          themeDataBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.IrodoriPoetryThemeData theme_data = 8;</code>
       */
      public emu.grasscutter.net.proto.IrodoriPoetryThemeDataOuterClass.IrodoriPoetryThemeData.Builder getThemeDataBuilder() {
        
        onChanged();
        return getThemeDataFieldBuilder().getBuilder();
      }
      /**
       * <code>.IrodoriPoetryThemeData theme_data = 8;</code>
       */
      public emu.grasscutter.net.proto.IrodoriPoetryThemeDataOuterClass.IrodoriPoetryThemeDataOrBuilder getThemeDataOrBuilder() {
        if (themeDataBuilder_ != null) {
          return themeDataBuilder_.getMessageOrBuilder();
        } else {
          return themeData_ == null ?
              emu.grasscutter.net.proto.IrodoriPoetryThemeDataOuterClass.IrodoriPoetryThemeData.getDefaultInstance() : themeData_;
        }
      }
      /**
       * <code>.IrodoriPoetryThemeData theme_data = 8;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.IrodoriPoetryThemeDataOuterClass.IrodoriPoetryThemeData, emu.grasscutter.net.proto.IrodoriPoetryThemeDataOuterClass.IrodoriPoetryThemeData.Builder, emu.grasscutter.net.proto.IrodoriPoetryThemeDataOuterClass.IrodoriPoetryThemeDataOrBuilder> 
          getThemeDataFieldBuilder() {
        if (themeDataBuilder_ == null) {
          themeDataBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.IrodoriPoetryThemeDataOuterClass.IrodoriPoetryThemeData, emu.grasscutter.net.proto.IrodoriPoetryThemeDataOuterClass.IrodoriPoetryThemeData.Builder, emu.grasscutter.net.proto.IrodoriPoetryThemeDataOuterClass.IrodoriPoetryThemeDataOrBuilder>(
                  getThemeData(),
                  getParentForChildren(),
                  isClean());
          themeData_ = null;
        }
        return themeDataBuilder_;
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


      // @@protoc_insertion_point(builder_scope:IrodoriFillPoetryRsp)
    }

    // @@protoc_insertion_point(class_scope:IrodoriFillPoetryRsp)
    private static final emu.grasscutter.net.proto.IrodoriFillPoetryRspOuterClass.IrodoriFillPoetryRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.IrodoriFillPoetryRspOuterClass.IrodoriFillPoetryRsp();
    }

    public static emu.grasscutter.net.proto.IrodoriFillPoetryRspOuterClass.IrodoriFillPoetryRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<IrodoriFillPoetryRsp>
        PARSER = new com.google.protobuf.AbstractParser<IrodoriFillPoetryRsp>() {
      @java.lang.Override
      public IrodoriFillPoetryRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new IrodoriFillPoetryRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<IrodoriFillPoetryRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<IrodoriFillPoetryRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.IrodoriFillPoetryRspOuterClass.IrodoriFillPoetryRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_IrodoriFillPoetryRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_IrodoriFillPoetryRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032IrodoriFillPoetryRsp.proto\032\034IrodoriPoe" +
      "tryThemeData.proto\"T\n\024IrodoriFillPoetryR" +
      "sp\022\017\n\007retcode\030\016 \001(\005\022+\n\ntheme_data\030\010 \001(\0132" +
      "\027.IrodoriPoetryThemeDataB\033\n\031emu.grasscut" +
      "ter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.IrodoriPoetryThemeDataOuterClass.getDescriptor(),
        });
    internal_static_IrodoriFillPoetryRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_IrodoriFillPoetryRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_IrodoriFillPoetryRsp_descriptor,
        new java.lang.String[] { "Retcode", "ThemeData", });
    emu.grasscutter.net.proto.IrodoriPoetryThemeDataOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
