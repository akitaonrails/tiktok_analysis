package com.ss.android.ugc.aweme.tako.menuwindow;

import X.C1272404yQ;
import X.C1308910kAL;
import X.C418440Gaw;
import X.C423410Gix;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes7.dex */
public final class SquareSkeletonCell extends PowerCell<C1272404yQ> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        GradientDrawable gradientDrawableI5;
        C1272404yQ c1272404yQ = (C1272404yQ) interfaceC1891350zJl;
        super.onBindItemView(c1272404yQ);
        int i = c1272404yQ.LL;
        if (i != 0) {
            if (i != 1) {
                gradientDrawableI5 = I5(0.0f, 0.0f);
            } else {
                gradientDrawableI5 = I5(0.35f, 0.0f);
            }
        } else {
            gradientDrawableI5 = I5(1.0f, 0.35f);
        }
        View view = this.itemView;
        view.setBackground(gradientDrawableI5);
        view.setOutlineProvider(new C423410Gix(Float.valueOf(C418440Gaw.LIZIZ(8))));
        view.setClipToOutline(true);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.fqs, viewGroup, false);
    }

    public final GradientDrawable I5(float f, float f2) {
        int iIntValue;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a03, this.itemView.getContext());
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = -1;
        }
        float fAlpha = Color.alpha(iIntValue) / 255.0f;
        float f3 = 255;
        return new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{Color.argb((int) (f * fAlpha * f3), Color.red(iIntValue), Color.green(iIntValue), Color.blue(iIntValue)), Color.argb((int) (f2 * fAlpha * f3), Color.red(iIntValue), Color.green(iIntValue), Color.blue(iIntValue))});
    }
}
