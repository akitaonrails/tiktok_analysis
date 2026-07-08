package com.ss.android.ugc.aweme.launcher.service.crashsdk;

import android.app.Application;
import android.content.Context;

/* JADX INFO: loaded from: classes14.dex */
public interface ICrashSdkApi {
    void LJIIZILJ(Context context);

    void LJIJ();

    void LJIJI();

    Application.ActivityLifecycleCallbacks LJIJJ();

    void ensureNotReachHere(Throwable th, String str);
}
