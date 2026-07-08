package com.ss.android.ugc.aweme.search.pages.result.pov.ui.multisummary;

import X.C01GW;
import X.C123100dR;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1331730kl9;
import X.C1331750klB;
import X.C13LP;
import X.C384050F3z;
import X.C418440Gaw;
import X.C438710HIf;
import X.C452501pT;
import X.C661350Pwr;
import X.C684870Qth;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC684740QtU;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS554S0100000_10;
import wh6.AbS692S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchTextWithFoldDocAssem extends SearchMultiSummaryBaseAssem<C684870Qth> {
    public TuxTextView LLJLLL;
    public TuxTextView LLJZ;
    public SmartImageView LLJZIJLIL;
    public View LLL;
    public View LLLF;
    public final C01GW LLLFF = C452501pT.LIZIZ(new AwS554S0100000_10(this, 664));
    public final C01GW LLLFFI = C452501pT.LIZIZ(new AwS554S0100000_10(this, 665));

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.f0_;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.pov.ui.multisummary.SearchMultiSummaryBaseAssem
    public final void sp(InterfaceC684740QtU interfaceC684740QtU) {
        int i;
        SmartImageView smartImageView;
        Video video;
        UrlModel cover;
        int iIntValue;
        int i2;
        int i3;
        C684870Qth c684870Qth = (C684870Qth) interfaceC684740QtU;
        TuxTextView tuxTextView = this.LLJZ;
        if (tuxTextView != null) {
            tuxTextView.setText(c684870Qth.LLILZLL);
        }
        TuxTextView tuxTextView2 = this.LLJZ;
        int i4 = 8;
        if (tuxTextView2 != null) {
            if (C123100dR.LIZ(c684870Qth.LLILZLL)) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            C786410Ut5.LJLLLLLL(i3, tuxTextView2);
        }
        TuxTextView tuxTextView3 = this.LLJLLL;
        if (tuxTextView3 != null) {
            tuxTextView3.setText(c684870Qth.LLIZ);
        }
        TuxTextView tuxTextView4 = this.LLJZ;
        if (tuxTextView4 != null) {
            if (C123100dR.LIZ(c684870Qth.LLIZ)) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            C786410Ut5.LJLLLLLL(i2, tuxTextView4);
        }
        TuxTextView tuxTextView5 = this.LLJLLL;
        boolean z = true;
        if (tuxTextView5 != null) {
            Integer num = c684870Qth.LLIZLLLIL;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 1;
            }
            tuxTextView5.setMaxLines(iIntValue);
        }
        SmartImageView smartImageView2 = this.LLJZIJLIL;
        if (smartImageView2 != null) {
            Aweme aweme = (Aweme) C13LP.LJJJLL(c684870Qth.LLILLJJLI);
            if (aweme != null && (video = aweme.getVideo()) != null && (cover = video.getCover()) != null) {
                C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(cover));
                C1331750klB c1331750klB = new C1331750klB();
                c1331750klB.LJ = C418440Gaw.LIZIZ(4);
                c1331670kl3LJIIIIZZ.LJJI = new C1331730kl9(c1331750klB);
                c1331670kl3LJIIIIZZ.LJJIIZI((Drawable) this.LLLFF.getValue());
                c1331670kl3LJIIIIZZ.LJIL((Drawable) this.LLLFF.getValue());
                c1331670kl3LJIIIIZZ.LJJ(smartImageView2);
                c1331670kl3LJIIIIZZ.LJIIJJI();
                C661350Pwr.LJIIL(smartImageView2);
            } else {
                C661350Pwr.LIZJ(smartImageView2);
            }
        }
        if (c684870Qth.LLILLJJLI.size() <= 1 || (smartImageView = this.LLJZIJLIL) == null || smartImageView.getVisibility() != 0) {
            z = false;
        }
        View view = this.LLL;
        if (view != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, view);
        }
        View view2 = this.LLLF;
        if (view2 != null) {
            if (z) {
                i4 = 0;
            }
            C786410Ut5.LJLLLLLL(i4, view2);
        }
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.pov.ui.multisummary.SearchMultiSummaryBaseAssem
    public final void tp(View view) {
        this.LLJLLL = (TuxTextView) view.findViewById(R.id.tv_snippet);
        this.LLJZ = (TuxTextView) view.findViewById(R.id.tv_sub_title);
        this.LLJZIJLIL = (SmartImageView) view.findViewById(R.id.g1x);
        this.LLL = view.findViewById(R.id.g1y);
        this.LLLF = view.findViewById(R.id.g1z);
        View view2 = this.LLL;
        if (view2 != null) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5));
            c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(58));
            c384050F3z.LJIIIZ = Float.valueOf(C418440Gaw.LIZIZ(4));
            c384050F3z.LJIIJJI = Float.valueOf(C418440Gaw.LIZIZ(4));
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.a01);
            view2.setBackground(c384050F3z.LIZ(view.getContext()));
        }
        View view3 = this.LLLF;
        if (view3 != null) {
            C384050F3z c384050F3z2 = new C384050F3z();
            c384050F3z2.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5));
            c384050F3z2.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
            c384050F3z2.LJIIIZ = Float.valueOf(C418440Gaw.LIZIZ(4));
            c384050F3z2.LJIIJJI = Float.valueOf(C418440Gaw.LIZIZ(4));
            c384050F3z2.LIZIZ = Integer.valueOf(R.attr.a03);
            view3.setBackground(c384050F3z2.LIZ(view.getContext()));
        }
        C786410Ut5.I7(new AbS692S0100000_10(this, 18), view);
    }
}
