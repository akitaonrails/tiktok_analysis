package com.ss.android.ttve.nativePort;

import X.C1DIT;
import X.C2188811AlT;
import X.C2254321DLi;
import X.C2254411DLr;
import X.C2484209oO;
import X.InterfaceC2254431DLt;
import android.graphics.Bitmap;
import android.view.Surface;
import com.ss.android.ttvecamera.TECameraFrameSetting;
import com.ss.android.vesdk.VECameraFrameTime;
import com.ss.android.vesdk.VEConfigCenter;
import com.ss.android.vesdk.model.VERecordPerformanceData;
import com.ss.android.vesdk.runtime.VERuntime;
import com.ss.android.vesdk.utils.TEMemMonitor;

/* JADX INFO: loaded from: classes36.dex */
public class TERecorderInterface extends TENativeServiceBase {
    public long LIZ;
    public final InterfaceC2254431DLt LIZIZ;
    public C2254411DLr LIZJ;

    private native void forceVEPermanceRunOnceNow(long j, boolean z);

    private native int nativeAlignTo(long j, int i, int i2, int i3, int i4);

    private native int nativeChangeRenderSize(long j);

    private native int nativeChangeVideoOutputSize(long j, int i, int i2);

    private native int nativeClearAllFrags(long j, boolean z);

    private native void nativeClearDisplayColor(long j, float f, float f2, float f3, float f4);

    private native long nativeCreate(boolean z);

    private native boolean nativeDelayJNIOnLoad();

    private native int nativeDeleteFrag(long j, int i);

    private native int nativeDeleteLastFrag(long j, boolean z);

    private native int nativeEnableEngineMonitorReport(long j, boolean z);

    private native long nativeGetAuxCameraClient(long j);

    private native boolean nativeGetBool(long j, String str);

    private native int nativeGetBundle(long j, String str, long j2);

    private native long nativeGetCameraClient(long j);

    private native VECameraFrameTime nativeGetCameraFrameTime(long j);

    private native double nativeGetDouble(long j, String str);

    private native long nativeGetEffectInterface(long j);

    private native float nativeGetFloat(long j, String str);

    private native int nativeGetInt(long j, String str);

    private native VERecordPerformanceData nativeGetLastPerformanceData(long j);

    private native int nativeGetPreviewFrame(long j, long j2, int i);

    private native int nativeGetPreviewFrameWithBitmap(long j, Bitmap bitmap);

    private native long nativeGetSecondaryCameraClient(long j);

    private native String nativeGetString(long j, String str);

    private native String[] nativeGetStringArray(long j, String str);

    private native long nativeGetVideoDataClient(long j);

    private native int nativeInit(long j);

    private native boolean nativeIsRecording(long j);

    private native void nativeNotifyFollowShotSurfaceChanged(long j, Surface surface, int i, int i2, boolean z);

    private native void nativeNotifySurfaceChanged(long j, int i, int i2, int i3, boolean z);

    private native int nativePausePrePlay(long j);

    private native int nativePauseRender(long j);

    private native int nativePostOnRenderThread(long j, int i, int i2, float f);

    private native int nativeRelease(long j);

    private native int nativeReleaseGPUResources(long j, boolean z);

    private native int nativeRenderFrame(long j, long j2, TECameraFrameSetting tECameraFrameSetting);

    private native void nativeResetCameraFrameTime(long j);

    private native void nativeSetBackground(long j, float f, float f2, float f3, float f4);

    private native int nativeSetBool(long j, String str, boolean z);

    private native int nativeSetBundle(long j, String str, long j2);

    private native int nativeSetDisplaySettings(long j);

    private native int nativeSetDisplaySurface(long j, Surface surface, int i, int i2);

    private native int nativeSetDisplaySurfaceSync(long j, Surface surface);

    private native int nativeSetDisplaySurfaceSync2(long j, Surface surface, int i, int i2);

    private native int nativeSetDouble(long j, String str, double d);

    private native int nativeSetFloat(long j, String str, float f);

    private native void nativeSetFollowingShotWindowsBackground(long j, float f, float f2, float f3, float f4);

    private native int nativeSetInt(long j, String str, int i);

    private native int nativeSetLandscape(long j);

    private native int nativeSetLong(long j, String str, long j2);

    private native int nativeSetMessageAndCallbackClient(long j, TEMessageClient tEMessageClient, TECallbackClient tECallbackClient);

    private native int nativeSetMultiCamMode(long j, int i, boolean z);

    private native int nativeSetPerformanceMonitorCallbackClient(long j, TEMemMonitor tEMemMonitor);

    private native int nativeSetPlayTrackStatus(long j, int i, int i2, int i3, long j2, boolean z, int i4);

    private native int nativeSetString(long j, String str, String str2);

    private native int nativeSetSubSurface(long j, Surface surface, int i, int i2);

    private native void nativeSetWaterMark(long j, Bitmap bitmap, int i, int i2, int i3, int i4, int i5, int i6);

    private native int nativeStartFollowingShotPreview(long j);

    private native int nativeStartPrePlay(long j);

    private native int nativeStartPreview(long j, Surface surface);

    private native int nativeStartRecord(long j, float f);

    private native int nativeStartRender(long j);

    private native void nativeStopFollowShowRender(long j, boolean z);

    private native int nativeStopFollowingShotPreview(long j);

    private native int nativeStopPrePlay(long j);

    private native int nativeStopPreview(long j, long j2);

    private native int nativeStopPreviewParallel(long j);

    private native int nativeStopRecord(long j);

    private native void nativeStopRender(long j, boolean z);

    private native int nativeTryRestore(long j);

    private native void nativeUpdateVideoDecodeChainByTimeline(long j);

    public final int LIZIZ() {
        return nativeClearAllFrags(this.LIZ, false);
    }

    public final int LJIIZILJ() {
        long j = this.LIZ;
        if (j != 0) {
            return nativePostOnRenderThread(j, 1051, 0, 0.0f);
        }
        C2484209oO.LIZJ("TERecorderInterface", "postOnRenderThread mHandle is null");
        return -112;
    }

    public final int LJJIFFI() {
        return nativeSetDisplaySurfaceSync2(this.LIZ, null, 0, 0);
    }

    public final long LJ() {
        return nativeGetAuxCameraClient(this.LIZ);
    }

    public final long LJI() {
        return nativeGetCameraClient(this.LIZ);
    }

    public final long LJIIJJI() {
        return nativeGetSecondaryCameraClient(this.LIZ);
    }

    public final String[] LJIILIIL() {
        return nativeGetStringArray(this.LIZ, "VideoPaths");
    }

    public final boolean LJIILL() {
        long j = this.LIZ;
        if (j != 0) {
            return nativeIsRecording(j);
        }
        C2484209oO.LIZJ("TERecorderInterface", "isRecording mHandle is null");
        return false;
    }

    public final int LJIILLIIL() {
        return nativePauseRender(this.LIZ);
    }

    public final int LJIJ() {
        int iNativeRelease;
        if (this.LIZ == 0) {
            return -112;
        }
        InterfaceC2254431DLt interfaceC2254431DLt = this.LIZIZ;
        if (interfaceC2254431DLt != null) {
            interfaceC2254431DLt.release();
        }
        if (VERuntime.shouldEnableCameraGraph()) {
            long j = this.LIZ;
            this.LIZ = 0L;
            iNativeRelease = nativeRelease(j);
            TEBundle.cleanAll();
        } else {
            iNativeRelease = nativeRelease(this.LIZ);
            TEBundle.cleanAll();
            this.LIZ = 0L;
        }
        this.LIZJ = null;
        return iNativeRelease;
    }

    public final int LJJ() {
        long j = this.LIZ;
        if (j == 0) {
            return -112;
        }
        return nativeSetDisplaySettings(j);
    }

    public final int LJJIJIIJI() {
        return nativeStartPrePlay(this.LIZ);
    }

    public final int LJJIJL() {
        return nativeStartRender(this.LIZ);
    }

    public final int LJJIJLIJ() {
        return nativeStopPrePlay(this.LIZ);
    }

    public final int LJJIZ() {
        return nativeStopRecord(this.LIZ);
    }

    public final int LJJJ() {
        return nativeTryRestore(this.LIZ);
    }

    public TERecorderInterface() {
        TEGLGlobalContext.nativeSetGLVersion(VERuntime.getInstance().isGLES3Enabled() ? 3 : 2);
        boolean zShouldEnableCameraGraph = VERuntime.shouldEnableCameraGraph();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isEnableCameraGraph=");
        sbLIZ.append(zShouldEnableCameraGraph);
        C2484209oO.LJI("TERecorderInterface", C2188811AlT.LIZIZ(sbLIZ));
        long jNativeCreate = nativeCreate(zShouldEnableCameraGraph);
        this.LIZ = jNativeCreate;
        if (zShouldEnableCameraGraph) {
            this.LIZIZ = new TEEffectInterfaceV2(nativeGetEffectInterface(jNativeCreate));
        } else {
            this.LIZIZ = new TEEffectInterface(nativeGetEffectInterface(jNativeCreate));
        }
    }

    public final String LJIIL() {
        return nativeGetString(this.LIZ, "ve_perf_report");
    }

    static {
        TENativeLibsLoader.loadRecorder();
    }

    public final void LIZJ() {
        nativeDelayJNIOnLoad();
    }

    public final int LIZLLL(boolean z) {
        return nativeDeleteLastFrag(this.LIZ, z);
    }

    public final void LJFF(TEBundle tEBundle) {
        nativeGetBundle(this.LIZ, "GetBMFColorCorrectionParam", tEBundle.getHandle());
    }

    public final float LJII(String str) {
        return nativeGetFloat(this.LIZ, str);
    }

    public final int LJIIIIZZ(String str) {
        return nativeGetInt(this.LIZ, str);
    }

    public final int LJIIIZ(C2254411DLr c2254411DLr) {
        if (this.LIZ == 0) {
            return -112;
        }
        if (!c2254411DLr.equals(this.LIZJ)) {
            LJIL("GetFrameSettings", C2254321DLi.LIZLLL(c2254411DLr));
            this.LIZJ = c2254411DLr;
        }
        Bitmap bitmap = c2254411DLr.LJIJ;
        if (bitmap != null) {
            return nativeGetPreviewFrameWithBitmap(this.LIZ, bitmap);
        }
        return nativeGetPreviewFrame(this.LIZ, -1L, -1);
    }

    public final int LJIJI(boolean z) {
        return nativeReleaseGPUResources(this.LIZ, z);
    }

    public final int LJJI(Surface surface) {
        return nativeSetDisplaySurface(this.LIZ, surface, 0, 0);
    }

    public final int LJJIIZ(C1DIT c1dit) {
        long j = this.LIZ;
        if (j == 0) {
            return -112;
        }
        return nativeSetMultiCamMode(j, c1dit.ordinal(), false);
    }

    public final int LJJIJIIJIL(Surface surface) {
        return nativeStartPreview(this.LIZ, surface);
    }

    public final int LJJIJIL(float f) {
        return nativeStartRecord(this.LIZ, f);
    }

    public final int LJJIL(long j) {
        return nativeStopPreview(this.LIZ, j);
    }

    public final int LJIIJ(C2254411DLr c2254411DLr, int i) {
        if (this.LIZ == 0) {
            return -112;
        }
        TEBundle tEBundleLIZLLL = C2254321DLi.LIZLLL(c2254411DLr);
        int iNativeGetPreviewFrame = nativeGetPreviewFrame(this.LIZ, tEBundleLIZLLL.getHandle(), i);
        tEBundleLIZLLL.recycle();
        return iNativeGetPreviewFrame;
    }

    public final void LJIJJ(TECameraFrameSetting tECameraFrameSetting, C2254411DLr c2254411DLr) {
        TEBundle tEBundleLIZLLL;
        long handle;
        if (this.LIZ == 0) {
            return;
        }
        if (VEConfigCenter.getInstance().getValue("ve_enable_getframe_optimization", false).booleanValue()) {
            tEBundleLIZLLL = C2254321DLi.LIZLLL(c2254411DLr);
        } else {
            if (!c2254411DLr.equals(this.LIZJ)) {
                LJIL("GetFrameSettings", C2254321DLi.LIZLLL(c2254411DLr));
                this.LIZJ = c2254411DLr;
            }
            tEBundleLIZLLL = null;
        }
        long j = this.LIZ;
        if (tEBundleLIZLLL != null) {
            handle = tEBundleLIZLLL.getHandle();
        } else {
            handle = -1;
        }
        nativeRenderFrame(j, handle, tECameraFrameSetting);
        if (tEBundleLIZLLL != null) {
            tEBundleLIZLLL.recycle();
        }
    }

    public final int LJIJJLI(String str, boolean z) {
        return nativeSetBool(this.LIZ, str, z);
    }

    public final int LJIL(String str, TEBundle tEBundle) {
        int iNativeSetBundle = nativeSetBundle(this.LIZ, str, tEBundle.getHandle());
        tEBundle.recycle();
        return iNativeSetBundle;
    }

    public final void LJJII(String str, float f) {
        nativeSetFloat(this.LIZ, str, f);
    }

    public final void LJJIII(String str, int i) {
        nativeSetInt(this.LIZ, str, i);
    }

    public final void LJJIIJ(String str, long j) {
        nativeSetLong(this.LIZ, str, j);
    }

    public final void LJJIIJZLJL(TEMessageClient tEMessageClient, TECallbackClient tECallbackClient) {
        long j = this.LIZ;
        if (j == 0) {
            return;
        }
        nativeSetMessageAndCallbackClient(j, tEMessageClient, tECallbackClient);
    }

    public final int LJJIJ(String str, String str2) {
        return nativeSetString(this.LIZ, str, str2);
    }

    public final int LIZ(int i, int i2, int i3, int i4) {
        return nativeAlignTo(this.LIZ, i, i2, i3, i4);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0144  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LJIILJJIL(X.C2254401DLq r6, com.ss.android.vesdk.VEVideoEncodeSettings r7, com.ss.android.vesdk.VEAudioEncodeSettings r8, com.ss.android.vesdk.VEPreviewSettings r9) {
        /*
            Method dump skipped, instruction units count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ttve.nativePort.TERecorderInterface.LJIILJJIL(X.1DLq, com.ss.android.vesdk.VEVideoEncodeSettings, com.ss.android.vesdk.VEAudioEncodeSettings, com.ss.android.vesdk.VEPreviewSettings):int");
    }

    public final int LJJIIZI(int i, int i2, int i3, int i4, long j, boolean z) {
        return nativeSetPlayTrackStatus(this.LIZ, i, i2, i3, j, z, i4);
    }
}
