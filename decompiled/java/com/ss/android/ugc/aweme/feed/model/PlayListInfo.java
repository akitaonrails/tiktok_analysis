package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes13.dex */
public final class PlayListInfo implements Serializable {
    public static final Companion Companion = new Companion();
    public transient boolean alreadyShownPlayNext;

    @C09CT("icon")
    public UrlModel icon;

    @C09CT("index")
    public Integer index;

    @C09CT("mix_id")
    public String mixId;

    @C09CT("name")
    public String mixName;

    @C09CT("item_total")
    public Long itemTotal = 0L;

    @C09CT("show_rename_tooltip")
    public Boolean showRenameTooltip = Boolean.FALSE;

    @C09CT("create_time")
    public Long createTime = 0L;

    @C09CT("update_time")
    public Long updateTime = 0L;

    @C09CT("mix_src")
    public Integer mixSrc = 0;

    @C09CT("total_item_play_count")
    public Long playCount = 0L;

    public static final class Companion {
    }

    public final boolean getAlreadyShownPlayNext() {
        return this.alreadyShownPlayNext;
    }

    public final Long getCreateTime() {
        return this.createTime;
    }

    public final UrlModel getIcon() {
        return this.icon;
    }

    public final Integer getIndex() {
        return this.index;
    }

    public final Long getItemTotal() {
        return this.itemTotal;
    }

    public final String getMixId() {
        return this.mixId;
    }

    public final String getMixName() {
        return this.mixName;
    }

    public final Integer getMixSrc() {
        return this.mixSrc;
    }

    public final Long getPlayCount() {
        return this.playCount;
    }

    public final Boolean getShowRenameTooltip() {
        return this.showRenameTooltip;
    }

    public final Long getUpdateTime() {
        return this.updateTime;
    }

    public final void setAlreadyShownPlayNext(boolean z) {
        this.alreadyShownPlayNext = z;
    }

    public final void setCreateTime(Long l) {
        this.createTime = l;
    }

    public final void setIcon(UrlModel urlModel) {
        this.icon = urlModel;
    }

    public final void setIndex(Integer num) {
        this.index = num;
    }

    public final void setItemTotal(Long l) {
        this.itemTotal = l;
    }

    public final void setMixId(String str) {
        this.mixId = str;
    }

    public final void setMixName(String str) {
        this.mixName = str;
    }

    public final void setMixSrc(Integer num) {
        this.mixSrc = num;
    }

    public final void setPlayCount(Long l) {
        this.playCount = l;
    }

    public final void setShowRenameTooltip(Boolean bool) {
        this.showRenameTooltip = bool;
    }

    public final void setUpdateTime(Long l) {
        this.updateTime = l;
    }
}
