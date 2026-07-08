package com.bytedance.im.core.proto;

import X.C09CT;
import X.C0YVA;
import X.C1516540pZE;
import com.bytedance.im.core.proto.GetMessageInfoByIndexV2ResponseBody;
import com.bytedance.im.core.proto.MessageInfo;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.Map;
import okio.ByteString;

/* JADX INFO: loaded from: classes15.dex */
public final class GetMessageInfoByIndexV2ResponseBody extends Message<GetMessageInfoByIndexV2ResponseBody, C0YVA> {
    public static final ProtoAdapter<GetMessageInfoByIndexV2ResponseBody> ADAPTER = new ProtoAdapter<GetMessageInfoByIndexV2ResponseBody>() { // from class: X.0YV9
        public final ProtoAdapter<Map<Long, MessageInfo>> LIZ;

        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            this.LIZ = ProtoAdapter.newMapAdapter(ProtoAdapter.INT64, MessageInfo.ADAPTER);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final GetMessageInfoByIndexV2ResponseBody decode(ProtoReader protoReader) {
            C0YVA c0yva = new C0YVA();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c0yva.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c0yva.LIZLLL.putAll(this.LIZ.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c0yva.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(GetMessageInfoByIndexV2ResponseBody getMessageInfoByIndexV2ResponseBody) {
            GetMessageInfoByIndexV2ResponseBody getMessageInfoByIndexV2ResponseBody2 = getMessageInfoByIndexV2ResponseBody;
            return this.LIZ.encodedSizeWithTag(1, getMessageInfoByIndexV2ResponseBody2.infos) + getMessageInfoByIndexV2ResponseBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, GetMessageInfoByIndexV2ResponseBody getMessageInfoByIndexV2ResponseBody) {
            GetMessageInfoByIndexV2ResponseBody getMessageInfoByIndexV2ResponseBody2 = getMessageInfoByIndexV2ResponseBody;
            this.LIZ.encodeWithTag(protoWriter, 1, getMessageInfoByIndexV2ResponseBody2.infos);
            protoWriter.writeBytes(getMessageInfoByIndexV2ResponseBody2.unknownFields());
        }
    };
    public static final long serialVersionUID = 0;

    @C09CT("infos")
    public final Map<Long, MessageInfo> infos;

    @Override // com.squareup.wire.Message
    public C0YVA newBuilder() {
        C0YVA c0yva = new C0YVA();
        c0yva.LIZLLL = C1516540pZE.LIZLLL("infos", this.infos);
        c0yva.addUnknownFields(unknownFields());
        return c0yva;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Map<Long, MessageInfo> map = this.infos;
        if (map != null && !map.isEmpty()) {
            sb.append(", infos=");
            sb.append(this.infos);
        }
        sb.replace(0, 2, "GetMessageInfoByIndexV2ResponseBody{");
        sb.append('}');
        return sb.toString();
    }

    public GetMessageInfoByIndexV2ResponseBody(Map<Long, MessageInfo> map) {
        this(map, ByteString.EMPTY);
    }

    public GetMessageInfoByIndexV2ResponseBody(Map<Long, MessageInfo> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.infos = C1516540pZE.LJI("infos", map);
    }
}
