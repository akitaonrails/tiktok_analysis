package com.bytedance.im.core.proto;

import X.C09CT;
import X.C1516540pZE;
import X.C1CG3;
import com.bytedance.im.core.proto.MarkMsgGetUnreadCountResponseBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import java.util.Map;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class MarkMsgGetUnreadCountResponseBody extends Message<MarkMsgGetUnreadCountResponseBody, C1CG3> {
    public static final ProtoAdapter<MarkMsgGetUnreadCountResponseBody> ADAPTER = new ProtoAdapter<MarkMsgGetUnreadCountResponseBody>() { // from class: X.1CG2
        public final ProtoAdapter<Map<Long, Long>> LIZ;

        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            this.LIZ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final MarkMsgGetUnreadCountResponseBody decode(ProtoReader protoReader) {
            C1CG3 c1cg3 = new C1CG3();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c1cg3.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                c1cg3.LJFF.add(ProtoAdapter.INT64.decode(protoReader));
                            }
                        } else {
                            c1cg3.LJ.putAll(this.LIZ.decode(protoReader));
                        }
                    } else {
                        c1cg3.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cg3.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(MarkMsgGetUnreadCountResponseBody markMsgGetUnreadCountResponseBody) {
            MarkMsgGetUnreadCountResponseBody markMsgGetUnreadCountResponseBody2 = markMsgGetUnreadCountResponseBody;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            return protoAdapter.encodedSizeWithTag(1, markMsgGetUnreadCountResponseBody2.total_count) + this.LIZ.encodedSizeWithTag(2, markMsgGetUnreadCountResponseBody2.tag_unread_count) + protoAdapter.asRepeated().encodedSizeWithTag(3, markMsgGetUnreadCountResponseBody2.failed_tag_list) + markMsgGetUnreadCountResponseBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, MarkMsgGetUnreadCountResponseBody markMsgGetUnreadCountResponseBody) {
            MarkMsgGetUnreadCountResponseBody markMsgGetUnreadCountResponseBody2 = markMsgGetUnreadCountResponseBody;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 1, markMsgGetUnreadCountResponseBody2.total_count);
            this.LIZ.encodeWithTag(protoWriter, 2, markMsgGetUnreadCountResponseBody2.tag_unread_count);
            protoAdapter.asRepeated().encodeWithTag(protoWriter, 3, markMsgGetUnreadCountResponseBody2.failed_tag_list);
            protoWriter.writeBytes(markMsgGetUnreadCountResponseBody2.unknownFields());
        }
    };
    public static final Long DEFAULT_TOTAL_COUNT = 0L;
    public static final long serialVersionUID = 0;

    @C09CT("failed_tag_list")
    public final List<Long> failed_tag_list;

    @C09CT("tag_unread_count")
    public final Map<Long, Long> tag_unread_count;

    @C09CT("total_count")
    public final Long total_count;

    @Override // com.squareup.wire.Message
    public C1CG3 newBuilder() {
        C1CG3 c1cg3 = new C1CG3();
        c1cg3.LIZLLL = this.total_count;
        c1cg3.LJ = C1516540pZE.LIZLLL("tag_unread_count", this.tag_unread_count);
        c1cg3.LJFF = C1516540pZE.LIZJ("failed_tag_list", this.failed_tag_list);
        c1cg3.addUnknownFields(unknownFields());
        return c1cg3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.total_count != null) {
            sb.append(", total_count=");
            sb.append(this.total_count);
        }
        Map<Long, Long> map = this.tag_unread_count;
        if (map != null && !map.isEmpty()) {
            sb.append(", tag_unread_count=");
            sb.append(this.tag_unread_count);
        }
        List<Long> list = this.failed_tag_list;
        if (list != null && !list.isEmpty()) {
            sb.append(", failed_tag_list=");
            sb.append(this.failed_tag_list);
        }
        sb.replace(0, 2, "MarkMsgGetUnreadCountResponseBody{");
        sb.append('}');
        return sb.toString();
    }

    public MarkMsgGetUnreadCountResponseBody(Long l, Map<Long, Long> map, List<Long> list) {
        this(l, map, list, ByteString.EMPTY);
    }

    public MarkMsgGetUnreadCountResponseBody(Long l, Map<Long, Long> map, List<Long> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.total_count = l;
        this.tag_unread_count = C1516540pZE.LJI("tag_unread_count", map);
        this.failed_tag_list = C1516540pZE.LJFF("failed_tag_list", list);
    }
}
