package com.ss.android.vesdk.runtime;

import com.ss.android.ttve.nativePort.TENativeLibsLoader;
import com.ss.android.vesdk.VEVideoEncodeSettings;

/* JADX INFO: loaded from: classes36.dex */
public class VEPublishSettingManager {
    public static final /* synthetic */ int LIZIZ = 0;
    public VEVideoEncodeSettings LIZ;

    private native int nativeGetEnableRemuxErrorCode();

    private native boolean nativeIsCanRemuxVideo();

    private native boolean nativeIsUseFilterProcess();

    private native int nativeSetEditorStatus(long j);

    private native int nativeSetVideoEncodeSettings(VEVideoEncodeSettings vEVideoEncodeSettings, long j);

    private native void nativeUpdateVideoEncodeSettings();

    public final VEVideoEncodeSettings LJ() {
        this.LIZ.setEnableRemuxVideo(nativeIsCanRemuxVideo());
        nativeUpdateVideoEncodeSettings();
        return this.LIZ;
    }

    public final int LIZ() {
        return nativeGetEnableRemuxErrorCode();
    }

    public final boolean LIZIZ() {
        return nativeIsCanRemuxVideo();
    }

    public final boolean LIZJ() {
        return nativeIsUseFilterProcess();
    }

    static {
        TENativeLibsLoader.loadLibrary();
    }

    public final void LIZLLL(VEVideoEncodeSettings vEVideoEncodeSettings, long j) {
        if (nativeSetVideoEncodeSettings(vEVideoEncodeSettings, j) != 0) {
            return;
        }
        this.LIZ = vEVideoEncodeSettings;
    }
}
