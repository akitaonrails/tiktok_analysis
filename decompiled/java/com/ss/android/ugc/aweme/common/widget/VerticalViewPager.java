package com.ss.android.ugc.aweme.common.widget;

import X.AbstractC1616230sA1;
import X.C01GW;
import X.C0BSY;
import X.C0CFK;
import X.C0CME;
import X.C0CN5;
import X.C0GY9;
import X.C0S4J;
import X.C0T27;
import X.C104100aN;
import X.C1239904tB;
import X.C140600gG;
import X.C14K9;
import X.C1591220rVg;
import X.C15D7;
import X.C1603140rou;
import X.C1604100rqS;
import X.C1616140s9s;
import X.C1969207nW;
import X.C19737612Kg;
import X.C19K2;
import X.C19K4;
import X.C19KF;
import X.C19LX;
import X.C1AF0;
import X.C1C7U;
import X.C1ET4;
import X.C20094213jo;
import X.C20097913kP;
import X.C20291214aU;
import X.C20309014dM;
import X.C20596515id;
import X.C20639086r;
import X.C21599219fy;
import X.C21600319g9;
import X.C21601719gN;
import X.C21601919gP;
import X.C21602119gR;
import X.C21602219gS;
import X.C21602319gT;
import X.C21602419gU;
import X.C21602719gX;
import X.C21603319gd;
import X.C21603419ge;
import X.C21603919gj;
import X.C21604619gq;
import X.C21604819gs;
import X.C21606019h4;
import X.C21608519hT;
import X.C2185111AfV;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2207291BaB;
import X.C2276411E8h;
import X.C2504109rb;
import X.C2515109tN;
import X.C2553709zb;
import X.C269830Ahp;
import X.C283730BAd;
import X.C303340Bum;
import X.C312230CLt;
import X.C583890MvD;
import X.C588900N7w;
import X.C593510NPp;
import X.C786410Ut5;
import X.EnumC1604090rqR;
import X.EnumC21602519gV;
import X.InterfaceC1003820cEG;
import X.InterfaceC1603200rp0;
import X.InterfaceC1613610s5n;
import X.InterfaceC1616160s9u;
import X.InterfaceC1616180s9w;
import X.InterfaceC1616190s9x;
import X.InterfaceC21599319fz;
import X.InterfaceC21604219gm;
import X.InterfaceC21604719gr;
import X.InterfaceC21604919gt;
import X.InterfaceC21605219gw;
import X.InterfaceC21605419gy;
import X.InterfaceC469360Ias;
import X.InterfaceC764760TzG;
import X.InterpolatorC21604119gl;
import X.RunnableC991380buC;
import Y.ARunnableS116S0100000_16;
import Y.ARunnableS133S0100000_33;
import Y.ARunnableS20S1000000_33;
import Y.ARunnableS2S0111000_16;
import android.R;
import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.ss.android.ugc.aweme.common.widget.VerticalViewPager;
import com.ss.android.ugc.aweme.feed.VideoViewCellRootView;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.performanceopt.api.IOptimizerHelperService;
import java.io.PrintStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;
import u4.q0;

/* JADX INFO: loaded from: classes34.dex */
public class VerticalViewPager extends AbstractC1616230sA1 implements InterfaceC21604919gt {
    public static boolean b;
    public static final Field f;
    public final C0S4J LL;
    public boolean LLILLJJLI;
    public float LLILLL;
    public float LLILZ;
    public float LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public InterfaceC21604219gm LLIZLLLIL;
    public final C21604819gs LLJ;
    public C0T27 LLJI;
    public final C21600319g9 LLJIJIL;
    public int LLJILJIL;
    public final ArrayList<C21603319gd> LLJILJILJ;
    public final C21603319gd LLJILLL;
    public final Rect LLJJ;
    public PagerAdapter LLJJI;
    public int LLJJIII;
    public int LLJJIJI;
    public Parcelable LLJJIJIIJIL;
    public ClassLoader LLJJIJIL;
    public Scroller LLJJJ;
    public boolean LLJJJIL;
    public C19K2 LLJJJJ;
    public volatile boolean LLJJJJJIL;
    public C21603919gj LLJJJJLIIL;
    public int LLJJL;
    public Drawable LLJJLIIIJLLLLLLLZ;
    public int LLJL;
    public int LLJLIL;
    public float LLJLILLLLZIIL;
    public float LLJLL;
    public int LLJLLIL;
    public boolean LLJLLL;
    public boolean LLJZ;
    public boolean LLJZIJLIL;
    public boolean LLL;
    public boolean LLLF;
    public int LLLFF;
    public boolean LLLFFI;
    public boolean LLLFZ;
    public boolean LLLI;
    public boolean LLLII;
    public boolean LLLIIII;
    public boolean LLLIIIIL;
    public boolean LLLIIIL;
    public int LLLIIL;
    public int LLLIILIL;
    public int LLLIL;
    public int LLLILZ;
    public float LLLILZJ;
    public float LLLILZLLLI;
    public float LLLIZZ;
    public float LLLJ;
    public long LLLJIL;
    public int LLLJL;
    public VelocityTracker LLLL;
    public int LLLLII;
    public int LLLLIIIILLL;
    public int LLLLIIL;
    public int LLLLIILL;
    public boolean LLLLIILLL;
    public long LLLLIL;
    public C20097913kP LLLLILI;
    public boolean LLLLJ;
    public boolean LLLLJI;
    public int LLLLL;
    public InterfaceC1603200rp0 LLLLLIL;
    public final List<InterfaceC1616160s9u> LLLLLILLIL;
    public InterfaceC1616180s9w LLLLLJIL;
    public InterfaceC1616190s9x LLLLLJLJLL;
    public C15D7 LLLLLL;
    public Method LLLLLLIL;
    public final C21602319gT LLLLLLJ;
    public final C1616140s9s LLLLLLL;
    public int LLLLLLLLL;
    public ArrayList<View> LLLLLLLLLL;
    public int LLLLLLLZIL;
    public boolean LLLLLLZ;
    public int LLLLLLZZ;
    public boolean LLLLLZ;
    public boolean LLLLLZIL;
    public boolean LLLLLZL;
    public int LLLLZ;
    public BPEAHandler LLLLZI;
    public final C21601719gN LLLLZIL;
    public int LLLLZLL;
    public final C21602119gR LLLLZLLIL;
    public int LLLLZLLLI;
    public final C21602219gS LLLZ;
    public float LLLZI;
    public final C588900N7w LLLZIIL;
    public float LLLZIL;
    public float LLLZL;
    public int LLLZLL;
    public boolean LLLZLZ;
    public final RunnableC991380buC LLLZZ;
    public final Runnable LLLZZIL;
    public final Runnable LLZ;
    public int LLZIL;
    public InterfaceC764760TzG LLZILL;
    public InterfaceC21604719gr LLZL;
    public View LLZLI;
    public boolean LLZLL;
    public boolean LLZLLIL;
    public boolean LLZLLLL;
    public boolean LLZZ;
    public JSONObject LLZZJLIL;
    public boolean LLZZLLIL;
    public int LLZZZIL;
    public C21604619gq LLZZZZ;
    public C20097913kP mBottomEdge;
    public static final int[] a = {R.attr.layout_gravity};
    public static final C21603419ge c = new Comparator<C21603319gd>() { // from class: X.19ge
        @Override // java.util.Comparator
        public final int compare(C21603319gd c21603319gd, C21603319gd c21603319gd2) {
            return c21603319gd.LIZIZ - c21603319gd2.LIZIZ;
        }
    };
    public static final InterpolatorC21604119gl d = new Interpolator() { // from class: X.19gl
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f2) {
            float f3 = f2 - 1.0f;
            return (f3 * f3 * f3 * f3 * f3) + 1.0f;
        }
    };
    public static final C21602419gU e = new Comparator<View>() { // from class: X.19gU
        @Override // java.util.Comparator
        public final int compare(View view, View view2) {
            C21601919gP c21601919gP = (C21601919gP) view.getLayoutParams();
            C21601919gP c21601919gP2 = (C21601919gP) view2.getLayoutParams();
            boolean z = c21601919gP.LIZ;
            if (z != c21601919gP2.LIZ) {
                if (z) {
                    return 1;
                }
                return -1;
            }
            return c21601919gP.LJ - c21601919gP2.LJ;
        }
    };

    /* JADX WARN: Type inference failed for: r0v1, types: [X.19ge] */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.19gl] */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.19gU] */
    static {
        try {
            Field declaredField = PagerAdapter.class.getDeclaredField("mViewPagerObserver");
            f = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
    }

    public final void LJJIIZ() {
        this.LLLLZ = 1;
        LJJII(this.LLJJIII, true);
        C20639086r.LIZLLL(new Runnable() { // from class: X.0buA
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("VerticalViewPager@894f.populateOptimized$1");
                try {
                    this.LL.LLLLZ = 0;
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("VerticalViewPager@894f.populateOptimized$1");
            }
        });
        int i = C2504109rb.LIZIZ;
        if (i == 1) {
            if (C20639086r.LIZLLL(this.LLLZZIL)) {
                return;
            }
            this.LLLLZ = 0;
            this.LLLZZIL.run();
            return;
        }
        if ((i == 2) || i == 3) {
            Message messageObtain = Message.obtain(getMainHander(), this.LLLZZIL);
            if (i == 3) {
                messageObtain.setAsynchronous(true);
            }
            C786410Ut5.LJLJJL(getMainHander(), messageObtain);
            return;
        }
        if (i == 4) {
            postOnAnimation(new ARunnableS133S0100000_33(this, 85));
        } else {
            postOnAnimation(this.LLLZZIL);
        }
    }

    public final boolean LJJIJIIJIL() {
        this.LLLJL = -1;
        this.LLLIIII = false;
        this.LLLIIIIL = false;
        VelocityTracker velocityTracker = this.LLLL;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.LLLL = null;
        }
        return this.LLLLILI.LJI() | this.mBottomEdge.LJI();
    }

    @Override // android.view.View
    public final void computeScroll() {
        this.LLJJJIL = true;
        if (LJIJJ()) {
            return;
        }
        if (this.LLJJJ.isFinished() || !this.LLJJJ.computeScrollOffset()) {
            LJIIJ(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.LLJJJ.getCurrX();
        int currY = this.LLJJJ.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!LJJI(currY)) {
                this.LLJJJ.abortAnimation();
                scrollTo(currX, 0);
            }
        }
        postInvalidateOnAnimation();
    }

    public void setOnAdapterChangeListener(InterfaceC21605419gy interfaceC21605419gy) {
    }

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C21599219fy(new InterfaceC21599319fz<SavedState>() { // from class: X.19g1
            @Override // X.InterfaceC21599319fz
            public final VerticalViewPager.SavedState[] newArray(int i) {
                return new VerticalViewPager.SavedState[i];
            }

            @Override // X.InterfaceC21599319fz
            public final VerticalViewPager.SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new VerticalViewPager.SavedState(parcel, classLoader);
            }
        });
        public int LL;
        public Parcelable LLILLJJLI;
        public final ClassLoader LLILLL;

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("FragmentPager.SavedState{");
            sbLIZ.append(Integer.toHexString(System.identityHashCode(this)));
            sbLIZ.append(" position=");
            sbLIZ.append(this.LL);
            sbLIZ.append("}");
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.LL = parcel.readInt();
            this.LLILLJJLI = parcel.readParcelable(classLoader);
            this.LLILLL = classLoader;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.LL);
            parcel.writeParcelable(this.LLILLJJLI, i);
        }
    }

    private Handler getMainHander() {
        if (this.LLLLZI == null) {
            this.LLLLZI = new BPEAHandler(Looper.getMainLooper());
        }
        return this.LLLLZI;
    }

    public final void LJIIJJI() {
        PagerAdapter pagerAdapter = this.LLJJI;
        if (pagerAdapter == null) {
            return;
        }
        int count = pagerAdapter.getCount();
        this.LLJILJIL = count;
        Object obj = this.LLJJI;
        if (obj instanceof InterfaceC21605219gw) {
            ((InterfaceC21605219gw) obj).LJI();
        }
        boolean z = this.LLJILJILJ.size() < (this.LLLFF * 2) + 1 && this.LLJILJILJ.size() < count;
        int iMax = this.LLJJIII;
        int i = 0;
        boolean z2 = false;
        while (i < this.LLJILJILJ.size()) {
            C21603319gd c21603319gd = (C21603319gd) ListProtector.get(this.LLJILJILJ, i);
            int iLJIJJ = this.LLJJI.LJIJJ(c21603319gd.LIZ);
            if (iLJIJJ != -1) {
                if (iLJIJJ == -2) {
                    ListProtector.remove(this.LLJILJILJ, i);
                    i--;
                    if (!z2) {
                        this.LLJJI.LJJIJIIJI(this);
                        z2 = true;
                    }
                    this.LLJJI.LJIIZILJ(this, c21603319gd.LIZIZ, c21603319gd.LIZ);
                    int i2 = this.LLJJIII;
                    if (i2 == c21603319gd.LIZIZ) {
                        InterfaceC1603200rp0 interfaceC1603200rp0 = this.LLLLLIL;
                        iMax = (interfaceC1603200rp0 == null || !((C1603140rou) interfaceC1603200rp0).LIZ.j) ? Math.max(0, Math.min(i2, count - 1)) : Math.max(0, Math.min(0, count - 1));
                    }
                } else {
                    int i3 = c21603319gd.LIZIZ;
                    if (i3 != iLJIJJ) {
                        if (i3 == this.LLJJIII) {
                            iMax = iLJIJJ;
                        }
                        c21603319gd.LIZIZ = iLJIJJ;
                    }
                }
                z = true;
            }
            i++;
        }
        if (z2) {
            this.LLJJI.LJIJI(this);
        }
        Collections.sort(this.LLJILJILJ, c);
        if (z) {
            int childCount = getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                C21601919gP c21601919gP = (C21601919gP) getChildAt(i4).getLayoutParams();
                if (!c21601919gP.LIZ) {
                    c21601919gP.LIZJ = 0.0f;
                }
            }
            LJJIL(iMax, false, true, 0);
            requestLayout();
        }
    }

    public final void LJIIZILJ() {
        Constructor<?> constructor;
        C19KF c19kf;
        this.LLLLLZL = C2504109rb.LIZ;
        this.LLILLJJLI = true;
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        final Context context = getContext();
        final Interpolator interpolatorLIZIZ = ((Boolean) C303340Bum.LIZJ.getValue()).booleanValue() ? C0GY9.LIZIZ(0.33f, 0.86f, 0.2f, 1.0f) : d;
        if (!((Boolean) C140600gG.LIZ.getValue()).booleanValue() || (constructor = C1969207nW.LIZ) == null || C1969207nW.LIZIZ == null) {
            this.LLJJJ = new Scroller(context, interpolatorLIZIZ);
        } else {
            C19K4 c19k4 = new C19K4(this);
            if (constructor == null || C1969207nW.LIZIZ == null) {
                c19kf = new C19KF(new Scroller(context, interpolatorLIZIZ), null);
            } else {
                final C19K2 c19k2 = new C19K2(this, c19k4);
                c19k2.LIZLLL = interpolatorLIZIZ;
                addOnAttachStateChangeListener(new C19LX(c19k2, 8));
                c19kf = new C19KF(new Scroller(context, interpolatorLIZIZ, c19k2) { // from class: X.19gb
                    public final InterfaceC21604519gp LIZ;

                    @Override // android.widget.Scroller
                    public final void abortAnimation() {
                        super.abortAnimation();
                        InterfaceC21604519gp interfaceC21604519gp = this.LIZ;
                        if (interfaceC21604519gp != null) {
                            interfaceC21604519gp.LIZ();
                        }
                    }

                    {
                        this.LIZ = c19k2;
                    }

                    @Override // android.widget.Scroller
                    public final void startScroll(int i, int i2, int i3, int i4, int i5) {
                        super.startScroll(i, i2, i3, i4, i5);
                        InterfaceC21604519gp interfaceC21604519gp = this.LIZ;
                        if (interfaceC21604519gp != null && interfaceC21604519gp.LIZIZ(i, i2, i3, i4, i5)) {
                            super.abortAnimation();
                        }
                    }
                }, c19k2);
            }
            this.LLJJJ = c19kf.LIZ;
            this.LLJJJJ = c19kf.LIZIZ;
        }
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f2 = context.getResources().getDisplayMetrics().density;
        Method method = C19737612Kg.LIZ;
        int scaledPagingTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
        this.LLLIL = scaledPagingTouchSlop;
        this.LLLILZ = scaledPagingTouchSlop;
        if (!b) {
            b = true;
        }
        C01GW c01gw = C2553709zb.LIZ;
        if (((Number) c01gw.getValue()).floatValue() != 1.0f) {
            this.LLLIL = (int) (this.LLLIL * ((Number) c01gw.getValue()).floatValue());
        }
        this.LLILZIL = viewConfiguration.getScaledTouchSlop();
        this.LLLLII = (int) (400.0f * f2);
        this.LLLLIIIILLL = viewConfiguration.getScaledMaximumFlingVelocity();
        this.LLLLILI = new C20097913kP(context);
        this.mBottomEdge = new C20097913kP(context);
        this.LLLLIIL = (int) (25.0f * f2);
        this.LLLLIILL = (int) (2.0f * f2);
        this.LLLIIL = (int) (f2 * 16.0f);
        q0.LJIJ(this, new C20094213jo() { // from class: X.19fo
            /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
            @Override // X.C20094213jo
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onInitializeAccessibilityEvent(android.view.View r4, android.view.accessibility.AccessibilityEvent r5) {
                /*
                    r3 = this;
                    super.onInitializeAccessibilityEvent(r4, r5)
                    java.lang.Class<androidx.viewpager.widget.ViewPager> r0 = androidx.viewpager.widget.ViewPager.class
                    java.lang.String r0 = r0.getName()
                    r5.setClassName(r0)
                    X.19fs r2 = X.C21598619fs.LIZ()
                    com.ss.android.ugc.aweme.common.widget.VerticalViewPager r0 = r3.LIZ
                    androidx.viewpager.widget.PagerAdapter r0 = r0.LLJJI
                    if (r0 == 0) goto L44
                    int r1 = r0.getCount()
                    r0 = 1
                    if (r1 <= r0) goto L44
                L1d:
                    r2.LIZLLL(r0)
                    int r1 = r5.getEventType()
                    r0 = 4096(0x1000, float:5.74E-42)
                    if (r1 != r0) goto L43
                    com.ss.android.ugc.aweme.common.widget.VerticalViewPager r0 = r3.LIZ
                    androidx.viewpager.widget.PagerAdapter r0 = r0.LLJJI
                    if (r0 == 0) goto L43
                    int r0 = r0.getCount()
                    r2.LIZJ(r0)
                    com.ss.android.ugc.aweme.common.widget.VerticalViewPager r0 = r3.LIZ
                    int r0 = r0.LLJJIII
                    r2.LIZIZ(r0)
                    com.ss.android.ugc.aweme.common.widget.VerticalViewPager r0 = r3.LIZ
                    int r0 = r0.LLJJIII
                    r2.LJ(r0)
                L43:
                    return
                L44:
                    r0 = 0
                    goto L1d
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C21598219fo.onInitializeAccessibilityEvent(android.view.View, android.view.accessibility.AccessibilityEvent):void");
            }

            @Override // X.C20094213jo
            public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                boolean z;
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.setClassName(ViewPager.class.getName());
                PagerAdapter pagerAdapter = this.LIZ.LLJJI;
                if (pagerAdapter != null && pagerAdapter.getCount() > 1) {
                    z = true;
                } else {
                    z = false;
                }
                accessibilityNodeInfoCompat.setScrollable(z);
                if (this.LIZ.canScrollVertically(1)) {
                    accessibilityNodeInfoCompat.addAction(SpeechEngineDefines.TTS_WORK_MODE_BOTH);
                }
                if (this.LIZ.canScrollVertically(-1)) {
                    accessibilityNodeInfoCompat.addAction(8192);
                }
            }

            @Override // X.C20094213jo
            public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
                if (super.performAccessibilityAction(view, i, bundle)) {
                    return true;
                }
                if (i != 4096) {
                    if (i != 8192 || !this.LIZ.canScrollVertically(-1)) {
                        return false;
                    }
                    VerticalViewPager verticalViewPager = this.LIZ;
                    verticalViewPager.setCurrentItem(verticalViewPager.LLJJIII - 1);
                    return true;
                }
                if (!this.LIZ.canScrollVertically(1)) {
                    return false;
                }
                VerticalViewPager verticalViewPager2 = this.LIZ;
                verticalViewPager2.setCurrentItem(verticalViewPager2.LLJJIII + 1);
                return true;
            }
        });
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        C14K9.LJIJJ(this, new C20309014dM(this, 1));
    }

    public final boolean LJIJJ() {
        C19K2 c19k2;
        return ((Boolean) C140600gG.LIZ.getValue()).booleanValue() && (c19k2 = this.LLJJJJ) != null && c19k2.LJ;
    }

    public final void LJJIII() {
        LJJII(this.LLJJIII, false);
    }

    public final boolean LJJIIJ() {
        int count;
        int i;
        PagerAdapter pagerAdapter = this.LLJJI;
        int i2 = 0;
        if (pagerAdapter == null || (count = pagerAdapter.getCount()) == 0 || (i = this.LLJJIII) == count - 1) {
            return false;
        }
        int i3 = i + 1;
        C21603319gd c21603319gdLJIILL = LJIILL(i3);
        if (c21603319gdLJIILL != null && c21603319gdLJIILL.LIZIZ == i3) {
            return false;
        }
        while (i2 < this.LLJILJILJ.size() && ((C21603319gd) ListProtector.get(this.LLJILJILJ, i2)).LIZIZ < this.LLJJIII) {
            i2++;
        }
        LJI(i3, i2 + 1);
        C21603319gd c21603319gdLJIILL2 = LJIILL(this.LLJJIII);
        if (c21603319gdLJIILL2 != null) {
            LJIIIIZZ(c21603319gdLJIILL2, i2, null);
        }
        if (this.LLZZZIL == 2) {
            if (this.LLZZZZ == null) {
                this.LLZZZZ = new C21604619gq();
            }
            this.LLZZZZ.LIZIZ = true;
        }
        return true;
    }

    public final void LJJIIZI() {
        int i;
        PagerAdapter pagerAdapter = this.LLJJI;
        if (pagerAdapter == null || pagerAdapter.getCount() == 0 || (i = this.LLJJIII) == 0) {
            return;
        }
        int i2 = i - 1;
        C21603319gd c21603319gdLJIILL = LJIILL(i2);
        if (c21603319gdLJIILL == null || c21603319gdLJIILL.LIZIZ != i2) {
            int i3 = 0;
            while (i3 < this.LLJILJILJ.size() && ((C21603319gd) ListProtector.get(this.LLJILJILJ, i3)).LIZIZ < this.LLJJIII) {
                i3++;
            }
            LJI(i2, i3);
            C21603319gd c21603319gdLJIILL2 = LJIILL(this.LLJJIII);
            if (c21603319gdLJIILL2 != null) {
                LJIIIIZZ(c21603319gdLJIILL2, i3 + 1, null);
            }
            if (this.LLZZZIL == 2) {
                if (this.LLZZZZ == null) {
                    this.LLZZZZ = new C21604619gq();
                }
                this.LLZZZZ.LIZ = true;
            }
        }
    }

    public final void LJJJ() {
        if (this.LLLLLLLLL != 0) {
            ArrayList<View> arrayList = this.LLLLLLLLLL;
            if (arrayList == null) {
                this.LLLLLLLLLL = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.LLLLLLLLLL.add(getChildAt(i));
            }
            Collections.sort(this.LLLLLLLLLL, e);
        }
    }

    @Override // X.InterfaceC1368705Xh
    public final boolean LLLLZ() {
        if (this.LLLIIII) {
            return false;
        }
        this.LLLLIILLL = true;
        C0S4J c0s4j = this.LL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[beginFakeDrag] ");
        sbLIZ.append(this.LLLLIILLL);
        c0s4j.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
        setScrollState(1);
        this.LLLJ = 0.0f;
        this.LLLILZLLLI = 0.0f;
        VelocityTracker velocityTracker = this.LLLL;
        if (velocityTracker == null) {
            this.LLLL = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, 0.0f, 0.0f, 0);
        this.LLLL.addMovement(motionEventObtain);
        motionEventObtain.recycle();
        this.LLLLIL = jUptimeMillis;
        return true;
    }

    @Override // X.InterfaceC1368705Xh
    public final void LLLLZI() {
        if (!this.LLLLIILLL) {
            throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        }
        this.LLLLIILLL = false;
        C0S4J c0s4j = this.LL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[endFakeDrag] ");
        sbLIZ.append(this.LLLLIILLL);
        c0s4j.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
        if (this.LLJJI != null) {
            VelocityTracker velocityTracker = this.LLLL;
            velocityTracker.computeCurrentVelocity(LSPassThroughRecordSizeConfig.DEFAULT, this.LLLLIIIILLL);
            int yVelocity = (int) velocityTracker.getYVelocity(this.LLLJL);
            this.LLLF = true;
            int clientHeight = getClientHeight();
            int scrollY = getScrollY();
            C21603319gd c21603319gdLJIILLIIL = LJIILLIIL(getScrollY());
            if (c21603319gdLJIILLIIL != null) {
                LJJIL(LJIIL(c21603319gdLJIILLIIL.LIZIZ, ((scrollY / clientHeight) - c21603319gdLJIILLIIL.LJ) / c21603319gdLJIILLIIL.LIZLLL, yVelocity, (int) (this.LLLILZLLLI - this.LLLJ)), true, true, yVelocity);
            }
        }
        this.LLLIIII = false;
        this.LLLIIIIL = false;
        VelocityTracker velocityTracker2 = this.LLLL;
        if (velocityTracker2 != null) {
            velocityTracker2.recycle();
            this.LLLL = null;
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C21601919gP();
    }

    public float getPagingDownDurationOffset() {
        return this.LLLZLL;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        IOptimizerHelperService iOptimizerHelperService;
        C21602719gX c21602719gX;
        HandlerHook.viewRemoveCallbacks(this, this.LLLZZ);
        HandlerHook.viewRemoveCallbacks(this, this.LLLZZIL);
        HandlerHook.viewRemoveCallbacks(this, this.LLZ);
        BPEAHandler bPEAHandler = this.LLLLZI;
        if (bPEAHandler != null) {
            bPEAHandler.removeCallbacks(this.LLLZZIL);
        }
        this.LLLLZ = 0;
        Scroller scroller = this.LLJJJ;
        if (scroller != null && !scroller.isFinished()) {
            this.LLJJJ.abortAnimation();
        }
        C21601719gN c21601719gN = this.LLLLZIL;
        c21601719gN.getClass();
        if (((Boolean) C21606019h4.LJ.getValue()).booleanValue() && (iOptimizerHelperService = c21601719gN.LJIILLIIL) != null && (c21602719gX = c21601719gN.LJIIZILJ) != null) {
            iOptimizerHelperService.LJI(c21602719gX);
            c21601719gN.LJIIZILJ = null;
        }
        super.onDetachedFromWindow();
        this.LLZLI = null;
    }

    private int getClientHeight() {
        return (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.LLJJLIIIJLLLLLLLZ;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    public int getVisualScrollY() {
        return LJIJJ() ? this.LLJJJJ.LJIIIZ : getScrollY();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.LLLLJ = true;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.LL = this.LLJJIII;
        PagerAdapter pagerAdapter = this.LLJJI;
        if (pagerAdapter != null) {
            savedState.LLILLJJLI = pagerAdapter.LJJIIJ();
        }
        return savedState;
    }

    @Override // X.AbstractC1616230sA1
    public final boolean LJ() {
        return this.LLZZ;
    }

    @Override // X.InterfaceC1368705Xh
    public final boolean LLLLLZL() {
        return this.LLLLIILLL;
    }

    @Override // X.AbstractC1616220sA0
    public PagerAdapter getAdapter() {
        return this.LLJJI;
    }

    @Override // X.AbstractC1616220sA0
    public int getCurrentItem() {
        return this.LLJJIII;
    }

    public int getExpectedAdapterCount() {
        return this.LLJILJIL;
    }

    public int getOffscreenPageLimit() {
        return this.LLLFF;
    }

    public int getPageMargin() {
        return this.LLJJL;
    }

    public int getScrollState() {
        return this.LLZIL;
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [X.19gR] */
    /* JADX WARN: Type inference failed for: r0v16, types: [X.19gS] */
    /* JADX WARN: Type inference failed for: r0v17, types: [X.0N7w] */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.19gs] */
    public VerticalViewPager(Context context) {
        super(context);
        this.LL = new C0S4J("VerticalViewPager");
        this.LLILLL = -1.0f;
        this.LLILZ = -1.0f;
        this.LLILZLL = false;
        this.LLIZ = false;
        this.LLIZLLLIL = null;
        this.LLJ = new Object(this) { // from class: X.19gs
            public final ViewGroup LIZ;

            {
                this.LIZ = this;
            }
        };
        this.LLJIJIL = new C21600319g9();
        this.LLJILJILJ = new ArrayList<>();
        this.LLJILLL = new C21603319gd();
        this.LLJJ = new Rect();
        this.LLJJIJI = -1;
        this.LLJJIJIIJIL = null;
        this.LLJJIJIL = null;
        this.LLJJJJJIL = false;
        this.LLJLILLLLZIIL = -3.4028235E38f;
        this.LLJLL = Float.MAX_VALUE;
        this.LLL = false;
        boolean z = true;
        this.LLLFF = 1;
        this.LLLFFI = false;
        this.LLLFZ = false;
        this.LLLI = false;
        this.LLLII = false;
        this.LLLJL = -1;
        this.LLLLJ = true;
        this.LLLLLIL = null;
        this.LLLLLILLIL = new CopyOnWriteArrayList();
        this.LLLLLLJ = new C21602319gT(this);
        this.LLLLLLL = new C1616140s9s(this);
        this.LLLLLLLZIL = 0;
        this.LLLLLLZ = false;
        this.LLLLLLZZ = 600;
        this.LLLLLZ = false;
        this.LLLLLZIL = false;
        this.LLLLLZL = false;
        this.LLLLZ = 0;
        this.LLLLZI = null;
        new ArrayList();
        this.LLLLZIL = new C21601719gN(this);
        this.LLLLZLL = 0;
        this.LLLLZLLIL = new C593510NPp<Integer>() { // from class: X.19gR
            @Override // X.C593510NPp
            public final Integer LIZIZ() {
                return Integer.valueOf((int) (this.LIZJ.LLLLIIL * ((Number) C21605819h2.LIZIZ.getValue()).floatValue()));
            }
        };
        this.LLLLZLLLI = 0;
        this.LLLZ = new C593510NPp<Integer>() { // from class: X.19gS
            @Override // X.C593510NPp
            public final Integer LIZIZ() {
                return Integer.valueOf((int) (this.LIZJ.LLLLII * ((Number) C21605819h2.LIZJ.getValue()).floatValue()));
            }
        };
        this.LLLZI = 0.0f;
        this.LLLZIIL = new C593510NPp<Float>() { // from class: X.0N7w
            @Override // X.C593510NPp
            public final Float LIZIZ() {
                return Float.valueOf(((Number) C07JY.LIZIZ.getValue()).floatValue());
            }
        };
        this.LLLZIL = 0.0f;
        this.LLLZL = 0.0f;
        this.LLLZLL = 0;
        this.LLLZLZ = true;
        this.LLLZZ = new RunnableC991380buC(this);
        this.LLLZZIL = new ARunnableS116S0100000_16(this, 143);
        this.LLZ = new ARunnableS116S0100000_16(this, 144);
        this.LLZIL = 0;
        this.LLZLI = null;
        this.LLZLL = false;
        if (!((Boolean) C21608519hT.LIZIZ.getValue()).booleanValue() && (!this.LLZLL || !((Boolean) C21608519hT.LIZ.getValue()).booleanValue())) {
            z = false;
        }
        this.LLZLLIL = z;
        this.LLZLLLL = false;
        this.LLZZ = false;
        this.LLZZJLIL = null;
        this.LLZZLLIL = false;
        LJIIZILJ();
    }

    public static /* synthetic */ void LJFF(VerticalViewPager verticalViewPager) {
        verticalViewPager.getClass();
        C1C7U.LIZ("VerticalViewPager@894f.populateOptimized$1L");
        C786410Ut5.LJL(verticalViewPager.getMainHander(), verticalViewPager.LLLZZIL);
        C1C7U.LIZIZ("VerticalViewPager@894f.populateOptimized$1L");
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.LLJZ != z) {
            this.LLJZ = z;
        }
    }

    @Override // X.InterfaceC21604919gt
    public final View LIZ(int i) {
        return getChildAt(i);
    }

    @Override // X.InterfaceC21604919gt
    public final boolean LIZIZ(View view) {
        C21603319gd c21603319gdLJIILJJIL = LJIILJJIL(view);
        if (c21603319gdLJIILJJIL == null || c21603319gdLJIILJJIL.LIZIZ == this.LLJJIII) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC1616220sA0
    public final void LIZJ(final InterfaceC469360Ias interfaceC469360Ias) {
        if (interfaceC469360Ias == null) {
            return;
        }
        if (interfaceC469360Ias instanceof InterfaceC1613610s5n) {
            ListProtector.add(this.LLLLLILLIL, 0, new InterfaceC1616160s9u(interfaceC469360Ias) { // from class: X.0sA6
                public final InterfaceC469360Ias LL;

                @Override // X.InterfaceC1616160s9u
                public final /* synthetic */ void onBeforePageChange() {
                }

                @Override // X.InterfaceC1616160s9u
                public final /* synthetic */ void onScrollToItemStart(int i) {
                }

                @Override // X.InterfaceC1616160s9u
                public final /* synthetic */ void onScrollToItemStart(int i, boolean z) {
                    throw null;
                }

                {
                    this.LL = interfaceC469360Ias;
                }

                @Override // X.InterfaceC469360Ias
                public final void onPageScrollStateChanged(int i) {
                    this.LL.onPageScrollStateChanged(i);
                }

                @Override // X.InterfaceC469360Ias
                public final void onPageSelected(int i) {
                    this.LL.onPageSelected(i);
                }

                @Override // X.InterfaceC469360Ias
                public final void onPageScrolled(int i, float f2, int i2) {
                    this.LL.onPageScrolled(i, f2, i2);
                }
            });
            return;
        }
        ((CopyOnWriteArrayList) this.LLLLLILLIL).add(new InterfaceC1616160s9u(interfaceC469360Ias) { // from class: X.0sA6
            public final InterfaceC469360Ias LL;

            @Override // X.InterfaceC1616160s9u
            public final /* synthetic */ void onBeforePageChange() {
            }

            @Override // X.InterfaceC1616160s9u
            public final /* synthetic */ void onScrollToItemStart(int i) {
            }

            @Override // X.InterfaceC1616160s9u
            public final /* synthetic */ void onScrollToItemStart(int i, boolean z) {
                throw null;
            }

            {
                this.LL = interfaceC469360Ias;
            }

            @Override // X.InterfaceC469360Ias
            public final void onPageScrollStateChanged(int i) {
                this.LL.onPageScrollStateChanged(i);
            }

            @Override // X.InterfaceC469360Ias
            public final void onPageSelected(int i) {
                this.LL.onPageSelected(i);
            }

            @Override // X.InterfaceC469360Ias
            public final void onPageScrolled(int i, float f2, int i2) {
                this.LL.onPageScrolled(i, f2, i2);
            }
        });
    }

    @Override // X.AbstractC1616220sA0
    public final void LIZLLL(InterfaceC469360Ias interfaceC469360Ias) {
        List<InterfaceC1616160s9u> list = this.LLLLLILLIL;
        if (list != null) {
            list.remove(interfaceC469360Ias);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJII(int r7) {
        /*
            r6 = this;
            android.view.View r4 = r6.findFocus()
            r2 = 1
            r3 = 0
            if (r4 == r6) goto L29
            if (r4 == 0) goto L2a
            android.view.ViewParent r1 = r4.getParent()
        Le:
            boolean r0 = r1 instanceof android.view.ViewGroup
            if (r0 == 0) goto L19
            if (r1 == r6) goto L2a
            android.view.ViewParent r1 = r1.getParent()
            goto Le
        L19:
            android.view.ViewParent r1 = r4.getParent()
        L1d:
            boolean r0 = r1 instanceof android.view.ViewGroup
            if (r0 == 0) goto L29
            r1.getClass()
            android.view.ViewParent r1 = r1.getParent()
            goto L1d
        L29:
            r4 = 0
        L2a:
            android.view.FocusFinder r0 = android.view.FocusFinder.getInstance()
            android.view.View r5 = r0.findNextFocus(r6, r4, r7)
            r1 = 130(0x82, float:1.82E-43)
            r0 = 33
            if (r5 == 0) goto L98
            if (r5 == r4) goto L98
            if (r7 != r0) goto L68
            android.graphics.Rect r0 = r6.LLJJ
            android.graphics.Rect r0 = r6.LJIILIIL(r0, r5)
            int r1 = r0.top
            android.graphics.Rect r0 = r6.LLJJ
            android.graphics.Rect r0 = r6.LJIILIIL(r0, r4)
            int r0 = r0.top
            if (r4 == 0) goto L63
            if (r1 < r0) goto L63
            int r0 = r6.LLJJIII
            if (r0 <= 0) goto Lbf
            int r0 = r0 - r2
            r6.LJJIJLIJ(r0, r2)
        L58:
            r3 = r2
        L59:
            if (r3 == 0) goto L62
            int r0 = android.view.SoundEffectConstants.getContantForFocusDirection(r7)
            r6.playSoundEffect(r0)
        L62:
            return r3
        L63:
            boolean r3 = r5.requestFocus()
            goto L59
        L68:
            if (r7 != r1) goto L62
            android.graphics.Rect r0 = r6.LLJJ
            android.graphics.Rect r0 = r6.LJIILIIL(r0, r5)
            int r1 = r0.bottom
            android.graphics.Rect r0 = r6.LLJJ
            android.graphics.Rect r0 = r6.LJIILIIL(r0, r4)
            int r0 = r0.bottom
            if (r4 == 0) goto L93
            if (r1 > r0) goto L93
            androidx.viewpager.widget.PagerAdapter r0 = r6.LLJJI
            if (r0 == 0) goto Lbf
            int r1 = r6.LLJJIII
            int r0 = r0.getCount()
            int r0 = r0 - r2
            if (r1 >= r0) goto Lbf
            int r0 = r6.LLJJIII
            int r0 = r0 + 1
            r6.LJJIJLIJ(r0, r2)
            goto L58
        L93:
            boolean r3 = r5.requestFocus()
            goto L59
        L98:
            if (r7 == r0) goto Lb6
            if (r7 == r2) goto Lb6
            if (r7 == r1) goto La1
            r0 = 2
            if (r7 != r0) goto L62
        La1:
            androidx.viewpager.widget.PagerAdapter r0 = r6.LLJJI
            if (r0 == 0) goto Lbf
            int r1 = r6.LLJJIII
            int r0 = r0.getCount()
            int r0 = r0 - r2
            if (r1 >= r0) goto Lbf
            int r0 = r6.LLJJIII
            int r0 = r0 + 1
            r6.LJJIJLIJ(r0, r2)
            goto L58
        Lb6:
            int r0 = r6.LLJJIII
            if (r0 <= 0) goto Lbf
            int r0 = r0 - r2
            r6.LJJIJLIJ(r0, r2)
            goto L58
        Lbf:
            r2 = 0
            goto L58
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.common.widget.VerticalViewPager.LJII(int):boolean");
    }

    public final void LJIIJ(boolean z) {
        boolean z2;
        C19K2 c19k2 = this.LLJJJJ;
        if (c19k2 != null && c19k2.LJ) {
            c19k2.LIZJ();
        }
        if (this.LLZIL == 2) {
            z2 = true;
            setScrollingCacheEnabled(false);
            if (!this.LLJJJ.isFinished()) {
                this.LLJJJ.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.LLJJJ.getCurrX();
                int currY = this.LLJJJ.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currY != scrollY) {
                        LJJI(currY);
                    }
                }
            } else if (this.LLJJJ.getCurrY() != getScrollY()) {
                try {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("realY:");
                    sbLIZ.append(getScrollY());
                    sbLIZ.append(",expectY:");
                    sbLIZ.append(this.LLJJJ.getCurrY());
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    C2276411E8h c2276411E8h = C2276411E8h.LIZIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("try fix->");
                    sbLIZ2.append(strLIZIZ);
                    c2276411E8h.LIZJ("common_feed", 5, "VerticalViewPager", C2188811AlT.LIZIZ(sbLIZ2));
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    C1AF0.LJ(e2);
                    C2276411E8h.LIZIZ.LIZIZ("common_feed", e2);
                }
                scrollTo(this.LLJJJ.getCurrX(), this.LLJJJ.getCurrY());
            }
        } else {
            z2 = false;
        }
        this.LLLF = false;
        for (int i = 0; i < this.LLJILJILJ.size(); i++) {
            C21603319gd c21603319gd = (C21603319gd) ListProtector.get(this.LLJILJILJ, i);
            if (c21603319gd.LIZJ) {
                c21603319gd.LIZJ = false;
                z2 = true;
            }
        }
        if (z2) {
            if (z) {
                postOnAnimation(this.LLLZZ);
            } else {
                this.LLLZZ.run();
            }
        }
    }

    public final C21603319gd LJIILJJIL(View view) {
        for (int i = 0; i < this.LLJILJILJ.size(); i++) {
            C21603319gd c21603319gd = (C21603319gd) ListProtector.get(this.LLJILJILJ, i);
            if (this.LLJJI.LJJIFFI(view, c21603319gd.LIZ)) {
                return c21603319gd;
            }
        }
        return null;
    }

    public final C21603319gd LJIILL(int i) {
        for (int i2 = 0; i2 < this.LLJILJILJ.size(); i2++) {
            C21603319gd c21603319gd = (C21603319gd) ListProtector.get(this.LLJILJILJ, i2);
            if (c21603319gd.LIZIZ == i) {
                return c21603319gd;
            }
        }
        return null;
    }

    public final C21603319gd LJIILLIIL(int i) {
        float f2;
        float f3;
        int i2;
        float fLJIL;
        int clientHeight = getClientHeight();
        float f4 = 0.0f;
        if (clientHeight > 0) {
            f2 = i / clientHeight;
            f3 = this.LLJJL / clientHeight;
        } else {
            f2 = 0.0f;
            f3 = 0.0f;
        }
        C21603319gd c21603319gd = null;
        int i3 = 0;
        boolean z = true;
        int i4 = -1;
        float f5 = 0.0f;
        while (i3 < this.LLJILJILJ.size()) {
            C21603319gd c21603319gd2 = (C21603319gd) ListProtector.get(this.LLJILJILJ, i3);
            if (!z && c21603319gd2.LIZIZ != (i2 = i4 + 1)) {
                c21603319gd2 = this.LLJILLL;
                c21603319gd2.LJ = f4 + f5 + f3;
                c21603319gd2.LIZIZ = i2;
                PagerAdapter pagerAdapter = this.LLJJI;
                if (pagerAdapter == null) {
                    fLJIL = 1.0f;
                } else {
                    fLJIL = pagerAdapter.LJIL(i2);
                }
                c21603319gd2.LIZLLL = fLJIL;
                i3--;
            }
            f4 = c21603319gd2.LJ;
            float f6 = c21603319gd2.LIZLLL + f4 + f3;
            if (!z && f2 < f4) {
                return c21603319gd;
            }
            if (f2 >= f6 && i3 != this.LLJILJILJ.size() - 1) {
                i4 = c21603319gd2.LIZIZ;
                f5 = c21603319gd2.LIZLLL;
                i3++;
                z = false;
                c21603319gd = c21603319gd2;
            } else {
                return c21603319gd2;
            }
        }
        return c21603319gd;
    }

    public final boolean LJIJI(int i) {
        int i2 = this.LLZZZIL;
        if (i2 == 1) {
            return true;
        }
        if (i2 == 2) {
            if (this.LLZZZZ == null) {
                return true;
            }
            if (i < 0) {
                return !r0.LIZ;
            }
            if (i > 0) {
                return !r0.LIZIZ;
            }
            return false;
        }
        return false;
    }

    public final void LJJ(MotionEvent motionEvent) {
        int i;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.LLLJL) {
            if (actionIndex == 0) {
                i = 1;
            } else {
                i = 0;
            }
            this.LLLILZLLLI = motionEvent.getY(i);
            this.LLLJL = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.LLLL;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final boolean LJJI(int i) {
        C21603319gd c21603319gdLJIILLIIL;
        if (this.LLJILJILJ.size() == 0) {
            if (this.LLLLJ) {
                return false;
            }
            this.LLLLJI = false;
            LJIL(0, 0.0f, 0);
            if (this.LLLLJI) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        if (LJIJJ()) {
            c21603319gdLJIILLIIL = LJIILLIIL(i);
        } else {
            c21603319gdLJIILLIIL = LJIILLIIL(getScrollY());
        }
        int clientHeight = getClientHeight();
        int i2 = this.LLJJL;
        int i3 = clientHeight + i2;
        float f2 = i2;
        float f3 = clientHeight;
        int i4 = c21603319gdLJIILLIIL.LIZIZ;
        float f4 = ((i / f3) - c21603319gdLJIILLIIL.LJ) / (c21603319gdLJIILLIIL.LIZLLL + (f2 / f3));
        int i5 = (int) (i3 * f4);
        if (LJIJJ()) {
            C2187451AjH.LJIIJ();
        }
        this.LLLLJI = false;
        LJIL(i4, f4, i5);
        if (this.LLLLJI) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    public final boolean LJJIFFI(float f2) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (this.LLLIIIL) {
            return false;
        }
        float f3 = this.LLLILZLLLI - f2;
        this.LLLILZLLLI = f2;
        float scrollY = getScrollY() + f3;
        float clientHeight = getClientHeight();
        float f4 = this.LLJLILLLLZIIL * clientHeight;
        float f5 = this.LLJLL * clientHeight;
        if (this.LLJILJILJ.size() <= 0) {
            return false;
        }
        C21603319gd c21603319gd = (C21603319gd) ListProtector.get(this.LLJILJILJ, 0);
        ArrayList<C21603319gd> arrayList = this.LLJILJILJ;
        C21603319gd c21603319gd2 = (C21603319gd) ListProtector.get(arrayList, arrayList.size() - 1);
        if (c21603319gd.LIZIZ != 0) {
            f4 = c21603319gd.LJ * clientHeight;
            z = false;
        } else {
            z = true;
        }
        if (c21603319gd2.LIZIZ != this.LLJJI.getCount() - 1) {
            f5 = c21603319gd2.LJ * clientHeight;
            z2 = false;
        } else {
            z2 = true;
        }
        if (scrollY < f4) {
            if (z) {
                this.LLLLILI.LJ(Math.abs(f4 - scrollY) / clientHeight);
                z3 = true;
            }
            scrollY = f4;
        } else if (scrollY > f5) {
            if (z2) {
                this.mBottomEdge.LJ(Math.abs(scrollY - f5) / clientHeight);
                z3 = true;
            }
            scrollY = f5;
        }
        int i = (int) scrollY;
        this.LLLILZJ += scrollY - i;
        scrollTo(getScrollX(), i);
        LJJI(i);
        return z3;
    }

    public final void LJJIIJZLJL(float f2) {
        int i = this.LLZZZIL;
        if (i != 1) {
            if (i == 2) {
                if (f2 < 0.0f) {
                    C21604619gq c21604619gq = this.LLZZZZ;
                    if (c21604619gq == null || !c21604619gq.LIZIZ) {
                        LJJIIJ();
                        return;
                    }
                    return;
                }
                if (f2 <= 0.0f) {
                    return;
                }
                C21604619gq c21604619gq2 = this.LLZZZZ;
                if (c21604619gq2 != null && c21604619gq2.LIZ) {
                    return;
                }
                LJJIIZI();
                return;
            }
            return;
        }
        if (f2 < 0.0f) {
            LJJIIJ();
        } else {
            if (f2 <= 0.0f) {
                return;
            }
            LJJIIZI();
        }
    }

    public final void LJJIJIIJI(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    @Override // X.InterfaceC1368705Xh
    public final void LLLLZIL(float f2) {
        if (this.LLLLIILLL) {
            if (this.LLJJI == null) {
                return;
            }
            InterfaceC21604219gm interfaceC21604219gm = this.LLIZLLLIL;
            if (interfaceC21604219gm != null) {
                if (f2 < 0.0f) {
                    interfaceC21604219gm.LIZJ();
                } else if (f2 > 0.0f) {
                    interfaceC21604219gm.LIZ();
                }
            }
            try {
                LJJIIJZLJL(f2);
                this.LLLILZLLLI += f2;
                float scrollY = getScrollY() - f2;
                float clientHeight = getClientHeight();
                float f3 = this.LLJLILLLLZIIL * clientHeight;
                float f4 = this.LLJLL * clientHeight;
                C21603319gd c21603319gd = this.LLJILJILJ.get(0);
                C21603319gd c21603319gd2 = this.LLJILJILJ.get(r1.size() - 1);
                if (c21603319gd.LIZIZ != 0) {
                    f3 = c21603319gd.LJ * clientHeight;
                }
                if (c21603319gd2.LIZIZ != this.LLJJI.getCount() - 1) {
                    f4 = c21603319gd2.LJ * clientHeight;
                }
                if (scrollY < f3) {
                    scrollY = f3;
                } else if (scrollY > f4) {
                    scrollY = f4;
                }
                int i = (int) scrollY;
                this.LLLILZLLLI += scrollY - i;
                scrollTo(getScrollX(), i);
                LJJI(i);
                MotionEvent motionEventObtain = MotionEvent.obtain(this.LLLLIL, SystemClock.uptimeMillis(), 2, 0.0f, this.LLLILZLLLI, 0);
                if (this.LLLL == null) {
                    this.LLLL = VelocityTracker.obtain();
                }
                VelocityTracker velocityTracker = this.LLLL;
                if (velocityTracker == null) {
                    return;
                }
                velocityTracker.addMovement(motionEventObtain);
                motionEventObtain.recycle();
                return;
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                C2276411E8h.LIZIZ.LIZLLL("common_feed", e2);
                C1AF0.LJFF(e2, "VerticalViewPager");
                return;
            }
        }
        throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addTouchables(ArrayList<View> arrayList) {
        C21603319gd c21603319gdLJIILJJIL;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (c21603319gdLJIILJJIL = LJIILJJIL(childAt)) != null && c21603319gdLJIILJJIL.LIZIZ == this.LLJJIII) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        int count;
        if (this.LLJJI == null) {
            return false;
        }
        InterfaceC21604219gm interfaceC21604219gm = this.LLIZLLLIL;
        if (interfaceC21604219gm != null && interfaceC21604219gm.LIZIZ()) {
            if (i < 0) {
                this.LLIZLLLIL.LIZ();
            } else if (i > 0) {
                this.LLIZLLLIL.LIZJ();
            }
        }
        if (LJIJI(i)) {
            if (i < 0) {
                if (this.LLJJIII <= 0) {
                    return false;
                }
                return true;
            }
            PagerAdapter pagerAdapter = this.LLJJI;
            if (pagerAdapter == null) {
                count = 0;
            } else {
                count = pagerAdapter.getCount();
            }
            if (this.LLJJIII >= count - 1) {
                return false;
            }
            return true;
        }
        int clientHeight = getClientHeight();
        int scrollY = getScrollY();
        if (i < 0) {
            if (scrollY <= ((int) (clientHeight * this.LLJLILLLLZIIL))) {
                return false;
            }
            return true;
        }
        if (i <= 0 || scrollY >= ((int) (clientHeight * this.LLJLL))) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof C21601919gP) && super.checkLayoutParams(layoutParams)) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.LLLLZIL.LIZJ();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean zLJII;
        if (!super.dispatchKeyEvent(keyEvent)) {
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode != 21) {
                    if (keyCode != 22) {
                        if (keyCode == 61) {
                            if (keyEvent.hasNoModifiers()) {
                                zLJII = LJII(2);
                            } else if (keyEvent.hasModifiers(1)) {
                                zLJII = LJII(1);
                            } else {
                                return false;
                            }
                        } else {
                            return false;
                        }
                    } else {
                        zLJII = LJII(66);
                    }
                } else {
                    zLJII = LJII(17);
                }
                if (!zLJII) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        C21603319gd c21603319gdLJIILJJIL;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (c21603319gdLJIILJJIL = LJIILJJIL(childAt)) != null && c21603319gdLJIILJJIL.LIZIZ == this.LLJJIII && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0031 A[LOOP:2: B:16:0x002f->B:17:0x0031, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0045 A[LOOP:3: B:19:0x0043->B:20:0x0045, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0068 A[LOOP:0: B:27:0x0066->B:28:0x0068, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0081 A[LOOP:1: B:30:0x007f->B:31:0x0081, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x010f A[Catch: all -> 0x0279, TryCatch #3 {all -> 0x0279, blocks: (B:43:0x00bf, B:58:0x0107, B:59:0x010f, B:61:0x0113), top: B:114:0x00bf }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0224  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchTouchEvent(android.view.MotionEvent r14) {
        /*
            Method dump skipped, instruction units count: 643
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.common.widget.VerticalViewPager.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        PagerAdapter pagerAdapter;
        try {
            super.draw(canvas);
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2276411E8h.LIZIZ.LIZLLL("common_feed", e2);
            C1AF0.LJFF(e2, "VerticalViewPager");
        }
        int overScrollMode = getOverScrollMode();
        boolean zLIZ = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (pagerAdapter = this.LLJJI) != null && pagerAdapter.getCount() > 1)) {
            C20097913kP c20097913kP = this.LLLLILI;
            if (c20097913kP != null && !c20097913kP.LIZLLL()) {
                int iSave = canvas.save();
                int height = getHeight();
                int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
                canvas.translate(getPaddingLeft(), this.LLJLILLLLZIIL * height);
                this.LLLLILI.LJII(width, height);
                zLIZ = false | this.LLLLILI.LIZ(canvas);
                canvas.restoreToCount(iSave);
            }
            if (!this.mBottomEdge.LIZLLL()) {
                int iSave2 = canvas.save();
                int height2 = getHeight();
                int width2 = (getWidth() - getPaddingLeft()) - getPaddingRight();
                canvas.rotate(180.0f);
                canvas.translate((-width2) - getPaddingLeft(), (-(this.LLJLL + 1.0f)) * height2);
                this.mBottomEdge.LJII(width2, height2);
                zLIZ |= this.mBottomEdge.LIZ(canvas);
                canvas.restoreToCount(iSave2);
            }
            if (zLIZ) {
                postInvalidateOnAnimation();
                return;
            }
            return;
        }
        C20097913kP c20097913kP2 = this.LLLLILI;
        if (c20097913kP2 != null) {
            c20097913kP2.LIZIZ();
        }
        C20097913kP c20097913kP3 = this.mBottomEdge;
        if (c20097913kP3 == null) {
            return;
        }
        c20097913kP3.LIZIZ();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C21601919gP(getContext(), attributeSet);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        float f2;
        super.onDraw(canvas);
        if (this.LLJJL > 0 && this.LLJJLIIIJLLLLLLLZ != null && this.LLJILJILJ.size() > 0 && this.LLJJI != null) {
            int scrollY = getScrollY();
            float height = getHeight();
            float f3 = this.LLJJL / height;
            int i2 = 0;
            C21603319gd c21603319gd = (C21603319gd) ListProtector.get(this.LLJILJILJ, 0);
            float f4 = c21603319gd.LJ;
            int size = this.LLJILJILJ.size();
            int i3 = ((C21603319gd) ListProtector.get(this.LLJILJILJ, size - 1)).LIZIZ;
            for (int i4 = c21603319gd.LIZIZ; i4 < i3; i4++) {
                while (true) {
                    i = c21603319gd.LIZIZ;
                    if (i4 <= i || i2 >= size) {
                        break;
                    }
                    i2++;
                    c21603319gd = (C21603319gd) ListProtector.get(this.LLJILJILJ, i2);
                }
                if (i4 == i) {
                    float f5 = c21603319gd.LJ;
                    float f6 = c21603319gd.LIZLLL;
                    f2 = (f5 + f6) * height;
                    f4 = f5 + f6 + f3;
                } else {
                    float fLJIL = this.LLJJI.LJIL(i4);
                    f2 = (f4 + fLJIL) * height;
                    f4 += fLJIL + f3;
                }
                int i5 = this.LLJJL;
                if (i5 + f2 > scrollY) {
                    this.LLJJLIIIJLLLLLLLZ.setBounds(this.LLJL, (int) f2, this.LLJLIL, (int) (i5 + f2 + 0.5f));
                    this.LLJJLIIIJLLLLLLLZ.draw(canvas);
                }
                if (f2 > scrollY + r8) {
                    return;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00e1 A[Catch: IllegalArgumentException -> 0x020d, TryCatch #0 {IllegalArgumentException -> 0x020d, blocks: (B:5:0x0008, B:8:0x000d, B:12:0x001d, B:15:0x0022, B:96:0x0183, B:97:0x0186, B:99:0x018a, B:100:0x0190, B:24:0x0031, B:26:0x0036, B:28:0x0057, B:31:0x0062, B:36:0x0073, B:38:0x0085, B:40:0x008c, B:42:0x0094, B:52:0x00a7, B:54:0x00ad, B:60:0x00b9, B:62:0x00c0, B:64:0x00c5, B:66:0x00cb, B:67:0x00ce, B:74:0x00e9, B:75:0x00ef, B:76:0x00f6, B:78:0x00fa, B:80:0x0105, B:70:0x00da, B:71:0x00e1, B:73:0x00e6, B:81:0x0109, B:83:0x010d, B:84:0x0113, B:86:0x013d, B:88:0x0141, B:89:0x0147, B:91:0x0152, B:93:0x0167, B:95:0x017d, B:94:0x017a, B:101:0x0196, B:104:0x019c, B:106:0x01a0, B:108:0x01ae, B:110:0x01dc, B:112:0x01ec, B:114:0x01f2, B:115:0x0209), top: B:121:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e6 A[Catch: IllegalArgumentException -> 0x020d, TryCatch #0 {IllegalArgumentException -> 0x020d, blocks: (B:5:0x0008, B:8:0x000d, B:12:0x001d, B:15:0x0022, B:96:0x0183, B:97:0x0186, B:99:0x018a, B:100:0x0190, B:24:0x0031, B:26:0x0036, B:28:0x0057, B:31:0x0062, B:36:0x0073, B:38:0x0085, B:40:0x008c, B:42:0x0094, B:52:0x00a7, B:54:0x00ad, B:60:0x00b9, B:62:0x00c0, B:64:0x00c5, B:66:0x00cb, B:67:0x00ce, B:74:0x00e9, B:75:0x00ef, B:76:0x00f6, B:78:0x00fa, B:80:0x0105, B:70:0x00da, B:71:0x00e1, B:73:0x00e6, B:81:0x0109, B:83:0x010d, B:84:0x0113, B:86:0x013d, B:88:0x0141, B:89:0x0147, B:91:0x0152, B:93:0x0167, B:95:0x017d, B:94:0x017a, B:101:0x0196, B:104:0x019c, B:106:0x01a0, B:108:0x01ae, B:110:0x01dc, B:112:0x01ec, B:114:0x01f2, B:115:0x0209), top: B:121:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00fa A[Catch: IllegalArgumentException -> 0x020d, TryCatch #0 {IllegalArgumentException -> 0x020d, blocks: (B:5:0x0008, B:8:0x000d, B:12:0x001d, B:15:0x0022, B:96:0x0183, B:97:0x0186, B:99:0x018a, B:100:0x0190, B:24:0x0031, B:26:0x0036, B:28:0x0057, B:31:0x0062, B:36:0x0073, B:38:0x0085, B:40:0x008c, B:42:0x0094, B:52:0x00a7, B:54:0x00ad, B:60:0x00b9, B:62:0x00c0, B:64:0x00c5, B:66:0x00cb, B:67:0x00ce, B:74:0x00e9, B:75:0x00ef, B:76:0x00f6, B:78:0x00fa, B:80:0x0105, B:70:0x00da, B:71:0x00e1, B:73:0x00e6, B:81:0x0109, B:83:0x010d, B:84:0x0113, B:86:0x013d, B:88:0x0141, B:89:0x0147, B:91:0x0152, B:93:0x0167, B:95:0x017d, B:94:0x017a, B:101:0x0196, B:104:0x019c, B:106:0x01a0, B:108:0x01ae, B:110:0x01dc, B:112:0x01ec, B:114:0x01f2, B:115:0x0209), top: B:121:0x0008 }] */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r21) {
        /*
            Method dump skipped, instruction units count: 532
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.common.widget.VerticalViewPager.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        PagerAdapter pagerAdapter = this.LLJJI;
        if (pagerAdapter != null) {
            pagerAdapter.LJJIII(savedState.LLILLJJLI, savedState.LLILLL);
            LJJIL(savedState.LL, false, true, 0);
        } else {
            this.LLJJIJI = savedState.LL;
            this.LLJJIJIIJIL = savedState.LLILLJJLI;
            this.LLJJIJIL = savedState.LLILLL;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:173:0x02e8 A[Catch: IllegalStateException -> 0x0332, IllegalArgumentException -> 0x034e, TryCatch #3 {IllegalArgumentException -> 0x034e, IllegalStateException -> 0x0332, blocks: (B:6:0x000b, B:9:0x0010, B:11:0x0018, B:14:0x001f, B:16:0x0023, B:18:0x0029, B:20:0x002d, B:21:0x0033, B:32:0x004e, B:34:0x005e, B:36:0x006f, B:38:0x0073, B:173:0x02e8, B:39:0x007e, B:41:0x0082, B:44:0x008b, B:46:0x0090, B:48:0x0099, B:49:0x009f, B:54:0x00c3, B:57:0x00ca, B:59:0x00d1, B:61:0x00d6, B:63:0x00dc, B:64:0x00df, B:66:0x00ec, B:67:0x00f0, B:69:0x0100, B:84:0x013e, B:70:0x0103, B:72:0x0107, B:74:0x0115, B:76:0x011d, B:77:0x0121, B:79:0x012a, B:81:0x012e, B:83:0x0139, B:82:0x0133, B:85:0x0143, B:87:0x0147, B:89:0x014b, B:91:0x0170, B:93:0x0197, B:95:0x01a6, B:97:0x01aa, B:98:0x01b2, B:100:0x01b6, B:102:0x01c4, B:104:0x01c8, B:105:0x01d0, B:107:0x01d4, B:111:0x01df, B:113:0x01e3, B:114:0x01e8, B:116:0x01ec, B:118:0x01fa, B:119:0x0209, B:121:0x020d, B:123:0x0211, B:125:0x0217, B:126:0x0230, B:170:0x02df, B:171:0x02e2, B:175:0x02ec, B:177:0x0318, B:178:0x031e, B:180:0x0322, B:182:0x0326, B:183:0x032d), top: B:197:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0107 A[Catch: IllegalStateException -> 0x0332, IllegalArgumentException -> 0x034e, TryCatch #3 {IllegalArgumentException -> 0x034e, IllegalStateException -> 0x0332, blocks: (B:6:0x000b, B:9:0x0010, B:11:0x0018, B:14:0x001f, B:16:0x0023, B:18:0x0029, B:20:0x002d, B:21:0x0033, B:32:0x004e, B:34:0x005e, B:36:0x006f, B:38:0x0073, B:173:0x02e8, B:39:0x007e, B:41:0x0082, B:44:0x008b, B:46:0x0090, B:48:0x0099, B:49:0x009f, B:54:0x00c3, B:57:0x00ca, B:59:0x00d1, B:61:0x00d6, B:63:0x00dc, B:64:0x00df, B:66:0x00ec, B:67:0x00f0, B:69:0x0100, B:84:0x013e, B:70:0x0103, B:72:0x0107, B:74:0x0115, B:76:0x011d, B:77:0x0121, B:79:0x012a, B:81:0x012e, B:83:0x0139, B:82:0x0133, B:85:0x0143, B:87:0x0147, B:89:0x014b, B:91:0x0170, B:93:0x0197, B:95:0x01a6, B:97:0x01aa, B:98:0x01b2, B:100:0x01b6, B:102:0x01c4, B:104:0x01c8, B:105:0x01d0, B:107:0x01d4, B:111:0x01df, B:113:0x01e3, B:114:0x01e8, B:116:0x01ec, B:118:0x01fa, B:119:0x0209, B:121:0x020d, B:123:0x0211, B:125:0x0217, B:126:0x0230, B:170:0x02df, B:171:0x02e2, B:175:0x02ec, B:177:0x0318, B:178:0x031e, B:180:0x0322, B:182:0x0326, B:183:0x032d), top: B:197:0x000b }] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r25) {
        /*
            Method dump skipped, instruction units count: 859
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.common.widget.VerticalViewPager.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.LLJLLL) {
            RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, view);
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        this.LLIZ = z;
    }

    /* JADX WARN: Type inference failed for: r0v28, types: [X.19gj] */
    public void setAdapter(PagerAdapter pagerAdapter) {
        PagerAdapter pagerAdapter2 = this.LLJJI;
        if (pagerAdapter2 != null) {
            try {
                Field field = f;
                if (field != null) {
                    field.set(pagerAdapter2, null);
                }
            } catch (IllegalAccessException e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            this.LLJJI.LJJIJIIJI(this);
            for (int i = 0; i < this.LLJILJILJ.size(); i++) {
                C21603319gd c21603319gd = (C21603319gd) ListProtector.get(this.LLJILJILJ, i);
                this.LLJJI.LJIIZILJ(this, c21603319gd.LIZIZ, c21603319gd.LIZ);
            }
            this.LLJJI.LJIJI(this);
            this.LLJILJILJ.clear();
            int i2 = 0;
            while (i2 < getChildCount()) {
                if (!((C21601919gP) getChildAt(i2).getLayoutParams()).LIZ) {
                    RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, null);
                    removeViewAt(i2);
                    i2--;
                }
                i2++;
            }
            if (pagerAdapter == null && C1591220rVg.LIZIZ()) {
                C21602319gT c21602319gT = this.LLLLLLJ;
                c21602319gT.LIZIZ = null;
                c21602319gT.LIZJ = null;
                c21602319gT.LJ = null;
                c21602319gT.LIZLLL = false;
                this.LLLLLLL.LIZ = null;
            }
            this.LLJJIII = 0;
            scrollTo(0, 0);
        }
        this.LLJJI = pagerAdapter;
        this.LLJILJIL = 0;
        if (pagerAdapter != null) {
            if (this.LLJJJJLIIL == null) {
                this.LLJJJJLIIL = new DataSetObserver() { // from class: X.19gj
                    @Override // android.database.DataSetObserver
                    public final void onChanged() {
                        this.LIZ.LJIIJJI();
                    }

                    @Override // android.database.DataSetObserver
                    public final void onInvalidated() {
                        this.LIZ.LJIIJJI();
                    }
                };
            }
            PagerAdapter pagerAdapter3 = this.LLJJI;
            C21603919gj c21603919gj = this.LLJJJJLIIL;
            try {
                Field field2 = f;
                if (field2 != null) {
                    field2.set(pagerAdapter3, c21603919gj);
                }
            } catch (IllegalAccessException e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
            this.LLLF = false;
            boolean z = this.LLLLJ;
            this.LLLLJ = true;
            this.LLJILJIL = this.LLJJI.getCount();
            if (this.LLJJIJI >= 0) {
                this.LLJJI.LJJIII(this.LLJJIJIIJIL, this.LLJJIJIL);
                LJJIL(this.LLJJIJI, false, true, 0);
                this.LLJJIJI = -1;
                this.LLJJIJIIJIL = null;
                this.LLJJIJIL = null;
                return;
            }
            if (!z) {
                LJJIII();
            } else {
                requestLayout();
            }
        }
    }

    public void setCanTouch(boolean z) {
        this.LLILLJJLI = z;
        C0S4J c0s4j = this.LL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[setCanTouch] ");
        sbLIZ.append(this.LLILLJJLI);
        c0s4j.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
    }

    public void setChildrenDrawingOrderEnabledCompat(boolean z) {
        if (this.LLLLLLIL == null) {
            try {
                this.LLLLLLIL = ViewGroup.class.getDeclaredMethod("setChildrenDrawingOrderEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
        try {
            this.LLLLLLIL.invoke(this, Boolean.valueOf(z));
        } catch (Exception e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
    }

    public void setCurrentItem(int i) {
        this.LLLF = false;
        LJJIL(i, !this.LLLLJ, false, 0);
    }

    public void setCurrentItemWithDefaultVelocity(int i) {
        this.LLLF = false;
        LJJIL(i, true, true, 1);
    }

    public void setDisableScroll(boolean z) {
        this.LLZZ = z;
        C0S4J c0s4j = this.LL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[setDisableScroll] ");
        sbLIZ.append(this.LLZZ);
        c0s4j.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
    }

    public void setEnableBackSlideSave(boolean z) {
        this.LLLII = z;
    }

    public void setEnableTouchSlopMultiple(boolean z) {
        this.LLILZLL = z;
    }

    public void setEndScrollDelayTime(int i) {
        this.LLLLLLLZIL = i;
    }

    public void setEventType(String str) {
        boolean z;
        this.LLZLL = TextUtils.equals(str, "homepage_hot");
        if (((Boolean) C21608519hT.LIZIZ.getValue()).booleanValue() || (this.LLZLL && ((Boolean) C21608519hT.LIZ.getValue()).booleanValue())) {
            z = true;
        } else {
            z = false;
        }
        this.LLZLLIL = z;
    }

    public void setFixDispatchFirstSelected(boolean z) {
        this.LLLLLLJ.LIZ = z;
    }

    public void setIsChangingTrending(boolean z) {
        this.LLLLLZIL = z;
    }

    public void setIsDownGradeViewOpt1Open(boolean z) {
        this.LLL = z;
    }

    public void setIsTriggerByAutoPlay(boolean z) {
        this.LLLLLZ = z;
    }

    public void setMaxSettleDuration(int i) {
        this.LLLLLLZZ = i;
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1) {
            i = 1;
        }
        if (i != this.LLLFF) {
            this.LLLFF = i;
            this.LLLFFI = false;
            LJJIII();
        }
    }

    public void setOffscreenPageLimitEnableOpt(int i) {
        if (i < 1) {
            i = 1;
        }
        if (i != this.LLLFF) {
            this.LLLFF = i;
            this.LLLFFI = false;
            LJJII(this.LLJJIII, true);
        }
    }

    public void setOnPageSelectedInvokeListener(C0T27 c0t27) {
        this.LLJI = c0t27;
    }

    public void setOnUserDragListener(InterfaceC21604719gr interfaceC21604719gr) {
        this.LLZL = interfaceC21604719gr;
    }

    public void setOnUserSwipeUpListener(InterfaceC764760TzG interfaceC764760TzG) {
        this.LLZILL = interfaceC764760TzG;
    }

    public void setPageMargin(int i) {
        int i2 = this.LLJJL;
        this.LLJJL = i;
        int height = getHeight();
        LJJIJ(height, height, i, i2);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        boolean z;
        this.LLJJLIIIJLLLLLLLZ = drawable;
        if (drawable != null) {
            refreshDrawableState();
            z = false;
        } else {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void setPagingDownDurationOffset(int i) {
        this.LLLZLL = i;
    }

    public void setPopulateType(int i) {
        if (i != this.LLZZZIL && i >= 0 && i <= 2) {
            this.LLZZZIL = i;
        }
    }

    public void setPreDispatchTouchCallback(InterfaceC21604219gm interfaceC21604219gm) {
        this.LLIZLLLIL = interfaceC21604219gm;
    }

    public void setRenderThreadSettleEnabled(boolean z) {
        boolean z2;
        this.LLJJJJJIL = z;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setRenderThreadSettleEnabled: ");
        sbLIZ.append(z);
        sbLIZ.append(" (helperInstalled=");
        if (this.LLJJJJ != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        sbLIZ.append(z2);
        sbLIZ.append(")");
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public void setScrollState(int i) {
        boolean z;
        int i2;
        if (this.LLZIL == i) {
            return;
        }
        this.LLZIL = i;
        if (this.LLLLLL != null) {
            if (i != 0) {
                z = true;
            } else {
                z = false;
            }
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                if (z) {
                    i2 = 2;
                } else {
                    i2 = 0;
                }
                getChildAt(i3).setLayerType(i2, null);
            }
        }
        List<InterfaceC1616160s9u> list = this.LLLLLILLIL;
        if (list != null && !((CopyOnWriteArrayList) list).isEmpty()) {
            Iterator it2 = ((CopyOnWriteArrayList) this.LLLLLILLIL).iterator();
            while (it2.hasNext()) {
                ((InterfaceC469360Ias) it2.next()).onPageScrollStateChanged(i);
            }
        }
        if (i == 1) {
            C21601719gN c21601719gN = this.LLLLZIL;
            if (c21601719gN.LIZIZ()) {
                c21601719gN.LJII();
                return;
            }
            return;
        }
        if (i != 0) {
            return;
        }
        this.LLLLZIL.LIZLLL(true);
    }

    public void setScroller(Scroller scroller) {
        this.LLJJJ = scroller;
    }

    public void setSelectItemCorrector(InterfaceC1603200rp0 interfaceC1603200rp0) {
        this.LLLLLIL = interfaceC1603200rp0;
    }

    public void setSlideAngle(int i) {
        if (i > 0 && i < 90) {
            double d2 = i;
            this.LLLZIL = (float) (((double) ((float) Math.cos(Math.toRadians(d2)))) / Math.sin(Math.toRadians(d2)));
            return;
        }
        this.LLLZIL = 0.0f;
    }

    public void setSlideDownAngle(int i) {
        if (i > 0 && i < 90) {
            double d2 = i;
            this.LLLZL = (float) (((double) ((float) Math.cos(Math.toRadians(d2)))) / Math.sin(Math.toRadians(d2)));
            return;
        }
        this.LLLZL = 0.0f;
    }

    public void setmCurItem(int i) {
        this.LLJJIII = i;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.LLJJLIIIJLLLLLLLZ) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public void setPageMarginDrawable(int i) {
        setPageMarginDrawable(getContext().getResources().getDrawable(i));
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [X.19gR] */
    /* JADX WARN: Type inference failed for: r0v16, types: [X.19gS] */
    /* JADX WARN: Type inference failed for: r0v17, types: [X.0N7w] */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.19gs] */
    public VerticalViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LL = new C0S4J("VerticalViewPager");
        this.LLILLL = -1.0f;
        this.LLILZ = -1.0f;
        this.LLILZLL = false;
        this.LLIZ = false;
        this.LLIZLLLIL = null;
        this.LLJ = new Object(this) { // from class: X.19gs
            public final ViewGroup LIZ;

            {
                this.LIZ = this;
            }
        };
        this.LLJIJIL = new C21600319g9();
        this.LLJILJILJ = new ArrayList<>();
        this.LLJILLL = new C21603319gd();
        this.LLJJ = new Rect();
        this.LLJJIJI = -1;
        this.LLJJIJIIJIL = null;
        this.LLJJIJIL = null;
        this.LLJJJJJIL = false;
        this.LLJLILLLLZIIL = -3.4028235E38f;
        this.LLJLL = Float.MAX_VALUE;
        this.LLL = false;
        boolean z = true;
        this.LLLFF = 1;
        this.LLLFFI = false;
        this.LLLFZ = false;
        this.LLLI = false;
        this.LLLII = false;
        this.LLLJL = -1;
        this.LLLLJ = true;
        this.LLLLLIL = null;
        this.LLLLLILLIL = new CopyOnWriteArrayList();
        this.LLLLLLJ = new C21602319gT(this);
        this.LLLLLLL = new C1616140s9s(this);
        this.LLLLLLLZIL = 0;
        this.LLLLLLZ = false;
        this.LLLLLLZZ = 600;
        this.LLLLLZ = false;
        this.LLLLLZIL = false;
        this.LLLLLZL = false;
        this.LLLLZ = 0;
        this.LLLLZI = null;
        new ArrayList();
        this.LLLLZIL = new C21601719gN(this);
        this.LLLLZLL = 0;
        this.LLLLZLLIL = new C593510NPp<Integer>() { // from class: X.19gR
            @Override // X.C593510NPp
            public final Integer LIZIZ() {
                return Integer.valueOf((int) (this.LIZJ.LLLLIIL * ((Number) C21605819h2.LIZIZ.getValue()).floatValue()));
            }
        };
        this.LLLLZLLLI = 0;
        this.LLLZ = new C593510NPp<Integer>() { // from class: X.19gS
            @Override // X.C593510NPp
            public final Integer LIZIZ() {
                return Integer.valueOf((int) (this.LIZJ.LLLLII * ((Number) C21605819h2.LIZJ.getValue()).floatValue()));
            }
        };
        this.LLLZI = 0.0f;
        this.LLLZIIL = new C593510NPp<Float>() { // from class: X.0N7w
            @Override // X.C593510NPp
            public final Float LIZIZ() {
                return Float.valueOf(((Number) C07JY.LIZIZ.getValue()).floatValue());
            }
        };
        this.LLLZIL = 0.0f;
        this.LLLZL = 0.0f;
        this.LLLZLL = 0;
        this.LLLZLZ = true;
        this.LLLZZ = new RunnableC991380buC(this);
        this.LLLZZIL = new ARunnableS116S0100000_16(this, 143);
        this.LLZ = new ARunnableS116S0100000_16(this, 144);
        this.LLZIL = 0;
        this.LLZLI = null;
        this.LLZLL = false;
        if (!((Boolean) C21608519hT.LIZIZ.getValue()).booleanValue() && (!this.LLZLL || !((Boolean) C21608519hT.LIZ.getValue()).booleanValue())) {
            z = false;
        }
        this.LLZLLIL = z;
        this.LLZLLLL = false;
        this.LLZZ = false;
        this.LLZZJLIL = null;
        this.LLZZLLIL = false;
        LJIIZILJ();
    }

    public final C21603319gd LJI(int i, int i2) {
        C21603319gd c21603319gd = new C21603319gd();
        c21603319gd.LIZIZ = i;
        Object objLJJI = this.LLJJI.LJJI(i, this);
        if (this.LLZLLLL && (objLJJI instanceof VideoViewCellRootView)) {
            ((View) objLJJI).setBackground(null);
        }
        c21603319gd.LIZ = objLJJI;
        c21603319gd.LIZLLL = this.LLJJI.LJIL(i);
        if (i2 >= 0 && i2 < this.LLJILJILJ.size()) {
            ListProtector.add(this.LLJILJILJ, i2, c21603319gd);
            return c21603319gd;
        }
        this.LLJILJILJ.add(c21603319gd);
        return c21603319gd;
    }

    public final Rect LJIILIIL(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        Object parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            View view2 = (View) parent;
            rect.left += view2.getLeft();
            rect.right += view2.getRight();
            rect.top += view2.getTop();
            rect.bottom += view2.getBottom();
            parent = view2.getParent();
        }
        return rect;
    }

    public final void LJIJ(int i, boolean z) {
        List<InterfaceC1616160s9u> list;
        C21603319gd c21603319gd;
        C21603319gd c21603319gd2;
        Object obj;
        if (((Boolean) C283730BAd.LIZIZ.getValue()).booleanValue() && C0CFK.LIZ && this.LLZLL) {
            C312230CLt.LIZJ().remove(C0CME.SCROLL_ON_PAGE_SELECTED);
        }
        C21601719gN c21601719gN = this.LLLLZIL;
        boolean z2 = true;
        if (!c21601719gN.LJI) {
            int i2 = c21601719gN.LJIIL;
            if (i2 == -1) {
                c21601719gN.LJIIL = i;
            } else if (i2 != i) {
                c21601719gN.LJI = true;
            }
        }
        if (z && (list = this.LLLLLILLIL) != null && !((CopyOnWriteArrayList) list).isEmpty()) {
            C1616140s9s c1616140s9s = this.LLLLLLL;
            c1616140s9s.getClass();
            if (C0BSY.LIZ) {
                int i3 = 0;
                while (true) {
                    if (i3 < c1616140s9s.LIZJ.LLJILJILJ.size()) {
                        if (((C21603319gd) ListProtector.get(c1616140s9s.LIZJ.LLJILJILJ, i3)).LIZIZ == i) {
                            c21603319gd = (C21603319gd) ListProtector.get(c1616140s9s.LIZJ.LLJILJILJ, i3);
                            if (c21603319gd == null || (c21603319gd2 = c1616140s9s.LIZ) == null || (obj = c21603319gd.LIZ) != c21603319gd2.LIZ || c21603319gd.LIZIZ == c21603319gd2.LIZIZ || c1616140s9s.LIZJ.LLJJI.LJIJJ(obj) != i) {
                                break;
                            }
                            PrintStream printStream = System.out;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("VerticalViewPagercheckMultiInvokePageSelected>>>pos:");
                            sbLIZ.append(i);
                            printStream.println(C2188811AlT.LIZIZ(sbLIZ));
                        } else {
                            i3++;
                        }
                    } else {
                        c21603319gd = null;
                        break;
                    }
                }
                z2 = false;
                if (c21603319gd != null) {
                    C21603319gd c21603319gd3 = new C21603319gd();
                    c21603319gd3.LIZIZ = c21603319gd.LIZIZ;
                    c21603319gd3.LIZ = c21603319gd.LIZ;
                    c21603319gd = c21603319gd3;
                }
                c1616140s9s.LIZ = c21603319gd;
                c1616140s9s.LIZIZ = z2;
            }
            Iterator it2 = ((CopyOnWriteArrayList) this.LLLLLILLIL).iterator();
            while (it2.hasNext()) {
                ((InterfaceC1616160s9u) it2.next()).onScrollToItemStart(i);
            }
            if (this.LLJI != null) {
                int size = ((CopyOnWriteArrayList) this.LLLLLILLIL).size();
                C1604100rqS c1604100rqS = C583890MvD.LIZ;
                c1604100rqS.LJIJJLI = size;
                c1604100rqS.LIZ(EnumC1604090rqR.PAGE_SELECT_VIEWPAGER_TOTAL);
            }
            Iterator it3 = ((CopyOnWriteArrayList) this.LLLLLILLIL).iterator();
            while (it3.hasNext()) {
                ((InterfaceC469360Ias) it3.next()).onPageSelected(i);
            }
            if (this.LLJI != null) {
                C583890MvD.LIZ.LIZIZ(EnumC1604090rqR.PAGE_SELECT_VIEWPAGER_TOTAL);
            }
        }
        if (((Boolean) C283730BAd.LIZIZ.getValue()).booleanValue() && C0CFK.LIZ && this.LLZLL) {
            C312230CLt.LJIIJ(C0CME.SCROLL_ON_PAGE_SELECTED);
        }
        if (((Boolean) C2185111AfV.LIZLLL.getValue()).booleanValue() && C0CFK.LIZ && this.LLZLL) {
            C104100aN.LIZ().LJJIJL(new ARunnableS20S1000000_33("OnPageSelectedStage", 1));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x018b A[PHI: r3 r7 r16
      0x018b: PHI (r3v22 int) = (r3v11 int), (r3v20 int), (r3v21 int), (r3v24 int) binds: [B:100:0x0180, B:96:0x0164, B:88:0x0148, B:80:0x0127] A[DONT_GENERATE, DONT_INLINE]
      0x018b: PHI (r7v5 int) = (r7v4 int), (r7v3 int), (r7v3 int), (r7v7 int) binds: [B:100:0x0180, B:96:0x0164, B:88:0x0148, B:80:0x0127] A[DONT_GENERATE, DONT_INLINE]
      0x018b: PHI (r16v5 float) = (r16v2 float), (r16v3 float), (r16v4 float), (r16v1 float) binds: [B:100:0x0180, B:96:0x0164, B:88:0x0148, B:80:0x0127] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0282 A[PHI: r3 r9
      0x0282: PHI (r3v18 int) = (r3v17 int), (r3v13 int) binds: [B:162:0x0277, B:155:0x0259] A[DONT_GENERATE, DONT_INLINE]
      0x0282: PHI (r9v7 float) = (r9v6 float), (r9v2 float) binds: [B:162:0x0277, B:155:0x0259] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02c4 A[PHI: r3 r9
      0x02c4: PHI (r3v15 int) = (r3v14 int), (r3v16 int) binds: [B:175:0x02b9, B:171:0x029a] A[DONT_GENERATE, DONT_INLINE]
      0x02c4: PHI (r9v4 float) = (r9v3 float), (r9v5 float) binds: [B:175:0x02b9, B:171:0x029a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x034d A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0129  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJII(int r20, boolean r21) {
        /*
            Method dump skipped, instruction units count: 959
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.common.widget.VerticalViewPager.LJJII(int, boolean):void");
    }

    public final void LJJIJLIJ(int i, boolean z) {
        this.LLLF = false;
        LJJIL(i, z, false, 0);
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        if (this.LLLLLLLLL == 2) {
            i2 = (i - 1) - i2;
        }
        return ((C21601919gP) ((View) ListProtector.get(this.LLLLLLLLLL, i2)).getLayoutParams()).LJFF;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
        if (this.LLZLLIL && view.getParent() == this && view2 != view) {
            if (this.LLZLI == view2) {
                return;
            }
            C21603319gd c21603319gdLJIILJJIL = LJIILJJIL(view);
            if (c21603319gdLJIILJJIL != null && c21603319gdLJIILJJIL.LIZIZ != getCurrentItem()) {
                this.LLZLI = view2;
                return;
            }
        }
        this.LLZLI = null;
        super.onDescendantInvalidated(view, view2);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        View childAt;
        C21601919gP c21601919gP;
        C21601919gP c21601919gP2;
        boolean z;
        int i3;
        setMeasuredDimension(ViewGroup.getDefaultSize(0, i), ViewGroup.getDefaultSize(0, i2));
        int measuredHeight = getMeasuredHeight();
        this.LLLIILIL = Math.min(measuredHeight / 10, this.LLLIIL);
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        int paddingTop = (measuredHeight - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i4 = 0;
        while (true) {
            boolean z2 = true;
            int i5 = 1073741824;
            if (i4 >= childCount) {
                break;
            }
            childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8 && (c21601919gP2 = (C21601919gP) childAt.getLayoutParams()) != null && c21601919gP2.LIZ) {
                int i6 = c21601919gP2.LIZIZ;
                int i7 = i6 & 7;
                int i8 = i6 & 112;
                if (i8 != 48 && i8 != 80) {
                    z = false;
                } else {
                    z = true;
                }
                if (i7 != 3 && i7 != 5) {
                    z2 = false;
                }
                int i9 = Integer.MIN_VALUE;
                if (z) {
                    i3 = 1073741824;
                } else {
                    i3 = Integer.MIN_VALUE;
                    if (z2) {
                        i9 = 1073741824;
                    }
                }
                int i10 = ((ViewGroup.LayoutParams) c21601919gP2).width;
                if (i10 != -2) {
                    if (i10 == -1) {
                        i10 = measuredWidth;
                    }
                    i3 = 1073741824;
                } else {
                    i10 = measuredWidth;
                }
                int i11 = ((ViewGroup.LayoutParams) c21601919gP2).height;
                if (i11 != -2) {
                    if (i11 == -1) {
                        i11 = paddingTop;
                    }
                } else {
                    i11 = paddingTop;
                    i5 = i9;
                }
                try {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i10, i3), View.MeasureSpec.makeMeasureSpec(i11, i5));
                    if (z) {
                        paddingTop -= childAt.getMeasuredHeight();
                    } else if (z2) {
                        measuredWidth -= childAt.getMeasuredWidth();
                    }
                } finally {
                }
            }
            i4++;
        }
        this.LLJLLIL = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        View.MeasureSpec.makeMeasureSpec(paddingTop, 1073741824);
        this.LLJLLL = true;
        LJJIII();
        this.LLJLLL = false;
        int childCount2 = getChildCount();
        for (int i12 = 0; i12 < childCount2; i12++) {
            childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8 && ((c21601919gP = (C21601919gP) childAt.getLayoutParams()) == null || !c21601919gP.LIZ)) {
                try {
                    childAt.measure(this.LLJLLIL, View.MeasureSpec.makeMeasureSpec((int) (paddingTop * c21601919gP.LIZJ), 1073741824));
                } finally {
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3;
        C21603319gd c21603319gdLJIILJJIL;
        int childCount = getChildCount();
        if ((i & 2) != 0) {
            i2 = 0;
            i3 = 1;
        } else {
            i2 = childCount - 1;
            childCount = -1;
            i3 = -1;
        }
        while (i2 != childCount) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (c21603319gdLJIILJJIL = LJIILJJIL(childAt)) != null && c21603319gdLJIILJJIL.LIZIZ == this.LLJJIII && childAt.requestFocus(i, rect)) {
                return true;
            }
            i2 += i3;
        }
        return false;
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        super.scrollTo(i, i2);
    }

    public final void LJIIIIZZ(C21603319gd c21603319gd, int i, C21603319gd c21603319gd2) {
        int count;
        float f2;
        float f3;
        float f4;
        int i2;
        int i3;
        C21603319gd c21603319gd3;
        C21603319gd c21603319gd4;
        PagerAdapter pagerAdapter = this.LLJJI;
        int i4 = 0;
        if (pagerAdapter != null) {
            count = pagerAdapter.getCount();
        } else {
            count = 0;
        }
        int clientHeight = getClientHeight();
        if (clientHeight > 0) {
            f2 = this.LLJJL / clientHeight;
        } else {
            f2 = 0.0f;
        }
        if (c21603319gd2 != null) {
            int i5 = c21603319gd2.LIZIZ;
            int i6 = c21603319gd.LIZIZ;
            if (i5 < i6) {
                float fLJIL = c21603319gd2.LJ + c21603319gd2.LIZLLL + f2;
                while (true) {
                    i5++;
                    if (i5 > c21603319gd.LIZIZ || i4 >= this.LLJILJILJ.size()) {
                        break;
                    }
                    Object obj = ListProtector.get(this.LLJILJILJ, i4);
                    while (true) {
                        c21603319gd4 = (C21603319gd) obj;
                        if (i5 <= c21603319gd4.LIZIZ || i4 >= this.LLJILJILJ.size() - 1) {
                            break;
                        }
                        i4++;
                        obj = ListProtector.get(this.LLJILJILJ, i4);
                    }
                    while (i5 < c21603319gd4.LIZIZ) {
                        fLJIL += this.LLJJI.LJIL(i5) + f2;
                        i5++;
                    }
                    c21603319gd4.LJ = fLJIL;
                    fLJIL += c21603319gd4.LIZLLL + f2;
                }
            } else if (i5 > i6) {
                int size = this.LLJILJILJ.size() - 1;
                float fLJIL2 = c21603319gd2.LJ;
                while (true) {
                    i5--;
                    if (i5 < c21603319gd.LIZIZ || size < 0) {
                        break;
                    }
                    Object obj2 = ListProtector.get(this.LLJILJILJ, size);
                    while (true) {
                        c21603319gd3 = (C21603319gd) obj2;
                        if (i5 >= c21603319gd3.LIZIZ || size <= 0) {
                            break;
                        }
                        size--;
                        obj2 = ListProtector.get(this.LLJILJILJ, size);
                    }
                    while (i5 > c21603319gd3.LIZIZ) {
                        fLJIL2 -= this.LLJJI.LJIL(i5) + f2;
                        i5--;
                    }
                    fLJIL2 -= c21603319gd3.LIZLLL + f2;
                    c21603319gd3.LJ = fLJIL2;
                }
            }
        }
        int size2 = this.LLJILJILJ.size();
        float fLJIL3 = c21603319gd.LJ;
        int i7 = c21603319gd.LIZIZ;
        int i8 = i7 - 1;
        if (i7 == 0) {
            f3 = fLJIL3;
        } else {
            f3 = -3.4028235E38f;
        }
        this.LLJLILLLLZIIL = f3;
        int i9 = count - 1;
        if (i7 == i9) {
            f4 = (c21603319gd.LIZLLL + fLJIL3) - 1.0f;
        } else {
            f4 = Float.MAX_VALUE;
        }
        this.LLJLL = f4;
        int i10 = i - 1;
        while (i10 >= 0) {
            C21603319gd c21603319gd5 = (C21603319gd) ListProtector.get(this.LLJILJILJ, i10);
            while (true) {
                i3 = c21603319gd5.LIZIZ;
                if (i8 <= i3) {
                    break;
                }
                fLJIL3 -= this.LLJJI.LJIL(i8) + f2;
                i8--;
            }
            fLJIL3 -= c21603319gd5.LIZLLL + f2;
            c21603319gd5.LJ = fLJIL3;
            if (i3 == 0) {
                this.LLJLILLLLZIIL = fLJIL3;
            }
            i10--;
            i8--;
        }
        float fLJIL4 = c21603319gd.LJ + c21603319gd.LIZLLL + f2;
        int i11 = c21603319gd.LIZIZ + 1;
        int i12 = i + 1;
        while (i12 < size2) {
            C21603319gd c21603319gd6 = (C21603319gd) ListProtector.get(this.LLJILJILJ, i12);
            while (true) {
                i2 = c21603319gd6.LIZIZ;
                if (i11 >= i2) {
                    break;
                }
                fLJIL4 += this.LLJJI.LJIL(i11) + f2;
                i11++;
            }
            if (i2 == i9) {
                this.LLJLL = (c21603319gd6.LIZLLL + fLJIL4) - 1.0f;
            }
            c21603319gd6.LJ = fLJIL4;
            fLJIL4 += c21603319gd6.LIZLLL + f2;
            i12++;
            i11++;
        }
    }

    public final void LJIJJLI(float f2, int i, int i2) {
        List<InterfaceC1616160s9u> list = this.LLLLLILLIL;
        if (list != null && !list.isEmpty()) {
            Iterator<InterfaceC1616160s9u> it2 = this.LLLLLILLIL.iterator();
            while (it2.hasNext()) {
                it2.next().onPageScrolled(i, f2, i2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIL(final int r12, final float r13, final int r14) {
        /*
            r11 = this;
            int r0 = r11.LLLLL
            r4 = 2
            r6 = 0
            if (r0 <= 0) goto L6c
            int r10 = r11.getScrollY()
            int r7 = r11.getPaddingTop()
            int r9 = r11.getPaddingBottom()
            int r8 = r11.getHeight()
            int r5 = r11.getChildCount()
            r3 = 0
        L1b:
            if (r3 >= r5) goto L6c
            android.view.View r2 = r11.getChildAt(r3)
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            X.19gP r1 = (X.C21601919gP) r1
            boolean r0 = r1.LIZ
            if (r0 == 0) goto L48
            int r0 = r1.LIZIZ
            r1 = r0 & 112(0x70, float:1.57E-43)
            r0 = 16
            if (r1 == r0) goto L5e
            r0 = 48
            if (r1 == r0) goto L58
            r0 = 80
            if (r1 == r0) goto L4b
            r0 = r7
        L3c:
            int r7 = r7 + r10
            int r1 = r2.getTop()
            int r7 = r7 - r1
            if (r7 == 0) goto L47
            r2.offsetTopAndBottom(r7)
        L47:
            r7 = r0
        L48:
            int r3 = r3 + 1
            goto L1b
        L4b:
            int r1 = r8 - r9
            int r0 = r2.getMeasuredHeight()
            int r1 = r1 - r0
            int r0 = r2.getMeasuredHeight()
            int r9 = r9 + r0
            goto L69
        L58:
            int r0 = r2.getHeight()
            int r0 = r0 + r7
            goto L3c
        L5e:
            int r0 = r2.getMeasuredHeight()
            int r0 = r8 - r0
            int r0 = r0 / r4
            int r1 = java.lang.Math.max(r0, r7)
        L69:
            r0 = r7
            r7 = r1
            goto L3c
        L6c:
            int r0 = X.C2514209tE.LIZ
            r5 = 1
            if (r0 != r4) goto Lb8
            android.os.Handler r1 = r11.getMainHander()
            X.0buB r0 = new X.0buB
            r0.<init>()
            android.os.Message r1 = android.os.Message.obtain(r1, r0)
            r1.setAsynchronous(r5)
            android.os.Handler r0 = r11.getMainHander()
            X.C786410Ut5.LJLJJLL(r0, r1)
        L88:
            X.15D7 r0 = r11.LLLLLL
            if (r0 == 0) goto Lbc
            int r4 = r11.getScrollY()
            int r3 = r11.getChildCount()
        L94:
            if (r6 >= r3) goto Lbc
            android.view.View r2 = r11.getChildAt(r6)
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            X.19gP r0 = (X.C21601919gP) r0
            boolean r0 = r0.LIZ
            if (r0 != 0) goto Lb5
            int r0 = r2.getTop()
            int r0 = r0 - r4
            float r1 = (float) r0
            int r0 = r11.getClientHeight()
            float r0 = (float) r0
            float r1 = r1 / r0
            X.15D7 r0 = r11.LLLLLL
            r0.LIZ(r2, r1)
        Lb5:
            int r6 = r6 + 1
            goto L94
        Lb8:
            r11.LJIJJLI(r13, r12, r14)
            goto L88
        Lbc:
            r11.LLLLJI = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.common.widget.VerticalViewPager.LJIL(int, float, int):void");
    }

    public final void LJJIJIL(int i, int i2, int i3) {
        InterfaceC764760TzG interfaceC764760TzG;
        if (i > i2 && (interfaceC764760TzG = this.LLZILL) != null) {
            ((C20291214aU) interfaceC764760TzG).LIZIZ();
        }
        LJJIL(i, true, true, i3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        C21603319gd c21603319gdLJIILJJIL;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0 && (c21603319gdLJIILJJIL = LJIILJJIL(childAt)) != null && c21603319gdLJIILJJIL.LIZIZ == this.LLJJIII) {
                    childAt.addFocusables(arrayList, i, i2);
                }
            }
            if (descendantFocusability == 262144 && size != arrayList.size()) {
                return;
            }
        }
        if (!isFocusable()) {
            return;
        }
        if ((i2 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
            return;
        }
        arrayList.add(this);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        C21601919gP c21601919gP = (C21601919gP) layoutParams;
        boolean z = c21601919gP.LIZ;
        c21601919gP.LIZ = z;
        if (this.LLJLLL) {
            if (!z) {
                c21601919gP.LIZLLL = true;
                addViewInLayout(view, i, layoutParams);
            } else {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
        } else {
            super.addView(view, i, layoutParams);
        }
        if (((Boolean) C21606019h4.LIZIZ.getValue()).booleanValue() && this.LLLLZIL.LJIILIIL != null && C0CN5.LJII()) {
            this.LLLLZIL.LJI = true;
        }
        C21601719gN c21601719gN = this.LLLLZIL;
        if (c21601719gN.LIZIZ()) {
            if (c21601719gN.LJIIIZ == EnumC21602519gV.NOT_OPT) {
                c21601719gN.LJIIIZ = EnumC21602519gV.WAIT_OPT;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LJIIL(int r6, float r7, int r8, int r9) {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.common.widget.VerticalViewPager.LJIIL(int, float, int, int):int");
    }

    public final void LJJIJ(int i, int i2, int i3, int i4) {
        float fMin;
        C21603319gd c21603319gdLJIILL;
        boolean z = false;
        if (i2 > 0 && !this.LLJILJILJ.isEmpty()) {
            if (!this.LLJJJ.isFinished()) {
                int clientHeight = getClientHeight();
                SettingsManager.LIZLLL().getClass();
                if (SettingsManager.LIZIZ("recommend_fix_splash_bug", 1.5d) > 0.0d) {
                    z = true;
                }
                if (z) {
                    int finalY = this.LLJJJ.getFinalY() / i2;
                    int i5 = finalY * clientHeight;
                    C21603319gd c21603319gdLJIILL2 = LJIILL(this.LLJJIII);
                    if (c21603319gdLJIILL2 != null) {
                        int i6 = (int) (c21603319gdLJIILL2.LJ * clientHeight);
                        C2276411E8h c2276411E8h = C2276411E8h.LIZIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("use itemInfo to calculate final y after = ");
                        sbLIZ.append(i6);
                        sbLIZ.append(" before= ");
                        sbLIZ.append(i5);
                        c2276411E8h.LIZJ("common_feed", 4, "VerticalViewPager_YCH", C2188811AlT.LIZIZ(sbLIZ));
                        i5 = i6;
                    }
                    C2276411E8h c2276411E8h2 = C2276411E8h.LIZIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("getCurItem = ");
                    sbLIZ2.append(getCurrentItem());
                    sbLIZ2.append("current scroll y = ");
                    sbLIZ2.append(getScrollY());
                    sbLIZ2.append("finalY = ");
                    sbLIZ2.append(getClientHeight() * getCurrentItem());
                    sbLIZ2.append("trueCount = ");
                    sbLIZ2.append(finalY);
                    sbLIZ2.append("newY = ");
                    sbLIZ2.append(i5);
                    c2276411E8h2.LIZJ("common_feed", 4, "VerticalViewPager_YCH", C2188811AlT.LIZIZ(sbLIZ2));
                    this.LLJJJ.setFinalY(i5);
                    return;
                }
                C2276411E8h.LIZIZ.LIZJ("common_feed", 4, "VerticalViewPager", "use origin logic");
                this.LLJJJ.setFinalY(getCurrentItem() * clientHeight);
                return;
            }
            int scrollY = (int) ((getScrollY() / (((i2 - getPaddingTop()) - getPaddingBottom()) + i4)) * (((i - getPaddingTop()) - getPaddingBottom()) + i3));
            if (this.LLZIL == 0 && (c21603319gdLJIILL = LJIILL(this.LLJJIII)) != null) {
                scrollY = (int) (c21603319gdLJIILL.LJ * getClientHeight());
            }
            scrollTo(getScrollX(), scrollY);
            return;
        }
        C21603319gd c21603319gdLJIILL3 = LJIILL(this.LLJJIII);
        if (c21603319gdLJIILL3 != null) {
            fMin = Math.min(c21603319gdLJIILL3.LJ, this.LLJLL);
        } else {
            fMin = 0.0f;
        }
        int paddingTop = (int) (fMin * ((i - getPaddingTop()) - getPaddingBottom()));
        if (paddingTop == getScrollY()) {
            return;
        }
        LJIIJ(false);
        scrollTo(getScrollX(), paddingTop);
    }

    public final void LJJIJL(int i, boolean z, int i2, boolean z2) {
        int clientHeight;
        int scrollY;
        float fLJIL;
        int iAbs;
        boolean zBooleanValue;
        List<InterfaceC1616160s9u> list;
        C21603319gd c21603319gdLJIILL = LJIILL(i);
        C2207291BaB.LIZIZ(C1ET4.TT_FEED_SCROLL, ((Number) C269830Ahp.LIZ.getValue()).intValue());
        if (c21603319gdLJIILL != null) {
            clientHeight = (int) (getClientHeight() * Math.max(this.LLJLILLLLZIIL, Math.min(c21603319gdLJIILL.LJ, this.LLJLL)));
        } else {
            clientHeight = 0;
        }
        if (z2 && (list = this.LLLLLILLIL) != null) {
            ((CopyOnWriteArrayList) list).isEmpty();
        }
        if (z) {
            if (getChildCount() == 0) {
                setScrollingCacheEnabled(false);
            } else {
                Scroller scroller = this.LLJJJ;
                boolean z3 = true;
                if (scroller != null && !scroller.isFinished()) {
                    if (this.LLJJJIL) {
                        scrollY = this.LLJJJ.getCurrY();
                    } else {
                        scrollY = this.LLJJJ.getStartY();
                    }
                    this.LLJJJ.abortAnimation();
                    setScrollingCacheEnabled(false);
                } else {
                    scrollY = getScrollY();
                }
                int scrollX = getScrollX();
                int i3 = -scrollX;
                int i4 = clientHeight - scrollY;
                if (i3 == 0 && i4 == 0) {
                    LJIIJ(false);
                    LJJIII();
                    setScrollState(0);
                } else {
                    setScrollingCacheEnabled(true);
                    setScrollState(2);
                    int clientHeight2 = getClientHeight();
                    float f2 = clientHeight2;
                    float f3 = clientHeight2 / 2;
                    float fSin = f3 + (((float) Math.sin((float) (((double) (Math.min(1.0f, (Math.abs(i3) * 1.0f) / f2) - 0.5f)) * 0.4712389167638204d))) * f3);
                    if (i4 <= 0 || !z2) {
                        z3 = false;
                    }
                    int iAbs2 = Math.abs(i2);
                    if (iAbs2 > 0) {
                        iAbs = Math.round(Math.abs(fSin / iAbs2) * 1000.0f) * 4;
                    } else {
                        PagerAdapter pagerAdapter = this.LLJJI;
                        if (pagerAdapter != null) {
                            fLJIL = pagerAdapter.LJIL(this.LLJJIII);
                        } else {
                            fLJIL = 1.0f;
                        }
                        iAbs = (int) (((Math.abs(i3) / ((f2 * fLJIL) + this.LLJJL)) + 1.0f) * 100.0f);
                    }
                    int iMin = Math.min(iAbs, this.LLLLLLZZ);
                    this.LLJJJIL = false;
                    if (((Boolean) C303340Bum.LIZJ.getValue()).booleanValue()) {
                        Boolean bool = C20596515id.LIZIZ;
                        if (bool != null) {
                            zBooleanValue = bool.booleanValue();
                        } else {
                            zBooleanValue = ((Boolean) C20596515id.LIZ.getValue()).booleanValue();
                        }
                        if (zBooleanValue) {
                            iMin = ((Boolean) C1239904tB.LIZIZ.getValue()).booleanValue() ? ((Number) C1239904tB.LIZ.getValue()).intValue() : ((Number) C303340Bum.LIZIZ.getValue()).intValue();
                        }
                    }
                    if (this.LLLLLZ) {
                        iMin = 500;
                    }
                    if (this.LLLLLZIL) {
                        iMin = 400;
                    }
                    if (z3) {
                        iMin = Math.max(iMin + this.LLLZLL, 50);
                    }
                    this.LLJJJ.startScroll(scrollX, scrollY, i3, i4, iMin);
                    postInvalidateOnAnimation();
                }
            }
            if (LJIJJ()) {
                C20639086r.LIZLLL(new ARunnableS2S0111000_16(this, i, z2, 0));
                return;
            } else {
                LJIJ(i, z2);
                return;
            }
        }
        if (LJIJJ()) {
            C20639086r.LIZLLL(new ARunnableS2S0111000_16(this, i, z2, 1));
        } else {
            LJIJ(i, z2);
        }
        LJIIJ(false);
        scrollTo(0, clientHeight);
        LJJI(clientHeight);
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x016f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x018f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIL(int r10, boolean r11, boolean r12, int r13) {
        /*
            Method dump skipped, instruction units count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.common.widget.VerticalViewPager.LJJIL(int, boolean, boolean, int):void");
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i2 != i4) {
            int i5 = this.LLJJL;
            LJJIJ(i2, i4, i5, i5);
        }
    }

    public final boolean LJIIIZ(View view, boolean z, int i, int i2, int i3) {
        int i4;
        int i5;
        if (view instanceof InterfaceC1003820cEG) {
            return false;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if ((!C2515109tN.LIZ || childAt.getVisibility() == 0) && (i4 = i3 + scrollY) >= childAt.getTop() && i4 < childAt.getBottom() && (i5 = i2 + scrollX) >= childAt.getLeft() && i5 < childAt.getRight() && LJIIIZ(childAt, true, i, i5 - childAt.getLeft(), i4 - childAt.getTop())) {
                    return true;
                }
            }
        }
        if (!z || !view.canScrollVertically(-i)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0081  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onLayout(boolean r18, int r19, int r20, int r21, int r22) {
        /*
            Method dump skipped, instruction units count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.common.widget.VerticalViewPager.onLayout(boolean, int, int, int, int):void");
    }

    public final void LJJIZ(float f2, float f3, float f4, float f5, long j, long j2) {
        try {
            if (this.LLZZJLIL == null) {
                this.LLZZJLIL = new JSONObject();
            }
            this.LLZZJLIL.put("downX", f2);
            this.LLZZJLIL.put("downY", f3);
            this.LLZZJLIL.put("upX", f4);
            this.LLZZJLIL.put("upY", f5);
            this.LLZZJLIL.put("downTimeMs", j);
            this.LLZZJLIL.put("upTimeMs", j2);
        } catch (JSONException e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
    }
}
