package com.ss.android.ugc.aweme.utils.gecko;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes3.dex */
public final class GeckoDownloadStrategy {

    @C09CT("availableStorageFull")
    public final int availableStorageFull = 200;

    @C09CT("availableStoragePatch")
    public final int availableStoragePatch = 200;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GeckoDownloadStrategy(availableStorageFull=");
        sbLIZ.append(this.availableStorageFull);
        sbLIZ.append(", availableStoragePatch=");
        sbLIZ.append(this.availableStoragePatch);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int getAvailableStorageFull() {
        return this.availableStorageFull;
    }

    public final int getAvailableStoragePatch() {
        return this.availableStoragePatch;
    }
}
