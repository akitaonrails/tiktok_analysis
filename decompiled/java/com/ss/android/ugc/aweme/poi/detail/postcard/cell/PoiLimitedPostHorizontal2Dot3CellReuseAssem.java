package com.ss.android.ugc.aweme.poi.detail.postcard.cell;

import X.C0T48;
import android.content.Context;
import android.view.View;
import kotlin.Pair;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiLimitedPostHorizontal2Dot3CellReuseAssem extends PoiLimitedPostHorizontalBaseReuseAssem {
    @Override // com.ss.android.ugc.aweme.poi.detail.postcard.cell.PoiLimitedPostHorizontalBaseReuseAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C0T48 c0t48 = PoiLimitedPostHorizontalBaseReuseAssem.LLJLIL;
        Context context = getContext();
        c0t48.getClass();
        Pair pairLIZ = C0T48.LIZ(context, true);
        int iIntValue = ((Number) pairLIZ.getFirst()).intValue();
        int iIntValue2 = ((Number) pairLIZ.getSecond()).intValue();
        if (LJJIJL().getLayoutParams().width != iIntValue) {
            LJJIJL().getLayoutParams().width = iIntValue;
            up().LLILZLL.getLayoutParams().width = iIntValue;
            up().LLILZLL.getLayoutParams().height = iIntValue2;
        }
    }
}
