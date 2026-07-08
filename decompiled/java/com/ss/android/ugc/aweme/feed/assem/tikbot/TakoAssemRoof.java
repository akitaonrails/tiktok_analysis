package com.ss.android.ugc.aweme.feed.assem.tikbot;

import X.C01GW;
import X.C452501pT;
import X.C694180RKu;
import X.C699500RcC;
import X.C700450Rdj;
import X.C708910RrN;
import X.C786410Ut5;
import X.InterfaceC700000Rd0;
import X.InterfaceC701260Rf2;
import android.view.View;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaCommonAbility;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS553S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class TakoAssemRoof extends BaseCellSlotComponent<TakoAssemRoof> implements ComponentPriorityProtocol {
    public TuxIconView LLJLLIL;
    public final C01GW LLJLLL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 132));

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final void Bh2(boolean z) {
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String H3() {
        return "right_container_chat_gpt_roof";
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final C699500RcC II() {
        return null;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.b9m;
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
        C708910RrN c708910RrN;
        super.onViewCreated(view);
        this.LLJLLIL = (TuxIconView) view.findViewById(R.id.xve);
        View viewLJJIJL = LJJIJL();
        if (viewLJJIJL instanceof C708910RrN) {
            c708910RrN = (C708910RrN) viewLJJIJL;
        } else {
            c708910RrN = null;
        }
        if (c708910RrN != null) {
            c708910RrN.setGroupClickable(false);
        }
        C786410Ut5.I7(null, LJJIJL());
        LJJIJL().setClickable(false);
        TuxIconView tuxIconView = this.LLJLLIL;
        if (tuxIconView != null) {
            C786410Ut5.x5(tuxIconView, 0.0f);
        }
        TuxIconView tuxIconView2 = this.LLJLLIL;
        if (tuxIconView2 != null) {
            C786410Ut5.a9(tuxIconView2, null);
        }
        TuxIconView tuxIconView3 = this.LLJLLIL;
        if (tuxIconView3 != null) {
            tuxIconView3.setClickable(false);
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        InteractAreaCommonAbility interactAreaCommonAbility = (InteractAreaCommonAbility) this.LLJLLL.getValue();
        if (interactAreaCommonAbility != null) {
            interactAreaCommonAbility.zB1(this);
        }
    }
}
