package com.ss.ugc.tiktok.mobile_arch.client_ai.sync.proto;

import X.C1CAJ;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.ugc.tiktok.mobile_arch.client_ai.sync.proto.CaiValueResp;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class CaiValueResp extends Message<CaiValueResp, C1CAJ> {
    public static final ProtoAdapter<CaiValueResp> ADAPTER = new ProtoAdapter<CaiValueResp>() { // from class: X.1CAI
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final CaiValueResp decode(ProtoReader protoReader) {
            C1CAJ c1caj = new C1CAJ();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                    c1caj.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1caj.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(CaiValueResp caiValueResp) {
            return caiValueResp.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, CaiValueResp caiValueResp) {
            protoWriter.writeBytes(caiValueResp.unknownFields());
        }
    };

    public CaiValueResp() {
        this(ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C1CAJ newBuilder() {
        C1CAJ c1caj = new C1CAJ();
        c1caj.addUnknownFields(unknownFields());
        return c1caj;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.replace(0, 2, "CaiValueResp{");
        sb.append('}');
        return sb.toString();
    }

    public int hashCode() {
        return unknownFields().hashCode();
    }

    public CaiValueResp(ByteString byteString) {
        super(ADAPTER, byteString);
    }

    public boolean equals(Object obj) {
        return obj instanceof CaiValueResp;
    }
}
