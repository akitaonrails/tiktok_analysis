package com.bytedance.im.core.proto;

import X.C09CT;
import X.C0Y2G;
import com.bytedance.im.core.proto.DeleteStrangerConversationRequestBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public final class DeleteStrangerConversationRequestBody extends Message<DeleteStrangerConversationRequestBody, C0Y2G> {
    public static final ProtoAdapter<DeleteStrangerConversationRequestBody> ADAPTER = new ProtoAdapter<DeleteStrangerConversationRequestBody>() { // from class: X.0Y2d
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final DeleteStrangerConversationRequestBody decode(ProtoReader protoReader) {
            C0Y2G c0y2g = new C0Y2G();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c0y2g.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c0y2g.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c0y2g.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(DeleteStrangerConversationRequestBody deleteStrangerConversationRequestBody) {
            DeleteStrangerConversationRequestBody deleteStrangerConversationRequestBody2 = deleteStrangerConversationRequestBody;
            return ProtoAdapter.INT64.encodedSizeWithTag(1, deleteStrangerConversationRequestBody2.conversation_short_id) + deleteStrangerConversationRequestBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, DeleteStrangerConversationRequestBody deleteStrangerConversationRequestBody) {
            DeleteStrangerConversationRequestBody deleteStrangerConversationRequestBody2 = deleteStrangerConversationRequestBody;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, deleteStrangerConversationRequestBody2.conversation_short_id);
            protoWriter.writeBytes(deleteStrangerConversationRequestBody2.unknownFields());
        }
    };
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final long serialVersionUID = 0;

    @C09CT("conversation_short_id")
    public final Long conversation_short_id;

    @Override // com.squareup.wire.Message
    public C0Y2G newBuilder() {
        C0Y2G c0y2g = new C0Y2G();
        c0y2g.LIZLLL = this.conversation_short_id;
        c0y2g.addUnknownFields(unknownFields());
        return c0y2g;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.conversation_short_id != null) {
            sb.append(", conversation_short_id=");
            sb.append(this.conversation_short_id);
        }
        sb.replace(0, 2, "DeleteStrangerConversationRequestBody{");
        sb.append('}');
        return sb.toString();
    }

    public DeleteStrangerConversationRequestBody(Long l) {
        this(l, ByteString.EMPTY);
    }

    public DeleteStrangerConversationRequestBody(Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_short_id = l;
    }
}
