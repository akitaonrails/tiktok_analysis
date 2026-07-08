package t76;

import X.C1314690kJf;
import X.C2188811AlT;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes21.dex */
public class g$b extends FrameLayout {
    public int LL;
    public C1314690kJf LLILLJJLI;
    public int LLILLL;
    public final int LLILZ;
    public final int LLILZIL;
    public int LLILZLL;
    public int LLIZ;

    @Override // android.view.View
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("WrapView{mLayoutStatus=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", mUIComponent=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", lastMeasuredWidth=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", lastMeasuredHeight=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public g$b(Context context) {
        super(context);
        this.LLILLL = -1;
        this.LLILZ = 400;
        this.LLILZIL = -1;
        this.LLILZLL = -1;
        this.LLIZ = -1;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int measuredWidth;
        int measuredHeight;
        if (this.LL == 0) {
            measuredWidth = this.LLILZIL;
            if (measuredWidth <= 0) {
                measuredWidth = View.MeasureSpec.getSize(i);
            }
            measuredHeight = this.LLILZ;
        } else {
            C1314690kJf c1314690kJf = this.LLILLJJLI;
            if (c1314690kJf != null) {
                c1314690kJf.LJJJLZIJ();
                if (2 == this.LL) {
                    this.LL = 3;
                }
                C1314690kJf c1314690kJf2 = this.LLILLJJLI;
                measuredWidth = c1314690kJf2.LLJJJIL + c1314690kJf2.LLJL + c1314690kJf2.LLJLILLLLZIIL;
                measuredHeight = c1314690kJf2.LLJJJJ + c1314690kJf2.LLJLIL + c1314690kJf2.LLJLL;
            } else {
                measuredWidth = getMeasuredWidth();
                measuredHeight = getMeasuredHeight();
            }
        }
        this.LLILZLL = measuredWidth;
        this.LLIZ = measuredHeight;
        setMeasuredDimension(measuredWidth, measuredHeight);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C1314690kJf c1314690kJf = this.LLILLJJLI;
        if (c1314690kJf != null) {
            if (c1314690kJf.LLJJIJIIJIL != 0) {
                c1314690kJf.LJL(0);
            }
            C1314690kJf c1314690kJf2 = this.LLILLJJLI;
            if (c1314690kJf2.LLJJIJI != 0) {
                c1314690kJf2.LJJZ(0);
            }
            this.LLILLJJLI.LJLJLJ();
            C1314690kJf c1314690kJf3 = this.LLILLJJLI;
            int i5 = c1314690kJf3.LLJL;
            int i6 = c1314690kJf3.LLJLIL;
            ((ViewGroup) c1314690kJf3.LLLLLILLIL).layout(i5, i6, c1314690kJf3.LLJJJIL + i5, c1314690kJf3.LLJJJJ + i6);
            if (this.LLILLJJLI.LLLFFI != 0) {
                ((ViewGroup) getParent()).setClipChildren(false);
            }
            Rect clipBounds = this.LLILLJJLI.LLLLLILLIL.getClipBounds();
            if (clipBounds != null) {
                clipBounds.set(Math.min(clipBounds.left, i), Math.min(clipBounds.top, i2), Math.max(clipBounds.right, i3), Math.max(clipBounds.bottom, i4));
                setClipBounds(clipBounds);
            }
        }
    }
}
