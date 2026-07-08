package com.ss.android.ugc.aweme.commercialize.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class FollowButtonData implements Serializable {

    @C09CT("enable")
    public Boolean enable;

    @C09CT("show_seconds")
    public Integer showSeconds;

    public FollowButtonData() {
        this(Boolean.FALSE, 2);
    }

    public final void setEnable(Boolean bool) {
        this.enable = bool;
    }

    public final void setShowSeconds(Integer num) {
        this.showSeconds = num;
    }

    public FollowButtonData(Boolean bool, Integer num) {
        this.enable = bool;
        this.showSeconds = num;
    }
}
