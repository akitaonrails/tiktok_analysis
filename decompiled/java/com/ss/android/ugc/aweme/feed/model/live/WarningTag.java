package com.ss.android.ugc.aweme.feed.model.live;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes8.dex */
public final class WarningTag implements Serializable {

    @C09CT("duration")
    public long duration;

    @C09CT("tag_source")
    public int tagSource;

    @C09CT("text")
    public Text text;

    public final void setDuration(long j) {
        this.duration = j;
    }

    public final void setTagSource(int i) {
        this.tagSource = i;
    }

    public final void setText(Text text) {
        this.text = text;
    }

    public WarningTag(Text text, long j, int i) {
        this.text = text;
        this.duration = j;
        this.tagSource = i;
    }
}
