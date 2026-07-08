package com.ss.android.ugc.aweme.poi.detail.basicinfo.header.travel.cell;

import X.C0251006n;
import X.C1308910kAL;
import X.C418440Gaw;
import X.C786410Ut5;
import X.C814420VxA;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes2.dex */
public final class PoiTagDividerCell extends PowerCell<C0251006n> {
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        LinearLayout linearLayout = new LinearLayout(viewGroup.getContext());
        C786410Ut5.d6(linearLayout, new ViewGroup.LayoutParams(-2, -1));
        View view = new View(viewGroup.getContext());
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a01, viewGroup.getContext());
        if (numLIZJ != null) {
            view.setBackgroundColor(numLIZJ.intValue());
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
        layoutParams.gravity = 16;
        C786410Ut5.W5(view, layoutParams);
        linearLayout.addView(view);
        return linearLayout;
    }
}
