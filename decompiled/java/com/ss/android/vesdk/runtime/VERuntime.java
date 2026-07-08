package com.ss.android.vesdk.runtime;

import X.C0VSJ;
import X.C1284730jXL;
import X.C1293970jmF;
import X.C1A67;
import X.C1A68;
import X.C2176411AFr;
import X.C2188811AlT;
import X.C2189061Als;
import X.C2189081Alu;
import X.C2189101Alw;
import X.C2189111Alx;
import X.C2189171Am3;
import X.C2484209oO;
import X.C786410Ut5;
import X.C810670Vr7;
import X.EnumC1289830jfZ;
import X.InterfaceC2188801AlS;
import X.InterfaceC2189091Alv;
import X.InterfaceC2189121Aly;
import X.InterfaceC2189151Am1;
import X.InterfaceC2189161Am2;
import android.content.Context;
import android.content.res.AssetManager;
import android.text.TextUtils;
import com.bef.effectsdk.AssetResourceFinder;
import com.bef.effectsdk.EffectApplicationInfo;
import com.bef.effectsdk.EffectSDKUtils;
import com.bef.effectsdk.FileResourceFinder;
import com.bef.effectsdk.ResourceFinder;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.ies.common.IESAppLogger;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ttve.editorInfo.TEEditorInfoInvoker;
import com.ss.android.ttve.monitor.ApplogUtilsInvoker;
import com.ss.android.ttve.monitor.TEPerfStatsInvoker;
import com.ss.android.ttve.nativePort.TENativeLibsLoader;
import com.ss.android.vesdk.VESize;
import com.ss.android.vesdk.VEVersionUtil;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import ud7.b;

/* JADX INFO: loaded from: classes34.dex */
public class VERuntime {
    public C2189171Am3 mAB;
    public InterfaceC2189151Am1 mApplogListener;
    public Context mContext;
    public boolean mEnableAudioCapture;
    public boolean mEnableCameraGF;
    public boolean mEnableGLES3;
    public boolean mEnableRefactorRecorder;
    public boolean mEnableTransitionKeyframe;
    public C1A68 mEnv;
    public InterfaceC2189121Aly mExceptionMonitorListener;
    public boolean mIsInited;
    public VESize mMaxRenderSize;
    public C1293970jmF mResManager;
    public C2176411AFr mSP;
    public int mTransitionFrameCount;
    public int mTransitionKeyFrameMode;
    public int mTransitionKeyFrameVersion;
    public boolean mUseAssetManager;
    public boolean mUseResourceFinder;
    public WeakReference<InterfaceC2188801AlS> mVEApplogListener;
    public InterfaceC2189091Alv mVEExceptionMonitorListener;

    public static native void nativeClearAllFreeMemoryCache(int i);

    public static native void nativeEnableABOptimize(boolean z);

    public static native void nativeEnableAudioSDKApiV2(boolean z);

    public static native void nativeEnableCrossPlatGLBaseFBO(boolean z);

    private native void nativeEnableHDByteVC1HWDecoder(boolean z, int i);

    private native void nativeEnableHDH264HWDecoder(boolean z, int i);

    private native void nativeEnableHDMpeg24VP89HWDecoder(boolean z);

    private native void nativeEnableHighFpsByteVC1HWDecoder(boolean z, int i, int i2);

    private native void nativeEnableHighFpsH264HWDecoder(boolean z, int i, int i2);

    public static native void nativeEnableImport10BitByteVC1Video(boolean z);

    public static native void nativeEnableRenderLib(boolean z);

    public static native void nativeEnableRenderLibFBOOpt(boolean z);

    private native void nativeEnableTTByteVC1Decoder(boolean z);

    public static native void nativeEnableTitanReleaseGPUResource(boolean z);

    public static native void nativeEnableTransitionKeyFrame(boolean z);

    private native long nativeGetNativeContext();

    public static native double nativeGetVirtualMemInfo();

    public static native boolean nativeIsArm64();

    public static native void nativeNotifyWillEnterEditor(String str);

    public static native void nativeSetNativeLibraryDir(String str);

    public static native void nativeSetPageModeByteVC1CodecConfig(int i, int i2, int i3, int i4);

    public static native void nativeSetPageModeH264CodecConfig(int i, int i2, int i3, int i4);

    public static native void nativeSetTransitionFrameCount(int i);

    public static native void nativeSetTransitionKeyFrameMode(int i);

    public static native void nativeSetTransitionKeyFrameVersion(int i);

    public void enableNewRecorder(boolean z) {
    }

    public boolean isEnableCameraGF() {
        return true;
    }

    public boolean isEnableNewRecorder() {
        return true;
    }

    public void registerMonitor(InterfaceC2189161Am2 interfaceC2189161Am2) {
    }

    public static VERuntime getInstance() {
        return EnumC1289830jfZ.LLILLJJLI.LL;
    }

    private void initConfig() {
        Context context = this.mContext;
        if (context != null) {
            nativeSetNativeLibraryDir(context.getApplicationInfo().nativeLibraryDir);
        }
        new BPEAThread() { // from class: X.08Xa
            public final void LIZJ() {
                try {
                    Context context2 = this.LL.mContext;
                    if (C08XZ.LIZ) {
                        return;
                    }
                    synchronized (C08XZ.class) {
                        try {
                            if (!C08XZ.LIZ) {
                                C08XZ.LIZ(C786410Ut5.N3(context2));
                                C08XZ.LIZ = true;
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }

            @Override // com.bytedance.bpea.transmit.delegate.BPEAThread, java.lang.Thread, java.lang.Runnable
            public final void run() {
                C1C7U.LIZ("VERuntime@379.initConfig$1");
                boolean zLJ = C0W9U.LJ(getBpeaTraceContext());
                try {
                    LIZJ();
                } finally {
                }
                if (zLJ) {
                    C0W9U.LJFF();
                }
                C1C7U.LIZIZ("VERuntime@379.initConfig$1");
            }
        }.start();
    }

    public C2189171Am3 getAB() {
        if (this.mAB == null) {
            this.mAB = new C2189171Am3();
        }
        return this.mAB;
    }

    public AssetManager getAssetManager() {
        if (!this.mUseAssetManager) {
            C2484209oO.LIZJ("VERuntime", "disable use AssetManager!");
        }
        Context context = this.mContext;
        if (context != null) {
            return context.getAssets();
        }
        C2484209oO.LIZJ("VERuntime", "context is null!");
        return null;
    }

    public int needUpdateEffectModelFiles() {
        C1A68 c1a68 = this.mEnv;
        if (c1a68 == null || TextUtils.isEmpty(c1a68.LIZ)) {
            return -108;
        }
        if (this.mUseResourceFinder) {
            C2484209oO.LJIIIIZZ("VERuntime", "Use resource finder. Do not need update effect model files!");
            return -1;
        }
        if (this.mUseAssetManager) {
            C2484209oO.LJIIIIZZ("VERuntime", "Enable assetManager. Do not need update effect model files!");
            return -1;
        }
        if (EffectSDKUtils.needUpdate(this.mContext, this.mEnv.LIZ())) {
            return 0;
        }
        VEEffectConfig.configEffect(this.mEnv.LIZ(), "nexus");
        return -1;
    }

    public int updateEffectModelFiles() {
        C1A68 c1a68 = this.mEnv;
        if (c1a68 == null || TextUtils.isEmpty(c1a68.LIZ)) {
            return -108;
        }
        C0VSJ c0vsj = new C0VSJ(this.mEnv.LIZ, "models");
        if (!c0vsj.exists()) {
            c0vsj.mkdirs();
        }
        try {
            String absolutePath = c0vsj.getAbsolutePath();
            EffectSDKUtils.flushAlgorithmModelFiles(this.mContext, absolutePath);
            this.mEnv.LIZIZ = absolutePath;
            C1A67.LLILLJJLI.LL.LIZIZ(absolutePath, "vesdk_models_dir_sp_key", true);
            setEffectResourceFinder(new FileResourceFinder(absolutePath));
            return 0;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return -1;
        }
    }

    public VERuntime() {
        this.mTransitionKeyFrameVersion = -1;
        this.mTransitionFrameCount = 1;
        this.mMaxRenderSize = new VESize(0, 0);
        this.mEnableRefactorRecorder = true;
        this.mEnableCameraGF = true;
        this.mIsInited = false;
        this.mApplogListener = new C2189101Alw(this);
        this.mExceptionMonitorListener = new InterfaceC2189121Aly() { // from class: X.1Alt
            @Override // X.InterfaceC2189121Aly
            public final void onException(Throwable th) {
                InterfaceC2189091Alv interfaceC2189091Alv = this.LIZ.mVEExceptionMonitorListener;
                if (interfaceC2189091Alv != null) {
                    interfaceC2189091Alv.onException(th);
                }
            }
        };
    }

    public static double getVirtualMemInfo() {
        return nativeGetVirtualMemInfo();
    }

    public static boolean isArm64() {
        return nativeIsArm64();
    }

    public static boolean shouldEnableCameraGraph() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("overall isEnableCameraGraph=");
        sbLIZ.append(true);
        C2484209oO.LJI("VERuntime", C2188811AlT.LIZIZ(sbLIZ));
        return true;
    }

    public long getNativeContext() {
        return nativeGetNativeContext();
    }

    public Context getContext() {
        return this.mContext;
    }

    public C1A68 getEnv() {
        return this.mEnv;
    }

    public VESize getMaxRenderSize() {
        return this.mMaxRenderSize;
    }

    public C1293970jmF getResManager() {
        return this.mResManager;
    }

    public int getTransitionFrameCount() {
        return this.mTransitionFrameCount;
    }

    public int getTransitionKeyFrameMode() {
        return this.mTransitionKeyFrameMode;
    }

    public int getTransitionKeyFrameVersion() {
        return this.mTransitionKeyFrameVersion;
    }

    public boolean isEnableAudioCapture() {
        return this.mEnableAudioCapture;
    }

    public boolean isEnableRefactorRecorder() {
        return this.mEnableRefactorRecorder;
    }

    public boolean isGLES3Enabled() {
        return this.mEnableGLES3;
    }

    public boolean isTransitionKeyFrameEnable() {
        return this.mEnableTransitionKeyframe;
    }

    public boolean isUseAssetManager() {
        return this.mUseAssetManager;
    }

    public /* synthetic */ VERuntime(C2189101Alw c2189101Alw) {
        this();
    }

    public static void clearAllFreeMemoryCache(int i) {
        nativeClearAllFreeMemoryCache(i);
    }

    public static void enableAudioSDKApiV2(boolean z) {
        nativeEnableAudioSDKApiV2(z);
    }

    public static void enableCrossPlatGLBaseFBO(boolean z) {
        nativeEnableCrossPlatGLBaseFBO(z);
    }

    public static void enableEffectAudioManagerCallback(boolean z) {
        VEEffectConfig.nativeEnableEffectAudioManagerCallback(z);
    }

    public static void enableMakeupSegmentation(boolean z) {
        VEEffectConfig.nativeEnableMakeupSegmentation(z);
    }

    public static void enableRenderLib(boolean z) {
        nativeEnableRenderLib(z);
    }

    public static void enableRenderLibFBOOpt(boolean z) {
        nativeEnableRenderLibFBOOpt(z);
    }

    private void setContextToEffect(Context context) {
        EffectApplicationInfo.setAppContext(context);
    }

    public void enableABOptimize(boolean z) {
        nativeEnableABOptimize(z);
    }

    public void enableAudioCapture(boolean z) {
        this.mEnableAudioCapture = z;
    }

    public int enableByteVC1Decoder(boolean z) {
        if (!this.mIsInited) {
            C2484209oO.LIZJ("VERuntime", "runtime not init");
            return -108;
        }
        nativeEnableTTByteVC1Decoder(z);
        return 0;
    }

    public void enableCameraGF(boolean z) {
        this.mEnableCameraGF = true;
    }

    public void enableEffectRT(boolean z) {
        VEEffectConfig.enableEffectRT(z);
    }

    public void enableGLES3(boolean z) {
        this.mEnableGLES3 = z;
    }

    public int enableHDMpeg24VP89HWDecoder(boolean z) {
        if (!this.mIsInited) {
            C2484209oO.LIZJ("VERuntime", "runtime not init");
            return -108;
        }
        nativeEnableHDMpeg24VP89HWDecoder(z);
        return 0;
    }

    public int enableImport10BitByteVC1Video(boolean z) {
        if (!this.mIsInited) {
            C2484209oO.LIZJ("VERuntime", "runtime not init");
            return -108;
        }
        nativeEnableImport10BitByteVC1Video(z);
        return 0;
    }

    public void enableRefactorRecorder(boolean z) {
        this.mEnableRefactorRecorder = z;
    }

    public int enableTransitionKeyframe(boolean z) {
        if (!this.mIsInited) {
            C2484209oO.LIZJ("VERuntime", "runtime not init");
            return -108;
        }
        nativeEnableTransitionKeyFrame(z);
        this.mEnableTransitionKeyframe = z;
        return 0;
    }

    public void notifyWillEnterEditor(String str) {
        nativeNotifyWillEnterEditor(str);
    }

    public void registerApplog(InterfaceC2188801AlS interfaceC2188801AlS) {
        this.mVEApplogListener = new WeakReference<>(interfaceC2188801AlS);
        InterfaceC2189151Am1 interfaceC2189151Am1 = this.mApplogListener;
        synchronized (b.class) {
            IESAppLogger.sharedInstance().setAppLogCallback("", new C2189061Als(interfaceC2189151Am1), true);
        }
    }

    public void registerExceptionMonitor(InterfaceC2189091Alv interfaceC2189091Alv) {
        WeakReference<InterfaceC2189121Aly> weakReference;
        this.mVEExceptionMonitorListener = interfaceC2189091Alv;
        InterfaceC2189121Aly interfaceC2189121Aly = this.mExceptionMonitorListener;
        if (interfaceC2189121Aly == null) {
            weakReference = null;
        } else {
            weakReference = new WeakReference<>(interfaceC2189121Aly);
        }
        C2189081Alu.LIZ = weakReference;
    }

    public void setAB(C2189171Am3 c2189171Am3) {
        this.mAB = c2189171Am3;
    }

    public boolean setABbUseBuildinAmazing(boolean z) {
        VEEffectConfig.setABbUseBuildinAmazing(z);
        return true;
    }

    public boolean setAssetManagerEnable(boolean z) {
        this.mUseAssetManager = z;
        if (z) {
            Context context = this.mContext;
            if (context != null) {
                setEffectResourceFinder(new AssetResourceFinder(context.getAssets(), ""));
                return true;
            }
            C2484209oO.LIZ("VERuntime", "mContext is null!!! need init");
            return false;
        }
        return true;
    }

    public boolean setEffectAmazingShareDir(String str) {
        VEEffectConfig.setShareDir(str);
        return true;
    }

    public int setEffectAsynAPI(boolean z) {
        if (this.mEnv == null) {
            return -108;
        }
        VEEffectConfig.nativeSetEffectAsynAPI(z);
        return 0;
    }

    public int setEffectForceDetectFace(boolean z) {
        if (this.mEnv == null) {
            return -108;
        }
        VEEffectConfig.nativeSetEffectForceDetectFace(z);
        return 0;
    }

    public boolean setEffectJsonConfig(String str) {
        VEEffectConfig.setEffectJsonConfig(str);
        return true;
    }

    public boolean setEffectLogLevel(int i) {
        VEEffectConfig.setEffectLogLevel(i);
        return true;
    }

    public boolean setEffectMaxMemoryCache(int i) {
        VEEffectConfig.setEffectMaxMemoryCache(i);
        return true;
    }

    public boolean setEffectResourceFinder(ResourceFinder resourceFinder) {
        VEEffectConfig.setResourceFinder(resourceFinder);
        this.mUseAssetManager = false;
        this.mUseResourceFinder = true;
        VEEffectConfig.configEffect("", "nexus");
        return true;
    }

    public int setEffectSyncTimeDomain(boolean z) {
        if (this.mEnv == null) {
            return -108;
        }
        VEEffectConfig.nativeSetEffectSyncTimeDomain(z);
        return 0;
    }

    public int setEnableStickerAmazing(boolean z) {
        if (this.mEnv == null) {
            return -108;
        }
        VEEffectConfig.nativeSetEnableStickerAmazing(z);
        return 0;
    }

    public int setEnableStickerReleaseTexture(boolean z) {
        if (this.mEnv == null) {
            return -108;
        }
        VEEffectConfig.nativesetEnableStickerReleaseTexture(z);
        return 0;
    }

    public void setEnv(C1A68 c1a68) {
        this.mEnv = c1a68;
    }

    public int setTransitionFrameCount(int i) {
        if (!this.mIsInited) {
            C2484209oO.LIZJ("VERuntime", "runtime not init");
            return -108;
        }
        nativeSetTransitionFrameCount(i);
        this.mTransitionFrameCount = i;
        return 0;
    }

    public int setTransitionKeyFrameMode(int i) {
        if (!this.mIsInited) {
            C2484209oO.LIZJ("VERuntime", "runtime not init");
            return -108;
        }
        nativeSetTransitionKeyFrameMode(i);
        this.mTransitionKeyFrameMode = i;
        return 0;
    }

    public int setTransitionKeyFrameVersion(int i) {
        if (!this.mIsInited) {
            C2484209oO.LIZJ("VERuntime", "runtime not init");
            return -108;
        }
        nativeSetTransitionKeyFrameVersion(i);
        this.mTransitionKeyFrameVersion = i;
        return 0;
    }

    public void setUseNewEffectAlgorithmApi(boolean z) {
        VEEffectConfig.nativeUseNewEffectAlgorithmApi(z);
    }

    public void enableAlgoParamIsForce(boolean z, boolean z2) {
        VEEffectConfig.nativeEnableAlgoParamisForce(z, z2);
    }

    public int enableHDByteVC1HWDecoder(boolean z, int i) {
        if (!this.mIsInited) {
            C2484209oO.LIZJ("VERuntime", "runtime not init");
            return -108;
        }
        if (i <= 720) {
            i = 730;
        }
        nativeEnableHDByteVC1HWDecoder(z, i);
        return 0;
    }

    public int enableHDH264HWDecoder(boolean z, int i) {
        if (!this.mIsInited) {
            C2484209oO.LIZJ("VERuntime", "runtime not init");
            return -108;
        }
        if (i <= 320) {
            i = 330;
        }
        nativeEnableHDH264HWDecoder(z, i);
        return 0;
    }

    public void init(Context context, String str) {
        if (this.mIsInited) {
            return;
        }
        this.mIsInited = true;
        this.mContext = context;
        VEEffectConfig.setCacheDir(C786410Ut5.w2(context).getAbsolutePath());
        TENativeLibsLoader.setContext(context);
        C1A68 c1a68 = new C1A68();
        this.mEnv = c1a68;
        c1a68.LIZ = str;
        this.mAB = new C2189171Am3();
        this.mResManager = new C1293970jmF(getInstance().getEnv().LIZ);
        C2176411AFr c2176411AFr = C1A67.LLILLJJLI.LL;
        this.mSP = c2176411AFr;
        synchronized (c2176411AFr) {
            try {
                if (!c2176411AFr.LIZ) {
                    c2176411AFr.LIZIZ = C810670Vr7.LIZJ(context, 0, context.getPackageName());
                    c2176411AFr.LIZ = true;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        TEPerfStatsInvoker.nativeInit();
        ApplogUtilsInvoker.nativeInit(VEVersionUtil.getVESDKVersion());
        TEEditorInfoInvoker.nativeInit();
        C1284730jXL.LIZIZ = new ConcurrentHashMap<>();
        initConfig();
        EffectApplicationInfo.setAppContext(context);
    }

    public void setMaxRenderSize(int i, int i2) {
        VESize vESize = this.mMaxRenderSize;
        vESize.width = i;
        vESize.height = i2;
    }

    public int setPageModeCodecConfig(C2189111Alx c2189111Alx, C2189111Alx c2189111Alx2) {
        if (!this.mIsInited) {
            C2484209oO.LIZJ("VERuntime", "runtime not init");
            return -108;
        }
        if (c2189111Alx != null) {
            nativeSetPageModeH264CodecConfig(c2189111Alx.LIZ, c2189111Alx.LIZIZ, c2189111Alx.LIZJ, c2189111Alx.LIZLLL);
        }
        if (c2189111Alx2 != null) {
            nativeSetPageModeByteVC1CodecConfig(c2189111Alx2.LIZ, c2189111Alx2.LIZIZ, c2189111Alx2.LIZJ, c2189111Alx2.LIZLLL);
            return 0;
        }
        return 0;
    }

    public void init(Context context, C1A68 c1a68) {
        if (this.mIsInited) {
            return;
        }
        this.mContext = context;
        VEEffectConfig.setCacheDir(C786410Ut5.w2(context).getAbsolutePath());
        this.mEnv = c1a68;
        this.mAB = new C2189171Am3();
        TENativeLibsLoader.setContext(context);
        this.mResManager = new C1293970jmF(getInstance().getEnv().LIZ);
        C2176411AFr c2176411AFr = C1A67.LLILLJJLI.LL;
        this.mSP = c2176411AFr;
        synchronized (c2176411AFr) {
            try {
                if (!c2176411AFr.LIZ) {
                    c2176411AFr.LIZIZ = C810670Vr7.LIZJ(context, 0, context.getPackageName());
                    c2176411AFr.LIZ = true;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        TEPerfStatsInvoker.nativeInit();
        TEEditorInfoInvoker.nativeInit();
        C1284730jXL.LIZIZ = new ConcurrentHashMap<>();
        initConfig();
    }

    public int enableHighFpsByteVC1HWDecoder(boolean z, int i, int i2) {
        if (!this.mIsInited) {
            C2484209oO.LIZJ("VERuntime", "runtime not init");
            return -108;
        }
        nativeEnableHighFpsByteVC1HWDecoder(z, i, i2);
        return 0;
    }

    public int enableHighFpsH264HWDecoder(boolean z, int i, int i2) {
        if (!this.mIsInited) {
            C2484209oO.LIZJ("VERuntime", "runtime not init");
            return -108;
        }
        nativeEnableHighFpsH264HWDecoder(z, i, i2);
        return 0;
    }
}
