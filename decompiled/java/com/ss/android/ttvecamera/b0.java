package com.ss.android.ttvecamera;

import X.C08FF;
import X.C1286570jaJ;
import X.C1305780k5I;
import X.C1321640kUs;
import X.C1AIY;
import X.C1DJ6;
import X.C1DJB;
import X.C1DJG;
import X.C1DJI;
import X.C1DJK;
import X.C1DJL;
import X.C1DJM;
import X.C1DJN;
import X.C1DJO;
import X.C1DJP;
import X.C1DJS;
import X.C1DJT;
import X.C1DJU;
import X.C1DJV;
import X.C1DJX;
import X.C1DJY;
import X.C1DN3;
import X.C1DNM;
import X.C20188413z0;
import X.C2183321Acc;
import X.C2183341Ace;
import X.C2186291AhP;
import X.C2186341AhU;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C786410Ut5;
import X.EnumC1270990jBB;
import X.EnumC2186171AhD;
import X.EnumC2244671CtN;
import X.InterfaceC1271000jBC;
import X.InterfaceC1281910jSn;
import X.InterfaceC1283620jVY;
import X.InterfaceC1286930jat;
import X.InterfaceC1286940jau;
import X.InterfaceC1286950jav;
import X.InterfaceC1287190jbJ;
import X.InterfaceC2186141AhA;
import X.InterfaceC2186151AhB;
import X.InterfaceC2186211AhH;
import X.InterfaceC2186271AhN;
import X.InterfaceC2186281AhO;
import X.InterfaceC2186331AhT;
import X.InterfaceC2186351AhV;
import X.InterfaceC2186371AhX;
import X.InterfaceC2254691DMt;
import X.InterfaceC2254701DMu;
import Y.ARunnableS102S0200000_33;
import Y.ARunnableS104S0200000_35;
import Y.ARunnableS106S0000000_33;
import Y.ARunnableS133S0100000_33;
import Y.ARunnableS13S0102000_33;
import Y.ARunnableS13S0301000_20;
import Y.ARunnableS17S0200100_20;
import Y.ARunnableS21S0210000_20;
import Y.ARunnableS26S0201000_20;
import Y.ARunnableS2S0310100_20;
import Y.ARunnableS37S0201000_33;
import Y.ARunnableS3S0200001_20;
import Y.ARunnableS3S0400100_20;
import Y.ARunnableS44S0101000_33;
import Y.ARunnableS53S0300000_20;
import Y.ARunnableS66S0300000_33;
import Y.ARunnableS89S0200000_20;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Printer;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ttvecamera.b0;
import com.ss.android.ttvecamera.cameraalgorithm.TECameraAlgorithmParam;
import com.ss.android.vesdk.VEConfigCenter;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes36.dex */
public final class b0 {
    public static final b0 INSTANCE;
    public static boolean LLJJIJIIJIL;
    public static final /* synthetic */ b0[] LLJJIJIL;
    public HandlerThread LL;
    public float LLILLL;
    public InterfaceC2186151AhB LLILZ;
    public C20188413z0 LLILZIL;
    public volatile boolean LLIZ;
    public volatile boolean LLIZLLLIL;
    public final C1DJY LLJJI;
    public final C1DJO LLJJIII;
    public final C1305780k5I LLJJIJI;
    public TECameraCapture mCameraClient;
    public volatile C1DJK mCameraInstance;
    public C1DJ6 mCameraSettings;
    public Runnable mCheckCloseTask;
    public C1DJS mFpsConfigCallback;
    public Handler mHandler;
    public volatile boolean mIsCameraPendingClose;
    public C1DJT mPictureSizeCallback;
    public C1DJU mSATZoomCallback;
    public volatile boolean LLILLJJLI = true;
    public C1DJP mCameraObserver = new C1DJI();
    public InterfaceC1271000jBC mPreviewSizeCallback = null;
    public C1DJB mCameraCaptureUpdateCallback = null;
    public final Object mStateLock = new Object();
    public volatile int mCurrentCameraState = 0;
    public final Object LLILZLL = new Object();
    public volatile int LLJ = 0;
    public long mOpenTime = 0;
    public long mBeginTime = 0;
    public int mRetryCnt = -1;
    public boolean mStartPreviewError = false;
    public C1DJM LLJI = null;
    public final ConditionVariable mCameraClientCondition = new ConditionVariable(true);
    public final ConcurrentHashMap<String, String> mOpenInfoMap = new ConcurrentHashMap<>();
    public Handler mMainHandler = new BPEAHandler(Looper.getMainLooper());
    public Cert cachedOpenPrivacyCert = null;
    public Cert cachedClosePrivacyCert = null;
    public boolean LLJIJIL = false;
    public boolean mFirstEC = true;
    public boolean mFirstZoom = true;
    public boolean mbCameraUnitFallbackToCamera2 = false;
    public int LLJILJIL = -1;
    public volatile boolean LLJILJILJ = false;
    public int LLJILLL = 0;
    public boolean mbNeedDestroy = false;
    public boolean LLJJ = false;
    public InterfaceC2254691DMt mCameraEvent = new C1DJL(this);

    public final synchronized void LJII() {
        int i = this.LLJ;
        this.LLJ++;
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("increaseClientCount, old=");
        sbLIZ.append(i);
        sbLIZ.append(", new=");
        sbLIZ.append(this.LLJ);
        C2183341Ace.LIZLLL("TECameraServer", C2188811AlT.LIZIZ(sbLIZ));
    }

    public void changeCaptureFormat() {
    }

    public synchronized int decreaseClientCount() {
        int i = this.LLJ;
        this.LLJ--;
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("decreaseClientCount, old=");
        sbLIZ.append(i);
        sbLIZ.append(", new=");
        sbLIZ.append(this.LLJ);
        C2183341Ace.LIZLLL("TECameraServer", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LLJ < 0) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Invalid ClientCount, old=");
            sbLIZ2.append(i);
            sbLIZ2.append(", new=");
            sbLIZ2.append(this.LLJ);
            sbLIZ2.append(", reset to 0");
            C2183341Ace.LJ("TECameraServer", C2188811AlT.LIZIZ(sbLIZ2));
            this.LLJ = 0;
        }
        return this.LLJ;
    }

    public synchronized int destroy() {
        int i = C2187451AjH.LIZ;
        C2183341Ace.LIZLLL("TECameraServer", "destroy...start");
        this.LLIZ = false;
        this.mbNeedDestroy = false;
        Runnable runnable = this.mCheckCloseTask;
        if (runnable != null) {
            this.mMainHandler.removeCallbacks(runnable);
        }
        this.mCheckCloseTask = null;
        this.mCameraClient = null;
        this.mPictureSizeCallback = null;
        this.mPreviewSizeCallback = null;
        this.LLILZ = null;
        this.LLILZIL = null;
        this.mCameraCaptureUpdateCallback = null;
        this.cachedClosePrivacyCert = null;
        this.cachedOpenPrivacyCert = null;
        C1DJK c1djk = this.mCameraInstance;
        Handler handler = this.mHandler;
        if (handler != null) {
            C786410Ut5.LJJZZIII(handler, new ARunnableS133S0100000_33(c1djk, 37));
        }
        this.mCameraInstance = null;
        HandlerThread handlerThread = this.LL;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            this.LL = null;
            this.LLILLJJLI = true;
            this.mHandler = null;
        }
        this.mCameraObserver = C1DJI.LIZ();
        C2183341Ace.LIZLLL("TECameraServer", "destroy...end");
        return 0;
    }

    public int getCameraState() {
        return getCameraState(false);
    }

    static {
        b0 b0Var = new b0();
        INSTANCE = b0Var;
        LLJJIJIL = new b0[]{b0Var};
        LLJJIJIIJIL = true;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [X.1DJO] */
    public b0() {
        new C1DJV(this);
        this.LLJJI = new C1DJY(this);
        this.LLJJIII = new InterfaceC2186371AhX() { // from class: X.1DJO
            @Override // X.InterfaceC2186371AhX
            public final void LJ() {
                C1DJT c1djt = this.LIZ.mPictureSizeCallback;
                if (c1djt != null) {
                    ((C1DJ8) c1djt).LIZ.getClass();
                }
            }
        };
        this.LLJJIJI = new C1305780k5I(this);
        new Object() { // from class: X.1DJR
        };
    }

    public static b0[] values() {
        return (b0[]) LLJJIJIL.clone();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1DJK LJFF() {
        /*
            Method dump skipped, instruction units count: 473
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ttvecamera.b0.LJFF():X.1DJK");
    }

    public int[] getCameraCaptureSize() {
        if (this.mCameraInstance == null) {
            return null;
        }
        return this.mCameraInstance.LJLJJI();
    }

    public float getCameraFps() {
        if (this.mCameraInstance != null) {
            return this.mCameraInstance.L4();
        }
        return 0.0f;
    }

    public int getFrameInfo() {
        if (this.mCameraInstance != null) {
            return this.mCameraInstance.LJIIZILJ();
        }
        return -1;
    }

    public int[] getPreviewFps() {
        if (this.mCameraInstance == null) {
            return null;
        }
        return this.mCameraInstance.LJII();
    }

    public int getSessionCameraFpsEligibleCount() {
        if (this.mCameraInstance != null) {
            return this.mCameraInstance.LJJIJL();
        }
        return -1;
    }

    public int getSessionCameraFpsLowerCount() {
        if (this.mCameraInstance != null) {
            return this.mCameraInstance.LJJJ();
        }
        return -1;
    }

    public int getSessionCameraFpsRestoreCount() {
        if (this.mCameraInstance != null) {
            return this.mCameraInstance.LJIILIIL();
        }
        return -1;
    }

    public int getSessionCameraFpsUpdateCount() {
        if (this.mCameraInstance != null) {
            return this.mCameraInstance.LJJIII();
        }
        return 0;
    }

    public void handlePreviewingFallback() {
        boolean z;
        if (this.mCameraSettings.LLILLJJLI == 1) {
            return;
        }
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handlePreviewingFallback begin, settings=");
        sbLIZ.append(cameraSettingsForLog(this.mCameraSettings));
        C2183341Ace.LIZIZ("TECameraServer", C2188811AlT.LIZIZ(sbLIZ));
        synchronized (this.mStateLock) {
            try {
                if (this.mCurrentCameraState == 3) {
                    if (this.mCameraInstance != null) {
                        this.mCameraInstance.stopCapture();
                        updateCameraState(4);
                        C1DJK c1djk = this.mCameraInstance;
                        Cert certLJJJLL = this.cachedClosePrivacyCert;
                        if (certLJJJLL == null) {
                            certLJJJLL = this.mCameraInstance.LJJJLL(EnumC1270990jBB.EXCEPTION_CLOSE_CAMERA);
                        }
                        c1djk.LJI(certLJJJLL);
                        C2183341Ace.LIZLLL("TECameraServer", "handlePreviewingFallback closed old camera instance, set instance null");
                        this.mCameraInstance = null;
                        updateCameraState(0);
                    }
                    z = true;
                } else {
                    z = false;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (z) {
            this.mCameraSettings.LLILLJJLI = 1;
            this.mCameraEvent.LJ(51, 0, "need recreate surfacetexture");
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("handlePreviewingFallback reopen camera1, settings=");
            sbLIZ2.append(cameraSettingsForLog(this.mCameraSettings));
            C2183341Ace.LIZIZ("TECameraServer", C2188811AlT.LIZIZ(sbLIZ2));
            INSTANCE.open(this.mCameraClient, this.mCameraSettings, this.cachedOpenPrivacyCert);
        }
    }

    public boolean isCameraPermitted() {
        boolean zLJIILJJIL = C2183321Acc.LJIILJJIL(this.mCameraSettings.LL);
        ConcurrentHashMap<String, String> concurrentHashMap = this.mOpenInfoMap;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CamPerm-");
        sbLIZ.append(this.mRetryCnt);
        concurrentHashMap.put(C2188811AlT.LIZIZ(sbLIZ), String.valueOf(zLJIILJJIL));
        return zLJIILJJIL;
    }

    public int startRecording() {
        if (this.mCameraInstance == null) {
            return -100;
        }
        return this.mCameraInstance.LJIJJ();
    }

    public int stopRecording() {
        if (this.mCameraInstance == null) {
            return -100;
        }
        return this.mCameraInstance.LIZJ();
    }

    public boolean isCameraSwitchState() {
        return this.LLJILJILJ;
    }

    public static b0 valueOf(String str) {
        return (b0) C08FF.LIZ(b0.class, str);
    }

    public final boolean LIZJ(TECameraCapture tECameraCapture) {
        synchronized (this.LLILZLL) {
            try {
                TECameraCapture tECameraCapture2 = this.mCameraClient;
                if (tECameraCapture2 != tECameraCapture) {
                    if (tECameraCapture2 != null) {
                        int i = C2187451AjH.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Invalid CameraClient, need : ");
                        sbLIZ.append(this.mCameraClient);
                        C2183341Ace.LJ("TECameraServer", C2188811AlT.LIZIZ(sbLIZ));
                    } else {
                        int i2 = C2187451AjH.LIZ;
                        C2183341Ace.LJ("TECameraServer", "Internal CameraClient is null. Must call connect first!");
                    }
                    return false;
                }
                return true;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final BPEAHandler LJI(boolean z) {
        Looper mainLooper;
        boolean zBooleanValue = VEConfigCenter.getInstance().getValue("ve_boost_camera_thread_priority", false).booleanValue();
        try {
            HandlerThread handlerThread = this.LL;
            if (handlerThread != null) {
                handlerThread.quit();
            }
            HandlerThread handlerThread2 = new HandlerThread("TECameraServer");
            handlerThread2.start();
            if (!z) {
                C786410Ut5.LJIIZILJ(C786410Ut5.W2(handlerThread2), new Printer() { // from class: X.0kVx
                    public long LL;
                    public long LLILLJJLI;

                    @Override // android.util.Printer
                    public final void println(String str) {
                        if (str.startsWith(">>>>> Dispatching to Handler")) {
                            this.LL = System.currentTimeMillis();
                            return;
                        }
                        if (!str.startsWith("<<<<< Finished to Handler")) {
                            return;
                        }
                        long jCurrentTimeMillis = System.currentTimeMillis() - this.LL;
                        if (jCurrentTimeMillis <= 1000 || jCurrentTimeMillis <= this.LLILLJJLI) {
                            return;
                        }
                        this.LLILLJJLI = jCurrentTimeMillis;
                        int i = C2187451AjH.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("task: ");
                        sbLIZ.append(str);
                        sbLIZ.append(", cost: ");
                        sbLIZ.append(jCurrentTimeMillis);
                        sbLIZ.append("ms");
                        C2183341Ace.LIZLLL("TECameraServer", C2188811AlT.LIZIZ(sbLIZ));
                    }
                });
            }
            this.LL = handlerThread2;
            BPEAHandler bPEAHandler = new BPEAHandler(C786410Ut5.W2(handlerThread2), new Handler.Callback(this) { // from class: X.1AhM
                public final WeakReference<b0> LL;

                {
                    this.LL = new WeakReference<>(this);
                }

                @Override // android.os.Handler.Callback
                public final boolean handleMessage(Message message) {
                    int i = message.what;
                    Object messageObj = HandlerHook.getMessageObj(message.obj);
                    b0 b0Var = this.LL.get();
                    if (i != 1) {
                        return false;
                    }
                    int i2 = C2187451AjH.LIZ;
                    C2183341Ace.LIZ("TECameraServer", "startZoom...");
                    synchronized (b0Var.mStateLock) {
                        try {
                            if (b0Var.mCameraInstance != null) {
                                b0Var.mCameraInstance.LJIILJJIL(message.arg1 / 100.0f, (InterfaceC2254701DMu) messageObj);
                            }
                            if (b0Var.mFirstZoom) {
                                b0Var.mCameraEvent.LJ(114, 0, "startzoom");
                                b0Var.mFirstZoom = false;
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                    return false;
                }
            });
            if (zBooleanValue) {
                C786410Ut5.LJJZZIII(bPEAHandler, new ARunnableS106S0000000_33(2));
            }
            return bPEAHandler;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("CreateHandler failed!: ");
            sbLIZ.append(e.toString());
            C2183341Ace.LIZIZ("TECameraServer", C2188811AlT.LIZIZ(sbLIZ));
            if (Looper.myLooper() != null) {
                mainLooper = Looper.myLooper();
            } else {
                mainLooper = Looper.getMainLooper();
            }
            BPEAHandler bPEAHandler2 = new BPEAHandler(mainLooper);
            if (zBooleanValue) {
                C786410Ut5.LJJZZIII(bPEAHandler2, new ARunnableS106S0000000_33(1));
            }
            return bPEAHandler2;
        }
    }

    public final synchronized void LJIIIZ(C1DJ6 c1dj6) {
        if (this.LLIZ) {
            return;
        }
        this.mHandler = LJI(c1dj6.LLLLZI);
        this.LLILLJJLI = false;
        this.LLIZ = true;
        this.mbCameraUnitFallbackToCamera2 = false;
        this.LLILLL = 0.0f;
        this.LLJIJIL = false;
        this.mMainHandler = new BPEAHandler(Looper.getMainLooper());
        this.mbNeedDestroy = false;
    }

    public final void LJIIJ(C1DJ6 c1dj6) {
        C1DJ6 c1dj62 = this.mCameraSettings;
        if (c1dj62 != null && c1dj62.LLILZ == 0 && c1dj6.LLILZ == 0 && c1dj62.LLILLJJLI == 11) {
            int i = c1dj6.LLILLJJLI;
        }
    }

    public final boolean LJIIJJI(C1DJ6 c1dj6) {
        C1DJ6 c1dj62;
        boolean z;
        boolean z2;
        boolean z3;
        C1AIY c1aiy;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("shouldReOpenCamera, currentSettings=");
        sbLIZ.append(cameraSettingsForLog(this.mCameraSettings));
        sbLIZ.append(", newSettings=");
        sbLIZ.append(cameraSettingsForLog(c1dj6));
        C2183341Ace.LIZLLL("TECameraServer", C2188811AlT.LIZIZ(sbLIZ));
        C1DJ6 c1dj63 = this.mCameraSettings;
        if (c1dj63 == null) {
            return false;
        }
        if (c1dj63.LLILLJJLI == c1dj6.LLILLJJLI && c1dj63.LLILZ == c1dj6.LLILZ && c1dj63.LLLJL == c1dj6.LLLJL && c1dj63.LLL == c1dj6.LLL && c1dj63.LLJJJJLIIL == c1dj6.LLJJJJLIIL && c1dj63.LLJLLIL == c1dj6.LLJLLIL) {
            int i2 = c1dj63.LLJZIJLIL;
            int i3 = c1dj6.LLJZIJLIL;
            if (i2 == i3 && ((i3 != 2 || ((c1aiy = c1dj63.LLLLZLL) != null && c1aiy.LIZ.ordinal() == c1dj6.LLLLZLL.LIZ.ordinal() && this.mCameraSettings.LLLLZLL.LIZIZ.ordinal() == c1dj6.LLLLZLL.LIZIZ.ordinal() && this.mCameraSettings.LLLLZLL.LIZJ.ordinal() == c1dj6.LLLLZLL.LIZJ.ordinal() && this.mCameraSettings.LLLLZLL.LIZLLL.ordinal() == c1dj6.LLLLZLL.LIZLLL.ordinal() && this.mCameraSettings.LLLLZLL.LJ.ordinal() == c1dj6.LLLLZLL.LJ.ordinal() && this.mCameraSettings.LLLLZLL.LJFF.ordinal() == c1dj6.LLLLZLL.LJFF.ordinal())) && (z = (c1dj62 = this.mCameraSettings).LLJJIJI) == (z2 = c1dj6.LLJJIJI))) {
                if (z && z2) {
                    TEFrameSizei tEFrameSizei = c1dj62.LLJJJIL;
                    int i4 = tEFrameSizei.width;
                    TEFrameSizei tEFrameSizei2 = c1dj6.LLJJJIL;
                    if (i4 == tEFrameSizei2.width && tEFrameSizei.height == tEFrameSizei2.height) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if (this.mCameraInstance != null && this.mCameraInstance.LJJIJLIJ() != null) {
                        for (C1DN3 c1dn3 : this.mCameraInstance.LJJIJLIJ().LIZLLL()) {
                            if (c1dn3.LIZLLL) {
                                TEFrameSizei tEFrameSizei3 = c1dn3.LJII.LIZIZ;
                                int i5 = tEFrameSizei3.width;
                                TEFrameSizei tEFrameSizei4 = c1dj6.LLJJJIL;
                                if (i5 == tEFrameSizei4.width && tEFrameSizei3.height == tEFrameSizei4.height) {
                                    int i6 = C2187451AjH.LIZ;
                                    C2183341Ace.LIZLLL("TECameraServer", "no need to reopen");
                                    return false;
                                }
                            }
                        }
                    }
                    if (!z3) {
                        return false;
                    }
                } else {
                    TEFrameSizei tEFrameSizei5 = c1dj62.LLJJJIL;
                    int i7 = tEFrameSizei5.width;
                    TEFrameSizei tEFrameSizei6 = c1dj6.LLJJJIL;
                    if (i7 == tEFrameSizei6.width && tEFrameSizei5.height == tEFrameSizei6.height) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public int abortSession(TECameraCapture tECameraCapture) {
        if (!LIZJ(tECameraCapture)) {
            return -108;
        }
        Handler handler = this.mHandler;
        if (handler == null) {
            int i = C2187451AjH.LIZ;
            C2183341Ace.LIZIZ("TECameraServer", "abortSession, mHandler is null!");
            return -112;
        }
        C786410Ut5.LJJZZIII(handler, new ARunnableS133S0100000_33(this, 33));
        return 0;
    }

    public void addCameraAlgorithm(TECameraAlgorithmParam tECameraAlgorithmParam) {
        if (this.mCameraInstance == null) {
            int i = C2187451AjH.LIZ;
            C2183341Ace.LIZIZ("TECameraServer", "addCameraAlgorithm failed mCameraInstance is null!");
        } else {
            this.mCameraInstance.LJIJ(tECameraAlgorithmParam);
        }
    }

    public void appLifeCycleChanged(boolean z) {
        this.LLJIJIL = z;
    }

    public String cameraSettingsForLog(C1DJ6 c1dj6) {
        String strLIZIZ = "null";
        if (c1dj6 == null) {
            return "null";
        }
        if (c1dj6.LLJJJIL != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(c1dj6.LLJJJIL.width);
            sbLIZ.append("x");
            sbLIZ.append(c1dj6.LLJJJIL.height);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("{type=");
        sbLIZ2.append(c1dj6.LLILLJJLI);
        sbLIZ2.append(", facing=");
        sbLIZ2.append(c1dj6.LLILZ);
        sbLIZ2.append(", mode=");
        sbLIZ2.append(c1dj6.LLJZIJLIL);
        sbLIZ2.append(", preview=");
        sbLIZ2.append(strLIZIZ);
        sbLIZ2.append(", multiSurface=");
        sbLIZ2.append(c1dj6.LLJJIJI);
        sbLIZ2.append("}");
        return C2188811AlT.LIZIZ(sbLIZ2);
    }

    public int cancelFocus(TECameraCapture tECameraCapture) {
        if (!LIZJ(tECameraCapture)) {
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            C786410Ut5.LJJZZIII(this.mHandler, new ARunnableS89S0200000_20(this, tECameraCapture, 47));
            return 0;
        }
        int i = C2187451AjH.LIZ;
        C2183341Ace.LIZLLL("TECameraServer", "cancelFocus...");
        synchronized (this.mStateLock) {
            try {
                if (this.mCameraInstance != null) {
                    this.mCameraInstance.LJIIIIZZ();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return 0;
    }

    public int close(Cert cert) {
        return close(true, cert);
    }

    public synchronized void collectCameraCapabilities(Runnable runnable) {
        if (this.mHandler == null) {
            return;
        }
        if (!this.LLILLJJLI && Looper.myLooper() != this.mHandler.getLooper()) {
            C786410Ut5.LJJZZIII(this.mHandler, new ARunnableS104S0200000_35(this, runnable, 5));
        } else {
            synchronized (this.mStateLock) {
                try {
                    if (this.mCameraInstance != null) {
                        this.mCameraInstance.LJJZ();
                        if (runnable != null) {
                            runnable.run();
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    public boolean couldForwardState(int i) {
        if (i == this.mCurrentCameraState) {
            int i2 = C2187451AjH.LIZ;
            C2183341Ace.LJ("TECameraServer", "No need this");
        }
        if (i != 0) {
            if (i != 1) {
                if (i != 2 && i != 3) {
                    int i3 = C2187451AjH.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Invalidate camera state = ");
                    sbLIZ.append(i);
                    C2183341Ace.LIZIZ("TECameraServer", C2188811AlT.LIZIZ(sbLIZ));
                    return false;
                }
                if (this.mCurrentCameraState == 1) {
                    return true;
                }
                return false;
            }
            if (this.mCurrentCameraState != 0) {
                int i4 = C2187451AjH.LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("No need open camera again, state = ");
                sbLIZ2.append(this.mCurrentCameraState);
                C2183341Ace.LJ("TECameraServer", C2188811AlT.LIZIZ(sbLIZ2));
            }
        }
        return true;
    }

    public void downExposureCompensation(TECameraCapture tECameraCapture) {
        if (!LIZJ(tECameraCapture)) {
            return;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            C786410Ut5.LJJZZIII(this.mHandler, new ARunnableS89S0200000_20(this, tECameraCapture, 51));
            return;
        }
        int i = C2187451AjH.LIZ;
        C2183341Ace.LIZLLL("TECameraServer", "downExposureCompensation...");
        synchronized (this.mStateLock) {
            try {
                if ((this.mCurrentCameraState == 3 || this.mCurrentCameraState == 2) && this.mCameraInstance != null) {
                    if (this.mCameraInstance.getCameraECInfo() == null) {
                        this.mCameraObserver.onError(-112, "downExposureCompensation get ec info failed");
                        return;
                    } else {
                        this.mCameraInstance.setExposureCompensation(r0.LIZIZ - 1);
                        return;
                    }
                }
                C1DJP c1djp = this.mCameraObserver;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Can not set ec on state : ");
                sbLIZ.append(this.mCurrentCameraState);
                c1djp.onError(-105, C2188811AlT.LIZIZ(sbLIZ));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public int enableCaf(TECameraCapture tECameraCapture) {
        if (!LIZJ(tECameraCapture)) {
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            C786410Ut5.LJJZZIII(this.mHandler, new ARunnableS89S0200000_20(this, tECameraCapture, 48));
            return 0;
        }
        int i = C2187451AjH.LIZ;
        C2183341Ace.LIZLLL("TECameraServer", "enableCaf...");
        synchronized (this.mStateLock) {
            try {
                if (this.mCameraInstance != null) {
                    this.mCameraInstance.LJJIL();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return 0;
    }

    public long getAvgExpTime(boolean z) {
        if (this.mCameraInstance != null) {
            return this.mCameraInstance.LJLJLJ(z);
        }
        return 0L;
    }

    public C1286570jaJ getCameraECInfo(TECameraCapture tECameraCapture) {
        if (!LIZJ(tECameraCapture) || this.mCameraInstance == null) {
            return null;
        }
        return this.mCameraInstance.getCameraECInfo();
    }

    public int getCameraState(boolean z) {
        int i;
        if (z) {
            synchronized (this.mStateLock) {
                try {
                    i = this.mCurrentCameraState;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            return i;
        }
        return this.mCurrentCameraState;
    }

    public int getExposureCompensation(TECameraCapture tECameraCapture) {
        if (LIZJ(tECameraCapture)) {
            synchronized (this.mStateLock) {
                try {
                    if ((this.mCurrentCameraState == 3 || this.mCurrentCameraState == 2) && this.mCameraInstance != null) {
                        return this.mCameraInstance.LJIIIZ();
                    }
                    C1DJP c1djp = this.mCameraObserver;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Can not get ec on state : ");
                    sbLIZ.append(this.mCurrentCameraState);
                    c1djp.onError(-105, C2188811AlT.LIZIZ(sbLIZ));
                    return -105;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        throw new RuntimeException("Client is not connected!!!");
    }

    public int getFlashMode(TECameraCapture tECameraCapture) {
        if (this.mCameraInstance == null) {
            return -1;
        }
        return this.mCameraInstance.getFlashMode();
    }

    public int[] getPictureSize(TECameraCapture tECameraCapture) {
        if (!LIZJ(tECameraCapture) || this.mCameraInstance == null) {
            return null;
        }
        return this.mCameraInstance.LJ();
    }

    public float getSessionAverageCameraFPS(boolean z) {
        if (this.mCameraInstance != null) {
            return this.mCameraInstance.LJLL(z);
        }
        return 0.0f;
    }

    public float getSessionAverageExposureTime(boolean z) {
        if (this.mCameraInstance != null) {
            return this.mCameraInstance.J4(z);
        }
        return 0.0f;
    }

    public float getSessionAverageISO(boolean z) {
        if (this.mCameraInstance != null) {
            return this.mCameraInstance.M4(z);
        }
        return 0.0f;
    }

    public List<TEFrameSizei> getSupportedPictureSizes(TECameraCapture tECameraCapture) {
        if (!LIZJ(tECameraCapture) || this.mCameraInstance == null) {
            return null;
        }
        try {
            return this.mCameraInstance.LJJJJI();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            int i = C2187451AjH.LIZ;
            C2183341Ace.LJFF("TECameraServer", "getSupportedPictureSizes, exception occured.", e);
            return null;
        }
    }

    public List<TEFrameSizei> getSupportedPreviewSizes(TECameraCapture tECameraCapture) {
        if (!LIZJ(tECameraCapture) || this.mCameraInstance == null) {
            return null;
        }
        try {
            return this.mCameraInstance.LJJLIIJ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            int i = C2187451AjH.LIZ;
            C2183341Ace.LJFF("TECameraServer", "getSupportedPreviewSizes, exception occured.", e);
            return null;
        }
    }

    public boolean isAutoExposureLockSupported(TECameraCapture tECameraCapture) {
        if (!LIZJ(tECameraCapture)) {
            return false;
        }
        synchronized (this.mStateLock) {
            try {
                if ((this.mCurrentCameraState == 3 || this.mCurrentCameraState == 2) && this.mCameraInstance != null) {
                    return this.mCameraInstance.LJLIIIL();
                }
                int i = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Can not get ae lock supported on state : ");
                sbLIZ.append(this.mCurrentCameraState);
                C2183341Ace.LJ("TECameraServer", C2188811AlT.LIZIZ(sbLIZ));
                return false;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public boolean isAutoFocusLockSupported(TECameraCapture tECameraCapture) {
        if (!LIZJ(tECameraCapture)) {
            return false;
        }
        synchronized (this.mStateLock) {
            try {
                if ((this.mCurrentCameraState == 3 || this.mCurrentCameraState == 2) && this.mCameraInstance != null) {
                    return this.mCameraInstance.LJJLIIIJJIZ();
                }
                int i = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Can not get ae lock supported on state : ");
                sbLIZ.append(this.mCurrentCameraState);
                C2183341Ace.LJ("TECameraServer", C2188811AlT.LIZIZ(sbLIZ));
                return false;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public boolean isHDR10BitSupported(TECameraCapture tECameraCapture) {
        C1DJK c1djk;
        if (!LIZJ(tECameraCapture) || (c1djk = this.mCameraInstance) == null || !c1djk.LJJLJLI()) {
            return false;
        }
        return true;
    }

    public boolean isSupportWhileBalance(TECameraCapture tECameraCapture) {
        boolean z = false;
        if (!LIZJ(tECameraCapture)) {
            return false;
        }
        synchronized (this.mStateLock) {
            try {
                if (this.mCameraInstance != null && this.mCameraInstance.LJJJI()) {
                    z = true;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return z;
    }

    public boolean isSupportedExposureCompensation(TECameraCapture tECameraCapture) {
        if (!LIZJ(tECameraCapture)) {
            return false;
        }
        if ((this.mCurrentCameraState == 3 || this.mCurrentCameraState == 2) && this.mCameraInstance != null) {
            return this.mCameraInstance.isSupportedExposureCompensation();
        }
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Can not set ec on state : ");
        sbLIZ.append(this.mCurrentCameraState);
        C2183341Ace.LJ("TECameraServer", C2188811AlT.LIZIZ(sbLIZ));
        return false;
    }

    public boolean isTorchSupported(TECameraCapture tECameraCapture) {
        C1DJK c1djk;
        if (!LIZJ(tECameraCapture) || (c1djk = this.mCameraInstance) == null || !c1djk.LIZLLL()) {
            return false;
        }
        return true;
    }

    public synchronized void needToReleaseSurfaceTexture(boolean z) {
        if (this.mCameraInstance == null) {
            int i = C2187451AjH.LIZ;
            C2183341Ace.LIZIZ("TECameraServer", "can not release SurfaceTexture, cameraInstance is null");
            return;
        }
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("needToReleaseSurfaceTexture, needRelease = ");
        sbLIZ.append(z);
        C2183341Ace.LIZLLL("TECameraServer", C2188811AlT.LIZIZ(sbLIZ));
        this.mCameraInstance.LJJJJZI(z);
    }

    public TECameraFrame processAlgorithm(TECameraFrame tECameraFrame) {
        if (this.mCameraInstance == null) {
            int i = C2187451AjH.LIZ;
            C2183341Ace.LIZIZ("TECameraServer", "processAlgorithm failed mCameraInstance is null!");
            return null;
        }
        return this.mCameraInstance.LJJIIZ(tECameraFrame);
    }

    public int realCloseCamera(Cert cert) {
        boolean z;
        int iLJI;
        synchronized (this.mStateLock) {
            try {
                int i = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("realCloseCamera begin, state=");
                sbLIZ.append(this.mCurrentCameraState);
                C2183341Ace.LIZLLL("TECameraServer", C2188811AlT.LIZIZ(sbLIZ));
                C1DJ6 c1dj6 = this.mCameraSettings;
                if (c1dj6 != null && c1dj6.LLLLLLIL) {
                    z = true;
                } else {
                    z = false;
                }
                C1DJK c1djk = this.mCameraInstance;
                if (this.mCurrentCameraState == 0) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("realCloseCamera, no need to close camera, state: ");
                    sbLIZ2.append(this.mCurrentCameraState);
                    C2183341Ace.LJ("TECameraServer", C2188811AlT.LIZIZ(sbLIZ2));
                    iLJI = -423;
                } else {
                    updateCameraState(4);
                    if (c1djk != null) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        iLJI = c1djk.LJI(cert);
                        if (iLJI == -114) {
                            this.mbNeedDestroy = true;
                        }
                        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("system call close() cost: ");
                        sbLIZ3.append(jCurrentTimeMillis2);
                        sbLIZ3.append(", ret=");
                        sbLIZ3.append(iLJI);
                        C2183341Ace.LIZLLL("TECameraServer", C2188811AlT.LIZIZ(sbLIZ3));
                    } else {
                        iLJI = 0;
                    }
                    if (z && (this.mCurrentCameraState != 4 || this.mCurrentCameraState != 0)) {
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("realCloseCamera, state switch err, cur: ");
                        sbLIZ4.append(this.mCurrentCameraState);
                        C2183341Ace.LJ("TECameraServer", C2188811AlT.LIZIZ(sbLIZ4));
                    }
                    updateCameraState(0);
                }
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("realCloseCamera end, ret=");
                sbLIZ5.append(iLJI);
                sbLIZ5.append(", state=");
                sbLIZ5.append(this.mCurrentCameraState);
                C2183341Ace.LIZLLL("TECameraServer", C2188811AlT.LIZIZ(sbLIZ5));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return iLJI;
    }

    public void registerCameraCaptureUpdateListener(C1DJB c1djb) {
        C1DJY c1djy;
        this.mCameraCaptureUpdateCallback = c1djb;
        if (this.mCameraInstance != null) {
            C1DJK c1djk = this.mCameraInstance;
            if (this.mCameraCaptureUpdateCallback != null) {
                c1djy = this.LLJJI;
            } else {
                c1djy = null;
            }
            c1djk.LJLLLL(c1djy);
        }
    }

    public void registerCameraStatusListener(InterfaceC2186151AhB interfaceC2186151AhB) {
        this.LLILZ = interfaceC2186151AhB;
        if (this.mCameraInstance != null) {
            this.mCameraInstance.LJLLILLLL(this.LLILZ);
        }
    }

    public void registerFpsConfigListener(C1DJS c1djs) {
        this.mFpsConfigCallback = c1djs;
    }

    public void registerPreviewSizeListener(InterfaceC1271000jBC interfaceC1271000jBC) {
        this.mPreviewSizeCallback = interfaceC1271000jBC;
    }

    public void registerVEPerformanceChannel(C20188413z0 c20188413z0) {
        this.LLILZIL = c20188413z0;
        if (this.mCameraInstance != null) {
            this.mCameraInstance.LJJZZI(this.LLILZIL);
        }
    }

    public void removeCameraAlgorithm(int i) {
        if (this.mCameraInstance == null) {
            int i2 = C2187451AjH.LIZ;
            C2183341Ace.LIZIZ("TECameraServer", "removeCameraAlgorithm failed mCameraInstance is null!");
        } else {
            this.mCameraInstance.LJJJJLL(i);
        }
    }

    public int removeCameraProvider(TECameraCapture tECameraCapture) {
        if (!LIZJ(tECameraCapture)) {
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            C786410Ut5.LJJZZIII(this.mHandler, new ARunnableS89S0200000_20(this, tECameraCapture, 52));
            return 0;
        }
        int i = C2187451AjH.LIZ;
        C2183341Ace.LIZLLL("TECameraServer", "removeCameraProvider");
        synchronized (this.mStateLock) {
            try {
                if (this.mCameraInstance != null && this.mCameraInstance.LJJIJLIJ() != null && this.mCurrentCameraState != 3) {
                    this.mCameraInstance.LJJIJLIJ().LIZ.LJIIZILJ();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return 0;
    }

    public void setCaptureMode(boolean z) {
        if (VEConfigCenter.getInstance().getValue("ve_fix_camera_set_capture_mode_order", false).booleanValue()) {
            LLJJIJIIJIL = z;
        }
        if (this.mCameraInstance == null) {
            return;
        }
        this.mCameraInstance.LJJLIIIJ(z);
        LLJJIJIIJIL = z;
    }

    public void setDeviceRotation(int i) {
        if (this.mCameraInstance != null) {
            this.mCameraInstance.setDeviceRotation(i);
        }
    }

    public void setLensCallback(InterfaceC2186141AhA interfaceC2186141AhA) {
        if (this.mCameraInstance == null) {
            int i = C2187451AjH.LIZ;
            C2183341Ace.LIZIZ("TECameraServer", "setLensCallback failed mCameraInstance is null!");
        } else {
            this.mCameraInstance.LJLLL();
        }
    }

    public void setPreviewFpsRange(TEFrameRateRange tEFrameRateRange) {
        if (this.mCameraSettings != null && this.mCameraInstance != null) {
            C1DJ6 c1dj6 = this.mCameraSettings;
            c1dj6.LLILLL = tEFrameRateRange;
            c1dj6.LLLIIII = 1;
            if (c1dj6.LLJZIJLIL == 1) {
                c1dj6.LLLIIII = 4;
                c1dj6.LLLLIILL = false;
            }
            this.mCameraInstance.LJJJLIIL();
        }
    }

    public void setPreviewFpsRangeWhenRunning(TEFrameRateRange tEFrameRateRange) {
        if (this.mCameraSettings != null && this.mCameraInstance != null) {
            this.mCameraSettings.LLILLL = tEFrameRateRange;
            this.mCameraInstance.LJJLL(tEFrameRateRange);
        }
    }

    public void setSATZoomCallback(C1DJU c1dju) {
        this.mSATZoomCallback = c1dju;
    }

    public int start(TECameraCapture tECameraCapture) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CAMERA_COST start: client ");
        sbLIZ.append(tECameraCapture);
        C2183341Ace.LIZLLL("TECameraServer", C2188811AlT.LIZIZ(sbLIZ));
        if (!LIZJ(tECameraCapture)) {
            return -108;
        }
        C1DJ6 c1dj6 = this.mCameraSettings;
        if (c1dj6 != null && c1dj6.LL != null) {
            Handler handler = this.mHandler;
            if (handler == null) {
                C2183341Ace.LIZIZ("TECameraServer", "start, mHandler is null!");
                return -112;
            }
            if (Looper.myLooper() != handler.getLooper()) {
                C786410Ut5.LJJZZIII(handler, new ARunnableS104S0200000_35(tECameraCapture, this, 4));
                if (this.mCameraSettings.LLJIJIL) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    this.mCameraClientCondition.close();
                    this.mCameraClientCondition.block(2000L);
                    long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("Camera start cost: ");
                    sbLIZ2.append(jCurrentTimeMillis2);
                    sbLIZ2.append("ms");
                    C2183341Ace.LIZLLL("TECameraServer", C2188811AlT.LIZIZ(sbLIZ2));
                }
                return 0;
            }
            synchronized (this.mStateLock) {
                try {
                    if (this.mCurrentCameraState == 3) {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("start, no need to start capture, state: ");
                        sbLIZ3.append(this.mCurrentCameraState);
                        C2183341Ace.LJ("TECameraServer", C2188811AlT.LIZIZ(sbLIZ3));
                        if (!this.LLIZLLLIL && !this.mStartPreviewError) {
                            return 0;
                        }
                        if (this.mCameraSettings.LLLLLZL && this.mCameraInstance != null && this.mCameraInstance.LJJIJLIJ() != null) {
                            this.mCameraInstance.LJJIJLIJ().LIZ.LJIJI(true);
                        }
                        if (this.mCameraInstance != null) {
                            this.mCameraInstance.stopCapture();
                        }
                        updateCameraState(2);
                        this.LLIZLLLIL = false;
                    }
                    if (this.mCurrentCameraState != 2) {
                        C1DJP c1djp = this.mCameraObserver;
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("Invalidate state: ");
                        sbLIZ4.append(this.mCurrentCameraState);
                        sbLIZ4.append(" ==> ");
                        sbLIZ4.append(3);
                        c1djp.onError(-105, C2188811AlT.LIZIZ(sbLIZ4));
                        return -105;
                    }
                    this.mCameraObserver.onInfo(6, this.mCurrentCameraState, "Camera state: opened");
                    if (this.mCameraSettings.LLLLLZL && this.mCameraInstance != null && this.mCameraInstance.LJJIJLIJ() != null) {
                        this.mCameraInstance.LJJIJLIJ().LIZ.LJIJI(false);
                    }
                    if (this.mCameraInstance != null) {
                        this.mCameraInstance.LJJLIIIJLJLI();
                    }
                    updateCameraState(3);
                    return 0;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        C2183341Ace.LIZIZ("TECameraServer", "mCameraSettings has some error");
        return -100;
    }

    public int stop(TECameraCapture tECameraCapture) {
        return stop(tECameraCapture, false);
    }

    public void upExposureCompensation(TECameraCapture tECameraCapture) {
        if (!LIZJ(tECameraCapture)) {
            return;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            C786410Ut5.LJJZZIII(this.mHandler, new ARunnableS89S0200000_20(this, tECameraCapture, 50));
            return;
        }
        int i = C2187451AjH.LIZ;
        C2183341Ace.LIZLLL("TECameraServer", "upExposureCompensation...");
        synchronized (this.mStateLock) {
            try {
                if ((this.mCurrentCameraState == 3 || this.mCurrentCameraState == 2) && this.mCameraInstance != null) {
                    C1286570jaJ cameraECInfo = this.mCameraInstance.getCameraECInfo();
                    if (cameraECInfo == null) {
                        this.mCameraObserver.onError(-112, "upExposureCompensation get ec info failed");
                        return;
                    } else {
                        this.mCameraInstance.setExposureCompensation(cameraECInfo.LIZIZ + 1);
                        return;
                    }
                }
                C1DJP c1djp = this.mCameraObserver;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Can not set ec on state : ");
                sbLIZ.append(this.mCurrentCameraState);
                c1djp.onError(-105, C2188811AlT.LIZIZ(sbLIZ));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public void updateCameraAlgorithmParam(TECameraAlgorithmParam tECameraAlgorithmParam) {
        if (this.mCameraInstance == null) {
            int i = C2187451AjH.LIZ;
            C2183341Ace.LIZIZ("TECameraServer", "updateCameraAlgorithmParam failed mCameraInstance is null!");
        } else {
            this.mCameraInstance.LJLJL(tECameraAlgorithmParam);
        }
    }

    public void updateCameraState(int i) {
        if (this.mCurrentCameraState == i) {
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("No need update state: ");
            sbLIZ.append(i);
            C2183341Ace.LJ("TECameraServer", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        int i3 = C2187451AjH.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("[updateCameraState]: ");
        sbLIZ2.append(this.mCurrentCameraState);
        sbLIZ2.append(" -> ");
        sbLIZ2.append(i);
        C2183341Ace.LIZLLL("TECameraServer", C2188811AlT.LIZIZ(sbLIZ2));
        this.mCurrentCameraState = i;
    }

    public int updateCameraSurface(TECameraCapture tECameraCapture) {
        if (!LIZJ(tECameraCapture)) {
            return -108;
        }
        synchronized (this.mStateLock) {
            try {
                if (this.mCameraInstance != null && (this.mCurrentCameraState == 3 || this.mCurrentCameraState == 2)) {
                    this.mCameraInstance.LJJLIIIJLLLLLLLZ();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return 0;
    }

    public void updateTextureId(int i) {
        C1DN3 c1dn3LIZIZ;
        if (this.mCameraInstance != null && this.mCameraInstance.LJJIJLIJ() != null) {
            C1DJM c1djmLJIIJ = this.mCameraInstance.LJJIJLIJ().LIZ.LJIIJ();
            if (c1djmLJIIJ != null) {
                c1djmLJIIJ.LJ = i;
            }
            if (this.mCameraInstance != null && this.mCameraInstance.LJJIJLIJ() != null && (c1dn3LIZIZ = this.mCameraInstance.LJJIJLIJ().LIZIZ()) != null) {
                c1dn3LIZIZ.LJJI(i);
                return;
            }
            return;
        }
        int i2 = C2187451AjH.LIZ;
        C2183341Ace.LIZIZ("TECameraServer", "camInstance or providerManager is null");
    }

    public int addCameraProvider(TECameraCapture tECameraCapture, C1DJM c1djm) {
        if (!LIZJ(tECameraCapture)) {
            return -108;
        }
        if (!this.LLILLJJLI && Looper.myLooper() != this.mHandler.getLooper()) {
            C786410Ut5.LJJZZIII(this.mHandler, new ARunnableS53S0300000_20(tECameraCapture, c1djm, this, 14));
            return 0;
        }
        synchronized (this.mStateLock) {
            try {
                if (this.mCameraInstance != null && this.mCameraInstance.LJJIJLIJ() != null) {
                    boolean z = true;
                    if (this.mCameraSettings.LLJJIJI) {
                        C1DN3[] c1dn3ArrLIZLLL = this.mCameraInstance.LJJIJLIJ().LIZLLL();
                        int length = c1dn3ArrLIZLLL.length;
                        int i = 0;
                        while (true) {
                            if (i < length) {
                                if (c1dn3ArrLIZLLL[i].LJII.LIZ(c1djm)) {
                                    int i2 = C2187451AjH.LIZ;
                                    C2183341Ace.LIZLLL("TECameraServer", "no need to add new camera provider");
                                    this.LLIZLLLIL = false;
                                    break;
                                }
                                i++;
                            } else {
                                C1DNM c1dnmLJJIJLIJ = this.mCameraInstance.LJJIJLIJ();
                                C1DJK c1djk = this.mCameraInstance;
                                c1dnmLJJIJLIJ.LIZ.LIZ(c1djm, c1djk);
                                c1djk.LJLI(c1dnmLJJIJLIJ);
                                if (this.mCameraSettings.LLILZ == 7) {
                                    z = false;
                                }
                                this.LLIZLLLIL = z;
                            }
                        }
                    } else {
                        C1DJM c1djmLJIIJ = this.mCameraInstance.LJJIJLIJ().LIZ.LJIIJ();
                        int i3 = C2187451AjH.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("addCameraProvider, last ProviderSettings = ");
                        sbLIZ.append(c1djmLJIIJ);
                        sbLIZ.append(", new providerSettings = ");
                        sbLIZ.append(c1djm);
                        C2183341Ace.LIZLLL("TECameraServer", C2188811AlT.LIZIZ(sbLIZ));
                        if (c1djmLJIIJ != null && c1djmLJIIJ.LIZ(c1djm) && this.mCameraInstance.LJJIJLIJ().LIZIZ() != null) {
                            this.LLIZLLLIL = false;
                        } else {
                            C1DNM c1dnmLJJIJLIJ2 = this.mCameraInstance.LJJIJLIJ();
                            C1DJK c1djk2 = this.mCameraInstance;
                            c1dnmLJJIJLIJ2.LIZ.LIZ(c1djm, c1djk2);
                            c1djk2.LJLI(c1dnmLJJIJLIJ2);
                            if (this.mCameraSettings.LLILZ == 7) {
                                z = false;
                            }
                            this.LLIZLLLIL = z;
                            if (this.LLJI != null && this.mCameraInstance.LJJIJLIJ().LIZIZ() != null) {
                                C1DN3 c1dn3LIZIZ = this.mCameraInstance.LJJIJLIJ().LIZIZ();
                                C1DJM c1djm2 = this.LLJI;
                                c1dn3LIZIZ.LJIJJLI(c1djm2.LJIIIIZZ, c1djm2.LJII);
                                C1DN3 c1dn3LIZIZ2 = this.mCameraInstance.LJJIJLIJ().LIZIZ();
                                C1DJM c1djm3 = this.LLJI;
                                c1dn3LIZIZ2.LJJ(c1djm3.LIZLLL, c1djm3.LJII);
                            }
                            C1DNM c1dnmLJJIJLIJ3 = this.mCameraInstance.LJJIJLIJ();
                            c1dnmLJJIJLIJ3.LIZ.LJIJJ(new C1DJM(c1djm));
                        }
                    }
                    return 0;
                }
                this.mCameraObserver.onError(-100, "Invalidate Camera Instance or no providerManager!!");
                return -100;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public int changeCurrentControlCam(TECameraCapture tECameraCapture, int i) {
        if (!LIZJ(tECameraCapture)) {
            return -108;
        }
        if (!this.LLILLJJLI && Looper.myLooper() != this.mHandler.getLooper()) {
            C786410Ut5.LJJZZIII(this.mHandler, new ARunnableS26S0201000_20(tECameraCapture, i, this, 3));
            return 0;
        }
        synchronized (this.mStateLock) {
            try {
                if (this.mCameraInstance == null) {
                    this.mCameraObserver.onError(-100, "Invalidate Camera Instance!!");
                    return -100;
                }
                this.mCameraInstance.LJJJJL(i);
                return 0;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public int close(boolean z, Cert cert) {
        boolean z2;
        Handler handler = this.mHandler;
        int iRealCloseCamera = 0;
        if (handler == null) {
            this.LLJILJIL = -1;
            updateCameraState(4);
            if (this.mCameraInstance != null) {
                int i = C2187451AjH.LIZ;
                C2183341Ace.LIZIZ("TECameraServer", "call camera close process, handler is null");
                C1DJK c1djk = this.mCameraInstance;
                Cert certLJJJLL = this.cachedClosePrivacyCert;
                if (certLJJJLL == null) {
                    certLJJJLL = this.mCameraInstance.LJJJLL(EnumC1270990jBB.EXCEPTION_CLOSE_CAMERA);
                }
                c1djk.LJJLIIIJJI(certLJJJLL);
                this.mCameraInstance.destroy();
                this.mCameraInstance = null;
                C2183341Ace.LJ("TECameraServer", "call camera close process, handler is null, force close done");
            }
            updateCameraState(0);
            return -112;
        }
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("close request, sync=");
        sbLIZ.append(z);
        sbLIZ.append(", state=");
        sbLIZ.append(this.mCurrentCameraState);
        C2183341Ace.LIZLLL("TECameraServer", C2188811AlT.LIZIZ(sbLIZ));
        if (!this.LLILLJJLI && Looper.myLooper() != handler.getLooper()) {
            int iHashCode = handler.hashCode();
            int i3 = this.LLJILJIL;
            if (i3 != -1 && i3 != iHashCode) {
                this.LLJILJIL = -1;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("close task discarded, reason=handler_changed, oldHandlerId=");
                sbLIZ2.append(i3);
                sbLIZ2.append(", newHandlerId=");
                sbLIZ2.append(iHashCode);
                C2183341Ace.LIZIZ("TECameraServer", C2188811AlT.LIZIZ(sbLIZ2));
                return 0;
            }
            this.LLJILJIL = iHashCode;
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (z) {
                this.mCameraClientCondition.block(2000L);
                this.mCameraClientCondition.close();
            }
            this.mIsCameraPendingClose = true;
            int[] iArr = new int[1];
            C786410Ut5.LJJZZIII(handler, new ARunnableS2S0310100_20(this, jCurrentTimeMillis, iArr, z, cert, 0));
            if (z) {
                boolean z3 = !this.mCameraClientCondition.block(1500L);
                this.mIsCameraPendingClose = false;
                long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                if (z3) {
                    this.LLJILJIL = -1;
                    C1DJ6 c1dj6 = this.mCameraSettings;
                    if (c1dj6 != null && c1dj6.LLLLLLIL) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("Camera close timeout, mCurrentCameraState ");
                    sbLIZ3.append(this.mCurrentCameraState);
                    sbLIZ3.append(", opt: ");
                    sbLIZ3.append(z2);
                    C2183341Ace.LIZIZ("TECameraServer", C2188811AlT.LIZIZ(sbLIZ3));
                    if (this.mCurrentCameraState != 4 || !z2) {
                        updateCameraState(4);
                        if (this.mCameraInstance != null) {
                            C1DJK c1djk2 = this.mCameraInstance;
                            Cert certLJJJLL2 = this.cachedClosePrivacyCert;
                            if (certLJJJLL2 == null) {
                                certLJJJLL2 = this.mCameraInstance.LJJJLL(EnumC1270990jBB.EXCEPTION_CLOSE_CAMERA);
                            }
                            c1djk2.LJJLIIIJJI(certLJJJLL2);
                        }
                    }
                    updateCameraState(0);
                } else {
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("Camera close cost: ");
                    sbLIZ4.append(jCurrentTimeMillis2);
                    sbLIZ4.append("ms");
                    C2183341Ace.LIZLLL("TECameraServer", C2188811AlT.LIZIZ(sbLIZ4));
                }
                return iArr[0];
            }
        } else {
            this.LLJILJIL = -1;
            iRealCloseCamera = realCloseCamera(cert);
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("close: remove mCheckCloseTask Callbacks, ");
            sbLIZ5.append(this.mCheckCloseTask);
            C2183341Ace.LIZLLL("TECameraServer", C2188811AlT.LIZIZ(sbLIZ5));
            this.mMainHandler.removeCallbacks(this.mCheckCloseTask);
            if (!z && iRealCloseCamera != -114 && decreaseClientCount() == 0) {
                return destroy();
            }
        }
        return iRealCloseCamera;
    }

    public int disConnect(TECameraCapture tECameraCapture, Cert cert) {
        return disConnect(tECameraCapture, true, cert);
    }

    public int enableMulticamZoom(TECameraCapture tECameraCapture, boolean z) {
        if (!LIZJ(tECameraCapture)) {
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            C786410Ut5.LJJZZIII(this.mHandler, new ARunnableS21S0210000_20(tECameraCapture, this, z, 6));
            return 0;
        }
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("enableMulticamZoom: ");
        sbLIZ.append(z);
        C2183341Ace.LIZLLL("TECameraServer", C2188811AlT.LIZIZ(sbLIZ));
        synchronized (this.mStateLock) {
            try {
                if (this.mCameraInstance != null) {
                    this.mCameraInstance.LJJLIL(z);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return 0;
    }

    public int focusAtPoint(TECameraCapture tECameraCapture, C1DJG c1djg) {
        if (!LIZJ(tECameraCapture)) {
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            C786410Ut5.LJJZZIII(this.mHandler, new ARunnableS66S0300000_33(this, tECameraCapture, c1djg, 9));
            return 0;
        }
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("focusAtPoint at: ");
        sbLIZ.append(c1djg);
        C2183341Ace.LIZLLL("TECameraServer", C2188811AlT.LIZIZ(sbLIZ));
        synchronized (this.mStateLock) {
            try {
                if (this.mCurrentCameraState != 3) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("Can not set focus on state : ");
                    sbLIZ2.append(this.mCurrentCameraState);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                    C2183341Ace.LJ("TECameraServer", strLIZIZ);
                    this.mCameraObserver.onError(-105, strLIZIZ);
                    return -105;
                }
                if (this.mCameraInstance != null) {
                    this.mCameraInstance.LJIILL(c1djg);
                }
                return 0;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public float[] getApertureRange(TECameraCapture tECameraCapture, InterfaceC1286940jau interfaceC1286940jau) {
        float[] fArrLJJJJZ = {0.0f};
        if (!LIZJ(tECameraCapture)) {
            return new float[]{-1.0f, -1.0f};
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            C786410Ut5.LJJZZIII(this.mHandler, new ARunnableS89S0200000_20(this, tECameraCapture, 46));
            return fArrLJJJJZ;
        }
        synchronized (this.mStateLock) {
            try {
                if (this.mCameraInstance != null) {
                    fArrLJJJJZ = this.mCameraInstance.LJJJJZ();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return fArrLJJJJZ;
    }

    public JSONObject getCameraCapbilitiesForBytebench(TECameraCapture tECameraCapture, InterfaceC2186331AhT interfaceC2186331AhT) {
        JSONObject jSONObject = new JSONObject();
        if (!LIZJ(tECameraCapture)) {
            return null;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            C786410Ut5.LJJZZIII(this.mHandler, new ARunnableS66S0300000_33(this, tECameraCapture, interfaceC2186331AhT, 11));
            return jSONObject;
        }
        int i = C2187451AjH.LIZ;
        C2183341Ace.LIZLLL("TECameraServer", "getCameraCapbilitiesForBytebench");
        synchronized (this.mStateLock) {
            try {
                if (this.mCameraInstance != null) {
                    jSONObject = this.mCameraInstance.LJJIJ();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return jSONObject;
    }

    public float[] getFOV(TECameraCapture tECameraCapture, InterfaceC2186211AhH interfaceC2186211AhH) {
        float[] fArr = new float[2];
        if (!LIZJ(tECameraCapture)) {
            return new float[]{-2.0f, -2.0f};
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            C786410Ut5.LJJZZIII(this.mHandler, new ARunnableS66S0300000_33(this, tECameraCapture, interfaceC2186211AhH, 8));
            return fArr;
        }
        int i = C2187451AjH.LIZ;
        C2183341Ace.LIZLLL("TECameraServer", "getFOV");
        synchronized (this.mStateLock) {
            try {
                if (this.mCurrentCameraState == 3 && this.mCameraInstance != null) {
                    return this.mCameraInstance.LJJJJJL();
                }
                C1DJP c1djp = this.mCameraObserver;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Can not getFOV on state : ");
                sbLIZ.append(this.mCurrentCameraState);
                c1djp.onError(-105, C2188811AlT.LIZIZ(sbLIZ));
                return new float[]{-2.0f, -2.0f};
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public int getISO(TECameraCapture tECameraCapture, InterfaceC1283620jVY interfaceC1283620jVY) {
        int iLJJJJJ = -1;
        if (!LIZJ(tECameraCapture)) {
            return -1;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            C786410Ut5.LJJZZIII(this.mHandler, new ARunnableS53S0300000_20(tECameraCapture, interfaceC1283620jVY, this, 10));
            return -1;
        }
        synchronized (this.mStateLock) {
            try {
                if (this.mCameraInstance != null) {
                    iLJJJJJ = this.mCameraInstance.LJJJJJ();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return iLJJJJJ;
    }

    public int[] getISORange(TECameraCapture tECameraCapture, InterfaceC1281910jSn interfaceC1281910jSn) {
        int[] iArrLJJJZ = new int[2];
        if (!LIZJ(tECameraCapture)) {
            return new int[]{-1, -1};
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            C786410Ut5.LJJZZIII(this.mHandler, new ARunnableS53S0300000_20(tECameraCapture, interfaceC1281910jSn, this, 9));
            return iArrLJJJZ;
        }
        synchronized (this.mStateLock) {
            try {
                if (this.mCameraInstance != null) {
                    iArrLJJJZ = this.mCameraInstance.LJJJZ();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return iArrLJJJZ;
    }

    public float getManualFocusAbility(TECameraCapture tECameraCapture, InterfaceC1286950jav interfaceC1286950jav) {
        float fLJJIJIL = -1.0f;
        if (!LIZJ(tECameraCapture)) {
            return -1.0f;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            C786410Ut5.LJJZZIII(this.mHandler, new ARunnableS89S0200000_20(this, tECameraCapture, 49));
            return -1.0f;
        }
        synchronized (this.mStateLock) {
            try {
                if (this.mCameraInstance != null) {
                    fLJJIJIL = this.mCameraInstance.LJJIJIL();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return fLJJIJIL;
    }

    public long[] getShutterTimeRange(TECameraCapture tECameraCapture, InterfaceC1286930jat interfaceC1286930jat) {
        long[] jArrLJLIIL = new long[2];
        if (!LIZJ(tECameraCapture)) {
            return new long[]{-1, -1};
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            C786410Ut5.LJJZZIII(this.mHandler, new ARunnableS89S0200000_20(this, tECameraCapture, 45));
            return jArrLJLIIL;
        }
        synchronized (this.mStateLock) {
            try {
                if (this.mCameraInstance != null) {
                    jArrLJLIIL = this.mCameraInstance.LJLIIL();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return jArrLJLIIL;
    }

    public boolean isDynamicRangeProfileSupported(TECameraCapture tECameraCapture, long j) {
        C1DJK c1djk;
        if (!LIZJ(tECameraCapture) || (c1djk = this.mCameraInstance) == null || !c1djk.LJJIZ(j)) {
            return false;
        }
        return true;
    }

    public boolean isStabilizationSupported(TECameraCapture tECameraCapture, EnumC2244671CtN enumC2244671CtN) {
        C1DJK c1djk;
        if (!LIZJ(tECameraCapture) || (c1djk = this.mCameraInstance) == null || !c1djk.LJJJJIZL(enumC2244671CtN)) {
            return false;
        }
        return true;
    }

    public void notifyHostForegroundVisible(TECameraCapture tECameraCapture, boolean z) {
        if (LIZJ(tECameraCapture)) {
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("is foreground visible: ");
            sbLIZ.append(z);
            C2183341Ace.LIZLLL("TECameraServer", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public int process(TECameraCapture tECameraCapture, C2186341AhU c2186341AhU) {
        if (!LIZJ(tECameraCapture)) {
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            C786410Ut5.LJJZZIII(this.mHandler, new ARunnableS102S0200000_33(this, tECameraCapture, 18));
            return 0;
        }
        int i = C2187451AjH.LIZ;
        C2183341Ace.LIZLLL("TECameraServer", "setFeatureParameters...");
        synchronized (this.mStateLock) {
            try {
                if (this.mCameraInstance != null) {
                    this.mCameraInstance.LJIIL();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return 0;
    }

    public void queryFeatures(String str, Bundle bundle) {
        Object obj;
        if (this.mCameraInstance != null) {
            Bundle bundleLJIIJJI = this.mCameraInstance.LJIIJJI(str);
            if (bundleLJIIJJI == null) {
                int i = C2187451AjH.LIZ;
                C2183341Ace.LIZIZ("TECameraServer", "queryFeatures: getFeatures is null");
                return;
            }
            for (String str2 : bundle.keySet()) {
                if (bundleLJIIJJI.containsKey(str2)) {
                    HashMap map = (HashMap) C1DJN.LIZ;
                    if (map.containsKey(str2)) {
                        obj = map.get(str2);
                    } else {
                        obj = null;
                    }
                    if (obj == Boolean.class) {
                        bundle.putBoolean(str2, bundleLJIIJJI.getBoolean(str2));
                    } else if (obj == Integer.class) {
                        bundle.putInt(str2, bundleLJIIJJI.getInt(str2));
                    } else if (obj == Long.class) {
                        bundle.putLong(str2, bundleLJIIJJI.getLong(str2));
                    } else if (obj == Float.class) {
                        bundle.putFloat(str2, bundleLJIIJJI.getFloat(str2));
                    } else if (obj == Double.class) {
                        bundle.putDouble(str2, bundleLJIIJJI.getDouble(str2));
                    } else if (obj == String.class) {
                        C786410Ut5.LJJJI(str2, bundleLJIIJJI.getString(str2), bundle);
                    } else if (obj == ArrayList.class) {
                        C786410Ut5.LJJIL(bundle, str2, bundleLJIIJJI.getParcelableArrayList(str2));
                    } else if (obj == TEFrameSizei.class) {
                        C786410Ut5.LJJIJL(bundle, str2, bundleLJIIJJI.getParcelable(str2));
                    } else if (obj == TEFocusParameters.class) {
                        C786410Ut5.LJJIJL(bundle, str2, bundleLJIIJJI.getParcelable(str2));
                    } else {
                        int i2 = C2187451AjH.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Not supported key:");
                        sbLIZ.append(str2);
                        C2183341Ace.LJ("TECameraServer", C2188811AlT.LIZIZ(sbLIZ));
                    }
                }
            }
            return;
        }
        int i3 = C2187451AjH.LIZ;
        C2183341Ace.LIZIZ("TECameraServer", "queryFeatures: camera instance null");
    }

    public float queryShaderZoomStep(TECameraCapture tECameraCapture, InterfaceC1287190jbJ interfaceC1287190jbJ) {
        if (!LIZJ(tECameraCapture)) {
            return -108.0f;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            C786410Ut5.LJJZZIII(this.mHandler, new ARunnableS53S0300000_20(tECameraCapture, interfaceC1287190jbJ, this, 11));
            return 0.0f;
        }
        int i = C2187451AjH.LIZ;
        C2183341Ace.LIZLLL("TECameraServer", "queryShaderZoomStep...");
        synchronized (this.mStateLock) {
            try {
                if (this.mCameraInstance != null) {
                    this.mCameraInstance.LJLILLLLZI(interfaceC1287190jbJ);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return 0.0f;
    }

    public void setAperture(TECameraCapture tECameraCapture, float f) {
        if (!LIZJ(tECameraCapture)) {
            return;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            C786410Ut5.LJJZZIII(this.mHandler, new ARunnableS3S0200001_20(this, tECameraCapture, f, 0));
            return;
        }
        synchronized (this.mStateLock) {
            try {
                if (this.mCameraInstance != null) {
                    this.mCameraInstance.LJJIIJZLJL(f);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public void setAutoExposureLock(TECameraCapture tECameraCapture, boolean z) {
        if (!LIZJ(tECameraCapture)) {
            return;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            C786410Ut5.LJJZZIII(this.mHandler, new ARunnableS21S0210000_20(tECameraCapture, this, z, 7));
            return;
        }
        int i = C2187451AjH.LIZ;
        C2183341Ace.LIZLLL("TECameraServer", "setAutoExposureLock...");
        synchronized (this.mStateLock) {
            try {
                if (this.mCurrentCameraState != 3 && this.mCurrentCameraState != 2) {
                    C1DJP c1djp = this.mCameraObserver;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Can not set auto exposure lock on state : ");
                    sbLIZ.append(this.mCurrentCameraState);
                    c1djp.onError(-105, C2188811AlT.LIZIZ(sbLIZ));
                    return;
                }
                if (this.mCameraInstance != null) {
                    this.mCameraInstance.LJLJLLL(z);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public void setAutoFocusLock(TECameraCapture tECameraCapture, boolean z) {
        if (!LIZJ(tECameraCapture)) {
            return;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            C786410Ut5.LJJZZIII(this.mHandler, new ARunnableS21S0210000_20(tECameraCapture, this, z, 3));
            return;
        }
        int i = C2187451AjH.LIZ;
        C2183341Ace.LIZ("TECameraServer", "setAutoExposureLock...");
        synchronized (this.mStateLock) {
            try {
                if (this.mCurrentCameraState != 3 && this.mCurrentCameraState != 2) {
                    C1DJP c1djp = this.mCameraObserver;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Can not set auto exposure lock on state : ");
                    sbLIZ.append(this.mCurrentCameraState);
                    c1djp.onError(-105, C2188811AlT.LIZIZ(sbLIZ));
                    return;
                }
                if (this.mCameraInstance != null) {
                    this.mCameraInstance.LJJIIJ(z);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public void setExposureCompensation(TECameraCapture tECameraCapture, int i) {
        Handler handler;
        if (LIZJ(tECameraCapture) && (handler = this.mHandler) != null) {
            C786410Ut5.LJJZZIII(handler, new ARunnableS44S0101000_33(i, this, 2));
        } else {
            int i2 = C2187451AjH.LIZ;
            C2183341Ace.LIZIZ("TECameraServer", "setExposureCompensation failed");
        }
    }

    public int setFeatureParameters(TECameraCapture tECameraCapture, Bundle bundle) {
        if (!LIZJ(tECameraCapture)) {
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            C786410Ut5.LJJZZIII(this.mHandler, new ARunnableS53S0300000_20(tECameraCapture, bundle, this, 13));
            return 0;
        }
        int i = C2187451AjH.LIZ;
        C2183341Ace.LIZLLL("TECameraServer", "setFeatureParameters...");
        synchronized (this.mStateLock) {
            try {
                if (this.mCameraInstance != null) {
                    this.mCameraInstance.LJJ(bundle);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return 0;
    }

    public void setISO(TECameraCapture tECameraCapture, int i) {
        if (!LIZJ(tECameraCapture)) {
            return;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            C786410Ut5.LJJZZIII(this.mHandler, new ARunnableS26S0201000_20(tECameraCapture, i, this, 0));
            return;
        }
        synchronized (this.mStateLock) {
            try {
                if (this.mCameraInstance != null) {
                    this.mCameraInstance.LJIJI(i);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public void setManualFocusDistance(TECameraCapture tECameraCapture, float f) {
        if (!LIZJ(tECameraCapture)) {
            return;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            C786410Ut5.LJJZZIII(this.mHandler, new ARunnableS3S0200001_20(this, tECameraCapture, f, 1));
            return;
        }
        synchronized (this.mStateLock) {
            try {
                if (this.mCameraInstance != null) {
                    this.mCameraInstance.LJJIJIIJIL(f);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public void setPreviewFpsRange(TEFrameRateRange tEFrameRateRange, int i) {
        if (this.mCameraSettings != null && this.mCameraInstance != null) {
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setPreviewFpsRange: ");
            sbLIZ.append(tEFrameRateRange.toString());
            sbLIZ.append(" strategy: ");
            sbLIZ.append(i);
            C2183341Ace.LIZLLL("TECameraServer", C2188811AlT.LIZIZ(sbLIZ));
            C1DJ6 c1dj6 = this.mCameraSettings;
            c1dj6.LLILLL = tEFrameRateRange;
            c1dj6.LLLIIII = i;
            if (c1dj6.LLJZIJLIL == 1) {
                c1dj6.LLLIIII = 4;
                c1dj6.LLLLIILL = false;
            }
            this.mCameraInstance.LJJJLIIL();
        }
    }

    public void setSceneMode(TECameraCapture tECameraCapture, int i) {
        if (LIZJ(tECameraCapture)) {
            Handler handler = this.mHandler;
            if (handler != null) {
                C786410Ut5.LJJZZIII(handler, new ARunnableS44S0101000_33(i, this, 1));
                return;
            }
            return;
        }
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("set scnen failed: ");
        sbLIZ.append(i);
        C2183341Ace.LJ("TECameraServer", C2188811AlT.LIZIZ(sbLIZ));
    }

    public void setShutterTime(TECameraCapture tECameraCapture, long j) {
        if (!LIZJ(tECameraCapture)) {
            return;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            C786410Ut5.LJJZZIII(this.mHandler, new ARunnableS17S0200100_20(j, tECameraCapture, this, 2));
            return;
        }
        synchronized (this.mStateLock) {
            try {
                if (this.mCameraInstance != null) {
                    this.mCameraInstance.LJLJJL(j);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public int setStabilizationMode(TECameraCapture tECameraCapture, EnumC2244671CtN enumC2244671CtN) {
        if (!LIZJ(tECameraCapture)) {
            int i = C2187451AjH.LIZ;
            C2183341Ace.LIZIZ("TECameraServer", "[VE_UI_TEST]Failed event: setStabilizationMode. Code: -108. Reason: invalid CameraClient");
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            C786410Ut5.LJJZZIII(this.mHandler, new ARunnableS66S0300000_33(this, tECameraCapture, enumC2244671CtN, 10));
            return 0;
        }
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setStabilizationMode: ");
        sbLIZ.append(enumC2244671CtN);
        C2183341Ace.LIZLLL("TECameraServer", C2188811AlT.LIZIZ(sbLIZ));
        synchronized (this.mStateLock) {
            try {
                if (this.mCameraInstance != null) {
                    this.mCameraInstance.LJIIJ(enumC2244671CtN);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return 0;
    }

    public int stop(TECameraCapture tECameraCapture, boolean z) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("stop，sync = ");
        sbLIZ.append(z);
        sbLIZ.append(", client = ");
        sbLIZ.append(tECameraCapture);
        C2183341Ace.LIZLLL("TECameraServer", C2188811AlT.LIZIZ(sbLIZ));
        if (!LIZJ(tECameraCapture)) {
            return -108;
        }
        Handler handler = this.mHandler;
        if (handler == null) {
            C2183341Ace.LIZIZ("TECameraServer", "stop, mHandler is null!");
            return -112;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("TECameraServer-stop sync=");
        sbLIZ2.append(z);
        C1321640kUs.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
        if (Looper.myLooper() != handler.getLooper()) {
            if (z) {
                this.mCameraClientCondition.close();
            }
            C786410Ut5.LJJZZIII(handler, new ARunnableS21S0210000_20(tECameraCapture, this, z, 4));
            if (z && (!this.mCameraClientCondition.block(1500L))) {
                C2183341Ace.LIZIZ("TECameraServer", "Camera stop timeout!");
            }
        } else {
            synchronized (this.mStateLock) {
                try {
                    if (this.mCurrentCameraState == 2) {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("stop, no need to stop capture, state: ");
                        sbLIZ3.append(this.mCurrentCameraState);
                        C2183341Ace.LJ("TECameraServer", C2188811AlT.LIZIZ(sbLIZ3));
                        return 0;
                    }
                    if (this.mCurrentCameraState != 3) {
                        C1DJP c1djp = this.mCameraObserver;
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("Invalidate state: ");
                        sbLIZ4.append(this.mCurrentCameraState);
                        sbLIZ4.append(" ==> ");
                        sbLIZ4.append(2);
                        c1djp.onError(-105, C2188811AlT.LIZIZ(sbLIZ4));
                        return -105;
                    }
                    updateCameraState(2);
                    if (this.mCameraSettings.LLLLLZL && this.mCameraInstance != null && this.mCameraInstance.LJJIJLIJ() != null) {
                        this.mCameraInstance.LJJIJLIJ().LIZ.LJIJI(true);
                    }
                    if (this.mCameraInstance != null) {
                        this.mCameraInstance.stopCapture();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        C1321640kUs.LIZIZ();
        return 0;
    }

    public int stopZoom(TECameraCapture tECameraCapture, InterfaceC2254701DMu interfaceC2254701DMu) {
        if (!LIZJ(tECameraCapture)) {
            int i = C2187451AjH.LIZ;
            C2183341Ace.LIZIZ("TECameraServer", "[VE_UI_TEST]Failed event: STOP_ZOOM. Code: -108. Reason: invalid CameraClient");
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            C786410Ut5.LJJZZIII(this.mHandler, new ARunnableS53S0300000_20(tECameraCapture, interfaceC2254701DMu, this, 12));
            return 0;
        }
        int i2 = C2187451AjH.LIZ;
        C2183341Ace.LIZLLL("TECameraServer", "stopZoom...");
        synchronized (this.mStateLock) {
            try {
                if (this.mCameraInstance != null) {
                    this.mCameraInstance.LJLLJ(interfaceC2254701DMu);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return 0;
    }

    public int switchCameraMode(TECameraCapture tECameraCapture, int i) {
        if (!LIZJ(tECameraCapture)) {
            return -108;
        }
        C1DJ6 c1dj6 = tECameraCapture.mCameraSettings;
        if (c1dj6.LLILLJJLI != 1) {
            if (i != 1 && i != 0 && i != 2) {
                return -100;
            }
            if (c1dj6.LLJZIJLIL == i) {
                return 0;
            }
            if (Looper.myLooper() != this.mHandler.getLooper()) {
                C786410Ut5.LJJZZIII(this.mHandler, new ARunnableS26S0201000_20(tECameraCapture, i, this, 2));
                return 0;
            }
            int i2 = C2187451AjH.LIZ;
            C2183341Ace.LIZLLL("TECameraServer", "switchCameraMode");
            synchronized (this.mStateLock) {
                try {
                    if (this.mCurrentCameraState != 3) {
                        C1DJP c1djp = this.mCameraObserver;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Invalidate state: ");
                        sbLIZ.append(this.mCurrentCameraState);
                        sbLIZ.append(" ==> ");
                        sbLIZ.append(3);
                        c1djp.onError(-105, C2188811AlT.LIZIZ(sbLIZ));
                        return -105;
                    }
                    if (this.mCameraInstance != null) {
                        this.mCameraInstance.LJJIIZI(i);
                    }
                    return 0;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return -100;
    }

    public int switchFlashMode(TECameraCapture tECameraCapture, int i) {
        if (LIZJ(tECameraCapture) && this.mHandler != null) {
            if (Looper.myLooper() != this.mHandler.getLooper()) {
                C786410Ut5.LJJZZIII(this.mHandler, new ARunnableS26S0201000_20(tECameraCapture, i, this, 1));
                return 0;
            }
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("switchFlashMode: ");
            sbLIZ.append(i);
            C2183341Ace.LIZLLL("TECameraServer", C2188811AlT.LIZIZ(sbLIZ));
            synchronized (this.mStateLock) {
                try {
                    if (this.mCameraInstance != null) {
                        this.mCameraInstance.LIZ(i);
                        this.mCameraEvent.LJ(116, i, "");
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            return 0;
        }
        return -108;
    }

    public int takePicture(TECameraCapture tECameraCapture, InterfaceC2186271AhN interfaceC2186271AhN) {
        if (!LIZJ(tECameraCapture)) {
            return -108;
        }
        C786410Ut5.LJJZZIII(this.mHandler, new ARunnableS133S0100000_33(this, 36));
        return 0;
    }

    public int toggleTorch(TECameraCapture tECameraCapture, boolean z) {
        if (!LIZJ(tECameraCapture)) {
            int i = C2187451AjH.LIZ;
            C2183341Ace.LIZIZ("TECameraServer", "[VE_UI_TEST]Failed event: TOGGLE_TORCH. Code: -108. Reason: invalid CameraClient");
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            C786410Ut5.LJJZZIII(this.mHandler, new ARunnableS21S0210000_20(tECameraCapture, this, z, 5));
            return 0;
        }
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("toggleTorch: ");
        sbLIZ.append(z);
        C2183341Ace.LIZLLL("TECameraServer", C2188811AlT.LIZIZ(sbLIZ));
        synchronized (this.mStateLock) {
            try {
                if (this.mCameraInstance != null) {
                    this.mCameraInstance.LJLLLLLL(z);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return 0;
    }

    public void updateCameraProvider(TECameraCapture tECameraCapture, C1DJM c1djm) {
        if (c1djm != null) {
            this.LLJI = c1djm;
            if (this.mCameraInstance != null && this.mCameraInstance.LJJIJLIJ() != null && this.mCameraInstance.LJJIJLIJ().LIZIZ() != null) {
                this.mCameraInstance.LJJIJLIJ().LIZIZ().LJJ(c1djm.LIZLLL, c1djm.LJII);
                this.mCameraInstance.LJJIJLIJ().LIZIZ().LJIJJLI(c1djm.LJIIIIZZ, c1djm.LJII);
                EnumC2186171AhD enumC2186171AhD = c1djm.LJII;
                if (enumC2186171AhD == EnumC2186171AhD.CHANGE_SURFACE || enumC2186171AhD == EnumC2186171AhD.REMOVE_SURFACE || enumC2186171AhD == EnumC2186171AhD.REMOVE_SURFACE_TEXTURE) {
                    this.mCameraInstance.LJJJIL();
                }
            }
        }
    }

    public void updateTextureId(int i, int i2) {
        if (this.mCameraInstance != null && this.mCameraInstance.LJJIJLIJ() != null) {
            C1DN3 c1dn3LJIIIIZZ = this.mCameraInstance.LJJIJLIJ().LIZ.LJIIIIZZ(i);
            if (c1dn3LJIIIIZZ != null) {
                c1dn3LJIIIIZZ.LJII.LJ = i2;
                if (this.mCameraInstance != null && this.mCameraInstance.LJJIJLIJ() != null) {
                    c1dn3LJIIIIZZ.LJJI(i2);
                    return;
                }
                return;
            }
            return;
        }
        int i3 = C2187451AjH.LIZ;
        C2183341Ace.LIZIZ("TECameraServer", "camInstance or providerManager is null");
    }

    public int captureBurst(TECameraCapture tECameraCapture, InterfaceC2186281AhO interfaceC2186281AhO, C2186291AhP c2186291AhP) {
        if (!LIZJ(tECameraCapture)) {
            return -108;
        }
        C786410Ut5.LJJZZIII(this.mHandler, new ARunnableS133S0100000_33(this, 34));
        return 0;
    }

    public int changeRecorderState(TECameraCapture tECameraCapture, int i, InterfaceC2186351AhV interfaceC2186351AhV) {
        if (!LIZJ(tECameraCapture)) {
            return -108;
        }
        if (!this.LLILLJJLI && Looper.myLooper() != this.mHandler.getLooper()) {
            C786410Ut5.LJJZZIII(this.mHandler, new ARunnableS37S0201000_33(tECameraCapture, i, this, 3));
            return 0;
        }
        synchronized (this.mStateLock) {
            try {
                if (this.mCameraInstance == null) {
                    this.mCameraObserver.onError(-100, "Invalidate Camera Instance!!");
                    return -100;
                }
                this.mCameraInstance.LJJZZIII();
                return 0;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public int disConnect(TECameraCapture tECameraCapture, boolean z, Cert cert) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("disConnect request, client=");
        sbLIZ.append(tECameraCapture);
        sbLIZ.append(", sync=");
        sbLIZ.append(z);
        C2183341Ace.LIZLLL("TECameraServer", C2188811AlT.LIZIZ(sbLIZ));
        this.LLJILJILJ = false;
        synchronized (this.LLILZLL) {
            try {
                TECameraCapture tECameraCapture2 = this.mCameraClient;
                if (tECameraCapture2 == tECameraCapture && tECameraCapture2 != null) {
                    this.mCameraClient = null;
                    Handler handler = this.mHandler;
                    if (handler == null) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("disConnect failed, reason=handler_null, client=");
                        sbLIZ2.append(tECameraCapture);
                        C2183341Ace.LIZIZ("TECameraServer", C2188811AlT.LIZIZ(sbLIZ2));
                        return -112;
                    }
                    handler.removeCallbacksAndMessages(null);
                    this.cachedClosePrivacyCert = cert;
                    int iClose = close(z, cert);
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("disConnect close requested, ret=");
                    sbLIZ3.append(iClose);
                    sbLIZ3.append(", client=");
                    sbLIZ3.append(tECameraCapture);
                    sbLIZ3.append(", sync=");
                    sbLIZ3.append(z);
                    C2183341Ace.LIZLLL("TECameraServer", C2188811AlT.LIZIZ(sbLIZ3));
                    if (z) {
                        if (decreaseClientCount() == 0) {
                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                            sbLIZ4.append("disConnect destroy after count reached zero, client=");
                            sbLIZ4.append(tECameraCapture);
                            C2183341Ace.LIZLLL("TECameraServer", C2188811AlT.LIZIZ(sbLIZ4));
                            destroy();
                            return iClose;
                        }
                    } else {
                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                        sbLIZ5.append("setAsyncCloseCheckMsg: ");
                        sbLIZ5.append(this.mCheckCloseTask);
                        C2183341Ace.LIZLLL("TECameraServer", C2188811AlT.LIZIZ(sbLIZ5));
                        this.mMainHandler.removeCallbacks(this.mCheckCloseTask);
                        C786410Ut5.LJLIIL(2000L, this.mMainHandler, this.mCheckCloseTask);
                    }
                    return iClose;
                }
                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                sbLIZ6.append("disConnect ignored, reason=client_mismatch, requestClient=");
                sbLIZ6.append(tECameraCapture);
                sbLIZ6.append(", currentClient=");
                sbLIZ6.append(this.mCameraClient);
                C2183341Ace.LJ("TECameraServer", C2188811AlT.LIZIZ(sbLIZ6));
                return -100;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public TEFrameSizei getBestPreviewSize(TECameraCapture tECameraCapture, float f, TEFrameSizei tEFrameSizei) {
        if (!LIZJ(tECameraCapture) || this.mCurrentCameraState == 0 || this.mCurrentCameraState == 1 || this.mCameraInstance == null) {
            return null;
        }
        return this.mCameraInstance.LJIJJLI(f, tEFrameSizei);
    }

    public int open(TECameraCapture tECameraCapture, C1DJ6 c1dj6, Cert cert) {
        if (!LIZJ(tECameraCapture)) {
            return -108;
        }
        if (this.mIsCameraPendingClose) {
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("open rejected, reason=pending_close, client=");
            sbLIZ.append(tECameraCapture);
            sbLIZ.append(", settings=");
            sbLIZ.append(cameraSettingsForLog(c1dj6));
            C2183341Ace.LIZIZ("TECameraServer", C2188811AlT.LIZIZ(sbLIZ));
            return -105;
        }
        if (this.LLJIJIL) {
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("open rejected, reason=background, client=");
            sbLIZ2.append(tECameraCapture);
            sbLIZ2.append(", settings=");
            sbLIZ2.append(cameraSettingsForLog(c1dj6));
            C2183341Ace.LIZIZ("TECameraServer", C2188811AlT.LIZIZ(sbLIZ2));
            return -105;
        }
        Handler handler = this.mHandler;
        if (handler == null) {
            int i3 = C2187451AjH.LIZ;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("open failed, reason=handler_null, client=");
            sbLIZ3.append(tECameraCapture);
            sbLIZ3.append(", settings=");
            sbLIZ3.append(cameraSettingsForLog(c1dj6));
            C2183341Ace.LIZIZ("TECameraServer", C2188811AlT.LIZIZ(sbLIZ3));
            return -112;
        }
        if (this.mIsCameraPendingClose) {
            int i4 = C2187451AjH.LIZ;
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("open rejected, reason=close_called, client=");
            sbLIZ4.append(tECameraCapture);
            sbLIZ4.append(", settings=");
            sbLIZ4.append(cameraSettingsForLog(c1dj6));
            C2183341Ace.LIZIZ("TECameraServer", C2188811AlT.LIZIZ(sbLIZ4));
            return -113;
        }
        if (!this.LLILLJJLI && Looper.myLooper() != handler.getLooper()) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            int i5 = C2187451AjH.LIZ;
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("open post to camera server thread, client=");
            sbLIZ5.append(tECameraCapture);
            sbLIZ5.append(", settings=");
            sbLIZ5.append(cameraSettingsForLog(c1dj6));
            C2183341Ace.LIZLLL("TECameraServer", C2188811AlT.LIZIZ(sbLIZ5));
            C786410Ut5.LJJZZIII(handler, new ARunnableS3S0400100_20(this, jCurrentTimeMillis, tECameraCapture, c1dj6, cert, 0));
            return 0;
        }
        C1321640kUs.LIZ("TECameraServer-open");
        this.mCameraSettings = c1dj6;
        this.mCheckCloseTask = new ARunnableS133S0100000_33(this, 35);
        this.LLILLL = 0.0f;
        if (this.mRetryCnt < 0) {
            this.mRetryCnt = c1dj6.LLJJL;
        }
        synchronized (this.mStateLock) {
            try {
                if (this.mCurrentCameraState != 0) {
                    int i6 = C2187451AjH.LIZ;
                    StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                    sbLIZ6.append("open skipped, reason=state_not_idle, state=");
                    sbLIZ6.append(this.mCurrentCameraState);
                    sbLIZ6.append(", settings=");
                    sbLIZ6.append(cameraSettingsForLog(c1dj6));
                    C2183341Ace.LJ("TECameraServer", C2188811AlT.LIZIZ(sbLIZ6));
                    if (this.mCurrentCameraState != 1) {
                        this.mCameraObserver.onInfo(1, 0, "Camera features is ready");
                    }
                    if (this.LLJJ) {
                        this.mCameraObserver.onInfo(52, 0, "");
                        this.LLJJ = false;
                    }
                    C1321640kUs.LIZIZ();
                    return 0;
                }
                updateCameraState(1);
                if (this.mCameraInstance == null) {
                    this.mCameraInstance = LJFF();
                    if (this.mCameraInstance == null) {
                        updateCameraState(0);
                        int i7 = C2187451AjH.LIZ;
                        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                        sbLIZ7.append("open failed, reason=create_instance_null, settings=");
                        sbLIZ7.append(cameraSettingsForLog(this.mCameraSettings));
                        C2183341Ace.LIZIZ("TECameraServer", C2188811AlT.LIZIZ(sbLIZ7));
                        this.mCameraObserver.onError(-100, "open : mCameraInstance is null.");
                        return -1;
                    }
                    this.mCameraInstance.LJLJJLL();
                    this.mCameraInstance.LJJLIIIJ(LLJJIJIIJIL);
                }
                this.mBeginTime = System.currentTimeMillis();
                int iLJLLI = this.mCameraInstance.LJLLI(this.mCameraSettings, cert);
                if (iLJLLI != 0) {
                    int i8 = C2187451AjH.LIZ;
                    StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                    sbLIZ8.append("open system call failed, ret=");
                    sbLIZ8.append(iLJLLI);
                    sbLIZ8.append(", settings=");
                    sbLIZ8.append(cameraSettingsForLog(this.mCameraSettings));
                    C2183341Ace.LJ("TECameraServer", C2188811AlT.LIZIZ(sbLIZ8));
                }
                C1321640kUs.LIZIZ();
                return 0;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public int queryZoomAbility(final TECameraCapture tECameraCapture, final InterfaceC2254701DMu interfaceC2254701DMu, final boolean z) {
        if (!LIZJ(tECameraCapture)) {
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            C786410Ut5.LJJZZIII(this.mHandler, new Runnable() { // from class: X.0jSp
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("TECameraServer@d252.queryZoomAbility$1");
                    try {
                        this.LLILZ.queryZoomAbility(tECameraCapture, interfaceC2254701DMu, z);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("TECameraServer@d252.queryZoomAbility$1");
                }
            });
            return 0;
        }
        int i = C2187451AjH.LIZ;
        C2183341Ace.LIZLLL("TECameraServer", "queryZoomAbility...");
        synchronized (this.mStateLock) {
            try {
                if (this.mCameraInstance != null) {
                    this.mCameraInstance.LJJI(interfaceC2254701DMu, z);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return 0;
    }

    public void setPictureSize(TECameraCapture tECameraCapture, int i, int i2) {
        if (LIZJ(tECameraCapture)) {
            Handler handler = this.mHandler;
            if (handler != null) {
                C786410Ut5.LJJZZIII(handler, new ARunnableS13S0102000_33(this, i, i2, 1));
                return;
            }
            return;
        }
        int i3 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("set picture size failed, w: ");
        sbLIZ.append(i);
        sbLIZ.append(", h: ");
        sbLIZ.append(i2);
        C2183341Ace.LJ("TECameraServer", C2188811AlT.LIZIZ(sbLIZ));
    }

    public void setWhileBalance(final TECameraCapture tECameraCapture, final boolean z, final String str) {
        if (!LIZJ(tECameraCapture)) {
            return;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            C786410Ut5.LJJZZIII(this.mHandler, new Runnable() { // from class: X.0jTJ
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("TECameraServer@d252.setWhileBalance$1");
                    try {
                        this.LLILZ.setWhileBalance(tECameraCapture, z, str);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("TECameraServer@d252.setWhileBalance$1");
                }
            });
            return;
        }
        synchronized (this.mStateLock) {
            try {
                int i = C2187451AjH.LIZ;
                C2183341Ace.LIZLLL("TECameraServer", "setWhiteBalance...");
                if (this.mCameraInstance != null) {
                    this.mCameraInstance.LJJIFFI(str);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public int startZoom(TECameraCapture tECameraCapture, float f, InterfaceC2254701DMu interfaceC2254701DMu) {
        Message messageObtainMessage;
        if (!LIZJ(tECameraCapture)) {
            int i = C2187451AjH.LIZ;
            C2183341Ace.LIZIZ("TECameraServer", "[VE_UI_TEST]Failed event: START_ZOOM. Code: -108. Reason: invalid CameraClient");
            return -108;
        }
        Looper.myLooper();
        this.mHandler.getLooper();
        C1DJK c1djk = this.mCameraInstance;
        if (c1djk == null) {
            int i2 = C2187451AjH.LIZ;
            C2183341Ace.LIZIZ("TECameraServer", "[VE_UI_TEST]Failed event: START_ZOOM. Code: -105. Reason: mCameraInstance is null");
            C2183341Ace.LJ("TECameraServer", "camera is null, no need to start zoom");
            return -105;
        }
        float fAbs = Math.abs(f - this.LLILLL);
        if (Math.abs(f - c1djk.LJFF()) < 0.1f) {
            f = c1djk.LJFF();
        } else if (Math.abs(f) < 0.1f) {
            f = 0.0f;
        } else if (fAbs < 0.1f) {
            return 0;
        }
        this.LLILLL = f;
        Handler handler = this.mHandler;
        if (handler.hasMessages(1)) {
            handler.removeMessages(1);
            messageObtainMessage = new Message();
        } else {
            messageObtainMessage = handler.obtainMessage();
        }
        messageObtainMessage.what = 1;
        messageObtainMessage.arg1 = (int) (f * 100.0f);
        messageObtainMessage.obj = interfaceC2254701DMu;
        C786410Ut5.LJLJJL(this.mHandler, messageObtainMessage);
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x018a, code lost:
    
        if (r1 != 11) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b8 A[Catch: all -> 0x01cd, TryCatch #0 {all -> 0x01cd, blocks: (B:24:0x007f, B:28:0x008e, B:31:0x0094, B:32:0x00a0, B:34:0x00a2, B:36:0x00aa, B:38:0x00ae, B:40:0x00b2, B:42:0x00b8, B:44:0x00bc, B:45:0x00cd, B:47:0x00d1, B:49:0x0101, B:50:0x0109, B:51:0x010f, B:53:0x011b, B:54:0x0121, B:56:0x0149, B:57:0x017e, B:61:0x0184, B:67:0x018f), top: B:78:0x007f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int switchCamera(com.ss.android.ttvecamera.TECameraCapture r13, X.C1DJ6 r14, com.bytedance.bpea.basics.Cert r15) {
        /*
            Method dump skipped, instruction units count: 467
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ttvecamera.b0.switchCamera(com.ss.android.ttvecamera.TECameraCapture, X.1DJ6, com.bytedance.bpea.basics.Cert):int");
    }

    public int updateCameraProviderCaptureListener(TECameraCapture tECameraCapture, UUID uuid, C1DJX c1djx) {
        C1DN3 c1dn3LJIIIZ;
        if (!LIZJ(tECameraCapture)) {
            return -108;
        }
        synchronized (this.mStateLock) {
            try {
                if (this.mCameraInstance != null && this.mCameraInstance.LJJIJLIJ() != null && ((this.mCurrentCameraState == 2 || this.mCurrentCameraState == 3) && (c1dn3LJIIIZ = this.mCameraInstance.LJJIJLIJ().LIZ.LJIIIZ(uuid)) != null)) {
                    c1dn3LJIIIZ.LJIJJ(c1djx);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return 0;
    }

    public int updateCameraProviderState(TECameraCapture tECameraCapture, UUID uuid, boolean z) {
        C1DN3 c1dn3LJIIIZ;
        if (!LIZJ(tECameraCapture)) {
            return -108;
        }
        synchronized (this.mStateLock) {
            try {
                if (this.mCameraInstance != null && this.mCameraInstance.LJJIJLIJ() != null && ((this.mCurrentCameraState == 3 || this.mCurrentCameraState == 2) && (c1dn3LJIIIZ = this.mCameraInstance.LJJIJLIJ().LIZ.LJIIIZ(uuid)) != null)) {
                    c1dn3LJIIIZ.LIZLLL = z;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return 0;
    }

    public int zoomV2(final TECameraCapture tECameraCapture, final float f, final InterfaceC2254701DMu interfaceC2254701DMu) {
        if (!LIZJ(tECameraCapture)) {
            int i = C2187451AjH.LIZ;
            C2183341Ace.LIZIZ("TECameraServer", "[VE_UI_TEST]Failed event: START_ZOOM. Code: -108. Reason: invalid CameraClient");
            return -108;
        }
        if (Looper.myLooper() != this.mHandler.getLooper()) {
            C786410Ut5.LJJZZIII(this.mHandler, new Runnable() { // from class: X.0jSo
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("TECameraServer@d252.zoomV2$1");
                    try {
                        this.LLILZ.zoomV2(tECameraCapture, f, interfaceC2254701DMu);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("TECameraServer@d252.zoomV2$1");
                }
            });
            return 0;
        }
        synchronized (this.mStateLock) {
            try {
                if (this.mCameraInstance != null) {
                    this.mCameraInstance.LJLJI(f, interfaceC2254701DMu);
                }
                if (this.mFirstZoom) {
                    this.mCameraEvent.LJ(114, 0, "zoomV2");
                    this.mFirstZoom = false;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return 0;
    }

    public int switchCamera(TECameraCapture tECameraCapture, int i, Cert cert) {
        C1DJ6 c1dj6;
        boolean z;
        Cert certLJJJLL;
        Cert certLJJJLL2;
        if (LIZJ(tECameraCapture) && (c1dj6 = this.mCameraSettings) != null) {
            if (c1dj6.LLILZ == i) {
                return -423;
            }
            this.LLJILJILJ = true;
            if (Looper.myLooper() != this.mHandler.getLooper()) {
                C786410Ut5.LJJZZIII(this.mHandler, new ARunnableS13S0301000_20(i, tECameraCapture, cert, this, 2));
                return 0;
            }
            synchronized (this.mStateLock) {
                try {
                    if (this.mCurrentCameraState == 1) {
                        this.LLJILJILJ = false;
                        this.mCameraObserver.onError(-105, "Camera is opening, ignore this switch request.");
                        return -105;
                    }
                    if (i == 7) {
                        if (this.mCameraSettings.LLILZ == 7) {
                            z = false;
                        }
                        z = true;
                    } else {
                        if (i != 7 && this.mCameraSettings.LLILZ == 7) {
                            z = true;
                        }
                        z = false;
                    }
                    if (z) {
                        C1DJ6 c1dj62 = this.mCameraSettings;
                        if (c1dj62.LLILLJJLI != 11) {
                            this.LLJILLL = c1dj62.LLILZ;
                            int i2 = C2187451AjH.LIZ;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("switchCamera reopen for multicam change, oldFacing=");
                            sbLIZ.append(this.mCameraSettings.LLILZ);
                            sbLIZ.append(", newFacing=");
                            sbLIZ.append(i);
                            sbLIZ.append(", settings=");
                            sbLIZ.append(cameraSettingsForLog(this.mCameraSettings));
                            C2183341Ace.LJ("TECameraServer", C2188811AlT.LIZIZ(sbLIZ));
                            this.mCameraSettings.LLILZ = i;
                            this.LLILLL = 0.0f;
                            if (this.mCameraInstance != null) {
                                certLJJJLL2 = this.mCameraInstance.LJJJLL(EnumC1270990jBB.EXCEPTION_CLOSE_CAMERA);
                            } else {
                                certLJJJLL2 = cert;
                            }
                            close(certLJJJLL2);
                            open(tECameraCapture, this.mCameraSettings, cert);
                            return 0;
                        }
                    }
                    this.mCameraSettings.LLILZ = i;
                    this.LLILLL = 0.0f;
                    if (this.mCameraInstance == null) {
                        this.mCameraInstance = LJFF();
                        if (this.mCameraInstance == null) {
                            this.mCurrentCameraState = 0;
                            this.mCameraObserver.onError(-100, "open : mCameraInstance is null.");
                            this.LLJILJILJ = false;
                            return -1;
                        }
                    }
                    if (this.mCurrentCameraState != 0) {
                        updateCameraState(4);
                        C1DJK c1djk = this.mCameraInstance;
                        if (this.mCameraInstance != null) {
                            certLJJJLL = this.mCameraInstance.LJJJLL(EnumC1270990jBB.EXCEPTION_CLOSE_CAMERA);
                        } else {
                            certLJJJLL = cert;
                        }
                        c1djk.LJI(certLJJJLL);
                        updateCameraState(0);
                    }
                    updateCameraState(1);
                    this.LLJILJILJ = false;
                    if (this.mRetryCnt < 0) {
                        this.mRetryCnt = this.mCameraSettings.LLJJL;
                    }
                    this.mBeginTime = System.currentTimeMillis();
                    int iLJLLI = this.mCameraInstance.LJLLI(this.mCameraSettings, cert);
                    if (iLJLLI != 0) {
                        C1DJP c1djp = this.mCameraObserver;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("Switch camera failed @");
                        sbLIZ2.append(this.mCameraSettings.LLILLJJLI);
                        sbLIZ2.append(",face:");
                        sbLIZ2.append(this.mCameraSettings.LLILZ);
                        sbLIZ2.append(" ");
                        sbLIZ2.append(this.mCameraSettings.LLJJJIL.toString());
                        c1djp.onError(iLJLLI, C2188811AlT.LIZIZ(sbLIZ2));
                    }
                    return iLJLLI;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        int i3 = C2187451AjH.LIZ;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("switchCamera failed: ");
        sbLIZ3.append(i);
        sbLIZ3.append("assertClient(client) = ");
        sbLIZ3.append(LIZJ(tECameraCapture));
        C2183341Ace.LIZIZ("TECameraServer", C2188811AlT.LIZIZ(sbLIZ3));
        return -108;
    }

    public int takePicture(TECameraCapture tECameraCapture, int i, int i2, InterfaceC2186271AhN interfaceC2186271AhN) {
        if (!LIZJ(tECameraCapture)) {
            return -108;
        }
        C786410Ut5.LJJZZIII(this.mHandler, new ARunnableS13S0102000_33(this, i, i2, 0));
        return 0;
    }

    public int connect(TECameraCapture tECameraCapture, C1DJP c1djp, C1DJ6 c1dj6, C1DJT c1djt, Cert cert) {
        Cert certLJJJLL;
        HandlerThread handlerThread;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("connect with client: ");
        sbLIZ.append(tECameraCapture);
        C2183341Ace.LIZLLL("TECameraServer", C2188811AlT.LIZIZ(sbLIZ));
        if (tECameraCapture != null) {
            if (c1djp != null) {
                if (c1dj6 != null) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("connect request, client=");
                    sbLIZ2.append(tECameraCapture);
                    sbLIZ2.append(", settings=");
                    sbLIZ2.append(cameraSettingsForLog(c1dj6));
                    C2183341Ace.LIZLLL("TECameraServer", C2188811AlT.LIZIZ(sbLIZ2));
                    this.mMainHandler.removeCallbacks(this.mCheckCloseTask);
                    synchronized (this.LLILZLL) {
                        try {
                            boolean zLJIIJJI = LJIIJJI(c1dj6);
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("connect decision, reOpen=");
                            sbLIZ3.append(zLJIIJJI);
                            C2183341Ace.LIZLLL("TECameraServer", C2188811AlT.LIZIZ(sbLIZ3));
                            if (!zLJIIJJI) {
                                TECameraCapture tECameraCapture2 = this.mCameraClient;
                                if (tECameraCapture == tECameraCapture2) {
                                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                    sbLIZ4.append("connect ignored, reason=same_client, client=");
                                    sbLIZ4.append(tECameraCapture);
                                    C2183341Ace.LJ("TECameraServer", C2188811AlT.LIZIZ(sbLIZ4));
                                    return -423;
                                }
                                if (tECameraCapture2 != null && c1dj6.LLJJIJI) {
                                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                    sbLIZ5.append("connect replace client without reopen, oldClient=");
                                    sbLIZ5.append(this.mCameraClient);
                                    sbLIZ5.append(", newClient=");
                                    sbLIZ5.append(tECameraCapture);
                                    C2183341Ace.LJ("TECameraServer", C2188811AlT.LIZIZ(sbLIZ5));
                                    decreaseClientCount();
                                    this.LLJJ = true;
                                }
                            }
                            if (!this.LLIZ) {
                                LJIIIZ(c1dj6);
                                C2183341Ace.LIZLLL("TECameraServer", "connect initialized camera server");
                                zLJIIJJI = false;
                            }
                            this.mCameraClient = tECameraCapture;
                            this.mCameraObserver = c1djp;
                            this.mPictureSizeCallback = c1djt;
                            this.mRetryCnt = -1;
                            synchronized (this) {
                                try {
                                    if (this.mCameraObserver != null && (handlerThread = this.LL) != null) {
                                        this.mCameraObserver.onInfo(125, handlerThread.getThreadId(), "cameraserver");
                                    }
                                } finally {
                                }
                            }
                            synchronized (this) {
                                try {
                                    this.mCameraClient = tECameraCapture;
                                    if (c1dj6.LLJJIJIIJIL && !this.LLIZ) {
                                        LJIIIZ(c1dj6);
                                    }
                                    LJII();
                                } finally {
                                }
                            }
                            if (zLJIIJJI) {
                                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                                sbLIZ6.append("connect reopen camera, client=");
                                sbLIZ6.append(tECameraCapture);
                                sbLIZ6.append(", settings=");
                                sbLIZ6.append(cameraSettingsForLog(c1dj6));
                                C2183341Ace.LJ("TECameraServer", C2188811AlT.LIZIZ(sbLIZ6));
                                if (this.mCameraInstance != null) {
                                    certLJJJLL = this.mCameraInstance.LJJJLL(EnumC1270990jBB.EXCEPTION_CLOSE_CAMERA);
                                } else {
                                    certLJJJLL = this.cachedClosePrivacyCert;
                                }
                                int iClose = close(certLJJJLL);
                                StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                                sbLIZ7.append("connect reopen close finished, closeRet=");
                                sbLIZ7.append(iClose);
                                C2183341Ace.LJ("TECameraServer", C2188811AlT.LIZIZ(sbLIZ7));
                                Handler handler = this.mHandler;
                                if (handler != null) {
                                    C786410Ut5.LJJZZIII(handler, new ARunnableS133S0100000_33(this, 38));
                                }
                                if (iClose == 0) {
                                    decreaseClientCount();
                                }
                            }
                            this.mIsCameraPendingClose = false;
                            this.cachedOpenPrivacyCert = cert;
                            int iOpen = open(tECameraCapture, c1dj6, cert);
                            StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                            sbLIZ8.append("connect open requested, ret=");
                            sbLIZ8.append(iOpen);
                            sbLIZ8.append(", client=");
                            sbLIZ8.append(tECameraCapture);
                            C2183341Ace.LIZLLL("TECameraServer", C2188811AlT.LIZIZ(sbLIZ8));
                            return iOpen;
                        } finally {
                        }
                    }
                }
                throw new IllegalArgumentException("mParams must not be null");
            }
            throw new IllegalArgumentException("observer must not be null");
        }
        throw new IllegalArgumentException("client must not be null");
    }
}
