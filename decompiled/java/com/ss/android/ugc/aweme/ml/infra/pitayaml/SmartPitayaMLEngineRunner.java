package com.ss.android.ugc.aweme.ml.infra.pitayaml;

import X.AbstractC1511520pR8;
import X.C0NTS;
import X.C1337780kuu;
import X.C1509310pNZ;
import X.C1510230pP3;
import X.C1511360pQs;
import X.C1511500pR6;
import X.C1511670pRN;
import X.C1512100pS4;
import X.C1513060pTc;
import X.C2188811AlT;
import X.C259800zU;
import X.C844470XAv;
import X.InterfaceC1511740pRU;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.pitaya.api.IPitayaCore;
import com.bytedance.pitaya.api.PTYPackageCallback;
import com.bytedance.pitaya.api.PTYTaskResultCallback;
import com.bytedance.pitaya.api.PitayaCoreFactory;
import com.bytedance.pitaya.api.bean.PTYError;
import com.bytedance.pitaya.api.bean.PTYPackageInfo;
import com.bytedance.pitaya.api.bean.PTYTaskConfig;
import com.bytedance.pitaya.api.bean.PTYTaskData;
import com.bytedance.pitaya.api.mutilinstance.HostSetupListener;
import com.bytedance.pitaya.api.mutilinstance.HostSetupWatcher;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ml.infra.PitayaMLConfig;
import com.ss.android.ugc.aweme.ml.infra.SmartSceneConfig;
import com.ss.android.ugc.aweme.ml.infra.SmartSdkConfig;
import com.ss.ugc.clientai.core.api.FeatureProducer;
import com.ss.ugc.clientai.core.api.FeatureServiceManager;
import com.ss.ugc.clientai.core.api.meta.ReturnCode;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public final class SmartPitayaMLEngineRunner extends AbstractC1511520pR8 {
    public boolean LIZJ;
    public long LIZLLL;
    public final boolean LJ;
    public final String LJFF;
    public final String LJI;
    public final String LJII;
    public final C1513060pTc LJIIIIZZ;

    @Override // X.AbstractC1511520pR8
    public final boolean LJIIJ() {
        return true;
    }

    @Override // X.AbstractC1511520pR8
    public final boolean LIZ() {
        return this.LJIIIIZZ.LIZ();
    }

    @Override // X.AbstractC1511520pR8
    public final boolean LIZJ() {
        return !TextUtils.isEmpty(this.LJFF);
    }

    @Override // X.AbstractC1511520pR8
    public final boolean LIZLLL() {
        if (!this.LIZJ) {
            this.LIZJ = LIZJ() && PitayaCoreFactory.getCore(this.LJII).isReady();
        }
        boolean z = C1511670pRN.LIZ;
        return this.LIZJ;
    }

    @Override // X.AbstractC1511520pR8
    public final void LJFF() {
        final String str = this.LJFF;
        if (str != null && LIZLLL()) {
            IPitayaCore core = PitayaCoreFactory.getCore(this.LJII);
            PTYTaskConfig pTYTaskConfig = new PTYTaskConfig(false, null, -1.0f);
            pTYTaskConfig.setCallType(13);
            core.runTask(str, null, pTYTaskConfig, new PTYTaskResultCallback() { // from class: com.ss.android.ugc.aweme.ml.infra.pitayaml.SmartPitayaMLEngineRunner$preloadEnv$2
                @Override // com.bytedance.pitaya.api.PTYTaskResultCallback
                public void onResult(boolean z, PTYError pTYError, PTYTaskData pTYTaskData, PTYPackageInfo pTYPackageInfo) {
                }
            });
        }
    }

    @Override // X.AbstractC1511520pR8
    public final void LJII() {
        final String str = this.LJFF;
        if (str == null) {
            return;
        }
        IPitayaCore core = PitayaCoreFactory.getCore(this.LJII);
        PTYTaskConfig pTYTaskConfig = new PTYTaskConfig(true, null, -1.0f);
        pTYTaskConfig.setCallType(16);
        core.runTask(str, null, pTYTaskConfig, new PTYTaskResultCallback() { // from class: com.ss.android.ugc.aweme.ml.infra.pitayaml.SmartPitayaMLEngineRunner$releaseModel$2
            @Override // com.bytedance.pitaya.api.PTYTaskResultCallback
            public void onResult(boolean z, PTYError pTYError, PTYTaskData pTYTaskData, PTYPackageInfo pTYPackageInfo) {
            }
        });
    }

    @Override // X.AbstractC1511520pR8
    public final boolean LJ() {
        return LIZLLL();
    }

    public static JSONObject LJIIL(C1509310pNZ c1509310pNZ) throws JSONException {
        JSONObject jSONObject;
        SystemClock.uptimeMillis();
        if (c1509310pNZ == null) {
            return new JSONObject();
        }
        Object obj = c1509310pNZ.LJIIIIZZ;
        if (obj instanceof JSONObject) {
            jSONObject = (JSONObject) obj;
        } else {
            jSONObject = new JSONObject();
        }
        Map<String, Object> map = c1509310pNZ.LJ;
        if (map != null) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                jSONObject.put(entry.getKey(), JSONObject.wrap(entry.getValue()));
            }
        }
        float[] fArr = c1509310pNZ.LJI;
        if (fArr != null) {
            JSONArray jSONArray = new JSONArray();
            for (float f : fArr) {
                jSONArray.put(Float.valueOf(f));
            }
            jSONObject.put("inputParams", fArr);
        }
        Map<String, Object> map2 = c1509310pNZ.LJFF;
        if (map2 != null) {
            for (Map.Entry<String, Object> entry2 : map2.entrySet()) {
                jSONObject.put(entry2.getKey(), JSONObject.wrap(entry2.getValue()));
            }
        }
        return jSONObject;
    }

    @Override // X.AbstractC1511520pR8
    public final void LIZIZ(final InterfaceC1511740pRU interfaceC1511740pRU) {
        HostSetupWatcher.INSTANCE.registerHostSetupListener(new HostSetupListener() { // from class: com.ss.android.ugc.aweme.ml.infra.pitayaml.SmartPitayaMLEngineRunner$downloadModel$hostSetupListener$1
            @Override // com.bytedance.pitaya.api.mutilinstance.HostSetupListener
            public void onHostSetup(boolean z) {
                SmartPitayaMLEngineRunner smartPitayaMLEngineRunner = this.this$0;
                final String str = smartPitayaMLEngineRunner.LJFF;
                if (str == null) {
                    return;
                }
                IPitayaCore core = PitayaCoreFactory.getCore(smartPitayaMLEngineRunner.LJII);
                final SmartPitayaMLEngineRunner smartPitayaMLEngineRunner2 = this.this$0;
                final InterfaceC1511740pRU interfaceC1511740pRU2 = interfaceC1511740pRU;
                core.queryPackage(str, new PTYPackageCallback() { // from class: com.ss.android.ugc.aweme.ml.infra.pitayaml.SmartPitayaMLEngineRunner$downloadModel$hostSetupListener$1$onHostSetup$1
                    @Override // com.bytedance.pitaya.api.PTYPackageCallback
                    public void onResult(boolean z2, PTYError pTYError, PTYPackageInfo pTYPackageInfo) {
                        if (!z2) {
                            IPitayaCore core2 = PitayaCoreFactory.getCore(smartPitayaMLEngineRunner2.LJII);
                            final String str2 = str;
                            final InterfaceC1511740pRU interfaceC1511740pRU3 = interfaceC1511740pRU2;
                            final SmartPitayaMLEngineRunner smartPitayaMLEngineRunner3 = smartPitayaMLEngineRunner2;
                            core2.downloadPackage(str2, new PTYPackageCallback() { // from class: com.ss.android.ugc.aweme.ml.infra.pitayaml.SmartPitayaMLEngineRunner$downloadModel$hostSetupListener$1$onHostSetup$1$onResult$1
                                @Override // com.bytedance.pitaya.api.PTYPackageCallback
                                public void onResult(boolean z3, PTYError pTYError2, PTYPackageInfo pTYPackageInfo2) {
                                    int code;
                                    InterfaceC1511740pRU interfaceC1511740pRU4 = interfaceC1511740pRU3;
                                    C1512100pS4 c1512100pS4 = new C1512100pS4((Object) null);
                                    if (pTYError2 != null) {
                                        code = pTYError2.getCode();
                                    } else {
                                        code = 0;
                                    }
                                    c1512100pS4.LIZ = code;
                                    interfaceC1511740pRU4.LIZ(c1512100pS4);
                                }
                            });
                            return;
                        }
                        InterfaceC1511740pRU interfaceC1511740pRU4 = interfaceC1511740pRU2;
                        C1512100pS4 c1512100pS4 = new C1512100pS4((Object) null);
                        c1512100pS4.LIZ = 0;
                        interfaceC1511740pRU4.LIZ(c1512100pS4);
                    }
                });
                HostSetupWatcher.INSTANCE.unregisterHostSetupListener(this);
            }
        });
    }

    @Override // X.AbstractC1511520pR8
    public final void LJI(JSONObject jSONObject) throws JSONException {
        jSONObject.put("sdk_duration", this.LIZLLL);
        jSONObject.put("engine_type", 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1511520pR8
    public final C1512100pS4 LJIIIZ(C1509310pNZ c1509310pNZ) {
        final C259800zU c259800zU = new C259800zU();
        LJIIJJI(c1509310pNZ, new InterfaceC1511740pRU() { // from class: X.0pSh
            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.InterfaceC1511740pRU
            public final void LIZ(C1512100pS4 c1512100pS4) {
                c259800zU.element = c1512100pS4;
            }
        });
        return (C1512100pS4) c259800zU.element;
    }

    public SmartPitayaMLEngineRunner(String str, C1510230pP3 c1510230pP3) {
        boolean enabledFetcher;
        SmartSdkConfig sdkConfig;
        PitayaMLConfig pitayaMLConfig;
        super(str, c1510230pP3);
        SmartSceneConfig smartSceneConfigLIZJ = C1511360pQs.LIZJ(c1510230pP3);
        if (smartSceneConfigLIZJ != null && (sdkConfig = smartSceneConfigLIZJ.getSdkConfig()) != null && (pitayaMLConfig = sdkConfig.getPitayaMLConfig()) != null) {
            enabledFetcher = pitayaMLConfig.getEnabledFetcher();
        } else {
            enabledFetcher = false;
        }
        this.LJ = enabledFetcher;
        this.LJFF = C1511360pQs.LIZIZ(c1510230pP3);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ml#");
        sbLIZ.append(str);
        this.LJI = C2188811AlT.LIZIZ(sbLIZ);
        C844470XAv.LIZ.getClass();
        this.LJII = String.valueOf(C844470XAv.LJIIJ);
        this.LJIIIIZZ = new C1513060pTc(c1510230pP3);
    }

    @Override // X.AbstractC1511520pR8
    public final void LJIIIIZZ(C1509310pNZ c1509310pNZ, C1511500pR6 c1511500pR6) {
        LJIIJJI(c1509310pNZ, c1511500pR6);
    }

    /* JADX WARN: Not initialized variable reg: 13, insn: 0x008d: INVOKE (r13 I:X.0pRU), (r12 I:X.0pS4) INTERFACE call: X.0pRU.LIZ(X.0pS4):void A[MD:(X.0pS4):void (m)] (LINE:33554573), block:B:26:0x0082 */
    public final void LJIIJJI(final C1509310pNZ c1509310pNZ, final InterfaceC1511740pRU interfaceC1511740pRU) {
        InterfaceC1511740pRU interfaceC1511740pRULIZ;
        final long jCurrentTimeMillis;
        PTYTaskData pTYTaskData;
        final C1512100pS4 c1512100pS4 = new C1512100pS4((Object) null);
        try {
            this.LIZLLL = -1L;
            String str = this.LJFF;
            if (str == null) {
                c1512100pS4.LIZ = -1;
                interfaceC1511740pRU.LIZ(c1512100pS4);
                return;
            }
            if (this.LJIIIIZZ.LIZ()) {
                this.LJIIIIZZ.LIZIZ(c1509310pNZ, c1512100pS4);
                interfaceC1511740pRU.LIZ(c1512100pS4);
                return;
            }
            if (!LIZLLL()) {
                boolean z = C1511670pRN.LIZ;
                c1512100pS4.LIZ = -2;
                interfaceC1511740pRU.LIZ(c1512100pS4);
                return;
            }
            if (C1511670pRN.LIZ) {
                jCurrentTimeMillis = System.currentTimeMillis();
            } else {
                jCurrentTimeMillis = 0;
            }
            if (this.LJ) {
                pTYTaskData = new PTYTaskData(null);
                final String str2 = this.LJI;
                pTYTaskData.setDataFetcher(new C0NTS(str2, c1509310pNZ) { // from class: X.0NTR
                    public final C1509310pNZ LIZ;
                    public final String LIZIZ;
                    public final FeatureProducer LIZJ;

                    {
                        this.LIZ = c1509310pNZ;
                        this.LIZIZ = str2;
                        FeatureServiceManager.Companion.getClass();
                        this.LIZJ = FeatureServiceManager.getProducer$default(C1510050pOl.LIZ(), "static", 0, 2, null);
                    }

                    @Override // X.C0NTS
                    public final String[] LIZ(String str3, String[] strArr) {
                        String string;
                        FeatureProducer featureProducer;
                        if (this.LIZ == null) {
                            return null;
                        }
                        SystemClock.uptimeMillis();
                        int length = strArr.length;
                        String[] strArr2 = new String[length];
                        for (int i = 0; i < length; i++) {
                            strArr2[i] = str3;
                        }
                        int length2 = strArr.length;
                        for (int i2 = 0; i2 < length2; i2++) {
                            String strLIZ = C603480Nli.LIZ(strArr[i2], this.LIZ);
                            if (strLIZ != null || ((featureProducer = this.LIZJ) != null && (strLIZ = FeatureProducer.getFeature$default(featureProducer, strArr[i2], (JSONObject) null, this.LIZIZ, (ReturnCode) null, 10, (Object) null)) != null)) {
                                if (strLIZ instanceof String) {
                                    string = strLIZ;
                                } else if (strLIZ instanceof Number) {
                                    string = strLIZ.toString();
                                } else if (strLIZ instanceof Boolean) {
                                    if (((Boolean) strLIZ).booleanValue()) {
                                        string = "true";
                                    } else {
                                        string = "false";
                                    }
                                } else {
                                    string = str3;
                                }
                                strArr2[i2] = string;
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("DataFetcherImpl fetchAsString ");
                                sbLIZ.append(strArr[i2]);
                                sbLIZ.append(" : ");
                                sbLIZ.append(strArr2[i2]);
                                sbLIZ.append(", org: ");
                                sbLIZ.append((Object) strLIZ);
                                sbLIZ.append(", default:");
                                sbLIZ.append(str3);
                                C2188811AlT.LIZIZ(sbLIZ);
                            }
                        }
                        return strArr2;
                    }

                    @Override // X.C0NTS
                    public final double[] LIZIZ(String[] strArr, double d) {
                        double dDoubleValue;
                        double d2;
                        if (this.LIZ == null) {
                            return null;
                        }
                        SystemClock.uptimeMillis();
                        ArrayList arrayList = new ArrayList();
                        int length = strArr.length;
                        for (int i = 0; i < length; i++) {
                            Object objLIZ = C603480Nli.LIZ(strArr[i], this.LIZ);
                            if (objLIZ == null) {
                                FeatureProducer featureProducer = this.LIZJ;
                                if (featureProducer != null) {
                                    objLIZ = FeatureProducer.getFeature$default(featureProducer, strArr[i], (JSONObject) null, this.LIZIZ, (ReturnCode) null, 10, (Object) null);
                                } else {
                                    objLIZ = null;
                                }
                            }
                            if (objLIZ instanceof Number) {
                                arrayList.add(Double.valueOf(((Number) objLIZ).doubleValue()));
                            } else if (objLIZ instanceof Boolean) {
                                if (((Boolean) objLIZ).booleanValue()) {
                                    d2 = 1.0d;
                                } else {
                                    d2 = 0.0d;
                                }
                                arrayList.add(Double.valueOf(d2));
                            } else if (objLIZ instanceof String) {
                                Double dLJII = C2327809Ae.LJII((String) objLIZ);
                                if (dLJII != null) {
                                    dDoubleValue = dLJII.doubleValue();
                                } else {
                                    dDoubleValue = d;
                                }
                                arrayList.add(Double.valueOf(dDoubleValue));
                            } else if (objLIZ instanceof int[]) {
                                int length2 = ((int[]) objLIZ).length;
                                for (int i2 = 0; i2 < length2; i2++) {
                                    arrayList.add(Double.valueOf(r12[i2]));
                                }
                            } else if (objLIZ instanceof float[]) {
                                int length3 = ((float[]) objLIZ).length;
                                for (int i3 = 0; i3 < length3; i3++) {
                                    arrayList.add(Double.valueOf(r12[i3]));
                                }
                            } else if (objLIZ instanceof double[]) {
                                for (double d3 : (double[]) objLIZ) {
                                    arrayList.add(Double.valueOf(d3));
                                }
                            } else if (objLIZ instanceof Object[]) {
                                for (Object obj : (Object[]) objLIZ) {
                                    if (obj instanceof Number) {
                                        arrayList.add(Double.valueOf(((Number) obj).doubleValue()));
                                    }
                                }
                            } else if (objLIZ instanceof List) {
                                for (Object obj2 : (List) objLIZ) {
                                    if (obj2 instanceof Number) {
                                        arrayList.add(Double.valueOf(((Number) obj2).doubleValue()));
                                    }
                                }
                            } else if (objLIZ instanceof JSONArray) {
                                JSONArray jSONArray = (JSONArray) objLIZ;
                                int length4 = jSONArray.length();
                                for (int i4 = 0; i4 < length4; i4++) {
                                    arrayList.add(Double.valueOf(jSONArray.optDouble(i4, d)));
                                }
                            } else {
                                arrayList.add(Double.valueOf(d));
                            }
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("DataFetcherImpl fetchAsNumber ");
                            sbLIZ.append(strArr[i]);
                            sbLIZ.append(" : ");
                            sbLIZ.append(objLIZ);
                            sbLIZ.append(", default:");
                            sbLIZ.append(d);
                            C2188811AlT.LIZIZ(sbLIZ);
                        }
                        return C13LP.LLFZ(arrayList);
                    }
                });
            } else {
                pTYTaskData = new PTYTaskData(LJIIL(c1509310pNZ));
            }
            final long jCurrentTimeMillis2 = System.currentTimeMillis();
            IPitayaCore core = PitayaCoreFactory.getCore(this.LJII);
            PTYTaskConfig pTYTaskConfig = new PTYTaskConfig(true, null, -1.0f);
            pTYTaskConfig.setCallType(14);
            core.runTask(str, pTYTaskData, pTYTaskConfig, new PTYTaskResultCallback() { // from class: com.ss.android.ugc.aweme.ml.infra.pitayaml.SmartPitayaMLEngineRunner$doRun$2
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:55:0x0163 A[PHI: r0
                  0x0163: PHI (r0v36 java.lang.Object) = (r0v35 java.lang.Object), (r0v37 java.lang.Object) binds: [B:53:0x0160, B:50:0x0157] A[DONT_GENERATE, DONT_INLINE]] */
                @Override // com.bytedance.pitaya.api.PTYTaskResultCallback
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public void onResult(boolean r11, com.bytedance.pitaya.api.bean.PTYError r12, com.bytedance.pitaya.api.bean.PTYTaskData r13, com.bytedance.pitaya.api.bean.PTYPackageInfo r14) {
                    /*
                        Method dump skipped, instruction units count: 543
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ml.infra.pitayaml.SmartPitayaMLEngineRunner$doRun$2.onResult(boolean, com.bytedance.pitaya.api.bean.PTYError, com.bytedance.pitaya.api.bean.PTYTaskData, com.bytedance.pitaya.api.bean.PTYPackageInfo):void");
                }
            });
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1337780kuu.LIZ(e, null, 6);
            c1512100pS4.LIZ = -6;
            interfaceC1511740pRULIZ.LIZ(c1512100pS4);
        }
    }
}
