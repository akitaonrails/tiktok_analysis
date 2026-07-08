package com.bytedance.im.core.proto;

import X.C09CT;
import X.C875160YUw;
import com.bytedance.im.core.proto.MessageCheckInfoV2;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public final class MessageCheckInfoV2 extends Message<MessageCheckInfoV2, C875160YUw> {
    public static final long serialVersionUID = 0;

    @C09CT("index_in_conv")
    public final Long index_in_conv;

    @C09CT("msg_id")
    public final Long msg_id;
    public static final ProtoAdapter<MessageCheckInfoV2> ADAPTER = new ProtoAdapter<MessageCheckInfoV2>() { // from class: X.0YUv
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final MessageCheckInfoV2 decode(ProtoReader protoReader) {
            C875160YUw c875160YUw = new C875160YUw();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c875160YUw.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c875160YUw.LJ = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c875160YUw.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c875160YUw.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(MessageCheckInfoV2 messageCheckInfoV2) {
            MessageCheckInfoV2 messageCheckInfoV22 = messageCheckInfoV2;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            return protoAdapter.encodedSizeWithTag(1, messageCheckInfoV22.msg_id) + protoAdapter.encodedSizeWithTag(2, messageCheckInfoV22.index_in_conv) + messageCheckInfoV22.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, MessageCheckInfoV2 messageCheckInfoV2) {
            MessageCheckInfoV2 messageCheckInfoV22 = messageCheckInfoV2;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 1, messageCheckInfoV22.msg_id);
            protoAdapter.encodeWithTag(protoWriter, 2, messageCheckInfoV22.index_in_conv);
            protoWriter.writeBytes(messageCheckInfoV22.unknownFields());
        }
    };
    public static final Long DEFAULT_MSG_ID = 0L;
    public static final Long DEFAULT_INDEX_IN_CONV = 0L;

    @Override // com.squareup.wire.Message
    public C875160YUw newBuilder() {
        C875160YUw c875160YUw = new C875160YUw();
        c875160YUw.LIZLLL = this.msg_id;
        c875160YUw.LJ = this.index_in_conv;
        c875160YUw.addUnknownFields(unknownFields());
        return c875160YUw;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", msg_id=");
        sb.append(this.msg_id);
        sb.append(", index_in_conv=");
        sb.append(this.index_in_conv);
        sb.replace(0, 2, "MessageCheckInfoV2{");
        sb.append('}');
        return sb.toString();
    }

    public MessageCheckInfoV2(Long l, Long l2) {
        this(l, l2, ByteString.EMPTY);
    }

    public MessageCheckInfoV2(Long l, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.msg_id = l;
        this.index_in_conv = l2;
    }
}
