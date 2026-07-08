package com.bytedance.im.core.proto;

import X.C09CT;
import X.C0Y33;
import com.bytedance.im.core.proto.ConversationLeaveRequestBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public final class ConversationLeaveRequestBody extends Message<ConversationLeaveRequestBody, C0Y33> {
    public static final ProtoAdapter<ConversationLeaveRequestBody> ADAPTER = new ProtoAdapter<ConversationLeaveRequestBody>() { // from class: X.0Y34
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final ConversationLeaveRequestBody decode(ProtoReader protoReader) {
            C0Y33 c0y33 = new C0Y33();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c0y33.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                c0y33.LJFF = ProtoAdapter.INT32.decode(protoReader);
                            }
                        } else {
                            c0y33.LJ = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c0y33.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c0y33.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(ConversationLeaveRequestBody conversationLeaveRequestBody) {
            ConversationLeaveRequestBody conversationLeaveRequestBody2 = conversationLeaveRequestBody;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, conversationLeaveRequestBody2.conversation_id) + ProtoAdapter.INT64.encodedSizeWithTag(2, conversationLeaveRequestBody2.conversation_short_id) + ProtoAdapter.INT32.encodedSizeWithTag(3, conversationLeaveRequestBody2.conversation_type) + conversationLeaveRequestBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, ConversationLeaveRequestBody conversationLeaveRequestBody) {
            ConversationLeaveRequestBody conversationLeaveRequestBody2 = conversationLeaveRequestBody;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, conversationLeaveRequestBody2.conversation_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, conversationLeaveRequestBody2.conversation_short_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, conversationLeaveRequestBody2.conversation_type);
            protoWriter.writeBytes(conversationLeaveRequestBody2.unknownFields());
        }
    };
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;
    public static final long serialVersionUID = 0;

    @C09CT("conversation_id")
    public final String conversation_id;

    @C09CT("conversation_short_id")
    public final Long conversation_short_id;

    @C09CT("conversation_type")
    public final Integer conversation_type;

    @Override // com.squareup.wire.Message
    public C0Y33 newBuilder() {
        C0Y33 c0y33 = new C0Y33();
        c0y33.LIZLLL = this.conversation_id;
        c0y33.LJ = this.conversation_short_id;
        c0y33.LJFF = this.conversation_type;
        c0y33.addUnknownFields(unknownFields());
        return c0y33;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.conversation_id != null) {
            sb.append(", conversation_id=");
            sb.append(this.conversation_id);
        }
        if (this.conversation_short_id != null) {
            sb.append(", conversation_short_id=");
            sb.append(this.conversation_short_id);
        }
        if (this.conversation_type != null) {
            sb.append(", conversation_type=");
            sb.append(this.conversation_type);
        }
        sb.replace(0, 2, "ConversationLeaveRequestBody{");
        sb.append('}');
        return sb.toString();
    }

    public ConversationLeaveRequestBody(String str, Long l, Integer num) {
        this(str, l, num, ByteString.EMPTY);
    }

    public ConversationLeaveRequestBody(String str, Long l, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_id = str;
        this.conversation_short_id = l;
        this.conversation_type = num;
    }
}
