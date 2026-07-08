package com.ss.android.ugc.aweme.feed.model.live;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ShowInfo {

    @C09CT("anchors")
    public List<? extends LiveUser> anchors;

    @C09CT("show_end_time")
    public long showEndTime;

    @C09CT("show_introduction")
    public String showIntroduction = "";

    @C09CT("show_start_time")
    public long showStartTime;

    public final List<LiveUser> getAnchors() {
        return this.anchors;
    }

    public final long getShowEndTime() {
        return this.showEndTime;
    }

    public final String getShowIntroduction() {
        return this.showIntroduction;
    }

    public final long getShowStartTime() {
        return this.showStartTime;
    }

    public final void setAnchors(List<? extends LiveUser> list) {
        this.anchors = list;
    }

    public final void setShowEndTime(long j) {
        this.showEndTime = j;
    }

    public final void setShowIntroduction(String str) {
        this.showIntroduction = str;
    }

    public final void setShowStartTime(long j) {
        this.showStartTime = j;
    }
}
