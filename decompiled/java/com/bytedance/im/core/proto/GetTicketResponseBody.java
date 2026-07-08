package com.bytedance.im.core.proto;

import X.C09CT;
import X.C1CER;
import com.bytedance.im.core.proto.GetTicketResponseBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class GetTicketResponseBody extends Message<GetTicketResponseBody, C1CER> {
    public static final ProtoAdapter<GetTicketResponseBody> ADAPTER = new ProtoAdapter<GetTicketResponseBody>() { // from class: X.1CEQ
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final GetTicketResponseBody decode(ProtoReader protoReader) {
            C1CER c1cer = new C1CER();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c1cer.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c1cer.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cer.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(GetTicketResponseBody getTicketResponseBody) {
            GetTicketResponseBody getTicketResponseBody2 = getTicketResponseBody;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, getTicketResponseBody2.ticket) + getTicketResponseBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, GetTicketResponseBody getTicketResponseBody) {
            GetTicketResponseBody getTicketResponseBody2 = getTicketResponseBody;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getTicketResponseBody2.ticket);
            protoWriter.writeBytes(getTicketResponseBody2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @C09CT("ticket")
    public final String ticket;

    @Override // com.squareup.wire.Message
    public C1CER newBuilder() {
        C1CER c1cer = new C1CER();
        c1cer.LIZLLL = this.ticket;
        c1cer.addUnknownFields(unknownFields());
        return c1cer;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.ticket != null) {
            sb.append(", ticket=");
            sb.append(this.ticket);
        }
        sb.replace(0, 2, "GetTicketResponseBody{");
        sb.append('}');
        return sb.toString();
    }

    public GetTicketResponseBody(String str) {
        this(str, ByteString.EMPTY);
    }

    public GetTicketResponseBody(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.ticket = str;
    }
}
