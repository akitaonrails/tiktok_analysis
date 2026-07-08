package com.bytedance.im.core.proto;

import X.C09CT;
import X.C1516540pZE;
import X.C873250YNn;
import com.bytedance.im.core.proto.ConversationAddParticipantsRequestBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import java.util.Map;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public final class ConversationAddParticipantsRequestBody extends Message<ConversationAddParticipantsRequestBody, C873250YNn> {
    public static final ProtoAdapter<ConversationAddParticipantsRequestBody> ADAPTER = new ProtoAdapter<ConversationAddParticipantsRequestBody>() { // from class: X.0YNo
        public final ProtoAdapter<Map<String, String>> LIZ;

        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.LIZ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final ConversationAddParticipantsRequestBody decode(ProtoReader protoReader) {
            C873250YNn c873250YNn = new C873250YNn();
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
                                        c873250YNn.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                    } else {
                                        c873250YNn.LJII.putAll(this.LIZ.decode(protoReader));
                                    }
                                } else {
                                    c873250YNn.LJI.add(ProtoAdapter.INT64.decode(protoReader));
                                }
                            } else {
                                c873250YNn.LJFF = ProtoAdapter.INT32.decode(protoReader);
                            }
                        } else {
                            c873250YNn.LJ = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c873250YNn.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c873250YNn.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(ConversationAddParticipantsRequestBody conversationAddParticipantsRequestBody) {
            ConversationAddParticipantsRequestBody conversationAddParticipantsRequestBody2 = conversationAddParticipantsRequestBody;
            int iEncodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, conversationAddParticipantsRequestBody2.conversation_id);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, conversationAddParticipantsRequestBody2.conversation_short_id) + ProtoAdapter.INT32.encodedSizeWithTag(3, conversationAddParticipantsRequestBody2.conversation_type) + protoAdapter.asRepeated().encodedSizeWithTag(4, conversationAddParticipantsRequestBody2.participants) + this.LIZ.encodedSizeWithTag(5, conversationAddParticipantsRequestBody2.biz_ext) + conversationAddParticipantsRequestBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, ConversationAddParticipantsRequestBody conversationAddParticipantsRequestBody) {
            ConversationAddParticipantsRequestBody conversationAddParticipantsRequestBody2 = conversationAddParticipantsRequestBody;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, conversationAddParticipantsRequestBody2.conversation_id);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 2, conversationAddParticipantsRequestBody2.conversation_short_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, conversationAddParticipantsRequestBody2.conversation_type);
            protoAdapter.asRepeated().encodeWithTag(protoWriter, 4, conversationAddParticipantsRequestBody2.participants);
            this.LIZ.encodeWithTag(protoWriter, 5, conversationAddParticipantsRequestBody2.biz_ext);
            protoWriter.writeBytes(conversationAddParticipantsRequestBody2.unknownFields());
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
    public C873250YNn newBuilder() {
        C873250YNn c873250YNn = new C873250YNn();
        c873250YNn.LIZLLL = this.conversation_id;
        c873250YNn.LJ = this.conversation_short_id;
        c873250YNn.LJFF = this.conversation_type;
        c873250YNn.LJI = C1516540pZE.LIZJ("participants", this.participants);
        c873250YNn.LJII = C1516540pZE.LIZLLL("biz_ext", this.biz_ext);
        c873250YNn.addUnknownFields(unknownFields());
        return c873250YNn;
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
        sb.replace(0, 2, "ConversationAddParticipantsRequestBody{");
        sb.append('}');
        return sb.toString();
    }

    public ConversationAddParticipantsRequestBody(String str, Long l, Integer num, List<Long> list, Map<String, String> map) {
        this(str, l, num, list, map, ByteString.EMPTY);
    }

    public ConversationAddParticipantsRequestBody(String str, Long l, Integer num, List<Long> list, Map<String, String> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_id = str;
        this.conversation_short_id = l;
        this.conversation_type = num;
        this.participants = C1516540pZE.LJFF("participants", list);
        this.biz_ext = C1516540pZE.LJI("biz_ext", map);
    }
}
