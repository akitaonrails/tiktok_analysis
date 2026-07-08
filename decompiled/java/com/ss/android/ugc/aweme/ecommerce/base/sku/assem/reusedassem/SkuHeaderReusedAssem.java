package com.ss.android.ugc.aweme.ecommerce.base.sku.assem.reusedassem;

import X.C01GW;
import X.C03C8;
import X.C046T;
import X.C04JC;
import X.C04JJ;
import X.C0H9H;
import X.C10463047h;
import X.C10476047u;
import X.C10526049s;
import X.C1421670n6D;
import X.C1697810uHb;
import X.C1744100vUG;
import X.C1761580vwS;
import X.C1763600vzi;
import X.C1766720w4k;
import X.C19719612Di;
import X.C2217381BqS;
import X.C2248361CzK;
import X.C384050F3z;
import X.C418440Gaw;
import X.C704102ox;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C814420VxA;
import X.C949003nM;
import X.InterfaceC10458047c;
import X.InterfaceC1744130vUJ;
import Y.ACListenerS136S0100000_1;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.CommonColor;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellingPointLabel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuPanelAssemVM;
import com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuState;
import com.ss.android.ugc.aweme.ecommerce.core.ab.EcomSkuPromotionAndScreenEfficiencyConfig;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import com.zhiliaoapp.musically.R;
import java.util.LinkedList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS284S0000000_1;
import kotlin.jvm.internal.AFwS326S0000000_1;
import kotlin.jvm.internal.AwS132S0101000_26;
import kotlin.jvm.internal.AwS150S1100000_1;
import kotlin.jvm.internal.AwS367S0200000_1;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.AwS615S0100000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class SkuHeaderReusedAssem extends SkuPanelBaseReusedAssem<SkuHeaderReusedAssem, C704102ox> implements InterfaceC10458047c {
    public C1766720w4k LLJLIL;
    public TuxTextView LLJLILLLLZIIL;
    public TuxTextView LLJLL;
    public TuxTextView LLJLLIL;
    public TuxTextView LLJLLL;
    public TuxTextView LLJZ;
    public LinearLayout LLJZIJLIL;
    public TuxTextView LLL;
    public TuxTextView LLLF;
    public TuxIconView LLLFF;
    public TuxTextView LLLFFI;
    public final int LLLFZ = 4;
    public C10526049s LLLI;
    public C10463047h LLLII;
    public LinearLayout LLLIIII;
    public SmartImageView LLLIIIIL;
    public ConstraintLayout LLLIIIL;
    public TuxTextView LLLIIL;
    public TuxTextView LLLIILIL;
    public RecyclerView LLLIL;
    public View LLLILZ;
    public C10476047u LLLILZJ;
    public TextView LLLILZLLLI;
    public C1744100vUG LLLIZZ;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.azh;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.sku.assem.reusedassem.SkuPanelBaseReusedAssem
    public final void zp() {
        SkuPanelAssemVM skuPanelAssemVMYp = getViewModel();
        skuPanelAssemVMYp.s60(new C2217381BqS() { // from class: X.047D
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((SkuState) obj).getOriginalPrice();
            }
        }, new AwS580S0100000_1((InterfaceC10458047c) this, 762));
        skuPanelAssemVMYp.TQ2(new C2217381BqS() { // from class: X.047E
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((SkuState) obj).getCurrentPrice();
            }
        }, new C2217381BqS() { // from class: X.046w
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((SkuState) obj).getCurrentPriceV2();
            }
        }, new AwS615S0100000_1(this, 193));
        skuPanelAssemVMYp.s60(new C2217381BqS() { // from class: X.046x
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((SkuState) obj).getPromotionView();
            }
        }, new AwS580S0100000_1((InterfaceC10458047c) this, 764));
        skuPanelAssemVMYp.TQ2(new C2217381BqS() { // from class: X.0479
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((SkuState) obj).getUnitPriceDescription();
            }
        }, new C2217381BqS() { // from class: X.047A
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((SkuState) obj).getTaxDescription();
            }
        }, new AwS615S0100000_1(this, 192));
        skuPanelAssemVMYp.s60(new C2217381BqS() { // from class: X.047B
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((SkuState) obj).getPricePrefix();
            }
        }, new AwS580S0100000_1((InterfaceC10458047c) this, 760));
        skuPanelAssemVMYp.s60(new C2217381BqS() { // from class: X.047C
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((SkuState) obj).getDepositFeeDesc();
            }
        }, new AwS580S0100000_1((InterfaceC10458047c) this, 761));
        SkuPanelAssemVM skuPanelAssemVMYp2 = getViewModel();
        C736680Sv4.LJIIIZ(this, skuPanelAssemVMYp2, new C2217381BqS() { // from class: X.046e
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((SkuState) obj).getProductTitle();
            }
        }, new C2217381BqS() { // from class: X.046Z
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((SkuState) obj).isPriceHidden());
            }
        }, null, AFwS326S0000000_1.get$arr$(6), 12);
        C736680Sv4.LJIIIIZZ(this, skuPanelAssemVMYp2, new C2217381BqS() { // from class: X.046f
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((SkuState) obj).getDiscountText();
            }
        }, null, AFwS284S0000000_1.get$arr$(14), 6);
        C736680Sv4.LJIIIIZZ(this, skuPanelAssemVMYp2, new C2217381BqS() { // from class: X.046a
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((SkuState) obj).isPriceHidden());
            }
        }, null, AFwS284S0000000_1.get$arr$(15), 6);
        C736680Sv4.LJIIIZ(this, skuPanelAssemVMYp2, new C2217381BqS() { // from class: X.046g
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((SkuState) obj).getCarouselImages();
            }
        }, new C2217381BqS() { // from class: X.046d
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((SkuState) obj).getCarouselNeedToScrollToFirst();
            }
        }, null, AFwS326S0000000_1.get$arr$(4), 12);
        getViewModel().Zf2();
        if (Intrinsics.LJFF(EcomSkuPromotionAndScreenEfficiencyConfig.LIZIZ().showPromotionLabel, Boolean.TRUE)) {
            skuPanelAssemVMYp2.s60(new C2217381BqS() { // from class: X.046Q
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((SkuState) obj).getPromotionLabelVO();
                }
            }, new AwS580S0100000_1(this, 267));
        }
        C736680Sv4.LJIIIIZZ(this, skuPanelAssemVMYp2, new C2217381BqS() { // from class: X.046R
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((SkuState) obj).getPriceAfterCoupon();
            }
        }, null, new AwS615S0100000_1(skuPanelAssemVMYp2, 62), 6);
        if (getViewModel().Zf2().LJIILJJIL()) {
            C736680Sv4.LJIIIIZZ(this, skuPanelAssemVMYp2, new C2217381BqS() { // from class: X.046S
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((SkuState) obj).getProductSellerInfo();
                }
            }, null, AFwS284S0000000_1.get$arr$(11), 6);
        }
        C736680Sv4.LJIIIIZZ(this, skuPanelAssemVMYp2, new C2217381BqS() { // from class: X.046b
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((SkuState) obj).getExtraInfoData();
            }
        }, null, AFwS284S0000000_1.get$arr$(12), 6);
        C736680Sv4.LJIIIIZZ(this, skuPanelAssemVMYp2, new C2217381BqS() { // from class: X.046c
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((SkuState) obj).getSkuPanelReminder();
            }
        }, null, AFwS284S0000000_1.get$arr$(13), 6);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.sku.assem.reusedassem.SkuPanelBaseReusedAssem
    public final void Ap() {
        TuxTextView tuxTextView;
        this.LLLIILIL = (TuxTextView) op(R.id.vhp);
        this.LLLIIL = (TuxTextView) op(R.id.vhd);
        this.LLLILZ = op(R.id.ry4);
        RecyclerView recyclerView = (RecyclerView) op(R.id.dgr);
        recyclerView.setMinimumHeight(((C046T) up()).LIZJ());
        this.LLLIL = recyclerView;
        C1766720w4k c1766720w4k = (C1766720w4k) op(R.id.yz4);
        if (EcomSkuPromotionAndScreenEfficiencyConfig.LIZ()) {
            c1766720w4k.setTuxFont(61);
            c1766720w4k.setTextColorRes(R.attr.a1i);
        }
        this.LLJLIL = c1766720w4k;
        this.LLJLILLLLZIIL = (TuxTextView) op(R.id.yz3);
        this.LLJLL = (TuxTextView) op(R.id.yz2);
        this.LLLFFI = (TuxTextView) op(R.id.yz1);
        this.LLJLLIL = (TuxTextView) op(R.id.vat_description);
        this.LLJLLL = (TuxTextView) op(R.id.unit_sku_price);
        this.LLJZ = (TuxTextView) op(R.id.vhn);
        this.LLJZIJLIL = (LinearLayout) op(R.id.vhu);
        this.LLL = (TuxTextView) op(R.id.vht);
        this.LLLFF = (TuxIconView) op(R.id.san);
        this.LLLF = (TuxTextView) op(R.id.sbd);
        this.LLLIIII = (LinearLayout) op(R.id.vgh);
        this.LLLIIIIL = (SmartImageView) op(R.id.hf_);
        this.LLLIIIL = (ConstraintLayout) op(R.id.rtx);
        this.LLLILZLLLI = (TextView) op(R.id.yys);
        if (EcomSkuPromotionAndScreenEfficiencyConfig.LIZ()) {
            C1766720w4k c1766720w4k2 = this.LLJLIL;
            if (c1766720w4k2 != null) {
                up();
                C0H9H.LJI(C046T.LJII(), c1766720w4k2);
            }
            TuxTextView tuxTextView2 = this.LLJLLL;
            if (tuxTextView2 != null) {
                up();
                C0H9H.LJI(C046T.LJIIIIZZ(), tuxTextView2);
            }
        }
        C1744100vUG c1744100vUG = new C1744100vUG(up(), getViewModel().LN(), getViewModel().MQ2());
        c1744100vUG.LLILZLL = new InterfaceC1744130vUJ() { // from class: X.046Y
            @Override // X.InterfaceC1744130vUJ
            public final void LIZ(int i) {
                C736680Sv4.LJIJJ(this.LIZ.getViewModel(), new AwS132S0101000_26(this.LIZ, i, 2));
            }
        };
        this.LLLIZZ = c1744100vUG;
        RecyclerView recyclerView2 = this.LLLIL;
        if (recyclerView2 != null) {
            recyclerView2.setLayoutManager(new LinearLayoutManager(recyclerView2.getContext(), 0, false));
            recyclerView2.setAdapter(c1744100vUG);
            recyclerView2.setNestedScrollingEnabled(false);
            recyclerView2.setItemAnimator(null);
            recyclerView2.addOnScrollListener(new C1761580vwS(this, c1744100vUG));
            recyclerView2.addItemDecoration(new C04JC(11));
        }
        RecyclerView recyclerView3 = this.LLLIL;
        if (recyclerView3 != null) {
            recyclerView3.setHasFixedSize(true);
        }
        C786410Ut5.I7(new ACListenerS136S0100000_1(this, 9), getContentView());
        if (!Intrinsics.LJFF(EcomSkuPromotionAndScreenEfficiencyConfig.LIZIZ().showPromotionLabel, Boolean.TRUE) || (tuxTextView = this.LLL) == null) {
            return;
        }
        tuxTextView.addOnLayoutChangeListener(new C04JJ(this, 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [X.0sYq] */
    /* JADX WARN: Type inference failed for: r12v2, types: [android.util.AttributeSet] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, kotlin.Unit] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(Object obj) {
        TextView textView;
        int i;
        LinearLayout.LayoutParams layoutParams;
        Integer numLJ;
        String token;
        View viewLJLLLL;
        C704102ox c704102ox = (C704102ox) obj;
        ?? r12 = 0;
        r12 = 0;
        r12 = 0;
        if (this.LLLILZJ == null) {
            ViewStub viewStub = (ViewStub) op(R.id.wcd);
            if (viewStub != null) {
                viewLJLLLL = C786410Ut5.LJLLLL(viewStub);
            } else {
                viewLJLLLL = null;
            }
            this.LLLILZJ = (C10476047u) viewLJLLLL;
        }
        C10476047u c10476047u = this.LLLILZJ;
        int i2 = 0;
        if (c10476047u != null) {
            String skuId = getViewModel().getSkuId();
            List<SellingPointLabel> list = c704102ox.LLILLJJLI;
            LinearLayout linearLayout = c10476047u.LL;
            LinkedList<TuxTextView> linkedList = c10476047u.LLILLJJLI;
            while (linearLayout.getChildCount() > 0) {
                C786410Ut5.LJJLIL(0, linearLayout);
                ?? r1 = Unit.LIZ;
                if (r1 instanceof TuxTextView) {
                    linkedList.add((TuxTextView) r1);
                }
            }
            if (list != null && !list.isEmpty()) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, c10476047u);
            if (list != null) {
                int i3 = 0;
                for (SellingPointLabel sellingPointLabel : list) {
                    int i4 = i3 + 1;
                    if (i3 >= 0) {
                        SellingPointLabel sellingPointLabel2 = sellingPointLabel;
                        TuxTextView tuxTextView = (TuxTextView) C19719612Di.LJJIIZI(c10476047u.LLILLJJLI);
                        if (tuxTextView == null) {
                            tuxTextView = new TuxTextView(c10476047u.getContext(), r12, 6, i2);
                            C786410Ut5.R6(tuxTextView, new LinearLayout.LayoutParams(-2, -2));
                            Integer num = sellingPointLabel2.style;
                            if (num != null && num.intValue() == 1) {
                                tuxTextView.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)));
                                CommonColor commonColor = sellingPointLabel2.backgroundColor;
                                if (commonColor != null && (token = commonColor.getToken()) != null) {
                                    C01GW c01gw = C2248361CzK.LIZ;
                                    numLJ = C2248361CzK.LJ(tuxTextView.getContext(), token);
                                } else {
                                    numLJ = null;
                                }
                                C384050F3z c384050F3z = new C384050F3z();
                                c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(4));
                                c384050F3z.LIZ = numLJ;
                                tuxTextView.setBackground(c384050F3z.LIZ(tuxTextView.getContext()));
                            }
                            int i5 = C1763600vzi.LLJLLIL;
                            C949003nM.LIZ(tuxTextView, sellingPointLabel2.text, "lockup_selling_point_label");
                        }
                        if (i3 < list.size() - 1) {
                            ViewGroup.LayoutParams layoutParams2 = tuxTextView.getLayoutParams();
                            if (layoutParams2 instanceof LinearLayout.LayoutParams) {
                                layoutParams = (LinearLayout.LayoutParams) layoutParams2;
                                if (layoutParams != null) {
                                    layoutParams.rightMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                                }
                            } else {
                                layoutParams = null;
                            }
                            C786410Ut5.R6(tuxTextView, layoutParams);
                        }
                        c10476047u.LL.addView(tuxTextView);
                        C1421670n6D.LIZIZ(tuxTextView, new AwS150S1100000_1(skuId, sellingPointLabel2, 15), new AwS367S0200000_1(tuxTextView, sellingPointLabel2, 265));
                        i3 = i4;
                        r12 = 0;
                        i2 = 0;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
            }
        }
        ECRichText eCRichText = c704102ox.LLILLL;
        if (eCRichText != null && (textView = this.LLLILZLLLI) != null) {
            C786410Ut5.LJLLLLLL(i2, textView);
            C03C8.LIZJ(textView, eCRichText, "lockup_shipping_info", r12);
        } else {
            TextView textView2 = this.LLLILZLLLI;
            if (textView2 == null) {
                return;
            }
            C786410Ut5.LJLLLLLL(8, textView2);
        }
    }
}
