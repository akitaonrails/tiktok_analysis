package com.bytedance.im.core.proto;

import X.C09CT;
import X.C1CK9;
import com.bytedance.im.core.proto.ConversationRequest;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class ConversationRequest extends Message<ConversationRequest, C1CK9> {
    public static final ProtoAdapter<ConversationRequest> ADAPTER = new ProtoAdapter<ConversationRequest>() { // from class: X.1CK8
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final ConversationRequest decode(ProtoReader protoReader) {
            C1CK9 c1ck9 = new C1CK9();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c1ck9.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c1ck9.LJ = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c1ck9.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1ck9.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(ConversationRequest conversationRequest) {
            ConversationRequest conversationRequest2 = conversationRequest;
            return ProtoAdapter.INT64.encodedSizeWithTag(1, conversationRequest2.conversation_short_id) + ProtoAdapter.INT32.encodedSizeWithTag(2, conversationRequest2.conversation_type) + conversationRequest2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, ConversationRequest conversationRequest) {
            ConversationRequest conversationRequest2 = conversationRequest;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, conversationRequest2.conversation_short_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, conversationRequest2.conversation_type);
            protoWriter.writeBytes(conversationRequest2.unknownFields());
        }
    };
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;
    public static final long serialVersionUID = 0;

    @C09CT("conversation_short_id")
    public final Long conversation_short_id;

    @C09CT("conversation_type")
    public final Integer conversation_type;

    @Override // com.squareup.wire.Message
    public C1CK9 newBuilder() {
        C1CK9 c1ck9 = new C1CK9();
        c1ck9.LIZLLL = this.conversation_short_id;
        c1ck9.LJ = this.conversation_type;
        c1ck9.addUnknownFields(unknownFields());
        return c1ck9;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.conversation_short_id != null) {
            sb.append(", conversation_short_id=");
            sb.append(this.conversation_short_id);
        }
        if (this.conversation_type != null) {
            sb.append(", conversation_type=");
            sb.append(this.conversation_type);
        }
        sb.replace(0, 2, "ConversationRequest{");
        sb.append('}');
        return sb.toString();
    }

    public ConversationRequest(Long l, Integer num) {
        this(l, num, ByteString.EMPTY);
    }

    public ConversationRequest(Long l, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_short_id = l;
        this.conversation_type = num;
    }
}
