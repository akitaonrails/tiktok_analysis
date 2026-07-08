package com.ss.android.vesdk;

import X.AbstractC2239611ClD;
import X.AbstractC2254271DLd;
import X.C0VSJ;
import X.C1305700k5A;
import X.C1311120kDu;
import X.C1461270o85;
import X.C1621750sIv;
import X.C1664350tPd;
import X.C1780100wQK;
import X.C1AM5;
import X.C1AO7;
import X.C1AO8;
import X.C1DIC;
import X.C1DIT;
import X.C1DIV;
import X.C1DMB;
import X.C1DMC;
import X.C1DMH;
import X.C1DMO;
import X.C1DMT;
import X.C1DMU;
import X.C1DMW;
import X.C1DMZ;
import X.C20188413z0;
import X.C2183341Ace;
import X.C2185991Agv;
import X.C2186031Agz;
import X.C2186061Ah2;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2254301DLg;
import X.C2254321DLi;
import X.C2254331DLj;
import X.C2254351DLl;
import X.C2254371DLn;
import X.C2254401DLq;
import X.C2254411DLr;
import X.C2254451DLv;
import X.C2254461DLw;
import X.C2484209oO;
import X.C448700Hie;
import X.C578870Mn7;
import X.C786410Ut5;
import X.EnumC1780160wQQ;
import X.EnumC1780170wQR;
import X.EnumC1780180wQS;
import X.EnumC2186221AhI;
import X.EnumC578750Mmv;
import X.EnumC578800Mn0;
import X.InterfaceC1464200oCo;
import X.InterfaceC1621790sIz;
import X.InterfaceC2177991ALt;
import X.InterfaceC2178571ANz;
import X.InterfaceC2183551Acz;
import X.InterfaceC2185721AgU;
import X.InterfaceC2185751AgX;
import X.InterfaceC2185971Agt;
import X.InterfaceC2186051Ah1;
import X.InterfaceC2219671Bu9;
import X.InterfaceC2254511DMb;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.view.Surface;
import com.bef.effectsdk.message.MessageCenter;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ttve.model.VEFrame;
import com.ss.android.ttve.model.VETrackParams;
import com.ss.android.ttve.monitor.TEPerfStatsInvoker;
import com.ss.android.ttve.nativePort.NativeCallbacks;
import com.ss.android.ttve.nativePort.TEAudioDataInterface;
import com.ss.android.ttve.nativePort.TEBundle;
import com.ss.android.ttve.nativePort.TECallbackClient;
import com.ss.android.ttve.nativePort.TEMessageClient;
import com.ss.android.ttve.nativePort.TERecorderInterface;
import com.ss.android.ttve.nativePort.TEVideoUtils;
import com.ss.android.ttvecamera.TECameraFrameSetting;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.vesdk.TECamera;
import com.ss.android.vesdk.VEAudioCaptureSettings;
import com.ss.android.vesdk.VECameraSettings;
import com.ss.android.vesdk.VEConfigCenter;
import com.ss.android.vesdk.VEDisplaySettings;
import com.ss.android.vesdk.VEInfo;
import com.ss.android.vesdk.VEPreviewSettings;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import com.ss.android.vesdk.filterparam.VEAudioSpeedFilterParam;
import com.ss.android.vesdk.filterparam.VEBaseFilterParam;
import com.ss.android.vesdk.filterparam.VEBlurFilterParam;
import com.ss.android.vesdk.filterparam.VEFocusRunEffectFilter;
import com.ss.android.vesdk.filterparam.VEMIMOFilterParam;
import com.ss.android.vesdk.k;
import com.ss.android.vesdk.lens.VEAdaptiveSharpenParams;
import com.ss.android.vesdk.lens.VEBaseRecorderLensParams;
import com.ss.android.vesdk.lens.VELumaDetectParams;
import com.ss.android.vesdk.lens.VEOneKeyProcessParams;
import com.ss.android.vesdk.lens.VERhythmicMotionParam;
import com.ss.android.vesdk.lens.VETaintSceneDetectParams;
import com.ss.android.vesdk.model.VEPrePlayParams;
import com.ss.android.vesdk.proxy.TEDuetProxy;
import com.ss.android.vesdk.runtime.VERuntime;
import com.ss.android.vesdk.utils.TEArrayUtils;
import gro.a;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import lro.b;

/* JADX INFO: loaded from: classes36.dex */
public class k extends AbstractC2254271DLd implements InterfaceC2186051Ah1 {
    public static boolean LLIILII;
    public final a LJJIZ;
    public final TERecorderInterface LJJJ;
    public TECamera LJJJI;
    public TECamera LJJJIL;
    public final C2254401DLq LJJJJ;
    public final Object LJJJJI;
    public C1DIC LJJJJIZL;
    public InterfaceC2185971Agt LJJJJJ;
    public VEPreviewSettings LJJJJJL;
    public TECameraFrameSetting LJJJJL;
    public final TECallbackClient LJJJJLI;
    public boolean LJJJJLL;
    public InterfaceC1464200oCo LJJJJZ;
    public final List<InterfaceC1464200oCo> LJJJJZI;
    public final Object LJJJLIIL;
    public InterfaceC1464200oCo LJJJLL;
    public InterfaceC2183551Acz LJJJLZIJ;
    public InterfaceC2183551Acz LJJJZ;
    public InterfaceC2183551Acz LJJL;
    public InterfaceC2183551Acz LJJLI;
    public InterfaceC2183551Acz LJJLIIIIJ;
    public InterfaceC2183551Acz LJJLIIIJ;
    public InterfaceC2183551Acz LJJLIIIJILLIZJL;
    public InterfaceC2183551Acz LJJLIIIJJI;
    public InterfaceC2183551Acz LJJLIIIJJIZ;
    public InterfaceC2183551Acz LJJLIIIJL;
    public int LJJLIIIJLJLI;
    public final Map<Integer, Pair<VEBaseFilterParam, Integer>> LJJLIIIJLLLLLLLZ;
    public final ExecutorService LJJLIIJ;
    public int LJJLIL;
    public int LJJLJ;
    public int LJJLJLI;
    public int LJJLL;
    public final Object LJJZ;
    public final AtomicBoolean LJJZZI;
    public C1DMH LJJZZIII;
    public final Object LJL;
    public int LJLI;
    public TEAudioDataInterface LJLIIIL;
    public VEAudioCaptureSettings LJLIIL;
    public final BPEAHandler LJLIL;
    public boolean LJLILLLLZI;
    public boolean LJLJI;
    public boolean LJLJJI;
    public String LJLJJL;
    public boolean LJLJJLL;
    public VEDisplaySettings LJLJL;
    public int LJLJLJ;
    public final C1621750sIv LJLJLLL;
    public final Lock LJLL;
    public final Condition LJLLI;
    public final Lock LJLLILLLL;
    public final Condition LJLLJ;
    public final Lock LJLLL;
    public final Condition LJLLLL;
    public final Lock LJLLLLLL;
    public final Condition LJLZ;
    public Surface LJZ;
    public final int LJZI;
    public final VESize LJZL;
    public final int LL;
    public C1DMZ LLD;
    public boolean LLF;
    public volatile boolean LLFF;
    public C1461270o85 LLFFF;
    public TECamera LLFII;
    public final C1664350tPd<C2185991Agv> LLFZ;
    public final C1664350tPd<C2185991Agv> LLI;
    public final Queue<Pair<Integer, Long>> LLIFFJFJJ;
    public final HashMap<Integer, C1AO7> LLII;
    public final AtomicInteger LLIIII;
    public float LLIIIILZ;
    public final C20188413z0 LLIIIJ;
    public double[] LLIIIL;
    public final Object LLIIIZ;
    public final boolean LLIIJI;
    public boolean LLIIJLIL;
    public int LLIIL;

    public final void LJIJ() {
        C1DMZ c1dmz;
        synchronized (this) {
            if (this.LLD == null) {
                LJIJJLI();
            }
            c1dmz = this.LLD;
        }
        if (c1dmz == null) {
            return;
        }
        c1dmz.LIZ();
    }

    public final void LJJJIL() {
        this.LLFF = true;
        C1DMU c1dmu = new C1DMT().LIZ;
        c1dmu.LIZ = false;
        LJJJI(null, c1dmu);
    }

    @Override // X.AbstractC2254271DLd
    public final void LIZJ() {
        this.LJJIZ.LJIILLIIL(null);
        TECamera tECamera = this.LJJJI;
        if (tECamera != null) {
            tECamera.destroy();
        }
        TECamera tECamera2 = this.LLFII;
        if (tECamera2 != null) {
            tECamera2.destroy();
        }
        TECamera tECamera3 = this.LJJJIL;
        if (tECamera3 != null) {
            tECamera3.destroy();
        }
        if (this.LLD != null) {
            LJIJ();
        }
        synchronized (this.LJJJJI) {
            try {
                if (this.LJJJJ.LJFF != 0) {
                    this.LJJJJ.LJFF = 0;
                    int iLJIJ = this.LJJJ.LJIJ();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("releaseInternalRecorder ret: ");
                    sbLIZ.append(iLJIJ);
                    C2484209oO.LJI("TERecorder", C2188811AlT.LIZIZ(sbLIZ));
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        C1DMZ c1dmz = this.LLD;
        if (c1dmz != null) {
            c1dmz.release();
        }
        this.LJJJJZ = null;
        this.LJJJLL = null;
        this.LJJJZ = null;
        a aVar = this.LJJIZ;
        if (aVar != null) {
            MessageCenter.removeListener(aVar);
            List<InterfaceC2177991ALt> list = aVar.LLILLL;
            if (list != null) {
                ((CopyOnWriteArrayList) list).clear();
            }
            List<C1AM5> list2 = aVar.LLJ;
            if (list2 != null) {
                ((CopyOnWriteArrayList) list2).clear();
            }
        }
        VEAudioCapture vEAudioCapture = this.LIZ;
        if (vEAudioCapture != null) {
            vEAudioCapture.clean();
        }
        TEAudioDataInterface tEAudioDataInterface = this.LJLIIIL;
        if (tEAudioDataInterface != null) {
            tEAudioDataInterface.release();
        }
        TECallbackClient tECallbackClient = this.LJJJJLI;
        if (tECallbackClient != null) {
            tECallbackClient.setLensCallback(null);
        }
        b bVar = this.LJJIJLIJ;
        if (bVar != null) {
            bVar.LIZJ(null);
        }
        super.LIZJ();
    }

    public final VERecordMode LJIILJJIL() {
        synchronized (this.LJL) {
            try {
                C1DMH c1dmh = this.LJJZZIII;
                if (c1dmh == null) {
                    return this.LJIIJJI;
                }
                if (c1dmh instanceof C2254351DLl) {
                    return VERecordMode.REACTION;
                }
                if (c1dmh instanceof TEDuetProxy) {
                    return VERecordMode.DUET;
                }
                if (c1dmh instanceof C2254331DLj) {
                    return VERecordMode.CUSTOM_VIDEO_BG;
                }
                return VERecordMode.DEFAULT;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final long LJIILL() {
        return this.LJJJJJL.isEnableRenderLayer() ? this.LJJJ.LJIIIIZZ("CurMediaTime") : this.LJJJ.LJIIIIZZ("CurMediaTime") / LSPassThroughRecordSizeConfig.DEFAULT;
    }

    public final int LJIIZILJ() {
        TERecorderInterface tERecorderInterface = this.LJJJ;
        if (tERecorderInterface.LIZ != 0) {
            return tERecorderInterface.LJIIIIZZ("RecordStatus");
        }
        C2484209oO.LIZJ("TERecorder", "getRecordStatus failed, recorder is invalid");
        return -1;
    }

    public final int LJIJJ() {
        if (this.LIZ == null) {
            C2484209oO.LJIIIIZZ("TERecorder", "Internal audio capture is null");
            return -1;
        }
        VEAudioCaptureSettings.Builder builder = new VEAudioCaptureSettings.Builder();
        builder.setAudioDataStore(1);
        builder.setAudioCaptureLowLatency(LJIL());
        builder.enableSysKaraoke(false);
        VEAudioCaptureSettings vEAudioCaptureSettingsBuild = builder.build();
        this.LJLIIL = vEAudioCaptureSettingsBuild;
        int iInit = this.LIZ.init(vEAudioCaptureSettingsBuild);
        if (iInit != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("audio capture init failed %d");
            sbLIZ.append(iInit);
            C2484209oO.LIZJ("TERecorder", C2188811AlT.LIZIZ(sbLIZ));
        }
        return iInit;
    }

    public final void LJIJJLI() {
        if (this.LLF) {
            return;
        }
        this.LLF = true;
        try {
            Class<?> cls = Class.forName("com.ss.android.vesdk.internal.apiimpl.VERecorderBusiness");
            this.LLD = (C1DMZ) cls.getMethod("newInternalInstance", Long.TYPE).invoke(null, Long.valueOf(this.LJJJ.LIZ));
            cls.getDeclaredMethod("init", new Class[0]).invoke(this.LLD, new Object[0]);
        } catch (ClassNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
        } catch (IllegalAccessException e2) {
            TryCatchGuardChecker.doCheck(e2);
        } catch (NoSuchMethodException e3) {
            TryCatchGuardChecker.doCheck(e3);
        } catch (InvocationTargetException e4) {
            TryCatchGuardChecker.doCheck(e4);
        } catch (Exception e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
    }

    public final boolean LJIL() {
        VERecordMode vERecordMode = this.LJIIJJI;
        return vERecordMode == VERecordMode.KARAOKE || vERecordMode == VERecordMode.KARAOKE_PURE_AUDIO || vERecordMode == VERecordMode.DUET_KARAOKE;
    }

    public final boolean LJJI() {
        boolean z;
        synchronized (this.LJL) {
            try {
                C1DMH c1dmh = this.LJJZZIII;
                z = c1dmh != null && (c1dmh instanceof C2254331DLj);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return z;
    }

    public final int LJJJJI() {
        InterfaceC2185971Agt interfaceC2185971Agt = this.LJJJJJ;
        if (interfaceC2185971Agt != null) {
            interfaceC2185971Agt.LJIILLIIL(false);
        } else {
            C2484209oO.LJIIIIZZ("TERecorder", "CameraPreview is null.");
        }
        int iLJJIZ = this.LJJJ.LJJIZ();
        this.LJJJJ.getClass();
        VEAudioCapture vEAudioCapture = this.LIZ;
        if (vEAudioCapture != null) {
            vEAudioCapture.stop(null);
        }
        synchronized (this.LJL) {
            if (iLJJIZ == 0) {
                try {
                    C1DMH c1dmh = this.LJJZZIII;
                    if (c1dmh != null) {
                        c1dmh.LJJIJIIJIL();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return iLJJIZ;
    }

    /* JADX WARN: Type inference failed for: r0v38, types: [X.0sIv] */
    public k(AbstractC2239611ClD abstractC2239611ClD) {
        super(abstractC2239611ClD);
        this.LJJJJI = new Object();
        this.LJJJJJ = null;
        this.LJJJJZ = null;
        this.LJJJJZI = new ArrayList();
        this.LJJJLIIL = new Object();
        this.LJJJLL = null;
        this.LJJLIIIJLJLI = -1;
        HashMap map = new HashMap();
        this.LJJLIIIJLLLLLLLZ = map;
        this.LJJLIIJ = C786410Ut5.h4();
        this.LJJLIL = 0;
        this.LJJLJ = -1;
        this.LJJLJLI = -1;
        this.LJJLL = -1;
        this.LJJZ = new Object();
        this.LJJZZI = new AtomicBoolean(false);
        this.LJJZZIII = null;
        this.LJL = new Object();
        this.LJLI = -1;
        this.LJLIL = new BPEAHandler(Looper.getMainLooper());
        this.LJLILLLLZI = false;
        this.LJLJI = false;
        this.LJLJJI = false;
        this.LJLJJLL = false;
        this.LJLJLJ = -1;
        this.LJLJLLL = null;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.LJLL = reentrantLock;
        this.LJLLI = reentrantLock.newCondition();
        ReentrantLock reentrantLock2 = new ReentrantLock();
        this.LJLLILLLL = reentrantLock2;
        this.LJLLJ = reentrantLock2.newCondition();
        ReentrantLock reentrantLock3 = new ReentrantLock();
        this.LJLLL = reentrantLock3;
        this.LJLLLL = reentrantLock3.newCondition();
        ReentrantLock reentrantLock4 = new ReentrantLock();
        this.LJLLLLLL = reentrantLock4;
        this.LJLZ = reentrantLock4.newCondition();
        this.LJZI = C1DIV.RADIO_9_16.ordinal();
        this.LJZL = new VESize(0, 0);
        new VESize(0, 0);
        this.LL = EnumC1780160wQQ.NO_MIRROR.ordinal();
        this.LLF = false;
        this.LLFF = true;
        this.LLFZ = new C1664350tPd<>();
        this.LLI = new C1664350tPd<>();
        this.LLIFFJFJJ = new LinkedList();
        this.LLII = new HashMap<>();
        this.LLIIII = new AtomicInteger(0);
        this.LLIIIZ = new Object();
        this.LLIIJI = true;
        NativeCallbacks.IGetFrameCallback iGetFrameCallback = new NativeCallbacks.IGetFrameCallback() { // from class: X.1AOF
            @Override // com.ss.android.ttve.nativePort.NativeCallbacks.IGetFrameCallback
            public final void onResult(int i, int i2) {
                C1AO7 c1ao7;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("new getPreviewFrame callback, tag: ");
                sbLIZ.append(i2);
                C2484209oO.LJI("TERecorder", C2188811AlT.LIZIZ(sbLIZ));
                if (this.LIZ.LLII.containsKey(Integer.valueOf(i2)) && (c1ao7 = this.LIZ.LLII.get(Integer.valueOf(i2))) != null) {
                    c1ao7.onResult(i);
                }
            }

            @Override // com.ss.android.ttve.nativePort.NativeCallbacks.IGetFrameCallback
            public final void onResult(VEFrame vEFrame, boolean z, int i, int i2) {
                C1AO7 c1ao7;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("new getPreviewFrame callback, tag: ");
                sbLIZ.append(i2);
                C2484209oO.LJI("TERecorder", C2188811AlT.LIZIZ(sbLIZ));
                if (this.LIZ.LLII.containsKey(Integer.valueOf(i2)) && (c1ao7 = this.LIZ.LLII.get(Integer.valueOf(i2))) != null) {
                    c1ao7.LIZIZ(vEFrame, i);
                }
            }

            @Override // com.ss.android.ttve.nativePort.NativeCallbacks.IGetFrameCallback
            public final void onResult(int[] iArr, int i, int i2, long j, boolean z, int i3) {
                C1AO7 c1ao7;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("new getPreviewFrame callback, tag: ");
                sbLIZ.append(i3);
                C2484209oO.LJI("TERecorder", C2188811AlT.LIZIZ(sbLIZ));
                if (this.LIZ.LLII.containsKey(Integer.valueOf(i3)) && (c1ao7 = this.LIZ.LLII.get(Integer.valueOf(i3))) != null) {
                    c1ao7.LIZ(i, i2, iArr);
                    c1ao7.LIZIZ(VEFrame.createIntArrayFrame(iArr, i, i2, 0, j, EnumC2185621AgK.TEPixFmt_RGBA8), 0);
                }
            }
        };
        this.LLIIJLIL = false;
        InterfaceC2185721AgU interfaceC2185721AgU = new InterfaceC2185721AgU() { // from class: X.1AhG
            @Override // X.InterfaceC2185721AgU
            public final void LIZ(int i) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onOpenGLDestroy...ret:");
                sbLIZ.append(i);
                C2484209oO.LJI("TERecorder", C2188811AlT.LIZIZ(sbLIZ));
                this.LIZ.LLFZ.LIZIZ();
                this.LIZ.LJJJI.release();
                TECamera tECamera = this.LIZ.LJJJIL;
                if (tECamera != null) {
                    tECamera.release();
                }
                this.LIZ.LLFII.release();
                this.LIZ.LLI.LIZIZ();
                this.LIZ.getClass();
                this.LIZ.LJIILIIL(1001, 0, 0.0f, "Render Env Destroy.");
                this.LIZ.LJJII(1001, 0, 0.0f, "Render Env Destroy.");
            }

            /* JADX WARN: Removed duplicated region for block: B:20:0x00ad  */
            @Override // X.InterfaceC2185721AgU
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZJ(int r11) {
                /*
                    Method dump skipped, instruction units count: 248
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C2186201AhG.LIZJ(int):void");
            }

            @Override // X.InterfaceC2185721AgU
            public final void LIZLLL(int i) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onPreviewSurface: ret = ");
                sbLIZ.append(i);
                C2484209oO.LJI("TERecorder", C2188811AlT.LIZIZ(sbLIZ));
            }

            @Override // X.InterfaceC2185721AgU
            public final void LJ(double d) {
                C2484209oO.LJII("TERecorder", "onOpenGLDrawBefore...");
                k kVar = this.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Render Draw Before: ");
                sbLIZ.append(d);
                kVar.LJJII(1004, 0, 0.0f, C2188811AlT.LIZIZ(sbLIZ));
            }

            @Override // X.InterfaceC2185721AgU
            public final void LIZIZ(double d, int i) {
                C2484209oO.LJII("TERecorder", "onOpenGLDrawAfter...");
                if (VEConfigCenter.getInstance().getValue("ve_titan_camera_cpu_opt", false).booleanValue()) {
                    this.LIZ.LJJII(1005, 0, (float) d, "Render Draw After");
                    return;
                }
                k kVar = this.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Render Draw After，timeStamp: ");
                sbLIZ.append(d);
                kVar.LJJII(1005, 0, 0.0f, C2188811AlT.LIZIZ(sbLIZ));
            }
        };
        this.LLIIL = -1;
        this.LJJJJ = new C2254401DLq();
        TERecorderInterface tERecorderInterface = new TERecorderInterface();
        this.LJJJ = tERecorderInterface;
        a aVar = new a(tERecorderInterface.LIZIZ);
        this.LJJIZ = aVar;
        aVar.LLIZ = map;
        TEMessageClient tEMessageClient = new TEMessageClient();
        this.LLIIIJ = new C20188413z0();
        TECallbackClient tECallbackClient = new TECallbackClient();
        this.LJJJJLI = tECallbackClient;
        tECallbackClient.setOpenGLListeners(interfaceC2185721AgU);
        tECallbackClient.setCommonCallback(new C2254301DLg(this));
        tECallbackClient.setAmbientLoudnessCallback(new NativeCallbacks.IAmbientLoudnessCallback() { // from class: X.1A4q
            @Override // com.ss.android.ttve.nativePort.NativeCallbacks.IAmbientLoudnessCallback
            public final void onResults(double[] dArr) {
                synchronized (this.LIZ.LLIIIZ) {
                    try {
                        this.LIZ.LLIIIL = dArr;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("ambientLoudness: ");
                        sbLIZ.append(Arrays.toString(this.LIZ.LLIIIL));
                        C2484209oO.LJI("TERecorder", C2188811AlT.LIZIZ(sbLIZ));
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
        });
        if (VEConfigCenter.getInstance().getValue("ve_enable_getframe_optimization", false).booleanValue()) {
            tECallbackClient.setGetFrameListener(iGetFrameCallback);
        }
        tEMessageClient.setErrorListener(new InterfaceC2185751AgX() { // from class: X.1A4r
            @Override // X.InterfaceC2185751AgX
            public final void onCallback(int i, int i2, float f, String str) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Error:: type: 0x");
                sbLIZ.append(Integer.toHexString(i));
                sbLIZ.append("; msg: ");
                sbLIZ.append(str);
                C2484209oO.LIZJ("TERecorder", C2188811AlT.LIZIZ(sbLIZ));
                this.LIZ.getClass();
            }
        });
        tEMessageClient.setInfoListener(new InterfaceC2185751AgX() { // from class: X.1DLf
            @Override // X.InterfaceC2185751AgX
            public final void onCallback(int i, int i2, float f, String str) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Info:: type: 0x");
                sbLIZ.append(Integer.toHexString(i));
                sbLIZ.append("; msg: ");
                sbLIZ.append(str);
                C2484209oO.LIZ("TERecorder", C2188811AlT.LIZIZ(sbLIZ));
                k kVar = this.LIZ;
                InterfaceC1464200oCo interfaceC1464200oCo = kVar.LJJJLL;
                if (interfaceC1464200oCo != null) {
                    if (i == VEInfo.TE_RECORD_INFO_RECORDING_TIMESTAMP) {
                        interfaceC1464200oCo.onCallback(VEInfo.TE_RECORD_INFO_RECORDING_CLIP_TIMESTAMP, i2, kVar.LJJJ.LJIIIIZZ("SegmentFrameTime"), str);
                    } else if (i == 1040) {
                        kVar.LJIILIIL = i2;
                    } else if (i == 1098) {
                        kVar.LJIILJJIL = i2;
                    } else if (i == 1041) {
                        kVar.LJIILL = i2;
                    } else if (i == 1043) {
                        kVar.LJIILLIIL = i2;
                    } else if (i == 1103) {
                        kVar.LJIIZILJ = i2;
                    } else if (i == 1105) {
                        kVar.LJIJJ = i2;
                    } else if (i == 1044) {
                        kVar.LJIJJLI = i2;
                    } else if (i == 1099) {
                        kVar.LJJ = i2;
                    } else if (i == 1106) {
                        kVar.LJIL = i2;
                    } else if (i == 1107) {
                        kVar.LJJI = i2;
                    } else if (i == 1045) {
                        kVar.LJJIFFI = i2;
                    } else if (i == 1046) {
                        kVar.LJJII = i2;
                    } else if (i == 1104) {
                        kVar.LJJIIJ = i2;
                    } else if (i == 1108) {
                        kVar.LJJIII = i2;
                    } else if (i == 1109) {
                        kVar.LJJIIJZLJL = i2;
                    } else if (i != 1095 && i != 1096 && i != 1097) {
                        if (i == 1091) {
                            kVar.LJIJ = 1000000.0f / i2;
                        } else if (i == 1092) {
                            kVar.LJIJI = 1000000.0f / i2;
                        }
                    }
                    this.LIZ.LJJJLL.onCallback(i, i2, f, str);
                }
            }
        });
        tERecorderInterface.LJJIIJZLJL(tEMessageClient, tECallbackClient);
        this.LJLJLLL = new InterfaceC1621790sIz() { // from class: X.0sIv
            @Override // X.InterfaceC1621790sIz
            public final void LIZ(EnumC1641600sow enumC1641600sow) {
                boolean z;
                a aVar2 = this.LIZ.LJJIZ;
                if (enumC1641600sow == EnumC1641600sow.DEFAULT) {
                    z = true;
                } else {
                    z = false;
                }
                aVar2.getClass();
                TEBundle tEBundleObtain = TEBundle.obtain();
                tEBundleObtain.setBool("DefaultAudioDevice", z);
                tEBundleObtain.setInt("effectInterfaceName", 47);
                aVar2.LL.callEffectInterface(tEBundleObtain);
            }
        };
        boolean z = !VEConfigCenter.getInstance().getValue("ve_enable_camera_thread_cleanup", false).booleanValue() || Math.random() <= ((double) VEConfigCenter.getInstance().getValue("ve_bytebench_camera_capabilities_report_sampling_rate", 1.0f));
        this.LLIIJI = z;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cameraThreadOptimization mShouldReportCameraCapabilitiesToBytebench: ");
        sbLIZ.append(z);
        C2183341Ace.LIZ("TERecorder", C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LJFF(VEVideoEncodeSettings vEVideoEncodeSettings) {
        synchronized (this.LJL) {
            try {
                C1DMH c1dmh = this.LJJZZIII;
                if (c1dmh != null && (c1dmh instanceof C2254371DLn)) {
                    VESize vESize = ((C2254371DLn) c1dmh).LJIIL;
                    if (vESize.isValid()) {
                        vEVideoEncodeSettings.setVideoRes(vESize.width, vESize.height);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("_checkForceOutputSize: width=");
                        sbLIZ.append(vESize.width);
                        sbLIZ.append(", height=");
                        sbLIZ.append(vESize.height);
                        C2484209oO.LJI("TERecorder", C2188811AlT.LIZIZ(sbLIZ));
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final int LJIIJ(VESize vESize) {
        this.LJJJJ.LJJIIJ = vESize;
        VEDisplaySettings.Builder builder = new VEDisplaySettings.Builder(this.LJLJL);
        builder.setRenderSize(vESize);
        builder.setTranslateY(this.LJLJL.getTranslateY());
        this.LJLJL = builder.build();
        this.LJJJ.LJJIII("RenderWidth", vESize.width);
        this.LJJJ.LJJIII("RenderHeight", vESize.height);
        return LJJIIZ(this.LJLJL);
    }

    public final int LJIILLIIL(final C2254411DLr c2254411DLr) {
        boolean z;
        if (c2254411DLr.LJIILIIL == EnumC578800Mn0.TEXTURE) {
            z = true;
        } else {
            z = false;
        }
        this.LJLJJI = z;
        this.LJLJJL = c2254411DLr.LJIILL;
        if (!VEConfigCenter.getInstance().getValue("ve_enable_getframe_optimization", false).booleanValue()) {
            this.LJLJI = false;
            final long jCurrentTimeMillis = System.currentTimeMillis();
            this.LJJJJLI.setGetFrameListener(new NativeCallbacks.IGetFrameCallback() { // from class: X.1AOG
                @Override // com.ss.android.ttve.nativePort.NativeCallbacks.IGetFrameCallback
                public final void onResult(int i, int i2) {
                    C1AO7 c1ao7 = c2254411DLr.LJII;
                    if (c1ao7 != null) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("getGetFrameCallback: consume: ");
                        sbLIZ.append(System.currentTimeMillis() - jCurrentTimeMillis);
                        C2484209oO.LJI("TERecorder", C2188811AlT.LIZIZ(sbLIZ));
                        c1ao7.onResult(i);
                    }
                }

                @Override // com.ss.android.ttve.nativePort.NativeCallbacks.IGetFrameCallback
                public final void onResult(VEFrame vEFrame, boolean z2, int i, int i2) {
                    String str;
                    C1AO8 c1ao8 = c2254411DLr.LIZ;
                    if (c1ao8 != C1AO8.FOLLOW_SHOT_FRAME_MODE) {
                        if (c1ao8 == C1AO8.NORMAL_GET_FRAME_MODE) {
                            str = "te_record_shot_screen_time";
                        } else {
                            str = "te_record_shot_hd_screen_time";
                        }
                        C1305700k5A.LIZIZ(System.currentTimeMillis() - jCurrentTimeMillis, str);
                    }
                    C1AO7 c1ao7 = c2254411DLr.LJII;
                    if (c1ao7 != null) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("getGetFrameCallback: consume: ");
                        sbLIZ.append(System.currentTimeMillis() - jCurrentTimeMillis);
                        C2484209oO.LJI("TERecorder", C2188811AlT.LIZIZ(sbLIZ));
                        c1ao7.LIZIZ(vEFrame, i);
                    }
                }

                @Override // com.ss.android.ttve.nativePort.NativeCallbacks.IGetFrameCallback
                public final void onResult(int[] iArr, int i, int i2, long j, boolean z2, int i3) {
                    String str;
                    C1AO8 c1ao8 = c2254411DLr.LIZ;
                    if (c1ao8 != C1AO8.FOLLOW_SHOT_FRAME_MODE) {
                        if (c1ao8 == C1AO8.NORMAL_GET_FRAME_MODE) {
                            str = "te_record_shot_screen_time";
                        } else {
                            str = "te_record_shot_hd_screen_time";
                        }
                        C1305700k5A.LIZIZ(System.currentTimeMillis() - jCurrentTimeMillis, str);
                    }
                    c2254411DLr.getClass();
                    C1AO7 c1ao7 = c2254411DLr.LJII;
                    if (c1ao7 != null) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("getGetFrameCallback: width: ");
                        sbLIZ.append(i);
                        sbLIZ.append(", height: ");
                        sbLIZ.append(i2);
                        sbLIZ.append(", consume: ");
                        sbLIZ.append(System.currentTimeMillis() - jCurrentTimeMillis);
                        C2484209oO.LJI("TERecorder", C2188811AlT.LIZIZ(sbLIZ));
                        c1ao7.LIZ(i, i2, iArr);
                        c1ao7.LIZIZ(VEFrame.createIntArrayFrame(iArr, i, i2, 0, j / 1000, EnumC2185621AgK.TEPixFmt_RGBA8), 0);
                    }
                }
            });
            return this.LJJJ.LJIIIZ(c2254411DLr);
        }
        if (c2254411DLr.LJII != null) {
            this.LLII.put(Integer.valueOf(this.LLIIII.get()), c2254411DLr.LJII);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("new getPreviewFrame, tag: ");
            sbLIZ.append(this.LLIIII.get());
            C2484209oO.LJI("TERecorder", C2188811AlT.LIZIZ(sbLIZ));
            return this.LJJJ.LJIIJ(c2254411DLr, this.LLIIII.getAndIncrement());
        }
        C2484209oO.LIZJ("TERecorder", "Get preview frame fail, callback is null!");
        return -1;
    }

    public final boolean LJJ(InterfaceC2185971Agt interfaceC2185971Agt) {
        if (!(interfaceC2185971Agt instanceof VECameraCapture) || interfaceC2185971Agt.LIZIZ().getCameraType() == VECameraSettings.CAMERA_TYPE.TYPE1 || this.LJJJJJL.getOutputMode() != VEPreviewSettings.CAMERA_OUTPUT_MODE.EXTERNAL_SURFACE || !VEConfigCenter.getInstance().getValue("ve_enable_multi_camera_surface", false).booleanValue()) {
            return false;
        }
        return true;
    }

    public final int LJJIIZ(VEDisplaySettings vEDisplaySettings) {
        if (VEConfigCenter.getInstance().getValue("ve_enable_record_canvas_size_opt", false).booleanValue()) {
            VESize canvasSize = vEDisplaySettings.getCanvasSize();
            VESize renderSize = vEDisplaySettings.getRenderSize();
            if (canvasSize != null && renderSize != null && canvasSize.isValid() && renderSize.isValid()) {
                VESize vESize = new VESize(canvasSize.width, canvasSize.height);
                VESize vESize2 = new VESize(renderSize.width, renderSize.height);
                int i = canvasSize.width * canvasSize.height;
                if (i > 2073600) {
                    double dSqrt = Math.sqrt(((double) 2073600) / ((double) i));
                    int iRound = (int) Math.round(((double) canvasSize.width) * dSqrt);
                    int iRound2 = (int) Math.round(((double) canvasSize.height) * dSqrt);
                    C2484209oO.LJI("TERecorder", C786410Ut5.j4("canvas size is bigger than 1080P, executing downscale, origin size: %d x %d, new size: %d x %d", new Object[]{Integer.valueOf(canvasSize.width), Integer.valueOf(canvasSize.height), Integer.valueOf(iRound), Integer.valueOf(iRound2)}));
                    vESize.width = iRound;
                    vESize.height = iRound2;
                }
                int i2 = vESize.width;
                int i3 = vESize2.width;
                if (i2 < i3 || vESize.height < vESize2.height) {
                    double dMin = Math.min(((double) i2) / ((double) i3), ((double) vESize.height) / ((double) vESize2.height));
                    vESize2.width = (int) (((double) vESize2.width) * dMin);
                    vESize2.height = (int) (((double) vESize2.height) * dMin);
                }
                VEDisplaySettings.Builder builder = new VEDisplaySettings.Builder(vEDisplaySettings);
                builder.setCanvasSize(vESize);
                builder.setRenderSize(vESize2);
                builder.build();
            }
        }
        if (VEDisplaySettings.VEDisPlayEffect.GAUSSIAN_BLUR == vEDisplaySettings.getDisplayEffect()) {
            VEBlurFilterParam vEBlurFilterParam = new VEBlurFilterParam();
            vEBlurFilterParam.intensity = vEDisplaySettings.getEffectIntensity();
            synchronized (this.LJJZ) {
                try {
                    int i4 = this.LJJLJ;
                    if (i4 < 0) {
                        this.LJJLJ = this.LJJIZ.addTrackFilter(0, 0, vEBlurFilterParam, -1, -1);
                    } else {
                        this.LJJIZ.updateTrackFilterParam(i4, vEBlurFilterParam);
                    }
                } finally {
                }
            }
        } else if (VEDisplaySettings.VEDisPlayEffect.NONE == vEDisplaySettings.getDisplayEffect()) {
            synchronized (this.LJJZ) {
                try {
                    int i5 = this.LJJLJ;
                    if (i5 >= 0) {
                        this.LJJIZ.removeTrackFilter(i5);
                        this.LJJLJ = -1;
                    }
                } finally {
                }
            }
        }
        if (vEDisplaySettings.getLayoutSize() != null && vEDisplaySettings.getCamOutSize() != null && vEDisplaySettings.getLayoutSize().isValid() && vEDisplaySettings.getCamOutSize().isValid()) {
            VEMIMOFilterParam vEMIMOFilterParam = new VEMIMOFilterParam();
            vEMIMOFilterParam.layoutWidth = vEDisplaySettings.getLayoutSize().width;
            vEMIMOFilterParam.layoutHeight = vEDisplaySettings.getLayoutSize().height;
            vEMIMOFilterParam.camOutWidth = vEDisplaySettings.getCamOutSize().width;
            vEMIMOFilterParam.camOutHeight = vEDisplaySettings.getCamOutSize().height;
            int i6 = this.LJJLL;
            if (i6 < 0) {
                this.LJJLL = this.LJJIZ.addTrackFilter(0, 0, vEMIMOFilterParam, -1, -1);
            } else {
                this.LJJIZ.updateTrackFilterParam(i6, vEMIMOFilterParam);
            }
        } else {
            int i7 = this.LJJLL;
            if (i7 > -1) {
                this.LJJIZ.removeTrackFilter(i7);
                this.LJJLL = -1;
            }
        }
        VEDisplaySettings.Builder builder2 = new VEDisplaySettings.Builder(vEDisplaySettings);
        if (vEDisplaySettings.getRenderSize() == null) {
            builder2.setRenderSize(this.LJLJL.getRenderSize());
        }
        this.LJJIZ.LLJI = vEDisplaySettings.getEffectRotation();
        VEDisplaySettings vEDisplaySettingsBuild = builder2.build();
        this.LJLJL = vEDisplaySettingsBuild;
        this.LJJJ.LJIL("DisplaySettings", C2254321DLi.LIZJ(vEDisplaySettingsBuild, this.LJJJJJL));
        this.LJLJL = vEDisplaySettings;
        return this.LJJJ.LJJ();
    }

    public final void LJJIJ(Surface surface) {
        if (this.LJJIJIIJIL) {
            ((ReentrantLock) this.LJLLL).lock();
            this.LJZ = surface;
            this.LJLLLL.signalAll();
            ((ReentrantLock) this.LJLLL).unlock();
            return;
        }
        this.LJZ = surface;
    }

    public final void LJJIJIIJIL(VEVolumeParam vEVolumeParam) {
        if (vEVolumeParam.trackIndex >= 0) {
            TEBundle tEBundleObtain = TEBundle.obtain();
            tEBundleObtain.setFloat("Volume", vEVolumeParam.bgmPlayVolume);
            tEBundleObtain.setInt("TrackIndex", vEVolumeParam.trackIndex);
            this.LJJJ.LJIL("setVolume", tEBundleObtain);
            return;
        }
        this.LJJJ.LJJII("setVolume", vEVolumeParam.bgmPlayVolume);
    }

    public final int LJJIZ(VEPrePlayParams vEPrePlayParams) {
        C1DMH c1dmh = this.LJJZZIII;
        if (c1dmh != null && (c1dmh instanceof C2254331DLj) && VEConfigCenter.getInstance().getValue("ve_enable_titan_video_decode_opt", false).booleanValue()) {
            int[] iArr = new int[12];
            if (TEVideoUtils.nativeGetFileInfo(((C2254331DLj) this.LJJZZIII).LIZJ, iArr) != null) {
                vEPrePlayParams.duration = iArr[3];
            }
        }
        this.LLFF = false;
        this.LJJJ.LJIL("PrePlayParams", C2254321DLi.LJIIIIZZ(vEPrePlayParams));
        return this.LJJJ.LJJIJIIJI();
    }

    public final int LJJJJ(boolean z) {
        TECamera tECamera = this.LJJJI;
        int i = 0;
        if (tECamera != null) {
            tECamera.setEnableCameraNotify(false);
        }
        TECamera tECamera2 = this.LJJJIL;
        if (tECamera2 != null) {
            tECamera2.setEnableCameraNotify(false);
        }
        boolean z2 = true;
        if (3 == LJIIZILJ() && this.LJJJJJL.checkStatusWhenStopPreview()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("stopRecord on stopPreview isAsync=");
            sbLIZ.append(z);
            C2484209oO.LJIIIIZZ("TERecorder", C2188811AlT.LIZIZ(sbLIZ));
            int iLJJJJI = LJJJJI();
            if (iLJJJJI != 0) {
                LJJIFFI(1022, iLJJJJI, "stopRecord in stopPreview!!");
                this.LJLILLLLZI = false;
            } else {
                this.LJLILLLLZI = true;
            }
        }
        VEAudioCapture vEAudioCapture = this.LIZ;
        if (vEAudioCapture != null) {
            vEAudioCapture.release(null);
            this.LJJJJ.getClass();
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        VEPreviewSettings vEPreviewSettings = this.LJJJJJL;
        if (vEPreviewSettings == null || !vEPreviewSettings.isBlockRenderExit()) {
            z2 = false;
        }
        if (z) {
            if (z2) {
                i = 2000;
            }
        } else {
            i = -1;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("stopPreview start: isBlock=");
        sbLIZ2.append(z2);
        sbLIZ2.append(", isAsync=");
        sbLIZ2.append(z);
        sbLIZ2.append(", blockTimeOutInMS=");
        sbLIZ2.append(i);
        C2484209oO.LJI("TERecorder", C2188811AlT.LIZIZ(sbLIZ2));
        int iLJJIL = this.LJJJ.LJJIL(i);
        synchronized (this.LJL) {
            try {
                C1DMH c1dmh = this.LJJZZIII;
                if (c1dmh != null && (c1dmh instanceof C2254331DLj)) {
                    c1dmh.onDestroy();
                    this.LJJZZIII = null;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("stopPreview done. cost ");
        sbLIZ3.append(System.currentTimeMillis() - jCurrentTimeMillis);
        C2484209oO.LJI("TERecorder", C2188811AlT.LIZIZ(sbLIZ3));
        return iLJJIL;
    }

    public static VESize LJIIIZ(VESize vESize, VESize vESize2) {
        VESize vESize3 = new VESize(0, 0);
        if (vESize2 != null && vESize.isValid() && vESize2.isValid()) {
            float f = vESize2.width * 1.0f;
            float f2 = f / vESize2.height;
            int i = vESize.width;
            int i2 = vESize.height;
            float f3 = i2;
            if (f2 > (i * 1.0f) / f3) {
                vESize3.width = i;
                vESize3.height = (int) (((i * r6) * 1.0f) / vESize2.width);
            } else {
                vESize3.height = i2;
                vESize3.width = (int) ((f / vESize2.height) * f3);
                return vESize3;
            }
        }
        return vESize3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC2254271DLd
    public final void LIZIZ(boolean z, C448700Hie c448700Hie) {
        TEBundle tEBundleObtain = TEBundle.obtain();
        tEBundleObtain.setBool("EnableBachScan", z);
        tEBundleObtain.setString("algorithmConfig", c448700Hie.algorithmConfig);
        tEBundleObtain.setInt("AlgorithmType", c448700Hie.getAlgorithmType());
        if (c448700Hie.getAlgorithmType() == 12) {
            C1DMO c1dmo = (C1DMO) c448700Hie;
            tEBundleObtain.setInt("ScanType", c1dmo.LIZ);
            tEBundleObtain.setInt("ObjectDetectIntervalTimeMs", c1dmo.LIZIZ);
            tEBundleObtain.setInt("MaxTrackNum", c1dmo.LIZJ);
            tEBundleObtain.setInt("MaxObjectNum", c1dmo.LIZLLL);
        } else if (c448700Hie.getAlgorithmType() == 11) {
            tEBundleObtain.setInt("FrameNum", c448700Hie.LIZLLL);
            tEBundleObtain.setLong("CodeType", c448700Hie.LIZIZ);
            tEBundleObtain.setInt("scanBehavior", c448700Hie.LJFF.ordinal());
        } else if (c448700Hie.getAlgorithmType() == 13) {
            C2254461DLw c2254461DLw = (C2254461DLw) c448700Hie;
            tEBundleObtain.setInt("detectFrameRate", c2254461DLw.LIZ);
            tEBundleObtain.setFloat("threshold", c2254461DLw.LIZIZ);
            tEBundleObtain.setInt("notQRCodeTimeOut", c2254461DLw.LIZJ);
            tEBundleObtain.setFloat("needZoomFactorToFrameHeight", c2254461DLw.LIZLLL);
            tEBundleObtain.setFloat("maxFactorToFrameHeight", c2254461DLw.LJ);
            tEBundleObtain.setBool("enableZoomBehavior", c2254461DLw.LJFF);
            tEBundleObtain.setFloat("top", c2254461DLw.LJI);
            tEBundleObtain.setFloat("bottom", c2254461DLw.LJII);
            tEBundleObtain.setFloat("left", c2254461DLw.LJIIIIZZ);
            tEBundleObtain.setFloat("right", c2254461DLw.LJIIIZ);
            tEBundleObtain.setFloat("percent", c2254461DLw.LJIIJ);
            tEBundleObtain.setFloat("maxZoomFactor", c2254461DLw.LJIIJJI);
        } else if (c448700Hie.getAlgorithmType() == 16) {
            C1DMW c1dmw = (C1DMW) c448700Hie;
            tEBundleObtain.setBool("Enable", z);
            tEBundleObtain.setLong("CodeType", c1dmw.LIZIZ);
            tEBundleObtain.setInt("detectFrameRate", c1dmw.LIZ);
        }
        this.LJJJ.LJIL("BachScan", tEBundleObtain);
    }

    @Override // X.AbstractC2254271DLd
    public final void LJ(VEBaseRecorderLensParams vEBaseRecorderLensParams, InterfaceC2219671Bu9 interfaceC2219671Bu9) {
        boolean z;
        boolean z2;
        synchronized (this.LJI) {
            try {
                this.LJFF.put(Integer.valueOf(vEBaseRecorderLensParams.algorithmFlag), interfaceC2219671Bu9);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        this.LJJJJLI.setLensCallback(new NativeCallbacks.ILensCallback() { // from class: X.1Bu8
            @Override // com.ss.android.ttve.nativePort.NativeCallbacks.ILensCallback
            public final void onError(int i, int i2, String str) {
                InterfaceC2219671Bu9 interfaceC2219671Bu92 = (InterfaceC2219671Bu9) this.LIZ.LJFF.get(Integer.valueOf(i));
                if (interfaceC2219671Bu92 != null) {
                    interfaceC2219671Bu92.LIZJ();
                }
            }

            @Override // com.ss.android.ttve.nativePort.NativeCallbacks.ILensCallback
            public final void onSuccess(int i, float f, int i2) {
                InterfaceC2219671Bu9 interfaceC2219671Bu92 = (InterfaceC2219671Bu9) this.LIZ.LJFF.get(Integer.valueOf(i));
                int i3 = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("luma detect scene is ");
                sbLIZ.append(f);
                C2183341Ace.LIZ("TAG", C2188811AlT.LIZIZ(sbLIZ));
                if (interfaceC2219671Bu92 != null) {
                    interfaceC2219671Bu92.onSuccess(i, f, i2);
                }
            }

            @Override // com.ss.android.ttve.nativePort.NativeCallbacks.ILensCallback
            public final void onInfo(int i, int i2, int i3, String str) {
                InterfaceC2219671Bu9 interfaceC2219671Bu92 = (InterfaceC2219671Bu9) this.LIZ.LJFF.get(Integer.valueOf(i));
                if (interfaceC2219671Bu92 != null) {
                    interfaceC2219671Bu92.LIZ(str);
                }
            }
        });
        int i = vEBaseRecorderLensParams.algorithmFlag;
        if (i != 15) {
            if (i != 21) {
                if (i != 24) {
                    if (i != 33) {
                        if (i != 34) {
                            switch (i) {
                                case 27:
                                    break;
                                case 28:
                                    VEOneKeyProcessParams vEOneKeyProcessParams = (VEOneKeyProcessParams) vEBaseRecorderLensParams;
                                    TEBundle tEBundleObtain = TEBundle.obtain();
                                    tEBundleObtain.setInt("Iso", vEOneKeyProcessParams.iso);
                                    tEBundleObtain.setInt("MinIso", vEOneKeyProcessParams.minIso);
                                    tEBundleObtain.setInt("MaxIso", vEOneKeyProcessParams.maxIso);
                                    tEBundleObtain.setBool("IsFirstFrame", vEOneKeyProcessParams.isFirstFrame);
                                    tEBundleObtain.setInt("FaceNum", vEOneKeyProcessParams.faceNum);
                                    tEBundleObtain.setInt("Flag", vEOneKeyProcessParams.algorithmFlag);
                                    if (vEOneKeyProcessParams.faceNum != 0) {
                                        for (int i2 = 0; i2 < vEOneKeyProcessParams.faceNum; i2++) {
                                            Rect rect = vEOneKeyProcessParams.faceRects[i2];
                                            int[] iArr = {rect.bottom, rect.left, rect.right, rect.top};
                                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                                            sbLIZ.append("FaceRect_");
                                            sbLIZ.append(i2);
                                            tEBundleObtain.setIntArray(C2188811AlT.LIZIZ(sbLIZ), iArr);
                                        }
                                    }
                                    this.LJJJ.LJIL("oneKeyProcess", tEBundleObtain);
                                    return;
                                case 29:
                                    VERhythmicMotionParam vERhythmicMotionParam = (VERhythmicMotionParam) vEBaseRecorderLensParams;
                                    TEBundle tEBundleObtain2 = TEBundle.obtain();
                                    tEBundleObtain2.setFloatArray("CropList", vERhythmicMotionParam.cropList);
                                    tEBundleObtain2.setFloat("MaxAlpha", vERhythmicMotionParam.maxAlpha);
                                    tEBundleObtain2.setFloat("MaxVelocity", vERhythmicMotionParam.maxVelocity);
                                    tEBundleObtain2.setInt("Flag", vERhythmicMotionParam.algorithmFlag);
                                    this.LJJJ.LJIL("RhythmicMotion", tEBundleObtain2);
                                    return;
                                default:
                                    return;
                            }
                        } else {
                            C1DMC c1dmc = (C1DMC) vEBaseRecorderLensParams;
                            TEBundle tEBundleObtain3 = TEBundle.obtain();
                            tEBundleObtain3.setInt("BufferSize", c1dmc.LIZ);
                            tEBundleObtain3.setFloat("Threshold", c1dmc.LIZIZ);
                            tEBundleObtain3.setInt("StableFrameCount", c1dmc.LIZJ);
                            tEBundleObtain3.setFloat("LowStableThreshold", c1dmc.LIZLLL);
                            tEBundleObtain3.setFloat("HighStableThreshold", c1dmc.LJ);
                            tEBundleObtain3.setBool("Enable", c1dmc.enable);
                            tEBundleObtain3.setInt("Flag", c1dmc.algorithmFlag);
                            tEBundleObtain3.setFloatArray("DeltaRotationMatrix", null);
                            if (c1dmc.resultCallback != null) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            tEBundleObtain3.setBool("EnableResult", z2);
                            this.LJJJ.LJIL("ShakingDetect", tEBundleObtain3);
                            return;
                        }
                    } else {
                        C1DMB c1dmb = (C1DMB) vEBaseRecorderLensParams;
                        TEBundle tEBundleObtain4 = TEBundle.obtain();
                        tEBundleObtain4.setString("ModelPath", null);
                        tEBundleObtain4.setString("KernelBinPath", null);
                        tEBundleObtain4.setInt("NumThread", c1dmb.LIZIZ);
                        tEBundleObtain4.setInt("BackendType", c1dmb.LIZ);
                        tEBundleObtain4.setInt("RunType", 4);
                        tEBundleObtain4.setFloat("Threshold", c1dmb.LJ);
                        tEBundleObtain4.setBool("Enable", c1dmb.enable);
                        tEBundleObtain4.setInt("Flag", c1dmb.algorithmFlag);
                        tEBundleObtain4.setFloat("Alpha", c1dmb.LIZJ);
                        tEBundleObtain4.setFloat("Beta", c1dmb.LIZLLL);
                        if (c1dmb.resultCallback != null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        tEBundleObtain4.setBool("EnableResult", z);
                        this.LJJJ.LJIL("DefinitionDetect", tEBundleObtain4);
                        return;
                    }
                } else {
                    VEAdaptiveSharpenParams vEAdaptiveSharpenParams = (VEAdaptiveSharpenParams) vEBaseRecorderLensParams;
                    TEBundle tEBundleObtain5 = TEBundle.obtain();
                    tEBundleObtain5.setInt("SceneMode", vEAdaptiveSharpenParams.sceneMode);
                    tEBundleObtain5.setFloat("Amount", vEAdaptiveSharpenParams.amount);
                    tEBundleObtain5.setFloat("OverRatio", vEAdaptiveSharpenParams.overRatio);
                    tEBundleObtain5.setFloat("EdgeWeightGamma", vEAdaptiveSharpenParams.edgeWeightGamma);
                    tEBundleObtain5.setInt("DiffImgSmoothEnable", vEAdaptiveSharpenParams.diffImgSmoothEnable);
                    tEBundleObtain5.setInt("PowerLevelPara", vEAdaptiveSharpenParams.powerLevelPara);
                    tEBundleObtain5.setInt("InitDelayFrameCnt", vEAdaptiveSharpenParams.initDelayFrameCnt);
                    tEBundleObtain5.setInt("ProcessDelayFrameCnt", vEAdaptiveSharpenParams.processDelayFrameCnt);
                    this.LJJJ.LJIL("asf", tEBundleObtain5);
                    return;
                }
            } else {
                VETaintSceneDetectParams vETaintSceneDetectParams = (VETaintSceneDetectParams) vEBaseRecorderLensParams;
                TEBundle tEBundleObtain6 = TEBundle.obtain();
                tEBundleObtain6.setInt("DetectFrequency", vETaintSceneDetectParams.detectFrequency);
                tEBundleObtain6.setString("ModelPath", vETaintSceneDetectParams.modelPath);
                tEBundleObtain6.setString("KernelBinPath", vETaintSceneDetectParams.kernelBinPath);
                tEBundleObtain6.setInt("BackendType", vETaintSceneDetectParams.backendType);
                tEBundleObtain6.setInt("NumThread", vETaintSceneDetectParams.numThread);
                tEBundleObtain6.setInt("DetectRepeatNum", vETaintSceneDetectParams.detectRepeatNum);
                this.LJJJ.LJIL("taintSceneDetect", tEBundleObtain6);
                TEBundle tEBundleObtain7 = TEBundle.obtain();
                tEBundleObtain7.setInt("LensFlag", 21);
                tEBundleObtain7.setBool("EnableLensProcess", true);
                this.LJJJ.LJIL("EnableLens", tEBundleObtain7);
                return;
            }
        }
        VELumaDetectParams vELumaDetectParams = (VELumaDetectParams) vEBaseRecorderLensParams;
        TEBundle tEBundleObtain8 = TEBundle.obtain();
        tEBundleObtain8.setInt("Iso", vELumaDetectParams.iso);
        tEBundleObtain8.setInt("MinIso", vELumaDetectParams.minIso);
        tEBundleObtain8.setInt("MaxIso", vELumaDetectParams.maxIso);
        tEBundleObtain8.setInt("ExposureTime", vELumaDetectParams.exposureTime);
        tEBundleObtain8.setInt("MinExposureTime", vELumaDetectParams.minExposureTime);
        tEBundleObtain8.setInt("MaxExposureTime", vELumaDetectParams.maxExposureTime);
        tEBundleObtain8.setFloat("EcStep", vELumaDetectParams.ecStep);
        tEBundleObtain8.setInt("Flag", vELumaDetectParams.algorithmFlag);
        tEBundleObtain8.setInt("DetectFrames", vELumaDetectParams.detectFrames);
        tEBundleObtain8.setInt("FaceNum", vELumaDetectParams.faceNum);
        tEBundleObtain8.setInt("Flag", vELumaDetectParams.algorithmFlag);
        if (vELumaDetectParams.faceNum != 0) {
            for (int i3 = 0; i3 < vELumaDetectParams.faceNum; i3++) {
                Rect rect2 = vELumaDetectParams.faceRects[i3];
                int[] iArr2 = {rect2.bottom, rect2.left, rect2.right, rect2.top};
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("FaceRect_");
                sbLIZ2.append(i3);
                tEBundleObtain8.setIntArray(C2188811AlT.LIZIZ(sbLIZ2), iArr2);
            }
        }
        this.LJJJ.LJIL("lumaDetect", tEBundleObtain8);
    }

    public final void LJI(InterfaceC2185971Agt interfaceC2185971Agt, boolean z) {
        if (VEConfigCenter.getInstance().getValue("ve_enable_multi_capture_pipeline", false).booleanValue()) {
            VEPreviewSettings.CAMERA_OUTPUT_MODE outputMode = this.LJJJJJL.getOutputMode();
            if (interfaceC2185971Agt != null && interfaceC2185971Agt.LIZIZ() != null) {
                VECameraSettings vECameraSettingsLIZIZ = interfaceC2185971Agt.LIZIZ();
                EnumC2186221AhI enumC2186221AhI = EnumC2186221AhI.PROVIDER_TYPE_SURFACE_TEXTURE;
                C2186031Agz c2186031Agz = new C2186031Agz(enumC2186221AhI, interfaceC2185971Agt.N2(), false, false);
                int i = C2186061Ah2.LIZ[outputMode.ordinal()];
                if (i != 1 && i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                TECamera tECamera = this.LJJJI;
                                if (tECamera != null) {
                                    tECamera.setConfig(c2186031Agz);
                                }
                                C2186031Agz c2186031Agz2 = new C2186031Agz(EnumC2186221AhI.PROVIDER_TYPE_RECORDER, interfaceC2185971Agt.N2(), false, false);
                                if (this.LJJJIL != null && vECameraSettingsLIZIZ.getCameraType() == VECameraSettings.CAMERA_TYPE.TYPE2) {
                                    this.LJJJIL.setConfig(c2186031Agz2);
                                }
                            }
                        } else {
                            TECamera tECamera2 = this.LJJJI;
                            if (tECamera2 != null) {
                                tECamera2.setConfig(c2186031Agz);
                            }
                            C2186031Agz c2186031Agz3 = new C2186031Agz(EnumC2186221AhI.PROVIDER_TYPE_IMAGE_READER, interfaceC2185971Agt.N2(), false, false);
                            if (this.LJJJIL != null && vECameraSettingsLIZIZ.getCameraType() == VECameraSettings.CAMERA_TYPE.TYPE2) {
                                this.LJJJIL.setConfig(c2186031Agz3);
                            }
                        }
                    } else {
                        C2186031Agz c2186031Agz4 = new C2186031Agz(EnumC2186221AhI.PROVIDER_TYPE_IMAGE_READER, interfaceC2185971Agt.N2(), false, false);
                        TECamera tECamera3 = this.LJJJI;
                        if (tECamera3 != null) {
                            tECamera3.setConfig(c2186031Agz4);
                        }
                    }
                } else {
                    TECamera tECamera4 = this.LJJJI;
                    if (tECamera4 != null) {
                        tECamera4.setConfig(c2186031Agz);
                    }
                    C2186031Agz c2186031Agz5 = new C2186031Agz(enumC2186221AhI, interfaceC2185971Agt.LJIIJ(), true, true);
                    if (this.LJJJIL != null && vECameraSettingsLIZIZ.getCameraType() == VECameraSettings.CAMERA_TYPE.TYPE2) {
                        this.LJJJIL.setConfig(c2186031Agz5);
                    }
                }
                this.LLFII.setConfig(c2186031Agz);
            }
        }
        if (interfaceC2185971Agt.LIZIZ() != null) {
            this.LJJIL = interfaceC2185971Agt.LIZIZ().getCameraFacing();
        } else {
            VECameraSettings vECameraSettings = this.LJII;
            if (vECameraSettings != null) {
                this.LJJIL = vECameraSettings.getCameraFacing();
            }
        }
        C1DIT c1dit = this.LJJIJL;
        if (c1dit != C1DIT.DEFAULT_PRIMARY && c1dit != C1DIT.FRONT_PRIMARY_MULTI_RENDER && c1dit != C1DIT.BACK_PRIMARY_MULTI_RENDER) {
            if (this.LJJJI != null) {
                if (this.LJJJIL != null && (interfaceC2185971Agt instanceof VECameraCapture)) {
                    this.LLI.LIZIZ();
                    if (LJJ(interfaceC2185971Agt)) {
                        Iterator<C2185991Agv> it2 = this.LJJJJJL.getExternalCapturePipelines().iterator();
                        while (it2.hasNext()) {
                            this.LLI.LIZ(it2.next());
                        }
                    }
                    List<C2185991Agv> listLIZJ = this.LJJJI.createCapturePipeline(interfaceC2185971Agt, z, this.LJJJJJL.getOutputMode()).LIZJ();
                    List<C2185991Agv> listLIZJ2 = this.LJJJIL.createCapturePipeline(interfaceC2185971Agt, z, this.LJJJJJL.getOutputMode()).LIZJ();
                    Iterator<C2185991Agv> it3 = listLIZJ.iterator();
                    while (it3.hasNext()) {
                        this.LLI.LIZ(it3.next());
                    }
                    Iterator<C2185991Agv> it4 = listLIZJ2.iterator();
                    while (it4.hasNext()) {
                        this.LLI.LIZ(it4.next());
                    }
                    interfaceC2185971Agt.LJIILIIL(this.LLI);
                    C2484209oO.LJI("TERecorder", "_startCameraPreview, multi camera surface");
                    return;
                }
                C1311120kDu.LIZ("[FF]Java-TECamera-startCameraPreview-createCapturePipeline");
                C1664350tPd<C2185991Agv> c1664350tPdCreateCapturePipeline = this.LJJJI.createCapturePipeline(interfaceC2185971Agt, z, this.LJJJJJL.getOutputMode());
                C1311120kDu.LIZIZ();
                if (LJJ(interfaceC2185971Agt)) {
                    Iterator<C2185991Agv> it5 = this.LJJJJJL.getExternalCapturePipelines().iterator();
                    while (it5.hasNext()) {
                        c1664350tPdCreateCapturePipeline.LIZ(it5.next());
                    }
                }
                interfaceC2185971Agt.LJIILIIL(c1664350tPdCreateCapturePipeline);
                return;
            }
            return;
        }
        VECameraSettings.CAMERA_FACING_ID camera_facing_id = this.LJJIL;
        if (camera_facing_id != VECameraSettings.CAMERA_FACING_ID.FACING_REAR_MAIN_FRONT_MAIN) {
            this.LJJJ.LJJIII("DefaultFacing", camera_facing_id.ordinal());
        }
        this.LLFZ.LIZIZ();
        List<C2185991Agv> listLIZJ3 = this.LJJJI.createCapturePipeline(interfaceC2185971Agt, z, this.LJJJJJL.getOutputMode()).LIZJ();
        List<C2185991Agv> listLIZJ4 = this.LLFII.createCapturePipeline(interfaceC2185971Agt, z, this.LJJJJJL.getOutputMode()).LIZJ();
        Iterator<C2185991Agv> it6 = listLIZJ3.iterator();
        while (it6.hasNext()) {
            this.LLFZ.LIZ(it6.next());
        }
        for (C2185991Agv c2185991Agv : listLIZJ4) {
            c2185991Agv.LJIIIIZZ = false;
            this.LLFZ.LIZ(c2185991Agv);
        }
        interfaceC2185971Agt.LJIILIIL(this.LLFZ);
        C2484209oO.LJI("TERecorder", "_startCameraPreview, dual-camera");
    }

    public final void LJIIJJI(int i, int i2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("changeOutputVideoSize: width=");
        sbLIZ.append(i);
        sbLIZ.append(", height=");
        sbLIZ.append(i2);
        C2484209oO.LJI("TERecorder", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LJJIJIIJIL && (this.LJZI == C1DIV.RADIO_9_16.ordinal() || this.LJZI == C1DIV.RADIO_FULL.ordinal())) {
            new VESize(i, i2);
            VESize vESizeLJIIIZ = LJIIIZ(new VESize(i, i2), this.LJZL);
            if (vESizeLJIIIZ.isValid()) {
                int i3 = vESizeLJIIIZ.width;
                int i4 = vESizeLJIIIZ.height;
                int i5 = i3 - (i3 & 15);
                int i6 = i4 - (15 & i4);
                C1780100wQK c1780100wQK = new C1780100wQK(this.LJIIIIZZ);
                c1780100wQK.LJIIJ(i5, i6);
                VEVideoEncodeSettings vEVideoEncodeSettingsLIZ = c1780100wQK.LIZ();
                this.LJIIIIZZ = vEVideoEncodeSettingsLIZ;
                LJFF(vEVideoEncodeSettingsLIZ);
                TERecorderInterface tERecorderInterface = this.LJJJ;
                VEVideoEncodeSettings vEVideoEncodeSettings = this.LJIIIIZZ;
                tERecorderInterface.getClass();
                tERecorderInterface.LJIL("VideoEncode", C2254321DLi.LJFF(vEVideoEncodeSettings));
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("changeVideoOutputSizeViaInner: width=");
                sbLIZ2.append(i5);
                sbLIZ2.append(", height=");
                sbLIZ2.append(i6);
                C2484209oO.LJI("TERecorder", C2188811AlT.LIZIZ(sbLIZ2));
                return;
            }
        }
        C1780100wQK c1780100wQK2 = new C1780100wQK(this.LJIIIIZZ);
        c1780100wQK2.LJIIJ(i, i2);
        VEVideoEncodeSettings vEVideoEncodeSettingsLIZ2 = c1780100wQK2.LIZ();
        this.LJIIIIZZ = vEVideoEncodeSettingsLIZ2;
        LJFF(vEVideoEncodeSettingsLIZ2);
        TERecorderInterface tERecorderInterface2 = this.LJJJ;
        VEVideoEncodeSettings vEVideoEncodeSettings2 = this.LJIIIIZZ;
        tERecorderInterface2.getClass();
        tERecorderInterface2.LJIL("VideoEncode", C2254321DLi.LJFF(vEVideoEncodeSettings2));
    }

    public final void LJIIL(boolean z, boolean z2) {
        if (z && !z2) {
            if (this.LJLJLJ == -1) {
                C2254451DLv c2254451DLv = new C2254451DLv();
                c2254451DLv.LIZ("empty_path");
                c2254451DLv.LJ(0);
                c2254451DLv.LJFF(Integer.MAX_VALUE);
                c2254451DLv.LIZLLL();
                int iLJII = LJII(1, c2254451DLv.LIZ, false);
                this.LJLJLJ = iLJII;
                LJIIIIZZ(iLJII, 1, 1, 0);
                int i = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("add empty track, track index:");
                sbLIZ.append(this.LJLJLJ);
                C2183341Ace.LIZLLL("TERecorder", C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
            return;
        }
        int i2 = this.LJLJLJ;
        if (i2 != -1) {
            LJJIIJ(1, i2, false);
            int i3 = C2187451AjH.LIZ;
            C2183341Ace.LIZLLL("TERecorder", "remove empty track");
            this.LJLJLJ = -1;
        }
    }

    public final int LJJIII(int i, int i2) {
        return this.LJJJ.LJJIIZI(i, i2, 1, -1, -1L, false);
    }

    public final void LJJIL(C1DIC c1dic, boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CAMERA_COST TERecorder startCameraPreview, isGLReady = ");
        sbLIZ.append(z);
        C2484209oO.LJI("TERecorder", C2188811AlT.LIZIZ(sbLIZ));
        this.LJJJJJ = c1dic;
        if (!z) {
            LJI(c1dic, true);
        } else {
            this.LJJJ.LJIIZILJ();
        }
    }

    public final int LJJJI(InterfaceC2183551Acz interfaceC2183551Acz, C1DMU c1dmu) {
        this.LLFF = true;
        if (LJJI()) {
            VEPrePlayParams vEPrePlayParams = new VEPrePlayParams();
            vEPrePlayParams.stopStrategy = 1;
            this.LJJJ.LJIL("PrePlayParams", C2254321DLi.LJIIIIZZ(vEPrePlayParams));
        }
        TEBundle tEBundleObtain = TEBundle.obtain();
        tEBundleObtain.setBool("Sync", c1dmu.LIZ);
        tEBundleObtain.setBool("RebuildTimeline", false);
        this.LJJJ.LJIL("PrePlayStopParams", tEBundleObtain);
        this.LJJL = interfaceC2183551Acz;
        if (this.LJJJJ.LJIILLIIL) {
            LJIIL(true, false);
        }
        return this.LJJJ.LJJIJLIJ();
    }

    public final int LJII(int i, VETrackParams vETrackParams, boolean z) {
        TEBundle tEBundleLIZ = C2254321DLi.LIZ(vETrackParams);
        tEBundleLIZ.setInt("TrackType", i);
        tEBundleLIZ.setBool("UpdateTimeline", z);
        return this.LJJJ.LJIL("AddTrack", tEBundleLIZ);
    }

    public final void LJJIFFI(int i, int i2, String str) {
        ArrayList<InterfaceC2254511DMb> arrayList;
        boolean z;
        synchronized (this.LIZLLL) {
            try {
                arrayList = new ArrayList(this.LIZJ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        for (InterfaceC2254511DMb interfaceC2254511DMb : arrayList) {
            if (VEInfo.TE_RECORD_INFO_ENGINE_START == i) {
                interfaceC2254511DMb.LJ(i2);
                interfaceC2254511DMb.onInfo(i, i2, str);
                interfaceC2254511DMb.onInfo(1002, i2, str);
            } else if (VEInfo.TE_RECORD_INFO_VIDEO_HW_ENCODER_INIT == i) {
                int i3 = 1;
                if (i2 == 0) {
                    z = true;
                } else {
                    z = false;
                }
                interfaceC2254511DMb.LJI(z);
                if (i2 != 0) {
                    i3 = -1;
                }
                interfaceC2254511DMb.onInfo(1003, i3, "Init HardEncode");
            } else {
                interfaceC2254511DMb.onInfo(i, i2, str);
            }
        }
    }

    public final int LJJIIJ(int i, int i2, boolean z) {
        TEBundle tEBundleObtain = TEBundle.obtain();
        tEBundleObtain.setInt("TrackIndex", i2);
        tEBundleObtain.setInt("TrackType", i);
        tEBundleObtain.setBool("UpdateTimeline", z);
        return this.LJJJ.LJIL("RemoveTrack", tEBundleObtain);
    }

    public final int LJJIIJZLJL(int i, int i2, long j) {
        return this.LJJJ.LJJIIZI(i, i2, 2, -1, j * 1000, false);
    }

    public final void LJJIJIIJI(float f, int i, int i2) {
        TEBundle tEBundleObtain = TEBundle.obtain();
        tEBundleObtain.setInt("TrackIndex", i);
        tEBundleObtain.setInt("TrackType", i2);
        tEBundleObtain.setFloat("TrackSpeed", f);
        this.LJJJ.LJIL("TrackSpeed", tEBundleObtain);
    }

    public final int LJJJ(boolean z, float f, String str) {
        long handle;
        VEAudioCaptureSettings vEAudioCaptureSettings;
        if (this.LJIIIIZZ == null) {
            C2484209oO.LIZJ("TERecorder", "startRecord aborted: mVideoEncodeSettings is null. Call VERecorder#setVideoEncodeSettings(...) after init() and before startRecord().");
        }
        if (this.LJIIIZ == null) {
            C2484209oO.LIZJ("TERecorder", "startRecord aborted: mAudioEncodeSettings is null. Call VERecorder#setAudioEncodeSettings(...) after init() and before startRecord().");
        }
        InterfaceC2185971Agt interfaceC2185971Agt = this.LJJJJJ;
        if (interfaceC2185971Agt != null) {
            interfaceC2185971Agt.LJIILLIIL(true);
        } else {
            C2484209oO.LJIIIIZZ("TERecorder", "CameraPreview is null.");
        }
        String str2 = this.LJJJJ.LIZ;
        C0VSJ c0vsj = new C0VSJ(str2.substring(0, str2.length() - 1));
        if (!c0vsj.exists()) {
            if (!c0vsj.mkdirs()) {
                return -114;
            }
            C2484209oO.LJI("TERecorder", "Record dir doesn't exists, create it successfully.");
        }
        if (z) {
            C2254401DLq c2254401DLq = this.LJJJJ;
            c2254401DLq.LIZIZ = str;
            c2254401DLq.LIZJ = str;
            if (!((LinkedList) c2254401DLq.LIZLLL).offer(str) || !((LinkedList) this.LJJJJ.LJ).offer(str)) {
                C2484209oO.LIZJ("TERecorder", "add video path or audio error.");
            }
            this.LJJJ.LJJIJ("VideoPath", str);
            this.LJJJ.LJJIJ("AudioPath", str);
        } else {
            str.isEmpty();
            this.LJJJ.LJJIJ("VideoPath", str);
            this.LJJJ.LJJIJ("AudioPath", "");
        }
        synchronized (this.LJL) {
            try {
                C1DMH c1dmh = this.LJJZZIII;
                if (c1dmh != null && (c1dmh instanceof C2254331DLj)) {
                    TEBundle.obtain();
                    this.LJJJ.LJIJJLI("VideoBGProxyAudioLoop", true);
                    ((C2254331DLj) this.LJJZZIII).LJIILIIL(this.LJJLIIIJLJLI, this.LJIIL);
                }
            } finally {
            }
        }
        if (LJIL() && (vEAudioCaptureSettings = this.LJLIIL) != null) {
            TEBundle tEBundleObtain = TEBundle.obtain();
            tEBundleObtain.setInt("SampleRate", vEAudioCaptureSettings.getSampleRate());
            tEBundleObtain.setInt("Channels", vEAudioCaptureSettings.getChannel());
            tEBundleObtain.setInt("FramesPerBuffer", vEAudioCaptureSettings.getFramesPerBuffer());
            tEBundleObtain.setInt("BitsPerSample", vEAudioCaptureSettings.getBitSamples());
            this.LJJJ.LJIL("CaptureSettings", tEBundleObtain);
        }
        if (this.LJJIJIL) {
            TERecorderInterface tERecorderInterface = this.LJJJ;
            TEAudioDataInterface tEAudioDataInterface = this.LJLIIIL;
            if (tEAudioDataInterface != null) {
                handle = tEAudioDataInterface.getHandle();
            } else {
                handle = 0;
            }
            tERecorderInterface.LJJIIJ("AudioDataInterface", handle);
        }
        if (!this.LJJJJJL.isEnableRenderLayer()) {
            VEAudioSpeedFilterParam vEAudioSpeedFilterParam = new VEAudioSpeedFilterParam();
            vEAudioSpeedFilterParam.speed = f;
            int i = this.LJJLJLI;
            if (i < 0) {
                this.LJJLJLI = this.LJJIZ.addTrackFilter(1, 0, vEAudioSpeedFilterParam, 0, -1);
            } else {
                this.LJJIZ.updateTrackFilterParam(i, vEAudioSpeedFilterParam);
            }
        }
        synchronized (this.LJL) {
            try {
                C1DMH c1dmh2 = this.LJJZZIII;
                if (c1dmh2 != null && (c1dmh2 instanceof C2254331DLj)) {
                    this.LJJJ.LJIJJLI("freezeAudioClock", true);
                }
            } finally {
            }
        }
        int iLJJIJIL = this.LJJJ.LJJIJIL(f);
        synchronized (this.LJL) {
            if (iLJJIJIL == 0) {
                try {
                    C1DMH c1dmh3 = this.LJJZZIII;
                    if (c1dmh3 != null) {
                        c1dmh3.LIZJ(f);
                    }
                } finally {
                }
            }
        }
        C1305700k5A.LIZIZ(iLJJIJIL, "te_record_start_record_ret");
        return iLJJIJIL;
    }

    public final int LJIIIIZZ(int i, int i2, int i3, int i4) {
        return this.LJJJ.LIZ(i, i2, i3, i4);
    }

    public final void LJIILIIL(int i, int i2, float f, String str) {
        int i3;
        if (i != 1000 && i != 1001 && i != VEInfo.TE_INFO_EFFECT_INIT && i != VEInfo.TE_INFO_DUET_DST_SIZE && i != VEInfo.TE_INFO_MULTIPLE_TRACK_EOF && i != (i3 = VEInfo.TE_INFO_DELETE_LAST_FRAG_DONE_NOTIFY) && i != VEInfo.TE_INFO_PREVIEW_FIRST_FRAME_SCREEN) {
            if (i == VEInfo.TE_RECORD_INFO_ENGINE_START) {
                if (i2 != -124) {
                    LJJIFFI(i, i2, str);
                }
                InterfaceC2183551Acz interfaceC2183551Acz = this.LJJLIIIJ;
                if (interfaceC2183551Acz != null) {
                    interfaceC2183551Acz.onDone(i2);
                    this.LJJLIIIJ = null;
                    return;
                }
                return;
            }
            if (i != VEInfo.TE_RECORD_INFO_VIDEO_HW_ENCODER_INIT && i != VEInfo.TE_RECORD_INFO_VIDEO_SW_ENCODER_INIT) {
                if (i == VEInfo.TE_RECORD_INFO_ENGINE_STOP) {
                    InterfaceC2183551Acz interfaceC2183551Acz2 = this.LJJLI;
                    if (interfaceC2183551Acz2 == null) {
                        return;
                    }
                    interfaceC2183551Acz2.onDone(0);
                    this.LJJLI = null;
                    return;
                }
                if (i == i3) {
                    InterfaceC2183551Acz interfaceC2183551Acz3 = this.LJJLIIIJILLIZJL;
                    if (interfaceC2183551Acz3 == null) {
                        return;
                    }
                    interfaceC2183551Acz3.onDone(i2);
                    return;
                }
                if (i == VEInfo.TE_INFO_CLEAR_ALL_FRAG_DONE_NOTIFY) {
                    return;
                }
                if (i == VEInfo.TE_INFO_PREVIEW_DISPLAY_CHANGED) {
                    LJJIFFI(1053, i2, str);
                    return;
                }
                if (i == VEInfo.TE_INFO_CHANGE_SURFACE) {
                    LJJIFFI(1071, i2, str);
                    return;
                }
                if (i == VEInfo.INFO_TITAN_START_RECORD_FIRST_FRAME) {
                    LJJIFFI(1080, i2, str);
                    return;
                }
                if (i == VEInfo.TE_INFO_RECORD_REACH_MAX_DURATION) {
                    LJJIFFI(1054, i2, str);
                    return;
                }
                if (i == 1022 || i == 1061) {
                    return;
                }
                if (i == 1050) {
                    LJJIFFI(1050, i2, String.valueOf(System.currentTimeMillis()));
                    return;
                }
                if (i != VEInfo.TE_RECORD_INFO_MIC_AUDIO_DELAY && i != VEInfo.TE_RECORD_INFO_MIC_AUDIO_DELAY_RET) {
                    int i4 = VEInfo.TE_INFO_PREVIEW_FIRST_FAKE_FRAME;
                    if (i == i4) {
                        LJJIFFI(i4, i2, str);
                        return;
                    }
                    if (i == VEInfo.TE_RECORD_INFO_ENGINE_START_RENDER) {
                        InterfaceC2183551Acz interfaceC2183551Acz4 = this.LJJLIIIJJIZ;
                        if (interfaceC2183551Acz4 == null) {
                            return;
                        }
                        interfaceC2183551Acz4.onDone(0);
                        this.LJJLIIIJJIZ = null;
                        return;
                    }
                    if (i == VEInfo.TE_MSG_MEDIA_ENGINE_RELEASE_GPU_RESOURCE) {
                        InterfaceC2183551Acz interfaceC2183551Acz5 = this.LJJLIIIJL;
                        if (interfaceC2183551Acz5 == null) {
                            return;
                        }
                        interfaceC2183551Acz5.onDone(0);
                        this.LJJLIIIJL = null;
                        return;
                    }
                    if (i == VEInfo.TE_RECORD_INFO_ENGINE_PAUSE_RENDER) {
                        InterfaceC2183551Acz interfaceC2183551Acz6 = this.LJJLIIIJJI;
                        if (interfaceC2183551Acz6 == null) {
                            return;
                        }
                        interfaceC2183551Acz6.onDone(0);
                        this.LJJLIIIJJI = null;
                        return;
                    }
                    int i5 = VEInfo.TE_MSG_EFFECT_EXPORT_RES_DONE;
                    if (i == i5) {
                        LJJIFFI(i5, i2, str);
                        return;
                    }
                    if (i == VEInfo.TE_MSG_AUDIO_GLITCH_HAPPEN) {
                        this.LLFFF.LIZ++;
                        return;
                    } else {
                        if (i != VEInfo.TE_MSG_AUDIO_GLITCH_INFO) {
                            return;
                        }
                        C1461270o85 c1461270o85 = this.LLFFF;
                        c1461270o85.LIZJ = (int) f;
                        c1461270o85.LIZIZ = i2;
                        return;
                    }
                }
                LJJIFFI(i, i2, "");
                return;
            }
            LJJIFFI(i, i2, str);
            return;
        }
        LJJIFFI(i, i2, str);
    }

    public final void LJJII(int i, int i2, float f, String str) {
        ArrayList<InterfaceC1464200oCo> arrayList;
        synchronized (this.LJJJLIIL) {
            try {
                arrayList = new ArrayList(this.LJJJJZI);
                InterfaceC1464200oCo interfaceC1464200oCo = this.LJJJJZ;
                if (interfaceC1464200oCo != null) {
                    arrayList.add(interfaceC1464200oCo);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        for (InterfaceC1464200oCo interfaceC1464200oCo2 : arrayList) {
            if (interfaceC1464200oCo2 != null) {
                interfaceC1464200oCo2.onCallback(i, i2, f, str);
            }
        }
    }

    public final int LJJIIZI(int i, long j, long j2, long j3, String str) {
        boolean z;
        if (LJIIZILJ() != 3 && LJIILJJIL() != VERecordMode.DUET) {
            if (!this.LLFF) {
                C2484209oO.LIZJ("TERecorder", "setRecordBGM could not be executed, after startPrePlay");
                return -105;
            }
            this.LJIIL = str;
            if (TextUtils.isEmpty(str)) {
                TEBundle tEBundleObtain = TEBundle.obtain();
                int i2 = this.LJJLIIIJLJLI;
                if (i2 >= 0) {
                    tEBundleObtain.setInt("TrackIndex", i2);
                    tEBundleObtain.setInt("TrackType", 1);
                    int iLJIL = this.LJJJ.LJIL("RemoveTrack", tEBundleObtain);
                    if (iLJIL == 0) {
                        synchronized (this.LJL) {
                            try {
                                C1DMH c1dmh = this.LJJZZIII;
                                if (c1dmh != null && (c1dmh instanceof C2254331DLj)) {
                                    this.LJJJ.LJIJJLI("FocusSingleAudioTrack", true);
                                    ((C2254331DLj) this.LJJZZIII).LJIIJJI(this.LJJLIIIJLJLI);
                                }
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                throw th;
                            }
                        }
                        this.LJJLIIIJLJLI = -1;
                    }
                    if (!VEConfigCenter.getInstance().getValue("ve_enable_recorder_simply_project", false).booleanValue()) {
                        LJIIIIZZ(this.LJJLIIIJLJLI, 1, -1, 0);
                        return iLJIL;
                    }
                    LJIIIIZZ(this.LJJLIIIJLJLI, 1, -1, -1);
                    return iLJIL;
                }
            }
            if (LJJI()) {
                this.LJJJ.LJIJJLI("FocusSingleAudioTrack", false);
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf((int) j));
            ArrayList arrayList3 = new ArrayList();
            arrayList3.add(Integer.valueOf((int) j2));
            ArrayList arrayList4 = new ArrayList();
            arrayList4.add(Double.valueOf(1.0d));
            if (i == 1) {
                z = true;
            } else {
                z = false;
            }
            Integer numValueOf = Integer.valueOf((int) j3);
            TEBundle tEBundleObtain2 = TEBundle.obtain();
            tEBundleObtain2.setInt("TrackIndex", this.LJJLIIIJLJLI);
            tEBundleObtain2.setInt("TrackType", 1);
            tEBundleObtain2.setStringArray("Paths", TEArrayUtils.toStringArray(arrayList));
            tEBundleObtain2.setIntArray("TrimIns", TEArrayUtils.toIntArray(arrayList2));
            tEBundleObtain2.setIntArray("TrimOuts", TEArrayUtils.toIntArray(arrayList3));
            tEBundleObtain2.setDoubleArray("Speeds", TEArrayUtils.toDoubleArray(arrayList4));
            tEBundleObtain2.setBool("Loop", z);
            tEBundleObtain2.setInt("MaxLoopDuration", numValueOf.intValue());
            int iLJIL2 = this.LJJJ.LJIL("AudioStreamInfo", tEBundleObtain2);
            this.LJJLIIIJLJLI = iLJIL2;
            if (iLJIL2 >= 0 && i != 3) {
                LJIIIIZZ(iLJIL2, 1, 1, 0);
            }
            return iLJIL2;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setRecordBGM failed. Current record mode is ");
        sbLIZ.append(LJIILJJIL());
        C2484209oO.LIZJ("TERecorder", C2188811AlT.LIZIZ(sbLIZ));
        return -105;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LJJIJL(int r7, int r8, boolean r9, boolean r10, final X.InterfaceC2173471A4j r11) {
        /*
            r6 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r6.LJJZZI
            boolean r0 = r0.get()
            r4 = 0
            if (r0 == 0) goto L15
            java.lang.String r1 = "TERecorder"
            java.lang.String r0 = "Last screenshot not complete"
            X.C2484209oO.LJIIIIZZ(r1, r0)
            r0 = -1
            r11.LIZ(r0, r4)
            return r0
        L15:
            com.ss.android.vesdk.VEPreviewSettings r0 = r6.LJJJJJL
            boolean r0 = r0.isSyncCapture()
            r2 = 1
            if (r0 != 0) goto L2c
            com.ss.android.vesdk.VEConfigCenter r3 = com.ss.android.vesdk.VEConfigCenter.getInstance()
            java.lang.String r0 = "ve_titan_shot_screen_opt"
            r1 = 0
            int r0 = r3.getValue(r0, r1)
            if (r0 == 0) goto L33
        L2c:
            r1 = 1
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r7, r8, r0)
        L33:
            java.util.concurrent.atomic.AtomicBoolean r0 = r6.LJJZZI
            r0.set(r2)
            java.lang.System.currentTimeMillis()
            X.1AOD r3 = new X.1AOD
            r3.<init>()
            X.0wQR r5 = X.EnumC1780170wQR.NO_MIRROR
            int r1 = r6.LL
            if (r1 == 0) goto L4a
            if (r1 != r2) goto L7c
            X.0wQR r5 = X.EnumC1780170wQR.X_MIRROR
        L4a:
            X.0Mn7 r2 = new X.0Mn7
            r2.<init>()
            X.1AO8 r0 = X.C1AO8.NORMAL_GET_FRAME_MODE
            X.1DLr r1 = r2.LIZ
            r1.LIZ = r0
            r1.LJFF = r9
            if (r10 == 0) goto L79
            X.0Mmv r0 = X.EnumC578750Mmv.FULL_EFFECT
        L5b:
            r1.LJ = r0
            X.0wQS r0 = X.EnumC1780180wQS.CENTER_CROP
            r1.LJI = r0
            com.ss.android.vesdk.VESize r0 = new com.ss.android.vesdk.VESize
            r0.<init>(r7, r8)
            X.1DLr r1 = r2.LIZ
            r1.LIZIZ = r0
            r1.LJIIIIZZ = r5
            r1.LJII = r3
            r1.LJIJ = r4
            boolean r0 = r6.LJLJI
            r1.LJIIJJI = r0
            int r0 = r6.LJIILLIIL(r1)
            return r0
        L79:
            X.0Mmv r0 = X.EnumC578750Mmv.NO_EFFECT
            goto L5b
        L7c:
            r0 = 2
            if (r1 != r0) goto L4a
            X.0wQR r5 = X.EnumC1780170wQR.Y_MIRROR
            goto L4a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vesdk.k.LJJIJL(int, int, boolean, boolean, X.1A4j):int");
    }

    public final int LJIJI(VECameraCapture vECameraCapture, VEVideoEncodeSettings vEVideoEncodeSettings, VEAudioEncodeSettings vEAudioEncodeSettings, VEPreviewSettings vEPreviewSettings, String str, boolean z) {
        VECameraSettings vECameraSettings;
        VERecordMode vERecordMode;
        long handle;
        int i;
        if (this.LJJIJIIJIL) {
            ((ReentrantLock) this.LJLL).lock();
            this.LJJJJIZL = vECameraCapture;
            this.LJLLI.signalAll();
            ((ReentrantLock) this.LJLL).unlock();
        } else {
            this.LJJJJIZL = vECameraCapture;
        }
        if (vECameraCapture == null) {
            vECameraSettings = null;
        } else {
            vECameraSettings = vECameraCapture.LL;
        }
        this.LJII = vECameraSettings;
        TECamera tECamera = new TECamera(this.LJJJ.LJI());
        this.LJJJI = tECamera;
        tECamera.setOnCameraInfoListener(this);
        if (VEConfigCenter.getInstance().getValue("ve_enable_multi_capture_pipeline", false).booleanValue()) {
            TECamera tECamera2 = new TECamera(this.LJJJ.LJ());
            this.LJJJIL = tECamera2;
            tECamera2.setOnCameraInfoListener(this);
        }
        this.LLFII = new TECamera(this.LJJJ.LJIIJJI());
        C2254401DLq c2254401DLq = this.LJJJJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(File.separator);
        c2254401DLq.LIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (!this.LJJIJIIJIL) {
            VEDisplaySettings.Builder builder = new VEDisplaySettings.Builder();
            builder.setRenderSize(vEPreviewSettings.getRenderSize());
            this.LJLJL = builder.build();
        }
        this.LJJJJ.LJI = vEPreviewSettings.getRecordContentType();
        this.LJJJJ.LJII = vEPreviewSettings.isEnableDynamicRecordContentType();
        this.LJJJJ.LJIIIIZZ = vEPreviewSettings.isHDR10BitProcessingPipelineEnabled();
        this.LJJJJ.LJIIIZ = vEPreviewSettings.isPureHDR10BitProcessingPipelineEnabled();
        this.LJJJJ.LJIIJJI = vEPreviewSettings.needPostProcess();
        this.LJJJJ.LIZLLL = new LinkedList();
        this.LJJJJ.LJ = new LinkedList();
        this.LJJJJ.LJIIJ = vEPreviewSettings.isRecordEffectContentHighSpeed();
        this.LJJJJ.LJIILJJIL = vEPreviewSettings.isEnable2DEngineEffect();
        this.LJJJJ.LJIILIIL = vEPreviewSettings.isEnableEffectAmazingEngine();
        this.LJJJJ.LJIILL = vEPreviewSettings.isFollowShotIndependentThread();
        this.LJJJJ.LJIL = vEPreviewSettings.isVideoDecodeUseSetMultiTrackStatus();
        if (vEPreviewSettings.getForceRenderThreadSelfDriveConfig()) {
            this.LJJJJ.LJJ = vEPreviewSettings.getRenderThreadSelfDriveConfig();
        } else if (vEPreviewSettings.isEnableRenderThreadSelfDrive()) {
            this.LJJJJ.LJJ = 2;
        } else {
            this.LJJJJ.LJJ = 0;
        }
        this.LJJJJ.LJJIFFI = vEPreviewSettings.isEnableTitanAudioOpt();
        this.LJJJJ.LJJI = vEPreviewSettings.isEnableRecordMattingOpt();
        this.LJJJJ.LJJII = vEPreviewSettings.isEnablePlayAVSyncOpt();
        C2254401DLq c2254401DLq2 = this.LJJJJ;
        c2254401DLq2.LJIIZILJ = true;
        c2254401DLq2.LJIJ = vEPreviewSettings.getAudioDecodeTimeOpt();
        VEConfigCenter.ValuePkt value = VEConfigCenter.getInstance().getValue("ve_enable_render_encode_resolution_align4", VEConfigCenter.DataType.BOOLEAN, Boolean.FALSE);
        if (value != null && value.getValue() != null && vEVideoEncodeSettings != null) {
            VEVideoEncodeSettings.ENCODE_STANDARD encode_standard = VEVideoEncodeSettings.ENCODE_STANDARD.values()[vEVideoEncodeSettings.getEncodeStandard()];
            C1780100wQK c1780100wQK = new C1780100wQK(vEVideoEncodeSettings);
            if (((Boolean) value.getValue()).booleanValue()) {
                i = 4;
            } else {
                i = 16;
            }
            c1780100wQK.LIZIZ.mResolutionAlign = i;
            if (vEVideoEncodeSettings.isEnableHdr10BitEncode()) {
                c1780100wQK.LJI(encode_standard);
            }
            this.LJIIIIZZ = c1780100wQK.LIZ();
        } else {
            this.LJIIIIZZ = vEVideoEncodeSettings;
        }
        if (vEPreviewSettings.getDisplaySettings() != null) {
            this.LJLJL = vEPreviewSettings.getDisplaySettings();
        }
        this.LJIIIZ = vEAudioEncodeSettings;
        this.LJJJJJL = vEPreviewSettings;
        this.LLIIJLIL = z;
        TEPerfStatsInvoker.nativeReset(0);
        if (this.LJJJJ.LJFF != 0) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("initInternalRecorder called in a invalid state: ");
            sbLIZ2.append(this.LJJJJ.LJFF);
            sbLIZ2.append("should be : ");
            sbLIZ2.append(0);
            C2484209oO.LIZJ("TERecorder", C2188811AlT.LIZIZ(sbLIZ2));
            return -105;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("create audio capture VERecordMode is ");
        sbLIZ3.append(this.LJIIJJI);
        C2484209oO.LJI("TERecorder", C2188811AlT.LIZIZ(sbLIZ3));
        if ((VERuntime.getInstance().isEnableAudioCapture() && !this.LJJIJIL) || (vERecordMode = this.LJIIJJI) == VERecordMode.KARAOKE || vERecordMode == VERecordMode.KARAOKE_PURE_AUDIO || vERecordMode == VERecordMode.DUET_KARAOKE) {
            this.LIZ = new VEAudioCapture();
            TEAudioDataInterface tEAudioDataInterface = new TEAudioDataInterface();
            this.LJLIIIL = tEAudioDataInterface;
            this.LIZ.addCaptureListener(tEAudioDataInterface);
            this.LIZ.setAudioDeviceChangeListener(this.LJLJLLL);
        }
        this.LJJJJ.LJJIIJ = this.LJJJJJL.getRenderSize();
        this.LJJJJ.LJIJI = this.LJJJJJL.isEnableRenderLayer();
        this.LJJJJ.LJIJJ = this.LJJJJJL.isEnableModelHotUpdate();
        this.LJJJJ.LJIJJLI = this.LJJJJJL.isEnablePassEffectWhenNoEffectFilter();
        int iLJIILJJIL = this.LJJJ.LJIILJJIL(this.LJJJJ, this.LJIIIIZZ, this.LJIIIZ, this.LJJJJJL);
        if (iLJIILJJIL == 0) {
            this.LJJJJ.LJFF = 1;
        }
        if (this.LJJJJJL.isEnableRenderLayer()) {
            LJIJJLI();
        }
        if (!this.LJJJJJL.isEnablePassEffectWhenNoEffectFilter()) {
            VEFocusRunEffectFilter vEFocusRunEffectFilter = new VEFocusRunEffectFilter();
            int i2 = this.LJLI;
            if (i2 >= 0) {
                this.LJJIZ.updateTrackFilterParam(i2, vEFocusRunEffectFilter);
            } else {
                this.LJLI = this.LJJIZ.addTrackFilter(0, 0, vEFocusRunEffectFilter, -1, -1);
            }
        }
        new VEARCoreParam().setEnableARCore(this.LLIIJLIL);
        this.LJJIZ.getClass();
        if (this.LJJIJIL && this.LJLIIIL == null) {
            this.LJLIIIL = new TEAudioDataInterface();
        }
        TERecorderInterface tERecorderInterface = this.LJJJ;
        TEAudioDataInterface tEAudioDataInterface2 = this.LJLIIIL;
        if (tEAudioDataInterface2 != null) {
            handle = tEAudioDataInterface2.getHandle();
        } else {
            handle = 0;
        }
        tERecorderInterface.LJJIIJ("AudioDataInterface", handle);
        return iLJIILJJIL;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LJJIJIL(int r13, int r14, boolean r15, final X.InterfaceC2173471A4j r16, boolean r17, final com.ss.android.vesdk.VERecorder.IVEFrameShotScreenCallback r18) {
        /*
            Method dump skipped, instruction units count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vesdk.k.LJJIJIL(int, int, boolean, X.1A4j, boolean, com.ss.android.vesdk.VERecorder$IVEFrameShotScreenCallback):int");
    }

    public final int LJJIJLIJ(final String str, int i, int i2, boolean z, boolean z2, final Bitmap.CompressFormat compressFormat, final InterfaceC2178571ANz interfaceC2178571ANz) {
        final Bitmap bitmapCreateBitmap;
        EnumC578750Mmv enumC578750Mmv;
        if (this.LJJZZI.get()) {
            C2484209oO.LJIIIIZZ("TERecorder", "Last screenshot not complete");
            interfaceC2178571ANz.LIZ(-1);
            return -1;
        }
        this.LJJZZI.set(true);
        if (this.LJLJJLL) {
            bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        } else {
            bitmapCreateBitmap = null;
        }
        C1AO7 c1ao7 = new C1AO7() { // from class: X.1Acs
            @Override // X.C1AO7
            public final /* synthetic */ void LIZIZ(VEFrame vEFrame, int i3) {
            }

            @Override // X.C1AO7
            public final /* synthetic */ void onResult(int i3) {
            }

            /* JADX WARN: Removed duplicated region for block: B:102:? A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:76:0x0113 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:88:0x011d A[EXC_TOP_SPLITTER, SYNTHETIC] */
            @Override // X.C1AO7
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ(int r12, int r13, int[] r14) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 294
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C2183481Acs.LIZ(int, int, int[]):void");
            }
        };
        EnumC1780170wQR enumC1780170wQR = EnumC1780170wQR.NO_MIRROR;
        int i3 = this.LL;
        if (i3 != 0) {
            if (i3 == 1) {
                enumC1780170wQR = EnumC1780170wQR.X_MIRROR;
            } else if (i3 == 2) {
                enumC1780170wQR = EnumC1780170wQR.Y_MIRROR;
            }
        }
        C578870Mn7 c578870Mn7 = new C578870Mn7();
        C1AO8 c1ao8 = C1AO8.NORMAL_GET_FRAME_MODE;
        C2254411DLr c2254411DLr = c578870Mn7.LIZ;
        c2254411DLr.LIZ = c1ao8;
        c2254411DLr.LJFF = z;
        if (z2) {
            enumC578750Mmv = EnumC578750Mmv.FULL_EFFECT;
        } else {
            enumC578750Mmv = EnumC578750Mmv.NO_EFFECT;
        }
        c2254411DLr.LJ = enumC578750Mmv;
        c2254411DLr.LJI = EnumC1780180wQS.CENTER_CROP;
        VESize vESize = new VESize(i, i2);
        C2254411DLr c2254411DLr2 = c578870Mn7.LIZ;
        c2254411DLr2.LIZIZ = vESize;
        c2254411DLr2.LJIIIIZZ = enumC1780170wQR;
        c2254411DLr2.LJII = c1ao7;
        c2254411DLr2.LJIJ = bitmapCreateBitmap;
        c2254411DLr2.LJIIJJI = this.LJLJI;
        return LJIILLIIL(c2254411DLr2);
    }
}
