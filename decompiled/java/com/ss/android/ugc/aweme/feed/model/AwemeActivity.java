package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class AwemeActivity implements Serializable {

    @C09CT("activity_id")
    public String activityId;

    @C09CT("content")
    public AwemeActivityContent content;

    @C09CT("primary_btn")
    public AwemeActivityButton primaryBtn;

    @C09CT("schema_url")
    public String schemaUrl;

    @C09CT("show_delay_time")
    public Long showDelayTime;

    public AwemeActivity() {
        this(null, null, null, null, null);
    }

    public AwemeActivity(String str, Long l, String str2, AwemeActivityContent awemeActivityContent, AwemeActivityButton awemeActivityButton) {
        this.activityId = str;
        this.showDelayTime = l;
        this.schemaUrl = str2;
        this.content = awemeActivityContent;
        this.primaryBtn = awemeActivityButton;
    }
}
