package com.bytedance.ies.xelement;

import X.AbstractC1585810rMx;
import X.AbstractC21673619ry;
import X.C08XD;
import X.C1298720jtu;
import X.C1299120juY;
import X.C1317430kO5;
import X.C1317510kOD;
import X.C1337450kuN;
import X.C1337460kuO;
import X.C1337560kuY;
import X.C2187701Ajg;
import X.C2188811AlT;
import X.EnumC1337520kuU;
import X.InterfaceC1311800kF0;
import X.InterfaceC1312540kGC;
import X.InterfaceC1337570kuZ;
import X.InterfaceC1337580kua;
import X.InterfaceC1967107nB;
import X.ViewTreeObserverOnScrollChangedListenerC1337500kuS;
import Y.AComparatorS39S0000000_20;
import Y.ARunnableS106S0100000_6;
import Y.ARunnableS89S0200000_20;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.os.Trace;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.xelement.LynxImpressionView;
import com.bytedance.ies.xelement.LynxScrollView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.log.LynxLog;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll;
import com.zhiliaoapp.musically.R;
import j27.s;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class LynxScrollView extends AbsLynxUIScroll<C1337450kuN> implements InterfaceC1311800kF0 {
    public static final /* synthetic */ int LLJJLIIIJLLLLLLLZ = 0;
    public final String LL;
    public int LLILLJJLI;
    public int LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;
    public C1337460kuO LLJIJIL;
    public LynxBounceView LLJILJIL;
    public int LLJILJILJ;
    public C1337560kuY LLJILLL;
    public int LLJJ;
    public int LLJJI;
    public boolean LLJJIII;
    public int LLJJIJI;
    public int LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public int LLJJJ;
    public int LLJJJIL;
    public boolean LLJJJJ;
    public final ArrayList<LynxBaseUI> LLJJJJJIL;
    public final HashSet<Integer> LLJJJJLIIL;
    public final HashSet<Integer> LLJJL;

    public LynxScrollView() {
        throw null;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final boolean canHaveFlattenChild() {
        return false;
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final boolean needCustomLayout() {
        return true;
    }

    @InterfaceC1312540kGC(name = "overflow-text")
    public final void overflowText(String str) {
    }

    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll
    public final void setScrollTap(boolean z) {
    }

    public final int LJJIJLIJ() {
        C1337460kuO c1337460kuO = this.LLJIJIL;
        if (c1337460kuO == null) {
            c1337460kuO = null;
        }
        RecyclerView.LayoutManager layoutManager = c1337460kuO.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null || this.mChildren.size() == 0) {
            return 0;
        }
        int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        if (iFindFirstVisibleItemPosition >= 0 && iFindFirstVisibleItemPosition < this.mChildren.size()) {
            View viewFindViewByPosition = linearLayoutManager.findViewByPosition(iFindFirstVisibleItemPosition);
            if (linearLayoutManager.canScrollHorizontally()) {
                if (this.mLynxDirection != 2) {
                    List<LynxBaseUI> list = this.mChildren;
                    int left = ((LynxBaseUI) ListProtector.get(list, list.size() - 1)).getLeft();
                    List<LynxBaseUI> list2 = this.mChildren;
                    int width = left + ((LynxBaseUI) ListProtector.get(list2, list2.size() - 1)).getWidth();
                    List<LynxBaseUI> list3 = this.mChildren;
                    int i = width + ((LynxBaseUI) ListProtector.get(list3, list3.size() - 1)).mMarginRight + this.mPaddingLeft;
                    int left2 = ((LynxBaseUI) ListProtector.get(this.mChildren, iFindFirstVisibleItemPosition)).getLeft() - (viewFindViewByPosition != null ? viewFindViewByPosition.getLeft() : 0);
                    int width2 = (i - left2) - getWidth();
                    i = left2 <= this.LLILLL ? 1 : 0;
                    if (width2 <= this.LLILLJJLI) {
                        i |= 2;
                    }
                    this.LLJJIJIIJIL = left2;
                    return i;
                }
                int width3 = getWidth();
                List<LynxBaseUI> list4 = this.mChildren;
                int left3 = width3 - ((LynxBaseUI) ListProtector.get(list4, list4.size() - 1)).getLeft();
                List<LynxBaseUI> list5 = this.mChildren;
                int i2 = left3 + ((LynxBaseUI) ListProtector.get(list5, list5.size() - 1)).mMarginLeft + this.mPaddingLeft;
                int left4 = ((((((LynxBaseUI) ListProtector.get(this.mChildren, 0)).getLeft() - ((LynxBaseUI) ListProtector.get(this.mChildren, iFindFirstVisibleItemPosition)).getLeft()) + ((LynxBaseUI) ListProtector.get(this.mChildren, 0)).getWidth()) + ((LynxBaseUI) ListProtector.get(this.mChildren, 0)).mMarginRight) + this.mPaddingRight) - (viewFindViewByPosition != null ? getWidth() - viewFindViewByPosition.getLeft() : 0);
                i = (i2 - getWidth()) - left4 <= this.LLILLJJLI ? 2 : 0;
                if (left4 <= this.LLILLL) {
                    i |= 1;
                }
                this.LLJJIJIIJIL = left4;
            } else if (linearLayoutManager.canScrollVertically()) {
                List<LynxBaseUI> list6 = this.mChildren;
                int top = ((LynxBaseUI) ListProtector.get(list6, list6.size() - 1)).getTop();
                List<LynxBaseUI> list7 = this.mChildren;
                int height = top + ((LynxBaseUI) ListProtector.get(list7, list7.size() - 1)).getHeight();
                List<LynxBaseUI> list8 = this.mChildren;
                int i3 = height + ((LynxBaseUI) ListProtector.get(list8, list8.size() - 1)).mMarginBottom + this.mPaddingBottom;
                int top2 = ((LynxBaseUI) ListProtector.get(this.mChildren, iFindFirstVisibleItemPosition)).getTop() - (viewFindViewByPosition != null ? viewFindViewByPosition.getTop() : 0);
                int height2 = (i3 - getHeight()) - top2;
                i = top2 <= this.LLILLL ? 1 : 0;
                if (height2 <= this.LLILLJJLI) {
                    i |= 2;
                }
                this.LLJJIJIIJIL = top2;
                return i;
            }
        }
        return i;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final int getScrollX() {
        C1337460kuO c1337460kuO = this.LLJIJIL;
        if (c1337460kuO == null) {
            c1337460kuO = null;
        }
        return c1337460kuO.computeHorizontalScrollOffset();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final int getScrollY() {
        C1337460kuO c1337460kuO = this.LLJIJIL;
        if (c1337460kuO == null) {
            c1337460kuO = null;
        }
        return c1337460kuO.computeVerticalScrollOffset();
    }

    @Override // X.InterfaceC1311800kF0
    public final void onPatchFinish() {
        if (this.LLJJJJ) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(this.LLJJL);
            C08XD.LJJ(arrayList, new AComparatorS39S0000000_20(16));
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Integer num = (Integer) it2.next();
                if (num.intValue() >= 0) {
                    String str = this.LL;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onPatchFinish: notifyItemRemoved = ");
                    sbLIZ.append(num.intValue());
                    LynxLog.d(str, C2188811AlT.LIZIZ(sbLIZ));
                    C1337460kuO c1337460kuO = this.LLJIJIL;
                    AbstractC21673619ry adapter = (c1337460kuO != null ? c1337460kuO : null).getAdapter();
                    if (adapter != null) {
                        adapter.notifyItemRemoved(num.intValue());
                    }
                }
            }
            ArrayList<Integer> arrayList2 = new ArrayList();
            arrayList2.addAll(this.LLJJJJLIIL);
            C08XD.LJJ(arrayList2, new AComparatorS39S0000000_20(17));
            for (Integer num2 : arrayList2) {
                if (num2.intValue() >= 0) {
                    String str2 = this.LL;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("onPatchFinish: notifyItemInserted = ");
                    sbLIZ2.append(num2.intValue());
                    LynxLog.d(str2, C2188811AlT.LIZIZ(sbLIZ2));
                    C1337460kuO c1337460kuO2 = this.LLJIJIL;
                    if (c1337460kuO2 == null) {
                        c1337460kuO2 = null;
                    }
                    AbstractC21673619ry adapter2 = c1337460kuO2.getAdapter();
                    if (adapter2 != null) {
                        adapter2.notifyItemInserted(num2.intValue());
                    }
                }
            }
            this.LLJJJJJIL.clear();
            this.LLJJJJJIL.addAll(this.mChildren);
            this.LLJJJJLIIL.clear();
            this.LLJJL.clear();
        }
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void destroy() {
        super.destroy();
        if (this.LLJJJJ) {
            this.LLJJJJJIL.clear();
        }
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup
    public final void measureChildren() {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        super.measureChildren();
        LynxBounceView lynxBounceView = this.LLJILJIL;
        if (lynxBounceView != null) {
            lynxBounceView.measure();
        }
        View mBounceView = ((C1337450kuN) this.mView).getMBounceView();
        if (mBounceView != null && (layoutParams2 = mBounceView.getLayoutParams()) != null) {
            LynxBounceView lynxBounceView2 = this.LLJILJIL;
            layoutParams2.width = (lynxBounceView2 != null ? Integer.valueOf(lynxBounceView2.getWidth()) : null).intValue();
        }
        View mBounceView2 = ((C1337450kuN) this.mView).getMBounceView();
        if (mBounceView2 != null && (layoutParams = mBounceView2.getLayoutParams()) != null) {
            LynxBounceView lynxBounceView3 = this.LLJILJIL;
            layoutParams.height = (lynxBounceView3 != null ? Integer.valueOf(lynxBounceView3.getHeight()) : null).intValue();
        }
        LynxBounceView lynxBounceView4 = this.LLJILJIL;
        if (lynxBounceView4 != null) {
            lynxBounceView4.layout();
        }
        this.LLJJJ = getWidth();
        this.LLJJJIL = getHeight();
        if (this.mChildren.isEmpty()) {
            return;
        }
        C1337460kuO c1337460kuO = this.LLJIJIL;
        if (c1337460kuO == null) {
            c1337460kuO = null;
        }
        RecyclerView.LayoutManager layoutManager = c1337460kuO.getLayoutManager();
        RecyclerView.LayoutManager layoutManager2 = layoutManager instanceof LinearLayoutManager ? layoutManager : null;
        if (!layoutManager2.canScrollHorizontally()) {
            if (layoutManager2.canScrollVertically()) {
                this.LLJJJIL = ((LynxBaseUI) ListProtector.get(this.mChildren, r1.size() - 1)).getTop() + ((LynxBaseUI) ListProtector.get(this.mChildren, r1.size() - 1)).getHeight() + ((LynxBaseUI) ListProtector.get(this.mChildren, r1.size() - 1)).mMarginBottom + this.mPaddingBottom;
                return;
            }
            return;
        }
        if (this.mLynxDirection == 2) {
            this.LLJJJ = (getWidth() - ((LynxBaseUI) ListProtector.get(this.mChildren, r1.size() - 1)).getLeft()) + ((LynxBaseUI) ListProtector.get(this.mChildren, r1.size() - 1)).mMarginLeft + this.mPaddingLeft;
            return;
        }
        this.LLJJJ = ((LynxBaseUI) ListProtector.get(this.mChildren, r1.size() - 1)).getLeft() + ((LynxBaseUI) ListProtector.get(this.mChildren, r1.size() - 1)).getWidth() + ((LynxBaseUI) ListProtector.get(this.mChildren, r1.size() - 1)).mMarginRight + this.mPaddingLeft;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onLayoutUpdated() {
        super.onLayoutUpdated();
        int i = this.mPaddingLeft + this.mBorderLeftWidth;
        int i2 = this.mPaddingRight + this.mBorderRightWidth;
        int i3 = this.mPaddingTop + this.mBorderTopWidth;
        int i4 = this.mPaddingBottom + this.mBorderBottomWidth;
        C1337460kuO c1337460kuO = this.LLJIJIL;
        if (c1337460kuO == null) {
            c1337460kuO = null;
        }
        c1337460kuO.setPadding(i, i3, i2, i4);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onNodeReload() {
        super.onNodeReload();
        LJJIJIL(0);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final boolean isCustomHittest() {
        return this.LLJI;
    }

    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll
    public final void LJJIJ(boolean z) {
        LinearLayoutManager linearLayoutManager;
        LinearLayoutManager linearLayoutManager2;
        if (z) {
            ((C1337450kuN) this.mView).setMScrollDirection(EnumC1337520kuU.HORIZONTAL_RIGHT);
            C1337460kuO c1337460kuO = this.LLJIJIL;
            if (c1337460kuO == null) {
                c1337460kuO = null;
            }
            RecyclerView.LayoutManager layoutManager = c1337460kuO.getLayoutManager();
            if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager2 = (LinearLayoutManager) layoutManager) != null) {
                linearLayoutManager2.setOrientation(0);
                return;
            }
            return;
        }
        ((C1337450kuN) this.mView).setMScrollDirection(EnumC1337520kuU.VERTICAL_BOTTOM);
        C1337460kuO c1337460kuO2 = this.LLJIJIL;
        if (c1337460kuO2 == null) {
            c1337460kuO2 = null;
        }
        RecyclerView.LayoutManager layoutManager2 = c1337460kuO2.getLayoutManager();
        if (!(layoutManager2 instanceof LinearLayoutManager) || (linearLayoutManager = (LinearLayoutManager) layoutManager2) == null) {
            return;
        }
        linearLayoutManager.setOrientation(1);
    }

    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll
    public final void LJJIJIIJI(boolean z) {
        LinearLayoutManager linearLayoutManager;
        LinearLayoutManager linearLayoutManager2;
        if (!z) {
            ((C1337450kuN) this.mView).setMScrollDirection(EnumC1337520kuU.HORIZONTAL_RIGHT);
            C1337460kuO c1337460kuO = this.LLJIJIL;
            if (c1337460kuO == null) {
                c1337460kuO = null;
            }
            RecyclerView.LayoutManager layoutManager = c1337460kuO.getLayoutManager();
            if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager2 = (LinearLayoutManager) layoutManager) != null) {
                linearLayoutManager2.setOrientation(0);
                return;
            }
            return;
        }
        ((C1337450kuN) this.mView).setMScrollDirection(EnumC1337520kuU.VERTICAL_BOTTOM);
        C1337460kuO c1337460kuO2 = this.LLJIJIL;
        if (c1337460kuO2 == null) {
            c1337460kuO2 = null;
        }
        RecyclerView.LayoutManager layoutManager2 = c1337460kuO2.getLayoutManager();
        if (!(layoutManager2 instanceof LinearLayoutManager) || (linearLayoutManager = (LinearLayoutManager) layoutManager2) == null) {
            return;
        }
        linearLayoutManager.setOrientation(1);
    }

    public final boolean LJJIJIL(int i) {
        C1337460kuO c1337460kuO = this.LLJIJIL;
        C1337460kuO c1337460kuO2 = null;
        if (c1337460kuO == null) {
            c1337460kuO = null;
        }
        int iComputeHorizontalScrollRange = c1337460kuO.computeHorizontalScrollRange();
        C1337460kuO c1337460kuO3 = this.LLJIJIL;
        if (c1337460kuO3 == null) {
            c1337460kuO3 = null;
        }
        int iComputeVerticalScrollRange = c1337460kuO3.computeVerticalScrollRange();
        if (iComputeHorizontalScrollRange > 0) {
            C1337460kuO c1337460kuO4 = this.LLJIJIL;
            if (c1337460kuO4 == null) {
                c1337460kuO4 = null;
            }
            int iComputeHorizontalScrollOffset = i - c1337460kuO4.computeHorizontalScrollOffset();
            C1337460kuO c1337460kuO5 = this.LLJIJIL;
            if (c1337460kuO5 != null) {
                c1337460kuO2 = c1337460kuO5;
            }
            c1337460kuO2.scrollBy(iComputeHorizontalScrollOffset, 0);
            return true;
        }
        if (iComputeVerticalScrollRange <= 0) {
            return false;
        }
        C1337460kuO c1337460kuO6 = this.LLJIJIL;
        if (c1337460kuO6 == null) {
            c1337460kuO6 = null;
        }
        int iComputeVerticalScrollOffset = i - c1337460kuO6.computeVerticalScrollOffset();
        C1337460kuO c1337460kuO7 = this.LLJIJIL;
        if (c1337460kuO7 != null) {
            c1337460kuO2 = c1337460kuO7;
        }
        c1337460kuO2.scrollBy(0, iComputeVerticalScrollOffset);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [X.0kuS] */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.0kuO, android.view.View, androidx.recyclerview.widget.RecyclerView] */
    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final View createView(final Context context) {
        C1337450kuN c1337450kuN = new C1337450kuN(context);
        c1337450kuN.setOnScrollToEndListener(new InterfaceC1337580kua() { // from class: X.0kuR
            @Override // X.InterfaceC1337580kua
            public final void LIZ() {
                s sVar;
                C1298720jtu c1298720jtu;
                LynxScrollView lynxScrollView = this.LIZ;
                if (!lynxScrollView.LLILZ || (sVar = lynxScrollView.mContext) == null || (c1298720jtu = sVar.LLIZ) == null) {
                    return;
                }
                c1298720jtu.LIZIZ(new C1298700jts(lynxScrollView.getSign(), "scrolltobounce"));
            }
        });
        c1337450kuN.setOnBounceScrollListener(new InterfaceC1337570kuZ() { // from class: X.0kuT
            @Override // X.InterfaceC1337570kuZ
            public final void LIZ(int i, int i2, int i3, int i4) {
                if (!((C1337450kuN) this.LIZ.mView).getMEnableBounce()) {
                    return;
                }
                if (((C1337450kuN) this.LIZ.mView).getMScrollDirection() != EnumC1337520kuU.HORIZONTAL_LEFT && ((C1337450kuN) this.LIZ.mView).getMScrollDirection() != EnumC1337520kuU.HORIZONTAL_RIGHT) {
                    LynxScrollView lynxScrollView = this.LIZ;
                    int i5 = lynxScrollView.LLJJIJIIJIL;
                    lynxScrollView.LJJIJL(0, i5 + i2, 0, i5 + i4, "scroll");
                } else {
                    LynxScrollView lynxScrollView2 = this.LIZ;
                    int i6 = lynxScrollView2.LLJJIJIIJIL;
                    lynxScrollView2.LJJIJL(i6 + i, 0, i6 + i3, 0, "scroll");
                }
            }
        });
        c1337450kuN.setMScrollDirection(EnumC1337520kuU.VERTICAL_BOTTOM);
        ?? r2 = new RecyclerView(context) { // from class: X.0kuO
            @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
            public final void onDetachedFromWindow() {
                LynxScrollView lynxScrollView = this;
                C1337560kuY c1337560kuY = lynxScrollView.LLJILLL;
                if (c1337560kuY != null) {
                    C1337460kuO c1337460kuO = lynxScrollView.LLJIJIL;
                    if (c1337460kuO == null) {
                        c1337460kuO = null;
                    }
                    ViewTreeObserver viewTreeObserver = c1337460kuO.getViewTreeObserver();
                    if (viewTreeObserver != null) {
                        ViewTreeObserverOnScrollChangedListenerC1337500kuS viewTreeObserverOnScrollChangedListenerC1337500kuS = c1337560kuY.LIZJ;
                        viewTreeObserver.removeOnScrollChangedListener(viewTreeObserverOnScrollChangedListenerC1337500kuS);
                        C2187701Ajg.LIZIZ(viewTreeObserver, viewTreeObserverOnScrollChangedListenerC1337500kuS, ViewTreeObserver.OnScrollChangedListener.class);
                    }
                    c1337560kuY.LIZJ = null;
                }
                super.onDetachedFromWindow();
                this.LLJILLL = null;
            }

            @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
            public final void onAttachedToWindow() {
                super.onAttachedToWindow();
                AbstractC21673719rz itemAnimator = getItemAnimator();
                if (itemAnimator != null) {
                    itemAnimator.LJIJI();
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
            public final void requestLayout() {
                AbstractC21673619ry adapter;
                if (isLayoutRequested()) {
                    return;
                }
                int i = C08C0.LIZ;
                Trace.beginSection("LynxScrollView recyclerview requestLayout");
                LynxScrollView lynxScrollView = this;
                if (lynxScrollView.LLJJIII) {
                    return;
                }
                lynxScrollView.LLJJIII = true;
                super.requestLayout();
                if (!isLayoutRequested()) {
                    C259800zU c259800zU = new C259800zU();
                    c259800zU.element = this;
                    HandlerHook.viewPost(this, new ARunnableS106S0100000_6(c259800zU, (C259800zU<ValueAnimator>) 310));
                }
                LynxScrollView lynxScrollView2 = this;
                if (lynxScrollView2.LLJJIJIL) {
                    Iterator<LynxBaseUI> it2 = lynxScrollView2.mChildren.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        LynxBaseUI next = it2.next();
                        if (next instanceof LynxUI) {
                            T t = ((LynxUI) next).mView;
                            if ((t != 0 ? Boolean.valueOf(t.isLayoutRequested()) : null).booleanValue()) {
                                if (!isComputingLayout() && (adapter = getAdapter()) != null) {
                                    adapter.notifyDataSetChanged();
                                }
                            }
                        }
                    }
                }
                this.LLJJIII = false;
                Trace.endSection();
            }

            {
                new LinkedHashMap();
                new LinkedHashMap();
            }

            @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
            public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
                try {
                    super.onLayout(z, i, i2, i3, i4);
                } catch (IllegalArgumentException e) {
                    TryCatchGuardChecker.doCheck(e);
                    String str = this.LL;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("scrollView onLayout. the error message:");
                    sbLIZ.append(e.getMessage());
                    LynxLog.e(str, C2188811AlT.LIZIZ(sbLIZ));
                }
            }
        };
        r2.setAdapter(new AbstractC21673619ry<C1317430kO5>() { // from class: X.0kO4
            public final HashSet<Integer> LL = new HashSet<>();

            @Override // X.AbstractC21673619ry
            public final int getItemCount() {
                return this.LLILLJJLI.mChildren.size();
            }

            @Override // X.AbstractC21673619ry
            public final int getItemViewType(int i) {
                return ListProtector.get(this.LLILLJJLI.mChildren, i).hashCode();
            }

            @Override // X.AbstractC21673619ry
            public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
                s sVar;
                C1298720jtu c1298720jtu;
                int adapterPosition = viewHolder.getAdapterPosition();
                if (adapterPosition >= 0 && adapterPosition < this.LLILLJJLI.mChildren.size() && !this.LL.contains(Integer.valueOf(adapterPosition))) {
                    LynxBaseUI lynxBaseUI = (LynxBaseUI) ListProtector.get(this.LLILLJJLI.mChildren, adapterPosition);
                    if (lynxBaseUI != null && (lynxBaseUI instanceof LynxImpressionView)) {
                        LynxImpressionView lynxImpressionView = (LynxImpressionView) lynxBaseUI;
                        if (lynxImpressionView.LL && (sVar = lynxImpressionView.mContext) != null && (c1298720jtu = sVar.LLIZ) != null) {
                            c1298720jtu.LIZIZ(new C1298700jts(lynxImpressionView.getSign(), "impression"));
                        }
                    }
                    this.LL.add(Integer.valueOf(adapterPosition));
                }
            }

            @Override // X.AbstractC21673619ry
            public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
                s sVar;
                C1298720jtu c1298720jtu;
                int adapterPosition = viewHolder.getAdapterPosition();
                if (adapterPosition >= 0 && adapterPosition < this.LLILLJJLI.mChildren.size() && this.LL.contains(Integer.valueOf(adapterPosition))) {
                    LynxBaseUI lynxBaseUI = (LynxBaseUI) ListProtector.get(this.LLILLJJLI.mChildren, adapterPosition);
                    if (lynxBaseUI != null && (lynxBaseUI instanceof LynxImpressionView)) {
                        LynxImpressionView lynxImpressionView = (LynxImpressionView) lynxBaseUI;
                        if (lynxImpressionView.LLILLJJLI && (sVar = lynxImpressionView.mContext) != null && (c1298720jtu = sVar.LLIZ) != null) {
                            c1298720jtu.LIZIZ(new C1298700jts(lynxImpressionView.getSign(), "exit"));
                        }
                    }
                    this.LL.remove(Integer.valueOf(adapterPosition));
                }
            }

            @Override // X.AbstractC21673619ry
            public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                ViewGroup viewGroup;
                ViewGroup viewGroup2;
                LynxUI lynxUI;
                LynxScrollView lynxScrollView = this.LLILLJJLI;
                View view = viewHolder.itemView;
                lynxScrollView.getClass();
                RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(((LynxBaseUI) ListProtector.get(lynxScrollView.mChildren, i)).getWidth(), ((LynxBaseUI) ListProtector.get(lynxScrollView.mChildren, i)).getHeight());
                ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = ((LynxBaseUI) ListProtector.get(lynxScrollView.mChildren, i)).mMarginLeft;
                ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = ((LynxBaseUI) ListProtector.get(lynxScrollView.mChildren, i)).mMarginRight;
                ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = ((LynxBaseUI) ListProtector.get(lynxScrollView.mChildren, i)).mMarginTop;
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = ((LynxBaseUI) ListProtector.get(lynxScrollView.mChildren, i)).mMarginBottom;
                C786410Ut5.W5(view, layoutParams);
                LynxScrollView lynxScrollView2 = this.LLILLJJLI;
                if (lynxScrollView2.LLJJJJ && i >= 0 && i < lynxScrollView2.mChildren.size()) {
                    View view2 = viewHolder.itemView;
                    View view3 = null;
                    if (view2 instanceof ViewGroup) {
                        viewGroup = (ViewGroup) view2;
                    } else {
                        viewGroup = null;
                    }
                    Object obj = ListProtector.get(this.LLILLJJLI.mChildren, i);
                    if ((obj instanceof LynxUI) && (lynxUI = (LynxUI) obj) != null) {
                        view3 = lynxUI.mView;
                    }
                    if (viewGroup != null && view3 != null) {
                        C786410Ut5.LJJJJI(viewGroup);
                        ViewParent parent = view3.getParent();
                        if ((parent instanceof ViewGroup) && (viewGroup2 = (ViewGroup) parent) != null) {
                            C786410Ut5.LJJJJI(viewGroup2);
                        }
                        viewGroup.addView(view3);
                    }
                }
            }

            @Override // X.AbstractC21673619ry
            public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                RecyclerView.ViewHolder viewHolder;
                ViewGroup viewGroup2;
                Iterator<LynxBaseUI> it2 = this.LLILLJJLI.mChildren.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        LynxBaseUI next = it2.next();
                        if (next.hashCode() == i) {
                            final View view = ((LynxUI) next).mView;
                            if (this.LLILLJJLI.LLJJJJ) {
                                ViewParent parent = view.getParent();
                                if ((parent instanceof ViewGroup) && (viewGroup2 = (ViewGroup) parent) != null) {
                                    C786410Ut5.LJJJLZIJ(view, viewGroup2);
                                }
                                final FrameLayout frameLayout = new FrameLayout(this.LLILLJJLI.mContext);
                                frameLayout.addView(view, new FrameLayout.LayoutParams(-2, -2));
                                viewHolder = new RecyclerView.ViewHolder(frameLayout) { // from class: X.0kO5
                                };
                            } else {
                                viewHolder = new RecyclerView.ViewHolder(view) { // from class: X.0kO5
                                };
                            }
                        }
                    } else {
                        final FrameLayout frameLayout2 = new FrameLayout(this.LLILLJJLI.mContext.LIZ());
                        viewHolder = new RecyclerView.ViewHolder(frameLayout2) { // from class: X.0kO5
                        };
                        break;
                    }
                }
                try {
                    View view2 = viewHolder.itemView;
                    if (view2 != null) {
                        view2.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
                viewHolder.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
                try {
                    if (viewHolder.itemView.getParent() != null) {
                        try {
                            SettingsManager.LIZLLL().getClass();
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                        if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                            StringBuffer stringBuffer = new StringBuffer();
                            stringBuffer.append("onCreateViewHolder getParent() != null crash hook,");
                            stringBuffer.append(" holder ");
                            stringBuffer.append(C1317430kO5.class.getName());
                            stringBuffer.append(" parent ");
                            stringBuffer.append(viewGroup.getClass().getName());
                            stringBuffer.append(" viewType ");
                            stringBuffer.append(i);
                            C1AF0.LIZJ(stringBuffer.toString());
                            ViewGroup viewGroup3 = (ViewGroup) viewHolder.itemView.getParent();
                            if (viewGroup3 != null) {
                                C786410Ut5.LJJJLZIJ(viewHolder.itemView, viewGroup3);
                            }
                        }
                    }
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    C2081408Dk.LIZ(e2);
                    C2344809Gs.LIZ(e2);
                }
                C20612085q.LIZ = C1317430kO5.class.getName();
                return viewHolder;
            }
        });
        r2.setLayoutDirection(0);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context) { // from class: X.0kuQ
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public final void onLayoutCompleted(C21673919s1 c21673919s1) {
                super.onLayoutCompleted(c21673919s1);
                LynxScrollView lynxScrollView = this;
                int i = lynxScrollView.LLJJ;
                if (i > 0 && lynxScrollView.LJJIJIIJIL(i, false)) {
                    this.LLJJ = 0;
                }
                if (this.LLJJI > 0) {
                    C118300cf c118300cf = new C118300cf();
                    LynxScrollView lynxScrollView2 = this;
                    c118300cf.element = lynxScrollView2.LLJJI;
                    lynxScrollView2.LLJJI = 0;
                    C1337460kuO c1337460kuO = lynxScrollView2.LLJIJIL;
                    if (c1337460kuO == null) {
                        c1337460kuO = null;
                    }
                    HandlerHook.viewPost(c1337460kuO, new ARunnableS89S0200000_20(c118300cf, lynxScrollView2, 230));
                }
            }

            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public final void smoothScrollToPosition(RecyclerView recyclerView, C21673919s1 c21673919s1, int i) {
                final Context context2 = recyclerView.getContext();
                C21674119s3 c21674119s3 = new C21674119s3(context2) { // from class: X.0kuW
                    @Override // X.C21674119s3
                    public final int LJIILJJIL() {
                        return -1;
                    }

                    @Override // X.C21674119s3
                    public final int LJIILL() {
                        return -1;
                    }

                    @Override // X.C21674119s3
                    public final float LJIIJJI(DisplayMetrics displayMetrics) {
                        if (displayMetrics != null) {
                            return 50.0f / displayMetrics.densityDpi;
                        }
                        throw new NullPointerException("densityDpi");
                    }
                };
                c21674119s3.LIZ = i;
                startSmoothScroll(c21674119s3);
            }
        };
        linearLayoutManager.setOrientation(1);
        r2.setLayoutManager(linearLayoutManager);
        r2.addOnScrollListener(new AbstractC1585810rMx() { // from class: X.0kuP
            @Override // X.AbstractC1585810rMx
            public final void LJJIIJ(RecyclerView recyclerView, int i) {
                if (1 == i) {
                    this.LL.mContext.LJIIIZ().LIZIZ(this.LL.getSign(), this.LL.mScrollMonitorTag);
                }
                this.LL.recognizeGesturere();
                LynxScrollView lynxScrollView = this.LL;
                if (lynxScrollView.LLIZLLLIL && lynxScrollView.LLJILJILJ == 1 && (i == 2 || i == 0)) {
                    if (((C1337450kuN) lynxScrollView.mView).getMScrollDirection() == EnumC1337520kuU.HORIZONTAL_LEFT || ((C1337450kuN) this.LL.mView).getMScrollDirection() == EnumC1337520kuU.HORIZONTAL_RIGHT) {
                        int iComputeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
                        this.LL.LJJIJL(iComputeHorizontalScrollOffset, 0, iComputeHorizontalScrollOffset, 0, "dragend");
                    }
                    if (((C1337450kuN) this.LL.mView).getMScrollDirection() == EnumC1337520kuU.VERTICAL_BOTTOM || ((C1337450kuN) this.LL.mView).getMScrollDirection() == EnumC1337520kuU.VERTICAL_TOP) {
                        int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
                        this.LL.LJJIJL(0, iComputeVerticalScrollOffset, 0, iComputeVerticalScrollOffset, "dragend");
                    }
                }
                LynxScrollView lynxScrollView2 = this.LL;
                lynxScrollView2.LLJILJILJ = i;
                if (i == 0) {
                    lynxScrollView2.mContext.LJIIIZ().LIZJ(this.LL.getSign());
                    LynxScrollView lynxScrollView3 = this.LL;
                    if (!lynxScrollView3.LLJ) {
                        return;
                    }
                    if (((C1337450kuN) lynxScrollView3.mView).getMScrollDirection() != EnumC1337520kuU.HORIZONTAL_LEFT && ((C1337450kuN) this.LL.mView).getMScrollDirection() != EnumC1337520kuU.HORIZONTAL_RIGHT) {
                        if (((C1337450kuN) this.LL.mView).getMScrollDirection() == EnumC1337520kuU.VERTICAL_BOTTOM || ((C1337450kuN) this.LL.mView).getMScrollDirection() == EnumC1337520kuU.VERTICAL_TOP) {
                            int measuredHeight = recyclerView.getMeasuredHeight();
                            int iComputeVerticalScrollOffset2 = recyclerView.computeVerticalScrollOffset() % measuredHeight;
                            if (iComputeVerticalScrollOffset2 * 2 > measuredHeight) {
                                recyclerView.smoothScrollBy(0, measuredHeight - iComputeVerticalScrollOffset2);
                                return;
                            } else {
                                recyclerView.smoothScrollBy(0, -iComputeVerticalScrollOffset2);
                                return;
                            }
                        }
                        return;
                    }
                    int measuredWidth = recyclerView.getMeasuredWidth();
                    int iComputeHorizontalScrollOffset2 = recyclerView.computeHorizontalScrollOffset() % measuredWidth;
                    if (iComputeHorizontalScrollOffset2 * 2 > measuredWidth) {
                        recyclerView.smoothScrollBy(measuredWidth - iComputeHorizontalScrollOffset2, 0);
                    } else {
                        recyclerView.smoothScrollBy(-iComputeHorizontalScrollOffset2, 0);
                    }
                }
            }

            /* JADX WARN: Code restructure failed: missing block: B:12:0x0018, code lost:
            
                if (r3.LLILZIL != false) goto L13;
             */
            /* JADX WARN: Removed duplicated region for block: B:28:0x0046  */
            /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
            @Override // X.AbstractC1585810rMx
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LJJIIZI(androidx.recyclerview.widget.RecyclerView r10, int r11, int r12) {
                /*
                    r9 = this;
                    com.bytedance.ies.xelement.LynxScrollView r1 = r9.LL
                    boolean r0 = r1.LLIZ
                    r5 = 0
                    if (r0 != 0) goto La3
                    boolean r0 = r1.LLILZLL
                    if (r0 != 0) goto La3
                    boolean r0 = r1.LLILZIL
                    if (r0 != 0) goto La3
                    r0 = 0
                L10:
                    com.bytedance.ies.xelement.LynxScrollView r3 = r9.LL
                    boolean r1 = r3.LLILZLL
                    if (r1 != 0) goto L72
                    boolean r1 = r3.LLILZIL
                    if (r1 == 0) goto L40
                L1a:
                    boolean r1 = r3.LLILZIL
                    if (r1 == 0) goto L3c
                    r1 = r0 & 1
                    if (r1 == 0) goto L70
                    r2 = 1
                L23:
                    int r1 = r3.LLJJIJI
                    r1 = r1 & 1
                    if (r1 == 0) goto L2a
                    r5 = 1
                L2a:
                    r1 = r5 ^ 1
                    r2 = r2 & r1
                    if (r2 == 0) goto L3c
                    if (r11 == 0) goto L62
                    int r4 = r3.LLJJIJIIJIL
                    r5 = 0
                    int r6 = r4 - r11
                    java.lang.String r8 = "scrolltoupper"
                    r7 = r5
                    r3.LJJIJL(r4, r5, r6, r7, r8)
                L3c:
                    com.bytedance.ies.xelement.LynxScrollView r1 = r9.LL
                    r1.LLJJIJI = r0
                L40:
                    com.bytedance.ies.xelement.LynxScrollView r1 = r9.LL
                    boolean r0 = r1.LLIZ
                    if (r0 == 0) goto L53
                    if (r11 == 0) goto L54
                    int r2 = r1.LLJJIJIIJIL
                    r3 = 0
                    int r4 = r2 - r11
                    java.lang.String r6 = "scroll"
                    r5 = r3
                    r1.LJJIJL(r2, r3, r4, r5, r6)
                L53:
                    return
                L54:
                    if (r12 == 0) goto L53
                    r2 = 0
                    int r3 = r1.LLJJIJIIJIL
                    int r5 = r3 - r12
                    java.lang.String r6 = "scroll"
                    r4 = r2
                    r1.LJJIJL(r2, r3, r4, r5, r6)
                    return
                L62:
                    if (r12 == 0) goto L3c
                    r4 = 0
                    int r5 = r3.LLJJIJIIJIL
                    int r7 = r5 - r12
                    java.lang.String r8 = "scrolltoupper"
                    r6 = r4
                    r3.LJJIJL(r4, r5, r6, r7, r8)
                    goto L3c
                L70:
                    r2 = 0
                    goto L23
                L72:
                    r1 = r0 & 2
                    if (r1 == 0) goto L92
                    r2 = 1
                L77:
                    int r1 = r3.LLJJIJI
                    r1 = r1 & 2
                    if (r1 == 0) goto L90
                    r1 = 1
                L7e:
                    r1 = r1 ^ 1
                    r2 = r2 & r1
                    if (r2 == 0) goto L1a
                    if (r11 == 0) goto L94
                    int r4 = r3.LLJJIJIIJIL
                    int r6 = r4 - r11
                    java.lang.String r8 = "scrolltolower"
                    r7 = r5
                    r3.LJJIJL(r4, r5, r6, r7, r8)
                    goto L3c
                L90:
                    r1 = 0
                    goto L7e
                L92:
                    r2 = 0
                    goto L77
                L94:
                    if (r12 == 0) goto L3c
                    int r4 = r3.LLJJIJIIJIL
                    int r6 = r4 - r12
                    java.lang.String r7 = "scrolltolower"
                    r2 = r3
                    r3 = r5
                    r5 = r5
                    r2.LJJIJL(r3, r4, r5, r6, r7)
                    goto L3c
                La3:
                    int r0 = r1.LJJIJLIJ()
                    goto L10
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1337470kuP.LJJIIZI(androidx.recyclerview.widget.RecyclerView, int, int):void");
            }
        });
        r2.setClipToPadding(false);
        this.LLJIJIL = r2;
        c1337450kuN.setMContentView(r2);
        C1337460kuO c1337460kuO = this.LLJIJIL;
        final C1337460kuO c1337460kuO2 = null;
        if (c1337460kuO == null) {
            c1337460kuO = null;
        }
        c1337460kuO.setClipChildren(false);
        C1337460kuO c1337460kuO3 = this.LLJIJIL;
        if (c1337460kuO3 != null) {
            c1337460kuO2 = c1337460kuO3;
        }
        final C1337560kuY c1337560kuY = new C1337560kuY();
        this.LLJILLL = c1337560kuY;
        c1337460kuO2.addOnScrollListener(c1337560kuY.LIZLLL);
        c1337560kuY.LIZJ = new ViewTreeObserver.OnScrollChangedListener(c1337460kuO2, c1337560kuY) { // from class: X.0kuS
            public final RecyclerView LL;
            public final C1337560kuY LLILLJJLI;

            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                LinearLayoutManager linearLayoutManager2;
                RecyclerView recyclerView = this.LL;
                if (recyclerView != null && recyclerView.getVisibility() == 0 && recyclerView.getGlobalVisibleRect(new Rect())) {
                    RecyclerView.LayoutManager layoutManager = this.LL.getLayoutManager();
                    if (!(layoutManager instanceof LinearLayoutManager) || (linearLayoutManager2 = (LinearLayoutManager) layoutManager) == null) {
                        return;
                    }
                    int iFindFirstVisibleItemPosition = linearLayoutManager2.findFirstVisibleItemPosition();
                    int iFindLastVisibleItemPosition = linearLayoutManager2.findLastVisibleItemPosition();
                    if (iFindFirstVisibleItemPosition == -1 || iFindLastVisibleItemPosition - iFindFirstVisibleItemPosition < 0) {
                        return;
                    }
                    this.LLILLJJLI.LIZ(iFindFirstVisibleItemPosition, iFindLastVisibleItemPosition);
                }
            }

            {
                this.LL = c1337460kuO2;
                this.LLILLJJLI = c1337560kuY;
            }
        };
        ViewTreeObserver viewTreeObserver = c1337460kuO2.getViewTreeObserver();
        if (viewTreeObserver != null) {
            ViewTreeObserverOnScrollChangedListenerC1337500kuS viewTreeObserverOnScrollChangedListenerC1337500kuS = c1337560kuY.LIZJ;
            viewTreeObserver.addOnScrollChangedListener(viewTreeObserverOnScrollChangedListenerC1337500kuS);
            C2187701Ajg.LIZ(viewTreeObserver, viewTreeObserverOnScrollChangedListenerC1337500kuS, ViewTreeObserver.OnScrollChangedListener.class);
        }
        c1337450kuN.setClipChildren(false);
        return c1337450kuN;
    }

    @InterfaceC1312540kGC(defaultBoolean = true, name = "enable-load-more")
    public final void enableLoadMore(boolean z) {
        this.LLJJIJIL = z;
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void removeChild(LynxBaseUI lynxBaseUI) {
        String str = this.LL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("removeChild ");
        sbLIZ.append(lynxBaseUI);
        sbLIZ.append(" with unifiedNotifyItemChanged = ");
        sbLIZ.append(this.LLJJJJ);
        LynxLog.d(str, C2188811AlT.LIZIZ(sbLIZ));
        if (this.LLJJJJ) {
            int iIndexOf = this.LLJJJJJIL.indexOf(lynxBaseUI);
            if (iIndexOf >= 0) {
                this.LLJJL.add(Integer.valueOf(iIndexOf));
            }
            this.mChildren.remove(lynxBaseUI);
            return;
        }
        int iIndexOf2 = this.mChildren.indexOf(lynxBaseUI);
        if (!this.mChildren.remove(lynxBaseUI)) {
            return;
        }
        C1337460kuO c1337460kuO = this.LLJIJIL;
        if (c1337460kuO == null) {
            c1337460kuO = null;
        }
        AbstractC21673619ry adapter = c1337460kuO.getAdapter();
        if (adapter == null) {
            return;
        }
        adapter.notifyItemRemoved(iIndexOf2);
    }

    @InterfaceC1312540kGC(name = "scroll-to-id")
    public final void scrollToId(String str) {
        C1337460kuO c1337460kuO;
        LynxBaseUI next;
        Iterator<LynxBaseUI> it2 = this.mChildren.iterator();
        do {
            c1337460kuO = null;
            if (it2.hasNext()) {
                next = it2.next();
            } else {
                return;
            }
        } while (!Intrinsics.LJFF(next.mName, str));
        if (next != null) {
            int iIndexOf = this.mChildren.indexOf(next);
            C1337460kuO c1337460kuO2 = this.LLJIJIL;
            if (c1337460kuO2 == null) {
                c1337460kuO2 = null;
            }
            if (c1337460kuO2.getAdapter() == null) {
                return;
            }
            C1337460kuO c1337460kuO3 = this.LLJIJIL;
            if (c1337460kuO3 == null) {
                c1337460kuO3 = null;
            }
            if (c1337460kuO3.getAdapter().getItemCount() <= iIndexOf) {
                return;
            }
            C1337460kuO c1337460kuO4 = this.LLJIJIL;
            if (c1337460kuO4 != null) {
                c1337460kuO = c1337460kuO4;
            }
            c1337460kuO.smoothScrollToPosition(iIndexOf);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll
    public final void scrollToIndex(int i) {
        if (!LJJIJIIJIL(i, false)) {
            this.LLJJ = i;
        } else {
            this.LLJJ = 0;
        }
    }

    @InterfaceC1312540kGC(defaultBoolean = false, name = "bounce")
    public final void setBounces(boolean z) {
        ((C1337450kuN) this.mView).setMEnableBounce(z);
    }

    @InterfaceC1312540kGC(name = "enable-custom-hittest")
    public final void setEnableCustomHittest(boolean z) {
        this.LLJI = z;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void setEvents(Map<String, ? extends C1299120juY> map) {
        super.setEvents(map);
        if (map != null) {
            this.LLILZLL = map.containsKey("scrolltolower");
            this.LLILZIL = map.containsKey("scrolltoupper");
            this.LLIZ = map.containsKey("scroll");
            this.LLILZ = map.containsKey("scrolltobounce");
            this.LLIZLLLIL = map.containsKey("dragend");
        }
    }

    @InterfaceC1312540kGC(name = "layout-direction")
    public final void setLayoutDirection(String str) {
        C1337460kuO c1337460kuO = null;
        if (Intrinsics.LJFF(str, "ltr")) {
            C1337460kuO c1337460kuO2 = this.LLJIJIL;
            if (c1337460kuO2 != null) {
                c1337460kuO = c1337460kuO2;
            }
            c1337460kuO.setLayoutDirection(0);
            return;
        }
        if (!Intrinsics.LJFF(str, "rtl")) {
            return;
        }
        C1337460kuO c1337460kuO3 = this.LLJIJIL;
        if (c1337460kuO3 != null) {
            c1337460kuO = c1337460kuO3;
        }
        c1337460kuO.setLayoutDirection(1);
    }

    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll
    public final void setLowerThreshole(int i) {
        if (i < 0) {
            i = 0;
        }
        this.LLILLJJLI = i;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void setLynxDirection(int i) {
        this.mLynxDirection = i;
        C1337460kuO c1337460kuO = null;
        if (i == 2) {
            C1337460kuO c1337460kuO2 = this.LLJIJIL;
            if (c1337460kuO2 != null) {
                c1337460kuO = c1337460kuO2;
            }
            c1337460kuO.setLayoutDirection(1);
            return;
        }
        C1337460kuO c1337460kuO3 = this.LLJIJIL;
        if (c1337460kuO3 != null) {
            c1337460kuO = c1337460kuO3;
        }
        c1337460kuO.setLayoutDirection(0);
    }

    @InterfaceC1312540kGC(defaultBoolean = false, name = "page-enable")
    public final void setPageEnable(boolean z) {
        this.LLJ = z;
    }

    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll
    public final void setScrollBarEnable(boolean z) {
        C1337460kuO c1337460kuO = null;
        if (((C1337450kuN) this.mView).getMScrollDirection() != EnumC1337520kuU.VERTICAL_BOTTOM && ((C1337450kuN) this.mView).getMScrollDirection() != EnumC1337520kuU.VERTICAL_TOP) {
            if (((C1337450kuN) this.mView).getMScrollDirection() == EnumC1337520kuU.HORIZONTAL_LEFT || ((C1337450kuN) this.mView).getMScrollDirection() == EnumC1337520kuU.HORIZONTAL_RIGHT) {
                C1337460kuO c1337460kuO2 = this.LLJIJIL;
                if (c1337460kuO2 != null) {
                    c1337460kuO = c1337460kuO2;
                }
                c1337460kuO.setHorizontalScrollBarEnabled(z);
                return;
            }
            return;
        }
        C1337460kuO c1337460kuO3 = this.LLJIJIL;
        if (c1337460kuO3 != null) {
            c1337460kuO = c1337460kuO3;
        }
        c1337460kuO.setVerticalScrollBarEnabled(z);
    }

    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll
    public final void setScrollLeft(int i) {
        this.LLJJI = 0;
        if (!LJJIJIL(i)) {
            this.LLJJI = i;
        }
    }

    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll
    public final void setScrollTop(int i) {
        this.LLJJI = 0;
        if (!LJJIJIL(i)) {
            this.LLJJI = i;
        }
    }

    @InterfaceC1312540kGC(defaultBoolean = false, name = "android-unified-notify-item-changed")
    public final void setUnifiedNotifyItemChanged(boolean z) {
        this.LLJJJJ = z;
        if (z) {
            C1337460kuO c1337460kuO = this.LLJIJIL;
            if (c1337460kuO == null) {
                c1337460kuO = null;
            }
            c1337460kuO.setItemAnimator(null);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll
    public final void setUpperThreshole(int i) {
        if (i < 0) {
            i = 0;
        }
        this.LLILLL = i;
    }

    public LynxScrollView(s sVar, Object obj) {
        super(sVar, obj);
        this.LL = "LynxScrollView";
        this.LLJJIJI = 1;
        this.LLJJIJIL = true;
        this.LLJJJJJIL = new ArrayList<>();
        this.LLJJJJLIIL = new HashSet<>();
        this.LLJJL = new HashSet<>();
    }

    public final boolean LJJIJIIJIL(int i, boolean z) {
        LinearLayoutManager linearLayoutManager;
        if (i < 0) {
            return false;
        }
        C1337460kuO c1337460kuO = this.LLJIJIL;
        C1337460kuO c1337460kuO2 = null;
        if (c1337460kuO == null) {
            c1337460kuO = null;
        }
        if (c1337460kuO.getAdapter() == null) {
            return false;
        }
        C1337460kuO c1337460kuO3 = this.LLJIJIL;
        if (c1337460kuO3 == null) {
            c1337460kuO3 = null;
        }
        if (c1337460kuO3.getAdapter().getItemCount() <= i) {
            return false;
        }
        if (z) {
            C1337460kuO c1337460kuO4 = this.LLJIJIL;
            if (c1337460kuO4 != null) {
                c1337460kuO2 = c1337460kuO4;
            }
            c1337460kuO2.smoothScrollToPosition(i);
            return true;
        }
        C1337460kuO c1337460kuO5 = this.LLJIJIL;
        if (c1337460kuO5 == null) {
            c1337460kuO5 = null;
        }
        RecyclerView.LayoutManager layoutManager = c1337460kuO5.getLayoutManager();
        if (!(layoutManager instanceof LinearLayoutManager) || (linearLayoutManager = (LinearLayoutManager) layoutManager) == null) {
            return true;
        }
        linearLayoutManager.scrollToPositionWithOffset(i, 0);
        return true;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void insertChild(LynxBaseUI lynxBaseUI, int i) {
        String str = this.LL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("insertChild ");
        sbLIZ.append(lynxBaseUI);
        sbLIZ.append(" at index = ");
        sbLIZ.append(i);
        sbLIZ.append(" withunifiedNotifyItemChanged = ");
        sbLIZ.append(this.LLJJJJ);
        LynxLog.d(str, C2188811AlT.LIZIZ(sbLIZ));
        if (lynxBaseUI instanceof LynxBounceView) {
            LynxBounceView lynxBounceView = (LynxBounceView) lynxBaseUI;
            String str2 = lynxBounceView.LL;
            switch (str2.hashCode()) {
                case -1383228885:
                    if (str2.equals("bottom")) {
                        ((C1337450kuN) this.mView).setMScrollDirection(EnumC1337520kuU.VERTICAL_BOTTOM);
                    }
                    break;
                case 115029:
                    if (str2.equals("top")) {
                        ((C1337450kuN) this.mView).setMScrollDirection(EnumC1337520kuU.VERTICAL_TOP);
                    }
                    break;
                case 3317767:
                    if (str2.equals("left")) {
                        ((C1337450kuN) this.mView).setMScrollDirection(EnumC1337520kuU.HORIZONTAL_LEFT);
                    }
                    break;
                case 108511772:
                    if (str2.equals("right")) {
                        ((C1337450kuN) this.mView).setMScrollDirection(EnumC1337520kuU.HORIZONTAL_RIGHT);
                    }
                    break;
            }
            this.LLJILJIL = lynxBounceView;
            ((C1337450kuN) this.mView).setMBounceView(lynxBounceView.mView);
        } else if (lynxBaseUI instanceof LynxUI) {
            ListProtector.add(this.mChildren, i, lynxBaseUI);
            if (this.LLJJJJ) {
                this.LLJJJJLIIL.add(Integer.valueOf(i));
            } else {
                C1337460kuO c1337460kuO = this.LLJIJIL;
                if (c1337460kuO == null) {
                    c1337460kuO = null;
                }
                AbstractC21673619ry adapter = c1337460kuO.getAdapter();
                if (adapter != null) {
                    adapter.notifyItemInserted(i);
                }
            }
        }
        lynxBaseUI.setParent(this);
    }

    @InterfaceC1967107nB
    public final void scrollToIndex(ReadableMap readableMap, Callback callback) {
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        try {
            if (LJJIJIIJIL(readableMap.getInt("index", 0), readableMap.getBoolean("smooth", false))) {
                callback.invoke(0, javaOnlyMap);
            } else {
                callback.invoke(1, javaOnlyMap);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            javaOnlyMap.put("error", th.getMessage());
            callback.invoke(4, javaOnlyMap);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0094  */
    @Override // com.lynx.tasm.behavior.ui.scroll.AbsLynxUIScroll
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIIZI(com.lynx.tasm.behavior.ui.LynxBaseUI r10, boolean r11, java.lang.String r12, java.lang.String r13) {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.xelement.LynxScrollView.LJJIIZI(com.lynx.tasm.behavior.ui.LynxBaseUI, boolean, java.lang.String, java.lang.String):void");
    }

    public final void LJJIJL(int i, int i2, int i3, int i4, String str) {
        C1298720jtu c1298720jtu;
        C1317510kOD c1317510kOD = new C1317510kOD(getSign(), str);
        c1317510kOD.LJ(i, i2, this.LLJJJIL, this.LLJJJ, i - i3, i2 - i4);
        s sVar = this.mContext;
        if (sVar != null && (c1298720jtu = sVar.LLIZ) != null) {
            c1298720jtu.LIZIZ(c1317510kOD);
        }
    }
}
