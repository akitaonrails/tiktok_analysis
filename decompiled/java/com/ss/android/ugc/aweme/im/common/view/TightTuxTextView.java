package com.ss.android.ugc.aweme.im.common.view;

import X.AbstractC2098408Jy;
import X.C13LZ;
import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes7.dex */
public class TightTuxTextView extends TuxTextView {
    public TightTuxTextView(Context context) {
        this(context, null, 6, 0);
    }

    public TightTuxTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    @Override // com.bytedance.tux.input.TuxTextView, androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Layout layout = getLayout();
        if (layout == null) {
            return;
        }
        int lineCount = layout.getLineCount();
        if (View.MeasureSpec.getMode(i) != Integer.MIN_VALUE || lineCount < 2) {
            return;
        }
        int paragraphDirection = layout.getParagraphDirection(0);
        Iterable iterableLJIILJJIL = C13LZ.LJIILJJIL(1, lineCount);
        if (!(iterableLJIILJJIL instanceof Collection) || !((Collection) iterableLJIILJJIL).isEmpty()) {
            Iterator<Integer> it2 = iterableLJIILJJIL.iterator();
            while (it2.hasNext()) {
                if (layout.getParagraphDirection(((AbstractC2098408Jy) it2).nextInt()) != paragraphDirection) {
                    return;
                }
            }
        }
        Iterator<Integer> it3 = C13LZ.LJIILJJIL(0, lineCount).iterator();
        if (it3.hasNext()) {
            AbstractC2098408Jy abstractC2098408Jy = (AbstractC2098408Jy) it3;
            float lineWidth = layout.getLineWidth(abstractC2098408Jy.nextInt());
            while (it3.hasNext()) {
                lineWidth = Math.max(lineWidth, layout.getLineWidth(abstractC2098408Jy.nextInt()));
            }
            int iCeil = ((int) Math.ceil(lineWidth)) + getCompoundPaddingLeft() + getCompoundPaddingRight();
            int measuredWidth = getMeasuredWidth();
            if (iCeil > measuredWidth) {
                iCeil = measuredWidth;
            }
            setMeasuredDimension(iCeil, getMeasuredHeight());
            return;
        }
        throw new NoSuchElementException();
    }

    public TightTuxTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TightTuxTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        int i3;
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        if ((i & 4) != 0) {
            i3 = R.attr.z4;
        } else {
            i3 = 0;
        }
        super(context, attributeSet, i3);
    }
}
