package com.ss.android.ugc.aweme.commercialize.feed.assem.bottomlabel;

import X.C0B8B;
import android.view.View;
import com.ss.android.ugc.feed.platform.cell.interact.info.bottomlabel.BottomLabelUIModelAssem;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes12.dex */
public final class AdBottomLabelUIAssem extends BottomLabelUIModelAssem {
    @Override // com.ss.android.ugc.feed.platform.cell.interact.info.bottomlabel.BottomLabelUIModelAssem, com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        Bp().setTag(R.id.ekr, Boolean.valueOf(((Boolean) C0B8B.LIZ.getValue()).booleanValue()));
    }
}
