package com.ss.ugc.tiktok.mobile_arch.client_ai.sync.proto;

import X.C1CAF;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.ugc.tiktok.mobile_arch.client_ai.sync.proto.CaiValueReq;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class CaiValueReq extends Message<CaiValueReq, C1CAF> {
    public static final ProtoAdapter<CaiValueReq> ADAPTER = new ProtoAdapter<CaiValueReq>() { // from class: X.1CAE
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final CaiValueReq decode(ProtoReader protoReader) {
            C1CAF c1caf = new C1CAF();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                    c1caf.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1caf.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(CaiValueReq caiValueReq) {
            return caiValueReq.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, CaiValueReq caiValueReq) {
            protoWriter.writeBytes(caiValueReq.unknownFields());
        }
    };

    public CaiValueReq() {
        this(ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C1CAF newBuilder() {
        C1CAF c1caf = new C1CAF();
        c1caf.addUnknownFields(unknownFields());
        return c1caf;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.replace(0, 2, "CaiValueReq{");
        sb.append('}');
        return sb.toString();
    }

    public int hashCode() {
        return unknownFields().hashCode();
    }

    public CaiValueReq(ByteString byteString) {
        super(ADAPTER, byteString);
    }

    public boolean equals(Object obj) {
        return obj instanceof CaiValueReq;
    }
}
