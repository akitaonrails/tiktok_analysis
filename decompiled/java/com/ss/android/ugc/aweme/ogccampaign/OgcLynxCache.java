package com.ss.android.ugc.aweme.ogccampaign;

import X.AbstractC848400XPy;
import X.AnonymousClass0206;
import X.C01GW;
import X.C01VH;
import X.C01VI;
import X.C054G;
import X.C098200Yq;
import X.C09A1;
import X.C09CT;
import X.C0PEM;
import X.C0XK4;
import X.C0XQ7;
import X.C1227904rF;
import X.C13BV;
import X.C13LP;
import X.C15438062q;
import X.C189200o6;
import X.C2188811AlT;
import X.C2296808zG;
import X.C2296908zH;
import X.C23250099c;
import X.C452501pT;
import X.C512401z8;
import X.C786410Ut5;
import android.os.SystemClock;
import android.util.Log;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class OgcLynxCache {
    public static final OgcLynxCache LIZ = new OgcLynxCache();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(198));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(199));
    public static final C054G LIZLLL = C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), C0PEM.LIZJ));
    public static final ConcurrentHashMap<String, CacheEntry> LJ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, Long> LJFF = new ConcurrentHashMap<>();
    public static volatile String LJI;
    public static volatile boolean LJII;

    public static String LIZJ() {
        Object c098200Yq;
        try {
            c098200Yq = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        String str = (String) c098200Yq;
        return str == null ? "" : str;
    }

    public static void LJ() {
        String strLIZJ = LIZJ();
        if (Intrinsics.LJFF(LJI, strLIZJ) || LJII) {
            return;
        }
        LJII = true;
        C23250099c.LIZLLL(LIZLLL, null, null, new C01VI(strLIZJ, null), 3);
    }

    public static CacheEntry LIZIZ(String str) {
        if (!Intrinsics.LJFF(LJI, LIZJ())) {
            LJ();
            return null;
        }
        return LJ.get(str);
    }

    public final void LJFF(String str) {
        Object c098200Yq;
        List<String> list;
        Object c098200Yq2;
        synchronized (this) {
            try {
                if (Intrinsics.LJFF(LJI, str)) {
                    return;
                }
                LJ.clear();
                LJFF.clear();
                try {
                    LIZ.getClass();
                    Keva keva = (Keva) LIZJ.getValue();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("idx_");
                    sbLIZ.append(str);
                    String string = keva.getString(C2188811AlT.LIZIZ(sbLIZ), null);
                    if (string != null) {
                        C1227904rF c1227904rF = (C1227904rF) LIZIZ.getValue();
                        Type type = new TypeToken<List<? extends String>>() { // from class: X.01VJ
                        }.getType();
                        c1227904rF.getClass();
                        list = (List) C1227904rF.LIZJ(string, type);
                        if (list == null) {
                            list = C13BV.INSTANCE;
                        }
                    } else {
                        list = C13BV.INSTANCE;
                    }
                    for (String str2 : list) {
                        String string2 = ((Keva) LIZJ.getValue()).getString(LIZ(str, str2), null);
                        if (string2 != null) {
                            try {
                                ((C1227904rF) LIZIZ.getValue()).getClass();
                                c098200Yq2 = (CacheEntry) C1227904rF.LIZIZ(string2, CacheEntry.class);
                                C189200o6.m2constructorimpl(c098200Yq2);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                c098200Yq2 = new C098200Yq(th);
                                C189200o6.m2constructorimpl(c098200Yq2);
                            }
                            if (C189200o6.m7isFailureimpl(c098200Yq2)) {
                                c098200Yq2 = null;
                            }
                            CacheEntry cacheEntry = (CacheEntry) c098200Yq2;
                            if (cacheEntry != null) {
                                LJ.put(str2, cacheEntry);
                            }
                        }
                    }
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("cache loadFromDisk: ");
                    sbLIZ2.append(LJ.size());
                    sbLIZ2.append(" entries");
                    c098200Yq = Integer.valueOf(Log.d("OgcLynx", C2188811AlT.LIZIZ(sbLIZ2)));
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    c098200Yq = new C098200Yq(th2);
                    C189200o6.m2constructorimpl(c098200Yq);
                    C189200o6.m5exceptionOrNullimpl(c098200Yq);
                    LJI = str;
                }
                C189200o6.m5exceptionOrNullimpl(c098200Yq);
                LJI = str;
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
                throw th3;
            }
        }
    }

    public static String LIZ(String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("e_");
        sbLIZ.append(str);
        sbLIZ.append('_');
        sbLIZ.append(str2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static boolean LIZLLL(int i, String str) {
        Integer num;
        CacheEntry cacheEntryLIZIZ = LIZIZ(str);
        if (cacheEntryLIZIZ == null) {
            return false;
        }
        CacheEntry cacheEntryLIZIZ2 = LIZIZ(str);
        if (cacheEntryLIZIZ2 != null && (num = cacheEntryLIZIZ2.cacheTtlSec) != null) {
            i = num.intValue();
        }
        if (i > 0 && ((long) C0XK4.LIZ()) - cacheEntryLIZIZ.serverTimeSec > i) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v3, types: [X.13BV] */
    public final void LJI(int i, String str, String str2, String str3) {
        ?? arrayList;
        String strLIZJ = LIZJ();
        if (!Intrinsics.LJFF(LJI, strLIZJ)) {
            LJFF(strLIZJ);
        }
        CacheEntry cacheEntry = new CacheEntry(str, str2, C0XK4.LIZ(), Integer.valueOf(i), str3);
        ConcurrentHashMap<String, CacheEntry> concurrentHashMap = LJ;
        concurrentHashMap.put(str, cacheEntry);
        LJFF.put(str, Long.valueOf(SystemClock.elapsedRealtime()));
        if (concurrentHashMap.size() <= 10) {
            arrayList = C13BV.INSTANCE;
        } else {
            List listLL = C13LP.LL(C13LP.LJLLLL(new C512401z8(11), concurrentHashMap.values()), concurrentHashMap.size() - 10);
            arrayList = new ArrayList(C15438062q.LJIJJ(listLL, 10));
            Iterator it2 = listLL.iterator();
            while (it2.hasNext()) {
                arrayList.add(((CacheEntry) it2.next()).activityId);
            }
            for (Object obj : arrayList) {
                LJ.remove(obj);
                LJFF.remove(obj);
            }
        }
        String str4 = LJI;
        if (str4 != null) {
            C23250099c.LIZLLL(LIZLLL, null, null, new C01VH(str4, str, cacheEntry, arrayList, Collections.list(LJ.keys()), null), 3);
        }
    }

    public static final class CacheEntry {

        @C09CT("activity_id")
        public final String activityId;

        @C09CT("cache_ttl_sec")
        public final Integer cacheTtlSec;

        @C09CT("response_json")
        public final String responseJson;

        @C09CT("server_time_sec")
        public final long serverTimeSec;

        @C09CT("write_source")
        public final String writeSource;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CacheEntry)) {
                return false;
            }
            CacheEntry cacheEntry = (CacheEntry) obj;
            return Intrinsics.LJFF(this.activityId, cacheEntry.activityId) && Intrinsics.LJFF(this.responseJson, cacheEntry.responseJson) && this.serverTimeSec == cacheEntry.serverTimeSec && Intrinsics.LJFF(this.cacheTtlSec, cacheEntry.cacheTtlSec) && Intrinsics.LJFF(this.writeSource, cacheEntry.writeSource);
        }

        public final int hashCode() {
            int iHashCode = ((((this.activityId.hashCode() * 31) + this.responseJson.hashCode()) * 31) + C786410Ut5.Y2(this.serverTimeSec)) * 31;
            Integer num = this.cacheTtlSec;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            String str = this.writeSource;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("CacheEntry(activityId=");
            sbLIZ.append(this.activityId);
            sbLIZ.append(", responseJson=");
            sbLIZ.append(this.responseJson);
            sbLIZ.append(", serverTimeSec=");
            sbLIZ.append(this.serverTimeSec);
            sbLIZ.append(", cacheTtlSec=");
            sbLIZ.append(this.cacheTtlSec);
            sbLIZ.append(", writeSource=");
            sbLIZ.append(this.writeSource);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public CacheEntry(String str, String str2, long j, Integer num, String str3) {
            this.activityId = str;
            this.responseJson = str2;
            this.serverTimeSec = j;
            this.cacheTtlSec = num;
            this.writeSource = str3;
        }
    }
}
