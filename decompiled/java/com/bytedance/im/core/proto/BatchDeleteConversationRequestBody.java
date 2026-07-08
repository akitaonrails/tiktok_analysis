package com.bytedance.im.core.proto;

import X.C09CT;
import X.C1516540pZE;
import X.C867710Y2f;
import com.bytedance.im.core.proto.BatchDeleteConversationRequestBody;
import com.bytedance.im.core.proto.DeleteConversationRequestBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public final class BatchDeleteConversationRequestBody extends Message<BatchDeleteConversationRequestBody, C867710Y2f> {
    public static final ProtoAdapter<BatchDeleteConversationRequestBody> ADAPTER = new ProtoAdapter<BatchDeleteConversationRequestBody>() { // from class: X.0Y2e
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final BatchDeleteConversationRequestBody decode(ProtoReader protoReader) {
            C867710Y2f c867710Y2f = new C867710Y2f();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c867710Y2f.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c867710Y2f.LIZLLL.add(DeleteConversationRequestBody.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c867710Y2f.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(BatchDeleteConversationRequestBody batchDeleteConversationRequestBody) {
            BatchDeleteConversationRequestBody batchDeleteConversationRequestBody2 = batchDeleteConversationRequestBody;
            return DeleteConversationRequestBody.ADAPTER.asRepeated().encodedSizeWithTag(1, batchDeleteConversationRequestBody2.delete_requests) + batchDeleteConversationRequestBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, BatchDeleteConversationRequestBody batchDeleteConversationRequestBody) {
            BatchDeleteConversationRequestBody batchDeleteConversationRequestBody2 = batchDeleteConversationRequestBody;
            DeleteConversationRequestBody.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, batchDeleteConversationRequestBody2.delete_requests);
            protoWriter.writeBytes(batchDeleteConversationRequestBody2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @C09CT("delete_requests")
    public final List<DeleteConversationRequestBody> delete_requests;

    @Override // com.squareup.wire.Message
    public C867710Y2f newBuilder() {
        C867710Y2f c867710Y2f = new C867710Y2f();
        c867710Y2f.LIZLLL = C1516540pZE.LIZJ("delete_requests", this.delete_requests);
        c867710Y2f.addUnknownFields(unknownFields());
        return c867710Y2f;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<DeleteConversationRequestBody> list = this.delete_requests;
        if (list != null && !list.isEmpty()) {
            sb.append(", delete_requests=");
            sb.append(this.delete_requests);
        }
        sb.replace(0, 2, "BatchDeleteConversationRequestBody{");
        sb.append('}');
        return sb.toString();
    }

    public BatchDeleteConversationRequestBody(List<DeleteConversationRequestBody> list) {
        this(list, ByteString.EMPTY);
    }

    public BatchDeleteConversationRequestBody(List<DeleteConversationRequestBody> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.delete_requests = C1516540pZE.LJFF("delete_requests", list);
    }
}
