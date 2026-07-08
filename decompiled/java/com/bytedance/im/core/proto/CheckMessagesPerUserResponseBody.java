package com.bytedance.im.core.proto;

import X.C09CT;
import X.C1516540pZE;
import X.C1CKN;
import com.bytedance.im.core.proto.CheckMessagesPerUserResponseBody;
import com.bytedance.im.core.proto.InboxMessagesPerUserResponseBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class CheckMessagesPerUserResponseBody extends Message<CheckMessagesPerUserResponseBody, C1CKN> {
    public static final ProtoAdapter<CheckMessagesPerUserResponseBody> ADAPTER = new ProtoAdapter<CheckMessagesPerUserResponseBody>() { // from class: X.1CKM
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final CheckMessagesPerUserResponseBody decode(ProtoReader protoReader) {
            C1CKN c1ckn = new C1CKN();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c1ckn.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c1ckn.LIZLLL.add(InboxMessagesPerUserResponseBody.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1ckn.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(CheckMessagesPerUserResponseBody checkMessagesPerUserResponseBody) {
            CheckMessagesPerUserResponseBody checkMessagesPerUserResponseBody2 = checkMessagesPerUserResponseBody;
            return InboxMessagesPerUserResponseBody.ADAPTER.asRepeated().encodedSizeWithTag(1, checkMessagesPerUserResponseBody2.messages) + checkMessagesPerUserResponseBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, CheckMessagesPerUserResponseBody checkMessagesPerUserResponseBody) {
            CheckMessagesPerUserResponseBody checkMessagesPerUserResponseBody2 = checkMessagesPerUserResponseBody;
            InboxMessagesPerUserResponseBody.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, checkMessagesPerUserResponseBody2.messages);
            protoWriter.writeBytes(checkMessagesPerUserResponseBody2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @C09CT("messages")
    public final List<InboxMessagesPerUserResponseBody> messages;

    @Override // com.squareup.wire.Message
    public C1CKN newBuilder() {
        C1CKN c1ckn = new C1CKN();
        c1ckn.LIZLLL = C1516540pZE.LIZJ("messages", this.messages);
        c1ckn.addUnknownFields(unknownFields());
        return c1ckn;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<InboxMessagesPerUserResponseBody> list = this.messages;
        if (list != null && !list.isEmpty()) {
            sb.append(", messages=");
            sb.append(this.messages);
        }
        sb.replace(0, 2, "CheckMessagesPerUserResponseBody{");
        sb.append('}');
        return sb.toString();
    }

    public CheckMessagesPerUserResponseBody(List<InboxMessagesPerUserResponseBody> list) {
        this(list, ByteString.EMPTY);
    }

    public CheckMessagesPerUserResponseBody(List<InboxMessagesPerUserResponseBody> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.messages = C1516540pZE.LJFF("messages", list);
    }
}
