package com.bytedance.im.core.proto;

import X.C09CT;
import X.C1516540pZE;
import X.C2224821C5w;
import com.bytedance.im.core.proto.DeleteMultiStrangerConversationRequestBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class DeleteMultiStrangerConversationRequestBody extends Message<DeleteMultiStrangerConversationRequestBody, C2224821C5w> {
    public static final ProtoAdapter<DeleteMultiStrangerConversationRequestBody> ADAPTER = new ProtoAdapter<DeleteMultiStrangerConversationRequestBody>() { // from class: X.1C5v
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final DeleteMultiStrangerConversationRequestBody decode(ProtoReader protoReader) {
            C2224821C5w c2224821C5w = new C2224821C5w();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c2224821C5w.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c2224821C5w.LIZLLL.add(ProtoAdapter.INT64.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2224821C5w.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(DeleteMultiStrangerConversationRequestBody deleteMultiStrangerConversationRequestBody) {
            DeleteMultiStrangerConversationRequestBody deleteMultiStrangerConversationRequestBody2 = deleteMultiStrangerConversationRequestBody;
            return ProtoAdapter.INT64.asRepeated().encodedSizeWithTag(1, deleteMultiStrangerConversationRequestBody2.conversation_short_ids) + deleteMultiStrangerConversationRequestBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, DeleteMultiStrangerConversationRequestBody deleteMultiStrangerConversationRequestBody) {
            DeleteMultiStrangerConversationRequestBody deleteMultiStrangerConversationRequestBody2 = deleteMultiStrangerConversationRequestBody;
            ProtoAdapter.INT64.asRepeated().encodeWithTag(protoWriter, 1, deleteMultiStrangerConversationRequestBody2.conversation_short_ids);
            protoWriter.writeBytes(deleteMultiStrangerConversationRequestBody2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @C09CT("conversation_short_ids")
    public final List<Long> conversation_short_ids;

    @Override // com.squareup.wire.Message
    public C2224821C5w newBuilder() {
        C2224821C5w c2224821C5w = new C2224821C5w();
        c2224821C5w.LIZLLL = C1516540pZE.LIZJ("conversation_short_ids", this.conversation_short_ids);
        c2224821C5w.addUnknownFields(unknownFields());
        return c2224821C5w;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<Long> list = this.conversation_short_ids;
        if (list != null && !list.isEmpty()) {
            sb.append(", conversation_short_ids=");
            sb.append(this.conversation_short_ids);
        }
        sb.replace(0, 2, "DeleteMultiStrangerConversationRequestBody{");
        sb.append('}');
        return sb.toString();
    }

    public DeleteMultiStrangerConversationRequestBody(List<Long> list) {
        this(list, ByteString.EMPTY);
    }

    public DeleteMultiStrangerConversationRequestBody(List<Long> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_short_ids = C1516540pZE.LJFF("conversation_short_ids", list);
    }
}
