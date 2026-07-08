package com.bytedance.im.core.proto;

import X.C09CT;
import X.C1516540pZE;
import X.C1CG5;
import com.bytedance.im.core.proto.MarkMsgUnreadCountReportResponseBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class MarkMsgUnreadCountReportResponseBody extends Message<MarkMsgUnreadCountReportResponseBody, C1CG5> {
    public static final ProtoAdapter<MarkMsgUnreadCountReportResponseBody> ADAPTER = new ProtoAdapter<MarkMsgUnreadCountReportResponseBody>() { // from class: X.1CG4
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final MarkMsgUnreadCountReportResponseBody decode(ProtoReader protoReader) {
            C1CG5 c1cg5 = new C1CG5();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c1cg5.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c1cg5.LJ.add(ProtoAdapter.INT64.decode(protoReader));
                        }
                    } else {
                        c1cg5.LIZLLL = ProtoAdapter.BOOL.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cg5.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(MarkMsgUnreadCountReportResponseBody markMsgUnreadCountReportResponseBody) {
            MarkMsgUnreadCountReportResponseBody markMsgUnreadCountReportResponseBody2 = markMsgUnreadCountReportResponseBody;
            return ProtoAdapter.BOOL.encodedSizeWithTag(1, markMsgUnreadCountReportResponseBody2.set_total_status) + ProtoAdapter.INT64.asRepeated().encodedSizeWithTag(2, markMsgUnreadCountReportResponseBody2.failed_tag_list) + markMsgUnreadCountReportResponseBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, MarkMsgUnreadCountReportResponseBody markMsgUnreadCountReportResponseBody) {
            MarkMsgUnreadCountReportResponseBody markMsgUnreadCountReportResponseBody2 = markMsgUnreadCountReportResponseBody;
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, markMsgUnreadCountReportResponseBody2.set_total_status);
            ProtoAdapter.INT64.asRepeated().encodeWithTag(protoWriter, 2, markMsgUnreadCountReportResponseBody2.failed_tag_list);
            protoWriter.writeBytes(markMsgUnreadCountReportResponseBody2.unknownFields());
        }
    };
    public static final Boolean DEFAULT_SET_TOTAL_STATUS = Boolean.FALSE;
    public static final long serialVersionUID = 0;

    @C09CT("failed_tag_list")
    public final List<Long> failed_tag_list;

    @C09CT("set_total_status")
    public final Boolean set_total_status;

    @Override // com.squareup.wire.Message
    public C1CG5 newBuilder() {
        C1CG5 c1cg5 = new C1CG5();
        c1cg5.LIZLLL = this.set_total_status;
        c1cg5.LJ = C1516540pZE.LIZJ("failed_tag_list", this.failed_tag_list);
        c1cg5.addUnknownFields(unknownFields());
        return c1cg5;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.set_total_status != null) {
            sb.append(", set_total_status=");
            sb.append(this.set_total_status);
        }
        List<Long> list = this.failed_tag_list;
        if (list != null && !list.isEmpty()) {
            sb.append(", failed_tag_list=");
            sb.append(this.failed_tag_list);
        }
        sb.replace(0, 2, "MarkMsgUnreadCountReportResponseBody{");
        sb.append('}');
        return sb.toString();
    }

    public MarkMsgUnreadCountReportResponseBody(Boolean bool, List<Long> list) {
        this(bool, list, ByteString.EMPTY);
    }

    public MarkMsgUnreadCountReportResponseBody(Boolean bool, List<Long> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.set_total_status = bool;
        this.failed_tag_list = C1516540pZE.LJFF("failed_tag_list", list);
    }
}
