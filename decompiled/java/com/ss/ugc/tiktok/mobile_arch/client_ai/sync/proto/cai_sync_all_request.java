package com.ss.ugc.tiktok.mobile_arch.client_ai.sync.proto;

import X.C2227431CFx;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.ss.ugc.tiktok.mobile_arch.client_ai.sync.proto.CaiFeatureReq;
import com.ss.ugc.tiktok.mobile_arch.client_ai.sync.proto.CaiStrategyReq;
import com.ss.ugc.tiktok.mobile_arch.client_ai.sync.proto.CaiValueReq;
import com.ss.ugc.tiktok.mobile_arch.client_ai.sync.proto.cai_sync_all_request;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class cai_sync_all_request extends Message<cai_sync_all_request, C2227431CFx> {
    public static final ProtoAdapter<cai_sync_all_request> ADAPTER = new ProtoAdapter<cai_sync_all_request>() { // from class: X.1CFw
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final cai_sync_all_request decode(ProtoReader protoReader) {
            C2227431CFx c2227431CFx = new C2227431CFx();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c2227431CFx.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                c2227431CFx.LJFF = CaiValueReq.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c2227431CFx.LJ = CaiFeatureReq.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c2227431CFx.LIZLLL = CaiStrategyReq.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2227431CFx.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(cai_sync_all_request cai_sync_all_requestVar) {
            cai_sync_all_request cai_sync_all_requestVar2 = cai_sync_all_requestVar;
            return CaiStrategyReq.ADAPTER.encodedSizeWithTag(1, cai_sync_all_requestVar2.strategy_req) + CaiFeatureReq.ADAPTER.encodedSizeWithTag(2, cai_sync_all_requestVar2.feature_req) + CaiValueReq.ADAPTER.encodedSizeWithTag(3, cai_sync_all_requestVar2.value_req) + cai_sync_all_requestVar2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, cai_sync_all_request cai_sync_all_requestVar) {
            cai_sync_all_request cai_sync_all_requestVar2 = cai_sync_all_requestVar;
            CaiStrategyReq.ADAPTER.encodeWithTag(protoWriter, 1, cai_sync_all_requestVar2.strategy_req);
            CaiFeatureReq.ADAPTER.encodeWithTag(protoWriter, 2, cai_sync_all_requestVar2.feature_req);
            CaiValueReq.ADAPTER.encodeWithTag(protoWriter, 3, cai_sync_all_requestVar2.value_req);
            protoWriter.writeBytes(cai_sync_all_requestVar2.unknownFields());
        }
    };

    @WireField(adapter = "com.ss.ugc.tiktok.mobile_arch.client_ai.sync.proto.CaiFeatureReq#ADAPTER", label = WireField.Label.REQUIRED, tag = 2)
    public CaiFeatureReq feature_req;

    @WireField(adapter = "com.ss.ugc.tiktok.mobile_arch.client_ai.sync.proto.CaiStrategyReq#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public CaiStrategyReq strategy_req;

    @WireField(adapter = "com.ss.ugc.tiktok.mobile_arch.client_ai.sync.proto.CaiValueReq#ADAPTER", label = WireField.Label.REQUIRED, tag = 3)
    public CaiValueReq value_req;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.strategy_req.hashCode()) * 37) + this.feature_req.hashCode()) * 37) + this.value_req.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2227431CFx newBuilder() {
        C2227431CFx c2227431CFx = new C2227431CFx();
        c2227431CFx.LIZLLL = this.strategy_req;
        c2227431CFx.LJ = this.feature_req;
        c2227431CFx.LJFF = this.value_req;
        c2227431CFx.addUnknownFields(unknownFields());
        return c2227431CFx;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", strategy_req=");
        sb.append(this.strategy_req);
        sb.append(", feature_req=");
        sb.append(this.feature_req);
        sb.append(", value_req=");
        sb.append(this.value_req);
        sb.replace(0, 2, "cai_sync_all_request{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cai_sync_all_request)) {
            return false;
        }
        cai_sync_all_request cai_sync_all_requestVar = (cai_sync_all_request) obj;
        if (unknownFields().equals(cai_sync_all_requestVar.unknownFields()) && this.strategy_req.equals(cai_sync_all_requestVar.strategy_req) && this.feature_req.equals(cai_sync_all_requestVar.feature_req) && this.value_req.equals(cai_sync_all_requestVar.value_req)) {
            return true;
        }
        return false;
    }

    public cai_sync_all_request(CaiStrategyReq caiStrategyReq, CaiFeatureReq caiFeatureReq, CaiValueReq caiValueReq) {
        this(caiStrategyReq, caiFeatureReq, caiValueReq, ByteString.EMPTY);
    }

    public cai_sync_all_request(CaiStrategyReq caiStrategyReq, CaiFeatureReq caiFeatureReq, CaiValueReq caiValueReq, ByteString byteString) {
        super(ADAPTER, byteString);
        this.strategy_req = caiStrategyReq;
        this.feature_req = caiFeatureReq;
        this.value_req = caiValueReq;
    }
}
