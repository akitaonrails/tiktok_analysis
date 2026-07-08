package com.bytedance.im.core.proto;

import X.C09CT;
import X.C1516540pZE;
import X.C1CK7;
import com.bytedance.im.core.proto.ClientMetric;
import com.bytedance.im.core.proto.ReportClientMetricsRequestBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class ReportClientMetricsRequestBody extends Message<ReportClientMetricsRequestBody, C1CK7> {
    public static final ProtoAdapter<ReportClientMetricsRequestBody> ADAPTER = new ProtoAdapter<ReportClientMetricsRequestBody>() { // from class: X.1CK6
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final ReportClientMetricsRequestBody decode(ProtoReader protoReader) {
            C1CK7 c1ck7 = new C1CK7();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c1ck7.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c1ck7.LIZLLL.add(ClientMetric.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1ck7.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(ReportClientMetricsRequestBody reportClientMetricsRequestBody) {
            ReportClientMetricsRequestBody reportClientMetricsRequestBody2 = reportClientMetricsRequestBody;
            return ClientMetric.ADAPTER.asRepeated().encodedSizeWithTag(1, reportClientMetricsRequestBody2.report_metrics_list) + reportClientMetricsRequestBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, ReportClientMetricsRequestBody reportClientMetricsRequestBody) {
            ReportClientMetricsRequestBody reportClientMetricsRequestBody2 = reportClientMetricsRequestBody;
            ClientMetric.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, reportClientMetricsRequestBody2.report_metrics_list);
            protoWriter.writeBytes(reportClientMetricsRequestBody2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @C09CT("report_metrics_list")
    public final List<ClientMetric> report_metrics_list;

    @Override // com.squareup.wire.Message
    public C1CK7 newBuilder() {
        C1CK7 c1ck7 = new C1CK7();
        c1ck7.LIZLLL = C1516540pZE.LIZJ("report_metrics_list", this.report_metrics_list);
        c1ck7.addUnknownFields(unknownFields());
        return c1ck7;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<ClientMetric> list = this.report_metrics_list;
        if (list != null && !list.isEmpty()) {
            sb.append(", report_metrics_list=");
            sb.append(this.report_metrics_list);
        }
        sb.replace(0, 2, "ReportClientMetricsRequestBody{");
        sb.append('}');
        return sb.toString();
    }

    public ReportClientMetricsRequestBody(List<ClientMetric> list) {
        this(list, ByteString.EMPTY);
    }

    public ReportClientMetricsRequestBody(List<ClientMetric> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.report_metrics_list = C1516540pZE.LJFF("report_metrics_list", list);
    }
}
