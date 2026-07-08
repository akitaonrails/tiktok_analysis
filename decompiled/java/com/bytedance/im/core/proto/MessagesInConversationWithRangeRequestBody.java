package com.bytedance.im.core.proto;

import X.C09CT;
import X.C873050YMt;
import X.EnumC873090YMx;
import com.bytedance.im.core.proto.MessageRange;
import com.bytedance.im.core.proto.MessagesInConversationWithRangeRequestBody;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public final class MessagesInConversationWithRangeRequestBody extends Message<MessagesInConversationWithRangeRequestBody, C873050YMt> {
    public static final long serialVersionUID = 0;

    @C09CT("conversation_id")
    public final String conversation_id;

    @C09CT("conversation_short_id")
    public final Long conversation_short_id;

    @C09CT("conversation_type")
    public final Integer conversation_type;

    @C09CT("direction")
    public final EnumC873090YMx direction;

    @C09CT("limit")
    public final Integer limit;

    @C09CT("message_range")
    public final MessageRange message_range;
    public static final ProtoAdapter<MessagesInConversationWithRangeRequestBody> ADAPTER = new ProtoAdapter<MessagesInConversationWithRangeRequestBody>() { // from class: X.0YMu
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final MessagesInConversationWithRangeRequestBody decode(ProtoReader protoReader) {
            C873050YMt c873050YMt = new C873050YMt();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c873050YMt.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c873050YMt.LJ = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 3:
                            c873050YMt.LJFF = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 4:
                            c873050YMt.LJI = MessageRange.ADAPTER.decode(protoReader);
                            break;
                        case 5:
                            c873050YMt.LJII = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 6:
                            try {
                                c873050YMt.LJIIIIZZ = EnumC873090YMx.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                TryCatchGuardChecker.doCheck(e);
                                c873050YMt.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c873050YMt.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c873050YMt.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(MessagesInConversationWithRangeRequestBody messagesInConversationWithRangeRequestBody) {
            MessagesInConversationWithRangeRequestBody messagesInConversationWithRangeRequestBody2 = messagesInConversationWithRangeRequestBody;
            int iEncodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, messagesInConversationWithRangeRequestBody2.conversation_id) + ProtoAdapter.INT64.encodedSizeWithTag(2, messagesInConversationWithRangeRequestBody2.conversation_short_id);
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(3, messagesInConversationWithRangeRequestBody2.conversation_type) + MessageRange.ADAPTER.encodedSizeWithTag(4, messagesInConversationWithRangeRequestBody2.message_range) + protoAdapter.encodedSizeWithTag(5, messagesInConversationWithRangeRequestBody2.limit) + EnumC873090YMx.ADAPTER.encodedSizeWithTag(6, messagesInConversationWithRangeRequestBody2.direction) + messagesInConversationWithRangeRequestBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, MessagesInConversationWithRangeRequestBody messagesInConversationWithRangeRequestBody) {
            MessagesInConversationWithRangeRequestBody messagesInConversationWithRangeRequestBody2 = messagesInConversationWithRangeRequestBody;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, messagesInConversationWithRangeRequestBody2.conversation_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, messagesInConversationWithRangeRequestBody2.conversation_short_id);
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            protoAdapter.encodeWithTag(protoWriter, 3, messagesInConversationWithRangeRequestBody2.conversation_type);
            MessageRange.ADAPTER.encodeWithTag(protoWriter, 4, messagesInConversationWithRangeRequestBody2.message_range);
            protoAdapter.encodeWithTag(protoWriter, 5, messagesInConversationWithRangeRequestBody2.limit);
            EnumC873090YMx.ADAPTER.encodeWithTag(protoWriter, 6, messagesInConversationWithRangeRequestBody2.direction);
            protoWriter.writeBytes(messagesInConversationWithRangeRequestBody2.unknownFields());
        }
    };
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;
    public static final Integer DEFAULT_LIMIT = 0;
    public static final EnumC873090YMx DEFAULT_DIRECTION = EnumC873090YMx.OLDER;

    @Override // com.squareup.wire.Message
    public C873050YMt newBuilder() {
        C873050YMt c873050YMt = new C873050YMt();
        c873050YMt.LIZLLL = this.conversation_id;
        c873050YMt.LJ = this.conversation_short_id;
        c873050YMt.LJFF = this.conversation_type;
        c873050YMt.LJI = this.message_range;
        c873050YMt.LJII = this.limit;
        c873050YMt.LJIIIIZZ = this.direction;
        c873050YMt.addUnknownFields(unknownFields());
        return c873050YMt;
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
        if (this.message_range != null) {
            sb.append(", message_range=");
            sb.append(this.message_range);
        }
        if (this.limit != null) {
            sb.append(", limit=");
            sb.append(this.limit);
        }
        if (this.direction != null) {
            sb.append(", direction=");
            sb.append(this.direction);
        }
        sb.replace(0, 2, "MessagesInConversationWithRangeRequestBody{");
        sb.append('}');
        return sb.toString();
    }

    public MessagesInConversationWithRangeRequestBody(String str, Long l, Integer num, MessageRange messageRange, Integer num2, EnumC873090YMx enumC873090YMx) {
        this(str, l, num, messageRange, num2, enumC873090YMx, ByteString.EMPTY);
    }

    public MessagesInConversationWithRangeRequestBody(String str, Long l, Integer num, MessageRange messageRange, Integer num2, EnumC873090YMx enumC873090YMx, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_id = str;
        this.conversation_short_id = l;
        this.conversation_type = num;
        this.message_range = messageRange;
        this.limit = num2;
        this.direction = enumC873090YMx;
    }
}
