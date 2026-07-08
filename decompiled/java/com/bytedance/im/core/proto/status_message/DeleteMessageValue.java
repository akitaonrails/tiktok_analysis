package com.bytedance.im.core.proto.status_message;

import X.C09CT;
import X.C867850Y2t;
import com.bytedance.im.core.proto.status_message.DeleteMessageValue;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public final class DeleteMessageValue extends Message<DeleteMessageValue, C867850Y2t> {
    public static final ProtoAdapter<DeleteMessageValue> ADAPTER = new ProtoAdapter<DeleteMessageValue>() { // from class: X.0Y2s
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final DeleteMessageValue decode(ProtoReader protoReader) {
            C867850Y2t c867850Y2t = new C867850Y2t();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c867850Y2t.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c867850Y2t.LIZLLL = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c867850Y2t.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(DeleteMessageValue deleteMessageValue) {
            DeleteMessageValue deleteMessageValue2 = deleteMessageValue;
            return ProtoAdapter.INT32.encodedSizeWithTag(1, deleteMessageValue2.read_badge_count) + deleteMessageValue2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final DeleteMessageValue redact(DeleteMessageValue deleteMessageValue) {
            C867850Y2t c867850Y2tNewBuilder = deleteMessageValue.newBuilder();
            c867850Y2tNewBuilder.clearUnknownFields();
            return c867850Y2tNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, DeleteMessageValue deleteMessageValue) {
            DeleteMessageValue deleteMessageValue2 = deleteMessageValue;
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, deleteMessageValue2.read_badge_count);
            protoWriter.writeBytes(deleteMessageValue2.unknownFields());
        }
    };
    public static final Integer DEFAULT_READ_BADGE_COUNT = 0;
    public static final long serialVersionUID = 0;

    @C09CT("read_badge_count")
    public final Integer read_badge_count;

    @Override // com.squareup.wire.Message
    public C867850Y2t newBuilder() {
        C867850Y2t c867850Y2t = new C867850Y2t();
        c867850Y2t.LIZLLL = this.read_badge_count;
        c867850Y2t.addUnknownFields(unknownFields());
        return c867850Y2t;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.read_badge_count != null) {
            sb.append(", read_badge_count=");
            sb.append(this.read_badge_count);
        }
        sb.replace(0, 2, "DeleteMessageValue{");
        sb.append('}');
        return sb.toString();
    }

    public DeleteMessageValue(Integer num) {
        this(num, ByteString.EMPTY);
    }

    public DeleteMessageValue(Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.read_badge_count = num;
    }
}
