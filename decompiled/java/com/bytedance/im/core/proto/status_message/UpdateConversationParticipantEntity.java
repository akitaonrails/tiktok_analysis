package com.bytedance.im.core.proto.status_message;

import X.C09CT;
import X.C1CPF;
import com.bytedance.im.core.proto.status_message.UpdateConversationParticipantEntity;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class UpdateConversationParticipantEntity extends Message<UpdateConversationParticipantEntity, C1CPF> {
    public static final ProtoAdapter<UpdateConversationParticipantEntity> ADAPTER = new ProtoAdapter<UpdateConversationParticipantEntity>() { // from class: X.1CPE
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final UpdateConversationParticipantEntity decode(ProtoReader protoReader) {
            C1CPF c1cpf = new C1CPF();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c1cpf.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c1cpf.LJ = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c1cpf.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cpf.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(UpdateConversationParticipantEntity updateConversationParticipantEntity) {
            UpdateConversationParticipantEntity updateConversationParticipantEntity2 = updateConversationParticipantEntity;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, updateConversationParticipantEntity2.conversation_id) + ProtoAdapter.INT64.encodedSizeWithTag(2, updateConversationParticipantEntity2.version) + updateConversationParticipantEntity2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final UpdateConversationParticipantEntity redact(UpdateConversationParticipantEntity updateConversationParticipantEntity) {
            C1CPF c1cpfNewBuilder = updateConversationParticipantEntity.newBuilder();
            c1cpfNewBuilder.clearUnknownFields();
            return c1cpfNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, UpdateConversationParticipantEntity updateConversationParticipantEntity) {
            UpdateConversationParticipantEntity updateConversationParticipantEntity2 = updateConversationParticipantEntity;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, updateConversationParticipantEntity2.conversation_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, updateConversationParticipantEntity2.version);
            protoWriter.writeBytes(updateConversationParticipantEntity2.unknownFields());
        }
    };
    public static final Long DEFAULT_VERSION = 0L;
    public static final long serialVersionUID = 0;

    @C09CT("conversation_id")
    public final String conversation_id;

    @C09CT("version")
    public final Long version;

    @Override // com.squareup.wire.Message
    public C1CPF newBuilder() {
        C1CPF c1cpf = new C1CPF();
        c1cpf.LIZLLL = this.conversation_id;
        c1cpf.LJ = this.version;
        c1cpf.addUnknownFields(unknownFields());
        return c1cpf;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.conversation_id != null) {
            sb.append(", conversation_id=");
            sb.append(this.conversation_id);
        }
        if (this.version != null) {
            sb.append(", version=");
            sb.append(this.version);
        }
        sb.replace(0, 2, "UpdateConversationParticipantEntity{");
        sb.append('}');
        return sb.toString();
    }

    public UpdateConversationParticipantEntity(String str, Long l) {
        this(str, l, ByteString.EMPTY);
    }

    public UpdateConversationParticipantEntity(String str, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_id = str;
        this.version = l;
    }
}
