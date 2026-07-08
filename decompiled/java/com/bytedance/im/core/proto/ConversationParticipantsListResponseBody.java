package com.bytedance.im.core.proto;

import X.C09CT;
import X.C868190Y4b;
import com.bytedance.im.core.proto.ConversationParticipantsListResponseBody;
import com.bytedance.im.core.proto.ParticipantsPage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public final class ConversationParticipantsListResponseBody extends Message<ConversationParticipantsListResponseBody, C868190Y4b> {
    public static final ProtoAdapter<ConversationParticipantsListResponseBody> ADAPTER = new ProtoAdapter<ConversationParticipantsListResponseBody>() { // from class: X.0Y4a
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final ConversationParticipantsListResponseBody decode(ProtoReader protoReader) {
            C868190Y4b c868190Y4b = new C868190Y4b();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c868190Y4b.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c868190Y4b.LIZLLL = ParticipantsPage.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c868190Y4b.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(ConversationParticipantsListResponseBody conversationParticipantsListResponseBody) {
            ConversationParticipantsListResponseBody conversationParticipantsListResponseBody2 = conversationParticipantsListResponseBody;
            return ParticipantsPage.ADAPTER.encodedSizeWithTag(1, conversationParticipantsListResponseBody2.participants_page) + conversationParticipantsListResponseBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, ConversationParticipantsListResponseBody conversationParticipantsListResponseBody) {
            ConversationParticipantsListResponseBody conversationParticipantsListResponseBody2 = conversationParticipantsListResponseBody;
            ParticipantsPage.ADAPTER.encodeWithTag(protoWriter, 1, conversationParticipantsListResponseBody2.participants_page);
            protoWriter.writeBytes(conversationParticipantsListResponseBody2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @C09CT("participants_page")
    public final ParticipantsPage participants_page;

    @Override // com.squareup.wire.Message
    public C868190Y4b newBuilder() {
        C868190Y4b c868190Y4b = new C868190Y4b();
        c868190Y4b.LIZLLL = this.participants_page;
        c868190Y4b.addUnknownFields(unknownFields());
        return c868190Y4b;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.participants_page != null) {
            sb.append(", participants_page=");
            sb.append(this.participants_page);
        }
        sb.replace(0, 2, "ConversationParticipantsListResponseBody{");
        sb.append('}');
        return sb.toString();
    }

    public ConversationParticipantsListResponseBody(ParticipantsPage participantsPage) {
        this(participantsPage, ByteString.EMPTY);
    }

    public ConversationParticipantsListResponseBody(ParticipantsPage participantsPage, ByteString byteString) {
        super(ADAPTER, byteString);
        this.participants_page = participantsPage;
    }
}
