/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.curso.kafka.avro.model;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class Ciudad extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 5514818407074565297L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Ciudad\",\"namespace\":\"com.curso.kafka.avro.model\",\"fields\":[{\"name\":\"ciudad\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Ciudad> ENCODER =
      new BinaryMessageEncoder<Ciudad>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Ciudad> DECODER =
      new BinaryMessageDecoder<Ciudad>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<Ciudad> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<Ciudad> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<Ciudad> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Ciudad>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this Ciudad to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a Ciudad from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a Ciudad instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static Ciudad fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private java.lang.CharSequence ciudad;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Ciudad() {}

  /**
   * All-args constructor.
   * @param ciudad The new value for ciudad
   */
  public Ciudad(java.lang.CharSequence ciudad) {
    this.ciudad = ciudad;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return ciudad;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: ciudad = (java.lang.CharSequence)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'ciudad' field.
   * @return The value of the 'ciudad' field.
   */
  public java.lang.CharSequence getCiudad() {
    return ciudad;
  }


  /**
   * Sets the value of the 'ciudad' field.
   * @param value the value to set.
   */
  public void setCiudad(java.lang.CharSequence value) {
    this.ciudad = value;
  }

  /**
   * Creates a new Ciudad RecordBuilder.
   * @return A new Ciudad RecordBuilder
   */
  public static com.curso.kafka.avro.model.Ciudad.Builder newBuilder() {
    return new com.curso.kafka.avro.model.Ciudad.Builder();
  }

  /**
   * Creates a new Ciudad RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Ciudad RecordBuilder
   */
  public static com.curso.kafka.avro.model.Ciudad.Builder newBuilder(com.curso.kafka.avro.model.Ciudad.Builder other) {
    if (other == null) {
      return new com.curso.kafka.avro.model.Ciudad.Builder();
    } else {
      return new com.curso.kafka.avro.model.Ciudad.Builder(other);
    }
  }

  /**
   * Creates a new Ciudad RecordBuilder by copying an existing Ciudad instance.
   * @param other The existing instance to copy.
   * @return A new Ciudad RecordBuilder
   */
  public static com.curso.kafka.avro.model.Ciudad.Builder newBuilder(com.curso.kafka.avro.model.Ciudad other) {
    if (other == null) {
      return new com.curso.kafka.avro.model.Ciudad.Builder();
    } else {
      return new com.curso.kafka.avro.model.Ciudad.Builder(other);
    }
  }

  /**
   * RecordBuilder for Ciudad instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Ciudad>
    implements org.apache.avro.data.RecordBuilder<Ciudad> {

    private java.lang.CharSequence ciudad;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.curso.kafka.avro.model.Ciudad.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.ciudad)) {
        this.ciudad = data().deepCopy(fields()[0].schema(), other.ciudad);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
    }

    /**
     * Creates a Builder by copying an existing Ciudad instance
     * @param other The existing instance to copy.
     */
    private Builder(com.curso.kafka.avro.model.Ciudad other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.ciudad)) {
        this.ciudad = data().deepCopy(fields()[0].schema(), other.ciudad);
        fieldSetFlags()[0] = true;
      }
    }

    /**
      * Gets the value of the 'ciudad' field.
      * @return The value.
      */
    public java.lang.CharSequence getCiudad() {
      return ciudad;
    }


    /**
      * Sets the value of the 'ciudad' field.
      * @param value The value of 'ciudad'.
      * @return This builder.
      */
    public com.curso.kafka.avro.model.Ciudad.Builder setCiudad(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.ciudad = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'ciudad' field has been set.
      * @return True if the 'ciudad' field has been set, false otherwise.
      */
    public boolean hasCiudad() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'ciudad' field.
      * @return This builder.
      */
    public com.curso.kafka.avro.model.Ciudad.Builder clearCiudad() {
      ciudad = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Ciudad build() {
      try {
        Ciudad record = new Ciudad();
        record.ciudad = fieldSetFlags()[0] ? this.ciudad : (java.lang.CharSequence) defaultValue(fields()[0]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Ciudad>
    WRITER$ = (org.apache.avro.io.DatumWriter<Ciudad>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Ciudad>
    READER$ = (org.apache.avro.io.DatumReader<Ciudad>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.ciudad);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.ciudad = in.readString(this.ciudad instanceof Utf8 ? (Utf8)this.ciudad : null);

    } else {
      for (int i = 0; i < 1; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.ciudad = in.readString(this.ciudad instanceof Utf8 ? (Utf8)this.ciudad : null);
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










