package com.bytedance.im.core.proto;

import X.C09CT;
import X.C2251611DAx;
import com.bytedance.im.core.proto.ConversationMessagePreViewRequestBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: loaded from: classes36.dex */
public final class ConversationMessagePreViewRequestBody extends Message<ConversationMessagePreViewRequestBody, C2251611DAx> {
    public static final long serialVersionUID = 0;

    @C09CT("conv_short_id")
    public final Long conv_short_id;

    @C09CT("conversation_index")
    public final Long conversation_index;

    @C09CT("inbox_type")
    public final Integer inbox_type;

    @C09CT("message_id")
    public final Long message_id;
    public static final ProtoAdapter<ConversationMessagePreViewRequestBody> ADAPTER = new ProtoAdapter<ConversationMessagePreViewRequestBody>() { // from class: X.1DAw
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final ConversationMessagePreViewRequestBody decode(ProtoReader protoReader) {
            C2251611DAx c2251611DAx = new C2251611DAx();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                    c2251611DAx.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                } else {
                                    c2251611DAx.LJI = ProtoAdapter.INT32.decode(protoReader);
                                }
                            } else {
                                c2251611DAx.LJFF = ProtoAdapter.INT64.decode(protoReader);
                            }
                        } else {
                            c2251611DAx.LJ = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c2251611DAx.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2251611DAx.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(ConversationMessagePreViewRequestBody conversationMessagePreViewRequestBody) {
            ConversationMessagePreViewRequestBody conversationMessagePreViewRequestBody2 = conversationMessagePreViewRequestBody;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            return protoAdapter.encodedSizeWithTag(1, conversationMessagePreViewRequestBody2.conv_short_id) + protoAdapter.encodedSizeWithTag(2, conversationMessagePreViewRequestBody2.message_id) + protoAdapter.encodedSizeWithTag(3, conversationMessagePreViewRequestBody2.conversation_index) + ProtoAdapter.INT32.encodedSizeWithTag(4, conversationMessagePreViewRequestBody2.inbox_type) + conversationMessagePreViewRequestBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, ConversationMessagePreViewRequestBody conversationMessagePreViewRequestBody) {
            ConversationMessagePreViewRequestBody conversationMessagePreViewRequestBody2 = conversationMessagePreViewRequestBody;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 1, conversationMessagePreViewRequestBody2.conv_short_id);
            protoAdapter.encodeWithTag(protoWriter, 2, conversationMessagePreViewRequestBody2.message_id);
            protoAdapter.encodeWithTag(protoWriter, 3, conversationMessagePreViewRequestBody2.conversation_index);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, conversationMessagePreViewRequestBody2.inbox_type);
            protoWriter.writeBytes(conversationMessagePreViewRequestBody2.unknownFields());
        }
    };
    public static final Long DEFAULT_CONV_SHORT_ID = 0L;
    public static final Long DEFAULT_MESSAGE_ID = 0L;
    public static final Long DEFAULT_CONVERSATION_INDEX = 0L;
    public static final Integer DEFAULT_INBOX_TYPE = 0;

    @Override // com.squareup.wire.Message
    public C2251611DAx newBuilder() {
        C2251611DAx c2251611DAx = new C2251611DAx();
        c2251611DAx.LIZLLL = this.conv_short_id;
        c2251611DAx.LJ = this.message_id;
        c2251611DAx.LJFF = this.conversation_index;
        c2251611DAx.LJI = this.inbox_type;
        c2251611DAx.addUnknownFields(unknownFields());
        return c2251611DAx;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", conv_short_id=");
        sb.append(this.conv_short_id);
        sb.append(", message_id=");
        sb.append(this.message_id);
        sb.append(", conversation_index=");
        sb.append(this.conversation_index);
        sb.append(", inbox_type=");
        sb.append(this.inbox_type);
        sb.replace(0, 2, "ConversationMessagePreViewRequestBody{");
        sb.append('}');
        return sb.toString();
    }

    public ConversationMessagePreViewRequestBody(Long l, Long l2, Long l3, Integer num) {
        this(l, l2, l3, num, ByteString.EMPTY);
    }

    public ConversationMessagePreViewRequestBody(Long l, Long l2, Long l3, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conv_short_id = l;
        this.message_id = l2;
        this.conversation_index = l3;
        this.inbox_type = num;
    }
}
