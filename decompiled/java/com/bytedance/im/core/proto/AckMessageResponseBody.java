package com.bytedance.im.core.proto;

import X.C09CT;
import X.C2226331CBr;
import com.bytedance.im.core.proto.AckMessageResponseBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class AckMessageResponseBody extends Message<AckMessageResponseBody, C2226331CBr> {
    public static final ProtoAdapter<AckMessageResponseBody> ADAPTER = new ProtoAdapter<AckMessageResponseBody>() { // from class: X.1CBq
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final AckMessageResponseBody decode(ProtoReader protoReader) {
            C2226331CBr c2226331CBr = new C2226331CBr();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c2226331CBr.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c2226331CBr.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2226331CBr.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(AckMessageResponseBody ackMessageResponseBody) {
            AckMessageResponseBody ackMessageResponseBody2 = ackMessageResponseBody;
            return ProtoAdapter.INT64.encodedSizeWithTag(1, ackMessageResponseBody2.backend_e2e_latency) + ackMessageResponseBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, AckMessageResponseBody ackMessageResponseBody) {
            AckMessageResponseBody ackMessageResponseBody2 = ackMessageResponseBody;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, ackMessageResponseBody2.backend_e2e_latency);
            protoWriter.writeBytes(ackMessageResponseBody2.unknownFields());
        }
    };
    public static final Long DEFAULT_BACKEND_E2E_LATENCY = 0L;
    public static final long serialVersionUID = 0;

    @C09CT("backend_e2e_latency")
    public final Long backend_e2e_latency;

    @Override // com.squareup.wire.Message
    public C2226331CBr newBuilder() {
        C2226331CBr c2226331CBr = new C2226331CBr();
        c2226331CBr.LIZLLL = this.backend_e2e_latency;
        c2226331CBr.addUnknownFields(unknownFields());
        return c2226331CBr;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.backend_e2e_latency != null) {
            sb.append(", backend_e2e_latency=");
            sb.append(this.backend_e2e_latency);
        }
        sb.replace(0, 2, "AckMessageResponseBody{");
        sb.append('}');
        return sb.toString();
    }

    public AckMessageResponseBody(Long l) {
        this(l, ByteString.EMPTY);
    }

    public AckMessageResponseBody(Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.backend_e2e_latency = l;
    }
}
