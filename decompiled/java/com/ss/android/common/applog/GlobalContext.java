package com.ss.android.common.applog;

import android.content.Context;

/* JADX INFO: loaded from: classes11.dex */
public final class GlobalContext {
    public static final GlobalContext INSTANCE = new GlobalContext();
    public static Context context;

    public static /* synthetic */ void getContext$annotations() {
    }

    public static final Context getContext() {
        return context;
    }

    public static final void setContext(Context context2) {
        context = context2;
    }
}
