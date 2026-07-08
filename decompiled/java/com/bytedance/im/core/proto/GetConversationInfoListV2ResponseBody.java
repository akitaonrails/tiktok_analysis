package com.bytedance.im.core.proto;

import X.C09CT;
import X.C1516540pZE;
import X.C876240YZa;
import com.bytedance.im.core.proto.ConversationInfoV2;
import com.bytedance.im.core.proto.GetConversationInfoListV2ResponseBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public final class GetConversationInfoListV2ResponseBody extends Message<GetConversationInfoListV2ResponseBody, C876240YZa> {
    public static final ProtoAdapter<GetConversationInfoListV2ResponseBody> ADAPTER = new ProtoAdapter<GetConversationInfoListV2ResponseBody>() { // from class: X.0YZZ
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final GetConversationInfoListV2ResponseBody decode(ProtoReader protoReader) {
            C876240YZa c876240YZa = new C876240YZa();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c876240YZa.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c876240YZa.LIZLLL.add(ConversationInfoV2.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c876240YZa.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(GetConversationInfoListV2ResponseBody getConversationInfoListV2ResponseBody) {
            GetConversationInfoListV2ResponseBody getConversationInfoListV2ResponseBody2 = getConversationInfoListV2ResponseBody;
            return ConversationInfoV2.ADAPTER.asRepeated().encodedSizeWithTag(1, getConversationInfoListV2ResponseBody2.conversation_info_list) + getConversationInfoListV2ResponseBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, GetConversationInfoListV2ResponseBody getConversationInfoListV2ResponseBody) {
            GetConversationInfoListV2ResponseBody getConversationInfoListV2ResponseBody2 = getConversationInfoListV2ResponseBody;
            ConversationInfoV2.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getConversationInfoListV2ResponseBody2.conversation_info_list);
            protoWriter.writeBytes(getConversationInfoListV2ResponseBody2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @C09CT("conversation_info_list")
    public final List<ConversationInfoV2> conversation_info_list;

    @Override // com.squareup.wire.Message
    public C876240YZa newBuilder() {
        C876240YZa c876240YZa = new C876240YZa();
        c876240YZa.LIZLLL = C1516540pZE.LIZJ("conversation_info_list", this.conversation_info_list);
        c876240YZa.addUnknownFields(unknownFields());
        return c876240YZa;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<ConversationInfoV2> list = this.conversation_info_list;
        if (list != null && !list.isEmpty()) {
            sb.append(", conversation_info_list=");
            sb.append(this.conversation_info_list);
        }
        sb.replace(0, 2, "GetConversationInfoListV2ResponseBody{");
        sb.append('}');
        return sb.toString();
    }

    public GetConversationInfoListV2ResponseBody(List<ConversationInfoV2> list) {
        this(list, ByteString.EMPTY);
    }

    public GetConversationInfoListV2ResponseBody(List<ConversationInfoV2> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_info_list = C1516540pZE.LJFF("conversation_info_list", list);
    }
}
