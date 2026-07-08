package com.ss.ugc.tiktok.mobile_arch.client_ai.sync.proto;

import X.C1516540pZE;
import X.C2227021CEi;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiBaseResp;
import com.ss.ugc.tiktok.mobile_arch.client_ai.sync.proto.CaiFeatureResp;
import com.ss.ugc.tiktok.mobile_arch.client_ai.sync.proto.CaiStrategyResp;
import com.ss.ugc.tiktok.mobile_arch.client_ai.sync.proto.CaiValueResp;
import com.ss.ugc.tiktok.mobile_arch.client_ai.sync.proto.cai_sync_all_response;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class cai_sync_all_response extends Message<cai_sync_all_response, C2227021CEi> {
    public static final ProtoAdapter<cai_sync_all_response> ADAPTER = new ProtoAdapter<cai_sync_all_response>() { // from class: X.1CEh
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final cai_sync_all_response decode(ProtoReader protoReader) {
            C2227021CEi c2227021CEi = new C2227021CEi();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                    c2227021CEi.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                } else {
                                    c2227021CEi.LJI = CaiValueResp.ADAPTER.decode(protoReader);
                                }
                            } else {
                                c2227021CEi.LJFF = CaiFeatureResp.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c2227021CEi.LJ = CaiStrategyResp.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c2227021CEi.LIZLLL = CaiBaseResp.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2227021CEi.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(cai_sync_all_response cai_sync_all_responseVar) {
            cai_sync_all_response cai_sync_all_responseVar2 = cai_sync_all_responseVar;
            return CaiBaseResp.ADAPTER.encodedSizeWithTag(1, cai_sync_all_responseVar2.base_resp) + CaiStrategyResp.ADAPTER.encodedSizeWithTag(2, cai_sync_all_responseVar2.strategy_resp) + CaiFeatureResp.ADAPTER.encodedSizeWithTag(3, cai_sync_all_responseVar2.feature_resp) + CaiValueResp.ADAPTER.encodedSizeWithTag(4, cai_sync_all_responseVar2.value_resp) + cai_sync_all_responseVar2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, cai_sync_all_response cai_sync_all_responseVar) {
            cai_sync_all_response cai_sync_all_responseVar2 = cai_sync_all_responseVar;
            CaiBaseResp.ADAPTER.encodeWithTag(protoWriter, 1, cai_sync_all_responseVar2.base_resp);
            CaiStrategyResp.ADAPTER.encodeWithTag(protoWriter, 2, cai_sync_all_responseVar2.strategy_resp);
            CaiFeatureResp.ADAPTER.encodeWithTag(protoWriter, 3, cai_sync_all_responseVar2.feature_resp);
            CaiValueResp.ADAPTER.encodeWithTag(protoWriter, 4, cai_sync_all_responseVar2.value_resp);
            protoWriter.writeBytes(cai_sync_all_responseVar2.unknownFields());
        }
    };

    @WireField(adapter = "com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiBaseResp#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public CaiBaseResp base_resp;

    @WireField(adapter = "com.ss.ugc.tiktok.mobile_arch.client_ai.sync.proto.CaiFeatureResp#ADAPTER", tag = 3)
    public CaiFeatureResp feature_resp;

    @WireField(adapter = "com.ss.ugc.tiktok.mobile_arch.client_ai.sync.proto.CaiStrategyResp#ADAPTER", tag = 2)
    public CaiStrategyResp strategy_resp;

    @WireField(adapter = "com.ss.ugc.tiktok.mobile_arch.client_ai.sync.proto.CaiValueResp#ADAPTER", tag = 4)
    public CaiValueResp value_resp;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.base_resp.hashCode()) * 37;
        CaiStrategyResp caiStrategyResp = this.strategy_resp;
        int iHashCode2 = (iHashCode + (caiStrategyResp != null ? caiStrategyResp.hashCode() : 0)) * 37;
        CaiFeatureResp caiFeatureResp = this.feature_resp;
        int iHashCode3 = (iHashCode2 + (caiFeatureResp != null ? caiFeatureResp.hashCode() : 0)) * 37;
        CaiValueResp caiValueResp = this.value_resp;
        int iHashCode4 = iHashCode3 + (caiValueResp != null ? caiValueResp.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public C2227021CEi newBuilder() {
        C2227021CEi c2227021CEi = new C2227021CEi();
        c2227021CEi.LIZLLL = this.base_resp;
        c2227021CEi.LJ = this.strategy_resp;
        c2227021CEi.LJFF = this.feature_resp;
        c2227021CEi.LJI = this.value_resp;
        c2227021CEi.addUnknownFields(unknownFields());
        return c2227021CEi;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", base_resp=");
        sb.append(this.base_resp);
        if (this.strategy_resp != null) {
            sb.append(", strategy_resp=");
            sb.append(this.strategy_resp);
        }
        if (this.feature_resp != null) {
            sb.append(", feature_resp=");
            sb.append(this.feature_resp);
        }
        if (this.value_resp != null) {
            sb.append(", value_resp=");
            sb.append(this.value_resp);
        }
        sb.replace(0, 2, "cai_sync_all_response{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cai_sync_all_response)) {
            return false;
        }
        cai_sync_all_response cai_sync_all_responseVar = (cai_sync_all_response) obj;
        if (unknownFields().equals(cai_sync_all_responseVar.unknownFields()) && this.base_resp.equals(cai_sync_all_responseVar.base_resp) && C1516540pZE.LJ(this.strategy_resp, cai_sync_all_responseVar.strategy_resp) && C1516540pZE.LJ(this.feature_resp, cai_sync_all_responseVar.feature_resp) && C1516540pZE.LJ(this.value_resp, cai_sync_all_responseVar.value_resp)) {
            return true;
        }
        return false;
    }

    public cai_sync_all_response(CaiBaseResp caiBaseResp, CaiStrategyResp caiStrategyResp, CaiFeatureResp caiFeatureResp, CaiValueResp caiValueResp) {
        this(caiBaseResp, caiStrategyResp, caiFeatureResp, caiValueResp, ByteString.EMPTY);
    }

    public cai_sync_all_response(CaiBaseResp caiBaseResp, CaiStrategyResp caiStrategyResp, CaiFeatureResp caiFeatureResp, CaiValueResp caiValueResp, ByteString byteString) {
        super(ADAPTER, byteString);
        this.base_resp = caiBaseResp;
        this.strategy_resp = caiStrategyResp;
        this.feature_resp = caiFeatureResp;
        this.value_resp = caiValueResp;
    }
}
