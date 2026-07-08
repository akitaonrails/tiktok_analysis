package com.ss.android.ugc.aweme.ad.utils;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes.dex */
public final class ViewWrapper {
    public static final int $stable = 8;
    public final View view;

    public final int getHeight() {
        return this.view.getLayoutParams().height;
    }

    public final ViewGroup.MarginLayoutParams getMarginLayoutParams() {
        return this.view.getParent() instanceof FrameLayout ? (ViewGroup.MarginLayoutParams) this.view.getLayoutParams() : (ViewGroup.MarginLayoutParams) this.view.getLayoutParams();
    }

    public final int getWidth() {
        return this.view.getLayoutParams().width;
    }

    public final View getView() {
        return this.view;
    }

    public ViewWrapper(View view) {
        this.view = view;
    }

    public final void setHeight(int i) {
        this.view.getLayoutParams().height = i;
        this.view.requestLayout();
    }

    public final void setWidth(int i) {
        this.view.getLayoutParams().width = i;
        this.view.requestLayout();
    }
}
