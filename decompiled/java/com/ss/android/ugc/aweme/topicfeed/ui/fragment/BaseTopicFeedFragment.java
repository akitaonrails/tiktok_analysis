package com.ss.android.ugc.aweme.topicfeed.ui.fragment;

import X.C019F;
import X.C01D1;
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
import X.C13LE;
import X.C1440005kM;
import X.C1492500owS;
import X.C1492540owW;
import X.C1514430pVp;
import X.C1554610qYd;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1564710qov;
import X.C1568310quj;
import X.C1576740r8K;
import X.C1577890rAB;
import X.C1577920rAE;
import X.C1590830rV3;
import X.C1591530rWB;
import X.C1620930sHb;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C1697810uHb;
import X.C1770850wBP;
import X.C189200o6;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C20673215v0;
import X.C20684815ws;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2189821An6;
import X.C2217381BqS;
import X.C2344009Gk;
import X.C338490DOt;
import X.C446900Hfk;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C616540OGe;
import X.C673150Qan;
import X.C680080Qly;
import X.C687700QyG;
import X.C688120Qyw;
import X.C690440R6k;
import X.C723850SaN;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C818480W8w;
import X.C987103tV;
import X.EnumC1584370rKd;
import X.InterfaceC0148002o;
import X.InterfaceC1055110dYz;
import X.InterfaceC1146704e9;
import X.InterfaceC1209460hZw;
import X.InterfaceC1577930rAF;
import X.InterfaceC1581960rGk;
import X.InterfaceC1591870rWj;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC20660615sy;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC665370Q7z;
import X.InterfaceC687730QyJ;
import X.InterfaceC689860R4e;
import X.InterfaceC724530SbT;
import X.InterfaceC724760Sbq;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import X.InterfaceC988100bou;
import android.app.Activity;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.hox.Hox;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.bytedance.tiktok.homepage.mainfragment.InterceptHomeViewPagerProtocol;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.netdetector.fetchfeed.NoNetDetectHelper;
import com.ss.android.ugc.aweme.feed.ui.BaseFeedListFragment;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.services.IMainSAFLifecycleKt;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.aweme.topicfeed.panel.TopicFeedFragmentPanel;
import com.ss.android.ugc.aweme.topicfeed.scope.TopicFeedFragmentScope;
import com.ss.android.ugc.aweme.topicfeed.ui.ITopicContentAssemAbility;
import com.ss.android.ugc.aweme.topicfeed.ui.ITopicEmptyAssemAbility;
import com.ss.android.ugc.aweme.topicfeed.ui.ITopicToFYPAssemAbility;
import com.ss.android.ugc.aweme.topicfeed.utils.TopicFeedScrollProfileStrategy;
import com.ss.android.ugc.aweme.topicfeed.vm.TopicFeedListViewModel;
import com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility;
import com.ss.android.ugc.feed.platform.panel.loadmorepanel.LoadMorePanelComponentTempHelper;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public class BaseTopicFeedFragment extends BaseFeedListFragment implements InterfaceC1055110dYz, InterfaceC988100bou, InterfaceC724530SbT, InterfaceC1591870rWj, InterfaceC1577930rAF, InterfaceC20660615sy, C0QSJ, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILLL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjEjOSYwLiApLWHELIOSEmIWsqOy40JSAiPWERKTYpHSAjISYKLCo3DjctLiI2JjE=";
    public final AssemVMLazy LLIZ;
    public TopicFeedFragmentPanel LLIZLLLIL;
    public InterfaceC1209460hZw LLJ;
    public int LLJI;
    public int LLJIJIL;
    public String LLJILJIL;
    public String LLJILJILJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BaseTopicFeedFragment.class, "contentVM", "getContentVM()Lcom/ss/android/ugc/aweme/topicfeed/vm/TopicFeedListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJILLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.C0QSJ
    public void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{TopicFeedFragmentScope.class});
    }

    @Override // X.C0QSJ
    public Object getAbility(Class cls) {
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

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC1146704e9
    public List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(TopicFeedFragmentScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.InterfaceC20658015sY
    public final String getSceneId() {
        return "topic_feed";
    }

    @Override // X.C0QSJ
    public List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(TopicFeedFragmentScope.class);
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
    public void unbindAbility(Object obj, Class cls) {
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    public BaseTopicFeedFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(TopicFeedListViewModel.class);
        AwS568S0100000_24 awS568S0100000_24 = new AwS568S0100000_24(c19719912DlLIZ, 1393);
        AFwS264S0000000_24 aFwS264S0000000_24 = AFwS264S0000000_24.get$arr$(479);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS568S0100000_24, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS568S0100000_24((HasDefaultViewModelProviderFactory) this, 1394), aFwS264S0000000_24, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS568S0100000_24, new AwS568S0100000_24((Fragment) this, 1395), aFwS264S0000000_24, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS568S0100000_24, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS568S0100000_24((HasDefaultViewModelProviderFactory) this, 1396), aFwS264S0000000_24, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLIZ = assemVMLazy;
        this.LLJILJIL = "tiktok/feed/topic/v2";
        this.LLJILJILJ = "";
    }

    public final TopicFeedListViewModel WR() {
        AssemVMLazy assemVMLazy = this.LLIZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILLL;
        return (TopicFeedListViewModel) assemVMLazy.getValue();
    }

    public final EnumC1584370rKd ZR() {
        int i = this.LLILLL;
        if (i != 1000) {
            if (i != 1001) {
                switch (i) {
                    case BaseNotice.RECOMMEND_LIVE /* 50 */:
                        break;
                    case 51:
                        break;
                    case 52:
                        return EnumC1584370rKd.TOPIC2;
                    case 53:
                        return EnumC1584370rKd.TOPIC3;
                    default:
                        return EnumC1584370rKd.NONE;
                }
            }
            return EnumC1584370rKd.TOPIC1;
        }
        return EnumC1584370rKd.TOPIC0;
    }

    public final TopicFeedFragmentPanel aS() {
        TopicFeedFragmentPanel topicFeedFragmentPanel = this.LLIZLLLIL;
        if (topicFeedFragmentPanel != null) {
            return topicFeedFragmentPanel;
        }
        return null;
    }

    @Override // X.InterfaceC988100bou
    public final boolean Ci() {
        return aS().LLJJ();
    }

    @Override // X.InterfaceC20658015sY
    public final boolean Xu() {
        return getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.CREATED) && Hox.LLJILJIL.LIZ(requireActivity()).KQ2(C1591530rWB.LIZIZ.P7(this.LLILLL));
    }

    @Override // X.InterfaceC1583780rJg
    public final String getHoxNodeTag() {
        String string;
        Bundle arguments = getArguments();
        return (arguments == null || (string = arguments.getString("EXTRA_TOPIC_TAB_HOX_TAG")) == null) ? "" : string;
    }

    @Override // X.InterfaceC20658015sY
    public final C688120Qyw i2() {
        return new C688120Qyw(requireContext(), IMainSAFLifecycleKt.getEnablePopUpLifecycleRefactor() ? this : requireActivity(), null);
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.BaseFeedListFragment, com.ss.android.ugc.aweme.feed.ui.FeedFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        aS().onDestroyView();
        InterfaceC1209460hZw interfaceC1209460hZw = this.LLJ;
        if (interfaceC1209460hZw != null) {
            ((C1492540owW) interfaceC1209460hZw).LIZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        Window window;
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(getClass().getName());
        }
        super.onResume();
        if (getUserVisibleHint() && isResumed()) {
            C1514430pVp.LJFF(ZR());
        }
        C19EG activity = getActivity();
        if (activity == null || (window = activity.getWindow()) == null) {
            return;
        }
        window.setBackgroundDrawableResource(R.drawable.di5);
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment
    public final SparseArray<InterfaceC1581960rGk> registerComponents() {
        String string;
        String string2;
        SparseArray<InterfaceC1581960rGk> sparseArrayRegisterComponents = super.registerComponents();
        Bundle arguments = getArguments();
        this.LLILLL = arguments != null ? arguments.getInt("com.ss.android.ugc.aweme.intent.extra.FEED_TYPE", 0) : 0;
        Bundle arguments2 = getArguments();
        this.LLILLJJLI = arguments2 != null ? arguments2.getString("com.ss.android.ugc.aweme.intent.extra.EVENT_TYPE", "homepage_hot") : null;
        Bundle arguments3 = getArguments();
        this.LLJIJIL = arguments3 != null ? arguments3.getInt("EXTRA_TOPIC_FEED_ID", 0) : 0;
        Bundle arguments4 = getArguments();
        String str = "tiktok/feed/topic/v2";
        if (arguments4 != null && (string2 = arguments4.getString("EXTRA_TOPIC_DATA_STREAM", "tiktok/feed/topic/v2")) != null) {
            str = string2;
        }
        this.LLJILJIL = str;
        Bundle arguments5 = getArguments();
        if (arguments5 == null || (string = arguments5.getString("EXTRA_TOPIC_WATCHED_ALL_STRING")) == null) {
            string = "";
        }
        this.LLJILJILJ = string;
        Bundle arguments6 = getArguments();
        this.LLJI = arguments6 != null ? arguments6.getInt("EXTRA_TOPIC_TAB_INDEX", 0) : 0;
        this.LLIZLLLIL = new TopicFeedFragmentPanel(this.LLILLJJLI, this.LLILLL, WR());
        sparseArrayRegisterComponents.append(C0SU6.LIZJ, aS());
        return sparseArrayRegisterComponents;
    }

    @Override // X.InterfaceC1591870rWj
    public final String wm() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TopicFeedFragment");
        sbLIZ.append(this.LLJI);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment
    public final void NR(boolean z) {
        InterfaceC689860R4e interfaceC689860R4eK9;
        SR();
        C1440005kM.LIZ(new C1568310quj(2, aS().LJIIIIZZ(), aS()));
        aS().h(z);
        C0SZ8 c0sz8K4 = k4();
        if (c0sz8K4 != null && (interfaceC689860R4eK9 = c0sz8K4.K9()) != null) {
            interfaceC689860R4eK9.LLILLJJLI(z);
        }
        NoNetDetectHelper.LIZIZ(this.LLILLL, Boolean.FALSE);
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.BaseFeedListFragment, com.ss.android.ugc.aweme.feed.ui.FeedFragment
    public final boolean Oi(boolean z) {
        ITopicContentAssemAbility iTopicContentAssemAbility = (ITopicContentAssemAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this, null), ITopicContentAssemAbility.class, null);
        if (iTopicContentAssemAbility != null) {
            iTopicContentAssemAbility.iu();
            return true;
        }
        return false;
    }

    public final void S1(boolean z) {
        InterfaceC689860R4e interfaceC689860R4eK9;
        Window window;
        if (getUserVisibleHint() && isViewValid()) {
            NoNetDetectHelper.LIZIZ(this.LLILLL, Boolean.TRUE);
            RR();
            C1440005kM.LIZ(new C1568310quj(1, aS().LJIIIIZZ(), aS()));
            if (z) {
                aS().tryResumePlay();
            } else {
                aS().g();
            }
            Db(false);
            C19EG activity = getActivity();
            if (activity != null && (window = activity.getWindow()) != null) {
                window.setBackgroundDrawableResource(R.drawable.di5);
            }
            C0SZ8 c0sz8K4 = k4();
            if (c0sz8K4 != null && (interfaceC689860R4eK9 = c0sz8K4.K9()) != null) {
                interfaceC689860R4eK9.LLJL(z);
                interfaceC689860R4eK9.LLFII(false);
            }
            C1376270luz c1376270luz = C1376270luz.LIZ;
            Aweme awemeLJIIIIZZ = aS().LJIIIIZZ();
            c1376270luz.getClass();
            C1376270luz.LJFF = awemeLJIIIIZZ;
            ITopicToFYPAssemAbility iTopicToFYPAssemAbility = (ITopicToFYPAssemAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this, null), ITopicToFYPAssemAbility.class, null);
            if (iTopicToFYPAssemAbility != null && iTopicToFYPAssemAbility.LLLLII()) {
                C1440005kM.LIZ(new C1568310quj(2, aS().LJIIIIZZ(), aS(), Boolean.FALSE));
            }
        }
    }

    @Override // X.InterfaceC1055110dYz
    public final void onNodeHide(Bundle bundle) {
        C1591530rWB c1591530rWB = C1591530rWB.LIZIZ;
        C1564710qov.LIZ(this, bundle, c1591530rWB.P7(this.LLILLL), new AwS603S0100000_24(this, 344));
        String aid = "";
        String string = bundle.getString("fromStart", "");
        String str = C1577890rAB.LIZ;
        C1577890rAB.LIZ = "click_tab";
        C446900Hfk c446900Hfk = Hox.LLJILJIL;
        String strHQ2 = c446900Hfk.LIZ(requireActivity()).HQ2(c1591530rWB.P7(this.LLILLL));
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
                    Aweme aweme = C680080Qly.LIZIZ(requireActivity()).LLJILJILJ;
                    if (aweme != null) {
                        C1361830lXh.LIZ.LIZ(aweme.getAid());
                    }
                }
            } else {
                NR(true);
            }
        } else {
            aS().setUserVisibleHint(false);
            NR(false);
        }
        C1577920rAE c1577920rAE = new Object() { // from class: X.0rAE
        };
        String str2 = this.LLILLJJLI;
        Aweme aweme2 = C680080Qly.LIZIZ(requireActivity()).LLJILJILJ;
        c1577920rAE.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str2);
        if (aweme2 == null || aweme2.getAwemeType() != 328) {
            z = false;
        }
        String authorUid = null;
        if (!z) {
            if (aweme2 != null) {
                aid = aweme2.getAid();
            } else {
                aid = null;
            }
        }
        c2344009Gk.LJIIIIZZ("group_id", aid);
        if (aweme2 != null) {
            authorUid = AwemeExtKt.getAuthorUid(aweme2);
        }
        c2344009Gk.LJIIIIZZ("author_id", authorUid);
        c2344009Gk.LJIIIIZZ("exit_method", str);
        C20684815ws.LJIILLIIL("exit_topic_tab", c2344009Gk.LIZ);
    }

    @Override // X.InterfaceC1055110dYz
    public final void onNodeShow(Bundle bundle) {
        ITopicEmptyAssemAbility iTopicEmptyAssemAbility;
        boolean z;
        AbsFragment absFragment;
        AbsFragment absFragment2;
        AbsFragment absFragment3;
        C1591530rWB c1591530rWB = C1591530rWB.LIZIZ;
        C1564710qov.LIZ(this, bundle, c1591530rWB.P7(this.LLILLL), new AwS603S0100000_24(this, 345));
        String string = bundle.getString("fromStart", "");
        C446900Hfk c446900Hfk = Hox.LLJILJIL;
        String strHQ2 = c446900Hfk.LIZ(requireActivity()).HQ2(c1591530rWB.P7(this.LLILLL));
        String strHQ22 = c446900Hfk.LIZ(requireActivity()).HQ2(strHQ2);
        String strHQ23 = c446900Hfk.LIZ(requireActivity()).HQ2(strHQ22);
        ITopicToFYPAssemAbility iTopicToFYPAssemAbility = (ITopicToFYPAssemAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this, null), ITopicToFYPAssemAbility.class, null);
        if ((iTopicToFYPAssemAbility != null && iTopicToFYPAssemAbility.LLLLII()) || ((iTopicEmptyAssemAbility = (ITopicEmptyAssemAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this, null), ITopicEmptyAssemAbility.class, null)) != null && iTopicEmptyAssemAbility.Rr())) {
            z = true;
        } else {
            z = false;
        }
        C1576740r8K c1576740r8KLIZ = C690440R6k.LIZ();
        if (c1576740r8KLIZ != null) {
            c1576740r8KLIZ.LJIIIZ(this.LLILLL, z);
        }
        if (!Intrinsics.LJFF(string, "MainFragment") && !bundle.getBoolean(strHQ2)) {
            if (!Intrinsics.LJFF(string, "MainPage") && !bundle.getBoolean(strHQ22)) {
                if (Intrinsics.LJFF(string, "RootNode") || bundle.getBoolean(strHQ23)) {
                    aS().setUserVisibleHint(true);
                    if (isResumed() && (absFragment3 = this.LLILZ) != null && !absFragment3.isHidden()) {
                        C1514430pVp.LJFF(ZR());
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
            aS().setUserVisibleHint(true);
            if (isResumed() && (absFragment2 = this.LLILZ) != null && !absFragment2.isHidden()) {
                C1514430pVp.LJFF(ZR());
                C1590830rV3 c1590830rV32 = new C1590830rV3();
                c1590830rV32.LJIILLIIL = this.LLILLJJLI;
                c1590830rV32.LJIILJJIL();
            }
            S1(true);
            return;
        }
        aS().setUserVisibleHint(true);
        if (isResumed() && (absFragment = this.LLILZ) != null && !absFragment.isHidden()) {
            C1514430pVp.LJFF(ZR());
            C1590830rV3 c1590830rV33 = new C1590830rV3();
            c1590830rV33.LJIILLIIL = this.LLILLJJLI;
            c1590830rV33.LJIILJJIL();
        }
        S1(false);
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.BaseFeedListFragment, com.ss.android.ugc.aweme.feed.ui.FeedFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C19EG activity;
        super.onViewCreated(view, bundle);
        C2189821An6 c2189821An6 = new C2189821An6();
        c2189821An6.setEventType(this.LLILLJJLI);
        c2189821An6.setPageType(this.LLILLL);
        aS().LLLL(c2189821An6);
        aS().LLLII = VR();
        aS().LLLIIII = VR();
        if (this.LLJ == null && C1492500owS.LIZ() && (activity = getActivity()) != null) {
            this.LLJ = C1209450hZv.LIZIZ(activity);
        }
        NoNetDetectHelper.LIZIZ(this.LLILLL, Boolean.TRUE);
        Db(false);
        WR().LLILZIL = this.LLJIJIL;
        WR().LLILZ = this.LLJILJIL;
        WR().LLILZLL = this.LLJILJILJ;
        WR().LLIZ = this.LLILLJJLI;
        aS().onViewCreated(getView(), bundle);
        aS().Xl1(VR());
        aS().LLJJI(new C1620930sHb(this, 16));
        C723850SaN.LIZ(this, false, null, new AwS603S0100000_24(this, 524), 3);
        final InterfaceC665370Q7z interfaceC665370Q7zLJFF = C1558360qeg.LJFF(this, null);
        final TopicFeedScrollProfileStrategy topicFeedScrollProfileStrategy = new TopicFeedScrollProfileStrategy(this.LLILLL, requireActivity());
        C1554610qYd.LIZJ(interfaceC665370Q7zLJFF, InterceptHomeViewPagerProtocol.class, C1697810uHb.LJIILJJIL(topicFeedScrollProfileStrategy));
        Lifecycle lifecycle = getLifecycle();
        if (lifecycle != null) {
            lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.topicfeed.ui.fragment.BaseTopicFeedFragment$assembleViews$lambda$0$$inlined$registerProtocol$1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        C1554610qYd.LIZLLL(interfaceC665370Q7zLJFF, InterceptHomeViewPagerProtocol.class, topicFeedScrollProfileStrategy);
                    }
                }
            });
        }
        ILoadMoreAbility iLoadMoreAbilityEw0 = Ew0();
        if (iLoadMoreAbilityEw0 != null) {
            ((LoadMorePanelComponentTempHelper) iLoadMoreAbilityEw0).p41(new C0OCC() { // from class: X.0qo0
                @Override // X.C0OCC, X.InterfaceC1603270rp7
                public final void onHide() {
                    ITopicContentAssemAbility iTopicContentAssemAbility;
                    ITopicToFYPAssemAbility iTopicToFYPAssemAbility;
                    ITopicContentAssemAbility iTopicContentAssemAbility2 = (ITopicContentAssemAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this.LL, null), ITopicContentAssemAbility.class, null);
                    if (iTopicContentAssemAbility2 == null || iTopicContentAssemAbility2.g8() || (iTopicContentAssemAbility = (ITopicContentAssemAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this.LL, null), ITopicContentAssemAbility.class, null)) == null || iTopicContentAssemAbility.G6() || (iTopicToFYPAssemAbility = (ITopicToFYPAssemAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this.LL, null), ITopicToFYPAssemAbility.class, null)) == null) {
                        return;
                    }
                    iTopicToFYPAssemAbility.pb();
                }
            });
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.BaseFeedListFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C818480W8w.LIZ(this.LLILLJJLI);
        WR().LLILLL = System.currentTimeMillis();
        View viewLIZJ = C20673215v0.LIZJ(R.layout.fw1, (Activity) getContext());
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
