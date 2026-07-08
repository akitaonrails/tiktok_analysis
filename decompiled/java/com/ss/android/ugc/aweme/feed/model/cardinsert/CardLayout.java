package com.ss.android.ugc.aweme.feed.model.cardinsert;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class CardLayout implements Serializable {

    @C09CT("height")
    public Long height;

    @C09CT("is_dynamic")
    public Boolean isDynamic;

    @C09CT("width")
    public Long width;

    public CardLayout() {
        this(null, null, Boolean.FALSE);
    }

    public final Long getHeight() {
        return this.height;
    }

    public final Long getWidth() {
        return this.width;
    }

    public final Boolean isDynamic() {
        return this.isDynamic;
    }

    public final void setDynamic(Boolean bool) {
        this.isDynamic = bool;
    }

    public final void setHeight(Long l) {
        this.height = l;
    }

    public final void setWidth(Long l) {
        this.width = l;
    }

    public CardLayout(Long l, Long l2, Boolean bool) {
        this.height = l;
        this.width = l2;
        this.isDynamic = bool;
    }
}
