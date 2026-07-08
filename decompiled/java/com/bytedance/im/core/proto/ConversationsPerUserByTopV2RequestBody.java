package com.bytedance.im.core.proto;

import X.C09CT;
import X.C2229341CNg;
import com.bytedance.im.core.proto.ConversationsPerUserByTopV2RequestBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class ConversationsPerUserByTopV2RequestBody extends Message<ConversationsPerUserByTopV2RequestBody, C2229341CNg> {
    public static final ProtoAdapter<ConversationsPerUserByTopV2RequestBody> ADAPTER = new ProtoAdapter<ConversationsPerUserByTopV2RequestBody>() { // from class: X.1CNf
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final ConversationsPerUserByTopV2RequestBody decode(ProtoReader protoReader) {
            C2229341CNg c2229341CNg = new C2229341CNg();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2229341CNg.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c2229341CNg.LJ = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c2229341CNg.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2229341CNg.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(ConversationsPerUserByTopV2RequestBody conversationsPerUserByTopV2RequestBody) {
            ConversationsPerUserByTopV2RequestBody conversationsPerUserByTopV2RequestBody2 = conversationsPerUserByTopV2RequestBody;
            return ProtoAdapter.INT64.encodedSizeWithTag(1, conversationsPerUserByTopV2RequestBody2.cursor) + ProtoAdapter.INT32.encodedSizeWithTag(2, conversationsPerUserByTopV2RequestBody2.limit) + conversationsPerUserByTopV2RequestBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, ConversationsPerUserByTopV2RequestBody conversationsPerUserByTopV2RequestBody) {
            ConversationsPerUserByTopV2RequestBody conversationsPerUserByTopV2RequestBody2 = conversationsPerUserByTopV2RequestBody;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, conversationsPerUserByTopV2RequestBody2.cursor);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, conversationsPerUserByTopV2RequestBody2.limit);
            protoWriter.writeBytes(conversationsPerUserByTopV2RequestBody2.unknownFields());
        }
    };
    public static final Long DEFAULT_CURSOR = 0L;
    public static final Integer DEFAULT_LIMIT = 500;
    public static final long serialVersionUID = 0;

    @C09CT("cursor")
    public final Long cursor;

    @C09CT("limit")
    public final Integer limit;

    @Override // com.squareup.wire.Message
    public C2229341CNg newBuilder() {
        C2229341CNg c2229341CNg = new C2229341CNg();
        c2229341CNg.LIZLLL = this.cursor;
        c2229341CNg.LJ = this.limit;
        c2229341CNg.addUnknownFields(unknownFields());
        return c2229341CNg;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.cursor != null) {
            sb.append(", cursor=");
            sb.append(this.cursor);
        }
        if (this.limit != null) {
            sb.append(", limit=");
            sb.append(this.limit);
        }
        sb.replace(0, 2, "ConversationsPerUserByTopV2RequestBody{");
        sb.append('}');
        return sb.toString();
    }

    public ConversationsPerUserByTopV2RequestBody(Long l, Integer num) {
        this(l, num, ByteString.EMPTY);
    }

    public ConversationsPerUserByTopV2RequestBody(Long l, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.cursor = l;
        this.limit = num;
    }
}
