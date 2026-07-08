package com.bytedance.im.core.proto;

import X.C09CT;
import X.C1DBY;
import X.EnumC873090YMx;
import com.bytedance.im.core.proto.PreviewerMessagesInConversationRequestBody;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: loaded from: classes36.dex */
public final class PreviewerMessagesInConversationRequestBody extends Message<PreviewerMessagesInConversationRequestBody, C1DBY> {
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

    @C09CT("limit")
    public final Integer limit;
    public static final ProtoAdapter<PreviewerMessagesInConversationRequestBody> ADAPTER = new ProtoAdapter<PreviewerMessagesInConversationRequestBody>() { // from class: X.1DBX
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final PreviewerMessagesInConversationRequestBody decode(ProtoReader protoReader) {
            C1DBY c1dby = new C1DBY();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c1dby.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c1dby.LJ = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 3:
                            c1dby.LJFF = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 4:
                            try {
                                c1dby.LJI = EnumC873090YMx.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                TryCatchGuardChecker.doCheck(e);
                                c1dby.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                            break;
                        case 5:
                            c1dby.LJII = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 6:
                            c1dby.LJIIIIZZ = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c1dby.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1dby.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(PreviewerMessagesInConversationRequestBody previewerMessagesInConversationRequestBody) {
            PreviewerMessagesInConversationRequestBody previewerMessagesInConversationRequestBody2 = previewerMessagesInConversationRequestBody;
            int iEncodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, previewerMessagesInConversationRequestBody2.conversation_id);
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, previewerMessagesInConversationRequestBody2.conversation_type);
            ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
            return iEncodedSizeWithTag2 + protoAdapter2.encodedSizeWithTag(3, previewerMessagesInConversationRequestBody2.conversation_short_id) + EnumC873090YMx.ADAPTER.encodedSizeWithTag(4, previewerMessagesInConversationRequestBody2.direction) + protoAdapter2.encodedSizeWithTag(5, previewerMessagesInConversationRequestBody2.anchor_index) + protoAdapter.encodedSizeWithTag(6, previewerMessagesInConversationRequestBody2.limit) + previewerMessagesInConversationRequestBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, PreviewerMessagesInConversationRequestBody previewerMessagesInConversationRequestBody) {
            PreviewerMessagesInConversationRequestBody previewerMessagesInConversationRequestBody2 = previewerMessagesInConversationRequestBody;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, previewerMessagesInConversationRequestBody2.conversation_id);
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            protoAdapter.encodeWithTag(protoWriter, 2, previewerMessagesInConversationRequestBody2.conversation_type);
            ProtoAdapter<Long> protoAdapter2 = ProtoAdapter.INT64;
            protoAdapter2.encodeWithTag(protoWriter, 3, previewerMessagesInConversationRequestBody2.conversation_short_id);
            EnumC873090YMx.ADAPTER.encodeWithTag(protoWriter, 4, previewerMessagesInConversationRequestBody2.direction);
            protoAdapter2.encodeWithTag(protoWriter, 5, previewerMessagesInConversationRequestBody2.anchor_index);
            protoAdapter.encodeWithTag(protoWriter, 6, previewerMessagesInConversationRequestBody2.limit);
            protoWriter.writeBytes(previewerMessagesInConversationRequestBody2.unknownFields());
        }
    };
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final EnumC873090YMx DEFAULT_DIRECTION = EnumC873090YMx.OLDER;
    public static final Long DEFAULT_ANCHOR_INDEX = 0L;
    public static final Integer DEFAULT_LIMIT = 50;

    @Override // com.squareup.wire.Message
    public C1DBY newBuilder() {
        C1DBY c1dby = new C1DBY();
        c1dby.LIZLLL = this.conversation_id;
        c1dby.LJ = this.conversation_type;
        c1dby.LJFF = this.conversation_short_id;
        c1dby.LJI = this.direction;
        c1dby.LJII = this.anchor_index;
        c1dby.LJIIIIZZ = this.limit;
        c1dby.addUnknownFields(unknownFields());
        return c1dby;
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
        sb.replace(0, 2, "PreviewerMessagesInConversationRequestBody{");
        sb.append('}');
        return sb.toString();
    }

    public PreviewerMessagesInConversationRequestBody(String str, Integer num, Long l, EnumC873090YMx enumC873090YMx, Long l2, Integer num2) {
        this(str, num, l, enumC873090YMx, l2, num2, ByteString.EMPTY);
    }

    public PreviewerMessagesInConversationRequestBody(String str, Integer num, Long l, EnumC873090YMx enumC873090YMx, Long l2, Integer num2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_id = str;
        this.conversation_type = num;
        this.conversation_short_id = l;
        this.direction = enumC873090YMx;
        this.anchor_index = l2;
        this.limit = num2;
    }
}
