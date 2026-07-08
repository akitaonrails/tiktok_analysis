package com.ss.android.ugc.aweme.ecommerce.base.sku.sea.widget;

import X.AnonymousClass0473;
import X.C01GW;
import X.C0H1U;
import X.C10515049h;
import X.C11EA;
import X.C12ES;
import X.C1602160rnK;
import X.C1748720vbi;
import X.C1763620vzk;
import X.C1867160ygk;
import X.C19ME;
import X.C2217381BqS;
import X.C300330Bpv;
import X.C418440Gaw;
import X.C426350Gnh;
import X.C430120Gtm;
import X.C452501pT;
import X.C786410Ut5;
import X.C814420VxA;
import X.C950403na;
import X.C950703nd;
import X.C953503o5;
import X.C953803o8;
import X.EnumC1763640vzm;
import X.InterfaceC950803ne;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.ACListenerS136S0100000_1;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.sku.SkuPanelStarter;
import com.ss.android.ugc.aweme.ecommerce.base.sku.sea.vm.SkuState;
import com.ss.android.ugc.aweme.ecommerce.base.sku.sea.widget.SeaSkuPanelHeaderWidget;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS185S0000000_1;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.AwS615S0100000_1;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes2.dex */
public final class SeaSkuPanelHeaderWidget extends SkuPanelBaseWidget {
    public static final int LLJJJJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(30));
    public static final int LLJJJJJIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1));
    public static final int LLJJJJLIIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
    public static final int LLJJL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
    public static final int LLJJLIIIJLLLLLLLZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
    public static final int LLJL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5));
    public static final int LLJLIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
    public SmartImageView LLJIJIL;
    public C1763620vzk LLJILJIL;
    public C953803o8 LLJILJILJ;
    public C430120Gtm LLJILLL;
    public C426350Gnh LLJJ;
    public TuxTextView LLJJI;
    public C950403na LLJJIII;
    public ConstraintLayout LLJJIJI;
    public View LLJJIJIIJIL;
    public final int LLJI = R.layout.az2;
    public final C01GW LLJJIJIL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 1426));
    public final C01GW LLJJJ = C452501pT.LIZIZ(new AwS545S0100000_1(this, 1427));
    public final List<String> LLJJJIL = new ArrayList();

    @Override // com.bytedance.widget.Widget
    public final void onDestroy() {
        this.LLILLJJLI = true;
        C950403na c950403na = this.LLJJIII;
        if (c950403na != null) {
            c950403na.LIZJ(false);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.sku.sea.widget.SkuPanelBaseWidget, com.ss.android.ugc.aweme.base.arch.JediBaseWidget, com.bytedance.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.widget.Widget
    public final void onPause() {
        C950403na c950403na = this.LLJJIII;
        if (c950403na != null) {
            c950403na.LIZJ(true);
        }
    }

    @Override // com.bytedance.widget.Widget
    public final void onResume() {
        C950403na c950403na = this.LLJJIII;
        if (c950403na != null) {
            c950403na.LIZIZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.sku.sea.widget.SkuPanelBaseWidget
    public final void LJIIIIZZ() {
        SkuPanelStarter.SkuEnterParams skuEnterParams = LJII().LLJILJIL;
        if (skuEnterParams == null || skuEnterParams.clickFrom != 17) {
            C11EA.LJII(this, LJII(), new C2217381BqS() { // from class: X.0425
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((SkuState) obj).getSkuPanelWaistBanner();
                }
            }, new AwS615S0100000_1(this, 65));
        }
        LJII().s60(new C2217381BqS() { // from class: X.043x
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((SkuState) obj).getCurrentImage();
            }
        }, new AwS605S0100000_26(this, 251));
        LJII().s60(new C2217381BqS() { // from class: X.046j
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((SkuState) obj).getCurrentPriceData();
            }
        }, new AwS580S0100000_1(this, 288));
        if (C300330Bpv.LIZ()) {
            LJII().s60(new C2217381BqS() { // from class: X.046k
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((SkuState) obj).getHidePriceTip();
                }
            }, new AwS580S0100000_1(this, 289));
        }
        C11EA.LJII(this, LJII(), new C2217381BqS() { // from class: X.046h
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((SkuState) obj).getSpecifications();
            }
        }, new AwS615S0100000_1(this, 63));
        C11EA.LJII(this, LJII(), new C2217381BqS() { // from class: X.046i
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((SkuState) obj).getPromotionDealVO();
            }
        }, new AwS615S0100000_1(this, 64));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.sku.sea.widget.SkuPanelBaseWidget
    public final void LJIIIZ() {
        ConstraintLayout constraintLayout = (ConstraintLayout) LJI(R.id.vhf);
        this.LLJJIJI = constraintLayout;
        constraintLayout.setBackground((Drawable) this.LLJJIJIL.getValue());
        View viewLJI = LJI(R.id.vhe);
        this.LLJJIJIIJIL = viewLJI;
        viewLJI.setBackground((Drawable) this.LLJJJ.getValue());
        this.LLJJIII = (C950403na) LJI(R.id.ehi);
        SkuPanelStarter.SkuEnterParams skuEnterParams = LJII().LLJILJIL;
        if (skuEnterParams == null || skuEnterParams.clickFrom != 17) {
            C950403na c950403na = this.LLJJIII;
            if (c950403na != null) {
                c950403na.LIZ(new C950703nd(0, 0, 0, 0, Float.valueOf(C418440Gaw.LIZIZ(16)), null, LLJLIL, LLJL, 0, 288), new InterfaceC950803ne() { // from class: X.03uF
                    @Override // X.InterfaceC950803ne
                    public final void LIZ(View view, C950203nY c950203nY) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("SkuHeaderWrapper_tiktokec_banner_show_");
                        sbLIZ.append(c950203nY.LIZ);
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        Pair[] pairArr = new Pair[2];
                        String str = "sku";
                        pairArr[0] = new Pair("page_name", "sku");
                        if (this.LIZ.LJII().Hc0()) {
                            str = "skc";
                        }
                        pairArr[1] = new Pair("subpage_name", str);
                        C951103nh.LIZIZ(view, strLIZIZ, c950203nY, "c86850.d49589", C2097608Jq.LJIIIIZZ(pairArr));
                    }

                    @Override // X.InterfaceC950803ne
                    public final void LIZIZ(C950403na c950403na2, C950203nY c950203nY) {
                        if (c950203nY.LJIIIIZZ != null) {
                            SeaSkuPanelHeaderWidget seaSkuPanelHeaderWidget = this.LIZ;
                            SmartRouter.buildRoute(c950403na2.getContext(), c950203nY.LJIIIIZZ).open();
                            Pair[] pairArr = new Pair[2];
                            String str = "sku";
                            pairArr[0] = new Pair("page_name", "sku");
                            if (seaSkuPanelHeaderWidget.LJII().Hc0()) {
                                str = "skc";
                            }
                            pairArr[1] = new Pair("subpage_name", str);
                            C951103nh.LIZ(c950403na2, c950203nY, "c86850.d49589", C2097608Jq.LJIIIIZZ(pairArr));
                        }
                    }
                });
            }
            LJIIJ(false);
        }
        SmartImageView smartImageView = (SmartImageView) LJI(R.id.vhg);
        this.LLJIJIL = smartImageView;
        smartImageView.setColorFilter(Color.argb(8, 0, 0, 0), PorterDuff.Mode.SRC_OVER);
        SmartImageView smartImageView2 = this.LLJIJIL;
        if (smartImageView2 != null) {
            C786410Ut5.Q8(smartImageView2, new ACListenerS136S0100000_1(this, 10));
        }
        SmartImageView smartImageView3 = this.LLJIJIL;
        if (smartImageView3 != null) {
            C1748720vbi.LJFF(smartImageView3, new C10515049h(), AFwS185S0000000_1.get$arr$(125), AFwS228S0000000_1.get$arr$(363));
        }
        C1763620vzk c1763620vzk = (C1763620vzk) LJI(R.id.u4z);
        this.LLJILJIL = c1763620vzk;
        EnumC1763640vzm enumC1763640vzm = EnumC1763640vzm.FORCE_WRAP;
        int i = C1763620vzk.LLJILLL;
        C19ME c19me = null;
        c1763620vzk.B0(enumC1763640vzm, null);
        this.LLJILJILJ = (C953803o8) LJI(R.id.u4x);
        this.LLJILLL = (C430120Gtm) LJI(R.id.vhh);
        this.LLJJ = (C426350Gnh) LJI(R.id.vhi);
        AnonymousClass0473.LIZ(this, this.LLJILLL, this.LLJJ, this.LLJJJIL);
        this.LLJJI = (TuxTextView) LJI(R.id.vhj);
        View view = this.LLILZ;
        if (view != null) {
            C786410Ut5.I7(new ACListenerS136S0100000_1(this, 11), view);
        }
        if (C1867160ygk.LIZ()) {
            SmartImageView smartImageView4 = this.LLJIJIL;
            if (smartImageView4 != null) {
                ViewGroup.LayoutParams layoutParams = smartImageView4.getLayoutParams();
                layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(72));
                layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(72));
                C786410Ut5.G6(smartImageView4, layoutParams);
            }
            C426350Gnh c426350Gnh = this.LLJJ;
            if (c426350Gnh != null) {
                ViewGroup.LayoutParams layoutParams2 = c426350Gnh.getLayoutParams();
                if ((layoutParams2 instanceof C19ME) && (c19me = (C19ME) layoutParams2) != null) {
                    c19me.topToBottom = -1;
                    c19me.bottomToBottom = R.id.vhg;
                }
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c426350Gnh);
                c426350Gnh.setLayoutParams(c19me);
            }
            TuxTextView tuxTextView = this.LLJJI;
            if (tuxTextView != null) {
                C786410Ut5.LJLLLLLL(8, tuxTextView);
            }
        }
    }

    @Override // com.bytedance.widget.Widget
    public final int LIZLLL() {
        return this.LLJI;
    }

    public final void LJIIJ(boolean z) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        C950403na c950403na = this.LLJJIII;
        int i6 = 8;
        int i7 = 0;
        if (c950403na != null) {
            if (z) {
                i5 = 0;
            } else {
                i5 = 8;
            }
            int visibility = c950403na.getVisibility();
            c950403na.setVisibility(i5);
            C1602160rnK.LIZIZ(visibility, i5, c950403na);
        }
        ConstraintLayout constraintLayout = this.LLJJIJI;
        if (constraintLayout != null) {
            constraintLayout.setBackground((Drawable) this.LLJJIJIL.getValue());
        }
        View view = this.LLJJIJIIJIL;
        if (view != null) {
            if (z) {
                i6 = 0;
            }
            C786410Ut5.LJLLLLLL(i6, view);
        }
        ConstraintLayout constraintLayout2 = this.LLJJIJI;
        if (constraintLayout2 != null) {
            if (z) {
                i = LLJJJJLIIL;
                i2 = LLJJLIIIJLLLLLLLZ;
                i3 = LLJJL;
                i4 = LLJJLIIIJLLLLLLLZ;
            } else {
                i = 0;
                i2 = 0;
                i3 = 0;
                i4 = 0;
            }
            constraintLayout2.setPadding(i, i2, i3, i4);
        }
        ConstraintLayout constraintLayout3 = this.LLJJIJI;
        ViewGroup.LayoutParams layoutParams = null;
        if (constraintLayout3 != null) {
            layoutParams = constraintLayout3.getLayoutParams();
        }
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            if (z) {
                i7 = LLJJJJ;
            }
            marginLayoutParams.topMargin = i7;
            ConstraintLayout constraintLayout4 = this.LLJJIJI;
            if (constraintLayout4 != null) {
                C786410Ut5.m6(constraintLayout4, marginLayoutParams);
            }
        }
    }

    public final void LJIIJJI(C953503o5 c953503o5, String str) {
        if (str != null && !a0.LJJJIL(str)) {
            C1763620vzk c1763620vzk = this.LLJILJIL;
            if (c1763620vzk != null) {
                C0H1U.LIZIZ(c1763620vzk);
            }
            C953803o8 c953803o8 = this.LLJILJILJ;
            if (c953803o8 != null) {
                C12ES.LJIILL(0, c953803o8);
            }
            C953803o8 c953803o82 = this.LLJILJILJ;
            if (c953803o82 != null) {
                c953803o82.setText(str);
                return;
            }
            return;
        }
        C1763620vzk c1763620vzk2 = this.LLJILJIL;
        if (c1763620vzk2 != null) {
            C12ES.LJIILL(0, c1763620vzk2);
        }
        C953803o8 c953803o83 = this.LLJILJILJ;
        if (c953803o83 != null) {
            C0H1U.LIZIZ(c953803o83);
        }
        C1763620vzk c1763620vzk3 = this.LLJILJIL;
        if (c1763620vzk3 == null) {
            return;
        }
        c1763620vzk3.s0(c953503o5);
    }
}
