package com.ss.android.vesdk.faceinfo;

import X.C2188811AlT;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: loaded from: classes34.dex */
public class VESkeleton {
    public int ID;
    public PointF[] points;
    public RectF rect;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VESkeleton{rect=");
        sbLIZ.append(this.rect);
        sbLIZ.append(", ID=");
        sbLIZ.append(this.ID);
        sbLIZ.append(", points=");
        sbLIZ.append(Arrays.toString(this.points));
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public int getID() {
        return this.ID;
    }

    public PointF[] getPoints() {
        return this.points;
    }

    public RectF getRect() {
        return this.rect;
    }

    public void setID(int i) {
        this.ID = i;
    }

    public void setPoints(PointF[] pointFArr) {
        this.points = pointFArr;
    }

    public void setRect(RectF rectF) {
        this.rect = rectF;
    }
}
