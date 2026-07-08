package com.bytedance.im.core.proto;

import X.C09CT;
import X.C0YVZ;
import X.C1516540pZE;
import X.EnumC875200YVa;
import com.bytedance.im.core.proto.NewDirectPushNotify;
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
public final class NewDirectPushNotify extends Message<NewDirectPushNotify, C0YVZ> {
    public static final long serialVersionUID = 0;

    @C09CT("content")
    public final String content;

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

    @C09CT("message_type")
    public final Integer message_type;

    @C09CT("sec_sender")
    public final String sec_sender;

    @C09CT("send_type")
    public final EnumC875200YVa send_type;

    @C09CT("sender")
    public final Long sender;
    public static final ProtoAdapter<NewDirectPushNotify> ADAPTER = new ProtoAdapter<NewDirectPushNotify>() { // from class: X.0YVY
        public final ProtoAdapter<Map<String, String>> LIZ;

        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.LIZ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final NewDirectPushNotify decode(ProtoReader protoReader) {
            C0YVZ c0yvz = new C0YVZ();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            try {
                                c0yvz.LIZLLL = EnumC875200YVa.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                TryCatchGuardChecker.doCheck(e);
                                c0yvz.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                            break;
                        case 2:
                            c0yvz.LJ = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 3:
                            c0yvz.LJFF = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c0yvz.LJI = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c0yvz.LJII = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 6:
                            c0yvz.LJIIIIZZ = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 7:
                            c0yvz.LJIIIZ = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 8:
                            c0yvz.LJIIJ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c0yvz.LJIIJJI.putAll(this.LIZ.decode(protoReader));
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c0yvz.LJIIL = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c0yvz.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c0yvz.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(NewDirectPushNotify newDirectPushNotify) {
            NewDirectPushNotify newDirectPushNotify2 = newDirectPushNotify;
            int iEncodedSizeWithTag = EnumC875200YVa.ADAPTER.encodedSizeWithTag(1, newDirectPushNotify2.send_type);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, newDirectPushNotify2.sender);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            int iEncodedSizeWithTag3 = iEncodedSizeWithTag2 + protoAdapter2.encodedSizeWithTag(3, newDirectPushNotify2.sec_sender) + protoAdapter2.encodedSizeWithTag(4, newDirectPushNotify2.conversation_id) + protoAdapter.encodedSizeWithTag(5, newDirectPushNotify2.conversation_short_id);
            ProtoAdapter<Integer> protoAdapter3 = ProtoAdapter.INT32;
            return iEncodedSizeWithTag3 + protoAdapter3.encodedSizeWithTag(6, newDirectPushNotify2.conversation_type) + protoAdapter3.encodedSizeWithTag(7, newDirectPushNotify2.message_type) + protoAdapter2.encodedSizeWithTag(8, newDirectPushNotify2.content) + this.LIZ.encodedSizeWithTag(9, newDirectPushNotify2.ext) + protoAdapter.encodedSizeWithTag(10, newDirectPushNotify2.create_time) + newDirectPushNotify2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, NewDirectPushNotify newDirectPushNotify) {
            NewDirectPushNotify newDirectPushNotify2 = newDirectPushNotify;
            EnumC875200YVa.ADAPTER.encodeWithTag(protoWriter, 1, newDirectPushNotify2.send_type);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 2, newDirectPushNotify2.sender);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            protoAdapter2.encodeWithTag(protoWriter, 3, newDirectPushNotify2.sec_sender);
            protoAdapter2.encodeWithTag(protoWriter, 4, newDirectPushNotify2.conversation_id);
            protoAdapter.encodeWithTag(protoWriter, 5, newDirectPushNotify2.conversation_short_id);
            ProtoAdapter<Integer> protoAdapter3 = ProtoAdapter.INT32;
            protoAdapter3.encodeWithTag(protoWriter, 6, newDirectPushNotify2.conversation_type);
            protoAdapter3.encodeWithTag(protoWriter, 7, newDirectPushNotify2.message_type);
            protoAdapter2.encodeWithTag(protoWriter, 8, newDirectPushNotify2.content);
            this.LIZ.encodeWithTag(protoWriter, 9, newDirectPushNotify2.ext);
            protoAdapter.encodeWithTag(protoWriter, 10, newDirectPushNotify2.create_time);
            protoWriter.writeBytes(newDirectPushNotify2.unknownFields());
        }
    };
    public static final EnumC875200YVa DEFAULT_SEND_TYPE = EnumC875200YVa.BY_CONVERSATION;
    public static final Long DEFAULT_SENDER = 0L;
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;
    public static final Integer DEFAULT_MESSAGE_TYPE = 0;
    public static final Long DEFAULT_CREATE_TIME = 0L;

    @Override // com.squareup.wire.Message
    public C0YVZ newBuilder() {
        C0YVZ c0yvz = new C0YVZ();
        c0yvz.LIZLLL = this.send_type;
        c0yvz.LJ = this.sender;
        c0yvz.LJFF = this.sec_sender;
        c0yvz.LJI = this.conversation_id;
        c0yvz.LJII = this.conversation_short_id;
        c0yvz.LJIIIIZZ = this.conversation_type;
        c0yvz.LJIIIZ = this.message_type;
        c0yvz.LJIIJ = this.content;
        c0yvz.LJIIJJI = C1516540pZE.LIZLLL("ext", this.ext);
        c0yvz.LJIIL = this.create_time;
        c0yvz.addUnknownFields(unknownFields());
        return c0yvz;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.send_type != null) {
            sb.append(", send_type=");
            sb.append(this.send_type);
        }
        if (this.sender != null) {
            sb.append(", sender=");
            sb.append(this.sender);
        }
        if (this.sec_sender != null) {
            sb.append(", sec_sender=");
            sb.append(this.sec_sender);
        }
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
        if (this.create_time != null) {
            sb.append(", create_time=");
            sb.append(this.create_time);
        }
        sb.replace(0, 2, "NewDirectPushNotify{");
        sb.append('}');
        return sb.toString();
    }

    public NewDirectPushNotify(EnumC875200YVa enumC875200YVa, Long l, String str, String str2, Long l2, Integer num, Integer num2, String str3, Map<String, String> map, Long l3) {
        this(enumC875200YVa, l, str, str2, l2, num, num2, str3, map, l3, ByteString.EMPTY);
    }

    public NewDirectPushNotify(EnumC875200YVa enumC875200YVa, Long l, String str, String str2, Long l2, Integer num, Integer num2, String str3, Map<String, String> map, Long l3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.send_type = enumC875200YVa;
        this.sender = l;
        this.sec_sender = str;
        this.conversation_id = str2;
        this.conversation_short_id = l2;
        this.conversation_type = num;
        this.message_type = num2;
        this.content = str3;
        this.ext = C1516540pZE.LJI("ext", map);
        this.create_time = l3;
    }
}
