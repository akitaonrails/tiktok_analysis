package compliance.proto;

import X.C1516540pZE;
import X.C1D9Z;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import compliance.proto.FieldAnnotation;
import okio.ByteString;

/* JADX INFO: loaded from: classes36.dex */
public final class FieldAnnotation extends Message<FieldAnnotation, C1D9Z> {
    public static final ProtoAdapter<FieldAnnotation> ADAPTER = new ProtoAdapter<FieldAnnotation>() { // from class: X.1D9Y
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final FieldAnnotation decode(ProtoReader protoReader) {
            C1D9Z c1d9z = new C1D9Z();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 101) {
                                    if (iNextTag != 102) {
                                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                        c1d9z.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                    } else {
                                        c1d9z.LJII = FieldAnnotation.ADAPTER.decode(protoReader);
                                    }
                                } else {
                                    c1d9z.LJI = FieldAnnotation.ADAPTER.decode(protoReader);
                                }
                            } else {
                                c1d9z.LJFF = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c1d9z.LJ = ProtoAdapter.BOOL.decode(protoReader);
                        }
                    } else {
                        c1d9z.LIZLLL = ProtoAdapter.BOOL.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1d9z.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(FieldAnnotation fieldAnnotation) {
            FieldAnnotation fieldAnnotation2 = fieldAnnotation;
            ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, fieldAnnotation2.hidden_if_unauth) + protoAdapter.encodedSizeWithTag(2, fieldAnnotation2.auth_dependent) + ProtoAdapter.STRING.encodedSizeWithTag(3, fieldAnnotation2.texas);
            ProtoAdapter<FieldAnnotation> protoAdapter2 = FieldAnnotation.ADAPTER;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(101, fieldAnnotation2.map_key) + protoAdapter2.encodedSizeWithTag(102, fieldAnnotation2.map_value) + fieldAnnotation2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, FieldAnnotation fieldAnnotation) {
            FieldAnnotation fieldAnnotation2 = fieldAnnotation;
            ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
            protoAdapter.encodeWithTag(protoWriter, 1, fieldAnnotation2.hidden_if_unauth);
            protoAdapter.encodeWithTag(protoWriter, 2, fieldAnnotation2.auth_dependent);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, fieldAnnotation2.texas);
            ProtoAdapter<FieldAnnotation> protoAdapter2 = FieldAnnotation.ADAPTER;
            protoAdapter2.encodeWithTag(protoWriter, 101, fieldAnnotation2.map_key);
            protoAdapter2.encodeWithTag(protoWriter, 102, fieldAnnotation2.map_value);
            protoWriter.writeBytes(fieldAnnotation2.unknownFields());
        }
    };

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 2)
    public Boolean auth_dependent;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 1)
    public Boolean hidden_if_unauth;

    @WireField(adapter = "compliance.proto.FieldAnnotation#ADAPTER", tag = 101)
    public FieldAnnotation map_key;

    @WireField(adapter = "compliance.proto.FieldAnnotation#ADAPTER", tag = 102)
    public FieldAnnotation map_value;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public String texas;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Boolean bool = this.hidden_if_unauth;
        int iHashCode2 = (iHashCode + (bool != null ? bool.hashCode() : 0)) * 37;
        Boolean bool2 = this.auth_dependent;
        int iHashCode3 = (iHashCode2 + (bool2 != null ? bool2.hashCode() : 0)) * 37;
        String str = this.texas;
        int iHashCode4 = (iHashCode3 + (str != null ? str.hashCode() : 0)) * 37;
        FieldAnnotation fieldAnnotation = this.map_key;
        int iHashCode5 = (iHashCode4 + (fieldAnnotation != null ? fieldAnnotation.hashCode() : 0)) * 37;
        FieldAnnotation fieldAnnotation2 = this.map_value;
        int iHashCode6 = iHashCode5 + (fieldAnnotation2 != null ? fieldAnnotation2.hashCode() : 0);
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.squareup.wire.Message
    public C1D9Z newBuilder() {
        C1D9Z c1d9z = new C1D9Z();
        c1d9z.LIZLLL = this.hidden_if_unauth;
        c1d9z.LJ = this.auth_dependent;
        c1d9z.LJFF = this.texas;
        c1d9z.LJI = this.map_key;
        c1d9z.LJII = this.map_value;
        c1d9z.addUnknownFields(unknownFields());
        return c1d9z;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.hidden_if_unauth != null) {
            sb.append(", hidden_if_unauth=");
            sb.append(this.hidden_if_unauth);
        }
        if (this.auth_dependent != null) {
            sb.append(", auth_dependent=");
            sb.append(this.auth_dependent);
        }
        if (this.texas != null) {
            sb.append(", texas=");
            sb.append(this.texas);
        }
        if (this.map_key != null) {
            sb.append(", map_key=");
            sb.append(this.map_key);
        }
        if (this.map_value != null) {
            sb.append(", map_value=");
            sb.append(this.map_value);
        }
        sb.replace(0, 2, "FieldAnnotation{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FieldAnnotation)) {
            return false;
        }
        FieldAnnotation fieldAnnotation = (FieldAnnotation) obj;
        if (unknownFields().equals(fieldAnnotation.unknownFields()) && C1516540pZE.LJ(this.hidden_if_unauth, fieldAnnotation.hidden_if_unauth) && C1516540pZE.LJ(this.auth_dependent, fieldAnnotation.auth_dependent) && C1516540pZE.LJ(this.texas, fieldAnnotation.texas) && C1516540pZE.LJ(this.map_key, fieldAnnotation.map_key) && C1516540pZE.LJ(this.map_value, fieldAnnotation.map_value)) {
            return true;
        }
        return false;
    }

    public FieldAnnotation(Boolean bool, Boolean bool2, String str, FieldAnnotation fieldAnnotation, FieldAnnotation fieldAnnotation2) {
        this(bool, bool2, str, fieldAnnotation, fieldAnnotation2, ByteString.EMPTY);
    }

    public FieldAnnotation(Boolean bool, Boolean bool2, String str, FieldAnnotation fieldAnnotation, FieldAnnotation fieldAnnotation2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.hidden_if_unauth = bool;
        this.auth_dependent = bool2;
        this.texas = str;
        this.map_key = fieldAnnotation;
        this.map_value = fieldAnnotation2;
    }
}
