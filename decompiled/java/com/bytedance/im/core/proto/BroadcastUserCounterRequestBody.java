package com.bytedance.im.core.proto;

import X.C09CT;
import X.C1516540pZE;
import X.C1CKB;
import com.bytedance.im.core.proto.BroadcastUserCounterRequestBody;
import com.bytedance.im.core.proto.ConversationRequest;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class BroadcastUserCounterRequestBody extends Message<BroadcastUserCounterRequestBody, C1CKB> {
    public static final ProtoAdapter<BroadcastUserCounterRequestBody> ADAPTER = new ProtoAdapter<BroadcastUserCounterRequestBody>() { // from class: X.1CKA
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final BroadcastUserCounterRequestBody decode(ProtoReader protoReader) {
            C1CKB c1ckb = new C1CKB();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c1ckb.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c1ckb.LIZLLL.add(ConversationRequest.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1ckb.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(BroadcastUserCounterRequestBody broadcastUserCounterRequestBody) {
            BroadcastUserCounterRequestBody broadcastUserCounterRequestBody2 = broadcastUserCounterRequestBody;
            return ConversationRequest.ADAPTER.asRepeated().encodedSizeWithTag(1, broadcastUserCounterRequestBody2.conversations) + broadcastUserCounterRequestBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, BroadcastUserCounterRequestBody broadcastUserCounterRequestBody) {
            BroadcastUserCounterRequestBody broadcastUserCounterRequestBody2 = broadcastUserCounterRequestBody;
            ConversationRequest.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, broadcastUserCounterRequestBody2.conversations);
            protoWriter.writeBytes(broadcastUserCounterRequestBody2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @C09CT("conversations")
    public final List<ConversationRequest> conversations;

    @Override // com.squareup.wire.Message
    public C1CKB newBuilder() {
        C1CKB c1ckb = new C1CKB();
        c1ckb.LIZLLL = C1516540pZE.LIZJ("conversations", this.conversations);
        c1ckb.addUnknownFields(unknownFields());
        return c1ckb;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<ConversationRequest> list = this.conversations;
        if (list != null && !list.isEmpty()) {
            sb.append(", conversations=");
            sb.append(this.conversations);
        }
        sb.replace(0, 2, "BroadcastUserCounterRequestBody{");
        sb.append('}');
        return sb.toString();
    }

    public BroadcastUserCounterRequestBody(List<ConversationRequest> list) {
        this(list, ByteString.EMPTY);
    }

    public BroadcastUserCounterRequestBody(List<ConversationRequest> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversations = C1516540pZE.LJFF("conversations", list);
    }
}
