package com.bytedance.im.core.proto;

import X.C09CT;
import X.C877140Yb2;
import com.bytedance.im.core.proto.ConversationInfoV2;
import com.bytedance.im.core.proto.GetConversationInfoV2ResponseBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public final class GetConversationInfoV2ResponseBody extends Message<GetConversationInfoV2ResponseBody, C877140Yb2> {
    public static final ProtoAdapter<GetConversationInfoV2ResponseBody> ADAPTER = new ProtoAdapter<GetConversationInfoV2ResponseBody>() { // from class: X.0Yb1
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final GetConversationInfoV2ResponseBody decode(ProtoReader protoReader) {
            C877140Yb2 c877140Yb2 = new C877140Yb2();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c877140Yb2.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c877140Yb2.LIZLLL = ConversationInfoV2.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c877140Yb2.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(GetConversationInfoV2ResponseBody getConversationInfoV2ResponseBody) {
            GetConversationInfoV2ResponseBody getConversationInfoV2ResponseBody2 = getConversationInfoV2ResponseBody;
            return ConversationInfoV2.ADAPTER.encodedSizeWithTag(1, getConversationInfoV2ResponseBody2.conversation_info) + getConversationInfoV2ResponseBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, GetConversationInfoV2ResponseBody getConversationInfoV2ResponseBody) {
            GetConversationInfoV2ResponseBody getConversationInfoV2ResponseBody2 = getConversationInfoV2ResponseBody;
            ConversationInfoV2.ADAPTER.encodeWithTag(protoWriter, 1, getConversationInfoV2ResponseBody2.conversation_info);
            protoWriter.writeBytes(getConversationInfoV2ResponseBody2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @C09CT("conversation_info")
    public final ConversationInfoV2 conversation_info;

    @Override // com.squareup.wire.Message
    public C877140Yb2 newBuilder() {
        C877140Yb2 c877140Yb2 = new C877140Yb2();
        c877140Yb2.LIZLLL = this.conversation_info;
        c877140Yb2.addUnknownFields(unknownFields());
        return c877140Yb2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.conversation_info != null) {
            sb.append(", conversation_info=");
            sb.append(this.conversation_info);
        }
        sb.replace(0, 2, "GetConversationInfoV2ResponseBody{");
        sb.append('}');
        return sb.toString();
    }

    public GetConversationInfoV2ResponseBody(ConversationInfoV2 conversationInfoV2) {
        this(conversationInfoV2, ByteString.EMPTY);
    }

    public GetConversationInfoV2ResponseBody(ConversationInfoV2 conversationInfoV2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_info = conversationInfoV2;
    }
}
