package com.bytedance.im.core.proto;

import X.C09CT;
import X.C0YFV;
import X.C2274631E1l;
import X.EnumC19361910oz;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.im.core.proto.MsgTrace;
import com.bytedance.im.core.proto.MuteBadgeCountInfo;
import com.bytedance.im.core.proto.NewMessageNotify;
import com.bytedance.im.core.proto.ReferenceInfo;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import okio.ByteString;

/* JADX INFO: loaded from: classes36.dex */
public final class NewMessageNotify extends Message<NewMessageNotify, C2274631E1l> {
    public static final long serialVersionUID = 0;

    @C09CT("badge_count")
    public final Integer badge_count;

    @C09CT("badge_count_v2")
    public final Integer badge_count_v2;

    @C09CT("badge_version")
    public final Long badge_version;

    @C09CT("cmd_message_index")
    public final Long cmd_message_index;

    @C09CT("conversation_id")
    public final String conversation_id;

    @C09CT("conversation_type")
    public final Integer conversation_type;

    @C09CT("conversation_version")
    public final Long conversation_version;

    @C09CT("cross_region_push")
    public final Boolean cross_region_push;

    @C09CT("cursor_type")
    public final C0YFV cursor_type;

    @C09CT("index_in_conversation")
    public final Long index_in_conversation;

    @C09CT("index_in_conversation_v2")
    public final Long index_in_conversation_v2;

    @C09CT("message")
    public final MessageBody message;

    @C09CT("mute_badge_count_info")
    public final MuteBadgeCountInfo mute_badge_count_info;

    @C09CT("next_cursor")
    public final Long next_cursor;

    @C09CT("notify_type")
    public final EnumC19361910oz notify_type;

    @C09CT("pre_readconv_version")
    public final Long pre_readconv_version;

    @C09CT("previous_conversation_version")
    public final Long previous_conversation_version;

    @C09CT("previous_cursor")
    public final Long previous_cursor;

    @C09CT("previous_msg_index_in_conv")
    public final Long previous_msg_index_in_conv;

    @C09CT("push_preview")
    public final String push_preview;

    @C09CT("readconv_version")
    public final Long readconv_version;

    @C09CT("ref_msg_info")
    public final ReferenceInfo ref_msg_info;

    @C09CT("trace")
    public final MsgTrace trace;
    public static final ProtoAdapter<NewMessageNotify> ADAPTER = new ProtoAdapter<NewMessageNotify>() { // from class: X.1E1k
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final NewMessageNotify decode(ProtoReader protoReader) {
            C2274631E1l c2274631E1l = new C2274631E1l();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 2:
                            c2274631E1l.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c2274631E1l.LJ = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 4:
                            try {
                                c2274631E1l.LJFF = EnumC19361910oz.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                TryCatchGuardChecker.doCheck(e);
                                c2274631E1l.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                            break;
                        case 5:
                            c2274631E1l.LJI = MessageBody.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            c2274631E1l.LJII = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 7:
                            c2274631E1l.LJIIIIZZ = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 8:
                            c2274631E1l.LJIIIZ = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c2274631E1l.LJIIJ = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c2274631E1l.LJIIJJI = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c2274631E1l.LJIIL = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            c2274631E1l.LJIILIIL = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            c2274631E1l.LJIILJJIL = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 14:
                            c2274631E1l.LJIILL = MsgTrace.ADAPTER.decode(protoReader);
                            break;
                        case 15:
                            c2274631E1l.LJIILLIIL = ReferenceInfo.ADAPTER.decode(protoReader);
                            break;
                        case 16:
                            c2274631E1l.LJIIZILJ = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                            c2274631E1l.LJIJ = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                            c2274631E1l.LJIJI = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 19:
                            c2274631E1l.LJIJJ = MuteBadgeCountInfo.ADAPTER.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                            c2274631E1l.LJIJJLI = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 21:
                            c2274631E1l.LJIL = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 22:
                            c2274631E1l.LJJ = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 23:
                            try {
                                c2274631E1l.LJJI = C0YFV.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                TryCatchGuardChecker.doCheck(e2);
                                c2274631E1l.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                            }
                            break;
                        case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                            c2274631E1l.LJJIFFI = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2274631E1l.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2274631E1l.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(NewMessageNotify newMessageNotify) {
            NewMessageNotify newMessageNotify2 = newMessageNotify;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(2, newMessageNotify2.conversation_id);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(3, newMessageNotify2.conversation_type) + EnumC19361910oz.ADAPTER.encodedSizeWithTag(4, newMessageNotify2.notify_type) + MessageBody.ADAPTER.encodedSizeWithTag(5, newMessageNotify2.message);
            ProtoAdapter<Long> protoAdapter3 = ProtoAdapter.INT64;
            return iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(6, newMessageNotify2.previous_cursor) + protoAdapter3.encodedSizeWithTag(7, newMessageNotify2.next_cursor) + protoAdapter3.encodedSizeWithTag(8, newMessageNotify2.index_in_conversation) + protoAdapter3.encodedSizeWithTag(9, newMessageNotify2.index_in_conversation_v2) + protoAdapter3.encodedSizeWithTag(10, newMessageNotify2.conversation_version) + protoAdapter3.encodedSizeWithTag(11, newMessageNotify2.previous_conversation_version) + protoAdapter3.encodedSizeWithTag(12, newMessageNotify2.cmd_message_index) + protoAdapter2.encodedSizeWithTag(13, newMessageNotify2.badge_count) + MsgTrace.ADAPTER.encodedSizeWithTag(14, newMessageNotify2.trace) + ReferenceInfo.ADAPTER.encodedSizeWithTag(15, newMessageNotify2.ref_msg_info) + protoAdapter3.encodedSizeWithTag(16, newMessageNotify2.previous_msg_index_in_conv) + protoAdapter3.encodedSizeWithTag(17, newMessageNotify2.readconv_version) + protoAdapter3.encodedSizeWithTag(18, newMessageNotify2.pre_readconv_version) + MuteBadgeCountInfo.ADAPTER.encodedSizeWithTag(19, newMessageNotify2.mute_badge_count_info) + protoAdapter.encodedSizeWithTag(20, newMessageNotify2.push_preview) + protoAdapter2.encodedSizeWithTag(21, newMessageNotify2.badge_count_v2) + protoAdapter3.encodedSizeWithTag(22, newMessageNotify2.badge_version) + C0YFV.ADAPTER.encodedSizeWithTag(23, newMessageNotify2.cursor_type) + ProtoAdapter.BOOL.encodedSizeWithTag(24, newMessageNotify2.cross_region_push) + newMessageNotify2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, NewMessageNotify newMessageNotify) {
            NewMessageNotify newMessageNotify2 = newMessageNotify;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 2, newMessageNotify2.conversation_id);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            protoAdapter2.encodeWithTag(protoWriter, 3, newMessageNotify2.conversation_type);
            EnumC19361910oz.ADAPTER.encodeWithTag(protoWriter, 4, newMessageNotify2.notify_type);
            MessageBody.ADAPTER.encodeWithTag(protoWriter, 5, newMessageNotify2.message);
            ProtoAdapter<Long> protoAdapter3 = ProtoAdapter.INT64;
            protoAdapter3.encodeWithTag(protoWriter, 6, newMessageNotify2.previous_cursor);
            protoAdapter3.encodeWithTag(protoWriter, 7, newMessageNotify2.next_cursor);
            protoAdapter3.encodeWithTag(protoWriter, 8, newMessageNotify2.index_in_conversation);
            protoAdapter3.encodeWithTag(protoWriter, 9, newMessageNotify2.index_in_conversation_v2);
            protoAdapter3.encodeWithTag(protoWriter, 10, newMessageNotify2.conversation_version);
            protoAdapter3.encodeWithTag(protoWriter, 11, newMessageNotify2.previous_conversation_version);
            protoAdapter3.encodeWithTag(protoWriter, 12, newMessageNotify2.cmd_message_index);
            protoAdapter2.encodeWithTag(protoWriter, 13, newMessageNotify2.badge_count);
            MsgTrace.ADAPTER.encodeWithTag(protoWriter, 14, newMessageNotify2.trace);
            ReferenceInfo.ADAPTER.encodeWithTag(protoWriter, 15, newMessageNotify2.ref_msg_info);
            protoAdapter3.encodeWithTag(protoWriter, 16, newMessageNotify2.previous_msg_index_in_conv);
            protoAdapter3.encodeWithTag(protoWriter, 17, newMessageNotify2.readconv_version);
            protoAdapter3.encodeWithTag(protoWriter, 18, newMessageNotify2.pre_readconv_version);
            MuteBadgeCountInfo.ADAPTER.encodeWithTag(protoWriter, 19, newMessageNotify2.mute_badge_count_info);
            protoAdapter.encodeWithTag(protoWriter, 20, newMessageNotify2.push_preview);
            protoAdapter2.encodeWithTag(protoWriter, 21, newMessageNotify2.badge_count_v2);
            protoAdapter3.encodeWithTag(protoWriter, 22, newMessageNotify2.badge_version);
            C0YFV.ADAPTER.encodeWithTag(protoWriter, 23, newMessageNotify2.cursor_type);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 24, newMessageNotify2.cross_region_push);
            protoWriter.writeBytes(newMessageNotify2.unknownFields());
        }
    };
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;
    public static final EnumC19361910oz DEFAULT_NOTIFY_TYPE = EnumC19361910oz.PER_USER;
    public static final Long DEFAULT_PREVIOUS_CURSOR = 0L;
    public static final Long DEFAULT_NEXT_CURSOR = 0L;
    public static final Long DEFAULT_INDEX_IN_CONVERSATION = 0L;
    public static final Long DEFAULT_INDEX_IN_CONVERSATION_V2 = 0L;
    public static final Long DEFAULT_CONVERSATION_VERSION = 0L;
    public static final Long DEFAULT_PREVIOUS_CONVERSATION_VERSION = 0L;
    public static final Long DEFAULT_CMD_MESSAGE_INDEX = 0L;
    public static final Integer DEFAULT_BADGE_COUNT = 0;
    public static final Long DEFAULT_PREVIOUS_MSG_INDEX_IN_CONV = 0L;
    public static final Long DEFAULT_READCONV_VERSION = 0L;
    public static final Long DEFAULT_PRE_READCONV_VERSION = 0L;
    public static final Integer DEFAULT_BADGE_COUNT_V2 = 0;
    public static final Long DEFAULT_BADGE_VERSION = 0L;
    public static final C0YFV DEFAULT_CURSOR_TYPE = C0YFV.CURSOR_TYPE_USER_MSG_CHAIN;
    public static final Boolean DEFAULT_CROSS_REGION_PUSH = Boolean.FALSE;

    @Override // com.squareup.wire.Message
    public C2274631E1l newBuilder() {
        C2274631E1l c2274631E1l = new C2274631E1l();
        c2274631E1l.LIZLLL = this.conversation_id;
        c2274631E1l.LJ = this.conversation_type;
        c2274631E1l.LJFF = this.notify_type;
        c2274631E1l.LJI = this.message;
        c2274631E1l.LJII = this.previous_cursor;
        c2274631E1l.LJIIIIZZ = this.next_cursor;
        c2274631E1l.LJIIIZ = this.index_in_conversation;
        c2274631E1l.LJIIJ = this.index_in_conversation_v2;
        c2274631E1l.LJIIJJI = this.conversation_version;
        c2274631E1l.LJIIL = this.previous_conversation_version;
        c2274631E1l.LJIILIIL = this.cmd_message_index;
        c2274631E1l.LJIILJJIL = this.badge_count;
        c2274631E1l.LJIILL = this.trace;
        c2274631E1l.LJIILLIIL = this.ref_msg_info;
        c2274631E1l.LJIIZILJ = this.previous_msg_index_in_conv;
        c2274631E1l.LJIJ = this.readconv_version;
        c2274631E1l.LJIJI = this.pre_readconv_version;
        c2274631E1l.LJIJJ = this.mute_badge_count_info;
        c2274631E1l.LJIJJLI = this.push_preview;
        c2274631E1l.LJIL = this.badge_count_v2;
        c2274631E1l.LJJ = this.badge_version;
        c2274631E1l.LJJI = this.cursor_type;
        c2274631E1l.LJJIFFI = this.cross_region_push;
        c2274631E1l.addUnknownFields(unknownFields());
        return c2274631E1l;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.conversation_id != null) {
            sb.append(", conversation_id=");
            sb.append(this.conversation_id);
        }
        if (this.conversation_type != null) {
            sb.append(", conversation_type=");
            sb.append(this.conversation_type);
        }
        if (this.notify_type != null) {
            sb.append(", notify_type=");
            sb.append(this.notify_type);
        }
        if (this.message != null) {
            sb.append(", message=");
            sb.append(this.message);
        }
        if (this.previous_cursor != null) {
            sb.append(", previous_cursor=");
            sb.append(this.previous_cursor);
        }
        if (this.next_cursor != null) {
            sb.append(", next_cursor=");
            sb.append(this.next_cursor);
        }
        if (this.index_in_conversation != null) {
            sb.append(", index_in_conversation=");
            sb.append(this.index_in_conversation);
        }
        if (this.index_in_conversation_v2 != null) {
            sb.append(", index_in_conversation_v2=");
            sb.append(this.index_in_conversation_v2);
        }
        if (this.conversation_version != null) {
            sb.append(", conversation_version=");
            sb.append(this.conversation_version);
        }
        if (this.previous_conversation_version != null) {
            sb.append(", previous_conversation_version=");
            sb.append(this.previous_conversation_version);
        }
        if (this.cmd_message_index != null) {
            sb.append(", cmd_message_index=");
            sb.append(this.cmd_message_index);
        }
        if (this.badge_count != null) {
            sb.append(", badge_count=");
            sb.append(this.badge_count);
        }
        if (this.trace != null) {
            sb.append(", trace=");
            sb.append(this.trace);
        }
        if (this.ref_msg_info != null) {
            sb.append(", ref_msg_info=");
            sb.append(this.ref_msg_info);
        }
        if (this.previous_msg_index_in_conv != null) {
            sb.append(", previous_msg_index_in_conv=");
            sb.append(this.previous_msg_index_in_conv);
        }
        if (this.readconv_version != null) {
            sb.append(", readconv_version=");
            sb.append(this.readconv_version);
        }
        if (this.pre_readconv_version != null) {
            sb.append(", pre_readconv_version=");
            sb.append(this.pre_readconv_version);
        }
        if (this.mute_badge_count_info != null) {
            sb.append(", mute_badge_count_info=");
            sb.append(this.mute_badge_count_info);
        }
        if (this.push_preview != null) {
            sb.append(", push_preview=");
            sb.append(this.push_preview);
        }
        if (this.badge_count_v2 != null) {
            sb.append(", badge_count_v2=");
            sb.append(this.badge_count_v2);
        }
        if (this.badge_version != null) {
            sb.append(", badge_version=");
            sb.append(this.badge_version);
        }
        if (this.cursor_type != null) {
            sb.append(", cursor_type=");
            sb.append(this.cursor_type);
        }
        if (this.cross_region_push != null) {
            sb.append(", cross_region_push=");
            sb.append(this.cross_region_push);
        }
        sb.replace(0, 2, "NewMessageNotify{");
        sb.append('}');
        return sb.toString();
    }

    public NewMessageNotify(String str, Integer num, EnumC19361910oz enumC19361910oz, MessageBody messageBody, Long l, Long l2, Long l3, Long l4, Long l5, Long l6, Long l7, Integer num2, MsgTrace msgTrace, ReferenceInfo referenceInfo, Long l8, Long l9, Long l10, MuteBadgeCountInfo muteBadgeCountInfo, String str2, Integer num3, Long l11, C0YFV c0yfv, Boolean bool) {
        this(str, num, enumC19361910oz, messageBody, l, l2, l3, l4, l5, l6, l7, num2, msgTrace, referenceInfo, l8, l9, l10, muteBadgeCountInfo, str2, num3, l11, c0yfv, bool, ByteString.EMPTY);
    }

    public NewMessageNotify(String str, Integer num, EnumC19361910oz enumC19361910oz, MessageBody messageBody, Long l, Long l2, Long l3, Long l4, Long l5, Long l6, Long l7, Integer num2, MsgTrace msgTrace, ReferenceInfo referenceInfo, Long l8, Long l9, Long l10, MuteBadgeCountInfo muteBadgeCountInfo, String str2, Integer num3, Long l11, C0YFV c0yfv, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_id = str;
        this.conversation_type = num;
        this.notify_type = enumC19361910oz;
        this.message = messageBody;
        this.previous_cursor = l;
        this.next_cursor = l2;
        this.index_in_conversation = l3;
        this.index_in_conversation_v2 = l4;
        this.conversation_version = l5;
        this.previous_conversation_version = l6;
        this.cmd_message_index = l7;
        this.badge_count = num2;
        this.trace = msgTrace;
        this.ref_msg_info = referenceInfo;
        this.previous_msg_index_in_conv = l8;
        this.readconv_version = l9;
        this.pre_readconv_version = l10;
        this.mute_badge_count_info = muteBadgeCountInfo;
        this.push_preview = str2;
        this.badge_count_v2 = num3;
        this.badge_version = l11;
        this.cursor_type = c0yfv;
        this.cross_region_push = bool;
    }
}
