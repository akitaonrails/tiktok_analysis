package com.bytedance.im.core.proto;

import X.C09CT;
import X.C0YQV;
import X.C0YQW;
import X.C1516540pZE;
import com.bytedance.im.core.proto.ConversationInfoV2;
import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.im.core.proto.MessagesPerUserInitV2ResponseBody;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.List;
import java.util.Map;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public final class MessagesPerUserInitV2ResponseBody extends Message<MessagesPerUserInitV2ResponseBody, C0YQV> {
    public static final long serialVersionUID = 0;

    @C09CT("cmd_start_index")
    public final Long cmd_start_index;

    @C09CT("conv_has_more")
    public final Map<Long, Boolean> conv_has_more;

    @C09CT("conversations")
    public final List<ConversationInfoV2> conversations;

    @C09CT("has_more")
    public final Boolean has_more;

    @C09CT("init_type")
    public final C0YQW init_type;

    @C09CT("messages")
    public final List<MessageBody> messages;

    @C09CT("messages_pb")
    public final List<ByteString> messages_pb;

    @C09CT("next_conversation_version")
    public final Long next_conversation_version;

    @C09CT("next_cursor")
    public final Long next_cursor;

    @C09CT("per_user_cursor")
    public final Long per_user_cursor;

    @C09CT("priority_next_cursor")
    public final Long priority_next_cursor;
    public static final ProtoAdapter<MessagesPerUserInitV2ResponseBody> ADAPTER = new ProtoAdapter<MessagesPerUserInitV2ResponseBody>() { // from class: X.0YQU
        public final ProtoAdapter<Map<Long, Boolean>> LIZ;

        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            this.LIZ = ProtoAdapter.newMapAdapter(ProtoAdapter.INT64, ProtoAdapter.BOOL);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final MessagesPerUserInitV2ResponseBody decode(ProtoReader protoReader) {
            C0YQV c0yqv = new C0YQV();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c0yqv.LIZLLL.add(MessageBody.ADAPTER.decode(protoReader));
                            break;
                        case 2:
                            c0yqv.LJ.add(ConversationInfoV2.ADAPTER.decode(protoReader));
                            break;
                        case 3:
                            c0yqv.LJFF = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 4:
                            c0yqv.LJI = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 5:
                            c0yqv.LJII = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 6:
                            try {
                                c0yqv.LJIIIIZZ = C0YQW.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                TryCatchGuardChecker.doCheck(e);
                                c0yqv.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                            break;
                        case 7:
                            c0yqv.LJIIIZ = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 8:
                            c0yqv.LJIIJ = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c0yqv.LJIIJJI.add(ProtoAdapter.BYTES.decode(protoReader));
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c0yqv.LJIIL.putAll(this.LIZ.decode(protoReader));
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c0yqv.LJIILIIL = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c0yqv.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c0yqv.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(MessagesPerUserInitV2ResponseBody messagesPerUserInitV2ResponseBody) {
            MessagesPerUserInitV2ResponseBody messagesPerUserInitV2ResponseBody2 = messagesPerUserInitV2ResponseBody;
            int iEncodedSizeWithTag = MessageBody.ADAPTER.asRepeated().encodedSizeWithTag(1, messagesPerUserInitV2ResponseBody2.messages) + ConversationInfoV2.ADAPTER.asRepeated().encodedSizeWithTag(2, messagesPerUserInitV2ResponseBody2.conversations);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(3, messagesPerUserInitV2ResponseBody2.per_user_cursor) + protoAdapter.encodedSizeWithTag(4, messagesPerUserInitV2ResponseBody2.next_cursor) + ProtoAdapter.BOOL.encodedSizeWithTag(5, messagesPerUserInitV2ResponseBody2.has_more) + C0YQW.ADAPTER.encodedSizeWithTag(6, messagesPerUserInitV2ResponseBody2.init_type) + protoAdapter.encodedSizeWithTag(7, messagesPerUserInitV2ResponseBody2.cmd_start_index) + protoAdapter.encodedSizeWithTag(8, messagesPerUserInitV2ResponseBody2.next_conversation_version) + ProtoAdapter.BYTES.asRepeated().encodedSizeWithTag(9, messagesPerUserInitV2ResponseBody2.messages_pb) + this.LIZ.encodedSizeWithTag(10, messagesPerUserInitV2ResponseBody2.conv_has_more) + protoAdapter.encodedSizeWithTag(11, messagesPerUserInitV2ResponseBody2.priority_next_cursor) + messagesPerUserInitV2ResponseBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, MessagesPerUserInitV2ResponseBody messagesPerUserInitV2ResponseBody) {
            MessagesPerUserInitV2ResponseBody messagesPerUserInitV2ResponseBody2 = messagesPerUserInitV2ResponseBody;
            MessageBody.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, messagesPerUserInitV2ResponseBody2.messages);
            ConversationInfoV2.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, messagesPerUserInitV2ResponseBody2.conversations);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 3, messagesPerUserInitV2ResponseBody2.per_user_cursor);
            protoAdapter.encodeWithTag(protoWriter, 4, messagesPerUserInitV2ResponseBody2.next_cursor);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, messagesPerUserInitV2ResponseBody2.has_more);
            C0YQW.ADAPTER.encodeWithTag(protoWriter, 6, messagesPerUserInitV2ResponseBody2.init_type);
            protoAdapter.encodeWithTag(protoWriter, 7, messagesPerUserInitV2ResponseBody2.cmd_start_index);
            protoAdapter.encodeWithTag(protoWriter, 8, messagesPerUserInitV2ResponseBody2.next_conversation_version);
            ProtoAdapter.BYTES.asRepeated().encodeWithTag(protoWriter, 9, messagesPerUserInitV2ResponseBody2.messages_pb);
            this.LIZ.encodeWithTag(protoWriter, 10, messagesPerUserInitV2ResponseBody2.conv_has_more);
            protoAdapter.encodeWithTag(protoWriter, 11, messagesPerUserInitV2ResponseBody2.priority_next_cursor);
            protoWriter.writeBytes(messagesPerUserInitV2ResponseBody2.unknownFields());
        }
    };
    public static final Long DEFAULT_PER_USER_CURSOR = 0L;
    public static final Long DEFAULT_NEXT_CURSOR = 0L;
    public static final Boolean DEFAULT_HAS_MORE = Boolean.FALSE;
    public static final C0YQW DEFAULT_INIT_TYPE = C0YQW.TYPE_BY_CONVERSATION;
    public static final Long DEFAULT_CMD_START_INDEX = 0L;
    public static final Long DEFAULT_NEXT_CONVERSATION_VERSION = 0L;
    public static final Long DEFAULT_PRIORITY_NEXT_CURSOR = 0L;

    @Override // com.squareup.wire.Message
    public C0YQV newBuilder() {
        C0YQV c0yqv = new C0YQV();
        c0yqv.LIZLLL = C1516540pZE.LIZJ("messages", this.messages);
        c0yqv.LJ = C1516540pZE.LIZJ("conversations", this.conversations);
        c0yqv.LJFF = this.per_user_cursor;
        c0yqv.LJI = this.next_cursor;
        c0yqv.LJII = this.has_more;
        c0yqv.LJIIIIZZ = this.init_type;
        c0yqv.LJIIIZ = this.cmd_start_index;
        c0yqv.LJIIJ = this.next_conversation_version;
        c0yqv.LJIIJJI = C1516540pZE.LIZJ("messages_pb", this.messages_pb);
        c0yqv.LJIIL = C1516540pZE.LIZLLL("conv_has_more", this.conv_has_more);
        c0yqv.LJIILIIL = this.priority_next_cursor;
        c0yqv.addUnknownFields(unknownFields());
        return c0yqv;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<MessageBody> list = this.messages;
        if (list != null && !list.isEmpty()) {
            sb.append(", messages=");
            sb.append(this.messages);
        }
        List<ConversationInfoV2> list2 = this.conversations;
        if (list2 != null && !list2.isEmpty()) {
            sb.append(", conversations=");
            sb.append(this.conversations);
        }
        if (this.per_user_cursor != null) {
            sb.append(", per_user_cursor=");
            sb.append(this.per_user_cursor);
        }
        if (this.next_cursor != null) {
            sb.append(", next_cursor=");
            sb.append(this.next_cursor);
        }
        if (this.has_more != null) {
            sb.append(", has_more=");
            sb.append(this.has_more);
        }
        if (this.init_type != null) {
            sb.append(", init_type=");
            sb.append(this.init_type);
        }
        if (this.cmd_start_index != null) {
            sb.append(", cmd_start_index=");
            sb.append(this.cmd_start_index);
        }
        if (this.next_conversation_version != null) {
            sb.append(", next_conversation_version=");
            sb.append(this.next_conversation_version);
        }
        List<ByteString> list3 = this.messages_pb;
        if (list3 != null && !list3.isEmpty()) {
            sb.append(", messages_pb=");
            sb.append(this.messages_pb);
        }
        Map<Long, Boolean> map = this.conv_has_more;
        if (map != null && !map.isEmpty()) {
            sb.append(", conv_has_more=");
            sb.append(this.conv_has_more);
        }
        if (this.priority_next_cursor != null) {
            sb.append(", priority_next_cursor=");
            sb.append(this.priority_next_cursor);
        }
        sb.replace(0, 2, "MessagesPerUserInitV2ResponseBody{");
        sb.append('}');
        return sb.toString();
    }

    public MessagesPerUserInitV2ResponseBody(List<MessageBody> list, List<ConversationInfoV2> list2, Long l, Long l2, Boolean bool, C0YQW c0yqw, Long l3, Long l4, List<ByteString> list3, Map<Long, Boolean> map, Long l5) {
        this(list, list2, l, l2, bool, c0yqw, l3, l4, list3, map, l5, ByteString.EMPTY);
    }

    public MessagesPerUserInitV2ResponseBody(List<MessageBody> list, List<ConversationInfoV2> list2, Long l, Long l2, Boolean bool, C0YQW c0yqw, Long l3, Long l4, List<ByteString> list3, Map<Long, Boolean> map, Long l5, ByteString byteString) {
        super(ADAPTER, byteString);
        this.messages = C1516540pZE.LJFF("messages", list);
        this.conversations = C1516540pZE.LJFF("conversations", list2);
        this.per_user_cursor = l;
        this.next_cursor = l2;
        this.has_more = bool;
        this.init_type = c0yqw;
        this.cmd_start_index = l3;
        this.next_conversation_version = l4;
        this.messages_pb = C1516540pZE.LJFF("messages_pb", list3);
        this.conv_has_more = C1516540pZE.LJI("conv_has_more", map);
        this.priority_next_cursor = l5;
    }
}
