package com.ss.ugc.android.editor.core.model;

import X.C08G1;
import X.C09CT;
import X.C2188811AlT;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class CutoutBrushParams {
    public static final /* synthetic */ int LIZ = 0;

    @C09CT("base_resolution")
    public int baseResolution;

    @C09CT("brush_color")
    public final List<Float> brushColor;

    @C09CT("brush_hardness")
    public final float brushHardness;

    @C09CT("brush_size")
    public final float brushSize;

    @C09CT("canvas_height")
    public int canvasHeight;

    @C09CT("canvas_width")
    public int canvasWidth;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CutoutBrushParams)) {
            return false;
        }
        CutoutBrushParams cutoutBrushParams = (CutoutBrushParams) obj;
        return this.canvasWidth == cutoutBrushParams.canvasWidth && this.canvasHeight == cutoutBrushParams.canvasHeight && Intrinsics.LJFF(this.brushColor, cutoutBrushParams.brushColor) && Float.compare(this.brushSize, cutoutBrushParams.brushSize) == 0 && Float.compare(this.brushHardness, cutoutBrushParams.brushHardness) == 0 && this.baseResolution == cutoutBrushParams.baseResolution;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CutoutBrushParams(canvasWidth=");
        sbLIZ.append(this.canvasWidth);
        sbLIZ.append(", canvasHeight=");
        sbLIZ.append(this.canvasHeight);
        sbLIZ.append(", brushColor=");
        sbLIZ.append(this.brushColor);
        sbLIZ.append(", brushSize=");
        sbLIZ.append(this.brushSize);
        sbLIZ.append(", brushHardness=");
        sbLIZ.append(this.brushHardness);
        sbLIZ.append(", baseResolution=");
        sbLIZ.append(this.baseResolution);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public CutoutBrushParams() {
        this(0, 0, C08G1.LIZ("#0BE09B"), 0.046464648f, 1.0f, 0);
    }

    public final String LIZ() {
        return GsonProtectorUtils.toJson(new Gson(), this);
    }

    public final int hashCode() {
        return (((((((((this.canvasWidth * 31) + this.canvasHeight) * 31) + this.brushColor.hashCode()) * 31) + Float.floatToIntBits(this.brushSize)) * 31) + Float.floatToIntBits(this.brushHardness)) * 31) + this.baseResolution;
    }

    public CutoutBrushParams(int i, int i2, List<Float> list, float f, float f2, int i3) {
        this.canvasWidth = i;
        this.canvasHeight = i2;
        this.brushColor = list;
        this.brushSize = f;
        this.brushHardness = f2;
        this.baseResolution = i3;
    }
}
