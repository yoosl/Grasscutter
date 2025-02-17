// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GPMIBFPGAML.proto

package emu.grasscutter.net.proto;

public final class GPMIBFPGAMLOuterClass {
  private GPMIBFPGAMLOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code GPMIBFPGAML}
   */
  public enum GPMIBFPGAML
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>GPMIBFPGAML_DungeonCandidateAvatarTypeNone = 0;</code>
     */
    GPMIBFPGAML_DungeonCandidateAvatarTypeNone(0),
    /**
     * <code>GPMIBFPGAML_DungeonCandidateAvatarTypeFormal = 1;</code>
     */
    GPMIBFPGAML_DungeonCandidateAvatarTypeFormal(1),
    /**
     * <code>GPMIBFPGAML_DungeonCandidateAvatarTypeUgc = 2;</code>
     */
    GPMIBFPGAML_DungeonCandidateAvatarTypeUgc(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>GPMIBFPGAML_DungeonCandidateAvatarTypeNone = 0;</code>
     */
    public static final int GPMIBFPGAML_DungeonCandidateAvatarTypeNone_VALUE = 0;
    /**
     * <code>GPMIBFPGAML_DungeonCandidateAvatarTypeFormal = 1;</code>
     */
    public static final int GPMIBFPGAML_DungeonCandidateAvatarTypeFormal_VALUE = 1;
    /**
     * <code>GPMIBFPGAML_DungeonCandidateAvatarTypeUgc = 2;</code>
     */
    public static final int GPMIBFPGAML_DungeonCandidateAvatarTypeUgc_VALUE = 2;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static GPMIBFPGAML valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static GPMIBFPGAML forNumber(int value) {
      switch (value) {
        case 0: return GPMIBFPGAML_DungeonCandidateAvatarTypeNone;
        case 1: return GPMIBFPGAML_DungeonCandidateAvatarTypeFormal;
        case 2: return GPMIBFPGAML_DungeonCandidateAvatarTypeUgc;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<GPMIBFPGAML>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        GPMIBFPGAML> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<GPMIBFPGAML>() {
            public GPMIBFPGAML findValueByNumber(int number) {
              return GPMIBFPGAML.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.GPMIBFPGAMLOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final GPMIBFPGAML[] VALUES = values();

    public static GPMIBFPGAML valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private GPMIBFPGAML(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:GPMIBFPGAML)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021GPMIBFPGAML.proto*\236\001\n\013GPMIBFPGAML\022.\n*G" +
      "PMIBFPGAML_DungeonCandidateAvatarTypeNon" +
      "e\020\000\0220\n,GPMIBFPGAML_DungeonCandidateAvata" +
      "rTypeFormal\020\001\022-\n)GPMIBFPGAML_DungeonCand" +
      "idateAvatarTypeUgc\020\002B\033\n\031emu.grasscutter." +
      "net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
