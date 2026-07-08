package com.bytedance.im.core.proto.status_message;

import X.C09CT;
import X.C1CCF;
import com.bytedance.im.core.proto.status_message.RecallMessageValue;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class RecallMessageValue extends Message<RecallMessageValue, C1CCF> {
    public static final ProtoAdapter<RecallMessageValue> ADAPTER = new ProtoAdapter<RecallMessageValue>() { // from class: X.1CCE
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final RecallMessageValue decode(ProtoReader protoReader) {
            C1CCF c1ccf = new C1CCF();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c1ccf.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c1ccf.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1ccf.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(RecallMessageValue recallMessageValue) {
            RecallMessageValue recallMessageValue2 = recallMessageValue;
            return ProtoAdapter.INT64.encodedSizeWithTag(1, recallMessageValue2.recall_message_uid) + recallMessageValue2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final RecallMessageValue redact(RecallMessageValue recallMessageValue) {
            C1CCF c1ccfNewBuilder = recallMessageValue.newBuilder();
            c1ccfNewBuilder.clearUnknownFields();
            return c1ccfNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, RecallMessageValue recallMessageValue) {
            RecallMessageValue recallMessageValue2 = recallMessageValue;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, recallMessageValue2.recall_message_uid);
            protoWriter.writeBytes(recallMessageValue2.unknownFields());
        }
    };
    public static final Long DEFAULT_RECALL_MESSAGE_UID = 0L;
    public static final long serialVersionUID = 0;

    @C09CT("recall_message_uid")
    public final Long recall_message_uid;

    @Override // com.squareup.wire.Message
    public C1CCF newBuilder() {
        C1CCF c1ccf = new C1CCF();
        c1ccf.LIZLLL = this.recall_message_uid;
        c1ccf.addUnknownFields(unknownFields());
        return c1ccf;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.recall_message_uid != null) {
            sb.append(", recall_message_uid=");
            sb.append(this.recall_message_uid);
        }
        sb.replace(0, 2, "RecallMessageValue{");
        sb.append('}');
        return sb.toString();
    }

    public RecallMessageValue(Long l) {
        this(l, ByteString.EMPTY);
    }

    public RecallMessageValue(Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.recall_message_uid = l;
    }
}
