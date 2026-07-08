package com.bytedance.im.core.proto.status_message;

import X.C09CT;
import X.C2227141CEu;
import com.bytedance.im.core.proto.status_message.UpdateConversationSettingEntity;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class UpdateConversationSettingEntity extends Message<UpdateConversationSettingEntity, C2227141CEu> {
    public static final ProtoAdapter<UpdateConversationSettingEntity> ADAPTER = new ProtoAdapter<UpdateConversationSettingEntity>() { // from class: X.1CEt
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final UpdateConversationSettingEntity decode(ProtoReader protoReader) {
            C2227141CEu c2227141CEu = new C2227141CEu();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c2227141CEu.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c2227141CEu.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2227141CEu.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(UpdateConversationSettingEntity updateConversationSettingEntity) {
            UpdateConversationSettingEntity updateConversationSettingEntity2 = updateConversationSettingEntity;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, updateConversationSettingEntity2.conversation_id) + updateConversationSettingEntity2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final UpdateConversationSettingEntity redact(UpdateConversationSettingEntity updateConversationSettingEntity) {
            C2227141CEu c2227141CEuNewBuilder = updateConversationSettingEntity.newBuilder();
            c2227141CEuNewBuilder.clearUnknownFields();
            return c2227141CEuNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, UpdateConversationSettingEntity updateConversationSettingEntity) {
            UpdateConversationSettingEntity updateConversationSettingEntity2 = updateConversationSettingEntity;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, updateConversationSettingEntity2.conversation_id);
            protoWriter.writeBytes(updateConversationSettingEntity2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @C09CT("conversation_id")
    public final String conversation_id;

    @Override // com.squareup.wire.Message
    public C2227141CEu newBuilder() {
        C2227141CEu c2227141CEu = new C2227141CEu();
        c2227141CEu.LIZLLL = this.conversation_id;
        c2227141CEu.addUnknownFields(unknownFields());
        return c2227141CEu;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.conversation_id != null) {
            sb.append(", conversation_id=");
            sb.append(this.conversation_id);
        }
        sb.replace(0, 2, "UpdateConversationSettingEntity{");
        sb.append('}');
        return sb.toString();
    }

    public UpdateConversationSettingEntity(String str) {
        this(str, ByteString.EMPTY);
    }

    public UpdateConversationSettingEntity(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_id = str;
    }
}
