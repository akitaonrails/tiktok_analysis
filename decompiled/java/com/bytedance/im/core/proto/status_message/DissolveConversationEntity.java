package com.bytedance.im.core.proto.status_message;

import X.C09CT;
import X.C877000Yao;
import com.bytedance.im.core.proto.status_message.DissolveConversationEntity;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public final class DissolveConversationEntity extends Message<DissolveConversationEntity, C877000Yao> {
    public static final ProtoAdapter<DissolveConversationEntity> ADAPTER = new ProtoAdapter<DissolveConversationEntity>() { // from class: X.0Yan
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final DissolveConversationEntity decode(ProtoReader protoReader) {
            C877000Yao c877000Yao = new C877000Yao();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c877000Yao.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c877000Yao.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c877000Yao.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(DissolveConversationEntity dissolveConversationEntity) {
            DissolveConversationEntity dissolveConversationEntity2 = dissolveConversationEntity;
            return ProtoAdapter.INT64.encodedSizeWithTag(1, dissolveConversationEntity2.conversation_short_id) + dissolveConversationEntity2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final DissolveConversationEntity redact(DissolveConversationEntity dissolveConversationEntity) {
            C877000Yao c877000YaoNewBuilder = dissolveConversationEntity.newBuilder();
            c877000YaoNewBuilder.clearUnknownFields();
            return c877000YaoNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, DissolveConversationEntity dissolveConversationEntity) {
            DissolveConversationEntity dissolveConversationEntity2 = dissolveConversationEntity;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, dissolveConversationEntity2.conversation_short_id);
            protoWriter.writeBytes(dissolveConversationEntity2.unknownFields());
        }
    };
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final long serialVersionUID = 0;

    @C09CT("conversation_short_id")
    public final Long conversation_short_id;

    @Override // com.squareup.wire.Message
    public C877000Yao newBuilder() {
        C877000Yao c877000Yao = new C877000Yao();
        c877000Yao.LIZLLL = this.conversation_short_id;
        c877000Yao.addUnknownFields(unknownFields());
        return c877000Yao;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.conversation_short_id != null) {
            sb.append(", conversation_short_id=");
            sb.append(this.conversation_short_id);
        }
        sb.replace(0, 2, "DissolveConversationEntity{");
        sb.append('}');
        return sb.toString();
    }

    public DissolveConversationEntity(Long l) {
        this(l, ByteString.EMPTY);
    }

    public DissolveConversationEntity(Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_short_id = l;
    }
}
