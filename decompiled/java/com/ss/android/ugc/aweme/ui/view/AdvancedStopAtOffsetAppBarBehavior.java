package com.ss.android.ugc.aweme.ui.view;

import X.C0NCH;
import X.C0SS5;
import X.C0SSE;
import X.C0SSF;
import X.C0SSG;
import X.C16G0;
import X.C16GX;
import X.C419990GdR;
import X.C814420VxA;
import Y.ARunnableS80S0200000_11;
import Y.ARunnableS8S0301000_11;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.OverScroller;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.google.android.material.appbar.AppBarLayout$Behavior;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import kotlin.Pair;
import kotlin.jvm.internal.AwS590S0100000_11;
import u4.q0;

/* JADX INFO: loaded from: classes12.dex */
public final class AdvancedStopAtOffsetAppBarBehavior extends AppBarLayout$Behavior {
    public C0SS5 LIZ;
    public boolean LIZIZ;
    public C0SSE LIZJ;
    public C16GX LIZLLL;
    public ARunnableS80S0200000_11 LJ;
    public WeakReference<RecyclerView> LJFF;
    public Integer LJI;
    public final boolean LJII;
    public boolean LJIIIIZZ;
    public Integer LJIIIZ;
    public final int LJIIJ;
    public final int LJIIJJI;
    public final boolean LJIIL;
    public final boolean LJIILIIL;
    public final boolean LJIILJJIL;
    public final boolean LJIILL;
    public AwS590S0100000_11 LJIILLIIL;
    public boolean LJIIZILJ;
    public boolean LJIJ;
    public boolean LJIJI;
    public int LJIJJ;
    public int LJIJJLI;
    public boolean LJIL;
    public final C0SSF LJJ;
    public OverScroller LJJI;
    public ARunnableS8S0301000_11 LJJIFFI;
    public Field LJJII;
    public Field LJJIII;
    public boolean LJJIIJ;
    public C0NCH LJJIIJZLJL;
    public C0NCH LJJIIZ;
    public Integer LJJIIZI;
    public Integer LJJIJ;
    public boolean LJJIJIIJI;
    public Integer LJJIJIIJIL;
    public C0SSG LJJIJIL;

    public final boolean LJI() {
        RecyclerView recyclerView;
        WeakReference<RecyclerView> weakReference = this.LJFF;
        if (weakReference == null || (recyclerView = weakReference.get()) == null) {
            return false;
        }
        return recyclerView.canScrollVertically(-1);
    }

    public final void LJIIIIZZ() {
        RecyclerView recyclerView;
        WeakReference<RecyclerView> weakReference = this.LJFF;
        if (weakReference == null || (recyclerView = weakReference.get()) == null) {
            return;
        }
        recyclerView.stopScroll();
        q0.LJJIII(1, recyclerView);
    }

    public final void LIZIZ(C16GX c16gx) {
        ARunnableS8S0301000_11 aRunnableS8S0301000_11 = this.LJJIFFI;
        if (aRunnableS8S0301000_11 == null) {
            return;
        }
        this.LJJIFFI = null;
        HandlerHook.viewRemoveCallbacks(c16gx, aRunnableS8S0301000_11);
        OverScroller overScroller = this.LJJI;
        if (overScroller != null) {
            overScroller.abortAnimation();
        }
        this.LJJI = null;
        this.LJIIZILJ = false;
        this.LJIJ = true;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0050 A[Catch: all -> 0x008f, TryCatch #1 {all -> 0x008f, blocks: (B:8:0x001b, B:10:0x0021, B:12:0x0025, B:14:0x002d, B:15:0x0031, B:17:0x0035, B:34:0x006f, B:36:0x0073, B:38:0x007f, B:20:0x003e, B:26:0x0050, B:28:0x0054, B:30:0x0060, B:23:0x0047, B:31:0x0066, B:39:0x0084, B:41:0x0089, B:42:0x008b), top: B:75:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006f A[Catch: all -> 0x008f, TryCatch #1 {all -> 0x008f, blocks: (B:8:0x001b, B:10:0x0021, B:12:0x0025, B:14:0x002d, B:15:0x0031, B:17:0x0035, B:34:0x006f, B:36:0x0073, B:38:0x007f, B:20:0x003e, B:26:0x0050, B:28:0x0054, B:30:0x0060, B:23:0x0047, B:31:0x0066, B:39:0x0084, B:41:0x0089, B:42:0x008b), top: B:75:0x001b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(X.C0SSD r10) {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ui.view.AdvancedStopAtOffsetAppBarBehavior.LJFF(X.0SSD):void");
    }

    public final void LJII(int i) {
        this.LJIIIIZZ = true;
        this.LJIIIZ = Integer.valueOf(i);
        LJIIIIZZ();
    }

    public AdvancedStopAtOffsetAppBarBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LIZIZ = true;
        this.LJII = true;
        this.LJIIJ = 4;
        this.LJIIJJI = 2;
        this.LJIIL = true;
        this.LJIILIIL = true;
        this.LJIILJJIL = true;
        this.LJIILL = true;
        this.LJIJJ = Integer.MIN_VALUE;
        this.LJIJJLI = Integer.MIN_VALUE;
        this.LJIL = true;
        this.LJJ = new C0SSF(0);
        C0NCH c0nch = C0NCH.LLILLL;
        this.LJJIIJZLJL = c0nch;
        this.LJJIIZ = c0nch;
    }

    public static int LIZJ(C16GX c16gx, int i) {
        return C419990GdR.LIZIZ(i, -c16gx.getTotalScrollRange(), 0);
    }

    public final void LJ(C16GX c16gx, int i, C0SSG c0ssg) {
        LinearLayoutManager linearLayoutManager;
        RecyclerView recyclerView;
        int iLIZJ = LIZJ(c16gx, i);
        Integer num = this.LJJIJIIJIL;
        if (num != null && num.intValue() == iLIZJ && this.LJJIJIL == c0ssg) {
            return;
        }
        this.LJJIJIIJIL = Integer.valueOf(iLIZJ);
        this.LJJIJIL = c0ssg;
        WeakReference<RecyclerView> weakReference = this.LJFF;
        RecyclerView.LayoutManager layoutManager = null;
        if (weakReference != null && (recyclerView = weakReference.get()) != null) {
            layoutManager = recyclerView.getLayoutManager();
        }
        if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
            linearLayoutManager.scrollToPositionWithOffset(0, 0);
        }
        C0SS5 c0ss5 = this.LIZ;
        if (c0ss5 != null) {
            c0ss5.LJI();
        }
    }

    @Override // com.google.android.material.appbar.HeaderBehavior, X.C16BC
    public final boolean onInterceptTouchEvent(C16G0 c16g0, View view, MotionEvent motionEvent) {
        boolean z;
        Integer numValueOf;
        Integer numValueOf2;
        boolean z2;
        RecyclerView recyclerView;
        C16GX c16gx = (C16GX) view;
        if (motionEvent.getActionMasked() == 0) {
            WeakReference<RecyclerView> weakReference = this.LJFF;
            if (weakReference != null && (recyclerView = weakReference.get()) != null && c16g0.LJIIJ((int) motionEvent.getX(), (int) motionEvent.getY(), recyclerView)) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.LJJIJIIJI = z2;
        }
        if (this.LJJIJIIJI) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int iIntValue = Integer.MIN_VALUE;
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                this.LJIJI = false;
                this.LJIJJ = Integer.MIN_VALUE;
            }
        } else {
            this.LJIJI = true;
            this.LJJIIJZLJL = C0NCH.LLILLL;
            int topAndBottomOffset = getTopAndBottomOffset();
            this.LJIJJ = topAndBottomOffset;
            this.LJIJJLI = topAndBottomOffset;
            motionEvent.getRawY();
            Integer num = this.LJI;
            if (num != null) {
                iIntValue = num.intValue();
            }
            if (iIntValue > this.LJIJJ) {
                z = true;
            } else {
                z = false;
            }
            this.LJIL = z;
        }
        if (this.LJIIIIZZ) {
            if (this.LJII) {
                Integer num2 = this.LJIIIZ;
                if (num2 != null && (numValueOf2 = Integer.valueOf(LIZJ(c16gx, num2.intValue()))) != null) {
                    LIZ(c16g0, c16gx, numValueOf2.intValue(), false);
                }
                LJIIIIZZ();
            } else if (this.LJII) {
                Integer num3 = this.LJIIIZ;
                if (num3 != null && (numValueOf = Integer.valueOf(LIZJ(c16gx, num3.intValue()))) != null) {
                    LIZ(c16g0, c16gx, numValueOf.intValue(), false);
                }
                LJIIIIZZ();
            }
            return true;
        }
        return super.onInterceptTouchEvent(c16g0, c16gx, motionEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0071, code lost:
    
        if (r4 != 3) goto L36;
     */
    @Override // com.google.android.material.appbar.HeaderBehavior, X.C16BC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(X.C16G0 r10, android.view.View r11, android.view.MotionEvent r12) {
        /*
            Method dump skipped, instruction units count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ui.view.AdvancedStopAtOffsetAppBarBehavior.onTouchEvent(X.16G0, android.view.View, android.view.MotionEvent):boolean");
    }

    public final void LIZ(C16G0 c16g0, C16GX c16gx, int i, boolean z) {
        if (getTopAndBottomOffset() == i) {
            return;
        }
        getTopAndBottomOffset();
        setTopAndBottomOffset(i);
        c16g0.LIZLLL(c16gx);
        if (z) {
            c16gx.invalidate();
        } else {
            if (!this.LJIILL) {
                return;
            }
            c16gx.invalidate();
        }
    }

    public final boolean LIZLLL(int i, int i2, int i3, boolean z) {
        boolean z2;
        int iIntValue;
        boolean z3;
        boolean z4;
        boolean z5;
        int iMax;
        Integer numValueOf = Integer.valueOf(this.LJJ.LIZJ);
        if (numValueOf.intValue() != Integer.MIN_VALUE) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            iIntValue = numValueOf.intValue();
        } else {
            iIntValue = i2;
        }
        if (Math.abs(i2 - i) <= this.LJIIJ) {
            z3 = true;
        } else {
            z3 = false;
        }
        if ((iIntValue <= i && i2 >= i) || (iIntValue >= i && i2 <= i)) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (i >= iIntValue ? !(i <= iIntValue || i3 >= 0) : i3 > 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        if ((z3 || z4) && z5) {
            Integer num = this.LJJ.LIZ;
            if (num != null && num.intValue() == i) {
                this.LJJ.LIZIZ++;
                if (z && this.LJIILJJIL) {
                    iMax = Math.max(this.LJIIJJI, 2);
                } else {
                    iMax = this.LJIIJJI;
                }
                if (this.LJJ.LIZIZ >= iMax) {
                    return true;
                }
                return false;
            }
            this.LJJ.LIZ = Integer.valueOf(i);
            this.LJJ.LIZIZ = 1;
            return false;
        }
        Integer num2 = this.LJJ.LIZ;
        if (num2 != null && num2.intValue() == i) {
            this.LJJ.LIZIZ = 0;
            return false;
        }
        C0SSF c0ssf = this.LJJ;
        c0ssf.LIZ = null;
        c0ssf.LIZIZ = 0;
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x015d  */
    @Override // com.google.android.material.appbar.AppBarLayout$BaseBehavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onStopNestedScroll(X.C16G0 r11, X.C16GX r12, android.view.View r13, int r14) {
        /*
            Method dump skipped, instruction units count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ui.view.AdvancedStopAtOffsetAppBarBehavior.onStopNestedScroll(X.16G0, X.16GX, android.view.View, int):void");
    }

    @Override // com.google.android.material.appbar.AppBarLayout$BaseBehavior, X.C16BC
    public final /* bridge */ /* synthetic */ void onStopNestedScroll(C16G0 c16g0, View view, View view2, int i) {
        onStopNestedScroll(c16g0, (C16GX) view, view2, i);
    }

    @Override // X.C16BC
    public final boolean onNestedPreFling(C16G0 c16g0, View view, View view2, float f, float f2) {
        Integer numValueOf;
        boolean z;
        boolean z2;
        Pair pair;
        Integer numValueOf2;
        C16GX c16gx;
        C16GX c16gx2 = (C16GX) view;
        this.LIZLLL = c16gx2;
        if (f2 < 0.0f && this.LIZIZ && (c16gx = this.LIZLLL) != null) {
            ARunnableS80S0200000_11 aRunnableS80S0200000_11 = this.LJ;
            if (aRunnableS80S0200000_11 == null) {
                this.LJ = new ARunnableS80S0200000_11(this, c16gx, 57);
            } else {
                HandlerHook.viewRemoveCallbacks(c16gx, aRunnableS80S0200000_11);
            }
            HandlerHook.viewPostDelay(c16gx, this.LJ, 600L);
        }
        if (this.LJIIIIZZ && this.LJII && f2 > 0.0f) {
            Integer num = this.LJIIIZ;
            if (num != null && (numValueOf2 = Integer.valueOf(LIZJ(c16gx2, num.intValue()))) != null) {
                LIZ(c16g0, c16gx2, numValueOf2.intValue(), false);
            }
            LJIIIIZZ();
            return true;
        }
        if (f2 < 0.0f && LJI()) {
            return false;
        }
        Integer num2 = this.LJI;
        if (num2 != null && (numValueOf = Integer.valueOf(LIZJ(c16gx2, num2.intValue()))) != null) {
            int iIntValue = numValueOf.intValue();
            int topAndBottomOffset = getTopAndBottomOffset();
            if (f2 < 0.0f && topAndBottomOffset < iIntValue) {
                z = true;
            } else {
                z = false;
            }
            if (f2 > 0.0f && topAndBottomOffset > iIntValue) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z || z2) {
                OverScroller overScroller = new OverScroller(c16gx2.getContext());
                overScroller.fling(0, topAndBottomOffset, 0, C814420VxA.LIZIZ(-f2), 0, 0, -2147483647, Integer.MAX_VALUE);
                int finalY = overScroller.getFinalY();
                overScroller.abortAnimation();
                if (!z ? finalY < iIntValue : finalY > iIntValue) {
                    LJIIIIZZ();
                    int iIntValue2 = numValueOf.intValue();
                    LIZIZ(c16gx2);
                    int topAndBottomOffset2 = getTopAndBottomOffset();
                    if (f2 < 0.0f) {
                        pair = new Pair(Integer.valueOf(topAndBottomOffset2), Integer.valueOf(iIntValue2));
                    } else {
                        pair = new Pair(Integer.valueOf(iIntValue2), Integer.valueOf(topAndBottomOffset2));
                    }
                    int iIntValue3 = ((Number) pair.getFirst()).intValue();
                    int iIntValue4 = ((Number) pair.getSecond()).intValue();
                    OverScroller overScroller2 = new OverScroller(c16gx2.getContext());
                    overScroller2.fling(0, topAndBottomOffset2, 0, C814420VxA.LIZIZ(-f2), 0, 0, iIntValue3, iIntValue4);
                    this.LJJI = overScroller2;
                    this.LJIIZILJ = true;
                    ARunnableS8S0301000_11 aRunnableS8S0301000_11 = new ARunnableS8S0301000_11(this, c16g0, c16gx2, iIntValue2, 3);
                    this.LJJIFFI = aRunnableS8S0301000_11;
                    c16gx2.postOnAnimation(aRunnableS8S0301000_11);
                    return true;
                }
            }
        }
        return super.onNestedPreFling(c16g0, c16gx2, view2, f, f2);
    }

    @Override // X.C16BC
    public final boolean onNestedFling(C16G0 c16g0, View view, View view2, float f, float f2, boolean z) {
        Integer numValueOf;
        C16GX c16gx = (C16GX) view;
        if (this.LJIIIIZZ && this.LJII && f2 > 0.0f) {
            Integer num = this.LJIIIZ;
            if (num != null && (numValueOf = Integer.valueOf(LIZJ(c16gx, num.intValue()))) != null) {
                LIZ(c16g0, c16gx, numValueOf.intValue(), false);
            }
            LJIIIIZZ();
            return true;
        }
        if (f2 < 0.0f && LJI()) {
            return false;
        }
        return super.onNestedFling(c16g0, c16gx, view2, f, f2, z);
    }

    @Override // com.google.android.material.appbar.AppBarLayout$BaseBehavior
    public final boolean onStartNestedScroll(C16G0 c16g0, C16GX c16gx, View view, View view2, int i, int i2) {
        int iIntValue;
        boolean z;
        C0SSE c0sse = this.LIZJ;
        if (c0sse != null && c0sse.c7()) {
            return false;
        }
        if (i2 == 0) {
            this.LJJIIJZLJL = C0NCH.LLILLL;
            Integer num = this.LJI;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = Integer.MIN_VALUE;
            }
            if (iIntValue > getTopAndBottomOffset()) {
                z = true;
            } else {
                z = false;
            }
            this.LJIL = z;
            this.LJIJJLI = getTopAndBottomOffset();
        }
        if ((i & 2) == 0) {
            return false;
        }
        super.onStartNestedScroll(c16g0, c16gx, view, view2, i, i2);
        this.LJJ.LIZJ = getTopAndBottomOffset();
        return true;
    }

    @Override // com.google.android.material.appbar.AppBarLayout$BaseBehavior, X.C16BC
    public final /* bridge */ /* synthetic */ boolean onStartNestedScroll(C16G0 c16g0, View view, View view2, View view3, int i, int i2) {
        return onStartNestedScroll(c16g0, (C16GX) view, view2, view3, i, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00be  */
    @Override // com.google.android.material.appbar.AppBarLayout$BaseBehavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onNestedPreScroll(X.C16G0 r26, X.C16GX r27, android.view.View r28, int r29, int r30, int[] r31, int r32) {
        /*
            Method dump skipped, instruction units count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ui.view.AdvancedStopAtOffsetAppBarBehavior.onNestedPreScroll(X.16G0, X.16GX, android.view.View, int, int, int[], int):void");
    }

    @Override // com.google.android.material.appbar.AppBarLayout$BaseBehavior, X.C16BC
    public final /* bridge */ /* synthetic */ void onNestedPreScroll(C16G0 c16g0, View view, View view2, int i, int i2, int[] iArr, int i3) {
        onNestedPreScroll(c16g0, (C16GX) view, view2, i, i2, iArr, i3);
    }

    @Override // com.google.android.material.appbar.AppBarLayout$BaseBehavior
    public final void onNestedScroll(C16G0 c16g0, C16GX c16gx, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        Integer numValueOf;
        this.LIZLLL = c16gx;
        if (this.LJIIIIZZ && this.LJII) {
            Integer num = this.LJIIIZ;
            if (num != null) {
                numValueOf = Integer.valueOf(LIZJ(c16gx, num.intValue()));
            } else {
                numValueOf = null;
            }
            if (numValueOf != null) {
                LIZ(c16g0, c16gx, numValueOf.intValue(), false);
            }
            LJIIIIZZ();
            if (i4 > 0) {
                iArr[1] = iArr[1] + i4;
                return;
            }
            return;
        }
        if (i4 < 0 && LJI()) {
            return;
        }
        super.onNestedScroll(c16g0, c16gx, view, i, i2, i3, i4, i5, iArr);
        this.LJJ.LIZJ = getTopAndBottomOffset();
    }

    @Override // com.google.android.material.appbar.AppBarLayout$BaseBehavior, X.C16BC
    public final /* bridge */ /* synthetic */ void onNestedScroll(C16G0 c16g0, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        onNestedScroll(c16g0, (C16GX) view, view2, i, i2, i3, i4, i5, iArr);
    }
}
