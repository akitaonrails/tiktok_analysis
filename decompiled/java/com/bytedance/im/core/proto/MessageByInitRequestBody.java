package com.bytedance.im.core.proto;

import X.C09CT;
import X.C2226391CBx;
import com.bytedance.im.core.proto.MessageByInitRequestBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class MessageByInitRequestBody extends Message<MessageByInitRequestBody, C2226391CBx> {
    public static final ProtoAdapter<MessageByInitRequestBody> ADAPTER = new ProtoAdapter<MessageByInitRequestBody>() { // from class: X.1CBw
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final MessageByInitRequestBody decode(ProtoReader protoReader) {
            C2226391CBx c2226391CBx = new C2226391CBx();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c2226391CBx.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c2226391CBx.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2226391CBx.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(MessageByInitRequestBody messageByInitRequestBody) {
            MessageByInitRequestBody messageByInitRequestBody2 = messageByInitRequestBody;
            return ProtoAdapter.INT64.encodedSizeWithTag(1, messageByInitRequestBody2.version) + messageByInitRequestBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, MessageByInitRequestBody messageByInitRequestBody) {
            MessageByInitRequestBody messageByInitRequestBody2 = messageByInitRequestBody;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, messageByInitRequestBody2.version);
            protoWriter.writeBytes(messageByInitRequestBody2.unknownFields());
        }
    };
    public static final Long DEFAULT_VERSION = 0L;
    public static final long serialVersionUID = 0;

    @C09CT("version")
    public final Long version;

    @Override // com.squareup.wire.Message
    public C2226391CBx newBuilder() {
        C2226391CBx c2226391CBx = new C2226391CBx();
        c2226391CBx.LIZLLL = this.version;
        c2226391CBx.addUnknownFields(unknownFields());
        return c2226391CBx;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.version != null) {
            sb.append(", version=");
            sb.append(this.version);
        }
        sb.replace(0, 2, "MessageByInitRequestBody{");
        sb.append('}');
        return sb.toString();
    }

    public MessageByInitRequestBody(Long l) {
        this(l, ByteString.EMPTY);
    }

    public MessageByInitRequestBody(Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.version = l;
    }
}
