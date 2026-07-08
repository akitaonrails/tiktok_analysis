package com.lynx.tasm.behavior.ui.text;

import X.AbstractC1311530kEZ;
import X.ActionModeCallbackC1315180kKS;
import X.C1292490jjr;
import X.C1299120juY;
import X.C1310110kCH;
import X.C1310290kCZ;
import X.C1311420kEO;
import X.C1311720kEs;
import X.C1313100kH6;
import X.C1316700kMu;
import X.C1316710kMv;
import X.C1316780kN2;
import X.C1318790kQH;
import X.EnumC1311070kDp;
import X.InterfaceC1298070jsr;
import X.InterfaceC1311410kEN;
import X.InterfaceC1312540kGC;
import X.InterfaceC1312730kGV;
import X.InterfaceC1967107nB;
import android.content.Context;
import android.graphics.RectF;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.UIGroup;
import com.lynx.tasm.behavior.ui.view.AndroidView;
import j27.s;
import java.util.ArrayList;
import java.util.Map;
import u4.q0;

/* JADX INFO: loaded from: classes21.dex */
public class UIText extends UIGroup<ActionModeCallbackC1315180kKS> {
    public C1316780kN2 LL;
    public InterfaceC1312730kGV LLILLJJLI;

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, X.InterfaceC1311590kEf
    public final boolean canConsumeGesture(float f, float f2) {
        return true;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, X.InterfaceC1311590kEf
    public final int getMemberScrollX() {
        return 0;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, X.InterfaceC1311590kEf
    public final int getMemberScrollY() {
        return 0;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, X.InterfaceC1311590kEf
    public final int getScrollContainerDirection() {
        return 0;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, X.InterfaceC1311590kEf
    public final boolean isAtBorder(boolean z) {
        return false;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, X.InterfaceC1311590kEf
    public final void onGestureScrollBy(float f, float f2) {
    }

    public final void LJJIJIL() {
        T t = this.mView;
        if (t == 0) {
            return;
        }
        ActionModeCallbackC1315180kKS actionModeCallbackC1315180kKS = (ActionModeCallbackC1315180kKS) t;
        Map<String, C1299120juY> map = this.mEvents;
        actionModeCallbackC1315180kKS.setBindSelectionChange(map != null && map.containsKey("selectionchange"), getSign());
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final EnumC1311070kDp getMeaningfulContentStatus() {
        T t = this.mView;
        return ((t == 0 || (((ActionModeCallbackC1315180kKS) t).getTextLayout() == null && !((ActionModeCallbackC1315180kKS) this.mView).hasTextraPage())) && this.LLILLJJLI == null) ? EnumC1311070kDp.PENDING : EnumC1311070kDp.PRESENTED;
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void destroy() {
        super.destroy();
        T t = this.mView;
        if (t != 0) {
            ((ActionModeCallbackC1315180kKS) t).release();
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final void didEnsureCreateView() {
        super.didEnsureCreateView();
        InterfaceC1312730kGV interfaceC1312730kGV = this.LLILLJJLI;
        if (interfaceC1312730kGV != null) {
            ((ActionModeCallbackC1315180kKS) this.mView).setTextBundle(interfaceC1312730kGV);
            LJJIJIL();
        } else {
            C1316780kN2 c1316780kN2 = this.LL;
            if (c1316780kN2 != null) {
                ((ActionModeCallbackC1315180kKS) this.mView).setTextBundle(c1316780kN2);
            }
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final CharSequence getAccessibilityLabel() {
        CharSequence accessibilityLabel = super.getAccessibilityLabel();
        return !TextUtils.isEmpty(accessibilityLabel) ? accessibilityLabel : ((ActionModeCallbackC1315180kKS) this.mView).getText();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, X.InterfaceC1311590kEf
    public final Map<Integer, AbstractC1311530kEZ> getGestureHandlers() {
        return super.getGestureHandlers();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final void initAccessibilityDelegate() {
        super.initAccessibilityDelegate();
        T t = this.mView;
        if (t != 0) {
            q0.LJIJ(t, new C1318790kQH(this));
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI, X.InterfaceC1311590kEf
    public final void onInvalidate() {
        if (isEnableNewGesture()) {
            this.mView.postInvalidateOnAnimation();
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onLayoutUpdated() {
        super.onLayoutUpdated();
        int i = this.mPaddingLeft + this.mBorderLeftWidth;
        int i2 = this.mPaddingRight + this.mBorderRightWidth;
        this.mView.setPadding(i, this.mPaddingTop + this.mBorderTopWidth, i2, this.mPaddingBottom + this.mBorderBottomWidth);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onNodeReady() {
        super.onNodeReady();
        if (this.mContext.LJIJJLI()) {
            C1311720kEs c1311720kEsLJIILIIL = this.mContext.LJIILIIL();
            int sign = getSign();
            C1316700kMu c1316700kMu = c1311720kEsLJIILIIL.LJIJJ;
            updateExtraData(c1316700kMu != null ? c1316700kMu.LIZIZ.get(sign) : null);
        }
        C1316780kN2 c1316780kN2 = ((ActionModeCallbackC1315180kKS) this.mView).mTextUpdateBundle;
        if (c1316780kN2 != null) {
            C1313100kH6.LIZ(c1316780kN2, this);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onPropsUpdated() {
        super.onPropsUpdated();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    /* JADX INFO: renamed from: LJJIIZI, reason: merged with bridge method [inline-methods] */
    public ActionModeCallbackC1315180kKS createView(Context context) {
        return new ActionModeCallbackC1315180kKS(context);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void copyPropFromOldUiInUpdateFlatten(LynxBaseUI lynxBaseUI) {
        super.copyPropFromOldUiInUpdateFlatten(lynxBaseUI);
        if (!(lynxBaseUI instanceof FlattenUIText)) {
            return;
        }
        updateExtraData(((FlattenUIText) lynxBaseUI).LLIZ);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    @InterfaceC1312540kGC(name = "accessibility-label")
    public void setAccessibilityLabel(InterfaceC1298070jsr interfaceC1298070jsr) {
        super.setAccessibilityLabel(interfaceC1298070jsr);
        T t = this.mView;
        if (t != 0) {
            t.setFocusable(true);
            this.mView.setContentDescription(getAccessibilityLabel());
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void setConsumeHoverEvent(boolean z) {
        super.setConsumeHoverEvent(z);
        T t = this.mView;
        if (t != 0) {
            ((AndroidView) t).setConsumeHoverEvent(this.mConsumeHoverEvent);
        }
    }

    @InterfaceC1312540kGC(defaultBoolean = false, name = "custom-context-menu")
    public void setCustomContextMenu(boolean z) {
        ((ActionModeCallbackC1315180kKS) this.mView).setCustomContextMenu(z);
    }

    @InterfaceC1312540kGC(defaultBoolean = false, name = "custom-text-selection")
    public void setCustomTextSelection(boolean z) {
        ((ActionModeCallbackC1315180kKS) this.mView).setCustomTextSelection(z);
    }

    @InterfaceC1312540kGC(defaultBoolean = false, name = "text-selection")
    public void setEnableTextSelection(boolean z) {
        s sVar;
        C1310290kCZ c1310290kCZ;
        ((ActionModeCallbackC1315180kKS) this.mView).setEnableTextSelection(z);
        if (z && (c1310290kCZ = (sVar = this.mContext).LLLIIII) != null && c1310290kCZ.LJIJJ && sVar.LJIJJLI() && getOverflow() != 3) {
            setOverflow(0);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void setEvents(Map<String, C1299120juY> map) {
        super.setEvents(map);
        if (this.LLILLJJLI != null) {
            LJJIJIL();
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void setGestureDetectors(Map<Integer, C1311420kEO> map) {
        super.setGestureDetectors(map);
        if (map != null && !map.isEmpty()) {
            ((AndroidView) this.mView).setGestureManager(getGestureArenaManager());
        }
    }

    @InterfaceC1312540kGC(defaultInt = 0, name = "selection-background-color")
    public void setSelectionBackgroundColor(int i) {
        ((ActionModeCallbackC1315180kKS) this.mView).updateSelectionBackgroundColor(i);
    }

    @InterfaceC1312540kGC(defaultInt = 0, name = "selection-handle-color")
    public void setSelectionHandleColor(int i) {
        ((ActionModeCallbackC1315180kKS) this.mView).updateSelectionHandleColor(i);
    }

    @InterfaceC1312540kGC(defaultInt = 0, name = "selection-handle-size")
    public void setSelectionHandleSize(int i) {
        ((ActionModeCallbackC1315180kKS) this.mView).updateSelectionHandleSize(i);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void updateExtraData(Object obj) {
        Map<String, C1299120juY> map;
        if (obj instanceof C1316780kN2) {
            C1316780kN2 c1316780kN2 = (C1316780kN2) obj;
            this.LL = c1316780kN2;
            this.LLILLJJLI = null;
            ((ActionModeCallbackC1315180kKS) this.mView).setTextBundle(c1316780kN2);
            Map<String, C1299120juY> map2 = this.mEvents;
            if (map2 != null) {
                ((ActionModeCallbackC1315180kKS) this.mView).setBindSelectionChange(map2.containsKey("selectionchange"), getSign());
            }
            if (this.mContext.LJIJJLI() && this.LL != null && (map = this.mEvents) != null && map.containsKey("layout")) {
                C1316710kMv.LIZJ(this.mContext, getSign(), this.LL);
                return;
            }
            return;
        }
        if (!(obj instanceof InterfaceC1312730kGV)) {
            return;
        }
        this.LL = null;
        InterfaceC1312730kGV interfaceC1312730kGV = (InterfaceC1312730kGV) obj;
        this.LLILLJJLI = interfaceC1312730kGV;
        T t = this.mView;
        if (t != 0) {
            ((ActionModeCallbackC1315180kKS) t).setTextBundle(interfaceC1312730kGV);
        }
        LJJIJIL();
    }

    public UIText(s sVar, Object obj) {
        super(sVar, obj);
        this.mAccessibilityElementStatus = 1;
        s sVar2 = this.mContext;
        C1310290kCZ c1310290kCZ = sVar2.LLLIIII;
        if (c1310290kCZ != null && c1310290kCZ.LJIJJ && !sVar2.LJIJJLI()) {
            this.mOverflow = 3;
        }
    }

    public final JavaOnlyMap LJJIJ(ArrayList<Float> arrayList, RectF rectF) {
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        float f = this.mContext.LLJJJ.density;
        javaOnlyMap.putDouble("x", (((rectF.left + this.mPaddingLeft) + this.mBorderLeftWidth) + ((Float) ListProtector.get(arrayList, 0)).floatValue()) / f);
        javaOnlyMap.putDouble("y", (((rectF.top + this.mPaddingTop) + this.mBorderTopWidth) + ((Float) ListProtector.get(arrayList, 1)).floatValue()) / f);
        javaOnlyMap.putDouble("radius", ((Float) ListProtector.get(arrayList, 2)).floatValue() / f);
        return javaOnlyMap;
    }

    public final JavaOnlyMap LJJIJIIJI(RectF rectF, RectF rectF2) {
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        float f = this.mContext.LLJJJ.density;
        javaOnlyMap.putDouble("left", (((rectF.left + this.mPaddingLeft) + this.mBorderLeftWidth) + rectF2.left) / f);
        javaOnlyMap.putDouble("top", (((rectF.top + this.mPaddingTop) + this.mBorderTopWidth) + rectF2.top) / f);
        javaOnlyMap.putDouble("right", (((rectF.left + this.mPaddingLeft) + this.mBorderLeftWidth) + rectF2.right) / f);
        javaOnlyMap.putDouble("bottom", (((rectF.top + this.mPaddingTop) + this.mBorderTopWidth) + rectF2.bottom) / f);
        javaOnlyMap.putDouble("width", rectF2.width() / f);
        javaOnlyMap.putDouble("height", rectF2.height() / f);
        return javaOnlyMap;
    }

    public final JavaOnlyMap LJJIJIIJIL(ArrayList arrayList, RectF rectF) {
        RectF rectF2 = new RectF((RectF) ListProtector.get(arrayList, 0));
        for (int i = 1; i < arrayList.size(); i++) {
            rectF2.union((RectF) ListProtector.get(arrayList, i));
        }
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        javaOnlyMap.putMap("boundingRect", LJJIJIIJI(rectF, rectF2));
        JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            javaOnlyArray.add(LJJIJIIJI(rectF, (RectF) ListProtector.get(arrayList, i2)));
        }
        javaOnlyMap.putArray("boxes", javaOnlyArray);
        return javaOnlyMap;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final C1310110kCH convertToMeaningfulPaintingArea(int i, int i2) {
        if (getMeaningfulContentStatus() == EnumC1311070kDp.IRRELEVANT) {
            return null;
        }
        C1310110kCH c1310110kCH = new C1310110kCH(i + getOriginLeft(), i2 + getOriginTop(), getWidth(), getHeight());
        T t = this.mView;
        if (t != 0) {
            t.getAlpha();
        } else {
            getAlpha();
        }
        T t2 = this.mView;
        if (t2 != 0) {
            t2.getScaleX();
        } else {
            getScaleX();
        }
        T t3 = this.mView;
        if (t3 != 0) {
            t3.getScaleY();
        } else {
            getScaleY();
        }
        T t4 = this.mView;
        if (t4 != 0) {
            t4.getVisibility();
        } else {
            getVisibility();
        }
        c1310110kCH.LJ = getMeaningfulContentStatus();
        c1310110kCH.LJFF = getFirstMeaningfulContentPresentedTimestampMicros();
        return c1310110kCH;
    }

    @InterfaceC1967107nB
    public void getSelectedText(ReadableMap readableMap, Callback callback) {
        T t = this.mView;
        if (t != 0) {
            String selectedText = ((ActionModeCallbackC1315180kKS) t).getSelectedText();
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            javaOnlyMap.put("selectedText", selectedText);
            callback.invoke(0, javaOnlyMap);
            return;
        }
        callback.invoke(6);
    }

    @InterfaceC1967107nB
    public void getTextBoundingRect(ReadableMap readableMap, Callback callback) {
        try {
            int i = readableMap.getInt("start");
            int i2 = readableMap.getInt("end");
            if (i <= i2 && i >= 0 && i2 >= 0) {
                T t = this.mView;
                if (t != 0) {
                    ArrayList<RectF> textBoundingBoxes = ((ActionModeCallbackC1315180kKS) t).getTextBoundingBoxes(i, i2);
                    if (textBoundingBoxes.size() > 0) {
                        callback.invoke(0, LJJIJIIJIL(textBoundingBoxes, C1292490jjr.LJFF(this, readableMap)));
                        return;
                    }
                }
                callback.invoke(1, "Can not find text bounding rect.");
                return;
            }
            callback.invoke(4, "parameter is invalid");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            callback.invoke(1, e.getMessage());
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final InterfaceC1311410kEN hitTest(float f, float f2) {
        return hitTest(f, f2, false);
    }

    /* JADX WARN: Not initialized variable reg: 12, insn: 0x00f4: INVOKE (r12 I:com.lynx.react.bridge.Callback), (r3 I:java.lang.Object[]) INTERFACE call: com.lynx.react.bridge.Callback.invoke(java.lang.Object[]):void A[MD:(java.lang.Object[]):void VARARG (m)] (LINE:33554676), block:B:30:0x00e0 */
    @InterfaceC1967107nB
    public void setTextSelection(ReadableMap readableMap, Callback callback) {
        Callback callbackInvoke;
        boolean z;
        boolean z2;
        try {
            double d = this.mContext.LLJJJ.density;
            double d2 = ((readableMap.getDouble("startX") * d) - ((double) this.mPaddingLeft)) - ((double) this.mBorderLeftWidth);
            double d3 = ((readableMap.getDouble("startY") * d) - ((double) this.mPaddingTop)) - ((double) this.mBorderTopWidth);
            double d4 = ((readableMap.getDouble("endX") * d) - ((double) this.mPaddingLeft)) - ((double) this.mBorderLeftWidth);
            double d5 = ((readableMap.getDouble("endY") * d) - ((double) this.mPaddingTop)) - ((double) this.mBorderTopWidth);
            if (readableMap.hasKey("showStartHandle") && !readableMap.getBoolean("showStartHandle")) {
                z = false;
            } else {
                z = true;
            }
            if (readableMap.hasKey("showEndHandle") && !readableMap.getBoolean("showEndHandle")) {
                z2 = false;
            } else {
                z2 = true;
            }
            T t = this.mView;
            if (t != 0) {
                ArrayList<RectF> textSelection = ((ActionModeCallbackC1315180kKS) t).setTextSelection((float) d2, (float) d3, (float) d4, (float) d5, z, z2);
                if (textSelection.size() == 0) {
                    callback.invoke(0);
                    return;
                }
                RectF rectFLJFF = C1292490jjr.LJFF(this, readableMap);
                JavaOnlyMap javaOnlyMapLJJIJIIJIL = LJJIJIIJIL(textSelection, rectFLJFF);
                ArrayList<Float>[] handlesInfo = ((ActionModeCallbackC1315180kKS) this.mView).getHandlesInfo();
                JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
                for (ArrayList<Float> arrayList : handlesInfo) {
                    javaOnlyArray.add(LJJIJ(arrayList, rectFLJFF));
                }
                javaOnlyMapLJJIJIIJIL.putArray("handles", javaOnlyArray);
                callback.invoke(0, javaOnlyMapLJJIJIIJIL);
                return;
            }
            callback.invoke(6);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            callbackInvoke.invoke(1, e.getMessage());
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final InterfaceC1311410kEN hitTest(float f, float f2, boolean z) {
        T t = this.mView;
        if (t == 0) {
            return this;
        }
        float f3 = f - (this.mPaddingLeft + this.mBorderLeftWidth);
        float f4 = f2 - (this.mPaddingTop + this.mBorderTopWidth);
        Layout layout = ((ActionModeCallbackC1315180kKS) t).mTextLayout;
        ActionModeCallbackC1315180kKS actionModeCallbackC1315180kKS = (ActionModeCallbackC1315180kKS) t;
        Spanned spanned = null;
        if (actionModeCallbackC1315180kKS != null && (actionModeCallbackC1315180kKS.getText() instanceof Spanned)) {
            spanned = (Spanned) actionModeCallbackC1315180kKS.getText();
        }
        T t2 = this.mView;
        return C1313100kH6.LIZJ(this, f3, f4, this, layout, spanned, ((ActionModeCallbackC1315180kKS) t2).mTextTranslateOffset, ((ActionModeCallbackC1315180kKS) t2).mTextraPage, z);
    }
}
