package com.bytedance.im.core.proto;

import X.C09CT;
import X.C2226371CBv;
import com.bytedance.im.core.proto.MarkStrangerConversationReadRequestBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class MarkStrangerConversationReadRequestBody extends Message<MarkStrangerConversationReadRequestBody, C2226371CBv> {
    public static final ProtoAdapter<MarkStrangerConversationReadRequestBody> ADAPTER = new ProtoAdapter<MarkStrangerConversationReadRequestBody>() { // from class: X.1CBu
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final MarkStrangerConversationReadRequestBody decode(ProtoReader protoReader) {
            C2226371CBv c2226371CBv = new C2226371CBv();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c2226371CBv.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c2226371CBv.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2226371CBv.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(MarkStrangerConversationReadRequestBody markStrangerConversationReadRequestBody) {
            MarkStrangerConversationReadRequestBody markStrangerConversationReadRequestBody2 = markStrangerConversationReadRequestBody;
            return ProtoAdapter.INT64.encodedSizeWithTag(1, markStrangerConversationReadRequestBody2.conversation_short_id) + markStrangerConversationReadRequestBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, MarkStrangerConversationReadRequestBody markStrangerConversationReadRequestBody) {
            MarkStrangerConversationReadRequestBody markStrangerConversationReadRequestBody2 = markStrangerConversationReadRequestBody;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, markStrangerConversationReadRequestBody2.conversation_short_id);
            protoWriter.writeBytes(markStrangerConversationReadRequestBody2.unknownFields());
        }
    };
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final long serialVersionUID = 0;

    @C09CT("conversation_short_id")
    public final Long conversation_short_id;

    @Override // com.squareup.wire.Message
    public C2226371CBv newBuilder() {
        C2226371CBv c2226371CBv = new C2226371CBv();
        c2226371CBv.LIZLLL = this.conversation_short_id;
        c2226371CBv.addUnknownFields(unknownFields());
        return c2226371CBv;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.conversation_short_id != null) {
            sb.append(", conversation_short_id=");
            sb.append(this.conversation_short_id);
        }
        sb.replace(0, 2, "MarkStrangerConversationReadRequestBody{");
        sb.append('}');
        return sb.toString();
    }

    public MarkStrangerConversationReadRequestBody(Long l) {
        this(l, ByteString.EMPTY);
    }

    public MarkStrangerConversationReadRequestBody(Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_short_id = l;
    }
}
