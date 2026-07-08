package com.google.android.play.core.appupdate;

import X.C786410Ut5;
import android.content.Context;

/* JADX INFO: loaded from: classes36.dex */
public final class c {
    public static b LIZ(Context context) {
        a0 a0Var;
        synchronized (f.class) {
            if (f.LIZ == null) {
                Context contextN3 = C786410Ut5.N3(context);
                if (contextN3 != null) {
                    context = contextN3;
                }
                f.LIZ = new a0(new l(context));
            }
            a0Var = f.LIZ;
        }
        return (b) a0Var.LIZ.zza();
    }
}
