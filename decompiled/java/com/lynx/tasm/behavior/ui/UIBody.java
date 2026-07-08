package com.lynx.tasm.behavior.ui;

import X.C092S;
import X.C1310110kCH;
import X.C1310290kCZ;
import X.C1310360kCg;
import X.C1310660kDA;
import X.C1313210kHH;
import X.C1315080kKI;
import X.C1315680kLG;
import X.C1316700kMu;
import X.C1339300kxM;
import X.EnumC1311070kDp;
import X.InterfaceC1309730kBf;
import X.InterfaceC1310280kCY;
import X.InterfaceC1311410kEN;
import X.InterfaceC1311940kFE;
import android.content.Context;
import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.log.LynxLog;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.base.TraceEvent;
import com.lynx.tasm.behavior.LynxUIRenderer;
import com.lynx.tasm.behavior.render.NativePaintingContext;
import com.lynx.tasm.behavior.render.PlatformRendererContext;
import com.lynx.tasm.behavior.ui.UIBody;
import j27.s;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes21.dex */
public class UIBody extends UIGroup<C1310660kDA> {
    public C1310660kDA LL;
    public InterfaceC1311410kEN LLILLJJLI;
    public HashMap<String, InterfaceC1311410kEN> LLILLL;
    public ArrayList<LynxUI> LLILZ;
    public C1310360kCg LLILZIL;
    public C092S<Void> LLILZLL;
    public C092S<Void> LLIZ;
    public final C1339300kxM LLIZLLLIL;

    public final synchronized void LJJIIZI() {
        if (!this.mContext.LLLIILIL) {
            LynxLog.w("UIBody", "UIBody.detachUIBodyView should not be called when isEnginePoolEnabled == false.");
            return;
        }
        if (this.LL == null) {
            return;
        }
        final boolean zIsLayoutRequested = ((C1310660kDA) this.mView).isLayoutRequested();
        this.LL.cacheLayoutInfo(getWidth(), getHeight());
        C092S<Void> c092s = new C092S<>(new Callable<Void>() { // from class: X.0kDq
            @Override // java.util.concurrent.Callable
            public final Void call() {
                C1C7U.LIZ("UIBody@5f9f.detachUIBodyView$1");
                TraceEvent.LIZIZ("UIBody.detachUIBodyView");
                this.LLILLJJLI.markDetachWithViewRecursively(true);
                if (zIsLayoutRequested) {
                    this.LLILLJJLI.performMeasureChildrenUI();
                    this.LLILLJJLI.performLayoutChildrenUI();
                }
                this.LLILLJJLI.processViewInfo();
                UIBody uIBody = this.LLILLJJLI;
                uIBody.detachWithViewInfo(uIBody.mViewInfo);
                this.LLILLJJLI.markDetachWithViewRecursively(false);
                TraceEvent.LJII("UIBody.detachUIBodyView");
                synchronized (this) {
                    try {
                        C092S<Void> c092s2 = this.LLILLJJLI.LLIZ;
                        if (c092s2 != null) {
                            c092s2.run();
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                C1C7U.LIZIZ("UIBody@5f9f.detachUIBodyView$1");
                return null;
            }
        }, this.LLIZLLLIL);
        this.LLILZLL = c092s;
        LynxEnv.runJavaTaskOnConcurrentLoop(c092s, 0);
    }

    public final synchronized void LJJIJIIJIL() {
        if (this.mContext.LLLIILIL) {
            C092S<Void> c092s = this.LLILZLL;
            if (c092s != null) {
                c092s.run();
                this.LLILZLL.LIZ();
            }
            C092S<Void> c092s2 = this.LLIZ;
            if (c092s2 != null) {
                c092s2.run();
                this.LLIZ.LIZ();
            }
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void createViewAsync() {
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final void ensureCreateView() {
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void registerViewAccordingToNodeIndex() {
    }

    public final List<C1310110kCH> LJJIJ() {
        C1310660kDA c1310660kDA;
        C1316700kMu c1316700kMu;
        EnumC1311070kDp enumC1311070kDp;
        C1315680kLG c1315680kLGLIZLLL;
        LJJIJIIJIL();
        s sVar = this.mContext;
        if (sVar != null && sVar.LJIJJ() && (c1310660kDA = this.LL) != null) {
            InterfaceC1309730kBf lynxUIRendererInternal = c1310660kDA.getLynxUIRendererInternal();
            if (lynxUIRendererInternal instanceof LynxUIRenderer) {
                InterfaceC1310280kCY interfaceC1310280kCY = ((LynxUIRenderer) lynxUIRendererInternal).LJ;
                if (!(interfaceC1310280kCY instanceof NativePaintingContext)) {
                    return new ArrayList();
                }
                NativePaintingContext nativePaintingContext = (NativePaintingContext) interfaceC1310280kCY;
                if (!nativePaintingContext.LIZJ) {
                    long j = nativePaintingContext.LIZ;
                    if (j != 0) {
                        int[] iArrNativeGetMeaningfulPaintingAreaRecords = nativePaintingContext.nativeGetMeaningfulPaintingAreaRecords(j);
                        PlatformRendererContext platformRendererContext = nativePaintingContext.LIZIZ;
                        s sVar2 = nativePaintingContext.LJ;
                        if (iArrNativeGetMeaningfulPaintingAreaRecords == null || iArrNativeGetMeaningfulPaintingAreaRecords.length == 0) {
                            return new ArrayList();
                        }
                        ArrayList arrayList = new ArrayList(iArrNativeGetMeaningfulPaintingAreaRecords.length / 6);
                        int i = 0;
                        while (true) {
                            int i2 = i + 6;
                            if (i2 > iArrNativeGetMeaningfulPaintingAreaRecords.length) {
                                return arrayList;
                            }
                            int i3 = iArrNativeGetMeaningfulPaintingAreaRecords[i];
                            int i4 = iArrNativeGetMeaningfulPaintingAreaRecords[i + 1];
                            int i5 = iArrNativeGetMeaningfulPaintingAreaRecords[i + 2];
                            int i6 = iArrNativeGetMeaningfulPaintingAreaRecords[i + 3];
                            int i7 = iArrNativeGetMeaningfulPaintingAreaRecords[i + 4];
                            int i8 = iArrNativeGetMeaningfulPaintingAreaRecords[i + 5];
                            if (i7 > 0 && i8 > 0) {
                                if (i4 == 5) {
                                    C1315680kLG c1315680kLGLIZLLL2 = platformRendererContext.LIZLLL(i3);
                                    enumC1311070kDp = (c1315680kLGLIZLLL2 == null || !c1315680kLGLIZLLL2.LIZLLL().booleanValue()) ? EnumC1311070kDp.PENDING : EnumC1311070kDp.PRESENTED;
                                } else {
                                    enumC1311070kDp = i4 == 4 ? (sVar2 == null || (sVar2.LLLIIIIL & 16) <= 0 ? (c1316700kMu = platformRendererContext.LJIIIIZZ) == null || c1316700kMu.LIZIZ.get(i3) == null : platformRendererContext.LJII.get(Integer.valueOf(i3)) == null) ? EnumC1311070kDp.PENDING : EnumC1311070kDp.PRESENTED : EnumC1311070kDp.IRRELEVANT;
                                }
                                if (enumC1311070kDp != EnumC1311070kDp.IRRELEVANT) {
                                    if (i4 == 5 && (c1315680kLGLIZLLL = platformRendererContext.LIZLLL(i3)) != null) {
                                        c1315680kLGLIZLLL.LIZLLL().booleanValue();
                                    }
                                    C1310110kCH c1310110kCH = new C1310110kCH(i5, i6, i7, i8);
                                    InterfaceC1311940kFE interfaceC1311940kFE = platformRendererContext.LIZIZ.get(Integer.valueOf(i3));
                                    if (interfaceC1311940kFE != null && interfaceC1311940kFE.getView() != null) {
                                        interfaceC1311940kFE.getView().getVisibility();
                                    }
                                    InterfaceC1311940kFE interfaceC1311940kFE2 = platformRendererContext.LIZIZ.get(Integer.valueOf(i3));
                                    if (interfaceC1311940kFE2 != null && interfaceC1311940kFE2.getView() != null) {
                                        interfaceC1311940kFE2.getView().getAlpha();
                                    }
                                    platformRendererContext.LJ(i3, true);
                                    platformRendererContext.LJ(i3, false);
                                    c1310110kCH.LJ = enumC1311070kDp;
                                    c1310110kCH.LJFF = -1L;
                                    arrayList.add(c1310110kCH);
                                }
                            }
                            i = i2;
                        }
                    }
                }
                return new ArrayList();
            }
        }
        int width = getWidth();
        int height = getHeight();
        if (width == 0 || height == 0) {
            return new ArrayList();
        }
        ArrayList<C1310110kCH> arrayList2 = new ArrayList<>();
        convertToMeaningfulPaintingAreaRecursive(0, 0, width, height, arrayList2);
        return arrayList2;
    }

    public final void LJJIJIIJI() {
        if (this.mContext.LLLIILIL) {
            TraceEvent.LIZLLL("UIBody.rebuildViewTree");
            synchronized (this) {
                try {
                    C092S<Void> c092s = this.LLILZLL;
                    if (c092s != null) {
                        c092s.run();
                        this.LLILZLL.LIZ();
                        this.LLILZLL = null;
                    }
                    C092S<Void> c092s2 = this.LLIZ;
                    if (c092s2 != null) {
                        c092s2.run();
                        this.LLIZ.LIZ();
                        this.LLIZ = null;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            C1310660kDA c1310660kDA = this.LL;
            if (c1310660kDA != null) {
                c1310660kDA.removeExistingViews();
            }
            ArrayList<LynxUI> arrayList = this.LLILZ;
            if (arrayList == null) {
                TraceEvent.LJII("UIBody.rebuildViewTree");
                return;
            }
            Iterator<LynxUI> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                it2.next().ensureCreateView();
            }
            this.LLILZ.clear();
            TraceEvent.LJII("UIBody.rebuildViewTree");
        }
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onAttach() {
        if (this.mContext.LLLIILIL) {
            LJJIJIIJIL();
        }
        super.onAttach();
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void initialize() {
        super.initialize();
        C1310660kDA c1310660kDA = this.LL;
        if (c1310660kDA == null || c1310660kDA.isAccessibilityDisabled()) {
            return;
        }
        if (this.LLILZIL == null) {
            this.LLILZIL = new C1310360kCg(this);
        }
        this.mAccessibilityElementStatus = 1;
        c1310660kDA.setLynxAccessibilityWrapper(this.LLILZIL);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onLayoutUpdated() {
        super.onLayoutUpdated();
        C1310660kDA c1310660kDA = this.LL;
        if (c1310660kDA != null) {
            c1310660kDA.notifyMeaningfulLayout();
        }
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup
    public final void removeAll() {
        super.removeAll();
        C1310660kDA c1310660kDA = this.LL;
        if (c1310660kDA != null) {
            c1310660kDA.clearMeaningfulFlag();
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, X.InterfaceC1311410kEN
    public final HashMap<String, InterfaceC1311410kEN> getChildrenLynxPageUI() {
        return this.LLILLL;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, X.InterfaceC1311410kEN
    public final InterfaceC1311410kEN getParentLynxPageUI() {
        return this.LLILLJJLI;
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup
    public final View getRealParentView() {
        return this.LL;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final View createView(Context context) {
        return this.LL;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void detachWithViewInfo(C1313210kHH c1313210kHH) {
        C1313210kHH c1313210kHH2 = this.mViewInfo;
        if (c1313210kHH2 != null) {
            c1313210kHH = c1313210kHH2;
        }
        super.detachWithViewInfo(c1313210kHH);
        this.LL = null;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void setChildrenLynxPageUI(HashMap<String, InterfaceC1311410kEN> map) {
        this.LLILLL = map;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void setParentLynxPageUI(InterfaceC1311410kEN interfaceC1311410kEN) {
        this.LLILLJJLI = interfaceC1311410kEN;
    }

    public UIBody(s sVar, C1310660kDA c1310660kDA) {
        super(sVar);
        this.LL = c1310660kDA;
        if (c1310660kDA != null && sVar != null && sVar.LJIJJ()) {
            C1310660kDA c1310660kDA2 = this.LL;
            c1310660kDA2.mLynxContext = sVar;
            c1310660kDA2.setClipChildren(false);
        }
        initialize();
        this.LLIZLLLIL = new C1339300kxM(this, 1);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final View createView(Context context, Object obj) {
        return this.LL;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, X.InterfaceC1311410kEN
    public final boolean eventThrough(float f, float f2) {
        boolean z;
        boolean zEventThrough = super.eventThrough(f, f2);
        if (!zEventThrough) {
            C1310290kCZ c1310290kCZ = this.mContext.LLLIIII;
            if (c1310290kCZ != null) {
                z = c1310290kCZ.LIZIZ;
            } else {
                z = false;
            }
            zEventThrough |= z;
        }
        if (this.mEventThroughActiveRegions == null) {
            return zEventThrough;
        }
        float f3 = this.mContext.getResources().getDisplayMetrics().density;
        float f4 = f * f3;
        float f5 = f2 * f3;
        for (int i = 0; i < this.mEventThroughActiveRegions.size(); i++) {
            ArrayList arrayList = (ArrayList) ListProtector.get(this.mEventThroughActiveRegions, i);
            if (arrayList != null && arrayList.size() == 4) {
                float fLIZ = ((C1315080kKI) ListProtector.get(arrayList, 0)).LIZ(getWidth());
                float fLIZ2 = ((C1315080kKI) ListProtector.get(arrayList, 1)).LIZ(getHeight());
                float fLIZ3 = ((C1315080kKI) ListProtector.get(arrayList, 2)).LIZ(getWidth()) + fLIZ;
                float fLIZ4 = ((C1315080kKI) ListProtector.get(arrayList, 3)).LIZ(getHeight()) + fLIZ2;
                if (f4 >= fLIZ && f4 < fLIZ3 && f5 >= fLIZ2 && f5 < fLIZ4) {
                    LynxLog.i("UIBody", "hit the event through active regions!");
                    return zEventThrough;
                }
            }
        }
        if (zEventThrough) {
            return false;
        }
        return true;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final View getOrCreateView(Context context, Object obj) {
        return this.LL;
    }
}
