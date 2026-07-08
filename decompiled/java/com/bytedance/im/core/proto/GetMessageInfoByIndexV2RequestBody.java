package com.bytedance.im.core.proto;

import X.C09CT;
import X.C1516540pZE;
import X.C2238011Cid;
import com.bytedance.im.core.proto.GetMessageInfoByIndexV2RequestBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class GetMessageInfoByIndexV2RequestBody extends Message<GetMessageInfoByIndexV2RequestBody, C2238011Cid> {
    public static final long serialVersionUID = 0;

    @C09CT("conversation_id")
    public final String conversation_id;

    @C09CT("conversation_short_id")
    public final Long conversation_short_id;

    @C09CT("conversation_type")
    public final Integer conversation_type;

    @C09CT("index_in_conversation_v2")
    public final List<Long> index_in_conversation_v2;
    public static final ProtoAdapter<GetMessageInfoByIndexV2RequestBody> ADAPTER = new ProtoAdapter<GetMessageInfoByIndexV2RequestBody>() { // from class: X.1Cic
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final GetMessageInfoByIndexV2RequestBody decode(ProtoReader protoReader) {
            C2238011Cid c2238011Cid = new C2238011Cid();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                    c2238011Cid.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                } else {
                                    c2238011Cid.LJI.add(ProtoAdapter.INT64.decode(protoReader));
                                }
                            } else {
                                c2238011Cid.LJFF = ProtoAdapter.INT64.decode(protoReader);
                            }
                        } else {
                            c2238011Cid.LJ = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c2238011Cid.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2238011Cid.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(GetMessageInfoByIndexV2RequestBody getMessageInfoByIndexV2RequestBody) {
            GetMessageInfoByIndexV2RequestBody getMessageInfoByIndexV2RequestBody2 = getMessageInfoByIndexV2RequestBody;
            int iEncodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, getMessageInfoByIndexV2RequestBody2.conversation_id) + ProtoAdapter.INT32.encodedSizeWithTag(2, getMessageInfoByIndexV2RequestBody2.conversation_type);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(3, getMessageInfoByIndexV2RequestBody2.conversation_short_id) + protoAdapter.asRepeated().encodedSizeWithTag(4, getMessageInfoByIndexV2RequestBody2.index_in_conversation_v2) + getMessageInfoByIndexV2RequestBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, GetMessageInfoByIndexV2RequestBody getMessageInfoByIndexV2RequestBody) {
            GetMessageInfoByIndexV2RequestBody getMessageInfoByIndexV2RequestBody2 = getMessageInfoByIndexV2RequestBody;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, getMessageInfoByIndexV2RequestBody2.conversation_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, getMessageInfoByIndexV2RequestBody2.conversation_type);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 3, getMessageInfoByIndexV2RequestBody2.conversation_short_id);
            protoAdapter.asRepeated().encodeWithTag(protoWriter, 4, getMessageInfoByIndexV2RequestBody2.index_in_conversation_v2);
            protoWriter.writeBytes(getMessageInfoByIndexV2RequestBody2.unknownFields());
        }
    };
    public static final Integer DEFAULT_CONVERSATION_TYPE = 0;
    public static final Long DEFAULT_CONVERSATION_SHORT_ID = 0L;

    @Override // com.squareup.wire.Message
    public C2238011Cid newBuilder() {
        C2238011Cid c2238011Cid = new C2238011Cid();
        c2238011Cid.LIZLLL = this.conversation_id;
        c2238011Cid.LJ = this.conversation_type;
        c2238011Cid.LJFF = this.conversation_short_id;
        c2238011Cid.LJI = C1516540pZE.LIZJ("index_in_conversation_v2", this.index_in_conversation_v2);
        c2238011Cid.addUnknownFields(unknownFields());
        return c2238011Cid;
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
        List<Long> list = this.index_in_conversation_v2;
        if (list != null && !list.isEmpty()) {
            sb.append(", index_in_conversation_v2=");
            sb.append(this.index_in_conversation_v2);
        }
        sb.replace(0, 2, "GetMessageInfoByIndexV2RequestBody{");
        sb.append('}');
        return sb.toString();
    }

    public GetMessageInfoByIndexV2RequestBody(String str, Integer num, Long l, List<Long> list) {
        this(str, num, l, list, ByteString.EMPTY);
    }

    public GetMessageInfoByIndexV2RequestBody(String str, Integer num, Long l, List<Long> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_id = str;
        this.conversation_type = num;
        this.conversation_short_id = l;
        this.index_in_conversation_v2 = C1516540pZE.LJFF("index_in_conversation_v2", list);
    }
}
