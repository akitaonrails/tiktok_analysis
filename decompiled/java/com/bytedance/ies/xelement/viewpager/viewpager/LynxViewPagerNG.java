package com.bytedance.ies.xelement.viewpager.viewpager;

import X.C1289960jfm;
import X.C1298720jtu;
import X.C1336710ktB;
import X.C1336730ktD;
import X.C1339320kxO;
import X.InterfaceC1312540kGC;
import X.InterfaceC1336720ktC;
import X.InterfaceC1967107nB;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.ies.xelement.viewpager.childitem.LynxViewpagerItem;
import com.bytedance.ies.xelement.viewpager.viewpager.LynxViewPagerNG;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableMap;
import j27.s;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class LynxViewPagerNG extends BaseLynxViewPager<C1336730ktD, C1336710ktB> {
    public boolean LLJI;
    public float LLJIJIL;
    public boolean LLJILJIL;
    public boolean LLJILJILJ;
    public int LLJILLL;
    public int LLJJ;
    public boolean LLJJI;

    public LynxViewPagerNG() {
        throw null;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final boolean isScrollContainer() {
        return true;
    }

    @Override // com.bytedance.ies.xelement.viewpager.viewpager.BaseLynxViewPager
    public final void initViewPagerChangeListener() {
        LJJIJ().getMViewPager().addOnPageChangeListener(new C1339320kxO(this, 1));
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onNodeReady() {
        int i;
        PagerAdapter adapter;
        super.onNodeReady();
        if (this.mFirstRender && (i = this.LLJJ) != -1 && i >= 0 && (adapter = LJJIJ().getMViewPager().getAdapter()) != null && i < adapter.getCount()) {
            LJJIJ().setCurrentSelectIndex(this.LLJJ);
            this.LLJILLL = LJJIJ().getMViewPager().getCurrentItem();
        }
        this.mFirstRender = false;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onNodeReload() {
        super.onNodeReload();
        LJJIJ().LL.setCurrentItem(0, false);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final View createView(Context context) {
        if (context == null) {
            return null;
        }
        C1336710ktB c1336710ktB = new C1336710ktB(context);
        this.LLIZLLLIL = c1336710ktB;
        initListener(context);
        return c1336710ktB;
    }

    @Override // com.bytedance.ies.xelement.viewpager.viewpager.BaseLynxViewPager
    public final void initListener(Context context) {
        super.initListener(context);
        LJJIJ().getMViewPager().setMTouchHandler(new InterfaceC1336720ktC() { // from class: X.0ktA
            @Override // X.InterfaceC1336720ktC
            public final void LLJZ(MotionEvent motionEvent) {
                Integer numValueOf;
                if (motionEvent != null && (numValueOf = Integer.valueOf(motionEvent.getActionMasked())) != null) {
                    if (numValueOf.intValue() == 1) {
                        LynxViewPagerNG lynxViewPagerNG = this.LIZ;
                        if (lynxViewPagerNG.LLJJI) {
                            lynxViewPagerNG.sendTabWillChangeEvent(lynxViewPagerNG.LJJIJ().getMViewPager().getCurrentItem(), true);
                        }
                        this.LIZ.LLJJI = false;
                        return;
                    }
                    if (numValueOf.intValue() != 3) {
                        return;
                    }
                    LynxViewPagerNG lynxViewPagerNG2 = this.LIZ;
                    if (lynxViewPagerNG2.LLJJI) {
                        lynxViewPagerNG2.sendTabWillChangeEvent(lynxViewPagerNG2.LJJIJ().getMViewPager().getCurrentItem(), true);
                    }
                    this.LIZ.LLJJI = false;
                }
            }
        });
    }

    @Override // com.bytedance.ies.xelement.viewpager.viewpager.BaseLynxViewPager
    public final void selectIndexIsSet(int i) {
        if (this.LLJILLL != i) {
            this.LLJILLL = i;
            sendTabChangeEvent("", i, "");
        }
    }

    @InterfaceC1312540kGC(defaultBoolean = false, name = "android-always-overscroll")
    public final void setAndroidAlwaysOverscroll(boolean z) {
        LJJIJ().setViewPagerOverScrollMode(z);
    }

    @InterfaceC1312540kGC(defaultBoolean = true, name = "android-distinguish-swipe-tap")
    public final void setDistinguishSwipeTap(boolean z) {
        this.LLJILJIL = z;
    }

    @InterfaceC1312540kGC(name = "enable-scroll")
    public final void setEnableScroll(boolean z) {
        LJJIJ().setAllowHorizontalGesture(z);
    }

    @InterfaceC1312540kGC(name = "android-force-can-scroll")
    public final void setForceCanScroll(boolean z) {
        LJJIJ().setForceCanScroll(z);
    }

    @InterfaceC1312540kGC(name = "initial-select-index")
    public final void setInitialSelect(int i) {
        this.LLJJ = i;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void setOverflow(int i) {
        super.setOverflow(i);
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        LJJIJ().setClipChildren(z);
        LJJIJ().getMViewPager().setClipChildren(z);
    }

    @InterfaceC1312540kGC(name = "page-change-animation")
    public final void setPageChangeAnimation(boolean z) {
        LJJIJ().setPagerChangeAnimation(z);
    }

    @InterfaceC1312540kGC(name = "single-page-touch")
    public final void setSinglePageTouch(boolean z) {
        this.LLJILJILJ = z;
    }

    public LynxViewPagerNG(s sVar, Object obj) {
        super(sVar, obj);
        this.LLJILJIL = true;
        this.LLJJ = -1;
    }

    @Override // com.bytedance.ies.xelement.viewpager.viewpager.BaseLynxViewPager
    public final void LJJIIZI(LynxViewpagerItem lynxViewpagerItem, int i) {
        C1336710ktB c1336710ktBLJJIJ = LJJIJ();
        c1336710ktBLJJIJ.setMChanged(true);
        if (c1336710ktBLJJIJ.getMTabLayout() != null && Intrinsics.LJFF(c1336710ktBLJJIJ.LLL, Boolean.TRUE)) {
            i--;
        }
        if (i >= 0 && i <= c1336710ktBLJJIJ.getMPendingChildren().size()) {
            ListProtector.add(c1336710ktBLJJIJ.getMPendingChildren(), i, lynxViewpagerItem);
        } else {
            c1336710ktBLJJIJ.getMPendingChildren().add(lynxViewpagerItem);
        }
    }

    @Override // com.bytedance.ies.xelement.viewpager.viewpager.BaseLynxViewPager
    @InterfaceC1967107nB
    public void selectTab(ReadableMap readableMap, Callback callback) {
        PagerAdapter adapter;
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        javaOnlyMap.put("success", Boolean.FALSE);
        if (readableMap.hasKey("index")) {
            int i = readableMap.getInt("index");
            if (i >= 0 && (adapter = LJJIJ().getMViewPager().getAdapter()) != null && i < adapter.getCount()) {
                sendTabWillChangeEvent(i, false);
                if (readableMap.hasKey("smooth")) {
                    boolean z = readableMap.getBoolean("smooth", true);
                    LJJIJ().LL.setCurrentItem(i, z);
                    if (!z && this.LLJILLL != LJJIJ().getMViewPager().getCurrentItem()) {
                        int currentItem = LJJIJ().getMViewPager().getCurrentItem();
                        this.LLJILLL = currentItem;
                        sendTabChangeEvent("", currentItem, "");
                    }
                } else {
                    LJJIJ().LL.setCurrentItem(i, true);
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

    @Override // com.bytedance.ies.xelement.viewpager.viewpager.BaseLynxViewPager
    public final void sendTabChangeEvent(String str, int i, String str2) {
        C1298720jtu c1298720jtu = this.mContext.LLIZ;
        C1289960jfm c1289960jfm = new C1289960jfm(getSign(), "change");
        c1289960jfm.LIZIZ(Boolean.valueOf(this.LLJI), "isDragged");
        c1289960jfm.LIZIZ(Integer.valueOf(i), "index");
        c1298720jtu.LIZIZ(c1289960jfm);
    }
}
