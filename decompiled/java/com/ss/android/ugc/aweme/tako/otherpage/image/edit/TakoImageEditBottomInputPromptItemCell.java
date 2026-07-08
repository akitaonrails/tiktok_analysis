package com.ss.android.ugc.aweme.tako.otherpage.image.edit;

import X.C0DSB;
import X.C123100dR;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1852650yJL;
import X.C1854260yLw;
import X.C1854370yM7;
import X.C1855920yOc;
import X.C1857750yRZ;
import X.C1862330yYx;
import X.C2097608Jq;
import X.C384050F3z;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1891350zJl;
import android.view.View;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import org.json.JSONException;
import wh6.AbS706S0100000_27;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoImageEditBottomInputPromptItemCell extends PowerCell<C1854370yM7> {
    public View LL;
    public SmartImageView LLILLJJLI;
    public TuxIconView LLILLL;
    public TuxTextView LLILZ;
    public TuxIconView LLILZIL;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.fmv;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        View viewFindViewById = this.itemView.findViewById(R.id.x8y);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(8));
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.a03);
        viewFindViewById.setBackground(c384050F3z.LIZ(viewFindViewById.getContext()));
        this.LL = viewFindViewById;
        this.LLILLJJLI = (SmartImageView) this.itemView.findViewById(R.id.x8v);
        this.LLILLL = (TuxIconView) this.itemView.findViewById(R.id.x8w);
        this.LLILZ = (TuxTextView) this.itemView.findViewById(R.id.x8x);
        this.LLILZIL = (TuxIconView) this.itemView.findViewById(R.id.x8u);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) throws JSONException {
        String string;
        String strLIZJ;
        C1854370yM7 c1854370yM7 = (C1854370yM7) interfaceC1891350zJl;
        View view = this.LL;
        if (view != null) {
            C786410Ut5.I7(new AbS706S0100000_27(c1854370yM7, 4), view);
        }
        if (c1854370yM7.LLILZLL == 0) {
            SmartImageView smartImageView = this.LLILLJJLI;
            if (smartImageView != null) {
                C0DSB.LIZIZ(smartImageView);
            }
            TuxIconView tuxIconView = this.LLILLL;
            if (tuxIconView != null) {
                C0DSB.LIZIZ(tuxIconView);
            }
            TuxIconView tuxIconView2 = this.LLILZIL;
            if (tuxIconView2 != null) {
                C0DSB.LIZIZ(tuxIconView2);
            }
            TuxTextView tuxTextView = this.LLILZ;
            if (tuxTextView != null) {
                C0DSB.LIZJ(tuxTextView);
                C1857750yRZ.LJIILJJIL(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)), tuxTextView);
                C1857750yRZ.LJIIJJI(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)), tuxTextView);
                tuxTextView.setText(c1854370yM7.LLIZ);
            }
            C1862330yYx c1862330yYx = C1862330yYx.LIZ;
            Pair[] pairArr = new Pair[6];
            Integer num = c1854370yM7.LLILLL;
            String str = null;
            if (num != null) {
                string = num.toString();
            } else {
                string = null;
            }
            pairArr[0] = new Pair("source", string);
            pairArr[1] = new Pair("rank", String.valueOf(c1854370yM7.LL));
            pairArr[2] = new Pair("log_id", c1854370yM7.LLJI);
            pairArr[3] = new Pair("interaction_name", c1854370yM7.LLILZ);
            C1854260yLw.LIZ.getClass();
            C1852650yJL c1852650yJL = C1854260yLw.LIZIZ;
            if (c1852650yJL != null) {
                strLIZJ = C1855920yOc.LIZJ(Integer.valueOf(c1852650yJL.LIZ));
            } else {
                strLIZJ = null;
            }
            pairArr[4] = new Pair("mode", strLIZJ);
            C1852650yJL c1852650yJL2 = C1854260yLw.LIZIZ;
            if (c1852650yJL2 != null) {
                str = c1852650yJL2.LJI;
            }
            pairArr[5] = new Pair("mode_source", str);
            c1862330yYx.mobTikbotQuickInteractionShow(C2097608Jq.LJIIIIZZ(pairArr), C1854260yLw.LJ);
            return;
        }
        if (C123100dR.LIZ(c1854370yM7.LLJ)) {
            SmartImageView smartImageView2 = this.LLILLJJLI;
            if (smartImageView2 != null) {
                C0DSB.LIZJ(smartImageView2);
            }
            C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(c1854370yM7.LLJ);
            c1331670kl3LJIIIZ.LJJ(this.LLILLJJLI);
            C786410Ut5.h3(c1331670kl3LJIIIZ);
            TuxIconView tuxIconView3 = this.LLILLL;
            if (tuxIconView3 != null) {
                C0DSB.LIZIZ(tuxIconView3);
            }
        } else {
            SmartImageView smartImageView3 = this.LLILLJJLI;
            if (smartImageView3 != null) {
                C0DSB.LIZIZ(smartImageView3);
            }
            if (c1854370yM7.LLIZLLLIL != null) {
                TuxIconView tuxIconView4 = this.LLILLL;
                if (tuxIconView4 != null) {
                    C0DSB.LIZJ(tuxIconView4);
                }
                TuxIconView tuxIconView5 = this.LLILLL;
                if (tuxIconView5 != null) {
                    C419910GdJ c419910GdJ = new C419910GdJ();
                    c419910GdJ.LIZ = c1854370yM7.LLIZLLLIL.intValue();
                    c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
                    c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
                    c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
                    tuxIconView5.setTuxIcon(c419910GdJ);
                }
            } else {
                TuxIconView tuxIconView6 = this.LLILLL;
                if (tuxIconView6 != null) {
                    C0DSB.LIZIZ(tuxIconView6);
                }
            }
        }
        TuxTextView tuxTextView2 = this.LLILZ;
        if (tuxTextView2 != null) {
            C0DSB.LIZJ(tuxTextView2);
            C1857750yRZ.LJIILJJIL(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)), tuxTextView2);
            C1857750yRZ.LJIIJJI(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), tuxTextView2);
            tuxTextView2.setText(c1854370yM7.LLIZ);
        }
        TuxIconView tuxIconView7 = this.LLILZIL;
        if (tuxIconView7 == null) {
            return;
        }
        C0DSB.LIZJ(tuxIconView7);
    }
}
