package com.bytedance.im.core.proto;

import X.C09CT;
import X.C1516540pZE;
import X.C1CK5;
import X.EnumC19379510rp;
import com.bytedance.im.core.proto.ClientMetric;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.Map;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class ClientMetric extends Message<ClientMetric, C1CK5> {
    public static final ProtoAdapter<ClientMetric> ADAPTER = new ProtoAdapter<ClientMetric>() { // from class: X.1CK4
        public final ProtoAdapter<Map<String, String>> LIZ;

        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.LIZ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final ClientMetric decode(ProtoReader protoReader) {
            C1CK5 c1ck5 = new C1CK5();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                    c1ck5.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                } else {
                                    c1ck5.LJI.putAll(this.LIZ.decode(protoReader));
                                }
                            } else {
                                c1ck5.LJFF = ProtoAdapter.INT64.decode(protoReader);
                            }
                        } else {
                            c1ck5.LJ = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        try {
                            c1ck5.LIZLLL = EnumC19379510rp.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            TryCatchGuardChecker.doCheck(e);
                            c1ck5.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1ck5.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(ClientMetric clientMetric) {
            ClientMetric clientMetric2 = clientMetric;
            return EnumC19379510rp.ADAPTER.encodedSizeWithTag(1, clientMetric2.metric_type) + ProtoAdapter.STRING.encodedSizeWithTag(2, clientMetric2.k) + ProtoAdapter.INT64.encodedSizeWithTag(3, clientMetric2.v) + this.LIZ.encodedSizeWithTag(4, clientMetric2.tags) + clientMetric2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, ClientMetric clientMetric) {
            ClientMetric clientMetric2 = clientMetric;
            EnumC19379510rp.ADAPTER.encodeWithTag(protoWriter, 1, clientMetric2.metric_type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, clientMetric2.k);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, clientMetric2.v);
            this.LIZ.encodeWithTag(protoWriter, 4, clientMetric2.tags);
            protoWriter.writeBytes(clientMetric2.unknownFields());
        }
    };
    public static final EnumC19379510rp DEFAULT_METRIC_TYPE = EnumC19379510rp.COUNTER;
    public static final Long DEFAULT_V = 0L;
    public static final long serialVersionUID = 0;

    @C09CT("k")
    public final String k;

    @C09CT("metric_type")
    public final EnumC19379510rp metric_type;

    @C09CT("tags")
    public final Map<String, String> tags;

    @C09CT("v")
    public final Long v;

    @Override // com.squareup.wire.Message
    public C1CK5 newBuilder() {
        C1CK5 c1ck5 = new C1CK5();
        c1ck5.LIZLLL = this.metric_type;
        c1ck5.LJ = this.k;
        c1ck5.LJFF = this.v;
        c1ck5.LJI = C1516540pZE.LIZLLL("tags", this.tags);
        c1ck5.addUnknownFields(unknownFields());
        return c1ck5;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.metric_type != null) {
            sb.append(", metric_type=");
            sb.append(this.metric_type);
        }
        if (this.k != null) {
            sb.append(", k=");
            sb.append(this.k);
        }
        if (this.v != null) {
            sb.append(", v=");
            sb.append(this.v);
        }
        Map<String, String> map = this.tags;
        if (map != null && !map.isEmpty()) {
            sb.append(", tags=");
            sb.append(this.tags);
        }
        sb.replace(0, 2, "ClientMetric{");
        sb.append('}');
        return sb.toString();
    }

    public ClientMetric(EnumC19379510rp enumC19379510rp, String str, Long l, Map<String, String> map) {
        this(enumC19379510rp, str, l, map, ByteString.EMPTY);
    }

    public ClientMetric(EnumC19379510rp enumC19379510rp, String str, Long l, Map<String, String> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.metric_type = enumC19379510rp;
        this.k = str;
        this.v = l;
        this.tags = C1516540pZE.LJI("tags", map);
    }
}
