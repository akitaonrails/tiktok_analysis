package com.ss.android.ugc.aweme.search.pages.result.common.searchlemon8photo.core.ui.assem;

import X.C07E5;
import X.C1308910kAL;
import X.C1830707Ez;
import X.C418440Gaw;
import X.C786410Ut5;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes5.dex */
public final class Lemon8LeftTopLabelAssem extends ReusedUISlotAssem<Lemon8LeftTopLabelAssem> {
    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.euk;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final Context So(Context context) {
        if (C07E5.LIZ()) {
            return LJJIJL().getContext();
        }
        return context;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zf, view.getContext());
        if (numLIZJ != null) {
            gradientDrawable.setColor(numLIZJ.intValue());
        }
        gradientDrawable.setCornerRadius(C418440Gaw.LIZIZ(4));
        view.setBackground(gradientDrawable);
        if (C1830707Ez.LIZ()) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                layoutParams2.gravity = 8388613;
                C786410Ut5.W5(view, layoutParams2);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
    }
}
