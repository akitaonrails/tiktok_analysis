package com.ss.android.ugc.aweme.commercialize.quickconversion.shopify.ui.sheet;

import X.AbstractC20628015ni;
import X.AnonymousClass0956;
import X.AnonymousClass1262;
import X.C036E;
import X.C054G;
import X.C09CT;
import X.C0PEM;
import X.C1022820ciu;
import X.C1308910kAL;
import X.C1361400lX0;
import X.C14C6;
import X.C14CP;
import X.C14CQ;
import X.C14CS;
import X.C14CW;
import X.C14CX;
import X.C14CY;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C1783190wVJ;
import X.C1893080zMY;
import X.C1954807lC;
import X.C197039127h;
import X.C1DFH;
import X.C2107308Nj;
import X.C2184171Adz;
import X.C2296808zG;
import X.C2296908zH;
import X.C23119094b;
import X.C23250099c;
import X.C2441009hQ;
import X.C384050F3z;
import X.C418440Gaw;
import X.C786410Ut5;
import X.ViewOnAttachStateChangeListenerC20306914d1;
import Y.ACListenerS164S0100000_30;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.skeleton.TuxSkeletonLayout;
import com.ss.android.ugc.aweme.commercialize.quickconversion.api.shopify.model.ShopifySkuCheckoutProductDetailData;
import com.ss.android.ugc.aweme.commercialize.quickconversion.api.shopify.model.ShopifySkuCheckoutProductVariant;
import com.zhiliaoapp.musically.R;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AwS574S0100000_30;
import kotlin.jvm.internal.AwS609S0100000_30;
import kotlin.jvm.internal.AwS644S0100000_30;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes31.dex */
public final class ShopifySkuCheckoutBottomSheet {
    public final Context LIZ;
    public final C14CQ LIZIZ;
    public C14CW LIZJ;
    public ShopifySkuCheckoutProductDetailData LIZLLL;
    public boolean LJFF;
    public C23119094b LJIIIIZZ;
    public C054G LJIIIZ;
    public AnonymousClass0956 LJIIJ;
    public String LJIIJJI;
    public String LJIIL;
    public View LJIILIIL;
    public final C14CX LJIILJJIL;
    public AnonymousClass1262 LJIILL;
    public C14CY LJIILLIIL;
    public final Map<String, String> LJ = new LinkedHashMap();
    public int LJI = 1;
    public boolean LJII = true;

    public final void LJ() {
        String str;
        String str2;
        this.LJFF = true;
        LJII();
        int i = C1783190wVJ.LIZ[this.LIZIZ.fromType.ordinal()];
        if (i == 1) {
            C23250099c.LIZLLL(this.LJIIIZ, C0PEM.LIZJ, null, new C14C6(this, null), 2);
            return;
        }
        str = "";
        if (i == 2) {
            String str3 = this.LIZIZ.productId;
            this.LJIIJJI = str3 != null ? str3 : "";
            LIZJ(null, false);
        } else {
            if (i != 3) {
                throw new C1954807lC();
            }
            ShopifySkuCheckoutProductDetailData shopifySkuCheckoutProductDetailData = this.LIZIZ.productDetailData;
            if (shopifySkuCheckoutProductDetailData != null && (str2 = shopifySkuCheckoutProductDetailData.productId) != null) {
                str = str2;
            }
            this.LJIIJJI = str;
            if (shopifySkuCheckoutProductDetailData != null) {
                this.LIZLLL = shopifySkuCheckoutProductDetailData;
                LIZIZ(null, shopifySkuCheckoutProductDetailData);
            }
            this.LJFF = false;
            LJII();
        }
    }

    public final void LJI() {
        C1749280vcc c1749280vcc;
        C1749280vcc c1749280vcc2;
        View view;
        C14CW c14cw = this.LIZJ;
        if (c14cw != null && (view = c14cw.LJJI) != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        C14CW c14cw2 = this.LIZJ;
        if (c14cw2 != null) {
            c14cw2.LIZ(false);
        }
        C14CW c14cw3 = this.LIZJ;
        if (c14cw3 != null && (c1749280vcc2 = c14cw3.LJIJJ) != null) {
            C1722300uv6 c1722300uv6 = new C1722300uv6();
            C1893080zMY.LIZ(c1722300uv6, new AwS574S0100000_30(this, 30));
            c1749280vcc2.setStatus(c1722300uv6);
        }
        C14CW c14cw4 = this.LIZJ;
        if (c14cw4 == null || (c1749280vcc = c14cw4.LJIJJ) == null) {
            return;
        }
        C786410Ut5.LLLZLZ(c1749280vcc, 0);
    }

    public final void LJII() {
        ShopifySkuCheckoutProductVariant shopifySkuCheckoutProductVariant;
        ShopifySkuCheckoutProductDetailData shopifySkuCheckoutProductDetailData = this.LIZLLL;
        boolean zLJFF = (shopifySkuCheckoutProductDetailData == null || (shopifySkuCheckoutProductVariant = shopifySkuCheckoutProductDetailData.selectedOrFirstAvailableVariant) == null) ? false : Intrinsics.LJFF(shopifySkuCheckoutProductVariant.getAvailable(), Boolean.TRUE);
        C14CW c14cw = this.LIZJ;
        if (c14cw != null) {
            if (!this.LJFF) {
                View view = c14cw.LJJI;
                if (view != null) {
                    C786410Ut5.LJLLLLLL(8, view);
                }
                C786410Ut5.LLFF(0, c14cw.LIZLLL);
                C786410Ut5.LLIL(c14cw.LJ, 0);
                C786410Ut5.LLIL(c14cw.LJFF, 0);
                C786410Ut5.LJLLLLLL(0, c14cw.LJIIJ);
                C786410Ut5.LJZL(0, c14cw.LJIILIIL);
                C786410Ut5.LJZL(0, c14cw.LJIILJJIL);
                C786410Ut5.LJLLLLLL(0, c14cw.LJIJJLI);
                C786410Ut5.LLIL(c14cw.LJIIIIZZ, 0);
                C786410Ut5.LLLLLLZZ(c14cw.LJIIIZ, 0);
                c14cw.LIZ(zLJFF);
                return;
            }
            View view2 = c14cw.LJJI;
            if (view2 != null) {
                C786410Ut5.LJLLLLLL(0, view2);
            }
            C786410Ut5.LLFF(4, c14cw.LIZLLL);
            C786410Ut5.LLIL(c14cw.LJ, 4);
            C786410Ut5.LLIL(c14cw.LJFF, 4);
            C786410Ut5.LLIL(c14cw.LJI, 4);
            C786410Ut5.LLIL(c14cw.LJII, 4);
            C786410Ut5.LJLLLLLL(4, c14cw.LJIIJ);
            C786410Ut5.LJZL(4, c14cw.LJIILIIL);
            C786410Ut5.LJZL(4, c14cw.LJIILJJIL);
            C786410Ut5.LJLLLLLL(4, c14cw.LJIJJLI);
            C786410Ut5.LLIL(c14cw.LJIIIIZZ, 4);
            C786410Ut5.LLLLLLZZ(c14cw.LJIIIZ, 4);
            c14cw.LIZ(false);
        }
    }

    public static final class ExtraInfo {

        @C09CT("server_extra")
        public final String serverExtra;

        public ExtraInfo() {
            this(null);
        }

        public ExtraInfo(String str) {
            this.serverExtra = str;
        }
    }

    public final void LIZ(int i) {
        TextView textView;
        int iMax = Math.max(1, this.LJI + i);
        if (iMax == this.LJI) {
            return;
        }
        this.LJI = iMax;
        C14CW c14cw = this.LIZJ;
        if (c14cw != null && (textView = c14cw.LJIJ) != null) {
            textView.setText(String.valueOf(iMax));
        }
    }

    public final void LJFF(Integer num) {
        ShopifySkuCheckoutProductDetailData shopifySkuCheckoutProductDetailData = this.LIZLLL;
        int i = 1;
        if (shopifySkuCheckoutProductDetailData == null || !C14CS.LIZ.LIZ(shopifySkuCheckoutProductDetailData)) {
            i = 2;
        }
        C14CQ c14cq = this.LIZIZ;
        String str = c14cq.pdpUrl;
        C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "sku_checkout_fallback", c14cq.awemeRawAd);
        c1022820ciuLIZLLL.LIZIZ(num, "reasonType");
        c1022820ciuLIZLLL.LIZIZ(Integer.valueOf(i), "skuType");
        c1022820ciuLIZLLL.LIZIZ(str, "pdp_url");
        c1022820ciuLIZLLL.LJII();
    }

    public ShopifySkuCheckoutBottomSheet(Context context, C14CQ c14cq) {
        int color;
        int color2;
        int iIntValue;
        int color3;
        int iIntValue2;
        int color4;
        int color5;
        int iIntValue3;
        int color6;
        int color7;
        int color8;
        int color9;
        C14CX c14cx;
        C14CW c14cw;
        View view;
        C197039127h c197039127h;
        TextView textView;
        TextView textView2;
        TuxIconView tuxIconView;
        AbstractC20628015ni abstractC20628015ni;
        AbstractC20628015ni abstractC20628015ni2;
        C14CY c14cy;
        C197039127h c197039127h2;
        int color10;
        int iIntValue4;
        int iIntValue5;
        int color11;
        int iIntValue6;
        int color12;
        int color13;
        int iIntValue7;
        int color14;
        int color15;
        int color16;
        int color17;
        this.LIZ = context;
        this.LIZIZ = c14cq;
        C23119094b c23119094bLIZ = C2296908zH.LIZ();
        this.LJIIIIZZ = c23119094bLIZ;
        C1DFH c1dfh = C0PEM.LIZ;
        this.LJIIIZ = C2296808zG.LIZ(C2107308Nj.LIZ.plus(c23119094bLIZ));
        this.LJIIJJI = "";
        if (Intrinsics.LJFF(c14cq.isLightTheme(), Boolean.TRUE)) {
            C1361400lX0 c1361400lX0 = new C1361400lX0(context, R.style.y3);
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.atk, c1361400lX0);
            if (numLIZJ != null) {
                color10 = numLIZJ.intValue();
            } else {
                color10 = ColorProtector.parseColor("#F5F5F5");
            }
            int iLJI = C2441009hQ.LJI(0.08f, color10, -1);
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.aut, context);
            if (numLIZJ2 != null) {
                iIntValue4 = numLIZJ2.intValue();
            } else {
                iIntValue4 = -1;
            }
            Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.av0, c1361400lX0);
            if (numLIZJ3 != null) {
                iIntValue5 = numLIZJ3.intValue();
            } else {
                iIntValue5 = -16777216;
            }
            Integer numLIZJ4 = C1308910kAL.LIZJ(R.attr.av2, c1361400lX0);
            if (numLIZJ4 != null) {
                color11 = numLIZJ4.intValue();
            } else {
                color11 = ColorProtector.parseColor("#666666");
            }
            Integer numLIZJ5 = C1308910kAL.LIZJ(R.attr.atl, c1361400lX0);
            if (numLIZJ5 != null) {
                numLIZJ5.intValue();
            } else {
                ColorProtector.parseColor("#FF4458");
            }
            Integer numLIZJ6 = C1308910kAL.LIZJ(R.attr.au7, c1361400lX0);
            if (numLIZJ6 != null) {
                iIntValue6 = numLIZJ6.intValue();
            } else {
                iIntValue6 = -1;
            }
            Integer numLIZJ7 = C1308910kAL.LIZJ(R.attr.atk, c1361400lX0);
            if (numLIZJ7 != null) {
                color12 = numLIZJ7.intValue();
            } else {
                color12 = ColorProtector.parseColor("#F5F5F5");
            }
            Integer numLIZJ8 = C1308910kAL.LIZJ(R.attr.atj, c1361400lX0);
            if (numLIZJ8 != null) {
                numLIZJ8.intValue();
            } else {
                ColorProtector.parseColor("#E0E0E0");
            }
            Integer numLIZJ9 = C1308910kAL.LIZJ(R.attr.atk, c1361400lX0);
            if (numLIZJ9 != null) {
                numLIZJ9.intValue();
            } else {
                ColorProtector.parseColor("#F5F5F5");
            }
            Integer numLIZJ10 = C1308910kAL.LIZJ(R.attr.av2, c1361400lX0);
            if (numLIZJ10 != null) {
                color13 = numLIZJ10.intValue();
            } else {
                color13 = ColorProtector.parseColor("#666666");
            }
            Integer numLIZJ11 = C1308910kAL.LIZJ(R.attr.av0, c1361400lX0);
            if (numLIZJ11 != null) {
                iIntValue7 = numLIZJ11.intValue();
            } else {
                iIntValue7 = -16777216;
            }
            Integer numLIZJ12 = C1308910kAL.LIZJ(R.attr.av2, c1361400lX0);
            if (numLIZJ12 != null) {
                color14 = numLIZJ12.intValue();
            } else {
                color14 = ColorProtector.parseColor("#666666");
            }
            Integer numLIZJ13 = C1308910kAL.LIZJ(R.attr.atl, c1361400lX0);
            if (numLIZJ13 != null) {
                color15 = numLIZJ13.intValue();
            } else {
                color15 = ColorProtector.parseColor("#FF4458");
            }
            Integer numLIZJ14 = C1308910kAL.LIZJ(R.attr.nd, c1361400lX0);
            if (numLIZJ14 != null) {
                color16 = numLIZJ14.intValue();
            } else {
                color16 = ColorProtector.parseColor("#CCCCCC");
            }
            Integer numLIZJ15 = C1308910kAL.LIZJ(R.attr.atj, c1361400lX0);
            if (numLIZJ15 != null) {
                color17 = numLIZJ15.intValue();
            } else {
                color17 = ColorProtector.parseColor("#FF4458");
            }
            c14cx = new C14CX(iIntValue4, iIntValue5, color11, iIntValue6, color12, color13, iIntValue7, color14, color15, color10, iLJI, color16, color17);
        } else {
            C1361400lX0 c1361400lX02 = new C1361400lX0(context, R.style.y0);
            Integer numLIZJ16 = C1308910kAL.LIZJ(R.attr.afb, c1361400lX02);
            if (numLIZJ16 != null) {
                color = numLIZJ16.intValue();
            } else {
                color = ColorProtector.parseColor("#2A2A2A");
            }
            int iLJI2 = C2441009hQ.LJI(0.12f, color, -1);
            Integer numLIZJ17 = C1308910kAL.LIZJ(R.attr.agk, context);
            if (numLIZJ17 != null) {
                color2 = numLIZJ17.intValue();
            } else {
                color2 = ColorProtector.parseColor("#121212");
            }
            Integer numLIZJ18 = C1308910kAL.LIZJ(R.attr.agq, c1361400lX02);
            if (numLIZJ18 != null) {
                iIntValue = numLIZJ18.intValue();
            } else {
                iIntValue = -16777216;
            }
            Integer numLIZJ19 = C1308910kAL.LIZJ(R.attr.ags, c1361400lX02);
            if (numLIZJ19 != null) {
                color3 = numLIZJ19.intValue();
            } else {
                color3 = ColorProtector.parseColor("#CCCCCC");
            }
            Integer numLIZJ20 = C1308910kAL.LIZJ(R.attr.afc, c1361400lX02);
            if (numLIZJ20 != null) {
                numLIZJ20.intValue();
            } else {
                ColorProtector.parseColor("#FF4458");
            }
            Integer numLIZJ21 = C1308910kAL.LIZJ(R.attr.afy, c1361400lX02);
            if (numLIZJ21 != null) {
                iIntValue2 = numLIZJ21.intValue();
            } else {
                iIntValue2 = -1;
            }
            Integer numLIZJ22 = C1308910kAL.LIZJ(R.attr.afb, c1361400lX02);
            if (numLIZJ22 != null) {
                color4 = numLIZJ22.intValue();
            } else {
                color4 = ColorProtector.parseColor("#2A2A2A");
            }
            Integer numLIZJ23 = C1308910kAL.LIZJ(R.attr.afa, c1361400lX02);
            if (numLIZJ23 != null) {
                numLIZJ23.intValue();
            } else {
                ColorProtector.parseColor("#333333");
            }
            Integer numLIZJ24 = C1308910kAL.LIZJ(R.attr.ags, c1361400lX02);
            if (numLIZJ24 != null) {
                numLIZJ24.intValue();
            } else {
                ColorProtector.parseColor("#CCCCCC");
            }
            Integer numLIZJ25 = C1308910kAL.LIZJ(R.attr.ags, c1361400lX02);
            if (numLIZJ25 != null) {
                color5 = numLIZJ25.intValue();
            } else {
                color5 = ColorProtector.parseColor("#CCCCCC");
            }
            Integer numLIZJ26 = C1308910kAL.LIZJ(R.attr.agq, c1361400lX02);
            if (numLIZJ26 != null) {
                iIntValue3 = numLIZJ26.intValue();
            } else {
                iIntValue3 = -1;
            }
            Integer numLIZJ27 = C1308910kAL.LIZJ(R.attr.ags, c1361400lX02);
            if (numLIZJ27 != null) {
                color6 = numLIZJ27.intValue();
            } else {
                color6 = ColorProtector.parseColor("#CCCCCC");
            }
            Integer numLIZJ28 = C1308910kAL.LIZJ(R.attr.afc, c1361400lX02);
            if (numLIZJ28 != null) {
                color7 = numLIZJ28.intValue();
            } else {
                color7 = ColorProtector.parseColor("#FF4458");
            }
            Integer numLIZJ29 = C1308910kAL.LIZJ(R.attr.nd, c1361400lX02);
            if (numLIZJ29 != null) {
                color8 = numLIZJ29.intValue();
            } else {
                color8 = ColorProtector.parseColor("#000000");
            }
            Integer numLIZJ30 = C1308910kAL.LIZJ(R.attr.afa, c1361400lX02);
            if (numLIZJ30 != null) {
                color9 = numLIZJ30.intValue();
            } else {
                color9 = ColorProtector.parseColor("#FF4458");
            }
            c14cx = new C14CX(color2, iIntValue, color3, iIntValue2, color4, color5, iIntValue3, color6, color7, color, iLJI2, color8, color9);
        }
        this.LJIILJJIL = c14cx;
        this.LJIILIIL = C786410Ut5.Sd(R.layout.f8v, C786410Ut5.ne(context), null);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, (int) (((double) context.getResources().getDisplayMetrics().heightPixels) * 0.73d));
        View view2 = this.LJIILIIL;
        if (view2 != null) {
            C786410Ut5.W5(view2, layoutParams);
        }
        View view3 = this.LJIILIIL;
        if (view3 != null) {
            view3.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC20306914d1(this, 7));
        }
        View view4 = this.LJIILIIL;
        if (view4 != null) {
            c14cw = new C14CW(view4);
        } else {
            c14cw = null;
        }
        this.LIZJ = c14cw;
        View view5 = this.LJIILIIL;
        if (view5 != null) {
            C1749280vcc c1749280vcc = (C1749280vcc) view5.findViewById(R.id.w28);
            if (c1749280vcc != null) {
                C786410Ut5.LLLZLZ(c1749280vcc, 8);
            }
            C14CW c14cw2 = this.LIZJ;
            if (c14cw2 != null && (c197039127h2 = c14cw2.LJIIL) != null) {
                c197039127h2.setBackgroundRadius(100);
            }
        }
        C14CW c14cw3 = this.LIZJ;
        if (c14cw3 != null) {
            c14cx = c14cx;
            this.LJIILL = new AnonymousClass1262(context, c14cq.isLightTheme(), c14cx, c14cw3, new AwS644S0100000_30(this, 38), new AwS609S0100000_30(this, 217), AFwS273S0000000_29.get$arr$(347));
            View view6 = this.LJIILIIL;
            if (view6 != null) {
                c14cy = new C14CY(context, c14cx, view6, c14cw3);
            } else {
                c14cy = null;
            }
            this.LJIILLIIL = c14cy;
            C14CW c14cw4 = this.LIZJ;
            if (c14cw4 != null) {
                c14cw4.LIZ(false);
            }
        }
        C14CW c14cw5 = this.LIZJ;
        if (c14cw5 != null) {
            View viewTd = C786410Ut5.Td(C786410Ut5.ne(c14cw5.LIZ.getContext()), R.layout.f8w, null, false);
            if ((viewTd instanceof TuxSkeletonLayout) && (abstractC20628015ni2 = (AbstractC20628015ni) viewTd) != null) {
                abstractC20628015ni2.setPlaceholderColor(c14cx.LJIIIZ);
                abstractC20628015ni2.setPulsingColor(c14cx.LJIIJ);
            }
            View viewFindViewById = c14cw5.LIZ.findViewById(R.id.eux);
            if (viewFindViewById instanceof FrameLayout) {
                ((ViewGroup) viewFindViewById).addView(viewTd, new FrameLayout.LayoutParams(-1, -1));
                C786410Ut5.LJLLLLLL(8, viewTd);
                c14cw5.LJJI = viewTd;
            }
        }
        C14CW c14cw6 = this.LIZJ;
        if (c14cw6 != null) {
            View viewTd2 = C786410Ut5.Td(C786410Ut5.ne(c14cw6.LIZ.getContext()), R.layout.f8z, null, false);
            if ((viewTd2 instanceof TuxSkeletonLayout) && (abstractC20628015ni = (AbstractC20628015ni) viewTd2) != null) {
                abstractC20628015ni.setPlaceholderColor(c14cx.LJIIIZ);
                abstractC20628015ni.setPulsingColor(c14cx.LJIIJ);
            }
            View viewFindViewById2 = c14cw6.LIZ.findViewById(R.id.rz7);
            if (viewFindViewById2 instanceof FrameLayout) {
                ((ViewGroup) viewFindViewById2).addView(viewTd2, new FrameLayout.LayoutParams(-1, -1));
                C786410Ut5.LJLLLLLL(8, viewTd2);
                c14cw6.LJJIFFI = viewTd2;
            }
        }
        C14CY c14cy2 = this.LJIILLIIL;
        if (c14cy2 != null) {
            c14cy2.LIZJ.setBackgroundColor(c14cy2.LIZIZ.LIZ);
            c14cy2.LIZLLL.LJIJJ.setBackgroundColor(c14cy2.LIZIZ.LIZ);
            c14cy2.LIZLLL.LJIJJLI.setBackgroundColor(c14cy2.LIZIZ.LJIIJJI);
            c14cy2.LIZLLL.LJIL.setBackgroundColor(c14cy2.LIZIZ.LJIIL);
            c14cy2.LIZLLL.LIZIZ.setTextColor(c14cy2.LIZIZ.LIZIZ);
            c14cy2.LIZLLL.LJ.setTextColor(c14cy2.LIZIZ.LIZIZ);
            c14cy2.LIZLLL.LJFF.setTextColor(c14cy2.LIZIZ.LJI);
            c14cy2.LIZLLL.LJI.setTextColor(c14cy2.LIZIZ.LJII);
            c14cy2.LIZLLL.LJII.setTextColor(c14cy2.LIZIZ.LJIIIIZZ);
            c14cy2.LIZLLL.LJIIIIZZ.setTextColor(c14cy2.LIZIZ.LIZJ);
            c14cy2.LIZLLL.LJIJ.setTextColor(c14cy2.LIZIZ.LIZIZ);
            c14cy2.LIZLLL.LJIJI.setTextColor(c14cy2.LIZIZ.LJFF);
            C197039127h c197039127h3 = c14cy2.LIZLLL.LJIIL;
            C384050F3z c384050F3z = new C384050F3z();
            float fLIZIZ = C418440Gaw.LIZIZ(18);
            c384050F3z.LJIIIIZZ = Float.valueOf(fLIZIZ);
            c384050F3z.LJIIIZ = Float.valueOf(fLIZIZ);
            c384050F3z.LJIIJ = Float.valueOf(fLIZIZ);
            c384050F3z.LJIIJJI = Float.valueOf(fLIZIZ);
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.a04);
            c197039127h3.setBackground(c384050F3z.LIZ(c14cy2.LIZ));
            c14cy2.LIZLLL.LJIIL.setTextColor(c14cy2.LIZIZ.LIZLLL);
            TuxIconView tuxIconView2 = c14cy2.LIZLLL.LIZJ;
            C384050F3z c384050F3z2 = new C384050F3z();
            float fLIZIZ2 = C418440Gaw.LIZIZ(100);
            c384050F3z2.LJIIIIZZ = Float.valueOf(fLIZIZ2);
            c384050F3z2.LJIIIZ = Float.valueOf(fLIZIZ2);
            c384050F3z2.LJIIJ = Float.valueOf(fLIZIZ2);
            c384050F3z2.LJIIJJI = Float.valueOf(fLIZIZ2);
            c384050F3z2.LIZ = Integer.valueOf(c14cy2.LIZIZ.LJ);
            tuxIconView2.setBackground(c384050F3z2.LIZ(c14cy2.LIZ));
            c14cy2.LIZLLL.LIZJ.setTintColor(c14cy2.LIZIZ.LIZIZ);
            c14cy2.LIZLLL.LJIILL.setTextColor(c14cy2.LIZIZ.LIZIZ);
            LinearLayout linearLayout = c14cy2.LIZLLL.LJIILIIL;
            C384050F3z c384050F3z3 = new C384050F3z();
            float fLIZIZ3 = C418440Gaw.LIZIZ(5);
            c384050F3z3.LJIIIIZZ = Float.valueOf(fLIZIZ3);
            c384050F3z3.LJIIIZ = Float.valueOf(fLIZIZ3);
            c384050F3z3.LJIIJ = Float.valueOf(fLIZIZ3);
            c384050F3z3.LJIIJJI = Float.valueOf(fLIZIZ3);
            c384050F3z3.LIZ = Integer.valueOf(c14cy2.LIZIZ.LJ);
            linearLayout.setBackground(c384050F3z3.LIZ(c14cy2.LIZ));
            c14cy2.LIZLLL.LJIILLIIL.setTextColor(c14cy2.LIZIZ.LIZIZ);
            c14cy2.LIZLLL.LJIIZILJ.setTextColor(c14cy2.LIZIZ.LIZIZ);
        }
        C14CW c14cw7 = this.LIZJ;
        if (c14cw7 != null && (tuxIconView = c14cw7.LIZJ) != null) {
            C786410Ut5.a9(tuxIconView, new ACListenerS164S0100000_30(this, 29));
        }
        C14CW c14cw8 = this.LIZJ;
        if (c14cw8 != null && (textView2 = c14cw8.LJIILLIIL) != null) {
            C786410Ut5.T7(textView2, new ACListenerS164S0100000_30(this, 30));
        }
        C14CW c14cw9 = this.LIZJ;
        if (c14cw9 != null && (textView = c14cw9.LJIIZILJ) != null) {
            C786410Ut5.T7(textView, new ACListenerS164S0100000_30(this, 31));
        }
        C14CW c14cw10 = this.LIZJ;
        if (c14cw10 != null && (c197039127h = c14cw10.LJIIL) != null) {
            C786410Ut5.U8(c197039127h, new ACListenerS164S0100000_30(this, 32));
        }
        C14CW c14cw11 = this.LIZJ;
        if (c14cw11 != null && (view = c14cw11.LJJ) != null) {
            C786410Ut5.I7(new ACListenerS164S0100000_30(this, 33), view);
        }
        LJ();
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x01c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(java.util.Map r18, com.ss.android.ugc.aweme.commercialize.quickconversion.api.shopify.model.ShopifySkuCheckoutProductDetailData r19) {
        /*
            Method dump skipped, instruction units count: 469
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.quickconversion.shopify.ui.sheet.ShopifySkuCheckoutBottomSheet.LIZIZ(java.util.Map, com.ss.android.ugc.aweme.commercialize.quickconversion.api.shopify.model.ShopifySkuCheckoutProductDetailData):void");
    }

    public final void LIZJ(Map<String, String> map, boolean z) {
        try {
            if (C036E.LIZ.LIZIZ()) {
                C23250099c.LIZLLL(this.LJIIIZ, null, null, new C14CP(this, map, z, null), 3);
                return;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LJI();
        if (!z) {
            this.LJFF = false;
            LJII();
        }
    }

    public final void LIZLLL(Throwable th, boolean z) {
        if (!(th instanceof UnknownHostException) && !(th instanceof SocketTimeoutException) && !(th instanceof ConnectException)) {
            Function0<Unit> function0 = this.LIZIZ.onFallBackAction;
            if (function0 != null) {
                function0.invoke();
                return;
            }
            return;
        }
        LJI();
        if (z) {
            return;
        }
        this.LJFF = false;
        LJII();
    }
}
