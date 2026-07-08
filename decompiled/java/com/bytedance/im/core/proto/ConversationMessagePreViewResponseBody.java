package com.bytedance.im.core.proto;

import X.C09CT;
import X.C1516540pZE;
import X.C2238481CjO;
import com.bytedance.im.core.proto.ConversationMessagePreViewResponseBody;
import com.bytedance.im.core.proto.MessageBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class ConversationMessagePreViewResponseBody extends Message<ConversationMessagePreViewResponseBody, C2238481CjO> {
    public static final ProtoAdapter<ConversationMessagePreViewResponseBody> ADAPTER = new ProtoAdapter<ConversationMessagePreViewResponseBody>() { // from class: X.1CjN
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final ConversationMessagePreViewResponseBody decode(ProtoReader protoReader) {
            C2238481CjO c2238481CjO = new C2238481CjO();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c2238481CjO.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c2238481CjO.LIZLLL.add(MessageBody.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2238481CjO.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(ConversationMessagePreViewResponseBody conversationMessagePreViewResponseBody) {
            ConversationMessagePreViewResponseBody conversationMessagePreViewResponseBody2 = conversationMessagePreViewResponseBody;
            return MessageBody.ADAPTER.asRepeated().encodedSizeWithTag(1, conversationMessagePreViewResponseBody2.message_result) + conversationMessagePreViewResponseBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, ConversationMessagePreViewResponseBody conversationMessagePreViewResponseBody) {
            ConversationMessagePreViewResponseBody conversationMessagePreViewResponseBody2 = conversationMessagePreViewResponseBody;
            MessageBody.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, conversationMessagePreViewResponseBody2.message_result);
            protoWriter.writeBytes(conversationMessagePreViewResponseBody2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @C09CT("message_result")
    public final List<MessageBody> message_result;

    @Override // com.squareup.wire.Message
    public C2238481CjO newBuilder() {
        C2238481CjO c2238481CjO = new C2238481CjO();
        c2238481CjO.LIZLLL = C1516540pZE.LIZJ("message_result", this.message_result);
        c2238481CjO.addUnknownFields(unknownFields());
        return c2238481CjO;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<MessageBody> list = this.message_result;
        if (list != null && !list.isEmpty()) {
            sb.append(", message_result=");
            sb.append(this.message_result);
        }
        sb.replace(0, 2, "ConversationMessagePreViewResponseBody{");
        sb.append('}');
        return sb.toString();
    }

    public ConversationMessagePreViewResponseBody(List<MessageBody> list) {
        this(list, ByteString.EMPTY);
    }

    public ConversationMessagePreViewResponseBody(List<MessageBody> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.message_result = C1516540pZE.LJFF("message_result", list);
    }
}
