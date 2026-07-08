package com.bytedance.im.core.proto.status_message;

import X.C09CT;
import X.C2237931CiV;
import com.bytedance.im.core.proto.status_message.MarkConversationReadEntity;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class MarkConversationReadEntity extends Message<MarkConversationReadEntity, C2237931CiV> {
    public static final ProtoAdapter<MarkConversationReadEntity> ADAPTER = new ProtoAdapter<MarkConversationReadEntity>() { // from class: X.1CiU
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final MarkConversationReadEntity decode(ProtoReader protoReader) {
            C2237931CiV c2237931CiV = new C2237931CiV();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2237931CiV.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c2237931CiV.LJ = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c2237931CiV.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2237931CiV.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(MarkConversationReadEntity markConversationReadEntity) {
            MarkConversationReadEntity markConversationReadEntity2 = markConversationReadEntity;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            return protoAdapter.encodedSizeWithTag(1, markConversationReadEntity2.conversation_short_id) + protoAdapter.encodedSizeWithTag(2, markConversationReadEntity2.user_id) + markConversationReadEntity2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final MarkConversationReadEntity redact(MarkConversationReadEntity markConversationReadEntity) {
            C2237931CiV c2237931CiVNewBuilder = markConversationReadEntity.newBuilder();
            c2237931CiVNewBuilder.clearUnknownFields();
            return c2237931CiVNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, MarkConversationReadEntity markConversationReadEntity) {
            MarkConversationReadEntity markConversationReadEntity2 = markConversationReadEntity;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 1, markConversationReadEntity2.conversation_short_id);
            protoAdapter.encodeWithTag(protoWriter, 2, markConversationReadEntity2.user_id);
            protoWriter.writeBytes(markConversationReadEntity2.unknownFields());
        }
    };
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final Long DEFAULT_USER_ID = 0L;
    public static final long serialVersionUID = 0;

    @C09CT("conversation_short_id")
    public final Long conversation_short_id;

    @C09CT("user_id")
    public final Long user_id;

    @Override // com.squareup.wire.Message
    public C2237931CiV newBuilder() {
        C2237931CiV c2237931CiV = new C2237931CiV();
        c2237931CiV.LIZLLL = this.conversation_short_id;
        c2237931CiV.LJ = this.user_id;
        c2237931CiV.addUnknownFields(unknownFields());
        return c2237931CiV;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.conversation_short_id != null) {
            sb.append(", conversation_short_id=");
            sb.append(this.conversation_short_id);
        }
        if (this.user_id != null) {
            sb.append(", user_id=");
            sb.append(this.user_id);
        }
        sb.replace(0, 2, "MarkConversationReadEntity{");
        sb.append('}');
        return sb.toString();
    }

    public MarkConversationReadEntity(Long l, Long l2) {
        this(l, l2, ByteString.EMPTY);
    }

    public MarkConversationReadEntity(Long l, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_short_id = l;
        this.user_id = l2;
    }
}
