package com.bytedance.helios.network.api.consumer;

import X.C2188811AlT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class OperateHistory {
    public String operator;
    public List<OperatePairs> pairs;
    public String target;

    public OperateHistory() {
        this("", "", null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OperateHistory)) {
            return false;
        }
        OperateHistory operateHistory = (OperateHistory) obj;
        return Intrinsics.LJFF(this.operator, operateHistory.operator) && Intrinsics.LJFF(this.target, operateHistory.target) && Intrinsics.LJFF(this.pairs, operateHistory.pairs);
    }

    public int hashCode() {
        int iHashCode = ((this.operator.hashCode() * 31) + this.target.hashCode()) * 31;
        List<OperatePairs> list = this.pairs;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OperateHistory(operator=");
        sbLIZ.append(this.operator);
        sbLIZ.append(", target=");
        sbLIZ.append(this.target);
        sbLIZ.append(", pairs=");
        sbLIZ.append(this.pairs);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void setOperator(String str) {
        this.operator = str;
    }

    public final void setPairs(List<OperatePairs> list) {
        this.pairs = list;
    }

    public final void setTarget(String str) {
        this.target = str;
    }

    public OperateHistory(String str, String str2, List<OperatePairs> list) {
        this.operator = str;
        this.target = str2;
        this.pairs = list;
    }
}
