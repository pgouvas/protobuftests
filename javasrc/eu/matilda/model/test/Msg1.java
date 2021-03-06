// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: msg1.proto

package eu.matilda.model.test;

public final class Msg1 {
  private Msg1() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ResultEnumOrBuilder extends
      // @@protoc_insertion_point(interface_extends:eu.matilda.model.test.ResultEnum)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string query = 1;</code>
     */
    java.lang.String getQuery();
    /**
     * <code>string query = 1;</code>
     */
    com.google.protobuf.ByteString
        getQueryBytes();

    /**
     * <code>string page_number = 2;</code>
     */
    java.lang.String getPageNumber();
    /**
     * <code>string page_number = 2;</code>
     */
    com.google.protobuf.ByteString
        getPageNumberBytes();

    /**
     * <code>string result_per_page = 3;</code>
     */
    java.lang.String getResultPerPage();
    /**
     * <code>string result_per_page = 3;</code>
     */
    com.google.protobuf.ByteString
        getResultPerPageBytes();
  }
  /**
   * Protobuf type {@code eu.matilda.model.test.ResultEnum}
   */
  public  static final class ResultEnum extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:eu.matilda.model.test.ResultEnum)
      ResultEnumOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ResultEnum.newBuilder() to construct.
    private ResultEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ResultEnum() {
      query_ = "";
      pageNumber_ = "";
      resultPerPage_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ResultEnum(
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
            default: {
              if (!parseUnknownFieldProto3(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();

              query_ = s;
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              pageNumber_ = s;
              break;
            }
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();

              resultPerPage_ = s;
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
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return eu.matilda.model.test.Msg1.internal_static_eu_matilda_model_test_ResultEnum_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return eu.matilda.model.test.Msg1.internal_static_eu_matilda_model_test_ResultEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              eu.matilda.model.test.Msg1.ResultEnum.class, eu.matilda.model.test.Msg1.ResultEnum.Builder.class);
    }

    public static final int QUERY_FIELD_NUMBER = 1;
    private volatile java.lang.Object query_;
    /**
     * <code>string query = 1;</code>
     */
    public java.lang.String getQuery() {
      java.lang.Object ref = query_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        query_ = s;
        return s;
      }
    }
    /**
     * <code>string query = 1;</code>
     */
    public com.google.protobuf.ByteString
        getQueryBytes() {
      java.lang.Object ref = query_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        query_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int PAGE_NUMBER_FIELD_NUMBER = 2;
    private volatile java.lang.Object pageNumber_;
    /**
     * <code>string page_number = 2;</code>
     */
    public java.lang.String getPageNumber() {
      java.lang.Object ref = pageNumber_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        pageNumber_ = s;
        return s;
      }
    }
    /**
     * <code>string page_number = 2;</code>
     */
    public com.google.protobuf.ByteString
        getPageNumberBytes() {
      java.lang.Object ref = pageNumber_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        pageNumber_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int RESULT_PER_PAGE_FIELD_NUMBER = 3;
    private volatile java.lang.Object resultPerPage_;
    /**
     * <code>string result_per_page = 3;</code>
     */
    public java.lang.String getResultPerPage() {
      java.lang.Object ref = resultPerPage_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        resultPerPage_ = s;
        return s;
      }
    }
    /**
     * <code>string result_per_page = 3;</code>
     */
    public com.google.protobuf.ByteString
        getResultPerPageBytes() {
      java.lang.Object ref = resultPerPage_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        resultPerPage_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!getQueryBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, query_);
      }
      if (!getPageNumberBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, pageNumber_);
      }
      if (!getResultPerPageBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, resultPerPage_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getQueryBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, query_);
      }
      if (!getPageNumberBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, pageNumber_);
      }
      if (!getResultPerPageBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, resultPerPage_);
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
      if (!(obj instanceof eu.matilda.model.test.Msg1.ResultEnum)) {
        return super.equals(obj);
      }
      eu.matilda.model.test.Msg1.ResultEnum other = (eu.matilda.model.test.Msg1.ResultEnum) obj;

      boolean result = true;
      result = result && getQuery()
          .equals(other.getQuery());
      result = result && getPageNumber()
          .equals(other.getPageNumber());
      result = result && getResultPerPage()
          .equals(other.getResultPerPage());
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
      hash = (37 * hash) + QUERY_FIELD_NUMBER;
      hash = (53 * hash) + getQuery().hashCode();
      hash = (37 * hash) + PAGE_NUMBER_FIELD_NUMBER;
      hash = (53 * hash) + getPageNumber().hashCode();
      hash = (37 * hash) + RESULT_PER_PAGE_FIELD_NUMBER;
      hash = (53 * hash) + getResultPerPage().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static eu.matilda.model.test.Msg1.ResultEnum parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static eu.matilda.model.test.Msg1.ResultEnum parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static eu.matilda.model.test.Msg1.ResultEnum parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static eu.matilda.model.test.Msg1.ResultEnum parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static eu.matilda.model.test.Msg1.ResultEnum parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static eu.matilda.model.test.Msg1.ResultEnum parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static eu.matilda.model.test.Msg1.ResultEnum parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static eu.matilda.model.test.Msg1.ResultEnum parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static eu.matilda.model.test.Msg1.ResultEnum parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static eu.matilda.model.test.Msg1.ResultEnum parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static eu.matilda.model.test.Msg1.ResultEnum parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static eu.matilda.model.test.Msg1.ResultEnum parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(eu.matilda.model.test.Msg1.ResultEnum prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
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
     * Protobuf type {@code eu.matilda.model.test.ResultEnum}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:eu.matilda.model.test.ResultEnum)
        eu.matilda.model.test.Msg1.ResultEnumOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return eu.matilda.model.test.Msg1.internal_static_eu_matilda_model_test_ResultEnum_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return eu.matilda.model.test.Msg1.internal_static_eu_matilda_model_test_ResultEnum_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                eu.matilda.model.test.Msg1.ResultEnum.class, eu.matilda.model.test.Msg1.ResultEnum.Builder.class);
      }

      // Construct using eu.matilda.model.test.Msg1.ResultEnum.newBuilder()
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
      public Builder clear() {
        super.clear();
        query_ = "";

        pageNumber_ = "";

        resultPerPage_ = "";

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return eu.matilda.model.test.Msg1.internal_static_eu_matilda_model_test_ResultEnum_descriptor;
      }

      public eu.matilda.model.test.Msg1.ResultEnum getDefaultInstanceForType() {
        return eu.matilda.model.test.Msg1.ResultEnum.getDefaultInstance();
      }

      public eu.matilda.model.test.Msg1.ResultEnum build() {
        eu.matilda.model.test.Msg1.ResultEnum result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public eu.matilda.model.test.Msg1.ResultEnum buildPartial() {
        eu.matilda.model.test.Msg1.ResultEnum result = new eu.matilda.model.test.Msg1.ResultEnum(this);
        result.query_ = query_;
        result.pageNumber_ = pageNumber_;
        result.resultPerPage_ = resultPerPage_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof eu.matilda.model.test.Msg1.ResultEnum) {
          return mergeFrom((eu.matilda.model.test.Msg1.ResultEnum)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(eu.matilda.model.test.Msg1.ResultEnum other) {
        if (other == eu.matilda.model.test.Msg1.ResultEnum.getDefaultInstance()) return this;
        if (!other.getQuery().isEmpty()) {
          query_ = other.query_;
          onChanged();
        }
        if (!other.getPageNumber().isEmpty()) {
          pageNumber_ = other.pageNumber_;
          onChanged();
        }
        if (!other.getResultPerPage().isEmpty()) {
          resultPerPage_ = other.resultPerPage_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        eu.matilda.model.test.Msg1.ResultEnum parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (eu.matilda.model.test.Msg1.ResultEnum) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object query_ = "";
      /**
       * <code>string query = 1;</code>
       */
      public java.lang.String getQuery() {
        java.lang.Object ref = query_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          query_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string query = 1;</code>
       */
      public com.google.protobuf.ByteString
          getQueryBytes() {
        java.lang.Object ref = query_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          query_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string query = 1;</code>
       */
      public Builder setQuery(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        query_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string query = 1;</code>
       */
      public Builder clearQuery() {
        
        query_ = getDefaultInstance().getQuery();
        onChanged();
        return this;
      }
      /**
       * <code>string query = 1;</code>
       */
      public Builder setQueryBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        query_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object pageNumber_ = "";
      /**
       * <code>string page_number = 2;</code>
       */
      public java.lang.String getPageNumber() {
        java.lang.Object ref = pageNumber_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          pageNumber_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string page_number = 2;</code>
       */
      public com.google.protobuf.ByteString
          getPageNumberBytes() {
        java.lang.Object ref = pageNumber_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          pageNumber_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string page_number = 2;</code>
       */
      public Builder setPageNumber(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        pageNumber_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string page_number = 2;</code>
       */
      public Builder clearPageNumber() {
        
        pageNumber_ = getDefaultInstance().getPageNumber();
        onChanged();
        return this;
      }
      /**
       * <code>string page_number = 2;</code>
       */
      public Builder setPageNumberBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        pageNumber_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object resultPerPage_ = "";
      /**
       * <code>string result_per_page = 3;</code>
       */
      public java.lang.String getResultPerPage() {
        java.lang.Object ref = resultPerPage_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          resultPerPage_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string result_per_page = 3;</code>
       */
      public com.google.protobuf.ByteString
          getResultPerPageBytes() {
        java.lang.Object ref = resultPerPage_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          resultPerPage_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string result_per_page = 3;</code>
       */
      public Builder setResultPerPage(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        resultPerPage_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string result_per_page = 3;</code>
       */
      public Builder clearResultPerPage() {
        
        resultPerPage_ = getDefaultInstance().getResultPerPage();
        onChanged();
        return this;
      }
      /**
       * <code>string result_per_page = 3;</code>
       */
      public Builder setResultPerPageBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        resultPerPage_ = value;
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:eu.matilda.model.test.ResultEnum)
    }

    // @@protoc_insertion_point(class_scope:eu.matilda.model.test.ResultEnum)
    private static final eu.matilda.model.test.Msg1.ResultEnum DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new eu.matilda.model.test.Msg1.ResultEnum();
    }

    public static eu.matilda.model.test.Msg1.ResultEnum getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ResultEnum>
        PARSER = new com.google.protobuf.AbstractParser<ResultEnum>() {
      public ResultEnum parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ResultEnum(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ResultEnum> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ResultEnum> getParserForType() {
      return PARSER;
    }

    public eu.matilda.model.test.Msg1.ResultEnum getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_eu_matilda_model_test_ResultEnum_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_eu_matilda_model_test_ResultEnum_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\nmsg1.proto\022\025eu.matilda.model.test\"I\n\nR" +
      "esultEnum\022\r\n\005query\030\001 \001(\t\022\023\n\013page_number\030" +
      "\002 \001(\t\022\027\n\017result_per_page\030\003 \001(\tb\006proto3"
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
    internal_static_eu_matilda_model_test_ResultEnum_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_eu_matilda_model_test_ResultEnum_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_eu_matilda_model_test_ResultEnum_descriptor,
        new java.lang.String[] { "Query", "PageNumber", "ResultPerPage", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
