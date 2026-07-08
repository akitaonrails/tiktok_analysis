package com.ss.android.ugc.aweme.feed.ui.seekbar;

import X.C01GW;
import X.C0COM;
import X.C0GRU;
import X.C0RGG;
import X.C1211700hdY;
import X.C12P2;
import X.C1619870sFt;
import X.C1619880sFu;
import X.C1621020sHk;
import X.C19749612Ow;
import X.C1A5L;
import X.C2188811AlT;
import X.C2271381DvM;
import X.C2271391DvN;
import X.C2516409ta;
import X.C306000Bz4;
import X.C418440Gaw;
import X.C444960Hcc;
import X.C452501pT;
import X.C586380MzE;
import X.C586640Mze;
import X.C736120SuA;
import X.C814420VxA;
import X.EnumC736040Su2;
import X.ViewOnTouchListenerC710420Rto;
import android.content.Context;
import android.graphics.Rect;
import android.os.Message;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes25.dex */
public final class VideoSeekBarMaskView extends FrameLayout {
    public C12P2 LL;
    public C19749612Ow LLILLJJLI;
    public C1211700hdY LLILLL;
    public Rect LLILZ;
    public boolean LLILZIL;
    public float LLILZLL;
    public float LLIZ;
    public float LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;
    public int LLJIJIL;
    public float LLJILJIL;
    public boolean LLJILJILJ;
    public final C586640Mze LLJILLL;
    public final boolean LLJJ;
    public final boolean LLJJI;
    public final boolean LLJJIII;
    public boolean LLJJIJI;
    public C1619880sFu LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public GestureDetector LLJJJ;

    private final ViewOnTouchListenerC710420Rto getImmersiveClearModeTouchDelegate() {
        return (ViewOnTouchListenerC710420Rto) this.LLJJIJIL.getValue();
    }

    public final C1211700hdY getController() {
        return this.LLILLL;
    }

    public final boolean getDisableSeekTouch() {
        return this.LLJILJILJ;
    }

    public final float getLastDownRawX() {
        return this.LLILZLL;
    }

    public final float getLastDownRawY() {
        return this.LLIZLLLIL;
    }

    public final float getLastMoveRawX() {
        return this.LLIZ;
    }

    public final float getMoveDx() {
        return this.LLJILJIL;
    }

    public final C19749612Ow getMutableSeekBar() {
        return this.LLILLJJLI;
    }

    public final boolean getNeedHandleImmersiveClearMode() {
        return this.LLJI;
    }

    public final boolean getNeedHandleMove() {
        return this.LLJ;
    }

    public final Rect getSeekBarRect() {
        return this.LLILZ;
    }

    public final int getTouchSlop() {
        return this.LLJIJIL;
    }

    public final C12P2 getVideoSeekBar() {
        return this.LL;
    }

    public VideoSeekBarMaskView(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        String eventType;
        if (this.LLJJ && this.LLILZIL) {
            return true;
        }
        if (this.LLJJI) {
            C01GW<C0RGG> c01gw = C0RGG.LJ;
            C0RGG c0rggLIZ = C586380MzE.LIZ();
            C1211700hdY c1211700hdY = this.LLILLL;
            if (c1211700hdY != null) {
                eventType = c1211700hdY.getEventType();
            } else {
                eventType = null;
            }
            if (c0rggLIZ.LIZIZ(eventType)) {
                return true;
            }
        }
        return super.canScrollHorizontally(i);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            if (getChildAt(i2).canScrollVertically(i)) {
                return true;
            }
        }
        return super.canScrollVertically(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int bottom;
        boolean zLJI = MethodIDManager.LJI(199028);
        if (motionEvent == null) {
            boolean zDispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
            if (zLJI) {
                MethodIDManager.LJ();
            }
            return zDispatchTouchEvent;
        }
        C1619880sFu c1619880sFu = this.LLJJIJIIJIL;
        boolean zDispatchTouchEvent2 = true;
        if (c1619880sFu != null && c1619880sFu.LIZ()) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    if (c1619880sFu.LIZIZ.aW1()) {
                        c1619880sFu.LIZIZ.wi(false);
                    }
                    c1619880sFu.LJIIZILJ.removeMessages(1);
                    Function0<Unit> function0 = c1619880sFu.LJIILIIL;
                    if (function0 != null) {
                        function0.invoke();
                    }
                    c1619880sFu.LJIIL = false;
                    c1619880sFu.LJIILIIL = null;
                }
            } else {
                c1619880sFu.LIZLLL();
                C736120SuA c736120SuA = C736120SuA.LIZ;
                float x = motionEvent.getX();
                int width = c1619880sFu.LIZ.getWidth();
                c736120SuA.getClass();
                if (C736120SuA.LIZ(x, width, null) != EnumC736040Su2.INVALID_ZONE) {
                    float y = motionEvent.getY();
                    C0GRU c0gru = c1619880sFu.LJ;
                    if (c0gru != null) {
                        bottom = c0gru.getBottom();
                    } else {
                        bottom = Integer.MAX_VALUE;
                    }
                    if (y < bottom) {
                        Message messageObtain = Message.obtain();
                        messageObtain.what = 1;
                        messageObtain.obj = motionEvent;
                        c1619880sFu.LJIIZILJ.sendMessageDelayed(messageObtain, 300L);
                    }
                }
            }
        } else {
            zDispatchTouchEvent2 = super.dispatchTouchEvent(motionEvent);
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
        return zDispatchTouchEvent2;
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0186  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r14) {
        /*
            Method dump skipped, instruction units count: 584
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.ui.seekbar.VideoSeekBarMaskView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            r0 = 72067(0x11983, float:1.00987E-40)
            boolean r6 = com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJI(r0)
            boolean r0 = r7.LLJJ
            r4 = 3
            r5 = 2
            r3 = 1
            r2 = 0
            if (r0 == 0) goto L19
            X.12P2 r0 = r7.LL
            if (r0 == 0) goto L2b
            int r0 = r0.getSeekBarShowType()
            if (r0 != r4) goto L2b
        L19:
            if (r8 == 0) goto L38
            int r0 = r8.getAction()
            if (r0 != r5) goto L31
            boolean r0 = super.onTouchEvent(r8)
            if (r6 == 0) goto L2a
            com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()
        L2a:
            return r0
        L2b:
            boolean r0 = r7.LLJILJILJ
            if (r0 != 0) goto L19
            if (r8 == 0) goto L38
        L31:
            android.view.GestureDetector r0 = r7.LLJJJ
            if (r0 == 0) goto L38
            r0.onTouchEvent(r8)
        L38:
            X.0sFu r0 = r7.LLJJIJIIJIL
            if (r0 == 0) goto L4c
            boolean r0 = r0.LIZ()
            if (r0 != r3) goto L4c
            boolean r0 = super.onTouchEvent(r8)
            if (r6 == 0) goto L4b
            com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()
        L4b:
            return r0
        L4c:
            if (r8 == 0) goto L97
            int r0 = r8.getAction()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            if (r1 == 0) goto L97
            int r0 = r1.intValue()
            if (r0 != r5) goto La1
            float r4 = r8.getRawX()
            float r0 = r7.LLIZ
            float r4 = r4 - r0
            boolean r0 = r7.LLJJIJI
            if (r0 == 0) goto L6a
            float r4 = -r4
        L6a:
            float r1 = r8.getRawX()
            float r0 = r7.LLILZLL
            float r1 = r1 - r0
            boolean r0 = r7.LLJJI
            if (r0 == 0) goto L79
            boolean r0 = r7.LLJI
            if (r0 != 0) goto L97
        L79:
            float r1 = java.lang.Math.abs(r1)
            int r0 = r7.LLJIJIL
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L88
            boolean r0 = r7.LLJ
            if (r0 == 0) goto L97
        L88:
            X.0hdY r0 = r7.LLILLL
            if (r0 == 0) goto L8f
            r0.LIZ(r4, r2)
        L8f:
            r7.LLJ = r3
            float r0 = r8.getRawX()
            r7.LLIZ = r0
        L97:
            boolean r0 = super.onTouchEvent(r8)
            if (r6 == 0) goto La0
            com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()
        La0:
            return r0
        La1:
            int r0 = r1.intValue()
            if (r0 == r3) goto Lad
            int r0 = r1.intValue()
            if (r0 != r4) goto L97
        Lad:
            boolean r0 = r7.LLJ
            if (r0 == 0) goto Lb9
            X.0hdY r1 = r7.LLILLL
            if (r1 == 0) goto Lb9
            r0 = 0
            r1.LIZ(r0, r3)
        Lb9:
            r7.LLILZIL = r2
            r7.LLJ = r2
            r7.LLJI = r2
            goto L97
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.ui.seekbar.VideoSeekBarMaskView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setController(C1211700hdY c1211700hdY) {
        this.LLILLL = c1211700hdY;
    }

    public final void setDisableSeekTouch(boolean z) {
        this.LLJILJILJ = z;
    }

    public final void setDownInRect(boolean z) {
        this.LLILZIL = z;
    }

    public final void setLastDownRawX(float f) {
        this.LLILZLL = f;
    }

    public final void setLastDownRawY(float f) {
        this.LLIZLLLIL = f;
    }

    public final void setLastMoveRawX(float f) {
        this.LLIZ = f;
    }

    public final void setMoveDx(float f) {
        this.LLJILJIL = f;
    }

    public final void setMutableSeekBar(C19749612Ow c19749612Ow) {
        this.LLILLJJLI = c19749612Ow;
    }

    public final void setNeedHandleImmersiveClearMode(boolean z) {
        this.LLJI = z;
    }

    public final void setNeedHandleMove(boolean z) {
        this.LLJ = z;
    }

    public final void setRTL(boolean z) {
        this.LLJJIJI = z;
    }

    public final void setSeekBarController(C1211700hdY c1211700hdY) {
        this.LLILLL = c1211700hdY;
    }

    public final void setSeekBarRect(Rect rect) {
        this.LLILZ = rect;
    }

    public final void setSeekBarView(C12P2 c12p2) {
        C19749612Ow mutableSeekBar;
        this.LL = c12p2;
        if (c12p2 != null) {
            mutableSeekBar = c12p2.getMutableSeekBar();
        } else {
            mutableSeekBar = null;
        }
        this.LLILLJJLI = mutableSeekBar;
        this.LLJJIJI = C444960Hcc.LIZIZ();
        C586640Mze c586640Mze = this.LLJILLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("seekbar init, is touch area open: ");
        sbLIZ.append(this.LLJJ);
        sbLIZ.append(", ");
        c586640Mze.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
        if (this.LLJJI) {
            this.LLJJJ = new GestureDetector(getContext(), new C1621020sHk(this, 0));
        }
    }

    public final void setTouchSlop(int i) {
        this.LLJIJIL = i;
    }

    public final void setVerticalMargin(boolean z) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i;
        C12P2 c12p2 = this.LL;
        ViewGroup.LayoutParams layoutParams = null;
        if (c12p2 != null) {
            layoutParams = c12p2.getLayoutParams();
        }
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            if (z) {
                i = 0;
            } else {
                i = 36;
            }
            marginLayoutParams.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i)));
        }
        C12P2 c12p22 = this.LL;
        if (c12p22 != null) {
            c12p22.invalidate();
        }
        C12P2 c12p23 = this.LL;
        if (c12p23 != null) {
            c12p23.requestLayout();
        }
    }

    public final void setVideoSeekBar(C12P2 c12p2) {
        this.LL = c12p2;
    }

    public VideoSeekBarMaskView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLJILLL = new C586640Mze("VideoSeekBarMaskView");
        this.LLJJ = ((Boolean) C306000Bz4.LIZ.getValue()).booleanValue();
        this.LLJJI = C0COM.LIZ();
        this.LLJJIII = C2516409ta.LIZ;
        this.LLJJIJIL = C452501pT.LIZIZ(new C1619870sFt());
        this.LLJIJIL = ViewConfiguration.get(context).getScaledTouchSlop();
        C2271391DvN.LIZ(this, (C1A5L) C2271381DvM.LJJII.getValue());
    }
}
