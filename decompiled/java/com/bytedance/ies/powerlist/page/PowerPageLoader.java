package com.bytedance.ies.powerlist.page;

import X.AbstractC316870CbV;
import X.AbstractC329610Cw3;
import X.C01GW;
import X.C11JF;
import X.C13BV;
import X.C1558530qex;
import X.C1954807lC;
import X.C1DFK;
import X.C20600815jK;
import X.C20603715jn;
import X.C20605415k4;
import X.C20606115kB;
import X.C20606415kE;
import X.C20606515kF;
import X.C20606615kG;
import X.C20606815kI;
import X.C20607615kQ;
import X.C20608515kZ;
import X.C2107508Nl;
import X.C2238608ps;
import X.C2252611DEt;
import X.C23118094a;
import X.C23250099c;
import X.C238400w2;
import X.C316640Cb8;
import X.C316650Cb9;
import X.C316880CbW;
import X.C323380Cm0;
import X.C326750CrR;
import X.C452501pT;
import X.C786410Ut5;
import X.EnumC20607015kK;
import X.EnumC323450Cm7;
import X.InterfaceC1361890lXn;
import X.InterfaceC1891350zJl;
import X.InterfaceC1906710ziX;
import X.InterfaceC20236714Gf;
import X.InterfaceC497601wk;
import Y.ARunnableS15S0310000_31;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Pair;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AwS394S0200000_28;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public final class PowerPageLoader<T> implements InterfaceC1361890lXn<T>, InterfaceC497601wk, LifecycleEventObserver {
    public final AbstractC329610Cw3<T> LL;
    public final C20600815jK<InterfaceC1891350zJl> LLILLJJLI;
    public C1558530qex LLILLL;
    public C20603715jn LLILZIL;
    public InterfaceC1906710ziX LLIZLLLIL;
    public volatile boolean LLJIJIL;
    public C20607615kQ LLJILJIL;
    public C20605415k4 LLJILLL;
    public C11JF LLJJ;
    public final Set<InterfaceC20236714Gf<AbstractC316870CbV<T>>> LLJJI;
    public C2252611DEt LLJJIII;
    public C2252611DEt LLJJIJI;
    public final C1DFK LLILZ = C23118094a.LIZ();
    public final C2238608ps LLILZLL = C2107508Nl.LIZ;
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS575S0100000_31(this, 206));
    public Pair<? extends T, ? extends T> LLJ = new Pair<>(null, null);
    public final C01GW LLJI = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(48));
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new AwS575S0100000_31(this, 207));

    public final C20606815kI LJ() {
        return (C20606815kI) this.LLJILJILJ.getValue();
    }

    public final void LJFF() {
        if (!this.LLILZIL.LJIILJJIL) {
            throw new IllegalStateException("PageValue.Cancelled is not an allowed response if the allowManualCancellation is not enabled.\nUse PageValue.Cancelled only to control the cancellation of requests manually.");
        }
        Set<InterfaceC20236714Gf<AbstractC316870CbV<T>>> set = this.LLJJI;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            Iterator<InterfaceC20236714Gf<AbstractC316870CbV<T>>> it2 = set.iterator();
            while (it2.hasNext()) {
                if (it2.next().isActive()) {
                    return;
                }
            }
        }
        throw new IllegalStateException("While cancelling a request, at least one of the previous requests should be active.\nThis is to prevent the PowerList state machine from entering an inconsistent state.");
    }

    public final void LJIIIIZZ() {
        C238400w2 c238400w2 = new C238400w2();
        c238400w2.element = -1L;
        if (!this.LLILZIL.LJIILJJIL) {
            C2252611DEt c2252611DEt = this.LLJJIII;
            if (c2252611DEt != null) {
                c2252611DEt.LJJIIZ(null);
            }
            C2252611DEt c2252611DEt2 = this.LLJJIJI;
            if (c2252611DEt2 != null) {
                c2252611DEt2.LJJIIZ(null);
            }
        }
        EnumC323450Cm7 enumC323450Cm7 = EnumC323450Cm7.Refresh;
        LJ().LIZ(EnumC20607015kK.Loading, enumC323450Cm7, null);
        C23250099c.LIZLLL(this, null, null, new C20606415kE(this, enumC323450Cm7, c238400w2, null), 3);
    }

    @Override // X.InterfaceC497601wk
    public final CoroutineContext getCoroutineContext() {
        return (CoroutineContext) this.LLIZ.getValue();
    }

    public final void onDestroy() {
        C20605415k4 c20605415k4;
        LifecycleOwner lifecycleOwner;
        Lifecycle lifecycle;
        this.LLILZ.LIZIZ(null);
        C11JF c11jf = this.LLJJ;
        if (c11jf != null) {
            c11jf.dispose();
        }
        if (!C20606115kB.LIZJ && (c20605415k4 = this.LLJILLL) != null && (lifecycleOwner = c20605415k4.LIZ) != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.removeObserver(this);
        }
        this.LLJJI.clear();
    }

    @Override // X.InterfaceC1361890lXn
    public final void refresh() {
        LJIIIIZZ();
    }

    @Override // X.InterfaceC1361890lXn
    public final void LIZ(T t) {
        LJII(t);
    }

    @Override // X.InterfaceC1361890lXn
    public final void LIZIZ(EnumC323450Cm7 enumC323450Cm7) {
        int i = C326750CrR.LIZ[enumC323450Cm7.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    LJIIIIZZ();
                    return;
                }
                throw new C1954807lC();
            }
            LJI(null);
            return;
        }
        LJII(null);
    }

    @Override // X.InterfaceC1361890lXn
    public final void LIZLLL(T t) {
        LJI(t);
    }

    public final void LJI(T t) {
        C2252611DEt c2252611DEt;
        if (!this.LLILZIL.LJIILJJIL && (c2252611DEt = this.LLJJIII) != null) {
            c2252611DEt.LJJIIZ(null);
        }
        EnumC323450Cm7 enumC323450Cm7 = EnumC323450Cm7.Prev;
        LJ().LIZ(EnumC20607015kK.Loading, enumC323450Cm7, null);
        C23250099c.LIZLLL(this, null, null, new C20606615kG(this, enumC323450Cm7, t, null), 3);
    }

    public final void LJII(T t) {
        C2252611DEt c2252611DEt;
        if (!this.LLILZIL.LJIILJJIL && (c2252611DEt = this.LLJJIJI) != null) {
            c2252611DEt.LJJIIZ(null);
        }
        EnumC323450Cm7 enumC323450Cm7 = EnumC323450Cm7.Next;
        LJ().LIZ(EnumC20607015kK.Loading, enumC323450Cm7, null);
        C23250099c.LIZLLL(this, null, null, new C20606515kF(this, enumC323450Cm7, t, null), 3);
    }

    public final void LJIIIZ(C2252611DEt c2252611DEt) {
        if (this.LLILZIL.LJIILJJIL) {
            this.LLJJI.add(c2252611DEt);
            c2252611DEt.LJJII(new AwS394S0200000_28(this, c2252611DEt, 83));
        }
    }

    public PowerPageLoader(AbstractC329610Cw3<T> abstractC329610Cw3, C20600815jK<InterfaceC1891350zJl> c20600815jK) {
        this.LL = abstractC329610Cw3;
        this.LLILLJJLI = c20600815jK;
        this.LLILZIL = abstractC329610Cw3.LIZ;
        abstractC329610Cw3.onLoad(this);
        this.LLJJI = new LinkedHashSet();
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @Override // X.InterfaceC1361890lXn
    public final void LIZJ(EnumC323450Cm7 enumC323450Cm7, AbstractC316870CbV<T> abstractC316870CbV, boolean z) {
        Pair<? extends T, ? extends T> pairCopy$default;
        Collection collection;
        if (!Intrinsics.LJFF(Looper.getMainLooper().getThread(), C786410Ut5.u3())) {
            C786410Ut5.LJJZZIII((Handler) this.LLJI.getValue(), new ARunnableS15S0310000_31(enumC323450Cm7, abstractC316870CbV, this, z, 0));
            return;
        }
        if (z) {
            if (abstractC316870CbV instanceof C323380Cm0) {
                collection = ((C323380Cm0) abstractC316870CbV).LIZLLL;
            } else if (abstractC316870CbV instanceof C316640Cb8) {
                collection = ((C316640Cb8) abstractC316870CbV).LIZIZ;
            } else {
                collection = C13BV.INSTANCE;
            }
            int i = C326750CrR.LIZ[enumC323450Cm7.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        this.LLILLJJLI.LJIILL(collection, null);
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    C20600815jK.LJ(this.LLILLJJLI, 0, collection);
                }
            } else {
                this.LLILLJJLI.LIZLLL(collection, null);
            }
        }
        if (abstractC316870CbV instanceof C323380Cm0) {
            int i2 = C326750CrR.LIZ[enumC323450Cm7.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        C323380Cm0 c323380Cm0 = (C323380Cm0) abstractC316870CbV;
                        pairCopy$default = new Pair<>(c323380Cm0.LIZIZ, c323380Cm0.LIZJ);
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    pairCopy$default = Pair.copy$default(this.LLJ, ((C323380Cm0) abstractC316870CbV).LIZIZ, null, 2, null);
                }
            } else {
                pairCopy$default = Pair.copy$default(this.LLJ, null, ((C323380Cm0) abstractC316870CbV).LIZJ, 1, null);
            }
            this.LLJ = pairCopy$default;
            C323380Cm0 c323380Cm02 = (C323380Cm0) abstractC316870CbV;
            LJ().LIZ(EnumC20607015kK.Loaded, enumC323450Cm7, new C20608515kZ(c323380Cm02.LIZIZ, c323380Cm02.LIZJ));
            return;
        }
        if (abstractC316870CbV instanceof C316650Cb9) {
            LJ().LIZ(EnumC20607015kK.Error, enumC323450Cm7, ((C316650Cb9) abstractC316870CbV).LIZIZ);
        } else if (abstractC316870CbV instanceof C316640Cb8) {
            LJ().LIZ(EnumC20607015kK.End, enumC323450Cm7, null);
        } else {
            if (abstractC316870CbV instanceof C316880CbW) {
                LJFF();
                return;
            }
            throw new C1954807lC();
        }
    }
}
