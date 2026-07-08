package com.bytedance.im.core.proto;

import X.C09CT;
import X.C1516540pZE;
import X.C2238641Cje;
import com.bytedance.im.core.proto.GetCmdMessageRespBody;
import com.bytedance.im.core.proto.MessageBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class GetCmdMessageRespBody extends Message<GetCmdMessageRespBody, C2238641Cje> {
    public static final ProtoAdapter<GetCmdMessageRespBody> ADAPTER = new ProtoAdapter<GetCmdMessageRespBody>() { // from class: X.1Cjd
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final GetCmdMessageRespBody decode(ProtoReader protoReader) {
            C2238641Cje c2238641Cje = new C2238641Cje();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                    c2238641Cje.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                } else {
                                    c2238641Cje.LJI = ProtoAdapter.INT64.decode(protoReader);
                                }
                            } else {
                                c2238641Cje.LJFF = ProtoAdapter.INT64.decode(protoReader);
                            }
                        } else {
                            c2238641Cje.LJ = ProtoAdapter.BOOL.decode(protoReader);
                        }
                    } else {
                        c2238641Cje.LIZLLL.add(MessageBody.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2238641Cje.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(GetCmdMessageRespBody getCmdMessageRespBody) {
            GetCmdMessageRespBody getCmdMessageRespBody2 = getCmdMessageRespBody;
            int iEncodedSizeWithTag = MessageBody.ADAPTER.asRepeated().encodedSizeWithTag(1, getCmdMessageRespBody2.messages) + ProtoAdapter.BOOL.encodedSizeWithTag(2, getCmdMessageRespBody2.has_more);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(3, getCmdMessageRespBody2.next_cmd_index) + protoAdapter.encodedSizeWithTag(4, getCmdMessageRespBody2.next_user_message_cursor) + getCmdMessageRespBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, GetCmdMessageRespBody getCmdMessageRespBody) {
            GetCmdMessageRespBody getCmdMessageRespBody2 = getCmdMessageRespBody;
            MessageBody.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getCmdMessageRespBody2.messages);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, getCmdMessageRespBody2.has_more);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 3, getCmdMessageRespBody2.next_cmd_index);
            protoAdapter.encodeWithTag(protoWriter, 4, getCmdMessageRespBody2.next_user_message_cursor);
            protoWriter.writeBytes(getCmdMessageRespBody2.unknownFields());
        }
    };
    public static final Boolean DEFAULT_HAS_MORE = Boolean.FALSE;
    public static final Long DEFAULT_NEXT_CMD_INDEX = 0L;
    public static final Long DEFAULT_NEXT_USER_MESSAGE_CURSOR = 0L;
    public static final long serialVersionUID = 0;

    @C09CT("has_more")
    public final Boolean has_more;

    @C09CT("messages")
    public final List<MessageBody> messages;

    @C09CT("next_cmd_index")
    public final Long next_cmd_index;

    @C09CT("next_user_message_cursor")
    public final Long next_user_message_cursor;

    @Override // com.squareup.wire.Message
    public C2238641Cje newBuilder() {
        C2238641Cje c2238641Cje = new C2238641Cje();
        c2238641Cje.LIZLLL = C1516540pZE.LIZJ("messages", this.messages);
        c2238641Cje.LJ = this.has_more;
        c2238641Cje.LJFF = this.next_cmd_index;
        c2238641Cje.LJI = this.next_user_message_cursor;
        c2238641Cje.addUnknownFields(unknownFields());
        return c2238641Cje;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<MessageBody> list = this.messages;
        if (list != null && !list.isEmpty()) {
            sb.append(", messages=");
            sb.append(this.messages);
        }
        sb.append(", has_more=");
        sb.append(this.has_more);
        if (this.next_cmd_index != null) {
            sb.append(", next_cmd_index=");
            sb.append(this.next_cmd_index);
        }
        if (this.next_user_message_cursor != null) {
            sb.append(", next_user_message_cursor=");
            sb.append(this.next_user_message_cursor);
        }
        sb.replace(0, 2, "GetCmdMessageRespBody{");
        sb.append('}');
        return sb.toString();
    }

    public GetCmdMessageRespBody(List<MessageBody> list, Boolean bool, Long l, Long l2) {
        this(list, bool, l, l2, ByteString.EMPTY);
    }

    public GetCmdMessageRespBody(List<MessageBody> list, Boolean bool, Long l, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.messages = C1516540pZE.LJFF("messages", list);
        this.has_more = bool;
        this.next_cmd_index = l;
        this.next_user_message_cursor = l2;
    }
}
