package com.bytedance.im.core.proto;

import X.C09CT;
import X.C1516540pZE;
import X.C870480YCw;
import com.bytedance.im.core.proto.BatchGetConversationParticipantsReadIndexRequestBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public final class BatchGetConversationParticipantsReadIndexRequestBody extends Message<BatchGetConversationParticipantsReadIndexRequestBody, C870480YCw> {
    public static final ProtoAdapter<BatchGetConversationParticipantsReadIndexRequestBody> ADAPTER = new ProtoAdapter<BatchGetConversationParticipantsReadIndexRequestBody>() { // from class: X.0YCx
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final BatchGetConversationParticipantsReadIndexRequestBody decode(ProtoReader protoReader) {
            C870480YCw c870480YCw = new C870480YCw();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                    c870480YCw.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                } else {
                                    c870480YCw.LJI = ProtoAdapter.BOOL.decode(protoReader);
                                }
                            } else {
                                c870480YCw.LJFF = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c870480YCw.LJ.add(ProtoAdapter.INT64.decode(protoReader));
                        }
                    } else {
                        c870480YCw.LIZLLL.add(ProtoAdapter.STRING.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c870480YCw.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(BatchGetConversationParticipantsReadIndexRequestBody batchGetConversationParticipantsReadIndexRequestBody) {
            BatchGetConversationParticipantsReadIndexRequestBody batchGetConversationParticipantsReadIndexRequestBody2 = batchGetConversationParticipantsReadIndexRequestBody;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.asRepeated().encodedSizeWithTag(1, batchGetConversationParticipantsReadIndexRequestBody2.conversation_id) + ProtoAdapter.INT64.asRepeated().encodedSizeWithTag(2, batchGetConversationParticipantsReadIndexRequestBody2.conversation_short_id) + protoAdapter.encodedSizeWithTag(3, batchGetConversationParticipantsReadIndexRequestBody2.request_from) + ProtoAdapter.BOOL.encodedSizeWithTag(4, batchGetConversationParticipantsReadIndexRequestBody2.min_index_required) + batchGetConversationParticipantsReadIndexRequestBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, BatchGetConversationParticipantsReadIndexRequestBody batchGetConversationParticipantsReadIndexRequestBody) {
            BatchGetConversationParticipantsReadIndexRequestBody batchGetConversationParticipantsReadIndexRequestBody2 = batchGetConversationParticipantsReadIndexRequestBody;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.asRepeated().encodeWithTag(protoWriter, 1, batchGetConversationParticipantsReadIndexRequestBody2.conversation_id);
            ProtoAdapter.INT64.asRepeated().encodeWithTag(protoWriter, 2, batchGetConversationParticipantsReadIndexRequestBody2.conversation_short_id);
            protoAdapter.encodeWithTag(protoWriter, 3, batchGetConversationParticipantsReadIndexRequestBody2.request_from);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, batchGetConversationParticipantsReadIndexRequestBody2.min_index_required);
            protoWriter.writeBytes(batchGetConversationParticipantsReadIndexRequestBody2.unknownFields());
        }
    };
    public static final Boolean DEFAULT_MIN_INDEX_REQUIRED = Boolean.FALSE;
    public static final long serialVersionUID = 0;

    @C09CT("conversation_id")
    public final List<String> conversation_id;

    @C09CT("conversation_short_id")
    public final List<Long> conversation_short_id;

    @C09CT("min_index_required")
    public final Boolean min_index_required;

    @C09CT("request_from")
    public final String request_from;

    @Override // com.squareup.wire.Message
    public C870480YCw newBuilder() {
        C870480YCw c870480YCw = new C870480YCw();
        c870480YCw.LIZLLL = C1516540pZE.LIZJ("conversation_id", this.conversation_id);
        c870480YCw.LJ = C1516540pZE.LIZJ("conversation_short_id", this.conversation_short_id);
        c870480YCw.LJFF = this.request_from;
        c870480YCw.LJI = this.min_index_required;
        c870480YCw.addUnknownFields(unknownFields());
        return c870480YCw;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<String> list = this.conversation_id;
        if (list != null && !list.isEmpty()) {
            sb.append(", conversation_id=");
            sb.append(this.conversation_id);
        }
        List<Long> list2 = this.conversation_short_id;
        if (list2 != null && !list2.isEmpty()) {
            sb.append(", conversation_short_id=");
            sb.append(this.conversation_short_id);
        }
        if (this.request_from != null) {
            sb.append(", request_from=");
            sb.append(this.request_from);
        }
        if (this.min_index_required != null) {
            sb.append(", min_index_required=");
            sb.append(this.min_index_required);
        }
        sb.replace(0, 2, "BatchGetConversationParticipantsReadIndexRequestBody{");
        sb.append('}');
        return sb.toString();
    }

    public BatchGetConversationParticipantsReadIndexRequestBody(List<String> list, List<Long> list2, String str, Boolean bool) {
        this(list, list2, str, bool, ByteString.EMPTY);
    }

    public BatchGetConversationParticipantsReadIndexRequestBody(List<String> list, List<Long> list2, String str, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_id = C1516540pZE.LJFF("conversation_id", list);
        this.conversation_short_id = C1516540pZE.LJFF("conversation_short_id", list2);
        this.request_from = str;
        this.min_index_required = bool;
    }
}
