package com.ss.android.ugc.aweme.feed.model.cardinsert;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class ShaderViewShape implements Serializable {

    @C09CT("complex")
    public String complex;

    @C09CT("morph")
    public String morph;

    @C09CT("position")
    public ShaderViewPosition position;

    @C09CT("rotate")
    public String rotate;

    @C09CT("scale_x")
    public String scaleX;

    @C09CT("scale_y")
    public String scaleY;

    public ShaderViewShape() {
        this(null, "", "", "", "", "");
    }

    public final String getComplex() {
        return this.complex;
    }

    public final String getMorph() {
        return this.morph;
    }

    public final ShaderViewPosition getPosition() {
        return this.position;
    }

    public final String getRotate() {
        return this.rotate;
    }

    public final String getScaleX() {
        return this.scaleX;
    }

    public final String getScaleY() {
        return this.scaleY;
    }

    public final void setComplex(String str) {
        this.complex = str;
    }

    public final void setMorph(String str) {
        this.morph = str;
    }

    public final void setPosition(ShaderViewPosition shaderViewPosition) {
        this.position = shaderViewPosition;
    }

    public final void setRotate(String str) {
        this.rotate = str;
    }

    public final void setScaleX(String str) {
        this.scaleX = str;
    }

    public final void setScaleY(String str) {
        this.scaleY = str;
    }

    public ShaderViewShape(ShaderViewPosition shaderViewPosition, String str, String str2, String str3, String str4, String str5) {
        this.position = shaderViewPosition;
        this.scaleX = str;
        this.scaleY = str2;
        this.complex = str3;
        this.morph = str4;
        this.rotate = str5;
    }
}
