package com.ss.android.ugc.aweme.tako.multiconversation;

import X.C1308910kAL;
import X.C1863460yam;
import X.C419910GdJ;
import X.C786410Ut5;
import X.InterfaceC1587906Jp;
import X.InterfaceC712990Rxx;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.List;
import wh6.AbS709S0100000_30;

/* JADX INFO: loaded from: classes31.dex */
public final class TakoSubConversationGroupItemAssem extends ReusedUISlotAssem<TakoSubConversationGroupItemAssem> implements InterfaceC712990Rxx<C1863460yam> {
    public C1863460yam LLJJLIIIJLLLLLLLZ;
    public View LLJL;
    public TuxTextView LLJLIL;
    public TuxIconView LLJLILLLLZIIL;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.fnk;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        this.LLJLIL = (TuxTextView) view.findViewById(R.id.wdz);
        this.LLJLILLLLZIIL = (TuxIconView) view.findViewById(R.id.wdy);
        this.LLJL = view;
        C786410Ut5.I7(new AbS709S0100000_30(this, 0), view);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C1863460yam c1863460yam) {
        C1863460yam c1863460yam2 = c1863460yam;
        this.LLJJLIIIJLLLLLLLZ = c1863460yam2;
        TuxTextView tuxTextView = this.LLJLIL;
        if (tuxTextView != null) {
            tuxTextView.setText(c1863460yam2.LL);
        }
        TuxIconView tuxIconView = this.LLJLILLLLZIIL;
        if (tuxIconView != null) {
            if (c1863460yam2.LLILLL) {
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = R.raw.icon_chevron_up_fill;
                c419910GdJ.LJ = Integer.valueOf(R.attr.a1k);
                c419910GdJ.LIZLLL = C1308910kAL.LIZJ(R.attr.a1k, tuxIconView.getContext());
                tuxIconView.setTuxIcon(c419910GdJ);
                return;
            }
            C419910GdJ c419910GdJ2 = new C419910GdJ();
            c419910GdJ2.LIZ = R.raw.icon_chevron_down_fill;
            c419910GdJ2.LJ = Integer.valueOf(R.attr.a1k);
            c419910GdJ2.LIZLLL = C1308910kAL.LIZJ(R.attr.a1k, tuxIconView.getContext());
            tuxIconView.setTuxIcon(c419910GdJ2);
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C1863460yam c1863460yam) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C1863460yam c1863460yam) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
