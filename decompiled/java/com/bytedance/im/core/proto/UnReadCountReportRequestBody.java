package com.bytedance.im.core.proto;

import X.C09CT;
import X.C0YRS;
import X.C1516540pZE;
import com.bytedance.im.core.proto.ConvCountReport;
import com.bytedance.im.core.proto.UnReadCountReportRequestBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import java.util.Map;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public final class UnReadCountReportRequestBody extends Message<UnReadCountReportRequestBody, C0YRS> {
    public static final ProtoAdapter<UnReadCountReportRequestBody> ADAPTER = new ProtoAdapter<UnReadCountReportRequestBody>() { // from class: X.0YRR
        public final ProtoAdapter<Map<String, String>> LIZ;

        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.LIZ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final UnReadCountReportRequestBody decode(ProtoReader protoReader) {
            C0YRS c0yrs = new C0YRS();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c0yrs.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                c0yrs.LJFF.putAll(this.LIZ.decode(protoReader));
                            }
                        } else {
                            c0yrs.LJ.add(ConvCountReport.ADAPTER.decode(protoReader));
                        }
                    } else {
                        c0yrs.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c0yrs.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(UnReadCountReportRequestBody unReadCountReportRequestBody) {
            UnReadCountReportRequestBody unReadCountReportRequestBody2 = unReadCountReportRequestBody;
            return ProtoAdapter.INT64.encodedSizeWithTag(1, unReadCountReportRequestBody2.total_unread_count) + ConvCountReport.ADAPTER.asRepeated().encodedSizeWithTag(2, unReadCountReportRequestBody2.conv_unread_count) + this.LIZ.encodedSizeWithTag(3, unReadCountReportRequestBody2.ext) + unReadCountReportRequestBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, UnReadCountReportRequestBody unReadCountReportRequestBody) {
            UnReadCountReportRequestBody unReadCountReportRequestBody2 = unReadCountReportRequestBody;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, unReadCountReportRequestBody2.total_unread_count);
            ConvCountReport.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, unReadCountReportRequestBody2.conv_unread_count);
            this.LIZ.encodeWithTag(protoWriter, 3, unReadCountReportRequestBody2.ext);
            protoWriter.writeBytes(unReadCountReportRequestBody2.unknownFields());
        }
    };
    public static final Long DEFAULT_TOTAL_UNREAD_COUNT = 0L;
    public static final long serialVersionUID = 0;

    @C09CT("conv_unread_count")
    public final List<ConvCountReport> conv_unread_count;

    @C09CT("ext")
    public final Map<String, String> ext;

    @C09CT("total_unread_count")
    public final Long total_unread_count;

    @Override // com.squareup.wire.Message
    public C0YRS newBuilder() {
        C0YRS c0yrs = new C0YRS();
        c0yrs.LIZLLL = this.total_unread_count;
        c0yrs.LJ = C1516540pZE.LIZJ("conv_unread_count", this.conv_unread_count);
        c0yrs.LJFF = C1516540pZE.LIZLLL("ext", this.ext);
        c0yrs.addUnknownFields(unknownFields());
        return c0yrs;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.total_unread_count != null) {
            sb.append(", total_unread_count=");
            sb.append(this.total_unread_count);
        }
        List<ConvCountReport> list = this.conv_unread_count;
        if (list != null && !list.isEmpty()) {
            sb.append(", conv_unread_count=");
            sb.append(this.conv_unread_count);
        }
        Map<String, String> map = this.ext;
        if (map != null && !map.isEmpty()) {
            sb.append(", ext=");
            sb.append(this.ext);
        }
        sb.replace(0, 2, "UnReadCountReportRequestBody{");
        sb.append('}');
        return sb.toString();
    }

    public UnReadCountReportRequestBody(Long l, List<ConvCountReport> list, Map<String, String> map) {
        this(l, list, map, ByteString.EMPTY);
    }

    public UnReadCountReportRequestBody(Long l, List<ConvCountReport> list, Map<String, String> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.total_unread_count = l;
        this.conv_unread_count = C1516540pZE.LJFF("conv_unread_count", list);
        this.ext = C1516540pZE.LJI("ext", map);
    }
}
