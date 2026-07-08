package com.ss.android.ugc.aweme.tako.botpage.cards.disclaimer;

import X.C003L;
import X.C1308910kAL;
import X.C14IJ;
import X.C14J2;
import X.C1857690yRT;
import X.C1859620yUa;
import X.C960203pA;
import X.InterfaceC1587906Jp;
import X.InterfaceC712990Rxx;
import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
public final class TakoDisclaimerAssem extends ReusedUISlotAssem<TakoDisclaimerAssem> implements InterfaceC712990Rxx<C003L> {
    public LinearLayoutCompat LLJJLIIIJLLLLLLLZ;
    public TuxTextView LLJL;
    public TuxTextView LLJLIL;
    public C14J2 LLJLILLLLZIIL;
    public final C14IJ LLJLL = new C14IJ(0);

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.fn7;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        int i;
        LinearLayoutCompat linearLayoutCompat;
        this.LLJL = (TuxTextView) view.findViewById(R.id.fw9);
        this.LLJLIL = (TuxTextView) view.findViewById(R.id.fvl);
        this.LLJLILLLLZIIL = (C14J2) view.findViewById(R.id.ety);
        this.LLJJLIIIJLLLLLLLZ = (LinearLayoutCompat) view.findViewById(R.id.mcp);
        if (C1859620yUa.LIZIZ() && (linearLayoutCompat = this.LLJJLIIIJLLLLLLLZ) != null) {
            linearLayoutCompat.setPadding(linearLayoutCompat.getPaddingStart(), 0, linearLayoutCompat.getPaddingEnd(), 0);
        }
        Context context = getContext();
        if (context != null) {
            if (C960203pA.LIZIZ(context)) {
                i = R.attr.zq;
            } else {
                i = R.attr.c7;
            }
            Integer numLIZJ = C1308910kAL.LIZJ(i, context);
            if (numLIZJ != null) {
                int iIntValue = numLIZJ.intValue();
                C14J2 c14j2 = this.LLJLILLLLZIIL;
                if (c14j2 != null) {
                    c14j2.setBackgroundDrawColor(iIntValue);
                }
            }
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C003L c003l) {
        TuxTextView tuxTextView = this.LLJL;
        if (tuxTextView != null) {
            tuxTextView.setText(this.LLJLL.LIZLLL);
        }
        TuxTextView tuxTextView2 = this.LLJLIL;
        if (tuxTextView2 != null) {
            tuxTextView2.setText(this.LLJLL.LJFF);
        }
        TuxTextView tuxTextView3 = this.LLJLIL;
        if (tuxTextView3 != null) {
            C1857690yRT.LIZ(tuxTextView3, this.LLJLL.LJ, null, null, null, 14);
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C003L c003l) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C003L c003l) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
