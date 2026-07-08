package com.bytedance.ies.xelement.viewpager.foldview;

import X.AbstractC1311530kEZ;
import X.AbstractC1319300kR6;
import X.C1289620jfE;
import X.C1292490jjr;
import X.C1298530jtb;
import X.C1311130kDv;
import X.C1311420kEO;
import X.C1311730kEt;
import X.C1312920kGo;
import X.C1319350kRB;
import X.C1319470kRN;
import X.C16G1;
import X.C16GX;
import X.C16GZ;
import X.C21543519Sv;
import X.C2188811AlT;
import X.C786410Ut5;
import X.InterfaceC1311410kEN;
import X.InterfaceC1312540kGC;
import X.InterfaceC1967107nB;
import X.InterfaceC20747016Gm;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.ARunnableS0S0200010_20;
import Y.ARunnableS6S0100001_20;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.xelement.viewpager.CustomAppBarLayoutNG$Behavior;
import com.bytedance.ies.xelement.viewpager.childitem.LynxFoldHeader;
import com.bytedance.ies.xelement.viewpager.childitem.LynxFoldSlot;
import com.bytedance.ies.xelement.viewpager.childitem.LynxFoldToolbar;
import com.bytedance.ies.xelement.viewpager.foldview.LynxFoldViewNG;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
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
import com.zhiliaoapp.musically.R;
import j27.s;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: loaded from: classes21.dex */
public final class LynxFoldViewNG extends BaseLynxFoldView<C1319350kRB, C1319470kRN> {
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

    public LynxFoldViewNG() {
        throw null;
    }

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

    public final void LJJJ() {
        if (this.LL != 0 && this.LLJIJIL && this.LLJILJILJ) {
            C1319470kRN c1319470kRNLJJIJIIJIL = LJJIJIIJIL();
            c1319470kRNLJJIJIIJIL.bringChildToFront(c1319470kRNLJJIJIIJIL.getMAppBarLayout());
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, X.InterfaceC1311590kEf
    public final int getMemberScrollY() {
        return ((C1319350kRB) ((AbstractC1319300kR6) this.mView).getAppBarLayout()).getTopAndBottomOffset();
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
        LJJIJIIJIL().getAppBarLayout().setScrollListener(null);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, X.InterfaceC1311590kEf
    public final Map<Integer, AbstractC1311530kEZ> getGestureHandlers() {
        return super.getGestureHandlers();
    }

    @Override // com.bytedance.ies.xelement.viewpager.foldview.BaseLynxFoldView
    public final int LJJIJIIJI() {
        return this.LLJJI;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onPropsUpdated() {
        super.onPropsUpdated();
    }

    public static boolean LJJIZ(InterfaceC1311410kEN interfaceC1311410kEN) {
        if ((interfaceC1311410kEN instanceof LynxFoldToolbar) && !((LynxBaseUI) interfaceC1311410kEN).isUserInteractionEnabled()) {
            return true;
        }
        if (interfaceC1311410kEN != null && !(interfaceC1311410kEN instanceof LynxFoldViewNG)) {
            return LJJIZ(interfaceC1311410kEN.parent());
        }
        return false;
    }

    public final boolean LJJIJLIJ(InterfaceC1311410kEN interfaceC1311410kEN) {
        if (interfaceC1311410kEN instanceof UIScrollView) {
            return true;
        }
        if (interfaceC1311410kEN != null && !(interfaceC1311410kEN instanceof LynxFoldViewNG)) {
            return LJJIJLIJ(interfaceC1311410kEN.parent());
        }
        return false;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void afterPropsUpdated(C1311730kEt c1311730kEt) {
        super.afterPropsUpdated(c1311730kEt);
        if (this.mEnableScrollMonitor) {
            LJJIJIIJIL().getAppBarLayout().setScrollListener(new InterfaceC20747016Gm() { // from class: X.0kP6
                @Override // X.InterfaceC20747016Gm
                public final void LIZJ() {
                    LynxFoldViewNG lynxFoldViewNG = this.LIZ;
                    lynxFoldViewNG.mContext.LLJJIJI.LJIIJJI(new C1318050kP5(lynxFoldViewNG.mView, lynxFoldViewNG.getTagName(), this.LIZ.mScrollMonitorTag));
                }

                @Override // X.InterfaceC20747016Gm
                public final void LJIJJ() {
                    LynxFoldViewNG lynxFoldViewNG = this.LIZ;
                    lynxFoldViewNG.mContext.LLJJIJI.LJJII(new C1318050kP5(lynxFoldViewNG.mView, lynxFoldViewNG.getTagName(), this.LIZ.mScrollMonitorTag));
                }

                @Override // X.InterfaceC20747016Gm
                public final void LJIJJLI() {
                    LynxFoldViewNG lynxFoldViewNG = this.LIZ;
                    lynxFoldViewNG.mContext.LLJJIJI.LJJIII(new C1318050kP5(lynxFoldViewNG.mView, lynxFoldViewNG.getTagName(), this.LIZ.mScrollMonitorTag));
                }
            });
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void consumeGesture(boolean z) {
        C1319470kRN c1319470kRN = (C1319470kRN) this.mView;
        c1319470kRN.LLLFZ = Boolean.valueOf(z);
        if (z) {
            c1319470kRN.LLLFFI = false;
        }
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
        LynxLog.i("LynxFoldViewNG", C2188811AlT.LIZIZ(sbLIZ));
        if (context == null) {
            return null;
        }
        this.LL = new C1319470kRN(context, this);
        LJJIJIL();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("createView end: ");
        sbLIZ2.append(this);
        sbLIZ2.append(", ");
        sbLIZ2.append(LJJIJIIJIL());
        LynxLog.i("LynxFoldViewNG", C2188811AlT.LIZIZ(sbLIZ2));
        return LJJIJIIJIL();
    }

    @InterfaceC1967107nB
    public final void getScrollInfo(Callback callback) {
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        javaOnlyMap.putInt("scrollX", 0);
        javaOnlyMap.putInt("scrollY", C1292490jjr.LJI(Math.abs(((C1319350kRB) ((AbstractC1319300kR6) this.mView).getAppBarLayout()).getTopAndBottomOffset()), this.mContext));
        javaOnlyMap.putInt("scrollRange", C1292490jjr.LJI(LJJIJIIJIL().getCollapsingToolbarLayout().getHeight() - LJJIJIIJIL().getFoldToolBar().getHeight(), this.mContext));
        callback.invoke(0, javaOnlyMap);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void interceptGesture(boolean z) {
        ((C1319470kRN) this.mView).LLLI = Boolean.valueOf(z);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, X.InterfaceC1311590kEf
    public final boolean isAtBorder(boolean z) {
        if (((C1319350kRB) ((AbstractC1319300kR6) this.mView).getAppBarLayout()).getTopAndBottomOffset() != 0 && ((C1319350kRB) ((AbstractC1319300kR6) this.mView).getAppBarLayout()).getTopAndBottomOffset() != ((AbstractC1319300kR6) this.mView).getAppBarLayout().getTotalScrollRange()) {
            return false;
        }
        return true;
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void removeChild(LynxBaseUI lynxBaseUI) {
        if (lynxBaseUI instanceof LynxUI) {
            this.mChildren.remove(lynxBaseUI);
            lynxBaseUI.setParent(null);
            if (lynxBaseUI instanceof LynxFoldToolbar) {
                C1319470kRN c1319470kRNLJJIJIIJIL = LJJIJIIJIL();
                T t = ((LynxUI) lynxBaseUI).mView;
                C786410Ut5.LLILLJJLI(c1319470kRNLJJIJIIJIL.getMFoldToolBar(), 8);
                C786410Ut5.LJJLIIIJJI(c1319470kRNLJJIJIIJIL.getMFoldToolBar(), t);
                return;
            }
            if (lynxBaseUI instanceof LynxFoldHeader) {
                C1319470kRN c1319470kRNLJJIJIIJIL2 = LJJIJIIJIL();
                View view = ((LynxUI) lynxBaseUI).mView;
                C21543519Sv mCollapsingToolbarLayout = c1319470kRNLJJIJIIJIL2.getMCollapsingToolbarLayout();
                RemoveViewCausedNPEChecker.recordViewRemovedPoint(mCollapsingToolbarLayout, view);
                mCollapsingToolbarLayout.removeView(view);
                return;
            }
            if (!(lynxBaseUI instanceof LynxFoldSlot)) {
                return;
            }
            C1319470kRN c1319470kRNLJJIJIIJIL3 = LJJIJIIJIL();
            View view2 = ((LynxUI) lynxBaseUI).mView;
            c1319470kRNLJJIJIIJIL3.getClass();
            RemoveViewCausedNPEChecker.recordViewRemovedPoint(c1319470kRNLJJIJIIJIL3, view2);
            c1319470kRNLJJIJIIJIL3.removeView(view2);
        }
    }

    @InterfaceC1312540kGC(name = "android-header-over-slot")
    public final void setAndroidHeaderOverSlot(boolean z) {
        this.LLJILJILJ = z;
        LJJJ();
    }

    @InterfaceC1312540kGC(defaultInt = 0, name = "android-header-tap-slop")
    public final void setAndroidHeaderTapSlop(int i) {
        this.LLJJI = i;
    }

    @InterfaceC1312540kGC(defaultBoolean = true, name = "android-enable-touch-stop-fling")
    public final void setEnableTouchStopFling(boolean z) {
        ((C1319350kRB) LJJIJIIJIL().findViewById(R.id.b6m)).setEnableTouchStopFling(z);
        if (!z) {
            LynxFeatureCounter.LIZ(81, this.mContext.LLJLILLLLZIIL);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void setGestureDetectors(Map<Integer, C1311420kEO> map) {
        super.setGestureDetectors(map);
    }

    @InterfaceC1312540kGC(defaultBoolean = false, name = "header-scrollview-enable")
    public final void setHeaderScrollViewEnable(boolean z) {
        this.LLJI = z;
    }

    @InterfaceC1312540kGC(defaultBoolean = true, name = "experimental-header-slot-overflow-hit-test")
    public final void setIsHeaderSlotOverflowHitTest(boolean z) {
        this.LLJILJIL = z;
    }

    @InterfaceC1312540kGC(defaultBoolean = false, name = "android-nested-scroll-as-child")
    public final void setNestedScrollAsChild(boolean z) {
        LJJIJIIJIL().setNestedScrollAsChild(z);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void setOverflow(Integer num) {
        super.setOverflow(num);
        Object obj = num;
        if (num == null) {
            obj = Boolean.FALSE;
        }
        boolean z = !Intrinsics.LJFF(obj, 1);
        this.LLJIJIL = z;
        boolean z2 = !z;
        ((ViewGroup) this.mView).setClipChildren(z2);
        LJJIJIIJIL().LLJLIL.setClipChildren(z2);
        LJJJ();
    }

    @InterfaceC1312540kGC(defaultBoolean = true, name = "tab-movable-enable")
    public final void setTabMovableEnable(boolean z) {
        LJJIJIIJIL().getAppBarLayout().setIsEnableTabbarDrag(z);
    }

    @InterfaceC1312540kGC(defaultBoolean = true, name = "toolbar-interaction-enable")
    public final void setToolbarInteractionEnable(boolean z) {
        this.LLJ = z;
    }

    @InterfaceC1312540kGC(name = "header-over-slot")
    public final void setUnifiedHeaderOverSlot(boolean z) {
        this.LLJILJILJ = z;
        LJJJ();
    }

    public LynxFoldViewNG(s sVar, Object obj) {
        super(sVar, obj);
        this.LLJ = true;
        this.LLJILJIL = true;
    }

    @Override // com.bytedance.ies.xelement.viewpager.foldview.BaseLynxFoldView
    public final void LJJIJL(C16GX c16gx, int i) {
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
            if (lynxBaseUI instanceof LynxFoldToolbar) {
                this.LLJJ = lynxUI;
                C1319470kRN c1319470kRNLJJIJIIJIL = LJJIJIIJIL();
                View view = ((LynxFoldToolbar) lynxBaseUI).mView;
                C786410Ut5.LLILLJJLI(c1319470kRNLJJIJIIJIL.LLJLL, 0);
                c1319470kRNLJJIJIIJIL.LLJLL.setPaddingRelative(0, 0, 0, 0);
                c1319470kRNLJJIJIIJIL.LLJLL.addView(view);
                LJJIJIIJIL().LLJLL.setClipChildren(!r6.LL);
                return;
            }
            if (lynxBaseUI instanceof LynxFoldHeader) {
                this.LLJILLL = lynxUI;
                LJJIJIIJIL().LLJLILLLLZIIL.addView(((LynxFoldHeader) lynxBaseUI).mView, 0);
                LJJIJIIJIL().LLJLILLLLZIIL.setClipChildren(!r6.LL);
                return;
            }
            if (!(lynxBaseUI instanceof LynxFoldSlot)) {
                return;
            }
            C1319470kRN c1319470kRNLJJIJIIJIL2 = LJJIJIIJIL();
            View view2 = ((LynxUI) lynxBaseUI).mView;
            c1319470kRNLJJIJIIJIL2.getClass();
            C16G1 c16g1 = new C16G1(new ViewGroup.LayoutParams(-1, -1));
            c16g1.LIZIZ(new AppBarLayout$ScrollingViewBehavior());
            C786410Ut5.W5(view2, c16g1);
            c1319470kRNLJJIJIIJIL2.addView(view2);
            LJJJ();
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, X.InterfaceC1311590kEf
    public final void onGestureScrollBy(float f, float f2) {
        if (!isEnableNewGesture()) {
            return;
        }
        C1289620jfE.LIZLLL(new ARunnableS6S0100001_20(f2, this, 0));
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final float[] scrollBy(float f, float f2) throws Throwable {
        float[] fArr = new float[4];
        BaseLynxFoldView.LJJIJ(this, 0.0d, (int) f2, 1);
        if (Math.abs(f) > Float.MIN_VALUE || Math.abs(f2) > Float.MIN_VALUE) {
            recognizeGesturere();
        }
        fArr[0] = 0.0f;
        float fAbs = Math.abs(((C1319350kRB) ((AbstractC1319300kR6) this.mView).getAppBarLayout()).getTopAndBottomOffset());
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
            C1319470kRN c1319470kRNLJJIJIIJIL = LJJIJIIJIL();
            c1319470kRNLJJIJIIJIL.LJJ();
            C1319350kRB mAppBarLayout = c1319470kRNLJJIJIIJIL.getMAppBarLayout();
            CustomAppBarLayoutNG$Behavior customAppBarLayoutNG$Behavior = (CustomAppBarLayoutNG$Behavior) mAppBarLayout.getBehavior();
            customAppBarLayoutNG$Behavior.LIZIZ(mAppBarLayout);
            customAppBarLayoutNG$Behavior.LIZ = false;
            customAppBarLayoutNG$Behavior.LIZIZ = false;
            if (z) {
                BaseLynxFoldView.LJJIIZI(this, 0.0d, iLIZLLL, 1);
            } else {
                BaseLynxFoldView.LJJIJ(this, 0.0d, iLIZLLL, 1);
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
            C1289620jfE.LIZLLL(new ARunnableS0S0200010_20(this, C1311130kDv.LIZ(readableMap.getDouble("offset", 0.0d)), callback, 0));
        } else {
            callback.invoke(4, "Invoke scrollBy failed due to param is null");
        }
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup
    public final InterfaceC1311410kEN findUIWithCustomLayout(float f, float f2, UIGroup<?> uIGroup) {
        InterfaceC1311410kEN interfaceC1311410kENFindUIWithCustomLayout = super.findUIWithCustomLayout(f, f2, uIGroup);
        if (!this.LLJ && LJJIZ(interfaceC1311410kENFindUIWithCustomLayout)) {
            Iterator<LynxBaseUI> it2 = this.mChildren.iterator();
            while (it2.hasNext()) {
                if ((it2.next() instanceof LynxFoldHeader) && !this.LLIZLLLIL) {
                    HashMap map = new HashMap();
                    for (int childCount = getChildCount() - 1; -1 < childCount; childCount--) {
                        LynxBaseUI childAt = getChildAt(childCount);
                        if (!(childAt instanceof LynxFoldToolbar)) {
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
            boolean z = !LJJIJLIJ(interfaceC1311410kENFindUIWithCustomLayout);
            ViewGroup.LayoutParams layoutParams = LJJIJIIJIL().getCollapsingToolbarLayout().getLayoutParams();
            if (layoutParams != null) {
                C16GZ c16gz = (C16GZ) layoutParams;
                if (z) {
                    c16gz.LIZ |= 1;
                } else {
                    c16gz.LIZ = (c16gz.LIZ >> 1) << 1;
                }
                C21543519Sv collapsingToolbarLayout = LJJIJIIJIL().getCollapsingToolbarLayout();
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(collapsingToolbarLayout);
                collapsingToolbarLayout.setLayoutParams(c16gz);
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
        float[] targetPoint = getTargetPoint(fArr[0], fArr[1], view.getScrollX(), view.getScrollY(), view2, view2.getMatrix());
        fArr2[0] = targetPoint[0];
        fArr2[1] = targetPoint[1];
        if ((map != null && (lynxUI = map.get(view2)) != null) || ((Intrinsics.LJFF(view2.getClass(), C1319350kRB.class) || Intrinsics.LJFF(view2.getClass(), C21543519Sv.class)) && (lynxUI = this.LLJILLL) != null && (lynxUI.containsPoint(fArr2[0], fArr2[1]) || (lynxUI = this.LLJJ) != null))) {
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
