package com.ss.android.ugc.aweme.live.livehostimpl.livereply.spriteimage;

import X.C1835950xsP;
import X.C1836130xsh;
import X.C1836200xso;
import X.C21673919s1;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;

/* JADX INFO: loaded from: classes28.dex */
public final class SpriteImageScrollLinearLayoutManager extends LinearLayoutManager {
    public final Context LL;
    public final int LLILLJJLI;
    public final float LLILLL;
    public final C1836130xsh<C1836200xso> LLILZ;

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeHorizontalScrollOffset(C21673919s1 c21673919s1) {
        int iFindFirstVisibleItemPosition = findFirstVisibleItemPosition();
        int iAbs = 0;
        if (C1835950xsP.LIZIZ(this.LL)) {
            View viewFindViewByPosition = findViewByPosition(iFindFirstVisibleItemPosition);
            if (viewFindViewByPosition != null) {
                iAbs = Math.abs(viewFindViewByPosition.getLeft());
            }
        } else {
            View viewFindViewByPosition2 = findViewByPosition(iFindFirstVisibleItemPosition);
            if (viewFindViewByPosition2 != null) {
                iAbs = Math.abs(viewFindViewByPosition2.getRight());
            }
            iAbs -= this.LLILZ.LIZIZ.LIZ;
        }
        if (iFindFirstVisibleItemPosition != 0) {
            if (iFindFirstVisibleItemPosition != 1) {
                return iAbs + this.LLILLJJLI + ((int) ((iFindFirstVisibleItemPosition - 1) * this.LLILLL));
            }
            return iAbs + this.LLILLJJLI;
        }
        return iAbs;
    }

    public SpriteImageScrollLinearLayoutManager(Context context, int i, float f, C1836130xsh<C1836200xso> c1836130xsh) {
        super(context, 0, false);
        this.LL = context;
        this.LLILLJJLI = i;
        this.LLILLL = f;
        this.LLILZ = c1836130xsh;
    }
}
