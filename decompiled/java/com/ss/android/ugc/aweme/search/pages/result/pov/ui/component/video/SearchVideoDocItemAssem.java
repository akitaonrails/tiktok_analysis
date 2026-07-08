package com.ss.android.ugc.aweme.search.pages.result.pov.ui.component.video;

import X.C01GW;
import X.C1308910kAL;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1839007Ie;
import X.C384050F3z;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C426750GoL;
import X.C427690Gpr;
import X.C438710HIf;
import X.C452501pT;
import X.C666750QDh;
import X.C684840Qte;
import X.C786410Ut5;
import X.C814420VxA;
import X.C820940WIi;
import X.InterfaceC1587906Jp;
import X.InterfaceC712990Rxx;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS554S0100000_10;
import wh6.AbS692S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchVideoDocItemAssem extends ReusedUISlotAssem<SearchVideoDocItemAssem> implements InterfaceC712990Rxx<C684840Qte> {
    public TuxTextView LLJJLIIIJLLLLLLLZ;
    public SmartImageView LLJL;
    public TuxTextView LLJLIL;
    public C684840Qte LLJLLIL;
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 650));
    public final C01GW LLJLL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 649));
    public final C01GW LLJLLL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 651));

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.f0o;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        this.LLJL = (SmartImageView) view.findViewById(R.id.g1x);
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.g25);
        C786410Ut5.LLLLZLL(tuxTextView, C666750QDh.LIZ);
        this.LLJLIL = tuxTextView;
        this.LLJJLIIIJLLLLLLLZ = (TuxTextView) view.findViewById(R.id.g20);
        int i = 8;
        float fLIZIZ = C418440Gaw.LIZIZ(8);
        TuxTextView tuxTextView2 = this.LLJJLIIIJLLLLLLLZ;
        if (tuxTextView2 != null) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZ = C1308910kAL.LIZJ(R.attr.ze, view.getContext());
            c384050F3z.LJIIJJI = Float.valueOf(fLIZIZ);
            tuxTextView2.setBackground(c384050F3z.LIZ(view.getContext()));
        }
        TuxTextView tuxTextView3 = this.LLJJLIIIJLLLLLLLZ;
        if (tuxTextView3 != null) {
            if (!C1839007Ie.LIZ()) {
                i = 0;
            }
            C786410Ut5.LJLLLLLL(i, tuxTextView3);
        }
        C427690Gpr.LJ(getContentView(), fLIZIZ);
        C786410Ut5.I7(new AbS692S0100000_10(this, 16), getContentView());
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C684840Qte c684840Qte) {
        int i;
        long diggCount;
        int i2;
        int i3;
        Video video;
        UrlModel cover;
        C684840Qte c684840Qte2 = c684840Qte;
        this.LLJLLIL = c684840Qte2;
        TuxTextView tuxTextView = this.LLJJLIIIJLLLLLLLZ;
        if (tuxTextView != null) {
            tuxTextView.setText(String.valueOf(c684840Qte2.LLILLJJLI));
        }
        SmartImageView smartImageView = this.LLJL;
        if (smartImageView != null && (video = c684840Qte2.LL.getVideo()) != null && (cover = video.getCover()) != null) {
            C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(cover));
            c1331670kl3LJIIIIZZ.LJJIIZI((Drawable) this.LLJLL.getValue());
            c1331670kl3LJIIIIZZ.LJIL((Drawable) this.LLJLL.getValue());
            c1331670kl3LJIIIIZZ.LJJ(smartImageView);
            c1331670kl3LJIIIIZZ.LJIIJJI();
        }
        Aweme aweme = c684840Qte2.LL;
        TuxTextView tuxTextView2 = this.LLJLIL;
        if (tuxTextView2 != null) {
            AwemeStatistics statistics = aweme.getStatistics();
            if (statistics != null) {
                diggCount = statistics.getDiggCount();
            } else {
                diggCount = 0;
            }
            tuxTextView2.setText(C820940WIi.LIZ(diggCount));
            C419910GdJ c419910GdJ = new C419910GdJ();
            if (aweme.getUserDigg() == 1) {
                i2 = R.raw.icon_heart_small_fill;
            } else {
                i2 = R.raw.icon_heart_small;
            }
            c419910GdJ.LIZ = i2;
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
            if (aweme.getUserDigg() == 1) {
                i3 = R.attr.a1r;
            } else {
                i3 = R.attr.zi;
            }
            c419910GdJ.LJ = Integer.valueOf(i3);
            TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(tuxTextView2.getContext());
            if (C426750GoL.LIZLLL(tuxTextView2.getContext())) {
                tuxTextView2.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, tuxIconDrawableLIZ, (Drawable) null);
            } else {
                tuxTextView2.setCompoundDrawablesWithIntrinsicBounds(tuxIconDrawableLIZ, (Drawable) null, (Drawable) null, (Drawable) null);
            }
        }
        if (C1839007Ie.LIZ()) {
            View view = (View) this.LLJLILLLLZIIL.getValue();
            if (AwemeExtKt.isPhotoMode(c684840Qte2.LL)) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, view);
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C684840Qte c684840Qte) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C684840Qte c684840Qte) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
