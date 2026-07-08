package com.ss.ugc.tiktok.mobile_arch.client_ai.sync.proto;

import X.C1516540pZE;
import X.C2227081CEo;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiBaseResp;
import com.ss.ugc.tiktok.mobile_arch.client_ai.sync.proto.CaiValueResp;
import com.ss.ugc.tiktok.mobile_arch.client_ai.sync.proto.cai_sync_value_response;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class cai_sync_value_response extends Message<cai_sync_value_response, C2227081CEo> {
    public static final ProtoAdapter<cai_sync_value_response> ADAPTER = new ProtoAdapter<cai_sync_value_response>() { // from class: X.1CEm
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final cai_sync_value_response decode(ProtoReader protoReader) {
            C2227081CEo c2227081CEo = new C2227081CEo();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2227081CEo.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c2227081CEo.LJ = CaiValueResp.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c2227081CEo.LIZLLL = CaiBaseResp.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2227081CEo.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(cai_sync_value_response cai_sync_value_responseVar) {
            cai_sync_value_response cai_sync_value_responseVar2 = cai_sync_value_responseVar;
            return CaiBaseResp.ADAPTER.encodedSizeWithTag(1, cai_sync_value_responseVar2.base_resp) + CaiValueResp.ADAPTER.encodedSizeWithTag(2, cai_sync_value_responseVar2.value_resp) + cai_sync_value_responseVar2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, cai_sync_value_response cai_sync_value_responseVar) {
            cai_sync_value_response cai_sync_value_responseVar2 = cai_sync_value_responseVar;
            CaiBaseResp.ADAPTER.encodeWithTag(protoWriter, 1, cai_sync_value_responseVar2.base_resp);
            CaiValueResp.ADAPTER.encodeWithTag(protoWriter, 2, cai_sync_value_responseVar2.value_resp);
            protoWriter.writeBytes(cai_sync_value_responseVar2.unknownFields());
        }
    };

    @WireField(adapter = "com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiBaseResp#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public CaiBaseResp base_resp;

    @WireField(adapter = "com.ss.ugc.tiktok.mobile_arch.client_ai.sync.proto.CaiValueResp#ADAPTER", tag = 2)
    public CaiValueResp value_resp;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.base_resp.hashCode()) * 37;
        CaiValueResp caiValueResp = this.value_resp;
        int iHashCode2 = iHashCode + (caiValueResp != null ? caiValueResp.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public C2227081CEo newBuilder() {
        C2227081CEo c2227081CEo = new C2227081CEo();
        c2227081CEo.LIZLLL = this.base_resp;
        c2227081CEo.LJ = this.value_resp;
        c2227081CEo.addUnknownFields(unknownFields());
        return c2227081CEo;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", base_resp=");
        sb.append(this.base_resp);
        if (this.value_resp != null) {
            sb.append(", value_resp=");
            sb.append(this.value_resp);
        }
        sb.replace(0, 2, "cai_sync_value_response{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cai_sync_value_response)) {
            return false;
        }
        cai_sync_value_response cai_sync_value_responseVar = (cai_sync_value_response) obj;
        if (unknownFields().equals(cai_sync_value_responseVar.unknownFields()) && this.base_resp.equals(cai_sync_value_responseVar.base_resp) && C1516540pZE.LJ(this.value_resp, cai_sync_value_responseVar.value_resp)) {
            return true;
        }
        return false;
    }

    public cai_sync_value_response(CaiBaseResp caiBaseResp, CaiValueResp caiValueResp) {
        this(caiBaseResp, caiValueResp, ByteString.EMPTY);
    }

    public cai_sync_value_response(CaiBaseResp caiBaseResp, CaiValueResp caiValueResp, ByteString byteString) {
        super(ADAPTER, byteString);
        this.base_resp = caiBaseResp;
        this.value_resp = caiValueResp;
    }
}
