package com.ss.android.ugc.aweme.captionsheet.ui;

import X.C11GO;
import X.C127A;
import X.C127M;
import X.C19MB;
import X.C19ME;
import X.C20693815yK;
import X.C418440Gaw;
import X.C426750GoL;
import X.C786410Ut5;
import X.C814420VxA;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.cell.TuxCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS575S0100000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class SubtitleIconCell extends TuxCell<C20693815yK, C127A> {
    public LinearLayout LLILLJJLI;
    public TuxIconView LLILLL;

    @Override // com.ss.android.ugc.aweme.cell.TuxCell, com.ss.android.ugc.aweme.cell.BaseCell
    public final View I5(ViewGroup viewGroup) {
        View viewI5 = super.I5(viewGroup);
        Context context = viewGroup.getContext();
        TuxIconView tuxIconView = new TuxIconView(context, null, 0, 6, null);
        tuxIconView.setIconRes(R.raw.icon_chevron_right_ltr);
        tuxIconView.setIconWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(9)));
        tuxIconView.setIconHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(9)));
        tuxIconView.setTintColor(R.attr.a1k);
        this.LLILLL = tuxIconView;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.addView(this.LLILLL);
        this.LLILLJJLI = linearLayout;
        return viewI5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.cell.TuxCell
    public final C127M N5(Context context) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        C127A c127a = new C127A(context);
        C20693815yK c20693815yK = (C20693815yK) getItem();
        if (c20693815yK != null) {
            onCheckedChangeListener = c20693815yK.LLJJL;
        } else {
            onCheckedChangeListener = null;
        }
        c127a.LJIILLIIL(onCheckedChangeListener);
        c127a.LJIILL(new AwS575S0100000_31(this, 1628));
        return c127a;
    }

    @Override // com.ss.android.ugc.aweme.cell.TuxCell, com.ss.android.ugc.aweme.cell.BaseCell, com.bytedance.ies.powerlist.PowerCell
    /* JADX INFO: renamed from: R5, reason: merged with bridge method [inline-methods] */
    public final void onBindItemView(C20693815yK c20693815yK) {
        int i;
        int i2;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        int i3;
        int i4;
        ViewGroup.MarginLayoutParams marginLayoutParams3;
        ViewGroup.MarginLayoutParams marginLayoutParams4;
        super.onBindItemView(c20693815yK);
        C11GO c11go = (C11GO) this.LL;
        if (c11go != null) {
            c11go.LJIILJJIL(c20693815yK.LLJJIJIL);
        }
        if (c20693815yK.LLJJJJJIL) {
            LinearLayout linearLayout = this.LLILLJJLI;
            if (linearLayout != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) this.itemView.findViewById(R.id.dlh);
                C786410Ut5.LJZL(0, linearLayout);
                if (constraintLayout.indexOfChild(linearLayout) == -1) {
                    C786410Ut5.d6(linearLayout, new C19ME(-2, -2));
                    TuxIconView tuxIconView = this.LLILLL;
                    if (tuxIconView != null) {
                        Integer numValueOf = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
                        int paddingTop = this.itemView.findViewById(R.id.dle).findViewById(R.id.wmy).getPaddingTop();
                        ViewGroup.LayoutParams layoutParams = this.itemView.findViewById(R.id.dle).findViewById(R.id.wmy).getLayoutParams();
                        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                            i3 = marginLayoutParams4.topMargin;
                        } else {
                            i3 = 0;
                        }
                        Integer numValueOf2 = Integer.valueOf(paddingTop + i3);
                        int paddingBottom = this.itemView.findViewById(R.id.dle).findViewById(R.id.wmy).getPaddingBottom();
                        ViewGroup.LayoutParams layoutParams2 = this.itemView.findViewById(R.id.dle).findViewById(R.id.wmy).getLayoutParams();
                        if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                            i4 = marginLayoutParams3.bottomMargin;
                        } else {
                            i4 = 0;
                        }
                        C426750GoL.LJIIL(tuxIconView, numValueOf, numValueOf2, null, Integer.valueOf(paddingBottom + i4), 20);
                    }
                    linearLayout.setGravity(8388611);
                    linearLayout.setId(View.generateViewId());
                    constraintLayout.addView(linearLayout);
                    C19MB c19mb = new C19MB();
                    c19mb.LJII(constraintLayout);
                    c19mb.LJIIIIZZ(linearLayout.getId(), 3, this.itemView.findViewById(R.id.wmy).getId(), 3);
                    c19mb.LJIIIIZZ(linearLayout.getId(), 4, this.itemView.findViewById(R.id.wmy).getId(), 4);
                    c19mb.LJIIIIZZ(linearLayout.getId(), 6, this.itemView.findViewById(R.id.wmy).getId(), 7);
                    c19mb.LJIIIIZZ(this.itemView.findViewById(R.id.wmy).getId(), 7, linearLayout.getId(), 6);
                    c19mb.LJIIIIZZ(linearLayout.getId(), 7, 0, 7);
                    c19mb.LJIILL(linearLayout.getId(), 0);
                    c19mb.LJJIIJ(1.0f, linearLayout.getId());
                    c19mb.LJJII(0.0f, linearLayout.getId());
                    c19mb.LJIJI(linearLayout.getId()).LIZLLL.LJJJJLI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(9));
                    c19mb.LJIILL(this.itemView.findViewById(R.id.wmy).getId(), 0);
                    c19mb.LJJIIJ(0.0f, this.itemView.findViewById(R.id.wmy).getId());
                    c19mb.LIZIZ(constraintLayout);
                }
            }
        } else {
            LinearLayout linearLayout2 = this.LLILLJJLI;
            if (linearLayout2 != null) {
                C786410Ut5.LJZL(8, linearLayout2);
            }
        }
        C786410Ut5.h9((TuxTextView) this.itemView.findViewById(R.id.dle).findViewById(R.id.wmy), c20693815yK.LLJJJJLIIL);
        TuxIconView tuxIconView2 = this.LLILLL;
        if (tuxIconView2 != null) {
            C786410Ut5.a9(tuxIconView2, c20693815yK.LLJJJJLIIL);
        }
        if (c20693815yK.LLJJJJLIIL != null) {
            View viewFindViewById = this.itemView.findViewById(R.id.dle).findViewById(R.id.wmy);
            ViewGroup.LayoutParams layoutParams3 = viewFindViewById.getLayoutParams();
            if ((layoutParams3 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams3) != null) {
                i = marginLayoutParams2.topMargin;
            } else {
                i = 0;
            }
            Integer numValueOf3 = Integer.valueOf(i);
            ViewGroup.LayoutParams layoutParams4 = viewFindViewById.getLayoutParams();
            if ((layoutParams4 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams4) != null) {
                i2 = marginLayoutParams.bottomMargin;
            } else {
                i2 = 0;
            }
            C426750GoL.LJIIL(viewFindViewById, null, numValueOf3, null, Integer.valueOf(i2), 21);
            C426750GoL.LJIIIZ(viewFindViewById, null, 0, null, 0, false, 21);
        }
    }
}
