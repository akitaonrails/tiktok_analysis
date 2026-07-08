package com.ss.android.ugc.aweme.tako.botpage.components.interaction;

import X.AnonymousClass1418;
import X.C01GW;
import X.C0DSB;
import X.C13MK;
import X.C1857280yQo;
import X.C1858670yT3;
import X.C1913307eV;
import X.C418440Gaw;
import X.C444960Hcc;
import X.C452501pT;
import X.C814420VxA;
import X.InterfaceC1587906Jp;
import X.InterfaceC1858700yT6;
import X.InterfaceC712990Rxx;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;
import com.ss.android.ugc.aweme.tako.ui.TakoChatUIAbility;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS428S0200000_27;
import kotlin.jvm.internal.AwS571S0100000_27;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoInteractionAssem extends ReusedUISlotAssem<TakoInteractionAssem> implements InterfaceC712990Rxx<InterfaceC1858700yT6> {
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS571S0100000_27(this, 784));
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 785));
    public LinearLayout LLJLIL;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.fkw;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C1857280yQo.LIZJ(view, C444960Hcc.LIZIZ());
        this.LLJLIL = (LinearLayout) view.findViewById(R.id.neh);
        if (C1913307eV.LIZ()) {
            LJJIJL().setPaddingRelative(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), LJJIJL().getPaddingTop(), LJJIJL().getPaddingEnd(), LJJIJL().getPaddingBottom());
        }
        LinearLayout linearLayout = this.LLJLIL;
        if (linearLayout != null) {
            linearLayout.setPaddingRelative(0, linearLayout.getPaddingTop(), linearLayout.getPaddingEnd(), linearLayout.getPaddingBottom());
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(InterfaceC1858700yT6 interfaceC1858700yT6) {
        TakoCardAbility takoCardAbility;
        TakoMixFeed takoMixFeedLJIIIZ;
        Message messageYy1;
        Message messageYy12;
        InterfaceC1858700yT6 interfaceC1858700yT62 = interfaceC1858700yT6;
        TakoChatUIAbility takoChatUIAbility = (TakoChatUIAbility) this.LLJL.getValue();
        if ((takoChatUIAbility == null || !takoChatUIAbility.Gx1()) && ((takoCardAbility = (TakoCardAbility) this.LLJJLIIIJLLLLLLLZ.getValue()) == null || (messageYy12 = takoCardAbility.Yy1()) == null || C1858670yT3.LJI(messageYy12))) {
            TakoCardAbility takoCardAbility2 = (TakoCardAbility) this.LLJJLIIIJLLLLLLLZ.getValue();
            if (takoCardAbility2 != null && (messageYy1 = takoCardAbility2.Yy1()) != null) {
                takoMixFeedLJIIIZ = messageYy1.LJIIIZ();
            } else {
                takoMixFeedLJIIIZ = null;
            }
            if (!AnonymousClass1418.LJFF(takoMixFeedLJIIIZ)) {
                C0DSB.LIZJ(LJJIJL());
                C13MK.LIZLLL(new AwS428S0200000_27(this, interfaceC1858700yT62, 97));
                return;
            }
        }
        C0DSB.LIZIZ(LJJIJL());
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(InterfaceC1858700yT6 interfaceC1858700yT6) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(InterfaceC1858700yT6 interfaceC1858700yT6) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.bytedance.tux.icon.TuxIconView op(com.ss.android.ugc.aweme.tako.ccl.model.api.TakoInteractionConfig r14, android.content.Context r15, int r16) {
        /*
            Method dump skipped, instruction units count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tako.botpage.components.interaction.TakoInteractionAssem.op(com.ss.android.ugc.aweme.tako.ccl.model.api.TakoInteractionConfig, android.content.Context, int):com.bytedance.tux.icon.TuxIconView");
    }
}
