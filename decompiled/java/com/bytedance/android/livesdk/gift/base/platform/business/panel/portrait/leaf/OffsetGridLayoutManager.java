package com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.leaf;

import X.C1128610fTX;
import X.C21673319rv;
import X.C21673919s1;
import X.C21681919tJ;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes11.dex */
public final class OffsetGridLayoutManager extends GridLayoutManager {
    public final Function0<Unit> LLJ;
    public final HashMap<Integer, Integer> LLJI;

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeVerticalScrollOffset(C21673919s1 c21673919s1) {
        int iIntValue;
        int top = 0;
        if (getChildCount() == 0) {
            return 0;
        }
        try {
            int iFindFirstVisibleItemPosition = findFirstVisibleItemPosition();
            View viewFindViewByPosition = findViewByPosition(iFindFirstVisibleItemPosition);
            int i = 0;
            for (int i2 = 0; i2 < iFindFirstVisibleItemPosition; i2++) {
                Integer num = this.LLJI.get(Integer.valueOf(i2));
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 0;
                }
                i += iIntValue;
            }
            if (viewFindViewByPosition != null) {
                top = viewFindViewByPosition.getTop();
            }
            top = i - top;
            return top;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return top;
        }
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onLayoutCompleted(C21673919s1 c21673919s1) {
        super.onLayoutCompleted(c21673919s1);
        int iFindFirstVisibleItemPosition = findFirstVisibleItemPosition();
        int iFindLastVisibleItemPosition = findLastVisibleItemPosition();
        if (iFindFirstVisibleItemPosition >= 0 && iFindLastVisibleItemPosition >= 0 && iFindLastVisibleItemPosition >= iFindFirstVisibleItemPosition) {
            while (iFindFirstVisibleItemPosition < iFindLastVisibleItemPosition) {
                View childAt = getChildAt(iFindFirstVisibleItemPosition);
                if (childAt != null) {
                    if (((C21681919tJ) childAt.getLayoutParams()).LL == 0) {
                        this.LLJI.put(Integer.valueOf(iFindFirstVisibleItemPosition), Integer.valueOf(childAt.getHeight()));
                    } else {
                        this.LLJI.put(Integer.valueOf(iFindFirstVisibleItemPosition), 0);
                    }
                }
                iFindFirstVisibleItemPosition++;
            }
            this.LLJ.invoke();
        }
    }

    public OffsetGridLayoutManager(Context context, C1128610fTX c1128610fTX) {
        super(4, 1, context, false);
        this.LLJ = c1128610fTX;
        this.LLJI = new HashMap<>();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onDetachedFromWindow(RecyclerView recyclerView, C21673319rv c21673319rv) {
        super.onDetachedFromWindow(recyclerView, c21673319rv);
    }
}
