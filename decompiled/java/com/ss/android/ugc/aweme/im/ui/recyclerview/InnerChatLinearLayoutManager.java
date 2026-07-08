package com.ss.android.ugc.aweme.im.ui.recyclerview;

import X.C21673319rv;
import X.C21673919s1;
import X.C2189501Ama;
import Y.ARunnableS98S0200000_29;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
public class InnerChatLinearLayoutManager extends ChatLinearLayoutManager {
    public RecyclerView LLILLL;
    public Integer LLILZ;
    public boolean LLILZIL;
    public boolean LLILZLL;
    public int LLIZ;
    public int LLIZLLLIL;
    public long LLJ;

    @Override // com.ss.android.ugc.aweme.im.ui.recyclerview.ChatLinearLayoutManager
    public final int LJIIL() {
        return getReverseLayout() ? findLastVisibleItemPosition() : findFirstVisibleItemPosition();
    }

    @Override // com.ss.android.ugc.aweme.im.ui.recyclerview.ChatLinearLayoutManager
    public final int LJIILIIL() {
        return getReverseLayout() ? findFirstVisibleItemPosition() : findLastVisibleItemPosition();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final int findFirstVisibleItemPosition() {
        try {
            return super.findFirstVisibleItemPosition();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return -1;
        }
    }

    @Override // com.ss.android.ugc.aweme.im.ui.recyclerview.ChatLinearLayoutManager
    public final long LJIILJJIL() {
        return this.LLJ;
    }

    public InnerChatLinearLayoutManager(Context context) {
        super(context);
        this.LLILZIL = true;
        this.LLIZ = -1;
        this.LLJ = -1L;
    }

    @Override // com.ss.android.ugc.aweme.im.ui.recyclerview.ChatLinearLayoutManager
    public final List<RecyclerView.ViewHolder> LJIILL(RecyclerView recyclerView) {
        int iLJIIL = LJIIL();
        int iLJIILIIL = LJIILIIL();
        ArrayList arrayList = new ArrayList();
        if (iLJIILIIL <= iLJIIL) {
            while (true) {
                RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(iLJIILIIL);
                if (viewHolderFindViewHolderForAdapterPosition != null) {
                    arrayList.add(viewHolderFindViewHolderForAdapterPosition);
                }
                if (iLJIILIIL == iLJIIL) {
                    break;
                }
                iLJIILIIL++;
            }
        }
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.im.ui.recyclerview.ChatLinearLayoutManager
    public final void LJIILLIIL(RecyclerView recyclerView) {
        int itemCount;
        if (getReverseLayout()) {
            if (LJIILIIL() > 20) {
                scrollToPosition(20);
            }
            HandlerHook.viewPost(recyclerView, new ARunnableS98S0200000_29(recyclerView, this, 18));
        } else {
            if (getItemCount() - 1 >= 0) {
                itemCount = getItemCount() - 1;
            } else {
                itemCount = 0;
            }
            smoothScrollToPosition(recyclerView, null, itemCount);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.ui.recyclerview.ChatLinearLayoutManager
    public final void LJIIZILJ(int i) {
        this.LLIZLLLIL = i;
    }

    @Override // com.ss.android.ugc.aweme.im.ui.recyclerview.ChatLinearLayoutManager
    public final void LJIJ(int i) {
        this.LLIZ = i;
    }

    @Override // com.ss.android.ugc.aweme.im.ui.recyclerview.ChatLinearLayoutManager
    public final void LJIJI(boolean z) {
        int iIntValue;
        if (this.LLILZIL == z) {
            return;
        }
        this.LLILZIL = z;
        RecyclerView recyclerView = this.LLILLL;
        if (recyclerView != null) {
            if (z) {
                Integer num = this.LLILZ;
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 1;
                }
            } else {
                iIntValue = 2;
            }
            recyclerView.setOverScrollMode(iIntValue);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onAttachedToWindow(RecyclerView recyclerView) {
        int iIntValue;
        super.onAttachedToWindow(recyclerView);
        this.LLILLL = recyclerView;
        if (this.LLILZ == null) {
            this.LLILZ = Integer.valueOf(recyclerView.getOverScrollMode());
        }
        RecyclerView recyclerView2 = this.LLILLL;
        if (recyclerView2 != null) {
            if (this.LLILZIL) {
                Integer num = this.LLILZ;
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 1;
                }
            } else {
                iIntValue = 2;
            }
            recyclerView2.setOverScrollMode(iIntValue);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onDetachedFromWindow(RecyclerView recyclerView, C21673319rv c21673319rv) {
        super.onDetachedFromWindow(recyclerView, c21673319rv);
        this.LLILLL = null;
    }

    @Override // com.ss.android.ugc.aweme.im.recyclerview.SafeChatLinearLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(C21673319rv c21673319rv, C21673919s1 c21673919s1) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i = this.LLIZ;
        if (i != -1) {
            scrollToPositionWithOffset(i, this.LLIZLLLIL);
            this.LLIZ = -1;
            this.LLIZLLLIL = 0;
        }
        super.onLayoutChildren(c21673319rv, c21673919s1);
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        long j = this.LLJ;
        if (jCurrentTimeMillis2 < j) {
            jCurrentTimeMillis2 = j;
        }
        this.LLJ = jCurrentTimeMillis2;
    }

    @Override // com.ss.android.ugc.aweme.im.recyclerview.SafeChatLinearLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int scrollVerticallyBy(int i, C21673319rv c21673319rv, C21673919s1 c21673919s1) {
        if (!this.LLILZIL) {
            return 0;
        }
        return super.scrollVerticallyBy(i, c21673319rv, c21673919s1);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void smoothScrollToPosition(RecyclerView recyclerView, C21673919s1 c21673919s1, int i) {
        C2189501Ama c2189501Ama = new C2189501Ama(this, recyclerView.getContext(), 1);
        c2189501Ama.LIZ = i;
        startSmoothScroll(c2189501Ama);
    }
}
