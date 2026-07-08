package com.ss.android.ugc.aweme.im.recyclerview;

import X.C0Z53;
import X.C1AF0;
import X.C21673319rv;
import X.C21673919s1;
import X.C2188811AlT;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.saas.host.api.im.utils.IMALogApi;

/* JADX INFO: loaded from: classes34.dex */
public class SafeChatLinearLayoutManager extends LinearLayoutManager {
    public int LL;

    public SafeChatLinearLayoutManager(Context context) {
        super(context);
    }

    public SafeChatLinearLayoutManager(Context context, int i) {
        super(context, 0, false);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(C21673319rv c21673319rv, C21673919s1 c21673919s1) {
        try {
            super.onLayoutChildren(c21673319rv, c21673919s1);
        } catch (IllegalArgumentException | IllegalStateException | IndexOutOfBoundsException | NullPointerException e) {
            TryCatchGuardChecker.doCheck(e);
            this.LL++;
            IMALogApi.LIZ.getClass();
            IMALogApi iMALogApiLIZ = C0Z53.LIZ();
            if (iMALogApiLIZ != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("OnLayout Exception ");
                sbLIZ.append(e.getMessage());
                iMALogApiLIZ.LIZ(6, "IM-Chatroom", C2188811AlT.LIZIZ(sbLIZ));
                iMALogApiLIZ.logException(e);
            }
            C1AF0.LJFF(e, "MessageAdapter exception olc");
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int scrollHorizontallyBy(int i, C21673319rv c21673319rv, C21673919s1 c21673919s1) {
        try {
            return super.scrollHorizontallyBy(i, c21673319rv, c21673919s1);
        } catch (IndexOutOfBoundsException e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJFF(e, "MessageAdapter exception scrollH");
            return 0;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i, C21673319rv c21673319rv, C21673919s1 c21673919s1) {
        try {
            return super.scrollVerticallyBy(i, c21673319rv, c21673919s1);
        } catch (IllegalArgumentException | IllegalStateException | IndexOutOfBoundsException | NullPointerException e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJFF(e, "MessageAdapter exception scrollv");
            return 0;
        }
    }

    public SafeChatLinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final View onFocusSearchFailed(View view, int i, C21673319rv c21673319rv, C21673919s1 c21673919s1) {
        try {
            return super.onFocusSearchFailed(view, i, c21673319rv, c21673919s1);
        } catch (IndexOutOfBoundsException e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJFF(e, "MessageAdapter exception focus");
            return null;
        }
    }
}
