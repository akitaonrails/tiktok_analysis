package com.ss.ugc.tiktok.mobile_arch.client_ai.proto;

import X.C1516540pZE;
import X.C1C43;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiStrategyPackageCondition;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiStrategyPackageConditionGroup;
import java.util.List;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class CaiStrategyPackageConditionGroup extends Message<CaiStrategyPackageConditionGroup, C1C43> {
    public static final ProtoAdapter<CaiStrategyPackageConditionGroup> ADAPTER = new ProtoAdapter<CaiStrategyPackageConditionGroup>() { // from class: X.1C42
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final CaiStrategyPackageConditionGroup decode(ProtoReader protoReader) {
            C1C43 c1c43 = new C1C43();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        c1c43.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        c1c43.LIZLLL.add(CaiStrategyPackageCondition.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1c43.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(CaiStrategyPackageConditionGroup caiStrategyPackageConditionGroup) {
            CaiStrategyPackageConditionGroup caiStrategyPackageConditionGroup2 = caiStrategyPackageConditionGroup;
            return CaiStrategyPackageCondition.ADAPTER.asRepeated().encodedSizeWithTag(1, caiStrategyPackageConditionGroup2.conditions) + caiStrategyPackageConditionGroup2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, CaiStrategyPackageConditionGroup caiStrategyPackageConditionGroup) {
            CaiStrategyPackageConditionGroup caiStrategyPackageConditionGroup2 = caiStrategyPackageConditionGroup;
            CaiStrategyPackageCondition.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, caiStrategyPackageConditionGroup2.conditions);
            protoWriter.writeBytes(caiStrategyPackageConditionGroup2.unknownFields());
        }
    };

    @WireField(adapter = "com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiStrategyPackageCondition#ADAPTER", label = WireField.Label.REPEATED, tag = 1)
    public List<CaiStrategyPackageCondition> conditions;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.conditions.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public C1C43 newBuilder() {
        C1C43 c1c43 = new C1C43();
        c1c43.LIZLLL = C1516540pZE.LIZJ("conditions", this.conditions);
        c1c43.addUnknownFields(unknownFields());
        return c1c43;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.conditions.isEmpty()) {
            sb.append(", conditions=");
            sb.append(this.conditions);
        }
        sb.replace(0, 2, "CaiStrategyPackageConditionGroup{");
        sb.append('}');
        return sb.toString();
    }

    public CaiStrategyPackageConditionGroup(List<CaiStrategyPackageCondition> list) {
        this(list, ByteString.EMPTY);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CaiStrategyPackageConditionGroup)) {
            return false;
        }
        CaiStrategyPackageConditionGroup caiStrategyPackageConditionGroup = (CaiStrategyPackageConditionGroup) obj;
        if (unknownFields().equals(caiStrategyPackageConditionGroup.unknownFields()) && this.conditions.equals(caiStrategyPackageConditionGroup.conditions)) {
            return true;
        }
        return false;
    }

    public CaiStrategyPackageConditionGroup(List<CaiStrategyPackageCondition> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.conditions = C1516540pZE.LJFF("conditions", list);
    }
}
