package com.ss.android.ugc.aweme.sticker.data;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes6.dex */
public final class Word implements Serializable {

    @C09CT("end_time")
    public long endTime;

    @C09CT("is_key")
    public boolean isKey;

    @C09CT("selected")
    public boolean selected;

    @C09CT("start_time")
    public long startTime;

    @C09CT("tag")
    public String tag;

    @C09CT("text")
    public String text;

    public Word() {
        this(0L, 0L, "", "", false, false);
    }

    public final long getEndTime() {
        return this.endTime;
    }

    public final boolean getSelected() {
        return this.selected;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final String getTag() {
        return this.tag;
    }

    public final String getText() {
        return this.text;
    }

    public final boolean isKey() {
        return this.isKey;
    }

    public final void setEndTime(long j) {
        this.endTime = j;
    }

    public final void setSelected(boolean z) {
        this.selected = z;
    }

    public final void setStartTime(long j) {
        this.startTime = j;
    }

    public final void setTag(String str) {
        this.tag = str;
    }

    public final void setText(String str) {
        this.text = str;
    }

    public Word(long j, long j2, String str, String str2, boolean z, boolean z2) {
        this.endTime = j;
        this.startTime = j2;
        this.text = str;
        this.tag = str2;
        this.selected = z;
        this.isKey = z2;
    }
}
