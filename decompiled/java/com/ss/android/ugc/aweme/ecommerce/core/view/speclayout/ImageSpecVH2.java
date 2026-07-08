package com.ss.android.ugc.aweme.ecommerce.core.view.speclayout;

import X.C01GW;
import X.C0GRZ;
import X.C0H9H;
import X.C1308910kAL;
import X.C1749180vcS;
import X.C2172411A0h;
import X.C2172421A0i;
import X.C426750GoL;
import X.C786410Ut5;
import X.C954703oH;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SalePropTag;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS250S0300000_6;
import r4b.g;

/* JADX INFO: loaded from: classes34.dex */
public final class ImageSpecVH2 extends AbsFullSpanVH<C2172411A0h> {
    public final g LLJJIJIL;
    public final FrameLayout LLJJJ;
    public final SmartImageView LLJJJIL;
    public final TuxTextView LLJJJJ;
    public final C0GRZ LLJJJJJIL;
    public final TuxTextView LLJJJJLIIL;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void rr(Object obj) {
        int iLJIJJ;
        C2172411A0h c2172411A0h = (C2172411A0h) obj;
        g gVar = c2172411A0h.LJII;
        C2172421A0i c2172421A0i = c2172411A0h.LJIIIIZZ;
        FrameLayout frameLayout = this.LLJJJ;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.setMarginEnd(gVar.LJJJJIZL());
        C786410Ut5.a6(frameLayout, layoutParams);
        new AwS250S0300000_6(c2172411A0h, gVar, this, 14).invoke();
        if (c2172411A0h.LIZIZ != null) {
            C786410Ut5.LJLLLLLL(0, this.LLJJJJ);
            this.LLJJJJ.setText(c2172411A0h.LIZIZ);
            C426750GoL.LJIIL(this.LLJJJ, Integer.valueOf(C2172421A0i.LIZIZ().LIZ), Integer.valueOf(C2172421A0i.LIZIZ().LIZIZ), Integer.valueOf(C2172421A0i.LIZIZ().LIZJ), Integer.valueOf(C2172421A0i.LIZIZ().LIZLLL), 16);
        } else {
            C426750GoL.LJIIL(this.LLJJJ, Integer.valueOf(c2172421A0i.LIZ().LIZ), Integer.valueOf(c2172421A0i.LIZ().LIZIZ), Integer.valueOf(c2172421A0i.LIZ().LIZJ), Integer.valueOf(c2172421A0i.LIZ().LIZLLL), 16);
        }
        if (c2172411A0h.LIZLLL) {
            if (c2172411A0h.LIZJ) {
                iLJIJJ = gVar.LJJ();
            } else {
                iLJIJJ = gVar.LJIIJJI();
            }
        } else if (c2172411A0h.LIZJ) {
            iLJIJJ = gVar.LJIJJLI();
        } else {
            iLJIJJ = gVar.LJIJJ();
        }
        this.LLJJJ.setBackgroundResource(iLJIJJ);
        if (c2172411A0h.LIZLLL) {
            if (c2172411A0h.LIZJ) {
                Context context = this.itemView.getContext();
                gVar.LJIIIZ();
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, context);
                if (numLIZJ != null) {
                    this.LLJJJJ.setTextColor(numLIZJ.intValue());
                }
                TuxTextView tuxTextView = this.LLJJJJ;
                c2172421A0i.getClass();
                tuxTextView.setTuxFont(72);
            } else {
                Integer numLIZJ2 = C1308910kAL.LIZJ(gVar.LJFF(), this.itemView.getContext());
                if (numLIZJ2 != null) {
                    this.LLJJJJ.setTextColor(numLIZJ2.intValue());
                }
                TuxTextView tuxTextView2 = this.LLJJJJ;
                c2172421A0i.getClass();
                tuxTextView2.setTuxFont(71);
            }
        } else {
            if (c2172411A0h.LIZJ) {
                Context context2 = this.itemView.getContext();
                gVar.LJIL();
                Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.a1h, context2);
                if (numLIZJ3 != null) {
                    this.LLJJJJ.setTextColor(numLIZJ3.intValue());
                }
            } else {
                Integer numLIZJ4 = C1308910kAL.LIZJ(gVar.LJI(), this.itemView.getContext());
                if (numLIZJ4 != null) {
                    this.LLJJJJ.setTextColor(numLIZJ4.intValue());
                }
            }
            TuxTextView tuxTextView3 = this.LLJJJJ;
            c2172421A0i.getClass();
            tuxTextView3.setTuxFont(71);
        }
        if (c2172411A0h.LIZJ) {
            C786410Ut5.u5(this.LLJJJIL, 1.0f);
            C786410Ut5.LJLLLLLL(8, this.LLJJJJJIL);
        } else {
            C786410Ut5.u5(this.LLJJJIL, 0.5f);
            C786410Ut5.LJLLLLLL(0, this.LLJJJJJIL);
            this.LLJJJJJIL.setLineOffset(C0H9H.LIZ(3));
        }
        C1749180vcS c1749180vcS = C1749180vcS.LIZ;
        Context context3 = this.itemView.getContext();
        TuxTextView tuxTextView4 = this.LLJJJJLIIL;
        SalePropTag salePropTag = c2172411A0h.LJ;
        int paddingTop = this.LLJJJ.getPaddingTop();
        int paddingRight = this.LLJJJ.getPaddingRight();
        int iLJIIZILJ = gVar.LJIIZILJ();
        int iLJIIJ = gVar.LJIIJ();
        c1749180vcS.getClass();
        C1749180vcS.LIZ(context3, tuxTextView4, salePropTag, paddingTop, paddingRight, iLJIIZILJ, iLJIIJ);
        this.itemView.setContentDescription(c2172411A0h.LJI);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageSpecVH2(ViewGroup viewGroup, g gVar) {
        super(C954703oH.LIZ(viewGroup.getContext(), R.layout.ayu, viewGroup, false));
        C01GW c01gw = C954703oH.LIZ;
        this.LLJJIJIL = gVar;
        this.LLJJJ = (FrameLayout) this.itemView.findViewById(R.id.q7e);
        this.LLJJJIL = (SmartImageView) this.itemView.findViewById(R.id.q7t);
        this.LLJJJJ = (TuxTextView) this.itemView.findViewById(R.id.q83);
        this.LLJJJJJIL = (C0GRZ) this.itemView.findViewById(R.id.q7l);
        this.LLJJJJLIIL = (TuxTextView) this.itemView.findViewById(R.id.jsh);
    }
}
