package com.bytedance.im.core.proto;

import X.C09CT;
import X.C2238681Cji;
import com.bytedance.im.core.proto.GetMessageByKeyError;
import com.bytedance.im.core.proto.MessageKey;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class GetMessageByKeyError extends Message<GetMessageByKeyError, C2238681Cji> {
    public static final ProtoAdapter<GetMessageByKeyError> ADAPTER = new ProtoAdapter<GetMessageByKeyError>() { // from class: X.1Cjh
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final GetMessageByKeyError decode(ProtoReader protoReader) {
            C2238681Cji c2238681Cji = new C2238681Cji();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2238681Cji.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c2238681Cji.LJ = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c2238681Cji.LIZLLL = MessageKey.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2238681Cji.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(GetMessageByKeyError getMessageByKeyError) {
            GetMessageByKeyError getMessageByKeyError2 = getMessageByKeyError;
            return MessageKey.ADAPTER.encodedSizeWithTag(1, getMessageByKeyError2.key) + ProtoAdapter.INT32.encodedSizeWithTag(2, getMessageByKeyError2.status_code) + getMessageByKeyError2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, GetMessageByKeyError getMessageByKeyError) {
            GetMessageByKeyError getMessageByKeyError2 = getMessageByKeyError;
            MessageKey.ADAPTER.encodeWithTag(protoWriter, 1, getMessageByKeyError2.key);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, getMessageByKeyError2.status_code);
            protoWriter.writeBytes(getMessageByKeyError2.unknownFields());
        }
    };
    public static final Integer DEFAULT_STATUS_CODE = 0;
    public static final long serialVersionUID = 0;

    @C09CT("key")
    public final MessageKey key;

    @C09CT("status_code")
    public final Integer status_code;

    @Override // com.squareup.wire.Message
    public C2238681Cji newBuilder() {
        C2238681Cji c2238681Cji = new C2238681Cji();
        c2238681Cji.LIZLLL = this.key;
        c2238681Cji.LJ = this.status_code;
        c2238681Cji.addUnknownFields(unknownFields());
        return c2238681Cji;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", key=");
        sb.append(this.key);
        sb.append(", status_code=");
        sb.append(this.status_code);
        sb.replace(0, 2, "GetMessageByKeyError{");
        sb.append('}');
        return sb.toString();
    }

    public GetMessageByKeyError(MessageKey messageKey, Integer num) {
        this(messageKey, num, ByteString.EMPTY);
    }

    public GetMessageByKeyError(MessageKey messageKey, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.key = messageKey;
        this.status_code = num;
    }
}
