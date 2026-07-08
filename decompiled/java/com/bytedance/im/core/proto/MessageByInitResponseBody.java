package com.bytedance.im.core.proto;

import X.C09CT;
import X.C1516540pZE;
import X.C2239571Cl9;
import com.bytedance.im.core.proto.ConversationMessage;
import com.bytedance.im.core.proto.MessageByInitResponseBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class MessageByInitResponseBody extends Message<MessageByInitResponseBody, C2239571Cl9> {
    public static final long serialVersionUID = 0;

    @C09CT("cmd_index")
    public final Long cmd_index;

    @C09CT("has_more")
    public final Boolean has_more;

    @C09CT("messages")
    public final List<ConversationMessage> messages;

    @C09CT("next_init_version")
    public final Long next_init_version;

    @C09CT("user_cursor")
    public final Long user_cursor;

    @C09CT("version")
    public final Long version;
    public static final ProtoAdapter<MessageByInitResponseBody> ADAPTER = new ProtoAdapter<MessageByInitResponseBody>() { // from class: X.1Cl8
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final MessageByInitResponseBody decode(ProtoReader protoReader) {
            C2239571Cl9 c2239571Cl9 = new C2239571Cl9();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c2239571Cl9.LIZLLL.add(ConversationMessage.ADAPTER.decode(protoReader));
                            break;
                        case 2:
                            c2239571Cl9.LJ = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 3:
                            c2239571Cl9.LJFF = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 4:
                            c2239571Cl9.LJI = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 5:
                            c2239571Cl9.LJII = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 6:
                            c2239571Cl9.LJIIIIZZ = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2239571Cl9.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2239571Cl9.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(MessageByInitResponseBody messageByInitResponseBody) {
            MessageByInitResponseBody messageByInitResponseBody2 = messageByInitResponseBody;
            int iEncodedSizeWithTag = ConversationMessage.ADAPTER.asRepeated().encodedSizeWithTag(1, messageByInitResponseBody2.messages) + ProtoAdapter.BOOL.encodedSizeWithTag(2, messageByInitResponseBody2.has_more);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(3, messageByInitResponseBody2.next_init_version) + protoAdapter.encodedSizeWithTag(4, messageByInitResponseBody2.version) + protoAdapter.encodedSizeWithTag(5, messageByInitResponseBody2.user_cursor) + protoAdapter.encodedSizeWithTag(6, messageByInitResponseBody2.cmd_index) + messageByInitResponseBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, MessageByInitResponseBody messageByInitResponseBody) {
            MessageByInitResponseBody messageByInitResponseBody2 = messageByInitResponseBody;
            ConversationMessage.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, messageByInitResponseBody2.messages);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, messageByInitResponseBody2.has_more);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 3, messageByInitResponseBody2.next_init_version);
            protoAdapter.encodeWithTag(protoWriter, 4, messageByInitResponseBody2.version);
            protoAdapter.encodeWithTag(protoWriter, 5, messageByInitResponseBody2.user_cursor);
            protoAdapter.encodeWithTag(protoWriter, 6, messageByInitResponseBody2.cmd_index);
            protoWriter.writeBytes(messageByInitResponseBody2.unknownFields());
        }
    };
    public static final Boolean DEFAULT_HAS_MORE = Boolean.FALSE;
    public static final Long DEFAULT_NEXT_INIT_VERSION = 0L;
    public static final Long DEFAULT_VERSION = 0L;
    public static final Long DEFAULT_USER_CURSOR = 0L;
    public static final Long DEFAULT_CMD_INDEX = 0L;

    @Override // com.squareup.wire.Message
    public C2239571Cl9 newBuilder() {
        C2239571Cl9 c2239571Cl9 = new C2239571Cl9();
        c2239571Cl9.LIZLLL = C1516540pZE.LIZJ("messages", this.messages);
        c2239571Cl9.LJ = this.has_more;
        c2239571Cl9.LJFF = this.next_init_version;
        c2239571Cl9.LJI = this.version;
        c2239571Cl9.LJII = this.user_cursor;
        c2239571Cl9.LJIIIIZZ = this.cmd_index;
        c2239571Cl9.addUnknownFields(unknownFields());
        return c2239571Cl9;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<ConversationMessage> list = this.messages;
        if (list != null && !list.isEmpty()) {
            sb.append(", messages=");
            sb.append(this.messages);
        }
        sb.append(", has_more=");
        sb.append(this.has_more);
        sb.append(", next_init_version=");
        sb.append(this.next_init_version);
        if (this.version != null) {
            sb.append(", version=");
            sb.append(this.version);
        }
        if (this.user_cursor != null) {
            sb.append(", user_cursor=");
            sb.append(this.user_cursor);
        }
        if (this.cmd_index != null) {
            sb.append(", cmd_index=");
            sb.append(this.cmd_index);
        }
        sb.replace(0, 2, "MessageByInitResponseBody{");
        sb.append('}');
        return sb.toString();
    }

    public MessageByInitResponseBody(List<ConversationMessage> list, Boolean bool, Long l, Long l2, Long l3, Long l4) {
        this(list, bool, l, l2, l3, l4, ByteString.EMPTY);
    }

    public MessageByInitResponseBody(List<ConversationMessage> list, Boolean bool, Long l, Long l2, Long l3, Long l4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.messages = C1516540pZE.LJFF("messages", list);
        this.has_more = bool;
        this.next_init_version = l;
        this.version = l2;
        this.user_cursor = l3;
        this.cmd_index = l4;
    }
}
