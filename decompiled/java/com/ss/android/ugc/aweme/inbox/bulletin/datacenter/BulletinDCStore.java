package com.ss.android.ugc.aweme.inbox.bulletin.datacenter;

import X.C0OI4;
import X.C0OPX;
import X.C2188811AlT;
import X.C2296808zG;
import X.C605550Np3;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinDCStore {
    public static final HashMap<String, C0OI4> LIZ = new HashMap<>();
    public static final HashMap<String, Set<Lifecycle>> LIZIZ = new HashMap<>();
    public static final HashMap<String, C605550Np3> LIZJ = new HashMap<>();
    public static final HashMap<String, Set<Lifecycle>> LIZLLL = new HashMap<>();

    public static final class DCEvictionObserver implements LifecycleEventObserver {
        public final Lifecycle LL;
        public final String LLILLJJLI;

        public DCEvictionObserver(Lifecycle lifecycle, String str) {
            this.LL = lifecycle;
            this.LLILLJJLI = str;
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            HashMap<String, Set<Lifecycle>> map;
            Set<Lifecycle> set;
            if (event != Lifecycle.Event.ON_DESTROY || (set = (map = BulletinDCStore.LIZIZ).get(this.LLILLJJLI)) == null) {
                return;
            }
            set.remove(this.LL);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("BBArch [DCStore] DC lifecycle destroyed: key=");
            sbLIZ.append(this.LLILLJJLI);
            sbLIZ.append(", remaining=");
            sbLIZ.append(set.size());
            C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
            if (set.isEmpty()) {
                HashMap<String, C0OI4> map2 = BulletinDCStore.LIZ;
                C0OI4 c0oi4Remove = map2.remove(this.LLILLJJLI);
                if (c0oi4Remove != null) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("BBArch [DC] dispose: bbId=");
                    sbLIZ2.append(c0oi4Remove.LIZ);
                    C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ2));
                    c0oi4Remove.LIZLLL = true;
                    c0oi4Remove.LJFF.LJIIJJI(null);
                    C2296808zG.LIZJ(c0oi4Remove.LIZJ, null);
                }
                map.remove(this.LLILLJJLI);
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("BBArch [DCStore] DC evicted: key=");
                sbLIZ3.append(this.LLILLJJLI);
                sbLIZ3.append(", storeSize=");
                sbLIZ3.append(map2.size());
                C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ3));
            }
        }
    }

    public static final class SchedulerEvictionObserver implements LifecycleEventObserver {
        public final Lifecycle LL;
        public final String LLILLJJLI;

        public SchedulerEvictionObserver(Lifecycle lifecycle, String str) {
            this.LL = lifecycle;
            this.LLILLJJLI = str;
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            HashMap<String, Set<Lifecycle>> map;
            Set<Lifecycle> set;
            if (event != Lifecycle.Event.ON_DESTROY || (set = (map = BulletinDCStore.LIZLLL).get(this.LLILLJJLI)) == null) {
                return;
            }
            set.remove(this.LL);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("BBArch [DCStore] Scheduler lifecycle destroyed: key=");
            sbLIZ.append(this.LLILLJJLI);
            sbLIZ.append(", remaining=");
            sbLIZ.append(set.size());
            C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
            if (set.isEmpty()) {
                HashMap<String, C605550Np3> map2 = BulletinDCStore.LIZJ;
                C605550Np3 c605550Np3Remove = map2.remove(this.LLILLJJLI);
                if (c605550Np3Remove != null) {
                    c605550Np3Remove.LIZIZ();
                }
                map.remove(this.LLILLJJLI);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("BBArch [DCStore] Scheduler evicted: key=");
                sbLIZ2.append(this.LLILLJJLI);
                sbLIZ2.append(", schedulerStoreSize=");
                sbLIZ2.append(map2.size());
                C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ2));
            }
        }
    }

    public static C0OI4 LIZ(long j, Lifecycle lifecycle) {
        String strValueOf = String.valueOf(j);
        if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("BBArch [DCStore] obtain on DESTROYED lifecycle — detached DC: key=");
            sbLIZ.append(strValueOf);
            C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
            return new C0OI4(j);
        }
        HashMap<String, C0OI4> map = LIZ;
        C0OI4 c0oi4 = map.get(strValueOf);
        if (c0oi4 == null) {
            c0oi4 = new C0OI4(j);
            map.put(strValueOf, c0oi4);
        }
        C0OI4 c0oi42 = c0oi4;
        HashMap<String, Set<Lifecycle>> map2 = LIZIZ;
        Set<Lifecycle> linkedHashSet = map2.get(strValueOf);
        if (linkedHashSet == null) {
            linkedHashSet = new LinkedHashSet<>();
            map2.put(strValueOf, linkedHashSet);
        }
        Set<Lifecycle> set = linkedHashSet;
        if (!set.contains(lifecycle)) {
            set.add(lifecycle);
            lifecycle.addObserver(new DCEvictionObserver(lifecycle, strValueOf));
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("BBArch [DCStore] obtain: key=");
        sbLIZ2.append(strValueOf);
        sbLIZ2.append(", refCount=");
        sbLIZ2.append(set.size());
        sbLIZ2.append(", storeSize=");
        sbLIZ2.append(map.size());
        C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ2));
        return c0oi42;
    }

    public static void LIZIZ(String str, long j, C605550Np3 c605550Np3, Lifecycle lifecycle) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(':');
        sbLIZ.append(j);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C605550Np3 c605550Np3Put = LIZJ.put(strLIZIZ, c605550Np3);
        if (c605550Np3Put != null && c605550Np3Put != c605550Np3) {
            c605550Np3Put.LIZIZ();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("BBArch [DCStore] replaced & disposed previous scheduler: key=");
            sbLIZ2.append(strLIZIZ);
            C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ2));
        }
        HashMap<String, Set<Lifecycle>> map = LIZLLL;
        Set<Lifecycle> linkedHashSet = map.get(strLIZIZ);
        if (linkedHashSet == null) {
            linkedHashSet = new LinkedHashSet<>();
            map.put(strLIZIZ, linkedHashSet);
        }
        Set<Lifecycle> set = linkedHashSet;
        if (!set.contains(lifecycle)) {
            set.add(lifecycle);
            lifecycle.addObserver(new SchedulerEvictionObserver(lifecycle, strLIZIZ));
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("BBArch [DCStore] registerScheduler: key=");
        sbLIZ3.append(strLIZIZ);
        sbLIZ3.append(", refCount=");
        sbLIZ3.append(set.size());
        C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ3));
    }
}
