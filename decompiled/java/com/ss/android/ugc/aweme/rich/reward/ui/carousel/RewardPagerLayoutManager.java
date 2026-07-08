package com.ss.android.ugc.aweme.rich.reward.ui.carousel;

import X.C21673919s1;
import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;

/* JADX INFO: loaded from: classes17.dex */
public final class RewardPagerLayoutManager extends LinearLayoutManager {
    public int LL;

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean supportsPredictiveItemAnimations() {
        return false;
    }

    public RewardPagerLayoutManager(Context context) {
        super(context, 0, false);
        this.LL = 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void calculateExtraLayoutSpace(C21673919s1 c21673919s1, int[] iArr) {
        int height;
        if (getOrientation() == 0) {
            height = getWidth();
        } else {
            height = getHeight();
        }
        int i = height * this.LL;
        iArr[0] = i;
        iArr[1] = i;
    }
}
