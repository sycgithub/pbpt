// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: dto/player.proto

package com.github.zxh.pbpt.protos.dto;

public final class Player {
  private Player() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface PlayerDtoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PlayerDto)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required uint32 id = 1;</code>
     */
    boolean hasId();
    /**
     * <code>required uint32 id = 1;</code>
     */
    int getId();

    /**
     * <code>required uint32 exp = 2;</code>
     */
    boolean hasExp();
    /**
     * <code>required uint32 exp = 2;</code>
     */
    int getExp();

    /**
     * <code>required uint32 level = 3;</code>
     */
    boolean hasLevel();
    /**
     * <code>required uint32 level = 3;</code>
     */
    int getLevel();

    /**
     * <code>required string name = 4;</code>
     */
    boolean hasName();
    /**
     * <code>required string name = 4;</code>
     */
    java.lang.String getName();
    /**
     * <code>required string name = 4;</code>
     */
    com.google.protobuf.ByteString
        getNameBytes();
  }
  /**
   * Protobuf type {@code PlayerDto}
   */
  public static final class PlayerDto extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:PlayerDto)
      PlayerDtoOrBuilder {
    // Use PlayerDto.newBuilder() to construct.
    private PlayerDto(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private PlayerDto(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final PlayerDto defaultInstance;
    public static PlayerDto getDefaultInstance() {
      return defaultInstance;
    }

    public PlayerDto getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private PlayerDto(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
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
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              id_ = input.readUInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              exp_ = input.readUInt32();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              level_ = input.readUInt32();
              break;
            }
            case 34: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000008;
              name_ = bs;
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.github.zxh.pbpt.protos.dto.Player.internal_static_PlayerDto_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.github.zxh.pbpt.protos.dto.Player.internal_static_PlayerDto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.github.zxh.pbpt.protos.dto.Player.PlayerDto.class, com.github.zxh.pbpt.protos.dto.Player.PlayerDto.Builder.class);
    }

    public static com.google.protobuf.Parser<PlayerDto> PARSER =
        new com.google.protobuf.AbstractParser<PlayerDto>() {
      public PlayerDto parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PlayerDto(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<PlayerDto> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int ID_FIELD_NUMBER = 1;
    private int id_;
    /**
     * <code>required uint32 id = 1;</code>
     */
    public boolean hasId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required uint32 id = 1;</code>
     */
    public int getId() {
      return id_;
    }

    public static final int EXP_FIELD_NUMBER = 2;
    private int exp_;
    /**
     * <code>required uint32 exp = 2;</code>
     */
    public boolean hasExp() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required uint32 exp = 2;</code>
     */
    public int getExp() {
      return exp_;
    }

    public static final int LEVEL_FIELD_NUMBER = 3;
    private int level_;
    /**
     * <code>required uint32 level = 3;</code>
     */
    public boolean hasLevel() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>required uint32 level = 3;</code>
     */
    public int getLevel() {
      return level_;
    }

    public static final int NAME_FIELD_NUMBER = 4;
    private java.lang.Object name_;
    /**
     * <code>required string name = 4;</code>
     */
    public boolean hasName() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>required string name = 4;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          name_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string name = 4;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private void initFields() {
      id_ = 0;
      exp_ = 0;
      level_ = 0;
      name_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasExp()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasLevel()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasName()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeUInt32(1, id_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeUInt32(2, exp_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeUInt32(3, level_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeBytes(4, getNameBytes());
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, id_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, exp_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, level_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(4, getNameBytes());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static com.github.zxh.pbpt.protos.dto.Player.PlayerDto parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.github.zxh.pbpt.protos.dto.Player.PlayerDto parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.github.zxh.pbpt.protos.dto.Player.PlayerDto parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.github.zxh.pbpt.protos.dto.Player.PlayerDto parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.github.zxh.pbpt.protos.dto.Player.PlayerDto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.github.zxh.pbpt.protos.dto.Player.PlayerDto parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.github.zxh.pbpt.protos.dto.Player.PlayerDto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.github.zxh.pbpt.protos.dto.Player.PlayerDto parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.github.zxh.pbpt.protos.dto.Player.PlayerDto parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.github.zxh.pbpt.protos.dto.Player.PlayerDto parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.github.zxh.pbpt.protos.dto.Player.PlayerDto prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code PlayerDto}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PlayerDto)
        com.github.zxh.pbpt.protos.dto.Player.PlayerDtoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.github.zxh.pbpt.protos.dto.Player.internal_static_PlayerDto_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.github.zxh.pbpt.protos.dto.Player.internal_static_PlayerDto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.github.zxh.pbpt.protos.dto.Player.PlayerDto.class, com.github.zxh.pbpt.protos.dto.Player.PlayerDto.Builder.class);
      }

      // Construct using com.github.zxh.pbpt.protos.dto.Player.PlayerDto.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        id_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        exp_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        level_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        name_ = "";
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.github.zxh.pbpt.protos.dto.Player.internal_static_PlayerDto_descriptor;
      }

      public com.github.zxh.pbpt.protos.dto.Player.PlayerDto getDefaultInstanceForType() {
        return com.github.zxh.pbpt.protos.dto.Player.PlayerDto.getDefaultInstance();
      }

      public com.github.zxh.pbpt.protos.dto.Player.PlayerDto build() {
        com.github.zxh.pbpt.protos.dto.Player.PlayerDto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.github.zxh.pbpt.protos.dto.Player.PlayerDto buildPartial() {
        com.github.zxh.pbpt.protos.dto.Player.PlayerDto result = new com.github.zxh.pbpt.protos.dto.Player.PlayerDto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.id_ = id_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.exp_ = exp_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.level_ = level_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.name_ = name_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.github.zxh.pbpt.protos.dto.Player.PlayerDto) {
          return mergeFrom((com.github.zxh.pbpt.protos.dto.Player.PlayerDto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.github.zxh.pbpt.protos.dto.Player.PlayerDto other) {
        if (other == com.github.zxh.pbpt.protos.dto.Player.PlayerDto.getDefaultInstance()) return this;
        if (other.hasId()) {
          setId(other.getId());
        }
        if (other.hasExp()) {
          setExp(other.getExp());
        }
        if (other.hasLevel()) {
          setLevel(other.getLevel());
        }
        if (other.hasName()) {
          bitField0_ |= 0x00000008;
          name_ = other.name_;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasId()) {
          
          return false;
        }
        if (!hasExp()) {
          
          return false;
        }
        if (!hasLevel()) {
          
          return false;
        }
        if (!hasName()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.github.zxh.pbpt.protos.dto.Player.PlayerDto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.github.zxh.pbpt.protos.dto.Player.PlayerDto) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int id_ ;
      /**
       * <code>required uint32 id = 1;</code>
       */
      public boolean hasId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required uint32 id = 1;</code>
       */
      public int getId() {
        return id_;
      }
      /**
       * <code>required uint32 id = 1;</code>
       */
      public Builder setId(int value) {
        bitField0_ |= 0x00000001;
        id_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required uint32 id = 1;</code>
       */
      public Builder clearId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        id_ = 0;
        onChanged();
        return this;
      }

      private int exp_ ;
      /**
       * <code>required uint32 exp = 2;</code>
       */
      public boolean hasExp() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required uint32 exp = 2;</code>
       */
      public int getExp() {
        return exp_;
      }
      /**
       * <code>required uint32 exp = 2;</code>
       */
      public Builder setExp(int value) {
        bitField0_ |= 0x00000002;
        exp_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required uint32 exp = 2;</code>
       */
      public Builder clearExp() {
        bitField0_ = (bitField0_ & ~0x00000002);
        exp_ = 0;
        onChanged();
        return this;
      }

      private int level_ ;
      /**
       * <code>required uint32 level = 3;</code>
       */
      public boolean hasLevel() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>required uint32 level = 3;</code>
       */
      public int getLevel() {
        return level_;
      }
      /**
       * <code>required uint32 level = 3;</code>
       */
      public Builder setLevel(int value) {
        bitField0_ |= 0x00000004;
        level_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required uint32 level = 3;</code>
       */
      public Builder clearLevel() {
        bitField0_ = (bitField0_ & ~0x00000004);
        level_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object name_ = "";
      /**
       * <code>required string name = 4;</code>
       */
      public boolean hasName() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>required string name = 4;</code>
       */
      public java.lang.String getName() {
        java.lang.Object ref = name_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            name_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string name = 4;</code>
       */
      public com.google.protobuf.ByteString
          getNameBytes() {
        java.lang.Object ref = name_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          name_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string name = 4;</code>
       */
      public Builder setName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        name_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string name = 4;</code>
       */
      public Builder clearName() {
        bitField0_ = (bitField0_ & ~0x00000008);
        name_ = getDefaultInstance().getName();
        onChanged();
        return this;
      }
      /**
       * <code>required string name = 4;</code>
       */
      public Builder setNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        name_ = value;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:PlayerDto)
    }

    static {
      defaultInstance = new PlayerDto(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:PlayerDto)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PlayerDto_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_PlayerDto_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020dto/player.proto\"A\n\tPlayerDto\022\n\n\002id\030\001 " +
      "\002(\r\022\013\n\003exp\030\002 \002(\r\022\r\n\005level\030\003 \002(\r\022\014\n\004name\030" +
      "\004 \002(\tB \n\036com.github.zxh.pbpt.protos.dto"
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
    internal_static_PlayerDto_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PlayerDto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_PlayerDto_descriptor,
        new java.lang.String[] { "Id", "Exp", "Level", "Name", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
