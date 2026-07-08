package com.bytedance.im.core.proto;

import X.C09CT;
import X.C0Y8G;
import com.bytedance.im.core.proto.GetMessagePreviewRequestBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public final class GetMessagePreviewRequestBody extends Message<GetMessagePreviewRequestBody, C0Y8G> {
    public static final ProtoAdapter<GetMessagePreviewRequestBody> ADAPTER = new ProtoAdapter<GetMessagePreviewRequestBody>() { // from class: X.0Y8H
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final GetMessagePreviewRequestBody decode(ProtoReader protoReader) {
            C0Y8G c0y8g = new C0Y8G();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c0y8g.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c0y8g.LJ = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c0y8g.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c0y8g.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(GetMessagePreviewRequestBody getMessagePreviewRequestBody) {
            GetMessagePreviewRequestBody getMessagePreviewRequestBody2 = getMessagePreviewRequestBody;
            return ProtoAdapter.INT64.encodedSizeWithTag(1, getMessagePreviewRequestBody2.conversation_short_id) + ProtoAdapter.INT32.encodedSizeWithTag(2, getMessagePreviewRequestBody2.limit) + getMessagePreviewRequestBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, GetMessagePreviewRequestBody getMessagePreviewRequestBody) {
            GetMessagePreviewRequestBody getMessagePreviewRequestBody2 = getMessagePreviewRequestBody;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, getMessagePreviewRequestBody2.conversation_short_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, getMessagePreviewRequestBody2.limit);
            protoWriter.writeBytes(getMessagePreviewRequestBody2.unknownFields());
        }
    };
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final Integer DEFAULT_LIMIT = 0;
    public static final long serialVersionUID = 0;

    @C09CT("conversation_short_id")
    public final Long conversation_short_id;

    @C09CT("limit")
    public final Integer limit;

    @Override // com.squareup.wire.Message
    public C0Y8G newBuilder() {
        C0Y8G c0y8g = new C0Y8G();
        c0y8g.LIZLLL = this.conversation_short_id;
        c0y8g.LJ = this.limit;
        c0y8g.addUnknownFields(unknownFields());
        return c0y8g;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.conversation_short_id != null) {
            sb.append(", conversation_short_id=");
            sb.append(this.conversation_short_id);
        }
        if (this.limit != null) {
            sb.append(", limit=");
            sb.append(this.limit);
        }
        sb.replace(0, 2, "GetMessagePreviewRequestBody{");
        sb.append('}');
        return sb.toString();
    }

    public GetMessagePreviewRequestBody(Long l, Integer num) {
        this(l, num, ByteString.EMPTY);
    }

    public GetMessagePreviewRequestBody(Long l, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_short_id = l;
        this.limit = num;
    }
}
