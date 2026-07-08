package com.bytedance.ies.sdk.widgets.dependence;

import X.C1083330eIV;
import X.C13LP;
import X.C13LQ;
import X.C19ME;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class HorizontalSpaceSolver implements SpaceSolver {
    public final ConstraintLayout container;
    public final int[] ids;
    public final int spaceMargin;

    private final List<View> getVisibleViews() {
        ArrayList arrayList = new ArrayList();
        for (int i : this.ids) {
            View viewById = this.container.getViewById(i);
            if (viewById != null && viewById.getVisibility() != 8) {
                arrayList.add(viewById);
            }
        }
        return arrayList;
    }

    @Override // com.bytedance.ies.sdk.widgets.dependence.SpaceSolver
    public void resolveSpace(int i) {
        if (!C13LQ.LJIILJJIL(i, this.ids)) {
            return;
        }
        C1083330eIV.LIZ(this.container, this.ids);
        List<View> visibleViews = getVisibleViews();
        if (visibleViews.isEmpty()) {
            return;
        }
        if (visibleViews.size() <= 1) {
            View view = (View) C13LP.LJJJJZI(visibleViews);
            C19ME c19me = (C19ME) view.getLayoutParams();
            c19me.setMarginStart(0);
            c19me.setMarginEnd(0);
            c19me.resolveLayoutDirection(view.getLayoutDirection());
            return;
        }
        View view2 = (View) C13LP.LJJJJZI(visibleViews);
        C19ME c19me2 = (C19ME) view2.getLayoutParams();
        if (c19me2.getMarginStart() != 0 || c19me2.getMarginEnd() != this.spaceMargin) {
            c19me2.setMarginStart(0);
            c19me2.setMarginEnd(this.spaceMargin);
            c19me2.resolveLayoutDirection(view2.getLayoutDirection());
        }
        int size = visibleViews.size() - 1;
        for (int i2 = 1; i2 < size; i2++) {
            View view3 = (View) ListProtector.get(visibleViews, i2);
            C19ME c19me3 = (C19ME) view3.getLayoutParams();
            int marginEnd = c19me3.getMarginEnd();
            int i3 = this.spaceMargin;
            if (marginEnd != i3) {
                c19me3.setMarginEnd(i3);
                c19me3.resolveLayoutDirection(view3.getLayoutDirection());
            }
        }
        C19ME c19me4 = (C19ME) ((View) C13LP.LJJLIIIJJI(visibleViews)).getLayoutParams();
        if (c19me4.getMarginEnd() == 0) {
            return;
        }
        c19me4.setMarginEnd(0);
        c19me4.resolveLayoutDirection(view2.getLayoutDirection());
    }

    public HorizontalSpaceSolver(int[] iArr, ConstraintLayout constraintLayout, int i) {
        this.ids = iArr;
        this.container = constraintLayout;
        this.spaceMargin = i;
    }
}
