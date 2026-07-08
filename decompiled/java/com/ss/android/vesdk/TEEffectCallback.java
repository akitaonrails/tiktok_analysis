package com.ss.android.vesdk;

import com.ss.android.vesdk.VEListener;

/* JADX INFO: loaded from: classes36.dex */
public class TEEffectCallback {
    public VEListener.VEEditorEffectListener listener;

    public void setListener(Object obj) {
        this.listener = (VEListener.VEEditorEffectListener) obj;
    }

    public void onDone(int i, boolean z) {
        this.listener.LIZ();
    }
}
