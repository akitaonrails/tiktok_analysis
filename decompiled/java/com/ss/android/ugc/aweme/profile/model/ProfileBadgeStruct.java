package com.ss.android.ugc.aweme.profile.model;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfileBadgeStruct implements Serializable {

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public Long id;

    @C09CT("should_show")
    public boolean shouldShow;

    @C09CT("name")
    public String name = "";

    @C09CT("description")
    public String description = "";

    @C09CT("url")
    public String url = "";

    public final String getDescription() {
        return this.description;
    }

    public final Long getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final boolean getShouldShow() {
        return this.shouldShow;
    }

    public final String getUrl() {
        return this.url;
    }

    public final void setDescription(String str) {
        this.description = str;
    }

    public final void setId(Long l) {
        this.id = l;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setShouldShow(boolean z) {
        this.shouldShow = z;
    }

    public final void setUrl(String str) {
        this.url = str;
    }
}
