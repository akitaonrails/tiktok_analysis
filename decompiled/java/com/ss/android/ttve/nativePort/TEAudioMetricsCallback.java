package com.ss.android.ttve.nativePort;

import X.InterfaceC1407610mjX;

/* JADX INFO: loaded from: classes23.dex */
public class TEAudioMetricsCallback {
    public InterfaceC1407610mjX listener;

    public void setListener(Object obj) {
        this.listener = (InterfaceC1407610mjX) obj;
    }

    public static boolean onProgressChanged(Object obj, int i, float f, String str) {
        TEAudioMetricsCallback tEAudioMetricsCallback;
        InterfaceC1407610mjX interfaceC1407610mjX;
        if ((obj instanceof TEAudioMetricsCallback) && (tEAudioMetricsCallback = (TEAudioMetricsCallback) obj) != null && (interfaceC1407610mjX = tEAudioMetricsCallback.listener) != null) {
            interfaceC1407610mjX.LIZ(str, i);
            return false;
        }
        return false;
    }
}
