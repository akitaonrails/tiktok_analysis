package com.ss.android.ugc.aweme.ml.impl.ohr;

import X.AbstractC1513290pTz;
import X.AbstractC19994813Le;
import X.C01GW;
import X.C0C64;
import X.C0WZX;
import X.C1510730pPr;
import X.C1510980pQG;
import X.C1511270pQj;
import X.C1511670pRN;
import X.C1511690pRP;
import X.C1512480pSg;
import X.C1513230pTt;
import X.C1513240pTu;
import X.C1513250pTv;
import X.C1513270pTx;
import X.C1513280pTy;
import X.C1513300pU0;
import X.C1513350pU5;
import X.C1513380pU8;
import X.C1513390pU9;
import X.C1513420pUC;
import X.C1513430pUD;
import X.C1513440pUE;
import X.C1513480pUI;
import X.C1513490pUJ;
import X.C1513500pUK;
import X.C1513540pUO;
import X.C1BWL;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C2550309z3;
import X.C452501pT;
import X.C786410Ut5;
import X.InterfaceC1513310pU1;
import X.InterfaceC1513470pUH;
import X.InterfaceC1513560pUQ;
import X.InterfaceC1513600pUU;
import X.InterfaceC1513720pUg;
import Y.ARunnableS123S0100000_23;
import Y.ARunnableS92S0200000_23;
import android.app.Application;
import android.graphics.RectF;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.WindowManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pitaya.api.PTYTaskResultCallback;
import com.bytedance.pitaya.api.PitayaCoreFactory;
import com.bytedance.pitaya.api.bean.PTYError;
import com.bytedance.pitaya.api.bean.PTYPackageInfo;
import com.bytedance.pitaya.api.bean.PTYTaskConfig;
import com.bytedance.pitaya.api.bean.PTYTaskData;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.ml.ab.SmartOHRExperiment$SmartOhrModel;
import com.ss.android.ugc.aweme.ml.api.ISmartIdleDetectionService;
import com.ss.android.ugc.aweme.ml.api.PitayaFeatureCenterService;
import com.ss.android.ugc.aweme.ml.api.SmartIdleDetectionService;
import com.ss.android.ugc.aweme.ml.api.SmartOHRService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS212S0000000_23;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public final class SmartOHRServiceImpl implements SmartOHRService, InterfaceC1513600pUU {
    public static final /* synthetic */ int LJII = 0;
    public volatile boolean LIZIZ;
    public volatile float LIZLLL;
    public volatile float LJ;
    public volatile long LJFF;
    public final C1513380pU8 LIZ = new C1513380pU8();
    public final C01GW LIZJ = C452501pT.LIZIZ(AFwS212S0000000_23.get$arr$(95));
    public final Map<InterfaceC1513560pUQ, C1513430pUD> LJI = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.ml.api.SmartOHRService
    public final InterfaceC1513720pUg LIZIZ() {
        C1513490pUJ c1513490pUJ = this.LIZ.LJI;
        if (c1513490pUJ == null) {
            return null;
        }
        return new C1513390pU9(c1513490pUJ);
    }

    @Override // X.InterfaceC1513600pUU
    public final void LIZLLL() {
        final C1513380pU8 c1513380pU8 = this.LIZ;
        if (c1513380pU8.LIZIZ) {
            c1513380pU8.LIZ.start();
            C786410Ut5.LJJZZIII(c1513380pU8.LIZJ, new Runnable() { // from class: X.0pUB
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("OHRService@9671.startup$1");
                    try {
                        c1513380pU8.LIZLLL.LIZ(new C1513460pUG());
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("OHRService@9671.startup$1");
                }
            });
        }
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartOHRService
    public final float LJFF() {
        return this.LIZ.LJIIJJI;
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartOHRService
    public final float LJI() {
        return this.LIZ.LJIIL;
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartOHRService
    public final C1513300pU0 LJIIIZ() {
        C1513500pUK c1513500pUK = this.LIZ.LJIIIZ;
        Float fValueOf = c1513500pUK != null ? Float.valueOf(c1513500pUK.LIZJ) : null;
        C1513500pUK c1513500pUK2 = this.LIZ.LJIIIZ;
        Float fValueOf2 = c1513500pUK2 != null ? Float.valueOf(c1513500pUK2.LIZ) : null;
        C1513500pUK c1513500pUK3 = this.LIZ.LJIIIZ;
        Float fValueOf3 = c1513500pUK3 != null ? Float.valueOf(c1513500pUK3.LIZIZ) : null;
        if (fValueOf == null || fValueOf2 == null || fValueOf3 == null) {
            return null;
        }
        return new C1513300pU0(fValueOf.floatValue(), fValueOf2.floatValue(), fValueOf3.floatValue());
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartOHRService
    public final long LJIIJ() {
        return this.LIZ.LJIIJ;
    }

    /* JADX WARN: Type inference failed for: r0v33, types: [X.0pUP] */
    /* JADX WARN: Type inference failed for: r0v6, types: [X.0pUL] */
    @Override // X.InterfaceC1513600pUU
    public final void initialize() throws JSONException {
        final AbstractC1513290pTz c1511270pQj;
        if (this.LIZIZ) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (!C1513540pUO.LIZ) {
            SmartOHRExperiment$SmartOhrModel smartOHRExperiment$SmartOhrModel = (SmartOHRExperiment$SmartOhrModel) C0C64.LJIILLIIL().LJJII(SmartOHRExperiment$SmartOhrModel.class, null, "smart_ohr_service", true);
            C1513540pUO.LIZIZ = smartOHRExperiment$SmartOhrModel;
            if (smartOHRExperiment$SmartOhrModel != null) {
                C1513540pUO.LIZJ = smartOHRExperiment$SmartOhrModel.minInterval;
            }
            C1513540pUO.LIZ = true;
        }
        SmartOHRExperiment$SmartOhrModel smartOHRExperiment$SmartOhrModel2 = C1513540pUO.LIZIZ;
        if (smartOHRExperiment$SmartOhrModel2 != null && smartOHRExperiment$SmartOhrModel2.enabled) {
            C1513240pTu c1513240pTu = C1513240pTu.LIZ;
            boolean z = smartOHRExperiment$SmartOhrModel2.enableMonitor;
            c1513240pTu.getClass();
            C1513240pTu.LIZIZ = z;
            C1513240pTu.LIZJ = smartOHRExperiment$SmartOhrModel2.reportSampleRate;
            int i = smartOHRExperiment$SmartOhrModel2.engine;
            if (i == 1) {
                c1511270pQj = new C1511270pQj(smartOHRExperiment$SmartOhrModel2.model);
            } else {
                if (i != 2) {
                    return;
                }
                final String str = smartOHRExperiment$SmartOhrModel2.model;
                c1511270pQj = new AbstractC1513290pTz(str) { // from class: X.0pSg
                    public final String LIZJ;

                    @Override // X.AbstractC1513290pTz
                    public final void LIZLLL() {
                    }

                    @Override // X.AbstractC1513290pTz
                    public final void LJ() {
                    }

                    {
                        this.LIZJ = str;
                    }

                    @Override // X.AbstractC1513290pTz
                    public final void LIZJ(C1511310pQn c1511310pQn) throws JSONException {
                        float[] fArr = (float[]) c1511310pQn.LIZ;
                        final C238400w2 c238400w2 = new C238400w2();
                        c238400w2.element = SystemClock.uptimeMillis();
                        JSONObject jSONObject = new JSONObject();
                        JSONArray jSONArray = new JSONArray();
                        for (float f : fArr) {
                            jSONArray.put(Float.valueOf(f));
                        }
                        jSONObject.put("inputParams", jSONArray);
                        C844470XAv.LIZ.getClass();
                        PitayaCoreFactory.getCore(String.valueOf(C844470XAv.LJIIJ)).runTask(this.LIZJ, new PTYTaskData(jSONObject), new PTYTaskConfig(false, null, -1.0f), new PTYTaskResultCallback() { // from class: com.ss.android.ugc.aweme.ml.impl.ohr.OHRPitayaEngine$predict$2
                            @Override // com.bytedance.pitaya.api.PTYTaskResultCallback
                            public void onResult(boolean z2, PTYError pTYError, PTYTaskData pTYTaskData, PTYPackageInfo pTYPackageInfo) throws JSONException {
                                int code;
                                JSONObject jSONObjectOptJSONObject;
                                int i2;
                                JSONObject params;
                                C1513250pTv c1513250pTv;
                                Float fValueOf;
                                Float fValueOf2;
                                C1513300pU0 c1513300pU0LJIIIZ;
                                long jUptimeMillis2 = SystemClock.uptimeMillis() - c238400w2.element;
                                if (pTYTaskData != null) {
                                    pTYTaskData.getParams();
                                }
                                Float fValueOf3 = null;
                                if (C2550309z3.LIZ != 0) {
                                    SmartOHRService smartOHRService = C1513230pTt.LIZ;
                                    if (smartOHRService != null && (c1513300pU0LJIIIZ = smartOHRService.LJIIIZ()) != null) {
                                        fValueOf3 = Float.valueOf(c1513300pU0LJIIIZ.LIZ);
                                        fValueOf = Float.valueOf(c1513300pU0LJIIIZ.LIZIZ);
                                        fValueOf2 = Float.valueOf(c1513300pU0LJIIIZ.LIZJ);
                                    } else {
                                        fValueOf = null;
                                        fValueOf2 = null;
                                    }
                                    PitayaFeatureCenterService.Companion.getClass();
                                    C1510980pQG.LIZ.onSlideSpeedUpdate(fValueOf3, fValueOf, fValueOf2);
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("slide speed velocity=");
                                    sbLIZ.append(fValueOf3);
                                    sbLIZ.append(" slide speed velocityX=");
                                    sbLIZ.append(fValueOf);
                                    sbLIZ.append(" slide speed velocityY=");
                                    sbLIZ.append(fValueOf2);
                                    C2188811AlT.LIZIZ(sbLIZ);
                                }
                                if (z2 && pTYTaskData != null && pTYTaskData.getParams() != null) {
                                    if (pTYError != null) {
                                        code = pTYError.getCode();
                                    } else {
                                        code = 0;
                                    }
                                    C1513240pTu.LIZ.getClass();
                                    if (C1513240pTu.LIZIZ && (c1513250pTv = C1513240pTu.LIZLLL) != null) {
                                        c1513250pTv.LJFF = code;
                                        c1513250pTv.LIZLLL = jUptimeMillis2;
                                    }
                                    getClass();
                                    JSONObject jSONObject2 = new JSONObject();
                                    if (pTYTaskData != null && (params = pTYTaskData.getParams()) != null) {
                                        C786410Ut5.J3(jSONObject2.put("rst", params));
                                    }
                                    String strJ3 = C786410Ut5.J3(jSONObject2);
                                    C1512480pSg c1512480pSg = this;
                                    c1512480pSg.getClass();
                                    SystemClock.uptimeMillis();
                                    if (code == 0 && strJ3 != null) {
                                        try {
                                            JSONObject jSONObjectOptJSONObject2 = new JSONObject(strJ3).optJSONObject("rst");
                                            if (jSONObjectOptJSONObject2 != null && (jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("score_map")) != null) {
                                                C1513270pTx c1513270pTx = new C1513270pTx(0);
                                                Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                                                while (itKeys.hasNext()) {
                                                    String next = itKeys.next();
                                                    if (Intrinsics.LJFF(next, "left")) {
                                                        i2 = 1;
                                                    } else if (Intrinsics.LJFF(next, "right")) {
                                                        i2 = 2;
                                                    } else {
                                                        i2 = 0;
                                                    }
                                                    c1513270pTx.LIZ(new C1513280pTy((float) jSONObjectOptJSONObject.optDouble(next), next, i2));
                                                }
                                                long jUptimeMillis3 = SystemClock.uptimeMillis();
                                                C1513240pTu c1513240pTu2 = C1513240pTu.LIZ;
                                                C1513280pTy c1513280pTy = c1513270pTx.LIZIZ;
                                                int i3 = c1513280pTy.LIZ;
                                                float f2 = c1513280pTy.LIZJ;
                                                c1513240pTu2.getClass();
                                                C1513240pTu.LIZ(f2, 0, i3, jUptimeMillis3);
                                                InterfaceC1513310pU1 interfaceC1513310pU1 = c1512480pSg.LIZIZ;
                                                if (interfaceC1513310pU1 != null) {
                                                    interfaceC1513310pU1.LIZ(c1513270pTx);
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                        } catch (JSONException e) {
                                            TryCatchGuardChecker.doCheck(e);
                                            long jUptimeMillis4 = SystemClock.uptimeMillis();
                                            C1513240pTu.LIZ.getClass();
                                            C1513240pTu.LIZ(0.0f, -1, 0, jUptimeMillis4);
                                            return;
                                        }
                                    }
                                    C1513240pTu.LIZ(0.0f, -1, 0, SystemClock.uptimeMillis());
                                }
                            }
                        });
                    }
                };
            }
            C1513480pUI c1513480pUI = new C1513480pUI(new Object(c1511270pQj) { // from class: X.0pUL
            });
            if (C1513240pTu.LIZIZ) {
                c1513480pUI.LIZ = new Object() { // from class: X.0pUP
                };
            }
            c1513480pUI.LIZJ = smartOHRExperiment$SmartOhrModel2.sampleCount;
            c1513480pUI.LIZIZ = smartOHRExperiment$SmartOhrModel2.minInterval;
            final C1513380pU8 c1513380pU8 = this.LIZ;
            Application applicationLIZ = C1BWL.LIZ();
            if (!c1513380pU8.LIZIZ) {
                c1513380pU8.LJFF = c1513480pUI;
                c1513380pU8.LIZ = c1511270pQj;
                c1511270pQj.LIZIZ = new InterfaceC1513310pU1() { // from class: X.0pU7
                    @Override // X.InterfaceC1513310pU1
                    public final void LIZ(C1513270pTx c1513270pTx) {
                        boolean z2;
                        Object obj;
                        Object next;
                        float[] fArr;
                        C1513380pU8 c1513380pU82 = c1513380pU8;
                        c1513380pU82.getClass();
                        if (c1513270pTx.LIZ == 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2 && !Intrinsics.LJFF(c1513270pTx.LIZIZ, C1513280pTy.LIZLLL) && (fArr = c1513380pU82.LJIILIIL) != null) {
                            C1513590pUT c1513590pUT = c1513380pU82.LJ;
                            int i2 = c1513270pTx.LIZIZ.LIZ;
                            c1513590pUT.getClass();
                            if (i2 == 1 || i2 == 2) {
                                LinkedList<RectF> linkedList = c1513590pUT.LIZ[i2 - 1];
                                synchronized (linkedList) {
                                    try {
                                        linkedList.offerLast(c1513590pUT.LIZ(fArr));
                                        if (linkedList.size() > 15) {
                                            linkedList.removeFirst();
                                        }
                                    } catch (Throwable th) {
                                        TryCatchGuardChecker.doCheck(th);
                                        throw th;
                                    }
                                }
                            }
                        }
                        C1513380pU8 c1513380pU83 = c1513380pU8;
                        c1513380pU83.getClass();
                        int i3 = c1513270pTx.LIZIZ.LIZ;
                        Iterator it2 = ((ArrayList) c1513270pTx.LIZJ).iterator();
                        while (true) {
                            obj = null;
                            if (it2.hasNext()) {
                                next = it2.next();
                                if (((C1513280pTy) next).LIZ == 1) {
                                    break;
                                }
                            } else {
                                next = null;
                                break;
                            }
                        }
                        C1513280pTy c1513280pTy = (C1513280pTy) next;
                        if (c1513280pTy != null) {
                            float f = c1513280pTy.LIZJ;
                            Iterator it3 = ((ArrayList) c1513270pTx.LIZJ).iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    break;
                                }
                                Object next2 = it3.next();
                                if (((C1513280pTy) next2).LIZ == 2) {
                                    obj = next2;
                                    break;
                                }
                            }
                            C1513280pTy c1513280pTy2 = (C1513280pTy) obj;
                            if (c1513280pTy2 != null) {
                                float f2 = c1513280pTy2.LIZJ;
                                c1513270pTx.LIZIZ.getClass();
                                C1513490pUJ c1513490pUJ = new C1513490pUJ(i3, f, f2);
                                c1513380pU83.LJI = c1513490pUJ;
                                C786410Ut5.LJJZZIII(c1513380pU83.LIZJ, new ARunnableS92S0200000_23(c1513380pU83, c1513490pUJ, 96));
                            }
                        }
                    }
                };
                try {
                    DisplayMetrics displayMetrics = new DisplayMetrics();
                    Object objH2 = C786410Ut5.H2(applicationLIZ, "window");
                    if (objH2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.WindowManager");
                    }
                    C2204961BRm.LLILZIL((WindowManager) objH2, new C0WZX("dzBzEhEpEd/bVhkiSRuBaOjcKFPZ8MSfrT7p+Ak8a11zx3OUEtkckaO4onY=", null)).getMetrics(displayMetrics);
                    c1513380pU8.LJIILJJIL = displayMetrics.widthPixels;
                    c1513380pU8.LJIILL = displayMetrics.heightPixels;
                    c1513380pU8.LJIILLIIL = displayMetrics.density;
                    c1513380pU8.LIZIZ = true;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C1511670pRN.LIZIZ().LIZIZ();
                }
            }
            C1513240pTu.LIZ.getClass();
            if (C1513240pTu.LIZIZ) {
                long jUptimeMillis2 = SystemClock.uptimeMillis() - jUptimeMillis;
                if (C1513240pTu.LIZIZ && AbstractC19994813Le.Default.nextFloat() <= C1513240pTu.LIZJ) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(Scene.SCENE_SERVICE, "ohr_android");
                    jSONObject.put("sdk_duration", jUptimeMillis2);
                    C20684815ws.LJIJ("ml_scene_init", jSONObject);
                }
            }
            this.LIZIZ = true;
        }
    }

    @Override // X.InterfaceC1513600pUU
    public final void shutdown() {
        C1513380pU8 c1513380pU8 = this.LIZ;
        if (c1513380pU8.LIZIZ) {
            C786410Ut5.LJJZZIII(c1513380pU8.LIZJ, new ARunnableS123S0100000_23(c1513380pU8, 151));
            c1513380pU8.LIZ.stop();
        }
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartOHRService
    public final long LJ() {
        return this.LJFF;
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartOHRService
    public final float LJII() {
        return this.LIZLLL;
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartOHRService
    public final float LJIIIIZZ() {
        return this.LJ;
    }

    @Override // X.InterfaceC1513600pUU
    public final void LIZ(MotionEvent motionEvent) {
        long j;
        int i;
        boolean z = ((C1513420pUC) this.LIZJ.getValue()).LIZLLL;
        C1513420pUC c1513420pUC = (C1513420pUC) this.LIZJ.getValue();
        c1513420pUC.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 2 && !c1513420pUC.LIZLLL) {
                float fAbs = Math.abs(motionEvent.getX() - c1513420pUC.LIZIZ);
                float fAbs2 = Math.abs(motionEvent.getY() - c1513420pUC.LIZJ);
                float f = c1513420pUC.LIZ;
                if (fAbs > f || fAbs2 > f) {
                    c1513420pUC.LIZLLL = true;
                }
            }
        } else {
            c1513420pUC.LIZIZ = motionEvent.getX();
            c1513420pUC.LIZJ = motionEvent.getY();
            c1513420pUC.LIZLLL = false;
        }
        if (!z && ((C1513420pUC) this.LIZJ.getValue()).LIZLLL) {
            this.LIZLLL = ((C1513420pUC) this.LIZJ.getValue()).LIZIZ;
            this.LJ = ((C1513420pUC) this.LIZJ.getValue()).LIZJ;
        }
        final C1513380pU8 c1513380pU8 = this.LIZ;
        if (c1513380pU8.LIZIZ) {
            if (motionEvent.getPointerCount() > 1) {
                c1513380pU8.LJII = null;
                return;
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j2 = jElapsedRealtime - c1513380pU8.LJIIIIZZ;
            C1513480pUI c1513480pUI = c1513380pU8.LJFF;
            if (c1513480pUI != null) {
                j = c1513480pUI.LIZIZ;
            } else {
                j = Mp4ScreenVideoLoadTimeout.CONTROL;
            }
            if (j2 < j) {
                return;
            }
            if (motionEvent.getAction() == 0) {
                c1513380pU8.LJII = new LinkedList();
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                c1513380pU8.LJIIJ = SystemClock.elapsedRealtime();
                c1513380pU8.LJIIJJI = x;
                c1513380pU8.LJIIL = y;
            }
            final List<C1513350pU5> list = c1513380pU8.LJII;
            if (list == null) {
                return;
            }
            int historySize = motionEvent.getHistorySize();
            for (int i2 = 0; i2 < historySize; i2++) {
                ((LinkedList) list).add(new C1513350pU5(motionEvent.getHistoricalX(i2), motionEvent.getHistoricalY(i2), motionEvent.getHistoricalEventTime(i2)));
            }
            LinkedList linkedList = (LinkedList) list;
            linkedList.add(new C1513350pU5(motionEvent.getX(), motionEvent.getY(), motionEvent.getEventTime()));
            if (motionEvent.getAction() != 1) {
                return;
            }
            int size = linkedList.size();
            C1513480pUI c1513480pUI2 = c1513380pU8.LJFF;
            if (c1513480pUI2 != null) {
                i = c1513480pUI2.LIZJ;
            } else {
                i = 9;
            }
            if (size < i) {
                return;
            }
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            float f2 = x2 - c1513380pU8.LJIIJJI;
            float f3 = y2 - c1513380pU8.LJIIL;
            long jElapsedRealtime2 = SystemClock.elapsedRealtime() - c1513380pU8.LJIIJ;
            if (jElapsedRealtime2 > 10) {
                float f4 = LSPassThroughRecordSizeConfig.DEFAULT;
                float f5 = jElapsedRealtime2;
                c1513380pU8.LJIIIZ = new C1513500pUK(Math.abs((f2 * f4) / f5), Math.abs((f3 * f4) / f5), Math.abs((((float) Math.sqrt((f2 * f2) + (f3 * f3))) * f4) / f5));
            }
            c1513380pU8.LJIIIIZZ = jElapsedRealtime;
            C1511690pRP.LIZJ(100L, new Runnable() { // from class: X.0pU4
                public final void LIZ() {
                    C1513250pTv c1513250pTv;
                    C1513380pU8 c1513380pU82 = c1513380pU8;
                    List list2 = list;
                    if (!c1513380pU82.LIZIZ) {
                        if (C1511670pRN.LIZ) {
                            C1511670pRN.LIZJ("ohr", "service hasn't initialized", null);
                            return;
                        }
                        return;
                    }
                    if (!c1513380pU82.LIZ.LIZ()) {
                        if (C1511670pRN.LIZ) {
                            C1511670pRN.LIZ("ohr", "engine hasn't started");
                            return;
                        }
                        return;
                    }
                    boolean z2 = C1511670pRN.LIZ;
                    if (z2) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("feedData, dataList.size=");
                        sbLIZ.append(list2.size());
                        C1511670pRN.LIZ("ohr", C2188811AlT.LIZIZ(sbLIZ));
                    }
                    if (!list2.isEmpty()) {
                        int size2 = list2.size();
                        C1513480pUI c1513480pUI3 = c1513380pU82.LJFF;
                        if (size2 >= (c1513480pUI3 != null ? c1513480pUI3.LIZJ : 9)) {
                            long jUptimeMillis = SystemClock.uptimeMillis();
                            long j3 = ((C1513350pU5) C13LP.LJJJJZI(list2)).LIZJ;
                            float size3 = list2.size();
                            C1513480pUI c1513480pUI4 = c1513380pU82.LJFF;
                            float f6 = size3 / (c1513480pUI4 != null ? c1513480pUI4.LIZJ : 9);
                            float[] fArr = c1513380pU82.LJIILIIL;
                            int i3 = (c1513480pUI4 != null ? c1513480pUI4.LIZJ : 9) * 6;
                            if (fArr == null || fArr.length != i3) {
                                fArr = new float[i3];
                                c1513380pU82.LJIILIIL = fArr;
                            }
                            int i4 = c1513480pUI4 != null ? c1513480pUI4.LIZJ : 9;
                            for (int i5 = 0; i5 < i4; i5++) {
                                C1513350pU5 c1513350pU5 = (C1513350pU5) ListProtector.get(list2, (int) (i5 * f6));
                                int i6 = i5 * 6;
                                fArr[i6] = c1513350pU5.LIZ;
                                fArr[i6 + 1] = c1513350pU5.LIZIZ;
                                fArr[i6 + 2] = c1513350pU5.LIZJ - j3;
                                fArr[i6 + 3] = c1513380pU82.LJIILJJIL;
                                fArr[i6 + 4] = c1513380pU82.LJIILL;
                                fArr[i6 + 5] = c1513380pU82.LJIILLIIL;
                            }
                            C1513480pUI c1513480pUI5 = c1513380pU82.LJFF;
                            if (c1513480pUI5 != null && c1513480pUI5.LIZ != null) {
                                list2.size();
                                long j4 = jUptimeMillis - j3;
                                long jUptimeMillis2 = SystemClock.uptimeMillis() - jUptimeMillis;
                                C1513240pTu.LIZ.getClass();
                                if (C1513240pTu.LIZIZ) {
                                    C1513250pTv c1513250pTv2 = new C1513250pTv();
                                    C1513240pTu.LIZLLL = c1513250pTv2;
                                    c1513250pTv2.LIZ = jUptimeMillis;
                                    c1513250pTv2.LIZIZ = j4;
                                }
                                if (C1513240pTu.LIZIZ && (c1513250pTv = C1513240pTu.LIZLLL) != null) {
                                    c1513250pTv.LIZJ = jUptimeMillis2;
                                }
                            }
                            c1513380pU82.LIZ.LIZIZ(new C1511310pQn(fArr));
                            return;
                        }
                    }
                    if (z2) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("sample not enough, dataList.size=");
                        sbLIZ2.append(list2.size());
                        C1511670pRN.LIZ("ohr", C2188811AlT.LIZIZ(sbLIZ2));
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("OHRService@9671.feedData$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("OHRService@9671.feedData$1");
                }
            });
        }
    }

    @Override // X.InterfaceC1513600pUU
    public final void LIZJ(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.LJFF = SystemClock.elapsedRealtime();
            SmartIdleDetectionService.Companion.getClass();
            C1510730pPr.LIZ.getClass();
            ISmartIdleDetectionService iSmartIdleDetectionService = C1510730pPr.LIZIZ;
            if (iSmartIdleDetectionService != null) {
                iSmartIdleDetectionService.onUserInteraction();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.ml.api.SmartOHRService
    public final boolean LJIIJJI(final C1513440pUE c1513440pUE) {
        if (this.LJI.containsKey(c1513440pUE)) {
            return true;
        }
        InterfaceC1513470pUH interfaceC1513470pUH = new InterfaceC1513470pUH(c1513440pUE) { // from class: X.0pUD
            public final InterfaceC1513560pUQ LIZIZ;

            {
                this.LIZIZ = c1513440pUE;
            }

            @Override // X.InterfaceC1513470pUH
            public final void LIZ(int i) {
                this.LIZIZ.LIZ(i);
            }

            @Override // X.InterfaceC1513470pUH
            public final void LIZIZ(C1513490pUJ c1513490pUJ) {
                this.LIZIZ.LIZIZ(new C1513390pU9(c1513490pUJ));
            }
        };
        this.LJI.put(c1513440pUE, (C1513430pUD) interfaceC1513470pUH);
        this.LIZ.LIZLLL.LIZ.add(interfaceC1513470pUH);
        return true;
    }
}
