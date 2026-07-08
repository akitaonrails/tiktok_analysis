package com.bytedance.im.core.proto;

import X.C09CT;
import X.C0YMZ;
import X.C1516540pZE;
import com.bytedance.im.core.proto.ConversationRemoveParticipantsRequestBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import java.util.Map;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public final class ConversationRemoveParticipantsRequestBody extends Message<ConversationRemoveParticipantsRequestBody, C0YMZ> {
    public static final ProtoAdapter<ConversationRemoveParticipantsRequestBody> ADAPTER = new ProtoAdapter<ConversationRemoveParticipantsRequestBody>() { // from class: X.0YMa
        public final ProtoAdapter<Map<String, String>> LIZ;

        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.LIZ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final ConversationRemoveParticipantsRequestBody decode(ProtoReader protoReader) {
            C0YMZ c0ymz = new C0YMZ();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    if (iNextTag != 5) {
                                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                        c0ymz.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                    } else {
                                        c0ymz.LJII.putAll(this.LIZ.decode(protoReader));
                                    }
                                } else {
                                    c0ymz.LJI.add(ProtoAdapter.INT64.decode(protoReader));
                                }
                            } else {
                                c0ymz.LJFF = ProtoAdapter.INT32.decode(protoReader);
                            }
                        } else {
                            c0ymz.LJ = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c0ymz.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c0ymz.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(ConversationRemoveParticipantsRequestBody conversationRemoveParticipantsRequestBody) {
            ConversationRemoveParticipantsRequestBody conversationRemoveParticipantsRequestBody2 = conversationRemoveParticipantsRequestBody;
            int iEncodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, conversationRemoveParticipantsRequestBody2.conversation_id);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, conversationRemoveParticipantsRequestBody2.conversation_short_id) + ProtoAdapter.INT32.encodedSizeWithTag(3, conversationRemoveParticipantsRequestBody2.conversation_type) + protoAdapter.asRepeated().encodedSizeWithTag(4, conversationRemoveParticipantsRequestBody2.participants) + this.LIZ.encodedSizeWithTag(5, conversationRemoveParticipantsRequestBody2.biz_ext) + conversationRemoveParticipantsRequestBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, ConversationRemoveParticipantsRequestBody conversationRemoveParticipantsRequestBody) {
            ConversationRemoveParticipantsRequestBody conversationRemoveParticipantsRequestBody2 = conversationRemoveParticipantsRequestBody;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, conversationRemoveParticipantsRequestBody2.conversation_id);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 2, conversationRemoveParticipantsRequestBody2.conversation_short_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, conversationRemoveParticipantsRequestBody2.conversation_type);
            protoAdapter.asRepeated().encodeWithTag(protoWriter, 4, conversationRemoveParticipantsRequestBody2.participants);
            this.LIZ.encodeWithTag(protoWriter, 5, conversationRemoveParticipantsRequestBody2.biz_ext);
            protoWriter.writeBytes(conversationRemoveParticipantsRequestBody2.unknownFields());
        }
    };
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;
    public static final long serialVersionUID = 0;

    @C09CT("biz_ext")
    public final Map<String, String> biz_ext;

    @C09CT("conversation_id")
    public final String conversation_id;

    @C09CT("conversation_short_id")
    public final Long conversation_short_id;

    @C09CT("conversation_type")
    public final Integer conversation_type;

    @C09CT("participants")
    public final List<Long> participants;

    @Override // com.squareup.wire.Message
    public C0YMZ newBuilder() {
        C0YMZ c0ymz = new C0YMZ();
        c0ymz.LIZLLL = this.conversation_id;
        c0ymz.LJ = this.conversation_short_id;
        c0ymz.LJFF = this.conversation_type;
        c0ymz.LJI = C1516540pZE.LIZJ("participants", this.participants);
        c0ymz.LJII = C1516540pZE.LIZLLL("biz_ext", this.biz_ext);
        c0ymz.addUnknownFields(unknownFields());
        return c0ymz;
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
        List<Long> list = this.participants;
        if (list != null && !list.isEmpty()) {
            sb.append(", participants=");
            sb.append(this.participants);
        }
        Map<String, String> map = this.biz_ext;
        if (map != null && !map.isEmpty()) {
            sb.append(", biz_ext=");
            sb.append(this.biz_ext);
        }
        sb.replace(0, 2, "ConversationRemoveParticipantsRequestBody{");
        sb.append('}');
        return sb.toString();
    }

    public ConversationRemoveParticipantsRequestBody(String str, Long l, Integer num, List<Long> list, Map<String, String> map) {
        this(str, l, num, list, map, ByteString.EMPTY);
    }

    public ConversationRemoveParticipantsRequestBody(String str, Long l, Integer num, List<Long> list, Map<String, String> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_id = str;
        this.conversation_short_id = l;
        this.conversation_type = num;
        this.participants = C1516540pZE.LJFF("participants", list);
        this.biz_ext = C1516540pZE.LJI("biz_ext", map);
    }
}
