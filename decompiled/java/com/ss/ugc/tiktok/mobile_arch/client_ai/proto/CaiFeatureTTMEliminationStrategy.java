package com.ss.ugc.tiktok.mobile_arch.client_ai.proto;

import X.C1516540pZE;
import X.C1516670pZR;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiFeatureTTMEliminationStrategy;
import okio.ByteString;

/* JADX INFO: loaded from: classes24.dex */
public final class CaiFeatureTTMEliminationStrategy extends Message<CaiFeatureTTMEliminationStrategy, C1516670pZR> {
    public static final ProtoAdapter<CaiFeatureTTMEliminationStrategy> ADAPTER = new ProtoAdapter<CaiFeatureTTMEliminationStrategy>() { // from class: X.0pZQ
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final CaiFeatureTTMEliminationStrategy decode(ProtoReader protoReader) {
            C1516670pZR c1516670pZR = new C1516670pZR();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                    c1516670pZR.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                } else {
                                    c1516670pZR.LJI = ProtoAdapter.BOOL.decode(protoReader);
                                }
                            } else {
                                c1516670pZR.LJFF = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c1516670pZR.LJ = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c1516670pZR.LIZLLL = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1516670pZR.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(CaiFeatureTTMEliminationStrategy caiFeatureTTMEliminationStrategy) {
            CaiFeatureTTMEliminationStrategy caiFeatureTTMEliminationStrategy2 = caiFeatureTTMEliminationStrategy;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            return protoAdapter.encodedSizeWithTag(1, caiFeatureTTMEliminationStrategy2.last_n) + protoAdapter.encodedSizeWithTag(2, caiFeatureTTMEliminationStrategy2.last_time) + ProtoAdapter.STRING.encodedSizeWithTag(3, caiFeatureTTMEliminationStrategy2.elimination_name) + ProtoAdapter.BOOL.encodedSizeWithTag(4, caiFeatureTTMEliminationStrategy2.nature_day) + caiFeatureTTMEliminationStrategy2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, CaiFeatureTTMEliminationStrategy caiFeatureTTMEliminationStrategy) {
            CaiFeatureTTMEliminationStrategy caiFeatureTTMEliminationStrategy2 = caiFeatureTTMEliminationStrategy;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            protoAdapter.encodeWithTag(protoWriter, 1, caiFeatureTTMEliminationStrategy2.last_n);
            protoAdapter.encodeWithTag(protoWriter, 2, caiFeatureTTMEliminationStrategy2.last_time);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, caiFeatureTTMEliminationStrategy2.elimination_name);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 4, caiFeatureTTMEliminationStrategy2.nature_day);
            protoWriter.writeBytes(caiFeatureTTMEliminationStrategy2.unknownFields());
        }
    };

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public String elimination_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public Integer last_n;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public Integer last_time;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 4)
    public Boolean nature_day;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Integer num = this.last_n;
        int iHashCode2 = (iHashCode + (num != null ? num.hashCode() : 0)) * 37;
        Integer num2 = this.last_time;
        int iHashCode3 = (iHashCode2 + (num2 != null ? num2.hashCode() : 0)) * 37;
        String str = this.elimination_name;
        int iHashCode4 = (iHashCode3 + (str != null ? str.hashCode() : 0)) * 37;
        Boolean bool = this.nature_day;
        int iHashCode5 = iHashCode4 + (bool != null ? bool.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.Message
    public C1516670pZR newBuilder() {
        C1516670pZR c1516670pZR = new C1516670pZR();
        c1516670pZR.LIZLLL = this.last_n;
        c1516670pZR.LJ = this.last_time;
        c1516670pZR.LJFF = this.elimination_name;
        c1516670pZR.LJI = this.nature_day;
        c1516670pZR.addUnknownFields(unknownFields());
        return c1516670pZR;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.last_n != null) {
            sb.append(", last_n=");
            sb.append(this.last_n);
        }
        if (this.last_time != null) {
            sb.append(", last_time=");
            sb.append(this.last_time);
        }
        if (this.elimination_name != null) {
            sb.append(", elimination_name=");
            sb.append(this.elimination_name);
        }
        if (this.nature_day != null) {
            sb.append(", nature_day=");
            sb.append(this.nature_day);
        }
        sb.replace(0, 2, "CaiFeatureTTMEliminationStrategy{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CaiFeatureTTMEliminationStrategy)) {
            return false;
        }
        CaiFeatureTTMEliminationStrategy caiFeatureTTMEliminationStrategy = (CaiFeatureTTMEliminationStrategy) obj;
        if (unknownFields().equals(caiFeatureTTMEliminationStrategy.unknownFields()) && C1516540pZE.LJ(this.last_n, caiFeatureTTMEliminationStrategy.last_n) && C1516540pZE.LJ(this.last_time, caiFeatureTTMEliminationStrategy.last_time) && C1516540pZE.LJ(this.elimination_name, caiFeatureTTMEliminationStrategy.elimination_name) && C1516540pZE.LJ(this.nature_day, caiFeatureTTMEliminationStrategy.nature_day)) {
            return true;
        }
        return false;
    }

    public CaiFeatureTTMEliminationStrategy(Integer num, Integer num2, String str, Boolean bool) {
        this(num, num2, str, bool, ByteString.EMPTY);
    }

    public CaiFeatureTTMEliminationStrategy(Integer num, Integer num2, String str, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.last_n = num;
        this.last_time = num2;
        this.elimination_name = str;
        this.nature_day = bool;
    }
}
