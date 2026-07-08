package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.bnpl;

import X.AnonymousClass0482;
import X.C01GW;
import X.C03ZF;
import X.C041G;
import X.C048M;
import X.C0H1U;
import X.C10306041g;
import X.C10314041o;
import X.C10515049h;
import X.C1071004Gu;
import X.C1076804Ja;
import X.C12ES;
import X.C13LE;
import X.C1697810uHb;
import X.C1748720vbi;
import X.C19719612Di;
import X.C19719912Dl;
import X.C452501pT;
import X.C679280Qkg;
import X.C786410Ut5;
import X.InterfaceC10318041s;
import Y.ACListenerS19S0301000_1;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.PdpHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BnplInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.bnpl.PdpPaymentModuleViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState;
import com.zhiliaoapp.musically.R;
import g1c.AjS60S0100000_1;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.AFwS185S0000000_1;
import kotlin.jvm.internal.AwS270S0300000_26;
import kotlin.jvm.internal.AwS52S1000000_1;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.AwS88S0201000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class PdpPaymentModuleViewHolder extends PdpHolder<C10306041g> {
    public TuxIconView LLJJIJIL;
    public C10314041o LLJJJ;
    public final C01GW LLJJJIL;
    public final LinkedList<C03ZF> LLJJJJ;
    public long LLJJJJJIL;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.PdpHolder, com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void c6() {
        C1076804Ja<View> c1076804Ja = new C1076804Ja((ViewGroup) this.itemView.findViewById(R.id.n_i), 10);
        ArrayList<C03ZF> arrayList = new ArrayList();
        for (View view : c1076804Ja) {
            if ((view instanceof C03ZF) && view != null) {
                arrayList.add(view);
            }
        }
        for (C03ZF c03zf : arrayList) {
            if (c03zf.LIZJ()) {
                c03zf.setChecked$ecommerce_transaction_release(false);
            }
        }
    }

    public final C10314041o d6() {
        View viewFindViewById = this.LLJJJ;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.jt6) : null;
            this.LLJJJ = (C10314041o) viewFindViewById;
        }
        return (C10314041o) viewFindViewById;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e6() {
        String str;
        BnplInfo bnplInfo = ((C10306041g) this.LLILLJJLI).LIZ;
        if (bnplInfo == null || (str = bnplInfo.schema) == null) {
            return;
        }
        SmartRouter.buildRoute(this.itemView.getContext(), UriProtector.parse(str).buildUpon().appendQueryParameter("source", "product_detail").toString()).open();
    }

    public PdpPaymentModuleViewHolder(View view) {
        super(R.layout.asn, view, false);
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SeaPdpViewModel.class);
        this.LLJJJIL = C452501pT.LIZIZ(new AwS270S0300000_26(this, c19719912DlLIZ, c19719912DlLIZ, 59));
        this.LLJJJJ = new LinkedList<>();
        this.LLJJJJJIL = System.currentTimeMillis();
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void rr(Object obj) {
        boolean zLJFF;
        List<InstallmentPlan> list;
        boolean zLJIIZILJ;
        boolean zBooleanValue;
        String str;
        InstallmentPlan installmentPlan;
        Boolean bool;
        String str2;
        String str3;
        C10306041g c10306041g = (C10306041g) obj;
        BnplInfo bnplInfo = ((C10306041g) this.LLILLJJLI).LIZ;
        if (bnplInfo != null && (str3 = bnplInfo.title) != null) {
            if (C1071004Gu.LIZIZ().LIZ()) {
                ((TuxTextView) this.itemView.findViewById(R.id.z7j)).setTuxFont(102);
            }
            ((TextView) this.itemView.findViewById(R.id.z7j)).setText(str3);
        }
        TextView textView = (TextView) this.itemView.findViewById(R.id.s_y);
        BnplInfo bnplInfo2 = ((C10306041g) this.LLILLJJLI).LIZ;
        if (bnplInfo2 != null && (str2 = bnplInfo2.text) != null) {
            textView.setText(str2);
            C12ES.LJIILL(0, textView);
        } else {
            C0H1U.LIZIZ(textView);
        }
        BnplInfo bnplInfo3 = ((C10306041g) this.LLILLJJLI).LIZ;
        if (bnplInfo3 != null) {
            zLJFF = Intrinsics.LJFF(bnplInfo3.isAuth, Boolean.TRUE);
        } else {
            zLJFF = false;
        }
        View viewFindViewById = null;
        if (!zLJFF) {
            C786410Ut5.I7(new AjS60S0100000_1(this, 148), this.itemView);
            C12ES.LJIILL(0, this.itemView.findViewById(R.id.jy5));
            C0H1U.LIZIZ(d6());
        } else {
            C0H1U.LIZIZ(textView);
            C0H1U.LIZIZ(this.itemView.findViewById(R.id.jy5));
            C12ES.LJIILL(0, d6());
            C10314041o c10314041oD6 = d6();
            if (c10314041oD6 != null) {
                c10314041oD6.setScrollViewListener(new InterfaceC10318041s() { // from class: X.041m
                    @Override // X.InterfaceC10318041s
                    public final void LIZ(int i, int i2) {
                        String str4;
                        if (Math.abs(i - i2) < 2) {
                            if (i > i2) {
                                str4 = "show_right";
                            } else {
                                str4 = "show_left";
                            }
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            PdpPaymentModuleViewHolder pdpPaymentModuleViewHolder = this.LIZ;
                            if (jCurrentTimeMillis - pdpPaymentModuleViewHolder.LLJJJJJIL > 200) {
                                C1748720vbi.LIZLLL(pdpPaymentModuleViewHolder.itemView, new C10523049p(), new AwS52S1000000_1(str4, 49));
                                this.LIZ.LLJJJJJIL = jCurrentTimeMillis;
                            }
                        }
                    }
                });
            }
            if (((ViewGroup) this.itemView.findViewById(R.id.n_i)).getChildCount() > 0) {
                ViewGroup viewGroup = (ViewGroup) this.itemView.findViewById(R.id.n_i);
                LinkedList<C03ZF> linkedList = this.LLJJJJ;
                while (viewGroup.getChildCount() > 0) {
                    View childAt = viewGroup.getChildAt(0);
                    C786410Ut5.LJJJLZIJ(childAt, viewGroup);
                    if (childAt instanceof C03ZF) {
                        linkedList.add((C03ZF) childAt);
                    }
                }
            }
            BnplInfo bnplInfo4 = ((C10306041g) this.LLILLJJLI).LIZ;
            if (bnplInfo4 != null && (list = bnplInfo4.installmentPlans) != null) {
                int i = 0;
                for (InstallmentPlan installmentPlan2 : list) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        InstallmentPlan installmentPlan3 = installmentPlan2;
                        C03ZF c03zf = (C03ZF) C19719612Di.LJJIIZI(this.LLJJJJ);
                        if (c03zf == null) {
                            c03zf = new C03ZF(this.itemView.getContext());
                        }
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                        if (i != 0) {
                            layoutParams.setMarginStart(C679280Qkg.LIZ(8));
                        }
                        C786410Ut5.r7(c03zf, layoutParams);
                        ProductPackStruct productPackStruct = ((SeaPdpViewModel) this.LLJJJIL.getValue()).LLJIJIL;
                        if (productPackStruct != null) {
                            zLJIIZILJ = C041G.LJIIZILJ(productPackStruct);
                        } else {
                            zLJIIZILJ = false;
                        }
                        BnplInfo bnplInfo5 = ((C10306041g) this.LLILLJJLI).LIZ;
                        if (bnplInfo5 != null && (bool = bnplInfo5.isEligibleForPromo) != null) {
                            zBooleanValue = bool.booleanValue();
                        } else {
                            zBooleanValue = false;
                        }
                        C03ZF c03zf2 = c03zf;
                        C03ZF.LIZIZ(c03zf, installmentPlan3, zLJIIZILJ, zBooleanValue, null, 8);
                        C786410Ut5.eb(c03zf2, new ACListenerS19S0301000_1(this, c03zf2, installmentPlan3, i, 2));
                        SkuPanelState skuPanelState = ((SeaPdpViewModel) this.LLJJJIL.getValue()).LLJILJIL;
                        if (skuPanelState != null && (installmentPlan = skuPanelState.installmentPlan) != null) {
                            str = installmentPlan.tenure;
                        } else {
                            str = null;
                        }
                        if (Intrinsics.LJFF(str, installmentPlan3.tenure)) {
                            c03zf2.performClick();
                        }
                        ((ViewGroup) this.itemView.findViewById(R.id.n_i)).addView(c03zf2);
                        C1748720vbi.LJFF(c03zf2, new AnonymousClass0482(), new AwS545S0100000_1(installmentPlan3, 1811), new AwS88S0201000_1(i, this, installmentPlan3, 16));
                        i = i2;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
            }
        }
        C1748720vbi.LJFF(this.itemView, new C10515049h(), AFwS185S0000000_1.get$arr$(541), new AwS580S0100000_1(c10306041g, 1120));
        BnplInfo bnplInfo6 = c10306041g.LIZ;
        if (bnplInfo6 == null || !Intrinsics.LJFF(bnplInfo6.isAuth, Boolean.TRUE)) {
            View view = this.LLJJIJIL;
            if (view == null) {
                View view2 = this.itemView;
                if (view2 != null) {
                    viewFindViewById = view2.findViewById(R.id.jy5);
                }
                this.LLJJIJIL = (TuxIconView) viewFindViewById;
                view = viewFindViewById;
            }
            C1748720vbi.LJFF(view, new C048M(), AFwS185S0000000_1.get$arr$(542), new AwS580S0100000_1(c10306041g, 1121));
        }
    }
}
