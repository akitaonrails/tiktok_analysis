package com.bytedance.im.core.proto;

import X.C09CT;
import X.C0YJU;
import X.C1516540pZE;
import com.bytedance.im.core.proto.ConversationParticipantReadIndex;
import com.bytedance.im.core.proto.ParticipantReadIndex;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public final class ConversationParticipantReadIndex extends Message<ConversationParticipantReadIndex, C0YJU> {
    public static final ProtoAdapter<ConversationParticipantReadIndex> ADAPTER = new ProtoAdapter<ConversationParticipantReadIndex>() { // from class: X.0YJT
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final ConversationParticipantReadIndex decode(ProtoReader protoReader) {
            C0YJU c0yju = new C0YJU();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c0yju.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                c0yju.LJFF.add(ParticipantReadIndex.ADAPTER.decode(protoReader));
                            }
                        } else {
                            c0yju.LJ = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c0yju.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c0yju.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(ConversationParticipantReadIndex conversationParticipantReadIndex) {
            ConversationParticipantReadIndex conversationParticipantReadIndex2 = conversationParticipantReadIndex;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, conversationParticipantReadIndex2.conversation_id) + ProtoAdapter.INT64.encodedSizeWithTag(2, conversationParticipantReadIndex2.conversation_short_id) + ParticipantReadIndex.ADAPTER.asRepeated().encodedSizeWithTag(3, conversationParticipantReadIndex2.participantReadIndex) + conversationParticipantReadIndex2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, ConversationParticipantReadIndex conversationParticipantReadIndex) {
            ConversationParticipantReadIndex conversationParticipantReadIndex2 = conversationParticipantReadIndex;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, conversationParticipantReadIndex2.conversation_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, conversationParticipantReadIndex2.conversation_short_id);
            ParticipantReadIndex.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, conversationParticipantReadIndex2.participantReadIndex);
            protoWriter.writeBytes(conversationParticipantReadIndex2.unknownFields());
        }
    };
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final long serialVersionUID = 0;

    @C09CT("conversation_id")
    public final String conversation_id;

    @C09CT("conversation_short_id")
    public final Long conversation_short_id;

    @C09CT("participantReadIndex")
    public final List<ParticipantReadIndex> participantReadIndex;

    @Override // com.squareup.wire.Message
    public C0YJU newBuilder() {
        C0YJU c0yju = new C0YJU();
        c0yju.LIZLLL = this.conversation_id;
        c0yju.LJ = this.conversation_short_id;
        c0yju.LJFF = C1516540pZE.LIZJ("participantReadIndex", this.participantReadIndex);
        c0yju.addUnknownFields(unknownFields());
        return c0yju;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.conversation_id != null) {
            sb.append(", conversation_id=");
            sb.append(this.conversation_id);
        }
        if (this.conversation_short_id != null) {
            sb.append(", conversation_short_id=");
            sb.append(this.conversation_short_id);
        }
        List<ParticipantReadIndex> list = this.participantReadIndex;
        if (list != null && !list.isEmpty()) {
            sb.append(", participantReadIndex=");
            sb.append(this.participantReadIndex);
        }
        sb.replace(0, 2, "ConversationParticipantReadIndex{");
        sb.append('}');
        return sb.toString();
    }

    public ConversationParticipantReadIndex(String str, Long l, List<ParticipantReadIndex> list) {
        this(str, l, list, ByteString.EMPTY);
    }

    public ConversationParticipantReadIndex(String str, Long l, List<ParticipantReadIndex> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_id = str;
        this.conversation_short_id = l;
        this.participantReadIndex = C1516540pZE.LJFF("participantReadIndex", list);
    }
}
