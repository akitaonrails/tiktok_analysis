package com.ss.android.ugc.aweme.ecommerce.base.sku.sea.widget.header;

import X.C1745060vVo;
import X.C1764030w0P;
import X.C2217381BqS;
import X.C384050F3z;
import X.C418440Gaw;
import X.C786410Ut5;
import X.C814420VxA;
import X.C950403na;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.sku.sea.vm.SeaSkuPanelViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.sea.vm.SkuState;
import com.ss.android.ugc.aweme.ecommerce.base.sku.sea.widget.SkuPanelBaseWidget;
import com.zhiliaoapp.musically.R;
import g1c.AjS10S0000000_1;
import g1c.AjS60S0100000_1;
import kotlin.jvm.internal.AwS580S0100000_1;

/* JADX INFO: loaded from: classes2.dex */
public final class SeaSkuPanelTopOutsideWidget extends SkuPanelBaseWidget {
    public static final int LLJJJJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
    public static final int LLJJJJJIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
    public static final int LLJJJJLIIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(11));
    public static final int LLJJL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
    public static final int LLJJLIIIJLLLLLLLZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
    public static final int LLJL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
    public static final int LLJLIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
    public final int LLJI;
    public final int LLJIJIL = R.layout.axu;
    public ConstraintLayout LLJILJIL;
    public SmartImageView LLJILJILJ;
    public TuxTextView LLJILLL;
    public TuxTextView LLJJ;
    public FrameLayout LLJJI;
    public FrameLayout LLJJIII;
    public C950403na LLJJIJI;
    public C1764030w0P LLJJIJIIJIL;
    public TuxIconView LLJJIJIL;
    public int LLJJJ;
    public int LLJJJIL;

    @Override // com.bytedance.widget.Widget
    public final void onDestroy() {
        this.LLILLJJLI = true;
        C950403na c950403na = this.LLJJIJI;
        if (c950403na != null) {
            c950403na.LIZJ(false);
        }
        C1764030w0P c1764030w0P = this.LLJJIJIIJIL;
        if (c1764030w0P != null) {
            c1764030w0P.LIZJ();
        }
        this.LLJJIJIIJIL = null;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.sku.sea.widget.SkuPanelBaseWidget, com.ss.android.ugc.aweme.base.arch.JediBaseWidget, com.bytedance.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.sku.sea.widget.SkuPanelBaseWidget
    public final void LJIIIZ() {
        if (this.LLJI == 17) {
            ConstraintLayout constraintLayout = (ConstraintLayout) LJI(R.id.fec);
            this.LLJILJIL = constraintLayout;
            C786410Ut5.I7(new AjS10S0000000_1(5), constraintLayout);
            this.LLJILJILJ = (SmartImageView) LJI(R.id.l62);
            this.LLJILLL = (TuxTextView) LJI(R.id.z3_);
            this.LLJJ = (TuxTextView) LJI(R.id.z39);
        } else {
            this.LLJJIII = (FrameLayout) LJI(R.id.vi6);
        }
        View view = this.LLILZ;
        if (view != null) {
            C786410Ut5.I7(new AjS60S0100000_1(this, 33), view);
        }
        this.LLJJI = (FrameLayout) LJI(R.id.ycr);
        if (this.LLJJIJIL == null) {
            TuxIconView tuxIconView = new TuxIconView(C1745060vVo.LIZ(this), null, 0, 6, null);
            tuxIconView.setIconRes(R.raw.icon_x_mark_small);
            tuxIconView.setTintColorRes(R.attr.zi);
            int i = LLJJLIIIJLLLLLLLZ;
            tuxIconView.setPadding(i, i, i, i);
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.zh);
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(200));
            tuxIconView.setBackground(c384050F3z.LIZ(tuxIconView.getContext()));
            C786410Ut5.I7(new AjS60S0100000_1(this, 137), tuxIconView);
            this.LLJJIJIL = tuxIconView;
            FrameLayout frameLayout = this.LLJJI;
            if (frameLayout == null) {
                this.LLJJIJIL = null;
                return;
            }
            int i2 = LLJL;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i2, i2);
            int i3 = LLJLIL;
            layoutParams.bottomMargin = i3;
            layoutParams.setMarginEnd(i3);
            layoutParams.gravity = 8388693;
            frameLayout.addView(tuxIconView, layoutParams);
        }
    }

    @Override // com.bytedance.widget.Widget
    public final void onPause() {
        C950403na c950403na = this.LLJJIJI;
        if (c950403na != null) {
            c950403na.LIZJ(true);
        }
        C1764030w0P c1764030w0P = this.LLJJIJIIJIL;
        if (c1764030w0P != null) {
            C1764030w0P.LJ(c1764030w0P, false, false, 3);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.sku.sea.widget.SkuPanelBaseWidget
    public final void LJIIIIZZ() {
        SeaSkuPanelViewModel seaSkuPanelViewModelLJII = LJII();
        if (this.LLJI == 17) {
            seaSkuPanelViewModelLJII.s60(new C2217381BqS() { // from class: X.041y
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((SkuState) obj).getCutPriceSkuPanel();
                }
            }, new AwS580S0100000_1(this, 301));
        } else {
            seaSkuPanelViewModelLJII.s60(new C2217381BqS() { // from class: X.041x
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((SkuState) obj).getSkuPanelWaistBanner();
                }
            }, new AwS580S0100000_1(this, 302));
        }
        seaSkuPanelViewModelLJII.s60(new C2217381BqS() { // from class: X.041z
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((SkuState) obj).getSkuPanelSellingPoints();
            }
        }, new AwS580S0100000_1(this, 303));
    }

    @Override // com.bytedance.widget.Widget
    public final void onResume() {
        withState(LJII(), new AwS580S0100000_1(this, 304));
        C1764030w0P c1764030w0P = this.LLJJIJIIJIL;
        if (c1764030w0P != null) {
            c1764030w0P.LIZLLL();
        }
    }

    @Override // com.bytedance.widget.Widget
    public final int LIZLLL() {
        return this.LLJIJIL;
    }

    public SeaSkuPanelTopOutsideWidget(int i) {
        this.LLJI = i;
    }
}
