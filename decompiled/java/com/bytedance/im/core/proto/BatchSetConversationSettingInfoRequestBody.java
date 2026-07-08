package com.bytedance.im.core.proto;

import X.C09CT;
import X.C1516540pZE;
import X.C868090Y3r;
import com.bytedance.im.core.proto.BatchSetConversationSettingInfoRequestBody;
import com.bytedance.im.core.proto.SetConversationSettingInfoRequestBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public final class BatchSetConversationSettingInfoRequestBody extends Message<BatchSetConversationSettingInfoRequestBody, C868090Y3r> {
    public static final ProtoAdapter<BatchSetConversationSettingInfoRequestBody> ADAPTER = new ProtoAdapter<BatchSetConversationSettingInfoRequestBody>() { // from class: X.0Y3q
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final BatchSetConversationSettingInfoRequestBody decode(ProtoReader protoReader) {
            C868090Y3r c868090Y3r = new C868090Y3r();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c868090Y3r.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c868090Y3r.LIZLLL.add(SetConversationSettingInfoRequestBody.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c868090Y3r.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(BatchSetConversationSettingInfoRequestBody batchSetConversationSettingInfoRequestBody) {
            BatchSetConversationSettingInfoRequestBody batchSetConversationSettingInfoRequestBody2 = batchSetConversationSettingInfoRequestBody;
            return SetConversationSettingInfoRequestBody.ADAPTER.asRepeated().encodedSizeWithTag(1, batchSetConversationSettingInfoRequestBody2.set_requests) + batchSetConversationSettingInfoRequestBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, BatchSetConversationSettingInfoRequestBody batchSetConversationSettingInfoRequestBody) {
            BatchSetConversationSettingInfoRequestBody batchSetConversationSettingInfoRequestBody2 = batchSetConversationSettingInfoRequestBody;
            SetConversationSettingInfoRequestBody.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, batchSetConversationSettingInfoRequestBody2.set_requests);
            protoWriter.writeBytes(batchSetConversationSettingInfoRequestBody2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @C09CT("set_requests")
    public final List<SetConversationSettingInfoRequestBody> set_requests;

    @Override // com.squareup.wire.Message
    public C868090Y3r newBuilder() {
        C868090Y3r c868090Y3r = new C868090Y3r();
        c868090Y3r.LIZLLL = C1516540pZE.LIZJ("set_requests", this.set_requests);
        c868090Y3r.addUnknownFields(unknownFields());
        return c868090Y3r;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<SetConversationSettingInfoRequestBody> list = this.set_requests;
        if (list != null && !list.isEmpty()) {
            sb.append(", set_requests=");
            sb.append(this.set_requests);
        }
        sb.replace(0, 2, "BatchSetConversationSettingInfoRequestBody{");
        sb.append('}');
        return sb.toString();
    }

    public BatchSetConversationSettingInfoRequestBody(List<SetConversationSettingInfoRequestBody> list) {
        this(list, ByteString.EMPTY);
    }

    public BatchSetConversationSettingInfoRequestBody(List<SetConversationSettingInfoRequestBody> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.set_requests = C1516540pZE.LJFF("set_requests", list);
    }
}
