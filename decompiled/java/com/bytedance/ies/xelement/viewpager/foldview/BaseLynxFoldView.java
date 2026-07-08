package com.bytedance.ies.xelement.viewpager.foldview;

import X.AbstractC1319300kR6;
import X.AbstractC1319370kRD;
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
import X.InterfaceC1324370kZH;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.ARunnableS120S0100000_20;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.ies.xelement.viewpager.foldview.BaseLynxFoldView;
import com.bytedance.ies.xelement.viewpager.foldview.LynxFoldViewNG;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.material.appbar.AppBarLayout$Behavior;
import com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior;
import com.lynx.base.log.LynxLog;
import com.lynx.tasm.behavior.ui.view.UISimpleView;
import com.zhiliaoapp.musically.R;
import j27.s;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AFwS208S0000000_20;

/* JADX INFO: loaded from: classes21.dex */
public abstract class BaseLynxFoldView<K extends AbstractC1319370kRD, T extends AbstractC1319300kR6<K>> extends UISimpleView<T> {
    public T LL;
    public boolean LLILLJJLI;
    public float LLILLL;
    public float LLILZ;
    public int LLILZIL;
    public final C01GW LLILZLL;
    public final C01GW LLIZ;

    public int LJJIJIIJI() {
        return 0;
    }

    public abstract void LJJIJL(C16GX c16gx, int i);

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final boolean needCustomLayout() {
        return true;
    }

    public final T LJJIJIIJIL() {
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

    public final void LJJIJIL() {
        AbstractC1319300kR6 abstractC1319300kR6LJJIJIIJIL = LJJIJIIJIL();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(abstractC1319300kR6LJJIJIIJIL);
        abstractC1319300kR6LJJIJIIJIL.setLayoutParams(layoutParams);
        LJJIJIIJIL().getAppBarLayout().LIZ(new InterfaceC1324370kZH(this) { // from class: X.0kR4
            public final /* synthetic */ BaseLynxFoldView<AbstractC1319370kRD, AbstractC1319300kR6<Object>> LL;

            {
                this.LL = this;
            }

            @Override // X.InterfaceC1324380kZI
            public final void LLZZJLIL(C16GX c16gx, int i) {
                int height;
                this.LL.LJJIJL(c16gx, i);
                if (Math.abs(this.LL.LLILZIL - i) > this.LL.LJJIJIIJI()) {
                    this.LL.recognizeGesturere();
                    this.LL.LLILZIL = i;
                }
                C1298340jtI c1298340jtILJIIJJI = this.LL.mContext.LJIIJJI();
                if (c1298340jtILJIIJJI != null) {
                    C1289620jfE.LIZLLL(new ARunnableS120S0100000_20(c1298340jtILJIIJJI, 221));
                }
                BaseLynxFoldView<AbstractC1319370kRD, AbstractC1319300kR6<Object>> baseLynxFoldView = this.LL;
                if (!baseLynxFoldView.LLILLJJLI || (height = baseLynxFoldView.LJJIJIIJIL().getCollapsingToolbarLayout().getHeight() - this.LL.LJJIJIIJIL().getFoldToolBar().getHeight()) == 0) {
                    return;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onOffsetChanged: ");
                sbLIZ.append(i);
                sbLIZ.append(", height = ");
                sbLIZ.append(height);
                sbLIZ.append(' ');
                LynxLog.d("LynxFoldView", C2188811AlT.LIZIZ(sbLIZ));
                float f = height;
                float fAbs = Math.abs(i) / f;
                float fAbs2 = Math.abs(this.LL.LLILLL - fAbs);
                BaseLynxFoldView<AbstractC1319370kRD, AbstractC1319300kR6<Object>> baseLynxFoldView2 = this.LL;
                if ((fAbs2 >= baseLynxFoldView2.LLILZ || fAbs >= 1.0f) && baseLynxFoldView2.LLILLL != fAbs) {
                    C1298720jtu c1298720jtu = baseLynxFoldView2.mContext.LLIZ;
                    C1289960jfm c1289960jfm = new C1289960jfm(baseLynxFoldView2.getSign(), "offset");
                    BaseLynxFoldView<AbstractC1319370kRD, AbstractC1319300kR6<Object>> baseLynxFoldView3 = this.LL;
                    baseLynxFoldView3.getClass();
                    if (baseLynxFoldView3 instanceof LynxFoldViewNG) {
                        c1289960jfm.LIZIZ(Integer.valueOf((int) ((Math.abs(i) / baseLynxFoldView3.mContext.getResources().getDisplayMetrics().density) + 0.5f)), "offset");
                        c1289960jfm.LIZIZ(Integer.valueOf((int) ((f / baseLynxFoldView3.mContext.getResources().getDisplayMetrics().density) + 0.5f)), "height");
                    } else {
                        c1289960jfm.LIZIZ(C786410Ut5.k4(Locale.ENGLISH, "%.5f", Arrays.copyOf(new Object[]{Float.valueOf(fAbs)}, 1)), "offset");
                    }
                    c1298720jtu.LIZIZ(c1289960jfm);
                    LynxLog.d("LynxFoldView", "send " + C786410Ut5.k4(Locale.ENGLISH, "%.5f", Arrays.copyOf(new Object[]{Float.valueOf(fAbs)}, 1)));
                    this.LL.LLILLL = fAbs;
                }
            }
        });
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
        LJJIJIIJIL().setCompatContainerPopup(z);
    }

    @InterfaceC1312540kGC(defaultBoolean = true, name = "enable-scroll")
    public final void setEnableScroll(boolean z) {
        setScrollEnable(z);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void setEvents(Map<String, C1299120juY> map) {
        super.setEvents(map);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("events: ");
        sbLIZ.append(map);
        LynxLog.d("LynxFoldView", C2188811AlT.LIZIZ(sbLIZ));
        if (map != null) {
            this.LLILLJJLI = map.containsKey("offset");
        }
    }

    @InterfaceC1312540kGC(defaultFloat = 0.01f, name = "granularity")
    public final void setGranularity(float f) {
        this.LLILZ = f;
    }

    @InterfaceC1312540kGC(defaultBoolean = true, name = "scroll-enable")
    public final void setScrollEnable(boolean z) {
        LJJIJIIJIL().setScrollEnable(z);
        ((AbstractC1319370kRD) LJJIJIIJIL().findViewById(R.id.b6m)).setScrollEnable(z);
    }

    public BaseLynxFoldView(s sVar, Object obj) {
        super(sVar, obj);
        this.LLILZ = 0.01f;
        this.LLILZLL = C452501pT.LIZIZ(AFwS208S0000000_20.get$arr$(28));
        this.LLIZ = C452501pT.LIZIZ(AFwS208S0000000_20.get$arr$(27));
    }

    public static void LJJIIZI(BaseLynxFoldView baseLynxFoldView, double d, int i, int i2) throws Throwable {
        int i3;
        if ((i2 & 1) != 0) {
            d = -1.0d;
        }
        if ((i2 & 2) != 0) {
            i = -1;
        }
        C16GX appBarLayout = baseLynxFoldView.LJJIJIIJIL().getAppBarLayout();
        ViewGroup.LayoutParams layoutParams = appBarLayout.getLayoutParams();
        if (layoutParams != null) {
            C16BC c16bc = ((C16G1) layoutParams).LIZ;
            if (c16bc instanceof AppBarLayout$Behavior) {
                if (i >= 0) {
                    i3 = -i;
                } else {
                    try {
                        i3 = -((int) (((double) appBarLayout.getTotalScrollRange()) * (((double) 1) - d)));
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        LynxLog.e("LynxFoldView", "invoke animateOffsetToMethod error " + e.getMessage());
                        return;
                    }
                }
                int i4 = -appBarLayout.getTotalScrollRange();
                if (i3 < i4) {
                    i3 = i4;
                }
                Method method = (Method) baseLynxFoldView.LLIZ.getValue();
                if (method != null) {
                    C2204961BRm.a0(method, c16bc, new Object[]{baseLynxFoldView.LJJIJIIJIL(), appBarLayout, Integer.valueOf(i3), 0}, new C0WZX("dzBzEgAjS8/YVFkiQFyNY/5YvW5E5Tb1cuCxAuETAfbOauT4aU9CgW6A9nUxgCr6aJjbsVdRNd+JFWw8Xj0=", null));
                    return;
                }
                return;
            }
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
    }

    public static void LJJIJ(BaseLynxFoldView baseLynxFoldView, double d, int i, int i2) throws Throwable {
        int i3;
        if ((i2 & 1) != 0) {
            d = -1.0d;
        }
        if ((i2 & 2) != 0) {
            i = -1;
        }
        C16GX appBarLayout = baseLynxFoldView.LJJIJIIJIL().getAppBarLayout();
        ViewGroup.LayoutParams layoutParams = appBarLayout.getLayoutParams();
        if (layoutParams != null) {
            C16BC c16bc = ((C16G1) layoutParams).LIZ;
            if (c16bc instanceof AppBarLayout$Behavior) {
                if (i >= 0) {
                    i3 = -i;
                } else {
                    try {
                        i3 = -((int) (((double) appBarLayout.getTotalScrollRange()) * (((double) 1) - d)));
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        LynxLog.e("LynxFoldView", "invoke doOffsetToMethodWithoutAnim error " + e.getMessage());
                        return;
                    }
                }
                int i4 = -appBarLayout.getTotalScrollRange();
                if (i3 < i4) {
                    i3 = i4;
                }
                Method method = (Method) baseLynxFoldView.LLILZLL.getValue();
                if (method != null) {
                    C2204961BRm.a0(method, c16bc, new Object[]{baseLynxFoldView.LJJIJIIJIL(), appBarLayout, Integer.valueOf(i3), Integer.MIN_VALUE, Integer.MAX_VALUE}, new C0WZX("dzBzEgAjS8/YVFkiQFyNY/5YvW5E5Tb1cuCxAuETAfbOauT4aU9CgW6A9nUxgCr6aJjbsVdRNd+JFWw8Xj0=", null));
                    return;
                }
                return;
            }
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
    }
}
