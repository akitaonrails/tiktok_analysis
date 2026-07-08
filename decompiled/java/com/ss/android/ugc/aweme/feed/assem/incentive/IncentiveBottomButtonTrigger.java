package com.ss.android.ugc.aweme.feed.assem.incentive;

import X.C01GW;
import X.C03H5;
import X.C13IQ;
import X.C13LE;
import X.C452501pT;
import X.C688590Qzh;
import X.C694180RKu;
import X.C699500RcC;
import X.C700450Rdj;
import X.C786410Ut5;
import X.InterfaceC700000Rd0;
import X.InterfaceC701260Rf2;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityAbility;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS590S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class IncentiveBottomButtonTrigger extends BaseCellTriggerComponent<IncentiveShareButtonTrigger> implements PriorityProtocol {
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS555S0100000_11(this, 231));

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol, com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String H3() {
        return "bottom_button_ug_incentive_jump_page";
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

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final C13IQ<? extends ReusedUISlotAssem<? extends C03H5>> getType() {
        return C13LE.LIZ(IncentiveBottomButtonAssem.class);
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final boolean lk2() {
        return false;
    }

    @Override // X.C0RJL
    public final boolean oh() {
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol
    public final String zg() {
        return "bottom_button_ug_incentive_jump_page";
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

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    public final boolean ip(BaseFeedPageParams baseFeedPageParams) {
        if (baseFeedPageParams.awemeFromPage == 1) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void tp(Object obj) {
        up((VideoItemParams) obj);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    /* JADX INFO: renamed from: sp */
    public final void up(VideoItemParams videoItemParams) {
        PriorityAbility priorityAbility;
        tp(videoItemParams);
        boolean zUp = up(videoItemParams);
        C786410Ut5.LJLLLLLL(8, LJJIJL());
        if (zUp && (priorityAbility = (PriorityAbility) this.LLJJLIIIJLLLLLLLZ.getValue()) != null) {
            priorityAbility.MJ(this, new AwS590S0100000_11(this, 92));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0041  */
    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean up(com.ss.android.ugc.aweme.feed.model.VideoItemParams r6) {
        /*
            r5 = this;
            X.01GW<X.0zPA> r0 = X.C1894700zPA.LJIJ
            X.0zPA r1 = X.C2178808gE.LIZ()
            r0 = 95
            r1.LJFF(r0)
            java.util.Set<java.lang.String> r0 = X.C710500Rtw.LIZ
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r6.getAweme()
            java.lang.String r0 = r0.getAid()
            com.bytedance.touchpoint.api.model.CommonFeedButton r4 = X.C710500Rtw.LIZ(r0)
            r3 = 0
            if (r4 != 0) goto L1d
            return r3
        L1d:
            int r1 = r6.currentPosition
            int r0 = r4.dismissAfter
            if (r1 >= r0) goto L6b
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r6.getAweme()
            java.lang.String r1 = r0.getAid()
            java.util.Set<java.lang.String> r0 = X.C710500Rtw.LIZ
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L41
            int r2 = r4.showTimes
            X.0zXP r1 = X.C710890RuZ.LIZ
            java.lang.String r0 = "_type_bottom_button"
            int r0 = r1.LIZLLL(r0)
            int r0 = r0 + 1
            if (r0 > r2) goto L6b
        L41:
            java.lang.String r1 = r4.actionType
            java.lang.String r0 = "follow"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L6c
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r6.getAweme()
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getAuthor()
            if (r0 == 0) goto L6b
            int r0 = r0.getFollowStatus()
            if (r0 != 0) goto L6b
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r6.getAweme()
            java.lang.String r1 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.getAuthorUid(r0)
            java.util.Set<java.lang.String> r0 = X.C710500Rtw.LIZIZ
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L6c
        L6b:
            return r3
        L6c:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.assem.incentive.IncentiveBottomButtonTrigger.up(com.ss.android.ugc.aweme.feed.model.VideoItemParams):boolean");
    }
}
