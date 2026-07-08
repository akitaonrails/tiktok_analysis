package com.ss.android.ugc.aweme.portrait.tab;

import X.AbstractC214823195h;
import X.C0MX0;
import android.content.Context;
import androidx.recyclerview.widget.GridLayoutManager;

/* JADX INFO: loaded from: classes9.dex */
public final class AIPortraitGridLayoutManager extends GridLayoutManager {
    public final C0MX0 LLJ;

    public AIPortraitGridLayoutManager(Context context, C0MX0 c0mx0) {
        super(context, 2);
        this.LLJ = c0mx0;
        this.LLIZ = new AbstractC214823195h() { // from class: X.0MWu
            @Override // X.AbstractC214823195h
            public final int LJFF(int i) {
                Integer numValueOf;
                C0MX0 c0mx02 = this.LJ.LLJ;
                if (c0mx02 != null && (numValueOf = Integer.valueOf(c0mx02.getItemViewType(i))) != null) {
                    if (numValueOf.intValue() == 2 || numValueOf.intValue() == 3) {
                        return 2;
                    }
                    return 1;
                }
                return 1;
            }
        };
    }
}
