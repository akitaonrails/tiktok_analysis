package com.ss.android.ugc.aweme.explore.data;

import X.C09C2;
import X.C09CT;
import X.C13BV;
import X.C13E8;
import X.C13LP;
import X.C15438062q;
import X.C15CJ;
import X.C2153908cD;
import X.C2188811AlT;
import X.C2192401ArG;
import X.C589170N8x;
import X.C786410Ut5;
import X.C823050WQl;
import X.EnumC19356210o4;
import X.InterfaceC625970Ogt;
import Y.ARunnableS100S0200000_31;
import Y.ARunnableS33S1200000_31;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.explore.monitor.ff.Explore0VVTrackerMonitor;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public final class ExploreDataLruPool {
    public static final /* synthetic */ int LJIIIZ = 0;
    public final String LIZ = "explore";
    public final String LIZIZ;
    public final String LIZJ;
    public final int LIZLLL;
    public final String LJ;
    public final C13E8<C15CJ> LJFF;
    public final ReentrantLock LJI;
    public final AtomicLong LJII;
    public volatile boolean LJIIIIZZ;

    public final InterfaceC625970Ogt LIZJ() {
        return C2192401ArG.LIZ(C589170N8x.LIZ(this.LIZ), this.LIZIZ);
    }

    public final void LIZ() {
        List<MetaRecord> list;
        if (this.LJIIIIZZ) {
            return;
        }
        this.LJIIIIZZ = true;
        try {
            String string = LIZJ().getString(this.LJ, "");
            if (string == null || string.length() == 0 || (list = (List) C09C2.LIZ().LJIIIIZZ(string, new TypeToken<List<? extends MetaRecord>>() { // from class: X.14uQ
            }.getType())) == null) {
                return;
            }
            for (MetaRecord metaRecord : list) {
                if (metaRecord.ttl > 0 && metaRecord.ts > 0 && System.currentTimeMillis() - metaRecord.ts < TimeUnit.SECONDS.toMillis(metaRecord.ttl)) {
                    this.LJFF.addLast(new C15CJ(metaRecord.id, metaRecord.ts, metaRecord.ttl, null));
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public final void LJI() {
        C13E8<C15CJ> c13e8 = this.LJFF;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(c13e8, 10));
        for (C15CJ c15cj : c13e8) {
            arrayList.add(new MetaRecord(c15cj.LIZ, c15cj.LIZIZ, c15cj.LIZJ));
        }
        C823050WQl.LIZLLL().execute(new ARunnableS100S0200000_31(this, (List) arrayList, 14));
    }

    public final ExploreAwemeList LJII() {
        ExploreAwemeList exploreAwemeListLJ;
        ReentrantLock reentrantLock = this.LJI;
        reentrantLock.lock();
        try {
            LIZ();
            ArrayList arrayList = new ArrayList(2);
            while ((!this.LJFF.isEmpty()) && this.LJFF.first().LIZ()) {
                arrayList.add(this.LJFF.removeFirst().LIZ);
            }
            C15CJ c15cjLJFF = this.LJFF.LJFF();
            if (c15cjLJFF == null) {
                C2153908cD c2153908cD = C2153908cD.LIZ;
                if (!arrayList.isEmpty()) {
                    LJI();
                    LIZIZ(arrayList);
                }
                exploreAwemeListLJ = null;
            } else {
                this.LJFF.removeFirst();
                exploreAwemeListLJ = c15cjLJFF.LIZLLL;
                if (exploreAwemeListLJ == null) {
                    exploreAwemeListLJ = LJ(c15cjLJFF.LIZ);
                }
                C2153908cD c2153908cD2 = C2153908cD.LIZ;
                LJI();
                LIZIZ(C13LP.LJLILLLLZI(c15cjLJFF.LIZ, arrayList));
            }
            reentrantLock.unlock();
            return exploreAwemeListLJ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            reentrantLock.unlock();
            throw th;
        }
    }

    public final List<String> LJIIIZ() {
        if (this.LJFF.isEmpty()) {
            return C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList(2);
        Iterator<C15CJ> it2 = this.LJFF.iterator();
        while (it2.hasNext()) {
            C15CJ next = it2.next();
            if (next.LIZ()) {
                arrayList.add(next.LIZ);
                it2.remove();
            }
        }
        return arrayList;
    }

    public final void LJIIJ() {
        ReentrantLock reentrantLock = this.LJI;
        reentrantLock.lock();
        try {
            C2153908cD c2153908cD = C2153908cD.LIZ;
            this.LJFF.clear();
            this.LJIIIIZZ = false;
            reentrantLock.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            reentrantLock.unlock();
            throw th;
        }
    }

    public final List<ExploreAwemeList> LJIIJJI() {
        ReentrantLock reentrantLock = this.LJI;
        reentrantLock.lock();
        try {
            LIZ();
            List<String> listLJIIIZ = LJIIIZ();
            C13E8<C15CJ> c13e8 = this.LJFF;
            ArrayList arrayList = new ArrayList();
            for (C15CJ c15cj : c13e8) {
                ExploreAwemeList exploreAwemeListLJ = c15cj.LIZLLL;
                if (exploreAwemeListLJ == null) {
                    exploreAwemeListLJ = LJ(c15cj.LIZ);
                    if (exploreAwemeListLJ != null) {
                        c15cj.LIZLLL = exploreAwemeListLJ;
                    } else {
                        exploreAwemeListLJ = null;
                    }
                }
                if (exploreAwemeListLJ != null) {
                    arrayList.add(exploreAwemeListLJ);
                }
            }
            C2153908cD c2153908cD = C2153908cD.LIZ;
            if (!listLJIIIZ.isEmpty()) {
                LJI();
                LIZIZ(listLJIIIZ);
            }
            reentrantLock.unlock();
            return arrayList;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void LIZIZ(List<String> list) {
        if (list.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<String> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(LJFF(it2.next()));
        }
        C823050WQl.LIZLLL().execute(new ARunnableS100S0200000_31(this, (List) arrayList, 13));
    }

    public final boolean LIZLLL(boolean z) {
        boolean z2;
        ReentrantLock reentrantLock = this.LJI;
        reentrantLock.lock();
        try {
            LIZ();
            List<String> listLJIIIZ = LJIIIZ();
            if (!this.LJFF.isEmpty()) {
                z2 = true;
            } else {
                z2 = false;
            }
            C2153908cD c2153908cD = C2153908cD.LIZ;
            if (!listLJIIIZ.isEmpty()) {
                LJI();
                LIZIZ(listLJIIIZ);
            }
            if (z && !z2) {
                if (!listLJIIIZ.isEmpty()) {
                    Explore0VVTrackerMonitor.INSTANCE.preloadDataStatus(EnumC19356210o4.EXPIRED_DATA);
                } else {
                    Explore0VVTrackerMonitor.INSTANCE.preloadDataStatus(EnumC19356210o4.NO_DATA);
                }
            }
            reentrantLock.unlock();
            return z2;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            reentrantLock.unlock();
            throw th;
        }
    }

    public final ExploreAwemeList LJ(String str) {
        try {
            String string = LIZJ().getString(LJFF(str), "");
            if (string != null && string.length() != 0) {
                return (ExploreAwemeList) C09C2.LIZ().LJII(string, ExploreAwemeList.class);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return null;
    }

    public final String LJFF(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZJ);
        sbLIZ.append("_payload");
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void LJIIIIZZ(long j, ExploreAwemeList exploreAwemeList) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        sb.append(jCurrentTimeMillis);
        sb.append('-');
        sb.append(this.LJII.incrementAndGet());
        String string = sb.toString();
        C15CJ c15cj = new C15CJ(string, jCurrentTimeMillis, j, exploreAwemeList);
        ArrayList arrayList = new ArrayList(2);
        ReentrantLock reentrantLock = this.LJI;
        reentrantLock.lock();
        try {
            LIZ();
            this.LJFF.addFirst(c15cj);
            while (this.LJFF.size() > this.LIZLLL) {
                arrayList.add(this.LJFF.removeLast().LIZ);
            }
            C2153908cD c2153908cD = C2153908cD.LIZ;
            LJI();
            C823050WQl.LIZLLL().execute(new ARunnableS33S1200000_31(this, exploreAwemeList, LJFF(string), 7));
            if (!arrayList.isEmpty()) {
                LIZIZ(arrayList);
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            reentrantLock.unlock();
            throw th;
        }
    }

    public static final class MetaRecord {

        @C09CT(FollowStatusChangeMethod.PARAM_UID)
        public final String id;

        @C09CT("ts")
        public final long ts;

        @C09CT("ttl")
        public final long ttl;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MetaRecord)) {
                return false;
            }
            MetaRecord metaRecord = (MetaRecord) obj;
            return Intrinsics.LJFF(this.id, metaRecord.id) && this.ts == metaRecord.ts && this.ttl == metaRecord.ttl;
        }

        public final int hashCode() {
            return (((this.id.hashCode() * 31) + C786410Ut5.Y2(this.ts)) * 31) + C786410Ut5.Y2(this.ttl);
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("MetaRecord(id=");
            sbLIZ.append(this.id);
            sbLIZ.append(", ts=");
            sbLIZ.append(this.ts);
            sbLIZ.append(", ttl=");
            sbLIZ.append(this.ttl);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public MetaRecord(String str, long j, long j2) {
            this.id = str;
            this.ts = j;
            this.ttl = j2;
        }
    }

    public ExploreDataLruPool(String str, String str2, int i, String str3) {
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = i;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str2);
        sbLIZ.append("_meta");
        this.LJ = C2188811AlT.LIZIZ(sbLIZ);
        this.LJFF = new C13E8<>();
        this.LJI = new ReentrantLock();
        this.LJII = new AtomicLong(0L);
    }
}
