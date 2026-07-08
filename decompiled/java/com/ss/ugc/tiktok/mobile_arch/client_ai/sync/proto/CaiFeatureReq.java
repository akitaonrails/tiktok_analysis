package com.ss.ugc.tiktok.mobile_arch.client_ai.sync.proto;

import X.C1516540pZE;
import X.C1CG1;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.ss.ugc.tiktok.mobile_arch.client_ai.sync.proto.CaiFeatureReq;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class CaiFeatureReq extends Message<CaiFeatureReq, C1CG1> {
    public static final ProtoAdapter<CaiFeatureReq> ADAPTER = new ProtoAdapter<CaiFeatureReq>() { // from class: X.1CG0
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final CaiFeatureReq decode(ProtoReader protoReader) {
            C1CG1 c1cg1 = new C1CG1();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c1cg1.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c1cg1.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cg1.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(CaiFeatureReq caiFeatureReq) {
            CaiFeatureReq caiFeatureReq2 = caiFeatureReq;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, caiFeatureReq2.last_update_time) + caiFeatureReq2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, CaiFeatureReq caiFeatureReq) {
            CaiFeatureReq caiFeatureReq2 = caiFeatureReq;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, caiFeatureReq2.last_update_time);
            protoWriter.writeBytes(caiFeatureReq2.unknownFields());
        }
    };

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public String last_update_time;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.last_update_time;
        int iHashCode2 = iHashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public C1CG1 newBuilder() {
        C1CG1 c1cg1 = new C1CG1();
        c1cg1.LIZLLL = this.last_update_time;
        c1cg1.addUnknownFields(unknownFields());
        return c1cg1;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.last_update_time != null) {
            sb.append(", last_update_time=");
            sb.append(this.last_update_time);
        }
        sb.replace(0, 2, "CaiFeatureReq{");
        sb.append('}');
        return sb.toString();
    }

    public CaiFeatureReq(String str) {
        this(str, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CaiFeatureReq)) {
            return false;
        }
        CaiFeatureReq caiFeatureReq = (CaiFeatureReq) obj;
        if (unknownFields().equals(caiFeatureReq.unknownFields()) && C1516540pZE.LJ(this.last_update_time, caiFeatureReq.last_update_time)) {
            return true;
        }
        return false;
    }

    public CaiFeatureReq(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.last_update_time = str;
    }
}
