package com.bytedance.android.livesdk.chatroom.ui;

import X.C1151510g4T;
import X.C1161920gLG;
import X.C1CC2;
import X.C21673319rv;
import X.C21673919s1;
import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes18.dex */
public class SmoothLinearLayoutManager extends LinearLayoutManager {
    public float LL;
    public boolean LLILLJJLI;
    public boolean LLILLL;

    public final boolean LJIIL() {
        if (this.LLILLL) {
            return true;
        }
        IHostAppContext iHostAppContext = (IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class);
        if (iHostAppContext != null) {
            this.LLILLL = iHostAppContext.isLocalTest();
        }
        return this.LLILLL;
    }

    public SmoothLinearLayoutManager(Context context) {
        super(context, 1, false);
        this.LL = 25.0f;
        this.LLILLJJLI = true;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onLayoutChildren(C21673319rv c21673319rv, C21673919s1 c21673919s1) throws Exception {
        try {
            super.onLayoutChildren(c21673319rv, c21673919s1);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            if (!LJIIL()) {
                C1CC2.LIZ("Public screen RecyclerView NPE", e);
                return;
            }
            throw e;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int scrollHorizontallyBy(int i, C21673319rv c21673319rv, C21673919s1 c21673919s1) throws Exception {
        try {
            return super.scrollHorizontallyBy(i, c21673319rv, c21673919s1);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            if (!LJIIL()) {
                C1CC2.LIZ("Public screen RecyclerView NPE", e);
                return 0;
            }
            throw e;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int scrollVerticallyBy(int i, C21673319rv c21673319rv, C21673919s1 c21673919s1) throws Exception {
        try {
            return super.scrollVerticallyBy(i, c21673319rv, c21673919s1);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            if (!LJIIL()) {
                C1CC2.LIZ("Public screen RecyclerView NPE", e);
                return 0;
            }
            throw e;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void smoothScrollToPosition(RecyclerView recyclerView, C21673919s1 c21673919s1, int i) {
        C1151510g4T c1151510g4T;
        if (i < 0) {
            i = 0;
        }
        if (this.LLILLJJLI) {
            c1151510g4T = new C1151510g4T(recyclerView.getContext(), this, 0);
        } else {
            c1151510g4T = new C1151510g4T(recyclerView.getContext(), this, 1);
        }
        c1151510g4T.LIZ = i;
        startSmoothScroll(c1151510g4T);
    }

    public SmoothLinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.LL = 25.0f;
        this.LLILLJJLI = true;
    }
}
