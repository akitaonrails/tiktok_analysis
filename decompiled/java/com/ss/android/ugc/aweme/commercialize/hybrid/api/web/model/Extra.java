package com.ss.android.ugc.aweme.commercialize.hybrid.api.web.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class Extra implements Serializable {

    @C09CT("anchor_type")
    public final Integer anchorType;

    @C09CT("enter_from")
    public final String enterFrom;

    @C09CT("map_anchor_extra")
    public final String mapAnchorExtra;

    public Extra() {
        this(null, null, null);
    }

    public final Integer getAnchorType() {
        return this.anchorType;
    }

    public final String getEnterFrom() {
        return this.enterFrom;
    }

    public final String getMapAnchorExtra() {
        return this.mapAnchorExtra;
    }

    public Extra(String str, Integer num, String str2) {
        this.enterFrom = str;
        this.anchorType = num;
        this.mapAnchorExtra = str2;
    }
}
