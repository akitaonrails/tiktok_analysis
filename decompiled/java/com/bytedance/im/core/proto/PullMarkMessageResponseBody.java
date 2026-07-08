package com.bytedance.im.core.proto;

import X.C09CT;
import X.C1516540pZE;
import X.C2238521CjS;
import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.im.core.proto.PullMarkMessageResponseBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class PullMarkMessageResponseBody extends Message<PullMarkMessageResponseBody, C2238521CjS> {
    public static final ProtoAdapter<PullMarkMessageResponseBody> ADAPTER = new ProtoAdapter<PullMarkMessageResponseBody>() { // from class: X.1CjR
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final PullMarkMessageResponseBody decode(ProtoReader protoReader) {
            C2238521CjS c2238521CjS = new C2238521CjS();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c2238521CjS.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                c2238521CjS.LJFF = ProtoAdapter.INT64.decode(protoReader);
                            }
                        } else {
                            c2238521CjS.LJ = ProtoAdapter.BOOL.decode(protoReader);
                        }
                    } else {
                        c2238521CjS.LIZLLL.add(MessageBody.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2238521CjS.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(PullMarkMessageResponseBody pullMarkMessageResponseBody) {
            PullMarkMessageResponseBody pullMarkMessageResponseBody2 = pullMarkMessageResponseBody;
            return MessageBody.ADAPTER.asRepeated().encodedSizeWithTag(1, pullMarkMessageResponseBody2.messages) + ProtoAdapter.BOOL.encodedSizeWithTag(2, pullMarkMessageResponseBody2.has_more) + ProtoAdapter.INT64.encodedSizeWithTag(3, pullMarkMessageResponseBody2.next_cursor) + pullMarkMessageResponseBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, PullMarkMessageResponseBody pullMarkMessageResponseBody) {
            PullMarkMessageResponseBody pullMarkMessageResponseBody2 = pullMarkMessageResponseBody;
            MessageBody.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, pullMarkMessageResponseBody2.messages);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, pullMarkMessageResponseBody2.has_more);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, pullMarkMessageResponseBody2.next_cursor);
            protoWriter.writeBytes(pullMarkMessageResponseBody2.unknownFields());
        }
    };
    public static final Boolean DEFAULT_HAS_MORE = Boolean.FALSE;
    public static final Long DEFAULT_NEXT_CURSOR = 0L;
    public static final long serialVersionUID = 0;

    @C09CT("has_more")
    public final Boolean has_more;

    @C09CT("messages")
    public final List<MessageBody> messages;

    @C09CT("next_cursor")
    public final Long next_cursor;

    @Override // com.squareup.wire.Message
    public C2238521CjS newBuilder() {
        C2238521CjS c2238521CjS = new C2238521CjS();
        c2238521CjS.LIZLLL = C1516540pZE.LIZJ("messages", this.messages);
        c2238521CjS.LJ = this.has_more;
        c2238521CjS.LJFF = this.next_cursor;
        c2238521CjS.addUnknownFields(unknownFields());
        return c2238521CjS;
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
        if (this.next_cursor != null) {
            sb.append(", next_cursor=");
            sb.append(this.next_cursor);
        }
        sb.replace(0, 2, "PullMarkMessageResponseBody{");
        sb.append('}');
        return sb.toString();
    }

    public PullMarkMessageResponseBody(List<MessageBody> list, Boolean bool, Long l) {
        this(list, bool, l, ByteString.EMPTY);
    }

    public PullMarkMessageResponseBody(List<MessageBody> list, Boolean bool, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.messages = C1516540pZE.LJFF("messages", list);
        this.has_more = bool;
        this.next_cursor = l;
    }
}
