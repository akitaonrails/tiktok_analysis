package com.lynx.tasm.behavior.ui.list.container;

import X.AbstractC1311530kEZ;
import X.C1289620jfE;
import X.C1289960jfm;
import X.C1292490jjr;
import X.C1299120juY;
import X.C1311130kDv;
import X.C1311420kEO;
import X.C1311840kF4;
import X.C1311860kF6;
import X.C1312920kGo;
import X.C1312990kGv;
import X.C1313000kGw;
import X.C1317470kO9;
import X.C1317480kOA;
import X.C1317510kOD;
import X.C1317520kOE;
import X.C14K9;
import X.C2188811AlT;
import X.C786410Ut5;
import X.ChoreographerFrameCallbackC1339260kxI;
import X.EnumC665490Q8l;
import X.InterfaceC1298070jsr;
import X.InterfaceC1312540kGC;
import X.InterfaceC1317460kO8;
import X.InterfaceC1317570kOJ;
import X.InterfaceC1967107nB;
import X.RunnableC1312980kGu;
import X.RunnableC742540TAu;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.ARunnableS0S0200010_20;
import Y.ARunnableS7S0100002_20;
import Y.ARunnableS89S0200000_20;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.text.TextUtils;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.lynx.base.log.LynxLog;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableType;
import com.lynx.tasm.LynxError;
import com.lynx.tasm.LynxTemplateRender;
import com.lynx.tasm.base.TraceController;
import com.lynx.tasm.base.TraceEvent;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.view.AndroidView;
import com.lynx.tasm.behavior.ui.view.UIComponent;
import com.lynx.tasm.behavior.ui.view.UISimpleView;
import j27.s;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.ListIterator;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
public class UIListContainer extends UISimpleView<C1317470kO9> implements InterfaceC1317570kOJ {
    public static final /* synthetic */ int LLJLLIL = 0;
    public boolean LL;
    public C1317520kOE LLILLJJLI;
    public JavaOnlyArray LLILLL;
    public final HashMap<String, Integer> LLILZ;
    public boolean LLILZIL;
    public int LLILZLL;
    public final Map<String, Object> LLIZ;
    public final Map<String, HashSet<String>> LLIZLLLIL;
    public final HashMap<Integer, UIComponent> LLJ;
    public final HashMap<Integer, UIComponent> LLJI;
    public JavaOnlyArray LLJIJIL;
    public JavaOnlyArray LLJILJIL;
    public UIComponent LLJILJILJ;
    public UIComponent LLJILLL;
    public boolean LLJJ;
    public int LLJJI;
    public boolean LLJJIII;
    public boolean LLJJIJI;
    public boolean LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public boolean LLJJJ;
    public boolean LLJJJIL;
    public final HashSet<String> LLJJJJ;
    public final HashSet<String> LLJJJJJIL;
    public final HashMap<String, UIComponent> LLJJJJLIIL;
    public final HashMap<String, UIComponent> LLJJL;
    public Callback LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public int LLJLIL;
    public ListContainerProxy LLJLILLLLZIIL;
    public final C1311840kF4 LLJLL;

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final boolean isScrollContainer() {
        return true;
    }

    public final boolean LJJIZ() {
        s sVar = this.mContext;
        if (sVar == null || sVar.LJIILJJIL() == null) {
            return false;
        }
        EnumC665490Q8l threadStrategyForRendering = this.mContext.LJIILJJIL().getThreadStrategyForRendering();
        return threadStrategyForRendering == EnumC665490Q8l.MOST_ON_TASM || threadStrategyForRendering == EnumC665490Q8l.MULTI_THREADS;
    }

    public final void LJJJJ() {
        int width;
        int i;
        int left;
        int width2;
        int left2;
        int width3;
        if (this.LLILZIL) {
            if (this.LL) {
                width = getHeight() + getScrollY();
                i = this.LLILZLL;
            } else {
                width = getWidth() + getScrollX();
                i = this.LLILZLL;
            }
            int i2 = width - i;
            Iterator<Object> it2 = this.LLJILJIL.iterator();
            UIComponent uIComponent = null;
            UIComponent uIComponent2 = null;
            while (it2.hasNext()) {
                UIComponent uIComponentLJJIJIL = LJJIJIL(false, (Integer) it2.next());
                if (uIComponentLJJIJIL != null) {
                    if (this.LL) {
                        left2 = uIComponentLJJIJIL.getTop();
                        width3 = uIComponentLJJIJIL.getHeight();
                    } else {
                        left2 = uIComponentLJJIJIL.getLeft();
                        width3 = uIComponentLJJIJIL.getWidth();
                    }
                    if (left2 + width3 < i2) {
                        LJJJ(uIComponentLJJIJIL);
                        uIComponent2 = uIComponentLJJIJIL;
                    } else if (uIComponent != null) {
                        LJJJ(uIComponentLJJIJIL);
                    } else {
                        uIComponent = uIComponentLJJIJIL;
                    }
                }
            }
            if (uIComponent != null) {
                if (this.LLJILLL != uIComponent) {
                    if (this.LL) {
                        C1289960jfm c1289960jfm = new C1289960jfm(getSign(), "stickybottom");
                        c1289960jfm.LIZIZ(uIComponent.LLILLJJLI, "bottom");
                        this.mContext.LLIZ.LIZIZ(c1289960jfm);
                    }
                    C1289960jfm c1289960jfm2 = new C1289960jfm(getSign(), "stickyend");
                    c1289960jfm2.LIZIZ(uIComponent.LLILLJJLI, "end");
                    this.mContext.LLIZ.LIZIZ(c1289960jfm2);
                    this.LLJILLL = uIComponent;
                }
                int height = i2 - (this.LL ? uIComponent.getHeight() : uIComponent.getWidth());
                if (uIComponent2 != null) {
                    if (this.LL) {
                        left = i2 - (uIComponent2.getTop() + uIComponent2.getHeight());
                        width2 = uIComponent.getHeight();
                    } else {
                        left = i2 - (uIComponent2.getLeft() + uIComponent2.getWidth());
                        width2 = uIComponent.getWidth();
                    }
                    int i3 = width2 - left;
                    if (i3 > 0) {
                        height += i3;
                    }
                }
                T t = uIComponent.mView;
                if (t != 0) {
                    if (this.LL) {
                        C786410Ut5.zd((AndroidView) t, height - uIComponent.getTop());
                    } else {
                        float left3 = height - uIComponent.getLeft();
                        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(t);
                        t.setTranslationX(left3);
                    }
                    uIComponent.mView.bringToFront();
                    T t2 = uIComponent.mView;
                    if (t2 != 0) {
                        t2.setOutlineProvider(null);
                        C14K9.LJIL(t2, 2.1474836E9f);
                    }
                }
            }
        }
    }

    public final void LJJJJL() {
        int left;
        int width;
        if (this.LLILZIL) {
            int scrollY = (this.LL ? getScrollY() : getScrollX()) + this.LLILZLL;
            JavaOnlyArray javaOnlyArray = this.LLJIJIL;
            ListIterator<Object> listIterator = javaOnlyArray.listIterator(javaOnlyArray.size());
            UIComponent uIComponent = null;
            UIComponent uIComponent2 = null;
            while (listIterator.hasPrevious()) {
                UIComponent uIComponentLJJIJIL = LJJIJIL(true, (Integer) listIterator.previous());
                if (uIComponentLJJIJIL != null) {
                    if ((this.LL ? uIComponentLJJIJIL.getTop() : uIComponentLJJIJIL.getLeft()) > scrollY) {
                        LJJJ(uIComponentLJJIJIL);
                        uIComponent2 = uIComponentLJJIJIL;
                    } else if (uIComponent != null) {
                        LJJJ(uIComponentLJJIJIL);
                    } else {
                        uIComponent = uIComponentLJJIJIL;
                    }
                }
            }
            if (uIComponent != null) {
                if (this.LLJILJILJ != uIComponent) {
                    if (this.LL) {
                        C1289960jfm c1289960jfm = new C1289960jfm(getSign(), "stickytop");
                        c1289960jfm.LIZIZ(uIComponent.LLILLJJLI, "top");
                        this.mContext.LLIZ.LIZIZ(c1289960jfm);
                    }
                    C1289960jfm c1289960jfm2 = new C1289960jfm(getSign(), "stickystart");
                    c1289960jfm2.LIZIZ(uIComponent.LLILLJJLI, "start");
                    this.mContext.LLIZ.LIZIZ(c1289960jfm2);
                    this.LLJILJILJ = uIComponent;
                }
                if (uIComponent2 != null) {
                    if (this.LL) {
                        left = uIComponent2.getTop() - scrollY;
                        width = uIComponent.getHeight();
                    } else {
                        left = uIComponent2.getLeft() - scrollY;
                        width = uIComponent.getWidth();
                    }
                    int i = width - left;
                    if (i > 0) {
                        scrollY -= i;
                    }
                }
                T t = uIComponent.mView;
                if (t != 0) {
                    if (this.LL) {
                        C786410Ut5.zd((AndroidView) t, scrollY - uIComponent.getTop());
                    } else {
                        float left2 = scrollY - uIComponent.getLeft();
                        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(t);
                        t.setTranslationX(left2);
                    }
                    uIComponent.mView.bringToFront();
                    T t2 = uIComponent.mView;
                    if (t2 != 0) {
                        t2.setOutlineProvider(null);
                        C14K9.LJIL(t2, 2.1474836E9f);
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.lynx.react.bridge.JavaOnlyArray LJJJJLI() {
        /*
            Method dump skipped, instruction units count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.behavior.ui.list.container.UIListContainer.LJJJJLI():com.lynx.react.bridge.JavaOnlyArray");
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, X.InterfaceC1311590kEf
    public final int getMemberScrollX() {
        if (this.LL) {
            return 0;
        }
        return this.mView.getScrollX();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, X.InterfaceC1311590kEf
    public final int getMemberScrollY() {
        if (this.LL) {
            return this.mView.getScrollY();
        }
        return 0;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, X.InterfaceC1311590kEf
    public final int getScrollContainerDirection() {
        return this.LL ? 1 : -1;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final int getScrollX() {
        return this.mView.getScrollX();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final int getScrollY() {
        return this.mView.getScrollY();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI, X.InterfaceC1313090kH5
    public final void invalidate() {
        if (((C1317470kO9) this.mView).getLinearLayout() != null) {
            ((C1317470kO9) this.mView).getLinearLayout().invalidate();
        }
        super.invalidate();
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void destroy() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("destroy: ");
        sbLIZ.append(this);
        sbLIZ.append(", listContainerView: ");
        sbLIZ.append(this.mView);
        LynxLog.i("UIListContainer", C2188811AlT.LIZIZ(sbLIZ));
        super.destroy();
        T t = this.mView;
        if (t != 0) {
            C1317470kO9 c1317470kO9 = (C1317470kO9) t;
            TraceEvent.LIZLLL("ListContainerView.destroy");
            RunnableC1312980kGu runnableC1312980kGu = c1317470kO9.LLJJIJI;
            if (!runnableC1312980kGu.LLILZIL.LIZLLL()) {
                runnableC1312980kGu.LLILZIL.LIZ();
            }
            runnableC1312980kGu.LL = 0;
            runnableC1312980kGu.LLILLJJLI = 0;
            runnableC1312980kGu.LLILLL = 0;
            runnableC1312980kGu.LLILZ = 0;
            c1317470kO9.LJIIL();
            RunnableC742540TAu runnableC742540TAu = c1317470kO9.LLLI;
            if (runnableC742540TAu != null) {
                HandlerHook.viewRemoveCallbacks(c1317470kO9, runnableC742540TAu);
                c1317470kO9.LLLI = null;
            }
            c1317470kO9.LLLII = false;
            c1317470kO9.LLLFFI = false;
            c1317470kO9.LLLILZJ = false;
            c1317470kO9.LLLIIII.clear();
            c1317470kO9.LLJLILLLLZIIL = null;
            c1317470kO9.LLJJJJLIIL = null;
            c1317470kO9.LLJJL = null;
            c1317470kO9.LLJJIJIL.clear();
            c1317470kO9.LLJJIJIIJIL.clear();
            TraceEvent.LJII("ListContainerView.destroy");
        }
        C1317520kOE c1317520kOE = this.LLILLJJLI;
        if (c1317520kOE != null) {
            c1317520kOE.LIZIZ();
        }
        ListContainerProxy listContainerProxy = this.LLJLILLLLZIIL;
        if (listContainerProxy != null) {
            listContainerProxy.LIZ();
            this.LLJLILLLLZIIL = null;
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, X.InterfaceC1311590kEf
    public final Map<Integer, AbstractC1311530kEZ> getGestureHandlers() {
        return super.getGestureHandlers();
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void layout() {
        if (getOverflow() != 0) {
            ((ViewGroup) this.mView).setClipChildren(false);
        }
        super.layout();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, X.InterfaceC1311590kEf
    public final void onInvalidate() {
        T t;
        if (!isEnableNewGesture() || (t = this.mView) == 0) {
            return;
        }
        t.postInvalidateOnAnimation();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onLayoutUpdated() {
        super.onLayoutUpdated();
        this.mView.setLayoutDirection(0);
        if (this.LL && ((C1317470kO9) this.mView).LLJLLIL != getWidth()) {
            ((C1317470kO9) this.mView).LJIILIIL(getWidth(), ((C1317470kO9) this.mView).LLJLLL);
        } else if (!this.LL && ((C1317470kO9) this.mView).LLJLLL != getHeight()) {
            T t = this.mView;
            ((C1317470kO9) t).LJIILIIL(((C1317470kO9) t).LLJLLIL, getHeight());
        }
        C1317470kO9 c1317470kO9 = (C1317470kO9) this.mView;
        int i = this.mPaddingLeft;
        int i2 = this.mPaddingRight;
        int i3 = this.mPaddingTop;
        int i4 = this.mPaddingBottom;
        c1317470kO9.LLJZ = i;
        c1317470kO9.LLJZIJLIL = i2;
        c1317470kO9.LLL = i3;
        c1317470kO9.LLLF = i4;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onNodeReady() {
        String str;
        s sVar;
        C1311860kF6 c1311860kF6;
        if (TraceController.isTracingStarted()) {
            str = "UIListContainer.onNodeReady";
            TraceEvent.LIZLLL("UIListContainer.onNodeReady");
        } else {
            str = null;
        }
        super.onNodeReady();
        if (this.LLJLILLLLZIIL == null && (sVar = this.mContext) != null && (c1311860kF6 = sVar.LLJ) != null) {
            LynxTemplateRender lynxTemplateRender = c1311860kF6.LIZ;
            if (lynxTemplateRender != null && lynxTemplateRender.LJIJJLI() != 0) {
                LynxTemplateRender lynxTemplateRender2 = this.mContext.LLJ.LIZ;
                this.LLJLILLLLZIIL = new ListContainerProxy(lynxTemplateRender2 != null ? lynxTemplateRender2.LJIJJLI() : 0L);
            }
        }
        if (Boolean.TRUE.equals(((C1317470kO9) this.mView).LLLFF)) {
            T t = this.mView;
            C1317470kO9 c1317470kO9 = (C1317470kO9) t;
            if (!c1317470kO9.LLLFFI || !c1317470kO9.LLLILZJ) {
                ((C1317470kO9) t).LJIIJ();
            }
        }
        LJJJJL();
        LJJJJ();
        if (TraceController.isTracingStarted()) {
            TraceEvent.LJII(str);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onPropsUpdated() {
        super.onPropsUpdated();
        if (this.LLILZIL && this.LLJJJIL) {
            LJJIJIIJI(this.LLJJJJ, this.LLJIJIL, this.LLJJJJLIIL);
            LJJIJIIJI(this.LLJJJJJIL, this.LLJILJIL, this.LLJJL);
        }
        T t = this.mView;
        if (((C1317470kO9) t).LLLFF == null) {
            ((C1317470kO9) t).LLLFF = Boolean.FALSE;
        }
    }

    @Override // X.InterfaceC1317570kOJ
    public final void LJII(int i) {
        if (i != 1) {
            recognizeGesturere();
        }
        if (i == 1) {
            this.mContext.LJIIIZ().LIZJ(getSign());
            Callback callback = this.LLJJLIIIJLLLLLLLZ;
            if (callback != null) {
                this.LLJJLIIIJLLLLLLLZ = null;
                callback.invoke(0);
            }
            if (this.LLJJIJI) {
                LJJJI(this.mView.getScrollX(), this.mView.getScrollY(), this.mView.getScrollX(), this.mView.getScrollY(), "scrollend");
            }
        } else if (i == 2) {
            this.mContext.LJIIIZ().LIZIZ(getSign(), this.mScrollMonitorTag);
            Callback callback2 = this.LLJJLIIIJLLLLLLLZ;
            if (callback2 != null) {
                this.LLJJLIIIJLLLLLLLZ = null;
                callback2.invoke(1, "the scroll has stopped, triggered by dragging events");
            }
        }
        if (this.LLJJIJIIJIL) {
            C1289960jfm c1289960jfm = new C1289960jfm(getSign(), "scrollstatechange");
            if (this.LLJJJ) {
                c1289960jfm.LIZIZ(LJJJJLI(), "attachedCells");
            }
            c1289960jfm.LIZIZ(Integer.valueOf(i), "state");
            this.mContext.LLIZ.LIZIZ(c1289960jfm);
        }
    }

    public final void LJJIJ(UIComponent uIComponent) {
        View view = uIComponent.mView;
        if (view != null && view.getParent() == null) {
            ((C1317470kO9) this.mView).addView(view);
            if (this.LLJJ && LJJIZ()) {
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation.setDuration(this.LLJJI);
                view.startAnimation(alphaAnimation);
            }
        }
        float f = uIComponent.LLILLL;
        T t = uIComponent.mView;
        if (t != 0) {
            t.setOutlineProvider(null);
            C14K9.LJIL(t, f);
        }
    }

    public final int LJJIJIIJIL(String str) {
        if (!TextUtils.isEmpty(str) && this.LLILZ.containsKey(str)) {
            return this.LLILZ.get(str).intValue();
        }
        return -1;
    }

    public final void LJJIJL(LynxBaseUI lynxBaseUI) {
        if (lynxBaseUI instanceof UIComponent) {
            UIComponent uIComponent = (UIComponent) lynxBaseUI;
            if (!this.LLJJIJIL && uIComponent.getWidth() == 0 && uIComponent.getHeight() == 0) {
                if (uIComponent.LL == null) {
                    uIComponent.LL = new InterfaceC1317460kO8() { // from class: X.0kO7
                        @Override // X.InterfaceC1317460kO8
                        public final void LIZ(UIComponent uIComponent2) {
                            if (uIComponent2 != null) {
                                this.LIZ.LJJIJLIJ(uIComponent2);
                            }
                        }
                    };
                }
            } else {
                LJJIJLIJ(uIComponent);
            }
            if (this.LLILZIL) {
                if (this.LLJJJIL) {
                    String str = uIComponent.LLILLJJLI;
                    if (str != null) {
                        if (this.LLJJJJ.contains(str)) {
                            this.LLJJJJLIIL.put(str, uIComponent);
                            uIComponent.LLILZ = this;
                            return;
                        } else {
                            if (!this.LLJJJJJIL.contains(str)) {
                                return;
                            }
                            this.LLJJL.put(str, uIComponent);
                            uIComponent.LLILZ = this;
                            return;
                        }
                    }
                    return;
                }
                int iLJJIJIIJIL = LJJIJIIJIL(uIComponent.LLILLJJLI);
                LJJJJJ(uIComponent, this.LLJ, this.LLJIJIL, iLJJIJIIJIL);
                LJJJJJ(uIComponent, this.LLJI, this.LLJILJIL, iLJJIJIIJIL);
            }
        }
    }

    public final void LJJIJLIJ(UIComponent uIComponent) {
        if (Boolean.TRUE.equals(((C1317470kO9) this.mView).LLLFF)) {
            T t = this.mView;
            C1317470kO9 c1317470kO9 = (C1317470kO9) t;
            if (c1317470kO9.LLLFFI && c1317470kO9.LLLILZJ) {
                ((C1317470kO9) t).LLLIIII.add(new ARunnableS89S0200000_20(this, uIComponent, 41));
                return;
            }
        }
        LJJIJ(uIComponent);
    }

    public final void LJJJ(UIComponent uIComponent) {
        T t = uIComponent.mView;
        if (t != 0) {
            if (this.LL) {
                C786410Ut5.zd((AndroidView) t, 0.0f);
            } else {
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(t);
                t.setTranslationX(0.0f);
            }
            float f = uIComponent.LLILLL;
            T t2 = uIComponent.mView;
            if (t2 != 0) {
                t2.setOutlineProvider(null);
                C14K9.LJIL(t2, f);
            }
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void consumeGesture(boolean z) {
        C1317470kO9 c1317470kO9 = (C1317470kO9) this.mView;
        c1317470kO9.LLJJLIIIJLLLLLLLZ = Boolean.valueOf(z);
        if (z) {
            c1317470kO9.LLJLIL = false;
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final View createView(Context context) {
        C1317470kO9 c1317470kO9 = new C1317470kO9(context, this);
        c1317470kO9.LLJJIJIIJIL.add(this);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("create UIListContainer: ");
        sbLIZ.append(this);
        sbLIZ.append(", ");
        sbLIZ.append(c1317470kO9);
        LynxLog.i("UIListContainer", C2188811AlT.LIZIZ(sbLIZ));
        return c1317470kO9;
    }

    @InterfaceC1967107nB
    public void getScrollInfo(Callback callback) {
        int memberScrollX = getMemberScrollX();
        int memberScrollY = getMemberScrollY();
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        javaOnlyMap.putInt("scrollX", C1292490jjr.LJI(memberScrollX, this.mContext));
        javaOnlyMap.putInt("scrollY", C1292490jjr.LJI(memberScrollY, this.mContext));
        javaOnlyMap.putInt("maxScrollOffset", C1292490jjr.LJI(((C1317480kOA) this.mView).getScrollRange(), this.mContext));
        callback.invoke(0, javaOnlyMap);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final Object getValueFromNativeStorage(String str) {
        Map<String, Object> map = this.LLIZ;
        if (map != null) {
            return ((HashMap) map).get(str);
        }
        return null;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void interceptGesture(boolean z) {
        ((C1317470kO9) this.mView).LLJL = Boolean.valueOf(z);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, X.InterfaceC1311590kEf
    public final boolean isAtBorder(boolean z) {
        if (!isEnableNewGesture()) {
            return false;
        }
        if (z) {
            return !((C1317480kOA) this.mView).LIZ(-1);
        }
        return !((C1317480kOA) this.mView).LIZ(1);
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void removeChild(LynxBaseUI lynxBaseUI) {
        T t;
        super.removeChild(lynxBaseUI);
        if (lynxBaseUI instanceof UIComponent) {
            UIComponent uIComponent = (UIComponent) lynxBaseUI;
            if (this.LLJJ && LJJIZ() && (t = uIComponent.mView) != 0 && t.getAnimation() != null) {
                t.getAnimation().cancel();
            }
            uIComponent.LL = null;
            uIComponent.LLILZ = null;
        }
        if (this.LLILZIL && !this.LLJJJIL) {
            LJJJJI(lynxBaseUI, this.LLJ);
            LJJJJI(lynxBaseUI, this.LLJI);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void removeKeyFromNativeStorage(String str) {
        Map<String, Object> map = this.LLIZ;
        if (map != null) {
            ((HashMap) map).remove(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x006a  */
    @Override // com.lynx.tasm.behavior.ui.UIGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void removeView(com.lynx.tasm.behavior.ui.LynxBaseUI r4) {
        /*
            r3 = this;
            T extends android.view.View r0 = r3.mView
            X.0kO9 r0 = (X.C1317470kO9) r0
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            java.lang.Boolean r0 = r0.LLLFF
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L6a
            T extends android.view.View r2 = r3.mView
            r1 = r2
            X.0kO9 r1 = (X.C1317470kO9) r1
            boolean r0 = r1.LLLFFI
            if (r0 == 0) goto L6a
            boolean r0 = r1.LLLILZJ
            if (r0 == 0) goto L6a
            X.0kO9 r2 = (X.C1317470kO9) r2
            Y.ARunnableS89S0200000_20 r1 = new Y.ARunnableS89S0200000_20
            r0 = 225(0xe1, float:3.15E-43)
            r1.<init>(r3, r4, r0)
            java.util.ArrayDeque<java.lang.Runnable> r0 = r2.LLLIIII
            r0.add(r1)
        L29:
            boolean r0 = r4 instanceof com.lynx.tasm.behavior.ui.view.UIComponent
            if (r0 == 0) goto L52
            com.lynx.tasm.behavior.ui.view.UIComponent r4 = (com.lynx.tasm.behavior.ui.view.UIComponent) r4
            boolean r0 = r3.LLILZIL
            if (r0 == 0) goto L52
            boolean r0 = r3.LLJJJIL
            if (r0 == 0) goto L6e
            java.lang.String r2 = r4.LLILLJJLI
            if (r2 == 0) goto L52
            java.util.HashMap<java.lang.String, com.lynx.tasm.behavior.ui.view.UIComponent> r0 = r3.LLJJJJLIIL
            java.lang.Object r0 = r0.get(r2)
            r1 = 0
            if (r0 != r4) goto L53
            java.util.HashMap<java.lang.String, com.lynx.tasm.behavior.ui.view.UIComponent> r0 = r3.LLJJJJLIIL
            r0.remove(r2)
            r4.LLILZ = r1
            boolean r0 = r3.LLJJIII
            if (r0 == 0) goto L52
            r3.LJJJ(r4)
        L52:
            return
        L53:
            java.util.HashMap<java.lang.String, com.lynx.tasm.behavior.ui.view.UIComponent> r0 = r3.LLJJL
            java.lang.Object r0 = r0.get(r2)
            if (r0 != r4) goto L52
            java.util.HashMap<java.lang.String, com.lynx.tasm.behavior.ui.view.UIComponent> r0 = r3.LLJJL
            r0.remove(r2)
            r4.LLILZ = r1
            boolean r0 = r3.LLJJIII
            if (r0 == 0) goto L52
            r3.LJJJ(r4)
            return
        L6a:
            super.removeView(r4)
            goto L29
        L6e:
            java.util.HashMap<java.lang.Integer, com.lynx.tasm.behavior.ui.view.UIComponent> r0 = r3.LLJ
            r3.LJJJJI(r4, r0)
            java.util.HashMap<java.lang.Integer, com.lynx.tasm.behavior.ui.view.UIComponent> r0 = r3.LLJI
            r3.LJJJJI(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.behavior.ui.list.container.UIListContainer.removeView(com.lynx.tasm.behavior.ui.LynxBaseUI):void");
    }

    @InterfaceC1312540kGC(defaultInt = 0, name = "experimental-batch-render-strategy")
    public void setBatchRenderStrategy(int i) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        this.LLJJIJIL = z;
    }

    @InterfaceC1312540kGC(defaultBoolean = false, name = "experimental-android-defer-child-mutation-in-draw")
    public void setDeferChildMutationInDraw(boolean z) {
        T t = this.mView;
        if (((C1317470kO9) t).LLLFF == null) {
            ((C1317470kO9) t).LLLFF = Boolean.valueOf(z);
        }
    }

    @InterfaceC1312540kGC(name = "list-container-info")
    public void setDiffInfo(ReadableMap readableMap) {
        if (readableMap != null) {
            ReadableArray array = readableMap.getArray("stickyStart");
            if (array != null) {
                this.LLJIJIL = JavaOnlyArray.shallowCopy(array);
            }
            ReadableArray array2 = readableMap.getArray("stickyEnd");
            if (array2 != null) {
                this.LLJILJIL = JavaOnlyArray.shallowCopy(array2);
            }
            ReadableArray array3 = readableMap.getArray("itemkeys");
            if (array3 != null) {
                this.LLILLL = JavaOnlyArray.shallowCopy(array3);
            }
            int size = this.LLILLL.size();
            this.LLILZ.clear();
            for (int i = 0; i < size; i++) {
                this.LLILZ.put(this.LLILLL.getString(i), Integer.valueOf(i));
            }
        }
    }

    @InterfaceC1312540kGC(defaultBoolean = false, name = "enable-fade-in-animation")
    public void setEnableFadeInAnimation(boolean z) {
        this.LLJJ = z;
    }

    @InterfaceC1312540kGC(defaultBoolean = false, name = "enable-insert-platform-view-operation")
    public void setEnableInsertPlatformViewOperation(boolean z) {
        this.LLJL = z;
    }

    @InterfaceC1312540kGC(defaultBoolean = true, name = "sticky")
    public void setEnableListSticky(boolean z) {
        this.LLILZIL = z;
    }

    @InterfaceC1312540kGC(defaultBoolean = false, name = "enable-nested-scroll")
    public void setEnableNestedScroll(boolean z) {
        ((C1317480kOA) this.mView).setNestedScrollingEnabled(z);
    }

    @InterfaceC1312540kGC(defaultBoolean = true, name = "experimental-recycle-sticky-item")
    public void setEnableRecycleStickyItem(boolean z) {
        this.LLJJIII = z;
    }

    @InterfaceC1312540kGC(defaultBoolean = true, name = "enable-scroll")
    public void setEnableScroll(boolean z) {
        ((C1317480kOA) this.mView).setEnableScroll(z);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void setEvents(Map<String, C1299120juY> map) {
        super.setEvents(map);
        if (map == null) {
            return;
        }
        this.LLJJIJI = map.containsKey("scrollend");
        this.LLJJIJIIJIL = map.containsKey("scrollstatechange");
    }

    @InterfaceC1312540kGC(defaultBoolean = false, name = "force-can-scroll")
    public void setForceCanScroll(boolean z) {
        T t = this.mView;
        if (t != 0) {
            ((C1317470kO9) t).setForceCanScroll(z);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void setGestureDetectors(Map<Integer, C1311420kEO> map) {
        super.setGestureDetectors(map);
    }

    @InterfaceC1312540kGC(name = "experimental-max-fling-distance-ratio")
    public void setMaxFlingDistanceRatio(InterfaceC1298070jsr interfaceC1298070jsr) {
        if (interfaceC1298070jsr.getType() == ReadableType.String && interfaceC1298070jsr.asString().equals("auto")) {
            ((C1317470kO9) this.mView).setMaxFlingDistanceRatio(Float.MAX_VALUE);
        } else {
            if (interfaceC1298070jsr.getType() != ReadableType.Number) {
                return;
            }
            ((C1317470kO9) this.mView).setMaxFlingDistanceRatio((float) interfaceC1298070jsr.asDouble());
        }
    }

    @InterfaceC1312540kGC(defaultBoolean = false, name = "need-visible-item-info")
    public void setNeedVisibleItemInfo(boolean z) {
        this.LLJJJ = z;
    }

    @InterfaceC1312540kGC(name = "item-snap")
    public void setPagingAlignment(ReadableMap readableMap) {
        if (readableMap != null && readableMap.size() > 0) {
            double d = readableMap.getDouble("factor");
            if (d < 0.0d || d > 1.0d) {
                this.mContext.LJIILLIIL(new LynxError(220205, "item-snap invalid!", "The factor should be constrained to the range of [0,1].", "warn"));
                d = 0.0d;
            }
            int iLIZIZ = readableMap.getInt("offset", 0);
            if (Math.abs(iLIZIZ) > 0) {
                this.mContext.LJIILLIIL(new LynxError(220205, "The unit of offset is changed from ppx to px on Android platform in Lynx SDK version 3.7. If Lynx SDK version < 3.7, you can use Math.round(offset * PixelRatio).", "", "warn"));
                iLIZIZ = (int) C1311130kDv.LIZIZ(iLIZIZ, 0.0f);
            }
            ((C1317480kOA) this.mView).LL = new C1312990kGv(d, iLIZIZ, 50.0f / this.mContext.LLJJJ.densityDpi, new C1313000kGw(this));
            return;
        }
        ((C1317480kOA) this.mView).LL = null;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, X.InterfaceC1311410kEN
    public final void setPanInterceptAncestors(boolean z) {
        ((C1317470kO9) this.mView).setPanInterceptAncestors(z);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, X.InterfaceC1311410kEN
    public final void setPanInterceptDescendants(boolean z) {
        ((C1317470kO9) this.mView).setPanInterceptDescendants(z);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, X.InterfaceC1311410kEN
    public final void setPanInterceptSelf(boolean z) {
        ((C1317470kO9) this.mView).setPanInterceptSelf(z);
    }

    @InterfaceC1312540kGC(customType = "vertical", name = "scroll-orientation")
    public void setScrollOrientation(String str) {
        if (!TextUtils.equals(str, "vertical") && TextUtils.equals(str, "horizontal")) {
            this.LL = false;
        } else {
            this.LL = true;
        }
        ((C1317470kO9) this.mView).setOrientation(this.LL ? 1 : 0);
    }

    @InterfaceC1312540kGC(defaultFloat = 0.0f, name = "sticky-offset")
    public void setStickyOffset(float f) {
        this.LLILZLL = (int) C1311130kDv.LIZIZ(f, 0.0f);
    }

    @InterfaceC1312540kGC(defaultInt = 100, name = "update-animation-fade-in-duration")
    public void setUpdateAnimationFadeInDuration(int i) {
        this.LLJJI = i;
    }

    @InterfaceC1312540kGC(defaultBoolean = true, name = "experimental-update-sticky-for-diff")
    public void setUpdateStickyForDiff(boolean z) {
        this.LLJJJIL = z;
    }

    @InterfaceC1312540kGC(defaultBoolean = false, name = "vertical-orientation")
    public void setVerticalOrientation(boolean z) {
        this.LL = z;
        ((C1317470kO9) this.mView).setOrientation(z ? 1 : 0);
    }

    public UIListContainer(s sVar, Object obj) {
        super(sVar, obj);
        this.LL = true;
        this.LLILLL = new JavaOnlyArray();
        this.LLILZ = new HashMap<>();
        this.LLILZIL = false;
        this.LLILZLL = 0;
        this.LLIZ = new HashMap();
        this.LLIZLLLIL = new HashMap();
        this.LLJ = new LinkedHashMap();
        this.LLJI = new LinkedHashMap();
        this.LLJIJIL = new JavaOnlyArray();
        this.LLJILJIL = new JavaOnlyArray();
        this.LLJILJILJ = null;
        this.LLJILLL = null;
        this.LLJJ = false;
        this.LLJJI = 100;
        this.LLJJIII = true;
        this.LLJJIJI = false;
        this.LLJJIJIIJIL = false;
        this.LLJJIJIL = false;
        this.LLJJJ = false;
        this.LLJJJIL = true;
        this.LLJJJJ = new HashSet<>();
        this.LLJJJJJIL = new HashSet<>();
        this.LLJJJJLIIL = new HashMap<>();
        this.LLJJL = new HashMap<>();
        this.LLJJLIIIJLLLLLLLZ = null;
        this.LLJL = false;
        this.LLJLIL = -1;
        this.LLJLILLLLZIIL = null;
        this.LLJLL = new C1311840kF4(this);
    }

    public final UIComponent LJJIJIL(boolean z, Integer num) {
        HashMap<Integer, UIComponent> map;
        HashMap<String, UIComponent> map2;
        String string;
        if (this.LLJJJIL) {
            if (z) {
                map2 = this.LLJJJJLIIL;
            } else {
                map2 = this.LLJJL;
            }
            int iIntValue = num.intValue();
            if (iIntValue >= 0 && iIntValue < this.LLILLL.size() && (string = this.LLILLL.getString(iIntValue)) != null) {
                return map2.get(string);
            }
            return null;
        }
        if (z) {
            map = this.LLJ;
        } else {
            map = this.LLJI;
        }
        return map.get(num);
    }

    public final void LJJJJI(LynxBaseUI lynxBaseUI, HashMap<Integer, UIComponent> map) {
        if (this.LLILZIL && (lynxBaseUI instanceof UIComponent)) {
            Iterator<Map.Entry<Integer, UIComponent>> it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                if (it2.next().getValue() == lynxBaseUI) {
                    if (this.LLJJIII) {
                        LJJJ((UIComponent) lynxBaseUI);
                    }
                    it2.remove();
                    return;
                }
            }
        }
    }

    @InterfaceC1967107nB
    public void autoScroll(ReadableMap readableMap, Callback callback) {
        float refreshRate;
        int iMin;
        Display display;
        if (this.LLILLJJLI == null) {
            this.LLILLJJLI = new C1317520kOE(this, callback);
        }
        C1317520kOE c1317520kOE = this.LLILLJJLI;
        boolean z = readableMap.getBoolean("start", true);
        boolean z2 = readableMap.getBoolean("autoStop", true);
        c1317520kOE.LIZ = z;
        c1317520kOE.LIZJ = z2;
        C1317520kOE c1317520kOE2 = this.LLILLJJLI;
        String string = readableMap.getString("rate", "");
        s sVar = this.mContext;
        if (c1317520kOE2.LIZ) {
            int iLIZ = (int) C1312920kGo.LIZ(string, 0.0f);
            if (iLIZ == 0) {
                c1317520kOE2.LJ.invoke(1, "rate is not right");
                return;
            }
            DisplayManager displayManager = (DisplayManager) sVar.getSystemService(DisplayManager.class);
            if (displayManager != null && (display = displayManager.getDisplay(0)) != null) {
                refreshRate = display.getRefreshRate();
            } else {
                refreshRate = 60.0f;
            }
            int i = (int) refreshRate;
            if (i <= 0) {
                i = 60;
            }
            if (iLIZ > 0) {
                iMin = Math.max(iLIZ / i, 1);
            } else {
                iMin = Math.min(iLIZ / i, -1);
            }
            c1317520kOE2.LIZIZ = iMin;
            c1317520kOE2.LIZIZ();
            UIListContainer uIListContainer = c1317520kOE2.LJFF;
            ((C1317480kOA) uIListContainer.mView).LLJJJJ = true;
            Callback callback2 = uIListContainer.LLJJLIIIJLLLLLLLZ;
            if (callback2 != null) {
                uIListContainer.LLJJLIIIJLLLLLLLZ = null;
                callback2.invoke(4, "the scroll has stopped, triggered by auto scroll");
            }
            if (c1317520kOE2.LIZ(c1317520kOE2.LIZIZ)) {
                ((C1317480kOA) c1317520kOE2.LJFF.mView).setScrollState(4);
            }
            c1317520kOE2.LJ.invoke(0);
            c1317520kOE2.LIZLLL = new ChoreographerFrameCallbackC1339260kxI(c1317520kOE2, 5);
            C786410Ut5.v2().postFrameCallback(c1317520kOE2.LIZLLL);
            return;
        }
        C1317480kOA c1317480kOA = (C1317480kOA) c1317520kOE2.LJFF.mView;
        c1317480kOA.LLJJJJ = false;
        c1317480kOA.setScrollState(1);
        c1317520kOE2.LIZIZ();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, X.InterfaceC1311590kEf
    public final boolean canConsumeGesture(float f, float f2) {
        if (!isEnableNewGesture()) {
            return false;
        }
        if (this.LL) {
            if (isAtBorder(true) && f2 < 0.0f) {
                return false;
            }
            if (isAtBorder(false) && f2 > 0.0f) {
                return false;
            }
            return true;
        }
        if (isAtBorder(true) && f < 0.0f) {
            return false;
        }
        if (isAtBorder(false) && f > 0.0f) {
            return false;
        }
        return true;
    }

    @InterfaceC1967107nB
    public void getVisibleCells(ReadableMap readableMap, Callback callback) {
        callback.invoke(0, LJJJJLI());
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final boolean initialPropsFlushed(String str, String str2) {
        HashSet hashSet;
        Map<String, HashSet<String>> map = this.LLIZLLLIL;
        if (map == null || (hashSet = (HashSet) ((HashMap) map).get(str2)) == null || !hashSet.contains(str)) {
            return false;
        }
        return true;
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void insertChild(LynxBaseUI lynxBaseUI, int i) {
        super.onInsertChild(lynxBaseUI, i);
        if (this.LLILZIL && !this.LLJJJIL) {
            int iLJJIJIIJIL = LJJIJIIJIL(((UIComponent) lynxBaseUI).LLILLJJLI);
            LJJJJIZL(lynxBaseUI, this.LLJ, this.LLJIJIL, iLJJIJIIJIL);
            LJJJJIZL(lynxBaseUI, this.LLJI, this.LLJILJIL, iLJJIJIIJIL);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, X.InterfaceC1311590kEf
    public final void onGestureScrollBy(float f, float f2) {
        if (!isEnableNewGesture()) {
            return;
        }
        C1289620jfE.LIZLLL(new ARunnableS7S0100002_20(this, f2, f, 11));
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onLayoutFinish(long j, LynxBaseUI lynxBaseUI) {
        super.onLayoutFinish(j, lynxBaseUI);
        if (!this.LLJJIJIL && !this.LLJL) {
            LJJIJL(lynxBaseUI);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final float[] scrollBy(float f, float f2) {
        float[] fArr = new float[4];
        T t = this.mView;
        if (t == 0) {
            return fArr;
        }
        int scrollX = t.getScrollX();
        int scrollY = this.mView.getScrollY();
        if (!this.LL) {
            this.mView.scrollBy((int) f, 0);
        } else {
            this.mView.scrollBy(0, (int) f2);
        }
        if (Math.abs(f) > Float.MIN_VALUE || Math.abs(f2) > Float.MIN_VALUE) {
            recognizeGesturere();
        }
        if (!this.LL) {
            float scrollX2 = this.mView.getScrollX() - scrollX;
            fArr[0] = scrollX2;
            fArr[1] = 0.0f;
            fArr[2] = f - scrollX2;
            fArr[3] = f2;
            return fArr;
        }
        fArr[0] = 0.0f;
        float scrollY2 = this.mView.getScrollY() - scrollY;
        fArr[1] = scrollY2;
        fArr[2] = f;
        fArr[3] = f2 - scrollY2;
        return fArr;
    }

    @InterfaceC1967107nB
    public void scrollToPosition(ReadableMap readableMap, Callback callback) {
        int i;
        C1311860kF6 c1311860kF6;
        Integer num;
        Callback callback2 = this.LLJJLIIIJLLLLLLLZ;
        if (callback2 != null) {
            this.LLJJLIIIJLLLLLLLZ = null;
            callback2.invoke(1, "the scroll has stopped, triggered by a new scrolling request");
        }
        int iIntValue = readableMap.getInt("index", readableMap.getInt("position", 0));
        String string = readableMap.getString("itemKey");
        if (!TextUtils.isEmpty(string) && (num = this.LLILZ.get(string)) != null) {
            iIntValue = num.intValue();
        }
        float f = (float) readableMap.getDouble("offset", 0.0d);
        boolean z = readableMap.getBoolean("smooth", false);
        int iLIZIZ = (int) C1311130kDv.LIZIZ(f, 0.0f);
        if (iIntValue >= 0 && iIntValue < this.LLILLL.size()) {
            if (!z) {
                RunnableC1312980kGu runnableC1312980kGu = ((C1317480kOA) this.mView).LLJJIJI;
                if (!runnableC1312980kGu.LLILZIL.LIZLLL()) {
                    runnableC1312980kGu.LLILZIL.LIZ();
                }
                runnableC1312980kGu.LL = 0;
                runnableC1312980kGu.LLILLJJLI = 0;
                runnableC1312980kGu.LLILLL = 0;
                runnableC1312980kGu.LLILZ = 0;
            }
            String string2 = readableMap.getString("alignTo");
            if (TextUtils.equals(string2, "middle")) {
                i = 1;
            } else if (TextUtils.equals(string2, "bottom")) {
                i = 2;
            } else {
                i = 0;
            }
            if (z) {
                this.LLJJLIIIJLLLLLLLZ = callback;
            }
            s sVar = this.mContext;
            ListContainerProxy listContainerProxy = this.LLJLILLLLZIIL;
            if (listContainerProxy != null) {
                listContainerProxy.LIZLLL(z, iLIZIZ, getSign(), iIntValue, i);
            } else if (sVar != null && (c1311860kF6 = sVar.LLJ) != null) {
                int sign = getSign();
                float f2 = iLIZIZ;
                LynxTemplateRender lynxTemplateRender = c1311860kF6.LIZ;
                if (lynxTemplateRender != null) {
                    lynxTemplateRender.LJJLIL(z, f2, sign, iIntValue, i);
                }
            } else {
                callback.invoke(1, "List has been destroyed");
                return;
            }
            if (!z) {
                LJJJI(this.mView.getScrollX(), this.mView.getScrollY(), this.mView.getScrollX(), this.mView.getScrollY(), "scrollend");
                callback.invoke(0);
                return;
            }
            return;
        }
        callback.invoke(8, "position < 0 or position >= data count");
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void setInitialPropsHasFlushed(String str, String str2) {
        HashSet hashSet;
        Map<String, HashSet<String>> map = this.LLIZLLLIL;
        if (map != null) {
            if (((HashMap) map).get(str2) == null) {
                hashSet = new HashSet();
            } else {
                hashSet = (HashSet) ((HashMap) this.LLIZLLLIL).get(str2);
            }
            hashSet.add(str);
            ((HashMap) this.LLIZLLLIL).put(str2, hashSet);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void storeKeyToNativeStorage(String str, Object obj) {
        Map<String, Object> map = this.LLIZ;
        if (map != null) {
            ((HashMap) map).put(str, obj);
        }
    }

    @InterfaceC1967107nB
    public void scrollBy(ReadableMap readableMap, Callback callback) {
        if (callback == null) {
            return;
        }
        if (readableMap != null && readableMap.hasKey("offset")) {
            C1289620jfE.LIZLLL(new ARunnableS0S0200010_20(this, C1311130kDv.LIZ(readableMap.getDouble("offset", 0.0d)), callback, 3));
        } else {
            callback.invoke(4, "Invoke scrollBy failed due to index param is null");
        }
    }

    public final void LJJIJIIJI(HashSet<String> hashSet, JavaOnlyArray javaOnlyArray, HashMap<String, UIComponent> map) {
        hashSet.clear();
        int size = javaOnlyArray.size();
        for (int i = 0; i < size; i++) {
            int i2 = javaOnlyArray.getInt(i);
            if (i2 >= 0 && i2 < this.LLILLL.size()) {
                hashSet.add(this.LLILLL.getString(i2));
            }
        }
        Iterator<Map.Entry<String, UIComponent>> it2 = map.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry<String, UIComponent> next = it2.next();
            String key = next.getKey();
            UIComponent value = next.getValue();
            if (value != null && key != null && !hashSet.contains(key)) {
                LJJJ(value);
                value.LLILZ = null;
                it2.remove();
            }
        }
    }

    public final void LJJJIL(float f, float f2, float f3) {
        int iLJIIIIZZ;
        C1317470kO9 c1317470kO9 = (C1317470kO9) this.mView;
        int i = (int) f;
        int i2 = (int) f2;
        int i3 = (int) f3;
        if (c1317470kO9.LLJLL) {
            if (i != c1317470kO9.LLJLLL) {
                c1317470kO9.LJIILIIL(c1317470kO9.LLJLLIL, Math.max(i, c1317470kO9.LLJJJJLIIL.getHeight()));
            }
        } else if (i != c1317470kO9.LLJLLIL) {
            c1317470kO9.LJIILIIL(Math.max(i, c1317470kO9.LLJJJJLIIL.getWidth()), c1317470kO9.LLJLLL);
        }
        c1317470kO9.LLLIIIIL = true;
        if (c1317470kO9.LLJLL) {
            int i4 = c1317470kO9.LLLIIL + i3;
            c1317470kO9.LLLIIL = i4;
            c1317470kO9.setScrollY(i4);
        } else {
            c1317470kO9.LLLIIIL += i2;
            if (c1317470kO9.LLJJJJLIIL.isRtl()) {
                iLJIIIIZZ = c1317470kO9.LJIIIIZZ(c1317470kO9.LLLIIIL);
            } else {
                iLJIIIIZZ = c1317470kO9.LLLIIIL;
            }
            c1317470kO9.setScrollX(iLJIIIIZZ);
        }
        c1317470kO9.LLLIIIIL = false;
    }

    public final void LJJJJJL(UIComponent uIComponent, HashMap<String, UIComponent> map, boolean z) {
        String str;
        if (uIComponent != null && (str = uIComponent.LLILLJJLI) != null) {
            if (z) {
                if (map.get(str) == uIComponent) {
                    return;
                }
                Iterator<Map.Entry<String, UIComponent>> it2 = map.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry<String, UIComponent> next = it2.next();
                    if (next.getValue() == uIComponent && !TextUtils.equals(next.getKey(), str)) {
                        it2.remove();
                        map.put(str, uIComponent);
                        return;
                    }
                }
                return;
            }
            Iterator<Map.Entry<String, UIComponent>> it3 = map.entrySet().iterator();
            while (it3.hasNext()) {
                if (it3.next().getValue() == uIComponent) {
                    it3.remove();
                    LJJJ(uIComponent);
                    return;
                }
            }
        }
    }

    public final void LJJJJIZL(LynxBaseUI lynxBaseUI, HashMap<Integer, UIComponent> map, JavaOnlyArray javaOnlyArray, int i) {
        if (this.LLILZIL && (lynxBaseUI instanceof UIComponent)) {
            int size = javaOnlyArray.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (i == javaOnlyArray.getInt(i2)) {
                    map.put(Integer.valueOf(i), lynxBaseUI);
                    return;
                }
            }
        }
    }

    public final void LJJJJJ(LynxBaseUI lynxBaseUI, HashMap<Integer, UIComponent> map, JavaOnlyArray javaOnlyArray, int i) {
        if (this.LLILZIL && (lynxBaseUI instanceof UIComponent)) {
            int size = javaOnlyArray.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (i == javaOnlyArray.getInt(i2)) {
                    map.put(Integer.valueOf(i), lynxBaseUI);
                    return;
                }
            }
        }
    }

    public final void LJJJI(int i, int i2, int i3, int i4, String str) {
        C1317510kOD c1317510kOD = new C1317510kOD(getSign(), "scrollend");
        c1317510kOD.LJ(i, i2, this.mView.getMeasuredHeight(), this.mView.getMeasuredWidth(), i - i3, i2 - i4);
        s sVar = this.mContext;
        if (sVar != null) {
            sVar.LLIZ.LIZIZ(c1317510kOD);
        }
    }
}
