// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AnchorPointDataNotify.proto

package emu.grasscutter.net.proto;

public final class AnchorPointDataNotifyOuterClass {
  private AnchorPointDataNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AnchorPointDataNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AnchorPointDataNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 next_usable_time = 6;</code>
     * @return The nextUsableTime.
     */
    int getNextUsableTime();

    /**
     * <code>repeated .AnchorPointData anchor_point_list = 14;</code>
     */
    java.util.List<emu.grasscutter.net.proto.AnchorPointDataOuterClass.AnchorPointData> 
        getAnchorPointListList();
    /**
     * <code>repeated .AnchorPointData anchor_point_list = 14;</code>
     */
    emu.grasscutter.net.proto.AnchorPointDataOuterClass.AnchorPointData getAnchorPointList(int index);
    /**
     * <code>repeated .AnchorPointData anchor_point_list = 14;</code>
     */
    int getAnchorPointListCount();
    /**
     * <code>repeated .AnchorPointData anchor_point_list = 14;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.AnchorPointDataOuterClass.AnchorPointDataOrBuilder> 
        getAnchorPointListOrBuilderList();
    /**
     * <code>repeated .AnchorPointData anchor_point_list = 14;</code>
     */
    emu.grasscutter.net.proto.AnchorPointDataOuterClass.AnchorPointDataOrBuilder getAnchorPointListOrBuilder(
        int index);
  }
  /**
   * <pre>
   * CmdId: 4278
   * Obf: DJJCABFFFAL
   * </pre>
   *
   * Protobuf type {@code AnchorPointDataNotify}
   */
  public static final class AnchorPointDataNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AnchorPointDataNotify)
      AnchorPointDataNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AnchorPointDataNotify.newBuilder() to construct.
    private AnchorPointDataNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AnchorPointDataNotify() {
      anchorPointList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AnchorPointDataNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private AnchorPointDataNotify(
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
            case 48: {

              nextUsableTime_ = input.readUInt32();
              break;
            }
            case 114: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                anchorPointList_ = new java.util.ArrayList<emu.grasscutter.net.proto.AnchorPointDataOuterClass.AnchorPointData>();
                mutable_bitField0_ |= 0x00000001;
              }
              anchorPointList_.add(
                  input.readMessage(emu.grasscutter.net.proto.AnchorPointDataOuterClass.AnchorPointData.parser(), extensionRegistry));
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
          anchorPointList_ = java.util.Collections.unmodifiableList(anchorPointList_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.AnchorPointDataNotifyOuterClass.internal_static_AnchorPointDataNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.AnchorPointDataNotifyOuterClass.internal_static_AnchorPointDataNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.AnchorPointDataNotifyOuterClass.AnchorPointDataNotify.class, emu.grasscutter.net.proto.AnchorPointDataNotifyOuterClass.AnchorPointDataNotify.Builder.class);
    }

    public static final int NEXT_USABLE_TIME_FIELD_NUMBER = 6;
    private int nextUsableTime_;
    /**
     * <code>uint32 next_usable_time = 6;</code>
     * @return The nextUsableTime.
     */
    @java.lang.Override
    public int getNextUsableTime() {
      return nextUsableTime_;
    }

    public static final int ANCHOR_POINT_LIST_FIELD_NUMBER = 14;
    private java.util.List<emu.grasscutter.net.proto.AnchorPointDataOuterClass.AnchorPointData> anchorPointList_;
    /**
     * <code>repeated .AnchorPointData anchor_point_list = 14;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.AnchorPointDataOuterClass.AnchorPointData> getAnchorPointListList() {
      return anchorPointList_;
    }
    /**
     * <code>repeated .AnchorPointData anchor_point_list = 14;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.AnchorPointDataOuterClass.AnchorPointDataOrBuilder> 
        getAnchorPointListOrBuilderList() {
      return anchorPointList_;
    }
    /**
     * <code>repeated .AnchorPointData anchor_point_list = 14;</code>
     */
    @java.lang.Override
    public int getAnchorPointListCount() {
      return anchorPointList_.size();
    }
    /**
     * <code>repeated .AnchorPointData anchor_point_list = 14;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.AnchorPointDataOuterClass.AnchorPointData getAnchorPointList(int index) {
      return anchorPointList_.get(index);
    }
    /**
     * <code>repeated .AnchorPointData anchor_point_list = 14;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.AnchorPointDataOuterClass.AnchorPointDataOrBuilder getAnchorPointListOrBuilder(
        int index) {
      return anchorPointList_.get(index);
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
      if (nextUsableTime_ != 0) {
        output.writeUInt32(6, nextUsableTime_);
      }
      for (int i = 0; i < anchorPointList_.size(); i++) {
        output.writeMessage(14, anchorPointList_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (nextUsableTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, nextUsableTime_);
      }
      for (int i = 0; i < anchorPointList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(14, anchorPointList_.get(i));
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
      if (!(obj instanceof emu.grasscutter.net.proto.AnchorPointDataNotifyOuterClass.AnchorPointDataNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.AnchorPointDataNotifyOuterClass.AnchorPointDataNotify other = (emu.grasscutter.net.proto.AnchorPointDataNotifyOuterClass.AnchorPointDataNotify) obj;

      if (getNextUsableTime()
          != other.getNextUsableTime()) return false;
      if (!getAnchorPointListList()
          .equals(other.getAnchorPointListList())) return false;
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
      hash = (37 * hash) + NEXT_USABLE_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getNextUsableTime();
      if (getAnchorPointListCount() > 0) {
        hash = (37 * hash) + ANCHOR_POINT_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getAnchorPointListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.AnchorPointDataNotifyOuterClass.AnchorPointDataNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AnchorPointDataNotifyOuterClass.AnchorPointDataNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AnchorPointDataNotifyOuterClass.AnchorPointDataNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AnchorPointDataNotifyOuterClass.AnchorPointDataNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AnchorPointDataNotifyOuterClass.AnchorPointDataNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AnchorPointDataNotifyOuterClass.AnchorPointDataNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AnchorPointDataNotifyOuterClass.AnchorPointDataNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AnchorPointDataNotifyOuterClass.AnchorPointDataNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AnchorPointDataNotifyOuterClass.AnchorPointDataNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AnchorPointDataNotifyOuterClass.AnchorPointDataNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AnchorPointDataNotifyOuterClass.AnchorPointDataNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AnchorPointDataNotifyOuterClass.AnchorPointDataNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.AnchorPointDataNotifyOuterClass.AnchorPointDataNotify prototype) {
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
     * CmdId: 4278
     * Obf: DJJCABFFFAL
     * </pre>
     *
     * Protobuf type {@code AnchorPointDataNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AnchorPointDataNotify)
        emu.grasscutter.net.proto.AnchorPointDataNotifyOuterClass.AnchorPointDataNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.AnchorPointDataNotifyOuterClass.internal_static_AnchorPointDataNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.AnchorPointDataNotifyOuterClass.internal_static_AnchorPointDataNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.AnchorPointDataNotifyOuterClass.AnchorPointDataNotify.class, emu.grasscutter.net.proto.AnchorPointDataNotifyOuterClass.AnchorPointDataNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.AnchorPointDataNotifyOuterClass.AnchorPointDataNotify.newBuilder()
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
          getAnchorPointListFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        nextUsableTime_ = 0;

        if (anchorPointListBuilder_ == null) {
          anchorPointList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          anchorPointListBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.AnchorPointDataNotifyOuterClass.internal_static_AnchorPointDataNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AnchorPointDataNotifyOuterClass.AnchorPointDataNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.AnchorPointDataNotifyOuterClass.AnchorPointDataNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AnchorPointDataNotifyOuterClass.AnchorPointDataNotify build() {
        emu.grasscutter.net.proto.AnchorPointDataNotifyOuterClass.AnchorPointDataNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AnchorPointDataNotifyOuterClass.AnchorPointDataNotify buildPartial() {
        emu.grasscutter.net.proto.AnchorPointDataNotifyOuterClass.AnchorPointDataNotify result = new emu.grasscutter.net.proto.AnchorPointDataNotifyOuterClass.AnchorPointDataNotify(this);
        int from_bitField0_ = bitField0_;
        result.nextUsableTime_ = nextUsableTime_;
        if (anchorPointListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            anchorPointList_ = java.util.Collections.unmodifiableList(anchorPointList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.anchorPointList_ = anchorPointList_;
        } else {
          result.anchorPointList_ = anchorPointListBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.proto.AnchorPointDataNotifyOuterClass.AnchorPointDataNotify) {
          return mergeFrom((emu.grasscutter.net.proto.AnchorPointDataNotifyOuterClass.AnchorPointDataNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.AnchorPointDataNotifyOuterClass.AnchorPointDataNotify other) {
        if (other == emu.grasscutter.net.proto.AnchorPointDataNotifyOuterClass.AnchorPointDataNotify.getDefaultInstance()) return this;
        if (other.getNextUsableTime() != 0) {
          setNextUsableTime(other.getNextUsableTime());
        }
        if (anchorPointListBuilder_ == null) {
          if (!other.anchorPointList_.isEmpty()) {
            if (anchorPointList_.isEmpty()) {
              anchorPointList_ = other.anchorPointList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureAnchorPointListIsMutable();
              anchorPointList_.addAll(other.anchorPointList_);
            }
            onChanged();
          }
        } else {
          if (!other.anchorPointList_.isEmpty()) {
            if (anchorPointListBuilder_.isEmpty()) {
              anchorPointListBuilder_.dispose();
              anchorPointListBuilder_ = null;
              anchorPointList_ = other.anchorPointList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              anchorPointListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getAnchorPointListFieldBuilder() : null;
            } else {
              anchorPointListBuilder_.addAllMessages(other.anchorPointList_);
            }
          }
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
        emu.grasscutter.net.proto.AnchorPointDataNotifyOuterClass.AnchorPointDataNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.AnchorPointDataNotifyOuterClass.AnchorPointDataNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int nextUsableTime_ ;
      /**
       * <code>uint32 next_usable_time = 6;</code>
       * @return The nextUsableTime.
       */
      @java.lang.Override
      public int getNextUsableTime() {
        return nextUsableTime_;
      }
      /**
       * <code>uint32 next_usable_time = 6;</code>
       * @param value The nextUsableTime to set.
       * @return This builder for chaining.
       */
      public Builder setNextUsableTime(int value) {
        
        nextUsableTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 next_usable_time = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearNextUsableTime() {
        
        nextUsableTime_ = 0;
        onChanged();
        return this;
      }

      private java.util.List<emu.grasscutter.net.proto.AnchorPointDataOuterClass.AnchorPointData> anchorPointList_ =
        java.util.Collections.emptyList();
      private void ensureAnchorPointListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          anchorPointList_ = new java.util.ArrayList<emu.grasscutter.net.proto.AnchorPointDataOuterClass.AnchorPointData>(anchorPointList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.AnchorPointDataOuterClass.AnchorPointData, emu.grasscutter.net.proto.AnchorPointDataOuterClass.AnchorPointData.Builder, emu.grasscutter.net.proto.AnchorPointDataOuterClass.AnchorPointDataOrBuilder> anchorPointListBuilder_;

      /**
       * <code>repeated .AnchorPointData anchor_point_list = 14;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.AnchorPointDataOuterClass.AnchorPointData> getAnchorPointListList() {
        if (anchorPointListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(anchorPointList_);
        } else {
          return anchorPointListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .AnchorPointData anchor_point_list = 14;</code>
       */
      public int getAnchorPointListCount() {
        if (anchorPointListBuilder_ == null) {
          return anchorPointList_.size();
        } else {
          return anchorPointListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .AnchorPointData anchor_point_list = 14;</code>
       */
      public emu.grasscutter.net.proto.AnchorPointDataOuterClass.AnchorPointData getAnchorPointList(int index) {
        if (anchorPointListBuilder_ == null) {
          return anchorPointList_.get(index);
        } else {
          return anchorPointListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .AnchorPointData anchor_point_list = 14;</code>
       */
      public Builder setAnchorPointList(
          int index, emu.grasscutter.net.proto.AnchorPointDataOuterClass.AnchorPointData value) {
        if (anchorPointListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAnchorPointListIsMutable();
          anchorPointList_.set(index, value);
          onChanged();
        } else {
          anchorPointListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .AnchorPointData anchor_point_list = 14;</code>
       */
      public Builder setAnchorPointList(
          int index, emu.grasscutter.net.proto.AnchorPointDataOuterClass.AnchorPointData.Builder builderForValue) {
        if (anchorPointListBuilder_ == null) {
          ensureAnchorPointListIsMutable();
          anchorPointList_.set(index, builderForValue.build());
          onChanged();
        } else {
          anchorPointListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .AnchorPointData anchor_point_list = 14;</code>
       */
      public Builder addAnchorPointList(emu.grasscutter.net.proto.AnchorPointDataOuterClass.AnchorPointData value) {
        if (anchorPointListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAnchorPointListIsMutable();
          anchorPointList_.add(value);
          onChanged();
        } else {
          anchorPointListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .AnchorPointData anchor_point_list = 14;</code>
       */
      public Builder addAnchorPointList(
          int index, emu.grasscutter.net.proto.AnchorPointDataOuterClass.AnchorPointData value) {
        if (anchorPointListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureAnchorPointListIsMutable();
          anchorPointList_.add(index, value);
          onChanged();
        } else {
          anchorPointListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .AnchorPointData anchor_point_list = 14;</code>
       */
      public Builder addAnchorPointList(
          emu.grasscutter.net.proto.AnchorPointDataOuterClass.AnchorPointData.Builder builderForValue) {
        if (anchorPointListBuilder_ == null) {
          ensureAnchorPointListIsMutable();
          anchorPointList_.add(builderForValue.build());
          onChanged();
        } else {
          anchorPointListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .AnchorPointData anchor_point_list = 14;</code>
       */
      public Builder addAnchorPointList(
          int index, emu.grasscutter.net.proto.AnchorPointDataOuterClass.AnchorPointData.Builder builderForValue) {
        if (anchorPointListBuilder_ == null) {
          ensureAnchorPointListIsMutable();
          anchorPointList_.add(index, builderForValue.build());
          onChanged();
        } else {
          anchorPointListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .AnchorPointData anchor_point_list = 14;</code>
       */
      public Builder addAllAnchorPointList(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.AnchorPointDataOuterClass.AnchorPointData> values) {
        if (anchorPointListBuilder_ == null) {
          ensureAnchorPointListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, anchorPointList_);
          onChanged();
        } else {
          anchorPointListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .AnchorPointData anchor_point_list = 14;</code>
       */
      public Builder clearAnchorPointList() {
        if (anchorPointListBuilder_ == null) {
          anchorPointList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          anchorPointListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .AnchorPointData anchor_point_list = 14;</code>
       */
      public Builder removeAnchorPointList(int index) {
        if (anchorPointListBuilder_ == null) {
          ensureAnchorPointListIsMutable();
          anchorPointList_.remove(index);
          onChanged();
        } else {
          anchorPointListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .AnchorPointData anchor_point_list = 14;</code>
       */
      public emu.grasscutter.net.proto.AnchorPointDataOuterClass.AnchorPointData.Builder getAnchorPointListBuilder(
          int index) {
        return getAnchorPointListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .AnchorPointData anchor_point_list = 14;</code>
       */
      public emu.grasscutter.net.proto.AnchorPointDataOuterClass.AnchorPointDataOrBuilder getAnchorPointListOrBuilder(
          int index) {
        if (anchorPointListBuilder_ == null) {
          return anchorPointList_.get(index);  } else {
          return anchorPointListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .AnchorPointData anchor_point_list = 14;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.AnchorPointDataOuterClass.AnchorPointDataOrBuilder> 
           getAnchorPointListOrBuilderList() {
        if (anchorPointListBuilder_ != null) {
          return anchorPointListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(anchorPointList_);
        }
      }
      /**
       * <code>repeated .AnchorPointData anchor_point_list = 14;</code>
       */
      public emu.grasscutter.net.proto.AnchorPointDataOuterClass.AnchorPointData.Builder addAnchorPointListBuilder() {
        return getAnchorPointListFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.AnchorPointDataOuterClass.AnchorPointData.getDefaultInstance());
      }
      /**
       * <code>repeated .AnchorPointData anchor_point_list = 14;</code>
       */
      public emu.grasscutter.net.proto.AnchorPointDataOuterClass.AnchorPointData.Builder addAnchorPointListBuilder(
          int index) {
        return getAnchorPointListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.AnchorPointDataOuterClass.AnchorPointData.getDefaultInstance());
      }
      /**
       * <code>repeated .AnchorPointData anchor_point_list = 14;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.AnchorPointDataOuterClass.AnchorPointData.Builder> 
           getAnchorPointListBuilderList() {
        return getAnchorPointListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.AnchorPointDataOuterClass.AnchorPointData, emu.grasscutter.net.proto.AnchorPointDataOuterClass.AnchorPointData.Builder, emu.grasscutter.net.proto.AnchorPointDataOuterClass.AnchorPointDataOrBuilder> 
          getAnchorPointListFieldBuilder() {
        if (anchorPointListBuilder_ == null) {
          anchorPointListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.AnchorPointDataOuterClass.AnchorPointData, emu.grasscutter.net.proto.AnchorPointDataOuterClass.AnchorPointData.Builder, emu.grasscutter.net.proto.AnchorPointDataOuterClass.AnchorPointDataOrBuilder>(
                  anchorPointList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          anchorPointList_ = null;
        }
        return anchorPointListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:AnchorPointDataNotify)
    }

    // @@protoc_insertion_point(class_scope:AnchorPointDataNotify)
    private static final emu.grasscutter.net.proto.AnchorPointDataNotifyOuterClass.AnchorPointDataNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.AnchorPointDataNotifyOuterClass.AnchorPointDataNotify();
    }

    public static emu.grasscutter.net.proto.AnchorPointDataNotifyOuterClass.AnchorPointDataNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AnchorPointDataNotify>
        PARSER = new com.google.protobuf.AbstractParser<AnchorPointDataNotify>() {
      @java.lang.Override
      public AnchorPointDataNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new AnchorPointDataNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<AnchorPointDataNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AnchorPointDataNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.AnchorPointDataNotifyOuterClass.AnchorPointDataNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AnchorPointDataNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AnchorPointDataNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033AnchorPointDataNotify.proto\032\025AnchorPoi" +
      "ntData.proto\"^\n\025AnchorPointDataNotify\022\030\n" +
      "\020next_usable_time\030\006 \001(\r\022+\n\021anchor_point_" +
      "list\030\016 \003(\0132\020.AnchorPointDataB\033\n\031emu.gras" +
      "scutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.AnchorPointDataOuterClass.getDescriptor(),
        });
    internal_static_AnchorPointDataNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AnchorPointDataNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AnchorPointDataNotify_descriptor,
        new java.lang.String[] { "NextUsableTime", "AnchorPointList", });
    emu.grasscutter.net.proto.AnchorPointDataOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
