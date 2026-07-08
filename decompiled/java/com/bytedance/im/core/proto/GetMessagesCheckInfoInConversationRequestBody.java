package com.bytedance.im.core.proto;

import X.C09CT;
import X.C2251701DBg;
import com.bytedance.im.core.proto.GetMessagesCheckInfoInConversationRequestBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: loaded from: classes36.dex */
public final class GetMessagesCheckInfoInConversationRequestBody extends Message<GetMessagesCheckInfoInConversationRequestBody, C2251701DBg> {
    public static final ProtoAdapter<GetMessagesCheckInfoInConversationRequestBody> ADAPTER = new ProtoAdapter<GetMessagesCheckInfoInConversationRequestBody>() { // from class: X.1DBf
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final GetMessagesCheckInfoInConversationRequestBody decode(ProtoReader protoReader) {
            C2251701DBg c2251701DBg = new C2251701DBg();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 2:
                            c2251701DBg.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 3:
                            c2251701DBg.LJI = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 4:
                            c2251701DBg.LJIIIIZZ = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 5:
                            c2251701DBg.LJ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c2251701DBg.LJFF = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 7:
                            c2251701DBg.LJII = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2251701DBg.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2251701DBg.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(GetMessagesCheckInfoInConversationRequestBody getMessagesCheckInfoInConversationRequestBody) {
            GetMessagesCheckInfoInConversationRequestBody getMessagesCheckInfoInConversationRequestBody2 = getMessagesCheckInfoInConversationRequestBody;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(2, getMessagesCheckInfoInConversationRequestBody2.conversation_short_id) + ProtoAdapter.STRING.encodedSizeWithTag(5, getMessagesCheckInfoInConversationRequestBody2.conversation_id);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(6, getMessagesCheckInfoInConversationRequestBody2.conversation_type) + protoAdapter.encodedSizeWithTag(3, getMessagesCheckInfoInConversationRequestBody2.cursor_reverse_begin) + protoAdapter.encodedSizeWithTag(7, getMessagesCheckInfoInConversationRequestBody2.cursor_reverse_end) + protoAdapter2.encodedSizeWithTag(4, getMessagesCheckInfoInConversationRequestBody2.expect_msg_total_count) + getMessagesCheckInfoInConversationRequestBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, GetMessagesCheckInfoInConversationRequestBody getMessagesCheckInfoInConversationRequestBody) {
            GetMessagesCheckInfoInConversationRequestBody getMessagesCheckInfoInConversationRequestBody2 = getMessagesCheckInfoInConversationRequestBody;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 2, getMessagesCheckInfoInConversationRequestBody2.conversation_short_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, getMessagesCheckInfoInConversationRequestBody2.conversation_id);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            protoAdapter2.encodeWithTag(protoWriter, 6, getMessagesCheckInfoInConversationRequestBody2.conversation_type);
            protoAdapter.encodeWithTag(protoWriter, 3, getMessagesCheckInfoInConversationRequestBody2.cursor_reverse_begin);
            protoAdapter.encodeWithTag(protoWriter, 7, getMessagesCheckInfoInConversationRequestBody2.cursor_reverse_end);
            protoAdapter2.encodeWithTag(protoWriter, 4, getMessagesCheckInfoInConversationRequestBody2.expect_msg_total_count);
            protoWriter.writeBytes(getMessagesCheckInfoInConversationRequestBody2.unknownFields());
        }
    };
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;
    public static final Long DEFAULT_CURSOR_REVERSE_BEGIN = 0L;
    public static final Long DEFAULT_CURSOR_REVERSE_END = 0L;
    public static final Integer DEFAULT_EXPECT_MSG_TOTAL_COUNT = 0;
    public static final long serialVersionUID = 0;

    @C09CT("conversation_id")
    public final String conversation_id;

    @C09CT("conversation_short_id")
    public final Long conversation_short_id;

    @C09CT("conversation_type")
    public final Integer conversation_type;

    @C09CT("cursor_reverse_begin")
    public final Long cursor_reverse_begin;

    @C09CT("cursor_reverse_end")
    public final Long cursor_reverse_end;

    @C09CT("expect_msg_total_count")
    public final Integer expect_msg_total_count;

    @Override // com.squareup.wire.Message
    public C2251701DBg newBuilder() {
        C2251701DBg c2251701DBg = new C2251701DBg();
        c2251701DBg.LIZLLL = this.conversation_short_id;
        c2251701DBg.LJ = this.conversation_id;
        c2251701DBg.LJFF = this.conversation_type;
        c2251701DBg.LJI = this.cursor_reverse_begin;
        c2251701DBg.LJII = this.cursor_reverse_end;
        c2251701DBg.LJIIIIZZ = this.expect_msg_total_count;
        c2251701DBg.addUnknownFields(unknownFields());
        return c2251701DBg;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.conversation_short_id != null) {
            sb.append(", conversation_short_id=");
            sb.append(this.conversation_short_id);
        }
        if (this.conversation_id != null) {
            sb.append(", conversation_id=");
            sb.append(this.conversation_id);
        }
        if (this.conversation_type != null) {
            sb.append(", conversation_type=");
            sb.append(this.conversation_type);
        }
        if (this.cursor_reverse_begin != null) {
            sb.append(", cursor_reverse_begin=");
            sb.append(this.cursor_reverse_begin);
        }
        if (this.cursor_reverse_end != null) {
            sb.append(", cursor_reverse_end=");
            sb.append(this.cursor_reverse_end);
        }
        if (this.expect_msg_total_count != null) {
            sb.append(", expect_msg_total_count=");
            sb.append(this.expect_msg_total_count);
        }
        sb.replace(0, 2, "GetMessagesCheckInfoInConversationRequestBody{");
        sb.append('}');
        return sb.toString();
    }

    public GetMessagesCheckInfoInConversationRequestBody(Long l, String str, Integer num, Long l2, Long l3, Integer num2) {
        this(l, str, num, l2, l3, num2, ByteString.EMPTY);
    }

    public GetMessagesCheckInfoInConversationRequestBody(Long l, String str, Integer num, Long l2, Long l3, Integer num2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_short_id = l;
        this.conversation_id = str;
        this.conversation_type = num;
        this.cursor_reverse_begin = l2;
        this.cursor_reverse_end = l3;
        this.expect_msg_total_count = num2;
    }
}
