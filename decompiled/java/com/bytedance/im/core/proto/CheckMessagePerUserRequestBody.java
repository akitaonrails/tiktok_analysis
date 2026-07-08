package com.bytedance.im.core.proto;

import X.C09CT;
import X.C1516540pZE;
import X.C1CKJ;
import com.bytedance.im.core.proto.CheckMessagePerUserRequestBody;
import com.bytedance.im.core.proto.InboxMessagesPerUser;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class CheckMessagePerUserRequestBody extends Message<CheckMessagePerUserRequestBody, C1CKJ> {
    public static final ProtoAdapter<CheckMessagePerUserRequestBody> ADAPTER = new ProtoAdapter<CheckMessagePerUserRequestBody>() { // from class: X.1CKI
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final CheckMessagePerUserRequestBody decode(ProtoReader protoReader) {
            C1CKJ c1ckj = new C1CKJ();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c1ckj.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c1ckj.LIZLLL.add(InboxMessagesPerUser.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1ckj.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(CheckMessagePerUserRequestBody checkMessagePerUserRequestBody) {
            CheckMessagePerUserRequestBody checkMessagePerUserRequestBody2 = checkMessagePerUserRequestBody;
            return InboxMessagesPerUser.ADAPTER.asRepeated().encodedSizeWithTag(1, checkMessagePerUserRequestBody2.checks) + checkMessagePerUserRequestBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, CheckMessagePerUserRequestBody checkMessagePerUserRequestBody) {
            CheckMessagePerUserRequestBody checkMessagePerUserRequestBody2 = checkMessagePerUserRequestBody;
            InboxMessagesPerUser.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, checkMessagePerUserRequestBody2.checks);
            protoWriter.writeBytes(checkMessagePerUserRequestBody2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @C09CT("checks")
    public final List<InboxMessagesPerUser> checks;

    @Override // com.squareup.wire.Message
    public C1CKJ newBuilder() {
        C1CKJ c1ckj = new C1CKJ();
        c1ckj.LIZLLL = C1516540pZE.LIZJ("checks", this.checks);
        c1ckj.addUnknownFields(unknownFields());
        return c1ckj;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<InboxMessagesPerUser> list = this.checks;
        if (list != null && !list.isEmpty()) {
            sb.append(", checks=");
            sb.append(this.checks);
        }
        sb.replace(0, 2, "CheckMessagePerUserRequestBody{");
        sb.append('}');
        return sb.toString();
    }

    public CheckMessagePerUserRequestBody(List<InboxMessagesPerUser> list) {
        this(list, ByteString.EMPTY);
    }

    public CheckMessagePerUserRequestBody(List<InboxMessagesPerUser> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.checks = C1516540pZE.LJFF("checks", list);
    }
}
