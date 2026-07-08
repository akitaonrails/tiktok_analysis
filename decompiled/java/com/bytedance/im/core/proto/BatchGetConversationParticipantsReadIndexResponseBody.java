package com.bytedance.im.core.proto;

import X.C09CT;
import X.C0YRL;
import X.C1516540pZE;
import com.bytedance.im.core.proto.BatchGetConversationParticipantsReadIndexResponseBody;
import com.bytedance.im.core.proto.ConversationParticipantReadIndex;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public final class BatchGetConversationParticipantsReadIndexResponseBody extends Message<BatchGetConversationParticipantsReadIndexResponseBody, C0YRL> {
    public static final ProtoAdapter<BatchGetConversationParticipantsReadIndexResponseBody> ADAPTER = new ProtoAdapter<BatchGetConversationParticipantsReadIndexResponseBody>() { // from class: X.0YRK
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final BatchGetConversationParticipantsReadIndexResponseBody decode(ProtoReader protoReader) {
            C0YRL c0yrl = new C0YRL();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c0yrl.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c0yrl.LIZLLL.add(ConversationParticipantReadIndex.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c0yrl.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(BatchGetConversationParticipantsReadIndexResponseBody batchGetConversationParticipantsReadIndexResponseBody) {
            BatchGetConversationParticipantsReadIndexResponseBody batchGetConversationParticipantsReadIndexResponseBody2 = batchGetConversationParticipantsReadIndexResponseBody;
            return ConversationParticipantReadIndex.ADAPTER.asRepeated().encodedSizeWithTag(1, batchGetConversationParticipantsReadIndexResponseBody2.conversationParticipantsReadIndex) + batchGetConversationParticipantsReadIndexResponseBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, BatchGetConversationParticipantsReadIndexResponseBody batchGetConversationParticipantsReadIndexResponseBody) {
            BatchGetConversationParticipantsReadIndexResponseBody batchGetConversationParticipantsReadIndexResponseBody2 = batchGetConversationParticipantsReadIndexResponseBody;
            ConversationParticipantReadIndex.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, batchGetConversationParticipantsReadIndexResponseBody2.conversationParticipantsReadIndex);
            protoWriter.writeBytes(batchGetConversationParticipantsReadIndexResponseBody2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @C09CT("conversationParticipantsReadIndex")
    public final List<ConversationParticipantReadIndex> conversationParticipantsReadIndex;

    @Override // com.squareup.wire.Message
    public C0YRL newBuilder() {
        C0YRL c0yrl = new C0YRL();
        c0yrl.LIZLLL = C1516540pZE.LIZJ("conversationParticipantsReadIndex", this.conversationParticipantsReadIndex);
        c0yrl.addUnknownFields(unknownFields());
        return c0yrl;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<ConversationParticipantReadIndex> list = this.conversationParticipantsReadIndex;
        if (list != null && !list.isEmpty()) {
            sb.append(", conversationParticipantsReadIndex=");
            sb.append(this.conversationParticipantsReadIndex);
        }
        sb.replace(0, 2, "BatchGetConversationParticipantsReadIndexResponseBody{");
        sb.append('}');
        return sb.toString();
    }

    public BatchGetConversationParticipantsReadIndexResponseBody(List<ConversationParticipantReadIndex> list) {
        this(list, ByteString.EMPTY);
    }

    public BatchGetConversationParticipantsReadIndexResponseBody(List<ConversationParticipantReadIndex> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversationParticipantsReadIndex = C1516540pZE.LJFF("conversationParticipantsReadIndex", list);
    }
}
