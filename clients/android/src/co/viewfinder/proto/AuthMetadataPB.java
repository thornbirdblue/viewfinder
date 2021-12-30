// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AuthMetadata.proto

package co.viewfinder.proto;

public final class AuthMetadataPB {
  private AuthMetadataPB() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface AuthMetadataOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // optional int64 user_id = 1;
    /**
     * <code>optional int64 user_id = 1;</code>
     */
    boolean hasUserId();
    /**
     * <code>optional int64 user_id = 1;</code>
     */
    long getUserId();

    // optional int64 device_id = 2;
    /**
     * <code>optional int64 device_id = 2;</code>
     */
    boolean hasDeviceId();
    /**
     * <code>optional int64 device_id = 2;</code>
     */
    long getDeviceId();

    // optional bytes user_cookie = 3;
    /**
     * <code>optional bytes user_cookie = 3;</code>
     */
    boolean hasUserCookie();
    /**
     * <code>optional bytes user_cookie = 3;</code>
     */
    com.google.protobuf.ByteString getUserCookie();

    // optional bytes xsrf_cookie = 4;
    /**
     * <code>optional bytes xsrf_cookie = 4;</code>
     */
    boolean hasXsrfCookie();
    /**
     * <code>optional bytes xsrf_cookie = 4;</code>
     */
    com.google.protobuf.ByteString getXsrfCookie();

    // optional string device_uuid = 5;
    /**
     * <code>optional string device_uuid = 5;</code>
     *
     * <pre>
     * This value differs from "device_id" in that it is
     * furnished by the device itself instead of by Viewfinder.
     * It's used to determine whether the device has changed
     * out from under the database, as in a backup / restore to
     * a new physical device.
     * </pre>
     */
    boolean hasDeviceUuid();
    /**
     * <code>optional string device_uuid = 5;</code>
     *
     * <pre>
     * This value differs from "device_id" in that it is
     * furnished by the device itself instead of by Viewfinder.
     * It's used to determine whether the device has changed
     * out from under the database, as in a backup / restore to
     * a new physical device.
     * </pre>
     */
    java.lang.String getDeviceUuid();
    /**
     * <code>optional string device_uuid = 5;</code>
     *
     * <pre>
     * This value differs from "device_id" in that it is
     * furnished by the device itself instead of by Viewfinder.
     * It's used to determine whether the device has changed
     * out from under the database, as in a backup / restore to
     * a new physical device.
     * </pre>
     */
    com.google.protobuf.ByteString
        getDeviceUuidBytes();
  }
  /**
   * Protobuf type {@code AuthMetadata}
   */
  public static final class AuthMetadata extends
      com.google.protobuf.GeneratedMessage
      implements AuthMetadataOrBuilder {
    // Use AuthMetadata.newBuilder() to construct.
    private AuthMetadata(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private AuthMetadata(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final AuthMetadata defaultInstance;
    public static AuthMetadata getDefaultInstance() {
      return defaultInstance;
    }

    public AuthMetadata getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private AuthMetadata(
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
              userId_ = input.readInt64();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              deviceId_ = input.readInt64();
              break;
            }
            case 26: {
              bitField0_ |= 0x00000004;
              userCookie_ = input.readBytes();
              break;
            }
            case 34: {
              bitField0_ |= 0x00000008;
              xsrfCookie_ = input.readBytes();
              break;
            }
            case 42: {
              bitField0_ |= 0x00000010;
              deviceUuid_ = input.readBytes();
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
      return co.viewfinder.proto.AuthMetadataPB.internal_static_AuthMetadata_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return co.viewfinder.proto.AuthMetadataPB.internal_static_AuthMetadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              co.viewfinder.proto.AuthMetadataPB.AuthMetadata.class, co.viewfinder.proto.AuthMetadataPB.AuthMetadata.Builder.class);
    }

    public static com.google.protobuf.Parser<AuthMetadata> PARSER =
        new com.google.protobuf.AbstractParser<AuthMetadata>() {
      public AuthMetadata parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new AuthMetadata(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<AuthMetadata> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // optional int64 user_id = 1;
    public static final int USER_ID_FIELD_NUMBER = 1;
    private long userId_;
    /**
     * <code>optional int64 user_id = 1;</code>
     */
    public boolean hasUserId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional int64 user_id = 1;</code>
     */
    public long getUserId() {
      return userId_;
    }

    // optional int64 device_id = 2;
    public static final int DEVICE_ID_FIELD_NUMBER = 2;
    private long deviceId_;
    /**
     * <code>optional int64 device_id = 2;</code>
     */
    public boolean hasDeviceId() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional int64 device_id = 2;</code>
     */
    public long getDeviceId() {
      return deviceId_;
    }

    // optional bytes user_cookie = 3;
    public static final int USER_COOKIE_FIELD_NUMBER = 3;
    private com.google.protobuf.ByteString userCookie_;
    /**
     * <code>optional bytes user_cookie = 3;</code>
     */
    public boolean hasUserCookie() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional bytes user_cookie = 3;</code>
     */
    public com.google.protobuf.ByteString getUserCookie() {
      return userCookie_;
    }

    // optional bytes xsrf_cookie = 4;
    public static final int XSRF_COOKIE_FIELD_NUMBER = 4;
    private com.google.protobuf.ByteString xsrfCookie_;
    /**
     * <code>optional bytes xsrf_cookie = 4;</code>
     */
    public boolean hasXsrfCookie() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional bytes xsrf_cookie = 4;</code>
     */
    public com.google.protobuf.ByteString getXsrfCookie() {
      return xsrfCookie_;
    }

    // optional string device_uuid = 5;
    public static final int DEVICE_UUID_FIELD_NUMBER = 5;
    private java.lang.Object deviceUuid_;
    /**
     * <code>optional string device_uuid = 5;</code>
     *
     * <pre>
     * This value differs from "device_id" in that it is
     * furnished by the device itself instead of by Viewfinder.
     * It's used to determine whether the device has changed
     * out from under the database, as in a backup / restore to
     * a new physical device.
     * </pre>
     */
    public boolean hasDeviceUuid() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>optional string device_uuid = 5;</code>
     *
     * <pre>
     * This value differs from "device_id" in that it is
     * furnished by the device itself instead of by Viewfinder.
     * It's used to determine whether the device has changed
     * out from under the database, as in a backup / restore to
     * a new physical device.
     * </pre>
     */
    public java.lang.String getDeviceUuid() {
      java.lang.Object ref = deviceUuid_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          deviceUuid_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string device_uuid = 5;</code>
     *
     * <pre>
     * This value differs from "device_id" in that it is
     * furnished by the device itself instead of by Viewfinder.
     * It's used to determine whether the device has changed
     * out from under the database, as in a backup / restore to
     * a new physical device.
     * </pre>
     */
    public com.google.protobuf.ByteString
        getDeviceUuidBytes() {
      java.lang.Object ref = deviceUuid_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        deviceUuid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private void initFields() {
      userId_ = 0L;
      deviceId_ = 0L;
      userCookie_ = com.google.protobuf.ByteString.EMPTY;
      xsrfCookie_ = com.google.protobuf.ByteString.EMPTY;
      deviceUuid_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt64(1, userId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt64(2, deviceId_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBytes(3, userCookie_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeBytes(4, xsrfCookie_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeBytes(5, getDeviceUuidBytes());
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
          .computeInt64Size(1, userId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(2, deviceId_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, userCookie_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(4, xsrfCookie_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(5, getDeviceUuidBytes());
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

    public static co.viewfinder.proto.AuthMetadataPB.AuthMetadata parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static co.viewfinder.proto.AuthMetadataPB.AuthMetadata parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static co.viewfinder.proto.AuthMetadataPB.AuthMetadata parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static co.viewfinder.proto.AuthMetadataPB.AuthMetadata parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static co.viewfinder.proto.AuthMetadataPB.AuthMetadata parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static co.viewfinder.proto.AuthMetadataPB.AuthMetadata parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static co.viewfinder.proto.AuthMetadataPB.AuthMetadata parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static co.viewfinder.proto.AuthMetadataPB.AuthMetadata parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static co.viewfinder.proto.AuthMetadataPB.AuthMetadata parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static co.viewfinder.proto.AuthMetadataPB.AuthMetadata parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(co.viewfinder.proto.AuthMetadataPB.AuthMetadata prototype) {
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
     * Protobuf type {@code AuthMetadata}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements co.viewfinder.proto.AuthMetadataPB.AuthMetadataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return co.viewfinder.proto.AuthMetadataPB.internal_static_AuthMetadata_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return co.viewfinder.proto.AuthMetadataPB.internal_static_AuthMetadata_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                co.viewfinder.proto.AuthMetadataPB.AuthMetadata.class, co.viewfinder.proto.AuthMetadataPB.AuthMetadata.Builder.class);
      }

      // Construct using co.viewfinder.proto.AuthMetadataPB.AuthMetadata.newBuilder()
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
        userId_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000001);
        deviceId_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000002);
        userCookie_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000004);
        xsrfCookie_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000008);
        deviceUuid_ = "";
        bitField0_ = (bitField0_ & ~0x00000010);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return co.viewfinder.proto.AuthMetadataPB.internal_static_AuthMetadata_descriptor;
      }

      public co.viewfinder.proto.AuthMetadataPB.AuthMetadata getDefaultInstanceForType() {
        return co.viewfinder.proto.AuthMetadataPB.AuthMetadata.getDefaultInstance();
      }

      public co.viewfinder.proto.AuthMetadataPB.AuthMetadata build() {
        co.viewfinder.proto.AuthMetadataPB.AuthMetadata result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public co.viewfinder.proto.AuthMetadataPB.AuthMetadata buildPartial() {
        co.viewfinder.proto.AuthMetadataPB.AuthMetadata result = new co.viewfinder.proto.AuthMetadataPB.AuthMetadata(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.userId_ = userId_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.deviceId_ = deviceId_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.userCookie_ = userCookie_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.xsrfCookie_ = xsrfCookie_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.deviceUuid_ = deviceUuid_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof co.viewfinder.proto.AuthMetadataPB.AuthMetadata) {
          return mergeFrom((co.viewfinder.proto.AuthMetadataPB.AuthMetadata)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(co.viewfinder.proto.AuthMetadataPB.AuthMetadata other) {
        if (other == co.viewfinder.proto.AuthMetadataPB.AuthMetadata.getDefaultInstance()) return this;
        if (other.hasUserId()) {
          setUserId(other.getUserId());
        }
        if (other.hasDeviceId()) {
          setDeviceId(other.getDeviceId());
        }
        if (other.hasUserCookie()) {
          setUserCookie(other.getUserCookie());
        }
        if (other.hasXsrfCookie()) {
          setXsrfCookie(other.getXsrfCookie());
        }
        if (other.hasDeviceUuid()) {
          bitField0_ |= 0x00000010;
          deviceUuid_ = other.deviceUuid_;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        co.viewfinder.proto.AuthMetadataPB.AuthMetadata parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (co.viewfinder.proto.AuthMetadataPB.AuthMetadata) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // optional int64 user_id = 1;
      private long userId_ ;
      /**
       * <code>optional int64 user_id = 1;</code>
       */
      public boolean hasUserId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional int64 user_id = 1;</code>
       */
      public long getUserId() {
        return userId_;
      }
      /**
       * <code>optional int64 user_id = 1;</code>
       */
      public Builder setUserId(long value) {
        bitField0_ |= 0x00000001;
        userId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int64 user_id = 1;</code>
       */
      public Builder clearUserId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        userId_ = 0L;
        onChanged();
        return this;
      }

      // optional int64 device_id = 2;
      private long deviceId_ ;
      /**
       * <code>optional int64 device_id = 2;</code>
       */
      public boolean hasDeviceId() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional int64 device_id = 2;</code>
       */
      public long getDeviceId() {
        return deviceId_;
      }
      /**
       * <code>optional int64 device_id = 2;</code>
       */
      public Builder setDeviceId(long value) {
        bitField0_ |= 0x00000002;
        deviceId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int64 device_id = 2;</code>
       */
      public Builder clearDeviceId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        deviceId_ = 0L;
        onChanged();
        return this;
      }

      // optional bytes user_cookie = 3;
      private com.google.protobuf.ByteString userCookie_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>optional bytes user_cookie = 3;</code>
       */
      public boolean hasUserCookie() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional bytes user_cookie = 3;</code>
       */
      public com.google.protobuf.ByteString getUserCookie() {
        return userCookie_;
      }
      /**
       * <code>optional bytes user_cookie = 3;</code>
       */
      public Builder setUserCookie(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        userCookie_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bytes user_cookie = 3;</code>
       */
      public Builder clearUserCookie() {
        bitField0_ = (bitField0_ & ~0x00000004);
        userCookie_ = getDefaultInstance().getUserCookie();
        onChanged();
        return this;
      }

      // optional bytes xsrf_cookie = 4;
      private com.google.protobuf.ByteString xsrfCookie_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>optional bytes xsrf_cookie = 4;</code>
       */
      public boolean hasXsrfCookie() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>optional bytes xsrf_cookie = 4;</code>
       */
      public com.google.protobuf.ByteString getXsrfCookie() {
        return xsrfCookie_;
      }
      /**
       * <code>optional bytes xsrf_cookie = 4;</code>
       */
      public Builder setXsrfCookie(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        xsrfCookie_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional bytes xsrf_cookie = 4;</code>
       */
      public Builder clearXsrfCookie() {
        bitField0_ = (bitField0_ & ~0x00000008);
        xsrfCookie_ = getDefaultInstance().getXsrfCookie();
        onChanged();
        return this;
      }

      // optional string device_uuid = 5;
      private java.lang.Object deviceUuid_ = "";
      /**
       * <code>optional string device_uuid = 5;</code>
       *
       * <pre>
       * This value differs from "device_id" in that it is
       * furnished by the device itself instead of by Viewfinder.
       * It's used to determine whether the device has changed
       * out from under the database, as in a backup / restore to
       * a new physical device.
       * </pre>
       */
      public boolean hasDeviceUuid() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       * <code>optional string device_uuid = 5;</code>
       *
       * <pre>
       * This value differs from "device_id" in that it is
       * furnished by the device itself instead of by Viewfinder.
       * It's used to determine whether the device has changed
       * out from under the database, as in a backup / restore to
       * a new physical device.
       * </pre>
       */
      public java.lang.String getDeviceUuid() {
        java.lang.Object ref = deviceUuid_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          deviceUuid_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string device_uuid = 5;</code>
       *
       * <pre>
       * This value differs from "device_id" in that it is
       * furnished by the device itself instead of by Viewfinder.
       * It's used to determine whether the device has changed
       * out from under the database, as in a backup / restore to
       * a new physical device.
       * </pre>
       */
      public com.google.protobuf.ByteString
          getDeviceUuidBytes() {
        java.lang.Object ref = deviceUuid_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          deviceUuid_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string device_uuid = 5;</code>
       *
       * <pre>
       * This value differs from "device_id" in that it is
       * furnished by the device itself instead of by Viewfinder.
       * It's used to determine whether the device has changed
       * out from under the database, as in a backup / restore to
       * a new physical device.
       * </pre>
       */
      public Builder setDeviceUuid(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000010;
        deviceUuid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string device_uuid = 5;</code>
       *
       * <pre>
       * This value differs from "device_id" in that it is
       * furnished by the device itself instead of by Viewfinder.
       * It's used to determine whether the device has changed
       * out from under the database, as in a backup / restore to
       * a new physical device.
       * </pre>
       */
      public Builder clearDeviceUuid() {
        bitField0_ = (bitField0_ & ~0x00000010);
        deviceUuid_ = getDefaultInstance().getDeviceUuid();
        onChanged();
        return this;
      }
      /**
       * <code>optional string device_uuid = 5;</code>
       *
       * <pre>
       * This value differs from "device_id" in that it is
       * furnished by the device itself instead of by Viewfinder.
       * It's used to determine whether the device has changed
       * out from under the database, as in a backup / restore to
       * a new physical device.
       * </pre>
       */
      public Builder setDeviceUuidBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000010;
        deviceUuid_ = value;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:AuthMetadata)
    }

    static {
      defaultInstance = new AuthMetadata(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:AuthMetadata)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_AuthMetadata_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_AuthMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022AuthMetadata.proto\"q\n\014AuthMetadata\022\017\n\007" +
      "user_id\030\001 \001(\003\022\021\n\tdevice_id\030\002 \001(\003\022\023\n\013user" +
      "_cookie\030\003 \001(\014\022\023\n\013xsrf_cookie\030\004 \001(\014\022\023\n\013de" +
      "vice_uuid\030\005 \001(\tB%\n\023co.viewfinder.protoB\016" +
      "AuthMetadataPB"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_AuthMetadata_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_AuthMetadata_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_AuthMetadata_descriptor,
              new java.lang.String[] { "UserId", "DeviceId", "UserCookie", "XsrfCookie", "DeviceUuid", });
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
