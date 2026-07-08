package com.bytedance.im.core.proto;

import X.C09CT;
import X.C1516540pZE;
import X.C2251511DAn;
import com.bytedance.im.core.proto.GetMessagesCheckInfoInConversationResponseBody;
import com.bytedance.im.core.proto.MessagesCheckInfo;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: loaded from: classes36.dex */
public final class GetMessagesCheckInfoInConversationResponseBody extends Message<GetMessagesCheckInfoInConversationResponseBody, C2251511DAn> {
    public static final long serialVersionUID = 0;

    @C09CT("cursor_reverse_next")
    public final Long cursor_reverse_next;

    @C09CT("msgs_checkinfo_list")
    public final List<MessagesCheckInfo> msgs_checkinfo_list;

    @C09CT("real_msg_total_count")
    public final Integer real_msg_total_count;
    public static final ProtoAdapter<GetMessagesCheckInfoInConversationResponseBody> ADAPTER = new ProtoAdapter<GetMessagesCheckInfoInConversationResponseBody>() { // from class: X.1DAm
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final GetMessagesCheckInfoInConversationResponseBody decode(ProtoReader protoReader) {
            C2251511DAn c2251511DAn = new C2251511DAn();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 4) {
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c2251511DAn.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                c2251511DAn.LJFF = ProtoAdapter.INT64.decode(protoReader);
                            }
                        } else {
                            c2251511DAn.LJ = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c2251511DAn.LIZLLL.add(MessagesCheckInfo.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2251511DAn.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(GetMessagesCheckInfoInConversationResponseBody getMessagesCheckInfoInConversationResponseBody) {
            GetMessagesCheckInfoInConversationResponseBody getMessagesCheckInfoInConversationResponseBody2 = getMessagesCheckInfoInConversationResponseBody;
            return MessagesCheckInfo.ADAPTER.asRepeated().encodedSizeWithTag(1, getMessagesCheckInfoInConversationResponseBody2.msgs_checkinfo_list) + ProtoAdapter.INT32.encodedSizeWithTag(2, getMessagesCheckInfoInConversationResponseBody2.real_msg_total_count) + ProtoAdapter.INT64.encodedSizeWithTag(4, getMessagesCheckInfoInConversationResponseBody2.cursor_reverse_next) + getMessagesCheckInfoInConversationResponseBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, GetMessagesCheckInfoInConversationResponseBody getMessagesCheckInfoInConversationResponseBody) {
            GetMessagesCheckInfoInConversationResponseBody getMessagesCheckInfoInConversationResponseBody2 = getMessagesCheckInfoInConversationResponseBody;
            MessagesCheckInfo.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getMessagesCheckInfoInConversationResponseBody2.msgs_checkinfo_list);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, getMessagesCheckInfoInConversationResponseBody2.real_msg_total_count);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 4, getMessagesCheckInfoInConversationResponseBody2.cursor_reverse_next);
            protoWriter.writeBytes(getMessagesCheckInfoInConversationResponseBody2.unknownFields());
        }
    };
    public static final Integer DEFAULT_REAL_MSG_TOTAL_COUNT = 0;
    public static final Long DEFAULT_CURSOR_REVERSE_NEXT = 0L;

    @Override // com.squareup.wire.Message
    public C2251511DAn newBuilder() {
        C2251511DAn c2251511DAn = new C2251511DAn();
        c2251511DAn.LIZLLL = C1516540pZE.LIZJ("msgs_checkinfo_list", this.msgs_checkinfo_list);
        c2251511DAn.LJ = this.real_msg_total_count;
        c2251511DAn.LJFF = this.cursor_reverse_next;
        c2251511DAn.addUnknownFields(unknownFields());
        return c2251511DAn;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<MessagesCheckInfo> list = this.msgs_checkinfo_list;
        if (list != null && !list.isEmpty()) {
            sb.append(", msgs_checkinfo_list=");
            sb.append(this.msgs_checkinfo_list);
        }
        if (this.real_msg_total_count != null) {
            sb.append(", real_msg_total_count=");
            sb.append(this.real_msg_total_count);
        }
        if (this.cursor_reverse_next != null) {
            sb.append(", cursor_reverse_next=");
            sb.append(this.cursor_reverse_next);
        }
        sb.replace(0, 2, "GetMessagesCheckInfoInConversationResponseBody{");
        sb.append('}');
        return sb.toString();
    }

    public GetMessagesCheckInfoInConversationResponseBody(List<MessagesCheckInfo> list, Integer num, Long l) {
        this(list, num, l, ByteString.EMPTY);
    }

    public GetMessagesCheckInfoInConversationResponseBody(List<MessagesCheckInfo> list, Integer num, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.msgs_checkinfo_list = C1516540pZE.LJFF("msgs_checkinfo_list", list);
        this.real_msg_total_count = num;
        this.cursor_reverse_next = l;
    }
}
