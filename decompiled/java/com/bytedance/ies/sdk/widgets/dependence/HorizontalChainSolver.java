package com.bytedance.ies.sdk.widgets.dependence;

import X.C1083320eIU;
import X.C13LP;
import X.C13LQ;
import X.C19ME;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class HorizontalChainSolver implements ChainSolver {
    public final float bias;
    public final int chainStyle;
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

    @Override // com.bytedance.ies.sdk.widgets.dependence.ChainSolver
    public void resolveChain(int i) {
        if (!C13LQ.LJIILJJIL(i, this.ids)) {
            return;
        }
        C1083320eIU.LIZ(this.container, this.ids);
        List<View> visibleViews = getVisibleViews();
        if (visibleViews.isEmpty()) {
            return;
        }
        View view = (View) C13LP.LJJJJZI(visibleViews);
        C19ME c19me = (C19ME) view.getLayoutParams();
        c19me.horizontalChainStyle = this.chainStyle;
        c19me.horizontalBias = this.bias;
        c19me.setMarginStart(0);
        c19me.resolveLayoutDirection(view.getLayoutDirection());
        int size = visibleViews.size();
        for (int i2 = 1; i2 < size; i2++) {
            View view2 = (View) ListProtector.get(visibleViews, i2);
            C19ME c19me2 = (C19ME) view2.getLayoutParams();
            c19me2.horizontalChainStyle = 0;
            c19me2.horizontalBias = 0.5f;
            int marginStart = c19me2.getMarginStart();
            int i3 = this.spaceMargin;
            if (marginStart != i3) {
                c19me2.setMarginStart(i3);
                c19me2.resolveLayoutDirection(view2.getLayoutDirection());
            }
        }
    }

    public HorizontalChainSolver(int[] iArr, ConstraintLayout constraintLayout, int i, float f, int i2) {
        this.ids = iArr;
        this.container = constraintLayout;
        this.chainStyle = i;
        this.bias = f;
        this.spaceMargin = i2;
    }
}
