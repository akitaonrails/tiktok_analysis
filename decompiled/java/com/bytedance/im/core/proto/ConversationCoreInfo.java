package com.bytedance.im.core.proto;

import X.C09CT;
import X.C0Y4Y;
import X.C1516540pZE;
import X.EnumC868560Y5m;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.im.core.proto.ConversationCoreInfo;
import com.bytedance.im.core.proto.im_biz_ext.BizConvCorePersistentExt;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.List;
import java.util.Map;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public final class ConversationCoreInfo extends Message<ConversationCoreInfo, C0Y4Y> {
    public static final long serialVersionUID = 0;

    @C09CT("biz_core_persistent_extra")
    public final BizConvCorePersistentExt biz_core_persistent_extra;

    @C09CT("block_normal_only")
    public final Boolean block_normal_only;

    @C09CT("block_status")
    public final EnumC868560Y5m block_status;

    @C09CT("conv_model_scene")
    public final String conv_model_scene;

    @C09CT("conversation_id")
    public final String conversation_id;

    @C09CT("conversation_short_id")
    public final Long conversation_short_id;

    @C09CT("conversation_type")
    public final Integer conversation_type;

    @C09CT("creator_uid")
    public final Long creator_uid;

    @C09CT("desc")
    public final String desc;

    @C09CT("ext")
    public final Map<String, String> ext;

    @C09CT("first_message_timestamp")
    public final Long first_message_timestamp;

    @C09CT("icon")
    public final String icon;

    @C09CT("inbox_type")
    public final Integer inbox_type;

    @C09CT("info_version")
    public final Long info_version;

    @C09CT("member_regions")
    public final List<String> member_regions;

    @C09CT("mode")
    public final Integer mode;

    @C09CT("name")
    public final String name;

    @C09CT("notice")
    public final String notice;

    @C09CT("owner")
    public final Long owner;

    @C09CT("sec_owner")
    public final String sec_owner;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final Integer status;
    public static final ProtoAdapter<ConversationCoreInfo> ADAPTER = new ProtoAdapter<ConversationCoreInfo>() { // from class: X.0Y4Z
        public final ProtoAdapter<Map<String, String>> LIZ;

        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.LIZ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final ConversationCoreInfo decode(ProtoReader protoReader) {
            C0Y4Y c0y4y = new C0Y4Y();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c0y4y.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c0y4y.LJ = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 3:
                            c0y4y.LJFF = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 4:
                            c0y4y.LJI = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 5:
                            c0y4y.LJII = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c0y4y.LJIIIIZZ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            c0y4y.LJIIIZ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            c0y4y.LJIIJ = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c0y4y.LJIIJJI = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c0y4y.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c0y4y.LJIIL.putAll(this.LIZ.decode(protoReader));
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            c0y4y.LJIILIIL = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            c0y4y.LJIILJJIL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 14:
                            try {
                                c0y4y.LJIILL = EnumC868560Y5m.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                TryCatchGuardChecker.doCheck(e);
                                c0y4y.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                            break;
                        case 15:
                            c0y4y.LJIILLIIL = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 16:
                            c0y4y.LJIIZILJ = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                            c0y4y.LJIJI = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                            c0y4y.LJIJ = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 19:
                            c0y4y.LJIJJ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                            c0y4y.LJIJJLI = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 21:
                            c0y4y.LJIL = BizConvCorePersistentExt.ADAPTER.decode(protoReader);
                            break;
                        case 22:
                            c0y4y.LJJ.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c0y4y.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(ConversationCoreInfo conversationCoreInfo) {
            ConversationCoreInfo conversationCoreInfo2 = conversationCoreInfo;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, conversationCoreInfo2.conversation_id);
            ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(2, conversationCoreInfo2.conversation_short_id);
            ProtoAdapter<Integer> protoAdapter3 = ProtoAdapter.INT32;
            return iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(3, conversationCoreInfo2.conversation_type) + protoAdapter2.encodedSizeWithTag(4, conversationCoreInfo2.info_version) + protoAdapter.encodedSizeWithTag(5, conversationCoreInfo2.name) + protoAdapter.encodedSizeWithTag(6, conversationCoreInfo2.desc) + protoAdapter.encodedSizeWithTag(7, conversationCoreInfo2.icon) + protoAdapter3.encodedSizeWithTag(8, conversationCoreInfo2.inbox_type) + protoAdapter.encodedSizeWithTag(9, conversationCoreInfo2.notice) + this.LIZ.encodedSizeWithTag(11, conversationCoreInfo2.ext) + protoAdapter2.encodedSizeWithTag(12, conversationCoreInfo2.owner) + protoAdapter.encodedSizeWithTag(13, conversationCoreInfo2.sec_owner) + EnumC868560Y5m.ADAPTER.encodedSizeWithTag(14, conversationCoreInfo2.block_status) + ProtoAdapter.BOOL.encodedSizeWithTag(15, conversationCoreInfo2.block_normal_only) + protoAdapter3.encodedSizeWithTag(16, conversationCoreInfo2.mode) + protoAdapter3.encodedSizeWithTag(18, conversationCoreInfo2.status) + protoAdapter2.encodedSizeWithTag(17, conversationCoreInfo2.creator_uid) + protoAdapter.encodedSizeWithTag(19, conversationCoreInfo2.conv_model_scene) + protoAdapter2.encodedSizeWithTag(20, conversationCoreInfo2.first_message_timestamp) + BizConvCorePersistentExt.ADAPTER.encodedSizeWithTag(21, conversationCoreInfo2.biz_core_persistent_extra) + protoAdapter.asRepeated().encodedSizeWithTag(22, conversationCoreInfo2.member_regions) + conversationCoreInfo2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, ConversationCoreInfo conversationCoreInfo) {
            ConversationCoreInfo conversationCoreInfo2 = conversationCoreInfo;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, conversationCoreInfo2.conversation_id);
            ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
            protoAdapter2.encodeWithTag(protoWriter, 2, conversationCoreInfo2.conversation_short_id);
            ProtoAdapter<Integer> protoAdapter3 = ProtoAdapter.INT32;
            protoAdapter3.encodeWithTag(protoWriter, 3, conversationCoreInfo2.conversation_type);
            protoAdapter2.encodeWithTag(protoWriter, 4, conversationCoreInfo2.info_version);
            protoAdapter.encodeWithTag(protoWriter, 5, conversationCoreInfo2.name);
            protoAdapter.encodeWithTag(protoWriter, 6, conversationCoreInfo2.desc);
            protoAdapter.encodeWithTag(protoWriter, 7, conversationCoreInfo2.icon);
            protoAdapter3.encodeWithTag(protoWriter, 8, conversationCoreInfo2.inbox_type);
            protoAdapter.encodeWithTag(protoWriter, 9, conversationCoreInfo2.notice);
            this.LIZ.encodeWithTag(protoWriter, 11, conversationCoreInfo2.ext);
            protoAdapter2.encodeWithTag(protoWriter, 12, conversationCoreInfo2.owner);
            protoAdapter.encodeWithTag(protoWriter, 13, conversationCoreInfo2.sec_owner);
            EnumC868560Y5m.ADAPTER.encodeWithTag(protoWriter, 14, conversationCoreInfo2.block_status);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 15, conversationCoreInfo2.block_normal_only);
            protoAdapter3.encodeWithTag(protoWriter, 16, conversationCoreInfo2.mode);
            protoAdapter3.encodeWithTag(protoWriter, 18, conversationCoreInfo2.status);
            protoAdapter2.encodeWithTag(protoWriter, 17, conversationCoreInfo2.creator_uid);
            protoAdapter.encodeWithTag(protoWriter, 19, conversationCoreInfo2.conv_model_scene);
            protoAdapter2.encodeWithTag(protoWriter, 20, conversationCoreInfo2.first_message_timestamp);
            BizConvCorePersistentExt.ADAPTER.encodeWithTag(protoWriter, 21, conversationCoreInfo2.biz_core_persistent_extra);
            protoAdapter.asRepeated().encodeWithTag(protoWriter, 22, conversationCoreInfo2.member_regions);
            protoWriter.writeBytes(conversationCoreInfo2.unknownFields());
        }
    };
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;
    public static final Long DEFAULT_INFO_VERSION = 0L;
    public static final Integer DEFAULT_INBOX_TYPE = 0;
    public static final Long DEFAULT_OWNER = 0L;
    public static final EnumC868560Y5m DEFAULT_BLOCK_STATUS = EnumC868560Y5m.UNBLOCK;
    public static final Boolean DEFAULT_BLOCK_NORMAL_ONLY = Boolean.FALSE;
    public static final Integer DEFAULT_MODE = 0;
    public static final Integer DEFAULT_STATUS = 0;
    public static final Long DEFAULT_CREATOR_UID = 0L;
    public static final Long DEFAULT_FIRST_MESSAGE_TIMESTAMP = 0L;

    @Override // com.squareup.wire.Message
    public C0Y4Y newBuilder() {
        C0Y4Y c0y4y = new C0Y4Y();
        c0y4y.LIZLLL = this.conversation_id;
        c0y4y.LJ = this.conversation_short_id;
        c0y4y.LJFF = this.conversation_type;
        c0y4y.LJI = this.info_version;
        c0y4y.LJII = this.name;
        c0y4y.LJIIIIZZ = this.desc;
        c0y4y.LJIIIZ = this.icon;
        c0y4y.LJIIJ = this.inbox_type;
        c0y4y.LJIIJJI = this.notice;
        c0y4y.LJIIL = C1516540pZE.LIZLLL("ext", this.ext);
        c0y4y.LJIILIIL = this.owner;
        c0y4y.LJIILJJIL = this.sec_owner;
        c0y4y.LJIILL = this.block_status;
        c0y4y.LJIILLIIL = this.block_normal_only;
        c0y4y.LJIIZILJ = this.mode;
        c0y4y.LJIJ = this.status;
        c0y4y.LJIJI = this.creator_uid;
        c0y4y.LJIJJ = this.conv_model_scene;
        c0y4y.LJIJJLI = this.first_message_timestamp;
        c0y4y.LJIL = this.biz_core_persistent_extra;
        c0y4y.LJJ = C1516540pZE.LIZJ("member_regions", this.member_regions);
        c0y4y.addUnknownFields(unknownFields());
        return c0y4y;
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
        if (this.info_version != null) {
            sb.append(", info_version=");
            sb.append(this.info_version);
        }
        if (this.name != null) {
            sb.append(", name=");
            sb.append(this.name);
        }
        if (this.desc != null) {
            sb.append(", desc=");
            sb.append(this.desc);
        }
        if (this.icon != null) {
            sb.append(", icon=");
            sb.append(this.icon);
        }
        if (this.inbox_type != null) {
            sb.append(", inbox_type=");
            sb.append(this.inbox_type);
        }
        if (this.notice != null) {
            sb.append(", notice=");
            sb.append(this.notice);
        }
        Map<String, String> map = this.ext;
        if (map != null && !map.isEmpty()) {
            sb.append(", ext=");
            sb.append(this.ext);
        }
        if (this.owner != null) {
            sb.append(", owner=");
            sb.append(this.owner);
        }
        if (this.sec_owner != null) {
            sb.append(", sec_owner=");
            sb.append(this.sec_owner);
        }
        if (this.block_status != null) {
            sb.append(", block_status=");
            sb.append(this.block_status);
        }
        if (this.block_normal_only != null) {
            sb.append(", block_normal_only=");
            sb.append(this.block_normal_only);
        }
        if (this.mode != null) {
            sb.append(", mode=");
            sb.append(this.mode);
        }
        if (this.status != null) {
            sb.append(", status=");
            sb.append(this.status);
        }
        if (this.creator_uid != null) {
            sb.append(", creator_uid=");
            sb.append(this.creator_uid);
        }
        if (this.conv_model_scene != null) {
            sb.append(", conv_model_scene=");
            sb.append(this.conv_model_scene);
        }
        if (this.first_message_timestamp != null) {
            sb.append(", first_message_timestamp=");
            sb.append(this.first_message_timestamp);
        }
        if (this.biz_core_persistent_extra != null) {
            sb.append(", biz_core_persistent_extra=");
            sb.append(this.biz_core_persistent_extra);
        }
        List<String> list = this.member_regions;
        if (list != null && !list.isEmpty()) {
            sb.append(", member_regions=");
            sb.append(this.member_regions);
        }
        sb.replace(0, 2, "ConversationCoreInfo{");
        sb.append('}');
        return sb.toString();
    }

    public ConversationCoreInfo(String str, Long l, Integer num, Long l2, String str2, String str3, String str4, Integer num2, String str5, Map<String, String> map, Long l3, String str6, EnumC868560Y5m enumC868560Y5m, Boolean bool, Integer num3, Integer num4, Long l4, String str7, Long l5, BizConvCorePersistentExt bizConvCorePersistentExt, List<String> list) {
        this(str, l, num, l2, str2, str3, str4, num2, str5, map, l3, str6, enumC868560Y5m, bool, num3, num4, l4, str7, l5, bizConvCorePersistentExt, list, ByteString.EMPTY);
    }

    public ConversationCoreInfo(String str, Long l, Integer num, Long l2, String str2, String str3, String str4, Integer num2, String str5, Map<String, String> map, Long l3, String str6, EnumC868560Y5m enumC868560Y5m, Boolean bool, Integer num3, Integer num4, Long l4, String str7, Long l5, BizConvCorePersistentExt bizConvCorePersistentExt, List<String> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_id = str;
        this.conversation_short_id = l;
        this.conversation_type = num;
        this.info_version = l2;
        this.name = str2;
        this.desc = str3;
        this.icon = str4;
        this.inbox_type = num2;
        this.notice = str5;
        this.ext = C1516540pZE.LJI("ext", map);
        this.owner = l3;
        this.sec_owner = str6;
        this.block_status = enumC868560Y5m;
        this.block_normal_only = bool;
        this.mode = num3;
        this.status = num4;
        this.creator_uid = l4;
        this.conv_model_scene = str7;
        this.first_message_timestamp = l5;
        this.biz_core_persistent_extra = bizConvCorePersistentExt;
        this.member_regions = C1516540pZE.LJFF("member_regions", list);
    }
}
