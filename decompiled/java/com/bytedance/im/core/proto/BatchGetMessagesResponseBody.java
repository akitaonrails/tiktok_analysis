package com.bytedance.im.core.proto;

import X.C09CT;
import X.C1516540pZE;
import X.C2238661Cjg;
import com.bytedance.im.core.proto.BatchGetMessagesResponseBody;
import com.bytedance.im.core.proto.GetMessageByKeyError;
import com.bytedance.im.core.proto.MessageBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class BatchGetMessagesResponseBody extends Message<BatchGetMessagesResponseBody, C2238661Cjg> {
    public static final ProtoAdapter<BatchGetMessagesResponseBody> ADAPTER = new ProtoAdapter<BatchGetMessagesResponseBody>() { // from class: X.1Cjf
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final BatchGetMessagesResponseBody decode(ProtoReader protoReader) {
            C2238661Cjg c2238661Cjg = new C2238661Cjg();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2238661Cjg.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c2238661Cjg.LJ.add(GetMessageByKeyError.ADAPTER.decode(protoReader));
                        }
                    } else {
                        c2238661Cjg.LIZLLL.add(MessageBody.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2238661Cjg.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(BatchGetMessagesResponseBody batchGetMessagesResponseBody) {
            BatchGetMessagesResponseBody batchGetMessagesResponseBody2 = batchGetMessagesResponseBody;
            return MessageBody.ADAPTER.asRepeated().encodedSizeWithTag(1, batchGetMessagesResponseBody2.messages) + GetMessageByKeyError.ADAPTER.asRepeated().encodedSizeWithTag(2, batchGetMessagesResponseBody2.errors) + batchGetMessagesResponseBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, BatchGetMessagesResponseBody batchGetMessagesResponseBody) {
            BatchGetMessagesResponseBody batchGetMessagesResponseBody2 = batchGetMessagesResponseBody;
            MessageBody.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, batchGetMessagesResponseBody2.messages);
            GetMessageByKeyError.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, batchGetMessagesResponseBody2.errors);
            protoWriter.writeBytes(batchGetMessagesResponseBody2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @C09CT("errors")
    public final List<GetMessageByKeyError> errors;

    @C09CT("messages")
    public final List<MessageBody> messages;

    @Override // com.squareup.wire.Message
    public C2238661Cjg newBuilder() {
        C2238661Cjg c2238661Cjg = new C2238661Cjg();
        c2238661Cjg.LIZLLL = C1516540pZE.LIZJ("messages", this.messages);
        c2238661Cjg.LJ = C1516540pZE.LIZJ("errors", this.errors);
        c2238661Cjg.addUnknownFields(unknownFields());
        return c2238661Cjg;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<MessageBody> list = this.messages;
        if (list != null && !list.isEmpty()) {
            sb.append(", messages=");
            sb.append(this.messages);
        }
        List<GetMessageByKeyError> list2 = this.errors;
        if (list2 != null && !list2.isEmpty()) {
            sb.append(", errors=");
            sb.append(this.errors);
        }
        sb.replace(0, 2, "BatchGetMessagesResponseBody{");
        sb.append('}');
        return sb.toString();
    }

    public BatchGetMessagesResponseBody(List<MessageBody> list, List<GetMessageByKeyError> list2) {
        this(list, list2, ByteString.EMPTY);
    }

    public BatchGetMessagesResponseBody(List<MessageBody> list, List<GetMessageByKeyError> list2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.messages = C1516540pZE.LJFF("messages", list);
        this.errors = C1516540pZE.LJFF("errors", list2);
    }
}
