package com.bytedance.im.core.proto;

import X.C09CT;
import X.C2251531DAp;
import com.bytedance.im.core.proto.MessagesCheckInfo;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: loaded from: classes36.dex */
public final class MessagesCheckInfo extends Message<MessagesCheckInfo, C2251531DAp> {
    public static final long serialVersionUID = 0;

    @C09CT("head_msg_index")
    public final Long head_msg_index;

    @C09CT("indexes_checksum")
    public final Integer indexes_checksum;

    @C09CT("msg_count")
    public final Integer msg_count;

    @C09CT("tail_msg_index")
    public final Long tail_msg_index;
    public static final ProtoAdapter<MessagesCheckInfo> ADAPTER = new ProtoAdapter<MessagesCheckInfo>() { // from class: X.1DAo
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final MessagesCheckInfo decode(ProtoReader protoReader) {
            C2251531DAp c2251531DAp = new C2251531DAp();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                    c2251531DAp.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                } else {
                                    c2251531DAp.LJI = ProtoAdapter.UINT32.decode(protoReader);
                                }
                            } else {
                                c2251531DAp.LJFF = ProtoAdapter.INT32.decode(protoReader);
                            }
                        } else {
                            c2251531DAp.LJ = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c2251531DAp.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2251531DAp.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(MessagesCheckInfo messagesCheckInfo) {
            MessagesCheckInfo messagesCheckInfo2 = messagesCheckInfo;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            return protoAdapter.encodedSizeWithTag(1, messagesCheckInfo2.head_msg_index) + protoAdapter.encodedSizeWithTag(2, messagesCheckInfo2.tail_msg_index) + ProtoAdapter.INT32.encodedSizeWithTag(3, messagesCheckInfo2.msg_count) + ProtoAdapter.UINT32.encodedSizeWithTag(4, messagesCheckInfo2.indexes_checksum) + messagesCheckInfo2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, MessagesCheckInfo messagesCheckInfo) {
            MessagesCheckInfo messagesCheckInfo2 = messagesCheckInfo;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 1, messagesCheckInfo2.head_msg_index);
            protoAdapter.encodeWithTag(protoWriter, 2, messagesCheckInfo2.tail_msg_index);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, messagesCheckInfo2.msg_count);
            ProtoAdapter.UINT32.encodeWithTag(protoWriter, 4, messagesCheckInfo2.indexes_checksum);
            protoWriter.writeBytes(messagesCheckInfo2.unknownFields());
        }
    };
    public static final Long DEFAULT_HEAD_MSG_INDEX = 0L;
    public static final Long DEFAULT_TAIL_MSG_INDEX = 0L;
    public static final Integer DEFAULT_MSG_COUNT = 0;
    public static final Integer DEFAULT_INDEXES_CHECKSUM = 0;

    @Override // com.squareup.wire.Message
    public C2251531DAp newBuilder() {
        C2251531DAp c2251531DAp = new C2251531DAp();
        c2251531DAp.LIZLLL = this.head_msg_index;
        c2251531DAp.LJ = this.tail_msg_index;
        c2251531DAp.LJFF = this.msg_count;
        c2251531DAp.LJI = this.indexes_checksum;
        c2251531DAp.addUnknownFields(unknownFields());
        return c2251531DAp;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.head_msg_index != null) {
            sb.append(", head_msg_index=");
            sb.append(this.head_msg_index);
        }
        if (this.tail_msg_index != null) {
            sb.append(", tail_msg_index=");
            sb.append(this.tail_msg_index);
        }
        if (this.msg_count != null) {
            sb.append(", msg_count=");
            sb.append(this.msg_count);
        }
        if (this.indexes_checksum != null) {
            sb.append(", indexes_checksum=");
            sb.append(this.indexes_checksum);
        }
        sb.replace(0, 2, "MessagesCheckInfo{");
        sb.append('}');
        return sb.toString();
    }

    public MessagesCheckInfo(Long l, Long l2, Integer num, Integer num2) {
        this(l, l2, num, num2, ByteString.EMPTY);
    }

    public MessagesCheckInfo(Long l, Long l2, Integer num, Integer num2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.head_msg_index = l;
        this.tail_msg_index = l2;
        this.msg_count = num;
        this.indexes_checksum = num2;
    }
}
