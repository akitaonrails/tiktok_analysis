package com.ss.android.ugc.aweme.favorites.business.collection;

import X.AbstractC1604130rqV;
import X.AbstractC1623806Xk;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03H5;
import X.C098200Yq;
import X.C0O2O;
import X.C0ZP4;
import X.C1170670gZN;
import X.C1170850gZf;
import X.C1170900gZk;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C11NJ;
import X.C1206780hVc;
import X.C1308910kAL;
import X.C1389890mGx;
import X.C13LE;
import X.C14EU;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C1770850wBP;
import X.C189200o6;
import X.C19474211Gy;
import X.C19719512Dh;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C2344009Gk;
import X.C295040BhO;
import X.C298410Bmp;
import X.C338490DOt;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C452501pT;
import X.C723850SaN;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C742510TAr;
import X.C786410Ut5;
import X.C987103tV;
import X.EnumC612200Nzm;
import X.EnumC614120O6w;
import X.InterfaceC0148002o;
import X.InterfaceC1170260gYi;
import X.InterfaceC1170340gYq;
import X.InterfaceC1206430hV3;
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
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.favorites.business.aweme.ability.IAwemeCollectionStateNotifier;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionDetail;
import com.ss.android.ugc.aweme.favorites.business.collection.vm.VideoCollectionListViewModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.state.ability.IStateNotifier;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS262S0300000_18;
import kotlin.jvm.internal.AwS32S0001000_18;
import kotlin.jvm.internal.AwS368S0200000_2;
import kotlin.jvm.internal.AwS384S0200000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.AwS667S0100000_18;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes19.dex */
public final class CollectionListFragmentForMineProfile extends BaseFragment implements InterfaceC724530SbT, InterfaceC1170340gYq, InterfaceC1170260gYi, C0O2O, InterfaceC1206430hV3 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILLL;
    public static final int LLJJ;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiMtPyAhITEpOmExPTYlJyogO2svJiHELIOSM/LSY4ICA9ZgYjJSM2KzElJiEfITY4Dz0yLygpJzsVJzcBICE2GDcjLyY/LQ==";
    public final AssemVMLazy LLIZ;
    public final C01GW LLIZLLLIL;
    public final InterfaceC1631620sYq<String, Object, EnumC614120O6w, Unit> LLJ;
    public int LLJI;
    public final C01GW LLJIJIL;
    public long LLJILJIL;
    public CollectionManageRequest LLJILJILJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CollectionListFragmentForMineProfile.class, "contentVM", "getContentVM()Lcom/ss/android/ugc/aweme/favorites/business/collection/vm/VideoCollectionListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJILLL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJJ = 8;
    }

    @Override // X.InterfaceC1170340gYq, X.InterfaceC723730SaB
    public /* bridge */ /* synthetic */ String LIZ() {
        return null;
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

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return VR(this, layoutInflater, viewGroup, bundle);
    }

    public CollectionListFragmentForMineProfile() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(VideoCollectionListViewModel.class);
        AwS562S0100000_18 awS562S0100000_18 = new AwS562S0100000_18(c19719912DlLIZ, 267);
        AFwS256S0000000_18 aFwS256S0000000_18 = AFwS256S0000000_18.get$arr$(91);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS562S0100000_18, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 268), aFwS256S0000000_18, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS562S0100000_18, new AwS562S0100000_18((Fragment) this, 269), aFwS256S0000000_18, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS562S0100000_18, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 270), aFwS256S0000000_18, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLIZ = assemVMLazy;
        this.LLIZLLLIL = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(123));
        this.LLJ = new AwS667S0100000_18(this, 6);
        this.LLJIJIL = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(122));
        this.LLJILJIL = System.currentTimeMillis();
    }

    public final C11NJ WR() {
        return (C11NJ) this.LLJIJIL.getValue();
    }

    public final VideoCollectionListViewModel ZR() {
        AssemVMLazy assemVMLazy = this.LLIZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILLL;
        return (VideoCollectionListViewModel) assemVMLazy.getValue();
    }

    public final AbstractC1604130rqV aS() {
        return (AbstractC1604130rqV) this.LLIZLLLIL.getValue();
    }

    @Override // X.InterfaceC1170340gYq
    public void CR() {
        aS().LJ("CollectionListFragmentForMineProfile onClickViewHolderToCreateCollection");
        C1206780hVc.LIZ("click create new collection in collection list");
        String str = C1170670gZN.LIZ() ? "personal_homepage" : "collection_video";
        C1170900gZk c1170900gZk = new C1170900gZk();
        c1170900gZk.LIZLLL = str;
        c1170900gZk.LJIIZILJ = "click_profile_favorite";
        c1170900gZk.LJIJI = "profile_add";
        String str2 = ZR().LLILZ;
        if (str2 != null) {
            c1170900gZk.LJIILLIIL = str2;
        }
        c1170900gZk.LJIILJJIL();
        C19EG c19egRequireActivity = requireActivity();
        new AwS262S0300000_18(c19egRequireActivity, this, new C1170850gZf(this, str, c19egRequireActivity), 3).invoke();
    }

    @Override // X.InterfaceC1170260gYi
    public void Y0() {
        ZR().vQ2(null, true, false, false, false);
    }

    public void cS() {
        VideoCollectionListViewModel videoCollectionListViewModelZR = ZR();
        videoCollectionListViewModelZR.getClass();
        videoCollectionListViewModelZR.setStateImmediate(new AwS32S0001000_18(13));
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        WR().LJ();
        EventBus.LIZLLL().LJJI(this);
        if (C298410Bmp.LIZ()) {
            ((IStateNotifier) ServiceManager.get().getService(IAwemeCollectionStateNotifier.class)).removeSubscriber(this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        CollectionManageRequest collectionManageRequest = this.LLJILJILJ;
        if (collectionManageRequest != null) {
            AbstractC1604130rqV abstractC1604130rqVAS = aS();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("CollectionListFragmentForMineProfile onResume cost event collectionId: ");
            sbLIZ.append(collectionManageRequest.collectionId);
            sbLIZ.append(", collectionName: ");
            sbLIZ.append(collectionManageRequest.collectionName);
            sbLIZ.append(", operation: ");
            sbLIZ.append(collectionManageRequest.operation);
            abstractC1604130rqVAS.LJ(C2188811AlT.LIZIZ(sbLIZ));
            if (collectionManageRequest.operation == 2) {
                C1389890mGx c1389890mGx = new C1389890mGx(requireActivity());
                c1389890mGx.LJIIIZ(2131834475);
                c1389890mGx.LJIIJJI();
                C19719512Dh.LIZJ(VideoCollectionListViewModel.LLIZLLLIL).remove(collectionManageRequest.collectionId);
            }
            if (collectionManageRequest.operation == 1) {
                C1389890mGx c1389890mGx2 = new C1389890mGx(requireActivity());
                c1389890mGx2.LJIIIZ(2131834467);
                c1389890mGx2.LJFF(R.raw.icon_tick_fill_small);
                c1389890mGx2.LJII(R.attr.a0i);
                c1389890mGx2.LJIIJJI();
            }
            if (collectionManageRequest.operation == 10) {
                CollectionDetail collectionDetail = (CollectionDetail) ((LinkedHashMap) VideoCollectionListViewModel.LLIZLLLIL).get(collectionManageRequest.collectionId);
                if (collectionDetail != null) {
                    collectionDetail.statistic = new CollectionDetail.Statistic(Long.valueOf(collectionManageRequest.addIds != null ? r0.size() : 0L), true);
                }
                mS(ZR(), new AwS384S0200000_18(this, collectionManageRequest, 44));
            }
            this.LLJILJILJ = null;
        }
    }

    public final CollectionManageRequest bS() {
        return this.LLJILJILJ;
    }

    @Override // X.InterfaceC725030ScH
    public LifecycleOwner getOwnLifecycleOwner() {
        getActualLifecycleOwner();
        return this;
    }

    @Override // X.InterfaceC1206430hV3
    public void VE(String str) {
        if (getFragmentManager() == null) {
            return;
        }
        ZR().LLILZ = str;
    }

    public final void hS(CollectionManageRequest collectionManageRequest) {
        this.LLJILJILJ = collectionManageRequest;
    }

    @C14EU
    public final void handleOnOperationEvent(C742510TAr c742510TAr) {
        ZR().vQ2(null, true, false, false, false);
        if (c742510TAr.LIZ.operation == 10 && !Intrinsics.LJFF(c742510TAr.LIZIZ, "create_collection")) {
            return;
        }
        if (c742510TAr.LIZ.operation == 1 && !Intrinsics.LJFF(c742510TAr.LIZIZ, "create_collection")) {
            return;
        }
        this.LLJILJILJ = c742510TAr.LIZ;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        NR(AFwS256S0000000_18.get$arr$(90));
        if (C298410Bmp.LIZ()) {
            ((IStateNotifier) ServiceManager.get().getService(IAwemeCollectionStateNotifier.class)).addSubscriber(this);
        }
    }

    public <VM1 extends AssemViewModel<S1>, S1 extends InterfaceC0148002o, R> R mS(VM1 vm1, Function1<? super S1, ? extends R> function1) {
        return (R) C736680Sv4.LJIJJ(vm1, function1);
    }

    public <VM1 extends AssemViewModel<S1>, S1 extends InterfaceC0148002o> void nS(VM1 vm1, Function1<? super S1, Unit> function1) {
        C736680Sv4.LJIJJLI(vm1, function1);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        String nickName;
        String curUserId;
        FrameLayout.LayoutParams layoutParams;
        Integer numLIZJ;
        aS().LJ("CollectionListFragmentForMineProfile onViewCreated");
        super.onViewCreated(view, bundle);
        if (C295040BhO.LIZ()) {
            Context context = getContext();
            if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.zp, context)) != null) {
                view.setBackground(new ColorDrawable(numLIZJ.intValue()));
            }
            View viewFindViewById = view.findViewById(R.id.e6l);
            if (viewFindViewById != null) {
                ViewGroup.LayoutParams layoutParams2 = viewFindViewById.getLayoutParams();
                if ((layoutParams2 instanceof FrameLayout.LayoutParams) && (layoutParams = (FrameLayout.LayoutParams) layoutParams2) != null) {
                    layoutParams.topMargin = 0;
                }
            }
        }
        VideoCollectionListViewModel videoCollectionListViewModelZR = ZR();
        AccountUserService accountUserServiceLJIIJ = ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ();
        if (accountUserServiceLJIIJ != null) {
            nickName = accountUserServiceLJIIJ.getNickName();
        } else {
            nickName = null;
        }
        videoCollectionListViewModelZR.LLILLJJLI = nickName;
        VideoCollectionListViewModel videoCollectionListViewModelZR2 = ZR();
        AccountUserService accountUserServiceLJIIJ2 = ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ();
        if (accountUserServiceLJIIJ2 != null) {
            curUserId = accountUserServiceLJIIJ2.getCurUserId();
        } else {
            curUserId = null;
        }
        videoCollectionListViewModelZR2.LL = curUserId;
        ZR().LLILLL = "personal_homepage";
        C723850SaN.LIZ(this, false, null, new AwS368S0200000_2(this, view, 28), 3);
        EventBus.LIZLLL().LJIJJ(this);
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("tab_name", "collections");
        c2344009Gk.LJIIIIZZ("enter_from", "personal_homepage");
        C20684815ws.LJIILLIIL("collection_tab_init", c2344009Gk.LIZ);
        ZR().vQ2(null, true, false, false, false);
        AssemViewModel.asyncSubscribe$default(ZR(), new C2217381BqS() { // from class: X.0gZe
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1160250gIZ) obj).LL;
            }
        }, null, null, null, new AwS597S0100000_18(this, 90), 14, null);
    }

    public View UR(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.acs, viewGroup, false);
    }

    @Override // X.C0O2O
    public void Wz(String str, boolean z, EnumC612200Nzm enumC612200Nzm) {
        if (enumC612200Nzm == EnumC612200Nzm.MUTATION) {
            AbstractC1604130rqV abstractC1604130rqVAS = aS();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("CollectionListFragmentForMineProfile onAwemeCollectionStateChange id: ");
            sbLIZ.append(str);
            sbLIZ.append(", newState: ");
            sbLIZ.append(z);
            abstractC1604130rqVAS.LJ(C2188811AlT.LIZIZ(sbLIZ));
            ZR().vQ2(null, true, false, false, false);
        }
    }

    public void dS(String str, boolean z, EnumC612200Nzm enumC612200Nzm) {
        Wz(str, z, enumC612200Nzm);
    }

    public <VM1 extends AssemViewModel<S1>, S1 extends InterfaceC0148002o, VM2 extends AssemViewModel<S2>, S2 extends InterfaceC0148002o, R> R kS(VM1 vm1, VM2 vm2, Function2<? super S1, ? super S2, ? extends R> function2) {
        return (R) C736680Sv4.LJIJI(vm1, vm2, function2);
    }

    @Override // X.InterfaceC612260Nzs
    public /* bridge */ /* synthetic */ void xt(String str, Boolean bool, EnumC612200Nzm enumC612200Nzm) {
        dS(str, bool.booleanValue(), enumC612200Nzm);
    }

    public static View VR(CollectionListFragmentForMineProfile collectionListFragmentForMineProfile, LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewUR = collectionListFragmentForMineProfile.UR(layoutInflater, viewGroup, bundle);
        C19GS c19gs = null;
        if (!(viewUR instanceof View)) {
            viewUR = null;
        }
        if (viewUR != null) {
            try {
                ViewTreeLifecycleOwner.set(viewUR, collectionListFragmentForMineProfile.getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewUR, collectionListFragmentForMineProfile);
                viewUR.setTag(R.id.view_tree_saved_state_registry_owner, collectionListFragmentForMineProfile);
                C19EG activity = collectionListFragmentForMineProfile.getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewUR;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewUR;
    }

    public <VM1 extends AssemViewModel<S1>, S1 extends InterfaceC0148002o, VM2 extends AssemViewModel<S2>, S2 extends InterfaceC0148002o, VM3 extends AssemViewModel<S3>, S3 extends InterfaceC0148002o, R> R iS(VM1 vm1, VM2 vm2, VM3 vm3, InterfaceC1631620sYq<? super S1, ? super S2, ? super S3, ? extends R> interfaceC1631620sYq) {
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

    public <S extends InterfaceC0148002o, T> C0ZP4 SR(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends AbstractC1623806Xk<? extends T>> interfaceC2217241BqE, C1770850wBP<C11H9<AbstractC1623806Xk<T>>> c1770850wBP, Function2<? super C03H5, ? super Throwable, Unit> function2, Function1<? super C03H5, Unit> function1, Function2<? super C03H5, ? super T, Unit> function22) {
        return C736680Sv4.LIZ(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function2, function1, function22);
    }

    public <S extends InterfaceC0148002o, A, B> C0ZP4 gS(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, Function1<? super Throwable, Unit> function1, C1770850wBP<C19474211Gy<A, B>> c1770850wBP, InterfaceC1631620sYq<? super C03H5, ? super A, ? super B, Unit> interfaceC1631620sYq) {
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
