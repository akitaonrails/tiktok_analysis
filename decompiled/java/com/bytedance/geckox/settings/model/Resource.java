package com.bytedance.geckox.settings.model;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes24.dex */
public final class Resource {

    @C09CT("ak")
    public final String accessKey;

    @C09CT("update")
    public boolean checkUpdate;

    @C09CT("lazy")
    public boolean isLazy;

    @C09CT("c")
    public final String name;

    @C09CT("o")
    public final Operation operation = Operation.PULL;

    @C09CT("p")
    public Priority priority;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Resource(accessKey=");
        sbLIZ.append(this.accessKey);
        sbLIZ.append(", name=");
        sbLIZ.append(this.name);
        sbLIZ.append(", isLazy=");
        sbLIZ.append(this.isLazy);
        sbLIZ.append(", priority=");
        sbLIZ.append(this.priority);
        sbLIZ.append(", checkUpdate=");
        sbLIZ.append(this.checkUpdate);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final Operation getOperation() {
        Operation operation = this.operation;
        return operation == null ? Operation.PULL : operation;
    }

    public int hashCode() {
        String str = this.accessKey;
        int iHashCode = str != null ? str.hashCode() : 0;
        String str2 = this.name;
        return str2 != null ? (iHashCode * 31) + str2.hashCode() : iHashCode;
    }

    public final boolean isLazy() {
        return this.isLazy;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        Class<?> cls = null;
        if (obj != null) {
            cls = obj.getClass();
        }
        if (!Intrinsics.LJFF(Resource.class, cls) || !(obj instanceof Resource) || obj == null) {
            return false;
        }
        Resource resource = (Resource) obj;
        if (Intrinsics.LJFF(this.accessKey, resource.accessKey) && Intrinsics.LJFF(this.name, resource.name)) {
            return true;
        }
        return false;
    }

    public final void setCheckUpdate(boolean z) {
        this.checkUpdate = z;
    }

    public final void setLazy(boolean z) {
        this.isLazy = z;
    }

    public final void setPriority(Priority priority) {
        this.priority = priority;
    }

    public Resource(String str, String str2, boolean z, Priority priority, boolean z2) {
        this.accessKey = str;
        this.name = str2;
        this.isLazy = z;
        this.priority = priority;
        this.checkUpdate = z2;
    }
}
