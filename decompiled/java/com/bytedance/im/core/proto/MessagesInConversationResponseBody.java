package com.bytedance.im.core.proto;

import X.C09CT;
import X.C0YQN;
import X.C1516540pZE;
import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.im.core.proto.MessagesInConversationResponseBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public final class MessagesInConversationResponseBody extends Message<MessagesInConversationResponseBody, C0YQN> {
    public static final long serialVersionUID = 0;

    @C09CT("has_more")
    public final Boolean has_more;

    @C09CT("messages")
    public final List<MessageBody> messages;

    @C09CT("messages_pb")
    public final List<ByteString> messages_pb;

    @C09CT("next_cursor")
    public final Long next_cursor;
    public static final ProtoAdapter<MessagesInConversationResponseBody> ADAPTER = new ProtoAdapter<MessagesInConversationResponseBody>() { // from class: X.0YQM
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final MessagesInConversationResponseBody decode(ProtoReader protoReader) {
            C0YQN c0yqn = new C0YQN();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                    c0yqn.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                } else {
                                    c0yqn.LJI.add(ProtoAdapter.BYTES.decode(protoReader));
                                }
                            } else {
                                c0yqn.LJFF = ProtoAdapter.BOOL.decode(protoReader);
                            }
                        } else {
                            c0yqn.LJ = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c0yqn.LIZLLL.add(MessageBody.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c0yqn.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(MessagesInConversationResponseBody messagesInConversationResponseBody) {
            MessagesInConversationResponseBody messagesInConversationResponseBody2 = messagesInConversationResponseBody;
            return MessageBody.ADAPTER.asRepeated().encodedSizeWithTag(1, messagesInConversationResponseBody2.messages) + ProtoAdapter.INT64.encodedSizeWithTag(2, messagesInConversationResponseBody2.next_cursor) + ProtoAdapter.BOOL.encodedSizeWithTag(3, messagesInConversationResponseBody2.has_more) + ProtoAdapter.BYTES.asRepeated().encodedSizeWithTag(4, messagesInConversationResponseBody2.messages_pb) + messagesInConversationResponseBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, MessagesInConversationResponseBody messagesInConversationResponseBody) {
            MessagesInConversationResponseBody messagesInConversationResponseBody2 = messagesInConversationResponseBody;
            MessageBody.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, messagesInConversationResponseBody2.messages);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, messagesInConversationResponseBody2.next_cursor);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, messagesInConversationResponseBody2.has_more);
            ProtoAdapter.BYTES.asRepeated().encodeWithTag(protoWriter, 4, messagesInConversationResponseBody2.messages_pb);
            protoWriter.writeBytes(messagesInConversationResponseBody2.unknownFields());
        }
    };
    public static final Long DEFAULT_NEXT_CURSOR = 0L;
    public static final Boolean DEFAULT_HAS_MORE = Boolean.FALSE;

    @Override // com.squareup.wire.Message
    public C0YQN newBuilder() {
        C0YQN c0yqn = new C0YQN();
        c0yqn.LIZLLL = C1516540pZE.LIZJ("messages", this.messages);
        c0yqn.LJ = this.next_cursor;
        c0yqn.LJFF = this.has_more;
        c0yqn.LJI = C1516540pZE.LIZJ("messages_pb", this.messages_pb);
        c0yqn.addUnknownFields(unknownFields());
        return c0yqn;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<MessageBody> list = this.messages;
        if (list != null && !list.isEmpty()) {
            sb.append(", messages=");
            sb.append(this.messages);
        }
        if (this.next_cursor != null) {
            sb.append(", next_cursor=");
            sb.append(this.next_cursor);
        }
        if (this.has_more != null) {
            sb.append(", has_more=");
            sb.append(this.has_more);
        }
        List<ByteString> list2 = this.messages_pb;
        if (list2 != null && !list2.isEmpty()) {
            sb.append(", messages_pb=");
            sb.append(this.messages_pb);
        }
        sb.replace(0, 2, "MessagesInConversationResponseBody{");
        sb.append('}');
        return sb.toString();
    }

    public MessagesInConversationResponseBody(List<MessageBody> list, Long l, Boolean bool, List<ByteString> list2) {
        this(list, l, bool, list2, ByteString.EMPTY);
    }

    public MessagesInConversationResponseBody(List<MessageBody> list, Long l, Boolean bool, List<ByteString> list2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.messages = C1516540pZE.LJFF("messages", list);
        this.next_cursor = l;
        this.has_more = bool;
        this.messages_pb = C1516540pZE.LJFF("messages_pb", list2);
    }
}
