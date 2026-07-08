package com.ss.ugc.tiktok.mobile_arch.client_ai.sync.proto;

import X.C2227391CFt;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.ss.ugc.tiktok.mobile_arch.client_ai.sync.proto.CaiStrategyReq;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class CaiStrategyReq extends Message<CaiStrategyReq, C2227391CFt> {
    public static final ProtoAdapter<CaiStrategyReq> ADAPTER = new ProtoAdapter<CaiStrategyReq>() { // from class: X.1CFs
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final CaiStrategyReq decode(ProtoReader protoReader) {
            C2227391CFt c2227391CFt = new C2227391CFt();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 2) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c2227391CFt.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c2227391CFt.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2227391CFt.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(CaiStrategyReq caiStrategyReq) {
            CaiStrategyReq caiStrategyReq2 = caiStrategyReq;
            return ProtoAdapter.STRING.encodedSizeWithTag(2, caiStrategyReq2.cookie) + caiStrategyReq2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, CaiStrategyReq caiStrategyReq) {
            CaiStrategyReq caiStrategyReq2 = caiStrategyReq;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, caiStrategyReq2.cookie);
            protoWriter.writeBytes(caiStrategyReq2.unknownFields());
        }
    };

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 2)
    public String cookie;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.cookie.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C2227391CFt newBuilder() {
        C2227391CFt c2227391CFt = new C2227391CFt();
        c2227391CFt.LIZLLL = this.cookie;
        c2227391CFt.addUnknownFields(unknownFields());
        return c2227391CFt;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", cookie=");
        sb.append(this.cookie);
        sb.replace(0, 2, "CaiStrategyReq{");
        sb.append('}');
        return sb.toString();
    }

    public CaiStrategyReq(String str) {
        this(str, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CaiStrategyReq)) {
            return false;
        }
        CaiStrategyReq caiStrategyReq = (CaiStrategyReq) obj;
        if (unknownFields().equals(caiStrategyReq.unknownFields()) && this.cookie.equals(caiStrategyReq.cookie)) {
            return true;
        }
        return false;
    }

    public CaiStrategyReq(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.cookie = str;
    }
}
