package com.ss.android.ugc.aweme.ml.impl.har;

import X.AbstractC19994813Le;
import X.C09JN;
import X.C0C64;
import X.C0N82;
import X.C0NAL;
import X.C1510130pOt;
import X.C1510150pOv;
import X.C1510360pPG;
import X.C1511690pRP;
import X.C1511800pRa;
import X.C1511810pRb;
import X.C1511830pRd;
import X.C1511840pRe;
import X.C1511930pRn;
import X.C1511940pRo;
import X.C1511950pRp;
import X.C1512030pRx;
import X.C1512080pS2;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2214201BlK;
import X.C588890N7v;
import X.C786410Ut5;
import X.C844470XAv;
import X.InterfaceC1510430pPN;
import X.InterfaceC1511960pRq;
import X.InterfaceC1512050pRz;
import X.InterfaceC588340N5s;
import Y.ARunnableS92S0200000_23;
import android.content.Context;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.ml.ab.SmartHARExperiment;
import com.ss.android.ugc.aweme.ml.api.MLCommonService;
import com.ss.android.ugc.aweme.ml.api.SmartHARService;
import com.ss.android.ugc.aweme.ml.infra.PitayaMLConfig;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public final class SmartHARServiceImpl extends SmartHARService implements InterfaceC1512050pRz, InterfaceC588340N5s {
    public int LIZIZ;
    public boolean LIZJ;
    public long LIZLLL;
    public int LJ;
    public int LJFF;
    public int LJII;
    public boolean LJIIIZ;
    public boolean LJIIJ;
    public SmartHARExperiment.SmartHarModel LJIIJJI;
    public C1511800pRa LJIIL;
    public final int LJI = 8;
    public final int LJIIIIZZ = 5;
    public int LJIILIIL = -999;
    public final ArrayList<InterfaceC1510430pPN> LJIILJJIL = new ArrayList<>();

    public final void LIZIZ() {
        SmartHARExperiment.SmartHarModel smartHarModel;
        int i;
        if (this.LJIIJ || !enable()) {
            return;
        }
        boolean z = true;
        this.LJIIJ = true;
        C1511800pRa c1511800pRa = this.LJIIL;
        if (c1511800pRa == null || (smartHarModel = this.LJIIJJI) == null) {
            return;
        }
        SmartHARService.Companion.getClass();
        C1512080pS2.LIZ = SmartHARService.debug;
        C588890N7v.LIZ = true;
        C1511930pRn.LIZ = C1511950pRp.LIZ;
        C2214201BlK.LIZLLL().LJJLJLI(new C09JN() { // from class: X.0pRl
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("SmartHARServiceImpl@63c6.checkAndInitHarService$background$1");
                if (((Boolean) obj).booleanValue()) {
                    C1510360pPG.LIZ.LJIIZILJ();
                }
                C1C7U.LIZIZ("SmartHARServiceImpl@63c6.checkAndInitHarService$background$1");
            }
        });
        C1511940pRo c1511940pRo = new C1511940pRo();
        c1511940pRo.LIZIZ = smartHarModel.getOptSensorRegister();
        c1511940pRo.LIZ = smartHarModel.getRunContinuesGapMs();
        c1511940pRo.LIZJ = smartHarModel.getUseScreenStatus();
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        C1511810pRb c1511810pRb = C1512030pRx.LIZ;
        if (c1511810pRb.LIZ) {
            c1511810pRb.LIZJ.LIZ = System.currentTimeMillis();
        }
        C1511830pRd c1511830pRd = C1510360pPG.LIZ;
        c1511830pRd.getClass();
        if (C1512080pS2.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("HARService.init begin config:");
            sbLIZ.append(c1511940pRo);
            sbLIZ.append(" engine:");
            sbLIZ.append(c1511800pRa);
            sbLIZ.append(" hasInit:");
            sbLIZ.append(c1511830pRd.LJIILL);
            sbLIZ.append(" lastInitErrCode:");
            sbLIZ.append(c1511830pRd.LJIILLIIL);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        if (c1511830pRd.LJIILL) {
            i = c1511830pRd.LJIILLIIL;
        } else {
            try {
                long jCurrentTimeMillis = C1512080pS2.LIZ ? System.currentTimeMillis() : 0L;
                c1511830pRd.LJIILL = true;
                c1511830pRd.LJ = c1511940pRo;
                c1511830pRd.LIZLLL = c1511800pRa;
                C1511840pRe c1511840pRe = new C1511840pRe();
                c1511830pRd.LJIILJJIL = c1511840pRe;
                int iLIZIZ = c1511840pRe.LIZIZ(contextLIZ);
                C1511840pRe c1511840pRe2 = c1511830pRd.LJIILJJIL;
                if (c1511840pRe2.LLILLJJLI && c1511840pRe2.LLILLL == 0) {
                    long jCurrentTimeMillis2 = C1512080pS2.LIZ ? System.currentTimeMillis() : 0L;
                    c1511830pRd.LJIIJJI = new BPEAHandler(Looper.getMainLooper());
                    HandlerThread handlerThread = new HandlerThread("har-service");
                    c1511830pRd.LJIIL = handlerThread;
                    handlerThread.start();
                    c1511830pRd.LJIILIIL = new BPEAHandler(C786410Ut5.W2(c1511830pRd.LJIIL));
                    if (C1512080pS2.LIZ) {
                        long jCurrentTimeMillis3 = System.currentTimeMillis() - jCurrentTimeMillis2;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("HARService.init create handler cost:");
                        sbLIZ2.append(jCurrentTimeMillis3);
                        C2188811AlT.LIZIZ(sbLIZ2);
                    }
                    C1511840pRe c1511840pRe3 = c1511830pRd.LJIILJJIL;
                    c1511840pRe3.LLJIJIL = c1511830pRd.LJJ;
                    boolean z2 = c1511830pRd.LJ.LIZJ;
                    c1511830pRd.LJIJJLI = z2;
                    c1511840pRe3.LLJJ = z2;
                    long jCurrentTimeMillis4 = C1512080pS2.LIZ ? System.currentTimeMillis() : 0L;
                    c1511830pRd.LIZLLL.init();
                    if (C1512080pS2.LIZ) {
                        long jCurrentTimeMillis5 = System.currentTimeMillis() - jCurrentTimeMillis4;
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("HARService.init engine init cost:");
                        sbLIZ3.append(jCurrentTimeMillis5);
                        C2188811AlT.LIZIZ(sbLIZ3);
                    }
                    c1511830pRd.LJIILLIIL = 0;
                } else {
                    z = false;
                    c1511830pRd.LJIILLIIL = iLIZIZ;
                }
                if (C1512080pS2.LIZ) {
                    long jCurrentTimeMillis6 = System.currentTimeMillis() - jCurrentTimeMillis;
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("HARService.init end cost:");
                    sbLIZ4.append(jCurrentTimeMillis6);
                    sbLIZ4.append(" lastInitErrCode:");
                    sbLIZ4.append(c1511830pRd.LJIILLIIL);
                    sbLIZ4.append(" sensor.enable:");
                    sbLIZ4.append(z);
                    sbLIZ4.append(" useScreenStatus：");
                    sbLIZ4.append(c1511830pRd.LJIJJLI);
                    C2188811AlT.LIZIZ(sbLIZ4);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c1511830pRd.LJIILLIIL = -4;
                try {
                    c1511830pRd.LJIIZILJ();
                    synchronized (c1511830pRd.LJFF) {
                        try {
                            c1511830pRd.LJFF.clear();
                            BPEAHandler bPEAHandler = c1511830pRd.LJIILIIL;
                            if (bPEAHandler != null) {
                                bPEAHandler.removeCallbacksAndMessages(null);
                                c1511830pRd.LJIILIIL = null;
                            }
                            BPEAHandler bPEAHandler2 = c1511830pRd.LJIIJJI;
                            if (bPEAHandler2 != null) {
                                bPEAHandler2.removeCallbacksAndMessages(null);
                                c1511830pRd.LJIIJJI = null;
                            }
                            C1511840pRe c1511840pRe4 = c1511830pRd.LJIILJJIL;
                            if (c1511840pRe4 != null) {
                                c1511840pRe4.LIZLLL();
                                c1511830pRd.LJIILJJIL = null;
                            }
                            InterfaceC1511960pRq interfaceC1511960pRq = c1511830pRd.LIZLLL;
                            if (interfaceC1511960pRq != null) {
                                interfaceC1511960pRq.unInit();
                                c1511830pRd.LIZLLL = null;
                            }
                            HandlerThread handlerThread2 = c1511830pRd.LJIIL;
                            if (handlerThread2 != null) {
                                handlerThread2.quitSafely();
                                c1511830pRd.LJIIL = null;
                            }
                            c1511830pRd.LJ = null;
                            c1511830pRd.LJIILL = false;
                            c1511830pRd.LJIILLIIL = -999;
                        } finally {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                }
            }
            i = c1511830pRd.LJIILLIIL;
        }
        this.LJIILIIL = i;
        C1510360pPG.LIZ.LJIJ = smartHarModel.getUseSmooth();
        C1511810pRb c1511810pRb2 = C1512030pRx.LIZ;
        int i2 = this.LJIILIIL;
        if (c1511810pRb2.LIZ) {
            c1511810pRb2.LIZJ.LIZIZ = System.currentTimeMillis();
            int i3 = (int) (-1);
            c1511810pRb2.LIZLLL = i3;
            c1511810pRb2.LJ = i3;
            c1511810pRb2.LJFF = i2;
            if (AbstractC19994813Le.Default.nextFloat() < c1511810pRb2.LIZIZ) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(Scene.SCENE_SERVICE, "har_android");
                    jSONObject.put("sdk_duration", Float.valueOf(c1511810pRb2.LIZJ.LIZ()));
                    jSONObject.put("download_cost", c1511810pRb2.LIZLLL);
                    jSONObject.put("model_cost", c1511810pRb2.LJ);
                    jSONObject.put("sdk_success", c1511810pRb2.LJFF);
                } catch (JSONException e) {
                }
                C20684815ws.LJIJ("ml_scene_init", jSONObject);
            }
        }
        C1510360pPG.LIZ.LIZ(this);
        SmartHARService.Companion.getClass();
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartHARService, com.ss.android.ugc.aweme.ml.api.ISmartHARService
    public final void checkAndInit() {
        SmartHARExperiment.SmartHarModel smartHarModel;
        PitayaMLConfig pitayaMLConfig;
        if (this.LJIIIZ) {
            return;
        }
        this.LJIIIZ = true;
        if (!SmartHARExperiment.LIZ) {
            SmartHARExperiment.LIZIZ = (SmartHARExperiment.SmartHarModel) C0C64.LJIILLIIL().LJJII(SmartHARExperiment.SmartHarModel.class, null, "smart_har_ml", true);
            SmartHARExperiment.LIZ = true;
        }
        SmartHARExperiment.SmartHarModel smartHarModel2 = SmartHARExperiment.LIZIZ;
        if (smartHarModel2 != null) {
            C1511810pRb c1511810pRb = C1512030pRx.LIZ;
            c1511810pRb.LIZ = smartHarModel2.getEnableMonitor();
            c1511810pRb.LIZIZ = smartHarModel2.getReportTrackRate();
            this.LJIIJJI = smartHarModel2;
            if (smartHarModel2.getSkipCount() > 0 || smartHarModel2.getRunFeedGap() > 0 || smartHarModel2.getRunTimeGap() > 0) {
                MLCommonService.Companion.getClass();
                C0NAL.LIZ.addCommonEventListener("play_first_frame", this);
            }
            SmartHARExperiment.SmartHarModel smartHarModel3 = this.LJIIJJI;
            if (TextUtils.isEmpty(smartHarModel3 != null ? smartHarModel3.getMlSdkPackageUrl() : null) && ((smartHarModel = this.LJIIJJI) == null || (pitayaMLConfig = smartHarModel.getPitayaMLConfig()) == null || pitayaMLConfig.getBusinessName() == null)) {
                return;
            }
            this.LJIIL = new C1511800pRa(this.LJIIJJI);
        }
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartHARService, com.ss.android.ugc.aweme.ml.api.ISmartHARService
    public final boolean enable() {
        SmartHARExperiment.SmartHarModel smartHarModel = this.LJIIJJI;
        if (smartHarModel != null) {
            return smartHarModel.getEnable();
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartHARService
    public final Map<String, Float> getLastEnvResult() {
        C1511830pRd c1511830pRd = C1510360pPG.LIZ;
        c1511830pRd.getClass();
        if (C1512080pS2.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("HARService.getLastEnvResult result:");
            sbLIZ.append(c1511830pRd.LJII);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        C0N82 c0n82 = c1511830pRd.LJII;
        Map<String, Float> map = c0n82 != null ? c0n82.LIZLLL : null;
        SmartHARService.Companion.getClass();
        return map;
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartHARService
    public final int getLastEnvStatus() {
        C1511830pRd c1511830pRd = C1510360pPG.LIZ;
        c1511830pRd.getClass();
        if (C1512080pS2.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("HARService.getLastEnvIntStatus result:");
            sbLIZ.append(c1511830pRd.LJII);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        C0N82 c0n82 = c1511830pRd.LJII;
        int i = c0n82 != null ? c0n82.LIZ : 0;
        SmartHARService.Companion.getClass();
        return i;
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartHARService
    public final Map<String, Float> getLastOrientationResult() {
        C1511830pRd c1511830pRd = C1510360pPG.LIZ;
        c1511830pRd.getClass();
        if (C1512080pS2.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("HARService.getLastOrientationResult result:");
            sbLIZ.append(c1511830pRd.LJIIIIZZ);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        C0N82 c0n82 = c1511830pRd.LJIIIIZZ;
        Map<String, Float> map = c0n82 != null ? c0n82.LIZLLL : null;
        SmartHARService.Companion.getClass();
        return map;
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartHARService
    public final int getLastOrientationStatus() {
        C1511830pRd c1511830pRd = C1510360pPG.LIZ;
        c1511830pRd.getClass();
        if (C1512080pS2.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("HARService.getLastOrientationIntStatus result:");
            sbLIZ.append(c1511830pRd.LJIIIIZZ);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        C0N82 c0n82 = c1511830pRd.LJIIIIZZ;
        int i = c0n82 != null ? c0n82.LIZ : 0;
        SmartHARService.Companion.getClass();
        return i;
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartHARService, com.ss.android.ugc.aweme.ml.api.ISmartHARService
    public final Map<String, Float> getLastResult() {
        Map<String, Float> mapLJI = C1510360pPG.LIZ.LJI();
        SmartHARService.Companion.getClass();
        return mapLJI;
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartHARService
    public final Map<String, Float> getLastResultForAllTasks() {
        Map<String, Float> mapLJII = C1510360pPG.LIZ.LJII();
        SmartHARService.Companion.getClass();
        return mapLJII;
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartHARService, com.ss.android.ugc.aweme.ml.api.ISmartHARService
    public final int getLastStatus() {
        C1511830pRd c1511830pRd = C1510360pPG.LIZ;
        c1511830pRd.getClass();
        if (C1512080pS2.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("HARService.getLastIntStatus result:");
            sbLIZ.append(c1511830pRd.LJI);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        C0N82 c0n82 = c1511830pRd.LJI;
        int i = c0n82 != null ? c0n82.LIZ : 0;
        SmartHARService.Companion.getClass();
        return i;
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartHARService, com.ss.android.ugc.aweme.ml.api.ISmartHARService
    public final void addPredictListener(InterfaceC1510430pPN interfaceC1510430pPN) {
        SmartHARService.Companion.getClass();
        if (interfaceC1510430pPN != null) {
            synchronized (this.LJIILJJIL) {
                try {
                    if (!this.LJIILJJIL.contains(interfaceC1510430pPN)) {
                        this.LJIILJJIL.add(interfaceC1510430pPN);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartHARService
    public final String intStatusToName(int i) {
        return C588890N7v.LIZJ(String.valueOf(i));
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartHARService
    public final String intStringStatusToName(String str) {
        return C588890N7v.LIZJ(str);
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartHARService, com.ss.android.ugc.aweme.ml.api.ISmartHARService
    public final void removePredictListener(InterfaceC1510430pPN interfaceC1510430pPN) {
        SmartHARService.Companion.getClass();
        if (interfaceC1510430pPN != null) {
            synchronized (this.LJIILJJIL) {
                try {
                    if (this.LJIILJJIL.contains(interfaceC1510430pPN)) {
                        this.LJIILJJIL.remove(interfaceC1510430pPN);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    @Override // X.InterfaceC588340N5s
    public final void LIZJ(String str, C1510130pOt c1510130pOt) {
        String aid;
        String nickname;
        Aweme awemeLIZ;
        User author;
        Aweme awemeLIZ2;
        SmartHARService.Companion.getClass();
        String aid2 = null;
        if (SmartHARService.debug) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onEvent type:");
            sbLIZ.append(str);
            sbLIZ.append(" aweme:");
            if (c1510130pOt != null && (awemeLIZ2 = C1510150pOv.LIZ(c1510130pOt)) != null) {
                aid = awemeLIZ2.getAid();
            } else {
                aid = null;
            }
            sbLIZ.append(aid);
            sbLIZ.append('-');
            if (c1510130pOt != null && (awemeLIZ = C1510150pOv.LIZ(c1510130pOt)) != null && (author = awemeLIZ.getAuthor()) != null) {
                nickname = author.getNickname();
            } else {
                nickname = null;
            }
            sbLIZ.append(nickname);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        if (Intrinsics.LJFF(str, "play_first_frame") && c1510130pOt != null) {
            Aweme awemeLIZ3 = C1510150pOv.LIZ(c1510130pOt);
            if (awemeLIZ3 != null) {
                aid2 = awemeLIZ3.getAid();
            }
            triggerSmartHarPredict(aid2, false);
        }
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartHARService, com.ss.android.ugc.aweme.ml.api.ISmartHARService
    public final int getLastRangeMostStatus(int i, boolean z) {
        List<C0N82> listLJIIIZ = C1510360pPG.LIZ.LJIIIZ(i, z);
        int iLIZIZ = 0;
        if (listLJIIIZ != null && !listLJIIIZ.isEmpty()) {
            HashMap map = new HashMap();
            int size = listLJIIIZ.size();
            while (iLIZIZ < size) {
                Map<String, Float> map2 = ((C0N82) ListProtector.get(listLJIIIZ, iLIZIZ)).LIZLLL;
                if (map2 != null) {
                    for (Map.Entry<String, Float> entry : map2.entrySet()) {
                        if (entry != null) {
                            float fFloatValue = entry.getValue().floatValue();
                            Float f = (Float) map.get(entry.getKey());
                            if (f != null) {
                                fFloatValue += f.floatValue();
                            }
                            map.put(entry.getKey(), Float.valueOf(fFloatValue));
                        }
                    }
                }
                iLIZIZ++;
            }
            iLIZIZ = C588890N7v.LIZIZ(C588890N7v.LIZ(map));
        }
        if (C1512080pS2.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("HARService.getLastRangeMostIntStatus status:");
            sbLIZ.append(iLIZIZ);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        SmartHARService.Companion.getClass();
        return iLIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartHARService, com.ss.android.ugc.aweme.ml.api.ISmartHARService
    public final List<Integer> getLastRangeStatus(int i, boolean z) {
        ArrayList arrayList;
        List<C0N82> listLJIIIZ = C1510360pPG.LIZ.LJIIIZ(i, z);
        if (listLJIIIZ != null && !listLJIIIZ.isEmpty()) {
            arrayList = new ArrayList();
            int size = listLJIIIZ.size();
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                arrayList.add(Integer.valueOf(((C0N82) ListProtector.get(listLJIIIZ, i2)).LIZ));
                if (i2 < size - 1) {
                    i2++;
                }
            }
        } else {
            arrayList = null;
        }
        if (C1512080pS2.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("HARService.getLastRangeStatus out:");
            sbLIZ.append(arrayList);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        SmartHARService.Companion.getClass();
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartHARService, com.ss.android.ugc.aweme.ml.api.ISmartHARService
    public final boolean triggerSmartHarPredict(String str, boolean z) {
        boolean enable;
        SmartHARExperiment.SmartHarModel smartHarModel = this.LJIIJJI;
        SmartHARService.Companion.getClass();
        if (SmartHARService.debug) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("triggerSmartHarPredict enable:");
            if (smartHarModel != null) {
                enable = smartHarModel.getEnable();
            } else {
                enable = false;
            }
            sbLIZ.append(enable);
            sbLIZ.append(" aid");
            sbLIZ.append(str);
            sbLIZ.append(" envNotReadyTimes:");
            sbLIZ.append(this.LJFF);
            sbLIZ.append(" runFailTimes:");
            sbLIZ.append(this.LJII);
            sbLIZ.append(" skipTimes:");
            sbLIZ.append(this.LIZIZ);
            sbLIZ.append(" skipFeedCount:");
            sbLIZ.append(this.LJ);
            sbLIZ.append(" isRunning:");
            sbLIZ.append(this.LIZJ);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        if (!enable() || smartHarModel == null || ((str == null && !z) || this.LJFF >= this.LJI || this.LJII >= this.LJIIIIZZ || C2214201BlK.LJIIJJI)) {
            return false;
        }
        if (!z) {
            if (smartHarModel.getSkipCount() > 0 && this.LIZIZ < smartHarModel.getSkipCount()) {
                this.LIZIZ++;
                this.LJ++;
                return false;
            }
            if (smartHarModel.getRunTimeGap() > 0 && System.currentTimeMillis() - this.LIZLLL < smartHarModel.getRunTimeGap()) {
                this.LJ++;
                return false;
            }
            if (smartHarModel.getRunFeedGap() > 0 && this.LJ < smartHarModel.getRunFeedGap()) {
                this.LJ++;
                return false;
            }
        }
        if (smartHarModel.getRunMode() == 0) {
            C1511830pRd c1511830pRd = C1510360pPG.LIZ;
            c1511830pRd.getClass();
            if (C1512080pS2.LIZ) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("HARService.isPredicting:");
                sbLIZ2.append(c1511830pRd.LIZ);
                sbLIZ2.append(" oncePredicting:");
                sbLIZ2.append(c1511830pRd.LIZJ);
                C2188811AlT.LIZIZ(sbLIZ2);
            }
            if (c1511830pRd.LIZ || c1511830pRd.LIZJ) {
                return true;
            }
        }
        if (this.LIZJ) {
            return true;
        }
        this.LIZJ = true;
        this.LIZLLL = System.currentTimeMillis();
        this.LJ = 0;
        C1511690pRP.LIZJ(smartHarModel.getRunDelay(), new ARunnableS92S0200000_23(this, smartHarModel, 29));
        return true;
    }

    @Override // X.InterfaceC1512050pRz
    public final void LIZ(int i, boolean z, Map map) {
        int iLIZIZ;
        SmartHARService.Companion.getClass();
        if (SmartHARService.debug) {
            C1511830pRd c1511830pRd = C1510360pPG.LIZ;
            c1511830pRd.getClass();
            if (C1512080pS2.LIZ && c1511830pRd.LJIJJ != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("HARService.getLastSensorMeanValueArray sensorValueArray:");
                sbLIZ.append(Arrays.toString(c1511830pRd.LJIJJ));
                C2188811AlT.LIZIZ(sbLIZ);
            }
            if (c1511830pRd.LJIJJLI) {
                float[] fArr = c1511830pRd.LJIJJ;
            }
        }
        if (z) {
            iLIZIZ = C588890N7v.LIZIZ(C588890N7v.LIZ(map));
            C1512030pRx.LIZ.LIZ(i, iLIZIZ, map);
        } else {
            C1512030pRx.LIZ.LIZ(i, -2, map);
            iLIZIZ = 0;
        }
        if (!this.LJIILJJIL.isEmpty()) {
            synchronized (this.LJIILJJIL) {
                try {
                    int size = this.LJIILJJIL.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        InterfaceC1510430pPN interfaceC1510430pPN = this.LJIILJJIL.get(i2);
                        if (interfaceC1510430pPN != null) {
                            interfaceC1510430pPN.LIZ(iLIZIZ, z, map);
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }
}
