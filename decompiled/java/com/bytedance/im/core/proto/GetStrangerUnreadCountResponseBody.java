package com.bytedance.im.core.proto;

import X.C09CT;
import X.C2226351CBt;
import com.bytedance.im.core.proto.GetStrangerUnreadCountResponseBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class GetStrangerUnreadCountResponseBody extends Message<GetStrangerUnreadCountResponseBody, C2226351CBt> {
    public static final ProtoAdapter<GetStrangerUnreadCountResponseBody> ADAPTER = new ProtoAdapter<GetStrangerUnreadCountResponseBody>() { // from class: X.1CBs
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final GetStrangerUnreadCountResponseBody decode(ProtoReader protoReader) {
            C2226351CBt c2226351CBt = new C2226351CBt();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c2226351CBt.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c2226351CBt.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2226351CBt.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(GetStrangerUnreadCountResponseBody getStrangerUnreadCountResponseBody) {
            GetStrangerUnreadCountResponseBody getStrangerUnreadCountResponseBody2 = getStrangerUnreadCountResponseBody;
            return ProtoAdapter.INT64.encodedSizeWithTag(1, getStrangerUnreadCountResponseBody2.user_unread_count) + getStrangerUnreadCountResponseBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, GetStrangerUnreadCountResponseBody getStrangerUnreadCountResponseBody) {
            GetStrangerUnreadCountResponseBody getStrangerUnreadCountResponseBody2 = getStrangerUnreadCountResponseBody;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, getStrangerUnreadCountResponseBody2.user_unread_count);
            protoWriter.writeBytes(getStrangerUnreadCountResponseBody2.unknownFields());
        }
    };
    public static final Long DEFAULT_USER_UNREAD_COUNT = 0L;
    public static final long serialVersionUID = 0;

    @C09CT("user_unread_count")
    public final Long user_unread_count;

    @Override // com.squareup.wire.Message
    public C2226351CBt newBuilder() {
        C2226351CBt c2226351CBt = new C2226351CBt();
        c2226351CBt.LIZLLL = this.user_unread_count;
        c2226351CBt.addUnknownFields(unknownFields());
        return c2226351CBt;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", user_unread_count=");
        sb.append(this.user_unread_count);
        sb.replace(0, 2, "GetStrangerUnreadCountResponseBody{");
        sb.append('}');
        return sb.toString();
    }

    public GetStrangerUnreadCountResponseBody(Long l) {
        this(l, ByteString.EMPTY);
    }

    public GetStrangerUnreadCountResponseBody(Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.user_unread_count = l;
    }
}
