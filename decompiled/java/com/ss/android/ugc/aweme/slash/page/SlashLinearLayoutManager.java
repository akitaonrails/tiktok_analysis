package com.ss.android.ugc.aweme.slash.page;

import X.C1205490hTX;
import X.C1EMR;
import X.C21673319rv;
import X.C21673919s1;
import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes19.dex */
public final class SlashLinearLayoutManager extends LinearLayoutManager {
    public SlashLinearLayoutManager(Context context) {
        super(context);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onLayoutChildren(C21673319rv c21673319rv, C21673919s1 c21673919s1) {
        try {
            super.onLayoutChildren(c21673319rv, c21673919s1);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1205490hTX.LIZ.LJ(C1EMR.SLASH_LAYOUT_ERROR, e);
        }
    }
}
