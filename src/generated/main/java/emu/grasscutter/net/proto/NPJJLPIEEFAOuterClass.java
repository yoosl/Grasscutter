// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: NPJJLPIEEFA.proto

package emu.grasscutter.net.proto;

public final class NPJJLPIEEFAOuterClass {
  private NPJJLPIEEFAOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface NPJJLPIEEFAOrBuilder extends
      // @@protoc_insertion_point(interface_extends:NPJJLPIEEFA)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 JDJGOINCHOM = 10;</code>
     * @return A list containing the jDJGOINCHOM.
     */
    java.util.List<java.lang.Integer> getJDJGOINCHOMList();
    /**
     * <code>repeated uint32 JDJGOINCHOM = 10;</code>
     * @return The count of jDJGOINCHOM.
     */
    int getJDJGOINCHOMCount();
    /**
     * <code>repeated uint32 JDJGOINCHOM = 10;</code>
     * @param index The index of the element to return.
     * @return The jDJGOINCHOM at the given index.
     */
    int getJDJGOINCHOM(int index);
  }
  /**
   * <pre>
   * CmdId: 1587
   * </pre>
   *
   * Protobuf type {@code NPJJLPIEEFA}
   */
  public static final class NPJJLPIEEFA extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:NPJJLPIEEFA)
      NPJJLPIEEFAOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use NPJJLPIEEFA.newBuilder() to construct.
    private NPJJLPIEEFA(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private NPJJLPIEEFA() {
      jDJGOINCHOM_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new NPJJLPIEEFA();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private NPJJLPIEEFA(
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
            case 80: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                jDJGOINCHOM_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              jDJGOINCHOM_.addInt(input.readUInt32());
              break;
            }
            case 82: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                jDJGOINCHOM_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                jDJGOINCHOM_.addInt(input.readUInt32());
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
          jDJGOINCHOM_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.NPJJLPIEEFAOuterClass.internal_static_NPJJLPIEEFA_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.NPJJLPIEEFAOuterClass.internal_static_NPJJLPIEEFA_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.NPJJLPIEEFAOuterClass.NPJJLPIEEFA.class, emu.grasscutter.net.proto.NPJJLPIEEFAOuterClass.NPJJLPIEEFA.Builder.class);
    }

    public static final int JDJGOINCHOM_FIELD_NUMBER = 10;
    private com.google.protobuf.Internal.IntList jDJGOINCHOM_;
    /**
     * <code>repeated uint32 JDJGOINCHOM = 10;</code>
     * @return A list containing the jDJGOINCHOM.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getJDJGOINCHOMList() {
      return jDJGOINCHOM_;
    }
    /**
     * <code>repeated uint32 JDJGOINCHOM = 10;</code>
     * @return The count of jDJGOINCHOM.
     */
    public int getJDJGOINCHOMCount() {
      return jDJGOINCHOM_.size();
    }
    /**
     * <code>repeated uint32 JDJGOINCHOM = 10;</code>
     * @param index The index of the element to return.
     * @return The jDJGOINCHOM at the given index.
     */
    public int getJDJGOINCHOM(int index) {
      return jDJGOINCHOM_.getInt(index);
    }
    private int jDJGOINCHOMMemoizedSerializedSize = -1;

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
      if (getJDJGOINCHOMList().size() > 0) {
        output.writeUInt32NoTag(82);
        output.writeUInt32NoTag(jDJGOINCHOMMemoizedSerializedSize);
      }
      for (int i = 0; i < jDJGOINCHOM_.size(); i++) {
        output.writeUInt32NoTag(jDJGOINCHOM_.getInt(i));
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
        for (int i = 0; i < jDJGOINCHOM_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(jDJGOINCHOM_.getInt(i));
        }
        size += dataSize;
        if (!getJDJGOINCHOMList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        jDJGOINCHOMMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.proto.NPJJLPIEEFAOuterClass.NPJJLPIEEFA)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.NPJJLPIEEFAOuterClass.NPJJLPIEEFA other = (emu.grasscutter.net.proto.NPJJLPIEEFAOuterClass.NPJJLPIEEFA) obj;

      if (!getJDJGOINCHOMList()
          .equals(other.getJDJGOINCHOMList())) return false;
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
      if (getJDJGOINCHOMCount() > 0) {
        hash = (37 * hash) + JDJGOINCHOM_FIELD_NUMBER;
        hash = (53 * hash) + getJDJGOINCHOMList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.NPJJLPIEEFAOuterClass.NPJJLPIEEFA parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.NPJJLPIEEFAOuterClass.NPJJLPIEEFA parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.NPJJLPIEEFAOuterClass.NPJJLPIEEFA parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.NPJJLPIEEFAOuterClass.NPJJLPIEEFA parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.NPJJLPIEEFAOuterClass.NPJJLPIEEFA parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.NPJJLPIEEFAOuterClass.NPJJLPIEEFA parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.NPJJLPIEEFAOuterClass.NPJJLPIEEFA parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.NPJJLPIEEFAOuterClass.NPJJLPIEEFA parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.NPJJLPIEEFAOuterClass.NPJJLPIEEFA parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.NPJJLPIEEFAOuterClass.NPJJLPIEEFA parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.NPJJLPIEEFAOuterClass.NPJJLPIEEFA parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.NPJJLPIEEFAOuterClass.NPJJLPIEEFA parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.NPJJLPIEEFAOuterClass.NPJJLPIEEFA prototype) {
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
     * CmdId: 1587
     * </pre>
     *
     * Protobuf type {@code NPJJLPIEEFA}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:NPJJLPIEEFA)
        emu.grasscutter.net.proto.NPJJLPIEEFAOuterClass.NPJJLPIEEFAOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.NPJJLPIEEFAOuterClass.internal_static_NPJJLPIEEFA_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.NPJJLPIEEFAOuterClass.internal_static_NPJJLPIEEFA_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.NPJJLPIEEFAOuterClass.NPJJLPIEEFA.class, emu.grasscutter.net.proto.NPJJLPIEEFAOuterClass.NPJJLPIEEFA.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.NPJJLPIEEFAOuterClass.NPJJLPIEEFA.newBuilder()
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
        jDJGOINCHOM_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.NPJJLPIEEFAOuterClass.internal_static_NPJJLPIEEFA_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.NPJJLPIEEFAOuterClass.NPJJLPIEEFA getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.NPJJLPIEEFAOuterClass.NPJJLPIEEFA.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.NPJJLPIEEFAOuterClass.NPJJLPIEEFA build() {
        emu.grasscutter.net.proto.NPJJLPIEEFAOuterClass.NPJJLPIEEFA result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.NPJJLPIEEFAOuterClass.NPJJLPIEEFA buildPartial() {
        emu.grasscutter.net.proto.NPJJLPIEEFAOuterClass.NPJJLPIEEFA result = new emu.grasscutter.net.proto.NPJJLPIEEFAOuterClass.NPJJLPIEEFA(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          jDJGOINCHOM_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.jDJGOINCHOM_ = jDJGOINCHOM_;
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
        if (other instanceof emu.grasscutter.net.proto.NPJJLPIEEFAOuterClass.NPJJLPIEEFA) {
          return mergeFrom((emu.grasscutter.net.proto.NPJJLPIEEFAOuterClass.NPJJLPIEEFA)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.NPJJLPIEEFAOuterClass.NPJJLPIEEFA other) {
        if (other == emu.grasscutter.net.proto.NPJJLPIEEFAOuterClass.NPJJLPIEEFA.getDefaultInstance()) return this;
        if (!other.jDJGOINCHOM_.isEmpty()) {
          if (jDJGOINCHOM_.isEmpty()) {
            jDJGOINCHOM_ = other.jDJGOINCHOM_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureJDJGOINCHOMIsMutable();
            jDJGOINCHOM_.addAll(other.jDJGOINCHOM_);
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
        emu.grasscutter.net.proto.NPJJLPIEEFAOuterClass.NPJJLPIEEFA parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.NPJJLPIEEFAOuterClass.NPJJLPIEEFA) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.Internal.IntList jDJGOINCHOM_ = emptyIntList();
      private void ensureJDJGOINCHOMIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          jDJGOINCHOM_ = mutableCopy(jDJGOINCHOM_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 JDJGOINCHOM = 10;</code>
       * @return A list containing the jDJGOINCHOM.
       */
      public java.util.List<java.lang.Integer>
          getJDJGOINCHOMList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(jDJGOINCHOM_) : jDJGOINCHOM_;
      }
      /**
       * <code>repeated uint32 JDJGOINCHOM = 10;</code>
       * @return The count of jDJGOINCHOM.
       */
      public int getJDJGOINCHOMCount() {
        return jDJGOINCHOM_.size();
      }
      /**
       * <code>repeated uint32 JDJGOINCHOM = 10;</code>
       * @param index The index of the element to return.
       * @return The jDJGOINCHOM at the given index.
       */
      public int getJDJGOINCHOM(int index) {
        return jDJGOINCHOM_.getInt(index);
      }
      /**
       * <code>repeated uint32 JDJGOINCHOM = 10;</code>
       * @param index The index to set the value at.
       * @param value The jDJGOINCHOM to set.
       * @return This builder for chaining.
       */
      public Builder setJDJGOINCHOM(
          int index, int value) {
        ensureJDJGOINCHOMIsMutable();
        jDJGOINCHOM_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 JDJGOINCHOM = 10;</code>
       * @param value The jDJGOINCHOM to add.
       * @return This builder for chaining.
       */
      public Builder addJDJGOINCHOM(int value) {
        ensureJDJGOINCHOMIsMutable();
        jDJGOINCHOM_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 JDJGOINCHOM = 10;</code>
       * @param values The jDJGOINCHOM to add.
       * @return This builder for chaining.
       */
      public Builder addAllJDJGOINCHOM(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureJDJGOINCHOMIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, jDJGOINCHOM_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 JDJGOINCHOM = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearJDJGOINCHOM() {
        jDJGOINCHOM_ = emptyIntList();
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


      // @@protoc_insertion_point(builder_scope:NPJJLPIEEFA)
    }

    // @@protoc_insertion_point(class_scope:NPJJLPIEEFA)
    private static final emu.grasscutter.net.proto.NPJJLPIEEFAOuterClass.NPJJLPIEEFA DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.NPJJLPIEEFAOuterClass.NPJJLPIEEFA();
    }

    public static emu.grasscutter.net.proto.NPJJLPIEEFAOuterClass.NPJJLPIEEFA getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<NPJJLPIEEFA>
        PARSER = new com.google.protobuf.AbstractParser<NPJJLPIEEFA>() {
      @java.lang.Override
      public NPJJLPIEEFA parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new NPJJLPIEEFA(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<NPJJLPIEEFA> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<NPJJLPIEEFA> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.NPJJLPIEEFAOuterClass.NPJJLPIEEFA getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_NPJJLPIEEFA_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_NPJJLPIEEFA_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021NPJJLPIEEFA.proto\"\"\n\013NPJJLPIEEFA\022\023\n\013JD" +
      "JGOINCHOM\030\n \003(\rB\033\n\031emu.grasscutter.net.p" +
      "rotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_NPJJLPIEEFA_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_NPJJLPIEEFA_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_NPJJLPIEEFA_descriptor,
        new java.lang.String[] { "JDJGOINCHOM", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
