package com.bytedance.im.core.proto.status_message;

import X.C09CT;
import X.C2227101CEq;
import com.bytedance.im.core.proto.status_message.DeleteConversationEntity;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class DeleteConversationEntity extends Message<DeleteConversationEntity, C2227101CEq> {
    public static final ProtoAdapter<DeleteConversationEntity> ADAPTER = new ProtoAdapter<DeleteConversationEntity>() { // from class: X.1CEp
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final DeleteConversationEntity decode(ProtoReader protoReader) {
            C2227101CEq c2227101CEq = new C2227101CEq();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c2227101CEq.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c2227101CEq.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2227101CEq.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(DeleteConversationEntity deleteConversationEntity) {
            DeleteConversationEntity deleteConversationEntity2 = deleteConversationEntity;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, deleteConversationEntity2.conversation_id) + deleteConversationEntity2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final DeleteConversationEntity redact(DeleteConversationEntity deleteConversationEntity) {
            C2227101CEq c2227101CEqNewBuilder = deleteConversationEntity.newBuilder();
            c2227101CEqNewBuilder.clearUnknownFields();
            return c2227101CEqNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, DeleteConversationEntity deleteConversationEntity) {
            DeleteConversationEntity deleteConversationEntity2 = deleteConversationEntity;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, deleteConversationEntity2.conversation_id);
            protoWriter.writeBytes(deleteConversationEntity2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @C09CT("conversation_id")
    public final String conversation_id;

    @Override // com.squareup.wire.Message
    public C2227101CEq newBuilder() {
        C2227101CEq c2227101CEq = new C2227101CEq();
        c2227101CEq.LIZLLL = this.conversation_id;
        c2227101CEq.addUnknownFields(unknownFields());
        return c2227101CEq;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.conversation_id != null) {
            sb.append(", conversation_id=");
            sb.append(this.conversation_id);
        }
        sb.replace(0, 2, "DeleteConversationEntity{");
        sb.append('}');
        return sb.toString();
    }

    public DeleteConversationEntity(String str) {
        this(str, ByteString.EMPTY);
    }

    public DeleteConversationEntity(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_id = str;
    }
}
