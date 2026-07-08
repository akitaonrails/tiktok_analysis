package compliance.proto;

import X.C1516540pZE;
import X.C1D9X;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import compliance.proto.FieldAnnotation;
import compliance.proto.MsgAnnotation;
import okio.ByteString;

/* JADX INFO: loaded from: classes36.dex */
public final class MsgAnnotation extends Message<MsgAnnotation, C1D9X> {
    public static final ProtoAdapter<MsgAnnotation> ADAPTER = new ProtoAdapter<MsgAnnotation>() { // from class: X.1D9W
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final MsgAnnotation decode(ProtoReader protoReader) {
            C1D9X c1d9x = new C1D9X();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 101) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c1d9x.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c1d9x.LIZLLL = FieldAnnotation.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1d9x.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(MsgAnnotation msgAnnotation) {
            MsgAnnotation msgAnnotation2 = msgAnnotation;
            return FieldAnnotation.ADAPTER.encodedSizeWithTag(101, msgAnnotation2.field_default) + msgAnnotation2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, MsgAnnotation msgAnnotation) {
            MsgAnnotation msgAnnotation2 = msgAnnotation;
            FieldAnnotation.ADAPTER.encodeWithTag(protoWriter, 101, msgAnnotation2.field_default);
            protoWriter.writeBytes(msgAnnotation2.unknownFields());
        }
    };

    @WireField(adapter = "compliance.proto.FieldAnnotation#ADAPTER", tag = 101)
    public FieldAnnotation field_default;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        FieldAnnotation fieldAnnotation = this.field_default;
        int iHashCode2 = iHashCode + (fieldAnnotation != null ? fieldAnnotation.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public C1D9X newBuilder() {
        C1D9X c1d9x = new C1D9X();
        c1d9x.LIZLLL = this.field_default;
        c1d9x.addUnknownFields(unknownFields());
        return c1d9x;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.field_default != null) {
            sb.append(", field_default=");
            sb.append(this.field_default);
        }
        sb.replace(0, 2, "MsgAnnotation{");
        sb.append('}');
        return sb.toString();
    }

    public MsgAnnotation(FieldAnnotation fieldAnnotation) {
        this(fieldAnnotation, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MsgAnnotation)) {
            return false;
        }
        MsgAnnotation msgAnnotation = (MsgAnnotation) obj;
        if (unknownFields().equals(msgAnnotation.unknownFields()) && C1516540pZE.LJ(this.field_default, msgAnnotation.field_default)) {
            return true;
        }
        return false;
    }

    public MsgAnnotation(FieldAnnotation fieldAnnotation, ByteString byteString) {
        super(ADAPTER, byteString);
        this.field_default = fieldAnnotation;
    }
}
