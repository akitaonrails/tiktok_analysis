package com.ss.android.ugc.aweme.persistence.model;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class AIGCWorkflowCentralRegistryPersistenceItem {

    @C09CT("key")
    public final String key;

    @C09CT("value")
    public final String value;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AIGCWorkflowCentralRegistryPersistenceItem)) {
            return false;
        }
        AIGCWorkflowCentralRegistryPersistenceItem aIGCWorkflowCentralRegistryPersistenceItem = (AIGCWorkflowCentralRegistryPersistenceItem) obj;
        return Intrinsics.LJFF(this.key, aIGCWorkflowCentralRegistryPersistenceItem.key) && Intrinsics.LJFF(this.value, aIGCWorkflowCentralRegistryPersistenceItem.value);
    }

    public final int hashCode() {
        return (this.key.hashCode() * 31) + this.value.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIGCWorkflowCentralRegistryPersistenceItem(key=");
        sbLIZ.append(this.key);
        sbLIZ.append(", value=");
        sbLIZ.append(this.value);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AIGCWorkflowCentralRegistryPersistenceItem() {
        this("", "");
    }

    public AIGCWorkflowCentralRegistryPersistenceItem(String str, String str2) {
        this.key = str;
        this.value = str2;
    }
}
