package com.ss.android.ugc.aweme.ecommerce.core.view.speclayout;

import X.C01GW;
import X.C03DZ;
import X.C042W;
import X.C0H1U;
import X.C1954807lC;
import X.C1A0W;
import X.C21715319yh;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C426750GoL;
import X.C786410Ut5;
import X.C814420VxA;
import X.C954703oH;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH;
import com.ss.android.ugc.aweme.ecommerce.core.ab.EcomSkuPromotionAndScreenEfficiencyConfig;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes34.dex */
public final class ExpandableSpecVH extends AbsFullSpanVH<C1A0W> {
    public FrameLayout LLJJIJIL;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpandableSpecVH(ViewGroup viewGroup) {
        super(C954703oH.LIZ(viewGroup.getContext(), R.layout.azk, viewGroup, false));
        C01GW c01gw = C954703oH.LIZ;
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void rr(Object obj) {
        int i;
        Context context;
        int i2;
        View viewFindViewById;
        TuxIconView tuxIconView;
        int i3;
        float fFloatValue;
        C1A0W c1a0w = (C1A0W) obj;
        if (c1a0w.LIZIZ != C042W.NOT_EXPANDABLE) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            C042W c042w = c1a0w.LIZIZ;
            C042W c042w2 = C042W.MORE;
            if (c042w == c042w2) {
                i = R.raw.icon_chevron_down_thin;
            } else {
                i = R.raw.icon_chevron_up_thin;
            }
            c419910GdJ.LIZ = i;
            c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
            if (c1a0w.LIZIZ == c042w2) {
                context = this.itemView.getContext();
                i2 = 2131833094;
            } else {
                context = this.itemView.getContext();
                i2 = 2131833095;
            }
            String string = context.getString(i2);
            int i4 = C21715319yh.LIZ[c1a0w.LIZJ.ordinal()];
            View viewFindViewById2 = null;
            textView = null;
            TextView textView = null;
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 == 3) {
                        viewFindViewById = this.itemView.findViewById(R.id.vls);
                        textView = (TextView) this.itemView.findViewById(R.id.vlv);
                        tuxIconView = (TuxIconView) this.itemView.findViewById(R.id.vlt);
                        TuxTextView tuxTextView = (TuxTextView) this.itemView.findViewById(R.id.vlu);
                        C03DZ.LIZ(this.itemView.findViewById(R.id.m5y));
                        C03DZ.LIZ(this.itemView.findViewById(R.id.c3a));
                        C426750GoL.LJIIIZ(viewFindViewById, 0, 0, 0, 0, false, 16);
                        if (c1a0w.LJ) {
                            C786410Ut5.LLLLZLL(tuxTextView, 4);
                            C426750GoL.LJIIL(viewFindViewById, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))), 16);
                        }
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    viewFindViewById = this.itemView.findViewById(R.id.c3a);
                    tuxIconView = (TuxIconView) this.itemView.findViewById(R.id.c3b);
                    TuxTextView tuxTextView2 = (TuxTextView) this.itemView.findViewById(R.id.c3c);
                    C03DZ.LIZ(this.itemView.findViewById(R.id.m5y));
                    C03DZ.LIZ(this.itemView.findViewById(R.id.vls));
                    c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                    c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                    C426750GoL.LJIIIZ(viewFindViewById, 0, 0, 0, 0, false, 16);
                    if (c1a0w.LJ) {
                        C786410Ut5.LLLLZLL(tuxTextView2, 4);
                    }
                }
            } else {
                viewFindViewById = this.itemView.findViewById(R.id.m5y);
                TextView textView2 = (TextView) this.itemView.findViewById(R.id.m62);
                tuxIconView = (TuxIconView) this.itemView.findViewById(R.id.m5z);
                TuxTextView tuxTextView3 = (TuxTextView) this.itemView.findViewById(R.id.m61);
                C03DZ.LIZ(this.itemView.findViewById(R.id.vls));
                C03DZ.LIZ(this.itemView.findViewById(R.id.c3a));
                c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                C426750GoL.LJIIIZ(viewFindViewById, 0, 0, 0, 0, false, 16);
                if (c1a0w.LJ) {
                    C786410Ut5.LLLLZLL(tuxTextView3, 4);
                    C0H1U.LJII(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), viewFindViewById);
                }
                int iLLIFFJFJJ = c1a0w.LJFF.LLIFFJFJJ();
                float fFloatValue2 = 1.0f;
                if (c1a0w.LJFF.LJJIJLIJ()) {
                    float f = iLLIFFJFJJ;
                    Float f2 = c1a0w.LIZLLL;
                    if (f2 != null) {
                        fFloatValue = f2.floatValue();
                    } else {
                        fFloatValue = 1.0f;
                    }
                    i3 = (int) (f / fFloatValue);
                } else {
                    i3 = iLLIFFJFJJ;
                }
                if (EcomSkuPromotionAndScreenEfficiencyConfig.LIZ()) {
                    iLLIFFJFJJ = c1a0w.LJFF.LLIFFJFJJ();
                    if (c1a0w.LJFF.LJJIJLIJ()) {
                        float f3 = iLLIFFJFJJ;
                        Float f4 = c1a0w.LIZLLL;
                        if (f4 != null) {
                            fFloatValue2 = f4.floatValue();
                        }
                        i3 = iLLIFFJFJJ;
                        iLLIFFJFJJ = (int) (f3 * fFloatValue2);
                    } else {
                        i3 = iLLIFFJFJJ;
                    }
                }
                ViewGroup.LayoutParams layoutParams = tuxIconView.getLayoutParams();
                layoutParams.width = iLLIFFJFJJ;
                layoutParams.height = i3;
                C786410Ut5.M6(tuxIconView, layoutParams);
                View viewFindViewById3 = this.LLJJIJIL;
                if (viewFindViewById3 == null) {
                    View viewLJJIJL = LJJIJL();
                    if (viewLJJIJL != null) {
                        viewFindViewById3 = viewLJJIJL.findViewById(R.id.m60);
                    } else {
                        viewFindViewById3 = null;
                    }
                    this.LLJJIJIL = (FrameLayout) viewFindViewById3;
                }
                ViewGroup.LayoutParams layoutParams2 = viewFindViewById3.getLayoutParams();
                if (EcomSkuPromotionAndScreenEfficiencyConfig.LIZ()) {
                    layoutParams2.width = c1a0w.LJFF.LLIFFJFJJ();
                    layoutParams2.height = c1a0w.LJFF.LLIFFJFJJ();
                } else {
                    layoutParams2.width = iLLIFFJFJJ;
                    layoutParams2.height = i3;
                }
                View view = this.LLJJIJIL;
                if (view == null) {
                    View viewLJJIJL2 = LJJIJL();
                    if (viewLJJIJL2 != null) {
                        viewFindViewById2 = viewLJJIJL2.findViewById(R.id.m60);
                    }
                    this.LLJJIJIL = (FrameLayout) viewFindViewById2;
                    view = viewFindViewById2;
                }
                C786410Ut5.a6((FrameLayout) view, layoutParams2);
                textView = textView2;
            }
            viewFindViewById.setBackgroundResource(c1a0w.LJFF.LJIJJLI());
            if (textView != null) {
                textView.setText(string);
            }
            tuxIconView.setTuxIcon(c419910GdJ);
            C03DZ.LIZJ(viewFindViewById);
        }
    }
}
