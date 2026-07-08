package com.ss.ugc.tiktok.mobile_arch.client_ai.sync.proto;

import X.C1CAH;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.ss.ugc.tiktok.mobile_arch.client_ai.sync.proto.CaiValueReq;
import com.ss.ugc.tiktok.mobile_arch.client_ai.sync.proto.cai_sync_value_request;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class cai_sync_value_request extends Message<cai_sync_value_request, C1CAH> {
    public static final ProtoAdapter<cai_sync_value_request> ADAPTER = new ProtoAdapter<cai_sync_value_request>() { // from class: X.1CAG
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final cai_sync_value_request decode(ProtoReader protoReader) {
            C1CAH c1cah = new C1CAH();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c1cah.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c1cah.LIZLLL = CaiValueReq.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cah.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(cai_sync_value_request cai_sync_value_requestVar) {
            cai_sync_value_request cai_sync_value_requestVar2 = cai_sync_value_requestVar;
            return CaiValueReq.ADAPTER.encodedSizeWithTag(1, cai_sync_value_requestVar2.value_req) + cai_sync_value_requestVar2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, cai_sync_value_request cai_sync_value_requestVar) {
            cai_sync_value_request cai_sync_value_requestVar2 = cai_sync_value_requestVar;
            CaiValueReq.ADAPTER.encodeWithTag(protoWriter, 1, cai_sync_value_requestVar2.value_req);
            protoWriter.writeBytes(cai_sync_value_requestVar2.unknownFields());
        }
    };

    @WireField(adapter = "com.ss.ugc.tiktok.mobile_arch.client_ai.sync.proto.CaiValueReq#ADAPTER", label = WireField.Label.REQUIRED, tag = 1)
    public CaiValueReq value_req;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.value_req.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1CAH newBuilder() {
        C1CAH c1cah = new C1CAH();
        c1cah.LIZLLL = this.value_req;
        c1cah.addUnknownFields(unknownFields());
        return c1cah;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", value_req=");
        sb.append(this.value_req);
        sb.replace(0, 2, "cai_sync_value_request{");
        sb.append('}');
        return sb.toString();
    }

    public cai_sync_value_request(CaiValueReq caiValueReq) {
        this(caiValueReq, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cai_sync_value_request)) {
            return false;
        }
        cai_sync_value_request cai_sync_value_requestVar = (cai_sync_value_request) obj;
        if (unknownFields().equals(cai_sync_value_requestVar.unknownFields()) && this.value_req.equals(cai_sync_value_requestVar.value_req)) {
            return true;
        }
        return false;
    }

    public cai_sync_value_request(CaiValueReq caiValueReq, ByteString byteString) {
        super(ADAPTER, byteString);
        this.value_req = caiValueReq;
    }
}
