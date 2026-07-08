package com.bytedance.codecx.video;

import X.C08FF;
import android.graphics.Matrix;
import android.graphics.Point;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes21.dex */
public class RendererCommon {
    public static float BALANCED_VISIBLE_FRACTION = 0.5625f;

    public interface GlDrawer {
        void drawOes(int i, float[] fArr, int i2, int i3, int i4, int i5, int i6, int i7);

        void drawOes(int i, float[] fArr, int i2, int i3, int i4, int i5, int i6, int i7, FilterType filterType, int i8, int i9);

        void drawOes(int i, float[] fArr, int i2, int i3, int i4, int i5, int i6, int i7, FilterType filterType, int i8, int i9, int i10, int i11);

        void drawRgb(int i, float[] fArr, int i2, int i3, int i4, int i5, int i6, int i7);

        void drawRgb(int i, float[] fArr, int i2, int i3, int i4, int i5, int i6, int i7, FilterType filterType, int i8, int i9);

        void drawRgb(int i, float[] fArr, int i2, int i3, int i4, int i5, int i6, int i7, FilterType filterType, int i8, int i9, int i10, int i11);

        void drawYuv(int[] iArr, float[] fArr, int i, int i2, int i3, int i4, int i5, int i6);

        void drawYuv(int[] iArr, float[] fArr, int i, int i2, int i3, int i4, int i5, int i6, FilterType filterType, int i7, int i8);

        void drawYuv(int[] iArr, float[] fArr, int i, int i2, int i3, int i4, int i5, int i6, FilterType filterType, int i7, int i8, int i9, int i10);

        void release();
    }

    /* JADX INFO: renamed from: com.bytedance.codecx.video.RendererCommon$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$bytedance$codecx$video$RendererCommon$ScalingType;

        static {
            int[] iArr = new int[ScalingType.values().length];
            $SwitchMap$com$bytedance$codecx$video$RendererCommon$ScalingType = iArr;
            try {
                iArr[ScalingType.SCALE_ASPECT_FIT.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                $SwitchMap$com$bytedance$codecx$video$RendererCommon$ScalingType[ScalingType.SCALE_ASPECT_FILL.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            try {
                $SwitchMap$com$bytedance$codecx$video$RendererCommon$ScalingType[ScalingType.SCALE_ASPECT_BALANCED.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
        }
    }

    public enum ScalingType {
        SCALE_ASPECT_FIT,
        SCALE_ASPECT_FILL,
        SCALE_ASPECT_BALANCED;

        public static ScalingType valueOf(String str) {
            return (ScalingType) C08FF.LIZ(ScalingType.class, str);
        }
    }

    public static float[] convertMatrixFromAndroidGraphicsMatrix(Matrix matrix) {
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        return new float[]{fArr[0], fArr[3], 0.0f, fArr[6], fArr[1], fArr[4], 0.0f, fArr[7], 0.0f, 0.0f, 1.0f, 0.0f, fArr[2], fArr[5], 0.0f, fArr[8]};
    }

    public static Matrix convertMatrixToAndroidGraphicsMatrix(float[] fArr) {
        float[] fArr2 = {fArr[0], fArr[4], fArr[12], fArr[1], fArr[5], fArr[13], fArr[3], fArr[7], fArr[15]};
        Matrix matrix = new Matrix();
        matrix.setValues(fArr2);
        return matrix;
    }

    public static float convertScalingTypeToVisibleFraction(ScalingType scalingType) {
        int i = AnonymousClass1.$SwitchMap$com$bytedance$codecx$video$RendererCommon$ScalingType[scalingType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return BALANCED_VISIBLE_FRACTION;
                }
                throw new IllegalArgumentException();
            }
            return 0.0f;
        }
        return 1.0f;
    }

    public static Point getDisplaySize(float f, float f2, int i, int i2) {
        if (f != 0.0f && f2 != 0.0f) {
            return new Point(Math.min(i, Math.round((i2 / f) * f2)), Math.min(i2, Math.round((i / f) / f2)));
        }
        return new Point(i, i2);
    }

    public static Point getDisplaySize(ScalingType scalingType, float f, int i, int i2) {
        return getDisplaySize(convertScalingTypeToVisibleFraction(scalingType), f, i, i2);
    }
}
