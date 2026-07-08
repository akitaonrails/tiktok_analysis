package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public class UgProfileActivityIcon {

    @C09CT("icon_url")
    public UrlModel iconUrl;

    @C09CT("profile_activity_button_list")
    public List<UgProfileActivityButton> profileActivityButtonList;

    public UrlModel getIconUrl() {
        return this.iconUrl;
    }

    public List<UgProfileActivityButton> getProfileActivityButtonList() {
        return this.profileActivityButtonList;
    }
}
