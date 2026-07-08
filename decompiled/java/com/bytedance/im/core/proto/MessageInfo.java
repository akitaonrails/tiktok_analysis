package com.bytedance.im.core.proto;

import X.C09CT;
import X.C0YQP;
import X.C0YUT;
import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.im.core.proto.MessageInfo;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public final class MessageInfo extends Message<MessageInfo, C0YQP> {
    public static final ProtoAdapter<MessageInfo> ADAPTER = new ProtoAdapter<MessageInfo>() { // from class: X.0YQO
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final MessageInfo decode(ProtoReader protoReader) {
            C0YQP c0yqp = new C0YQP();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c0yqp.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c0yqp.LJ = MessageBody.ADAPTER.decode(protoReader);
                        }
                    } else {
                        try {
                            c0yqp.LIZLLL = C0YUT.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            TryCatchGuardChecker.doCheck(e);
                            c0yqp.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c0yqp.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(MessageInfo messageInfo) {
            MessageInfo messageInfo2 = messageInfo;
            return C0YUT.ADAPTER.encodedSizeWithTag(1, messageInfo2.status) + MessageBody.ADAPTER.encodedSizeWithTag(2, messageInfo2.body) + messageInfo2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, MessageInfo messageInfo) {
            MessageInfo messageInfo2 = messageInfo;
            C0YUT.ADAPTER.encodeWithTag(protoWriter, 1, messageInfo2.status);
            MessageBody.ADAPTER.encodeWithTag(protoWriter, 2, messageInfo2.body);
            protoWriter.writeBytes(messageInfo2.unknownFields());
        }
    };
    public static final C0YUT DEFAULT_STATUS = C0YUT.AVAILABLE;
    public static final long serialVersionUID = 0;

    @C09CT("body")
    public final MessageBody body;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final C0YUT status;

    @Override // com.squareup.wire.Message
    public C0YQP newBuilder() {
        C0YQP c0yqp = new C0YQP();
        c0yqp.LIZLLL = this.status;
        c0yqp.LJ = this.body;
        c0yqp.addUnknownFields(unknownFields());
        return c0yqp;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.status != null) {
            sb.append(", status=");
            sb.append(this.status);
        }
        if (this.body != null) {
            sb.append(", body=");
            sb.append(this.body);
        }
        sb.replace(0, 2, "MessageInfo{");
        sb.append('}');
        return sb.toString();
    }

    public MessageInfo(C0YUT c0yut, MessageBody messageBody) {
        this(c0yut, messageBody, ByteString.EMPTY);
    }

    public MessageInfo(C0YUT c0yut, MessageBody messageBody, ByteString byteString) {
        super(ADAPTER, byteString);
        this.status = c0yut;
        this.body = messageBody;
    }
}
