package com.bytedance.im.core.proto;

import X.C09CT;
import X.C2251191D9h;
import com.bytedance.im.core.proto.GetConversationParticipantsMinIndexV3RequestBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: loaded from: classes36.dex */
public final class GetConversationParticipantsMinIndexV3RequestBody extends Message<GetConversationParticipantsMinIndexV3RequestBody, C2251191D9h> {
    public static final ProtoAdapter<GetConversationParticipantsMinIndexV3RequestBody> ADAPTER = new ProtoAdapter<GetConversationParticipantsMinIndexV3RequestBody>() { // from class: X.1D9g
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final GetConversationParticipantsMinIndexV3RequestBody decode(ProtoReader protoReader) {
            C2251191D9h c2251191D9h = new C2251191D9h();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c2251191D9h.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                c2251191D9h.LJFF = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c2251191D9h.LJ = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c2251191D9h.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2251191D9h.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(GetConversationParticipantsMinIndexV3RequestBody getConversationParticipantsMinIndexV3RequestBody) {
            GetConversationParticipantsMinIndexV3RequestBody getConversationParticipantsMinIndexV3RequestBody2 = getConversationParticipantsMinIndexV3RequestBody;
            return ProtoAdapter.INT64.encodedSizeWithTag(1, getConversationParticipantsMinIndexV3RequestBody2.conversation_short_id) + ProtoAdapter.INT32.encodedSizeWithTag(2, getConversationParticipantsMinIndexV3RequestBody2.conversation_type) + ProtoAdapter.STRING.encodedSizeWithTag(3, getConversationParticipantsMinIndexV3RequestBody2.conversation_id) + getConversationParticipantsMinIndexV3RequestBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, GetConversationParticipantsMinIndexV3RequestBody getConversationParticipantsMinIndexV3RequestBody) {
            GetConversationParticipantsMinIndexV3RequestBody getConversationParticipantsMinIndexV3RequestBody2 = getConversationParticipantsMinIndexV3RequestBody;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, getConversationParticipantsMinIndexV3RequestBody2.conversation_short_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, getConversationParticipantsMinIndexV3RequestBody2.conversation_type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, getConversationParticipantsMinIndexV3RequestBody2.conversation_id);
            protoWriter.writeBytes(getConversationParticipantsMinIndexV3RequestBody2.unknownFields());
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
    public C2251191D9h newBuilder() {
        C2251191D9h c2251191D9h = new C2251191D9h();
        c2251191D9h.LIZLLL = this.conversation_short_id;
        c2251191D9h.LJ = this.conversation_type;
        c2251191D9h.LJFF = this.conversation_id;
        c2251191D9h.addUnknownFields(unknownFields());
        return c2251191D9h;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.conversation_short_id != null) {
            sb.append(", conversation_short_id=");
            sb.append(this.conversation_short_id);
        }
        if (this.conversation_type != null) {
            sb.append(", conversation_type=");
            sb.append(this.conversation_type);
        }
        if (this.conversation_id != null) {
            sb.append(", conversation_id=");
            sb.append(this.conversation_id);
        }
        sb.replace(0, 2, "GetConversationParticipantsMinIndexV3RequestBody{");
        sb.append('}');
        return sb.toString();
    }

    public GetConversationParticipantsMinIndexV3RequestBody(Long l, Integer num, String str) {
        this(l, num, str, ByteString.EMPTY);
    }

    public GetConversationParticipantsMinIndexV3RequestBody(Long l, Integer num, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_short_id = l;
        this.conversation_type = num;
        this.conversation_id = str;
    }
}
