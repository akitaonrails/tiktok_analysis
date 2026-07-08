package com.bytedance.im.core.proto;

import X.C09CT;
import X.C2229361CNi;
import com.bytedance.im.core.proto.GetStrangerMessagesRequestBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class GetStrangerMessagesRequestBody extends Message<GetStrangerMessagesRequestBody, C2229361CNi> {
    public static final ProtoAdapter<GetStrangerMessagesRequestBody> ADAPTER = new ProtoAdapter<GetStrangerMessagesRequestBody>() { // from class: X.1CNh
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final GetStrangerMessagesRequestBody decode(ProtoReader protoReader) {
            C2229361CNi c2229361CNi = new C2229361CNi();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2229361CNi.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c2229361CNi.LJ = ProtoAdapter.BOOL.decode(protoReader);
                        }
                    } else {
                        c2229361CNi.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2229361CNi.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(GetStrangerMessagesRequestBody getStrangerMessagesRequestBody) {
            GetStrangerMessagesRequestBody getStrangerMessagesRequestBody2 = getStrangerMessagesRequestBody;
            return ProtoAdapter.INT64.encodedSizeWithTag(1, getStrangerMessagesRequestBody2.conversation_short_id) + ProtoAdapter.BOOL.encodedSizeWithTag(2, getStrangerMessagesRequestBody2.reset_unread_count) + getStrangerMessagesRequestBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, GetStrangerMessagesRequestBody getStrangerMessagesRequestBody) {
            GetStrangerMessagesRequestBody getStrangerMessagesRequestBody2 = getStrangerMessagesRequestBody;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, getStrangerMessagesRequestBody2.conversation_short_id);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, getStrangerMessagesRequestBody2.reset_unread_count);
            protoWriter.writeBytes(getStrangerMessagesRequestBody2.unknownFields());
        }
    };
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final Boolean DEFAULT_RESET_UNREAD_COUNT = Boolean.FALSE;
    public static final long serialVersionUID = 0;

    @C09CT("conversation_short_id")
    public final Long conversation_short_id;

    @C09CT("reset_unread_count")
    public final Boolean reset_unread_count;

    @Override // com.squareup.wire.Message
    public C2229361CNi newBuilder() {
        C2229361CNi c2229361CNi = new C2229361CNi();
        c2229361CNi.LIZLLL = this.conversation_short_id;
        c2229361CNi.LJ = this.reset_unread_count;
        c2229361CNi.addUnknownFields(unknownFields());
        return c2229361CNi;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.conversation_short_id != null) {
            sb.append(", conversation_short_id=");
            sb.append(this.conversation_short_id);
        }
        if (this.reset_unread_count != null) {
            sb.append(", reset_unread_count=");
            sb.append(this.reset_unread_count);
        }
        sb.replace(0, 2, "GetStrangerMessagesRequestBody{");
        sb.append('}');
        return sb.toString();
    }

    public GetStrangerMessagesRequestBody(Long l, Boolean bool) {
        this(l, bool, ByteString.EMPTY);
    }

    public GetStrangerMessagesRequestBody(Long l, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_short_id = l;
        this.reset_unread_count = bool;
    }
}
