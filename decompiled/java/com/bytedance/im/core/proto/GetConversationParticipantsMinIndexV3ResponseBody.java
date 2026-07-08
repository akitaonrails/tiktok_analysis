package com.bytedance.im.core.proto;

import X.C09CT;
import X.C1516540pZE;
import X.C2230581CSa;
import com.bytedance.im.core.proto.GetConversationParticipantsMinIndexV3ResponseBody;
import com.bytedance.im.core.proto.ParticipantMinIndex;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class GetConversationParticipantsMinIndexV3ResponseBody extends Message<GetConversationParticipantsMinIndexV3ResponseBody, C2230581CSa> {
    public static final ProtoAdapter<GetConversationParticipantsMinIndexV3ResponseBody> ADAPTER = new ProtoAdapter<GetConversationParticipantsMinIndexV3ResponseBody>() { // from class: X.1CSZ
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final GetConversationParticipantsMinIndexV3ResponseBody decode(ProtoReader protoReader) {
            C2230581CSa c2230581CSa = new C2230581CSa();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c2230581CSa.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c2230581CSa.LIZLLL.add(ParticipantMinIndex.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2230581CSa.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(GetConversationParticipantsMinIndexV3ResponseBody getConversationParticipantsMinIndexV3ResponseBody) {
            GetConversationParticipantsMinIndexV3ResponseBody getConversationParticipantsMinIndexV3ResponseBody2 = getConversationParticipantsMinIndexV3ResponseBody;
            return ParticipantMinIndex.ADAPTER.asRepeated().encodedSizeWithTag(1, getConversationParticipantsMinIndexV3ResponseBody2.indexes) + getConversationParticipantsMinIndexV3ResponseBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, GetConversationParticipantsMinIndexV3ResponseBody getConversationParticipantsMinIndexV3ResponseBody) {
            GetConversationParticipantsMinIndexV3ResponseBody getConversationParticipantsMinIndexV3ResponseBody2 = getConversationParticipantsMinIndexV3ResponseBody;
            ParticipantMinIndex.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getConversationParticipantsMinIndexV3ResponseBody2.indexes);
            protoWriter.writeBytes(getConversationParticipantsMinIndexV3ResponseBody2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @C09CT("indexes")
    public final List<ParticipantMinIndex> indexes;

    @Override // com.squareup.wire.Message
    public C2230581CSa newBuilder() {
        C2230581CSa c2230581CSa = new C2230581CSa();
        c2230581CSa.LIZLLL = C1516540pZE.LIZJ("indexes", this.indexes);
        c2230581CSa.addUnknownFields(unknownFields());
        return c2230581CSa;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<ParticipantMinIndex> list = this.indexes;
        if (list != null && !list.isEmpty()) {
            sb.append(", indexes=");
            sb.append(this.indexes);
        }
        sb.replace(0, 2, "GetConversationParticipantsMinIndexV3ResponseBody{");
        sb.append('}');
        return sb.toString();
    }

    public GetConversationParticipantsMinIndexV3ResponseBody(List<ParticipantMinIndex> list) {
        this(list, ByteString.EMPTY);
    }

    public GetConversationParticipantsMinIndexV3ResponseBody(List<ParticipantMinIndex> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.indexes = C1516540pZE.LJFF("indexes", list);
    }
}
