package com.lynx.xelement.scroll.coordinator;

import X.AbstractC1319290kR5;
import X.AbstractC1319380kRE;
import X.C01GW;
import X.C0WZX;
import X.C1299120juY;
import X.C16BC;
import X.C16G1;
import X.C16GX;
import X.C19MJ;
import X.C21536219Qa;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C452501pT;
import X.InterfaceC1312540kGC;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.material.appbar.AppBarLayout$Behavior;
import com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior;
import com.lynx.base.log.LynxLog;
import com.lynx.tasm.behavior.ui.view.UISimpleView;
import com.zhiliaoapp.musically.R;
import j27.s;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.jvm.internal.AFwS208S0000000_20;

/* JADX INFO: loaded from: classes21.dex */
public abstract class BaseScrollCoordinator<K extends AbstractC1319380kRE, T extends AbstractC1319290kR5<K>> extends UISimpleView<T> {
    public T LL;
    public boolean LLILLJJLI;
    public float LLILLL;
    public float LLILZ;
    public int LLILZIL;
    public final C01GW LLILZLL;
    public final C01GW LLIZ;

    public int LJJIJ() {
        return 0;
    }

    public abstract void LJJIJIIJI(C16GX c16gx, int i);

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final boolean needCustomLayout() {
        return true;
    }

    public final T LJJIIZI() {
        T t = this.LL;
        if (t != null) {
            return t;
        }
        return null;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final int getScrollY() {
        return Math.abs(this.LLILZIL);
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams != null) {
            if (layoutParams.width == -1 && layoutParams.height == -2) {
                return layoutParams;
            }
            layoutParams.width = -1;
            layoutParams.height = -2;
            if (layoutParams instanceof C21536219Qa) {
                return new C21536219Qa((FrameLayout.LayoutParams) layoutParams);
            }
            if (layoutParams instanceof C16G1) {
                C16G1 c16g1 = new C16G1((C16G1) layoutParams);
                c16g1.LIZIZ(new AppBarLayout$ScrollingViewBehavior());
                return c16g1;
            }
            if (layoutParams instanceof C19MJ) {
                return new C19MJ((C19MJ) layoutParams);
            }
        }
        C16G1 c16g12 = new C16G1(-1, -2);
        c16g12.LIZIZ(new AppBarLayout$ScrollingViewBehavior());
        return c16g12;
    }

    @InterfaceC1312540kGC(defaultBoolean = false, name = "compat-container-popup")
    public final void setCompatContainerPopup(boolean z) {
        LJJIIZI().setCompatContainerPopupEnabled(z);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void setEvents(Map<String, C1299120juY> map) {
        super.setEvents(map);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("events: ");
        sbLIZ.append(map);
        LynxLog.d("ScrollCoordinator", C2188811AlT.LIZIZ(sbLIZ));
        if (map != null) {
            this.LLILLJJLI = map.containsKey("offset");
        }
    }

    @InterfaceC1312540kGC(defaultFloat = 0.01f, name = "granularity")
    public final void setGranularity(float f) {
        this.LLILZ = f;
    }

    @InterfaceC1312540kGC(defaultBoolean = true, name = "enable-scroll")
    public final void setScrollEnable(boolean z) {
        LJJIIZI().setScrollEnabled(z);
        ((AbstractC1319380kRE) LJJIIZI().findViewById(R.id.b6m)).setScrollEnabled(z);
    }

    public BaseScrollCoordinator(s sVar, Object obj) {
        super(sVar, obj);
        this.LLILZ = 0.01f;
        this.LLILZLL = C452501pT.LIZIZ(AFwS208S0000000_20.get$arr$(30));
        this.LLIZ = C452501pT.LIZIZ(AFwS208S0000000_20.get$arr$(29));
    }

    public static void LJJIJIIJIL(BaseScrollCoordinator baseScrollCoordinator, int i) {
        C16GX appBarLayout = baseScrollCoordinator.LJJIIZI().getAppBarLayout();
        ViewGroup.LayoutParams layoutParams = appBarLayout.getLayoutParams();
        if (layoutParams != null) {
            C16BC c16bc = ((C16G1) layoutParams).LIZ;
            if (c16bc instanceof AppBarLayout$Behavior) {
                if (i < 0) {
                    try {
                        i = (int) (((double) appBarLayout.getTotalScrollRange()) * (((double) 1) - (-1.0d)));
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        LynxLog.e("ScrollCoordinator", "invoke setOffsetWithoutAnimation error " + e.getMessage());
                        return;
                    }
                }
                int i2 = -i;
                int i3 = -appBarLayout.getTotalScrollRange();
                if (i2 < i3) {
                    i2 = i3;
                }
                Method method = (Method) baseScrollCoordinator.LLILZLL.getValue();
                if (method != null) {
                    C2204961BRm.a0(method, c16bc, new Object[]{baseScrollCoordinator.LJJIIZI(), appBarLayout, Integer.valueOf(i2), Integer.MIN_VALUE, Integer.MAX_VALUE}, new C0WZX("dzBzEg4jUdKSTVItQB+BaKOt6GY3ryuBJOo+RAm2WIuBYakPsr0KYi6emfORrtPYqNLaCoXlO6Rl1w==", null));
                    return;
                }
                return;
            }
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
    }
}
