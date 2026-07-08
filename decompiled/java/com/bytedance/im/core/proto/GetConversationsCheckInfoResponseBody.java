package com.bytedance.im.core.proto;

import X.C09CT;
import X.C1516540pZE;
import X.C2230641CSg;
import com.bytedance.im.core.proto.ConversationCheckInfo;
import com.bytedance.im.core.proto.GetConversationsCheckInfoResponseBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class GetConversationsCheckInfoResponseBody extends Message<GetConversationsCheckInfoResponseBody, C2230641CSg> {
    public static final ProtoAdapter<GetConversationsCheckInfoResponseBody> ADAPTER = new ProtoAdapter<GetConversationsCheckInfoResponseBody>() { // from class: X.1CSf
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final GetConversationsCheckInfoResponseBody decode(ProtoReader protoReader) {
            C2230641CSg c2230641CSg = new C2230641CSg();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c2230641CSg.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c2230641CSg.LIZLLL.add(ConversationCheckInfo.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2230641CSg.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(GetConversationsCheckInfoResponseBody getConversationsCheckInfoResponseBody) {
            GetConversationsCheckInfoResponseBody getConversationsCheckInfoResponseBody2 = getConversationsCheckInfoResponseBody;
            return ConversationCheckInfo.ADAPTER.asRepeated().encodedSizeWithTag(1, getConversationsCheckInfoResponseBody2.conversation_checkinfo_list) + getConversationsCheckInfoResponseBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, GetConversationsCheckInfoResponseBody getConversationsCheckInfoResponseBody) {
            GetConversationsCheckInfoResponseBody getConversationsCheckInfoResponseBody2 = getConversationsCheckInfoResponseBody;
            ConversationCheckInfo.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getConversationsCheckInfoResponseBody2.conversation_checkinfo_list);
            protoWriter.writeBytes(getConversationsCheckInfoResponseBody2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @C09CT("conversation_checkinfo_list")
    public final List<ConversationCheckInfo> conversation_checkinfo_list;

    @Override // com.squareup.wire.Message
    public C2230641CSg newBuilder() {
        C2230641CSg c2230641CSg = new C2230641CSg();
        c2230641CSg.LIZLLL = C1516540pZE.LIZJ("conversation_checkinfo_list", this.conversation_checkinfo_list);
        c2230641CSg.addUnknownFields(unknownFields());
        return c2230641CSg;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<ConversationCheckInfo> list = this.conversation_checkinfo_list;
        if (list != null && !list.isEmpty()) {
            sb.append(", conversation_checkinfo_list=");
            sb.append(this.conversation_checkinfo_list);
        }
        sb.replace(0, 2, "GetConversationsCheckInfoResponseBody{");
        sb.append('}');
        return sb.toString();
    }

    public GetConversationsCheckInfoResponseBody(List<ConversationCheckInfo> list) {
        this(list, ByteString.EMPTY);
    }

    public GetConversationsCheckInfoResponseBody(List<ConversationCheckInfo> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_checkinfo_list = C1516540pZE.LJFF("conversation_checkinfo_list", list);
    }
}
