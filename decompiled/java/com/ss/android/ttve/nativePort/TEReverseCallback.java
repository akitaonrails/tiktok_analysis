package com.ss.android.ttve.nativePort;

import X.C1DOH;

/* JADX INFO: loaded from: classes36.dex */
public class TEReverseCallback {
    public C1DOH listener;

    public void onProgressChanged(double d) {
        C1DOH c1doh = this.listener;
        if (c1doh != null) {
            c1doh.LIZ(d);
        }
    }

    public void setListener(Object obj) {
        this.listener = (C1DOH) obj;
    }
}
