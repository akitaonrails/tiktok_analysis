package com.ss.android.ugc.aweme.notification.view;

import X.C1720106oR;
import X.C21673319rv;
import X.C21673919s1;
import X.C2187451AjH;
import X.C2188811AlT;
import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes5.dex */
public class FixedLinearlayoutManager extends LinearLayoutManager {
    public final String LL;

    public FixedLinearlayoutManager(Context context) {
        super(context);
        this.LL = "";
    }

    public FixedLinearlayoutManager(Context context, int i) {
        super(context, 1, false);
        this.LL = "";
        this.LL = "InboxFragmentV2";
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onLayoutChildren(C21673319rv c21673319rv, C21673919s1 c21673919s1) {
        try {
            super.onLayoutChildren(c21673319rv, c21673919s1);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            if ("InboxFragment".equals(this.LL)) {
                int i = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onLayoutChildren error, childCount:");
                sbLIZ.append(getChildCount());
                sbLIZ.append(" recyclerview.state:");
                sbLIZ.append(c21673919s1.toString());
                C1720106oR.LIZIZ("InboxLayoutManager", C2188811AlT.LIZIZ(sbLIZ), e);
            }
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int scrollVerticallyBy(int i, C21673319rv c21673319rv, C21673919s1 c21673919s1) {
        boolean zLJI = MethodIDManager.LJI(71746);
        try {
            int iScrollVerticallyBy = super.scrollVerticallyBy(i, c21673319rv, c21673919s1);
            if (zLJI) {
                MethodIDManager.LJ();
            }
            return iScrollVerticallyBy;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            if ("InboxFragment".equals(this.LL)) {
                int i2 = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("scrollVerticallyBy error, childCount:");
                sbLIZ.append(getChildCount());
                sbLIZ.append(" recyclerview.state:");
                sbLIZ.append(c21673919s1.toString());
                C1720106oR.LIZIZ("InboxLayoutManager", C2188811AlT.LIZIZ(sbLIZ), e);
            }
            if (zLJI) {
                MethodIDManager.LJ();
                return 0;
            }
            return 0;
        }
    }

    public FixedLinearlayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.LL = "";
    }
}
