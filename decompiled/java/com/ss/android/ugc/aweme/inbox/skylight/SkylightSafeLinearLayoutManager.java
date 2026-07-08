package com.ss.android.ugc.aweme.inbox.skylight;

import X.C1720106oR;
import X.C21673319rv;
import X.C21673919s1;
import X.C2187451AjH;
import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes5.dex */
public final class SkylightSafeLinearLayoutManager extends LinearLayoutManager {
    public SkylightSafeLinearLayoutManager(Context context) {
        super(context, 0, false);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onLayoutChildren(C21673319rv c21673319rv, C21673919s1 c21673919s1) {
        try {
            super.onLayoutChildren(c21673319rv, c21673919s1);
        } catch (IndexOutOfBoundsException e) {
            TryCatchGuardChecker.doCheck(e);
            int i = C2187451AjH.LIZ;
            C1720106oR.LIZIZ("SkylightSafeLLM", "Inconsistency detected during onLayoutChildren, recovering", e);
        }
    }
}
