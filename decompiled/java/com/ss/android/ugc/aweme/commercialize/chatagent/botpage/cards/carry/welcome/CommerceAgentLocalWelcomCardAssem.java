package com.ss.android.ugc.aweme.commercialize.chatagent.botpage.cards.carry.welcome;

import X.C00X4;
import X.C786410Ut5;
import X.InterfaceC1587906Jp;
import X.InterfaceC712990Rxx;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class CommerceAgentLocalWelcomCardAssem extends ReusedUISlotAssem<CommerceAgentLocalWelcomCardAssem> implements InterfaceC712990Rxx<C00X4> {
    public TuxTextView LLJJLIIIJLLLLLLLZ;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.ak4;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        this.LLJJLIIIJLLLLLLLZ = (TuxTextView) view.findViewById(R.id.ewp);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C00X4 c00x4) {
        C00X4 c00x42 = c00x4;
        TuxTextView tuxTextView = this.LLJJLIIIJLLLLLLLZ;
        TuxTextView tuxTextView2 = null;
        if (tuxTextView == null) {
            tuxTextView = null;
        }
        tuxTextView.setText(c00x42.LL);
        TuxTextView tuxTextView3 = this.LLJJLIIIJLLLLLLLZ;
        if (tuxTextView3 != null) {
            tuxTextView2 = tuxTextView3;
        }
        C786410Ut5.LLLLZLL(tuxTextView2, 0);
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C00X4 c00x4) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C00X4 c00x4) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
