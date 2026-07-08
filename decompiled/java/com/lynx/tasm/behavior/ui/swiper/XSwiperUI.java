package com.lynx.tasm.behavior.ui.swiper;

import X.C1289960jfm;
import X.C1299120juY;
import X.C1310360kCg;
import X.C1311130kDv;
import X.C1312920kGo;
import X.C20094213jo;
import X.C21405118pl;
import X.C21565819aa;
import X.C21565919ab;
import X.C21598719ft;
import X.C21606519h9;
import X.C21607019hE;
import X.C786410Ut5;
import X.InterfaceC1298070jsr;
import X.InterfaceC1312540kGC;
import X.InterfaceC1967107nB;
import X.InterfaceC21576019cE;
import X.InterfaceC21606819hC;
import X.RunnableC21606719hB;
import X.ViewOnAttachStateChangeListenerC2189571Amh;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.log.LynxLog;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableType;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.list.UIList;
import com.lynx.tasm.behavior.ui.swiper.XSwiperUI;
import com.lynx.tasm.behavior.ui.view.UISimpleView;
import com.lynx.tasm.utils.ColorUtils;
import j27.s;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import u4.q0;

/* JADX INFO: loaded from: classes34.dex */
public class XSwiperUI extends UISimpleView<C21405118pl> {
    public static final int LLJLLL = Color.argb(255, 255, 255, 255);
    public static final int LLJZ = Color.argb(89, 255, 255, 255);
    public String LL;
    public boolean LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public int LLIZLLLIL;
    public int LLJ;
    public int LLJI;
    public int LLJIJIL;
    public int LLJILJIL;
    public boolean LLJILJILJ;
    public boolean LLJILLL;
    public boolean LLJJ;
    public boolean LLJJI;
    public int LLJJIII;
    public int LLJJIJI;
    public int LLJJIJIIJIL;
    public long LLJJIJIL;
    public boolean LLJJJ;
    public boolean LLJJJIL;
    public boolean LLJJJJ;
    public boolean LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public boolean LLJJL;
    public final C21565819aa LLJJLIIIJLLLLLLLZ;
    public final C21565919ab LLJL;
    public final BPEAHandler LLJLIL;
    public final List<View> LLJLILLLLZIIL;
    public final RunnableC21606719hB LLJLL;
    public C21598719ft LLJLLIL;

    @Override // com.lynx.tasm.behavior.ui.UIGroup
    public final boolean enableAutoClipRadius() {
        return true;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final boolean isAccessibilityHostUI() {
        return true;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final boolean isScrollContainer() {
        return true;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final boolean isScrollable() {
        return true;
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final boolean needCustomLayout() {
        return true;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onListCellPrepareForReuse(String str, LynxBaseUI lynxBaseUI) {
    }

    public final void LJJIJ() {
        ((C21405118pl) this.mView).getViewPager().setAdapter(new C21607019hE(this));
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup
    public final View getAccessibilityHostView() {
        return ((C21405118pl) this.mView).getViewPager();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onLayoutUpdated() {
        int width = getWidth();
        int height = getHeight();
        super.onLayoutUpdated();
        this.mView.setPadding(this.mPaddingLeft + this.mBorderLeftWidth, this.mPaddingTop + this.mBorderTopWidth, this.mPaddingRight + this.mBorderRightWidth, this.mPaddingBottom + this.mBorderBottomWidth);
        ((ArrayList) this.LLJLILLLLZIIL).clear();
        Iterator<LynxBaseUI> it2 = this.mChildren.iterator();
        while (it2.hasNext()) {
            ((ArrayList) this.LLJLILLLLZIIL).add(((LynxUI) it2.next()).mView);
        }
        LJJIJ();
        ((C21405118pl) this.mView).setIsRtl(isRtl());
        if (getOverflow() != 0) {
            ((ViewGroup) this.mView).setClipChildren(false);
        }
        LJJIIZI(this.LLIZLLLIL != width, this.LLJ != height, false);
        if (this.LLIZLLLIL == width && this.LLJ == height) {
            return;
        }
        float f = width;
        float f2 = height;
        if (this.LLIZ && this.mContext.LLJJJ != null) {
            C1289960jfm c1289960jfm = new C1289960jfm(getSign(), "contentsizechanged");
            c1289960jfm.LIZIZ(Float.valueOf(C1311130kDv.LIZJ(f)), "contentWidth");
            c1289960jfm.LIZIZ(Float.valueOf(C1311130kDv.LIZJ(f2)), "contentHeight");
            s sVar = this.mContext;
            if (sVar != null) {
                sVar.LLIZ.LIZIZ(c1289960jfm);
            }
        }
        this.LLIZLLLIL = width;
        this.LLJ = height;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onNodeReload() {
        super.onNodeReload();
        LJJIJIIJI(0, false);
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [X.19ft] */
    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onPropsUpdated() {
        super.onPropsUpdated();
        if (this.LLJJJJ) {
            LJJIIZI(false, false, true);
            this.LLJJJJ = false;
        }
        C1310360kCg c1310360kCgLJIIL = this.mContext.LJIIL();
        if (c1310360kCgLJIIL != null) {
            if (c1310360kCgLJIIL.LJ() || c1310360kCgLJIIL.LJFF()) {
                if (this.LLJLLIL == null) {
                    this.LLJLLIL = new C20094213jo() { // from class: X.19ft
                        public final boolean LIZ() {
                            List<View> list;
                            XSwiperUI xSwiperUI = this.LIZ;
                            return xSwiperUI.LLJJL && ((C21405118pl) xSwiperUI.mView).getViewPager() != null && (list = this.LIZ.LLJLILLLLZIIL) != null && ((ArrayList) list).size() > 1;
                        }

                        public final boolean LIZIZ(C21606519h9 c21606519h9, int i) {
                            if (!this.LIZ.LLJILJILJ || !c21606519h9.canScrollVertically(i)) {
                                if (!this.LIZ.LLJILJILJ && c21606519h9.canScrollHorizontally(i)) {
                                    return true;
                                }
                                return false;
                            }
                            return true;
                        }

                        @Override // X.C20094213jo
                        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
                            if (((C21405118pl) this.LIZ.mView).getViewPager() != null) {
                                accessibilityEvent.setClassName(C21606519h9.class.getName());
                                boolean zLIZ = LIZ();
                                accessibilityEvent.setScrollable(zLIZ);
                                if (zLIZ && accessibilityEvent.getEventType() == 4096) {
                                    accessibilityEvent.setItemCount(((ArrayList) this.LIZ.LLJLILLLLZIIL).size());
                                }
                            }
                        }

                        /* JADX WARN: Removed duplicated region for block: B:39:0x00ab  */
                        /* JADX WARN: Removed duplicated region for block: B:40:0x00ad  */
                        @Override // X.C20094213jo
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final void onInitializeAccessibilityNodeInfo(android.view.View r7, androidx.core.view.accessibility.AccessibilityNodeInfoCompat r8) {
                            /*
                                r6 = this;
                                super.onInitializeAccessibilityNodeInfo(r7, r8)
                                java.lang.Class<X.19h9> r0 = X.C21606519h9.class
                                java.lang.String r0 = r0.getName()
                                r8.setClassName(r0)
                                boolean r2 = r6.LIZ()
                                r8.setScrollable(r2)
                                com.lynx.tasm.behavior.ui.swiper.XSwiperUI r0 = r6.LIZ
                                T extends android.view.View r0 = r0.mView
                                X.18pl r0 = (X.C21405118pl) r0
                                X.19h9 r0 = r0.getViewPager()
                                r5 = 1
                                if (r0 == 0) goto Lad
                                com.lynx.tasm.behavior.ui.swiper.XSwiperUI r0 = r6.LIZ
                                java.util.List<android.view.View> r0 = r0.LLJLILLLLZIIL
                                if (r0 == 0) goto Lad
                                java.util.ArrayList r0 = (java.util.ArrayList) r0
                                boolean r0 = r0.isEmpty()
                                if (r0 != 0) goto Lad
                                com.lynx.tasm.behavior.ui.swiper.XSwiperUI r1 = r6.LIZ
                                boolean r0 = r1.LLJILJILJ
                                if (r0 == 0) goto Lad
                                java.util.List<android.view.View> r0 = r1.LLJLILLLLZIIL
                                java.util.ArrayList r0 = (java.util.ArrayList) r0
                                int r3 = r0.size()
                            L3c:
                                com.lynx.tasm.behavior.ui.swiper.XSwiperUI r0 = r6.LIZ
                                T extends android.view.View r0 = r0.mView
                                X.18pl r0 = (X.C21405118pl) r0
                                X.19h9 r0 = r0.getViewPager()
                                if (r0 == 0) goto Lab
                                com.lynx.tasm.behavior.ui.swiper.XSwiperUI r0 = r6.LIZ
                                java.util.List<android.view.View> r0 = r0.LLJLILLLLZIIL
                                if (r0 == 0) goto Lab
                                java.util.ArrayList r0 = (java.util.ArrayList) r0
                                boolean r0 = r0.isEmpty()
                                if (r0 != 0) goto Lab
                                com.lynx.tasm.behavior.ui.swiper.XSwiperUI r1 = r6.LIZ
                                boolean r0 = r1.LLJILJILJ
                                if (r0 != 0) goto Lab
                                java.util.List<android.view.View> r0 = r1.LLJLILLLLZIIL
                                java.util.ArrayList r0 = (java.util.ArrayList) r0
                                int r1 = r0.size()
                            L64:
                                r0 = 0
                                X.13jd r0 = X.C20093113jd.LIZIZ(r3, r1, r0, r0)
                                r8.setCollectionInfo(r0)
                                com.lynx.tasm.behavior.ui.swiper.XSwiperUI r0 = r6.LIZ
                                T extends android.view.View r0 = r0.mView
                                X.18pl r0 = (X.C21405118pl) r0
                                X.19h9 r4 = r0.getViewPager()
                                if (r2 == 0) goto L97
                                if (r4 == 0) goto L97
                                com.lynx.tasm.behavior.ui.swiper.XSwiperUI r0 = r6.LIZ
                                boolean r0 = r0.LLJILJILJ
                                r3 = 8192(0x2000, float:1.148E-41)
                                r2 = 4096(0x1000, float:5.74E-42)
                                r1 = -1
                                if (r0 == 0) goto L98
                                boolean r0 = r4.canScrollVertically(r5)
                                if (r0 == 0) goto L8e
                                r8.addAction(r2)
                            L8e:
                                boolean r0 = r4.canScrollVertically(r1)
                                if (r0 == 0) goto L97
                                r8.addAction(r3)
                            L97:
                                return
                            L98:
                                boolean r0 = r4.canScrollHorizontally(r5)
                                if (r0 == 0) goto La1
                                r8.addAction(r2)
                            La1:
                                boolean r0 = r4.canScrollHorizontally(r1)
                                if (r0 == 0) goto L97
                                r8.addAction(r3)
                                return
                            Lab:
                                r1 = 1
                                goto L64
                            Lad:
                                r3 = 1
                                goto L3c
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C21598719ft.onInitializeAccessibilityNodeInfo(android.view.View, androidx.core.view.accessibility.AccessibilityNodeInfoCompat):void");
                        }

                        @Override // X.C20094213jo
                        public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
                            if (super.performAccessibilityAction(view, i, bundle)) {
                                return true;
                            }
                            C21606519h9 viewPager = ((C21405118pl) this.LIZ.mView).getViewPager();
                            if (viewPager != null && viewPager.getCurrentIndex() != -1) {
                                int currentIndex = viewPager.getCurrentIndex();
                                if (i != 4096) {
                                    if (i != 8192 || !LIZIZ(viewPager, -1)) {
                                        return false;
                                    }
                                    this.LIZ.setCurrentIndex(currentIndex - 1);
                                    return true;
                                }
                                if (LIZIZ(viewPager, 1)) {
                                    this.LIZ.setCurrentIndex(currentIndex + 1);
                                    return true;
                                }
                            }
                            return false;
                        }
                    };
                }
                C21606519h9 viewPager = ((C21405118pl) this.mView).getViewPager();
                if (viewPager != null) {
                    q0.LJIJ(viewPager, this.LLJLLIL);
                    viewPager.setImportantForAccessibility(1);
                    this.mView.setImportantForAccessibility(2);
                }
            }
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final boolean isAccessibilityDirectionVertical() {
        return this.LLJILJILJ;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final View createView(Context context) {
        final C21405118pl c21405118pl = new C21405118pl(context);
        C21606519h9 viewPager = c21405118pl.getViewPager();
        ((ArrayList) viewPager.LLLIILIL).add(new InterfaceC21606819hC() { // from class: X.19hG
            public boolean LIZ;

            @Override // X.InterfaceC21606819hC
            public final void LIZLLL(int i) {
                XSwiperUI xSwiperUI = this.LIZJ;
                if (xSwiperUI.LLILZ) {
                    C1289960jfm c1289960jfm = new C1289960jfm(xSwiperUI.getSign(), "scrollend");
                    c1289960jfm.LIZIZ(Integer.valueOf(i), "current");
                    s sVar = this.LIZJ.mContext;
                    if (sVar != null) {
                        sVar.LLIZ.LIZIZ(c1289960jfm);
                    }
                }
            }

            @Override // X.InterfaceC21606819hC
            public final void onPageScrollStateChanged(int i) {
                XSwiperUI xSwiperUI = this.LIZJ;
                if (xSwiperUI.LLJILLL) {
                    if (i == 1) {
                        this.LIZ = true;
                        xSwiperUI.LLJLIL.removeCallbacks(xSwiperUI.LLJLL);
                    } else {
                        if (!this.LIZ) {
                            return;
                        }
                        this.LIZ = false;
                        xSwiperUI.LLJLIL.removeCallbacks(xSwiperUI.LLJLL);
                        XSwiperUI xSwiperUI2 = this.LIZJ;
                        C786410Ut5.LJLIIL(xSwiperUI2.LLJJIII, xSwiperUI2.LLJLIL, xSwiperUI2.LLJLL);
                    }
                }
            }

            @Override // X.InterfaceC21606819hC
            public final void LIZ(boolean z, boolean z2) {
                XSwiperUI xSwiperUI = this.LIZJ;
                if (xSwiperUI.LLILZLL) {
                    C1289960jfm c1289960jfm = new C1289960jfm(xSwiperUI.getSign(), "scrolltobounce");
                    c1289960jfm.LIZIZ(Boolean.valueOf(z), "isToBegin");
                    c1289960jfm.LIZIZ(Boolean.valueOf(z2), "isToEnd");
                    s sVar = this.LIZJ.mContext;
                    if (sVar != null) {
                        sVar.LLIZ.LIZIZ(c1289960jfm);
                    }
                }
            }

            @Override // X.InterfaceC21606819hC
            public final void LIZJ(int i, boolean z) {
                XSwiperUI xSwiperUI = this.LIZJ;
                if (xSwiperUI.LLILLL) {
                    C1289960jfm c1289960jfm = new C1289960jfm(xSwiperUI.getSign(), "scrollstart");
                    c1289960jfm.LIZIZ(Integer.valueOf(i), "current");
                    c1289960jfm.LIZIZ(Boolean.valueOf(z), "isDragged");
                    s sVar = this.LIZJ.mContext;
                    if (sVar != null) {
                        sVar.LLIZ.LIZIZ(c1289960jfm);
                    }
                }
            }

            @Override // X.InterfaceC21606819hC
            public final void LJ(int i, boolean z) {
                ((C21405118pl) this.LIZJ.mView).setSelected(i);
                XSwiperUI xSwiperUI = this.LIZJ;
                if (xSwiperUI.LLILLJJLI && !z) {
                    C1289960jfm c1289960jfm = new C1289960jfm(xSwiperUI.getSign(), "change");
                    c1289960jfm.LIZIZ(Integer.valueOf(i), "current");
                    s sVar = this.LIZJ.mContext;
                    if (sVar != null) {
                        sVar.LLIZ.LIZIZ(c1289960jfm);
                    }
                }
            }

            @Override // X.InterfaceC21606819hC
            public final void LIZIZ(float f, float f2, boolean z) {
                this.LIZJ.recognizeGesturere();
                if (this.LIZJ.LLILZIL) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    XSwiperUI xSwiperUI = this.LIZJ;
                    long j = jCurrentTimeMillis - xSwiperUI.LLJJIJIL;
                    int i = xSwiperUI.LLJJIJIIJIL;
                    if (i > 0 && j <= i) {
                        return;
                    }
                    xSwiperUI.LLJJIJIL = jCurrentTimeMillis;
                    C1289960jfm c1289960jfm = new C1289960jfm(xSwiperUI.getSign(), "transition");
                    c1289960jfm.LIZIZ(Integer.valueOf(c21405118pl.getViewPager().getCurrentIndex()), "current");
                    c1289960jfm.LIZIZ(Boolean.valueOf(z), "isDragged");
                    c1289960jfm.LIZIZ(Float.valueOf(C1311130kDv.LIZJ(f)), "dx");
                    c1289960jfm.LIZIZ(Float.valueOf(C1311130kDv.LIZJ(f2)), "dy");
                    s sVar = this.LIZJ.mContext;
                    if (sVar != null) {
                        sVar.LLIZ.LIZIZ(c1289960jfm);
                    }
                }
            }
        });
        c21405118pl.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC2189571Amh(this, 7));
        LynxLog.i("LynxSwiperUI", "create Android NewSwiperView");
        return c21405118pl;
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void removeChild(LynxBaseUI lynxBaseUI) {
        if (lynxBaseUI instanceof LynxUI) {
            this.mChildren.remove(lynxBaseUI);
            ((ArrayList) this.LLJLILLLLZIIL).remove(((LynxUI) lynxBaseUI).mView);
            LJJIJ();
            C21405118pl c21405118pl = (C21405118pl) this.mView;
            if (c21405118pl.LLILLJJLI.getChildCount() > 0) {
                C786410Ut5.LJJLJ(0, c21405118pl.LLILLJJLI);
                c21405118pl.setSelected(c21405118pl.LLILZLL);
            }
            LJJIIZI(false, false, true);
        }
    }

    @InterfaceC1312540kGC(defaultBoolean = false, name = "autoplay")
    public void setAutoPlay(boolean z) {
        this.LLJILLL = z;
        this.LLJLIL.removeCallbacks(this.LLJLL);
        if (this.LLJILLL) {
            C786410Ut5.LJLIIL(this.LLJJIII, this.LLJLIL, this.LLJLL);
        }
    }

    @InterfaceC1312540kGC(defaultFloat = 0.3f, name = "bounce-begin-threshold")
    public void setBounceBeginThreshold(float f) {
        ((C21405118pl) this.mView).getViewPager().setBounceBeginThreshold(f);
    }

    @InterfaceC1312540kGC(defaultInt = 500, name = "bounce-duration")
    public void setBounceDuration(int i) {
        ((C21405118pl) this.mView).getViewPager().setBounceDuration(i);
    }

    @InterfaceC1312540kGC(defaultFloat = 0.3f, name = "bounce-end-threshold")
    public void setBounceEndThreshold(float f) {
        ((C21405118pl) this.mView).getViewPager().setBounceEndThreshold(f);
    }

    @InterfaceC1312540kGC(defaultBoolean = false, name = "circular")
    public void setCircular(boolean z) {
        this.LLJJ = z;
        ((C21405118pl) this.mView).getViewPager().setLoop(z);
    }

    @InterfaceC1312540kGC(defaultBoolean = true, name = "compatible")
    public void setCompatible(boolean z) {
        this.LLJJJJJIL = z;
        this.LLJJJJ = true;
    }

    @InterfaceC1312540kGC(defaultInt = 0, name = "current")
    public void setCurrentIndex(int i) {
        LJJIJIIJI(i, this.LLJJI);
    }

    @InterfaceC1312540kGC(defaultInt = 500, name = "duration")
    public void setDuration(int i) {
        this.LLJJIJI = i;
        if (this.LLJJI) {
            ((C21405118pl) this.mView).getViewPager().setAnimDuration(i);
        } else {
            ((C21405118pl) this.mView).getViewPager().setAnimDuration(0);
        }
    }

    @InterfaceC1312540kGC(defaultBoolean = false, name = "enable-bounce")
    public void setEnableBounce(boolean z) {
        ((C21405118pl) this.mView).getViewPager().setEnableBounce(z);
    }

    @InterfaceC1312540kGC(defaultBoolean = false, name = "enable-nested-child")
    public void setEnableNestedChild(boolean z) {
        C21606519h9 viewPager = ((C21405118pl) this.mView).getViewPager();
        if (viewPager != null) {
            viewPager.setEnableNestedChild(z);
        }
    }

    @InterfaceC1312540kGC(defaultBoolean = true, name = "enable-vice-loop")
    public void setEnableViceLoop(boolean z) {
        ((C21405118pl) this.mView).getViewPager().setEnableViceLoop(z);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void setEvents(Map<String, C1299120juY> map) {
        super.setEvents(map);
        if (map != null) {
            this.LLILLJJLI = map.containsKey("change");
            this.LLILLL = map.containsKey("scrollstart");
            this.LLILZ = map.containsKey("scrollend");
            this.LLILZIL = map.containsKey("transition");
            this.LLILZLL = map.containsKey("scrolltobounce");
            this.LLIZ = map.containsKey("contentsizechanged");
        }
    }

    @InterfaceC1312540kGC(defaultBoolean = false, name = "finish-reset")
    public void setFinishReset(boolean z) {
        this.LLJJJIL = z;
    }

    @InterfaceC1312540kGC(defaultBoolean = false, name = "force-can-scroll")
    public void setForceCanScroll(boolean z) {
        ((C21405118pl) this.mView).getViewPager().setForceCanScroll(z);
    }

    @InterfaceC1312540kGC(defaultBoolean = true, name = "handle-gesture")
    public void setHandleGesture(boolean z) {
        ((C21405118pl) this.mView).getViewPager().setHandleGesture(z);
    }

    @InterfaceC1312540kGC(defaultBoolean = false, name = "ignore-layout-update")
    public void setIgnoreLayoutUpdate(boolean z) {
        ((C21405118pl) this.mView).getViewPager().setIgnoreLayoutUpdate(z);
    }

    @InterfaceC1312540kGC(defaultBoolean = false, name = "indicator-dots")
    public void setIndicator(boolean z) {
        int i;
        LinearLayout linearLayout = ((C21405118pl) this.mView).LLILLJJLI;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJZL(i, linearLayout);
    }

    @InterfaceC1312540kGC(name = "indicator-active-color")
    public void setIndicatorActiveColor(String str) {
        int iLIZIZ;
        try {
            iLIZIZ = ColorUtils.LIZIZ(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            iLIZIZ = LLJLLL;
        }
        ((C21405118pl) this.mView).setSelectedColor(iLIZIZ);
    }

    @InterfaceC1312540kGC(name = "indicator-color")
    public void setIndicatorColor(String str) {
        int iLIZIZ;
        try {
            iLIZIZ = ColorUtils.LIZIZ(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            iLIZIZ = LLJZ;
        }
        ((C21405118pl) this.mView).setUnSelectedColor(iLIZIZ);
    }

    @InterfaceC1312540kGC(defaultInt = 5000, name = "interval")
    public void setInterval(int i) {
        this.LLJJIII = i;
    }

    @InterfaceC1312540kGC(defaultBoolean = false, name = "keep-item-view")
    public void setKeepItemView(boolean z) {
        ((C21405118pl) this.mView).getViewPager().setKeepItemView(z);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void setLynxDirection(int i) {
        super.setLynxDirection(i);
        if (i != 2 && i != 2) {
            ((C21405118pl) this.mView).setIsRtl(false);
        } else {
            ((C21405118pl) this.mView).setIsRtl(true);
        }
        this.LLJJJJ = true;
    }

    @InterfaceC1312540kGC(name = "max-x-scale")
    public void setMaxXScale(double d) {
        this.LLJL.LIZJ = (float) d;
    }

    @InterfaceC1312540kGC(name = "max-y-scale")
    public void setMaxYScale(double d) {
        this.LLJL.LJ = (float) d;
    }

    @InterfaceC1312540kGC(name = "min-x-scale")
    public void setMinXScale(double d) {
        this.LLJL.LIZIZ = (float) d;
    }

    @InterfaceC1312540kGC(name = "min-y-scale")
    public void setMinYScale(double d) {
        this.LLJL.LIZLLL = (float) d;
    }

    @InterfaceC1312540kGC(name = "mode")
    public void setMode(String str) {
        this.LL = str;
        this.LLJJJJ = true;
    }

    @InterfaceC1312540kGC(name = "next-margin")
    public void setNextMargin(InterfaceC1298070jsr interfaceC1298070jsr) {
        if (interfaceC1298070jsr.getType() != ReadableType.String) {
            return;
        }
        String strAsString = interfaceC1298070jsr.asString();
        if (strAsString.endsWith("px") || strAsString.endsWith("rpx")) {
            int iLIZIZ = (int) C1312920kGo.LIZIZ(strAsString, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, this.mContext.LLJJJ);
            if (iLIZIZ < 0) {
                iLIZIZ = -1;
            }
            this.LLJIJIL = iLIZIZ;
            this.LLJJJJ = true;
        }
    }

    @InterfaceC1312540kGC(defaultFloat = 0.0f, name = "norm-translation-factor")
    public void setNormalTranslationFactor(double d) {
        if (d <= 1.0d && d >= -1.0d) {
            this.LLJL.LIZ = (float) d;
            this.LLJJJJ = true;
        }
    }

    @InterfaceC1312540kGC(name = "orientation")
    public void setOrientation(String str) {
        if ("vertical".equals(str)) {
            this.LLJILJILJ = true;
            ((C21405118pl) this.mView).setOrientation(1);
        } else if ("horizontal".equals(str)) {
            this.LLJILJILJ = false;
            ((C21405118pl) this.mView).setOrientation(0);
        }
        this.LLJJJJ = true;
    }

    @InterfaceC1312540kGC(name = "page-margin")
    public void setPageMargin(InterfaceC1298070jsr interfaceC1298070jsr) {
        if (interfaceC1298070jsr.getType() == ReadableType.String) {
            String strAsString = interfaceC1298070jsr.asString();
            if (strAsString.endsWith("px") || strAsString.endsWith("rpx")) {
                int iLIZIZ = (int) C1312920kGo.LIZIZ(strAsString, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, this.mContext.LLJJJ);
                if (iLIZIZ <= 0) {
                    iLIZIZ = 0;
                }
                this.LLJI = iLIZIZ;
                this.LLJJJJ = true;
            }
        }
    }

    @InterfaceC1312540kGC(name = "previous-margin")
    public void setPreviousMargin(InterfaceC1298070jsr interfaceC1298070jsr) {
        if (interfaceC1298070jsr.getType() != ReadableType.String) {
            return;
        }
        String strAsString = interfaceC1298070jsr.asString();
        if (strAsString.endsWith("px") || strAsString.endsWith("rpx")) {
            int iLIZIZ = (int) C1312920kGo.LIZIZ(strAsString, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, this.mContext.LLJJJ);
            if (iLIZIZ < 0) {
                iLIZIZ = -1;
            }
            this.LLJILJIL = iLIZIZ;
            this.LLJJJJ = true;
        }
    }

    @InterfaceC1312540kGC(defaultBoolean = false, name = "scroll-before-detached")
    public void setScrollBeforeDetached(boolean z) {
        this.LLJJJJLIIL = z;
    }

    @InterfaceC1312540kGC(defaultBoolean = true, name = "smooth-scroll")
    public void setSmoothScroll(boolean z) {
        this.LLJJI = z;
        if (z) {
            ((C21405118pl) this.mView).getViewPager().setAnimDuration(this.LLJJIJI);
        } else {
            ((C21405118pl) this.mView).getViewPager().setAnimDuration(0);
        }
    }

    @InterfaceC1312540kGC(defaultBoolean = false, name = "touchable")
    public void setTouchable(boolean z) {
        this.LLJJL = z;
        ((C21405118pl) this.mView).getViewPager().setTouchable(z);
    }

    @InterfaceC1312540kGC(defaultInt = 0, name = "transition-throttle")
    public void setTransitionThrottle(int i) {
        this.LLJJIJIIJIL = i;
    }

    @InterfaceC1312540kGC(defaultBoolean = false, name = "vertical")
    public void setVertical(boolean z) {
        if (z) {
            ((C21405118pl) this.mView).setOrientation(1);
        } else {
            ((C21405118pl) this.mView).setOrientation(0);
        }
        this.LLJILJILJ = z;
        this.LLJJJJ = true;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.19aa] */
    /* JADX WARN: Type inference failed for: r0v8, types: [X.19hB] */
    public XSwiperUI(s sVar, Object obj) {
        super(sVar, obj);
        this.LL = "normal";
        this.LLIZLLLIL = -1;
        this.LLJ = -1;
        this.LLJI = -1;
        this.LLJIJIL = -1;
        this.LLJILJIL = -1;
        this.LLJJI = true;
        this.LLJJIII = 5000;
        this.LLJJIJI = 500;
        this.LLJJJJJIL = true;
        this.LLJJL = true;
        this.LLJJLIIIJLLLLLLLZ = new InterfaceC21576019cE() { // from class: X.19aa
            @Override // X.InterfaceC21576019cE
            public final void LLJJLIIIJLLLLLLLZ(View view) {
                if (view != null) {
                    C786410Ut5.Hb(view, 0.0f);
                    C786410Ut5.Ib(view, 0.0f);
                }
            }

            @Override // X.InterfaceC21576019cE
            public final void LLJL(C21606519h9 c21606519h9, View view, boolean z, int i) {
                float f;
                if (c21606519h9 != null) {
                    int childExpectSize = c21606519h9.getChildExpectSize();
                    if (childExpectSize != 0) {
                        f = i / childExpectSize;
                    } else {
                        f = 0.0f;
                    }
                    float fLIZ = C419990GdR.LIZ(f * 9.0f, -9.0f, 9.0f);
                    view.setCameraDistance(1280.0f);
                    if (z) {
                        C786410Ut5.Hb(view, fLIZ);
                    } else {
                        C786410Ut5.Ib(view, -fLIZ);
                    }
                }
            }
        };
        this.LLJL = new C21565919ab();
        this.LLJLIL = new BPEAHandler(Looper.getMainLooper());
        this.LLJLILLLLZIIL = new ArrayList();
        this.LLJLL = new Runnable(this) { // from class: X.19hB
            public final WeakReference<XSwiperUI> LL;

            public final void LIZ() {
                XSwiperUI xSwiperUI = this.LL.get();
                if (xSwiperUI != null && xSwiperUI.LLJJJ && xSwiperUI.LLJILLL) {
                    C21606519h9 viewPager = ((C21405118pl) xSwiperUI.mView).getViewPager();
                    boolean z = true;
                    int currentIndex = viewPager.getCurrentIndex() + 1;
                    if (currentIndex == viewPager.getTotalCount() && (xSwiperUI.LLJJJIL || xSwiperUI.LLJJ)) {
                        currentIndex = 0;
                    } else {
                        z = false;
                    }
                    xSwiperUI.LJJIJIIJIL(viewPager, currentIndex, xSwiperUI.LLJJI, z);
                    C786410Ut5.LJLIIL(xSwiperUI.LLJJIII, xSwiperUI.LLJLIL, this);
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("XSwiperUI$AutoScrollTask@dd0.run");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("XSwiperUI$AutoScrollTask@dd0.run");
            }

            {
                this.LL = new WeakReference<>(this);
            }
        };
        this.LLJLLIL = null;
    }

    public final void LJJIJIIJI(int i, boolean z) {
        C21606519h9 viewPager = ((C21405118pl) this.mView).getViewPager();
        if (viewPager.getChildCount() > 0) {
            viewPager.LLIZLLLIL = i;
            viewPager.LL = z;
            LJJIJIIJIL(viewPager, i, z, false);
        } else {
            viewPager.LLIZLLLIL = i;
            viewPager.LL = false;
        }
    }

    public final boolean LJJIJIL(C21606519h9 c21606519h9, int i) {
        int i2 = this.LLJILJIL;
        int i3 = this.LLJIJIL;
        int i4 = (i - i2) - i3;
        int i5 = this.LLJI;
        int i6 = (i4 - i5) - i5;
        if (this.LLJJJJJIL) {
            i4 = i6;
        }
        if (i2 >= 0 && i3 >= 0 && i4 > 0) {
            c21606519h9.setPageSize(i4);
            int i7 = this.LLJILJIL;
            int i8 = this.LLJI + i7;
            if (this.LLJJJJJIL) {
                i7 = i8;
            }
            if (isRtl() && !this.LLJILJILJ) {
                c21606519h9.LJIJJ(-i7, false);
                return false;
            }
            c21606519h9.LJIJJ(i7, false);
            return false;
        }
        return true;
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void insertChild(LynxBaseUI lynxBaseUI, int i) {
        if (lynxBaseUI instanceof LynxUI) {
            ListProtector.add(this.mChildren, i, lynxBaseUI);
            lynxBaseUI.setParent(this);
            ListProtector.add(this.LLJLILLLLZIIL, i, ((LynxUI) lynxBaseUI).mView);
            LJJIJ();
            ((C21405118pl) this.mView).LIZ();
            LJJIIZI(false, false, true);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final void onListCellAppear(String str, UIList uIList) {
        int iIntValue;
        super.onListCellPrepareForReuse(str, uIList);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String strConstructListStateCacheKey = constructListStateCacheKey(getTagName(), str, getIdSelector());
        if (((HashMap) uIList.LLJJJJLIIL).containsKey(strConstructListStateCacheKey)) {
            iIntValue = ((Integer) ((HashMap) uIList.LLJJJJLIIL).get(strConstructListStateCacheKey)).intValue();
        } else {
            iIntValue = -1;
        }
        LJJIJIIJI(iIntValue, false);
    }

    @InterfaceC1967107nB
    public void scrollTo(ReadableMap readableMap, Callback callback) {
        C21606519h9 viewPager = ((C21405118pl) this.mView).getViewPager();
        if (viewPager != null && viewPager.getAdapter() != null) {
            int i = readableMap.getInt("index", -1);
            boolean z = readableMap.getBoolean("smooth", this.LLJJI);
            int i2 = !readableMap.getString("direction", "end").equals("begin") ? 1 : 0;
            if (viewPager.getChildCount() == 0) {
                callback.invoke(1, "Check failed when invoking scrollTo method: no swiper item added to viewpager");
                return;
            }
            if (i >= 0 && i < viewPager.getTotalCount()) {
                if (i < viewPager.getTotalCount()) {
                    viewPager.LJIJI(i, i2, z);
                }
                callback.invoke(0);
                return;
            }
            callback.invoke(4, "Check failed when invoking scrollTo method: index < 0 or index >= data count");
            return;
        }
        callback.invoke(1, "Check failed when invoking scrollTo method: viewPager == null || adapter == null");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010c  */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Unknown Source)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:390)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:23)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:370)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:85)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:33)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:23)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIIZI(boolean r9, boolean r10, boolean r11) {
        /*
            Method dump skipped, instruction units count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.behavior.ui.swiper.XSwiperUI.LJJIIZI(boolean, boolean, boolean):void");
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onListCellDisAppear(String str, LynxBaseUI lynxBaseUI, boolean z) {
        super.onListCellDisAppear(str, lynxBaseUI, z);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String strConstructListStateCacheKey = constructListStateCacheKey(getTagName(), str, getIdSelector());
        if (z) {
            lynxBaseUI.storeKeyToNativeStorage(strConstructListStateCacheKey, Integer.valueOf(((C21405118pl) this.mView).getViewPager().getCurrentIndex()));
        } else {
            lynxBaseUI.removeKeyFromNativeStorage(strConstructListStateCacheKey);
        }
    }

    public final void LJJIJIIJIL(C21606519h9 c21606519h9, int i, boolean z, boolean z2) {
        int totalCount = c21606519h9.getTotalCount();
        int currentIndex = c21606519h9.getCurrentIndex();
        int i2 = 0;
        if (this.LLJJ) {
            if (i == 0 && currentIndex == totalCount - 1) {
                if (totalCount > 2 || z2) {
                    i2 = 1;
                }
                if (i < c21606519h9.getTotalCount()) {
                    c21606519h9.LJIJI(i, i2, z);
                    return;
                }
                return;
            }
            if (i == totalCount - 1 && currentIndex == 0) {
                if (totalCount <= 2) {
                    i2 = 1;
                }
                int totalCount2 = c21606519h9.getTotalCount();
                if (i < 0 || i >= totalCount2) {
                    return;
                }
                c21606519h9.LJIJI(i, i2, z);
                return;
            }
        }
        if (i >= currentIndex) {
            i2 = 1;
        }
        int totalCount3 = c21606519h9.getTotalCount();
        if (i < 0 || i >= totalCount3) {
            return;
        }
        c21606519h9.LJIJI(i, i2, z);
    }
}
