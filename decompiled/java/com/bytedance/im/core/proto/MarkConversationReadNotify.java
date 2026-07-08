package com.bytedance.im.core.proto;

import X.C09CT;
import X.C0YU0;
import com.bytedance.im.core.proto.MarkConversationReadNotify;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public final class MarkConversationReadNotify extends Message<MarkConversationReadNotify, C0YU0> {
    public static final long serialVersionUID = 0;

    @C09CT("conversation_id")
    public final String conversation_id;

    @C09CT("conversation_type")
    public final Integer conversation_type;

    @C09CT("message_id")
    public final Long message_id;

    @C09CT("read_index")
    public final Long read_index;

    @C09CT("read_index_v2")
    public final Long read_index_v2;

    @C09CT("user_id")
    public final Long user_id;
    public static final ProtoAdapter<MarkConversationReadNotify> ADAPTER = new ProtoAdapter<MarkConversationReadNotify>() { // from class: X.0YTz
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final MarkConversationReadNotify decode(ProtoReader protoReader) {
            C0YU0 c0yu0 = new C0YU0();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c0yu0.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c0yu0.LJ = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 3:
                            c0yu0.LJFF = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 4:
                            c0yu0.LJI = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 5:
                            c0yu0.LJII = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 6:
                            c0yu0.LJIIIIZZ = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c0yu0.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c0yu0.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(MarkConversationReadNotify markConversationReadNotify) {
            MarkConversationReadNotify markConversationReadNotify2 = markConversationReadNotify;
            int iEncodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, markConversationReadNotify2.conversation_id) + ProtoAdapter.INT32.encodedSizeWithTag(2, markConversationReadNotify2.conversation_type);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(3, markConversationReadNotify2.read_index) + protoAdapter.encodedSizeWithTag(4, markConversationReadNotify2.read_index_v2) + protoAdapter.encodedSizeWithTag(5, markConversationReadNotify2.user_id) + protoAdapter.encodedSizeWithTag(6, markConversationReadNotify2.message_id) + markConversationReadNotify2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, MarkConversationReadNotify markConversationReadNotify) {
            MarkConversationReadNotify markConversationReadNotify2 = markConversationReadNotify;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, markConversationReadNotify2.conversation_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, markConversationReadNotify2.conversation_type);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 3, markConversationReadNotify2.read_index);
            protoAdapter.encodeWithTag(protoWriter, 4, markConversationReadNotify2.read_index_v2);
            protoAdapter.encodeWithTag(protoWriter, 5, markConversationReadNotify2.user_id);
            protoAdapter.encodeWithTag(protoWriter, 6, markConversationReadNotify2.message_id);
            protoWriter.writeBytes(markConversationReadNotify2.unknownFields());
        }
    };
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;
    public static final Long DEFAULT_READ_INDEX = 0L;
    public static final Long DEFAULT_READ_INDEX_V2 = 0L;
    public static final Long DEFAULT_USER_ID = 0L;
    public static final Long DEFAULT_MESSAGE_ID = 0L;

    @Override // com.squareup.wire.Message
    public C0YU0 newBuilder() {
        C0YU0 c0yu0 = new C0YU0();
        c0yu0.LIZLLL = this.conversation_id;
        c0yu0.LJ = this.conversation_type;
        c0yu0.LJFF = this.read_index;
        c0yu0.LJI = this.read_index_v2;
        c0yu0.LJII = this.user_id;
        c0yu0.LJIIIIZZ = this.message_id;
        c0yu0.addUnknownFields(unknownFields());
        return c0yu0;
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
        if (this.read_index != null) {
            sb.append(", read_index=");
            sb.append(this.read_index);
        }
        if (this.read_index_v2 != null) {
            sb.append(", read_index_v2=");
            sb.append(this.read_index_v2);
        }
        if (this.user_id != null) {
            sb.append(", user_id=");
            sb.append(this.user_id);
        }
        if (this.message_id != null) {
            sb.append(", message_id=");
            sb.append(this.message_id);
        }
        sb.replace(0, 2, "MarkConversationReadNotify{");
        sb.append('}');
        return sb.toString();
    }

    public MarkConversationReadNotify(String str, Integer num, Long l, Long l2, Long l3, Long l4) {
        this(str, num, l, l2, l3, l4, ByteString.EMPTY);
    }

    public MarkConversationReadNotify(String str, Integer num, Long l, Long l2, Long l3, Long l4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_id = str;
        this.conversation_type = num;
        this.read_index = l;
        this.read_index_v2 = l2;
        this.user_id = l3;
        this.message_id = l4;
    }
}
