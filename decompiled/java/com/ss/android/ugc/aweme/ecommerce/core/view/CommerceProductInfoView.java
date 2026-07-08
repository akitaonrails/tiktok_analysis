package com.ss.android.ugc.aweme.ecommerce.core.view;

import X.C03C8;
import X.C03DZ;
import X.C04H0;
import X.C04H1;
import X.C0C64;
import X.C0H9H;
import X.C1008503wx;
import X.C10287040n;
import X.C1070804Gs;
import X.C1071004Gu;
import X.C1326790kdB;
import X.C1331670kl3;
import X.C16F2;
import X.C1755600vmo;
import X.C1758040vqk;
import X.C1758080vqo;
import X.C1766780w4q;
import X.C21375518kz;
import X.C418440Gaw;
import X.C426350Gnh;
import X.C430110Gtl;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1338240kve;
import X.EnumC21376018l4;
import X.InterfaceC10322041w;
import X.InterfaceC1071204Gw;
import X.InterfaceC1071304Gx;
import X.InterfaceC1071404Gy;
import X.InterfaceC1071504Gz;
import X.InterfaceC430130Gtn;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.google.gson.k;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BNPLTopWidget;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpPaymentModule;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PickTag;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductDetailReview;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionLabelUiStyleModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionLabelVO;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SEACCIPaymentModule;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SeaPaymentInstallmentPlan;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.libra.EcSeaPdpPromotionLabelsTypeBanDictSettings;
import com.ss.android.ugc.aweme.ecommerce.core.view.CommerceProductInfoView;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionLabel;
import com.zhiliaoapp.musically.R;
import g1c.AjS20S0300000_1;
import g1c.AjS40S0200000_1;
import g1c.AjS60S0100000_1;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS402S0200000_1;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.Intrinsics;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes2.dex */
public final class CommerceProductInfoView extends FrameLayout {
    public static final int LLJLIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
    public final LinearLayout LL;
    public final SmartImageView LLILLJJLI;
    public final TuxTextView LLILLL;
    public final LinearLayout LLILZ;
    public final TuxIconView LLILZIL;
    public final SmartImageView LLILZLL;
    public final TuxTextView LLIZ;
    public final TuxIconView LLIZLLLIL;
    public final LinearLayout LLJ;
    public final TuxTextView LLJI;
    public final ConstraintLayout LLJIJIL;
    public final C426350Gnh LLJILJIL;
    public final TuxIconView LLJILJILJ;
    public final C1766780w4q LLJILLL;
    public final TuxIconView LLJJ;
    public final C1070804Gs LLJJI;
    public InterfaceC10322041w LLJJIII;
    public InterfaceC1071304Gx LLJJIJI;
    public InterfaceC1071204Gw LLJJIJIIJIL;
    public C04H1 LLJJIJIL;
    public InterfaceC1071404Gy LLJJJ;
    public InterfaceC1071504Gz LLJJJIL;
    public C04H0 LLJJJJ;
    public C1008503wx LLJJJJJIL;
    public List<PromotionLabel> LLJJJJLIIL;
    public String LLJJL;
    public List<String> LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;

    public final int getTitleFoldMaxLines() {
        return this.LLJILLL.getFoldMaxLine();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0044 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0016 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<java.lang.String> LIZ(X.C1008503wx r6) {
        /*
            r5 = this;
            android.content.Context r0 = r5.getContext()
            boolean r4 = X.C960203pA.LIZIZ(r0)
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionLogo> r0 = r6.LJ
            r3 = 0
            if (r0 == 0) goto L57
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r0.iterator()
        L16:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L57
            java.lang.Object r1 = r2.next()
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionLogo r1 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionLogo) r1
            if (r4 == 0) goto L48
            com.ss.android.ugc.aweme.ecommerce.service.vo.Image r0 = r1.darkModeImage
            if (r0 == 0) goto L34
            java.util.List r0 = r0.getUrls()
            if (r0 == 0) goto L34
            java.lang.Object r0 = X.C13LP.LJJJLL(r0)
            if (r0 != 0) goto L44
        L34:
            com.ss.android.ugc.aweme.ecommerce.service.vo.Image r0 = r1.image
            if (r0 == 0) goto L16
            java.util.List r0 = r0.getUrls()
            if (r0 == 0) goto L16
            java.lang.Object r0 = X.C13LP.LJJJLL(r0)
        L42:
            if (r0 == 0) goto L16
        L44:
            r3.add(r0)
            goto L16
        L48:
            com.ss.android.ugc.aweme.ecommerce.service.vo.Image r0 = r1.image
            if (r0 == 0) goto L16
            java.util.List r0 = r0.getUrls()
            if (r0 == 0) goto L16
            java.lang.Object r0 = X.C13LP.LJJJLL(r0)
            goto L42
        L57:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.core.view.CommerceProductInfoView.LIZ(X.03wx):java.util.List");
    }

    public final void LIZLLL(int i) {
        C1008503wx c1008503wx;
        if (this.LLJILLL.getFoldMaxLine() != i && (c1008503wx = this.LLJJJJJIL) != null) {
            C1766780w4q.LJJL(this.LLJILLL, c1008503wx.LIZ, LIZ(c1008503wx), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(15)), i);
        }
    }

    public final void setBNPLListener(InterfaceC10322041w interfaceC10322041w) {
        this.LLJJIII = interfaceC10322041w;
    }

    public final void setCCIListener(InterfaceC1071304Gx interfaceC1071304Gx) {
        this.LLJJIJI = interfaceC1071304Gx;
    }

    public final void setFavoriteListener(InterfaceC1071404Gy interfaceC1071404Gy) {
        this.LLJJJ = interfaceC1071404Gy;
    }

    public final void setPromotionLabelsListener(InterfaceC1071204Gw interfaceC1071204Gw) {
        this.LLJJIJIIJIL = interfaceC1071204Gw;
    }

    public final void setRatingListener(InterfaceC1071504Gz interfaceC1071504Gz) {
        this.LLJJJIL = interfaceC1071504Gz;
    }

    public final void setSalesInfoListener(C04H0 c04h0) {
        this.LLJJJJ = c04h0;
    }

    public final void setTitleListener(C04H1 c04h1) {
        this.LLJJIJIL = c04h1;
    }

    public CommerceProductInfoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C1755600vmo.LIZ.getClass();
        C1755600vmo.LIZ(R.layout.asr, context, this, true, false);
        this.LL = (LinearLayout) findViewById(R.id.doh);
        this.LLILLJJLI = (SmartImageView) findViewById(R.id.doi);
        this.LLILLL = (TuxTextView) findViewById(R.id.doj);
        this.LLILZ = (LinearLayout) findViewById(R.id.eig);
        this.LLILZIL = (TuxIconView) findViewById(R.id.la6);
        this.LLILZLL = (SmartImageView) findViewById(R.id.la5);
        this.LLIZ = (TuxTextView) findViewById(R.id.eii);
        this.LLIZLLLIL = (TuxIconView) findViewById(R.id.eih);
        this.LLJ = (LinearLayout) findViewById(R.id.eik);
        this.LLJI = (TuxTextView) findViewById(R.id.eij);
        this.LLJIJIL = (ConstraintLayout) findViewById(R.id.q7c);
        C426350Gnh c426350Gnh = (C426350Gnh) findViewById(R.id.twl);
        this.LLJILJIL = c426350Gnh;
        this.LLJILJILJ = (TuxIconView) findViewById(R.id.q7d);
        c426350Gnh.setListener(new InterfaceC430130Gtn() { // from class: X.04Gv
            @Override // X.InterfaceC430130Gtn
            public final void LIZIZ(int i) {
            }

            @Override // X.InterfaceC430130Gtn
            public final void LIZJ(View view, int i) {
                InterfaceC1071204Gw interfaceC1071204Gw;
                PromotionLabelVO promotionLabelVO;
                PromotionLabel promotionLabel;
                CommerceProductInfoView commerceProductInfoView;
                InterfaceC1071204Gw interfaceC1071204Gw2;
                String str;
                PromotionLabelVO promotionLabelVO2;
                List<PromotionLabel> list = this.LIZ.LLJJJJLIIL;
                String str2 = null;
                if (list != null && (promotionLabel = (PromotionLabel) C13LP.LJJJLZIJ(i, list)) != null && (interfaceC1071204Gw2 = (commerceProductInfoView = this.LIZ).LLJJIJIIJIL) != null) {
                    C1008503wx c1008503wx = commerceProductInfoView.LLJJJJJIL;
                    if (c1008503wx != null && (promotionLabelVO2 = c1008503wx.LJIIJJI) != null) {
                        str = promotionLabelVO2.daInfo;
                    } else {
                        str = null;
                    }
                    interfaceC1071204Gw2.LIZLLL(view, i, promotionLabel, str);
                }
                CommerceProductInfoView commerceProductInfoView2 = this.LIZ;
                List<PromotionLabel> list2 = commerceProductInfoView2.LLJJJJLIIL;
                if (list2 != null && (interfaceC1071204Gw = commerceProductInfoView2.LLJJIJIIJIL) != null) {
                    C426350Gnh c426350Gnh2 = commerceProductInfoView2.LLJILJIL;
                    C1008503wx c1008503wx2 = commerceProductInfoView2.LLJJJJJIL;
                    if (c1008503wx2 != null && (promotionLabelVO = c1008503wx2.LJIIJJI) != null) {
                        str2 = promotionLabelVO.daInfo;
                    }
                    interfaceC1071204Gw.LIZJ(c426350Gnh2, list2, false, str2);
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:29:0x0053  */
            @Override // X.InterfaceC430130Gtn
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ(android.view.View r12, int r13, X.C21376318l7 r14) {
                /*
                    r11 = this;
                    com.ss.android.ugc.aweme.ecommerce.core.view.CommerceProductInfoView r0 = r11.LIZ
                    java.util.List<com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionLabel> r0 = r0.LLJJJJLIIL
                    if (r0 == 0) goto L52
                    r7 = r13
                    java.lang.Object r8 = X.C13LP.LJJJLZIJ(r7, r0)
                    com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionLabel r8 = (com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionLabel) r8
                    if (r8 == 0) goto L52
                    com.ss.android.ugc.aweme.ecommerce.core.view.CommerceProductInfoView r4 = r11.LIZ
                    X.04Gw r5 = r4.LLJJIJIIJIL
                    if (r5 == 0) goto L52
                    r10 = 0
                    if (r14 == 0) goto L53
                    java.util.List<X.18l8> r0 = r14.LIZ
                    java.lang.Object r0 = X.C13LP.LJJJLL(r0)
                    X.18l8 r0 = (X.C21376418l8) r0
                    r9 = 1
                    if (r0 == 0) goto L53
                    java.util.List<X.18l0> r0 = r0.LIZ
                    if (r0 == 0) goto L53
                    java.util.Iterator r3 = r0.iterator()
                L2b:
                    boolean r0 = r3.hasNext()
                    if (r0 == 0) goto L53
                    java.lang.Object r2 = r3.next()
                    r0 = r2
                    X.18l0 r0 = (X.C21375618l0) r0
                    X.0wPX r1 = r0.LIZ
                    X.0wPX r0 = X.EnumC1779610wPX.TAG_ICON
                    if (r1 == r0) goto L42
                    X.0wPX r0 = X.EnumC1779610wPX.TAG_TILE_IMAGE
                    if (r1 != r0) goto L2b
                L42:
                    if (r2 == 0) goto L53
                L44:
                    X.03wx r0 = r4.LLJJJJJIL
                    if (r0 == 0) goto L4e
                    com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionLabelVO r0 = r0.LJIIJJI
                    if (r0 == 0) goto L4e
                    java.lang.String r10 = r0.daInfo
                L4e:
                    r6 = r12
                    r5.LIZ(r6, r7, r8, r9, r10)
                L52:
                    return
                L53:
                    r9 = 0
                    goto L44
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1071104Gv.LIZ(android.view.View, int, X.18l7):void");
            }
        });
        this.LLJILLL = (C1766780w4q) findViewById(R.id.j3o);
        this.LLJJ = (TuxIconView) findViewById(R.id.hq8);
        this.LLJJI = (C1070804Gs) findViewById(R.id.hiy);
    }

    public static void LIZIZ(String str, String str2, boolean z) {
        C1758040vqk c1758040vqkLIZ;
        if (str != null && (c1758040vqkLIZ = C10287040n.LIZ(str)) != null) {
            if (z) {
                C1758080vqo c1758080vqo = c1758040vqkLIZ.LJ;
                if (c1758080vqo != null || (c1758080vqo = c1758040vqkLIZ.LJFF) != null) {
                    c1758080vqo.LJ(str2, "GodaV1", false);
                    return;
                }
                return;
            }
            C1758080vqo c1758080vqo2 = c1758040vqkLIZ.LJ;
            if (c1758080vqo2 == null && (c1758080vqo2 = c1758040vqkLIZ.LJFF) == null) {
                return;
            }
            c1758080vqo2.LJFF(str2, "GodaV1");
        }
    }

    public final void LIZJ(C1008503wx c1008503wx, int i, String str) {
        String str2;
        boolean z;
        SeaPaymentInstallmentPlan seaPaymentInstallmentPlan;
        BNPLTopWidget bNPLTopWidget;
        Image imageRequireImageForEcDarkMode;
        int i2;
        float fFloatValue;
        String str3;
        Float f;
        int i3;
        int i4;
        List<PromotionLabel> list;
        k kVarLJJIIZ;
        this.LLJJJJJIL = c1008503wx;
        PickTag pickTag = c1008503wx.LIZLLL;
        ArrayList arrayList = null;
        if (pickTag != null) {
            str2 = pickTag.name;
        } else {
            str2 = null;
        }
        if (str2 != null && str2.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z || c1008503wx.LJIIIIZZ || ((kVarLJJIIZ = C1071004Gu.LIZJ().LJJIIZ("lockup_split_version")) != null && kVarLJJIIZ.LJIIJJI() >= 3)) {
            C03DZ.LIZ(this.LL);
        } else {
            C03DZ.LIZJ(this.LL);
            if (C1071004Gu.LIZIZ().LIZ()) {
                ViewGroup.LayoutParams layoutParams = this.LLILLJJLI.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.width = LLJLIL;
                }
                ViewGroup.LayoutParams layoutParams2 = this.LLILLJJLI.getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.height = LLJLIL;
                }
                this.LLILLL.setTuxFont(72);
                this.LLILLL.setTextColorRes(R.attr.a1q);
            }
            C1326790kdB c1326790kdB = C1326790kdB.LIZ;
            Image image = c1008503wx.LIZLLL.icon;
            c1326790kdB.getClass();
            C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(image);
            c1331670kl3LIZLLL.LJJI(this.LLILLJJLI);
            c1331670kl3LIZLLL.LJIIJJI();
            this.LLILLL.setText(c1008503wx.LIZLLL.name);
        }
        k kVarLJJIIZ2 = C1071004Gu.LIZJ().LJJIIZ("lockup_split_version");
        if (kVarLJJIIZ2 != null && kVarLJJIIZ2.LJIIJJI() >= 3) {
            C03DZ.LIZ(this.LLILZ);
            C03DZ.LIZ(this.LLJ);
        } else {
            PdpPaymentModule pdpPaymentModule = c1008503wx.LJIIIZ;
            if (pdpPaymentModule != null && (bNPLTopWidget = pdpPaymentModule.bnplTopWidget) != null) {
                LIZIZ(str, "bnpl_top_widget_old", false);
                C03DZ.LIZJ(this.LLILZ);
                C0H9H.LJI(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), this.LLILZ);
                Icon icon = bNPLTopWidget.startIcon;
                if (icon != null && (imageRequireImageForEcDarkMode = icon.requireImageForEcDarkMode(this.LLILZLL.getContext())) != null) {
                    C03DZ.LIZ(this.LLILZIL);
                    C03DZ.LIZJ(this.LLILZLL);
                    C1326790kdB.LIZ.getClass();
                    C1331670kl3 c1331670kl3LJ = C1326790kdB.LJ(imageRequireImageForEcDarkMode);
                    c1331670kl3LJ.LJJ = EnumC1338240kve.FIT_CENTER;
                    c1331670kl3LJ.LJJ(this.LLILZLL);
                    c1331670kl3LJ.LJIIJJI();
                } else {
                    C03DZ.LIZJ(this.LLILZIL);
                    C03DZ.LIZ(this.LLILZLL);
                }
                InterfaceC10322041w interfaceC10322041w = this.LLJJIII;
                if (interfaceC10322041w != null) {
                    interfaceC10322041w.LIZ(this.LLILZ);
                }
                C03C8.LIZJ(this.LLIZ, bNPLTopWidget.text, "pdp_bnpl_top_widget", null);
                C786410Ut5.I7(new AjS20S0300000_1(this, bNPLTopWidget, c1008503wx, 33), this.LLILZ);
                LIZIZ(str, "bnpl_top_widget_old", true);
            } else {
                C03DZ.LIZ(this.LLILZ);
            }
            SEACCIPaymentModule sEACCIPaymentModule = c1008503wx.LJIIJ;
            if (sEACCIPaymentModule != null && (seaPaymentInstallmentPlan = sEACCIPaymentModule.cciTopWidget) != null) {
                LIZIZ(str, "cci_top_widget_old", false);
                C03DZ.LIZJ(this.LLJ);
                InterfaceC1071304Gx interfaceC1071304Gx = this.LLJJIJI;
                if (interfaceC1071304Gx != null) {
                    interfaceC1071304Gx.LIZIZ(this, c1008503wx.LJIIJ);
                }
                C03C8.LIZJ(this.LLJI, seaPaymentInstallmentPlan.cciInterestTitle, "sea_pdp_cci_top_widget", null);
                C786410Ut5.I7(new AjS40S0200000_1(this, c1008503wx, 51), this.LLJ);
                LIZIZ(str, "cci_top_widget_old", true);
            } else {
                C03DZ.LIZ(this.LLJ);
            }
        }
        PromotionLabelVO promotionLabelVO = c1008503wx.LJIIJJI;
        if (promotionLabelVO != null && (list = promotionLabelVO.promotionLabels) != null) {
            arrayList = new ArrayList();
            for (PromotionLabel promotionLabel : list) {
                if (!EcSeaPdpPromotionLabelsTypeBanDictSettings.LIZ().productDetailBanList.contains(Integer.valueOf(promotionLabel.type))) {
                    arrayList.add(promotionLabel);
                }
            }
        }
        if (!Intrinsics.LJFF(this.LLJJJJLIIL, arrayList)) {
            this.LLJJJJLIIL = arrayList;
            ConstraintLayout constraintLayout = this.LLJIJIL;
            if (arrayList != null && (!arrayList.isEmpty())) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            C786410Ut5.LJLLLLLL(i3, constraintLayout);
            if (arrayList != null && (!arrayList.isEmpty())) {
                C426350Gnh c426350Gnh = this.LLJILJIL;
                int i5 = C21375518kz.LIZ;
                c426350Gnh.LIZJ(C21375518kz.LIZ(arrayList, EnumC21376018l4.LARGE));
                TuxIconView tuxIconView = this.LLJILJILJ;
                if (tuxIconView != null) {
                    PromotionLabelUiStyleModel promotionLabelUiStyleModel = c1008503wx.LJIIJJI.uiStyle;
                    if (promotionLabelUiStyleModel != null && Intrinsics.LJFF(promotionLabelUiStyleModel.hideArrow, Boolean.TRUE)) {
                        i4 = 4;
                    } else {
                        i4 = 0;
                    }
                    C786410Ut5.LLLLLLZZ(tuxIconView, i4);
                }
                C786410Ut5.I7(new AjS40S0200000_1(this, arrayList, 52), this.LLJIJIL);
                C430110Gtl.LIZ(this.LLJILJIL, new AwS402S0200000_1(this, (CommerceProductInfoView) arrayList, (List<PromotionLabel>) 41));
            }
        }
        this.LLJILLL.setNeedExpandDesc(true);
        List<String> listLIZ = LIZ(c1008503wx);
        if (!Intrinsics.LJFF(this.LLJJL, c1008503wx.LIZ) || !Intrinsics.LJFF(this.LLJJLIIIJLLLLLLLZ, listLIZ)) {
            C1766780w4q c1766780w4q = this.LLJILLL;
            int i6 = Integer.MAX_VALUE;
            if (i != Integer.MAX_VALUE) {
                i6 = i + 1;
            }
            c1766780w4q.setMaxLines(i6);
            C1766780w4q.LJJL(this.LLJILLL, c1008503wx.LIZ, LIZ(c1008503wx), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(15)), i);
            this.LLJJLIIIJLLLLLLLZ = listLIZ;
            this.LLJJL = c1008503wx.LIZ;
            C04H1 c04h1 = this.LLJJIJIL;
            if (c04h1 != null) {
                c04h1.LIZIZ();
            }
        }
        C786410Ut5.I7(new AjS60S0100000_1(this, 81), this.LLJILLL);
        Boolean bool = c1008503wx.LJI;
        if (bool == null) {
            C03DZ.LIZ(this.LLJJ);
        } else {
            this.LLJL = bool.booleanValue();
            C03DZ.LIZJ(this.LLJJ);
            TuxIconView tuxIconView2 = this.LLJJ;
            if (c1008503wx.LJI.booleanValue()) {
                i2 = R.raw.icon_bookmark_fill;
            } else {
                i2 = R.raw.icon_bookmark;
            }
            tuxIconView2.setIconRes(i2);
            InterfaceC1071404Gy interfaceC1071404Gy = this.LLJJJ;
            if (interfaceC1071404Gy != null) {
                interfaceC1071404Gy.LIZ();
            }
            C786410Ut5.I7(new AjS60S0100000_1(this, 80), this.LLJJ);
            C430110Gtl.LIZ(this.LLJJ, new AwS545S0100000_1(this, 1589));
        }
        this.LLJJI.setSalesInfoListener(this.LLJJJJ);
        this.LLJJI.setSales(c1008503wx.LIZIZ);
        this.LLJJI.setRatingListener(this.LLJJJIL);
        C1070804Gs c1070804Gs = this.LLJJI;
        ProductDetailReview productDetailReview = c1008503wx.LIZJ;
        if (productDetailReview != null && (f = productDetailReview.rating) != null) {
            fFloatValue = f.floatValue();
        } else {
            fFloatValue = 0.0f;
        }
        ProductDetailReview productDetailReview2 = c1008503wx.LIZJ;
        if (productDetailReview2 == null || (str3 = productDetailReview2.reviewCountStr) == null) {
            str3 = "";
        }
        c1070804Gs.getClass();
        if (fFloatValue == 0.0f) {
            C03DZ.LIZ(c1070804Gs.LLILZ);
            C03DZ.LIZ(c1070804Gs.LLILZIL);
            C03DZ.LIZ(c1070804Gs.LLILZLL);
            C03DZ.LIZ(c1070804Gs.LLIZ);
        } else {
            C03DZ.LIZJ(c1070804Gs.LLILZ);
            if (c1070804Gs.LLILLJJLI.getVisibility() == 0) {
                C03DZ.LIZJ(c1070804Gs.LLILZIL);
            }
            C03DZ.LIZJ(c1070804Gs.LLILZLL);
            if (C1071004Gu.LIZIZ().LIZ()) {
                TuxIconView tuxIconView3 = c1070804Gs.LLILZ;
                ViewGroup.LayoutParams layoutParams3 = tuxIconView3.getLayoutParams();
                if (layoutParams3 != null) {
                    layoutParams3.width = C1070804Gs.LLJI;
                }
                ViewGroup.LayoutParams layoutParams4 = tuxIconView3.getLayoutParams();
                if (layoutParams4 != null) {
                    layoutParams4.height = C1070804Gs.LLJI;
                }
                tuxIconView3.requestLayout();
                c1070804Gs.LLILZLL.setStyle(7);
            }
            c1070804Gs.LLILZLL.getScore().setText(String.valueOf(fFloatValue));
            if (C0C64.LJIILLIIL().LJIIIZ(31744, "ecom_pdp_display_review_quantity", true, false)) {
                C03DZ.LIZJ(c1070804Gs.LLIZ);
                c1070804Gs.LLIZ.setText(e3.h + str3 + ')');
                C786410Ut5.I7(new AjS60S0100000_1(c1070804Gs, 77), c1070804Gs.LLIZ);
            } else {
                C03DZ.LIZ(c1070804Gs.LLIZ);
            }
            C786410Ut5.I7(new AjS60S0100000_1(c1070804Gs, 78), c1070804Gs.LLILZ);
            C786410Ut5.I7(new AjS60S0100000_1(c1070804Gs, 79), c1070804Gs.LLILZLL);
            C16F2 c16f2 = c1070804Gs.LLILZLL;
            C786410Ut5.LLLLZLL(c16f2.getMaxScore(), 8);
            C786410Ut5.LLLLZLL(c16f2.getDivider(), 8);
            InterfaceC1071504Gz interfaceC1071504Gz = c1070804Gs.LLIZLLLIL;
            if (interfaceC1071504Gz != null) {
                interfaceC1071504Gz.LIZIZ();
            }
        }
        c1070804Gs.LIZ();
        if (Intrinsics.LJFF(c1008503wx.LJFF, Boolean.TRUE)) {
            C03DZ.LIZ(this.LLJJI);
        }
    }
}
