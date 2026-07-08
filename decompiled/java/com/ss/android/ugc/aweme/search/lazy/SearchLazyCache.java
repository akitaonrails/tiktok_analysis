package com.ss.android.ugc.aweme.search.lazy;

import X.C01GW;
import X.C0CMS;
import X.C0PH1;
import X.C0R1H;
import X.C19EG;
import X.C1C7U;
import X.C452501pT;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AFwS196S0000000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchLazyCache {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(196));
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(198));
    public final C01GW LIZJ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(192));
    public final C01GW LIZLLL = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(194));
    public final C01GW LJ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(197));
    public final C01GW LJFF = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(193));
    public final C01GW LJI = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(195));

    public final void LIZ(C19EG c19eg, final LifecycleOwner lifecycleOwner, final C0PH1 c0ph1) {
        Object objPutIfAbsent;
        Object objPutIfAbsent2;
        Object objPutIfAbsent3;
        String localClassName = c19eg.getLocalClassName();
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.LIZ.getValue();
        Object copyOnWriteArrayList = concurrentHashMap.get(localClassName);
        if (copyOnWriteArrayList == null && (objPutIfAbsent3 = concurrentHashMap.putIfAbsent(localClassName, (copyOnWriteArrayList = new CopyOnWriteArrayList()))) != null) {
            copyOnWriteArrayList = objPutIfAbsent3;
        }
        final CopyOnWriteArrayList copyOnWriteArrayList2 = (CopyOnWriteArrayList) copyOnWriteArrayList;
        ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) this.LIZJ.getValue();
        Object copyOnWriteArrayList3 = concurrentHashMap2.get(localClassName);
        if (copyOnWriteArrayList3 == null && (objPutIfAbsent2 = concurrentHashMap2.putIfAbsent(localClassName, (copyOnWriteArrayList3 = new CopyOnWriteArrayList()))) != null) {
            copyOnWriteArrayList3 = objPutIfAbsent2;
        }
        final CopyOnWriteArrayList copyOnWriteArrayList4 = (CopyOnWriteArrayList) copyOnWriteArrayList3;
        ConcurrentHashMap concurrentHashMap3 = (ConcurrentHashMap) this.LIZLLL.getValue();
        Object copyOnWriteArrayList5 = concurrentHashMap3.get(localClassName);
        if (copyOnWriteArrayList5 == null && (objPutIfAbsent = concurrentHashMap3.putIfAbsent(localClassName, (copyOnWriteArrayList5 = new CopyOnWriteArrayList()))) != null) {
            copyOnWriteArrayList5 = objPutIfAbsent;
        }
        final CopyOnWriteArrayList copyOnWriteArrayList6 = (CopyOnWriteArrayList) copyOnWriteArrayList5;
        int i = c0ph1.LL;
        if (i == C0CMS.TOP_PRIORITY.getType()) {
            copyOnWriteArrayList2.add(c0ph1);
        } else if (i == C0CMS.HIGH_PRIORITY.getType()) {
            copyOnWriteArrayList4.add(c0ph1);
        } else {
            copyOnWriteArrayList6.add(0, c0ph1);
        }
        c19eg.runOnUiThread(new Runnable() { // from class: com.ss.android.ugc.aweme.search.lazy.SearchLazyCache$put$1
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("SearchLazyCache@2581.put$1");
                try {
                    LifecycleOwner lifecycleOwner2 = lifecycleOwner;
                    final CopyOnWriteArrayList<C0PH1> copyOnWriteArrayList7 = copyOnWriteArrayList2;
                    final C0PH1 c0ph12 = c0ph1;
                    final CopyOnWriteArrayList<C0PH1> copyOnWriteArrayList8 = copyOnWriteArrayList4;
                    final CopyOnWriteArrayList<C0PH1> copyOnWriteArrayList9 = copyOnWriteArrayList6;
                    C0R1H.LIZIZ(lifecycleOwner2, new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.search.lazy.SearchLazyCache$put$1.1
                        @Override // androidx.lifecycle.LifecycleEventObserver
                        public final void onStateChanged(LifecycleOwner lifecycleOwner3, Lifecycle.Event event) {
                            if (event == Lifecycle.Event.ON_DESTROY) {
                                copyOnWriteArrayList7.remove(c0ph12);
                                copyOnWriteArrayList8.remove(c0ph12);
                                copyOnWriteArrayList9.remove(c0ph12);
                            }
                        }
                    });
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("SearchLazyCache@2581.put$1");
            }
        });
    }
}
