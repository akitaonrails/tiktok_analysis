package com.bytedance.pipo.stellar.base.adapter.internal;

import X.AbstractC1720840usk;
import X.EnumC1720960usw;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.pipo.stellar.base.model.BannerDO;
import com.bytedance.pipo.stellar.base.model.ColorDO;
import com.bytedance.pipo.stellar.base.model.ImageDO;
import com.bytedance.pipo.stellar.base.model.TextDO;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS268S0000000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class StellarBannerAdapter extends StellarBaseCardAdapter<BannerDO> {
    public StellarBannerAdapter() {
        super(new AbstractC1720840usk<BannerDO>() { // from class: X.0ut3
            @Override // X.AbstractC1720840usk
            public final int LJ() {
                return R.layout.adh;
            }

            @Override // X.AbstractC1720840usk
            public final void LJFF(View view, BannerDO bannerDO, EnumC1720670usT enumC1720670usT) {
                InterfaceC1720050urT interfaceC1720050urT;
                Integer numLJIILIIL;
                InterfaceC1720050urT interfaceC1720050urT2;
                BannerDO bannerDO2 = bannerDO;
                super.LJFF(view, bannerDO2, enumC1720670usT);
                TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.title);
                TuxTextView tuxTextView2 = (TuxTextView) view.findViewById(R.id.wgz);
                ImageView imageView = (ImageView) view.findViewById(R.id.kb6);
                TextDO title = bannerDO2.getTitle();
                InterfaceC1720050urT interfaceC1720050urT3 = null;
                if (title != null) {
                    C1721300utU c1721300utU = C1721300utU.LIZ;
                    C1720760usc c1720760usc = this.LL;
                    if (c1720760usc != null) {
                        interfaceC1720050urT2 = c1720760usc.LIZIZ;
                    } else {
                        interfaceC1720050urT2 = null;
                    }
                    c1721300utU.getClass();
                    C1721300utU.LJIL(interfaceC1720050urT2, title, tuxTextView);
                }
                ImageDO arrowIcon = bannerDO2.getArrowIcon();
                if (arrowIcon != null) {
                    C419910GdJ c419910GdJ = new C419910GdJ();
                    C1721300utU c1721300utU2 = C1721300utU.LIZ;
                    String name = arrowIcon.getName();
                    c1721300utU2.getClass();
                    c419910GdJ.LIZ = C1721300utU.LJJI(name);
                    c419910GdJ.LIZIZ = C1721300utU.LJJIII(view.getContext(), arrowIcon.getWidth());
                    c419910GdJ.LIZJ = C1721300utU.LJIILLIIL(view.getContext(), arrowIcon.getHeight());
                    ColorDO color = arrowIcon.getColor();
                    if (color != null) {
                        numLJIILIIL = C1721300utU.LJIILIIL(color, view.getContext(), null);
                    } else {
                        numLJIILIIL = null;
                    }
                    c419910GdJ.LIZLLL = numLJIILIIL;
                    TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(view.getContext());
                    tuxTextView.setCompoundDrawablePadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
                    tuxTextView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, tuxIconDrawableLIZ, (Drawable) null);
                }
                TextDO subTitle = bannerDO2.getSubTitle();
                if (subTitle != null) {
                    C1721300utU c1721300utU3 = C1721300utU.LIZ;
                    C1720760usc c1720760usc2 = this.LL;
                    if (c1720760usc2 != null) {
                        interfaceC1720050urT = c1720760usc2.LIZIZ;
                    } else {
                        interfaceC1720050urT = null;
                    }
                    c1721300utU3.getClass();
                    C1721300utU.LJIL(interfaceC1720050urT, subTitle, tuxTextView2);
                }
                ImageDO image = bannerDO2.getImage();
                if (image != null) {
                    C1721300utU c1721300utU4 = C1721300utU.LIZ;
                    C1720760usc c1720760usc3 = this.LL;
                    if (c1720760usc3 != null) {
                        interfaceC1720050urT3 = c1720760usc3.LIZIZ;
                    }
                    c1721300utU4.getClass();
                    C1721300utU.LJIJI(imageView, image, interfaceC1720050urT3);
                }
            }
        }, EnumC1720960usw.CARD_BANNER.getValue(), null, AFwS268S0000000_26.get$arr$(14), null, 52);
    }
}
