package com.bytedance.im.core.proto;

import X.C09CT;
import X.C1516540pZE;
import X.C1C4F;
import X.EnumC19363010pA;
import com.bytedance.im.core.proto.MsgTrace;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.Map;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class MsgTrace extends Message<MsgTrace, C1C4F> {
    public static final ProtoAdapter<MsgTrace> ADAPTER = new ProtoAdapter<MsgTrace>() { // from class: X.1C4E
        public final ProtoAdapter<Map<Integer, Long>> LIZ;

        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            this.LIZ = ProtoAdapter.newMapAdapter(ProtoAdapter.INT32, ProtoAdapter.INT64);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final MsgTrace decode(ProtoReader protoReader) {
            C1C4F c1c4f = new C1C4F();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c1c4f.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        } else {
                            try {
                                c1c4f.LJ = EnumC19363010pA.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                TryCatchGuardChecker.doCheck(e);
                                c1c4f.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        }
                    } else {
                        c1c4f.LIZLLL.putAll(this.LIZ.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1c4f.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(MsgTrace msgTrace) {
            MsgTrace msgTrace2 = msgTrace;
            return this.LIZ.encodedSizeWithTag(1, msgTrace2.metrics) + EnumC19363010pA.ADAPTER.encodedSizeWithTag(2, msgTrace2.path) + msgTrace2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, MsgTrace msgTrace) {
            MsgTrace msgTrace2 = msgTrace;
            this.LIZ.encodeWithTag(protoWriter, 1, msgTrace2.metrics);
            EnumC19363010pA.ADAPTER.encodeWithTag(protoWriter, 2, msgTrace2.path);
            protoWriter.writeBytes(msgTrace2.unknownFields());
        }
    };
    public static final EnumC19363010pA DEFAULT_PATH = EnumC19363010pA.FROM_UNKNOWN;
    public static final long serialVersionUID = 0;

    @C09CT("metrics")
    public final Map<Integer, Long> metrics;

    @C09CT("path")
    public final EnumC19363010pA path;

    @Override // com.squareup.wire.Message
    public C1C4F newBuilder() {
        C1C4F c1c4f = new C1C4F();
        c1c4f.LIZLLL = C1516540pZE.LIZLLL("metrics", this.metrics);
        c1c4f.LJ = this.path;
        c1c4f.addUnknownFields(unknownFields());
        return c1c4f;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Map<Integer, Long> map = this.metrics;
        if (map != null && !map.isEmpty()) {
            sb.append(", metrics=");
            sb.append(this.metrics);
        }
        if (this.path != null) {
            sb.append(", path=");
            sb.append(this.path);
        }
        sb.replace(0, 2, "MsgTrace{");
        sb.append('}');
        return sb.toString();
    }

    public MsgTrace(Map<Integer, Long> map, EnumC19363010pA enumC19363010pA) {
        this(map, enumC19363010pA, ByteString.EMPTY);
    }

    public MsgTrace(Map<Integer, Long> map, EnumC19363010pA enumC19363010pA, ByteString byteString) {
        super(ADAPTER, byteString);
        this.metrics = C1516540pZE.LJI("metrics", map);
        this.path = enumC19363010pA;
    }
}
