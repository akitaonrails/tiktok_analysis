package com.bytedance.im.core.proto;

import X.C09CT;
import X.C867920Y3a;
import com.bytedance.im.core.proto.RecallMessageRequestBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public final class RecallMessageRequestBody extends Message<RecallMessageRequestBody, C867920Y3a> {
    public static final long serialVersionUID = 0;

    @C09CT("conversation_id")
    public final String conversation_id;

    @C09CT("conversation_short_id")
    public final Long conversation_short_id;

    @C09CT("conversation_type")
    public final Integer conversation_type;

    @C09CT("inbox_type")
    public final Integer inbox_type;

    @C09CT("server_message_id")
    public final Long server_message_id;
    public static final ProtoAdapter<RecallMessageRequestBody> ADAPTER = new ProtoAdapter<RecallMessageRequestBody>() { // from class: X.0Y3b
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final RecallMessageRequestBody decode(ProtoReader protoReader) {
            C867920Y3a c867920Y3a = new C867920Y3a();
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
                                        c867920Y3a.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                    } else {
                                        c867920Y3a.LJII = ProtoAdapter.INT32.decode(protoReader);
                                    }
                                } else {
                                    c867920Y3a.LJI = ProtoAdapter.INT64.decode(protoReader);
                                }
                            } else {
                                c867920Y3a.LJFF = ProtoAdapter.INT32.decode(protoReader);
                            }
                        } else {
                            c867920Y3a.LJ = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c867920Y3a.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c867920Y3a.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(RecallMessageRequestBody recallMessageRequestBody) {
            RecallMessageRequestBody recallMessageRequestBody2 = recallMessageRequestBody;
            int iEncodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, recallMessageRequestBody2.conversation_id);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, recallMessageRequestBody2.conversation_short_id);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            return iEncodedSizeWithTag2 + protoAdapter2.encodedSizeWithTag(3, recallMessageRequestBody2.conversation_type) + protoAdapter.encodedSizeWithTag(4, recallMessageRequestBody2.server_message_id) + protoAdapter2.encodedSizeWithTag(5, recallMessageRequestBody2.inbox_type) + recallMessageRequestBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, RecallMessageRequestBody recallMessageRequestBody) {
            RecallMessageRequestBody recallMessageRequestBody2 = recallMessageRequestBody;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, recallMessageRequestBody2.conversation_id);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 2, recallMessageRequestBody2.conversation_short_id);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            protoAdapter2.encodeWithTag(protoWriter, 3, recallMessageRequestBody2.conversation_type);
            protoAdapter.encodeWithTag(protoWriter, 4, recallMessageRequestBody2.server_message_id);
            protoAdapter2.encodeWithTag(protoWriter, 5, recallMessageRequestBody2.inbox_type);
            protoWriter.writeBytes(recallMessageRequestBody2.unknownFields());
        }
    };
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;
    public static final Long DEFAULT_SERVER_MESSAGE_ID = 0L;
    public static final Integer DEFAULT_INBOX_TYPE = 0;

    @Override // com.squareup.wire.Message
    public C867920Y3a newBuilder() {
        C867920Y3a c867920Y3a = new C867920Y3a();
        c867920Y3a.LIZLLL = this.conversation_id;
        c867920Y3a.LJ = this.conversation_short_id;
        c867920Y3a.LJFF = this.conversation_type;
        c867920Y3a.LJI = this.server_message_id;
        c867920Y3a.LJII = this.inbox_type;
        c867920Y3a.addUnknownFields(unknownFields());
        return c867920Y3a;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.conversation_id != null) {
            sb.append(", conversation_id=");
            sb.append(this.conversation_id);
        }
        if (this.conversation_short_id != null) {
            sb.append(", conversation_short_id=");
            sb.append(this.conversation_short_id);
        }
        if (this.conversation_type != null) {
            sb.append(", conversation_type=");
            sb.append(this.conversation_type);
        }
        if (this.server_message_id != null) {
            sb.append(", server_message_id=");
            sb.append(this.server_message_id);
        }
        if (this.inbox_type != null) {
            sb.append(", inbox_type=");
            sb.append(this.inbox_type);
        }
        sb.replace(0, 2, "RecallMessageRequestBody{");
        sb.append('}');
        return sb.toString();
    }

    public RecallMessageRequestBody(String str, Long l, Integer num, Long l2, Integer num2) {
        this(str, l, num, l2, num2, ByteString.EMPTY);
    }

    public RecallMessageRequestBody(String str, Long l, Integer num, Long l2, Integer num2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_id = str;
        this.conversation_short_id = l;
        this.conversation_type = num;
        this.server_message_id = l2;
        this.inbox_type = num2;
    }
}
