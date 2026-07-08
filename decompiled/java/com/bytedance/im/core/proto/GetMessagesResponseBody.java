package com.bytedance.im.core.proto;

import X.C09CT;
import X.C0YU6;
import X.C1516540pZE;
import com.bytedance.im.core.proto.GetMessageError;
import com.bytedance.im.core.proto.GetMessagesResponseBody;
import com.bytedance.im.core.proto.MessageBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public final class GetMessagesResponseBody extends Message<GetMessagesResponseBody, C0YU6> {
    public static final ProtoAdapter<GetMessagesResponseBody> ADAPTER = new ProtoAdapter<GetMessagesResponseBody>() { // from class: X.0YU5
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final GetMessagesResponseBody decode(ProtoReader protoReader) {
            C0YU6 c0yu6 = new C0YU6();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c0yu6.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c0yu6.LJ.add(GetMessageError.ADAPTER.decode(protoReader));
                        }
                    } else {
                        c0yu6.LIZLLL.add(MessageBody.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c0yu6.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(GetMessagesResponseBody getMessagesResponseBody) {
            GetMessagesResponseBody getMessagesResponseBody2 = getMessagesResponseBody;
            return MessageBody.ADAPTER.asRepeated().encodedSizeWithTag(1, getMessagesResponseBody2.messages) + GetMessageError.ADAPTER.asRepeated().encodedSizeWithTag(2, getMessagesResponseBody2.errors) + getMessagesResponseBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, GetMessagesResponseBody getMessagesResponseBody) {
            GetMessagesResponseBody getMessagesResponseBody2 = getMessagesResponseBody;
            MessageBody.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getMessagesResponseBody2.messages);
            GetMessageError.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, getMessagesResponseBody2.errors);
            protoWriter.writeBytes(getMessagesResponseBody2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @C09CT("errors")
    public final List<GetMessageError> errors;

    @C09CT("messages")
    public final List<MessageBody> messages;

    @Override // com.squareup.wire.Message
    public C0YU6 newBuilder() {
        C0YU6 c0yu6 = new C0YU6();
        c0yu6.LIZLLL = C1516540pZE.LIZJ("messages", this.messages);
        c0yu6.LJ = C1516540pZE.LIZJ("errors", this.errors);
        c0yu6.addUnknownFields(unknownFields());
        return c0yu6;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<MessageBody> list = this.messages;
        if (list != null && !list.isEmpty()) {
            sb.append(", messages=");
            sb.append(this.messages);
        }
        List<GetMessageError> list2 = this.errors;
        if (list2 != null && !list2.isEmpty()) {
            sb.append(", errors=");
            sb.append(this.errors);
        }
        sb.replace(0, 2, "GetMessagesResponseBody{");
        sb.append('}');
        return sb.toString();
    }

    public GetMessagesResponseBody(List<MessageBody> list, List<GetMessageError> list2) {
        this(list, list2, ByteString.EMPTY);
    }

    public GetMessagesResponseBody(List<MessageBody> list, List<GetMessageError> list2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.messages = C1516540pZE.LJFF("messages", list);
        this.errors = C1516540pZE.LJFF("errors", list2);
    }
}
