package com.bytedance.im.core.proto;

import X.C09CT;
import X.C2251171D9f;
import com.bytedance.im.core.proto.GetRecentMessageReqBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: loaded from: classes36.dex */
public final class GetRecentMessageReqBody extends Message<GetRecentMessageReqBody, C2251171D9f> {
    public static final ProtoAdapter<GetRecentMessageReqBody> ADAPTER = new ProtoAdapter<GetRecentMessageReqBody>() { // from class: X.1D9e
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final GetRecentMessageReqBody decode(ProtoReader protoReader) {
            C2251171D9f c2251171D9f = new C2251171D9f();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c2251171D9f.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                c2251171D9f.LJFF = ProtoAdapter.INT32.decode(protoReader);
                            }
                        } else {
                            c2251171D9f.LJ = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c2251171D9f.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2251171D9f.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(GetRecentMessageReqBody getRecentMessageReqBody) {
            GetRecentMessageReqBody getRecentMessageReqBody2 = getRecentMessageReqBody;
            return ProtoAdapter.INT64.encodedSizeWithTag(1, getRecentMessageReqBody2.conversation_version) + ProtoAdapter.STRING.encodedSizeWithTag(2, getRecentMessageReqBody2.source) + ProtoAdapter.INT32.encodedSizeWithTag(3, getRecentMessageReqBody2.new_user) + getRecentMessageReqBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, GetRecentMessageReqBody getRecentMessageReqBody) {
            GetRecentMessageReqBody getRecentMessageReqBody2 = getRecentMessageReqBody;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, getRecentMessageReqBody2.conversation_version);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, getRecentMessageReqBody2.source);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, getRecentMessageReqBody2.new_user);
            protoWriter.writeBytes(getRecentMessageReqBody2.unknownFields());
        }
    };
    public static final Long DEFAULT_CONVERSATION_VERSION = 0L;
    public static final Integer DEFAULT_NEW_USER = 0;
    public static final long serialVersionUID = 0;

    @C09CT("conversation_version")
    public final Long conversation_version;

    @C09CT("new_user")
    public final Integer new_user;

    @C09CT("source")
    public final String source;

    @Override // com.squareup.wire.Message
    public C2251171D9f newBuilder() {
        C2251171D9f c2251171D9f = new C2251171D9f();
        c2251171D9f.LIZLLL = this.conversation_version;
        c2251171D9f.LJ = this.source;
        c2251171D9f.LJFF = this.new_user;
        c2251171D9f.addUnknownFields(unknownFields());
        return c2251171D9f;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", conversation_version=");
        sb.append(this.conversation_version);
        sb.append(", source=");
        sb.append(this.source);
        if (this.new_user != null) {
            sb.append(", new_user=");
            sb.append(this.new_user);
        }
        sb.replace(0, 2, "GetRecentMessageReqBody{");
        sb.append('}');
        return sb.toString();
    }

    public GetRecentMessageReqBody(Long l, String str, Integer num) {
        this(l, str, num, ByteString.EMPTY);
    }

    public GetRecentMessageReqBody(Long l, String str, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conversation_version = l;
        this.source = str;
        this.new_user = num;
    }
}
