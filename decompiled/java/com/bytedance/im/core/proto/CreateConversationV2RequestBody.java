package com.bytedance.im.core.proto;

import X.C09CT;
import X.C0Y4R;
import X.C1516540pZE;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.im.core.proto.CreateConversationV2RequestBody;
import com.bytedance.im.core.proto.im_biz_ext.BizConvCorePersistentExt;
import com.bytedance.im.core.proto.im_biz_ext.BizConvCoreTransientExt;
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
public final class CreateConversationV2RequestBody extends Message<CreateConversationV2RequestBody, C0Y4R> {
    public static final long serialVersionUID = 0;

    @C09CT("avatar_url")
    public final String avatar_url;

    @C09CT("biz")
    public final String biz;

    @C09CT("biz_core_persistent_extra")
    public final BizConvCorePersistentExt biz_core_persistent_extra;

    @C09CT("biz_core_transient_extra")
    public final BizConvCoreTransientExt biz_core_transient_extra;

    @C09CT("biz_ext")
    public final Map<String, String> biz_ext;

    @C09CT("channel")
    public final String channel;

    @C09CT("con_model_scene")
    public final String con_model_scene;

    @C09CT("conversation_short_id")
    public final Long conversation_short_id;

    @C09CT("conversation_type")
    public final Integer conversation_type;

    @C09CT("description")
    public final String description;

    @C09CT("ext")
    public final Map<String, String> ext;

    @C09CT("idempotent_id")
    public final String idempotent_id;

    @C09CT("name")
    public final String name;

    @C09CT("participants")
    public final List<Long> participants;

    @C09CT("persistent")
    public final Boolean persistent;
    public static final ProtoAdapter<CreateConversationV2RequestBody> ADAPTER = new ProtoAdapter<CreateConversationV2RequestBody>() { // from class: X.0Y4S
        public final ProtoAdapter<Map<String, String>> LIZ;
        public final ProtoAdapter<Map<String, String>> LIZIZ;

        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.LIZ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
            this.LIZIZ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final CreateConversationV2RequestBody decode(ProtoReader protoReader) {
            C0Y4R c0y4r = new C0Y4R();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c0y4r.LIZLLL = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 2:
                            c0y4r.LJ.add(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 3:
                            c0y4r.LJFF = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 4:
                            c0y4r.LJI = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                        case BdTuring.TYPE_ECAF /* 9 */:
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c0y4r.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                        case 6:
                            c0y4r.LJII = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            c0y4r.LJIIIIZZ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            c0y4r.LJIIIZ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c0y4r.LJIIJ.putAll(this.LIZ.decode(protoReader));
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            c0y4r.LJIIJJI = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            c0y4r.LJIIL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 14:
                            c0y4r.LJIILIIL.putAll(this.LIZIZ.decode(protoReader));
                            break;
                        case 15:
                            c0y4r.LJIILJJIL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 16:
                            c0y4r.LJIILL = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                            c0y4r.LJIILLIIL = BizConvCorePersistentExt.ADAPTER.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                            c0y4r.LJIIZILJ = BizConvCoreTransientExt.ADAPTER.decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c0y4r.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(CreateConversationV2RequestBody createConversationV2RequestBody) {
            CreateConversationV2RequestBody createConversationV2RequestBody2 = createConversationV2RequestBody;
            int iEncodedSizeWithTag = ProtoAdapter.INT32.encodedSizeWithTag(1, createConversationV2RequestBody2.conversation_type);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter.asRepeated().encodedSizeWithTag(2, createConversationV2RequestBody2.participants) + ProtoAdapter.BOOL.encodedSizeWithTag(3, createConversationV2RequestBody2.persistent);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            return iEncodedSizeWithTag2 + protoAdapter2.encodedSizeWithTag(4, createConversationV2RequestBody2.idempotent_id) + protoAdapter2.encodedSizeWithTag(6, createConversationV2RequestBody2.name) + protoAdapter2.encodedSizeWithTag(7, createConversationV2RequestBody2.avatar_url) + protoAdapter2.encodedSizeWithTag(8, createConversationV2RequestBody2.description) + this.LIZ.encodedSizeWithTag(11, createConversationV2RequestBody2.biz_ext) + protoAdapter2.encodedSizeWithTag(12, createConversationV2RequestBody2.biz) + protoAdapter2.encodedSizeWithTag(13, createConversationV2RequestBody2.channel) + this.LIZIZ.encodedSizeWithTag(14, createConversationV2RequestBody2.ext) + protoAdapter2.encodedSizeWithTag(15, createConversationV2RequestBody2.con_model_scene) + protoAdapter.encodedSizeWithTag(16, createConversationV2RequestBody2.conversation_short_id) + BizConvCorePersistentExt.ADAPTER.encodedSizeWithTag(17, createConversationV2RequestBody2.biz_core_persistent_extra) + BizConvCoreTransientExt.ADAPTER.encodedSizeWithTag(18, createConversationV2RequestBody2.biz_core_transient_extra) + createConversationV2RequestBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, CreateConversationV2RequestBody createConversationV2RequestBody) {
            CreateConversationV2RequestBody createConversationV2RequestBody2 = createConversationV2RequestBody;
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, createConversationV2RequestBody2.conversation_type);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.asRepeated().encodeWithTag(protoWriter, 2, createConversationV2RequestBody2.participants);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, createConversationV2RequestBody2.persistent);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            protoAdapter2.encodeWithTag(protoWriter, 4, createConversationV2RequestBody2.idempotent_id);
            protoAdapter2.encodeWithTag(protoWriter, 6, createConversationV2RequestBody2.name);
            protoAdapter2.encodeWithTag(protoWriter, 7, createConversationV2RequestBody2.avatar_url);
            protoAdapter2.encodeWithTag(protoWriter, 8, createConversationV2RequestBody2.description);
            this.LIZ.encodeWithTag(protoWriter, 11, createConversationV2RequestBody2.biz_ext);
            protoAdapter2.encodeWithTag(protoWriter, 12, createConversationV2RequestBody2.biz);
            protoAdapter2.encodeWithTag(protoWriter, 13, createConversationV2RequestBody2.channel);
            this.LIZIZ.encodeWithTag(protoWriter, 14, createConversationV2RequestBody2.ext);
            protoAdapter2.encodeWithTag(protoWriter, 15, createConversationV2RequestBody2.con_model_scene);
            protoAdapter.encodeWithTag(protoWriter, 16, createConversationV2RequestBody2.conversation_short_id);
            BizConvCorePersistentExt.ADAPTER.encodeWithTag(protoWriter, 17, createConversationV2RequestBody2.biz_core_persistent_extra);
            BizConvCoreTransientExt.ADAPTER.encodeWithTag(protoWriter, 18, createConversationV2RequestBody2.biz_core_transient_extra);
            protoWriter.writeBytes(createConversationV2RequestBody2.unknownFields());
        }
    };
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;
    public static final Boolean DEFAULT_PERSISTENT = Boolean.FALSE;
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;

    @Override // com.squareup.wire.Message
    public C0Y4R newBuilder() {
        C0Y4R c0y4r = new C0Y4R();
        c0y4r.LIZLLL = this.conversation_type;
        c0y4r.LJ = C1516540pZE.LIZJ("participants", this.participants);
        c0y4r.LJFF = this.persistent;
        c0y4r.LJI = this.idempotent_id;
        c0y4r.LJII = this.name;
        c0y4r.LJIIIIZZ = this.avatar_url;
        c0y4r.LJIIIZ = this.description;
        c0y4r.LJIIJ = C1516540pZE.LIZLLL("biz_ext", this.biz_ext);
        c0y4r.LJIIJJI = this.biz;
        c0y4r.LJIIL = this.channel;
        c0y4r.LJIILIIL = C1516540pZE.LIZLLL("ext", this.ext);
        c0y4r.LJIILJJIL = this.con_model_scene;
        c0y4r.LJIILL = this.conversation_short_id;
        c0y4r.LJIILLIIL = this.biz_core_persistent_extra;
        c0y4r.LJIIZILJ = this.biz_core_transient_extra;
        c0y4r.addUnknownFields(unknownFields());
        return c0y4r;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.conversation_type != null) {
            sb.append(", conversation_type=");
            sb.append(this.conversation_type);
        }
        List<Long> list = this.participants;
        if (list != null && !list.isEmpty()) {
            sb.append(", participants=");
            sb.append(this.participants);
        }
        if (this.persistent != null) {
            sb.append(", persistent=");
            sb.append(this.persistent);
        }
        if (this.idempotent_id != null) {
            sb.append(", idempotent_id=");
            sb.append(this.idempotent_id);
        }
        if (this.name != null) {
            sb.append(", name=");
            sb.append(this.name);
        }
        if (this.avatar_url != null) {
            sb.append(", avatar_url=");
            sb.append(this.avatar_url);
        }
        if (this.description != null) {
            sb.append(", description=");
            sb.append(this.description);
        }
        Map<String, String> map = this.biz_ext;
        if (map != null && !map.isEmpty()) {
            sb.append(", biz_ext=");
            sb.append(this.biz_ext);
        }
        if (this.biz != null) {
            sb.append(", biz=");
            sb.append(this.biz);
        }
        if (this.channel != null) {
            sb.append(", channel=");
            sb.append(this.channel);
        }
        Map<String, String> map2 = this.ext;
        if (map2 != null && !map2.isEmpty()) {
            sb.append(", ext=");
            sb.append(this.ext);
        }
        if (this.con_model_scene != null) {
            sb.append(", con_model_scene=");
            sb.append(this.con_model_scene);
        }
        if (this.conversation_short_id != null) {
            sb.append(", conversation_short_id=");
            sb.append(this.conversation_short_id);
        }
        if (this.biz_core_persistent_extra != null) {
            sb.append(", biz_core_persistent_extra=");
            sb.append(this.biz_core_persistent_extra);
        }
        if (this.biz_core_transient_extra != null) {
            sb.append(", biz_core_transient_extra=");
            sb.append(this.biz_core_transient_extra);
        }
        sb.replace(0, 2, "CreateConversationV2RequestBody{");
        sb.append('}');
        return sb.toString();
    }

    public CreateConversationV2RequestBody(Integer num, List<Long> list, Boolean bool, String str, String str2, String str3, String str4, Map<String, String> map, String str5, String str6, Map<String, String> map2, String str7, Long l, BizConvCorePersistentExt bizConvCorePersistentExt, BizConvCoreTransientExt bizConvCoreTransientExt) {
        this(num, list, bool, str, str2, str3, str4, map, str5, str6, map2, str7, l, bizConvCorePersistentExt, bizConvCoreTransientExt, ByteString.EMPTY);
    }

    public CreateConversationV2RequestBody(Integer num, List<Long> list, Boolean bool, String str, String str2, String str3, String str4, Map<String, String> map, String str5, String str6, Map<String, String> map2, String str7, Long l, BizConvCorePersistentExt bizConvCorePersistentExt, BizConvCoreTransientExt bizConvCoreTransientExt, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_type = num;
        this.participants = C1516540pZE.LJFF("participants", list);
        this.persistent = bool;
        this.idempotent_id = str;
        this.name = str2;
        this.avatar_url = str3;
        this.description = str4;
        this.biz_ext = C1516540pZE.LJI("biz_ext", map);
        this.biz = str5;
        this.channel = str6;
        this.ext = C1516540pZE.LJI("ext", map2);
        this.con_model_scene = str7;
        this.conversation_short_id = l;
        this.biz_core_persistent_extra = bizConvCorePersistentExt;
        this.biz_core_transient_extra = bizConvCoreTransientExt;
    }
}
