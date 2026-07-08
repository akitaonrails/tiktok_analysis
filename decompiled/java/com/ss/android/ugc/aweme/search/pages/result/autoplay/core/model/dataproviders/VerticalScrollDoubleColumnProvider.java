package com.ss.android.ugc.aweme.search.pages.result.autoplay.core.model.dataproviders;

import X.C01GW;
import X.C0PCT;
import X.C18175079x;
import X.C18176079y;
import X.C452501pT;
import X.C583780Mv2;
import X.C588560N6o;
import X.C640700PBc;
import X.InterfaceC648350Pbt;
import Y.AsS37S0100000_10;
import android.view.View;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.search.performance.core.config.SearchVideoPreRenderConfig;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class VerticalScrollDoubleColumnProvider extends C640700PBc implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public final LifecycleOwner LLILLL;
    public final RecyclerView LLILZ;
    public InterfaceC648350Pbt LLILZIL;
    public InterfaceC648350Pbt LLILZLL;
    public boolean LLJ;
    public InterfaceC648350Pbt LLJIJIL;
    public InterfaceC648350Pbt LLJILJIL;
    public long LLJILJILJ;
    public int LLJILLL;
    public final boolean LLJJI;
    public final boolean LLJJIII;
    public final C01GW LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public int LLIZ = 1;
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(473));
    public int LLJI = 1;
    public final boolean LLJJ = C18176079y.LIZ;

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(LifecycleOwner lifecycleOwner) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(LifecycleOwner lifecycleOwner) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(LifecycleOwner lifecycleOwner) {
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(LifecycleOwner lifecycleOwner) {
    }

    public final InterfaceC648350Pbt[] LJIIJ() {
        return (InterfaceC648350Pbt[]) this.LLJJIJIIJIL.getValue();
    }

    public final InterfaceC648350Pbt[] LJIIJJI() {
        return (InterfaceC648350Pbt[]) this.LLJJIJI.getValue();
    }

    public final void LJII() {
        int length = LJIIJJI().length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            LJIIJJI()[i3] = null;
            i2++;
            i3++;
        }
        int length2 = LJIIJ().length;
        int i4 = 0;
        while (i < length2) {
            LJIIJ()[i4] = null;
            i++;
            i4++;
        }
    }

    public final boolean LJIIL() {
        InterfaceC648350Pbt[] interfaceC648350PbtArrLJIIJJI = LJIIJJI();
        int length = interfaceC648350PbtArrLJIIJJI.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = i2 + 1;
            if (!Intrinsics.LJFF(interfaceC648350PbtArrLJIIJJI[i], LJIIJ()[i2])) {
                return false;
            }
            i++;
            i2 = i3;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int LJIIIIZZ(InterfaceC648350Pbt interfaceC648350Pbt) {
        RecyclerView.ViewHolder viewHolder;
        if ((interfaceC648350Pbt instanceof RecyclerView.ViewHolder) && (viewHolder = (RecyclerView.ViewHolder) interfaceC648350Pbt) != null) {
            return viewHolder.getLayoutPosition();
        }
        return -1;
    }

    @Override // X.AbstractC640710PBd
    public final void LIZJ(C588560N6o c588560N6o) {
        if (this.LLJ) {
            return;
        }
        super.LIZJ(c588560N6o);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(LifecycleOwner lifecycleOwner) {
        this.LLJILJIL = null;
        this.LLILZLL = null;
    }

    public VerticalScrollDoubleColumnProvider(LifecycleOwner lifecycleOwner, RecyclerView recyclerView) {
        boolean z;
        this.LLILLL = lifecycleOwner;
        this.LLILZ = recyclerView;
        if (C18175079x.LIZ) {
            z = true;
        } else {
            z = false;
        }
        this.LLJJI = z;
        SearchVideoPreRenderConfig searchVideoPreRenderConfig = (SearchVideoPreRenderConfig) C583780Mv2.LIZIZ.getValue();
        this.LLJJIII = searchVideoPreRenderConfig != null && searchVideoPreRenderConfig.enablePreRender;
        lifecycleOwner.getLifecycle().addObserver(this);
        this.LLJJIJI = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(475));
        this.LLJJIJIIJIL = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(474));
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(476));
        this.LLJJIJIL = c01gwLIZIZ;
        recyclerView.addOnScrollListener(new AsS37S0100000_10(this, 16));
        if (((C0PCT) c01gwLIZIZ.getValue()).LJIILIIL()) {
            ((C0PCT) c01gwLIZIZ.getValue()).LIZ();
        } else {
            ((C0PCT) c01gwLIZIZ.getValue()).LJI((View) recyclerView.getParent().getParent());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC648350Pbt LJIIIZ(X.InterfaceC648350Pbt[] r4, X.InterfaceC648350Pbt[] r5) {
        /*
            r3 = this;
            boolean r0 = r3.LJIIL()
            r2 = 1
            if (r0 == 0) goto L14
            r1 = r4[r2]
        L9:
            if (r1 == 0) goto L13
        Lb:
            boolean r0 = r1.N1()
            if (r0 != 0) goto L13
            r1 = r5[r2]
        L13:
            return r1
        L14:
            r0 = 0
            r1 = r4[r0]
            if (r1 != 0) goto Lb
            r1 = r5[r2]
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.pages.result.autoplay.core.model.dataproviders.VerticalScrollDoubleColumnProvider.LJIIIZ(X.0Pbt[], X.0Pbt[]):X.0Pbt");
    }

    /* JADX WARN: Code restructure failed: missing block: B:180:0x032e, code lost:
    
        if (r10 != null) goto L181;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0398  */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v1, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r10v31, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r15v0, types: [X.0PBc, X.0PBd, com.ss.android.ugc.aweme.search.pages.result.autoplay.core.model.dataproviders.VerticalScrollDoubleColumnProvider, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJI(com.ss.android.ugc.aweme.search.pages.result.autoplay.core.model.dataproviders.VerticalScrollDoubleColumnProvider r15, int r16, X.InterfaceC648350Pbt r17, boolean r18, int r19) {
        /*
            Method dump skipped, instruction units count: 954
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.pages.result.autoplay.core.model.dataproviders.VerticalScrollDoubleColumnProvider.LJI(com.ss.android.ugc.aweme.search.pages.result.autoplay.core.model.dataproviders.VerticalScrollDoubleColumnProvider, int, X.0Pbt, boolean, int):void");
    }
}
