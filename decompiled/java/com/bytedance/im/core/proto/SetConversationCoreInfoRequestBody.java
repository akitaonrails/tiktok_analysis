package com.bytedance.im.core.proto;

import X.C09CT;
import X.C1516540pZE;
import X.C868120Y3u;
import com.bytedance.im.core.proto.SetConversationCoreInfoRequestBody;
import com.bytedance.im.core.proto.im_biz_ext.BizConvCorePersistentExt;
import com.bytedance.im.core.proto.im_biz_ext.BizConvCoreTransientExt;
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
public final class SetConversationCoreInfoRequestBody extends Message<SetConversationCoreInfoRequestBody, C868120Y3u> {
    public static final ProtoAdapter<SetConversationCoreInfoRequestBody> ADAPTER = new ProtoAdapter<SetConversationCoreInfoRequestBody>() { // from class: X.0Y3v
        public final ProtoAdapter<Map<String, String>> LIZ;

        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.LIZ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final SetConversationCoreInfoRequestBody decode(ProtoReader protoReader) {
            C868120Y3u c868120Y3u = new C868120Y3u();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c868120Y3u.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c868120Y3u.LJ = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 3:
                            c868120Y3u.LJFF = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 4:
                            c868120Y3u.LJI = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c868120Y3u.LJII = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c868120Y3u.LJIIIIZZ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            c868120Y3u.LJIIIZ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            c868120Y3u.LJIIJ = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c868120Y3u.LJIIJJI = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c868120Y3u.LJIIL = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c868120Y3u.LJIILIIL = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            c868120Y3u.LJIILJJIL.putAll(this.LIZ.decode(protoReader));
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            c868120Y3u.LJIILL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 14:
                            c868120Y3u.LJIILLIIL = BizConvCorePersistentExt.ADAPTER.decode(protoReader);
                            break;
                        case 15:
                            c868120Y3u.LJIIZILJ = BizConvCoreTransientExt.ADAPTER.decode(protoReader);
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c868120Y3u.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c868120Y3u.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(SetConversationCoreInfoRequestBody setConversationCoreInfoRequestBody) {
            SetConversationCoreInfoRequestBody setConversationCoreInfoRequestBody2 = setConversationCoreInfoRequestBody;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, setConversationCoreInfoRequestBody2.conversation_id) + ProtoAdapter.INT64.encodedSizeWithTag(2, setConversationCoreInfoRequestBody2.conversation_short_id) + ProtoAdapter.INT32.encodedSizeWithTag(3, setConversationCoreInfoRequestBody2.conversation_type) + protoAdapter.encodedSizeWithTag(4, setConversationCoreInfoRequestBody2.name) + protoAdapter.encodedSizeWithTag(5, setConversationCoreInfoRequestBody2.desc) + protoAdapter.encodedSizeWithTag(6, setConversationCoreInfoRequestBody2.icon) + protoAdapter.encodedSizeWithTag(7, setConversationCoreInfoRequestBody2.notice);
            ProtoAdapter<Boolean> protoAdapter2 = ProtoAdapter.BOOL;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(8, setConversationCoreInfoRequestBody2.is_name_set) + protoAdapter2.encodedSizeWithTag(9, setConversationCoreInfoRequestBody2.is_desc_set) + protoAdapter2.encodedSizeWithTag(10, setConversationCoreInfoRequestBody2.is_icon_set) + protoAdapter2.encodedSizeWithTag(11, setConversationCoreInfoRequestBody2.is_notice_set) + this.LIZ.encodedSizeWithTag(12, setConversationCoreInfoRequestBody2.ext) + protoAdapter.encodedSizeWithTag(13, setConversationCoreInfoRequestBody2.con_model_scene) + BizConvCorePersistentExt.ADAPTER.encodedSizeWithTag(14, setConversationCoreInfoRequestBody2.biz_core_persistent_extra) + BizConvCoreTransientExt.ADAPTER.encodedSizeWithTag(15, setConversationCoreInfoRequestBody2.biz_core_transient_extra) + setConversationCoreInfoRequestBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, SetConversationCoreInfoRequestBody setConversationCoreInfoRequestBody) {
            SetConversationCoreInfoRequestBody setConversationCoreInfoRequestBody2 = setConversationCoreInfoRequestBody;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, setConversationCoreInfoRequestBody2.conversation_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, setConversationCoreInfoRequestBody2.conversation_short_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, setConversationCoreInfoRequestBody2.conversation_type);
            protoAdapter.encodeWithTag(protoWriter, 4, setConversationCoreInfoRequestBody2.name);
            protoAdapter.encodeWithTag(protoWriter, 5, setConversationCoreInfoRequestBody2.desc);
            protoAdapter.encodeWithTag(protoWriter, 6, setConversationCoreInfoRequestBody2.icon);
            protoAdapter.encodeWithTag(protoWriter, 7, setConversationCoreInfoRequestBody2.notice);
            ProtoAdapter<Boolean> protoAdapter2 = ProtoAdapter.BOOL;
            protoAdapter2.encodeWithTag(protoWriter, 8, setConversationCoreInfoRequestBody2.is_name_set);
            protoAdapter2.encodeWithTag(protoWriter, 9, setConversationCoreInfoRequestBody2.is_desc_set);
            protoAdapter2.encodeWithTag(protoWriter, 10, setConversationCoreInfoRequestBody2.is_icon_set);
            protoAdapter2.encodeWithTag(protoWriter, 11, setConversationCoreInfoRequestBody2.is_notice_set);
            this.LIZ.encodeWithTag(protoWriter, 12, setConversationCoreInfoRequestBody2.ext);
            protoAdapter.encodeWithTag(protoWriter, 13, setConversationCoreInfoRequestBody2.con_model_scene);
            BizConvCorePersistentExt.ADAPTER.encodeWithTag(protoWriter, 14, setConversationCoreInfoRequestBody2.biz_core_persistent_extra);
            BizConvCoreTransientExt.ADAPTER.encodeWithTag(protoWriter, 15, setConversationCoreInfoRequestBody2.biz_core_transient_extra);
            protoWriter.writeBytes(setConversationCoreInfoRequestBody2.unknownFields());
        }
    };
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;
    public static final Boolean DEFAULT_IS_DESC_SET;
    public static final Boolean DEFAULT_IS_ICON_SET;
    public static final Boolean DEFAULT_IS_NAME_SET;
    public static final Boolean DEFAULT_IS_NOTICE_SET;
    public static final long serialVersionUID = 0;

    @C09CT("biz_core_persistent_extra")
    public final BizConvCorePersistentExt biz_core_persistent_extra;

    @C09CT("biz_core_transient_extra")
    public final BizConvCoreTransientExt biz_core_transient_extra;

    @C09CT("con_model_scene")
    public final String con_model_scene;

    @C09CT("conversation_id")
    public final String conversation_id;

    @C09CT("conversation_short_id")
    public final Long conversation_short_id;

    @C09CT("conversation_type")
    public final Integer conversation_type;

    @C09CT("desc")
    public final String desc;

    @C09CT("ext")
    public final Map<String, String> ext;

    @C09CT("icon")
    public final String icon;

    @C09CT("is_desc_set")
    public final Boolean is_desc_set;

    @C09CT("is_icon_set")
    public final Boolean is_icon_set;

    @C09CT("is_name_set")
    public final Boolean is_name_set;

    @C09CT("is_notice_set")
    public final Boolean is_notice_set;

    @C09CT("name")
    public final String name;

    @C09CT("notice")
    public final String notice;

    static {
        Boolean bool = Boolean.FALSE;
        DEFAULT_IS_NAME_SET = bool;
        DEFAULT_IS_DESC_SET = bool;
        DEFAULT_IS_ICON_SET = bool;
        DEFAULT_IS_NOTICE_SET = bool;
    }

    @Override // com.squareup.wire.Message
    public C868120Y3u newBuilder() {
        C868120Y3u c868120Y3u = new C868120Y3u();
        c868120Y3u.LIZLLL = this.conversation_id;
        c868120Y3u.LJ = this.conversation_short_id;
        c868120Y3u.LJFF = this.conversation_type;
        c868120Y3u.LJI = this.name;
        c868120Y3u.LJII = this.desc;
        c868120Y3u.LJIIIIZZ = this.icon;
        c868120Y3u.LJIIIZ = this.notice;
        c868120Y3u.LJIIJ = this.is_name_set;
        c868120Y3u.LJIIJJI = this.is_desc_set;
        c868120Y3u.LJIIL = this.is_icon_set;
        c868120Y3u.LJIILIIL = this.is_notice_set;
        c868120Y3u.LJIILJJIL = C1516540pZE.LIZLLL("ext", this.ext);
        c868120Y3u.LJIILL = this.con_model_scene;
        c868120Y3u.LJIILLIIL = this.biz_core_persistent_extra;
        c868120Y3u.LJIIZILJ = this.biz_core_transient_extra;
        c868120Y3u.addUnknownFields(unknownFields());
        return c868120Y3u;
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
        if (this.notice != null) {
            sb.append(", notice=");
            sb.append(this.notice);
        }
        if (this.is_name_set != null) {
            sb.append(", is_name_set=");
            sb.append(this.is_name_set);
        }
        if (this.is_desc_set != null) {
            sb.append(", is_desc_set=");
            sb.append(this.is_desc_set);
        }
        if (this.is_icon_set != null) {
            sb.append(", is_icon_set=");
            sb.append(this.is_icon_set);
        }
        if (this.is_notice_set != null) {
            sb.append(", is_notice_set=");
            sb.append(this.is_notice_set);
        }
        Map<String, String> map = this.ext;
        if (map != null && !map.isEmpty()) {
            sb.append(", ext=");
            sb.append(this.ext);
        }
        if (this.con_model_scene != null) {
            sb.append(", con_model_scene=");
            sb.append(this.con_model_scene);
        }
        if (this.biz_core_persistent_extra != null) {
            sb.append(", biz_core_persistent_extra=");
            sb.append(this.biz_core_persistent_extra);
        }
        if (this.biz_core_transient_extra != null) {
            sb.append(", biz_core_transient_extra=");
            sb.append(this.biz_core_transient_extra);
        }
        sb.replace(0, 2, "SetConversationCoreInfoRequestBody{");
        sb.append('}');
        return sb.toString();
    }

    public SetConversationCoreInfoRequestBody(String str, Long l, Integer num, String str2, String str3, String str4, String str5, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Map<String, String> map, String str6, BizConvCorePersistentExt bizConvCorePersistentExt, BizConvCoreTransientExt bizConvCoreTransientExt) {
        this(str, l, num, str2, str3, str4, str5, bool, bool2, bool3, bool4, map, str6, bizConvCorePersistentExt, bizConvCoreTransientExt, ByteString.EMPTY);
    }

    public SetConversationCoreInfoRequestBody(String str, Long l, Integer num, String str2, String str3, String str4, String str5, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Map<String, String> map, String str6, BizConvCorePersistentExt bizConvCorePersistentExt, BizConvCoreTransientExt bizConvCoreTransientExt, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_id = str;
        this.conversation_short_id = l;
        this.conversation_type = num;
        this.name = str2;
        this.desc = str3;
        this.icon = str4;
        this.notice = str5;
        this.is_name_set = bool;
        this.is_desc_set = bool2;
        this.is_icon_set = bool3;
        this.is_notice_set = bool4;
        this.ext = C1516540pZE.LJI("ext", map);
        this.con_model_scene = str6;
        this.biz_core_persistent_extra = bizConvCorePersistentExt;
        this.biz_core_transient_extra = bizConvCoreTransientExt;
    }
}
