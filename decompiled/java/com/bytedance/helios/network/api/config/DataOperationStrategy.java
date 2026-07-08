package com.bytedance.helios.network.api.config;

import X.C08CX;
import X.C09CT;
import X.C2097608Jq;
import X.C2188811AlT;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class DataOperationStrategy {

    @C09CT("delete")
    public final Set<String> delete;

    @C09CT("update")
    public final Map<String, String> update;

    public DataOperationStrategy() {
        this(null, null, 3, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DataOperationStrategy)) {
            return false;
        }
        DataOperationStrategy dataOperationStrategy = (DataOperationStrategy) obj;
        return Intrinsics.LJFF(this.delete, dataOperationStrategy.delete) && Intrinsics.LJFF(this.update, dataOperationStrategy.update);
    }

    public final int hashCode() {
        return (this.delete.hashCode() * 31) + this.update.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DataOperationStrategy(delete=");
        sbLIZ.append(this.delete);
        sbLIZ.append(", update=");
        sbLIZ.append(this.update);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public DataOperationStrategy(Set<String> set, Map<String, String> map) {
        this.delete = set;
        this.update = map;
    }

    public DataOperationStrategy(Set set, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C08CX.INSTANCE : set, (i & 2) != 0 ? C2097608Jq.LJ() : map);
    }
}
