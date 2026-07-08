package com.bytedance.im.core.proto;

import X.C09CT;
import X.C1516540pZE;
import X.C2238621Cjc;
import com.bytedance.im.core.proto.GetConversationInfoV2RequestBody;
import com.bytedance.im.core.proto.PreviewerGetConversationInfoListRequestBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class PreviewerGetConversationInfoListRequestBody extends Message<PreviewerGetConversationInfoListRequestBody, C2238621Cjc> {
    public static final ProtoAdapter<PreviewerGetConversationInfoListRequestBody> ADAPTER = new ProtoAdapter<PreviewerGetConversationInfoListRequestBody>() { // from class: X.1Cjb
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final PreviewerGetConversationInfoListRequestBody decode(ProtoReader protoReader) {
            C2238621Cjc c2238621Cjc = new C2238621Cjc();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c2238621Cjc.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c2238621Cjc.LIZLLL.add(GetConversationInfoV2RequestBody.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2238621Cjc.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(PreviewerGetConversationInfoListRequestBody previewerGetConversationInfoListRequestBody) {
            PreviewerGetConversationInfoListRequestBody previewerGetConversationInfoListRequestBody2 = previewerGetConversationInfoListRequestBody;
            return GetConversationInfoV2RequestBody.ADAPTER.asRepeated().encodedSizeWithTag(1, previewerGetConversationInfoListRequestBody2.conversation_info_list) + previewerGetConversationInfoListRequestBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, PreviewerGetConversationInfoListRequestBody previewerGetConversationInfoListRequestBody) {
            PreviewerGetConversationInfoListRequestBody previewerGetConversationInfoListRequestBody2 = previewerGetConversationInfoListRequestBody;
            GetConversationInfoV2RequestBody.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, previewerGetConversationInfoListRequestBody2.conversation_info_list);
            protoWriter.writeBytes(previewerGetConversationInfoListRequestBody2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @C09CT("conversation_info_list")
    public final List<GetConversationInfoV2RequestBody> conversation_info_list;

    @Override // com.squareup.wire.Message
    public C2238621Cjc newBuilder() {
        C2238621Cjc c2238621Cjc = new C2238621Cjc();
        c2238621Cjc.LIZLLL = C1516540pZE.LIZJ("conversation_info_list", this.conversation_info_list);
        c2238621Cjc.addUnknownFields(unknownFields());
        return c2238621Cjc;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<GetConversationInfoV2RequestBody> list = this.conversation_info_list;
        if (list != null && !list.isEmpty()) {
            sb.append(", conversation_info_list=");
            sb.append(this.conversation_info_list);
        }
        sb.replace(0, 2, "PreviewerGetConversationInfoListRequestBody{");
        sb.append('}');
        return sb.toString();
    }

    public PreviewerGetConversationInfoListRequestBody(List<GetConversationInfoV2RequestBody> list) {
        this(list, ByteString.EMPTY);
    }

    public PreviewerGetConversationInfoListRequestBody(List<GetConversationInfoV2RequestBody> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_info_list = C1516540pZE.LJFF("conversation_info_list", list);
    }
}
