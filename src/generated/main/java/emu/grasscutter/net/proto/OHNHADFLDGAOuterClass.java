// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: OHNHADFLDGA.proto

package emu.grasscutter.net.proto;

public final class OHNHADFLDGAOuterClass {
  private OHNHADFLDGAOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface OHNHADFLDGAOrBuilder extends
      // @@protoc_insertion_point(interface_extends:OHNHADFLDGA)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 DNHPIGAPEHF = 12;</code>
     * @return A list containing the dNHPIGAPEHF.
     */
    java.util.List<java.lang.Integer> getDNHPIGAPEHFList();
    /**
     * <code>repeated uint32 DNHPIGAPEHF = 12;</code>
     * @return The count of dNHPIGAPEHF.
     */
    int getDNHPIGAPEHFCount();
    /**
     * <code>repeated uint32 DNHPIGAPEHF = 12;</code>
     * @param index The index of the element to return.
     * @return The dNHPIGAPEHF at the given index.
     */
    int getDNHPIGAPEHF(int index);
  }
  /**
   * <pre>
   * CmdId: 7781
   * </pre>
   *
   * Protobuf type {@code OHNHADFLDGA}
   */
  public static final class OHNHADFLDGA extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:OHNHADFLDGA)
      OHNHADFLDGAOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use OHNHADFLDGA.newBuilder() to construct.
    private OHNHADFLDGA(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private OHNHADFLDGA() {
      dNHPIGAPEHF_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new OHNHADFLDGA();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private OHNHADFLDGA(
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
            case 96: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                dNHPIGAPEHF_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              dNHPIGAPEHF_.addInt(input.readUInt32());
              break;
            }
            case 98: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                dNHPIGAPEHF_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                dNHPIGAPEHF_.addInt(input.readUInt32());
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
          dNHPIGAPEHF_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.OHNHADFLDGAOuterClass.internal_static_OHNHADFLDGA_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.OHNHADFLDGAOuterClass.internal_static_OHNHADFLDGA_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.OHNHADFLDGAOuterClass.OHNHADFLDGA.class, emu.grasscutter.net.proto.OHNHADFLDGAOuterClass.OHNHADFLDGA.Builder.class);
    }

    public static final int DNHPIGAPEHF_FIELD_NUMBER = 12;
    private com.google.protobuf.Internal.IntList dNHPIGAPEHF_;
    /**
     * <code>repeated uint32 DNHPIGAPEHF = 12;</code>
     * @return A list containing the dNHPIGAPEHF.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getDNHPIGAPEHFList() {
      return dNHPIGAPEHF_;
    }
    /**
     * <code>repeated uint32 DNHPIGAPEHF = 12;</code>
     * @return The count of dNHPIGAPEHF.
     */
    public int getDNHPIGAPEHFCount() {
      return dNHPIGAPEHF_.size();
    }
    /**
     * <code>repeated uint32 DNHPIGAPEHF = 12;</code>
     * @param index The index of the element to return.
     * @return The dNHPIGAPEHF at the given index.
     */
    public int getDNHPIGAPEHF(int index) {
      return dNHPIGAPEHF_.getInt(index);
    }
    private int dNHPIGAPEHFMemoizedSerializedSize = -1;

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
      if (getDNHPIGAPEHFList().size() > 0) {
        output.writeUInt32NoTag(98);
        output.writeUInt32NoTag(dNHPIGAPEHFMemoizedSerializedSize);
      }
      for (int i = 0; i < dNHPIGAPEHF_.size(); i++) {
        output.writeUInt32NoTag(dNHPIGAPEHF_.getInt(i));
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
        for (int i = 0; i < dNHPIGAPEHF_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(dNHPIGAPEHF_.getInt(i));
        }
        size += dataSize;
        if (!getDNHPIGAPEHFList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        dNHPIGAPEHFMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.proto.OHNHADFLDGAOuterClass.OHNHADFLDGA)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.OHNHADFLDGAOuterClass.OHNHADFLDGA other = (emu.grasscutter.net.proto.OHNHADFLDGAOuterClass.OHNHADFLDGA) obj;

      if (!getDNHPIGAPEHFList()
          .equals(other.getDNHPIGAPEHFList())) return false;
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
      if (getDNHPIGAPEHFCount() > 0) {
        hash = (37 * hash) + DNHPIGAPEHF_FIELD_NUMBER;
        hash = (53 * hash) + getDNHPIGAPEHFList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.OHNHADFLDGAOuterClass.OHNHADFLDGA parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.OHNHADFLDGAOuterClass.OHNHADFLDGA parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.OHNHADFLDGAOuterClass.OHNHADFLDGA parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.OHNHADFLDGAOuterClass.OHNHADFLDGA parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.OHNHADFLDGAOuterClass.OHNHADFLDGA parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.OHNHADFLDGAOuterClass.OHNHADFLDGA parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.OHNHADFLDGAOuterClass.OHNHADFLDGA parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.OHNHADFLDGAOuterClass.OHNHADFLDGA parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.OHNHADFLDGAOuterClass.OHNHADFLDGA parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.OHNHADFLDGAOuterClass.OHNHADFLDGA parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.OHNHADFLDGAOuterClass.OHNHADFLDGA parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.OHNHADFLDGAOuterClass.OHNHADFLDGA parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.OHNHADFLDGAOuterClass.OHNHADFLDGA prototype) {
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
     * CmdId: 7781
     * </pre>
     *
     * Protobuf type {@code OHNHADFLDGA}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:OHNHADFLDGA)
        emu.grasscutter.net.proto.OHNHADFLDGAOuterClass.OHNHADFLDGAOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.OHNHADFLDGAOuterClass.internal_static_OHNHADFLDGA_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.OHNHADFLDGAOuterClass.internal_static_OHNHADFLDGA_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.OHNHADFLDGAOuterClass.OHNHADFLDGA.class, emu.grasscutter.net.proto.OHNHADFLDGAOuterClass.OHNHADFLDGA.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.OHNHADFLDGAOuterClass.OHNHADFLDGA.newBuilder()
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
        dNHPIGAPEHF_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.OHNHADFLDGAOuterClass.internal_static_OHNHADFLDGA_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.OHNHADFLDGAOuterClass.OHNHADFLDGA getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.OHNHADFLDGAOuterClass.OHNHADFLDGA.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.OHNHADFLDGAOuterClass.OHNHADFLDGA build() {
        emu.grasscutter.net.proto.OHNHADFLDGAOuterClass.OHNHADFLDGA result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.OHNHADFLDGAOuterClass.OHNHADFLDGA buildPartial() {
        emu.grasscutter.net.proto.OHNHADFLDGAOuterClass.OHNHADFLDGA result = new emu.grasscutter.net.proto.OHNHADFLDGAOuterClass.OHNHADFLDGA(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          dNHPIGAPEHF_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.dNHPIGAPEHF_ = dNHPIGAPEHF_;
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
        if (other instanceof emu.grasscutter.net.proto.OHNHADFLDGAOuterClass.OHNHADFLDGA) {
          return mergeFrom((emu.grasscutter.net.proto.OHNHADFLDGAOuterClass.OHNHADFLDGA)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.OHNHADFLDGAOuterClass.OHNHADFLDGA other) {
        if (other == emu.grasscutter.net.proto.OHNHADFLDGAOuterClass.OHNHADFLDGA.getDefaultInstance()) return this;
        if (!other.dNHPIGAPEHF_.isEmpty()) {
          if (dNHPIGAPEHF_.isEmpty()) {
            dNHPIGAPEHF_ = other.dNHPIGAPEHF_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureDNHPIGAPEHFIsMutable();
            dNHPIGAPEHF_.addAll(other.dNHPIGAPEHF_);
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
        emu.grasscutter.net.proto.OHNHADFLDGAOuterClass.OHNHADFLDGA parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.OHNHADFLDGAOuterClass.OHNHADFLDGA) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.Internal.IntList dNHPIGAPEHF_ = emptyIntList();
      private void ensureDNHPIGAPEHFIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          dNHPIGAPEHF_ = mutableCopy(dNHPIGAPEHF_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 DNHPIGAPEHF = 12;</code>
       * @return A list containing the dNHPIGAPEHF.
       */
      public java.util.List<java.lang.Integer>
          getDNHPIGAPEHFList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(dNHPIGAPEHF_) : dNHPIGAPEHF_;
      }
      /**
       * <code>repeated uint32 DNHPIGAPEHF = 12;</code>
       * @return The count of dNHPIGAPEHF.
       */
      public int getDNHPIGAPEHFCount() {
        return dNHPIGAPEHF_.size();
      }
      /**
       * <code>repeated uint32 DNHPIGAPEHF = 12;</code>
       * @param index The index of the element to return.
       * @return The dNHPIGAPEHF at the given index.
       */
      public int getDNHPIGAPEHF(int index) {
        return dNHPIGAPEHF_.getInt(index);
      }
      /**
       * <code>repeated uint32 DNHPIGAPEHF = 12;</code>
       * @param index The index to set the value at.
       * @param value The dNHPIGAPEHF to set.
       * @return This builder for chaining.
       */
      public Builder setDNHPIGAPEHF(
          int index, int value) {
        ensureDNHPIGAPEHFIsMutable();
        dNHPIGAPEHF_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 DNHPIGAPEHF = 12;</code>
       * @param value The dNHPIGAPEHF to add.
       * @return This builder for chaining.
       */
      public Builder addDNHPIGAPEHF(int value) {
        ensureDNHPIGAPEHFIsMutable();
        dNHPIGAPEHF_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 DNHPIGAPEHF = 12;</code>
       * @param values The dNHPIGAPEHF to add.
       * @return This builder for chaining.
       */
      public Builder addAllDNHPIGAPEHF(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureDNHPIGAPEHFIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, dNHPIGAPEHF_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 DNHPIGAPEHF = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearDNHPIGAPEHF() {
        dNHPIGAPEHF_ = emptyIntList();
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


      // @@protoc_insertion_point(builder_scope:OHNHADFLDGA)
    }

    // @@protoc_insertion_point(class_scope:OHNHADFLDGA)
    private static final emu.grasscutter.net.proto.OHNHADFLDGAOuterClass.OHNHADFLDGA DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.OHNHADFLDGAOuterClass.OHNHADFLDGA();
    }

    public static emu.grasscutter.net.proto.OHNHADFLDGAOuterClass.OHNHADFLDGA getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<OHNHADFLDGA>
        PARSER = new com.google.protobuf.AbstractParser<OHNHADFLDGA>() {
      @java.lang.Override
      public OHNHADFLDGA parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new OHNHADFLDGA(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<OHNHADFLDGA> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<OHNHADFLDGA> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.OHNHADFLDGAOuterClass.OHNHADFLDGA getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_OHNHADFLDGA_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_OHNHADFLDGA_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021OHNHADFLDGA.proto\"\"\n\013OHNHADFLDGA\022\023\n\013DN" +
      "HPIGAPEHF\030\014 \003(\rB\033\n\031emu.grasscutter.net.p" +
      "rotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_OHNHADFLDGA_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_OHNHADFLDGA_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_OHNHADFLDGA_descriptor,
        new java.lang.String[] { "DNHPIGAPEHF", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
