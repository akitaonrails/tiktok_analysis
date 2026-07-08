package com.google.android.play.core.appupdate;

import X.C1BZB;
import android.content.Context;

/* JADX INFO: loaded from: classes36.dex */
public final class h implements C1BZB {
    public final C1BZB LIZ;

    public h(n nVar) {
        this.LIZ = nVar;
    }

    @Override // X.C1BZB
    public final Object zza() {
        Context context = ((n) this.LIZ).LIZ.LIZ;
        if (context != null) {
            return new g(context);
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
