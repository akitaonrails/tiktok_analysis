package com.ss.android.ugc.aweme.tako.botpage.cards.time;

import X.C00XH;
import X.C01GW;
import X.C1558520qew;
import X.C1857750yRZ;
import X.C452501pT;
import X.C786410Ut5;
import X.InterfaceC1587906Jp;
import X.InterfaceC712990Rxx;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.ITakoAIBotUIAbility;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import com.ss.android.ugc.aweme.tako.ui.TakoChatUIAbility;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS571S0100000_27;

/* JADX INFO: loaded from: classes28.dex */
public class TakoMsgTimeAssem extends ReusedUISlotAssem<TakoMsgTimeAssem> implements InterfaceC712990Rxx<C00XH> {
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS571S0100000_27(this, 772));
    public TuxTextView LLJL;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.fna;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        boolean z;
        this.LLJL = (TuxTextView) view.findViewById(R.id.ome);
        View viewFindViewById = view.findViewById(R.id.mct);
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
        C1857750yRZ.LJIIIZ(viewFindViewById, z, z2);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C00XH c00xh) {
        Integer numZH;
        C00XH c00xh2 = c00xh;
        TuxTextView tuxTextView = this.LLJL;
        TuxTextView tuxTextView2 = null;
        if (tuxTextView == null) {
            tuxTextView = null;
        }
        tuxTextView.setText(c00xh2.LL);
        TuxTextView tuxTextView3 = this.LLJL;
        if (tuxTextView3 == null) {
            tuxTextView3 = null;
        }
        C786410Ut5.LLLLZLL(tuxTextView3, 0);
        ITakoAIBotUIAbility iTakoAIBotUIAbility = (ITakoAIBotUIAbility) this.LLJJLIIIJLLLLLLLZ.getValue();
        if (iTakoAIBotUIAbility != null && (numZH = iTakoAIBotUIAbility.zH()) != null) {
            int iIntValue = numZH.intValue();
            TuxTextView tuxTextView4 = this.LLJL;
            if (tuxTextView4 != null) {
                tuxTextView2 = tuxTextView4;
            }
            tuxTextView2.setTextColor(iIntValue);
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C00XH c00xh) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C00XH c00xh) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
