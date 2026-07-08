package com.ss.android.ugc.aweme.notice.repo.list.bean;

import java.util.Objects;

/* JADX INFO: loaded from: classes20.dex */
public class MusNotice extends BaseNotice {
    public transient long generatedUniqueId;
    public transient long hackedUniqueId;
    public boolean isCache;
    public final transient boolean isMock;

    public MusNotice() {
        this(false, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final long getGeneratedUniqueId() {
        /*
            r5 = this;
            long r1 = r5.generatedUniqueId
            r3 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L1c
            java.lang.String r0 = r5.nid
            if (r0 == 0) goto L1f
            java.lang.Long r0 = X.C2095008Iq.LJIILIIL(r0)
            if (r0 == 0) goto L1f
            long r1 = r0.longValue()
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L1f
        L1a:
            r5.generatedUniqueId = r1
        L1c:
            long r0 = r5.generatedUniqueId
            return r0
        L1f:
            int r0 = r5.hashCode()
            long r1 = (long) r0
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice.getGeneratedUniqueId():long");
    }

    public final long getUniqueId() {
        long j = this.hackedUniqueId;
        return j <= 0 ? getGeneratedUniqueId() : j;
    }

    @Override // com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice
    /* JADX INFO: renamed from: clone */
    public MusNotice mo291clone() {
        MusNotice musNotice = (MusNotice) super.mo291clone();
        musNotice.isCache = this.isCache;
        return musNotice;
    }

    public final boolean isCache() {
        return this.isCache;
    }

    public final boolean isMock() {
        return this.isMock;
    }

    @Override // com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof MusNotice) && Objects.equals(Boolean.valueOf(this.isCache), Boolean.valueOf(((MusNotice) obj).isCache)) && super.equals(obj)) {
            return true;
        }
        return false;
    }

    public final void hackUniqueId(long j) {
        this.hackedUniqueId = j;
    }

    public final void setCache(boolean z) {
        this.isCache = z;
    }

    public MusNotice(boolean z, boolean z2) {
        this.isMock = z;
        this.isCache = z2;
    }
}
