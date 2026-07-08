package com.bytedance.im.core.proto;

import X.C09CT;
import X.C0Y13;
import X.EnumC868460Y5c;
import com.bytedance.im.core.proto.MarkConversationReadRequestBody;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public final class MarkConversationReadRequestBody extends Message<MarkConversationReadRequestBody, C0Y13> {
    public static final long serialVersionUID = 0;

    @C09CT("conv_unread_count")
    public final Long conv_unread_count;

    @C09CT("conversation_id")
    public final String conversation_id;

    @C09CT("conversation_short_id")
    public final Long conversation_short_id;

    @C09CT("conversation_type")
    public final Integer conversation_type;

    @C09CT("fake_unread_count")
    public final Integer fake_unread_count;

    @C09CT("mark_read_type")
    public final EnumC868460Y5c mark_read_type;

    @C09CT("read_badge_count")
    public final Integer read_badge_count;

    @C09CT("read_badge_count_v2")
    public final Integer read_badge_count_v2;

    @C09CT("read_message_index")
    public final Long read_message_index;

    @C09CT("read_message_index_v2")
    public final Long read_message_index_v2;

    @C09CT("read_property_idempotent_id")
    public final String read_property_idempotent_id;

    @C09CT("read_property_key")
    public final String read_property_key;

    @C09CT("server_message_id")
    public final Long server_message_id;

    @C09CT("ticket")
    public final String ticket;

    @C09CT("total_unread_count")
    public final Long total_unread_count;
    public static final ProtoAdapter<MarkConversationReadRequestBody> ADAPTER = new ProtoAdapter<MarkConversationReadRequestBody>() { // from class: X.0Y2k
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final MarkConversationReadRequestBody decode(ProtoReader protoReader) {
            C0Y13 c0y13 = new C0Y13();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c0y13.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c0y13.LJ = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 3:
                            c0y13.LJFF = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 4:
                            c0y13.LJI = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 5:
                            c0y13.LJII = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 6:
                            c0y13.LJIIIIZZ = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 7:
                            c0y13.LJIIIZ = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 8:
                            c0y13.LJIIJ = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c0y13.LJIIJJI = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c0y13.LJIIL = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c0y13.LJIILIIL = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            try {
                                c0y13.LJIILJJIL = EnumC868460Y5c.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                TryCatchGuardChecker.doCheck(e);
                                c0y13.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            c0y13.LJIILL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 14:
                            c0y13.LJIILLIIL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 15:
                            c0y13.LJIIZILJ = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c0y13.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c0y13.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(MarkConversationReadRequestBody markConversationReadRequestBody) {
            MarkConversationReadRequestBody markConversationReadRequestBody2 = markConversationReadRequestBody;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, markConversationReadRequestBody2.conversation_id);
            ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(2, markConversationReadRequestBody2.conversation_short_id);
            ProtoAdapter<Integer> protoAdapter3 = ProtoAdapter.INT32;
            return iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(3, markConversationReadRequestBody2.conversation_type) + protoAdapter2.encodedSizeWithTag(4, markConversationReadRequestBody2.read_message_index) + protoAdapter2.encodedSizeWithTag(5, markConversationReadRequestBody2.conv_unread_count) + protoAdapter2.encodedSizeWithTag(6, markConversationReadRequestBody2.total_unread_count) + protoAdapter2.encodedSizeWithTag(7, markConversationReadRequestBody2.read_message_index_v2) + protoAdapter3.encodedSizeWithTag(8, markConversationReadRequestBody2.read_badge_count) + protoAdapter.encodedSizeWithTag(9, markConversationReadRequestBody2.ticket) + protoAdapter2.encodedSizeWithTag(10, markConversationReadRequestBody2.server_message_id) + protoAdapter3.encodedSizeWithTag(11, markConversationReadRequestBody2.read_badge_count_v2) + EnumC868460Y5c.ADAPTER.encodedSizeWithTag(12, markConversationReadRequestBody2.mark_read_type) + protoAdapter.encodedSizeWithTag(13, markConversationReadRequestBody2.read_property_key) + protoAdapter.encodedSizeWithTag(14, markConversationReadRequestBody2.read_property_idempotent_id) + protoAdapter3.encodedSizeWithTag(15, markConversationReadRequestBody2.fake_unread_count) + markConversationReadRequestBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, MarkConversationReadRequestBody markConversationReadRequestBody) {
            MarkConversationReadRequestBody markConversationReadRequestBody2 = markConversationReadRequestBody;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, markConversationReadRequestBody2.conversation_id);
            ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
            protoAdapter2.encodeWithTag(protoWriter, 2, markConversationReadRequestBody2.conversation_short_id);
            ProtoAdapter<Integer> protoAdapter3 = ProtoAdapter.INT32;
            protoAdapter3.encodeWithTag(protoWriter, 3, markConversationReadRequestBody2.conversation_type);
            protoAdapter2.encodeWithTag(protoWriter, 4, markConversationReadRequestBody2.read_message_index);
            protoAdapter2.encodeWithTag(protoWriter, 5, markConversationReadRequestBody2.conv_unread_count);
            protoAdapter2.encodeWithTag(protoWriter, 6, markConversationReadRequestBody2.total_unread_count);
            protoAdapter2.encodeWithTag(protoWriter, 7, markConversationReadRequestBody2.read_message_index_v2);
            protoAdapter3.encodeWithTag(protoWriter, 8, markConversationReadRequestBody2.read_badge_count);
            protoAdapter.encodeWithTag(protoWriter, 9, markConversationReadRequestBody2.ticket);
            protoAdapter2.encodeWithTag(protoWriter, 10, markConversationReadRequestBody2.server_message_id);
            protoAdapter3.encodeWithTag(protoWriter, 11, markConversationReadRequestBody2.read_badge_count_v2);
            EnumC868460Y5c.ADAPTER.encodeWithTag(protoWriter, 12, markConversationReadRequestBody2.mark_read_type);
            protoAdapter.encodeWithTag(protoWriter, 13, markConversationReadRequestBody2.read_property_key);
            protoAdapter.encodeWithTag(protoWriter, 14, markConversationReadRequestBody2.read_property_idempotent_id);
            protoAdapter3.encodeWithTag(protoWriter, 15, markConversationReadRequestBody2.fake_unread_count);
            protoWriter.writeBytes(markConversationReadRequestBody2.unknownFields());
        }
    };
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;
    public static final Long DEFAULT_READ_MESSAGE_INDEX = 0L;
    public static final Long DEFAULT_CONV_UNREAD_COUNT = 0L;
    public static final Long DEFAULT_TOTAL_UNREAD_COUNT = 0L;
    public static final Long DEFAULT_READ_MESSAGE_INDEX_V2 = 0L;
    public static final Integer DEFAULT_READ_BADGE_COUNT = 0;
    public static final Long DEFAULT_SERVER_MESSAGE_ID = 0L;
    public static final Integer DEFAULT_READ_BADGE_COUNT_V2 = 0;
    public static final EnumC868460Y5c DEFAULT_MARK_READ_TYPE = EnumC868460Y5c.TYPE_USER_MESSAGE;
    public static final Integer DEFAULT_FAKE_UNREAD_COUNT = 0;

    @Override // com.squareup.wire.Message
    public C0Y13 newBuilder() {
        C0Y13 c0y13 = new C0Y13();
        c0y13.LIZLLL = this.conversation_id;
        c0y13.LJ = this.conversation_short_id;
        c0y13.LJFF = this.conversation_type;
        c0y13.LJI = this.read_message_index;
        c0y13.LJII = this.conv_unread_count;
        c0y13.LJIIIIZZ = this.total_unread_count;
        c0y13.LJIIIZ = this.read_message_index_v2;
        c0y13.LJIIJ = this.read_badge_count;
        c0y13.LJIIJJI = this.ticket;
        c0y13.LJIIL = this.server_message_id;
        c0y13.LJIILIIL = this.read_badge_count_v2;
        c0y13.LJIILJJIL = this.mark_read_type;
        c0y13.LJIILL = this.read_property_key;
        c0y13.LJIILLIIL = this.read_property_idempotent_id;
        c0y13.LJIIZILJ = this.fake_unread_count;
        c0y13.addUnknownFields(unknownFields());
        return c0y13;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.conversation_id != null) {
            sb.append(", conversation_id=");
            sb.append(this.conversation_id);
        }
        if (this.conversation_short_id != null) {
            sb.append(", conversation_short_id=");
            sb.append(this.conversation_short_id);
        }
        if (this.conversation_type != null) {
            sb.append(", conversation_type=");
            sb.append(this.conversation_type);
        }
        if (this.read_message_index != null) {
            sb.append(", read_message_index=");
            sb.append(this.read_message_index);
        }
        if (this.conv_unread_count != null) {
            sb.append(", conv_unread_count=");
            sb.append(this.conv_unread_count);
        }
        if (this.total_unread_count != null) {
            sb.append(", total_unread_count=");
            sb.append(this.total_unread_count);
        }
        if (this.read_message_index_v2 != null) {
            sb.append(", read_message_index_v2=");
            sb.append(this.read_message_index_v2);
        }
        if (this.read_badge_count != null) {
            sb.append(", read_badge_count=");
            sb.append(this.read_badge_count);
        }
        if (this.ticket != null) {
            sb.append(", ticket=");
            sb.append(this.ticket);
        }
        if (this.server_message_id != null) {
            sb.append(", server_message_id=");
            sb.append(this.server_message_id);
        }
        if (this.read_badge_count_v2 != null) {
            sb.append(", read_badge_count_v2=");
            sb.append(this.read_badge_count_v2);
        }
        if (this.mark_read_type != null) {
            sb.append(", mark_read_type=");
            sb.append(this.mark_read_type);
        }
        if (this.read_property_key != null) {
            sb.append(", read_property_key=");
            sb.append(this.read_property_key);
        }
        if (this.read_property_idempotent_id != null) {
            sb.append(", read_property_idempotent_id=");
            sb.append(this.read_property_idempotent_id);
        }
        if (this.fake_unread_count != null) {
            sb.append(", fake_unread_count=");
            sb.append(this.fake_unread_count);
        }
        sb.replace(0, 2, "MarkConversationReadRequestBody{");
        sb.append('}');
        return sb.toString();
    }

    public MarkConversationReadRequestBody(String str, Long l, Integer num, Long l2, Long l3, Long l4, Long l5, Integer num2, String str2, Long l6, Integer num3, EnumC868460Y5c enumC868460Y5c, String str3, String str4, Integer num4) {
        this(str, l, num, l2, l3, l4, l5, num2, str2, l6, num3, enumC868460Y5c, str3, str4, num4, ByteString.EMPTY);
    }

    public MarkConversationReadRequestBody(String str, Long l, Integer num, Long l2, Long l3, Long l4, Long l5, Integer num2, String str2, Long l6, Integer num3, EnumC868460Y5c enumC868460Y5c, String str3, String str4, Integer num4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_id = str;
        this.conversation_short_id = l;
        this.conversation_type = num;
        this.read_message_index = l2;
        this.conv_unread_count = l3;
        this.total_unread_count = l4;
        this.read_message_index_v2 = l5;
        this.read_badge_count = num2;
        this.ticket = str2;
        this.server_message_id = l6;
        this.read_badge_count_v2 = num3;
        this.mark_read_type = enumC868460Y5c;
        this.read_property_key = str3;
        this.read_property_idempotent_id = str4;
        this.fake_unread_count = num4;
    }
}
