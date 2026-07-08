package com.bytedance.im.core.proto;

import X.C09CT;
import X.C1516540pZE;
import X.C2239971Cln;
import X.EnumC875200YVa;
import com.bytedance.im.core.proto.SendMessageP2PRequestBody;
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

/* JADX INFO: loaded from: classes35.dex */
public final class SendMessageP2PRequestBody extends Message<SendMessageP2PRequestBody, C2239971Cln> {
    public static final long serialVersionUID = 0;

    @C09CT("client_message_id")
    public final String client_message_id;

    @C09CT("content")
    public final String content;

    @C09CT("conversation_id")
    public final String conversation_id;

    @C09CT("conversation_short_id")
    public final Long conversation_short_id;

    @C09CT("conversation_type")
    public final Integer conversation_type;

    @C09CT("ext")
    public final Map<String, String> ext;

    @C09CT("invisible_user")
    public final List<Long> invisible_user;

    @C09CT("message_type")
    public final Integer message_type;

    @C09CT("send_type")
    public final EnumC875200YVa send_type;

    @C09CT("visible_user")
    public final List<Long> visible_user;
    public static final ProtoAdapter<SendMessageP2PRequestBody> ADAPTER = new ProtoAdapter<SendMessageP2PRequestBody>() { // from class: X.1Clm
        public final ProtoAdapter<Map<String, String>> LIZ;

        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.LIZ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final SendMessageP2PRequestBody decode(ProtoReader protoReader) {
            C2239971Cln c2239971Cln = new C2239971Cln();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            try {
                                c2239971Cln.LIZLLL = EnumC875200YVa.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                TryCatchGuardChecker.doCheck(e);
                                c2239971Cln.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                            break;
                        case 2:
                            c2239971Cln.LJ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c2239971Cln.LJFF = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 4:
                            c2239971Cln.LJI = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 5:
                            c2239971Cln.LJII.add(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 6:
                            c2239971Cln.LJIIIIZZ.add(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 7:
                            c2239971Cln.LJIIIZ = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 8:
                            c2239971Cln.LJIIJ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c2239971Cln.LJIIJJI.putAll(this.LIZ.decode(protoReader));
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c2239971Cln.LJIIL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2239971Cln.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2239971Cln.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(SendMessageP2PRequestBody sendMessageP2PRequestBody) {
            SendMessageP2PRequestBody sendMessageP2PRequestBody2 = sendMessageP2PRequestBody;
            int iEncodedSizeWithTag = EnumC875200YVa.ADAPTER.encodedSizeWithTag(1, sendMessageP2PRequestBody2.send_type);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, sendMessageP2PRequestBody2.conversation_id);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            int iEncodedSizeWithTag3 = iEncodedSizeWithTag2 + protoAdapter2.encodedSizeWithTag(3, sendMessageP2PRequestBody2.conversation_type);
            ProtoAdapter<Long> protoAdapter3 = ProtoAdapter.INT64;
            return iEncodedSizeWithTag3 + protoAdapter3.encodedSizeWithTag(4, sendMessageP2PRequestBody2.conversation_short_id) + protoAdapter3.asRepeated().encodedSizeWithTag(5, sendMessageP2PRequestBody2.visible_user) + protoAdapter3.asRepeated().encodedSizeWithTag(6, sendMessageP2PRequestBody2.invisible_user) + protoAdapter2.encodedSizeWithTag(7, sendMessageP2PRequestBody2.message_type) + protoAdapter.encodedSizeWithTag(8, sendMessageP2PRequestBody2.content) + this.LIZ.encodedSizeWithTag(9, sendMessageP2PRequestBody2.ext) + protoAdapter.encodedSizeWithTag(10, sendMessageP2PRequestBody2.client_message_id) + sendMessageP2PRequestBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, SendMessageP2PRequestBody sendMessageP2PRequestBody) {
            SendMessageP2PRequestBody sendMessageP2PRequestBody2 = sendMessageP2PRequestBody;
            EnumC875200YVa.ADAPTER.encodeWithTag(protoWriter, 1, sendMessageP2PRequestBody2.send_type);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 2, sendMessageP2PRequestBody2.conversation_id);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            protoAdapter2.encodeWithTag(protoWriter, 3, sendMessageP2PRequestBody2.conversation_type);
            ProtoAdapter<Long> protoAdapter3 = ProtoAdapter.INT64;
            protoAdapter3.encodeWithTag(protoWriter, 4, sendMessageP2PRequestBody2.conversation_short_id);
            protoAdapter3.asRepeated().encodeWithTag(protoWriter, 5, sendMessageP2PRequestBody2.visible_user);
            protoAdapter3.asRepeated().encodeWithTag(protoWriter, 6, sendMessageP2PRequestBody2.invisible_user);
            protoAdapter2.encodeWithTag(protoWriter, 7, sendMessageP2PRequestBody2.message_type);
            protoAdapter.encodeWithTag(protoWriter, 8, sendMessageP2PRequestBody2.content);
            this.LIZ.encodeWithTag(protoWriter, 9, sendMessageP2PRequestBody2.ext);
            protoAdapter.encodeWithTag(protoWriter, 10, sendMessageP2PRequestBody2.client_message_id);
            protoWriter.writeBytes(sendMessageP2PRequestBody2.unknownFields());
        }
    };
    public static final EnumC875200YVa DEFAULT_SEND_TYPE = EnumC875200YVa.BY_CONVERSATION;
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final Integer DEFAULT_MESSAGE_TYPE = 0;

    @Override // com.squareup.wire.Message
    public C2239971Cln newBuilder() {
        C2239971Cln c2239971Cln = new C2239971Cln();
        c2239971Cln.LIZLLL = this.send_type;
        c2239971Cln.LJ = this.conversation_id;
        c2239971Cln.LJFF = this.conversation_type;
        c2239971Cln.LJI = this.conversation_short_id;
        c2239971Cln.LJII = C1516540pZE.LIZJ("visible_user", this.visible_user);
        c2239971Cln.LJIIIIZZ = C1516540pZE.LIZJ("invisible_user", this.invisible_user);
        c2239971Cln.LJIIIZ = this.message_type;
        c2239971Cln.LJIIJ = this.content;
        c2239971Cln.LJIIJJI = C1516540pZE.LIZLLL("ext", this.ext);
        c2239971Cln.LJIIL = this.client_message_id;
        c2239971Cln.addUnknownFields(unknownFields());
        return c2239971Cln;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.send_type != null) {
            sb.append(", send_type=");
            sb.append(this.send_type);
        }
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
        List<Long> list = this.visible_user;
        if (list != null && !list.isEmpty()) {
            sb.append(", visible_user=");
            sb.append(this.visible_user);
        }
        List<Long> list2 = this.invisible_user;
        if (list2 != null && !list2.isEmpty()) {
            sb.append(", invisible_user=");
            sb.append(this.invisible_user);
        }
        if (this.message_type != null) {
            sb.append(", message_type=");
            sb.append(this.message_type);
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
        if (this.client_message_id != null) {
            sb.append(", client_message_id=");
            sb.append(this.client_message_id);
        }
        sb.replace(0, 2, "SendMessageP2PRequestBody{");
        sb.append('}');
        return sb.toString();
    }

    public SendMessageP2PRequestBody(EnumC875200YVa enumC875200YVa, String str, Integer num, Long l, List<Long> list, List<Long> list2, Integer num2, String str2, Map<String, String> map, String str3) {
        this(enumC875200YVa, str, num, l, list, list2, num2, str2, map, str3, ByteString.EMPTY);
    }

    public SendMessageP2PRequestBody(EnumC875200YVa enumC875200YVa, String str, Integer num, Long l, List<Long> list, List<Long> list2, Integer num2, String str2, Map<String, String> map, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.send_type = enumC875200YVa;
        this.conversation_id = str;
        this.conversation_type = num;
        this.conversation_short_id = l;
        this.visible_user = C1516540pZE.LJFF("visible_user", list);
        this.invisible_user = C1516540pZE.LJFF("invisible_user", list2);
        this.message_type = num2;
        this.content = str2;
        this.ext = C1516540pZE.LJI("ext", map);
        this.client_message_id = str3;
    }
}
