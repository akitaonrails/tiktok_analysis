package com.bytedance.im.core.proto;

import X.C09CT;
import X.C0Y88;
import com.bytedance.im.core.proto.GetMessageByIdRequestBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public final class GetMessageByIdRequestBody extends Message<GetMessageByIdRequestBody, C0Y88> {
    public static final long serialVersionUID = 0;

    @C09CT("conversation_id")
    public final String conversation_id;

    @C09CT("conversation_short_id")
    public final Long conversation_short_id;

    @C09CT("conversation_type")
    public final Integer conversation_type;

    @C09CT("server_message_id")
    public final Long server_message_id;
    public static final ProtoAdapter<GetMessageByIdRequestBody> ADAPTER = new ProtoAdapter<GetMessageByIdRequestBody>() { // from class: X.0Y89
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final GetMessageByIdRequestBody decode(ProtoReader protoReader) {
            C0Y88 c0y88 = new C0Y88();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                    c0y88.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                } else {
                                    c0y88.LJI = ProtoAdapter.INT64.decode(protoReader);
                                }
                            } else {
                                c0y88.LJFF = ProtoAdapter.INT64.decode(protoReader);
                            }
                        } else {
                            c0y88.LJ = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c0y88.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c0y88.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(GetMessageByIdRequestBody getMessageByIdRequestBody) {
            GetMessageByIdRequestBody getMessageByIdRequestBody2 = getMessageByIdRequestBody;
            int iEncodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, getMessageByIdRequestBody2.conversation_id) + ProtoAdapter.INT32.encodedSizeWithTag(2, getMessageByIdRequestBody2.conversation_type);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(3, getMessageByIdRequestBody2.conversation_short_id) + protoAdapter.encodedSizeWithTag(4, getMessageByIdRequestBody2.server_message_id) + getMessageByIdRequestBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, GetMessageByIdRequestBody getMessageByIdRequestBody) {
            GetMessageByIdRequestBody getMessageByIdRequestBody2 = getMessageByIdRequestBody;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getMessageByIdRequestBody2.conversation_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, getMessageByIdRequestBody2.conversation_type);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 3, getMessageByIdRequestBody2.conversation_short_id);
            protoAdapter.encodeWithTag(protoWriter, 4, getMessageByIdRequestBody2.server_message_id);
            protoWriter.writeBytes(getMessageByIdRequestBody2.unknownFields());
        }
    };
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final Long DEFAULT_SERVER_MESSAGE_ID = 0L;

    @Override // com.squareup.wire.Message
    public C0Y88 newBuilder() {
        C0Y88 c0y88 = new C0Y88();
        c0y88.LIZLLL = this.conversation_id;
        c0y88.LJ = this.conversation_type;
        c0y88.LJFF = this.conversation_short_id;
        c0y88.LJI = this.server_message_id;
        c0y88.addUnknownFields(unknownFields());
        return c0y88;
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
        if (this.server_message_id != null) {
            sb.append(", server_message_id=");
            sb.append(this.server_message_id);
        }
        sb.replace(0, 2, "GetMessageByIdRequestBody{");
        sb.append('}');
        return sb.toString();
    }

    public GetMessageByIdRequestBody(String str, Integer num, Long l, Long l2) {
        this(str, num, l, l2, ByteString.EMPTY);
    }

    public GetMessageByIdRequestBody(String str, Integer num, Long l, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_id = str;
        this.conversation_type = num;
        this.conversation_short_id = l;
        this.server_message_id = l2;
    }
}
