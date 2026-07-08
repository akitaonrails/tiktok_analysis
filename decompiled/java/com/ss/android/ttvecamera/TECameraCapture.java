package com.ss.android.ttvecamera;

import X.C1286570jaJ;
import X.C1305710k5B;
import X.C1321640kUs;
import X.C1DJ6;
import X.C1DJB;
import X.C1DJG;
import X.C1DJH;
import X.C1DJI;
import X.C1DJJ;
import X.C1DJM;
import X.C1DJP;
import X.C1DJS;
import X.C1DJT;
import X.C1DJU;
import X.C1DJX;
import X.C20188413z0;
import X.C2183341Ace;
import X.C2183351Acf;
import X.C2186291AhP;
import X.C2186341AhU;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2244641CtK;
import X.C786410Ut5;
import X.EnumC2244671CtN;
import X.InterfaceC1271000jBC;
import X.InterfaceC1281910jSn;
import X.InterfaceC1283620jVY;
import X.InterfaceC1286930jat;
import X.InterfaceC1286940jau;
import X.InterfaceC1286950jav;
import X.InterfaceC1287190jbJ;
import X.InterfaceC1305670k57;
import X.InterfaceC1305720k5C;
import X.InterfaceC2186141AhA;
import X.InterfaceC2186151AhB;
import X.InterfaceC2186211AhH;
import X.InterfaceC2186271AhN;
import X.InterfaceC2186281AhO;
import X.InterfaceC2186331AhT;
import X.InterfaceC2186351AhV;
import X.InterfaceC2254701DMu;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import com.bytedance.bpea.basics.Cert;
import com.ss.android.ttvecamera.cameraalgorithm.TECameraAlgorithmParam;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes36.dex */
public class TECameraCapture {
    public C1DJB mCameraCaptureUpdateCallback;
    public C1DJS mCameraFpsConfigCallback;
    public C1DJP mCameraObserver;
    public C1DJ6 mCameraSettings;
    public C1DJT mPictureSizeCallback;
    public InterfaceC1271000jBC mPreviewSizeCallback = null;
    public InterfaceC2186151AhB mCameraStatusListener = null;
    public Map<String, Bundle> mAllDevicesFeatures = new HashMap();

    public static int convertFacing(int i) {
        return i == 0 ? 1 : 0;
    }

    public static void fillCameraFeatures(Context context, int i, Bundle bundle) {
    }

    public static boolean fillDeviceFeatures(Context context, int i, Bundle bundle) {
        return false;
    }

    public static boolean isCameraSupport(Context context, int i) {
        return true;
    }

    public void changeCaptureFormat() {
    }

    public int disConnect() {
        return disConnect((Cert) null);
    }

    public int stop() {
        return stop(false);
    }

    private List<TEFrameSizei> getSupportedPictureSizes() {
        return b0.INSTANCE.getSupportedPictureSizes(this);
    }

    private List<TEFrameSizei> getSupportedPreviewSizes() {
        return b0.INSTANCE.getSupportedPreviewSizes(this);
    }

    public int abortSession() {
        return b0.INSTANCE.abortSession(this);
    }

    public int cancelFocus() {
        return b0.INSTANCE.cancelFocus(this);
    }

    public void downExposureCompensation() {
        b0.INSTANCE.downExposureCompensation(this);
    }

    public int enableCaf() {
        return b0.INSTANCE.enableCaf(this);
    }

    public int[] getCameraCaptureSize() {
        return b0.INSTANCE.getCameraCaptureSize();
    }

    public C1286570jaJ getCameraECInfo() {
        return b0.INSTANCE.getCameraECInfo(this);
    }

    public float getCameraFps() {
        return b0.INSTANCE.getCameraFps();
    }

    public int getCameraState() {
        return b0.INSTANCE.getCameraState();
    }

    public int getExposureCompensation() {
        return b0.INSTANCE.getExposureCompensation(this);
    }

    public int getFlashMode() {
        return b0.INSTANCE.getFlashMode(this);
    }

    public int getFrameInfo() {
        return b0.INSTANCE.getFrameInfo();
    }

    public int[] getPictureSize() {
        return b0.INSTANCE.getPictureSize(this);
    }

    public int[] getPreviewFps() {
        return b0.INSTANCE.getPreviewFps();
    }

    public int getSessionCameraFpsEligibleCount() {
        return b0.INSTANCE.getSessionCameraFpsEligibleCount();
    }

    public int getSessionCameraFpsLowerCount() {
        return b0.INSTANCE.getSessionCameraFpsLowerCount();
    }

    public int getSessionCameraFpsRestoreCount() {
        return b0.INSTANCE.getSessionCameraFpsRestoreCount();
    }

    public int getSessionCameraFpsUpdateCount() {
        return b0.INSTANCE.getSessionCameraFpsUpdateCount();
    }

    public boolean isAutoExposureLockSupported() {
        return b0.INSTANCE.isAutoExposureLockSupported(this);
    }

    public boolean isAutoFocuseLockSupported() {
        return b0.INSTANCE.isAutoFocusLockSupported(this);
    }

    public boolean isCameraSwitchState() {
        return b0.INSTANCE.isCameraSwitchState();
    }

    public boolean isHDR10BitSupported() {
        return b0.INSTANCE.isHDR10BitSupported(this);
    }

    public boolean isSupportWhileBalance() {
        return b0.INSTANCE.isSupportWhileBalance(this);
    }

    public boolean isSupportedExposureCompensation() {
        return b0.INSTANCE.isSupportedExposureCompensation(this);
    }

    public boolean isTorchSupported() {
        return b0.INSTANCE.isTorchSupported(this);
    }

    public int removeCameraProvider() {
        return b0.INSTANCE.removeCameraProvider(this);
    }

    public int start() {
        return b0.INSTANCE.start(this);
    }

    public int startRecording() {
        return b0.INSTANCE.startRecording();
    }

    public int stopRecording() {
        return b0.INSTANCE.stopRecording();
    }

    public void upExposureCompensation() {
        b0.INSTANCE.upExposureCompensation(this);
    }

    public void updateCameraSurface() {
        b0.INSTANCE.updateCameraSurface(this);
    }

    public TECameraCapture(C1DJP c1djp) {
        this.mCameraObserver = C1DJI.LIZ();
        this.mCameraObserver = c1djp;
    }

    public static void registerException(C1DJJ c1djj) {
        WeakReference<C1DJJ> weakReference;
        if (c1djj == null) {
            weakReference = null;
        } else {
            weakReference = new WeakReference<>(c1djj);
        }
        C1DJH.LIZ = weakReference;
    }

    public void addCameraAlgorithm(TECameraAlgorithmParam tECameraAlgorithmParam) {
        b0.INSTANCE.addCameraAlgorithm(tECameraAlgorithmParam);
    }

    public int addCameraProvider(C1DJM c1djm) {
        return b0.INSTANCE.addCameraProvider(this, c1djm);
    }

    public void changeAppLifeCycle(boolean z) {
        b0.INSTANCE.appLifeCycleChanged(z);
    }

    public int changeCurrentControlCam(int i) {
        return b0.INSTANCE.changeCurrentControlCam(this, i);
    }

    public void collectCameraCapabilities(Runnable runnable) {
        b0.INSTANCE.collectCameraCapabilities(runnable);
    }

    public int connect(C1DJ6 c1dj6) {
        return connect(c1dj6, null);
    }

    public int disConnect(Cert cert) {
        b0 b0Var = b0.INSTANCE;
        b0Var.registerFpsConfigListener(null);
        return b0Var.disConnect(this, cert);
    }

    public void enableMulticamZoom(boolean z) {
        b0.INSTANCE.enableMulticamZoom(this, z);
    }

    public int focusAtPoint(C1DJG c1djg) {
        c1djg.getClass();
        c1djg.LJFF = System.currentTimeMillis();
        return b0.INSTANCE.focusAtPoint(this, c1djg);
    }

    public float[] getApertureRange(InterfaceC1286940jau interfaceC1286940jau) {
        return b0.INSTANCE.getApertureRange(this, interfaceC1286940jau);
    }

    public long getAvgExpTime(boolean z) {
        return b0.INSTANCE.getAvgExpTime(z);
    }

    public JSONObject getCameraCapabilitiesForBytebench(InterfaceC2186331AhT interfaceC2186331AhT) {
        return b0.INSTANCE.getCameraCapbilitiesForBytebench(this, interfaceC2186331AhT);
    }

    public int getCameraState(boolean z) {
        return b0.INSTANCE.getCameraState(z);
    }

    public float[] getFOV(InterfaceC2186211AhH interfaceC2186211AhH) {
        return b0.INSTANCE.getFOV(this, interfaceC2186211AhH);
    }

    public int getISO(InterfaceC1283620jVY interfaceC1283620jVY) {
        return b0.INSTANCE.getISO(this, interfaceC1283620jVY);
    }

    public int[] getISORange(InterfaceC1281910jSn interfaceC1281910jSn) {
        return b0.INSTANCE.getISORange(this, interfaceC1281910jSn);
    }

    public float getManualFocusAbility(InterfaceC1286950jav interfaceC1286950jav) {
        return b0.INSTANCE.getManualFocusAbility(this, interfaceC1286950jav);
    }

    public float getSessionAverageCameraFPS(boolean z) {
        return b0.INSTANCE.getSessionAverageCameraFPS(z);
    }

    public float getSessionAverageExposureTime(boolean z) {
        return b0.INSTANCE.getSessionAverageExposureTime(z);
    }

    public float getSessionAverageISO(boolean z) {
        return b0.INSTANCE.getSessionAverageISO(z);
    }

    public long[] getShutterTimeRange(InterfaceC1286930jat interfaceC1286930jat) {
        return b0.INSTANCE.getShutterTimeRange(this, interfaceC1286930jat);
    }

    public boolean isARCoreSupported(Context context) {
        C2244641CtK.LIZJ(context);
        return false;
    }

    public boolean isDynamicRangeProfileSupported(long j) {
        return b0.INSTANCE.isDynamicRangeProfileSupported(this, j);
    }

    public boolean isStabilizationSupported(EnumC2244671CtN enumC2244671CtN) {
        return b0.INSTANCE.isStabilizationSupported(this, enumC2244671CtN);
    }

    public void needToReleaseSurfaceTexture(boolean z) {
        b0.INSTANCE.needToReleaseSurfaceTexture(z);
    }

    public void notifyHostForegroundVisible(boolean z) {
        b0.INSTANCE.notifyHostForegroundVisible(this, z);
    }

    public void process(C2186341AhU c2186341AhU) {
        b0.INSTANCE.process(this, c2186341AhU);
    }

    public TECameraFrame processAlgorithm(TECameraFrame tECameraFrame) {
        return b0.INSTANCE.processAlgorithm(tECameraFrame);
    }

    public void queryFeatures(Bundle bundle) {
        C1DJ6 c1dj6 = this.mCameraSettings;
        if (c1dj6 == null) {
            int i = C2187451AjH.LIZ;
            C2183341Ace.LIZIZ("TECameraCapture", "query features failed, maybe not connet");
        } else {
            queryFeatures(c1dj6.LLLFF, bundle);
        }
    }

    public float queryShaderZoomAbility(InterfaceC1287190jbJ interfaceC1287190jbJ) {
        return b0.INSTANCE.queryShaderZoomStep(this, interfaceC1287190jbJ);
    }

    public void registerCameraCaptureUpdateListener(C1DJB c1djb) {
        this.mCameraCaptureUpdateCallback = c1djb;
        b0.INSTANCE.registerCameraCaptureUpdateListener(c1djb);
    }

    public void registerCameraStatusListener(InterfaceC2186151AhB interfaceC2186151AhB) {
        this.mCameraStatusListener = interfaceC2186151AhB;
        b0.INSTANCE.registerCameraStatusListener(interfaceC2186151AhB);
    }

    public void registerFpsConfigListener(C1DJS c1djs) {
        this.mCameraFpsConfigCallback = c1djs;
    }

    public void registerPreviewListener(InterfaceC1271000jBC interfaceC1271000jBC) {
        this.mPreviewSizeCallback = interfaceC1271000jBC;
    }

    public void registerVEPerformanceChannel(C20188413z0 c20188413z0) {
        b0.INSTANCE.registerVEPerformanceChannel(c20188413z0);
    }

    public void removeCameraAlgorithm(int i) {
        b0.INSTANCE.removeCameraAlgorithm(i);
    }

    public void setAperture(float f) {
        b0.INSTANCE.setAperture(this, f);
    }

    public void setAutoExposureLock(boolean z) {
        b0.INSTANCE.setAutoExposureLock(this, z);
    }

    public void setAutoFocusLock(boolean z) {
        b0.INSTANCE.setAutoFocusLock(this, z);
    }

    public void setCaptureMode(boolean z) {
        b0.INSTANCE.setCaptureMode(z);
    }

    public void setDeviceRotation(int i) {
        b0.INSTANCE.setDeviceRotation(i);
    }

    public void setExposureCompensation(int i) {
        b0.INSTANCE.setExposureCompensation(this, i);
    }

    public void setFeatureParameters(Bundle bundle) {
        b0.INSTANCE.setFeatureParameters(this, bundle);
    }

    public void setISO(int i) {
        b0.INSTANCE.setISO(this, i);
    }

    public void setLensCallback(InterfaceC2186141AhA interfaceC2186141AhA) {
        b0.INSTANCE.setLensCallback(interfaceC2186141AhA);
    }

    public void setManualFocusDistance(float f) {
        b0.INSTANCE.setManualFocusDistance(this, f);
    }

    public void setPreviewFpsRange(TEFrameRateRange tEFrameRateRange) {
        b0.INSTANCE.setPreviewFpsRange(tEFrameRateRange);
    }

    public void setPreviewFpsRangeWhenRunning(TEFrameRateRange tEFrameRateRange) {
        b0.INSTANCE.setPreviewFpsRangeWhenRunning(tEFrameRateRange);
    }

    public void setSATZoomCallback(C1DJU c1dju) {
        b0.INSTANCE.setSATZoomCallback(c1dju);
    }

    public void setSceneMode(int i) {
        b0.INSTANCE.setSceneMode(this, i);
    }

    public void setShutterTime(long j) {
        b0.INSTANCE.setShutterTime(this, j);
    }

    public int setStabilizationMode(EnumC2244671CtN enumC2244671CtN) {
        return b0.INSTANCE.setStabilizationMode(this, enumC2244671CtN);
    }

    public int stop(boolean z) {
        return b0.INSTANCE.stop(this, z);
    }

    public int stopZoom(InterfaceC2254701DMu interfaceC2254701DMu) {
        return b0.INSTANCE.stopZoom(this, interfaceC2254701DMu);
    }

    public int switchCamera(int i) {
        return switchCamera(i, (Cert) null);
    }

    public int switchFlashMode(int i) {
        return b0.INSTANCE.switchFlashMode(this, i);
    }

    public int takePicture(InterfaceC2186271AhN interfaceC2186271AhN) {
        return b0.INSTANCE.takePicture(this, interfaceC2186271AhN);
    }

    public int toggleTorch(boolean z) {
        return b0.INSTANCE.toggleTorch(this, z);
    }

    public void updateAllCameraFeatures(Bundle bundle) {
        C1DJ6 c1dj6 = this.mCameraSettings;
        if (c1dj6 != null) {
            updateAllCameraFeatures(c1dj6.LLILLJJLI, bundle);
            Map<String, Bundle> map = this.mAllDevicesFeatures;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.mCameraSettings.LLILLJJLI);
            sbLIZ.append("_");
            sbLIZ.append(this.mCameraSettings.LLILZ);
            if (map.containsKey(C2188811AlT.LIZIZ(sbLIZ))) {
                Map<String, Bundle> map2 = this.mAllDevicesFeatures;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(this.mCameraSettings.LLILLJJLI);
                sbLIZ2.append("_");
                sbLIZ2.append(this.mCameraSettings.LLILZ);
                Bundle bundle2 = map2.get(C2188811AlT.LIZIZ(sbLIZ2));
                if (bundle2 != null) {
                    C786410Ut5.LJJIIJZLJL(bundle2, bundle);
                    return;
                }
                return;
            }
            Map<String, Bundle> map3 = this.mAllDevicesFeatures;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(this.mCameraSettings.LLILLJJLI);
            sbLIZ3.append("_");
            sbLIZ3.append(this.mCameraSettings.LLILZ);
            map3.put(C2188811AlT.LIZIZ(sbLIZ3), bundle);
        }
    }

    public void updateCameraAlgorithmParam(TECameraAlgorithmParam tECameraAlgorithmParam) {
        b0.INSTANCE.updateCameraAlgorithmParam(tECameraAlgorithmParam);
    }

    public void updateCameraProvider(C1DJM c1djm) {
        b0.INSTANCE.updateCameraProvider(this, c1djm);
    }

    public void updateTextureId(int i) {
        b0.INSTANCE.updateTextureId(i);
    }

    public int disConnect(boolean z) {
        return disConnect(z, null);
    }

    public int switchCamera(C1DJ6 c1dj6) {
        return switchCamera(c1dj6, (Cert) null);
    }

    public TECameraCapture(C1DJP c1djp, C1DJT c1djt) {
        this.mCameraObserver = C1DJI.LIZ();
        this.mCameraObserver = c1djp;
        this.mPictureSizeCallback = c1djt;
        synchronized (C1321640kUs.class) {
            C1321640kUs.LIZ = false;
        }
    }

    public static void registerLogOutput(byte b, InterfaceC1305670k57 interfaceC1305670k57) {
        if (interfaceC1305670k57 != null) {
            C2183341Ace.LIZJ = interfaceC1305670k57;
        } else {
            C2183341Ace.LIZJ = new C2183351Acf();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VESDK");
        sbLIZ.append("-");
        C2183341Ace.LIZ = C2188811AlT.LIZIZ(sbLIZ);
        C2183341Ace.LIZIZ = b;
    }

    public static void registerMonitor(TECameraCapture tECameraCapture, InterfaceC1305720k5C interfaceC1305720k5C) {
        if (tECameraCapture != null) {
            int iHashCode = tECameraCapture.hashCode();
            if (interfaceC1305720k5C == null) {
                C1305710k5B.LIZ.put(Integer.valueOf(iHashCode), new InterfaceC1305720k5C() { // from class: X.0k5D
                    @Override // X.InterfaceC1305720k5C
                    public final void LJFF(String str, String str2) {
                    }

                    @Override // X.InterfaceC1305720k5C
                    public final void LJI(long j, String str) {
                    }

                    @Override // X.InterfaceC1305720k5C
                    public final void LJII(double d, String str) {
                    }
                });
            } else {
                C1305710k5B.LIZ.put(Integer.valueOf(iHashCode), interfaceC1305720k5C);
            }
        }
    }

    private void updateAllCameraFeatures(int i, Bundle bundle) {
        int i2;
        int i3;
        Bundle bundle2 = new Bundle();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.mCameraSettings.LLILLJJLI);
        sbLIZ.append("_");
        sbLIZ.append(this.mCameraSettings.LLILZ);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        boolean z = false;
        if (11 == i) {
            bundle2.putInt("device_support_ai_night_video", 0);
        } else if (10 == i) {
            bundle2.putBoolean("device_should_use_shader_zoom", false);
        } else if (2 == i) {
            bundle2.putBoolean("device_support_multicamera_zoom", false);
        }
        bundle2.putInt("device_support_wide_angle_mode", 0);
        queryFeatures(strLIZIZ, bundle2);
        if (11 == i) {
            int i4 = bundle2.getInt("device_support_ai_night_video");
            int i5 = bundle.getInt("device_support_ai_night_video");
            if (i4 > 0 && i5 > 0) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            bundle.putInt("device_support_ai_night_video", i3);
        }
        int i6 = bundle2.getInt("device_support_wide_angle_mode");
        int i7 = bundle.getInt("device_support_wide_angle_mode");
        if (i6 > 0 && i7 > 0) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        bundle.putInt("device_support_wide_angle_mode", i2);
        if (10 == i) {
            bundle.putBoolean("device_should_use_shader_zoom", bundle2.getBoolean("device_should_use_shader_zoom"));
        } else if (2 == i) {
            boolean z2 = bundle2.getBoolean("device_support_multicamera_zoom");
            boolean z3 = bundle.getBoolean("device_support_multicamera_zoom");
            if (z2 && z3) {
                z = true;
            }
            bundle.putBoolean("device_support_multicamera_zoom", z);
        }
        List<TEFrameSizei> supportedPreviewSizes = getSupportedPreviewSizes();
        List<TEFrameSizei> supportedPictureSizes = getSupportedPictureSizes();
        if (supportedPreviewSizes != null) {
            C786410Ut5.LJJIL(bundle, "support_preview_sizes", (ArrayList) supportedPreviewSizes);
        }
        if (supportedPictureSizes != null) {
            C786410Ut5.LJJIL(bundle, "support_picture_sizes", (ArrayList) supportedPictureSizes);
        }
        int i8 = C2187451AjH.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("updateAllCameraFeatures with camera type:");
        sbLIZ2.append(i);
        sbLIZ2.append(", feature bundle = ");
        sbLIZ2.append(bundle);
        C2183341Ace.LIZLLL("TECameraCapture", C2188811AlT.LIZIZ(sbLIZ2));
    }

    public int captureBurst(InterfaceC2186281AhO interfaceC2186281AhO, C2186291AhP c2186291AhP) {
        return b0.INSTANCE.captureBurst(this, interfaceC2186281AhO, c2186291AhP);
    }

    public void changeRecorderState(int i, InterfaceC2186351AhV interfaceC2186351AhV) {
        b0.INSTANCE.changeRecorderState(this, i, interfaceC2186351AhV);
    }

    public int connect(C1DJ6 c1dj6, Cert cert) {
        b0 b0Var = b0.INSTANCE;
        b0Var.registerFpsConfigListener(this.mCameraFpsConfigCallback);
        b0Var.registerPreviewSizeListener(this.mPreviewSizeCallback);
        int iConnect = b0.INSTANCE.connect(this, this.mCameraObserver, c1dj6, this.mPictureSizeCallback, cert);
        if (iConnect == 0) {
            this.mCameraSettings = c1dj6;
        }
        return iConnect;
    }

    public int disConnect(boolean z, Cert cert) {
        b0 b0Var = b0.INSTANCE;
        b0Var.registerFpsConfigListener(null);
        return b0Var.disConnect(this, z, cert);
    }

    public TEFrameSizei getBestPreviewSize(float f, TEFrameSizei tEFrameSizei) {
        return b0.INSTANCE.getBestPreviewSize(this, f, tEFrameSizei);
    }

    public synchronized void getCameraAllFeatures(Context context, Bundle bundle) {
        if (this.mCameraSettings != null) {
            Map<String, Bundle> map = this.mAllDevicesFeatures;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.mCameraSettings.LLILLJJLI);
            sbLIZ.append("_");
            sbLIZ.append(this.mCameraSettings.LLILZ);
            if (map.containsKey(C2188811AlT.LIZIZ(sbLIZ))) {
                Map<String, Bundle> map2 = this.mAllDevicesFeatures;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(this.mCameraSettings.LLILLJJLI);
                sbLIZ2.append("_");
                sbLIZ2.append(this.mCameraSettings.LLILZ);
                Bundle bundle2 = map2.get(C2188811AlT.LIZIZ(sbLIZ2));
                if (bundle2 != null) {
                    C786410Ut5.LJJIIJZLJL(bundle, bundle2);
                }
            } else {
                getCameraAllFeatures(context, this.mCameraSettings.LLILLJJLI, bundle);
                Map<String, Bundle> map3 = this.mAllDevicesFeatures;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(this.mCameraSettings.LLILLJJLI);
                sbLIZ3.append("_");
                sbLIZ3.append(this.mCameraSettings.LLILZ);
                map3.put(C2188811AlT.LIZIZ(sbLIZ3), bundle);
            }
        }
    }

    public void queryFeatures(String str, Bundle bundle) {
        b0.INSTANCE.queryFeatures(str, bundle);
    }

    public int queryZoomAbility(InterfaceC2254701DMu interfaceC2254701DMu, boolean z) {
        return b0.INSTANCE.queryZoomAbility(this, interfaceC2254701DMu, z);
    }

    public void setPictureSize(int i, int i2) {
        b0.INSTANCE.setPictureSize(this, i, i2);
    }

    public void setPreviewFpsRange(TEFrameRateRange tEFrameRateRange, int i) {
        b0.INSTANCE.setPreviewFpsRange(tEFrameRateRange, i);
    }

    public void setWhileBalance(boolean z, String str) {
        b0.INSTANCE.setWhileBalance(this, z, str);
    }

    public int start(SurfaceTexture surfaceTexture, int i) {
        int i2 = C2187451AjH.LIZ;
        C2183341Ace.LIZIZ("TECameraCapture", "Do not use this interface!!");
        return start();
    }

    public int startZoom(float f, InterfaceC2254701DMu interfaceC2254701DMu) {
        return b0.INSTANCE.startZoom(this, f, interfaceC2254701DMu);
    }

    public int switchCamera(C1DJ6 c1dj6, Cert cert) {
        int iSwitchCamera = b0.INSTANCE.switchCamera(this, c1dj6, cert);
        if (iSwitchCamera == 0) {
            this.mCameraSettings = c1dj6;
        }
        return iSwitchCamera;
    }

    public int switchCameraMode(int i, C1DJ6 c1dj6) {
        if (c1dj6 != null) {
            this.mCameraSettings = c1dj6;
        }
        return b0.INSTANCE.switchCameraMode(this, i);
    }

    public void updateCameraProviderCaptureListener(UUID uuid, C1DJX c1djx) {
        b0.INSTANCE.updateCameraProviderCaptureListener(this, uuid, c1djx);
    }

    public void updateCameraProviderState(UUID uuid, boolean z) {
        b0.INSTANCE.updateCameraProviderState(this, uuid, z);
    }

    public void updateTextureId(int i, int i2) {
        b0.INSTANCE.updateTextureId(i, i2);
    }

    public int zoomV2(float f, InterfaceC2254701DMu interfaceC2254701DMu) {
        return b0.INSTANCE.zoomV2(this, f, interfaceC2254701DMu);
    }

    public int switchCamera(int i, Cert cert) {
        return b0.INSTANCE.switchCamera(this, i, cert);
    }

    private void getCameraAllFeatures(Context context, int i, Bundle bundle) {
        if (10 == i) {
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("device_should_use_shader_zoom", false);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.mCameraSettings.LLILLJJLI);
            sbLIZ.append("_");
            sbLIZ.append(this.mCameraSettings.LLILZ);
            queryFeatures(C2188811AlT.LIZIZ(sbLIZ), bundle2);
            bundle.putBoolean("device_should_use_shader_zoom", bundle2.getBoolean("device_should_use_shader_zoom"));
        }
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("getCameraAllFeatures, type = ");
        sbLIZ2.append(i);
        sbLIZ2.append(", features = ");
        sbLIZ2.append(bundle);
        C2183341Ace.LIZLLL("TECameraCapture", C2188811AlT.LIZIZ(sbLIZ2));
    }

    public static void queryDeviceFeatures(Context context, int i, Bundle bundle) {
        if (isCameraSupport(context, i) && fillDeviceFeatures(context, i, bundle)) {
            fillCameraFeatures(context, i, bundle);
        }
    }

    public int takePicture(int i, int i2, InterfaceC2186271AhN interfaceC2186271AhN) {
        return b0.INSTANCE.takePicture(this, i, i2, interfaceC2186271AhN);
    }

    public int focusAtPoint(int i, int i2, float f, int i3, int i4) {
        return focusAtPoint(new C1DJG(i, i2, i3, i4, f));
    }
}
