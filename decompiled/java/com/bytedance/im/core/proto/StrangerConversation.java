package com.bytedance.im.core.proto;

import X.C09CT;
import X.C1516540pZE;
import X.C875290YVj;
import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.im.core.proto.Participant;
import com.bytedance.im.core.proto.StrangerConversation;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import java.util.Map;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public final class StrangerConversation extends Message<StrangerConversation, C875290YVj> {
    public static final long serialVersionUID = 0;

    @C09CT("badge_count")
    public final Integer badge_count;

    @C09CT("conversation_id")
    public final String conversation_id;

    @C09CT("conversation_short_id")
    public final Long conversation_short_id;

    @C09CT("ext")
    public final Map<String, String> ext;

    @C09CT("last_message")
    public final MessageBody last_message;

    @C09CT("participants")
    public final List<Participant> participants;

    @C09CT("unread")
    public final Integer unread;
    public static final ProtoAdapter<StrangerConversation> ADAPTER = new ProtoAdapter<StrangerConversation>() { // from class: X.0YVi
        public final ProtoAdapter<Map<String, String>> LIZ;

        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.LIZ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final StrangerConversation decode(ProtoReader protoReader) {
            C875290YVj c875290YVj = new C875290YVj();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c875290YVj.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 2:
                            c875290YVj.LJ = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 3:
                            c875290YVj.LJFF = MessageBody.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            c875290YVj.LJI = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c875290YVj.LJII.add(Participant.ADAPTER.decode(protoReader));
                            break;
                        case 6:
                            c875290YVj.LJIIIIZZ = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 7:
                            c875290YVj.LJIIIZ.putAll(this.LIZ.decode(protoReader));
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c875290YVj.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c875290YVj.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(StrangerConversation strangerConversation) {
            StrangerConversation strangerConversation2 = strangerConversation;
            int iEncodedSizeWithTag = ProtoAdapter.INT64.encodedSizeWithTag(1, strangerConversation2.conversation_short_id);
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, strangerConversation2.unread) + MessageBody.ADAPTER.encodedSizeWithTag(3, strangerConversation2.last_message) + ProtoAdapter.STRING.encodedSizeWithTag(4, strangerConversation2.conversation_id) + Participant.ADAPTER.asRepeated().encodedSizeWithTag(5, strangerConversation2.participants) + protoAdapter.encodedSizeWithTag(6, strangerConversation2.badge_count) + this.LIZ.encodedSizeWithTag(7, strangerConversation2.ext) + strangerConversation2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, StrangerConversation strangerConversation) {
            StrangerConversation strangerConversation2 = strangerConversation;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, strangerConversation2.conversation_short_id);
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            protoAdapter.encodeWithTag(protoWriter, 2, strangerConversation2.unread);
            MessageBody.ADAPTER.encodeWithTag(protoWriter, 3, strangerConversation2.last_message);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, strangerConversation2.conversation_id);
            Participant.ADAPTER.asRepeated().encodeWithTag(protoWriter, 5, strangerConversation2.participants);
            protoAdapter.encodeWithTag(protoWriter, 6, strangerConversation2.badge_count);
            this.LIZ.encodeWithTag(protoWriter, 7, strangerConversation2.ext);
            protoWriter.writeBytes(strangerConversation2.unknownFields());
        }
    };
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final Integer DEFAULT_UNREAD = 0;
    public static final Integer DEFAULT_BADGE_COUNT = 0;

    @Override // com.squareup.wire.Message
    public C875290YVj newBuilder() {
        C875290YVj c875290YVj = new C875290YVj();
        c875290YVj.LIZLLL = this.conversation_short_id;
        c875290YVj.LJ = this.unread;
        c875290YVj.LJFF = this.last_message;
        c875290YVj.LJI = this.conversation_id;
        c875290YVj.LJII = C1516540pZE.LIZJ("participants", this.participants);
        c875290YVj.LJIIIIZZ = this.badge_count;
        c875290YVj.LJIIIZ = C1516540pZE.LIZLLL("ext", this.ext);
        c875290YVj.addUnknownFields(unknownFields());
        return c875290YVj;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.conversation_short_id != null) {
            sb.append(", conversation_short_id=");
            sb.append(this.conversation_short_id);
        }
        if (this.unread != null) {
            sb.append(", unread=");
            sb.append(this.unread);
        }
        if (this.last_message != null) {
            sb.append(", last_message=");
            sb.append(this.last_message);
        }
        if (this.conversation_id != null) {
            sb.append(", conversation_id=");
            sb.append(this.conversation_id);
        }
        List<Participant> list = this.participants;
        if (list != null && !list.isEmpty()) {
            sb.append(", participants=");
            sb.append(this.participants);
        }
        if (this.badge_count != null) {
            sb.append(", badge_count=");
            sb.append(this.badge_count);
        }
        Map<String, String> map = this.ext;
        if (map != null && !map.isEmpty()) {
            sb.append(", ext=");
            sb.append(this.ext);
        }
        sb.replace(0, 2, "StrangerConversation{");
        sb.append('}');
        return sb.toString();
    }

    public StrangerConversation(Long l, Integer num, MessageBody messageBody, String str, List<Participant> list, Integer num2, Map<String, String> map) {
        this(l, num, messageBody, str, list, num2, map, ByteString.EMPTY);
    }

    public StrangerConversation(Long l, Integer num, MessageBody messageBody, String str, List<Participant> list, Integer num2, Map<String, String> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_short_id = l;
        this.unread = num;
        this.last_message = messageBody;
        this.conversation_id = str;
        this.participants = C1516540pZE.LJFF("participants", list);
        this.badge_count = num2;
        this.ext = C1516540pZE.LJI("ext", map);
    }
}
