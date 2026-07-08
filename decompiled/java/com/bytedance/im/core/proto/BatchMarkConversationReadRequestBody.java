package com.bytedance.im.core.proto;

import X.C09CT;
import X.C1516540pZE;
import X.C867720Y2g;
import com.bytedance.im.core.proto.BatchMarkConversationReadRequestBody;
import com.bytedance.im.core.proto.MarkConversationReadRequestBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public final class BatchMarkConversationReadRequestBody extends Message<BatchMarkConversationReadRequestBody, C867720Y2g> {
    public static final ProtoAdapter<BatchMarkConversationReadRequestBody> ADAPTER = new ProtoAdapter<BatchMarkConversationReadRequestBody>() { // from class: X.0Y2h
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final BatchMarkConversationReadRequestBody decode(ProtoReader protoReader) {
            C867720Y2g c867720Y2g = new C867720Y2g();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c867720Y2g.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c867720Y2g.LIZLLL.add(MarkConversationReadRequestBody.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c867720Y2g.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(BatchMarkConversationReadRequestBody batchMarkConversationReadRequestBody) {
            BatchMarkConversationReadRequestBody batchMarkConversationReadRequestBody2 = batchMarkConversationReadRequestBody;
            return MarkConversationReadRequestBody.ADAPTER.asRepeated().encodedSizeWithTag(1, batchMarkConversationReadRequestBody2.mark_read_requests) + batchMarkConversationReadRequestBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, BatchMarkConversationReadRequestBody batchMarkConversationReadRequestBody) {
            BatchMarkConversationReadRequestBody batchMarkConversationReadRequestBody2 = batchMarkConversationReadRequestBody;
            MarkConversationReadRequestBody.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, batchMarkConversationReadRequestBody2.mark_read_requests);
            protoWriter.writeBytes(batchMarkConversationReadRequestBody2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @C09CT("mark_read_requests")
    public final List<MarkConversationReadRequestBody> mark_read_requests;

    @Override // com.squareup.wire.Message
    public C867720Y2g newBuilder() {
        C867720Y2g c867720Y2g = new C867720Y2g();
        c867720Y2g.LIZLLL = C1516540pZE.LIZJ("mark_read_requests", this.mark_read_requests);
        c867720Y2g.addUnknownFields(unknownFields());
        return c867720Y2g;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<MarkConversationReadRequestBody> list = this.mark_read_requests;
        if (list != null && !list.isEmpty()) {
            sb.append(", mark_read_requests=");
            sb.append(this.mark_read_requests);
        }
        sb.replace(0, 2, "BatchMarkConversationReadRequestBody{");
        sb.append('}');
        return sb.toString();
    }

    public BatchMarkConversationReadRequestBody(List<MarkConversationReadRequestBody> list) {
        this(list, ByteString.EMPTY);
    }

    public BatchMarkConversationReadRequestBody(List<MarkConversationReadRequestBody> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mark_read_requests = C1516540pZE.LJFF("mark_read_requests", list);
    }
}
