package com.ss.android.ugc.aweme.feed.model.upvote;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class RepostBubbleTriggerStruct implements Serializable {

    @C09CT("is_show")
    public Boolean isShow;

    @C09CT("event_name")
    public String ruleName;

    @C09CT("show_time")
    public Double showTime;

    public RepostBubbleTriggerStruct() {
    }

    public final Boolean isShow() {
        return this.isShow;
    }

    public RepostBubbleTriggerStruct(String str, Boolean bool, Double d) {
        this.ruleName = str;
        this.isShow = bool;
        this.showTime = d;
    }
}
