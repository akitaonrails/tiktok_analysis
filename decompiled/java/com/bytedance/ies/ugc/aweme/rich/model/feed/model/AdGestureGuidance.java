package com.bytedance.ies.ugc.aweme.rich.model.feed.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class AdGestureGuidance implements Serializable {

    @C09CT("height")
    public float height;

    @C09CT("image")
    public UrlModel image;

    @C09CT("position_x")
    public float positionX;

    @C09CT("position_y")
    public float positionY;

    @C09CT("show_time")
    public float showTime;

    @C09CT("width")
    public float width;

    public AdGestureGuidance() {
        this(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null);
    }

    public final void setHeight(float f) {
        this.height = f;
    }

    public final void setImage(UrlModel urlModel) {
        this.image = urlModel;
    }

    public final void setPositionX(float f) {
        this.positionX = f;
    }

    public final void setPositionY(float f) {
        this.positionY = f;
    }

    public final void setShowTime(float f) {
        this.showTime = f;
    }

    public final void setWidth(float f) {
        this.width = f;
    }

    public AdGestureGuidance(float f, float f2, float f3, float f4, float f5, UrlModel urlModel) {
        this.showTime = f;
        this.positionX = f2;
        this.positionY = f3;
        this.width = f4;
        this.height = f5;
        this.image = urlModel;
    }
}
