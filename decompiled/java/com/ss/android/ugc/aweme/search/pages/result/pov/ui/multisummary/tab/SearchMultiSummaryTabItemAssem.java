package com.ss.android.ugc.aweme.search.pages.result.pov.ui.multisummary.tab;

import X.C01GW;
import X.C371330Eh9;
import X.C451800Hne;
import X.C452501pT;
import X.C786410Ut5;
import X.InterfaceC1587906Jp;
import X.InterfaceC712990Rxx;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import irm.AkS78S0100000_6;
import java.util.List;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class SearchMultiSummaryTabItemAssem extends ReusedUISlotAssem<SearchMultiSummaryTabItemAssem> implements InterfaceC712990Rxx<C451800Hne> {
    public TuxTextView LLJJLIIIJLLLLLLLZ;
    public C371330Eh9 LLJL;
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 595));

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.f06;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        this.LLJJLIIIJLLLLLLLZ = (TuxTextView) view.findViewById(R.id.tv_tab_title);
        this.LLJL = (C371330Eh9) view.findViewById(R.id.l8u);
        TuxTextView tuxTextView = this.LLJJLIIIJLLLLLLLZ;
        if (tuxTextView != null) {
            C786410Ut5.I7(new AkS78S0100000_6(this, 6), tuxTextView);
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C451800Hne c451800Hne) {
        int i;
        int i2;
        C451800Hne c451800Hne2 = c451800Hne;
        TuxTextView tuxTextView = this.LLJJLIIIJLLLLLLLZ;
        if (tuxTextView != null) {
            tuxTextView.setText(c451800Hne2.LL);
        }
        TuxTextView tuxTextView2 = this.LLJJLIIIJLLLLLLLZ;
        if (tuxTextView2 != null) {
            if (c451800Hne2.LLILLJJLI) {
                i2 = R.attr.a1h;
            } else {
                i2 = R.attr.a1k;
            }
            tuxTextView2.setTextColorRes(i2);
        }
        C371330Eh9 c371330Eh9 = this.LLJL;
        if (c371330Eh9 != null) {
            if (c451800Hne2.LLILLJJLI) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, c371330Eh9);
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C451800Hne c451800Hne) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C451800Hne c451800Hne) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
