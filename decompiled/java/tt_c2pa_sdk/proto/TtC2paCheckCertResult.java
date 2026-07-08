package tt_c2pa_sdk.proto;

import X.C1CI9;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;
import tt_c2pa_sdk.proto.TtC2paCheckCertResult;

/* JADX INFO: loaded from: classes35.dex */
public final class TtC2paCheckCertResult extends Message<TtC2paCheckCertResult, C1CI9> {
    public static final ProtoAdapter<TtC2paCheckCertResult> ADAPTER = new ProtoAdapter<TtC2paCheckCertResult>() { // from class: X.1CI8
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final TtC2paCheckCertResult decode(ProtoReader protoReader) {
            C1CI9 c1ci9 = new C1CI9();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c1ci9.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c1ci9.LJ = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c1ci9.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1ci9.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(TtC2paCheckCertResult ttC2paCheckCertResult) {
            TtC2paCheckCertResult ttC2paCheckCertResult2 = ttC2paCheckCertResult;
            return ProtoAdapter.INT64.encodedSizeWithTag(1, ttC2paCheckCertResult2.cert_count) + ProtoAdapter.STRING.encodedSizeWithTag(2, ttC2paCheckCertResult2.error_message) + ttC2paCheckCertResult2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, TtC2paCheckCertResult ttC2paCheckCertResult) {
            TtC2paCheckCertResult ttC2paCheckCertResult2 = ttC2paCheckCertResult;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, ttC2paCheckCertResult2.cert_count);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, ttC2paCheckCertResult2.error_message);
            protoWriter.writeBytes(ttC2paCheckCertResult2.unknownFields());
        }
    };

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 1)
    public Long cert_count;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 2)
    public String error_message;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.cert_count.hashCode()) * 37) + this.error_message.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1CI9 newBuilder() {
        C1CI9 c1ci9 = new C1CI9();
        c1ci9.LIZLLL = this.cert_count;
        c1ci9.LJ = this.error_message;
        c1ci9.addUnknownFields(unknownFields());
        return c1ci9;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", cert_count=");
        sb.append(this.cert_count);
        sb.append(", error_message=");
        sb.append(this.error_message);
        sb.replace(0, 2, "TtC2paCheckCertResult{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TtC2paCheckCertResult)) {
            return false;
        }
        TtC2paCheckCertResult ttC2paCheckCertResult = (TtC2paCheckCertResult) obj;
        if (unknownFields().equals(ttC2paCheckCertResult.unknownFields()) && this.cert_count.equals(ttC2paCheckCertResult.cert_count) && this.error_message.equals(ttC2paCheckCertResult.error_message)) {
            return true;
        }
        return false;
    }

    public TtC2paCheckCertResult(Long l, String str) {
        this(l, str, ByteString.EMPTY);
    }

    public TtC2paCheckCertResult(Long l, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.cert_count = l;
        this.error_message = str;
    }
}
