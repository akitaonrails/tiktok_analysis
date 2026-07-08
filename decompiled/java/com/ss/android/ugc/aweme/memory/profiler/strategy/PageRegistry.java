package com.ss.android.ugc.aweme.memory.profiler.strategy;

import X.AbstractC1387200mCc;
import X.C09JN;
import X.C09PC;
import X.C1388190mED;
import X.C1397950mTx;
import X.C13LP;
import X.C1844400y62;
import X.C1906580ziK;
import X.C1C7U;
import X.C2095108Ir;
import X.C2179971ATj;
import X.C813430VvZ;
import X.C822660WOy;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.h;
import com.google.gson.k;
import com.google.gson.n;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.memory.profiler.core.AbsPeriodicRegistry;
import com.ss.android.ugc.aweme.memory.profiler.core.HprofBridge;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class PageRegistry extends AbsPeriodicRegistry {
    public static ScheduledThreadPoolExecutor scheduler;
    public static ScheduledFuture<?> task;
    public static final PageRegistry INSTANCE = new PageRegistry();
    public static final List<PageEntry> pageEntries = new ArrayList();
    public static final Object entriesLock = new Object();
    public static final int $stable = 8;

    @Override // com.ss.android.ugc.aweme.memory.profiler.core.AbsBridge
    public int getType() {
        return 3;
    }

    private final void stopLiveListPoll() {
        try {
            ScheduledFuture<?> scheduledFuture = task;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        task = null;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = scheduler;
            if (scheduledThreadPoolExecutor != null) {
                scheduledThreadPoolExecutor.shutdownNow();
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        scheduler = null;
    }

    public final void emitLiveList() {
        List<PageEntry> listLLIIII;
        String str;
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (entriesLock) {
            try {
                Iterator<PageEntry> it2 = pageEntries.iterator();
                while (it2.hasNext()) {
                    if (it2.next().ref.get() == null) {
                        it2.remove();
                    }
                }
                listLLIIII = C13LP.LLIIII(pageEntries);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (PageEntry pageEntry : listLLIIII) {
            String str2 = pageEntry.hostActivityId;
            if (str2 == null) {
                linkedHashMap.put(pageEntry.pageId, pageEntry);
            } else {
                Object arrayList = linkedHashMap2.get(str2);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap2.put(str2, arrayList);
                }
                ((List) arrayList).add(pageEntry);
            }
        }
        Set setKeySet = linkedHashMap2.keySet();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap2.entrySet()) {
            String str3 = (String) entry.getKey();
            List<PageEntry> list = (List) entry.getValue();
            PageEntry pageEntry2 = (PageEntry) linkedHashMap.get(str3);
            if ((pageEntry2 == null || (str = pageEntry2.pageName) == null) && (str = ((PageEntry) C13LP.LJJJJZI(list)).hostActivityName) == null) {
                str = "";
            }
            n nVar = new n();
            nVar.LJJIIJ("hostActivityId", str3);
            if (pageEntry2 != null) {
                PageRegistry pageRegistry = INSTANCE;
                nVar.LJJIIJ("hostStatus", pageRegistry.statusOf(pageEntry2));
                nVar.LJJIII(Long.valueOf(pageRegistry.ageOf(pageEntry2, jCurrentTimeMillis)), "hostAgeMs");
            } else {
                nVar.LJJIIJ("hostStatus", "gc");
            }
            nVar.LJJIFFI("pageList", INSTANCE.buildPageList(list, jCurrentTimeMillis));
            Object hVar = linkedHashMap3.get(str);
            if (hVar == null) {
                hVar = new h();
                linkedHashMap3.put(str, hVar);
            }
            ((h) hVar).LJJIFFI(nVar);
        }
        Collection collectionValues = linkedHashMap.values();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : collectionValues) {
            if (!setKeySet.contains(((PageEntry) obj).pageId)) {
                arrayList2.add(obj);
            }
        }
        if (!arrayList2.isEmpty()) {
            n nVar2 = new n();
            nVar2.LJJIIJ("hostActivityId", "");
            nVar2.LJJIFFI("pageList", INSTANCE.buildPageList(arrayList2, jCurrentTimeMillis));
            Object hVar2 = linkedHashMap3.get("");
            if (hVar2 == null) {
                hVar2 = new h();
                linkedHashMap3.put("", hVar2);
            }
            ((h) hVar2).LJJIFFI(nVar2);
        }
        h hVar3 = new h();
        for (Map.Entry entry2 : linkedHashMap3.entrySet()) {
            String str4 = (String) entry2.getKey();
            k kVar = (k) entry2.getValue();
            n nVar3 = new n();
            nVar3.LJJIIJ("hostActivity", str4);
            nVar3.LJJIFFI("hostInstances", kVar);
            hVar3.LJJIFFI(nVar3);
        }
        n nVar4 = new n();
        nVar4.LJJII(Boolean.TRUE, "isNew");
        nVar4.LJJIII(Long.valueOf(jCurrentTimeMillis), "ts");
        nVar4.LJJIFFI("pageHosts", hVar3);
        sendEvent(3, nVar4);
    }

    private final void startLiveListPoll(n nVar) {
        long jLJIIZILJ;
        stopLiveListPoll();
        k kVarLJJIIZ = nVar.LJJIIZ("interval");
        if (kVarLJJIIZ != null) {
            jLJIIZILJ = kVarLJJIIZ.LJIIZILJ();
        } else {
            jLJIIZILJ = Mp4ScreenVideoLoadTimeout.CONTROL;
        }
        long jMax = Math.max(2000L, jLJIIZILJ);
        C822660WOy c822660WOy = new C822660WOy(1);
        scheduler = c822660WOy;
        task = c822660WOy.scheduleWithFixedDelay(new Runnable() { // from class: com.ss.android.ugc.aweme.memory.profiler.strategy.PageRegistry.startLiveListPoll.1
            @Override // java.lang.Runnable
            public final void run() {
                C1C7U.LIZ("PageRegistry@2d31.startLiveListPoll$1");
                com_ss_android_ugc_aweme_memory_profiler_strategy_PageRegistry$startLiveListPoll$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                C1C7U.LIZIZ("PageRegistry@2d31.startLiveListPoll$1");
            }

            public final void com_ss_android_ugc_aweme_memory_profiler_strategy_PageRegistry$startLiveListPoll$1__run$___twin___() {
                try {
                    PageRegistry.INSTANCE.emitLiveList();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }

            public static void com_ss_android_ugc_aweme_memory_profiler_strategy_PageRegistry$startLiveListPoll$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(RunnableC2325621 runnableC2325621) {
                try {
                    runnableC2325621.com_ss_android_ugc_aweme_memory_profiler_strategy_PageRegistry$startLiveListPoll$1__run$___twin___();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    if (!C2179971ATj.LIZ(th)) {
                        throw th;
                    }
                }
            }
        }, jMax, jMax, TimeUnit.MILLISECONDS);
    }

    private final String statusOf(PageEntry pageEntry) {
        if (pageEntry.ref.get() != null && pageEntry.destroyTs == null) {
            return "alive";
        }
        if (pageEntry.ref.get() != null && pageEntry.destroyTs != null) {
            return "leaked";
        }
        return "gc";
    }

    public final void attach(Application application) {
        Activity activityLIZ;
        try {
            C1906580ziK.LIZJ().LJIIIZ().LJLLLLLL(new C09JN() { // from class: com.ss.android.ugc.aweme.memory.profiler.strategy.PageRegistry.attach.1
                @Override // X.C09JN
                public /* bridge */ /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("PageRegistry@2d31.attach$1");
                    accept((C813430VvZ) obj);
                    C1C7U.LIZIZ("PageRegistry@2d31.attach$1");
                }

                public final void accept(C813430VvZ c813430VvZ) {
                    PageRegistry.INSTANCE.dispatch(c813430VvZ.LIZ, "onCreate");
                }
            });
            C1906580ziK.LIZJ().LJIILJJIL().LJLLLLLL(new C09JN() { // from class: com.ss.android.ugc.aweme.memory.profiler.strategy.PageRegistry.attach.2
                @Override // X.C09JN
                public /* bridge */ /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("PageRegistry@2d31.attach$2");
                    accept((AbstractC1387200mCc) obj);
                    C1C7U.LIZIZ("PageRegistry@2d31.attach$2");
                }

                public final void accept(AbstractC1387200mCc abstractC1387200mCc) {
                    PageRegistry.INSTANCE.dispatch(abstractC1387200mCc, "onStart");
                }
            });
            C1906580ziK.LIZJ().LJI().LJLLLLLL(new C09JN() { // from class: com.ss.android.ugc.aweme.memory.profiler.strategy.PageRegistry.attach.3
                @Override // X.C09JN
                public /* bridge */ /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("PageRegistry@2d31.attach$3");
                    accept((AbstractC1387200mCc) obj);
                    C1C7U.LIZIZ("PageRegistry@2d31.attach$3");
                }

                public final void accept(AbstractC1387200mCc abstractC1387200mCc) {
                    PageRegistry.INSTANCE.dispatch(abstractC1387200mCc, "onStop");
                }
            });
            C1906580ziK.LIZJ().LJII().LJLLLLLL(new C09JN() { // from class: com.ss.android.ugc.aweme.memory.profiler.strategy.PageRegistry.attach.4
                @Override // X.C09JN
                public /* bridge */ /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("PageRegistry@2d31.attach$4");
                    accept((AbstractC1387200mCc) obj);
                    C1C7U.LIZIZ("PageRegistry@2d31.attach$4");
                }

                public final void accept(AbstractC1387200mCc abstractC1387200mCc) {
                    PageRegistry.INSTANCE.dispatch(abstractC1387200mCc, "onDestroy");
                }
            });
            application.registerActivityLifecycleCallbacks(new C09PC() { // from class: com.ss.android.ugc.aweme.memory.profiler.strategy.PageRegistry.attach.5
                @Override // X.C09PC, android.app.Application.ActivityLifecycleCallbacks
                public void onActivityDestroyed(Activity activity) {
                    PageRegistry.INSTANCE.markDestroyed(activity, System.currentTimeMillis());
                }

                @Override // X.C09PC, android.app.Application.ActivityLifecycleCallbacks
                public void onActivityCreated(Activity activity, Bundle bundle) {
                    PageRegistry.INSTANCE.upsertPageEntry(activity, null, System.currentTimeMillis());
                }
            });
            long jCurrentTimeMillis = System.currentTimeMillis();
            AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
            if (abstractC1387200mCcLIZIZ instanceof C1397950mTx) {
                upsertPageEntry(((C1397950mTx) abstractC1387200mCcLIZIZ).LIZLLL, null, jCurrentTimeMillis);
                return;
            }
            if (abstractC1387200mCcLIZIZ instanceof C1844400y62) {
                Activity activityLIZIZ = ((C1844400y62) abstractC1387200mCcLIZIZ).LIZIZ();
                if (activityLIZIZ != null) {
                    activityLIZ = C1388190mED.LIZ(activityLIZIZ);
                    if (activityLIZ != null) {
                        INSTANCE.upsertPageEntry(activityLIZ, null, jCurrentTimeMillis);
                    }
                } else {
                    activityLIZ = null;
                }
                upsertPageEntry(((C1844400y62) abstractC1387200mCcLIZIZ).LIZLLL, activityLIZ, jCurrentTimeMillis);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    private final long ageOf(PageEntry pageEntry, long j) {
        Long l;
        long jLongValue;
        String strStatusOf = statusOf(pageEntry);
        if (Intrinsics.LJFF(strStatusOf, "alive")) {
            jLongValue = pageEntry.createTs;
        } else if (Intrinsics.LJFF(strStatusOf, "leaked") && (l = pageEntry.destroyTs) != null) {
            jLongValue = l.longValue();
        } else {
            return 0L;
        }
        return j - jLongValue;
    }

    private final h buildPageList(List<PageEntry> list, long j) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (PageEntry pageEntry : list) {
            String str = pageEntry.pageName;
            Object arrayList = linkedHashMap.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(str, arrayList);
            }
            ((List) arrayList).add(pageEntry);
        }
        h hVar = new h();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str2 = (String) entry.getKey();
            List<PageEntry> list2 = (List) entry.getValue();
            n nVar = new n();
            nVar.LJJIIJ("page", str2);
            h hVar2 = new h();
            for (PageEntry pageEntry2 : list2) {
                n nVar2 = new n();
                nVar2.LJJIIJ("pageId", pageEntry2.pageId);
                PageRegistry pageRegistry = INSTANCE;
                nVar2.LJJIIJ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, pageRegistry.statusOf(pageEntry2));
                nVar2.LJJIII(Long.valueOf(pageRegistry.ageOf(pageEntry2, j)), "ageMs");
                hVar2.LJJIFFI(nVar2);
            }
            nVar.LJJIFFI("instances", hVar2);
            hVar.LJJIFFI(nVar);
        }
        return hVar;
    }

    public final void dispatch(AbstractC1387200mCc abstractC1387200mCc, String str) {
        Pair pair;
        Activity activityLIZ = null;
        if (abstractC1387200mCc instanceof C1397950mTx) {
            pair = new Pair(((C1397950mTx) abstractC1387200mCc).LIZLLL, null);
        } else {
            if (!(abstractC1387200mCc instanceof C1844400y62)) {
                return;
            }
            F f = ((C1844400y62) abstractC1387200mCc).LIZLLL;
            Activity activityLIZIZ = abstractC1387200mCc.LIZIZ();
            if (activityLIZIZ != null) {
                activityLIZ = C1388190mED.LIZ(activityLIZIZ);
            }
            pair = new Pair(f, activityLIZ);
        }
        Object first = pair.getFirst();
        Activity activity = (Activity) pair.getSecond();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (Intrinsics.LJFF(str, "onCreate")) {
            upsertPageEntry(first, activity, jCurrentTimeMillis);
        } else if (Intrinsics.LJFF(str, "onDestroy")) {
            markDestroyed(first, jCurrentTimeMillis);
        }
        sendPageEvent(first, str, activity);
    }

    public final void markDestroyed(Object obj, long j) {
        PageEntry next;
        synchronized (entriesLock) {
            try {
                Iterator<PageEntry> it2 = pageEntries.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (next.ref.get() == obj) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                PageEntry pageEntry = next;
                if (pageEntry != null && pageEntry.destroyTs == null) {
                    pageEntry.destroyTs = Long.valueOf(j);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.memory.profiler.core.AbsPeriodicRegistry
    public void startMonitoring(int i, n nVar) {
        startLiveListPoll(nVar);
    }

    @Override // com.ss.android.ugc.aweme.memory.profiler.core.AbsPeriodicRegistry
    public void stopMonitoring(int i, n nVar) {
        stopLiveListPoll();
    }

    private final void sendPageEvent(Object obj, String str, Activity activity) {
        n nVar = new n();
        nVar.LJJII(Boolean.TRUE, "isNew");
        nVar.LJJIIJ("page", obj.getClass().getName());
        nVar.LJJIIJ("event", str);
        nVar.LJJIIJ(FollowStatusChangeMethod.PARAM_UID, C2095108Ir.LIZ(obj));
        if (activity != null) {
            nVar.LJJIIJ("hostActivity", activity.getClass().getName());
            nVar.LJJIIJ("hostActivityId", C2095108Ir.LIZ(activity));
        }
        sendEvent(2, nVar);
    }

    public final void upsertPageEntry(Object obj, Activity activity, long j) {
        String strLIZ;
        PageEntry next;
        String name;
        synchronized (entriesLock) {
            try {
                Iterator<PageEntry> it2 = pageEntries.iterator();
                while (true) {
                    strLIZ = null;
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (next.ref.get() == obj) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                PageEntry pageEntry = next;
                if (pageEntry != null) {
                    if (activity != null && pageEntry.hostActivityId == null) {
                        pageEntry.hostActivityName = activity.getClass().getName();
                        pageEntry.hostActivityId = C2095108Ir.LIZ(activity);
                    }
                    return;
                }
                List<PageEntry> list = pageEntries;
                WeakReference weakReference = new WeakReference(obj);
                String name2 = obj.getClass().getName();
                String strLIZ2 = C2095108Ir.LIZ(obj);
                if (activity != null) {
                    name = activity.getClass().getName();
                    strLIZ = C2095108Ir.LIZ(activity);
                } else {
                    name = null;
                }
                list.add(new PageEntry(weakReference, name2, strLIZ2, name, strLIZ, j, null));
                HprofBridge.register(obj);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static final class PageEntry {
        public final long createTs;
        public Long destroyTs;
        public String hostActivityId;
        public String hostActivityName;
        public final String pageId;
        public final String pageName;
        public final WeakReference<Object> ref;

        public PageEntry(WeakReference<Object> weakReference, String str, String str2, String str3, String str4, long j, Long l) {
            this.ref = weakReference;
            this.pageName = str;
            this.pageId = str2;
            this.hostActivityName = str3;
            this.hostActivityId = str4;
            this.createTs = j;
            this.destroyTs = l;
        }
    }
}
