package com.ss.android.ugc.aweme.ecommerce.mixmall.container.body;

import X.AbstractC1773210wFD;
import X.AbstractC1773460wFc;
import X.AbstractC1773820wGC;
import X.C01GW;
import X.C0J8P;
import X.C1117360fBO;
import X.C1117400fBS;
import X.C13BV;
import X.C1773640wFu;
import X.C1773800wGA;
import X.C1773810wGB;
import X.C356901a3;
import X.C452501pT;
import X.C948503nH;
import X.InterfaceC1773310wFN;
import X.InterfaceC1774140wGi;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.AwS570S0100000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class ECHybridAdapter extends C1117360fBO {
    public static final /* synthetic */ int LLJ = 0;
    public final InterfaceC1774140wGi LLILLL;
    public final InterfaceC1773310wFN LLILZ;
    public final Map<Class<? extends AbstractC1773210wFD>, AbstractC1773820wGC<?, ?>> LLILZIL;
    public final C01GW LLILZLL;
    public final C01GW LLIZ;
    public C1773640wFu LLIZLLLIL;

    static {
        new Object() { // from class: X.0wGg
        };
    }

    /* JADX INFO: renamed from: com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.ECHybridAdapter$1, reason: invalid class name */
    public final class AnonymousClass1 implements DefaultLifecycleObserver, GenericLifecycleObserver {
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

        public AnonymousClass1() {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final void onDestroy(LifecycleOwner lifecycleOwner) {
            ((C1773800wGA) ECHybridAdapter.this.LLILZLL.getValue()).LIZ();
            ((C1773810wGB) ECHybridAdapter.this.LLIZ.getValue()).LIZ();
            ECHybridAdapter.this.LLILZ.LJIIL().LIZ();
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final void onStop(LifecycleOwner lifecycleOwner) {
            ((C1773800wGA) ECHybridAdapter.this.LLILZLL.getValue()).LIZ();
            ((C1773810wGB) ECHybridAdapter.this.LLIZ.getValue()).LIZ();
            ECHybridAdapter.this.LLILZ.LJIIL().LIZ();
        }
    }

    @Override // X.AbstractC21673619ry
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        C1773640wFu c1773640wFu;
        super.onAttachedToRecyclerView(recyclerView);
        if (recyclerView instanceof C1773640wFu) {
            c1773640wFu = (C1773640wFu) recyclerView;
        } else {
            c1773640wFu = null;
        }
        this.LLIZLLLIL = c1773640wFu;
        if (c1773640wFu != null) {
            c1773640wFu.setController(this.LLILZ);
        }
    }

    public final <T extends AbstractC1773210wFD, V extends AbstractC1773460wFc<T>> void LLLIIIIL(Class<? extends T> cls, AbstractC1773820wGC<T, V> abstractC1773820wGC) {
        LLLI(cls, abstractC1773820wGC);
        this.LLILZIL.put(cls, abstractC1773820wGC);
        abstractC1773820wGC.LIZIZ = this.LLILLL;
        abstractC1773820wGC.LJ = this.LLILZ;
    }

    public ECHybridAdapter(InterfaceC1774140wGi interfaceC1774140wGi, InterfaceC1773310wFN interfaceC1773310wFN, final HashMap<Integer, C0J8P<?, ?>> map) {
        Lifecycle lifecycle;
        super(C13BV.INSTANCE, new C1117400fBS(map) { // from class: X.0fBU
            public final HashMap<Integer, C0J8P<?, ?>> LIZLLL;

            {
                this.LIZLLL = map;
            }

            @Override // X.C1117400fBS, X.InterfaceC1117390fBR
            public final C0J8P<?, ?> LIZ(int i) {
                try {
                    if (i == -1) {
                        return new C0J8P<Object, RecyclerView.ViewHolder>() { // from class: X.0fBV
                            @Override // X.C0J8P
                            public final void LJFF(RecyclerView.ViewHolder viewHolder) {
                                throw new C1117440fBW("please register binder");
                            }

                            @Override // X.C0J8P
                            public final void LIZJ(RecyclerView.ViewHolder viewHolder, Object obj) {
                                throw new C1117440fBW("please register binder");
                            }

                            @Override // X.C0J8P
                            /* JADX INFO: renamed from: LJ */
                            public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                                throw new C1117440fBW("please register binder");
                            }
                        };
                    }
                    C0J8P<?, ?> c0j8p = this.LIZLLL.get(Integer.valueOf(i));
                    if (c0j8p == null) {
                        return super.LIZ(i);
                    }
                    return c0j8p;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    return new C0J8P<Object, RecyclerView.ViewHolder>() { // from class: X.0fBV
                        @Override // X.C0J8P
                        public final void LJFF(RecyclerView.ViewHolder viewHolder) {
                            throw new C1117440fBW("please register binder");
                        }

                        @Override // X.C0J8P
                        public final void LIZJ(RecyclerView.ViewHolder viewHolder, Object obj) {
                            throw new C1117440fBW("please register binder");
                        }

                        @Override // X.C0J8P
                        /* JADX INFO: renamed from: LJ */
                        public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                            throw new C1117440fBW("please register binder");
                        }
                    };
                }
            }
        });
        this.LLILLL = interfaceC1774140wGi;
        this.LLILZ = interfaceC1773310wFN;
        this.LLILZIL = new LinkedHashMap();
        this.LLILZLL = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(173));
        this.LLIZ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 645));
        LifecycleOwner lifecycleOwnerLIZ = C948503nH.LIZ(interfaceC1773310wFN.LIZLLL().LJ);
        if (lifecycleOwnerLIZ != null && (lifecycle = lifecycleOwnerLIZ.getLifecycle()) != null) {
            lifecycle.addObserver(new AnonymousClass1());
        }
    }
}
