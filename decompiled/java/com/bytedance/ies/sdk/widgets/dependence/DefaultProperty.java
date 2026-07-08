package com.bytedance.ies.sdk.widgets.dependence;

/* JADX INFO: loaded from: classes18.dex */
public class DefaultProperty {
    public final float alpha;
    public final float scaleX;
    public final float scaleY;
    public final float translationX;
    public final float translationY;
    public final int visibility;

    public static class Builder {
        public float alpha = 1.0f;
        public float scaleX = 1.0f;
        public float scaleY = 1.0f;
        public float translationX;
        public float translationY;
        public int visibility;

        public DefaultProperty build() {
            return new DefaultProperty(this);
        }

        public Builder setAlpha(float f) {
            this.alpha = f;
            return this;
        }

        public Builder setScaleX(float f) {
            this.scaleX = f;
            return this;
        }

        public Builder setScaleY(float f) {
            this.scaleY = f;
            return this;
        }

        public Builder setTranslationX(float f) {
            this.translationX = f;
            return this;
        }

        public Builder setTranslationY(float f) {
            this.translationY = f;
            return this;
        }

        public Builder setVisibility(int i) {
            this.visibility = i;
            return this;
        }
    }

    public DefaultProperty(Builder builder) {
        this.alpha = builder.alpha;
        this.translationX = builder.translationX;
        this.translationY = builder.translationY;
        this.scaleX = builder.scaleX;
        this.scaleY = builder.scaleY;
        this.visibility = builder.visibility;
    }
}
