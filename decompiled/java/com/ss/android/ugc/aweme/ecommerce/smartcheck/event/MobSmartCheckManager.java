package com.ss.android.ugc.aweme.ecommerce.smartcheck.event;

import X.AbstractC19994813Le;
import X.AnonymousClass0317;
import X.C01GW;
import X.C034F;
import X.C034S;
import X.C051S;
import X.C09CT;
import X.C0BP5;
import X.C0C64;
import X.C0VXZ;
import X.C1120604Zw;
import X.C13LP;
import X.C1AQS;
import X.C1BMS;
import X.C452501pT;
import X.C799280VXa;
import X.InterfaceC799320VXe;
import Y.ARunnableS113S0100000_13;
import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.dependency.log.LogDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.event.ILogDependencyService;
import com.ss.android.ugc.aweme.ecommerce.smartcheck.event.MobSmartCheckManager;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AFwS200S0000000_13;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public final class MobSmartCheckManager {
    public static final MobSmartCheckManager LIZ = new MobSmartCheckManager();
    public static final ConcurrentHashMap<String, C799280VXa> LIZIZ = new ConcurrentHashMap<>();
    public static final Queue<Runnable> LIZJ = new ConcurrentLinkedQueue();
    public static final AtomicBoolean LIZLLL = new AtomicBoolean(false);
    public static final AtomicLong LJ = new AtomicLong(0);
    public static final long LJFF = 30000;
    public static final C01GW LJI = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(114));
    public static final C01GW LJII = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(113));
    public static final C01GW LJIIIIZZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(235));

    public static void LIZIZ() {
        AnonymousClass0317 anonymousClass0317CreateILogDependencyServicebyMonsterPlugin;
        AnonymousClass0317 anonymousClass0317CreateILogDependencyServicebyMonsterPlugin2;
        if (((Boolean) C0BP5.LIZ.getValue()).booleanValue()) {
            if (C0C64.LJIILLIIL().LJIIIZ(31744, "ecom_adapt_new_app_log_observer_exp", true, false)) {
                if (C034S.LIZ()) {
                    C1120604Zw.LIZ.LIZ();
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    anonymousClass0317CreateILogDependencyServicebyMonsterPlugin2 = LogDependencyService.createILogDependencyServicebyMonsterPlugin(false);
                    C1AQS.LIZJ(jElapsedRealtime, 1, ILogDependencyService.class.getName(), anonymousClass0317CreateILogDependencyServicebyMonsterPlugin2 != null ? anonymousClass0317CreateILogDependencyServicebyMonsterPlugin2.getClass().getName() : null, anonymousClass0317CreateILogDependencyServicebyMonsterPlugin2 != null);
                } else {
                    C1120604Zw.LIZ.LIZ();
                    anonymousClass0317CreateILogDependencyServicebyMonsterPlugin2 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILogDependencyService.class);
                }
                ((ILogDependencyService) anonymousClass0317CreateILogDependencyServicebyMonsterPlugin2).addAppLogEventPreProcessStageObserverV2(new InterfaceC799320VXe() { // from class: X.0VXX
                    @Override // X.InterfaceC799320VXe
                    public final void LIZ(String str, String str2, JSONObject jSONObject) {
                        Object objOptString;
                        if (str2 != null && str2.length() != 0) {
                            try {
                                JSONObject jSONObject2 = new JSONObject(str2);
                                MobSmartCheckManager.LIZ.getClass();
                                MobSmartCheckManager.LIZ(str, jSONObject2);
                                C189200o6.m2constructorimpl(Unit.LIZ);
                                return;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                C189200o6.m2constructorimpl(new C098200Yq(th));
                                return;
                            }
                        }
                        if (jSONObject != null) {
                            try {
                                MobSmartCheckManager.LIZ.getClass();
                                JSONObject jSONObject3 = new JSONObject();
                                Iterator<String> itKeys = jSONObject.keys();
                                while (itKeys.hasNext()) {
                                    String next = itKeys.next();
                                    if (jSONObject.isNull(next)) {
                                        objOptString = JSONObject.NULL;
                                    } else {
                                        objOptString = jSONObject.optString(next);
                                    }
                                    jSONObject3.put(next, objOptString);
                                }
                                MobSmartCheckManager.LIZ.getClass();
                                MobSmartCheckManager.LIZ(str, jSONObject3);
                                C189200o6.m2constructorimpl(Unit.LIZ);
                            } catch (Throwable th2) {
                                TryCatchGuardChecker.doCheck(th2);
                                C189200o6.m2constructorimpl(new C098200Yq(th2));
                            }
                        }
                    }
                });
                return;
            }
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                anonymousClass0317CreateILogDependencyServicebyMonsterPlugin = LogDependencyService.createILogDependencyServicebyMonsterPlugin(false);
                C1AQS.LIZJ(jElapsedRealtime2, 1, ILogDependencyService.class.getName(), anonymousClass0317CreateILogDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateILogDependencyServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateILogDependencyServicebyMonsterPlugin != null);
            } else {
                C1120604Zw.LIZ.LIZ();
                anonymousClass0317CreateILogDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILogDependencyService.class);
            }
            ((ILogDependencyService) anonymousClass0317CreateILogDependencyServicebyMonsterPlugin).addAppLogEventPreProcessStageObserver(new C1BMS() { // from class: X.0VXY
                @Override // X.C1BMS
                public final void LIZIZ() {
                }

                @Override // X.C1BMS
                public final void onEvent() {
                }

                @Override // X.C1BMS
                public final void LIZ(String str, String str2) {
                    if (str2 == null) {
                        return;
                    }
                    try {
                        JSONObject jSONObject = new JSONObject(str2);
                        MobSmartCheckManager.LIZ.getClass();
                        MobSmartCheckManager.LIZ(str, jSONObject);
                        C189200o6.m2constructorimpl(Unit.LIZ);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C189200o6.m2constructorimpl(new C098200Yq(th));
                    }
                }
            });
        }
    }

    public static void LIZJ() {
        if (((ConcurrentLinkedQueue) LIZJ).peek() == null) {
            LIZLLL.set(false);
            return;
        }
        long j = LJ.get();
        long j2 = 0;
        if (j != 0) {
            long jCurrentTimeMillis = System.currentTimeMillis() - j;
            long j3 = LJFF;
            if (jCurrentTimeMillis < j3) {
                j2 = j3 - jCurrentTimeMillis;
            }
        }
        ((ScheduledExecutorService) LJII.getValue()).schedule(new Runnable() { // from class: X.0VXW
            public static void LIZ() {
                Runnable runnable = (Runnable) ((ConcurrentLinkedQueue) MobSmartCheckManager.LIZJ).poll();
                try {
                    if (runnable != null) {
                        try {
                            MobSmartCheckManager.LIZ.getClass();
                            ((ScheduledExecutorService) MobSmartCheckManager.LJII.getValue()).execute(runnable);
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                        MobSmartCheckManager.LJ.set(System.currentTimeMillis());
                    }
                    MobSmartCheckManager.LIZ.getClass();
                    MobSmartCheckManager.LIZJ();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    MobSmartCheckManager.LJ.set(System.currentTimeMillis());
                    throw th;
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("MobSmartCheckManager@ff8.scheduleNext$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("MobSmartCheckManager@ff8.scheduleNext$1");
            }
        }, j2, TimeUnit.MILLISECONDS);
    }

    public static final class RuleTarget {

        @C09CT("target")
        public final String target;

        @C09CT("type")
        public final String type;

        public RuleTarget(String str, String str2) {
            this.target = str;
            this.type = str2;
        }
    }

    public static void LIZ(String str, JSONObject jSONObject) {
        Double d;
        Integer numValueOf;
        Double d2;
        Object obj = null;
        if (((Boolean) C034F.LIZJ.getValue()).booleanValue()) {
            Map map = (Map) ((Map) C034F.LIZIZ.getValue()).get(str);
            if (map != null) {
                obj = map.get("local_sampling_rate");
            }
            if ((obj instanceof Double) && (d2 = (Double) obj) != null) {
                numValueOf = Integer.valueOf((int) d2.doubleValue());
            } else {
                return;
            }
        } else {
            Map map2 = (Map) ((Map) C034F.LIZIZ.getValue()).get(str);
            if (map2 != null) {
                obj = map2.get("sampling_rate");
            }
            if (!(obj instanceof Double) || (d = (Double) obj) == null) {
                return;
            } else {
                numValueOf = Integer.valueOf((int) d.doubleValue());
            }
        }
        if (numValueOf != null) {
            numValueOf.intValue();
            LIZ.getClass();
            if (((List) LJI.getValue()).contains(str)) {
                int iIntValue = numValueOf.intValue();
                ConcurrentHashMap<String, C799280VXa> concurrentHashMap = LIZIZ;
                C799280VXa c799280VXa = concurrentHashMap.get(str);
                if (c799280VXa == null) {
                    c799280VXa = new C799280VXa(iIntValue);
                    concurrentHashMap.put(str, c799280VXa);
                }
                C0VXZ c0vxz = new C0VXZ(str, C051S.LIZJ(jSONObject));
                if (c799280VXa.LIZ > 1) {
                    c799280VXa.LIZIZ.add(c0vxz);
                    if (c799280VXa.LIZIZ.size() == c799280VXa.LIZ) {
                        c0vxz = (C0VXZ) C13LP.LJLJJI(c799280VXa.LIZIZ, AbstractC19994813Le.Default);
                        c799280VXa.LIZIZ.clear();
                        if (c0vxz == null) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                ((ConcurrentLinkedQueue) LIZJ).add(new ARunnableS113S0100000_13(c0vxz, 100));
                if (LIZLLL.compareAndSet(false, true)) {
                    LIZJ();
                }
            }
        }
    }
}
