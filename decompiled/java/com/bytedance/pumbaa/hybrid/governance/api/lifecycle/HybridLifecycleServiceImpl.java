package com.bytedance.pumbaa.hybrid.governance.api.lifecycle;

import X.C0WM3;
import X.C0WM5;
import X.C0WM8;
import X.C0WMF;
import X.C0WN8;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class HybridLifecycleServiceImpl implements IHybridLifecycleService {
    public final ConcurrentHashMap<C0WMF, List<C0WM8>> LIZ = new ConcurrentHashMap<>();
    public final CopyOnWriteArrayList<C0WM8> LIZIZ = new CopyOnWriteArrayList<>();
    public final ConcurrentHashMap<C0WN8, List<C0WM8>> LIZJ = new ConcurrentHashMap<>();
    public final CopyOnWriteArrayList<C0WM5> LIZLLL = new CopyOnWriteArrayList<>();
    public final ConcurrentHashMap<C0WN8, List<C0WM5>> LJ = new ConcurrentHashMap<>();

    @Override // com.bytedance.pumbaa.hybrid.governance.api.lifecycle.IHybridLifecycleService
    public final List<C0WM5> LIZ(C0WN8 c0wn8) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.LIZLLL);
        List<C0WM5> list = this.LJ.get(c0wn8);
        if (list != null) {
            arrayList.addAll(list);
        }
        return Collections.unmodifiableList(arrayList);
    }

    @Override // com.bytedance.pumbaa.hybrid.governance.api.lifecycle.IHybridLifecycleService
    public final List<C0WM8> LIZIZ(C0WMF c0wmf) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.LIZIZ);
        List<C0WM8> list = this.LIZJ.get(c0wmf.LIZIZ);
        if (list != null) {
            arrayList.addAll(list);
        }
        List<C0WM8> list2 = this.LIZ.get(c0wmf);
        if (list2 != null) {
            arrayList.addAll(list2);
        }
        return Collections.unmodifiableList(arrayList);
    }

    @Override // com.bytedance.pumbaa.hybrid.governance.api.lifecycle.IHybridLifecycleService
    public final void LIZJ(C0WM8 c0wm8) {
        if (LJ(c0wm8, this.LIZIZ)) {
            return;
        }
        this.LIZIZ.add(c0wm8);
    }

    @Override // com.bytedance.pumbaa.hybrid.governance.api.lifecycle.IHybridLifecycleService
    public final void LIZLLL(C0WM3 c0wm3) {
        if (LJ(c0wm3, this.LIZLLL)) {
            return;
        }
        this.LIZLLL.add(c0wm3);
    }

    public static boolean LJ(Object obj, List list) {
        if ((list instanceof Collection) && ((CopyOnWriteArrayList) list).isEmpty()) {
            return false;
        }
        Iterator it2 = ((CopyOnWriteArrayList) list).iterator();
        while (it2.hasNext()) {
            if (Intrinsics.LJFF(it2.next().getClass(), obj.getClass())) {
                return true;
            }
        }
        return false;
    }
}
