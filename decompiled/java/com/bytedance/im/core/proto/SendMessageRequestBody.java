package com.bytedance.im.core.proto;

import X.C09CT;
import X.C0YCA;
import X.C1516540pZE;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.im.core.proto.ReferencedMessageInfo;
import com.bytedance.im.core.proto.SendMediaRequest;
import com.bytedance.im.core.proto.SendMessageRequestBody;
import com.bytedance.scene.Scene;
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
public final class SendMessageRequestBody extends Message<SendMessageRequestBody, C0YCA> {
    public static final ByteString DEFAULT_BIZ_PERSISTENT_EXTRA;
    public static final ByteString DEFAULT_BIZ_TRANSIENT_EXTRA;
    public static final ByteString DEFAULT_CONTENT_PB;
    public static final Long DEFAULT_FORWARDED_MSG_ID;
    public static final long serialVersionUID = 0;

    @C09CT("InvisibleUsers")
    public final List<Long> InvisibleUsers;

    @C09CT("VisibleUsers")
    public final List<Long> VisibleUsers;

    @C09CT("biz_persistent_extra")
    public final ByteString biz_persistent_extra;

    @C09CT("biz_transient_extra")
    public final ByteString biz_transient_extra;

    @C09CT("client_ext")
    public final Map<String, String> client_ext;

    @C09CT("client_message_id")
    public final String client_message_id;

    @C09CT("content")
    public final String content;

    @C09CT("content_pb")
    public final ByteString content_pb;

    @C09CT("conversation_id")
    public final String conversation_id;

    @C09CT("conversation_short_id")
    public final Long conversation_short_id;

    @C09CT("conversation_type")
    public final Integer conversation_type;

    @C09CT("ext")
    public final Map<String, String> ext;

    @C09CT("forwarded_msg_id")
    public final Long forwarded_msg_id;

    @C09CT("ignore_badge_count")
    public final Boolean ignore_badge_count;

    @C09CT("mentioned_users")
    public final List<Long> mentioned_users;

    @C09CT("message_type")
    public final Integer message_type;

    @C09CT("ref_msg_info")
    public final ReferencedMessageInfo ref_msg_info;

    @C09CT(Scene.SCENE_SERVICE)
    public final String scene;

    @C09CT("send_media_list")
    public final List<SendMediaRequest> send_media_list;

    @C09CT("ticket")
    public final String ticket;
    public static final ProtoAdapter<SendMessageRequestBody> ADAPTER = new ProtoAdapter<SendMessageRequestBody>() { // from class: X.0YCL
        public final ProtoAdapter<Map<String, String>> LIZ;
        public final ProtoAdapter<Map<String, String>> LIZIZ;

        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.LIZ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
            this.LIZIZ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final SendMessageRequestBody decode(ProtoReader protoReader) {
            C0YCA c0yca = new C0YCA();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c0yca.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c0yca.LJ = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 3:
                            c0yca.LJFF = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 4:
                            c0yca.LJI = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c0yca.LJII.putAll(this.LIZ.decode(protoReader));
                            break;
                        case 6:
                            c0yca.LJIIIIZZ = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 7:
                            c0yca.LJIIIZ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            c0yca.LJIIJ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c0yca.LJIIJJI.add(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c0yca.LJIIL = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c0yca.LJIILIIL = ReferencedMessageInfo.ADAPTER.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            c0yca.LJIILJJIL.putAll(this.LIZIZ.decode(protoReader));
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            c0yca.LJIILL = ProtoAdapter.BYTES.decode(protoReader);
                            break;
                        case 14:
                            c0yca.LJIILLIIL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 15:
                            c0yca.LJIIZILJ.add(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 16:
                            c0yca.LJIJ.add(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                            c0yca.LJIJI.add(SendMediaRequest.ADAPTER.decode(protoReader));
                            break;
                        case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                            c0yca.LJIJJ = ProtoAdapter.BYTES.decode(protoReader);
                            break;
                        case 19:
                            c0yca.LJIJJLI = ProtoAdapter.BYTES.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                            c0yca.LJIL = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c0yca.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c0yca.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(SendMessageRequestBody sendMessageRequestBody) {
            SendMessageRequestBody sendMessageRequestBody2 = sendMessageRequestBody;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, sendMessageRequestBody2.conversation_id);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(2, sendMessageRequestBody2.conversation_type);
            ProtoAdapter<Long> protoAdapter3 = ProtoAdapter.INT64;
            int iEncodedSizeWithTag3 = iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(3, sendMessageRequestBody2.conversation_short_id) + protoAdapter.encodedSizeWithTag(4, sendMessageRequestBody2.content) + this.LIZ.encodedSizeWithTag(5, sendMessageRequestBody2.ext) + protoAdapter2.encodedSizeWithTag(6, sendMessageRequestBody2.message_type) + protoAdapter.encodedSizeWithTag(7, sendMessageRequestBody2.ticket) + protoAdapter.encodedSizeWithTag(8, sendMessageRequestBody2.client_message_id) + protoAdapter3.asRepeated().encodedSizeWithTag(9, sendMessageRequestBody2.mentioned_users) + ProtoAdapter.BOOL.encodedSizeWithTag(10, sendMessageRequestBody2.ignore_badge_count) + ReferencedMessageInfo.ADAPTER.encodedSizeWithTag(11, sendMessageRequestBody2.ref_msg_info) + this.LIZIZ.encodedSizeWithTag(12, sendMessageRequestBody2.client_ext);
            ProtoAdapter<ByteString> protoAdapter4 = ProtoAdapter.BYTES;
            return iEncodedSizeWithTag3 + protoAdapter4.encodedSizeWithTag(13, sendMessageRequestBody2.content_pb) + protoAdapter.encodedSizeWithTag(14, sendMessageRequestBody2.scene) + protoAdapter3.asRepeated().encodedSizeWithTag(15, sendMessageRequestBody2.VisibleUsers) + protoAdapter3.asRepeated().encodedSizeWithTag(16, sendMessageRequestBody2.InvisibleUsers) + SendMediaRequest.ADAPTER.asRepeated().encodedSizeWithTag(17, sendMessageRequestBody2.send_media_list) + protoAdapter4.encodedSizeWithTag(18, sendMessageRequestBody2.biz_transient_extra) + protoAdapter4.encodedSizeWithTag(19, sendMessageRequestBody2.biz_persistent_extra) + protoAdapter3.encodedSizeWithTag(20, sendMessageRequestBody2.forwarded_msg_id) + sendMessageRequestBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, SendMessageRequestBody sendMessageRequestBody) {
            SendMessageRequestBody sendMessageRequestBody2 = sendMessageRequestBody;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, sendMessageRequestBody2.conversation_id);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            protoAdapter2.encodeWithTag(protoWriter, 2, sendMessageRequestBody2.conversation_type);
            ProtoAdapter<Long> protoAdapter3 = ProtoAdapter.INT64;
            protoAdapter3.encodeWithTag(protoWriter, 3, sendMessageRequestBody2.conversation_short_id);
            protoAdapter.encodeWithTag(protoWriter, 4, sendMessageRequestBody2.content);
            this.LIZ.encodeWithTag(protoWriter, 5, sendMessageRequestBody2.ext);
            protoAdapter2.encodeWithTag(protoWriter, 6, sendMessageRequestBody2.message_type);
            protoAdapter.encodeWithTag(protoWriter, 7, sendMessageRequestBody2.ticket);
            protoAdapter.encodeWithTag(protoWriter, 8, sendMessageRequestBody2.client_message_id);
            protoAdapter3.asRepeated().encodeWithTag(protoWriter, 9, sendMessageRequestBody2.mentioned_users);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 10, sendMessageRequestBody2.ignore_badge_count);
            ReferencedMessageInfo.ADAPTER.encodeWithTag(protoWriter, 11, sendMessageRequestBody2.ref_msg_info);
            this.LIZIZ.encodeWithTag(protoWriter, 12, sendMessageRequestBody2.client_ext);
            ProtoAdapter<ByteString> protoAdapter4 = ProtoAdapter.BYTES;
            protoAdapter4.encodeWithTag(protoWriter, 13, sendMessageRequestBody2.content_pb);
            protoAdapter.encodeWithTag(protoWriter, 14, sendMessageRequestBody2.scene);
            protoAdapter3.asRepeated().encodeWithTag(protoWriter, 15, sendMessageRequestBody2.VisibleUsers);
            protoAdapter3.asRepeated().encodeWithTag(protoWriter, 16, sendMessageRequestBody2.InvisibleUsers);
            SendMediaRequest.ADAPTER.asRepeated().encodeWithTag(protoWriter, 17, sendMessageRequestBody2.send_media_list);
            protoAdapter4.encodeWithTag(protoWriter, 18, sendMessageRequestBody2.biz_transient_extra);
            protoAdapter4.encodeWithTag(protoWriter, 19, sendMessageRequestBody2.biz_persistent_extra);
            protoAdapter3.encodeWithTag(protoWriter, 20, sendMessageRequestBody2.forwarded_msg_id);
            protoWriter.writeBytes(sendMessageRequestBody2.unknownFields());
        }
    };
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final Integer DEFAULT_MESSAGE_TYPE = 0;
    public static final Boolean DEFAULT_IGNORE_BADGE_COUNT = Boolean.FALSE;

    static {
        ByteString byteString = ByteString.EMPTY;
        DEFAULT_CONTENT_PB = byteString;
        DEFAULT_BIZ_TRANSIENT_EXTRA = byteString;
        DEFAULT_BIZ_PERSISTENT_EXTRA = byteString;
        DEFAULT_FORWARDED_MSG_ID = 0L;
    }

    @Override // com.squareup.wire.Message
    public C0YCA newBuilder() {
        C0YCA c0yca = new C0YCA();
        c0yca.LIZLLL = this.conversation_id;
        c0yca.LJ = this.conversation_type;
        c0yca.LJFF = this.conversation_short_id;
        c0yca.LJI = this.content;
        c0yca.LJII = C1516540pZE.LIZLLL("ext", this.ext);
        c0yca.LJIIIIZZ = this.message_type;
        c0yca.LJIIIZ = this.ticket;
        c0yca.LJIIJ = this.client_message_id;
        c0yca.LJIIJJI = C1516540pZE.LIZJ("mentioned_users", this.mentioned_users);
        c0yca.LJIIL = this.ignore_badge_count;
        c0yca.LJIILIIL = this.ref_msg_info;
        c0yca.LJIILJJIL = C1516540pZE.LIZLLL("client_ext", this.client_ext);
        c0yca.LJIILL = this.content_pb;
        c0yca.LJIILLIIL = this.scene;
        c0yca.LJIIZILJ = C1516540pZE.LIZJ("VisibleUsers", this.VisibleUsers);
        c0yca.LJIJ = C1516540pZE.LIZJ("InvisibleUsers", this.InvisibleUsers);
        c0yca.LJIJI = C1516540pZE.LIZJ("send_media_list", this.send_media_list);
        c0yca.LJIJJ = this.biz_transient_extra;
        c0yca.LJIJJLI = this.biz_persistent_extra;
        c0yca.LJIL = this.forwarded_msg_id;
        c0yca.addUnknownFields(unknownFields());
        return c0yca;
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
        if (this.conversation_short_id != null) {
            sb.append(", conversation_short_id=");
            sb.append(this.conversation_short_id);
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
        if (this.message_type != null) {
            sb.append(", message_type=");
            sb.append(this.message_type);
        }
        if (this.ticket != null) {
            sb.append(", ticket=");
            sb.append(this.ticket);
        }
        if (this.client_message_id != null) {
            sb.append(", client_message_id=");
            sb.append(this.client_message_id);
        }
        List<Long> list = this.mentioned_users;
        if (list != null && !list.isEmpty()) {
            sb.append(", mentioned_users=");
            sb.append(this.mentioned_users);
        }
        if (this.ignore_badge_count != null) {
            sb.append(", ignore_badge_count=");
            sb.append(this.ignore_badge_count);
        }
        if (this.ref_msg_info != null) {
            sb.append(", ref_msg_info=");
            sb.append(this.ref_msg_info);
        }
        Map<String, String> map2 = this.client_ext;
        if (map2 != null && !map2.isEmpty()) {
            sb.append(", client_ext=");
            sb.append(this.client_ext);
        }
        if (this.content_pb != null) {
            sb.append(", content_pb=");
            sb.append(this.content_pb);
        }
        if (this.scene != null) {
            sb.append(", scene=");
            sb.append(this.scene);
        }
        List<Long> list2 = this.VisibleUsers;
        if (list2 != null && !list2.isEmpty()) {
            sb.append(", VisibleUsers=");
            sb.append(this.VisibleUsers);
        }
        List<Long> list3 = this.InvisibleUsers;
        if (list3 != null && !list3.isEmpty()) {
            sb.append(", InvisibleUsers=");
            sb.append(this.InvisibleUsers);
        }
        List<SendMediaRequest> list4 = this.send_media_list;
        if (list4 != null && !list4.isEmpty()) {
            sb.append(", send_media_list=");
            sb.append(this.send_media_list);
        }
        if (this.biz_transient_extra != null) {
            sb.append(", biz_transient_extra=");
            sb.append(this.biz_transient_extra);
        }
        if (this.biz_persistent_extra != null) {
            sb.append(", biz_persistent_extra=");
            sb.append(this.biz_persistent_extra);
        }
        if (this.forwarded_msg_id != null) {
            sb.append(", forwarded_msg_id=");
            sb.append(this.forwarded_msg_id);
        }
        sb.replace(0, 2, "SendMessageRequestBody{");
        sb.append('}');
        return sb.toString();
    }

    public SendMessageRequestBody(String str, Integer num, Long l, String str2, Map<String, String> map, Integer num2, String str3, String str4, List<Long> list, Boolean bool, ReferencedMessageInfo referencedMessageInfo, Map<String, String> map2, ByteString byteString, String str5, List<Long> list2, List<Long> list3, List<SendMediaRequest> list4, ByteString byteString2, ByteString byteString3, Long l2) {
        this(str, num, l, str2, map, num2, str3, str4, list, bool, referencedMessageInfo, map2, byteString, str5, list2, list3, list4, byteString2, byteString3, l2, ByteString.EMPTY);
    }

    public SendMessageRequestBody(String str, Integer num, Long l, String str2, Map<String, String> map, Integer num2, String str3, String str4, List<Long> list, Boolean bool, ReferencedMessageInfo referencedMessageInfo, Map<String, String> map2, ByteString byteString, String str5, List<Long> list2, List<Long> list3, List<SendMediaRequest> list4, ByteString byteString2, ByteString byteString3, Long l2, ByteString byteString4) {
        super(ADAPTER, byteString4);
        this.conversation_id = str;
        this.conversation_type = num;
        this.conversation_short_id = l;
        this.content = str2;
        this.ext = C1516540pZE.LJI("ext", map);
        this.message_type = num2;
        this.ticket = str3;
        this.client_message_id = str4;
        this.mentioned_users = C1516540pZE.LJFF("mentioned_users", list);
        this.ignore_badge_count = bool;
        this.ref_msg_info = referencedMessageInfo;
        this.client_ext = C1516540pZE.LJI("client_ext", map2);
        this.content_pb = byteString;
        this.scene = str5;
        this.VisibleUsers = C1516540pZE.LJFF("VisibleUsers", list2);
        this.InvisibleUsers = C1516540pZE.LJFF("InvisibleUsers", list3);
        this.send_media_list = C1516540pZE.LJFF("send_media_list", list4);
        this.biz_transient_extra = byteString2;
        this.biz_persistent_extra = byteString3;
        this.forwarded_msg_id = l2;
    }
}
