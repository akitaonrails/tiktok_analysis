package com.lynx.tasm.utils;

import X.C786410Ut5;
import android.content.Context;
import com.lynx.tasm.LynxEnv;

/* JADX INFO: loaded from: classes21.dex */
public class EnvUtils {
    public static String getCacheDir() {
        Context appContext = LynxEnv.inst().getAppContext();
        return appContext != null ? C786410Ut5.w2(appContext).getAbsolutePath() : "";
    }
}
