package com.ss.android.ugc.aweme.profile.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public final class LiveRoomCropInfoStruct implements Serializable {

    @C09CT("width")
    public Long width = 0L;

    @C09CT("height")
    public Long height = 0L;

    @C09CT("x1")
    public Long x1 = 0L;

    @C09CT("y1")
    public Long y1 = 0L;

    @C09CT("x2")
    public Long x2 = 0L;

    @C09CT("y2")
    public Long y2 = 0L;

    public final Long getHeight() {
        return this.height;
    }

    public final Long getWidth() {
        return this.width;
    }

    public final Long getX1() {
        return this.x1;
    }

    public final Long getX2() {
        return this.x2;
    }

    public final Long getY1() {
        return this.y1;
    }

    public final Long getY2() {
        return this.y2;
    }

    public final void setHeight(Long l) {
        this.height = l;
    }

    public final void setWidth(Long l) {
        this.width = l;
    }

    public final void setX1(Long l) {
        this.x1 = l;
    }

    public final void setX2(Long l) {
        this.x2 = l;
    }

    public final void setY1(Long l) {
        this.y1 = l;
    }

    public final void setY2(Long l) {
        this.y2 = l;
    }
}
