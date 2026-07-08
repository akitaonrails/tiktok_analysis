package com.bytedance.im.core.proto;

import X.C09CT;
import X.C0YKZ;
import X.C1516540pZE;
import X.C2281521ERy;
import com.bytedance.im.core.proto.AckMessage;
import com.bytedance.im.core.proto.BatchAckMessageRequestBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public final class BatchAckMessageRequestBody extends Message<BatchAckMessageRequestBody, C0YKZ> {
    public static final ProtoAdapter<BatchAckMessageRequestBody> ADAPTER;
    public static final long serialVersionUID = 0;

    @C09CT("ack_msgs")
    public final List<AckMessage> ack_msgs;

    static {
        ProtoAdapter<BatchAckMessageRequestBody> protoAdapter = new ProtoAdapter<BatchAckMessageRequestBody>() { // from class: X.0YKX
            {
                FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final BatchAckMessageRequestBody decode(ProtoReader protoReader) {
                C0YKZ c0ykz = new C0YKZ();
                long jBeginMessage = protoReader.beginMessage();
                while (true) {
                    int iNextTag = protoReader.nextTag();
                    if (iNextTag != -1) {
                        if (iNextTag != 1) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c0ykz.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c0ykz.LIZLLL.add(AckMessage.ADAPTER.decode(protoReader));
                        }
                    } else {
                        protoReader.endMessage(jBeginMessage);
                        return c0ykz.build();
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(BatchAckMessageRequestBody batchAckMessageRequestBody) {
                BatchAckMessageRequestBody batchAckMessageRequestBody2 = batchAckMessageRequestBody;
                return AckMessage.ADAPTER.asRepeated().encodedSizeWithTag(1, batchAckMessageRequestBody2.ack_msgs) + batchAckMessageRequestBody2.unknownFields().size();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, BatchAckMessageRequestBody batchAckMessageRequestBody) {
                BatchAckMessageRequestBody batchAckMessageRequestBody2 = batchAckMessageRequestBody;
                AckMessage.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, batchAckMessageRequestBody2.ack_msgs);
                protoWriter.writeBytes(batchAckMessageRequestBody2.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        C2281521ERy.LIZ.put(2059, protoAdapter);
    }

    public static void registerAdapter() {
        C2281521ERy.LIZ.put(2059, ADAPTER);
    }

    @Override // com.squareup.wire.Message
    public C0YKZ newBuilder() {
        C0YKZ c0ykz = new C0YKZ();
        c0ykz.LIZLLL = C1516540pZE.LIZJ("ack_msgs", this.ack_msgs);
        c0ykz.addUnknownFields(unknownFields());
        return c0ykz;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<AckMessage> list = this.ack_msgs;
        if (list != null && !list.isEmpty()) {
            sb.append(", ack_msgs=");
            sb.append(this.ack_msgs);
        }
        sb.replace(0, 2, "BatchAckMessageRequestBody{");
        sb.append('}');
        return sb.toString();
    }

    public BatchAckMessageRequestBody(List<AckMessage> list) {
        this(list, ByteString.EMPTY);
    }

    public BatchAckMessageRequestBody(List<AckMessage> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.ack_msgs = C1516540pZE.LJFF("ack_msgs", list);
    }
}
