package com.ss.android.ugc.aweme.feed.adapter.widget.realtimecomment.freq;

import X.C09CT;

/* JADX INFO: loaded from: classes13.dex */
public final class CommentDisplayInfo {

    @C09CT("freq_control_deadline")
    public String controlDeadline;

    @C09CT("forbid_display_date")
    public String forbidDisplayDate;

    @C09CT("freq_version")
    public int freqVersion;

    @C09CT("last_display_date")
    public String lastDisplayDate;

    @C09CT("no_interact_days")
    public int noInteractDays;

    @C09CT("no_interact_count")
    public int todayNoInteractCount;

    @C09CT("user_id")
    public String useId;

    public CommentDisplayInfo() {
        this(1, null, 0, null, null, 0, null);
    }

    public CommentDisplayInfo(int i, String str, int i2, String str2, String str3, int i3, String str4) {
        this.freqVersion = i;
        this.useId = str;
        this.todayNoInteractCount = i2;
        this.lastDisplayDate = str2;
        this.forbidDisplayDate = str3;
        this.noInteractDays = i3;
        this.controlDeadline = str4;
    }
}
