package com.ss.android.ugc.aweme.journey.events;

import X.C01GW;
import X.C09CT;
import X.C0NIV;
import X.C0NJH;
import X.C0PEM;
import X.C10H5;
import X.C10SV;
import X.C1514430pVp;
import X.C2188811AlT;
import X.C2296808zG;
import X.C23250099c;
import X.C452501pT;
import X.C591670NIn;
import X.C591680NIo;
import X.C591690NIp;
import X.C823050WQl;
import X.RunnableC591660NIm;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.utils.GsonProvider;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes10.dex */
public final class NujPerformanceTrackerV2 {
    public static boolean LIZIZ;
    public static boolean LIZLLL;
    public static final Map<String, Long> LJ;
    public static Map<String, String> LJFF;
    public static final C591670NIn LJI;
    public static boolean LJII;
    public static final NujPerformanceTrackerV2 LIZ = new NujPerformanceTrackerV2();
    public static final C01GW LIZJ = C452501pT.LIZIZ(new C591680NIo());

    static {
        Boolean boolLIZLLL = C1514430pVp.LIZLLL();
        LIZLLL = boolLIZLLL != null ? boolLIZLLL.booleanValue() : true;
        LJ = new ConcurrentHashMap();
        LJFF = new ConcurrentHashMap();
        LJI = new C591670NIn();
        LJII = true;
        LJFF.put("general_coldstart_firstlaunch", LIZLLL ? "1" : CardStruct.IStatusCode.DEFAULT);
        LJFF.put("numberOfTimesUserBackground", CardStruct.IStatusCode.DEFAULT);
    }

    public static final void LIZJ() {
        LIZ.getClass();
        if (LJII()) {
            if (!LIZIZ) {
                try {
                    NujPerfV2LocalCache nujPerfV2LocalCache = (NujPerfV2LocalCache) ((GsonProvider) ServiceManager.get().getService(GsonProvider.class)).getGson().LJII(((Keva) LIZJ.getValue()).getString("local_cache", ""), NujPerfV2LocalCache.class);
                    if (nujPerfV2LocalCache != null) {
                        Map<String, String> map = nujPerfV2LocalCache.reportMap;
                        LJFF = map;
                        map.put("is_from_cache", "1");
                        LJFF.put("general_coldstart_firstlaunch", CardStruct.IStatusCode.DEFAULT);
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            LIZ.getClass();
            LJI(Mp4ScreenVideoLoadTimeout.CONTROL);
            LIZLLL = false;
            ((Keva) LIZJ.getValue()).storeBoolean("finished_monitoring", true);
        }
    }

    public static boolean LJII() {
        if (((Number) C591690NIp.LIZ.getValue()).intValue() == 1) {
            return LIZLLL || (((Keva) LIZJ.getValue()).getBoolean("finished_monitoring", false) ^ true);
        }
        return false;
    }

    public static final class NujPerfV2LocalCache {

        @C09CT("report_map")
        public final Map<String, String> reportMap;

        public NujPerfV2LocalCache(Map<String, String> map) {
            this.reportMap = map;
        }
    }

    public static final void LIZ(C0NJH c0njh) {
        LIZ.getClass();
        if (!LJII()) {
            return;
        }
        LIZLLL(LJ, c0njh.toString(), LJI.invoke());
    }

    public static void LJI(long j) {
        if (j > 0) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C0NIV(j, null), 3);
        } else {
            C10SV.LIZIZ(C10H5.NUJ_PERFORMANCE_V2, LJFF);
        }
    }

    public static final void LIZIZ(C0NJH c0njh, boolean z) {
        LIZ.getClass();
        if (!LJII()) {
            return;
        }
        String string = c0njh.toString();
        Long l = (Long) ((ConcurrentHashMap) LJ).get(string);
        if (l != null) {
            LIZLLL(LJFF, string, String.valueOf(((Number) LJI.invoke()).longValue() - l.longValue()));
            LJI(0L);
            if (z) {
                C823050WQl.LIZIZ().submit(RunnableC591660NIm.LL);
            }
        }
    }

    public static void LIZLLL(Map map, Object obj, Object obj2) {
        synchronized (map) {
            try {
                if (map.get(obj) == null) {
                    map.put(obj, obj2);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJ(String str, String str2, boolean z) {
        if (!LJII()) {
            return;
        }
        if (z) {
            LJFF.put(str, str2);
        } else {
            LIZLLL(LJFF, str, str2);
        }
        LJI(0L);
    }

    public static void LJFF(C0NJH c0njh, String str, long j, boolean z) {
        if (!LJII()) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(c0njh);
        LIZLLL(LJFF, C2188811AlT.LIZIZ(sbLIZ), String.valueOf(j));
        LJFF.put("last_step", str);
        if (z) {
            C823050WQl.LIZIZ().submit(RunnableC591660NIm.LL);
        }
    }
}
