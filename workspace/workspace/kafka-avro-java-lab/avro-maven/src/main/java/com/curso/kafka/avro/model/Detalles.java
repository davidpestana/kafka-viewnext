/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.curso.kafka.avro.model;

import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.SchemaStore;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;

@org.apache.avro.specific.AvroGenerated
public class Detalles extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -5561650435781348580L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Detalles\",\"namespace\":\"com.curso.kafka.avro.model\",\"fields\":[{\"name\":\"id\",\"type\":\"long\"},{\"name\":\"principal\",\"type\":\"string\"},{\"name\":\"descripcion\",\"type\":\"string\"},{\"name\":\"icono\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Detalles> ENCODER =
      new BinaryMessageEncoder<Detalles>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Detalles> DECODER =
      new BinaryMessageDecoder<Detalles>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<Detalles> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<Detalles> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<Detalles> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Detalles>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this Detalles to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a Detalles from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a Detalles instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static Detalles fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private long id;
   private java.lang.CharSequence principal;
   private java.lang.CharSequence descripcion;
   private java.lang.CharSequence icono;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Detalles() {}

  /**
   * All-args constructor.
   * @param id The new value for id
   * @param principal The new value for principal
   * @param descripcion The new value for descripcion
   * @param icono The new value for icono
   */
  public Detalles(java.lang.Long id, java.lang.CharSequence principal, java.lang.CharSequence descripcion, java.lang.CharSequence icono) {
    this.id = id;
    this.principal = principal;
    this.descripcion = descripcion;
    this.icono = icono;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return principal;
    case 2: return descripcion;
    case 3: return icono;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.lang.Long)value$; break;
    case 1: principal = (java.lang.CharSequence)value$; break;
    case 2: descripcion = (java.lang.CharSequence)value$; break;
    case 3: icono = (java.lang.CharSequence)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'id' field.
   * @return The value of the 'id' field.
   */
  public long getId() {
    return id;
  }


  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(long value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'principal' field.
   * @return The value of the 'principal' field.
   */
  public java.lang.CharSequence getPrincipal() {
    return principal;
  }


  /**
   * Sets the value of the 'principal' field.
   * @param value the value to set.
   */
  public void setPrincipal(java.lang.CharSequence value) {
    this.principal = value;
  }

  /**
   * Gets the value of the 'descripcion' field.
   * @return The value of the 'descripcion' field.
   */
  public java.lang.CharSequence getDescripcion() {
    return descripcion;
  }


  /**
   * Sets the value of the 'descripcion' field.
   * @param value the value to set.
   */
  public void setDescripcion(java.lang.CharSequence value) {
    this.descripcion = value;
  }

  /**
   * Gets the value of the 'icono' field.
   * @return The value of the 'icono' field.
   */
  public java.lang.CharSequence getIcono() {
    return icono;
  }


  /**
   * Sets the value of the 'icono' field.
   * @param value the value to set.
   */
  public void setIcono(java.lang.CharSequence value) {
    this.icono = value;
  }

  /**
   * Creates a new Detalles RecordBuilder.
   * @return A new Detalles RecordBuilder
   */
  public static com.curso.kafka.avro.model.Detalles.Builder newBuilder() {
    return new com.curso.kafka.avro.model.Detalles.Builder();
  }

  /**
   * Creates a new Detalles RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Detalles RecordBuilder
   */
  public static com.curso.kafka.avro.model.Detalles.Builder newBuilder(com.curso.kafka.avro.model.Detalles.Builder other) {
    if (other == null) {
      return new com.curso.kafka.avro.model.Detalles.Builder();
    } else {
      return new com.curso.kafka.avro.model.Detalles.Builder(other);
    }
  }

  /**
   * Creates a new Detalles RecordBuilder by copying an existing Detalles instance.
   * @param other The existing instance to copy.
   * @return A new Detalles RecordBuilder
   */
  public static com.curso.kafka.avro.model.Detalles.Builder newBuilder(com.curso.kafka.avro.model.Detalles other) {
    if (other == null) {
      return new com.curso.kafka.avro.model.Detalles.Builder();
    } else {
      return new com.curso.kafka.avro.model.Detalles.Builder(other);
    }
  }

  /**
   * RecordBuilder for Detalles instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Detalles>
    implements org.apache.avro.data.RecordBuilder<Detalles> {

    private long id;
    private java.lang.CharSequence principal;
    private java.lang.CharSequence descripcion;
    private java.lang.CharSequence icono;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.curso.kafka.avro.model.Detalles.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.principal)) {
        this.principal = data().deepCopy(fields()[1].schema(), other.principal);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.descripcion)) {
        this.descripcion = data().deepCopy(fields()[2].schema(), other.descripcion);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.icono)) {
        this.icono = data().deepCopy(fields()[3].schema(), other.icono);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
    }

    /**
     * Creates a Builder by copying an existing Detalles instance
     * @param other The existing instance to copy.
     */
    private Builder(com.curso.kafka.avro.model.Detalles other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.principal)) {
        this.principal = data().deepCopy(fields()[1].schema(), other.principal);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.descripcion)) {
        this.descripcion = data().deepCopy(fields()[2].schema(), other.descripcion);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.icono)) {
        this.icono = data().deepCopy(fields()[3].schema(), other.icono);
        fieldSetFlags()[3] = true;
      }
    }

    /**
      * Gets the value of the 'id' field.
      * @return The value.
      */
    public long getId() {
      return id;
    }


    /**
      * Sets the value of the 'id' field.
      * @param value The value of 'id'.
      * @return This builder.
      */
    public com.curso.kafka.avro.model.Detalles.Builder setId(long value) {
      validate(fields()[0], value);
      this.id = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'id' field has been set.
      * @return True if the 'id' field has been set, false otherwise.
      */
    public boolean hasId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'id' field.
      * @return This builder.
      */
    public com.curso.kafka.avro.model.Detalles.Builder clearId() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'principal' field.
      * @return The value.
      */
    public java.lang.CharSequence getPrincipal() {
      return principal;
    }


    /**
      * Sets the value of the 'principal' field.
      * @param value The value of 'principal'.
      * @return This builder.
      */
    public com.curso.kafka.avro.model.Detalles.Builder setPrincipal(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.principal = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'principal' field has been set.
      * @return True if the 'principal' field has been set, false otherwise.
      */
    public boolean hasPrincipal() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'principal' field.
      * @return This builder.
      */
    public com.curso.kafka.avro.model.Detalles.Builder clearPrincipal() {
      principal = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'descripcion' field.
      * @return The value.
      */
    public java.lang.CharSequence getDescripcion() {
      return descripcion;
    }


    /**
      * Sets the value of the 'descripcion' field.
      * @param value The value of 'descripcion'.
      * @return This builder.
      */
    public com.curso.kafka.avro.model.Detalles.Builder setDescripcion(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.descripcion = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'descripcion' field has been set.
      * @return True if the 'descripcion' field has been set, false otherwise.
      */
    public boolean hasDescripcion() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'descripcion' field.
      * @return This builder.
      */
    public com.curso.kafka.avro.model.Detalles.Builder clearDescripcion() {
      descripcion = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'icono' field.
      * @return The value.
      */
    public java.lang.CharSequence getIcono() {
      return icono;
    }


    /**
      * Sets the value of the 'icono' field.
      * @param value The value of 'icono'.
      * @return This builder.
      */
    public com.curso.kafka.avro.model.Detalles.Builder setIcono(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.icono = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'icono' field has been set.
      * @return True if the 'icono' field has been set, false otherwise.
      */
    public boolean hasIcono() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'icono' field.
      * @return This builder.
      */
    public com.curso.kafka.avro.model.Detalles.Builder clearIcono() {
      icono = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    public Detalles build() {
      try {
        Detalles record = new Detalles();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.Long) defaultValue(fields()[0]);
        record.principal = fieldSetFlags()[1] ? this.principal : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.descripcion = fieldSetFlags()[2] ? this.descripcion : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.icono = fieldSetFlags()[3] ? this.icono : (java.lang.CharSequence) defaultValue(fields()[3]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Detalles>
    WRITER$ = (org.apache.avro.io.DatumWriter<Detalles>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Detalles>
    READER$ = (org.apache.avro.io.DatumReader<Detalles>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeLong(this.id);

    out.writeString(this.principal);

    out.writeString(this.descripcion);

    out.writeString(this.icono);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.id = in.readLong();

      this.principal = in.readString(this.principal instanceof Utf8 ? (Utf8)this.principal : null);

      this.descripcion = in.readString(this.descripcion instanceof Utf8 ? (Utf8)this.descripcion : null);

      this.icono = in.readString(this.icono instanceof Utf8 ? (Utf8)this.icono : null);

    } else {
      for (int i = 0; i < 4; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.id = in.readLong();
          break;

        case 1:
          this.principal = in.readString(this.principal instanceof Utf8 ? (Utf8)this.principal : null);
          break;

        case 2:
          this.descripcion = in.readString(this.descripcion instanceof Utf8 ? (Utf8)this.descripcion : null);
          break;

        case 3:
          this.icono = in.readString(this.icono instanceof Utf8 ? (Utf8)this.icono : null);
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}









