package com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.privilegepage.repository;

import X.AbstractC510000JzK;
import X.C09JN;
import X.C0IFW;
import X.C0IH1;
import X.C11NJ;
import X.C11S5;
import X.C1697810uHb;
import X.C1701940uOG;
import X.C20441214yg;
import X.C259800zU;
import X.C356901a3;
import X.C470590Icr;
import X.C480460Ism;
import X.C500260Jjc;
import X.C509170Jxz;
import X.C509620Jyi;
import X.C510010JzL;
import X.C510020JzM;
import X.C510090JzT;
import X.C510130JzX;
import X.C510380Jzw;
import X.C516700KOe;
import X.EnumC510330Jzr;
import X.InterfaceC1487280oo2;
import X.InterfaceC510100JzU;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.comp.api.subscription.api.SubscribeApi;
import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.privilegepage.repository.PrivilegeRepository;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.k;
import com.google.gson.n;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS237S0000000_7;
import webcast.api.sub.GetSubPrivilegeDetailResponse;

/* JADX INFO: loaded from: classes8.dex */
public final class PrivilegeRepository implements DefaultLifecycleObserver, C0IFW, GenericLifecycleObserver {
    public static final /* synthetic */ int LLJ = 0;
    public final String LL;
    public final ConcurrentHashMap<C509620Jyi, AbstractC510000JzK> LLILLJJLI = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<C509620Jyi, C470590Icr<n>> LLILLL = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<C509620Jyi, List<InterfaceC510100JzU>> LLILZ = new ConcurrentHashMap<>();
    public final C11NJ LLILZIL = new C11NJ();
    public final Set<WeakReference<LifecycleOwner>> LLILZLL = new LinkedHashSet();
    public final ArrayList<Runnable> LLIZ = new ArrayList<>();
    public boolean LLIZLLLIL;

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZLLL(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        C356901a3.LJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        C356901a3.LJFF(this, lifecycleOwner);
    }

    @Override // X.C0IFW
    public final void cancel() {
        this.LLILZIL.dispose();
    }

    @Override // X.C0IFW
    public final void pause() {
        C20441214yg.LJIIIZ("matao-test", "PrivilegeRepository pause");
        this.LLIZLLLIL = true;
    }

    @Override // X.C0IFW
    public final void resume() {
        C20441214yg.LJIIIZ("matao-test", "PrivilegeRepository resume");
        this.LLIZLLLIL = false;
        if (this.LLIZ.isEmpty()) {
            return;
        }
        Iterator<Runnable> it2 = this.LLIZ.iterator();
        while (it2.hasNext()) {
            it2.next().run();
        }
        this.LLIZ.clear();
    }

    @Override // X.C0IFW
    public final void W() {
        cancel();
        this.LLIZ.clear();
    }

    public PrivilegeRepository(String str) {
        this.LL = str;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZIZ(this, lifecycleOwner);
        C500260Jjc.LJJJLZIJ(this.LLILZLL, new C510090JzT(lifecycleOwner));
        if (this.LLILZLL.isEmpty()) {
            this.LLILZ.clear();
            this.LLILZIL.LJ();
            this.LLILLJJLI.clear();
            this.LLILLL.clear();
            C510130JzX.LIZLLL.LIZ(this.LL);
            ((HashSet) C0IH1.LIZ).remove(this);
            this.LLIZLLLIL = false;
        }
        lifecycleOwner.getLifecycle().removeObserver(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [T, X.0JzM, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [T, X.0JzL, java.lang.Object] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void LIZ(String str, boolean z, String str2, boolean z2, final InterfaceC510100JzU interfaceC510100JzU, Map<String, String> map, long j) {
        final C509620Jyi c509620Jyi = new C509620Jyi(j, this.LL, str, z);
        final C259800zU c259800zU = new C259800zU();
        ConcurrentHashMap<C509620Jyi, AbstractC510000JzK> concurrentHashMap = this.LLILLJJLI;
        AbstractC510000JzK abstractC510000JzK = concurrentHashMap.get(c509620Jyi);
        T t = abstractC510000JzK;
        if (abstractC510000JzK == null) {
            C510020JzM c510020JzM = new AbstractC510000JzK() { // from class: X.0JzM
            };
            AbstractC510000JzK abstractC510000JzKPutIfAbsent = concurrentHashMap.putIfAbsent(c509620Jyi, c510020JzM);
            t = c510020JzM;
            if (abstractC510000JzKPutIfAbsent != null) {
                t = abstractC510000JzKPutIfAbsent;
            }
        }
        c259800zU.element = t;
        if (z2) {
            ?? r1 = new AbstractC510000JzK() { // from class: X.0JzM
            };
            this.LLILLJJLI.put(c509620Jyi, (AbstractC510000JzK) r1);
            c259800zU.element = r1;
        }
        T t2 = c259800zU.element;
        if (t2 instanceof C509170Jxz) {
            C509170Jxz c509170Jxz = (C509170Jxz) t2;
            interfaceC510100JzU.QP(this.LLILLL.get(c509620Jyi));
            c509170Jxz.LIZIZ = true;
            interfaceC510100JzU.yO(c509170Jxz, true);
            List<InterfaceC510100JzU> list = this.LLILZ.get(c509620Jyi);
            if (list != null) {
                for (InterfaceC510100JzU interfaceC510100JzU2 : list) {
                    if (interfaceC510100JzU2 != null) {
                        interfaceC510100JzU2.yO(c509170Jxz, true);
                    }
                }
            }
            List<InterfaceC510100JzU> list2 = this.LLILZ.get(c509620Jyi);
            if (list2 != null) {
                list2.clear();
                return;
            }
            return;
        }
        if (t2 instanceof C510010JzL) {
            if (this.LLILZ.get(c509620Jyi) == null) {
                this.LLILZ.put(c509620Jyi, C1697810uHb.LJIILJJIL(interfaceC510100JzU));
                return;
            }
            List<InterfaceC510100JzU> list3 = this.LLILZ.get(c509620Jyi);
            if (list3 == null) {
                return;
            }
            list3.add(interfaceC510100JzU);
            return;
        }
        ?? r12 = new AbstractC510000JzK() { // from class: X.0JzL
        };
        this.LLILLJJLI.put(c509620Jyi, (AbstractC510000JzK) r12);
        c259800zU.element = r12;
        C480460Ism.LIZ().getClass();
        this.LLILZIL.LIZ(C510380Jzw.LJIILJJIL(((SubscribeApi) C480460Ism.LIZLLL(SubscribeApi.class)).getSubPrivilegeDetail(str, this.LL, 0, z, j, C516700KOe.LIZ()), EnumC510330Jzr.PRIVILEGE, str2, null, map, AFwS237S0000000_7.get$arr$(353)).LJL(C11S5.LIZ()).LJJJJZI(new InterfaceC1487280oo2() { // from class: X.0JzS
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                C470590Icr<n> c470590Icr = (C470590Icr) obj;
                this.LL.LLILLL.put(c509620Jyi, c470590Icr);
                C500260Jjc.LJJLIIIJILLIZJL(new C510110JzV(interfaceC510100JzU, c470590Icr));
                return GsonProtectorUtils.fromJson(C19748512Ol.LIZJ, (k) c470590Icr.data, GetSubPrivilegeDetailResponse.Data.class);
            }
        }).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C09JN() { // from class: X.0JzP
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("PrivilegeRepository@261f.fetchPrivilegeDetail$disposable$2");
                final GetSubPrivilegeDetailResponse.Data data = (GetSubPrivilegeDetailResponse.Data) obj;
                final C259800zU<AbstractC510000JzK> c259800zU2 = c259800zU;
                final C509620Jyi c509620Jyi2 = c509620Jyi;
                final PrivilegeRepository privilegeRepository = this.LL;
                final InterfaceC510100JzU interfaceC510100JzU3 = interfaceC510100JzU;
                Runnable runnable = new Runnable() { // from class: X.0JzN
                    /* JADX WARN: Type inference failed for: r1v0, types: [T, X.0Jxz, java.lang.Object] */
                    public final void LIZ() {
                        C509170Jxz c509170Jxz2;
                        C259800zU<AbstractC510000JzK> c259800zU3 = c259800zU2;
                        PrivilegeRepository privilegeRepository2 = privilegeRepository;
                        C509620Jyi c509620Jyi3 = c509620Jyi2;
                        ?? c509170Jxz3 = new C509170Jxz(data);
                        privilegeRepository2.LLILLJJLI.put(c509620Jyi3, (AbstractC510000JzK) c509170Jxz3);
                        c259800zU3.element = c509170Jxz3;
                        AbstractC510000JzK abstractC510000JzK2 = c259800zU2.element;
                        if (!(abstractC510000JzK2 instanceof C509170Jxz) || (c509170Jxz2 = (C509170Jxz) abstractC510000JzK2) == null) {
                            return;
                        }
                        InterfaceC510100JzU interfaceC510100JzU4 = interfaceC510100JzU3;
                        PrivilegeRepository privilegeRepository3 = privilegeRepository;
                        C509620Jyi c509620Jyi4 = c509620Jyi2;
                        interfaceC510100JzU4.yO(c509170Jxz2, false);
                        List<InterfaceC510100JzU> list4 = privilegeRepository3.LLILZ.get(c509620Jyi4);
                        if (list4 != null) {
                            Iterator<InterfaceC510100JzU> it2 = list4.iterator();
                            while (it2.hasNext()) {
                                it2.next().yO(c509170Jxz2, false);
                            }
                        }
                        List<InterfaceC510100JzU> list5 = privilegeRepository3.LLILZ.get(c509620Jyi4);
                        if (list5 != null) {
                            list5.clear();
                        }
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("PrivilegeRepository@261f.fetchPrivilegeDetail$disposable$2$pausedRunnable$1");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("PrivilegeRepository@261f.fetchPrivilegeDetail$disposable$2$pausedRunnable$1");
                    }
                };
                if (!privilegeRepository.LLIZLLLIL) {
                    runnable.run();
                } else {
                    privilegeRepository.LLIZ.add(runnable);
                }
                C1C7U.LIZIZ("PrivilegeRepository@261f.fetchPrivilegeDetail$disposable$2");
            }
        }, new C09JN() { // from class: X.0JzQ
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("PrivilegeRepository@261f.fetchPrivilegeDetail$disposable$3");
                final Throwable th = (Throwable) obj;
                final C259800zU<AbstractC510000JzK> c259800zU2 = c259800zU;
                final C509620Jyi c509620Jyi2 = c509620Jyi;
                final PrivilegeRepository privilegeRepository = this.LL;
                final InterfaceC510100JzU interfaceC510100JzU3 = interfaceC510100JzU;
                Runnable runnable = new Runnable() { // from class: X.0JzO
                    /* JADX WARN: Type inference failed for: r2v0, types: [T, X.0Jxy, java.lang.Object] */
                    public final void LIZ() {
                        C509160Jxy c509160Jxy;
                        C259800zU<AbstractC510000JzK> c259800zU3 = c259800zU2;
                        PrivilegeRepository privilegeRepository2 = privilegeRepository;
                        C509620Jyi c509620Jyi3 = c509620Jyi2;
                        ?? c509160Jxy2 = new C509160Jxy(C512300K7g.LIZIZ(th), th);
                        privilegeRepository2.LLILLJJLI.put(c509620Jyi3, (AbstractC510000JzK) c509160Jxy2);
                        c259800zU3.element = c509160Jxy2;
                        AbstractC510000JzK abstractC510000JzK2 = c259800zU2.element;
                        if (!(abstractC510000JzK2 instanceof C509160Jxy) || (c509160Jxy = (C509160Jxy) abstractC510000JzK2) == null) {
                            return;
                        }
                        InterfaceC510100JzU interfaceC510100JzU4 = interfaceC510100JzU3;
                        PrivilegeRepository privilegeRepository3 = privilegeRepository;
                        C509620Jyi c509620Jyi4 = c509620Jyi2;
                        interfaceC510100JzU4.hj(c509160Jxy);
                        List<InterfaceC510100JzU> list4 = privilegeRepository3.LLILZ.get(c509620Jyi4);
                        if (list4 != null) {
                            Iterator<InterfaceC510100JzU> it2 = list4.iterator();
                            while (it2.hasNext()) {
                                it2.next().hj(c509160Jxy);
                            }
                        }
                        List<InterfaceC510100JzU> list5 = privilegeRepository3.LLILZ.get(c509620Jyi4);
                        if (list5 != null) {
                            list5.clear();
                        }
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("PrivilegeRepository@261f.fetchPrivilegeDetail$disposable$3$pausedRunnable$1");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("PrivilegeRepository@261f.fetchPrivilegeDetail$disposable$3$pausedRunnable$1");
                    }
                };
                if (!privilegeRepository.LLIZLLLIL) {
                    runnable.run();
                } else {
                    privilegeRepository.LLIZ.add(runnable);
                }
                C1C7U.LIZIZ("PrivilegeRepository@261f.fetchPrivilegeDetail$disposable$3");
            }
        }));
        if (str.length() > 0) {
            ((HashSet) C0IH1.LIZ).add(this);
        }
    }
}
