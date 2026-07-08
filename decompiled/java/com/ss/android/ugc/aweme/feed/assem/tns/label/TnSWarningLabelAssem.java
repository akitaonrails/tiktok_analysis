package com.ss.android.ugc.aweme.feed.assem.tns.label;

import X.C01GW;
import X.C0RQL;
import X.C452501pT;
import X.C694180RKu;
import X.C699500RcC;
import X.C700450Rdj;
import X.EnumC707150RoX;
import X.InterfaceC700000Rd0;
import X.InterfaceC701260Rf2;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS625S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public class TnSWarningLabelAssem extends BaseCellSlotComponent<TnSWarningLabelAssem> implements ComponentPriorityProtocol {
    public VideoItemParams LLJLLL;
    public final C01GW LLJLLIL = C452501pT.LIZIZ(new C0RQL(this));
    public EnumC707150RoX LLJZ = EnumC707150RoX.NONE;

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final void Bh2(boolean z) {
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String H3() {
        return "left_container_warning";
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final C699500RcC II() {
        return null;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.bb1;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final boolean PT1() {
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final boolean Qm0() {
        return false;
    }

    @Override // X.C0RJL
    public final boolean oh() {
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final InterfaceC701260Rf2 vk() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final InterfaceC700000Rd0 wb1() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final C700450Rdj vN0() {
        if (this.LLJZ == EnumC707150RoX.DATE_LOCATION) {
            return new C700450Rdj(new AwS625S0100000_11(this, 14), new AwS625S0100000_11(this, 15), null, 4);
        }
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String LLLII() {
        return C694180RKu.LIZ(this);
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpComponentProtocol
    public final View xb() {
        return LJJIJL();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a8  */
    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void up(com.ss.android.ugc.aweme.feed.model.VideoItemParams r7) {
        /*
            r6 = this;
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r7 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r7
            r6.LLJLLL = r7
            com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams r4 = r7.baseFeedPageParams
            r2 = 1
            r1 = 0
            r3 = 0
            if (r4 == 0) goto L7e
            int r0 = com.ss.android.ugc.aweme.feed.assem.bubblelist.BubbleListAssem.LLLI
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.getAweme()
            boolean r0 = X.C0ROI.LIZIZ(r4, r0, r1)
            if (r0 != r2) goto L7e
            X.0RoX r5 = X.EnumC707150RoX.NONE
        L19:
            r6.LLJZ = r5
            X.0RoX r0 = X.EnumC707150RoX.NONE
            if (r5 == r0) goto Lac
            android.view.View r1 = r6.getContentView()
            boolean r0 = r1 instanceof android.view.ViewGroup
            if (r0 == 0) goto L2e
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            if (r1 == 0) goto L2e
            X.C786410Ut5.LJJJJI(r1)
        L2e:
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.tiktok.tuc.service.ITUCBizService> r0 = com.ss.android.ugc.tiktok.tuc.service.ITUCBizService.class
            java.lang.Object r4 = r1.getService(r0)
            com.ss.android.ugc.tiktok.tuc.service.ITUCBizService r4 = (com.ss.android.ugc.tiktok.tuc.service.ITUCBizService) r4
            android.view.View r0 = r6.getContentView()
            android.content.Context r2 = r0.getContext()
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r7.getAweme()
            java.lang.String r0 = r7.mEventType
            X.0SVm r2 = r4.LJIIJ(r2, r5, r1, r0)
            X.0SVk r1 = X.C722420SVk.LIZ
            android.view.View r0 = r6.getContentView()
            X.C722420SVk.LIZ(r1, r2, r0)
            android.view.View r2 = r6.getContentView()
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            r0 = -2
            r1.height = r0
            r0 = -1
            r1.width = r0
            X.C786410Ut5.W5(r2, r1)
            X.C786410Ut5.LJLLLLLL(r3, r2)
            X.01GW r0 = r6.LLJLLIL
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.feed.platform.cell.interact.InteractAreaCommonAbility r0 = (com.ss.android.ugc.feed.platform.cell.interact.InteractAreaCommonAbility) r0
            if (r0 == 0) goto L76
            r0.zB1(r6)
        L76:
            android.view.View r0 = r6.LJJIJL()
            X.C786410Ut5.LJLLLLLL(r3, r0)
            return
        L7e:
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r7.getAweme()
            if (r1 == 0) goto La8
            boolean r0 = X.C660360PvG.LIZ(r1)
            if (r0 != r2) goto L8d
            X.0RoX r5 = X.EnumC707150RoX.RISK
            goto L19
        L8d:
            X.0Rqj r0 = com.ss.android.ugc.aweme.ogc.declaration.IDeclarationService.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.ogc.declaration.IDeclarationService r0 = X.C708510Rqj.LIZ()
            if (r0 == 0) goto La8
            X.0SUb r0 = r0.getConsumer()
            if (r0 == 0) goto La8
            boolean r0 = X.C722070SUb.LIZLLL(r1)
            if (r0 != r2) goto La8
            X.0RoX r5 = X.EnumC707150RoX.DATE_LOCATION
            goto L19
        La8:
            X.0RoX r5 = X.EnumC707150RoX.NONE
            goto L19
        Lac:
            android.view.View r1 = r6.LJJIJL()
            r0 = 8
            X.C786410Ut5.LJLLLLLL(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.assem.tns.label.TnSWarningLabelAssem.up(java.lang.Object):void");
    }
}
