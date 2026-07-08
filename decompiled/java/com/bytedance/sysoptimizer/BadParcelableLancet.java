package com.bytedance.sysoptimizer;

import X.C2110908Ot;
import android.content.Context;
import android.os.Bundle;

/* JADX INFO: loaded from: classes14.dex */
public class BadParcelableLancet {
    public Bundle getBundleExtra(String str) {
        int i = C2110908Ot.LIZ;
        Bundle bundle = (Bundle) new Object();
        Context context = BadParcelableCrashOptimizer.getContext();
        if (context != null) {
            bundle.setClassLoader(context.getClassLoader());
        }
        return bundle;
    }
}
