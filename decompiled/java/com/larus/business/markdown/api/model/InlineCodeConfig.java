package com.larus.business.markdown.api.model;

/* JADX INFO: loaded from: classes7.dex */
public final class InlineCodeConfig {
    public final int maxWidth;
    public final int paddingBottom;
    public final int paddingEnd;
    public final int paddingStart;
    public final int paddingTop;

    public InlineCodeConfig() {
        this(0, 0, 0, 0, 0);
    }

    public int hashCode() {
        return (((((((this.paddingStart * 31) + this.paddingEnd) * 31) + this.paddingTop) * 31) + this.paddingBottom) * 31) + this.maxWidth;
    }

    public InlineCodeConfig(int i, int i2, int i3, int i4, int i5) {
        this.paddingStart = i;
        this.paddingEnd = i2;
        this.paddingTop = i3;
        this.paddingBottom = i4;
        this.maxWidth = i5;
    }
}
