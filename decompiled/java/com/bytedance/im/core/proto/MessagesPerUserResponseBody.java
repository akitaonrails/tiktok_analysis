package com.bytedance.im.core.proto;

import X.C09CT;
import X.C0YSF;
import X.C1516540pZE;
import com.bytedance.im.core.proto.ConversationBadgeCountInfo;
import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.im.core.proto.MessagesPerUserResponseBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public final class MessagesPerUserResponseBody extends Message<MessagesPerUserResponseBody, C0YSF> {
    public static final long serialVersionUID = 0;

    @C09CT("conversation_badge_count")
    public final List<ConversationBadgeCountInfo> conversation_badge_count;

    @C09CT("has_more")
    public final Boolean has_more;

    @C09CT("messages")
    public final List<MessageBody> messages;

    @C09CT("messages_pb")
    public final List<ByteString> messages_pb;

    @C09CT("next_cmd_index")
    public final Long next_cmd_index;

    @C09CT("next_conversation_version")
    public final Long next_conversation_version;

    @C09CT("next_cursor")
    public final Long next_cursor;

    @C09CT("next_interval")
    public final Long next_interval;
    public static final ProtoAdapter<MessagesPerUserResponseBody> ADAPTER = new ProtoAdapter<MessagesPerUserResponseBody>() { // from class: X.0YSC
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final MessagesPerUserResponseBody decode(ProtoReader protoReader) {
            C0YSF c0ysf = new C0YSF();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c0ysf.LIZLLL.add(MessageBody.ADAPTER.decode(protoReader));
                            break;
                        case 2:
                            c0ysf.LJ = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 3:
                            c0ysf.LJFF = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 4:
                            c0ysf.LJI = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 5:
                            c0ysf.LJII = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 6:
                            c0ysf.LJIIIIZZ.add(ConversationBadgeCountInfo.ADAPTER.decode(protoReader));
                            break;
                        case 7:
                            c0ysf.LJIIIZ = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 8:
                            c0ysf.LJIIJ.add(ProtoAdapter.BYTES.decode(protoReader));
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c0ysf.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c0ysf.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(MessagesPerUserResponseBody messagesPerUserResponseBody) {
            MessagesPerUserResponseBody messagesPerUserResponseBody2 = messagesPerUserResponseBody;
            int iEncodedSizeWithTag = MessageBody.ADAPTER.asRepeated().encodedSizeWithTag(1, messagesPerUserResponseBody2.messages);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, messagesPerUserResponseBody2.next_cursor) + ProtoAdapter.BOOL.encodedSizeWithTag(3, messagesPerUserResponseBody2.has_more) + protoAdapter.encodedSizeWithTag(4, messagesPerUserResponseBody2.next_interval) + protoAdapter.encodedSizeWithTag(5, messagesPerUserResponseBody2.next_conversation_version) + ConversationBadgeCountInfo.ADAPTER.asRepeated().encodedSizeWithTag(6, messagesPerUserResponseBody2.conversation_badge_count) + protoAdapter.encodedSizeWithTag(7, messagesPerUserResponseBody2.next_cmd_index) + ProtoAdapter.BYTES.asRepeated().encodedSizeWithTag(8, messagesPerUserResponseBody2.messages_pb) + messagesPerUserResponseBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, MessagesPerUserResponseBody messagesPerUserResponseBody) {
            MessagesPerUserResponseBody messagesPerUserResponseBody2 = messagesPerUserResponseBody;
            MessageBody.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, messagesPerUserResponseBody2.messages);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 2, messagesPerUserResponseBody2.next_cursor);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, messagesPerUserResponseBody2.has_more);
            protoAdapter.encodeWithTag(protoWriter, 4, messagesPerUserResponseBody2.next_interval);
            protoAdapter.encodeWithTag(protoWriter, 5, messagesPerUserResponseBody2.next_conversation_version);
            ConversationBadgeCountInfo.ADAPTER.asRepeated().encodeWithTag(protoWriter, 6, messagesPerUserResponseBody2.conversation_badge_count);
            protoAdapter.encodeWithTag(protoWriter, 7, messagesPerUserResponseBody2.next_cmd_index);
            ProtoAdapter.BYTES.asRepeated().encodeWithTag(protoWriter, 8, messagesPerUserResponseBody2.messages_pb);
            protoWriter.writeBytes(messagesPerUserResponseBody2.unknownFields());
        }
    };
    public static final Long DEFAULT_NEXT_CURSOR = 0L;
    public static final Boolean DEFAULT_HAS_MORE = Boolean.FALSE;
    public static final Long DEFAULT_NEXT_INTERVAL = 0L;
    public static final Long DEFAULT_NEXT_CONVERSATION_VERSION = 0L;
    public static final Long DEFAULT_NEXT_CMD_INDEX = 0L;

    @Override // com.squareup.wire.Message
    public C0YSF newBuilder() {
        C0YSF c0ysf = new C0YSF();
        c0ysf.LIZLLL = C1516540pZE.LIZJ("messages", this.messages);
        c0ysf.LJ = this.next_cursor;
        c0ysf.LJFF = this.has_more;
        c0ysf.LJI = this.next_interval;
        c0ysf.LJII = this.next_conversation_version;
        c0ysf.LJIIIIZZ = C1516540pZE.LIZJ("conversation_badge_count", this.conversation_badge_count);
        c0ysf.LJIIIZ = this.next_cmd_index;
        c0ysf.LJIIJ = C1516540pZE.LIZJ("messages_pb", this.messages_pb);
        c0ysf.addUnknownFields(unknownFields());
        return c0ysf;
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
        if (this.next_interval != null) {
            sb.append(", next_interval=");
            sb.append(this.next_interval);
        }
        if (this.next_conversation_version != null) {
            sb.append(", next_conversation_version=");
            sb.append(this.next_conversation_version);
        }
        List<ConversationBadgeCountInfo> list2 = this.conversation_badge_count;
        if (list2 != null && !list2.isEmpty()) {
            sb.append(", conversation_badge_count=");
            sb.append(this.conversation_badge_count);
        }
        if (this.next_cmd_index != null) {
            sb.append(", next_cmd_index=");
            sb.append(this.next_cmd_index);
        }
        List<ByteString> list3 = this.messages_pb;
        if (list3 != null && !list3.isEmpty()) {
            sb.append(", messages_pb=");
            sb.append(this.messages_pb);
        }
        sb.replace(0, 2, "MessagesPerUserResponseBody{");
        sb.append('}');
        return sb.toString();
    }

    public MessagesPerUserResponseBody(List<MessageBody> list, Long l, Boolean bool, Long l2, Long l3, List<ConversationBadgeCountInfo> list2, Long l4, List<ByteString> list3) {
        this(list, l, bool, l2, l3, list2, l4, list3, ByteString.EMPTY);
    }

    public MessagesPerUserResponseBody(List<MessageBody> list, Long l, Boolean bool, Long l2, Long l3, List<ConversationBadgeCountInfo> list2, Long l4, List<ByteString> list3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.messages = C1516540pZE.LJFF("messages", list);
        this.next_cursor = l;
        this.has_more = bool;
        this.next_interval = l2;
        this.next_conversation_version = l3;
        this.conversation_badge_count = C1516540pZE.LJFF("conversation_badge_count", list2);
        this.next_cmd_index = l4;
        this.messages_pb = C1516540pZE.LJFF("messages_pb", list3);
    }
}
