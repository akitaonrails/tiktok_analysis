package com.google.android.play.core.appupdate;

import X.C1BZB;

/* JADX INFO: loaded from: classes35.dex */
public final class m implements C1BZB {
    public final C1BZB LIZ;

    public m(C1BZB c1bzb) {
        this.LIZ = c1bzb;
    }

    @Override // X.C1BZB
    public final Object zza() {
        Object objZza = this.LIZ.zza();
        if (objZza != null) {
            return objZza;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
