package com.ss.android.ugc.aweme.relation.fragment.muflist;

import X.AbstractC1263550izB;
import X.AbstractC1906720ziY;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03H5;
import X.C098200Yq;
import X.C0BKW;
import X.C0DLI;
import X.C0HTI;
import X.C0I7D;
import X.C0VWN;
import X.C0ZP4;
import X.C1073000e1q;
import X.C1075800e6M;
import X.C1076010e6h;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1251110if7;
import X.C1253000iiA;
import X.C1262970iyF;
import X.C1263590izF;
import X.C1263610izH;
import X.C1263790izZ;
import X.C1263820izc;
import X.C1266020j3A;
import X.C13BV;
import X.C13IQ;
import X.C13LE;
import X.C14EU;
import X.C1622206Wu;
import X.C1623606Xi;
import X.C1685300txQ;
import X.C16G0;
import X.C16G1;
import X.C16GX;
import X.C1722300uv6;
import X.C1749260vca;
import X.C1749280vcc;
import X.C1770850wBP;
import X.C189200o6;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C19EG;
import X.C19EH;
import X.C19GS;
import X.C20684815ws;
import X.C2217381BqS;
import X.C2344009Gk;
import X.C295390Bhx;
import X.C338490DOt;
import X.C418440Gaw;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C452501pT;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C7740030o;
import X.C786410Ut5;
import X.C888460YtI;
import X.C897520ZIw;
import X.C987103tV;
import X.EnumC1262450ixP;
import X.EnumC1726100v1E;
import X.InterfaceC0148002o;
import X.InterfaceC1242460iRA;
import X.InterfaceC1261750iwH;
import X.InterfaceC1264300j0O;
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
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ACListenerS154S0100000_19;
import Y.AObserverS223S0100000_19;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.ies.powerlist.page.config.PowerPageSource;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.muflist.MufPageTrackInfo;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS46S0301000_19;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.AwS633S0100000_19;
import kotlin.jvm.internal.AwS668S0100000_19;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes20.dex */
public final class MufListPageFragment extends BaseFragment implements InterfaceC724530SbT {
    public static final C1073000e1q LLJZIJLIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLL;
    public static final Gson LLLF;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjcpJS4nISoiZykhHELIOSKSIhLCEnZig5LyM6OzFiBDo1BCw/PR8yLyAKOy40JSAiPQ==";
    public ViewOnAttachStateChangeListenerC20604515jv LLIZ;
    public C1749280vcc LLIZLLLIL;
    public C1749260vca LLJ;
    public ViewOnAttachStateChangeListenerC20604515jv LLJI;
    public C1749280vcc LLJIJIL;
    public C16G0 LLJILJIL;
    public FrameLayout LLJILJILJ;
    public C16GX LLJILLL;
    public FrameLayout LLJJ;
    public AbstractC1263550izB LLJJJ;
    public boolean LLJL;
    public boolean LLJLIL;
    public final AssemVMLazy LLJLL;
    public long LLJLLIL;
    public int LLJLLL;
    public Function0<Unit> LLJZ;
    public final C01GW LLJJI = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1726));
    public final C01GW LLJJIII = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1727));
    public final C01GW LLJJIJI = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1723));
    public final C01GW LLJJIJIIJIL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 561));
    public final C01GW LLJJIJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1724));
    public final C01GW LLJJJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1725));
    public final C01GW LLJJJJ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(253));
    public final C01GW LLJJJJJIL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 559));
    public final C01GW LLJJJJLIIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1728));
    public final C01GW LLJJL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(302));
    public boolean LLJJLIIIJLLLLLLLZ = true;
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(303));

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0e1q] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MufListPageFragment.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/relation/fragment/muflist/MufListPageViewModel;", 0);
        C13LE.LIZ.getClass();
        LLL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJZIJLIL = new Object() { // from class: X.0e1q
        };
        LLLF = C7740030o.LIZ().getGson();
    }

    public final void ZR() {
        SR(true);
        kS().setSearchBarHeight(EnumC1726100v1E.HIGH);
        kS().getEditTextView().setHint((String) this.LLJLILLLLZIIL.getValue());
        kS().setEditBackgroundRadius(C418440Gaw.LIZIZ(8));
        kS().setOnClickClearListener(new ACListenerS154S0100000_19(this, 126));
        kS().getEditTextView().addTextChangedListener(new C1266020j3A(this, 8));
    }

    @Override // X.InterfaceC724530SbT, X.InterfaceC736810SvH
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC736810SvH getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC725050ScJ
    public final C03H5 getActualReceiver() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC725050ScJ<C03H5> getActualReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    public MufListPageFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MufListPageViewModel.class);
        AwS560S0100000_16 awS560S0100000_16 = new AwS560S0100000_16((C13IQ) c19719912DlLIZ, 560);
        AFwS257S0000000_19 aFwS257S0000000_19 = AFwS257S0000000_19.get$arr$(266);
        if (Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS560S0100000_16, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS563S0100000_19((HasDefaultViewModelProviderFactory) this, 1729), aFwS257S0000000_19, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS560S0100000_16, new AwS563S0100000_19((Fragment) this, 1730), aFwS257S0000000_19, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, C019F.LIZ)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS560S0100000_16, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS563S0100000_19((HasDefaultViewModelProviderFactory) this, 1731), aFwS257S0000000_19, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJLL = assemVMLazy;
        this.LLJLLL = -1;
    }

    public final boolean UR() {
        if (Intrinsics.LJFF(this.LLJJIJI.getValue(), "relation_tab") && hS() == EnumC1262450ixP.TT_RELATION_PAGE && C1251110if7.LJ()) {
            return true;
        }
        IMufListAppDiffProtocol.LIZ.getClass();
        C1263790izZ.LIZIZ.getValue().LIZ();
        return false;
    }

    public final C16GX aS() {
        View viewFindViewById = this.LLJILLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.b6k) : null;
            this.LLJILLL = (C16GX) viewFindViewById;
        }
        return (C16GX) viewFindViewById;
    }

    public final C16G0 bS() {
        View viewFindViewById = this.LLJILJIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.exw) : null;
            this.LLJILJIL = (C16G0) viewFindViewById;
        }
        return (C16G0) viewFindViewById;
    }

    public final FrameLayout cS() {
        View viewFindViewById = this.LLJILJILJ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.inx) : null;
            this.LLJILJILJ = (FrameLayout) viewFindViewById;
        }
        return (FrameLayout) viewFindViewById;
    }

    public final FrameLayout dS() {
        View viewFindViewById = this.LLJJ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.msr) : null;
            this.LLJJ = (FrameLayout) viewFindViewById;
        }
        return (FrameLayout) viewFindViewById;
    }

    public final C1263610izH gS() {
        return (C1263610izH) this.LLJJJIL.getValue();
    }

    public final EnumC1262450ixP hS() {
        return (EnumC1262450ixP) this.LLJJI.getValue();
    }

    public final ViewOnAttachStateChangeListenerC20604515jv iS() {
        View viewFindViewById = this.LLIZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.rn0) : null;
            this.LLIZ = (ViewOnAttachStateChangeListenerC20604515jv) viewFindViewById;
        }
        return (ViewOnAttachStateChangeListenerC20604515jv) viewFindViewById;
    }

    public final C1749260vca kS() {
        View viewFindViewById = this.LLJ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.u78) : null;
            this.LLJ = (C1749260vca) viewFindViewById;
        }
        return (C1749260vca) viewFindViewById;
    }

    public final ViewOnAttachStateChangeListenerC20604515jv mS() {
        View viewFindViewById = this.LLJI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.ubr) : null;
            this.LLJI = (ViewOnAttachStateChangeListenerC20604515jv) viewFindViewById;
        }
        return (ViewOnAttachStateChangeListenerC20604515jv) viewFindViewById;
    }

    public final C1749280vcc nS() {
        View viewFindViewById = this.LLJIJIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.ueo) : null;
            this.LLJIJIL = (C1749280vcc) viewFindViewById;
        }
        return (C1749280vcc) viewFindViewById;
    }

    public final C1749280vcc oS() {
        View viewFindViewById = this.LLIZLLLIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.w28) : null;
            this.LLIZLLLIL = (C1749280vcc) viewFindViewById;
        }
        return (C1749280vcc) viewFindViewById;
    }

    public final MufPageTrackInfo qS() {
        return (MufPageTrackInfo) this.LLJJIJIIJIL.getValue();
    }

    public final MufListPageViewModel rS() {
        AssemVMLazy assemVMLazy = this.LLJLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLL;
        return (MufListPageViewModel) assemVMLazy.getValue();
    }

    public final void wS() {
        if (this.LLJLLIL == 0) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LLJLLIL;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZLLL(jCurrentTimeMillis, "load_time");
        c2344009Gk.LJIIIIZZ("enter_from", (String) this.LLJJIJI.getValue());
        c2344009Gk.LJIIIIZZ("previous_page", (String) this.LLJJIII.getValue());
        C20684815ws.LJIILLIIL("friends_list_load_monitor", c2344009Gk.LIZ);
        this.LLJLLIL = 0L;
    }

    public final void VR() {
        FragmentManager supportFragmentManager;
        C786410Ut5.LLILZLL(bS(), 8);
        C786410Ut5.LLLZLZ(oS(), 8);
        if (!this.LLJL) {
            C19EG activity = getActivity();
            if (activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null) {
                return;
            }
            C19EH c19ehLJIIJ = supportFragmentManager.LJIIJ();
            c19ehLJIIJ.LIZIZ(R.id.inx, (Fragment) this.LLJJJJ.getValue());
            c19ehLJIIJ.LJIIIZ();
            this.LLJL = true;
        }
        C786410Ut5.LJZ(0, cS());
    }

    public final void WR() {
        C786410Ut5.LJZ(8, cS());
        C786410Ut5.LLILZLL(bS(), 8);
        C786410Ut5.LLLZLZ(oS(), 0);
        if (C295390Bhx.LIZJ()) {
            oS().setLayoutVariant(0);
        }
        C1749280vcc c1749280vccOS = oS();
        if (c1749280vccOS != null) {
            c1749280vccOS.setTopMargin(C418440Gaw.LIZIZ(150));
            C1722300uv6 c1722300uv6 = new C1722300uv6();
            C0HTI c0hti = new C0HTI();
            c0hti.LIZ = R.drawable.nl;
            Drawable drawableLIZ = c0hti.LIZ(requireContext());
            c1722300uv6.LIZJ = 2;
            c1722300uv6.LIZ = drawableLIZ;
            c1722300uv6.LJI = getString(R.string.m25);
            c1722300uv6.LJIIIIZZ = getString(R.string.f8c);
            c1722300uv6.LJIIIZ = new AwS598S0100000_19(this, 224);
            c1749280vccOS.setStatus(c1722300uv6);
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        C897520ZIw c897520ZIw = rS().LLILLL;
        if (c897520ZIw != null) {
            c897520ZIw.destroy();
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvIS = iS();
        if (viewOnAttachStateChangeListenerC20604515jvIS != null) {
            HandlerHook.viewRemoveCallbacks(viewOnAttachStateChangeListenerC20604515jvIS, (Runnable) this.LLJJJJJIL.getValue());
        }
        EventBus.LIZLLL().LJJI(this);
        this.LLIZ = null;
        this.LLIZLLLIL = null;
        this.LLJ = null;
        this.LLJI = null;
        this.LLJIJIL = null;
        this.LLJILJIL = null;
        this.LLJILJILJ = null;
        this.LLJILLL = null;
        this.LLJJ = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        C0I7D editTextView;
        super.onPause();
        InterfaceC1264300j0O interfaceC1264300j0OZQ2 = rS().zQ2();
        if (interfaceC1264300j0OZQ2 != null) {
            interfaceC1264300j0OZQ2.m6();
        }
        C1749260vca c1749260vcaKS = kS();
        if (c1749260vcaKS == null || (editTextView = c1749260vcaKS.getEditTextView()) == null) {
            return;
        }
        editTextView.setCursorVisible(false);
        editTextView.clearFocus();
        C0DLI.LIZ(getActivity(), editTextView);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.LLJJLIIIJLLLLLLLZ) {
            this.LLJJLIIIJLLLLLLLZ = false;
            refresh();
        }
        rS().vQ2();
        InterfaceC1264300j0O interfaceC1264300j0OZQ2 = rS().zQ2();
        if (interfaceC1264300j0OZQ2 != null) {
            interfaceC1264300j0OZQ2.XR();
        }
    }

    public final void refresh() {
        this.LLJLLIL = System.currentTimeMillis();
        gS().LLILZLL.LJFF(null);
        MufListPageViewModel mufListPageViewModelRS = rS();
        mufListPageViewModelRS.setState(AFwS257S0000000_19.get$arr$(273));
        ((PowerPageSource) mufListPageViewModelRS.LLIZ.getValue()).getOperator().refresh();
        if (uS()) {
            if (!UR() || C1263590izF.LIZJ()) {
                AbstractC1263550izB abstractC1263550izB = this.LLJJJ;
                ((C1262970iyF) (abstractC1263550izB != null ? abstractC1263550izB : null)).LLFZ(false);
            }
        }
    }

    public final boolean uS() {
        if (!hS().getRecommendedCardEnabled()) {
            return false;
        }
        IMufListAppDiffProtocol.LIZ.getClass();
        C1263790izZ.LIZIZ.getValue().LIZIZ();
        return true;
    }

    public final void yS() {
        if (uS()) {
            if (!UR() || C1263590izF.LIZJ()) {
                List<AbstractC1906720ziY> allChunks = iS().getAllChunks();
                AbstractC1263550izB abstractC1263550izB = this.LLJJJ;
                if (abstractC1263550izB == null) {
                    abstractC1263550izB = null;
                }
                if (allChunks.contains(abstractC1263550izB)) {
                    ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvIS = iS();
                    AbstractC1263550izB abstractC1263550izB2 = this.LLJJJ;
                    viewOnAttachStateChangeListenerC20604515jvIS.LJIJJLI(abstractC1263550izB2 != null ? abstractC1263550izB2 : null);
                }
            }
        }
    }

    public final void SR(boolean z) {
        ViewGroup.LayoutParams layoutParams = aS().getLayoutParams();
        int i = 0;
        if (z) {
            layoutParams.height = -2;
            C16G1 c16g1 = (C16G1) dS().getLayoutParams();
            c16g1.LIZIZ(new AppBarLayout$ScrollingViewBehavior());
            C786410Ut5.a6(dS(), c16g1);
        } else {
            layoutParams.height = 0;
            C16G1 c16g12 = (C16G1) dS().getLayoutParams();
            c16g12.LIZIZ(null);
            C786410Ut5.a6(dS(), c16g12);
        }
        C16GX c16gxAS = aS();
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c16gxAS);
        c16gxAS.setLayoutParams(layoutParams);
        C16GX c16gxAS2 = aS();
        if (!z) {
            i = 8;
        }
        C786410Ut5.LLZZZZ(c16gxAS2, i);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onBlockUserEvent(C888460YtI c888460YtI) {
        String uid;
        User user = c888460YtI.LIZ;
        if (user != null && (uid = user.getUid()) != null) {
            gS().LJJI(uid);
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        MufListPageViewModel mufListPageViewModelRS = rS();
        mufListPageViewModelRS.setState(new AwS46S0301000_19(hS(), qS(), mufListPageViewModelRS, this.LLJLLL, 0));
        ((ArrayList) C1263820izc.LIZ).clear();
        NR(AFwS257S0000000_19.get$arr$(265));
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x01a1  */
    /* JADX WARN: Type inference failed for: r0v49, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [T, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.AbstractC1263550izB sS(boolean r13) {
        /*
            Method dump skipped, instruction units count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.relation.fragment.muflist.MufListPageFragment.sS(boolean):X.0izB");
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        super.onViewCreated(view, bundle);
        iS().LIZJ(gS());
        MufListPageViewModel mufListPageViewModelRS = rS();
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("enter_from")) == null) {
            string = "personal_homepage";
        }
        mufListPageViewModelRS.LL = string;
        InterfaceC1264300j0O interfaceC1264300j0OZQ2 = rS().zQ2();
        if (interfaceC1264300j0OZQ2 != null) {
            interfaceC1264300j0OZQ2.dt1(iS());
        }
        if (uS()) {
            if (!UR()) {
                AbstractC1263550izB abstractC1263550izBSS = sS(false);
                this.LLJJJ = abstractC1263550izBSS;
                ((C1262970iyF) abstractC1263550izBSS).LJI(null);
                AbstractC1263550izB abstractC1263550izB = this.LLJJJ;
                if (abstractC1263550izB == null) {
                    abstractC1263550izB = null;
                }
                ((C1262970iyF) abstractC1263550izB).Eg(new InterfaceC1261750iwH() { // from class: X.0izI
                    @Override // X.InterfaceC1261750iwH
                    public final void Kk0(AbstractC1261460ivo<?> abstractC1261460ivo) {
                    }

                    @Override // X.InterfaceC1261750iwH
                    public final void LLF(RecyclerView recyclerView, int i) {
                    }

                    @Override // X.InterfaceC1261750iwH
                    public final void nO0(C1075800e6M c1075800e6M) {
                        this.LL.rS().setState(new AwS598S0100000_19(c1075800e6M, 229));
                    }
                });
            } else if (C1263590izF.LIZJ()) {
                AbstractC1263550izB abstractC1263550izBSS2 = sS(true);
                this.LLJJJ = abstractC1263550izBSS2;
                ((C1262970iyF) abstractC1263550izBSS2).LJI(null);
                AbstractC1263550izB abstractC1263550izB2 = this.LLJJJ;
                if (abstractC1263550izB2 == null) {
                    abstractC1263550izB2 = null;
                }
                ((C1262970iyF) abstractC1263550izB2).Eg(new InterfaceC1261750iwH() { // from class: X.0izJ
                    @Override // X.InterfaceC1261750iwH
                    public final void Kk0(AbstractC1261460ivo<?> abstractC1261460ivo) {
                    }

                    @Override // X.InterfaceC1261750iwH
                    public final void LLF(RecyclerView recyclerView, int i) {
                    }

                    @Override // X.InterfaceC1261750iwH
                    public final void nO0(C1075800e6M c1075800e6M) {
                        this.LL.rS().setState(new AwS598S0100000_19(c1075800e6M, 229));
                    }
                });
            }
        } else {
            rS().setState(new AwS598S0100000_19(new C1075800e6M(new C1623606Xi(C13BV.INSTANCE), 3), 229));
        }
        if (C0BKW.LIZ()) {
            mS().LJIILJJIL(MufUserCell.class);
        } else {
            mS().LJIILJJIL(MufSearchCell.class);
        }
        mS().setItemAnimator(null);
        C736680Sv4.LJIIIZ(this, rS(), new C2217381BqS() { // from class: X.0iza
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1263670izN) obj).LLILZLL;
            }
        }, new C2217381BqS() { // from class: X.0izb
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1263670izN) obj).LLIZ;
            }
        }, C736820SvI.LJ(), new AwS668S0100000_19(this, 46), 8);
        getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.relation.fragment.muflist.MufListPageFragment$initSearchModule$4
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_RESUME) {
                    LifecycleOwner viewLifecycleOwner = this.LL.getViewLifecycleOwner();
                    View view2 = this.LL.getView();
                    final MufListPageFragment mufListPageFragment = this.LL;
                    KeyboardUtils.LIZ(viewLifecycleOwner, view2, new InterfaceC1242460iRA() { // from class: X.0izM
                        @Override // X.InterfaceC1242460iRA
                        public final void onHide() {
                            mufListPageFragment.kS().getEditTextView().setCursorVisible(false);
                            mufListPageFragment.kS().getEditTextView().clearFocus();
                        }

                        @Override // X.InterfaceC1242460iRA
                        public final void onShow() {
                            mufListPageFragment.kS().getEditTextView().setCursorVisible(true);
                        }
                    });
                }
            }
        });
        MufListPageViewModel mufListPageViewModelRS2 = rS();
        AssemViewModel.selectSubscribe$default(mufListPageViewModelRS2, new C2217381BqS() { // from class: X.0izX
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1263670izN) obj).LLILZ;
            }
        }, C736820SvI.LJ(), null, null, new AwS598S0100000_19(mufListPageViewModelRS2, 226), 12, null);
        AssemViewModel.selectSubscribe$default(mufListPageViewModelRS2, new C2217381BqS() { // from class: X.0izV
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1263670izN) obj).LLIZLLLIL;
            }
        }, C736820SvI.LJ(), null, null, new AwS598S0100000_19(mufListPageViewModelRS2, 227), 12, null);
        AssemViewModel.selectSubscribe$default(mufListPageViewModelRS2, new C2217381BqS() { // from class: X.0hwO
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1263670izN) obj).LLILZIL;
            }
        }, C736820SvI.LJ(), null, null, new AwS598S0100000_19(mufListPageViewModelRS2, 228), 12, null);
        C897520ZIw c897520ZIw = rS().LLILLL;
        if (c897520ZIw != null) {
            c897520ZIw.LJ();
        }
        C736680Sv4.LJIIIIZZ(this, rS(), new C2217381BqS() { // from class: X.0izW
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1263670izN) obj).LLILZ;
            }
        }, C736820SvI.LJ(), new AwS633S0100000_19(this, 75), 4);
        C736680Sv4.LJIIIIZZ(this, rS(), new C2217381BqS() { // from class: X.0izU
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1263670izN) obj).LLJ;
            }
        }, C736820SvI.LJ(), new AwS633S0100000_19(this, 76), 4);
        if (uS() && (!UR() || C1263590izF.LIZJ())) {
            C736680Sv4.LJIIIIZZ(this, rS(), new C2217381BqS() { // from class: X.0izY
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1263670izN) obj).LLILLL;
                }
            }, C736820SvI.LJ(), new AwS633S0100000_19(this, 77), 4);
        }
        C1076010e6h c1076010e6h = C1076010e6h.LIZJ;
        c1076010e6h.LIZIZ().LIZJ().observe(this, new AObserverS223S0100000_19(this, 66));
        c1076010e6h.LIZIZ().getRelationObservable().observe(this, new AObserverS223S0100000_19(this, 33));
        if (C1253000iiA.LIZ()) {
            c1076010e6h.LIZIZ().LIZ().subscribe(this, new AObserverS223S0100000_19(this, 67));
        }
        if (Intrinsics.LJFF(this.LLJJIJI.getValue(), "new_followers_page")) {
            C0VWN.LIZ("inbox_follower_page_friends_list", false).LIZIZ(iS());
        }
        EventBus.LIZLLL().LJIJJ(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.c_g, viewGroup, false);
        C19GS c19gs = null;
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o> C0ZP4 subscribe(AssemViewModel<S> assemViewModel, C1770850wBP<S> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super S, Unit> function2) {
        return C736680Sv4.LJIILLIIL(this, assemViewModel, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJ(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJIILJJIL(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1770850wBP<C19474211Gy<A, B>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631620sYq<? super C03H5, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C736680Sv4.LIZLLL(assemViewModel, this, c1770850wBP, function1, interfaceC1631620sYq, interfaceC2217241BqE, interfaceC2217241BqE2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1770850wBP<C11H7<A, B, C>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631630sYr<? super C03H5, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C736680Sv4.LJFF(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1770850wBP, function1, interfaceC1631630sYr);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1770850wBP<C11H6<A, B, C, D>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685420txc<? super C03H5, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C736680Sv4.LJI(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1770850wBP, function1, interfaceC1685420txc);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D, E> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, InterfaceC2217241BqE<S, ? extends E> interfaceC2217241BqE5, C1770850wBP<C11H2<A, B, C, D, E>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685430txd<? super C03H5, ? super A, ? super B, ? super C, ? super D, ? super E, Unit> interfaceC1685430txd) {
        return C736680Sv4.LJII(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, interfaceC2217241BqE5, c1770850wBP, function1, interfaceC1685430txd);
    }
}
