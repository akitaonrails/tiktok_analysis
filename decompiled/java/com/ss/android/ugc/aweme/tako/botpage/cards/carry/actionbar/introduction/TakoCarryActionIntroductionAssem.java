package com.ss.android.ugc.aweme.tako.botpage.cards.carry.actionbar.introduction;

import X.C07ID;
import X.C0HZQ;
import X.C0R32;
import X.C14J2;
import X.C1558520qew;
import X.C1857750yRZ;
import X.C1918907fP;
import X.C426750GoL;
import X.C427660Gpo;
import X.C723830SaL;
import X.InterfaceC1860810yWV;
import android.view.View;
import com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import com.ss.android.ugc.aweme.tako.ui.TakoChatUIAbility;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS606S0100000_27;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoCarryActionIntroductionAssem extends TakoAnswerBaseAssem<C0R32> {
    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.fmn;
    }

    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.TakoBaseAssem
    public final C0HZQ Bp() {
        return (C0HZQ) LJJIJL().findViewById(R.id.umx);
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem
    public final InterfaceC1860810yWV Tp() {
        return (C14J2) LJJIJL().findViewById(R.id.ety);
    }

    @Override // com.ss.android.ugc.aweme.tako.arch.protocol.TakoBaseAssem
    public final C427660Gpo sp() {
        return (C427660Gpo) LJJIJL().findViewById(R.id.bh2);
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem, com.ss.android.ugc.aweme.tako.arch.protocol.TakoBaseAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        boolean z;
        super.onViewCreated(view);
        ITakoContextAbility iTakoContextAbility = (ITakoContextAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ITakoContextAbility.class, null);
        boolean z2 = true;
        if (iTakoContextAbility != null && iTakoContextAbility.T91()) {
            z = true;
        } else {
            z = false;
        }
        TakoChatUIAbility takoChatUIAbility = (TakoChatUIAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), TakoChatUIAbility.class, null);
        if (takoChatUIAbility == null || !takoChatUIAbility.Gx1()) {
            z2 = false;
        }
        C1857750yRZ.LJIIIZ(view.findViewById(R.id.iah), z, z2);
        if (C07ID.LIZ() && (z || z2)) {
            C426750GoL.LJIIIZ(view.findViewById(R.id.eth), Integer.valueOf(C1918907fP.LIZ()), null, Integer.valueOf(C1918907fP.LIZ()), null, false, 26);
        }
        C723830SaL.LIZ(this, null, new AwS606S0100000_27(this, 225));
    }
}
