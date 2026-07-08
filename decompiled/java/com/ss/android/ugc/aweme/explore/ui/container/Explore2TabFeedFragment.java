package com.ss.android.ugc.aweme.explore.ui.container;

import X.C0QSJ;
import X.C1220000hqw;
import X.C13LE;
import X.C14LC;
import X.C1558360qeg;
import X.C1558520qew;
import X.C20529015Uq;
import X.C2217381BqS;
import X.C296080Bj4;
import X.C338520DOw;
import X.C451460Hn6;
import X.C451620HnM;
import X.C452070Ho5;
import X.C497820Jfg;
import X.C673150Qan;
import X.C687700QyG;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736950SvV;
import X.C786410Ut5;
import X.C800330VaR;
import X.InterfaceC1146704e9;
import X.InterfaceC687730QyJ;
import Y.ACListenerS158S0100000_24;
import android.view.View;
import android.view.ViewStub;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.explore.ability.ExploreManageTabAbility;
import com.ss.android.ugc.aweme.explore.ability.ExplorePowerListAbility;
import com.ss.android.ugc.aweme.explore.data.ExploreCustomTopicResponse;
import com.ss.android.ugc.aweme.explore.scope.ExploreFragmentContainerScope;
import com.ss.android.ugc.aweme.explore.vm.ExploreFeedStateSharedVM;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.service.IFeedDebugService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS638S0100000_24;

/* JADX INFO: loaded from: classes32.dex */
public final class Explore2TabFeedFragment extends BaseExploreFeedFragment implements C0QSJ, InterfaceC1146704e9 {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiA0OSM8OiBiPCHELIOSZ9KyoiPS46JiA+ZworOCkjOyphHCQuDyo2LAM+KCg+LSs4";
    public final C736950SvV LLJJJ;
    public View LLJJJIL;

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{ExploreFragmentContainerScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment
    public final String getEnterFrom() {
        return "homepage_explore";
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ExploreFragmentContainerScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ExploreFragmentContainerScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    public Explore2TabFeedFragment() {
        AFwS221S0000000_31 aFwS221S0000000_31 = AFwS221S0000000_31.get$arr$(172);
        this.LLJJJ = new C736950SvV(C13LE.LIZ(ExploreFeedStateSharedVM.class), aFwS221S0000000_31, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS276S0000000_31.get$arr$(108), new C451460Hn6(this, false), new C451620HnM(this, true), new C338520DOw(this));
    }

    @Override // com.ss.android.ugc.aweme.feed.ui.FeedFragment
    public final boolean Oi(boolean z) {
        String str;
        long jLongValue;
        ExploreCustomTopicResponse exploreCustomTopicResponseYB1;
        Long l;
        if (z) {
            str = "click_button_icon";
        } else {
            str = "click_top_icon";
        }
        ExploreManageTabAbility exploreManageTabAbilityCS = cS();
        if (exploreManageTabAbilityCS != null && (exploreCustomTopicResponseYB1 = exploreManageTabAbilityCS.yB1()) != null && (l = exploreCustomTopicResponseYB1.topicId) != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = -1;
        }
        ExplorePowerListAbility explorePowerListAbility = (ExplorePowerListAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this, null), ExplorePowerListAbility.class, String.valueOf(jLongValue));
        if (explorePowerListAbility != null) {
            explorePowerListAbility.VP(jLongValue, str);
        }
        ((ExploreFeedStateSharedVM) this.LLJJJ.getValue()).wQ2(false);
        return true;
    }

    @Override // com.ss.android.ugc.aweme.explore.ui.container.BaseExploreFeedFragment
    public final void initView(View view) {
        super.initView(view);
        if (C296080Bj4.LIZ() && this.LLIZLLLIL) {
            hS().getLayoutParams().height = C20529015Uq.LIZ;
            gS().getLayoutParams().height = C20529015Uq.LIZIZ;
        } else {
            hS().getLayoutParams().height = C497820Jfg.LIZJ(hS().getContext());
            gS().getLayoutParams().height = C14LC.LJIILLIIL;
            C20529015Uq.LIZ = hS().getLayoutParams().height;
            C20529015Uq.LIZIZ = gS().getLayoutParams().height;
        }
        View viewLJLLLL = C786410Ut5.LJLLLL((ViewStub) view.findViewById(R.id.vs_search_layout));
        this.LLJJJIL = viewLJLLLL;
        View view2 = null;
        if (viewLJLLLL == null) {
            viewLJLLLL = null;
        }
        viewLJLLLL.setBackground(C800330VaR.LIZIZ(view.getContext(), R.drawable.brh));
        View view3 = this.LLJJJIL;
        if (view3 == null) {
            view3 = null;
        }
        C786410Ut5.LJLLLLLL(0, view3);
        View view4 = this.LLJJJIL;
        if (view4 != null) {
            view2 = view4;
        }
        C786410Ut5.I7(new ACListenerS158S0100000_24(this, 15), view2);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJJ.getValue(), new C2217381BqS() { // from class: X.15Um
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C15SI) obj).LL;
            }
        }, null, new AwS638S0100000_24(this, 26), 6);
        IFeedDebugService iFeedDebugService = (IFeedDebugService) PluggableExtentionKt.pluggableSpi$default(IFeedDebugService.class, false, false, false, 14, null);
        if (iFeedDebugService != null) {
            getActivity();
            view.findViewById(R.id.nwh);
            iFeedDebugService.LIZ();
        }
    }
}
