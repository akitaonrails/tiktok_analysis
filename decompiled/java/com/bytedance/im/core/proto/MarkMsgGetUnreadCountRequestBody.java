package com.bytedance.im.core.proto;

import X.C09CT;
import X.C1516540pZE;
import X.C1CKF;
import com.bytedance.im.core.proto.MarkMsgGetUnreadCountRequestBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class MarkMsgGetUnreadCountRequestBody extends Message<MarkMsgGetUnreadCountRequestBody, C1CKF> {
    public static final long serialVersionUID = 0;

    @C09CT("conversation_id")
    public final String conversation_id;

    @C09CT("conversation_short_id")
    public final Long conversation_short_id;

    @C09CT("conversation_type")
    public final Integer conversation_type;

    @C09CT("get_total")
    public final Boolean get_total;

    @C09CT("tags")
    public final List<Long> tags;
    public static final ProtoAdapter<MarkMsgGetUnreadCountRequestBody> ADAPTER = new ProtoAdapter<MarkMsgGetUnreadCountRequestBody>() { // from class: X.1CKE
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final MarkMsgGetUnreadCountRequestBody decode(ProtoReader protoReader) {
            C1CKF c1ckf = new C1CKF();
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
                                        c1ckf.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                    } else {
                                        c1ckf.LJII.add(ProtoAdapter.INT64.decode(protoReader));
                                    }
                                } else {
                                    c1ckf.LJI = ProtoAdapter.BOOL.decode(protoReader);
                                }
                            } else {
                                c1ckf.LJFF = ProtoAdapter.INT64.decode(protoReader);
                            }
                        } else {
                            c1ckf.LJ = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c1ckf.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1ckf.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(MarkMsgGetUnreadCountRequestBody markMsgGetUnreadCountRequestBody) {
            MarkMsgGetUnreadCountRequestBody markMsgGetUnreadCountRequestBody2 = markMsgGetUnreadCountRequestBody;
            int iEncodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, markMsgGetUnreadCountRequestBody2.conversation_id) + ProtoAdapter.INT32.encodedSizeWithTag(2, markMsgGetUnreadCountRequestBody2.conversation_type);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(3, markMsgGetUnreadCountRequestBody2.conversation_short_id) + ProtoAdapter.BOOL.encodedSizeWithTag(4, markMsgGetUnreadCountRequestBody2.get_total) + protoAdapter.asRepeated().encodedSizeWithTag(5, markMsgGetUnreadCountRequestBody2.tags) + markMsgGetUnreadCountRequestBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, MarkMsgGetUnreadCountRequestBody markMsgGetUnreadCountRequestBody) {
            MarkMsgGetUnreadCountRequestBody markMsgGetUnreadCountRequestBody2 = markMsgGetUnreadCountRequestBody;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, markMsgGetUnreadCountRequestBody2.conversation_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, markMsgGetUnreadCountRequestBody2.conversation_type);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 3, markMsgGetUnreadCountRequestBody2.conversation_short_id);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, markMsgGetUnreadCountRequestBody2.get_total);
            protoAdapter.asRepeated().encodeWithTag(protoWriter, 5, markMsgGetUnreadCountRequestBody2.tags);
            protoWriter.writeBytes(markMsgGetUnreadCountRequestBody2.unknownFields());
        }
    };
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final Boolean DEFAULT_GET_TOTAL = Boolean.FALSE;

    @Override // com.squareup.wire.Message
    public C1CKF newBuilder() {
        C1CKF c1ckf = new C1CKF();
        c1ckf.LIZLLL = this.conversation_id;
        c1ckf.LJ = this.conversation_type;
        c1ckf.LJFF = this.conversation_short_id;
        c1ckf.LJI = this.get_total;
        c1ckf.LJII = C1516540pZE.LIZJ("tags", this.tags);
        c1ckf.addUnknownFields(unknownFields());
        return c1ckf;
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
        if (this.get_total != null) {
            sb.append(", get_total=");
            sb.append(this.get_total);
        }
        List<Long> list = this.tags;
        if (list != null && !list.isEmpty()) {
            sb.append(", tags=");
            sb.append(this.tags);
        }
        sb.replace(0, 2, "MarkMsgGetUnreadCountRequestBody{");
        sb.append('}');
        return sb.toString();
    }

    public MarkMsgGetUnreadCountRequestBody(String str, Integer num, Long l, Boolean bool, List<Long> list) {
        this(str, num, l, bool, list, ByteString.EMPTY);
    }

    public MarkMsgGetUnreadCountRequestBody(String str, Integer num, Long l, Boolean bool, List<Long> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_id = str;
        this.conversation_type = num;
        this.conversation_short_id = l;
        this.get_total = bool;
        this.tags = C1516540pZE.LJFF("tags", list);
    }
}
