package com.bytedance.im.core.proto;

import X.C09CT;
import X.C2238501CjQ;
import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.im.core.proto.StrangerNewMessageNotify;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class StrangerNewMessageNotify extends Message<StrangerNewMessageNotify, C2238501CjQ> {
    public static final ProtoAdapter<StrangerNewMessageNotify> ADAPTER = new ProtoAdapter<StrangerNewMessageNotify>() { // from class: X.1CjP
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final StrangerNewMessageNotify decode(ProtoReader protoReader) {
            C2238501CjQ c2238501CjQ = new C2238501CjQ();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 2) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c2238501CjQ.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c2238501CjQ.LIZLLL = MessageBody.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2238501CjQ.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(StrangerNewMessageNotify strangerNewMessageNotify) {
            StrangerNewMessageNotify strangerNewMessageNotify2 = strangerNewMessageNotify;
            return MessageBody.ADAPTER.encodedSizeWithTag(2, strangerNewMessageNotify2.message) + strangerNewMessageNotify2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, StrangerNewMessageNotify strangerNewMessageNotify) {
            StrangerNewMessageNotify strangerNewMessageNotify2 = strangerNewMessageNotify;
            MessageBody.ADAPTER.encodeWithTag(protoWriter, 2, strangerNewMessageNotify2.message);
            protoWriter.writeBytes(strangerNewMessageNotify2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @C09CT("message")
    public final MessageBody message;

    @Override // com.squareup.wire.Message
    public C2238501CjQ newBuilder() {
        C2238501CjQ c2238501CjQ = new C2238501CjQ();
        c2238501CjQ.LIZLLL = this.message;
        c2238501CjQ.addUnknownFields(unknownFields());
        return c2238501CjQ;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.message != null) {
            sb.append(", message=");
            sb.append(this.message);
        }
        sb.replace(0, 2, "StrangerNewMessageNotify{");
        sb.append('}');
        return sb.toString();
    }

    public StrangerNewMessageNotify(MessageBody messageBody) {
        this(messageBody, ByteString.EMPTY);
    }

    public StrangerNewMessageNotify(MessageBody messageBody, ByteString byteString) {
        super(ADAPTER, byteString);
        this.message = messageBody;
    }
}
