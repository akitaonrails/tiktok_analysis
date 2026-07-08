package com.bytedance.im.core.proto;

import X.C09CT;
import X.C2230661CSi;
import com.bytedance.im.core.proto.ConversationCheckInfo;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class ConversationCheckInfo extends Message<ConversationCheckInfo, C2230661CSi> {
    public static final ProtoAdapter<ConversationCheckInfo> ADAPTER = new ProtoAdapter<ConversationCheckInfo>() { // from class: X.1CSh
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final ConversationCheckInfo decode(ProtoReader protoReader) {
            C2230661CSi c2230661CSi = new C2230661CSi();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c2230661CSi.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                c2230661CSi.LJFF = ProtoAdapter.INT32.decode(protoReader);
                            }
                        } else {
                            c2230661CSi.LJ = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c2230661CSi.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2230661CSi.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(ConversationCheckInfo conversationCheckInfo) {
            ConversationCheckInfo conversationCheckInfo2 = conversationCheckInfo;
            return ProtoAdapter.INT64.encodedSizeWithTag(1, conversationCheckInfo2.conversation_short_id) + ProtoAdapter.STRING.encodedSizeWithTag(2, conversationCheckInfo2.conversation_id) + ProtoAdapter.INT32.encodedSizeWithTag(3, conversationCheckInfo2.conversation_type) + conversationCheckInfo2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, ConversationCheckInfo conversationCheckInfo) {
            ConversationCheckInfo conversationCheckInfo2 = conversationCheckInfo;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, conversationCheckInfo2.conversation_short_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, conversationCheckInfo2.conversation_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, conversationCheckInfo2.conversation_type);
            protoWriter.writeBytes(conversationCheckInfo2.unknownFields());
        }
    };
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;
    public static final long serialVersionUID = 0;

    @C09CT("conversation_id")
    public final String conversation_id;

    @C09CT("conversation_short_id")
    public final Long conversation_short_id;

    @C09CT("conversation_type")
    public final Integer conversation_type;

    @Override // com.squareup.wire.Message
    public C2230661CSi newBuilder() {
        C2230661CSi c2230661CSi = new C2230661CSi();
        c2230661CSi.LIZLLL = this.conversation_short_id;
        c2230661CSi.LJ = this.conversation_id;
        c2230661CSi.LJFF = this.conversation_type;
        c2230661CSi.addUnknownFields(unknownFields());
        return c2230661CSi;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.conversation_short_id != null) {
            sb.append(", conversation_short_id=");
            sb.append(this.conversation_short_id);
        }
        if (this.conversation_id != null) {
            sb.append(", conversation_id=");
            sb.append(this.conversation_id);
        }
        if (this.conversation_type != null) {
            sb.append(", conversation_type=");
            sb.append(this.conversation_type);
        }
        sb.replace(0, 2, "ConversationCheckInfo{");
        sb.append('}');
        return sb.toString();
    }

    public ConversationCheckInfo(Long l, String str, Integer num) {
        this(l, str, num, ByteString.EMPTY);
    }

    public ConversationCheckInfo(Long l, String str, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_short_id = l;
        this.conversation_id = str;
        this.conversation_type = num;
    }
}
