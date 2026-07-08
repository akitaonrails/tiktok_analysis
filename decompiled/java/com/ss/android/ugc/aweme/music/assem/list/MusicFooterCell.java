package com.ss.android.ugc.aweme.music.assem.list;

import X.AbstractC20607715kR;
import X.C01GW;
import X.C0P6P;
import X.C1390410mHn;
import X.C13LE;
import X.C20605115k1;
import X.C20607815kS;
import X.C20607915kT;
import X.C20608115kV;
import X.C20748516Hb;
import X.C2217381BqS;
import X.C326800CrW;
import X.C418440Gaw;
import X.C452501pT;
import X.C627300Oj2;
import X.C631230OpN;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC323450Cm7;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS165S0100000_31;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.powerlist.footer.PowerLoadingCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS575S0100000_31;

/* JADX INFO: loaded from: classes32.dex */
public class MusicFooterCell extends PowerLoadingCell {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZ;
    public C627300Oj2 LL;
    public C1390410mHn LLILZ;
    public TextView LLILZIL;
    public final C20748516Hb LLILLJJLI = new C20748516Hb(this, 2);
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 880));
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 879));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MusicFooterCell.class, "control", "getControl()Lcom/ss/android/ugc/aweme/music/assem/list/IFooterControl;", 0);
        C13LE.LIZ.getClass();
        LLIZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.eg8;
    }

    @Override // com.bytedance.ies.powerlist.footer.PowerLoadingCell
    public final void N5() {
        C1390410mHn c1390410mHn = this.LLILZ;
        if (c1390410mHn != null) {
            C786410Ut5.LLLZZIL(c1390410mHn, 0);
        }
        C1390410mHn c1390410mHn2 = this.LLILZ;
        if (c1390410mHn2 != null) {
            c1390410mHn2.LIZJ();
        }
        TextView textView = this.LLILZIL;
        if (textView != null) {
            C786410Ut5.LLIL(textView, 8);
        }
        C786410Ut5.I7(null, this.itemView);
        C631230OpN.LIZJ(this.itemView);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(46));
        View view = this.itemView;
        if (view != null) {
            C786410Ut5.W5(view, new RecyclerView.LayoutParams(-1, iLIZIZ));
        }
        this.LLILZ = (C1390410mHn) this.itemView.findViewById(R.id.nle);
        this.LLILZIL = (TextView) this.itemView.findViewById(R.id.text);
    }

    @Override // com.bytedance.ies.powerlist.footer.PowerLoadingCell
    /* JADX INFO: renamed from: I5 */
    public final void onBindItemView(C20605115k1 c20605115k1) {
        AbstractC20607715kR abstractC20607715kR = c20605115k1.LLILLL.LIZIZ;
        if (abstractC20607715kR instanceof C20608115kV) {
            N5();
            return;
        }
        if (abstractC20607715kR instanceof C20607815kS) {
            EnumC323450Cm7 enumC323450Cm7 = abstractC20607715kR.LIZ;
            C1390410mHn c1390410mHn = this.LLILZ;
            if (c1390410mHn != null && c1390410mHn.LLIZLLLIL) {
                c1390410mHn.LIZLLL();
            }
            C1390410mHn c1390410mHn2 = this.LLILZ;
            if (c1390410mHn2 != null) {
                C786410Ut5.LLLZZIL(c1390410mHn2, 8);
            }
            if (C326800CrW.LIZ[enumC323450Cm7.ordinal()] == 1) {
                if (this.LLILLL.getValue() == null) {
                    return;
                }
                TextView textView = this.LLILZIL;
                if (textView != null) {
                    textView.setText(this.itemView.getResources().getString(2131845625));
                }
                TextView textView2 = this.LLILZIL;
                if (textView2 != null) {
                    C786410Ut5.LLIL(textView2, 0);
                }
                C786410Ut5.I7(new ACListenerS165S0100000_31(this, 80), this.itemView);
                if (this.LL == null) {
                    this.LL = new C627300Oj2((RecyclerView) this.LLILLL.getValue(), (C0P6P) this.LLILZLL.getValue());
                }
                C627300Oj2 c627300Oj2 = this.LL;
                if (c627300Oj2 != null) {
                    c627300Oj2.LLILLL = true;
                }
                C631230OpN.LIZJ(this.itemView);
                return;
            }
            TextView textView3 = this.LLILZIL;
            if (textView3 != null) {
                C786410Ut5.LLIL(textView3, 8);
            }
            C786410Ut5.I7(null, this.itemView);
            C631230OpN.LIZ(this.itemView);
            return;
        }
        if (!(abstractC20607715kR instanceof C20607915kT)) {
            return;
        }
        EnumC323450Cm7 enumC323450Cm72 = abstractC20607715kR.LIZIZ;
        C1390410mHn c1390410mHn3 = this.LLILZ;
        if (c1390410mHn3 != null && c1390410mHn3.LLIZLLLIL) {
            c1390410mHn3.LIZLLL();
        }
        C1390410mHn c1390410mHn4 = this.LLILZ;
        if (c1390410mHn4 != null) {
            C786410Ut5.LLLZZIL(c1390410mHn4, 8);
        }
        if (enumC323450Cm72 != null && enumC323450Cm72 != EnumC323450Cm7.Refresh) {
            TextView textView4 = this.LLILZIL;
            if (textView4 != null) {
                textView4.setText(this.itemView.getResources().getString(2131836755));
            }
            TextView textView5 = this.LLILZIL;
            if (textView5 != null) {
                C786410Ut5.LLIL(textView5, 0);
            }
            C786410Ut5.I7(null, this.itemView);
            C631230OpN.LIZJ(this.itemView);
            return;
        }
        TextView textView6 = this.LLILZIL;
        if (textView6 != null) {
            C786410Ut5.LLIL(textView6, 8);
        }
        C786410Ut5.I7(null, this.itemView);
        C631230OpN.LIZ(this.itemView);
    }

    @Override // com.bytedance.ies.powerlist.footer.PowerLoadingCell, com.bytedance.ies.powerlist.PowerCell
    public final /* bridge */ /* synthetic */ void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        onBindItemView((C20605115k1) interfaceC1891350zJl);
    }
}
