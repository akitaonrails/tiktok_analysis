package com.bytedance.im.core.proto.status_message;

import X.C09CT;
import X.C877020Yaq;
import com.bytedance.im.core.proto.status_message.FirstMessageEntity;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public final class FirstMessageEntity extends Message<FirstMessageEntity, C877020Yaq> {
    public static final ProtoAdapter<FirstMessageEntity> ADAPTER = new ProtoAdapter<FirstMessageEntity>() { // from class: X.0Yap
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final FirstMessageEntity decode(ProtoReader protoReader) {
            C877020Yaq c877020Yaq = new C877020Yaq();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c877020Yaq.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c877020Yaq.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c877020Yaq.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(FirstMessageEntity firstMessageEntity) {
            FirstMessageEntity firstMessageEntity2 = firstMessageEntity;
            return ProtoAdapter.INT64.encodedSizeWithTag(1, firstMessageEntity2.conversation_short_id) + firstMessageEntity2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final FirstMessageEntity redact(FirstMessageEntity firstMessageEntity) {
            C877020Yaq c877020YaqNewBuilder = firstMessageEntity.newBuilder();
            c877020YaqNewBuilder.clearUnknownFields();
            return c877020YaqNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, FirstMessageEntity firstMessageEntity) {
            FirstMessageEntity firstMessageEntity2 = firstMessageEntity;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, firstMessageEntity2.conversation_short_id);
            protoWriter.writeBytes(firstMessageEntity2.unknownFields());
        }
    };
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final long serialVersionUID = 0;

    @C09CT("conversation_short_id")
    public final Long conversation_short_id;

    @Override // com.squareup.wire.Message
    public C877020Yaq newBuilder() {
        C877020Yaq c877020Yaq = new C877020Yaq();
        c877020Yaq.LIZLLL = this.conversation_short_id;
        c877020Yaq.addUnknownFields(unknownFields());
        return c877020Yaq;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.conversation_short_id != null) {
            sb.append(", conversation_short_id=");
            sb.append(this.conversation_short_id);
        }
        sb.replace(0, 2, "FirstMessageEntity{");
        sb.append('}');
        return sb.toString();
    }

    public FirstMessageEntity(Long l) {
        this(l, ByteString.EMPTY);
    }

    public FirstMessageEntity(Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_short_id = l;
    }
}
