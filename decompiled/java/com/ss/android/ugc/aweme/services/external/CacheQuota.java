package com.ss.android.ugc.aweme.services.external;

import X.C2188811AlT;

/* JADX INFO: loaded from: classes9.dex */
public final class CacheQuota {
    public final String cacheTime;
    public boolean isFromLocal;
    public int quota;
    public int quotaRemain;
    public final String userId;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CacheQuota(quota=");
        sbLIZ.append(this.quota);
        sbLIZ.append(", quotaRemain=");
        sbLIZ.append(this.quotaRemain);
        sbLIZ.append(", cacheTime=");
        sbLIZ.append(this.cacheTime);
        sbLIZ.append(", userId=");
        sbLIZ.append(this.userId);
        sbLIZ.append(", isFromLocal=");
        sbLIZ.append(this.isFromLocal);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean isFromLocal() {
        return this.isFromLocal;
    }

    public final void setFromLocal(boolean z) {
        this.isFromLocal = z;
    }

    public final void setQuota(int i) {
        this.quota = i;
    }

    public final void setQuotaRemain(int i) {
        this.quotaRemain = i;
    }

    public CacheQuota(int i, int i2, String str, String str2, boolean z) {
        this.quota = i;
        this.quotaRemain = i2;
        this.cacheTime = str;
        this.userId = str2;
        this.isFromLocal = z;
    }
}
