package com.bytedance.ies.xelement.viewpager.viewpager;

import X.AbstractC1336950ktZ;
import X.C1299120juY;
import X.C1319530kRT;
import X.C1336770ktH;
import X.C1336920ktW;
import X.C1337000kte;
import X.C19U0;
import X.C19U1;
import X.C2188811AlT;
import X.C786410Ut5;
import X.InterfaceC1290150jg5;
import X.InterfaceC1311800kF0;
import X.InterfaceC1312540kGC;
import X.InterfaceC1336750ktF;
import X.InterfaceC1336940ktY;
import X.InterfaceC1337060ktk;
import X.InterfaceC1967107nB;
import X.ViewOnAttachStateChangeListenerC1339240kxG;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.view.ViewTreeObserver;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.ies.xelement.viewpager.LynxTabBarView;
import com.bytedance.ies.xelement.viewpager.childitem.LynxViewpagerItem;
import com.bytedance.ies.xelement.viewpager.viewpager.BaseLynxViewPager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.lynx.base.log.LynxLog;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.UIGroup;
import com.lynx.tasm.behavior.ui.view.UISimpleView;
import com.lynx.tasm.utils.DisplayMetricsHolder;
import j27.s;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public abstract class BaseLynxViewPager<K extends C1336770ktH, T extends AbstractC1336950ktZ<K>> extends UISimpleView<T> implements InterfaceC1311800kF0 {
    public boolean LL;
    public final boolean LLILLJJLI;
    public boolean LLILLL;
    public C19U0 LLILZ;
    public boolean LLILZIL;
    public String LLILZLL;
    public boolean LLIZ;
    public T LLIZLLLIL;
    public C1336920ktW LLJ;

    public abstract void LJJIIZI(LynxViewpagerItem lynxViewpagerItem, int i);

    public abstract void initViewPagerChangeListener();

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final boolean needCustomLayout() {
        return true;
    }

    public void selectIndexIsSet(int i) {
    }

    @InterfaceC1967107nB
    public abstract void selectTab(ReadableMap readableMap, Callback callback);

    public abstract void sendTabChangeEvent(String str, int i, String str2);

    public final T LJJIJ() {
        T t = this.LLIZLLLIL;
        if (t != null) {
            return t;
        }
        return null;
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup
    public final void layoutChildren() {
        int size = this.mChildren.size();
        for (int i = 0; i < size; i++) {
            LynxBaseUI lynxBaseUI = (LynxBaseUI) ListProtector.get(this.mChildren, i);
            if (this.LLIZ || !(lynxBaseUI instanceof LynxUI) || ((LynxUI) lynxBaseUI).mView.isAttachedToWindow()) {
                if (needCustomLayout()) {
                    if (lynxBaseUI instanceof UIGroup) {
                        ((UIGroup) lynxBaseUI).layoutChildren();
                    }
                } else if (lynxBaseUI instanceof LynxUI) {
                    lynxBaseUI.layout();
                }
            }
        }
    }

    @Override // X.InterfaceC1311800kF0
    public final void onPatchFinish() {
        if (LJJIJ().getMChanged()) {
            AbstractC1336950ktZ abstractC1336950ktZLJJIJ = LJJIJ();
            if (abstractC1336950ktZLJJIJ.LLILZLL) {
                abstractC1336950ktZLJJIJ.LLILZLL = false;
                ((ArrayList) abstractC1336950ktZLJJIJ.LLIZ).clear();
                ((ArrayList) abstractC1336950ktZLJJIJ.LLIZ).addAll(abstractC1336950ktZLJJIJ.LLIZLLLIL);
                abstractC1336950ktZLJJIJ.LLILZ.notifyDataSetChanged();
                abstractC1336950ktZLJJIJ.LJFF();
            }
            selectIndexIsSet(LJJIJ().getMViewPager().getCurrentItem());
        }
    }

    public void initListener(Context context) {
        LJJIJ().getMViewPager().setMInterceptTouchEventListener(new InterfaceC1336750ktF(this) { // from class: X.0ktI
            public final /* synthetic */ BaseLynxViewPager<C1336770ktH, AbstractC1336950ktZ<Object>> LIZ;

            {
                this.LIZ = this;
            }

            @Override // X.InterfaceC1336750ktF
            public final void LIZ(boolean z) {
                s sVar;
                if (z && (sVar = this.LIZ.mContext) != null) {
                    sVar.LJJ();
                }
            }
        });
        this.LLJ = new C1336920ktW(this);
        LJJIJ().setTabSelectedListener$x_element_fold_view_release(this.LLJ);
        LJJIJ().setTabClickListenerListener(new InterfaceC1336940ktY(this) { // from class: X.0ktX
            public final /* synthetic */ BaseLynxViewPager<C1336770ktH, AbstractC1336950ktZ<Object>> LIZ;

            {
                this.LIZ = this;
            }

            @Override // X.InterfaceC1336940ktY
            public final void LIZ(C19U0 c19u0) {
                this.LIZ.LLILZ = c19u0;
            }
        });
        initViewPagerChangeListener();
        LJJIJ().addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC1339240kxG(this, 4));
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void removeChild(LynxBaseUI lynxBaseUI) {
        if (lynxBaseUI instanceof LynxUI) {
            this.mChildren.remove(lynxBaseUI);
            C1319530kRT c1319530kRT = null;
            lynxBaseUI.setParent(null);
            if (lynxBaseUI instanceof LynxViewpagerItem) {
                LynxViewpagerItem lynxViewpagerItem = (LynxViewpagerItem) lynxBaseUI;
                if (lynxViewpagerItem.getProps().hasKey("tag")) {
                    AbstractC1336950ktZ abstractC1336950ktZLJJIJ = LJJIJ();
                    String strValueOf = String.valueOf(lynxViewpagerItem.LL);
                    abstractC1336950ktZLJJIJ.getClass();
                    if (strValueOf.length() != 0) {
                        if (((ArrayList) abstractC1336950ktZLJJIJ.LLJI).contains(strValueOf)) {
                            ((ArrayList) abstractC1336950ktZLJJIJ.LLJI).remove(strValueOf);
                        }
                        if (((ArrayList) abstractC1336950ktZLJJIJ.LLJI).size() > 0) {
                            abstractC1336950ktZLJJIJ.LIZIZ(null);
                        }
                    }
                }
                AbstractC1336950ktZ abstractC1336950ktZLJJIJ2 = LJJIJ();
                abstractC1336950ktZLJJIJ2.LLILZLL = true;
                ((ArrayList) abstractC1336950ktZLJJIJ2.LLIZLLLIL).remove(lynxViewpagerItem);
                return;
            }
            if (lynxBaseUI instanceof LynxTabBarView) {
                AbstractC1336950ktZ abstractC1336950ktZLJJIJ3 = LJJIJ();
                C1319530kRT c1319530kRT2 = ((LynxTabBarView) lynxBaseUI).LLILLJJLI;
                if (c1319530kRT2 != null) {
                    c1319530kRT = c1319530kRT2;
                }
                abstractC1336950ktZLJJIJ3.getClass();
                if (c1319530kRT == null) {
                    return;
                }
                RemoveViewCausedNPEChecker.recordViewRemovedPoint(abstractC1336950ktZLJJIJ3, c1319530kRT);
                abstractC1336950ktZLJJIJ3.removeView(c1319530kRT);
                return;
            }
            LynxLog.e("LynxViewPager", "x-viewpager's child illegal, please check behaviors or child tag");
        }
    }

    @InterfaceC1312540kGC(name = "allow-horizontal-gesture")
    public final void setAllowHorizontalGesture(boolean z) {
        LJJIJ().setAllowHorizontalGesture(z);
    }

    @InterfaceC1312540kGC(name = "background")
    public final void setBackground(String str) {
        LJJIJ().setBackgroundColor(C1337000kte.LIZJ(str));
    }

    @InterfaceC1312540kGC(name = "border-height")
    public final void setBorderHeight(float f) {
        LJJIJ().setBorderHeight(f);
    }

    @InterfaceC1312540kGC(name = "border-color")
    public final void setBorderLineColor(String str) {
        LJJIJ().setBorderLineColor(str);
    }

    @InterfaceC1312540kGC(name = "border-width")
    public final void setBorderWidth(float f) {
        LJJIJ().setBorderWidth(f);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void setEvents(Map<String, C1299120juY> map) {
        super.setEvents(map);
        if (map != null) {
            this.LL = true;
            this.LLILLL = map.containsKey("tabbarcellappear");
            boolean zContainsKey = map.containsKey("tabbarcelldisappear");
            if (this.LLILLL || zContainsKey) {
                final AbstractC1336950ktZ abstractC1336950ktZLJJIJ = LJJIJ();
                int sign = getSign();
                InterfaceC1337060ktk interfaceC1337060ktk = new InterfaceC1337060ktk(this) { // from class: X.0ktc
                    public final /* synthetic */ BaseLynxViewPager<K, T> LIZ;

                    {
                        this.LIZ = this;
                    }

                    @Override // X.InterfaceC1337060ktk
                    public final void LIZ(int i, String str) {
                        UISimpleView uISimpleView = this.LIZ;
                        uISimpleView.getClass();
                        if (Intrinsics.LJFF(str, "tabbarcellappear") || Intrinsics.LJFF(str, "tabbarcelldisappear")) {
                            C1298720jtu c1298720jtu = uISimpleView.mContext.LLIZ;
                            C1289960jfm c1289960jfm = new C1289960jfm(uISimpleView.getSign(), str);
                            c1289960jfm.LIZIZ(Integer.valueOf(i), "position");
                            c1298720jtu.LIZIZ(c1289960jfm);
                        }
                    }
                };
                if (!abstractC1336950ktZLJJIJ.LLJLL) {
                    DisplayMetrics displayMetricsLIZ = DisplayMetricsHolder.LIZ(abstractC1336950ktZLJJIJ.getContext());
                    abstractC1336950ktZLJJIJ.LLJLIL.set(0, 0, displayMetricsLIZ.widthPixels, displayMetricsLIZ.heightPixels);
                    abstractC1336950ktZLJJIJ.LLJLLIL = sign;
                    abstractC1336950ktZLJJIJ.LLJLLL = interfaceC1337060ktk;
                    abstractC1336950ktZLJJIJ.LLJZ = "tabbarcellappear";
                    abstractC1336950ktZLJJIJ.LLJZIJLIL = "tabbarcelldisappear";
                    C786410Ut5.w3(abstractC1336950ktZLJJIJ.getViewTreeObserver(), new ViewTreeObserver.OnDrawListener() { // from class: X.0kth
                        @Override // android.view.ViewTreeObserver.OnDrawListener
                        public final void onDraw() {
                            abstractC1336950ktZLJJIJ.LIZJ();
                        }
                    });
                    C786410Ut5.z3(abstractC1336950ktZLJJIJ.getViewTreeObserver(), new ViewTreeObserver.OnScrollChangedListener() { // from class: X.0kti
                        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                        public final void onScrollChanged() {
                            abstractC1336950ktZLJJIJ.LIZJ();
                        }
                    });
                    abstractC1336950ktZLJJIJ.LLJLL = true;
                }
            }
        }
    }

    @InterfaceC1312540kGC(name = "hide-indicator")
    public final void setIndicatorVisibility(String str) {
        C19U1 mTabLayout;
        if (Intrinsics.LJFF(str, "true") && (mTabLayout = LJJIJ().getMTabLayout()) != null) {
            mTabLayout.setSelectedTabIndicator((Drawable) null);
        }
    }

    @InterfaceC1312540kGC(name = "keep-item-view")
    public final void setKeepItemView(boolean z) {
        this.LLIZ = z;
        LJJIJ().setKeepItemView(z);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void setLynxDirection(int i) {
        super.setLynxDirection(i);
        LJJIJ().setLynxDirection(i);
    }

    @InterfaceC1312540kGC(name = "select-index")
    public final void setSelect(int i) {
        PagerAdapter adapter;
        C19U1 mTabLayout = LJJIJ().getMTabLayout();
        if (mTabLayout != null && mTabLayout.getSelectedTabPosition() == i) {
            return;
        }
        if (i >= 0 && (adapter = LJJIJ().getMViewPager().getAdapter()) != null && i < adapter.getCount()) {
            LJJIJ().setCurrentSelectIndex(i);
        }
        LJJIJ().setSelectedIndex(i);
    }

    @InterfaceC1312540kGC(name = "selected-text-color")
    public final void setSelectedTextColor(String str) {
        LJJIJ().setSelectedTextColor(str);
    }

    @InterfaceC1312540kGC(name = "selected-text-size")
    public final void setSelectedTextSize(float f) {
        LJJIJ().setSelectedTextSize(f);
    }

    @InterfaceC1312540kGC(name = "tabbar-drag")
    public final void setTabBarDragEnable(boolean z) {
        LJJIJ().setTabBarDragEnable(z);
    }

    @InterfaceC1312540kGC(name = "tab-height")
    public final void setTabHeight(float f) {
        LJJIJ().LIZLLL(f, false);
    }

    @InterfaceC1312540kGC(name = "tab-height-rpx")
    public final void setTabHeightRpx(float f) {
        LJJIJ().LIZLLL(f, true);
    }

    @InterfaceC1312540kGC(name = "tab-indicator-color")
    public final void setTabIndicatorColor(String str) {
        LJJIJ().setSelectedTabIndicatorColor(str);
    }

    @InterfaceC1312540kGC(name = "tab-indicator-height")
    public final void setTabIndicatorHeight(float f) {
        LJJIJ().setTabIndicatorHeight(f);
    }

    @InterfaceC1312540kGC(name = "tab-indicator-radius")
    public final void setTabIndicatorRadius(float f) {
        LJJIJ().setTabIndicatorRadius(f);
    }

    @InterfaceC1312540kGC(name = "tab-indicator-width")
    public final void setTabIndicatorWidth(float f) {
        LJJIJ().setTabIndicatorWidth(f);
    }

    @InterfaceC1312540kGC(name = "tab-inter-space")
    public final void setTabInterspace(float f) {
        LJJIJ().setTabInterspace(f);
    }

    @InterfaceC1312540kGC(name = "tab-padding-bottom")
    public final void setTabPaddingBottom(int i) {
        LJJIJ().setTabPaddingBottom(i);
    }

    @InterfaceC1312540kGC(name = "tab-padding-left")
    public final void setTabPaddingLeft(int i) {
        LJJIJ().setTabPaddingStart(i);
    }

    @InterfaceC1312540kGC(name = "tab-padding-right")
    public final void setTabPaddingRight(int i) {
        LJJIJ().setTabPaddingEnd(i);
    }

    @InterfaceC1312540kGC(name = "tab-padding-top")
    public final void setTabPaddingTop(int i) {
        LJJIJ().setTabPaddingTop(i);
    }

    @InterfaceC1312540kGC(name = "tabbar-background")
    public final void setTabbarBackground(String str) {
        LJJIJ().setTabbarBackground(str);
    }

    @InterfaceC1312540kGC(name = "tab-layout-gravity")
    public final void setTablayoutGravity(String str) {
        LJJIJ().setTablayoutGravity(str);
    }

    @InterfaceC1312540kGC(name = "text-bold-mode")
    public final void setTextBoldMode(String str) {
        LJJIJ().setTextBold(str);
    }

    @InterfaceC1312540kGC(name = "unselected-text-color")
    public final void setUnSelectedTextColor(String str) {
        LJJIJ().setUnSelectedTextColor(str);
    }

    @InterfaceC1312540kGC(name = "unselected-text-size")
    public final void setUnSelectedTextSize(float f) {
        LJJIJ().setUnSelectedTextSize(f);
    }

    public BaseLynxViewPager(s sVar, Object obj) {
        super(sVar, obj);
        this.LLILLJJLI = true;
        this.LLILZIL = true;
        this.LLILZLL = "";
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void insertChild(LynxBaseUI lynxBaseUI, final int i) {
        if (lynxBaseUI instanceof LynxUI) {
            ListProtector.add(this.mChildren, i, lynxBaseUI);
            lynxBaseUI.setParent(this);
            if (lynxBaseUI instanceof LynxViewpagerItem) {
                LynxViewpagerItem lynxViewpagerItem = (LynxViewpagerItem) lynxBaseUI;
                if (lynxViewpagerItem.getProps().hasKey("tag")) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("insertChild: at ");
                    sbLIZ.append(i);
                    sbLIZ.append(" with tag = ");
                    sbLIZ.append(String.valueOf(lynxViewpagerItem.LL));
                    LynxLog.i("LynxViewPager", C2188811AlT.LIZIZ(sbLIZ));
                    AbstractC1336950ktZ abstractC1336950ktZLJJIJ = LJJIJ();
                    String strValueOf = String.valueOf(lynxViewpagerItem.LL);
                    ((ArrayList) abstractC1336950ktZLJJIJ.LLJI).add(strValueOf);
                    if (strValueOf.length() > 0) {
                        abstractC1336950ktZLJJIJ.LIZIZ(null);
                    }
                    lynxViewpagerItem.LLILLJJLI = new InterfaceC1290150jg5(this) { // from class: X.0ktd
                        public final /* synthetic */ BaseLynxViewPager<K, T> LIZ;

                        @Override // X.InterfaceC1290150jg5
                        public final void LIZ(String str) {
                            AbstractC1336950ktZ abstractC1336950ktZLJJIJ2 = this.LIZ.LJJIJ();
                            int i2 = i;
                            List<String> list = abstractC1336950ktZLJJIJ2.LLJI;
                            if (abstractC1336950ktZLJJIJ2.LLILLJJLI != null) {
                                i2--;
                            }
                            ListProtector.set(list, i2, str);
                            abstractC1336950ktZLJJIJ2.LLILZ.notifyDataSetChanged();
                            abstractC1336950ktZLJJIJ2.LJFF();
                        }

                        {
                            this.LIZ = this;
                        }
                    };
                }
                LJJIIZI(lynxViewpagerItem, i);
                return;
            }
            if (lynxBaseUI instanceof LynxTabBarView) {
                LJJIJ().setTabBarElementAdded(true);
                LJJIJ().setTabLayout((LynxTabBarView) lynxBaseUI);
            } else {
                LynxLog.e("LynxViewPager", "x-viewpager's child illegal, please check behaviors or child tag");
            }
        }
    }
}
