package tt_c2pa_sdk.proto;

import X.C2226481CCg;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;
import tt_c2pa_sdk.proto.FuncParamsXb0a419649fe6caae;

/* JADX INFO: loaded from: classes35.dex */
public final class FuncParamsXb0a419649fe6caae extends Message<FuncParamsXb0a419649fe6caae, C2226481CCg> {
    public static final ProtoAdapter<FuncParamsXb0a419649fe6caae> ADAPTER = new ProtoAdapter<FuncParamsXb0a419649fe6caae>() { // from class: X.1CCf
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final FuncParamsXb0a419649fe6caae decode(ProtoReader protoReader) {
            C2226481CCg c2226481CCg = new C2226481CCg();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c2226481CCg.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c2226481CCg.LIZLLL = ProtoAdapter.BYTES.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2226481CCg.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(FuncParamsXb0a419649fe6caae funcParamsXb0a419649fe6caae) {
            FuncParamsXb0a419649fe6caae funcParamsXb0a419649fe6caae2 = funcParamsXb0a419649fe6caae;
            return ProtoAdapter.BYTES.encodedSizeWithTag(1, funcParamsXb0a419649fe6caae2.request_body) + funcParamsXb0a419649fe6caae2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, FuncParamsXb0a419649fe6caae funcParamsXb0a419649fe6caae) {
            FuncParamsXb0a419649fe6caae funcParamsXb0a419649fe6caae2 = funcParamsXb0a419649fe6caae;
            ProtoAdapter.BYTES.encodeWithTag(protoWriter, 1, funcParamsXb0a419649fe6caae2.request_body);
            protoWriter.writeBytes(funcParamsXb0a419649fe6caae2.unknownFields());
        }
    };

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = WireField.Label.REQUIRED, tag = 1)
    public ByteString request_body;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.request_body.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2226481CCg newBuilder() {
        C2226481CCg c2226481CCg = new C2226481CCg();
        c2226481CCg.LIZLLL = this.request_body;
        c2226481CCg.addUnknownFields(unknownFields());
        return c2226481CCg;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", request_body=");
        sb.append(this.request_body);
        sb.replace(0, 2, "FuncParamsXb0a419649fe6caae{");
        sb.append('}');
        return sb.toString();
    }

    public FuncParamsXb0a419649fe6caae(ByteString byteString) {
        this(byteString, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FuncParamsXb0a419649fe6caae)) {
            return false;
        }
        FuncParamsXb0a419649fe6caae funcParamsXb0a419649fe6caae = (FuncParamsXb0a419649fe6caae) obj;
        if (unknownFields().equals(funcParamsXb0a419649fe6caae.unknownFields()) && this.request_body.equals(funcParamsXb0a419649fe6caae.request_body)) {
            return true;
        }
        return false;
    }

    public FuncParamsXb0a419649fe6caae(ByteString byteString, ByteString byteString2) {
        super(ADAPTER, byteString2);
        this.request_body = byteString;
    }
}
