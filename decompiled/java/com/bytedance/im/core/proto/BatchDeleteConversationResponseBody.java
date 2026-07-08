package com.bytedance.im.core.proto;

import X.C09CT;
import X.C0Y38;
import X.C1516540pZE;
import com.bytedance.im.core.proto.BatchDeleteConversationResponseBody;
import com.bytedance.im.core.proto.DeleteConversationRequestBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public final class BatchDeleteConversationResponseBody extends Message<BatchDeleteConversationResponseBody, C0Y38> {
    public static final ProtoAdapter<BatchDeleteConversationResponseBody> ADAPTER = new ProtoAdapter<BatchDeleteConversationResponseBody>() { // from class: X.0Y37
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final BatchDeleteConversationResponseBody decode(ProtoReader protoReader) {
            C0Y38 c0y38 = new C0Y38();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c0y38.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c0y38.LIZLLL.add(DeleteConversationRequestBody.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c0y38.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(BatchDeleteConversationResponseBody batchDeleteConversationResponseBody) {
            BatchDeleteConversationResponseBody batchDeleteConversationResponseBody2 = batchDeleteConversationResponseBody;
            return DeleteConversationRequestBody.ADAPTER.asRepeated().encodedSizeWithTag(1, batchDeleteConversationResponseBody2.failed_requests) + batchDeleteConversationResponseBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, BatchDeleteConversationResponseBody batchDeleteConversationResponseBody) {
            BatchDeleteConversationResponseBody batchDeleteConversationResponseBody2 = batchDeleteConversationResponseBody;
            DeleteConversationRequestBody.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, batchDeleteConversationResponseBody2.failed_requests);
            protoWriter.writeBytes(batchDeleteConversationResponseBody2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @C09CT("failed_requests")
    public final List<DeleteConversationRequestBody> failed_requests;

    @Override // com.squareup.wire.Message
    public C0Y38 newBuilder() {
        C0Y38 c0y38 = new C0Y38();
        c0y38.LIZLLL = C1516540pZE.LIZJ("failed_requests", this.failed_requests);
        c0y38.addUnknownFields(unknownFields());
        return c0y38;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<DeleteConversationRequestBody> list = this.failed_requests;
        if (list != null && !list.isEmpty()) {
            sb.append(", failed_requests=");
            sb.append(this.failed_requests);
        }
        sb.replace(0, 2, "BatchDeleteConversationResponseBody{");
        sb.append('}');
        return sb.toString();
    }

    public BatchDeleteConversationResponseBody(List<DeleteConversationRequestBody> list) {
        this(list, ByteString.EMPTY);
    }

    public BatchDeleteConversationResponseBody(List<DeleteConversationRequestBody> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.failed_requests = C1516540pZE.LJFF("failed_requests", list);
    }
}
