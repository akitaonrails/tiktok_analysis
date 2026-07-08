package com.google.android.play.core.appupdate;

import X.C1BZB;
import android.content.Context;

/* JADX INFO: loaded from: classes36.dex */
public final class n implements C1BZB {
    public final l LIZ;

    public n(l lVar) {
        this.LIZ = lVar;
    }

    @Override // X.C1BZB
    public final Object zza() {
        Context context = this.LIZ.LIZ;
        if (context != null) {
            return context;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
