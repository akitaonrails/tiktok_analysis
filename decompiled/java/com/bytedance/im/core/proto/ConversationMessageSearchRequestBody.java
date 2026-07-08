package com.bytedance.im.core.proto;

import X.C09CT;
import X.C2251891DBz;
import com.bytedance.im.core.proto.ConversationMessageSearchRequestBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: loaded from: classes36.dex */
public final class ConversationMessageSearchRequestBody extends Message<ConversationMessageSearchRequestBody, C2251891DBz> {
    public static final long serialVersionUID = 0;

    @C09CT("conv_short_id")
    public final Long conv_short_id;

    @C09CT("end_time")
    public final Long end_time;

    @C09CT("frag_size")
    public final Integer frag_size;

    @C09CT("scroll_id")
    public final String scroll_id;

    @C09CT("search_query")
    public final String search_query;

    @C09CT("start_time")
    public final Long start_time;
    public static final ProtoAdapter<ConversationMessageSearchRequestBody> ADAPTER = new ProtoAdapter<ConversationMessageSearchRequestBody>() { // from class: X.1DBy
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final ConversationMessageSearchRequestBody decode(ProtoReader protoReader) {
            C2251891DBz c2251891DBz = new C2251891DBz();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c2251891DBz.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c2251891DBz.LJ = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 3:
                            c2251891DBz.LJFF = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 4:
                            c2251891DBz.LJI = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 5:
                            c2251891DBz.LJII = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 6:
                            c2251891DBz.LJIIIIZZ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2251891DBz.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2251891DBz.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(ConversationMessageSearchRequestBody conversationMessageSearchRequestBody) {
            ConversationMessageSearchRequestBody conversationMessageSearchRequestBody2 = conversationMessageSearchRequestBody;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, conversationMessageSearchRequestBody2.search_query);
            ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(2, conversationMessageSearchRequestBody2.conv_short_id) + protoAdapter2.encodedSizeWithTag(3, conversationMessageSearchRequestBody2.start_time) + protoAdapter2.encodedSizeWithTag(4, conversationMessageSearchRequestBody2.end_time) + ProtoAdapter.INT32.encodedSizeWithTag(5, conversationMessageSearchRequestBody2.frag_size) + protoAdapter.encodedSizeWithTag(6, conversationMessageSearchRequestBody2.scroll_id) + conversationMessageSearchRequestBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, ConversationMessageSearchRequestBody conversationMessageSearchRequestBody) {
            ConversationMessageSearchRequestBody conversationMessageSearchRequestBody2 = conversationMessageSearchRequestBody;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, conversationMessageSearchRequestBody2.search_query);
            ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
            protoAdapter2.encodeWithTag(protoWriter, 2, conversationMessageSearchRequestBody2.conv_short_id);
            protoAdapter2.encodeWithTag(protoWriter, 3, conversationMessageSearchRequestBody2.start_time);
            protoAdapter2.encodeWithTag(protoWriter, 4, conversationMessageSearchRequestBody2.end_time);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 5, conversationMessageSearchRequestBody2.frag_size);
            protoAdapter.encodeWithTag(protoWriter, 6, conversationMessageSearchRequestBody2.scroll_id);
            protoWriter.writeBytes(conversationMessageSearchRequestBody2.unknownFields());
        }
    };
    public static final Long DEFAULT_CONV_SHORT_ID = 0L;
    public static final Long DEFAULT_START_TIME = 0L;
    public static final Long DEFAULT_END_TIME = 0L;
    public static final Integer DEFAULT_FRAG_SIZE = 0;

    @Override // com.squareup.wire.Message
    public C2251891DBz newBuilder() {
        C2251891DBz c2251891DBz = new C2251891DBz();
        c2251891DBz.LIZLLL = this.search_query;
        c2251891DBz.LJ = this.conv_short_id;
        c2251891DBz.LJFF = this.start_time;
        c2251891DBz.LJI = this.end_time;
        c2251891DBz.LJII = this.frag_size;
        c2251891DBz.LJIIIIZZ = this.scroll_id;
        c2251891DBz.addUnknownFields(unknownFields());
        return c2251891DBz;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", search_query=");
        sb.append(this.search_query);
        sb.append(", conv_short_id=");
        sb.append(this.conv_short_id);
        if (this.start_time != null) {
            sb.append(", start_time=");
            sb.append(this.start_time);
        }
        if (this.end_time != null) {
            sb.append(", end_time=");
            sb.append(this.end_time);
        }
        if (this.frag_size != null) {
            sb.append(", frag_size=");
            sb.append(this.frag_size);
        }
        if (this.scroll_id != null) {
            sb.append(", scroll_id=");
            sb.append(this.scroll_id);
        }
        sb.replace(0, 2, "ConversationMessageSearchRequestBody{");
        sb.append('}');
        return sb.toString();
    }

    public ConversationMessageSearchRequestBody(String str, Long l, Long l2, Long l3, Integer num, String str2) {
        this(str, l, l2, l3, num, str2, ByteString.EMPTY);
    }

    public ConversationMessageSearchRequestBody(String str, Long l, Long l2, Long l3, Integer num, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.search_query = str;
        this.conv_short_id = l;
        this.start_time = l2;
        this.end_time = l3;
        this.frag_size = num;
        this.scroll_id = str2;
    }
}
