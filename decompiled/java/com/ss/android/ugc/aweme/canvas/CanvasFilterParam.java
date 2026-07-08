package com.ss.android.ugc.aweme.canvas;

import X.C0MO8;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.Pair;

/* JADX INFO: loaded from: classes9.dex */
public final class CanvasFilterParam implements Serializable {
    public static final C0MO8 Companion = new Object() { // from class: X.0MO8
    };
    public int animEndTime;
    public String animJsonParam;
    public String animPath;
    public int animStartTime;
    public float degree;
    public String effectId;
    public Pair<Float, Float> leftTopPoint;
    public int nickNameStyle;
    public Pair<Float, Float> rightBottomPoint;
    public float transX;
    public float transY;
    public int transformType;
    public float volume;
    public int clipIndex = -2;
    public float scaleFactor = 1.0f;
    public int borderColor = -1;
    public int borderWidthPx = -2;

    public static /* synthetic */ void getTransformType$annotations() {
    }

    public final boolean isValid() {
        return this.clipIndex != -2;
    }

    public CanvasFilterParam() {
        Float fValueOf = Float.valueOf(-2.0f);
        this.leftTopPoint = new Pair<>(fValueOf, fValueOf);
        this.rightBottomPoint = new Pair<>(fValueOf, fValueOf);
        this.volume = -2.0f;
        this.transformType = 2;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CanvasFilterParam");
        sbLIZ.append('#');
        sbLIZ.append(hashCode());
        sbLIZ.append(",degree:");
        sbLIZ.append(this.degree);
        sbLIZ.append(",transX:");
        sbLIZ.append(this.transX);
        sbLIZ.append(",transY:");
        sbLIZ.append(this.transY);
        sbLIZ.append(",scale:");
        sbLIZ.append(this.scaleFactor);
        sbLIZ.append(",effectId:");
        sbLIZ.append(this.effectId);
        sbLIZ.append(",animatePath:");
        sbLIZ.append(this.animPath);
        sbLIZ.append(",animJson:");
        sbLIZ.append(this.animJsonParam);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int getAnimEndTime() {
        return this.animEndTime;
    }

    public final String getAnimJsonParam() {
        return this.animJsonParam;
    }

    public final String getAnimPath() {
        return this.animPath;
    }

    public final int getAnimStartTime() {
        return this.animStartTime;
    }

    public final int getBorderColor() {
        return this.borderColor;
    }

    public final int getBorderWidthPx() {
        return this.borderWidthPx;
    }

    public final int getClipIndex() {
        return this.clipIndex;
    }

    public final float getDegree() {
        return this.degree;
    }

    public final String getEffectId() {
        return this.effectId;
    }

    public final Pair<Float, Float> getLeftTopPoint() {
        return this.leftTopPoint;
    }

    public final int getNickNameStyle() {
        return this.nickNameStyle;
    }

    public final Pair<Float, Float> getRightBottomPoint() {
        return this.rightBottomPoint;
    }

    public final float getScaleFactor() {
        return this.scaleFactor;
    }

    public final float getTransX() {
        return this.transX;
    }

    public final float getTransY() {
        return this.transY;
    }

    public final int getTransformType() {
        return this.transformType;
    }

    public final float getVolume() {
        return this.volume;
    }

    public final CanvasFilterParam copyBasic(CanvasFilterParam canvasFilterParam) {
        this.transX = canvasFilterParam.transX;
        this.transY = canvasFilterParam.transY;
        this.scaleFactor = canvasFilterParam.scaleFactor;
        this.degree = canvasFilterParam.degree;
        return this;
    }

    public final void setAnimEndTime(int i) {
        this.animEndTime = i;
    }

    public final void setAnimJsonParam(String str) {
        this.animJsonParam = str;
    }

    public final void setAnimPath(String str) {
        this.animPath = str;
    }

    public final void setAnimStartTime(int i) {
        this.animStartTime = i;
    }

    public final void setBorderColor(int i) {
        this.borderColor = i;
    }

    public final void setBorderWidthPx(int i) {
        this.borderWidthPx = i;
    }

    public final void setClipIndex(int i) {
        this.clipIndex = i;
    }

    public final void setDegree(float f) {
        this.degree = f;
    }

    public final void setEffectId(String str) {
        this.effectId = str;
    }

    public final void setLeftTopPoint(Pair<Float, Float> pair) {
        this.leftTopPoint = pair;
    }

    public final void setNickNameStyle(int i) {
        this.nickNameStyle = i;
    }

    public final void setRightBottomPoint(Pair<Float, Float> pair) {
        this.rightBottomPoint = pair;
    }

    public final void setScaleFactor(float f) {
        this.scaleFactor = f;
    }

    public final void setTransX(float f) {
        this.transX = f;
    }

    public final void setTransY(float f) {
        this.transY = f;
    }

    public final void setTransformType(int i) {
        this.transformType = i;
    }

    public final void setVolume(float f) {
        this.volume = f;
    }
}
