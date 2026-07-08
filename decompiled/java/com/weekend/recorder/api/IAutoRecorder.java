package com.weekend.recorder.api;

import X.InterfaceC2263861DjE;
import X.InterfaceC2263871DjF;
import android.app.Application;
import android.content.Context;

/* JADX INFO: loaded from: classes36.dex */
public interface IAutoRecorder {
    boolean getWeekEndRecorderSwitch(Context context);

    void init(String str, String str2, Application application, InterfaceC2263871DjF interfaceC2263871DjF, InterfaceC2263861DjE interfaceC2263861DjE);

    void setUserEmailPrefix(String str);

    void switchEnable(Context context, boolean z);
}
