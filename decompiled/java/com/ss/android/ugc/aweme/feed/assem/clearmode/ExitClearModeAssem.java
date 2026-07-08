package com.ss.android.ugc.aweme.feed.assem.clearmode;

import X.C01GW;
import X.C0RHT;
import X.C418440Gaw;
import X.C452501pT;
import X.C694180RKu;
import X.C699500RcC;
import X.C700100RdA;
import X.C700450Rdj;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC700000Rd0;
import X.InterfaceC701260Rf2;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellPlaceHolderComponent;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaCommonAbility;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol;

/* JADX INFO: loaded from: classes12.dex */
public final class ExitClearModeAssem extends BaseCellPlaceHolderComponent implements ComponentPriorityProtocol {
    public final C01GW LLJJL;

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final void Bh2(boolean z) {
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String H3() {
        return "right_container_clear_mode";
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final C699500RcC II() {
        return null;
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

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final C700450Rdj vN0() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final InterfaceC701260Rf2 vk() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final InterfaceC700000Rd0 wb1() {
        return null;
    }

    public ExitClearModeAssem() {
        super("exit_clearmode");
        this.LLJJL = C452501pT.LIZIZ(new C0RHT(this));
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String LLLII() {
        return C694180RKu.LIZ(this);
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpComponentProtocol
    public final View xb() {
        return LJJIJL();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellPlaceHolderComponent
    /* JADX INFO: renamed from: hp */
    public final void up(VideoItemParams videoItemParams) {
        InteractAreaCommonAbility interactAreaCommonAbility = (InteractAreaCommonAbility) this.LLJJL.getValue();
        if (interactAreaCommonAbility != null) {
            interactAreaCommonAbility.zB1(this);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellPlaceHolderComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        LJJIJL().setTag(C700100RdA.LJIIL, Boolean.TRUE);
        if (LJJIJL() instanceof ViewGroup) {
            View viewLJJIJL = LJJIJL();
            ViewGroup.LayoutParams layoutParams = viewLJJIJL.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                int marginStart = marginLayoutParams.getMarginStart();
                int i = marginLayoutParams.topMargin;
                marginLayoutParams.setMarginStart(marginStart);
                marginLayoutParams.topMargin = i;
                marginLayoutParams.setMarginEnd(iLIZIZ);
                marginLayoutParams.bottomMargin = iLIZIZ2;
                C786410Ut5.W5(viewLJJIJL, marginLayoutParams);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellPlaceHolderComponent, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(Object obj) {
        up((VideoItemParams) obj);
    }
}
