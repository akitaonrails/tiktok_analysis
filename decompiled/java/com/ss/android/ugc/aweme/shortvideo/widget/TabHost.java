package com.ss.android.ugc.aweme.shortvideo.widget;

import X.C0GUE;
import X.C1308910kAL;
import X.C1361400lX0;
import X.C1385040m98;
import X.C1388190mED;
import X.C1388580mEq;
import X.C14KQ;
import X.C1653670t8P;
import X.C1659630tI1;
import X.C19EG;
import X.C201955140j;
import X.C201967140v;
import X.C2188811AlT;
import X.C419990GdR;
import X.C446980Hfs;
import X.C960203pA;
import X.InterfaceC1653400t7y;
import X.InterfaceC1653420t80;
import X.InterfaceC1653650t8N;
import X.InterfaceC1653660t8O;
import X.InterfaceC1653690t8R;
import X.InterfaceC1653700t8S;
import Y.AObjectS399S0100000_25;
import Y.ARunnableS125S0100000_25;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Scroller;
import android.widget.TextView;
import bfk.b0;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.ss.android.ugc.aweme.shortvideo.widget.TabHost;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes26.dex */
public class TabHost extends FrameLayout implements View.OnTouchListener {
    public static final /* synthetic */ int LLJLILLLLZIIL = 0;
    public int LL;
    public int LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;
    public List<Integer> LLILZIL;
    public Scroller LLILZLL;
    public LinearLayout LLIZ;
    public GestureDetector LLIZLLLIL;
    public InterfaceC1653420t80 LLJ;
    public InterfaceC1653400t7y LLJI;
    public final C1653670t8P LLJIJIL;
    public InterfaceC1653660t8O LLJILJIL;
    public InterfaceC1653650t8N LLJILJILJ;
    public int LLJILLL;
    public float LLJJ;
    public float LLJJI;
    public float LLJJIII;
    public float LLJJIJI;
    public View LLJJIJIIJIL;
    public int LLJJIJIL;
    public int LLJJJ;
    public int LLJJJIL;
    public int LLJJJJ;
    public final int LLJJJJJIL;
    public int LLJJJJLIIL;
    public int LLJJL;
    public int LLJJLIIIJLLLLLLLZ;
    public int LLJL;
    public boolean LLJLIL;

    public void setOnInterceptIndexChangedListener(InterfaceC1653690t8R interfaceC1653690t8R) {
    }

    public void setTouchEventWrapper(InterfaceC1653700t8S interfaceC1653700t8S) {
    }

    public int getTabCount() {
        LinearLayout linearLayout = this.LLIZ;
        if (linearLayout == null) {
            return 0;
        }
        return linearLayout.getChildCount();
    }

    public final boolean LIZJ() {
        ShortVideoContext shortVideoContext;
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(getContext());
        return (c19egLIZIZ == null || (shortVideoContext = ((ShortVideoContextViewModel) C1659630tI1.LJII(this, c19egLIZIZ, 4).get(ShortVideoContextViewModel.class)).LL) == null || !shortVideoContext.LJJJJL()) ? false : true;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.LLIZ = (LinearLayout) findViewById(R.id.eqx);
    }

    public int getCurrentIndex() {
        return this.LL;
    }

    public int getLastIndex() {
        return this.LLILLJJLI;
    }

    public int getNormalTextFont() {
        return this.LLJJJJ;
    }

    public int getSelectedColor() {
        return this.LLJJIJIL;
    }

    public int getUnselectedColor() {
        return this.LLJJJ;
    }

    public final Object LIZ(int i) {
        View childAt;
        LinearLayout linearLayout = this.LLIZ;
        if (linearLayout == null || (childAt = linearLayout.getChildAt(i)) == null) {
            return null;
        }
        return childAt.getTag();
    }

    public final Object LIZIZ(int i) {
        View childAt;
        LinearLayout linearLayout = this.LLIZ;
        if (linearLayout == null || (childAt = linearLayout.getChildAt(i)) == null) {
            return null;
        }
        return childAt.getTag();
    }

    public void setBottomTabWidgetGestureListener(InterfaceC1653650t8N interfaceC1653650t8N) {
        this.LLJILJILJ = interfaceC1653650t8N;
    }

    public void setDefaultIndex(int i) {
        this.LL = i;
    }

    public void setOnIndexChangedListener(InterfaceC1653420t80 interfaceC1653420t80) {
        this.LLJ = interfaceC1653420t80;
    }

    public void setScrollEnabled(boolean z) {
        this.LLILLL = z;
    }

    public void setSelectedTextColor(int i) {
        this.LLJJIJIL = C960203pA.LIZ(i, getContext());
    }

    public void setSelectedTextFont(int i) {
        this.LLJJJIL = i;
    }

    public void setSharedARTabChangeListener(InterfaceC1653400t7y interfaceC1653400t7y) {
        this.LLJI = interfaceC1653400t7y;
    }

    public void setStartMargin(int i) {
        this.LLJJL = i;
        LinearLayout linearLayout = this.LLIZ;
        if (linearLayout != null && (linearLayout instanceof C0GUE)) {
            C0GUE c0gue = (C0GUE) linearLayout;
            c0gue.LL = i;
            c0gue.requestLayout();
        }
        requestLayout();
    }

    public void setTabHostDisableParentScroll(boolean z) {
        this.LLJLIL = z;
    }

    public void setTabHostGestureListener(InterfaceC1653660t8O interfaceC1653660t8O) {
        this.LLJILJIL = interfaceC1653660t8O;
    }

    public void setUISwitchEnabled(boolean z) {
        this.LLILZ = z;
    }

    public void setUnselectedTextColor(int i) {
        this.LLJJJ = C960203pA.LIZ(i, getContext());
    }

    public void setUnselectedTextFont(int i) {
        this.LLJJJJ = i;
    }

    public TabHost(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLILLL = true;
        this.LLILZ = true;
        this.LLJIJIL = new C1653670t8P();
        this.LLJJIJIL = C960203pA.LIZ(R.attr.ee, getContext());
        this.LLJJJ = C960203pA.LIZ(R.attr.eh, getContext());
        this.LLJJJIL = 42;
        this.LLJJJJ = 42;
        this.LLJJJJJIL = C446980Hfs.LIZ(getContext(), R.color.bh);
        this.LLJJLIIIJLLLLLLLZ = 0;
        this.LLJL = getCurrentIndex();
        this.LLJLIL = false;
        this.LLJJJJLIIL = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.LLILZIL = new ArrayList();
        setOnTouchListener(this);
        this.LLILZLL = new Scroller(getContext());
        this.LLIZLLLIL = new GestureDetector(getContext(), new GestureDetector.OnGestureListener() { // from class: X.0t8M
            @Override // android.view.GestureDetector.OnGestureListener
            public final boolean onDown(MotionEvent motionEvent) {
                return true;
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public final void onLongPress(MotionEvent motionEvent) {
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public final void onShowPress(MotionEvent motionEvent) {
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public final boolean onSingleTapUp(MotionEvent motionEvent) {
                TabHost tabHost = this.LL;
                if (!tabHost.equals(tabHost.LLJJIJIIJIL)) {
                    TabHost tabHost2 = this.LL;
                    if (!tabHost2.LLIZ.equals(tabHost2.LLJJIJIIJIL)) {
                        TabHost tabHost3 = this.LL;
                        if (!tabHost3.LLJIJIL.LIZ(tabHost3.LLJJIJIIJIL)) {
                            return false;
                        }
                        TabHost tabHost4 = this.LL;
                        if (!tabHost4.LLILZ) {
                            return false;
                        }
                        InterfaceC1653660t8O interfaceC1653660t8O = tabHost4.LLJILJIL;
                        if (interfaceC1653660t8O != null) {
                            interfaceC1653660t8O.LIZ();
                        }
                        TabHost tabHost5 = this.LL;
                        tabHost5.LIZLLL(tabHost5.LLJILLL, 1, true);
                    }
                }
                return false;
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                TabHost tabHost = this.LL;
                if (tabHost.LLILLL && !tabHost.LIZJ() && f2 < 20.0f) {
                    Scroller scroller = this.LL.LLILZLL;
                    scroller.fling(scroller.getFinalX(), this.LL.LLILZLL.getFinalY(), (int) f2, 0, 500, (int) f, 0, this.LL.getHeight());
                }
                return false;
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                TabHost tabHost = this.LL;
                if (!tabHost.LLILLL || tabHost.LIZJ()) {
                    return false;
                }
                if (f2 < 20.0f) {
                    f2 = 20.0f;
                }
                this.LL.LLIZ.scrollBy((int) ((f * 20.0f) / f2), 0);
                TabHost tabHost2 = this.LL;
                tabHost2.LLJJLIIIJLLLLLLLZ = 2;
                tabHost2.invalidate();
                return true;
            }
        });
    }

    public final void LJI(int i, boolean z) {
        View childAt;
        LinearLayout linearLayout = this.LLIZ;
        if (linearLayout == null || (childAt = linearLayout.getChildAt(i)) == null) {
            return;
        }
        if (childAt instanceof b0) {
            ((b0) childAt).setTabSelected(z);
        } else {
            if (!(childAt instanceof TextView)) {
                return;
            }
            childAt.setSelected(z);
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        int i;
        int i2;
        int i3;
        InterfaceC1653660t8O interfaceC1653660t8O;
        boolean z2;
        if (motionEvent.getAction() == 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
            this.LLJJ = motionEvent.getX();
            this.LLJJIII = motionEvent.getY();
            if (C1388580mEq.LIZIZ(getContext())) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                LinearLayout linearLayout = this.LLIZ;
                if (linearLayout != null) {
                    int childCount = linearLayout.getChildCount();
                    int i4 = 0;
                    while (true) {
                        if (i4 < childCount) {
                            View childAt = this.LLIZ.getChildAt(i4);
                            if (x < (childAt.getRight() - this.LLJJL) - this.LLIZ.getScrollX() && x > (childAt.getLeft() - this.LLJJL) - this.LLIZ.getScrollX() && y < childAt.getBottom() && y > childAt.getTop()) {
                                this.LLJILLL = i4;
                                this.LLJJIJIIJIL = childAt;
                                break;
                            }
                            i4++;
                        } else {
                            this.LLJJIJIIJIL = this.LLIZ;
                            break;
                        }
                    }
                }
            } else {
                float x2 = motionEvent.getX();
                float y2 = motionEvent.getY();
                LinearLayout linearLayout2 = this.LLIZ;
                if (linearLayout2 != null) {
                    int childCount2 = linearLayout2.getChildCount();
                    int i5 = 0;
                    while (true) {
                        if (i5 < childCount2) {
                            View childAt2 = this.LLIZ.getChildAt(i5);
                            if (x2 < (childAt2.getRight() + this.LLJJL) - this.LLIZ.getScrollX() && x2 > (childAt2.getLeft() + this.LLJJL) - this.LLIZ.getScrollX() && y2 < childAt2.getBottom() && y2 > childAt2.getTop()) {
                                this.LLJILLL = i5;
                                this.LLJJIJIIJIL = childAt2;
                                break;
                            }
                            i5++;
                        } else {
                            this.LLJJIJIIJIL = this.LLIZ;
                            break;
                        }
                    }
                }
            }
            InterfaceC1653660t8O interfaceC1653660t8O2 = this.LLJILJIL;
            if (interfaceC1653660t8O2 != null) {
                interfaceC1653660t8O2.LJI();
            }
            InterfaceC1653650t8N interfaceC1653650t8N = this.LLJILJILJ;
            if (interfaceC1653650t8N != null) {
                interfaceC1653650t8N.LJI();
            }
        }
        int action = motionEvent.getAction();
        if (action != 1) {
            if (action != 2) {
                if (action == 3) {
                    LJ(true, this.LL, 0, true);
                    InterfaceC1653650t8N interfaceC1653650t8N2 = this.LLJILJILJ;
                    if (interfaceC1653650t8N2 != null) {
                        interfaceC1653650t8N2.a1(this.LL);
                    }
                    InterfaceC1653660t8O interfaceC1653660t8O3 = this.LLJILJIL;
                    if (interfaceC1653660t8O3 != null) {
                        interfaceC1653660t8O3.LJIIIIZZ();
                    }
                }
            } else {
                float x3 = motionEvent.getX() - this.LLJJ;
                float y3 = motionEvent.getY() - this.LLJJIII;
                if ((Math.abs(x3) <= this.LLJJJJLIIL || Math.abs(x3) <= Math.abs(y3)) && !this.LLJLIL) {
                    getParent().requestDisallowInterceptTouchEvent(false);
                } else {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                InterfaceC1653660t8O interfaceC1653660t8O4 = this.LLJILJIL;
                if (interfaceC1653660t8O4 != null) {
                    interfaceC1653660t8O4.LJII();
                }
                InterfaceC1653650t8N interfaceC1653650t8N3 = this.LLJILJILJ;
                if (interfaceC1653650t8N3 != null) {
                    interfaceC1653650t8N3.LJII();
                }
            }
        } else {
            this.LLJJI = motionEvent.getX();
            this.LLJJIJI = motionEvent.getY();
            if (Math.abs(this.LLJJI - this.LLJJ) >= this.LLJJJJLIIL * 2 && Math.abs(this.LLJJIJI - this.LLJJIII) <= C14KQ.LJ(getContext()) / 4) {
                if (this.LLJIJIL.LIZ(this) && this.LLILZ) {
                    if (C1388580mEq.LIZIZ(getContext())) {
                        if (this.LLJJ < this.LLJJI) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        float scrollX = this.LLIZ.getScrollX() + ((Integer) ListProtector.get(this.LLILZIL, 0)).intValue();
                        int size = ((ArrayList) this.LLILZIL).size();
                        if (z2) {
                            i = 0;
                            i2 = 0;
                            while (i < size) {
                                if (((Integer) ListProtector.get(this.LLILZIL, i)).intValue() < scrollX) {
                                    break;
                                }
                                i2 = i;
                                i++;
                            }
                            i = i2;
                        } else {
                            i = size - 1;
                            i3 = 0;
                            while (i >= 0) {
                                if (((Integer) ListProtector.get(this.LLILZIL, i)).intValue() >= scrollX) {
                                    break;
                                }
                                i3 = i;
                                i--;
                            }
                            i = i3;
                        }
                        LJ(true, i, this.LLJJLIIIJLLLLLLLZ, true);
                        interfaceC1653660t8O = this.LLJILJIL;
                        if (interfaceC1653660t8O != null && this.LLILLJJLI != this.LL) {
                            interfaceC1653660t8O.LIZ();
                        }
                    } else {
                        if (this.LLJJ < this.LLJJI) {
                            z = true;
                        } else {
                            z = false;
                        }
                        float scrollX2 = this.LLIZ.getScrollX() + ((Integer) ListProtector.get(this.LLILZIL, 0)).intValue();
                        int size2 = ((ArrayList) this.LLILZIL).size();
                        if (z) {
                            i = size2 - 1;
                            i3 = 0;
                            while (i >= 0) {
                                if (((Integer) ListProtector.get(this.LLILZIL, i)).intValue() < scrollX2) {
                                    break;
                                }
                                i3 = i;
                                i--;
                            }
                            i = i3;
                        } else {
                            i = 0;
                            i2 = 0;
                            while (i < size2) {
                                if (((Integer) ListProtector.get(this.LLILZIL, i)).intValue() >= scrollX2) {
                                    break;
                                }
                                i2 = i;
                                i++;
                            }
                            i = i2;
                        }
                        LJ(true, i, this.LLJJLIIIJLLLLLLLZ, true);
                        interfaceC1653660t8O = this.LLJILJIL;
                        if (interfaceC1653660t8O != null) {
                            interfaceC1653660t8O.LIZ();
                        }
                    }
                }
            } else {
                LJ(true, this.LL, 0, true);
            }
            InterfaceC1653650t8N interfaceC1653650t8N4 = this.LLJILJILJ;
            if (interfaceC1653650t8N4 != null) {
                interfaceC1653650t8N4.a1(this.LL);
            }
            InterfaceC1653660t8O interfaceC1653660t8O5 = this.LLJILJIL;
            if (interfaceC1653660t8O5 != null) {
                interfaceC1653660t8O5.LJIIIIZZ();
            }
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            this.LLJJLIIIJLLLLLLLZ = 0;
        }
        return this.LLIZLLLIL.onTouchEvent(motionEvent);
    }

    public final void LIZLLL(int i, int i2, boolean z) {
        LJ(z, i, i2, true);
    }

    public final void LJII(int i, int i2, int i3) {
        View childAt;
        LinearLayout linearLayout = this.LLIZ;
        if (linearLayout == null || (childAt = linearLayout.getChildAt(i)) == null) {
            return;
        }
        if (!childAt.isEnabled()) {
            i2 = this.LLJJJJJIL;
        }
        int i4 = 0;
        if (childAt instanceof b0) {
            b0 b0Var = (b0) childAt;
            if (b0Var.LLILZLL) {
                i2 = this.LLJJIJIL;
                i3 = this.LLJJJJ;
            }
            b0Var.setTextColor(i2);
            b0Var.setTextFont(i3);
            int iAlpha = Color.alpha(i2);
            Drawable[] compoundDrawables = b0Var.getTextView().getCompoundDrawables();
            int length = compoundDrawables.length;
            while (i4 < length) {
                Drawable drawable = compoundDrawables[i4];
                if (drawable == null) {
                    return;
                }
                drawable.setAlpha(iAlpha);
                i4++;
            }
            return;
        }
        if (childAt instanceof TextView) {
            TextView textView = (TextView) childAt;
            textView.setTextColor(i2);
            int iAlpha2 = Color.alpha(i2);
            Drawable[] compoundDrawables2 = textView.getCompoundDrawables();
            int length2 = compoundDrawables2.length;
            while (i4 < length2) {
                Drawable drawable2 = compoundDrawables2[i4];
                if (drawable2 == null) {
                    return;
                }
                drawable2.setAlpha(iAlpha2);
                i4++;
            }
        }
    }

    public final void LJIIIIZZ(int i, int i2, boolean z) {
        Integer num;
        int i3;
        C1361400lX0 c1361400lX0LIZ = C1385040m98.LIZ(getContext(), z);
        Integer numLIZJ = C1308910kAL.LIZJ(i, c1361400lX0LIZ);
        Integer numLIZJ2 = C1308910kAL.LIZJ(i2, c1361400lX0LIZ);
        if (numLIZJ != null && numLIZJ2 != null) {
            int i4 = this.LLJL;
            for (int i5 = 0; i5 < this.LLIZ.getChildCount(); i5++) {
                if (i5 == i4) {
                    num = numLIZJ;
                } else {
                    num = numLIZJ2;
                }
                int iIntValue = num.intValue();
                if (i5 == i4) {
                    i3 = this.LLJJJIL;
                } else {
                    i3 = this.LLJJJJ;
                }
                LJII(i5, iIntValue, i3);
            }
            this.LLJJIJIL = numLIZJ.intValue();
            this.LLJJJ = numLIZJ2.intValue();
        }
    }

    public final void LJ(boolean z, int i, int i2, boolean z2) {
        InterfaceC1653420t80 interfaceC1653420t80;
        int i3;
        int i4;
        InterfaceC1653400t7y interfaceC1653400t7y;
        InterfaceC1653650t8N interfaceC1653650t8N = this.LLJILJILJ;
        if (interfaceC1653650t8N != null && this.LL != i) {
            interfaceC1653650t8N.LJIIZILJ(i, LIZIZ(i), new AObjectS399S0100000_25(this, 2));
            requestLayout();
        }
        if (LIZJ() && (interfaceC1653400t7y = this.LLJI) != null) {
            interfaceC1653400t7y.LIZ((String) LIZIZ(i));
            return;
        }
        this.LLJL = i;
        for (int i5 = 0; i5 < this.LLIZ.getChildCount(); i5++) {
            if (i5 == i) {
                i3 = this.LLJJIJIL;
            } else {
                i3 = this.LLJJJ;
            }
            if (i5 == i) {
                i4 = this.LLJJJIL;
            } else {
                i4 = this.LLJJJJ;
            }
            LJII(i5, i3, i4);
            if (this.LLIZ != null) {
                for (int i6 = 0; i6 < this.LLIZ.getChildCount(); i6++) {
                    if (i6 != i) {
                        LJI(i6, false);
                    }
                }
                LJI(i, true);
            }
        }
        int i7 = this.LL;
        if (i7 != i && (interfaceC1653420t80 = this.LLJ) != null && z) {
            interfaceC1653420t80.LIZ(i, i2, LIZIZ(i7), false, z2);
        }
        C201967140v c201967140v = C201967140v.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("withoutAnim the set index is ");
        sbLIZ.append(i);
        sbLIZ.append(" mCurIndex:");
        sbLIZ.append(this.LL);
        C201955140j.LIZJ(c201967140v, C2188811AlT.LIZIZ(sbLIZ));
        this.LLILLJJLI = this.LL;
        this.LL = i;
        HandlerHook.viewPost(this, new ARunnableS125S0100000_25(this, 3));
    }

    public final void LJFF(boolean z, int i, int i2, boolean z2, boolean z3) {
        InterfaceC1653420t80 interfaceC1653420t80;
        int i3;
        int i4;
        this.LLJL = i;
        for (int i5 = 0; i5 < this.LLIZ.getChildCount(); i5++) {
            if (i5 == i) {
                i3 = this.LLJJIJIL;
            } else {
                i3 = this.LLJJJ;
            }
            if (i5 == i) {
                i4 = this.LLJJJIL;
            } else {
                i4 = this.LLJJJJ;
            }
            LJII(i5, i3, i4);
            if (this.LLIZ != null) {
                for (int i6 = 0; i6 < this.LLIZ.getChildCount(); i6++) {
                    if (i6 != i) {
                        LJI(i6, false);
                    }
                }
                LJI(i, true);
            }
        }
        int i7 = this.LL;
        if ((i7 != i || i2 == 6 || i2 == 8) && (interfaceC1653420t80 = this.LLJ) != null && z) {
            interfaceC1653420t80.LIZ(i, i2, LIZIZ(i7), z2, z3);
        }
        C201967140v c201967140v = C201967140v.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("the set index is ");
        sbLIZ.append(i);
        sbLIZ.append(" mCurIndex:");
        sbLIZ.append(this.LL);
        C201955140j.LIZJ(c201967140v, C2188811AlT.LIZIZ(sbLIZ));
        this.LL = i;
        requestLayout();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = 0;
        if (C1388580mEq.LIZIZ(getContext())) {
            int childCount = this.LLIZ.getChildCount();
            ((ArrayList) this.LLILZIL).clear();
            int width = i3;
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = this.LLIZ.getChildAt(i6);
                if (childAt != null) {
                    if (i6 == 0) {
                        int i7 = i3 - i;
                        width = (width - (i7 / 2)) + (childAt.getWidth() / 2) + ((this.LLIZ.getRight() - this.LLIZ.getLeft()) - i7) + this.LLJJL;
                    }
                    ((ArrayList) this.LLILZIL).add(Integer.valueOf(width - (childAt.getWidth() / 2)));
                    childAt.layout(width - childAt.getWidth(), childAt.getTop(), width, childAt.getBottom());
                    width -= childAt.getWidth();
                }
            }
            C201967140v c201967140v = C201967140v.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("the xPivots size is ");
            sbLIZ.append(childCount);
            sbLIZ.append(" mCurIndex:");
            sbLIZ.append(this.LL);
            C201955140j.LIZJ(c201967140v, C2188811AlT.LIZIZ(sbLIZ));
            int iLIZIZ = C419990GdR.LIZIZ(this.LL, 0, childCount - 1);
            try {
                this.LLIZ.scrollTo(((Integer) ((ArrayList) this.LLILZIL).get(iLIZIZ)).intValue() - ((Integer) ((ArrayList) this.LLILZIL).get(0)).intValue(), 0);
                if (this.LL > iLIZIZ) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("mCurIndex is dangerous， modify it !!! safeIndex: ");
                    sbLIZ2.append(iLIZIZ);
                    sbLIZ2.append(" mCurIndex:");
                    sbLIZ2.append(this.LL);
                    C201955140j.LJII(c201967140v, C2188811AlT.LIZIZ(sbLIZ2));
                    this.LL = iLIZIZ;
                    return;
                }
                return;
            } catch (IndexOutOfBoundsException e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sb = new StringBuilder();
                while (i5 < childCount) {
                    View childAt2 = this.LLIZ.getChildAt(i5);
                    sb.append("index ");
                    sb.append(i5);
                    sb.append(' ');
                    sb.append(childAt2.getClass());
                    sb.append(' ');
                    sb.append(childAt2.getTag());
                    sb.append('\n');
                    i5++;
                }
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("Inconsistency detected. children are ");
                sbLIZ3.append((Object) sb);
                throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ3), e);
            }
        }
        int childCount2 = this.LLIZ.getChildCount();
        ((ArrayList) this.LLILZIL).clear();
        int width2 = i;
        for (int i8 = 0; i8 < childCount2; i8++) {
            View childAt3 = this.LLIZ.getChildAt(i8);
            if (childAt3 != null) {
                if (i8 == 0) {
                    width2 = ((width2 + ((i3 - i) / 2)) - (childAt3.getWidth() / 2)) - this.LLJJL;
                }
                if (childAt3 instanceof b0) {
                    ((ArrayList) this.LLILZIL).add(Integer.valueOf((childAt3.getWidth() / 2) + width2));
                } else if (childAt3 instanceof TextView) {
                    ((ArrayList) this.LLILZIL).add(Integer.valueOf((childAt3.getWidth() / 2) + width2));
                }
                childAt3.layout(width2, childAt3.getTop(), childAt3.getWidth() + width2, childAt3.getBottom());
                width2 += childAt3.getWidth();
            }
        }
        C201967140v c201967140v2 = C201967140v.LIZIZ;
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("the xPivots size is ");
        sbLIZ4.append(childCount2);
        sbLIZ4.append(" mCurIndex:");
        sbLIZ4.append(this.LL);
        C201955140j.LIZJ(c201967140v2, C2188811AlT.LIZIZ(sbLIZ4));
        int iLIZIZ2 = C419990GdR.LIZIZ(this.LL, 0, childCount2 - 1);
        try {
            this.LLIZ.scrollTo(((Integer) ((ArrayList) this.LLILZIL).get(iLIZIZ2)).intValue() - ((Integer) ((ArrayList) this.LLILZIL).get(0)).intValue(), 0);
            if (this.LL > iLIZIZ2) {
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("mCurIndex is dangerous， modify it !!! safeIndex: ");
                sbLIZ5.append(iLIZIZ2);
                sbLIZ5.append(" mCurIndex:");
                sbLIZ5.append(this.LL);
                C201955140j.LJII(c201967140v2, C2188811AlT.LIZIZ(sbLIZ5));
                this.LL = iLIZIZ2;
            }
        } catch (IndexOutOfBoundsException e2) {
            TryCatchGuardChecker.doCheck(e2);
            StringBuilder sb2 = new StringBuilder();
            while (i5 < childCount2) {
                View childAt4 = this.LLIZ.getChildAt(i5);
                sb2.append("index ");
                sb2.append(i5);
                sb2.append(' ');
                sb2.append(childAt4.getClass());
                sb2.append(' ');
                sb2.append(childAt4.getTag());
                sb2.append('\n');
                i5++;
            }
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append("Inconsistency detected. children are ");
            sbLIZ6.append((Object) sb2);
            throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ6), e2);
        }
    }
}
