package com.bytedance.im.core.proto;

import X.C09CT;
import X.C1516540pZE;
import X.C867990Y3h;
import com.bytedance.im.core.proto.BatchUpdateConversationParticipantRequestBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import java.util.Map;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public final class BatchUpdateConversationParticipantRequestBody extends Message<BatchUpdateConversationParticipantRequestBody, C867990Y3h> {
    public static final ProtoAdapter<BatchUpdateConversationParticipantRequestBody> ADAPTER = new ProtoAdapter<BatchUpdateConversationParticipantRequestBody>() { // from class: X.0Y3i
        public final ProtoAdapter<Map<String, String>> LIZ;

        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.LIZ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final BatchUpdateConversationParticipantRequestBody decode(ProtoReader protoReader) {
            C867990Y3h c867990Y3h = new C867990Y3h();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c867990Y3h.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c867990Y3h.LJ = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 3:
                            c867990Y3h.LJFF = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 4:
                            c867990Y3h.LJI.add(ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 5:
                            c867990Y3h.LJII = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 6:
                            c867990Y3h.LJIIIIZZ.putAll(this.LIZ.decode(protoReader));
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c867990Y3h.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c867990Y3h.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(BatchUpdateConversationParticipantRequestBody batchUpdateConversationParticipantRequestBody) {
            BatchUpdateConversationParticipantRequestBody batchUpdateConversationParticipantRequestBody2 = batchUpdateConversationParticipantRequestBody;
            int iEncodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, batchUpdateConversationParticipantRequestBody2.conversation_id);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, batchUpdateConversationParticipantRequestBody2.conversation_short_id);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            return iEncodedSizeWithTag2 + protoAdapter2.encodedSizeWithTag(3, batchUpdateConversationParticipantRequestBody2.conversation_type) + protoAdapter.asRepeated().encodedSizeWithTag(4, batchUpdateConversationParticipantRequestBody2.participants) + protoAdapter2.encodedSizeWithTag(5, batchUpdateConversationParticipantRequestBody2.role) + this.LIZ.encodedSizeWithTag(6, batchUpdateConversationParticipantRequestBody2.biz_ext) + batchUpdateConversationParticipantRequestBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, BatchUpdateConversationParticipantRequestBody batchUpdateConversationParticipantRequestBody) {
            BatchUpdateConversationParticipantRequestBody batchUpdateConversationParticipantRequestBody2 = batchUpdateConversationParticipantRequestBody;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, batchUpdateConversationParticipantRequestBody2.conversation_id);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 2, batchUpdateConversationParticipantRequestBody2.conversation_short_id);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            protoAdapter2.encodeWithTag(protoWriter, 3, batchUpdateConversationParticipantRequestBody2.conversation_type);
            protoAdapter.asRepeated().encodeWithTag(protoWriter, 4, batchUpdateConversationParticipantRequestBody2.participants);
            protoAdapter2.encodeWithTag(protoWriter, 5, batchUpdateConversationParticipantRequestBody2.role);
            this.LIZ.encodeWithTag(protoWriter, 6, batchUpdateConversationParticipantRequestBody2.biz_ext);
            protoWriter.writeBytes(batchUpdateConversationParticipantRequestBody2.unknownFields());
        }
    };
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;
    public static final Integer DEFAULT_ROLE = 0;
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

    @C09CT("role")
    public final Integer role;

    @Override // com.squareup.wire.Message
    public C867990Y3h newBuilder() {
        C867990Y3h c867990Y3h = new C867990Y3h();
        c867990Y3h.LIZLLL = this.conversation_id;
        c867990Y3h.LJ = this.conversation_short_id;
        c867990Y3h.LJFF = this.conversation_type;
        c867990Y3h.LJI = C1516540pZE.LIZJ("participants", this.participants);
        c867990Y3h.LJII = this.role;
        c867990Y3h.LJIIIIZZ = C1516540pZE.LIZLLL("biz_ext", this.biz_ext);
        c867990Y3h.addUnknownFields(unknownFields());
        return c867990Y3h;
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
        if (this.role != null) {
            sb.append(", role=");
            sb.append(this.role);
        }
        Map<String, String> map = this.biz_ext;
        if (map != null && !map.isEmpty()) {
            sb.append(", biz_ext=");
            sb.append(this.biz_ext);
        }
        sb.replace(0, 2, "BatchUpdateConversationParticipantRequestBody{");
        sb.append('}');
        return sb.toString();
    }

    public BatchUpdateConversationParticipantRequestBody(String str, Long l, Integer num, List<Long> list, Integer num2, Map<String, String> map) {
        this(str, l, num, list, num2, map, ByteString.EMPTY);
    }

    public BatchUpdateConversationParticipantRequestBody(String str, Long l, Integer num, List<Long> list, Integer num2, Map<String, String> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_id = str;
        this.conversation_short_id = l;
        this.conversation_type = num;
        this.participants = C1516540pZE.LJFF("participants", list);
        this.role = num2;
        this.biz_ext = C1516540pZE.LJI("biz_ext", map);
    }
}
