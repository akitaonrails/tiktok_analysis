package com.ss.ttlivestreamer.core.mixer;

import com.ss.ttlivestreamer.core.engine.NativeObject;
import com.ss.ttlivestreamer.core.utils.TEBundle;

/* JADX INFO: loaded from: classes21.dex */
public abstract class Mixer extends NativeObject {
    private native boolean nativeEnable();

    private native int nativeGetOriginTrackIndex();

    private native int[] nativeGetTracks();

    private native boolean nativeRemoveTrack(int i);

    private native void nativeSetEnable(boolean z);

    private native void nativeSetOriginTrackIndex(int i);

    public abstract boolean getParameter(TEBundle tEBundle);

    public abstract boolean isAudioMixer();

    public boolean isEnable(int i) {
        return false;
    }

    public boolean isNativeMixer() {
        return false;
    }

    public native int nativeCreateTrack(Object obj);

    public native Object nativeGetDescription(int i);

    public native void nativeUpdateDescription(int i, Object obj);

    public void setEnable(int i, boolean z) {
    }

    public abstract boolean setParameter(TEBundle tEBundle);

    public boolean enable() {
        return nativeEnable();
    }

    public int getOriginTrackIndex() {
        return nativeGetOriginTrackIndex();
    }

    public int[] getTracks() {
        return nativeGetTracks();
    }

    public void removeTrack(int i) {
        nativeRemoveTrack(i);
    }

    public void setEnable(boolean z) {
        nativeSetEnable(z);
    }

    public void setOriginTrackIndex(int i) {
        nativeSetOriginTrackIndex(i);
    }
}
