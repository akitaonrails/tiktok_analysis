package tt_c2pa_sdk.proto;

import X.C1CI1;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;
import tt_c2pa_sdk.proto.TtC2paNetworkResponse;

/* JADX INFO: loaded from: classes35.dex */
public final class TtC2paNetworkResponse extends Message<TtC2paNetworkResponse, C1CI1> {
    public static final ProtoAdapter<TtC2paNetworkResponse> ADAPTER = new ProtoAdapter<TtC2paNetworkResponse>() { // from class: X.1CI0
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final TtC2paNetworkResponse decode(ProtoReader protoReader) {
            C1CI1 c1ci1 = new C1CI1();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                    c1ci1.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                } else {
                                    c1ci1.LJI = ProtoAdapter.BYTES.decode(protoReader);
                                }
                            } else {
                                c1ci1.LJFF = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c1ci1.LJ = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c1ci1.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1ci1.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(TtC2paNetworkResponse ttC2paNetworkResponse) {
            TtC2paNetworkResponse ttC2paNetworkResponse2 = ttC2paNetworkResponse;
            int iEncodedSizeWithTag = ProtoAdapter.INT64.encodedSizeWithTag(1, ttC2paNetworkResponse2.http_status);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, ttC2paNetworkResponse2.error_message) + protoAdapter.encodedSizeWithTag(3, ttC2paNetworkResponse2.content_type) + ProtoAdapter.BYTES.encodedSizeWithTag(4, ttC2paNetworkResponse2.body) + ttC2paNetworkResponse2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, TtC2paNetworkResponse ttC2paNetworkResponse) {
            TtC2paNetworkResponse ttC2paNetworkResponse2 = ttC2paNetworkResponse;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, ttC2paNetworkResponse2.http_status);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 2, ttC2paNetworkResponse2.error_message);
            protoAdapter.encodeWithTag(protoWriter, 3, ttC2paNetworkResponse2.content_type);
            ProtoAdapter.BYTES.encodeWithTag(protoWriter, 4, ttC2paNetworkResponse2.body);
            protoWriter.writeBytes(ttC2paNetworkResponse2.unknownFields());
        }
    };

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = WireField.Label.REQUIRED, tag = 4)
    public ByteString body;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 3)
    public String content_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 2)
    public String error_message;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 1)
    public Long http_status;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + this.http_status.hashCode()) * 37) + this.error_message.hashCode()) * 37) + this.content_type.hashCode()) * 37) + this.body.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1CI1 newBuilder() {
        C1CI1 c1ci1 = new C1CI1();
        c1ci1.LIZLLL = this.http_status;
        c1ci1.LJ = this.error_message;
        c1ci1.LJFF = this.content_type;
        c1ci1.LJI = this.body;
        c1ci1.addUnknownFields(unknownFields());
        return c1ci1;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", http_status=");
        sb.append(this.http_status);
        sb.append(", error_message=");
        sb.append(this.error_message);
        sb.append(", content_type=");
        sb.append(this.content_type);
        sb.append(", body=");
        sb.append(this.body);
        sb.replace(0, 2, "TtC2paNetworkResponse{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TtC2paNetworkResponse)) {
            return false;
        }
        TtC2paNetworkResponse ttC2paNetworkResponse = (TtC2paNetworkResponse) obj;
        if (unknownFields().equals(ttC2paNetworkResponse.unknownFields()) && this.http_status.equals(ttC2paNetworkResponse.http_status) && this.error_message.equals(ttC2paNetworkResponse.error_message) && this.content_type.equals(ttC2paNetworkResponse.content_type) && this.body.equals(ttC2paNetworkResponse.body)) {
            return true;
        }
        return false;
    }

    public TtC2paNetworkResponse(Long l, String str, String str2, ByteString byteString) {
        this(l, str, str2, byteString, ByteString.EMPTY);
    }

    public TtC2paNetworkResponse(Long l, String str, String str2, ByteString byteString, ByteString byteString2) {
        super(ADAPTER, byteString2);
        this.http_status = l;
        this.error_message = str;
        this.content_type = str2;
        this.body = byteString;
    }
}
