package com.lynx.tasm.behavior.ui.list;

import X.AbstractC1311530kEZ;
import X.C1289620jfE;
import X.C1289960jfm;
import X.C1292490jjr;
import X.C1299120juY;
import X.C1311130kDv;
import X.C1311420kEO;
import X.C1312920kGo;
import X.C1313030kGz;
import X.C1318020kP2;
import X.C1318040kP4;
import X.C1318100kPA;
import X.C1318540kPs;
import X.C1318570kPv;
import X.C1318680kQ6;
import X.C1318900kQS;
import X.C1319030kQf;
import X.C1319060kQi;
import X.C1319070kQj;
import X.C1319080kQk;
import X.C1319100kQm;
import X.C1319110kQn;
import X.C1319140kQq;
import X.C1319150kQr;
import X.C1339150kx7;
import X.C20635115or;
import X.C20635415ou;
import X.C2188811AlT;
import X.C423520Gj8;
import X.C786410Ut5;
import X.ChoreographerFrameCallbackC1339260kxI;
import X.EnumC665490Q8l;
import X.InterfaceC1298070jsr;
import X.InterfaceC1311410kEN;
import X.InterfaceC1312540kGC;
import X.InterfaceC1319180kQu;
import X.InterfaceC1319200kQw;
import X.InterfaceC1967107nB;
import X.RunnableC1319050kQh;
import X.ViewOnAttachStateChangeListenerC1319040kQg;
import Y.ARunnableS0S0200010_20;
import Y.ARunnableS119S0100000_19;
import Y.ARunnableS120S0100000_20;
import Y.ARunnableS7S0100002_20;
import Y.AsS47S0100000_20;
import android.content.Context;
import android.graphics.Rect;
import android.hardware.display.DisplayManager;
import android.text.TextUtils;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.lynx.base.log.LynxLog;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.LynxError;
import com.lynx.tasm.base.TraceEvent;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.list.ListLayoutManager;
import com.lynx.tasm.behavior.ui.view.UIComponent;
import com.lynx.tasm.featurecount.LynxFeatureCounter;
import j27.s;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
public class UIList extends AbsLynxList<RecyclerView> {
    public static final /* synthetic */ int LLLL = 0;
    public C1319030kQf LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public String LLIZ;
    public boolean LLIZLLLIL;
    public C1318040kP4 LLJ;
    public C1319070kQj LLJI;
    public boolean LLJIJIL;
    public boolean LLJILJIL;
    public C20635115or LLJILJILJ;
    public C20635415ou LLJILLL;
    public boolean LLJJ;
    public boolean LLJJI;
    public C1318100kPA LLJJIII;
    public ViewOnAttachStateChangeListenerC1319040kQg LLJJIJI;
    public C1319150kQr LLJJIJIIJIL;
    public int LLJJIJIL;
    public int LLJJJ;
    public boolean LLJJJIL;
    public boolean LLJJJJ;
    public boolean LLJJJJJIL;
    public final Map<String, Object> LLJJJJLIIL;
    public final Map<String, HashSet<String>> LLJJL;
    public ReadableMap LLJJLIIIJLLLLLLLZ;
    public final ArrayList<String> LLJL;
    public final HashMap<String, ArrayList<C1318900kQS>> LLJLIL;
    public ReadableMap LLJLILLLLZIIL;
    public boolean LLJLL;
    public boolean LLJLLIL;
    public boolean LLJLLL;
    public int LLJZ;
    public boolean LLJZIJLIL;
    public boolean LLL;
    public boolean LLLF;
    public boolean LLLFF;
    public boolean LLLFFI;
    public boolean LLLFZ;
    public boolean LLLI;
    public C1319060kQi LLLII;
    public int LLLIIII;
    public boolean LLLIIIIL;
    public C1319100kQm LLLIIIL;
    public int LLLIIL;
    public float LLLIILIL;
    public AsS47S0100000_20 LLLIL;
    public boolean LLLILZ;
    public boolean LLLILZJ;
    public boolean LLLILZLLLI;
    public boolean LLLIZZ;
    public ChoreographerFrameCallbackC1339260kxI LLLJ;
    public int LLLJIL;
    public boolean LLLJL;

    public UIList() {
        throw null;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final boolean isAccessibilityHostUI() {
        return true;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final boolean isScrollContainer() {
        return true;
    }

    @Override // com.lynx.tasm.behavior.ui.list.AbsLynxList, com.lynx.tasm.behavior.ui.UIGroup
    public final void onInsertChild(LynxBaseUI lynxBaseUI, int i) {
    }

    @Override // com.lynx.tasm.behavior.ui.list.AbsLynxList
    public final void setCacheQueueRatio(InterfaceC1298070jsr interfaceC1298070jsr) {
    }

    @Override // com.lynx.tasm.behavior.ui.list.AbsLynxList
    public final void setScrollStateChangeEventThrottle(String str) {
    }

    @Override // com.lynx.tasm.behavior.ui.list.AbsLynxList
    public final void setScrollX(InterfaceC1298070jsr interfaceC1298070jsr) {
    }

    @Override // com.lynx.tasm.behavior.ui.list.AbsLynxList
    public final void setScrollY(InterfaceC1298070jsr interfaceC1298070jsr) {
    }

    public final int LJJJ() {
        int i;
        T t = this.mView;
        if (t != 0) {
            RecyclerView.LayoutManager layoutManager = ((RecyclerView) t).getLayoutManager();
            if (layoutManager instanceof LinearLayoutManager) {
                return ((LinearLayoutManager) layoutManager).findFirstCompletelyVisibleItemPosition();
            }
            if (!(layoutManager instanceof StaggeredGridLayoutManager) || (i = this.LLILZ) <= 0) {
                return -1;
            }
            int[] iArr = new int[i];
            ((StaggeredGridLayoutManager) layoutManager).LJIILL(iArr);
            int iMin = iArr[0];
            for (int i2 = 1; i2 < this.LLILZ; i2++) {
                iMin = Math.min(iMin, iArr[i2]);
            }
            return iMin;
        }
        return -1;
    }

    public final int LJJJI() {
        int i;
        RecyclerView.LayoutManager layoutManager = ((RecyclerView) this.mView).getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            return ((LinearLayoutManager) layoutManager).findFirstVisibleItemPosition();
        }
        if (!(layoutManager instanceof StaggeredGridLayoutManager) || (i = this.LLILZ) <= 0) {
            return -1;
        }
        int[] iArr = new int[i];
        ((StaggeredGridLayoutManager) layoutManager).LJIJ(iArr);
        int iMin = iArr[0];
        for (int i2 = 1; i2 < this.LLILZ; i2++) {
            iMin = Math.min(iMin, iArr[i2]);
        }
        return iMin;
    }

    public final int LJJJIL() {
        T t = this.mView;
        int iMax = -1;
        if (t != 0) {
            RecyclerView.LayoutManager layoutManager = ((RecyclerView) t).getLayoutManager();
            if (layoutManager instanceof LinearLayoutManager) {
                return ((LinearLayoutManager) layoutManager).findLastCompletelyVisibleItemPosition();
            }
            if (layoutManager instanceof StaggeredGridLayoutManager) {
                int i = this.LLILZ;
                if (i <= 0) {
                    return -1;
                }
                int[] iArr = new int[i];
                ((StaggeredGridLayoutManager) layoutManager).LJIJI(iArr);
                for (int i2 = 0; i2 < this.LLILZ; i2++) {
                    iMax = Math.max(iMax, iArr[i2]);
                }
            }
        }
        return iMax;
    }

    public final int LJJJJ() {
        int i;
        RecyclerView.LayoutManager layoutManager = ((RecyclerView) this.mView).getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            return ((LinearLayoutManager) layoutManager).findLastVisibleItemPosition();
        }
        int iMax = -1;
        if (!(layoutManager instanceof StaggeredGridLayoutManager) || (i = this.LLILZ) <= 0) {
            return -1;
        }
        int[] iArr = new int[i];
        ((StaggeredGridLayoutManager) layoutManager).LJIJJ(iArr);
        for (int i2 = 0; i2 < this.LLILZ; i2++) {
            iMax = Math.max(iMax, iArr[i2]);
        }
        return iMax;
    }

    public final boolean LJJJJI() {
        s sVar = this.mContext;
        if (sVar == null || sVar.LJIILJJIL() == null) {
            return false;
        }
        EnumC665490Q8l threadStrategyForRendering = this.mContext.LJIILJJIL().getThreadStrategyForRendering();
        return threadStrategyForRendering == EnumC665490Q8l.MOST_ON_TASM || threadStrategyForRendering == EnumC665490Q8l.MULTI_THREADS;
    }

    public final boolean LJJJJIZL() {
        s sVar = this.mContext;
        return (sVar == null || sVar.LJIILJJIL() == null || this.mContext.LJIILJJIL().getThreadStrategyForRendering() != EnumC665490Q8l.PART_ON_LAYOUT) ? false : true;
    }

    public final void LJJJJJL() {
        if (this.LLLJ != null) {
            C786410Ut5.v2().removeFrameCallback(this.LLLJ);
            this.LLLJ = null;
        }
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public void destroy() {
        T t;
        AsS47S0100000_20 asS47S0100000_20 = this.LLLIL;
        if (asS47S0100000_20 != null) {
            ((RecyclerView) this.mView).removeOnScrollListener(asS47S0100000_20);
        }
        C1319060kQi c1319060kQi = this.LLLII;
        if (c1319060kQi != null) {
            c1319060kQi.LIZJ.clear();
            c1319060kQi.LIZLLL.clear();
            UIList uIList = c1319060kQi.LIZ;
            if (uIList != null && (t = uIList.mView) != 0) {
                ((RecyclerView) t).removeOnScrollListener(c1319060kQi.LJ);
            }
        }
        super.destroy();
        LJJJJJL();
        ((HashMap) this.LLJJJJLIIL).clear();
        C1319150kQr c1319150kQr = this.LLJJIJIIJIL;
        if (c1319150kQr != null) {
            c1319150kQr.dispose();
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final Rect getBoundRectForOverflow() {
        return !this.LLLJL ? super.getBoundRectForOverflow() : super.getClipBounds();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, X.InterfaceC1311590kEf
    public final int getMemberScrollX() {
        if (this.LLJJJJJIL) {
            return 0;
        }
        return this.LLJ.LLJILJIL;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, X.InterfaceC1311590kEf
    public final int getMemberScrollY() {
        if (this.LLJJJJJIL) {
            return this.LLJ.LLJILJIL;
        }
        return 0;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, X.InterfaceC1311590kEf
    public final int getScrollContainerDirection() {
        return this.LLJJJJJIL ? 1 : -1;
    }

    @InterfaceC1967107nB
    public void initCache() {
        C1319060kQi c1319060kQi = this.LLLII;
        if (c1319060kQi != null) {
            c1319060kQi.LIZJ.clear();
            c1319060kQi.LIZLLL.clear();
            this.LLLII.LIZJ();
        }
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void layout() {
        TraceEvent.LIZLLL("UIList.layout");
        ViewGroup viewGroup = this.LLJJIII;
        if (viewGroup == null) {
            viewGroup = (ViewGroup) this.mView;
        }
        if (!viewGroup.isLayoutRequested()) {
            TraceEvent.LJII("UIList.layout");
            return;
        }
        layoutChildren();
        C1318100kPA c1318100kPA = this.LLJJIII;
        if (c1318100kPA != null) {
            c1318100kPA.layout(getLeft(), getTop(), getLeft() + getWidth(), getTop() + getHeight());
        } else {
            ((ViewGroup) this.mView).layout(getLeft(), getTop(), getLeft() + getWidth(), getTop() + getHeight());
        }
        if (this.LLLJL) {
            ViewGroup viewGroup2 = this.LLJJIII;
            if (viewGroup2 == null) {
                viewGroup2 = (ViewGroup) this.mView;
            }
            ViewParent parent = viewGroup2.getParent();
            if (getOverflow() != 0) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).setClipChildren(false);
                }
                C1318100kPA c1318100kPA2 = this.LLJJIII;
                if (c1318100kPA2 != null) {
                    c1318100kPA2.setClipChildren(false);
                }
            }
            if (this.mOverflow != 0) {
                this.mView.setOverScrollMode(2);
            }
        }
        this.mView.setClipBounds(getBoundRectForOverflow());
        this.LLJJIJIIJIL.LIZIZ();
        TraceEvent.LJII("UIList.layout");
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup
    public final void layoutChildren() {
        if (this.LLL && this.LLJJIII != null) {
            UIComponent uIComponent = this.LLJJIJI.LLILZLL.LIZ;
            if (uIComponent != null) {
                uIComponent.performLayoutChildrenUI();
            }
            UIComponent uIComponent2 = this.LLJJIJI.LLIZ.LIZ;
            if (uIComponent2 != null) {
                uIComponent2.performLayoutChildrenUI();
            }
        }
        super.layoutChildren();
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void measure() {
        TraceEvent.LIZLLL("UIList.measure");
        ViewGroup viewGroup = this.LLJJIII;
        if (viewGroup == null) {
            viewGroup = (ViewGroup) this.mView;
        }
        if (!viewGroup.isLayoutRequested()) {
            TraceEvent.LJII("UIList.measure");
            return;
        }
        measureChildren();
        setLayoutParamsInternal();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getWidth(), 1073741824);
        int iMakeMeasureSpec2 = this.LLJIJIL ? View.MeasureSpec.makeMeasureSpec((int) this.mMaxHeight, Integer.MIN_VALUE) : View.MeasureSpec.makeMeasureSpec(getHeight(), 1073741824);
        C1318100kPA c1318100kPA = this.LLJJIII;
        if (c1318100kPA != null) {
            c1318100kPA.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        }
        this.mView.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        this.LLILLL.LLILZIL = true;
        TraceEvent.LJII("UIList.measure");
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void onPropsUpdated() {
        boolean z;
        C1318040kP4 c1318040kP4;
        RecyclerView.LayoutManager layoutManager;
        ReadableMap readableMap;
        UIList uIList;
        T t;
        s sVar;
        super.onPropsUpdated();
        if (this.LLJJI) {
            this.LLJJI = false;
            return;
        }
        if (((RecyclerView) this.mView).getAdapter() == null) {
            ((RecyclerView) this.mView).setAdapter(this.LLILLL);
        }
        if (LJJJJI() && (!this.LLJLL || !this.LLLFFI)) {
            if ((this.LLJJLIIIJLLLLLLLZ == null && this.LLJLILLLLZIIL == null) || (sVar = this.mContext) == null || sVar.LJIILJJIL() == null) {
                return;
            }
            this.mContext.LJIILLIIL(new LynxError(220207, "Multi thread strategy can not be used by default.", "Please set the attribute of enable-async-list to true at LynxSDK 2.10+ .", "error"));
            return;
        }
        if (this.LLJLL) {
            this.LLILLL.LLIZ = LJJJJI();
            int i = this.LLLJIL;
            if (i >= 0 && i < this.LLILLL.getItemCount()) {
                ((RecyclerView) this.mView).scrollToPosition(this.LLLJIL);
                this.LLLJIL = -1;
            }
            ReadableMap readableMap2 = this.LLJLILLLLZIIL;
            if (readableMap2 != null) {
                C1319030kQf c1319030kQf = this.LLILLL;
                c1319030kQf.LLILZ = true;
                ReadableArray array = readableMap2.getArray("updateAction");
                ReadableArray array2 = readableMap2.getArray("insertAction");
                ReadableArray array3 = readableMap2.getArray("removeAction");
                if (array == null && array2 == null && array3 == null) {
                    readableMap = null;
                } else {
                    if (c1319030kQf.LLJJIJIL == null) {
                        c1319030kQf.LLJJIJIL = new JavaOnlyArray();
                    }
                    if (c1319030kQf.LLIZLLLIL == null) {
                        c1319030kQf.LLIZLLLIL = new JavaOnlyArray();
                    }
                    if (c1319030kQf.LLJ == null) {
                        c1319030kQf.LLJ = new JavaOnlyArray();
                    }
                    if (c1319030kQf.LLJILLL == null) {
                        c1319030kQf.LLJILLL = new JavaOnlyArray();
                    }
                    if (c1319030kQf.LLJJ == null) {
                        c1319030kQf.LLJJ = new JavaOnlyArray();
                    }
                    if (c1319030kQf.LLJI == null) {
                        c1319030kQf.LLJI = new JavaOnlyArray();
                    }
                    if (c1319030kQf.LLJJI == null) {
                        c1319030kQf.LLJJI = new JavaOnlyArray();
                    }
                    if (c1319030kQf.LLJIJIL == null) {
                        c1319030kQf.LLJIJIL = new JavaOnlyArray();
                    }
                    if (c1319030kQf.LLJILJILJ == null) {
                        c1319030kQf.LLJILJILJ = new JavaOnlyArray();
                    }
                    C1319110kQn c1319110kQn = c1319030kQf.LLJJIII;
                    c1319110kQn.getClass();
                    if (array3 != null) {
                        for (int size = array3.size() - 1; size >= 0; size--) {
                            int i2 = array3.getInt(size);
                            if (i2 >= 0) {
                                c1319110kQn.LJI.LLJJIJIL.remove(i2);
                                c1319110kQn.LJI.LLIZLLLIL.remove(i2);
                                c1319110kQn.LJI.LLJILJILJ.remove(i2);
                                c1319110kQn.LJI.LLJILLL.remove(i2);
                                c1319110kQn.LJI.LLJJ.remove(i2);
                                c1319110kQn.LJI.LLJJI.remove(i2);
                            }
                        }
                    }
                    if (array2 != null) {
                        for (int i3 = 0; i3 < array2.size(); i3++) {
                            ReadableMap map = array2.getMap(i3);
                            if (map != null) {
                                int i4 = map.getInt("position");
                                String string = map.getString("item-key");
                                String string2 = map.getString("type");
                                boolean z2 = map.getBoolean("full-span", false);
                                boolean z3 = map.getBoolean("sticky-top", false);
                                boolean z4 = map.getBoolean("sticky-bottom", false);
                                int i5 = map.getInt("estimated-height-px", -1);
                                c1319110kQn.LJI.LLJJIJIL.add(i4, string);
                                c1319110kQn.LJI.LLIZLLLIL.add(i4, string2);
                                if (!c1319110kQn.LJI.LL.containsKey(string2)) {
                                    HashMap<String, Integer> map2 = c1319110kQn.LJI.LL;
                                    map2.put(string2, Integer.valueOf(map2.size()));
                                }
                                c1319110kQn.LJI.LLJILLL.add(i4, Boolean.valueOf(z2));
                                c1319110kQn.LJI.LLJJ.add(i4, Boolean.valueOf(z3));
                                c1319110kQn.LJI.LLJJI.add(i4, Boolean.valueOf(z4));
                                c1319110kQn.LJI.LLJILJILJ.add(i4, Integer.valueOf(i5));
                            }
                        }
                    }
                    if (array != null) {
                        for (int i6 = 0; i6 < array.size(); i6++) {
                            ReadableMap map3 = array.getMap(i6);
                            if (map3 != null) {
                                int i7 = map3.getInt("from");
                                map3.getInt("to");
                                String string3 = map3.getString("item-key");
                                String string4 = map3.getString("type");
                                boolean z5 = map3.getBoolean("full-span", false);
                                boolean z6 = map3.getBoolean("sticky-top", false);
                                boolean z7 = map3.getBoolean("sticky-bottom", false);
                                int i8 = map3.getInt("estimated-height-px", -1);
                                c1319110kQn.LJI.LLJJIJIL.set(i7, string3);
                                c1319110kQn.LJI.LLIZLLLIL.set(i7, string4);
                                if (!c1319110kQn.LJI.LL.containsKey(string4)) {
                                    HashMap<String, Integer> map4 = c1319110kQn.LJI.LL;
                                    map4.put(string4, Integer.valueOf(map4.size()));
                                }
                                c1319110kQn.LJI.LLJILLL.set(i7, Boolean.valueOf(z5));
                                c1319110kQn.LJI.LLJJ.set(i7, Boolean.valueOf(z6));
                                c1319110kQn.LJI.LLJJI.set(i7, Boolean.valueOf(z7));
                                c1319110kQn.LJI.LLJILJILJ.set(i7, Integer.valueOf(i8));
                            }
                        }
                    }
                    C1319110kQn c1319110kQn2 = c1319030kQf.LLJJIII;
                    c1319110kQn2.LJI.LLJ.clear();
                    for (int i9 = 0; i9 < c1319110kQn2.LJI.LLJILLL.size(); i9++) {
                        if (c1319110kQn2.LJI.LLJILLL.getBoolean(i9)) {
                            c1319110kQn2.LJI.LLJ.add(Integer.valueOf(i9));
                        }
                    }
                    c1319110kQn2.LJI.LLJI.clear();
                    for (int i10 = 0; i10 < c1319110kQn2.LJI.LLJJ.size(); i10++) {
                        if (c1319110kQn2.LJI.LLJJ.getBoolean(i10)) {
                            c1319110kQn2.LJI.LLJI.add(Integer.valueOf(i10));
                        }
                    }
                    c1319110kQn2.LJI.LLJIJIL.clear();
                    for (int i11 = 0; i11 < c1319110kQn2.LJI.LLJJI.size(); i11++) {
                        if (c1319110kQn2.LJI.LLJJI.getBoolean(i11)) {
                            c1319110kQn2.LJI.LLJIJIL.add(Integer.valueOf(i11));
                        }
                    }
                    if (!readableMap2.getBoolean("reloadAll", false)) {
                        C1319110kQn c1319110kQn3 = c1319030kQf.LLJJIII;
                        c1319110kQn3.getClass();
                        if (array3 != null) {
                            for (int size2 = array3.size() - 1; size2 >= 0; size2--) {
                                int i12 = array3.getInt(size2);
                                if (i12 >= 0) {
                                    c1319110kQn3.LJI.notifyItemRemoved(i12);
                                }
                            }
                        }
                        if (array2 != null) {
                            for (int i13 = 0; i13 < array2.size(); i13++) {
                                ReadableMap map5 = array2.getMap(i13);
                                if (map5 != null) {
                                    c1319110kQn3.LJI.notifyItemInserted(map5.getInt("position"));
                                }
                            }
                        }
                        if (array != null) {
                            for (int i14 = 0; i14 < array.size(); i14++) {
                                ReadableMap map6 = array.getMap(i14);
                                if (map6 != null) {
                                    int i15 = map6.getInt("from");
                                    int i16 = map6.getInt("to");
                                    if (map6.getBoolean("flush", false)) {
                                        c1319110kQn3.LJI.notifyItemChanged(i15, Integer.valueOf(i16));
                                    }
                                }
                            }
                        }
                    } else if (!c1319030kQf.LLILZ || (uIList = c1319030kQf.LLILLL) == null || (t = uIList.mView) == 0 || !((RecyclerView) t).isComputingLayout()) {
                        c1319030kQf.LLJJLIIIJLLLLLLLZ.run();
                    } else {
                        C1289620jfE.LIZJ(c1319030kQf.LLJJLIIIJLLLLLLLZ);
                    }
                    readableMap = null;
                }
                this.LLJLILLLLZIIL = readableMap;
            } else if (this.LLJJLIIIJLLLLLLLZ instanceof ReadableMap) {
                if (this.LLLIIII > 0 && LJJJJI()) {
                    if (this.LLLII == null) {
                        this.LLLII = new C1319060kQi(this, this.LLLIIII);
                    }
                    if (this.LLLIIII <= 0) {
                        C1319060kQi c1319060kQi = this.LLLII;
                        if (c1319060kQi != null) {
                            c1319060kQi.LIZJ.clear();
                            c1319060kQi.LIZLLL.clear();
                        }
                    } else if (this.LLLIL == null) {
                        AsS47S0100000_20 asS47S0100000_20 = new AsS47S0100000_20(this, 1);
                        this.LLLIL = asS47S0100000_20;
                        ((RecyclerView) this.mView).addOnScrollListener(asS47S0100000_20);
                    }
                }
                this.LLILLL.LLLLIIL((JavaOnlyMap) this.LLJJLIIIJLLLLLLLZ);
                this.LLJJLIIIJLLLLLLLZ = null;
            }
        } else {
            this.LLILLL.LLLLIIL(LJJIIZI());
        }
        if (this.LLIZLLLIL) {
            C1319030kQf c1319030kQf2 = this.LLILLL;
            c1319030kQf2.LLJL.clear();
            for (int i17 = 0; i17 < c1319030kQf2.LLILLL.LLILZ; i17++) {
                c1319030kQf2.LLJL.add(new HashMap<>());
            }
            new WeakReference(this);
            if (TextUtils.equals(this.LLIZ, "single")) {
                ListLayoutManager.ListLinearLayoutManager listLinearLayoutManager = new ListLayoutManager.ListLinearLayoutManager(this.mContext, this);
                listLinearLayoutManager.setOrientation(this.LLJJJJJIL ? 1 : 0);
                layoutManager = listLinearLayoutManager;
                if (!this.LLLF) {
                    listLinearLayoutManager.mInitialPrefetchItemCount = 0;
                    layoutManager = listLinearLayoutManager;
                }
            } else if (TextUtils.equals(this.LLIZ, "flow")) {
                ListLayoutManager.ListGridLayoutManager listGridLayoutManager = new ListLayoutManager.ListGridLayoutManager(this.mContext, this.LLILZ, this.LLLIIIIL ? 0 : this.LLILZLL, this);
                listGridLayoutManager.setOrientation(this.LLJJJJJIL ? 1 : 0);
                layoutManager = listGridLayoutManager;
                if (!this.LLLF) {
                    listGridLayoutManager.mInitialPrefetchItemCount = 0;
                    layoutManager = listGridLayoutManager;
                }
            } else if (TextUtils.equals(this.LLIZ, "waterfall")) {
                C1319080kQk c1319080kQk = new C1319080kQk(this.LLILZ, this.LLLIIIIL ? 0 : this.LLILZLL, this);
                c1319080kQk.setOrientation(this.LLJJJJJIL ? 1 : 0);
                layoutManager = c1319080kQk;
            } else {
                layoutManager = null;
            }
            if (this.LLJJIJI != null) {
                ViewOnAttachStateChangeListenerC1319040kQg viewOnAttachStateChangeListenerC1319040kQg = this.LLJJIJI;
                if (viewOnAttachStateChangeListenerC1319040kQg.LLILZLL.LIZIZ != -1) {
                    viewOnAttachStateChangeListenerC1319040kQg.LJJIJIIJIL(viewOnAttachStateChangeListenerC1319040kQg.LLILZLL);
                }
                if (viewOnAttachStateChangeListenerC1319040kQg.LLIZ.LIZIZ != -1) {
                    viewOnAttachStateChangeListenerC1319040kQg.LJJIJIIJIL(viewOnAttachStateChangeListenerC1319040kQg.LLIZ);
                }
            }
            if (this.LLLF || layoutManager == null) {
                z = false;
            } else {
                z = false;
                layoutManager.setItemPrefetchEnabled(false);
            }
            if (this.LLLII != null) {
                ((RecyclerView) this.mView).setItemViewCacheSize(z ? 1 : 0);
            }
            ((RecyclerView) this.mView).setLayoutManager(layoutManager);
        } else {
            z = false;
        }
        this.LLIZLLLIL = z;
        if (((RecyclerView) this.mView).getLayoutManager() instanceof ListLayoutManager.ListLinearLayoutManager) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) ((RecyclerView) this.mView).getLayoutManager();
            boolean z8 = linearLayoutManager.mStackFromEnd;
            boolean z9 = this.LLLILZLLLI;
            if (z8 != z9) {
                linearLayoutManager.setStackFromEnd(z9);
            }
        }
        if (((RecyclerView) this.mView).getLayoutManager() instanceof GridLayoutManager) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) ((RecyclerView) this.mView).getLayoutManager();
            gridLayoutManager.LJIJI(new C1339150kx7(this, gridLayoutManager, 1));
        }
        this.mView.setLayoutDirection((this.LLLFZ && isRtl()) ? 1 : 0);
        JavaOnlyArray javaOnlyArray = this.LLILLL.LLIZLLLIL;
        int size3 = javaOnlyArray == null ? 0 : javaOnlyArray.size();
        int i18 = this.LLJJIJIL;
        if (size3 > i18 && i18 > -1) {
            this.LLJI.LIZ(i18, 0, null);
            this.LLJJIJIL = -1;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPropsUpdated viewNames ");
        sbLIZ.append(size3);
        LynxLog.i("UIList", C2188811AlT.LIZIZ(sbLIZ));
        if ((this.LLJ.LLILLL & 16) != 0) {
            this.LLJILJIL = !this.LLLIZZ || this.mView.isLayoutRequested();
        }
        ViewOnAttachStateChangeListenerC1319040kQg viewOnAttachStateChangeListenerC1319040kQg2 = this.LLJJIJI;
        if (viewOnAttachStateChangeListenerC1319040kQg2 != null) {
            viewOnAttachStateChangeListenerC1319040kQg2.LJJIL(viewOnAttachStateChangeListenerC1319040kQg2.LLIZ);
            viewOnAttachStateChangeListenerC1319040kQg2.LJJIL(viewOnAttachStateChangeListenerC1319040kQg2.LLILZLL);
            this.LLJJIJI.LLIZLLLIL = this.LLJJJIL;
        }
        this.LLJI.LIZIZ.LLJI = this.LLJJJJJIL;
        if (this.LLJLLIL && (c1318040kP4 = this.LLJ) != null) {
            c1318040kP4.LLJILJILJ = 0;
        }
        T t2 = this.mView;
        if (t2 == 0 || ((RecyclerView) t2).getLayoutManager() == null) {
            LynxLog.e("UIList", "Fail to update gap item decoration because mView == null or LayoutManager == null");
            return;
        }
        if (!this.LLLIIIIL) {
            C1319100kQm c1319100kQm = this.LLLIIIL;
            if (c1319100kQm != null) {
                ((RecyclerView) this.mView).removeItemDecoration(c1319100kQm);
                return;
            }
            return;
        }
        if (this.LLLIIIL == null) {
            C1319100kQm c1319100kQm2 = new C1319100kQm();
            this.LLLIIIL = c1319100kQm2;
            ((RecyclerView) this.mView).addItemDecoration(c1319100kQm2);
        }
        C1319100kQm c1319100kQm3 = this.LLLIIIL;
        c1319100kQm3.LL = this.LLJJJJJIL;
        c1319100kQm3.LLILLJJLI = this.LLLFZ && isRtl();
        C1319100kQm c1319100kQm4 = this.LLLIIIL;
        c1319100kQm4.LLILLL = this.LLILZ;
        c1319100kQm4.LLILZ = this.LLILZIL;
        c1319100kQm4.LLILZIL = this.LLILZLL;
        ((RecyclerView) this.mView).invalidateItemDecorations();
    }

    @InterfaceC1967107nB
    public void removeStickyView() {
        if (this.LLJJIJI != null) {
            ViewOnAttachStateChangeListenerC1319040kQg viewOnAttachStateChangeListenerC1319040kQg = this.LLJJIJI;
            viewOnAttachStateChangeListenerC1319040kQg.LJJIZ(viewOnAttachStateChangeListenerC1319040kQg.LLILZLL, true, true);
            viewOnAttachStateChangeListenerC1319040kQg.LJJIZ(viewOnAttachStateChangeListenerC1319040kQg.LLIZ, false, true);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI, X.InterfaceC1313090kH5
    public final void requestLayout() {
        ((RecyclerView) this.mView).requestLayout();
        if (this.mView.isLayoutRequested()) {
            return;
        }
        T t = this.mView;
        HandlerHook.viewPost(t, new ARunnableS119S0100000_19(t, 15));
    }

    public final void LJJJJJ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLayoutCompleted ");
        sbLIZ.append(this.LLILLL.LLIZLLLIL.size());
        LynxLog.i("UIList", C2188811AlT.LIZIZ(sbLIZ));
        if (!this.LLJILJIL || ((ViewGroup) this.mView).getChildCount() <= 0) {
            return;
        }
        C1318040kP4 c1318040kP4 = this.LLJ;
        JavaOnlyArray javaOnlyArray = this.LLILLL.LLIZLLLIL;
        if ((c1318040kP4.LLILLL & 16) != 0) {
            C1289960jfm c1289960jfm = new C1289960jfm(c1318040kP4.LLJI.getSign(), "layoutcomplete");
            c1289960jfm.LIZIZ(Long.valueOf(new Date().getTime()), "timestamp");
            c1289960jfm.LIZIZ(javaOnlyArray, "cells");
            c1318040kP4.LL.LIZIZ(c1289960jfm);
        }
        this.LLJILJIL = false;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, X.InterfaceC1311590kEf
    public final Map<Integer, AbstractC1311530kEZ> getGestureHandlers() {
        return super.getGestureHandlers();
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
        int i = this.mPaddingTop + this.mBorderTopWidth;
        int i2 = this.mPaddingBottom + this.mBorderBottomWidth;
        int i3 = this.mPaddingLeft + this.mBorderLeftWidth;
        int i4 = this.mPaddingRight + this.mBorderRightWidth;
        if (1 == this.mView.getLayoutDirection()) {
            this.mView.setPadding(i4, i, i3, i2);
        } else {
            this.mView.setPadding(i3, i, i4, i2);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final boolean isAccessibilityDirectionVertical() {
        return this.LLJJJJJIL;
    }

    public final boolean LJJIJL(int i) {
        if (this.LLJJJJJIL) {
            return this.mView.canScrollVertically(i);
        }
        return this.mView.canScrollHorizontally(i);
    }

    public RecyclerView LJJIJLIJ(Context context) {
        return new C1318680kQ6(context, this);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    /* JADX INFO: renamed from: LJJIZ, reason: merged with bridge method [inline-methods] */
    public RecyclerView createView(Context context) {
        RecyclerView recyclerViewLJJIJLIJ = LJJIJLIJ(context);
        recyclerViewLJJIJLIJ.setClipToPadding(false);
        recyclerViewLJJIJLIJ.setRecycledViewPool(new RecyclerView.RecycledViewPool() { // from class: X.0kQl
            /* JADX WARN: Removed duplicated region for block: B:42:0x00a2  */
            @Override // androidx.recyclerview.widget.RecyclerView.RecycledViewPool
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void putRecycledView(androidx.recyclerview.widget.RecyclerView.ViewHolder r10) {
                /*
                    r9 = this;
                    com.lynx.tasm.behavior.ui.list.UIList r0 = r9.LIZ
                    boolean r0 = r0.LJJJJI()
                    if (r0 == 0) goto L82
                    boolean r0 = r10 instanceof X.C1318570kPv
                    if (r0 == 0) goto L82
                    r2 = r10
                    X.0kPv r2 = (X.C1318570kPv) r2
                    X.0kPs r0 = r2.LL
                    com.lynx.tasm.behavior.ui.view.UIComponent r0 = r0.LLILLJJLI
                    if (r0 == 0) goto L82
                    com.lynx.tasm.behavior.ui.list.UIList r3 = r9.LIZ
                    X.0kQi r1 = r3.LLLII
                    if (r1 == 0) goto Lae
                    int r0 = r3.LLLIIII
                    if (r0 <= 0) goto Lae
                    com.lynx.tasm.behavior.ui.list.UIList r3 = r1.LIZ
                    if (r3 == 0) goto L82
                    X.0kQf r4 = r3.LLILLL
                    if (r4 == 0) goto L82
                    java.util.HashMap<java.lang.String, java.lang.Integer> r0 = r4.LLJJJ
                    if (r0 == 0) goto L82
                    int r0 = r1.LIZIZ
                    if (r0 <= 0) goto L82
                    int r8 = r3.LJJJI()
                    com.lynx.tasm.behavior.ui.list.UIList r0 = r1.LIZ
                    int r7 = r0.LJJJJ()
                    X.0kPs r0 = r2.LL
                    com.lynx.tasm.behavior.ui.view.UIComponent r0 = r0.LLILLJJLI
                    if (r0 == 0) goto L82
                    java.util.HashMap<java.lang.String, java.lang.Integer> r3 = r4.LLJJJ
                    java.lang.String r0 = r0.LLILLJJLI
                    boolean r0 = r3.containsKey(r0)
                    if (r0 == 0) goto La2
                    java.util.HashMap<java.lang.String, java.lang.Integer> r3 = r4.LLJJJ
                    X.0kPs r0 = r2.LL
                    com.lynx.tasm.behavior.ui.view.UIComponent r0 = r0.LLILLJJLI
                    java.lang.String r0 = r0.LLILLJJLI
                    java.lang.Object r0 = r3.get(r0)
                    java.lang.Integer r0 = (java.lang.Integer) r0
                    int r6 = r0.intValue()
                    int r3 = r1.LIZIZ
                    int r0 = r8 - r3
                    int r3 = r3 + r7
                    r5 = 1
                    r4 = 0
                    if (r6 < r0) goto La2
                    if (r6 > r3) goto La2
                    r3 = -1
                    if (r8 == r3) goto L86
                    int r0 = r2.getLayoutPosition()
                    if (r0 > r8) goto L86
                    X.0kPs r0 = r2.LL
                    com.lynx.tasm.behavior.ui.view.UIComponent r0 = r0.LLILLJJLI
                    java.lang.String r0 = r0.LLILLJJLI
                    boolean r0 = r1.LIZIZ(r0)
                    if (r0 != 0) goto L82
                    X.0kPs r0 = r2.LL
                    com.lynx.tasm.behavior.ui.view.UIComponent r0 = r0.LLILLJJLI
                    r1.LIZ(r0, r5)
                L82:
                    super.putRecycledView(r10)
                    return
                L86:
                    if (r7 == r3) goto L82
                    int r0 = r2.getLayoutPosition()
                    if (r0 < r7) goto L82
                    X.0kPs r0 = r2.LL
                    com.lynx.tasm.behavior.ui.view.UIComponent r0 = r0.LLILLJJLI
                    java.lang.String r0 = r0.LLILLJJLI
                    boolean r0 = r1.LIZIZ(r0)
                    if (r0 != 0) goto L82
                    X.0kPs r0 = r2.LL
                    com.lynx.tasm.behavior.ui.view.UIComponent r0 = r0.LLILLJJLI
                    r1.LIZ(r0, r4)
                    goto L82
                La2:
                    com.lynx.tasm.behavior.ui.list.UIList r0 = r1.LIZ
                    X.0kQf r1 = r0.LLILLL
                    X.0kPs r0 = r2.LL
                    com.lynx.tasm.behavior.ui.view.UIComponent r0 = r0.LLILLJJLI
                    r1.LLLL(r0)
                    goto L82
                Lae:
                    X.0kQf r0 = r3.LLILLL
                    r0.LLLJL(r2)
                    goto L82
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1319090kQl.putRecycledView(androidx.recyclerview.widget.RecyclerView$ViewHolder):void");
            }
        });
        this.LLJ = new C1318040kP4(this.mContext.LLIZ, recyclerViewLJJIJLIJ, this);
        this.LLJJIJIIJIL = new C1319150kQr(this.mContext.LLIZ, recyclerViewLJJIJLIJ);
        recyclerViewLJJIJLIJ.setItemAnimator(null);
        this.LLILLL = new C1319030kQf(this, this.LLJJIJIIJIL);
        this.LLJI = new C1319070kQj(context, recyclerViewLJJIJLIJ);
        recyclerViewLJJIJLIJ.setOverScrollMode(2);
        if (LJJJJI()) {
            LynxFeatureCounter.LIZ(86, this.mContext.LLJLILLLLZIIL);
        }
        return recyclerViewLJJIJLIJ;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void consumeGesture(boolean z) {
        T t = this.mView;
        if (t instanceof C1318680kQ6) {
            C1318680kQ6 c1318680kQ6 = (C1318680kQ6) t;
            c1318680kQ6.LLIZ = Boolean.valueOf(z);
            if (z) {
                c1318680kQ6.LLJ = false;
            }
        }
    }

    @InterfaceC1312540kGC(defaultBoolean = true, name = "enable-nested-scroll")
    public void enableNestedScroll(boolean z) {
        T t = this.mView;
        if (t == 0) {
            return;
        }
        ((RecyclerView) t).setNestedScrollingEnabled(z);
    }

    @InterfaceC1312540kGC(defaultBoolean = false, name = "enable-rtl")
    public void enableRtl(boolean z) {
        this.LLLFZ = z;
    }

    @InterfaceC1967107nB
    public void getScrollInfo(Callback callback) {
        int memberScrollX = getMemberScrollX();
        int memberScrollY = getMemberScrollY();
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        javaOnlyMap.putInt("scrollX", C1292490jjr.LJI(memberScrollX, this.mContext));
        javaOnlyMap.putInt("scrollY", C1292490jjr.LJI(memberScrollY, this.mContext));
        callback.invoke(0, javaOnlyMap);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final Object getValueFromNativeStorage(String str) {
        Map<String, Object> map = this.LLJJJJLIIL;
        if (map != null) {
            return ((HashMap) map).get(str);
        }
        return null;
    }

    @InterfaceC1967107nB
    public void getVisibleCells(Callback callback) {
        if (callback == null) {
            LynxLog.i("UIList", "getVisibleCells with null callback");
        } else {
            callback.invoke(0, this.LLJ.LJJIZ());
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void interceptGesture(boolean z) {
        T t = this.mView;
        if (t instanceof C1318680kQ6) {
            ((C1318680kQ6) t).LLIZLLLIL = Boolean.valueOf(z);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, X.InterfaceC1311590kEf
    public final boolean isAtBorder(boolean z) {
        if (!isEnableNewGesture()) {
            return false;
        }
        if (z) {
            return !LJJIJL(-1);
        }
        return !LJJIJL(1);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void removeKeyFromNativeStorage(String str) {
        Map<String, Object> map = this.LLJJJJLIIL;
        if (map != null) {
            ((HashMap) map).remove(str);
        }
    }

    @InterfaceC1312540kGC(defaultBoolean = false, name = "android-ignore-attach-for-binding")
    public void setAndroidIgnoreAttachForBinding(boolean z) {
        this.LLLFF = z;
    }

    @InterfaceC1312540kGC(customType = "false", name = "auto-measure")
    public void setAutoMeasure(InterfaceC1298070jsr interfaceC1298070jsr) {
        this.LLJIJIL = C1318040kP4.LJJIJIIJIL(interfaceC1298070jsr, false);
    }

    @Override // com.lynx.tasm.behavior.ui.list.AbsLynxList
    public final void setColumnCount(int i) {
        if (this.LLILZ == i) {
            return;
        }
        this.LLILZ = i;
        RecyclerView.LayoutManager layoutManager = ((RecyclerView) this.mView).getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            ((GridLayoutManager) layoutManager).LJIJ(this.LLILZ);
        } else {
            if (!(layoutManager instanceof StaggeredGridLayoutManager)) {
                return;
            }
            ((StaggeredGridLayoutManager) layoutManager).LJJJ(this.LLILZ);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.list.AbsLynxList
    public final void setComponentInitMeasure(boolean z) {
        C1319030kQf c1319030kQf = this.LLILLL;
        if (c1319030kQf != null) {
            c1319030kQf.LLILZLL = z;
        }
    }

    @Override // com.lynx.tasm.behavior.ui.list.AbsLynxList
    public final void setCrossAxisGap(float f) {
        this.LLILZLL = Math.round(f);
        RecyclerView.LayoutManager layoutManager = ((RecyclerView) this.mView).getLayoutManager();
        int i = 0;
        if (layoutManager instanceof ListLayoutManager.ListGridLayoutManager) {
            ListLayoutManager.ListGridLayoutManager listGridLayoutManager = (ListLayoutManager.ListGridLayoutManager) layoutManager;
            if (!this.LLLIIIIL) {
                i = this.LLILZLL;
            }
            listGridLayoutManager.LLJI = i;
            return;
        }
        if (!(layoutManager instanceof C1319080kQk)) {
            return;
        }
        C1319080kQk c1319080kQk = (C1319080kQk) layoutManager;
        if (!this.LLLIIIIL) {
            i = this.LLILZLL;
        }
        c1319080kQk.LLJJL = i;
    }

    @InterfaceC1312540kGC(customType = "true", name = "android-diffable")
    public void setDiffable(InterfaceC1298070jsr interfaceC1298070jsr) {
        if (((RecyclerView) this.mView).getAdapter() == null) {
            this.LLILLL.setHasStableIds(!C1318040kP4.LJJIJIIJIL(interfaceC1298070jsr, true));
        }
    }

    @InterfaceC1312540kGC(defaultBoolean = false, name = "enable-async-list")
    public void setEnableAsyncList(boolean z) {
        this.LLLFFI = z;
    }

    @InterfaceC1312540kGC(defaultBoolean = false, name = "enable-disappear")
    public void setEnableDisappear(boolean z) {
        InterfaceC1319180kQu interfaceC1319180kQu = this.LLJJIJIIJIL.LIZJ;
        if (interfaceC1319180kQu instanceof C1319140kQq) {
            ((C1319140kQq) interfaceC1319180kQu).LJFF = z;
        }
    }

    @InterfaceC1312540kGC(defaultBoolean = true, name = "android-enable-focus-search")
    public void setEnableFocusSearch(boolean z) {
        this.LLLILZJ = z;
    }

    @InterfaceC1312540kGC(defaultBoolean = false, name = "android-enable-gap-item-decoration")
    public void setEnableGapItemDecoration(boolean z) {
        this.LLLIIIIL = z;
    }

    @InterfaceC1312540kGC(defaultBoolean = true, name = "android-enable-item-prefetch")
    public void setEnableItemPrefetch(boolean z) {
        this.LLLF = z;
    }

    @InterfaceC1312540kGC(defaultBoolean = false, name = "android-enable-overflow")
    public void setEnableOverflow(boolean z) {
        this.LLLJL = z;
        T t = this.mView;
        if (t instanceof C1318680kQ6) {
            ((C1318680kQ6) t).LLILZIL = z;
        }
    }

    @Override // com.lynx.tasm.behavior.ui.list.AbsLynxList
    public final void setEnablePagerSnap(InterfaceC1298070jsr interfaceC1298070jsr) {
        if (C1318040kP4.LJJIJIIJIL(interfaceC1298070jsr, false) && this.LLJILLL == null) {
            if (this.LLJILJILJ == null) {
                this.LLJILJILJ = new C20635115or();
            }
            this.LLJILJILJ.LIZIZ((RecyclerView) this.mView);
        } else {
            C20635115or c20635115or = this.LLJILJILJ;
            if (c20635115or == null) {
                return;
            }
            c20635115or.LIZIZ(null);
            this.LLJILJILJ = null;
        }
    }

    @InterfaceC1312540kGC(defaultBoolean = false, name = "enable-size-cache")
    public void setEnableSizeCache(boolean z) {
        this.LLLI = z;
    }

    @Override // com.lynx.tasm.behavior.ui.list.AbsLynxList
    public final void setEnableSticky(InterfaceC1298070jsr interfaceC1298070jsr) {
        if (C1318040kP4.LJJIJIIJIL(interfaceC1298070jsr, false) && this.LLJJIII == null) {
            ViewOnAttachStateChangeListenerC1319040kQg viewOnAttachStateChangeListenerC1319040kQg = new ViewOnAttachStateChangeListenerC1319040kQg(this);
            this.LLJJIJI = viewOnAttachStateChangeListenerC1319040kQg;
            this.LLJJIII = viewOnAttachStateChangeListenerC1319040kQg.LLILLJJLI;
            viewOnAttachStateChangeListenerC1319040kQg.LLILZ = this.LLJJJ;
        }
    }

    @InterfaceC1312540kGC(defaultBoolean = false, name = "android-enable-strict-scrollable")
    public void setEnableStrictScrollable(boolean z) {
        this.LLLILZ = z;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void setEvents(Map<String, C1299120juY> map) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        super.setEvents(map);
        C1318040kP4 c1318040kP4 = this.LLJ;
        c1318040kP4.LLILLL = 0;
        if (map != null) {
            if (map.containsKey("scroll")) {
                i = c1318040kP4.LLILLL | 1;
            } else {
                i = c1318040kP4.LLILLL;
            }
            c1318040kP4.LLILLL = i;
            if (map.containsKey("scrolltoupper")) {
                i2 = c1318040kP4.LLILLL | 2;
            } else {
                i2 = c1318040kP4.LLILLL;
            }
            c1318040kP4.LLILLL = i2;
            if (map.containsKey("scrolltolower")) {
                i3 = c1318040kP4.LLILLL | 4;
            } else {
                i3 = c1318040kP4.LLILLL;
            }
            c1318040kP4.LLILLL = i3;
            if (map.containsKey("scrollstatechange")) {
                i4 = c1318040kP4.LLILLL | 8;
            } else {
                i4 = c1318040kP4.LLILLL;
            }
            c1318040kP4.LLILLL = i4;
            if (map.containsKey("layoutcomplete")) {
                i5 = c1318040kP4.LLILLL | 16;
            } else {
                i5 = c1318040kP4.LLILLL;
            }
            c1318040kP4.LLILLL = i5;
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void setGestureDetectors(Map<Integer, C1311420kEO> map) {
        super.setGestureDetectors(map);
    }

    @Override // com.lynx.tasm.behavior.ui.list.AbsLynxList
    public final void setInitialScrollIndex(InterfaceC1298070jsr interfaceC1298070jsr) {
        this.LLJJIJIL = C1318040kP4.LJJIL(interfaceC1298070jsr, -1);
    }

    @Override // com.lynx.tasm.behavior.ui.list.AbsLynxList
    public final void setInternalCellAppearNotification(boolean z) {
        super.setInternalCellAppearNotification(z);
        C1319030kQf c1319030kQf = this.LLILLL;
        if (c1319030kQf != null) {
            c1319030kQf.LLJJJIL = z;
        }
    }

    @Override // com.lynx.tasm.behavior.ui.list.AbsLynxList
    public final void setInternalCellDisappearNotification(boolean z) {
        super.setInternalCellDisappearNotification(z);
        C1319030kQf c1319030kQf = this.LLILLL;
        if (c1319030kQf != null) {
            c1319030kQf.LLJJJJ = z;
        }
    }

    @Override // com.lynx.tasm.behavior.ui.list.AbsLynxList
    public final void setInternalCellPrepareForReuseNotification(boolean z) {
        super.setInternalCellPrepareForReuseNotification(z);
        C1319030kQf c1319030kQf = this.LLILLL;
        if (c1319030kQf != null) {
            c1319030kQf.LLJJJJJIL = z;
        }
    }

    @InterfaceC1312540kGC(defaultInt = 0, name = "item-holder-type")
    public void setItemHolderType(InterfaceC1298070jsr interfaceC1298070jsr) {
        this.LLLIIL = C1318040kP4.LJJIL(interfaceC1298070jsr, 0);
    }

    @InterfaceC1312540kGC(defaultBoolean = false, name = "android-new-scroll-top")
    public void setListNewScrollTopSwitch(boolean z) {
        this.LLJJJJ = z;
    }

    @InterfaceC1312540kGC(defaultBoolean = true, name = "use-old-sticky")
    public void setListOldStickySwitch(boolean z) {
        this.LLJJJIL = z;
    }

    @InterfaceC1312540kGC(name = "list-platform-info")
    public void setListPlatformInfo(ReadableMap readableMap) {
        this.LLJLL = true;
        this.LLJJLIIIJLLLLLLLZ = readableMap;
        this.LLJLILLLLZIIL = null;
        this.LLLIZZ = false;
    }

    @Override // com.lynx.tasm.behavior.ui.list.AbsLynxList
    public final void setListType(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "single";
        }
        if (!TextUtils.equals(str, this.LLIZ)) {
            this.LLIZLLLIL = true;
            this.LLIZ = str;
        }
    }

    @Override // com.lynx.tasm.behavior.ui.list.AbsLynxList
    public final void setLowerThreshold(InterfaceC1298070jsr interfaceC1298070jsr) {
        C1318040kP4 c1318040kP4 = this.LLJ;
        c1318040kP4.getClass();
        c1318040kP4.LLILZLL = C1318040kP4.LJJIL(interfaceC1298070jsr, 50);
        c1318040kP4.LLIZLLLIL = 0;
    }

    @Override // com.lynx.tasm.behavior.ui.list.AbsLynxList
    public final void setLowerThresholdItemCount(InterfaceC1298070jsr interfaceC1298070jsr) {
        C1318040kP4 c1318040kP4 = this.LLJ;
        c1318040kP4.getClass();
        c1318040kP4.LLIZLLLIL = C1318040kP4.LJJIL(interfaceC1298070jsr, 0);
        c1318040kP4.LLILZLL = 0;
    }

    @Override // com.lynx.tasm.behavior.ui.list.AbsLynxList
    public final void setMainAxisGap(float f) {
        this.LLILZIL = Math.round(f);
    }

    @InterfaceC1312540kGC(defaultDouble = 1.0d, name = "max-fling-velocity-percent")
    public void setMaxFlingVelocityPercent(float f) {
        this.LLLIILIL = f;
    }

    @Override // com.lynx.tasm.behavior.ui.list.AbsLynxList
    public final void setNeedVisibleCells(boolean z) {
        this.LLJ.LLJILLL = z;
    }

    @InterfaceC1312540kGC(defaultBoolean = false, name = "enable-new-exposure-strategy")
    public void setNewAppear(boolean z) {
        C1319150kQr c1319150kQr = this.LLJJIJIIJIL;
        if (z != c1319150kQr.LIZLLL) {
            InterfaceC1319180kQu interfaceC1319180kQu = c1319150kQr.LIZJ;
            if (interfaceC1319180kQu != null) {
                interfaceC1319180kQu.dispose();
            }
            c1319150kQr.LIZLLL = z;
            if (z) {
                c1319150kQr.LIZJ = new C1318020kP2(c1319150kQr.LIZ, c1319150kQr.LIZIZ);
            } else {
                c1319150kQr.LIZJ = new C1319140kQq(c1319150kQr.LIZ);
            }
        }
    }

    @Override // com.lynx.tasm.behavior.ui.list.AbsLynxList
    public final void setNoInvalidate(boolean z) {
        this.LLJJI = z;
    }

    @Override // com.lynx.tasm.behavior.ui.list.AbsLynxList
    public final void setPagingAlignment(ReadableMap readableMap) {
        if ((readableMap instanceof JavaOnlyMap) && ((JavaOnlyMap) readableMap).size() != 0) {
            double d = readableMap.getDouble("factor");
            if (d < 0.0d || d > 1.0d) {
                this.mContext.LJIILLIIL(new LynxError(220205, "item-snap invalid!", "The factor should be constrained to the range of [0,1].", "warn"));
                d = 0.0d;
            }
            int i = readableMap.getInt("offset", 0);
            if (this.LLJILLL == null) {
                C20635415ou c20635415ou = new C20635415ou();
                this.LLJILLL = c20635415ou;
                c20635415ou.LIZIZ((RecyclerView) this.mView);
                this.LLJILLL.LJFF = new C1313030kGz(this);
            }
            C20635415ou c20635415ou2 = this.LLJILLL;
            c20635415ou2.LJII = d;
            c20635415ou2.LJIIIIZZ = i;
            return;
        }
        C20635415ou c20635415ou3 = this.LLJILLL;
        if (c20635415ou3 != null) {
            c20635415ou3.LIZIZ(null);
            this.LLJILLL = null;
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, X.InterfaceC1311410kEN
    public final void setPanInterceptAncestors(boolean z) {
        T t = this.mView;
        if (t instanceof C1318680kQ6) {
            t.getClass();
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, X.InterfaceC1311410kEN
    public final void setPanInterceptDescendants(boolean z) {
        T t = this.mView;
        if (t instanceof C1318680kQ6) {
            ((C1318680kQ6) t).LLJIJIL = z;
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, X.InterfaceC1311410kEN
    public final void setPanInterceptSelf(boolean z) {
        T t = this.mView;
        if (t instanceof C1318680kQ6) {
            ((C1318680kQ6) t).LLJI = z;
        }
    }

    @InterfaceC1312540kGC(defaultBoolean = false, name = "android-preference-consume-gesture")
    public void setPreferenceConsumeGesture(boolean z) {
        T t = this.mView;
        if (t instanceof C1318680kQ6) {
            ((C1318680kQ6) t).LLILZ = z;
        }
    }

    @InterfaceC1312540kGC(defaultInt = 0, name = "preload-buffer-count")
    public void setPreloadBufferCount(InterfaceC1298070jsr interfaceC1298070jsr) {
        this.LLLIIII = C1318040kP4.LJJIL(interfaceC1298070jsr, 0);
    }

    @Override // com.lynx.tasm.behavior.ui.list.AbsLynxList
    public final void setScrollEnable(InterfaceC1298070jsr interfaceC1298070jsr) {
        this.LLJJ = C1318040kP4.LJJIJIIJIL(interfaceC1298070jsr, true);
    }

    @Override // com.lynx.tasm.behavior.ui.list.AbsLynxList
    public final void setScrollEventThrottle(InterfaceC1298070jsr interfaceC1298070jsr) {
        C1318040kP4 c1318040kP4 = this.LLJ;
        c1318040kP4.getClass();
        c1318040kP4.LLILZ = C1318040kP4.LJJIL(interfaceC1298070jsr, 200);
    }

    @InterfaceC1312540kGC(defaultInt = -1, name = "scroll-index")
    public void setScrollIndex(int i) {
        this.LLLJIL = i;
    }

    @Override // com.lynx.tasm.behavior.ui.list.AbsLynxList
    public final void setShouldRequestStateRestore(boolean z) {
        super.setInternalCellAppearNotification(z);
        C1319030kQf c1319030kQf = this.LLILLL;
        if (c1319030kQf != null) {
            c1319030kQf.LLJJJIL = z;
            c1319030kQf.LLJJJJ = z;
            c1319030kQf.LLJJJJJIL = z;
        }
    }

    @InterfaceC1312540kGC(defaultBoolean = false, name = "android-stack-from-end")
    public void setStackFromEnd(boolean z) {
        this.LLLILZLLLI = z;
    }

    @Override // com.lynx.tasm.behavior.ui.list.AbsLynxList
    public final void setStickyOffset(InterfaceC1298070jsr interfaceC1298070jsr) {
        int iLIZIZ = (int) C1311130kDv.LIZIZ(C1318040kP4.LJJIL(interfaceC1298070jsr, 0), 0.0f);
        ViewOnAttachStateChangeListenerC1319040kQg viewOnAttachStateChangeListenerC1319040kQg = this.LLJJIJI;
        if (viewOnAttachStateChangeListenerC1319040kQg == null) {
            this.LLJJJ = iLIZIZ;
        } else {
            viewOnAttachStateChangeListenerC1319040kQg.LLILZ = iLIZIZ;
        }
    }

    @Override // com.lynx.tasm.behavior.ui.list.AbsLynxList
    public final void setTouchScroll(InterfaceC1298070jsr interfaceC1298070jsr) {
        T t = this.mView;
        if (t instanceof C1318680kQ6) {
            ((C1318680kQ6) t).LLILLL = C1318040kP4.LJJIJIIJIL(interfaceC1298070jsr, true);
        }
    }

    @InterfaceC1312540kGC(defaultBoolean = false, name = "android-trigger-sticky-layout")
    public void setTriggerStickyLayout(boolean z) {
        this.LLL = z;
    }

    @Override // com.lynx.tasm.behavior.ui.list.AbsLynxList
    public final void setUpdateAnimation(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "none")) {
            ((RecyclerView) this.mView).setItemAnimator(null);
        }
        if (TextUtils.equals(str, "default")) {
            ((RecyclerView) this.mView).setItemAnimator(new C423520Gj8());
        }
    }

    @InterfaceC1312540kGC(defaultBoolean = false, name = "scroll-upper-lower-switch")
    public void setUpperLowerSwitch(boolean z) {
        this.LLJLLIL = z;
    }

    @Override // com.lynx.tasm.behavior.ui.list.AbsLynxList
    public final void setUpperThreshold(InterfaceC1298070jsr interfaceC1298070jsr) {
        C1318040kP4 c1318040kP4 = this.LLJ;
        c1318040kP4.getClass();
        c1318040kP4.LLILZIL = C1318040kP4.LJJIL(interfaceC1298070jsr, 50);
        c1318040kP4.LLIZ = 0;
    }

    @Override // com.lynx.tasm.behavior.ui.list.AbsLynxList
    public final void setUpperThresholdItemCount(InterfaceC1298070jsr interfaceC1298070jsr) {
        C1318040kP4 c1318040kP4 = this.LLJ;
        c1318040kP4.getClass();
        c1318040kP4.LLIZ = C1318040kP4.LJJIL(interfaceC1298070jsr, 0);
        c1318040kP4.LLILZIL = 0;
    }

    @InterfaceC1312540kGC(defaultBoolean = true, name = "vertical-orientation")
    public void setVerticalOrientation(boolean z) {
        this.LLJJJJJIL = z;
    }

    @InterfaceC1312540kGC(name = "update-list-info")
    public void updateListActionInfo(ReadableMap readableMap) {
        this.LLJLL = true;
        this.LLJLILLLLZIIL = readableMap;
        this.LLJJLIIIJLLLLLLLZ = null;
        this.LLLIZZ = true;
    }

    public UIList(s sVar, Object obj) {
        super(sVar, obj);
        this.LLILZ = 1;
        this.LLIZ = "single";
        this.LLIZLLLIL = true;
        this.LLJJ = true;
        this.LLJJIJIL = -1;
        this.LLJJJIL = true;
        this.LLJJJJJIL = true;
        this.LLJJJJLIIL = new HashMap();
        this.LLJJL = new HashMap();
        this.LLJL = new ArrayList<>();
        this.LLJLIL = new HashMap<>();
        this.LLJLLIL = false;
        this.LLJLLL = false;
        this.LLJZ = 0;
        this.LLJZIJLIL = true;
        this.LLL = false;
        this.LLLF = true;
        this.LLLFF = false;
        this.LLLFFI = false;
        this.LLLFZ = false;
        this.LLLI = false;
        this.LLLIIII = 0;
        this.LLLIIIIL = false;
        this.LLLIIIL = null;
        this.LLLIIL = 0;
        this.LLLIILIL = 1.0f;
        this.LLLIL = null;
        this.LLLILZ = false;
        this.LLLILZJ = true;
        this.LLLILZLLLI = false;
        this.LLLIZZ = false;
        this.LLLJ = null;
        this.LLLJIL = -1;
        this.LLLJL = false;
    }

    @InterfaceC1967107nB
    public void autoScroll(ReadableMap readableMap, Callback callback) {
        int iMin;
        DisplayManager displayManager;
        Display display;
        String string = readableMap.getString("rate", "");
        this.LLJLLL = readableMap.getBoolean("start", true);
        this.LLJZIJLIL = readableMap.getBoolean("autoStop", true);
        if (this.LLJLLL) {
            int iLIZLLL = (int) C1312920kGo.LIZLLL(string, 0.0f, 0.0f, this.mContext.LLJJJ);
            if (iLIZLLL == 0) {
                callback.invoke(1, "rate is not right");
                return;
            }
            s sVar = this.mContext;
            float refreshRate = 60.0f;
            if (sVar != null && (displayManager = (DisplayManager) sVar.LIZ().getSystemService(DisplayManager.class)) != null && (display = displayManager.getDisplay(0)) != null) {
                refreshRate = display.getRefreshRate();
            }
            int i = (int) refreshRate;
            if (i <= 0) {
                i = 60;
            }
            if (iLIZLLL > 0) {
                iMin = Math.max(iLIZLLL / i, 1);
            } else {
                iMin = Math.min(iLIZLLL / i, -1);
            }
            this.LLJZ = iMin;
            LJJJJJL();
            this.LLLJ = new ChoreographerFrameCallbackC1339260kxI(this, 4);
            C786410Ut5.v2().postFrameCallback(this.LLLJ);
        } else {
            LJJJJJL();
        }
        callback.invoke(0);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, X.InterfaceC1311590kEf
    public final boolean canConsumeGesture(float f, float f2) {
        if (!isEnableNewGesture()) {
            return false;
        }
        if (this.LLJJJJJIL) {
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

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final InterfaceC1311410kEN hitTest(float f, float f2) {
        return hitTest(f, f2, false);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final boolean initialPropsFlushed(String str, String str2) {
        HashSet hashSet;
        if (this.LLJJJJLIIL != null && (hashSet = (HashSet) ((HashMap) this.LLJJL).get(str)) != null && hashSet.contains(str)) {
            return true;
        }
        return false;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, X.InterfaceC1311590kEf
    public final void onGestureScrollBy(float f, float f2) {
        if (!isEnableNewGesture()) {
            return;
        }
        C1289620jfE.LIZLLL(new ARunnableS7S0100002_20(this, f, f2, 10));
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void onLayoutFinish(long j, LynxBaseUI lynxBaseUI) {
        C1318570kPv c1318570kPvRemove;
        boolean z;
        boolean z2;
        boolean z3;
        int i;
        T t;
        boolean z4 = true;
        if (LJJJJI()) {
            if (lynxBaseUI instanceof UIComponent) {
                C1319030kQf c1319030kQf = this.LLILLL;
                UIComponent uIComponent = (UIComponent) lynxBaseUI;
                C1318570kPv c1318570kPv = c1319030kQf.LLILLJJLI.get(Long.valueOf(j));
                c1319030kQf.LLLLIILL(uIComponent);
                if (c1318570kPv != null && c1318570kPv.LLILLJJLI == j) {
                    c1319030kQf.LLILLJJLI.remove(Long.valueOf(j));
                    if (c1319030kQf.LLILLL.LLLII != null) {
                        if (c1318570kPv.LL.LLILLJJLI == uIComponent && (t = uIComponent.mView) != 0 && c1318570kPv.itemView == t.getParent()) {
                            c1319030kQf.LLJJIJIIJIL.LIZJ(c1318570kPv);
                            c1318570kPv.LL.LL = 2;
                            c1318570kPv.itemView.requestLayout();
                            return;
                        }
                    } else if (c1318570kPv.LL.LLILLJJLI == uIComponent) {
                        c1319030kQf.LLJJIJIIJIL.LIZJ(c1318570kPv);
                        c1318570kPv.LL.LL = 2;
                        c1318570kPv.itemView.requestLayout();
                        return;
                    }
                    if (c1318570kPv.LL.LLILLJJLI != null) {
                        c1319030kQf.LLLJL(c1318570kPv);
                    }
                    if (uIComponent != null && uIComponent.mView.getParent() != null) {
                        C786410Ut5.LJJJLZIJ(uIComponent.mView, (ViewGroup) uIComponent.mView.getParent());
                    }
                    c1318570kPv.LL.LL = 2;
                    c1318570kPv.L5(uIComponent);
                    c1319030kQf.LLJJIJIIJIL.LIZJ(c1318570kPv);
                    uIComponent.setTop(0);
                    uIComponent.setLeft(0);
                    uIComponent.requestLayout();
                    c1319030kQf.LLLLIILL(uIComponent);
                    c1318570kPv.itemView.requestLayout();
                    return;
                }
                UIList uIList = c1319030kQf.LLILLL;
                if (uIList.LLLII != null) {
                    int iLJJJI = uIList.LJJJI();
                    int iLJJJJ = c1319030kQf.LLILLL.LJJJJ();
                    HashMap<String, Integer> map = c1319030kQf.LLJJJ;
                    if (map != null && map.containsKey(uIComponent.LLILLJJLI)) {
                        int iIntValue = c1319030kQf.LLJJJ.get(uIComponent.LLILLJJLI).intValue();
                        if (iLJJJI != -1 && iIntValue <= iLJJJI) {
                            z2 = true;
                        } else {
                            z2 = false;
                            if (iLJJJJ != -1 && iIntValue >= iLJJJJ) {
                                z3 = true;
                            }
                            UIList uIList2 = c1319030kQf.LLILLL;
                            i = uIList2.LLLIIII;
                            if (iIntValue >= iLJJJI - i || iIntValue > iLJJJJ + i) {
                                return;
                            }
                            if (z2) {
                                if (uIList2.LLLII.LIZIZ(uIComponent.LLILLJJLI)) {
                                    return;
                                }
                                c1319030kQf.LLILLL.LLLII.LIZ(uIComponent, true);
                                return;
                            } else {
                                if (!z3 || uIList2.LLLII.LIZIZ(uIComponent.LLILLJJLI)) {
                                    return;
                                }
                                c1319030kQf.LLILLL.LLLII.LIZ(uIComponent, false);
                                return;
                            }
                        }
                        z3 = false;
                        UIList uIList22 = c1319030kQf.LLILLL;
                        i = uIList22.LLLIIII;
                        if (iIntValue >= iLJJJI - i) {
                            return;
                        } else {
                            return;
                        }
                    }
                    c1319030kQf.LLLL(uIComponent);
                    return;
                }
                c1319030kQf.LLLL(uIComponent);
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("component is null! the operationId is ");
            sbLIZ.append(j);
            LynxLog.e("UIList", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        C1319030kQf c1319030kQf2 = this.LLILLL;
        c1319030kQf2.getClass();
        if (c1319030kQf2.LLIZ || (c1318570kPvRemove = c1319030kQf2.LLILLJJLI.remove(Long.valueOf(j))) == null) {
            return;
        }
        UIComponent uIComponent2 = c1318570kPvRemove.LL.LLILLJJLI;
        if (uIComponent2 != null) {
            uIComponent2.setTop(0);
            uIComponent2.setLeft(0);
            uIComponent2.requestLayout();
            if (uIComponent2.getWidth() != c1318570kPvRemove.itemView.getWidth()) {
                z = true;
            } else {
                z = false;
            }
            if (uIComponent2.getHeight() == c1318570kPvRemove.itemView.getHeight()) {
                z4 = false;
            }
            if (z || z4) {
                c1318570kPvRemove.itemView.requestLayout();
            }
            UIList uIList3 = c1319030kQf2.LLILLL;
            if (uIList3.LLLI && uIList3.LJJJJIZL()) {
                c1319030kQf2.LLLLIILL(uIComponent2);
            }
        }
        c1318570kPvRemove.LL.LL = 2;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final float[] scrollBy(float f, float f2) {
        float[] fArr = new float[4];
        ((RecyclerView) this.mView).scrollBy((int) f, (int) f2);
        if (Math.abs(f) > Float.MIN_VALUE || Math.abs(f2) > Float.MIN_VALUE) {
            recognizeGesturere();
        }
        if (((RecyclerView) this.mView).getLayoutManager() instanceof InterfaceC1319200kQw) {
            if (this.LLJJJJJIL) {
                fArr[0] = 0.0f;
                float fLJ = ((InterfaceC1319200kQw) ((RecyclerView) this.mView).getLayoutManager()).LJ();
                fArr[1] = fLJ;
                fArr[2] = f;
                fArr[3] = f2 - fLJ;
                return fArr;
            }
            float fLIZIZ = ((InterfaceC1319200kQw) ((RecyclerView) this.mView).getLayoutManager()).LIZIZ();
            fArr[0] = fLIZIZ;
            fArr[1] = 0.0f;
            fArr[2] = f - fLIZIZ;
            fArr[3] = f2;
            return fArr;
        }
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = f;
        fArr[3] = f2;
        return fArr;
    }

    @InterfaceC1967107nB
    public void scrollToPosition(ReadableMap readableMap, Callback callback) {
        int height;
        if (this.LLILLL == null) {
            callback.invoke(1, "scrollToPosition before init");
            return;
        }
        int i = readableMap.getInt("index", readableMap.getInt("position", 0));
        int iLIZ = (int) C1311130kDv.LIZ(readableMap.getDouble("offset", 0.0d));
        boolean z = readableMap.getBoolean("smooth", false);
        int iLIZ2 = (int) C1311130kDv.LIZ(readableMap.getDouble("itemHeight", 0.0d));
        String str = "none";
        String string = readableMap.getString("alignTo", "none");
        if (i >= 0 && i <= this.LLILLL.getItemCount()) {
            if (z) {
                C1319070kQj c1319070kQj = this.LLJI;
                c1319070kQj.getClass();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ListScroller scrollToPositionSmoothly: position=");
                sbLIZ.append(i);
                sbLIZ.append(", offset=");
                sbLIZ.append(iLIZ);
                sbLIZ.append(", alignTo: ");
                if (string != null) {
                    str = string;
                }
                sbLIZ.append(str);
                LynxLog.i("UIList", C2188811AlT.LIZIZ(sbLIZ));
                RunnableC1319050kQh runnableC1319050kQh = c1319070kQj.LIZIZ;
                RecyclerView recyclerView = runnableC1319050kQh.LL.get();
                if (recyclerView != null && recyclerView.getLayoutManager() != null && recyclerView.getChildCount() != 0) {
                    if (!recyclerView.isAttachedToWindow()) {
                        runnableC1319050kQh.LLJ = false;
                        LynxLog.e("UIList", "ListScroller start: early return due to view is not attached to window.");
                        callback.invoke(7, "can not invoke scroll when the view is not attached to window.");
                        return;
                    }
                    runnableC1319050kQh.LLILLJJLI = callback;
                    runnableC1319050kQh.LLILLL = i;
                    runnableC1319050kQh.LLILZ = string;
                    runnableC1319050kQh.LLILZIL = iLIZ;
                    runnableC1319050kQh.LLIZLLLIL = null;
                    if (runnableC1319050kQh.LLJ) {
                        return;
                    }
                    runnableC1319050kQh.LLJ = true;
                    recyclerView.stopScroll();
                    recyclerView.stopNestedScroll();
                    recyclerView.addOnItemTouchListener(runnableC1319050kQh.LLJIJIL);
                    HandlerHook.viewPost(recyclerView, runnableC1319050kQh);
                    return;
                }
                runnableC1319050kQh.LLJ = false;
                callback.invoke(4, "can not scroll before init");
                return;
            }
            if (TextUtils.equals(string, "middle")) {
                height = (this.mView.getHeight() - iLIZ2) / 2;
            } else {
                if (TextUtils.equals(string, "bottom")) {
                    height = this.mView.getHeight() - iLIZ2;
                }
                this.LLJI.LIZ(i, iLIZ, callback);
                HandlerHook.viewPost(this.mView, new ARunnableS120S0100000_20(this, 58));
                return;
            }
            iLIZ += height;
            this.LLJI.LIZ(i, iLIZ, callback);
            HandlerHook.viewPost(this.mView, new ARunnableS120S0100000_20(this, 58));
            return;
        }
        callback.invoke(4, "position < 0 or position >= data count");
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void setInitialPropsHasFlushed(String str, String str2) {
        HashSet hashSet;
        if (this.LLJJJJLIIL != null) {
            if (((HashMap) this.LLJJL).containsKey(str2)) {
                hashSet = (HashSet) ((HashMap) this.LLJJL).get(str2);
            } else {
                hashSet = new HashSet();
            }
            hashSet.add(str);
            ((HashMap) this.LLJJJJLIIL).put(str2, hashSet);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void storeKeyToNativeStorage(String str, Object obj) {
        Map<String, Object> map = this.LLJJJJLIIL;
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
            C1289620jfE.LIZLLL(new ARunnableS0S0200010_20(this, C1311130kDv.LIZ(readableMap.getDouble("offset", 0.0d)), callback, 2));
        } else {
            callback.invoke(4, "Invoke scrollBy failed due to index param is null");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0044  */
    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC1311410kEN hitTest(float r7, float r8, boolean r9) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.behavior.ui.list.UIList.hitTest(float, float, boolean):X.0kEN");
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final boolean requestChildUIRectangleOnScreen(LynxBaseUI lynxBaseUI, Rect rect, boolean z) {
        T t;
        if (!this.LLJJ || !(lynxBaseUI instanceof UIComponent) || (t = ((LynxUI) lynxBaseUI).mView) == 0) {
            return false;
        }
        Object parent = t.getParent();
        if (!(parent instanceof C1318540kPs)) {
            return false;
        }
        return ((RecyclerView) this.mView).getLayoutManager().requestChildRectangleOnScreen((RecyclerView) this.mView, (View) parent, rect, false, false);
    }
}
