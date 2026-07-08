package com.ss.android.ugc.aweme.explore.ui.container;

import X.AbstractC848400XPy;
import X.C01GW;
import X.C03H5;
import X.C07CF;
import X.C07MS;
import X.C098200Yq;
import X.C0GS8;
import X.C0QSJ;
import X.C0SCA;
import X.C0VWC;
import X.C0XQ7;
import X.C0ZP4;
import X.C1065320dpS;
import X.C1086520eNe;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1220000hqw;
import X.C1308910kAL;
import X.C13LE;
import X.C13LQ;
import X.C14MI;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1561720qk6;
import X.C15SJ;
import X.C15TA;
import X.C15U2;
import X.C15U9;
import X.C15UA;
import X.C15UD;
import X.C15UE;
import X.C15UU;
import X.C1685300txQ;
import X.C16G1;
import X.C1770850wBP;
import X.C1865180ydY;
import X.C189200o6;
import X.C1906580ziK;
import X.C1910420zoW;
import X.C19474211Gy;
import X.C19EG;
import X.C19GS;
import X.C1AMU;
import X.C20522015Ry;
import X.C20522115Rz;
import X.C20525215Te;
import X.C20526615Ts;
import X.C20526715Tt;
import X.C20526815Tu;
import X.C20526915Tv;
import X.C20527115Tx;
import X.C20673215v0;
import X.C20684815ws;
import X.C2179771ASp;
import X.C2187451AjH;
import X.C2217381BqS;
import X.C288830BTt;
import X.C291001Au;
import X.C296080Bj4;
import X.C338520DOw;
import X.C451460Hn6;
import X.C451620HnM;
import X.C452070Ho5;
import X.C452501pT;
import X.C616540OGe;
import X.C687700QyG;
import X.C720620SOm;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736950SvV;
import X.C786410Ut5;
import X.EnumC1910400zoU;
import X.InterfaceC0148002o;
import X.InterfaceC1055110dYz;
import X.InterfaceC1591870rWj;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC2217241BqE;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.ACListenerS153S0100000_18;
import Y.ARunnableS119S0100000_19;
import Y.ARunnableS124S0100000_24;
import Y.ARunnableS131S0100000_31;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.apm.core.ActivityLifeObserver;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.hox.Hox;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility;
import com.ss.android.ugc.aweme.explore.ExploreFeedParams;
import com.ss.android.ugc.aweme.explore.ability.ExploreManageTabAbility;
import com.ss.android.ugc.aweme.explore.ability.MiddleBridgeCellAbility;
import com.ss.android.ugc.aweme.explore.assem.ExploreFeedCell;
import com.ss.android.ugc.aweme.explore.assem.dm.ExploreDMGroupCell;
import com.ss.android.ugc.aweme.explore.common.ExploreStaggeredGridLayoutManager;
import com.ss.android.ugc.aweme.explore.data.ExploreCustomTopicResponse;
import com.ss.android.ugc.aweme.explore.data.ExploreTopBannerData;
import com.ss.android.ugc.aweme.explore.monitor.ff.Explore0VVTopicMonitorManager;
import com.ss.android.ugc.aweme.explore.monitor.ff.Explore0VVTrackerMonitor;
import com.ss.android.ugc.aweme.explore.monitor.lcp.ExploreLCPTracker;
import com.ss.android.ugc.aweme.explore.ui.container.BaseExploreFeedFragment;
import com.ss.android.ugc.aweme.explore.vm.ExploreFeedListViewModel;
import com.ss.android.ugc.aweme.explore.vm.ExploreFeedStateSharedVM;
import com.ss.android.ugc.aweme.feed.ui.FeedFragment;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.aweme.screenshot.IScreenshotService;
import com.ss.android.ugc.aweme.service.IExploreFeedDebugService;
import com.ss.android.ugc.aweme.services.IMainService;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS397S0200000_31;
import kotlin.jvm.internal.AwS610S0100000_31;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes32.dex */
public abstract class BaseExploreFeedFragment extends FeedFragment implements InterfaceC724530SbT, InterfaceC1055110dYz, InterfaceC1591870rWj {
    public static boolean LLJJIJIL = true;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public View LLJI;
    public View LLJIJIL;
    public LinearLayout LLJILJIL;
    public View LLJILJILJ;
    public C20526915Tv LLJILLL;
    public final C736950SvV LLJJIII;
    public C0GS8 LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C01GW LLILZLL = C452501pT.LIZIZ(new C20522115Rz(this));
    public final C20522015Ry LLJ = new Observer<String>() { // from class: X.15Ry
        @Override // androidx.lifecycle.Observer
        public final void onChanged(String str) {
            if (str == null) {
                C720620SOm.LIZ.removeObserver(this);
                View view = this.LL.getView();
                if (view != null) {
                    HandlerHook.viewPost(view, new ARunnableS124S0100000_24(this.LL, 25));
                }
                ExploreFeedListViewModel.LLJZIJLIL = "click_explore_card";
                this.LL.kS(Boolean.TRUE);
            }
        }
    };
    public final float LLJJ = 0.9f;
    public boolean LLJJI = true;

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment
    public final String MR() {
        return "a2270.b5180";
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

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // X.InterfaceC1591870rWj
    public final String wm() {
        return "BaseExploreFeedFragment";
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment
    public final void SR() {
        if (this.LL != -1) {
            long jCurrentTimeMillis = System.currentTimeMillis() - this.LL;
            if (jCurrentTimeMillis > 0) {
                getContext();
                C20684815ws.LJIIIZ(jCurrentTimeMillis, 0L, "stay_time", this.LLILLJJLI);
                PR(jCurrentTimeMillis);
            }
            this.LL = -1L;
        }
    }

    public final ExploreManageTabAbility cS() {
        return (ExploreManageTabAbility) this.LLILZLL.getValue();
    }

    public final View gS() {
        View view = this.LLJIJIL;
        if (view != null) {
            return view;
        }
        return null;
    }

    public final View hS() {
        View view = this.LLJI;
        if (view != null) {
            return view;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() throws JSONException {
        C19EG activity;
        C19EG activity2;
        C15U9 c15u9 = new Object() { // from class: X.15U9
        };
        boolean z = this.LLIZLLLIL;
        c15u9.getClass();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("is_recreate", z);
        AppLogNewUtils.onEventV3("main_activity_explore_recreate_monitor", jSONObject);
        this.LLIZLLLIL = false;
        C720620SOm.LIZ.removeObserver(this.LLJ);
        C19EG activity3 = getActivity();
        if (((activity3 != null && activity3.isFinishing()) || ((activity = getActivity()) != null && activity.isChangingConfigurations())) && (activity2 = getActivity()) != null) {
            int iIdentityHashCode = System.identityHashCode(activity2);
            C20525215Te.LIZ.remove(Integer.valueOf(iIdentityHashCode));
            C20525215Te.LIZIZ.remove(Integer.valueOf(iIdentityHashCode));
            C20525215Te.LIZJ.remove(Integer.valueOf(iIdentityHashCode));
            C20525215Te.LIZLLL.remove(Integer.valueOf(iIdentityHashCode));
        }
        EnumC1910400zoU enumC1910400zoU = EnumC1910400zoU.ON_DESTROY;
        C1910420zoW.LIZLLL(enumC1910400zoU);
        super.onDestroy();
        C1910420zoW.LIZIZ(enumC1910400zoU);
        C1910420zoW.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        C19EG activity;
        CopyOnWriteArraySet<C15U2> copyOnWriteArraySet;
        C20526815Tu.LIZ.getClass();
        ((AbstractC848400XPy) C0XQ7.LJFF()).LJIILLIIL(C20526815Tu.LIZLLL);
        C20526815Tu.LIZIZ.clear();
        C20526815Tu.LIZJ.clear();
        C1865180ydY.LIZ.clear();
        C1865180ydY.LIZIZ = null;
        C20526915Tv c20526915Tv = this.LLJILLL;
        if (c20526915Tv != null && (activity = getActivity()) != null && (copyOnWriteArraySet = C20525215Te.LIZIZ.get(Integer.valueOf(System.identityHashCode(activity)))) != null) {
            copyOnWriteArraySet.remove(c20526915Tv);
        }
        this.LLJILLL = null;
        this.LLJILJILJ = null;
        EnumC1910400zoU enumC1910400zoU = EnumC1910400zoU.ON_DESTROY_VIEW;
        C1910420zoW.LIZLLL(enumC1910400zoU);
        super.onDestroyView();
        C1910420zoW.LIZIZ(enumC1910400zoU);
        C1910420zoW.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        View view;
        EnumC1910400zoU enumC1910400zoU = EnumC1910400zoU.ON_PAUSE;
        C1910420zoW.LIZLLL(enumC1910400zoU);
        super.onPause();
        MutableLiveData<String> mutableLiveData = C720620SOm.LIZ;
        if (mutableLiveData.getValue() != null) {
            mutableLiveData.observeForever(this.LLJ);
        }
        C1910420zoW.LIZIZ(enumC1910400zoU);
        if (!this.LLIZ && (view = getView()) != null && view.getParent() != null && mS()) {
            C15UA.LIZLLL();
        }
        IScreenshotService iScreenshotService = (IScreenshotService) PluggableExtentionKt.pluggableSpi$default(IScreenshotService.class, false, false, false, 14, null);
        if (iScreenshotService != null) {
            iScreenshotService.LIZJ(null);
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        EnumC1910400zoU enumC1910400zoU = EnumC1910400zoU.ON_START;
        C1910420zoW.LIZLLL(enumC1910400zoU);
        C20526715Tt c20526715Tt = (C20526715Tt) this.LLJJIJIIJIL.getValue();
        C0VWC c0vwcLIZIZ = c20526715Tt.LIZIZ();
        if (c0vwcLIZIZ != null) {
            c20526715Tt.LIZ().LJIIJ(c0vwcLIZIZ);
        }
        c20526715Tt.LIZ().start();
        super.onStart();
        if (mS()) {
            C1910420zoW.LIZIZ(enumC1910400zoU);
        } else {
            C1910420zoW.LIZIZ(enumC1910400zoU);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        EnumC1910400zoU enumC1910400zoU = EnumC1910400zoU.ON_STOP;
        C1910420zoW.LIZLLL(enumC1910400zoU);
        C20526715Tt c20526715Tt = (C20526715Tt) this.LLJJIJIIJIL.getValue();
        c20526715Tt.LIZ().stop();
        if (c20526715Tt.LIZLLL != null) {
            c20526715Tt.LIZ().LJIIIIZZ();
        }
        if (!ActivityLifeObserver.getInstance().isForeground()) {
            ExploreLCPTracker.INSTANCE.onEnterBackground$explore_release(0L);
            ExploreFeedListViewModel.LLJZIJLIL = "exit_app";
        } else if (Intrinsics.LJFF(ExploreFeedListViewModel.LLJZIJLIL, "other")) {
            super.onStop();
            View view = getView();
            if (view != null) {
                HandlerHook.viewPost(view, new ARunnableS131S0100000_31(this, 60));
                return;
            }
            return;
        }
        super.onStop();
        kS(null);
        MutableLiveData<String> mutableLiveData = C720620SOm.LIZ;
        mutableLiveData.removeObserver(this.LLJ);
        mutableLiveData.setValue(null);
        IExploreFeedDebugService iExploreFeedDebugService = (IExploreFeedDebugService) PluggableExtentionKt.pluggableSpi$default(IExploreFeedDebugService.class, false, false, false, 14, null);
        if (iExploreFeedDebugService != null) {
            iExploreFeedDebugService.LIZLLL();
        }
        C1910420zoW.LIZIZ(enumC1910400zoU);
        C1910420zoW.LIZ();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.15Ry] */
    public BaseExploreFeedFragment() {
        AFwS221S0000000_31 aFwS221S0000000_31 = AFwS221S0000000_31.get$arr$(171);
        this.LLJJIII = new C736950SvV(C13LE.LIZ(ExploreFeedStateSharedVM.class), aFwS221S0000000_31, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS276S0000000_31.get$arr$(107), new C451460Hn6(this, false), new C451620HnM(this, true), new C338520DOw(this));
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new C20527115Tx());
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment
    public final void RR() {
        C1086520eNe c1086520eNeLP2;
        C1086520eNe c1086520eNeLP22;
        StaggeredGridLayoutManager staggeredGridLayoutManager;
        StaggeredGridLayoutManager staggeredGridLayoutManager2;
        StaggeredGridLayoutManager staggeredGridLayoutManager3;
        StaggeredGridLayoutManager staggeredGridLayoutManager4;
        StaggeredGridLayoutManager staggeredGridLayoutManager5;
        StaggeredGridLayoutManager staggeredGridLayoutManager6;
        if (mS()) {
            super.RR();
            MiddleBridgeCellAbility middleBridgeCellAbilityDS = dS();
            C1086520eNe c1086520eNeLP23 = middleBridgeCellAbilityDS != null ? middleBridgeCellAbilityDS.lP2() : null;
            int iLJJIII = 2;
            if (c1086520eNeLP23 != null) {
                RecyclerView.LayoutManager layoutManager = c1086520eNeLP23.getLayoutManager();
                int iLJJIII2 = (!(layoutManager instanceof StaggeredGridLayoutManager) || (staggeredGridLayoutManager6 = (StaggeredGridLayoutManager) layoutManager) == null) ? 2 : staggeredGridLayoutManager6.LJJIII();
                int[] iArr = new int[iLJJIII2];
                int[] iArr2 = new int[iLJJIII2];
                RecyclerView.LayoutManager layoutManager2 = c1086520eNeLP23.getLayoutManager();
                if ((layoutManager2 instanceof StaggeredGridLayoutManager) && (staggeredGridLayoutManager5 = (StaggeredGridLayoutManager) layoutManager2) != null) {
                    staggeredGridLayoutManager5.LJIJ(iArr);
                }
                int iLJJJJZI = C13LQ.LJJJJZI(iArr);
                RecyclerView.LayoutManager layoutManager3 = c1086520eNeLP23.getLayoutManager();
                if ((layoutManager3 instanceof StaggeredGridLayoutManager) && (staggeredGridLayoutManager4 = (StaggeredGridLayoutManager) layoutManager3) != null) {
                    staggeredGridLayoutManager4.LJIJJ(iArr2);
                }
                int iLJJJJLI = C13LQ.LJJJJLI(iArr2);
                if (iLJJJJZI >= 0 && iLJJJJLI >= 0 && iLJJJJLI >= iLJJJJZI && iLJJJJZI <= iLJJJJLI) {
                    while (true) {
                        RecyclerView.ViewHolder viewHolderFindViewHolderForLayoutPosition = c1086520eNeLP23.findViewHolderForLayoutPosition(iLJJJJZI);
                        if (!(viewHolderFindViewHolderForLayoutPosition instanceof ExploreFeedCell)) {
                            viewHolderFindViewHolderForLayoutPosition = null;
                        }
                        ExploreFeedCell exploreFeedCell = (ExploreFeedCell) viewHolderFindViewHolderForLayoutPosition;
                        if (exploreFeedCell != null) {
                            TuxIconDrawable tuxIconDrawable = ExploreFeedCell.LLLF;
                            exploreFeedCell.k7(false);
                        }
                        if (iLJJJJZI == iLJJJJLI) {
                            break;
                        } else {
                            iLJJJJZI++;
                        }
                    }
                }
            }
            MiddleBridgeCellAbility middleBridgeCellAbilityDS2 = dS();
            if (middleBridgeCellAbilityDS2 != null && (c1086520eNeLP22 = middleBridgeCellAbilityDS2.lP2()) != null) {
                RecyclerView.LayoutManager layoutManager4 = c1086520eNeLP22.getLayoutManager();
                if ((layoutManager4 instanceof StaggeredGridLayoutManager) && (staggeredGridLayoutManager3 = (StaggeredGridLayoutManager) layoutManager4) != null) {
                    iLJJIII = staggeredGridLayoutManager3.LJJIII();
                }
                int[] iArr3 = new int[iLJJIII];
                int[] iArr4 = new int[iLJJIII];
                RecyclerView.LayoutManager layoutManager5 = c1086520eNeLP22.getLayoutManager();
                if ((layoutManager5 instanceof StaggeredGridLayoutManager) && (staggeredGridLayoutManager2 = (StaggeredGridLayoutManager) layoutManager5) != null) {
                    staggeredGridLayoutManager2.LJIJ(iArr3);
                }
                int iLJJJJZI2 = C13LQ.LJJJJZI(iArr3);
                RecyclerView.LayoutManager layoutManager6 = c1086520eNeLP22.getLayoutManager();
                if ((layoutManager6 instanceof StaggeredGridLayoutManager) && (staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager6) != null) {
                    staggeredGridLayoutManager.LJIJJ(iArr4);
                }
                int iLJJJJLI2 = C13LQ.LJJJJLI(iArr4);
                if (iLJJJJZI2 >= 0 && iLJJJJLI2 >= 0 && iLJJJJLI2 >= iLJJJJZI2 && iLJJJJZI2 <= iLJJJJLI2) {
                    while (true) {
                        RecyclerView.ViewHolder viewHolderFindViewHolderForLayoutPosition2 = c1086520eNeLP22.findViewHolderForLayoutPosition(iLJJJJZI2);
                        if (!(viewHolderFindViewHolderForLayoutPosition2 instanceof ExploreDMGroupCell)) {
                            viewHolderFindViewHolderForLayoutPosition2 = null;
                        }
                        ExploreDMGroupCell exploreDMGroupCell = (ExploreDMGroupCell) viewHolderFindViewHolderForLayoutPosition2;
                        if (exploreDMGroupCell != null) {
                            int i = ExploreDMGroupCell.LLJILLL;
                            exploreDMGroupCell.L5(false);
                        }
                        if (iLJJJJZI2 == iLJJJJLI2) {
                            break;
                        } else {
                            iLJJJJZI2++;
                        }
                    }
                }
            }
            MiddleBridgeCellAbility middleBridgeCellAbilityDS3 = dS();
            if (middleBridgeCellAbilityDS3 != null && (c1086520eNeLP2 = middleBridgeCellAbilityDS3.lP2()) != null) {
                c1086520eNeLP2.LJJI();
            }
            Explore0VVTrackerMonitor.INSTANCE.start(C15UE.OTHER.getValue());
        }
    }

    public final ExploreFeedParams bS() {
        Intent intent;
        ExploreFeedParams exploreFeedParams;
        C19EG activity = getActivity();
        return (activity == null || (intent = activity.getIntent()) == null || (exploreFeedParams = (ExploreFeedParams) intent.getParcelableExtra("explore_feed_params")) == null) ? new ExploreFeedParams(0) : exploreFeedParams;
    }

    public final MiddleBridgeCellAbility dS() {
        ExploreCustomTopicResponse exploreCustomTopicResponseYB1;
        Long l;
        ExploreManageTabAbility exploreManageTabAbilityCS = cS();
        return (MiddleBridgeCellAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this, null), MiddleBridgeCellAbility.class, String.valueOf((exploreManageTabAbilityCS == null || (exploreCustomTopicResponseYB1 = exploreManageTabAbilityCS.yB1()) == null || (l = exploreCustomTopicResponseYB1.topicId) == null) ? -1L : l.longValue()));
    }

    public final boolean mS() {
        C19EG activity = getActivity();
        return activity != null && isVisible() && getUserVisibleHint() && Hox.LLJILJIL.LIZ(activity).KQ2("homepage_explore");
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        if (C616540OGe.LIZ() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isMainPage(getActivity())) {
            C2187451AjH.LJJIJIIJI(getClass().getName());
        }
        EnumC1910400zoU enumC1910400zoU = EnumC1910400zoU.ON_RESUME;
        C1910420zoW.LIZLLL(enumC1910400zoU);
        super.onResume();
        C1910420zoW.LIZIZ(enumC1910400zoU);
        this.LLIZ = false;
        View view = getView();
        if (view != null) {
            HandlerHook.viewPost(view, new ARunnableS131S0100000_31(this, 59));
        }
    }

    public static final ExploreFeedStateSharedVM VR(BaseExploreFeedFragment baseExploreFeedFragment) {
        return (ExploreFeedStateSharedVM) baseExploreFeedFragment.LLJJIII.getValue();
    }

    public static boolean iS(ViewGroup viewGroup) {
        View view;
        View viewFindViewById = viewGroup.findViewById(R.id.kgf);
        if (viewFindViewById == null) {
            return true;
        }
        Object parent = viewGroup.getParent();
        if (!(parent instanceof View) || (view = (View) parent) == null) {
            return true;
        }
        int[] iArr = new int[2];
        viewFindViewById.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        view.getLocationOnScreen(iArr2);
        int i = iArr[1];
        if (i < iArr2[1]) {
            if ((r0 - i) / viewFindViewById.getHeight() < 0.5f) {
                return true;
            }
            return false;
        }
        if (i + viewFindViewById.getHeight() <= iArr2[1] + view.getHeight() || ((iArr[1] + viewFindViewById.getHeight()) - (iArr2[1] + view.getHeight())) / viewFindViewById.getHeight() < 0.5f) {
            return true;
        }
        return false;
    }

    public final void WR(Boolean bool) {
        BaseActivity baseActivity;
        C19EG activity;
        BaseActivity baseActivity2;
        if (C1906580ziK.LJI() || ((C720620SOm.LIZ.getValue() != null || Intrinsics.LJFF(bool, Boolean.TRUE)) && C2179771ASp.LJIIIZ())) {
            if (C1906580ziK.LJI() && (activity = getActivity()) != null) {
                C1065320dpS.LIZ.getClass();
                if (C0SCA.LIZ == null) {
                    C0SCA.LIZ = new C1AMU(activity);
                }
                C1AMU c1amu = C0SCA.LIZ;
                if (c1amu != null) {
                    c1amu.LIZ(activity);
                }
            }
            C19EG activity2 = getActivity();
            if ((activity2 instanceof BaseActivity) && (baseActivity = (BaseActivity) activity2) != null) {
                baseActivity.activityConfiguration(AFwS276S0000000_31.get$arr$(105));
                return;
            }
            return;
        }
        if (!C2179771ASp.LJIIIZ()) {
            return;
        }
        C19EG activity3 = getActivity();
        if (activity3 != null) {
            C1065320dpS.LIZ.getClass();
            if (C0SCA.LIZ == null) {
                C0SCA.LIZ = new C1AMU(activity3);
            }
            C1AMU c1amu2 = C0SCA.LIZ;
            if (c1amu2 != null) {
                c1amu2.LIZIZ(activity3);
            }
        }
        C19EG activity4 = getActivity();
        if (!(activity4 instanceof BaseActivity) || (baseActivity2 = (BaseActivity) activity4) == null) {
            return;
        }
        baseActivity2.activityConfiguration(AFwS276S0000000_31.get$arr$(106));
    }

    public final void ZR(View view) {
        Object ability;
        C1086520eNe c1086520eNeLP2;
        ExploreStaggeredGridLayoutManager exploreStaggeredGridLayoutManager;
        MiddleBridgeCellAbility middleBridgeCellAbilityDS = dS();
        Object obj = null;
        if (middleBridgeCellAbilityDS != null && (c1086520eNeLP2 = middleBridgeCellAbilityDS.lP2()) != null) {
            RecyclerView.LayoutManager layoutManager = c1086520eNeLP2.getLayoutManager();
            if ((layoutManager instanceof ExploreStaggeredGridLayoutManager) && (exploreStaggeredGridLayoutManager = (ExploreStaggeredGridLayoutManager) layoutManager) != null) {
                exploreStaggeredGridLayoutManager.LLJJLIIIJLLLLLLLZ = true;
            }
        }
        C0QSJ c0qsjLIZJ = C687700QyG.LIZJ(C1558360qeg.LJFF(this, null), MainActivityScope.class);
        if (c0qsjLIZJ != null) {
            ability = c0qsjLIZJ.getAbility(HomeViewPagerAbility.class);
        } else {
            ability = null;
        }
        if (ability instanceof HomeViewPagerAbility) {
            obj = ability;
        }
        HomeViewPagerAbility homeViewPagerAbility = (HomeViewPagerAbility) obj;
        if (homeViewPagerAbility != null) {
            homeViewPagerAbility.LLIFFJFJJ(true);
        } else {
            HomeViewPagerAbility homeViewPagerAbilityLIZIZ = C1561720qk6.LIZIZ(this);
            if (homeViewPagerAbilityLIZIZ != null) {
                homeViewPagerAbilityLIZIZ.LLIFFJFJJ(true);
            }
        }
        C0GS8 c0gs8 = this.LLJJIJI;
        if (c0gs8 != null) {
            c0gs8.animate().alpha(0.0f).setDuration(150L).withEndAction(new ARunnableS119S0100000_19(this, 58)).start();
        }
    }

    public final void aS(View view) {
        Object ability;
        ViewGroup viewGroup;
        C19EG activity;
        View viewFindViewById;
        C1086520eNe c1086520eNeLP2;
        ExploreStaggeredGridLayoutManager exploreStaggeredGridLayoutManager;
        MiddleBridgeCellAbility middleBridgeCellAbilityDS = dS();
        C0GS8 c0gs8 = null;
        if (middleBridgeCellAbilityDS != null && (c1086520eNeLP2 = middleBridgeCellAbilityDS.lP2()) != null) {
            RecyclerView.LayoutManager layoutManager = c1086520eNeLP2.getLayoutManager();
            if ((layoutManager instanceof ExploreStaggeredGridLayoutManager) && (exploreStaggeredGridLayoutManager = (ExploreStaggeredGridLayoutManager) layoutManager) != null) {
                exploreStaggeredGridLayoutManager.LLJJLIIIJLLLLLLLZ = false;
            }
        }
        C0QSJ c0qsjLIZJ = C687700QyG.LIZJ(C1558360qeg.LJFF(this, null), MainActivityScope.class);
        if (c0qsjLIZJ != null) {
            ability = c0qsjLIZJ.getAbility(HomeViewPagerAbility.class);
        } else {
            ability = null;
        }
        if (!(ability instanceof HomeViewPagerAbility)) {
            ability = null;
        }
        HomeViewPagerAbility homeViewPagerAbility = (HomeViewPagerAbility) ability;
        if (homeViewPagerAbility != null) {
            homeViewPagerAbility.LLIFFJFJJ(false);
        } else {
            HomeViewPagerAbility homeViewPagerAbilityLIZIZ = C1561720qk6.LIZIZ(this);
            if (homeViewPagerAbilityLIZIZ != null) {
                homeViewPagerAbilityLIZIZ.LLIFFJFJJ(false);
            }
        }
        C19EG activity2 = getActivity();
        if (activity2 != null && (viewGroup = (ViewGroup) activity2.findViewById(R.id.tya)) != null && (activity = getActivity()) != null && (viewFindViewById = activity.findViewById(R.id.nwh)) != null) {
            Context context = getContext();
            if (context != null) {
                c0gs8 = new C0GS8(context);
            }
            this.LLJJIJI = c0gs8;
            C0GS8 c0gs82 = this.LLJJIJI;
            if (c0gs82 != null) {
                ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0gs82);
                c0gs82.setLayoutParams(layoutParams);
                c0gs82.setBackgroundColor(0);
                Rect rectNS = nS(view, viewGroup);
                Rect rectNS2 = nS(viewFindViewById, viewGroup);
                rectNS.top = Math.max(rectNS.top, rectNS2.top);
                rectNS.bottom = Math.min(rectNS.bottom, rectNS2.bottom);
                c0gs82.setHoleRect$explore_release(rectNS);
                viewGroup.addView(c0gs82);
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0gs82);
                c0gs82.setAlpha(0.0f);
                c0gs82.animate().alpha(this.LLJJ).setDuration(150L).start();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [X.15Tv, java.lang.Object] */
    public void initView(View view) {
        C16G1 c16g1;
        this.LLJI = view.findViewById(R.id.ydi);
        this.LLJIJIL = view.findViewById(R.id.ch3);
        this.LLJILJIL = (LinearLayout) view.findViewById(R.id.hh5);
        Context context = view.getContext();
        if (C288830BTt.LIZ()) {
            AssemViewModel.selectSubscribe$default((AssemViewModel) this.LLJJIII.getValue(), new C2217381BqS() { // from class: X.15SK
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C15SI) obj).LLILLL;
                }
            }, null, null, null, new AwS610S0100000_31(new AwS397S0200000_31(this, context, 63), 357), 14, null);
            ((ExploreFeedStateSharedVM) this.LLJJIII.getValue()).vQ2(new AwS397S0200000_31(this, context, 64));
            AssemViewModel.selectSubscribe$default((AssemViewModel) this.LLJJIII.getValue(), C15SJ.LL, null, null, null, new AwS610S0100000_31(new AwS397S0200000_31(this, context, 65), (Function1<? super C291001Au<Long>, Unit>) 358), 14, null);
        }
        View viewFindViewById = view.findViewById(R.id.hhp);
        if (viewFindViewById != null) {
            ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
            if ((layoutParams instanceof C16G1) && (c16g1 = (C16G1) layoutParams) != null && c16g1.LIZJ != 8388691) {
                c16g1.LIZJ = 8388691;
                C786410Ut5.W5(viewFindViewById, c16g1);
            }
            this.LLJILJILJ = viewFindViewById;
            C786410Ut5.I7(new ACListenerS153S0100000_18(this, 144), viewFindViewById);
            C19EG activity = getActivity();
            if (activity != null) {
                ?? r4 = new C15U2() { // from class: X.15Tv
                    @Override // X.C15U2
                    public final void LIZ(boolean z) {
                        int i;
                        BaseExploreFeedFragment baseExploreFeedFragment = this.LIZ;
                        View view2 = baseExploreFeedFragment.LLJILJILJ;
                        if (view2 != null) {
                            if (z && baseExploreFeedFragment.mS()) {
                                i = 0;
                            } else {
                                i = 8;
                            }
                            if (view2.getVisibility() != i) {
                                C786410Ut5.LJLLLLLL(i, view2);
                            }
                        }
                    }
                };
                this.LLJILLL = r4;
                int iIdentityHashCode = System.identityHashCode(activity);
                ConcurrentHashMap<Integer, CopyOnWriteArraySet<C15U2>> concurrentHashMap = C20525215Te.LIZIZ;
                Integer numValueOf = Integer.valueOf(iIdentityHashCode);
                CopyOnWriteArraySet copyOnWriteArraySet = concurrentHashMap.get(numValueOf);
                if (copyOnWriteArraySet == null) {
                    copyOnWriteArraySet = new CopyOnWriteArraySet();
                    CopyOnWriteArraySet<C15U2> copyOnWriteArraySetPutIfAbsent = concurrentHashMap.putIfAbsent(numValueOf, (CopyOnWriteArraySet<C15U2>) copyOnWriteArraySet);
                    if (copyOnWriteArraySetPutIfAbsent != null) {
                        copyOnWriteArraySet = copyOnWriteArraySetPutIfAbsent;
                    }
                }
                copyOnWriteArraySet.add(r4);
                r4.LIZ(Intrinsics.LJFF(C20525215Te.LIZ.get(Integer.valueOf(iIdentityHashCode)), Boolean.TRUE));
            }
        }
    }

    public final void kS(Boolean bool) {
        C1086520eNe c1086520eNeLP2;
        int iLJJIII;
        StaggeredGridLayoutManager staggeredGridLayoutManager;
        StaggeredGridLayoutManager staggeredGridLayoutManager2;
        StaggeredGridLayoutManager staggeredGridLayoutManager3;
        if (!mS()) {
            return;
        }
        WR(bool);
        C720620SOm.LIZ.setValue(null);
        MiddleBridgeCellAbility middleBridgeCellAbilityDS = dS();
        if (middleBridgeCellAbilityDS != null && (c1086520eNeLP2 = middleBridgeCellAbilityDS.lP2()) != null) {
            RecyclerView.LayoutManager layoutManager = c1086520eNeLP2.getLayoutManager();
            if ((layoutManager instanceof StaggeredGridLayoutManager) && (staggeredGridLayoutManager3 = (StaggeredGridLayoutManager) layoutManager) != null) {
                iLJJIII = staggeredGridLayoutManager3.LJJIII();
            } else {
                iLJJIII = 2;
            }
            int[] iArr = new int[iLJJIII];
            int[] iArr2 = new int[iLJJIII];
            RecyclerView.LayoutManager layoutManager2 = c1086520eNeLP2.getLayoutManager();
            if ((layoutManager2 instanceof StaggeredGridLayoutManager) && (staggeredGridLayoutManager2 = (StaggeredGridLayoutManager) layoutManager2) != null) {
                staggeredGridLayoutManager2.LJIJ(iArr);
            }
            int iLJJJJZI = C13LQ.LJJJJZI(iArr);
            RecyclerView.LayoutManager layoutManager3 = c1086520eNeLP2.getLayoutManager();
            if ((layoutManager3 instanceof StaggeredGridLayoutManager) && (staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager3) != null) {
                staggeredGridLayoutManager.LJIJJ(iArr2);
            }
            int iLJJJJLI = C13LQ.LJJJJLI(iArr2);
            if (iLJJJJZI >= 0 && iLJJJJLI >= 0 && iLJJJJLI >= iLJJJJZI && iLJJJJZI <= iLJJJJLI) {
                while (true) {
                    RecyclerView.ViewHolder viewHolderFindViewHolderForLayoutPosition = c1086520eNeLP2.findViewHolderForLayoutPosition(iLJJJJZI);
                    if (!(viewHolderFindViewHolderForLayoutPosition instanceof ExploreFeedCell)) {
                        viewHolderFindViewHolderForLayoutPosition = null;
                    }
                    ExploreFeedCell exploreFeedCell = (ExploreFeedCell) viewHolderFindViewHolderForLayoutPosition;
                    if (exploreFeedCell != null) {
                        TuxIconDrawable tuxIconDrawable = ExploreFeedCell.LLLF;
                        exploreFeedCell.h7(false);
                        exploreFeedCell.h7(true);
                    }
                    if (iLJJJJZI == iLJJJJLI) {
                        break;
                    } else {
                        iLJJJJZI++;
                    }
                }
            }
        }
        ExploreFeedListViewModel.LLJZIJLIL = "other";
        Explore0VVTrackerMonitor explore0VVTrackerMonitor = Explore0VVTrackerMonitor.INSTANCE;
        C15UD c15ud = C15UD.OTHER;
        explore0VVTrackerMonitor.leaveReason(c15ud);
        explore0VVTrackerMonitor.report();
        Explore0VVTopicMonitorManager.INSTANCE.reportCurrentTopic(c15ud);
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        if (C296080Bj4.LIZ() && C296080Bj4.LIZIZ) {
            this.LLIZLLLIL = true;
            C296080Bj4.LIZIZ = false;
        }
        C20526815Tu.LIZ.getClass();
        if (C07MS.LIZ() || C07CF.LIZ()) {
            IAccountUserService iAccountUserServiceLJFF = C0XQ7.LJFF();
            C20526615Ts c20526615Ts = C20526815Tu.LIZLLL;
            ((AbstractC848400XPy) iAccountUserServiceLJFF).LJIILLIIL(c20526615Ts);
            ((AbstractC848400XPy) C0XQ7.LJFF()).LJJIFFI(c20526615Ts);
        }
        C1910420zoW.LIZIZ(EnumC1910400zoU.TAB_TO_ON_CREATE);
        C1910420zoW.LIZJ();
        EnumC1910400zoU enumC1910400zoU = EnumC1910400zoU.ON_CREATE;
        C1910420zoW.LIZLLL(enumC1910400zoU);
        ExploreLCPTracker.INSTANCE.markVisible(0L);
        C15TA.LIZ.getClass();
        C15TA.LJJIZ = SystemClock.elapsedRealtime();
        super.onCreate(bundle);
        C1910420zoW.LIZIZ(enumC1910400zoU);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
    @Override // X.InterfaceC1055110dYz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onNodeHide(android.os.Bundle r9) {
        /*
            Method dump skipped, instruction units count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.explore.ui.container.BaseExploreFeedFragment.onNodeHide(android.os.Bundle):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0183  */
    @Override // X.InterfaceC1055110dYz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onNodeShow(android.os.Bundle r29) {
        /*
            Method dump skipped, instruction units count: 415
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.explore.ui.container.BaseExploreFeedFragment.onNodeShow(android.os.Bundle):void");
    }

    public final Rect nS(View view, ViewGroup viewGroup) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        viewGroup.getLocationOnScreen(iArr2);
        iArr[0] = iArr[0] - iArr2[0];
        iArr[1] = iArr[1] - iArr2[1];
        int i = iArr[0];
        return new Rect(i, iArr[1], view.getWidth() + i, iArr[1] + view.getHeight());
    }

    public final void oS(Context context, ExploreTopBannerData exploreTopBannerData) {
        Long l;
        boolean z;
        ExploreCustomTopicResponse exploreCustomTopicResponseYB1;
        ExploreManageTabAbility exploreManageTabAbilityCS = cS();
        String str = null;
        if (exploreManageTabAbilityCS != null && (exploreCustomTopicResponseYB1 = exploreManageTabAbilityCS.yB1()) != null) {
            l = exploreCustomTopicResponseYB1.topicId;
        } else {
            l = null;
        }
        if (l != null && l.longValue() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (exploreTopBannerData != null) {
            str = exploreTopBannerData.landingId;
        }
        boolean zLJFF = Intrinsics.LJFF(str, "world_cup_26");
        if (!z && zLJFF && exploreTopBannerData != null && exploreTopBannerData.isActiveNow()) {
            LinearLayout linearLayout = this.LLJILJIL;
            if (linearLayout != null) {
                linearLayout.setBackground(C14MI.LIZ(context, R.drawable.brn));
                return;
            }
            return;
        }
        C15UU.LIZ.getClass();
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.bx, context);
        if (numLIZJ == null) {
            return;
        }
        int iIntValue = numLIZJ.intValue();
        LinearLayout linearLayout2 = this.LLJILJIL;
        if (linearLayout2 == null) {
            return;
        }
        linearLayout2.setBackgroundColor(iIntValue);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0157  */
    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r15, android.os.Bundle r16) {
        /*
            Method dump skipped, instruction units count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.explore.ui.container.BaseExploreFeedFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        EnumC1910400zoU enumC1910400zoU = EnumC1910400zoU.ON_CREATE_VIEW;
        C1910420zoW.LIZLLL(enumC1910400zoU);
        LLJJIJIL = false;
        View viewLIZLLL = C20673215v0.LIZLLL(R.layout.c59, getActivity(), viewGroup, false);
        C1910420zoW.LIZIZ(enumC1910400zoU);
        C19GS c19gs = null;
        if (!(viewLIZLLL instanceof View)) {
            viewLIZLLL = null;
        }
        if (viewLIZLLL != null) {
            try {
                ViewTreeLifecycleOwner.set(viewLIZLLL, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewLIZLLL, this);
                viewLIZLLL.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewLIZLLL;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewLIZLLL;
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
