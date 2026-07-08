package com.ss.ugc.tiktok.mobile_arch.client_ai.proto;

import X.C1516540pZE;
import X.C1C47;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiAction;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiStrategyPackageBind;
import com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiStrategyPackageConditionGroup;
import java.util.List;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class CaiStrategyPackageBind extends Message<CaiStrategyPackageBind, C1C47> {
    public static final ProtoAdapter<CaiStrategyPackageBind> ADAPTER = new ProtoAdapter<CaiStrategyPackageBind>() { // from class: X.1C46
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final CaiStrategyPackageBind decode(ProtoReader protoReader) {
            C1C47 c1c47 = new C1C47();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    if (iNextTag != 5) {
                                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                        c1c47.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                    } else {
                                        c1c47.LJII = ProtoAdapter.STRING.decode(protoReader);
                                    }
                                } else {
                                    c1c47.LJI.add(CaiAction.ADAPTER.decode(protoReader));
                                }
                            } else {
                                c1c47.LJFF.add(ProtoAdapter.STRING.decode(protoReader));
                            }
                        } else {
                            c1c47.LJ.add(CaiStrategyPackageConditionGroup.ADAPTER.decode(protoReader));
                        }
                    } else {
                        c1c47.LIZLLL = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1c47.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(CaiStrategyPackageBind caiStrategyPackageBind) {
            CaiStrategyPackageBind caiStrategyPackageBind2 = caiStrategyPackageBind;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, caiStrategyPackageBind2.package_id) + CaiStrategyPackageConditionGroup.ADAPTER.asRepeated().encodedSizeWithTag(2, caiStrategyPackageBind2.groups) + protoAdapter.asRepeated().encodedSizeWithTag(3, caiStrategyPackageBind2.allowed_did) + CaiAction.ADAPTER.asRepeated().encodedSizeWithTag(4, caiStrategyPackageBind2.action) + protoAdapter.encodedSizeWithTag(5, caiStrategyPackageBind2.libra_params) + caiStrategyPackageBind2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, CaiStrategyPackageBind caiStrategyPackageBind) {
            CaiStrategyPackageBind caiStrategyPackageBind2 = caiStrategyPackageBind;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, caiStrategyPackageBind2.package_id);
            CaiStrategyPackageConditionGroup.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, caiStrategyPackageBind2.groups);
            protoAdapter.asRepeated().encodeWithTag(protoWriter, 3, caiStrategyPackageBind2.allowed_did);
            CaiAction.ADAPTER.asRepeated().encodeWithTag(protoWriter, 4, caiStrategyPackageBind2.action);
            protoAdapter.encodeWithTag(protoWriter, 5, caiStrategyPackageBind2.libra_params);
            protoWriter.writeBytes(caiStrategyPackageBind2.unknownFields());
        }
    };

    @WireField(adapter = "com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiAction#ADAPTER", label = WireField.Label.REPEATED, tag = 4)
    public List<CaiAction> action;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REPEATED, tag = 3)
    public List<String> allowed_did;

    @WireField(adapter = "com.ss.ugc.tiktok.mobile_arch.client_ai.proto.CaiStrategyPackageConditionGroup#ADAPTER", label = WireField.Label.REPEATED, tag = 2)
    public List<CaiStrategyPackageConditionGroup> groups;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 5)
    public String libra_params;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, tag = 1)
    public String package_id;

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((unknownFields().hashCode() * 37) + this.package_id.hashCode()) * 37) + this.groups.hashCode()) * 37) + this.allowed_did.hashCode()) * 37) + this.action.hashCode()) * 37;
        String str = this.libra_params;
        int iHashCode2 = iHashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public C1C47 newBuilder() {
        C1C47 c1c47 = new C1C47();
        c1c47.LIZLLL = this.package_id;
        c1c47.LJ = C1516540pZE.LIZJ("groups", this.groups);
        c1c47.LJFF = C1516540pZE.LIZJ("allowed_did", this.allowed_did);
        c1c47.LJI = C1516540pZE.LIZJ("action", this.action);
        c1c47.LJII = this.libra_params;
        c1c47.addUnknownFields(unknownFields());
        return c1c47;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", package_id=");
        sb.append(this.package_id);
        if (!this.groups.isEmpty()) {
            sb.append(", groups=");
            sb.append(this.groups);
        }
        if (!this.allowed_did.isEmpty()) {
            sb.append(", allowed_did=");
            sb.append(this.allowed_did);
        }
        if (!this.action.isEmpty()) {
            sb.append(", action=");
            sb.append(this.action);
        }
        if (this.libra_params != null) {
            sb.append(", libra_params=");
            sb.append(this.libra_params);
        }
        sb.replace(0, 2, "CaiStrategyPackageBind{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CaiStrategyPackageBind)) {
            return false;
        }
        CaiStrategyPackageBind caiStrategyPackageBind = (CaiStrategyPackageBind) obj;
        if (unknownFields().equals(caiStrategyPackageBind.unknownFields()) && this.package_id.equals(caiStrategyPackageBind.package_id) && this.groups.equals(caiStrategyPackageBind.groups) && this.allowed_did.equals(caiStrategyPackageBind.allowed_did) && this.action.equals(caiStrategyPackageBind.action) && C1516540pZE.LJ(this.libra_params, caiStrategyPackageBind.libra_params)) {
            return true;
        }
        return false;
    }

    public CaiStrategyPackageBind(String str, List<CaiStrategyPackageConditionGroup> list, List<String> list2, List<CaiAction> list3, String str2) {
        this(str, list, list2, list3, str2, ByteString.EMPTY);
    }

    public CaiStrategyPackageBind(String str, List<CaiStrategyPackageConditionGroup> list, List<String> list2, List<CaiAction> list3, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.package_id = str;
        this.groups = C1516540pZE.LJFF("groups", list);
        this.allowed_did = C1516540pZE.LJFF("allowed_did", list2);
        this.action = C1516540pZE.LJFF("action", list3);
        this.libra_params = str2;
    }
}
