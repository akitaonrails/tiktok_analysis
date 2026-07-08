package com.ss.android.ugc.aweme.feed.model.cardinsert;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class ShaderViewInfo implements Serializable {

    @C09CT("animation")
    public ShaderViewAnimation animation;

    @C09CT("color")
    public ShaderViewColor color;

    @C09CT("shape")
    public ShaderViewShape shape;

    @C09CT("type")
    public Integer type;

    public ShaderViewInfo() {
        this(null, null, null, 0);
    }

    public final ShaderViewAnimation getAnimation() {
        return this.animation;
    }

    public final ShaderViewColor getColor() {
        return this.color;
    }

    public final ShaderViewShape getShape() {
        return this.shape;
    }

    public final Integer getType() {
        return this.type;
    }

    public final void setAnimation(ShaderViewAnimation shaderViewAnimation) {
        this.animation = shaderViewAnimation;
    }

    public final void setColor(ShaderViewColor shaderViewColor) {
        this.color = shaderViewColor;
    }

    public final void setShape(ShaderViewShape shaderViewShape) {
        this.shape = shaderViewShape;
    }

    public final void setType(Integer num) {
        this.type = num;
    }

    public ShaderViewInfo(ShaderViewAnimation shaderViewAnimation, ShaderViewColor shaderViewColor, ShaderViewShape shaderViewShape, Integer num) {
        this.animation = shaderViewAnimation;
        this.color = shaderViewColor;
        this.shape = shaderViewShape;
        this.type = num;
    }
}
