package com.bytedance.im.core.proto;

import X.C09CT;
import X.C0YD5;
import X.C1516540pZE;
import com.bytedance.im.core.proto.BatchGetMessagesRequestBody;
import com.bytedance.im.core.proto.MessageKey;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public final class BatchGetMessagesRequestBody extends Message<BatchGetMessagesRequestBody, C0YD5> {
    public static final ProtoAdapter<BatchGetMessagesRequestBody> ADAPTER = new ProtoAdapter<BatchGetMessagesRequestBody>() { // from class: X.0YD2
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final BatchGetMessagesRequestBody decode(ProtoReader protoReader) {
            C0YD5 c0yd5 = new C0YD5();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c0yd5.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c0yd5.LIZLLL.add(MessageKey.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c0yd5.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(BatchGetMessagesRequestBody batchGetMessagesRequestBody) {
            BatchGetMessagesRequestBody batchGetMessagesRequestBody2 = batchGetMessagesRequestBody;
            return MessageKey.ADAPTER.asRepeated().encodedSizeWithTag(1, batchGetMessagesRequestBody2.keys) + batchGetMessagesRequestBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, BatchGetMessagesRequestBody batchGetMessagesRequestBody) {
            BatchGetMessagesRequestBody batchGetMessagesRequestBody2 = batchGetMessagesRequestBody;
            MessageKey.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, batchGetMessagesRequestBody2.keys);
            protoWriter.writeBytes(batchGetMessagesRequestBody2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @C09CT("keys")
    public final List<MessageKey> keys;

    @Override // com.squareup.wire.Message
    public C0YD5 newBuilder() {
        C0YD5 c0yd5 = new C0YD5();
        c0yd5.LIZLLL = C1516540pZE.LIZJ("keys", this.keys);
        c0yd5.addUnknownFields(unknownFields());
        return c0yd5;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<MessageKey> list = this.keys;
        if (list != null && !list.isEmpty()) {
            sb.append(", keys=");
            sb.append(this.keys);
        }
        sb.replace(0, 2, "BatchGetMessagesRequestBody{");
        sb.append('}');
        return sb.toString();
    }

    public BatchGetMessagesRequestBody(List<MessageKey> list) {
        this(list, ByteString.EMPTY);
    }

    public BatchGetMessagesRequestBody(List<MessageKey> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.keys = C1516540pZE.LJFF("keys", list);
    }
}
