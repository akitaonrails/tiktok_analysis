package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;

/* JADX INFO: loaded from: classes10.dex */
public final class MissionSetting {

    @C09CT("source")
    public final int source;

    @C09CT("sub_source")
    public final int subSource;

    @C09CT("sub_source_label")
    public final String subSourceLabel;

    @C09CT("text")
    public final String text;

    @C09CT("unsubscribe_status")
    public final int unsubscribeStatus;

    public final MissionSetting copy(int i, String str, int i2, int i3, String str2) {
        return new MissionSetting(i, str, i2, i3, str2);
    }

    public MissionSetting() {
        this(0, "", 0, 0, "");
    }

    public MissionSetting(int i, String str, int i2, int i3, String str2) {
        this.unsubscribeStatus = i;
        this.text = str;
        this.source = i2;
        this.subSource = i3;
        this.subSourceLabel = str2;
    }
}
