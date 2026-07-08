package tt_c2pa_sdk.proto;

import X.C1C4H;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;
import tt_c2pa_sdk.proto.FuncParamsX25f7600164bf39ed;

/* JADX INFO: loaded from: classes35.dex */
public final class FuncParamsX25f7600164bf39ed extends Message<FuncParamsX25f7600164bf39ed, C1C4H> {
    public static final ProtoAdapter<FuncParamsX25f7600164bf39ed> ADAPTER = new ProtoAdapter<FuncParamsX25f7600164bf39ed>() { // from class: X.1C4G
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final FuncParamsX25f7600164bf39ed decode(ProtoReader protoReader) {
            C1C4H c1c4h = new C1C4H();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c1c4h.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c1c4h.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1c4h.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(FuncParamsX25f7600164bf39ed funcParamsX25f7600164bf39ed) {
            FuncParamsX25f7600164bf39ed funcParamsX25f7600164bf39ed2 = funcParamsX25f7600164bf39ed;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, funcParamsX25f7600164bf39ed2.path) + funcParamsX25f7600164bf39ed2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, FuncParamsX25f7600164bf39ed funcParamsX25f7600164bf39ed) {
            FuncParamsX25f7600164bf39ed funcParamsX25f7600164bf39ed2 = funcParamsX25f7600164bf39ed;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, funcParamsX25f7600164bf39ed2.path);
            protoWriter.writeBytes(funcParamsX25f7600164bf39ed2.unknownFields());
        }
    };

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public String path;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.path.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1C4H newBuilder() {
        C1C4H c1c4h = new C1C4H();
        c1c4h.LIZLLL = this.path;
        c1c4h.addUnknownFields(unknownFields());
        return c1c4h;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", path=");
        sb.append(this.path);
        sb.replace(0, 2, "FuncParamsX25f7600164bf39ed{");
        sb.append('}');
        return sb.toString();
    }

    public FuncParamsX25f7600164bf39ed(String str) {
        this(str, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FuncParamsX25f7600164bf39ed)) {
            return false;
        }
        FuncParamsX25f7600164bf39ed funcParamsX25f7600164bf39ed = (FuncParamsX25f7600164bf39ed) obj;
        if (unknownFields().equals(funcParamsX25f7600164bf39ed.unknownFields()) && this.path.equals(funcParamsX25f7600164bf39ed.path)) {
            return true;
        }
        return false;
    }

    public FuncParamsX25f7600164bf39ed(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.path = str;
    }
}
