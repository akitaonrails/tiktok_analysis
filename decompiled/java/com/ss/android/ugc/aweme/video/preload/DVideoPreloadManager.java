package com.ss.android.ugc.aweme.video.preload;

import X.C0NI4;
import X.C0NKB;
import X.C0NKF;
import X.C0VSJ;
import X.C1474710oTl;
import X.C1474810oTv;
import X.C1474930oU7;
import X.C1474940oU8;
import X.C1475000oUE;
import X.C1475150oUT;
import X.C1475410oUt;
import X.C1476580oWm;
import X.C1476730oX1;
import X.C1477400oY6;
import X.C1478190oZN;
import X.C1478300oZY;
import X.C1485160okc;
import X.C1485620olM;
import X.C1EJO;
import X.C2188811AlT;
import X.C2262431Dgv;
import X.C2354809Ko;
import X.C786410Ut5;
import X.InterfaceC1475290oUh;
import X.InterfaceC1475300oUi;
import X.InterfaceC1475840oVa;
import X.InterfaceC1482870ogv;
import X.InterfaceC1485260okm;
import Y.AObjectS205S0300000_23;
import Y.AObjectS296S0200000_23;
import Y.AObjectS397S0100000_23;
import Y.AObjectS94S1100000_23;
import Y.ARunnableS123S0100000_23;
import Y.ARunnableS92S0200000_23;
import android.app.Application;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.video.preload.DVideoPreloadManager;
import com.ss.android.ugc.playerkit.radar.SimRadar;
import com.ss.android.ugc.playerkit.simapicommon.model.SimBitRate;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public final class DVideoPreloadManager implements InterfaceC1482870ogv {
    public static final BPEAHandler LJI;
    public static final C1485160okc LJII;
    public final C0NKF LIZ;
    public final InterfaceC1485260okm LIZIZ;
    public boolean LIZJ;
    public final ConcurrentHashMap<String, Long> LIZLLL;
    public final CountDownLatch LJ;
    public final CountDownLatch LJFF;

    @Override // X.InterfaceC1482870ogv
    public final /* synthetic */ String LJIIJ() {
        return null;
    }

    @Override // X.InterfaceC1482870ogv
    public final /* synthetic */ void LJIIZILJ(boolean z) {
    }

    @Override // X.InterfaceC1482870ogv
    public final /* synthetic */ String LJIJJ() {
        return null;
    }

    @Override // X.InterfaceC1482870ogv
    public final /* synthetic */ boolean LJJ(SimVideoUrlModel simVideoUrlModel) {
        return false;
    }

    @Override // X.InterfaceC1482870ogv
    public final /* synthetic */ int LJJII() {
        return 0;
    }

    @Override // X.InterfaceC1482870ogv
    public final /* synthetic */ long LJJIIJ(String str, String str2) {
        return -1L;
    }

    @Override // X.InterfaceC1482870ogv
    public final /* synthetic */ void LJJIIZI(String str, List list) {
    }

    @Override // X.InterfaceC1482870ogv
    public final /* synthetic */ String LJJIJ(String str) {
        return null;
    }

    @Override // X.InterfaceC1482870ogv
    public final /* synthetic */ void LJJJIL(String str) {
    }

    @Override // X.InterfaceC1482870ogv
    public final /* synthetic */ boolean LJJJJI() {
        return false;
    }

    @Override // X.InterfaceC1482870ogv
    public final /* synthetic */ void LJJJJIZL(int i, String str) {
    }

    @Override // X.InterfaceC1482870ogv
    public final /* synthetic */ void LJJJJLL(boolean z) {
    }

    @Override // X.InterfaceC1482870ogv
    public final /* synthetic */ void LJJJLIIL(boolean z) {
    }

    @Override // X.InterfaceC1482870ogv
    public final /* synthetic */ void LJJL(JSONObject jSONObject) {
    }

    @Override // X.InterfaceC1482870ogv
    public final /* synthetic */ boolean LJJLIIIJILLIZJL() {
        return false;
    }

    @Override // X.InterfaceC1482870ogv
    public final /* synthetic */ void LJJLIIIJL(C1476730oX1 c1476730oX1) {
    }

    static {
        BPEAHandler bPEAHandler;
        try {
            HandlerThread handlerThread = new HandlerThread("VideoPreloadHandlerThread");
            handlerThread.start();
            bPEAHandler = new BPEAHandler(C786410Ut5.W2(handlerThread));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            bPEAHandler = new BPEAHandler(Looper.getMainLooper());
        }
        LJI = bPEAHandler;
        LJII = new C1485160okc();
    }

    @Override // X.InterfaceC1482870ogv, X.InterfaceC1488150opR
    public final void LIZ() {
        LJJLIL(new AObjectS397S0100000_23(this, 21));
    }

    @Override // X.InterfaceC1482870ogv
    public final boolean LJIIJJI() {
        return this.LIZJ ? this.LIZIZ.LJIIJJI() : this.LIZ == C0NKF.MediaLoader;
    }

    @Override // X.InterfaceC1482870ogv
    public final boolean LJIJJLI() {
        LJJLIL(new AObjectS397S0100000_23(this, 19));
        return true;
    }

    @Override // X.InterfaceC1482870ogv
    public final Map LJJIJIIJI() {
        return new LinkedHashMap();
    }

    @Override // X.InterfaceC1482870ogv
    public final int LJJIJIL() {
        return this.LIZIZ.LJJIJIL();
    }

    @Override // X.InterfaceC1482870ogv
    public final String LJJJJJ() {
        return this.LIZIZ.LJJJJJ();
    }

    @Override // X.InterfaceC1482870ogv
    public final void LJJLIIJ() {
        LJJI(C1485620olM.LIZ);
    }

    @Override // X.InterfaceC1482870ogv
    public final void clearCache() {
        LJJLIL(new AObjectS397S0100000_23(this, 20));
    }

    @Override // X.InterfaceC1482870ogv
    public final File getCacheDir() {
        if (this.LIZJ) {
            return this.LIZIZ.LJJLIIIJILLIZJL();
        }
        try {
            Application application = C1475000oUE.LIZ;
            if (application == null) {
                return null;
            }
            File cacheDir = application.getCacheDir();
            if (C1475000oUE.LIZIZ().isDebug()) {
                cacheDir = C2354809Ko.LIZLLL(application);
            }
            if (TextUtils.equals("playback_simulator_test", C1475000oUE.LIZIZ().getChannel())) {
                cacheDir = C2354809Ko.LIZLLL(application);
            }
            if (cacheDir != null) {
                if (!cacheDir.exists()) {
                    cacheDir.mkdirs();
                }
                return new C0VSJ(cacheDir, this.LIZ.LLILLJJLI);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return null;
    }

    public DVideoPreloadManager() {
        C1485160okc c1485160okc = LJII;
        this.LIZLLL = new ConcurrentHashMap<>(1024);
        this.LJ = new CountDownLatch(1);
        this.LJFF = new CountDownLatch(1);
        C1478300oZY c1478300oZYLIZ = C1478190oZN.LIZ();
        C0NKF c0nkfPreloadTypeExperiment = c1478300oZYLIZ.getExperiment().PreloadTypeExperiment();
        this.LIZ = c0nkfPreloadTypeExperiment;
        this.LIZIZ = c1485160okc.LIZ(c0nkfPreloadTypeExperiment, c1478300oZYLIZ);
        if (((Boolean) C1474810oTv.LLJLIL.getValue()).booleanValue() && !C1474930oU7.LJFF) {
            SimRadar.keyScan("CBOF", "cold boot mdl degrade: block task post", new Object[0]);
            C786410Ut5.LJJZZIII(LJI, new ARunnableS123S0100000_23(this, 212));
            C1474930oU7.LIZIZ(new C1474940oU8("TASK_PRELOAD_MANAGER_SERVICE_IMPL_INIT", new ARunnableS123S0100000_23(this, 213)));
        }
        LJIJJLI();
    }

    @Override // X.InterfaceC1482870ogv
    public final void LIZIZ(InterfaceC1475300oUi interfaceC1475300oUi) {
        if (interfaceC1475300oUi != null) {
            this.LIZIZ.LIZIZ(interfaceC1475300oUi);
        }
    }

    @Override // X.InterfaceC1482870ogv
    public final List<C2262431Dgv> LIZJ(SimVideoUrlModel simVideoUrlModel) {
        if (!this.LIZJ || simVideoUrlModel == null) {
            return null;
        }
        return this.LIZIZ.LIZJ(simVideoUrlModel);
    }

    @Override // X.InterfaceC1482870ogv
    public final void LIZLLL(InterfaceC1475300oUi interfaceC1475300oUi) {
        if (interfaceC1475300oUi != null) {
            this.LIZIZ.LIZLLL(interfaceC1475300oUi);
        }
    }

    @Override // X.InterfaceC1482870ogv
    public final void LJ(final boolean z) {
        LJJLIL(new Function0() { // from class: X.0olL
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                DVideoPreloadManager dVideoPreloadManager = this.LL;
                dVideoPreloadManager.LIZIZ.LJ(z);
                return Unit.LIZ;
            }
        });
    }

    @Override // X.InterfaceC1482870ogv
    public final void LJI(String str) {
        LJJLIL(new AObjectS94S1100000_23(this, str, 6));
    }

    @Override // X.InterfaceC1482870ogv
    public final void LJII(String str) {
        LJJLIL(new AObjectS94S1100000_23(this, str, 3));
    }

    @Override // X.InterfaceC1482870ogv
    public final boolean LJIIIIZZ(SimVideoUrlModel simVideoUrlModel) {
        if (this.LIZJ && isCache(simVideoUrlModel) && this.LIZIZ.LJIIIIZZ(simVideoUrlModel)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1482870ogv
    public final void LJIILIIL(InterfaceC1475290oUh interfaceC1475290oUh) {
        this.LIZIZ.LJIILIIL(interfaceC1475290oUh);
    }

    @Override // X.InterfaceC1482870ogv
    public final long LJIILL(String str) {
        if (this.LIZJ) {
            return this.LIZIZ.LJIILL(str);
        }
        return 0L;
    }

    @Override // X.InterfaceC1482870ogv
    public final void LJIL(String str) {
        LJJLIL(new AObjectS94S1100000_23(this, str, 2));
    }

    @Override // X.InterfaceC1482870ogv
    public final void LJJI(InterfaceC1475290oUh interfaceC1475290oUh) {
        this.LIZIZ.LJJI(interfaceC1475290oUh);
    }

    @Override // X.InterfaceC1482870ogv
    public final List<C1EJO> LJJIIJZLJL(SimVideoUrlModel simVideoUrlModel) {
        if (this.LIZJ) {
            return this.LIZIZ.LJJIIJZLJL(simVideoUrlModel);
        }
        return null;
    }

    @Override // X.InterfaceC1482870ogv
    public final void LJJIIZ(String str) {
        LJJLIL(new AObjectS94S1100000_23(this, str, 10));
    }

    @Override // X.InterfaceC1482870ogv
    public final void LJJIJIIJIL(String str) {
        LJJLIL(new AObjectS94S1100000_23(this, str, 8));
    }

    @Override // X.InterfaceC1482870ogv
    public final void LJJIJL(Map<String, String> map) {
        LJJLIL(new AObjectS296S0200000_23(this, map, 2));
    }

    @Override // X.InterfaceC1482870ogv
    public final void LJJIJLIJ(String str) {
        LJJLIL(new AObjectS94S1100000_23(this, str, 5));
    }

    @Override // X.InterfaceC1482870ogv
    public final long LJJIZ(SimVideoUrlModel simVideoUrlModel) {
        if (this.LIZJ && simVideoUrlModel != null) {
            if (simVideoUrlModel.hasDashBitrateAndSelectAsMp4()) {
                return this.LIZIZ.LJJLIIIJJI(simVideoUrlModel);
            }
            return this.LIZIZ.LJJLIIIJL(simVideoUrlModel.getBitRatedRatioUri());
        }
        return -1L;
    }

    @Override // X.InterfaceC1482870ogv
    public final void LJJJ(String str) {
        C1476580oWm c1476580oWm = C1474710oTl.LIZ;
        c1476580oWm.getClass();
        if (!TextUtils.isEmpty(str)) {
            c1476580oWm.LIZJ = str;
            if (c1476580oWm.LIZIZ == null) {
                c1476580oWm.LIZIZ = str;
            }
        }
        LJJLIL(new AObjectS94S1100000_23(this, str, 4));
    }

    @Override // X.InterfaceC1482870ogv
    public final int LJJJJL(SimVideoUrlModel simVideoUrlModel) {
        if (this.LIZJ) {
            LJJLJ(simVideoUrlModel);
            return this.LIZIZ.LJJJJL(simVideoUrlModel);
        }
        return 0;
    }

    @Override // X.InterfaceC1482870ogv
    public final void LJJJJLI(String str) {
        LJJLIL(new AObjectS94S1100000_23(this, str, 7));
    }

    @Override // X.InterfaceC1482870ogv
    public final void LJJJJZ(SimVideoUrlModel simVideoUrlModel) {
        LJJLIL(new AObjectS296S0200000_23(this, simVideoUrlModel, 3));
    }

    @Override // X.InterfaceC1482870ogv
    public final C2262431Dgv LJJJJZI(SimVideoUrlModel simVideoUrlModel) {
        if (!this.LIZJ || simVideoUrlModel == null) {
            return null;
        }
        return this.LIZIZ.LJJJJZI(simVideoUrlModel);
    }

    @Override // X.InterfaceC1482870ogv
    public final void LJJJLZIJ(SimVideoUrlModel simVideoUrlModel) {
        if (!C1474810oTv.LJJIIJZLJL() && simVideoUrlModel != null && simVideoUrlModel.getUri() != null) {
            C1475000oUE.LIZLLL.execute(new ARunnableS92S0200000_23(this, new AObjectS296S0200000_23(this, simVideoUrlModel, 4), 150));
        }
    }

    @Override // X.InterfaceC1482870ogv
    public final void LJJJZ(String str) {
        LJJLIL(new AObjectS94S1100000_23(this, str, 9));
    }

    @Override // X.InterfaceC1482870ogv
    public final boolean LJJLIIIJ(final List list) {
        LJJLIL(new Function0() { // from class: X.0oki
            public final /* synthetic */ int LLILLL = Integer.MAX_VALUE;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                DVideoPreloadManager dVideoPreloadManager = this.LL;
                List list2 = list;
                dVideoPreloadManager.LIZIZ.LJJLIIIJLJLI(this.LLILLL, list2);
                return Unit.LIZ;
            }
        });
        return true;
    }

    @Override // X.InterfaceC1482870ogv
    public final int LJJLIIIJJI(SimVideoUrlModel simVideoUrlModel) {
        return LJJJJL(simVideoUrlModel);
    }

    @Override // X.InterfaceC1482870ogv
    public final void LJJLIIIJJIZ(SimVideoUrlModel simVideoUrlModel) {
        if (this.LIZJ && simVideoUrlModel != null) {
            this.LIZIZ.LJJLIIIJLLLLLLLZ(simVideoUrlModel);
        }
    }

    @Override // X.InterfaceC1482870ogv
    public final boolean LJJLIIIJLLLLLLLZ(SimVideoUrlModel simVideoUrlModel) {
        return LJJJLL(simVideoUrlModel, 0);
    }

    public final void LJJLIL(Function0<Unit> function0) {
        C786410Ut5.LJJZZIII(LJI, new ARunnableS92S0200000_23(this, function0, 145));
    }

    public final void LJJLJ(SimVideoUrlModel simVideoUrlModel) {
        if (!C1474810oTv.LJJLIIIIJ() && simVideoUrlModel != null) {
            if (simVideoUrlModel.getHitBitrate() == null) {
                simVideoUrlModel.setHitBitrate(C1477400oY6.LJJJJI.LJIJI(simVideoUrlModel.getSourceId()));
            }
            if (simVideoUrlModel.getHitDashVideoBitrate() == null) {
                simVideoUrlModel.setHitDashVideoBitrate(C1477400oY6.LJJJJI.LJIJJLI(simVideoUrlModel.getSourceId()));
            }
            if (simVideoUrlModel.getHitDashAudioBitrate() == null) {
                simVideoUrlModel.setHitDashAudioBitrate(C1477400oY6.LJJJJI.LJIJJ(simVideoUrlModel.getSourceId()));
            }
            if (TextUtils.isEmpty(simVideoUrlModel.getDashVideoId())) {
                simVideoUrlModel.setDashVideoId(C1477400oY6.LJJJJI.LJIIJJI(simVideoUrlModel.getSourceId()));
            }
        }
    }

    @Override // X.InterfaceC1482870ogv
    public final boolean isCache(SimVideoUrlModel simVideoUrlModel) {
        if (this.LIZJ) {
            LJJLJ(simVideoUrlModel);
            return this.LIZIZ.isCache(simVideoUrlModel);
        }
        return false;
    }

    @Override // X.InterfaceC1482870ogv
    public final long LJFF(SimVideoUrlModel simVideoUrlModel, long j) {
        if (this.LIZJ) {
            LJJLJ(simVideoUrlModel);
            return this.LIZIZ.LJFF(simVideoUrlModel, j);
        }
        return 0L;
    }

    @Override // X.InterfaceC1482870ogv
    public final long LJIILJJIL(final long j, final boolean z) {
        LJJLIL(new Function0() { // from class: X.0olK
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                DVideoPreloadManager dVideoPreloadManager = this.LL;
                dVideoPreloadManager.LIZIZ.LJIILJJIL(j, z);
                return Unit.LIZ;
            }
        });
        return -1L;
    }

    @Override // X.InterfaceC1482870ogv
    public final long LJIJI(SimBitRate simBitRate, boolean z) {
        if (this.LIZJ) {
            return this.LIZIZ.LJIJI(simBitRate, z);
        }
        return 0L;
    }

    @Override // X.InterfaceC1482870ogv
    public final void LJJIL(SimVideoUrlModel simVideoUrlModel, C0NI4 c0ni4) {
        LJJLIL(new AObjectS205S0300000_23(this, simVideoUrlModel, c0ni4, 1));
    }

    @Override // X.InterfaceC1482870ogv
    public final void LJJJI(final String str, final String str2) {
        LJJLIL(new Function0() { // from class: X.0olI
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                DVideoPreloadManager dVideoPreloadManager = this.LL;
                dVideoPreloadManager.LIZIZ.LJJJI(str, str2);
                return Unit.LIZ;
            }
        });
    }

    @Override // X.InterfaceC1482870ogv
    public final long LJJJJ(SimBitRate simBitRate, boolean z) {
        if (this.LIZJ) {
            return this.LIZIZ.LJJJJ(simBitRate, z);
        }
        return 0L;
    }

    @Override // X.InterfaceC1482870ogv
    public final boolean LJJJLL(SimVideoUrlModel simVideoUrlModel, int i) {
        return LJJLJLI(simVideoUrlModel, i, C0NKB.LIZIZ);
    }

    @Override // X.InterfaceC1482870ogv
    public final String LJJIII(SimVideoUrlModel simVideoUrlModel, String str, String[] strArr) {
        boolean z;
        boolean z2 = true;
        if (((Boolean) C1474810oTv.LLJLIL.getValue()).booleanValue() && !C1474930oU7.LJFF) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (strArr != null) {
                if (strArr.length != 0) {
                    z2 = false;
                }
                if (!z2) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("cold boot mdl degrade: return raw url ");
                    sbLIZ.append(strArr[0]);
                    SimRadar.keyScan("CBOF", C2188811AlT.LIZIZ(sbLIZ), new Object[0]);
                    return strArr[0];
                }
            }
            return null;
        }
        if (this.LIZJ) {
            return this.LIZIZ.LJJIII(simVideoUrlModel, str, strArr);
        }
        try {
            this.LJ.await(((Long) C1474810oTv.LJLJJLL.getValue()).longValue(), TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        if (this.LIZJ) {
            return this.LIZIZ.LJJIII(simVideoUrlModel, str, strArr);
        }
        if (strArr == null) {
            return null;
        }
        return strArr[0];
    }

    public final boolean LJJLJLI(SimVideoUrlModel simVideoUrlModel, int i, C0NKB c0nkb) {
        return LJJLIIIJLJLI(simVideoUrlModel, i, c0nkb, null);
    }

    @Override // X.InterfaceC1482870ogv
    public final void LJIJ(final String str, final List list, final boolean z, final boolean z2) {
        LJJLIL(new Function0() { // from class: X.0olJ
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                DVideoPreloadManager dVideoPreloadManager = this.LL;
                List list2 = list;
                boolean z3 = z;
                boolean z4 = z2;
                dVideoPreloadManager.LIZIZ.LJIJ(str, list2, z3, z4);
                return Unit.LIZ;
            }
        });
    }

    @Override // X.InterfaceC1482870ogv
    public final boolean LJJLIIIJLJLI(SimVideoUrlModel simVideoUrlModel, int i, C0NKB c0nkb, C1475410oUt c1475410oUt) {
        return LJJLI(simVideoUrlModel, i, c0nkb, c1475410oUt, null, 0, null, 0);
    }

    @Override // X.InterfaceC1482870ogv
    public final void LJIIIZ(final String str, final String str2, final boolean z, final boolean z2, final InterfaceC1475840oVa interfaceC1475840oVa) {
        LJJLIL(new Function0() { // from class: X.0okj
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                DVideoPreloadManager dVideoPreloadManager = this.LL;
                dVideoPreloadManager.LIZIZ.LJIIIZ(str, str2, z, z2, interfaceC1475840oVa);
                return Unit.LIZ;
            }
        });
    }

    @Override // X.InterfaceC1482870ogv
    public final void LJIIL(final String str, final long j, final long j2, final int i, final byte[] bArr) {
        LJJLIL(new Function0() { // from class: X.0okk
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                DVideoPreloadManager dVideoPreloadManager = this.LL;
                dVideoPreloadManager.LIZIZ.LJIIL(str, j, j2, i, bArr);
                return Unit.LIZ;
            }
        });
    }

    @Override // X.InterfaceC1482870ogv
    public final void LJJIFFI(final SimVideoUrlModel simVideoUrlModel, final String str, final boolean z, final boolean z2, final InterfaceC1475840oVa interfaceC1475840oVa) {
        LJJLIL(new Function0() { // from class: X.0okg
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                DVideoPreloadManager dVideoPreloadManager = this.LL;
                dVideoPreloadManager.LIZIZ.LJJIFFI(simVideoUrlModel, str, z, z2, interfaceC1475840oVa);
                return Unit.LIZ;
            }
        });
    }

    @Override // X.InterfaceC1482870ogv
    public final void LJJJJJL(final SimVideoUrlModel simVideoUrlModel, final String str, final boolean z, final long j, final InterfaceC1475840oVa interfaceC1475840oVa) {
        LJJLIL(new Function0() { // from class: X.0okh
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                DVideoPreloadManager dVideoPreloadManager = this.LL;
                dVideoPreloadManager.LIZIZ.LJJJJJL(simVideoUrlModel, str, z, j, interfaceC1475840oVa);
                return Unit.LIZ;
            }
        });
    }

    @Override // X.InterfaceC1482870ogv
    public final boolean LJJLIIIIJ(SimVideoUrlModel simVideoUrlModel, int i, List list, int i2, List list2, int i3) {
        return LJJLI(simVideoUrlModel, i, C0NKB.LIZIZ, null, list, i2, list2, i3);
    }

    @Override // X.InterfaceC1482870ogv
    public final boolean LJJLI(final SimVideoUrlModel simVideoUrlModel, final int i, final C0NKB c0nkb, final C1475410oUt c1475410oUt, final List list, final int i2, final List list2, final int i3) {
        if (!C1475150oUT.LIZIZ(simVideoUrlModel) && (!((Boolean) C1474810oTv.LJLJJL.getValue()).booleanValue() || simVideoUrlModel == null || !simVideoUrlModel.hasVideoModel())) {
            return false;
        }
        LJJLIL(new Function0() { // from class: X.0okb
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String uri;
                int i4 = i;
                DVideoPreloadManager dVideoPreloadManager = this;
                SimVideoUrlModel simVideoUrlModel2 = simVideoUrlModel;
                C0NKD c0nkd = c0nkb;
                C1475410oUt c1475410oUt2 = c1475410oUt;
                List list3 = list;
                int i5 = i2;
                List list4 = list2;
                int i6 = i3;
                BPEAHandler bPEAHandler = DVideoPreloadManager.LJI;
                if (dVideoPreloadManager.LIZIZ.LJJJLZIJ(simVideoUrlModel2, Math.max(i4, 0), c0nkd, c1475410oUt2)) {
                    ConcurrentHashMap<String, Long> concurrentHashMap = dVideoPreloadManager.LIZLLL;
                    if (simVideoUrlModel2 == null || (uri = simVideoUrlModel2.getUri()) == null) {
                        uri = "";
                    }
                    concurrentHashMap.put(uri, 0L);
                }
                if (dVideoPreloadManager.LIZIZ.LJJLIIIJLJLI(i5, list3) && list3 != null && !list3.isEmpty()) {
                    Iterator it2 = list3.iterator();
                    while (it2.hasNext()) {
                        it2.next();
                    }
                }
                if (dVideoPreloadManager.LIZIZ.LJJLI(i6, list4) && list4 != null && !list4.isEmpty()) {
                    Iterator it3 = list4.iterator();
                    while (it3.hasNext()) {
                        it3.next();
                    }
                }
                return Unit.LIZ;
            }
        });
        return true;
    }
}
