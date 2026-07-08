package com.bytedance.im.core.proto;

import X.C09CT;
import X.C0Y2F;
import com.bytedance.im.core.proto.DeleteConversationRequestBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public final class DeleteConversationRequestBody extends Message<DeleteConversationRequestBody, C0Y2F> {
    public static final long serialVersionUID = 0;

    @C09CT("badge_count")
    public final Integer badge_count;

    @C09CT("conversation_id")
    public final String conversation_id;

    @C09CT("conversation_short_id")
    public final Long conversation_short_id;

    @C09CT("conversation_type")
    public final Integer conversation_type;

    @C09CT("last_message_index")
    public final Long last_message_index;

    @C09CT("last_message_index_v2")
    public final Long last_message_index_v2;
    public static final ProtoAdapter<DeleteConversationRequestBody> ADAPTER = new ProtoAdapter<DeleteConversationRequestBody>() { // from class: X.0Y2a
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final DeleteConversationRequestBody decode(ProtoReader protoReader) {
            C0Y2F c0y2f = new C0Y2F();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c0y2f.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c0y2f.LJ = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 3:
                            c0y2f.LJFF = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 4:
                            c0y2f.LJI = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 5:
                            c0y2f.LJII = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 6:
                            c0y2f.LJIIIIZZ = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c0y2f.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c0y2f.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(DeleteConversationRequestBody deleteConversationRequestBody) {
            DeleteConversationRequestBody deleteConversationRequestBody2 = deleteConversationRequestBody;
            int iEncodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, deleteConversationRequestBody2.conversation_id);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, deleteConversationRequestBody2.conversation_short_id);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            return iEncodedSizeWithTag2 + protoAdapter2.encodedSizeWithTag(3, deleteConversationRequestBody2.conversation_type) + protoAdapter.encodedSizeWithTag(4, deleteConversationRequestBody2.last_message_index) + protoAdapter.encodedSizeWithTag(5, deleteConversationRequestBody2.last_message_index_v2) + protoAdapter2.encodedSizeWithTag(6, deleteConversationRequestBody2.badge_count) + deleteConversationRequestBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, DeleteConversationRequestBody deleteConversationRequestBody) {
            DeleteConversationRequestBody deleteConversationRequestBody2 = deleteConversationRequestBody;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, deleteConversationRequestBody2.conversation_id);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 2, deleteConversationRequestBody2.conversation_short_id);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            protoAdapter2.encodeWithTag(protoWriter, 3, deleteConversationRequestBody2.conversation_type);
            protoAdapter.encodeWithTag(protoWriter, 4, deleteConversationRequestBody2.last_message_index);
            protoAdapter.encodeWithTag(protoWriter, 5, deleteConversationRequestBody2.last_message_index_v2);
            protoAdapter2.encodeWithTag(protoWriter, 6, deleteConversationRequestBody2.badge_count);
            protoWriter.writeBytes(deleteConversationRequestBody2.unknownFields());
        }
    };
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;
    public static final Long DEFAULT_LAST_MESSAGE_INDEX = 0L;
    public static final Long DEFAULT_LAST_MESSAGE_INDEX_V2 = 0L;
    public static final Integer DEFAULT_BADGE_COUNT = 0;

    @Override // com.squareup.wire.Message
    public C0Y2F newBuilder() {
        C0Y2F c0y2f = new C0Y2F();
        c0y2f.LIZLLL = this.conversation_id;
        c0y2f.LJ = this.conversation_short_id;
        c0y2f.LJFF = this.conversation_type;
        c0y2f.LJI = this.last_message_index;
        c0y2f.LJII = this.last_message_index_v2;
        c0y2f.LJIIIIZZ = this.badge_count;
        c0y2f.addUnknownFields(unknownFields());
        return c0y2f;
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
        if (this.last_message_index != null) {
            sb.append(", last_message_index=");
            sb.append(this.last_message_index);
        }
        if (this.last_message_index_v2 != null) {
            sb.append(", last_message_index_v2=");
            sb.append(this.last_message_index_v2);
        }
        if (this.badge_count != null) {
            sb.append(", badge_count=");
            sb.append(this.badge_count);
        }
        sb.replace(0, 2, "DeleteConversationRequestBody{");
        sb.append('}');
        return sb.toString();
    }

    public DeleteConversationRequestBody(String str, Long l, Integer num, Long l2, Long l3, Integer num2) {
        this(str, l, num, l2, l3, num2, ByteString.EMPTY);
    }

    public DeleteConversationRequestBody(String str, Long l, Integer num, Long l2, Long l3, Integer num2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_id = str;
        this.conversation_short_id = l;
        this.conversation_type = num;
        this.last_message_index = l2;
        this.last_message_index_v2 = l3;
        this.badge_count = num2;
    }
}
