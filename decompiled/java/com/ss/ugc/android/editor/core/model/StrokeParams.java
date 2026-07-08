package com.ss.ugc.android.editor.core.model;

import X.C09CT;
import X.C2188811AlT;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class StrokeParams {

    @C09CT("effects_adjust_alpha")
    public final Float alpha;

    @C09CT("matting_stroke_adjust_color")
    public final float[] color;

    @C09CT("effects_adjust_distance")
    public final Float distance;

    @C09CT("effects_adjust_horizontal_shift")
    public final Float horizontalShift;

    @C09CT("effects_adjust_size")
    public final Float size;

    @C09CT("effects_adjust_texture")
    public final Float texture;

    @C09CT("effects_adjust_vertical_shift")
    public final Float verticalShift;

    public StrokeParams() {
        this(null, null, null, null, null, null, null);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StrokeParams(color=");
        sbLIZ.append(Arrays.toString(this.color));
        sbLIZ.append(", size=");
        sbLIZ.append(this.size);
        sbLIZ.append(", distance=");
        sbLIZ.append(this.distance);
        sbLIZ.append(", alpha=");
        sbLIZ.append(this.alpha);
        sbLIZ.append(", horizontalShift=");
        sbLIZ.append(this.horizontalShift);
        sbLIZ.append(", verticalShift=");
        sbLIZ.append(this.verticalShift);
        sbLIZ.append(", texture=");
        sbLIZ.append(this.texture);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        Float f = this.size;
        int iHashCode = (f != null ? f.hashCode() : 0) * 31;
        Float f2 = this.distance;
        int iHashCode2 = (iHashCode + (f2 != null ? f2.hashCode() : 0)) * 31;
        Float f3 = this.alpha;
        int iHashCode3 = (iHashCode2 + (f3 != null ? f3.hashCode() : 0)) * 31;
        Float f4 = this.horizontalShift;
        int iHashCode4 = (iHashCode3 + (f4 != null ? f4.hashCode() : 0)) * 31;
        Float f5 = this.verticalShift;
        int iHashCode5 = (iHashCode4 + (f5 != null ? f5.hashCode() : 0)) * 31;
        Float f6 = this.texture;
        int iHashCode6 = (iHashCode5 + (f6 != null ? f6.hashCode() : 0)) * 31;
        float[] fArr = this.color;
        return iHashCode6 + (fArr != null ? Arrays.hashCode(fArr) : 0);
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.LJFF(StrokeParams.class, cls)) {
            return false;
        }
        StrokeParams strokeParams = (StrokeParams) obj;
        if (Intrinsics.LJ(this.size, strokeParams.size) && Intrinsics.LJ(this.distance, strokeParams.distance) && Intrinsics.LJ(this.alpha, strokeParams.alpha) && Intrinsics.LJ(this.horizontalShift, strokeParams.horizontalShift) && Intrinsics.LJ(this.verticalShift, strokeParams.verticalShift) && Intrinsics.LJ(this.texture, strokeParams.texture) && Arrays.equals(this.color, strokeParams.color)) {
            return true;
        }
        return false;
    }

    public StrokeParams(float[] fArr, Float f, Float f2, Float f3, Float f4, Float f5, Float f6) {
        this.color = fArr;
        this.size = f;
        this.distance = f2;
        this.alpha = f3;
        this.horizontalShift = f4;
        this.verticalShift = f5;
        this.texture = f6;
    }

    public static StrokeParams LIZ(StrokeParams strokeParams, float[] fArr, Float f, Float f2, Float f3, Float f4, Float f5, Float f6, int i) {
        Float f7 = f6;
        Float f8 = f5;
        Float f9 = f4;
        Float f10 = f3;
        Float f11 = f2;
        Float f12 = f;
        float[] fArr2 = fArr;
        if ((i & 1) != 0) {
            fArr2 = strokeParams.color;
        }
        if ((i & 2) != 0) {
            f12 = strokeParams.size;
        }
        if ((i & 4) != 0) {
            f11 = strokeParams.distance;
        }
        if ((i & 8) != 0) {
            f10 = strokeParams.alpha;
        }
        if ((i & 16) != 0) {
            f9 = strokeParams.horizontalShift;
        }
        if ((i & 32) != 0) {
            f8 = strokeParams.verticalShift;
        }
        if ((i & 64) != 0) {
            f7 = strokeParams.texture;
        }
        return new StrokeParams(fArr2, f12, f11, f10, f9, f8, f7);
    }
}
