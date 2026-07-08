package com.bytedance.im.core.proto;

import X.C09CT;
import X.C1516540pZE;
import X.C2224841C5y;
import com.bytedance.im.core.proto.MarkMultiStrangerConversationReadRequestBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class MarkMultiStrangerConversationReadRequestBody extends Message<MarkMultiStrangerConversationReadRequestBody, C2224841C5y> {
    public static final ProtoAdapter<MarkMultiStrangerConversationReadRequestBody> ADAPTER = new ProtoAdapter<MarkMultiStrangerConversationReadRequestBody>() { // from class: X.1C5x
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final MarkMultiStrangerConversationReadRequestBody decode(ProtoReader protoReader) {
            C2224841C5y c2224841C5y = new C2224841C5y();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c2224841C5y.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c2224841C5y.LIZLLL.add(ProtoAdapter.INT64.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2224841C5y.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(MarkMultiStrangerConversationReadRequestBody markMultiStrangerConversationReadRequestBody) {
            MarkMultiStrangerConversationReadRequestBody markMultiStrangerConversationReadRequestBody2 = markMultiStrangerConversationReadRequestBody;
            return ProtoAdapter.INT64.asRepeated().encodedSizeWithTag(1, markMultiStrangerConversationReadRequestBody2.conversation_short_ids) + markMultiStrangerConversationReadRequestBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, MarkMultiStrangerConversationReadRequestBody markMultiStrangerConversationReadRequestBody) {
            MarkMultiStrangerConversationReadRequestBody markMultiStrangerConversationReadRequestBody2 = markMultiStrangerConversationReadRequestBody;
            ProtoAdapter.INT64.asRepeated().encodeWithTag(protoWriter, 1, markMultiStrangerConversationReadRequestBody2.conversation_short_ids);
            protoWriter.writeBytes(markMultiStrangerConversationReadRequestBody2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @C09CT("conversation_short_ids")
    public final List<Long> conversation_short_ids;

    @Override // com.squareup.wire.Message
    public C2224841C5y newBuilder() {
        C2224841C5y c2224841C5y = new C2224841C5y();
        c2224841C5y.LIZLLL = C1516540pZE.LIZJ("conversation_short_ids", this.conversation_short_ids);
        c2224841C5y.addUnknownFields(unknownFields());
        return c2224841C5y;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<Long> list = this.conversation_short_ids;
        if (list != null && !list.isEmpty()) {
            sb.append(", conversation_short_ids=");
            sb.append(this.conversation_short_ids);
        }
        sb.replace(0, 2, "MarkMultiStrangerConversationReadRequestBody{");
        sb.append('}');
        return sb.toString();
    }

    public MarkMultiStrangerConversationReadRequestBody(List<Long> list) {
        this(list, ByteString.EMPTY);
    }

    public MarkMultiStrangerConversationReadRequestBody(List<Long> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_short_ids = C1516540pZE.LJFF("conversation_short_ids", list);
    }
}
