package com.bytedance.im.core.proto;

import X.C09CT;
import X.C1516540pZE;
import X.C1CSW;
import com.bytedance.im.core.proto.BroadcastUserCounterResponseBody;
import com.bytedance.im.core.proto.BroadcastUserInfo;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class BroadcastUserCounterResponseBody extends Message<BroadcastUserCounterResponseBody, C1CSW> {
    public static final ProtoAdapter<BroadcastUserCounterResponseBody> ADAPTER = new ProtoAdapter<BroadcastUserCounterResponseBody>() { // from class: X.1CSV
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final BroadcastUserCounterResponseBody decode(ProtoReader protoReader) {
            C1CSW c1csw = new C1CSW();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c1csw.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c1csw.LIZLLL.add(BroadcastUserInfo.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1csw.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(BroadcastUserCounterResponseBody broadcastUserCounterResponseBody) {
            BroadcastUserCounterResponseBody broadcastUserCounterResponseBody2 = broadcastUserCounterResponseBody;
            return BroadcastUserInfo.ADAPTER.asRepeated().encodedSizeWithTag(1, broadcastUserCounterResponseBody2.infos) + broadcastUserCounterResponseBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, BroadcastUserCounterResponseBody broadcastUserCounterResponseBody) {
            BroadcastUserCounterResponseBody broadcastUserCounterResponseBody2 = broadcastUserCounterResponseBody;
            BroadcastUserInfo.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, broadcastUserCounterResponseBody2.infos);
            protoWriter.writeBytes(broadcastUserCounterResponseBody2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @C09CT("infos")
    public final List<BroadcastUserInfo> infos;

    @Override // com.squareup.wire.Message
    public C1CSW newBuilder() {
        C1CSW c1csw = new C1CSW();
        c1csw.LIZLLL = C1516540pZE.LIZJ("infos", this.infos);
        c1csw.addUnknownFields(unknownFields());
        return c1csw;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        List<BroadcastUserInfo> list = this.infos;
        if (list != null && !list.isEmpty()) {
            sb.append(", infos=");
            sb.append(this.infos);
        }
        sb.replace(0, 2, "BroadcastUserCounterResponseBody{");
        sb.append('}');
        return sb.toString();
    }

    public BroadcastUserCounterResponseBody(List<BroadcastUserInfo> list) {
        this(list, ByteString.EMPTY);
    }

    public BroadcastUserCounterResponseBody(List<BroadcastUserInfo> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.infos = C1516540pZE.LJFF("infos", list);
    }
}
