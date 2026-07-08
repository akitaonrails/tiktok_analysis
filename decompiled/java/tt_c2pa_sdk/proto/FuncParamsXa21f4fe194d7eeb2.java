package tt_c2pa_sdk.proto;

import X.C1516540pZE;
import X.C1C9Z;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import java.util.Map;
import okio.ByteString;
import tt_c2pa_sdk.proto.FuncParamsXa21f4fe194d7eeb2;

/* JADX INFO: loaded from: classes35.dex */
public final class FuncParamsXa21f4fe194d7eeb2 extends Message<FuncParamsXa21f4fe194d7eeb2, C1C9Z> {
    public static final ProtoAdapter<FuncParamsXa21f4fe194d7eeb2> ADAPTER = new ProtoAdapter<FuncParamsXa21f4fe194d7eeb2>() { // from class: X.1C9Y
        public final ProtoAdapter<Map<String, String>> LIZ;

        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.LIZ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final FuncParamsXa21f4fe194d7eeb2 decode(ProtoReader protoReader) {
            C1C9Z c1c9z = new C1C9Z();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    if (iNextTag != 5) {
                                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                        c1c9z.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                    } else {
                                        c1c9z.LJII = ProtoAdapter.BOOL.decode(protoReader);
                                    }
                                } else {
                                    c1c9z.LJI = ProtoAdapter.INT64.decode(protoReader);
                                }
                            } else {
                                c1c9z.LJFF = ProtoAdapter.BYTES.decode(protoReader);
                            }
                        } else {
                            c1c9z.LJ.putAll(this.LIZ.decode(protoReader));
                        }
                    } else {
                        c1c9z.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1c9z.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(FuncParamsXa21f4fe194d7eeb2 funcParamsXa21f4fe194d7eeb2) {
            FuncParamsXa21f4fe194d7eeb2 funcParamsXa21f4fe194d7eeb22 = funcParamsXa21f4fe194d7eeb2;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, funcParamsXa21f4fe194d7eeb22.url) + this.LIZ.encodedSizeWithTag(2, funcParamsXa21f4fe194d7eeb22.headers) + ProtoAdapter.BYTES.encodedSizeWithTag(3, funcParamsXa21f4fe194d7eeb22.body) + ProtoAdapter.INT64.encodedSizeWithTag(4, funcParamsXa21f4fe194d7eeb22.timeout_ms) + ProtoAdapter.BOOL.encodedSizeWithTag(5, funcParamsXa21f4fe194d7eeb22.add_comm_param) + funcParamsXa21f4fe194d7eeb22.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, FuncParamsXa21f4fe194d7eeb2 funcParamsXa21f4fe194d7eeb2) {
            FuncParamsXa21f4fe194d7eeb2 funcParamsXa21f4fe194d7eeb22 = funcParamsXa21f4fe194d7eeb2;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, funcParamsXa21f4fe194d7eeb22.url);
            this.LIZ.encodeWithTag(protoWriter, 2, funcParamsXa21f4fe194d7eeb22.headers);
            ProtoAdapter.BYTES.encodeWithTag(protoWriter, 3, funcParamsXa21f4fe194d7eeb22.body);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, funcParamsXa21f4fe194d7eeb22.timeout_ms);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, funcParamsXa21f4fe194d7eeb22.add_comm_param);
            protoWriter.writeBytes(funcParamsXa21f4fe194d7eeb22.unknownFields());
        }
    };

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.REQUIRED, tag = 5)
    public Boolean add_comm_param;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = WireField.Label.REQUIRED, tag = 3)
    public ByteString body;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public Map<String, String> headers;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 4)
    public Long timeout_ms;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public String url;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((unknownFields().hashCode() * 37) + this.url.hashCode()) * 37) + this.headers.hashCode()) * 37) + this.body.hashCode()) * 37) + this.timeout_ms.hashCode()) * 37) + this.add_comm_param.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1C9Z newBuilder() {
        C1C9Z c1c9z = new C1C9Z();
        c1c9z.LIZLLL = this.url;
        c1c9z.LJ = C1516540pZE.LIZLLL("headers", this.headers);
        c1c9z.LJFF = this.body;
        c1c9z.LJI = this.timeout_ms;
        c1c9z.LJII = this.add_comm_param;
        c1c9z.addUnknownFields(unknownFields());
        return c1c9z;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", url=");
        sb.append(this.url);
        if (!this.headers.isEmpty()) {
            sb.append(", headers=");
            sb.append(this.headers);
        }
        sb.append(", body=");
        sb.append(this.body);
        sb.append(", timeout_ms=");
        sb.append(this.timeout_ms);
        sb.append(", add_comm_param=");
        sb.append(this.add_comm_param);
        sb.replace(0, 2, "FuncParamsXa21f4fe194d7eeb2{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FuncParamsXa21f4fe194d7eeb2)) {
            return false;
        }
        FuncParamsXa21f4fe194d7eeb2 funcParamsXa21f4fe194d7eeb2 = (FuncParamsXa21f4fe194d7eeb2) obj;
        if (unknownFields().equals(funcParamsXa21f4fe194d7eeb2.unknownFields()) && this.url.equals(funcParamsXa21f4fe194d7eeb2.url) && this.headers.equals(funcParamsXa21f4fe194d7eeb2.headers) && this.body.equals(funcParamsXa21f4fe194d7eeb2.body) && this.timeout_ms.equals(funcParamsXa21f4fe194d7eeb2.timeout_ms) && this.add_comm_param.equals(funcParamsXa21f4fe194d7eeb2.add_comm_param)) {
            return true;
        }
        return false;
    }

    public FuncParamsXa21f4fe194d7eeb2(String str, Map<String, String> map, ByteString byteString, Long l, Boolean bool) {
        this(str, map, byteString, l, bool, ByteString.EMPTY);
    }

    public FuncParamsXa21f4fe194d7eeb2(String str, Map<String, String> map, ByteString byteString, Long l, Boolean bool, ByteString byteString2) {
        super(ADAPTER, byteString2);
        this.url = str;
        this.headers = C1516540pZE.LJI("headers", map);
        this.body = byteString;
        this.timeout_ms = l;
        this.add_comm_param = bool;
    }
}
