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
public class DynamicMarginLinearLayoutManager extends InnerChatLinearLayoutManager {
    public final boolean LLJI;
    public int LLJIJIL;
    public int LLJILJIL;
    public int LLJILJILJ;
    public int LLJILLL;
    public Pair<Integer, Integer> LLJJ;
    public final C01GW LLJJI;

    public final AbstractC21679819sy LJIJJ() {
        return (AbstractC21679819sy) this.LLJJI.getValue();
    }

    public final void LJIJJLI() {
        Pair<Integer, Integer> pair;
        int iFindFirstVisibleItemPosition = findFirstVisibleItemPosition();
        if (iFindFirstVisibleItemPosition != -1) {
            View viewFindViewByPosition = findViewByPosition(iFindFirstVisibleItemPosition);
            pair = new Pair<>(Integer.valueOf(iFindFirstVisibleItemPosition), Integer.valueOf(viewFindViewByPosition != null ? LJIJJ().LJI() - getDecoratedBottom(viewFindViewByPosition) : 0));
        } else {
            pair = null;
        }
        this.LLJJ = pair;
    }

    @Override // com.ss.android.ugc.aweme.im.ui.recyclerview.InnerChatLinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onAttachedToWindow(RecyclerView recyclerView) {
        super.onAttachedToWindow(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onScrollStateChanged(int i) {
        super.onScrollStateChanged(i);
        if (i == 0) {
            LJIJJLI();
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

    public DynamicMarginLinearLayoutManager(View view, boolean z) {
        super(view.getContext());
        this.LLJI = z;
        this.LLJIJIL = Integer.MAX_VALUE;
        this.LLJILJIL = -1;
        this.LLJILJILJ = -1;
        this.LLJILLL = -1;
        this.LLJJI = C452501pT.LIZIZ(new AwS577S0100000_33(this, 2473));
        setStackFromEnd(false);
        setReverseLayout(true);
    }

    @Override // com.ss.android.ugc.aweme.im.ui.recyclerview.InnerChatLinearLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onDetachedFromWindow(RecyclerView recyclerView, C21673319rv c21673319rv) {
        super.onDetachedFromWindow(recyclerView, c21673319rv);
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01ee A[EDGE_INSN: B:168:0x01ee->B:97:0x01ee BREAK  A[LOOP:0: B:36:0x0106->B:84:0x01a3], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02ae A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01a3 A[LOOP:0: B:36:0x0106->B:84:0x01a3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01a9  */
    @Override // com.ss.android.ugc.aweme.im.ui.recyclerview.InnerChatLinearLayoutManager, com.ss.android.ugc.aweme.im.recyclerview.SafeChatLinearLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onLayoutChildren(X.C21673319rv r23, X.C21673919s1 r24) {
        /*
            Method dump skipped, instruction units count: 766
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.ui.recyclerview.DynamicMarginLinearLayoutManager.onLayoutChildren(X.19rv, X.19s1):void");
    }
}
