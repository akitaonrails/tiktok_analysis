package com.ss.android.ugc.aweme.live.livehostimpl.livereply.quickpost.data;

import java.io.Serializable;

/* JADX INFO: loaded from: classes28.dex */
public final class TextStickerConfigLocal implements Serializable {
    public static final int $stable = 8;
    public double centerX;
    public double centerY;
    public String text;

    public TextStickerConfigLocal() {
        this(0.5d, 0.5d, "");
    }

    public final double getCenterX() {
        return this.centerX;
    }

    public final double getCenterY() {
        return this.centerY;
    }

    public final String getText() {
        return this.text;
    }

    public final void setCenterX(double d) {
        this.centerX = d;
    }

    public final void setCenterY(double d) {
        this.centerY = d;
    }

    public final void setText(String str) {
        this.text = str;
    }

    public TextStickerConfigLocal(double d, double d2, String str) {
        this.centerX = d;
        this.centerY = d2;
        this.text = str;
    }
}
