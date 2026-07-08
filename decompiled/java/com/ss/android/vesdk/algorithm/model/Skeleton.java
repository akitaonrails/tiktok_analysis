package com.ss.android.vesdk.algorithm.model;

import android.graphics.PointF;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes36.dex */
public class Skeleton {
    public int ID;
    public PointF[] points;
    public RectF rect;

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
