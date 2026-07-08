package com.ss.android.ugc.aweme.favorites.business.collection.collaborative;

import X.C16G0;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.bytedance.tux.sheet.sheet.TuxSheetBehavior;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes22.dex */
public final class TuxCollectionIntroBehavior<V extends View> extends TuxSheetBehavior<V> {
    public final Rect LJJIJLIJ = new Rect();
    public ViewConfiguration LJJIL;
    public float LJJIZ;
    public boolean LJJJ;

    @Override // com.bytedance.tux.sheet.sheet.TuxSheetBehavior, X.C16BC
    public final boolean onInterceptTouchEvent(C16G0 c16g0, V v, MotionEvent motionEvent) {
        int scaledTouchSlop;
        boolean z;
        v.getHitRect(this.LJJIJLIJ);
        if (this.LJJIJLIJ.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            if (motionEvent.getAction() == 0) {
                this.LJJIJLIJ.setEmpty();
                this.LJJIZ = motionEvent.getY();
            }
            if (this.LJJIL == null) {
                this.LJJIL = ViewConfiguration.get(c16g0.getContext());
            }
            if (motionEvent.getAction() == 2) {
                float y = motionEvent.getY() - this.LJJIZ;
                ViewConfiguration viewConfiguration = this.LJJIL;
                if (viewConfiguration != null) {
                    scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
                } else {
                    scaledTouchSlop = 0;
                }
                if (y > scaledTouchSlop) {
                    z = true;
                } else {
                    z = false;
                }
                this.LJJJ = z;
                if (z) {
                    View viewFindViewById = c16g0.findViewById(R.id.ky6);
                    if (viewFindViewById == null || viewFindViewById.canScrollVertically(-1)) {
                        return false;
                    }
                    return true;
                }
            }
        }
        return super.onInterceptTouchEvent(c16g0, v, motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0025  */
    @Override // com.bytedance.tux.sheet.sheet.TuxSheetBehavior, X.C16BC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(X.C16G0 r4, V r5, android.view.MotionEvent r6) {
        /*
            r3 = this;
            int r1 = r6.getAction()
            if (r1 == 0) goto L28
            r2 = 0
            r0 = 1
            if (r1 == r0) goto L25
            r0 = 2
            if (r1 == r0) goto L15
            r0 = 3
            if (r1 == r0) goto L25
        L10:
            boolean r0 = super.onTouchEvent(r4, r5, r6)
            return r0
        L15:
            float r1 = r6.getY()
            float r0 = r3.LJJIZ
            float r1 = r1 - r0
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L22
            r2 = 1
        L22:
            r3.LJJJ = r2
            goto L10
        L25:
            r3.LJJJ = r2
            goto L10
        L28:
            float r0 = r6.getY()
            r3.LJJIZ = r0
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.favorites.business.collection.collaborative.TuxCollectionIntroBehavior.onTouchEvent(X.16G0, android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // com.bytedance.tux.sheet.sheet.TuxSheetBehavior, X.C16BC
    public final boolean onNestedPreFling(C16G0 c16g0, V v, View view, float f, float f2) {
        if (!this.LJJJ || view.canScrollVertically(-1)) {
            return false;
        }
        return super.onNestedPreFling(c16g0, v, view, f, f2);
    }
}
