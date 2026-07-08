package com.ss.android.ugc.aweme.im.ui.recyclerview;

import X.AbstractC21679819sy;
import X.C01GW;
import X.C21673319rv;
import X.C452501pT;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Pair;
import kotlin.jvm.internal.AwS577S0100000_33;

/* JADX INFO: loaded from: classes34.dex */
public class DynamicMarginLinearLayoutManager2 extends InnerChatLinearLayoutManager {
    public final boolean LLJI;
    public int LLJIJIL;
    public int LLJILJIL;
    public int LLJILJILJ;
    public int LLJILLL;
    public RecyclerView LLJJ;
    public Pair<Integer, Integer> LLJJI;
    public final C01GW LLJJIII;

    public final void LJIJJ() {
        Pair<Integer, Integer> pair;
        int iFindFirstVisibleItemPosition = findFirstVisibleItemPosition();
        if (iFindFirstVisibleItemPosition != -1) {
            View viewFindViewByPosition = findViewByPosition(iFindFirstVisibleItemPosition);
            pair = new Pair<>(Integer.valueOf(iFindFirstVisibleItemPosition), Integer.valueOf(viewFindViewByPosition != null ? ((AbstractC21679819sy) this.LLJJIII.getValue()).LJI() - getDecoratedBottom(viewFindViewByPosition) : 0));
        } else {
            pair = null;
        }
        this.LLJJI = pair;
    }

    @Override // com.ss.android.ugc.aweme.im.ui.recyclerview.InnerChatLinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onAttachedToWindow(RecyclerView recyclerView) {
        super.onAttachedToWindow(recyclerView);
        this.LLJJ = recyclerView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onScrollStateChanged(int i) {
        super.onScrollStateChanged(i);
        if (i == 0) {
            LJIJJ();
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void setReverseLayout(boolean z) {
        super.setReverseLayout(true);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void setStackFromEnd(boolean z) {
        super.setStackFromEnd(false);
    }

    public DynamicMarginLinearLayoutManager2(View view, boolean z) {
        super(view.getContext());
        this.LLJI = z;
        this.LLJIJIL = Integer.MAX_VALUE;
        this.LLJILJIL = -1;
        this.LLJILJILJ = -1;
        this.LLJILLL = -1;
        this.LLJJIII = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2474));
        setStackFromEnd(false);
        setReverseLayout(true);
    }

    @Override // com.ss.android.ugc.aweme.im.ui.recyclerview.InnerChatLinearLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onDetachedFromWindow(RecyclerView recyclerView, C21673319rv c21673319rv) {
        super.onDetachedFromWindow(recyclerView, c21673319rv);
        this.LLJJ = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x021c  */
    @Override // com.ss.android.ugc.aweme.im.ui.recyclerview.InnerChatLinearLayoutManager, com.ss.android.ugc.aweme.im.recyclerview.SafeChatLinearLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onLayoutChildren(X.C21673319rv r20, X.C21673919s1 r21) {
        /*
            Method dump skipped, instruction units count: 550
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.ui.recyclerview.DynamicMarginLinearLayoutManager2.onLayoutChildren(X.19rv, X.19s1):void");
    }
}
