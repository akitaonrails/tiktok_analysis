package com.bytedance.im.core.proto;

import X.C09CT;
import X.C1CKH;
import com.bytedance.im.core.proto.InboxMessagesPerUser;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class InboxMessagesPerUser extends Message<InboxMessagesPerUser, C1CKH> {
    public static final long serialVersionUID = 0;

    @C09CT("cursor")
    public final Long cursor;

    @C09CT("inbox_type")
    public final Integer inbox_type;
    public static final ProtoAdapter<InboxMessagesPerUser> ADAPTER = new ProtoAdapter<InboxMessagesPerUser>() { // from class: X.1CKG
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final InboxMessagesPerUser decode(ProtoReader protoReader) {
            C1CKH c1ckh = new C1CKH();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c1ckh.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c1ckh.LJ = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c1ckh.LIZLLL = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1ckh.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(InboxMessagesPerUser inboxMessagesPerUser) {
            InboxMessagesPerUser inboxMessagesPerUser2 = inboxMessagesPerUser;
            return ProtoAdapter.INT32.encodedSizeWithTag(1, inboxMessagesPerUser2.inbox_type) + ProtoAdapter.INT64.encodedSizeWithTag(2, inboxMessagesPerUser2.cursor) + inboxMessagesPerUser2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, InboxMessagesPerUser inboxMessagesPerUser) {
            InboxMessagesPerUser inboxMessagesPerUser2 = inboxMessagesPerUser;
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, inboxMessagesPerUser2.inbox_type);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, inboxMessagesPerUser2.cursor);
            protoWriter.writeBytes(inboxMessagesPerUser2.unknownFields());
        }
    };
    public static final Integer DEFAULT_INBOX_TYPE = 0;
    public static final Long DEFAULT_CURSOR = 0L;

    @Override // com.squareup.wire.Message
    public C1CKH newBuilder() {
        C1CKH c1ckh = new C1CKH();
        c1ckh.LIZLLL = this.inbox_type;
        c1ckh.LJ = this.cursor;
        c1ckh.addUnknownFields(unknownFields());
        return c1ckh;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.inbox_type != null) {
            sb.append(", inbox_type=");
            sb.append(this.inbox_type);
        }
        if (this.cursor != null) {
            sb.append(", cursor=");
            sb.append(this.cursor);
        }
        sb.replace(0, 2, "InboxMessagesPerUser{");
        sb.append('}');
        return sb.toString();
    }

    public InboxMessagesPerUser(Integer num, Long l) {
        this(num, l, ByteString.EMPTY);
    }

    public InboxMessagesPerUser(Integer num, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.inbox_type = num;
        this.cursor = l;
    }
}
