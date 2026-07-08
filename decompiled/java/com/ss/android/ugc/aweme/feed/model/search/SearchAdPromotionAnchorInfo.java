package com.ss.android.ugc.aweme.feed.model.search;

import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class SearchAdPromotionAnchorInfo implements Serializable {
    public boolean hasTrackedAnchorShow;
    public boolean hasTrackedOptSellingPointShow;
    public String optSellingPointText;
    public String originalText;
    public int requestStatus = -1;

    public final boolean getHasTrackedAnchorShow() {
        return this.hasTrackedAnchorShow;
    }

    public final boolean getHasTrackedOptSellingPointShow() {
        return this.hasTrackedOptSellingPointShow;
    }

    public final String getOptSellingPointText() {
        return this.optSellingPointText;
    }

    public final String getOriginalText() {
        return this.originalText;
    }

    public final int getRequestStatus() {
        return this.requestStatus;
    }

    public final void setHasTrackedAnchorShow(boolean z) {
        this.hasTrackedAnchorShow = z;
    }

    public final void setHasTrackedOptSellingPointShow(boolean z) {
        this.hasTrackedOptSellingPointShow = z;
    }

    public final void setOptSellingPointText(String str) {
        this.optSellingPointText = str;
    }

    public final void setOriginalText(String str) {
        this.originalText = str;
    }

    public final void setRequestStatus(int i) {
        this.requestStatus = i;
    }
}
