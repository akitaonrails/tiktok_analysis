package com.bytedance.im.core.proto.status_message;

import X.C09CT;
import X.C2227121CEs;
import com.bytedance.im.core.proto.status_message.UpdateConversationCoreInfoEntity;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class UpdateConversationCoreInfoEntity extends Message<UpdateConversationCoreInfoEntity, C2227121CEs> {
    public static final ProtoAdapter<UpdateConversationCoreInfoEntity> ADAPTER = new ProtoAdapter<UpdateConversationCoreInfoEntity>() { // from class: X.1CEr
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final UpdateConversationCoreInfoEntity decode(ProtoReader protoReader) {
            C2227121CEs c2227121CEs = new C2227121CEs();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c2227121CEs.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c2227121CEs.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2227121CEs.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(UpdateConversationCoreInfoEntity updateConversationCoreInfoEntity) {
            UpdateConversationCoreInfoEntity updateConversationCoreInfoEntity2 = updateConversationCoreInfoEntity;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, updateConversationCoreInfoEntity2.conversation_id) + updateConversationCoreInfoEntity2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final UpdateConversationCoreInfoEntity redact(UpdateConversationCoreInfoEntity updateConversationCoreInfoEntity) {
            C2227121CEs c2227121CEsNewBuilder = updateConversationCoreInfoEntity.newBuilder();
            c2227121CEsNewBuilder.clearUnknownFields();
            return c2227121CEsNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, UpdateConversationCoreInfoEntity updateConversationCoreInfoEntity) {
            UpdateConversationCoreInfoEntity updateConversationCoreInfoEntity2 = updateConversationCoreInfoEntity;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, updateConversationCoreInfoEntity2.conversation_id);
            protoWriter.writeBytes(updateConversationCoreInfoEntity2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @C09CT("conversation_id")
    public final String conversation_id;

    @Override // com.squareup.wire.Message
    public C2227121CEs newBuilder() {
        C2227121CEs c2227121CEs = new C2227121CEs();
        c2227121CEs.LIZLLL = this.conversation_id;
        c2227121CEs.addUnknownFields(unknownFields());
        return c2227121CEs;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.conversation_id != null) {
            sb.append(", conversation_id=");
            sb.append(this.conversation_id);
        }
        sb.replace(0, 2, "UpdateConversationCoreInfoEntity{");
        sb.append('}');
        return sb.toString();
    }

    public UpdateConversationCoreInfoEntity(String str) {
        this(str, ByteString.EMPTY);
    }

    public UpdateConversationCoreInfoEntity(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_id = str;
    }
}
