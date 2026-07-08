package com.bytedance.im.core.proto;

import X.C09CT;
import X.C0YU2;
import X.C1516540pZE;
import com.bytedance.im.core.proto.ConversationRecentMessage;
import com.bytedance.im.core.proto.MessageBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public final class ConversationRecentMessage extends Message<ConversationRecentMessage, C0YU2> {
    public static final long serialVersionUID = 0;

    @C09CT("badge_count")
    public final Integer badge_count;

    @C09CT("conversation_id")
    public final String conversation_id;

    @C09CT("conversation_short_id")
    public final Long conversation_short_id;

    @C09CT("ext_messages")
    public final List<MessageBody> ext_messages;

    @C09CT("messages")
    public final List<MessageBody> messages;

    @C09CT("version")
    public final Long version;
    public static final ProtoAdapter<ConversationRecentMessage> ADAPTER = new ProtoAdapter<ConversationRecentMessage>() { // from class: X.0YU1
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final ConversationRecentMessage decode(ProtoReader protoReader) {
            C0YU2 c0yu2 = new C0YU2();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c0yu2.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 2:
                            c0yu2.LJ.add(MessageBody.ADAPTER.decode(protoReader));
                            break;
                        case 3:
                            c0yu2.LJFF = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 4:
                            c0yu2.LJI = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 5:
                            c0yu2.LJII = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c0yu2.LJIIIIZZ.add(MessageBody.ADAPTER.decode(protoReader));
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c0yu2.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c0yu2.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(ConversationRecentMessage conversationRecentMessage) {
            ConversationRecentMessage conversationRecentMessage2 = conversationRecentMessage;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, conversationRecentMessage2.conversation_short_id);
            ProtoAdapter<MessageBody> protoAdapter2 = MessageBody.ADAPTER;
            return iEncodedSizeWithTag + protoAdapter2.asRepeated().encodedSizeWithTag(2, conversationRecentMessage2.messages) + protoAdapter.encodedSizeWithTag(3, conversationRecentMessage2.version) + ProtoAdapter.INT32.encodedSizeWithTag(4, conversationRecentMessage2.badge_count) + ProtoAdapter.STRING.encodedSizeWithTag(5, conversationRecentMessage2.conversation_id) + protoAdapter2.asRepeated().encodedSizeWithTag(6, conversationRecentMessage2.ext_messages) + conversationRecentMessage2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, ConversationRecentMessage conversationRecentMessage) {
            ConversationRecentMessage conversationRecentMessage2 = conversationRecentMessage;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 1, conversationRecentMessage2.conversation_short_id);
            ProtoAdapter<MessageBody> protoAdapter2 = MessageBody.ADAPTER;
            protoAdapter2.asRepeated().encodeWithTag(protoWriter, 2, conversationRecentMessage2.messages);
            protoAdapter.encodeWithTag(protoWriter, 3, conversationRecentMessage2.version);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, conversationRecentMessage2.badge_count);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, conversationRecentMessage2.conversation_id);
            protoAdapter2.asRepeated().encodeWithTag(protoWriter, 6, conversationRecentMessage2.ext_messages);
            protoWriter.writeBytes(conversationRecentMessage2.unknownFields());
        }
    };
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final Long DEFAULT_VERSION = 0L;
    public static final Integer DEFAULT_BADGE_COUNT = 0;

    @Override // com.squareup.wire.Message
    public C0YU2 newBuilder() {
        C0YU2 c0yu2 = new C0YU2();
        c0yu2.LIZLLL = this.conversation_short_id;
        c0yu2.LJ = C1516540pZE.LIZJ("messages", this.messages);
        c0yu2.LJFF = this.version;
        c0yu2.LJI = this.badge_count;
        c0yu2.LJII = this.conversation_id;
        c0yu2.LJIIIIZZ = C1516540pZE.LIZJ("ext_messages", this.ext_messages);
        c0yu2.addUnknownFields(unknownFields());
        return c0yu2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", conversation_short_id=");
        sb.append(this.conversation_short_id);
        List<MessageBody> list = this.messages;
        if (list != null && !list.isEmpty()) {
            sb.append(", messages=");
            sb.append(this.messages);
        }
        sb.append(", version=");
        sb.append(this.version);
        if (this.badge_count != null) {
            sb.append(", badge_count=");
            sb.append(this.badge_count);
        }
        sb.append(", conversation_id=");
        sb.append(this.conversation_id);
        List<MessageBody> list2 = this.ext_messages;
        if (list2 != null && !list2.isEmpty()) {
            sb.append(", ext_messages=");
            sb.append(this.ext_messages);
        }
        sb.replace(0, 2, "ConversationRecentMessage{");
        sb.append('}');
        return sb.toString();
    }

    public ConversationRecentMessage(Long l, List<MessageBody> list, Long l2, Integer num, String str, List<MessageBody> list2) {
        this(l, list, l2, num, str, list2, ByteString.EMPTY);
    }

    public ConversationRecentMessage(Long l, List<MessageBody> list, Long l2, Integer num, String str, List<MessageBody> list2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_short_id = l;
        this.messages = C1516540pZE.LJFF("messages", list);
        this.version = l2;
        this.badge_count = num;
        this.conversation_id = str;
        this.ext_messages = C1516540pZE.LJFF("ext_messages", list2);
    }
}
