package com.bytedance.im.core.proto;

import X.C09CT;
import X.C1516540pZE;
import X.C2226411CBz;
import com.bytedance.im.core.proto.Config;
import com.bytedance.im.core.proto.GetConfigsResponseBody;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class GetConfigsResponseBody extends Message<GetConfigsResponseBody, C2226411CBz> {
    public static final ProtoAdapter<GetConfigsResponseBody> ADAPTER = new ProtoAdapter<GetConfigsResponseBody>() { // from class: X.1CBy
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final GetConfigsResponseBody decode(ProtoReader protoReader) {
            C2226411CBz c2226411CBz = new C2226411CBz();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2226411CBz.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            c2226411CBz.LJ.add(Config.ADAPTER.decode(protoReader));
                        }
                    } else {
                        c2226411CBz.LIZLLL = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2226411CBz.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(GetConfigsResponseBody getConfigsResponseBody) {
            GetConfigsResponseBody getConfigsResponseBody2 = getConfigsResponseBody;
            return ProtoAdapter.INT32.encodedSizeWithTag(1, getConfigsResponseBody2.version) + Config.ADAPTER.asRepeated().encodedSizeWithTag(2, getConfigsResponseBody2.configs) + getConfigsResponseBody2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, GetConfigsResponseBody getConfigsResponseBody) {
            GetConfigsResponseBody getConfigsResponseBody2 = getConfigsResponseBody;
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, getConfigsResponseBody2.version);
            Config.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, getConfigsResponseBody2.configs);
            protoWriter.writeBytes(getConfigsResponseBody2.unknownFields());
        }
    };
    public static final Integer DEFAULT_VERSION = 0;
    public static final long serialVersionUID = 0;

    @C09CT("configs")
    public final List<Config> configs;

    @C09CT("version")
    public final Integer version;

    @Override // com.squareup.wire.Message
    public C2226411CBz newBuilder() {
        C2226411CBz c2226411CBz = new C2226411CBz();
        c2226411CBz.LIZLLL = this.version;
        c2226411CBz.LJ = C1516540pZE.LIZJ("configs", this.configs);
        c2226411CBz.addUnknownFields(unknownFields());
        return c2226411CBz;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.version != null) {
            sb.append(", version=");
            sb.append(this.version);
        }
        List<Config> list = this.configs;
        if (list != null && !list.isEmpty()) {
            sb.append(", configs=");
            sb.append(this.configs);
        }
        sb.replace(0, 2, "GetConfigsResponseBody{");
        sb.append('}');
        return sb.toString();
    }

    public GetConfigsResponseBody(Integer num, List<Config> list) {
        this(num, list, ByteString.EMPTY);
    }

    public GetConfigsResponseBody(Integer num, List<Config> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.version = num;
        this.configs = C1516540pZE.LJFF("configs", list);
    }
}
