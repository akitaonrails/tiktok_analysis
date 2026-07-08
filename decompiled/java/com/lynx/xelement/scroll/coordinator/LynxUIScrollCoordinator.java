package com.lynx.xelement.scroll.coordinator;

import X.AbstractC1311530kEZ;
import X.AbstractC1319290kR5;
import X.C0WZX;
import X.C1289620jfE;
import X.C1292490jjr;
import X.C1298530jtb;
import X.C1311130kDv;
import X.C1311420kEO;
import X.C1311730kEt;
import X.C1312920kGo;
import X.C1319360kRC;
import X.C1319460kRM;
import X.C16BC;
import X.C16G1;
import X.C16GX;
import X.C16GZ;
import X.C21543519Sv;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C786410Ut5;
import X.InterfaceC1311410kEN;
import X.InterfaceC1312540kGC;
import X.InterfaceC1324370kZH;
import X.InterfaceC1967107nB;
import X.InterfaceC20747116Gn;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.ARunnableS0S0200010_20;
import Y.ARunnableS120S0100000_20;
import Y.ARunnableS6S0100001_20;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.google.android.material.appbar.AppBarLayout$Behavior;
import com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior;
import com.lynx.base.log.LynxLog;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.UIGroup;
import com.lynx.tasm.behavior.ui.UIShadowProxy;
import com.lynx.tasm.behavior.ui.scroll.UIScrollView;
import com.lynx.tasm.featurecount.LynxFeatureCounter;
import com.lynx.xelement.scroll.coordinator.BaseScrollCoordinator;
import com.lynx.xelement.scroll.coordinator.LynxUIScrollCoordinator;
import com.lynx.xelement.scroll.coordinator.childitem.LynxUIScrollCoordinatorHeader;
import com.lynx.xelement.scroll.coordinator.childitem.LynxUIScrollCoordinatorSlot;
import com.lynx.xelement.scroll.coordinator.childitem.LynxUIScrollCoordinatorToolbar;
import com.zhiliaoapp.musically.R;
import j27.s;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: loaded from: classes21.dex */
public class LynxUIScrollCoordinator extends BaseScrollCoordinator<C1319360kRC, C1319460kRM> {
    public static final /* synthetic */ int LLJJIII = 0;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;
    public boolean LLJILJIL;
    public boolean LLJILJILJ;
    public LynxUI<?> LLJILLL;
    public LynxUI<?> LLJJ;
    public int LLJJI;

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, X.InterfaceC1311590kEf
    public final int getMemberScrollX() {
        return 0;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, X.InterfaceC1311590kEf
    public final int getScrollContainerDirection() {
        return 1;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final boolean isScrollContainer() {
        return true;
    }

    public final void LJJIJLIJ() {
        if (this.LL != 0 && this.LLJIJIL && this.LLJILJILJ) {
            C1319460kRM c1319460kRMLJJIIZI = LJJIIZI();
            c1319460kRMLJJIIZI.bringChildToFront(c1319460kRMLJJIIZI.getAppBarLayoutView());
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, X.InterfaceC1311590kEf
    public final int getMemberScrollY() {
        return ((C1319360kRC) ((AbstractC1319290kR5) this.mView).getAppBarLayout()).getTopAndBottomOffset();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, X.InterfaceC1311590kEf
    public final void onInvalidate() {
        if (this.mView == 0 || !isEnableNewGesture()) {
            return;
        }
        this.mView.postInvalidateOnAnimation();
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void destroy() {
        super.destroy();
        LJJIIZI().getAppBarLayout().setScrollListener(null);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, X.InterfaceC1311590kEf
    public final Map<Integer, AbstractC1311530kEZ> getGestureHandlers() {
        return super.getGestureHandlers();
    }

    @Override // com.lynx.xelement.scroll.coordinator.BaseScrollCoordinator
    public final int LJJIJ() {
        return this.LLJJI;
    }

    public static boolean LJJIJL(InterfaceC1311410kEN interfaceC1311410kEN) {
        if ((interfaceC1311410kEN instanceof LynxUIScrollCoordinatorToolbar) && !((LynxBaseUI) interfaceC1311410kEN).isUserInteractionEnabled()) {
            return true;
        }
        if (interfaceC1311410kEN != null && !(interfaceC1311410kEN instanceof LynxUIScrollCoordinator)) {
            return LJJIJL(interfaceC1311410kEN.parent());
        }
        return false;
    }

    public final boolean LJJIJIL(InterfaceC1311410kEN interfaceC1311410kEN) {
        if (interfaceC1311410kEN instanceof UIScrollView) {
            return true;
        }
        if (interfaceC1311410kEN != null && !(interfaceC1311410kEN instanceof LynxUIScrollCoordinator)) {
            return LJJIJIL(interfaceC1311410kEN.parent());
        }
        return false;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void afterPropsUpdated(C1311730kEt c1311730kEt) {
        super.afterPropsUpdated(c1311730kEt);
        if (this.mEnableScrollMonitor) {
            LJJIIZI().getAppBarLayout().setScrollListener(new InterfaceC20747116Gn() { // from class: X.0kP7
                @Override // X.InterfaceC20747116Gn
                public final void LIZJ() {
                    LynxUIScrollCoordinator lynxUIScrollCoordinator = this.LIZ;
                    lynxUIScrollCoordinator.mContext.LLJJIJI.LJIIJJI(new C1318050kP5(lynxUIScrollCoordinator.mView, lynxUIScrollCoordinator.getTagName(), this.LIZ.mScrollMonitorTag));
                }

                @Override // X.InterfaceC20747116Gn
                public final void LJIJJ() {
                    LynxUIScrollCoordinator lynxUIScrollCoordinator = this.LIZ;
                    lynxUIScrollCoordinator.mContext.LLJJIJI.LJJII(new C1318050kP5(lynxUIScrollCoordinator.mView, lynxUIScrollCoordinator.getTagName(), this.LIZ.mScrollMonitorTag));
                }

                @Override // X.InterfaceC20747116Gn
                public final void LJIJJLI() {
                    LynxUIScrollCoordinator lynxUIScrollCoordinator = this.LIZ;
                    lynxUIScrollCoordinator.mContext.LLJJIJI.LJJIII(new C1318050kP5(lynxUIScrollCoordinator.mView, lynxUIScrollCoordinator.getTagName(), this.LIZ.mScrollMonitorTag));
                }
            });
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void consumeGesture(boolean z) {
        ((C1319460kRM) this.mView).setConsumeGesture(z);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final View createView(Context context) {
        Activity activityLIZ = C1298530jtb.LIZ(this.mContext);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("createView start: ");
        sbLIZ.append(this);
        sbLIZ.append(' ');
        sbLIZ.append(context);
        sbLIZ.append(" realActivity is: ");
        sbLIZ.append(activityLIZ);
        LynxLog.i("ScrollCoordinator", C2188811AlT.LIZIZ(sbLIZ));
        if (context == null) {
            return null;
        }
        this.LL = new C1319460kRM(context, this);
        C1319460kRM c1319460kRMLJJIIZI = LJJIIZI();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1319460kRMLJJIIZI);
        c1319460kRMLJJIIZI.setLayoutParams(layoutParams);
        LJJIIZI().getAppBarLayout().LIZ(new InterfaceC1324370kZH() { // from class: X.0kR3
            @Override // X.InterfaceC1324380kZI
            public final void LLZZJLIL(C16GX c16gx, int i) {
                int height;
                this.LJJIJIIJI(c16gx, i);
                if (Math.abs(this.LLILZIL - i) > this.LJJIJ()) {
                    this.recognizeGesturere();
                    this.LLILZIL = i;
                }
                C1298340jtI c1298340jtILJIIJJI = this.mContext.LJIIJJI();
                if (c1298340jtILJIIJJI != null) {
                    C1289620jfE.LIZLLL(new ARunnableS120S0100000_20(c1298340jtILJIIJJI, 221));
                }
                BaseScrollCoordinator<AbstractC1319380kRE, AbstractC1319290kR5<Object>> baseScrollCoordinator = this;
                if (!baseScrollCoordinator.LLILLJJLI || (height = baseScrollCoordinator.LJJIIZI().getCollapsingToolbar().getHeight() - this.LJJIIZI().getPinnedToolbar().getHeight()) == 0) {
                    return;
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("onOffsetChanged: ");
                sbLIZ2.append(i);
                sbLIZ2.append(", height = ");
                sbLIZ2.append(height);
                sbLIZ2.append(' ');
                LynxLog.d("ScrollCoordinator", C2188811AlT.LIZIZ(sbLIZ2));
                float f = height;
                float fAbs = Math.abs(i) / f;
                float fAbs2 = Math.abs(this.LLILLL - fAbs);
                BaseScrollCoordinator<AbstractC1319380kRE, AbstractC1319290kR5<Object>> baseScrollCoordinator2 = this;
                if ((fAbs2 >= baseScrollCoordinator2.LLILZ || fAbs >= 1.0f) && baseScrollCoordinator2.LLILLL != fAbs) {
                    C1298720jtu c1298720jtu = baseScrollCoordinator2.mContext.LLIZ;
                    C1289960jfm c1289960jfm = new C1289960jfm(baseScrollCoordinator2.getSign(), "offset");
                    BaseScrollCoordinator<AbstractC1319380kRE, AbstractC1319290kR5<Object>> baseScrollCoordinator3 = this;
                    baseScrollCoordinator3.getClass();
                    if (baseScrollCoordinator3 instanceof LynxUIScrollCoordinator) {
                        c1289960jfm.LIZIZ(Integer.valueOf((int) ((Math.abs(i) / baseScrollCoordinator3.mContext.getResources().getDisplayMetrics().density) + 0.5f)), "offset");
                        c1289960jfm.LIZIZ(Integer.valueOf((int) ((f / baseScrollCoordinator3.mContext.getResources().getDisplayMetrics().density) + 0.5f)), "height");
                    } else {
                        c1289960jfm.LIZIZ(C786410Ut5.k4(Locale.ENGLISH, "%.5f", Arrays.copyOf(new Object[]{Float.valueOf(fAbs)}, 1)), "offset");
                    }
                    c1298720jtu.LIZIZ(c1289960jfm);
                    this.LLILLL = fAbs;
                }
            }
        });
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("createView end: ");
        sbLIZ2.append(this);
        sbLIZ2.append(", ");
        sbLIZ2.append(LJJIIZI());
        LynxLog.i("ScrollCoordinator", C2188811AlT.LIZIZ(sbLIZ2));
        return LJJIIZI();
    }

    @InterfaceC1967107nB
    public final void getScrollInfo(Callback callback) {
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        javaOnlyMap.putInt("scrollX", 0);
        javaOnlyMap.putInt("scrollY", C1292490jjr.LJI(Math.abs(((C1319360kRC) ((AbstractC1319290kR5) this.mView).getAppBarLayout()).getTopAndBottomOffset()), this.mContext));
        javaOnlyMap.putInt("scrollRange", C1292490jjr.LJI(LJJIIZI().getCollapsingToolbar().getHeight() - LJJIIZI().getPinnedToolbar().getHeight(), this.mContext));
        callback.invoke(0, javaOnlyMap);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void interceptGesture(boolean z) {
        ((C1319460kRM) this.mView).setInterceptGesture(z);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, X.InterfaceC1311590kEf
    public final boolean isAtBorder(boolean z) {
        if (((C1319360kRC) ((AbstractC1319290kR5) this.mView).getAppBarLayout()).getTopAndBottomOffset() != 0 && ((C1319360kRC) ((AbstractC1319290kR5) this.mView).getAppBarLayout()).getTopAndBottomOffset() != ((AbstractC1319290kR5) this.mView).getAppBarLayout().getTotalScrollRange()) {
            return false;
        }
        return true;
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void removeChild(LynxBaseUI lynxBaseUI) {
        if (lynxBaseUI instanceof LynxUI) {
            this.mChildren.remove(lynxBaseUI);
            lynxBaseUI.setParent(null);
            if (lynxBaseUI instanceof LynxUIScrollCoordinatorToolbar) {
                C1319460kRM c1319460kRMLJJIIZI = LJJIIZI();
                T t = ((LynxUI) lynxBaseUI).mView;
                C786410Ut5.LLILLJJLI(c1319460kRMLJJIIZI.getToolbarView(), 8);
                C786410Ut5.LJJLIIIJJI(c1319460kRMLJJIIZI.getToolbarView(), t);
                return;
            }
            if (lynxBaseUI instanceof LynxUIScrollCoordinatorHeader) {
                C1319460kRM c1319460kRMLJJIIZI2 = LJJIIZI();
                View view = ((LynxUI) lynxBaseUI).mView;
                C21543519Sv collapsingToolbarView = c1319460kRMLJJIIZI2.getCollapsingToolbarView();
                RemoveViewCausedNPEChecker.recordViewRemovedPoint(collapsingToolbarView, view);
                collapsingToolbarView.removeView(view);
                return;
            }
            if (!(lynxBaseUI instanceof LynxUIScrollCoordinatorSlot)) {
                return;
            }
            C1319460kRM c1319460kRMLJJIIZI3 = LJJIIZI();
            View view2 = ((LynxUI) lynxBaseUI).mView;
            c1319460kRMLJJIIZI3.getClass();
            RemoveViewCausedNPEChecker.recordViewRemovedPoint(c1319460kRMLJJIIZI3, view2);
            c1319460kRMLJJIIZI3.removeView(view2);
        }
    }

    @InterfaceC1312540kGC(name = "android-header-over-slot")
    public final void setAndroidHeaderOverSlot(boolean z) {
        this.LLJILJILJ = z;
        LJJIJLIJ();
    }

    @InterfaceC1312540kGC(defaultInt = 0, name = "android-header-tap-slop")
    public final void setAndroidHeaderTapSlop(int i) {
        this.LLJJI = i;
    }

    @InterfaceC1312540kGC(defaultBoolean = true, name = "android-enable-touch-stop-fling")
    public final void setEnableTouchStopFling(boolean z) {
        ((C1319360kRC) LJJIIZI().findViewById(R.id.b6m)).setTouchStopFlingEnabled(z);
        if (!z) {
            LynxFeatureCounter.LIZ(81, this.mContext.LLJLILLLLZIIL);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void setGestureDetectors(Map<Integer, C1311420kEO> map) {
        super.setGestureDetectors(map);
    }

    @InterfaceC1312540kGC(name = "header-over-slot")
    public final void setHeaderOverSlot(boolean z) {
        this.LLJILJILJ = z;
        LJJIJLIJ();
    }

    @InterfaceC1312540kGC(defaultBoolean = false, name = "header-scrollview-enable")
    public final void setHeaderScrollViewEnable(boolean z) {
        this.LLJI = z;
    }

    @InterfaceC1312540kGC(defaultBoolean = true, name = "experimental-header-slot-overflow-hit-test")
    public final void setHeaderSlotOverflowHitTest(boolean z) {
        this.LLJILJIL = z;
    }

    @InterfaceC1312540kGC(defaultBoolean = false, name = "android-nested-scroll-as-child")
    public final void setNestedScrollAsChild(boolean z) {
        LJJIIZI().setNestedScrollAsChild(z);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void setOverflow(Integer num) {
        boolean z;
        super.setOverflow(num);
        if (num != null && num.intValue() == 1) {
            z = false;
        } else {
            z = true;
        }
        this.LLJIJIL = z;
        boolean z2 = !z;
        ((ViewGroup) this.mView).setClipChildren(z2);
        LJJIIZI().LLJLIL.setClipChildren(z2);
        LJJIJLIJ();
    }

    @InterfaceC1312540kGC(defaultBoolean = true, name = "tab-movable-enable")
    public final void setTabMovableEnable(boolean z) {
        LJJIIZI().getAppBarLayout().setToolbarDragEnabled(z);
    }

    @InterfaceC1312540kGC(defaultBoolean = true, name = "toolbar-interaction-enable")
    public final void setToolbarInteractionEnable(boolean z) {
        this.LLJ = z;
    }

    public LynxUIScrollCoordinator(s sVar, Object obj) {
        super(sVar, obj);
        this.LLJ = true;
        this.LLJILJIL = true;
    }

    @Override // com.lynx.xelement.scroll.coordinator.BaseScrollCoordinator
    public final void LJJIJIIJI(C16GX c16gx, int i) {
        boolean z;
        if (c16gx == null) {
            return;
        }
        if (Math.abs(i) >= c16gx.getTotalScrollRange()) {
            z = true;
        } else {
            z = false;
        }
        this.LLIZLLLIL = z;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, X.InterfaceC1311590kEf
    public final boolean canConsumeGesture(float f, float f2) {
        if (!isEnableNewGesture() || this.mView == 0) {
            return false;
        }
        if (isAtBorder(true) && f2 < 0.0f) {
            return false;
        }
        if (isAtBorder(false) && f2 > 0.0f) {
            return false;
        }
        return true;
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void insertChild(LynxBaseUI lynxBaseUI, int i) {
        if (lynxBaseUI instanceof LynxUI) {
            ListProtector.add(this.mChildren, i, lynxBaseUI);
            LynxUI<?> lynxUI = (LynxUI) lynxBaseUI;
            lynxUI.setParent(this);
            if (lynxBaseUI instanceof LynxUIScrollCoordinatorToolbar) {
                this.LLJJ = lynxUI;
                C1319460kRM c1319460kRMLJJIIZI = LJJIIZI();
                View view = ((LynxUIScrollCoordinatorToolbar) lynxBaseUI).mView;
                C786410Ut5.LLILLJJLI(c1319460kRMLJJIIZI.LLJLL, 0);
                c1319460kRMLJJIIZI.LLJLL.setPaddingRelative(0, 0, 0, 0);
                c1319460kRMLJJIIZI.LLJLL.addView(view);
                LJJIIZI().LLJLL.setClipChildren(!r6.LL);
                return;
            }
            if (lynxBaseUI instanceof LynxUIScrollCoordinatorHeader) {
                this.LLJILLL = lynxUI;
                LJJIIZI().LLJLILLLLZIIL.addView(((LynxUIScrollCoordinatorHeader) lynxBaseUI).mView, 0);
                LJJIIZI().LLJLILLLLZIIL.setClipChildren(!r6.LL);
                return;
            }
            if (!(lynxBaseUI instanceof LynxUIScrollCoordinatorSlot)) {
                return;
            }
            C1319460kRM c1319460kRMLJJIIZI2 = LJJIIZI();
            View view2 = ((LynxUI) lynxBaseUI).mView;
            c1319460kRMLJJIIZI2.getClass();
            C16G1 c16g1 = new C16G1(new ViewGroup.LayoutParams(-1, -1));
            c16g1.LIZIZ(new AppBarLayout$ScrollingViewBehavior());
            C786410Ut5.W5(view2, c16g1);
            c1319460kRMLJJIIZI2.addView(view2);
            LJJIJLIJ();
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, X.InterfaceC1311590kEf
    public final void onGestureScrollBy(float f, float f2) {
        if (!isEnableNewGesture()) {
            return;
        }
        C1289620jfE.LIZLLL(new ARunnableS6S0100001_20(f2, this, 2));
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final float[] scrollBy(float f, float f2) {
        float[] fArr = new float[4];
        BaseScrollCoordinator.LJJIJIIJIL(this, (int) f2);
        if (Math.abs(f) > Float.MIN_VALUE || Math.abs(f2) > Float.MIN_VALUE) {
            recognizeGesturere();
        }
        fArr[0] = 0.0f;
        float fAbs = Math.abs(((C1319360kRC) ((AbstractC1319290kR5) this.mView).getAppBarLayout()).getTopAndBottomOffset());
        fArr[1] = fAbs;
        fArr[2] = f;
        fArr[3] = f2 - fAbs;
        return fArr;
    }

    @InterfaceC1967107nB
    public final void setFoldExpanded(ReadableMap readableMap, Callback callback) throws Throwable {
        int iLIZLLL;
        boolean z;
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        javaOnlyMap.put("success", Boolean.FALSE);
        if (readableMap.hasKey("offset")) {
            String string = readableMap.getString("offset", "");
            if (!u.LJIIZILJ(string, "px", false) && !u.LJIIZILJ(string, "rpx", false)) {
                iLIZLLL = -1;
            } else {
                iLIZLLL = (int) C1312920kGo.LIZLLL(string, 0.0f, -1.0f, this.mContext.LLJJJ);
            }
            if (readableMap.hasKey("smooth")) {
                z = readableMap.getBoolean("smooth");
            } else {
                z = true;
            }
            C1319460kRM c1319460kRMLJJIIZI = LJJIIZI();
            c1319460kRMLJJIIZI.LJJ();
            C1319360kRC appBarLayoutView = c1319460kRMLJJIIZI.getAppBarLayoutView();
            ScrollCoordinatorAppBarLayout$Behavior scrollCoordinatorAppBarLayout$Behavior = (ScrollCoordinatorAppBarLayout$Behavior) appBarLayoutView.getBehavior();
            scrollCoordinatorAppBarLayout$Behavior.LIZIZ(appBarLayoutView);
            scrollCoordinatorAppBarLayout$Behavior.LIZ = false;
            scrollCoordinatorAppBarLayout$Behavior.LIZIZ = false;
            if (z) {
                C1319360kRC appBarLayout = LJJIIZI().getAppBarLayout();
                ViewGroup.LayoutParams layoutParams = appBarLayout.getLayoutParams();
                if (layoutParams != null) {
                    C16BC c16bc = ((C16G1) layoutParams).LIZ;
                    if (c16bc instanceof AppBarLayout$Behavior) {
                        if (iLIZLLL < 0) {
                            try {
                                iLIZLLL = (int) (((double) appBarLayout.getTotalScrollRange()) * (((double) 1) - (-1.0d)));
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                LynxLog.e("ScrollCoordinator", "invoke animateOffsetMethod error " + e.getMessage());
                            }
                        }
                        int i = -iLIZLLL;
                        int i2 = -appBarLayout.getTotalScrollRange();
                        if (i < i2) {
                            i = i2;
                        }
                        Method method = (Method) this.LLIZ.getValue();
                        if (method != null) {
                            C2204961BRm.a0(method, c16bc, new Object[]{LJJIIZI(), appBarLayout, Integer.valueOf(i), 0}, new C0WZX("dzBzEg4jUdKSTVItQB+BaKOt6GY3ryuBJOo+RAm2WIuBYakPsr0KYi6emfORrtPYqNLaCoXlO6Rl1w==", null));
                        }
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
                }
            } else {
                BaseScrollCoordinator.LJJIJIIJIL(this, iLIZLLL);
            }
            javaOnlyMap.put("success", Boolean.TRUE);
        } else {
            javaOnlyMap.put("msg", "no index key");
        }
        if (callback != null) {
            callback.invoke(0, javaOnlyMap);
        }
    }

    @InterfaceC1967107nB
    public final void scrollBy(ReadableMap readableMap, Callback callback) {
        if (callback == null) {
            return;
        }
        if (readableMap != null && readableMap.hasKey("offset")) {
            C1289620jfE.LIZLLL(new ARunnableS0S0200010_20(this, C1311130kDv.LIZ(readableMap.getDouble("offset", 0.0d)), callback, 1));
        } else {
            callback.invoke(4, "Invoke scrollBy failed due to param is null");
        }
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup
    public final InterfaceC1311410kEN findUIWithCustomLayout(float f, float f2, UIGroup<?> uIGroup) {
        InterfaceC1311410kEN interfaceC1311410kENFindUIWithCustomLayout = super.findUIWithCustomLayout(f, f2, uIGroup);
        if (!this.LLJ && LJJIJL(interfaceC1311410kENFindUIWithCustomLayout)) {
            Iterator<LynxBaseUI> it2 = this.mChildren.iterator();
            while (it2.hasNext()) {
                if ((it2.next() instanceof LynxUIScrollCoordinatorHeader) && !this.LLIZLLLIL) {
                    HashMap map = new HashMap();
                    for (int childCount = getChildCount() - 1; -1 < childCount; childCount--) {
                        LynxBaseUI childAt = getChildAt(childCount);
                        if (!(childAt instanceof LynxUIScrollCoordinatorToolbar)) {
                            if (childAt instanceof UIShadowProxy) {
                                childAt = ((UIShadowProxy) childAt).LL;
                            }
                            if (childAt instanceof LynxUI) {
                                map.put(((LynxUI) childAt).mView, childAt);
                            }
                        }
                    }
                    interfaceC1311410kENFindUIWithCustomLayout = findUIWithCustomLayoutByChildren(f, f2, this, map);
                }
            }
        } else if (this.LLJI) {
            boolean z = !LJJIJIL(interfaceC1311410kENFindUIWithCustomLayout);
            ViewGroup.LayoutParams layoutParams = LJJIIZI().getCollapsingToolbar().getLayoutParams();
            if (layoutParams != null) {
                C16GZ c16gz = (C16GZ) layoutParams;
                if (z) {
                    c16gz.LIZ |= 1;
                } else {
                    c16gz.LIZ = (c16gz.LIZ >> 1) << 1;
                }
                C21543519Sv collapsingToolbar = LJJIIZI().getCollapsingToolbar();
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(collapsingToolbar);
                collapsingToolbar.setLayoutParams(c16gz);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type com.google.android.material.appbar.AppBarLayout.LayoutParams");
            }
        }
        return interfaceC1311410kENFindUIWithCustomLayout;
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup
    public final boolean isTransformedTouchPointInView(float[] fArr, View view, View view2, float[] fArr2, Map<View, LynxUI<?>> map) {
        LynxUI<?> lynxUI;
        if (!this.LLJILJIL) {
            return super.isTransformedTouchPointInView(fArr, view, view2, fArr2, map);
        }
        if (view == null || view2 == null) {
            return false;
        }
        float[] targetPoint = getTargetPoint(fArr[0], fArr[1], view.getScrollX(), view.getScrollY(), view2, view2.getMatrix());
        fArr2[0] = targetPoint[0];
        fArr2[1] = targetPoint[1];
        if ((map != null && (lynxUI = map.get(view2)) != null) || ((Intrinsics.LJFF(view2.getClass(), C1319360kRC.class) || Intrinsics.LJFF(view2.getClass(), C21543519Sv.class)) && (lynxUI = this.LLJILLL) != null && (lynxUI.containsPoint(fArr2[0], fArr2[1]) || (lynxUI = this.LLJJ) != null))) {
            return lynxUI.containsPoint(fArr2[0], fArr2[1]);
        }
        float f = fArr2[0];
        if (f < 0.0f || f >= view2.getRight() - view2.getLeft()) {
            return false;
        }
        float f2 = fArr2[1];
        if (f2 < 0.0f || f2 >= view2.getBottom() - view2.getTop()) {
            return false;
        }
        return true;
    }
}
