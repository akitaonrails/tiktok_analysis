package com.ss.android.ugc.aweme.ecommerce.base.sku.assem.reusedassem;

import X.AbstractC1700220uLU;
import X.C044M;
import X.C046T;
import X.C04JY;
import X.C0H1U;
import X.C0H9H;
import X.C1308910kAL;
import X.C1744700vVE;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C384050F3z;
import X.C418440Gaw;
import X.C704402p0;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C814420VxA;
import Y.ACListenerS136S0100000_1;
import Y.ATListenerS333S0200000_1;
import android.content.Context;
import android.text.method.NumberKeyListener;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuCommonConfig;
import com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuPanelAssemVM;
import com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuState;
import com.ss.android.ugc.aweme.ecommerce.core.ab.EcomSkuPromotionAndScreenEfficiencyConfig;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS284S0000000_1;
import kotlin.jvm.internal.AwS367S0200000_1;
import kotlin.jvm.internal.AwS437S0200000_1;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.AwS615S0100000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class SkuCounterReusedAssem extends SkuPanelBaseReusedAssem<SkuCounterReusedAssem, C704402p0> implements C044M {
    public TuxIconView LLJLIL;
    public TuxIconView LLJLILLLLZIIL;
    public EditText LLJLL;
    public TuxTextView LLJLLIL;
    public LinearLayout LLJLLL;
    public long LLJZ = -1;
    public int LLJZIJLIL = -1;
    public LinearLayout LLL;
    public View LLLF;
    public View LLLFF;
    public TuxTextView LLLFFI;
    public TuxTextView LLLFZ;
    public TuxTextView LLLI;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.az0;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.sku.assem.reusedassem.SkuPanelBaseReusedAssem
    public final void zp() {
        SkuPanelAssemVM skuPanelAssemVMYp = getViewModel();
        skuPanelAssemVMYp.s60(new C2217381BqS() { // from class: X.044K
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((SkuState) obj).getCounterDisclaimer();
            }
        }, new AwS580S0100000_1((C044M) this, 571));
        skuPanelAssemVMYp.TQ2(new C2217381BqS() { // from class: X.045S
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((SkuState) obj).getSkuStockInfo();
            }
        }, new C2217381BqS() { // from class: X.043n
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((SkuState) obj).isQuantityEditable());
            }
        }, new AwS615S0100000_1(this, 163));
        skuPanelAssemVMYp.TQ2(new C2217381BqS() { // from class: X.0441
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((SkuState) obj).getCurrentQuantity();
            }
        }, new C2217381BqS() { // from class: X.0442
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((SkuState) obj).getCurrentQuantityLimit();
            }
        }, new AwS437S0200000_1(skuPanelAssemVMYp, this, 20));
        skuPanelAssemVMYp.s60(new C2217381BqS() { // from class: X.043r
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((SkuState) obj).getKeyBoardVisibility();
            }
        }, new AwS367S0200000_1(skuPanelAssemVMYp, this, 230));
        SkuPanelAssemVM skuPanelAssemVMYp2 = getViewModel();
        C736680Sv4.LJIIIIZZ(this, skuPanelAssemVMYp2, new C2217381BqS() { // from class: X.043t
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((SkuState) obj).getQuantityNoticeInfos();
            }
        }, null, AFwS284S0000000_1.get$arr$(9), 6);
        C736680Sv4.LJIIIIZZ(this, skuPanelAssemVMYp2, new C2217381BqS() { // from class: X.043m
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((SkuState) obj).isQuantityEditable());
            }
        }, null, AFwS284S0000000_1.get$arr$(10), 6);
    }

    public final EditText Bp() {
        EditText editText = this.LLJLL;
        if (editText != null) {
            return editText;
        }
        return null;
    }

    public final TuxIconView Ep() {
        TuxIconView tuxIconView = this.LLJLIL;
        if (tuxIconView != null) {
            return tuxIconView;
        }
        return null;
    }

    public final TuxIconView Fp() {
        TuxIconView tuxIconView = this.LLJLILLLLZIIL;
        if (tuxIconView != null) {
            return tuxIconView;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.sku.assem.reusedassem.SkuPanelBaseReusedAssem
    public final void Ap() {
        Integer numLIZJ;
        SkuCommonConfig skuCommonConfig;
        this.LLLF = op(R.id.mjs);
        this.LLLFF = op(R.id.tkz);
        this.LLLFFI = (TuxTextView) op(R.id.vhc);
        this.LLJLIL = (TuxIconView) op(R.id.vha);
        this.LLJLILLLLZIIL = (TuxIconView) op(R.id.vhb);
        this.LLJLL = (EditText) op(R.id.vh_);
        this.LLJLLIL = (TuxTextView) op(R.id.vh9);
        this.LLJLLL = (LinearLayout) op(R.id.vhl);
        this.LLL = (LinearLayout) op(R.id.vgd);
        this.LLLFZ = (TuxTextView) op(R.id.pd6);
        this.LLLI = (TuxTextView) op(R.id.pd5);
        View viewLJJIJL = LJJIJL();
        if (EcomSkuPromotionAndScreenEfficiencyConfig.LIZ()) {
            up();
            C0H1U.LJIIJ(C046T.LJIILIIL(), viewLJJIJL);
            C0H9H.LJI(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)), viewLJJIJL);
        }
        ((LinearLayout) op(R.id.f798skp)).setOrientation(0);
        C0H9H.LJFF(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), this.LLLFZ);
        TuxTextView tuxTextView = this.LLLFFI;
        if (tuxTextView != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(sp().getString(2131832574));
            sbLIZ.append(':');
            tuxTextView.setText(C2188811AlT.LIZIZ(sbLIZ));
        }
        C786410Ut5.a9(Fp(), new ACListenerS136S0100000_1(this, 19));
        final AwS545S0100000_1 awS545S0100000_1 = new AwS545S0100000_1((C044M) this, 1584);
        getViewModel().MQ2().LIZLLL(new AbstractC1700220uLU() { // from class: X.044H
            @Override // X.AbstractC1700220uLU
            public final void LIZ() {
                awS545S0100000_1.invoke();
            }
        });
        C786410Ut5.a9(Ep(), new ACListenerS136S0100000_1(this, 20));
        final AwS545S0100000_1 awS545S0100000_12 = new AwS545S0100000_1((C044M) this, 1585);
        getViewModel().MQ2().LIZLLL(new AbstractC1700220uLU() { // from class: X.044I
            @Override // X.AbstractC1700220uLU
            public final void LIZ() {
                awS545S0100000_12.invoke();
            }
        });
        EditText editTextBp = Bp();
        editTextBp.setOnTouchListener(new ATListenerS333S0200000_1(editTextBp, this, 2));
        EditText editTextBp2 = Bp();
        editTextBp2.addTextChangedListener(new C04JY(editTextBp2, this, 2));
        Bp().setKeyListener(new NumberKeyListener() { // from class: X.044F
            @Override // android.text.method.KeyListener
            public final int getInputType() {
                return 3;
            }

            @Override // android.text.method.NumberKeyListener
            public final char[] getAcceptedChars() {
                return new char[]{'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
            }
        });
        TuxTextView tuxTextView2 = this.LLLFFI;
        if (tuxTextView2 != null) {
            up();
            tuxTextView2.setTuxFont(42);
        }
        TuxTextView tuxTextView3 = this.LLLFFI;
        if (tuxTextView3 != null) {
            up();
            tuxTextView3.setTextColorRes(R.attr.a1h);
        }
        TuxIconView tuxIconViewEp = Ep();
        up();
        C1744700vVE.LJIIIIZZ(C046T.LJI(), tuxIconViewEp);
        EditText editTextBp3 = Bp();
        up();
        C1744700vVE.LJIIIZ(C046T.LJI(), editTextBp3);
        TuxIconView tuxIconViewFp = Fp();
        up();
        C1744700vVE.LJIIIIZZ(C046T.LJI(), tuxIconViewFp);
        LinearLayout linearLayout = this.LLJLLL;
        if (linearLayout != null) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(6));
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.a03);
            linearLayout.setBackground(c384050F3z.LIZ(linearLayout.getContext()));
        }
        LinearLayout linearLayout2 = this.LLL;
        if (linearLayout2 != null) {
            C384050F3z c384050F3z2 = new C384050F3z();
            c384050F3z2.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)));
            c384050F3z2.LJFF = Integer.valueOf(R.attr.a01);
            c384050F3z2.LJIIIZ = Float.valueOf(((C046T) up()).LJFF());
            c384050F3z2.LJIIIIZZ = Float.valueOf(((C046T) up()).LJFF());
            c384050F3z2.LJIIJJI = Float.valueOf(((C046T) up()).LJFF());
            c384050F3z2.LJIIJ = Float.valueOf(((C046T) up()).LJFF());
            ProductPackStruct productPackStruct = getViewModel().LLJIJIL;
            if (productPackStruct != null && (skuCommonConfig = productPackStruct.skuCommonConfig) != null && Intrinsics.LJFF(skuCommonConfig.isQuantityEditable, Boolean.FALSE)) {
                c384050F3z2.LIZIZ = Integer.valueOf(R.attr.a03);
            }
            linearLayout2.setBackground(c384050F3z2.LIZ(sp()));
        }
        Context context = getContext();
        if (context == null || (numLIZJ = C1308910kAL.LIZJ(R.attr.a01, context)) == null) {
            return;
        }
        int iIntValue = numLIZJ.intValue();
        View view = this.LLLF;
        if (view != null) {
            view.setBackgroundColor(iIntValue);
        }
        View view2 = this.LLLFF;
        if (view2 != null) {
            view2.setBackgroundColor(iIntValue);
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(Object obj) {
    }
}
