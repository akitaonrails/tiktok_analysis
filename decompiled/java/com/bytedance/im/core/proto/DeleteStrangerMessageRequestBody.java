package com.bytedance.im.core.proto;

import X.C09CT;
import X.C0Y15;
import com.bytedance.im.core.proto.DeleteStrangerMessageRequestBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public final class DeleteStrangerMessageRequestBody extends Message<DeleteStrangerMessageRequestBody, C0Y15> {
    public static final long serialVersionUID = 0;

    @C09CT("conversation_short_id")
    public final Long conversation_short_id;

    @C09CT("server_message_id")
    public final Long server_message_id;
    public static final ProtoAdapter<DeleteStrangerMessageRequestBody> ADAPTER = new ProtoAdapter<DeleteStrangerMessageRequestBody>() { // from class: X.0Y2c
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final DeleteStrangerMessageRequestBody decode(ProtoReader protoReader) {
            C0Y15 c0y15 = new C0Y15();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c0y15.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c0y15.LJ = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c0y15.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c0y15.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(DeleteStrangerMessageRequestBody deleteStrangerMessageRequestBody) {
            DeleteStrangerMessageRequestBody deleteStrangerMessageRequestBody2 = deleteStrangerMessageRequestBody;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            return protoAdapter.encodedSizeWithTag(1, deleteStrangerMessageRequestBody2.server_message_id) + protoAdapter.encodedSizeWithTag(2, deleteStrangerMessageRequestBody2.conversation_short_id) + deleteStrangerMessageRequestBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, DeleteStrangerMessageRequestBody deleteStrangerMessageRequestBody) {
            DeleteStrangerMessageRequestBody deleteStrangerMessageRequestBody2 = deleteStrangerMessageRequestBody;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 1, deleteStrangerMessageRequestBody2.server_message_id);
            protoAdapter.encodeWithTag(protoWriter, 2, deleteStrangerMessageRequestBody2.conversation_short_id);
            protoWriter.writeBytes(deleteStrangerMessageRequestBody2.unknownFields());
        }
    };
    public static final Long DEFAULT_SERVER_MESSAGE_ID = 0L;
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;

    @Override // com.squareup.wire.Message
    public C0Y15 newBuilder() {
        C0Y15 c0y15 = new C0Y15();
        c0y15.LIZLLL = this.server_message_id;
        c0y15.LJ = this.conversation_short_id;
        c0y15.addUnknownFields(unknownFields());
        return c0y15;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.server_message_id != null) {
            sb.append(", server_message_id=");
            sb.append(this.server_message_id);
        }
        if (this.conversation_short_id != null) {
            sb.append(", conversation_short_id=");
            sb.append(this.conversation_short_id);
        }
        sb.replace(0, 2, "DeleteStrangerMessageRequestBody{");
        sb.append('}');
        return sb.toString();
    }

    public DeleteStrangerMessageRequestBody(Long l, Long l2) {
        this(l, l2, ByteString.EMPTY);
    }

    public DeleteStrangerMessageRequestBody(Long l, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.server_message_id = l;
        this.conversation_short_id = l2;
    }
}
