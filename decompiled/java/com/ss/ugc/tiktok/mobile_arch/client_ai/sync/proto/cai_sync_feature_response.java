package com.ss.ugc.tiktok.mobile_arch.client_ai.sync.proto;

import X.C1516540pZE;
import X.C2227071CEn;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiBaseResp;
import com.ss.ugc.tiktok.mobile_arch.client_ai.sync.proto.CaiFeatureResp;
import com.ss.ugc.tiktok.mobile_arch.client_ai.sync.proto.cai_sync_feature_response;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class cai_sync_feature_response extends Message<cai_sync_feature_response, C2227071CEn> {
    public static final ProtoAdapter<cai_sync_feature_response> ADAPTER = new ProtoAdapter<cai_sync_feature_response>() { // from class: X.1CEl
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final cai_sync_feature_response decode(ProtoReader protoReader) {
            C2227071CEn c2227071CEn = new C2227071CEn();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2227071CEn.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c2227071CEn.LJ = CaiFeatureResp.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c2227071CEn.LIZLLL = CaiBaseResp.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2227071CEn.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(cai_sync_feature_response cai_sync_feature_responseVar) {
            cai_sync_feature_response cai_sync_feature_responseVar2 = cai_sync_feature_responseVar;
            return CaiBaseResp.ADAPTER.encodedSizeWithTag(1, cai_sync_feature_responseVar2.base_resp) + CaiFeatureResp.ADAPTER.encodedSizeWithTag(2, cai_sync_feature_responseVar2.feature_resp) + cai_sync_feature_responseVar2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, cai_sync_feature_response cai_sync_feature_responseVar) {
            cai_sync_feature_response cai_sync_feature_responseVar2 = cai_sync_feature_responseVar;
            CaiBaseResp.ADAPTER.encodeWithTag(protoWriter, 1, cai_sync_feature_responseVar2.base_resp);
            CaiFeatureResp.ADAPTER.encodeWithTag(protoWriter, 2, cai_sync_feature_responseVar2.feature_resp);
            protoWriter.writeBytes(cai_sync_feature_responseVar2.unknownFields());
        }
    };

    @WireField(adapter = "com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiBaseResp#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public CaiBaseResp base_resp;

    @WireField(adapter = "com.ss.ugc.tiktok.mobile_arch.client_ai.sync.proto.CaiFeatureResp#ADAPTER", tag = 2)
    public CaiFeatureResp feature_resp;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.base_resp.hashCode()) * 37;
        CaiFeatureResp caiFeatureResp = this.feature_resp;
        int iHashCode2 = iHashCode + (caiFeatureResp != null ? caiFeatureResp.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public C2227071CEn newBuilder() {
        C2227071CEn c2227071CEn = new C2227071CEn();
        c2227071CEn.LIZLLL = this.base_resp;
        c2227071CEn.LJ = this.feature_resp;
        c2227071CEn.addUnknownFields(unknownFields());
        return c2227071CEn;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", base_resp=");
        sb.append(this.base_resp);
        if (this.feature_resp != null) {
            sb.append(", feature_resp=");
            sb.append(this.feature_resp);
        }
        sb.replace(0, 2, "cai_sync_feature_response{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cai_sync_feature_response)) {
            return false;
        }
        cai_sync_feature_response cai_sync_feature_responseVar = (cai_sync_feature_response) obj;
        if (unknownFields().equals(cai_sync_feature_responseVar.unknownFields()) && this.base_resp.equals(cai_sync_feature_responseVar.base_resp) && C1516540pZE.LJ(this.feature_resp, cai_sync_feature_responseVar.feature_resp)) {
            return true;
        }
        return false;
    }

    public cai_sync_feature_response(CaiBaseResp caiBaseResp, CaiFeatureResp caiFeatureResp) {
        this(caiBaseResp, caiFeatureResp, ByteString.EMPTY);
    }

    public cai_sync_feature_response(CaiBaseResp caiBaseResp, CaiFeatureResp caiFeatureResp, ByteString byteString) {
        super(ADAPTER, byteString);
        this.base_resp = caiBaseResp;
        this.feature_resp = caiFeatureResp;
    }
}
