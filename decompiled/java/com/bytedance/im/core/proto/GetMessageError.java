package com.bytedance.im.core.proto;

import X.C09CT;
import X.C0YU4;
import com.bytedance.im.core.proto.GetMessageError;
import com.bytedance.im.core.proto.MessageIDIndexEntry;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public final class GetMessageError extends Message<GetMessageError, C0YU4> {
    public static final ProtoAdapter<GetMessageError> ADAPTER = new ProtoAdapter<GetMessageError>() { // from class: X.0YU3
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final GetMessageError decode(ProtoReader protoReader) {
            C0YU4 c0yu4 = new C0YU4();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c0yu4.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c0yu4.LJ = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c0yu4.LIZLLL = MessageIDIndexEntry.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c0yu4.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(GetMessageError getMessageError) {
            GetMessageError getMessageError2 = getMessageError;
            return MessageIDIndexEntry.ADAPTER.encodedSizeWithTag(1, getMessageError2.entry) + ProtoAdapter.INT32.encodedSizeWithTag(2, getMessageError2.status_code) + getMessageError2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, GetMessageError getMessageError) {
            GetMessageError getMessageError2 = getMessageError;
            MessageIDIndexEntry.ADAPTER.encodeWithTag(protoWriter, 1, getMessageError2.entry);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, getMessageError2.status_code);
            protoWriter.writeBytes(getMessageError2.unknownFields());
        }
    };
    public static final Integer DEFAULT_STATUS_CODE = 0;
    public static final long serialVersionUID = 0;

    @C09CT("entry")
    public final MessageIDIndexEntry entry;

    @C09CT("status_code")
    public final Integer status_code;

    @Override // com.squareup.wire.Message
    public C0YU4 newBuilder() {
        C0YU4 c0yu4 = new C0YU4();
        c0yu4.LIZLLL = this.entry;
        c0yu4.LJ = this.status_code;
        c0yu4.addUnknownFields(unknownFields());
        return c0yu4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", entry=");
        sb.append(this.entry);
        sb.append(", status_code=");
        sb.append(this.status_code);
        sb.replace(0, 2, "GetMessageError{");
        sb.append('}');
        return sb.toString();
    }

    public GetMessageError(MessageIDIndexEntry messageIDIndexEntry, Integer num) {
        this(messageIDIndexEntry, num, ByteString.EMPTY);
    }

    public GetMessageError(MessageIDIndexEntry messageIDIndexEntry, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.entry = messageIDIndexEntry;
        this.status_code = num;
    }
}
