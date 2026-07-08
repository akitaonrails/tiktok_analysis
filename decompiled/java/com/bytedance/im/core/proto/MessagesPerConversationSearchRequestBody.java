package com.bytedance.im.core.proto;

import X.C09CT;
import X.C1516540pZE;
import X.C2229321CNe;
import com.bytedance.im.core.proto.MessagesPerConversationSearchRequestBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class MessagesPerConversationSearchRequestBody extends Message<MessagesPerConversationSearchRequestBody, C2229321CNe> {
    public static final ProtoAdapter<MessagesPerConversationSearchRequestBody> ADAPTER = new ProtoAdapter<MessagesPerConversationSearchRequestBody>() { // from class: X.1CNd
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final MessagesPerConversationSearchRequestBody decode(ProtoReader protoReader) {
            C2229321CNe c2229321CNe = new C2229321CNe();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c2229321CNe.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                c2229321CNe.LJFF.add(ProtoAdapter.STRING.decode(protoReader));
                            }
                        } else {
                            c2229321CNe.LJ = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c2229321CNe.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2229321CNe.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(MessagesPerConversationSearchRequestBody messagesPerConversationSearchRequestBody) {
            MessagesPerConversationSearchRequestBody messagesPerConversationSearchRequestBody2 = messagesPerConversationSearchRequestBody;
            return ProtoAdapter.INT64.encodedSizeWithTag(1, messagesPerConversationSearchRequestBody2.cursor) + ProtoAdapter.INT32.encodedSizeWithTag(2, messagesPerConversationSearchRequestBody2.limit) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(3, messagesPerConversationSearchRequestBody2.tags) + messagesPerConversationSearchRequestBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, MessagesPerConversationSearchRequestBody messagesPerConversationSearchRequestBody) {
            MessagesPerConversationSearchRequestBody messagesPerConversationSearchRequestBody2 = messagesPerConversationSearchRequestBody;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, messagesPerConversationSearchRequestBody2.cursor);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, messagesPerConversationSearchRequestBody2.limit);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 3, messagesPerConversationSearchRequestBody2.tags);
            protoWriter.writeBytes(messagesPerConversationSearchRequestBody2.unknownFields());
        }
    };
    public static final Long DEFAULT_CURSOR = 0L;
    public static final Integer DEFAULT_LIMIT = 0;
    public static final long serialVersionUID = 0;

    @C09CT("cursor")
    public final Long cursor;

    @C09CT("limit")
    public final Integer limit;

    @C09CT("tags")
    public final List<String> tags;

    @Override // com.squareup.wire.Message
    public C2229321CNe newBuilder() {
        C2229321CNe c2229321CNe = new C2229321CNe();
        c2229321CNe.LIZLLL = this.cursor;
        c2229321CNe.LJ = this.limit;
        c2229321CNe.LJFF = C1516540pZE.LIZJ("tags", this.tags);
        c2229321CNe.addUnknownFields(unknownFields());
        return c2229321CNe;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.cursor != null) {
            sb.append(", cursor=");
            sb.append(this.cursor);
        }
        sb.append(", limit=");
        sb.append(this.limit);
        List<String> list = this.tags;
        if (list != null && !list.isEmpty()) {
            sb.append(", tags=");
            sb.append(this.tags);
        }
        sb.replace(0, 2, "MessagesPerConversationSearchRequestBody{");
        sb.append('}');
        return sb.toString();
    }

    public MessagesPerConversationSearchRequestBody(Long l, Integer num, List<String> list) {
        this(l, num, list, ByteString.EMPTY);
    }

    public MessagesPerConversationSearchRequestBody(Long l, Integer num, List<String> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.cursor = l;
        this.limit = num;
        this.tags = C1516540pZE.LJFF("tags", list);
    }
}
