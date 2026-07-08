package com.ss.android.ugc.aweme.commercialize.chatagent.ui;

import X.C21673319rv;
import X.C21673919s1;
import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes5.dex */
public class CommerceAgentLinearLayoutManager extends LinearLayoutManager {
    public CommerceAgentLinearLayoutManager(Context context) {
        super(context, 1, false);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onLayoutChildren(C21673319rv c21673319rv, C21673919s1 c21673919s1) {
        try {
            super.onLayoutChildren(c21673319rv, c21673919s1);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
