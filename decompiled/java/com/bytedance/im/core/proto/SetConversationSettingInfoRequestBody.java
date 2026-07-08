package com.bytedance.im.core.proto;

import X.C09CT;
import X.C1516540pZE;
import X.C867980Y3g;
import X.EnumC868530Y5j;
import com.bytedance.im.core.proto.SetConversationSettingInfoRequestBody;
import com.bytedance.im.core.proto.im_biz_ext.BizConvSettingPersistentExt;
import com.bytedance.im.core.proto.im_biz_ext.BizConvSettingTransientExt;
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
public final class SetConversationSettingInfoRequestBody extends Message<SetConversationSettingInfoRequestBody, C867980Y3g> {
    public static final ProtoAdapter<SetConversationSettingInfoRequestBody> ADAPTER = new ProtoAdapter<SetConversationSettingInfoRequestBody>() { // from class: X.0Y3o
        public final ProtoAdapter<Map<String, String>> LIZ;

        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.LIZ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final SetConversationSettingInfoRequestBody decode(ProtoReader protoReader) {
            C867980Y3g c867980Y3g = new C867980Y3g();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c867980Y3g.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c867980Y3g.LJ = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 3:
                            c867980Y3g.LJFF = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 4:
                            c867980Y3g.LJI = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 5:
                            c867980Y3g.LJII = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 6:
                            c867980Y3g.LJIIIIZZ = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 7:
                            try {
                                c867980Y3g.LJIIIZ = EnumC868530Y5j.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                TryCatchGuardChecker.doCheck(e);
                                c867980Y3g.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                            break;
                        case 8:
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c867980Y3g.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c867980Y3g.LJIIJ.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c867980Y3g.LJIIJJI.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c867980Y3g.LJIIL = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            c867980Y3g.LJIILIIL.putAll(this.LIZ.decode(protoReader));
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            c867980Y3g.LJIILJJIL = BizConvSettingPersistentExt.ADAPTER.decode(protoReader);
                            break;
                        case 14:
                            c867980Y3g.LJIILL = BizConvSettingTransientExt.ADAPTER.decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c867980Y3g.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(SetConversationSettingInfoRequestBody setConversationSettingInfoRequestBody) {
            SetConversationSettingInfoRequestBody setConversationSettingInfoRequestBody2 = setConversationSettingInfoRequestBody;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, setConversationSettingInfoRequestBody2.conversation_id) + ProtoAdapter.INT64.encodedSizeWithTag(2, setConversationSettingInfoRequestBody2.conversation_short_id);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(3, setConversationSettingInfoRequestBody2.conversation_type);
            ProtoAdapter<Boolean> protoAdapter3 = ProtoAdapter.BOOL;
            return iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(4, setConversationSettingInfoRequestBody2.set_stick_on_top) + protoAdapter3.encodedSizeWithTag(5, setConversationSettingInfoRequestBody2.set_mute) + protoAdapter3.encodedSizeWithTag(6, setConversationSettingInfoRequestBody2.set_favorite) + EnumC868530Y5j.ADAPTER.encodedSizeWithTag(7, setConversationSettingInfoRequestBody2.set_category) + protoAdapter.asRepeated().encodedSizeWithTag(9, setConversationSettingInfoRequestBody2.del_conversation_tags) + protoAdapter.asRepeated().encodedSizeWithTag(10, setConversationSettingInfoRequestBody2.add_conversation_tags) + protoAdapter2.encodedSizeWithTag(11, setConversationSettingInfoRequestBody2.set_fake_unread_count) + this.LIZ.encodedSizeWithTag(12, setConversationSettingInfoRequestBody2.ext) + BizConvSettingPersistentExt.ADAPTER.encodedSizeWithTag(13, setConversationSettingInfoRequestBody2.biz_setting_persistent_extra) + BizConvSettingTransientExt.ADAPTER.encodedSizeWithTag(14, setConversationSettingInfoRequestBody2.biz_setting_transient_extra) + setConversationSettingInfoRequestBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, SetConversationSettingInfoRequestBody setConversationSettingInfoRequestBody) {
            SetConversationSettingInfoRequestBody setConversationSettingInfoRequestBody2 = setConversationSettingInfoRequestBody;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, setConversationSettingInfoRequestBody2.conversation_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, setConversationSettingInfoRequestBody2.conversation_short_id);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            protoAdapter2.encodeWithTag(protoWriter, 3, setConversationSettingInfoRequestBody2.conversation_type);
            ProtoAdapter<Boolean> protoAdapter3 = ProtoAdapter.BOOL;
            protoAdapter3.encodeWithTag(protoWriter, 4, setConversationSettingInfoRequestBody2.set_stick_on_top);
            protoAdapter3.encodeWithTag(protoWriter, 5, setConversationSettingInfoRequestBody2.set_mute);
            protoAdapter3.encodeWithTag(protoWriter, 6, setConversationSettingInfoRequestBody2.set_favorite);
            EnumC868530Y5j.ADAPTER.encodeWithTag(protoWriter, 7, setConversationSettingInfoRequestBody2.set_category);
            protoAdapter.asRepeated().encodeWithTag(protoWriter, 9, setConversationSettingInfoRequestBody2.del_conversation_tags);
            protoAdapter.asRepeated().encodeWithTag(protoWriter, 10, setConversationSettingInfoRequestBody2.add_conversation_tags);
            protoAdapter2.encodeWithTag(protoWriter, 11, setConversationSettingInfoRequestBody2.set_fake_unread_count);
            this.LIZ.encodeWithTag(protoWriter, 12, setConversationSettingInfoRequestBody2.ext);
            BizConvSettingPersistentExt.ADAPTER.encodeWithTag(protoWriter, 13, setConversationSettingInfoRequestBody2.biz_setting_persistent_extra);
            BizConvSettingTransientExt.ADAPTER.encodeWithTag(protoWriter, 14, setConversationSettingInfoRequestBody2.biz_setting_transient_extra);
            protoWriter.writeBytes(setConversationSettingInfoRequestBody2.unknownFields());
        }
    };
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;
    public static final EnumC868530Y5j DEFAULT_SET_CATEGORY;
    public static final Integer DEFAULT_SET_FAKE_UNREAD_COUNT;
    public static final Boolean DEFAULT_SET_FAVORITE;
    public static final Boolean DEFAULT_SET_MUTE;
    public static final Boolean DEFAULT_SET_STICK_ON_TOP;
    public static final long serialVersionUID = 0;

    @C09CT("add_conversation_tags")
    public final List<String> add_conversation_tags;

    @C09CT("biz_setting_persistent_extra")
    public final BizConvSettingPersistentExt biz_setting_persistent_extra;

    @C09CT("biz_setting_transient_extra")
    public final BizConvSettingTransientExt biz_setting_transient_extra;

    @C09CT("conversation_id")
    public final String conversation_id;

    @C09CT("conversation_short_id")
    public final Long conversation_short_id;

    @C09CT("conversation_type")
    public final Integer conversation_type;

    @C09CT("del_conversation_tags")
    public final List<String> del_conversation_tags;

    @C09CT("ext")
    public final Map<String, String> ext;

    @C09CT("set_category")
    public final EnumC868530Y5j set_category;

    @C09CT("set_fake_unread_count")
    public final Integer set_fake_unread_count;

    @C09CT("set_favorite")
    public final Boolean set_favorite;

    @C09CT("set_mute")
    public final Boolean set_mute;

    @C09CT("set_stick_on_top")
    public final Boolean set_stick_on_top;

    static {
        Boolean bool = Boolean.FALSE;
        DEFAULT_SET_STICK_ON_TOP = bool;
        DEFAULT_SET_MUTE = bool;
        DEFAULT_SET_FAVORITE = bool;
        DEFAULT_SET_CATEGORY = EnumC868530Y5j.USER_SET_CONVERSATION_CATEGORY_PRIMARY;
        DEFAULT_SET_FAKE_UNREAD_COUNT = 0;
    }

    @Override // com.squareup.wire.Message
    public C867980Y3g newBuilder() {
        C867980Y3g c867980Y3g = new C867980Y3g();
        c867980Y3g.LIZLLL = this.conversation_id;
        c867980Y3g.LJ = this.conversation_short_id;
        c867980Y3g.LJFF = this.conversation_type;
        c867980Y3g.LJI = this.set_stick_on_top;
        c867980Y3g.LJII = this.set_mute;
        c867980Y3g.LJIIIIZZ = this.set_favorite;
        c867980Y3g.LJIIIZ = this.set_category;
        c867980Y3g.LJIIJ = C1516540pZE.LIZJ("del_conversation_tags", this.del_conversation_tags);
        c867980Y3g.LJIIJJI = C1516540pZE.LIZJ("add_conversation_tags", this.add_conversation_tags);
        c867980Y3g.LJIIL = this.set_fake_unread_count;
        c867980Y3g.LJIILIIL = C1516540pZE.LIZLLL("ext", this.ext);
        c867980Y3g.LJIILJJIL = this.biz_setting_persistent_extra;
        c867980Y3g.LJIILL = this.biz_setting_transient_extra;
        c867980Y3g.addUnknownFields(unknownFields());
        return c867980Y3g;
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
        if (this.set_stick_on_top != null) {
            sb.append(", set_stick_on_top=");
            sb.append(this.set_stick_on_top);
        }
        if (this.set_mute != null) {
            sb.append(", set_mute=");
            sb.append(this.set_mute);
        }
        if (this.set_favorite != null) {
            sb.append(", set_favorite=");
            sb.append(this.set_favorite);
        }
        if (this.set_category != null) {
            sb.append(", set_category=");
            sb.append(this.set_category);
        }
        List<String> list = this.del_conversation_tags;
        if (list != null && !list.isEmpty()) {
            sb.append(", del_conversation_tags=");
            sb.append(this.del_conversation_tags);
        }
        List<String> list2 = this.add_conversation_tags;
        if (list2 != null && !list2.isEmpty()) {
            sb.append(", add_conversation_tags=");
            sb.append(this.add_conversation_tags);
        }
        if (this.set_fake_unread_count != null) {
            sb.append(", set_fake_unread_count=");
            sb.append(this.set_fake_unread_count);
        }
        Map<String, String> map = this.ext;
        if (map != null && !map.isEmpty()) {
            sb.append(", ext=");
            sb.append(this.ext);
        }
        if (this.biz_setting_persistent_extra != null) {
            sb.append(", biz_setting_persistent_extra=");
            sb.append(this.biz_setting_persistent_extra);
        }
        if (this.biz_setting_transient_extra != null) {
            sb.append(", biz_setting_transient_extra=");
            sb.append(this.biz_setting_transient_extra);
        }
        sb.replace(0, 2, "SetConversationSettingInfoRequestBody{");
        sb.append('}');
        return sb.toString();
    }

    public SetConversationSettingInfoRequestBody(String str, Long l, Integer num, Boolean bool, Boolean bool2, Boolean bool3, EnumC868530Y5j enumC868530Y5j, List<String> list, List<String> list2, Integer num2, Map<String, String> map, BizConvSettingPersistentExt bizConvSettingPersistentExt, BizConvSettingTransientExt bizConvSettingTransientExt) {
        this(str, l, num, bool, bool2, bool3, enumC868530Y5j, list, list2, num2, map, bizConvSettingPersistentExt, bizConvSettingTransientExt, ByteString.EMPTY);
    }

    public SetConversationSettingInfoRequestBody(String str, Long l, Integer num, Boolean bool, Boolean bool2, Boolean bool3, EnumC868530Y5j enumC868530Y5j, List<String> list, List<String> list2, Integer num2, Map<String, String> map, BizConvSettingPersistentExt bizConvSettingPersistentExt, BizConvSettingTransientExt bizConvSettingTransientExt, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_id = str;
        this.conversation_short_id = l;
        this.conversation_type = num;
        this.set_stick_on_top = bool;
        this.set_mute = bool2;
        this.set_favorite = bool3;
        this.set_category = enumC868530Y5j;
        this.del_conversation_tags = C1516540pZE.LJFF("del_conversation_tags", list);
        this.add_conversation_tags = C1516540pZE.LJFF("add_conversation_tags", list2);
        this.set_fake_unread_count = num2;
        this.ext = C1516540pZE.LJI("ext", map);
        this.biz_setting_persistent_extra = bizConvSettingPersistentExt;
        this.biz_setting_transient_extra = bizConvSettingTransientExt;
    }
}
