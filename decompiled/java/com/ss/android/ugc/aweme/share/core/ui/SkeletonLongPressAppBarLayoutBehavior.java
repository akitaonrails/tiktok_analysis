package com.ss.android.ugc.aweme.share.core.ui;

import X.C16G0;
import X.C16GX;
import X.C19382510sJ;
import X.EnumC19382410sI;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout$Behavior;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes32.dex */
public final class SkeletonLongPressAppBarLayoutBehavior extends AppBarLayout$Behavior {
    public WeakReference<RecyclerView> LIZ;
    public WeakReference<C16GX> LIZIZ;
    public int LIZJ;
    public EnumC19382410sI LIZLLL;
    public float LJ;
    public VelocityTracker LJFF;
    public final int LJI;
    public final int LJII;

    public SkeletonLongPressAppBarLayoutBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LIZLLL = EnumC19382410sI.NONE;
        new Rect();
        this.LJI = 100;
        this.LJII = 10000;
    }

    @Override // com.google.android.material.appbar.HeaderBehavior, X.C16BC
    public final boolean onInterceptTouchEvent(C16G0 c16g0, View view, MotionEvent motionEvent) {
        RecyclerView recyclerView;
        if (this.LJFF == null) {
            this.LJFF = VelocityTracker.obtain();
        }
        VelocityTracker velocityTracker = this.LJFF;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1 || action == 3) {
                VelocityTracker velocityTracker2 = this.LJFF;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                }
                this.LJFF = null;
            }
        } else {
            this.LJ = motionEvent.getY();
            this.LIZLLL = EnumC19382410sI.NONE;
            WeakReference<RecyclerView> weakReference = this.LIZ;
            if (weakReference != null && (recyclerView = weakReference.get()) != null) {
                int height = recyclerView.getHeight();
                int height2 = view.getHeight();
                int height3 = c16g0.getHeight();
                int i = height3 - height2;
                if (height <= i) {
                    this.LIZJ = 0;
                    this.LIZLLL = EnumC19382410sI.SHORT;
                } else if (i + 1 <= height && height < height3) {
                    this.LIZLLL = EnumC19382410sI.HALF;
                    this.LIZJ = (height2 + height) - height3;
                }
            }
        }
        return super.onInterceptTouchEvent(c16g0, view, motionEvent);
    }

    @Override // com.google.android.material.appbar.AppBarLayout$BaseBehavior
    public final boolean onLayoutChild(C16G0 c16g0, C16GX c16gx, int i) {
        View childAt;
        boolean zOnLayoutChild = super.onLayoutChild(c16g0, c16gx, i);
        int childCount = c16g0.getChildCount();
        int i2 = 0;
        while (true) {
            if (i2 < childCount) {
                childAt = c16g0.getChildAt(i2);
                if (childAt instanceof RecyclerView) {
                    break;
                }
                i2++;
            } else {
                childAt = null;
                break;
            }
        }
        this.LIZ = new WeakReference<>(childAt);
        this.LIZIZ = new WeakReference<>(c16gx);
        return zOnLayoutChild;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x004a  */
    @Override // com.google.android.material.appbar.HeaderBehavior, X.C16BC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(X.C16G0 r7, android.view.View r8, android.view.MotionEvent r9) {
        /*
            r6 = this;
            X.10sI r1 = r6.LIZLLL
            X.10sI r0 = X.EnumC19382410sI.HALF
            if (r1 == r0) goto La
            X.10sI r0 = X.EnumC19382410sI.SHORT
            if (r1 != r0) goto L2d
        La:
            android.view.VelocityTracker r0 = r6.LJFF
            if (r0 != 0) goto L14
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r6.LJFF = r0
        L14:
            android.view.VelocityTracker r0 = r6.LJFF
            if (r0 == 0) goto L1b
            r0.addMovement(r9)
        L1b:
            int r4 = r8.getTop()
            int r1 = r9.getAction()
            r5 = 0
            r3 = 1
            if (r1 == r3) goto L4a
            r0 = 2
            if (r1 == r0) goto L32
            r0 = 3
            if (r1 == r0) goto L4a
        L2d:
            boolean r3 = super.onTouchEvent(r7, r8, r9)
        L31:
            return r3
        L32:
            float r1 = r6.LJ
            float r0 = r9.getY()
            float r1 = r1 - r0
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 <= 0) goto L43
            int r1 = -r4
            int r0 = r6.LIZJ
            if (r1 < r0) goto L2d
            return r3
        L43:
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 >= 0) goto L2d
            if (r4 < 0) goto L2d
            return r3
        L4a:
            android.view.VelocityTracker r2 = r6.LJFF
            if (r2 == 0) goto L56
            int r0 = r6.LJII
            float r1 = (float) r0
            r0 = 1000(0x3e8, float:1.401E-42)
            r2.computeCurrentVelocity(r0, r1)
        L56:
            android.view.VelocityTracker r0 = r6.LJFF
            if (r0 == 0) goto L5e
            float r5 = r0.getYVelocity()
        L5e:
            int r1 = r6.LJI
            float r0 = (float) r1
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            r2 = 0
            if (r0 > 0) goto L92
            int r0 = -r1
            float r0 = (float) r0
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 >= 0) goto L92
            int r1 = -r4
            int r0 = r6.LIZJ
            if (r1 < r0) goto L7b
            android.view.VelocityTracker r0 = r6.LJFF
            if (r0 == 0) goto L78
            r0.recycle()
        L78:
            r6.LJFF = r2
            return r3
        L7b:
            int r1 = -r0
            java.lang.ref.WeakReference<X.16GX> r0 = r6.LIZIZ
            if (r0 == 0) goto L31
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L31
            r0.setTop(r1)
            r6.setTopAndBottomOffset(r1)
            r0.requestLayout()
            return r3
        L92:
            android.view.VelocityTracker r0 = r6.LJFF
            if (r0 == 0) goto L99
            r0.recycle()
        L99:
            r6.LJFF = r2
            goto L2d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.share.core.ui.SkeletonLongPressAppBarLayoutBehavior.onTouchEvent(X.16G0, android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // com.google.android.material.appbar.AppBarLayout$BaseBehavior, X.C16GU, X.C16BC
    public final /* bridge */ /* synthetic */ boolean onLayoutChild(C16G0 c16g0, View view, int i) {
        return onLayoutChild(c16g0, (C16GX) view, i);
    }

    @Override // X.C16BC
    public final boolean onNestedPreFling(C16G0 c16g0, View view, View view2, float f, float f2) {
        return super.onNestedPreFling(c16g0, view, view2, f, f2);
    }

    @Override // X.C16BC
    public final boolean onNestedFling(C16G0 c16g0, View view, View view2, float f, float f2, boolean z) {
        return super.onNestedFling(c16g0, view, view2, f, f2, z);
    }

    @Override // com.google.android.material.appbar.AppBarLayout$BaseBehavior
    public final void onNestedPreScroll(C16G0 c16g0, C16GX c16gx, View view, int i, int i2, int[] iArr, int i3) {
        RecyclerView recyclerView;
        int top = c16gx.getTop();
        EnumC19382410sI enumC19382410sI = this.LIZLLL;
        if (enumC19382410sI == EnumC19382410sI.HALF || enumC19382410sI == EnumC19382410sI.SHORT) {
            if (i2 > 0) {
                if ((-top) >= this.LIZJ) {
                    iArr[1] = i2;
                    WeakReference<RecyclerView> weakReference = this.LIZ;
                    if (weakReference != null && (recyclerView = weakReference.get()) != null) {
                        recyclerView.stopNestedScroll();
                        return;
                    }
                    return;
                }
            } else if (i2 < 0 && top >= 0) {
                iArr[1] = i2;
                return;
            }
        }
        if (view instanceof RecyclerView) {
            int i4 = C19382510sJ.LIZ[enumC19382410sI.ordinal()];
            if (i4 != 1) {
                if (i4 == 2) {
                    int top2 = c16gx.getTop() + i2;
                    int i5 = this.LIZJ;
                    if (top2 < (-i5)) {
                        iArr[1] = (-i5) - c16gx.getTop();
                        return;
                    }
                }
            } else {
                iArr[1] = i2;
            }
        }
        super.onNestedPreScroll(c16g0, c16gx, view, i, i2, iArr, i3);
    }

    @Override // com.google.android.material.appbar.AppBarLayout$BaseBehavior, X.C16BC
    public final /* bridge */ /* synthetic */ void onNestedPreScroll(C16G0 c16g0, View view, View view2, int i, int i2, int[] iArr, int i3) {
        onNestedPreScroll(c16g0, (C16GX) view, view2, i, i2, iArr, i3);
    }

    @Override // com.google.android.material.appbar.AppBarLayout$BaseBehavior
    public final void onNestedScroll(C16G0 c16g0, C16GX c16gx, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        super.onNestedScroll(c16g0, c16gx, view, i, i2, i3, i4, i5, iArr);
        EnumC19382410sI enumC19382410sI = this.LIZLLL;
        if (enumC19382410sI == EnumC19382410sI.HALF || enumC19382410sI == EnumC19382410sI.SHORT) {
            int top = c16gx.getTop();
            if (top > 0) {
                c16gx.setTop(0);
                c16gx.requestLayout();
                return;
            }
            int i6 = -top;
            int i7 = this.LIZJ;
            if (i6 <= i7) {
                return;
            }
            c16gx.setTop(-i7);
            c16gx.requestLayout();
        }
    }

    @Override // com.google.android.material.appbar.AppBarLayout$BaseBehavior, X.C16BC
    public final /* bridge */ /* synthetic */ void onNestedScroll(C16G0 c16g0, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        onNestedScroll(c16g0, (C16GX) view, view2, i, i2, i3, i4, i5, iArr);
    }
}
