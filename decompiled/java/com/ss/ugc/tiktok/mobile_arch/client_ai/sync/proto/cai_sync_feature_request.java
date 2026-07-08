package com.ss.ugc.tiktok.mobile_arch.client_ai.sync.proto;

import X.C2227451CFz;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.ss.ugc.tiktok.mobile_arch.client_ai.sync.proto.CaiFeatureReq;
import com.ss.ugc.tiktok.mobile_arch.client_ai.sync.proto.cai_sync_feature_request;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class cai_sync_feature_request extends Message<cai_sync_feature_request, C2227451CFz> {
    public static final ProtoAdapter<cai_sync_feature_request> ADAPTER = new ProtoAdapter<cai_sync_feature_request>() { // from class: X.1CFy
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final cai_sync_feature_request decode(ProtoReader protoReader) {
            C2227451CFz c2227451CFz = new C2227451CFz();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c2227451CFz.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c2227451CFz.LIZLLL = CaiFeatureReq.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2227451CFz.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(cai_sync_feature_request cai_sync_feature_requestVar) {
            cai_sync_feature_request cai_sync_feature_requestVar2 = cai_sync_feature_requestVar;
            return CaiFeatureReq.ADAPTER.encodedSizeWithTag(1, cai_sync_feature_requestVar2.feature_req) + cai_sync_feature_requestVar2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, cai_sync_feature_request cai_sync_feature_requestVar) {
            cai_sync_feature_request cai_sync_feature_requestVar2 = cai_sync_feature_requestVar;
            CaiFeatureReq.ADAPTER.encodeWithTag(protoWriter, 1, cai_sync_feature_requestVar2.feature_req);
            protoWriter.writeBytes(cai_sync_feature_requestVar2.unknownFields());
        }
    };

    @WireField(adapter = "com.ss.ugc.tiktok.mobile_arch.client_ai.sync.proto.CaiFeatureReq#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public CaiFeatureReq feature_req;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.feature_req.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2227451CFz newBuilder() {
        C2227451CFz c2227451CFz = new C2227451CFz();
        c2227451CFz.LIZLLL = this.feature_req;
        c2227451CFz.addUnknownFields(unknownFields());
        return c2227451CFz;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", feature_req=");
        sb.append(this.feature_req);
        sb.replace(0, 2, "cai_sync_feature_request{");
        sb.append('}');
        return sb.toString();
    }

    public cai_sync_feature_request(CaiFeatureReq caiFeatureReq) {
        this(caiFeatureReq, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cai_sync_feature_request)) {
            return false;
        }
        cai_sync_feature_request cai_sync_feature_requestVar = (cai_sync_feature_request) obj;
        if (unknownFields().equals(cai_sync_feature_requestVar.unknownFields()) && this.feature_req.equals(cai_sync_feature_requestVar.feature_req)) {
            return true;
        }
        return false;
    }

    public cai_sync_feature_request(CaiFeatureReq caiFeatureReq, ByteString byteString) {
        super(ADAPTER, byteString);
        this.feature_req = caiFeatureReq;
    }
}
