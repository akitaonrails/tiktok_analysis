package com.bytedance.im.core.proto;

import X.C09CT;
import X.C1516540pZE;
import X.C875380YVs;
import com.bytedance.im.core.proto.CheckStatusMessagesResponseBody;
import com.bytedance.im.core.proto.MessageBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public final class CheckStatusMessagesResponseBody extends Message<CheckStatusMessagesResponseBody, C875380YVs> {
    public static final ProtoAdapter<CheckStatusMessagesResponseBody> ADAPTER = new ProtoAdapter<CheckStatusMessagesResponseBody>() { // from class: X.0YVr
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final CheckStatusMessagesResponseBody decode(ProtoReader protoReader) {
            C875380YVs c875380YVs = new C875380YVs();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c875380YVs.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                c875380YVs.LJFF = ProtoAdapter.INT64.decode(protoReader);
                            }
                        } else {
                            c875380YVs.LJ = ProtoAdapter.BOOL.decode(protoReader);
                        }
                    } else {
                        c875380YVs.LIZLLL.add(MessageBody.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c875380YVs.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(CheckStatusMessagesResponseBody checkStatusMessagesResponseBody) {
            CheckStatusMessagesResponseBody checkStatusMessagesResponseBody2 = checkStatusMessagesResponseBody;
            return MessageBody.ADAPTER.asRepeated().encodedSizeWithTag(1, checkStatusMessagesResponseBody2.messages) + ProtoAdapter.BOOL.encodedSizeWithTag(2, checkStatusMessagesResponseBody2.has_more) + ProtoAdapter.INT64.encodedSizeWithTag(3, checkStatusMessagesResponseBody2.new_start_cursor) + checkStatusMessagesResponseBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, CheckStatusMessagesResponseBody checkStatusMessagesResponseBody) {
            CheckStatusMessagesResponseBody checkStatusMessagesResponseBody2 = checkStatusMessagesResponseBody;
            MessageBody.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, checkStatusMessagesResponseBody2.messages);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, checkStatusMessagesResponseBody2.has_more);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, checkStatusMessagesResponseBody2.new_start_cursor);
            protoWriter.writeBytes(checkStatusMessagesResponseBody2.unknownFields());
        }
    };
    public static final Boolean DEFAULT_HAS_MORE = Boolean.FALSE;
    public static final Long DEFAULT_NEW_START_CURSOR = 0L;
    public static final long serialVersionUID = 0;

    @C09CT("has_more")
    public final Boolean has_more;

    @C09CT("messages")
    public final List<MessageBody> messages;

    @C09CT("new_start_cursor")
    public final Long new_start_cursor;

    @Override // com.squareup.wire.Message
    public C875380YVs newBuilder() {
        C875380YVs c875380YVs = new C875380YVs();
        c875380YVs.LIZLLL = C1516540pZE.LIZJ("messages", this.messages);
        c875380YVs.LJ = this.has_more;
        c875380YVs.LJFF = this.new_start_cursor;
        c875380YVs.addUnknownFields(unknownFields());
        return c875380YVs;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<MessageBody> list = this.messages;
        if (list != null && !list.isEmpty()) {
            sb.append(", messages=");
            sb.append(this.messages);
        }
        if (this.has_more != null) {
            sb.append(", has_more=");
            sb.append(this.has_more);
        }
        if (this.new_start_cursor != null) {
            sb.append(", new_start_cursor=");
            sb.append(this.new_start_cursor);
        }
        sb.replace(0, 2, "CheckStatusMessagesResponseBody{");
        sb.append('}');
        return sb.toString();
    }

    public CheckStatusMessagesResponseBody(List<MessageBody> list, Boolean bool, Long l) {
        this(list, bool, l, ByteString.EMPTY);
    }

    public CheckStatusMessagesResponseBody(List<MessageBody> list, Boolean bool, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.messages = C1516540pZE.LJFF("messages", list);
        this.has_more = bool;
        this.new_start_cursor = l;
    }
}
