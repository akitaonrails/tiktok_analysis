package com.ss.android.ugc.aweme.mix.platform;

import X.C01GW;
import X.C0RD6;
import X.C1168870gWT;
import X.C452501pT;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.detail.platform.DetailPageComponent;
import com.ss.android.ugc.feed.platform.panel.clean.IFeedCleanAbility;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS562S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class MixVideoDetailPageComponent extends DetailPageComponent {
    public ConstraintLayout LLLJIL;
    public TuxTextView LLLJL;
    public ConstraintLayout LLLL;
    public final C01GW LLLLII = C452501pT.LIZIZ(new AwS562S0100000_18(this, 681));

    @Override // com.ss.android.ugc.aweme.detail.platform.DetailPageComponent
    public final void kp() {
        super.kp();
        IFeedCleanAbility iFeedCleanAbility = this.LLLIIII;
        if (iFeedCleanAbility != null) {
            View viewFindViewById = this.LLLJIL;
            if (viewFindViewById == null) {
                View viewLJJIJL = LJJIJL();
                viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.ohe) : null;
                this.LLLJIL = (ConstraintLayout) viewFindViewById;
            }
            iFeedCleanAbility.Cp0(viewFindViewById);
        }
        IFeedCleanAbility iFeedCleanAbility2 = this.LLLIIII;
        if (iFeedCleanAbility2 != null) {
            View viewFindViewById2 = this.LLLJL;
            if (viewFindViewById2 == null) {
                View viewLJJIJL2 = LJJIJL();
                viewFindViewById2 = viewLJJIJL2 != null ? viewLJJIJL2.findViewById(R.id.bg2) : null;
                this.LLLJL = (TuxTextView) viewFindViewById2;
            }
            iFeedCleanAbility2.Cp0(viewFindViewById2);
        }
        IFeedCleanAbility iFeedCleanAbility3 = this.LLLIIII;
        if (iFeedCleanAbility3 != null) {
            View view = this.LLLL;
            if (view == null) {
                View viewLJJIJL3 = LJJIJL();
                View viewFindViewById3 = viewLJJIJL3 != null ? viewLJJIJL3.findViewById(R.id.quu) : null;
                this.LLLL = (ConstraintLayout) viewFindViewById3;
                view = viewFindViewById3;
            }
            iFeedCleanAbility3.Cp0(view);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.panel.BasePanelUIComponent, X.InterfaceC1565640qqQ
    public final void eventInit(C0RD6 c0rd6) {
        c0rd6.LIZIZ("event_on_playing", new C1168870gWT(this));
    }
}
