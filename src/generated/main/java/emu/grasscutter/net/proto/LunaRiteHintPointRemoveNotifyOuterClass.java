// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: LunaRiteHintPointRemoveNotify.proto

package emu.grasscutter.net.proto;

public final class LunaRiteHintPointRemoveNotifyOuterClass {
  private LunaRiteHintPointRemoveNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface LunaRiteHintPointRemoveNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:LunaRiteHintPointRemoveNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 hint_point_index = 14;</code>
     * @return A list containing the hintPointIndex.
     */
    java.util.List<java.lang.Integer> getHintPointIndexList();
    /**
     * <code>repeated uint32 hint_point_index = 14;</code>
     * @return The count of hintPointIndex.
     */
    int getHintPointIndexCount();
    /**
     * <code>repeated uint32 hint_point_index = 14;</code>
     * @param index The index of the element to return.
     * @return The hintPointIndex at the given index.
     */
    int getHintPointIndex(int index);
  }
  /**
   * <pre>
   * CmdId: 8968
   * Obf: HNDNEGPNBID
   * </pre>
   *
   * Protobuf type {@code LunaRiteHintPointRemoveNotify}
   */
  public static final class LunaRiteHintPointRemoveNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:LunaRiteHintPointRemoveNotify)
      LunaRiteHintPointRemoveNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use LunaRiteHintPointRemoveNotify.newBuilder() to construct.
    private LunaRiteHintPointRemoveNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private LunaRiteHintPointRemoveNotify() {
      hintPointIndex_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new LunaRiteHintPointRemoveNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private LunaRiteHintPointRemoveNotify(
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
            case 112: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                hintPointIndex_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              hintPointIndex_.addInt(input.readUInt32());
              break;
            }
            case 114: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                hintPointIndex_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                hintPointIndex_.addInt(input.readUInt32());
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
          hintPointIndex_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.LunaRiteHintPointRemoveNotifyOuterClass.internal_static_LunaRiteHintPointRemoveNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.LunaRiteHintPointRemoveNotifyOuterClass.internal_static_LunaRiteHintPointRemoveNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.LunaRiteHintPointRemoveNotifyOuterClass.LunaRiteHintPointRemoveNotify.class, emu.grasscutter.net.proto.LunaRiteHintPointRemoveNotifyOuterClass.LunaRiteHintPointRemoveNotify.Builder.class);
    }

    public static final int HINT_POINT_INDEX_FIELD_NUMBER = 14;
    private com.google.protobuf.Internal.IntList hintPointIndex_;
    /**
     * <code>repeated uint32 hint_point_index = 14;</code>
     * @return A list containing the hintPointIndex.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getHintPointIndexList() {
      return hintPointIndex_;
    }
    /**
     * <code>repeated uint32 hint_point_index = 14;</code>
     * @return The count of hintPointIndex.
     */
    public int getHintPointIndexCount() {
      return hintPointIndex_.size();
    }
    /**
     * <code>repeated uint32 hint_point_index = 14;</code>
     * @param index The index of the element to return.
     * @return The hintPointIndex at the given index.
     */
    public int getHintPointIndex(int index) {
      return hintPointIndex_.getInt(index);
    }
    private int hintPointIndexMemoizedSerializedSize = -1;

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
      if (getHintPointIndexList().size() > 0) {
        output.writeUInt32NoTag(114);
        output.writeUInt32NoTag(hintPointIndexMemoizedSerializedSize);
      }
      for (int i = 0; i < hintPointIndex_.size(); i++) {
        output.writeUInt32NoTag(hintPointIndex_.getInt(i));
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
        for (int i = 0; i < hintPointIndex_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(hintPointIndex_.getInt(i));
        }
        size += dataSize;
        if (!getHintPointIndexList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        hintPointIndexMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.proto.LunaRiteHintPointRemoveNotifyOuterClass.LunaRiteHintPointRemoveNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.LunaRiteHintPointRemoveNotifyOuterClass.LunaRiteHintPointRemoveNotify other = (emu.grasscutter.net.proto.LunaRiteHintPointRemoveNotifyOuterClass.LunaRiteHintPointRemoveNotify) obj;

      if (!getHintPointIndexList()
          .equals(other.getHintPointIndexList())) return false;
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
      if (getHintPointIndexCount() > 0) {
        hash = (37 * hash) + HINT_POINT_INDEX_FIELD_NUMBER;
        hash = (53 * hash) + getHintPointIndexList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.LunaRiteHintPointRemoveNotifyOuterClass.LunaRiteHintPointRemoveNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.LunaRiteHintPointRemoveNotifyOuterClass.LunaRiteHintPointRemoveNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LunaRiteHintPointRemoveNotifyOuterClass.LunaRiteHintPointRemoveNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.LunaRiteHintPointRemoveNotifyOuterClass.LunaRiteHintPointRemoveNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LunaRiteHintPointRemoveNotifyOuterClass.LunaRiteHintPointRemoveNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.LunaRiteHintPointRemoveNotifyOuterClass.LunaRiteHintPointRemoveNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LunaRiteHintPointRemoveNotifyOuterClass.LunaRiteHintPointRemoveNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.LunaRiteHintPointRemoveNotifyOuterClass.LunaRiteHintPointRemoveNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LunaRiteHintPointRemoveNotifyOuterClass.LunaRiteHintPointRemoveNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.LunaRiteHintPointRemoveNotifyOuterClass.LunaRiteHintPointRemoveNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LunaRiteHintPointRemoveNotifyOuterClass.LunaRiteHintPointRemoveNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.LunaRiteHintPointRemoveNotifyOuterClass.LunaRiteHintPointRemoveNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.LunaRiteHintPointRemoveNotifyOuterClass.LunaRiteHintPointRemoveNotify prototype) {
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
     * CmdId: 8968
     * Obf: HNDNEGPNBID
     * </pre>
     *
     * Protobuf type {@code LunaRiteHintPointRemoveNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:LunaRiteHintPointRemoveNotify)
        emu.grasscutter.net.proto.LunaRiteHintPointRemoveNotifyOuterClass.LunaRiteHintPointRemoveNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.LunaRiteHintPointRemoveNotifyOuterClass.internal_static_LunaRiteHintPointRemoveNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.LunaRiteHintPointRemoveNotifyOuterClass.internal_static_LunaRiteHintPointRemoveNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.LunaRiteHintPointRemoveNotifyOuterClass.LunaRiteHintPointRemoveNotify.class, emu.grasscutter.net.proto.LunaRiteHintPointRemoveNotifyOuterClass.LunaRiteHintPointRemoveNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.LunaRiteHintPointRemoveNotifyOuterClass.LunaRiteHintPointRemoveNotify.newBuilder()
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
        hintPointIndex_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.LunaRiteHintPointRemoveNotifyOuterClass.internal_static_LunaRiteHintPointRemoveNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.LunaRiteHintPointRemoveNotifyOuterClass.LunaRiteHintPointRemoveNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.LunaRiteHintPointRemoveNotifyOuterClass.LunaRiteHintPointRemoveNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.LunaRiteHintPointRemoveNotifyOuterClass.LunaRiteHintPointRemoveNotify build() {
        emu.grasscutter.net.proto.LunaRiteHintPointRemoveNotifyOuterClass.LunaRiteHintPointRemoveNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.LunaRiteHintPointRemoveNotifyOuterClass.LunaRiteHintPointRemoveNotify buildPartial() {
        emu.grasscutter.net.proto.LunaRiteHintPointRemoveNotifyOuterClass.LunaRiteHintPointRemoveNotify result = new emu.grasscutter.net.proto.LunaRiteHintPointRemoveNotifyOuterClass.LunaRiteHintPointRemoveNotify(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          hintPointIndex_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.hintPointIndex_ = hintPointIndex_;
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
        if (other instanceof emu.grasscutter.net.proto.LunaRiteHintPointRemoveNotifyOuterClass.LunaRiteHintPointRemoveNotify) {
          return mergeFrom((emu.grasscutter.net.proto.LunaRiteHintPointRemoveNotifyOuterClass.LunaRiteHintPointRemoveNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.LunaRiteHintPointRemoveNotifyOuterClass.LunaRiteHintPointRemoveNotify other) {
        if (other == emu.grasscutter.net.proto.LunaRiteHintPointRemoveNotifyOuterClass.LunaRiteHintPointRemoveNotify.getDefaultInstance()) return this;
        if (!other.hintPointIndex_.isEmpty()) {
          if (hintPointIndex_.isEmpty()) {
            hintPointIndex_ = other.hintPointIndex_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureHintPointIndexIsMutable();
            hintPointIndex_.addAll(other.hintPointIndex_);
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
        emu.grasscutter.net.proto.LunaRiteHintPointRemoveNotifyOuterClass.LunaRiteHintPointRemoveNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.LunaRiteHintPointRemoveNotifyOuterClass.LunaRiteHintPointRemoveNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.Internal.IntList hintPointIndex_ = emptyIntList();
      private void ensureHintPointIndexIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          hintPointIndex_ = mutableCopy(hintPointIndex_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 hint_point_index = 14;</code>
       * @return A list containing the hintPointIndex.
       */
      public java.util.List<java.lang.Integer>
          getHintPointIndexList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(hintPointIndex_) : hintPointIndex_;
      }
      /**
       * <code>repeated uint32 hint_point_index = 14;</code>
       * @return The count of hintPointIndex.
       */
      public int getHintPointIndexCount() {
        return hintPointIndex_.size();
      }
      /**
       * <code>repeated uint32 hint_point_index = 14;</code>
       * @param index The index of the element to return.
       * @return The hintPointIndex at the given index.
       */
      public int getHintPointIndex(int index) {
        return hintPointIndex_.getInt(index);
      }
      /**
       * <code>repeated uint32 hint_point_index = 14;</code>
       * @param index The index to set the value at.
       * @param value The hintPointIndex to set.
       * @return This builder for chaining.
       */
      public Builder setHintPointIndex(
          int index, int value) {
        ensureHintPointIndexIsMutable();
        hintPointIndex_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 hint_point_index = 14;</code>
       * @param value The hintPointIndex to add.
       * @return This builder for chaining.
       */
      public Builder addHintPointIndex(int value) {
        ensureHintPointIndexIsMutable();
        hintPointIndex_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 hint_point_index = 14;</code>
       * @param values The hintPointIndex to add.
       * @return This builder for chaining.
       */
      public Builder addAllHintPointIndex(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureHintPointIndexIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, hintPointIndex_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 hint_point_index = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearHintPointIndex() {
        hintPointIndex_ = emptyIntList();
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


      // @@protoc_insertion_point(builder_scope:LunaRiteHintPointRemoveNotify)
    }

    // @@protoc_insertion_point(class_scope:LunaRiteHintPointRemoveNotify)
    private static final emu.grasscutter.net.proto.LunaRiteHintPointRemoveNotifyOuterClass.LunaRiteHintPointRemoveNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.LunaRiteHintPointRemoveNotifyOuterClass.LunaRiteHintPointRemoveNotify();
    }

    public static emu.grasscutter.net.proto.LunaRiteHintPointRemoveNotifyOuterClass.LunaRiteHintPointRemoveNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<LunaRiteHintPointRemoveNotify>
        PARSER = new com.google.protobuf.AbstractParser<LunaRiteHintPointRemoveNotify>() {
      @java.lang.Override
      public LunaRiteHintPointRemoveNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new LunaRiteHintPointRemoveNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<LunaRiteHintPointRemoveNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<LunaRiteHintPointRemoveNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.LunaRiteHintPointRemoveNotifyOuterClass.LunaRiteHintPointRemoveNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_LunaRiteHintPointRemoveNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_LunaRiteHintPointRemoveNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#LunaRiteHintPointRemoveNotify.proto\"9\n" +
      "\035LunaRiteHintPointRemoveNotify\022\030\n\020hint_p" +
      "oint_index\030\016 \003(\rB\033\n\031emu.grasscutter.net." +
      "protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_LunaRiteHintPointRemoveNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_LunaRiteHintPointRemoveNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_LunaRiteHintPointRemoveNotify_descriptor,
        new java.lang.String[] { "HintPointIndex", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
