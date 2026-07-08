package com.bytedance.im.core.proto;

import X.C09CT;
import X.C1CMC;
import com.bytedance.im.core.proto.GetStrangerConversationListRequestBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class GetStrangerConversationListRequestBody extends Message<GetStrangerConversationListRequestBody, C1CMC> {
    public static final long serialVersionUID = 0;

    @C09CT("biz_info")
    public final String biz_info;

    @C09CT("count")
    public final Long count;

    @C09CT("cursor")
    public final Long cursor;

    @C09CT("show_total_unread")
    public final Boolean show_total_unread;
    public static final ProtoAdapter<GetStrangerConversationListRequestBody> ADAPTER = new ProtoAdapter<GetStrangerConversationListRequestBody>() { // from class: X.1CMB
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final GetStrangerConversationListRequestBody decode(ProtoReader protoReader) {
            C1CMC c1cmc = new C1CMC();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                    c1cmc.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                } else {
                                    c1cmc.LJI = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c1cmc.LJFF = ProtoAdapter.BOOL.decode(protoReader);
                            }
                        } else {
                            c1cmc.LJ = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c1cmc.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1cmc.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(GetStrangerConversationListRequestBody getStrangerConversationListRequestBody) {
            GetStrangerConversationListRequestBody getStrangerConversationListRequestBody2 = getStrangerConversationListRequestBody;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            return protoAdapter.encodedSizeWithTag(1, getStrangerConversationListRequestBody2.cursor) + protoAdapter.encodedSizeWithTag(2, getStrangerConversationListRequestBody2.count) + ProtoAdapter.BOOL.encodedSizeWithTag(3, getStrangerConversationListRequestBody2.show_total_unread) + ProtoAdapter.STRING.encodedSizeWithTag(4, getStrangerConversationListRequestBody2.biz_info) + getStrangerConversationListRequestBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, GetStrangerConversationListRequestBody getStrangerConversationListRequestBody) {
            GetStrangerConversationListRequestBody getStrangerConversationListRequestBody2 = getStrangerConversationListRequestBody;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 1, getStrangerConversationListRequestBody2.cursor);
            protoAdapter.encodeWithTag(protoWriter, 2, getStrangerConversationListRequestBody2.count);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, getStrangerConversationListRequestBody2.show_total_unread);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, getStrangerConversationListRequestBody2.biz_info);
            protoWriter.writeBytes(getStrangerConversationListRequestBody2.unknownFields());
        }
    };
    public static final Long DEFAULT_CURSOR = 0L;
    public static final Long DEFAULT_COUNT = 50L;
    public static final Boolean DEFAULT_SHOW_TOTAL_UNREAD = Boolean.FALSE;

    @Override // com.squareup.wire.Message
    public C1CMC newBuilder() {
        C1CMC c1cmc = new C1CMC();
        c1cmc.LIZLLL = this.cursor;
        c1cmc.LJ = this.count;
        c1cmc.LJFF = this.show_total_unread;
        c1cmc.LJI = this.biz_info;
        c1cmc.addUnknownFields(unknownFields());
        return c1cmc;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.cursor != null) {
            sb.append(", cursor=");
            sb.append(this.cursor);
        }
        if (this.count != null) {
            sb.append(", count=");
            sb.append(this.count);
        }
        if (this.show_total_unread != null) {
            sb.append(", show_total_unread=");
            sb.append(this.show_total_unread);
        }
        if (this.biz_info != null) {
            sb.append(", biz_info=");
            sb.append(this.biz_info);
        }
        sb.replace(0, 2, "GetStrangerConversationListRequestBody{");
        sb.append('}');
        return sb.toString();
    }

    public GetStrangerConversationListRequestBody(Long l, Long l2, Boolean bool, String str) {
        this(l, l2, bool, str, ByteString.EMPTY);
    }

    public GetStrangerConversationListRequestBody(Long l, Long l2, Boolean bool, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.cursor = l;
        this.count = l2;
        this.show_total_unread = bool;
        this.biz_info = str;
    }
}
