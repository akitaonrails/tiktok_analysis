package com.ss.android.ugc.aweme.tako.otherpage.image.edit;

import X.C0DSB;
import X.C1852670yJN;
import X.C1852770yJX;
import X.C1854260yLw;
import X.C384050F3z;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1891350zJl;
import Y.ACListenerS161S0100000_27;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseImage;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoImageEditSelectAndPreviewSelectItemCell extends PowerCell<C1852770yJX> {
    public TuxIconView LL;
    public FrameLayout LLILLJJLI;
    public SmartImageView LLILLL;
    public View LLILZ;
    public C1852770yJX LLILZIL;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.fmw;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        TuxIconView tuxIconView = (TuxIconView) this.itemView.findViewById(R.id.x9r);
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_plus;
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(19));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(19));
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1k);
        tuxIconView.setTuxIcon(c419910GdJ);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(Float.valueOf(9.6f)));
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.a03);
        tuxIconView.setBackground(c384050F3z.LIZ(tuxIconView.getContext()));
        C786410Ut5.a9(tuxIconView, new ACListenerS161S0100000_27(this, 87));
        this.LL = tuxIconView;
        FrameLayout frameLayout = (FrameLayout) this.itemView.findViewById(R.id.x9t);
        if (frameLayout != null) {
            C786410Ut5.O7(frameLayout, new ACListenerS161S0100000_27(this, 88));
        } else {
            frameLayout = null;
        }
        this.LLILLJJLI = frameLayout;
        this.LLILLL = (SmartImageView) this.itemView.findViewById(R.id.x9u);
        this.LLILZ = this.itemView.findViewById(R.id.x9s);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        String str;
        Integer numValueOf;
        Drawable drawableLIZ;
        SmartImageView smartImageView;
        BaseImage baseImage;
        C1852770yJX c1852770yJX = (C1852770yJX) interfaceC1891350zJl;
        BaseImage baseImage2 = c1852770yJX.LL;
        if (baseImage2 == null) {
            TuxIconView tuxIconView = this.LL;
            if (tuxIconView != null) {
                C0DSB.LIZJ(tuxIconView);
            }
            FrameLayout frameLayout = this.LLILLJJLI;
            if (frameLayout != null) {
                C0DSB.LIZIZ(frameLayout);
            }
        } else {
            C1852770yJX c1852770yJX2 = this.LLILZIL;
            if (c1852770yJX2 != null && (baseImage = c1852770yJX2.LL) != null) {
                str = baseImage.uri;
            } else {
                str = null;
            }
            if (!Intrinsics.LJFF(str, baseImage2.uri) && (smartImageView = this.LLILLL) != null) {
                C1854260yLw c1854260yLw = C1854260yLw.LIZ;
                BaseImage baseImage3 = c1852770yJX.LL;
                c1854260yLw.getClass();
                C1854260yLw.LJIIJJI(smartImageView, baseImage3);
            }
            C1852770yJX c1852770yJX3 = this.LLILZIL;
            if (c1852770yJX3 == null || c1852770yJX3.LLILLJJLI != c1852770yJX.LLILLJJLI) {
                boolean z = c1852770yJX.LLILLJJLI;
                View view = this.LLILZ;
                if (view != null) {
                    if (z) {
                        C384050F3z c384050F3z = new C384050F3z();
                        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(6));
                        c384050F3z.LIZIZ = Integer.valueOf(R.attr.uk);
                        c384050F3z.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(1.7f))));
                        c384050F3z.LJFF = Integer.valueOf(R.attr.a04);
                        drawableLIZ = c384050F3z.LIZ(view.getContext());
                    } else {
                        C384050F3z c384050F3z2 = new C384050F3z();
                        c384050F3z2.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(6));
                        C1852670yJN.LIZ.getClass();
                        if (C1852670yJN.LIZ()) {
                            numValueOf = Integer.valueOf(R.attr.a02);
                        } else {
                            numValueOf = Integer.valueOf(R.attr.uk);
                        }
                        c384050F3z2.LIZIZ = numValueOf;
                        c384050F3z2.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(0.5f))));
                        c384050F3z2.LJFF = Integer.valueOf(R.attr.a02);
                        drawableLIZ = c384050F3z2.LIZ(view.getContext());
                    }
                    view.setBackground(drawableLIZ);
                }
            }
            TuxIconView tuxIconView2 = this.LL;
            if (tuxIconView2 != null) {
                C0DSB.LIZIZ(tuxIconView2);
            }
            FrameLayout frameLayout2 = this.LLILLJJLI;
            if (frameLayout2 != null) {
                C0DSB.LIZJ(frameLayout2);
            }
        }
        this.LLILZIL = c1852770yJX;
    }
}
