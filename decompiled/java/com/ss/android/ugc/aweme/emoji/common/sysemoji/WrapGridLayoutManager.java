package com.ss.android.ugc.aweme.emoji.common.sysemoji;

import X.C21673319rv;
import X.C21673919s1;
import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.GridLayoutManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes7.dex */
public class WrapGridLayoutManager extends GridLayoutManager {
    public WrapGridLayoutManager(int i, Context context) {
        super(i, 1, context, false);
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onLayoutChildren(C21673319rv c21673319rv, C21673919s1 c21673919s1) {
        try {
            super.onLayoutChildren(c21673319rv, c21673919s1);
        } catch (IndexOutOfBoundsException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public WrapGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
