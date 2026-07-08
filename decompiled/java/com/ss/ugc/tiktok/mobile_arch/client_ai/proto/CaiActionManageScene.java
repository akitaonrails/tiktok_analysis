package com.ss.ugc.tiktok.mobile_arch.client_ai.proto;

import X.C1516540pZE;
import X.C2223031BzZ;
import X.C2223051Bzb;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiActionManageScene;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class CaiActionManageScene extends Message<CaiActionManageScene, C2223051Bzb> {
    public static final ProtoAdapter<CaiActionManageScene> ADAPTER = new ProtoAdapter<CaiActionManageScene>() { // from class: X.1Bza
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final CaiActionManageScene decode(ProtoReader protoReader) {
            C2223051Bzb c2223051Bzb = new C2223051Bzb();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c2223051Bzb.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c2223051Bzb.LIZLLL = CaiActionManageScene.StrategyOperation.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2223051Bzb.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(CaiActionManageScene caiActionManageScene) {
            CaiActionManageScene caiActionManageScene2 = caiActionManageScene;
            return CaiActionManageScene.StrategyOperation.ADAPTER.encodedSizeWithTag(1, caiActionManageScene2.strategy_operation) + caiActionManageScene2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, CaiActionManageScene caiActionManageScene) {
            CaiActionManageScene caiActionManageScene2 = caiActionManageScene;
            CaiActionManageScene.StrategyOperation.ADAPTER.encodeWithTag(protoWriter, 1, caiActionManageScene2.strategy_operation);
            protoWriter.writeBytes(caiActionManageScene2.unknownFields());
        }
    };

    @WireField(adapter = "com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiActionManageScene$StrategyOperation#ADAPTER", tag = 1)
    public StrategyOperation strategy_operation;

    public static final class StrategyOperation extends Message<StrategyOperation, C2223031BzZ> {
        public static final ProtoAdapter<StrategyOperation> ADAPTER = new ProtoAdapter<StrategyOperation>() { // from class: X.1BzY
            {
                FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final CaiActionManageScene.StrategyOperation decode(ProtoReader protoReader) {
                C2223031BzZ c2223031BzZ = new C2223031BzZ();
                long jBeginMessage = protoReader.beginMessage();
                while (true) {
                    int iNextTag = protoReader.nextTag();
                    if (iNextTag != -1) {
                        if (iNextTag != 1) {
                            if (iNextTag != 2) {
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c2223031BzZ.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                c2223031BzZ.LJ = ProtoAdapter.INT32.decode(protoReader);
                            }
                        } else {
                            c2223031BzZ.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        protoReader.endMessage(jBeginMessage);
                        return c2223031BzZ.build();
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(CaiActionManageScene.StrategyOperation strategyOperation) {
                CaiActionManageScene.StrategyOperation strategyOperation2 = strategyOperation;
                return ProtoAdapter.STRING.encodedSizeWithTag(1, strategyOperation2.strategy_key) + ProtoAdapter.INT32.encodedSizeWithTag(2, strategyOperation2.operator) + strategyOperation2.unknownFields().size();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, CaiActionManageScene.StrategyOperation strategyOperation) {
                CaiActionManageScene.StrategyOperation strategyOperation2 = strategyOperation;
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, strategyOperation2.strategy_key);
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, strategyOperation2.operator);
                protoWriter.writeBytes(strategyOperation2.unknownFields());
            }
        };

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.REQUIRED, tag = 2)
        public Integer operator;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
        public String strategy_key;

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = (((unknownFields().hashCode() * 37) + this.strategy_key.hashCode()) * 37) + this.operator.hashCode();
            this.hashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.squareup.wire.Message
        public C2223031BzZ newBuilder() {
            C2223031BzZ c2223031BzZ = new C2223031BzZ();
            c2223031BzZ.LIZLLL = this.strategy_key;
            c2223031BzZ.LJ = this.operator;
            c2223031BzZ.addUnknownFields(unknownFields());
            return c2223031BzZ;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(", strategy_key=");
            sb.append(this.strategy_key);
            sb.append(", operator=");
            sb.append(this.operator);
            sb.replace(0, 2, "StrategyOperation{");
            sb.append('}');
            return sb.toString();
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof StrategyOperation)) {
                return false;
            }
            StrategyOperation strategyOperation = (StrategyOperation) obj;
            if (unknownFields().equals(strategyOperation.unknownFields()) && this.strategy_key.equals(strategyOperation.strategy_key) && this.operator.equals(strategyOperation.operator)) {
                return true;
            }
            return false;
        }

        public StrategyOperation(String str, Integer num) {
            this(str, num, ByteString.EMPTY);
        }

        public StrategyOperation(String str, Integer num, ByteString byteString) {
            super(ADAPTER, byteString);
            this.strategy_key = str;
            this.operator = num;
        }
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        StrategyOperation strategyOperation = this.strategy_operation;
        int iHashCode2 = iHashCode + (strategyOperation != null ? strategyOperation.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public C2223051Bzb newBuilder() {
        C2223051Bzb c2223051Bzb = new C2223051Bzb();
        c2223051Bzb.LIZLLL = this.strategy_operation;
        c2223051Bzb.addUnknownFields(unknownFields());
        return c2223051Bzb;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.strategy_operation != null) {
            sb.append(", strategy_operation=");
            sb.append(this.strategy_operation);
        }
        sb.replace(0, 2, "CaiActionManageScene{");
        sb.append('}');
        return sb.toString();
    }

    public CaiActionManageScene(StrategyOperation strategyOperation) {
        this(strategyOperation, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CaiActionManageScene)) {
            return false;
        }
        CaiActionManageScene caiActionManageScene = (CaiActionManageScene) obj;
        if (unknownFields().equals(caiActionManageScene.unknownFields()) && C1516540pZE.LJ(this.strategy_operation, caiActionManageScene.strategy_operation)) {
            return true;
        }
        return false;
    }

    public CaiActionManageScene(StrategyOperation strategyOperation, ByteString byteString) {
        super(ADAPTER, byteString);
        this.strategy_operation = strategyOperation;
    }
}
