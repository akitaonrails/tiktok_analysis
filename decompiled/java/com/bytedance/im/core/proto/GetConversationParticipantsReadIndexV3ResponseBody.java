package com.bytedance.im.core.proto;

import X.C09CT;
import X.C0YV0;
import X.C1516540pZE;
import com.bytedance.im.core.proto.GetConversationParticipantsReadIndexV3ResponseBody;
import com.bytedance.im.core.proto.ParticipantReadIndex;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public final class GetConversationParticipantsReadIndexV3ResponseBody extends Message<GetConversationParticipantsReadIndexV3ResponseBody, C0YV0> {
    public static final ProtoAdapter<GetConversationParticipantsReadIndexV3ResponseBody> ADAPTER = new ProtoAdapter<GetConversationParticipantsReadIndexV3ResponseBody>() { // from class: X.0YUz
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final GetConversationParticipantsReadIndexV3ResponseBody decode(ProtoReader protoReader) {
            C0YV0 c0yv0 = new C0YV0();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c0yv0.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c0yv0.LIZLLL.add(ParticipantReadIndex.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c0yv0.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(GetConversationParticipantsReadIndexV3ResponseBody getConversationParticipantsReadIndexV3ResponseBody) {
            GetConversationParticipantsReadIndexV3ResponseBody getConversationParticipantsReadIndexV3ResponseBody2 = getConversationParticipantsReadIndexV3ResponseBody;
            return ParticipantReadIndex.ADAPTER.asRepeated().encodedSizeWithTag(1, getConversationParticipantsReadIndexV3ResponseBody2.indexes) + getConversationParticipantsReadIndexV3ResponseBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, GetConversationParticipantsReadIndexV3ResponseBody getConversationParticipantsReadIndexV3ResponseBody) {
            GetConversationParticipantsReadIndexV3ResponseBody getConversationParticipantsReadIndexV3ResponseBody2 = getConversationParticipantsReadIndexV3ResponseBody;
            ParticipantReadIndex.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getConversationParticipantsReadIndexV3ResponseBody2.indexes);
            protoWriter.writeBytes(getConversationParticipantsReadIndexV3ResponseBody2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @C09CT("indexes")
    public final List<ParticipantReadIndex> indexes;

    @Override // com.squareup.wire.Message
    public C0YV0 newBuilder() {
        C0YV0 c0yv0 = new C0YV0();
        c0yv0.LIZLLL = C1516540pZE.LIZJ("indexes", this.indexes);
        c0yv0.addUnknownFields(unknownFields());
        return c0yv0;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<ParticipantReadIndex> list = this.indexes;
        if (list != null && !list.isEmpty()) {
            sb.append(", indexes=");
            sb.append(this.indexes);
        }
        sb.replace(0, 2, "GetConversationParticipantsReadIndexV3ResponseBody{");
        sb.append('}');
        return sb.toString();
    }

    public GetConversationParticipantsReadIndexV3ResponseBody(List<ParticipantReadIndex> list) {
        this(list, ByteString.EMPTY);
    }

    public GetConversationParticipantsReadIndexV3ResponseBody(List<ParticipantReadIndex> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.indexes = C1516540pZE.LJFF("indexes", list);
    }
}
