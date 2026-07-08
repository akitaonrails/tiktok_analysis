package com.ss.android.ugc.aweme.explore.ui.container;

import X.C07MS;
import X.C0AB7;
import X.C0QSJ;
import X.C1220000hqw;
import X.C1388190mED;
import X.C13LE;
import X.C14LC;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1571680r0A;
import X.C15TA;
import X.C20528815Uo;
import X.C20528915Up;
import X.C20529015Uq;
import X.C2217381BqS;
import X.C296080Bj4;
import X.C338520DOw;
import X.C418440Gaw;
import X.C451460Hn6;
import X.C451620HnM;
import X.C452070Ho5;
import X.C497820Jfg;
import X.C673150Qan;
import X.C687700QyG;
import X.C723850SaN;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736950SvV;
import X.C799520VXy;
import X.C814420VxA;
import X.InterfaceC1146704e9;
import X.InterfaceC1571610r03;
import X.InterfaceC687730QyJ;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.explore.ability.ExploreManageTabAbility;
import com.ss.android.ugc.aweme.explore.ability.ExplorePowerListAbility;
import com.ss.android.ugc.aweme.explore.data.ExploreCustomTopicResponse;
import com.ss.android.ugc.aweme.explore.scope.ExploreFragmentContainerScope;
import com.ss.android.ugc.aweme.explore.vm.ExploreFeedStateSharedVM;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS610S0100000_31;
import kotlin.jvm.internal.AwS638S0100000_24;

/* JADX INFO: loaded from: classes32.dex */
public final class ExploreXTabFeedFragment extends BaseExploreFeedFragment implements InterfaceC1571610r03, C0QSJ, InterfaceC1146704e9 {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiA0OSM8OiBiPCHELIOSZ9KyoiPS46JiA+ZworOCkjOyoLHCQuDyo2LAM+KCg+LSs4";
    public final C736950SvV LLJJJ;
    public Bundle LLJJJIL;

    @Override // X.InterfaceC1571610r03
    public final Bundle Bd() {
        return C799520VXy.LIZ(new Pair("key_vm_top_space", Integer.valueOf(C20529015Uq.LIZ)), new Pair("key_vm_bottom_space", Integer.valueOf(C20529015Uq.LIZIZ)));
    }

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

    public ExploreXTabFeedFragment() {
        C20528815Uo c20528815Uo = new C20528815Uo();
        this.LLJJJ = new C736950SvV(C13LE.LIZ(ExploreFeedStateSharedVM.class), c20528815Uo, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), new C20528915Up(), new C451460Hn6(this, false), new C451620HnM(this, true), new C338520DOw(this));
    }

    @Override // X.InterfaceC1571610r03
    public final void Ai(Bundle bundle) {
        this.LLJJJIL = bundle;
        if (bundle != null && ((Boolean) C0AB7.LIZ.getValue()).booleanValue()) {
            C15TA.LJIIJJI(C15TA.LIZ, "be_null", "homepage_hot", null, 12);
        }
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
            jLongValue = 0;
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
        int iLIZIZ;
        View viewFindViewById;
        super.initView(view);
        int iLIZIZ2 = 0;
        C723850SaN.LIZ(this, false, null, new AwS610S0100000_31(this, 182), 3);
        if ((C296080Bj4.LIZ() && this.LLIZLLLIL) || (C1571680r0A.LIZIZ && this.LLJJJIL != null)) {
            hS().getLayoutParams().height = C20529015Uq.LIZ;
            gS().getLayoutParams().height = C20529015Uq.LIZIZ;
        } else {
            ViewGroup.LayoutParams layoutParams = hS().getLayoutParams();
            int iLIZJ = C497820Jfg.LIZJ(hS().getContext());
            Activity activityLIZ = C1388190mED.LIZ(view.getContext());
            if (activityLIZ != null && (viewFindViewById = activityLIZ.findViewById(R.id.tpm)) != null) {
                iLIZIZ = viewFindViewById.getMeasuredHeight();
            } else {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(58));
            }
            int i = iLIZJ + iLIZIZ;
            if (C07MS.LIZ()) {
                iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
            }
            layoutParams.height = i - iLIZIZ2;
            gS().getLayoutParams().height = C14LC.LJIILLIIL;
            C20529015Uq.LIZ = hS().getLayoutParams().height;
            C20529015Uq.LIZIZ = gS().getLayoutParams().height;
        }
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJJ.getValue(), new C2217381BqS() { // from class: X.15Un
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C15SI) obj).LL;
            }
        }, null, new AwS638S0100000_24(this, 27), 6);
        this.LLJJJIL = null;
    }
}
