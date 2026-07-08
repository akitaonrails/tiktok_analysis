package com.bytedance.im.core.proto.status_message;

import X.C09CT;
import X.C867810Y2p;
import com.bytedance.im.core.proto.status_message.DeleteConversationValue;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public final class DeleteConversationValue extends Message<DeleteConversationValue, C867810Y2p> {
    public static final long serialVersionUID = 0;

    @C09CT("conversation_min_index")
    public final Long conversation_min_index;

    @C09CT("read_badge_count")
    public final Integer read_badge_count;
    public static final ProtoAdapter<DeleteConversationValue> ADAPTER = new ProtoAdapter<DeleteConversationValue>() { // from class: X.0Y2o
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final DeleteConversationValue decode(ProtoReader protoReader) {
            C867810Y2p c867810Y2p = new C867810Y2p();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c867810Y2p.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c867810Y2p.LJ = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c867810Y2p.LIZLLL = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c867810Y2p.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(DeleteConversationValue deleteConversationValue) {
            DeleteConversationValue deleteConversationValue2 = deleteConversationValue;
            return ProtoAdapter.INT32.encodedSizeWithTag(1, deleteConversationValue2.read_badge_count) + ProtoAdapter.INT64.encodedSizeWithTag(2, deleteConversationValue2.conversation_min_index) + deleteConversationValue2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final DeleteConversationValue redact(DeleteConversationValue deleteConversationValue) {
            C867810Y2p c867810Y2pNewBuilder = deleteConversationValue.newBuilder();
            c867810Y2pNewBuilder.clearUnknownFields();
            return c867810Y2pNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, DeleteConversationValue deleteConversationValue) {
            DeleteConversationValue deleteConversationValue2 = deleteConversationValue;
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, deleteConversationValue2.read_badge_count);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, deleteConversationValue2.conversation_min_index);
            protoWriter.writeBytes(deleteConversationValue2.unknownFields());
        }
    };
    public static final Integer DEFAULT_READ_BADGE_COUNT = 0;
    public static final Long DEFAULT_CONVERSATION_MIN_INDEX = 0L;

    @Override // com.squareup.wire.Message
    public C867810Y2p newBuilder() {
        C867810Y2p c867810Y2p = new C867810Y2p();
        c867810Y2p.LIZLLL = this.read_badge_count;
        c867810Y2p.LJ = this.conversation_min_index;
        c867810Y2p.addUnknownFields(unknownFields());
        return c867810Y2p;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.read_badge_count != null) {
            sb.append(", read_badge_count=");
            sb.append(this.read_badge_count);
        }
        if (this.conversation_min_index != null) {
            sb.append(", conversation_min_index=");
            sb.append(this.conversation_min_index);
        }
        sb.replace(0, 2, "DeleteConversationValue{");
        sb.append('}');
        return sb.toString();
    }

    public DeleteConversationValue(Integer num, Long l) {
        this(num, l, ByteString.EMPTY);
    }

    public DeleteConversationValue(Integer num, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.read_badge_count = num;
        this.conversation_min_index = l;
    }
}
