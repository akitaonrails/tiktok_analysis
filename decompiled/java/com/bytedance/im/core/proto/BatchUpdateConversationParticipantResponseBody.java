package com.bytedance.im.core.proto;

import X.C09CT;
import X.C1516540pZE;
import X.C1DB8;
import com.bytedance.im.core.proto.BatchUpdateConversationParticipantResponseBody;
import com.bytedance.im.core.proto.UpdateConversationParticipantResult;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: loaded from: classes36.dex */
public final class BatchUpdateConversationParticipantResponseBody extends Message<BatchUpdateConversationParticipantResponseBody, C1DB8> {
    public static final ProtoAdapter<BatchUpdateConversationParticipantResponseBody> ADAPTER = new ProtoAdapter<BatchUpdateConversationParticipantResponseBody>() { // from class: X.1DB7
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final BatchUpdateConversationParticipantResponseBody decode(ProtoReader protoReader) {
            C1DB8 c1db8 = new C1DB8();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c1db8.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                c1db8.LJFF.add(ProtoAdapter.INT64.decode(protoReader));
                            }
                        } else {
                            c1db8.LJ.add(UpdateConversationParticipantResult.ADAPTER.decode(protoReader));
                        }
                    } else {
                        c1db8.LIZLLL.add(UpdateConversationParticipantResult.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1db8.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(BatchUpdateConversationParticipantResponseBody batchUpdateConversationParticipantResponseBody) {
            BatchUpdateConversationParticipantResponseBody batchUpdateConversationParticipantResponseBody2 = batchUpdateConversationParticipantResponseBody;
            ProtoAdapter<UpdateConversationParticipantResult> protoAdapter = UpdateConversationParticipantResult.ADAPTER;
            return protoAdapter.asRepeated().encodedSizeWithTag(1, batchUpdateConversationParticipantResponseBody2.success_participants) + protoAdapter.asRepeated().encodedSizeWithTag(2, batchUpdateConversationParticipantResponseBody2.callback_failed_participants) + ProtoAdapter.INT64.asRepeated().encodedSizeWithTag(3, batchUpdateConversationParticipantResponseBody2.failed_participants) + batchUpdateConversationParticipantResponseBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, BatchUpdateConversationParticipantResponseBody batchUpdateConversationParticipantResponseBody) {
            BatchUpdateConversationParticipantResponseBody batchUpdateConversationParticipantResponseBody2 = batchUpdateConversationParticipantResponseBody;
            ProtoAdapter<UpdateConversationParticipantResult> protoAdapter = UpdateConversationParticipantResult.ADAPTER;
            protoAdapter.asRepeated().encodeWithTag(protoWriter, 1, batchUpdateConversationParticipantResponseBody2.success_participants);
            protoAdapter.asRepeated().encodeWithTag(protoWriter, 2, batchUpdateConversationParticipantResponseBody2.callback_failed_participants);
            ProtoAdapter.INT64.asRepeated().encodeWithTag(protoWriter, 3, batchUpdateConversationParticipantResponseBody2.failed_participants);
            protoWriter.writeBytes(batchUpdateConversationParticipantResponseBody2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @C09CT("callback_failed_participants")
    public final List<UpdateConversationParticipantResult> callback_failed_participants;

    @C09CT("failed_participants")
    public final List<Long> failed_participants;

    @C09CT("success_participants")
    public final List<UpdateConversationParticipantResult> success_participants;

    @Override // com.squareup.wire.Message
    public C1DB8 newBuilder() {
        C1DB8 c1db8 = new C1DB8();
        c1db8.LIZLLL = C1516540pZE.LIZJ("success_participants", this.success_participants);
        c1db8.LJ = C1516540pZE.LIZJ("callback_failed_participants", this.callback_failed_participants);
        c1db8.LJFF = C1516540pZE.LIZJ("failed_participants", this.failed_participants);
        c1db8.addUnknownFields(unknownFields());
        return c1db8;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<UpdateConversationParticipantResult> list = this.success_participants;
        if (list != null && !list.isEmpty()) {
            sb.append(", success_participants=");
            sb.append(this.success_participants);
        }
        List<UpdateConversationParticipantResult> list2 = this.callback_failed_participants;
        if (list2 != null && !list2.isEmpty()) {
            sb.append(", callback_failed_participants=");
            sb.append(this.callback_failed_participants);
        }
        List<Long> list3 = this.failed_participants;
        if (list3 != null && !list3.isEmpty()) {
            sb.append(", failed_participants=");
            sb.append(this.failed_participants);
        }
        sb.replace(0, 2, "BatchUpdateConversationParticipantResponseBody{");
        sb.append('}');
        return sb.toString();
    }

    public BatchUpdateConversationParticipantResponseBody(List<UpdateConversationParticipantResult> list, List<UpdateConversationParticipantResult> list2, List<Long> list3) {
        this(list, list2, list3, ByteString.EMPTY);
    }

    public BatchUpdateConversationParticipantResponseBody(List<UpdateConversationParticipantResult> list, List<UpdateConversationParticipantResult> list2, List<Long> list3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.success_participants = C1516540pZE.LJFF("success_participants", list);
        this.callback_failed_participants = C1516540pZE.LJFF("callback_failed_participants", list2);
        this.failed_participants = C1516540pZE.LJFF("failed_participants", list3);
    }
}
