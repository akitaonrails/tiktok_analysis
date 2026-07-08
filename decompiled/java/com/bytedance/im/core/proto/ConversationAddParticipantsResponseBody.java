package com.bytedance.im.core.proto;

import X.C09CT;
import X.C1516540pZE;
import X.C1DBG;
import com.bytedance.im.core.proto.ConversationAddParticipantsResponseBody;
import com.bytedance.im.core.proto.SecUidPair;
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

/* JADX INFO: loaded from: classes36.dex */
public final class ConversationAddParticipantsResponseBody extends Message<ConversationAddParticipantsResponseBody, C1DBG> {
    public static final long serialVersionUID = 0;

    @C09CT("biz_ext")
    public final Map<String, String> biz_ext;

    @C09CT("check_code")
    public final Long check_code;

    @C09CT("check_message")
    public final String check_message;

    @C09CT("ext")
    public final Map<String, String> ext;

    @C09CT("extra_info")
    public final String extra_info;

    @C09CT("failed_participants")
    public final List<Long> failed_participants;

    @C09CT("sec_failed_participants")
    public final List<SecUidPair> sec_failed_participants;

    @C09CT("sec_success_participants")
    public final List<SecUidPair> sec_success_participants;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final Integer status;

    @C09CT("success_participants")
    public final List<Long> success_participants;
    public static final ProtoAdapter<ConversationAddParticipantsResponseBody> ADAPTER = new ProtoAdapter<ConversationAddParticipantsResponseBody>() { // from class: X.1DBF
        public final ProtoAdapter<Map<String, String>> LIZ;
        public final ProtoAdapter<Map<String, String>> LIZIZ;

        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.LIZ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
            this.LIZIZ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final ConversationAddParticipantsResponseBody decode(ProtoReader protoReader) {
            C1DBG c1dbg = new C1DBG();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c1dbg.LIZLLL.add(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 2:
                            c1dbg.LJ.add(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 3:
                            c1dbg.LJFF = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 4:
                            c1dbg.LJI = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c1dbg.LJII = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 6:
                            c1dbg.LJIIIIZZ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            c1dbg.LJIIIZ.add(SecUidPair.ADAPTER.decode(protoReader));
                            break;
                        case 8:
                            c1dbg.LJIIJ.add(SecUidPair.ADAPTER.decode(protoReader));
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c1dbg.LJIIJJI.putAll(this.LIZ.decode(protoReader));
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c1dbg.LJIIL.putAll(this.LIZIZ.decode(protoReader));
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c1dbg.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1dbg.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(ConversationAddParticipantsResponseBody conversationAddParticipantsResponseBody) {
            ConversationAddParticipantsResponseBody conversationAddParticipantsResponseBody2 = conversationAddParticipantsResponseBody;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            int iEncodedSizeWithTag = protoAdapter.asRepeated().encodedSizeWithTag(1, conversationAddParticipantsResponseBody2.success_participants) + protoAdapter.asRepeated().encodedSizeWithTag(2, conversationAddParticipantsResponseBody2.failed_participants) + ProtoAdapter.INT32.encodedSizeWithTag(3, conversationAddParticipantsResponseBody2.status);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(4, conversationAddParticipantsResponseBody2.extra_info) + protoAdapter.encodedSizeWithTag(5, conversationAddParticipantsResponseBody2.check_code) + protoAdapter2.encodedSizeWithTag(6, conversationAddParticipantsResponseBody2.check_message);
            ProtoAdapter<SecUidPair> protoAdapter3 = SecUidPair.ADAPTER;
            return iEncodedSizeWithTag2 + protoAdapter3.asRepeated().encodedSizeWithTag(7, conversationAddParticipantsResponseBody2.sec_success_participants) + protoAdapter3.asRepeated().encodedSizeWithTag(8, conversationAddParticipantsResponseBody2.sec_failed_participants) + this.LIZ.encodedSizeWithTag(9, conversationAddParticipantsResponseBody2.biz_ext) + this.LIZIZ.encodedSizeWithTag(10, conversationAddParticipantsResponseBody2.ext) + conversationAddParticipantsResponseBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, ConversationAddParticipantsResponseBody conversationAddParticipantsResponseBody) {
            ConversationAddParticipantsResponseBody conversationAddParticipantsResponseBody2 = conversationAddParticipantsResponseBody;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.asRepeated().encodeWithTag(protoWriter, 1, conversationAddParticipantsResponseBody2.success_participants);
            protoAdapter.asRepeated().encodeWithTag(protoWriter, 2, conversationAddParticipantsResponseBody2.failed_participants);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, conversationAddParticipantsResponseBody2.status);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            protoAdapter2.encodeWithTag(protoWriter, 4, conversationAddParticipantsResponseBody2.extra_info);
            protoAdapter.encodeWithTag(protoWriter, 5, conversationAddParticipantsResponseBody2.check_code);
            protoAdapter2.encodeWithTag(protoWriter, 6, conversationAddParticipantsResponseBody2.check_message);
            ProtoAdapter<SecUidPair> protoAdapter3 = SecUidPair.ADAPTER;
            protoAdapter3.asRepeated().encodeWithTag(protoWriter, 7, conversationAddParticipantsResponseBody2.sec_success_participants);
            protoAdapter3.asRepeated().encodeWithTag(protoWriter, 8, conversationAddParticipantsResponseBody2.sec_failed_participants);
            this.LIZ.encodeWithTag(protoWriter, 9, conversationAddParticipantsResponseBody2.biz_ext);
            this.LIZIZ.encodeWithTag(protoWriter, 10, conversationAddParticipantsResponseBody2.ext);
            protoWriter.writeBytes(conversationAddParticipantsResponseBody2.unknownFields());
        }
    };
    public static final Integer DEFAULT_STATUS = 0;
    public static final Long DEFAULT_CHECK_CODE = 0L;

    @Override // com.squareup.wire.Message
    public C1DBG newBuilder() {
        C1DBG c1dbg = new C1DBG();
        c1dbg.LIZLLL = C1516540pZE.LIZJ("success_participants", this.success_participants);
        c1dbg.LJ = C1516540pZE.LIZJ("failed_participants", this.failed_participants);
        c1dbg.LJFF = this.status;
        c1dbg.LJI = this.extra_info;
        c1dbg.LJII = this.check_code;
        c1dbg.LJIIIIZZ = this.check_message;
        c1dbg.LJIIIZ = C1516540pZE.LIZJ("sec_success_participants", this.sec_success_participants);
        c1dbg.LJIIJ = C1516540pZE.LIZJ("sec_failed_participants", this.sec_failed_participants);
        c1dbg.LJIIJJI = C1516540pZE.LIZLLL("biz_ext", this.biz_ext);
        c1dbg.LJIIL = C1516540pZE.LIZLLL("ext", this.ext);
        c1dbg.addUnknownFields(unknownFields());
        return c1dbg;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<Long> list = this.success_participants;
        if (list != null && !list.isEmpty()) {
            sb.append(", success_participants=");
            sb.append(this.success_participants);
        }
        List<Long> list2 = this.failed_participants;
        if (list2 != null && !list2.isEmpty()) {
            sb.append(", failed_participants=");
            sb.append(this.failed_participants);
        }
        if (this.status != null) {
            sb.append(", status=");
            sb.append(this.status);
        }
        if (this.extra_info != null) {
            sb.append(", extra_info=");
            sb.append(this.extra_info);
        }
        if (this.check_code != null) {
            sb.append(", check_code=");
            sb.append(this.check_code);
        }
        if (this.check_message != null) {
            sb.append(", check_message=");
            sb.append(this.check_message);
        }
        List<SecUidPair> list3 = this.sec_success_participants;
        if (list3 != null && !list3.isEmpty()) {
            sb.append(", sec_success_participants=");
            sb.append(this.sec_success_participants);
        }
        List<SecUidPair> list4 = this.sec_failed_participants;
        if (list4 != null && !list4.isEmpty()) {
            sb.append(", sec_failed_participants=");
            sb.append(this.sec_failed_participants);
        }
        Map<String, String> map = this.biz_ext;
        if (map != null && !map.isEmpty()) {
            sb.append(", biz_ext=");
            sb.append(this.biz_ext);
        }
        Map<String, String> map2 = this.ext;
        if (map2 != null && !map2.isEmpty()) {
            sb.append(", ext=");
            sb.append(this.ext);
        }
        sb.replace(0, 2, "ConversationAddParticipantsResponseBody{");
        sb.append('}');
        return sb.toString();
    }

    public ConversationAddParticipantsResponseBody(List<Long> list, List<Long> list2, Integer num, String str, Long l, String str2, List<SecUidPair> list3, List<SecUidPair> list4, Map<String, String> map, Map<String, String> map2) {
        this(list, list2, num, str, l, str2, list3, list4, map, map2, ByteString.EMPTY);
    }

    public ConversationAddParticipantsResponseBody(List<Long> list, List<Long> list2, Integer num, String str, Long l, String str2, List<SecUidPair> list3, List<SecUidPair> list4, Map<String, String> map, Map<String, String> map2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.success_participants = C1516540pZE.LJFF("success_participants", list);
        this.failed_participants = C1516540pZE.LJFF("failed_participants", list2);
        this.status = num;
        this.extra_info = str;
        this.check_code = l;
        this.check_message = str2;
        this.sec_success_participants = C1516540pZE.LJFF("sec_success_participants", list3);
        this.sec_failed_participants = C1516540pZE.LJFF("sec_failed_participants", list4);
        this.biz_ext = C1516540pZE.LJI("biz_ext", map);
        this.ext = C1516540pZE.LJI("ext", map2);
    }
}
