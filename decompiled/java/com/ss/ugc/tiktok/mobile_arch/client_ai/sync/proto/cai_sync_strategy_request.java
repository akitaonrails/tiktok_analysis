package com.ss.ugc.tiktok.mobile_arch.client_ai.sync.proto;

import X.C2227411CFv;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.ss.ugc.tiktok.mobile_arch.client_ai.sync.proto.CaiStrategyReq;
import com.ss.ugc.tiktok.mobile_arch.client_ai.sync.proto.cai_sync_strategy_request;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class cai_sync_strategy_request extends Message<cai_sync_strategy_request, C2227411CFv> {
    public static final ProtoAdapter<cai_sync_strategy_request> ADAPTER = new ProtoAdapter<cai_sync_strategy_request>() { // from class: X.1CFu
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final cai_sync_strategy_request decode(ProtoReader protoReader) {
            C2227411CFv c2227411CFv = new C2227411CFv();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c2227411CFv.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c2227411CFv.LIZLLL = CaiStrategyReq.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2227411CFv.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(cai_sync_strategy_request cai_sync_strategy_requestVar) {
            cai_sync_strategy_request cai_sync_strategy_requestVar2 = cai_sync_strategy_requestVar;
            return CaiStrategyReq.ADAPTER.encodedSizeWithTag(1, cai_sync_strategy_requestVar2.strategy_req) + cai_sync_strategy_requestVar2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, cai_sync_strategy_request cai_sync_strategy_requestVar) {
            cai_sync_strategy_request cai_sync_strategy_requestVar2 = cai_sync_strategy_requestVar;
            CaiStrategyReq.ADAPTER.encodeWithTag(protoWriter, 1, cai_sync_strategy_requestVar2.strategy_req);
            protoWriter.writeBytes(cai_sync_strategy_requestVar2.unknownFields());
        }
    };

    @WireField(adapter = "com.ss.ugc.tiktok.mobile_arch.client_ai.sync.proto.CaiStrategyReq#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public CaiStrategyReq strategy_req;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.strategy_req.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2227411CFv newBuilder() {
        C2227411CFv c2227411CFv = new C2227411CFv();
        c2227411CFv.LIZLLL = this.strategy_req;
        c2227411CFv.addUnknownFields(unknownFields());
        return c2227411CFv;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", strategy_req=");
        sb.append(this.strategy_req);
        sb.replace(0, 2, "cai_sync_strategy_request{");
        sb.append('}');
        return sb.toString();
    }

    public cai_sync_strategy_request(CaiStrategyReq caiStrategyReq) {
        this(caiStrategyReq, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cai_sync_strategy_request)) {
            return false;
        }
        cai_sync_strategy_request cai_sync_strategy_requestVar = (cai_sync_strategy_request) obj;
        if (unknownFields().equals(cai_sync_strategy_requestVar.unknownFields()) && this.strategy_req.equals(cai_sync_strategy_requestVar.strategy_req)) {
            return true;
        }
        return false;
    }

    public cai_sync_strategy_request(CaiStrategyReq caiStrategyReq, ByteString byteString) {
        super(ADAPTER, byteString);
        this.strategy_req = caiStrategyReq;
    }
}
