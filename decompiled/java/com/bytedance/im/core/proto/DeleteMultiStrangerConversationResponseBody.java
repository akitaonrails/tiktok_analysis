package com.bytedance.im.core.proto;

import X.C09CT;
import X.C1516540pZE;
import X.C1C60;
import com.bytedance.im.core.proto.DeleteMultiStrangerConversationResponseBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class DeleteMultiStrangerConversationResponseBody extends Message<DeleteMultiStrangerConversationResponseBody, C1C60> {
    public static final ProtoAdapter<DeleteMultiStrangerConversationResponseBody> ADAPTER = new ProtoAdapter<DeleteMultiStrangerConversationResponseBody>() { // from class: X.1C5z
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final DeleteMultiStrangerConversationResponseBody decode(ProtoReader protoReader) {
            C1C60 c1c60 = new C1C60();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c1c60.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c1c60.LIZLLL.add(ProtoAdapter.INT64.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1c60.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(DeleteMultiStrangerConversationResponseBody deleteMultiStrangerConversationResponseBody) {
            DeleteMultiStrangerConversationResponseBody deleteMultiStrangerConversationResponseBody2 = deleteMultiStrangerConversationResponseBody;
            return ProtoAdapter.INT64.asRepeated().encodedSizeWithTag(1, deleteMultiStrangerConversationResponseBody2.failed_conversation_short_ids) + deleteMultiStrangerConversationResponseBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, DeleteMultiStrangerConversationResponseBody deleteMultiStrangerConversationResponseBody) {
            DeleteMultiStrangerConversationResponseBody deleteMultiStrangerConversationResponseBody2 = deleteMultiStrangerConversationResponseBody;
            ProtoAdapter.INT64.asRepeated().encodeWithTag(protoWriter, 1, deleteMultiStrangerConversationResponseBody2.failed_conversation_short_ids);
            protoWriter.writeBytes(deleteMultiStrangerConversationResponseBody2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @C09CT("failed_conversation_short_ids")
    public final List<Long> failed_conversation_short_ids;

    @Override // com.squareup.wire.Message
    public C1C60 newBuilder() {
        C1C60 c1c60 = new C1C60();
        c1c60.LIZLLL = C1516540pZE.LIZJ("failed_conversation_short_ids", this.failed_conversation_short_ids);
        c1c60.addUnknownFields(unknownFields());
        return c1c60;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<Long> list = this.failed_conversation_short_ids;
        if (list != null && !list.isEmpty()) {
            sb.append(", failed_conversation_short_ids=");
            sb.append(this.failed_conversation_short_ids);
        }
        sb.replace(0, 2, "DeleteMultiStrangerConversationResponseBody{");
        sb.append('}');
        return sb.toString();
    }

    public DeleteMultiStrangerConversationResponseBody(List<Long> list) {
        this(list, ByteString.EMPTY);
    }

    public DeleteMultiStrangerConversationResponseBody(List<Long> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.failed_conversation_short_ids = C1516540pZE.LJFF("failed_conversation_short_ids", list);
    }
}
