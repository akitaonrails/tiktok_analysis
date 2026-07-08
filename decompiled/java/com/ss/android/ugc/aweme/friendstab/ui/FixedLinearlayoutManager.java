package com.ss.android.ugc.aweme.friendstab.ui;

import X.C1720106oR;
import X.C21673319rv;
import X.C21673919s1;
import X.C2187451AjH;
import X.C2188811AlT;
import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes5.dex */
public final class FixedLinearlayoutManager extends LinearLayoutManager {
    public FixedLinearlayoutManager() {
        throw null;
    }

    public FixedLinearlayoutManager(Context context) {
        super(context, 1, false);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onLayoutChildren(C21673319rv c21673319rv, C21673919s1 c21673919s1) {
        try {
            super.onLayoutChildren(c21673319rv, c21673919s1);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onLayoutChildren error, childCount:");
            sbLIZ.append(getChildCount());
            sbLIZ.append(" recyclerview.state:");
            sbLIZ.append(c21673919s1);
            C1720106oR.LIZIZ("FriendsTabUserCard", C2188811AlT.LIZIZ(sbLIZ), e);
        }
    }
}
