package com.ss.android.ugc.aweme.feed.assem.quickcomment;

import X.C01GW;
import X.C0QSJ;
import X.C1351250lGd;
import X.C1351260lGe;
import X.C1351290lGh;
import X.C1351360lGo;
import X.C1351370lGp;
import X.C13IQ;
import X.C13LE;
import X.C1558520qew;
import X.C288950BUf;
import X.C294360BgI;
import X.C452501pT;
import X.C673150Qan;
import X.C687700QyG;
import X.C688590Qzh;
import X.C694180RKu;
import X.C699500RcC;
import X.C700450Rdj;
import X.C702420Rgu;
import X.C706160Rmw;
import X.C706170Rmx;
import X.C786410Ut5;
import X.InterfaceC1146704e9;
import X.InterfaceC1554640qYg;
import X.InterfaceC494301wD;
import X.InterfaceC687730QyJ;
import X.InterfaceC699970Rcx;
import X.InterfaceC700000Rd0;
import X.InterfaceC701260Rf2;
import android.view.View;
import com.ss.android.ugc.aweme.experiment.QuickCommentV2Config;
import com.ss.android.ugc.aweme.feed.assem.unreadshare.HideComponentForQuickCommentAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeCommentConfig;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.QuickCommentConfig;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent;
import com.ss.android.ugc.feed.platform.container.info.button.FeedBottomButtonAbility;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityAbility;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS196S1100000_21;
import kotlin.jvm.internal.AwS387S0200000_21;
import kotlin.jvm.internal.AwS600S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public class VideoQuickCommentTrigger extends BaseCellTriggerComponent<VideoQuickCommentTrigger> implements PriorityProtocol, UpdatePendingAbility, HideComponentForQuickCommentAbility, InterfaceC699970Rcx, IVideoQuickCommentAssemHost, InterfaceC1554640qYg, C0QSJ, InterfaceC1146704e9 {
    public final /* synthetic */ C702420Rgu LLJJLIIIJLLLLLLLZ = new C702420Rgu();
    public final /* synthetic */ VideoQuickCommentTriggerAssemHost LLJL = new VideoQuickCommentTriggerAssemHost();
    public final C01GW LLJLIL = C452501pT.LIZIZ(new C706170Rmx(this));
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new C706160Rmw(this));
    public Boolean LLJLL;

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol, com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String H3() {
        return "bottom_button_quick_comment";
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final C700450Rdj Ke1() {
        return null;
    }

    @Override // X.C0RJM
    public final boolean Kj() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.unreadshare.HideComponentForQuickCommentAbility
    public final void LJJJJIZL() {
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final boolean YZ() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.quickcomment.IVideoQuickCommentAssemHost
    public final void Zj1(AwS196S1100000_21 awS196S1100000_21) {
        this.LLJL.Zj1(awS196S1100000_21);
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{VideoQuickCommentScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(VideoQuickCommentScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(VideoQuickCommentScope.class);
        return arrayList;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final C13IQ<VideoQuickCommentAssem> getType() {
        return C13LE.LIZ(VideoQuickCommentAssem.class);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
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
        if (iHashCode == -1812025374 || iHashCode == -1473951557 || iHashCode == -860445529) {
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
        return "bottom_button_quick_comment";
    }

    @Override // X.InterfaceC699970Rcx
    public final boolean Nm() {
        return this.LLJJLIIIJLLLLLLLZ.LL;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void Vo() {
        this.LLJL.LL.LJ();
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a1, code lost:
    
        if (X.C1351250lGd.LJIILL(r1, ((com.ss.android.ugc.aweme.feed.model.VideoItemParams) (r0 != null ? r0.LL : null)).mEventType, false) == false) goto L50;
     */
    @Override // X.C0RJL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean oh() {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.assem.quickcomment.VideoQuickCommentTrigger.oh():boolean");
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC712990Rxx
    public final void unBind() {
        this.LLJL.LL.LJ();
    }

    public final PriorityAbility yp() {
        return (PriorityAbility) this.LLJLIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.quickcomment.UpdatePendingAbility
    public final void C4() {
        PriorityAbility priorityAbilityYp = yp();
        if (priorityAbilityYp != null) {
            priorityAbilityYp.nw0(this, true);
        }
        FeedBottomButtonAbility feedBottomButtonAbility = (FeedBottomButtonAbility) this.LLJLILLLLZIIL.getValue();
        if (feedBottomButtonAbility != null) {
            feedBottomButtonAbility.Ds2();
        }
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

    @Override // com.ss.android.ugc.aweme.feed.assem.quickcomment.UpdatePendingAbility
    public final Boolean Yn0() {
        return this.LLJLL;
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.quickcomment.UpdatePendingAbility
    public final boolean h2(VideoItemParams videoItemParams) {
        return up(videoItemParams);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(Object obj) {
        up((VideoItemParams) obj);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    /* JADX INFO: renamed from: sp */
    public final void up(VideoItemParams videoItemParams) {
        QuickCommentConfig quickCommentConfig;
        Integer num;
        QuickCommentV2Config quickCommentV2ConfigLIZ;
        QuickCommentConfig quickCommentConfig2;
        Integer num2;
        tp(videoItemParams);
        if (lp(videoItemParams)) {
            boolean zLIZJ = C1351290lGh.LIZJ();
            C1351250lGd c1351250lGd = C1351250lGd.LIZ;
            Aweme aweme = videoItemParams.getAweme();
            c1351250lGd.getClass();
            if (C1351250lGd.LJIIZILJ(aweme)) {
                PriorityAbility priorityAbilityYp = yp();
                if (priorityAbilityYp != null) {
                    priorityAbilityYp.Vx0(this, new AwS600S0100000_21(this, 120), new AwS600S0100000_21(this, 121));
                    return;
                }
                return;
            }
            if (C1351250lGd.LJIILIIL(videoItemParams.getAweme(), videoItemParams.mEventType, false) && (!C294360BgI.LIZ() || !C1351250lGd.LJIILL(videoItemParams.getAweme(), videoItemParams.mEventType, false))) {
                if (zLIZJ) {
                    AwemeCommentConfig commentConfig = videoItemParams.getAweme().getCommentConfig();
                    if (commentConfig != null && (quickCommentConfig2 = commentConfig.quickCommentConfig) != null && (num2 = quickCommentConfig2.recLevel) != null && num2.intValue() == 2) {
                        PriorityAbility priorityAbilityYp2 = yp();
                        if (priorityAbilityYp2 == null) {
                            return;
                        }
                        priorityAbilityYp2.Vx0(this, new AwS387S0200000_21(this, videoItemParams, 25), new AwS600S0100000_21(this, 122));
                        return;
                    }
                    AwemeCommentConfig commentConfig2 = videoItemParams.getAweme().getCommentConfig();
                    if (commentConfig2 != null && (quickCommentConfig = commentConfig2.quickCommentConfig) != null && (num = quickCommentConfig.recLevel) != null && num.intValue() == 1 && ((quickCommentV2ConfigLIZ = C1351290lGh.LIZ()) == null || !quickCommentV2ConfigLIZ.enableLikeDecouplingEstimated)) {
                        C786410Ut5.LJLLLLLL(8, LJJIJL());
                        return;
                    }
                }
                PriorityAbility priorityAbilityYp3 = yp();
                if (priorityAbilityYp3 == null) {
                    return;
                }
                priorityAbilityYp3.Vx0(this, new AwS387S0200000_21(this, videoItemParams, 26), new AwS600S0100000_21(this, 123));
                return;
            }
            if (C1351260lGe.LIZLLL(videoItemParams.getAweme(), videoItemParams.mEventType)) {
                PriorityAbility priorityAbilityYp4 = yp();
                if (priorityAbilityYp4 == null) {
                    return;
                }
                priorityAbilityYp4.Vx0(this, new C1351360lGo(this, videoItemParams), new C1351370lGp(this));
                return;
            }
            PriorityAbility priorityAbilityYp5 = yp();
            if (priorityAbilityYp5 == null) {
                return;
            }
            priorityAbilityYp5.Vx0(this, new AwS600S0100000_21(this, 124), new AwS600S0100000_21(this, 119));
            return;
        }
        C786410Ut5.LJLLLLLL(8, LJJIJL());
    }

    /* JADX WARN: Removed duplicated region for block: B:163:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0131  */
    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean up(com.ss.android.ugc.aweme.feed.model.VideoItemParams r23) {
        /*
            Method dump skipped, instruction units count: 1167
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.assem.quickcomment.VideoQuickCommentTrigger.up(com.ss.android.ugc.aweme.feed.model.VideoItemParams):boolean");
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void T6(int i, Aweme aweme) {
        this.LLJLL = null;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public boolean kp(BaseFeedPageParams baseFeedPageParams, int i) {
        if (Intrinsics.LJFF(baseFeedPageParams.eventType, "homepage_hot") && (C288950BUf.LIZ() & 1) == 1) {
            return C1351290lGh.LIZIZ();
        }
        if (Intrinsics.LJFF(baseFeedPageParams.param.getFrom(), "STORY_ENTRANCE_AVATAR")) {
            return false;
        }
        if ((Intrinsics.LJFF(baseFeedPageParams.eventType, "homepage_friends") && (C288950BUf.LIZ() & 4) == 4) || i == 2) {
            return true;
        }
        if (!Intrinsics.LJFF(baseFeedPageParams.eventType, "homepage_hot")) {
            return false;
        }
        if (i == 6) {
            if (baseFeedPageParams.pageType == 0) {
                return true;
            }
        } else if (i == 1) {
            return true;
        }
        return false;
    }
}
