package com.bytedance.im.core.proto;

import X.C09CT;
import X.C873320YNu;
import com.bytedance.im.core.proto.GetConversationsCheckInfoV2RequestBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public final class GetConversationsCheckInfoV2RequestBody extends Message<GetConversationsCheckInfoV2RequestBody, C873320YNu> {
    public static final ProtoAdapter<GetConversationsCheckInfoV2RequestBody> ADAPTER = new ProtoAdapter<GetConversationsCheckInfoV2RequestBody>() { // from class: X.0YNv
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final GetConversationsCheckInfoV2RequestBody decode(ProtoReader protoReader) {
            C873320YNu c873320YNu = new C873320YNu();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c873320YNu.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c873320YNu.LIZLLL = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c873320YNu.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(GetConversationsCheckInfoV2RequestBody getConversationsCheckInfoV2RequestBody) {
            GetConversationsCheckInfoV2RequestBody getConversationsCheckInfoV2RequestBody2 = getConversationsCheckInfoV2RequestBody;
            return ProtoAdapter.INT32.encodedSizeWithTag(1, getConversationsCheckInfoV2RequestBody2.limit) + getConversationsCheckInfoV2RequestBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, GetConversationsCheckInfoV2RequestBody getConversationsCheckInfoV2RequestBody) {
            GetConversationsCheckInfoV2RequestBody getConversationsCheckInfoV2RequestBody2 = getConversationsCheckInfoV2RequestBody;
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, getConversationsCheckInfoV2RequestBody2.limit);
            protoWriter.writeBytes(getConversationsCheckInfoV2RequestBody2.unknownFields());
        }
    };
    public static final Integer DEFAULT_LIMIT = 0;
    public static final long serialVersionUID = 0;

    @C09CT("limit")
    public final Integer limit;

    @Override // com.squareup.wire.Message
    public C873320YNu newBuilder() {
        C873320YNu c873320YNu = new C873320YNu();
        c873320YNu.LIZLLL = this.limit;
        c873320YNu.addUnknownFields(unknownFields());
        return c873320YNu;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.limit != null) {
            sb.append(", limit=");
            sb.append(this.limit);
        }
        sb.replace(0, 2, "GetConversationsCheckInfoV2RequestBody{");
        sb.append('}');
        return sb.toString();
    }

    public GetConversationsCheckInfoV2RequestBody(Integer num) {
        this(num, ByteString.EMPTY);
    }

    public GetConversationsCheckInfoV2RequestBody(Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.limit = num;
    }
}
