package com.ss.android.ugc.aweme.ecommerce.search.vision.behavior;

import X.AbstractC21586119dr;
import X.C16G0;
import X.C20733516Bh;
import X.C21586019dq;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.visualsearch.components.bottomsheet.SearchBottomSheetBehavior;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes32.dex */
public final class PhotoSearchBottomSheetBehavior<V extends View> extends SearchBottomSheetBehavior<V> {
    public static final /* synthetic */ int LJJIL = 0;
    public final C20733516Bh LJJIJLIJ;

    public PhotoSearchBottomSheetBehavior() {
        this(null, null);
    }

    @Override // com.ss.android.ugc.aweme.visualsearch.components.bottomsheet.SearchBottomSheetBehavior
    public final boolean LJI(View view) {
        int top;
        if (view != null) {
            top = view.getTop();
        } else {
            top = 0;
        }
        if (top > this.LJJIIZ + (((this.LJJIIJZLJL - r1) / 4.0f) * 3)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.16Bh] */
    public PhotoSearchBottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LJJIJLIJ = new Object() { // from class: X.16Bh
        };
    }

    @Override // com.ss.android.ugc.aweme.visualsearch.components.bottomsheet.SearchBottomSheetBehavior
    public final C21586019dq LIZIZ(C16G0 c16g0, AbstractC21586119dr abstractC21586119dr) {
        C20733516Bh c20733516Bh = this.LJJIJLIJ;
        C21586019dq c21586019dqLJIIIZ = C21586019dq.LJIIIZ(c16g0, abstractC21586119dr);
        try {
            Field declaredField = C21586019dq.class.getDeclaredField("LJIIZILJ");
            declaredField.setAccessible(true);
            Context context = c16g0.getContext();
            c20733516Bh.getClass();
            declaredField.set(c21586019dqLJIIIZ, new OverScroller(context, new Interpolator() { // from class: X.16Bj
                @Override // android.animation.TimeInterpolator
                public final float getInterpolation(float f) {
                    float f2 = f - 1.0f;
                    return (f2 * f2 * f2 * f2 * f2) + 1.0f;
                }
            }));
            return c21586019dqLJIIIZ;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return c21586019dqLJIIIZ;
        }
    }

    @Override // com.ss.android.ugc.aweme.visualsearch.components.bottomsheet.SearchBottomSheetBehavior
    public final boolean shouldHide(View view, float f) {
        int top;
        if (this.LJIIL) {
            return true;
        }
        float f2 = this.LJJIIZ + ((this.LJJIIJZLJL - r1) / 3.0f);
        if (view != null) {
            top = view.getTop();
        } else {
            top = 0;
        }
        float f3 = top;
        if (f3 >= f2) {
            return true;
        }
        float f4 = f3 + (f * 0.1f);
        int i = this.LIZIZ;
        if (i == 0) {
            i = this.LIZJ;
        }
        if (Math.abs(f4 - this.LJI) / i > 0.5f) {
            return true;
        }
        return false;
    }
}
