package com.ss.android.ugc.aweme.services.external.ui;

import java.io.Serializable;

/* JADX INFO: loaded from: classes30.dex */
public final class LiveParams implements Serializable {
    public Boolean onlyShowLiveTab;
    public String sourceParams;

    public final Boolean getOnlyShowLiveTab() {
        return this.onlyShowLiveTab;
    }

    public final String getSourceParams() {
        return this.sourceParams;
    }

    public final void setOnlyShowLiveTab(Boolean bool) {
        this.onlyShowLiveTab = bool;
    }

    public final void setSourceParams(String str) {
        this.sourceParams = str;
    }

    public LiveParams(String str, Boolean bool) {
        this.sourceParams = str;
        this.onlyShowLiveTab = bool;
    }
}
