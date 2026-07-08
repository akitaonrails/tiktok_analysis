package com.lynx.starlight.nodes;

import X.C14O0;
import X.C14O3;
import android.os.SystemClock;
import com.bytedance.librarian.Librarian;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
public class StarlightNode {
    public long LIZIZ;
    public List<StarlightNode> LIZLLL;
    public StarlightNode LJ;
    public boolean LJFF;
    public C14O0 LJI;
    public Object LJII;
    public final float[] LIZJ = new float[16];
    public long LIZ = nativeCreateSLNode();

    public float baseline(float f, float f2) {
        return 0.0f;
    }

    public native void nativeCalculateLayout(long j, float f, float f2);

    public native long nativeCreateMeasureDelegateAndSetBaselineFunc(long j);

    public native long nativeCreateMeasureDelegateAndSetMeasureFunc(long j);

    public native long nativeCreateSLNode();

    public native void nativeFreeMeasureDelegate(long j);

    public native void nativeFreeMeasureDelegateAndNode(long j, long j2);

    public native void nativeFreeNode(long j);

    public native int nativeGetAlignContent(long j);

    public native int nativeGetAlignItems(long j);

    public native int nativeGetAlignSelf(long j);

    public native float nativeGetAspectRatio(long j);

    public native int nativeGetBoxSizing(long j);

    public native int nativeGetDisplay(long j);

    public native long nativeGetFlexBasis(long j);

    public native int nativeGetFlexDirection(long j);

    public native float nativeGetFlexGrow(long j);

    public native float nativeGetFlexShrink(long j);

    public native int nativeGetFlexWrap(long j);

    public native long nativeGetGap(long j, int i);

    public native long nativeGetHeight(long j);

    public native int nativeGetJustifyContent(long j);

    public native long nativeGetMargin(long j, int i);

    public native long nativeGetMaxHeight(long j);

    public native long nativeGetMaxWidth(long j);

    public native long nativeGetMinHeight(long j);

    public native long nativeGetMinWidth(long j);

    public native long nativeGetPadding(long j, int i);

    public native long nativeGetPosition(long j, int i);

    public native int nativeGetPositionType(long j);

    public native long nativeGetWidth(long j);

    public native void nativeInsertChild(long j, long j2, int i);

    public native boolean nativeIsNodeDirty(long j);

    public native void nativeMarkDirty(long j);

    public native void nativeRemoveAllChildren(long j);

    public native void nativeRemoveChild(long j, long j2);

    public native void nativeReset(long j);

    public native void nativeSLNodeUpdateLayoutInfo(long j, float[] fArr);

    public native void nativeSetAlignContent(long j, int i);

    public native void nativeSetAlignItems(long j, int i);

    public native void nativeSetAlignSelf(long j, int i);

    public native void nativeSetAspectRatio(long j, float f);

    public native void nativeSetBaselineFunction(long j);

    public native void nativeSetBorder(long j, int i, float f);

    public native void nativeSetBoxSizing(long j, int i);

    public native void nativeSetDirection(long j, int i);

    public native void nativeSetDisplay(long j, int i);

    public native void nativeSetFlex(long j, float f);

    public native void nativeSetFlexBasis(long j, float f);

    public native void nativeSetFlexBasisAuto(long j);

    public native void nativeSetFlexBasisPercent(long j, float f);

    public native void nativeSetFlexDirection(long j, int i);

    public native void nativeSetFlexGrow(long j, float f);

    public native void nativeSetFlexShrink(long j, float f);

    public native void nativeSetFlexWrap(long j, int i);

    public native void nativeSetGap(long j, int i, float f);

    public native void nativeSetGapPercent(long j, int i, float f);

    public native void nativeSetHeight(long j, float f);

    public native void nativeSetHeightAuto(long j);

    public native void nativeSetHeightFitContent(long j);

    public native void nativeSetHeightMaxContent(long j);

    public native void nativeSetHeightPercent(long j, float f);

    public native void nativeSetJustifyContent(long j, int i);

    public native void nativeSetMargin(long j, int i, float f);

    public native void nativeSetMarginAuto(long j, int i);

    public native void nativeSetMarginPercent(long j, int i, float f);

    public native void nativeSetMaxHeight(long j, float f);

    public native void nativeSetMaxHeightPercent(long j, float f);

    public native void nativeSetMaxWidth(long j, float f);

    public native void nativeSetMaxWidthPercent(long j, float f);

    public native void nativeSetMeasureFunction(long j);

    public native void nativeSetMinHeight(long j, float f);

    public native void nativeSetMinHeightPercent(long j, float f);

    public native void nativeSetMinWidth(long j, float f);

    public native void nativeSetMinWidthPercent(long j, float f);

    public native void nativeSetPadding(long j, int i, float f);

    public native void nativeSetPaddingPercent(long j, int i, float f);

    public native void nativeSetPosition(long j, int i, float f);

    public native void nativeSetPositionAuto(long j, int i);

    public native void nativeSetPositionPercent(long j, int i, float f);

    public native void nativeSetPositionType(long j, int i);

    public native void nativeSetWidth(long j, float f);

    public native void nativeSetWidthAuto(long j);

    public native void nativeSetWidthFitContent(long j);

    public native void nativeSetWidthMaxContent(long j);

    public native void nativeSetWidthPercent(long j, float f);

    static {
        LoadSoLancet.LIZJ("lynxstarlight");
        long jUptimeMillis = SystemClock.uptimeMillis();
        Librarian.LJFF("lynxstarlight");
        LoadSoLancet.LJ(jUptimeMillis, "lynxstarlight");
        LoadSoLancet.LIZLLL(jUptimeMillis, "lynxstarlight");
        LoadSoLancet.LIZIZ("lynxstarlight");
    }

    public final void LIZ() {
        if (this.LIZLLL != null) {
            for (int i = 0; i < ((ArrayList) this.LIZLLL).size(); i++) {
                ((StarlightNode) ListProtector.get(this.LIZLLL, i)).LIZ();
            }
        }
        LIZIZ();
    }

    public final void LIZIZ() {
        long j = this.LIZIZ;
        if (j != 0) {
            long j2 = this.LIZ;
            this.LIZIZ = 0L;
            this.LIZ = 0L;
            nativeFreeMeasureDelegateAndNode(j2, j);
            return;
        }
        long j3 = this.LIZ;
        if (j3 != 0) {
            this.LIZ = 0L;
            nativeFreeNode(j3);
        }
    }

    public final void finalize() throws Throwable {
        try {
            LIZIZ();
            super.finalize();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            super.finalize();
            throw th;
        }
    }

    public final void LIZJ(float[] fArr) {
        nativeSLNodeUpdateLayoutInfo(this.LIZ, fArr);
        List<StarlightNode> list = this.LIZLLL;
        if (list != null && ((ArrayList) list).size() > 0) {
            for (int i = 0; i < ((ArrayList) this.LIZLLL).size(); i++) {
                ((StarlightNode) ListProtector.get(this.LIZLLL, i)).LIZJ(((StarlightNode) ListProtector.get(this.LIZLLL, i)).LIZJ);
            }
        }
    }

    public long measure(float f, int i, float f2, int i2) {
        C14O3 c14o3;
        C14O3 c14o32;
        C14O0 c14o0 = this.LJI;
        if (c14o0 != null) {
            C14O3.Companion.getClass();
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        c14o3 = C14O3.AT_MOST;
                    } else {
                        throw new IllegalArgumentException("Unknown measureMode");
                    }
                } else {
                    c14o3 = C14O3.EXACTLY;
                }
            } else {
                c14o3 = C14O3.UNDEFINED;
            }
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        c14o32 = C14O3.AT_MOST;
                    } else {
                        throw new IllegalArgumentException("Unknown measureMode");
                    }
                } else {
                    c14o32 = C14O3.EXACTLY;
                }
            } else {
                c14o32 = C14O3.UNDEFINED;
            }
            return c14o0.LIZ(this, f, c14o3, f2, c14o32);
        }
        return 0L;
    }
}
