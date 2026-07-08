package com.ss.android.ugc.aweme.search.pages.result.nimble.ui.component.videostack;

import X.C01GW;
import X.C384050F3z;
import X.C452501pT;
import X.C657990PrR;
import X.C685000Qtu;
import X.C724270Sb3;
import X.EnumC684990Qtt;
import X.InterfaceC685060Qu0;
import android.view.View;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.nimble.ui.component.base.SearchNimbleBaseAssem;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS554S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchNimbleVideoStackAssem extends SearchNimbleBaseAssem<List<? extends Aweme>> {
    public SmartImageView LLJZIJLIL;
    public View LLL;
    public View LLLF;
    public final C01GW LLLFF = C452501pT.LIZIZ(new AwS554S0100000_10(this, 592));
    public final C01GW LLLFFI = C452501pT.LIZIZ(new AwS554S0100000_10(this, 590));
    public final C01GW LLLFZ = C452501pT.LIZIZ(new AwS554S0100000_10(this, 591));

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.ez4;
    }

    public final float Fp() {
        return ((Number) this.LLLFFI.getValue()).floatValue();
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.nimble.ui.component.base.SearchNimbleBaseAssem
    public final List<? extends Aweme> tp() {
        C724270Sb3 c724270Sb3 = this.LLJI;
        return ((InterfaceC685060Qu0) (c724270Sb3 != null ? c724270Sb3.LL : null)).LLJJI().getSubVideos();
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00be  */
    @Override // com.ss.android.ugc.aweme.search.pages.result.nimble.ui.component.base.SearchNimbleBaseAssem
    /* JADX INFO: renamed from: Bp */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void tp(X.InterfaceC685060Qu0 r6) {
        /*
            r5 = this;
            super.tp(r6)
            com.bytedance.lighten.loader.SmartImageView r3 = r5.LLJZIJLIL
            if (r3 == 0) goto L6b
            X.0Sb3 r0 = r5.LLJI
            if (r0 == 0) goto Lc4
            java.lang.Object r0 = r0.LL
        Ld:
            X.0Qu0 r0 = (X.InterfaceC685060Qu0) r0
            X.0Qq9 r0 = r0.LLJJI()
            java.util.List r0 = r0.getSubVideos()
            if (r0 == 0) goto Lc0
            java.lang.Object r0 = X.C13LP.LJJJLL(r0)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = (com.ss.android.ugc.aweme.feed.model.Aweme) r0
            if (r0 == 0) goto Lc0
            com.ss.android.ugc.aweme.feed.model.Video r0 = r0.getVideo()
            if (r0 == 0) goto Lc0
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r0.getCover()
            if (r0 == 0) goto Lc0
            com.ss.android.ugc.aweme.base.ImageUrlModel r0 = X.C438710HIf.LIZ(r0)
            X.0kl3 r2 = X.C1331660kl2.LJIIIIZZ(r0)
            X.0klB r1 = new X.0klB
            r1.<init>()
            r0 = 4
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            float r0 = X.C418440Gaw.LIZIZ(r0)
            r1.LJ = r0
            X.0kl9 r0 = new X.0kl9
            r0.<init>(r1)
            r2.LJJI = r0
            X.01GW r0 = r5.LLLFF
            java.lang.Object r0 = r0.getValue()
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            r2.LJJIIZI(r0)
            X.01GW r0 = r5.LLLFF
            java.lang.Object r0 = r0.getValue()
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            r2.LJIL(r0)
            r2.LJJ(r3)
            r2.LJIIJJI()
            X.C661350Pwr.LJIIL(r3)
        L6b:
            X.0Qq9 r0 = r6.LLJJI()
            java.util.List r0 = r0.getSubVideos()
            r4 = 0
            if (r0 == 0) goto Lbe
            int r0 = r0.size()
            r3 = 1
            if (r0 <= r3) goto Lbe
            com.bytedance.lighten.loader.SmartImageView r0 = r5.LLJZIJLIL
            if (r0 == 0) goto Lbe
            int r0 = r0.getVisibility()
            if (r0 != 0) goto Lbe
        L87:
            android.view.View r2 = r5.LLL
            r1 = 8
            if (r2 == 0) goto L93
            if (r3 == 0) goto Lbb
            r0 = 0
        L90:
            X.C786410Ut5.LJLLLLLL(r0, r2)
        L93:
            android.view.View r0 = r5.LLLF
            if (r0 == 0) goto L9d
            if (r3 == 0) goto L9a
            r1 = 0
        L9a:
            X.C786410Ut5.LJLLLLLL(r1, r0)
        L9d:
            X.06qJ r1 = r5.LLJLLL
            X.1Bqa<java.lang.Object>[] r0 = com.ss.android.ugc.aweme.search.pages.result.nimble.ui.component.base.SearchNimbleBaseAssem.LLJZ
            r0 = r0[r4]
            java.lang.Object r3 = r1.getValue(r5, r0)
            com.bytedance.assem.arch.viewModel.AssemViewModel r3 = (com.bytedance.assem.arch.viewModel.AssemViewModel) r3
            java.lang.String r2 = r6.getItemId()
            r3.getClass()
            kotlin.jvm.internal.AwS61S1000000_10 r1 = new kotlin.jvm.internal.AwS61S1000000_10
            r0 = 10
            r1.<init>(r2, r0)
            r3.setStateImmediate(r1)
            return
        Lbb:
            r0 = 8
            goto L90
        Lbe:
            r3 = 0
            goto L87
        Lc0:
            X.C661350Pwr.LIZJ(r3)
            goto L6b
        Lc4:
            r0 = 0
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.pages.result.nimble.ui.component.videostack.SearchNimbleVideoStackAssem.tp(X.0Qu0):void");
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.nimble.ui.component.base.SearchNimbleBaseAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        this.LLJZIJLIL = (SmartImageView) view.findViewById(R.id.g1x);
        this.LLL = view.findViewById(R.id.g1y);
        this.LLLF = view.findViewById(R.id.g1z);
        float fFp = Fp() * 0.75f;
        float fFloatValue = ((Number) this.LLLFZ.getValue()).floatValue() - fFp;
        float f = fFloatValue / 2.0f;
        SmartImageView smartImageView = this.LLJZIJLIL;
        if (smartImageView != null) {
            C657990PrR.LIZJ(smartImageView, new C685000Qtu(fFp, this, fFloatValue));
        }
        float fFp2 = Fp() - (2 * f);
        float fFp3 = Fp() - (4 * f);
        View view2 = this.LLL;
        if (view2 != null) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LJII = (int) f;
            c384050F3z.LJI = (int) fFp2;
            c384050F3z.LJIIIZ = Float.valueOf(f);
            c384050F3z.LJIIJJI = Float.valueOf(f);
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.a01);
            view2.setBackground(c384050F3z.LIZ(view.getContext()));
        }
        View view3 = this.LLLF;
        if (view3 != null) {
            C384050F3z c384050F3z2 = new C384050F3z();
            c384050F3z2.LJII = (int) f;
            c384050F3z2.LJI = (int) fFp3;
            c384050F3z2.LJIIIZ = Float.valueOf(f);
            c384050F3z2.LJIIJJI = Float.valueOf(f);
            c384050F3z2.LIZIZ = Integer.valueOf(R.attr.a03);
            view3.setBackground(c384050F3z2.LIZ(view.getContext()));
        }
        SearchNimbleBaseAssem.Ep(this, view, EnumC684990Qtt.VIDEO_STACK, null, null, 12);
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.nimble.ui.component.base.SearchNimbleBaseAssem
    public final boolean op(List<? extends Aweme> list) {
        if (list != null && (!r3.isEmpty())) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.nimble.ui.component.base.SearchNimbleBaseAssem, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(InterfaceC685060Qu0 interfaceC685060Qu0) {
        tp(interfaceC685060Qu0);
    }
}
