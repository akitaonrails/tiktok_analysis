package com.ss.android.ugc.aweme.ad.feed.bottombar;

import X.C03H5;
import X.C13IQ;
import X.C13LE;
import X.C688590Qzh;
import X.C694180RKu;
import X.C699500RcC;
import X.C700450Rdj;
import X.InterfaceC700000Rd0;
import X.InterfaceC701260Rf2;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent;
import com.ss.android.ugc.feed.platform.container.protocol.priority.BottomBarPriorityProtocol;

/* JADX INFO: loaded from: classes12.dex */
public final class BottomBannerUnderWaterTrigger extends BaseCellTriggerComponent<BottomBannerUnderWaterTrigger> implements BottomBarPriorityProtocol {
    @Override // com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol, com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String H3() {
        return "bottom_banner_under_water";
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC691660RBc
    public final void J1(int i, Aweme aweme) {
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
        return C13LE.LIZ(UnderWaterBottomBannerAssem.class);
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
        return "bottom_banner_under_water";
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

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(Object obj) {
        tp((VideoItemParams) obj);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    /* JADX INFO: renamed from: sp */
    public final void up(VideoItemParams videoItemParams) {
        tp(videoItemParams);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x005c  */
    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellTriggerComponent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean up(com.ss.android.ugc.aweme.feed.model.VideoItemParams r6) {
        /*
            r5 = this;
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r6.getAweme()
            X.0RQ7 r0 = X.C0RQ7.ANOLE_INTERACTIVE_BOTTOM_BANNER_UNDER_WATER_SLOT
            java.lang.String r1 = r0.getSlotName()
            boolean r0 = kotlin.text.a0.LJJJIL(r1)
            r3 = 0
            if (r0 != 0) goto L5f
            java.util.List r0 = X.C693790RJh.LIZIZ(r4)
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L5f
            r2 = 0
            if (r4 == 0) goto L5c
            com.ss.android.ugc.aweme.commerce.AwemeCommerceStruct r0 = r4.getCommerceVideoAuthInfo()
            if (r0 == 0) goto L60
            com.ss.android.ugc.aweme.commerce.model.UnderWaterInfo r0 = r0.getUnderWaterInfo()
            if (r0 == 0) goto L60
            java.lang.String r1 = r0.getUnderWater()
        L2e:
            com.ss.android.ugc.aweme.commerce.AwemeCommerceStruct r0 = r4.getCommerceVideoAuthInfo()
            if (r0 == 0) goto L3e
            com.ss.android.ugc.aweme.commerce.model.UnderWaterInfo r0 = r0.getUnderWaterInfo()
            if (r0 == 0) goto L3e
            java.util.Map r2 = r0.getProfileVideoUnderWaterStatusMap()
        L3e:
            if (r1 == 0) goto L5c
            int r0 = r1.length()
            if (r0 == 0) goto L5c
            if (r2 == 0) goto L5c
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L5c
            java.lang.Object r0 = r2.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L5c
            int r0 = r0.length()
            if (r0 != 0) goto L5d
        L5c:
            r3 = 1
        L5d:
            r3 = r3 ^ 1
        L5f:
            return r3
        L60:
            r1 = r2
            if (r4 == 0) goto L3e
            goto L2e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ad.feed.bottombar.BottomBannerUnderWaterTrigger.up(com.ss.android.ugc.aweme.feed.model.VideoItemParams):boolean");
    }
}
