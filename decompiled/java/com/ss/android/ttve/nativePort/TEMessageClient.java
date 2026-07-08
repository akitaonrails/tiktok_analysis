package com.ss.android.ttve.nativePort;

import X.InterfaceC2185751AgX;

/* JADX INFO: loaded from: classes36.dex */
public class TEMessageClient {
    public InterfaceC2185751AgX mOnErrorListener;
    public InterfaceC2185751AgX mOnInfoListener;

    public InterfaceC2185751AgX getErrorListener() {
        return this.mOnErrorListener;
    }

    public InterfaceC2185751AgX getInfoListener() {
        return this.mOnInfoListener;
    }

    public void setErrorListener(InterfaceC2185751AgX interfaceC2185751AgX) {
        this.mOnErrorListener = interfaceC2185751AgX;
    }

    public void setInfoListener(InterfaceC2185751AgX interfaceC2185751AgX) {
        this.mOnInfoListener = interfaceC2185751AgX;
    }

    public void nativeCallback_onInfoListener(int i, int i2, float f) {
        InterfaceC2185751AgX interfaceC2185751AgX = this.mOnInfoListener;
        if (interfaceC2185751AgX != null) {
            interfaceC2185751AgX.onCallback(i, i2, f, null);
        }
    }

    public void nativeCallback_onErrorListener(int i, int i2, float f, String str) {
        InterfaceC2185751AgX interfaceC2185751AgX = this.mOnErrorListener;
        if (interfaceC2185751AgX != null) {
            interfaceC2185751AgX.onCallback(i, i2, f, str);
        }
    }
}
