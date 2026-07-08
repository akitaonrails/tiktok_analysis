package com.bytedance.im.core.proto;

import X.C09CT;
import X.C2229301CNc;
import com.bytedance.im.core.proto.ConversationsPerUserByFavoriteV2RequestBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class ConversationsPerUserByFavoriteV2RequestBody extends Message<ConversationsPerUserByFavoriteV2RequestBody, C2229301CNc> {
    public static final ProtoAdapter<ConversationsPerUserByFavoriteV2RequestBody> ADAPTER = new ProtoAdapter<ConversationsPerUserByFavoriteV2RequestBody>() { // from class: X.1CNb
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final ConversationsPerUserByFavoriteV2RequestBody decode(ProtoReader protoReader) {
            C2229301CNc c2229301CNc = new C2229301CNc();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2229301CNc.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c2229301CNc.LJ = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c2229301CNc.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2229301CNc.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(ConversationsPerUserByFavoriteV2RequestBody conversationsPerUserByFavoriteV2RequestBody) {
            ConversationsPerUserByFavoriteV2RequestBody conversationsPerUserByFavoriteV2RequestBody2 = conversationsPerUserByFavoriteV2RequestBody;
            return ProtoAdapter.INT64.encodedSizeWithTag(1, conversationsPerUserByFavoriteV2RequestBody2.cursor) + ProtoAdapter.INT32.encodedSizeWithTag(2, conversationsPerUserByFavoriteV2RequestBody2.limit) + conversationsPerUserByFavoriteV2RequestBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, ConversationsPerUserByFavoriteV2RequestBody conversationsPerUserByFavoriteV2RequestBody) {
            ConversationsPerUserByFavoriteV2RequestBody conversationsPerUserByFavoriteV2RequestBody2 = conversationsPerUserByFavoriteV2RequestBody;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, conversationsPerUserByFavoriteV2RequestBody2.cursor);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, conversationsPerUserByFavoriteV2RequestBody2.limit);
            protoWriter.writeBytes(conversationsPerUserByFavoriteV2RequestBody2.unknownFields());
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
    public C2229301CNc newBuilder() {
        C2229301CNc c2229301CNc = new C2229301CNc();
        c2229301CNc.LIZLLL = this.cursor;
        c2229301CNc.LJ = this.limit;
        c2229301CNc.addUnknownFields(unknownFields());
        return c2229301CNc;
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
        sb.replace(0, 2, "ConversationsPerUserByFavoriteV2RequestBody{");
        sb.append('}');
        return sb.toString();
    }

    public ConversationsPerUserByFavoriteV2RequestBody(Long l, Integer num) {
        this(l, num, ByteString.EMPTY);
    }

    public ConversationsPerUserByFavoriteV2RequestBody(Long l, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.cursor = l;
        this.limit = num;
    }
}
