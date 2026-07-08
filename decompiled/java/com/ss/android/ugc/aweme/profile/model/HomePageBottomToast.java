package com.ss.android.ugc.aweme.profile.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class HomePageBottomToast implements Serializable {

    @C09CT("group_id")
    public Integer groupId;

    @C09CT("icon_url")
    public UrlModel iconUrl;

    @C09CT("interval")
    public Long interval;

    @C09CT("jump_url")
    public String jumpUrl;

    @C09CT("jump_url_title")
    public String jumpUrlTitle;

    @C09CT("limit")
    public Integer limit;

    @C09CT("toast")
    public String toast;

    @C09CT("toast_type")
    public Integer toastType;

    @C09CT("type_limit")
    public Integer typeLimit;

    public final Integer getGroupId() {
        return this.groupId;
    }

    public final UrlModel getIconUrl() {
        return this.iconUrl;
    }

    public final Long getInterval() {
        return this.interval;
    }

    public final String getJumpUrl() {
        return this.jumpUrl;
    }

    public final String getJumpUrlTitle() {
        return this.jumpUrlTitle;
    }

    public final Integer getLimit() {
        return this.limit;
    }

    public final String getToast() {
        return this.toast;
    }

    public final Integer getToastType() {
        return this.toastType;
    }

    public final Integer getTypeLimit() {
        return this.typeLimit;
    }

    public final void setGroupId(Integer num) {
        this.groupId = num;
    }

    public final void setIconUrl(UrlModel urlModel) {
        this.iconUrl = urlModel;
    }

    public final void setInterval(Long l) {
        this.interval = l;
    }

    public final void setJumpUrl(String str) {
        this.jumpUrl = str;
    }

    public final void setJumpUrlTitle(String str) {
        this.jumpUrlTitle = str;
    }

    public final void setLimit(Integer num) {
        this.limit = num;
    }

    public final void setToast(String str) {
        this.toast = str;
    }

    public final void setToastType(Integer num) {
        this.toastType = num;
    }

    public final void setTypeLimit(Integer num) {
        this.typeLimit = num;
    }
}
