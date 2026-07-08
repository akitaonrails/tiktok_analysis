package tt_c2pa_sdk.proto;

import X.C1CID;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import okio.ByteString;
import tt_c2pa_sdk.proto.FuncParamsX111419d20c7a3f6d;
import tt_c2pa_sdk.proto.MoltenFfiInstanceMsg;

/* JADX INFO: loaded from: classes35.dex */
public final class FuncParamsX111419d20c7a3f6d extends Message<FuncParamsX111419d20c7a3f6d, C1CID> {
    public static final ProtoAdapter<FuncParamsX111419d20c7a3f6d> ADAPTER = new ProtoAdapter<FuncParamsX111419d20c7a3f6d>() { // from class: X.1CIC
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final FuncParamsX111419d20c7a3f6d decode(ProtoReader protoReader) {
            C1CID c1cid = new C1CID();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c1cid.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c1cid.LJ = ProtoAdapter.BYTES.decode(protoReader);
                            break;
                        case 3:
                            c1cid.LJFF = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c1cid.LJI = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c1cid.LJII = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 6:
                            c1cid.LJIIIIZZ = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 7:
                            c1cid.LJIIIZ = MoltenFfiInstanceMsg.ADAPTER.decode(protoReader);
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c1cid.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cid.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(FuncParamsX111419d20c7a3f6d funcParamsX111419d20c7a3f6d) {
            FuncParamsX111419d20c7a3f6d funcParamsX111419d20c7a3f6d2 = funcParamsX111419d20c7a3f6d;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, funcParamsX111419d20c7a3f6d2.manifest_json) + ProtoAdapter.BYTES.encodedSizeWithTag(2, funcParamsX111419d20c7a3f6d2.signcert) + protoAdapter.encodedSizeWithTag(3, funcParamsX111419d20c7a3f6d2.cert_fingerprint) + protoAdapter.encodedSizeWithTag(4, funcParamsX111419d20c7a3f6d2.tsa_url) + ProtoAdapter.INT64.encodedSizeWithTag(5, funcParamsX111419d20c7a3f6d2.tsa_timeout_ms) + ProtoAdapter.BOOL.encodedSizeWithTag(6, funcParamsX111419d20c7a3f6d2.write_directly) + MoltenFfiInstanceMsg.ADAPTER.encodedSizeWithTag(7, funcParamsX111419d20c7a3f6d2.network_caller) + funcParamsX111419d20c7a3f6d2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, FuncParamsX111419d20c7a3f6d funcParamsX111419d20c7a3f6d) {
            FuncParamsX111419d20c7a3f6d funcParamsX111419d20c7a3f6d2 = funcParamsX111419d20c7a3f6d;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, funcParamsX111419d20c7a3f6d2.manifest_json);
            ProtoAdapter.BYTES.encodeWithTag(protoWriter, 2, funcParamsX111419d20c7a3f6d2.signcert);
            protoAdapter.encodeWithTag(protoWriter, 3, funcParamsX111419d20c7a3f6d2.cert_fingerprint);
            protoAdapter.encodeWithTag(protoWriter, 4, funcParamsX111419d20c7a3f6d2.tsa_url);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 5, funcParamsX111419d20c7a3f6d2.tsa_timeout_ms);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, funcParamsX111419d20c7a3f6d2.write_directly);
            MoltenFfiInstanceMsg.ADAPTER.encodeWithTag(protoWriter, 7, funcParamsX111419d20c7a3f6d2.network_caller);
            protoWriter.writeBytes(funcParamsX111419d20c7a3f6d2.unknownFields());
        }
    };

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 3)
    public String cert_fingerprint;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public String manifest_json;

    @WireField(adapter = "tt_c2pa_sdk.proto.MoltenFfiInstanceMsg#ADAPTER", label = WireField.Label.REQUIRED, tag = 7)
    public MoltenFfiInstanceMsg network_caller;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = WireField.Label.REQUIRED, tag = 2)
    public ByteString signcert;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", label = WireField.Label.REQUIRED, tag = 5)
    public Long tsa_timeout_ms;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 4)
    public String tsa_url;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.REQUIRED, tag = 6)
    public Boolean write_directly;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((((((unknownFields().hashCode() * 37) + this.manifest_json.hashCode()) * 37) + this.signcert.hashCode()) * 37) + this.cert_fingerprint.hashCode()) * 37) + this.tsa_url.hashCode()) * 37) + this.tsa_timeout_ms.hashCode()) * 37) + this.write_directly.hashCode()) * 37) + this.network_caller.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1CID newBuilder() {
        C1CID c1cid = new C1CID();
        c1cid.LIZLLL = this.manifest_json;
        c1cid.LJ = this.signcert;
        c1cid.LJFF = this.cert_fingerprint;
        c1cid.LJI = this.tsa_url;
        c1cid.LJII = this.tsa_timeout_ms;
        c1cid.LJIIIIZZ = this.write_directly;
        c1cid.LJIIIZ = this.network_caller;
        c1cid.addUnknownFields(unknownFields());
        return c1cid;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", manifest_json=");
        sb.append(this.manifest_json);
        sb.append(", signcert=");
        sb.append(this.signcert);
        sb.append(", cert_fingerprint=");
        sb.append(this.cert_fingerprint);
        sb.append(", tsa_url=");
        sb.append(this.tsa_url);
        sb.append(", tsa_timeout_ms=");
        sb.append(this.tsa_timeout_ms);
        sb.append(", write_directly=");
        sb.append(this.write_directly);
        sb.append(", network_caller=");
        sb.append(this.network_caller);
        sb.replace(0, 2, "FuncParamsX111419d20c7a3f6d{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FuncParamsX111419d20c7a3f6d)) {
            return false;
        }
        FuncParamsX111419d20c7a3f6d funcParamsX111419d20c7a3f6d = (FuncParamsX111419d20c7a3f6d) obj;
        if (unknownFields().equals(funcParamsX111419d20c7a3f6d.unknownFields()) && this.manifest_json.equals(funcParamsX111419d20c7a3f6d.manifest_json) && this.signcert.equals(funcParamsX111419d20c7a3f6d.signcert) && this.cert_fingerprint.equals(funcParamsX111419d20c7a3f6d.cert_fingerprint) && this.tsa_url.equals(funcParamsX111419d20c7a3f6d.tsa_url) && this.tsa_timeout_ms.equals(funcParamsX111419d20c7a3f6d.tsa_timeout_ms) && this.write_directly.equals(funcParamsX111419d20c7a3f6d.write_directly) && this.network_caller.equals(funcParamsX111419d20c7a3f6d.network_caller)) {
            return true;
        }
        return false;
    }

    public FuncParamsX111419d20c7a3f6d(String str, ByteString byteString, String str2, String str3, Long l, Boolean bool, MoltenFfiInstanceMsg moltenFfiInstanceMsg) {
        this(str, byteString, str2, str3, l, bool, moltenFfiInstanceMsg, ByteString.EMPTY);
    }

    public FuncParamsX111419d20c7a3f6d(String str, ByteString byteString, String str2, String str3, Long l, Boolean bool, MoltenFfiInstanceMsg moltenFfiInstanceMsg, ByteString byteString2) {
        super(ADAPTER, byteString2);
        this.manifest_json = str;
        this.signcert = byteString;
        this.cert_fingerprint = str2;
        this.tsa_url = str3;
        this.tsa_timeout_ms = l;
        this.write_directly = bool;
        this.network_caller = moltenFfiInstanceMsg;
    }
}
