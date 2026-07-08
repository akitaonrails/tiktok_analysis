package com.bytedance.im.core.proto;

import X.C09CT;
import X.C1516540pZE;
import X.C867870Y2v;
import com.bytedance.im.core.proto.BatchMarkConversationReadResponseBody;
import com.bytedance.im.core.proto.MarkConversationReadRequestBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public final class BatchMarkConversationReadResponseBody extends Message<BatchMarkConversationReadResponseBody, C867870Y2v> {
    public static final ProtoAdapter<BatchMarkConversationReadResponseBody> ADAPTER = new ProtoAdapter<BatchMarkConversationReadResponseBody>() { // from class: X.0Y2u
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final BatchMarkConversationReadResponseBody decode(ProtoReader protoReader) {
            C867870Y2v c867870Y2v = new C867870Y2v();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c867870Y2v.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c867870Y2v.LIZLLL.add(MarkConversationReadRequestBody.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c867870Y2v.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(BatchMarkConversationReadResponseBody batchMarkConversationReadResponseBody) {
            BatchMarkConversationReadResponseBody batchMarkConversationReadResponseBody2 = batchMarkConversationReadResponseBody;
            return MarkConversationReadRequestBody.ADAPTER.asRepeated().encodedSizeWithTag(1, batchMarkConversationReadResponseBody2.failed_requests) + batchMarkConversationReadResponseBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, BatchMarkConversationReadResponseBody batchMarkConversationReadResponseBody) {
            BatchMarkConversationReadResponseBody batchMarkConversationReadResponseBody2 = batchMarkConversationReadResponseBody;
            MarkConversationReadRequestBody.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, batchMarkConversationReadResponseBody2.failed_requests);
            protoWriter.writeBytes(batchMarkConversationReadResponseBody2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @C09CT("failed_requests")
    public final List<MarkConversationReadRequestBody> failed_requests;

    @Override // com.squareup.wire.Message
    public C867870Y2v newBuilder() {
        C867870Y2v c867870Y2v = new C867870Y2v();
        c867870Y2v.LIZLLL = C1516540pZE.LIZJ("failed_requests", this.failed_requests);
        c867870Y2v.addUnknownFields(unknownFields());
        return c867870Y2v;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<MarkConversationReadRequestBody> list = this.failed_requests;
        if (list != null && !list.isEmpty()) {
            sb.append(", failed_requests=");
            sb.append(this.failed_requests);
        }
        sb.replace(0, 2, "BatchMarkConversationReadResponseBody{");
        sb.append('}');
        return sb.toString();
    }

    public BatchMarkConversationReadResponseBody(List<MarkConversationReadRequestBody> list) {
        this(list, ByteString.EMPTY);
    }

    public BatchMarkConversationReadResponseBody(List<MarkConversationReadRequestBody> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.failed_requests = C1516540pZE.LJFF("failed_requests", list);
    }
}
