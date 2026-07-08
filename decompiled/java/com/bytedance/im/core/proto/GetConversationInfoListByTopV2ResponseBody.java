package com.bytedance.im.core.proto;

import X.C09CT;
import X.C1516540pZE;
import X.C2238601Cja;
import com.bytedance.im.core.proto.ConversationInfoV2;
import com.bytedance.im.core.proto.GetConversationInfoListByTopV2ResponseBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class GetConversationInfoListByTopV2ResponseBody extends Message<GetConversationInfoListByTopV2ResponseBody, C2238601Cja> {
    public static final ProtoAdapter<GetConversationInfoListByTopV2ResponseBody> ADAPTER = new ProtoAdapter<GetConversationInfoListByTopV2ResponseBody>() { // from class: X.1CjZ
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final GetConversationInfoListByTopV2ResponseBody decode(ProtoReader protoReader) {
            C2238601Cja c2238601Cja = new C2238601Cja();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c2238601Cja.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                c2238601Cja.LJFF = ProtoAdapter.INT64.decode(protoReader);
                            }
                        } else {
                            c2238601Cja.LJ = ProtoAdapter.BOOL.decode(protoReader);
                        }
                    } else {
                        c2238601Cja.LIZLLL.add(ConversationInfoV2.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2238601Cja.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(GetConversationInfoListByTopV2ResponseBody getConversationInfoListByTopV2ResponseBody) {
            GetConversationInfoListByTopV2ResponseBody getConversationInfoListByTopV2ResponseBody2 = getConversationInfoListByTopV2ResponseBody;
            return ConversationInfoV2.ADAPTER.asRepeated().encodedSizeWithTag(1, getConversationInfoListByTopV2ResponseBody2.conversation_info_list) + ProtoAdapter.BOOL.encodedSizeWithTag(2, getConversationInfoListByTopV2ResponseBody2.has_more) + ProtoAdapter.INT64.encodedSizeWithTag(3, getConversationInfoListByTopV2ResponseBody2.next_cursor) + getConversationInfoListByTopV2ResponseBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, GetConversationInfoListByTopV2ResponseBody getConversationInfoListByTopV2ResponseBody) {
            GetConversationInfoListByTopV2ResponseBody getConversationInfoListByTopV2ResponseBody2 = getConversationInfoListByTopV2ResponseBody;
            ConversationInfoV2.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getConversationInfoListByTopV2ResponseBody2.conversation_info_list);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, getConversationInfoListByTopV2ResponseBody2.has_more);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, getConversationInfoListByTopV2ResponseBody2.next_cursor);
            protoWriter.writeBytes(getConversationInfoListByTopV2ResponseBody2.unknownFields());
        }
    };
    public static final Boolean DEFAULT_HAS_MORE = Boolean.FALSE;
    public static final Long DEFAULT_NEXT_CURSOR = 0L;
    public static final long serialVersionUID = 0;

    @C09CT("conversation_info_list")
    public final List<ConversationInfoV2> conversation_info_list;

    @C09CT("has_more")
    public final Boolean has_more;

    @C09CT("next_cursor")
    public final Long next_cursor;

    @Override // com.squareup.wire.Message
    public C2238601Cja newBuilder() {
        C2238601Cja c2238601Cja = new C2238601Cja();
        c2238601Cja.LIZLLL = C1516540pZE.LIZJ("conversation_info_list", this.conversation_info_list);
        c2238601Cja.LJ = this.has_more;
        c2238601Cja.LJFF = this.next_cursor;
        c2238601Cja.addUnknownFields(unknownFields());
        return c2238601Cja;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<ConversationInfoV2> list = this.conversation_info_list;
        if (list != null && !list.isEmpty()) {
            sb.append(", conversation_info_list=");
            sb.append(this.conversation_info_list);
        }
        if (this.has_more != null) {
            sb.append(", has_more=");
            sb.append(this.has_more);
        }
        if (this.next_cursor != null) {
            sb.append(", next_cursor=");
            sb.append(this.next_cursor);
        }
        sb.replace(0, 2, "GetConversationInfoListByTopV2ResponseBody{");
        sb.append('}');
        return sb.toString();
    }

    public GetConversationInfoListByTopV2ResponseBody(List<ConversationInfoV2> list, Boolean bool, Long l) {
        this(list, bool, l, ByteString.EMPTY);
    }

    public GetConversationInfoListByTopV2ResponseBody(List<ConversationInfoV2> list, Boolean bool, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_info_list = C1516540pZE.LJFF("conversation_info_list", list);
        this.has_more = bool;
        this.next_cursor = l;
    }
}
