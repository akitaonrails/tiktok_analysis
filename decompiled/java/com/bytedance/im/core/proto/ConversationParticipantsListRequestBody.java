package com.bytedance.im.core.proto;

import X.C09CT;
import X.C0Y1K;
import X.C1516540pZE;
import com.bytedance.im.core.proto.ConversationParticipantsListRequestBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.Map;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public final class ConversationParticipantsListRequestBody extends Message<ConversationParticipantsListRequestBody, C0Y1K> {
    public static final ProtoAdapter<ConversationParticipantsListRequestBody> ADAPTER = new ProtoAdapter<ConversationParticipantsListRequestBody>() { // from class: X.0Y2l
        public final ProtoAdapter<Map<String, String>> LIZ;

        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.LIZ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final ConversationParticipantsListRequestBody decode(ProtoReader protoReader) {
            C0Y1K c0y1k = new C0Y1K();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c0y1k.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c0y1k.LJ = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 3:
                            c0y1k.LJFF = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 4:
                            c0y1k.LJI = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 5:
                            c0y1k.LJII = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 6:
                            c0y1k.LJIIIIZZ.putAll(this.LIZ.decode(protoReader));
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c0y1k.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c0y1k.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(ConversationParticipantsListRequestBody conversationParticipantsListRequestBody) {
            ConversationParticipantsListRequestBody conversationParticipantsListRequestBody2 = conversationParticipantsListRequestBody;
            int iEncodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, conversationParticipantsListRequestBody2.conversation_id);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, conversationParticipantsListRequestBody2.conversation_short_id);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            return iEncodedSizeWithTag2 + protoAdapter2.encodedSizeWithTag(3, conversationParticipantsListRequestBody2.conversation_type) + protoAdapter.encodedSizeWithTag(4, conversationParticipantsListRequestBody2.cursor) + protoAdapter2.encodedSizeWithTag(5, conversationParticipantsListRequestBody2.limit) + this.LIZ.encodedSizeWithTag(6, conversationParticipantsListRequestBody2.ext) + conversationParticipantsListRequestBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, ConversationParticipantsListRequestBody conversationParticipantsListRequestBody) {
            ConversationParticipantsListRequestBody conversationParticipantsListRequestBody2 = conversationParticipantsListRequestBody;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, conversationParticipantsListRequestBody2.conversation_id);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 2, conversationParticipantsListRequestBody2.conversation_short_id);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            protoAdapter2.encodeWithTag(protoWriter, 3, conversationParticipantsListRequestBody2.conversation_type);
            protoAdapter.encodeWithTag(protoWriter, 4, conversationParticipantsListRequestBody2.cursor);
            protoAdapter2.encodeWithTag(protoWriter, 5, conversationParticipantsListRequestBody2.limit);
            this.LIZ.encodeWithTag(protoWriter, 6, conversationParticipantsListRequestBody2.ext);
            protoWriter.writeBytes(conversationParticipantsListRequestBody2.unknownFields());
        }
    };
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;
    public static final Long DEFAULT_CURSOR = 0L;
    public static final Integer DEFAULT_LIMIT = 100;
    public static final long serialVersionUID = 0;

    @C09CT("conversation_id")
    public final String conversation_id;

    @C09CT("conversation_short_id")
    public final Long conversation_short_id;

    @C09CT("conversation_type")
    public final Integer conversation_type;

    @C09CT("cursor")
    public final Long cursor;

    @C09CT("ext")
    public final Map<String, String> ext;

    @C09CT("limit")
    public final Integer limit;

    @Override // com.squareup.wire.Message
    public C0Y1K newBuilder() {
        C0Y1K c0y1k = new C0Y1K();
        c0y1k.LIZLLL = this.conversation_id;
        c0y1k.LJ = this.conversation_short_id;
        c0y1k.LJFF = this.conversation_type;
        c0y1k.LJI = this.cursor;
        c0y1k.LJII = this.limit;
        c0y1k.LJIIIIZZ = C1516540pZE.LIZLLL("ext", this.ext);
        c0y1k.addUnknownFields(unknownFields());
        return c0y1k;
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
        if (this.cursor != null) {
            sb.append(", cursor=");
            sb.append(this.cursor);
        }
        if (this.limit != null) {
            sb.append(", limit=");
            sb.append(this.limit);
        }
        Map<String, String> map = this.ext;
        if (map != null && !map.isEmpty()) {
            sb.append(", ext=");
            sb.append(this.ext);
        }
        sb.replace(0, 2, "ConversationParticipantsListRequestBody{");
        sb.append('}');
        return sb.toString();
    }

    public ConversationParticipantsListRequestBody(String str, Long l, Integer num, Long l2, Integer num2, Map<String, String> map) {
        this(str, l, num, l2, num2, map, ByteString.EMPTY);
    }

    public ConversationParticipantsListRequestBody(String str, Long l, Integer num, Long l2, Integer num2, Map<String, String> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_id = str;
        this.conversation_short_id = l;
        this.conversation_type = num;
        this.cursor = l2;
        this.limit = num2;
        this.ext = C1516540pZE.LJI("ext", map);
    }
}
