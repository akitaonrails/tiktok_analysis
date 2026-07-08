package com.bytedance.im.core.proto.status_message;

import X.C09CT;
import X.C877060Yau;
import com.bytedance.im.core.proto.status_message.RecallMessageEntity;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public final class RecallMessageEntity extends Message<RecallMessageEntity, C877060Yau> {
    public static final ProtoAdapter<RecallMessageEntity> ADAPTER = new ProtoAdapter<RecallMessageEntity>() { // from class: X.0Yat
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final RecallMessageEntity decode(ProtoReader protoReader) {
            C877060Yau c877060Yau = new C877060Yau();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c877060Yau.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c877060Yau.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c877060Yau.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(RecallMessageEntity recallMessageEntity) {
            RecallMessageEntity recallMessageEntity2 = recallMessageEntity;
            return ProtoAdapter.INT64.encodedSizeWithTag(1, recallMessageEntity2.server_message_id) + recallMessageEntity2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final RecallMessageEntity redact(RecallMessageEntity recallMessageEntity) {
            C877060Yau c877060YauNewBuilder = recallMessageEntity.newBuilder();
            c877060YauNewBuilder.clearUnknownFields();
            return c877060YauNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, RecallMessageEntity recallMessageEntity) {
            RecallMessageEntity recallMessageEntity2 = recallMessageEntity;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, recallMessageEntity2.server_message_id);
            protoWriter.writeBytes(recallMessageEntity2.unknownFields());
        }
    };
    public static final Long DEFAULT_SERVER_MESSAGE_ID = 0L;
    public static final long serialVersionUID = 0;

    @C09CT("server_message_id")
    public final Long server_message_id;

    @Override // com.squareup.wire.Message
    public C877060Yau newBuilder() {
        C877060Yau c877060Yau = new C877060Yau();
        c877060Yau.LIZLLL = this.server_message_id;
        c877060Yau.addUnknownFields(unknownFields());
        return c877060Yau;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.server_message_id != null) {
            sb.append(", server_message_id=");
            sb.append(this.server_message_id);
        }
        sb.replace(0, 2, "RecallMessageEntity{");
        sb.append('}');
        return sb.toString();
    }

    public RecallMessageEntity(Long l) {
        this(l, ByteString.EMPTY);
    }

    public RecallMessageEntity(Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.server_message_id = l;
    }
}
