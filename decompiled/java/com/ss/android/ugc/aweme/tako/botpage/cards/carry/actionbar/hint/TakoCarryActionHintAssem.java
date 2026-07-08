package com.ss.android.ugc.aweme.tako.botpage.cards.carry.actionbar.hint;

import X.C1558520qew;
import X.C1857330yQt;
import X.C1857750yRZ;
import X.InterfaceC1587906Jp;
import X.InterfaceC712990Rxx;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import com.ss.android.ugc.aweme.tako.ui.TakoChatUIAbility;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoCarryActionHintAssem extends ReusedUISlotAssem<TakoCarryActionHintAssem> implements InterfaceC712990Rxx<C1857330yQt> {
    public TuxTextView LLJJLIIIJLLLLLLLZ;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.fmm;
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
        this.LLJJLIIIJLLLLLLLZ = (TuxTextView) view.findViewById(R.id.omg);
        View viewFindViewById = view.findViewById(R.id.m_n);
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
    public final void up(C1857330yQt c1857330yQt) {
        C1857330yQt c1857330yQt2 = c1857330yQt;
        TuxTextView tuxTextView = this.LLJJLIIIJLLLLLLLZ;
        if (tuxTextView != null) {
            tuxTextView.setText(c1857330yQt2.LLJJIJI);
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C1857330yQt c1857330yQt) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C1857330yQt c1857330yQt) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
