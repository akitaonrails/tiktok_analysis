package com.ss.android.ugc.aweme.favorites.business.collection;

import X.AbstractC1604130rqV;
import X.AbstractC1623806Xk;
import X.AbstractC848400XPy;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03H5;
import X.C098200Yq;
import X.C0XQ7;
import X.C0ZP4;
import X.C1170520gZ8;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C11NJ;
import X.C13LE;
import X.C1606420ruC;
import X.C1607950rwf;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C1770850wBP;
import X.C189200o6;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C338490DOt;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C452501pT;
import X.C723850SaN;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C987103tV;
import X.InterfaceC0148002o;
import X.InterfaceC1170530gZ9;
import X.InterfaceC1171100ga4;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC724530SbT;
import X.InterfaceC724760Sbq;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import X.InterfaceC836760Ws6;
import Y.ACListenerS153S0100000_18;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.favorites.business.collection.base.BasePage;
import com.ss.android.ugc.aweme.favorites.business.collection.vm.VideoCollectionContentViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS384S0200000_18;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@InterfaceC836760Ws6
public final class AddVideosFragment extends BasePage implements InterfaceC724530SbT, InterfaceC1170530gZ9, InterfaceC1171100ga4 {
    public static final C1170520gZ8 LLJJIJIIJIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIL;
    public static final int LLJJJ;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiMtPyAhITEpOmExHELIOSPTYlJyogO2svJiM/LSY4ICA9ZgQoLRk6LCAjOgkhKSIhLCEn";
    public String LLJ;
    public String LLJI;
    public String LLJIJIL;
    public String LLJILJIL;
    public Integer LLJILJILJ;
    public String[] LLJILLL;
    public String LLJJ;
    public final AssemVMLazy LLJJI;
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0gZ8] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AddVideosFragment.class, "contentVM", "getContentVM()Lcom/ss/android/ugc/aweme/favorites/business/collection/vm/VideoCollectionContentViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJJIJIIJIL = new Object() { // from class: X.0gZ8
        };
        LLJJJ = 8;
    }

    @Override // com.ss.android.ugc.aweme.favorites.business.collection.base.BasePage, X.InterfaceC21503819Do
    public /* bridge */ /* synthetic */ void FE(Bundle bundle) {
    }

    @Override // X.InterfaceC1170530gZ9, X.InterfaceC723730SaB
    public /* bridge */ /* synthetic */ String LIZ() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.favorites.business.collection.base.BasePage, X.InterfaceC21503819Do
    public /* bridge */ /* synthetic */ void Q9(Activity activity) {
    }

    @Override // com.ss.android.ugc.aweme.favorites.business.collection.base.BasePage, X.InterfaceC21503819Do
    public /* bridge */ /* synthetic */ void WK(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.favorites.business.collection.base.BasePage
    public int WR() {
        return R.layout.c69;
    }

    @Override // com.ss.android.ugc.aweme.favorites.business.collection.base.BasePage, X.InterfaceC21503819Do
    public /* bridge */ /* synthetic */ void ap() {
    }

    @Override // X.InterfaceC724530SbT, X.InterfaceC736810SvH
    public LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public InterfaceC736810SvH getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC725050ScJ
    public C03H5 getActualReceiver() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public InterfaceC725050ScJ<C03H5> getActualReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // X.InterfaceC1171100ga4
    public void gm() {
    }

    @Override // X.InterfaceC1171100ga4
    public void i8() {
    }

    @Override // com.ss.android.ugc.aweme.favorites.business.collection.base.BasePage, X.InterfaceC21503819Do
    public /* bridge */ /* synthetic */ void onActivityFinish() {
    }

    @Override // com.ss.android.ugc.aweme.favorites.business.collection.base.BasePage, X.InterfaceC21503819Do
    public /* bridge */ /* synthetic */ Boolean onActivityKeyDown(int i, KeyEvent keyEvent) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.favorites.business.collection.base.BasePage, X.InterfaceC21503819Do
    public /* bridge */ /* synthetic */ Boolean onActivityKeyLongPress(int i, KeyEvent keyEvent) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.favorites.business.collection.base.BasePage, X.InterfaceC21503819Do
    public /* bridge */ /* synthetic */ Boolean onActivityKeyUp(int i, KeyEvent keyEvent) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.favorites.business.collection.base.BasePage, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return gS(this, layoutInflater, viewGroup, bundle);
    }

    @Override // com.ss.android.ugc.aweme.favorites.business.collection.base.BasePage, X.InterfaceC21503819Do
    public /* bridge */ /* synthetic */ void qO(Intent intent) {
    }

    @Override // X.InterfaceC1171100ga4
    public void qt(boolean z) {
    }

    @Override // X.InterfaceC1171100ga4
    public void xJ(Aweme aweme) {
    }

    public AddVideosFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(VideoCollectionContentViewModel.class);
        AwS556S0100000_12 awS556S0100000_12 = new AwS556S0100000_12(c19719912DlLIZ, 425);
        AFwS256S0000000_18 aFwS256S0000000_18 = AFwS256S0000000_18.get$arr$(85);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS556S0100000_12, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 260), aFwS256S0000000_18, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS556S0100000_12, new AwS562S0100000_18((Fragment) this, 261), aFwS256S0000000_18, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS556S0100000_12, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 262), aFwS256S0000000_18, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJJI = assemVMLazy;
        this.LLJJIII = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(117));
        this.LLJJIJI = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(116));
    }

    private final VideoCollectionContentViewModel qS() {
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIL;
        return (VideoCollectionContentViewModel) assemVMLazy.getValue();
    }

    private final AbstractC1604130rqV rS() {
        return (AbstractC1604130rqV) this.LLJJIII.getValue();
    }

    public final C11NJ oS() {
        return (C11NJ) this.LLJJIJI.getValue();
    }

    @Override // X.InterfaceC1170530gZ9
    public void D5() {
        rS().LJ("AddVideosFragment onClickButtonToAddVideosToCollection");
        HS(qS(), new AwS597S0100000_18(this, 87));
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        oS().LJ();
    }

    public final String getEnterFrom() {
        return this.LLJILJIL;
    }

    public final String getEnterMethod() {
        return this.LLJIJIL;
    }

    @Override // X.InterfaceC725030ScH
    public LifecycleOwner getOwnLifecycleOwner() {
        getActualLifecycleOwner();
        return this;
    }

    public final String[] hS() {
        return this.LLJILLL;
    }

    public final String iS() {
        return this.LLJ;
    }

    public final String kS() {
        return this.LLJI;
    }

    public final Integer mS() {
        return this.LLJILJILJ;
    }

    public final String nS() {
        return this.LLJJ;
    }

    public final void BS(String str) {
        this.LLJJ = str;
    }

    public final void ES(String str) {
        this.LLJILJIL = str;
    }

    public final void setEnterMethod(String str) {
        this.LLJIJIL = str;
    }

    public final void uS(String[] strArr) {
        this.LLJILLL = strArr;
    }

    public final void wS(String str) {
        this.LLJ = str;
    }

    public final void yS(String str) {
        this.LLJI = str;
    }

    public final void zS(Integer num) {
        this.LLJILJILJ = num;
    }

    public <VM1 extends AssemViewModel<S1>, S1 extends InterfaceC0148002o, R> R HS(VM1 vm1, Function1<? super S1, ? extends R> function1) {
        return (R) C736680Sv4.LJIJJ(vm1, function1);
    }

    public <VM1 extends AssemViewModel<S1>, S1 extends InterfaceC0148002o> void JS(VM1 vm1, Function1<? super S1, Unit> function1) {
        C736680Sv4.LJIJJLI(vm1, function1);
    }

    @Override // X.InterfaceC1171100ga4
    public void Po(View view, Aweme aweme) {
        AbstractC1604130rqV abstractC1604130rqVRS = rS();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AddVideosFragment onClickItemViewHolderToEnterAwemeDetail aid: ");
        sbLIZ.append(aweme.getAid());
        abstractC1604130rqVRS.LJ(C2188811AlT.LIZIZ(sbLIZ));
        C1606420ruC c1606420ruCLIZ = C1607950rwf.LIZ(view, view.getWidth(), view.getHeight());
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(getActivity(), "aweme://aweme/detail/");
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI(FollowStatusChangeMethod.PARAM_UID, aweme.getAid(), bundle);
        C786410Ut5.LJJJI("userid", ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId(), bundle);
        C786410Ut5.LJJJI("sec_userid", ((AbstractC848400XPy) C0XQ7.LJFF()).getCurSecUserId(), bundle);
        C786410Ut5.LJJJI("refer", "collection_video", bundle);
        C786410Ut5.LJJJI("tab_name", "collection", bundle);
        bundle.putBoolean("is_clean_mode", true);
        smartRouteBuildRoute.withParam(bundle);
        smartRouteBuildRoute.withBundleAnimation(c1606420ruCLIZ.LJFF());
        smartRouteBuildRoute.withParam("activity_has_activity_options", true);
        smartRouteBuildRoute.open();
    }

    @Override // com.ss.android.ugc.aweme.favorites.business.collection.base.BasePage, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        rS().LJ("AddVideosFragment onViewCreated");
        C786410Ut5.I7(new ACListenerS153S0100000_18(this, 12), view.findViewById(R.id.dat));
        C723850SaN.LIZ(this, false, null, new AwS384S0200000_18(this, view, 37), 3);
    }

    public <VM1 extends AssemViewModel<S1>, S1 extends InterfaceC0148002o, VM2 extends AssemViewModel<S2>, S2 extends InterfaceC0148002o, R> R GS(VM1 vm1, VM2 vm2, Function2<? super S1, ? super S2, ? extends R> function2) {
        return (R) C736680Sv4.LJIJI(vm1, vm2, function2);
    }

    public View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.c69, viewGroup, false);
    }

    public static View gS(AddVideosFragment addVideosFragment, LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewDS = addVideosFragment.dS(layoutInflater, viewGroup, bundle);
        C19GS c19gs = null;
        if (!(viewDS instanceof View)) {
            viewDS = null;
        }
        if (viewDS != null) {
            try {
                ViewTreeLifecycleOwner.set(viewDS, addVideosFragment.getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewDS, addVideosFragment);
                viewDS.setTag(R.id.view_tree_saved_state_registry_owner, addVideosFragment);
                C19EG activity = addVideosFragment.getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewDS;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewDS;
    }

    public <VM1 extends AssemViewModel<S1>, S1 extends InterfaceC0148002o, VM2 extends AssemViewModel<S2>, S2 extends InterfaceC0148002o, VM3 extends AssemViewModel<S3>, S3 extends InterfaceC0148002o, R> R FS(VM1 vm1, VM2 vm2, VM3 vm3, InterfaceC1631620sYq<? super S1, ? super S2, ? super S3, ? extends R> interfaceC1631620sYq) {
        return (R) C736680Sv4.LJIJ(vm1, vm2, vm3, interfaceC1631620sYq);
    }

    @Override // X.InterfaceC725030ScH
    public <S extends InterfaceC0148002o> C0ZP4 subscribe(AssemViewModel<S> assemViewModel, C1770850wBP<S> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super S, Unit> function2) {
        return C736680Sv4.LJIILLIIL(this, assemViewModel, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJ(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJIILJJIL(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    public <S extends InterfaceC0148002o, T> C0ZP4 cS(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends AbstractC1623806Xk<? extends T>> interfaceC2217241BqE, C1770850wBP<C11H9<AbstractC1623806Xk<T>>> c1770850wBP, Function2<? super C03H5, ? super Throwable, Unit> function2, Function1<? super C03H5, Unit> function1, Function2<? super C03H5, ? super T, Unit> function22) {
        return C736680Sv4.LIZ(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function2, function1, function22);
    }

    public <S extends InterfaceC0148002o, A, B> C0ZP4 sS(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, Function1<? super Throwable, Unit> function1, C1770850wBP<C19474211Gy<A, B>> c1770850wBP, InterfaceC1631620sYq<? super C03H5, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C736680Sv4.LJIILIIL(assemViewModel, this, c1770850wBP, function1, interfaceC1631620sYq, interfaceC2217241BqE, interfaceC2217241BqE2);
    }

    @Override // X.InterfaceC725030ScH
    public <S extends InterfaceC0148002o, A, B> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1770850wBP<C19474211Gy<A, B>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631620sYq<? super C03H5, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C736680Sv4.LIZLLL(assemViewModel, this, c1770850wBP, function1, interfaceC1631620sYq, interfaceC2217241BqE, interfaceC2217241BqE2);
    }

    @Override // X.InterfaceC725030ScH
    public <S extends InterfaceC0148002o, A, B, C> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1770850wBP<C11H7<A, B, C>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631630sYr<? super C03H5, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C736680Sv4.LJFF(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1770850wBP, function1, interfaceC1631630sYr);
    }

    @Override // X.InterfaceC725030ScH
    public <S extends InterfaceC0148002o, A, B, C, D> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1770850wBP<C11H6<A, B, C, D>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685420txc<? super C03H5, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C736680Sv4.LJI(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1770850wBP, function1, interfaceC1685420txc);
    }

    @Override // X.InterfaceC725030ScH
    public <S extends InterfaceC0148002o, A, B, C, D, E> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, InterfaceC2217241BqE<S, ? extends E> interfaceC2217241BqE5, C1770850wBP<C11H2<A, B, C, D, E>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685430txd<? super C03H5, ? super A, ? super B, ? super C, ? super D, ? super E, Unit> interfaceC1685430txd) {
        return C736680Sv4.LJII(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, interfaceC2217241BqE5, c1770850wBP, function1, interfaceC1685430txd);
    }
}
