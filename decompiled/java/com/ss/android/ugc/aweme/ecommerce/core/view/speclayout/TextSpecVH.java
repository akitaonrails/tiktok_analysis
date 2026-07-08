package com.ss.android.ugc.aweme.ecommerce.core.view.speclayout;

import X.C01GW;
import X.C03B0;
import X.C03DZ;
import X.C0H9H;
import X.C123100dR;
import X.C1308910kAL;
import X.C1749180vcS;
import X.C2172351A0b;
import X.C2172441A0k;
import X.C418440Gaw;
import X.C426750GoL;
import X.C786410Ut5;
import X.C814420VxA;
import X.C954703oH;
import X.C958103op;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SalePropTag;
import com.ss.android.ugc.aweme.ecommerce.core.ab.EcomSkuPromotionAndScreenEfficiencyConfig;
import com.zhiliaoapp.musically.R;
import r4b.g;

/* JADX INFO: loaded from: classes34.dex */
public final class TextSpecVH extends AbsFullSpanVH<C2172351A0b> {
    public final g LLJJIJIL;
    public TuxTextView LLJJJ;
    public TuxTextView LLJJJIL;
    public FrameLayout LLJJJJ;
    public TuxTextView LLJJJJJIL;
    public TuxIconView LLJJJJLIIL;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final TuxTextView c6() {
        View viewFindViewById = this.LLJJJIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.cic) : null;
            this.LLJJJIL = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final TuxTextView d6() {
        View viewFindViewById = this.LLJJJ;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.cid) : null;
            this.LLJJJ = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final FrameLayout e6() {
        View viewFindViewById = this.LLJJJJ;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.vsz) : null;
            this.LLJJJJ = (FrameLayout) viewFindViewById;
        }
        return (FrameLayout) viewFindViewById;
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void rr(Object obj) {
        int iLJJIIJ;
        C2172351A0b c2172351A0b = (C2172351A0b) obj;
        C2172441A0k c2172441A0k = c2172351A0b.LJIIIIZZ;
        if (EcomSkuPromotionAndScreenEfficiencyConfig.LIZ()) {
            d6().setMinWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
            d6().setMinHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
        }
        if (c2172351A0b.LJI != null) {
            TuxTextView tuxTextViewD6 = d6();
            C03B0 c03b0 = new C03B0(d6(), "pdp_sku_purchase_method_view");
            C03B0.LIZ(c03b0, c2172351A0b.LJI, null, null, false, null, null, 126);
            tuxTextViewD6.setText(c03b0.LIZJ);
        } else {
            d6().setText(c2172351A0b.LIZ);
        }
        if (c2172351A0b.LIZIZ != null) {
            C786410Ut5.LJLLLLLL(0, c6());
            c6().setText(c2172351A0b.LIZIZ);
            C426750GoL.LJIIL(e6(), Integer.valueOf(C2172441A0k.LIZIZ().LIZ), Integer.valueOf(C2172441A0k.LIZIZ().LIZIZ), Integer.valueOf(C2172441A0k.LIZIZ().LIZJ), Integer.valueOf(C2172441A0k.LIZIZ().LIZLLL), 16);
            d6().setTuxFont(71);
        } else {
            C426750GoL.LJIIL(e6(), Integer.valueOf(c2172441A0k.LIZ().LIZ), Integer.valueOf(c2172441A0k.LIZ().LIZIZ), Integer.valueOf(c2172441A0k.LIZ().LIZJ), Integer.valueOf(c2172441A0k.LIZ().LIZLLL), 16);
            d6().setTuxFont(71);
        }
        if (EcomSkuPromotionAndScreenEfficiencyConfig.LIZ()) {
            C0H9H.LIZLLL(this.LLJJIJIL.LJJJJIZL(), e6());
        }
        if (c2172351A0b.LIZLLL) {
            if (c2172351A0b.LIZJ) {
                iLJJIIJ = this.LLJJIJIL.LJJLJ();
            } else {
                iLJJIIJ = this.LLJJIJIL.LJLJL();
            }
        } else if (c2172351A0b.LIZJ) {
            iLJJIIJ = this.LLJJIJIL.LJJJZ();
        } else {
            iLJJIIJ = this.LLJJIJIL.LJJIIJ();
        }
        e6().setBackgroundResource(iLJJIIJ);
        d6().getPaint().setFlags(0);
        if (c2172351A0b.LIZLLL) {
            if (c2172351A0b.LIZJ) {
                Context context = this.itemView.getContext();
                this.LLJJIJIL.LJIIIZ();
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, context);
                if (numLIZJ != null) {
                    int iIntValue = numLIZJ.intValue();
                    d6().setTextColor(iIntValue);
                    c6().setTextColor(iIntValue);
                }
                TuxTextView tuxTextViewC6 = c6();
                c2172441A0k.getClass();
                tuxTextViewC6.setTuxFont(72);
            } else {
                Integer numLIZJ2 = C1308910kAL.LIZJ(this.LLJJIJIL.LJFF(), this.itemView.getContext());
                if (numLIZJ2 != null) {
                    int iIntValue2 = numLIZJ2.intValue();
                    d6().setTextColor(iIntValue2);
                    c6().setTextColor(iIntValue2);
                }
                if (this.LLJJIJIL.LLIIL()) {
                    d6().getPaint().setFlags(16);
                }
                TuxTextView tuxTextViewC62 = c6();
                c2172441A0k.getClass();
                tuxTextViewC62.setTuxFont(71);
            }
        } else {
            if (c2172351A0b.LIZJ) {
                Context context2 = this.itemView.getContext();
                this.LLJJIJIL.LJIL();
                Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.a1h, context2);
                if (numLIZJ3 != null) {
                    int iIntValue3 = numLIZJ3.intValue();
                    d6().setTextColor(iIntValue3);
                    c6().setTextColor(iIntValue3);
                }
            } else {
                Integer numLIZJ4 = C1308910kAL.LIZJ(this.LLJJIJIL.LJI(), this.itemView.getContext());
                if (numLIZJ4 != null) {
                    int iIntValue4 = numLIZJ4.intValue();
                    d6().setTextColor(iIntValue4);
                    c6().setTextColor(iIntValue4);
                }
                if (this.LLJJIJIL.LLIIL()) {
                    d6().getPaint().setFlags(16);
                }
            }
            TuxTextView tuxTextViewC63 = c6();
            c2172441A0k.getClass();
            tuxTextViewC63.setTuxFont(71);
        }
        int iLIZLLL = (C958103op.LIZLLL() - (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)) * 2)) - (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)) * 2);
        if (iLIZLLL > 0) {
            d6().setMaxWidth(iLIZLLL);
        }
        d6().getPaint().setAntiAlias(true);
        C1749180vcS c1749180vcS = C1749180vcS.LIZ;
        Context context3 = this.itemView.getContext();
        View viewFindViewById = this.LLJJJJJIL;
        View viewFindViewById2 = null;
        if (viewFindViewById == null) {
            View view = this.itemView;
            if (view != null) {
                viewFindViewById = view.findViewById(R.id.jsh);
            } else {
                viewFindViewById = null;
            }
            this.LLJJJJJIL = (TuxTextView) viewFindViewById;
        }
        SalePropTag salePropTag = c2172351A0b.LJ;
        int paddingTop = e6().getPaddingTop();
        int paddingRight = e6().getPaddingRight();
        int iLJIIZILJ = this.LLJJIJIL.LJIIZILJ();
        int iLJIIJ = this.LLJJIJIL.LJIIJ();
        c1749180vcS.getClass();
        C1749180vcS.LIZ(context3, (TuxTextView) viewFindViewById, salePropTag, paddingTop, paddingRight, iLJIIZILJ, iLJIIJ);
        if (C123100dR.LIZ(c2172351A0b.LJFF)) {
            View view2 = this.LLJJJJLIIL;
            if (view2 == null) {
                View viewLJJIJL = LJJIJL();
                if (viewLJJIJL != null) {
                    viewFindViewById2 = viewLJJIJL.findViewById(R.id.ms1);
                }
                this.LLJJJJLIIL = (TuxIconView) viewFindViewById2;
                view2 = viewFindViewById2;
            }
            C03DZ.LIZJ(view2);
            return;
        }
        View view3 = this.LLJJJJLIIL;
        if (view3 == null) {
            View viewLJJIJL2 = LJJIJL();
            if (viewLJJIJL2 != null) {
                viewFindViewById2 = viewLJJIJL2.findViewById(R.id.ms1);
            }
            this.LLJJJJLIIL = (TuxIconView) viewFindViewById2;
            view3 = viewFindViewById2;
        }
        C03DZ.LIZ(view3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextSpecVH(ViewGroup viewGroup, g gVar) {
        super(C954703oH.LIZ(viewGroup.getContext(), R.layout.aok, viewGroup, false));
        C01GW c01gw = C954703oH.LIZ;
        this.LLJJIJIL = gVar;
    }
}
