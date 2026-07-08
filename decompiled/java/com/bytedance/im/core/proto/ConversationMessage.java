package com.bytedance.im.core.proto;

import X.C09CT;
import X.C1516540pZE;
import X.C2238561CjW;
import com.bytedance.im.core.proto.ConversationInfoV2;
import com.bytedance.im.core.proto.ConversationMessage;
import com.bytedance.im.core.proto.MessageBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class ConversationMessage extends Message<ConversationMessage, C2238561CjW> {
    public static final ProtoAdapter<ConversationMessage> ADAPTER = new ProtoAdapter<ConversationMessage>() { // from class: X.1CjV
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final ConversationMessage decode(ProtoReader protoReader) {
            C2238561CjW c2238561CjW = new C2238561CjW();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2238561CjW.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c2238561CjW.LJ.add(MessageBody.ADAPTER.decode(protoReader));
                        }
                    } else {
                        c2238561CjW.LIZLLL = ConversationInfoV2.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2238561CjW.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(ConversationMessage conversationMessage) {
            ConversationMessage conversationMessage2 = conversationMessage;
            return ConversationInfoV2.ADAPTER.encodedSizeWithTag(1, conversationMessage2.conversations) + MessageBody.ADAPTER.asRepeated().encodedSizeWithTag(2, conversationMessage2.messages) + conversationMessage2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, ConversationMessage conversationMessage) {
            ConversationMessage conversationMessage2 = conversationMessage;
            ConversationInfoV2.ADAPTER.encodeWithTag(protoWriter, 1, conversationMessage2.conversations);
            MessageBody.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, conversationMessage2.messages);
            protoWriter.writeBytes(conversationMessage2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @C09CT("conversations")
    public final ConversationInfoV2 conversations;

    @C09CT("messages")
    public final List<MessageBody> messages;

    @Override // com.squareup.wire.Message
    public C2238561CjW newBuilder() {
        C2238561CjW c2238561CjW = new C2238561CjW();
        c2238561CjW.LIZLLL = this.conversations;
        c2238561CjW.LJ = C1516540pZE.LIZJ("messages", this.messages);
        c2238561CjW.addUnknownFields(unknownFields());
        return c2238561CjW;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", conversations=");
        sb.append(this.conversations);
        List<MessageBody> list = this.messages;
        if (list != null && !list.isEmpty()) {
            sb.append(", messages=");
            sb.append(this.messages);
        }
        sb.replace(0, 2, "ConversationMessage{");
        sb.append('}');
        return sb.toString();
    }

    public ConversationMessage(ConversationInfoV2 conversationInfoV2, List<MessageBody> list) {
        this(conversationInfoV2, list, ByteString.EMPTY);
    }

    public ConversationMessage(ConversationInfoV2 conversationInfoV2, List<MessageBody> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversations = conversationInfoV2;
        this.messages = C1516540pZE.LJFF("messages", list);
    }
}
