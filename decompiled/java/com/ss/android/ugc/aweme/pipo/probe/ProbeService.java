package com.ss.android.ugc.aweme.pipo.probe;

import X.AbstractC1387200mCc;
import X.AnonymousClass0678;
import X.AnonymousClass0679;
import X.AnonymousClass1483;
import X.AnonymousClass1489;
import X.C0196004k;
import X.C05CE;
import X.C05CF;
import X.C05CH;
import X.C067C;
import X.C067F;
import X.C098200Yq;
import X.C09JN;
import X.C0PEM;
import X.C0VI1;
import X.C1017903yT;
import X.C1165204h8;
import X.C123100dR;
import X.C1300690jx5;
import X.C1503490pEB;
import X.C1504050pF5;
import X.C1504110pFB;
import X.C1504130pFD;
import X.C1513820pUq;
import X.C1514420pVo;
import X.C15438062q;
import X.C1717770unn;
import X.C1724940uzM;
import X.C1724990uzR;
import X.C189200o6;
import X.C1906580ziK;
import X.C1911607eE;
import X.C1911707eF;
import X.C1911807eG;
import X.C1911907eH;
import X.C202146147s;
import X.C202147147t;
import X.C202148147u;
import X.C202150147w;
import X.C202153147z;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2197108jB;
import X.C2286608xc;
import X.C23250099c;
import X.C601870Nj7;
import X.C604500NnM;
import X.C795400VIc;
import X.C817503Hh;
import X.C838130WuJ;
import X.InterfaceC1063710dmr;
import X.InterfaceC1364105Vn;
import android.app.Activity;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.HandlerThread;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.pitaya.api.IPitayaCore;
import com.bytedance.pitaya.api.mutilinstance.HostSetupListener;
import com.bytedance.pitaya.api.mutilinstance.HostSetupWatcher;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.pipo.probe.IProbeService;
import com.ss.android.ugc.aweme.pipo.probe.ab.PipoProbeSdkConfigSettings;
import com.ss.android.ugc.aweme.pipo.probe.core.infocollect.pitaya.ProbePitayaFieldCollector;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS574S0100000_30;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes31.dex */
public final class ProbeService implements IProbeService {
    public static String LJ;
    public static long LJII;
    public boolean LIZ;
    public int LIZIZ;
    public static String LIZJ = "";
    public static final HashMap<String, Object> LIZLLL = new HashMap<>();
    public static final String LJFF = C1017903yT.LIZ().toUpperCase(Locale.ROOT);
    public static String LJI = "";

    @Override // com.ss.android.ugc.aweme.pipo.probe.IProbeService
    public final void LIZIZ() {
        if (!AnonymousClass1483.LIZ.compareAndSet(false, true)) {
            AnonymousClass0678.LIZ("observer_applog_run_event", C2097608Jq.LJIIJ(new Pair(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "already_started"), new Pair("mode", "app_log_observer")));
            return;
        }
        if (!C1911907eH.LIZ().probeObserverEnabled) {
            AnonymousClass0678.LIZ("observer_applog_run_event", C2097608Jq.LJIIJ(new Pair(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "observer_disabled"), new Pair("mode", "app_log_observer")));
            return;
        }
        C1911807eG c1911807eGLIZIZ = C1911607eE.LIZIZ(C1911907eH.LIZ());
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("loadConfig, parsed=");
        sbLIZ.append(c1911807eGLIZIZ);
        C2188811AlT.LIZIZ(sbLIZ);
        List<C1911707eF> list = c1911807eGLIZIZ.LIZ;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<C1911707eF> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().LIZ);
        }
        if (arrayList.isEmpty()) {
            AnonymousClass0678.LIZ("observer_applog_run_event", C2097608Jq.LJIIJ(new Pair(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "disabled"), new Pair("mode", "app_log_observer")));
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("start, targets=");
        sbLIZ2.append(arrayList);
        C2188811AlT.LIZIZ(sbLIZ2);
        final AwS574S0100000_30 awS574S0100000_30 = new AwS574S0100000_30(arrayList, (List<String>) 86);
        HostSetupWatcher hostSetupWatcher = HostSetupWatcher.INSTANCE;
        if (hostSetupWatcher.isHostSetup()) {
            awS574S0100000_30.invoke();
            return;
        }
        if (AnonymousClass1483.LIZIZ.compareAndSet(false, true)) {
            AnonymousClass0678.LIZ("observer_applog_run_event", C2097608Jq.LJIIJ(new Pair(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "await_pitaya_ready"), new Pair("mode", "app_log_observer")));
            hostSetupWatcher.registerHostSetupListener(new HostSetupListener() { // from class: com.ss.android.ugc.aweme.pipo.probe.core.observer.ProbeApplogRunEventObserver$checkPitayaHostSetup$1
                @Override // com.bytedance.pitaya.api.mutilinstance.HostSetupListener
                public void onHostSetup(boolean z) {
                    if (z) {
                        awS574S0100000_30.invoke();
                    } else {
                        AnonymousClass1483.LIZ("host_setup_failed");
                    }
                }
            });
            if (hostSetupWatcher.isHostSetup()) {
                awS574S0100000_30.invoke();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.pipo.probe.IProbeService
    public final String LJ() {
        String str = LJ;
        return str == null ? "" : str;
    }

    @Override // com.ss.android.ugc.aweme.pipo.probe.IProbeService
    public final HashMap<String, Object> LJJLIIIJLJLI() {
        try {
            C202153147z.LIZ.getClass();
            HashMap<String, Object> mapLIZ = C202153147z.LIZ(null, null);
            Pair[] pairArr = new Pair[2];
            String str = LJ;
            if (str == null) {
                str = "";
            }
            pairArr[0] = new Pair("trxn_id", str);
            pairArr[1] = new Pair(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, mapLIZ.isEmpty() ? "empty" : "success");
            AnonymousClass0678.LIZ("collect", C2097608Jq.LJIIJ(pairArr));
            return mapLIZ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            Pair[] pairArr2 = new Pair[3];
            String str2 = LJ;
            if (str2 == null) {
                str2 = "";
            }
            pairArr2[0] = new Pair("trxn_id", str2);
            pairArr2[1] = new Pair(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "exception");
            String message = th.getMessage();
            pairArr2[2] = new Pair("error", message != null ? message : "");
            AnonymousClass0678.LIZ("collect", C2097608Jq.LJIIJ(pairArr2));
            return null;
        }
    }

    @Override // com.ss.android.ugc.aweme.pipo.probe.IProbeService
    public final List<Class<? extends InterfaceC1063710dmr>> provideXBridgetIDLMethodList() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(C1724940uzM.class);
        arrayList.add(C1504050pF5.class);
        arrayList.add(C1513820pUq.class);
        arrayList.add(C601870Nj7.class);
        arrayList.add(C604500NnM.class);
        arrayList.add(C1503490pEB.class);
        arrayList.add(C1504110pFB.class);
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.pipo.probe.IProbeService
    public final C0196004k LJI() {
        PipoProbeSdkConfigSettings.PipoProbeSdkConfigModel pipoProbeSdkConfigModelLIZ = PipoProbeSdkConfigSettings.LIZ();
        SettingsManager.LIZLLL().getClass();
        boolean z = false;
        if (SettingsManager.LIZ("pipo_tts_cashier_probe_integration", false) && pipoProbeSdkConfigModelLIZ.ttsEnableProbe) {
            z = true;
        }
        return new C0196004k(z, pipoProbeSdkConfigModelLIZ.ttsUrlEnableList);
    }

    @Override // com.ss.android.ugc.aweme.pipo.probe.IProbeService
    public final HashMap LJFF(AnonymousClass1489 anonymousClass1489) {
        HashMap<String, Object> map;
        boolean z;
        String str;
        String str2 = "";
        try {
            C202153147z c202153147z = C202153147z.LIZ;
            String str3 = anonymousClass1489.LIZ;
            c202153147z.getClass();
            C202153147z.LJ(anonymousClass1489, str3, null);
            map = anonymousClass1489.LIZJ;
            Pair[] pairArr = new Pair[3];
            String str4 = LJ;
            if (str4 == null) {
                str4 = "";
            }
            pairArr[0] = new Pair("trxn_id", str4);
            pairArr[1] = new Pair("entrance", anonymousClass1489.LIZ);
            if (map == null || map.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                str = "success";
            } else {
                str = "empty";
            }
            pairArr[2] = new Pair(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str);
            AnonymousClass0678.LIZ("collect", C2097608Jq.LJIIJ(pairArr));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            Pair[] pairArr2 = new Pair[4];
            String str5 = LJ;
            if (str5 == null) {
                str5 = "";
            }
            pairArr2[0] = new Pair("trxn_id", str5);
            pairArr2[1] = new Pair("entrance", anonymousClass1489.LIZ);
            pairArr2[2] = new Pair(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "exception");
            String message = th.getMessage();
            if (message != null) {
                str2 = message;
            }
            pairArr2[3] = new Pair("error", str2);
            AnonymousClass0678.LIZ("collect", C2097608Jq.LJIIJ(pairArr2));
        }
        if (map == null) {
            return null;
        }
        return map;
    }

    @Override // com.ss.android.ugc.aweme.pipo.probe.IProbeService
    public final boolean LJII(Map<String, ? extends Object> map) {
        Pair[] pairArr = new Pair[1];
        String str = LJ;
        if (str == null) {
            str = "";
        }
        pairArr[0] = new Pair("trxn_id", str);
        AnonymousClass0678.LIZ("cache", C2097608Jq.LJIIJ(pairArr));
        try {
            HashMap<String, Object> map2 = LIZLLL;
            map2.clear();
            map2.putAll(map);
            return true;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
                return false;
            }
            throw new C2197108jB();
        }
    }

    @Override // com.ss.android.ugc.aweme.pipo.probe.IProbeService
    public final void LJIIIIZZ(AnonymousClass1489 anonymousClass1489) {
        String str = "";
        if (!PipoProbeSdkConfigSettings.LIZ().entranceList.contains(anonymousClass1489.LIZ)) {
            Pair[] pairArr = new Pair[5];
            String str2 = LJ;
            if (str2 == null) {
                str2 = "";
            }
            pairArr[0] = new Pair("trxn_id", str2);
            pairArr[1] = new Pair("entrance", anonymousClass1489.LIZ);
            String str3 = anonymousClass1489.LIZIZ;
            if (str3 != null) {
                str = str3;
            }
            pairArr[2] = new Pair("event_name", str);
            pairArr[3] = new Pair("mode", "active");
            pairArr[4] = new Pair(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "disabled");
            AnonymousClass0678.LIZ("report", C2097608Jq.LJIIJ(pairArr));
            return;
        }
        String str4 = LJ;
        if (str4 == null) {
            str4 = "";
        }
        anonymousClass1489.LJFF = str4;
        anonymousClass1489.LIZLLL = LJI;
        anonymousClass1489.LJ = "active";
        if (!this.LIZ) {
            Pair[] pairArr2 = new Pair[5];
            String str5 = LJ;
            if (str5 == null) {
                str5 = "";
            }
            pairArr2[0] = new Pair("trxn_id", str5);
            pairArr2[1] = new Pair("entrance", anonymousClass1489.LIZ);
            String str6 = anonymousClass1489.LIZIZ;
            if (str6 != null) {
                str = str6;
            }
            pairArr2[2] = new Pair("event_name", str);
            pairArr2[3] = new Pair("mode", "active");
            pairArr2[4] = new Pair(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "cached");
            AnonymousClass0678.LIZ("report", C2097608Jq.LJIIJ(pairArr2));
            Keva keva = C05CF.LIZ;
            ArrayList arrayList = new ArrayList();
            arrayList.add(anonymousClass1489);
            C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C05CE(arrayList, null), 2);
            return;
        }
        Pair[] pairArr3 = new Pair[5];
        String str7 = LJ;
        if (str7 == null) {
            str7 = "";
        }
        pairArr3[0] = new Pair("trxn_id", str7);
        pairArr3[1] = new Pair("entrance", anonymousClass1489.LIZ);
        String str8 = anonymousClass1489.LIZIZ;
        if (str8 != null) {
            str = str8;
        }
        pairArr3[2] = new Pair("event_name", str);
        pairArr3[3] = new Pair("mode", "active");
        pairArr3[4] = new Pair(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "submitted");
        AnonymousClass0678.LIZ("report", C2097608Jq.LJIIJ(pairArr3));
        C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new AnonymousClass0679(LIZJ, anonymousClass1489, null, null), 2);
    }

    @Override // com.ss.android.ugc.aweme.pipo.probe.IProbeService
    public final String LJIIJ(C1724990uzR c1724990uzR) {
        boolean z;
        Map<String, Object> next;
        Object obj;
        boolean zBooleanValue;
        Object obj2;
        String str;
        Object obj3;
        boolean zBooleanValue2;
        Object obj4;
        long jLongValue;
        Activity activityLIZIZ;
        Map<String, Object> next2;
        Object obj5;
        boolean zBooleanValue3;
        Boolean bool;
        AbstractC1387200mCc abstractC1387200mCcLIZJ;
        Activity activityLIZIZ2;
        Long l;
        Boolean bool2;
        Boolean bool3;
        if (c1724990uzR.LIZ.length() > 0 && c1724990uzR.LIZIZ.length() > 0 && PipoProbeSdkConfigSettings.LIZ().entranceList.contains(c1724990uzR.LIZ)) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            Pair[] pairArr = new Pair[3];
            pairArr[0] = new Pair("entrance", c1724990uzR.LIZ);
            pairArr[1] = new Pair(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "disabled");
            String str2 = c1724990uzR.LIZIZ;
            if (str2 == null) {
                str2 = "";
            }
            pairArr[2] = new Pair("domain", str2);
            AnonymousClass0678.LIZ("initialize", C2097608Jq.LJIIJ(pairArr));
            return "";
        }
        LIZJ = c1724990uzR.LIZIZ;
        String str3 = c1724990uzR.LIZJ;
        if (str3 == null) {
            str3 = "";
        }
        LJI = str3;
        PipoProbeSdkConfigSettings.PipoProbeSdkConfigModel pipoProbeSdkConfigModelLIZ = PipoProbeSdkConfigSettings.LIZ();
        Iterator<Map<String, Object>> it2 = pipoProbeSdkConfigModelLIZ.byEntrance.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(next.get("entrance"), c1724990uzR.LIZ)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        Map<String, Object> map = next;
        if (map != null) {
            obj = map.get("pitaya_enabled");
        } else {
            obj = null;
        }
        if ((obj instanceof Boolean) && (bool3 = (Boolean) obj) != null) {
            zBooleanValue = bool3.booleanValue();
        } else {
            zBooleanValue = pipoProbeSdkConfigModelLIZ.common.pitayaEnabled;
        }
        if (map != null) {
            obj2 = map.get("pitaya_biz");
        } else {
            obj2 = null;
        }
        if (!(obj2 instanceof String) || (str = (String) obj2) == null) {
            str = pipoProbeSdkConfigModelLIZ.common.pitayaBiz;
        }
        if (map != null) {
            obj3 = map.get("heart_beat_enabled");
        } else {
            obj3 = null;
        }
        if ((obj3 instanceof Boolean) && (bool2 = (Boolean) obj3) != null) {
            zBooleanValue2 = bool2.booleanValue();
        } else {
            zBooleanValue2 = pipoProbeSdkConfigModelLIZ.common.enableHeartBeat;
        }
        if (map != null) {
            obj4 = map.get("heart_beat_interval");
        } else {
            obj4 = null;
        }
        if ((obj4 instanceof Long) && (l = (Long) obj4) != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = pipoProbeSdkConfigModelLIZ.common.heartBeatInterval;
        }
        this.LIZIZ++;
        if (this.LIZ) {
            Pair[] pairArr2 = new Pair[4];
            String str4 = LJ;
            if (str4 == null) {
                str4 = "";
            }
            pairArr2[0] = new Pair("trxn_id", str4);
            pairArr2[1] = new Pair("entrance", c1724990uzR.LIZ);
            pairArr2[2] = new Pair(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "not_idle");
            String str5 = c1724990uzR.LIZIZ;
            if (str5 == null) {
                str5 = "";
            }
            pairArr2[3] = new Pair("domain", str5);
            AnonymousClass0678.LIZ("initialize", C2097608Jq.LJIIJ(pairArr2));
            LJIIL(c1724990uzR.LIZ);
            C795400VIc.LIZ.getClass();
            if (!C795400VIc.LIZIZ && (abstractC1387200mCcLIZJ = C1717770unn.LIZIZ().LIZJ()) != null && (activityLIZIZ2 = abstractC1387200mCcLIZJ.LIZIZ()) != null) {
                C795400VIc.LIZ(jLongValue, zBooleanValue2, activityLIZIZ2);
                C795400VIc.LIZIZ = true;
            }
            C202146147s c202146147s = C202146147s.LIZ;
            String str6 = c1724990uzR.LIZ;
            c202146147s.getClass();
            C202146147s.LIZLLL(str6);
            String str7 = LJ;
            if (str7 == null) {
                return "";
            }
            return str7;
        }
        this.LIZ = true;
        if (zBooleanValue && C123100dR.LIZ(str)) {
            ProbePitayaFieldCollector.LIZIZ(str);
        }
        LJ = LJFF;
        AbstractC1387200mCc abstractC1387200mCcLIZJ2 = C1717770unn.LIZIZ().LIZJ();
        if (abstractC1387200mCcLIZJ2 != null && (activityLIZIZ = abstractC1387200mCcLIZJ2.LIZIZ()) != null) {
            C795400VIc.LIZ.getClass();
            C795400VIc.LIZ(jLongValue, zBooleanValue2, activityLIZIZ);
            final String str8 = c1724990uzR.LIZ;
            PipoProbeSdkConfigSettings.PipoProbeSdkConfigModel pipoProbeSdkConfigModelLIZ2 = PipoProbeSdkConfigSettings.LIZ();
            Iterator<Map<String, Object>> it3 = pipoProbeSdkConfigModelLIZ2.byEntrance.iterator();
            while (true) {
                if (it3.hasNext()) {
                    next2 = it3.next();
                    if (Intrinsics.LJFF(next2.get("entrance"), str8)) {
                        break;
                    }
                } else {
                    next2 = null;
                    break;
                }
            }
            Map<String, Object> map2 = next2;
            if (map2 != null) {
                obj5 = map2.get("system_observer_enabled");
            } else {
                obj5 = null;
            }
            if ((obj5 instanceof Boolean) && (bool = (Boolean) obj5) != null) {
                zBooleanValue3 = bool.booleanValue();
            } else {
                zBooleanValue3 = pipoProbeSdkConfigModelLIZ2.common.systemObserverEnabled;
            }
            if (zBooleanValue3) {
                C795400VIc.LIZIZ = true;
                C1906580ziK.LIZJ().LIZ().LJLLLLLL(new C09JN() { // from class: X.0VQ6
                    @Override // X.C09JN
                    public final void accept(Object obj6) {
                        IProbeService iProbeService;
                        String str9;
                        C1C7U.LIZ("RegularlyReportManager@a316.startReportWhenAppStatusChanged$1");
                        C606810Nr5 c606810Nr5 = (C606810Nr5) obj6;
                        C795400VIc.LIZ.getClass();
                        if (C795400VIc.LIZIZ && (iProbeService = (IProbeService) PluggableExtentionKt.pluggableSpi$default(IProbeService.class, false, false, false, 14, null)) != null) {
                            String str10 = str8;
                            if (c606810Nr5.LIZIZ) {
                                str9 = "appEnterBackground";
                            } else {
                                str9 = "appEnterForeground";
                            }
                            iProbeService.LJIIIIZZ(new AnonymousClass1489(str10, str9, null, null, 248));
                        }
                        C1C7U.LIZIZ("RegularlyReportManager@a316.startReportWhenAppStatusChanged$1");
                    }
                });
            }
        }
        C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C05CH(null), 2);
        LJIIL(c1724990uzR.LIZ);
        C202146147s c202146147s2 = C202146147s.LIZ;
        String str9 = c1724990uzR.LIZ;
        c202146147s2.getClass();
        C202146147s.LIZLLL(str9);
        Pair[] pairArr3 = new Pair[4];
        String str10 = LJ;
        if (str10 == null) {
            str10 = "";
        }
        pairArr3[0] = new Pair("trxn_id", str10);
        pairArr3[1] = new Pair("entrance", c1724990uzR.LIZ);
        pairArr3[2] = new Pair(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "success");
        String str11 = c1724990uzR.LIZIZ;
        if (str11 == null) {
            str11 = "";
        }
        pairArr3[3] = new Pair("domain", str11);
        AnonymousClass0678.LIZ("initialize", C2097608Jq.LJIIJ(pairArr3));
        String str12 = LJ;
        if (str12 == null) {
            return "";
        }
        return str12;
    }

    @Override // com.ss.android.ugc.aweme.pipo.probe.IProbeService
    public final void LJIIJJI(C1504130pFD c1504130pFD) {
        boolean z;
        Activity activityLIZIZ;
        if (c1504130pFD.LIZ.length() > 0 && PipoProbeSdkConfigSettings.LIZ().entranceList.contains(c1504130pFD.LIZ)) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            Pair[] pairArr = new Pair[2];
            String str = LJ;
            if (str == null) {
                str = "";
            }
            pairArr[0] = new Pair("trxn_id", str);
            pairArr[1] = new Pair(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "invalid_config");
            AnonymousClass0678.LIZ("teardown", C2097608Jq.LJIIJ(pairArr));
            return;
        }
        int i = this.LIZIZ - 1;
        this.LIZIZ = i;
        if (i == 0) {
            C202146147s.LIZ.getClass();
            synchronized (C202148147u.LIZ) {
                try {
                    if (C202148147u.LIZIZ) {
                        SensorManager sensorManager = C202148147u.LJ;
                        C202150147w c202150147w = C202148147u.LJI;
                        Sensor sensor = C202148147u.LJFF;
                        Cert cert = C202148147u.LJIIIIZZ;
                        if (sensorManager != null && c202150147w != null && sensor != null && cert != null) {
                            try {
                                C1300690jx5.LIZLLL(sensorManager, c202150147w, sensor, cert);
                            } catch (C838130WuJ e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                        }
                        HandlerThread handlerThread = C202148147u.LJII;
                        if (handlerThread != null) {
                            handlerThread.quitSafely();
                        }
                        C202148147u.LJ = null;
                        C202148147u.LJFF = null;
                        C202148147u.LJI = null;
                        C202148147u.LJII = null;
                        C202148147u.LJIIIIZZ = null;
                        C202148147u.LIZJ.clear();
                        C202148147u.LIZLLL = null;
                        C202148147u.LIZIZ = false;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            C202147147t.LIZJ();
            AbstractC1387200mCc abstractC1387200mCcLIZJ = C1717770unn.LIZIZ().LIZJ();
            if (abstractC1387200mCcLIZJ != null && (activityLIZIZ = abstractC1387200mCcLIZJ.LIZIZ()) != null) {
                C795400VIc.LIZ.getClass();
                C795400VIc.LIZIZ = false;
                C0VI1.LJII(activityLIZIZ).LJ("probe_sdk");
                C795400VIc.LIZJ = true;
            }
            Pair[] pairArr2 = new Pair[2];
            String str2 = LJ;
            if (str2 == null) {
                str2 = "";
            }
            pairArr2[0] = new Pair("trxn_id", str2);
            pairArr2[1] = new Pair(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "teardown_complete");
            AnonymousClass0678.LIZ("teardown", C2097608Jq.LJIIJ(pairArr2));
        }
    }

    public final void LJIIL(String str) {
        Object obj;
        Map<String, Object> next;
        int iIntValue;
        Number number;
        PipoProbeSdkConfigSettings.PipoProbeSdkConfigModel pipoProbeSdkConfigModelLIZ = PipoProbeSdkConfigSettings.LIZ();
        Iterator<Map<String, Object>> it2 = pipoProbeSdkConfigModelLIZ.byEntrance.iterator();
        while (true) {
            obj = null;
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(next.get("entrance"), str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        Map<String, Object> map = next;
        if (map != null) {
            obj = map.get("init_report_interval_sec");
        }
        if ((obj instanceof Number) && (number = (Number) obj) != null) {
            iIntValue = number.intValue();
        } else {
            iIntValue = pipoProbeSdkConfigModelLIZ.common.initReportIntervalSec;
        }
        if (System.currentTimeMillis() - LJII > iIntValue) {
            LJIIIIZZ(new AnonymousClass1489(str, "sdk_setup", null, null, 252));
            LJII = System.currentTimeMillis();
        }
    }

    @Override // com.ss.android.ugc.aweme.pipo.probe.IProbeService
    public final void LIZ(String str, Map<String, ? extends Object> map) {
        AnonymousClass0678.LIZ(str, new LinkedHashMap(map));
    }

    @Override // com.ss.android.ugc.aweme.pipo.probe.IProbeService
    public final Object LIZJ(C1514420pVo c1514420pVo, InterfaceC1364105Vn<? super C1165204h8> interfaceC1364105Vn) {
        Map<String, Object> next;
        Object obj;
        boolean zBooleanValue;
        Object obj2;
        String str;
        Object obj3;
        int iIntValue;
        Object obj4;
        long jLongValue;
        Object obj5;
        double dDoubleValue;
        Number number;
        Number number2;
        Number number3;
        Boolean bool;
        PipoProbeSdkConfigSettings.PipoProbeSdkConfigModel pipoProbeSdkConfigModelLIZ = PipoProbeSdkConfigSettings.LIZ();
        if (!pipoProbeSdkConfigModelLIZ.entranceList.contains(c1514420pVo.LIZ)) {
            AnonymousClass0678.LIZ("risk_signal", C2097608Jq.LJIIJ(new Pair("entrance", c1514420pVo.LIZ), new Pair("attempt", C2286608xc.LJ(0)), new Pair(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "entrance_disabled")));
            return new C1165204h8(null, "entrance_disabled");
        }
        Iterator<Map<String, Object>> it2 = pipoProbeSdkConfigModelLIZ.byEntrance.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(next.get("entrance"), c1514420pVo.LIZ)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        Map<String, Object> map = next;
        if (map != null) {
            obj = map.get("pitaya_enabled");
        } else {
            obj = null;
        }
        if ((obj instanceof Boolean) && (bool = (Boolean) obj) != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = pipoProbeSdkConfigModelLIZ.common.pitayaEnabled;
        }
        if (map != null) {
            obj2 = map.get("pitaya_biz");
        } else {
            obj2 = null;
        }
        if (!(obj2 instanceof String) || (str = (String) obj2) == null) {
            str = pipoProbeSdkConfigModelLIZ.common.pitayaBiz;
        }
        if (zBooleanValue && C123100dR.LIZ(str) && !((IPitayaCore) ProbePitayaFieldCollector.LIZIZ.getValue()).isReady()) {
            ProbePitayaFieldCollector.LIZIZ(str);
        }
        if (map != null) {
            obj3 = map.get("retry_max_count");
        } else {
            obj3 = null;
        }
        if ((obj3 instanceof Number) && (number3 = (Number) obj3) != null) {
            iIntValue = number3.intValue();
        } else {
            iIntValue = pipoProbeSdkConfigModelLIZ.common.retryMaxCount;
        }
        if (map != null) {
            obj4 = map.get("retry_base_delay_ms");
        } else {
            obj4 = null;
        }
        if ((obj4 instanceof Number) && (number2 = (Number) obj4) != null) {
            jLongValue = number2.longValue();
        } else {
            jLongValue = pipoProbeSdkConfigModelLIZ.common.retryBaseDelayMs;
        }
        if (map != null) {
            obj5 = map.get("retry_exponential_factor");
        } else {
            obj5 = null;
        }
        if ((obj5 instanceof Number) && (number = (Number) obj5) != null) {
            dDoubleValue = number.doubleValue();
        } else {
            dDoubleValue = pipoProbeSdkConfigModelLIZ.common.retryExponentialFactor;
        }
        C067F c067f = new C067F(dDoubleValue, iIntValue, jLongValue);
        String str2 = c1514420pVo.LIZ;
        String str3 = c1514420pVo.LIZJ;
        if (str3 == null) {
            str3 = "";
        }
        AnonymousClass1489 anonymousClass1489 = new AnonymousClass1489(str2, "risk_signal", null, str3, 244);
        C202153147z.LIZ.getClass();
        C202153147z.LJ(anonymousClass1489, str2, null);
        HashMap<String, Object> map2 = anonymousClass1489.LIZJ;
        if (map2 != null) {
            map2.put("domain", c1514420pVo.LIZIZ);
        }
        return C067C.LIZ.LIZIZ(anonymousClass1489, c1514420pVo.LIZ, c1514420pVo.LIZIZ, c067f, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    @Override // com.ss.android.ugc.aweme.pipo.probe.IProbeService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(X.C604530NnP r15, X.InterfaceC1364105Vn<? super java.util.Map<java.lang.String, ? extends java.lang.Object>> r16) {
        /*
            Method dump skipped, instruction units count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.pipo.probe.ProbeService.LIZLLL(X.0NnP, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    @Override // com.ss.android.ugc.aweme.pipo.probe.IProbeService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIZ(X.C00EM r15, X.InterfaceC1364105Vn<? super java.util.Map<java.lang.String, ? extends java.lang.Object>> r16) {
        /*
            Method dump skipped, instruction units count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.pipo.probe.ProbeService.LJIIIZ(X.00EM, X.05Vn):java.lang.Object");
    }
}
