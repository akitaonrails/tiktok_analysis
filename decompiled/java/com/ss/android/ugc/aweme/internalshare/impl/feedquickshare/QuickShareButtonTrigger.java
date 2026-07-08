package com.ss.android.ugc.aweme.internalshare.impl.feedquickshare;

import X.AbstractC848400XPy;
import X.C01GW;
import X.C0QSJ;
import X.C0XQ7;
import X.C1004200cEs;
import X.C1004210cEt;
import X.C1004220cEu;
import X.C1004470cFJ;
import X.C1004480cFK;
import X.C1004550cFR;
import X.C1004770cFn;
import X.C1230620i84;
import X.C1336205Ku;
import X.C1357710lR3;
import X.C1357720lR4;
import X.C1357730lR5;
import X.C1357740lR6;
import X.C1357750lR7;
import X.C13IQ;
import X.C13LE;
import X.C1558520qew;
import X.C1720006oQ;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452501pT;
import X.C673150Qan;
import X.C687700QyG;
import X.C688590Qzh;
import X.C694180RKu;
import X.C699500RcC;
import X.C700450Rdj;
import X.C702420Rgu;
import X.C724270Sb3;
import X.C729510SjV;
import X.C735280Sso;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C786410Ut5;
import X.InterfaceC1146704e9;
import X.InterfaceC1554640qYg;
import X.InterfaceC494301wD;
import X.InterfaceC687730QyJ;
import X.InterfaceC699970Rcx;
import X.InterfaceC700000Rd0;
import X.InterfaceC701260Rf2;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.base.share.QuickShareAIInfo;
import com.ss.android.ugc.aweme.feed.adapter.VideoEventDispatchViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.assem.unreadshare.HideComponentForQuickShareAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent;
import com.ss.android.ugc.feed.platform.container.info.button.FeedBottomButtonAbility;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityAbility;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class QuickShareButtonTrigger extends BaseCellTriggerComponent<QuickShareButtonTrigger> implements PriorityProtocol, UpdateContentionAbility, HideComponentForQuickShareAbility, InterfaceC699970Rcx, InterfaceC1554640qYg, C0QSJ, InterfaceC1146704e9 {
    public final /* synthetic */ C702420Rgu LLJJLIIIJLLLLLLLZ = new C702420Rgu();
    public final C01GW LLJL = C452501pT.LIZIZ(new C1357720lR4(this));
    public final C01GW LLJLIL = C452501pT.LIZIZ(new C1357710lR3(this));
    public final C01GW LLJLILLLLZIIL = C737910Sx3.LIZJ(this, C13LE.LIZ(QuickShareVM.class), new C1357750lR7());
    public final C01GW LLJLL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoEventDispatchViewModel.class), new C1357730lR5());
    public final C01GW LLJLLIL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), new C1357740lR6());

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol, com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String H3() {
        return "bottom_button_quick_share";
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final C700450Rdj Ke1() {
        return null;
    }

    @Override // X.C0RJM
    public final boolean Kj() {
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final boolean YZ() {
        return false;
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{QuickShareVSCope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(QuickShareVSCope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(QuickShareVSCope.class);
        return arrayList;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final C13IQ<QuickShareButtonAssem> getType() {
        return C13LE.LIZ(QuickShareButtonAssem.class);
    }

    @Override // X.InterfaceC699970Rcx
    public final boolean l5(boolean z) {
        return this.LLJJLIIIJLLLLLLLZ.l5(z);
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final boolean lk2() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode == -1891552453 || iHashCode == 1554703794) {
            return this;
        }
        return null;
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

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final String zg() {
        return "bottom_button_quick_share";
    }

    @Override // com.ss.android.ugc.aweme.internalshare.impl.feedquickshare.UpdateContentionAbility
    public final void C4() {
        PriorityAbility priorityAbility = (PriorityAbility) this.LLJL.getValue();
        if (priorityAbility != null) {
            priorityAbility.nw0(this, true);
        }
        FeedBottomButtonAbility feedBottomButtonAbility = (FeedBottomButtonAbility) this.LLJLIL.getValue();
        if (feedBottomButtonAbility != null) {
            feedBottomButtonAbility.Ds2();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.unreadshare.HideComponentForQuickShareAbility
    public final void LJJJJIZL() {
        C1720006oQ.LJ("QuickShareTrigger", "hideComponent");
        C1004550cFR c1004550cFR = C1004550cFR.LIZIZ;
        C724270Sb3 c724270Sb3 = this.LLJI;
        Aweme aweme = ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme();
        c1004550cFR.getClass();
        C1004480cFK c1004480cFKLIZ = C1004550cFR.LIZ(aweme);
        C1004770cFn c1004770cFn = C1004770cFn.LIZ;
        C724270Sb3 c724270Sb32 = this.LLJI;
        Aweme aweme2 = ((VideoItemParams) (c724270Sb32 != null ? c724270Sb32.LL : null)).getAweme();
        String aid = aweme2 != null ? aweme2.getAid() : null;
        C724270Sb3 c724270Sb33 = this.LLJI;
        Aweme aweme3 = ((VideoItemParams) (c724270Sb33 != null ? c724270Sb33.LL : null)).getAweme();
        String authorUid = aweme3 != null ? AwemeExtKt.getAuthorUid(aweme3) : null;
        C724270Sb3 c724270Sb34 = this.LLJI;
        String str = ((VideoItemParams) (c724270Sb34 != null ? c724270Sb34.LL : null)).mEventType;
        Boolean bool = c1004480cFKLIZ != null ? c1004480cFKLIZ.LJFF : null;
        c1004770cFn.getClass();
        C1004770cFn.LIZIZ(false, aid, authorUid, true, str, null, null, null, null, null, bool, null);
    }

    @Override // X.InterfaceC699970Rcx
    public final boolean Nm() {
        return this.LLJJLIIIJLLLLLLLZ.LL;
    }

    @Override // com.ss.android.ugc.aweme.internalshare.impl.feedquickshare.UpdateContentionAbility
    public final void hl2() {
        PriorityAbility priorityAbility = (PriorityAbility) this.LLJL.getValue();
        if (priorityAbility != null) {
            priorityAbility.nw0(this, false);
        }
        FeedBottomButtonAbility feedBottomButtonAbility = (FeedBottomButtonAbility) this.LLJLIL.getValue();
        if (feedBottomButtonAbility != null) {
            feedBottomButtonAbility.Ds2();
        }
    }

    @Override // X.C0RJL
    public final boolean oh() {
        C1004550cFR c1004550cFR = C1004550cFR.LIZIZ;
        C724270Sb3 c724270Sb3 = this.LLJI;
        String aid = ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme().getAid();
        c1004550cFR.getClass();
        return !C1004550cFR.LIZIZ(aid);
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final C699500RcC II() {
        C688590Qzh.LIZLLL(this);
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String LLLII() {
        return C694180RKu.LIZ(this);
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final View Vt() {
        return LJJIJL();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final InterfaceC701260Rf2 vk() {
        C688590Qzh.LIZJ(this);
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final InterfaceC700000Rd0 wb1() {
        C688590Qzh.LIZIZ(this);
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol, com.ss.android.ugc.feed.platform.componentmanager.FcpComponentProtocol
    public final View xb() {
        return Vt();
    }

    @Override // com.ss.android.ugc.aweme.internalshare.impl.feedquickshare.UpdateContentionAbility
    public final boolean h2(VideoItemParams videoItemParams) {
        return up(videoItemParams);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final boolean ip(BaseFeedPageParams baseFeedPageParams) {
        boolean zLJFF = Intrinsics.LJFF("homepage_hot", baseFeedPageParams.eventType);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("bind QuickShareButtonTrigger enableAssemble ");
        sbLIZ.append(zLJFF);
        C1720006oQ.LJ("QuickShareTrigger", C2188811AlT.LIZIZ(sbLIZ));
        return zLJFF;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C1720006oQ.LJ("QuickShareTrigger", "QuickShareButtonTrigger onViewCreated");
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJLLIL.getValue(), new C2217381BqS() { // from class: X.0cEv
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLILZ;
            }
        }, null, new C1004220cEu(), 6);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(Object obj) {
        up((VideoItemParams) obj);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    /* JADX INFO: renamed from: sp */
    public final void up(VideoItemParams videoItemParams) {
        tp(videoItemParams);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("bind aid=");
        sbLIZ.append(videoItemParams.getAweme().getAid());
        C1720006oQ.LJ("QuickShareTrigger", C2188811AlT.LIZIZ(sbLIZ));
        C786410Ut5.LJLLLLLL(8, LJJIJL());
        if (lp(videoItemParams)) {
            C1720006oQ.LJ("QuickShareTrigger", "bind and tryContention");
            PriorityAbility priorityAbility = (PriorityAbility) this.LLJL.getValue();
            if (priorityAbility != null) {
                priorityAbility.Vx0(this, new C1004200cEs(this, videoItemParams), new C1004210cEt(this, videoItemParams));
            }
        } else {
            C1004550cFR c1004550cFR = C1004550cFR.LIZIZ;
            Aweme aweme = videoItemParams.getAweme();
            c1004550cFR.getClass();
            C1004480cFK c1004480cFKLIZ = C1004550cFR.LIZ(aweme);
            if (c1004480cFKLIZ != null && Intrinsics.LJFF(c1004480cFKLIZ.LIZLLL, Boolean.FALSE)) {
                C1004470cFJ.LIZ(false, videoItemParams.getAweme(), videoItemParams.mEventType, "", null, c1004480cFKLIZ, C1004550cFR.LJIIL, false, null);
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("tryContention but not trigger aid =");
            sbLIZ2.append(videoItemParams.getAweme().getAid());
            C1720006oQ.LJ("QuickShareTrigger", C2188811AlT.LIZIZ(sbLIZ2));
        }
        C1720006oQ.LJ("QuickShareTrigger", "bind end " + videoItemParams.getAweme().getAid());
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final boolean up(VideoItemParams videoItemParams) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean zLJFF;
        boolean z4;
        AwemeStatus statusSafety;
        boolean zLIZ = ((AccountUserService) C0XQ7.LJFF()).LIZ();
        boolean zIsLogin = ((AbstractC848400XPy) C0XQ7.LJFF()).isLogin();
        boolean zLIZJ = C1336205Ku.LIZJ().LIZJ();
        boolean zIsAd = videoItemParams.getAweme().isAd();
        if (videoItemParams.getAweme().isAd() && (statusSafety = AwemeExtKt.getStatusSafety(videoItemParams.getAweme())) != null && !statusSafety.isAllowShare()) {
            z = true;
        } else {
            z = false;
        }
        C735280Sso c735280Sso = C735280Sso.LIZ;
        Aweme aweme = videoItemParams.getAweme();
        c735280Sso.getClass();
        boolean zLJFF2 = C735280Sso.LJFF(aweme);
        boolean zLJJI = C729510SjV.LJJI(videoItemParams.getAweme());
        boolean zIsScheduleVideo = AwemeExtKt.isScheduleVideo(videoItemParams.getAweme());
        if (videoItemParams.getAweme().isPaidContent) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!zLIZ && zIsLogin && !zLIZJ && !zIsAd && !z && !zLJFF2 && !zLJJI && !zIsScheduleVideo && !z2) {
            z3 = true;
        } else {
            z3 = false;
        }
        QuickShareAIInfo quickShareAIInfo = videoItemParams.getAweme().getQuickShareAIInfo();
        if (quickShareAIInfo != null) {
            zLJFF = Intrinsics.LJFF(quickShareAIInfo.enableShow, Boolean.TRUE);
        } else {
            zLJFF = false;
        }
        C1004550cFR.LIZIZ.getClass();
        boolean z5 = C1004550cFR.LJIIJJI;
        String aid = videoItemParams.getAweme().getAid();
        if (aid == null) {
            aid = "";
        }
        if (C1230620i84.LIZ(aid) != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        C1720006oQ.LJ("QuickShareTrigger", "aid=" + videoItemParams.getAweme().getAid() + " commonTrigger=" + z3 + " aiTrigger=" + zLJFF + " pitayaTrigger " + z5 + " isThisAwemeShowJoinGroupButton:" + z4);
        if (z3 && zLJFF && z5 && !z4) {
            return true;
        }
        return false;
    }
}
