package tt_c2pa_sdk.proto;

import X.C1CCV;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;
import tt_c2pa_sdk.proto.FuncParamsXa4a5c3f29571f109;

/* JADX INFO: loaded from: classes35.dex */
public final class FuncParamsXa4a5c3f29571f109 extends Message<FuncParamsXa4a5c3f29571f109, C1CCV> {
    public static final ProtoAdapter<FuncParamsXa4a5c3f29571f109> ADAPTER = new ProtoAdapter<FuncParamsXa4a5c3f29571f109>() { // from class: X.1CCU
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final FuncParamsXa4a5c3f29571f109 decode(ProtoReader protoReader) {
            C1CCV c1ccv = new C1CCV();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c1ccv.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c1ccv.LIZLLL = ProtoAdapter.BYTES.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1ccv.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(FuncParamsXa4a5c3f29571f109 funcParamsXa4a5c3f29571f109) {
            FuncParamsXa4a5c3f29571f109 funcParamsXa4a5c3f29571f1092 = funcParamsXa4a5c3f29571f109;
            return ProtoAdapter.BYTES.encodedSizeWithTag(1, funcParamsXa4a5c3f29571f1092.signcert) + funcParamsXa4a5c3f29571f1092.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, FuncParamsXa4a5c3f29571f109 funcParamsXa4a5c3f29571f109) {
            FuncParamsXa4a5c3f29571f109 funcParamsXa4a5c3f29571f1092 = funcParamsXa4a5c3f29571f109;
            ProtoAdapter.BYTES.encodeWithTag(protoWriter, 1, funcParamsXa4a5c3f29571f1092.signcert);
            protoWriter.writeBytes(funcParamsXa4a5c3f29571f1092.unknownFields());
        }
    };

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = WireField.Label.REQUIRED, tag = 1)
    public ByteString signcert;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.signcert.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1CCV newBuilder() {
        C1CCV c1ccv = new C1CCV();
        c1ccv.LIZLLL = this.signcert;
        c1ccv.addUnknownFields(unknownFields());
        return c1ccv;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", signcert=");
        sb.append(this.signcert);
        sb.replace(0, 2, "FuncParamsXa4a5c3f29571f109{");
        sb.append('}');
        return sb.toString();
    }

    public FuncParamsXa4a5c3f29571f109(ByteString byteString) {
        this(byteString, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FuncParamsXa4a5c3f29571f109)) {
            return false;
        }
        FuncParamsXa4a5c3f29571f109 funcParamsXa4a5c3f29571f109 = (FuncParamsXa4a5c3f29571f109) obj;
        if (unknownFields().equals(funcParamsXa4a5c3f29571f109.unknownFields()) && this.signcert.equals(funcParamsXa4a5c3f29571f109.signcert)) {
            return true;
        }
        return false;
    }

    public FuncParamsXa4a5c3f29571f109(ByteString byteString, ByteString byteString2) {
        super(ADAPTER, byteString2);
        this.signcert = byteString;
    }
}
