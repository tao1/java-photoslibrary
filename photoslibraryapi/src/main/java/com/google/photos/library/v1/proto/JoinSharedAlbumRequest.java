// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/photos/library/v1/photos_library.proto

package com.google.photos.library.v1.proto;

/**
 * <pre>
 * Request to join a shared album on behalf of the user. This uses a shareToken
 * which can be acquired via the shareAlbum or listSharedAlbums calls.
 * </pre>
 * <p>
 * Protobuf type {@code google.photos.library.v1.JoinSharedAlbumRequest}
 */
public final class JoinSharedAlbumRequest extends com.google.protobuf.GeneratedMessageV3
        implements
        // @@protoc_insertion_point(message_implements:google.photos.library.v1.JoinSharedAlbumRequest)
        JoinSharedAlbumRequestOrBuilder {
    private static final long serialVersionUID = 0L;

    // Use JoinSharedAlbumRequest.newBuilder() to construct.
    private JoinSharedAlbumRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private JoinSharedAlbumRequest() {
        shareToken_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    private JoinSharedAlbumRequest(
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
                    case 10: {
                        java.lang.String s = input.readStringRequireUtf8();

                        shareToken_ = s;
                        break;
                    }
                    default: {
                        if (!parseUnknownFieldProto3(input, unknownFields, extensionRegistry, tag)) {
                            done = true;
                        }
                        break;
                    }
                }
            }
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(this);
        } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
        } finally {
            this.unknownFields = unknownFields.build();
            makeExtensionsImmutable();
        }
    }

    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
        return com.google.photos.library.v1.proto.LibraryServiceProto
                .internal_static_google_photos_library_v1_JoinSharedAlbumRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
    internalGetFieldAccessorTable() {
        return com.google.photos.library.v1.proto.LibraryServiceProto
                .internal_static_google_photos_library_v1_JoinSharedAlbumRequest_fieldAccessorTable
                .ensureFieldAccessorsInitialized(
                        com.google.photos.library.v1.proto.JoinSharedAlbumRequest.class,
                        com.google.photos.library.v1.proto.JoinSharedAlbumRequest.Builder.class);
    }

    public static final int SHARE_TOKEN_FIELD_NUMBER = 1;
    private volatile java.lang.Object shareToken_;

    /**
     * <pre>
     * Token to join the shared album on behalf of the user.
     * </pre>
     *
     * <code>string share_token = 1;</code>
     */
    public java.lang.String getShareToken() {
        java.lang.Object ref = shareToken_;
        if (ref instanceof java.lang.String) {
            return (java.lang.String) ref;
        } else {
            com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
            java.lang.String s = bs.toStringUtf8();
            shareToken_ = s;
            return s;
        }
    }

    /**
     * <pre>
     * Token to join the shared album on behalf of the user.
     * </pre>
     *
     * <code>string share_token = 1;</code>
     */
    public com.google.protobuf.ByteString getShareTokenBytes() {
        java.lang.Object ref = shareToken_;
        if (ref instanceof java.lang.String) {
            com.google.protobuf.ByteString b =
                    com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
            shareToken_ = b;
            return b;
        } else {
            return (com.google.protobuf.ByteString) ref;
        }
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
    public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
        if (!getShareTokenBytes().isEmpty()) {
            com.google.protobuf.GeneratedMessageV3.writeString(output, 1, shareToken_);
        }
        unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
        int size = memoizedSize;
        if (size != -1) return size;

        size = 0;
        if (!getShareTokenBytes().isEmpty()) {
            size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, shareToken_);
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
        if (!(obj instanceof com.google.photos.library.v1.proto.JoinSharedAlbumRequest)) {
            return super.equals(obj);
        }
        com.google.photos.library.v1.proto.JoinSharedAlbumRequest other =
                (com.google.photos.library.v1.proto.JoinSharedAlbumRequest) obj;

        boolean result = true;
        result = result && getShareToken().equals(other.getShareToken());
        result = result && unknownFields.equals(other.unknownFields);
        return result;
    }

    @java.lang.Override
    public int hashCode() {
        if (memoizedHashCode != 0) {
            return memoizedHashCode;
        }
        int hash = 41;
        hash = (19 * hash) + getDescriptor().hashCode();
        hash = (37 * hash) + SHARE_TOKEN_FIELD_NUMBER;
        hash = (53 * hash) + getShareToken().hashCode();
        hash = (29 * hash) + unknownFields.hashCode();
        memoizedHashCode = hash;
        return hash;
    }

    public static com.google.photos.library.v1.proto.JoinSharedAlbumRequest parseFrom(
            java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static com.google.photos.library.v1.proto.JoinSharedAlbumRequest parseFrom(
            java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.google.photos.library.v1.proto.JoinSharedAlbumRequest parseFrom(
            com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static com.google.photos.library.v1.proto.JoinSharedAlbumRequest parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.google.photos.library.v1.proto.JoinSharedAlbumRequest parseFrom(byte[] data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static com.google.photos.library.v1.proto.JoinSharedAlbumRequest parseFrom(
            byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static com.google.photos.library.v1.proto.JoinSharedAlbumRequest parseFrom(
            java.io.InputStream input) throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static com.google.photos.library.v1.proto.JoinSharedAlbumRequest parseFrom(
            java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                PARSER, input, extensionRegistry);
    }

    public static com.google.photos.library.v1.proto.JoinSharedAlbumRequest parseDelimitedFrom(
            java.io.InputStream input) throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
    }

    public static com.google.photos.library.v1.proto.JoinSharedAlbumRequest parseDelimitedFrom(
            java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
                PARSER, input, extensionRegistry);
    }

    public static com.google.photos.library.v1.proto.JoinSharedAlbumRequest parseFrom(
            com.google.protobuf.CodedInputStream input) throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
    }

    public static com.google.photos.library.v1.proto.JoinSharedAlbumRequest parseFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(
            com.google.photos.library.v1.proto.JoinSharedAlbumRequest prototype) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    @java.lang.Override
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        Builder builder = new Builder(parent);
        return builder;
    }

    /**
     * <pre>
     * Request to join a shared album on behalf of the user. This uses a shareToken
     * which can be acquired via the shareAlbum or listSharedAlbums calls.
     * </pre>
     * <p>
     * Protobuf type {@code google.photos.library.v1.JoinSharedAlbumRequest}
     */
    public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
            implements
            // @@protoc_insertion_point(builder_implements:google.photos.library.v1.JoinSharedAlbumRequest)
            com.google.photos.library.v1.proto.JoinSharedAlbumRequestOrBuilder {
        public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
            return com.google.photos.library.v1.proto.LibraryServiceProto
                    .internal_static_google_photos_library_v1_JoinSharedAlbumRequest_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return com.google.photos.library.v1.proto.LibraryServiceProto
                    .internal_static_google_photos_library_v1_JoinSharedAlbumRequest_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            com.google.photos.library.v1.proto.JoinSharedAlbumRequest.class,
                            com.google.photos.library.v1.proto.JoinSharedAlbumRequest.Builder.class);
        }

        // Construct using com.google.photos.library.v1.proto.JoinSharedAlbumRequest.newBuilder()
        private Builder() {
            maybeForceBuilderInitialization();
        }

        private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
            }
        }

        @java.lang.Override
        public Builder clear() {
            super.clear();
            shareToken_ = "";

            return this;
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
            return com.google.photos.library.v1.proto.LibraryServiceProto
                    .internal_static_google_photos_library_v1_JoinSharedAlbumRequest_descriptor;
        }

        @java.lang.Override
        public com.google.photos.library.v1.proto.JoinSharedAlbumRequest getDefaultInstanceForType() {
            return com.google.photos.library.v1.proto.JoinSharedAlbumRequest.getDefaultInstance();
        }

        @java.lang.Override
        public com.google.photos.library.v1.proto.JoinSharedAlbumRequest build() {
            com.google.photos.library.v1.proto.JoinSharedAlbumRequest result = buildPartial();
            if (!result.isInitialized()) {
                throw newUninitializedMessageException(result);
            }
            return result;
        }

        @java.lang.Override
        public com.google.photos.library.v1.proto.JoinSharedAlbumRequest buildPartial() {
            com.google.photos.library.v1.proto.JoinSharedAlbumRequest result =
                    new com.google.photos.library.v1.proto.JoinSharedAlbumRequest(this);
            result.shareToken_ = shareToken_;
            onBuilt();
            return result;
        }

        @java.lang.Override
        public Builder clone() {
            return (Builder) super.clone();
        }

        @java.lang.Override
        public Builder setField(
                com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
            return (Builder) super.setField(field, value);
        }

        @java.lang.Override
        public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
            return (Builder) super.clearField(field);
        }

        @java.lang.Override
        public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
            return (Builder) super.clearOneof(oneof);
        }

        @java.lang.Override
        public Builder setRepeatedField(
                com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
            return (Builder) super.setRepeatedField(field, index, value);
        }

        @java.lang.Override
        public Builder addRepeatedField(
                com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
            return (Builder) super.addRepeatedField(field, value);
        }

        @java.lang.Override
        public Builder mergeFrom(com.google.protobuf.Message other) {
            if (other instanceof com.google.photos.library.v1.proto.JoinSharedAlbumRequest) {
                return mergeFrom((com.google.photos.library.v1.proto.JoinSharedAlbumRequest) other);
            } else {
                super.mergeFrom(other);
                return this;
            }
        }

        public Builder mergeFrom(com.google.photos.library.v1.proto.JoinSharedAlbumRequest other) {
            if (other == com.google.photos.library.v1.proto.JoinSharedAlbumRequest.getDefaultInstance())
                return this;
            if (!other.getShareToken().isEmpty()) {
                shareToken_ = other.shareToken_;
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
            com.google.photos.library.v1.proto.JoinSharedAlbumRequest parsedMessage = null;
            try {
                parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                parsedMessage =
                        (com.google.photos.library.v1.proto.JoinSharedAlbumRequest) e.getUnfinishedMessage();
                throw e.unwrapIOException();
            } finally {
                if (parsedMessage != null) {
                    mergeFrom(parsedMessage);
                }
            }
            return this;
        }

        private java.lang.Object shareToken_ = "";

        /**
         * <pre>
         * Token to join the shared album on behalf of the user.
         * </pre>
         *
         * <code>string share_token = 1;</code>
         */
        public java.lang.String getShareToken() {
            java.lang.Object ref = shareToken_;
            if (!(ref instanceof java.lang.String)) {
                com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                shareToken_ = s;
                return s;
            } else {
                return (java.lang.String) ref;
            }
        }

        /**
         * <pre>
         * Token to join the shared album on behalf of the user.
         * </pre>
         *
         * <code>string share_token = 1;</code>
         */
        public com.google.protobuf.ByteString getShareTokenBytes() {
            java.lang.Object ref = shareToken_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
                shareToken_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        /**
         * <pre>
         * Token to join the shared album on behalf of the user.
         * </pre>
         *
         * <code>string share_token = 1;</code>
         */
        public Builder setShareToken(java.lang.String value) {
            if (value == null) {
                throw new NullPointerException();
            }

            shareToken_ = value;
            onChanged();
            return this;
        }

        /**
         * <pre>
         * Token to join the shared album on behalf of the user.
         * </pre>
         *
         * <code>string share_token = 1;</code>
         */
        public Builder clearShareToken() {

            shareToken_ = getDefaultInstance().getShareToken();
            onChanged();
            return this;
        }

        /**
         * <pre>
         * Token to join the shared album on behalf of the user.
         * </pre>
         *
         * <code>string share_token = 1;</code>
         */
        public Builder setShareTokenBytes(com.google.protobuf.ByteString value) {
            if (value == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(value);

            shareToken_ = value;
            onChanged();
            return this;
        }

        @java.lang.Override
        public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
            return super.setUnknownFieldsProto3(unknownFields);
        }

        @java.lang.Override
        public final Builder mergeUnknownFields(
                final com.google.protobuf.UnknownFieldSet unknownFields) {
            return super.mergeUnknownFields(unknownFields);
        }

        // @@protoc_insertion_point(builder_scope:google.photos.library.v1.JoinSharedAlbumRequest)
    }

    // @@protoc_insertion_point(class_scope:google.photos.library.v1.JoinSharedAlbumRequest)
    private static final com.google.photos.library.v1.proto.JoinSharedAlbumRequest DEFAULT_INSTANCE;

    static {
        DEFAULT_INSTANCE = new com.google.photos.library.v1.proto.JoinSharedAlbumRequest();
    }

    public static com.google.photos.library.v1.proto.JoinSharedAlbumRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<JoinSharedAlbumRequest> PARSER =
            new com.google.protobuf.AbstractParser<JoinSharedAlbumRequest>() {
                @java.lang.Override
                public JoinSharedAlbumRequest parsePartialFrom(
                        com.google.protobuf.CodedInputStream input,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
                    return new JoinSharedAlbumRequest(input, extensionRegistry);
                }
            };

    public static com.google.protobuf.Parser<JoinSharedAlbumRequest> parser() {
        return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<JoinSharedAlbumRequest> getParserForType() {
        return PARSER;
    }

    @java.lang.Override
    public com.google.photos.library.v1.proto.JoinSharedAlbumRequest getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
