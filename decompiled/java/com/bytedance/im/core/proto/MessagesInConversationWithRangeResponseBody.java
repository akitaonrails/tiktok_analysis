package com.bytedance.im.core.proto;

import X.C09CT;
import X.C0YSN;
import X.C1516540pZE;
import com.bytedance.im.core.proto.MessagesInConversationWithRangeResponseBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public final class MessagesInConversationWithRangeResponseBody extends Message<MessagesInConversationWithRangeResponseBody, C0YSN> {
    public static final ProtoAdapter<MessagesInConversationWithRangeResponseBody> ADAPTER = new ProtoAdapter<MessagesInConversationWithRangeResponseBody>() { // from class: X.0YSM
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final MessagesInConversationWithRangeResponseBody decode(ProtoReader protoReader) {
            C0YSN c0ysn = new C0YSN();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c0ysn.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                c0ysn.LJFF = ProtoAdapter.INT64.decode(protoReader);
                            }
                        } else {
                            c0ysn.LJ = ProtoAdapter.BOOL.decode(protoReader);
                        }
                    } else {
                        c0ysn.LIZLLL.add(ProtoAdapter.BYTES.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c0ysn.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(MessagesInConversationWithRangeResponseBody messagesInConversationWithRangeResponseBody) {
            MessagesInConversationWithRangeResponseBody messagesInConversationWithRangeResponseBody2 = messagesInConversationWithRangeResponseBody;
            return ProtoAdapter.BYTES.asRepeated().encodedSizeWithTag(1, messagesInConversationWithRangeResponseBody2.messages_pb) + ProtoAdapter.BOOL.encodedSizeWithTag(2, messagesInConversationWithRangeResponseBody2.has_more) + ProtoAdapter.INT64.encodedSizeWithTag(3, messagesInConversationWithRangeResponseBody2.next_cursor) + messagesInConversationWithRangeResponseBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, MessagesInConversationWithRangeResponseBody messagesInConversationWithRangeResponseBody) {
            MessagesInConversationWithRangeResponseBody messagesInConversationWithRangeResponseBody2 = messagesInConversationWithRangeResponseBody;
            ProtoAdapter.BYTES.asRepeated().encodeWithTag(protoWriter, 1, messagesInConversationWithRangeResponseBody2.messages_pb);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, messagesInConversationWithRangeResponseBody2.has_more);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, messagesInConversationWithRangeResponseBody2.next_cursor);
            protoWriter.writeBytes(messagesInConversationWithRangeResponseBody2.unknownFields());
        }
    };
    public static final Boolean DEFAULT_HAS_MORE = Boolean.FALSE;
    public static final Long DEFAULT_NEXT_CURSOR = 0L;
    public static final long serialVersionUID = 0;

    @C09CT("has_more")
    public final Boolean has_more;

    @C09CT("messages_pb")
    public final List<ByteString> messages_pb;

    @C09CT("next_cursor")
    public final Long next_cursor;

    @Override // com.squareup.wire.Message
    public C0YSN newBuilder() {
        C0YSN c0ysn = new C0YSN();
        c0ysn.LIZLLL = C1516540pZE.LIZJ("messages_pb", this.messages_pb);
        c0ysn.LJ = this.has_more;
        c0ysn.LJFF = this.next_cursor;
        c0ysn.addUnknownFields(unknownFields());
        return c0ysn;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<ByteString> list = this.messages_pb;
        if (list != null && !list.isEmpty()) {
            sb.append(", messages_pb=");
            sb.append(this.messages_pb);
        }
        if (this.has_more != null) {
            sb.append(", has_more=");
            sb.append(this.has_more);
        }
        if (this.next_cursor != null) {
            sb.append(", next_cursor=");
            sb.append(this.next_cursor);
        }
        sb.replace(0, 2, "MessagesInConversationWithRangeResponseBody{");
        sb.append('}');
        return sb.toString();
    }

    public MessagesInConversationWithRangeResponseBody(List<ByteString> list, Boolean bool, Long l) {
        this(list, bool, l, ByteString.EMPTY);
    }

    public MessagesInConversationWithRangeResponseBody(List<ByteString> list, Boolean bool, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.messages_pb = C1516540pZE.LJFF("messages_pb", list);
        this.has_more = bool;
        this.next_cursor = l;
    }
}
