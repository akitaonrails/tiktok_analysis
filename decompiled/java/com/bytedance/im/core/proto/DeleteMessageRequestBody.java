package com.bytedance.im.core.proto;

import X.C09CT;
import X.C0Y14;
import com.bytedance.im.core.proto.DeleteMessageRequestBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public final class DeleteMessageRequestBody extends Message<DeleteMessageRequestBody, C0Y14> {
    public static final ProtoAdapter<DeleteMessageRequestBody> ADAPTER = new ProtoAdapter<DeleteMessageRequestBody>() { // from class: X.0Y2b
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final DeleteMessageRequestBody decode(ProtoReader protoReader) {
            C0Y14 c0y14 = new C0Y14();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                    c0y14.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                } else {
                                    c0y14.LJI = ProtoAdapter.INT64.decode(protoReader);
                                }
                            } else {
                                c0y14.LJFF = ProtoAdapter.INT32.decode(protoReader);
                            }
                        } else {
                            c0y14.LJ = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c0y14.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c0y14.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(DeleteMessageRequestBody deleteMessageRequestBody) {
            DeleteMessageRequestBody deleteMessageRequestBody2 = deleteMessageRequestBody;
            int iEncodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, deleteMessageRequestBody2.conversation_id);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, deleteMessageRequestBody2.conversation_short_id) + ProtoAdapter.INT32.encodedSizeWithTag(3, deleteMessageRequestBody2.conversation_type) + protoAdapter.encodedSizeWithTag(4, deleteMessageRequestBody2.message_id) + deleteMessageRequestBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, DeleteMessageRequestBody deleteMessageRequestBody) {
            DeleteMessageRequestBody deleteMessageRequestBody2 = deleteMessageRequestBody;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, deleteMessageRequestBody2.conversation_id);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 2, deleteMessageRequestBody2.conversation_short_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, deleteMessageRequestBody2.conversation_type);
            protoAdapter.encodeWithTag(protoWriter, 4, deleteMessageRequestBody2.message_id);
            protoWriter.writeBytes(deleteMessageRequestBody2.unknownFields());
        }
    };
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;
    public static final Long DEFAULT_MESSAGE_ID = 0L;
    public static final long serialVersionUID = 0;

    @C09CT("conversation_id")
    public final String conversation_id;

    @C09CT("conversation_short_id")
    public final Long conversation_short_id;

    @C09CT("conversation_type")
    public final Integer conversation_type;

    @C09CT("message_id")
    public final Long message_id;

    @Override // com.squareup.wire.Message
    public C0Y14 newBuilder() {
        C0Y14 c0y14 = new C0Y14();
        c0y14.LIZLLL = this.conversation_id;
        c0y14.LJ = this.conversation_short_id;
        c0y14.LJFF = this.conversation_type;
        c0y14.LJI = this.message_id;
        c0y14.addUnknownFields(unknownFields());
        return c0y14;
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
        if (this.message_id != null) {
            sb.append(", message_id=");
            sb.append(this.message_id);
        }
        sb.replace(0, 2, "DeleteMessageRequestBody{");
        sb.append('}');
        return sb.toString();
    }

    public DeleteMessageRequestBody(String str, Long l, Integer num, Long l2) {
        this(str, l, num, l2, ByteString.EMPTY);
    }

    public DeleteMessageRequestBody(String str, Long l, Integer num, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_id = str;
        this.conversation_short_id = l;
        this.conversation_type = num;
        this.message_id = l2;
    }
}
