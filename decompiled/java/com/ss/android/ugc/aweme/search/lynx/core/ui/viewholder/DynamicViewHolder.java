package com.ss.android.ugc.aweme.search.lynx.core.ui.viewholder;

import X.C0PBW;
import X.C0PCQ;
import X.C0PTJ;
import X.C0PUC;
import X.C0PUS;
import X.C0Q3E;
import X.C1697810uHb;
import X.C1D66;
import X.C2296808zG;
import X.C262100zr;
import X.C356901a3;
import X.C587060N0u;
import X.C647310PaD;
import X.C648140PbY;
import X.C648160Pba;
import X.C648170Pbb;
import X.C648190Pbd;
import X.C648300Pbo;
import X.C650240Pew;
import X.C650630PfZ;
import X.C652600Pik;
import X.C653660PkS;
import X.C655580PnY;
import X.C664400Q4g;
import X.InterfaceC1141530foN;
import X.InterfaceC1294060jmO;
import X.InterfaceC584630MwP;
import X.InterfaceC641090PCp;
import X.InterfaceC648220Pbg;
import X.InterfaceC648270Pbl;
import X.InterfaceC648310Pbp;
import X.InterfaceC648720PcU;
import X.InterfaceC650540PfQ;
import X.InterfaceC659190PtN;
import android.view.MotionEvent;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.LynxSSRInfo;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.cs.core.model.ClickSearchViewModel;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class DynamicViewHolder extends RecyclerView.ViewHolder implements View.OnAttachStateChangeListener, DefaultLifecycleObserver, InterfaceC648310Pbp, C0PCQ, InterfaceC648270Pbl, InterfaceC650540PfQ, InterfaceC1141530foN, C0PTJ, C0PUC, GenericLifecycleObserver {
    public static long LLIZLLLIL = -1;
    public static long LLJ = -1;
    public static final /* synthetic */ int LLJI = 0;
    public final C648160Pba LL;
    public final C648170Pbb LLILLJJLI;
    public final C648190Pbd LLILLL;
    public final C0PUS LLILZ;
    public final List<InterfaceC648220Pbg> LLILZIL;
    public boolean LLILZLL;
    public final C1D66 LLIZ;

    @Override // X.C0PUC
    public final SearchResultParam I() {
        this.LLILLL.getClass();
        return null;
    }

    @Override // X.C0PT8
    public final void I2(ISearchContextAbility iSearchContextAbility) {
        this.LLILLL.getClass();
    }

    @Override // X.InterfaceC648310Pbp
    public final boolean K4() {
        this.LLILLJJLI.getClass();
        return false;
    }

    @Override // X.InterfaceC648350Pbt
    public final boolean L0() {
        this.LLILLJJLI.getClass();
        return true;
    }

    @Override // X.C0PUC
    public final Aweme LJIIIIZZ() {
        return this.LLILLL.LJIIIIZZ();
    }

    @Override // X.InterfaceC648270Pbl
    public final View LJJIIJ() {
        return this.LLILLJJLI.LJJIIJ();
    }

    @Override // X.InterfaceC648270Pbl
    public final void LJJJJ() {
        this.LLILLJJLI.getClass();
    }

    @Override // X.InterfaceC648350Pbt
    public final void LJJJLIIL() {
        this.LLILLJJLI.LJJJLIIL();
    }

    @Override // X.InterfaceC648350Pbt
    public final void LJJLIIIJLLLLLLLZ() {
        this.LLILLJJLI.getClass();
    }

    @Override // X.C0PCQ
    public final double LLFZ() {
        return this.LLILLJJLI.LLFZ();
    }

    @Override // X.InterfaceC648270Pbl
    public final void LLJJJ() {
        this.LLILLJJLI.LLJJJ();
    }

    @Override // X.C0PT8
    public final void LLLIL(C653660PkS c653660PkS) {
        this.LLILLL.LLLIL(c653660PkS);
    }

    @Override // X.C0PUC
    public final void LLLILZLLLI(int i) {
        this.LLILLL.getClass();
    }

    @Override // X.InterfaceC648350Pbt
    public final boolean LLLLIIIILLL() {
        this.LLILLJJLI.getClass();
        return true;
    }

    @Override // X.InterfaceC648270Pbl
    public final void LLLLLIL() {
        this.LLILLJJLI.LLLLLIL();
    }

    @Override // X.InterfaceC648270Pbl
    public final void LLLLLILLIL() {
        this.LLILLJJLI.LLLLLILLIL();
    }

    @Override // X.C0PUC
    public final void LLLLLZ() {
        this.LLILLL.getClass();
    }

    @Override // X.C0PUC
    public final void LLZZ() {
        this.LLILLL.getClass();
    }

    @Override // X.InterfaceC648350Pbt
    public final void LLZZZIL(C587060N0u c587060N0u) {
        this.LLILLJJLI.getClass();
    }

    @Override // X.InterfaceC648350Pbt
    public final void Mu(C650630PfZ c650630PfZ) {
        this.LLILLJJLI.Mu(c650630PfZ);
    }

    @Override // X.InterfaceC648350Pbt
    public final boolean N1() {
        return this.LLILLJJLI.N1();
    }

    @Override // X.InterfaceC648270Pbl
    public final void O4() {
        this.LLILLJJLI.O4();
    }

    @Override // X.InterfaceC648350Pbt
    public final void W0(long j, C587060N0u c587060N0u) {
        this.LLILLJJLI.W0(j, c587060N0u);
    }

    @Override // X.InterfaceC648310Pbp
    public final View d5() {
        return this.LLILLJJLI.d5();
    }

    @Override // X.InterfaceC648350Pbt
    public final View getDetectView() {
        this.LLILLJJLI.getClass();
        return null;
    }

    @Override // X.C0PUC
    public final View getItemView() {
        this.LLILLL.getItemView();
        throw null;
    }

    @Override // X.InterfaceC648350Pbt
    public final InterfaceC584630MwP getPreload() {
        this.LLILLJJLI.getClass();
        return null;
    }

    @Override // X.InterfaceC648350Pbt
    public final C0PCQ getPriority() {
        return this.LLILLJJLI.getPriority();
    }

    @Override // X.C0PUC
    public final int getViewType() {
        this.LLILLL.getViewType();
        throw null;
    }

    @Override // X.InterfaceC648350Pbt
    public final boolean isPlaying() {
        return this.LLILLJJLI.isPlaying();
    }

    @Override // X.C0PUC
    public final int k2() {
        this.LLILLL.getClass();
        return -1;
    }

    @Override // X.InterfaceC648350Pbt
    public final boolean l2() {
        this.LLILLJJLI.getClass();
        return true;
    }

    @Override // X.C0PT8
    public final C653660PkS l3() {
        return this.LLILLL.l3();
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        this.LLILLJJLI.mh2(c262100zr);
    }

    @Override // X.C0PUC
    public final void n4(MotionEvent motionEvent) {
        this.LLILLL.getClass();
    }

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

    @Override // X.InterfaceC648350Pbt
    public final void release() {
        this.LLILLJJLI.getClass();
    }

    @Override // X.InterfaceC648350Pbt
    public final void setPlayMetrics(C664400Q4g c664400Q4g) {
        this.LLILLJJLI.getClass();
    }

    @Override // X.InterfaceC648350Pbt
    public final void setPlayableLifecycleListener(InterfaceC659190PtN interfaceC659190PtN) {
        this.LLILLJJLI.getClass();
    }

    @Override // X.InterfaceC648350Pbt
    public final void wp(C650630PfZ c650630PfZ) {
        this.LLILLJJLI.wp(c650630PfZ);
    }

    @Override // X.InterfaceC648350Pbt
    public final Boolean z3() {
        this.LLILLJJLI.getClass();
        return null;
    }

    @Override // X.C0PUC
    public final boolean LIZLLL() {
        return this.LLILLL.LLILLL;
    }

    @Override // X.C0PTJ
    public final void LLIILZL() {
        Iterator<InterfaceC648220Pbg> it2 = this.LLILZIL.iterator();
        while (it2.hasNext()) {
            it2.next().LIZJ();
        }
    }

    @Override // X.InterfaceC648310Pbp
    public final InterfaceC648720PcU LLL() {
        C648170Pbb c648170Pbb = this.LLILLJJLI;
        c648170Pbb.getClass();
        return C648300Pbo.LIZ(c648170Pbb);
    }

    @Override // X.C0PUC
    public final boolean LLLZZIL() {
        return this.LLILLL.LLILLJJLI;
    }

    @Override // X.C0PCQ
    public final boolean R1() {
        return this.LLILLJJLI.LLIZ;
    }

    @Override // X.InterfaceC648350Pbt
    public final String getDebugId() {
        C648170Pbb c648170Pbb = this.LLILLJJLI;
        c648170Pbb.getClass();
        return C655580PnY.LIZ(c648170Pbb);
    }

    @Override // X.InterfaceC650540PfQ
    public final boolean mm() {
        return this.LLILLJJLI.LLJI;
    }

    @Override // X.InterfaceC648310Pbp
    public final InterfaceC648720PcU n5() {
        this.LLILLJJLI.getClass();
        return new C652600Pik();
    }

    @Override // X.InterfaceC648350Pbt
    @InterfaceC1294060jmO
    public final View p0() {
        C648170Pbb c648170Pbb = this.LLILLJJLI;
        c648170Pbb.getClass();
        return C655580PnY.LIZIZ(c648170Pbb);
    }

    @Override // X.InterfaceC648310Pbp
    public final int y1() {
        return this.LLILLJJLI.hashCode();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        this.LLIZ.LIZ();
        C2296808zG.LIZJ(this.LL.LIZ, null);
        this.itemView.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Iterator<InterfaceC648220Pbg> it2 = this.LLILZIL.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ();
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Iterator<InterfaceC648220Pbg> it2 = this.LLILZIL.iterator();
        while (it2.hasNext()) {
            it2.next().LIZIZ();
        }
    }

    public DynamicViewHolder(View view, C648160Pba c648160Pba) {
        C648170Pbb c648170Pbb = new C648170Pbb(c648160Pba);
        C648190Pbd c648190Pbd = new C648190Pbd(c648160Pba);
        C0PUS c0pus = new C0PUS(c648160Pba);
        super(view);
        this.LL = c648160Pba;
        this.LLILLJJLI = c648170Pbb;
        this.LLILLL = c648190Pbd;
        this.LLILZ = c0pus;
        List<InterfaceC648220Pbg> listLJIILJJIL = C1697810uHb.LJIILJJIL(c648170Pbb, c648190Pbd, c0pus, new C647310PaD(c648160Pba));
        if (C650240Pew.LIZ()) {
            listLJIILJJIL.add(new C648140PbY(c648160Pba));
        }
        this.LLILZIL = listLJIILJJIL;
        C1D66 c1d66LIZ = c648160Pba.LJIIIIZZ.LIZ();
        if (c1d66LIZ != null) {
            this.LLIZ = c1d66LIZ;
            c648160Pba.LJIIIZ.LIZIZ(this);
            c648160Pba.LIZIZ.LIZIZ(c1d66LIZ.LJIIIZ);
            view.addOnAttachStateChangeListener(this);
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // X.InterfaceC648310Pbp
    public final void LJJLL(Aweme aweme, C0PBW c0pbw) {
        C648170Pbb c648170Pbb = this.LLILLJJLI;
        c648170Pbb.getClass();
        C648300Pbo.LIZIZ(c648170Pbb, aweme, c0pbw);
    }

    public final void I5(Fragment fragment, DynamicPatch dynamicPatch, Map<String, ? extends Object> map, InterfaceC641090PCp interfaceC641090PCp, LynxSSRInfo lynxSSRInfo, ClickSearchViewModel clickSearchViewModel, boolean z, boolean z2) {
        if (fragment != null && !this.LLILZLL) {
            fragment.getLifecycle().addObserver(this);
            this.LLILZLL = true;
        }
        this.LL.LJIIL.LIZIZ(Boolean.valueOf(z2));
        this.LL.LJIILIIL.LIZIZ(Boolean.valueOf(z));
        C1D66 c1d66 = this.LLIZ;
        ISearchContextAbility iSearchContextAbilityLIZ = C0Q3E.LIZ(this.itemView);
        if (iSearchContextAbilityLIZ != null) {
            c1d66.LJ(ISearchContextAbility.class, iSearchContextAbilityLIZ);
        }
        this.LL.LIZJ.LIZIZ(dynamicPatch);
        if (map != null) {
            this.LL.LJ.LIZIZ(map);
        }
        if (interfaceC641090PCp != null) {
            this.LL.LJFF.LIZIZ(interfaceC641090PCp);
        }
        if (lynxSSRInfo != null) {
            this.LL.LJI.LIZIZ(lynxSSRInfo);
        }
        if (clickSearchViewModel != null) {
            this.LL.LJII.LIZIZ(clickSearchViewModel);
        }
        Iterator<InterfaceC648220Pbg> it2 = this.LLILZIL.iterator();
        while (it2.hasNext()) {
            it2.next().bind();
        }
    }
}
