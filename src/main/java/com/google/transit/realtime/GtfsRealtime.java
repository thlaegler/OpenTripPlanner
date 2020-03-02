package com.google.transit.realtime;



import com.fasterxml.jackson.annotation.JsonIgnore;

public final class GtfsRealtime {
  private GtfsRealtime() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {}

  public interface FeedMessageOrBuilder extends
      // @@protoc_insertion_point(interface_extends:transit_realtime.FeedMessage)
      com.google.protobuf.GeneratedMessage.ExtendableMessageOrBuilder<FeedMessage> {

    /**
     * <code>required .transit_realtime.FeedHeader header = 1;</code>
     *
     * <pre>
     * Metadata about this feed and feed message.
     * </pre>
     */
    boolean hasHeader();

    /**
     * <code>required .transit_realtime.FeedHeader header = 1;</code>
     *
     * <pre>
     * Metadata about this feed and feed message.
     * </pre>
     */
    com.google.transit.realtime.GtfsRealtime.FeedHeader getHeader();

    /**
     * <code>required .transit_realtime.FeedHeader header = 1;</code>
     *
     * <pre>
     * Metadata about this feed and feed message.
     * </pre>
     */
    com.google.transit.realtime.GtfsRealtime.FeedHeaderOrBuilder getHeaderOrBuilder();

    /**
     * <code>repeated .transit_realtime.FeedEntity entity = 2;</code>
     *
     * <pre>
     * Contents of the feed.
     * </pre>
     */
    java.util.List<com.google.transit.realtime.GtfsRealtime.FeedEntity> getEntityList();

    /**
     * <code>repeated .transit_realtime.FeedEntity entity = 2;</code>
     *
     * <pre>
     * Contents of the feed.
     * </pre>
     */
    com.google.transit.realtime.GtfsRealtime.FeedEntity getEntity(int index);

    /**
     * <code>repeated .transit_realtime.FeedEntity entity = 2;</code>
     *
     * <pre>
     * Contents of the feed.
     * </pre>
     */
    int getEntityCount();

    /**
     * <code>repeated .transit_realtime.FeedEntity entity = 2;</code>
     *
     * <pre>
     * Contents of the feed.
     * </pre>
     */
    java.util.List<? extends com.google.transit.realtime.GtfsRealtime.FeedEntityOrBuilder> getEntityOrBuilderList();

    /**
     * <code>repeated .transit_realtime.FeedEntity entity = 2;</code>
     *
     * <pre>
     * Contents of the feed.
     * </pre>
     */
    com.google.transit.realtime.GtfsRealtime.FeedEntityOrBuilder getEntityOrBuilder(int index);
  }
  /**
   * Protobuf type {@code transit_realtime.FeedMessage}
   *
   * <pre>
   * The contents of a feed message.
   * A feed is a continuous stream of feed messages. Each message in the stream is
   * obtained as a response to an appropriate HTTP GET request.
   * A realtime feed is always defined with relation to an existing GTFS feed.
   * All the entity ids are resolved with respect to the GTFS feed.
   * Note that "required" and "optional" as stated in this file refer to Protocol
   * Buffer cardinality, not semantic cardinality.  See reference.md at
   * https://github.com/google/transit/tree/master/gtfs-realtime for field
   * semantic cardinality.
   * </pre>
   */
  public static final class FeedMessage
      extends com.google.protobuf.GeneratedMessage.ExtendableMessage<FeedMessage> implements
      // @@protoc_insertion_point(message_implements:transit_realtime.FeedMessage)
      FeedMessageOrBuilder {
    // Use FeedMessage.newBuilder() to construct.
    private FeedMessage(
        com.google.protobuf.GeneratedMessage.ExtendableBuilder<com.google.transit.realtime.GtfsRealtime.FeedMessage, ?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }

    private FeedMessage(boolean noInit) {
      this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }

    private static final FeedMessage defaultInstance;

    public static FeedMessage getDefaultInstance() {
      return defaultInstance;
    }

    @Override
    public FeedMessage getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private FeedMessage(com.google.protobuf.CodedInputStream input,
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
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              com.google.transit.realtime.GtfsRealtime.FeedHeader.Builder subBuilder = null;
              if (((bitField0_ & 0x00000001) == 0x00000001)) {
                subBuilder = header_.toBuilder();
              }
              header_ = input.readMessage(
                  com.google.transit.realtime.GtfsRealtime.FeedHeader.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(header_);
                header_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000001;
              break;
            }
            case 18: {
              if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                entity_ =
                    new java.util.ArrayList<com.google.transit.realtime.GtfsRealtime.FeedEntity>();
                mutable_bitField0_ |= 0x00000002;
              }
              entity_.add(input.readMessage(
                  com.google.transit.realtime.GtfsRealtime.FeedEntity.PARSER, extensionRegistry));
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e.getMessage())
            .setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
          entity_ = java.util.Collections.unmodifiableList(entity_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_FeedMessage_descriptor;
    }

    @Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
      return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_FeedMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.transit.realtime.GtfsRealtime.FeedMessage.class,
              com.google.transit.realtime.GtfsRealtime.FeedMessage.Builder.class);
    }

    public static com.google.protobuf.Parser<FeedMessage> PARSER =
        new com.google.protobuf.AbstractParser<FeedMessage>() {
          @Override
          public FeedMessage parsePartialFrom(com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new FeedMessage(input, extensionRegistry);
          }
        };

    @java.lang.Override
    public com.google.protobuf.Parser<FeedMessage> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int HEADER_FIELD_NUMBER = 1;
    private com.google.transit.realtime.GtfsRealtime.FeedHeader header_;

    /**
     * <code>required .transit_realtime.FeedHeader header = 1;</code>
     *
     * <pre>
     * Metadata about this feed and feed message.
     * </pre>
     */
    @Override
    public boolean hasHeader() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }

    /**
     * <code>required .transit_realtime.FeedHeader header = 1;</code>
     *
     * <pre>
     * Metadata about this feed and feed message.
     * </pre>
     */
    @Override
    public com.google.transit.realtime.GtfsRealtime.FeedHeader getHeader() {
      return header_;
    }

    /**
     * <code>required .transit_realtime.FeedHeader header = 1;</code>
     *
     * <pre>
     * Metadata about this feed and feed message.
     * </pre>
     */
    @Override
    public com.google.transit.realtime.GtfsRealtime.FeedHeaderOrBuilder getHeaderOrBuilder() {
      return header_;
    }

    public static final int ENTITY_FIELD_NUMBER = 2;
    private java.util.List<com.google.transit.realtime.GtfsRealtime.FeedEntity> entity_;

    /**
     * <code>repeated .transit_realtime.FeedEntity entity = 2;</code>
     *
     * <pre>
     * Contents of the feed.
     * </pre>
     */
    @Override
    public java.util.List<com.google.transit.realtime.GtfsRealtime.FeedEntity> getEntityList() {
      return entity_;
    }

    /**
     * <code>repeated .transit_realtime.FeedEntity entity = 2;</code>
     *
     * <pre>
     * Contents of the feed.
     * </pre>
     */
    @Override
    public java.util.List<? extends com.google.transit.realtime.GtfsRealtime.FeedEntityOrBuilder> getEntityOrBuilderList() {
      return entity_;
    }

    /**
     * <code>repeated .transit_realtime.FeedEntity entity = 2;</code>
     *
     * <pre>
     * Contents of the feed.
     * </pre>
     */
    @Override
    public int getEntityCount() {
      return entity_.size();
    }

    /**
     * <code>repeated .transit_realtime.FeedEntity entity = 2;</code>
     *
     * <pre>
     * Contents of the feed.
     * </pre>
     */
    @Override
    public com.google.transit.realtime.GtfsRealtime.FeedEntity getEntity(int index) {
      return entity_.get(index);
    }

    /**
     * <code>repeated .transit_realtime.FeedEntity entity = 2;</code>
     *
     * <pre>
     * Contents of the feed.
     * </pre>
     */
    @Override
    public com.google.transit.realtime.GtfsRealtime.FeedEntityOrBuilder getEntityOrBuilder(
        int index) {
      return entity_.get(index);
    }

    private void initFields() {
      header_ = com.google.transit.realtime.GtfsRealtime.FeedHeader.getDefaultInstance();
      entity_ = java.util.Collections.emptyList();
    }

    private byte memoizedIsInitialized = -1;

    @Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1)
        return true;
      if (isInitialized == 0)
        return false;

      if (!hasHeader()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getHeader().isInitialized()) {
        memoizedIsInitialized = 0;
        return false;
      }
      for (int i = 0; i < getEntityCount(); i++) {
        if (!getEntity(i).isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      if (!extensionsAreInitialized()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    @Override
    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      getSerializedSize();
      com.google.protobuf.GeneratedMessage.ExtendableMessage<com.google.transit.realtime.GtfsRealtime.FeedMessage>.ExtensionWriter extensionWriter =
          newExtensionWriter();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeMessage(1, header_);
      }
      for (int i = 0; i < entity_.size(); i++) {
        output.writeMessage(2, entity_.get(i));
      }
      extensionWriter.writeUntil(2000, output);
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;

    @Override
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1)
        return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, header_);
      }
      for (int i = 0; i < entity_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, entity_.get(i));
      }
      size += extensionsSerializedSize();
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;

    @java.lang.Override
    protected java.lang.Object writeReplace() throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static com.google.transit.realtime.GtfsRealtime.FeedMessage parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.google.transit.realtime.GtfsRealtime.FeedMessage parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.google.transit.realtime.GtfsRealtime.FeedMessage parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.google.transit.realtime.GtfsRealtime.FeedMessage parseFrom(byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.google.transit.realtime.GtfsRealtime.FeedMessage parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return PARSER.parseFrom(input);
    }

    public static com.google.transit.realtime.GtfsRealtime.FeedMessage parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static com.google.transit.realtime.GtfsRealtime.FeedMessage parseDelimitedFrom(
        java.io.InputStream input) throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }

    public static com.google.transit.realtime.GtfsRealtime.FeedMessage parseDelimitedFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }

    public static com.google.transit.realtime.GtfsRealtime.FeedMessage parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return PARSER.parseFrom(input);
    }

    public static com.google.transit.realtime.GtfsRealtime.FeedMessage parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return Builder.create();
    }

    @Override
    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder(
        com.google.transit.realtime.GtfsRealtime.FeedMessage prototype) {
      return newBuilder().mergeFrom(prototype);
    }

    @Override
    public Builder toBuilder() {
      return newBuilder(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }

    /**
     * Protobuf type {@code transit_realtime.FeedMessage}
     *
     * <pre>
     * The contents of a feed message.
     * A feed is a continuous stream of feed messages. Each message in the stream is
     * obtained as a response to an appropriate HTTP GET request.
     * A realtime feed is always defined with relation to an existing GTFS feed.
     * All the entity ids are resolved with respect to the GTFS feed.
     * Note that "required" and "optional" as stated in this file refer to Protocol
     * Buffer cardinality, not semantic cardinality.  See reference.md at
     * https://github.com/google/transit/tree/master/gtfs-realtime for field
     * semantic cardinality.
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.ExtendableBuilder<com.google.transit.realtime.GtfsRealtime.FeedMessage, Builder>
        implements
        // @@protoc_insertion_point(builder_implements:transit_realtime.FeedMessage)
        com.google.transit.realtime.GtfsRealtime.FeedMessageOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_FeedMessage_descriptor;
      }

      @Override
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
        return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_FeedMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.google.transit.realtime.GtfsRealtime.FeedMessage.class,
                com.google.transit.realtime.GtfsRealtime.FeedMessage.Builder.class);
      }

      // Construct using com.google.transit.realtime.GtfsRealtime.FeedMessage.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getHeaderFieldBuilder();
          getEntityFieldBuilder();
        }
      }

      private static Builder create() {
        return new Builder();
      }

      @Override
      public Builder clear() {
        super.clear();
        if (headerBuilder_ == null) {
          header_ = com.google.transit.realtime.GtfsRealtime.FeedHeader.getDefaultInstance();
        } else {
          headerBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        if (entityBuilder_ == null) {
          entity_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          entityBuilder_.clear();
        }
        return this;
      }

      @Override
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_FeedMessage_descriptor;
      }

      @Override
      public com.google.transit.realtime.GtfsRealtime.FeedMessage getDefaultInstanceForType() {
        return com.google.transit.realtime.GtfsRealtime.FeedMessage.getDefaultInstance();
      }

      @Override
      public com.google.transit.realtime.GtfsRealtime.FeedMessage build() {
        com.google.transit.realtime.GtfsRealtime.FeedMessage result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public com.google.transit.realtime.GtfsRealtime.FeedMessage buildPartial() {
        com.google.transit.realtime.GtfsRealtime.FeedMessage result =
            new com.google.transit.realtime.GtfsRealtime.FeedMessage(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (headerBuilder_ == null) {
          result.header_ = header_;
        } else {
          result.header_ = headerBuilder_.build();
        }
        if (entityBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)) {
            entity_ = java.util.Collections.unmodifiableList(entity_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.entity_ = entity_;
        } else {
          result.entity_ = entityBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.google.transit.realtime.GtfsRealtime.FeedMessage) {
          return mergeFrom((com.google.transit.realtime.GtfsRealtime.FeedMessage) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.google.transit.realtime.GtfsRealtime.FeedMessage other) {
        if (other == com.google.transit.realtime.GtfsRealtime.FeedMessage.getDefaultInstance())
          return this;
        if (other.hasHeader()) {
          mergeHeader(other.getHeader());
        }
        if (entityBuilder_ == null) {
          if (!other.entity_.isEmpty()) {
            if (entity_.isEmpty()) {
              entity_ = other.entity_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureEntityIsMutable();
              entity_.addAll(other.entity_);
            }
            onChanged();
          }
        } else {
          if (!other.entity_.isEmpty()) {
            if (entityBuilder_.isEmpty()) {
              entityBuilder_.dispose();
              entityBuilder_ = null;
              entity_ = other.entity_;
              bitField0_ = (bitField0_ & ~0x00000002);
              entityBuilder_ = com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders
                  ? getEntityFieldBuilder()
                  : null;
            } else {
              entityBuilder_.addAllMessages(other.entity_);
            }
          }
        }
        this.mergeExtensionFields(other);
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      @Override
      public final boolean isInitialized() {
        if (!hasHeader()) {

          return false;
        }
        if (!getHeader().isInitialized()) {

          return false;
        }
        for (int i = 0; i < getEntityCount(); i++) {
          if (!getEntity(i).isInitialized()) {

            return false;
          }
        }
        if (!extensionsAreInitialized()) {

          return false;
        }
        return true;
      }

      @Override
      public Builder mergeFrom(com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        com.google.transit.realtime.GtfsRealtime.FeedMessage parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (com.google.transit.realtime.GtfsRealtime.FeedMessage) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private com.google.transit.realtime.GtfsRealtime.FeedHeader header_ =
          com.google.transit.realtime.GtfsRealtime.FeedHeader.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<com.google.transit.realtime.GtfsRealtime.FeedHeader, com.google.transit.realtime.GtfsRealtime.FeedHeader.Builder, com.google.transit.realtime.GtfsRealtime.FeedHeaderOrBuilder> headerBuilder_;

      /**
       * <code>required .transit_realtime.FeedHeader header = 1;</code>
       *
       * <pre>
       * Metadata about this feed and feed message.
       * </pre>
       */
      @Override
      public boolean hasHeader() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }

      /**
       * <code>required .transit_realtime.FeedHeader header = 1;</code>
       *
       * <pre>
       * Metadata about this feed and feed message.
       * </pre>
       */
      @Override
      public com.google.transit.realtime.GtfsRealtime.FeedHeader getHeader() {
        if (headerBuilder_ == null) {
          return header_;
        } else {
          return headerBuilder_.getMessage();
        }
      }

      /**
       * <code>required .transit_realtime.FeedHeader header = 1;</code>
       *
       * <pre>
       * Metadata about this feed and feed message.
       * </pre>
       */
      public Builder setHeader(com.google.transit.realtime.GtfsRealtime.FeedHeader value) {
        if (headerBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          header_ = value;
          onChanged();
        } else {
          headerBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }

      /**
       * <code>required .transit_realtime.FeedHeader header = 1;</code>
       *
       * <pre>
       * Metadata about this feed and feed message.
       * </pre>
       */
      public Builder setHeader(
          com.google.transit.realtime.GtfsRealtime.FeedHeader.Builder builderForValue) {
        if (headerBuilder_ == null) {
          header_ = builderForValue.build();
          onChanged();
        } else {
          headerBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }

      /**
       * <code>required .transit_realtime.FeedHeader header = 1;</code>
       *
       * <pre>
       * Metadata about this feed and feed message.
       * </pre>
       */
      public Builder mergeHeader(com.google.transit.realtime.GtfsRealtime.FeedHeader value) {
        if (headerBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)
              && header_ != com.google.transit.realtime.GtfsRealtime.FeedHeader
                  .getDefaultInstance()) {
            header_ = com.google.transit.realtime.GtfsRealtime.FeedHeader.newBuilder(header_)
                .mergeFrom(value).buildPartial();
          } else {
            header_ = value;
          }
          onChanged();
        } else {
          headerBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }

      /**
       * <code>required .transit_realtime.FeedHeader header = 1;</code>
       *
       * <pre>
       * Metadata about this feed and feed message.
       * </pre>
       */
      public Builder clearHeader() {
        if (headerBuilder_ == null) {
          header_ = com.google.transit.realtime.GtfsRealtime.FeedHeader.getDefaultInstance();
          onChanged();
        } else {
          headerBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      /**
       * <code>required .transit_realtime.FeedHeader header = 1;</code>
       *
       * <pre>
       * Metadata about this feed and feed message.
       * </pre>
       */
      public com.google.transit.realtime.GtfsRealtime.FeedHeader.Builder getHeaderBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getHeaderFieldBuilder().getBuilder();
      }

      /**
       * <code>required .transit_realtime.FeedHeader header = 1;</code>
       *
       * <pre>
       * Metadata about this feed and feed message.
       * </pre>
       */
      @Override
      public com.google.transit.realtime.GtfsRealtime.FeedHeaderOrBuilder getHeaderOrBuilder() {
        if (headerBuilder_ != null) {
          return headerBuilder_.getMessageOrBuilder();
        } else {
          return header_;
        }
      }

      /**
       * <code>required .transit_realtime.FeedHeader header = 1;</code>
       *
       * <pre>
       * Metadata about this feed and feed message.
       * </pre>
       */
      private com.google.protobuf.SingleFieldBuilder<com.google.transit.realtime.GtfsRealtime.FeedHeader, com.google.transit.realtime.GtfsRealtime.FeedHeader.Builder, com.google.transit.realtime.GtfsRealtime.FeedHeaderOrBuilder> getHeaderFieldBuilder() {
        if (headerBuilder_ == null) {
          headerBuilder_ =
              new com.google.protobuf.SingleFieldBuilder<com.google.transit.realtime.GtfsRealtime.FeedHeader, com.google.transit.realtime.GtfsRealtime.FeedHeader.Builder, com.google.transit.realtime.GtfsRealtime.FeedHeaderOrBuilder>(
                  getHeader(), getParentForChildren(), isClean());
          header_ = null;
        }
        return headerBuilder_;
      }

      private java.util.List<com.google.transit.realtime.GtfsRealtime.FeedEntity> entity_ =
          java.util.Collections.emptyList();

      private void ensureEntityIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          entity_ =
              new java.util.ArrayList<com.google.transit.realtime.GtfsRealtime.FeedEntity>(entity_);
          bitField0_ |= 0x00000002;
        }
      }

      private com.google.protobuf.RepeatedFieldBuilder<com.google.transit.realtime.GtfsRealtime.FeedEntity, com.google.transit.realtime.GtfsRealtime.FeedEntity.Builder, com.google.transit.realtime.GtfsRealtime.FeedEntityOrBuilder> entityBuilder_;

      /**
       * <code>repeated .transit_realtime.FeedEntity entity = 2;</code>
       *
       * <pre>
       * Contents of the feed.
       * </pre>
       */
      @Override
      public java.util.List<com.google.transit.realtime.GtfsRealtime.FeedEntity> getEntityList() {
        if (entityBuilder_ == null) {
          return java.util.Collections.unmodifiableList(entity_);
        } else {
          return entityBuilder_.getMessageList();
        }
      }

      /**
       * <code>repeated .transit_realtime.FeedEntity entity = 2;</code>
       *
       * <pre>
       * Contents of the feed.
       * </pre>
       */
      @Override
      public int getEntityCount() {
        if (entityBuilder_ == null) {
          return entity_.size();
        } else {
          return entityBuilder_.getCount();
        }
      }

      /**
       * <code>repeated .transit_realtime.FeedEntity entity = 2;</code>
       *
       * <pre>
       * Contents of the feed.
       * </pre>
       */
      @Override
      public com.google.transit.realtime.GtfsRealtime.FeedEntity getEntity(int index) {
        if (entityBuilder_ == null) {
          return entity_.get(index);
        } else {
          return entityBuilder_.getMessage(index);
        }
      }

      /**
       * <code>repeated .transit_realtime.FeedEntity entity = 2;</code>
       *
       * <pre>
       * Contents of the feed.
       * </pre>
       */
      public Builder setEntity(int index,
          com.google.transit.realtime.GtfsRealtime.FeedEntity value) {
        if (entityBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureEntityIsMutable();
          entity_.set(index, value);
          onChanged();
        } else {
          entityBuilder_.setMessage(index, value);
        }
        return this;
      }

      /**
       * <code>repeated .transit_realtime.FeedEntity entity = 2;</code>
       *
       * <pre>
       * Contents of the feed.
       * </pre>
       */
      public Builder setEntity(int index,
          com.google.transit.realtime.GtfsRealtime.FeedEntity.Builder builderForValue) {
        if (entityBuilder_ == null) {
          ensureEntityIsMutable();
          entity_.set(index, builderForValue.build());
          onChanged();
        } else {
          entityBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }

      /**
       * <code>repeated .transit_realtime.FeedEntity entity = 2;</code>
       *
       * <pre>
       * Contents of the feed.
       * </pre>
       */
      public Builder addEntity(com.google.transit.realtime.GtfsRealtime.FeedEntity value) {
        if (entityBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureEntityIsMutable();
          entity_.add(value);
          onChanged();
        } else {
          entityBuilder_.addMessage(value);
        }
        return this;
      }

      /**
       * <code>repeated .transit_realtime.FeedEntity entity = 2;</code>
       *
       * <pre>
       * Contents of the feed.
       * </pre>
       */
      public Builder addEntity(int index,
          com.google.transit.realtime.GtfsRealtime.FeedEntity value) {
        if (entityBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureEntityIsMutable();
          entity_.add(index, value);
          onChanged();
        } else {
          entityBuilder_.addMessage(index, value);
        }
        return this;
      }

      /**
       * <code>repeated .transit_realtime.FeedEntity entity = 2;</code>
       *
       * <pre>
       * Contents of the feed.
       * </pre>
       */
      public Builder addEntity(
          com.google.transit.realtime.GtfsRealtime.FeedEntity.Builder builderForValue) {
        if (entityBuilder_ == null) {
          ensureEntityIsMutable();
          entity_.add(builderForValue.build());
          onChanged();
        } else {
          entityBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }

      /**
       * <code>repeated .transit_realtime.FeedEntity entity = 2;</code>
       *
       * <pre>
       * Contents of the feed.
       * </pre>
       */
      public Builder addEntity(int index,
          com.google.transit.realtime.GtfsRealtime.FeedEntity.Builder builderForValue) {
        if (entityBuilder_ == null) {
          ensureEntityIsMutable();
          entity_.add(index, builderForValue.build());
          onChanged();
        } else {
          entityBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }

      /**
       * <code>repeated .transit_realtime.FeedEntity entity = 2;</code>
       *
       * <pre>
       * Contents of the feed.
       * </pre>
       */
      public Builder addAllEntity(
          java.lang.Iterable<? extends com.google.transit.realtime.GtfsRealtime.FeedEntity> values) {
        if (entityBuilder_ == null) {
          ensureEntityIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(values, entity_);
          onChanged();
        } else {
          entityBuilder_.addAllMessages(values);
        }
        return this;
      }

      /**
       * <code>repeated .transit_realtime.FeedEntity entity = 2;</code>
       *
       * <pre>
       * Contents of the feed.
       * </pre>
       */
      public Builder clearEntity() {
        if (entityBuilder_ == null) {
          entity_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          entityBuilder_.clear();
        }
        return this;
      }

      /**
       * <code>repeated .transit_realtime.FeedEntity entity = 2;</code>
       *
       * <pre>
       * Contents of the feed.
       * </pre>
       */
      public Builder removeEntity(int index) {
        if (entityBuilder_ == null) {
          ensureEntityIsMutable();
          entity_.remove(index);
          onChanged();
        } else {
          entityBuilder_.remove(index);
        }
        return this;
      }

      /**
       * <code>repeated .transit_realtime.FeedEntity entity = 2;</code>
       *
       * <pre>
       * Contents of the feed.
       * </pre>
       */
      public com.google.transit.realtime.GtfsRealtime.FeedEntity.Builder getEntityBuilder(
          int index) {
        return getEntityFieldBuilder().getBuilder(index);
      }

      /**
       * <code>repeated .transit_realtime.FeedEntity entity = 2;</code>
       *
       * <pre>
       * Contents of the feed.
       * </pre>
       */
      @Override
      public com.google.transit.realtime.GtfsRealtime.FeedEntityOrBuilder getEntityOrBuilder(
          int index) {
        if (entityBuilder_ == null) {
          return entity_.get(index);
        } else {
          return entityBuilder_.getMessageOrBuilder(index);
        }
      }

      /**
       * <code>repeated .transit_realtime.FeedEntity entity = 2;</code>
       *
       * <pre>
       * Contents of the feed.
       * </pre>
       */
      @Override
      public java.util.List<? extends com.google.transit.realtime.GtfsRealtime.FeedEntityOrBuilder> getEntityOrBuilderList() {
        if (entityBuilder_ != null) {
          return entityBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(entity_);
        }
      }

      /**
       * <code>repeated .transit_realtime.FeedEntity entity = 2;</code>
       *
       * <pre>
       * Contents of the feed.
       * </pre>
       */
      public com.google.transit.realtime.GtfsRealtime.FeedEntity.Builder addEntityBuilder() {
        return getEntityFieldBuilder()
            .addBuilder(com.google.transit.realtime.GtfsRealtime.FeedEntity.getDefaultInstance());
      }

      /**
       * <code>repeated .transit_realtime.FeedEntity entity = 2;</code>
       *
       * <pre>
       * Contents of the feed.
       * </pre>
       */
      public com.google.transit.realtime.GtfsRealtime.FeedEntity.Builder addEntityBuilder(
          int index) {
        return getEntityFieldBuilder().addBuilder(index,
            com.google.transit.realtime.GtfsRealtime.FeedEntity.getDefaultInstance());
      }

      /**
       * <code>repeated .transit_realtime.FeedEntity entity = 2;</code>
       *
       * <pre>
       * Contents of the feed.
       * </pre>
       */
      public java.util.List<com.google.transit.realtime.GtfsRealtime.FeedEntity.Builder> getEntityBuilderList() {
        return getEntityFieldBuilder().getBuilderList();
      }

      private com.google.protobuf.RepeatedFieldBuilder<com.google.transit.realtime.GtfsRealtime.FeedEntity, com.google.transit.realtime.GtfsRealtime.FeedEntity.Builder, com.google.transit.realtime.GtfsRealtime.FeedEntityOrBuilder> getEntityFieldBuilder() {
        if (entityBuilder_ == null) {
          entityBuilder_ =
              new com.google.protobuf.RepeatedFieldBuilder<com.google.transit.realtime.GtfsRealtime.FeedEntity, com.google.transit.realtime.GtfsRealtime.FeedEntity.Builder, com.google.transit.realtime.GtfsRealtime.FeedEntityOrBuilder>(
                  entity_, ((bitField0_ & 0x00000002) == 0x00000002), getParentForChildren(),
                  isClean());
          entity_ = null;
        }
        return entityBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:transit_realtime.FeedMessage)
    }

    static {
      defaultInstance = new FeedMessage(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:transit_realtime.FeedMessage)
  }

  public interface FeedHeaderOrBuilder extends
      // @@protoc_insertion_point(interface_extends:transit_realtime.FeedHeader)
      com.google.protobuf.GeneratedMessage.ExtendableMessageOrBuilder<FeedHeader> {

    /**
     * <code>required string gtfs_realtime_version = 1;</code>
     *
     * <pre>
     * Version of the feed specification.
     * The current version is 2.0.  Valid versions are "2.0", "1.0".
     * </pre>
     */
    boolean hasGtfsRealtimeVersion();

    /**
     * <code>required string gtfs_realtime_version = 1;</code>
     *
     * <pre>
     * Version of the feed specification.
     * The current version is 2.0.  Valid versions are "2.0", "1.0".
     * </pre>
     */
    java.lang.String getGtfsRealtimeVersion();

    /**
     * <code>required string gtfs_realtime_version = 1;</code>
     *
     * <pre>
     * Version of the feed specification.
     * The current version is 2.0.  Valid versions are "2.0", "1.0".
     * </pre>
     */
    com.google.protobuf.ByteString getGtfsRealtimeVersionBytes();

    /**
     * <code>optional .transit_realtime.FeedHeader.Incrementality incrementality = 2 [default = FULL_DATASET];</code>
     */
    boolean hasIncrementality();

    /**
     * <code>optional .transit_realtime.FeedHeader.Incrementality incrementality = 2 [default = FULL_DATASET];</code>
     */
    com.google.transit.realtime.GtfsRealtime.FeedHeader.Incrementality getIncrementality();

    /**
     * <code>optional uint64 timestamp = 3;</code>
     *
     * <pre>
     * This timestamp identifies the moment when the content of this feed has been
     * created (in server time). In POSIX time (i.e., number of seconds since
     * January 1st 1970 00:00:00 UTC).
     * </pre>
     */
    boolean hasTimestamp();

    /**
     * <code>optional uint64 timestamp = 3;</code>
     *
     * <pre>
     * This timestamp identifies the moment when the content of this feed has been
     * created (in server time). In POSIX time (i.e., number of seconds since
     * January 1st 1970 00:00:00 UTC).
     * </pre>
     */
    long getTimestamp();
  }
  /**
   * Protobuf type {@code transit_realtime.FeedHeader}
   *
   * <pre>
   * Metadata about a feed, included in feed messages.
   * </pre>
   */
  public static final class FeedHeader
      extends com.google.protobuf.GeneratedMessage.ExtendableMessage<FeedHeader> implements
      // @@protoc_insertion_point(message_implements:transit_realtime.FeedHeader)
      FeedHeaderOrBuilder {
    // Use FeedHeader.newBuilder() to construct.
    private FeedHeader(
        com.google.protobuf.GeneratedMessage.ExtendableBuilder<com.google.transit.realtime.GtfsRealtime.FeedHeader, ?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }

    private FeedHeader(boolean noInit) {
      this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }

    private static final FeedHeader defaultInstance;

    public static FeedHeader getDefaultInstance() {
      return defaultInstance;
    }

    @Override
    public FeedHeader getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private FeedHeader(com.google.protobuf.CodedInputStream input,
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
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000001;
              gtfsRealtimeVersion_ = bs;
              break;
            }
            case 16: {
              int rawValue = input.readEnum();
              com.google.transit.realtime.GtfsRealtime.FeedHeader.Incrementality value =
                  com.google.transit.realtime.GtfsRealtime.FeedHeader.Incrementality
                      .valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(2, rawValue);
              } else {
                bitField0_ |= 0x00000002;
                incrementality_ = value;
              }
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              timestamp_ = input.readUInt64();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e.getMessage())
            .setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_FeedHeader_descriptor;
    }

    @Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
      return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_FeedHeader_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.transit.realtime.GtfsRealtime.FeedHeader.class,
              com.google.transit.realtime.GtfsRealtime.FeedHeader.Builder.class);
    }

    public static com.google.protobuf.Parser<FeedHeader> PARSER =
        new com.google.protobuf.AbstractParser<FeedHeader>() {
          @Override
          public FeedHeader parsePartialFrom(com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new FeedHeader(input, extensionRegistry);
          }
        };

    @java.lang.Override
    public com.google.protobuf.Parser<FeedHeader> getParserForType() {
      return PARSER;
    }

    /**
     * Protobuf enum {@code transit_realtime.FeedHeader.Incrementality}
     *
     * <pre>
     * Determines whether the current fetch is incremental.  Currently,
     * DIFFERENTIAL mode is unsupported and behavior is unspecified for feeds
     * that use this mode.  There are discussions on the GTFS Realtime mailing
     * list around fully specifying the behavior of DIFFERENTIAL mode and the
     * documentation will be updated when those discussions are finalized.
     * </pre>
     */
    public enum Incrementality implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>FULL_DATASET = 0;</code>
       */
      FULL_DATASET(0, 0),
      /**
       * <code>DIFFERENTIAL = 1;</code>
       */
      DIFFERENTIAL(1, 1),;

      /**
       * <code>FULL_DATASET = 0;</code>
       */
      public static final int FULL_DATASET_VALUE = 0;
      /**
       * <code>DIFFERENTIAL = 1;</code>
       */
      public static final int DIFFERENTIAL_VALUE = 1;


      @Override
      public final int getNumber() {
        return value;
      }

      public static Incrementality valueOf(int value) {
        switch (value) {
          case 0:
            return FULL_DATASET;
          case 1:
            return DIFFERENTIAL;
          default:
            return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<Incrementality> internalGetValueMap() {
        return internalValueMap;
      }

      private static com.google.protobuf.Internal.EnumLiteMap<Incrementality> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Incrementality>() {
            @Override
            public Incrementality findValueByNumber(int number) {
              return Incrementality.valueOf(number);
            }
          };

      @Override
      public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
        return getDescriptor().getValues().get(index);
      }

      @Override
      public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
        return getDescriptor();
      }

      public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
        return com.google.transit.realtime.GtfsRealtime.FeedHeader.getDescriptor().getEnumTypes()
            .get(0);
      }

      private static final Incrementality[] VALUES = values();

      public static Incrementality valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        return VALUES[desc.getIndex()];
      }

      private final int index;
      private final int value;

      private Incrementality(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:transit_realtime.FeedHeader.Incrementality)
    }

    private int bitField0_;
    public static final int GTFS_REALTIME_VERSION_FIELD_NUMBER = 1;
    private java.lang.Object gtfsRealtimeVersion_;

    /**
     * <code>required string gtfs_realtime_version = 1;</code>
     *
     * <pre>
     * Version of the feed specification.
     * The current version is 2.0.  Valid versions are "2.0", "1.0".
     * </pre>
     */
    @Override
    public boolean hasGtfsRealtimeVersion() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }

    /**
     * <code>required string gtfs_realtime_version = 1;</code>
     *
     * <pre>
     * Version of the feed specification.
     * The current version is 2.0.  Valid versions are "2.0", "1.0".
     * </pre>
     */
    @Override
    public java.lang.String getGtfsRealtimeVersion() {
      java.lang.Object ref = gtfsRealtimeVersion_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          gtfsRealtimeVersion_ = s;
        }
        return s;
      }
    }

    /**
     * <code>required string gtfs_realtime_version = 1;</code>
     *
     * <pre>
     * Version of the feed specification.
     * The current version is 2.0.  Valid versions are "2.0", "1.0".
     * </pre>
     */
    @Override
    public com.google.protobuf.ByteString getGtfsRealtimeVersionBytes() {
      java.lang.Object ref = gtfsRealtimeVersion_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        gtfsRealtimeVersion_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int INCREMENTALITY_FIELD_NUMBER = 2;
    private com.google.transit.realtime.GtfsRealtime.FeedHeader.Incrementality incrementality_;

    /**
     * <code>optional .transit_realtime.FeedHeader.Incrementality incrementality = 2 [default = FULL_DATASET];</code>
     */
    @Override
    public boolean hasIncrementality() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }

    /**
     * <code>optional .transit_realtime.FeedHeader.Incrementality incrementality = 2 [default = FULL_DATASET];</code>
     */
    @Override
    public com.google.transit.realtime.GtfsRealtime.FeedHeader.Incrementality getIncrementality() {
      return incrementality_;
    }

    public static final int TIMESTAMP_FIELD_NUMBER = 3;
    private long timestamp_;

    /**
     * <code>optional uint64 timestamp = 3;</code>
     *
     * <pre>
     * This timestamp identifies the moment when the content of this feed has been
     * created (in server time). In POSIX time (i.e., number of seconds since
     * January 1st 1970 00:00:00 UTC).
     * </pre>
     */
    @Override
    public boolean hasTimestamp() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }

    /**
     * <code>optional uint64 timestamp = 3;</code>
     *
     * <pre>
     * This timestamp identifies the moment when the content of this feed has been
     * created (in server time). In POSIX time (i.e., number of seconds since
     * January 1st 1970 00:00:00 UTC).
     * </pre>
     */
    @Override
    public long getTimestamp() {
      return timestamp_;
    }

    private void initFields() {
      gtfsRealtimeVersion_ = "";
      incrementality_ =
          com.google.transit.realtime.GtfsRealtime.FeedHeader.Incrementality.FULL_DATASET;
      timestamp_ = 0L;
    }

    private byte memoizedIsInitialized = -1;

    @Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1)
        return true;
      if (isInitialized == 0)
        return false;

      if (!hasGtfsRealtimeVersion()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!extensionsAreInitialized()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    @Override
    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      getSerializedSize();
      com.google.protobuf.GeneratedMessage.ExtendableMessage<com.google.transit.realtime.GtfsRealtime.FeedHeader>.ExtensionWriter extensionWriter =
          newExtensionWriter();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getGtfsRealtimeVersionBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeEnum(2, incrementality_.getNumber());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeUInt64(3, timestamp_);
      }
      extensionWriter.writeUntil(2000, output);
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;

    @Override
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1)
        return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream.computeBytesSize(1,
            getGtfsRealtimeVersionBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size +=
            com.google.protobuf.CodedOutputStream.computeEnumSize(2, incrementality_.getNumber());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream.computeUInt64Size(3, timestamp_);
      }
      size += extensionsSerializedSize();
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;

    @java.lang.Override
    protected java.lang.Object writeReplace() throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static com.google.transit.realtime.GtfsRealtime.FeedHeader parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.google.transit.realtime.GtfsRealtime.FeedHeader parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.google.transit.realtime.GtfsRealtime.FeedHeader parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.google.transit.realtime.GtfsRealtime.FeedHeader parseFrom(byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.google.transit.realtime.GtfsRealtime.FeedHeader parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return PARSER.parseFrom(input);
    }

    public static com.google.transit.realtime.GtfsRealtime.FeedHeader parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static com.google.transit.realtime.GtfsRealtime.FeedHeader parseDelimitedFrom(
        java.io.InputStream input) throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }

    public static com.google.transit.realtime.GtfsRealtime.FeedHeader parseDelimitedFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }

    public static com.google.transit.realtime.GtfsRealtime.FeedHeader parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return PARSER.parseFrom(input);
    }

    public static com.google.transit.realtime.GtfsRealtime.FeedHeader parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return Builder.create();
    }

    @Override
    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder(
        com.google.transit.realtime.GtfsRealtime.FeedHeader prototype) {
      return newBuilder().mergeFrom(prototype);
    }

    @Override
    public Builder toBuilder() {
      return newBuilder(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }

    /**
     * Protobuf type {@code transit_realtime.FeedHeader}
     *
     * <pre>
     * Metadata about a feed, included in feed messages.
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.ExtendableBuilder<com.google.transit.realtime.GtfsRealtime.FeedHeader, Builder>
        implements
        // @@protoc_insertion_point(builder_implements:transit_realtime.FeedHeader)
        com.google.transit.realtime.GtfsRealtime.FeedHeaderOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_FeedHeader_descriptor;
      }

      @Override
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
        return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_FeedHeader_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.google.transit.realtime.GtfsRealtime.FeedHeader.class,
                com.google.transit.realtime.GtfsRealtime.FeedHeader.Builder.class);
      }

      // Construct using com.google.transit.realtime.GtfsRealtime.FeedHeader.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessage.BuilderParent parent) {
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

      @Override
      public Builder clear() {
        super.clear();
        gtfsRealtimeVersion_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        incrementality_ =
            com.google.transit.realtime.GtfsRealtime.FeedHeader.Incrementality.FULL_DATASET;
        bitField0_ = (bitField0_ & ~0x00000002);
        timestamp_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      @Override
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_FeedHeader_descriptor;
      }

      @Override
      public com.google.transit.realtime.GtfsRealtime.FeedHeader getDefaultInstanceForType() {
        return com.google.transit.realtime.GtfsRealtime.FeedHeader.getDefaultInstance();
      }

      @Override
      public com.google.transit.realtime.GtfsRealtime.FeedHeader build() {
        com.google.transit.realtime.GtfsRealtime.FeedHeader result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public com.google.transit.realtime.GtfsRealtime.FeedHeader buildPartial() {
        com.google.transit.realtime.GtfsRealtime.FeedHeader result =
            new com.google.transit.realtime.GtfsRealtime.FeedHeader(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.gtfsRealtimeVersion_ = gtfsRealtimeVersion_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.incrementality_ = incrementality_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.timestamp_ = timestamp_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.google.transit.realtime.GtfsRealtime.FeedHeader) {
          return mergeFrom((com.google.transit.realtime.GtfsRealtime.FeedHeader) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.google.transit.realtime.GtfsRealtime.FeedHeader other) {
        if (other == com.google.transit.realtime.GtfsRealtime.FeedHeader.getDefaultInstance())
          return this;
        if (other.hasGtfsRealtimeVersion()) {
          bitField0_ |= 0x00000001;
          gtfsRealtimeVersion_ = other.gtfsRealtimeVersion_;
          onChanged();
        }
        if (other.hasIncrementality()) {
          setIncrementality(other.getIncrementality());
        }
        if (other.hasTimestamp()) {
          setTimestamp(other.getTimestamp());
        }
        this.mergeExtensionFields(other);
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      @Override
      public final boolean isInitialized() {
        if (!hasGtfsRealtimeVersion()) {

          return false;
        }
        if (!extensionsAreInitialized()) {

          return false;
        }
        return true;
      }

      @Override
      public Builder mergeFrom(com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        com.google.transit.realtime.GtfsRealtime.FeedHeader parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (com.google.transit.realtime.GtfsRealtime.FeedHeader) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private java.lang.Object gtfsRealtimeVersion_ = "";

      /**
       * <code>required string gtfs_realtime_version = 1;</code>
       *
       * <pre>
       * Version of the feed specification.
       * The current version is 2.0.  Valid versions are "2.0", "1.0".
       * </pre>
       */
      @Override
      public boolean hasGtfsRealtimeVersion() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }

      /**
       * <code>required string gtfs_realtime_version = 1;</code>
       *
       * <pre>
       * Version of the feed specification.
       * The current version is 2.0.  Valid versions are "2.0", "1.0".
       * </pre>
       */
      @Override
      public java.lang.String getGtfsRealtimeVersion() {
        java.lang.Object ref = gtfsRealtimeVersion_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            gtfsRealtimeVersion_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }

      /**
       * <code>required string gtfs_realtime_version = 1;</code>
       *
       * <pre>
       * Version of the feed specification.
       * The current version is 2.0.  Valid versions are "2.0", "1.0".
       * </pre>
       */
      @Override
      public com.google.protobuf.ByteString getGtfsRealtimeVersionBytes() {
        java.lang.Object ref = gtfsRealtimeVersion_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          gtfsRealtimeVersion_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }

      /**
       * <code>required string gtfs_realtime_version = 1;</code>
       *
       * <pre>
       * Version of the feed specification.
       * The current version is 2.0.  Valid versions are "2.0", "1.0".
       * </pre>
       */
      public Builder setGtfsRealtimeVersion(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        gtfsRealtimeVersion_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>required string gtfs_realtime_version = 1;</code>
       *
       * <pre>
       * Version of the feed specification.
       * The current version is 2.0.  Valid versions are "2.0", "1.0".
       * </pre>
       */
      public Builder clearGtfsRealtimeVersion() {
        bitField0_ = (bitField0_ & ~0x00000001);
        gtfsRealtimeVersion_ = getDefaultInstance().getGtfsRealtimeVersion();
        onChanged();
        return this;
      }

      /**
       * <code>required string gtfs_realtime_version = 1;</code>
       *
       * <pre>
       * Version of the feed specification.
       * The current version is 2.0.  Valid versions are "2.0", "1.0".
       * </pre>
       */
      public Builder setGtfsRealtimeVersionBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        gtfsRealtimeVersion_ = value;
        onChanged();
        return this;
      }

      private com.google.transit.realtime.GtfsRealtime.FeedHeader.Incrementality incrementality_ =
          com.google.transit.realtime.GtfsRealtime.FeedHeader.Incrementality.FULL_DATASET;

      /**
       * <code>optional .transit_realtime.FeedHeader.Incrementality incrementality = 2 [default = FULL_DATASET];</code>
       */
      @Override
      public boolean hasIncrementality() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }

      /**
       * <code>optional .transit_realtime.FeedHeader.Incrementality incrementality = 2 [default = FULL_DATASET];</code>
       */
      @Override
      public com.google.transit.realtime.GtfsRealtime.FeedHeader.Incrementality getIncrementality() {
        return incrementality_;
      }

      /**
       * <code>optional .transit_realtime.FeedHeader.Incrementality incrementality = 2 [default = FULL_DATASET];</code>
       */
      public Builder setIncrementality(
          com.google.transit.realtime.GtfsRealtime.FeedHeader.Incrementality value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        incrementality_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>optional .transit_realtime.FeedHeader.Incrementality incrementality = 2 [default = FULL_DATASET];</code>
       */
      public Builder clearIncrementality() {
        bitField0_ = (bitField0_ & ~0x00000002);
        incrementality_ =
            com.google.transit.realtime.GtfsRealtime.FeedHeader.Incrementality.FULL_DATASET;
        onChanged();
        return this;
      }

      private long timestamp_;

      /**
       * <code>optional uint64 timestamp = 3;</code>
       *
       * <pre>
       * This timestamp identifies the moment when the content of this feed has been
       * created (in server time). In POSIX time (i.e., number of seconds since
       * January 1st 1970 00:00:00 UTC).
       * </pre>
       */
      @Override
      public boolean hasTimestamp() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }

      /**
       * <code>optional uint64 timestamp = 3;</code>
       *
       * <pre>
       * This timestamp identifies the moment when the content of this feed has been
       * created (in server time). In POSIX time (i.e., number of seconds since
       * January 1st 1970 00:00:00 UTC).
       * </pre>
       */
      @Override
      public long getTimestamp() {
        return timestamp_;
      }

      /**
       * <code>optional uint64 timestamp = 3;</code>
       *
       * <pre>
       * This timestamp identifies the moment when the content of this feed has been
       * created (in server time). In POSIX time (i.e., number of seconds since
       * January 1st 1970 00:00:00 UTC).
       * </pre>
       */
      public Builder setTimestamp(long value) {
        bitField0_ |= 0x00000004;
        timestamp_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>optional uint64 timestamp = 3;</code>
       *
       * <pre>
       * This timestamp identifies the moment when the content of this feed has been
       * created (in server time). In POSIX time (i.e., number of seconds since
       * January 1st 1970 00:00:00 UTC).
       * </pre>
       */
      public Builder clearTimestamp() {
        bitField0_ = (bitField0_ & ~0x00000004);
        timestamp_ = 0L;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:transit_realtime.FeedHeader)
    }

    static {
      defaultInstance = new FeedHeader(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:transit_realtime.FeedHeader)
  }

  public interface FeedEntityOrBuilder extends
      // @@protoc_insertion_point(interface_extends:transit_realtime.FeedEntity)
      com.google.protobuf.GeneratedMessage.ExtendableMessageOrBuilder<FeedEntity> {

    /**
     * <code>required string id = 1;</code>
     *
     * <pre>
     * The ids are used only to provide incrementality support. The id should be
     * unique within a FeedMessage. Consequent FeedMessages may contain
     * FeedEntities with the same id. In case of a DIFFERENTIAL update the new
     * FeedEntity with some id will replace the old FeedEntity with the same id
     * (or delete it - see is_deleted below).
     * The actual GTFS entities (e.g. stations, routes, trips) referenced by the
     * feed must be specified by explicit selectors (see EntitySelector below for
     * more info).
     * </pre>
     */
    boolean hasId();

    /**
     * <code>required string id = 1;</code>
     *
     * <pre>
     * The ids are used only to provide incrementality support. The id should be
     * unique within a FeedMessage. Consequent FeedMessages may contain
     * FeedEntities with the same id. In case of a DIFFERENTIAL update the new
     * FeedEntity with some id will replace the old FeedEntity with the same id
     * (or delete it - see is_deleted below).
     * The actual GTFS entities (e.g. stations, routes, trips) referenced by the
     * feed must be specified by explicit selectors (see EntitySelector below for
     * more info).
     * </pre>
     */
    java.lang.String getId();

    /**
     * <code>required string id = 1;</code>
     *
     * <pre>
     * The ids are used only to provide incrementality support. The id should be
     * unique within a FeedMessage. Consequent FeedMessages may contain
     * FeedEntities with the same id. In case of a DIFFERENTIAL update the new
     * FeedEntity with some id will replace the old FeedEntity with the same id
     * (or delete it - see is_deleted below).
     * The actual GTFS entities (e.g. stations, routes, trips) referenced by the
     * feed must be specified by explicit selectors (see EntitySelector below for
     * more info).
     * </pre>
     */
    com.google.protobuf.ByteString getIdBytes();

    /**
     * <code>optional bool is_deleted = 2 [default = false];</code>
     *
     * <pre>
     * Whether this entity is to be deleted. Relevant only for incremental
     * fetches.
     * </pre>
     */
    boolean hasIsDeleted();

    /**
     * <code>optional bool is_deleted = 2 [default = false];</code>
     *
     * <pre>
     * Whether this entity is to be deleted. Relevant only for incremental
     * fetches.
     * </pre>
     */
    boolean getIsDeleted();

    /**
     * <code>optional .transit_realtime.TripUpdate trip_update = 3;</code>
     *
     * <pre>
     * Data about the entity itself. Exactly one of the following fields must be
     * present (unless the entity is being deleted).
     * </pre>
     */
    boolean hasTripUpdate();

    /**
     * <code>optional .transit_realtime.TripUpdate trip_update = 3;</code>
     *
     * <pre>
     * Data about the entity itself. Exactly one of the following fields must be
     * present (unless the entity is being deleted).
     * </pre>
     */
    com.google.transit.realtime.GtfsRealtime.TripUpdate getTripUpdate();

    /**
     * <code>optional .transit_realtime.TripUpdate trip_update = 3;</code>
     *
     * <pre>
     * Data about the entity itself. Exactly one of the following fields must be
     * present (unless the entity is being deleted).
     * </pre>
     */
    com.google.transit.realtime.GtfsRealtime.TripUpdateOrBuilder getTripUpdateOrBuilder();

    /**
     * <code>optional .transit_realtime.VehiclePosition vehicle = 4;</code>
     */
    boolean hasVehicle();

    /**
     * <code>optional .transit_realtime.VehiclePosition vehicle = 4;</code>
     */
    com.google.transit.realtime.GtfsRealtime.VehiclePosition getVehicle();

    /**
     * <code>optional .transit_realtime.VehiclePosition vehicle = 4;</code>
     */
    com.google.transit.realtime.GtfsRealtime.VehiclePositionOrBuilder getVehicleOrBuilder();

    /**
     * <code>optional .transit_realtime.Alert alert = 5;</code>
     */
    boolean hasAlert();

    /**
     * <code>optional .transit_realtime.Alert alert = 5;</code>
     */
    com.google.transit.realtime.GtfsRealtime.Alert getAlert();

    /**
     * <code>optional .transit_realtime.Alert alert = 5;</code>
     */
    com.google.transit.realtime.GtfsRealtime.AlertOrBuilder getAlertOrBuilder();
  }
  /**
   * Protobuf type {@code transit_realtime.FeedEntity}
   *
   * <pre>
   * A definition (or update) of an entity in the transit feed.
   * </pre>
   */
  public static final class FeedEntity
      extends com.google.protobuf.GeneratedMessage.ExtendableMessage<FeedEntity> implements
      // @@protoc_insertion_point(message_implements:transit_realtime.FeedEntity)
      FeedEntityOrBuilder {
    // Use FeedEntity.newBuilder() to construct.
    private FeedEntity(
        com.google.protobuf.GeneratedMessage.ExtendableBuilder<com.google.transit.realtime.GtfsRealtime.FeedEntity, ?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }

    private FeedEntity(boolean noInit) {
      this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }

    @JsonIgnore
    private static final FeedEntity defaultInstance;

    @JsonIgnore
    public static FeedEntity getDefaultInstance() {
      return defaultInstance;
    }

    @JsonIgnore
    @Override
    public FeedEntity getDefaultInstanceForType() {
      return defaultInstance;
    }

    @JsonIgnore
    private final com.google.protobuf.UnknownFieldSet unknownFields;

    @JsonIgnore
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private FeedEntity(com.google.protobuf.CodedInputStream input,
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
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000001;
              id_ = bs;
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              isDeleted_ = input.readBool();
              break;
            }
            case 26: {
              com.google.transit.realtime.GtfsRealtime.TripUpdate.Builder subBuilder = null;
              if (((bitField0_ & 0x00000004) == 0x00000004)) {
                subBuilder = tripUpdate_.toBuilder();
              }
              tripUpdate_ = input.readMessage(
                  com.google.transit.realtime.GtfsRealtime.TripUpdate.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(tripUpdate_);
                tripUpdate_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000004;
              break;
            }
            case 34: {
              com.google.transit.realtime.GtfsRealtime.VehiclePosition.Builder subBuilder = null;
              if (((bitField0_ & 0x00000008) == 0x00000008)) {
                subBuilder = vehicle_.toBuilder();
              }
              vehicle_ =
                  input.readMessage(com.google.transit.realtime.GtfsRealtime.VehiclePosition.PARSER,
                      extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(vehicle_);
                vehicle_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000008;
              break;
            }
            case 42: {
              com.google.transit.realtime.GtfsRealtime.Alert.Builder subBuilder = null;
              if (((bitField0_ & 0x00000010) == 0x00000010)) {
                subBuilder = alert_.toBuilder();
              }
              alert_ = input.readMessage(com.google.transit.realtime.GtfsRealtime.Alert.PARSER,
                  extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(alert_);
                alert_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000010;
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e.getMessage())
            .setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    @JsonIgnore
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_FeedEntity_descriptor;
    }

    @Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
      return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_FeedEntity_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.transit.realtime.GtfsRealtime.FeedEntity.class,
              com.google.transit.realtime.GtfsRealtime.FeedEntity.Builder.class);
    }

    @JsonIgnore
    public static com.google.protobuf.Parser<FeedEntity> PARSER =
        new com.google.protobuf.AbstractParser<FeedEntity>() {
          @Override
          public FeedEntity parsePartialFrom(com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new FeedEntity(input, extensionRegistry);
          }
        };

    @JsonIgnore
    @java.lang.Override
    public com.google.protobuf.Parser<FeedEntity> getParserForType() {
      return PARSER;
    }

    @JsonIgnore
    private int bitField0_;
    @JsonIgnore
    public static final int ID_FIELD_NUMBER = 1;
    @JsonIgnore
    private java.lang.Object id_;

    /**
     * <code>required string id = 1;</code>
     *
     * <pre>
     * The ids are used only to provide incrementality support. The id should be
     * unique within a FeedMessage. Consequent FeedMessages may contain
     * FeedEntities with the same id. In case of a DIFFERENTIAL update the new
     * FeedEntity with some id will replace the old FeedEntity with the same id
     * (or delete it - see is_deleted below).
     * The actual GTFS entities (e.g. stations, routes, trips) referenced by the
     * feed must be specified by explicit selectors (see EntitySelector below for
     * more info).
     * </pre>
     */
    @JsonIgnore
    @Override
    public boolean hasId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }

    /**
     * <code>required string id = 1;</code>
     *
     * <pre>
     * The ids are used only to provide incrementality support. The id should be
     * unique within a FeedMessage. Consequent FeedMessages may contain
     * FeedEntities with the same id. In case of a DIFFERENTIAL update the new
     * FeedEntity with some id will replace the old FeedEntity with the same id
     * (or delete it - see is_deleted below).
     * The actual GTFS entities (e.g. stations, routes, trips) referenced by the
     * feed must be specified by explicit selectors (see EntitySelector below for
     * more info).
     * </pre>
     */

    @Override
    public java.lang.String getId() {
      java.lang.Object ref = id_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          id_ = s;
        }
        return s;
      }
    }

    /**
     * <code>required string id = 1;</code>
     *
     * <pre>
     * The ids are used only to provide incrementality support. The id should be
     * unique within a FeedMessage. Consequent FeedMessages may contain
     * FeedEntities with the same id. In case of a DIFFERENTIAL update the new
     * FeedEntity with some id will replace the old FeedEntity with the same id
     * (or delete it - see is_deleted below).
     * The actual GTFS entities (e.g. stations, routes, trips) referenced by the
     * feed must be specified by explicit selectors (see EntitySelector below for
     * more info).
     * </pre>
     */
    @JsonIgnore
    @Override
    public com.google.protobuf.ByteString getIdBytes() {
      java.lang.Object ref = id_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        id_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int IS_DELETED_FIELD_NUMBER = 2;
    private boolean isDeleted_;

    /**
     * <code>optional bool is_deleted = 2 [default = false];</code>
     *
     * <pre>
     * Whether this entity is to be deleted. Relevant only for incremental
     * fetches.
     * </pre>
     */
    @JsonIgnore
    @Override
    public boolean hasIsDeleted() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }

    /**
     * <code>optional bool is_deleted = 2 [default = false];</code>
     *
     * <pre>
     * Whether this entity is to be deleted. Relevant only for incremental
     * fetches.
     * </pre>
     */
    @Override
    public boolean getIsDeleted() {
      return isDeleted_;
    }

    private String providerId;

    public boolean hasProviderId() {
      return providerId != null && !providerId.isEmpty();
    }

    public String getProviderId() {
      return providerId;
    }

    public void setProviderId(String providerId) {
      this.providerId = providerId;
    }

    @JsonIgnore
    public static final int TRIP_UPDATE_FIELD_NUMBER = 3;
    private com.google.transit.realtime.GtfsRealtime.TripUpdate tripUpdate_;

    /**
     * <code>optional .transit_realtime.TripUpdate trip_update = 3;</code>
     *
     * <pre>
     * Data about the entity itself. Exactly one of the following fields must be
     * present (unless the entity is being deleted).
     * </pre>
     */
    @JsonIgnore
    @Override
    public boolean hasTripUpdate() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }

    /**
     * <code>optional .transit_realtime.TripUpdate trip_update = 3;</code>
     *
     * <pre>
     * Data about the entity itself. Exactly one of the following fields must be
     * present (unless the entity is being deleted).
     * </pre>
     */
    @Override
    public com.google.transit.realtime.GtfsRealtime.TripUpdate getTripUpdate() {
      return tripUpdate_;
    }

    /**
     * <code>optional .transit_realtime.TripUpdate trip_update = 3;</code>
     *
     * <pre>
     * Data about the entity itself. Exactly one of the following fields must be
     * present (unless the entity is being deleted).
     * </pre>
     */
    @JsonIgnore
    @Override
    public com.google.transit.realtime.GtfsRealtime.TripUpdateOrBuilder getTripUpdateOrBuilder() {
      return tripUpdate_;
    }

    @JsonIgnore
    public static final int VEHICLE_FIELD_NUMBER = 4;
    @JsonIgnore
    private com.google.transit.realtime.GtfsRealtime.VehiclePosition vehicle_;

    /**
     * <code>optional .transit_realtime.VehiclePosition vehicle = 4;</code>
     */
    @JsonIgnore
    @Override
    public boolean hasVehicle() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }

    /**
     * <code>optional .transit_realtime.VehiclePosition vehicle = 4;</code>
     */
    @Override
    public com.google.transit.realtime.GtfsRealtime.VehiclePosition getVehicle() {
      return vehicle_;
    }

    /**
     * <code>optional .transit_realtime.VehiclePosition vehicle = 4;</code>
     */
    @JsonIgnore
    @Override
    public com.google.transit.realtime.GtfsRealtime.VehiclePositionOrBuilder getVehicleOrBuilder() {
      return vehicle_;
    }

    @JsonIgnore
    public static final int ALERT_FIELD_NUMBER = 5;
    @JsonIgnore
    private com.google.transit.realtime.GtfsRealtime.Alert alert_;

    /**
     * <code>optional .transit_realtime.Alert alert = 5;</code>
     */
    @JsonIgnore
    @Override
    public boolean hasAlert() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }

    /**
     * <code>optional .transit_realtime.Alert alert = 5;</code>
     */
    @Override
    public com.google.transit.realtime.GtfsRealtime.Alert getAlert() {
      return alert_;
    }

    /**
     * <code>optional .transit_realtime.Alert alert = 5;</code>
     */
    @JsonIgnore
    @Override
    public com.google.transit.realtime.GtfsRealtime.AlertOrBuilder getAlertOrBuilder() {
      return alert_;
    }

    @JsonIgnore
    private void initFields() {
      id_ = "";
      isDeleted_ = false;
      tripUpdate_ = com.google.transit.realtime.GtfsRealtime.TripUpdate.getDefaultInstance();
      vehicle_ = com.google.transit.realtime.GtfsRealtime.VehiclePosition.getDefaultInstance();
      alert_ = com.google.transit.realtime.GtfsRealtime.Alert.getDefaultInstance();
    }

    @JsonIgnore
    private byte memoizedIsInitialized = -1;

    @JsonIgnore
    @Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1)
        return true;
      if (isInitialized == 0)
        return false;

      if (!hasId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (hasTripUpdate()) {
        if (!getTripUpdate().isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      if (hasVehicle()) {
        if (!getVehicle().isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      if (hasAlert()) {
        if (!getAlert().isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      if (!extensionsAreInitialized()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    @Override
    @JsonIgnore
    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      getSerializedSize();
      com.google.protobuf.GeneratedMessage.ExtendableMessage<com.google.transit.realtime.GtfsRealtime.FeedEntity>.ExtensionWriter extensionWriter =
          newExtensionWriter();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getIdBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBool(2, isDeleted_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeMessage(3, tripUpdate_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeMessage(4, vehicle_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeMessage(5, alert_);
      }
      extensionWriter.writeUntil(2000, output);
      getUnknownFields().writeTo(output);
    }

    @JsonIgnore
    private int memoizedSerializedSize = -1;

    @JsonIgnore
    @Override
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1)
        return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream.computeBytesSize(1, getIdBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream.computeBoolSize(2, isDeleted_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, tripUpdate_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(4, vehicle_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(5, alert_);
      }
      size += extensionsSerializedSize();
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    @JsonIgnore
    private static final long serialVersionUID = 0L;

    @java.lang.Override
    @JsonIgnore
    protected java.lang.Object writeReplace() throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    @JsonIgnore
    public static com.google.transit.realtime.GtfsRealtime.FeedEntity parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    @JsonIgnore
    public static com.google.transit.realtime.GtfsRealtime.FeedEntity parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    @JsonIgnore
    public static com.google.transit.realtime.GtfsRealtime.FeedEntity parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    @JsonIgnore
    public static com.google.transit.realtime.GtfsRealtime.FeedEntity parseFrom(byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    @JsonIgnore
    public static com.google.transit.realtime.GtfsRealtime.FeedEntity parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return PARSER.parseFrom(input);
    }

    @JsonIgnore
    public static com.google.transit.realtime.GtfsRealtime.FeedEntity parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    @JsonIgnore
    public static com.google.transit.realtime.GtfsRealtime.FeedEntity parseDelimitedFrom(
        java.io.InputStream input) throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }

    @JsonIgnore
    public static com.google.transit.realtime.GtfsRealtime.FeedEntity parseDelimitedFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }

    @JsonIgnore
    public static com.google.transit.realtime.GtfsRealtime.FeedEntity parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return PARSER.parseFrom(input);
    }

    @JsonIgnore
    public static com.google.transit.realtime.GtfsRealtime.FeedEntity parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    @JsonIgnore
    public static Builder newBuilder() {
      return Builder.create();
    }

    @JsonIgnore
    @Override
    public Builder newBuilderForType() {
      return newBuilder();
    }

    @JsonIgnore
    public static Builder newBuilder(
        com.google.transit.realtime.GtfsRealtime.FeedEntity prototype) {
      return newBuilder().mergeFrom(prototype);
    }

    @JsonIgnore
    @Override
    public Builder toBuilder() {
      return newBuilder(this);
    }

    @JsonIgnore
    @java.lang.Override
    protected Builder newBuilderForType(com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }

    /**
     * Protobuf type {@code transit_realtime.FeedEntity}
     *
     * <pre>
     * A definition (or update) of an entity in the transit feed.
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.ExtendableBuilder<com.google.transit.realtime.GtfsRealtime.FeedEntity, Builder>
        implements
        // @@protoc_insertion_point(builder_implements:transit_realtime.FeedEntity)
        com.google.transit.realtime.GtfsRealtime.FeedEntityOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_FeedEntity_descriptor;
      }

      @Override
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
        return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_FeedEntity_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.google.transit.realtime.GtfsRealtime.FeedEntity.class,
                com.google.transit.realtime.GtfsRealtime.FeedEntity.Builder.class);
      }

      // Construct using com.google.transit.realtime.GtfsRealtime.FeedEntity.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getTripUpdateFieldBuilder();
          getVehicleFieldBuilder();
          getAlertFieldBuilder();
        }
      }

      private static Builder create() {
        return new Builder();
      }

      @Override
      public Builder clear() {
        super.clear();
        id_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        isDeleted_ = false;
        bitField0_ = (bitField0_ & ~0x00000002);
        if (tripUpdateBuilder_ == null) {
          tripUpdate_ = com.google.transit.realtime.GtfsRealtime.TripUpdate.getDefaultInstance();
        } else {
          tripUpdateBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        if (vehicleBuilder_ == null) {
          vehicle_ = com.google.transit.realtime.GtfsRealtime.VehiclePosition.getDefaultInstance();
        } else {
          vehicleBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000008);
        if (alertBuilder_ == null) {
          alert_ = com.google.transit.realtime.GtfsRealtime.Alert.getDefaultInstance();
        } else {
          alertBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000010);
        return this;
      }

      @Override
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_FeedEntity_descriptor;
      }

      @Override
      public com.google.transit.realtime.GtfsRealtime.FeedEntity getDefaultInstanceForType() {
        return com.google.transit.realtime.GtfsRealtime.FeedEntity.getDefaultInstance();
      }

      @Override
      public com.google.transit.realtime.GtfsRealtime.FeedEntity build() {
        com.google.transit.realtime.GtfsRealtime.FeedEntity result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public com.google.transit.realtime.GtfsRealtime.FeedEntity buildPartial() {
        com.google.transit.realtime.GtfsRealtime.FeedEntity result =
            new com.google.transit.realtime.GtfsRealtime.FeedEntity(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.id_ = id_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.isDeleted_ = isDeleted_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        if (tripUpdateBuilder_ == null) {
          result.tripUpdate_ = tripUpdate_;
        } else {
          result.tripUpdate_ = tripUpdateBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        if (vehicleBuilder_ == null) {
          result.vehicle_ = vehicle_;
        } else {
          result.vehicle_ = vehicleBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        if (alertBuilder_ == null) {
          result.alert_ = alert_;
        } else {
          result.alert_ = alertBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.google.transit.realtime.GtfsRealtime.FeedEntity) {
          return mergeFrom((com.google.transit.realtime.GtfsRealtime.FeedEntity) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.google.transit.realtime.GtfsRealtime.FeedEntity other) {
        if (other == com.google.transit.realtime.GtfsRealtime.FeedEntity.getDefaultInstance())
          return this;
        if (other.hasId()) {
          bitField0_ |= 0x00000001;
          id_ = other.id_;
          onChanged();
        }
        if (other.hasIsDeleted()) {
          setIsDeleted(other.getIsDeleted());
        }
        if (other.hasTripUpdate()) {
          mergeTripUpdate(other.getTripUpdate());
        }
        if (other.hasVehicle()) {
          mergeVehicle(other.getVehicle());
        }
        if (other.hasAlert()) {
          mergeAlert(other.getAlert());
        }
        this.mergeExtensionFields(other);
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      @Override
      public final boolean isInitialized() {
        if (!hasId()) {

          return false;
        }
        if (hasTripUpdate()) {
          if (!getTripUpdate().isInitialized()) {

            return false;
          }
        }
        if (hasVehicle()) {
          if (!getVehicle().isInitialized()) {

            return false;
          }
        }
        if (hasAlert()) {
          if (!getAlert().isInitialized()) {

            return false;
          }
        }
        if (!extensionsAreInitialized()) {

          return false;
        }
        return true;
      }

      @Override
      public Builder mergeFrom(com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        com.google.transit.realtime.GtfsRealtime.FeedEntity parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (com.google.transit.realtime.GtfsRealtime.FeedEntity) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private java.lang.Object id_ = "";

      /**
       * <code>required string id = 1;</code>
       *
       * <pre>
       * The ids are used only to provide incrementality support. The id should be
       * unique within a FeedMessage. Consequent FeedMessages may contain
       * FeedEntities with the same id. In case of a DIFFERENTIAL update the new
       * FeedEntity with some id will replace the old FeedEntity with the same id
       * (or delete it - see is_deleted below).
       * The actual GTFS entities (e.g. stations, routes, trips) referenced by the
       * feed must be specified by explicit selectors (see EntitySelector below for
       * more info).
       * </pre>
       */
      @Override
      public boolean hasId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }

      /**
       * <code>required string id = 1;</code>
       *
       * <pre>
       * The ids are used only to provide incrementality support. The id should be
       * unique within a FeedMessage. Consequent FeedMessages may contain
       * FeedEntities with the same id. In case of a DIFFERENTIAL update the new
       * FeedEntity with some id will replace the old FeedEntity with the same id
       * (or delete it - see is_deleted below).
       * The actual GTFS entities (e.g. stations, routes, trips) referenced by the
       * feed must be specified by explicit selectors (see EntitySelector below for
       * more info).
       * </pre>
       */
      @Override
      public java.lang.String getId() {
        java.lang.Object ref = id_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            id_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }

      /**
       * <code>required string id = 1;</code>
       *
       * <pre>
       * The ids are used only to provide incrementality support. The id should be
       * unique within a FeedMessage. Consequent FeedMessages may contain
       * FeedEntities with the same id. In case of a DIFFERENTIAL update the new
       * FeedEntity with some id will replace the old FeedEntity with the same id
       * (or delete it - see is_deleted below).
       * The actual GTFS entities (e.g. stations, routes, trips) referenced by the
       * feed must be specified by explicit selectors (see EntitySelector below for
       * more info).
       * </pre>
       */
      @Override
      public com.google.protobuf.ByteString getIdBytes() {
        java.lang.Object ref = id_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          id_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }

      /**
       * <code>required string id = 1;</code>
       *
       * <pre>
       * The ids are used only to provide incrementality support. The id should be
       * unique within a FeedMessage. Consequent FeedMessages may contain
       * FeedEntities with the same id. In case of a DIFFERENTIAL update the new
       * FeedEntity with some id will replace the old FeedEntity with the same id
       * (or delete it - see is_deleted below).
       * The actual GTFS entities (e.g. stations, routes, trips) referenced by the
       * feed must be specified by explicit selectors (see EntitySelector below for
       * more info).
       * </pre>
       */
      public Builder setId(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        id_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>required string id = 1;</code>
       *
       * <pre>
       * The ids are used only to provide incrementality support. The id should be
       * unique within a FeedMessage. Consequent FeedMessages may contain
       * FeedEntities with the same id. In case of a DIFFERENTIAL update the new
       * FeedEntity with some id will replace the old FeedEntity with the same id
       * (or delete it - see is_deleted below).
       * The actual GTFS entities (e.g. stations, routes, trips) referenced by the
       * feed must be specified by explicit selectors (see EntitySelector below for
       * more info).
       * </pre>
       */
      public Builder clearId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        id_ = getDefaultInstance().getId();
        onChanged();
        return this;
      }

      /**
       * <code>required string id = 1;</code>
       *
       * <pre>
       * The ids are used only to provide incrementality support. The id should be
       * unique within a FeedMessage. Consequent FeedMessages may contain
       * FeedEntities with the same id. In case of a DIFFERENTIAL update the new
       * FeedEntity with some id will replace the old FeedEntity with the same id
       * (or delete it - see is_deleted below).
       * The actual GTFS entities (e.g. stations, routes, trips) referenced by the
       * feed must be specified by explicit selectors (see EntitySelector below for
       * more info).
       * </pre>
       */
      public Builder setIdBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        id_ = value;
        onChanged();
        return this;
      }

      private boolean isDeleted_;

      /**
       * <code>optional bool is_deleted = 2 [default = false];</code>
       *
       * <pre>
       * Whether this entity is to be deleted. Relevant only for incremental
       * fetches.
       * </pre>
       */
      @Override
      public boolean hasIsDeleted() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }

      /**
       * <code>optional bool is_deleted = 2 [default = false];</code>
       *
       * <pre>
       * Whether this entity is to be deleted. Relevant only for incremental
       * fetches.
       * </pre>
       */
      @Override
      public boolean getIsDeleted() {
        return isDeleted_;
      }

      /**
       * <code>optional bool is_deleted = 2 [default = false];</code>
       *
       * <pre>
       * Whether this entity is to be deleted. Relevant only for incremental
       * fetches.
       * </pre>
       */
      public Builder setIsDeleted(boolean value) {
        bitField0_ |= 0x00000002;
        isDeleted_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>optional bool is_deleted = 2 [default = false];</code>
       *
       * <pre>
       * Whether this entity is to be deleted. Relevant only for incremental
       * fetches.
       * </pre>
       */
      public Builder clearIsDeleted() {
        bitField0_ = (bitField0_ & ~0x00000002);
        isDeleted_ = false;
        onChanged();
        return this;
      }

      private com.google.transit.realtime.GtfsRealtime.TripUpdate tripUpdate_ =
          com.google.transit.realtime.GtfsRealtime.TripUpdate.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<com.google.transit.realtime.GtfsRealtime.TripUpdate, com.google.transit.realtime.GtfsRealtime.TripUpdate.Builder, com.google.transit.realtime.GtfsRealtime.TripUpdateOrBuilder> tripUpdateBuilder_;

      /**
       * <code>optional .transit_realtime.TripUpdate trip_update = 3;</code>
       *
       * <pre>
       * Data about the entity itself. Exactly one of the following fields must be
       * present (unless the entity is being deleted).
       * </pre>
       */
      @Override
      public boolean hasTripUpdate() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }

      /**
       * <code>optional .transit_realtime.TripUpdate trip_update = 3;</code>
       *
       * <pre>
       * Data about the entity itself. Exactly one of the following fields must be
       * present (unless the entity is being deleted).
       * </pre>
       */
      @Override
      public com.google.transit.realtime.GtfsRealtime.TripUpdate getTripUpdate() {
        if (tripUpdateBuilder_ == null) {
          return tripUpdate_;
        } else {
          return tripUpdateBuilder_.getMessage();
        }
      }

      /**
       * <code>optional .transit_realtime.TripUpdate trip_update = 3;</code>
       *
       * <pre>
       * Data about the entity itself. Exactly one of the following fields must be
       * present (unless the entity is being deleted).
       * </pre>
       */
      public Builder setTripUpdate(com.google.transit.realtime.GtfsRealtime.TripUpdate value) {
        if (tripUpdateBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          tripUpdate_ = value;
          onChanged();
        } else {
          tripUpdateBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }

      /**
       * <code>optional .transit_realtime.TripUpdate trip_update = 3;</code>
       *
       * <pre>
       * Data about the entity itself. Exactly one of the following fields must be
       * present (unless the entity is being deleted).
       * </pre>
       */
      public Builder setTripUpdate(
          com.google.transit.realtime.GtfsRealtime.TripUpdate.Builder builderForValue) {
        if (tripUpdateBuilder_ == null) {
          tripUpdate_ = builderForValue.build();
          onChanged();
        } else {
          tripUpdateBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000004;
        return this;
      }

      /**
       * <code>optional .transit_realtime.TripUpdate trip_update = 3;</code>
       *
       * <pre>
       * Data about the entity itself. Exactly one of the following fields must be
       * present (unless the entity is being deleted).
       * </pre>
       */
      public Builder mergeTripUpdate(com.google.transit.realtime.GtfsRealtime.TripUpdate value) {
        if (tripUpdateBuilder_ == null) {
          if (((bitField0_ & 0x00000004) == 0x00000004)
              && tripUpdate_ != com.google.transit.realtime.GtfsRealtime.TripUpdate
                  .getDefaultInstance()) {
            tripUpdate_ = com.google.transit.realtime.GtfsRealtime.TripUpdate
                .newBuilder(tripUpdate_).mergeFrom(value).buildPartial();
          } else {
            tripUpdate_ = value;
          }
          onChanged();
        } else {
          tripUpdateBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }

      /**
       * <code>optional .transit_realtime.TripUpdate trip_update = 3;</code>
       *
       * <pre>
       * Data about the entity itself. Exactly one of the following fields must be
       * present (unless the entity is being deleted).
       * </pre>
       */
      public Builder clearTripUpdate() {
        if (tripUpdateBuilder_ == null) {
          tripUpdate_ = com.google.transit.realtime.GtfsRealtime.TripUpdate.getDefaultInstance();
          onChanged();
        } else {
          tripUpdateBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      /**
       * <code>optional .transit_realtime.TripUpdate trip_update = 3;</code>
       *
       * <pre>
       * Data about the entity itself. Exactly one of the following fields must be
       * present (unless the entity is being deleted).
       * </pre>
       */
      public com.google.transit.realtime.GtfsRealtime.TripUpdate.Builder getTripUpdateBuilder() {
        bitField0_ |= 0x00000004;
        onChanged();
        return getTripUpdateFieldBuilder().getBuilder();
      }

      /**
       * <code>optional .transit_realtime.TripUpdate trip_update = 3;</code>
       *
       * <pre>
       * Data about the entity itself. Exactly one of the following fields must be
       * present (unless the entity is being deleted).
       * </pre>
       */
      @Override
      public com.google.transit.realtime.GtfsRealtime.TripUpdateOrBuilder getTripUpdateOrBuilder() {
        if (tripUpdateBuilder_ != null) {
          return tripUpdateBuilder_.getMessageOrBuilder();
        } else {
          return tripUpdate_;
        }
      }

      /**
       * <code>optional .transit_realtime.TripUpdate trip_update = 3;</code>
       *
       * <pre>
       * Data about the entity itself. Exactly one of the following fields must be
       * present (unless the entity is being deleted).
       * </pre>
       */
      private com.google.protobuf.SingleFieldBuilder<com.google.transit.realtime.GtfsRealtime.TripUpdate, com.google.transit.realtime.GtfsRealtime.TripUpdate.Builder, com.google.transit.realtime.GtfsRealtime.TripUpdateOrBuilder> getTripUpdateFieldBuilder() {
        if (tripUpdateBuilder_ == null) {
          tripUpdateBuilder_ =
              new com.google.protobuf.SingleFieldBuilder<com.google.transit.realtime.GtfsRealtime.TripUpdate, com.google.transit.realtime.GtfsRealtime.TripUpdate.Builder, com.google.transit.realtime.GtfsRealtime.TripUpdateOrBuilder>(
                  getTripUpdate(), getParentForChildren(), isClean());
          tripUpdate_ = null;
        }
        return tripUpdateBuilder_;
      }

      private com.google.transit.realtime.GtfsRealtime.VehiclePosition vehicle_ =
          com.google.transit.realtime.GtfsRealtime.VehiclePosition.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<com.google.transit.realtime.GtfsRealtime.VehiclePosition, com.google.transit.realtime.GtfsRealtime.VehiclePosition.Builder, com.google.transit.realtime.GtfsRealtime.VehiclePositionOrBuilder> vehicleBuilder_;

      /**
       * <code>optional .transit_realtime.VehiclePosition vehicle = 4;</code>
       */
      @Override
      public boolean hasVehicle() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }

      /**
       * <code>optional .transit_realtime.VehiclePosition vehicle = 4;</code>
       */
      @Override
      public com.google.transit.realtime.GtfsRealtime.VehiclePosition getVehicle() {
        if (vehicleBuilder_ == null) {
          return vehicle_;
        } else {
          return vehicleBuilder_.getMessage();
        }
      }

      /**
       * <code>optional .transit_realtime.VehiclePosition vehicle = 4;</code>
       */
      public Builder setVehicle(com.google.transit.realtime.GtfsRealtime.VehiclePosition value) {
        if (vehicleBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          vehicle_ = value;
          onChanged();
        } else {
          vehicleBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000008;
        return this;
      }

      /**
       * <code>optional .transit_realtime.VehiclePosition vehicle = 4;</code>
       */
      public Builder setVehicle(
          com.google.transit.realtime.GtfsRealtime.VehiclePosition.Builder builderForValue) {
        if (vehicleBuilder_ == null) {
          vehicle_ = builderForValue.build();
          onChanged();
        } else {
          vehicleBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000008;
        return this;
      }

      /**
       * <code>optional .transit_realtime.VehiclePosition vehicle = 4;</code>
       */
      public Builder mergeVehicle(com.google.transit.realtime.GtfsRealtime.VehiclePosition value) {
        if (vehicleBuilder_ == null) {
          if (((bitField0_ & 0x00000008) == 0x00000008)
              && vehicle_ != com.google.transit.realtime.GtfsRealtime.VehiclePosition
                  .getDefaultInstance()) {
            vehicle_ = com.google.transit.realtime.GtfsRealtime.VehiclePosition.newBuilder(vehicle_)
                .mergeFrom(value).buildPartial();
          } else {
            vehicle_ = value;
          }
          onChanged();
        } else {
          vehicleBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000008;
        return this;
      }

      /**
       * <code>optional .transit_realtime.VehiclePosition vehicle = 4;</code>
       */
      public Builder clearVehicle() {
        if (vehicleBuilder_ == null) {
          vehicle_ = com.google.transit.realtime.GtfsRealtime.VehiclePosition.getDefaultInstance();
          onChanged();
        } else {
          vehicleBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }

      /**
       * <code>optional .transit_realtime.VehiclePosition vehicle = 4;</code>
       */
      public com.google.transit.realtime.GtfsRealtime.VehiclePosition.Builder getVehicleBuilder() {
        bitField0_ |= 0x00000008;
        onChanged();
        return getVehicleFieldBuilder().getBuilder();
      }

      /**
       * <code>optional .transit_realtime.VehiclePosition vehicle = 4;</code>
       */
      @Override
      public com.google.transit.realtime.GtfsRealtime.VehiclePositionOrBuilder getVehicleOrBuilder() {
        if (vehicleBuilder_ != null) {
          return vehicleBuilder_.getMessageOrBuilder();
        } else {
          return vehicle_;
        }
      }

      /**
       * <code>optional .transit_realtime.VehiclePosition vehicle = 4;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<com.google.transit.realtime.GtfsRealtime.VehiclePosition, com.google.transit.realtime.GtfsRealtime.VehiclePosition.Builder, com.google.transit.realtime.GtfsRealtime.VehiclePositionOrBuilder> getVehicleFieldBuilder() {
        if (vehicleBuilder_ == null) {
          vehicleBuilder_ =
              new com.google.protobuf.SingleFieldBuilder<com.google.transit.realtime.GtfsRealtime.VehiclePosition, com.google.transit.realtime.GtfsRealtime.VehiclePosition.Builder, com.google.transit.realtime.GtfsRealtime.VehiclePositionOrBuilder>(
                  getVehicle(), getParentForChildren(), isClean());
          vehicle_ = null;
        }
        return vehicleBuilder_;
      }

      private com.google.transit.realtime.GtfsRealtime.Alert alert_ =
          com.google.transit.realtime.GtfsRealtime.Alert.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<com.google.transit.realtime.GtfsRealtime.Alert, com.google.transit.realtime.GtfsRealtime.Alert.Builder, com.google.transit.realtime.GtfsRealtime.AlertOrBuilder> alertBuilder_;

      /**
       * <code>optional .transit_realtime.Alert alert = 5;</code>
       */
      @Override
      public boolean hasAlert() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }

      /**
       * <code>optional .transit_realtime.Alert alert = 5;</code>
       */
      @Override
      public com.google.transit.realtime.GtfsRealtime.Alert getAlert() {
        if (alertBuilder_ == null) {
          return alert_;
        } else {
          return alertBuilder_.getMessage();
        }
      }

      /**
       * <code>optional .transit_realtime.Alert alert = 5;</code>
       */
      public Builder setAlert(com.google.transit.realtime.GtfsRealtime.Alert value) {
        if (alertBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          alert_ = value;
          onChanged();
        } else {
          alertBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000010;
        return this;
      }

      /**
       * <code>optional .transit_realtime.Alert alert = 5;</code>
       */
      public Builder setAlert(
          com.google.transit.realtime.GtfsRealtime.Alert.Builder builderForValue) {
        if (alertBuilder_ == null) {
          alert_ = builderForValue.build();
          onChanged();
        } else {
          alertBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000010;
        return this;
      }

      /**
       * <code>optional .transit_realtime.Alert alert = 5;</code>
       */
      public Builder mergeAlert(com.google.transit.realtime.GtfsRealtime.Alert value) {
        if (alertBuilder_ == null) {
          if (((bitField0_ & 0x00000010) == 0x00000010)
              && alert_ != com.google.transit.realtime.GtfsRealtime.Alert.getDefaultInstance()) {
            alert_ = com.google.transit.realtime.GtfsRealtime.Alert.newBuilder(alert_)
                .mergeFrom(value).buildPartial();
          } else {
            alert_ = value;
          }
          onChanged();
        } else {
          alertBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000010;
        return this;
      }

      /**
       * <code>optional .transit_realtime.Alert alert = 5;</code>
       */
      public Builder clearAlert() {
        if (alertBuilder_ == null) {
          alert_ = com.google.transit.realtime.GtfsRealtime.Alert.getDefaultInstance();
          onChanged();
        } else {
          alertBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000010);
        return this;
      }

      /**
       * <code>optional .transit_realtime.Alert alert = 5;</code>
       */
      public com.google.transit.realtime.GtfsRealtime.Alert.Builder getAlertBuilder() {
        bitField0_ |= 0x00000010;
        onChanged();
        return getAlertFieldBuilder().getBuilder();
      }

      /**
       * <code>optional .transit_realtime.Alert alert = 5;</code>
       */
      @Override
      public com.google.transit.realtime.GtfsRealtime.AlertOrBuilder getAlertOrBuilder() {
        if (alertBuilder_ != null) {
          return alertBuilder_.getMessageOrBuilder();
        } else {
          return alert_;
        }
      }

      /**
       * <code>optional .transit_realtime.Alert alert = 5;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<com.google.transit.realtime.GtfsRealtime.Alert, com.google.transit.realtime.GtfsRealtime.Alert.Builder, com.google.transit.realtime.GtfsRealtime.AlertOrBuilder> getAlertFieldBuilder() {
        if (alertBuilder_ == null) {
          alertBuilder_ =
              new com.google.protobuf.SingleFieldBuilder<com.google.transit.realtime.GtfsRealtime.Alert, com.google.transit.realtime.GtfsRealtime.Alert.Builder, com.google.transit.realtime.GtfsRealtime.AlertOrBuilder>(
                  getAlert(), getParentForChildren(), isClean());
          alert_ = null;
        }
        return alertBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:transit_realtime.FeedEntity)
    }

    static {
      defaultInstance = new FeedEntity(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:transit_realtime.FeedEntity)
  }

  public interface TripUpdateOrBuilder extends
      // @@protoc_insertion_point(interface_extends:transit_realtime.TripUpdate)
      com.google.protobuf.GeneratedMessage.ExtendableMessageOrBuilder<TripUpdate> {

    /**
     * <code>required .transit_realtime.TripDescriptor trip = 1;</code>
     *
     * <pre>
     * The Trip that this message applies to. There can be at most one
     * TripUpdate entity for each actual trip instance.
     * If there is none, that means there is no prediction information available.
     * It does *not* mean that the trip is progressing according to schedule.
     * </pre>
     */
    boolean hasTrip();

    /**
     * <code>required .transit_realtime.TripDescriptor trip = 1;</code>
     *
     * <pre>
     * The Trip that this message applies to. There can be at most one
     * TripUpdate entity for each actual trip instance.
     * If there is none, that means there is no prediction information available.
     * It does *not* mean that the trip is progressing according to schedule.
     * </pre>
     */
    com.google.transit.realtime.GtfsRealtime.TripDescriptor getTrip();

    /**
     * <code>required .transit_realtime.TripDescriptor trip = 1;</code>
     *
     * <pre>
     * The Trip that this message applies to. There can be at most one
     * TripUpdate entity for each actual trip instance.
     * If there is none, that means there is no prediction information available.
     * It does *not* mean that the trip is progressing according to schedule.
     * </pre>
     */
    com.google.transit.realtime.GtfsRealtime.TripDescriptorOrBuilder getTripOrBuilder();

    /**
     * <code>optional .transit_realtime.VehicleDescriptor vehicle = 3;</code>
     *
     * <pre>
     * Additional information on the vehicle that is serving this trip.
     * </pre>
     */
    boolean hasVehicle();

    /**
     * <code>optional .transit_realtime.VehicleDescriptor vehicle = 3;</code>
     *
     * <pre>
     * Additional information on the vehicle that is serving this trip.
     * </pre>
     */
    com.google.transit.realtime.GtfsRealtime.VehicleDescriptor getVehicle();

    /**
     * <code>optional .transit_realtime.VehicleDescriptor vehicle = 3;</code>
     *
     * <pre>
     * Additional information on the vehicle that is serving this trip.
     * </pre>
     */
    com.google.transit.realtime.GtfsRealtime.VehicleDescriptorOrBuilder getVehicleOrBuilder();

    /**
     * <code>repeated .transit_realtime.TripUpdate.StopTimeUpdate stop_time_update = 2;</code>
     *
     * <pre>
     * Updates to StopTimes for the trip (both future, i.e., predictions, and in
     * some cases, past ones, i.e., those that already happened).
     * The updates must be sorted by stop_sequence, and apply for all the
     * following stops of the trip up to the next specified one.
     * Example 1:
     * For a trip with 20 stops, a StopTimeUpdate with arrival delay and departure
     * delay of 0 for stop_sequence of the current stop means that the trip is
     * exactly on time.
     * Example 2:
     * For the same trip instance, 3 StopTimeUpdates are provided:
     * - delay of 5 min for stop_sequence 3
     * - delay of 1 min for stop_sequence 8
     * - delay of unspecified duration for stop_sequence 10
     * This will be interpreted as:
     * - stop_sequences 3,4,5,6,7 have delay of 5 min.
     * - stop_sequences 8,9 have delay of 1 min.
     * - stop_sequences 10,... have unknown delay.
     * </pre>
     */
    java.util.List<com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate> getStopTimeUpdateList();

    /**
     * <code>repeated .transit_realtime.TripUpdate.StopTimeUpdate stop_time_update = 2;</code>
     *
     * <pre>
     * Updates to StopTimes for the trip (both future, i.e., predictions, and in
     * some cases, past ones, i.e., those that already happened).
     * The updates must be sorted by stop_sequence, and apply for all the
     * following stops of the trip up to the next specified one.
     * Example 1:
     * For a trip with 20 stops, a StopTimeUpdate with arrival delay and departure
     * delay of 0 for stop_sequence of the current stop means that the trip is
     * exactly on time.
     * Example 2:
     * For the same trip instance, 3 StopTimeUpdates are provided:
     * - delay of 5 min for stop_sequence 3
     * - delay of 1 min for stop_sequence 8
     * - delay of unspecified duration for stop_sequence 10
     * This will be interpreted as:
     * - stop_sequences 3,4,5,6,7 have delay of 5 min.
     * - stop_sequences 8,9 have delay of 1 min.
     * - stop_sequences 10,... have unknown delay.
     * </pre>
     */
    com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate getStopTimeUpdate(int index);

    /**
     * <code>repeated .transit_realtime.TripUpdate.StopTimeUpdate stop_time_update = 2;</code>
     *
     * <pre>
     * Updates to StopTimes for the trip (both future, i.e., predictions, and in
     * some cases, past ones, i.e., those that already happened).
     * The updates must be sorted by stop_sequence, and apply for all the
     * following stops of the trip up to the next specified one.
     * Example 1:
     * For a trip with 20 stops, a StopTimeUpdate with arrival delay and departure
     * delay of 0 for stop_sequence of the current stop means that the trip is
     * exactly on time.
     * Example 2:
     * For the same trip instance, 3 StopTimeUpdates are provided:
     * - delay of 5 min for stop_sequence 3
     * - delay of 1 min for stop_sequence 8
     * - delay of unspecified duration for stop_sequence 10
     * This will be interpreted as:
     * - stop_sequences 3,4,5,6,7 have delay of 5 min.
     * - stop_sequences 8,9 have delay of 1 min.
     * - stop_sequences 10,... have unknown delay.
     * </pre>
     */
    int getStopTimeUpdateCount();

    /**
     * <code>repeated .transit_realtime.TripUpdate.StopTimeUpdate stop_time_update = 2;</code>
     *
     * <pre>
     * Updates to StopTimes for the trip (both future, i.e., predictions, and in
     * some cases, past ones, i.e., those that already happened).
     * The updates must be sorted by stop_sequence, and apply for all the
     * following stops of the trip up to the next specified one.
     * Example 1:
     * For a trip with 20 stops, a StopTimeUpdate with arrival delay and departure
     * delay of 0 for stop_sequence of the current stop means that the trip is
     * exactly on time.
     * Example 2:
     * For the same trip instance, 3 StopTimeUpdates are provided:
     * - delay of 5 min for stop_sequence 3
     * - delay of 1 min for stop_sequence 8
     * - delay of unspecified duration for stop_sequence 10
     * This will be interpreted as:
     * - stop_sequences 3,4,5,6,7 have delay of 5 min.
     * - stop_sequences 8,9 have delay of 1 min.
     * - stop_sequences 10,... have unknown delay.
     * </pre>
     */
    java.util.List<? extends com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdateOrBuilder> getStopTimeUpdateOrBuilderList();

    /**
     * <code>repeated .transit_realtime.TripUpdate.StopTimeUpdate stop_time_update = 2;</code>
     *
     * <pre>
     * Updates to StopTimes for the trip (both future, i.e., predictions, and in
     * some cases, past ones, i.e., those that already happened).
     * The updates must be sorted by stop_sequence, and apply for all the
     * following stops of the trip up to the next specified one.
     * Example 1:
     * For a trip with 20 stops, a StopTimeUpdate with arrival delay and departure
     * delay of 0 for stop_sequence of the current stop means that the trip is
     * exactly on time.
     * Example 2:
     * For the same trip instance, 3 StopTimeUpdates are provided:
     * - delay of 5 min for stop_sequence 3
     * - delay of 1 min for stop_sequence 8
     * - delay of unspecified duration for stop_sequence 10
     * This will be interpreted as:
     * - stop_sequences 3,4,5,6,7 have delay of 5 min.
     * - stop_sequences 8,9 have delay of 1 min.
     * - stop_sequences 10,... have unknown delay.
     * </pre>
     */
    com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdateOrBuilder getStopTimeUpdateOrBuilder(
        int index);

    /**
     * <code>optional uint64 timestamp = 4;</code>
     *
     * <pre>
     * Moment at which the vehicle's real-time progress was measured. In POSIX
     * time (i.e., the number of seconds since January 1st 1970 00:00:00 UTC).
     * </pre>
     */
    boolean hasTimestamp();

    /**
     * <code>optional uint64 timestamp = 4;</code>
     *
     * <pre>
     * Moment at which the vehicle's real-time progress was measured. In POSIX
     * time (i.e., the number of seconds since January 1st 1970 00:00:00 UTC).
     * </pre>
     */
    long getTimestamp();

    /**
     * <code>optional int32 delay = 5;</code>
     *
     * <pre>
     * The current schedule deviation for the trip.  Delay should only be
     * specified when the prediction is given relative to some existing schedule
     * in GTFS.
     * Delay (in seconds) can be positive (meaning that the vehicle is late) or
     * negative (meaning that the vehicle is ahead of schedule). Delay of 0
     * means that the vehicle is exactly on time.
     * Delay information in StopTimeUpdates take precedent of trip-level delay
     * information, such that trip-level delay is only propagated until the next
     * stop along the trip with a StopTimeUpdate delay value specified.
     * Feed providers are strongly encouraged to provide a TripUpdate.timestamp
     * value indicating when the delay value was last updated, in order to
     * evaluate the freshness of the data.
     * NOTE: This field is still experimental, and subject to change. It may be
     * formally adopted in the future.
     * </pre>
     */
    boolean hasDelay();

    /**
     * <code>optional int32 delay = 5;</code>
     *
     * <pre>
     * The current schedule deviation for the trip.  Delay should only be
     * specified when the prediction is given relative to some existing schedule
     * in GTFS.
     * Delay (in seconds) can be positive (meaning that the vehicle is late) or
     * negative (meaning that the vehicle is ahead of schedule). Delay of 0
     * means that the vehicle is exactly on time.
     * Delay information in StopTimeUpdates take precedent of trip-level delay
     * information, such that trip-level delay is only propagated until the next
     * stop along the trip with a StopTimeUpdate delay value specified.
     * Feed providers are strongly encouraged to provide a TripUpdate.timestamp
     * value indicating when the delay value was last updated, in order to
     * evaluate the freshness of the data.
     * NOTE: This field is still experimental, and subject to change. It may be
     * formally adopted in the future.
     * </pre>
     */
    int getDelay();
  }
  /**
   * Protobuf type {@code transit_realtime.TripUpdate}
   *
   * <pre>
   * Realtime update of the progress of a vehicle along a trip.
   * Depending on the value of ScheduleRelationship, a TripUpdate can specify:
   * - A trip that proceeds along the schedule.
   * - A trip that proceeds along a route but has no fixed schedule.
   * - A trip that have been added or removed with regard to schedule.
   * The updates can be for future, predicted arrival/departure events, or for
   * past events that already occurred.
   * Normally, updates should get more precise and more certain (see
   * uncertainty below) as the events gets closer to current time.
   * Even if that is not possible, the information for past events should be
   * precise and certain. In particular, if an update points to time in the past
   * but its update's uncertainty is not 0, the client should conclude that the
   * update is a (wrong) prediction and that the trip has not completed yet.
   * Note that the update can describe a trip that is already completed.
   * To this end, it is enough to provide an update for the last stop of the trip.
   * If the time of that is in the past, the client will conclude from that that
   * the whole trip is in the past (it is possible, although inconsequential, to
   * also provide updates for preceding stops).
   * This option is most relevant for a trip that has completed ahead of schedule,
   * but according to the schedule, the trip is still proceeding at the current
   * time. Removing the updates for this trip could make the client assume
   * that the trip is still proceeding.
   * Note that the feed provider is allowed, but not required, to purge past
   * updates - this is one case where this would be practically useful.
   * </pre>
   */
  public static final class TripUpdate
      extends com.google.protobuf.GeneratedMessage.ExtendableMessage<TripUpdate> implements
      // @@protoc_insertion_point(message_implements:transit_realtime.TripUpdate)
      TripUpdateOrBuilder {
    // Use TripUpdate.newBuilder() to construct.
    private TripUpdate(
        com.google.protobuf.GeneratedMessage.ExtendableBuilder<com.google.transit.realtime.GtfsRealtime.TripUpdate, ?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }

    private TripUpdate(boolean noInit) {
      this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }

    private static final TripUpdate defaultInstance;

    public static TripUpdate getDefaultInstance() {
      return defaultInstance;
    }

    @Override
    public TripUpdate getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private TripUpdate(com.google.protobuf.CodedInputStream input,
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
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              com.google.transit.realtime.GtfsRealtime.TripDescriptor.Builder subBuilder = null;
              if (((bitField0_ & 0x00000001) == 0x00000001)) {
                subBuilder = trip_.toBuilder();
              }
              trip_ =
                  input.readMessage(com.google.transit.realtime.GtfsRealtime.TripDescriptor.PARSER,
                      extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(trip_);
                trip_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000001;
              break;
            }
            case 18: {
              if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
                stopTimeUpdate_ =
                    new java.util.ArrayList<com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate>();
                mutable_bitField0_ |= 0x00000004;
              }
              stopTimeUpdate_.add(input.readMessage(
                  com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate.PARSER,
                  extensionRegistry));
              break;
            }
            case 26: {
              com.google.transit.realtime.GtfsRealtime.VehicleDescriptor.Builder subBuilder = null;
              if (((bitField0_ & 0x00000002) == 0x00000002)) {
                subBuilder = vehicle_.toBuilder();
              }
              vehicle_ = input.readMessage(
                  com.google.transit.realtime.GtfsRealtime.VehicleDescriptor.PARSER,
                  extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(vehicle_);
                vehicle_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000002;
              break;
            }
            case 32: {
              bitField0_ |= 0x00000004;
              timestamp_ = input.readUInt64();
              break;
            }
            case 40: {
              bitField0_ |= 0x00000008;
              delay_ = input.readInt32();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e.getMessage())
            .setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
          stopTimeUpdate_ = java.util.Collections.unmodifiableList(stopTimeUpdate_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_TripUpdate_descriptor;
    }

    @Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
      return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_TripUpdate_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.transit.realtime.GtfsRealtime.TripUpdate.class,
              com.google.transit.realtime.GtfsRealtime.TripUpdate.Builder.class);
    }

    public static com.google.protobuf.Parser<TripUpdate> PARSER =
        new com.google.protobuf.AbstractParser<TripUpdate>() {
          @Override
          public TripUpdate parsePartialFrom(com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new TripUpdate(input, extensionRegistry);
          }
        };

    @java.lang.Override
    public com.google.protobuf.Parser<TripUpdate> getParserForType() {
      return PARSER;
    }

    public interface StopTimeEventOrBuilder extends
        // @@protoc_insertion_point(interface_extends:transit_realtime.TripUpdate.StopTimeEvent)
        com.google.protobuf.GeneratedMessage.ExtendableMessageOrBuilder<StopTimeEvent> {

      /**
       * <code>optional int32 delay = 1;</code>
       *
       * <pre>
       * Delay (in seconds) can be positive (meaning that the vehicle is late) or
       * negative (meaning that the vehicle is ahead of schedule). Delay of 0
       * means that the vehicle is exactly on time.
       * </pre>
       */
      boolean hasDelay();

      /**
       * <code>optional int32 delay = 1;</code>
       *
       * <pre>
       * Delay (in seconds) can be positive (meaning that the vehicle is late) or
       * negative (meaning that the vehicle is ahead of schedule). Delay of 0
       * means that the vehicle is exactly on time.
       * </pre>
       */
      int getDelay();

      /**
       * <code>optional int64 time = 2;</code>
       *
       * <pre>
       * Event as absolute time.
       * In Unix time (i.e., number of seconds since January 1st 1970 00:00:00
       * UTC).
       * </pre>
       */
      boolean hasTime();

      /**
       * <code>optional int64 time = 2;</code>
       *
       * <pre>
       * Event as absolute time.
       * In Unix time (i.e., number of seconds since January 1st 1970 00:00:00
       * UTC).
       * </pre>
       */
      long getTime();

      /**
       * <code>optional int32 uncertainty = 3;</code>
       *
       * <pre>
       * If uncertainty is omitted, it is interpreted as unknown.
       * If the prediction is unknown or too uncertain, the delay (or time) field
       * should be empty. In such case, the uncertainty field is ignored.
       * To specify a completely certain prediction, set its uncertainty to 0.
       * </pre>
       */
      boolean hasUncertainty();

      /**
       * <code>optional int32 uncertainty = 3;</code>
       *
       * <pre>
       * If uncertainty is omitted, it is interpreted as unknown.
       * If the prediction is unknown or too uncertain, the delay (or time) field
       * should be empty. In such case, the uncertainty field is ignored.
       * To specify a completely certain prediction, set its uncertainty to 0.
       * </pre>
       */
      int getUncertainty();
    }
    /**
     * Protobuf type {@code transit_realtime.TripUpdate.StopTimeEvent}
     *
     * <pre>
     * Timing information for a single predicted event (either arrival or
     * departure).
     * Timing consists of delay and/or estimated time, and uncertainty.
     * - delay should be used when the prediction is given relative to some
     *   existing schedule in GTFS.
     * - time should be given whether there is a predicted schedule or not. If
     *   both time and delay are specified, time will take precedence
     *   (although normally, time, if given for a scheduled trip, should be
     *   equal to scheduled time in GTFS + delay).
     * Uncertainty applies equally to both time and delay.
     * The uncertainty roughly specifies the expected error in true delay (but
     * note, we don't yet define its precise statistical meaning). It's possible
     * for the uncertainty to be 0, for example for trains that are driven under
     * computer timing control.
     * </pre>
     */
    public static final class StopTimeEvent
        extends com.google.protobuf.GeneratedMessage.ExtendableMessage<StopTimeEvent> implements
        // @@protoc_insertion_point(message_implements:transit_realtime.TripUpdate.StopTimeEvent)
        StopTimeEventOrBuilder {
      // Use StopTimeEvent.newBuilder() to construct.
      private StopTimeEvent(
          com.google.protobuf.GeneratedMessage.ExtendableBuilder<com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent, ?> builder) {
        super(builder);
        this.unknownFields = builder.getUnknownFields();
      }

      private StopTimeEvent(boolean noInit) {
        this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance();
      }

      private static final StopTimeEvent defaultInstance;

      public static StopTimeEvent getDefaultInstance() {
        return defaultInstance;
      }

      @Override
      public StopTimeEvent getDefaultInstanceForType() {
        return defaultInstance;
      }

      private final com.google.protobuf.UnknownFieldSet unknownFields;

      @java.lang.Override
      public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
      }

      private StopTimeEvent(com.google.protobuf.CodedInputStream input,
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
                if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                  done = true;
                }
                break;
              }
              case 8: {
                bitField0_ |= 0x00000001;
                delay_ = input.readInt32();
                break;
              }
              case 16: {
                bitField0_ |= 0x00000002;
                time_ = input.readInt64();
                break;
              }
              case 24: {
                bitField0_ |= 0x00000004;
                uncertainty_ = input.readInt32();
                break;
              }
            }
          }
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(this);
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e.getMessage())
              .setUnfinishedMessage(this);
        } finally {
          this.unknownFields = unknownFields.build();
          makeExtensionsImmutable();
        }
      }

      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_TripUpdate_StopTimeEvent_descriptor;
      }

      @Override
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
        return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_TripUpdate_StopTimeEvent_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent.class,
                com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent.Builder.class);
      }

      public static com.google.protobuf.Parser<StopTimeEvent> PARSER =
          new com.google.protobuf.AbstractParser<StopTimeEvent>() {
            @Override
            public StopTimeEvent parsePartialFrom(com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
              return new StopTimeEvent(input, extensionRegistry);
            }
          };

      @java.lang.Override
      public com.google.protobuf.Parser<StopTimeEvent> getParserForType() {
        return PARSER;
      }

      private int bitField0_;
      public static final int DELAY_FIELD_NUMBER = 1;
      private int delay_;

      /**
       * <code>optional int32 delay = 1;</code>
       *
       * <pre>
       * Delay (in seconds) can be positive (meaning that the vehicle is late) or
       * negative (meaning that the vehicle is ahead of schedule). Delay of 0
       * means that the vehicle is exactly on time.
       * </pre>
       */
      @Override
      public boolean hasDelay() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }

      /**
       * <code>optional int32 delay = 1;</code>
       *
       * <pre>
       * Delay (in seconds) can be positive (meaning that the vehicle is late) or
       * negative (meaning that the vehicle is ahead of schedule). Delay of 0
       * means that the vehicle is exactly on time.
       * </pre>
       */
      @Override
      public int getDelay() {
        return delay_;
      }

      public static final int TIME_FIELD_NUMBER = 2;
      private long time_;

      /**
       * <code>optional int64 time = 2;</code>
       *
       * <pre>
       * Event as absolute time.
       * In Unix time (i.e., number of seconds since January 1st 1970 00:00:00
       * UTC).
       * </pre>
       */
      @Override
      public boolean hasTime() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }

      /**
       * <code>optional int64 time = 2;</code>
       *
       * <pre>
       * Event as absolute time.
       * In Unix time (i.e., number of seconds since January 1st 1970 00:00:00
       * UTC).
       * </pre>
       */
      @Override
      public long getTime() {
        return time_;
      }

      public static final int UNCERTAINTY_FIELD_NUMBER = 3;
      private int uncertainty_;

      /**
       * <code>optional int32 uncertainty = 3;</code>
       *
       * <pre>
       * If uncertainty is omitted, it is interpreted as unknown.
       * If the prediction is unknown or too uncertain, the delay (or time) field
       * should be empty. In such case, the uncertainty field is ignored.
       * To specify a completely certain prediction, set its uncertainty to 0.
       * </pre>
       */
      @Override
      public boolean hasUncertainty() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }

      /**
       * <code>optional int32 uncertainty = 3;</code>
       *
       * <pre>
       * If uncertainty is omitted, it is interpreted as unknown.
       * If the prediction is unknown or too uncertain, the delay (or time) field
       * should be empty. In such case, the uncertainty field is ignored.
       * To specify a completely certain prediction, set its uncertainty to 0.
       * </pre>
       */
      @Override
      public int getUncertainty() {
        return uncertainty_;
      }

      private void initFields() {
        delay_ = 0;
        time_ = 0L;
        uncertainty_ = 0;
      }

      private byte memoizedIsInitialized = -1;

      @Override
      public final boolean isInitialized() {
        byte isInitialized = memoizedIsInitialized;
        if (isInitialized == 1)
          return true;
        if (isInitialized == 0)
          return false;

        if (!extensionsAreInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
        memoizedIsInitialized = 1;
        return true;
      }

      @Override
      public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
        getSerializedSize();
        com.google.protobuf.GeneratedMessage.ExtendableMessage<com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent>.ExtensionWriter extensionWriter =
            newExtensionWriter();
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          output.writeInt32(1, delay_);
        }
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          output.writeInt64(2, time_);
        }
        if (((bitField0_ & 0x00000004) == 0x00000004)) {
          output.writeInt32(3, uncertainty_);
        }
        extensionWriter.writeUntil(2000, output);
        getUnknownFields().writeTo(output);
      }

      private int memoizedSerializedSize = -1;

      @Override
      public int getSerializedSize() {
        int size = memoizedSerializedSize;
        if (size != -1)
          return size;

        size = 0;
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          size += com.google.protobuf.CodedOutputStream.computeInt32Size(1, delay_);
        }
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          size += com.google.protobuf.CodedOutputStream.computeInt64Size(2, time_);
        }
        if (((bitField0_ & 0x00000004) == 0x00000004)) {
          size += com.google.protobuf.CodedOutputStream.computeInt32Size(3, uncertainty_);
        }
        size += extensionsSerializedSize();
        size += getUnknownFields().getSerializedSize();
        memoizedSerializedSize = size;
        return size;
      }

      private static final long serialVersionUID = 0L;

      @java.lang.Override
      protected java.lang.Object writeReplace() throws java.io.ObjectStreamException {
        return super.writeReplace();
      }

      public static com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent parseFrom(
          com.google.protobuf.ByteString data)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }

      public static com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent parseFrom(
          com.google.protobuf.ByteString data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }

      public static com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent parseFrom(
          byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }

      public static com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent parseFrom(
          byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }

      public static com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent parseFrom(
          java.io.InputStream input) throws java.io.IOException {
        return PARSER.parseFrom(input);
      }

      public static com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent parseFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        return PARSER.parseFrom(input, extensionRegistry);
      }

      public static com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent parseDelimitedFrom(
          java.io.InputStream input) throws java.io.IOException {
        return PARSER.parseDelimitedFrom(input);
      }

      public static com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        return PARSER.parseDelimitedFrom(input, extensionRegistry);
      }

      public static com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent parseFrom(
          com.google.protobuf.CodedInputStream input) throws java.io.IOException {
        return PARSER.parseFrom(input);
      }

      public static com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent parseFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        return PARSER.parseFrom(input, extensionRegistry);
      }

      public static Builder newBuilder() {
        return Builder.create();
      }

      @Override
      public Builder newBuilderForType() {
        return newBuilder();
      }

      public static Builder newBuilder(
          com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent prototype) {
        return newBuilder().mergeFrom(prototype);
      }

      @Override
      public Builder toBuilder() {
        return newBuilder(this);
      }

      @java.lang.Override
      protected Builder newBuilderForType(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        Builder builder = new Builder(parent);
        return builder;
      }

      /**
       * Protobuf type {@code transit_realtime.TripUpdate.StopTimeEvent}
       *
       * <pre>
       * Timing information for a single predicted event (either arrival or
       * departure).
       * Timing consists of delay and/or estimated time, and uncertainty.
       * - delay should be used when the prediction is given relative to some
       *   existing schedule in GTFS.
       * - time should be given whether there is a predicted schedule or not. If
       *   both time and delay are specified, time will take precedence
       *   (although normally, time, if given for a scheduled trip, should be
       *   equal to scheduled time in GTFS + delay).
       * Uncertainty applies equally to both time and delay.
       * The uncertainty roughly specifies the expected error in true delay (but
       * note, we don't yet define its precise statistical meaning). It's possible
       * for the uncertainty to be 0, for example for trains that are driven under
       * computer timing control.
       * </pre>
       */
      public static final class Builder extends
          com.google.protobuf.GeneratedMessage.ExtendableBuilder<com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent, Builder>
          implements
          // @@protoc_insertion_point(builder_implements:transit_realtime.TripUpdate.StopTimeEvent)
          com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEventOrBuilder {
        public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
          return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_TripUpdate_StopTimeEvent_descriptor;
        }

        @Override
        protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
          return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_TripUpdate_StopTimeEvent_fieldAccessorTable
              .ensureFieldAccessorsInitialized(
                  com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent.class,
                  com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent.Builder.class);
        }

        // Construct using
        // com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent.newBuilder()
        private Builder() {
          maybeForceBuilderInitialization();
        }

        private Builder(com.google.protobuf.GeneratedMessage.BuilderParent parent) {
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

        @Override
        public Builder clear() {
          super.clear();
          delay_ = 0;
          bitField0_ = (bitField0_ & ~0x00000001);
          time_ = 0L;
          bitField0_ = (bitField0_ & ~0x00000002);
          uncertainty_ = 0;
          bitField0_ = (bitField0_ & ~0x00000004);
          return this;
        }

        @Override
        public Builder clone() {
          return create().mergeFrom(buildPartial());
        }

        @Override
        public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
          return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_TripUpdate_StopTimeEvent_descriptor;
        }

        @Override
        public com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent getDefaultInstanceForType() {
          return com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent
              .getDefaultInstance();
        }

        @Override
        public com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent build() {
          com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent result = buildPartial();
          if (!result.isInitialized()) {
            throw newUninitializedMessageException(result);
          }
          return result;
        }

        @Override
        public com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent buildPartial() {
          com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent result =
              new com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent(this);
          int from_bitField0_ = bitField0_;
          int to_bitField0_ = 0;
          if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
            to_bitField0_ |= 0x00000001;
          }
          result.delay_ = delay_;
          if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
            to_bitField0_ |= 0x00000002;
          }
          result.time_ = time_;
          if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
            to_bitField0_ |= 0x00000004;
          }
          result.uncertainty_ = uncertainty_;
          result.bitField0_ = to_bitField0_;
          onBuilt();
          return result;
        }

        @Override
        public Builder mergeFrom(com.google.protobuf.Message other) {
          if (other instanceof com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent) {
            return mergeFrom(
                (com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent) other);
          } else {
            super.mergeFrom(other);
            return this;
          }
        }

        public Builder mergeFrom(
            com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent other) {
          if (other == com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent
              .getDefaultInstance())
            return this;
          if (other.hasDelay()) {
            setDelay(other.getDelay());
          }
          if (other.hasTime()) {
            setTime(other.getTime());
          }
          if (other.hasUncertainty()) {
            setUncertainty(other.getUncertainty());
          }
          this.mergeExtensionFields(other);
          this.mergeUnknownFields(other.getUnknownFields());
          return this;
        }

        @Override
        public final boolean isInitialized() {
          if (!extensionsAreInitialized()) {

            return false;
          }
          return true;
        }

        @Override
        public Builder mergeFrom(com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
          com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent parsedMessage = null;
          try {
            parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            parsedMessage = (com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent) e
                .getUnfinishedMessage();
            throw e;
          } finally {
            if (parsedMessage != null) {
              mergeFrom(parsedMessage);
            }
          }
          return this;
        }

        private int bitField0_;

        private int delay_;

        /**
         * <code>optional int32 delay = 1;</code>
         *
         * <pre>
         * Delay (in seconds) can be positive (meaning that the vehicle is late) or
         * negative (meaning that the vehicle is ahead of schedule). Delay of 0
         * means that the vehicle is exactly on time.
         * </pre>
         */
        @Override
        public boolean hasDelay() {
          return ((bitField0_ & 0x00000001) == 0x00000001);
        }

        /**
         * <code>optional int32 delay = 1;</code>
         *
         * <pre>
         * Delay (in seconds) can be positive (meaning that the vehicle is late) or
         * negative (meaning that the vehicle is ahead of schedule). Delay of 0
         * means that the vehicle is exactly on time.
         * </pre>
         */
        @Override
        public int getDelay() {
          return delay_;
        }

        /**
         * <code>optional int32 delay = 1;</code>
         *
         * <pre>
         * Delay (in seconds) can be positive (meaning that the vehicle is late) or
         * negative (meaning that the vehicle is ahead of schedule). Delay of 0
         * means that the vehicle is exactly on time.
         * </pre>
         */
        public Builder setDelay(int value) {
          bitField0_ |= 0x00000001;
          delay_ = value;
          onChanged();
          return this;
        }

        /**
         * <code>optional int32 delay = 1;</code>
         *
         * <pre>
         * Delay (in seconds) can be positive (meaning that the vehicle is late) or
         * negative (meaning that the vehicle is ahead of schedule). Delay of 0
         * means that the vehicle is exactly on time.
         * </pre>
         */
        public Builder clearDelay() {
          bitField0_ = (bitField0_ & ~0x00000001);
          delay_ = 0;
          onChanged();
          return this;
        }

        private long time_;

        /**
         * <code>optional int64 time = 2;</code>
         *
         * <pre>
         * Event as absolute time.
         * In Unix time (i.e., number of seconds since January 1st 1970 00:00:00
         * UTC).
         * </pre>
         */
        @Override
        public boolean hasTime() {
          return ((bitField0_ & 0x00000002) == 0x00000002);
        }

        /**
         * <code>optional int64 time = 2;</code>
         *
         * <pre>
         * Event as absolute time.
         * In Unix time (i.e., number of seconds since January 1st 1970 00:00:00
         * UTC).
         * </pre>
         */
        @Override
        public long getTime() {
          return time_;
        }

        /**
         * <code>optional int64 time = 2;</code>
         *
         * <pre>
         * Event as absolute time.
         * In Unix time (i.e., number of seconds since January 1st 1970 00:00:00
         * UTC).
         * </pre>
         */
        public Builder setTime(long value) {
          bitField0_ |= 0x00000002;
          time_ = value;
          onChanged();
          return this;
        }

        /**
         * <code>optional int64 time = 2;</code>
         *
         * <pre>
         * Event as absolute time.
         * In Unix time (i.e., number of seconds since January 1st 1970 00:00:00
         * UTC).
         * </pre>
         */
        public Builder clearTime() {
          bitField0_ = (bitField0_ & ~0x00000002);
          time_ = 0L;
          onChanged();
          return this;
        }

        private int uncertainty_;

        /**
         * <code>optional int32 uncertainty = 3;</code>
         *
         * <pre>
         * If uncertainty is omitted, it is interpreted as unknown.
         * If the prediction is unknown or too uncertain, the delay (or time) field
         * should be empty. In such case, the uncertainty field is ignored.
         * To specify a completely certain prediction, set its uncertainty to 0.
         * </pre>
         */
        @Override
        public boolean hasUncertainty() {
          return ((bitField0_ & 0x00000004) == 0x00000004);
        }

        /**
         * <code>optional int32 uncertainty = 3;</code>
         *
         * <pre>
         * If uncertainty is omitted, it is interpreted as unknown.
         * If the prediction is unknown or too uncertain, the delay (or time) field
         * should be empty. In such case, the uncertainty field is ignored.
         * To specify a completely certain prediction, set its uncertainty to 0.
         * </pre>
         */
        @Override
        public int getUncertainty() {
          return uncertainty_;
        }

        /**
         * <code>optional int32 uncertainty = 3;</code>
         *
         * <pre>
         * If uncertainty is omitted, it is interpreted as unknown.
         * If the prediction is unknown or too uncertain, the delay (or time) field
         * should be empty. In such case, the uncertainty field is ignored.
         * To specify a completely certain prediction, set its uncertainty to 0.
         * </pre>
         */
        public Builder setUncertainty(int value) {
          bitField0_ |= 0x00000004;
          uncertainty_ = value;
          onChanged();
          return this;
        }

        /**
         * <code>optional int32 uncertainty = 3;</code>
         *
         * <pre>
         * If uncertainty is omitted, it is interpreted as unknown.
         * If the prediction is unknown or too uncertain, the delay (or time) field
         * should be empty. In such case, the uncertainty field is ignored.
         * To specify a completely certain prediction, set its uncertainty to 0.
         * </pre>
         */
        public Builder clearUncertainty() {
          bitField0_ = (bitField0_ & ~0x00000004);
          uncertainty_ = 0;
          onChanged();
          return this;
        }

        // @@protoc_insertion_point(builder_scope:transit_realtime.TripUpdate.StopTimeEvent)
      }

      static {
        defaultInstance = new StopTimeEvent(true);
        defaultInstance.initFields();
      }

      // @@protoc_insertion_point(class_scope:transit_realtime.TripUpdate.StopTimeEvent)
    }

    public interface StopTimeUpdateOrBuilder extends
        // @@protoc_insertion_point(interface_extends:transit_realtime.TripUpdate.StopTimeUpdate)
        com.google.protobuf.GeneratedMessage.ExtendableMessageOrBuilder<StopTimeUpdate> {

      /**
       * <code>optional uint32 stop_sequence = 1;</code>
       *
       * <pre>
       * Must be the same as in stop_times.txt in the corresponding GTFS feed.
       * </pre>
       */
      boolean hasStopSequence();

      /**
       * <code>optional uint32 stop_sequence = 1;</code>
       *
       * <pre>
       * Must be the same as in stop_times.txt in the corresponding GTFS feed.
       * </pre>
       */
      int getStopSequence();

      /**
       * <code>optional string stop_id = 4;</code>
       *
       * <pre>
       * Must be the same as in stops.txt in the corresponding GTFS feed.
       * </pre>
       */
      boolean hasStopId();

      /**
       * <code>optional string stop_id = 4;</code>
       *
       * <pre>
       * Must be the same as in stops.txt in the corresponding GTFS feed.
       * </pre>
       */
      java.lang.String getStopId();

      /**
       * <code>optional string stop_id = 4;</code>
       *
       * <pre>
       * Must be the same as in stops.txt in the corresponding GTFS feed.
       * </pre>
       */
      com.google.protobuf.ByteString getStopIdBytes();

      /**
       * <code>optional .transit_realtime.TripUpdate.StopTimeEvent arrival = 2;</code>
       */
      boolean hasArrival();

      /**
       * <code>optional .transit_realtime.TripUpdate.StopTimeEvent arrival = 2;</code>
       */
      com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent getArrival();

      /**
       * <code>optional .transit_realtime.TripUpdate.StopTimeEvent arrival = 2;</code>
       */
      com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEventOrBuilder getArrivalOrBuilder();

      /**
       * <code>optional .transit_realtime.TripUpdate.StopTimeEvent departure = 3;</code>
       */
      boolean hasDeparture();

      /**
       * <code>optional .transit_realtime.TripUpdate.StopTimeEvent departure = 3;</code>
       */
      com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent getDeparture();

      /**
       * <code>optional .transit_realtime.TripUpdate.StopTimeEvent departure = 3;</code>
       */
      com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEventOrBuilder getDepartureOrBuilder();

      /**
       * <code>optional .transit_realtime.TripUpdate.StopTimeUpdate.ScheduleRelationship schedule_relationship = 5 [default = SCHEDULED];</code>
       */
      boolean hasScheduleRelationship();

      /**
       * <code>optional .transit_realtime.TripUpdate.StopTimeUpdate.ScheduleRelationship schedule_relationship = 5 [default = SCHEDULED];</code>
       */
      com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate.ScheduleRelationship getScheduleRelationship();
    }
    /**
     * Protobuf type {@code transit_realtime.TripUpdate.StopTimeUpdate}
     *
     * <pre>
     * Realtime update for arrival and/or departure events for a given stop on a
     * trip. Updates can be supplied for both past and future events.
     * The producer is allowed, although not required, to drop past events.
     * </pre>
     */
    public static final class StopTimeUpdate
        extends com.google.protobuf.GeneratedMessage.ExtendableMessage<StopTimeUpdate> implements
        // @@protoc_insertion_point(message_implements:transit_realtime.TripUpdate.StopTimeUpdate)
        StopTimeUpdateOrBuilder {
      // Use StopTimeUpdate.newBuilder() to construct.
      private StopTimeUpdate(
          com.google.protobuf.GeneratedMessage.ExtendableBuilder<com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate, ?> builder) {
        super(builder);
        this.unknownFields = builder.getUnknownFields();
      }

      private StopTimeUpdate(boolean noInit) {
        this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance();
      }

      private static final StopTimeUpdate defaultInstance;

      public static StopTimeUpdate getDefaultInstance() {
        return defaultInstance;
      }

      @Override
      public StopTimeUpdate getDefaultInstanceForType() {
        return defaultInstance;
      }

      private final com.google.protobuf.UnknownFieldSet unknownFields;

      @java.lang.Override
      public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
      }

      private StopTimeUpdate(com.google.protobuf.CodedInputStream input,
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
                if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                  done = true;
                }
                break;
              }
              case 8: {
                bitField0_ |= 0x00000001;
                stopSequence_ = input.readUInt32();
                break;
              }
              case 18: {
                com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent.Builder subBuilder =
                    null;
                if (((bitField0_ & 0x00000004) == 0x00000004)) {
                  subBuilder = arrival_.toBuilder();
                }
                arrival_ = input.readMessage(
                    com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent.PARSER,
                    extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(arrival_);
                  arrival_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000004;
                break;
              }
              case 26: {
                com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent.Builder subBuilder =
                    null;
                if (((bitField0_ & 0x00000008) == 0x00000008)) {
                  subBuilder = departure_.toBuilder();
                }
                departure_ = input.readMessage(
                    com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent.PARSER,
                    extensionRegistry);
                if (subBuilder != null) {
                  subBuilder.mergeFrom(departure_);
                  departure_ = subBuilder.buildPartial();
                }
                bitField0_ |= 0x00000008;
                break;
              }
              case 34: {
                com.google.protobuf.ByteString bs = input.readBytes();
                bitField0_ |= 0x00000002;
                stopId_ = bs;
                break;
              }
              case 40: {
                int rawValue = input.readEnum();
                com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate.ScheduleRelationship value =
                    com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate.ScheduleRelationship
                        .valueOf(rawValue);
                if (value == null) {
                  unknownFields.mergeVarintField(5, rawValue);
                } else {
                  bitField0_ |= 0x00000010;
                  scheduleRelationship_ = value;
                }
                break;
              }
            }
          }
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(this);
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e.getMessage())
              .setUnfinishedMessage(this);
        } finally {
          this.unknownFields = unknownFields.build();
          makeExtensionsImmutable();
        }
      }

      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_TripUpdate_StopTimeUpdate_descriptor;
      }

      @Override
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
        return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_TripUpdate_StopTimeUpdate_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate.class,
                com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate.Builder.class);
      }

      public static com.google.protobuf.Parser<StopTimeUpdate> PARSER =
          new com.google.protobuf.AbstractParser<StopTimeUpdate>() {
            @Override
            public StopTimeUpdate parsePartialFrom(com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
              return new StopTimeUpdate(input, extensionRegistry);
            }
          };

      @java.lang.Override
      public com.google.protobuf.Parser<StopTimeUpdate> getParserForType() {
        return PARSER;
      }

      /**
       * Protobuf enum {@code transit_realtime.TripUpdate.StopTimeUpdate.ScheduleRelationship}
       *
       * <pre>
       * The relation between this StopTime and the static schedule.
       * </pre>
       */
      public enum ScheduleRelationship implements com.google.protobuf.ProtocolMessageEnum {
        /**
         * <code>SCHEDULED = 0;</code>
         *
         * <pre>
         * The vehicle is proceeding in accordance with its static schedule of
         * stops, although not necessarily according to the times of the schedule.
         * At least one of arrival and departure must be provided. If the schedule
         * for this stop contains both arrival and departure times then so must
         * this update.
         * </pre>
         */
        SCHEDULED(0, 0),
        /**
         * <code>SKIPPED = 1;</code>
         *
         * <pre>
         * The stop is skipped, i.e., the vehicle will not stop at this stop.
         * Arrival and departure are optional.
         * </pre>
         */
        SKIPPED(1, 1),
        /**
         * <code>NO_DATA = 2;</code>
         *
         * <pre>
         * No data is given for this stop. The main intention for this value is to
         * give the predictions only for part of a trip, i.e., if the last update
         * for a trip has a NO_DATA specifier, then StopTimes for the rest of the
         * stops in the trip are considered to be unspecified as well.
         * Neither arrival nor departure should be supplied.
         * </pre>
         */
        NO_DATA(2, 2),;

        /**
         * <code>SCHEDULED = 0;</code>
         *
         * <pre>
         * The vehicle is proceeding in accordance with its static schedule of
         * stops, although not necessarily according to the times of the schedule.
         * At least one of arrival and departure must be provided. If the schedule
         * for this stop contains both arrival and departure times then so must
         * this update.
         * </pre>
         */
        public static final int SCHEDULED_VALUE = 0;
        /**
         * <code>SKIPPED = 1;</code>
         *
         * <pre>
         * The stop is skipped, i.e., the vehicle will not stop at this stop.
         * Arrival and departure are optional.
         * </pre>
         */
        public static final int SKIPPED_VALUE = 1;
        /**
         * <code>NO_DATA = 2;</code>
         *
         * <pre>
         * No data is given for this stop. The main intention for this value is to
         * give the predictions only for part of a trip, i.e., if the last update
         * for a trip has a NO_DATA specifier, then StopTimes for the rest of the
         * stops in the trip are considered to be unspecified as well.
         * Neither arrival nor departure should be supplied.
         * </pre>
         */
        public static final int NO_DATA_VALUE = 2;


        @Override
        public final int getNumber() {
          return value;
        }

        public static ScheduleRelationship valueOf(int value) {
          switch (value) {
            case 0:
              return SCHEDULED;
            case 1:
              return SKIPPED;
            case 2:
              return NO_DATA;
            default:
              return null;
          }
        }

        public static com.google.protobuf.Internal.EnumLiteMap<ScheduleRelationship> internalGetValueMap() {
          return internalValueMap;
        }

        private static com.google.protobuf.Internal.EnumLiteMap<ScheduleRelationship> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<ScheduleRelationship>() {
              @Override
              public ScheduleRelationship findValueByNumber(int number) {
                return ScheduleRelationship.valueOf(number);
              }
            };

        @Override
        public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
          return getDescriptor().getValues().get(index);
        }

        @Override
        public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
          return getDescriptor();
        }

        public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
          return com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate.getDescriptor()
              .getEnumTypes().get(0);
        }

        private static final ScheduleRelationship[] VALUES = values();

        public static ScheduleRelationship valueOf(
            com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
          if (desc.getType() != getDescriptor()) {
            throw new java.lang.IllegalArgumentException(
                "EnumValueDescriptor is not for this type.");
          }
          return VALUES[desc.getIndex()];
        }

        private final int index;
        private final int value;

        private ScheduleRelationship(int index, int value) {
          this.index = index;
          this.value = value;
        }

        // @@protoc_insertion_point(enum_scope:transit_realtime.TripUpdate.StopTimeUpdate.ScheduleRelationship)
      }

      private int bitField0_;
      public static final int STOP_SEQUENCE_FIELD_NUMBER = 1;
      private int stopSequence_;

      /**
       * <code>optional uint32 stop_sequence = 1;</code>
       *
       * <pre>
       * Must be the same as in stop_times.txt in the corresponding GTFS feed.
       * </pre>
       */
      @Override
      public boolean hasStopSequence() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }

      /**
       * <code>optional uint32 stop_sequence = 1;</code>
       *
       * <pre>
       * Must be the same as in stop_times.txt in the corresponding GTFS feed.
       * </pre>
       */
      @Override
      public int getStopSequence() {
        return stopSequence_;
      }

      public static final int STOP_ID_FIELD_NUMBER = 4;
      private java.lang.Object stopId_;

      /**
       * <code>optional string stop_id = 4;</code>
       *
       * <pre>
       * Must be the same as in stops.txt in the corresponding GTFS feed.
       * </pre>
       */
      @Override
      public boolean hasStopId() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }

      /**
       * <code>optional string stop_id = 4;</code>
       *
       * <pre>
       * Must be the same as in stops.txt in the corresponding GTFS feed.
       * </pre>
       */
      @Override
      public java.lang.String getStopId() {
        java.lang.Object ref = stopId_;
        if (ref instanceof java.lang.String) {
          return (java.lang.String) ref;
        } else {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            stopId_ = s;
          }
          return s;
        }
      }

      /**
       * <code>optional string stop_id = 4;</code>
       *
       * <pre>
       * Must be the same as in stops.txt in the corresponding GTFS feed.
       * </pre>
       */
      @Override
      public com.google.protobuf.ByteString getStopIdBytes() {
        java.lang.Object ref = stopId_;
        if (ref instanceof java.lang.String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          stopId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }

      public static final int ARRIVAL_FIELD_NUMBER = 2;
      private com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent arrival_;

      /**
       * <code>optional .transit_realtime.TripUpdate.StopTimeEvent arrival = 2;</code>
       */
      @Override
      public boolean hasArrival() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }

      /**
       * <code>optional .transit_realtime.TripUpdate.StopTimeEvent arrival = 2;</code>
       */
      @Override
      public com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent getArrival() {
        return arrival_;
      }

      /**
       * <code>optional .transit_realtime.TripUpdate.StopTimeEvent arrival = 2;</code>
       */
      @Override
      public com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEventOrBuilder getArrivalOrBuilder() {
        return arrival_;
      }

      public static final int DEPARTURE_FIELD_NUMBER = 3;
      private com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent departure_;

      /**
       * <code>optional .transit_realtime.TripUpdate.StopTimeEvent departure = 3;</code>
       */
      @Override
      public boolean hasDeparture() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }

      /**
       * <code>optional .transit_realtime.TripUpdate.StopTimeEvent departure = 3;</code>
       */
      @Override
      public com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent getDeparture() {
        return departure_;
      }

      /**
       * <code>optional .transit_realtime.TripUpdate.StopTimeEvent departure = 3;</code>
       */
      @Override
      public com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEventOrBuilder getDepartureOrBuilder() {
        return departure_;
      }

      public static final int SCHEDULE_RELATIONSHIP_FIELD_NUMBER = 5;
      private com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate.ScheduleRelationship scheduleRelationship_;

      /**
       * <code>optional .transit_realtime.TripUpdate.StopTimeUpdate.ScheduleRelationship schedule_relationship = 5 [default = SCHEDULED];</code>
       */
      @Override
      public boolean hasScheduleRelationship() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }

      /**
       * <code>optional .transit_realtime.TripUpdate.StopTimeUpdate.ScheduleRelationship schedule_relationship = 5 [default = SCHEDULED];</code>
       */
      @Override
      public com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate.ScheduleRelationship getScheduleRelationship() {
        return scheduleRelationship_;
      }

      private void initFields() {
        stopSequence_ = 0;
        stopId_ = "";
        arrival_ =
            com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent.getDefaultInstance();
        departure_ =
            com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent.getDefaultInstance();
        scheduleRelationship_ =
            com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate.ScheduleRelationship.SCHEDULED;
      }

      private byte memoizedIsInitialized = -1;

      @Override
      public final boolean isInitialized() {
        byte isInitialized = memoizedIsInitialized;
        if (isInitialized == 1)
          return true;
        if (isInitialized == 0)
          return false;

        if (hasArrival()) {
          if (!getArrival().isInitialized()) {
            memoizedIsInitialized = 0;
            return false;
          }
        }
        if (hasDeparture()) {
          if (!getDeparture().isInitialized()) {
            memoizedIsInitialized = 0;
            return false;
          }
        }
        if (!extensionsAreInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
        memoizedIsInitialized = 1;
        return true;
      }

      @Override
      public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
        getSerializedSize();
        com.google.protobuf.GeneratedMessage.ExtendableMessage<com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate>.ExtensionWriter extensionWriter =
            newExtensionWriter();
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          output.writeUInt32(1, stopSequence_);
        }
        if (((bitField0_ & 0x00000004) == 0x00000004)) {
          output.writeMessage(2, arrival_);
        }
        if (((bitField0_ & 0x00000008) == 0x00000008)) {
          output.writeMessage(3, departure_);
        }
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          output.writeBytes(4, getStopIdBytes());
        }
        if (((bitField0_ & 0x00000010) == 0x00000010)) {
          output.writeEnum(5, scheduleRelationship_.getNumber());
        }
        extensionWriter.writeUntil(2000, output);
        getUnknownFields().writeTo(output);
      }

      private int memoizedSerializedSize = -1;

      @Override
      public int getSerializedSize() {
        int size = memoizedSerializedSize;
        if (size != -1)
          return size;

        size = 0;
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          size += com.google.protobuf.CodedOutputStream.computeUInt32Size(1, stopSequence_);
        }
        if (((bitField0_ & 0x00000004) == 0x00000004)) {
          size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, arrival_);
        }
        if (((bitField0_ & 0x00000008) == 0x00000008)) {
          size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, departure_);
        }
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          size += com.google.protobuf.CodedOutputStream.computeBytesSize(4, getStopIdBytes());
        }
        if (((bitField0_ & 0x00000010) == 0x00000010)) {
          size += com.google.protobuf.CodedOutputStream.computeEnumSize(5,
              scheduleRelationship_.getNumber());
        }
        size += extensionsSerializedSize();
        size += getUnknownFields().getSerializedSize();
        memoizedSerializedSize = size;
        return size;
      }

      private static final long serialVersionUID = 0L;

      @java.lang.Override
      protected java.lang.Object writeReplace() throws java.io.ObjectStreamException {
        return super.writeReplace();
      }

      public static com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate parseFrom(
          com.google.protobuf.ByteString data)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }

      public static com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate parseFrom(
          com.google.protobuf.ByteString data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }

      public static com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate parseFrom(
          byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }

      public static com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate parseFrom(
          byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }

      public static com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate parseFrom(
          java.io.InputStream input) throws java.io.IOException {
        return PARSER.parseFrom(input);
      }

      public static com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate parseFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        return PARSER.parseFrom(input, extensionRegistry);
      }

      public static com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate parseDelimitedFrom(
          java.io.InputStream input) throws java.io.IOException {
        return PARSER.parseDelimitedFrom(input);
      }

      public static com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        return PARSER.parseDelimitedFrom(input, extensionRegistry);
      }

      public static com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate parseFrom(
          com.google.protobuf.CodedInputStream input) throws java.io.IOException {
        return PARSER.parseFrom(input);
      }

      public static com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate parseFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        return PARSER.parseFrom(input, extensionRegistry);
      }

      public static Builder newBuilder() {
        return Builder.create();
      }

      @Override
      public Builder newBuilderForType() {
        return newBuilder();
      }

      public static Builder newBuilder(
          com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate prototype) {
        return newBuilder().mergeFrom(prototype);
      }

      @Override
      public Builder toBuilder() {
        return newBuilder(this);
      }

      @java.lang.Override
      protected Builder newBuilderForType(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        Builder builder = new Builder(parent);
        return builder;
      }

      /**
       * Protobuf type {@code transit_realtime.TripUpdate.StopTimeUpdate}
       *
       * <pre>
       * Realtime update for arrival and/or departure events for a given stop on a
       * trip. Updates can be supplied for both past and future events.
       * The producer is allowed, although not required, to drop past events.
       * </pre>
       */
      public static final class Builder extends
          com.google.protobuf.GeneratedMessage.ExtendableBuilder<com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate, Builder>
          implements
          // @@protoc_insertion_point(builder_implements:transit_realtime.TripUpdate.StopTimeUpdate)
          com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdateOrBuilder {
        public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
          return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_TripUpdate_StopTimeUpdate_descriptor;
        }

        @Override
        protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
          return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_TripUpdate_StopTimeUpdate_fieldAccessorTable
              .ensureFieldAccessorsInitialized(
                  com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate.class,
                  com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate.Builder.class);
        }

        // Construct using
        // com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate.newBuilder()
        private Builder() {
          maybeForceBuilderInitialization();
        }

        private Builder(com.google.protobuf.GeneratedMessage.BuilderParent parent) {
          super(parent);
          maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
          if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
            getArrivalFieldBuilder();
            getDepartureFieldBuilder();
          }
        }

        private static Builder create() {
          return new Builder();
        }

        @Override
        public Builder clear() {
          super.clear();
          stopSequence_ = 0;
          bitField0_ = (bitField0_ & ~0x00000001);
          stopId_ = "";
          bitField0_ = (bitField0_ & ~0x00000002);
          if (arrivalBuilder_ == null) {
            arrival_ = com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent
                .getDefaultInstance();
          } else {
            arrivalBuilder_.clear();
          }
          bitField0_ = (bitField0_ & ~0x00000004);
          if (departureBuilder_ == null) {
            departure_ = com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent
                .getDefaultInstance();
          } else {
            departureBuilder_.clear();
          }
          bitField0_ = (bitField0_ & ~0x00000008);
          scheduleRelationship_ =
              com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate.ScheduleRelationship.SCHEDULED;
          bitField0_ = (bitField0_ & ~0x00000010);
          return this;
        }

        @Override
        public Builder clone() {
          return create().mergeFrom(buildPartial());
        }

        @Override
        public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
          return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_TripUpdate_StopTimeUpdate_descriptor;
        }

        @Override
        public com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate getDefaultInstanceForType() {
          return com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate
              .getDefaultInstance();
        }

        @Override
        public com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate build() {
          com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate result =
              buildPartial();
          if (!result.isInitialized()) {
            throw newUninitializedMessageException(result);
          }
          return result;
        }

        @Override
        public com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate buildPartial() {
          com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate result =
              new com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate(this);
          int from_bitField0_ = bitField0_;
          int to_bitField0_ = 0;
          if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
            to_bitField0_ |= 0x00000001;
          }
          result.stopSequence_ = stopSequence_;
          if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
            to_bitField0_ |= 0x00000002;
          }
          result.stopId_ = stopId_;
          if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
            to_bitField0_ |= 0x00000004;
          }
          if (arrivalBuilder_ == null) {
            result.arrival_ = arrival_;
          } else {
            result.arrival_ = arrivalBuilder_.build();
          }
          if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
            to_bitField0_ |= 0x00000008;
          }
          if (departureBuilder_ == null) {
            result.departure_ = departure_;
          } else {
            result.departure_ = departureBuilder_.build();
          }
          if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
            to_bitField0_ |= 0x00000010;
          }
          result.scheduleRelationship_ = scheduleRelationship_;
          result.bitField0_ = to_bitField0_;
          onBuilt();
          return result;
        }

        @Override
        public Builder mergeFrom(com.google.protobuf.Message other) {
          if (other instanceof com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate) {
            return mergeFrom(
                (com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate) other);
          } else {
            super.mergeFrom(other);
            return this;
          }
        }

        public Builder mergeFrom(
            com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate other) {
          if (other == com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate
              .getDefaultInstance())
            return this;
          if (other.hasStopSequence()) {
            setStopSequence(other.getStopSequence());
          }
          if (other.hasStopId()) {
            bitField0_ |= 0x00000002;
            stopId_ = other.stopId_;
            onChanged();
          }
          if (other.hasArrival()) {
            mergeArrival(other.getArrival());
          }
          if (other.hasDeparture()) {
            mergeDeparture(other.getDeparture());
          }
          if (other.hasScheduleRelationship()) {
            setScheduleRelationship(other.getScheduleRelationship());
          }
          this.mergeExtensionFields(other);
          this.mergeUnknownFields(other.getUnknownFields());
          return this;
        }

        @Override
        public final boolean isInitialized() {
          if (hasArrival()) {
            if (!getArrival().isInitialized()) {

              return false;
            }
          }
          if (hasDeparture()) {
            if (!getDeparture().isInitialized()) {

              return false;
            }
          }
          if (!extensionsAreInitialized()) {

            return false;
          }
          return true;
        }

        @Override
        public Builder mergeFrom(com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
          com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate parsedMessage = null;
          try {
            parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            parsedMessage = (com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate) e
                .getUnfinishedMessage();
            throw e;
          } finally {
            if (parsedMessage != null) {
              mergeFrom(parsedMessage);
            }
          }
          return this;
        }

        private int bitField0_;

        private int stopSequence_;

        /**
         * <code>optional uint32 stop_sequence = 1;</code>
         *
         * <pre>
         * Must be the same as in stop_times.txt in the corresponding GTFS feed.
         * </pre>
         */
        @Override
        public boolean hasStopSequence() {
          return ((bitField0_ & 0x00000001) == 0x00000001);
        }

        /**
         * <code>optional uint32 stop_sequence = 1;</code>
         *
         * <pre>
         * Must be the same as in stop_times.txt in the corresponding GTFS feed.
         * </pre>
         */
        @Override
        public int getStopSequence() {
          return stopSequence_;
        }

        /**
         * <code>optional uint32 stop_sequence = 1;</code>
         *
         * <pre>
         * Must be the same as in stop_times.txt in the corresponding GTFS feed.
         * </pre>
         */
        public Builder setStopSequence(int value) {
          bitField0_ |= 0x00000001;
          stopSequence_ = value;
          onChanged();
          return this;
        }

        /**
         * <code>optional uint32 stop_sequence = 1;</code>
         *
         * <pre>
         * Must be the same as in stop_times.txt in the corresponding GTFS feed.
         * </pre>
         */
        public Builder clearStopSequence() {
          bitField0_ = (bitField0_ & ~0x00000001);
          stopSequence_ = 0;
          onChanged();
          return this;
        }

        private java.lang.Object stopId_ = "";

        /**
         * <code>optional string stop_id = 4;</code>
         *
         * <pre>
         * Must be the same as in stops.txt in the corresponding GTFS feed.
         * </pre>
         */
        @Override
        public boolean hasStopId() {
          return ((bitField0_ & 0x00000002) == 0x00000002);
        }

        /**
         * <code>optional string stop_id = 4;</code>
         *
         * <pre>
         * Must be the same as in stops.txt in the corresponding GTFS feed.
         * </pre>
         */
        @Override
        public java.lang.String getStopId() {
          java.lang.Object ref = stopId_;
          if (!(ref instanceof java.lang.String)) {
            com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
            java.lang.String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
              stopId_ = s;
            }
            return s;
          } else {
            return (java.lang.String) ref;
          }
        }

        /**
         * <code>optional string stop_id = 4;</code>
         *
         * <pre>
         * Must be the same as in stops.txt in the corresponding GTFS feed.
         * </pre>
         */
        @Override
        public com.google.protobuf.ByteString getStopIdBytes() {
          java.lang.Object ref = stopId_;
          if (ref instanceof String) {
            com.google.protobuf.ByteString b =
                com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
            stopId_ = b;
            return b;
          } else {
            return (com.google.protobuf.ByteString) ref;
          }
        }

        /**
         * <code>optional string stop_id = 4;</code>
         *
         * <pre>
         * Must be the same as in stops.txt in the corresponding GTFS feed.
         * </pre>
         */
        public Builder setStopId(java.lang.String value) {
          if (value == null) {
            throw new NullPointerException();
          }
          bitField0_ |= 0x00000002;
          stopId_ = value;
          onChanged();
          return this;
        }

        /**
         * <code>optional string stop_id = 4;</code>
         *
         * <pre>
         * Must be the same as in stops.txt in the corresponding GTFS feed.
         * </pre>
         */
        public Builder clearStopId() {
          bitField0_ = (bitField0_ & ~0x00000002);
          stopId_ = getDefaultInstance().getStopId();
          onChanged();
          return this;
        }

        /**
         * <code>optional string stop_id = 4;</code>
         *
         * <pre>
         * Must be the same as in stops.txt in the corresponding GTFS feed.
         * </pre>
         */
        public Builder setStopIdBytes(com.google.protobuf.ByteString value) {
          if (value == null) {
            throw new NullPointerException();
          }
          bitField0_ |= 0x00000002;
          stopId_ = value;
          onChanged();
          return this;
        }

        private com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent arrival_ =
            com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent.getDefaultInstance();
        private com.google.protobuf.SingleFieldBuilder<com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent, com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent.Builder, com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEventOrBuilder> arrivalBuilder_;

        /**
         * <code>optional .transit_realtime.TripUpdate.StopTimeEvent arrival = 2;</code>
         */
        @Override
        public boolean hasArrival() {
          return ((bitField0_ & 0x00000004) == 0x00000004);
        }

        /**
         * <code>optional .transit_realtime.TripUpdate.StopTimeEvent arrival = 2;</code>
         */
        @Override
        public com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent getArrival() {
          if (arrivalBuilder_ == null) {
            return arrival_;
          } else {
            return arrivalBuilder_.getMessage();
          }
        }

        /**
         * <code>optional .transit_realtime.TripUpdate.StopTimeEvent arrival = 2;</code>
         */
        public Builder setArrival(
            com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent value) {
          if (arrivalBuilder_ == null) {
            if (value == null) {
              throw new NullPointerException();
            }
            arrival_ = value;
            onChanged();
          } else {
            arrivalBuilder_.setMessage(value);
          }
          bitField0_ |= 0x00000004;
          return this;
        }

        /**
         * <code>optional .transit_realtime.TripUpdate.StopTimeEvent arrival = 2;</code>
         */
        public Builder setArrival(
            com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent.Builder builderForValue) {
          if (arrivalBuilder_ == null) {
            arrival_ = builderForValue.build();
            onChanged();
          } else {
            arrivalBuilder_.setMessage(builderForValue.build());
          }
          bitField0_ |= 0x00000004;
          return this;
        }

        /**
         * <code>optional .transit_realtime.TripUpdate.StopTimeEvent arrival = 2;</code>
         */
        public Builder mergeArrival(
            com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent value) {
          if (arrivalBuilder_ == null) {
            if (((bitField0_ & 0x00000004) == 0x00000004)
                && arrival_ != com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent
                    .getDefaultInstance()) {
              arrival_ = com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent
                  .newBuilder(arrival_).mergeFrom(value).buildPartial();
            } else {
              arrival_ = value;
            }
            onChanged();
          } else {
            arrivalBuilder_.mergeFrom(value);
          }
          bitField0_ |= 0x00000004;
          return this;
        }

        /**
         * <code>optional .transit_realtime.TripUpdate.StopTimeEvent arrival = 2;</code>
         */
        public Builder clearArrival() {
          if (arrivalBuilder_ == null) {
            arrival_ = com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent
                .getDefaultInstance();
            onChanged();
          } else {
            arrivalBuilder_.clear();
          }
          bitField0_ = (bitField0_ & ~0x00000004);
          return this;
        }

        /**
         * <code>optional .transit_realtime.TripUpdate.StopTimeEvent arrival = 2;</code>
         */
        public com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent.Builder getArrivalBuilder() {
          bitField0_ |= 0x00000004;
          onChanged();
          return getArrivalFieldBuilder().getBuilder();
        }

        /**
         * <code>optional .transit_realtime.TripUpdate.StopTimeEvent arrival = 2;</code>
         */
        @Override
        public com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEventOrBuilder getArrivalOrBuilder() {
          if (arrivalBuilder_ != null) {
            return arrivalBuilder_.getMessageOrBuilder();
          } else {
            return arrival_;
          }
        }

        /**
         * <code>optional .transit_realtime.TripUpdate.StopTimeEvent arrival = 2;</code>
         */
        private com.google.protobuf.SingleFieldBuilder<com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent, com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent.Builder, com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEventOrBuilder> getArrivalFieldBuilder() {
          if (arrivalBuilder_ == null) {
            arrivalBuilder_ =
                new com.google.protobuf.SingleFieldBuilder<com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent, com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent.Builder, com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEventOrBuilder>(
                    getArrival(), getParentForChildren(), isClean());
            arrival_ = null;
          }
          return arrivalBuilder_;
        }

        private com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent departure_ =
            com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent.getDefaultInstance();
        private com.google.protobuf.SingleFieldBuilder<com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent, com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent.Builder, com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEventOrBuilder> departureBuilder_;

        /**
         * <code>optional .transit_realtime.TripUpdate.StopTimeEvent departure = 3;</code>
         */
        @Override
        public boolean hasDeparture() {
          return ((bitField0_ & 0x00000008) == 0x00000008);
        }

        /**
         * <code>optional .transit_realtime.TripUpdate.StopTimeEvent departure = 3;</code>
         */
        @Override
        public com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent getDeparture() {
          if (departureBuilder_ == null) {
            return departure_;
          } else {
            return departureBuilder_.getMessage();
          }
        }

        /**
         * <code>optional .transit_realtime.TripUpdate.StopTimeEvent departure = 3;</code>
         */
        public Builder setDeparture(
            com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent value) {
          if (departureBuilder_ == null) {
            if (value == null) {
              throw new NullPointerException();
            }
            departure_ = value;
            onChanged();
          } else {
            departureBuilder_.setMessage(value);
          }
          bitField0_ |= 0x00000008;
          return this;
        }

        /**
         * <code>optional .transit_realtime.TripUpdate.StopTimeEvent departure = 3;</code>
         */
        public Builder setDeparture(
            com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent.Builder builderForValue) {
          if (departureBuilder_ == null) {
            departure_ = builderForValue.build();
            onChanged();
          } else {
            departureBuilder_.setMessage(builderForValue.build());
          }
          bitField0_ |= 0x00000008;
          return this;
        }

        /**
         * <code>optional .transit_realtime.TripUpdate.StopTimeEvent departure = 3;</code>
         */
        public Builder mergeDeparture(
            com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent value) {
          if (departureBuilder_ == null) {
            if (((bitField0_ & 0x00000008) == 0x00000008)
                && departure_ != com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent
                    .getDefaultInstance()) {
              departure_ = com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent
                  .newBuilder(departure_).mergeFrom(value).buildPartial();
            } else {
              departure_ = value;
            }
            onChanged();
          } else {
            departureBuilder_.mergeFrom(value);
          }
          bitField0_ |= 0x00000008;
          return this;
        }

        /**
         * <code>optional .transit_realtime.TripUpdate.StopTimeEvent departure = 3;</code>
         */
        public Builder clearDeparture() {
          if (departureBuilder_ == null) {
            departure_ = com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent
                .getDefaultInstance();
            onChanged();
          } else {
            departureBuilder_.clear();
          }
          bitField0_ = (bitField0_ & ~0x00000008);
          return this;
        }

        /**
         * <code>optional .transit_realtime.TripUpdate.StopTimeEvent departure = 3;</code>
         */
        public com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent.Builder getDepartureBuilder() {
          bitField0_ |= 0x00000008;
          onChanged();
          return getDepartureFieldBuilder().getBuilder();
        }

        /**
         * <code>optional .transit_realtime.TripUpdate.StopTimeEvent departure = 3;</code>
         */
        @Override
        public com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEventOrBuilder getDepartureOrBuilder() {
          if (departureBuilder_ != null) {
            return departureBuilder_.getMessageOrBuilder();
          } else {
            return departure_;
          }
        }

        /**
         * <code>optional .transit_realtime.TripUpdate.StopTimeEvent departure = 3;</code>
         */
        private com.google.protobuf.SingleFieldBuilder<com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent, com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent.Builder, com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEventOrBuilder> getDepartureFieldBuilder() {
          if (departureBuilder_ == null) {
            departureBuilder_ =
                new com.google.protobuf.SingleFieldBuilder<com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent, com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEvent.Builder, com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeEventOrBuilder>(
                    getDeparture(), getParentForChildren(), isClean());
            departure_ = null;
          }
          return departureBuilder_;
        }

        private com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate.ScheduleRelationship scheduleRelationship_ =
            com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate.ScheduleRelationship.SCHEDULED;

        /**
         * <code>optional .transit_realtime.TripUpdate.StopTimeUpdate.ScheduleRelationship schedule_relationship = 5 [default = SCHEDULED];</code>
         */
        @Override
        public boolean hasScheduleRelationship() {
          return ((bitField0_ & 0x00000010) == 0x00000010);
        }

        /**
         * <code>optional .transit_realtime.TripUpdate.StopTimeUpdate.ScheduleRelationship schedule_relationship = 5 [default = SCHEDULED];</code>
         */
        @Override
        public com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate.ScheduleRelationship getScheduleRelationship() {
          return scheduleRelationship_;
        }

        /**
         * <code>optional .transit_realtime.TripUpdate.StopTimeUpdate.ScheduleRelationship schedule_relationship = 5 [default = SCHEDULED];</code>
         */
        public Builder setScheduleRelationship(
            com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate.ScheduleRelationship value) {
          if (value == null) {
            throw new NullPointerException();
          }
          bitField0_ |= 0x00000010;
          scheduleRelationship_ = value;
          onChanged();
          return this;
        }

        /**
         * <code>optional .transit_realtime.TripUpdate.StopTimeUpdate.ScheduleRelationship schedule_relationship = 5 [default = SCHEDULED];</code>
         */
        public Builder clearScheduleRelationship() {
          bitField0_ = (bitField0_ & ~0x00000010);
          scheduleRelationship_ =
              com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate.ScheduleRelationship.SCHEDULED;
          onChanged();
          return this;
        }

        // @@protoc_insertion_point(builder_scope:transit_realtime.TripUpdate.StopTimeUpdate)
      }

      static {
        defaultInstance = new StopTimeUpdate(true);
        defaultInstance.initFields();
      }

      // @@protoc_insertion_point(class_scope:transit_realtime.TripUpdate.StopTimeUpdate)
    }

    private int bitField0_;
    public static final int TRIP_FIELD_NUMBER = 1;
    private com.google.transit.realtime.GtfsRealtime.TripDescriptor trip_;

    /**
     * <code>required .transit_realtime.TripDescriptor trip = 1;</code>
     *
     * <pre>
     * The Trip that this message applies to. There can be at most one
     * TripUpdate entity for each actual trip instance.
     * If there is none, that means there is no prediction information available.
     * It does *not* mean that the trip is progressing according to schedule.
     * </pre>
     */
    @Override
    public boolean hasTrip() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }

    /**
     * <code>required .transit_realtime.TripDescriptor trip = 1;</code>
     *
     * <pre>
     * The Trip that this message applies to. There can be at most one
     * TripUpdate entity for each actual trip instance.
     * If there is none, that means there is no prediction information available.
     * It does *not* mean that the trip is progressing according to schedule.
     * </pre>
     */
    @Override
    public com.google.transit.realtime.GtfsRealtime.TripDescriptor getTrip() {
      return trip_;
    }

    /**
     * <code>required .transit_realtime.TripDescriptor trip = 1;</code>
     *
     * <pre>
     * The Trip that this message applies to. There can be at most one
     * TripUpdate entity for each actual trip instance.
     * If there is none, that means there is no prediction information available.
     * It does *not* mean that the trip is progressing according to schedule.
     * </pre>
     */
    @Override
    public com.google.transit.realtime.GtfsRealtime.TripDescriptorOrBuilder getTripOrBuilder() {
      return trip_;
    }

    public static final int VEHICLE_FIELD_NUMBER = 3;
    private com.google.transit.realtime.GtfsRealtime.VehicleDescriptor vehicle_;

    /**
     * <code>optional .transit_realtime.VehicleDescriptor vehicle = 3;</code>
     *
     * <pre>
     * Additional information on the vehicle that is serving this trip.
     * </pre>
     */
    @Override
    public boolean hasVehicle() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }

    /**
     * <code>optional .transit_realtime.VehicleDescriptor vehicle = 3;</code>
     *
     * <pre>
     * Additional information on the vehicle that is serving this trip.
     * </pre>
     */
    @Override
    public com.google.transit.realtime.GtfsRealtime.VehicleDescriptor getVehicle() {
      return vehicle_;
    }

    /**
     * <code>optional .transit_realtime.VehicleDescriptor vehicle = 3;</code>
     *
     * <pre>
     * Additional information on the vehicle that is serving this trip.
     * </pre>
     */
    @Override
    public com.google.transit.realtime.GtfsRealtime.VehicleDescriptorOrBuilder getVehicleOrBuilder() {
      return vehicle_;
    }

    public static final int STOP_TIME_UPDATE_FIELD_NUMBER = 2;
    private java.util.List<com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate> stopTimeUpdate_;

    /**
     * <code>repeated .transit_realtime.TripUpdate.StopTimeUpdate stop_time_update = 2;</code>
     *
     * <pre>
     * Updates to StopTimes for the trip (both future, i.e., predictions, and in
     * some cases, past ones, i.e., those that already happened).
     * The updates must be sorted by stop_sequence, and apply for all the
     * following stops of the trip up to the next specified one.
     * Example 1:
     * For a trip with 20 stops, a StopTimeUpdate with arrival delay and departure
     * delay of 0 for stop_sequence of the current stop means that the trip is
     * exactly on time.
     * Example 2:
     * For the same trip instance, 3 StopTimeUpdates are provided:
     * - delay of 5 min for stop_sequence 3
     * - delay of 1 min for stop_sequence 8
     * - delay of unspecified duration for stop_sequence 10
     * This will be interpreted as:
     * - stop_sequences 3,4,5,6,7 have delay of 5 min.
     * - stop_sequences 8,9 have delay of 1 min.
     * - stop_sequences 10,... have unknown delay.
     * </pre>
     */
    @Override
    public java.util.List<com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate> getStopTimeUpdateList() {
      return stopTimeUpdate_;
    }

    /**
     * <code>repeated .transit_realtime.TripUpdate.StopTimeUpdate stop_time_update = 2;</code>
     *
     * <pre>
     * Updates to StopTimes for the trip (both future, i.e., predictions, and in
     * some cases, past ones, i.e., those that already happened).
     * The updates must be sorted by stop_sequence, and apply for all the
     * following stops of the trip up to the next specified one.
     * Example 1:
     * For a trip with 20 stops, a StopTimeUpdate with arrival delay and departure
     * delay of 0 for stop_sequence of the current stop means that the trip is
     * exactly on time.
     * Example 2:
     * For the same trip instance, 3 StopTimeUpdates are provided:
     * - delay of 5 min for stop_sequence 3
     * - delay of 1 min for stop_sequence 8
     * - delay of unspecified duration for stop_sequence 10
     * This will be interpreted as:
     * - stop_sequences 3,4,5,6,7 have delay of 5 min.
     * - stop_sequences 8,9 have delay of 1 min.
     * - stop_sequences 10,... have unknown delay.
     * </pre>
     */
    @Override
    public java.util.List<? extends com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdateOrBuilder> getStopTimeUpdateOrBuilderList() {
      return stopTimeUpdate_;
    }

    /**
     * <code>repeated .transit_realtime.TripUpdate.StopTimeUpdate stop_time_update = 2;</code>
     *
     * <pre>
     * Updates to StopTimes for the trip (both future, i.e., predictions, and in
     * some cases, past ones, i.e., those that already happened).
     * The updates must be sorted by stop_sequence, and apply for all the
     * following stops of the trip up to the next specified one.
     * Example 1:
     * For a trip with 20 stops, a StopTimeUpdate with arrival delay and departure
     * delay of 0 for stop_sequence of the current stop means that the trip is
     * exactly on time.
     * Example 2:
     * For the same trip instance, 3 StopTimeUpdates are provided:
     * - delay of 5 min for stop_sequence 3
     * - delay of 1 min for stop_sequence 8
     * - delay of unspecified duration for stop_sequence 10
     * This will be interpreted as:
     * - stop_sequences 3,4,5,6,7 have delay of 5 min.
     * - stop_sequences 8,9 have delay of 1 min.
     * - stop_sequences 10,... have unknown delay.
     * </pre>
     */
    @Override
    public int getStopTimeUpdateCount() {
      return stopTimeUpdate_.size();
    }

    /**
     * <code>repeated .transit_realtime.TripUpdate.StopTimeUpdate stop_time_update = 2;</code>
     *
     * <pre>
     * Updates to StopTimes for the trip (both future, i.e., predictions, and in
     * some cases, past ones, i.e., those that already happened).
     * The updates must be sorted by stop_sequence, and apply for all the
     * following stops of the trip up to the next specified one.
     * Example 1:
     * For a trip with 20 stops, a StopTimeUpdate with arrival delay and departure
     * delay of 0 for stop_sequence of the current stop means that the trip is
     * exactly on time.
     * Example 2:
     * For the same trip instance, 3 StopTimeUpdates are provided:
     * - delay of 5 min for stop_sequence 3
     * - delay of 1 min for stop_sequence 8
     * - delay of unspecified duration for stop_sequence 10
     * This will be interpreted as:
     * - stop_sequences 3,4,5,6,7 have delay of 5 min.
     * - stop_sequences 8,9 have delay of 1 min.
     * - stop_sequences 10,... have unknown delay.
     * </pre>
     */
    @Override
    public com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate getStopTimeUpdate(
        int index) {
      return stopTimeUpdate_.get(index);
    }

    /**
     * <code>repeated .transit_realtime.TripUpdate.StopTimeUpdate stop_time_update = 2;</code>
     *
     * <pre>
     * Updates to StopTimes for the trip (both future, i.e., predictions, and in
     * some cases, past ones, i.e., those that already happened).
     * The updates must be sorted by stop_sequence, and apply for all the
     * following stops of the trip up to the next specified one.
     * Example 1:
     * For a trip with 20 stops, a StopTimeUpdate with arrival delay and departure
     * delay of 0 for stop_sequence of the current stop means that the trip is
     * exactly on time.
     * Example 2:
     * For the same trip instance, 3 StopTimeUpdates are provided:
     * - delay of 5 min for stop_sequence 3
     * - delay of 1 min for stop_sequence 8
     * - delay of unspecified duration for stop_sequence 10
     * This will be interpreted as:
     * - stop_sequences 3,4,5,6,7 have delay of 5 min.
     * - stop_sequences 8,9 have delay of 1 min.
     * - stop_sequences 10,... have unknown delay.
     * </pre>
     */
    @Override
    public com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdateOrBuilder getStopTimeUpdateOrBuilder(
        int index) {
      return stopTimeUpdate_.get(index);
    }

    public static final int TIMESTAMP_FIELD_NUMBER = 4;
    private long timestamp_;

    /**
     * <code>optional uint64 timestamp = 4;</code>
     *
     * <pre>
     * Moment at which the vehicle's real-time progress was measured. In POSIX
     * time (i.e., the number of seconds since January 1st 1970 00:00:00 UTC).
     * </pre>
     */
    @Override
    public boolean hasTimestamp() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }

    /**
     * <code>optional uint64 timestamp = 4;</code>
     *
     * <pre>
     * Moment at which the vehicle's real-time progress was measured. In POSIX
     * time (i.e., the number of seconds since January 1st 1970 00:00:00 UTC).
     * </pre>
     */
    @Override
    public long getTimestamp() {
      return timestamp_;
    }

    public static final int DELAY_FIELD_NUMBER = 5;
    private int delay_;

    /**
     * <code>optional int32 delay = 5;</code>
     *
     * <pre>
     * The current schedule deviation for the trip.  Delay should only be
     * specified when the prediction is given relative to some existing schedule
     * in GTFS.
     * Delay (in seconds) can be positive (meaning that the vehicle is late) or
     * negative (meaning that the vehicle is ahead of schedule). Delay of 0
     * means that the vehicle is exactly on time.
     * Delay information in StopTimeUpdates take precedent of trip-level delay
     * information, such that trip-level delay is only propagated until the next
     * stop along the trip with a StopTimeUpdate delay value specified.
     * Feed providers are strongly encouraged to provide a TripUpdate.timestamp
     * value indicating when the delay value was last updated, in order to
     * evaluate the freshness of the data.
     * NOTE: This field is still experimental, and subject to change. It may be
     * formally adopted in the future.
     * </pre>
     */
    @Override
    public boolean hasDelay() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }

    /**
     * <code>optional int32 delay = 5;</code>
     *
     * <pre>
     * The current schedule deviation for the trip.  Delay should only be
     * specified when the prediction is given relative to some existing schedule
     * in GTFS.
     * Delay (in seconds) can be positive (meaning that the vehicle is late) or
     * negative (meaning that the vehicle is ahead of schedule). Delay of 0
     * means that the vehicle is exactly on time.
     * Delay information in StopTimeUpdates take precedent of trip-level delay
     * information, such that trip-level delay is only propagated until the next
     * stop along the trip with a StopTimeUpdate delay value specified.
     * Feed providers are strongly encouraged to provide a TripUpdate.timestamp
     * value indicating when the delay value was last updated, in order to
     * evaluate the freshness of the data.
     * NOTE: This field is still experimental, and subject to change. It may be
     * formally adopted in the future.
     * </pre>
     */
    @Override
    public int getDelay() {
      return delay_;
    }

    private void initFields() {
      trip_ = com.google.transit.realtime.GtfsRealtime.TripDescriptor.getDefaultInstance();
      vehicle_ = com.google.transit.realtime.GtfsRealtime.VehicleDescriptor.getDefaultInstance();
      stopTimeUpdate_ = java.util.Collections.emptyList();
      timestamp_ = 0L;
      delay_ = 0;
    }

    private byte memoizedIsInitialized = -1;

    @Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1)
        return true;
      if (isInitialized == 0)
        return false;

      if (!hasTrip()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!getTrip().isInitialized()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (hasVehicle()) {
        if (!getVehicle().isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      for (int i = 0; i < getStopTimeUpdateCount(); i++) {
        if (!getStopTimeUpdate(i).isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      if (!extensionsAreInitialized()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    @Override
    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      getSerializedSize();
      com.google.protobuf.GeneratedMessage.ExtendableMessage<com.google.transit.realtime.GtfsRealtime.TripUpdate>.ExtensionWriter extensionWriter =
          newExtensionWriter();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeMessage(1, trip_);
      }
      for (int i = 0; i < stopTimeUpdate_.size(); i++) {
        output.writeMessage(2, stopTimeUpdate_.get(i));
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeMessage(3, vehicle_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeUInt64(4, timestamp_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeInt32(5, delay_);
      }
      extensionWriter.writeUntil(2000, output);
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;

    @Override
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1)
        return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, trip_);
      }
      for (int i = 0; i < stopTimeUpdate_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, stopTimeUpdate_.get(i));
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, vehicle_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream.computeUInt64Size(4, timestamp_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream.computeInt32Size(5, delay_);
      }
      size += extensionsSerializedSize();
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;

    @java.lang.Override
    protected java.lang.Object writeReplace() throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static com.google.transit.realtime.GtfsRealtime.TripUpdate parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.google.transit.realtime.GtfsRealtime.TripUpdate parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.google.transit.realtime.GtfsRealtime.TripUpdate parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.google.transit.realtime.GtfsRealtime.TripUpdate parseFrom(byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.google.transit.realtime.GtfsRealtime.TripUpdate parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return PARSER.parseFrom(input);
    }

    public static com.google.transit.realtime.GtfsRealtime.TripUpdate parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static com.google.transit.realtime.GtfsRealtime.TripUpdate parseDelimitedFrom(
        java.io.InputStream input) throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }

    public static com.google.transit.realtime.GtfsRealtime.TripUpdate parseDelimitedFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }

    public static com.google.transit.realtime.GtfsRealtime.TripUpdate parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return PARSER.parseFrom(input);
    }

    public static com.google.transit.realtime.GtfsRealtime.TripUpdate parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return Builder.create();
    }

    @Override
    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder(
        com.google.transit.realtime.GtfsRealtime.TripUpdate prototype) {
      return newBuilder().mergeFrom(prototype);
    }

    @Override
    public Builder toBuilder() {
      return newBuilder(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }

    /**
     * Protobuf type {@code transit_realtime.TripUpdate}
     *
     * <pre>
     * Realtime update of the progress of a vehicle along a trip.
     * Depending on the value of ScheduleRelationship, a TripUpdate can specify:
     * - A trip that proceeds along the schedule.
     * - A trip that proceeds along a route but has no fixed schedule.
     * - A trip that have been added or removed with regard to schedule.
     * The updates can be for future, predicted arrival/departure events, or for
     * past events that already occurred.
     * Normally, updates should get more precise and more certain (see
     * uncertainty below) as the events gets closer to current time.
     * Even if that is not possible, the information for past events should be
     * precise and certain. In particular, if an update points to time in the past
     * but its update's uncertainty is not 0, the client should conclude that the
     * update is a (wrong) prediction and that the trip has not completed yet.
     * Note that the update can describe a trip that is already completed.
     * To this end, it is enough to provide an update for the last stop of the trip.
     * If the time of that is in the past, the client will conclude from that that
     * the whole trip is in the past (it is possible, although inconsequential, to
     * also provide updates for preceding stops).
     * This option is most relevant for a trip that has completed ahead of schedule,
     * but according to the schedule, the trip is still proceeding at the current
     * time. Removing the updates for this trip could make the client assume
     * that the trip is still proceeding.
     * Note that the feed provider is allowed, but not required, to purge past
     * updates - this is one case where this would be practically useful.
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.ExtendableBuilder<com.google.transit.realtime.GtfsRealtime.TripUpdate, Builder>
        implements
        // @@protoc_insertion_point(builder_implements:transit_realtime.TripUpdate)
        com.google.transit.realtime.GtfsRealtime.TripUpdateOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_TripUpdate_descriptor;
      }

      @Override
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
        return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_TripUpdate_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.google.transit.realtime.GtfsRealtime.TripUpdate.class,
                com.google.transit.realtime.GtfsRealtime.TripUpdate.Builder.class);
      }

      // Construct using com.google.transit.realtime.GtfsRealtime.TripUpdate.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getTripFieldBuilder();
          getVehicleFieldBuilder();
          getStopTimeUpdateFieldBuilder();
        }
      }

      private static Builder create() {
        return new Builder();
      }

      @Override
      public Builder clear() {
        super.clear();
        if (tripBuilder_ == null) {
          trip_ = com.google.transit.realtime.GtfsRealtime.TripDescriptor.getDefaultInstance();
        } else {
          tripBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        if (vehicleBuilder_ == null) {
          vehicle_ =
              com.google.transit.realtime.GtfsRealtime.VehicleDescriptor.getDefaultInstance();
        } else {
          vehicleBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        if (stopTimeUpdateBuilder_ == null) {
          stopTimeUpdate_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000004);
        } else {
          stopTimeUpdateBuilder_.clear();
        }
        timestamp_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000008);
        delay_ = 0;
        bitField0_ = (bitField0_ & ~0x00000010);
        return this;
      }

      @Override
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_TripUpdate_descriptor;
      }

      @Override
      public com.google.transit.realtime.GtfsRealtime.TripUpdate getDefaultInstanceForType() {
        return com.google.transit.realtime.GtfsRealtime.TripUpdate.getDefaultInstance();
      }

      @Override
      public com.google.transit.realtime.GtfsRealtime.TripUpdate build() {
        com.google.transit.realtime.GtfsRealtime.TripUpdate result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public com.google.transit.realtime.GtfsRealtime.TripUpdate buildPartial() {
        com.google.transit.realtime.GtfsRealtime.TripUpdate result =
            new com.google.transit.realtime.GtfsRealtime.TripUpdate(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (tripBuilder_ == null) {
          result.trip_ = trip_;
        } else {
          result.trip_ = tripBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        if (vehicleBuilder_ == null) {
          result.vehicle_ = vehicle_;
        } else {
          result.vehicle_ = vehicleBuilder_.build();
        }
        if (stopTimeUpdateBuilder_ == null) {
          if (((bitField0_ & 0x00000004) == 0x00000004)) {
            stopTimeUpdate_ = java.util.Collections.unmodifiableList(stopTimeUpdate_);
            bitField0_ = (bitField0_ & ~0x00000004);
          }
          result.stopTimeUpdate_ = stopTimeUpdate_;
        } else {
          result.stopTimeUpdate_ = stopTimeUpdateBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000004;
        }
        result.timestamp_ = timestamp_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000008;
        }
        result.delay_ = delay_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.google.transit.realtime.GtfsRealtime.TripUpdate) {
          return mergeFrom((com.google.transit.realtime.GtfsRealtime.TripUpdate) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.google.transit.realtime.GtfsRealtime.TripUpdate other) {
        if (other == com.google.transit.realtime.GtfsRealtime.TripUpdate.getDefaultInstance())
          return this;
        if (other.hasTrip()) {
          mergeTrip(other.getTrip());
        }
        if (other.hasVehicle()) {
          mergeVehicle(other.getVehicle());
        }
        if (stopTimeUpdateBuilder_ == null) {
          if (!other.stopTimeUpdate_.isEmpty()) {
            if (stopTimeUpdate_.isEmpty()) {
              stopTimeUpdate_ = other.stopTimeUpdate_;
              bitField0_ = (bitField0_ & ~0x00000004);
            } else {
              ensureStopTimeUpdateIsMutable();
              stopTimeUpdate_.addAll(other.stopTimeUpdate_);
            }
            onChanged();
          }
        } else {
          if (!other.stopTimeUpdate_.isEmpty()) {
            if (stopTimeUpdateBuilder_.isEmpty()) {
              stopTimeUpdateBuilder_.dispose();
              stopTimeUpdateBuilder_ = null;
              stopTimeUpdate_ = other.stopTimeUpdate_;
              bitField0_ = (bitField0_ & ~0x00000004);
              stopTimeUpdateBuilder_ = com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders
                  ? getStopTimeUpdateFieldBuilder()
                  : null;
            } else {
              stopTimeUpdateBuilder_.addAllMessages(other.stopTimeUpdate_);
            }
          }
        }
        if (other.hasTimestamp()) {
          setTimestamp(other.getTimestamp());
        }
        if (other.hasDelay()) {
          setDelay(other.getDelay());
        }
        this.mergeExtensionFields(other);
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      @Override
      public final boolean isInitialized() {
        if (!hasTrip()) {

          return false;
        }
        if (!getTrip().isInitialized()) {

          return false;
        }
        if (hasVehicle()) {
          if (!getVehicle().isInitialized()) {

            return false;
          }
        }
        for (int i = 0; i < getStopTimeUpdateCount(); i++) {
          if (!getStopTimeUpdate(i).isInitialized()) {

            return false;
          }
        }
        if (!extensionsAreInitialized()) {

          return false;
        }
        return true;
      }

      @Override
      public Builder mergeFrom(com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        com.google.transit.realtime.GtfsRealtime.TripUpdate parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (com.google.transit.realtime.GtfsRealtime.TripUpdate) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private com.google.transit.realtime.GtfsRealtime.TripDescriptor trip_ =
          com.google.transit.realtime.GtfsRealtime.TripDescriptor.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<com.google.transit.realtime.GtfsRealtime.TripDescriptor, com.google.transit.realtime.GtfsRealtime.TripDescriptor.Builder, com.google.transit.realtime.GtfsRealtime.TripDescriptorOrBuilder> tripBuilder_;

      /**
       * <code>required .transit_realtime.TripDescriptor trip = 1;</code>
       *
       * <pre>
       * The Trip that this message applies to. There can be at most one
       * TripUpdate entity for each actual trip instance.
       * If there is none, that means there is no prediction information available.
       * It does *not* mean that the trip is progressing according to schedule.
       * </pre>
       */
      @Override
      public boolean hasTrip() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }

      /**
       * <code>required .transit_realtime.TripDescriptor trip = 1;</code>
       *
       * <pre>
       * The Trip that this message applies to. There can be at most one
       * TripUpdate entity for each actual trip instance.
       * If there is none, that means there is no prediction information available.
       * It does *not* mean that the trip is progressing according to schedule.
       * </pre>
       */
      @Override
      public com.google.transit.realtime.GtfsRealtime.TripDescriptor getTrip() {
        if (tripBuilder_ == null) {
          return trip_;
        } else {
          return tripBuilder_.getMessage();
        }
      }

      /**
       * <code>required .transit_realtime.TripDescriptor trip = 1;</code>
       *
       * <pre>
       * The Trip that this message applies to. There can be at most one
       * TripUpdate entity for each actual trip instance.
       * If there is none, that means there is no prediction information available.
       * It does *not* mean that the trip is progressing according to schedule.
       * </pre>
       */
      public Builder setTrip(com.google.transit.realtime.GtfsRealtime.TripDescriptor value) {
        if (tripBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          trip_ = value;
          onChanged();
        } else {
          tripBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }

      /**
       * <code>required .transit_realtime.TripDescriptor trip = 1;</code>
       *
       * <pre>
       * The Trip that this message applies to. There can be at most one
       * TripUpdate entity for each actual trip instance.
       * If there is none, that means there is no prediction information available.
       * It does *not* mean that the trip is progressing according to schedule.
       * </pre>
       */
      public Builder setTrip(
          com.google.transit.realtime.GtfsRealtime.TripDescriptor.Builder builderForValue) {
        if (tripBuilder_ == null) {
          trip_ = builderForValue.build();
          onChanged();
        } else {
          tripBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }

      /**
       * <code>required .transit_realtime.TripDescriptor trip = 1;</code>
       *
       * <pre>
       * The Trip that this message applies to. There can be at most one
       * TripUpdate entity for each actual trip instance.
       * If there is none, that means there is no prediction information available.
       * It does *not* mean that the trip is progressing according to schedule.
       * </pre>
       */
      public Builder mergeTrip(com.google.transit.realtime.GtfsRealtime.TripDescriptor value) {
        if (tripBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)
              && trip_ != com.google.transit.realtime.GtfsRealtime.TripDescriptor
                  .getDefaultInstance()) {
            trip_ = com.google.transit.realtime.GtfsRealtime.TripDescriptor.newBuilder(trip_)
                .mergeFrom(value).buildPartial();
          } else {
            trip_ = value;
          }
          onChanged();
        } else {
          tripBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }

      /**
       * <code>required .transit_realtime.TripDescriptor trip = 1;</code>
       *
       * <pre>
       * The Trip that this message applies to. There can be at most one
       * TripUpdate entity for each actual trip instance.
       * If there is none, that means there is no prediction information available.
       * It does *not* mean that the trip is progressing according to schedule.
       * </pre>
       */
      public Builder clearTrip() {
        if (tripBuilder_ == null) {
          trip_ = com.google.transit.realtime.GtfsRealtime.TripDescriptor.getDefaultInstance();
          onChanged();
        } else {
          tripBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      /**
       * <code>required .transit_realtime.TripDescriptor trip = 1;</code>
       *
       * <pre>
       * The Trip that this message applies to. There can be at most one
       * TripUpdate entity for each actual trip instance.
       * If there is none, that means there is no prediction information available.
       * It does *not* mean that the trip is progressing according to schedule.
       * </pre>
       */
      public com.google.transit.realtime.GtfsRealtime.TripDescriptor.Builder getTripBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getTripFieldBuilder().getBuilder();
      }

      /**
       * <code>required .transit_realtime.TripDescriptor trip = 1;</code>
       *
       * <pre>
       * The Trip that this message applies to. There can be at most one
       * TripUpdate entity for each actual trip instance.
       * If there is none, that means there is no prediction information available.
       * It does *not* mean that the trip is progressing according to schedule.
       * </pre>
       */
      @Override
      public com.google.transit.realtime.GtfsRealtime.TripDescriptorOrBuilder getTripOrBuilder() {
        if (tripBuilder_ != null) {
          return tripBuilder_.getMessageOrBuilder();
        } else {
          return trip_;
        }
      }

      /**
       * <code>required .transit_realtime.TripDescriptor trip = 1;</code>
       *
       * <pre>
       * The Trip that this message applies to. There can be at most one
       * TripUpdate entity for each actual trip instance.
       * If there is none, that means there is no prediction information available.
       * It does *not* mean that the trip is progressing according to schedule.
       * </pre>
       */
      private com.google.protobuf.SingleFieldBuilder<com.google.transit.realtime.GtfsRealtime.TripDescriptor, com.google.transit.realtime.GtfsRealtime.TripDescriptor.Builder, com.google.transit.realtime.GtfsRealtime.TripDescriptorOrBuilder> getTripFieldBuilder() {
        if (tripBuilder_ == null) {
          tripBuilder_ =
              new com.google.protobuf.SingleFieldBuilder<com.google.transit.realtime.GtfsRealtime.TripDescriptor, com.google.transit.realtime.GtfsRealtime.TripDescriptor.Builder, com.google.transit.realtime.GtfsRealtime.TripDescriptorOrBuilder>(
                  getTrip(), getParentForChildren(), isClean());
          trip_ = null;
        }
        return tripBuilder_;
      }

      private com.google.transit.realtime.GtfsRealtime.VehicleDescriptor vehicle_ =
          com.google.transit.realtime.GtfsRealtime.VehicleDescriptor.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<com.google.transit.realtime.GtfsRealtime.VehicleDescriptor, com.google.transit.realtime.GtfsRealtime.VehicleDescriptor.Builder, com.google.transit.realtime.GtfsRealtime.VehicleDescriptorOrBuilder> vehicleBuilder_;

      /**
       * <code>optional .transit_realtime.VehicleDescriptor vehicle = 3;</code>
       *
       * <pre>
       * Additional information on the vehicle that is serving this trip.
       * </pre>
       */
      @Override
      public boolean hasVehicle() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }

      /**
       * <code>optional .transit_realtime.VehicleDescriptor vehicle = 3;</code>
       *
       * <pre>
       * Additional information on the vehicle that is serving this trip.
       * </pre>
       */
      @Override
      public com.google.transit.realtime.GtfsRealtime.VehicleDescriptor getVehicle() {
        if (vehicleBuilder_ == null) {
          return vehicle_;
        } else {
          return vehicleBuilder_.getMessage();
        }
      }

      /**
       * <code>optional .transit_realtime.VehicleDescriptor vehicle = 3;</code>
       *
       * <pre>
       * Additional information on the vehicle that is serving this trip.
       * </pre>
       */
      public Builder setVehicle(com.google.transit.realtime.GtfsRealtime.VehicleDescriptor value) {
        if (vehicleBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          vehicle_ = value;
          onChanged();
        } else {
          vehicleBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }

      /**
       * <code>optional .transit_realtime.VehicleDescriptor vehicle = 3;</code>
       *
       * <pre>
       * Additional information on the vehicle that is serving this trip.
       * </pre>
       */
      public Builder setVehicle(
          com.google.transit.realtime.GtfsRealtime.VehicleDescriptor.Builder builderForValue) {
        if (vehicleBuilder_ == null) {
          vehicle_ = builderForValue.build();
          onChanged();
        } else {
          vehicleBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        return this;
      }

      /**
       * <code>optional .transit_realtime.VehicleDescriptor vehicle = 3;</code>
       *
       * <pre>
       * Additional information on the vehicle that is serving this trip.
       * </pre>
       */
      public Builder mergeVehicle(
          com.google.transit.realtime.GtfsRealtime.VehicleDescriptor value) {
        if (vehicleBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)
              && vehicle_ != com.google.transit.realtime.GtfsRealtime.VehicleDescriptor
                  .getDefaultInstance()) {
            vehicle_ = com.google.transit.realtime.GtfsRealtime.VehicleDescriptor
                .newBuilder(vehicle_).mergeFrom(value).buildPartial();
          } else {
            vehicle_ = value;
          }
          onChanged();
        } else {
          vehicleBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }

      /**
       * <code>optional .transit_realtime.VehicleDescriptor vehicle = 3;</code>
       *
       * <pre>
       * Additional information on the vehicle that is serving this trip.
       * </pre>
       */
      public Builder clearVehicle() {
        if (vehicleBuilder_ == null) {
          vehicle_ =
              com.google.transit.realtime.GtfsRealtime.VehicleDescriptor.getDefaultInstance();
          onChanged();
        } else {
          vehicleBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      /**
       * <code>optional .transit_realtime.VehicleDescriptor vehicle = 3;</code>
       *
       * <pre>
       * Additional information on the vehicle that is serving this trip.
       * </pre>
       */
      public com.google.transit.realtime.GtfsRealtime.VehicleDescriptor.Builder getVehicleBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getVehicleFieldBuilder().getBuilder();
      }

      /**
       * <code>optional .transit_realtime.VehicleDescriptor vehicle = 3;</code>
       *
       * <pre>
       * Additional information on the vehicle that is serving this trip.
       * </pre>
       */
      @Override
      public com.google.transit.realtime.GtfsRealtime.VehicleDescriptorOrBuilder getVehicleOrBuilder() {
        if (vehicleBuilder_ != null) {
          return vehicleBuilder_.getMessageOrBuilder();
        } else {
          return vehicle_;
        }
      }

      /**
       * <code>optional .transit_realtime.VehicleDescriptor vehicle = 3;</code>
       *
       * <pre>
       * Additional information on the vehicle that is serving this trip.
       * </pre>
       */
      private com.google.protobuf.SingleFieldBuilder<com.google.transit.realtime.GtfsRealtime.VehicleDescriptor, com.google.transit.realtime.GtfsRealtime.VehicleDescriptor.Builder, com.google.transit.realtime.GtfsRealtime.VehicleDescriptorOrBuilder> getVehicleFieldBuilder() {
        if (vehicleBuilder_ == null) {
          vehicleBuilder_ =
              new com.google.protobuf.SingleFieldBuilder<com.google.transit.realtime.GtfsRealtime.VehicleDescriptor, com.google.transit.realtime.GtfsRealtime.VehicleDescriptor.Builder, com.google.transit.realtime.GtfsRealtime.VehicleDescriptorOrBuilder>(
                  getVehicle(), getParentForChildren(), isClean());
          vehicle_ = null;
        }
        return vehicleBuilder_;
      }

      private java.util.List<com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate> stopTimeUpdate_ =
          java.util.Collections.emptyList();

      private void ensureStopTimeUpdateIsMutable() {
        if (!((bitField0_ & 0x00000004) == 0x00000004)) {
          stopTimeUpdate_ =
              new java.util.ArrayList<com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate>(
                  stopTimeUpdate_);
          bitField0_ |= 0x00000004;
        }
      }

      private com.google.protobuf.RepeatedFieldBuilder<com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate, com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate.Builder, com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdateOrBuilder> stopTimeUpdateBuilder_;

      /**
       * <code>repeated .transit_realtime.TripUpdate.StopTimeUpdate stop_time_update = 2;</code>
       *
       * <pre>
       * Updates to StopTimes for the trip (both future, i.e., predictions, and in
       * some cases, past ones, i.e., those that already happened).
       * The updates must be sorted by stop_sequence, and apply for all the
       * following stops of the trip up to the next specified one.
       * Example 1:
       * For a trip with 20 stops, a StopTimeUpdate with arrival delay and departure
       * delay of 0 for stop_sequence of the current stop means that the trip is
       * exactly on time.
       * Example 2:
       * For the same trip instance, 3 StopTimeUpdates are provided:
       * - delay of 5 min for stop_sequence 3
       * - delay of 1 min for stop_sequence 8
       * - delay of unspecified duration for stop_sequence 10
       * This will be interpreted as:
       * - stop_sequences 3,4,5,6,7 have delay of 5 min.
       * - stop_sequences 8,9 have delay of 1 min.
       * - stop_sequences 10,... have unknown delay.
       * </pre>
       */
      @Override
      public java.util.List<com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate> getStopTimeUpdateList() {
        if (stopTimeUpdateBuilder_ == null) {
          return java.util.Collections.unmodifiableList(stopTimeUpdate_);
        } else {
          return stopTimeUpdateBuilder_.getMessageList();
        }
      }

      /**
       * <code>repeated .transit_realtime.TripUpdate.StopTimeUpdate stop_time_update = 2;</code>
       *
       * <pre>
       * Updates to StopTimes for the trip (both future, i.e., predictions, and in
       * some cases, past ones, i.e., those that already happened).
       * The updates must be sorted by stop_sequence, and apply for all the
       * following stops of the trip up to the next specified one.
       * Example 1:
       * For a trip with 20 stops, a StopTimeUpdate with arrival delay and departure
       * delay of 0 for stop_sequence of the current stop means that the trip is
       * exactly on time.
       * Example 2:
       * For the same trip instance, 3 StopTimeUpdates are provided:
       * - delay of 5 min for stop_sequence 3
       * - delay of 1 min for stop_sequence 8
       * - delay of unspecified duration for stop_sequence 10
       * This will be interpreted as:
       * - stop_sequences 3,4,5,6,7 have delay of 5 min.
       * - stop_sequences 8,9 have delay of 1 min.
       * - stop_sequences 10,... have unknown delay.
       * </pre>
       */
      @Override
      public int getStopTimeUpdateCount() {
        if (stopTimeUpdateBuilder_ == null) {
          return stopTimeUpdate_.size();
        } else {
          return stopTimeUpdateBuilder_.getCount();
        }
      }

      /**
       * <code>repeated .transit_realtime.TripUpdate.StopTimeUpdate stop_time_update = 2;</code>
       *
       * <pre>
       * Updates to StopTimes for the trip (both future, i.e., predictions, and in
       * some cases, past ones, i.e., those that already happened).
       * The updates must be sorted by stop_sequence, and apply for all the
       * following stops of the trip up to the next specified one.
       * Example 1:
       * For a trip with 20 stops, a StopTimeUpdate with arrival delay and departure
       * delay of 0 for stop_sequence of the current stop means that the trip is
       * exactly on time.
       * Example 2:
       * For the same trip instance, 3 StopTimeUpdates are provided:
       * - delay of 5 min for stop_sequence 3
       * - delay of 1 min for stop_sequence 8
       * - delay of unspecified duration for stop_sequence 10
       * This will be interpreted as:
       * - stop_sequences 3,4,5,6,7 have delay of 5 min.
       * - stop_sequences 8,9 have delay of 1 min.
       * - stop_sequences 10,... have unknown delay.
       * </pre>
       */
      @Override
      public com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate getStopTimeUpdate(
          int index) {
        if (stopTimeUpdateBuilder_ == null) {
          return stopTimeUpdate_.get(index);
        } else {
          return stopTimeUpdateBuilder_.getMessage(index);
        }
      }

      /**
       * <code>repeated .transit_realtime.TripUpdate.StopTimeUpdate stop_time_update = 2;</code>
       *
       * <pre>
       * Updates to StopTimes for the trip (both future, i.e., predictions, and in
       * some cases, past ones, i.e., those that already happened).
       * The updates must be sorted by stop_sequence, and apply for all the
       * following stops of the trip up to the next specified one.
       * Example 1:
       * For a trip with 20 stops, a StopTimeUpdate with arrival delay and departure
       * delay of 0 for stop_sequence of the current stop means that the trip is
       * exactly on time.
       * Example 2:
       * For the same trip instance, 3 StopTimeUpdates are provided:
       * - delay of 5 min for stop_sequence 3
       * - delay of 1 min for stop_sequence 8
       * - delay of unspecified duration for stop_sequence 10
       * This will be interpreted as:
       * - stop_sequences 3,4,5,6,7 have delay of 5 min.
       * - stop_sequences 8,9 have delay of 1 min.
       * - stop_sequences 10,... have unknown delay.
       * </pre>
       */
      public Builder setStopTimeUpdate(int index,
          com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate value) {
        if (stopTimeUpdateBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureStopTimeUpdateIsMutable();
          stopTimeUpdate_.set(index, value);
          onChanged();
        } else {
          stopTimeUpdateBuilder_.setMessage(index, value);
        }
        return this;
      }

      /**
       * <code>repeated .transit_realtime.TripUpdate.StopTimeUpdate stop_time_update = 2;</code>
       *
       * <pre>
       * Updates to StopTimes for the trip (both future, i.e., predictions, and in
       * some cases, past ones, i.e., those that already happened).
       * The updates must be sorted by stop_sequence, and apply for all the
       * following stops of the trip up to the next specified one.
       * Example 1:
       * For a trip with 20 stops, a StopTimeUpdate with arrival delay and departure
       * delay of 0 for stop_sequence of the current stop means that the trip is
       * exactly on time.
       * Example 2:
       * For the same trip instance, 3 StopTimeUpdates are provided:
       * - delay of 5 min for stop_sequence 3
       * - delay of 1 min for stop_sequence 8
       * - delay of unspecified duration for stop_sequence 10
       * This will be interpreted as:
       * - stop_sequences 3,4,5,6,7 have delay of 5 min.
       * - stop_sequences 8,9 have delay of 1 min.
       * - stop_sequences 10,... have unknown delay.
       * </pre>
       */
      public Builder setStopTimeUpdate(int index,
          com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate.Builder builderForValue) {
        if (stopTimeUpdateBuilder_ == null) {
          ensureStopTimeUpdateIsMutable();
          stopTimeUpdate_.set(index, builderForValue.build());
          onChanged();
        } else {
          stopTimeUpdateBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }

      /**
       * <code>repeated .transit_realtime.TripUpdate.StopTimeUpdate stop_time_update = 2;</code>
       *
       * <pre>
       * Updates to StopTimes for the trip (both future, i.e., predictions, and in
       * some cases, past ones, i.e., those that already happened).
       * The updates must be sorted by stop_sequence, and apply for all the
       * following stops of the trip up to the next specified one.
       * Example 1:
       * For a trip with 20 stops, a StopTimeUpdate with arrival delay and departure
       * delay of 0 for stop_sequence of the current stop means that the trip is
       * exactly on time.
       * Example 2:
       * For the same trip instance, 3 StopTimeUpdates are provided:
       * - delay of 5 min for stop_sequence 3
       * - delay of 1 min for stop_sequence 8
       * - delay of unspecified duration for stop_sequence 10
       * This will be interpreted as:
       * - stop_sequences 3,4,5,6,7 have delay of 5 min.
       * - stop_sequences 8,9 have delay of 1 min.
       * - stop_sequences 10,... have unknown delay.
       * </pre>
       */
      public Builder addStopTimeUpdate(
          com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate value) {
        if (stopTimeUpdateBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureStopTimeUpdateIsMutable();
          stopTimeUpdate_.add(value);
          onChanged();
        } else {
          stopTimeUpdateBuilder_.addMessage(value);
        }
        return this;
      }

      /**
       * <code>repeated .transit_realtime.TripUpdate.StopTimeUpdate stop_time_update = 2;</code>
       *
       * <pre>
       * Updates to StopTimes for the trip (both future, i.e., predictions, and in
       * some cases, past ones, i.e., those that already happened).
       * The updates must be sorted by stop_sequence, and apply for all the
       * following stops of the trip up to the next specified one.
       * Example 1:
       * For a trip with 20 stops, a StopTimeUpdate with arrival delay and departure
       * delay of 0 for stop_sequence of the current stop means that the trip is
       * exactly on time.
       * Example 2:
       * For the same trip instance, 3 StopTimeUpdates are provided:
       * - delay of 5 min for stop_sequence 3
       * - delay of 1 min for stop_sequence 8
       * - delay of unspecified duration for stop_sequence 10
       * This will be interpreted as:
       * - stop_sequences 3,4,5,6,7 have delay of 5 min.
       * - stop_sequences 8,9 have delay of 1 min.
       * - stop_sequences 10,... have unknown delay.
       * </pre>
       */
      public Builder addStopTimeUpdate(int index,
          com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate value) {
        if (stopTimeUpdateBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureStopTimeUpdateIsMutable();
          stopTimeUpdate_.add(index, value);
          onChanged();
        } else {
          stopTimeUpdateBuilder_.addMessage(index, value);
        }
        return this;
      }

      /**
       * <code>repeated .transit_realtime.TripUpdate.StopTimeUpdate stop_time_update = 2;</code>
       *
       * <pre>
       * Updates to StopTimes for the trip (both future, i.e., predictions, and in
       * some cases, past ones, i.e., those that already happened).
       * The updates must be sorted by stop_sequence, and apply for all the
       * following stops of the trip up to the next specified one.
       * Example 1:
       * For a trip with 20 stops, a StopTimeUpdate with arrival delay and departure
       * delay of 0 for stop_sequence of the current stop means that the trip is
       * exactly on time.
       * Example 2:
       * For the same trip instance, 3 StopTimeUpdates are provided:
       * - delay of 5 min for stop_sequence 3
       * - delay of 1 min for stop_sequence 8
       * - delay of unspecified duration for stop_sequence 10
       * This will be interpreted as:
       * - stop_sequences 3,4,5,6,7 have delay of 5 min.
       * - stop_sequences 8,9 have delay of 1 min.
       * - stop_sequences 10,... have unknown delay.
       * </pre>
       */
      public Builder addStopTimeUpdate(
          com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate.Builder builderForValue) {
        if (stopTimeUpdateBuilder_ == null) {
          ensureStopTimeUpdateIsMutable();
          stopTimeUpdate_.add(builderForValue.build());
          onChanged();
        } else {
          stopTimeUpdateBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }

      /**
       * <code>repeated .transit_realtime.TripUpdate.StopTimeUpdate stop_time_update = 2;</code>
       *
       * <pre>
       * Updates to StopTimes for the trip (both future, i.e., predictions, and in
       * some cases, past ones, i.e., those that already happened).
       * The updates must be sorted by stop_sequence, and apply for all the
       * following stops of the trip up to the next specified one.
       * Example 1:
       * For a trip with 20 stops, a StopTimeUpdate with arrival delay and departure
       * delay of 0 for stop_sequence of the current stop means that the trip is
       * exactly on time.
       * Example 2:
       * For the same trip instance, 3 StopTimeUpdates are provided:
       * - delay of 5 min for stop_sequence 3
       * - delay of 1 min for stop_sequence 8
       * - delay of unspecified duration for stop_sequence 10
       * This will be interpreted as:
       * - stop_sequences 3,4,5,6,7 have delay of 5 min.
       * - stop_sequences 8,9 have delay of 1 min.
       * - stop_sequences 10,... have unknown delay.
       * </pre>
       */
      public Builder addStopTimeUpdate(int index,
          com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate.Builder builderForValue) {
        if (stopTimeUpdateBuilder_ == null) {
          ensureStopTimeUpdateIsMutable();
          stopTimeUpdate_.add(index, builderForValue.build());
          onChanged();
        } else {
          stopTimeUpdateBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }

      /**
       * <code>repeated .transit_realtime.TripUpdate.StopTimeUpdate stop_time_update = 2;</code>
       *
       * <pre>
       * Updates to StopTimes for the trip (both future, i.e., predictions, and in
       * some cases, past ones, i.e., those that already happened).
       * The updates must be sorted by stop_sequence, and apply for all the
       * following stops of the trip up to the next specified one.
       * Example 1:
       * For a trip with 20 stops, a StopTimeUpdate with arrival delay and departure
       * delay of 0 for stop_sequence of the current stop means that the trip is
       * exactly on time.
       * Example 2:
       * For the same trip instance, 3 StopTimeUpdates are provided:
       * - delay of 5 min for stop_sequence 3
       * - delay of 1 min for stop_sequence 8
       * - delay of unspecified duration for stop_sequence 10
       * This will be interpreted as:
       * - stop_sequences 3,4,5,6,7 have delay of 5 min.
       * - stop_sequences 8,9 have delay of 1 min.
       * - stop_sequences 10,... have unknown delay.
       * </pre>
       */
      public Builder addAllStopTimeUpdate(
          java.lang.Iterable<? extends com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate> values) {
        if (stopTimeUpdateBuilder_ == null) {
          ensureStopTimeUpdateIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(values, stopTimeUpdate_);
          onChanged();
        } else {
          stopTimeUpdateBuilder_.addAllMessages(values);
        }
        return this;
      }

      /**
       * <code>repeated .transit_realtime.TripUpdate.StopTimeUpdate stop_time_update = 2;</code>
       *
       * <pre>
       * Updates to StopTimes for the trip (both future, i.e., predictions, and in
       * some cases, past ones, i.e., those that already happened).
       * The updates must be sorted by stop_sequence, and apply for all the
       * following stops of the trip up to the next specified one.
       * Example 1:
       * For a trip with 20 stops, a StopTimeUpdate with arrival delay and departure
       * delay of 0 for stop_sequence of the current stop means that the trip is
       * exactly on time.
       * Example 2:
       * For the same trip instance, 3 StopTimeUpdates are provided:
       * - delay of 5 min for stop_sequence 3
       * - delay of 1 min for stop_sequence 8
       * - delay of unspecified duration for stop_sequence 10
       * This will be interpreted as:
       * - stop_sequences 3,4,5,6,7 have delay of 5 min.
       * - stop_sequences 8,9 have delay of 1 min.
       * - stop_sequences 10,... have unknown delay.
       * </pre>
       */
      public Builder clearStopTimeUpdate() {
        if (stopTimeUpdateBuilder_ == null) {
          stopTimeUpdate_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000004);
          onChanged();
        } else {
          stopTimeUpdateBuilder_.clear();
        }
        return this;
      }

      /**
       * <code>repeated .transit_realtime.TripUpdate.StopTimeUpdate stop_time_update = 2;</code>
       *
       * <pre>
       * Updates to StopTimes for the trip (both future, i.e., predictions, and in
       * some cases, past ones, i.e., those that already happened).
       * The updates must be sorted by stop_sequence, and apply for all the
       * following stops of the trip up to the next specified one.
       * Example 1:
       * For a trip with 20 stops, a StopTimeUpdate with arrival delay and departure
       * delay of 0 for stop_sequence of the current stop means that the trip is
       * exactly on time.
       * Example 2:
       * For the same trip instance, 3 StopTimeUpdates are provided:
       * - delay of 5 min for stop_sequence 3
       * - delay of 1 min for stop_sequence 8
       * - delay of unspecified duration for stop_sequence 10
       * This will be interpreted as:
       * - stop_sequences 3,4,5,6,7 have delay of 5 min.
       * - stop_sequences 8,9 have delay of 1 min.
       * - stop_sequences 10,... have unknown delay.
       * </pre>
       */
      public Builder removeStopTimeUpdate(int index) {
        if (stopTimeUpdateBuilder_ == null) {
          ensureStopTimeUpdateIsMutable();
          stopTimeUpdate_.remove(index);
          onChanged();
        } else {
          stopTimeUpdateBuilder_.remove(index);
        }
        return this;
      }

      /**
       * <code>repeated .transit_realtime.TripUpdate.StopTimeUpdate stop_time_update = 2;</code>
       *
       * <pre>
       * Updates to StopTimes for the trip (both future, i.e., predictions, and in
       * some cases, past ones, i.e., those that already happened).
       * The updates must be sorted by stop_sequence, and apply for all the
       * following stops of the trip up to the next specified one.
       * Example 1:
       * For a trip with 20 stops, a StopTimeUpdate with arrival delay and departure
       * delay of 0 for stop_sequence of the current stop means that the trip is
       * exactly on time.
       * Example 2:
       * For the same trip instance, 3 StopTimeUpdates are provided:
       * - delay of 5 min for stop_sequence 3
       * - delay of 1 min for stop_sequence 8
       * - delay of unspecified duration for stop_sequence 10
       * This will be interpreted as:
       * - stop_sequences 3,4,5,6,7 have delay of 5 min.
       * - stop_sequences 8,9 have delay of 1 min.
       * - stop_sequences 10,... have unknown delay.
       * </pre>
       */
      public com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate.Builder getStopTimeUpdateBuilder(
          int index) {
        return getStopTimeUpdateFieldBuilder().getBuilder(index);
      }

      /**
       * <code>repeated .transit_realtime.TripUpdate.StopTimeUpdate stop_time_update = 2;</code>
       *
       * <pre>
       * Updates to StopTimes for the trip (both future, i.e., predictions, and in
       * some cases, past ones, i.e., those that already happened).
       * The updates must be sorted by stop_sequence, and apply for all the
       * following stops of the trip up to the next specified one.
       * Example 1:
       * For a trip with 20 stops, a StopTimeUpdate with arrival delay and departure
       * delay of 0 for stop_sequence of the current stop means that the trip is
       * exactly on time.
       * Example 2:
       * For the same trip instance, 3 StopTimeUpdates are provided:
       * - delay of 5 min for stop_sequence 3
       * - delay of 1 min for stop_sequence 8
       * - delay of unspecified duration for stop_sequence 10
       * This will be interpreted as:
       * - stop_sequences 3,4,5,6,7 have delay of 5 min.
       * - stop_sequences 8,9 have delay of 1 min.
       * - stop_sequences 10,... have unknown delay.
       * </pre>
       */
      @Override
      public com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdateOrBuilder getStopTimeUpdateOrBuilder(
          int index) {
        if (stopTimeUpdateBuilder_ == null) {
          return stopTimeUpdate_.get(index);
        } else {
          return stopTimeUpdateBuilder_.getMessageOrBuilder(index);
        }
      }

      /**
       * <code>repeated .transit_realtime.TripUpdate.StopTimeUpdate stop_time_update = 2;</code>
       *
       * <pre>
       * Updates to StopTimes for the trip (both future, i.e., predictions, and in
       * some cases, past ones, i.e., those that already happened).
       * The updates must be sorted by stop_sequence, and apply for all the
       * following stops of the trip up to the next specified one.
       * Example 1:
       * For a trip with 20 stops, a StopTimeUpdate with arrival delay and departure
       * delay of 0 for stop_sequence of the current stop means that the trip is
       * exactly on time.
       * Example 2:
       * For the same trip instance, 3 StopTimeUpdates are provided:
       * - delay of 5 min for stop_sequence 3
       * - delay of 1 min for stop_sequence 8
       * - delay of unspecified duration for stop_sequence 10
       * This will be interpreted as:
       * - stop_sequences 3,4,5,6,7 have delay of 5 min.
       * - stop_sequences 8,9 have delay of 1 min.
       * - stop_sequences 10,... have unknown delay.
       * </pre>
       */
      @Override
      public java.util.List<? extends com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdateOrBuilder> getStopTimeUpdateOrBuilderList() {
        if (stopTimeUpdateBuilder_ != null) {
          return stopTimeUpdateBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(stopTimeUpdate_);
        }
      }

      /**
       * <code>repeated .transit_realtime.TripUpdate.StopTimeUpdate stop_time_update = 2;</code>
       *
       * <pre>
       * Updates to StopTimes for the trip (both future, i.e., predictions, and in
       * some cases, past ones, i.e., those that already happened).
       * The updates must be sorted by stop_sequence, and apply for all the
       * following stops of the trip up to the next specified one.
       * Example 1:
       * For a trip with 20 stops, a StopTimeUpdate with arrival delay and departure
       * delay of 0 for stop_sequence of the current stop means that the trip is
       * exactly on time.
       * Example 2:
       * For the same trip instance, 3 StopTimeUpdates are provided:
       * - delay of 5 min for stop_sequence 3
       * - delay of 1 min for stop_sequence 8
       * - delay of unspecified duration for stop_sequence 10
       * This will be interpreted as:
       * - stop_sequences 3,4,5,6,7 have delay of 5 min.
       * - stop_sequences 8,9 have delay of 1 min.
       * - stop_sequences 10,... have unknown delay.
       * </pre>
       */
      public com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate.Builder addStopTimeUpdateBuilder() {
        return getStopTimeUpdateFieldBuilder()
            .addBuilder(com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate
                .getDefaultInstance());
      }

      /**
       * <code>repeated .transit_realtime.TripUpdate.StopTimeUpdate stop_time_update = 2;</code>
       *
       * <pre>
       * Updates to StopTimes for the trip (both future, i.e., predictions, and in
       * some cases, past ones, i.e., those that already happened).
       * The updates must be sorted by stop_sequence, and apply for all the
       * following stops of the trip up to the next specified one.
       * Example 1:
       * For a trip with 20 stops, a StopTimeUpdate with arrival delay and departure
       * delay of 0 for stop_sequence of the current stop means that the trip is
       * exactly on time.
       * Example 2:
       * For the same trip instance, 3 StopTimeUpdates are provided:
       * - delay of 5 min for stop_sequence 3
       * - delay of 1 min for stop_sequence 8
       * - delay of unspecified duration for stop_sequence 10
       * This will be interpreted as:
       * - stop_sequences 3,4,5,6,7 have delay of 5 min.
       * - stop_sequences 8,9 have delay of 1 min.
       * - stop_sequences 10,... have unknown delay.
       * </pre>
       */
      public com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate.Builder addStopTimeUpdateBuilder(
          int index) {
        return getStopTimeUpdateFieldBuilder().addBuilder(index,
            com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate
                .getDefaultInstance());
      }

      /**
       * <code>repeated .transit_realtime.TripUpdate.StopTimeUpdate stop_time_update = 2;</code>
       *
       * <pre>
       * Updates to StopTimes for the trip (both future, i.e., predictions, and in
       * some cases, past ones, i.e., those that already happened).
       * The updates must be sorted by stop_sequence, and apply for all the
       * following stops of the trip up to the next specified one.
       * Example 1:
       * For a trip with 20 stops, a StopTimeUpdate with arrival delay and departure
       * delay of 0 for stop_sequence of the current stop means that the trip is
       * exactly on time.
       * Example 2:
       * For the same trip instance, 3 StopTimeUpdates are provided:
       * - delay of 5 min for stop_sequence 3
       * - delay of 1 min for stop_sequence 8
       * - delay of unspecified duration for stop_sequence 10
       * This will be interpreted as:
       * - stop_sequences 3,4,5,6,7 have delay of 5 min.
       * - stop_sequences 8,9 have delay of 1 min.
       * - stop_sequences 10,... have unknown delay.
       * </pre>
       */
      public java.util.List<com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate.Builder> getStopTimeUpdateBuilderList() {
        return getStopTimeUpdateFieldBuilder().getBuilderList();
      }

      private com.google.protobuf.RepeatedFieldBuilder<com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate, com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate.Builder, com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdateOrBuilder> getStopTimeUpdateFieldBuilder() {
        if (stopTimeUpdateBuilder_ == null) {
          stopTimeUpdateBuilder_ =
              new com.google.protobuf.RepeatedFieldBuilder<com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate, com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdate.Builder, com.google.transit.realtime.GtfsRealtime.TripUpdate.StopTimeUpdateOrBuilder>(
                  stopTimeUpdate_, ((bitField0_ & 0x00000004) == 0x00000004),
                  getParentForChildren(), isClean());
          stopTimeUpdate_ = null;
        }
        return stopTimeUpdateBuilder_;
      }

      private long timestamp_;

      /**
       * <code>optional uint64 timestamp = 4;</code>
       *
       * <pre>
       * Moment at which the vehicle's real-time progress was measured. In POSIX
       * time (i.e., the number of seconds since January 1st 1970 00:00:00 UTC).
       * </pre>
       */
      @Override
      public boolean hasTimestamp() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }

      /**
       * <code>optional uint64 timestamp = 4;</code>
       *
       * <pre>
       * Moment at which the vehicle's real-time progress was measured. In POSIX
       * time (i.e., the number of seconds since January 1st 1970 00:00:00 UTC).
       * </pre>
       */
      @Override
      public long getTimestamp() {
        return timestamp_;
      }

      /**
       * <code>optional uint64 timestamp = 4;</code>
       *
       * <pre>
       * Moment at which the vehicle's real-time progress was measured. In POSIX
       * time (i.e., the number of seconds since January 1st 1970 00:00:00 UTC).
       * </pre>
       */
      public Builder setTimestamp(long value) {
        bitField0_ |= 0x00000008;
        timestamp_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>optional uint64 timestamp = 4;</code>
       *
       * <pre>
       * Moment at which the vehicle's real-time progress was measured. In POSIX
       * time (i.e., the number of seconds since January 1st 1970 00:00:00 UTC).
       * </pre>
       */
      public Builder clearTimestamp() {
        bitField0_ = (bitField0_ & ~0x00000008);
        timestamp_ = 0L;
        onChanged();
        return this;
      }

      private int delay_;

      /**
       * <code>optional int32 delay = 5;</code>
       *
       * <pre>
       * The current schedule deviation for the trip.  Delay should only be
       * specified when the prediction is given relative to some existing schedule
       * in GTFS.
       * Delay (in seconds) can be positive (meaning that the vehicle is late) or
       * negative (meaning that the vehicle is ahead of schedule). Delay of 0
       * means that the vehicle is exactly on time.
       * Delay information in StopTimeUpdates take precedent of trip-level delay
       * information, such that trip-level delay is only propagated until the next
       * stop along the trip with a StopTimeUpdate delay value specified.
       * Feed providers are strongly encouraged to provide a TripUpdate.timestamp
       * value indicating when the delay value was last updated, in order to
       * evaluate the freshness of the data.
       * NOTE: This field is still experimental, and subject to change. It may be
       * formally adopted in the future.
       * </pre>
       */
      @Override
      public boolean hasDelay() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }

      /**
       * <code>optional int32 delay = 5;</code>
       *
       * <pre>
       * The current schedule deviation for the trip.  Delay should only be
       * specified when the prediction is given relative to some existing schedule
       * in GTFS.
       * Delay (in seconds) can be positive (meaning that the vehicle is late) or
       * negative (meaning that the vehicle is ahead of schedule). Delay of 0
       * means that the vehicle is exactly on time.
       * Delay information in StopTimeUpdates take precedent of trip-level delay
       * information, such that trip-level delay is only propagated until the next
       * stop along the trip with a StopTimeUpdate delay value specified.
       * Feed providers are strongly encouraged to provide a TripUpdate.timestamp
       * value indicating when the delay value was last updated, in order to
       * evaluate the freshness of the data.
       * NOTE: This field is still experimental, and subject to change. It may be
       * formally adopted in the future.
       * </pre>
       */
      @Override
      public int getDelay() {
        return delay_;
      }

      /**
       * <code>optional int32 delay = 5;</code>
       *
       * <pre>
       * The current schedule deviation for the trip.  Delay should only be
       * specified when the prediction is given relative to some existing schedule
       * in GTFS.
       * Delay (in seconds) can be positive (meaning that the vehicle is late) or
       * negative (meaning that the vehicle is ahead of schedule). Delay of 0
       * means that the vehicle is exactly on time.
       * Delay information in StopTimeUpdates take precedent of trip-level delay
       * information, such that trip-level delay is only propagated until the next
       * stop along the trip with a StopTimeUpdate delay value specified.
       * Feed providers are strongly encouraged to provide a TripUpdate.timestamp
       * value indicating when the delay value was last updated, in order to
       * evaluate the freshness of the data.
       * NOTE: This field is still experimental, and subject to change. It may be
       * formally adopted in the future.
       * </pre>
       */
      public Builder setDelay(int value) {
        bitField0_ |= 0x00000010;
        delay_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>optional int32 delay = 5;</code>
       *
       * <pre>
       * The current schedule deviation for the trip.  Delay should only be
       * specified when the prediction is given relative to some existing schedule
       * in GTFS.
       * Delay (in seconds) can be positive (meaning that the vehicle is late) or
       * negative (meaning that the vehicle is ahead of schedule). Delay of 0
       * means that the vehicle is exactly on time.
       * Delay information in StopTimeUpdates take precedent of trip-level delay
       * information, such that trip-level delay is only propagated until the next
       * stop along the trip with a StopTimeUpdate delay value specified.
       * Feed providers are strongly encouraged to provide a TripUpdate.timestamp
       * value indicating when the delay value was last updated, in order to
       * evaluate the freshness of the data.
       * NOTE: This field is still experimental, and subject to change. It may be
       * formally adopted in the future.
       * </pre>
       */
      public Builder clearDelay() {
        bitField0_ = (bitField0_ & ~0x00000010);
        delay_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:transit_realtime.TripUpdate)
    }

    static {
      defaultInstance = new TripUpdate(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:transit_realtime.TripUpdate)
  }

  public interface VehiclePositionOrBuilder extends
      // @@protoc_insertion_point(interface_extends:transit_realtime.VehiclePosition)
      com.google.protobuf.GeneratedMessage.ExtendableMessageOrBuilder<VehiclePosition> {

    /**
     * <code>optional .transit_realtime.TripDescriptor trip = 1;</code>
     *
     * <pre>
     * The Trip that this vehicle is serving.
     * Can be empty or partial if the vehicle can not be identified with a given
     * trip instance.
     * </pre>
     */
    boolean hasTrip();

    /**
     * <code>optional .transit_realtime.TripDescriptor trip = 1;</code>
     *
     * <pre>
     * The Trip that this vehicle is serving.
     * Can be empty or partial if the vehicle can not be identified with a given
     * trip instance.
     * </pre>
     */
    com.google.transit.realtime.GtfsRealtime.TripDescriptor getTrip();

    /**
     * <code>optional .transit_realtime.TripDescriptor trip = 1;</code>
     *
     * <pre>
     * The Trip that this vehicle is serving.
     * Can be empty or partial if the vehicle can not be identified with a given
     * trip instance.
     * </pre>
     */
    com.google.transit.realtime.GtfsRealtime.TripDescriptorOrBuilder getTripOrBuilder();

    /**
     * <code>optional .transit_realtime.VehicleDescriptor vehicle = 8;</code>
     *
     * <pre>
     * Additional information on the vehicle that is serving this trip.
     * </pre>
     */
    boolean hasVehicle();

    /**
     * <code>optional .transit_realtime.VehicleDescriptor vehicle = 8;</code>
     *
     * <pre>
     * Additional information on the vehicle that is serving this trip.
     * </pre>
     */
    com.google.transit.realtime.GtfsRealtime.VehicleDescriptor getVehicle();

    /**
     * <code>optional .transit_realtime.VehicleDescriptor vehicle = 8;</code>
     *
     * <pre>
     * Additional information on the vehicle that is serving this trip.
     * </pre>
     */
    com.google.transit.realtime.GtfsRealtime.VehicleDescriptorOrBuilder getVehicleOrBuilder();

    /**
     * <code>optional .transit_realtime.Position position = 2;</code>
     *
     * <pre>
     * Current position of this vehicle.
     * </pre>
     */
    boolean hasPosition();

    /**
     * <code>optional .transit_realtime.Position position = 2;</code>
     *
     * <pre>
     * Current position of this vehicle.
     * </pre>
     */
    com.google.transit.realtime.GtfsRealtime.Position getPosition();

    /**
     * <code>optional .transit_realtime.Position position = 2;</code>
     *
     * <pre>
     * Current position of this vehicle.
     * </pre>
     */
    com.google.transit.realtime.GtfsRealtime.PositionOrBuilder getPositionOrBuilder();

    /**
     * <code>optional uint32 current_stop_sequence = 3;</code>
     *
     * <pre>
     * The stop sequence index of the current stop. The meaning of
     * current_stop_sequence (i.e., the stop that it refers to) is determined by
     * current_status.
     * If current_status is missing IN_TRANSIT_TO is assumed.
     * </pre>
     */
    boolean hasCurrentStopSequence();

    /**
     * <code>optional uint32 current_stop_sequence = 3;</code>
     *
     * <pre>
     * The stop sequence index of the current stop. The meaning of
     * current_stop_sequence (i.e., the stop that it refers to) is determined by
     * current_status.
     * If current_status is missing IN_TRANSIT_TO is assumed.
     * </pre>
     */
    int getCurrentStopSequence();

    /**
     * <code>optional string stop_id = 7;</code>
     *
     * <pre>
     * Identifies the current stop. The value must be the same as in stops.txt in
     * the corresponding GTFS feed.
     * </pre>
     */
    boolean hasStopId();

    /**
     * <code>optional string stop_id = 7;</code>
     *
     * <pre>
     * Identifies the current stop. The value must be the same as in stops.txt in
     * the corresponding GTFS feed.
     * </pre>
     */
    java.lang.String getStopId();

    /**
     * <code>optional string stop_id = 7;</code>
     *
     * <pre>
     * Identifies the current stop. The value must be the same as in stops.txt in
     * the corresponding GTFS feed.
     * </pre>
     */
    com.google.protobuf.ByteString getStopIdBytes();

    /**
     * <code>optional .transit_realtime.VehiclePosition.VehicleStopStatus current_status = 4 [default = IN_TRANSIT_TO];</code>
     *
     * <pre>
     * The exact status of the vehicle with respect to the current stop.
     * Ignored if current_stop_sequence is missing.
     * </pre>
     */
    boolean hasCurrentStatus();

    /**
     * <code>optional .transit_realtime.VehiclePosition.VehicleStopStatus current_status = 4 [default = IN_TRANSIT_TO];</code>
     *
     * <pre>
     * The exact status of the vehicle with respect to the current stop.
     * Ignored if current_stop_sequence is missing.
     * </pre>
     */
    com.google.transit.realtime.GtfsRealtime.VehiclePosition.VehicleStopStatus getCurrentStatus();

    /**
     * <code>optional uint64 timestamp = 5;</code>
     *
     * <pre>
     * Moment at which the vehicle's position was measured. In POSIX time
     * (i.e., number of seconds since January 1st 1970 00:00:00 UTC).
     * </pre>
     */
    boolean hasTimestamp();

    /**
     * <code>optional uint64 timestamp = 5;</code>
     *
     * <pre>
     * Moment at which the vehicle's position was measured. In POSIX time
     * (i.e., number of seconds since January 1st 1970 00:00:00 UTC).
     * </pre>
     */
    long getTimestamp();

    /**
     * <code>optional .transit_realtime.VehiclePosition.CongestionLevel congestion_level = 6;</code>
     */
    boolean hasCongestionLevel();

    /**
     * <code>optional .transit_realtime.VehiclePosition.CongestionLevel congestion_level = 6;</code>
     */
    com.google.transit.realtime.GtfsRealtime.VehiclePosition.CongestionLevel getCongestionLevel();

    /**
     * <code>optional .transit_realtime.VehiclePosition.OccupancyStatus occupancy_status = 9;</code>
     */
    boolean hasOccupancyStatus();

    /**
     * <code>optional .transit_realtime.VehiclePosition.OccupancyStatus occupancy_status = 9;</code>
     */
    com.google.transit.realtime.GtfsRealtime.VehiclePosition.OccupancyStatus getOccupancyStatus();
  }
  /**
   * Protobuf type {@code transit_realtime.VehiclePosition}
   *
   * <pre>
   * Realtime positioning information for a given vehicle.
   * </pre>
   */
  public static final class VehiclePosition
      extends com.google.protobuf.GeneratedMessage.ExtendableMessage<VehiclePosition> implements
      // @@protoc_insertion_point(message_implements:transit_realtime.VehiclePosition)
      VehiclePositionOrBuilder {
    // Use VehiclePosition.newBuilder() to construct.
    private VehiclePosition(
        com.google.protobuf.GeneratedMessage.ExtendableBuilder<com.google.transit.realtime.GtfsRealtime.VehiclePosition, ?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }

    private VehiclePosition(boolean noInit) {
      this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }

    private static final VehiclePosition defaultInstance;

    public static VehiclePosition getDefaultInstance() {
      return defaultInstance;
    }

    @Override
    public VehiclePosition getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private VehiclePosition(com.google.protobuf.CodedInputStream input,
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
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              com.google.transit.realtime.GtfsRealtime.TripDescriptor.Builder subBuilder = null;
              if (((bitField0_ & 0x00000001) == 0x00000001)) {
                subBuilder = trip_.toBuilder();
              }
              trip_ =
                  input.readMessage(com.google.transit.realtime.GtfsRealtime.TripDescriptor.PARSER,
                      extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(trip_);
                trip_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000001;
              break;
            }
            case 18: {
              com.google.transit.realtime.GtfsRealtime.Position.Builder subBuilder = null;
              if (((bitField0_ & 0x00000004) == 0x00000004)) {
                subBuilder = position_.toBuilder();
              }
              position_ = input.readMessage(
                  com.google.transit.realtime.GtfsRealtime.Position.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(position_);
                position_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000004;
              break;
            }
            case 24: {
              bitField0_ |= 0x00000008;
              currentStopSequence_ = input.readUInt32();
              break;
            }
            case 32: {
              int rawValue = input.readEnum();
              com.google.transit.realtime.GtfsRealtime.VehiclePosition.VehicleStopStatus value =
                  com.google.transit.realtime.GtfsRealtime.VehiclePosition.VehicleStopStatus
                      .valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(4, rawValue);
              } else {
                bitField0_ |= 0x00000020;
                currentStatus_ = value;
              }
              break;
            }
            case 40: {
              bitField0_ |= 0x00000040;
              timestamp_ = input.readUInt64();
              break;
            }
            case 48: {
              int rawValue = input.readEnum();
              com.google.transit.realtime.GtfsRealtime.VehiclePosition.CongestionLevel value =
                  com.google.transit.realtime.GtfsRealtime.VehiclePosition.CongestionLevel
                      .valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(6, rawValue);
              } else {
                bitField0_ |= 0x00000080;
                congestionLevel_ = value;
              }
              break;
            }
            case 58: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000010;
              stopId_ = bs;
              break;
            }
            case 66: {
              com.google.transit.realtime.GtfsRealtime.VehicleDescriptor.Builder subBuilder = null;
              if (((bitField0_ & 0x00000002) == 0x00000002)) {
                subBuilder = vehicle_.toBuilder();
              }
              vehicle_ = input.readMessage(
                  com.google.transit.realtime.GtfsRealtime.VehicleDescriptor.PARSER,
                  extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(vehicle_);
                vehicle_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000002;
              break;
            }
            case 72: {
              int rawValue = input.readEnum();
              com.google.transit.realtime.GtfsRealtime.VehiclePosition.OccupancyStatus value =
                  com.google.transit.realtime.GtfsRealtime.VehiclePosition.OccupancyStatus
                      .valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(9, rawValue);
              } else {
                bitField0_ |= 0x00000100;
                occupancyStatus_ = value;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e.getMessage())
            .setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_VehiclePosition_descriptor;
    }

    @Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
      return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_VehiclePosition_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.transit.realtime.GtfsRealtime.VehiclePosition.class,
              com.google.transit.realtime.GtfsRealtime.VehiclePosition.Builder.class);
    }

    public static com.google.protobuf.Parser<VehiclePosition> PARSER =
        new com.google.protobuf.AbstractParser<VehiclePosition>() {
          @Override
          public VehiclePosition parsePartialFrom(com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new VehiclePosition(input, extensionRegistry);
          }
        };

    @java.lang.Override
    public com.google.protobuf.Parser<VehiclePosition> getParserForType() {
      return PARSER;
    }

    /**
     * Protobuf enum {@code transit_realtime.VehiclePosition.VehicleStopStatus}
     */
    public enum VehicleStopStatus implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>INCOMING_AT = 0;</code>
       *
       * <pre>
       * The vehicle is just about to arrive at the stop (on a stop
       * display, the vehicle symbol typically flashes).
       * </pre>
       */
      INCOMING_AT(0, 0),
      /**
       * <code>STOPPED_AT = 1;</code>
       *
       * <pre>
       * The vehicle is standing at the stop.
       * </pre>
       */
      STOPPED_AT(1, 1),
      /**
       * <code>IN_TRANSIT_TO = 2;</code>
       *
       * <pre>
       * The vehicle has departed and is in transit to the next stop.
       * </pre>
       */
      IN_TRANSIT_TO(2, 2),;

      /**
       * <code>INCOMING_AT = 0;</code>
       *
       * <pre>
       * The vehicle is just about to arrive at the stop (on a stop
       * display, the vehicle symbol typically flashes).
       * </pre>
       */
      public static final int INCOMING_AT_VALUE = 0;
      /**
       * <code>STOPPED_AT = 1;</code>
       *
       * <pre>
       * The vehicle is standing at the stop.
       * </pre>
       */
      public static final int STOPPED_AT_VALUE = 1;
      /**
       * <code>IN_TRANSIT_TO = 2;</code>
       *
       * <pre>
       * The vehicle has departed and is in transit to the next stop.
       * </pre>
       */
      public static final int IN_TRANSIT_TO_VALUE = 2;


      @Override
      public final int getNumber() {
        return value;
      }

      public static VehicleStopStatus valueOf(int value) {
        switch (value) {
          case 0:
            return INCOMING_AT;
          case 1:
            return STOPPED_AT;
          case 2:
            return IN_TRANSIT_TO;
          default:
            return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<VehicleStopStatus> internalGetValueMap() {
        return internalValueMap;
      }

      private static com.google.protobuf.Internal.EnumLiteMap<VehicleStopStatus> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<VehicleStopStatus>() {
            @Override
            public VehicleStopStatus findValueByNumber(int number) {
              return VehicleStopStatus.valueOf(number);
            }
          };

      @Override
      public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
        return getDescriptor().getValues().get(index);
      }

      @Override
      public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
        return getDescriptor();
      }

      public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
        return com.google.transit.realtime.GtfsRealtime.VehiclePosition.getDescriptor()
            .getEnumTypes().get(0);
      }

      private static final VehicleStopStatus[] VALUES = values();

      public static VehicleStopStatus valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        return VALUES[desc.getIndex()];
      }

      private final int index;
      private final int value;

      private VehicleStopStatus(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:transit_realtime.VehiclePosition.VehicleStopStatus)
    }

    /**
     * Protobuf enum {@code transit_realtime.VehiclePosition.CongestionLevel}
     *
     * <pre>
     * Congestion level that is affecting this vehicle.
     * </pre>
     */
    public enum CongestionLevel implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>UNKNOWN_CONGESTION_LEVEL = 0;</code>
       */
      UNKNOWN_CONGESTION_LEVEL(0, 0),
      /**
       * <code>RUNNING_SMOOTHLY = 1;</code>
       */
      RUNNING_SMOOTHLY(1, 1),
      /**
       * <code>STOP_AND_GO = 2;</code>
       */
      STOP_AND_GO(2, 2),
      /**
       * <code>CONGESTION = 3;</code>
       */
      CONGESTION(3, 3),
      /**
       * <code>SEVERE_CONGESTION = 4;</code>
       *
       * <pre>
       * People leaving their cars.
       * </pre>
       */
      SEVERE_CONGESTION(4, 4),;

      /**
       * <code>UNKNOWN_CONGESTION_LEVEL = 0;</code>
       */
      public static final int UNKNOWN_CONGESTION_LEVEL_VALUE = 0;
      /**
       * <code>RUNNING_SMOOTHLY = 1;</code>
       */
      public static final int RUNNING_SMOOTHLY_VALUE = 1;
      /**
       * <code>STOP_AND_GO = 2;</code>
       */
      public static final int STOP_AND_GO_VALUE = 2;
      /**
       * <code>CONGESTION = 3;</code>
       */
      public static final int CONGESTION_VALUE = 3;
      /**
       * <code>SEVERE_CONGESTION = 4;</code>
       *
       * <pre>
       * People leaving their cars.
       * </pre>
       */
      public static final int SEVERE_CONGESTION_VALUE = 4;


      @Override
      public final int getNumber() {
        return value;
      }

      public static CongestionLevel valueOf(int value) {
        switch (value) {
          case 0:
            return UNKNOWN_CONGESTION_LEVEL;
          case 1:
            return RUNNING_SMOOTHLY;
          case 2:
            return STOP_AND_GO;
          case 3:
            return CONGESTION;
          case 4:
            return SEVERE_CONGESTION;
          default:
            return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<CongestionLevel> internalGetValueMap() {
        return internalValueMap;
      }

      private static com.google.protobuf.Internal.EnumLiteMap<CongestionLevel> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<CongestionLevel>() {
            @Override
            public CongestionLevel findValueByNumber(int number) {
              return CongestionLevel.valueOf(number);
            }
          };

      @Override
      public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
        return getDescriptor().getValues().get(index);
      }

      @Override
      public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
        return getDescriptor();
      }

      public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
        return com.google.transit.realtime.GtfsRealtime.VehiclePosition.getDescriptor()
            .getEnumTypes().get(1);
      }

      private static final CongestionLevel[] VALUES = values();

      public static CongestionLevel valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        return VALUES[desc.getIndex()];
      }

      private final int index;
      private final int value;

      private CongestionLevel(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:transit_realtime.VehiclePosition.CongestionLevel)
    }

    /**
     * Protobuf enum {@code transit_realtime.VehiclePosition.OccupancyStatus}
     *
     * <pre>
     * The degree of passenger occupancy of the vehicle. This field is still
     * experimental, and subject to change. It may be formally adopted in the
     * future.
     * </pre>
     */
    public enum OccupancyStatus implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>EMPTY = 0;</code>
       *
       * <pre>
       * The vehicle is considered empty by most measures, and has few or no
       * passengers onboard, but is still accepting passengers.
       * </pre>
       */
      EMPTY(0, 0),
      /**
       * <code>MANY_SEATS_AVAILABLE = 1;</code>
       *
       * <pre>
       * The vehicle has a relatively large percentage of seats available.
       * What percentage of free seats out of the total seats available is to be
       * considered large enough to fall into this category is determined at the
       * discretion of the producer.
       * </pre>
       */
      MANY_SEATS_AVAILABLE(1, 1),
      /**
       * <code>FEW_SEATS_AVAILABLE = 2;</code>
       *
       * <pre>
       * The vehicle has a relatively small percentage of seats available.
       * What percentage of free seats out of the total seats available is to be
       * considered small enough to fall into this category is determined at the
       * discretion of the feed producer.
       * </pre>
       */
      FEW_SEATS_AVAILABLE(2, 2),
      /**
       * <code>STANDING_ROOM_ONLY = 3;</code>
       *
       * <pre>
       * The vehicle can currently accommodate only standing passengers.
       * </pre>
       */
      STANDING_ROOM_ONLY(3, 3),
      /**
       * <code>CRUSHED_STANDING_ROOM_ONLY = 4;</code>
       *
       * <pre>
       * The vehicle can currently accommodate only standing passengers
       * and has limited space for them.
       * </pre>
       */
      CRUSHED_STANDING_ROOM_ONLY(4, 4),
      /**
       * <code>FULL = 5;</code>
       *
       * <pre>
       * The vehicle is considered full by most measures, but may still be
       * allowing passengers to board.
       * </pre>
       */
      FULL(5, 5),
      /**
       * <code>NOT_ACCEPTING_PASSENGERS = 6;</code>
       *
       * <pre>
       * The vehicle is not accepting additional passengers.
       * </pre>
       */
      NOT_ACCEPTING_PASSENGERS(6, 6),;

      /**
       * <code>EMPTY = 0;</code>
       *
       * <pre>
       * The vehicle is considered empty by most measures, and has few or no
       * passengers onboard, but is still accepting passengers.
       * </pre>
       */
      public static final int EMPTY_VALUE = 0;
      /**
       * <code>MANY_SEATS_AVAILABLE = 1;</code>
       *
       * <pre>
       * The vehicle has a relatively large percentage of seats available.
       * What percentage of free seats out of the total seats available is to be
       * considered large enough to fall into this category is determined at the
       * discretion of the producer.
       * </pre>
       */
      public static final int MANY_SEATS_AVAILABLE_VALUE = 1;
      /**
       * <code>FEW_SEATS_AVAILABLE = 2;</code>
       *
       * <pre>
       * The vehicle has a relatively small percentage of seats available.
       * What percentage of free seats out of the total seats available is to be
       * considered small enough to fall into this category is determined at the
       * discretion of the feed producer.
       * </pre>
       */
      public static final int FEW_SEATS_AVAILABLE_VALUE = 2;
      /**
       * <code>STANDING_ROOM_ONLY = 3;</code>
       *
       * <pre>
       * The vehicle can currently accommodate only standing passengers.
       * </pre>
       */
      public static final int STANDING_ROOM_ONLY_VALUE = 3;
      /**
       * <code>CRUSHED_STANDING_ROOM_ONLY = 4;</code>
       *
       * <pre>
       * The vehicle can currently accommodate only standing passengers
       * and has limited space for them.
       * </pre>
       */
      public static final int CRUSHED_STANDING_ROOM_ONLY_VALUE = 4;
      /**
       * <code>FULL = 5;</code>
       *
       * <pre>
       * The vehicle is considered full by most measures, but may still be
       * allowing passengers to board.
       * </pre>
       */
      public static final int FULL_VALUE = 5;
      /**
       * <code>NOT_ACCEPTING_PASSENGERS = 6;</code>
       *
       * <pre>
       * The vehicle is not accepting additional passengers.
       * </pre>
       */
      public static final int NOT_ACCEPTING_PASSENGERS_VALUE = 6;


      @Override
      public final int getNumber() {
        return value;
      }

      public static OccupancyStatus valueOf(int value) {
        switch (value) {
          case 0:
            return EMPTY;
          case 1:
            return MANY_SEATS_AVAILABLE;
          case 2:
            return FEW_SEATS_AVAILABLE;
          case 3:
            return STANDING_ROOM_ONLY;
          case 4:
            return CRUSHED_STANDING_ROOM_ONLY;
          case 5:
            return FULL;
          case 6:
            return NOT_ACCEPTING_PASSENGERS;
          default:
            return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<OccupancyStatus> internalGetValueMap() {
        return internalValueMap;
      }

      private static com.google.protobuf.Internal.EnumLiteMap<OccupancyStatus> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<OccupancyStatus>() {
            @Override
            public OccupancyStatus findValueByNumber(int number) {
              return OccupancyStatus.valueOf(number);
            }
          };

      @Override
      public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
        return getDescriptor().getValues().get(index);
      }

      @Override
      public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
        return getDescriptor();
      }

      public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
        return com.google.transit.realtime.GtfsRealtime.VehiclePosition.getDescriptor()
            .getEnumTypes().get(2);
      }

      private static final OccupancyStatus[] VALUES = values();

      public static OccupancyStatus valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        return VALUES[desc.getIndex()];
      }

      private final int index;
      private final int value;

      private OccupancyStatus(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:transit_realtime.VehiclePosition.OccupancyStatus)
    }

    private int bitField0_;
    public static final int TRIP_FIELD_NUMBER = 1;
    private com.google.transit.realtime.GtfsRealtime.TripDescriptor trip_;

    /**
     * <code>optional .transit_realtime.TripDescriptor trip = 1;</code>
     *
     * <pre>
     * The Trip that this vehicle is serving.
     * Can be empty or partial if the vehicle can not be identified with a given
     * trip instance.
     * </pre>
     */
    @Override
    public boolean hasTrip() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }

    /**
     * <code>optional .transit_realtime.TripDescriptor trip = 1;</code>
     *
     * <pre>
     * The Trip that this vehicle is serving.
     * Can be empty or partial if the vehicle can not be identified with a given
     * trip instance.
     * </pre>
     */
    @Override
    public com.google.transit.realtime.GtfsRealtime.TripDescriptor getTrip() {
      return trip_;
    }

    /**
     * <code>optional .transit_realtime.TripDescriptor trip = 1;</code>
     *
     * <pre>
     * The Trip that this vehicle is serving.
     * Can be empty or partial if the vehicle can not be identified with a given
     * trip instance.
     * </pre>
     */
    @Override
    public com.google.transit.realtime.GtfsRealtime.TripDescriptorOrBuilder getTripOrBuilder() {
      return trip_;
    }

    public static final int VEHICLE_FIELD_NUMBER = 8;
    private com.google.transit.realtime.GtfsRealtime.VehicleDescriptor vehicle_;

    /**
     * <code>optional .transit_realtime.VehicleDescriptor vehicle = 8;</code>
     *
     * <pre>
     * Additional information on the vehicle that is serving this trip.
     * </pre>
     */
    @Override
    public boolean hasVehicle() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }

    /**
     * <code>optional .transit_realtime.VehicleDescriptor vehicle = 8;</code>
     *
     * <pre>
     * Additional information on the vehicle that is serving this trip.
     * </pre>
     */
    @Override
    public com.google.transit.realtime.GtfsRealtime.VehicleDescriptor getVehicle() {
      return vehicle_;
    }

    /**
     * <code>optional .transit_realtime.VehicleDescriptor vehicle = 8;</code>
     *
     * <pre>
     * Additional information on the vehicle that is serving this trip.
     * </pre>
     */
    @Override
    public com.google.transit.realtime.GtfsRealtime.VehicleDescriptorOrBuilder getVehicleOrBuilder() {
      return vehicle_;
    }

    public static final int POSITION_FIELD_NUMBER = 2;
    private com.google.transit.realtime.GtfsRealtime.Position position_;

    /**
     * <code>optional .transit_realtime.Position position = 2;</code>
     *
     * <pre>
     * Current position of this vehicle.
     * </pre>
     */
    @Override
    public boolean hasPosition() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }

    /**
     * <code>optional .transit_realtime.Position position = 2;</code>
     *
     * <pre>
     * Current position of this vehicle.
     * </pre>
     */
    @Override
    public com.google.transit.realtime.GtfsRealtime.Position getPosition() {
      return position_;
    }

    /**
     * <code>optional .transit_realtime.Position position = 2;</code>
     *
     * <pre>
     * Current position of this vehicle.
     * </pre>
     */
    @Override
    public com.google.transit.realtime.GtfsRealtime.PositionOrBuilder getPositionOrBuilder() {
      return position_;
    }

    public static final int CURRENT_STOP_SEQUENCE_FIELD_NUMBER = 3;
    private int currentStopSequence_;

    /**
     * <code>optional uint32 current_stop_sequence = 3;</code>
     *
     * <pre>
     * The stop sequence index of the current stop. The meaning of
     * current_stop_sequence (i.e., the stop that it refers to) is determined by
     * current_status.
     * If current_status is missing IN_TRANSIT_TO is assumed.
     * </pre>
     */
    @Override
    public boolean hasCurrentStopSequence() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }

    /**
     * <code>optional uint32 current_stop_sequence = 3;</code>
     *
     * <pre>
     * The stop sequence index of the current stop. The meaning of
     * current_stop_sequence (i.e., the stop that it refers to) is determined by
     * current_status.
     * If current_status is missing IN_TRANSIT_TO is assumed.
     * </pre>
     */
    @Override
    public int getCurrentStopSequence() {
      return currentStopSequence_;
    }

    public static final int STOP_ID_FIELD_NUMBER = 7;
    private java.lang.Object stopId_;

    /**
     * <code>optional string stop_id = 7;</code>
     *
     * <pre>
     * Identifies the current stop. The value must be the same as in stops.txt in
     * the corresponding GTFS feed.
     * </pre>
     */
    @Override
    public boolean hasStopId() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }

    /**
     * <code>optional string stop_id = 7;</code>
     *
     * <pre>
     * Identifies the current stop. The value must be the same as in stops.txt in
     * the corresponding GTFS feed.
     * </pre>
     */
    @Override
    public java.lang.String getStopId() {
      java.lang.Object ref = stopId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          stopId_ = s;
        }
        return s;
      }
    }

    /**
     * <code>optional string stop_id = 7;</code>
     *
     * <pre>
     * Identifies the current stop. The value must be the same as in stops.txt in
     * the corresponding GTFS feed.
     * </pre>
     */
    @Override
    public com.google.protobuf.ByteString getStopIdBytes() {
      java.lang.Object ref = stopId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        stopId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int CURRENT_STATUS_FIELD_NUMBER = 4;
    private com.google.transit.realtime.GtfsRealtime.VehiclePosition.VehicleStopStatus currentStatus_;

    /**
     * <code>optional .transit_realtime.VehiclePosition.VehicleStopStatus current_status = 4 [default = IN_TRANSIT_TO];</code>
     *
     * <pre>
     * The exact status of the vehicle with respect to the current stop.
     * Ignored if current_stop_sequence is missing.
     * </pre>
     */
    @Override
    public boolean hasCurrentStatus() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }

    /**
     * <code>optional .transit_realtime.VehiclePosition.VehicleStopStatus current_status = 4 [default = IN_TRANSIT_TO];</code>
     *
     * <pre>
     * The exact status of the vehicle with respect to the current stop.
     * Ignored if current_stop_sequence is missing.
     * </pre>
     */
    @Override
    public com.google.transit.realtime.GtfsRealtime.VehiclePosition.VehicleStopStatus getCurrentStatus() {
      return currentStatus_;
    }

    public static final int TIMESTAMP_FIELD_NUMBER = 5;
    private long timestamp_;

    /**
     * <code>optional uint64 timestamp = 5;</code>
     *
     * <pre>
     * Moment at which the vehicle's position was measured. In POSIX time
     * (i.e., number of seconds since January 1st 1970 00:00:00 UTC).
     * </pre>
     */
    @Override
    public boolean hasTimestamp() {
      return ((bitField0_ & 0x00000040) == 0x00000040);
    }

    /**
     * <code>optional uint64 timestamp = 5;</code>
     *
     * <pre>
     * Moment at which the vehicle's position was measured. In POSIX time
     * (i.e., number of seconds since January 1st 1970 00:00:00 UTC).
     * </pre>
     */
    @Override
    public long getTimestamp() {
      return timestamp_;
    }

    public static final int CONGESTION_LEVEL_FIELD_NUMBER = 6;
    private com.google.transit.realtime.GtfsRealtime.VehiclePosition.CongestionLevel congestionLevel_;

    /**
     * <code>optional .transit_realtime.VehiclePosition.CongestionLevel congestion_level = 6;</code>
     */
    @Override
    public boolean hasCongestionLevel() {
      return ((bitField0_ & 0x00000080) == 0x00000080);
    }

    /**
     * <code>optional .transit_realtime.VehiclePosition.CongestionLevel congestion_level = 6;</code>
     */
    @Override
    public com.google.transit.realtime.GtfsRealtime.VehiclePosition.CongestionLevel getCongestionLevel() {
      return congestionLevel_;
    }

    public static final int OCCUPANCY_STATUS_FIELD_NUMBER = 9;
    private com.google.transit.realtime.GtfsRealtime.VehiclePosition.OccupancyStatus occupancyStatus_;

    /**
     * <code>optional .transit_realtime.VehiclePosition.OccupancyStatus occupancy_status = 9;</code>
     */
    @Override
    public boolean hasOccupancyStatus() {
      return ((bitField0_ & 0x00000100) == 0x00000100);
    }

    /**
     * <code>optional .transit_realtime.VehiclePosition.OccupancyStatus occupancy_status = 9;</code>
     */
    @Override
    public com.google.transit.realtime.GtfsRealtime.VehiclePosition.OccupancyStatus getOccupancyStatus() {
      return occupancyStatus_;
    }

    private void initFields() {
      trip_ = com.google.transit.realtime.GtfsRealtime.TripDescriptor.getDefaultInstance();
      vehicle_ = com.google.transit.realtime.GtfsRealtime.VehicleDescriptor.getDefaultInstance();
      position_ = com.google.transit.realtime.GtfsRealtime.Position.getDefaultInstance();
      currentStopSequence_ = 0;
      stopId_ = "";
      currentStatus_ =
          com.google.transit.realtime.GtfsRealtime.VehiclePosition.VehicleStopStatus.IN_TRANSIT_TO;
      timestamp_ = 0L;
      congestionLevel_ =
          com.google.transit.realtime.GtfsRealtime.VehiclePosition.CongestionLevel.UNKNOWN_CONGESTION_LEVEL;
      occupancyStatus_ =
          com.google.transit.realtime.GtfsRealtime.VehiclePosition.OccupancyStatus.EMPTY;
    }

    private byte memoizedIsInitialized = -1;

    @Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1)
        return true;
      if (isInitialized == 0)
        return false;

      if (hasTrip()) {
        if (!getTrip().isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      if (hasVehicle()) {
        if (!getVehicle().isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      if (hasPosition()) {
        if (!getPosition().isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      if (!extensionsAreInitialized()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    @Override
    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      getSerializedSize();
      com.google.protobuf.GeneratedMessage.ExtendableMessage<com.google.transit.realtime.GtfsRealtime.VehiclePosition>.ExtensionWriter extensionWriter =
          newExtensionWriter();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeMessage(1, trip_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeMessage(2, position_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeUInt32(3, currentStopSequence_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        output.writeEnum(4, currentStatus_.getNumber());
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        output.writeUInt64(5, timestamp_);
      }
      if (((bitField0_ & 0x00000080) == 0x00000080)) {
        output.writeEnum(6, congestionLevel_.getNumber());
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeBytes(7, getStopIdBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeMessage(8, vehicle_);
      }
      if (((bitField0_ & 0x00000100) == 0x00000100)) {
        output.writeEnum(9, occupancyStatus_.getNumber());
      }
      extensionWriter.writeUntil(2000, output);
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;

    @Override
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1)
        return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, trip_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, position_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream.computeUInt32Size(3, currentStopSequence_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        size +=
            com.google.protobuf.CodedOutputStream.computeEnumSize(4, currentStatus_.getNumber());
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        size += com.google.protobuf.CodedOutputStream.computeUInt64Size(5, timestamp_);
      }
      if (((bitField0_ & 0x00000080) == 0x00000080)) {
        size +=
            com.google.protobuf.CodedOutputStream.computeEnumSize(6, congestionLevel_.getNumber());
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream.computeBytesSize(7, getStopIdBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(8, vehicle_);
      }
      if (((bitField0_ & 0x00000100) == 0x00000100)) {
        size +=
            com.google.protobuf.CodedOutputStream.computeEnumSize(9, occupancyStatus_.getNumber());
      }
      size += extensionsSerializedSize();
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;

    @java.lang.Override
    protected java.lang.Object writeReplace() throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static com.google.transit.realtime.GtfsRealtime.VehiclePosition parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.google.transit.realtime.GtfsRealtime.VehiclePosition parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.google.transit.realtime.GtfsRealtime.VehiclePosition parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.google.transit.realtime.GtfsRealtime.VehiclePosition parseFrom(byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.google.transit.realtime.GtfsRealtime.VehiclePosition parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return PARSER.parseFrom(input);
    }

    public static com.google.transit.realtime.GtfsRealtime.VehiclePosition parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static com.google.transit.realtime.GtfsRealtime.VehiclePosition parseDelimitedFrom(
        java.io.InputStream input) throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }

    public static com.google.transit.realtime.GtfsRealtime.VehiclePosition parseDelimitedFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }

    public static com.google.transit.realtime.GtfsRealtime.VehiclePosition parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return PARSER.parseFrom(input);
    }

    public static com.google.transit.realtime.GtfsRealtime.VehiclePosition parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return Builder.create();
    }

    @Override
    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder(
        com.google.transit.realtime.GtfsRealtime.VehiclePosition prototype) {
      return newBuilder().mergeFrom(prototype);
    }

    @Override
    public Builder toBuilder() {
      return newBuilder(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }

    /**
     * Protobuf type {@code transit_realtime.VehiclePosition}
     *
     * <pre>
     * Realtime positioning information for a given vehicle.
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.ExtendableBuilder<com.google.transit.realtime.GtfsRealtime.VehiclePosition, Builder>
        implements
        // @@protoc_insertion_point(builder_implements:transit_realtime.VehiclePosition)
        com.google.transit.realtime.GtfsRealtime.VehiclePositionOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_VehiclePosition_descriptor;
      }

      @Override
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
        return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_VehiclePosition_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.google.transit.realtime.GtfsRealtime.VehiclePosition.class,
                com.google.transit.realtime.GtfsRealtime.VehiclePosition.Builder.class);
      }

      // Construct using com.google.transit.realtime.GtfsRealtime.VehiclePosition.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getTripFieldBuilder();
          getVehicleFieldBuilder();
          getPositionFieldBuilder();
        }
      }

      private static Builder create() {
        return new Builder();
      }

      @Override
      public Builder clear() {
        super.clear();
        if (tripBuilder_ == null) {
          trip_ = com.google.transit.realtime.GtfsRealtime.TripDescriptor.getDefaultInstance();
        } else {
          tripBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        if (vehicleBuilder_ == null) {
          vehicle_ =
              com.google.transit.realtime.GtfsRealtime.VehicleDescriptor.getDefaultInstance();
        } else {
          vehicleBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        if (positionBuilder_ == null) {
          position_ = com.google.transit.realtime.GtfsRealtime.Position.getDefaultInstance();
        } else {
          positionBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        currentStopSequence_ = 0;
        bitField0_ = (bitField0_ & ~0x00000008);
        stopId_ = "";
        bitField0_ = (bitField0_ & ~0x00000010);
        currentStatus_ =
            com.google.transit.realtime.GtfsRealtime.VehiclePosition.VehicleStopStatus.IN_TRANSIT_TO;
        bitField0_ = (bitField0_ & ~0x00000020);
        timestamp_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000040);
        congestionLevel_ =
            com.google.transit.realtime.GtfsRealtime.VehiclePosition.CongestionLevel.UNKNOWN_CONGESTION_LEVEL;
        bitField0_ = (bitField0_ & ~0x00000080);
        occupancyStatus_ =
            com.google.transit.realtime.GtfsRealtime.VehiclePosition.OccupancyStatus.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000100);
        return this;
      }

      @Override
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_VehiclePosition_descriptor;
      }

      @Override
      public com.google.transit.realtime.GtfsRealtime.VehiclePosition getDefaultInstanceForType() {
        return com.google.transit.realtime.GtfsRealtime.VehiclePosition.getDefaultInstance();
      }

      @Override
      public com.google.transit.realtime.GtfsRealtime.VehiclePosition build() {
        com.google.transit.realtime.GtfsRealtime.VehiclePosition result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public com.google.transit.realtime.GtfsRealtime.VehiclePosition buildPartial() {
        com.google.transit.realtime.GtfsRealtime.VehiclePosition result =
            new com.google.transit.realtime.GtfsRealtime.VehiclePosition(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (tripBuilder_ == null) {
          result.trip_ = trip_;
        } else {
          result.trip_ = tripBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        if (vehicleBuilder_ == null) {
          result.vehicle_ = vehicle_;
        } else {
          result.vehicle_ = vehicleBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        if (positionBuilder_ == null) {
          result.position_ = position_;
        } else {
          result.position_ = positionBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.currentStopSequence_ = currentStopSequence_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.stopId_ = stopId_;
        if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
          to_bitField0_ |= 0x00000020;
        }
        result.currentStatus_ = currentStatus_;
        if (((from_bitField0_ & 0x00000040) == 0x00000040)) {
          to_bitField0_ |= 0x00000040;
        }
        result.timestamp_ = timestamp_;
        if (((from_bitField0_ & 0x00000080) == 0x00000080)) {
          to_bitField0_ |= 0x00000080;
        }
        result.congestionLevel_ = congestionLevel_;
        if (((from_bitField0_ & 0x00000100) == 0x00000100)) {
          to_bitField0_ |= 0x00000100;
        }
        result.occupancyStatus_ = occupancyStatus_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.google.transit.realtime.GtfsRealtime.VehiclePosition) {
          return mergeFrom((com.google.transit.realtime.GtfsRealtime.VehiclePosition) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.google.transit.realtime.GtfsRealtime.VehiclePosition other) {
        if (other == com.google.transit.realtime.GtfsRealtime.VehiclePosition.getDefaultInstance())
          return this;
        if (other.hasTrip()) {
          mergeTrip(other.getTrip());
        }
        if (other.hasVehicle()) {
          mergeVehicle(other.getVehicle());
        }
        if (other.hasPosition()) {
          mergePosition(other.getPosition());
        }
        if (other.hasCurrentStopSequence()) {
          setCurrentStopSequence(other.getCurrentStopSequence());
        }
        if (other.hasStopId()) {
          bitField0_ |= 0x00000010;
          stopId_ = other.stopId_;
          onChanged();
        }
        if (other.hasCurrentStatus()) {
          setCurrentStatus(other.getCurrentStatus());
        }
        if (other.hasTimestamp()) {
          setTimestamp(other.getTimestamp());
        }
        if (other.hasCongestionLevel()) {
          setCongestionLevel(other.getCongestionLevel());
        }
        if (other.hasOccupancyStatus()) {
          setOccupancyStatus(other.getOccupancyStatus());
        }
        this.mergeExtensionFields(other);
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      @Override
      public final boolean isInitialized() {
        if (hasTrip()) {
          if (!getTrip().isInitialized()) {

            return false;
          }
        }
        if (hasVehicle()) {
          if (!getVehicle().isInitialized()) {

            return false;
          }
        }
        if (hasPosition()) {
          if (!getPosition().isInitialized()) {

            return false;
          }
        }
        if (!extensionsAreInitialized()) {

          return false;
        }
        return true;
      }

      @Override
      public Builder mergeFrom(com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        com.google.transit.realtime.GtfsRealtime.VehiclePosition parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (com.google.transit.realtime.GtfsRealtime.VehiclePosition) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private com.google.transit.realtime.GtfsRealtime.TripDescriptor trip_ =
          com.google.transit.realtime.GtfsRealtime.TripDescriptor.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<com.google.transit.realtime.GtfsRealtime.TripDescriptor, com.google.transit.realtime.GtfsRealtime.TripDescriptor.Builder, com.google.transit.realtime.GtfsRealtime.TripDescriptorOrBuilder> tripBuilder_;

      /**
       * <code>optional .transit_realtime.TripDescriptor trip = 1;</code>
       *
       * <pre>
       * The Trip that this vehicle is serving.
       * Can be empty or partial if the vehicle can not be identified with a given
       * trip instance.
       * </pre>
       */
      @Override
      public boolean hasTrip() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }

      /**
       * <code>optional .transit_realtime.TripDescriptor trip = 1;</code>
       *
       * <pre>
       * The Trip that this vehicle is serving.
       * Can be empty or partial if the vehicle can not be identified with a given
       * trip instance.
       * </pre>
       */
      @Override
      public com.google.transit.realtime.GtfsRealtime.TripDescriptor getTrip() {
        if (tripBuilder_ == null) {
          return trip_;
        } else {
          return tripBuilder_.getMessage();
        }
      }

      /**
       * <code>optional .transit_realtime.TripDescriptor trip = 1;</code>
       *
       * <pre>
       * The Trip that this vehicle is serving.
       * Can be empty or partial if the vehicle can not be identified with a given
       * trip instance.
       * </pre>
       */
      public Builder setTrip(com.google.transit.realtime.GtfsRealtime.TripDescriptor value) {
        if (tripBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          trip_ = value;
          onChanged();
        } else {
          tripBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }

      /**
       * <code>optional .transit_realtime.TripDescriptor trip = 1;</code>
       *
       * <pre>
       * The Trip that this vehicle is serving.
       * Can be empty or partial if the vehicle can not be identified with a given
       * trip instance.
       * </pre>
       */
      public Builder setTrip(
          com.google.transit.realtime.GtfsRealtime.TripDescriptor.Builder builderForValue) {
        if (tripBuilder_ == null) {
          trip_ = builderForValue.build();
          onChanged();
        } else {
          tripBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }

      /**
       * <code>optional .transit_realtime.TripDescriptor trip = 1;</code>
       *
       * <pre>
       * The Trip that this vehicle is serving.
       * Can be empty or partial if the vehicle can not be identified with a given
       * trip instance.
       * </pre>
       */
      public Builder mergeTrip(com.google.transit.realtime.GtfsRealtime.TripDescriptor value) {
        if (tripBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)
              && trip_ != com.google.transit.realtime.GtfsRealtime.TripDescriptor
                  .getDefaultInstance()) {
            trip_ = com.google.transit.realtime.GtfsRealtime.TripDescriptor.newBuilder(trip_)
                .mergeFrom(value).buildPartial();
          } else {
            trip_ = value;
          }
          onChanged();
        } else {
          tripBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }

      /**
       * <code>optional .transit_realtime.TripDescriptor trip = 1;</code>
       *
       * <pre>
       * The Trip that this vehicle is serving.
       * Can be empty or partial if the vehicle can not be identified with a given
       * trip instance.
       * </pre>
       */
      public Builder clearTrip() {
        if (tripBuilder_ == null) {
          trip_ = com.google.transit.realtime.GtfsRealtime.TripDescriptor.getDefaultInstance();
          onChanged();
        } else {
          tripBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      /**
       * <code>optional .transit_realtime.TripDescriptor trip = 1;</code>
       *
       * <pre>
       * The Trip that this vehicle is serving.
       * Can be empty or partial if the vehicle can not be identified with a given
       * trip instance.
       * </pre>
       */
      public com.google.transit.realtime.GtfsRealtime.TripDescriptor.Builder getTripBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getTripFieldBuilder().getBuilder();
      }

      /**
       * <code>optional .transit_realtime.TripDescriptor trip = 1;</code>
       *
       * <pre>
       * The Trip that this vehicle is serving.
       * Can be empty or partial if the vehicle can not be identified with a given
       * trip instance.
       * </pre>
       */
      @Override
      public com.google.transit.realtime.GtfsRealtime.TripDescriptorOrBuilder getTripOrBuilder() {
        if (tripBuilder_ != null) {
          return tripBuilder_.getMessageOrBuilder();
        } else {
          return trip_;
        }
      }

      /**
       * <code>optional .transit_realtime.TripDescriptor trip = 1;</code>
       *
       * <pre>
       * The Trip that this vehicle is serving.
       * Can be empty or partial if the vehicle can not be identified with a given
       * trip instance.
       * </pre>
       */
      private com.google.protobuf.SingleFieldBuilder<com.google.transit.realtime.GtfsRealtime.TripDescriptor, com.google.transit.realtime.GtfsRealtime.TripDescriptor.Builder, com.google.transit.realtime.GtfsRealtime.TripDescriptorOrBuilder> getTripFieldBuilder() {
        if (tripBuilder_ == null) {
          tripBuilder_ =
              new com.google.protobuf.SingleFieldBuilder<com.google.transit.realtime.GtfsRealtime.TripDescriptor, com.google.transit.realtime.GtfsRealtime.TripDescriptor.Builder, com.google.transit.realtime.GtfsRealtime.TripDescriptorOrBuilder>(
                  getTrip(), getParentForChildren(), isClean());
          trip_ = null;
        }
        return tripBuilder_;
      }

      private com.google.transit.realtime.GtfsRealtime.VehicleDescriptor vehicle_ =
          com.google.transit.realtime.GtfsRealtime.VehicleDescriptor.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<com.google.transit.realtime.GtfsRealtime.VehicleDescriptor, com.google.transit.realtime.GtfsRealtime.VehicleDescriptor.Builder, com.google.transit.realtime.GtfsRealtime.VehicleDescriptorOrBuilder> vehicleBuilder_;

      /**
       * <code>optional .transit_realtime.VehicleDescriptor vehicle = 8;</code>
       *
       * <pre>
       * Additional information on the vehicle that is serving this trip.
       * </pre>
       */
      @Override
      public boolean hasVehicle() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }

      /**
       * <code>optional .transit_realtime.VehicleDescriptor vehicle = 8;</code>
       *
       * <pre>
       * Additional information on the vehicle that is serving this trip.
       * </pre>
       */
      @Override
      public com.google.transit.realtime.GtfsRealtime.VehicleDescriptor getVehicle() {
        if (vehicleBuilder_ == null) {
          return vehicle_;
        } else {
          return vehicleBuilder_.getMessage();
        }
      }

      /**
       * <code>optional .transit_realtime.VehicleDescriptor vehicle = 8;</code>
       *
       * <pre>
       * Additional information on the vehicle that is serving this trip.
       * </pre>
       */
      public Builder setVehicle(com.google.transit.realtime.GtfsRealtime.VehicleDescriptor value) {
        if (vehicleBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          vehicle_ = value;
          onChanged();
        } else {
          vehicleBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }

      /**
       * <code>optional .transit_realtime.VehicleDescriptor vehicle = 8;</code>
       *
       * <pre>
       * Additional information on the vehicle that is serving this trip.
       * </pre>
       */
      public Builder setVehicle(
          com.google.transit.realtime.GtfsRealtime.VehicleDescriptor.Builder builderForValue) {
        if (vehicleBuilder_ == null) {
          vehicle_ = builderForValue.build();
          onChanged();
        } else {
          vehicleBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        return this;
      }

      /**
       * <code>optional .transit_realtime.VehicleDescriptor vehicle = 8;</code>
       *
       * <pre>
       * Additional information on the vehicle that is serving this trip.
       * </pre>
       */
      public Builder mergeVehicle(
          com.google.transit.realtime.GtfsRealtime.VehicleDescriptor value) {
        if (vehicleBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)
              && vehicle_ != com.google.transit.realtime.GtfsRealtime.VehicleDescriptor
                  .getDefaultInstance()) {
            vehicle_ = com.google.transit.realtime.GtfsRealtime.VehicleDescriptor
                .newBuilder(vehicle_).mergeFrom(value).buildPartial();
          } else {
            vehicle_ = value;
          }
          onChanged();
        } else {
          vehicleBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }

      /**
       * <code>optional .transit_realtime.VehicleDescriptor vehicle = 8;</code>
       *
       * <pre>
       * Additional information on the vehicle that is serving this trip.
       * </pre>
       */
      public Builder clearVehicle() {
        if (vehicleBuilder_ == null) {
          vehicle_ =
              com.google.transit.realtime.GtfsRealtime.VehicleDescriptor.getDefaultInstance();
          onChanged();
        } else {
          vehicleBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      /**
       * <code>optional .transit_realtime.VehicleDescriptor vehicle = 8;</code>
       *
       * <pre>
       * Additional information on the vehicle that is serving this trip.
       * </pre>
       */
      public com.google.transit.realtime.GtfsRealtime.VehicleDescriptor.Builder getVehicleBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getVehicleFieldBuilder().getBuilder();
      }

      /**
       * <code>optional .transit_realtime.VehicleDescriptor vehicle = 8;</code>
       *
       * <pre>
       * Additional information on the vehicle that is serving this trip.
       * </pre>
       */
      @Override
      public com.google.transit.realtime.GtfsRealtime.VehicleDescriptorOrBuilder getVehicleOrBuilder() {
        if (vehicleBuilder_ != null) {
          return vehicleBuilder_.getMessageOrBuilder();
        } else {
          return vehicle_;
        }
      }

      /**
       * <code>optional .transit_realtime.VehicleDescriptor vehicle = 8;</code>
       *
       * <pre>
       * Additional information on the vehicle that is serving this trip.
       * </pre>
       */
      private com.google.protobuf.SingleFieldBuilder<com.google.transit.realtime.GtfsRealtime.VehicleDescriptor, com.google.transit.realtime.GtfsRealtime.VehicleDescriptor.Builder, com.google.transit.realtime.GtfsRealtime.VehicleDescriptorOrBuilder> getVehicleFieldBuilder() {
        if (vehicleBuilder_ == null) {
          vehicleBuilder_ =
              new com.google.protobuf.SingleFieldBuilder<com.google.transit.realtime.GtfsRealtime.VehicleDescriptor, com.google.transit.realtime.GtfsRealtime.VehicleDescriptor.Builder, com.google.transit.realtime.GtfsRealtime.VehicleDescriptorOrBuilder>(
                  getVehicle(), getParentForChildren(), isClean());
          vehicle_ = null;
        }
        return vehicleBuilder_;
      }

      private com.google.transit.realtime.GtfsRealtime.Position position_ =
          com.google.transit.realtime.GtfsRealtime.Position.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<com.google.transit.realtime.GtfsRealtime.Position, com.google.transit.realtime.GtfsRealtime.Position.Builder, com.google.transit.realtime.GtfsRealtime.PositionOrBuilder> positionBuilder_;

      /**
       * <code>optional .transit_realtime.Position position = 2;</code>
       *
       * <pre>
       * Current position of this vehicle.
       * </pre>
       */
      @Override
      public boolean hasPosition() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }

      /**
       * <code>optional .transit_realtime.Position position = 2;</code>
       *
       * <pre>
       * Current position of this vehicle.
       * </pre>
       */
      @Override
      public com.google.transit.realtime.GtfsRealtime.Position getPosition() {
        if (positionBuilder_ == null) {
          return position_;
        } else {
          return positionBuilder_.getMessage();
        }
      }

      /**
       * <code>optional .transit_realtime.Position position = 2;</code>
       *
       * <pre>
       * Current position of this vehicle.
       * </pre>
       */
      public Builder setPosition(com.google.transit.realtime.GtfsRealtime.Position value) {
        if (positionBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          position_ = value;
          onChanged();
        } else {
          positionBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }

      /**
       * <code>optional .transit_realtime.Position position = 2;</code>
       *
       * <pre>
       * Current position of this vehicle.
       * </pre>
       */
      public Builder setPosition(
          com.google.transit.realtime.GtfsRealtime.Position.Builder builderForValue) {
        if (positionBuilder_ == null) {
          position_ = builderForValue.build();
          onChanged();
        } else {
          positionBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000004;
        return this;
      }

      /**
       * <code>optional .transit_realtime.Position position = 2;</code>
       *
       * <pre>
       * Current position of this vehicle.
       * </pre>
       */
      public Builder mergePosition(com.google.transit.realtime.GtfsRealtime.Position value) {
        if (positionBuilder_ == null) {
          if (((bitField0_ & 0x00000004) == 0x00000004)
              && position_ != com.google.transit.realtime.GtfsRealtime.Position
                  .getDefaultInstance()) {
            position_ = com.google.transit.realtime.GtfsRealtime.Position.newBuilder(position_)
                .mergeFrom(value).buildPartial();
          } else {
            position_ = value;
          }
          onChanged();
        } else {
          positionBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }

      /**
       * <code>optional .transit_realtime.Position position = 2;</code>
       *
       * <pre>
       * Current position of this vehicle.
       * </pre>
       */
      public Builder clearPosition() {
        if (positionBuilder_ == null) {
          position_ = com.google.transit.realtime.GtfsRealtime.Position.getDefaultInstance();
          onChanged();
        } else {
          positionBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      /**
       * <code>optional .transit_realtime.Position position = 2;</code>
       *
       * <pre>
       * Current position of this vehicle.
       * </pre>
       */
      public com.google.transit.realtime.GtfsRealtime.Position.Builder getPositionBuilder() {
        bitField0_ |= 0x00000004;
        onChanged();
        return getPositionFieldBuilder().getBuilder();
      }

      /**
       * <code>optional .transit_realtime.Position position = 2;</code>
       *
       * <pre>
       * Current position of this vehicle.
       * </pre>
       */
      @Override
      public com.google.transit.realtime.GtfsRealtime.PositionOrBuilder getPositionOrBuilder() {
        if (positionBuilder_ != null) {
          return positionBuilder_.getMessageOrBuilder();
        } else {
          return position_;
        }
      }

      /**
       * <code>optional .transit_realtime.Position position = 2;</code>
       *
       * <pre>
       * Current position of this vehicle.
       * </pre>
       */
      private com.google.protobuf.SingleFieldBuilder<com.google.transit.realtime.GtfsRealtime.Position, com.google.transit.realtime.GtfsRealtime.Position.Builder, com.google.transit.realtime.GtfsRealtime.PositionOrBuilder> getPositionFieldBuilder() {
        if (positionBuilder_ == null) {
          positionBuilder_ =
              new com.google.protobuf.SingleFieldBuilder<com.google.transit.realtime.GtfsRealtime.Position, com.google.transit.realtime.GtfsRealtime.Position.Builder, com.google.transit.realtime.GtfsRealtime.PositionOrBuilder>(
                  getPosition(), getParentForChildren(), isClean());
          position_ = null;
        }
        return positionBuilder_;
      }

      private int currentStopSequence_;

      /**
       * <code>optional uint32 current_stop_sequence = 3;</code>
       *
       * <pre>
       * The stop sequence index of the current stop. The meaning of
       * current_stop_sequence (i.e., the stop that it refers to) is determined by
       * current_status.
       * If current_status is missing IN_TRANSIT_TO is assumed.
       * </pre>
       */
      @Override
      public boolean hasCurrentStopSequence() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }

      /**
       * <code>optional uint32 current_stop_sequence = 3;</code>
       *
       * <pre>
       * The stop sequence index of the current stop. The meaning of
       * current_stop_sequence (i.e., the stop that it refers to) is determined by
       * current_status.
       * If current_status is missing IN_TRANSIT_TO is assumed.
       * </pre>
       */
      @Override
      public int getCurrentStopSequence() {
        return currentStopSequence_;
      }

      /**
       * <code>optional uint32 current_stop_sequence = 3;</code>
       *
       * <pre>
       * The stop sequence index of the current stop. The meaning of
       * current_stop_sequence (i.e., the stop that it refers to) is determined by
       * current_status.
       * If current_status is missing IN_TRANSIT_TO is assumed.
       * </pre>
       */
      public Builder setCurrentStopSequence(int value) {
        bitField0_ |= 0x00000008;
        currentStopSequence_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>optional uint32 current_stop_sequence = 3;</code>
       *
       * <pre>
       * The stop sequence index of the current stop. The meaning of
       * current_stop_sequence (i.e., the stop that it refers to) is determined by
       * current_status.
       * If current_status is missing IN_TRANSIT_TO is assumed.
       * </pre>
       */
      public Builder clearCurrentStopSequence() {
        bitField0_ = (bitField0_ & ~0x00000008);
        currentStopSequence_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object stopId_ = "";

      /**
       * <code>optional string stop_id = 7;</code>
       *
       * <pre>
       * Identifies the current stop. The value must be the same as in stops.txt in
       * the corresponding GTFS feed.
       * </pre>
       */
      @Override
      public boolean hasStopId() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }

      /**
       * <code>optional string stop_id = 7;</code>
       *
       * <pre>
       * Identifies the current stop. The value must be the same as in stops.txt in
       * the corresponding GTFS feed.
       * </pre>
       */
      @Override
      public java.lang.String getStopId() {
        java.lang.Object ref = stopId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            stopId_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }

      /**
       * <code>optional string stop_id = 7;</code>
       *
       * <pre>
       * Identifies the current stop. The value must be the same as in stops.txt in
       * the corresponding GTFS feed.
       * </pre>
       */
      @Override
      public com.google.protobuf.ByteString getStopIdBytes() {
        java.lang.Object ref = stopId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          stopId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }

      /**
       * <code>optional string stop_id = 7;</code>
       *
       * <pre>
       * Identifies the current stop. The value must be the same as in stops.txt in
       * the corresponding GTFS feed.
       * </pre>
       */
      public Builder setStopId(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000010;
        stopId_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>optional string stop_id = 7;</code>
       *
       * <pre>
       * Identifies the current stop. The value must be the same as in stops.txt in
       * the corresponding GTFS feed.
       * </pre>
       */
      public Builder clearStopId() {
        bitField0_ = (bitField0_ & ~0x00000010);
        stopId_ = getDefaultInstance().getStopId();
        onChanged();
        return this;
      }

      /**
       * <code>optional string stop_id = 7;</code>
       *
       * <pre>
       * Identifies the current stop. The value must be the same as in stops.txt in
       * the corresponding GTFS feed.
       * </pre>
       */
      public Builder setStopIdBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000010;
        stopId_ = value;
        onChanged();
        return this;
      }

      private com.google.transit.realtime.GtfsRealtime.VehiclePosition.VehicleStopStatus currentStatus_ =
          com.google.transit.realtime.GtfsRealtime.VehiclePosition.VehicleStopStatus.IN_TRANSIT_TO;

      /**
       * <code>optional .transit_realtime.VehiclePosition.VehicleStopStatus current_status = 4 [default = IN_TRANSIT_TO];</code>
       *
       * <pre>
       * The exact status of the vehicle with respect to the current stop.
       * Ignored if current_stop_sequence is missing.
       * </pre>
       */
      @Override
      public boolean hasCurrentStatus() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }

      /**
       * <code>optional .transit_realtime.VehiclePosition.VehicleStopStatus current_status = 4 [default = IN_TRANSIT_TO];</code>
       *
       * <pre>
       * The exact status of the vehicle with respect to the current stop.
       * Ignored if current_stop_sequence is missing.
       * </pre>
       */
      @Override
      public com.google.transit.realtime.GtfsRealtime.VehiclePosition.VehicleStopStatus getCurrentStatus() {
        return currentStatus_;
      }

      /**
       * <code>optional .transit_realtime.VehiclePosition.VehicleStopStatus current_status = 4 [default = IN_TRANSIT_TO];</code>
       *
       * <pre>
       * The exact status of the vehicle with respect to the current stop.
       * Ignored if current_stop_sequence is missing.
       * </pre>
       */
      public Builder setCurrentStatus(
          com.google.transit.realtime.GtfsRealtime.VehiclePosition.VehicleStopStatus value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000020;
        currentStatus_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>optional .transit_realtime.VehiclePosition.VehicleStopStatus current_status = 4 [default = IN_TRANSIT_TO];</code>
       *
       * <pre>
       * The exact status of the vehicle with respect to the current stop.
       * Ignored if current_stop_sequence is missing.
       * </pre>
       */
      public Builder clearCurrentStatus() {
        bitField0_ = (bitField0_ & ~0x00000020);
        currentStatus_ =
            com.google.transit.realtime.GtfsRealtime.VehiclePosition.VehicleStopStatus.IN_TRANSIT_TO;
        onChanged();
        return this;
      }

      private long timestamp_;

      /**
       * <code>optional uint64 timestamp = 5;</code>
       *
       * <pre>
       * Moment at which the vehicle's position was measured. In POSIX time
       * (i.e., number of seconds since January 1st 1970 00:00:00 UTC).
       * </pre>
       */
      @Override
      public boolean hasTimestamp() {
        return ((bitField0_ & 0x00000040) == 0x00000040);
      }

      /**
       * <code>optional uint64 timestamp = 5;</code>
       *
       * <pre>
       * Moment at which the vehicle's position was measured. In POSIX time
       * (i.e., number of seconds since January 1st 1970 00:00:00 UTC).
       * </pre>
       */
      @Override
      public long getTimestamp() {
        return timestamp_;
      }

      /**
       * <code>optional uint64 timestamp = 5;</code>
       *
       * <pre>
       * Moment at which the vehicle's position was measured. In POSIX time
       * (i.e., number of seconds since January 1st 1970 00:00:00 UTC).
       * </pre>
       */
      public Builder setTimestamp(long value) {
        bitField0_ |= 0x00000040;
        timestamp_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>optional uint64 timestamp = 5;</code>
       *
       * <pre>
       * Moment at which the vehicle's position was measured. In POSIX time
       * (i.e., number of seconds since January 1st 1970 00:00:00 UTC).
       * </pre>
       */
      public Builder clearTimestamp() {
        bitField0_ = (bitField0_ & ~0x00000040);
        timestamp_ = 0L;
        onChanged();
        return this;
      }

      private com.google.transit.realtime.GtfsRealtime.VehiclePosition.CongestionLevel congestionLevel_ =
          com.google.transit.realtime.GtfsRealtime.VehiclePosition.CongestionLevel.UNKNOWN_CONGESTION_LEVEL;

      /**
       * <code>optional .transit_realtime.VehiclePosition.CongestionLevel congestion_level = 6;</code>
       */
      @Override
      public boolean hasCongestionLevel() {
        return ((bitField0_ & 0x00000080) == 0x00000080);
      }

      /**
       * <code>optional .transit_realtime.VehiclePosition.CongestionLevel congestion_level = 6;</code>
       */
      @Override
      public com.google.transit.realtime.GtfsRealtime.VehiclePosition.CongestionLevel getCongestionLevel() {
        return congestionLevel_;
      }

      /**
       * <code>optional .transit_realtime.VehiclePosition.CongestionLevel congestion_level = 6;</code>
       */
      public Builder setCongestionLevel(
          com.google.transit.realtime.GtfsRealtime.VehiclePosition.CongestionLevel value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000080;
        congestionLevel_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>optional .transit_realtime.VehiclePosition.CongestionLevel congestion_level = 6;</code>
       */
      public Builder clearCongestionLevel() {
        bitField0_ = (bitField0_ & ~0x00000080);
        congestionLevel_ =
            com.google.transit.realtime.GtfsRealtime.VehiclePosition.CongestionLevel.UNKNOWN_CONGESTION_LEVEL;
        onChanged();
        return this;
      }

      private com.google.transit.realtime.GtfsRealtime.VehiclePosition.OccupancyStatus occupancyStatus_ =
          com.google.transit.realtime.GtfsRealtime.VehiclePosition.OccupancyStatus.EMPTY;

      /**
       * <code>optional .transit_realtime.VehiclePosition.OccupancyStatus occupancy_status = 9;</code>
       */
      @Override
      public boolean hasOccupancyStatus() {
        return ((bitField0_ & 0x00000100) == 0x00000100);
      }

      /**
       * <code>optional .transit_realtime.VehiclePosition.OccupancyStatus occupancy_status = 9;</code>
       */
      @Override
      public com.google.transit.realtime.GtfsRealtime.VehiclePosition.OccupancyStatus getOccupancyStatus() {
        return occupancyStatus_;
      }

      /**
       * <code>optional .transit_realtime.VehiclePosition.OccupancyStatus occupancy_status = 9;</code>
       */
      public Builder setOccupancyStatus(
          com.google.transit.realtime.GtfsRealtime.VehiclePosition.OccupancyStatus value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000100;
        occupancyStatus_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>optional .transit_realtime.VehiclePosition.OccupancyStatus occupancy_status = 9;</code>
       */
      public Builder clearOccupancyStatus() {
        bitField0_ = (bitField0_ & ~0x00000100);
        occupancyStatus_ =
            com.google.transit.realtime.GtfsRealtime.VehiclePosition.OccupancyStatus.EMPTY;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:transit_realtime.VehiclePosition)
    }

    static {
      defaultInstance = new VehiclePosition(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:transit_realtime.VehiclePosition)
  }

  public interface AlertOrBuilder extends
      // @@protoc_insertion_point(interface_extends:transit_realtime.Alert)
      com.google.protobuf.GeneratedMessage.ExtendableMessageOrBuilder<Alert> {

    /**
     * <code>repeated .transit_realtime.TimeRange active_period = 1;</code>
     *
     * <pre>
     * Time when the alert should be shown to the user. If missing, the
     * alert will be shown as long as it appears in the feed.
     * If multiple ranges are given, the alert will be shown during all of them.
     * </pre>
     */
    java.util.List<com.google.transit.realtime.GtfsRealtime.TimeRange> getActivePeriodList();

    /**
     * <code>repeated .transit_realtime.TimeRange active_period = 1;</code>
     *
     * <pre>
     * Time when the alert should be shown to the user. If missing, the
     * alert will be shown as long as it appears in the feed.
     * If multiple ranges are given, the alert will be shown during all of them.
     * </pre>
     */
    com.google.transit.realtime.GtfsRealtime.TimeRange getActivePeriod(int index);

    /**
     * <code>repeated .transit_realtime.TimeRange active_period = 1;</code>
     *
     * <pre>
     * Time when the alert should be shown to the user. If missing, the
     * alert will be shown as long as it appears in the feed.
     * If multiple ranges are given, the alert will be shown during all of them.
     * </pre>
     */
    int getActivePeriodCount();

    /**
     * <code>repeated .transit_realtime.TimeRange active_period = 1;</code>
     *
     * <pre>
     * Time when the alert should be shown to the user. If missing, the
     * alert will be shown as long as it appears in the feed.
     * If multiple ranges are given, the alert will be shown during all of them.
     * </pre>
     */
    java.util.List<? extends com.google.transit.realtime.GtfsRealtime.TimeRangeOrBuilder> getActivePeriodOrBuilderList();

    /**
     * <code>repeated .transit_realtime.TimeRange active_period = 1;</code>
     *
     * <pre>
     * Time when the alert should be shown to the user. If missing, the
     * alert will be shown as long as it appears in the feed.
     * If multiple ranges are given, the alert will be shown during all of them.
     * </pre>
     */
    com.google.transit.realtime.GtfsRealtime.TimeRangeOrBuilder getActivePeriodOrBuilder(int index);

    /**
     * <code>repeated .transit_realtime.EntitySelector informed_entity = 5;</code>
     *
     * <pre>
     * Entities whose users we should notify of this alert.
     * </pre>
     */
    java.util.List<com.google.transit.realtime.GtfsRealtime.EntitySelector> getInformedEntityList();

    /**
     * <code>repeated .transit_realtime.EntitySelector informed_entity = 5;</code>
     *
     * <pre>
     * Entities whose users we should notify of this alert.
     * </pre>
     */
    com.google.transit.realtime.GtfsRealtime.EntitySelector getInformedEntity(int index);

    /**
     * <code>repeated .transit_realtime.EntitySelector informed_entity = 5;</code>
     *
     * <pre>
     * Entities whose users we should notify of this alert.
     * </pre>
     */
    int getInformedEntityCount();

    /**
     * <code>repeated .transit_realtime.EntitySelector informed_entity = 5;</code>
     *
     * <pre>
     * Entities whose users we should notify of this alert.
     * </pre>
     */
    java.util.List<? extends com.google.transit.realtime.GtfsRealtime.EntitySelectorOrBuilder> getInformedEntityOrBuilderList();

    /**
     * <code>repeated .transit_realtime.EntitySelector informed_entity = 5;</code>
     *
     * <pre>
     * Entities whose users we should notify of this alert.
     * </pre>
     */
    com.google.transit.realtime.GtfsRealtime.EntitySelectorOrBuilder getInformedEntityOrBuilder(
        int index);

    /**
     * <code>optional .transit_realtime.Alert.Cause cause = 6 [default = UNKNOWN_CAUSE];</code>
     */
    boolean hasCause();

    /**
     * <code>optional .transit_realtime.Alert.Cause cause = 6 [default = UNKNOWN_CAUSE];</code>
     */
    com.google.transit.realtime.GtfsRealtime.Alert.Cause getCause();

    /**
     * <code>optional .transit_realtime.Alert.Effect effect = 7 [default = UNKNOWN_EFFECT];</code>
     */
    boolean hasEffect();

    /**
     * <code>optional .transit_realtime.Alert.Effect effect = 7 [default = UNKNOWN_EFFECT];</code>
     */
    com.google.transit.realtime.GtfsRealtime.Alert.Effect getEffect();

    /**
     * <code>optional .transit_realtime.TranslatedString url = 8;</code>
     *
     * <pre>
     * The URL which provides additional information about the alert.
     * </pre>
     */
    boolean hasUrl();

    /**
     * <code>optional .transit_realtime.TranslatedString url = 8;</code>
     *
     * <pre>
     * The URL which provides additional information about the alert.
     * </pre>
     */
    com.google.transit.realtime.GtfsRealtime.TranslatedString getUrl();

    /**
     * <code>optional .transit_realtime.TranslatedString url = 8;</code>
     *
     * <pre>
     * The URL which provides additional information about the alert.
     * </pre>
     */
    com.google.transit.realtime.GtfsRealtime.TranslatedStringOrBuilder getUrlOrBuilder();

    /**
     * <code>optional .transit_realtime.TranslatedString header_text = 10;</code>
     *
     * <pre>
     * Alert header. Contains a short summary of the alert text as plain-text.
     * </pre>
     */
    boolean hasHeaderText();

    /**
     * <code>optional .transit_realtime.TranslatedString header_text = 10;</code>
     *
     * <pre>
     * Alert header. Contains a short summary of the alert text as plain-text.
     * </pre>
     */
    com.google.transit.realtime.GtfsRealtime.TranslatedString getHeaderText();

    /**
     * <code>optional .transit_realtime.TranslatedString header_text = 10;</code>
     *
     * <pre>
     * Alert header. Contains a short summary of the alert text as plain-text.
     * </pre>
     */
    com.google.transit.realtime.GtfsRealtime.TranslatedStringOrBuilder getHeaderTextOrBuilder();

    /**
     * <code>optional .transit_realtime.TranslatedString description_text = 11;</code>
     *
     * <pre>
     * Full description for the alert as plain-text. The information in the
     * description should add to the information of the header.
     * </pre>
     */
    boolean hasDescriptionText();

    /**
     * <code>optional .transit_realtime.TranslatedString description_text = 11;</code>
     *
     * <pre>
     * Full description for the alert as plain-text. The information in the
     * description should add to the information of the header.
     * </pre>
     */
    com.google.transit.realtime.GtfsRealtime.TranslatedString getDescriptionText();

    /**
     * <code>optional .transit_realtime.TranslatedString description_text = 11;</code>
     *
     * <pre>
     * Full description for the alert as plain-text. The information in the
     * description should add to the information of the header.
     * </pre>
     */
    com.google.transit.realtime.GtfsRealtime.TranslatedStringOrBuilder getDescriptionTextOrBuilder();

    /**
     * <code>optional .transit_realtime.TranslatedString tts_header_text = 12;</code>
     *
     * <pre>
     * Text for alert header to be used in text-to-speech implementations. This field is the text-to-speech version of header_text.
     * This field is still experimental, and subject to change. It may be formally adopted in the future.
     * </pre>
     */
    boolean hasTtsHeaderText();

    /**
     * <code>optional .transit_realtime.TranslatedString tts_header_text = 12;</code>
     *
     * <pre>
     * Text for alert header to be used in text-to-speech implementations. This field is the text-to-speech version of header_text.
     * This field is still experimental, and subject to change. It may be formally adopted in the future.
     * </pre>
     */
    com.google.transit.realtime.GtfsRealtime.TranslatedString getTtsHeaderText();

    /**
     * <code>optional .transit_realtime.TranslatedString tts_header_text = 12;</code>
     *
     * <pre>
     * Text for alert header to be used in text-to-speech implementations. This field is the text-to-speech version of header_text.
     * This field is still experimental, and subject to change. It may be formally adopted in the future.
     * </pre>
     */
    com.google.transit.realtime.GtfsRealtime.TranslatedStringOrBuilder getTtsHeaderTextOrBuilder();

    /**
     * <code>optional .transit_realtime.TranslatedString tts_description_text = 13;</code>
     *
     * <pre>
     * Text for full description for the alert to be used in text-to-speech implementations. This field is the text-to-speech version of description_text.
     * This field is still experimental, and subject to change. It may be formally adopted in the future.
     * </pre>
     */
    boolean hasTtsDescriptionText();

    /**
     * <code>optional .transit_realtime.TranslatedString tts_description_text = 13;</code>
     *
     * <pre>
     * Text for full description for the alert to be used in text-to-speech implementations. This field is the text-to-speech version of description_text.
     * This field is still experimental, and subject to change. It may be formally adopted in the future.
     * </pre>
     */
    com.google.transit.realtime.GtfsRealtime.TranslatedString getTtsDescriptionText();

    /**
     * <code>optional .transit_realtime.TranslatedString tts_description_text = 13;</code>
     *
     * <pre>
     * Text for full description for the alert to be used in text-to-speech implementations. This field is the text-to-speech version of description_text.
     * This field is still experimental, and subject to change. It may be formally adopted in the future.
     * </pre>
     */
    com.google.transit.realtime.GtfsRealtime.TranslatedStringOrBuilder getTtsDescriptionTextOrBuilder();

    /**
     * <code>optional .transit_realtime.Alert.SeverityLevel severity_level = 14 [default = UNKNOWN_SEVERITY];</code>
     */
    boolean hasSeverityLevel();

    /**
     * <code>optional .transit_realtime.Alert.SeverityLevel severity_level = 14 [default = UNKNOWN_SEVERITY];</code>
     */
    com.google.transit.realtime.GtfsRealtime.Alert.SeverityLevel getSeverityLevel();
  }
  /**
   * Protobuf type {@code transit_realtime.Alert}
   *
   * <pre>
   * An alert, indicating some sort of incident in the public transit network.
   * </pre>
   */
  public static final class Alert
      extends com.google.protobuf.GeneratedMessage.ExtendableMessage<Alert> implements
      // @@protoc_insertion_point(message_implements:transit_realtime.Alert)
      AlertOrBuilder {
    // Use Alert.newBuilder() to construct.
    private Alert(
        com.google.protobuf.GeneratedMessage.ExtendableBuilder<com.google.transit.realtime.GtfsRealtime.Alert, ?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }

    private Alert(boolean noInit) {
      this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }

    private static final Alert defaultInstance;

    public static Alert getDefaultInstance() {
      return defaultInstance;
    }

    @Override
    public Alert getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private Alert(com.google.protobuf.CodedInputStream input,
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
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                activePeriod_ =
                    new java.util.ArrayList<com.google.transit.realtime.GtfsRealtime.TimeRange>();
                mutable_bitField0_ |= 0x00000001;
              }
              activePeriod_.add(input.readMessage(
                  com.google.transit.realtime.GtfsRealtime.TimeRange.PARSER, extensionRegistry));
              break;
            }
            case 42: {
              if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                informedEntity_ =
                    new java.util.ArrayList<com.google.transit.realtime.GtfsRealtime.EntitySelector>();
                mutable_bitField0_ |= 0x00000002;
              }
              informedEntity_.add(
                  input.readMessage(com.google.transit.realtime.GtfsRealtime.EntitySelector.PARSER,
                      extensionRegistry));
              break;
            }
            case 48: {
              int rawValue = input.readEnum();
              com.google.transit.realtime.GtfsRealtime.Alert.Cause value =
                  com.google.transit.realtime.GtfsRealtime.Alert.Cause.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(6, rawValue);
              } else {
                bitField0_ |= 0x00000001;
                cause_ = value;
              }
              break;
            }
            case 56: {
              int rawValue = input.readEnum();
              com.google.transit.realtime.GtfsRealtime.Alert.Effect value =
                  com.google.transit.realtime.GtfsRealtime.Alert.Effect.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(7, rawValue);
              } else {
                bitField0_ |= 0x00000002;
                effect_ = value;
              }
              break;
            }
            case 66: {
              com.google.transit.realtime.GtfsRealtime.TranslatedString.Builder subBuilder = null;
              if (((bitField0_ & 0x00000004) == 0x00000004)) {
                subBuilder = url_.toBuilder();
              }
              url_ = input.readMessage(
                  com.google.transit.realtime.GtfsRealtime.TranslatedString.PARSER,
                  extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(url_);
                url_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000004;
              break;
            }
            case 82: {
              com.google.transit.realtime.GtfsRealtime.TranslatedString.Builder subBuilder = null;
              if (((bitField0_ & 0x00000008) == 0x00000008)) {
                subBuilder = headerText_.toBuilder();
              }
              headerText_ = input.readMessage(
                  com.google.transit.realtime.GtfsRealtime.TranslatedString.PARSER,
                  extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(headerText_);
                headerText_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000008;
              break;
            }
            case 90: {
              com.google.transit.realtime.GtfsRealtime.TranslatedString.Builder subBuilder = null;
              if (((bitField0_ & 0x00000010) == 0x00000010)) {
                subBuilder = descriptionText_.toBuilder();
              }
              descriptionText_ = input.readMessage(
                  com.google.transit.realtime.GtfsRealtime.TranslatedString.PARSER,
                  extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(descriptionText_);
                descriptionText_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000010;
              break;
            }
            case 98: {
              com.google.transit.realtime.GtfsRealtime.TranslatedString.Builder subBuilder = null;
              if (((bitField0_ & 0x00000020) == 0x00000020)) {
                subBuilder = ttsHeaderText_.toBuilder();
              }
              ttsHeaderText_ = input.readMessage(
                  com.google.transit.realtime.GtfsRealtime.TranslatedString.PARSER,
                  extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(ttsHeaderText_);
                ttsHeaderText_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000020;
              break;
            }
            case 106: {
              com.google.transit.realtime.GtfsRealtime.TranslatedString.Builder subBuilder = null;
              if (((bitField0_ & 0x00000040) == 0x00000040)) {
                subBuilder = ttsDescriptionText_.toBuilder();
              }
              ttsDescriptionText_ = input.readMessage(
                  com.google.transit.realtime.GtfsRealtime.TranslatedString.PARSER,
                  extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(ttsDescriptionText_);
                ttsDescriptionText_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000040;
              break;
            }
            case 112: {
              int rawValue = input.readEnum();
              com.google.transit.realtime.GtfsRealtime.Alert.SeverityLevel value =
                  com.google.transit.realtime.GtfsRealtime.Alert.SeverityLevel.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(14, rawValue);
              } else {
                bitField0_ |= 0x00000080;
                severityLevel_ = value;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e.getMessage())
            .setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
          activePeriod_ = java.util.Collections.unmodifiableList(activePeriod_);
        }
        if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
          informedEntity_ = java.util.Collections.unmodifiableList(informedEntity_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_Alert_descriptor;
    }

    @Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
      return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_Alert_fieldAccessorTable
          .ensureFieldAccessorsInitialized(com.google.transit.realtime.GtfsRealtime.Alert.class,
              com.google.transit.realtime.GtfsRealtime.Alert.Builder.class);
    }

    public static com.google.protobuf.Parser<Alert> PARSER =
        new com.google.protobuf.AbstractParser<Alert>() {
          @Override
          public Alert parsePartialFrom(com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new Alert(input, extensionRegistry);
          }
        };

    @java.lang.Override
    public com.google.protobuf.Parser<Alert> getParserForType() {
      return PARSER;
    }

    /**
     * Protobuf enum {@code transit_realtime.Alert.Cause}
     *
     * <pre>
     * Cause of this alert.
     * </pre>
     */
    public enum Cause implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>UNKNOWN_CAUSE = 1;</code>
       */
      UNKNOWN_CAUSE(0, 1),
      /**
       * <code>OTHER_CAUSE = 2;</code>
       *
       * <pre>
       * Not machine-representable.
       * </pre>
       */
      OTHER_CAUSE(1, 2),
      /**
       * <code>TECHNICAL_PROBLEM = 3;</code>
       */
      TECHNICAL_PROBLEM(2, 3),
      /**
       * <code>STRIKE = 4;</code>
       *
       * <pre>
       * Public transit agency employees stopped working.
       * </pre>
       */
      STRIKE(3, 4),
      /**
       * <code>DEMONSTRATION = 5;</code>
       *
       * <pre>
       * People are blocking the streets.
       * </pre>
       */
      DEMONSTRATION(4, 5),
      /**
       * <code>ACCIDENT = 6;</code>
       */
      ACCIDENT(5, 6),
      /**
       * <code>HOLIDAY = 7;</code>
       */
      HOLIDAY(6, 7),
      /**
       * <code>WEATHER = 8;</code>
       */
      WEATHER(7, 8),
      /**
       * <code>MAINTENANCE = 9;</code>
       */
      MAINTENANCE(8, 9),
      /**
       * <code>CONSTRUCTION = 10;</code>
       */
      CONSTRUCTION(9, 10),
      /**
       * <code>POLICE_ACTIVITY = 11;</code>
       */
      POLICE_ACTIVITY(10, 11),
      /**
       * <code>MEDICAL_EMERGENCY = 12;</code>
       */
      MEDICAL_EMERGENCY(11, 12),;

      /**
       * <code>UNKNOWN_CAUSE = 1;</code>
       */
      public static final int UNKNOWN_CAUSE_VALUE = 1;
      /**
       * <code>OTHER_CAUSE = 2;</code>
       *
       * <pre>
       * Not machine-representable.
       * </pre>
       */
      public static final int OTHER_CAUSE_VALUE = 2;
      /**
       * <code>TECHNICAL_PROBLEM = 3;</code>
       */
      public static final int TECHNICAL_PROBLEM_VALUE = 3;
      /**
       * <code>STRIKE = 4;</code>
       *
       * <pre>
       * Public transit agency employees stopped working.
       * </pre>
       */
      public static final int STRIKE_VALUE = 4;
      /**
       * <code>DEMONSTRATION = 5;</code>
       *
       * <pre>
       * People are blocking the streets.
       * </pre>
       */
      public static final int DEMONSTRATION_VALUE = 5;
      /**
       * <code>ACCIDENT = 6;</code>
       */
      public static final int ACCIDENT_VALUE = 6;
      /**
       * <code>HOLIDAY = 7;</code>
       */
      public static final int HOLIDAY_VALUE = 7;
      /**
       * <code>WEATHER = 8;</code>
       */
      public static final int WEATHER_VALUE = 8;
      /**
       * <code>MAINTENANCE = 9;</code>
       */
      public static final int MAINTENANCE_VALUE = 9;
      /**
       * <code>CONSTRUCTION = 10;</code>
       */
      public static final int CONSTRUCTION_VALUE = 10;
      /**
       * <code>POLICE_ACTIVITY = 11;</code>
       */
      public static final int POLICE_ACTIVITY_VALUE = 11;
      /**
       * <code>MEDICAL_EMERGENCY = 12;</code>
       */
      public static final int MEDICAL_EMERGENCY_VALUE = 12;


      @Override
      public final int getNumber() {
        return value;
      }

      public static Cause valueOf(int value) {
        switch (value) {
          case 1:
            return UNKNOWN_CAUSE;
          case 2:
            return OTHER_CAUSE;
          case 3:
            return TECHNICAL_PROBLEM;
          case 4:
            return STRIKE;
          case 5:
            return DEMONSTRATION;
          case 6:
            return ACCIDENT;
          case 7:
            return HOLIDAY;
          case 8:
            return WEATHER;
          case 9:
            return MAINTENANCE;
          case 10:
            return CONSTRUCTION;
          case 11:
            return POLICE_ACTIVITY;
          case 12:
            return MEDICAL_EMERGENCY;
          default:
            return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<Cause> internalGetValueMap() {
        return internalValueMap;
      }

      private static com.google.protobuf.Internal.EnumLiteMap<Cause> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Cause>() {
            @Override
            public Cause findValueByNumber(int number) {
              return Cause.valueOf(number);
            }
          };

      @Override
      public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
        return getDescriptor().getValues().get(index);
      }

      @Override
      public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
        return getDescriptor();
      }

      public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
        return com.google.transit.realtime.GtfsRealtime.Alert.getDescriptor().getEnumTypes().get(0);
      }

      private static final Cause[] VALUES = values();

      public static Cause valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        return VALUES[desc.getIndex()];
      }

      private final int index;
      private final int value;

      private Cause(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:transit_realtime.Alert.Cause)
    }

    /**
     * Protobuf enum {@code transit_realtime.Alert.Effect}
     *
     * <pre>
     * What is the effect of this problem on the affected entity.
     * </pre>
     */
    public enum Effect implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NO_SERVICE = 1;</code>
       */
      NO_SERVICE(0, 1),
      /**
       * <code>REDUCED_SERVICE = 2;</code>
       */
      REDUCED_SERVICE(1, 2),
      /**
       * <code>SIGNIFICANT_DELAYS = 3;</code>
       *
       * <pre>
       * We don't care about INsignificant delays: they are hard to detect, have
       * little impact on the user, and would clutter the results as they are too
       * frequent.
       * </pre>
       */
      SIGNIFICANT_DELAYS(2, 3),
      /**
       * <code>DETOUR = 4;</code>
       */
      DETOUR(3, 4),
      /**
       * <code>ADDITIONAL_SERVICE = 5;</code>
       */
      ADDITIONAL_SERVICE(4, 5),
      /**
       * <code>MODIFIED_SERVICE = 6;</code>
       */
      MODIFIED_SERVICE(5, 6),
      /**
       * <code>OTHER_EFFECT = 7;</code>
       */
      OTHER_EFFECT(6, 7),
      /**
       * <code>UNKNOWN_EFFECT = 8;</code>
       */
      UNKNOWN_EFFECT(7, 8),
      /**
       * <code>STOP_MOVED = 9;</code>
       */
      STOP_MOVED(8, 9),
      /**
       * <code>NO_EFFECT = 10;</code>
       */
      NO_EFFECT(9, 10),;

      /**
       * <code>NO_SERVICE = 1;</code>
       */
      public static final int NO_SERVICE_VALUE = 1;
      /**
       * <code>REDUCED_SERVICE = 2;</code>
       */
      public static final int REDUCED_SERVICE_VALUE = 2;
      /**
       * <code>SIGNIFICANT_DELAYS = 3;</code>
       *
       * <pre>
       * We don't care about INsignificant delays: they are hard to detect, have
       * little impact on the user, and would clutter the results as they are too
       * frequent.
       * </pre>
       */
      public static final int SIGNIFICANT_DELAYS_VALUE = 3;
      /**
       * <code>DETOUR = 4;</code>
       */
      public static final int DETOUR_VALUE = 4;
      /**
       * <code>ADDITIONAL_SERVICE = 5;</code>
       */
      public static final int ADDITIONAL_SERVICE_VALUE = 5;
      /**
       * <code>MODIFIED_SERVICE = 6;</code>
       */
      public static final int MODIFIED_SERVICE_VALUE = 6;
      /**
       * <code>OTHER_EFFECT = 7;</code>
       */
      public static final int OTHER_EFFECT_VALUE = 7;
      /**
       * <code>UNKNOWN_EFFECT = 8;</code>
       */
      public static final int UNKNOWN_EFFECT_VALUE = 8;
      /**
       * <code>STOP_MOVED = 9;</code>
       */
      public static final int STOP_MOVED_VALUE = 9;
      /**
       * <code>NO_EFFECT = 10;</code>
       */
      public static final int NO_EFFECT_VALUE = 10;


      @Override
      public final int getNumber() {
        return value;
      }

      public static Effect valueOf(int value) {
        switch (value) {
          case 1:
            return NO_SERVICE;
          case 2:
            return REDUCED_SERVICE;
          case 3:
            return SIGNIFICANT_DELAYS;
          case 4:
            return DETOUR;
          case 5:
            return ADDITIONAL_SERVICE;
          case 6:
            return MODIFIED_SERVICE;
          case 7:
            return OTHER_EFFECT;
          case 8:
            return UNKNOWN_EFFECT;
          case 9:
            return STOP_MOVED;
          case 10:
            return NO_EFFECT;
          default:
            return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<Effect> internalGetValueMap() {
        return internalValueMap;
      }

      private static com.google.protobuf.Internal.EnumLiteMap<Effect> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Effect>() {
            @Override
            public Effect findValueByNumber(int number) {
              return Effect.valueOf(number);
            }
          };

      @Override
      public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
        return getDescriptor().getValues().get(index);
      }

      @Override
      public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
        return getDescriptor();
      }

      public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
        return com.google.transit.realtime.GtfsRealtime.Alert.getDescriptor().getEnumTypes().get(1);
      }

      private static final Effect[] VALUES = values();

      public static Effect valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        return VALUES[desc.getIndex()];
      }

      private final int index;
      private final int value;

      private Effect(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:transit_realtime.Alert.Effect)
    }

    /**
     * Protobuf enum {@code transit_realtime.Alert.SeverityLevel}
     *
     * <pre>
     * Severity of this alert.
     * This field is still experimental, and subject to change. It may be formally adopted in the future.
     * </pre>
     */
    public enum SeverityLevel implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>UNKNOWN_SEVERITY = 1;</code>
       */
      UNKNOWN_SEVERITY(0, 1),
      /**
       * <code>INFO = 2;</code>
       */
      INFO(1, 2),
      /**
       * <code>WARNING = 3;</code>
       */
      WARNING(2, 3),
      /**
       * <code>SEVERE = 4;</code>
       */
      SEVERE(3, 4),;

      /**
       * <code>UNKNOWN_SEVERITY = 1;</code>
       */
      public static final int UNKNOWN_SEVERITY_VALUE = 1;
      /**
       * <code>INFO = 2;</code>
       */
      public static final int INFO_VALUE = 2;
      /**
       * <code>WARNING = 3;</code>
       */
      public static final int WARNING_VALUE = 3;
      /**
       * <code>SEVERE = 4;</code>
       */
      public static final int SEVERE_VALUE = 4;


      @Override
      public final int getNumber() {
        return value;
      }

      public static SeverityLevel valueOf(int value) {
        switch (value) {
          case 1:
            return UNKNOWN_SEVERITY;
          case 2:
            return INFO;
          case 3:
            return WARNING;
          case 4:
            return SEVERE;
          default:
            return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<SeverityLevel> internalGetValueMap() {
        return internalValueMap;
      }

      private static com.google.protobuf.Internal.EnumLiteMap<SeverityLevel> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<SeverityLevel>() {
            @Override
            public SeverityLevel findValueByNumber(int number) {
              return SeverityLevel.valueOf(number);
            }
          };

      @Override
      public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
        return getDescriptor().getValues().get(index);
      }

      @Override
      public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
        return getDescriptor();
      }

      public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
        return com.google.transit.realtime.GtfsRealtime.Alert.getDescriptor().getEnumTypes().get(2);
      }

      private static final SeverityLevel[] VALUES = values();

      public static SeverityLevel valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        return VALUES[desc.getIndex()];
      }

      private final int index;
      private final int value;

      private SeverityLevel(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:transit_realtime.Alert.SeverityLevel)
    }

    private int bitField0_;
    public static final int ACTIVE_PERIOD_FIELD_NUMBER = 1;
    private java.util.List<com.google.transit.realtime.GtfsRealtime.TimeRange> activePeriod_;

    /**
     * <code>repeated .transit_realtime.TimeRange active_period = 1;</code>
     *
     * <pre>
     * Time when the alert should be shown to the user. If missing, the
     * alert will be shown as long as it appears in the feed.
     * If multiple ranges are given, the alert will be shown during all of them.
     * </pre>
     */
    @Override
    public java.util.List<com.google.transit.realtime.GtfsRealtime.TimeRange> getActivePeriodList() {
      return activePeriod_;
    }

    /**
     * <code>repeated .transit_realtime.TimeRange active_period = 1;</code>
     *
     * <pre>
     * Time when the alert should be shown to the user. If missing, the
     * alert will be shown as long as it appears in the feed.
     * If multiple ranges are given, the alert will be shown during all of them.
     * </pre>
     */
    @Override
    public java.util.List<? extends com.google.transit.realtime.GtfsRealtime.TimeRangeOrBuilder> getActivePeriodOrBuilderList() {
      return activePeriod_;
    }

    /**
     * <code>repeated .transit_realtime.TimeRange active_period = 1;</code>
     *
     * <pre>
     * Time when the alert should be shown to the user. If missing, the
     * alert will be shown as long as it appears in the feed.
     * If multiple ranges are given, the alert will be shown during all of them.
     * </pre>
     */
    @Override
    public int getActivePeriodCount() {
      return activePeriod_.size();
    }

    /**
     * <code>repeated .transit_realtime.TimeRange active_period = 1;</code>
     *
     * <pre>
     * Time when the alert should be shown to the user. If missing, the
     * alert will be shown as long as it appears in the feed.
     * If multiple ranges are given, the alert will be shown during all of them.
     * </pre>
     */
    @Override
    public com.google.transit.realtime.GtfsRealtime.TimeRange getActivePeriod(int index) {
      return activePeriod_.get(index);
    }

    /**
     * <code>repeated .transit_realtime.TimeRange active_period = 1;</code>
     *
     * <pre>
     * Time when the alert should be shown to the user. If missing, the
     * alert will be shown as long as it appears in the feed.
     * If multiple ranges are given, the alert will be shown during all of them.
     * </pre>
     */
    @Override
    public com.google.transit.realtime.GtfsRealtime.TimeRangeOrBuilder getActivePeriodOrBuilder(
        int index) {
      return activePeriod_.get(index);
    }

    public static final int INFORMED_ENTITY_FIELD_NUMBER = 5;
    private java.util.List<com.google.transit.realtime.GtfsRealtime.EntitySelector> informedEntity_;

    /**
     * <code>repeated .transit_realtime.EntitySelector informed_entity = 5;</code>
     *
     * <pre>
     * Entities whose users we should notify of this alert.
     * </pre>
     */
    @Override
    public java.util.List<com.google.transit.realtime.GtfsRealtime.EntitySelector> getInformedEntityList() {
      return informedEntity_;
    }

    /**
     * <code>repeated .transit_realtime.EntitySelector informed_entity = 5;</code>
     *
     * <pre>
     * Entities whose users we should notify of this alert.
     * </pre>
     */
    @Override
    public java.util.List<? extends com.google.transit.realtime.GtfsRealtime.EntitySelectorOrBuilder> getInformedEntityOrBuilderList() {
      return informedEntity_;
    }

    /**
     * <code>repeated .transit_realtime.EntitySelector informed_entity = 5;</code>
     *
     * <pre>
     * Entities whose users we should notify of this alert.
     * </pre>
     */
    @Override
    public int getInformedEntityCount() {
      return informedEntity_.size();
    }

    /**
     * <code>repeated .transit_realtime.EntitySelector informed_entity = 5;</code>
     *
     * <pre>
     * Entities whose users we should notify of this alert.
     * </pre>
     */
    @Override
    public com.google.transit.realtime.GtfsRealtime.EntitySelector getInformedEntity(int index) {
      return informedEntity_.get(index);
    }

    /**
     * <code>repeated .transit_realtime.EntitySelector informed_entity = 5;</code>
     *
     * <pre>
     * Entities whose users we should notify of this alert.
     * </pre>
     */
    @Override
    public com.google.transit.realtime.GtfsRealtime.EntitySelectorOrBuilder getInformedEntityOrBuilder(
        int index) {
      return informedEntity_.get(index);
    }

    public static final int CAUSE_FIELD_NUMBER = 6;
    private com.google.transit.realtime.GtfsRealtime.Alert.Cause cause_;

    /**
     * <code>optional .transit_realtime.Alert.Cause cause = 6 [default = UNKNOWN_CAUSE];</code>
     */
    @Override
    public boolean hasCause() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }

    /**
     * <code>optional .transit_realtime.Alert.Cause cause = 6 [default = UNKNOWN_CAUSE];</code>
     */
    @Override
    public com.google.transit.realtime.GtfsRealtime.Alert.Cause getCause() {
      return cause_;
    }

    public static final int EFFECT_FIELD_NUMBER = 7;
    private com.google.transit.realtime.GtfsRealtime.Alert.Effect effect_;

    /**
     * <code>optional .transit_realtime.Alert.Effect effect = 7 [default = UNKNOWN_EFFECT];</code>
     */
    @Override
    public boolean hasEffect() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }

    /**
     * <code>optional .transit_realtime.Alert.Effect effect = 7 [default = UNKNOWN_EFFECT];</code>
     */
    @Override
    public com.google.transit.realtime.GtfsRealtime.Alert.Effect getEffect() {
      return effect_;
    }

    public static final int URL_FIELD_NUMBER = 8;
    private com.google.transit.realtime.GtfsRealtime.TranslatedString url_;

    /**
     * <code>optional .transit_realtime.TranslatedString url = 8;</code>
     *
     * <pre>
     * The URL which provides additional information about the alert.
     * </pre>
     */
    @Override
    public boolean hasUrl() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }

    /**
     * <code>optional .transit_realtime.TranslatedString url = 8;</code>
     *
     * <pre>
     * The URL which provides additional information about the alert.
     * </pre>
     */
    @Override
    public com.google.transit.realtime.GtfsRealtime.TranslatedString getUrl() {
      return url_;
    }

    /**
     * <code>optional .transit_realtime.TranslatedString url = 8;</code>
     *
     * <pre>
     * The URL which provides additional information about the alert.
     * </pre>
     */
    @Override
    public com.google.transit.realtime.GtfsRealtime.TranslatedStringOrBuilder getUrlOrBuilder() {
      return url_;
    }

    public static final int HEADER_TEXT_FIELD_NUMBER = 10;
    private com.google.transit.realtime.GtfsRealtime.TranslatedString headerText_;

    /**
     * <code>optional .transit_realtime.TranslatedString header_text = 10;</code>
     *
     * <pre>
     * Alert header. Contains a short summary of the alert text as plain-text.
     * </pre>
     */
    @Override
    public boolean hasHeaderText() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }

    /**
     * <code>optional .transit_realtime.TranslatedString header_text = 10;</code>
     *
     * <pre>
     * Alert header. Contains a short summary of the alert text as plain-text.
     * </pre>
     */
    @Override
    public com.google.transit.realtime.GtfsRealtime.TranslatedString getHeaderText() {
      return headerText_;
    }

    /**
     * <code>optional .transit_realtime.TranslatedString header_text = 10;</code>
     *
     * <pre>
     * Alert header. Contains a short summary of the alert text as plain-text.
     * </pre>
     */
    @Override
    public com.google.transit.realtime.GtfsRealtime.TranslatedStringOrBuilder getHeaderTextOrBuilder() {
      return headerText_;
    }

    public static final int DESCRIPTION_TEXT_FIELD_NUMBER = 11;
    private com.google.transit.realtime.GtfsRealtime.TranslatedString descriptionText_;

    /**
     * <code>optional .transit_realtime.TranslatedString description_text = 11;</code>
     *
     * <pre>
     * Full description for the alert as plain-text. The information in the
     * description should add to the information of the header.
     * </pre>
     */
    @Override
    public boolean hasDescriptionText() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }

    /**
     * <code>optional .transit_realtime.TranslatedString description_text = 11;</code>
     *
     * <pre>
     * Full description for the alert as plain-text. The information in the
     * description should add to the information of the header.
     * </pre>
     */
    @Override
    public com.google.transit.realtime.GtfsRealtime.TranslatedString getDescriptionText() {
      return descriptionText_;
    }

    /**
     * <code>optional .transit_realtime.TranslatedString description_text = 11;</code>
     *
     * <pre>
     * Full description for the alert as plain-text. The information in the
     * description should add to the information of the header.
     * </pre>
     */
    @Override
    public com.google.transit.realtime.GtfsRealtime.TranslatedStringOrBuilder getDescriptionTextOrBuilder() {
      return descriptionText_;
    }

    public static final int TTS_HEADER_TEXT_FIELD_NUMBER = 12;
    private com.google.transit.realtime.GtfsRealtime.TranslatedString ttsHeaderText_;

    /**
     * <code>optional .transit_realtime.TranslatedString tts_header_text = 12;</code>
     *
     * <pre>
     * Text for alert header to be used in text-to-speech implementations. This field is the text-to-speech version of header_text.
     * This field is still experimental, and subject to change. It may be formally adopted in the future.
     * </pre>
     */
    @Override
    public boolean hasTtsHeaderText() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }

    /**
     * <code>optional .transit_realtime.TranslatedString tts_header_text = 12;</code>
     *
     * <pre>
     * Text for alert header to be used in text-to-speech implementations. This field is the text-to-speech version of header_text.
     * This field is still experimental, and subject to change. It may be formally adopted in the future.
     * </pre>
     */
    @Override
    public com.google.transit.realtime.GtfsRealtime.TranslatedString getTtsHeaderText() {
      return ttsHeaderText_;
    }

    /**
     * <code>optional .transit_realtime.TranslatedString tts_header_text = 12;</code>
     *
     * <pre>
     * Text for alert header to be used in text-to-speech implementations. This field is the text-to-speech version of header_text.
     * This field is still experimental, and subject to change. It may be formally adopted in the future.
     * </pre>
     */
    @Override
    public com.google.transit.realtime.GtfsRealtime.TranslatedStringOrBuilder getTtsHeaderTextOrBuilder() {
      return ttsHeaderText_;
    }

    public static final int TTS_DESCRIPTION_TEXT_FIELD_NUMBER = 13;
    private com.google.transit.realtime.GtfsRealtime.TranslatedString ttsDescriptionText_;

    /**
     * <code>optional .transit_realtime.TranslatedString tts_description_text = 13;</code>
     *
     * <pre>
     * Text for full description for the alert to be used in text-to-speech implementations. This field is the text-to-speech version of description_text.
     * This field is still experimental, and subject to change. It may be formally adopted in the future.
     * </pre>
     */
    @Override
    public boolean hasTtsDescriptionText() {
      return ((bitField0_ & 0x00000040) == 0x00000040);
    }

    /**
     * <code>optional .transit_realtime.TranslatedString tts_description_text = 13;</code>
     *
     * <pre>
     * Text for full description for the alert to be used in text-to-speech implementations. This field is the text-to-speech version of description_text.
     * This field is still experimental, and subject to change. It may be formally adopted in the future.
     * </pre>
     */
    @Override
    public com.google.transit.realtime.GtfsRealtime.TranslatedString getTtsDescriptionText() {
      return ttsDescriptionText_;
    }

    /**
     * <code>optional .transit_realtime.TranslatedString tts_description_text = 13;</code>
     *
     * <pre>
     * Text for full description for the alert to be used in text-to-speech implementations. This field is the text-to-speech version of description_text.
     * This field is still experimental, and subject to change. It may be formally adopted in the future.
     * </pre>
     */
    @Override
    public com.google.transit.realtime.GtfsRealtime.TranslatedStringOrBuilder getTtsDescriptionTextOrBuilder() {
      return ttsDescriptionText_;
    }

    public static final int SEVERITY_LEVEL_FIELD_NUMBER = 14;
    private com.google.transit.realtime.GtfsRealtime.Alert.SeverityLevel severityLevel_;

    /**
     * <code>optional .transit_realtime.Alert.SeverityLevel severity_level = 14 [default = UNKNOWN_SEVERITY];</code>
     */
    @Override
    public boolean hasSeverityLevel() {
      return ((bitField0_ & 0x00000080) == 0x00000080);
    }

    /**
     * <code>optional .transit_realtime.Alert.SeverityLevel severity_level = 14 [default = UNKNOWN_SEVERITY];</code>
     */
    @Override
    public com.google.transit.realtime.GtfsRealtime.Alert.SeverityLevel getSeverityLevel() {
      return severityLevel_;
    }

    private void initFields() {
      activePeriod_ = java.util.Collections.emptyList();
      informedEntity_ = java.util.Collections.emptyList();
      cause_ = com.google.transit.realtime.GtfsRealtime.Alert.Cause.UNKNOWN_CAUSE;
      effect_ = com.google.transit.realtime.GtfsRealtime.Alert.Effect.UNKNOWN_EFFECT;
      url_ = com.google.transit.realtime.GtfsRealtime.TranslatedString.getDefaultInstance();
      headerText_ = com.google.transit.realtime.GtfsRealtime.TranslatedString.getDefaultInstance();
      descriptionText_ =
          com.google.transit.realtime.GtfsRealtime.TranslatedString.getDefaultInstance();
      ttsHeaderText_ =
          com.google.transit.realtime.GtfsRealtime.TranslatedString.getDefaultInstance();
      ttsDescriptionText_ =
          com.google.transit.realtime.GtfsRealtime.TranslatedString.getDefaultInstance();
      severityLevel_ =
          com.google.transit.realtime.GtfsRealtime.Alert.SeverityLevel.UNKNOWN_SEVERITY;
    }

    private byte memoizedIsInitialized = -1;

    @Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1)
        return true;
      if (isInitialized == 0)
        return false;

      for (int i = 0; i < getActivePeriodCount(); i++) {
        if (!getActivePeriod(i).isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      for (int i = 0; i < getInformedEntityCount(); i++) {
        if (!getInformedEntity(i).isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      if (hasUrl()) {
        if (!getUrl().isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      if (hasHeaderText()) {
        if (!getHeaderText().isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      if (hasDescriptionText()) {
        if (!getDescriptionText().isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      if (hasTtsHeaderText()) {
        if (!getTtsHeaderText().isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      if (hasTtsDescriptionText()) {
        if (!getTtsDescriptionText().isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      if (!extensionsAreInitialized()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    @Override
    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      getSerializedSize();
      com.google.protobuf.GeneratedMessage.ExtendableMessage<com.google.transit.realtime.GtfsRealtime.Alert>.ExtensionWriter extensionWriter =
          newExtensionWriter();
      for (int i = 0; i < activePeriod_.size(); i++) {
        output.writeMessage(1, activePeriod_.get(i));
      }
      for (int i = 0; i < informedEntity_.size(); i++) {
        output.writeMessage(5, informedEntity_.get(i));
      }
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeEnum(6, cause_.getNumber());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeEnum(7, effect_.getNumber());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeMessage(8, url_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeMessage(10, headerText_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeMessage(11, descriptionText_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        output.writeMessage(12, ttsHeaderText_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        output.writeMessage(13, ttsDescriptionText_);
      }
      if (((bitField0_ & 0x00000080) == 0x00000080)) {
        output.writeEnum(14, severityLevel_.getNumber());
      }
      extensionWriter.writeUntil(2000, output);
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;

    @Override
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1)
        return size;

      size = 0;
      for (int i = 0; i < activePeriod_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, activePeriod_.get(i));
      }
      for (int i = 0; i < informedEntity_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(5, informedEntity_.get(i));
      }
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream.computeEnumSize(6, cause_.getNumber());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream.computeEnumSize(7, effect_.getNumber());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(8, url_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(10, headerText_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(11, descriptionText_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(12, ttsHeaderText_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(13, ttsDescriptionText_);
      }
      if (((bitField0_ & 0x00000080) == 0x00000080)) {
        size +=
            com.google.protobuf.CodedOutputStream.computeEnumSize(14, severityLevel_.getNumber());
      }
      size += extensionsSerializedSize();
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;

    @java.lang.Override
    protected java.lang.Object writeReplace() throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static com.google.transit.realtime.GtfsRealtime.Alert parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.google.transit.realtime.GtfsRealtime.Alert parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.google.transit.realtime.GtfsRealtime.Alert parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.google.transit.realtime.GtfsRealtime.Alert parseFrom(byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.google.transit.realtime.GtfsRealtime.Alert parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return PARSER.parseFrom(input);
    }

    public static com.google.transit.realtime.GtfsRealtime.Alert parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static com.google.transit.realtime.GtfsRealtime.Alert parseDelimitedFrom(
        java.io.InputStream input) throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }

    public static com.google.transit.realtime.GtfsRealtime.Alert parseDelimitedFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }

    public static com.google.transit.realtime.GtfsRealtime.Alert parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return PARSER.parseFrom(input);
    }

    public static com.google.transit.realtime.GtfsRealtime.Alert parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return Builder.create();
    }

    @Override
    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder(com.google.transit.realtime.GtfsRealtime.Alert prototype) {
      return newBuilder().mergeFrom(prototype);
    }

    @Override
    public Builder toBuilder() {
      return newBuilder(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }

    /**
     * Protobuf type {@code transit_realtime.Alert}
     *
     * <pre>
     * An alert, indicating some sort of incident in the public transit network.
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.ExtendableBuilder<com.google.transit.realtime.GtfsRealtime.Alert, Builder>
        implements
        // @@protoc_insertion_point(builder_implements:transit_realtime.Alert)
        com.google.transit.realtime.GtfsRealtime.AlertOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_Alert_descriptor;
      }

      @Override
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
        return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_Alert_fieldAccessorTable
            .ensureFieldAccessorsInitialized(com.google.transit.realtime.GtfsRealtime.Alert.class,
                com.google.transit.realtime.GtfsRealtime.Alert.Builder.class);
      }

      // Construct using com.google.transit.realtime.GtfsRealtime.Alert.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getActivePeriodFieldBuilder();
          getInformedEntityFieldBuilder();
          getUrlFieldBuilder();
          getHeaderTextFieldBuilder();
          getDescriptionTextFieldBuilder();
          getTtsHeaderTextFieldBuilder();
          getTtsDescriptionTextFieldBuilder();
        }
      }

      private static Builder create() {
        return new Builder();
      }

      @Override
      public Builder clear() {
        super.clear();
        if (activePeriodBuilder_ == null) {
          activePeriod_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          activePeriodBuilder_.clear();
        }
        if (informedEntityBuilder_ == null) {
          informedEntity_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          informedEntityBuilder_.clear();
        }
        cause_ = com.google.transit.realtime.GtfsRealtime.Alert.Cause.UNKNOWN_CAUSE;
        bitField0_ = (bitField0_ & ~0x00000004);
        effect_ = com.google.transit.realtime.GtfsRealtime.Alert.Effect.UNKNOWN_EFFECT;
        bitField0_ = (bitField0_ & ~0x00000008);
        if (urlBuilder_ == null) {
          url_ = com.google.transit.realtime.GtfsRealtime.TranslatedString.getDefaultInstance();
        } else {
          urlBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000010);
        if (headerTextBuilder_ == null) {
          headerText_ =
              com.google.transit.realtime.GtfsRealtime.TranslatedString.getDefaultInstance();
        } else {
          headerTextBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000020);
        if (descriptionTextBuilder_ == null) {
          descriptionText_ =
              com.google.transit.realtime.GtfsRealtime.TranslatedString.getDefaultInstance();
        } else {
          descriptionTextBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000040);
        if (ttsHeaderTextBuilder_ == null) {
          ttsHeaderText_ =
              com.google.transit.realtime.GtfsRealtime.TranslatedString.getDefaultInstance();
        } else {
          ttsHeaderTextBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000080);
        if (ttsDescriptionTextBuilder_ == null) {
          ttsDescriptionText_ =
              com.google.transit.realtime.GtfsRealtime.TranslatedString.getDefaultInstance();
        } else {
          ttsDescriptionTextBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000100);
        severityLevel_ =
            com.google.transit.realtime.GtfsRealtime.Alert.SeverityLevel.UNKNOWN_SEVERITY;
        bitField0_ = (bitField0_ & ~0x00000200);
        return this;
      }

      @Override
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_Alert_descriptor;
      }

      @Override
      public com.google.transit.realtime.GtfsRealtime.Alert getDefaultInstanceForType() {
        return com.google.transit.realtime.GtfsRealtime.Alert.getDefaultInstance();
      }

      @Override
      public com.google.transit.realtime.GtfsRealtime.Alert build() {
        com.google.transit.realtime.GtfsRealtime.Alert result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public com.google.transit.realtime.GtfsRealtime.Alert buildPartial() {
        com.google.transit.realtime.GtfsRealtime.Alert result =
            new com.google.transit.realtime.GtfsRealtime.Alert(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (activePeriodBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)) {
            activePeriod_ = java.util.Collections.unmodifiableList(activePeriod_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.activePeriod_ = activePeriod_;
        } else {
          result.activePeriod_ = activePeriodBuilder_.build();
        }
        if (informedEntityBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)) {
            informedEntity_ = java.util.Collections.unmodifiableList(informedEntity_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.informedEntity_ = informedEntity_;
        } else {
          result.informedEntity_ = informedEntityBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000001;
        }
        result.cause_ = cause_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000002;
        }
        result.effect_ = effect_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000004;
        }
        if (urlBuilder_ == null) {
          result.url_ = url_;
        } else {
          result.url_ = urlBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
          to_bitField0_ |= 0x00000008;
        }
        if (headerTextBuilder_ == null) {
          result.headerText_ = headerText_;
        } else {
          result.headerText_ = headerTextBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000040) == 0x00000040)) {
          to_bitField0_ |= 0x00000010;
        }
        if (descriptionTextBuilder_ == null) {
          result.descriptionText_ = descriptionText_;
        } else {
          result.descriptionText_ = descriptionTextBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000080) == 0x00000080)) {
          to_bitField0_ |= 0x00000020;
        }
        if (ttsHeaderTextBuilder_ == null) {
          result.ttsHeaderText_ = ttsHeaderText_;
        } else {
          result.ttsHeaderText_ = ttsHeaderTextBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000100) == 0x00000100)) {
          to_bitField0_ |= 0x00000040;
        }
        if (ttsDescriptionTextBuilder_ == null) {
          result.ttsDescriptionText_ = ttsDescriptionText_;
        } else {
          result.ttsDescriptionText_ = ttsDescriptionTextBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000200) == 0x00000200)) {
          to_bitField0_ |= 0x00000080;
        }
        result.severityLevel_ = severityLevel_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.google.transit.realtime.GtfsRealtime.Alert) {
          return mergeFrom((com.google.transit.realtime.GtfsRealtime.Alert) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.google.transit.realtime.GtfsRealtime.Alert other) {
        if (other == com.google.transit.realtime.GtfsRealtime.Alert.getDefaultInstance())
          return this;
        if (activePeriodBuilder_ == null) {
          if (!other.activePeriod_.isEmpty()) {
            if (activePeriod_.isEmpty()) {
              activePeriod_ = other.activePeriod_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureActivePeriodIsMutable();
              activePeriod_.addAll(other.activePeriod_);
            }
            onChanged();
          }
        } else {
          if (!other.activePeriod_.isEmpty()) {
            if (activePeriodBuilder_.isEmpty()) {
              activePeriodBuilder_.dispose();
              activePeriodBuilder_ = null;
              activePeriod_ = other.activePeriod_;
              bitField0_ = (bitField0_ & ~0x00000001);
              activePeriodBuilder_ = com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders
                  ? getActivePeriodFieldBuilder()
                  : null;
            } else {
              activePeriodBuilder_.addAllMessages(other.activePeriod_);
            }
          }
        }
        if (informedEntityBuilder_ == null) {
          if (!other.informedEntity_.isEmpty()) {
            if (informedEntity_.isEmpty()) {
              informedEntity_ = other.informedEntity_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureInformedEntityIsMutable();
              informedEntity_.addAll(other.informedEntity_);
            }
            onChanged();
          }
        } else {
          if (!other.informedEntity_.isEmpty()) {
            if (informedEntityBuilder_.isEmpty()) {
              informedEntityBuilder_.dispose();
              informedEntityBuilder_ = null;
              informedEntity_ = other.informedEntity_;
              bitField0_ = (bitField0_ & ~0x00000002);
              informedEntityBuilder_ = com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders
                  ? getInformedEntityFieldBuilder()
                  : null;
            } else {
              informedEntityBuilder_.addAllMessages(other.informedEntity_);
            }
          }
        }
        if (other.hasCause()) {
          setCause(other.getCause());
        }
        if (other.hasEffect()) {
          setEffect(other.getEffect());
        }
        if (other.hasUrl()) {
          mergeUrl(other.getUrl());
        }
        if (other.hasHeaderText()) {
          mergeHeaderText(other.getHeaderText());
        }
        if (other.hasDescriptionText()) {
          mergeDescriptionText(other.getDescriptionText());
        }
        if (other.hasTtsHeaderText()) {
          mergeTtsHeaderText(other.getTtsHeaderText());
        }
        if (other.hasTtsDescriptionText()) {
          mergeTtsDescriptionText(other.getTtsDescriptionText());
        }
        if (other.hasSeverityLevel()) {
          setSeverityLevel(other.getSeverityLevel());
        }
        this.mergeExtensionFields(other);
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      @Override
      public final boolean isInitialized() {
        for (int i = 0; i < getActivePeriodCount(); i++) {
          if (!getActivePeriod(i).isInitialized()) {

            return false;
          }
        }
        for (int i = 0; i < getInformedEntityCount(); i++) {
          if (!getInformedEntity(i).isInitialized()) {

            return false;
          }
        }
        if (hasUrl()) {
          if (!getUrl().isInitialized()) {

            return false;
          }
        }
        if (hasHeaderText()) {
          if (!getHeaderText().isInitialized()) {

            return false;
          }
        }
        if (hasDescriptionText()) {
          if (!getDescriptionText().isInitialized()) {

            return false;
          }
        }
        if (hasTtsHeaderText()) {
          if (!getTtsHeaderText().isInitialized()) {

            return false;
          }
        }
        if (hasTtsDescriptionText()) {
          if (!getTtsDescriptionText().isInitialized()) {

            return false;
          }
        }
        if (!extensionsAreInitialized()) {

          return false;
        }
        return true;
      }

      @Override
      public Builder mergeFrom(com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        com.google.transit.realtime.GtfsRealtime.Alert parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.google.transit.realtime.GtfsRealtime.Alert) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private java.util.List<com.google.transit.realtime.GtfsRealtime.TimeRange> activePeriod_ =
          java.util.Collections.emptyList();

      private void ensureActivePeriodIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          activePeriod_ =
              new java.util.ArrayList<com.google.transit.realtime.GtfsRealtime.TimeRange>(
                  activePeriod_);
          bitField0_ |= 0x00000001;
        }
      }

      private com.google.protobuf.RepeatedFieldBuilder<com.google.transit.realtime.GtfsRealtime.TimeRange, com.google.transit.realtime.GtfsRealtime.TimeRange.Builder, com.google.transit.realtime.GtfsRealtime.TimeRangeOrBuilder> activePeriodBuilder_;

      /**
       * <code>repeated .transit_realtime.TimeRange active_period = 1;</code>
       *
       * <pre>
       * Time when the alert should be shown to the user. If missing, the
       * alert will be shown as long as it appears in the feed.
       * If multiple ranges are given, the alert will be shown during all of them.
       * </pre>
       */
      @Override
      public java.util.List<com.google.transit.realtime.GtfsRealtime.TimeRange> getActivePeriodList() {
        if (activePeriodBuilder_ == null) {
          return java.util.Collections.unmodifiableList(activePeriod_);
        } else {
          return activePeriodBuilder_.getMessageList();
        }
      }

      /**
       * <code>repeated .transit_realtime.TimeRange active_period = 1;</code>
       *
       * <pre>
       * Time when the alert should be shown to the user. If missing, the
       * alert will be shown as long as it appears in the feed.
       * If multiple ranges are given, the alert will be shown during all of them.
       * </pre>
       */
      @Override
      public int getActivePeriodCount() {
        if (activePeriodBuilder_ == null) {
          return activePeriod_.size();
        } else {
          return activePeriodBuilder_.getCount();
        }
      }

      /**
       * <code>repeated .transit_realtime.TimeRange active_period = 1;</code>
       *
       * <pre>
       * Time when the alert should be shown to the user. If missing, the
       * alert will be shown as long as it appears in the feed.
       * If multiple ranges are given, the alert will be shown during all of them.
       * </pre>
       */
      @Override
      public com.google.transit.realtime.GtfsRealtime.TimeRange getActivePeriod(int index) {
        if (activePeriodBuilder_ == null) {
          return activePeriod_.get(index);
        } else {
          return activePeriodBuilder_.getMessage(index);
        }
      }

      /**
       * <code>repeated .transit_realtime.TimeRange active_period = 1;</code>
       *
       * <pre>
       * Time when the alert should be shown to the user. If missing, the
       * alert will be shown as long as it appears in the feed.
       * If multiple ranges are given, the alert will be shown during all of them.
       * </pre>
       */
      public Builder setActivePeriod(int index,
          com.google.transit.realtime.GtfsRealtime.TimeRange value) {
        if (activePeriodBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureActivePeriodIsMutable();
          activePeriod_.set(index, value);
          onChanged();
        } else {
          activePeriodBuilder_.setMessage(index, value);
        }
        return this;
      }

      /**
       * <code>repeated .transit_realtime.TimeRange active_period = 1;</code>
       *
       * <pre>
       * Time when the alert should be shown to the user. If missing, the
       * alert will be shown as long as it appears in the feed.
       * If multiple ranges are given, the alert will be shown during all of them.
       * </pre>
       */
      public Builder setActivePeriod(int index,
          com.google.transit.realtime.GtfsRealtime.TimeRange.Builder builderForValue) {
        if (activePeriodBuilder_ == null) {
          ensureActivePeriodIsMutable();
          activePeriod_.set(index, builderForValue.build());
          onChanged();
        } else {
          activePeriodBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }

      /**
       * <code>repeated .transit_realtime.TimeRange active_period = 1;</code>
       *
       * <pre>
       * Time when the alert should be shown to the user. If missing, the
       * alert will be shown as long as it appears in the feed.
       * If multiple ranges are given, the alert will be shown during all of them.
       * </pre>
       */
      public Builder addActivePeriod(com.google.transit.realtime.GtfsRealtime.TimeRange value) {
        if (activePeriodBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureActivePeriodIsMutable();
          activePeriod_.add(value);
          onChanged();
        } else {
          activePeriodBuilder_.addMessage(value);
        }
        return this;
      }

      /**
       * <code>repeated .transit_realtime.TimeRange active_period = 1;</code>
       *
       * <pre>
       * Time when the alert should be shown to the user. If missing, the
       * alert will be shown as long as it appears in the feed.
       * If multiple ranges are given, the alert will be shown during all of them.
       * </pre>
       */
      public Builder addActivePeriod(int index,
          com.google.transit.realtime.GtfsRealtime.TimeRange value) {
        if (activePeriodBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureActivePeriodIsMutable();
          activePeriod_.add(index, value);
          onChanged();
        } else {
          activePeriodBuilder_.addMessage(index, value);
        }
        return this;
      }

      /**
       * <code>repeated .transit_realtime.TimeRange active_period = 1;</code>
       *
       * <pre>
       * Time when the alert should be shown to the user. If missing, the
       * alert will be shown as long as it appears in the feed.
       * If multiple ranges are given, the alert will be shown during all of them.
       * </pre>
       */
      public Builder addActivePeriod(
          com.google.transit.realtime.GtfsRealtime.TimeRange.Builder builderForValue) {
        if (activePeriodBuilder_ == null) {
          ensureActivePeriodIsMutable();
          activePeriod_.add(builderForValue.build());
          onChanged();
        } else {
          activePeriodBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }

      /**
       * <code>repeated .transit_realtime.TimeRange active_period = 1;</code>
       *
       * <pre>
       * Time when the alert should be shown to the user. If missing, the
       * alert will be shown as long as it appears in the feed.
       * If multiple ranges are given, the alert will be shown during all of them.
       * </pre>
       */
      public Builder addActivePeriod(int index,
          com.google.transit.realtime.GtfsRealtime.TimeRange.Builder builderForValue) {
        if (activePeriodBuilder_ == null) {
          ensureActivePeriodIsMutable();
          activePeriod_.add(index, builderForValue.build());
          onChanged();
        } else {
          activePeriodBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }

      /**
       * <code>repeated .transit_realtime.TimeRange active_period = 1;</code>
       *
       * <pre>
       * Time when the alert should be shown to the user. If missing, the
       * alert will be shown as long as it appears in the feed.
       * If multiple ranges are given, the alert will be shown during all of them.
       * </pre>
       */
      public Builder addAllActivePeriod(
          java.lang.Iterable<? extends com.google.transit.realtime.GtfsRealtime.TimeRange> values) {
        if (activePeriodBuilder_ == null) {
          ensureActivePeriodIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(values, activePeriod_);
          onChanged();
        } else {
          activePeriodBuilder_.addAllMessages(values);
        }
        return this;
      }

      /**
       * <code>repeated .transit_realtime.TimeRange active_period = 1;</code>
       *
       * <pre>
       * Time when the alert should be shown to the user. If missing, the
       * alert will be shown as long as it appears in the feed.
       * If multiple ranges are given, the alert will be shown during all of them.
       * </pre>
       */
      public Builder clearActivePeriod() {
        if (activePeriodBuilder_ == null) {
          activePeriod_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          activePeriodBuilder_.clear();
        }
        return this;
      }

      /**
       * <code>repeated .transit_realtime.TimeRange active_period = 1;</code>
       *
       * <pre>
       * Time when the alert should be shown to the user. If missing, the
       * alert will be shown as long as it appears in the feed.
       * If multiple ranges are given, the alert will be shown during all of them.
       * </pre>
       */
      public Builder removeActivePeriod(int index) {
        if (activePeriodBuilder_ == null) {
          ensureActivePeriodIsMutable();
          activePeriod_.remove(index);
          onChanged();
        } else {
          activePeriodBuilder_.remove(index);
        }
        return this;
      }

      /**
       * <code>repeated .transit_realtime.TimeRange active_period = 1;</code>
       *
       * <pre>
       * Time when the alert should be shown to the user. If missing, the
       * alert will be shown as long as it appears in the feed.
       * If multiple ranges are given, the alert will be shown during all of them.
       * </pre>
       */
      public com.google.transit.realtime.GtfsRealtime.TimeRange.Builder getActivePeriodBuilder(
          int index) {
        return getActivePeriodFieldBuilder().getBuilder(index);
      }

      /**
       * <code>repeated .transit_realtime.TimeRange active_period = 1;</code>
       *
       * <pre>
       * Time when the alert should be shown to the user. If missing, the
       * alert will be shown as long as it appears in the feed.
       * If multiple ranges are given, the alert will be shown during all of them.
       * </pre>
       */
      @Override
      public com.google.transit.realtime.GtfsRealtime.TimeRangeOrBuilder getActivePeriodOrBuilder(
          int index) {
        if (activePeriodBuilder_ == null) {
          return activePeriod_.get(index);
        } else {
          return activePeriodBuilder_.getMessageOrBuilder(index);
        }
      }

      /**
       * <code>repeated .transit_realtime.TimeRange active_period = 1;</code>
       *
       * <pre>
       * Time when the alert should be shown to the user. If missing, the
       * alert will be shown as long as it appears in the feed.
       * If multiple ranges are given, the alert will be shown during all of them.
       * </pre>
       */
      @Override
      public java.util.List<? extends com.google.transit.realtime.GtfsRealtime.TimeRangeOrBuilder> getActivePeriodOrBuilderList() {
        if (activePeriodBuilder_ != null) {
          return activePeriodBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(activePeriod_);
        }
      }

      /**
       * <code>repeated .transit_realtime.TimeRange active_period = 1;</code>
       *
       * <pre>
       * Time when the alert should be shown to the user. If missing, the
       * alert will be shown as long as it appears in the feed.
       * If multiple ranges are given, the alert will be shown during all of them.
       * </pre>
       */
      public com.google.transit.realtime.GtfsRealtime.TimeRange.Builder addActivePeriodBuilder() {
        return getActivePeriodFieldBuilder()
            .addBuilder(com.google.transit.realtime.GtfsRealtime.TimeRange.getDefaultInstance());
      }

      /**
       * <code>repeated .transit_realtime.TimeRange active_period = 1;</code>
       *
       * <pre>
       * Time when the alert should be shown to the user. If missing, the
       * alert will be shown as long as it appears in the feed.
       * If multiple ranges are given, the alert will be shown during all of them.
       * </pre>
       */
      public com.google.transit.realtime.GtfsRealtime.TimeRange.Builder addActivePeriodBuilder(
          int index) {
        return getActivePeriodFieldBuilder().addBuilder(index,
            com.google.transit.realtime.GtfsRealtime.TimeRange.getDefaultInstance());
      }

      /**
       * <code>repeated .transit_realtime.TimeRange active_period = 1;</code>
       *
       * <pre>
       * Time when the alert should be shown to the user. If missing, the
       * alert will be shown as long as it appears in the feed.
       * If multiple ranges are given, the alert will be shown during all of them.
       * </pre>
       */
      public java.util.List<com.google.transit.realtime.GtfsRealtime.TimeRange.Builder> getActivePeriodBuilderList() {
        return getActivePeriodFieldBuilder().getBuilderList();
      }

      private com.google.protobuf.RepeatedFieldBuilder<com.google.transit.realtime.GtfsRealtime.TimeRange, com.google.transit.realtime.GtfsRealtime.TimeRange.Builder, com.google.transit.realtime.GtfsRealtime.TimeRangeOrBuilder> getActivePeriodFieldBuilder() {
        if (activePeriodBuilder_ == null) {
          activePeriodBuilder_ =
              new com.google.protobuf.RepeatedFieldBuilder<com.google.transit.realtime.GtfsRealtime.TimeRange, com.google.transit.realtime.GtfsRealtime.TimeRange.Builder, com.google.transit.realtime.GtfsRealtime.TimeRangeOrBuilder>(
                  activePeriod_, ((bitField0_ & 0x00000001) == 0x00000001), getParentForChildren(),
                  isClean());
          activePeriod_ = null;
        }
        return activePeriodBuilder_;
      }

      private java.util.List<com.google.transit.realtime.GtfsRealtime.EntitySelector> informedEntity_ =
          java.util.Collections.emptyList();

      private void ensureInformedEntityIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          informedEntity_ =
              new java.util.ArrayList<com.google.transit.realtime.GtfsRealtime.EntitySelector>(
                  informedEntity_);
          bitField0_ |= 0x00000002;
        }
      }

      private com.google.protobuf.RepeatedFieldBuilder<com.google.transit.realtime.GtfsRealtime.EntitySelector, com.google.transit.realtime.GtfsRealtime.EntitySelector.Builder, com.google.transit.realtime.GtfsRealtime.EntitySelectorOrBuilder> informedEntityBuilder_;

      /**
       * <code>repeated .transit_realtime.EntitySelector informed_entity = 5;</code>
       *
       * <pre>
       * Entities whose users we should notify of this alert.
       * </pre>
       */
      @Override
      public java.util.List<com.google.transit.realtime.GtfsRealtime.EntitySelector> getInformedEntityList() {
        if (informedEntityBuilder_ == null) {
          return java.util.Collections.unmodifiableList(informedEntity_);
        } else {
          return informedEntityBuilder_.getMessageList();
        }
      }

      /**
       * <code>repeated .transit_realtime.EntitySelector informed_entity = 5;</code>
       *
       * <pre>
       * Entities whose users we should notify of this alert.
       * </pre>
       */
      @Override
      public int getInformedEntityCount() {
        if (informedEntityBuilder_ == null) {
          return informedEntity_.size();
        } else {
          return informedEntityBuilder_.getCount();
        }
      }

      /**
       * <code>repeated .transit_realtime.EntitySelector informed_entity = 5;</code>
       *
       * <pre>
       * Entities whose users we should notify of this alert.
       * </pre>
       */
      @Override
      public com.google.transit.realtime.GtfsRealtime.EntitySelector getInformedEntity(int index) {
        if (informedEntityBuilder_ == null) {
          return informedEntity_.get(index);
        } else {
          return informedEntityBuilder_.getMessage(index);
        }
      }

      /**
       * <code>repeated .transit_realtime.EntitySelector informed_entity = 5;</code>
       *
       * <pre>
       * Entities whose users we should notify of this alert.
       * </pre>
       */
      public Builder setInformedEntity(int index,
          com.google.transit.realtime.GtfsRealtime.EntitySelector value) {
        if (informedEntityBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureInformedEntityIsMutable();
          informedEntity_.set(index, value);
          onChanged();
        } else {
          informedEntityBuilder_.setMessage(index, value);
        }
        return this;
      }

      /**
       * <code>repeated .transit_realtime.EntitySelector informed_entity = 5;</code>
       *
       * <pre>
       * Entities whose users we should notify of this alert.
       * </pre>
       */
      public Builder setInformedEntity(int index,
          com.google.transit.realtime.GtfsRealtime.EntitySelector.Builder builderForValue) {
        if (informedEntityBuilder_ == null) {
          ensureInformedEntityIsMutable();
          informedEntity_.set(index, builderForValue.build());
          onChanged();
        } else {
          informedEntityBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }

      /**
       * <code>repeated .transit_realtime.EntitySelector informed_entity = 5;</code>
       *
       * <pre>
       * Entities whose users we should notify of this alert.
       * </pre>
       */
      public Builder addInformedEntity(
          com.google.transit.realtime.GtfsRealtime.EntitySelector value) {
        if (informedEntityBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureInformedEntityIsMutable();
          informedEntity_.add(value);
          onChanged();
        } else {
          informedEntityBuilder_.addMessage(value);
        }
        return this;
      }

      /**
       * <code>repeated .transit_realtime.EntitySelector informed_entity = 5;</code>
       *
       * <pre>
       * Entities whose users we should notify of this alert.
       * </pre>
       */
      public Builder addInformedEntity(int index,
          com.google.transit.realtime.GtfsRealtime.EntitySelector value) {
        if (informedEntityBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureInformedEntityIsMutable();
          informedEntity_.add(index, value);
          onChanged();
        } else {
          informedEntityBuilder_.addMessage(index, value);
        }
        return this;
      }

      /**
       * <code>repeated .transit_realtime.EntitySelector informed_entity = 5;</code>
       *
       * <pre>
       * Entities whose users we should notify of this alert.
       * </pre>
       */
      public Builder addInformedEntity(
          com.google.transit.realtime.GtfsRealtime.EntitySelector.Builder builderForValue) {
        if (informedEntityBuilder_ == null) {
          ensureInformedEntityIsMutable();
          informedEntity_.add(builderForValue.build());
          onChanged();
        } else {
          informedEntityBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }

      /**
       * <code>repeated .transit_realtime.EntitySelector informed_entity = 5;</code>
       *
       * <pre>
       * Entities whose users we should notify of this alert.
       * </pre>
       */
      public Builder addInformedEntity(int index,
          com.google.transit.realtime.GtfsRealtime.EntitySelector.Builder builderForValue) {
        if (informedEntityBuilder_ == null) {
          ensureInformedEntityIsMutable();
          informedEntity_.add(index, builderForValue.build());
          onChanged();
        } else {
          informedEntityBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }

      /**
       * <code>repeated .transit_realtime.EntitySelector informed_entity = 5;</code>
       *
       * <pre>
       * Entities whose users we should notify of this alert.
       * </pre>
       */
      public Builder addAllInformedEntity(
          java.lang.Iterable<? extends com.google.transit.realtime.GtfsRealtime.EntitySelector> values) {
        if (informedEntityBuilder_ == null) {
          ensureInformedEntityIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(values, informedEntity_);
          onChanged();
        } else {
          informedEntityBuilder_.addAllMessages(values);
        }
        return this;
      }

      /**
       * <code>repeated .transit_realtime.EntitySelector informed_entity = 5;</code>
       *
       * <pre>
       * Entities whose users we should notify of this alert.
       * </pre>
       */
      public Builder clearInformedEntity() {
        if (informedEntityBuilder_ == null) {
          informedEntity_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          informedEntityBuilder_.clear();
        }
        return this;
      }

      /**
       * <code>repeated .transit_realtime.EntitySelector informed_entity = 5;</code>
       *
       * <pre>
       * Entities whose users we should notify of this alert.
       * </pre>
       */
      public Builder removeInformedEntity(int index) {
        if (informedEntityBuilder_ == null) {
          ensureInformedEntityIsMutable();
          informedEntity_.remove(index);
          onChanged();
        } else {
          informedEntityBuilder_.remove(index);
        }
        return this;
      }

      /**
       * <code>repeated .transit_realtime.EntitySelector informed_entity = 5;</code>
       *
       * <pre>
       * Entities whose users we should notify of this alert.
       * </pre>
       */
      public com.google.transit.realtime.GtfsRealtime.EntitySelector.Builder getInformedEntityBuilder(
          int index) {
        return getInformedEntityFieldBuilder().getBuilder(index);
      }

      /**
       * <code>repeated .transit_realtime.EntitySelector informed_entity = 5;</code>
       *
       * <pre>
       * Entities whose users we should notify of this alert.
       * </pre>
       */
      @Override
      public com.google.transit.realtime.GtfsRealtime.EntitySelectorOrBuilder getInformedEntityOrBuilder(
          int index) {
        if (informedEntityBuilder_ == null) {
          return informedEntity_.get(index);
        } else {
          return informedEntityBuilder_.getMessageOrBuilder(index);
        }
      }

      /**
       * <code>repeated .transit_realtime.EntitySelector informed_entity = 5;</code>
       *
       * <pre>
       * Entities whose users we should notify of this alert.
       * </pre>
       */
      @Override
      public java.util.List<? extends com.google.transit.realtime.GtfsRealtime.EntitySelectorOrBuilder> getInformedEntityOrBuilderList() {
        if (informedEntityBuilder_ != null) {
          return informedEntityBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(informedEntity_);
        }
      }

      /**
       * <code>repeated .transit_realtime.EntitySelector informed_entity = 5;</code>
       *
       * <pre>
       * Entities whose users we should notify of this alert.
       * </pre>
       */
      public com.google.transit.realtime.GtfsRealtime.EntitySelector.Builder addInformedEntityBuilder() {
        return getInformedEntityFieldBuilder().addBuilder(
            com.google.transit.realtime.GtfsRealtime.EntitySelector.getDefaultInstance());
      }

      /**
       * <code>repeated .transit_realtime.EntitySelector informed_entity = 5;</code>
       *
       * <pre>
       * Entities whose users we should notify of this alert.
       * </pre>
       */
      public com.google.transit.realtime.GtfsRealtime.EntitySelector.Builder addInformedEntityBuilder(
          int index) {
        return getInformedEntityFieldBuilder().addBuilder(index,
            com.google.transit.realtime.GtfsRealtime.EntitySelector.getDefaultInstance());
      }

      /**
       * <code>repeated .transit_realtime.EntitySelector informed_entity = 5;</code>
       *
       * <pre>
       * Entities whose users we should notify of this alert.
       * </pre>
       */
      public java.util.List<com.google.transit.realtime.GtfsRealtime.EntitySelector.Builder> getInformedEntityBuilderList() {
        return getInformedEntityFieldBuilder().getBuilderList();
      }

      private com.google.protobuf.RepeatedFieldBuilder<com.google.transit.realtime.GtfsRealtime.EntitySelector, com.google.transit.realtime.GtfsRealtime.EntitySelector.Builder, com.google.transit.realtime.GtfsRealtime.EntitySelectorOrBuilder> getInformedEntityFieldBuilder() {
        if (informedEntityBuilder_ == null) {
          informedEntityBuilder_ =
              new com.google.protobuf.RepeatedFieldBuilder<com.google.transit.realtime.GtfsRealtime.EntitySelector, com.google.transit.realtime.GtfsRealtime.EntitySelector.Builder, com.google.transit.realtime.GtfsRealtime.EntitySelectorOrBuilder>(
                  informedEntity_, ((bitField0_ & 0x00000002) == 0x00000002),
                  getParentForChildren(), isClean());
          informedEntity_ = null;
        }
        return informedEntityBuilder_;
      }

      private com.google.transit.realtime.GtfsRealtime.Alert.Cause cause_ =
          com.google.transit.realtime.GtfsRealtime.Alert.Cause.UNKNOWN_CAUSE;

      /**
       * <code>optional .transit_realtime.Alert.Cause cause = 6 [default = UNKNOWN_CAUSE];</code>
       */
      @Override
      public boolean hasCause() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }

      /**
       * <code>optional .transit_realtime.Alert.Cause cause = 6 [default = UNKNOWN_CAUSE];</code>
       */
      @Override
      public com.google.transit.realtime.GtfsRealtime.Alert.Cause getCause() {
        return cause_;
      }

      /**
       * <code>optional .transit_realtime.Alert.Cause cause = 6 [default = UNKNOWN_CAUSE];</code>
       */
      public Builder setCause(com.google.transit.realtime.GtfsRealtime.Alert.Cause value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000004;
        cause_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>optional .transit_realtime.Alert.Cause cause = 6 [default = UNKNOWN_CAUSE];</code>
       */
      public Builder clearCause() {
        bitField0_ = (bitField0_ & ~0x00000004);
        cause_ = com.google.transit.realtime.GtfsRealtime.Alert.Cause.UNKNOWN_CAUSE;
        onChanged();
        return this;
      }

      private com.google.transit.realtime.GtfsRealtime.Alert.Effect effect_ =
          com.google.transit.realtime.GtfsRealtime.Alert.Effect.UNKNOWN_EFFECT;

      /**
       * <code>optional .transit_realtime.Alert.Effect effect = 7 [default = UNKNOWN_EFFECT];</code>
       */
      @Override
      public boolean hasEffect() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }

      /**
       * <code>optional .transit_realtime.Alert.Effect effect = 7 [default = UNKNOWN_EFFECT];</code>
       */
      @Override
      public com.google.transit.realtime.GtfsRealtime.Alert.Effect getEffect() {
        return effect_;
      }

      /**
       * <code>optional .transit_realtime.Alert.Effect effect = 7 [default = UNKNOWN_EFFECT];</code>
       */
      public Builder setEffect(com.google.transit.realtime.GtfsRealtime.Alert.Effect value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000008;
        effect_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>optional .transit_realtime.Alert.Effect effect = 7 [default = UNKNOWN_EFFECT];</code>
       */
      public Builder clearEffect() {
        bitField0_ = (bitField0_ & ~0x00000008);
        effect_ = com.google.transit.realtime.GtfsRealtime.Alert.Effect.UNKNOWN_EFFECT;
        onChanged();
        return this;
      }

      private com.google.transit.realtime.GtfsRealtime.TranslatedString url_ =
          com.google.transit.realtime.GtfsRealtime.TranslatedString.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<com.google.transit.realtime.GtfsRealtime.TranslatedString, com.google.transit.realtime.GtfsRealtime.TranslatedString.Builder, com.google.transit.realtime.GtfsRealtime.TranslatedStringOrBuilder> urlBuilder_;

      /**
       * <code>optional .transit_realtime.TranslatedString url = 8;</code>
       *
       * <pre>
       * The URL which provides additional information about the alert.
       * </pre>
       */
      @Override
      public boolean hasUrl() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }

      /**
       * <code>optional .transit_realtime.TranslatedString url = 8;</code>
       *
       * <pre>
       * The URL which provides additional information about the alert.
       * </pre>
       */
      @Override
      public com.google.transit.realtime.GtfsRealtime.TranslatedString getUrl() {
        if (urlBuilder_ == null) {
          return url_;
        } else {
          return urlBuilder_.getMessage();
        }
      }

      /**
       * <code>optional .transit_realtime.TranslatedString url = 8;</code>
       *
       * <pre>
       * The URL which provides additional information about the alert.
       * </pre>
       */
      public Builder setUrl(com.google.transit.realtime.GtfsRealtime.TranslatedString value) {
        if (urlBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          url_ = value;
          onChanged();
        } else {
          urlBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000010;
        return this;
      }

      /**
       * <code>optional .transit_realtime.TranslatedString url = 8;</code>
       *
       * <pre>
       * The URL which provides additional information about the alert.
       * </pre>
       */
      public Builder setUrl(
          com.google.transit.realtime.GtfsRealtime.TranslatedString.Builder builderForValue) {
        if (urlBuilder_ == null) {
          url_ = builderForValue.build();
          onChanged();
        } else {
          urlBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000010;
        return this;
      }

      /**
       * <code>optional .transit_realtime.TranslatedString url = 8;</code>
       *
       * <pre>
       * The URL which provides additional information about the alert.
       * </pre>
       */
      public Builder mergeUrl(com.google.transit.realtime.GtfsRealtime.TranslatedString value) {
        if (urlBuilder_ == null) {
          if (((bitField0_ & 0x00000010) == 0x00000010)
              && url_ != com.google.transit.realtime.GtfsRealtime.TranslatedString
                  .getDefaultInstance()) {
            url_ = com.google.transit.realtime.GtfsRealtime.TranslatedString.newBuilder(url_)
                .mergeFrom(value).buildPartial();
          } else {
            url_ = value;
          }
          onChanged();
        } else {
          urlBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000010;
        return this;
      }

      /**
       * <code>optional .transit_realtime.TranslatedString url = 8;</code>
       *
       * <pre>
       * The URL which provides additional information about the alert.
       * </pre>
       */
      public Builder clearUrl() {
        if (urlBuilder_ == null) {
          url_ = com.google.transit.realtime.GtfsRealtime.TranslatedString.getDefaultInstance();
          onChanged();
        } else {
          urlBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000010);
        return this;
      }

      /**
       * <code>optional .transit_realtime.TranslatedString url = 8;</code>
       *
       * <pre>
       * The URL which provides additional information about the alert.
       * </pre>
       */
      public com.google.transit.realtime.GtfsRealtime.TranslatedString.Builder getUrlBuilder() {
        bitField0_ |= 0x00000010;
        onChanged();
        return getUrlFieldBuilder().getBuilder();
      }

      /**
       * <code>optional .transit_realtime.TranslatedString url = 8;</code>
       *
       * <pre>
       * The URL which provides additional information about the alert.
       * </pre>
       */
      @Override
      public com.google.transit.realtime.GtfsRealtime.TranslatedStringOrBuilder getUrlOrBuilder() {
        if (urlBuilder_ != null) {
          return urlBuilder_.getMessageOrBuilder();
        } else {
          return url_;
        }
      }

      /**
       * <code>optional .transit_realtime.TranslatedString url = 8;</code>
       *
       * <pre>
       * The URL which provides additional information about the alert.
       * </pre>
       */
      private com.google.protobuf.SingleFieldBuilder<com.google.transit.realtime.GtfsRealtime.TranslatedString, com.google.transit.realtime.GtfsRealtime.TranslatedString.Builder, com.google.transit.realtime.GtfsRealtime.TranslatedStringOrBuilder> getUrlFieldBuilder() {
        if (urlBuilder_ == null) {
          urlBuilder_ =
              new com.google.protobuf.SingleFieldBuilder<com.google.transit.realtime.GtfsRealtime.TranslatedString, com.google.transit.realtime.GtfsRealtime.TranslatedString.Builder, com.google.transit.realtime.GtfsRealtime.TranslatedStringOrBuilder>(
                  getUrl(), getParentForChildren(), isClean());
          url_ = null;
        }
        return urlBuilder_;
      }

      private com.google.transit.realtime.GtfsRealtime.TranslatedString headerText_ =
          com.google.transit.realtime.GtfsRealtime.TranslatedString.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<com.google.transit.realtime.GtfsRealtime.TranslatedString, com.google.transit.realtime.GtfsRealtime.TranslatedString.Builder, com.google.transit.realtime.GtfsRealtime.TranslatedStringOrBuilder> headerTextBuilder_;

      /**
       * <code>optional .transit_realtime.TranslatedString header_text = 10;</code>
       *
       * <pre>
       * Alert header. Contains a short summary of the alert text as plain-text.
       * </pre>
       */
      @Override
      public boolean hasHeaderText() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }

      /**
       * <code>optional .transit_realtime.TranslatedString header_text = 10;</code>
       *
       * <pre>
       * Alert header. Contains a short summary of the alert text as plain-text.
       * </pre>
       */
      @Override
      public com.google.transit.realtime.GtfsRealtime.TranslatedString getHeaderText() {
        if (headerTextBuilder_ == null) {
          return headerText_;
        } else {
          return headerTextBuilder_.getMessage();
        }
      }

      /**
       * <code>optional .transit_realtime.TranslatedString header_text = 10;</code>
       *
       * <pre>
       * Alert header. Contains a short summary of the alert text as plain-text.
       * </pre>
       */
      public Builder setHeaderText(
          com.google.transit.realtime.GtfsRealtime.TranslatedString value) {
        if (headerTextBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          headerText_ = value;
          onChanged();
        } else {
          headerTextBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000020;
        return this;
      }

      /**
       * <code>optional .transit_realtime.TranslatedString header_text = 10;</code>
       *
       * <pre>
       * Alert header. Contains a short summary of the alert text as plain-text.
       * </pre>
       */
      public Builder setHeaderText(
          com.google.transit.realtime.GtfsRealtime.TranslatedString.Builder builderForValue) {
        if (headerTextBuilder_ == null) {
          headerText_ = builderForValue.build();
          onChanged();
        } else {
          headerTextBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000020;
        return this;
      }

      /**
       * <code>optional .transit_realtime.TranslatedString header_text = 10;</code>
       *
       * <pre>
       * Alert header. Contains a short summary of the alert text as plain-text.
       * </pre>
       */
      public Builder mergeHeaderText(
          com.google.transit.realtime.GtfsRealtime.TranslatedString value) {
        if (headerTextBuilder_ == null) {
          if (((bitField0_ & 0x00000020) == 0x00000020)
              && headerText_ != com.google.transit.realtime.GtfsRealtime.TranslatedString
                  .getDefaultInstance()) {
            headerText_ = com.google.transit.realtime.GtfsRealtime.TranslatedString
                .newBuilder(headerText_).mergeFrom(value).buildPartial();
          } else {
            headerText_ = value;
          }
          onChanged();
        } else {
          headerTextBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000020;
        return this;
      }

      /**
       * <code>optional .transit_realtime.TranslatedString header_text = 10;</code>
       *
       * <pre>
       * Alert header. Contains a short summary of the alert text as plain-text.
       * </pre>
       */
      public Builder clearHeaderText() {
        if (headerTextBuilder_ == null) {
          headerText_ =
              com.google.transit.realtime.GtfsRealtime.TranslatedString.getDefaultInstance();
          onChanged();
        } else {
          headerTextBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000020);
        return this;
      }

      /**
       * <code>optional .transit_realtime.TranslatedString header_text = 10;</code>
       *
       * <pre>
       * Alert header. Contains a short summary of the alert text as plain-text.
       * </pre>
       */
      public com.google.transit.realtime.GtfsRealtime.TranslatedString.Builder getHeaderTextBuilder() {
        bitField0_ |= 0x00000020;
        onChanged();
        return getHeaderTextFieldBuilder().getBuilder();
      }

      /**
       * <code>optional .transit_realtime.TranslatedString header_text = 10;</code>
       *
       * <pre>
       * Alert header. Contains a short summary of the alert text as plain-text.
       * </pre>
       */
      @Override
      public com.google.transit.realtime.GtfsRealtime.TranslatedStringOrBuilder getHeaderTextOrBuilder() {
        if (headerTextBuilder_ != null) {
          return headerTextBuilder_.getMessageOrBuilder();
        } else {
          return headerText_;
        }
      }

      /**
       * <code>optional .transit_realtime.TranslatedString header_text = 10;</code>
       *
       * <pre>
       * Alert header. Contains a short summary of the alert text as plain-text.
       * </pre>
       */
      private com.google.protobuf.SingleFieldBuilder<com.google.transit.realtime.GtfsRealtime.TranslatedString, com.google.transit.realtime.GtfsRealtime.TranslatedString.Builder, com.google.transit.realtime.GtfsRealtime.TranslatedStringOrBuilder> getHeaderTextFieldBuilder() {
        if (headerTextBuilder_ == null) {
          headerTextBuilder_ =
              new com.google.protobuf.SingleFieldBuilder<com.google.transit.realtime.GtfsRealtime.TranslatedString, com.google.transit.realtime.GtfsRealtime.TranslatedString.Builder, com.google.transit.realtime.GtfsRealtime.TranslatedStringOrBuilder>(
                  getHeaderText(), getParentForChildren(), isClean());
          headerText_ = null;
        }
        return headerTextBuilder_;
      }

      private com.google.transit.realtime.GtfsRealtime.TranslatedString descriptionText_ =
          com.google.transit.realtime.GtfsRealtime.TranslatedString.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<com.google.transit.realtime.GtfsRealtime.TranslatedString, com.google.transit.realtime.GtfsRealtime.TranslatedString.Builder, com.google.transit.realtime.GtfsRealtime.TranslatedStringOrBuilder> descriptionTextBuilder_;

      /**
       * <code>optional .transit_realtime.TranslatedString description_text = 11;</code>
       *
       * <pre>
       * Full description for the alert as plain-text. The information in the
       * description should add to the information of the header.
       * </pre>
       */
      @Override
      public boolean hasDescriptionText() {
        return ((bitField0_ & 0x00000040) == 0x00000040);
      }

      /**
       * <code>optional .transit_realtime.TranslatedString description_text = 11;</code>
       *
       * <pre>
       * Full description for the alert as plain-text. The information in the
       * description should add to the information of the header.
       * </pre>
       */
      @Override
      public com.google.transit.realtime.GtfsRealtime.TranslatedString getDescriptionText() {
        if (descriptionTextBuilder_ == null) {
          return descriptionText_;
        } else {
          return descriptionTextBuilder_.getMessage();
        }
      }

      /**
       * <code>optional .transit_realtime.TranslatedString description_text = 11;</code>
       *
       * <pre>
       * Full description for the alert as plain-text. The information in the
       * description should add to the information of the header.
       * </pre>
       */
      public Builder setDescriptionText(
          com.google.transit.realtime.GtfsRealtime.TranslatedString value) {
        if (descriptionTextBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          descriptionText_ = value;
          onChanged();
        } else {
          descriptionTextBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000040;
        return this;
      }

      /**
       * <code>optional .transit_realtime.TranslatedString description_text = 11;</code>
       *
       * <pre>
       * Full description for the alert as plain-text. The information in the
       * description should add to the information of the header.
       * </pre>
       */
      public Builder setDescriptionText(
          com.google.transit.realtime.GtfsRealtime.TranslatedString.Builder builderForValue) {
        if (descriptionTextBuilder_ == null) {
          descriptionText_ = builderForValue.build();
          onChanged();
        } else {
          descriptionTextBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000040;
        return this;
      }

      /**
       * <code>optional .transit_realtime.TranslatedString description_text = 11;</code>
       *
       * <pre>
       * Full description for the alert as plain-text. The information in the
       * description should add to the information of the header.
       * </pre>
       */
      public Builder mergeDescriptionText(
          com.google.transit.realtime.GtfsRealtime.TranslatedString value) {
        if (descriptionTextBuilder_ == null) {
          if (((bitField0_ & 0x00000040) == 0x00000040)
              && descriptionText_ != com.google.transit.realtime.GtfsRealtime.TranslatedString
                  .getDefaultInstance()) {
            descriptionText_ = com.google.transit.realtime.GtfsRealtime.TranslatedString
                .newBuilder(descriptionText_).mergeFrom(value).buildPartial();
          } else {
            descriptionText_ = value;
          }
          onChanged();
        } else {
          descriptionTextBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000040;
        return this;
      }

      /**
       * <code>optional .transit_realtime.TranslatedString description_text = 11;</code>
       *
       * <pre>
       * Full description for the alert as plain-text. The information in the
       * description should add to the information of the header.
       * </pre>
       */
      public Builder clearDescriptionText() {
        if (descriptionTextBuilder_ == null) {
          descriptionText_ =
              com.google.transit.realtime.GtfsRealtime.TranslatedString.getDefaultInstance();
          onChanged();
        } else {
          descriptionTextBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000040);
        return this;
      }

      /**
       * <code>optional .transit_realtime.TranslatedString description_text = 11;</code>
       *
       * <pre>
       * Full description for the alert as plain-text. The information in the
       * description should add to the information of the header.
       * </pre>
       */
      public com.google.transit.realtime.GtfsRealtime.TranslatedString.Builder getDescriptionTextBuilder() {
        bitField0_ |= 0x00000040;
        onChanged();
        return getDescriptionTextFieldBuilder().getBuilder();
      }

      /**
       * <code>optional .transit_realtime.TranslatedString description_text = 11;</code>
       *
       * <pre>
       * Full description for the alert as plain-text. The information in the
       * description should add to the information of the header.
       * </pre>
       */
      @Override
      public com.google.transit.realtime.GtfsRealtime.TranslatedStringOrBuilder getDescriptionTextOrBuilder() {
        if (descriptionTextBuilder_ != null) {
          return descriptionTextBuilder_.getMessageOrBuilder();
        } else {
          return descriptionText_;
        }
      }

      /**
       * <code>optional .transit_realtime.TranslatedString description_text = 11;</code>
       *
       * <pre>
       * Full description for the alert as plain-text. The information in the
       * description should add to the information of the header.
       * </pre>
       */
      private com.google.protobuf.SingleFieldBuilder<com.google.transit.realtime.GtfsRealtime.TranslatedString, com.google.transit.realtime.GtfsRealtime.TranslatedString.Builder, com.google.transit.realtime.GtfsRealtime.TranslatedStringOrBuilder> getDescriptionTextFieldBuilder() {
        if (descriptionTextBuilder_ == null) {
          descriptionTextBuilder_ =
              new com.google.protobuf.SingleFieldBuilder<com.google.transit.realtime.GtfsRealtime.TranslatedString, com.google.transit.realtime.GtfsRealtime.TranslatedString.Builder, com.google.transit.realtime.GtfsRealtime.TranslatedStringOrBuilder>(
                  getDescriptionText(), getParentForChildren(), isClean());
          descriptionText_ = null;
        }
        return descriptionTextBuilder_;
      }

      private com.google.transit.realtime.GtfsRealtime.TranslatedString ttsHeaderText_ =
          com.google.transit.realtime.GtfsRealtime.TranslatedString.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<com.google.transit.realtime.GtfsRealtime.TranslatedString, com.google.transit.realtime.GtfsRealtime.TranslatedString.Builder, com.google.transit.realtime.GtfsRealtime.TranslatedStringOrBuilder> ttsHeaderTextBuilder_;

      /**
       * <code>optional .transit_realtime.TranslatedString tts_header_text = 12;</code>
       *
       * <pre>
       * Text for alert header to be used in text-to-speech implementations. This field is the text-to-speech version of header_text.
       * This field is still experimental, and subject to change. It may be formally adopted in the future.
       * </pre>
       */
      @Override
      public boolean hasTtsHeaderText() {
        return ((bitField0_ & 0x00000080) == 0x00000080);
      }

      /**
       * <code>optional .transit_realtime.TranslatedString tts_header_text = 12;</code>
       *
       * <pre>
       * Text for alert header to be used in text-to-speech implementations. This field is the text-to-speech version of header_text.
       * This field is still experimental, and subject to change. It may be formally adopted in the future.
       * </pre>
       */
      @Override
      public com.google.transit.realtime.GtfsRealtime.TranslatedString getTtsHeaderText() {
        if (ttsHeaderTextBuilder_ == null) {
          return ttsHeaderText_;
        } else {
          return ttsHeaderTextBuilder_.getMessage();
        }
      }

      /**
       * <code>optional .transit_realtime.TranslatedString tts_header_text = 12;</code>
       *
       * <pre>
       * Text for alert header to be used in text-to-speech implementations. This field is the text-to-speech version of header_text.
       * This field is still experimental, and subject to change. It may be formally adopted in the future.
       * </pre>
       */
      public Builder setTtsHeaderText(
          com.google.transit.realtime.GtfsRealtime.TranslatedString value) {
        if (ttsHeaderTextBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ttsHeaderText_ = value;
          onChanged();
        } else {
          ttsHeaderTextBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000080;
        return this;
      }

      /**
       * <code>optional .transit_realtime.TranslatedString tts_header_text = 12;</code>
       *
       * <pre>
       * Text for alert header to be used in text-to-speech implementations. This field is the text-to-speech version of header_text.
       * This field is still experimental, and subject to change. It may be formally adopted in the future.
       * </pre>
       */
      public Builder setTtsHeaderText(
          com.google.transit.realtime.GtfsRealtime.TranslatedString.Builder builderForValue) {
        if (ttsHeaderTextBuilder_ == null) {
          ttsHeaderText_ = builderForValue.build();
          onChanged();
        } else {
          ttsHeaderTextBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000080;
        return this;
      }

      /**
       * <code>optional .transit_realtime.TranslatedString tts_header_text = 12;</code>
       *
       * <pre>
       * Text for alert header to be used in text-to-speech implementations. This field is the text-to-speech version of header_text.
       * This field is still experimental, and subject to change. It may be formally adopted in the future.
       * </pre>
       */
      public Builder mergeTtsHeaderText(
          com.google.transit.realtime.GtfsRealtime.TranslatedString value) {
        if (ttsHeaderTextBuilder_ == null) {
          if (((bitField0_ & 0x00000080) == 0x00000080)
              && ttsHeaderText_ != com.google.transit.realtime.GtfsRealtime.TranslatedString
                  .getDefaultInstance()) {
            ttsHeaderText_ = com.google.transit.realtime.GtfsRealtime.TranslatedString
                .newBuilder(ttsHeaderText_).mergeFrom(value).buildPartial();
          } else {
            ttsHeaderText_ = value;
          }
          onChanged();
        } else {
          ttsHeaderTextBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000080;
        return this;
      }

      /**
       * <code>optional .transit_realtime.TranslatedString tts_header_text = 12;</code>
       *
       * <pre>
       * Text for alert header to be used in text-to-speech implementations. This field is the text-to-speech version of header_text.
       * This field is still experimental, and subject to change. It may be formally adopted in the future.
       * </pre>
       */
      public Builder clearTtsHeaderText() {
        if (ttsHeaderTextBuilder_ == null) {
          ttsHeaderText_ =
              com.google.transit.realtime.GtfsRealtime.TranslatedString.getDefaultInstance();
          onChanged();
        } else {
          ttsHeaderTextBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000080);
        return this;
      }

      /**
       * <code>optional .transit_realtime.TranslatedString tts_header_text = 12;</code>
       *
       * <pre>
       * Text for alert header to be used in text-to-speech implementations. This field is the text-to-speech version of header_text.
       * This field is still experimental, and subject to change. It may be formally adopted in the future.
       * </pre>
       */
      public com.google.transit.realtime.GtfsRealtime.TranslatedString.Builder getTtsHeaderTextBuilder() {
        bitField0_ |= 0x00000080;
        onChanged();
        return getTtsHeaderTextFieldBuilder().getBuilder();
      }

      /**
       * <code>optional .transit_realtime.TranslatedString tts_header_text = 12;</code>
       *
       * <pre>
       * Text for alert header to be used in text-to-speech implementations. This field is the text-to-speech version of header_text.
       * This field is still experimental, and subject to change. It may be formally adopted in the future.
       * </pre>
       */
      @Override
      public com.google.transit.realtime.GtfsRealtime.TranslatedStringOrBuilder getTtsHeaderTextOrBuilder() {
        if (ttsHeaderTextBuilder_ != null) {
          return ttsHeaderTextBuilder_.getMessageOrBuilder();
        } else {
          return ttsHeaderText_;
        }
      }

      /**
       * <code>optional .transit_realtime.TranslatedString tts_header_text = 12;</code>
       *
       * <pre>
       * Text for alert header to be used in text-to-speech implementations. This field is the text-to-speech version of header_text.
       * This field is still experimental, and subject to change. It may be formally adopted in the future.
       * </pre>
       */
      private com.google.protobuf.SingleFieldBuilder<com.google.transit.realtime.GtfsRealtime.TranslatedString, com.google.transit.realtime.GtfsRealtime.TranslatedString.Builder, com.google.transit.realtime.GtfsRealtime.TranslatedStringOrBuilder> getTtsHeaderTextFieldBuilder() {
        if (ttsHeaderTextBuilder_ == null) {
          ttsHeaderTextBuilder_ =
              new com.google.protobuf.SingleFieldBuilder<com.google.transit.realtime.GtfsRealtime.TranslatedString, com.google.transit.realtime.GtfsRealtime.TranslatedString.Builder, com.google.transit.realtime.GtfsRealtime.TranslatedStringOrBuilder>(
                  getTtsHeaderText(), getParentForChildren(), isClean());
          ttsHeaderText_ = null;
        }
        return ttsHeaderTextBuilder_;
      }

      private com.google.transit.realtime.GtfsRealtime.TranslatedString ttsDescriptionText_ =
          com.google.transit.realtime.GtfsRealtime.TranslatedString.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<com.google.transit.realtime.GtfsRealtime.TranslatedString, com.google.transit.realtime.GtfsRealtime.TranslatedString.Builder, com.google.transit.realtime.GtfsRealtime.TranslatedStringOrBuilder> ttsDescriptionTextBuilder_;

      /**
       * <code>optional .transit_realtime.TranslatedString tts_description_text = 13;</code>
       *
       * <pre>
       * Text for full description for the alert to be used in text-to-speech implementations. This field is the text-to-speech version of description_text.
       * This field is still experimental, and subject to change. It may be formally adopted in the future.
       * </pre>
       */
      @Override
      public boolean hasTtsDescriptionText() {
        return ((bitField0_ & 0x00000100) == 0x00000100);
      }

      /**
       * <code>optional .transit_realtime.TranslatedString tts_description_text = 13;</code>
       *
       * <pre>
       * Text for full description for the alert to be used in text-to-speech implementations. This field is the text-to-speech version of description_text.
       * This field is still experimental, and subject to change. It may be formally adopted in the future.
       * </pre>
       */
      @Override
      public com.google.transit.realtime.GtfsRealtime.TranslatedString getTtsDescriptionText() {
        if (ttsDescriptionTextBuilder_ == null) {
          return ttsDescriptionText_;
        } else {
          return ttsDescriptionTextBuilder_.getMessage();
        }
      }

      /**
       * <code>optional .transit_realtime.TranslatedString tts_description_text = 13;</code>
       *
       * <pre>
       * Text for full description for the alert to be used in text-to-speech implementations. This field is the text-to-speech version of description_text.
       * This field is still experimental, and subject to change. It may be formally adopted in the future.
       * </pre>
       */
      public Builder setTtsDescriptionText(
          com.google.transit.realtime.GtfsRealtime.TranslatedString value) {
        if (ttsDescriptionTextBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ttsDescriptionText_ = value;
          onChanged();
        } else {
          ttsDescriptionTextBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000100;
        return this;
      }

      /**
       * <code>optional .transit_realtime.TranslatedString tts_description_text = 13;</code>
       *
       * <pre>
       * Text for full description for the alert to be used in text-to-speech implementations. This field is the text-to-speech version of description_text.
       * This field is still experimental, and subject to change. It may be formally adopted in the future.
       * </pre>
       */
      public Builder setTtsDescriptionText(
          com.google.transit.realtime.GtfsRealtime.TranslatedString.Builder builderForValue) {
        if (ttsDescriptionTextBuilder_ == null) {
          ttsDescriptionText_ = builderForValue.build();
          onChanged();
        } else {
          ttsDescriptionTextBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000100;
        return this;
      }

      /**
       * <code>optional .transit_realtime.TranslatedString tts_description_text = 13;</code>
       *
       * <pre>
       * Text for full description for the alert to be used in text-to-speech implementations. This field is the text-to-speech version of description_text.
       * This field is still experimental, and subject to change. It may be formally adopted in the future.
       * </pre>
       */
      public Builder mergeTtsDescriptionText(
          com.google.transit.realtime.GtfsRealtime.TranslatedString value) {
        if (ttsDescriptionTextBuilder_ == null) {
          if (((bitField0_ & 0x00000100) == 0x00000100)
              && ttsDescriptionText_ != com.google.transit.realtime.GtfsRealtime.TranslatedString
                  .getDefaultInstance()) {
            ttsDescriptionText_ = com.google.transit.realtime.GtfsRealtime.TranslatedString
                .newBuilder(ttsDescriptionText_).mergeFrom(value).buildPartial();
          } else {
            ttsDescriptionText_ = value;
          }
          onChanged();
        } else {
          ttsDescriptionTextBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000100;
        return this;
      }

      /**
       * <code>optional .transit_realtime.TranslatedString tts_description_text = 13;</code>
       *
       * <pre>
       * Text for full description for the alert to be used in text-to-speech implementations. This field is the text-to-speech version of description_text.
       * This field is still experimental, and subject to change. It may be formally adopted in the future.
       * </pre>
       */
      public Builder clearTtsDescriptionText() {
        if (ttsDescriptionTextBuilder_ == null) {
          ttsDescriptionText_ =
              com.google.transit.realtime.GtfsRealtime.TranslatedString.getDefaultInstance();
          onChanged();
        } else {
          ttsDescriptionTextBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000100);
        return this;
      }

      /**
       * <code>optional .transit_realtime.TranslatedString tts_description_text = 13;</code>
       *
       * <pre>
       * Text for full description for the alert to be used in text-to-speech implementations. This field is the text-to-speech version of description_text.
       * This field is still experimental, and subject to change. It may be formally adopted in the future.
       * </pre>
       */
      public com.google.transit.realtime.GtfsRealtime.TranslatedString.Builder getTtsDescriptionTextBuilder() {
        bitField0_ |= 0x00000100;
        onChanged();
        return getTtsDescriptionTextFieldBuilder().getBuilder();
      }

      /**
       * <code>optional .transit_realtime.TranslatedString tts_description_text = 13;</code>
       *
       * <pre>
       * Text for full description for the alert to be used in text-to-speech implementations. This field is the text-to-speech version of description_text.
       * This field is still experimental, and subject to change. It may be formally adopted in the future.
       * </pre>
       */
      @Override
      public com.google.transit.realtime.GtfsRealtime.TranslatedStringOrBuilder getTtsDescriptionTextOrBuilder() {
        if (ttsDescriptionTextBuilder_ != null) {
          return ttsDescriptionTextBuilder_.getMessageOrBuilder();
        } else {
          return ttsDescriptionText_;
        }
      }

      /**
       * <code>optional .transit_realtime.TranslatedString tts_description_text = 13;</code>
       *
       * <pre>
       * Text for full description for the alert to be used in text-to-speech implementations. This field is the text-to-speech version of description_text.
       * This field is still experimental, and subject to change. It may be formally adopted in the future.
       * </pre>
       */
      private com.google.protobuf.SingleFieldBuilder<com.google.transit.realtime.GtfsRealtime.TranslatedString, com.google.transit.realtime.GtfsRealtime.TranslatedString.Builder, com.google.transit.realtime.GtfsRealtime.TranslatedStringOrBuilder> getTtsDescriptionTextFieldBuilder() {
        if (ttsDescriptionTextBuilder_ == null) {
          ttsDescriptionTextBuilder_ =
              new com.google.protobuf.SingleFieldBuilder<com.google.transit.realtime.GtfsRealtime.TranslatedString, com.google.transit.realtime.GtfsRealtime.TranslatedString.Builder, com.google.transit.realtime.GtfsRealtime.TranslatedStringOrBuilder>(
                  getTtsDescriptionText(), getParentForChildren(), isClean());
          ttsDescriptionText_ = null;
        }
        return ttsDescriptionTextBuilder_;
      }

      private com.google.transit.realtime.GtfsRealtime.Alert.SeverityLevel severityLevel_ =
          com.google.transit.realtime.GtfsRealtime.Alert.SeverityLevel.UNKNOWN_SEVERITY;

      /**
       * <code>optional .transit_realtime.Alert.SeverityLevel severity_level = 14 [default = UNKNOWN_SEVERITY];</code>
       */
      @Override
      public boolean hasSeverityLevel() {
        return ((bitField0_ & 0x00000200) == 0x00000200);
      }

      /**
       * <code>optional .transit_realtime.Alert.SeverityLevel severity_level = 14 [default = UNKNOWN_SEVERITY];</code>
       */
      @Override
      public com.google.transit.realtime.GtfsRealtime.Alert.SeverityLevel getSeverityLevel() {
        return severityLevel_;
      }

      /**
       * <code>optional .transit_realtime.Alert.SeverityLevel severity_level = 14 [default = UNKNOWN_SEVERITY];</code>
       */
      public Builder setSeverityLevel(
          com.google.transit.realtime.GtfsRealtime.Alert.SeverityLevel value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000200;
        severityLevel_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>optional .transit_realtime.Alert.SeverityLevel severity_level = 14 [default = UNKNOWN_SEVERITY];</code>
       */
      public Builder clearSeverityLevel() {
        bitField0_ = (bitField0_ & ~0x00000200);
        severityLevel_ =
            com.google.transit.realtime.GtfsRealtime.Alert.SeverityLevel.UNKNOWN_SEVERITY;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:transit_realtime.Alert)
    }

    static {
      defaultInstance = new Alert(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:transit_realtime.Alert)
  }

  public interface TimeRangeOrBuilder extends
      // @@protoc_insertion_point(interface_extends:transit_realtime.TimeRange)
      com.google.protobuf.GeneratedMessage.ExtendableMessageOrBuilder<TimeRange> {

    /**
     * <code>optional uint64 start = 1;</code>
     *
     * <pre>
     * Start time, in POSIX time (i.e., number of seconds since January 1st 1970
     * 00:00:00 UTC).
     * If missing, the interval starts at minus infinity.
     * </pre>
     */
    boolean hasStart();

    /**
     * <code>optional uint64 start = 1;</code>
     *
     * <pre>
     * Start time, in POSIX time (i.e., number of seconds since January 1st 1970
     * 00:00:00 UTC).
     * If missing, the interval starts at minus infinity.
     * </pre>
     */
    long getStart();

    /**
     * <code>optional uint64 end = 2;</code>
     *
     * <pre>
     * End time, in POSIX time (i.e., number of seconds since January 1st 1970
     * 00:00:00 UTC).
     * If missing, the interval ends at plus infinity.
     * </pre>
     */
    boolean hasEnd();

    /**
     * <code>optional uint64 end = 2;</code>
     *
     * <pre>
     * End time, in POSIX time (i.e., number of seconds since January 1st 1970
     * 00:00:00 UTC).
     * If missing, the interval ends at plus infinity.
     * </pre>
     */
    long getEnd();
  }
  /**
   * Protobuf type {@code transit_realtime.TimeRange}
   *
   * <pre>
   * A time interval. The interval is considered active at time 't' if 't' is
   * greater than or equal to the start time and less than the end time.
   * </pre>
   */
  public static final class TimeRange
      extends com.google.protobuf.GeneratedMessage.ExtendableMessage<TimeRange> implements
      // @@protoc_insertion_point(message_implements:transit_realtime.TimeRange)
      TimeRangeOrBuilder {
    // Use TimeRange.newBuilder() to construct.
    private TimeRange(
        com.google.protobuf.GeneratedMessage.ExtendableBuilder<com.google.transit.realtime.GtfsRealtime.TimeRange, ?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }

    private TimeRange(boolean noInit) {
      this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }

    private static final TimeRange defaultInstance;

    public static TimeRange getDefaultInstance() {
      return defaultInstance;
    }

    @Override
    public TimeRange getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private TimeRange(com.google.protobuf.CodedInputStream input,
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
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              start_ = input.readUInt64();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              end_ = input.readUInt64();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e.getMessage())
            .setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_TimeRange_descriptor;
    }

    @Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
      return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_TimeRange_fieldAccessorTable
          .ensureFieldAccessorsInitialized(com.google.transit.realtime.GtfsRealtime.TimeRange.class,
              com.google.transit.realtime.GtfsRealtime.TimeRange.Builder.class);
    }

    public static com.google.protobuf.Parser<TimeRange> PARSER =
        new com.google.protobuf.AbstractParser<TimeRange>() {
          @Override
          public TimeRange parsePartialFrom(com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new TimeRange(input, extensionRegistry);
          }
        };

    @java.lang.Override
    public com.google.protobuf.Parser<TimeRange> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int START_FIELD_NUMBER = 1;
    private long start_;

    /**
     * <code>optional uint64 start = 1;</code>
     *
     * <pre>
     * Start time, in POSIX time (i.e., number of seconds since January 1st 1970
     * 00:00:00 UTC).
     * If missing, the interval starts at minus infinity.
     * </pre>
     */
    @Override
    public boolean hasStart() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }

    /**
     * <code>optional uint64 start = 1;</code>
     *
     * <pre>
     * Start time, in POSIX time (i.e., number of seconds since January 1st 1970
     * 00:00:00 UTC).
     * If missing, the interval starts at minus infinity.
     * </pre>
     */
    @Override
    public long getStart() {
      return start_;
    }

    public static final int END_FIELD_NUMBER = 2;
    private long end_;

    /**
     * <code>optional uint64 end = 2;</code>
     *
     * <pre>
     * End time, in POSIX time (i.e., number of seconds since January 1st 1970
     * 00:00:00 UTC).
     * If missing, the interval ends at plus infinity.
     * </pre>
     */
    @Override
    public boolean hasEnd() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }

    /**
     * <code>optional uint64 end = 2;</code>
     *
     * <pre>
     * End time, in POSIX time (i.e., number of seconds since January 1st 1970
     * 00:00:00 UTC).
     * If missing, the interval ends at plus infinity.
     * </pre>
     */
    @Override
    public long getEnd() {
      return end_;
    }

    private void initFields() {
      start_ = 0L;
      end_ = 0L;
    }

    private byte memoizedIsInitialized = -1;

    @Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1)
        return true;
      if (isInitialized == 0)
        return false;

      if (!extensionsAreInitialized()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    @Override
    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      getSerializedSize();
      com.google.protobuf.GeneratedMessage.ExtendableMessage<com.google.transit.realtime.GtfsRealtime.TimeRange>.ExtensionWriter extensionWriter =
          newExtensionWriter();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeUInt64(1, start_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeUInt64(2, end_);
      }
      extensionWriter.writeUntil(2000, output);
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;

    @Override
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1)
        return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream.computeUInt64Size(1, start_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream.computeUInt64Size(2, end_);
      }
      size += extensionsSerializedSize();
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;

    @java.lang.Override
    protected java.lang.Object writeReplace() throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static com.google.transit.realtime.GtfsRealtime.TimeRange parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.google.transit.realtime.GtfsRealtime.TimeRange parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.google.transit.realtime.GtfsRealtime.TimeRange parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.google.transit.realtime.GtfsRealtime.TimeRange parseFrom(byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.google.transit.realtime.GtfsRealtime.TimeRange parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return PARSER.parseFrom(input);
    }

    public static com.google.transit.realtime.GtfsRealtime.TimeRange parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static com.google.transit.realtime.GtfsRealtime.TimeRange parseDelimitedFrom(
        java.io.InputStream input) throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }

    public static com.google.transit.realtime.GtfsRealtime.TimeRange parseDelimitedFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }

    public static com.google.transit.realtime.GtfsRealtime.TimeRange parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return PARSER.parseFrom(input);
    }

    public static com.google.transit.realtime.GtfsRealtime.TimeRange parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return Builder.create();
    }

    @Override
    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder(com.google.transit.realtime.GtfsRealtime.TimeRange prototype) {
      return newBuilder().mergeFrom(prototype);
    }

    @Override
    public Builder toBuilder() {
      return newBuilder(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }

    /**
     * Protobuf type {@code transit_realtime.TimeRange}
     *
     * <pre>
     * A time interval. The interval is considered active at time 't' if 't' is
     * greater than or equal to the start time and less than the end time.
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.ExtendableBuilder<com.google.transit.realtime.GtfsRealtime.TimeRange, Builder>
        implements
        // @@protoc_insertion_point(builder_implements:transit_realtime.TimeRange)
        com.google.transit.realtime.GtfsRealtime.TimeRangeOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_TimeRange_descriptor;
      }

      @Override
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
        return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_TimeRange_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.google.transit.realtime.GtfsRealtime.TimeRange.class,
                com.google.transit.realtime.GtfsRealtime.TimeRange.Builder.class);
      }

      // Construct using com.google.transit.realtime.GtfsRealtime.TimeRange.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessage.BuilderParent parent) {
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

      @Override
      public Builder clear() {
        super.clear();
        start_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000001);
        end_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @Override
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_TimeRange_descriptor;
      }

      @Override
      public com.google.transit.realtime.GtfsRealtime.TimeRange getDefaultInstanceForType() {
        return com.google.transit.realtime.GtfsRealtime.TimeRange.getDefaultInstance();
      }

      @Override
      public com.google.transit.realtime.GtfsRealtime.TimeRange build() {
        com.google.transit.realtime.GtfsRealtime.TimeRange result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public com.google.transit.realtime.GtfsRealtime.TimeRange buildPartial() {
        com.google.transit.realtime.GtfsRealtime.TimeRange result =
            new com.google.transit.realtime.GtfsRealtime.TimeRange(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.start_ = start_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.end_ = end_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.google.transit.realtime.GtfsRealtime.TimeRange) {
          return mergeFrom((com.google.transit.realtime.GtfsRealtime.TimeRange) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.google.transit.realtime.GtfsRealtime.TimeRange other) {
        if (other == com.google.transit.realtime.GtfsRealtime.TimeRange.getDefaultInstance())
          return this;
        if (other.hasStart()) {
          setStart(other.getStart());
        }
        if (other.hasEnd()) {
          setEnd(other.getEnd());
        }
        this.mergeExtensionFields(other);
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      @Override
      public final boolean isInitialized() {
        if (!extensionsAreInitialized()) {

          return false;
        }
        return true;
      }

      @Override
      public Builder mergeFrom(com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        com.google.transit.realtime.GtfsRealtime.TimeRange parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (com.google.transit.realtime.GtfsRealtime.TimeRange) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private long start_;

      /**
       * <code>optional uint64 start = 1;</code>
       *
       * <pre>
       * Start time, in POSIX time (i.e., number of seconds since January 1st 1970
       * 00:00:00 UTC).
       * If missing, the interval starts at minus infinity.
       * </pre>
       */
      @Override
      public boolean hasStart() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }

      /**
       * <code>optional uint64 start = 1;</code>
       *
       * <pre>
       * Start time, in POSIX time (i.e., number of seconds since January 1st 1970
       * 00:00:00 UTC).
       * If missing, the interval starts at minus infinity.
       * </pre>
       */
      @Override
      public long getStart() {
        return start_;
      }

      /**
       * <code>optional uint64 start = 1;</code>
       *
       * <pre>
       * Start time, in POSIX time (i.e., number of seconds since January 1st 1970
       * 00:00:00 UTC).
       * If missing, the interval starts at minus infinity.
       * </pre>
       */
      public Builder setStart(long value) {
        bitField0_ |= 0x00000001;
        start_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>optional uint64 start = 1;</code>
       *
       * <pre>
       * Start time, in POSIX time (i.e., number of seconds since January 1st 1970
       * 00:00:00 UTC).
       * If missing, the interval starts at minus infinity.
       * </pre>
       */
      public Builder clearStart() {
        bitField0_ = (bitField0_ & ~0x00000001);
        start_ = 0L;
        onChanged();
        return this;
      }

      private long end_;

      /**
       * <code>optional uint64 end = 2;</code>
       *
       * <pre>
       * End time, in POSIX time (i.e., number of seconds since January 1st 1970
       * 00:00:00 UTC).
       * If missing, the interval ends at plus infinity.
       * </pre>
       */
      @Override
      public boolean hasEnd() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }

      /**
       * <code>optional uint64 end = 2;</code>
       *
       * <pre>
       * End time, in POSIX time (i.e., number of seconds since January 1st 1970
       * 00:00:00 UTC).
       * If missing, the interval ends at plus infinity.
       * </pre>
       */
      @Override
      public long getEnd() {
        return end_;
      }

      /**
       * <code>optional uint64 end = 2;</code>
       *
       * <pre>
       * End time, in POSIX time (i.e., number of seconds since January 1st 1970
       * 00:00:00 UTC).
       * If missing, the interval ends at plus infinity.
       * </pre>
       */
      public Builder setEnd(long value) {
        bitField0_ |= 0x00000002;
        end_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>optional uint64 end = 2;</code>
       *
       * <pre>
       * End time, in POSIX time (i.e., number of seconds since January 1st 1970
       * 00:00:00 UTC).
       * If missing, the interval ends at plus infinity.
       * </pre>
       */
      public Builder clearEnd() {
        bitField0_ = (bitField0_ & ~0x00000002);
        end_ = 0L;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:transit_realtime.TimeRange)
    }

    static {
      defaultInstance = new TimeRange(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:transit_realtime.TimeRange)
  }

  public interface PositionOrBuilder extends
      // @@protoc_insertion_point(interface_extends:transit_realtime.Position)
      com.google.protobuf.GeneratedMessage.ExtendableMessageOrBuilder<Position> {

    /**
     * <code>required float latitude = 1;</code>
     *
     * <pre>
     * Degrees North, in the WGS-84 coordinate system.
     * </pre>
     */
    boolean hasLatitude();

    /**
     * <code>required float latitude = 1;</code>
     *
     * <pre>
     * Degrees North, in the WGS-84 coordinate system.
     * </pre>
     */
    float getLatitude();

    /**
     * <code>required float longitude = 2;</code>
     *
     * <pre>
     * Degrees East, in the WGS-84 coordinate system.
     * </pre>
     */
    boolean hasLongitude();

    /**
     * <code>required float longitude = 2;</code>
     *
     * <pre>
     * Degrees East, in the WGS-84 coordinate system.
     * </pre>
     */
    float getLongitude();

    /**
     * <code>optional float bearing = 3;</code>
     *
     * <pre>
     * Bearing, in degrees, clockwise from North, i.e., 0 is North and 90 is East.
     * This can be the compass bearing, or the direction towards the next stop
     * or intermediate location.
     * This should not be direction deduced from the sequence of previous
     * positions, which can be computed from previous data.
     * </pre>
     */
    boolean hasBearing();

    /**
     * <code>optional float bearing = 3;</code>
     *
     * <pre>
     * Bearing, in degrees, clockwise from North, i.e., 0 is North and 90 is East.
     * This can be the compass bearing, or the direction towards the next stop
     * or intermediate location.
     * This should not be direction deduced from the sequence of previous
     * positions, which can be computed from previous data.
     * </pre>
     */
    float getBearing();

    /**
     * <code>optional double odometer = 4;</code>
     *
     * <pre>
     * Odometer value, in meters.
     * </pre>
     */
    boolean hasOdometer();

    /**
     * <code>optional double odometer = 4;</code>
     *
     * <pre>
     * Odometer value, in meters.
     * </pre>
     */
    double getOdometer();

    /**
     * <code>optional float speed = 5;</code>
     *
     * <pre>
     * Momentary speed measured by the vehicle, in meters per second.
     * </pre>
     */
    boolean hasSpeed();

    /**
     * <code>optional float speed = 5;</code>
     *
     * <pre>
     * Momentary speed measured by the vehicle, in meters per second.
     * </pre>
     */
    float getSpeed();
  }
  /**
   * Protobuf type {@code transit_realtime.Position}
   *
   * <pre>
   * A position.
   * </pre>
   */
  public static final class Position
      extends com.google.protobuf.GeneratedMessage.ExtendableMessage<Position> implements
      // @@protoc_insertion_point(message_implements:transit_realtime.Position)
      PositionOrBuilder {
    // Use Position.newBuilder() to construct.
    private Position(
        com.google.protobuf.GeneratedMessage.ExtendableBuilder<com.google.transit.realtime.GtfsRealtime.Position, ?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }

    private Position(boolean noInit) {
      this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }

    private static final Position defaultInstance;

    public static Position getDefaultInstance() {
      return defaultInstance;
    }

    @Override
    public Position getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private Position(com.google.protobuf.CodedInputStream input,
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
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 13: {
              bitField0_ |= 0x00000001;
              latitude_ = input.readFloat();
              break;
            }
            case 21: {
              bitField0_ |= 0x00000002;
              longitude_ = input.readFloat();
              break;
            }
            case 29: {
              bitField0_ |= 0x00000004;
              bearing_ = input.readFloat();
              break;
            }
            case 33: {
              bitField0_ |= 0x00000008;
              odometer_ = input.readDouble();
              break;
            }
            case 45: {
              bitField0_ |= 0x00000010;
              speed_ = input.readFloat();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e.getMessage())
            .setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_Position_descriptor;
    }

    @Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
      return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_Position_fieldAccessorTable
          .ensureFieldAccessorsInitialized(com.google.transit.realtime.GtfsRealtime.Position.class,
              com.google.transit.realtime.GtfsRealtime.Position.Builder.class);
    }

    public static com.google.protobuf.Parser<Position> PARSER =
        new com.google.protobuf.AbstractParser<Position>() {
          @Override
          public Position parsePartialFrom(com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new Position(input, extensionRegistry);
          }
        };

    @java.lang.Override
    public com.google.protobuf.Parser<Position> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int LATITUDE_FIELD_NUMBER = 1;
    private float latitude_;

    /**
     * <code>required float latitude = 1;</code>
     *
     * <pre>
     * Degrees North, in the WGS-84 coordinate system.
     * </pre>
     */
    @Override
    public boolean hasLatitude() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }

    /**
     * <code>required float latitude = 1;</code>
     *
     * <pre>
     * Degrees North, in the WGS-84 coordinate system.
     * </pre>
     */
    @Override
    public float getLatitude() {
      return latitude_;
    }

    public static final int LONGITUDE_FIELD_NUMBER = 2;
    private float longitude_;

    /**
     * <code>required float longitude = 2;</code>
     *
     * <pre>
     * Degrees East, in the WGS-84 coordinate system.
     * </pre>
     */
    @Override
    public boolean hasLongitude() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }

    /**
     * <code>required float longitude = 2;</code>
     *
     * <pre>
     * Degrees East, in the WGS-84 coordinate system.
     * </pre>
     */
    @Override
    public float getLongitude() {
      return longitude_;
    }

    public static final int BEARING_FIELD_NUMBER = 3;
    private float bearing_;

    /**
     * <code>optional float bearing = 3;</code>
     *
     * <pre>
     * Bearing, in degrees, clockwise from North, i.e., 0 is North and 90 is East.
     * This can be the compass bearing, or the direction towards the next stop
     * or intermediate location.
     * This should not be direction deduced from the sequence of previous
     * positions, which can be computed from previous data.
     * </pre>
     */
    @Override
    public boolean hasBearing() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }

    /**
     * <code>optional float bearing = 3;</code>
     *
     * <pre>
     * Bearing, in degrees, clockwise from North, i.e., 0 is North and 90 is East.
     * This can be the compass bearing, or the direction towards the next stop
     * or intermediate location.
     * This should not be direction deduced from the sequence of previous
     * positions, which can be computed from previous data.
     * </pre>
     */
    @Override
    public float getBearing() {
      return bearing_;
    }

    public static final int ODOMETER_FIELD_NUMBER = 4;
    private double odometer_;

    /**
     * <code>optional double odometer = 4;</code>
     *
     * <pre>
     * Odometer value, in meters.
     * </pre>
     */
    @Override
    public boolean hasOdometer() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }

    /**
     * <code>optional double odometer = 4;</code>
     *
     * <pre>
     * Odometer value, in meters.
     * </pre>
     */
    @Override
    public double getOdometer() {
      return odometer_;
    }

    public static final int SPEED_FIELD_NUMBER = 5;
    private float speed_;

    /**
     * <code>optional float speed = 5;</code>
     *
     * <pre>
     * Momentary speed measured by the vehicle, in meters per second.
     * </pre>
     */
    @Override
    public boolean hasSpeed() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }

    /**
     * <code>optional float speed = 5;</code>
     *
     * <pre>
     * Momentary speed measured by the vehicle, in meters per second.
     * </pre>
     */
    @Override
    public float getSpeed() {
      return speed_;
    }

    private void initFields() {
      latitude_ = 0F;
      longitude_ = 0F;
      bearing_ = 0F;
      odometer_ = 0D;
      speed_ = 0F;
    }

    private byte memoizedIsInitialized = -1;

    @Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1)
        return true;
      if (isInitialized == 0)
        return false;

      if (!hasLatitude()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasLongitude()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!extensionsAreInitialized()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    @Override
    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      getSerializedSize();
      com.google.protobuf.GeneratedMessage.ExtendableMessage<com.google.transit.realtime.GtfsRealtime.Position>.ExtensionWriter extensionWriter =
          newExtensionWriter();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeFloat(1, latitude_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeFloat(2, longitude_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeFloat(3, bearing_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeDouble(4, odometer_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeFloat(5, speed_);
      }
      extensionWriter.writeUntil(2000, output);
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;

    @Override
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1)
        return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream.computeFloatSize(1, latitude_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream.computeFloatSize(2, longitude_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream.computeFloatSize(3, bearing_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream.computeDoubleSize(4, odometer_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream.computeFloatSize(5, speed_);
      }
      size += extensionsSerializedSize();
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;

    @java.lang.Override
    protected java.lang.Object writeReplace() throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static com.google.transit.realtime.GtfsRealtime.Position parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.google.transit.realtime.GtfsRealtime.Position parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.google.transit.realtime.GtfsRealtime.Position parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.google.transit.realtime.GtfsRealtime.Position parseFrom(byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.google.transit.realtime.GtfsRealtime.Position parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return PARSER.parseFrom(input);
    }

    public static com.google.transit.realtime.GtfsRealtime.Position parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static com.google.transit.realtime.GtfsRealtime.Position parseDelimitedFrom(
        java.io.InputStream input) throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }

    public static com.google.transit.realtime.GtfsRealtime.Position parseDelimitedFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }

    public static com.google.transit.realtime.GtfsRealtime.Position parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return PARSER.parseFrom(input);
    }

    public static com.google.transit.realtime.GtfsRealtime.Position parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return Builder.create();
    }

    @Override
    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder(com.google.transit.realtime.GtfsRealtime.Position prototype) {
      return newBuilder().mergeFrom(prototype);
    }

    @Override
    public Builder toBuilder() {
      return newBuilder(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }

    /**
     * Protobuf type {@code transit_realtime.Position}
     *
     * <pre>
     * A position.
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.ExtendableBuilder<com.google.transit.realtime.GtfsRealtime.Position, Builder>
        implements
        // @@protoc_insertion_point(builder_implements:transit_realtime.Position)
        com.google.transit.realtime.GtfsRealtime.PositionOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_Position_descriptor;
      }

      @Override
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
        return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_Position_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.google.transit.realtime.GtfsRealtime.Position.class,
                com.google.transit.realtime.GtfsRealtime.Position.Builder.class);
      }

      // Construct using com.google.transit.realtime.GtfsRealtime.Position.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessage.BuilderParent parent) {
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

      @Override
      public Builder clear() {
        super.clear();
        latitude_ = 0F;
        bitField0_ = (bitField0_ & ~0x00000001);
        longitude_ = 0F;
        bitField0_ = (bitField0_ & ~0x00000002);
        bearing_ = 0F;
        bitField0_ = (bitField0_ & ~0x00000004);
        odometer_ = 0D;
        bitField0_ = (bitField0_ & ~0x00000008);
        speed_ = 0F;
        bitField0_ = (bitField0_ & ~0x00000010);
        return this;
      }

      @Override
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_Position_descriptor;
      }

      @Override
      public com.google.transit.realtime.GtfsRealtime.Position getDefaultInstanceForType() {
        return com.google.transit.realtime.GtfsRealtime.Position.getDefaultInstance();
      }

      @Override
      public com.google.transit.realtime.GtfsRealtime.Position build() {
        com.google.transit.realtime.GtfsRealtime.Position result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public com.google.transit.realtime.GtfsRealtime.Position buildPartial() {
        com.google.transit.realtime.GtfsRealtime.Position result =
            new com.google.transit.realtime.GtfsRealtime.Position(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.latitude_ = latitude_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.longitude_ = longitude_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.bearing_ = bearing_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.odometer_ = odometer_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.speed_ = speed_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.google.transit.realtime.GtfsRealtime.Position) {
          return mergeFrom((com.google.transit.realtime.GtfsRealtime.Position) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.google.transit.realtime.GtfsRealtime.Position other) {
        if (other == com.google.transit.realtime.GtfsRealtime.Position.getDefaultInstance())
          return this;
        if (other.hasLatitude()) {
          setLatitude(other.getLatitude());
        }
        if (other.hasLongitude()) {
          setLongitude(other.getLongitude());
        }
        if (other.hasBearing()) {
          setBearing(other.getBearing());
        }
        if (other.hasOdometer()) {
          setOdometer(other.getOdometer());
        }
        if (other.hasSpeed()) {
          setSpeed(other.getSpeed());
        }
        this.mergeExtensionFields(other);
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      @Override
      public final boolean isInitialized() {
        if (!hasLatitude()) {

          return false;
        }
        if (!hasLongitude()) {

          return false;
        }
        if (!extensionsAreInitialized()) {

          return false;
        }
        return true;
      }

      @Override
      public Builder mergeFrom(com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        com.google.transit.realtime.GtfsRealtime.Position parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (com.google.transit.realtime.GtfsRealtime.Position) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private float latitude_;

      /**
       * <code>required float latitude = 1;</code>
       *
       * <pre>
       * Degrees North, in the WGS-84 coordinate system.
       * </pre>
       */
      @Override
      public boolean hasLatitude() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }

      /**
       * <code>required float latitude = 1;</code>
       *
       * <pre>
       * Degrees North, in the WGS-84 coordinate system.
       * </pre>
       */
      @Override
      public float getLatitude() {
        return latitude_;
      }

      /**
       * <code>required float latitude = 1;</code>
       *
       * <pre>
       * Degrees North, in the WGS-84 coordinate system.
       * </pre>
       */
      public Builder setLatitude(float value) {
        bitField0_ |= 0x00000001;
        latitude_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>required float latitude = 1;</code>
       *
       * <pre>
       * Degrees North, in the WGS-84 coordinate system.
       * </pre>
       */
      public Builder clearLatitude() {
        bitField0_ = (bitField0_ & ~0x00000001);
        latitude_ = 0F;
        onChanged();
        return this;
      }

      private float longitude_;

      /**
       * <code>required float longitude = 2;</code>
       *
       * <pre>
       * Degrees East, in the WGS-84 coordinate system.
       * </pre>
       */
      @Override
      public boolean hasLongitude() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }

      /**
       * <code>required float longitude = 2;</code>
       *
       * <pre>
       * Degrees East, in the WGS-84 coordinate system.
       * </pre>
       */
      @Override
      public float getLongitude() {
        return longitude_;
      }

      /**
       * <code>required float longitude = 2;</code>
       *
       * <pre>
       * Degrees East, in the WGS-84 coordinate system.
       * </pre>
       */
      public Builder setLongitude(float value) {
        bitField0_ |= 0x00000002;
        longitude_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>required float longitude = 2;</code>
       *
       * <pre>
       * Degrees East, in the WGS-84 coordinate system.
       * </pre>
       */
      public Builder clearLongitude() {
        bitField0_ = (bitField0_ & ~0x00000002);
        longitude_ = 0F;
        onChanged();
        return this;
      }

      private float bearing_;

      /**
       * <code>optional float bearing = 3;</code>
       *
       * <pre>
       * Bearing, in degrees, clockwise from North, i.e., 0 is North and 90 is East.
       * This can be the compass bearing, or the direction towards the next stop
       * or intermediate location.
       * This should not be direction deduced from the sequence of previous
       * positions, which can be computed from previous data.
       * </pre>
       */
      @Override
      public boolean hasBearing() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }

      /**
       * <code>optional float bearing = 3;</code>
       *
       * <pre>
       * Bearing, in degrees, clockwise from North, i.e., 0 is North and 90 is East.
       * This can be the compass bearing, or the direction towards the next stop
       * or intermediate location.
       * This should not be direction deduced from the sequence of previous
       * positions, which can be computed from previous data.
       * </pre>
       */
      @Override
      public float getBearing() {
        return bearing_;
      }

      /**
       * <code>optional float bearing = 3;</code>
       *
       * <pre>
       * Bearing, in degrees, clockwise from North, i.e., 0 is North and 90 is East.
       * This can be the compass bearing, or the direction towards the next stop
       * or intermediate location.
       * This should not be direction deduced from the sequence of previous
       * positions, which can be computed from previous data.
       * </pre>
       */
      public Builder setBearing(float value) {
        bitField0_ |= 0x00000004;
        bearing_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>optional float bearing = 3;</code>
       *
       * <pre>
       * Bearing, in degrees, clockwise from North, i.e., 0 is North and 90 is East.
       * This can be the compass bearing, or the direction towards the next stop
       * or intermediate location.
       * This should not be direction deduced from the sequence of previous
       * positions, which can be computed from previous data.
       * </pre>
       */
      public Builder clearBearing() {
        bitField0_ = (bitField0_ & ~0x00000004);
        bearing_ = 0F;
        onChanged();
        return this;
      }

      private double odometer_;

      /**
       * <code>optional double odometer = 4;</code>
       *
       * <pre>
       * Odometer value, in meters.
       * </pre>
       */
      @Override
      public boolean hasOdometer() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }

      /**
       * <code>optional double odometer = 4;</code>
       *
       * <pre>
       * Odometer value, in meters.
       * </pre>
       */
      @Override
      public double getOdometer() {
        return odometer_;
      }

      /**
       * <code>optional double odometer = 4;</code>
       *
       * <pre>
       * Odometer value, in meters.
       * </pre>
       */
      public Builder setOdometer(double value) {
        bitField0_ |= 0x00000008;
        odometer_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>optional double odometer = 4;</code>
       *
       * <pre>
       * Odometer value, in meters.
       * </pre>
       */
      public Builder clearOdometer() {
        bitField0_ = (bitField0_ & ~0x00000008);
        odometer_ = 0D;
        onChanged();
        return this;
      }

      private float speed_;

      /**
       * <code>optional float speed = 5;</code>
       *
       * <pre>
       * Momentary speed measured by the vehicle, in meters per second.
       * </pre>
       */
      @Override
      public boolean hasSpeed() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }

      /**
       * <code>optional float speed = 5;</code>
       *
       * <pre>
       * Momentary speed measured by the vehicle, in meters per second.
       * </pre>
       */
      @Override
      public float getSpeed() {
        return speed_;
      }

      /**
       * <code>optional float speed = 5;</code>
       *
       * <pre>
       * Momentary speed measured by the vehicle, in meters per second.
       * </pre>
       */
      public Builder setSpeed(float value) {
        bitField0_ |= 0x00000010;
        speed_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>optional float speed = 5;</code>
       *
       * <pre>
       * Momentary speed measured by the vehicle, in meters per second.
       * </pre>
       */
      public Builder clearSpeed() {
        bitField0_ = (bitField0_ & ~0x00000010);
        speed_ = 0F;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:transit_realtime.Position)
    }

    static {
      defaultInstance = new Position(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:transit_realtime.Position)
  }

  public interface TripDescriptorOrBuilder extends
      // @@protoc_insertion_point(interface_extends:transit_realtime.TripDescriptor)
      com.google.protobuf.GeneratedMessage.ExtendableMessageOrBuilder<TripDescriptor> {

    /**
     * <code>optional string trip_id = 1;</code>
     *
     * <pre>
     * The trip_id from the GTFS feed that this selector refers to.
     * For non frequency-based trips, this field is enough to uniquely identify
     * the trip. For frequency-based trip, start_time and start_date might also be
     * necessary.
     * </pre>
     */
    boolean hasTripId();

    /**
     * <code>optional string trip_id = 1;</code>
     *
     * <pre>
     * The trip_id from the GTFS feed that this selector refers to.
     * For non frequency-based trips, this field is enough to uniquely identify
     * the trip. For frequency-based trip, start_time and start_date might also be
     * necessary.
     * </pre>
     */
    java.lang.String getTripId();

    /**
     * <code>optional string trip_id = 1;</code>
     *
     * <pre>
     * The trip_id from the GTFS feed that this selector refers to.
     * For non frequency-based trips, this field is enough to uniquely identify
     * the trip. For frequency-based trip, start_time and start_date might also be
     * necessary.
     * </pre>
     */
    com.google.protobuf.ByteString getTripIdBytes();

    /**
     * <code>optional string route_id = 5;</code>
     *
     * <pre>
     * The route_id from the GTFS that this selector refers to.
     * </pre>
     */
    boolean hasRouteId();

    /**
     * <code>optional string route_id = 5;</code>
     *
     * <pre>
     * The route_id from the GTFS that this selector refers to.
     * </pre>
     */
    java.lang.String getRouteId();

    /**
     * <code>optional string route_id = 5;</code>
     *
     * <pre>
     * The route_id from the GTFS that this selector refers to.
     * </pre>
     */
    com.google.protobuf.ByteString getRouteIdBytes();

    /**
     * <code>optional uint32 direction_id = 6;</code>
     *
     * <pre>
     * The direction_id from the GTFS feed trips.txt file, indicating the
     * direction of travel for trips this selector refers to. This field is
     * still experimental, and subject to change. It may be formally adopted in
     * the future.
     * </pre>
     */
    boolean hasDirectionId();

    /**
     * <code>optional uint32 direction_id = 6;</code>
     *
     * <pre>
     * The direction_id from the GTFS feed trips.txt file, indicating the
     * direction of travel for trips this selector refers to. This field is
     * still experimental, and subject to change. It may be formally adopted in
     * the future.
     * </pre>
     */
    int getDirectionId();

    /**
     * <code>optional string start_time = 2;</code>
     *
     * <pre>
     * The initially scheduled start time of this trip instance.
     * When the trip_id corresponds to a non-frequency-based trip, this field
     * should either be omitted or be equal to the value in the GTFS feed. When
     * the trip_id correponds to a frequency-based trip, the start_time must be
     * specified for trip updates and vehicle positions. If the trip corresponds
     * to exact_times=1 GTFS record, then start_time must be some multiple
     * (including zero) of headway_secs later than frequencies.txt start_time for
     * the corresponding time period. If the trip corresponds to exact_times=0,
     * then its start_time may be arbitrary, and is initially expected to be the
     * first departure of the trip. Once established, the start_time of this
     * frequency-based trip should be considered immutable, even if the first
     * departure time changes -- that time change may instead be reflected in a
     * StopTimeUpdate.
     * Format and semantics of the field is same as that of
     * GTFS/frequencies.txt/start_time, e.g., 11:15:35 or 25:15:35.
     * </pre>
     */
    boolean hasStartTime();

    /**
     * <code>optional string start_time = 2;</code>
     *
     * <pre>
     * The initially scheduled start time of this trip instance.
     * When the trip_id corresponds to a non-frequency-based trip, this field
     * should either be omitted or be equal to the value in the GTFS feed. When
     * the trip_id correponds to a frequency-based trip, the start_time must be
     * specified for trip updates and vehicle positions. If the trip corresponds
     * to exact_times=1 GTFS record, then start_time must be some multiple
     * (including zero) of headway_secs later than frequencies.txt start_time for
     * the corresponding time period. If the trip corresponds to exact_times=0,
     * then its start_time may be arbitrary, and is initially expected to be the
     * first departure of the trip. Once established, the start_time of this
     * frequency-based trip should be considered immutable, even if the first
     * departure time changes -- that time change may instead be reflected in a
     * StopTimeUpdate.
     * Format and semantics of the field is same as that of
     * GTFS/frequencies.txt/start_time, e.g., 11:15:35 or 25:15:35.
     * </pre>
     */
    java.lang.String getStartTime();

    /**
     * <code>optional string start_time = 2;</code>
     *
     * <pre>
     * The initially scheduled start time of this trip instance.
     * When the trip_id corresponds to a non-frequency-based trip, this field
     * should either be omitted or be equal to the value in the GTFS feed. When
     * the trip_id correponds to a frequency-based trip, the start_time must be
     * specified for trip updates and vehicle positions. If the trip corresponds
     * to exact_times=1 GTFS record, then start_time must be some multiple
     * (including zero) of headway_secs later than frequencies.txt start_time for
     * the corresponding time period. If the trip corresponds to exact_times=0,
     * then its start_time may be arbitrary, and is initially expected to be the
     * first departure of the trip. Once established, the start_time of this
     * frequency-based trip should be considered immutable, even if the first
     * departure time changes -- that time change may instead be reflected in a
     * StopTimeUpdate.
     * Format and semantics of the field is same as that of
     * GTFS/frequencies.txt/start_time, e.g., 11:15:35 or 25:15:35.
     * </pre>
     */
    com.google.protobuf.ByteString getStartTimeBytes();

    /**
     * <code>optional string start_date = 3;</code>
     *
     * <pre>
     * The scheduled start date of this trip instance.
     * Must be provided to disambiguate trips that are so late as to collide with
     * a scheduled trip on a next day. For example, for a train that departs 8:00
     * and 20:00 every day, and is 12 hours late, there would be two distinct
     * trips on the same time.
     * This field can be provided but is not mandatory for schedules in which such
     * collisions are impossible - for example, a service running on hourly
     * schedule where a vehicle that is one hour late is not considered to be
     * related to schedule anymore.
     * In YYYYMMDD format.
     * </pre>
     */
    boolean hasStartDate();

    /**
     * <code>optional string start_date = 3;</code>
     *
     * <pre>
     * The scheduled start date of this trip instance.
     * Must be provided to disambiguate trips that are so late as to collide with
     * a scheduled trip on a next day. For example, for a train that departs 8:00
     * and 20:00 every day, and is 12 hours late, there would be two distinct
     * trips on the same time.
     * This field can be provided but is not mandatory for schedules in which such
     * collisions are impossible - for example, a service running on hourly
     * schedule where a vehicle that is one hour late is not considered to be
     * related to schedule anymore.
     * In YYYYMMDD format.
     * </pre>
     */
    java.lang.String getStartDate();

    /**
     * <code>optional string start_date = 3;</code>
     *
     * <pre>
     * The scheduled start date of this trip instance.
     * Must be provided to disambiguate trips that are so late as to collide with
     * a scheduled trip on a next day. For example, for a train that departs 8:00
     * and 20:00 every day, and is 12 hours late, there would be two distinct
     * trips on the same time.
     * This field can be provided but is not mandatory for schedules in which such
     * collisions are impossible - for example, a service running on hourly
     * schedule where a vehicle that is one hour late is not considered to be
     * related to schedule anymore.
     * In YYYYMMDD format.
     * </pre>
     */
    com.google.protobuf.ByteString getStartDateBytes();

    /**
     * <code>optional .transit_realtime.TripDescriptor.ScheduleRelationship schedule_relationship = 4;</code>
     */
    boolean hasScheduleRelationship();

    /**
     * <code>optional .transit_realtime.TripDescriptor.ScheduleRelationship schedule_relationship = 4;</code>
     */
    com.google.transit.realtime.GtfsRealtime.TripDescriptor.ScheduleRelationship getScheduleRelationship();
  }
  /**
   * Protobuf type {@code transit_realtime.TripDescriptor}
   *
   * <pre>
   * A descriptor that identifies an instance of a GTFS trip, or all instances of
   * a trip along a route.
   * - To specify a single trip instance, the trip_id (and if necessary,
   *   start_time) is set. If route_id is also set, then it should be same as one
   *   that the given trip corresponds to.
   * - To specify all the trips along a given route, only the route_id should be
   *   set. Note that if the trip_id is not known, then stop sequence ids in
   *   TripUpdate are not sufficient, and stop_ids must be provided as well. In
   *   addition, absolute arrival/departure times must be provided.
   * </pre>
   */
  public static final class TripDescriptor
      extends com.google.protobuf.GeneratedMessage.ExtendableMessage<TripDescriptor> implements
      // @@protoc_insertion_point(message_implements:transit_realtime.TripDescriptor)
      TripDescriptorOrBuilder {
    // Use TripDescriptor.newBuilder() to construct.
    private TripDescriptor(
        com.google.protobuf.GeneratedMessage.ExtendableBuilder<com.google.transit.realtime.GtfsRealtime.TripDescriptor, ?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }

    private TripDescriptor(boolean noInit) {
      this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }

    private static final TripDescriptor defaultInstance;

    public static TripDescriptor getDefaultInstance() {
      return defaultInstance;
    }

    @Override
    public TripDescriptor getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private TripDescriptor(com.google.protobuf.CodedInputStream input,
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
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000001;
              tripId_ = bs;
              break;
            }
            case 18: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000008;
              startTime_ = bs;
              break;
            }
            case 26: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000010;
              startDate_ = bs;
              break;
            }
            case 32: {
              int rawValue = input.readEnum();
              com.google.transit.realtime.GtfsRealtime.TripDescriptor.ScheduleRelationship value =
                  com.google.transit.realtime.GtfsRealtime.TripDescriptor.ScheduleRelationship
                      .valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(4, rawValue);
              } else {
                bitField0_ |= 0x00000020;
                scheduleRelationship_ = value;
              }
              break;
            }
            case 42: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000002;
              routeId_ = bs;
              break;
            }
            case 48: {
              bitField0_ |= 0x00000004;
              directionId_ = input.readUInt32();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e.getMessage())
            .setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_TripDescriptor_descriptor;
    }

    @Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
      return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_TripDescriptor_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.transit.realtime.GtfsRealtime.TripDescriptor.class,
              com.google.transit.realtime.GtfsRealtime.TripDescriptor.Builder.class);
    }

    public static com.google.protobuf.Parser<TripDescriptor> PARSER =
        new com.google.protobuf.AbstractParser<TripDescriptor>() {
          @Override
          public TripDescriptor parsePartialFrom(com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new TripDescriptor(input, extensionRegistry);
          }
        };

    @java.lang.Override
    public com.google.protobuf.Parser<TripDescriptor> getParserForType() {
      return PARSER;
    }

    /**
     * Protobuf enum {@code transit_realtime.TripDescriptor.ScheduleRelationship}
     *
     * <pre>
     * The relation between this trip and the static schedule. If a trip is done
     * in accordance with temporary schedule, not reflected in GTFS, then it
     * shouldn't be marked as SCHEDULED, but likely as ADDED.
     * </pre>
     */
    public enum ScheduleRelationship implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>SCHEDULED = 0;</code>
       *
       * <pre>
       * Trip that is running in accordance with its GTFS schedule, or is close
       * enough to the scheduled trip to be associated with it.
       * </pre>
       */
      SCHEDULED(0, 0),
      /**
       * <code>ADDED = 1;</code>
       *
       * <pre>
       * An extra trip that was added in addition to a running schedule, for
       * example, to replace a broken vehicle or to respond to sudden passenger
       * load.
       * </pre>
       */
      ADDED(1, 1),
      /**
       * <code>UNSCHEDULED = 2;</code>
       *
       * <pre>
       * A trip that is running with no schedule associated to it, for example, if
       * there is no schedule at all.
       * </pre>
       */
      UNSCHEDULED(2, 2),
      /**
       * <code>CANCELED = 3;</code>
       *
       * <pre>
       * A trip that existed in the schedule but was removed.
       * </pre>
       */
      CANCELED(3, 3),
      /**
       * <code>MODIFIED = 5;</code>
       *
       * <pre>
       * A trip that existed in the schedule but was removed.
       * </pre>
       */
      MODIFIED(4, 5),;

      /**
       * <code>SCHEDULED = 0;</code>
       *
       * <pre>
       * Trip that is running in accordance with its GTFS schedule, or is close
       * enough to the scheduled trip to be associated with it.
       * </pre>
       */
      public static final int SCHEDULED_VALUE = 0;
      /**
       * <code>ADDED = 1;</code>
       *
       * <pre>
       * An extra trip that was added in addition to a running schedule, for
       * example, to replace a broken vehicle or to respond to sudden passenger
       * load.
       * </pre>
       */
      public static final int ADDED_VALUE = 1;
      /**
       * <code>UNSCHEDULED = 2;</code>
       *
       * <pre>
       * A trip that is running with no schedule associated to it, for example, if
       * there is no schedule at all.
       * </pre>
       */
      public static final int UNSCHEDULED_VALUE = 2;
      /**
       * <code>CANCELED = 3;</code>
       *
       * <pre>
       * A trip that existed in the schedule but was removed.
       * </pre>
       */
      public static final int CANCELED_VALUE = 3;
      /**
       * <code>MODIFIED = 5;</code>
       *
       * <pre>
       * A trip that existed in the schedule but was removed.
       * </pre>
       */
      public static final int MODIFIED_VALUE = 5;


      @Override
      public final int getNumber() {
        return value;
      }

      public static ScheduleRelationship valueOf(int value) {
        switch (value) {
          case 0:
            return SCHEDULED;
          case 1:
            return ADDED;
          case 2:
            return UNSCHEDULED;
          case 3:
            return CANCELED;
          case 5:
            return MODIFIED;
          default:
            return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<ScheduleRelationship> internalGetValueMap() {
        return internalValueMap;
      }

      private static com.google.protobuf.Internal.EnumLiteMap<ScheduleRelationship> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ScheduleRelationship>() {
            @Override
            public ScheduleRelationship findValueByNumber(int number) {
              return ScheduleRelationship.valueOf(number);
            }
          };

      @Override
      public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
        return getDescriptor().getValues().get(index);
      }

      @Override
      public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
        return getDescriptor();
      }

      public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
        return com.google.transit.realtime.GtfsRealtime.TripDescriptor.getDescriptor()
            .getEnumTypes().get(0);
      }

      private static final ScheduleRelationship[] VALUES = values();

      public static ScheduleRelationship valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        return VALUES[desc.getIndex()];
      }

      private final int index;
      private final int value;

      private ScheduleRelationship(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:transit_realtime.TripDescriptor.ScheduleRelationship)
    }

    private int bitField0_;
    public static final int TRIP_ID_FIELD_NUMBER = 1;
    private java.lang.Object tripId_;

    /**
     * <code>optional string trip_id = 1;</code>
     *
     * <pre>
     * The trip_id from the GTFS feed that this selector refers to.
     * For non frequency-based trips, this field is enough to uniquely identify
     * the trip. For frequency-based trip, start_time and start_date might also be
     * necessary.
     * </pre>
     */
    @Override
    public boolean hasTripId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }

    /**
     * <code>optional string trip_id = 1;</code>
     *
     * <pre>
     * The trip_id from the GTFS feed that this selector refers to.
     * For non frequency-based trips, this field is enough to uniquely identify
     * the trip. For frequency-based trip, start_time and start_date might also be
     * necessary.
     * </pre>
     */
    @Override
    public java.lang.String getTripId() {
      java.lang.Object ref = tripId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          tripId_ = s;
        }
        return s;
      }
    }

    /**
     * <code>optional string trip_id = 1;</code>
     *
     * <pre>
     * The trip_id from the GTFS feed that this selector refers to.
     * For non frequency-based trips, this field is enough to uniquely identify
     * the trip. For frequency-based trip, start_time and start_date might also be
     * necessary.
     * </pre>
     */
    @Override
    public com.google.protobuf.ByteString getTripIdBytes() {
      java.lang.Object ref = tripId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        tripId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int ROUTE_ID_FIELD_NUMBER = 5;
    private java.lang.Object routeId_;

    /**
     * <code>optional string route_id = 5;</code>
     *
     * <pre>
     * The route_id from the GTFS that this selector refers to.
     * </pre>
     */
    @Override
    public boolean hasRouteId() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }

    /**
     * <code>optional string route_id = 5;</code>
     *
     * <pre>
     * The route_id from the GTFS that this selector refers to.
     * </pre>
     */
    @Override
    public java.lang.String getRouteId() {
      java.lang.Object ref = routeId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          routeId_ = s;
        }
        return s;
      }
    }

    /**
     * <code>optional string route_id = 5;</code>
     *
     * <pre>
     * The route_id from the GTFS that this selector refers to.
     * </pre>
     */
    @Override
    public com.google.protobuf.ByteString getRouteIdBytes() {
      java.lang.Object ref = routeId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        routeId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int DIRECTION_ID_FIELD_NUMBER = 6;
    private int directionId_;

    /**
     * <code>optional uint32 direction_id = 6;</code>
     *
     * <pre>
     * The direction_id from the GTFS feed trips.txt file, indicating the
     * direction of travel for trips this selector refers to. This field is
     * still experimental, and subject to change. It may be formally adopted in
     * the future.
     * </pre>
     */
    @Override
    public boolean hasDirectionId() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }

    /**
     * <code>optional uint32 direction_id = 6;</code>
     *
     * <pre>
     * The direction_id from the GTFS feed trips.txt file, indicating the
     * direction of travel for trips this selector refers to. This field is
     * still experimental, and subject to change. It may be formally adopted in
     * the future.
     * </pre>
     */
    @Override
    public int getDirectionId() {
      return directionId_;
    }

    public static final int START_TIME_FIELD_NUMBER = 2;
    private java.lang.Object startTime_;

    /**
     * <code>optional string start_time = 2;</code>
     *
     * <pre>
     * The initially scheduled start time of this trip instance.
     * When the trip_id corresponds to a non-frequency-based trip, this field
     * should either be omitted or be equal to the value in the GTFS feed. When
     * the trip_id correponds to a frequency-based trip, the start_time must be
     * specified for trip updates and vehicle positions. If the trip corresponds
     * to exact_times=1 GTFS record, then start_time must be some multiple
     * (including zero) of headway_secs later than frequencies.txt start_time for
     * the corresponding time period. If the trip corresponds to exact_times=0,
     * then its start_time may be arbitrary, and is initially expected to be the
     * first departure of the trip. Once established, the start_time of this
     * frequency-based trip should be considered immutable, even if the first
     * departure time changes -- that time change may instead be reflected in a
     * StopTimeUpdate.
     * Format and semantics of the field is same as that of
     * GTFS/frequencies.txt/start_time, e.g., 11:15:35 or 25:15:35.
     * </pre>
     */
    @Override
    public boolean hasStartTime() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }

    /**
     * <code>optional string start_time = 2;</code>
     *
     * <pre>
     * The initially scheduled start time of this trip instance.
     * When the trip_id corresponds to a non-frequency-based trip, this field
     * should either be omitted or be equal to the value in the GTFS feed. When
     * the trip_id correponds to a frequency-based trip, the start_time must be
     * specified for trip updates and vehicle positions. If the trip corresponds
     * to exact_times=1 GTFS record, then start_time must be some multiple
     * (including zero) of headway_secs later than frequencies.txt start_time for
     * the corresponding time period. If the trip corresponds to exact_times=0,
     * then its start_time may be arbitrary, and is initially expected to be the
     * first departure of the trip. Once established, the start_time of this
     * frequency-based trip should be considered immutable, even if the first
     * departure time changes -- that time change may instead be reflected in a
     * StopTimeUpdate.
     * Format and semantics of the field is same as that of
     * GTFS/frequencies.txt/start_time, e.g., 11:15:35 or 25:15:35.
     * </pre>
     */
    @Override
    public java.lang.String getStartTime() {
      java.lang.Object ref = startTime_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          startTime_ = s;
        }
        return s;
      }
    }

    /**
     * <code>optional string start_time = 2;</code>
     *
     * <pre>
     * The initially scheduled start time of this trip instance.
     * When the trip_id corresponds to a non-frequency-based trip, this field
     * should either be omitted or be equal to the value in the GTFS feed. When
     * the trip_id correponds to a frequency-based trip, the start_time must be
     * specified for trip updates and vehicle positions. If the trip corresponds
     * to exact_times=1 GTFS record, then start_time must be some multiple
     * (including zero) of headway_secs later than frequencies.txt start_time for
     * the corresponding time period. If the trip corresponds to exact_times=0,
     * then its start_time may be arbitrary, and is initially expected to be the
     * first departure of the trip. Once established, the start_time of this
     * frequency-based trip should be considered immutable, even if the first
     * departure time changes -- that time change may instead be reflected in a
     * StopTimeUpdate.
     * Format and semantics of the field is same as that of
     * GTFS/frequencies.txt/start_time, e.g., 11:15:35 or 25:15:35.
     * </pre>
     */
    @Override
    public com.google.protobuf.ByteString getStartTimeBytes() {
      java.lang.Object ref = startTime_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        startTime_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int START_DATE_FIELD_NUMBER = 3;
    private java.lang.Object startDate_;

    /**
     * <code>optional string start_date = 3;</code>
     *
     * <pre>
     * The scheduled start date of this trip instance.
     * Must be provided to disambiguate trips that are so late as to collide with
     * a scheduled trip on a next day. For example, for a train that departs 8:00
     * and 20:00 every day, and is 12 hours late, there would be two distinct
     * trips on the same time.
     * This field can be provided but is not mandatory for schedules in which such
     * collisions are impossible - for example, a service running on hourly
     * schedule where a vehicle that is one hour late is not considered to be
     * related to schedule anymore.
     * In YYYYMMDD format.
     * </pre>
     */
    @Override
    public boolean hasStartDate() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }

    /**
     * <code>optional string start_date = 3;</code>
     *
     * <pre>
     * The scheduled start date of this trip instance.
     * Must be provided to disambiguate trips that are so late as to collide with
     * a scheduled trip on a next day. For example, for a train that departs 8:00
     * and 20:00 every day, and is 12 hours late, there would be two distinct
     * trips on the same time.
     * This field can be provided but is not mandatory for schedules in which such
     * collisions are impossible - for example, a service running on hourly
     * schedule where a vehicle that is one hour late is not considered to be
     * related to schedule anymore.
     * In YYYYMMDD format.
     * </pre>
     */
    @Override
    public java.lang.String getStartDate() {
      java.lang.Object ref = startDate_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          startDate_ = s;
        }
        return s;
      }
    }

    /**
     * <code>optional string start_date = 3;</code>
     *
     * <pre>
     * The scheduled start date of this trip instance.
     * Must be provided to disambiguate trips that are so late as to collide with
     * a scheduled trip on a next day. For example, for a train that departs 8:00
     * and 20:00 every day, and is 12 hours late, there would be two distinct
     * trips on the same time.
     * This field can be provided but is not mandatory for schedules in which such
     * collisions are impossible - for example, a service running on hourly
     * schedule where a vehicle that is one hour late is not considered to be
     * related to schedule anymore.
     * In YYYYMMDD format.
     * </pre>
     */
    @Override
    public com.google.protobuf.ByteString getStartDateBytes() {
      java.lang.Object ref = startDate_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        startDate_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int SCHEDULE_RELATIONSHIP_FIELD_NUMBER = 4;
    private com.google.transit.realtime.GtfsRealtime.TripDescriptor.ScheduleRelationship scheduleRelationship_;

    /**
     * <code>optional .transit_realtime.TripDescriptor.ScheduleRelationship schedule_relationship = 4;</code>
     */
    @Override
    public boolean hasScheduleRelationship() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }

    /**
     * <code>optional .transit_realtime.TripDescriptor.ScheduleRelationship schedule_relationship = 4;</code>
     */
    @Override
    public com.google.transit.realtime.GtfsRealtime.TripDescriptor.ScheduleRelationship getScheduleRelationship() {
      return scheduleRelationship_;
    }

    private void initFields() {
      tripId_ = "";
      routeId_ = "";
      directionId_ = 0;
      startTime_ = "";
      startDate_ = "";
      scheduleRelationship_ =
          com.google.transit.realtime.GtfsRealtime.TripDescriptor.ScheduleRelationship.SCHEDULED;
    }

    private byte memoizedIsInitialized = -1;

    @Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1)
        return true;
      if (isInitialized == 0)
        return false;

      if (!extensionsAreInitialized()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    @Override
    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      getSerializedSize();
      com.google.protobuf.GeneratedMessage.ExtendableMessage<com.google.transit.realtime.GtfsRealtime.TripDescriptor>.ExtensionWriter extensionWriter =
          newExtensionWriter();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getTripIdBytes());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeBytes(2, getStartTimeBytes());
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeBytes(3, getStartDateBytes());
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        output.writeEnum(4, scheduleRelationship_.getNumber());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(5, getRouteIdBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeUInt32(6, directionId_);
      }
      extensionWriter.writeUntil(2000, output);
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;

    @Override
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1)
        return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream.computeBytesSize(1, getTripIdBytes());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream.computeBytesSize(2, getStartTimeBytes());
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream.computeBytesSize(3, getStartDateBytes());
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        size += com.google.protobuf.CodedOutputStream.computeEnumSize(4,
            scheduleRelationship_.getNumber());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream.computeBytesSize(5, getRouteIdBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream.computeUInt32Size(6, directionId_);
      }
      size += extensionsSerializedSize();
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;

    @java.lang.Override
    protected java.lang.Object writeReplace() throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static com.google.transit.realtime.GtfsRealtime.TripDescriptor parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.google.transit.realtime.GtfsRealtime.TripDescriptor parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.google.transit.realtime.GtfsRealtime.TripDescriptor parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.google.transit.realtime.GtfsRealtime.TripDescriptor parseFrom(byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.google.transit.realtime.GtfsRealtime.TripDescriptor parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return PARSER.parseFrom(input);
    }

    public static com.google.transit.realtime.GtfsRealtime.TripDescriptor parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static com.google.transit.realtime.GtfsRealtime.TripDescriptor parseDelimitedFrom(
        java.io.InputStream input) throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }

    public static com.google.transit.realtime.GtfsRealtime.TripDescriptor parseDelimitedFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }

    public static com.google.transit.realtime.GtfsRealtime.TripDescriptor parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return PARSER.parseFrom(input);
    }

    public static com.google.transit.realtime.GtfsRealtime.TripDescriptor parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return Builder.create();
    }

    @Override
    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder(
        com.google.transit.realtime.GtfsRealtime.TripDescriptor prototype) {
      return newBuilder().mergeFrom(prototype);
    }

    @Override
    public Builder toBuilder() {
      return newBuilder(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }

    /**
     * Protobuf type {@code transit_realtime.TripDescriptor}
     *
     * <pre>
     * A descriptor that identifies an instance of a GTFS trip, or all instances of
     * a trip along a route.
     * - To specify a single trip instance, the trip_id (and if necessary,
     *   start_time) is set. If route_id is also set, then it should be same as one
     *   that the given trip corresponds to.
     * - To specify all the trips along a given route, only the route_id should be
     *   set. Note that if the trip_id is not known, then stop sequence ids in
     *   TripUpdate are not sufficient, and stop_ids must be provided as well. In
     *   addition, absolute arrival/departure times must be provided.
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.ExtendableBuilder<com.google.transit.realtime.GtfsRealtime.TripDescriptor, Builder>
        implements
        // @@protoc_insertion_point(builder_implements:transit_realtime.TripDescriptor)
        com.google.transit.realtime.GtfsRealtime.TripDescriptorOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_TripDescriptor_descriptor;
      }

      @Override
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
        return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_TripDescriptor_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.google.transit.realtime.GtfsRealtime.TripDescriptor.class,
                com.google.transit.realtime.GtfsRealtime.TripDescriptor.Builder.class);
      }

      // Construct using com.google.transit.realtime.GtfsRealtime.TripDescriptor.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessage.BuilderParent parent) {
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

      @Override
      public Builder clear() {
        super.clear();
        tripId_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        routeId_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        directionId_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        startTime_ = "";
        bitField0_ = (bitField0_ & ~0x00000008);
        startDate_ = "";
        bitField0_ = (bitField0_ & ~0x00000010);
        scheduleRelationship_ =
            com.google.transit.realtime.GtfsRealtime.TripDescriptor.ScheduleRelationship.SCHEDULED;
        bitField0_ = (bitField0_ & ~0x00000020);
        return this;
      }

      @Override
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_TripDescriptor_descriptor;
      }

      @Override
      public com.google.transit.realtime.GtfsRealtime.TripDescriptor getDefaultInstanceForType() {
        return com.google.transit.realtime.GtfsRealtime.TripDescriptor.getDefaultInstance();
      }

      @Override
      public com.google.transit.realtime.GtfsRealtime.TripDescriptor build() {
        com.google.transit.realtime.GtfsRealtime.TripDescriptor result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public com.google.transit.realtime.GtfsRealtime.TripDescriptor buildPartial() {
        com.google.transit.realtime.GtfsRealtime.TripDescriptor result =
            new com.google.transit.realtime.GtfsRealtime.TripDescriptor(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.tripId_ = tripId_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.routeId_ = routeId_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.directionId_ = directionId_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.startTime_ = startTime_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.startDate_ = startDate_;
        if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
          to_bitField0_ |= 0x00000020;
        }
        result.scheduleRelationship_ = scheduleRelationship_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.google.transit.realtime.GtfsRealtime.TripDescriptor) {
          return mergeFrom((com.google.transit.realtime.GtfsRealtime.TripDescriptor) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.google.transit.realtime.GtfsRealtime.TripDescriptor other) {
        if (other == com.google.transit.realtime.GtfsRealtime.TripDescriptor.getDefaultInstance())
          return this;
        if (other.hasTripId()) {
          bitField0_ |= 0x00000001;
          tripId_ = other.tripId_;
          onChanged();
        }
        if (other.hasRouteId()) {
          bitField0_ |= 0x00000002;
          routeId_ = other.routeId_;
          onChanged();
        }
        if (other.hasDirectionId()) {
          setDirectionId(other.getDirectionId());
        }
        if (other.hasStartTime()) {
          bitField0_ |= 0x00000008;
          startTime_ = other.startTime_;
          onChanged();
        }
        if (other.hasStartDate()) {
          bitField0_ |= 0x00000010;
          startDate_ = other.startDate_;
          onChanged();
        }
        if (other.hasScheduleRelationship()) {
          setScheduleRelationship(other.getScheduleRelationship());
        }
        this.mergeExtensionFields(other);
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      @Override
      public final boolean isInitialized() {
        if (!extensionsAreInitialized()) {

          return false;
        }
        return true;
      }

      @Override
      public Builder mergeFrom(com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        com.google.transit.realtime.GtfsRealtime.TripDescriptor parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (com.google.transit.realtime.GtfsRealtime.TripDescriptor) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private java.lang.Object tripId_ = "";

      /**
       * <code>optional string trip_id = 1;</code>
       *
       * <pre>
       * The trip_id from the GTFS feed that this selector refers to.
       * For non frequency-based trips, this field is enough to uniquely identify
       * the trip. For frequency-based trip, start_time and start_date might also be
       * necessary.
       * </pre>
       */
      @Override
      public boolean hasTripId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }

      /**
       * <code>optional string trip_id = 1;</code>
       *
       * <pre>
       * The trip_id from the GTFS feed that this selector refers to.
       * For non frequency-based trips, this field is enough to uniquely identify
       * the trip. For frequency-based trip, start_time and start_date might also be
       * necessary.
       * </pre>
       */
      @Override
      public java.lang.String getTripId() {
        java.lang.Object ref = tripId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            tripId_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }

      /**
       * <code>optional string trip_id = 1;</code>
       *
       * <pre>
       * The trip_id from the GTFS feed that this selector refers to.
       * For non frequency-based trips, this field is enough to uniquely identify
       * the trip. For frequency-based trip, start_time and start_date might also be
       * necessary.
       * </pre>
       */
      @Override
      public com.google.protobuf.ByteString getTripIdBytes() {
        java.lang.Object ref = tripId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          tripId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }

      /**
       * <code>optional string trip_id = 1;</code>
       *
       * <pre>
       * The trip_id from the GTFS feed that this selector refers to.
       * For non frequency-based trips, this field is enough to uniquely identify
       * the trip. For frequency-based trip, start_time and start_date might also be
       * necessary.
       * </pre>
       */
      public Builder setTripId(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        tripId_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>optional string trip_id = 1;</code>
       *
       * <pre>
       * The trip_id from the GTFS feed that this selector refers to.
       * For non frequency-based trips, this field is enough to uniquely identify
       * the trip. For frequency-based trip, start_time and start_date might also be
       * necessary.
       * </pre>
       */
      public Builder clearTripId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        tripId_ = getDefaultInstance().getTripId();
        onChanged();
        return this;
      }

      /**
       * <code>optional string trip_id = 1;</code>
       *
       * <pre>
       * The trip_id from the GTFS feed that this selector refers to.
       * For non frequency-based trips, this field is enough to uniquely identify
       * the trip. For frequency-based trip, start_time and start_date might also be
       * necessary.
       * </pre>
       */
      public Builder setTripIdBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        tripId_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object routeId_ = "";

      /**
       * <code>optional string route_id = 5;</code>
       *
       * <pre>
       * The route_id from the GTFS that this selector refers to.
       * </pre>
       */
      @Override
      public boolean hasRouteId() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }

      /**
       * <code>optional string route_id = 5;</code>
       *
       * <pre>
       * The route_id from the GTFS that this selector refers to.
       * </pre>
       */
      @Override
      public java.lang.String getRouteId() {
        java.lang.Object ref = routeId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            routeId_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }

      /**
       * <code>optional string route_id = 5;</code>
       *
       * <pre>
       * The route_id from the GTFS that this selector refers to.
       * </pre>
       */
      @Override
      public com.google.protobuf.ByteString getRouteIdBytes() {
        java.lang.Object ref = routeId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          routeId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }

      /**
       * <code>optional string route_id = 5;</code>
       *
       * <pre>
       * The route_id from the GTFS that this selector refers to.
       * </pre>
       */
      public Builder setRouteId(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        routeId_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>optional string route_id = 5;</code>
       *
       * <pre>
       * The route_id from the GTFS that this selector refers to.
       * </pre>
       */
      public Builder clearRouteId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        routeId_ = getDefaultInstance().getRouteId();
        onChanged();
        return this;
      }

      /**
       * <code>optional string route_id = 5;</code>
       *
       * <pre>
       * The route_id from the GTFS that this selector refers to.
       * </pre>
       */
      public Builder setRouteIdBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        routeId_ = value;
        onChanged();
        return this;
      }

      private int directionId_;

      /**
       * <code>optional uint32 direction_id = 6;</code>
       *
       * <pre>
       * The direction_id from the GTFS feed trips.txt file, indicating the
       * direction of travel for trips this selector refers to. This field is
       * still experimental, and subject to change. It may be formally adopted in
       * the future.
       * </pre>
       */
      @Override
      public boolean hasDirectionId() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }

      /**
       * <code>optional uint32 direction_id = 6;</code>
       *
       * <pre>
       * The direction_id from the GTFS feed trips.txt file, indicating the
       * direction of travel for trips this selector refers to. This field is
       * still experimental, and subject to change. It may be formally adopted in
       * the future.
       * </pre>
       */
      @Override
      public int getDirectionId() {
        return directionId_;
      }

      /**
       * <code>optional uint32 direction_id = 6;</code>
       *
       * <pre>
       * The direction_id from the GTFS feed trips.txt file, indicating the
       * direction of travel for trips this selector refers to. This field is
       * still experimental, and subject to change. It may be formally adopted in
       * the future.
       * </pre>
       */
      public Builder setDirectionId(int value) {
        bitField0_ |= 0x00000004;
        directionId_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>optional uint32 direction_id = 6;</code>
       *
       * <pre>
       * The direction_id from the GTFS feed trips.txt file, indicating the
       * direction of travel for trips this selector refers to. This field is
       * still experimental, and subject to change. It may be formally adopted in
       * the future.
       * </pre>
       */
      public Builder clearDirectionId() {
        bitField0_ = (bitField0_ & ~0x00000004);
        directionId_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object startTime_ = "";

      /**
       * <code>optional string start_time = 2;</code>
       *
       * <pre>
       * The initially scheduled start time of this trip instance.
       * When the trip_id corresponds to a non-frequency-based trip, this field
       * should either be omitted or be equal to the value in the GTFS feed. When
       * the trip_id correponds to a frequency-based trip, the start_time must be
       * specified for trip updates and vehicle positions. If the trip corresponds
       * to exact_times=1 GTFS record, then start_time must be some multiple
       * (including zero) of headway_secs later than frequencies.txt start_time for
       * the corresponding time period. If the trip corresponds to exact_times=0,
       * then its start_time may be arbitrary, and is initially expected to be the
       * first departure of the trip. Once established, the start_time of this
       * frequency-based trip should be considered immutable, even if the first
       * departure time changes -- that time change may instead be reflected in a
       * StopTimeUpdate.
       * Format and semantics of the field is same as that of
       * GTFS/frequencies.txt/start_time, e.g., 11:15:35 or 25:15:35.
       * </pre>
       */
      @Override
      public boolean hasStartTime() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }

      /**
       * <code>optional string start_time = 2;</code>
       *
       * <pre>
       * The initially scheduled start time of this trip instance.
       * When the trip_id corresponds to a non-frequency-based trip, this field
       * should either be omitted or be equal to the value in the GTFS feed. When
       * the trip_id correponds to a frequency-based trip, the start_time must be
       * specified for trip updates and vehicle positions. If the trip corresponds
       * to exact_times=1 GTFS record, then start_time must be some multiple
       * (including zero) of headway_secs later than frequencies.txt start_time for
       * the corresponding time period. If the trip corresponds to exact_times=0,
       * then its start_time may be arbitrary, and is initially expected to be the
       * first departure of the trip. Once established, the start_time of this
       * frequency-based trip should be considered immutable, even if the first
       * departure time changes -- that time change may instead be reflected in a
       * StopTimeUpdate.
       * Format and semantics of the field is same as that of
       * GTFS/frequencies.txt/start_time, e.g., 11:15:35 or 25:15:35.
       * </pre>
       */
      @Override
      public java.lang.String getStartTime() {
        java.lang.Object ref = startTime_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            startTime_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }

      /**
       * <code>optional string start_time = 2;</code>
       *
       * <pre>
       * The initially scheduled start time of this trip instance.
       * When the trip_id corresponds to a non-frequency-based trip, this field
       * should either be omitted or be equal to the value in the GTFS feed. When
       * the trip_id correponds to a frequency-based trip, the start_time must be
       * specified for trip updates and vehicle positions. If the trip corresponds
       * to exact_times=1 GTFS record, then start_time must be some multiple
       * (including zero) of headway_secs later than frequencies.txt start_time for
       * the corresponding time period. If the trip corresponds to exact_times=0,
       * then its start_time may be arbitrary, and is initially expected to be the
       * first departure of the trip. Once established, the start_time of this
       * frequency-based trip should be considered immutable, even if the first
       * departure time changes -- that time change may instead be reflected in a
       * StopTimeUpdate.
       * Format and semantics of the field is same as that of
       * GTFS/frequencies.txt/start_time, e.g., 11:15:35 or 25:15:35.
       * </pre>
       */
      @Override
      public com.google.protobuf.ByteString getStartTimeBytes() {
        java.lang.Object ref = startTime_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          startTime_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }

      /**
       * <code>optional string start_time = 2;</code>
       *
       * <pre>
       * The initially scheduled start time of this trip instance.
       * When the trip_id corresponds to a non-frequency-based trip, this field
       * should either be omitted or be equal to the value in the GTFS feed. When
       * the trip_id correponds to a frequency-based trip, the start_time must be
       * specified for trip updates and vehicle positions. If the trip corresponds
       * to exact_times=1 GTFS record, then start_time must be some multiple
       * (including zero) of headway_secs later than frequencies.txt start_time for
       * the corresponding time period. If the trip corresponds to exact_times=0,
       * then its start_time may be arbitrary, and is initially expected to be the
       * first departure of the trip. Once established, the start_time of this
       * frequency-based trip should be considered immutable, even if the first
       * departure time changes -- that time change may instead be reflected in a
       * StopTimeUpdate.
       * Format and semantics of the field is same as that of
       * GTFS/frequencies.txt/start_time, e.g., 11:15:35 or 25:15:35.
       * </pre>
       */
      public Builder setStartTime(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000008;
        startTime_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>optional string start_time = 2;</code>
       *
       * <pre>
       * The initially scheduled start time of this trip instance.
       * When the trip_id corresponds to a non-frequency-based trip, this field
       * should either be omitted or be equal to the value in the GTFS feed. When
       * the trip_id correponds to a frequency-based trip, the start_time must be
       * specified for trip updates and vehicle positions. If the trip corresponds
       * to exact_times=1 GTFS record, then start_time must be some multiple
       * (including zero) of headway_secs later than frequencies.txt start_time for
       * the corresponding time period. If the trip corresponds to exact_times=0,
       * then its start_time may be arbitrary, and is initially expected to be the
       * first departure of the trip. Once established, the start_time of this
       * frequency-based trip should be considered immutable, even if the first
       * departure time changes -- that time change may instead be reflected in a
       * StopTimeUpdate.
       * Format and semantics of the field is same as that of
       * GTFS/frequencies.txt/start_time, e.g., 11:15:35 or 25:15:35.
       * </pre>
       */
      public Builder clearStartTime() {
        bitField0_ = (bitField0_ & ~0x00000008);
        startTime_ = getDefaultInstance().getStartTime();
        onChanged();
        return this;
      }

      /**
       * <code>optional string start_time = 2;</code>
       *
       * <pre>
       * The initially scheduled start time of this trip instance.
       * When the trip_id corresponds to a non-frequency-based trip, this field
       * should either be omitted or be equal to the value in the GTFS feed. When
       * the trip_id correponds to a frequency-based trip, the start_time must be
       * specified for trip updates and vehicle positions. If the trip corresponds
       * to exact_times=1 GTFS record, then start_time must be some multiple
       * (including zero) of headway_secs later than frequencies.txt start_time for
       * the corresponding time period. If the trip corresponds to exact_times=0,
       * then its start_time may be arbitrary, and is initially expected to be the
       * first departure of the trip. Once established, the start_time of this
       * frequency-based trip should be considered immutable, even if the first
       * departure time changes -- that time change may instead be reflected in a
       * StopTimeUpdate.
       * Format and semantics of the field is same as that of
       * GTFS/frequencies.txt/start_time, e.g., 11:15:35 or 25:15:35.
       * </pre>
       */
      public Builder setStartTimeBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000008;
        startTime_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object startDate_ = "";

      /**
       * <code>optional string start_date = 3;</code>
       *
       * <pre>
       * The scheduled start date of this trip instance.
       * Must be provided to disambiguate trips that are so late as to collide with
       * a scheduled trip on a next day. For example, for a train that departs 8:00
       * and 20:00 every day, and is 12 hours late, there would be two distinct
       * trips on the same time.
       * This field can be provided but is not mandatory for schedules in which such
       * collisions are impossible - for example, a service running on hourly
       * schedule where a vehicle that is one hour late is not considered to be
       * related to schedule anymore.
       * In YYYYMMDD format.
       * </pre>
       */
      @Override
      public boolean hasStartDate() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }

      /**
       * <code>optional string start_date = 3;</code>
       *
       * <pre>
       * The scheduled start date of this trip instance.
       * Must be provided to disambiguate trips that are so late as to collide with
       * a scheduled trip on a next day. For example, for a train that departs 8:00
       * and 20:00 every day, and is 12 hours late, there would be two distinct
       * trips on the same time.
       * This field can be provided but is not mandatory for schedules in which such
       * collisions are impossible - for example, a service running on hourly
       * schedule where a vehicle that is one hour late is not considered to be
       * related to schedule anymore.
       * In YYYYMMDD format.
       * </pre>
       */
      @Override
      public java.lang.String getStartDate() {
        java.lang.Object ref = startDate_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            startDate_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }

      /**
       * <code>optional string start_date = 3;</code>
       *
       * <pre>
       * The scheduled start date of this trip instance.
       * Must be provided to disambiguate trips that are so late as to collide with
       * a scheduled trip on a next day. For example, for a train that departs 8:00
       * and 20:00 every day, and is 12 hours late, there would be two distinct
       * trips on the same time.
       * This field can be provided but is not mandatory for schedules in which such
       * collisions are impossible - for example, a service running on hourly
       * schedule where a vehicle that is one hour late is not considered to be
       * related to schedule anymore.
       * In YYYYMMDD format.
       * </pre>
       */
      @Override
      public com.google.protobuf.ByteString getStartDateBytes() {
        java.lang.Object ref = startDate_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          startDate_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }

      /**
       * <code>optional string start_date = 3;</code>
       *
       * <pre>
       * The scheduled start date of this trip instance.
       * Must be provided to disambiguate trips that are so late as to collide with
       * a scheduled trip on a next day. For example, for a train that departs 8:00
       * and 20:00 every day, and is 12 hours late, there would be two distinct
       * trips on the same time.
       * This field can be provided but is not mandatory for schedules in which such
       * collisions are impossible - for example, a service running on hourly
       * schedule where a vehicle that is one hour late is not considered to be
       * related to schedule anymore.
       * In YYYYMMDD format.
       * </pre>
       */
      public Builder setStartDate(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000010;
        startDate_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>optional string start_date = 3;</code>
       *
       * <pre>
       * The scheduled start date of this trip instance.
       * Must be provided to disambiguate trips that are so late as to collide with
       * a scheduled trip on a next day. For example, for a train that departs 8:00
       * and 20:00 every day, and is 12 hours late, there would be two distinct
       * trips on the same time.
       * This field can be provided but is not mandatory for schedules in which such
       * collisions are impossible - for example, a service running on hourly
       * schedule where a vehicle that is one hour late is not considered to be
       * related to schedule anymore.
       * In YYYYMMDD format.
       * </pre>
       */
      public Builder clearStartDate() {
        bitField0_ = (bitField0_ & ~0x00000010);
        startDate_ = getDefaultInstance().getStartDate();
        onChanged();
        return this;
      }

      /**
       * <code>optional string start_date = 3;</code>
       *
       * <pre>
       * The scheduled start date of this trip instance.
       * Must be provided to disambiguate trips that are so late as to collide with
       * a scheduled trip on a next day. For example, for a train that departs 8:00
       * and 20:00 every day, and is 12 hours late, there would be two distinct
       * trips on the same time.
       * This field can be provided but is not mandatory for schedules in which such
       * collisions are impossible - for example, a service running on hourly
       * schedule where a vehicle that is one hour late is not considered to be
       * related to schedule anymore.
       * In YYYYMMDD format.
       * </pre>
       */
      public Builder setStartDateBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000010;
        startDate_ = value;
        onChanged();
        return this;
      }

      private com.google.transit.realtime.GtfsRealtime.TripDescriptor.ScheduleRelationship scheduleRelationship_ =
          com.google.transit.realtime.GtfsRealtime.TripDescriptor.ScheduleRelationship.SCHEDULED;

      /**
       * <code>optional .transit_realtime.TripDescriptor.ScheduleRelationship schedule_relationship = 4;</code>
       */
      @Override
      public boolean hasScheduleRelationship() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }

      /**
       * <code>optional .transit_realtime.TripDescriptor.ScheduleRelationship schedule_relationship = 4;</code>
       */
      @Override
      public com.google.transit.realtime.GtfsRealtime.TripDescriptor.ScheduleRelationship getScheduleRelationship() {
        return scheduleRelationship_;
      }

      /**
       * <code>optional .transit_realtime.TripDescriptor.ScheduleRelationship schedule_relationship = 4;</code>
       */
      public Builder setScheduleRelationship(
          com.google.transit.realtime.GtfsRealtime.TripDescriptor.ScheduleRelationship value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000020;
        scheduleRelationship_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>optional .transit_realtime.TripDescriptor.ScheduleRelationship schedule_relationship = 4;</code>
       */
      public Builder clearScheduleRelationship() {
        bitField0_ = (bitField0_ & ~0x00000020);
        scheduleRelationship_ =
            com.google.transit.realtime.GtfsRealtime.TripDescriptor.ScheduleRelationship.SCHEDULED;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:transit_realtime.TripDescriptor)
    }

    static {
      defaultInstance = new TripDescriptor(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:transit_realtime.TripDescriptor)
  }

  public interface VehicleDescriptorOrBuilder extends
      // @@protoc_insertion_point(interface_extends:transit_realtime.VehicleDescriptor)
      com.google.protobuf.GeneratedMessage.ExtendableMessageOrBuilder<VehicleDescriptor> {

    /**
     * <code>optional string id = 1;</code>
     *
     * <pre>
     * Internal system identification of the vehicle. Should be unique per
     * vehicle, and can be used for tracking the vehicle as it proceeds through
     * the system.
     * </pre>
     */
    boolean hasId();

    /**
     * <code>optional string id = 1;</code>
     *
     * <pre>
     * Internal system identification of the vehicle. Should be unique per
     * vehicle, and can be used for tracking the vehicle as it proceeds through
     * the system.
     * </pre>
     */
    java.lang.String getId();

    /**
     * <code>optional string id = 1;</code>
     *
     * <pre>
     * Internal system identification of the vehicle. Should be unique per
     * vehicle, and can be used for tracking the vehicle as it proceeds through
     * the system.
     * </pre>
     */
    com.google.protobuf.ByteString getIdBytes();

    /**
     * <code>optional string label = 2;</code>
     *
     * <pre>
     * User visible label, i.e., something that must be shown to the passenger to
     * help identify the correct vehicle.
     * </pre>
     */
    boolean hasLabel();

    /**
     * <code>optional string label = 2;</code>
     *
     * <pre>
     * User visible label, i.e., something that must be shown to the passenger to
     * help identify the correct vehicle.
     * </pre>
     */
    java.lang.String getLabel();

    /**
     * <code>optional string label = 2;</code>
     *
     * <pre>
     * User visible label, i.e., something that must be shown to the passenger to
     * help identify the correct vehicle.
     * </pre>
     */
    com.google.protobuf.ByteString getLabelBytes();

    /**
     * <code>optional string license_plate = 3;</code>
     *
     * <pre>
     * The license plate of the vehicle.
     * </pre>
     */
    boolean hasLicensePlate();

    /**
     * <code>optional string license_plate = 3;</code>
     *
     * <pre>
     * The license plate of the vehicle.
     * </pre>
     */
    java.lang.String getLicensePlate();

    /**
     * <code>optional string license_plate = 3;</code>
     *
     * <pre>
     * The license plate of the vehicle.
     * </pre>
     */
    com.google.protobuf.ByteString getLicensePlateBytes();
  }
  /**
   * Protobuf type {@code transit_realtime.VehicleDescriptor}
   *
   * <pre>
   * Identification information for the vehicle performing the trip.
   * </pre>
   */
  public static final class VehicleDescriptor
      extends com.google.protobuf.GeneratedMessage.ExtendableMessage<VehicleDescriptor> implements
      // @@protoc_insertion_point(message_implements:transit_realtime.VehicleDescriptor)
      VehicleDescriptorOrBuilder {
    // Use VehicleDescriptor.newBuilder() to construct.
    private VehicleDescriptor(
        com.google.protobuf.GeneratedMessage.ExtendableBuilder<com.google.transit.realtime.GtfsRealtime.VehicleDescriptor, ?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }

    private VehicleDescriptor(boolean noInit) {
      this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }

    private static final VehicleDescriptor defaultInstance;

    public static VehicleDescriptor getDefaultInstance() {
      return defaultInstance;
    }

    @Override
    public VehicleDescriptor getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private VehicleDescriptor(com.google.protobuf.CodedInputStream input,
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
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000001;
              id_ = bs;
              break;
            }
            case 18: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000002;
              label_ = bs;
              break;
            }
            case 26: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000004;
              licensePlate_ = bs;
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e.getMessage())
            .setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_VehicleDescriptor_descriptor;
    }

    @Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
      return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_VehicleDescriptor_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.transit.realtime.GtfsRealtime.VehicleDescriptor.class,
              com.google.transit.realtime.GtfsRealtime.VehicleDescriptor.Builder.class);
    }

    public static com.google.protobuf.Parser<VehicleDescriptor> PARSER =
        new com.google.protobuf.AbstractParser<VehicleDescriptor>() {
          @Override
          public VehicleDescriptor parsePartialFrom(com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new VehicleDescriptor(input, extensionRegistry);
          }
        };

    @java.lang.Override
    public com.google.protobuf.Parser<VehicleDescriptor> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int ID_FIELD_NUMBER = 1;
    private java.lang.Object id_;

    /**
     * <code>optional string id = 1;</code>
     *
     * <pre>
     * Internal system identification of the vehicle. Should be unique per
     * vehicle, and can be used for tracking the vehicle as it proceeds through
     * the system.
     * </pre>
     */
    @Override
    public boolean hasId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }

    /**
     * <code>optional string id = 1;</code>
     *
     * <pre>
     * Internal system identification of the vehicle. Should be unique per
     * vehicle, and can be used for tracking the vehicle as it proceeds through
     * the system.
     * </pre>
     */
    @Override
    public java.lang.String getId() {
      java.lang.Object ref = id_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          id_ = s;
        }
        return s;
      }
    }

    /**
     * <code>optional string id = 1;</code>
     *
     * <pre>
     * Internal system identification of the vehicle. Should be unique per
     * vehicle, and can be used for tracking the vehicle as it proceeds through
     * the system.
     * </pre>
     */
    @Override
    public com.google.protobuf.ByteString getIdBytes() {
      java.lang.Object ref = id_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        id_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int LABEL_FIELD_NUMBER = 2;
    private java.lang.Object label_;

    /**
     * <code>optional string label = 2;</code>
     *
     * <pre>
     * User visible label, i.e., something that must be shown to the passenger to
     * help identify the correct vehicle.
     * </pre>
     */
    @Override
    public boolean hasLabel() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }

    /**
     * <code>optional string label = 2;</code>
     *
     * <pre>
     * User visible label, i.e., something that must be shown to the passenger to
     * help identify the correct vehicle.
     * </pre>
     */
    @Override
    public java.lang.String getLabel() {
      java.lang.Object ref = label_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          label_ = s;
        }
        return s;
      }
    }

    /**
     * <code>optional string label = 2;</code>
     *
     * <pre>
     * User visible label, i.e., something that must be shown to the passenger to
     * help identify the correct vehicle.
     * </pre>
     */
    @Override
    public com.google.protobuf.ByteString getLabelBytes() {
      java.lang.Object ref = label_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        label_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int LICENSE_PLATE_FIELD_NUMBER = 3;
    private java.lang.Object licensePlate_;

    /**
     * <code>optional string license_plate = 3;</code>
     *
     * <pre>
     * The license plate of the vehicle.
     * </pre>
     */
    @Override
    public boolean hasLicensePlate() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }

    /**
     * <code>optional string license_plate = 3;</code>
     *
     * <pre>
     * The license plate of the vehicle.
     * </pre>
     */
    @Override
    public java.lang.String getLicensePlate() {
      java.lang.Object ref = licensePlate_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          licensePlate_ = s;
        }
        return s;
      }
    }

    /**
     * <code>optional string license_plate = 3;</code>
     *
     * <pre>
     * The license plate of the vehicle.
     * </pre>
     */
    @Override
    public com.google.protobuf.ByteString getLicensePlateBytes() {
      java.lang.Object ref = licensePlate_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        licensePlate_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private void initFields() {
      id_ = "";
      label_ = "";
      licensePlate_ = "";
    }

    private byte memoizedIsInitialized = -1;

    @Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1)
        return true;
      if (isInitialized == 0)
        return false;

      if (!extensionsAreInitialized()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    @Override
    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      getSerializedSize();
      com.google.protobuf.GeneratedMessage.ExtendableMessage<com.google.transit.realtime.GtfsRealtime.VehicleDescriptor>.ExtensionWriter extensionWriter =
          newExtensionWriter();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getIdBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getLabelBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBytes(3, getLicensePlateBytes());
      }
      extensionWriter.writeUntil(2000, output);
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;

    @Override
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1)
        return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream.computeBytesSize(1, getIdBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream.computeBytesSize(2, getLabelBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream.computeBytesSize(3, getLicensePlateBytes());
      }
      size += extensionsSerializedSize();
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;

    @java.lang.Override
    protected java.lang.Object writeReplace() throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static com.google.transit.realtime.GtfsRealtime.VehicleDescriptor parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.google.transit.realtime.GtfsRealtime.VehicleDescriptor parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.google.transit.realtime.GtfsRealtime.VehicleDescriptor parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.google.transit.realtime.GtfsRealtime.VehicleDescriptor parseFrom(byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.google.transit.realtime.GtfsRealtime.VehicleDescriptor parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return PARSER.parseFrom(input);
    }

    public static com.google.transit.realtime.GtfsRealtime.VehicleDescriptor parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static com.google.transit.realtime.GtfsRealtime.VehicleDescriptor parseDelimitedFrom(
        java.io.InputStream input) throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }

    public static com.google.transit.realtime.GtfsRealtime.VehicleDescriptor parseDelimitedFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }

    public static com.google.transit.realtime.GtfsRealtime.VehicleDescriptor parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return PARSER.parseFrom(input);
    }

    public static com.google.transit.realtime.GtfsRealtime.VehicleDescriptor parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return Builder.create();
    }

    @Override
    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder(
        com.google.transit.realtime.GtfsRealtime.VehicleDescriptor prototype) {
      return newBuilder().mergeFrom(prototype);
    }

    @Override
    public Builder toBuilder() {
      return newBuilder(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }

    /**
     * Protobuf type {@code transit_realtime.VehicleDescriptor}
     *
     * <pre>
     * Identification information for the vehicle performing the trip.
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.ExtendableBuilder<com.google.transit.realtime.GtfsRealtime.VehicleDescriptor, Builder>
        implements
        // @@protoc_insertion_point(builder_implements:transit_realtime.VehicleDescriptor)
        com.google.transit.realtime.GtfsRealtime.VehicleDescriptorOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_VehicleDescriptor_descriptor;
      }

      @Override
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
        return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_VehicleDescriptor_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.google.transit.realtime.GtfsRealtime.VehicleDescriptor.class,
                com.google.transit.realtime.GtfsRealtime.VehicleDescriptor.Builder.class);
      }

      // Construct using com.google.transit.realtime.GtfsRealtime.VehicleDescriptor.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessage.BuilderParent parent) {
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

      @Override
      public Builder clear() {
        super.clear();
        id_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        label_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        licensePlate_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      @Override
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_VehicleDescriptor_descriptor;
      }

      @Override
      public com.google.transit.realtime.GtfsRealtime.VehicleDescriptor getDefaultInstanceForType() {
        return com.google.transit.realtime.GtfsRealtime.VehicleDescriptor.getDefaultInstance();
      }

      @Override
      public com.google.transit.realtime.GtfsRealtime.VehicleDescriptor build() {
        com.google.transit.realtime.GtfsRealtime.VehicleDescriptor result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public com.google.transit.realtime.GtfsRealtime.VehicleDescriptor buildPartial() {
        com.google.transit.realtime.GtfsRealtime.VehicleDescriptor result =
            new com.google.transit.realtime.GtfsRealtime.VehicleDescriptor(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.id_ = id_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.label_ = label_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.licensePlate_ = licensePlate_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.google.transit.realtime.GtfsRealtime.VehicleDescriptor) {
          return mergeFrom((com.google.transit.realtime.GtfsRealtime.VehicleDescriptor) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.google.transit.realtime.GtfsRealtime.VehicleDescriptor other) {
        if (other == com.google.transit.realtime.GtfsRealtime.VehicleDescriptor
            .getDefaultInstance())
          return this;
        if (other.hasId()) {
          bitField0_ |= 0x00000001;
          id_ = other.id_;
          onChanged();
        }
        if (other.hasLabel()) {
          bitField0_ |= 0x00000002;
          label_ = other.label_;
          onChanged();
        }
        if (other.hasLicensePlate()) {
          bitField0_ |= 0x00000004;
          licensePlate_ = other.licensePlate_;
          onChanged();
        }
        this.mergeExtensionFields(other);
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      @Override
      public final boolean isInitialized() {
        if (!extensionsAreInitialized()) {

          return false;
        }
        return true;
      }

      @Override
      public Builder mergeFrom(com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        com.google.transit.realtime.GtfsRealtime.VehicleDescriptor parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (com.google.transit.realtime.GtfsRealtime.VehicleDescriptor) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private java.lang.Object id_ = "";

      /**
       * <code>optional string id = 1;</code>
       *
       * <pre>
       * Internal system identification of the vehicle. Should be unique per
       * vehicle, and can be used for tracking the vehicle as it proceeds through
       * the system.
       * </pre>
       */
      @Override
      public boolean hasId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }

      /**
       * <code>optional string id = 1;</code>
       *
       * <pre>
       * Internal system identification of the vehicle. Should be unique per
       * vehicle, and can be used for tracking the vehicle as it proceeds through
       * the system.
       * </pre>
       */
      @Override
      public java.lang.String getId() {
        java.lang.Object ref = id_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            id_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }

      /**
       * <code>optional string id = 1;</code>
       *
       * <pre>
       * Internal system identification of the vehicle. Should be unique per
       * vehicle, and can be used for tracking the vehicle as it proceeds through
       * the system.
       * </pre>
       */
      @Override
      public com.google.protobuf.ByteString getIdBytes() {
        java.lang.Object ref = id_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          id_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }

      /**
       * <code>optional string id = 1;</code>
       *
       * <pre>
       * Internal system identification of the vehicle. Should be unique per
       * vehicle, and can be used for tracking the vehicle as it proceeds through
       * the system.
       * </pre>
       */
      public Builder setId(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        id_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>optional string id = 1;</code>
       *
       * <pre>
       * Internal system identification of the vehicle. Should be unique per
       * vehicle, and can be used for tracking the vehicle as it proceeds through
       * the system.
       * </pre>
       */
      public Builder clearId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        id_ = getDefaultInstance().getId();
        onChanged();
        return this;
      }

      /**
       * <code>optional string id = 1;</code>
       *
       * <pre>
       * Internal system identification of the vehicle. Should be unique per
       * vehicle, and can be used for tracking the vehicle as it proceeds through
       * the system.
       * </pre>
       */
      public Builder setIdBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        id_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object label_ = "";

      /**
       * <code>optional string label = 2;</code>
       *
       * <pre>
       * User visible label, i.e., something that must be shown to the passenger to
       * help identify the correct vehicle.
       * </pre>
       */
      @Override
      public boolean hasLabel() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }

      /**
       * <code>optional string label = 2;</code>
       *
       * <pre>
       * User visible label, i.e., something that must be shown to the passenger to
       * help identify the correct vehicle.
       * </pre>
       */
      @Override
      public java.lang.String getLabel() {
        java.lang.Object ref = label_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            label_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }

      /**
       * <code>optional string label = 2;</code>
       *
       * <pre>
       * User visible label, i.e., something that must be shown to the passenger to
       * help identify the correct vehicle.
       * </pre>
       */
      @Override
      public com.google.protobuf.ByteString getLabelBytes() {
        java.lang.Object ref = label_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          label_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }

      /**
       * <code>optional string label = 2;</code>
       *
       * <pre>
       * User visible label, i.e., something that must be shown to the passenger to
       * help identify the correct vehicle.
       * </pre>
       */
      public Builder setLabel(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        label_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>optional string label = 2;</code>
       *
       * <pre>
       * User visible label, i.e., something that must be shown to the passenger to
       * help identify the correct vehicle.
       * </pre>
       */
      public Builder clearLabel() {
        bitField0_ = (bitField0_ & ~0x00000002);
        label_ = getDefaultInstance().getLabel();
        onChanged();
        return this;
      }

      /**
       * <code>optional string label = 2;</code>
       *
       * <pre>
       * User visible label, i.e., something that must be shown to the passenger to
       * help identify the correct vehicle.
       * </pre>
       */
      public Builder setLabelBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        label_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object licensePlate_ = "";

      /**
       * <code>optional string license_plate = 3;</code>
       *
       * <pre>
       * The license plate of the vehicle.
       * </pre>
       */
      @Override
      public boolean hasLicensePlate() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }

      /**
       * <code>optional string license_plate = 3;</code>
       *
       * <pre>
       * The license plate of the vehicle.
       * </pre>
       */
      @Override
      public java.lang.String getLicensePlate() {
        java.lang.Object ref = licensePlate_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            licensePlate_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }

      /**
       * <code>optional string license_plate = 3;</code>
       *
       * <pre>
       * The license plate of the vehicle.
       * </pre>
       */
      @Override
      public com.google.protobuf.ByteString getLicensePlateBytes() {
        java.lang.Object ref = licensePlate_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          licensePlate_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }

      /**
       * <code>optional string license_plate = 3;</code>
       *
       * <pre>
       * The license plate of the vehicle.
       * </pre>
       */
      public Builder setLicensePlate(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000004;
        licensePlate_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>optional string license_plate = 3;</code>
       *
       * <pre>
       * The license plate of the vehicle.
       * </pre>
       */
      public Builder clearLicensePlate() {
        bitField0_ = (bitField0_ & ~0x00000004);
        licensePlate_ = getDefaultInstance().getLicensePlate();
        onChanged();
        return this;
      }

      /**
       * <code>optional string license_plate = 3;</code>
       *
       * <pre>
       * The license plate of the vehicle.
       * </pre>
       */
      public Builder setLicensePlateBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000004;
        licensePlate_ = value;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:transit_realtime.VehicleDescriptor)
    }

    static {
      defaultInstance = new VehicleDescriptor(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:transit_realtime.VehicleDescriptor)
  }

  public interface EntitySelectorOrBuilder extends
      // @@protoc_insertion_point(interface_extends:transit_realtime.EntitySelector)
      com.google.protobuf.GeneratedMessage.ExtendableMessageOrBuilder<EntitySelector> {

    /**
     * <code>optional string agency_id = 1;</code>
     *
     * <pre>
     * The values of the fields should correspond to the appropriate fields in the
     * GTFS feed.
     * At least one specifier must be given. If several are given, then the
     * matching has to apply to all the given specifiers.
     * </pre>
     */
    boolean hasAgencyId();

    /**
     * <code>optional string agency_id = 1;</code>
     *
     * <pre>
     * The values of the fields should correspond to the appropriate fields in the
     * GTFS feed.
     * At least one specifier must be given. If several are given, then the
     * matching has to apply to all the given specifiers.
     * </pre>
     */
    java.lang.String getAgencyId();

    /**
     * <code>optional string agency_id = 1;</code>
     *
     * <pre>
     * The values of the fields should correspond to the appropriate fields in the
     * GTFS feed.
     * At least one specifier must be given. If several are given, then the
     * matching has to apply to all the given specifiers.
     * </pre>
     */
    com.google.protobuf.ByteString getAgencyIdBytes();

    /**
     * <code>optional string route_id = 2;</code>
     */
    boolean hasRouteId();

    /**
     * <code>optional string route_id = 2;</code>
     */
    java.lang.String getRouteId();

    /**
     * <code>optional string route_id = 2;</code>
     */
    com.google.protobuf.ByteString getRouteIdBytes();

    /**
     * <code>optional int32 route_type = 3;</code>
     *
     * <pre>
     * corresponds to route_type in GTFS.
     * </pre>
     */
    boolean hasRouteType();

    /**
     * <code>optional int32 route_type = 3;</code>
     *
     * <pre>
     * corresponds to route_type in GTFS.
     * </pre>
     */
    int getRouteType();

    /**
     * <code>optional .transit_realtime.TripDescriptor trip = 4;</code>
     */
    boolean hasTrip();

    /**
     * <code>optional .transit_realtime.TripDescriptor trip = 4;</code>
     */
    com.google.transit.realtime.GtfsRealtime.TripDescriptor getTrip();

    /**
     * <code>optional .transit_realtime.TripDescriptor trip = 4;</code>
     */
    com.google.transit.realtime.GtfsRealtime.TripDescriptorOrBuilder getTripOrBuilder();

    /**
     * <code>optional string stop_id = 5;</code>
     */
    boolean hasStopId();

    /**
     * <code>optional string stop_id = 5;</code>
     */
    java.lang.String getStopId();

    /**
     * <code>optional string stop_id = 5;</code>
     */
    com.google.protobuf.ByteString getStopIdBytes();
  }
  /**
   * Protobuf type {@code transit_realtime.EntitySelector}
   *
   * <pre>
   * A selector for an entity in a GTFS feed.
   * </pre>
   */
  public static final class EntitySelector
      extends com.google.protobuf.GeneratedMessage.ExtendableMessage<EntitySelector> implements
      // @@protoc_insertion_point(message_implements:transit_realtime.EntitySelector)
      EntitySelectorOrBuilder {
    // Use EntitySelector.newBuilder() to construct.
    private EntitySelector(
        com.google.protobuf.GeneratedMessage.ExtendableBuilder<com.google.transit.realtime.GtfsRealtime.EntitySelector, ?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }

    private EntitySelector(boolean noInit) {
      this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }

    private static final EntitySelector defaultInstance;

    public static EntitySelector getDefaultInstance() {
      return defaultInstance;
    }

    @Override
    public EntitySelector getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private EntitySelector(com.google.protobuf.CodedInputStream input,
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
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000001;
              agencyId_ = bs;
              break;
            }
            case 18: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000002;
              routeId_ = bs;
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              routeType_ = input.readInt32();
              break;
            }
            case 34: {
              com.google.transit.realtime.GtfsRealtime.TripDescriptor.Builder subBuilder = null;
              if (((bitField0_ & 0x00000008) == 0x00000008)) {
                subBuilder = trip_.toBuilder();
              }
              trip_ =
                  input.readMessage(com.google.transit.realtime.GtfsRealtime.TripDescriptor.PARSER,
                      extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(trip_);
                trip_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000008;
              break;
            }
            case 42: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000010;
              stopId_ = bs;
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e.getMessage())
            .setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_EntitySelector_descriptor;
    }

    @Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
      return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_EntitySelector_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.transit.realtime.GtfsRealtime.EntitySelector.class,
              com.google.transit.realtime.GtfsRealtime.EntitySelector.Builder.class);
    }

    public static com.google.protobuf.Parser<EntitySelector> PARSER =
        new com.google.protobuf.AbstractParser<EntitySelector>() {
          @Override
          public EntitySelector parsePartialFrom(com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new EntitySelector(input, extensionRegistry);
          }
        };

    @java.lang.Override
    public com.google.protobuf.Parser<EntitySelector> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int AGENCY_ID_FIELD_NUMBER = 1;
    private java.lang.Object agencyId_;

    /**
     * <code>optional string agency_id = 1;</code>
     *
     * <pre>
     * The values of the fields should correspond to the appropriate fields in the
     * GTFS feed.
     * At least one specifier must be given. If several are given, then the
     * matching has to apply to all the given specifiers.
     * </pre>
     */
    @Override
    public boolean hasAgencyId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }

    /**
     * <code>optional string agency_id = 1;</code>
     *
     * <pre>
     * The values of the fields should correspond to the appropriate fields in the
     * GTFS feed.
     * At least one specifier must be given. If several are given, then the
     * matching has to apply to all the given specifiers.
     * </pre>
     */
    @Override
    public java.lang.String getAgencyId() {
      java.lang.Object ref = agencyId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          agencyId_ = s;
        }
        return s;
      }
    }

    /**
     * <code>optional string agency_id = 1;</code>
     *
     * <pre>
     * The values of the fields should correspond to the appropriate fields in the
     * GTFS feed.
     * At least one specifier must be given. If several are given, then the
     * matching has to apply to all the given specifiers.
     * </pre>
     */
    @Override
    public com.google.protobuf.ByteString getAgencyIdBytes() {
      java.lang.Object ref = agencyId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        agencyId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int ROUTE_ID_FIELD_NUMBER = 2;
    private java.lang.Object routeId_;

    /**
     * <code>optional string route_id = 2;</code>
     */
    @Override
    public boolean hasRouteId() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }

    /**
     * <code>optional string route_id = 2;</code>
     */
    @Override
    public java.lang.String getRouteId() {
      java.lang.Object ref = routeId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          routeId_ = s;
        }
        return s;
      }
    }

    /**
     * <code>optional string route_id = 2;</code>
     */
    @Override
    public com.google.protobuf.ByteString getRouteIdBytes() {
      java.lang.Object ref = routeId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        routeId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int ROUTE_TYPE_FIELD_NUMBER = 3;
    private int routeType_;

    /**
     * <code>optional int32 route_type = 3;</code>
     *
     * <pre>
     * corresponds to route_type in GTFS.
     * </pre>
     */
    @Override
    public boolean hasRouteType() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }

    /**
     * <code>optional int32 route_type = 3;</code>
     *
     * <pre>
     * corresponds to route_type in GTFS.
     * </pre>
     */
    @Override
    public int getRouteType() {
      return routeType_;
    }

    public static final int TRIP_FIELD_NUMBER = 4;
    private com.google.transit.realtime.GtfsRealtime.TripDescriptor trip_;

    /**
     * <code>optional .transit_realtime.TripDescriptor trip = 4;</code>
     */
    @Override
    public boolean hasTrip() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }

    /**
     * <code>optional .transit_realtime.TripDescriptor trip = 4;</code>
     */
    @Override
    public com.google.transit.realtime.GtfsRealtime.TripDescriptor getTrip() {
      return trip_;
    }

    /**
     * <code>optional .transit_realtime.TripDescriptor trip = 4;</code>
     */
    @Override
    public com.google.transit.realtime.GtfsRealtime.TripDescriptorOrBuilder getTripOrBuilder() {
      return trip_;
    }

    public static final int STOP_ID_FIELD_NUMBER = 5;
    private java.lang.Object stopId_;

    /**
     * <code>optional string stop_id = 5;</code>
     */
    @Override
    public boolean hasStopId() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }

    /**
     * <code>optional string stop_id = 5;</code>
     */
    @Override
    public java.lang.String getStopId() {
      java.lang.Object ref = stopId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          stopId_ = s;
        }
        return s;
      }
    }

    /**
     * <code>optional string stop_id = 5;</code>
     */
    @Override
    public com.google.protobuf.ByteString getStopIdBytes() {
      java.lang.Object ref = stopId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        stopId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private void initFields() {
      agencyId_ = "";
      routeId_ = "";
      routeType_ = 0;
      trip_ = com.google.transit.realtime.GtfsRealtime.TripDescriptor.getDefaultInstance();
      stopId_ = "";
    }

    private byte memoizedIsInitialized = -1;

    @Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1)
        return true;
      if (isInitialized == 0)
        return false;

      if (hasTrip()) {
        if (!getTrip().isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      if (!extensionsAreInitialized()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    @Override
    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      getSerializedSize();
      com.google.protobuf.GeneratedMessage.ExtendableMessage<com.google.transit.realtime.GtfsRealtime.EntitySelector>.ExtensionWriter extensionWriter =
          newExtensionWriter();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getAgencyIdBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getRouteIdBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt32(3, routeType_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeMessage(4, trip_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeBytes(5, getStopIdBytes());
      }
      extensionWriter.writeUntil(2000, output);
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;

    @Override
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1)
        return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream.computeBytesSize(1, getAgencyIdBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream.computeBytesSize(2, getRouteIdBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream.computeInt32Size(3, routeType_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(4, trip_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream.computeBytesSize(5, getStopIdBytes());
      }
      size += extensionsSerializedSize();
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;

    @java.lang.Override
    protected java.lang.Object writeReplace() throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static com.google.transit.realtime.GtfsRealtime.EntitySelector parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.google.transit.realtime.GtfsRealtime.EntitySelector parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.google.transit.realtime.GtfsRealtime.EntitySelector parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.google.transit.realtime.GtfsRealtime.EntitySelector parseFrom(byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.google.transit.realtime.GtfsRealtime.EntitySelector parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return PARSER.parseFrom(input);
    }

    public static com.google.transit.realtime.GtfsRealtime.EntitySelector parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static com.google.transit.realtime.GtfsRealtime.EntitySelector parseDelimitedFrom(
        java.io.InputStream input) throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }

    public static com.google.transit.realtime.GtfsRealtime.EntitySelector parseDelimitedFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }

    public static com.google.transit.realtime.GtfsRealtime.EntitySelector parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return PARSER.parseFrom(input);
    }

    public static com.google.transit.realtime.GtfsRealtime.EntitySelector parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return Builder.create();
    }

    @Override
    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder(
        com.google.transit.realtime.GtfsRealtime.EntitySelector prototype) {
      return newBuilder().mergeFrom(prototype);
    }

    @Override
    public Builder toBuilder() {
      return newBuilder(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }

    /**
     * Protobuf type {@code transit_realtime.EntitySelector}
     *
     * <pre>
     * A selector for an entity in a GTFS feed.
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.ExtendableBuilder<com.google.transit.realtime.GtfsRealtime.EntitySelector, Builder>
        implements
        // @@protoc_insertion_point(builder_implements:transit_realtime.EntitySelector)
        com.google.transit.realtime.GtfsRealtime.EntitySelectorOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_EntitySelector_descriptor;
      }

      @Override
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
        return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_EntitySelector_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.google.transit.realtime.GtfsRealtime.EntitySelector.class,
                com.google.transit.realtime.GtfsRealtime.EntitySelector.Builder.class);
      }

      // Construct using com.google.transit.realtime.GtfsRealtime.EntitySelector.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getTripFieldBuilder();
        }
      }

      private static Builder create() {
        return new Builder();
      }

      @Override
      public Builder clear() {
        super.clear();
        agencyId_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        routeId_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        routeType_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        if (tripBuilder_ == null) {
          trip_ = com.google.transit.realtime.GtfsRealtime.TripDescriptor.getDefaultInstance();
        } else {
          tripBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000008);
        stopId_ = "";
        bitField0_ = (bitField0_ & ~0x00000010);
        return this;
      }

      @Override
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_EntitySelector_descriptor;
      }

      @Override
      public com.google.transit.realtime.GtfsRealtime.EntitySelector getDefaultInstanceForType() {
        return com.google.transit.realtime.GtfsRealtime.EntitySelector.getDefaultInstance();
      }

      @Override
      public com.google.transit.realtime.GtfsRealtime.EntitySelector build() {
        com.google.transit.realtime.GtfsRealtime.EntitySelector result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public com.google.transit.realtime.GtfsRealtime.EntitySelector buildPartial() {
        com.google.transit.realtime.GtfsRealtime.EntitySelector result =
            new com.google.transit.realtime.GtfsRealtime.EntitySelector(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.agencyId_ = agencyId_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.routeId_ = routeId_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.routeType_ = routeType_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        if (tripBuilder_ == null) {
          result.trip_ = trip_;
        } else {
          result.trip_ = tripBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.stopId_ = stopId_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.google.transit.realtime.GtfsRealtime.EntitySelector) {
          return mergeFrom((com.google.transit.realtime.GtfsRealtime.EntitySelector) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.google.transit.realtime.GtfsRealtime.EntitySelector other) {
        if (other == com.google.transit.realtime.GtfsRealtime.EntitySelector.getDefaultInstance())
          return this;
        if (other.hasAgencyId()) {
          bitField0_ |= 0x00000001;
          agencyId_ = other.agencyId_;
          onChanged();
        }
        if (other.hasRouteId()) {
          bitField0_ |= 0x00000002;
          routeId_ = other.routeId_;
          onChanged();
        }
        if (other.hasRouteType()) {
          setRouteType(other.getRouteType());
        }
        if (other.hasTrip()) {
          mergeTrip(other.getTrip());
        }
        if (other.hasStopId()) {
          bitField0_ |= 0x00000010;
          stopId_ = other.stopId_;
          onChanged();
        }
        this.mergeExtensionFields(other);
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      @Override
      public final boolean isInitialized() {
        if (hasTrip()) {
          if (!getTrip().isInitialized()) {

            return false;
          }
        }
        if (!extensionsAreInitialized()) {

          return false;
        }
        return true;
      }

      @Override
      public Builder mergeFrom(com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        com.google.transit.realtime.GtfsRealtime.EntitySelector parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (com.google.transit.realtime.GtfsRealtime.EntitySelector) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private java.lang.Object agencyId_ = "";

      /**
       * <code>optional string agency_id = 1;</code>
       *
       * <pre>
       * The values of the fields should correspond to the appropriate fields in the
       * GTFS feed.
       * At least one specifier must be given. If several are given, then the
       * matching has to apply to all the given specifiers.
       * </pre>
       */
      @Override
      public boolean hasAgencyId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }

      /**
       * <code>optional string agency_id = 1;</code>
       *
       * <pre>
       * The values of the fields should correspond to the appropriate fields in the
       * GTFS feed.
       * At least one specifier must be given. If several are given, then the
       * matching has to apply to all the given specifiers.
       * </pre>
       */
      @Override
      public java.lang.String getAgencyId() {
        java.lang.Object ref = agencyId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            agencyId_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }

      /**
       * <code>optional string agency_id = 1;</code>
       *
       * <pre>
       * The values of the fields should correspond to the appropriate fields in the
       * GTFS feed.
       * At least one specifier must be given. If several are given, then the
       * matching has to apply to all the given specifiers.
       * </pre>
       */
      @Override
      public com.google.protobuf.ByteString getAgencyIdBytes() {
        java.lang.Object ref = agencyId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          agencyId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }

      /**
       * <code>optional string agency_id = 1;</code>
       *
       * <pre>
       * The values of the fields should correspond to the appropriate fields in the
       * GTFS feed.
       * At least one specifier must be given. If several are given, then the
       * matching has to apply to all the given specifiers.
       * </pre>
       */
      public Builder setAgencyId(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        agencyId_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>optional string agency_id = 1;</code>
       *
       * <pre>
       * The values of the fields should correspond to the appropriate fields in the
       * GTFS feed.
       * At least one specifier must be given. If several are given, then the
       * matching has to apply to all the given specifiers.
       * </pre>
       */
      public Builder clearAgencyId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        agencyId_ = getDefaultInstance().getAgencyId();
        onChanged();
        return this;
      }

      /**
       * <code>optional string agency_id = 1;</code>
       *
       * <pre>
       * The values of the fields should correspond to the appropriate fields in the
       * GTFS feed.
       * At least one specifier must be given. If several are given, then the
       * matching has to apply to all the given specifiers.
       * </pre>
       */
      public Builder setAgencyIdBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        agencyId_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object routeId_ = "";

      /**
       * <code>optional string route_id = 2;</code>
       */
      @Override
      public boolean hasRouteId() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }

      /**
       * <code>optional string route_id = 2;</code>
       */
      @Override
      public java.lang.String getRouteId() {
        java.lang.Object ref = routeId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            routeId_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }

      /**
       * <code>optional string route_id = 2;</code>
       */
      @Override
      public com.google.protobuf.ByteString getRouteIdBytes() {
        java.lang.Object ref = routeId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          routeId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }

      /**
       * <code>optional string route_id = 2;</code>
       */
      public Builder setRouteId(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        routeId_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>optional string route_id = 2;</code>
       */
      public Builder clearRouteId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        routeId_ = getDefaultInstance().getRouteId();
        onChanged();
        return this;
      }

      /**
       * <code>optional string route_id = 2;</code>
       */
      public Builder setRouteIdBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        routeId_ = value;
        onChanged();
        return this;
      }

      private int routeType_;

      /**
       * <code>optional int32 route_type = 3;</code>
       *
       * <pre>
       * corresponds to route_type in GTFS.
       * </pre>
       */
      @Override
      public boolean hasRouteType() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }

      /**
       * <code>optional int32 route_type = 3;</code>
       *
       * <pre>
       * corresponds to route_type in GTFS.
       * </pre>
       */
      @Override
      public int getRouteType() {
        return routeType_;
      }

      /**
       * <code>optional int32 route_type = 3;</code>
       *
       * <pre>
       * corresponds to route_type in GTFS.
       * </pre>
       */
      public Builder setRouteType(int value) {
        bitField0_ |= 0x00000004;
        routeType_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>optional int32 route_type = 3;</code>
       *
       * <pre>
       * corresponds to route_type in GTFS.
       * </pre>
       */
      public Builder clearRouteType() {
        bitField0_ = (bitField0_ & ~0x00000004);
        routeType_ = 0;
        onChanged();
        return this;
      }

      private com.google.transit.realtime.GtfsRealtime.TripDescriptor trip_ =
          com.google.transit.realtime.GtfsRealtime.TripDescriptor.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<com.google.transit.realtime.GtfsRealtime.TripDescriptor, com.google.transit.realtime.GtfsRealtime.TripDescriptor.Builder, com.google.transit.realtime.GtfsRealtime.TripDescriptorOrBuilder> tripBuilder_;

      /**
       * <code>optional .transit_realtime.TripDescriptor trip = 4;</code>
       */
      @Override
      public boolean hasTrip() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }

      /**
       * <code>optional .transit_realtime.TripDescriptor trip = 4;</code>
       */
      @Override
      public com.google.transit.realtime.GtfsRealtime.TripDescriptor getTrip() {
        if (tripBuilder_ == null) {
          return trip_;
        } else {
          return tripBuilder_.getMessage();
        }
      }

      /**
       * <code>optional .transit_realtime.TripDescriptor trip = 4;</code>
       */
      public Builder setTrip(com.google.transit.realtime.GtfsRealtime.TripDescriptor value) {
        if (tripBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          trip_ = value;
          onChanged();
        } else {
          tripBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000008;
        return this;
      }

      /**
       * <code>optional .transit_realtime.TripDescriptor trip = 4;</code>
       */
      public Builder setTrip(
          com.google.transit.realtime.GtfsRealtime.TripDescriptor.Builder builderForValue) {
        if (tripBuilder_ == null) {
          trip_ = builderForValue.build();
          onChanged();
        } else {
          tripBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000008;
        return this;
      }

      /**
       * <code>optional .transit_realtime.TripDescriptor trip = 4;</code>
       */
      public Builder mergeTrip(com.google.transit.realtime.GtfsRealtime.TripDescriptor value) {
        if (tripBuilder_ == null) {
          if (((bitField0_ & 0x00000008) == 0x00000008)
              && trip_ != com.google.transit.realtime.GtfsRealtime.TripDescriptor
                  .getDefaultInstance()) {
            trip_ = com.google.transit.realtime.GtfsRealtime.TripDescriptor.newBuilder(trip_)
                .mergeFrom(value).buildPartial();
          } else {
            trip_ = value;
          }
          onChanged();
        } else {
          tripBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000008;
        return this;
      }

      /**
       * <code>optional .transit_realtime.TripDescriptor trip = 4;</code>
       */
      public Builder clearTrip() {
        if (tripBuilder_ == null) {
          trip_ = com.google.transit.realtime.GtfsRealtime.TripDescriptor.getDefaultInstance();
          onChanged();
        } else {
          tripBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }

      /**
       * <code>optional .transit_realtime.TripDescriptor trip = 4;</code>
       */
      public com.google.transit.realtime.GtfsRealtime.TripDescriptor.Builder getTripBuilder() {
        bitField0_ |= 0x00000008;
        onChanged();
        return getTripFieldBuilder().getBuilder();
      }

      /**
       * <code>optional .transit_realtime.TripDescriptor trip = 4;</code>
       */
      @Override
      public com.google.transit.realtime.GtfsRealtime.TripDescriptorOrBuilder getTripOrBuilder() {
        if (tripBuilder_ != null) {
          return tripBuilder_.getMessageOrBuilder();
        } else {
          return trip_;
        }
      }

      /**
       * <code>optional .transit_realtime.TripDescriptor trip = 4;</code>
       */
      private com.google.protobuf.SingleFieldBuilder<com.google.transit.realtime.GtfsRealtime.TripDescriptor, com.google.transit.realtime.GtfsRealtime.TripDescriptor.Builder, com.google.transit.realtime.GtfsRealtime.TripDescriptorOrBuilder> getTripFieldBuilder() {
        if (tripBuilder_ == null) {
          tripBuilder_ =
              new com.google.protobuf.SingleFieldBuilder<com.google.transit.realtime.GtfsRealtime.TripDescriptor, com.google.transit.realtime.GtfsRealtime.TripDescriptor.Builder, com.google.transit.realtime.GtfsRealtime.TripDescriptorOrBuilder>(
                  getTrip(), getParentForChildren(), isClean());
          trip_ = null;
        }
        return tripBuilder_;
      }

      private java.lang.Object stopId_ = "";

      /**
       * <code>optional string stop_id = 5;</code>
       */
      @Override
      public boolean hasStopId() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }

      /**
       * <code>optional string stop_id = 5;</code>
       */
      @Override
      public java.lang.String getStopId() {
        java.lang.Object ref = stopId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            stopId_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }

      /**
       * <code>optional string stop_id = 5;</code>
       */
      @Override
      public com.google.protobuf.ByteString getStopIdBytes() {
        java.lang.Object ref = stopId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          stopId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }

      /**
       * <code>optional string stop_id = 5;</code>
       */
      public Builder setStopId(java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000010;
        stopId_ = value;
        onChanged();
        return this;
      }

      /**
       * <code>optional string stop_id = 5;</code>
       */
      public Builder clearStopId() {
        bitField0_ = (bitField0_ & ~0x00000010);
        stopId_ = getDefaultInstance().getStopId();
        onChanged();
        return this;
      }

      /**
       * <code>optional string stop_id = 5;</code>
       */
      public Builder setStopIdBytes(com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000010;
        stopId_ = value;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:transit_realtime.EntitySelector)
    }

    static {
      defaultInstance = new EntitySelector(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:transit_realtime.EntitySelector)
  }

  public interface TranslatedStringOrBuilder extends
      // @@protoc_insertion_point(interface_extends:transit_realtime.TranslatedString)
      com.google.protobuf.GeneratedMessage.ExtendableMessageOrBuilder<TranslatedString> {

    /**
     * <code>repeated .transit_realtime.TranslatedString.Translation translation = 1;</code>
     *
     * <pre>
     * At least one translation must be provided.
     * </pre>
     */
    java.util.List<com.google.transit.realtime.GtfsRealtime.TranslatedString.Translation> getTranslationList();

    /**
     * <code>repeated .transit_realtime.TranslatedString.Translation translation = 1;</code>
     *
     * <pre>
     * At least one translation must be provided.
     * </pre>
     */
    com.google.transit.realtime.GtfsRealtime.TranslatedString.Translation getTranslation(int index);

    /**
     * <code>repeated .transit_realtime.TranslatedString.Translation translation = 1;</code>
     *
     * <pre>
     * At least one translation must be provided.
     * </pre>
     */
    int getTranslationCount();

    /**
     * <code>repeated .transit_realtime.TranslatedString.Translation translation = 1;</code>
     *
     * <pre>
     * At least one translation must be provided.
     * </pre>
     */
    java.util.List<? extends com.google.transit.realtime.GtfsRealtime.TranslatedString.TranslationOrBuilder> getTranslationOrBuilderList();

    /**
     * <code>repeated .transit_realtime.TranslatedString.Translation translation = 1;</code>
     *
     * <pre>
     * At least one translation must be provided.
     * </pre>
     */
    com.google.transit.realtime.GtfsRealtime.TranslatedString.TranslationOrBuilder getTranslationOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code transit_realtime.TranslatedString}
   *
   * <pre>
   * An internationalized message containing per-language versions of a snippet of
   * text or a URL.
   * One of the strings from a message will be picked up. The resolution proceeds
   * as follows:
   * 1. If the UI language matches the language code of a translation,
   *    the first matching translation is picked.
   * 2. If a default UI language (e.g., English) matches the language code of a
   *    translation, the first matching translation is picked.
   * 3. If some translation has an unspecified language code, that translation is
   *    picked.
   * </pre>
   */
  public static final class TranslatedString
      extends com.google.protobuf.GeneratedMessage.ExtendableMessage<TranslatedString> implements
      // @@protoc_insertion_point(message_implements:transit_realtime.TranslatedString)
      TranslatedStringOrBuilder {
    // Use TranslatedString.newBuilder() to construct.
    private TranslatedString(
        com.google.protobuf.GeneratedMessage.ExtendableBuilder<com.google.transit.realtime.GtfsRealtime.TranslatedString, ?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }

    private TranslatedString(boolean noInit) {
      this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }

    private static final TranslatedString defaultInstance;

    public static TranslatedString getDefaultInstance() {
      return defaultInstance;
    }

    @Override
    public TranslatedString getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
      return this.unknownFields;
    }

    private TranslatedString(com.google.protobuf.CodedInputStream input,
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
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                translation_ =
                    new java.util.ArrayList<com.google.transit.realtime.GtfsRealtime.TranslatedString.Translation>();
                mutable_bitField0_ |= 0x00000001;
              }
              translation_.add(input.readMessage(
                  com.google.transit.realtime.GtfsRealtime.TranslatedString.Translation.PARSER,
                  extensionRegistry));
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e.getMessage())
            .setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
          translation_ = java.util.Collections.unmodifiableList(translation_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_TranslatedString_descriptor;
    }

    @Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
      return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_TranslatedString_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.transit.realtime.GtfsRealtime.TranslatedString.class,
              com.google.transit.realtime.GtfsRealtime.TranslatedString.Builder.class);
    }

    public static com.google.protobuf.Parser<TranslatedString> PARSER =
        new com.google.protobuf.AbstractParser<TranslatedString>() {
          @Override
          public TranslatedString parsePartialFrom(com.google.protobuf.CodedInputStream input,
              com.google.protobuf.ExtensionRegistryLite extensionRegistry)
              throws com.google.protobuf.InvalidProtocolBufferException {
            return new TranslatedString(input, extensionRegistry);
          }
        };

    @java.lang.Override
    public com.google.protobuf.Parser<TranslatedString> getParserForType() {
      return PARSER;
    }

    public interface TranslationOrBuilder extends
        // @@protoc_insertion_point(interface_extends:transit_realtime.TranslatedString.Translation)
        com.google.protobuf.GeneratedMessage.ExtendableMessageOrBuilder<Translation> {

      /**
       * <code>required string text = 1;</code>
       *
       * <pre>
       * A UTF-8 string containing the message.
       * </pre>
       */
      boolean hasText();

      /**
       * <code>required string text = 1;</code>
       *
       * <pre>
       * A UTF-8 string containing the message.
       * </pre>
       */
      java.lang.String getText();

      /**
       * <code>required string text = 1;</code>
       *
       * <pre>
       * A UTF-8 string containing the message.
       * </pre>
       */
      com.google.protobuf.ByteString getTextBytes();

      /**
       * <code>optional string language = 2;</code>
       *
       * <pre>
       * BCP-47 language code. Can be omitted if the language is unknown or if
       * no i18n is done at all for the feed. At most one translation is
       * allowed to have an unspecified language tag.
       * </pre>
       */
      boolean hasLanguage();

      /**
       * <code>optional string language = 2;</code>
       *
       * <pre>
       * BCP-47 language code. Can be omitted if the language is unknown or if
       * no i18n is done at all for the feed. At most one translation is
       * allowed to have an unspecified language tag.
       * </pre>
       */
      java.lang.String getLanguage();

      /**
       * <code>optional string language = 2;</code>
       *
       * <pre>
       * BCP-47 language code. Can be omitted if the language is unknown or if
       * no i18n is done at all for the feed. At most one translation is
       * allowed to have an unspecified language tag.
       * </pre>
       */
      com.google.protobuf.ByteString getLanguageBytes();
    }
    /**
     * Protobuf type {@code transit_realtime.TranslatedString.Translation}
     */
    public static final class Translation
        extends com.google.protobuf.GeneratedMessage.ExtendableMessage<Translation> implements
        // @@protoc_insertion_point(message_implements:transit_realtime.TranslatedString.Translation)
        TranslationOrBuilder {
      // Use Translation.newBuilder() to construct.
      private Translation(
          com.google.protobuf.GeneratedMessage.ExtendableBuilder<com.google.transit.realtime.GtfsRealtime.TranslatedString.Translation, ?> builder) {
        super(builder);
        this.unknownFields = builder.getUnknownFields();
      }

      private Translation(boolean noInit) {
        this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance();
      }

      private static final Translation defaultInstance;

      public static Translation getDefaultInstance() {
        return defaultInstance;
      }

      @Override
      public Translation getDefaultInstanceForType() {
        return defaultInstance;
      }

      private final com.google.protobuf.UnknownFieldSet unknownFields;

      @java.lang.Override
      public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
      }

      private Translation(com.google.protobuf.CodedInputStream input,
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
                if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                  done = true;
                }
                break;
              }
              case 10: {
                com.google.protobuf.ByteString bs = input.readBytes();
                bitField0_ |= 0x00000001;
                text_ = bs;
                break;
              }
              case 18: {
                com.google.protobuf.ByteString bs = input.readBytes();
                bitField0_ |= 0x00000002;
                language_ = bs;
                break;
              }
            }
          }
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(this);
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e.getMessage())
              .setUnfinishedMessage(this);
        } finally {
          this.unknownFields = unknownFields.build();
          makeExtensionsImmutable();
        }
      }

      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_TranslatedString_Translation_descriptor;
      }

      @Override
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
        return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_TranslatedString_Translation_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.google.transit.realtime.GtfsRealtime.TranslatedString.Translation.class,
                com.google.transit.realtime.GtfsRealtime.TranslatedString.Translation.Builder.class);
      }

      public static com.google.protobuf.Parser<Translation> PARSER =
          new com.google.protobuf.AbstractParser<Translation>() {
            @Override
            public Translation parsePartialFrom(com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
              return new Translation(input, extensionRegistry);
            }
          };

      @java.lang.Override
      public com.google.protobuf.Parser<Translation> getParserForType() {
        return PARSER;
      }

      private int bitField0_;
      public static final int TEXT_FIELD_NUMBER = 1;
      private java.lang.Object text_;

      /**
       * <code>required string text = 1;</code>
       *
       * <pre>
       * A UTF-8 string containing the message.
       * </pre>
       */
      @Override
      public boolean hasText() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }

      /**
       * <code>required string text = 1;</code>
       *
       * <pre>
       * A UTF-8 string containing the message.
       * </pre>
       */
      @Override
      public java.lang.String getText() {
        java.lang.Object ref = text_;
        if (ref instanceof java.lang.String) {
          return (java.lang.String) ref;
        } else {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            text_ = s;
          }
          return s;
        }
      }

      /**
       * <code>required string text = 1;</code>
       *
       * <pre>
       * A UTF-8 string containing the message.
       * </pre>
       */
      @Override
      public com.google.protobuf.ByteString getTextBytes() {
        java.lang.Object ref = text_;
        if (ref instanceof java.lang.String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          text_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }

      public static final int LANGUAGE_FIELD_NUMBER = 2;
      private java.lang.Object language_;

      /**
       * <code>optional string language = 2;</code>
       *
       * <pre>
       * BCP-47 language code. Can be omitted if the language is unknown or if
       * no i18n is done at all for the feed. At most one translation is
       * allowed to have an unspecified language tag.
       * </pre>
       */
      @Override
      public boolean hasLanguage() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }

      /**
       * <code>optional string language = 2;</code>
       *
       * <pre>
       * BCP-47 language code. Can be omitted if the language is unknown or if
       * no i18n is done at all for the feed. At most one translation is
       * allowed to have an unspecified language tag.
       * </pre>
       */
      @Override
      public java.lang.String getLanguage() {
        java.lang.Object ref = language_;
        if (ref instanceof java.lang.String) {
          return (java.lang.String) ref;
        } else {
          com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            language_ = s;
          }
          return s;
        }
      }

      /**
       * <code>optional string language = 2;</code>
       *
       * <pre>
       * BCP-47 language code. Can be omitted if the language is unknown or if
       * no i18n is done at all for the feed. At most one translation is
       * allowed to have an unspecified language tag.
       * </pre>
       */
      @Override
      public com.google.protobuf.ByteString getLanguageBytes() {
        java.lang.Object ref = language_;
        if (ref instanceof java.lang.String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
          language_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }

      private void initFields() {
        text_ = "";
        language_ = "";
      }

      private byte memoizedIsInitialized = -1;

      @Override
      public final boolean isInitialized() {
        byte isInitialized = memoizedIsInitialized;
        if (isInitialized == 1)
          return true;
        if (isInitialized == 0)
          return false;

        if (!hasText()) {
          memoizedIsInitialized = 0;
          return false;
        }
        if (!extensionsAreInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
        memoizedIsInitialized = 1;
        return true;
      }

      @Override
      public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
        getSerializedSize();
        com.google.protobuf.GeneratedMessage.ExtendableMessage<com.google.transit.realtime.GtfsRealtime.TranslatedString.Translation>.ExtensionWriter extensionWriter =
            newExtensionWriter();
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          output.writeBytes(1, getTextBytes());
        }
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          output.writeBytes(2, getLanguageBytes());
        }
        extensionWriter.writeUntil(2000, output);
        getUnknownFields().writeTo(output);
      }

      private int memoizedSerializedSize = -1;

      @Override
      public int getSerializedSize() {
        int size = memoizedSerializedSize;
        if (size != -1)
          return size;

        size = 0;
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          size += com.google.protobuf.CodedOutputStream.computeBytesSize(1, getTextBytes());
        }
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          size += com.google.protobuf.CodedOutputStream.computeBytesSize(2, getLanguageBytes());
        }
        size += extensionsSerializedSize();
        size += getUnknownFields().getSerializedSize();
        memoizedSerializedSize = size;
        return size;
      }

      private static final long serialVersionUID = 0L;

      @java.lang.Override
      protected java.lang.Object writeReplace() throws java.io.ObjectStreamException {
        return super.writeReplace();
      }

      public static com.google.transit.realtime.GtfsRealtime.TranslatedString.Translation parseFrom(
          com.google.protobuf.ByteString data)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }

      public static com.google.transit.realtime.GtfsRealtime.TranslatedString.Translation parseFrom(
          com.google.protobuf.ByteString data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }

      public static com.google.transit.realtime.GtfsRealtime.TranslatedString.Translation parseFrom(
          byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
      }

      public static com.google.transit.realtime.GtfsRealtime.TranslatedString.Translation parseFrom(
          byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
      }

      public static com.google.transit.realtime.GtfsRealtime.TranslatedString.Translation parseFrom(
          java.io.InputStream input) throws java.io.IOException {
        return PARSER.parseFrom(input);
      }

      public static com.google.transit.realtime.GtfsRealtime.TranslatedString.Translation parseFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        return PARSER.parseFrom(input, extensionRegistry);
      }

      public static com.google.transit.realtime.GtfsRealtime.TranslatedString.Translation parseDelimitedFrom(
          java.io.InputStream input) throws java.io.IOException {
        return PARSER.parseDelimitedFrom(input);
      }

      public static com.google.transit.realtime.GtfsRealtime.TranslatedString.Translation parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        return PARSER.parseDelimitedFrom(input, extensionRegistry);
      }

      public static com.google.transit.realtime.GtfsRealtime.TranslatedString.Translation parseFrom(
          com.google.protobuf.CodedInputStream input) throws java.io.IOException {
        return PARSER.parseFrom(input);
      }

      public static com.google.transit.realtime.GtfsRealtime.TranslatedString.Translation parseFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        return PARSER.parseFrom(input, extensionRegistry);
      }

      public static Builder newBuilder() {
        return Builder.create();
      }

      @Override
      public Builder newBuilderForType() {
        return newBuilder();
      }

      public static Builder newBuilder(
          com.google.transit.realtime.GtfsRealtime.TranslatedString.Translation prototype) {
        return newBuilder().mergeFrom(prototype);
      }

      @Override
      public Builder toBuilder() {
        return newBuilder(this);
      }

      @java.lang.Override
      protected Builder newBuilderForType(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        Builder builder = new Builder(parent);
        return builder;
      }

      /**
       * Protobuf type {@code transit_realtime.TranslatedString.Translation}
       */
      public static final class Builder extends
          com.google.protobuf.GeneratedMessage.ExtendableBuilder<com.google.transit.realtime.GtfsRealtime.TranslatedString.Translation, Builder>
          implements
          // @@protoc_insertion_point(builder_implements:transit_realtime.TranslatedString.Translation)
          com.google.transit.realtime.GtfsRealtime.TranslatedString.TranslationOrBuilder {
        public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
          return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_TranslatedString_Translation_descriptor;
        }

        @Override
        protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
          return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_TranslatedString_Translation_fieldAccessorTable
              .ensureFieldAccessorsInitialized(
                  com.google.transit.realtime.GtfsRealtime.TranslatedString.Translation.class,
                  com.google.transit.realtime.GtfsRealtime.TranslatedString.Translation.Builder.class);
        }

        // Construct using
        // com.google.transit.realtime.GtfsRealtime.TranslatedString.Translation.newBuilder()
        private Builder() {
          maybeForceBuilderInitialization();
        }

        private Builder(com.google.protobuf.GeneratedMessage.BuilderParent parent) {
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

        @Override
        public Builder clear() {
          super.clear();
          text_ = "";
          bitField0_ = (bitField0_ & ~0x00000001);
          language_ = "";
          bitField0_ = (bitField0_ & ~0x00000002);
          return this;
        }

        @Override
        public Builder clone() {
          return create().mergeFrom(buildPartial());
        }

        @Override
        public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
          return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_TranslatedString_Translation_descriptor;
        }

        @Override
        public com.google.transit.realtime.GtfsRealtime.TranslatedString.Translation getDefaultInstanceForType() {
          return com.google.transit.realtime.GtfsRealtime.TranslatedString.Translation
              .getDefaultInstance();
        }

        @Override
        public com.google.transit.realtime.GtfsRealtime.TranslatedString.Translation build() {
          com.google.transit.realtime.GtfsRealtime.TranslatedString.Translation result =
              buildPartial();
          if (!result.isInitialized()) {
            throw newUninitializedMessageException(result);
          }
          return result;
        }

        @Override
        public com.google.transit.realtime.GtfsRealtime.TranslatedString.Translation buildPartial() {
          com.google.transit.realtime.GtfsRealtime.TranslatedString.Translation result =
              new com.google.transit.realtime.GtfsRealtime.TranslatedString.Translation(this);
          int from_bitField0_ = bitField0_;
          int to_bitField0_ = 0;
          if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
            to_bitField0_ |= 0x00000001;
          }
          result.text_ = text_;
          if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
            to_bitField0_ |= 0x00000002;
          }
          result.language_ = language_;
          result.bitField0_ = to_bitField0_;
          onBuilt();
          return result;
        }

        @Override
        public Builder mergeFrom(com.google.protobuf.Message other) {
          if (other instanceof com.google.transit.realtime.GtfsRealtime.TranslatedString.Translation) {
            return mergeFrom(
                (com.google.transit.realtime.GtfsRealtime.TranslatedString.Translation) other);
          } else {
            super.mergeFrom(other);
            return this;
          }
        }

        public Builder mergeFrom(
            com.google.transit.realtime.GtfsRealtime.TranslatedString.Translation other) {
          if (other == com.google.transit.realtime.GtfsRealtime.TranslatedString.Translation
              .getDefaultInstance())
            return this;
          if (other.hasText()) {
            bitField0_ |= 0x00000001;
            text_ = other.text_;
            onChanged();
          }
          if (other.hasLanguage()) {
            bitField0_ |= 0x00000002;
            language_ = other.language_;
            onChanged();
          }
          this.mergeExtensionFields(other);
          this.mergeUnknownFields(other.getUnknownFields());
          return this;
        }

        @Override
        public final boolean isInitialized() {
          if (!hasText()) {

            return false;
          }
          if (!extensionsAreInitialized()) {

            return false;
          }
          return true;
        }

        @Override
        public Builder mergeFrom(com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
          com.google.transit.realtime.GtfsRealtime.TranslatedString.Translation parsedMessage =
              null;
          try {
            parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            parsedMessage =
                (com.google.transit.realtime.GtfsRealtime.TranslatedString.Translation) e
                    .getUnfinishedMessage();
            throw e;
          } finally {
            if (parsedMessage != null) {
              mergeFrom(parsedMessage);
            }
          }
          return this;
        }

        private int bitField0_;

        private java.lang.Object text_ = "";

        /**
         * <code>required string text = 1;</code>
         *
         * <pre>
         * A UTF-8 string containing the message.
         * </pre>
         */
        @Override
        public boolean hasText() {
          return ((bitField0_ & 0x00000001) == 0x00000001);
        }

        /**
         * <code>required string text = 1;</code>
         *
         * <pre>
         * A UTF-8 string containing the message.
         * </pre>
         */
        @Override
        public java.lang.String getText() {
          java.lang.Object ref = text_;
          if (!(ref instanceof java.lang.String)) {
            com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
            java.lang.String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
              text_ = s;
            }
            return s;
          } else {
            return (java.lang.String) ref;
          }
        }

        /**
         * <code>required string text = 1;</code>
         *
         * <pre>
         * A UTF-8 string containing the message.
         * </pre>
         */
        @Override
        public com.google.protobuf.ByteString getTextBytes() {
          java.lang.Object ref = text_;
          if (ref instanceof String) {
            com.google.protobuf.ByteString b =
                com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
            text_ = b;
            return b;
          } else {
            return (com.google.protobuf.ByteString) ref;
          }
        }

        /**
         * <code>required string text = 1;</code>
         *
         * <pre>
         * A UTF-8 string containing the message.
         * </pre>
         */
        public Builder setText(java.lang.String value) {
          if (value == null) {
            throw new NullPointerException();
          }
          bitField0_ |= 0x00000001;
          text_ = value;
          onChanged();
          return this;
        }

        /**
         * <code>required string text = 1;</code>
         *
         * <pre>
         * A UTF-8 string containing the message.
         * </pre>
         */
        public Builder clearText() {
          bitField0_ = (bitField0_ & ~0x00000001);
          text_ = getDefaultInstance().getText();
          onChanged();
          return this;
        }

        /**
         * <code>required string text = 1;</code>
         *
         * <pre>
         * A UTF-8 string containing the message.
         * </pre>
         */
        public Builder setTextBytes(com.google.protobuf.ByteString value) {
          if (value == null) {
            throw new NullPointerException();
          }
          bitField0_ |= 0x00000001;
          text_ = value;
          onChanged();
          return this;
        }

        private java.lang.Object language_ = "";

        /**
         * <code>optional string language = 2;</code>
         *
         * <pre>
         * BCP-47 language code. Can be omitted if the language is unknown or if
         * no i18n is done at all for the feed. At most one translation is
         * allowed to have an unspecified language tag.
         * </pre>
         */
        @Override
        public boolean hasLanguage() {
          return ((bitField0_ & 0x00000002) == 0x00000002);
        }

        /**
         * <code>optional string language = 2;</code>
         *
         * <pre>
         * BCP-47 language code. Can be omitted if the language is unknown or if
         * no i18n is done at all for the feed. At most one translation is
         * allowed to have an unspecified language tag.
         * </pre>
         */
        @Override
        public java.lang.String getLanguage() {
          java.lang.Object ref = language_;
          if (!(ref instanceof java.lang.String)) {
            com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
            java.lang.String s = bs.toStringUtf8();
            if (bs.isValidUtf8()) {
              language_ = s;
            }
            return s;
          } else {
            return (java.lang.String) ref;
          }
        }

        /**
         * <code>optional string language = 2;</code>
         *
         * <pre>
         * BCP-47 language code. Can be omitted if the language is unknown or if
         * no i18n is done at all for the feed. At most one translation is
         * allowed to have an unspecified language tag.
         * </pre>
         */
        @Override
        public com.google.protobuf.ByteString getLanguageBytes() {
          java.lang.Object ref = language_;
          if (ref instanceof String) {
            com.google.protobuf.ByteString b =
                com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
            language_ = b;
            return b;
          } else {
            return (com.google.protobuf.ByteString) ref;
          }
        }

        /**
         * <code>optional string language = 2;</code>
         *
         * <pre>
         * BCP-47 language code. Can be omitted if the language is unknown or if
         * no i18n is done at all for the feed. At most one translation is
         * allowed to have an unspecified language tag.
         * </pre>
         */
        public Builder setLanguage(java.lang.String value) {
          if (value == null) {
            throw new NullPointerException();
          }
          bitField0_ |= 0x00000002;
          language_ = value;
          onChanged();
          return this;
        }

        /**
         * <code>optional string language = 2;</code>
         *
         * <pre>
         * BCP-47 language code. Can be omitted if the language is unknown or if
         * no i18n is done at all for the feed. At most one translation is
         * allowed to have an unspecified language tag.
         * </pre>
         */
        public Builder clearLanguage() {
          bitField0_ = (bitField0_ & ~0x00000002);
          language_ = getDefaultInstance().getLanguage();
          onChanged();
          return this;
        }

        /**
         * <code>optional string language = 2;</code>
         *
         * <pre>
         * BCP-47 language code. Can be omitted if the language is unknown or if
         * no i18n is done at all for the feed. At most one translation is
         * allowed to have an unspecified language tag.
         * </pre>
         */
        public Builder setLanguageBytes(com.google.protobuf.ByteString value) {
          if (value == null) {
            throw new NullPointerException();
          }
          bitField0_ |= 0x00000002;
          language_ = value;
          onChanged();
          return this;
        }

        // @@protoc_insertion_point(builder_scope:transit_realtime.TranslatedString.Translation)
      }

      static {
        defaultInstance = new Translation(true);
        defaultInstance.initFields();
      }

      // @@protoc_insertion_point(class_scope:transit_realtime.TranslatedString.Translation)
    }

    public static final int TRANSLATION_FIELD_NUMBER = 1;
    private java.util.List<com.google.transit.realtime.GtfsRealtime.TranslatedString.Translation> translation_;

    /**
     * <code>repeated .transit_realtime.TranslatedString.Translation translation = 1;</code>
     *
     * <pre>
     * At least one translation must be provided.
     * </pre>
     */
    @Override
    public java.util.List<com.google.transit.realtime.GtfsRealtime.TranslatedString.Translation> getTranslationList() {
      return translation_;
    }

    /**
     * <code>repeated .transit_realtime.TranslatedString.Translation translation = 1;</code>
     *
     * <pre>
     * At least one translation must be provided.
     * </pre>
     */
    @Override
    public java.util.List<? extends com.google.transit.realtime.GtfsRealtime.TranslatedString.TranslationOrBuilder> getTranslationOrBuilderList() {
      return translation_;
    }

    /**
     * <code>repeated .transit_realtime.TranslatedString.Translation translation = 1;</code>
     *
     * <pre>
     * At least one translation must be provided.
     * </pre>
     */
    @Override
    public int getTranslationCount() {
      return translation_.size();
    }

    /**
     * <code>repeated .transit_realtime.TranslatedString.Translation translation = 1;</code>
     *
     * <pre>
     * At least one translation must be provided.
     * </pre>
     */
    @Override
    public com.google.transit.realtime.GtfsRealtime.TranslatedString.Translation getTranslation(
        int index) {
      return translation_.get(index);
    }

    /**
     * <code>repeated .transit_realtime.TranslatedString.Translation translation = 1;</code>
     *
     * <pre>
     * At least one translation must be provided.
     * </pre>
     */
    @Override
    public com.google.transit.realtime.GtfsRealtime.TranslatedString.TranslationOrBuilder getTranslationOrBuilder(
        int index) {
      return translation_.get(index);
    }

    private void initFields() {
      translation_ = java.util.Collections.emptyList();
    }

    private byte memoizedIsInitialized = -1;

    @Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1)
        return true;
      if (isInitialized == 0)
        return false;

      for (int i = 0; i < getTranslationCount(); i++) {
        if (!getTranslation(i).isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      if (!extensionsAreInitialized()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    @Override
    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
      getSerializedSize();
      com.google.protobuf.GeneratedMessage.ExtendableMessage<com.google.transit.realtime.GtfsRealtime.TranslatedString>.ExtensionWriter extensionWriter =
          newExtensionWriter();
      for (int i = 0; i < translation_.size(); i++) {
        output.writeMessage(1, translation_.get(i));
      }
      extensionWriter.writeUntil(2000, output);
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;

    @Override
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1)
        return size;

      size = 0;
      for (int i = 0; i < translation_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, translation_.get(i));
      }
      size += extensionsSerializedSize();
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;

    @java.lang.Override
    protected java.lang.Object writeReplace() throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static com.google.transit.realtime.GtfsRealtime.TranslatedString parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.google.transit.realtime.GtfsRealtime.TranslatedString parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.google.transit.realtime.GtfsRealtime.TranslatedString parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }

    public static com.google.transit.realtime.GtfsRealtime.TranslatedString parseFrom(byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.google.transit.realtime.GtfsRealtime.TranslatedString parseFrom(
        java.io.InputStream input) throws java.io.IOException {
      return PARSER.parseFrom(input);
    }

    public static com.google.transit.realtime.GtfsRealtime.TranslatedString parseFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static com.google.transit.realtime.GtfsRealtime.TranslatedString parseDelimitedFrom(
        java.io.InputStream input) throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }

    public static com.google.transit.realtime.GtfsRealtime.TranslatedString parseDelimitedFrom(
        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }

    public static com.google.transit.realtime.GtfsRealtime.TranslatedString parseFrom(
        com.google.protobuf.CodedInputStream input) throws java.io.IOException {
      return PARSER.parseFrom(input);
    }

    public static com.google.transit.realtime.GtfsRealtime.TranslatedString parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return Builder.create();
    }

    @Override
    public Builder newBuilderForType() {
      return newBuilder();
    }

    public static Builder newBuilder(
        com.google.transit.realtime.GtfsRealtime.TranslatedString prototype) {
      return newBuilder().mergeFrom(prototype);
    }

    @Override
    public Builder toBuilder() {
      return newBuilder(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }

    /**
     * Protobuf type {@code transit_realtime.TranslatedString}
     *
     * <pre>
     * An internationalized message containing per-language versions of a snippet of
     * text or a URL.
     * One of the strings from a message will be picked up. The resolution proceeds
     * as follows:
     * 1. If the UI language matches the language code of a translation,
     *    the first matching translation is picked.
     * 2. If a default UI language (e.g., English) matches the language code of a
     *    translation, the first matching translation is picked.
     * 3. If some translation has an unspecified language code, that translation is
     *    picked.
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.ExtendableBuilder<com.google.transit.realtime.GtfsRealtime.TranslatedString, Builder>
        implements
        // @@protoc_insertion_point(builder_implements:transit_realtime.TranslatedString)
        com.google.transit.realtime.GtfsRealtime.TranslatedStringOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_TranslatedString_descriptor;
      }

      @Override
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
        return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_TranslatedString_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.google.transit.realtime.GtfsRealtime.TranslatedString.class,
                com.google.transit.realtime.GtfsRealtime.TranslatedString.Builder.class);
      }

      // Construct using com.google.transit.realtime.GtfsRealtime.TranslatedString.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getTranslationFieldBuilder();
        }
      }

      private static Builder create() {
        return new Builder();
      }

      @Override
      public Builder clear() {
        super.clear();
        if (translationBuilder_ == null) {
          translation_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          translationBuilder_.clear();
        }
        return this;
      }

      @Override
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
        return com.google.transit.realtime.GtfsRealtime.internal_static_transit_realtime_TranslatedString_descriptor;
      }

      @Override
      public com.google.transit.realtime.GtfsRealtime.TranslatedString getDefaultInstanceForType() {
        return com.google.transit.realtime.GtfsRealtime.TranslatedString.getDefaultInstance();
      }

      @Override
      public com.google.transit.realtime.GtfsRealtime.TranslatedString build() {
        com.google.transit.realtime.GtfsRealtime.TranslatedString result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public com.google.transit.realtime.GtfsRealtime.TranslatedString buildPartial() {
        com.google.transit.realtime.GtfsRealtime.TranslatedString result =
            new com.google.transit.realtime.GtfsRealtime.TranslatedString(this);
        int from_bitField0_ = bitField0_;
        if (translationBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)) {
            translation_ = java.util.Collections.unmodifiableList(translation_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.translation_ = translation_;
        } else {
          result.translation_ = translationBuilder_.build();
        }
        onBuilt();
        return result;
      }

      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.google.transit.realtime.GtfsRealtime.TranslatedString) {
          return mergeFrom((com.google.transit.realtime.GtfsRealtime.TranslatedString) other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.google.transit.realtime.GtfsRealtime.TranslatedString other) {
        if (other == com.google.transit.realtime.GtfsRealtime.TranslatedString.getDefaultInstance())
          return this;
        if (translationBuilder_ == null) {
          if (!other.translation_.isEmpty()) {
            if (translation_.isEmpty()) {
              translation_ = other.translation_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureTranslationIsMutable();
              translation_.addAll(other.translation_);
            }
            onChanged();
          }
        } else {
          if (!other.translation_.isEmpty()) {
            if (translationBuilder_.isEmpty()) {
              translationBuilder_.dispose();
              translationBuilder_ = null;
              translation_ = other.translation_;
              bitField0_ = (bitField0_ & ~0x00000001);
              translationBuilder_ = com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders
                  ? getTranslationFieldBuilder()
                  : null;
            } else {
              translationBuilder_.addAllMessages(other.translation_);
            }
          }
        }
        this.mergeExtensionFields(other);
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      @Override
      public final boolean isInitialized() {
        for (int i = 0; i < getTranslationCount(); i++) {
          if (!getTranslation(i).isInitialized()) {

            return false;
          }
        }
        if (!extensionsAreInitialized()) {

          return false;
        }
        return true;
      }

      @Override
      public Builder mergeFrom(com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
        com.google.transit.realtime.GtfsRealtime.TranslatedString parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage =
              (com.google.transit.realtime.GtfsRealtime.TranslatedString) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bitField0_;

      private java.util.List<com.google.transit.realtime.GtfsRealtime.TranslatedString.Translation> translation_ =
          java.util.Collections.emptyList();

      private void ensureTranslationIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          translation_ =
              new java.util.ArrayList<com.google.transit.realtime.GtfsRealtime.TranslatedString.Translation>(
                  translation_);
          bitField0_ |= 0x00000001;
        }
      }

      private com.google.protobuf.RepeatedFieldBuilder<com.google.transit.realtime.GtfsRealtime.TranslatedString.Translation, com.google.transit.realtime.GtfsRealtime.TranslatedString.Translation.Builder, com.google.transit.realtime.GtfsRealtime.TranslatedString.TranslationOrBuilder> translationBuilder_;

      /**
       * <code>repeated .transit_realtime.TranslatedString.Translation translation = 1;</code>
       *
       * <pre>
       * At least one translation must be provided.
       * </pre>
       */
      @Override
      public java.util.List<com.google.transit.realtime.GtfsRealtime.TranslatedString.Translation> getTranslationList() {
        if (translationBuilder_ == null) {
          return java.util.Collections.unmodifiableList(translation_);
        } else {
          return translationBuilder_.getMessageList();
        }
      }

      /**
       * <code>repeated .transit_realtime.TranslatedString.Translation translation = 1;</code>
       *
       * <pre>
       * At least one translation must be provided.
       * </pre>
       */
      @Override
      public int getTranslationCount() {
        if (translationBuilder_ == null) {
          return translation_.size();
        } else {
          return translationBuilder_.getCount();
        }
      }

      /**
       * <code>repeated .transit_realtime.TranslatedString.Translation translation = 1;</code>
       *
       * <pre>
       * At least one translation must be provided.
       * </pre>
       */
      @Override
      public com.google.transit.realtime.GtfsRealtime.TranslatedString.Translation getTranslation(
          int index) {
        if (translationBuilder_ == null) {
          return translation_.get(index);
        } else {
          return translationBuilder_.getMessage(index);
        }
      }

      /**
       * <code>repeated .transit_realtime.TranslatedString.Translation translation = 1;</code>
       *
       * <pre>
       * At least one translation must be provided.
       * </pre>
       */
      public Builder setTranslation(int index,
          com.google.transit.realtime.GtfsRealtime.TranslatedString.Translation value) {
        if (translationBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureTranslationIsMutable();
          translation_.set(index, value);
          onChanged();
        } else {
          translationBuilder_.setMessage(index, value);
        }
        return this;
      }

      /**
       * <code>repeated .transit_realtime.TranslatedString.Translation translation = 1;</code>
       *
       * <pre>
       * At least one translation must be provided.
       * </pre>
       */
      public Builder setTranslation(int index,
          com.google.transit.realtime.GtfsRealtime.TranslatedString.Translation.Builder builderForValue) {
        if (translationBuilder_ == null) {
          ensureTranslationIsMutable();
          translation_.set(index, builderForValue.build());
          onChanged();
        } else {
          translationBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }

      /**
       * <code>repeated .transit_realtime.TranslatedString.Translation translation = 1;</code>
       *
       * <pre>
       * At least one translation must be provided.
       * </pre>
       */
      public Builder addTranslation(
          com.google.transit.realtime.GtfsRealtime.TranslatedString.Translation value) {
        if (translationBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureTranslationIsMutable();
          translation_.add(value);
          onChanged();
        } else {
          translationBuilder_.addMessage(value);
        }
        return this;
      }

      /**
       * <code>repeated .transit_realtime.TranslatedString.Translation translation = 1;</code>
       *
       * <pre>
       * At least one translation must be provided.
       * </pre>
       */
      public Builder addTranslation(int index,
          com.google.transit.realtime.GtfsRealtime.TranslatedString.Translation value) {
        if (translationBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureTranslationIsMutable();
          translation_.add(index, value);
          onChanged();
        } else {
          translationBuilder_.addMessage(index, value);
        }
        return this;
      }

      /**
       * <code>repeated .transit_realtime.TranslatedString.Translation translation = 1;</code>
       *
       * <pre>
       * At least one translation must be provided.
       * </pre>
       */
      public Builder addTranslation(
          com.google.transit.realtime.GtfsRealtime.TranslatedString.Translation.Builder builderForValue) {
        if (translationBuilder_ == null) {
          ensureTranslationIsMutable();
          translation_.add(builderForValue.build());
          onChanged();
        } else {
          translationBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }

      /**
       * <code>repeated .transit_realtime.TranslatedString.Translation translation = 1;</code>
       *
       * <pre>
       * At least one translation must be provided.
       * </pre>
       */
      public Builder addTranslation(int index,
          com.google.transit.realtime.GtfsRealtime.TranslatedString.Translation.Builder builderForValue) {
        if (translationBuilder_ == null) {
          ensureTranslationIsMutable();
          translation_.add(index, builderForValue.build());
          onChanged();
        } else {
          translationBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }

      /**
       * <code>repeated .transit_realtime.TranslatedString.Translation translation = 1;</code>
       *
       * <pre>
       * At least one translation must be provided.
       * </pre>
       */
      public Builder addAllTranslation(
          java.lang.Iterable<? extends com.google.transit.realtime.GtfsRealtime.TranslatedString.Translation> values) {
        if (translationBuilder_ == null) {
          ensureTranslationIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(values, translation_);
          onChanged();
        } else {
          translationBuilder_.addAllMessages(values);
        }
        return this;
      }

      /**
       * <code>repeated .transit_realtime.TranslatedString.Translation translation = 1;</code>
       *
       * <pre>
       * At least one translation must be provided.
       * </pre>
       */
      public Builder clearTranslation() {
        if (translationBuilder_ == null) {
          translation_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          translationBuilder_.clear();
        }
        return this;
      }

      /**
       * <code>repeated .transit_realtime.TranslatedString.Translation translation = 1;</code>
       *
       * <pre>
       * At least one translation must be provided.
       * </pre>
       */
      public Builder removeTranslation(int index) {
        if (translationBuilder_ == null) {
          ensureTranslationIsMutable();
          translation_.remove(index);
          onChanged();
        } else {
          translationBuilder_.remove(index);
        }
        return this;
      }

      /**
       * <code>repeated .transit_realtime.TranslatedString.Translation translation = 1;</code>
       *
       * <pre>
       * At least one translation must be provided.
       * </pre>
       */
      public com.google.transit.realtime.GtfsRealtime.TranslatedString.Translation.Builder getTranslationBuilder(
          int index) {
        return getTranslationFieldBuilder().getBuilder(index);
      }

      /**
       * <code>repeated .transit_realtime.TranslatedString.Translation translation = 1;</code>
       *
       * <pre>
       * At least one translation must be provided.
       * </pre>
       */
      @Override
      public com.google.transit.realtime.GtfsRealtime.TranslatedString.TranslationOrBuilder getTranslationOrBuilder(
          int index) {
        if (translationBuilder_ == null) {
          return translation_.get(index);
        } else {
          return translationBuilder_.getMessageOrBuilder(index);
        }
      }

      /**
       * <code>repeated .transit_realtime.TranslatedString.Translation translation = 1;</code>
       *
       * <pre>
       * At least one translation must be provided.
       * </pre>
       */
      @Override
      public java.util.List<? extends com.google.transit.realtime.GtfsRealtime.TranslatedString.TranslationOrBuilder> getTranslationOrBuilderList() {
        if (translationBuilder_ != null) {
          return translationBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(translation_);
        }
      }

      /**
       * <code>repeated .transit_realtime.TranslatedString.Translation translation = 1;</code>
       *
       * <pre>
       * At least one translation must be provided.
       * </pre>
       */
      public com.google.transit.realtime.GtfsRealtime.TranslatedString.Translation.Builder addTranslationBuilder() {
        return getTranslationFieldBuilder()
            .addBuilder(com.google.transit.realtime.GtfsRealtime.TranslatedString.Translation
                .getDefaultInstance());
      }

      /**
       * <code>repeated .transit_realtime.TranslatedString.Translation translation = 1;</code>
       *
       * <pre>
       * At least one translation must be provided.
       * </pre>
       */
      public com.google.transit.realtime.GtfsRealtime.TranslatedString.Translation.Builder addTranslationBuilder(
          int index) {
        return getTranslationFieldBuilder().addBuilder(index,
            com.google.transit.realtime.GtfsRealtime.TranslatedString.Translation
                .getDefaultInstance());
      }

      /**
       * <code>repeated .transit_realtime.TranslatedString.Translation translation = 1;</code>
       *
       * <pre>
       * At least one translation must be provided.
       * </pre>
       */
      public java.util.List<com.google.transit.realtime.GtfsRealtime.TranslatedString.Translation.Builder> getTranslationBuilderList() {
        return getTranslationFieldBuilder().getBuilderList();
      }

      private com.google.protobuf.RepeatedFieldBuilder<com.google.transit.realtime.GtfsRealtime.TranslatedString.Translation, com.google.transit.realtime.GtfsRealtime.TranslatedString.Translation.Builder, com.google.transit.realtime.GtfsRealtime.TranslatedString.TranslationOrBuilder> getTranslationFieldBuilder() {
        if (translationBuilder_ == null) {
          translationBuilder_ =
              new com.google.protobuf.RepeatedFieldBuilder<com.google.transit.realtime.GtfsRealtime.TranslatedString.Translation, com.google.transit.realtime.GtfsRealtime.TranslatedString.Translation.Builder, com.google.transit.realtime.GtfsRealtime.TranslatedString.TranslationOrBuilder>(
                  translation_, ((bitField0_ & 0x00000001) == 0x00000001), getParentForChildren(),
                  isClean());
          translation_ = null;
        }
        return translationBuilder_;
      }

      // @@protoc_insertion_point(builder_scope:transit_realtime.TranslatedString)
    }

    static {
      defaultInstance = new TranslatedString(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:transit_realtime.TranslatedString)
  }

  private static final com.google.protobuf.Descriptors.Descriptor internal_static_transit_realtime_FeedMessage_descriptor;
  private static com.google.protobuf.GeneratedMessage.FieldAccessorTable internal_static_transit_realtime_FeedMessage_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor internal_static_transit_realtime_FeedHeader_descriptor;
  private static com.google.protobuf.GeneratedMessage.FieldAccessorTable internal_static_transit_realtime_FeedHeader_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor internal_static_transit_realtime_FeedEntity_descriptor;
  private static com.google.protobuf.GeneratedMessage.FieldAccessorTable internal_static_transit_realtime_FeedEntity_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor internal_static_transit_realtime_TripUpdate_descriptor;
  private static com.google.protobuf.GeneratedMessage.FieldAccessorTable internal_static_transit_realtime_TripUpdate_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor internal_static_transit_realtime_TripUpdate_StopTimeEvent_descriptor;
  private static com.google.protobuf.GeneratedMessage.FieldAccessorTable internal_static_transit_realtime_TripUpdate_StopTimeEvent_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor internal_static_transit_realtime_TripUpdate_StopTimeUpdate_descriptor;
  private static com.google.protobuf.GeneratedMessage.FieldAccessorTable internal_static_transit_realtime_TripUpdate_StopTimeUpdate_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor internal_static_transit_realtime_VehiclePosition_descriptor;
  private static com.google.protobuf.GeneratedMessage.FieldAccessorTable internal_static_transit_realtime_VehiclePosition_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor internal_static_transit_realtime_Alert_descriptor;
  private static com.google.protobuf.GeneratedMessage.FieldAccessorTable internal_static_transit_realtime_Alert_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor internal_static_transit_realtime_TimeRange_descriptor;
  private static com.google.protobuf.GeneratedMessage.FieldAccessorTable internal_static_transit_realtime_TimeRange_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor internal_static_transit_realtime_Position_descriptor;
  private static com.google.protobuf.GeneratedMessage.FieldAccessorTable internal_static_transit_realtime_Position_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor internal_static_transit_realtime_TripDescriptor_descriptor;
  private static com.google.protobuf.GeneratedMessage.FieldAccessorTable internal_static_transit_realtime_TripDescriptor_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor internal_static_transit_realtime_VehicleDescriptor_descriptor;
  private static com.google.protobuf.GeneratedMessage.FieldAccessorTable internal_static_transit_realtime_VehicleDescriptor_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor internal_static_transit_realtime_EntitySelector_descriptor;
  private static com.google.protobuf.GeneratedMessage.FieldAccessorTable internal_static_transit_realtime_EntitySelector_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor internal_static_transit_realtime_TranslatedString_descriptor;
  private static com.google.protobuf.GeneratedMessage.FieldAccessorTable internal_static_transit_realtime_TranslatedString_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor internal_static_transit_realtime_TranslatedString_Translation_descriptor;
  private static com.google.protobuf.GeneratedMessage.FieldAccessorTable internal_static_transit_realtime_TranslatedString_Translation_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;
  static {
    java.lang.String[] descriptorData = {"\n\023gtfs-realtime.proto\022\020transit_realtime\""
        + "q\n\013FeedMessage\022,\n\006header\030\001 \002(\0132\034.transit"
        + "_realtime.FeedHeader\022,\n\006entity\030\002 \003(\0132\034.t"
        + "ransit_realtime.FeedEntity*\006\010\350\007\020\320\017\"\317\001\n\nF"
        + "eedHeader\022\035\n\025gtfs_realtime_version\030\001 \002(\t"
        + "\022Q\n\016incrementality\030\002 \001(\0162+.transit_realt"
        + "ime.FeedHeader.Incrementality:\014FULL_DATA"
        + "SET\022\021\n\ttimestamp\030\003 \001(\004\"4\n\016Incrementality"
        + "\022\020\n\014FULL_DATASET\020\000\022\020\n\014DIFFERENTIAL\020\001*\006\010\350"
        + "\007\020\320\017\"\312\001\n\nFeedEntity\022\n\n\002id\030\001 \002(\t\022\031\n\nis_de",
        "leted\030\002 \001(\010:\005false\0221\n\013trip_update\030\003 \001(\0132"
            + "\034.transit_realtime.TripUpdate\0222\n\007vehicle"
            + "\030\004 \001(\0132!.transit_realtime.VehiclePositio"
            + "n\022&\n\005alert\030\005 \001(\0132\027.transit_realtime.Aler"
            + "t*\006\010\350\007\020\320\017\"\232\005\n\nTripUpdate\022.\n\004trip\030\001 \002(\0132 "
            + ".transit_realtime.TripDescriptor\0224\n\007vehi"
            + "cle\030\003 \001(\0132#.transit_realtime.VehicleDesc"
            + "riptor\022E\n\020stop_time_update\030\002 \003(\0132+.trans"
            + "it_realtime.TripUpdate.StopTimeUpdate\022\021\n"
            + "\ttimestamp\030\004 \001(\004\022\r\n\005delay\030\005 \001(\005\032I\n\rStopT",
        "imeEvent\022\r\n\005delay\030\001 \001(\005\022\014\n\004time\030\002 \001(\003\022\023\n"
            + "\013uncertainty\030\003 \001(\005*\006\010\350\007\020\320\017\032\351\002\n\016StopTimeU"
            + "pdate\022\025\n\rstop_sequence\030\001 \001(\r\022\017\n\007stop_id\030"
            + "\004 \001(\t\022;\n\007arrival\030\002 \001(\0132*.transit_realtim"
            + "e.TripUpdate.StopTimeEvent\022=\n\tdeparture\030"
            + "\003 \001(\0132*.transit_realtime.TripUpdate.Stop"
            + "TimeEvent\022j\n\025schedule_relationship\030\005 \001(\016"
            + "2@.transit_realtime.TripUpdate.StopTimeU"
            + "pdate.ScheduleRelationship:\tSCHEDULED\"?\n"
            + "\024ScheduleRelationship\022\r\n\tSCHEDULED\020\000\022\013\n\007",
        "SKIPPED\020\001\022\013\n\007NO_DATA\020\002*\006\010\350\007\020\320\017*\006\010\350\007\020\320\017\"\340"
            + "\006\n\017VehiclePosition\022.\n\004trip\030\001 \001(\0132 .trans"
            + "it_realtime.TripDescriptor\0224\n\007vehicle\030\010 "
            + "\001(\0132#.transit_realtime.VehicleDescriptor"
            + "\022,\n\010position\030\002 \001(\0132\032.transit_realtime.Po"
            + "sition\022\035\n\025current_stop_sequence\030\003 \001(\r\022\017\n"
            + "\007stop_id\030\007 \001(\t\022Z\n\016current_status\030\004 \001(\01623"
            + ".transit_realtime.VehiclePosition.Vehicl"
            + "eStopStatus:\rIN_TRANSIT_TO\022\021\n\ttimestamp\030"
            + "\005 \001(\004\022K\n\020congestion_level\030\006 \001(\01621.transi",
        "t_realtime.VehiclePosition.CongestionLev"
            + "el\022K\n\020occupancy_status\030\t \001(\01621.transit_r"
            + "ealtime.VehiclePosition.OccupancyStatus\""
            + "G\n\021VehicleStopStatus\022\017\n\013INCOMING_AT\020\000\022\016\n"
            + "\nSTOPPED_AT\020\001\022\021\n\rIN_TRANSIT_TO\020\002\"}\n\017Cong"
            + "estionLevel\022\034\n\030UNKNOWN_CONGESTION_LEVEL\020"
            + "\000\022\024\n\020RUNNING_SMOOTHLY\020\001\022\017\n\013STOP_AND_GO\020\002"
            + "\022\016\n\nCONGESTION\020\003\022\025\n\021SEVERE_CONGESTION\020\004\""
            + "\257\001\n\017OccupancyStatus\022\t\n\005EMPTY\020\000\022\030\n\024MANY_S"
            + "EATS_AVAILABLE\020\001\022\027\n\023FEW_SEATS_AVAILABLE\020",
        "\002\022\026\n\022STANDING_ROOM_ONLY\020\003\022\036\n\032CRUSHED_STA"
            + "NDING_ROOM_ONLY\020\004\022\010\n\004FULL\020\005\022\034\n\030NOT_ACCEP"
            + "TING_PASSENGERS\020\006*\006\010\350\007\020\320\017\"\337\010\n\005Alert\0222\n\ra"
            + "ctive_period\030\001 \003(\0132\033.transit_realtime.Ti"
            + "meRange\0229\n\017informed_entity\030\005 \003(\0132 .trans"
            + "it_realtime.EntitySelector\022;\n\005cause\030\006 \001("
            + "\0162\035.transit_realtime.Alert.Cause:\rUNKNOW"
            + "N_CAUSE\022>\n\006effect\030\007 \001(\0162\036.transit_realti"
            + "me.Alert.Effect:\016UNKNOWN_EFFECT\022/\n\003url\030\010"
            + " \001(\0132\".transit_realtime.TranslatedString",
        "\0227\n\013header_text\030\n \001(\0132\".transit_realtime"
            + ".TranslatedString\022<\n\020description_text\030\013 "
            + "\001(\0132\".transit_realtime.TranslatedString\022"
            + ";\n\017tts_header_text\030\014 \001(\0132\".transit_realt"
            + "ime.TranslatedString\022@\n\024tts_description_"
            + "text\030\r \001(\0132\".transit_realtime.Translated"
            + "String\022O\n\016severity_level\030\016 \001(\0162%.transit"
            + "_realtime.Alert.SeverityLevel:\020UNKNOWN_S"
            + "EVERITY\"\330\001\n\005Cause\022\021\n\rUNKNOWN_CAUSE\020\001\022\017\n\013"
            + "OTHER_CAUSE\020\002\022\025\n\021TECHNICAL_PROBLEM\020\003\022\n\n\006",
        "STRIKE\020\004\022\021\n\rDEMONSTRATION\020\005\022\014\n\010ACCIDENT\020"
            + "\006\022\013\n\007HOLIDAY\020\007\022\013\n\007WEATHER\020\010\022\017\n\013MAINTENAN"
            + "CE\020\t\022\020\n\014CONSTRUCTION\020\n\022\023\n\017POLICE_ACTIVIT"
            + "Y\020\013\022\025\n\021MEDICAL_EMERGENCY\020\014\"\304\001\n\006Effect\022\016\n"
            + "\nNO_SERVICE\020\001\022\023\n\017REDUCED_SERVICE\020\002\022\026\n\022SI"
            + "GNIFICANT_DELAYS\020\003\022\n\n\006DETOUR\020\004\022\026\n\022ADDITI"
            + "ONAL_SERVICE\020\005\022\024\n\020MODIFIED_SERVICE\020\006\022\020\n\014"
            + "OTHER_EFFECT\020\007\022\022\n\016UNKNOWN_EFFECT\020\010\022\016\n\nST"
            + "OP_MOVED\020\t\022\r\n\tNO_EFFECT\020\n\"H\n\rSeverityLev"
            + "el\022\024\n\020UNKNOWN_SEVERITY\020\001\022\010\n\004INFO\020\002\022\013\n\007WA",
        "RNING\020\003\022\n\n\006SEVERE\020\004*\006\010\350\007\020\320\017\"/\n\tTimeRange"
            + "\022\r\n\005start\030\001 \001(\004\022\013\n\003end\030\002 \001(\004*\006\010\350\007\020\320\017\"i\n\010"
            + "Position\022\020\n\010latitude\030\001 \002(\002\022\021\n\tlongitude\030"
            + "\002 \002(\002\022\017\n\007bearing\030\003 \001(\002\022\020\n\010odometer\030\004 \001(\001"
            + "\022\r\n\005speed\030\005 \001(\002*\006\010\350\007\020\320\017\"\256\002\n\016TripDescript"
            + "or\022\017\n\007trip_id\030\001 \001(\t\022\020\n\010route_id\030\005 \001(\t\022\024\n"
            + "\014direction_id\030\006 \001(\r\022\022\n\nstart_time\030\002 \001(\t\022"
            + "\022\n\nstart_date\030\003 \001(\t\022T\n\025schedule_relation"
            + "ship\030\004 \001(\01625.transit_realtime.TripDescri"
            + "ptor.ScheduleRelationship\"]\n\024ScheduleRel",
        "ationship\022\r\n\tSCHEDULED\020\000\022\t\n\005ADDED\020\001\022\017\n\013U"
            + "NSCHEDULED\020\002\022\014\n\010CANCELED\020\003\022\014\n\010MODIFIED\020\005"
            + "*\006\010\350\007\020\320\017\"M\n\021VehicleDescriptor\022\n\n\002id\030\001 \001("
            + "\t\022\r\n\005label\030\002 \001(\t\022\025\n\rlicense_plate\030\003 \001(\t*"
            + "\006\010\350\007\020\320\017\"\222\001\n\016EntitySelector\022\021\n\tagency_id\030"
            + "\001 \001(\t\022\020\n\010route_id\030\002 \001(\t\022\022\n\nroute_type\030\003 "
            + "\001(\005\022.\n\004trip\030\004 \001(\0132 .transit_realtime.Tri"
            + "pDescriptor\022\017\n\007stop_id\030\005 \001(\t*\006\010\350\007\020\320\017\"\226\001\n"
            + "\020TranslatedString\022C\n\013translation\030\001 \003(\0132."
            + ".transit_realtime.TranslatedString.Trans",
        "lation\0325\n\013Translation\022\014\n\004text\030\001 \002(\t\022\020\n\010l"
            + "anguage\030\002 \001(\t*\006\010\350\007\020\320\017*\006\010\350\007\020\320\017B\035\n\033com.goo"
            + "gle.transit.realtime"};
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
          @Override
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {}, assigner);
    internal_static_transit_realtime_FeedMessage_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_transit_realtime_FeedMessage_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessage.FieldAccessorTable(
            internal_static_transit_realtime_FeedMessage_descriptor,
            new java.lang.String[] {"Header", "Entity",});
    internal_static_transit_realtime_FeedHeader_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_transit_realtime_FeedHeader_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessage.FieldAccessorTable(
            internal_static_transit_realtime_FeedHeader_descriptor,
            new java.lang.String[] {"GtfsRealtimeVersion", "Incrementality", "Timestamp",});
    internal_static_transit_realtime_FeedEntity_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_transit_realtime_FeedEntity_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessage.FieldAccessorTable(
            internal_static_transit_realtime_FeedEntity_descriptor,
            new java.lang.String[] {"Id", "IsDeleted", "TripUpdate", "Vehicle", "Alert",});
    internal_static_transit_realtime_TripUpdate_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_transit_realtime_TripUpdate_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessage.FieldAccessorTable(
            internal_static_transit_realtime_TripUpdate_descriptor,
            new java.lang.String[] {"Trip", "Vehicle", "StopTimeUpdate", "Timestamp", "Delay",});
    internal_static_transit_realtime_TripUpdate_StopTimeEvent_descriptor =
        internal_static_transit_realtime_TripUpdate_descriptor.getNestedTypes().get(0);
    internal_static_transit_realtime_TripUpdate_StopTimeEvent_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessage.FieldAccessorTable(
            internal_static_transit_realtime_TripUpdate_StopTimeEvent_descriptor,
            new java.lang.String[] {"Delay", "Time", "Uncertainty",});
    internal_static_transit_realtime_TripUpdate_StopTimeUpdate_descriptor =
        internal_static_transit_realtime_TripUpdate_descriptor.getNestedTypes().get(1);
    internal_static_transit_realtime_TripUpdate_StopTimeUpdate_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessage.FieldAccessorTable(
            internal_static_transit_realtime_TripUpdate_StopTimeUpdate_descriptor,
            new java.lang.String[] {"StopSequence", "StopId", "Arrival", "Departure",
                "ScheduleRelationship",});
    internal_static_transit_realtime_VehiclePosition_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_transit_realtime_VehiclePosition_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessage.FieldAccessorTable(
            internal_static_transit_realtime_VehiclePosition_descriptor,
            new java.lang.String[] {"Trip", "Vehicle", "Position", "CurrentStopSequence", "StopId",
                "CurrentStatus", "Timestamp", "CongestionLevel", "OccupancyStatus",});
    internal_static_transit_realtime_Alert_descriptor = getDescriptor().getMessageTypes().get(5);
    internal_static_transit_realtime_Alert_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessage.FieldAccessorTable(
            internal_static_transit_realtime_Alert_descriptor,
            new java.lang.String[] {"ActivePeriod", "InformedEntity", "Cause", "Effect", "Url",
                "HeaderText", "DescriptionText", "TtsHeaderText", "TtsDescriptionText",
                "SeverityLevel",});
    internal_static_transit_realtime_TimeRange_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_transit_realtime_TimeRange_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessage.FieldAccessorTable(
            internal_static_transit_realtime_TimeRange_descriptor,
            new java.lang.String[] {"Start", "End",});
    internal_static_transit_realtime_Position_descriptor = getDescriptor().getMessageTypes().get(7);
    internal_static_transit_realtime_Position_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessage.FieldAccessorTable(
            internal_static_transit_realtime_Position_descriptor,
            new java.lang.String[] {"Latitude", "Longitude", "Bearing", "Odometer", "Speed",});
    internal_static_transit_realtime_TripDescriptor_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_transit_realtime_TripDescriptor_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessage.FieldAccessorTable(
            internal_static_transit_realtime_TripDescriptor_descriptor,
            new java.lang.String[] {"TripId", "RouteId", "DirectionId", "StartTime", "StartDate",
                "ScheduleRelationship",});
    internal_static_transit_realtime_VehicleDescriptor_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_transit_realtime_VehicleDescriptor_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessage.FieldAccessorTable(
            internal_static_transit_realtime_VehicleDescriptor_descriptor,
            new java.lang.String[] {"Id", "Label", "LicensePlate",});
    internal_static_transit_realtime_EntitySelector_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_transit_realtime_EntitySelector_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessage.FieldAccessorTable(
            internal_static_transit_realtime_EntitySelector_descriptor,
            new java.lang.String[] {"AgencyId", "RouteId", "RouteType", "Trip", "StopId",});
    internal_static_transit_realtime_TranslatedString_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_transit_realtime_TranslatedString_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessage.FieldAccessorTable(
            internal_static_transit_realtime_TranslatedString_descriptor,
            new java.lang.String[] {"Translation",});
    internal_static_transit_realtime_TranslatedString_Translation_descriptor =
        internal_static_transit_realtime_TranslatedString_descriptor.getNestedTypes().get(0);
    internal_static_transit_realtime_TranslatedString_Translation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessage.FieldAccessorTable(
            internal_static_transit_realtime_TranslatedString_Translation_descriptor,
            new java.lang.String[] {"Text", "Language",});
  }

  // @@protoc_insertion_point(outer_class_scope)
}
