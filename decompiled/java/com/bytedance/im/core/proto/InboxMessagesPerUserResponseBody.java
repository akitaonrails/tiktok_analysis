package com.bytedance.im.core.proto;

import X.C09CT;
import X.C1CKL;
import com.bytedance.im.core.proto.InboxMessagesPerUserResponseBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class InboxMessagesPerUserResponseBody extends Message<InboxMessagesPerUserResponseBody, C1CKL> {
    public static final long serialVersionUID = 0;

    @C09CT("has_more")
    public final Boolean has_more;

    @C09CT("inbox_type")
    public final Integer inbox_type;
    public static final ProtoAdapter<InboxMessagesPerUserResponseBody> ADAPTER = new ProtoAdapter<InboxMessagesPerUserResponseBody>() { // from class: X.1CKK
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final InboxMessagesPerUserResponseBody decode(ProtoReader protoReader) {
            C1CKL c1ckl = new C1CKL();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c1ckl.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c1ckl.LJ = ProtoAdapter.BOOL.decode(protoReader);
                        }
                    } else {
                        c1ckl.LIZLLL = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1ckl.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(InboxMessagesPerUserResponseBody inboxMessagesPerUserResponseBody) {
            InboxMessagesPerUserResponseBody inboxMessagesPerUserResponseBody2 = inboxMessagesPerUserResponseBody;
            return ProtoAdapter.INT32.encodedSizeWithTag(1, inboxMessagesPerUserResponseBody2.inbox_type) + ProtoAdapter.BOOL.encodedSizeWithTag(2, inboxMessagesPerUserResponseBody2.has_more) + inboxMessagesPerUserResponseBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, InboxMessagesPerUserResponseBody inboxMessagesPerUserResponseBody) {
            InboxMessagesPerUserResponseBody inboxMessagesPerUserResponseBody2 = inboxMessagesPerUserResponseBody;
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, inboxMessagesPerUserResponseBody2.inbox_type);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, inboxMessagesPerUserResponseBody2.has_more);
            protoWriter.writeBytes(inboxMessagesPerUserResponseBody2.unknownFields());
        }
    };
    public static final Integer DEFAULT_INBOX_TYPE = 0;
    public static final Boolean DEFAULT_HAS_MORE = Boolean.FALSE;

    @Override // com.squareup.wire.Message
    public C1CKL newBuilder() {
        C1CKL c1ckl = new C1CKL();
        c1ckl.LIZLLL = this.inbox_type;
        c1ckl.LJ = this.has_more;
        c1ckl.addUnknownFields(unknownFields());
        return c1ckl;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.inbox_type != null) {
            sb.append(", inbox_type=");
            sb.append(this.inbox_type);
        }
        if (this.has_more != null) {
            sb.append(", has_more=");
            sb.append(this.has_more);
        }
        sb.replace(0, 2, "InboxMessagesPerUserResponseBody{");
        sb.append('}');
        return sb.toString();
    }

    public InboxMessagesPerUserResponseBody(Integer num, Boolean bool) {
        this(num, bool, ByteString.EMPTY);
    }

    public InboxMessagesPerUserResponseBody(Integer num, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.inbox_type = num;
        this.has_more = bool;
    }
}
