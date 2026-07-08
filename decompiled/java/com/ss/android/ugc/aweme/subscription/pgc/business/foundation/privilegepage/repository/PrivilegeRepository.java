package com.ss.android.ugc.aweme.subscription.pgc.business.foundation.privilegepage.repository;

import X.C01GW;
import X.C0JCK;
import X.C0K51;
import X.C0K6W;
import X.C0K7D;
import X.C0K7H;
import X.C0K7I;
import X.C0K7J;
import X.C0K7M;
import X.C0K7N;
import X.C0K7O;
import X.C0KLQ;
import X.C11NJ;
import X.C11NZ;
import X.C11S5;
import X.C1697810uHb;
import X.C1701940uOG;
import X.C259800zU;
import X.C356901a3;
import X.C515950KLh;
import X.EnumC499440JiI;
import X.InterfaceC1487280oo2;
import Y.AfS62S0400000_7;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.k;
import com.google.gson.n;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.subscription.pgc.data.network.DataResponse;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AwS408S0200000_7;
import kotlin.jvm.internal.AwS586S0100000_7;
import kotlin.text.a0;
import webcast.api.pgc_sub.PGCGetSubPrivilegeDetailResponse;

/* JADX INFO: loaded from: classes8.dex */
public final class PrivilegeRepository implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public static final /* synthetic */ int LLIZ = 0;
    public final String LL;
    public final ConcurrentHashMap<C0K6W, C0K7H> LLILLJJLI = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<C0K6W, DataResponse<n>> LLILLL = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<C0K6W, List<C0K7M>> LLILZ = new ConcurrentHashMap<>();
    public final C11NJ LLILZIL = new C11NJ();
    public final Set<WeakReference<LifecycleOwner>> LLILZLL = new LinkedHashSet();

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

    public PrivilegeRepository(String str) {
        this.LL = str;
        new ArrayList();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZIZ(this, lifecycleOwner);
        Set<WeakReference<LifecycleOwner>> set = this.LLILZLL;
        AwS586S0100000_7 awS586S0100000_7 = new AwS586S0100000_7(lifecycleOwner, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL);
        C01GW c01gw = C0K51.LIZ;
        Iterator<WeakReference<LifecycleOwner>> it2 = set.iterator();
        while (it2.hasNext()) {
            if (((Boolean) awS586S0100000_7.invoke(it2.next())).booleanValue()) {
                it2.remove();
            }
        }
        if (this.LLILZLL.isEmpty()) {
            this.LLILZ.clear();
            this.LLILZIL.LJ();
            this.LLILLJJLI.clear();
            this.LLILLL.clear();
            C0K7N.LIZ.remove(this.LL);
            C0K7O.LIZ.remove(this);
        }
        lifecycleOwner.getLifecycle().removeObserver(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5, types: [T, X.0K7I, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8, types: [T, X.0K7J, java.lang.Object] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void LIZ(String str, String str2, boolean z, final C0K7M c0k7m, Map map, long j) {
        String str3;
        String str4 = this.LL;
        if (a0.LJJJIL(str)) {
            str3 = CardStruct.IStatusCode.DEFAULT;
        } else {
            str3 = str;
        }
        final C0K6W c0k6w = new C0K6W(j, str4, str3);
        C259800zU c259800zU = new C259800zU();
        ConcurrentHashMap<C0K6W, C0K7H> concurrentHashMap = this.LLILLJJLI;
        C0K7H c0k7h = concurrentHashMap.get(c0k6w);
        T t = c0k7h;
        if (c0k7h == null) {
            C0K7J c0k7j = new C0K7H() { // from class: X.0K7J
            };
            C0K7H c0k7hPutIfAbsent = concurrentHashMap.putIfAbsent(c0k6w, c0k7j);
            t = c0k7j;
            if (c0k7hPutIfAbsent != null) {
                t = c0k7hPutIfAbsent;
            }
        }
        c259800zU.element = t;
        if (z) {
            ?? r3 = new C0K7H() { // from class: X.0K7J
            };
            this.LLILLJJLI.put(c0k6w, (C0K7H) r3);
            c259800zU.element = r3;
        }
        T t2 = c259800zU.element;
        if (t2 instanceof C0K7D) {
            C0K7D c0k7d = (C0K7D) t2;
            c0k7m.Gs(this.LLILLL.get(c0k6w));
            c0k7d.LIZIZ = true;
            c0k7m.oP(c0k7d, true);
            List<C0K7M> list = this.LLILZ.get(c0k6w);
            if (list != null) {
                for (C0K7M c0k7m2 : list) {
                    if (c0k7m2 != null) {
                        c0k7m2.oP(c0k7d, true);
                    }
                }
            }
            List<C0K7M> list2 = this.LLILZ.get(c0k6w);
            if (list2 != null) {
                list2.clear();
                return;
            }
            return;
        }
        if (t2 instanceof C0K7I) {
            if (this.LLILZ.get(c0k6w) == null) {
                this.LLILZ.put(c0k6w, C1697810uHb.LJIILJJIL(c0k7m));
                return;
            }
            List<C0K7M> list3 = this.LLILZ.get(c0k6w);
            if (list3 == null) {
                return;
            }
            list3.add(c0k7m);
            return;
        }
        ?? r32 = new C0K7H() { // from class: X.0K7I
        };
        this.LLILLJJLI.put(c0k6w, (C0K7H) r32);
        c259800zU.element = r32;
        C11NZ c11nzLIZJ = C0KLQ.LIZ().LIZJ(str, this.LL, j, C515950KLh.LJFF());
        if (c11nzLIZJ != null) {
            this.LLILZIL.LIZ(C0JCK.LIZ(c11nzLIZJ, EnumC499440JiI.PRIVILEGE, str2, null, map, 4).LJL(C11S5.LIZ()).LJJJJZI(new InterfaceC1487280oo2() { // from class: X.0K7L
                @Override // X.InterfaceC1487280oo2
                public final Object apply(Object obj) {
                    DataResponse<n> dataResponse = (DataResponse) obj;
                    this.LL.LLILLL.put(c0k6w, dataResponse);
                    C0K51.LJIIJJI(new AwS408S0200000_7(c0k7m, (C0K7M) dataResponse, (DataResponse<n>) 27));
                    return GsonProtectorUtils.fromJson(C19748512Ol.LIZJ, (k) dataResponse.data, PGCGetSubPrivilegeDetailResponse.Data.class);
                }
            }).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS62S0400000_7(this, c259800zU, c0k6w, c0k7m, 0), new AfS62S0400000_7(this, c259800zU, c0k6w, c0k7m, 1)));
        }
        if (str.length() > 0) {
            C0K7O.LIZ.add(this);
        }
    }
}
