package com.ss.android.ugc.aweme.cell;

import X.AbstractC20607715kR;
import X.C01GW;
import X.C0P6P;
import X.C1209530ha3;
import X.C1235870iGX;
import X.C13LE;
import X.C20605115k1;
import X.C20607815kS;
import X.C20607915kT;
import X.C20608115kV;
import X.C20748516Hb;
import X.C2217381BqS;
import X.C326780CrU;
import X.C418440Gaw;
import X.C452501pT;
import X.C627300Oj2;
import X.C786410Ut5;
import X.C814420VxA;
import X.C844470XAv;
import X.EnumC323450Cm7;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS165S0100000_31;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.powerlist.footer.PowerLoadingCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS575S0100000_31;

/* JADX INFO: loaded from: classes32.dex */
public class MusicFooterCell extends PowerLoadingCell {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZLLLIL;
    public static final CharSequence LLJ;
    public static final CharSequence LLJI;
    public C627300Oj2 LL;
    public TextView LLILLJJLI;
    public TextView LLILLL;
    public C1235870iGX LLILZ;
    public final C20748516Hb LLILZIL = new C20748516Hb(this, 0);
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 329));
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS575S0100000_31(this, 328));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MusicFooterCell.class, "control", "getControl()Lcom/ss/android/ugc/aweme/cell/IFooterControl;", 0);
        C13LE.LIZ.getClass();
        LLIZLLLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        C844470XAv.LIZ.getClass();
        LLJ = C844470XAv.LIZ().getString(2131836755);
        LLJI = C844470XAv.LIZ().getString(2131836754);
    }

    @Override // com.bytedance.ies.powerlist.footer.PowerLoadingCell
    public final void N5() {
        C1235870iGX c1235870iGX = this.LLILZ;
        if (c1235870iGX != null) {
            c1235870iGX.LJI();
        }
        C1235870iGX c1235870iGX2 = this.LLILZ;
        if (c1235870iGX2 != null) {
            c1235870iGX2.LJIIIIZZ();
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        this.LLILZ = (C1235870iGX) this.itemView;
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(46));
        C1235870iGX c1235870iGX = this.LLILZ;
        if (c1235870iGX != null) {
            C786410Ut5.D6(c1235870iGX, new RecyclerView.LayoutParams(-1, iLIZIZ));
        }
        TextView textView = (TextView) C786410Ut5.Sd(R.layout.i9w, C786410Ut5.ne(this.itemView.getContext()), null);
        this.LLILLJJLI = textView;
        if (textView != null) {
            textView.setGravity(17);
        }
        TextView textView2 = (TextView) C786410Ut5.Sd(R.layout.i9x, C786410Ut5.ne(this.itemView.getContext()), null);
        this.LLILLL = textView2;
        if (textView2 != null) {
            textView2.setText(2131836754);
        }
        TextView textView3 = this.LLILLL;
        if (textView3 != null) {
            textView3.setGravity(17);
        }
        C1235870iGX c1235870iGX2 = this.LLILZ;
        if (c1235870iGX2 != null) {
            C1209530ha3 c1209530ha3LIZ = C1209530ha3.LIZ(this.itemView.getContext());
            c1209530ha3LIZ.LIZIZ(this.LLILLJJLI);
            c1209530ha3LIZ.LIZLLL(this.LLILLL);
            c1235870iGX2.setBuilder(c1209530ha3LIZ);
        }
        TextView textView4 = this.LLILLL;
        if (textView4 != null) {
            C786410Ut5.T7(textView4, new ACListenerS165S0100000_31(this, 62));
        }
    }

    @Override // com.bytedance.ies.powerlist.footer.PowerLoadingCell
    /* JADX INFO: renamed from: I5 */
    public final void onBindItemView(C20605115k1 c20605115k1) {
        RecyclerView recyclerView;
        CharSequence text;
        TextView textView;
        TextView textView2 = this.LLILLL;
        if (textView2 != null) {
            textView2.setText(LLJI);
        }
        TextView textView3 = this.LLILLL;
        if (textView3 != null) {
            textView3.setTextColor(-16777216);
        }
        TextView textView4 = this.LLILLJJLI;
        if (textView4 != null) {
            textView4.setText(LLJ);
        }
        TextView textView5 = this.LLILLJJLI;
        if (textView5 != null) {
            textView5.setTextColor(-16777216);
        }
        AbstractC20607715kR abstractC20607715kR = c20605115k1.LLILLL.LIZIZ;
        if (abstractC20607715kR instanceof C20608115kV) {
            N5();
            return;
        }
        if (abstractC20607715kR instanceof C20607815kS) {
            if (C326780CrU.LIZ[abstractC20607715kR.LIZ.ordinal()] != 1 || (recyclerView = (RecyclerView) this.LLILZLL.getValue()) == null) {
                return;
            }
            C1235870iGX c1235870iGX = (C1235870iGX) this.itemView;
            TextView textView6 = this.LLILLL;
            if (textView6 != null) {
                text = textView6.getText();
            } else {
                text = null;
            }
            if (!TextUtils.equals(text, this.itemView.getResources().getString(2131845625)) && (textView = this.LLILLL) != null) {
                textView.setText(2131845625);
            }
            c1235870iGX.getClass();
            C786410Ut5.LLLLIILL(c1235870iGX, 0);
            c1235870iGX.setStatus(2);
            if (this.LL == null) {
                this.LL = new C627300Oj2(recyclerView, (C0P6P) this.LLIZ.getValue());
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
        P5(abstractC20607715kR.LIZIZ);
    }

    public void P5(EnumC323450Cm7 enumC323450Cm7) {
        if (enumC323450Cm7 != null && enumC323450Cm7 != EnumC323450Cm7.Refresh) {
            C1235870iGX c1235870iGX = this.LLILZ;
            if (c1235870iGX != null) {
                c1235870iGX.LJII();
                return;
            }
            return;
        }
        C1235870iGX c1235870iGX2 = this.LLILZ;
        if (c1235870iGX2 == null) {
            return;
        }
        c1235870iGX2.LJI();
    }

    @Override // com.bytedance.ies.powerlist.footer.PowerLoadingCell, com.bytedance.ies.powerlist.PowerCell
    public final /* bridge */ /* synthetic */ void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        onBindItemView((C20605115k1) interfaceC1891350zJl);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return new C1235870iGX(viewGroup.getContext(), null);
    }
}
