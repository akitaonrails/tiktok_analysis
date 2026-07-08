package com.google.android.play.core.appupdate;

import X.C1BZB;
import android.content.Context;

/* JADX INFO: loaded from: classes36.dex */
public final class v implements C1BZB {
    public final C1BZB LIZ;
    public final C1BZB LIZIZ;

    public v(n nVar, C1BZB c1bzb) {
        this.LIZ = nVar;
        this.LIZIZ = c1bzb;
    }

    @Override // X.C1BZB
    public final Object zza() {
        Context context = ((n) this.LIZ).LIZ.LIZ;
        if (context != null) {
            return new u(context, (w) this.LIZIZ.zza());
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
