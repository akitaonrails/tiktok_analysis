package com.ss.android.vesdk;

import X.C1DOP;

/* JADX INFO: loaded from: classes36.dex */
public class VELensCallBacks {
    public volatile C1DOP mLensStateListener;

    public void setmLensStateListener(Object obj) {
        this.mLensStateListener = (C1DOP) obj;
    }

    public static boolean onAlgorithmProcess(Object obj, int i) {
        if (obj instanceof VELensCallBacks) {
            VELensCallBacks vELensCallBacks = (VELensCallBacks) obj;
            if (vELensCallBacks.mLensStateListener != null && vELensCallBacks.mLensStateListener.getState()) {
                return true;
            }
            return false;
        }
        return false;
    }
}
