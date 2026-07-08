package com.bytedance.im.core.proto;

import X.C09CT;
import X.C1516540pZE;
import X.C867740Y2i;
import com.bytedance.im.core.proto.GetConversationInfoListV2RequestBody;
import com.bytedance.im.core.proto.GetConversationInfoV2RequestBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public final class GetConversationInfoListV2RequestBody extends Message<GetConversationInfoListV2RequestBody, C867740Y2i> {
    public static final ProtoAdapter<GetConversationInfoListV2RequestBody> ADAPTER = new ProtoAdapter<GetConversationInfoListV2RequestBody>() { // from class: X.0Y2j
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final GetConversationInfoListV2RequestBody decode(ProtoReader protoReader) {
            C867740Y2i c867740Y2i = new C867740Y2i();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c867740Y2i.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c867740Y2i.LIZLLL.add(GetConversationInfoV2RequestBody.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c867740Y2i.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(GetConversationInfoListV2RequestBody getConversationInfoListV2RequestBody) {
            GetConversationInfoListV2RequestBody getConversationInfoListV2RequestBody2 = getConversationInfoListV2RequestBody;
            return GetConversationInfoV2RequestBody.ADAPTER.asRepeated().encodedSizeWithTag(1, getConversationInfoListV2RequestBody2.conversation_info_list) + getConversationInfoListV2RequestBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, GetConversationInfoListV2RequestBody getConversationInfoListV2RequestBody) {
            GetConversationInfoListV2RequestBody getConversationInfoListV2RequestBody2 = getConversationInfoListV2RequestBody;
            GetConversationInfoV2RequestBody.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getConversationInfoListV2RequestBody2.conversation_info_list);
            protoWriter.writeBytes(getConversationInfoListV2RequestBody2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @C09CT("conversation_info_list")
    public final List<GetConversationInfoV2RequestBody> conversation_info_list;

    @Override // com.squareup.wire.Message
    public C867740Y2i newBuilder() {
        C867740Y2i c867740Y2i = new C867740Y2i();
        c867740Y2i.LIZLLL = C1516540pZE.LIZJ("conversation_info_list", this.conversation_info_list);
        c867740Y2i.addUnknownFields(unknownFields());
        return c867740Y2i;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<GetConversationInfoV2RequestBody> list = this.conversation_info_list;
        if (list != null && !list.isEmpty()) {
            sb.append(", conversation_info_list=");
            sb.append(this.conversation_info_list);
        }
        sb.replace(0, 2, "GetConversationInfoListV2RequestBody{");
        sb.append('}');
        return sb.toString();
    }

    public GetConversationInfoListV2RequestBody(List<GetConversationInfoV2RequestBody> list) {
        this(list, ByteString.EMPTY);
    }

    public GetConversationInfoListV2RequestBody(List<GetConversationInfoV2RequestBody> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_info_list = C1516540pZE.LJFF("conversation_info_list", list);
    }
}
