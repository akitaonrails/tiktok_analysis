package com.bytedance.im.core.proto;

import X.C09CT;
import X.C0YJK;
import com.bytedance.im.core.proto.GetConversationParticipantsReadIndexV3RequestBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public final class GetConversationParticipantsReadIndexV3RequestBody extends Message<GetConversationParticipantsReadIndexV3RequestBody, C0YJK> {
    public static final ProtoAdapter<GetConversationParticipantsReadIndexV3RequestBody> ADAPTER = new ProtoAdapter<GetConversationParticipantsReadIndexV3RequestBody>() { // from class: X.0YJL
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final GetConversationParticipantsReadIndexV3RequestBody decode(ProtoReader protoReader) {
            C0YJK c0yjk = new C0YJK();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c0yjk.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                c0yjk.LJFF = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c0yjk.LJ = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c0yjk.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c0yjk.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(GetConversationParticipantsReadIndexV3RequestBody getConversationParticipantsReadIndexV3RequestBody) {
            GetConversationParticipantsReadIndexV3RequestBody getConversationParticipantsReadIndexV3RequestBody2 = getConversationParticipantsReadIndexV3RequestBody;
            return ProtoAdapter.INT64.encodedSizeWithTag(1, getConversationParticipantsReadIndexV3RequestBody2.conversation_short_id) + ProtoAdapter.INT32.encodedSizeWithTag(2, getConversationParticipantsReadIndexV3RequestBody2.conversation_type) + ProtoAdapter.STRING.encodedSizeWithTag(3, getConversationParticipantsReadIndexV3RequestBody2.conversation_id) + getConversationParticipantsReadIndexV3RequestBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, GetConversationParticipantsReadIndexV3RequestBody getConversationParticipantsReadIndexV3RequestBody) {
            GetConversationParticipantsReadIndexV3RequestBody getConversationParticipantsReadIndexV3RequestBody2 = getConversationParticipantsReadIndexV3RequestBody;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, getConversationParticipantsReadIndexV3RequestBody2.conversation_short_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, getConversationParticipantsReadIndexV3RequestBody2.conversation_type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, getConversationParticipantsReadIndexV3RequestBody2.conversation_id);
            protoWriter.writeBytes(getConversationParticipantsReadIndexV3RequestBody2.unknownFields());
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
    public C0YJK newBuilder() {
        C0YJK c0yjk = new C0YJK();
        c0yjk.LIZLLL = this.conversation_short_id;
        c0yjk.LJ = this.conversation_type;
        c0yjk.LJFF = this.conversation_id;
        c0yjk.addUnknownFields(unknownFields());
        return c0yjk;
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
        sb.replace(0, 2, "GetConversationParticipantsReadIndexV3RequestBody{");
        sb.append('}');
        return sb.toString();
    }

    public GetConversationParticipantsReadIndexV3RequestBody(Long l, Integer num, String str) {
        this(l, num, str, ByteString.EMPTY);
    }

    public GetConversationParticipantsReadIndexV3RequestBody(Long l, Integer num, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_short_id = l;
        this.conversation_type = num;
        this.conversation_id = str;
    }
}
