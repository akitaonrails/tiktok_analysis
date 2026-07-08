package com.bytedance.im.core.proto;

import X.C09CT;
import X.C1516540pZE;
import X.C1CG7;
import com.bytedance.im.core.proto.UnReadCountReportResponseBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class UnReadCountReportResponseBody extends Message<UnReadCountReportResponseBody, C1CG7> {
    public static final ProtoAdapter<UnReadCountReportResponseBody> ADAPTER = new ProtoAdapter<UnReadCountReportResponseBody>() { // from class: X.1CG6
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final UnReadCountReportResponseBody decode(ProtoReader protoReader) {
            C1CG7 c1cg7 = new C1CG7();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c1cg7.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c1cg7.LJ.add(ProtoAdapter.INT64.decode(protoReader));
                        }
                    } else {
                        c1cg7.LIZLLL = ProtoAdapter.BOOL.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cg7.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(UnReadCountReportResponseBody unReadCountReportResponseBody) {
            UnReadCountReportResponseBody unReadCountReportResponseBody2 = unReadCountReportResponseBody;
            return ProtoAdapter.BOOL.encodedSizeWithTag(1, unReadCountReportResponseBody2.set_total_status) + ProtoAdapter.INT64.asRepeated().encodedSizeWithTag(2, unReadCountReportResponseBody2.failed_conv_list) + unReadCountReportResponseBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, UnReadCountReportResponseBody unReadCountReportResponseBody) {
            UnReadCountReportResponseBody unReadCountReportResponseBody2 = unReadCountReportResponseBody;
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, unReadCountReportResponseBody2.set_total_status);
            ProtoAdapter.INT64.asRepeated().encodeWithTag(protoWriter, 2, unReadCountReportResponseBody2.failed_conv_list);
            protoWriter.writeBytes(unReadCountReportResponseBody2.unknownFields());
        }
    };
    public static final Boolean DEFAULT_SET_TOTAL_STATUS = Boolean.FALSE;
    public static final long serialVersionUID = 0;

    @C09CT("failed_conv_list")
    public final List<Long> failed_conv_list;

    @C09CT("set_total_status")
    public final Boolean set_total_status;

    @Override // com.squareup.wire.Message
    public C1CG7 newBuilder() {
        C1CG7 c1cg7 = new C1CG7();
        c1cg7.LIZLLL = this.set_total_status;
        c1cg7.LJ = C1516540pZE.LIZJ("failed_conv_list", this.failed_conv_list);
        c1cg7.addUnknownFields(unknownFields());
        return c1cg7;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", set_total_status=");
        sb.append(this.set_total_status);
        List<Long> list = this.failed_conv_list;
        if (list != null && !list.isEmpty()) {
            sb.append(", failed_conv_list=");
            sb.append(this.failed_conv_list);
        }
        sb.replace(0, 2, "UnReadCountReportResponseBody{");
        sb.append('}');
        return sb.toString();
    }

    public UnReadCountReportResponseBody(Boolean bool, List<Long> list) {
        this(bool, list, ByteString.EMPTY);
    }

    public UnReadCountReportResponseBody(Boolean bool, List<Long> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.set_total_status = bool;
        this.failed_conv_list = C1516540pZE.LJFF("failed_conv_list", list);
    }
}
