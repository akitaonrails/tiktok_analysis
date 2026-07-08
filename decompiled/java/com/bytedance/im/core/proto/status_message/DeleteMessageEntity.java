package com.bytedance.im.core.proto.status_message;

import X.C09CT;
import X.C0YW2;
import com.bytedance.im.core.proto.status_message.DeleteMessageEntity;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public final class DeleteMessageEntity extends Message<DeleteMessageEntity, C0YW2> {
    public static final ProtoAdapter<DeleteMessageEntity> ADAPTER = new ProtoAdapter<DeleteMessageEntity>() { // from class: X.0YW1
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final DeleteMessageEntity decode(ProtoReader protoReader) {
            C0YW2 c0yw2 = new C0YW2();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c0yw2.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c0yw2.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c0yw2.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(DeleteMessageEntity deleteMessageEntity) {
            DeleteMessageEntity deleteMessageEntity2 = deleteMessageEntity;
            return ProtoAdapter.INT64.encodedSizeWithTag(1, deleteMessageEntity2.message_id) + deleteMessageEntity2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final DeleteMessageEntity redact(DeleteMessageEntity deleteMessageEntity) {
            C0YW2 c0yw2NewBuilder = deleteMessageEntity.newBuilder();
            c0yw2NewBuilder.clearUnknownFields();
            return c0yw2NewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, DeleteMessageEntity deleteMessageEntity) {
            DeleteMessageEntity deleteMessageEntity2 = deleteMessageEntity;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, deleteMessageEntity2.message_id);
            protoWriter.writeBytes(deleteMessageEntity2.unknownFields());
        }
    };
    public static final Long DEFAULT_MESSAGE_ID = 0L;
    public static final long serialVersionUID = 0;

    @C09CT("message_id")
    public final Long message_id;

    @Override // com.squareup.wire.Message
    public C0YW2 newBuilder() {
        C0YW2 c0yw2 = new C0YW2();
        c0yw2.LIZLLL = this.message_id;
        c0yw2.addUnknownFields(unknownFields());
        return c0yw2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.message_id != null) {
            sb.append(", message_id=");
            sb.append(this.message_id);
        }
        sb.replace(0, 2, "DeleteMessageEntity{");
        sb.append('}');
        return sb.toString();
    }

    public DeleteMessageEntity(Long l) {
        this(l, ByteString.EMPTY);
    }

    public DeleteMessageEntity(Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.message_id = l;
    }
}
