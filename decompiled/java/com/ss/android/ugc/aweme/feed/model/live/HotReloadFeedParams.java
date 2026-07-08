package com.ss.android.ugc.aweme.feed.model.live;

import java.io.Serializable;

/* JADX INFO: loaded from: classes25.dex */
public final class HotReloadFeedParams implements Serializable {
    public Long deletedCardId;
    public Boolean isHotRefresh;
    public Boolean isLive;
    public Long slateGroupType;

    public HotReloadFeedParams() {
        this(Boolean.FALSE, Boolean.FALSE, null, null);
    }

    public final Long getDeletedCardId() {
        return this.deletedCardId;
    }

    public final Long getSlateGroupType() {
        return this.slateGroupType;
    }

    public final Boolean isHotRefresh() {
        return this.isHotRefresh;
    }

    public final Boolean isLive() {
        return this.isLive;
    }

    public final void setDeletedCardId(Long l) {
        this.deletedCardId = l;
    }

    public final void setHotRefresh(Boolean bool) {
        this.isHotRefresh = bool;
    }

    public final void setLive(Boolean bool) {
        this.isLive = bool;
    }

    public final void setSlateGroupType(Long l) {
        this.slateGroupType = l;
    }

    public HotReloadFeedParams(Boolean bool, Boolean bool2, Long l, Long l2) {
        this.isLive = bool;
        this.isHotRefresh = bool2;
        this.slateGroupType = l;
        this.deletedCardId = l2;
    }
}
