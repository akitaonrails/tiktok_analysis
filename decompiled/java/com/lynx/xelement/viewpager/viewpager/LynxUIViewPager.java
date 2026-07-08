package com.lynx.xelement.viewpager.viewpager;

import X.C1289960jfm;
import X.C1298720jtu;
import X.C1336800ktK;
import X.C1336870ktR;
import X.C1336900ktU;
import X.C1339320kxO;
import X.C786410Ut5;
import X.InterfaceC1312540kGC;
import X.InterfaceC1336810ktL;
import X.InterfaceC1967107nB;
import android.content.Context;
import android.view.MotionEvent;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.xelement.viewpager.childitem.LynxViewpagerItem;
import com.lynx.xelement.viewpager.viewpager.LynxUIViewPager;
import j27.s;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes21.dex */
public class LynxUIViewPager extends BaseLynxViewPager<C1336800ktK, C1336870ktR> {
    public static final C1336900ktU Companion = new Object() { // from class: X.0ktU
    };
    public boolean mDistinguishTapSwap;
    public boolean mDragged;
    public boolean mDraggingDetectedByDraggingAndActionUp;
    public int mIndexSelectedWhileIdle;
    public int mInitialSelectIndex;
    public float mLastOffset;
    public boolean mSinglePageTouch;

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public boolean isScrollContainer() {
        return true;
    }

    @Override // com.lynx.xelement.viewpager.viewpager.BaseLynxViewPager
    public void initViewPagerChangeListener() {
        getMPager().getMViewPager().addOnPageChangeListener(new C1339320kxO(this, 2));
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void onNodeReady() {
        int i;
        PagerAdapter adapter;
        super.onNodeReady();
        if (this.mFirstRender && (i = this.mInitialSelectIndex) != -1 && i >= 0 && (adapter = getMPager().getMViewPager().getAdapter()) != null && i < adapter.getCount()) {
            getMPager().setCurrentSelectIndex(this.mInitialSelectIndex);
            this.mIndexSelectedWhileIdle = getMPager().getMViewPager().getCurrentItem();
        }
        this.mFirstRender = false;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void onNodeReload() {
        super.onNodeReload();
        getMPager().LL.setCurrentItem(0, false);
    }

    public LynxUIViewPager(s sVar) {
        this(sVar, null);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public C1336870ktR createView(Context context) {
        if (context == null) {
            return null;
        }
        setMPager(new C1336870ktR(context));
        initListener(context);
        return getMPager();
    }

    @Override // com.lynx.xelement.viewpager.viewpager.BaseLynxViewPager
    public void initListener(Context context) {
        super.initListener(context);
        getMPager().getMViewPager().setMTouchHandler(new InterfaceC1336810ktL() { // from class: X.0ktQ
            @Override // X.InterfaceC1336810ktL
            public final void LLJZ(MotionEvent motionEvent) {
                Integer numValueOf;
                if (motionEvent != null && (numValueOf = Integer.valueOf(motionEvent.getActionMasked())) != null) {
                    if (numValueOf.intValue() == 1) {
                        LynxUIViewPager lynxUIViewPager = this.LIZ;
                        if (lynxUIViewPager.mDraggingDetectedByDraggingAndActionUp) {
                            lynxUIViewPager.sendTabWillChangeEvent(lynxUIViewPager.getMPager().getMViewPager().getCurrentItem(), true);
                        }
                        this.LIZ.mDraggingDetectedByDraggingAndActionUp = false;
                        return;
                    }
                    if (numValueOf.intValue() != 3) {
                        return;
                    }
                    LynxUIViewPager lynxUIViewPager2 = this.LIZ;
                    if (lynxUIViewPager2.mDraggingDetectedByDraggingAndActionUp) {
                        lynxUIViewPager2.sendTabWillChangeEvent(lynxUIViewPager2.getMPager().getMViewPager().getCurrentItem(), true);
                    }
                    this.LIZ.mDraggingDetectedByDraggingAndActionUp = false;
                }
            }
        });
    }

    public final void recognizeGestureWhenScroll(float f) {
        if (this.mDistinguishTapSwap && this.mLastOffset != f) {
            recognizeGesturere();
            this.mLastOffset = f;
        }
    }

    @Override // com.lynx.xelement.viewpager.viewpager.BaseLynxViewPager
    public void selectIndexIsSet(int i) {
        if (this.mIndexSelectedWhileIdle != i) {
            this.mIndexSelectedWhileIdle = i;
            sendTabChangeEvent("", i, "");
        }
    }

    public final void sendOffsetChangeEvent(String str) {
        C1298720jtu c1298720jtu = this.mContext.LLIZ;
        C1289960jfm c1289960jfm = new C1289960jfm(getSign(), "offsetchange");
        c1289960jfm.LIZIZ(str, "offset");
        c1298720jtu.LIZIZ(c1289960jfm);
    }

    @InterfaceC1312540kGC(defaultBoolean = false, name = "android-always-overscroll")
    public final void setAndroidAlwaysOverscroll(boolean z) {
        getMPager().setViewPagerOverScrollMode(z);
    }

    @InterfaceC1312540kGC(defaultBoolean = true, name = "android-distinguish-swipe-tap")
    public final void setDistinguishSwipeTap(boolean z) {
        this.mDistinguishTapSwap = z;
    }

    @InterfaceC1312540kGC(name = "enable-scroll")
    public final void setEnableScroll(boolean z) {
        getMPager().setAllowHorizontalGesture(z);
    }

    @InterfaceC1312540kGC(name = "android-force-can-scroll")
    public final void setForceCanScroll(boolean z) {
        getMPager().setForceCanScroll(z);
    }

    @InterfaceC1312540kGC(name = "initial-select-index")
    public final void setInitialSelect(int i) {
        this.mInitialSelectIndex = i;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void setOverflow(int i) {
        super.setOverflow(i);
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        getMPager().setClipChildren(z);
        getMPager().getMViewPager().setClipChildren(z);
    }

    @InterfaceC1312540kGC(name = "page-change-animation")
    public final void setPageChangeAnimation(boolean z) {
        getMPager().setPagerChangeAnimation(z);
    }

    @InterfaceC1312540kGC(name = "single-page-touch")
    public final void setSinglePageTouch(boolean z) {
        this.mSinglePageTouch = z;
    }

    public LynxUIViewPager(s sVar, Object obj) {
        super(sVar, obj);
        this.mDistinguishTapSwap = true;
        this.mInitialSelectIndex = -1;
    }

    @Override // com.lynx.xelement.viewpager.viewpager.BaseLynxViewPager
    public void addPagerChildItem(LynxViewpagerItem lynxViewpagerItem, int i) {
        C1336870ktR mPager = getMPager();
        mPager.setMChanged(true);
        if (i >= 0 && i <= mPager.getMPendingChildren().size()) {
            ListProtector.add(mPager.getMPendingChildren(), i, lynxViewpagerItem);
        } else {
            mPager.getMPendingChildren().add(lynxViewpagerItem);
        }
    }

    @Override // com.lynx.xelement.viewpager.viewpager.BaseLynxViewPager
    public String handleFormatStr(String str, Object... objArr) {
        return C786410Ut5.k4(Locale.ENGLISH, str, Arrays.copyOf(new Object[]{objArr}, 1));
    }

    @Override // com.lynx.xelement.viewpager.viewpager.BaseLynxViewPager
    @InterfaceC1967107nB
    public void selectTab(ReadableMap readableMap, Callback callback) {
        PagerAdapter adapter;
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        javaOnlyMap.put("success", Boolean.FALSE);
        if (readableMap.hasKey("index")) {
            int i = readableMap.getInt("index");
            if (i >= 0 && (adapter = getMPager().getMViewPager().getAdapter()) != null && i < adapter.getCount()) {
                sendTabWillChangeEvent(i, false);
                if (readableMap.hasKey("smooth")) {
                    boolean z = readableMap.getBoolean("smooth", true);
                    getMPager().LL.setCurrentItem(i, z);
                    if (!z && this.mIndexSelectedWhileIdle != getMPager().getMViewPager().getCurrentItem()) {
                        int currentItem = getMPager().getMViewPager().getCurrentItem();
                        this.mIndexSelectedWhileIdle = currentItem;
                        sendTabChangeEvent("", currentItem, "");
                    }
                } else {
                    getMPager().LL.setCurrentItem(i, true);
                }
                javaOnlyMap.put("success", Boolean.TRUE);
                if (callback != null) {
                    callback.invoke(0, javaOnlyMap);
                    return;
                }
                return;
            }
            javaOnlyMap.put("msg", "index out of bounds");
            if (callback == null) {
                return;
            }
            callback.invoke(4, javaOnlyMap);
            return;
        }
        javaOnlyMap.put("msg", "no index key");
        if (callback == null) {
            return;
        }
        callback.invoke(4, javaOnlyMap);
    }

    public final void sendTabWillChangeEvent(int i, boolean z) {
        C1298720jtu c1298720jtu = this.mContext.LLIZ;
        C1289960jfm c1289960jfm = new C1289960jfm(getSign(), "willchange");
        c1289960jfm.LIZIZ(Boolean.valueOf(z), "isDragged");
        c1289960jfm.LIZIZ(Integer.valueOf(i), "index");
        c1298720jtu.LIZIZ(c1289960jfm);
    }

    @InterfaceC1967107nB
    public final void setDragGesture(ReadableMap readableMap, Callback callback) {
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        javaOnlyMap.put("success", Boolean.FALSE);
        if (readableMap.hasKey("canDrag")) {
            setAllowHorizontalGesture(readableMap.getBoolean("canDrag"));
        }
        if (callback != null) {
            callback.invoke(0, javaOnlyMap);
        }
    }

    @Override // com.lynx.xelement.viewpager.viewpager.BaseLynxViewPager
    public void sendTabChangeEvent(String str, int i, String str2) {
        C1298720jtu c1298720jtu = this.mContext.LLIZ;
        C1289960jfm c1289960jfm = new C1289960jfm(getSign(), "change");
        c1289960jfm.LIZIZ(Boolean.valueOf(this.mDragged), "isDragged");
        c1289960jfm.LIZIZ(Integer.valueOf(i), "index");
        c1298720jtu.LIZIZ(c1289960jfm);
    }
}
