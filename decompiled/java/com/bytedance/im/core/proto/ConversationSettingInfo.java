package com.bytedance.im.core.proto;

import X.C09CT;
import X.C1516540pZE;
import X.C869360Y8o;
import X.EnumC868530Y5j;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.im.core.proto.ConversationSettingInfo;
import com.bytedance.im.core.proto.im_biz_ext.BizConvSettingPersistentExt;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.Map;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public final class ConversationSettingInfo extends Message<ConversationSettingInfo, C869360Y8o> {
    public static final long serialVersionUID = 0;

    @C09CT("biz_setting_persistent_extra")
    public final BizConvSettingPersistentExt biz_setting_persistent_extra;

    @C09CT("category")
    public final EnumC868530Y5j category;

    @C09CT("conversation_id")
    public final String conversation_id;

    @C09CT("conversation_short_id")
    public final Long conversation_short_id;

    @C09CT("conversation_tags")
    public final String conversation_tags;

    @C09CT("conversation_type")
    public final Integer conversation_type;

    @C09CT("ext")
    public final Map<String, String> ext;

    @C09CT("fake_unread_count")
    public final Integer fake_unread_count;

    @C09CT("favorite")
    public final Integer favorite;

    @C09CT("inbox_type")
    public final Integer inbox_type;

    @C09CT("min_index")
    public final Long min_index;

    @C09CT("min_index_v2")
    public final Long min_index_v2;

    @C09CT("mute")
    public final Integer mute;

    @C09CT("read_badge_count")
    public final Integer read_badge_count;

    @C09CT("read_badge_count_v2")
    public final Integer read_badge_count_v2;

    @C09CT("read_index")
    public final Long read_index;

    @C09CT("read_index_v2")
    public final Long read_index_v2;

    @C09CT("set_favorite_time")
    public final Long set_favorite_time;

    @C09CT("set_top_time")
    public final Long set_top_time;

    @C09CT("setting_version")
    public final Long setting_version;

    @C09CT("stick_on_top")
    public final Integer stick_on_top;
    public static final ProtoAdapter<ConversationSettingInfo> ADAPTER = new ProtoAdapter<ConversationSettingInfo>() { // from class: X.0Y8n
        public final ProtoAdapter<Map<String, String>> LIZ;

        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.LIZ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final ConversationSettingInfo decode(ProtoReader protoReader) {
            C869360Y8o c869360Y8o = new C869360Y8o();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c869360Y8o.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c869360Y8o.LJ = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 3:
                            c869360Y8o.LJFF = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 4:
                            c869360Y8o.LJI = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 5:
                            c869360Y8o.LJII = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 6:
                            c869360Y8o.LJIIIIZZ = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 7:
                            c869360Y8o.LJIIIZ = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 8:
                            c869360Y8o.LJIIJ = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c869360Y8o.LJIIJJI.putAll(this.LIZ.decode(protoReader));
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c869360Y8o.LJIIL = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c869360Y8o.LJIILIIL = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            c869360Y8o.LJIILJJIL = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            c869360Y8o.LJIILL = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 14:
                            c869360Y8o.LJIILLIIL = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 15:
                            c869360Y8o.LJIIZILJ = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 16:
                            c869360Y8o.LJIJ = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                            c869360Y8o.LJIJI = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                            try {
                                c869360Y8o.LJIJJ = EnumC868530Y5j.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                TryCatchGuardChecker.doCheck(e);
                                c869360Y8o.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                            break;
                        case 19:
                            c869360Y8o.LJIJJLI = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                            c869360Y8o.LJIL = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 21:
                            c869360Y8o.LJJ = BizConvSettingPersistentExt.ADAPTER.decode(protoReader);
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c869360Y8o.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c869360Y8o.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(ConversationSettingInfo conversationSettingInfo) {
            ConversationSettingInfo conversationSettingInfo2 = conversationSettingInfo;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, conversationSettingInfo2.conversation_id);
            ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(2, conversationSettingInfo2.conversation_short_id);
            ProtoAdapter<Integer> protoAdapter3 = ProtoAdapter.INT32;
            return iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(3, conversationSettingInfo2.conversation_type) + protoAdapter2.encodedSizeWithTag(4, conversationSettingInfo2.min_index) + protoAdapter2.encodedSizeWithTag(5, conversationSettingInfo2.read_index) + protoAdapter3.encodedSizeWithTag(6, conversationSettingInfo2.mute) + protoAdapter3.encodedSizeWithTag(7, conversationSettingInfo2.stick_on_top) + protoAdapter3.encodedSizeWithTag(8, conversationSettingInfo2.inbox_type) + this.LIZ.encodedSizeWithTag(9, conversationSettingInfo2.ext) + protoAdapter2.encodedSizeWithTag(10, conversationSettingInfo2.setting_version) + protoAdapter3.encodedSizeWithTag(11, conversationSettingInfo2.favorite) + protoAdapter2.encodedSizeWithTag(12, conversationSettingInfo2.set_top_time) + protoAdapter2.encodedSizeWithTag(13, conversationSettingInfo2.set_favorite_time) + protoAdapter2.encodedSizeWithTag(14, conversationSettingInfo2.read_index_v2) + protoAdapter2.encodedSizeWithTag(15, conversationSettingInfo2.min_index_v2) + protoAdapter3.encodedSizeWithTag(16, conversationSettingInfo2.read_badge_count) + protoAdapter3.encodedSizeWithTag(17, conversationSettingInfo2.read_badge_count_v2) + EnumC868530Y5j.ADAPTER.encodedSizeWithTag(18, conversationSettingInfo2.category) + protoAdapter.encodedSizeWithTag(19, conversationSettingInfo2.conversation_tags) + protoAdapter3.encodedSizeWithTag(20, conversationSettingInfo2.fake_unread_count) + BizConvSettingPersistentExt.ADAPTER.encodedSizeWithTag(21, conversationSettingInfo2.biz_setting_persistent_extra) + conversationSettingInfo2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, ConversationSettingInfo conversationSettingInfo) {
            ConversationSettingInfo conversationSettingInfo2 = conversationSettingInfo;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, conversationSettingInfo2.conversation_id);
            ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
            protoAdapter2.encodeWithTag(protoWriter, 2, conversationSettingInfo2.conversation_short_id);
            ProtoAdapter<Integer> protoAdapter3 = ProtoAdapter.INT32;
            protoAdapter3.encodeWithTag(protoWriter, 3, conversationSettingInfo2.conversation_type);
            protoAdapter2.encodeWithTag(protoWriter, 4, conversationSettingInfo2.min_index);
            protoAdapter2.encodeWithTag(protoWriter, 5, conversationSettingInfo2.read_index);
            protoAdapter3.encodeWithTag(protoWriter, 6, conversationSettingInfo2.mute);
            protoAdapter3.encodeWithTag(protoWriter, 7, conversationSettingInfo2.stick_on_top);
            protoAdapter3.encodeWithTag(protoWriter, 8, conversationSettingInfo2.inbox_type);
            this.LIZ.encodeWithTag(protoWriter, 9, conversationSettingInfo2.ext);
            protoAdapter2.encodeWithTag(protoWriter, 10, conversationSettingInfo2.setting_version);
            protoAdapter3.encodeWithTag(protoWriter, 11, conversationSettingInfo2.favorite);
            protoAdapter2.encodeWithTag(protoWriter, 12, conversationSettingInfo2.set_top_time);
            protoAdapter2.encodeWithTag(protoWriter, 13, conversationSettingInfo2.set_favorite_time);
            protoAdapter2.encodeWithTag(protoWriter, 14, conversationSettingInfo2.read_index_v2);
            protoAdapter2.encodeWithTag(protoWriter, 15, conversationSettingInfo2.min_index_v2);
            protoAdapter3.encodeWithTag(protoWriter, 16, conversationSettingInfo2.read_badge_count);
            protoAdapter3.encodeWithTag(protoWriter, 17, conversationSettingInfo2.read_badge_count_v2);
            EnumC868530Y5j.ADAPTER.encodeWithTag(protoWriter, 18, conversationSettingInfo2.category);
            protoAdapter.encodeWithTag(protoWriter, 19, conversationSettingInfo2.conversation_tags);
            protoAdapter3.encodeWithTag(protoWriter, 20, conversationSettingInfo2.fake_unread_count);
            BizConvSettingPersistentExt.ADAPTER.encodeWithTag(protoWriter, 21, conversationSettingInfo2.biz_setting_persistent_extra);
            protoWriter.writeBytes(conversationSettingInfo2.unknownFields());
        }
    };
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;
    public static final Long DEFAULT_MIN_INDEX = 0L;
    public static final Long DEFAULT_READ_INDEX = 0L;
    public static final Integer DEFAULT_MUTE = 0;
    public static final Integer DEFAULT_STICK_ON_TOP = 0;
    public static final Integer DEFAULT_INBOX_TYPE = 0;
    public static final Long DEFAULT_SETTING_VERSION = 0L;
    public static final Integer DEFAULT_FAVORITE = 0;
    public static final Long DEFAULT_SET_TOP_TIME = 0L;
    public static final Long DEFAULT_SET_FAVORITE_TIME = 0L;
    public static final Long DEFAULT_READ_INDEX_V2 = 0L;
    public static final Long DEFAULT_MIN_INDEX_V2 = 0L;
    public static final Integer DEFAULT_READ_BADGE_COUNT = 0;
    public static final Integer DEFAULT_READ_BADGE_COUNT_V2 = 0;
    public static final EnumC868530Y5j DEFAULT_CATEGORY = EnumC868530Y5j.USER_SET_CONVERSATION_CATEGORY_PRIMARY;
    public static final Integer DEFAULT_FAKE_UNREAD_COUNT = 0;

    @Override // com.squareup.wire.Message
    public C869360Y8o newBuilder() {
        C869360Y8o c869360Y8o = new C869360Y8o();
        c869360Y8o.LIZLLL = this.conversation_id;
        c869360Y8o.LJ = this.conversation_short_id;
        c869360Y8o.LJFF = this.conversation_type;
        c869360Y8o.LJI = this.min_index;
        c869360Y8o.LJII = this.read_index;
        c869360Y8o.LJIIIIZZ = this.mute;
        c869360Y8o.LJIIIZ = this.stick_on_top;
        c869360Y8o.LJIIJ = this.inbox_type;
        c869360Y8o.LJIIJJI = C1516540pZE.LIZLLL("ext", this.ext);
        c869360Y8o.LJIIL = this.setting_version;
        c869360Y8o.LJIILIIL = this.favorite;
        c869360Y8o.LJIILJJIL = this.set_top_time;
        c869360Y8o.LJIILL = this.set_favorite_time;
        c869360Y8o.LJIILLIIL = this.read_index_v2;
        c869360Y8o.LJIIZILJ = this.min_index_v2;
        c869360Y8o.LJIJ = this.read_badge_count;
        c869360Y8o.LJIJI = this.read_badge_count_v2;
        c869360Y8o.LJIJJ = this.category;
        c869360Y8o.LJIJJLI = this.conversation_tags;
        c869360Y8o.LJIL = this.fake_unread_count;
        c869360Y8o.LJJ = this.biz_setting_persistent_extra;
        c869360Y8o.addUnknownFields(unknownFields());
        return c869360Y8o;
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
        if (this.min_index != null) {
            sb.append(", min_index=");
            sb.append(this.min_index);
        }
        if (this.read_index != null) {
            sb.append(", read_index=");
            sb.append(this.read_index);
        }
        if (this.mute != null) {
            sb.append(", mute=");
            sb.append(this.mute);
        }
        if (this.stick_on_top != null) {
            sb.append(", stick_on_top=");
            sb.append(this.stick_on_top);
        }
        if (this.inbox_type != null) {
            sb.append(", inbox_type=");
            sb.append(this.inbox_type);
        }
        Map<String, String> map = this.ext;
        if (map != null && !map.isEmpty()) {
            sb.append(", ext=");
            sb.append(this.ext);
        }
        if (this.setting_version != null) {
            sb.append(", setting_version=");
            sb.append(this.setting_version);
        }
        if (this.favorite != null) {
            sb.append(", favorite=");
            sb.append(this.favorite);
        }
        if (this.set_top_time != null) {
            sb.append(", set_top_time=");
            sb.append(this.set_top_time);
        }
        if (this.set_favorite_time != null) {
            sb.append(", set_favorite_time=");
            sb.append(this.set_favorite_time);
        }
        if (this.read_index_v2 != null) {
            sb.append(", read_index_v2=");
            sb.append(this.read_index_v2);
        }
        if (this.min_index_v2 != null) {
            sb.append(", min_index_v2=");
            sb.append(this.min_index_v2);
        }
        if (this.read_badge_count != null) {
            sb.append(", read_badge_count=");
            sb.append(this.read_badge_count);
        }
        if (this.read_badge_count_v2 != null) {
            sb.append(", read_badge_count_v2=");
            sb.append(this.read_badge_count_v2);
        }
        if (this.category != null) {
            sb.append(", category=");
            sb.append(this.category);
        }
        if (this.conversation_tags != null) {
            sb.append(", conversation_tags=");
            sb.append(this.conversation_tags);
        }
        if (this.fake_unread_count != null) {
            sb.append(", fake_unread_count=");
            sb.append(this.fake_unread_count);
        }
        if (this.biz_setting_persistent_extra != null) {
            sb.append(", biz_setting_persistent_extra=");
            sb.append(this.biz_setting_persistent_extra);
        }
        sb.replace(0, 2, "ConversationSettingInfo{");
        sb.append('}');
        return sb.toString();
    }

    public ConversationSettingInfo(String str, Long l, Integer num, Long l2, Long l3, Integer num2, Integer num3, Integer num4, Map<String, String> map, Long l4, Integer num5, Long l5, Long l6, Long l7, Long l8, Integer num6, Integer num7, EnumC868530Y5j enumC868530Y5j, String str2, Integer num8, BizConvSettingPersistentExt bizConvSettingPersistentExt) {
        this(str, l, num, l2, l3, num2, num3, num4, map, l4, num5, l5, l6, l7, l8, num6, num7, enumC868530Y5j, str2, num8, bizConvSettingPersistentExt, ByteString.EMPTY);
    }

    public ConversationSettingInfo(String str, Long l, Integer num, Long l2, Long l3, Integer num2, Integer num3, Integer num4, Map<String, String> map, Long l4, Integer num5, Long l5, Long l6, Long l7, Long l8, Integer num6, Integer num7, EnumC868530Y5j enumC868530Y5j, String str2, Integer num8, BizConvSettingPersistentExt bizConvSettingPersistentExt, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_id = str;
        this.conversation_short_id = l;
        this.conversation_type = num;
        this.min_index = l2;
        this.read_index = l3;
        this.mute = num2;
        this.stick_on_top = num3;
        this.inbox_type = num4;
        this.ext = C1516540pZE.LJI("ext", map);
        this.setting_version = l4;
        this.favorite = num5;
        this.set_top_time = l5;
        this.set_favorite_time = l6;
        this.read_index_v2 = l7;
        this.min_index_v2 = l8;
        this.read_badge_count = num6;
        this.read_badge_count_v2 = num7;
        this.category = enumC868530Y5j;
        this.conversation_tags = str2;
        this.fake_unread_count = num8;
        this.biz_setting_persistent_extra = bizConvSettingPersistentExt;
    }
}
