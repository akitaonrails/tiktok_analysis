package com.bytedance.ies.sdk.widgets.dependence;

import X.C2188811AlT;
import com.bytedance.ies.sdk.widgets.dependence.Constraint;

/* JADX INFO: loaded from: classes18.dex */
public class Barrier extends Constraint {
    @Override // com.bytedance.ies.sdk.widgets.dependence.Constraint
    public boolean isBarrier() {
        return true;
    }

    @Override // com.bytedance.ies.sdk.widgets.dependence.Constraint
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Barrier{");
        sbLIZ.append(this.mType);
        sbLIZ.append("#");
        sbLIZ.append(this.ownerName);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public Barrier(int i) {
        super(i);
    }

    public Barrier(int i, String str) {
        super(i, str);
    }

    public Barrier(int i, String str, Constraint.Type type) {
        super(i, str, type);
    }
}
