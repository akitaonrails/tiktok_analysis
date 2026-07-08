package com.lynx.canvas.callback;

import X.InterfaceC1303920k2I;

/* JADX INFO: loaded from: classes21.dex */
public class RenderFrameCallbackWrapper implements InterfaceC1303920k2I {
    public final InterfaceC1303920k2I LIZ;

    public RenderFrameCallbackWrapper(InterfaceC1303920k2I interfaceC1303920k2I) {
        this.LIZ = interfaceC1303920k2I;
    }

    @Override // X.InterfaceC1303920k2I
    public void onFrameRender(String str, long j, long j2) {
        this.LIZ.onFrameRender(str, j, j2);
    }
}
