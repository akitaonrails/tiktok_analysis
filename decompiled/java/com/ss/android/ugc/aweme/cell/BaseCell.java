package com.ss.android.ugc.aweme.cell;

import X.AbstractC19293010ds;
import X.AbstractC19318610i0;
import X.C1954807lC;
import X.C786410Ut5;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;

/* JADX INFO: loaded from: classes29.dex */
public abstract class BaseCell<T extends AbstractC19293010ds> extends PowerCell<T> {
    public abstract View I5(ViewGroup viewGroup);

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        super.onViewAttachedToWindow();
        getItem();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewDetachedFromWindow() {
        AbstractC19318610i0 abstractC19318610i0;
        super.onViewDetachedFromWindow();
        T item = getItem();
        if (item == null || (abstractC19318610i0 = item.LLILZ) == null) {
            return;
        }
        abstractC19318610i0.onViewDetachedFromWindow();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* JADX INFO: renamed from: L5 */
    public void onBindItemView(T t) {
        super.onBindItemView(t);
        boolean zLIZ = t.LIZ();
        if (zLIZ) {
            C786410Ut5.LJLLLLLL(0, this.itemView);
            ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = -1;
                layoutParams.height = -2;
                return;
            }
            return;
        }
        if (!zLIZ) {
            C786410Ut5.LJLLLLLL(8, this.itemView);
            ViewGroup.LayoutParams layoutParams2 = this.itemView.getLayoutParams();
            if (layoutParams2 == null) {
                return;
            }
            layoutParams2.width = 0;
            layoutParams2.height = 0;
            return;
        }
        throw new C1954807lC();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return I5(viewGroup);
    }
}
