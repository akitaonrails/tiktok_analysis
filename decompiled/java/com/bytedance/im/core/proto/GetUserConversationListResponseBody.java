package com.bytedance.im.core.proto;

import X.C09CT;
import X.C1516540pZE;
import X.C875400YVu;
import com.bytedance.im.core.proto.ConversationInfoV2;
import com.bytedance.im.core.proto.GetUserConversationListResponseBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public final class GetUserConversationListResponseBody extends Message<GetUserConversationListResponseBody, C875400YVu> {
    public static final ProtoAdapter<GetUserConversationListResponseBody> ADAPTER = new ProtoAdapter<GetUserConversationListResponseBody>() { // from class: X.0YVt
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final GetUserConversationListResponseBody decode(ProtoReader protoReader) {
            C875400YVu c875400YVu = new C875400YVu();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c875400YVu.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                c875400YVu.LJFF = ProtoAdapter.INT64.decode(protoReader);
                            }
                        } else {
                            c875400YVu.LJ = ProtoAdapter.BOOL.decode(protoReader);
                        }
                    } else {
                        c875400YVu.LIZLLL.add(ConversationInfoV2.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c875400YVu.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(GetUserConversationListResponseBody getUserConversationListResponseBody) {
            GetUserConversationListResponseBody getUserConversationListResponseBody2 = getUserConversationListResponseBody;
            return ConversationInfoV2.ADAPTER.asRepeated().encodedSizeWithTag(1, getUserConversationListResponseBody2.list) + ProtoAdapter.BOOL.encodedSizeWithTag(2, getUserConversationListResponseBody2.has_more) + ProtoAdapter.INT64.encodedSizeWithTag(3, getUserConversationListResponseBody2.next_cursor) + getUserConversationListResponseBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, GetUserConversationListResponseBody getUserConversationListResponseBody) {
            GetUserConversationListResponseBody getUserConversationListResponseBody2 = getUserConversationListResponseBody;
            ConversationInfoV2.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getUserConversationListResponseBody2.list);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, getUserConversationListResponseBody2.has_more);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, getUserConversationListResponseBody2.next_cursor);
            protoWriter.writeBytes(getUserConversationListResponseBody2.unknownFields());
        }
    };
    public static final Boolean DEFAULT_HAS_MORE = Boolean.FALSE;
    public static final Long DEFAULT_NEXT_CURSOR = 0L;
    public static final long serialVersionUID = 0;

    @C09CT("has_more")
    public final Boolean has_more;

    @C09CT("list")
    public final List<ConversationInfoV2> list;

    @C09CT("next_cursor")
    public final Long next_cursor;

    @Override // com.squareup.wire.Message
    public C875400YVu newBuilder() {
        C875400YVu c875400YVu = new C875400YVu();
        c875400YVu.LIZLLL = C1516540pZE.LIZJ("list", this.list);
        c875400YVu.LJ = this.has_more;
        c875400YVu.LJFF = this.next_cursor;
        c875400YVu.addUnknownFields(unknownFields());
        return c875400YVu;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<ConversationInfoV2> list = this.list;
        if (list != null && !list.isEmpty()) {
            sb.append(", list=");
            sb.append(this.list);
        }
        if (this.has_more != null) {
            sb.append(", has_more=");
            sb.append(this.has_more);
        }
        if (this.next_cursor != null) {
            sb.append(", next_cursor=");
            sb.append(this.next_cursor);
        }
        sb.replace(0, 2, "GetUserConversationListResponseBody{");
        sb.append('}');
        return sb.toString();
    }

    public GetUserConversationListResponseBody(List<ConversationInfoV2> list, Boolean bool, Long l) {
        this(list, bool, l, ByteString.EMPTY);
    }

    public GetUserConversationListResponseBody(List<ConversationInfoV2> list, Boolean bool, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.list = C1516540pZE.LJFF("list", list);
        this.has_more = bool;
        this.next_cursor = l;
    }
}
