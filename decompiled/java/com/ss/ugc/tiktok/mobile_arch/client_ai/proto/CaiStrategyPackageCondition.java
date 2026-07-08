package com.ss.ugc.tiktok.mobile_arch.client_ai.proto;

import X.C1C45;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiStrategyPackageCondition;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class CaiStrategyPackageCondition extends Message<CaiStrategyPackageCondition, C1C45> {
    public static final ProtoAdapter<CaiStrategyPackageCondition> ADAPTER = new ProtoAdapter<CaiStrategyPackageCondition>() { // from class: X.1C44
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final CaiStrategyPackageCondition decode(ProtoReader protoReader) {
            C1C45 c1c45 = new C1C45();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                    c1c45.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                } else {
                                    c1c45.LJI = ProtoAdapter.STRING.decode(protoReader);
                                }
                            } else {
                                c1c45.LJFF = ProtoAdapter.INT32.decode(protoReader);
                            }
                        } else {
                            c1c45.LJ = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c1c45.LIZLLL = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1c45.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(CaiStrategyPackageCondition caiStrategyPackageCondition) {
            CaiStrategyPackageCondition caiStrategyPackageCondition2 = caiStrategyPackageCondition;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            return protoAdapter.encodedSizeWithTag(1, caiStrategyPackageCondition2.ty) + protoAdapter.encodedSizeWithTag(2, caiStrategyPackageCondition2.lhs) + protoAdapter.encodedSizeWithTag(3, caiStrategyPackageCondition2.op) + ProtoAdapter.STRING.encodedSizeWithTag(4, caiStrategyPackageCondition2.rhs) + caiStrategyPackageCondition2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, CaiStrategyPackageCondition caiStrategyPackageCondition) {
            CaiStrategyPackageCondition caiStrategyPackageCondition2 = caiStrategyPackageCondition;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            protoAdapter.encodeWithTag(protoWriter, 1, caiStrategyPackageCondition2.ty);
            protoAdapter.encodeWithTag(protoWriter, 2, caiStrategyPackageCondition2.lhs);
            protoAdapter.encodeWithTag(protoWriter, 3, caiStrategyPackageCondition2.op);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, caiStrategyPackageCondition2.rhs);
            protoWriter.writeBytes(caiStrategyPackageCondition2.unknownFields());
        }
    };

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.REQUIRED, tag = 2)
    public Integer lhs;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.REQUIRED, tag = 3)
    public Integer op;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 4)
    public String rhs;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.REQUIRED, tag = 1)
    public Integer ty;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + this.ty.hashCode()) * 37) + this.lhs.hashCode()) * 37) + this.op.hashCode()) * 37) + this.rhs.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1C45 newBuilder() {
        C1C45 c1c45 = new C1C45();
        c1c45.LIZLLL = this.ty;
        c1c45.LJ = this.lhs;
        c1c45.LJFF = this.op;
        c1c45.LJI = this.rhs;
        c1c45.addUnknownFields(unknownFields());
        return c1c45;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", ty=");
        sb.append(this.ty);
        sb.append(", lhs=");
        sb.append(this.lhs);
        sb.append(", op=");
        sb.append(this.op);
        sb.append(", rhs=");
        sb.append(this.rhs);
        sb.replace(0, 2, "CaiStrategyPackageCondition{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CaiStrategyPackageCondition)) {
            return false;
        }
        CaiStrategyPackageCondition caiStrategyPackageCondition = (CaiStrategyPackageCondition) obj;
        if (unknownFields().equals(caiStrategyPackageCondition.unknownFields()) && this.ty.equals(caiStrategyPackageCondition.ty) && this.lhs.equals(caiStrategyPackageCondition.lhs) && this.op.equals(caiStrategyPackageCondition.op) && this.rhs.equals(caiStrategyPackageCondition.rhs)) {
            return true;
        }
        return false;
    }

    public CaiStrategyPackageCondition(Integer num, Integer num2, Integer num3, String str) {
        this(num, num2, num3, str, ByteString.EMPTY);
    }

    public CaiStrategyPackageCondition(Integer num, Integer num2, Integer num3, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.ty = num;
        this.lhs = num2;
        this.op = num3;
        this.rhs = str;
    }
}
