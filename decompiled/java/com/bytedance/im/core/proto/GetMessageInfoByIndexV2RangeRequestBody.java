package com.bytedance.im.core.proto;

import X.C09CT;
import X.C1DBW;
import X.EnumC873090YMx;
import com.bytedance.im.core.proto.GetMessageInfoByIndexV2RangeRequestBody;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: loaded from: classes36.dex */
public final class GetMessageInfoByIndexV2RangeRequestBody extends Message<GetMessageInfoByIndexV2RangeRequestBody, C1DBW> {
    public static final long serialVersionUID = 0;

    @C09CT("conversation_id")
    public final String conversation_id;

    @C09CT("conversation_short_id")
    public final Long conversation_short_id;

    @C09CT("conversation_type")
    public final Integer conversation_type;

    @C09CT("direction")
    public final EnumC873090YMx direction;

    @C09CT("max_index_in_conversation_v2")
    public final Long max_index_in_conversation_v2;

    @C09CT("min_index_in_conversation_v2")
    public final Long min_index_in_conversation_v2;
    public static final ProtoAdapter<GetMessageInfoByIndexV2RangeRequestBody> ADAPTER = new ProtoAdapter<GetMessageInfoByIndexV2RangeRequestBody>() { // from class: X.1DBV
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final GetMessageInfoByIndexV2RangeRequestBody decode(ProtoReader protoReader) {
            C1DBW c1dbw = new C1DBW();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c1dbw.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c1dbw.LJ = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 3:
                            c1dbw.LJFF = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 4:
                            c1dbw.LJI = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 5:
                            c1dbw.LJII = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 6:
                            try {
                                c1dbw.LJIIIIZZ = EnumC873090YMx.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                TryCatchGuardChecker.doCheck(e);
                                c1dbw.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c1dbw.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1dbw.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(GetMessageInfoByIndexV2RangeRequestBody getMessageInfoByIndexV2RangeRequestBody) {
            GetMessageInfoByIndexV2RangeRequestBody getMessageInfoByIndexV2RangeRequestBody2 = getMessageInfoByIndexV2RangeRequestBody;
            int iEncodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, getMessageInfoByIndexV2RangeRequestBody2.conversation_id) + ProtoAdapter.INT32.encodedSizeWithTag(2, getMessageInfoByIndexV2RangeRequestBody2.conversation_type);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(3, getMessageInfoByIndexV2RangeRequestBody2.conversation_short_id) + protoAdapter.encodedSizeWithTag(4, getMessageInfoByIndexV2RangeRequestBody2.min_index_in_conversation_v2) + protoAdapter.encodedSizeWithTag(5, getMessageInfoByIndexV2RangeRequestBody2.max_index_in_conversation_v2) + EnumC873090YMx.ADAPTER.encodedSizeWithTag(6, getMessageInfoByIndexV2RangeRequestBody2.direction) + getMessageInfoByIndexV2RangeRequestBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, GetMessageInfoByIndexV2RangeRequestBody getMessageInfoByIndexV2RangeRequestBody) {
            GetMessageInfoByIndexV2RangeRequestBody getMessageInfoByIndexV2RangeRequestBody2 = getMessageInfoByIndexV2RangeRequestBody;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getMessageInfoByIndexV2RangeRequestBody2.conversation_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, getMessageInfoByIndexV2RangeRequestBody2.conversation_type);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 3, getMessageInfoByIndexV2RangeRequestBody2.conversation_short_id);
            protoAdapter.encodeWithTag(protoWriter, 4, getMessageInfoByIndexV2RangeRequestBody2.min_index_in_conversation_v2);
            protoAdapter.encodeWithTag(protoWriter, 5, getMessageInfoByIndexV2RangeRequestBody2.max_index_in_conversation_v2);
            EnumC873090YMx.ADAPTER.encodeWithTag(protoWriter, 6, getMessageInfoByIndexV2RangeRequestBody2.direction);
            protoWriter.writeBytes(getMessageInfoByIndexV2RangeRequestBody2.unknownFields());
        }
    };
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;
    public static final Long DEFAULT_MIN_INDEX_IN_CONVERSATION_V2 = 0L;
    public static final Long DEFAULT_MAX_INDEX_IN_CONVERSATION_V2 = 0L;
    public static final EnumC873090YMx DEFAULT_DIRECTION = EnumC873090YMx.OLDER;

    @Override // com.squareup.wire.Message
    public C1DBW newBuilder() {
        C1DBW c1dbw = new C1DBW();
        c1dbw.LIZLLL = this.conversation_id;
        c1dbw.LJ = this.conversation_type;
        c1dbw.LJFF = this.conversation_short_id;
        c1dbw.LJI = this.min_index_in_conversation_v2;
        c1dbw.LJII = this.max_index_in_conversation_v2;
        c1dbw.LJIIIIZZ = this.direction;
        c1dbw.addUnknownFields(unknownFields());
        return c1dbw;
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
        sb.append(", min_index_in_conversation_v2=");
        sb.append(this.min_index_in_conversation_v2);
        sb.append(", max_index_in_conversation_v2=");
        sb.append(this.max_index_in_conversation_v2);
        if (this.direction != null) {
            sb.append(", direction=");
            sb.append(this.direction);
        }
        sb.replace(0, 2, "GetMessageInfoByIndexV2RangeRequestBody{");
        sb.append('}');
        return sb.toString();
    }

    public GetMessageInfoByIndexV2RangeRequestBody(String str, Integer num, Long l, Long l2, Long l3, EnumC873090YMx enumC873090YMx) {
        this(str, num, l, l2, l3, enumC873090YMx, ByteString.EMPTY);
    }

    public GetMessageInfoByIndexV2RangeRequestBody(String str, Integer num, Long l, Long l2, Long l3, EnumC873090YMx enumC873090YMx, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_id = str;
        this.conversation_type = num;
        this.conversation_short_id = l;
        this.min_index_in_conversation_v2 = l2;
        this.max_index_in_conversation_v2 = l3;
        this.direction = enumC873090YMx;
    }
}
