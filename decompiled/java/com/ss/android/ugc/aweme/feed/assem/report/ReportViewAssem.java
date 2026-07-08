package com.ss.android.ugc.aweme.feed.assem.report;

import X.C01GW;
import X.C0R93;
import X.C0RQ0;
import X.C2175231ABd;
import X.C452501pT;
import X.C694180RKu;
import X.C699500RcC;
import X.C700450Rdj;
import X.C786410Ut5;
import X.InterfaceC700000Rd0;
import X.InterfaceC701260Rf2;
import Y.ACListenerS115S0200000_11;
import android.view.View;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaCommonAbility;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class ReportViewAssem extends BaseCellSlotComponent<ReportViewAssem> implements ComponentPriorityProtocol {
    public FrameLayout LLJLLIL;
    public final C01GW LLJLLL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 240));

    public interface AppDiffProtocol {
        public static final C0RQ0 LIZ = C0RQ0.LIZ;

        public static final class DowngradeInstance implements AppDiffProtocol {
            @Override // com.ss.android.ugc.aweme.feed.assem.report.ReportViewAssem.AppDiffProtocol
            public final void LJIILIIL() {
            }
        }

        void LJIILIIL();
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final void Bh2(boolean z) {
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String H3() {
        return "right_container_report";
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final C699500RcC II() {
        return null;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.b97;
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

    public final FrameLayout Bp() {
        View viewFindViewById = this.LLJLLIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.t84) : null;
            this.LLJLLIL = (FrameLayout) viewFindViewById;
        }
        return (FrameLayout) viewFindViewById;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String LLLII() {
        return C694180RKu.LIZ(this);
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpComponentProtocol
    public final View xb() {
        return LJJIJL();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        VideoItemParams videoItemParams2 = videoItemParams;
        if (C0R93.LIZLLL(videoItemParams2.mEventType)) {
            C2175231ABd.LIZ.getClass();
            if (C2175231ABd.LIZ()) {
                FrameLayout frameLayoutBp = Bp();
                if (frameLayoutBp != null) {
                    C786410Ut5.LJZ(0, frameLayoutBp);
                }
                FrameLayout frameLayoutBp2 = Bp();
                if (frameLayoutBp2 != null) {
                    C786410Ut5.O7(frameLayoutBp2, new ACListenerS115S0200000_11(videoItemParams2, this, 4));
                }
                InteractAreaCommonAbility interactAreaCommonAbility = (InteractAreaCommonAbility) this.LLJLLL.getValue();
                if (interactAreaCommonAbility != null) {
                    interactAreaCommonAbility.zB1(this);
                    return;
                }
                return;
            }
        }
        FrameLayout frameLayoutBp3 = Bp();
        if (frameLayoutBp3 == null) {
            return;
        }
        C786410Ut5.LJZ(4, frameLayoutBp3);
    }
}
