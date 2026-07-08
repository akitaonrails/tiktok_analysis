package com.larus.business.markdown.api.model;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes33.dex */
public final class TaskListConfig {
    public final Drawable selectedDrawable;
    public final int textMargin;
    public final Drawable unselectedDrawable;

    public int hashCode() {
        return (((this.selectedDrawable.hashCode() * 31) + this.unselectedDrawable.hashCode()) * 31) + this.textMargin;
    }

    public TaskListConfig(Drawable drawable, Drawable drawable2, int i) {
        this.selectedDrawable = drawable;
        this.unselectedDrawable = drawable2;
        this.textMargin = i;
    }
}
