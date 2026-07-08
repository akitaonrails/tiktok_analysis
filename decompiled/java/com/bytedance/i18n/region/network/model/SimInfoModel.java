package com.bytedance.i18n.region.network.model;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class SimInfoModel {

    @C09CT("net_op")
    public final String netOp;

    @C09CT("net_op_name")
    public final String netOpName;

    @C09CT("is_roaming")
    public final boolean roaming;

    @C09CT("sim_op")
    public final String simOp;

    @C09CT("sim_op_name")
    public final String simOpName;

    @C09CT("types")
    public final List<String> types;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SimInfoModel)) {
            return false;
        }
        SimInfoModel simInfoModel = (SimInfoModel) obj;
        return Intrinsics.LJFF(this.simOp, simInfoModel.simOp) && Intrinsics.LJFF(this.netOp, simInfoModel.netOp) && Intrinsics.LJFF(this.simOpName, simInfoModel.simOpName) && Intrinsics.LJFF(this.netOpName, simInfoModel.netOpName) && this.roaming == simInfoModel.roaming && Intrinsics.LJFF(this.types, simInfoModel.types);
    }

    public final int hashCode() {
        return (((((((((this.simOp.hashCode() * 31) + this.netOp.hashCode()) * 31) + this.simOpName.hashCode()) * 31) + this.netOpName.hashCode()) * 31) + C786410Ut5.Z2(this.roaming)) * 31) + this.types.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SimInfoModel(simOp=");
        sbLIZ.append(this.simOp);
        sbLIZ.append(", netOp=");
        sbLIZ.append(this.netOp);
        sbLIZ.append(", simOpName=");
        sbLIZ.append(this.simOpName);
        sbLIZ.append(", netOpName=");
        sbLIZ.append(this.netOpName);
        sbLIZ.append(", roaming=");
        sbLIZ.append(this.roaming);
        sbLIZ.append(", types=");
        sbLIZ.append(this.types);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SimInfoModel(String str, String str2, String str3, String str4, boolean z, List<String> list) {
        this.simOp = str;
        this.netOp = str2;
        this.simOpName = str3;
        this.netOpName = str4;
        this.roaming = z;
        this.types = list;
    }
}
