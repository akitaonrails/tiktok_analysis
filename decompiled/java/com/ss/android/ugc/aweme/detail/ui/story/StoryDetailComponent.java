package com.ss.android.ugc.aweme.detail.ui.story;

import X.AbstractC1255880imo;
import X.AbstractC1387200mCc;
import X.AbstractC1568960qvm;
import X.AbstractC1569120qw2;
import X.AbstractC813200VvC;
import X.C01GW;
import X.C06US;
import X.C098200Yq;
import X.C0LAB;
import X.C0RO1;
import X.C0ROW;
import X.C0S4J;
import X.C0SUC;
import X.C0T45;
import X.C14EU;
import X.C1558520qew;
import X.C1589640rT8;
import X.C1600750rl3;
import X.C1606370ru7;
import X.C1617560sCA;
import X.C1618440sDa;
import X.C1697810uHb;
import X.C189200o6;
import X.C1906580ziK;
import X.C19252910Tv;
import X.C19EG;
import X.C20684815ws;
import X.C2189821An6;
import X.C263990AWf;
import X.C281260B0q;
import X.C281310B0v;
import X.C452501pT;
import X.C628500Oky;
import X.C630740Ooa;
import X.C680080Qly;
import X.C710330Rtf;
import X.C729510SjV;
import X.C735840Sti;
import X.C739490Szb;
import X.EnumC1570580qyO;
import X.InterfaceC1569000qvq;
import X.InterfaceC1603360rpG;
import X.InterfaceC665370Q7z;
import X.InterfaceC752360TfG;
import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel;
import com.ss.android.ugc.aweme.detail.platform.DetailPageComponent;
import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.feed.collection.collection.ability.UserFeedViewPagerAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.story.IStoryService;
import com.ss.android.ugc.aweme.story.ability.IStoryFeedUserDataAbility;
import com.ss.android.ugc.aweme.subscription.service.ISubscriptionCommonService;
import com.ss.android.ugc.aweme.subscription.urllessaweme.service.PaidContentCommonServiceImpl;
import com.ss.android.ugc.aweme.tablet.impl.business.split.split.SplitContainerManager;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class StoryDetailComponent extends DetailPageComponent {
    public final C01GW LLLJIL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 280));
    public final C01GW LLLJL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 279));
    public final C01GW LLLL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(110));
    public final C01GW LLLLII;
    public final C630740Ooa LLLLIIIILLL;
    public final C01GW LLLLIIL;
    public final C01GW LLLLIILL;

    public final UserFeedViewPagerAbility Ep() {
        return (UserFeedViewPagerAbility) this.LLLLIIIILLL.getValue();
    }

    public final void Gp() {
        String uid = this.LLJJL.getUid();
        String itemId = this.LLJJL.getItemId();
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(Vo(), "//main");
        smartRouteBuildRoute.withParam("uid", uid);
        smartRouteBuildRoute.withParam(FollowStatusChangeMethod.PARAM_UID, itemId);
        smartRouteBuildRoute.withParam("to_inbox_key", "to_inbox_value");
        smartRouteBuildRoute.withParam("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "HOME");
        smartRouteBuildRoute.withParam("tab", EnumC1570580qyO.FOLLOW.getValue());
        smartRouteBuildRoute.open();
    }

    public final void Ip() {
        String uid = this.LLJJL.getUid();
        String itemId = this.LLJJL.getItemId();
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(Vo(), "//main");
        smartRouteBuildRoute.withParam("uid", uid);
        smartRouteBuildRoute.withParam(FollowStatusChangeMethod.PARAM_UID, itemId);
        smartRouteBuildRoute.withParam("to_inbox_key", "to_inbox_value");
        if (C1589640rT8.LIZIZ.F2()) {
            smartRouteBuildRoute.withParam("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "HOME");
            smartRouteBuildRoute.withParam("tab", EnumC1570580qyO.FRIENDS.getValue());
        } else {
            smartRouteBuildRoute.withParam("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "FRIENDS_FEED");
        }
        smartRouteBuildRoute.open();
    }

    public final void Jp() {
        String uid = this.LLJJL.getUid();
        String itemId = this.LLJJL.getItemId();
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(Vo(), "//chat/center");
        smartRouteBuildRoute.withParam("uid", uid);
        smartRouteBuildRoute.withParam(FollowStatusChangeMethod.PARAM_UID, itemId);
        smartRouteBuildRoute.withParam("to_inbox_key", "to_inbox_value");
        smartRouteBuildRoute.open();
    }

    public StoryDetailComponent() {
        new C0S4J("StoryDetailComponent");
        this.LLLLII = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(111));
        this.LLLLIIIILLL = C628500Oky.LIZ(new AwS568S0100000_24(this, 281));
        this.LLLLIIL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(109));
        this.LLLLIILL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 277));
    }

    public final boolean Fp() {
        Aweme awemeLJIIIIZZ;
        User author;
        ISubscriptionCommonService iSubscriptionCommonServiceLIZ = PaidContentCommonServiceImpl.LIZ();
        if (iSubscriptionCommonServiceLIZ == null) {
            return false;
        }
        C19EG activity = getActivity();
        DetailFragmentPanel detailFragmentPanel = this.LLJL;
        return iSubscriptionCommonServiceLIZ.LJ(activity, (detailFragmentPanel == null || (awemeLJIIIIZZ = detailFragmentPanel.LJIIIIZZ()) == null || (author = awemeLJIIIIZZ.getAuthor()) == null) ? null : author.getSecUid());
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x035b  */
    @Override // com.ss.android.ugc.aweme.detail.platform.DetailPageComponent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJ() throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 1037
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.detail.ui.story.StoryDetailComponent.LJIJ():void");
    }

    @Override // com.ss.android.ugc.aweme.detail.platform.DetailPageComponent, com.ss.android.ugc.aweme.detail.platform.IDetailLifecycleAbility
    public final void onDestroyView() {
        FragmentManager supportFragmentManager;
        super.onDestroyView();
        if (((Number) C263990AWf.LIZ.getValue()).intValue() == 1) {
            Fragment fragment = getFragment();
            C19EG activity = fragment != null ? fragment.getActivity() : null;
            if (!(activity instanceof C19EG) || activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null) {
                return;
            }
            supportFragmentManager.LLIILZL((AbstractC813200VvC) this.LLLLII.getValue());
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.platform.DetailPageComponent, com.ss.android.ugc.aweme.detail.platform.IDetailLifecycleAbility
    public final boolean Eb2(AwS568S0100000_24 awS568S0100000_24) {
        InterfaceC665370Q7z interfaceC665370Q7zLJIIL;
        Object c098200Yq;
        InterfaceC665370Q7z interfaceC665370Q7z = null;
        try {
            interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this);
        } catch (Throwable th) {
            th = th;
            interfaceC665370Q7zLJIIL = null;
        }
        try {
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th2) {
            th = th2;
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) == null) {
            interfaceC665370Q7z = interfaceC665370Q7zLJIIL;
        }
        if (C1618440sDa.LIZIZ.LJIIJ(interfaceC665370Q7z)) {
            return true;
        }
        return super.Eb2(awS568S0100000_24);
    }

    @Override // com.ss.android.ugc.aweme.detail.platform.DetailPageComponent
    public final InterfaceC1603360rpG Oo(AbstractC1255880imo<?, ?> abstractC1255880imo) {
        BaseDetailShareVM baseDetailShareVM;
        List<Aweme> awemeList;
        InterfaceC1603360rpG interfaceC1603360rpGOo = super.Oo(abstractC1255880imo);
        if (C281310B0v.LIZ() && Intrinsics.LJFF(this.LLJJL.getFrom(), "STORY_ENTRANCE_INBOX_TOP_LIST")) {
            if (interfaceC1603360rpGOo instanceof BaseDetailShareVM) {
                baseDetailShareVM = (BaseDetailShareVM) interfaceC1603360rpGOo;
            } else {
                baseDetailShareVM = null;
            }
            if (baseDetailShareVM != null && (awemeList = baseDetailShareVM.getAwemeList()) != null) {
                ArrayList arrayList = new ArrayList();
                for (Aweme aweme : awemeList) {
                    if (!C729510SjV.LJJII(aweme)) {
                        arrayList.add(aweme);
                    }
                }
                if (!arrayList.isEmpty()) {
                    return interfaceC1603360rpGOo;
                }
            }
            C2189821An6 c2189821An6 = new C2189821An6();
            c2189821An6.setFrom("STORY_ENTRANCE_COMMON");
            InterfaceC1603360rpG interfaceC1603360rpGLIZ = C1617560sCA.LIZ(c2189821An6, abstractC1255880imo, null, getFragment());
            this.LLJJL.setEnterStoryImmersiveFeedWithOutData(true);
            return interfaceC1603360rpGLIZ;
        }
        return interfaceC1603360rpGOo;
    }

    @Override // com.ss.android.ugc.aweme.detail.platform.DetailPageComponent
    @C14EU
    public void onMobRequestIdEvent(C739490Szb c739490Szb) {
        if (!C0RO1.LIZ(this.LLJJL, null)) {
            super.onMobRequestIdEvent(c739490Szb);
            return;
        }
        C19EG activity = getActivity();
        if (c739490Szb != null && activity != null) {
            Fragment fragmentLIZIZ = C1606370ru7.LIZIZ(getFragment());
            if (fragmentLIZIZ != null) {
                C680080Qly.LIZ(fragmentLIZIZ).LLJ = c739490Szb.LIZ;
            } else {
                C680080Qly.LIZIZ(activity).LLJ = c739490Szb.LIZ;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.platform.DetailPageComponent, com.ss.android.ugc.feed.platform.fragment.IDetailBaseAbility
    public final void yF(int i, String str) {
        String aid;
        boolean zQd2;
        boolean zHe1;
        boolean zM82;
        int size;
        String requestId;
        Activity activityLIZIZ;
        String str2;
        String str3;
        Aweme awemeLJIIIIZZ;
        Set<Integer> setXG;
        Aweme awemeLJIIIIZZ2;
        int i2 = i;
        if (Fp()) {
            return;
        }
        UserFeedViewPagerAbility userFeedViewPagerAbilityEp = Ep();
        if (userFeedViewPagerAbilityEp != null) {
            userFeedViewPagerAbilityEp.bh1();
        }
        ((IStoryService) ServiceManager.get().getService(IStoryService.class)).LJIL();
        AbstractC1569120qw2 abstractC1569120qw2LIZ = C1600750rl3.LIZ(this.LLJJL.getFrom());
        if (abstractC1569120qw2LIZ != null) {
            ((InterfaceC1569000qvq) this.LLLL.getValue()).LJI(abstractC1569120qw2LIZ, new AbstractC1568960qvm() { // from class: X.0qvo
            });
        }
        C735840Sti c735840Sti = C735840Sti.LIZ;
        String eventType = this.LLJJL.getEventType();
        String str4 = "";
        if (eventType == null) {
            eventType = "";
        }
        DetailFragmentPanel detailFragmentPanel = this.LLJL;
        if (detailFragmentPanel == null || (awemeLJIIIIZZ2 = detailFragmentPanel.LJIIIIZZ()) == null || (aid = awemeLJIIIIZZ2.getAid()) == null) {
            aid = "";
        }
        IStoryFeedUserDataAbility iStoryFeedUserDataAbility = (IStoryFeedUserDataAbility) this.LLLJL.getValue();
        if (iStoryFeedUserDataAbility != null) {
            zQd2 = iStoryFeedUserDataAbility.Qd2();
        } else {
            zQd2 = false;
        }
        IStoryFeedUserDataAbility iStoryFeedUserDataAbility2 = (IStoryFeedUserDataAbility) this.LLLJL.getValue();
        if (iStoryFeedUserDataAbility2 != null) {
            zHe1 = iStoryFeedUserDataAbility2.He1();
        } else {
            zHe1 = false;
        }
        IStoryFeedUserDataAbility iStoryFeedUserDataAbility3 = (IStoryFeedUserDataAbility) this.LLLJL.getValue();
        if (iStoryFeedUserDataAbility3 != null) {
            zM82 = iStoryFeedUserDataAbility3.m82();
        } else {
            zM82 = false;
        }
        IStoryFeedUserDataAbility iStoryFeedUserDataAbility4 = (IStoryFeedUserDataAbility) this.LLLJL.getValue();
        if (iStoryFeedUserDataAbility4 != null && (setXG = iStoryFeedUserDataAbility4.XG()) != null) {
            size = setXG.size();
        } else {
            size = 0;
        }
        DetailFragmentPanel detailFragmentPanel2 = this.LLJL;
        if (detailFragmentPanel2 == null || (awemeLJIIIIZZ = detailFragmentPanel2.LJIIIIZZ()) == null || (requestId = awemeLJIIIIZZ.getRequestId()) == null) {
            requestId = "";
        }
        c735840Sti.getClass();
        for (String str5 : C1697810uHb.LJIILJJIL("story_feed_play_end")) {
            C0LAB c0lab = new C0LAB();
            c0lab.LJ("enter_from", eventType);
            c0lab.LJ("enter_method", str);
            c0lab.LJ("last_group_id", aid);
            C735840Sti c735840Sti2 = C735840Sti.LIZ;
            AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
            if (abstractC1387200mCcLIZIZ != null) {
                activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ();
            } else {
                activityLIZIZ = null;
            }
            c735840Sti2.getClass();
            c0lab.LJ("enter_position", C0SUC.LIZ(activityLIZIZ).getExtra().get("enter_position"));
            c0lab.LJ("exit_effect", "no_effect");
            String str6 = "1";
            if (zQd2) {
                str2 = "1";
            } else {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            c0lab.LJ("is_load_more_triggered_inside", str2);
            if (zHe1) {
                str3 = "1";
            } else {
                str3 = CardStruct.IStatusCode.DEFAULT;
            }
            c0lab.LJ("is_load_more_triggered", str3);
            if (!zM82) {
                str6 = CardStruct.IStatusCode.DEFAULT;
            }
            c0lab.LJ("has_more_data", str6);
            c0lab.LIZ(size, "consume_user_list_count");
            c0lab.LJ("request_id", requestId);
            C20684815ws.LJIILLIIL(str5, c0lab.LIZ);
        }
        if (Intrinsics.LJFF(this.LLJJL.getFrom(), "STORY_ENTRANCE_HIGHLIGHTS")) {
            C06US c06us = C06US.LIZ;
            String str7 = this.LLJJL.getExtra().get("enter_position");
            if (str7 != null) {
                str4 = str7;
            }
            c06us.getClass();
            C0LAB c0lab2 = new C0LAB();
            c0lab2.LJ("enter_from", "story_highlight");
            c0lab2.LJ("enter_method", str4);
            c0lab2.LJ("flow_type", "highlight");
            C20684815ws.LJIILLIIL("ttsocial_story_immersive_flow_exit", c0lab2.LIZ);
        }
        IStoryFeedUserDataAbility iStoryFeedUserDataAbility5 = (IStoryFeedUserDataAbility) this.LLLJL.getValue();
        if (iStoryFeedUserDataAbility5 != null) {
            iStoryFeedUserDataAbility5.fm2(false);
        }
        if (this.LLJJL.getEnableStoryVideoCoverTransition()) {
            i2 = 11;
        }
        super.yF(i2, str);
    }

    @Override // com.ss.android.ugc.aweme.detail.platform.DetailPageComponent, com.ss.android.ugc.aweme.detail.platform.IDetailLifecycleAbility
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        String strLLFF;
        FragmentManager supportFragmentManager;
        if (((Number) C263990AWf.LIZ.getValue()).intValue() == 1) {
            Fragment fragment = getFragment();
            C19EG activity = null;
            if (fragment != null) {
                activity = fragment.getActivity();
            }
            if ((activity instanceof C19EG) && activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null) {
                supportFragmentManager.LJZL((AbstractC813200VvC) this.LLLLII.getValue(), true);
            }
        }
        C0ROW c0rowLJJ = C1618440sDa.LIZIZ.LJJ();
        String strLIZIZ = C710330Rtf.LIZIZ();
        C19EG activity2 = getActivity();
        Fragment fragment2 = getFragment();
        if (C281260B0q.LIZ()) {
            i = R.layout.bln;
        } else {
            i = R.layout.blm;
        }
        View viewLIZJ = c0rowLJJ.LIZJ(strLIZIZ, activity2, fragment2, i, layoutInflater, viewGroup, false, false);
        C0T45 c0t45LJIIIIZZ = C19252910Tv.LIZIZ.LIZLLL().LJIIIIZZ();
        DetailFragmentPanel detailFragmentPanel = this.LLJL;
        if (detailFragmentPanel == null || (strLLFF = detailFragmentPanel.LLFF()) == null) {
            strLLFF = "";
        }
        Fragment fragment3 = (Fragment) this.LLLJIL.getValue();
        c0t45LJIIIIZZ.getClass();
        InterfaceC752360TfG interfaceC752360TfGLIZ = SplitContainerManager.LIZ(strLLFF, fragment3, viewLIZJ, false);
        this.LLLF = interfaceC752360TfGLIZ;
        View viewLJ = interfaceC752360TfGLIZ.LJ();
        if (viewLJ != null) {
            return viewLJ;
        }
        return viewLIZJ;
    }
}
