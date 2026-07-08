package com.ss.android.ugc.aweme.vibefeed.clientai.service;

import X.C013C;
import X.C098200Yq;
import X.C0C64;
import X.C1557580qdQ;
import X.C1557590qdR;
import X.C1575140r5k;
import X.C1575440r6E;
import X.C1576070r7F;
import X.C1576080r7G;
import X.C1610910s1R;
import X.C1610930s1T;
import X.C1610940s1U;
import X.C1610950s1V;
import X.C1610970s1X;
import X.C189200o6;
import X.C1954807lC;
import X.C2188811AlT;
import X.C299700Bou;
import X.C844470XAv;
import X.EnumC1576090r7H;
import android.os.SystemClock;
import com.bytedance.keva.Keva;
import com.bytedance.pitaya.api.PTYTaskResultCallback;
import com.bytedance.pitaya.api.PitayaCoreFactory;
import com.bytedance.pitaya.api.bean.PTYError;
import com.bytedance.pitaya.api.bean.PTYPackageInfo;
import com.bytedance.pitaya.api.bean.PTYTaskConfig;
import com.bytedance.pitaya.api.bean.PTYTaskData;
import com.bytedance.pitaya.api.mutilinstance.HostSetupListener;
import com.bytedance.pitaya.api.mutilinstance.HostSetupWatcher;
import com.bytedance.pitaya.api.mutilinstance.PreHostSetupWatcher;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.vibefeed.clientai.IVibeClientAIService;
import com.ss.android.ugc.aweme.vibefeed.clientai.cache.VibeIntentScoreCacheItem;
import com.ss.android.ugc.aweme.vibefeed.clientai.cache.VibeIntentScoreIndex;
import com.ss.android.ugc.aweme.vibefeed.experiment.SharedFeedClientAIScoreConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS138S1100000_24;
import kotlin.jvm.internal.AwS390S0200000_24;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes25.dex */
public final class VibeClientAIServiceImpl implements IVibeClientAIService {
    public final Object LIZ = new Object();
    public final HashSet<String> LIZIZ = new HashSet<>();
    public final HashSet<String> LIZJ = new HashSet<>();
    public final HashMap<String, Integer> LIZLLL = new HashMap<>();
    public final HashSet<String> LJ = new HashSet<>();
    public final ArrayList<C1557580qdQ> LJFF = new ArrayList<>();
    public boolean LJI;

    public static boolean LIZLLL(EnumC1576090r7H enumC1576090r7H) {
        int i = C1576070r7F.LIZ[enumC1576090r7H.ordinal()];
        if (i != 1) {
            if (i == 2) {
                C1575140r5k.LIZ.getClass();
                C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
                SharedFeedClientAIScoreConfig sharedFeedClientAIScoreConfig = C1575140r5k.LIZIZ;
                SharedFeedClientAIScoreConfig sharedFeedClientAIScoreConfig2 = (SharedFeedClientAIScoreConfig) c0c64LJIILLIIL.LJJII(SharedFeedClientAIScoreConfig.class, sharedFeedClientAIScoreConfig, "tt_shared_feed_client_ai_score", true);
                if (sharedFeedClientAIScoreConfig2 != null) {
                    sharedFeedClientAIScoreConfig = sharedFeedClientAIScoreConfig2;
                }
                return sharedFeedClientAIScoreConfig.enableConsumeIntentScore;
            }
            throw new C1954807lC();
        }
        C1575140r5k.LIZ.getClass();
        C0C64 c0c64LJIILLIIL2 = C0C64.LJIILLIIL();
        SharedFeedClientAIScoreConfig sharedFeedClientAIScoreConfig3 = C1575140r5k.LIZIZ;
        SharedFeedClientAIScoreConfig sharedFeedClientAIScoreConfig4 = (SharedFeedClientAIScoreConfig) c0c64LJIILLIIL2.LJJII(SharedFeedClientAIScoreConfig.class, sharedFeedClientAIScoreConfig3, "tt_shared_feed_client_ai_score", true);
        if (sharedFeedClientAIScoreConfig4 != null) {
            sharedFeedClientAIScoreConfig3 = sharedFeedClientAIScoreConfig4;
        }
        return sharedFeedClientAIScoreConfig3.enableOpenIntentScore;
    }

    @Override // com.ss.android.ugc.aweme.vibefeed.clientai.IVibeClientAIService
    public final C1610940s1U LIZIZ(String str) {
        Double dValueOf;
        boolean zContains;
        C1610940s1U c1610940s1ULIZJ;
        String trackingName;
        EnumC1576090r7H enumC1576090r7H;
        synchronized (this.LIZ) {
            try {
                HashSet<String> hashSet = this.LJ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                String strLIZ = C1575440r6E.LIZ();
                dValueOf = null;
                if (strLIZ == null || strLIZ.length() <= 0) {
                    strLIZ = "guest";
                }
                sbLIZ.append(strLIZ);
                sbLIZ.append('|');
                sbLIZ.append(str);
                zContains = hashSet.contains(C2188811AlT.LIZIZ(sbLIZ));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (zContains) {
            c1610940s1ULIZJ = LIZJ(str, EnumC1576090r7H.OPEN);
            if (c1610940s1ULIZJ == null) {
                c1610940s1ULIZJ = LIZJ(str, EnumC1576090r7H.CONSUME);
            }
        } else {
            c1610940s1ULIZJ = LIZJ(str, EnumC1576090r7H.CONSUME);
            if (c1610940s1ULIZJ == null) {
                c1610940s1ULIZJ = LIZJ(str, EnumC1576090r7H.OPEN);
            }
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("driverScore conv=");
        sbLIZ2.append(str);
        sbLIZ2.append(" observedClosed=");
        sbLIZ2.append(zContains);
        sbLIZ2.append(" -> intent=");
        if (c1610940s1ULIZJ != null && (enumC1576090r7H = c1610940s1ULIZJ.LIZIZ) != null) {
            trackingName = enumC1576090r7H.getTrackingName();
        } else {
            trackingName = null;
        }
        sbLIZ2.append(trackingName);
        sbLIZ2.append(" score=");
        if (c1610940s1ULIZJ != null) {
            dValueOf = Double.valueOf(c1610940s1ULIZJ.LIZJ);
        }
        sbLIZ2.append(dValueOf);
        C2188811AlT.LIZIZ(sbLIZ2);
        return c1610940s1ULIZJ;
    }

    public static String LJ(String str, EnumC1576090r7H enumC1576090r7H) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        String strLIZ = C1575440r6E.LIZ();
        if (strLIZ == null || strLIZ.length() <= 0) {
            strLIZ = "guest";
        }
        sbLIZ.append(strLIZ);
        sbLIZ.append('|');
        sbLIZ.append(str);
        sbLIZ.append('|');
        sbLIZ.append(enumC1576090r7H.getProtocolValue());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.ss.android.ugc.aweme.vibefeed.clientai.IVibeClientAIService
    public final void LIZ(C1557590qdR c1557590qdR, boolean z) {
        C1576080r7G c1576080r7G = EnumC1576090r7H.Companion;
        Boolean boolValueOf = Boolean.valueOf(z);
        c1576080r7G.getClass();
        EnumC1576090r7H enumC1576090r7HLIZ = C1576080r7G.LIZ(boolValueOf);
        if (!LIZLLL(enumC1576090r7HLIZ)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("refreshIfNeeded skip: collect AB off intent=");
            sbLIZ.append(enumC1576090r7HLIZ.getTrackingName());
            C2188811AlT.LIZIZ(sbLIZ);
            return;
        }
        String str = c1557590qdR.LIZ;
        String strLJ = LJ(str, enumC1576090r7HLIZ);
        synchronized (this.LIZ) {
            boolean z2 = true;
            boolean z3 = false;
            if (!z) {
                try {
                    HashSet<String> hashSet = this.LJ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    String strLIZ = C1575440r6E.LIZ();
                    if (strLIZ == null || strLIZ.length() <= 0) {
                        strLIZ = "guest";
                    }
                    sbLIZ2.append(strLIZ);
                    sbLIZ2.append('|');
                    sbLIZ2.append(str);
                    hashSet.add(C2188811AlT.LIZIZ(sbLIZ2));
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            if (!this.LIZIZ.contains(strLJ) && !this.LIZJ.contains(strLJ)) {
                HostSetupWatcher hostSetupWatcher = HostSetupWatcher.INSTANCE;
                if (!hostSetupWatcher.isHostSetup() && !PreHostSetupWatcher.INSTANCE.isPreHostSetup()) {
                    this.LJFF.add(new C1557580qdQ(c1557590qdR, z));
                    if (!this.LJI) {
                        this.LJI = true;
                    } else {
                        z2 = false;
                    }
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("refreshIfNeeded pending(not ready) key=");
                    sbLIZ3.append(strLJ);
                    C1610970s1X.LIZ(C2188811AlT.LIZIZ(sbLIZ3));
                    z3 = z2;
                    z2 = false;
                } else {
                    this.LIZIZ.add(strLJ);
                }
                if (z3) {
                    C1610970s1X.LIZ("register host setup listener for pending refresh");
                    hostSetupWatcher.registerHostSetupListener(new HostSetupListener() { // from class: com.ss.android.ugc.aweme.vibefeed.clientai.service.VibeClientAIServiceImpl$registerSetupListener$1
                        @Override // com.bytedance.pitaya.api.mutilinstance.HostSetupListener
                        public void onHostSetup(boolean z4) {
                            ArrayList<C1557580qdQ> arrayList;
                            boolean z5;
                            HostSetupWatcher.INSTANCE.unregisterHostSetupListener(this);
                            VibeClientAIServiceImpl vibeClientAIServiceImpl = this.this$0;
                            synchronized (vibeClientAIServiceImpl.LIZ) {
                                try {
                                    vibeClientAIServiceImpl.LJI = false;
                                    arrayList = new ArrayList(vibeClientAIServiceImpl.LJFF);
                                    vibeClientAIServiceImpl.LJFF.clear();
                                } catch (Throwable th2) {
                                    TryCatchGuardChecker.doCheck(th2);
                                    throw th2;
                                }
                            }
                            if (!z4) {
                                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                sbLIZ4.append("pitaya setup failed, drop ");
                                sbLIZ4.append(arrayList.size());
                                sbLIZ4.append(" pending");
                                C1610970s1X.LIZ(C2188811AlT.LIZIZ(sbLIZ4));
                                return;
                            }
                            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                            sbLIZ5.append("pitaya setup success, flush ");
                            sbLIZ5.append(arrayList.size());
                            sbLIZ5.append(" pending");
                            C1610970s1X.LIZ(C2188811AlT.LIZIZ(sbLIZ5));
                            for (C1557580qdQ c1557580qdQ : arrayList) {
                                C1576080r7G c1576080r7G2 = EnumC1576090r7H.Companion;
                                Boolean boolValueOf2 = Boolean.valueOf(c1557580qdQ.LIZIZ);
                                c1576080r7G2.getClass();
                                String strLJ2 = VibeClientAIServiceImpl.LJ(c1557580qdQ.LIZ.LIZ, C1576080r7G.LIZ(boolValueOf2));
                                synchronized (vibeClientAIServiceImpl.LIZ) {
                                    try {
                                        if (!vibeClientAIServiceImpl.LIZIZ.contains(strLJ2) && !vibeClientAIServiceImpl.LIZJ.contains(strLJ2)) {
                                            vibeClientAIServiceImpl.LIZIZ.add(strLJ2);
                                            z5 = true;
                                        } else {
                                            z5 = false;
                                        }
                                    } catch (Throwable th3) {
                                        TryCatchGuardChecker.doCheck(th3);
                                        throw th3;
                                    }
                                }
                                if (z5) {
                                    vibeClientAIServiceImpl.LJFF(c1557580qdQ.LIZ, c1557580qdQ.LIZIZ, strLJ2);
                                }
                            }
                        }
                    });
                }
                if (z2) {
                    LJFF(c1557590qdR, z, strLJ);
                    return;
                }
                return;
            }
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("refreshIfNeeded skip debounce key=");
            sbLIZ4.append(strLJ);
            C2188811AlT.LIZIZ(sbLIZ4);
        }
    }

    @Override // com.ss.android.ugc.aweme.vibefeed.clientai.IVibeClientAIService
    public final C1610940s1U LIZJ(String str, EnumC1576090r7H enumC1576090r7H) {
        Object c098200Yq;
        if (!LIZLLL(enumC1576090r7H)) {
            return null;
        }
        C1610930s1T.LIZ.getClass();
        String strLIZ = C1575440r6E.LIZ();
        if (strLIZ == null || strLIZ.length() <= 0) {
            strLIZ = "guest";
        }
        String strLIZIZ = C1610930s1T.LIZIZ(strLIZ, str, enumC1576090r7H);
        C1610940s1U c1610940s1U = C1610930s1T.LIZJ.get(strLIZIZ);
        if (c1610940s1U != null) {
            return c1610940s1U;
        }
        String string = ((Keva) C1610930s1T.LIZIZ.getValue()).getString(strLIZIZ, null);
        if (string != null && string.length() != 0) {
            try {
                c098200Yq = (VibeIntentScoreCacheItem) C1610930s1T.LJ.LJII(string, VibeIntentScoreCacheItem.class);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            VibeIntentScoreCacheItem vibeIntentScoreCacheItem = (VibeIntentScoreCacheItem) c098200Yq;
            if (vibeIntentScoreCacheItem != null) {
                C1576080r7G c1576080r7G = EnumC1576090r7H.Companion;
                String str2 = vibeIntentScoreCacheItem.intentType;
                c1576080r7G.getClass();
                for (EnumC1576090r7H enumC1576090r7H2 : EnumC1576090r7H.values()) {
                    if (Intrinsics.LJFF(enumC1576090r7H2.getProtocolValue(), str2)) {
                        C1610940s1U c1610940s1U2 = new C1610940s1U(vibeIntentScoreCacheItem.conversationId, enumC1576090r7H2, vibeIntentScoreCacheItem.score, vibeIntentScoreCacheItem.modelResult, vibeIntentScoreCacheItem.pitayaTraceId, vibeIntentScoreCacheItem.timestamp);
                        C1610930s1T.LIZJ.put(strLIZIZ, c1610940s1U2);
                        return c1610940s1U2;
                    }
                }
            }
        }
        return null;
    }

    public final void LJFF(final C1557590qdR c1557590qdR, final boolean z, String str) {
        EnumC1576090r7H enumC1576090r7H;
        Object c098200Yq;
        JSONObject jSONObjectLIZ;
        final C1610910s1R c1610910s1R = C1610910s1R.LIZ;
        final AwS138S1100000_24 awS138S1100000_24 = new AwS138S1100000_24(this, str, 1);
        c1610910s1R.getClass();
        C1576080r7G c1576080r7G = EnumC1576090r7H.Companion;
        Boolean boolValueOf = Boolean.valueOf(z);
        c1576080r7G.getClass();
        final EnumC1576090r7H enumC1576090r7HLIZ = C1576080r7G.LIZ(boolValueOf);
        final long jUptimeMillis = SystemClock.uptimeMillis();
        try {
            jSONObjectLIZ = C1610910s1R.LIZ(c1557590qdR, z, enumC1576090r7HLIZ);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("runTask start conv=");
            sbLIZ.append(c1557590qdR.LIZ);
            sbLIZ.append(" intent=");
            sbLIZ.append(enumC1576090r7HLIZ.getTrackingName());
            sbLIZ.append(" group=");
            sbLIZ.append(c1557590qdR.LIZIZ);
            C1610970s1X.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            C844470XAv.LIZ.getClass();
            enumC1576090r7H = enumC1576090r7HLIZ;
        } catch (Throwable th) {
            th = th;
            enumC1576090r7H = enumC1576090r7HLIZ;
        }
        try {
            PitayaCoreFactory.getCore(String.valueOf(C844470XAv.LJIIJ)).runTask("shared_feed_guide", new PTYTaskData(jSONObjectLIZ), new PTYTaskConfig(false, null, -1.0f), new PTYTaskResultCallback() { // from class: com.ss.android.ugc.aweme.vibefeed.clientai.runner.VibeClientAIPitayaRunner$run$1$1
                @Override // com.bytedance.pitaya.api.PTYTaskResultCallback
                public void onResult(boolean z2, PTYError pTYError, PTYTaskData pTYTaskData, PTYPackageInfo pTYPackageInfo) {
                    int code;
                    final C1610940s1U c1610940s1U;
                    boolean z3;
                    long jUptimeMillis2 = SystemClock.uptimeMillis() - jUptimeMillis;
                    C1610910s1R c1610910s1R2 = c1610910s1R;
                    C1557590qdR c1557590qdR2 = c1557590qdR;
                    boolean z4 = z;
                    EnumC1576090r7H enumC1576090r7H2 = enumC1576090r7HLIZ;
                    Function1<C1610940s1U, Unit> function1 = awS138S1100000_24;
                    c1610910s1R2.getClass();
                    AwS390S0200000_24 awS390S0200000_24 = new AwS390S0200000_24(function1, new C013C(), 54);
                    JSONObject params = null;
                    if (pTYTaskData != null) {
                        try {
                            params = pTYTaskData.getParams();
                        } catch (Exception e) {
                            e = e;
                            TryCatchGuardChecker.doCheck(e);
                            C299700Bou.LIZ("client_ai", "handleResult threw, dispatch fail");
                            try {
                                C1610950s1V c1610950s1V = C1610950s1V.LIZ;
                                boolean z5 = c1557590qdR2.LIZIZ;
                                c1610950s1V.getClass();
                                try {
                                    C1610950s1V.LIZ(false, -1, jUptimeMillis2, enumC1576090r7H2, z4, z5, -1.0d, -1);
                                    C189200o6.m2constructorimpl(Unit.LIZ);
                                } catch (Throwable th2) {
                                    th = th2;
                                    TryCatchGuardChecker.doCheck(th);
                                    C189200o6.m2constructorimpl(new C098200Yq(th));
                                    awS390S0200000_24.invoke(null);
                                    return;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                            }
                            awS390S0200000_24.invoke(null);
                            return;
                        }
                    }
                    try {
                        if (z2 && params != null) {
                            if (Intrinsics.LJFF(params.optString("cur_conversation_id"), c1557590qdR2.LIZ) && Intrinsics.LJFF(params.optString("predict_target"), enumC1576090r7H2.getProtocolValue())) {
                                Object objOpt = params.opt("model_predict_score");
                                Object objOpt2 = params.opt("model_predict_result");
                                Object objOpt3 = params.opt("pitaya_trace_id");
                                if ((objOpt instanceof Number) && (objOpt2 instanceof Number) && (objOpt3 instanceof String) && ((CharSequence) objOpt3).length() != 0) {
                                    String str2 = c1557590qdR2.LIZ;
                                    double dDoubleValue = ((Number) objOpt).doubleValue();
                                    int iIntValue = ((Number) objOpt2).intValue();
                                    try {
                                        c1610940s1U = new C1610940s1U(str2, enumC1576090r7H2, dDoubleValue, iIntValue, (String) objOpt3, System.currentTimeMillis());
                                        C1610930s1T.LIZ.getClass();
                                        final String strLIZ = C1575440r6E.LIZ();
                                        if (strLIZ == null || strLIZ.length() <= 0) {
                                            strLIZ = "guest";
                                        }
                                        final String strLIZIZ = C1610930s1T.LIZIZ(strLIZ, str2, enumC1576090r7H2);
                                        C1610930s1T.LIZJ.put(strLIZIZ, c1610940s1U);
                                        C1610930s1T.LIZLLL.execute(new Runnable() { // from class: X.0s1S
                                            public final void LIZ() {
                                                Object c098200Yq2;
                                                C1610930s1T c1610930s1T = C1610930s1T.LIZ;
                                                String str3 = strLIZIZ;
                                                C1610940s1U c1610940s1U2 = c1610940s1U;
                                                String str4 = strLIZ;
                                                try {
                                                    c1610930s1T.getClass();
                                                    C01GW c01gw = C1610930s1T.LIZIZ;
                                                    Keva keva = (Keva) c01gw.getValue();
                                                    Gson gson = C1610930s1T.LJ;
                                                    keva.storeString(str3, gson.LJIILL(new VibeIntentScoreCacheItem(c1610940s1U2.LIZ, c1610940s1U2.LIZIZ.getProtocolValue(), c1610940s1U2.LIZJ, c1610940s1U2.LIZLLL, c1610940s1U2.LJ, c1610940s1U2.LJFF)));
                                                    VibeIntentScoreIndex vibeIntentScoreIndexLIZ = C1610930s1T.LIZ(str4);
                                                    List<String> listLIZ = vibeIntentScoreIndexLIZ.LIZ(c1610940s1U2.LJFF, str3);
                                                    Keva keva2 = (Keva) c01gw.getValue();
                                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                                    sbLIZ2.append("index.");
                                                    sbLIZ2.append(str4);
                                                    keva2.storeString(C2188811AlT.LIZIZ(sbLIZ2), gson.LJIILL(vibeIntentScoreIndexLIZ));
                                                    for (String str5 : listLIZ) {
                                                        ((Keva) C1610930s1T.LIZIZ.getValue()).erase(str5);
                                                        C1610930s1T.LIZJ.remove(str5);
                                                    }
                                                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                                    sbLIZ3.append("VibeIntentScoreStore save done. key=");
                                                    sbLIZ3.append(str3);
                                                    sbLIZ3.append(", evicted=");
                                                    sbLIZ3.append(listLIZ.size());
                                                    C1610970s1X.LIZ(C2188811AlT.LIZIZ(sbLIZ3));
                                                    c098200Yq2 = Unit.LIZ;
                                                    C189200o6.m2constructorimpl(c098200Yq2);
                                                } catch (Throwable th4) {
                                                    TryCatchGuardChecker.doCheck(th4);
                                                    c098200Yq2 = new C098200Yq(th4);
                                                    C189200o6.m2constructorimpl(c098200Yq2);
                                                }
                                                String str6 = strLIZIZ;
                                                if (C189200o6.m5exceptionOrNullimpl(c098200Yq2) != null) {
                                                    C299700Bou.LIZ("client_ai", "VibeIntentScoreStore save failed. key=" + str6);
                                                }
                                            }

                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                boolean zLIZ;
                                                C1C7U.LIZ("VibeIntentScoreStore@884d.save$1");
                                                try {
                                                    LIZ();
                                                } finally {
                                                    if (!zLIZ) {
                                                    }
                                                }
                                                C1C7U.LIZIZ("VibeIntentScoreStore@884d.save$1");
                                            }
                                        });
                                        C1610950s1V c1610950s1V2 = C1610950s1V.LIZ;
                                        z3 = c1557590qdR2.LIZIZ;
                                        c1610950s1V2.getClass();
                                    } catch (Exception e2) {
                                        e = e2;
                                    }
                                    try {
                                        C1610950s1V.LIZ(true, 0, jUptimeMillis2, enumC1576090r7H2, z4, z3, dDoubleValue, iIntValue);
                                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                        sbLIZ2.append("runTask success conv=");
                                        sbLIZ2.append(c1557590qdR2.LIZ);
                                        sbLIZ2.append(" intent=");
                                        sbLIZ2.append(enumC1576090r7H2.getTrackingName());
                                        sbLIZ2.append(" score=");
                                        sbLIZ2.append(dDoubleValue);
                                        C1610970s1X.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
                                        awS390S0200000_24.invoke(c1610940s1U);
                                        return;
                                    } catch (Exception e3) {
                                        e = e3;
                                        TryCatchGuardChecker.doCheck(e);
                                        C299700Bou.LIZ("client_ai", "handleResult threw, dispatch fail");
                                        C1610950s1V c1610950s1V3 = C1610950s1V.LIZ;
                                        boolean z52 = c1557590qdR2.LIZIZ;
                                        c1610950s1V3.getClass();
                                        C1610950s1V.LIZ(false, -1, jUptimeMillis2, enumC1576090r7H2, z4, z52, -1.0d, -1);
                                        C189200o6.m2constructorimpl(Unit.LIZ);
                                        awS390S0200000_24.invoke(null);
                                        return;
                                    }
                                }
                                C1610910s1R.LIZIZ(100, jUptimeMillis2, enumC1576090r7H2, z4, c1557590qdR2.LIZIZ, "field invalid", awS390S0200000_24);
                                return;
                            }
                            C1610910s1R.LIZIZ(101, jUptimeMillis2, enumC1576090r7H2, z4, c1557590qdR2.LIZIZ, "mismatch", awS390S0200000_24);
                            return;
                        }
                        if (pTYError == null) {
                            code = -1;
                        } else {
                            code = pTYError.getCode();
                        }
                        C1610910s1R.LIZIZ(code, jUptimeMillis2, enumC1576090r7H2, z4, c1557590qdR2.LIZIZ, "sdk fail", awS390S0200000_24);
                    } catch (Exception e4) {
                        e = e4;
                    }
                }
            });
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th2) {
            th = th2;
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            C299700Bou.LIZ("client_ai", "runTask threw");
            C1610910s1R c1610910s1R2 = C1610910s1R.LIZ;
            long jUptimeMillis2 = SystemClock.uptimeMillis() - jUptimeMillis;
            boolean z2 = c1557590qdR.LIZIZ;
            c1610910s1R2.getClass();
            C1610910s1R.LIZIZ(-1, jUptimeMillis2, enumC1576090r7H, z, z2, "exception", awS138S1100000_24);
        }
    }
}
