package com.ss.ugc.tiktok.mobile_arch.client_ai.proto;

import X.C1516540pZE;
import X.C1C0B;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiAction;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiEventStream;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiStrategy;
import java.util.List;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class CaiStrategy extends Message<CaiStrategy, C1C0B> {
    public static final ProtoAdapter<CaiStrategy> ADAPTER = new ProtoAdapter<CaiStrategy>() { // from class: X.1C0A
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final CaiStrategy decode(ProtoReader protoReader) {
            C1C0B c1c0b = new C1C0B();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    if (iNextTag != 5) {
                                        if (iNextTag != 255) {
                                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                            c1c0b.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                        } else {
                                            c1c0b.LJIIIIZZ = ProtoAdapter.INT32.decode(protoReader);
                                        }
                                    } else {
                                        c1c0b.LJII.add(CaiAction.ADAPTER.decode(protoReader));
                                    }
                                } else {
                                    c1c0b.LJI = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c1c0b.LJFF.add(CaiEventStream.ADAPTER.decode(protoReader));
                            }
                        } else {
                            c1c0b.LJ = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c1c0b.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1c0b.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(CaiStrategy caiStrategy) {
            CaiStrategy caiStrategy2 = caiStrategy;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, caiStrategy2.key) + protoAdapter.encodedSizeWithTag(2, caiStrategy2.strategy_package) + CaiEventStream.ADAPTER.asRepeated().encodedSizeWithTag(3, caiStrategy2.streams) + protoAdapter.encodedSizeWithTag(4, caiStrategy2.description) + CaiAction.ADAPTER.asRepeated().encodedSizeWithTag(5, caiStrategy2.actions) + ProtoAdapter.INT32.encodedSizeWithTag(255, caiStrategy2.unstable_subtype) + caiStrategy2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, CaiStrategy caiStrategy) {
            CaiStrategy caiStrategy2 = caiStrategy;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, caiStrategy2.key);
            protoAdapter.encodeWithTag(protoWriter, 2, caiStrategy2.strategy_package);
            CaiEventStream.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, caiStrategy2.streams);
            protoAdapter.encodeWithTag(protoWriter, 4, caiStrategy2.description);
            CaiAction.ADAPTER.asRepeated().encodeWithTag(protoWriter, 5, caiStrategy2.actions);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 255, caiStrategy2.unstable_subtype);
            protoWriter.writeBytes(caiStrategy2.unknownFields());
        }
    };

    @WireField(adapter = "com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiAction#ADAPTER", label = WireField.Label.REPEATED, tag = 5)
    public List<CaiAction> actions;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public String description;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public String key;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 2)
    public String strategy_package;

    @WireField(adapter = "com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiEventStream#ADAPTER", label = WireField.Label.REPEATED, tag = 3)
    public List<CaiEventStream> streams;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 255)
    public Integer unstable_subtype;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((unknownFields().hashCode() * 37) + this.key.hashCode()) * 37) + this.strategy_package.hashCode()) * 37) + this.streams.hashCode()) * 37;
        String str = this.description;
        int iHashCode2 = (((iHashCode + (str != null ? str.hashCode() : 0)) * 37) + this.actions.hashCode()) * 37;
        Integer num = this.unstable_subtype;
        int iHashCode3 = iHashCode2 + (num != null ? num.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public C1C0B newBuilder() {
        C1C0B c1c0b = new C1C0B();
        c1c0b.LIZLLL = this.key;
        c1c0b.LJ = this.strategy_package;
        c1c0b.LJFF = C1516540pZE.LIZJ("streams", this.streams);
        c1c0b.LJI = this.description;
        c1c0b.LJII = C1516540pZE.LIZJ("actions", this.actions);
        c1c0b.LJIIIIZZ = this.unstable_subtype;
        c1c0b.addUnknownFields(unknownFields());
        return c1c0b;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", key=");
        sb.append(this.key);
        sb.append(", strategy_package=");
        sb.append(this.strategy_package);
        if (!this.streams.isEmpty()) {
            sb.append(", streams=");
            sb.append(this.streams);
        }
        if (this.description != null) {
            sb.append(", description=");
            sb.append(this.description);
        }
        if (!this.actions.isEmpty()) {
            sb.append(", actions=");
            sb.append(this.actions);
        }
        if (this.unstable_subtype != null) {
            sb.append(", unstable_subtype=");
            sb.append(this.unstable_subtype);
        }
        sb.replace(0, 2, "CaiStrategy{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CaiStrategy)) {
            return false;
        }
        CaiStrategy caiStrategy = (CaiStrategy) obj;
        if (unknownFields().equals(caiStrategy.unknownFields()) && this.key.equals(caiStrategy.key) && this.strategy_package.equals(caiStrategy.strategy_package) && this.streams.equals(caiStrategy.streams) && C1516540pZE.LJ(this.description, caiStrategy.description) && this.actions.equals(caiStrategy.actions) && C1516540pZE.LJ(this.unstable_subtype, caiStrategy.unstable_subtype)) {
            return true;
        }
        return false;
    }

    public CaiStrategy(String str, String str2, List<CaiEventStream> list, String str3, List<CaiAction> list2, Integer num) {
        this(str, str2, list, str3, list2, num, ByteString.EMPTY);
    }

    public CaiStrategy(String str, String str2, List<CaiEventStream> list, String str3, List<CaiAction> list2, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.key = str;
        this.strategy_package = str2;
        this.streams = C1516540pZE.LJFF("streams", list);
        this.description = str3;
        this.actions = C1516540pZE.LJFF("actions", list2);
        this.unstable_subtype = num;
    }
}
