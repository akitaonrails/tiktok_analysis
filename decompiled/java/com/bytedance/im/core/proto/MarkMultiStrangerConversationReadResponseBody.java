package com.bytedance.im.core.proto;

import X.C09CT;
import X.C1516540pZE;
import X.C1C62;
import com.bytedance.im.core.proto.MarkMultiStrangerConversationReadResponseBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class MarkMultiStrangerConversationReadResponseBody extends Message<MarkMultiStrangerConversationReadResponseBody, C1C62> {
    public static final ProtoAdapter<MarkMultiStrangerConversationReadResponseBody> ADAPTER = new ProtoAdapter<MarkMultiStrangerConversationReadResponseBody>() { // from class: X.1C61
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final MarkMultiStrangerConversationReadResponseBody decode(ProtoReader protoReader) {
            C1C62 c1c62 = new C1C62();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c1c62.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c1c62.LIZLLL.add(ProtoAdapter.INT64.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1c62.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(MarkMultiStrangerConversationReadResponseBody markMultiStrangerConversationReadResponseBody) {
            MarkMultiStrangerConversationReadResponseBody markMultiStrangerConversationReadResponseBody2 = markMultiStrangerConversationReadResponseBody;
            return ProtoAdapter.INT64.asRepeated().encodedSizeWithTag(1, markMultiStrangerConversationReadResponseBody2.failed_conversation_short_ids) + markMultiStrangerConversationReadResponseBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, MarkMultiStrangerConversationReadResponseBody markMultiStrangerConversationReadResponseBody) {
            MarkMultiStrangerConversationReadResponseBody markMultiStrangerConversationReadResponseBody2 = markMultiStrangerConversationReadResponseBody;
            ProtoAdapter.INT64.asRepeated().encodeWithTag(protoWriter, 1, markMultiStrangerConversationReadResponseBody2.failed_conversation_short_ids);
            protoWriter.writeBytes(markMultiStrangerConversationReadResponseBody2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @C09CT("failed_conversation_short_ids")
    public final List<Long> failed_conversation_short_ids;

    @Override // com.squareup.wire.Message
    public C1C62 newBuilder() {
        C1C62 c1c62 = new C1C62();
        c1c62.LIZLLL = C1516540pZE.LIZJ("failed_conversation_short_ids", this.failed_conversation_short_ids);
        c1c62.addUnknownFields(unknownFields());
        return c1c62;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<Long> list = this.failed_conversation_short_ids;
        if (list != null && !list.isEmpty()) {
            sb.append(", failed_conversation_short_ids=");
            sb.append(this.failed_conversation_short_ids);
        }
        sb.replace(0, 2, "MarkMultiStrangerConversationReadResponseBody{");
        sb.append('}');
        return sb.toString();
    }

    public MarkMultiStrangerConversationReadResponseBody(List<Long> list) {
        this(list, ByteString.EMPTY);
    }

    public MarkMultiStrangerConversationReadResponseBody(List<Long> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.failed_conversation_short_ids = C1516540pZE.LJFF("failed_conversation_short_ids", list);
    }
}
