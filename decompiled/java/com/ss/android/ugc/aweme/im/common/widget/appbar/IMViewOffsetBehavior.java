package com.ss.android.ugc.aweme.im.common.widget.appbar;

import X.C16BC;
import X.C16G0;
import X.C16GQ;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: loaded from: classes32.dex */
public class IMViewOffsetBehavior<V extends View> extends C16BC<V> {
    public C16GQ LIZ;
    public int LIZIZ;

    public final int getTopAndBottomOffset() {
        C16GQ c16gq = this.LIZ;
        if (c16gq != null) {
            return c16gq.LIZLLL;
        }
        return 0;
    }

    public IMViewOffsetBehavior() {
    }

    public boolean setTopAndBottomOffset(int i) {
        C16GQ c16gq = this.LIZ;
        if (c16gq != null) {
            if (c16gq.LIZLLL == i) {
                return false;
            }
            c16gq.LIZLLL = i;
            c16gq.LIZ();
            return true;
        }
        this.LIZIZ = i;
        return false;
    }

    public IMViewOffsetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void layoutChild(C16G0 c16g0, V v, int i) {
        c16g0.LJIIL(i, v);
    }

    @Override // X.C16BC
    public boolean onLayoutChild(C16G0 c16g0, V v, int i) {
        layoutChild(c16g0, v, i);
        if (this.LIZ == null) {
            this.LIZ = new C16GQ(v);
        }
        C16GQ c16gq = this.LIZ;
        if (c16gq == null) {
            return true;
        }
        c16gq.LIZIZ = c16gq.LIZ.getTop();
        c16gq.LIZJ = c16gq.LIZ.getLeft();
        c16gq.LIZ();
        int i2 = this.LIZIZ;
        if (i2 != 0) {
            if (c16gq.LIZLLL != i2) {
                c16gq.LIZLLL = i2;
                c16gq.LIZ();
            }
            this.LIZIZ = 0;
        }
        return true;
    }
}
