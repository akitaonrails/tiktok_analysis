package com.bytedance.xelement.markdown;

import X.C1289620jfE;
import X.C1289960jfm;
import X.C1298140jsy;
import X.C1300980jxY;
import X.C1301060jxg;
import X.C1311920kFC;
import X.C1312230kFh;
import X.C1312250kFj;
import X.C1312280kFm;
import X.C1315220kKW;
import X.C1315240kKY;
import X.C1315270kKb;
import X.C1315320kKg;
import X.C1315330kKh;
import X.C1315840kLW;
import X.C2116708Qz;
import X.C2188811AlT;
import X.EnumC1300260jwO;
import X.InterfaceC1298880juA;
import X.InterfaceC1301080jxi;
import X.InterfaceC1315360kKk;
import X.InterfaceC1320380kSq;
import Y.ARunnableS120S0100000_20;
import Y.ARunnableS89S0200000_20;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.xelement.markdown.MarkdownShadowNode;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.behavior.shadow.NativeLayoutNodeRef;
import com.lynx.tasm.behavior.shadow.ShadowNode;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.textra.TTTextUtils;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes21.dex */
public class MarkdownDocument {
    public InterfaceC1298880juA mLoader;
    public MarkdownShadowNode mShadowNode;
    public long mInstance = nativeCreateInstance();
    public C1315240kKY mResourceManager = new C1315240kKY();
    public boolean mLayoutDestroyed = false;
    public boolean mDrawDestroyed = false;

    public static native void initial();

    private native void nativeAddTextMarkAttachment(long j, byte[] bArr);

    private native void nativeAllowBreakAroundPunctuation(long j, boolean z);

    private native int nativeCharOffsetToMarkdownOffset(long j, int i);

    private native void nativeClearTextMarkAttachment(long j);

    private native long nativeCreateInstance();

    private native void nativeDestroyInstance(long j);

    private native byte[] nativeDraw(long j);

    private native byte[] nativeDrawExtraContent(long j, int i);

    private native byte[] nativeDrawRegion(long j, int i);

    private native byte[] nativeDrawTypewriterRegion(long j, int i, int i2, boolean z);

    private native byte[] nativeDrawWithCursor(long j, int i, boolean z);

    private native int nativeGetCharIndexByLineIndex(long j, int i);

    private native int[] nativeGetCharRangeByPoint(long j, float f, float f2, int i);

    private native String nativeGetContentByCharRange(long j, int i, int i2);

    private native float[] nativeGetCursorPosition(long j, int i, boolean z);

    private native int nativeGetExtraContentCount(long j);

    private native float[] nativeGetExtraContentRect(long j, int i);

    private native String nativeGetImageByTouchPosition(long j, float f, float f2);

    private native String[] nativeGetImages(long j);

    private native float[] nativeGetInlineViewOrigin(long j, String str);

    private native int nativeGetLineCount(long j);

    private native int nativeGetLineIndexByCharIndex(long j, int i);

    private native String[] nativeGetLinkByPosition(long j, float f, float f2);

    private native float[] nativeGetLinkRects(long j);

    private native String[] nativeGetLinks(long j);

    private native int nativeGetPageCharCount(long j);

    private native int nativeGetRegionCount(long j);

    private native float[] nativeGetRegionRect(long j, int i);

    private native float[] nativeGetSelectionRectByCharPos(long j, long j2, long j3);

    private native int[] nativeGetShowedExtraContent(long j, float f, float f2);

    private native int[] nativeGetShowedRegion(long j, float f, float f2);

    private native int[] nativeGetSyntaxRange(long j, String str);

    private native String nativeGetTextClickByPoint(long j, float f, float f2);

    private native int[] nativeGetTypewriterChangedViews(long j, int i, int i2);

    private native String[] nativeGetVisibleViews(long j, int i, boolean z);

    private native void nativeInheritState(long j, long j2);

    private native float[] nativeLayout(long j, float f, float f2, int i);

    private native int nativeMarkdownOffsetToChar(long j, int i);

    private native int nativeOnTouchEvent(long j, int i, float f, float f2);

    private native void nativeParse(long j, String str, int i, int i2, float f);

    public static native void nativeSetDensity(float f, float f2, float f3);

    private native void nativeSetStyle(long j, byte[] bArr);

    private native boolean nativeTouchPointCanScroll(long j, float f, float f2, float f3);

    public synchronized void destroy() {
        long j = this.mInstance;
        if (j != 0) {
            this.mInstance = 0L;
            nativeDestroyInstance(j);
        }
    }

    public synchronized void destroyDrawData() {
        this.mDrawDestroyed = true;
        if (this.mLayoutDestroyed) {
            destroy();
        }
    }

    public synchronized void destroyLayoutData() {
        this.mLayoutDestroyed = true;
        if (this.mDrawDestroyed) {
            destroy();
        }
    }

    public void clearTextMarkAttachment() {
        long j = this.mInstance;
        if (j == 0) {
            return;
        }
        nativeClearTextMarkAttachment(j);
    }

    public int getExtraContentCount() {
        long j = this.mInstance;
        if (j == 0) {
            return 0;
        }
        return nativeGetExtraContentCount(j);
    }

    public String[] getImages() {
        long j = this.mInstance;
        return j == 0 ? new String[0] : nativeGetImages(j);
    }

    public int getLineCount() {
        long j = this.mInstance;
        if (j == 0) {
            return 0;
        }
        return nativeGetLineCount(j);
    }

    public ArrayList<C1315330kKh> getLinks() {
        ArrayList<C1315330kKh> arrayList = new ArrayList<>();
        long j = this.mInstance;
        if (j == 0) {
            return arrayList;
        }
        String[] strArrNativeGetLinks = nativeGetLinks(j);
        float[] fArrNativeGetLinkRects = nativeGetLinkRects(this.mInstance);
        if (strArrNativeGetLinks != null && fArrNativeGetLinkRects != null) {
            int length = fArrNativeGetLinkRects.length / 4;
            int i = length * 2;
            if (strArrNativeGetLinks.length != i) {
                throw new AssertionError();
            }
            if (strArrNativeGetLinks.length != i) {
                return arrayList;
            }
            for (int i2 = 0; i2 < length; i2++) {
                int i3 = i2 * 4;
                int i4 = i2 * 2;
                C1315330kKh c1315330kKh = new C1315330kKh();
                c1315330kKh.LIZJ = i2;
                c1315330kKh.LIZ = strArrNativeGetLinks[i4];
                c1315330kKh.LIZIZ = strArrNativeGetLinks[i4 + 1];
                c1315330kKh.LIZLLL = new RectF(TTTextUtils.Dp2Px(fArrNativeGetLinkRects[i3]), TTTextUtils.Dp2Px(fArrNativeGetLinkRects[i3 + 1]), TTTextUtils.Dp2Px(fArrNativeGetLinkRects[i3 + 2]), TTTextUtils.Dp2Px(fArrNativeGetLinkRects[i3 + 3]));
                arrayList.add(c1315330kKh);
            }
        }
        return arrayList;
    }

    public int getMaxTypewriterStep() {
        long j = this.mInstance;
        if (j == 0) {
            return 0;
        }
        return nativeGetPageCharCount(j);
    }

    public int getPageCharCount() {
        long j = this.mInstance;
        if (j == 0) {
            return 0;
        }
        return nativeGetPageCharCount(j);
    }

    public int getRegionCount() {
        long j = this.mInstance;
        if (j == 0) {
            return 0;
        }
        return nativeGetRegionCount(j);
    }

    public C1315240kKY getResourceManager() {
        return this.mResourceManager;
    }

    public void addTextMarkAttachment(ReadableArray readableArray) {
        if (this.mInstance == 0 || readableArray == null) {
            return;
        }
        C2116708Qz c2116708Qz = new C2116708Qz();
        try {
            c2116708Qz.LIZ(readableArray.asArrayList());
            nativeAddTextMarkAttachment(this.mInstance, c2116708Qz.LIZ.toByteArray());
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public void allowBreakAroundPunctuation(boolean z) {
        long j = this.mInstance;
        if (j == 0) {
            return;
        }
        nativeAllowBreakAroundPunctuation(j, z);
    }

    public int charOffsetToMarkdownOffset(int i) {
        long j = this.mInstance;
        if (j == 0) {
            return 0;
        }
        return nativeCharOffsetToMarkdownOffset(j, i);
    }

    public void draw(C1315220kKW c1315220kKW) {
        long j = this.mInstance;
        if (j == 0) {
            return;
        }
        c1315220kKW.LIZ(nativeDraw(j));
    }

    public int getCharIndexByLineIndex(int i) {
        long j = this.mInstance;
        if (j == 0) {
            return 0;
        }
        return nativeGetCharIndexByLineIndex(j, i);
    }

    public float[] getExtraContentRect(int i) {
        long j = this.mInstance;
        if (j == 0) {
            return new float[4];
        }
        float[] fArrNativeGetExtraContentRect = nativeGetExtraContentRect(j, i);
        fArrNativeGetExtraContentRect[0] = TTTextUtils.Dp2Px(fArrNativeGetExtraContentRect[0]);
        fArrNativeGetExtraContentRect[1] = TTTextUtils.Dp2Px(fArrNativeGetExtraContentRect[1]);
        fArrNativeGetExtraContentRect[2] = TTTextUtils.Dp2Px(fArrNativeGetExtraContentRect[2]);
        fArrNativeGetExtraContentRect[3] = TTTextUtils.Dp2Px(fArrNativeGetExtraContentRect[3]);
        return fArrNativeGetExtraContentRect;
    }

    public float[] getInlineViewOrigin(String str) {
        long j = this.mInstance;
        if (j == 0) {
            return new float[2];
        }
        float[] fArrNativeGetInlineViewOrigin = nativeGetInlineViewOrigin(j, str);
        fArrNativeGetInlineViewOrigin[0] = TTTextUtils.Dp2Px(fArrNativeGetInlineViewOrigin[0]);
        fArrNativeGetInlineViewOrigin[1] = TTTextUtils.Dp2Px(fArrNativeGetInlineViewOrigin[1]);
        return fArrNativeGetInlineViewOrigin;
    }

    public int getLineIndexByCharIndex(int i) {
        long j = this.mInstance;
        if (j == 0) {
            return 0;
        }
        return nativeGetLineIndexByCharIndex(j, i);
    }

    public float[] getRegionRect(int i) {
        long j = this.mInstance;
        if (j == 0) {
            return new float[4];
        }
        float[] fArrNativeGetRegionRect = nativeGetRegionRect(j, i);
        fArrNativeGetRegionRect[0] = TTTextUtils.Dp2Px(fArrNativeGetRegionRect[0]);
        fArrNativeGetRegionRect[1] = TTTextUtils.Dp2Px(fArrNativeGetRegionRect[1]);
        fArrNativeGetRegionRect[2] = TTTextUtils.Dp2Px(fArrNativeGetRegionRect[2]);
        fArrNativeGetRegionRect[3] = TTTextUtils.Dp2Px(fArrNativeGetRegionRect[3]);
        return fArrNativeGetRegionRect;
    }

    public float[] getRunDelegateSize(int i) {
        InterfaceC1315360kKk interfaceC1315360kKkLIZIZ = this.mResourceManager.LIZIZ(i);
        float[] fArr = {0.0f, 0.0f, 0.0f};
        if (interfaceC1315360kKkLIZIZ == null) {
            return fArr;
        }
        fArr[0] = TTTextUtils.Px2Dp(interfaceC1315360kKkLIZIZ.LIZIZ());
        fArr[1] = TTTextUtils.Px2Dp(interfaceC1315360kKkLIZIZ.LIZJ());
        fArr[2] = TTTextUtils.Px2Dp(interfaceC1315360kKkLIZIZ.LIZ());
        return fArr;
    }

    public ArrayList<C1298140jsy> getSyntaxRanges(String str) {
        long j = this.mInstance;
        if (j == 0) {
            return null;
        }
        int[] iArrNativeGetSyntaxRange = nativeGetSyntaxRange(j, str);
        int length = iArrNativeGetSyntaxRange.length / 2;
        ArrayList<C1298140jsy> arrayList = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            C1298140jsy c1298140jsy = new C1298140jsy();
            int i2 = i * 2;
            c1298140jsy.LIZ = iArrNativeGetSyntaxRange[i2];
            c1298140jsy.LIZIZ = iArrNativeGetSyntaxRange[i2 + 1];
            arrayList.add(c1298140jsy);
        }
        return arrayList;
    }

    public void inheritState(MarkdownDocument markdownDocument) {
        long j = this.mInstance;
        if (j != 0) {
            long j2 = markdownDocument.mInstance;
            if (j2 != 0) {
                nativeInheritState(j, j2);
            }
        }
    }

    public int markdownOffsetToChar(int i) {
        long j = this.mInstance;
        if (j == 0) {
            return 0;
        }
        return nativeMarkdownOffsetToChar(j, i);
    }

    public void onTextOverflow(String str) {
        MarkdownShadowNode markdownShadowNode = this.mShadowNode;
        if (markdownShadowNode != null && markdownShadowNode.LJJIIJZLJL("overflow")) {
            C1289960jfm c1289960jfm = new C1289960jfm(markdownShadowNode.LIZIZ, "overflow");
            c1289960jfm.LIZIZ(str, "type");
            C1289620jfE.LIZJ(new ARunnableS89S0200000_20(markdownShadowNode, c1289960jfm, 100));
        }
    }

    public void setStyle(ReadableMap readableMap) {
        long j = this.mInstance;
        if (j == 0) {
            return;
        }
        if (readableMap == null) {
            nativeSetStyle(j, null);
            return;
        }
        C2116708Qz c2116708Qz = new C2116708Qz();
        try {
            c2116708Qz.LIZIZ(readableMap.asHashMap());
            nativeSetStyle(this.mInstance, c2116708Qz.LIZ.toByteArray());
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public MarkdownDocument(InterfaceC1298880juA interfaceC1298880juA, MarkdownShadowNode markdownShadowNode) {
        this.mLoader = interfaceC1298880juA;
        this.mShadowNode = markdownShadowNode;
    }

    public void drawExtraContent(C1315220kKW c1315220kKW, int i) {
        long j = this.mInstance;
        if (j == 0) {
            return;
        }
        c1315220kKW.LIZ(nativeDrawExtraContent(j, i));
    }

    public void drawRegion(C1315220kKW c1315220kKW, int i) {
        long j = this.mInstance;
        if (j == 0) {
            return;
        }
        c1315220kKW.LIZ(nativeDrawRegion(j, i));
    }

    public float[] findCursorPosition(int i, boolean z) {
        long j = this.mInstance;
        if (j == 0) {
            return new float[4];
        }
        float[] fArrNativeGetCursorPosition = nativeGetCursorPosition(j, i, z);
        fArrNativeGetCursorPosition[0] = TTTextUtils.Dp2Px(fArrNativeGetCursorPosition[0]);
        fArrNativeGetCursorPosition[1] = TTTextUtils.Dp2Px(fArrNativeGetCursorPosition[1]);
        fArrNativeGetCursorPosition[3] = TTTextUtils.Dp2Px(fArrNativeGetCursorPosition[3]);
        return fArrNativeGetCursorPosition;
    }

    public String getContentByCharRange(int i, int i2) {
        long j = this.mInstance;
        if (j == 0) {
            return "";
        }
        return nativeGetContentByCharRange(j, i, i2);
    }

    public String getImageByTouchPosition(float f, float f2) {
        long j = this.mInstance;
        if (j == 0) {
            return null;
        }
        return nativeGetImageByTouchPosition(j, TTTextUtils.Px2Dp(f), TTTextUtils.Px2Dp(f2));
    }

    public String[] getLinkByTouchPosition(float f, float f2) {
        long j = this.mInstance;
        if (j == 0) {
            return null;
        }
        return nativeGetLinkByPosition(j, TTTextUtils.Px2Dp(f), TTTextUtils.Px2Dp(f2));
    }

    public ArrayList<RectF> getSelectionRectByCharPos(long j, long j2) {
        int length;
        long j3 = this.mInstance;
        if (j3 == 0) {
            return new ArrayList<>();
        }
        float[] fArrNativeGetSelectionRectByCharPos = nativeGetSelectionRectByCharPos(j3, j, j2);
        if (fArrNativeGetSelectionRectByCharPos == null) {
            length = 0;
        } else {
            length = fArrNativeGetSelectionRectByCharPos.length / 4;
        }
        ArrayList<RectF> arrayList = new ArrayList<>(length);
        for (int i = 0; i < length; i++) {
            int i2 = i * 4;
            arrayList.add(new RectF(TTTextUtils.Dp2Px(fArrNativeGetSelectionRectByCharPos[i2]), TTTextUtils.Dp2Px(fArrNativeGetSelectionRectByCharPos[i2 + 1]), TTTextUtils.Dp2Px(fArrNativeGetSelectionRectByCharPos[i2 + 2]), TTTextUtils.Dp2Px(fArrNativeGetSelectionRectByCharPos[i2 + 3])));
        }
        return arrayList;
    }

    public int[] getShowedExtraContent(float f, float f2) {
        long j = this.mInstance;
        if (j == 0) {
            return new int[2];
        }
        return nativeGetShowedExtraContent(j, TTTextUtils.Px2Dp(f), TTTextUtils.Px2Dp(f2));
    }

    public int[] getShowedRegion(float f, float f2) {
        long j = this.mInstance;
        if (j == 0) {
            return new int[2];
        }
        return nativeGetShowedRegion(j, TTTextUtils.Px2Dp(f), TTTextUtils.Px2Dp(f2));
    }

    public String getTextClickByPoint(float f, float f2) {
        long j = this.mInstance;
        if (j == 0) {
            return null;
        }
        return nativeGetTextClickByPoint(j, TTTextUtils.Px2Dp(f), TTTextUtils.Px2Dp(f2));
    }

    public int[] getTypewriterChangedRegions(int i, int i2) {
        long j = this.mInstance;
        if (j == 0) {
            return new int[]{0, -1};
        }
        return nativeGetTypewriterChangedViews(j, i, i2);
    }

    public String[] getVisibleInlineViews(int i, boolean z) {
        long j = this.mInstance;
        if (j == 0) {
            return new String[0];
        }
        return nativeGetVisibleViews(j, i, z);
    }

    public int loadFont(String str, int i) {
        int i2;
        Typeface typefaceDefaultFromStyle;
        final MarkdownShadowNode markdownShadowNode = (MarkdownShadowNode) this.mLoader;
        markdownShadowNode.getClass();
        if (i > 400) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        if (str != null && !str.isEmpty()) {
            typefaceDefaultFromStyle = C1300980jxY.LJ(i2, markdownShadowNode.LJIIJJI(), str);
        } else {
            typefaceDefaultFromStyle = Typeface.defaultFromStyle(i2);
        }
        if (typefaceDefaultFromStyle != null && Build.VERSION.SDK_INT >= 28) {
            typefaceDefaultFromStyle = Typeface.create(typefaceDefaultFromStyle, i, false);
        }
        if (str != null && !str.isEmpty()) {
            if (typefaceDefaultFromStyle == null) {
                C1301060jxg.LIZ.LJ(markdownShadowNode.LJIIJJI(), str, i2, new InterfaceC1301080jxi(markdownShadowNode) { // from class: X.0kKd
                    public final WeakReference<ShadowNode> LIZ;

                    {
                        this.LIZ = new WeakReference<>(markdownShadowNode);
                    }

                    @Override // X.InterfaceC1301080jxi
                    public final void LIZIZ(Typeface typeface, int i3) {
                        ShadowNode shadowNode = this.LIZ.get();
                        if (shadowNode != null && !shadowNode.LJIILJJIL) {
                            if (shadowNode instanceof MarkdownShadowNode) {
                                MarkdownShadowNode markdownShadowNode2 = (MarkdownShadowNode) shadowNode;
                                markdownShadowNode2.LJJIJIIJI(new ARunnableS120S0100000_20(markdownShadowNode2, 166));
                            }
                            shadowNode.LJIILLIIL();
                        }
                    }
                });
                return 0;
            }
        } else if (typefaceDefaultFromStyle == null) {
            return 0;
        }
        C1315240kKY c1315240kKY = this.mResourceManager;
        c1315240kKY.getClass();
        return c1315240kKY.LIZJ.CreateOrRegisterTypeface(typefaceDefaultFromStyle, str, 400, false).mIndex;
    }

    public void drawWithCursor(C1315220kKW c1315220kKW, int i, boolean z) {
        long j = this.mInstance;
        if (j == 0) {
            return;
        }
        c1315220kKW.LIZ(nativeDrawWithCursor(j, i, z));
    }

    public int[] getCharRangeByPoint(float f, float f2, int i) {
        long j = this.mInstance;
        if (j == 0) {
            return new int[2];
        }
        return nativeGetCharRangeByPoint(j, TTTextUtils.Px2Dp(f), TTTextUtils.Px2Dp(f2), i);
    }

    public float[] layoutMarkdown(float f, float f2, int i) {
        long j = this.mInstance;
        if (j == 0) {
            return new float[2];
        }
        float[] fArrNativeLayout = nativeLayout(j, TTTextUtils.Px2Dp(f), TTTextUtils.Px2Dp(f2), i);
        fArrNativeLayout[0] = TTTextUtils.Dp2Px(fArrNativeLayout[0]);
        fArrNativeLayout[1] = TTTextUtils.Dp2Px(fArrNativeLayout[1]);
        return fArrNativeLayout;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int loadGradient(java.lang.String r9, float r10, float r11) {
        /*
            r8 = this;
            X.0juA r1 = r8.mLoader
            com.lynx.tasm.behavior.shadow.ShadowNode r1 = (com.lynx.tasm.behavior.shadow.ShadowNode) r1
            r1.getClass()
            r2 = r9
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L6e
            j27.s r0 = r1.LJIIJJI()
            android.util.DisplayMetrics r1 = r0.LLJJJ
            int r0 = r1.widthPixels
            float r3 = (float) r0
            int r0 = r1.heightPixels
            float r7 = (float) r0
            r4 = r11
            r5 = r10
            r6 = r3
            X.0kGk r4 = com.lynx.tasm.utils.GradientUtils.LIZ(r2, r3, r4, r5, r6, r7)
            if (r4 == 0) goto L6e
            r0 = 0
            long r5 = r4.getLong(r0)
            r1 = 2
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            r3 = 1
            if (r0 != 0) goto L44
            X.0kKi r2 = new X.0kKi
            X.0kKP r1 = new X.0kKP
            com.lynx.react.bridge.ReadableArray r0 = r4.getArray(r3)
            r1.<init>(r0)
            r2.<init>(r1)
        L3d:
            X.0kKY r0 = r8.mResourceManager
            int r0 = r0.LIZ(r2)
            return r0
        L44:
            r1 = 3
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 != 0) goto L59
            X.0kKi r2 = new X.0kKi
            X.0kKN r1 = new X.0kKN
            com.lynx.react.bridge.ReadableArray r0 = r4.getArray(r3)
            r1.<init>(r0)
            r2.<init>(r1)
            goto L3d
        L59:
            r1 = 4
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 != 0) goto L6e
            X.0kKi r2 = new X.0kKi
            X.0kKO r1 = new X.0kKO
            com.lynx.react.bridge.ReadableArray r0 = r4.getArray(r3)
            r1.<init>(r0)
            r2.<init>(r1)
            goto L3d
        L6e:
            r2 = 0
            goto L3d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.xelement.markdown.MarkdownDocument.loadGradient(java.lang.String, float, float):int");
    }

    public int measureInlineView(String str, float f, float f2) {
        C1315320kKg c1315320kKg;
        NativeLayoutNodeRef nativeLayoutNodeRef;
        String str2;
        C1312250kFj c1312250kFj;
        InterfaceC1298880juA interfaceC1298880juA = this.mLoader;
        float fDp2Px = TTTextUtils.Dp2Px(f);
        float fDp2Px2 = TTTextUtils.Dp2Px(f2);
        MarkdownShadowNode markdownShadowNode = (MarkdownShadowNode) interfaceC1298880juA;
        int i = 0;
        while (true) {
            if (i < markdownShadowNode.LJIIJ()) {
                ShadowNode shadowNodeLJIIIZ = markdownShadowNode.LJIIIZ(i);
                if ((shadowNodeLJIIIZ instanceof NativeLayoutNodeRef) && (str2 = (nativeLayoutNodeRef = (NativeLayoutNodeRef) shadowNodeLJIIIZ).LJJIFFI) != null && str2.equals(str)) {
                    C1312230kFh c1312230kFh = new C1312230kFh();
                    if (fDp2Px <= 0.0f) {
                        fDp2Px = markdownShadowNode.LJJJJJ.LIZ;
                    }
                    c1312230kFh.LIZ = fDp2Px;
                    if (fDp2Px2 <= 0.0f) {
                        fDp2Px2 = markdownShadowNode.LJJJJJ.LIZJ;
                    }
                    c1312230kFh.LIZJ = fDp2Px2;
                    C1312230kFh c1312230kFh2 = markdownShadowNode.LJJJJJ;
                    EnumC1300260jwO enumC1300260jwO = c1312230kFh2.LIZIZ;
                    c1312230kFh.LIZIZ = enumC1300260jwO;
                    c1312230kFh.LIZLLL = c1312230kFh2.LIZLLL;
                    C1312280kFm c1312280kFm = markdownShadowNode.LJJJJJL;
                    if (nativeLayoutNodeRef.LJIILJJIL) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("measureNativeNode for null, tag: ");
                        sbLIZ.append(nativeLayoutNodeRef.LJIILIIL());
                        nativeLayoutNodeRef.LJIJJ(C2188811AlT.LIZIZ(sbLIZ));
                        c1312250kFj = new C1312250kFj(0.0f, 0.0f);
                    } else {
                        int[] iArrLJII = nativeLayoutNodeRef.LIZ.LJII(c1312280kFm.LIZ, nativeLayoutNodeRef.LIZIZ, enumC1300260jwO.intValue(), c1312230kFh.LIZLLL.intValue(), fDp2Px, c1312230kFh.LIZJ);
                        c1312250kFj = new C1312250kFj(iArrLJII[0], iArrLJII[1], iArrLJII[2]);
                    }
                    C1311920kFC c1311920kFC = nativeLayoutNodeRef.LJIILIIL;
                    LynxBaseUI lynxBaseUILJIILLIIL = markdownShadowNode.LJIIJJI().LJIILIIL().LJIILLIIL(shadowNodeLJIIIZ.LIZIZ);
                    float[] fArr = c1312250kFj.LIZ;
                    int i2 = (int) fArr[0];
                    int i3 = (int) fArr[1];
                    c1315320kKg = new C1315320kKg(i2, i3, (int) fArr[2], str, lynxBaseUILJIILLIIL);
                    if (c1311920kFC != null) {
                        int i4 = c1311920kFC.LIZ;
                        float f3 = c1311920kFC.LIZIZ;
                        float f4 = markdownShadowNode.LJJLIIIJILLIZJL;
                        if (i4 == 9) {
                            c1315320kKg.LIZJ = f3;
                        } else if (i4 != 11 && i4 != 6) {
                            if (i4 != 4 && i4 != 5) {
                                if (i4 != 7 && i4 != 8) {
                                    c1315320kKg.LIZJ = 0.0f;
                                } else {
                                    c1315320kKg.LIZJ = (i3 - c1315320kKg.LIZLLL) - (f4 * 0.24f);
                                }
                            } else {
                                c1315320kKg.LIZJ = (f4 * 0.92f) - c1315320kKg.LIZLLL;
                            }
                        } else {
                            c1315320kKg.LIZJ = ((i3 + (f4 * 0.68f)) / 2.0f) - c1315320kKg.LIZLLL;
                        }
                    }
                } else {
                    i++;
                }
            } else {
                c1315320kKg = null;
                break;
            }
        }
        return this.mResourceManager.LIZ(c1315320kKg);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0026 A[PHI: r1
      0x0026: PHI (r1v2 int) = (r1v1 int), (r1v3 int) binds: [B:6:0x000c, B:10:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int onTouchEvent(int r10, float r11, float r12) {
        /*
            r9 = this;
            r3 = r9
            long r4 = r3.mInstance
            r1 = 0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            r6 = 0
            if (r0 != 0) goto Lb
            return r6
        Lb:
            r1 = 1
            if (r10 == 0) goto L26
            r0 = 3
            if (r10 == r1) goto L24
            r1 = 2
            if (r10 == r1) goto L26
            if (r10 != r0) goto L17
            r6 = 4
        L17:
            float r7 = com.lynx.textra.TTTextUtils.Px2Dp(r11)
            float r8 = com.lynx.textra.TTTextUtils.Px2Dp(r12)
            int r0 = r3.nativeOnTouchEvent(r4, r6, r7, r8)
            return r0
        L24:
            r6 = 3
            goto L17
        L26:
            r6 = r1
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.xelement.markdown.MarkdownDocument.onTouchEvent(int, float, float):int");
    }

    public boolean touchPointCanScroll(float f, float f2, float f3) {
        long j = this.mInstance;
        if (j == 0) {
            return false;
        }
        return nativeTouchPointCanScroll(j, TTTextUtils.Px2Dp(f), TTTextUtils.Px2Dp(f2), TTTextUtils.Px2Dp(f3));
    }

    public void drawTypewriterRegion(C1315220kKW c1315220kKW, int i, int i2, boolean z) {
        long j = this.mInstance;
        if (j == 0) {
            return;
        }
        c1315220kKW.LIZ(nativeDrawTypewriterRegion(j, i, i2, z));
    }

    public void parseMarkdown(String str, int i, int i2, float f) {
        long j = this.mInstance;
        if (j == 0) {
            return;
        }
        nativeParse(j, str, i, i2, TTTextUtils.Px2Dp(f));
    }

    public int loadImage(String str, float f, float f2, float f3, float f4) {
        C1315270kKb c1315270kKb;
        InterfaceC1298880juA interfaceC1298880juA = this.mLoader;
        float fDp2Px = TTTextUtils.Dp2Px(f);
        float fDp2Px2 = TTTextUtils.Dp2Px(f2);
        float fDp2Px3 = TTTextUtils.Dp2Px(f3);
        float fDp2Px4 = TTTextUtils.Dp2Px(f4);
        MarkdownShadowNode markdownShadowNode = (MarkdownShadowNode) interfaceC1298880juA;
        C1315840kLW c1315840kLW = (C1315840kLW) ((HashMap) markdownShadowNode.LJJZZI).get(str);
        if (c1315840kLW == null) {
            c1315840kLW = new C1315840kLW(str, markdownShadowNode.LJIIJJI(), markdownShadowNode.LJJIIJZLJL, InterfaceC1320380kSq.LIZJ, markdownShadowNode.LJJL, markdownShadowNode.LJJLI);
            ((HashMap) markdownShadowNode.LJJZZI).put(str, c1315840kLW);
        }
        if (c1315840kLW.LIZLLL) {
            float f5 = c1315840kLW.LIZ;
            float f6 = c1315840kLW.LIZIZ;
            if (fDp2Px > 0.0f) {
                if (fDp2Px2 <= 0.0f) {
                    fDp2Px2 = (f6 * fDp2Px) / f5;
                }
            } else if (fDp2Px2 > 0.0f) {
                fDp2Px = (f5 * fDp2Px2) / f6;
            } else {
                fDp2Px = f5;
                fDp2Px2 = f6;
            }
            if (fDp2Px3 > 0.0f && fDp2Px > fDp2Px3) {
                fDp2Px2 *= fDp2Px3 / fDp2Px;
            } else {
                fDp2Px3 = fDp2Px;
            }
            if (fDp2Px4 > 0.0f && fDp2Px2 > fDp2Px4) {
                fDp2Px3 *= fDp2Px4 / fDp2Px2;
            } else {
                fDp2Px4 = fDp2Px2;
            }
            c1315270kKb = new C1315270kKb(c1315840kLW, (int) fDp2Px3, (int) fDp2Px4);
        } else {
            c1315270kKb = null;
        }
        return this.mResourceManager.LIZ(c1315270kKb);
    }
}
