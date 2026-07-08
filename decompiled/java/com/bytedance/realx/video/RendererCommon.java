package com.bytedance.realx.video;

import X.C08FF;
import android.graphics.Matrix;
import android.graphics.Point;
import android.view.View;
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

    public interface RendererEvents {
        void onFirstFrameRendered();

        void onFrameResolutionChanged(int i, int i2, int i3);
    }

    /* JADX INFO: renamed from: com.bytedance.realx.video.RendererCommon$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$bytedance$realx$video$RendererCommon$ScalingType;

        static {
            int[] iArr = new int[ScalingType.values().length];
            $SwitchMap$com$bytedance$realx$video$RendererCommon$ScalingType = iArr;
            try {
                iArr[ScalingType.SCALE_ASPECT_FIT.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            try {
                $SwitchMap$com$bytedance$realx$video$RendererCommon$ScalingType[ScalingType.SCALE_ASPECT_FILL.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            try {
                $SwitchMap$com$bytedance$realx$video$RendererCommon$ScalingType[ScalingType.SCALE_ASPECT_BALANCED.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
                TryCatchGuardChecker.doCheck(e3);
            }
        }
    }

    public static class VideoLayoutMeasure {
        public ScalingType scalingTypeMatchOrientation;
        public ScalingType scalingTypeMismatchOrientation;

        public VideoLayoutMeasure() {
            ScalingType scalingType = ScalingType.SCALE_ASPECT_BALANCED;
            this.scalingTypeMatchOrientation = scalingType;
            this.scalingTypeMismatchOrientation = scalingType;
        }

        public void setScalingType(ScalingType scalingType) {
            this.scalingTypeMatchOrientation = scalingType;
            this.scalingTypeMismatchOrientation = scalingType;
        }

        public void setScalingType(ScalingType scalingType, ScalingType scalingType2) {
            this.scalingTypeMatchOrientation = scalingType;
            this.scalingTypeMismatchOrientation = scalingType2;
        }

        public Point measure(int i, int i2, int i3, int i4) {
            boolean z;
            ScalingType scalingType;
            int defaultSize = View.getDefaultSize(Integer.MAX_VALUE, i);
            int defaultSize2 = View.getDefaultSize(Integer.MAX_VALUE, i2);
            if (i3 != 0 && i4 != 0 && defaultSize != 0 && defaultSize2 != 0) {
                float f = i3 / i4;
                float f2 = defaultSize / defaultSize2;
                boolean z2 = true;
                if (f > 1.0f) {
                    z = true;
                } else {
                    z = false;
                }
                if (f2 <= 1.0f) {
                    z2 = false;
                }
                if (z == z2) {
                    scalingType = this.scalingTypeMatchOrientation;
                } else {
                    scalingType = this.scalingTypeMismatchOrientation;
                }
                Point displaySize = RendererCommon.getDisplaySize(scalingType, f, defaultSize, defaultSize2);
                if (View.MeasureSpec.getMode(i) == 1073741824) {
                    displaySize.x = defaultSize;
                }
                if (View.MeasureSpec.getMode(i2) == 1073741824) {
                    displaySize.y = defaultSize2;
                }
                return displaySize;
            }
            return new Point(defaultSize, defaultSize2);
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

    public static void adjustOrigin(float[] fArr) {
        float f = fArr[12] - ((fArr[0] + fArr[4]) * 0.5f);
        fArr[12] = f;
        float f2 = fArr[13] - ((fArr[1] + fArr[5]) * 0.5f);
        fArr[13] = f2;
        fArr[12] = f + 0.5f;
        fArr[13] = f2 + 0.5f;
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
        int i = AnonymousClass1.$SwitchMap$com$bytedance$realx$video$RendererCommon$ScalingType[scalingType.ordinal()];
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

    public static float[] getLayoutMatrix(boolean z, float f, float f2) {
        float f3;
        float f4;
        if (f2 > f) {
            f4 = f / f2;
            f3 = 1.0f;
        } else {
            f3 = f2 / f;
            f4 = 1.0f;
        }
        if (z) {
            f3 *= -1.0f;
        }
        float[] fArr = new float[16];
        android.opengl.Matrix.setIdentityM(fArr, 0);
        android.opengl.Matrix.scaleM(fArr, 0, f3, f4, 1.0f);
        adjustOrigin(fArr);
        return fArr;
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
