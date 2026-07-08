package com.bytedance.im.core.proto;

import X.C09CT;
import X.C1516540pZE;
import X.C870320YCg;
import com.bytedance.im.core.proto.GetMessagesRequestBody;
import com.bytedance.im.core.proto.MessageIDIndexEntry;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public final class GetMessagesRequestBody extends Message<GetMessagesRequestBody, C870320YCg> {
    public static final long serialVersionUID = 0;

    @C09CT("conversation_id")
    public final String conversation_id;

    @C09CT("conversation_short_id")
    public final Long conversation_short_id;

    @C09CT("conversation_type")
    public final Integer conversation_type;

    @C09CT("entries")
    public final List<MessageIDIndexEntry> entries;
    public static final ProtoAdapter<GetMessagesRequestBody> ADAPTER = new ProtoAdapter<GetMessagesRequestBody>() { // from class: X.0YCh
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final GetMessagesRequestBody decode(ProtoReader protoReader) {
            C870320YCg c870320YCg = new C870320YCg();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                    c870320YCg.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                } else {
                                    c870320YCg.LJI.add(MessageIDIndexEntry.ADAPTER.decode(protoReader));
                                }
                            } else {
                                c870320YCg.LJFF = ProtoAdapter.INT64.decode(protoReader);
                            }
                        } else {
                            c870320YCg.LJ = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c870320YCg.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c870320YCg.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(GetMessagesRequestBody getMessagesRequestBody) {
            GetMessagesRequestBody getMessagesRequestBody2 = getMessagesRequestBody;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, getMessagesRequestBody2.conversation_id) + ProtoAdapter.INT32.encodedSizeWithTag(2, getMessagesRequestBody2.conversation_type) + ProtoAdapter.INT64.encodedSizeWithTag(3, getMessagesRequestBody2.conversation_short_id) + MessageIDIndexEntry.ADAPTER.asRepeated().encodedSizeWithTag(4, getMessagesRequestBody2.entries) + getMessagesRequestBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, GetMessagesRequestBody getMessagesRequestBody) {
            GetMessagesRequestBody getMessagesRequestBody2 = getMessagesRequestBody;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getMessagesRequestBody2.conversation_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, getMessagesRequestBody2.conversation_type);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, getMessagesRequestBody2.conversation_short_id);
            MessageIDIndexEntry.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, getMessagesRequestBody2.entries);
            protoWriter.writeBytes(getMessagesRequestBody2.unknownFields());
        }
    };
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;

    @Override // com.squareup.wire.Message
    public C870320YCg newBuilder() {
        C870320YCg c870320YCg = new C870320YCg();
        c870320YCg.LIZLLL = this.conversation_id;
        c870320YCg.LJ = this.conversation_type;
        c870320YCg.LJFF = this.conversation_short_id;
        c870320YCg.LJI = C1516540pZE.LIZJ("entries", this.entries);
        c870320YCg.addUnknownFields(unknownFields());
        return c870320YCg;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", conversation_id=");
        sb.append(this.conversation_id);
        sb.append(", conversation_type=");
        sb.append(this.conversation_type);
        sb.append(", conversation_short_id=");
        sb.append(this.conversation_short_id);
        List<MessageIDIndexEntry> list = this.entries;
        if (list != null && !list.isEmpty()) {
            sb.append(", entries=");
            sb.append(this.entries);
        }
        sb.replace(0, 2, "GetMessagesRequestBody{");
        sb.append('}');
        return sb.toString();
    }

    public GetMessagesRequestBody(String str, Integer num, Long l, List<MessageIDIndexEntry> list) {
        this(str, num, l, list, ByteString.EMPTY);
    }

    public GetMessagesRequestBody(String str, Integer num, Long l, List<MessageIDIndexEntry> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_id = str;
        this.conversation_type = num;
        this.conversation_short_id = l;
        this.entries = C1516540pZE.LJFF("entries", list);
    }
}
