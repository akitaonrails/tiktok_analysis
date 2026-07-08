package com.bytedance.touchpoint.api.model;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class ProfileActivityButton {

    @C09CT("activity_id")
    public String activityId;

    @C09CT("icon")
    public String icon;

    @C09CT("jump_link")
    public String jumpLink;

    @C09CT("name")
    public String name;

    public ProfileActivityButton(String str, String str2, String str3, String str4) {
        this.icon = str;
        this.activityId = str2;
        this.name = str3;
        this.jumpLink = str4;
    }
}
