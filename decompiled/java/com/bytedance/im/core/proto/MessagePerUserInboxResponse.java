package com.bytedance.im.core.proto;

import X.C09CT;
import X.C0YFV;
import X.C0YSE;
import X.C1516540pZE;
import com.bytedance.im.core.proto.ConversationBadgeCountInfo;
import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.im.core.proto.MessagePerUserInboxResponse;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.List;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public final class MessagePerUserInboxResponse extends Message<MessagePerUserInboxResponse, C0YSE> {
    public static final long serialVersionUID = 0;

    @C09CT("conversation_badge_count")
    public final List<ConversationBadgeCountInfo> conversation_badge_count;

    @C09CT("cursor_type")
    public final C0YFV cursor_type;

    @C09CT("error_desc")
    public final String error_desc;

    @C09CT("has_more")
    public final Boolean has_more;

    @C09CT("inbox_type")
    public final Integer inbox_type;

    @C09CT("messages")
    public final List<MessageBody> messages;

    @C09CT("messages_pb")
    public final List<ByteString> messages_pb;

    @C09CT("next_cursor")
    public final Long next_cursor;

    @C09CT("next_interval")
    public final Long next_interval;

    @C09CT("status_code")
    public final Integer status_code;
    public static final ProtoAdapter<MessagePerUserInboxResponse> ADAPTER = new ProtoAdapter<MessagePerUserInboxResponse>() { // from class: X.0YSD
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final MessagePerUserInboxResponse decode(ProtoReader protoReader) {
            C0YSE c0yse = new C0YSE();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c0yse.LIZLLL = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 2:
                            c0yse.LJ.add(MessageBody.ADAPTER.decode(protoReader));
                            break;
                        case 3:
                            c0yse.LJFF.add(ProtoAdapter.BYTES.decode(protoReader));
                            break;
                        case 4:
                            c0yse.LJI = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 5:
                            c0yse.LJII = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 6:
                            c0yse.LJIIIIZZ = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 7:
                            c0yse.LJIIIZ = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 8:
                            c0yse.LJIIJ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c0yse.LJIIJJI.add(ConversationBadgeCountInfo.ADAPTER.decode(protoReader));
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            try {
                                c0yse.LJIIL = C0YFV.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                TryCatchGuardChecker.doCheck(e);
                                c0yse.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c0yse.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c0yse.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(MessagePerUserInboxResponse messagePerUserInboxResponse) {
            MessagePerUserInboxResponse messagePerUserInboxResponse2 = messagePerUserInboxResponse;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, messagePerUserInboxResponse2.inbox_type) + MessageBody.ADAPTER.asRepeated().encodedSizeWithTag(2, messagePerUserInboxResponse2.messages) + ProtoAdapter.BYTES.asRepeated().encodedSizeWithTag(3, messagePerUserInboxResponse2.messages_pb) + ProtoAdapter.BOOL.encodedSizeWithTag(4, messagePerUserInboxResponse2.has_more);
            ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(5, messagePerUserInboxResponse2.next_cursor) + protoAdapter2.encodedSizeWithTag(6, messagePerUserInboxResponse2.next_interval) + protoAdapter.encodedSizeWithTag(7, messagePerUserInboxResponse2.status_code) + ProtoAdapter.STRING.encodedSizeWithTag(8, messagePerUserInboxResponse2.error_desc) + ConversationBadgeCountInfo.ADAPTER.asRepeated().encodedSizeWithTag(9, messagePerUserInboxResponse2.conversation_badge_count) + C0YFV.ADAPTER.encodedSizeWithTag(10, messagePerUserInboxResponse2.cursor_type) + messagePerUserInboxResponse2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, MessagePerUserInboxResponse messagePerUserInboxResponse) {
            MessagePerUserInboxResponse messagePerUserInboxResponse2 = messagePerUserInboxResponse;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            protoAdapter.encodeWithTag(protoWriter, 1, messagePerUserInboxResponse2.inbox_type);
            MessageBody.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, messagePerUserInboxResponse2.messages);
            ProtoAdapter.BYTES.asRepeated().encodeWithTag(protoWriter, 3, messagePerUserInboxResponse2.messages_pb);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, messagePerUserInboxResponse2.has_more);
            ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
            protoAdapter2.encodeWithTag(protoWriter, 5, messagePerUserInboxResponse2.next_cursor);
            protoAdapter2.encodeWithTag(protoWriter, 6, messagePerUserInboxResponse2.next_interval);
            protoAdapter.encodeWithTag(protoWriter, 7, messagePerUserInboxResponse2.status_code);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, messagePerUserInboxResponse2.error_desc);
            ConversationBadgeCountInfo.ADAPTER.asRepeated().encodeWithTag(protoWriter, 9, messagePerUserInboxResponse2.conversation_badge_count);
            C0YFV.ADAPTER.encodeWithTag(protoWriter, 10, messagePerUserInboxResponse2.cursor_type);
            protoWriter.writeBytes(messagePerUserInboxResponse2.unknownFields());
        }
    };
    public static final Integer DEFAULT_INBOX_TYPE = 0;
    public static final Boolean DEFAULT_HAS_MORE = Boolean.FALSE;
    public static final Long DEFAULT_NEXT_CURSOR = 0L;
    public static final Long DEFAULT_NEXT_INTERVAL = 0L;
    public static final Integer DEFAULT_STATUS_CODE = 0;
    public static final C0YFV DEFAULT_CURSOR_TYPE = C0YFV.CURSOR_TYPE_USER_MSG_CHAIN;

    @Override // com.squareup.wire.Message
    public C0YSE newBuilder() {
        C0YSE c0yse = new C0YSE();
        c0yse.LIZLLL = this.inbox_type;
        c0yse.LJ = C1516540pZE.LIZJ("messages", this.messages);
        c0yse.LJFF = C1516540pZE.LIZJ("messages_pb", this.messages_pb);
        c0yse.LJI = this.has_more;
        c0yse.LJII = this.next_cursor;
        c0yse.LJIIIIZZ = this.next_interval;
        c0yse.LJIIIZ = this.status_code;
        c0yse.LJIIJ = this.error_desc;
        c0yse.LJIIJJI = C1516540pZE.LIZJ("conversation_badge_count", this.conversation_badge_count);
        c0yse.LJIIL = this.cursor_type;
        c0yse.addUnknownFields(unknownFields());
        return c0yse;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.inbox_type != null) {
            sb.append(", inbox_type=");
            sb.append(this.inbox_type);
        }
        List<MessageBody> list = this.messages;
        if (list != null && !list.isEmpty()) {
            sb.append(", messages=");
            sb.append(this.messages);
        }
        List<ByteString> list2 = this.messages_pb;
        if (list2 != null && !list2.isEmpty()) {
            sb.append(", messages_pb=");
            sb.append(this.messages_pb);
        }
        if (this.has_more != null) {
            sb.append(", has_more=");
            sb.append(this.has_more);
        }
        if (this.next_cursor != null) {
            sb.append(", next_cursor=");
            sb.append(this.next_cursor);
        }
        if (this.next_interval != null) {
            sb.append(", next_interval=");
            sb.append(this.next_interval);
        }
        if (this.status_code != null) {
            sb.append(", status_code=");
            sb.append(this.status_code);
        }
        if (this.error_desc != null) {
            sb.append(", error_desc=");
            sb.append(this.error_desc);
        }
        List<ConversationBadgeCountInfo> list3 = this.conversation_badge_count;
        if (list3 != null && !list3.isEmpty()) {
            sb.append(", conversation_badge_count=");
            sb.append(this.conversation_badge_count);
        }
        if (this.cursor_type != null) {
            sb.append(", cursor_type=");
            sb.append(this.cursor_type);
        }
        sb.replace(0, 2, "MessagePerUserInboxResponse{");
        sb.append('}');
        return sb.toString();
    }

    public MessagePerUserInboxResponse(Integer num, List<MessageBody> list, List<ByteString> list2, Boolean bool, Long l, Long l2, Integer num2, String str, List<ConversationBadgeCountInfo> list3, C0YFV c0yfv) {
        this(num, list, list2, bool, l, l2, num2, str, list3, c0yfv, ByteString.EMPTY);
    }

    public MessagePerUserInboxResponse(Integer num, List<MessageBody> list, List<ByteString> list2, Boolean bool, Long l, Long l2, Integer num2, String str, List<ConversationBadgeCountInfo> list3, C0YFV c0yfv, ByteString byteString) {
        super(ADAPTER, byteString);
        this.inbox_type = num;
        this.messages = C1516540pZE.LJFF("messages", list);
        this.messages_pb = C1516540pZE.LJFF("messages_pb", list2);
        this.has_more = bool;
        this.next_cursor = l;
        this.next_interval = l2;
        this.status_code = num2;
        this.error_desc = str;
        this.conversation_badge_count = C1516540pZE.LJFF("conversation_badge_count", list3);
        this.cursor_type = c0yfv;
    }
}
