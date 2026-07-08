package com.ss.android.ugc.aweme.im.messagelist.protocols;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.ss.android.ugc.aweme.views.RoundingCornerLayout;

/* JADX INFO: loaded from: classes27.dex */
public final class IMDynamicCardFrame extends RoundingCornerLayout {
    public int LLILZ;

    public IMDynamicCardFrame(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final void setMaxWidthPx(int i) {
        this.LLILZ = i;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int i3 = this.LLILZ;
        if (1 <= i3 && i3 < size) {
            i = View.MeasureSpec.makeMeasureSpec(this.LLILZ, View.MeasureSpec.getMode(i));
        }
        super.onMeasure(i, i2);
    }

    public IMDynamicCardFrame(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        this.LLILZ = Integer.MAX_VALUE;
    }
}
