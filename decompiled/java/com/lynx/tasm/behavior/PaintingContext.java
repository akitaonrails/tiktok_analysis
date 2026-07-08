package com.lynx.tasm.behavior;

import X.AbstractC1311850kF5;
import X.C0WZX;
import X.C1289620jfE;
import X.C1299120juY;
import X.C1310290kCZ;
import X.C1311420kEO;
import X.C1311720kEs;
import X.C1311730kEt;
import X.C1311740kEu;
import X.C1311840kF4;
import X.C1312480kG6;
import X.C1312490kG7;
import X.C1317480kOA;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C786410Ut5;
import X.InterfaceC1310280kCY;
import X.InterfaceC1311710kEr;
import X.InterfaceC1312730kGV;
import X.RunnableC1311350kEH;
import X.RunnableC1312980kGu;
import Y.ARunnableS0S0101002_20;
import Y.ARunnableS0S1401000_20;
import Y.ARunnableS103S0100000_3;
import Y.ARunnableS120S0100000_20;
import Y.ARunnableS89S0200000_20;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.WindowManager;
import android.view.animation.AnimationUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.log.LynxLog;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.WritableArray;
import com.lynx.react.bridge.mapbuffer.ReadableCompactArrayBuffer;
import com.lynx.react.bridge.mapbuffer.ReadableMapBuffer;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.TemplateBundle;
import com.lynx.tasm.base.TraceController;
import com.lynx.tasm.base.TraceEvent;
import com.lynx.tasm.behavior.PaintingContext;
import com.lynx.tasm.behavior.shadow.TextLayout;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.PropBundle;
import com.lynx.tasm.behavior.ui.UIGroup;
import com.lynx.tasm.behavior.ui.UIShadowProxy;
import com.lynx.tasm.behavior.ui.list.UIList;
import com.lynx.tasm.behavior.ui.list.container.UIListContainer;
import com.lynx.tasm.behavior.ui.view.UIComponent;
import com.lynx.tasm.performance.PerformanceController;
import j27.s;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes21.dex */
public final class PaintingContext implements InterfaceC1310280kCY {
    public final C1311720kEs LIZ;
    public final TextLayout LIZIZ;
    public final long LJFF;
    public long LJI;
    public final ConcurrentHashMap<Integer, InterfaceC1312730kGV> LJII = new ConcurrentHashMap<>();
    public boolean LIZJ = false;
    public final ConcurrentHashMap<String, Boolean> LIZLLL = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, Boolean> LJ = new ConcurrentHashMap<>();

    private native long nativeCreatePaintingContext(Object obj, Object obj2, long j, int i, boolean z);

    @Override // X.InterfaceC1310280kCY
    public final void LIZIZ(long j) {
    }

    @Override // X.InterfaceC1310280kCY
    public final boolean LIZJ(MotionEvent motionEvent) {
        return false;
    }

    @Override // X.InterfaceC1310280kCY
    public final void destroy() {
        this.LIZJ = true;
        for (InterfaceC1312730kGV interfaceC1312730kGV : this.LJII.values()) {
            if (interfaceC1312730kGV != null) {
                interfaceC1312730kGV.destroy();
            }
        }
        this.LJII.clear();
        this.LJI = 0L;
    }

    public native void nativeInvokeCallback(long j, int i, WritableArray writableArray);

    public void rebuildViewTree() {
        String str;
        C1311720kEs c1311720kEs = this.LIZ;
        c1311720kEs.getClass();
        if (TraceController.isTracingStarted()) {
            str = "UIOwner.rebuildViewTree";
            TraceEvent.LIZIZ("UIOwner.rebuildViewTree");
        } else {
            str = null;
        }
        c1311720kEs.LIZIZ.LJJIJIIJI();
        if (TraceController.isTracingStarted()) {
            TraceEvent.LJII(str);
        }
    }

    public void requestLayout() {
        C1289620jfE.LIZLLL(new ARunnableS120S0100000_20(this, 55));
    }

    public void resumeExposure() {
        s sVar = this.LIZ.LIZJ;
        if (sVar == null || sVar.LLJJJJLIIL == null) {
            return;
        }
        C1289620jfE.LIZLLL(new ARunnableS120S0100000_20(sVar, 220));
    }

    @Override // X.InterfaceC1310280kCY
    public final long LIZ() {
        return this.LJFF;
    }

    private void finishTasmOperation(long j) {
        this.LIZ.LJJII();
    }

    private void flushUIOperationBatch(ReadableCompactArrayBuffer readableCompactArrayBuffer) {
        if (readableCompactArrayBuffer == null) {
            return;
        }
        Iterator<InterfaceC1311710kEr> it2 = readableCompactArrayBuffer.iterator();
        while (it2.hasNext()) {
            int iLJFF = it2.next().LJFF();
            int i = 0;
            switch (iLJFF) {
                case 0:
                    insertNode(it2.next().LJFF(), it2.next().LJFF(), it2.next().LJFF());
                    break;
                case 1:
                    removeNode(it2.next().LJFF(), it2.next().LJFF());
                    break;
                case 2:
                    destroyNode(it2.next().LJFF(), it2.next().LJFF());
                    break;
                case 3:
                    int iLJFF2 = it2.next().LJFF();
                    int[] iArr = new int[iLJFF2];
                    while (i < iLJFF2) {
                        iArr[i] = it2.next().LJFF();
                        i++;
                    }
                    LJ(iArr);
                    break;
                case 4:
                    int iLJFF3 = it2.next().LJFF();
                    int[] iArr2 = new int[iLJFF3];
                    while (i < iLJFF3) {
                        iArr2[i] = it2.next().LJFF();
                        i++;
                    }
                    LJFF(iArr2);
                    break;
                case 5:
                    int iLJFF4 = it2.next().LJFF();
                    int[] iArr3 = new int[iLJFF4];
                    for (int i2 = 0; i2 < iLJFF4; i2++) {
                        iArr3[i2] = it2.next().LJFF();
                    }
                    int iLJFF5 = it2.next().LJFF();
                    int[] iArr4 = new int[iLJFF5];
                    for (int i3 = 0; i3 < iLJFF5; i3++) {
                        iArr4[i3] = it2.next().LJFF();
                    }
                    int iLJFF6 = it2.next().LJFF();
                    float[] fArr = new float[iLJFF6];
                    for (int i4 = 0; i4 < iLJFF6; i4++) {
                        fArr[i4] = (float) it2.next().LIZ();
                    }
                    int iLJFF7 = it2.next().LJFF();
                    float[] fArr2 = new float[iLJFF7];
                    for (int i5 = 0; i5 < iLJFF7; i5++) {
                        fArr2[i5] = (float) it2.next().LIZ();
                    }
                    int iLJFF8 = it2.next().LJFF();
                    int[] iArr5 = new int[iLJFF8];
                    while (i < iLJFF8) {
                        iArr5[i] = it2.next().LJFF();
                        i++;
                    }
                    UpdateLayoutPatching(iArr3, iArr4, fArr, fArr2, iArr5);
                    break;
                case 6:
                    finishTasmOperation(it2.next().LJ());
                    break;
                case 7:
                    FinishLayoutOperation(it2.next().LJFF(), it2.next().LJ(), true);
                    break;
                default:
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("flushUIOperationBatch with unknown UIOperationType: ");
                    sbLIZ.append(iLJFF);
                    LynxLog.e("lynx_PaintingContext", C2188811AlT.LIZIZ(sbLIZ));
                    return;
            }
        }
    }

    private float[] getRectToScreen(int i) {
        float[] fArr = {0.0f, 0.0f, 0.0f, 0.0f};
        LynxBaseUI lynxBaseUILJIIZILJ = this.LIZ.LJIIZILJ(i);
        if (lynxBaseUILJIIZILJ != null) {
            float[] fArr2 = {0.0f, 0.0f};
            lynxBaseUILJIIZILJ.getLocationOnScreen(fArr2);
            float f = fArr2[0];
            float f2 = fArr2[1];
            fArr2[0] = lynxBaseUILJIIZILJ.getWidth();
            fArr2[1] = lynxBaseUILJIIZILJ.getHeight();
            lynxBaseUILJIIZILJ.getLocationOnScreen(fArr2);
            fArr[0] = f;
            fArr[1] = f2;
            fArr[2] = fArr2[0] - f;
            fArr[3] = fArr2[1] - f2;
        }
        return fArr;
    }

    private void markUIOperationQueueFlushForRecreateEngine(boolean z) {
        s sVar;
        C1311720kEs c1311720kEs = this.LIZ;
        if (c1311720kEs == null || (sVar = c1311720kEs.LIZJ) == null) {
            return;
        }
        sVar.LJIL(z);
    }

    public final void LJ(int[] iArr) {
        for (int i : iArr) {
            InterfaceC1312730kGV interfaceC1312730kGV = this.LJII.get(Integer.valueOf(i));
            if (interfaceC1312730kGV != null) {
                this.LIZ.LJJIJLIJ(i, interfaceC1312730kGV);
            }
            LynxBaseUI lynxBaseUI = this.LIZ.LJI.get(Integer.valueOf(i));
            if (lynxBaseUI != null) {
                if (lynxBaseUI instanceof UIShadowProxy) {
                    lynxBaseUI = ((UIShadowProxy) lynxBaseUI).LL;
                }
                lynxBaseUI.onNodeReady();
            }
        }
    }

    public final void LJFF(int[] iArr) {
        for (int i : iArr) {
            InterfaceC1312730kGV interfaceC1312730kGVRemove = this.LJII.remove(Integer.valueOf(i));
            if (interfaceC1312730kGVRemove != null) {
                interfaceC1312730kGVRemove.destroy();
            }
            LynxBaseUI lynxBaseUI = this.LIZ.LJI.get(Integer.valueOf(i));
            if (lynxBaseUI != null) {
                C1311720kEs.LJJIFFI(lynxBaseUI);
            }
        }
    }

    public void destroyTextBundle(int i) {
        InterfaceC1312730kGV interfaceC1312730kGVRemove = this.LJII.remove(Integer.valueOf(i));
        if (interfaceC1312730kGVRemove != null) {
            interfaceC1312730kGVRemove.destroy();
        }
    }

    public float[] getBoundingClientOrigin(int i) {
        float[] fArr = {0.0f, 0.0f};
        LynxBaseUI lynxBaseUILJIIZILJ = this.LIZ.LJIIZILJ(i);
        if (lynxBaseUILJIIZILJ != null) {
            Rect boundingClientRect = lynxBaseUILJIIZILJ.getBoundingClientRect();
            fArr[0] = boundingClientRect.left;
            fArr[1] = boundingClientRect.top;
        }
        return fArr;
    }

    public float[] getRectToLynxView(int i) {
        float[] fArr = {0.0f, 0.0f, 0.0f, 0.0f};
        LynxBaseUI lynxBaseUILJIIZILJ = this.LIZ.LJIIZILJ(i);
        if (lynxBaseUILJIIZILJ != null) {
            Rect boundingClientRect = lynxBaseUILJIIZILJ.getBoundingClientRect();
            fArr[0] = boundingClientRect.left;
            fArr[1] = boundingClientRect.top;
            fArr[2] = boundingClientRect.width();
            fArr[3] = boundingClientRect.height();
        }
        return fArr;
    }

    public float[] getRectToWindow(int i) {
        float[] fArr = {0.0f, 0.0f, 0.0f, 0.0f};
        LynxBaseUI lynxBaseUILJIIZILJ = this.LIZ.LJIIZILJ(i);
        if (lynxBaseUILJIIZILJ != null) {
            Rect rectToWindow = lynxBaseUILJIIZILJ.getRectToWindow();
            fArr[0] = rectToWindow.left;
            fArr[1] = rectToWindow.top;
            fArr[2] = rectToWindow.width();
            fArr[3] = rectToWindow.height();
        }
        return fArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int getTagInfo(java.lang.String r7) {
        /*
            r6 = this;
            X.0kEs r0 = r6.LIZ
            r0.getClass()
            r1 = 1
            r5 = 0
            X.0jev r0 = r0.LJIIIZ     // Catch: java.lang.RuntimeException -> Le
            X.0kEn r0 = r0.LIZIZ(r7)     // Catch: java.lang.RuntimeException -> Le
            goto L17
        Le:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r4 = 0
            goto L15
        L14:
            r4 = 4
        L15:
            r1 = 0
            goto L24
        L17:
            com.lynx.tasm.behavior.shadow.ShadowNode r0 = r0.LJ()
            if (r0 == 0) goto L2b
            boolean r0 = r0.LJIILL()
            if (r0 == 0) goto L14
            r4 = 6
        L24:
            r3 = 65535(0xffff, float:9.1834E-41)
            if (r1 == 0) goto L2d
            r4 = r4 & r3
            return r4
        L2b:
            r4 = 1
            goto L15
        L2d:
            r0 = -1
            boolean r2 = r6.LIZLLL(r0, r7)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Boolean> r0 = r6.LJ
            boolean r0 = r0.containsKey(r7)
            if (r0 == 0) goto L4e
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Boolean> r0 = r6.LJ
            java.lang.Object r0 = r0.get(r7)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r5 = r0.booleanValue()
        L46:
            int r1 = r5 << 17
            int r0 = r2 << 16
            r1 = r1 | r0
            r4 = r4 & r3
            r1 = r1 | r4
            return r1
        L4e:
            X.0kEs r1 = r6.LIZ
            r1.getClass()
            java.lang.String r0 = "page"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L63
            X.0jev r0 = r1.LJIIIZ
            X.0kEn r0 = r0.LIZIZ(r7)
            boolean r5 = r0.LIZLLL
        L63:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Boolean> r1 = r6.LJ
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            r1.put(r7, r0)
            goto L46
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.behavior.PaintingContext.getTagInfo(java.lang.String):int");
    }

    public float[] getWindowSize(int i) throws Throwable {
        float[] fArr = new float[2];
        WindowManager windowManager = (WindowManager) C786410Ut5.H2(this.LIZ.LIZJ.LIZ(), "window");
        if (windowManager == null) {
            return null;
        }
        C2204961BRm.LLILZIL(windowManager, new C0WZX("dzBzEg4jUdKSQVYySFyGY8HACamMoez/2Ue+h4pUdlIaBwGoR8k=", null)).getRealMetrics(new DisplayMetrics());
        fArr[0] = r2.widthPixels;
        fArr[1] = r2.heightPixels;
        return fArr;
    }

    public void scrollIntoView(int i) {
        LynxBaseUI lynxBaseUILJIIZILJ = this.LIZ.LJIIZILJ(i);
        if (lynxBaseUILJIIZILJ == null) {
            return;
        }
        lynxBaseUILJIIZILJ.scrollIntoView(false, "center", "center", null);
    }

    public void setKeyframes(PropBundle propBundle) {
        if (propBundle != null && propBundle.getProps() != null) {
            s sVar = this.LIZ.LIZJ;
            String string = propBundle.getProps().getString("removeKeyframe");
            JavaOnlyMap javaOnlyMap = sVar.LLILZIL;
            if (javaOnlyMap != null) {
                javaOnlyMap.remove(string);
            }
            s sVar2 = this.LIZ.LIZJ;
            ReadableMap map = propBundle.getProps().getMap("keyframes");
            if (sVar2.LLILZIL == null) {
                sVar2.LLILZIL = new JavaOnlyMap();
            }
            if (map != null) {
                sVar2.LLILZIL.merge(map);
            }
        }
    }

    public void setNeedMarkPaintEndTiming(String str) {
        s sVar;
        WeakReference<PerformanceController> weakReference;
        PerformanceController performanceController;
        C1311720kEs c1311720kEs = this.LIZ;
        if (c1311720kEs != null && (sVar = c1311720kEs.LIZJ) != null && (weakReference = sVar.LLJIJIL) != null && (performanceController = weakReference.get()) != null && !performanceController.LJ && C1289620jfE.LIZIZ()) {
            performanceController.LJI.add(str);
        }
    }

    public void stopExposure(ReadableMap readableMap) {
        s sVar = this.LIZ.LIZJ;
        if (sVar != null) {
            HashMap<String, Object> mapAsHashMap = readableMap.asHashMap();
            if (sVar.LLJJJJLIIL != null) {
                C1289620jfE.LIZLLL(new ARunnableS89S0200000_20(sVar, mapAsHashMap, 135));
            }
        }
    }

    public void updateEventInfo(boolean z) {
        this.LIZ.LJIJI = z;
    }

    public void updateNodeReloadPatching(int[] iArr) {
        for (int i : iArr) {
            LynxBaseUI lynxBaseUI = this.LIZ.LJI.get(Integer.valueOf(i));
            if (lynxBaseUI != null) {
                if (lynxBaseUI instanceof UIShadowProxy) {
                    lynxBaseUI = ((UIShadowProxy) lynxBaseUI).LL;
                }
                lynxBaseUI.onNodeReload();
            }
        }
    }

    public void validate(int i) {
        LynxBaseUI lynxBaseUILJIIZILJ = this.LIZ.LJIIZILJ(i);
        if (lynxBaseUILJIIZILJ == null) {
            LynxLog.e("LynxUIOwner", "try to validate a not-existing node");
        } else {
            lynxBaseUILJIIZILJ.renderIfNeeded();
        }
    }

    public PaintingContext(C1311720kEs c1311720kEs, int i) {
        this.LIZ = c1311720kEs;
        if (c1311720kEs.LIZJ.LJIJJLI()) {
            this.LIZIZ = new TextLayout(c1311720kEs);
            s sVar = c1311720kEs.LIZJ;
            if ((sVar.LLLIIIIL & 16) > 0) {
                sVar.getClass();
                if (s.LLLILZ != null) {
                    c1311720kEs.LIZJ.getClass();
                    this.LJI = s.LLLILZ.createTextLayoutAPI(c1311720kEs.LIZJ);
                }
            }
        }
        this.LJFF = nativeCreatePaintingContext(this, this.LIZIZ, this.LJI, i, c1311720kEs.LJIIL);
    }

    private void setFrameAppBundle(int i, TemplateBundle templateBundle) {
        this.LIZ.LJJIJLIJ(i, templateBundle);
    }

    public final boolean LIZLLL(int i, String str) {
        s sVar;
        C1311720kEs c1311720kEs = this.LIZ;
        boolean z = false;
        if (c1311720kEs != null && (sVar = c1311720kEs.LIZJ) != null && sVar.LLLIIIL && sVar.LJIILL().containsViewForNodeIndex(i)) {
            return false;
        }
        if (this.LIZLLL.containsKey(str)) {
            return this.LIZLLL.get(str).booleanValue();
        }
        if (LynxEnv.inst().getCreateViewAsync()) {
            C1311720kEs c1311720kEs2 = this.LIZ;
            C1310290kCZ c1310290kCZ = c1311720kEs2.LIZJ.LLLIIII;
            if (c1310290kCZ != null && c1310290kCZ.LJIIJJI) {
                c1311720kEs2.getClass();
                if (!str.equals("page")) {
                    z = c1311720kEs2.LJIIIZ.LIZIZ(str).LIZJ;
                }
            }
        }
        this.LIZLLL.put(str, Boolean.valueOf(z));
        return z;
    }

    public void destroyNode(int i, int i2) {
        this.LIZ.LJII(i, i2);
    }

    public void insertListItemNode(int i, int i2) {
        String strLIZIZ;
        if (TraceController.isTracingStarted()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PaintingContext.insertListItemNode.");
            sbLIZ.append(i);
            sbLIZ.append("_");
            sbLIZ.append(i2);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            TraceEvent.LIZIZ(strLIZIZ);
        } else {
            strLIZIZ = null;
        }
        LynxBaseUI lynxBaseUILJIIZILJ = this.LIZ.LJIIZILJ(i);
        LynxBaseUI lynxBaseUILJIIZILJ2 = this.LIZ.LJIIZILJ(i2);
        if ((lynxBaseUILJIIZILJ instanceof UIListContainer) && (lynxBaseUILJIIZILJ2 instanceof UIComponent)) {
            ((UIListContainer) lynxBaseUILJIIZILJ).LJJIJL(lynxBaseUILJIIZILJ2);
        }
        if (TraceController.isTracingStarted()) {
            TraceEvent.LJII(strLIZIZ);
        }
    }

    public void listCellAppear(int i, String str) {
        LynxBaseUI lynxBaseUI = this.LIZ.LJI.get(Integer.valueOf(i));
        if (lynxBaseUI != null && (lynxBaseUI.getParentBaseUI() instanceof UIListContainer)) {
            lynxBaseUI.onListCellAppear(str, lynxBaseUI.getParentBaseUI());
        }
    }

    public void removeListItemNode(int i, int i2) {
        String strLIZIZ;
        if (TraceController.isTracingStarted()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PaintingContext.removeListItemNode.");
            sbLIZ.append(i);
            sbLIZ.append("_");
            sbLIZ.append(i2);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            TraceEvent.LIZIZ(strLIZIZ);
        } else {
            strLIZIZ = null;
        }
        LynxBaseUI lynxBaseUILJIIZILJ = this.LIZ.LJIIZILJ(i);
        LynxBaseUI lynxBaseUILJIIZILJ2 = this.LIZ.LJIIZILJ(i2);
        if ((lynxBaseUILJIIZILJ instanceof UIListContainer) && (lynxBaseUILJIIZILJ2 instanceof UIComponent)) {
            ((UIGroup) lynxBaseUILJIIZILJ).removeView(lynxBaseUILJIIZILJ2);
        }
        if (TraceController.isTracingStarted()) {
            TraceEvent.LJII(strLIZIZ);
        }
    }

    public void removeNode(int i, int i2) {
        this.LIZ.LJJIIJ(i, i2);
    }

    public void reuseListNode(int i, String str) {
        LynxBaseUI lynxBaseUI = this.LIZ.LJI.get(Integer.valueOf(i));
        if (lynxBaseUI != null) {
            if ((lynxBaseUI.getParentBaseUI() instanceof UIList) || (lynxBaseUI.getParentBaseUI() instanceof UIListContainer)) {
                lynxBaseUI.onListCellPrepareForReuse(str, lynxBaseUI.getParentBaseUI());
            }
        }
    }

    public void updateExtraData(int i, Object obj) {
        this.LIZ.LJJIJLIJ(i, obj);
    }

    public void updateFlattenStatus(int i, boolean z) {
        this.LIZ.LJJ(i, z);
    }

    public void updateNodeReadyPatching(int[] iArr, int[] iArr2) {
        LJ(iArr);
        LJFF(iArr2);
    }

    public void updateTextBundle(int i, long j) {
        s sVar;
        if (!this.LIZJ && (sVar = this.LIZ.LIZJ) != null) {
            sVar.getClass();
            if (s.LLLILZ != null) {
                this.LIZ.LIZJ.getClass();
                InterfaceC1312730kGV interfaceC1312730kGVCreatePage = s.LLLILZ.createPage(j);
                if (interfaceC1312730kGVCreatePage == null) {
                    return;
                }
                InterfaceC1312730kGV interfaceC1312730kGVPut = this.LJII.put(Integer.valueOf(i), interfaceC1312730kGVCreatePage);
                if (interfaceC1312730kGVPut != null) {
                    interfaceC1312730kGVPut.destroy();
                }
                this.LIZ.LJJIJLIJ(i, interfaceC1312730kGVCreatePage);
            }
        }
    }

    public void FinishLayoutOperation(int i, long j, boolean z) {
        this.LIZ.LJJI(i, j);
    }

    public void SetGestureDetectorState(int i, int i2, int i3) {
        LynxBaseUI lynxBaseUILJIIZILJ = this.LIZ.LJIIZILJ(i);
        if (lynxBaseUILJIIZILJ == null) {
            LynxLog.e("LynxUIOwner", "Attempted to set gesture detector state for a non-existing node");
        } else {
            lynxBaseUILJIIZILJ.setGestureDetectorState(i2, i3);
        }
    }

    public void consumeGesture(int i, int i2, ReadableMap readableMap) {
        LynxBaseUI lynxBaseUILJIIZILJ = this.LIZ.LJIIZILJ(i);
        if (lynxBaseUILJIIZILJ == null) {
            LynxLog.e("LynxUIOwner", "Attempted to set gesture detector state for a non-existing node");
        } else {
            lynxBaseUILJIIZILJ.consumeGesture(i2, readableMap);
        }
    }

    public void insertNode(int i, int i2, int i3) {
        this.LIZ.LJIJI(i, i2, i3);
    }

    public void listCellDisappear(int i, boolean z, String str) {
        C1311720kEs c1311720kEs = this.LIZ;
        Boolean boolValueOf = Boolean.valueOf(z);
        LynxBaseUI lynxBaseUI = c1311720kEs.LJI.get(Integer.valueOf(i));
        if (lynxBaseUI != null && (lynxBaseUI.getParentBaseUI() instanceof UIListContainer)) {
            lynxBaseUI.onListCellDisAppear(str, lynxBaseUI.getParentBaseUI(), boolValueOf.booleanValue());
        }
    }

    public float[] scrollBy(int i, float f, float f2) {
        if (C1289620jfE.LIZIZ()) {
            LynxBaseUI lynxBaseUILJIIZILJ = this.LIZ.LJIIZILJ(i);
            if (lynxBaseUILJIIZILJ != null) {
                return lynxBaseUILJIIZILJ.scrollBy(f, f2);
            }
            return new float[]{0.0f, 0.0f, f, f2};
        }
        C1289620jfE.LIZJ(new ARunnableS0S0101002_20(this, i, f, f2, 4));
        return new float[]{0.0f, 0.0f, f, f2};
    }

    public void updateContentSizeAndOffset(int i, float f, float f2, float f3) {
        LynxBaseUI lynxBaseUILJIIZILJ = this.LIZ.LJIIZILJ(i);
        if (lynxBaseUILJIIZILJ instanceof UIListContainer) {
            ((UIListContainer) lynxBaseUILJIIZILJ).LJJJIL(f, f2, f3);
        }
    }

    public void updateProps(int i, boolean z, PropBundle propBundle, ReadableMapBuffer readableMapBuffer) {
        ReadableMap props;
        ReadableArray eventHandlers;
        ReadableArray gestures;
        C1311730kEt c1311730kEt = null;
        if (propBundle != null) {
            props = propBundle.getProps();
            eventHandlers = propBundle.getEventHandlers();
        } else {
            props = null;
            eventHandlers = null;
        }
        Map<String, C1299120juY> mapLIZ = C1299120juY.LIZ(eventHandlers);
        if (propBundle != null) {
            gestures = propBundle.getGestures();
        } else {
            gestures = null;
        }
        Map<Integer, C1311420kEO> mapLIZ2 = C1311420kEO.LIZ(gestures);
        C1311720kEs c1311720kEs = this.LIZ;
        if (props != null) {
            c1311730kEt = new C1311730kEt(props, readableMapBuffer);
        }
        c1311720kEs.LJJIJL(i, z, c1311730kEt, mapLIZ, mapLIZ2);
    }

    public void updateScrollInfo(int i, boolean z, float f, boolean z2) {
        int i2;
        int i3;
        boolean z3;
        LynxBaseUI lynxBaseUILJIIZILJ = this.LIZ.LJIIZILJ(i);
        if (lynxBaseUILJIIZILJ instanceof UIListContainer) {
            UIListContainer uIListContainer = (UIListContainer) lynxBaseUILJIIZILJ;
            int i4 = (int) f;
            uIListContainer.LLJLIL = i4;
            if (!z2) {
                AbstractC1311850kF5 customScrollHook = ((C1317480kOA) uIListContainer.mView).getCustomScrollHook();
                C1311840kF4 c1311840kF4 = uIListContainer.LLJLL;
                if (customScrollHook != c1311840kF4) {
                    ((C1317480kOA) uIListContainer.mView).setCustomScrollHook(c1311840kF4);
                }
                C1317480kOA c1317480kOA = (C1317480kOA) uIListContainer.mView;
                if (uIListContainer.LL) {
                    i2 = 0;
                } else {
                    i2 = i4;
                    i4 = 0;
                }
                RunnableC1312980kGu runnableC1312980kGu = c1317480kOA.LLJJIJI;
                if (!runnableC1312980kGu.LLILZIL.LIZLLL()) {
                    runnableC1312980kGu.LLILZIL.LIZ();
                }
                runnableC1312980kGu.LLIZ.setScrollState(4);
                runnableC1312980kGu.LL = runnableC1312980kGu.LLIZ.getScrollX();
                int scrollY = runnableC1312980kGu.LLIZ.getScrollY();
                runnableC1312980kGu.LLILLJJLI = scrollY;
                AbstractC1311850kF5 abstractC1311850kF5 = runnableC1312980kGu.LLILZLL;
                if (abstractC1311850kF5 != null) {
                    int i5 = runnableC1312980kGu.LL;
                    C1311840kF4 c1311840kF42 = (C1311840kF4) abstractC1311850kF5;
                    boolean z4 = c1311840kF42.LIZJ.LL;
                    if (!z4) {
                        i3 = i2;
                    } else {
                        i3 = i4;
                    }
                    c1311840kF42.LIZ = i3;
                    if (z4) {
                        i5 = scrollY;
                    }
                    if (i3 > i5) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    c1311840kF42.LIZIZ = z3;
                }
                C1312490kG7 c1312490kG7 = runnableC1312980kGu.LLILZIL;
                int i6 = runnableC1312980kGu.LL;
                c1312490kG7.LIZ = 0;
                C1312480kG6 c1312480kG6 = c1312490kG7.LIZIZ;
                c1312480kG6.LJIIJJI = false;
                c1312480kG6.LIZ = i6;
                c1312480kG6.LIZJ = i6;
                c1312480kG6.LIZIZ = i6;
                c1312480kG6.LIZLLL = i6 + (i2 - i6);
                c1312480kG6.LJII = AnimationUtils.currentAnimationTimeMillis();
                c1312480kG6.LJIIIIZZ = 250;
                c1312480kG6.LJI = 0.0f;
                c1312480kG6.LJ = 0;
                C1312480kG6 c1312480kG62 = c1312490kG7.LIZJ;
                c1312480kG62.LJIIJJI = false;
                c1312480kG62.LIZ = scrollY;
                c1312480kG62.LIZJ = scrollY;
                c1312480kG62.LIZIZ = scrollY;
                c1312480kG62.LIZLLL = scrollY + (i4 - scrollY);
                c1312480kG62.LJII = AnimationUtils.currentAnimationTimeMillis();
                c1312480kG62.LJIIIIZZ = 250;
                c1312480kG62.LJI = 0.0f;
                c1312480kG62.LJ = 0;
                runnableC1312980kGu.LIZLLL();
            }
        }
    }

    public void UpdateLayoutPatching(int[] iArr, int[] iArr2, float[] fArr, float[] fArr2, int[] iArr3) {
        Rect rect;
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            int i4 = i3 * 19;
            float[] fArr3 = null;
            if (iArr2[i4 + 16] != 0) {
                int i5 = i * 4;
                rect = new Rect((int) fArr[i5], (int) fArr[i5 + 1], (int) fArr[i5 + 2], (int) fArr[i5 + 3]);
                i++;
            } else {
                rect = null;
            }
            if (iArr2[i4 + 17] != 0) {
                fArr3 = new float[10];
                System.arraycopy(fArr2, i2 * 10, fArr3, 0, 10);
                i2++;
            }
            Rect rect2 = rect;
            float[] fArr4 = fArr3;
            this.LIZ.LJJIJIL(iArr[i3], iArr2[i4], iArr2[i4 + 1], iArr2[i4 + 2], iArr2[i4 + 3], iArr2[i4 + 4], iArr2[i4 + 5], iArr2[i4 + 6], iArr2[i4 + 7], iArr2[i4 + 8], iArr2[i4 + 9], iArr2[i4 + 10], iArr2[i4 + 11], iArr2[i4 + 12], iArr2[i4 + 13], iArr2[i4 + 14], iArr2[i4 + 15], rect2, fArr4, iArr2[i4 + 18], iArr3[i3]);
        }
    }

    public void invoke(int i, String str, ReadableMap readableMap, long j, int i2) {
        C1289620jfE.LIZLLL(new RunnableC1311350kEH(this, j, i2, i, str, readableMap));
    }

    public Object createNode(final int i, final String str, final PropBundle propBundle, final ReadableMapBuffer readableMapBuffer, final boolean z, final int i2) {
        final ReadableMap props;
        final ReadableArray eventHandlers;
        final ReadableArray gestures;
        final FutureTask<Runnable> futureTask;
        if (LIZLLL(i2, str)) {
            C1311730kEt c1311730kEt = null;
            if (propBundle != null) {
                props = propBundle.getProps();
                eventHandlers = propBundle.getEventHandlers();
                gestures = propBundle.getGestures();
            } else {
                props = null;
                eventHandlers = null;
                gestures = null;
            }
            if (props != null) {
                c1311730kEt = new C1311730kEt(props, readableMapBuffer);
            }
            final Map<String, C1299120juY> mapLIZ = C1299120juY.LIZ(eventHandlers);
            final Map<Integer, C1311420kEO> mapLIZ2 = C1311420kEO.LIZ(gestures);
            final C1311720kEs c1311720kEs = this.LIZ;
            c1311720kEs.getClass();
            final C1311730kEt c1311730kEt2 = c1311730kEt;
            Callable callable = new Callable() { // from class: X.0jjs
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    String strLIZIZ;
                    C1311720kEs c1311720kEs2 = c1311720kEs;
                    String str2 = str;
                    int i3 = i;
                    int i4 = i2;
                    boolean z2 = z;
                    C1311730kEt c1311730kEt3 = c1311730kEt2;
                    Map map = mapLIZ;
                    Map map2 = mapLIZ2;
                    c1311720kEs2.getClass();
                    C1C7U.LIZ("LynxUIOwner@2474.createViewAsync$1L");
                    try {
                        if (TraceController.isTracingStarted()) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("UIOwner.createViewAsync.");
                            sbLIZ.append(str2);
                            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                            c1311720kEs2.LJJIJIIJI(strLIZIZ);
                        } else {
                            strLIZIZ = null;
                        }
                        LynxBaseUI lynxBaseUILJI = c1311720kEs2.LJI(new C1311740kEu(i3, i4, str2, map, map2, z2));
                        LynxBaseUI[] lynxBaseUIArr = {lynxBaseUILJI};
                        UIShadowProxy uIShadowProxyLIZLLL = c1311720kEs2.LIZLLL(c1311730kEt3, lynxBaseUILJI);
                        if (TraceController.isTracingStarted()) {
                            TraceEvent.LJII(strLIZIZ);
                        }
                        ARunnableS0S1401000_20 aRunnableS0S1401000_20 = new ARunnableS0S1401000_20(c1311720kEs2, i3, lynxBaseUIArr, uIShadowProxyLIZLLL, c1311730kEt3, str2, 4);
                        C1C7U.LIZIZ("LynxUIOwner@2474.createViewAsync$1L");
                        return aRunnableS0S1401000_20;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("createViewAsync failed, tagName:");
                        sbLIZ2.append(str2);
                        sbLIZ2.append(", error:");
                        sbLIZ2.append(th);
                        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                        LynxLog.e("LynxUIOwner", strLIZIZ2);
                        Exception exc = new Exception(strLIZIZ2);
                        exc.setStackTrace(th.getStackTrace());
                        C1289620jfE.LIZJ(new ARunnableS89S0200000_20(c1311720kEs2, exc, 136));
                        C1C7U.LIZIZ("LynxUIOwner@2474.createViewAsync$1L");
                        return null;
                    }
                }
            };
            if (c1311720kEs.LJIIL) {
                futureTask = new FutureTask<>(callable);
                c1311720kEs.LJIILLIIL.add(futureTask);
            } else {
                futureTask = new FutureTask<>(callable);
                LynxEnv.runJavaTaskOnConcurrentLoop(new ARunnableS103S0100000_3((Object) futureTask, 63), 0);
            }
            return new Runnable() { // from class: X.0kEo
                public final void LIZ() {
                    int i3;
                    PaintingContext paintingContext = this.LLJI;
                    Future future = futureTask;
                    int i4 = i;
                    String str2 = str;
                    ReadableMap readableMap = props;
                    ReadableMapBuffer readableMapBuffer2 = readableMapBuffer;
                    ReadableArray readableArray = eventHandlers;
                    boolean z2 = z;
                    int i5 = i2;
                    ReadableArray readableArray2 = gestures;
                    paintingContext.getClass();
                    if (future.isDone()) {
                        try {
                            Runnable runnable = (Runnable) future.get();
                            i3 = 2;
                            if (runnable != null) {
                                runnable.run();
                                paintingContext.LIZ.LJJIIZ(i4, 2, str2, true);
                            }
                        } catch (InterruptedException | ExecutionException e) {
                            TryCatchGuardChecker.doCheck(e);
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("createViewAsync failed, tagName:");
                            sbLIZ.append(str2);
                            sbLIZ.append(", error:");
                            sbLIZ.append(e);
                            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                            LynxLog.e("lynx_PaintingContext", strLIZIZ);
                            paintingContext.LIZ.LIZJ.handleException(new Exception(strLIZIZ));
                            i3 = 3;
                        }
                        this.LLJI.LIZ.LJJIIZI(i, str, true);
                    }
                    i3 = !future.cancel(true) ? 1 : 0;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("createViewAsync not done, will create on ui thread, tagName:");
                    sbLIZ2.append(str2);
                    LynxLog.i("lynx_PaintingContext", C2188811AlT.LIZIZ(sbLIZ2));
                    paintingContext.LIZ.LJFF(i4, str2, readableMap, readableMapBuffer2, readableArray, z2, i5, readableArray2);
                    paintingContext.LIZ.LJJIIZ(i4, i3, str2, false);
                    this.LLJI.LIZ.LJJIIZI(i, str, true);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("PaintingContext@8cd7.createNode$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("PaintingContext@8cd7.createNode$1");
                }
            };
        }
        return new Runnable() { // from class: X.0kEp
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("PaintingContext@8cd7.createNode$2");
                try {
                    this.LLIZ.createPaintingNodeSync(i, str, propBundle, readableMapBuffer, z, i2);
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("PaintingContext@8cd7.createNode$2");
            }
        };
    }

    public Object createPaintingNodeAsync(final int i, final String str, PropBundle propBundle, final ReadableMapBuffer readableMapBuffer, final boolean z, final int i2) {
        final ReadableMap props;
        final ReadableArray eventHandlers;
        final ReadableArray gestures;
        C1311730kEt c1311730kEt;
        boolean z2;
        String strLIZIZ;
        LynxBaseUI[] lynxBaseUIArr;
        UIShadowProxy uIShadowProxyLIZLLL;
        if (propBundle != null) {
            props = propBundle.getProps();
            eventHandlers = propBundle.getEventHandlers();
            gestures = propBundle.getGestures();
        } else {
            props = null;
            eventHandlers = null;
            gestures = null;
        }
        final C1311720kEs c1311720kEs = this.LIZ;
        c1311720kEs.LJJIIZI(i, str, true);
        if (props != null) {
            c1311730kEt = new C1311730kEt(props, readableMapBuffer);
        } else {
            c1311730kEt = null;
        }
        C1311740kEu c1311740kEu = new C1311740kEu(i, i2, str, C1299120juY.LIZ(eventHandlers), C1311420kEO.LIZ(gestures), z);
        try {
            if (TraceController.isTracingStarted()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("UIOwner.createAsyncViewRunnable.");
                sbLIZ.append(str);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                TraceEvent.LIZLLL(strLIZIZ);
            } else {
                strLIZIZ = null;
            }
            LynxBaseUI lynxBaseUILJI = c1311720kEs.LJI(c1311740kEu);
            lynxBaseUIArr = new LynxBaseUI[]{lynxBaseUILJI};
            uIShadowProxyLIZLLL = c1311720kEs.LIZLLL(c1311730kEt, lynxBaseUILJI);
            if (TraceController.isTracingStarted()) {
                TraceEvent.LJII(strLIZIZ);
            }
            c1311720kEs.LJJIIZ(i, 2, str, true);
            z2 = false;
        } catch (Throwable th) {
            th = th;
            z2 = false;
        }
        try {
            return new ARunnableS0S1401000_20(c1311720kEs, i, lynxBaseUIArr, uIShadowProxyLIZLLL, c1311730kEt, str, 3);
        } catch (Throwable th2) {
            th = th2;
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("createViewAsync failed, tagName:");
            sbLIZ2.append(str);
            sbLIZ2.append(", error:");
            sbLIZ2.append(th);
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            LynxLog.e("LynxUIOwner", strLIZIZ2);
            Exception exc = new Exception(strLIZIZ2);
            exc.setStackTrace(th.getStackTrace());
            C1289620jfE.LIZJ(new ARunnableS89S0200000_20(c1311720kEs, exc, 134));
            Runnable runnable = new Runnable() { // from class: X.0kEq
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("LynxUIOwner@2474.createViewAsyncRunnable$3");
                    try {
                        c1311720kEs.LJFF(i, str, props, readableMapBuffer, eventHandlers, z, i2, gestures);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("LynxUIOwner@2474.createViewAsyncRunnable$3");
                }
            };
            c1311720kEs.LJJIIZ(i, 3, str, z2);
            return runnable;
        }
    }

    public void createPaintingNodeSync(int i, String str, PropBundle propBundle, ReadableMapBuffer readableMapBuffer, boolean z, int i2) {
        ReadableMap props;
        ReadableArray eventHandlers;
        ReadableArray gestures = null;
        if (propBundle != null) {
            props = propBundle.getProps();
            eventHandlers = propBundle.getEventHandlers();
            gestures = propBundle.getGestures();
        } else {
            props = null;
            eventHandlers = null;
        }
        this.LIZ.LJFF(i, str, props, readableMapBuffer, eventHandlers, z, i2, gestures);
        this.LIZ.LJJIIZI(i, str, false);
    }

    public void updateLayout(int i, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float[] fArr, float[] fArr2, float f18, int i2) {
        Rect rect;
        C1311720kEs c1311720kEs = this.LIZ;
        int i3 = (int) f;
        int i4 = (int) f2;
        int i5 = (int) f3;
        int i6 = (int) f4;
        int i7 = (int) f5;
        int i8 = (int) f6;
        int i9 = (int) f7;
        int i10 = (int) f8;
        int i11 = (int) f9;
        int i12 = (int) f10;
        int i13 = (int) f11;
        int i14 = (int) f12;
        int i15 = (int) f13;
        int i16 = (int) f14;
        int i17 = (int) f15;
        int i18 = (int) f16;
        if (fArr != null) {
            rect = new Rect((int) fArr[0], (int) fArr[1], (int) fArr[2], (int) fArr[3]);
        } else {
            rect = null;
        }
        c1311720kEs.LJJIJIL(i, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, i18, rect, fArr2, f18, i2);
    }
}
