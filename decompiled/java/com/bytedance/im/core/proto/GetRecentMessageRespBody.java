package com.bytedance.im.core.proto;

import X.C09CT;
import X.C0YSS;
import X.C1516540pZE;
import com.bytedance.im.core.proto.ConversationRecentMessage;
import com.bytedance.im.core.proto.GetRecentMessageRespBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public final class GetRecentMessageRespBody extends Message<GetRecentMessageRespBody, C0YSS> {
    public static final long serialVersionUID = 0;

    @C09CT("has_more")
    public final Boolean has_more;

    @C09CT("messages")
    public final List<ConversationRecentMessage> messages;

    @C09CT("next_conversation_version")
    public final Long next_conversation_version;
    public static final ProtoAdapter<GetRecentMessageRespBody> ADAPTER = new ProtoAdapter<GetRecentMessageRespBody>() { // from class: X.0YSR
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final GetRecentMessageRespBody decode(ProtoReader protoReader) {
            C0YSS c0yss = new C0YSS();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c0yss.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                c0yss.LJFF = ProtoAdapter.BOOL.decode(protoReader);
                            }
                        } else {
                            c0yss.LJ.add(ConversationRecentMessage.ADAPTER.decode(protoReader));
                        }
                    } else {
                        c0yss.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c0yss.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(GetRecentMessageRespBody getRecentMessageRespBody) {
            GetRecentMessageRespBody getRecentMessageRespBody2 = getRecentMessageRespBody;
            return ProtoAdapter.INT64.encodedSizeWithTag(1, getRecentMessageRespBody2.next_conversation_version) + ConversationRecentMessage.ADAPTER.asRepeated().encodedSizeWithTag(2, getRecentMessageRespBody2.messages) + ProtoAdapter.BOOL.encodedSizeWithTag(3, getRecentMessageRespBody2.has_more) + getRecentMessageRespBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, GetRecentMessageRespBody getRecentMessageRespBody) {
            GetRecentMessageRespBody getRecentMessageRespBody2 = getRecentMessageRespBody;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, getRecentMessageRespBody2.next_conversation_version);
            ConversationRecentMessage.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, getRecentMessageRespBody2.messages);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, getRecentMessageRespBody2.has_more);
            protoWriter.writeBytes(getRecentMessageRespBody2.unknownFields());
        }
    };
    public static final Long DEFAULT_NEXT_CONVERSATION_VERSION = 0L;
    public static final Boolean DEFAULT_HAS_MORE = Boolean.FALSE;

    @Override // com.squareup.wire.Message
    public C0YSS newBuilder() {
        C0YSS c0yss = new C0YSS();
        c0yss.LIZLLL = this.next_conversation_version;
        c0yss.LJ = C1516540pZE.LIZJ("messages", this.messages);
        c0yss.LJFF = this.has_more;
        c0yss.addUnknownFields(unknownFields());
        return c0yss;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", next_conversation_version=");
        sb.append(this.next_conversation_version);
        List<ConversationRecentMessage> list = this.messages;
        if (list != null && !list.isEmpty()) {
            sb.append(", messages=");
            sb.append(this.messages);
        }
        sb.append(", has_more=");
        sb.append(this.has_more);
        sb.replace(0, 2, "GetRecentMessageRespBody{");
        sb.append('}');
        return sb.toString();
    }

    public GetRecentMessageRespBody(Long l, List<ConversationRecentMessage> list, Boolean bool) {
        this(l, list, bool, ByteString.EMPTY);
    }

    public GetRecentMessageRespBody(Long l, List<ConversationRecentMessage> list, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.next_conversation_version = l;
        this.messages = C1516540pZE.LJFF("messages", list);
        this.has_more = bool;
    }
}
