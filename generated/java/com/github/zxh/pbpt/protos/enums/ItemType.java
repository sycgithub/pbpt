// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: enums/item_type.proto

package com.github.zxh.pbpt.protos.enums;

public final class ItemType {
  private ItemType() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  /**
   * Protobuf enum {@code ItemTypeEnum}
   */
  public enum ItemTypeEnum
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>EQUIPMENT = 1;</code>
     */
    EQUIPMENT(0, 1),
    /**
     * <code>MATERIAL = 2;</code>
     */
    MATERIAL(1, 2),
    ;

    /**
     * <code>EQUIPMENT = 1;</code>
     */
    public static final int EQUIPMENT_VALUE = 1;
    /**
     * <code>MATERIAL = 2;</code>
     */
    public static final int MATERIAL_VALUE = 2;


    public final int getNumber() { return value; }

    public static ItemTypeEnum valueOf(int value) {
      switch (value) {
        case 1: return EQUIPMENT;
        case 2: return MATERIAL;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ItemTypeEnum>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static com.google.protobuf.Internal.EnumLiteMap<ItemTypeEnum>
        internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ItemTypeEnum>() {
            public ItemTypeEnum findValueByNumber(int number) {
              return ItemTypeEnum.valueOf(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(index);
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.github.zxh.pbpt.protos.enums.ItemType.getDescriptor().getEnumTypes().get(0);
    }

    private static final ItemTypeEnum[] VALUES = values();

    public static ItemTypeEnum valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int index;
    private final int value;

    private ItemTypeEnum(int index, int value) {
      this.index = index;
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:ItemTypeEnum)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025enums/item_type.proto*+\n\014ItemTypeEnum\022" +
      "\r\n\tEQUIPMENT\020\001\022\014\n\010MATERIAL\020\002B\"\n com.gith" +
      "ub.zxh.pbpt.protos.enums"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
