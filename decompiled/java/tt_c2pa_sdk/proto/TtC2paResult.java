package tt_c2pa_sdk.proto;

import X.C1CI5;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;
import tt_c2pa_sdk.proto.TtC2paResult;

/* JADX INFO: loaded from: classes35.dex */
public final class TtC2paResult extends Message<TtC2paResult, C1CI5> {
    public static final ProtoAdapter<TtC2paResult> ADAPTER = new ProtoAdapter<TtC2paResult>() { // from class: X.1CI4
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final TtC2paResult decode(ProtoReader protoReader) {
            C1CI5 c1ci5 = new C1CI5();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c1ci5.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                c1ci5.LJFF = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c1ci5.LJ = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c1ci5.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1ci5.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(TtC2paResult ttC2paResult) {
            TtC2paResult ttC2paResult2 = ttC2paResult;
            int iEncodedSizeWithTag = ProtoAdapter.INT64.encodedSizeWithTag(1, ttC2paResult2.error_code);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, ttC2paResult2.error_desc) + protoAdapter.encodedSizeWithTag(3, ttC2paResult2.result_json) + ttC2paResult2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, TtC2paResult ttC2paResult) {
            TtC2paResult ttC2paResult2 = ttC2paResult;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, ttC2paResult2.error_code);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 2, ttC2paResult2.error_desc);
            protoAdapter.encodeWithTag(protoWriter, 3, ttC2paResult2.result_json);
            protoWriter.writeBytes(ttC2paResult2.unknownFields());
        }
    };

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 1)
    public Long error_code;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 2)
    public String error_desc;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 3)
    public String result_json;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.error_code.hashCode()) * 37) + this.error_desc.hashCode()) * 37) + this.result_json.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1CI5 newBuilder() {
        C1CI5 c1ci5 = new C1CI5();
        c1ci5.LIZLLL = this.error_code;
        c1ci5.LJ = this.error_desc;
        c1ci5.LJFF = this.result_json;
        c1ci5.addUnknownFields(unknownFields());
        return c1ci5;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", error_code=");
        sb.append(this.error_code);
        sb.append(", error_desc=");
        sb.append(this.error_desc);
        sb.append(", result_json=");
        sb.append(this.result_json);
        sb.replace(0, 2, "TtC2paResult{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TtC2paResult)) {
            return false;
        }
        TtC2paResult ttC2paResult = (TtC2paResult) obj;
        if (unknownFields().equals(ttC2paResult.unknownFields()) && this.error_code.equals(ttC2paResult.error_code) && this.error_desc.equals(ttC2paResult.error_desc) && this.result_json.equals(ttC2paResult.result_json)) {
            return true;
        }
        return false;
    }

    public TtC2paResult(Long l, String str, String str2) {
        this(l, str, str2, ByteString.EMPTY);
    }

    public TtC2paResult(Long l, String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.error_code = l;
        this.error_desc = str;
        this.result_json = str2;
    }
}
