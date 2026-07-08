package com.ss.android.ugc.aweme.ecommerce.core.view.speclayout;

import X.C01GW;
import X.C1066100dqi;
import X.C1308910kAL;
import X.C1749180vcS;
import X.C2172401A0g;
import X.C2172431A0j;
import X.C426750GoL;
import X.C786410Ut5;
import X.C954703oH;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SalePropTag;
import com.ss.android.ugc.aweme.ecommerce.core.ab.EcomSkuPromotionAndScreenEfficiencyConfig;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS250S0300000_6;
import r4b.g;

/* JADX INFO: loaded from: classes34.dex */
public final class ImageWithTextSpecVH extends AbsFullSpanVH<C2172401A0g> {
    public final g LLJJIJIL;
    public FrameLayout LLJJJ;
    public SmartImageView LLJJJIL;
    public FrameLayout LLJJJJ;
    public TuxTextView LLJJJJJIL;
    public TuxTextView LLJJJJLIIL;
    public TuxTextView LLJJL;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final SmartImageView c6() {
        View viewFindViewById = this.LLJJJIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.cib) : null;
            this.LLJJJIL = (SmartImageView) viewFindViewById;
        }
        return (SmartImageView) viewFindViewById;
    }

    public final TuxTextView d6() {
        View viewFindViewById = this.LLJJJJLIIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.cic) : null;
            this.LLJJJJLIIL = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final TuxTextView e6() {
        View viewFindViewById = this.LLJJJJJIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.cid) : null;
            this.LLJJJJJIL = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final FrameLayout f6() {
        View viewFindViewById = this.LLJJJ;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.vsz) : null;
            this.LLJJJ = (FrameLayout) viewFindViewById;
        }
        return (FrameLayout) viewFindViewById;
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void rr(Object obj) {
        int iLJIJJ;
        C2172401A0g c2172401A0g = (C2172401A0g) obj;
        C2172431A0j c2172431A0j = c2172401A0g.LJII;
        C1066100dqi c1066100dqi = new C1066100dqi();
        c1066100dqi.LIZJ = "sku_detail";
        c1066100dqi.LIZ(this.LLILLL);
        c1066100dqi.LIZJ(c2172401A0g.LIZ.toThumbFirstImageUrlModel());
        C426750GoL.LJIIIZ(f6(), 0, 0, Integer.valueOf(this.LLJJIJIL.LJJJJIZL()), 0, false, 16);
        View viewFindViewById = null;
        if (this.LLJJIJIL.LJJIJLIJ()) {
            int iLLIFFJFJJ = this.LLJJIJIL.LLIFFJFJJ();
            int radio = (int) (iLLIFFJFJJ / c2172401A0g.LIZ.getRadio());
            if (EcomSkuPromotionAndScreenEfficiencyConfig.LIZ()) {
                radio = this.LLJJIJIL.LLIFFJFJJ();
                iLLIFFJFJJ = (int) (radio * c2172401A0g.LIZ.getRadio());
            }
            ViewGroup.LayoutParams layoutParams = c6().getLayoutParams();
            layoutParams.width = iLLIFFJFJJ;
            layoutParams.height = radio;
            C786410Ut5.G6(c6(), layoutParams);
            View viewFindViewById2 = this.LLJJJJ;
            if (viewFindViewById2 == null) {
                View viewLJJIJL = LJJIJL();
                if (viewLJJIJL != null) {
                    viewFindViewById2 = viewLJJIJL.findViewById(R.id.ci_);
                } else {
                    viewFindViewById2 = null;
                }
                this.LLJJJJ = (FrameLayout) viewFindViewById2;
            }
            ViewGroup.LayoutParams layoutParams2 = viewFindViewById2.getLayoutParams();
            if (EcomSkuPromotionAndScreenEfficiencyConfig.LIZ()) {
                layoutParams2.width = this.LLJJIJIL.LLIFFJFJJ();
                layoutParams2.height = this.LLJJIJIL.LLIFFJFJJ();
            } else {
                layoutParams2.width = iLLIFFJFJJ;
                layoutParams2.height = radio;
            }
            View viewFindViewById3 = this.LLJJJJ;
            if (viewFindViewById3 == null) {
                View viewLJJIJL2 = LJJIJL();
                if (viewLJJIJL2 != null) {
                    viewFindViewById3 = viewLJJIJL2.findViewById(R.id.ci_);
                } else {
                    viewFindViewById3 = null;
                }
                this.LLJJJJ = (FrameLayout) viewFindViewById3;
            }
            C786410Ut5.a6((FrameLayout) viewFindViewById3, layoutParams2);
        }
        new AwS250S0300000_6(c2172401A0g, this, c1066100dqi, 15).invoke();
        e6().setText(c2172401A0g.LIZIZ);
        if (c2172401A0g.LIZJ != null) {
            C786410Ut5.LJLLLLLL(0, d6());
            d6().setText(c2172401A0g.LIZJ);
            C426750GoL.LJIIL(f6(), Integer.valueOf(C2172431A0j.LIZIZ().LIZ), Integer.valueOf(C2172431A0j.LIZIZ().LIZIZ), Integer.valueOf(C2172431A0j.LIZIZ().LIZJ), Integer.valueOf(C2172431A0j.LIZIZ().LIZLLL), 16);
            e6().setTuxFont(91);
        } else {
            C426750GoL.LJIIL(f6(), Integer.valueOf(c2172431A0j.LIZ().LIZ), Integer.valueOf(c2172431A0j.LIZ().LIZIZ), Integer.valueOf(c2172431A0j.LIZ().LIZJ), Integer.valueOf(c2172431A0j.LIZ().LIZLLL), 16);
            e6().setTuxFont(91);
        }
        if (c2172401A0g.LJ) {
            if (c2172401A0g.LIZLLL) {
                iLJIJJ = this.LLJJIJIL.LJJ();
            } else {
                iLJIJJ = this.LLJJIJIL.LJIIJJI();
            }
        } else if (c2172401A0g.LIZLLL) {
            iLJIJJ = this.LLJJIJIL.LJIJJLI();
        } else {
            iLJIJJ = this.LLJJIJIL.LJIJJ();
        }
        f6().setBackgroundResource(iLJIJJ);
        e6().getPaint().setFlags(0);
        if (c2172401A0g.LJ) {
            if (c2172401A0g.LIZLLL) {
                Context context = this.itemView.getContext();
                this.LLJJIJIL.LJIIIZ();
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, context);
                if (numLIZJ != null) {
                    int iIntValue = numLIZJ.intValue();
                    e6().setTextColor(iIntValue);
                    d6().setTextColor(iIntValue);
                }
                TuxTextView tuxTextViewD6 = d6();
                c2172431A0j.getClass();
                tuxTextViewD6.setTuxFont(72);
                C786410Ut5.u5(c6(), 1.0f);
            } else {
                Integer numLIZJ2 = C1308910kAL.LIZJ(this.LLJJIJIL.LJFF(), this.itemView.getContext());
                if (numLIZJ2 != null) {
                    int iIntValue2 = numLIZJ2.intValue();
                    e6().setTextColor(iIntValue2);
                    d6().setTextColor(iIntValue2);
                }
                TuxTextView tuxTextViewD62 = d6();
                c2172431A0j.getClass();
                tuxTextViewD62.setTuxFont(72);
                C786410Ut5.u5(c6(), 0.5f);
                if (this.LLJJIJIL.LLIIL()) {
                    e6().getPaint().setFlags(16);
                }
            }
        } else {
            if (c2172401A0g.LIZLLL) {
                Context context2 = this.itemView.getContext();
                this.LLJJIJIL.LJIL();
                Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.a1h, context2);
                if (numLIZJ3 != null) {
                    int iIntValue3 = numLIZJ3.intValue();
                    e6().setTextColor(iIntValue3);
                    d6().setTextColor(iIntValue3);
                }
                C786410Ut5.u5(c6(), 1.0f);
            } else {
                Integer numLIZJ4 = C1308910kAL.LIZJ(this.LLJJIJIL.LJI(), this.itemView.getContext());
                if (numLIZJ4 != null) {
                    int iIntValue4 = numLIZJ4.intValue();
                    e6().setTextColor(iIntValue4);
                    d6().setTextColor(iIntValue4);
                }
                C786410Ut5.u5(c6(), 0.5f);
                if (this.LLJJIJIL.LLIIL()) {
                    e6().getPaint().setFlags(16);
                }
            }
            TuxTextView tuxTextViewD63 = d6();
            c2172431A0j.getClass();
            tuxTextViewD63.setTuxFont(72);
        }
        C1749180vcS c1749180vcS = C1749180vcS.LIZ;
        Context context3 = this.itemView.getContext();
        View view = this.LLJJL;
        if (view == null) {
            View view2 = this.itemView;
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.jsh);
            }
            this.LLJJL = (TuxTextView) viewFindViewById;
            view = viewFindViewById;
        }
        SalePropTag salePropTag = c2172401A0g.LJFF;
        int paddingTop = f6().getPaddingTop();
        int paddingRight = f6().getPaddingRight();
        int iLJIIZILJ = this.LLJJIJIL.LJIIZILJ();
        int iLJIIJ = this.LLJJIJIL.LJIIJ();
        c1749180vcS.getClass();
        C1749180vcS.LIZ(context3, (TuxTextView) view, salePropTag, paddingTop, paddingRight, iLJIIZILJ, iLJIIJ);
        e6().getPaint().setAntiAlias(true);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageWithTextSpecVH(ViewGroup viewGroup, g gVar) {
        super(C954703oH.LIZ(viewGroup.getContext(), R.layout.an8, viewGroup, false));
        C01GW c01gw = C954703oH.LIZ;
        this.LLJJIJIL = gVar;
    }
}
