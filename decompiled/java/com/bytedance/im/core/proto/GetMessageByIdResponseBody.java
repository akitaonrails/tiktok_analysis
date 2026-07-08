package com.bytedance.im.core.proto;

import X.C09CT;
import X.C0YQR;
import com.bytedance.im.core.proto.GetMessageByIdResponseBody;
import com.bytedance.im.core.proto.MessageInfo;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public final class GetMessageByIdResponseBody extends Message<GetMessageByIdResponseBody, C0YQR> {
    public static final ProtoAdapter<GetMessageByIdResponseBody> ADAPTER = new ProtoAdapter<GetMessageByIdResponseBody>() { // from class: X.0YQQ
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final GetMessageByIdResponseBody decode(ProtoReader protoReader) {
            C0YQR c0yqr = new C0YQR();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c0yqr.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c0yqr.LIZLLL = MessageInfo.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c0yqr.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(GetMessageByIdResponseBody getMessageByIdResponseBody) {
            GetMessageByIdResponseBody getMessageByIdResponseBody2 = getMessageByIdResponseBody;
            return MessageInfo.ADAPTER.encodedSizeWithTag(1, getMessageByIdResponseBody2.msg_info) + getMessageByIdResponseBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, GetMessageByIdResponseBody getMessageByIdResponseBody) {
            GetMessageByIdResponseBody getMessageByIdResponseBody2 = getMessageByIdResponseBody;
            MessageInfo.ADAPTER.encodeWithTag(protoWriter, 1, getMessageByIdResponseBody2.msg_info);
            protoWriter.writeBytes(getMessageByIdResponseBody2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @C09CT("msg_info")
    public final MessageInfo msg_info;

    @Override // com.squareup.wire.Message
    public C0YQR newBuilder() {
        C0YQR c0yqr = new C0YQR();
        c0yqr.LIZLLL = this.msg_info;
        c0yqr.addUnknownFields(unknownFields());
        return c0yqr;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.msg_info != null) {
            sb.append(", msg_info=");
            sb.append(this.msg_info);
        }
        sb.replace(0, 2, "GetMessageByIdResponseBody{");
        sb.append('}');
        return sb.toString();
    }

    public GetMessageByIdResponseBody(MessageInfo messageInfo) {
        this(messageInfo, ByteString.EMPTY);
    }

    public GetMessageByIdResponseBody(MessageInfo messageInfo, ByteString byteString) {
        super(ADAPTER, byteString);
        this.msg_info = messageInfo;
    }
}
