package com.ss.ugc.android.editor.core.model;

import X.C08G1;
import X.C09CT;
import X.C1697810uHb;
import X.C2188811AlT;
import X.C786410Ut5;
import android.content.res.Resources;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class CircleParams {

    @C09CT("canvas_height")
    public int canvasHeight;

    @C09CT("canvas_width")
    public int canvasWidth;

    @C09CT("stroke_circle_color")
    public final List<Float> strokeCircleColor;

    @C09CT("stroke_circle_diameter")
    public float strokeCircleDiameter;

    @C09CT("stroke_circle_pos")
    public List<Float> strokeCirclePos;

    @C09CT("stroke_circle_visible")
    public boolean strokeCircleVisible;

    @C09CT("stroke_circle_width")
    public float strokeCircleWidth;

    public CircleParams() {
        this(0, 0, false, 0.0f, 0.0f, null, null, 127, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CircleParams)) {
            return false;
        }
        CircleParams circleParams = (CircleParams) obj;
        return this.canvasWidth == circleParams.canvasWidth && this.canvasHeight == circleParams.canvasHeight && this.strokeCircleVisible == circleParams.strokeCircleVisible && Float.compare(this.strokeCircleDiameter, circleParams.strokeCircleDiameter) == 0 && Float.compare(this.strokeCircleWidth, circleParams.strokeCircleWidth) == 0 && Intrinsics.LJFF(this.strokeCircleColor, circleParams.strokeCircleColor) && Intrinsics.LJFF(this.strokeCirclePos, circleParams.strokeCirclePos);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CircleParams(canvasWidth=");
        sbLIZ.append(this.canvasWidth);
        sbLIZ.append(", canvasHeight=");
        sbLIZ.append(this.canvasHeight);
        sbLIZ.append(", strokeCircleVisible=");
        sbLIZ.append(this.strokeCircleVisible);
        sbLIZ.append(", strokeCircleDiameter=");
        sbLIZ.append(this.strokeCircleDiameter);
        sbLIZ.append(", strokeCircleWidth=");
        sbLIZ.append(this.strokeCircleWidth);
        sbLIZ.append(", strokeCircleColor=");
        sbLIZ.append(this.strokeCircleColor);
        sbLIZ.append(", strokeCirclePos=");
        sbLIZ.append(this.strokeCirclePos);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (((((((((((this.canvasWidth * 31) + this.canvasHeight) * 31) + C786410Ut5.Z2(this.strokeCircleVisible)) * 31) + Float.floatToIntBits(this.strokeCircleDiameter)) * 31) + Float.floatToIntBits(this.strokeCircleWidth)) * 31) + this.strokeCircleColor.hashCode()) * 31) + this.strokeCirclePos.hashCode();
    }

    public CircleParams(int i, int i2, boolean z, float f, float f2, List<Float> list, List<Float> list2) {
        this.canvasWidth = i;
        this.canvasHeight = i2;
        this.strokeCircleVisible = z;
        this.strokeCircleDiameter = f;
        this.strokeCircleWidth = f2;
        this.strokeCircleColor = list;
        this.strokeCirclePos = list2;
    }

    public CircleParams(int i, int i2, boolean z, float f, float f2, List list, List list2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? true : z, (i3 & 8) != 0 ? 0.046464648f : f, (i3 & 16) != 0 ? (10 / Resources.getSystem().getDisplayMetrics().density) + 0.5f : f2, (i3 & 32) != 0 ? C08G1.LIZ("#0BE09B") : list, (i3 & 64) != 0 ? C1697810uHb.LJIIJJI(Float.valueOf(0.0f), Float.valueOf(-0.1f)) : list2);
    }
}
