package com.ss.android.ugc.aweme.search.pages.result.nimble.ui.pages.image;

import X.C0Q0E;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C21512819Ha;
import X.C284380BCq;
import X.C337180DJs;
import X.C342550Dbp;
import X.C418440Gaw;
import X.C661150PwX;
import X.C724270Sb3;
import X.C786410Ut5;
import X.C814420VxA;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.search.pages.result.nimble.ui.pages.image.model.OffsiteImageData;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes11.dex */
public final class ImageLandingOffsiteItemAssem extends ImageLandingItemBaseAssem<C661150PwX> {
    public View LLJL;
    public TuxTextView LLJLIL;

    @Override // com.ss.android.ugc.aweme.search.pages.result.nimble.ui.pages.image.ImageLandingItemBaseAssem
    public final void Bp() {
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.nimble.ui.pages.image.ImageLandingItemBaseAssem
    public final void Ep(Bitmap bitmap, C21512819Ha c21512819Ha) {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.eww;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.nimble.ui.pages.image.ImageLandingItemBaseAssem
    public final String tp() {
        C724270Sb3 c724270Sb3 = this.LLJI;
        OffsiteImageData offsiteImageData = ((C661150PwX) (c724270Sb3 != null ? c724270Sb3.LL : null)).LLILLJJLI;
        if (offsiteImageData != null) {
            return offsiteImageData.title;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.nimble.ui.pages.image.ImageLandingItemBaseAssem
    public final ConstraintLayout up() {
        return (ConstraintLayout) getContentView().findViewById(R.id.dws);
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.nimble.ui.pages.image.ImageLandingItemBaseAssem
    public final C21512819Ha yp() {
        return (C21512819Ha) getContentView().findViewById(R.id.lla);
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.nimble.ui.pages.image.ImageLandingItemBaseAssem
    public final TuxTextView zp() {
        return (TuxTextView) getContentView().findViewById(R.id.zqc);
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.nimble.ui.pages.image.ImageLandingItemBaseAssem, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: Fp, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void up(C661150PwX c661150PwX) {
        super.up(c661150PwX);
        OffsiteImageData offsiteImageData = c661150PwX.LLILLJJLI;
        if (offsiteImageData != null) {
            View view = this.LLJL;
            if (view != null) {
                C337180DJs.LIZJ(view);
            }
            ((TextView) getContentView().findViewById(R.id.tv_offsite_name)).setText(offsiteImageData.rootUrl);
            SmartImageView smartImageView = (SmartImageView) getContentView().findViewById(R.id.lq8);
            String str = offsiteImageData.favicon;
            if (str != null) {
                Drawable drawableLIZIZ = C342550Dbp.LIZIZ(smartImageView.getContext(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)));
                C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(C0Q0E.LIZIZ(str));
                c1331670kl3LJIIIZ.LJJ(smartImageView);
                c1331670kl3LJIIIZ.LJIL(drawableLIZIZ);
                c1331670kl3LJIIIZ.LJJIIZI(drawableLIZIZ);
                c1331670kl3LJIIIZ.LJIIJJI();
            }
            if (((Boolean) C284380BCq.LIZ.getValue()).booleanValue()) {
                String str2 = offsiteImageData.declaimer;
                if (str2 != null && str2.length() != 0) {
                    C337180DJs.LIZJ(this.LLJLIL);
                } else {
                    C337180DJs.LIZ(this.LLJLIL);
                }
                TuxTextView tuxTextView = this.LLJLIL;
                if (tuxTextView != null) {
                    tuxTextView.setText(offsiteImageData.declaimer);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.nimble.ui.pages.image.ImageLandingItemBaseAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        ConstraintLayout constraintLayoutUp;
        ViewGroup.LayoutParams layoutParams;
        super.onViewCreated(view);
        this.LLJL = view.findViewById(R.id.pk6);
        this.LLJLIL = (TuxTextView) view.findViewById(R.id.zin);
        if (((Boolean) C284380BCq.LIZ.getValue()).booleanValue() && (constraintLayoutUp = up()) != null) {
            ConstraintLayout constraintLayoutUp2 = up();
            if (constraintLayoutUp2 != null && (layoutParams = constraintLayoutUp2.getLayoutParams()) != null) {
                layoutParams.height = -2;
            } else {
                layoutParams = null;
            }
            C786410Ut5.m6(constraintLayoutUp, layoutParams);
        }
    }
}
