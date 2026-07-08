package com.ss.android.ugc.aweme.cell;

import X.C1235870iGX;
import X.C786410Ut5;
import X.EnumC323450Cm7;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes32.dex */
public final class MentionVideoFooterCell extends MusicFooterCell {
    @Override // com.ss.android.ugc.aweme.cell.MusicFooterCell
    public final void P5(EnumC323450Cm7 enumC323450Cm7) {
        if (enumC323450Cm7 != null && enumC323450Cm7 != EnumC323450Cm7.Refresh) {
            C1235870iGX c1235870iGX = this.LLILZ;
            if (c1235870iGX != null) {
                C786410Ut5.D6(c1235870iGX, new RecyclerView.LayoutParams(-1, 0));
            }
            C1235870iGX c1235870iGX2 = this.LLILZ;
            if (c1235870iGX2 != null) {
                C786410Ut5.LLLLIILL(c1235870iGX2, 8);
                return;
            }
            return;
        }
        C1235870iGX c1235870iGX3 = this.LLILZ;
        if (c1235870iGX3 == null) {
            return;
        }
        c1235870iGX3.LJI();
    }
}
