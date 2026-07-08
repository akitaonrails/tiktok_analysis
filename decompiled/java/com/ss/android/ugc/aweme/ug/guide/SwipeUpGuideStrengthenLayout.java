package com.ss.android.ugc.aweme.ug.guide;

import X.C1AF0;
import X.C21311118ab;
import X.C2188811AlT;
import X.C849850XVn;
import X.InterfaceC1368705Xh;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.common.widget.VerticalViewPager;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes13.dex */
public final class SwipeUpGuideStrengthenLayout extends C21311118ab {
    public float LL;
    public float LLILLJJLI;
    public InterfaceC1368705Xh LLILLL;
    public final float LLILZ;
    public float LLILZIL;
    public Function1<? super String, Unit> LLILZLL;

    public SwipeUpGuideStrengthenLayout(Context context) {
        this(context, null, 6, 0);
    }

    public SwipeUpGuideStrengthenLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    public final float getDensity() {
        return this.LLILZ;
    }

    public final float getDisAmount() {
        return this.LLILZIL;
    }

    public final Function1<String, Unit> getFallBackRunnable() {
        return this.LLILZLL;
    }

    public final float getPreviousY() {
        return this.LLILLJJLI;
    }

    public final InterfaceC1368705Xh getViewPager() {
        return this.LLILLL;
    }

    public final float getYDown() {
        return this.LL;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        VerticalViewPager verticalViewPager;
        Function1<? super String, Unit> function1;
        InterfaceC1368705Xh interfaceC1368705Xh;
        InterfaceC1368705Xh interfaceC1368705Xh2;
        InterfaceC1368705Xh interfaceC1368705Xh3;
        InterfaceC1368705Xh interfaceC1368705Xh4;
        if (motionEvent != null) {
            try {
                int action = motionEvent.getAction();
                if (action != 0) {
                    if (action != 1) {
                        if (action != 2) {
                            if (action == 3 && (interfaceC1368705Xh3 = this.LLILLL) != null && interfaceC1368705Xh3.LLLLLZL() && (interfaceC1368705Xh4 = this.LLILLL) != null) {
                                interfaceC1368705Xh4.LLLLZI();
                                return true;
                            }
                        } else {
                            float y = motionEvent.getY() - this.LLILLJJLI;
                            this.LLILLJJLI = motionEvent.getY();
                            if (y < 0.0f || this.LLILZIL < 0.0f) {
                                InterfaceC1368705Xh interfaceC1368705Xh5 = this.LLILLL;
                                if (interfaceC1368705Xh5 != null && !interfaceC1368705Xh5.LLLLLZL() && (interfaceC1368705Xh2 = this.LLILLL) != null) {
                                    interfaceC1368705Xh2.LLLLZ();
                                }
                                InterfaceC1368705Xh interfaceC1368705Xh6 = this.LLILLL;
                                if (interfaceC1368705Xh6 != null) {
                                    interfaceC1368705Xh6.LLLLZIL(y);
                                }
                                this.LLILZIL += y;
                                return true;
                            }
                        }
                    } else {
                        InterfaceC1368705Xh interfaceC1368705Xh7 = this.LLILLL;
                        if (interfaceC1368705Xh7 != null && interfaceC1368705Xh7.LLLLLZL() && (interfaceC1368705Xh = this.LLILLL) != null) {
                            interfaceC1368705Xh.LLLLZI();
                        }
                        this.LL = 0.0f;
                        this.LLILZIL = 0.0f;
                        InterfaceC1368705Xh interfaceC1368705Xh8 = this.LLILLL;
                        if ((interfaceC1368705Xh8 instanceof VerticalViewPager) && (verticalViewPager = (VerticalViewPager) interfaceC1368705Xh8) != null && verticalViewPager.getChildCount() == 1 && (function1 = this.LLILZLL) != null) {
                            function1.invoke("slide_up");
                            return true;
                        }
                    }
                } else {
                    float y2 = motionEvent.getY();
                    this.LL = y2;
                    this.LLILLJJLI = y2;
                    InterfaceC1368705Xh interfaceC1368705Xh9 = this.LLILLL;
                    if (interfaceC1368705Xh9 != null) {
                        interfaceC1368705Xh9.LLLLZ();
                        return true;
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("SwipeUpGuideStrengthenLayout onTouchEvent error: ");
                sbLIZ.append(e);
                C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        return true;
    }

    public final void setDisAmount(float f) {
        this.LLILZIL = f;
    }

    public final void setFallBackRunnable(Function1<? super String, Unit> function1) {
        this.LLILZLL = function1;
    }

    public final void setPreviousY(float f) {
        this.LLILLJJLI = f;
    }

    public final void setViewPager(InterfaceC1368705Xh interfaceC1368705Xh) {
        this.LLILLL = interfaceC1368705Xh;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 0) {
            C849850XVn.LIZIZ.LIZJ().LIZIZ(this);
        }
    }

    public final void setYDown(float f) {
        this.LL = f;
    }

    public SwipeUpGuideStrengthenLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLILZ = context.getResources().getDisplayMetrics().density;
    }

    public /* synthetic */ SwipeUpGuideStrengthenLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
