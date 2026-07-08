package com.ss.android.ugc.aweme.tako.botpage.components.video.doublecolumn;

import X.AbstractC20607715kR;
import X.C01GW;
import X.C0DSB;
import X.C0P6P;
import X.C1390410mHn;
import X.C13LE;
import X.C20605115k1;
import X.C20607815kS;
import X.C20607915kT;
import X.C20608115kV;
import X.C20742916Ex;
import X.C20748516Hb;
import X.C2217381BqS;
import X.C326770CrT;
import X.C452501pT;
import X.C627300Oj2;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import X.InterfaceC20615815lk;
import X.InterfaceC2217461Bqa;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.powerlist.footer.PowerLoadingCell;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS575S0100000_31;

/* JADX INFO: loaded from: classes32.dex */
public class TakoVideoListFooterCell extends PowerLoadingCell {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZ;
    public C627300Oj2 LL;
    public C1390410mHn LLILLJJLI;
    public TuxTextView LLILLL;
    public final C20748516Hb LLILZ = new C20748516Hb(this, 4);
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1175));
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1174));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TakoVideoListFooterCell.class, "control", "getControl()Lcom/ss/android/ugc/aweme/tako/botpage/components/video/doublecolumn/ITakoVideoListFooterControl;", 0);
        C13LE.LIZ.getClass();
        LLIZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.ies.powerlist.footer.PowerLoadingCell
    public final void L5() {
        InterfaceC20615815lk interfaceC20615815lkP5;
        C1390410mHn c1390410mHn = this.LLILLJJLI;
        if (c1390410mHn != null) {
            c1390410mHn.LIZLLL();
        }
        C0DSB.LIZIZ(this.LLILLJJLI);
        if (P5() == null || !((interfaceC20615815lkP5 = P5()) == null || interfaceC20615815lkP5.f01())) {
            C0DSB.LIZIZ(this.LLILLL);
            return;
        }
        C0DSB.LIZJ(this.LLILLL);
        TuxTextView tuxTextView = this.LLILLL;
        if (tuxTextView != null) {
            tuxTextView.setText(this.itemView.getContext().getString(2131836755));
        }
    }

    @Override // com.bytedance.ies.powerlist.footer.PowerLoadingCell
    public final void N5() {
        C0DSB.LIZIZ(this.LLILLL);
        C0DSB.LIZJ(this.LLILLJJLI);
        C1390410mHn c1390410mHn = this.LLILLJJLI;
        if (c1390410mHn != null) {
            c1390410mHn.LIZJ();
        }
    }

    public final InterfaceC20615815lk P5() {
        return (InterfaceC20615815lk) this.LLILZ.getValue(this, LLIZ[0]);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        this.LLILLJJLI = (C1390410mHn) this.itemView.findViewById(R.id.gb5);
        this.LLILLL = (TuxTextView) this.itemView.findViewById(R.id.zmm);
    }

    @Override // com.bytedance.ies.powerlist.footer.PowerLoadingCell
    /* JADX INFO: renamed from: I5 */
    public final void onBindItemView(C20605115k1 c20605115k1) {
        RecyclerView recyclerView;
        AbstractC20607715kR abstractC20607715kR = c20605115k1.LLILLL.LIZIZ;
        if (abstractC20607715kR instanceof C20608115kV) {
            N5();
            return;
        }
        if (abstractC20607715kR instanceof C20607815kS) {
            if (C326770CrT.LIZ[abstractC20607715kR.LIZ.ordinal()] != 1 || (recyclerView = (RecyclerView) this.LLILZIL.getValue()) == null) {
                return;
            }
            C1390410mHn c1390410mHn = this.LLILLJJLI;
            if (c1390410mHn != null) {
                c1390410mHn.LIZLLL();
            }
            C0DSB.LIZIZ(this.LLILLJJLI);
            C0DSB.LIZJ(this.LLILLL);
            TuxTextView tuxTextView = this.LLILLL;
            if (tuxTextView != null) {
                C786410Ut5.h9(tuxTextView, null);
            }
            TuxTextView tuxTextView2 = this.LLILLL;
            if (tuxTextView2 != null) {
                tuxTextView2.setText(this.itemView.getContext().getString(2131845625));
            }
            if (this.LL == null) {
                this.LL = new C627300Oj2(recyclerView, (C0P6P) this.LLILZLL.getValue());
            }
            C627300Oj2 c627300Oj2 = this.LL;
            if (c627300Oj2 == null) {
                return;
            }
            c627300Oj2.LLILLL = true;
            return;
        }
        if (!(abstractC20607715kR instanceof C20607915kT)) {
            return;
        }
        L5();
    }

    @Override // com.bytedance.ies.powerlist.footer.PowerLoadingCell, com.bytedance.ies.powerlist.PowerCell
    public final /* bridge */ /* synthetic */ void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        onBindItemView((C20605115k1) interfaceC1891350zJl);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C20742916Ex.LIZ(viewGroup.getContext(), R.layout.fqc, viewGroup, false, -1);
    }
}
