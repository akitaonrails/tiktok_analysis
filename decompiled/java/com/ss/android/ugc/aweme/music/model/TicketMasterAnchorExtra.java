package com.ss.android.ugc.aweme.music.model;

import X.C09CT;

/* JADX INFO: loaded from: classes17.dex */
public final class TicketMasterAnchorExtra {

    @C09CT("location_type")
    public final String locationType;

    @C09CT("sub_title")
    public final String subTitle;

    @C09CT("tm_item_type")
    public final String tmItemType;

    public TicketMasterAnchorExtra() {
        this("", "", "");
    }

    public final String getLocationType() {
        return this.locationType;
    }

    public final String getSubTitle() {
        return this.subTitle;
    }

    public final String getTmItemType() {
        return this.tmItemType;
    }

    public TicketMasterAnchorExtra(String str, String str2, String str3) {
        this.subTitle = str;
        this.tmItemType = str2;
        this.locationType = str3;
    }
}
