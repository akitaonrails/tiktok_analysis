package com.google.android.play.core.appupdate;

import X.C1BZB;
import android.content.Context;

/* JADX INFO: loaded from: classes36.dex */
public final class k implements C1BZB {
    public final C1BZB LIZ;
    public final C1BZB LIZIZ;
    public final C1BZB LIZJ;

    public k(C1BZB c1bzb, C1BZB c1bzb2, n nVar) {
        this.LIZ = c1bzb;
        this.LIZIZ = c1bzb2;
        this.LIZJ = nVar;
    }

    @Override // X.C1BZB
    public final Object zza() {
        Object objZza = this.LIZ.zza();
        g gVar = (g) this.LIZIZ.zza();
        Context context = ((n) this.LIZJ).LIZ.LIZ;
        if (context != null) {
            return new j((u) objZza, gVar, context);
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
