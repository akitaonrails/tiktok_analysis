package com.ss.android.ugc.effectmanager.common.utils;

import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Looper;

/* JADX INFO: loaded from: classes4.dex */
public final class Preconditions {
    public static void checkUiThread() {
        Thread threadU3 = C786410Ut5.u3();
        if (Looper.getMainLooper().getThread() == threadU3) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Method cannot be called off the main application thread (on: ");
        sbLIZ.append(threadU3.getName());
        sbLIZ.append(")");
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static <T> T checkNotNull(T t) {
        if (t != null) {
            return t;
        }
        throw null;
    }

    public static void checkState(boolean z) {
        if (z) {
        } else {
            throw new IllegalStateException();
        }
    }

    public static <T> T checkNotNull(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }
}
