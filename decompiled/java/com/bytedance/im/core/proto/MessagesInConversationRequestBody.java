package com.bytedance.im.core.proto;

import X.C09CT;
import X.C1516540pZE;
import X.C868980Y7c;
import X.EnumC873090YMx;
import com.bytedance.im.core.proto.MessagesInConversationRequestBody;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.Map;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public final class MessagesInConversationRequestBody extends Message<MessagesInConversationRequestBody, C868980Y7c> {
    public static final long serialVersionUID = 0;

    @C09CT("anchor_index")
    public final Long anchor_index;

    @C09CT("conversation_id")
    public final String conversation_id;

    @C09CT("conversation_short_id")
    public final Long conversation_short_id;

    @C09CT("conversation_type")
    public final Integer conversation_type;

    @C09CT("direction")
    public final EnumC873090YMx direction;

    @C09CT("ext")
    public final Map<String, String> ext;

    @C09CT("limit")
    public final Integer limit;
    public static final ProtoAdapter<MessagesInConversationRequestBody> ADAPTER = new ProtoAdapter<MessagesInConversationRequestBody>() { // from class: X.0Y7l
        public final ProtoAdapter<Map<String, String>> LIZ;

        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.LIZ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final MessagesInConversationRequestBody decode(ProtoReader protoReader) {
            C868980Y7c c868980Y7c = new C868980Y7c();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c868980Y7c.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c868980Y7c.LJ = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 3:
                            c868980Y7c.LJFF = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 4:
                            try {
                                c868980Y7c.LJI = EnumC873090YMx.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                TryCatchGuardChecker.doCheck(e);
                                c868980Y7c.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                            break;
                        case 5:
                            c868980Y7c.LJII = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 6:
                            c868980Y7c.LJIIIIZZ = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 7:
                            c868980Y7c.LJIIIZ.putAll(this.LIZ.decode(protoReader));
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c868980Y7c.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c868980Y7c.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(MessagesInConversationRequestBody messagesInConversationRequestBody) {
            MessagesInConversationRequestBody messagesInConversationRequestBody2 = messagesInConversationRequestBody;
            int iEncodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, messagesInConversationRequestBody2.conversation_id);
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, messagesInConversationRequestBody2.conversation_type);
            ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
            return iEncodedSizeWithTag2 + protoAdapter2.encodedSizeWithTag(3, messagesInConversationRequestBody2.conversation_short_id) + EnumC873090YMx.ADAPTER.encodedSizeWithTag(4, messagesInConversationRequestBody2.direction) + protoAdapter2.encodedSizeWithTag(5, messagesInConversationRequestBody2.anchor_index) + protoAdapter.encodedSizeWithTag(6, messagesInConversationRequestBody2.limit) + this.LIZ.encodedSizeWithTag(7, messagesInConversationRequestBody2.ext) + messagesInConversationRequestBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, MessagesInConversationRequestBody messagesInConversationRequestBody) {
            MessagesInConversationRequestBody messagesInConversationRequestBody2 = messagesInConversationRequestBody;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, messagesInConversationRequestBody2.conversation_id);
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            protoAdapter.encodeWithTag(protoWriter, 2, messagesInConversationRequestBody2.conversation_type);
            ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
            protoAdapter2.encodeWithTag(protoWriter, 3, messagesInConversationRequestBody2.conversation_short_id);
            EnumC873090YMx.ADAPTER.encodeWithTag(protoWriter, 4, messagesInConversationRequestBody2.direction);
            protoAdapter2.encodeWithTag(protoWriter, 5, messagesInConversationRequestBody2.anchor_index);
            protoAdapter.encodeWithTag(protoWriter, 6, messagesInConversationRequestBody2.limit);
            this.LIZ.encodeWithTag(protoWriter, 7, messagesInConversationRequestBody2.ext);
            protoWriter.writeBytes(messagesInConversationRequestBody2.unknownFields());
        }
    };
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final EnumC873090YMx DEFAULT_DIRECTION = EnumC873090YMx.OLDER;
    public static final Long DEFAULT_ANCHOR_INDEX = 0L;
    public static final Integer DEFAULT_LIMIT = 50;

    @Override // com.squareup.wire.Message
    public C868980Y7c newBuilder() {
        C868980Y7c c868980Y7c = new C868980Y7c();
        c868980Y7c.LIZLLL = this.conversation_id;
        c868980Y7c.LJ = this.conversation_type;
        c868980Y7c.LJFF = this.conversation_short_id;
        c868980Y7c.LJI = this.direction;
        c868980Y7c.LJII = this.anchor_index;
        c868980Y7c.LJIIIIZZ = this.limit;
        c868980Y7c.LJIIIZ = C1516540pZE.LIZLLL("ext", this.ext);
        c868980Y7c.addUnknownFields(unknownFields());
        return c868980Y7c;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.conversation_id != null) {
            sb.append(", conversation_id=");
            sb.append(this.conversation_id);
        }
        if (this.conversation_type != null) {
            sb.append(", conversation_type=");
            sb.append(this.conversation_type);
        }
        if (this.conversation_short_id != null) {
            sb.append(", conversation_short_id=");
            sb.append(this.conversation_short_id);
        }
        if (this.direction != null) {
            sb.append(", direction=");
            sb.append(this.direction);
        }
        if (this.anchor_index != null) {
            sb.append(", anchor_index=");
            sb.append(this.anchor_index);
        }
        if (this.limit != null) {
            sb.append(", limit=");
            sb.append(this.limit);
        }
        Map<String, String> map = this.ext;
        if (map != null && !map.isEmpty()) {
            sb.append(", ext=");
            sb.append(this.ext);
        }
        sb.replace(0, 2, "MessagesInConversationRequestBody{");
        sb.append('}');
        return sb.toString();
    }

    public MessagesInConversationRequestBody(String str, Integer num, Long l, EnumC873090YMx enumC873090YMx, Long l2, Integer num2, Map<String, String> map) {
        this(str, num, l, enumC873090YMx, l2, num2, map, ByteString.EMPTY);
    }

    public MessagesInConversationRequestBody(String str, Integer num, Long l, EnumC873090YMx enumC873090YMx, Long l2, Integer num2, Map<String, String> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_id = str;
        this.conversation_type = num;
        this.conversation_short_id = l;
        this.direction = enumC873090YMx;
        this.anchor_index = l2;
        this.limit = num2;
        this.ext = C1516540pZE.LJI("ext", map);
    }
}
