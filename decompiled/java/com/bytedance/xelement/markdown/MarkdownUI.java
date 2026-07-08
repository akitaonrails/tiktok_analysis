package com.bytedance.xelement.markdown;

import X.C1289620jfE;
import X.C1292490jjr;
import X.C1315100kKK;
import X.C1315200kKU;
import X.C1315260kKa;
import X.C2188811AlT;
import X.EnumC1311070kDp;
import X.InterfaceC1312540kGC;
import X.InterfaceC1967107nB;
import Y.ARunnableS120S0100000_20;
import Y.ARunnableS31S0101000_20;
import Y.ARunnableS53S0300000_20;
import Y.ARunnableS89S0200000_20;
import android.content.Context;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.log.LynxLog;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.behavior.shadow.ShadowNode;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.behavior.ui.UIGroup;
import j27.s;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes21.dex */
public class MarkdownUI extends UIGroup<C1315200kKU> {
    public static final /* synthetic */ int LLILLJJLI = 0;
    public C1315260kKa LL;

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final EnumC1311070kDp getMeaningfulContentStatus() {
        C1315260kKa c1315260kKa = this.LL;
        return (c1315260kKa == null || !c1315260kKa.LJII) ? EnumC1311070kDp.PENDING : EnumC1311070kDp.PRESENTED;
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void destroy() {
        MarkdownDocument markdownDocument;
        super.destroy();
        C1315260kKa c1315260kKa = this.LL;
        if (c1315260kKa != null && (markdownDocument = c1315260kKa.LIZ) != null) {
            markdownDocument.destroyDrawData();
        }
        ((C1315200kKU) this.mView).LIZIZ();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onLayoutUpdated() {
        super.onLayoutUpdated();
        C1315200kKU c1315200kKU = (C1315200kKU) this.mView;
        float f = this.mPaddingLeft + this.mBorderLeftWidth;
        float f2 = this.mPaddingTop + this.mBorderTopWidth;
        c1315200kKU.LLJLILLLLZIIL = f;
        c1315200kKU.LLJLL = f2;
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void removeChildrenExposureUI() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            LynxBaseUI childAt = getChildAt(childCount);
            if (childAt instanceof MarkdownLinkExposureUI) {
                MarkdownLinkExposureUI markdownLinkExposureUI = (MarkdownLinkExposureUI) childAt;
                this.mContext.LJJI(markdownLinkExposureUI.LL, markdownLinkExposureUI);
                removeChild(markdownLinkExposureUI);
            }
        }
    }

    public MarkdownUI(s sVar) {
        super(sVar, null);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final View createView(Context context) {
        Markdown.ensureInitialized();
        return new C1315200kKU(context);
    }

    @InterfaceC1312540kGC(defaultBoolean = false, name = "text-selection")
    public void setEnableTextSelection(boolean z) {
        ((C1315200kKU) this.mView).setEnableTextSelection(z);
    }

    @InterfaceC1312540kGC(name = "markdown-effect")
    public void setMarkdownEffect(ReadableMap readableMap) {
        C1315200kKU c1315200kKU = (C1315200kKU) this.mView;
        JavaOnlyArray javaOnlyArray = null;
        if (readableMap != null) {
            int i = readableMap.getInt("rangeStart", 0);
            int i2 = readableMap.getInt("rangeEnd", 0);
            String string = readableMap.getString("color", null);
            if (string != null && (i != 0 || i2 != 0)) {
                javaOnlyArray = new JavaOnlyArray();
                JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
                javaOnlyMap.put("startIndex", Integer.valueOf(i));
                javaOnlyMap.put("endIndex", Integer.valueOf(i2));
                javaOnlyMap.put("layer", "foreground");
                JavaOnlyMap javaOnlyMap2 = new JavaOnlyMap();
                javaOnlyMap2.put("color", string);
                javaOnlyMap.put("style", javaOnlyMap2);
                javaOnlyArray.pushMap(javaOnlyMap);
            }
        }
        c1315200kKU.setEffect(javaOnlyArray);
    }

    @InterfaceC1312540kGC(defaultInt = 0, name = "selection-background-color")
    public void setSelectionBackgroundColor(int i) {
        C1315200kKU c1315200kKU = (C1315200kKU) this.mView;
        c1315200kKU.getClass();
        if (i == 0) {
            i = C1315200kKU.LLLIIIIL;
        }
        c1315200kKU.LLIZLLLIL = i;
    }

    @InterfaceC1312540kGC(defaultInt = 0, name = "selection-handle-color")
    public void setSelectionHandleColor(int i) {
        C1315200kKU c1315200kKU = (C1315200kKU) this.mView;
        c1315200kKU.getClass();
        if (i == 0) {
            i = C1315200kKU.LLLIIIL;
        }
        c1315200kKU.LLJ = i;
    }

    @InterfaceC1312540kGC(defaultInt = 0, name = "selection-handle-size")
    public void setSelectionHandleSize(int i) {
        C1315200kKU c1315200kKU = (C1315200kKU) this.mView;
        if (i <= 0) {
            i = c1315200kKU.LLJIJIL;
        }
        c1315200kKU.LLJI = i;
    }

    @InterfaceC1312540kGC(name = "text-mark-attachments")
    public void setTextMarkAttachments(ReadableArray readableArray) {
        ((C1315200kKU) this.mView).setTextMarkAttachments(readableArray);
    }

    @InterfaceC1312540kGC(name = "enable-region-view")
    public void setVSyncAnimation(boolean z) {
        ((C1315200kKU) this.mView).setVSyncAnimation(z);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void updateExtraData(Object obj) {
        boolean z = obj instanceof C1315260kKa;
        if (z) {
            this.LL = (C1315260kKa) obj;
        }
        C1315200kKU c1315200kKU = (C1315200kKU) this.mView;
        c1315200kKU.getClass();
        if (z) {
            C1289620jfE.LIZLLL(new ARunnableS53S0300000_20(c1315200kKU, obj, this, 27));
        }
    }

    public MarkdownUI(s sVar, Object obj) {
        super(sVar, obj);
    }

    public final JavaOnlyMap LJJIIZI(ArrayList<Float> arrayList, RectF rectF) {
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        float f = this.mContext.LLJJJ.density;
        javaOnlyMap.putDouble("x", (((rectF.left + this.mPaddingLeft) + this.mBorderLeftWidth) + ((Float) ListProtector.get(arrayList, 0)).floatValue()) / f);
        javaOnlyMap.putDouble("y", (((rectF.top + this.mPaddingTop) + this.mBorderTopWidth) + ((Float) ListProtector.get(arrayList, 1)).floatValue()) / f);
        javaOnlyMap.putDouble("radius", ((Float) ListProtector.get(arrayList, 2)).floatValue() / f);
        return javaOnlyMap;
    }

    public final JavaOnlyMap LJJIJ(RectF rectF, RectF rectF2) {
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

    public final JavaOnlyMap LJJIJIIJI(ArrayList arrayList, RectF rectF) {
        RectF rectF2 = new RectF((RectF) ListProtector.get(arrayList, 0));
        for (int i = 1; i < arrayList.size(); i++) {
            rectF2.union((RectF) ListProtector.get(arrayList, i));
        }
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        javaOnlyMap.putMap("boundingRect", LJJIJ(rectF, rectF2));
        JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            javaOnlyArray.add(LJJIJ(rectF, (RectF) ListProtector.get(arrayList, i2)));
        }
        javaOnlyMap.putArray("boxes", javaOnlyArray);
        return javaOnlyMap;
    }

    @InterfaceC1967107nB
    public void clearStatus(ReadableMap readableMap, Callback callback) {
        MarkdownShadowNode markdownShadowNode = (MarkdownShadowNode) this.mContext.LJFF(getSign());
        if (markdownShadowNode == null) {
            callback.invoke(1, "shadow node destroyed");
        } else {
            markdownShadowNode.LJJIJIIJI(new ARunnableS120S0100000_20(markdownShadowNode, 158));
        }
    }

    @InterfaceC1967107nB
    public void getCharIndexByPoint(ReadableMap readableMap, Callback callback) {
        if (readableMap != null) {
            try {
                if (readableMap.hasKey("x") && readableMap.hasKey("y")) {
                    if (this.mView == 0) {
                        callback.invoke(6);
                        return;
                    }
                    C1315260kKa c1315260kKa = this.LL;
                    if (c1315260kKa != null && c1315260kKa.LIZ != null) {
                        double d = this.mContext.LLJJJ.density;
                        int offsetForPosition = ((C1315200kKU) this.mView).getOffsetForPosition((float) (((readableMap.getDouble("x") * d) - ((double) this.mPaddingLeft)) - ((double) this.mBorderLeftWidth)), (float) (((readableMap.getDouble("y") * d) - ((double) this.mPaddingTop)) - ((double) this.mBorderTopWidth)));
                        if (offsetForPosition < 0) {
                            callback.invoke(1, "can not find char index");
                            return;
                        }
                        if ("source".equals(readableMap.getString("indexType", ""))) {
                            offsetForPosition = this.LL.LIZ.charOffsetToMarkdownOffset(offsetForPosition);
                        }
                        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
                        javaOnlyMap.put("index", Integer.valueOf(offsetForPosition));
                        callback.invoke(0, javaOnlyMap);
                        return;
                    }
                    callback.invoke(6, "can't get index when parsing");
                    return;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                callback.invoke(1, e.getMessage());
                return;
            }
        }
        callback.invoke(4, "parameter is invalid");
    }

    @InterfaceC1967107nB
    public void getContent(ReadableMap readableMap, Callback callback) {
        MarkdownDocument markdownDocument;
        int i = readableMap.getInt("start", 0);
        int i2 = readableMap.getInt("end", Integer.MAX_VALUE);
        C1315260kKa c1315260kKa = this.LL;
        if (c1315260kKa != null && (markdownDocument = c1315260kKa.LIZ) != null) {
            if (i >= i2) {
                callback.invoke(4, "start >= end");
                return;
            }
            String contentByCharRange = markdownDocument.getContentByCharRange(i, i2);
            if (contentByCharRange == null) {
                callback.invoke(4);
                return;
            }
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            javaOnlyMap.put("content", contentByCharRange);
            callback.invoke(0, javaOnlyMap);
            return;
        }
        callback.invoke(6, "can't get content when parsing");
    }

    @InterfaceC1967107nB
    public void getImages(ReadableMap readableMap, Callback callback) {
        C1315260kKa c1315260kKa = this.LL;
        if (c1315260kKa == null) {
            callback.invoke(1, "parse not finished");
            return;
        }
        String[] images = c1315260kKa.LIZ.getImages();
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
        for (String str : images) {
            javaOnlyArray.pushString(str);
        }
        javaOnlyMap.put("images", javaOnlyArray);
        callback.invoke(0, javaOnlyMap);
    }

    @InterfaceC1967107nB
    public void getParseResult(ReadableMap readableMap, Callback callback) {
        ReadableArray array = readableMap.getArray("tags", null);
        if (array != null && array.size() != 0) {
            MarkdownShadowNode markdownShadowNode = (MarkdownShadowNode) this.mContext.LJFF(getSign());
            if (markdownShadowNode == null) {
                callback.invoke(1, "can't find markdown shadow node");
                return;
            } else {
                markdownShadowNode.LJJIJIIJI(new ARunnableS53S0300000_20(markdownShadowNode, array, callback, 26));
                return;
            }
        }
        callback.invoke(4, "param invalid: no tags");
    }

    @InterfaceC1967107nB
    public void getSelectedText(ReadableMap readableMap, Callback callback) {
        T t = this.mView;
        if (t != 0) {
            String selectedText = ((C1315200kKU) t).getSelectedText();
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            javaOnlyMap.put("selectedText", selectedText);
            callback.invoke(0, javaOnlyMap);
            return;
        }
        callback.invoke(6);
    }

    @InterfaceC1967107nB
    public void getTextBoundingRect(ReadableMap readableMap, Callback callback) {
        C1315260kKa c1315260kKa;
        ArrayList<RectF> arrayList;
        try {
            int iMarkdownOffsetToChar = readableMap.getInt("start");
            int iMarkdownOffsetToChar2 = readableMap.getInt("end");
            if (iMarkdownOffsetToChar <= iMarkdownOffsetToChar2 && iMarkdownOffsetToChar >= 0 && iMarkdownOffsetToChar2 >= 0) {
                if (this.mView != 0 && (c1315260kKa = this.LL) != null && c1315260kKa.LIZ != null) {
                    if (readableMap.getString("indexType", "").equals("source")) {
                        iMarkdownOffsetToChar = this.LL.LIZ.markdownOffsetToChar(iMarkdownOffsetToChar);
                        iMarkdownOffsetToChar2 = this.LL.LIZ.markdownOffsetToChar(iMarkdownOffsetToChar2);
                    }
                    C1315200kKU c1315200kKU = (C1315200kKU) this.mView;
                    c1315200kKU.getClass();
                    if (iMarkdownOffsetToChar <= iMarkdownOffsetToChar2 && iMarkdownOffsetToChar >= 0) {
                        arrayList = c1315200kKU.LL.LIZ.getSelectionRectByCharPos(iMarkdownOffsetToChar, iMarkdownOffsetToChar2);
                    } else {
                        arrayList = new ArrayList<>();
                    }
                    if (arrayList.size() > 0) {
                        callback.invoke(0, LJJIJIIJI(arrayList, C1292490jjr.LJFF(this, readableMap)));
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

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void insertChild(LynxBaseUI lynxBaseUI, int i) {
        super.insertChild(lynxBaseUI, i);
        if (lynxBaseUI instanceof LynxUI) {
            ((LynxUI) lynxBaseUI).setVisibilityForView(4);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onListCellAppear(String str, LynxBaseUI lynxBaseUI) {
        C1315200kKU c1315200kKU;
        super.onListCellAppear(str, lynxBaseUI);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        ShadowNode shadowNodeLJFF = this.mContext.LJFF(getSign());
        if (shadowNodeLJFF instanceof MarkdownShadowNode) {
            Object valueFromNativeStorage = lynxBaseUI.getValueFromNativeStorage(constructListStateCacheKey(getTagName(), str, getIdSelector()));
            if (valueFromNativeStorage != null && (valueFromNativeStorage instanceof C1315100kKK)) {
                C1315100kKK c1315100kKK = (C1315100kKK) valueFromNativeStorage;
                MarkdownShadowNode markdownShadowNode = (MarkdownShadowNode) shadowNodeLJFF;
                markdownShadowNode.getClass();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("setAnimationState: step=");
                sbLIZ.append(c1315100kKK.LIZ);
                sbLIZ.append(", paused=");
                sbLIZ.append(c1315100kKK.LIZIZ);
                sbLIZ.append(", drawStart=");
                sbLIZ.append(c1315100kKK.LIZJ);
                sbLIZ.append(", drawEnd=");
                sbLIZ.append(c1315100kKK.LIZLLL);
                sbLIZ.append(", vsync=");
                sbLIZ.append(markdownShadowNode.LJJLIIIJJIZ);
                LynxLog.i("MarkdownShadowNode", C2188811AlT.LIZIZ(sbLIZ));
                if (markdownShadowNode.LJJLIIIJJIZ && (c1315200kKU = markdownShadowNode.LJJLIIIJJI) != null) {
                    c1315200kKU.LJI(c1315100kKK.LIZ);
                }
                markdownShadowNode.LJJIJIIJI(new ARunnableS89S0200000_20(c1315100kKK, markdownShadowNode, 103));
                return;
            }
            ((MarkdownShadowNode) shadowNodeLJFF).LJJIJ();
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onListCellPrepareForReuse(String str, LynxBaseUI lynxBaseUI) {
        super.onListCellPrepareForReuse(str, lynxBaseUI);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        ShadowNode shadowNodeLJFF = this.mContext.LJFF(getSign());
        if (shadowNodeLJFF instanceof MarkdownShadowNode) {
            ((MarkdownShadowNode) shadowNodeLJFF).LJJIJ();
        }
    }

    @InterfaceC1967107nB
    public void pauseAnimation(ReadableMap readableMap, Callback callback) {
        int i;
        C1315260kKa c1315260kKa = this.LL;
        if (c1315260kKa == null) {
            callback.invoke(1, "animation not start");
            return;
        }
        MarkdownShadowNode markdownShadowNode = c1315260kKa.LJ.get();
        if (markdownShadowNode == null) {
            callback.invoke(1, "shadow node destroyed");
            return;
        }
        synchronized (markdownShadowNode) {
            try {
                markdownShadowNode.LJJIZ = true;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("pauseAnimation: ");
                sbLIZ.append(markdownShadowNode.LJJIII());
                LynxLog.i("MarkdownShadowNode", C2188811AlT.LIZIZ(sbLIZ));
                i = markdownShadowNode.LJJIJIL;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        javaOnlyMap.put("animationStep", Integer.valueOf(i));
        callback.invoke(0, javaOnlyMap);
    }

    @InterfaceC1967107nB
    public void resumeAnimation(ReadableMap readableMap, Callback callback) {
        C1315200kKU c1315200kKU;
        C1315260kKa c1315260kKa = this.LL;
        if (c1315260kKa == null) {
            callback.invoke(1, "animation not start");
            return;
        }
        MarkdownShadowNode markdownShadowNode = c1315260kKa.LJ.get();
        if (markdownShadowNode == null) {
            callback.invoke(1, "shadow node destroyed");
            return;
        }
        int i = readableMap.getInt("animationStep", -1);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("resumeAnimation request: targetStep=");
        sbLIZ.append(i);
        LynxLog.i("MarkdownShadowNode", C2188811AlT.LIZIZ(sbLIZ));
        if (markdownShadowNode.LJJLIIIJJIZ && i > 0 && (c1315200kKU = markdownShadowNode.LJJLIIIJJI) != null) {
            c1315200kKU.LJI(i);
        }
        markdownShadowNode.LJJIJIIJI(new ARunnableS31S0101000_20(i, markdownShadowNode, 6));
        callback.invoke(0);
    }

    /* JADX WARN: Not initialized variable reg: 13, insn: 0x00fc: INVOKE (r13 I:com.lynx.react.bridge.Callback), (r2 I:java.lang.Object[]) INTERFACE call: com.lynx.react.bridge.Callback.invoke(java.lang.Object[]):void A[MD:(java.lang.Object[]):void VARARG (m)] (LINE:33554684), block:B:30:0x00e9 */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0077  */
    @X.InterfaceC1967107nB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setTextSelection(com.lynx.react.bridge.ReadableMap r21, com.lynx.react.bridge.Callback r22) {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.xelement.markdown.MarkdownUI.setTextSelection(com.lynx.react.bridge.ReadableMap, com.lynx.react.bridge.Callback):void");
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onListCellDisAppear(String str, LynxBaseUI lynxBaseUI, boolean z) {
        super.onListCellDisAppear(str, lynxBaseUI, z);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (z) {
            String strConstructListStateCacheKey = constructListStateCacheKey(getTagName(), str, getIdSelector());
            ShadowNode shadowNodeLJFF = this.mContext.LJFF(getSign());
            if (shadowNodeLJFF instanceof MarkdownShadowNode) {
                MarkdownShadowNode markdownShadowNode = (MarkdownShadowNode) shadowNodeLJFF;
                markdownShadowNode.getClass();
                C1315100kKK c1315100kKK = new C1315100kKK();
                c1315100kKK.LIZ = markdownShadowNode.LJJIJIL;
                c1315100kKK.LIZIZ = markdownShadowNode.LJJIZ;
                c1315100kKK.LIZJ = markdownShadowNode.LJJLIIIJLJLI;
                c1315100kKK.LIZLLL = markdownShadowNode.LJJLIIIJLLLLLLLZ;
                lynxBaseUI.storeKeyToNativeStorage(strConstructListStateCacheKey, c1315100kKK);
                return;
            }
            return;
        }
        throw new AssertionError();
    }
}
