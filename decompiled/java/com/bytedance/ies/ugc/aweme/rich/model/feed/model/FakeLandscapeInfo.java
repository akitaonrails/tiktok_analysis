package com.bytedance.ies.ugc.aweme.rich.model.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public class FakeLandscapeInfo implements Serializable {

    @C09CT("bottom")
    public float bottom;

    @C09CT("fake_landscape_video_type")
    public int fakeLandscapeVideoType;

    @C09CT("left")
    public float left;

    @C09CT("right")
    public float right;

    @C09CT("top")
    public float top;

    public boolean isValid() {
        return this.left >= 0.0f && this.right >= 0.0f && this.bottom >= 0.0f && this.top >= 0.0f;
    }

    public float getBottom() {
        return this.bottom;
    }

    public int getFakeLandscapeVideoType() {
        return this.fakeLandscapeVideoType;
    }

    public float getLeft() {
        return this.left;
    }

    public float getRight() {
        return this.right;
    }

    public float getTop() {
        return this.top;
    }

    public void setBottom(float f) {
        this.bottom = f;
    }

    public void setFakeLandscapeVideoType(int i) {
        this.fakeLandscapeVideoType = i;
    }

    public void setLeft(float f) {
        this.left = f;
    }

    public void setRight(float f) {
        this.right = f;
    }

    public void setTop(float f) {
        this.top = f;
    }
}
