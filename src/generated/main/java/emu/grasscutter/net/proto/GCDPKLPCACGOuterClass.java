// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GCDPKLPCACG.proto

package emu.grasscutter.net.proto;

public final class GCDPKLPCACGOuterClass {
  private GCDPKLPCACGOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GCDPKLPCACGOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GCDPKLPCACG)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 IJIJDKGKLDL = 1;</code>
     * @return A list containing the iJIJDKGKLDL.
     */
    java.util.List<java.lang.Integer> getIJIJDKGKLDLList();
    /**
     * <code>repeated uint32 IJIJDKGKLDL = 1;</code>
     * @return The count of iJIJDKGKLDL.
     */
    int getIJIJDKGKLDLCount();
    /**
     * <code>repeated uint32 IJIJDKGKLDL = 1;</code>
     * @param index The index of the element to return.
     * @return The iJIJDKGKLDL at the given index.
     */
    int getIJIJDKGKLDL(int index);
  }
  /**
   * <pre>
   * CmdId: 21966
   * </pre>
   *
   * Protobuf type {@code GCDPKLPCACG}
   */
  public static final class GCDPKLPCACG extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GCDPKLPCACG)
      GCDPKLPCACGOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GCDPKLPCACG.newBuilder() to construct.
    private GCDPKLPCACG(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GCDPKLPCACG() {
      iJIJDKGKLDL_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GCDPKLPCACG();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GCDPKLPCACG(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
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
            case 8: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                iJIJDKGKLDL_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              iJIJDKGKLDL_.addInt(input.readUInt32());
              break;
            }
            case 10: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                iJIJDKGKLDL_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                iJIJDKGKLDL_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
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
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          iJIJDKGKLDL_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.GCDPKLPCACGOuterClass.internal_static_GCDPKLPCACG_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GCDPKLPCACGOuterClass.internal_static_GCDPKLPCACG_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GCDPKLPCACGOuterClass.GCDPKLPCACG.class, emu.grasscutter.net.proto.GCDPKLPCACGOuterClass.GCDPKLPCACG.Builder.class);
    }

    public static final int IJIJDKGKLDL_FIELD_NUMBER = 1;
    private com.google.protobuf.Internal.IntList iJIJDKGKLDL_;
    /**
     * <code>repeated uint32 IJIJDKGKLDL = 1;</code>
     * @return A list containing the iJIJDKGKLDL.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getIJIJDKGKLDLList() {
      return iJIJDKGKLDL_;
    }
    /**
     * <code>repeated uint32 IJIJDKGKLDL = 1;</code>
     * @return The count of iJIJDKGKLDL.
     */
    public int getIJIJDKGKLDLCount() {
      return iJIJDKGKLDL_.size();
    }
    /**
     * <code>repeated uint32 IJIJDKGKLDL = 1;</code>
     * @param index The index of the element to return.
     * @return The iJIJDKGKLDL at the given index.
     */
    public int getIJIJDKGKLDL(int index) {
      return iJIJDKGKLDL_.getInt(index);
    }
    private int iJIJDKGKLDLMemoizedSerializedSize = -1;

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
      getSerializedSize();
      if (getIJIJDKGKLDLList().size() > 0) {
        output.writeUInt32NoTag(10);
        output.writeUInt32NoTag(iJIJDKGKLDLMemoizedSerializedSize);
      }
      for (int i = 0; i < iJIJDKGKLDL_.size(); i++) {
        output.writeUInt32NoTag(iJIJDKGKLDL_.getInt(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      {
        int dataSize = 0;
        for (int i = 0; i < iJIJDKGKLDL_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(iJIJDKGKLDL_.getInt(i));
        }
        size += dataSize;
        if (!getIJIJDKGKLDLList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        iJIJDKGKLDLMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.proto.GCDPKLPCACGOuterClass.GCDPKLPCACG)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GCDPKLPCACGOuterClass.GCDPKLPCACG other = (emu.grasscutter.net.proto.GCDPKLPCACGOuterClass.GCDPKLPCACG) obj;

      if (!getIJIJDKGKLDLList()
          .equals(other.getIJIJDKGKLDLList())) return false;
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
      if (getIJIJDKGKLDLCount() > 0) {
        hash = (37 * hash) + IJIJDKGKLDL_FIELD_NUMBER;
        hash = (53 * hash) + getIJIJDKGKLDLList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GCDPKLPCACGOuterClass.GCDPKLPCACG parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCDPKLPCACGOuterClass.GCDPKLPCACG parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCDPKLPCACGOuterClass.GCDPKLPCACG parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCDPKLPCACGOuterClass.GCDPKLPCACG parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCDPKLPCACGOuterClass.GCDPKLPCACG parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCDPKLPCACGOuterClass.GCDPKLPCACG parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCDPKLPCACGOuterClass.GCDPKLPCACG parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCDPKLPCACGOuterClass.GCDPKLPCACG parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCDPKLPCACGOuterClass.GCDPKLPCACG parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCDPKLPCACGOuterClass.GCDPKLPCACG parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCDPKLPCACGOuterClass.GCDPKLPCACG parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCDPKLPCACGOuterClass.GCDPKLPCACG parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GCDPKLPCACGOuterClass.GCDPKLPCACG prototype) {
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
     * CmdId: 21966
     * </pre>
     *
     * Protobuf type {@code GCDPKLPCACG}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GCDPKLPCACG)
        emu.grasscutter.net.proto.GCDPKLPCACGOuterClass.GCDPKLPCACGOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GCDPKLPCACGOuterClass.internal_static_GCDPKLPCACG_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GCDPKLPCACGOuterClass.internal_static_GCDPKLPCACG_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GCDPKLPCACGOuterClass.GCDPKLPCACG.class, emu.grasscutter.net.proto.GCDPKLPCACGOuterClass.GCDPKLPCACG.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GCDPKLPCACGOuterClass.GCDPKLPCACG.newBuilder()
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
        iJIJDKGKLDL_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GCDPKLPCACGOuterClass.internal_static_GCDPKLPCACG_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCDPKLPCACGOuterClass.GCDPKLPCACG getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GCDPKLPCACGOuterClass.GCDPKLPCACG.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCDPKLPCACGOuterClass.GCDPKLPCACG build() {
        emu.grasscutter.net.proto.GCDPKLPCACGOuterClass.GCDPKLPCACG result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCDPKLPCACGOuterClass.GCDPKLPCACG buildPartial() {
        emu.grasscutter.net.proto.GCDPKLPCACGOuterClass.GCDPKLPCACG result = new emu.grasscutter.net.proto.GCDPKLPCACGOuterClass.GCDPKLPCACG(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          iJIJDKGKLDL_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.iJIJDKGKLDL_ = iJIJDKGKLDL_;
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
        if (other instanceof emu.grasscutter.net.proto.GCDPKLPCACGOuterClass.GCDPKLPCACG) {
          return mergeFrom((emu.grasscutter.net.proto.GCDPKLPCACGOuterClass.GCDPKLPCACG)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GCDPKLPCACGOuterClass.GCDPKLPCACG other) {
        if (other == emu.grasscutter.net.proto.GCDPKLPCACGOuterClass.GCDPKLPCACG.getDefaultInstance()) return this;
        if (!other.iJIJDKGKLDL_.isEmpty()) {
          if (iJIJDKGKLDL_.isEmpty()) {
            iJIJDKGKLDL_ = other.iJIJDKGKLDL_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureIJIJDKGKLDLIsMutable();
            iJIJDKGKLDL_.addAll(other.iJIJDKGKLDL_);
          }
          onChanged();
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
        emu.grasscutter.net.proto.GCDPKLPCACGOuterClass.GCDPKLPCACG parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GCDPKLPCACGOuterClass.GCDPKLPCACG) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.Internal.IntList iJIJDKGKLDL_ = emptyIntList();
      private void ensureIJIJDKGKLDLIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          iJIJDKGKLDL_ = mutableCopy(iJIJDKGKLDL_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 IJIJDKGKLDL = 1;</code>
       * @return A list containing the iJIJDKGKLDL.
       */
      public java.util.List<java.lang.Integer>
          getIJIJDKGKLDLList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(iJIJDKGKLDL_) : iJIJDKGKLDL_;
      }
      /**
       * <code>repeated uint32 IJIJDKGKLDL = 1;</code>
       * @return The count of iJIJDKGKLDL.
       */
      public int getIJIJDKGKLDLCount() {
        return iJIJDKGKLDL_.size();
      }
      /**
       * <code>repeated uint32 IJIJDKGKLDL = 1;</code>
       * @param index The index of the element to return.
       * @return The iJIJDKGKLDL at the given index.
       */
      public int getIJIJDKGKLDL(int index) {
        return iJIJDKGKLDL_.getInt(index);
      }
      /**
       * <code>repeated uint32 IJIJDKGKLDL = 1;</code>
       * @param index The index to set the value at.
       * @param value The iJIJDKGKLDL to set.
       * @return This builder for chaining.
       */
      public Builder setIJIJDKGKLDL(
          int index, int value) {
        ensureIJIJDKGKLDLIsMutable();
        iJIJDKGKLDL_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 IJIJDKGKLDL = 1;</code>
       * @param value The iJIJDKGKLDL to add.
       * @return This builder for chaining.
       */
      public Builder addIJIJDKGKLDL(int value) {
        ensureIJIJDKGKLDLIsMutable();
        iJIJDKGKLDL_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 IJIJDKGKLDL = 1;</code>
       * @param values The iJIJDKGKLDL to add.
       * @return This builder for chaining.
       */
      public Builder addAllIJIJDKGKLDL(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureIJIJDKGKLDLIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, iJIJDKGKLDL_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 IJIJDKGKLDL = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearIJIJDKGKLDL() {
        iJIJDKGKLDL_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
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


      // @@protoc_insertion_point(builder_scope:GCDPKLPCACG)
    }

    // @@protoc_insertion_point(class_scope:GCDPKLPCACG)
    private static final emu.grasscutter.net.proto.GCDPKLPCACGOuterClass.GCDPKLPCACG DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GCDPKLPCACGOuterClass.GCDPKLPCACG();
    }

    public static emu.grasscutter.net.proto.GCDPKLPCACGOuterClass.GCDPKLPCACG getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GCDPKLPCACG>
        PARSER = new com.google.protobuf.AbstractParser<GCDPKLPCACG>() {
      @java.lang.Override
      public GCDPKLPCACG parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GCDPKLPCACG(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GCDPKLPCACG> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GCDPKLPCACG> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GCDPKLPCACGOuterClass.GCDPKLPCACG getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GCDPKLPCACG_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GCDPKLPCACG_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021GCDPKLPCACG.proto\"\"\n\013GCDPKLPCACG\022\023\n\013IJ" +
      "IJDKGKLDL\030\001 \003(\rB\033\n\031emu.grasscutter.net.p" +
      "rotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GCDPKLPCACG_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GCDPKLPCACG_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GCDPKLPCACG_descriptor,
        new java.lang.String[] { "IJIJDKGKLDL", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
