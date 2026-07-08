package com.google.android.play.core.appupdate;

import X.C2188811AlT;

/* JADX INFO: loaded from: classes4.dex */
public final class z extends d {
    public final int LIZ;
    public final boolean LIZIZ;

    public /* synthetic */ z(int i, boolean z) {
        this.LIZ = i;
        this.LIZIZ = z;
    }

    @Override // com.google.android.play.core.appupdate.d
    public final boolean LIZ() {
        return this.LIZIZ;
    }

    @Override // com.google.android.play.core.appupdate.d
    public final int LIZIZ() {
        return this.LIZ;
    }

    public final int hashCode() {
        return ((this.LIZ ^ 1000003) * 1000003) ^ (true != this.LIZIZ ? 1237 : 1231);
    }

    public final String toString() {
        int i = this.LIZ;
        boolean z = this.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AppUpdateOptions{appUpdateType=");
        sbLIZ.append(i);
        sbLIZ.append(", allowAssetPackDeletion=");
        sbLIZ.append(z);
        sbLIZ.append("}");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (this.LIZ == dVar.LIZIZ() && this.LIZIZ == dVar.LIZ()) {
                return true;
            }
        }
        return false;
    }
}
