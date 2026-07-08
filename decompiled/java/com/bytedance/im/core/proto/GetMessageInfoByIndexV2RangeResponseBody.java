package com.bytedance.im.core.proto;

import X.C09CT;
import X.C0YR7;
import X.C1516540pZE;
import com.bytedance.im.core.proto.GetMessageInfoByIndexV2RangeResponseBody;
import com.bytedance.im.core.proto.MessageInfo;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public final class GetMessageInfoByIndexV2RangeResponseBody extends Message<GetMessageInfoByIndexV2RangeResponseBody, C0YR7> {
    public static final long serialVersionUID = 0;

    @C09CT("has_more")
    public final Boolean has_more;

    @C09CT("infos")
    public final List<MessageInfo> infos;

    @C09CT("next_index_in_conversation_v2")
    public final Long next_index_in_conversation_v2;
    public static final ProtoAdapter<GetMessageInfoByIndexV2RangeResponseBody> ADAPTER = new ProtoAdapter<GetMessageInfoByIndexV2RangeResponseBody>() { // from class: X.0YR6
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final GetMessageInfoByIndexV2RangeResponseBody decode(ProtoReader protoReader) {
            C0YR7 c0yr7 = new C0YR7();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c0yr7.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                c0yr7.LJFF = ProtoAdapter.BOOL.decode(protoReader);
                            }
                        } else {
                            c0yr7.LJ = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c0yr7.LIZLLL.add(MessageInfo.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c0yr7.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(GetMessageInfoByIndexV2RangeResponseBody getMessageInfoByIndexV2RangeResponseBody) {
            GetMessageInfoByIndexV2RangeResponseBody getMessageInfoByIndexV2RangeResponseBody2 = getMessageInfoByIndexV2RangeResponseBody;
            return MessageInfo.ADAPTER.asRepeated().encodedSizeWithTag(1, getMessageInfoByIndexV2RangeResponseBody2.infos) + ProtoAdapter.INT64.encodedSizeWithTag(2, getMessageInfoByIndexV2RangeResponseBody2.next_index_in_conversation_v2) + ProtoAdapter.BOOL.encodedSizeWithTag(3, getMessageInfoByIndexV2RangeResponseBody2.has_more) + getMessageInfoByIndexV2RangeResponseBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, GetMessageInfoByIndexV2RangeResponseBody getMessageInfoByIndexV2RangeResponseBody) {
            GetMessageInfoByIndexV2RangeResponseBody getMessageInfoByIndexV2RangeResponseBody2 = getMessageInfoByIndexV2RangeResponseBody;
            MessageInfo.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, getMessageInfoByIndexV2RangeResponseBody2.infos);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, getMessageInfoByIndexV2RangeResponseBody2.next_index_in_conversation_v2);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, getMessageInfoByIndexV2RangeResponseBody2.has_more);
            protoWriter.writeBytes(getMessageInfoByIndexV2RangeResponseBody2.unknownFields());
        }
    };
    public static final Long DEFAULT_NEXT_INDEX_IN_CONVERSATION_V2 = 0L;
    public static final Boolean DEFAULT_HAS_MORE = Boolean.FALSE;

    @Override // com.squareup.wire.Message
    public C0YR7 newBuilder() {
        C0YR7 c0yr7 = new C0YR7();
        c0yr7.LIZLLL = C1516540pZE.LIZJ("infos", this.infos);
        c0yr7.LJ = this.next_index_in_conversation_v2;
        c0yr7.LJFF = this.has_more;
        c0yr7.addUnknownFields(unknownFields());
        return c0yr7;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<MessageInfo> list = this.infos;
        if (list != null && !list.isEmpty()) {
            sb.append(", infos=");
            sb.append(this.infos);
        }
        if (this.next_index_in_conversation_v2 != null) {
            sb.append(", next_index_in_conversation_v2=");
            sb.append(this.next_index_in_conversation_v2);
        }
        if (this.has_more != null) {
            sb.append(", has_more=");
            sb.append(this.has_more);
        }
        sb.replace(0, 2, "GetMessageInfoByIndexV2RangeResponseBody{");
        sb.append('}');
        return sb.toString();
    }

    public GetMessageInfoByIndexV2RangeResponseBody(List<MessageInfo> list, Long l, Boolean bool) {
        this(list, l, bool, ByteString.EMPTY);
    }

    public GetMessageInfoByIndexV2RangeResponseBody(List<MessageInfo> list, Long l, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.infos = C1516540pZE.LJFF("infos", list);
        this.next_index_in_conversation_v2 = l;
        this.has_more = bool;
    }
}
