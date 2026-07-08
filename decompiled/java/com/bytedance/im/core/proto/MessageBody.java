package com.bytedance.im.core.proto;

import X.C09CT;
import X.C1516540pZE;
import X.C872660YLg;
import X.EnumC869230Y8b;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.im.core.proto.MediaInfo;
import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.im.core.proto.PropertyItemList;
import com.bytedance.im.core.proto.ReferenceInfo;
import com.bytedance.scene.Scene;
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
public final class MessageBody extends Message<MessageBody, C872660YLg> {
    public static final Integer DEFAULT_APP_ID;
    public static final ByteString DEFAULT_BIZ_PERSISTENT_EXTRA;
    public static final ByteString DEFAULT_CONTENT_PB;
    public static final EnumC869230Y8b DEFAULT_CONV_RANK_UPDATE_RULE;
    public static final Long DEFAULT_INDEX_IN_USER_INBOX;
    public static final Long DEFAULT_PRE_CONVERSATION_INDEX;
    public static final Long DEFAULT_TTL;
    public static final long serialVersionUID = 0;

    @C09CT("app_id")
    public final Integer app_id;

    @C09CT("biz_persistent_extra")
    public final ByteString biz_persistent_extra;

    @C09CT("content")
    public final String content;

    @C09CT("content_pb")
    public final ByteString content_pb;

    @C09CT("conv_rank_update_rule")
    public final EnumC869230Y8b conv_rank_update_rule;

    @C09CT("conversation_id")
    public final String conversation_id;

    @C09CT("conversation_short_id")
    public final Long conversation_short_id;

    @C09CT("conversation_type")
    public final Integer conversation_type;

    @C09CT("create_time")
    public final Long create_time;

    @C09CT("ext")
    public final Map<String, String> ext;

    @C09CT("index_in_conversation")
    public final Long index_in_conversation;

    @C09CT("index_in_conversation_v1")
    public final Long index_in_conversation_v1;

    @C09CT("index_in_conversation_v2")
    public final Long index_in_conversation_v2;

    @C09CT("index_in_user_inbox")
    public final Long index_in_user_inbox;

    @C09CT("media_info_list")
    public final List<MediaInfo> media_info_list;

    @C09CT("message_type")
    public final Integer message_type;

    @C09CT("order_in_conversation")
    public final Long order_in_conversation;

    @C09CT("pre_conversation_index")
    public final Long pre_conversation_index;

    @C09CT("property_list")
    public final Map<String, PropertyItemList> property_list;

    @C09CT("reference_info")
    public final ReferenceInfo reference_info;

    @C09CT(Scene.SCENE_SERVICE)
    public final String scene;

    @C09CT("sec_sender")
    public final String sec_sender;

    @C09CT("sender")
    public final Long sender;

    @C09CT("server_message_id")
    public final Long server_message_id;

    @C09CT("source_vregion")
    public final String source_vregion;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final Integer status;

    @C09CT("ttl")
    public final Long ttl;

    @C09CT("user_profile")
    public final Map<String, String> user_profile;

    @C09CT("version")
    public final Long version;
    public static final ProtoAdapter<MessageBody> ADAPTER = new ProtoAdapter<MessageBody>() { // from class: X.0YLf
        public final ProtoAdapter<Map<String, String>> LIZ;
        public final ProtoAdapter<Map<String, PropertyItemList>> LIZIZ;
        public final ProtoAdapter<Map<String, String>> LIZJ;

        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.LIZ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
            this.LIZIZ = ProtoAdapter.newMapAdapter(protoAdapter, PropertyItemList.ADAPTER);
            this.LIZJ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final MessageBody decode(ProtoReader protoReader) {
            C872660YLg c872660YLg = new C872660YLg();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c872660YLg.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c872660YLg.LJ = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 3:
                            c872660YLg.LJFF = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 4:
                            c872660YLg.LJI = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 5:
                            c872660YLg.LJII = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 6:
                            c872660YLg.LJIIIIZZ = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 7:
                            c872660YLg.LJIIIZ = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 8:
                            c872660YLg.LJIIJ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c872660YLg.LJIIJJI.putAll(this.LIZ.decode(protoReader));
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c872660YLg.LJIIL = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c872660YLg.LJIILIIL = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            c872660YLg.LJIILJJIL = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            c872660YLg.LJIILL = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 14:
                            c872660YLg.LJIILLIIL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 15:
                            c872660YLg.LJIIZILJ.putAll(this.LIZIZ.decode(protoReader));
                            break;
                        case 16:
                            c872660YLg.LJIJ.putAll(this.LIZJ.decode(protoReader));
                            break;
                        case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                            c872660YLg.LJIJI = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                            c872660YLg.LJIJJ = ReferenceInfo.ADAPTER.decode(protoReader);
                            break;
                        case 19:
                            c872660YLg.LJIJJLI = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                            c872660YLg.LJIL = ProtoAdapter.BYTES.decode(protoReader);
                            break;
                        case 21:
                            c872660YLg.LJJ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 22:
                            try {
                                c872660YLg.LJJI = EnumC869230Y8b.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                TryCatchGuardChecker.doCheck(e);
                                c872660YLg.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                            break;
                        case 23:
                            c872660YLg.LJJIFFI = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                            c872660YLg.LJJII.add(MediaInfo.ADAPTER.decode(protoReader));
                            break;
                        case 25:
                            c872660YLg.LJJIII = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 26:
                            c872660YLg.LJJIIJ = ProtoAdapter.BYTES.decode(protoReader);
                            break;
                        case 27:
                            c872660YLg.LJJIIJZLJL = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 28:
                            c872660YLg.LJJIIZ = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 29:
                            c872660YLg.LJJIIZI = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c872660YLg.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c872660YLg.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(MessageBody messageBody) {
            MessageBody messageBody2 = messageBody;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, messageBody2.conversation_id);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(2, messageBody2.conversation_type);
            ProtoAdapter<Long> protoAdapter3 = ProtoAdapter.INT64;
            int iEncodedSizeWithTag3 = iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(3, messageBody2.server_message_id) + protoAdapter3.encodedSizeWithTag(4, messageBody2.index_in_conversation) + protoAdapter3.encodedSizeWithTag(5, messageBody2.conversation_short_id) + protoAdapter2.encodedSizeWithTag(6, messageBody2.message_type) + protoAdapter3.encodedSizeWithTag(7, messageBody2.sender) + protoAdapter.encodedSizeWithTag(8, messageBody2.content) + this.LIZ.encodedSizeWithTag(9, messageBody2.ext) + protoAdapter3.encodedSizeWithTag(10, messageBody2.create_time) + protoAdapter3.encodedSizeWithTag(11, messageBody2.version) + protoAdapter2.encodedSizeWithTag(12, messageBody2.status) + protoAdapter3.encodedSizeWithTag(13, messageBody2.order_in_conversation) + protoAdapter.encodedSizeWithTag(14, messageBody2.sec_sender) + this.LIZIZ.encodedSizeWithTag(15, messageBody2.property_list) + this.LIZJ.encodedSizeWithTag(16, messageBody2.user_profile) + protoAdapter3.encodedSizeWithTag(17, messageBody2.index_in_conversation_v2) + ReferenceInfo.ADAPTER.encodedSizeWithTag(18, messageBody2.reference_info) + protoAdapter3.encodedSizeWithTag(19, messageBody2.index_in_conversation_v1);
            ProtoAdapter<ByteString> protoAdapter4 = ProtoAdapter.BYTES;
            return iEncodedSizeWithTag3 + protoAdapter4.encodedSizeWithTag(20, messageBody2.content_pb) + protoAdapter.encodedSizeWithTag(21, messageBody2.scene) + EnumC869230Y8b.ADAPTER.encodedSizeWithTag(22, messageBody2.conv_rank_update_rule) + protoAdapter3.encodedSizeWithTag(23, messageBody2.ttl) + MediaInfo.ADAPTER.asRepeated().encodedSizeWithTag(24, messageBody2.media_info_list) + protoAdapter3.encodedSizeWithTag(25, messageBody2.pre_conversation_index) + protoAdapter4.encodedSizeWithTag(26, messageBody2.biz_persistent_extra) + protoAdapter3.encodedSizeWithTag(27, messageBody2.index_in_user_inbox) + protoAdapter2.encodedSizeWithTag(28, messageBody2.app_id) + protoAdapter.encodedSizeWithTag(29, messageBody2.source_vregion) + messageBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, MessageBody messageBody) {
            MessageBody messageBody2 = messageBody;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, messageBody2.conversation_id);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            protoAdapter2.encodeWithTag(protoWriter, 2, messageBody2.conversation_type);
            ProtoAdapter<Long> protoAdapter3 = ProtoAdapter.INT64;
            protoAdapter3.encodeWithTag(protoWriter, 3, messageBody2.server_message_id);
            protoAdapter3.encodeWithTag(protoWriter, 4, messageBody2.index_in_conversation);
            protoAdapter3.encodeWithTag(protoWriter, 5, messageBody2.conversation_short_id);
            protoAdapter2.encodeWithTag(protoWriter, 6, messageBody2.message_type);
            protoAdapter3.encodeWithTag(protoWriter, 7, messageBody2.sender);
            protoAdapter.encodeWithTag(protoWriter, 8, messageBody2.content);
            this.LIZ.encodeWithTag(protoWriter, 9, messageBody2.ext);
            protoAdapter3.encodeWithTag(protoWriter, 10, messageBody2.create_time);
            protoAdapter3.encodeWithTag(protoWriter, 11, messageBody2.version);
            protoAdapter2.encodeWithTag(protoWriter, 12, messageBody2.status);
            protoAdapter3.encodeWithTag(protoWriter, 13, messageBody2.order_in_conversation);
            protoAdapter.encodeWithTag(protoWriter, 14, messageBody2.sec_sender);
            this.LIZIZ.encodeWithTag(protoWriter, 15, messageBody2.property_list);
            this.LIZJ.encodeWithTag(protoWriter, 16, messageBody2.user_profile);
            protoAdapter3.encodeWithTag(protoWriter, 17, messageBody2.index_in_conversation_v2);
            ReferenceInfo.ADAPTER.encodeWithTag(protoWriter, 18, messageBody2.reference_info);
            protoAdapter3.encodeWithTag(protoWriter, 19, messageBody2.index_in_conversation_v1);
            ProtoAdapter<ByteString> protoAdapter4 = ProtoAdapter.BYTES;
            protoAdapter4.encodeWithTag(protoWriter, 20, messageBody2.content_pb);
            protoAdapter.encodeWithTag(protoWriter, 21, messageBody2.scene);
            EnumC869230Y8b.ADAPTER.encodeWithTag(protoWriter, 22, messageBody2.conv_rank_update_rule);
            protoAdapter3.encodeWithTag(protoWriter, 23, messageBody2.ttl);
            MediaInfo.ADAPTER.asRepeated().encodeWithTag(protoWriter, 24, messageBody2.media_info_list);
            protoAdapter3.encodeWithTag(protoWriter, 25, messageBody2.pre_conversation_index);
            protoAdapter4.encodeWithTag(protoWriter, 26, messageBody2.biz_persistent_extra);
            protoAdapter3.encodeWithTag(protoWriter, 27, messageBody2.index_in_user_inbox);
            protoAdapter2.encodeWithTag(protoWriter, 28, messageBody2.app_id);
            protoAdapter.encodeWithTag(protoWriter, 29, messageBody2.source_vregion);
            protoWriter.writeBytes(messageBody2.unknownFields());
        }
    };
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;
    public static final Long DEFAULT_SERVER_MESSAGE_ID = 0L;
    public static final Long DEFAULT_INDEX_IN_CONVERSATION = 0L;
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final Integer DEFAULT_MESSAGE_TYPE = 0;
    public static final Long DEFAULT_SENDER = 0L;
    public static final Long DEFAULT_CREATE_TIME = 0L;
    public static final Long DEFAULT_VERSION = 0L;
    public static final Integer DEFAULT_STATUS = 0;
    public static final Long DEFAULT_ORDER_IN_CONVERSATION = 0L;
    public static final Long DEFAULT_INDEX_IN_CONVERSATION_V2 = 0L;
    public static final Long DEFAULT_INDEX_IN_CONVERSATION_V1 = 0L;

    static {
        ByteString byteString = ByteString.EMPTY;
        DEFAULT_CONTENT_PB = byteString;
        DEFAULT_CONV_RANK_UPDATE_RULE = EnumC869230Y8b.IgnoreSenderRankUpdate;
        DEFAULT_TTL = 0L;
        DEFAULT_PRE_CONVERSATION_INDEX = 0L;
        DEFAULT_BIZ_PERSISTENT_EXTRA = byteString;
        DEFAULT_INDEX_IN_USER_INBOX = 0L;
        DEFAULT_APP_ID = 0;
    }

    @Override // com.squareup.wire.Message
    public C872660YLg newBuilder() {
        C872660YLg c872660YLg = new C872660YLg();
        c872660YLg.LIZLLL = this.conversation_id;
        c872660YLg.LJ = this.conversation_type;
        c872660YLg.LJFF = this.server_message_id;
        c872660YLg.LJI = this.index_in_conversation;
        c872660YLg.LJII = this.conversation_short_id;
        c872660YLg.LJIIIIZZ = this.message_type;
        c872660YLg.LJIIIZ = this.sender;
        c872660YLg.LJIIJ = this.content;
        c872660YLg.LJIIJJI = C1516540pZE.LIZLLL("ext", this.ext);
        c872660YLg.LJIIL = this.create_time;
        c872660YLg.LJIILIIL = this.version;
        c872660YLg.LJIILJJIL = this.status;
        c872660YLg.LJIILL = this.order_in_conversation;
        c872660YLg.LJIILLIIL = this.sec_sender;
        c872660YLg.LJIIZILJ = C1516540pZE.LIZLLL("property_list", this.property_list);
        c872660YLg.LJIJ = C1516540pZE.LIZLLL("user_profile", this.user_profile);
        c872660YLg.LJIJI = this.index_in_conversation_v2;
        c872660YLg.LJIJJ = this.reference_info;
        c872660YLg.LJIJJLI = this.index_in_conversation_v1;
        c872660YLg.LJIL = this.content_pb;
        c872660YLg.LJJ = this.scene;
        c872660YLg.LJJI = this.conv_rank_update_rule;
        c872660YLg.LJJIFFI = this.ttl;
        c872660YLg.LJJII = C1516540pZE.LIZJ("media_info_list", this.media_info_list);
        c872660YLg.LJJIII = this.pre_conversation_index;
        c872660YLg.LJJIIJ = this.biz_persistent_extra;
        c872660YLg.LJJIIJZLJL = this.index_in_user_inbox;
        c872660YLg.LJJIIZ = this.app_id;
        c872660YLg.LJJIIZI = this.source_vregion;
        c872660YLg.addUnknownFields(unknownFields());
        return c872660YLg;
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
        if (this.server_message_id != null) {
            sb.append(", server_message_id=");
            sb.append(this.server_message_id);
        }
        if (this.index_in_conversation != null) {
            sb.append(", index_in_conversation=");
            sb.append(this.index_in_conversation);
        }
        if (this.conversation_short_id != null) {
            sb.append(", conversation_short_id=");
            sb.append(this.conversation_short_id);
        }
        if (this.message_type != null) {
            sb.append(", message_type=");
            sb.append(this.message_type);
        }
        if (this.sender != null) {
            sb.append(", sender=");
            sb.append(this.sender);
        }
        if (this.content != null) {
            sb.append(", content=");
            sb.append(this.content);
        }
        Map<String, String> map = this.ext;
        if (map != null && !map.isEmpty()) {
            sb.append(", ext=");
            sb.append(this.ext);
        }
        if (this.create_time != null) {
            sb.append(", create_time=");
            sb.append(this.create_time);
        }
        if (this.version != null) {
            sb.append(", version=");
            sb.append(this.version);
        }
        if (this.status != null) {
            sb.append(", status=");
            sb.append(this.status);
        }
        if (this.order_in_conversation != null) {
            sb.append(", order_in_conversation=");
            sb.append(this.order_in_conversation);
        }
        if (this.sec_sender != null) {
            sb.append(", sec_sender=");
            sb.append(this.sec_sender);
        }
        Map<String, PropertyItemList> map2 = this.property_list;
        if (map2 != null && !map2.isEmpty()) {
            sb.append(", property_list=");
            sb.append(this.property_list);
        }
        Map<String, String> map3 = this.user_profile;
        if (map3 != null && !map3.isEmpty()) {
            sb.append(", user_profile=");
            sb.append(this.user_profile);
        }
        if (this.index_in_conversation_v2 != null) {
            sb.append(", index_in_conversation_v2=");
            sb.append(this.index_in_conversation_v2);
        }
        if (this.reference_info != null) {
            sb.append(", reference_info=");
            sb.append(this.reference_info);
        }
        if (this.index_in_conversation_v1 != null) {
            sb.append(", index_in_conversation_v1=");
            sb.append(this.index_in_conversation_v1);
        }
        if (this.content_pb != null) {
            sb.append(", content_pb=");
            sb.append(this.content_pb);
        }
        if (this.scene != null) {
            sb.append(", scene=");
            sb.append(this.scene);
        }
        if (this.conv_rank_update_rule != null) {
            sb.append(", conv_rank_update_rule=");
            sb.append(this.conv_rank_update_rule);
        }
        if (this.ttl != null) {
            sb.append(", ttl=");
            sb.append(this.ttl);
        }
        List<MediaInfo> list = this.media_info_list;
        if (list != null && !list.isEmpty()) {
            sb.append(", media_info_list=");
            sb.append(this.media_info_list);
        }
        if (this.pre_conversation_index != null) {
            sb.append(", pre_conversation_index=");
            sb.append(this.pre_conversation_index);
        }
        if (this.biz_persistent_extra != null) {
            sb.append(", biz_persistent_extra=");
            sb.append(this.biz_persistent_extra);
        }
        if (this.index_in_user_inbox != null) {
            sb.append(", index_in_user_inbox=");
            sb.append(this.index_in_user_inbox);
        }
        if (this.app_id != null) {
            sb.append(", app_id=");
            sb.append(this.app_id);
        }
        if (this.source_vregion != null) {
            sb.append(", source_vregion=");
            sb.append(this.source_vregion);
        }
        sb.replace(0, 2, "MessageBody{");
        sb.append('}');
        return sb.toString();
    }

    public MessageBody(String str, Integer num, Long l, Long l2, Long l3, Integer num2, Long l4, String str2, Map<String, String> map, Long l5, Long l6, Integer num3, Long l7, String str3, Map<String, PropertyItemList> map2, Map<String, String> map3, Long l8, ReferenceInfo referenceInfo, Long l9, ByteString byteString, String str4, EnumC869230Y8b enumC869230Y8b, Long l10, List<MediaInfo> list, Long l11, ByteString byteString2, Long l12, Integer num4, String str5) {
        this(str, num, l, l2, l3, num2, l4, str2, map, l5, l6, num3, l7, str3, map2, map3, l8, referenceInfo, l9, byteString, str4, enumC869230Y8b, l10, list, l11, byteString2, l12, num4, str5, ByteString.EMPTY);
    }

    public MessageBody(String str, Integer num, Long l, Long l2, Long l3, Integer num2, Long l4, String str2, Map<String, String> map, Long l5, Long l6, Integer num3, Long l7, String str3, Map<String, PropertyItemList> map2, Map<String, String> map3, Long l8, ReferenceInfo referenceInfo, Long l9, ByteString byteString, String str4, EnumC869230Y8b enumC869230Y8b, Long l10, List<MediaInfo> list, Long l11, ByteString byteString2, Long l12, Integer num4, String str5, ByteString byteString3) {
        super(ADAPTER, byteString3);
        this.conversation_id = str;
        this.conversation_type = num;
        this.server_message_id = l;
        this.index_in_conversation = l2;
        this.conversation_short_id = l3;
        this.message_type = num2;
        this.sender = l4;
        this.content = str2;
        this.ext = C1516540pZE.LJI("ext", map);
        this.create_time = l5;
        this.version = l6;
        this.status = num3;
        this.order_in_conversation = l7;
        this.sec_sender = str3;
        this.property_list = C1516540pZE.LJI("property_list", map2);
        this.user_profile = C1516540pZE.LJI("user_profile", map3);
        this.index_in_conversation_v2 = l8;
        this.reference_info = referenceInfo;
        this.index_in_conversation_v1 = l9;
        this.content_pb = byteString;
        this.scene = str4;
        this.conv_rank_update_rule = enumC869230Y8b;
        this.ttl = l10;
        this.media_info_list = C1516540pZE.LJFF("media_info_list", list);
        this.pre_conversation_index = l11;
        this.biz_persistent_extra = byteString2;
        this.index_in_user_inbox = l12;
        this.app_id = num4;
        this.source_vregion = str5;
    }
}
