package com.bytedance.im.core.proto;

import X.C09CT;
import X.C1516540pZE;
import X.C2238541CjU;
import com.bytedance.im.core.proto.ConversationInfoV2;
import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.im.core.proto.MessagesPerConversationSearchResponseBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class MessagesPerConversationSearchResponseBody extends Message<MessagesPerConversationSearchResponseBody, C2238541CjU> {
    public static final long serialVersionUID = 0;

    @C09CT("conversations")
    public final List<ConversationInfoV2> conversations;

    @C09CT("has_more")
    public final Boolean has_more;

    @C09CT("messages")
    public final List<MessageBody> messages;

    @C09CT("next_cursor")
    public final Long next_cursor;
    public static final ProtoAdapter<MessagesPerConversationSearchResponseBody> ADAPTER = new ProtoAdapter<MessagesPerConversationSearchResponseBody>() { // from class: X.1CjT
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final MessagesPerConversationSearchResponseBody decode(ProtoReader protoReader) {
            C2238541CjU c2238541CjU = new C2238541CjU();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                    c2238541CjU.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                } else {
                                    c2238541CjU.LJI = ProtoAdapter.BOOL.decode(protoReader);
                                }
                            } else {
                                c2238541CjU.LJFF = ProtoAdapter.INT64.decode(protoReader);
                            }
                        } else {
                            c2238541CjU.LJ.add(ConversationInfoV2.ADAPTER.decode(protoReader));
                        }
                    } else {
                        c2238541CjU.LIZLLL.add(MessageBody.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2238541CjU.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(MessagesPerConversationSearchResponseBody messagesPerConversationSearchResponseBody) {
            MessagesPerConversationSearchResponseBody messagesPerConversationSearchResponseBody2 = messagesPerConversationSearchResponseBody;
            return MessageBody.ADAPTER.asRepeated().encodedSizeWithTag(1, messagesPerConversationSearchResponseBody2.messages) + ConversationInfoV2.ADAPTER.asRepeated().encodedSizeWithTag(2, messagesPerConversationSearchResponseBody2.conversations) + ProtoAdapter.INT64.encodedSizeWithTag(3, messagesPerConversationSearchResponseBody2.next_cursor) + ProtoAdapter.BOOL.encodedSizeWithTag(4, messagesPerConversationSearchResponseBody2.has_more) + messagesPerConversationSearchResponseBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, MessagesPerConversationSearchResponseBody messagesPerConversationSearchResponseBody) {
            MessagesPerConversationSearchResponseBody messagesPerConversationSearchResponseBody2 = messagesPerConversationSearchResponseBody;
            MessageBody.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, messagesPerConversationSearchResponseBody2.messages);
            ConversationInfoV2.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, messagesPerConversationSearchResponseBody2.conversations);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, messagesPerConversationSearchResponseBody2.next_cursor);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, messagesPerConversationSearchResponseBody2.has_more);
            protoWriter.writeBytes(messagesPerConversationSearchResponseBody2.unknownFields());
        }
    };
    public static final Long DEFAULT_NEXT_CURSOR = 0L;
    public static final Boolean DEFAULT_HAS_MORE = Boolean.FALSE;

    @Override // com.squareup.wire.Message
    public C2238541CjU newBuilder() {
        C2238541CjU c2238541CjU = new C2238541CjU();
        c2238541CjU.LIZLLL = C1516540pZE.LIZJ("messages", this.messages);
        c2238541CjU.LJ = C1516540pZE.LIZJ("conversations", this.conversations);
        c2238541CjU.LJFF = this.next_cursor;
        c2238541CjU.LJI = this.has_more;
        c2238541CjU.addUnknownFields(unknownFields());
        return c2238541CjU;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<MessageBody> list = this.messages;
        if (list != null && !list.isEmpty()) {
            sb.append(", messages=");
            sb.append(this.messages);
        }
        List<ConversationInfoV2> list2 = this.conversations;
        if (list2 != null && !list2.isEmpty()) {
            sb.append(", conversations=");
            sb.append(this.conversations);
        }
        if (this.next_cursor != null) {
            sb.append(", next_cursor=");
            sb.append(this.next_cursor);
        }
        if (this.has_more != null) {
            sb.append(", has_more=");
            sb.append(this.has_more);
        }
        sb.replace(0, 2, "MessagesPerConversationSearchResponseBody{");
        sb.append('}');
        return sb.toString();
    }

    public MessagesPerConversationSearchResponseBody(List<MessageBody> list, List<ConversationInfoV2> list2, Long l, Boolean bool) {
        this(list, list2, l, bool, ByteString.EMPTY);
    }

    public MessagesPerConversationSearchResponseBody(List<MessageBody> list, List<ConversationInfoV2> list2, Long l, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.messages = C1516540pZE.LJFF("messages", list);
        this.conversations = C1516540pZE.LJFF("conversations", list2);
        this.next_cursor = l;
        this.has_more = bool;
    }
}
