package com.bytedance.im.core.proto;

import X.C09CT;
import X.C870340YCi;
import com.bytedance.im.core.proto.MessageKey;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public final class MessageKey extends Message<MessageKey, C870340YCi> {
    public static final ProtoAdapter<MessageKey> ADAPTER = new ProtoAdapter<MessageKey>() { // from class: X.0YCj
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final MessageKey decode(ProtoReader protoReader) {
            C870340YCi c870340YCi = new C870340YCi();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c870340YCi.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                c870340YCi.LJFF = ProtoAdapter.INT64.decode(protoReader);
                            }
                        } else {
                            c870340YCi.LJ = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c870340YCi.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c870340YCi.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(MessageKey messageKey) {
            MessageKey messageKey2 = messageKey;
            int iEncodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, messageKey2.conversation_id);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, messageKey2.conversation_short_id) + protoAdapter.encodedSizeWithTag(3, messageKey2.server_message_id) + messageKey2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, MessageKey messageKey) {
            MessageKey messageKey2 = messageKey;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, messageKey2.conversation_id);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 2, messageKey2.conversation_short_id);
            protoAdapter.encodeWithTag(protoWriter, 3, messageKey2.server_message_id);
            protoWriter.writeBytes(messageKey2.unknownFields());
        }
    };
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final Long DEFAULT_SERVER_MESSAGE_ID = 0L;
    public static final long serialVersionUID = 0;

    @C09CT("conversation_id")
    public final String conversation_id;

    @C09CT("conversation_short_id")
    public final Long conversation_short_id;

    @C09CT("server_message_id")
    public final Long server_message_id;

    @Override // com.squareup.wire.Message
    public C870340YCi newBuilder() {
        C870340YCi c870340YCi = new C870340YCi();
        c870340YCi.LIZLLL = this.conversation_id;
        c870340YCi.LJ = this.conversation_short_id;
        c870340YCi.LJFF = this.server_message_id;
        c870340YCi.addUnknownFields(unknownFields());
        return c870340YCi;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", conversation_id=");
        sb.append(this.conversation_id);
        sb.append(", conversation_short_id=");
        sb.append(this.conversation_short_id);
        sb.append(", server_message_id=");
        sb.append(this.server_message_id);
        sb.replace(0, 2, "MessageKey{");
        sb.append('}');
        return sb.toString();
    }

    public MessageKey(String str, Long l, Long l2) {
        this(str, l, l2, ByteString.EMPTY);
    }

    public MessageKey(String str, Long l, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_id = str;
        this.conversation_short_id = l;
        this.server_message_id = l2;
    }
}
