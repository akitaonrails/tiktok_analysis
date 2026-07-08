package com.ss.android.ugc.aweme.views;

import X.C1735610vGZ;
import X.C20635115or;
import X.C21673319rv;
import X.C21673919s1;
import X.InterfaceC21676519sR;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.compliance.privacy.phl.feed.PhlFeedFragment;

/* JADX INFO: loaded from: classes27.dex */
public class PagerLayoutManager extends LinearLayoutManager implements InterfaceC21676519sR {
    public final C20635115or LL;
    public C1735610vGZ LLILLJJLI;

    public PagerLayoutManager(Context context) {
        super(context);
        this.LL = new C20635115or();
    }

    @Override // X.InterfaceC21676519sR
    public final void g5(View view) {
        if (this.LLILLJJLI != null && getChildCount() == 1) {
            C1735610vGZ c1735610vGZ = this.LLILLJJLI;
            int position = getPosition(view);
            c1735610vGZ.LIZ.ZR(position);
            c1735610vGZ.LIZ.VR(position, "click");
        }
    }

    @Override // X.InterfaceC21676519sR
    public final void m3(View view) {
        if (this.LLILLJJLI != null) {
            getPosition(view);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onAttachedToWindow(RecyclerView recyclerView) {
        if (recyclerView != null) {
            recyclerView.addOnChildAttachStateChangeListener(this);
            this.LL.LIZIZ(recyclerView);
            super.onAttachedToWindow(recyclerView);
            return;
        }
        throw new IllegalArgumentException("The attach RecycleView must not null!!");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onScrollStateChanged(int i) {
        int position;
        String str;
        if (i == 0) {
            View viewLJFF = this.LL.LJFF(this);
            if (viewLJFF != null) {
                position = getPosition(viewLJFF);
            } else {
                position = 0;
            }
            int childCount = getChildCount();
            C1735610vGZ c1735610vGZ = this.LLILLJJLI;
            if (c1735610vGZ != null && childCount == 1) {
                PhlFeedFragment phlFeedFragment = c1735610vGZ.LIZ;
                int i2 = phlFeedFragment.LLJILJILJ;
                if (position > i2) {
                    str = "swipe_up";
                } else {
                    str = "swipe_down";
                }
                phlFeedFragment.UR(i2, str);
                c1735610vGZ.LIZ.ZR(position);
                c1735610vGZ.LIZ.VR(position, str);
            }
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onDetachedFromWindow(RecyclerView recyclerView, C21673319rv c21673319rv) {
        recyclerView.removeOnChildAttachStateChangeListener(this);
        super.onDetachedFromWindow(recyclerView, c21673319rv);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onLayoutChildren(C21673319rv c21673319rv, C21673919s1 c21673919s1) {
        super.onLayoutChildren(c21673319rv, c21673919s1);
    }
}
