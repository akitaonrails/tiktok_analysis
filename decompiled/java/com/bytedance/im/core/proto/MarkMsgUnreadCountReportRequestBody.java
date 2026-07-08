package com.bytedance.im.core.proto;

import X.C09CT;
import X.C1516540pZE;
import X.C1CKD;
import com.bytedance.im.core.proto.MarkMsgUnreadCountReportRequestBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.Map;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class MarkMsgUnreadCountReportRequestBody extends Message<MarkMsgUnreadCountReportRequestBody, C1CKD> {
    public static final long serialVersionUID = 0;

    @C09CT("conversation_id")
    public final String conversation_id;

    @C09CT("conversation_short_id")
    public final Long conversation_short_id;

    @C09CT("conversation_type")
    public final Integer conversation_type;

    @C09CT("tag_unread_count")
    public final Map<Long, Long> tag_unread_count;

    @C09CT("total_unread_count")
    public final Long total_unread_count;
    public static final ProtoAdapter<MarkMsgUnreadCountReportRequestBody> ADAPTER = new ProtoAdapter<MarkMsgUnreadCountReportRequestBody>() { // from class: X.1CKC
        public final ProtoAdapter<Map<Long, Long>> LIZ;

        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            this.LIZ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final MarkMsgUnreadCountReportRequestBody decode(ProtoReader protoReader) {
            C1CKD c1ckd = new C1CKD();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    if (iNextTag != 5) {
                                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                        c1ckd.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                    } else {
                                        c1ckd.LJII.putAll(this.LIZ.decode(protoReader));
                                    }
                                } else {
                                    c1ckd.LJI = ProtoAdapter.INT64.decode(protoReader);
                                }
                            } else {
                                c1ckd.LJFF = ProtoAdapter.INT64.decode(protoReader);
                            }
                        } else {
                            c1ckd.LJ = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c1ckd.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1ckd.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(MarkMsgUnreadCountReportRequestBody markMsgUnreadCountReportRequestBody) {
            MarkMsgUnreadCountReportRequestBody markMsgUnreadCountReportRequestBody2 = markMsgUnreadCountReportRequestBody;
            int iEncodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, markMsgUnreadCountReportRequestBody2.conversation_id) + ProtoAdapter.INT32.encodedSizeWithTag(2, markMsgUnreadCountReportRequestBody2.conversation_type);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(3, markMsgUnreadCountReportRequestBody2.conversation_short_id) + protoAdapter.encodedSizeWithTag(4, markMsgUnreadCountReportRequestBody2.total_unread_count) + this.LIZ.encodedSizeWithTag(5, markMsgUnreadCountReportRequestBody2.tag_unread_count) + markMsgUnreadCountReportRequestBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, MarkMsgUnreadCountReportRequestBody markMsgUnreadCountReportRequestBody) {
            MarkMsgUnreadCountReportRequestBody markMsgUnreadCountReportRequestBody2 = markMsgUnreadCountReportRequestBody;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, markMsgUnreadCountReportRequestBody2.conversation_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, markMsgUnreadCountReportRequestBody2.conversation_type);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 3, markMsgUnreadCountReportRequestBody2.conversation_short_id);
            protoAdapter.encodeWithTag(protoWriter, 4, markMsgUnreadCountReportRequestBody2.total_unread_count);
            this.LIZ.encodeWithTag(protoWriter, 5, markMsgUnreadCountReportRequestBody2.tag_unread_count);
            protoWriter.writeBytes(markMsgUnreadCountReportRequestBody2.unknownFields());
        }
    };
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final Long DEFAULT_TOTAL_UNREAD_COUNT = 0L;

    @Override // com.squareup.wire.Message
    public C1CKD newBuilder() {
        C1CKD c1ckd = new C1CKD();
        c1ckd.LIZLLL = this.conversation_id;
        c1ckd.LJ = this.conversation_type;
        c1ckd.LJFF = this.conversation_short_id;
        c1ckd.LJI = this.total_unread_count;
        c1ckd.LJII = C1516540pZE.LIZLLL("tag_unread_count", this.tag_unread_count);
        c1ckd.addUnknownFields(unknownFields());
        return c1ckd;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.conversation_id != null) {
            sb.append(", conversation_id=");
            sb.append(this.conversation_id);
        }
        if (this.conversation_type != null) {
            sb.append(", conversation_type=");
            sb.append(this.conversation_type);
        }
        if (this.conversation_short_id != null) {
            sb.append(", conversation_short_id=");
            sb.append(this.conversation_short_id);
        }
        if (this.total_unread_count != null) {
            sb.append(", total_unread_count=");
            sb.append(this.total_unread_count);
        }
        Map<Long, Long> map = this.tag_unread_count;
        if (map != null && !map.isEmpty()) {
            sb.append(", tag_unread_count=");
            sb.append(this.tag_unread_count);
        }
        sb.replace(0, 2, "MarkMsgUnreadCountReportRequestBody{");
        sb.append('}');
        return sb.toString();
    }

    public MarkMsgUnreadCountReportRequestBody(String str, Integer num, Long l, Long l2, Map<Long, Long> map) {
        this(str, num, l, l2, map, ByteString.EMPTY);
    }

    public MarkMsgUnreadCountReportRequestBody(String str, Integer num, Long l, Long l2, Map<Long, Long> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_id = str;
        this.conversation_type = num;
        this.conversation_short_id = l;
        this.total_unread_count = l2;
        this.tag_unread_count = C1516540pZE.LJI("tag_unread_count", map);
    }
}
