package com.ss.ugc.tiktok.mobile_arch.client_ai.sync.proto;

import X.C2227041CEk;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiBaseResp;
import com.ss.ugc.tiktok.mobile_arch.client_ai.sync.proto.CaiStrategyResp;
import com.ss.ugc.tiktok.mobile_arch.client_ai.sync.proto.cai_sync_strategy_response;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class cai_sync_strategy_response extends Message<cai_sync_strategy_response, C2227041CEk> {
    public static final ProtoAdapter<cai_sync_strategy_response> ADAPTER = new ProtoAdapter<cai_sync_strategy_response>() { // from class: X.1CEj
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final cai_sync_strategy_response decode(ProtoReader protoReader) {
            C2227041CEk c2227041CEk = new C2227041CEk();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2227041CEk.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c2227041CEk.LJ = CaiStrategyResp.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c2227041CEk.LIZLLL = CaiBaseResp.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2227041CEk.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(cai_sync_strategy_response cai_sync_strategy_responseVar) {
            cai_sync_strategy_response cai_sync_strategy_responseVar2 = cai_sync_strategy_responseVar;
            return CaiBaseResp.ADAPTER.encodedSizeWithTag(1, cai_sync_strategy_responseVar2.base_resp) + CaiStrategyResp.ADAPTER.encodedSizeWithTag(2, cai_sync_strategy_responseVar2.strategy_resp) + cai_sync_strategy_responseVar2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, cai_sync_strategy_response cai_sync_strategy_responseVar) {
            cai_sync_strategy_response cai_sync_strategy_responseVar2 = cai_sync_strategy_responseVar;
            CaiBaseResp.ADAPTER.encodeWithTag(protoWriter, 1, cai_sync_strategy_responseVar2.base_resp);
            CaiStrategyResp.ADAPTER.encodeWithTag(protoWriter, 2, cai_sync_strategy_responseVar2.strategy_resp);
            protoWriter.writeBytes(cai_sync_strategy_responseVar2.unknownFields());
        }
    };

    @WireField(adapter = "com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiBaseResp#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public CaiBaseResp base_resp;

    @WireField(adapter = "com.ss.ugc.tiktok.mobile_arch.client_ai.sync.proto.CaiStrategyResp#ADAPTER", label = WireField.Label.REQUIRED, tag = 2)
    public CaiStrategyResp strategy_resp;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.base_resp.hashCode()) * 37) + this.strategy_resp.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2227041CEk newBuilder() {
        C2227041CEk c2227041CEk = new C2227041CEk();
        c2227041CEk.LIZLLL = this.base_resp;
        c2227041CEk.LJ = this.strategy_resp;
        c2227041CEk.addUnknownFields(unknownFields());
        return c2227041CEk;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", base_resp=");
        sb.append(this.base_resp);
        sb.append(", strategy_resp=");
        sb.append(this.strategy_resp);
        sb.replace(0, 2, "cai_sync_strategy_response{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cai_sync_strategy_response)) {
            return false;
        }
        cai_sync_strategy_response cai_sync_strategy_responseVar = (cai_sync_strategy_response) obj;
        if (unknownFields().equals(cai_sync_strategy_responseVar.unknownFields()) && this.base_resp.equals(cai_sync_strategy_responseVar.base_resp) && this.strategy_resp.equals(cai_sync_strategy_responseVar.strategy_resp)) {
            return true;
        }
        return false;
    }

    public cai_sync_strategy_response(CaiBaseResp caiBaseResp, CaiStrategyResp caiStrategyResp) {
        this(caiBaseResp, caiStrategyResp, ByteString.EMPTY);
    }

    public cai_sync_strategy_response(CaiBaseResp caiBaseResp, CaiStrategyResp caiStrategyResp, ByteString byteString) {
        super(ADAPTER, byteString);
        this.base_resp = caiBaseResp;
        this.strategy_resp = caiStrategyResp;
    }
}
