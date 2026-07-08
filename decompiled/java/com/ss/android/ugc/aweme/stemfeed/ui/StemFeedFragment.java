package com.ss.android.ugc.aweme.stemfeed.ui;

import X.C03H5;
import X.C098200Yq;
import X.C0OCC;
import X.C0QSJ;
import X.C0SU6;
import X.C0SZ8;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1209450hZv;
import X.C1361830lXh;
import X.C1376270luz;
import X.C1440005kM;
import X.C1492500owS;
import X.C1492540owW;
import X.C14EU;
import X.C1514430pVp;
import X.C1554610qYd;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1564710qov;
import X.C1568310quj;
import X.C1576740r8K;
import X.C1577880rAA;
import X.C1588880rRu;
import X.C1590830rV3;
import X.C1620930sHb;
import X.C1685300txQ;
import X.C1697810uHb;
import X.C1770850wBP;
import X.C189200o6;
import X.C19474211Gy;
import X.C19EG;
import X.C19GS;
import X.C20673215v0;
import X.C20684815ws;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2189821An6;
import X.C2344009Gk;
import X.C446900Hfk;
import X.C616540OGe;
import X.C673150Qan;
import X.C680080Qly;
import X.C687700QyG;
import X.C688120Qyw;
import X.C690440R6k;
import X.C723850SaN;
import X.C736680Sv4;
import X.C818480W8w;
import X.EnumC1584370rKd;
import X.EnumC1588660rRY;
import X.InterfaceC0148002o;
import X.InterfaceC1055110dYz;
import X.InterfaceC1146704e9;
import X.InterfaceC1209460hZw;
import X.InterfaceC1577940rAG;
import X.InterfaceC1581960rGk;
import X.InterfaceC1591870rWj;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC20660615sy;
import X.InterfaceC2217241BqE;
import X.InterfaceC665370Q7z;
import X.InterfaceC687730QyJ;
import X.InterfaceC689860R4e;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import X.InterfaceC988100bou;
import Y.AObserverS226S0100000_24;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.hox.Hox;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.bytedance.router.SmartRouter;
import com.bytedance.tiktok.homepage.mainfragment.InterceptHomeViewPagerProtocol;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.netdetector.fetchfeed.NoNetDetectHelper;
import com.ss.android.ugc.aweme.feed.ui.BaseFeedListFragment;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IMainSAFLifecycleKt;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.aweme.stemfeed.panel.StemFeedFragmentPanel;
import com.ss.android.ugc.aweme.stemfeed.scope.StemFeedFragmentScope;
import com.ss.android.ugc.aweme.stemfeed.ui.IStemContentAssemAbility;
import com.ss.android.ugc.aweme.stemfeed.ui.IStemToFYPAssemAbility;
import com.ss.android.ugc.aweme.stemfeed.utils.StemScrollProfileStrategy;
import com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility;
import com.ss.android.ugc.feed.platform.panel.loadmorepanel.LoadMorePanelComponentTempHelper;
import com.zhiliaoapp.musically.R;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes25.dex */
public final class StemFeedFragment extends BaseFeedListFragment implements InterfaceC1055110dYz, InterfaceC988100bou, InterfaceC724530SbT, InterfaceC1591870rWj, InterfaceC1577940rAG, InterfaceC20660615sy, StemFeedPopupObserver, C0QSJ, InterfaceC1146704e9 {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjY4HELIOSLCI1LSAoZzo6ZhY4LCIVLSAoDz0yLygpJzs=";
    public StemFeedFragmentPanel LLIZ;
    public InterfaceC1209460hZw LLIZLLLIL;
    public boolean LLJI;
    public boolean LLJIJIL;
    public boolean LLJILJIL;
    public boolean LLJ = true;
    public long LLJILJILJ = -1;
    public final String LLJILLL = "stem_feed";

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment
    public final String MR() {
        return "a2270.b4290";
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{StemFeedFragmentScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        return null;
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

    @Override // X.InterfaceC1583780rJg
    public final String getHoxNodeTag() {
        return "";
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(StemFeedFragmentScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(StemFeedFragmentScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.InterfaceC20660615sy
    public final boolean t2() {
        return true;
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.InterfaceC1591870rWj
    public final String wm() {
        return "StemFeedFragment";
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment
    public final void SR() {
        long j = this.LL;
        if (j != -1) {
            this.LLJILJILJ = j;
        }
        super.SR();
    }

    public final StemFeedFragmentPanel ZR() {
        StemFeedFragmentPanel stemFeedFragmentPanel = this.LLIZ;
        if (stemFeedFragmentPanel != null) {
            return stemFeedFragmentPanel;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.stemfeed.ui.StemFeedPopupObserver
    public final void j81() {
        if (this.LLJIJIL && this.LLJILJIL) {
            WR();
            this.LLJILJIL = false;
        }
    }

    @Override // com.ss.android.ugc.aweme.stemfeed.ui.StemFeedPopupObserver
    public final void nF2() {
        if (this.LLJIJIL && this.LLJILJIL) {
            WR();
            this.LLJILJIL = false;
        }
    }

    @Override // X.InterfaceC988100bou
    public final boolean Ci() {
        return ZR().LLJJ();
    }

    public final void WR() {
        String string = getString(2131835026);
        String string2 = getString(2131837117);
        try {
            String strEncode = URLEncoder.encode("", "UTF-8");
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("//pns/in_app_push/avatar_circled?enter_from=reward_flow&icon_name=");
            sbLIZ.append("icon_bitmap_wellbeing_mission_rocket");
            sbLIZ.append("&content=");
            sbLIZ.append(string);
            sbLIZ.append("&right_button_text=");
            sbLIZ.append(string2);
            sbLIZ.append("&action_url=");
            sbLIZ.append(strEncode);
            SmartRouter.buildRoute(this, C2188811AlT.LIZIZ(sbLIZ)).open();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("challenge_name", "explore_stem");
            C20684815ws.LJIILLIIL("wellbeing_challenge_badge_banner_show", c2344009Gk.LIZ);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // X.InterfaceC20658015sY
    public final boolean Xu() {
        return getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.CREATED) && Hox.LLJILJIL.LIZ(requireActivity()).KQ2("Stem");
    }

    @Override // X.InterfaceC20658015sY
    public final C688120Qyw i2() {
        return new C688120Qyw(requireContext(), IMainSAFLifecycleKt.getEnablePopUpLifecycleRefactor() ? this : requireActivity(), null);
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.BaseFeedListFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() throws IllegalAccessException {
        super.onDestroy();
        EventBus.LIZLLL().LJJI(this);
        C1558520qew.LJIIJ(this, StemFeedFragmentScope.class, StemFeedPopupObserver.class, null);
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.BaseFeedListFragment, com.ss.android.ugc.aweme.feed.ui.FeedFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ZR().onDestroyView();
        InterfaceC1209460hZw interfaceC1209460hZw = this.LLIZLLLIL;
        if (interfaceC1209460hZw != null) {
            ((C1492540owW) interfaceC1209460hZw).LIZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        Window window;
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(StemFeedFragment.class.getName());
        }
        super.onResume();
        if (getUserVisibleHint() && isResumed()) {
            C1514430pVp.LJFF(EnumC1584370rKd.STEM);
        }
        C19EG activity = getActivity();
        if (activity == null || (window = activity.getWindow()) == null) {
            return;
        }
        window.setBackgroundDrawable(new ColorDrawable(-16777216));
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment
    public final SparseArray<InterfaceC1581960rGk> registerComponents() {
        SparseArray<InterfaceC1581960rGk> sparseArrayRegisterComponents = super.registerComponents();
        this.LLILLJJLI = "homepage_topic_stem";
        this.LLIZ = new StemFeedFragmentPanel(this.LLILLJJLI);
        sparseArrayRegisterComponents.append(C0SU6.LIZJ, ZR());
        return sparseArrayRegisterComponents;
    }

    @Override // X.InterfaceC20658015sY
    public final String getSceneId() {
        return this.LLJILLL;
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment
    public final void NR(boolean z) {
        InterfaceC689860R4e interfaceC689860R4eK9;
        SR();
        C1440005kM.LIZ(new C1568310quj(2, ZR().LJIIIIZZ(), ZR()));
        ZR().h(z);
        C0SZ8 c0sz8K4 = k4();
        if (c0sz8K4 != null && (interfaceC689860R4eK9 = c0sz8K4.K9()) != null) {
            interfaceC689860R4eK9.LLILLJJLI(z);
        }
        NoNetDetectHelper.LJIILLIIL.set(false);
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.BaseFeedListFragment, com.ss.android.ugc.aweme.feed.ui.FeedFragment
    public final boolean Oi(boolean z) {
        IStemContentAssemAbility iStemContentAssemAbility = (IStemContentAssemAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this, null), IStemContentAssemAbility.class, null);
        if (iStemContentAssemAbility != null) {
            iStemContentAssemAbility.iu();
            return true;
        }
        return false;
    }

    public final void S1(boolean z) {
        InterfaceC689860R4e interfaceC689860R4eK9;
        Window window;
        if (getUserVisibleHint() && isViewValid()) {
            NoNetDetectHelper.LJIILLIIL.set(true);
            RR();
            C1440005kM.LIZ(new C1568310quj(1, ZR().LJIIIIZZ(), ZR()));
            if (z) {
                ZR().tryResumePlay();
            } else {
                ZR().g();
            }
            Db(false);
            C19EG activity = getActivity();
            if (activity != null && (window = activity.getWindow()) != null) {
                window.setBackgroundDrawable(new ColorDrawable(-16777216));
            }
            C0SZ8 c0sz8K4 = k4();
            if (c0sz8K4 != null && (interfaceC689860R4eK9 = c0sz8K4.K9()) != null) {
                interfaceC689860R4eK9.LLJL(z);
                interfaceC689860R4eK9.LLFII(false);
            }
            C1376270luz c1376270luz = C1376270luz.LIZ;
            Aweme awemeLJIIIIZZ = ZR().LJIIIIZZ();
            c1376270luz.getClass();
            C1376270luz.LJFF = awemeLJIIIIZZ;
            IStemToFYPAssemAbility iStemToFYPAssemAbility = (IStemToFYPAssemAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this, null), IStemToFYPAssemAbility.class, null);
            if (iStemToFYPAssemAbility != null && iStemToFYPAssemAbility.LLLLII()) {
                C1440005kM.LIZ(new C1568310quj(2, ZR().LJIIIIZZ(), ZR(), Boolean.FALSE));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.BaseFeedListFragment, com.ss.android.ugc.aweme.feed.ui.FeedFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C1558520qew.LJI(this, StemFeedFragmentScope.class, this, StemFeedPopupObserver.class, null, null);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onEvent(C1588880rRu c1588880rRu) {
        if (!c1588880rRu.LIZIZ.contains(EnumC1588660rRY.STEM)) {
            return;
        }
        Oi(false);
    }

    @Override // X.InterfaceC1055110dYz
    public final void onNodeHide(Bundle bundle) {
        C1564710qov.LIZ(this, bundle, "Stem", new AwS603S0100000_24(this, 291));
        Aweme aweme = C680080Qly.LIZIZ(requireActivity()).LLJILJILJ;
        C1577880rAA.LIZ.getClass();
        String str = C1577880rAA.LIZIZ;
        C1577880rAA.LIZIZ = "click_tab";
        String aid = "";
        String string = bundle.getString("fromStart", "");
        C446900Hfk c446900Hfk = Hox.LLJILJIL;
        String strHQ2 = c446900Hfk.LIZ(requireActivity()).HQ2("Stem");
        String strHQ22 = c446900Hfk.LIZ(requireActivity()).HQ2(strHQ2);
        String strHQ23 = c446900Hfk.LIZ(requireActivity()).HQ2(strHQ22);
        boolean z = true;
        if (!Intrinsics.LJFF(string, "MainFragment") && !bundle.getBoolean(strHQ2)) {
            if (!Intrinsics.LJFF(string, "MainPage") && !bundle.getBoolean(strHQ22)) {
                if (Intrinsics.LJFF(string, "RootNode") || bundle.getBoolean(strHQ23)) {
                    C0SZ8 c0sz8K4 = k4();
                    if (c0sz8K4 != null) {
                        c0sz8K4.LJLIIIL(1);
                    }
                    if (aweme != null) {
                        C1361830lXh.LIZ.LIZ(aweme.getAid());
                    }
                }
            } else {
                NR(true);
            }
        } else {
            ZR().setUserVisibleHint(false);
            NR(false);
        }
        String str2 = this.LLILLJJLI;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str2);
        if (aweme == null || aweme.getAwemeType() != 328) {
            z = false;
        }
        String authorUid = null;
        if (!z) {
            if (aweme != null) {
                aid = aweme.getAid();
            } else {
                aid = null;
            }
        }
        c2344009Gk.LJIIIIZZ("group_id", aid);
        if (aweme != null) {
            authorUid = AwemeExtKt.getAuthorUid(aweme);
        }
        c2344009Gk.LJIIIIZZ("author_id", authorUid);
        c2344009Gk.LJIIIIZZ("exit_method", str);
        C20684815ws.LJIILLIIL("exit_topic_tab", c2344009Gk.LIZ);
        if (this.LLJIJIL) {
            long j = this.LLJILJILJ;
            if (j >= 0) {
                C2344009Gk c2344009Gk2 = new C2344009Gk();
                c2344009Gk2.LJIIIIZZ("feature", "stem_feed");
                c2344009Gk2.LIZLLL(System.currentTimeMillis() - j, "duration");
                C20684815ws.LJIILLIIL("wellbeing_duration", c2344009Gk2.LIZ);
            }
            this.LLJIJIL = false;
        }
    }

    @Override // X.InterfaceC1055110dYz
    public final void onNodeShow(Bundle bundle) {
        AbsFragment absFragment;
        AbsFragment absFragment2;
        AbsFragment absFragment3;
        IStemEmptyAssemAbility iStemEmptyAssemAbility;
        boolean z;
        C1564710qov.LIZ(this, bundle, "Stem", new AwS603S0100000_24(this, 292));
        String string = bundle.getString("fromStart", "");
        C446900Hfk c446900Hfk = Hox.LLJILJIL;
        String strHQ2 = c446900Hfk.LIZ(requireActivity()).HQ2("Stem");
        String strHQ22 = c446900Hfk.LIZ(requireActivity()).HQ2(strHQ2);
        String strHQ23 = c446900Hfk.LIZ(requireActivity()).HQ2(strHQ22);
        C1576740r8K c1576740r8KLIZ = C690440R6k.LIZ();
        if (c1576740r8KLIZ != null) {
            IStemToFYPAssemAbility iStemToFYPAssemAbility = (IStemToFYPAssemAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this, null), IStemToFYPAssemAbility.class, null);
            if ((iStemToFYPAssemAbility != null && iStemToFYPAssemAbility.LLLLII()) || ((iStemEmptyAssemAbility = (IStemEmptyAssemAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this, null), IStemEmptyAssemAbility.class, null)) != null && iStemEmptyAssemAbility.Rr())) {
                z = true;
            } else {
                z = false;
            }
            c1576740r8KLIZ.LJIIIIZZ(z);
        }
        if (!Intrinsics.LJFF(string, "MainFragment") && !bundle.getBoolean(strHQ2)) {
            if (!Intrinsics.LJFF(string, "MainPage") && !bundle.getBoolean(strHQ22)) {
                if (Intrinsics.LJFF(string, "RootNode") || bundle.getBoolean(strHQ23)) {
                    ZR().setUserVisibleHint(true);
                    if (isResumed() && (absFragment3 = this.LLILZ) != null && !absFragment3.isHidden()) {
                        C1514430pVp.LJFF(EnumC1584370rKd.STEM);
                        C1590830rV3 c1590830rV3 = new C1590830rV3();
                        c1590830rV3.LJIILLIIL = this.LLILLJJLI;
                        c1590830rV3.LJIILJJIL();
                    }
                    C0SZ8 c0sz8K4 = k4();
                    if (c0sz8K4 != null) {
                        c0sz8K4.LLLI(1);
                    }
                    S1(true);
                    return;
                }
                return;
            }
            ZR().setUserVisibleHint(true);
            if (isResumed() && (absFragment2 = this.LLILZ) != null && !absFragment2.isHidden()) {
                C1514430pVp.LJFF(EnumC1584370rKd.STEM);
                C1590830rV3 c1590830rV32 = new C1590830rV3();
                c1590830rV32.LJIILLIIL = this.LLILLJJLI;
                c1590830rV32.LJIILJJIL();
            }
            S1(true);
            return;
        }
        ZR().setUserVisibleHint(true);
        if (isResumed() && (absFragment = this.LLILZ) != null && !absFragment.isHidden()) {
            C1514430pVp.LJFF(EnumC1584370rKd.STEM);
            C1590830rV3 c1590830rV33 = new C1590830rV3();
            c1590830rV33.LJIILLIIL = this.LLILLJJLI;
            c1590830rV33.LJIILJJIL();
        }
        S1(false);
        IStemPopupAssemAbility iStemPopupAssemAbility = (IStemPopupAssemAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this, null), IStemPopupAssemAbility.class, null);
        if (iStemPopupAssemAbility != null) {
            iStemPopupAssemAbility.kW1(ZR().LJIIIIZZ());
        } else {
            this.LLJI = true;
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.BaseFeedListFragment, com.ss.android.ugc.aweme.feed.ui.FeedFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String stringExtra;
        boolean z;
        Intent intent;
        Intent intent2;
        C19EG activity;
        super.onViewCreated(view, bundle);
        C2189821An6 c2189821An6 = new C2189821An6();
        c2189821An6.setEventType("homepage_topic_stem");
        c2189821An6.setPageType(36);
        StemFeedFragmentPanel stemFeedFragmentPanelZR = ZR();
        stemFeedFragmentPanelZR.LLLL(c2189821An6);
        stemFeedFragmentPanelZR.LLLII = VR();
        stemFeedFragmentPanelZR.LLLIIII = VR();
        if (this.LLIZLLLIL == null && C1492500owS.LIZ() && (activity = getActivity()) != null) {
            this.LLIZLLLIL = C1209450hZv.LIZIZ(activity);
        }
        NoNetDetectHelper.LJIILLIIL.set(true);
        Db(false);
        C19EG activity2 = getActivity();
        if (activity2 != null && (intent2 = activity2.getIntent()) != null) {
            try {
                stringExtra = intent2.getStringExtra("enterFrom");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                stringExtra = null;
            }
        } else {
            stringExtra = null;
        }
        this.LLJIJIL = Intrinsics.LJFF(stringExtra, "reward_flow");
        C19EG activity3 = getActivity();
        if (activity3 != null && (intent = activity3.getIntent()) != null && intent.getBooleanExtra("showBadge", false)) {
            z = true;
        } else {
            z = false;
        }
        this.LLJILJIL = z;
        ZR().onViewCreated(getView(), bundle);
        ZR().Xl1(VR());
        ZR().LLJJI(new C1620930sHb(this, 15));
        C723850SaN.LIZ(this, false, null, new AwS603S0100000_24(this, 293), 3);
        final InterfaceC665370Q7z interfaceC665370Q7zLJFF = C1558360qeg.LJFF(this, null);
        Aweme aweme = C680080Qly.LIZIZ(requireActivity()).LLJILJILJ;
        final StemScrollProfileStrategy stemScrollProfileStrategy = new StemScrollProfileStrategy(requireActivity());
        C1554610qYd.LIZJ(interfaceC665370Q7zLJFF, InterceptHomeViewPagerProtocol.class, C1697810uHb.LJIILJJIL(stemScrollProfileStrategy));
        Lifecycle lifecycle = getLifecycle();
        if (lifecycle != null) {
            lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.stemfeed.ui.StemFeedFragment$onViewCreated$lambda$0$$inlined$registerProtocol$1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        C1554610qYd.LIZLLL(interfaceC665370Q7zLJFF, InterceptHomeViewPagerProtocol.class, stemScrollProfileStrategy);
                    }
                }
            });
        }
        if (this.LLJI) {
            IStemPopupAssemAbility iStemPopupAssemAbility = (IStemPopupAssemAbility) C1558520qew.LIZ(interfaceC665370Q7zLJFF, IStemPopupAssemAbility.class, null);
            if (iStemPopupAssemAbility != null) {
                iStemPopupAssemAbility.kW1(aweme);
            }
            this.LLJI = false;
        }
        ILoadMoreAbility iLoadMoreAbilityEw0 = Ew0();
        if (iLoadMoreAbilityEw0 != null) {
            ((LoadMorePanelComponentTempHelper) iLoadMoreAbilityEw0).p41(new C0OCC() { // from class: X.0qnz
                @Override // X.C0OCC, X.InterfaceC1603270rp7
                public final void onHide() {
                    IStemContentAssemAbility iStemContentAssemAbility;
                    IStemToFYPAssemAbility iStemToFYPAssemAbility;
                    IStemContentAssemAbility iStemContentAssemAbility2 = (IStemContentAssemAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this.LL, null), IStemContentAssemAbility.class, null);
                    if (iStemContentAssemAbility2 == null || iStemContentAssemAbility2.g8() || (iStemContentAssemAbility = (IStemContentAssemAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this.LL, null), IStemContentAssemAbility.class, null)) == null || iStemContentAssemAbility.G6() || (iStemToFYPAssemAbility = (IStemToFYPAssemAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this.LL, null), IStemToFYPAssemAbility.class, null)) == null) {
                        return;
                    }
                    iStemToFYPAssemAbility.pb();
                }
            });
        }
        if (ComplianceServiceProvider.LJI().LJIIJ(false)) {
            ComplianceServiceProvider.LJI().LJJIII().observe(this, new AObserverS226S0100000_24(this, 9));
        }
        EventBus.LIZLLL().LJIJJ(this);
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.BaseFeedListFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C818480W8w.LIZ("homepage_topic_stem");
        View viewLIZJ = C20673215v0.LIZJ(R.layout.fab, getActivity());
        C19GS c19gs = null;
        if (!(viewLIZJ instanceof View)) {
            viewLIZJ = null;
        }
        if (viewLIZJ != null) {
            try {
                ViewTreeLifecycleOwner.set(viewLIZJ, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewLIZJ, this);
                viewLIZJ.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewLIZJ;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewLIZJ;
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
