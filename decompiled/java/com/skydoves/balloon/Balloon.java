package com.skydoves.balloon;

import X.C01GW;
import X.C13LQ;
import X.C13LZ;
import X.C15438062q;
import X.C1763660vzo;
import X.C19395210uM;
import X.C1954807lC;
import X.C2247921Cyc;
import X.C2247941Cye;
import X.C2248071Cyr;
import X.C2248101Cyu;
import X.C2248131Cyx;
import X.C2248151Cyz;
import X.C531650Kt9;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC2248011Cyl;
import X.EnumC2248031Cyn;
import X.RunnableC1856270yPB;
import Y.ARunnableS0S0502000_34;
import Y.ARunnableS134S0100000_34;
import Y.ARunnableS19S0100100_16;
import Y.ARunnableS20S0200100_32;
import Y.ARunnableS67S0300000_34;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.skydoves.balloon.Balloon;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.AwS578S0100000_34;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes35.dex */
public final class Balloon implements LifecycleObserver, GenericLifecycleObserver {
    public final Context LL;
    public final C2247921Cyc LLILLJJLI;
    public final C2248101Cyu LLILLL;
    public final C2248151Cyz LLILZ;
    public final PopupWindow LLILZIL;
    public final PopupWindow LLILZLL;
    public boolean LLIZ;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    public final void LIZIZ() {
        C2247921Cyc c2247921Cyc = this.LLILLJJLI;
        int i = c2247921Cyc.LJJIJL;
        if (i != Integer.MIN_VALUE) {
            this.LLILZIL.setAnimationStyle(i);
            return;
        }
        int i2 = C2247941Cye.LIZJ[c2247921Cyc.LJJIL.ordinal()];
        if (i2 == 1) {
            this.LLILZIL.setAnimationStyle(R.style.ba);
            return;
        }
        if (i2 == 2) {
            View contentView = this.LLILZIL.getContentView();
            long j = this.LLILLJJLI.LJJJ;
            C786410Ut5.LJLLLLLL(4, contentView);
            HandlerHook.viewPost(contentView, new ARunnableS19S0100100_16(j, contentView, 1));
            this.LLILZIL.setAnimationStyle(R.style.bd);
            return;
        }
        if (i2 == 3) {
            this.LLILZIL.setAnimationStyle(R.style.bb);
        } else if (i2 == 4) {
            this.LLILZIL.setAnimationStyle(R.style.be);
        } else if (i2 == 5) {
            this.LLILZIL.setAnimationStyle(R.style.f920bc);
        }
    }

    public final void LIZJ() {
        C2247921Cyc c2247921Cyc = this.LLILLJJLI;
        if (c2247921Cyc.LJJIJLIJ != Integer.MIN_VALUE) {
            this.LLILZLL.setAnimationStyle(c2247921Cyc.LJJIJL);
            return;
        }
        if (C2247941Cye.LIZLLL[c2247921Cyc.LJJIZ.ordinal()] == 1) {
            this.LLILZLL.setAnimationStyle(R.style.bb);
        } else {
            this.LLILZLL.setAnimationStyle(R.style.f920bc);
        }
    }

    public final int LJII() {
        int i = this.LLILLJJLI.LIZJ;
        return i != Integer.MIN_VALUE ? i : this.LLILLL.LL.getMeasuredHeight();
    }

    public final int LJIIIIZZ() {
        int i = new Point(Resources.getSystem().getDisplayMetrics().widthPixels, Resources.getSystem().getDisplayMetrics().heightPixels).x;
        this.LLILLJJLI.getClass();
        this.LLILLJJLI.getClass();
        this.LLILLJJLI.getClass();
        int i2 = this.LLILLJJLI.LIZ;
        if (i2 != Integer.MIN_VALUE) {
            return i2 <= i ? i2 : i;
        }
        int measuredWidth = this.LLILLL.LL.getMeasuredWidth();
        this.LLILLJJLI.getClass();
        return C13LZ.LJ(measuredWidth, 0, this.LLILLJJLI.LIZIZ);
    }

    public final boolean LJIIIZ() {
        this.LLILLJJLI.getClass();
        return this.LLILLJJLI.LJJI != null;
    }

    public final void LJIIJJI() {
        C2247921Cyc c2247921Cyc = this.LLILLJJLI;
        int i = c2247921Cyc.LJFF - 1;
        int i2 = (int) c2247921Cyc.LJJ;
        FrameLayout frameLayout = this.LLILLL.LLILZIL;
        int i3 = C2247941Cye.LIZ[c2247921Cyc.LJIIIZ.ordinal()];
        if (i3 == 1) {
            frameLayout.setPadding(i2, i, i2, i < i2 ? i2 : i);
            return;
        }
        if (i3 == 2) {
            frameLayout.setPadding(i2, i, i2, i < i2 ? i2 : i);
        } else if (i3 == 3) {
            frameLayout.setPadding(i, i2, i, i2);
        } else if (i3 == 4) {
            frameLayout.setPadding(i, i2, i, i2);
        }
    }

    public final void LJIJ() {
        HandlerHook.viewPost(this.LLILLL.LLILLJJLI, new ARunnableS134S0100000_34(this, 1));
    }

    public final void dismiss() {
        if (this.LLIZ) {
            AwS578S0100000_34 awS578S0100000_34 = new AwS578S0100000_34(this, 27);
            if (this.LLILLJJLI.LJJIL != EnumC2248031Cyn.CIRCULAR) {
                awS578S0100000_34.invoke();
            } else {
                View contentView = this.LLILZIL.getContentView();
                HandlerHook.viewPost(contentView, new ARunnableS20S0200100_32(this.LLILLJJLI.LJJJ, contentView, awS578S0100000_34, 0));
            }
        }
    }

    public static void LIZ(ViewGroup viewGroup) {
        viewGroup.setFitsSystemWindows(false);
        IntRange intRangeLJIILJJIL = C13LZ.LJIILJJIL(0, viewGroup.getChildCount());
        ArrayList<View> arrayList = new ArrayList(C15438062q.LJIJJ(intRangeLJIILJJIL, 10));
        C531650Kt9 it2 = intRangeLJIILJJIL.iterator();
        while (it2.LLILLL) {
            arrayList.add(viewGroup.getChildAt(it2.nextInt()));
        }
        for (View view : arrayList) {
            view.setFitsSystemWindows(false);
            if (view instanceof ViewGroup) {
                LIZ((ViewGroup) view);
            }
        }
    }

    public final boolean LIZLLL(View view) {
        if (!this.LLIZ) {
            Context context = this.LL;
            if ((!(context instanceof Activity) || !((Activity) context).isFinishing()) && this.LLILZIL.getContentView().getParent() == null && view.isAttachedToWindow()) {
                return true;
            }
        }
        return false;
    }

    public final void LJ(long j) {
        C786410Ut5.LJLIIL(j, (Handler) this.LLIZLLLIL.getValue(), (RunnableC1856270yPB) this.LLJ.getValue());
    }

    public final float LJFF(View view) {
        int i = C19395210uM.LIZ(this.LLILLL.LLILZIL).x;
        int i2 = C19395210uM.LIZ(view).x;
        float f = r1.LJFF * this.LLILLJJLI.LJIIJ;
        float f2 = 0;
        float f3 = f + f2;
        this.LLILLJJLI.getClass();
        this.LLILLJJLI.getClass();
        float fLJIIIIZZ = ((LJIIIIZZ() - f3) - f2) - f2;
        int i3 = C2247941Cye.LIZIZ[this.LLILLJJLI.LJII.ordinal()];
        if (i3 != 1) {
            if (i3 == 2) {
                if (view.getWidth() + i2 >= i) {
                    if (LJIIIIZZ() + i >= i2) {
                        float width = view.getWidth();
                        C2247921Cyc c2247921Cyc = this.LLILLJJLI;
                        float f4 = (((width * c2247921Cyc.LJI) + i2) - i) - (c2247921Cyc.LJFF * 0.5f);
                        if (f4 > r1 * 2) {
                            if (f4 <= LJIIIIZZ() - (this.LLILLJJLI.LJFF * 2)) {
                                return f4;
                            }
                        }
                    }
                    return fLJIIIIZZ;
                }
                return f3;
            }
            throw new C1954807lC();
        }
        return (this.LLILLL.LLIZ.getWidth() * this.LLILLJJLI.LJI) - (r1.LJFF * 0.5f);
    }

    public final float LJI(View view) {
        int i;
        boolean z = this.LLILLJJLI.LJJJJJ;
        Rect rect = new Rect();
        Context context = view.getContext();
        if ((context instanceof Activity) && z) {
            ((Activity) context).getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
            i = rect.top;
        } else {
            i = 0;
        }
        int i2 = C19395210uM.LIZ(this.LLILLL.LLILZIL).y - i;
        int i3 = C19395210uM.LIZ(view).y - i;
        float f = r2.LJFF * this.LLILLJJLI.LJIIJ;
        float f2 = 0;
        float f3 = f + f2;
        this.LLILLJJLI.getClass();
        this.LLILLJJLI.getClass();
        float fLJII = ((LJII() - f3) - f2) - f2;
        C2247921Cyc c2247921Cyc = this.LLILLJJLI;
        int i4 = c2247921Cyc.LJFF / 2;
        int i5 = C2247941Cye.LIZIZ[c2247921Cyc.LJII.ordinal()];
        if (i5 != 1) {
            if (i5 == 2) {
                if (view.getHeight() + i3 >= i2) {
                    if (LJII() + i2 >= i3) {
                        float height = (((view.getHeight() * this.LLILLJJLI.LJI) + i3) - i2) - i4;
                        if (height > r4.LJFF * 2) {
                            if (height <= LJII() - (this.LLILLJJLI.LJFF * 2)) {
                                return height;
                            }
                        }
                    }
                    return fLJII;
                }
                return f3;
            }
            throw new C1954807lC();
        }
        return (this.LLILLL.LLIZ.getHeight() * this.LLILLJJLI.LJI) - i4;
    }

    public final void LJIIJ(View view) {
        ImageView imageView = this.LLILLL.LLILLL;
        int i = this.LLILLJJLI.LJFF;
        C786410Ut5.c6(imageView, new FrameLayout.LayoutParams(i, i));
        C786410Ut5.V4(imageView, this.LLILLJJLI.LJIL);
        this.LLILLJJLI.getClass();
        this.LLILLJJLI.getClass();
        this.LLILLJJLI.getClass();
        this.LLILLJJLI.getClass();
        this.LLILLJJLI.getClass();
        imageView.setPadding(0, 0, 0, 0);
        C2247921Cyc c2247921Cyc = this.LLILLJJLI;
        int i2 = c2247921Cyc.LJ;
        if (i2 != Integer.MIN_VALUE) {
            C1763660vzo.LIZJ(imageView, ColorStateList.valueOf(i2));
        } else {
            C1763660vzo.LIZJ(imageView, ColorStateList.valueOf(c2247921Cyc.LJIIJJI));
        }
        imageView.setOutlineProvider(ViewOutlineProvider.BOUNDS);
        HandlerHook.viewPost(this.LLILLL.LLILZ, new ARunnableS67S0300000_34(this, view, imageView, 4));
    }

    public final void LJIIZILJ(View... viewArr) {
        if (this.LLILLJJLI.LJJIFFI) {
            View view = viewArr[0];
            if (viewArr.length == 1) {
                this.LLILZ.LLILLJJLI.setAnchorView(view);
            } else {
                this.LLILZ.LLILLJJLI.setAnchorViewList(C13LQ.LJJLL(viewArr));
            }
            C786410Ut5.k3(this.LLILZLL, view, this.LLILLJJLI.LJJIIJ, 0, 0);
        }
    }

    public final void LJIJI(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof TextView) {
                LJIIL(viewGroup, (TextView) childAt);
            } else if (childAt instanceof ViewGroup) {
                LJIJI((ViewGroup) childAt);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02bf  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Balloon(android.content.Context r29, X.C2247921Cyc r30) {
        /*
            Method dump skipped, instruction units count: 797
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.skydoves.balloon.Balloon.<init>(android.content.Context, X.1Cyc):void");
    }

    public static void LJIILLIIL(final Balloon balloon, final View view) {
        final int i = 0;
        final EnumC2248011Cyl enumC2248011Cyl = EnumC2248011Cyl.TOP;
        balloon.getClass();
        final int iLIZIZ = C814420VxA.LIZIZ(view.getMeasuredWidth() * 0.5f);
        final int iLIZIZ2 = C814420VxA.LIZIZ(view.getMeasuredHeight() * 0.5f);
        final int iLIZIZ3 = C814420VxA.LIZIZ(balloon.LJIIIIZZ() * 0.5f);
        final int iLIZIZ4 = C814420VxA.LIZIZ(balloon.LJII() * 0.5f);
        C2248131Cyx c2248131Cyx = EnumC2248011Cyl.Companion;
        boolean z = balloon.LLILLJJLI.LJJJJ;
        c2248131Cyx.getClass();
        if (z) {
            int i2 = C2248071Cyr.LIZ[enumC2248011Cyl.ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    enumC2248011Cyl = EnumC2248011Cyl.START;
                }
            } else {
                enumC2248011Cyl = EnumC2248011Cyl.END;
            }
        }
        final View[] viewArr = {view};
        if (balloon.LIZLLL(view)) {
            HandlerHook.viewPost(view, new Runnable() { // from class: X.1Cyd
                public final void LIZ() {
                    Boolean boolValueOf = Boolean.valueOf(this.LL.LIZLLL(view));
                    if (boolValueOf.booleanValue()) {
                        boolValueOf.booleanValue();
                        this.LL.LLILLJJLI.getClass();
                        Balloon balloon2 = this.LL;
                        balloon2.LLIZ = true;
                        long j = balloon2.LLILLJJLI.LJJIJIIJIL;
                        if (j != -1) {
                            balloon2.LJ(j);
                        }
                        if (this.LL.LJIIIZ()) {
                            Balloon balloon3 = this.LL;
                            balloon3.LJIJI(balloon3.LLILLL.LLILZ);
                        } else {
                            Balloon balloon4 = this.LL;
                            C2248101Cyu c2248101Cyu = balloon4.LLILLL;
                            balloon4.LJIIL(c2248101Cyu.LLILZ, c2248101Cyu.LLILZLL);
                        }
                        this.LL.LLILLL.LL.measure(0, 0);
                        this.LL.LLILLJJLI.getClass();
                        Balloon balloon5 = this.LL;
                        balloon5.LLILZIL.setWidth(balloon5.LJIIIIZZ());
                        Balloon balloon6 = this.LL;
                        balloon6.LLILZIL.setHeight(balloon6.LJII());
                        C19M5 c19m5 = this.LL.LLILLL.LLILZLL;
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c19m5);
                        c19m5.setLayoutParams(layoutParams);
                        this.LL.LJIIJ(view);
                        this.LL.LJIIJJI();
                        this.LL.LIZJ();
                        Balloon balloon7 = this.LL;
                        View[] viewArr2 = viewArr;
                        balloon7.LJIIZILJ((View[]) Arrays.copyOf(viewArr2, viewArr2.length));
                        this.LL.LLILLJJLI.getClass();
                        this.LL.LIZIZ();
                        this.LL.LJIJ();
                        int i3 = C2247941Cye.LJFF[enumC2248011Cyl.ordinal()];
                        if (i3 == 1) {
                            Balloon balloon8 = balloon;
                            C786410Ut5.i3(balloon8.LLILZIL, view, balloon8.LLILLJJLI.LJJJJI * ((iLIZIZ - iLIZIZ3) + i), (-(balloon8.LJII() + iLIZIZ2)) + i);
                            return;
                        }
                        if (i3 == 2) {
                            Balloon balloon9 = balloon;
                            PopupWindow popupWindow = balloon9.LLILZIL;
                            View view2 = view;
                            int i4 = balloon9.LLILLJJLI.LJJJJI;
                            int i5 = iLIZIZ;
                            C786410Ut5.i3(popupWindow, view2, i4 * ((i5 - iLIZIZ3) + i), (-iLIZIZ4) + i5 + i);
                            return;
                        }
                        if (i3 == 3) {
                            Balloon balloon10 = balloon;
                            C786410Ut5.i3(balloon10.LLILZIL, view, balloon10.LLILLJJLI.LJJJJI * ((iLIZIZ - balloon10.LJIIIIZZ()) + i), (-balloon.LJII()) + iLIZIZ2 + i);
                        } else if (i3 == 4) {
                            Balloon balloon11 = balloon;
                            C786410Ut5.i3(balloon11.LLILZIL, view, balloon11.LLILLJJLI.LJJJJI * (iLIZIZ + balloon11.LJIIIIZZ() + i), (-balloon.LJII()) + iLIZIZ2 + i);
                        }
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("Balloon@9a33.showAtCenter$$inlined$show$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("Balloon@9a33.showAtCenter$$inlined$show$1");
                }
            });
        } else {
            balloon.LLILLJJLI.getClass();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIL(android.view.View r7, android.widget.TextView r8) {
        /*
            Method dump skipped, instruction units count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.skydoves.balloon.Balloon.LJIIL(android.view.View, android.widget.TextView):void");
    }

    public final void LJIILIIL(int i, int i2, View view) {
        View[] viewArr = {view};
        if (LIZLLL(view)) {
            HandlerHook.viewPost(view, new ARunnableS0S0502000_34(this, view, viewArr, this, view, i, i2, 0));
        } else {
            this.LLILLJJLI.getClass();
        }
    }

    public final void LJIILJJIL(int i, int i2, View view) {
        View[] viewArr = {view};
        if (LIZLLL(view)) {
            HandlerHook.viewPost(view, new ARunnableS0S0502000_34(this, view, viewArr, this, view, i, i2, 1));
        } else {
            this.LLILLJJLI.getClass();
        }
    }

    public final void LJIILL(View view, int i, int i2) {
        View[] viewArr = {view};
        if (LIZLLL(view)) {
            HandlerHook.viewPost(view, new ARunnableS0S0502000_34(this, view, viewArr, this, view, i, i2, 2));
        } else {
            this.LLILLJJLI.getClass();
        }
    }
}
