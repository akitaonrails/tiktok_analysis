package com.bytedance.im.core.proto;

import X.C09CT;
import X.C871480YGs;
import com.bytedance.im.core.proto.DissolveConversationRequestBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public final class DissolveConversationRequestBody extends Message<DissolveConversationRequestBody, C871480YGs> {
    public static final ProtoAdapter<DissolveConversationRequestBody> ADAPTER = new ProtoAdapter<DissolveConversationRequestBody>() { // from class: X.0YGt
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final DissolveConversationRequestBody decode(ProtoReader protoReader) {
            C871480YGs c871480YGs = new C871480YGs();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c871480YGs.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                c871480YGs.LJFF = ProtoAdapter.INT32.decode(protoReader);
                            }
                        } else {
                            c871480YGs.LJ = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c871480YGs.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c871480YGs.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(DissolveConversationRequestBody dissolveConversationRequestBody) {
            DissolveConversationRequestBody dissolveConversationRequestBody2 = dissolveConversationRequestBody;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, dissolveConversationRequestBody2.conversation_id) + ProtoAdapter.INT64.encodedSizeWithTag(2, dissolveConversationRequestBody2.conversation_short_id) + ProtoAdapter.INT32.encodedSizeWithTag(3, dissolveConversationRequestBody2.conversation_type) + dissolveConversationRequestBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, DissolveConversationRequestBody dissolveConversationRequestBody) {
            DissolveConversationRequestBody dissolveConversationRequestBody2 = dissolveConversationRequestBody;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, dissolveConversationRequestBody2.conversation_id);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, dissolveConversationRequestBody2.conversation_short_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, dissolveConversationRequestBody2.conversation_type);
            protoWriter.writeBytes(dissolveConversationRequestBody2.unknownFields());
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
    public C871480YGs newBuilder() {
        C871480YGs c871480YGs = new C871480YGs();
        c871480YGs.LIZLLL = this.conversation_id;
        c871480YGs.LJ = this.conversation_short_id;
        c871480YGs.LJFF = this.conversation_type;
        c871480YGs.addUnknownFields(unknownFields());
        return c871480YGs;
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
        if (this.conversation_type != null) {
            sb.append(", conversation_type=");
            sb.append(this.conversation_type);
        }
        sb.replace(0, 2, "DissolveConversationRequestBody{");
        sb.append('}');
        return sb.toString();
    }

    public DissolveConversationRequestBody(String str, Long l, Integer num) {
        this(str, l, num, ByteString.EMPTY);
    }

    public DissolveConversationRequestBody(String str, Long l, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_id = str;
        this.conversation_short_id = l;
        this.conversation_type = num;
    }
}
