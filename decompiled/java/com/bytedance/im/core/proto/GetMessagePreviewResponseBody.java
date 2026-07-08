package com.bytedance.im.core.proto;

import X.C09CT;
import X.C0YSP;
import X.C1516540pZE;
import com.bytedance.im.core.proto.GetMessagePreviewResponseBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public final class GetMessagePreviewResponseBody extends Message<GetMessagePreviewResponseBody, C0YSP> {
    public static final ProtoAdapter<GetMessagePreviewResponseBody> ADAPTER = new ProtoAdapter<GetMessagePreviewResponseBody>() { // from class: X.0YSO
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final GetMessagePreviewResponseBody decode(ProtoReader protoReader) {
            C0YSP c0ysp = new C0YSP();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c0ysp.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c0ysp.LIZLLL.add(ProtoAdapter.BYTES.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c0ysp.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(GetMessagePreviewResponseBody getMessagePreviewResponseBody) {
            GetMessagePreviewResponseBody getMessagePreviewResponseBody2 = getMessagePreviewResponseBody;
            return ProtoAdapter.BYTES.asRepeated().encodedSizeWithTag(1, getMessagePreviewResponseBody2.messages_pb) + getMessagePreviewResponseBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, GetMessagePreviewResponseBody getMessagePreviewResponseBody) {
            GetMessagePreviewResponseBody getMessagePreviewResponseBody2 = getMessagePreviewResponseBody;
            ProtoAdapter.BYTES.asRepeated().encodeWithTag(protoWriter, 1, getMessagePreviewResponseBody2.messages_pb);
            protoWriter.writeBytes(getMessagePreviewResponseBody2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @C09CT("messages_pb")
    public final List<ByteString> messages_pb;

    @Override // com.squareup.wire.Message
    public C0YSP newBuilder() {
        C0YSP c0ysp = new C0YSP();
        c0ysp.LIZLLL = C1516540pZE.LIZJ("messages_pb", this.messages_pb);
        c0ysp.addUnknownFields(unknownFields());
        return c0ysp;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<ByteString> list = this.messages_pb;
        if (list != null && !list.isEmpty()) {
            sb.append(", messages_pb=");
            sb.append(this.messages_pb);
        }
        sb.replace(0, 2, "GetMessagePreviewResponseBody{");
        sb.append('}');
        return sb.toString();
    }

    public GetMessagePreviewResponseBody(List<ByteString> list) {
        this(list, ByteString.EMPTY);
    }

    public GetMessagePreviewResponseBody(List<ByteString> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.messages_pb = C1516540pZE.LJFF("messages_pb", list);
    }
}
