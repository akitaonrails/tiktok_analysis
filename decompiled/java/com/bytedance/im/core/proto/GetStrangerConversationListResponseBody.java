package com.bytedance.im.core.proto;

import X.C09CT;
import X.C1516540pZE;
import X.C875270YVh;
import com.bytedance.im.core.proto.GetStrangerConversationListResponseBody;
import com.bytedance.im.core.proto.StrangerConversation;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public final class GetStrangerConversationListResponseBody extends Message<GetStrangerConversationListResponseBody, C875270YVh> {
    public static final long serialVersionUID = 0;

    @C09CT("conversation_list")
    public final List<StrangerConversation> conversation_list;

    @C09CT("has_more")
    public final Boolean has_more;

    @C09CT("next_cursor")
    public final Long next_cursor;

    @C09CT("total_unread")
    public final Integer total_unread;
    public static final ProtoAdapter<GetStrangerConversationListResponseBody> ADAPTER = new ProtoAdapter<GetStrangerConversationListResponseBody>() { // from class: X.0YVg
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final GetStrangerConversationListResponseBody decode(ProtoReader protoReader) {
            C875270YVh c875270YVh = new C875270YVh();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                    c875270YVh.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                } else {
                                    c875270YVh.LJI.add(StrangerConversation.ADAPTER.decode(protoReader));
                                }
                            } else {
                                c875270YVh.LJFF = ProtoAdapter.INT32.decode(protoReader);
                            }
                        } else {
                            c875270YVh.LJ = ProtoAdapter.BOOL.decode(protoReader);
                        }
                    } else {
                        c875270YVh.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c875270YVh.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(GetStrangerConversationListResponseBody getStrangerConversationListResponseBody) {
            GetStrangerConversationListResponseBody getStrangerConversationListResponseBody2 = getStrangerConversationListResponseBody;
            return ProtoAdapter.INT64.encodedSizeWithTag(1, getStrangerConversationListResponseBody2.next_cursor) + ProtoAdapter.BOOL.encodedSizeWithTag(2, getStrangerConversationListResponseBody2.has_more) + ProtoAdapter.INT32.encodedSizeWithTag(3, getStrangerConversationListResponseBody2.total_unread) + StrangerConversation.ADAPTER.asRepeated().encodedSizeWithTag(4, getStrangerConversationListResponseBody2.conversation_list) + getStrangerConversationListResponseBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, GetStrangerConversationListResponseBody getStrangerConversationListResponseBody) {
            GetStrangerConversationListResponseBody getStrangerConversationListResponseBody2 = getStrangerConversationListResponseBody;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, getStrangerConversationListResponseBody2.next_cursor);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, getStrangerConversationListResponseBody2.has_more);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, getStrangerConversationListResponseBody2.total_unread);
            StrangerConversation.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, getStrangerConversationListResponseBody2.conversation_list);
            protoWriter.writeBytes(getStrangerConversationListResponseBody2.unknownFields());
        }
    };
    public static final Long DEFAULT_NEXT_CURSOR = 0L;
    public static final Boolean DEFAULT_HAS_MORE = Boolean.FALSE;
    public static final Integer DEFAULT_TOTAL_UNREAD = 0;

    @Override // com.squareup.wire.Message
    public C875270YVh newBuilder() {
        C875270YVh c875270YVh = new C875270YVh();
        c875270YVh.LIZLLL = this.next_cursor;
        c875270YVh.LJ = this.has_more;
        c875270YVh.LJFF = this.total_unread;
        c875270YVh.LJI = C1516540pZE.LIZJ("conversation_list", this.conversation_list);
        c875270YVh.addUnknownFields(unknownFields());
        return c875270YVh;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.next_cursor != null) {
            sb.append(", next_cursor=");
            sb.append(this.next_cursor);
        }
        if (this.has_more != null) {
            sb.append(", has_more=");
            sb.append(this.has_more);
        }
        if (this.total_unread != null) {
            sb.append(", total_unread=");
            sb.append(this.total_unread);
        }
        List<StrangerConversation> list = this.conversation_list;
        if (list != null && !list.isEmpty()) {
            sb.append(", conversation_list=");
            sb.append(this.conversation_list);
        }
        sb.replace(0, 2, "GetStrangerConversationListResponseBody{");
        sb.append('}');
        return sb.toString();
    }

    public GetStrangerConversationListResponseBody(Long l, Boolean bool, Integer num, List<StrangerConversation> list) {
        this(l, bool, num, list, ByteString.EMPTY);
    }

    public GetStrangerConversationListResponseBody(Long l, Boolean bool, Integer num, List<StrangerConversation> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.next_cursor = l;
        this.has_more = bool;
        this.total_unread = num;
        this.conversation_list = C1516540pZE.LJFF("conversation_list", list);
    }
}
