package com.bytedance.im.core.proto;

import X.C09CT;
import X.C0YQT;
import X.C1516540pZE;
import com.bytedance.im.core.proto.GetStrangerMessagesResponseBody;
import com.bytedance.im.core.proto.MessageBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public final class GetStrangerMessagesResponseBody extends Message<GetStrangerMessagesResponseBody, C0YQT> {
    public static final ProtoAdapter<GetStrangerMessagesResponseBody> ADAPTER = new ProtoAdapter<GetStrangerMessagesResponseBody>() { // from class: X.0YQS
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final GetStrangerMessagesResponseBody decode(ProtoReader protoReader) {
            C0YQT c0yqt = new C0YQT();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 3) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c0yqt.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c0yqt.LIZLLL.add(MessageBody.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c0yqt.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(GetStrangerMessagesResponseBody getStrangerMessagesResponseBody) {
            GetStrangerMessagesResponseBody getStrangerMessagesResponseBody2 = getStrangerMessagesResponseBody;
            return MessageBody.ADAPTER.asRepeated().encodedSizeWithTag(3, getStrangerMessagesResponseBody2.messages) + getStrangerMessagesResponseBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, GetStrangerMessagesResponseBody getStrangerMessagesResponseBody) {
            GetStrangerMessagesResponseBody getStrangerMessagesResponseBody2 = getStrangerMessagesResponseBody;
            MessageBody.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, getStrangerMessagesResponseBody2.messages);
            protoWriter.writeBytes(getStrangerMessagesResponseBody2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @C09CT("messages")
    public final List<MessageBody> messages;

    @Override // com.squareup.wire.Message
    public C0YQT newBuilder() {
        C0YQT c0yqt = new C0YQT();
        c0yqt.LIZLLL = C1516540pZE.LIZJ("messages", this.messages);
        c0yqt.addUnknownFields(unknownFields());
        return c0yqt;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<MessageBody> list = this.messages;
        if (list != null && !list.isEmpty()) {
            sb.append(", messages=");
            sb.append(this.messages);
        }
        sb.replace(0, 2, "GetStrangerMessagesResponseBody{");
        sb.append('}');
        return sb.toString();
    }

    public GetStrangerMessagesResponseBody(List<MessageBody> list) {
        this(list, ByteString.EMPTY);
    }

    public GetStrangerMessagesResponseBody(List<MessageBody> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.messages = C1516540pZE.LJFF("messages", list);
    }
}
