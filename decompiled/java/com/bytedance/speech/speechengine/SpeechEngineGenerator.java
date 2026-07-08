package com.bytedance.speech.speechengine;

import X.C1741960vQo;
import X.C1BWJ;
import android.content.Context;

/* JADX INFO: loaded from: classes35.dex */
public class SpeechEngineGenerator {
    public static synchronized SpeechEngine getInstance() {
        return new C1BWJ();
    }

    public static synchronized boolean isEngineSupported(String str) {
        C1741960vQo c1741960vQo = C1BWJ.LJIIJJI;
        return SpeechEngineLoader.getInstance().createBridge().isEngineSupportedToNative(str);
    }

    public static synchronized void initMonitor(Context context, String str, String str2, String str3, String str4, String str5, String str6) {
        initMonitor(context, str, str2, str3, str4, str5, str6, "");
    }

    public static synchronized void initMonitor(Context context, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        if (C1BWJ.LJ() == null) {
            C1741960vQo c1741960vQo = new C1741960vQo();
            c1741960vQo.LIZIZ(context, str, str2, SpeechEngineLoader.getInstance().createBridge().getVersionToNative(), str3, str4, str5, str6, str7);
            C1BWJ.LIZIZ(c1741960vQo);
        }
    }
}
