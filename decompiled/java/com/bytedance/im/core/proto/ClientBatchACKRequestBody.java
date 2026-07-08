package com.bytedance.im.core.proto;

import X.C09CT;
import X.C1516540pZE;
import X.C2237821CiK;
import com.bytedance.im.core.proto.ClientACKRequestBody;
import com.bytedance.im.core.proto.ClientBatchACKRequestBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class ClientBatchACKRequestBody extends Message<ClientBatchACKRequestBody, C2237821CiK> {
    public static final ProtoAdapter<ClientBatchACKRequestBody> ADAPTER = new ProtoAdapter<ClientBatchACKRequestBody>() { // from class: X.1CiJ
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final ClientBatchACKRequestBody decode(ProtoReader protoReader) {
            C2237821CiK c2237821CiK = new C2237821CiK();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c2237821CiK.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c2237821CiK.LIZLLL.add(ClientACKRequestBody.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2237821CiK.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(ClientBatchACKRequestBody clientBatchACKRequestBody) {
            ClientBatchACKRequestBody clientBatchACKRequestBody2 = clientBatchACKRequestBody;
            return ClientACKRequestBody.ADAPTER.asRepeated().encodedSizeWithTag(1, clientBatchACKRequestBody2.ack_list) + clientBatchACKRequestBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, ClientBatchACKRequestBody clientBatchACKRequestBody) {
            ClientBatchACKRequestBody clientBatchACKRequestBody2 = clientBatchACKRequestBody;
            ClientACKRequestBody.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, clientBatchACKRequestBody2.ack_list);
            protoWriter.writeBytes(clientBatchACKRequestBody2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @C09CT("ack_list")
    public final List<ClientACKRequestBody> ack_list;

    @Override // com.squareup.wire.Message
    public C2237821CiK newBuilder() {
        C2237821CiK c2237821CiK = new C2237821CiK();
        c2237821CiK.LIZLLL = C1516540pZE.LIZJ("ack_list", this.ack_list);
        c2237821CiK.addUnknownFields(unknownFields());
        return c2237821CiK;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<ClientACKRequestBody> list = this.ack_list;
        if (list != null && !list.isEmpty()) {
            sb.append(", ack_list=");
            sb.append(this.ack_list);
        }
        sb.replace(0, 2, "ClientBatchACKRequestBody{");
        sb.append('}');
        return sb.toString();
    }

    public ClientBatchACKRequestBody(List<ClientACKRequestBody> list) {
        this(list, ByteString.EMPTY);
    }

    public ClientBatchACKRequestBody(List<ClientACKRequestBody> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.ack_list = C1516540pZE.LJFF("ack_list", list);
    }
}
