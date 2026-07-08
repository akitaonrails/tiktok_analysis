package com.ss.android.ugc.aweme.music.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public final class MusicTag implements Serializable {

    @C09CT("recall_reason")
    public String recallReason;

    @C09CT("tag_color")
    public String tagColor;

    @C09CT("tag_dark_color")
    public String tagColorDark;

    @C09CT("tag_title")
    public String tagTitle;

    @C09CT("tag_title_color")
    public String tagTitleColor;

    @C09CT("tag_title_dark_color")
    public String tagTitleColorDark;

    public final String getRecallReason() {
        return this.recallReason;
    }

    public final String getTagColor() {
        return this.tagColor;
    }

    public final String getTagColorDark() {
        return this.tagColorDark;
    }

    public final String getTagTitle() {
        return this.tagTitle;
    }

    public final String getTagTitleColor() {
        return this.tagTitleColor;
    }

    public final String getTagTitleColorDark() {
        return this.tagTitleColorDark;
    }

    public final void setRecallReason(String str) {
        this.recallReason = str;
    }

    public final void setTagColor(String str) {
        this.tagColor = str;
    }

    public final void setTagColorDark(String str) {
        this.tagColorDark = str;
    }

    public final void setTagTitle(String str) {
        this.tagTitle = str;
    }

    public final void setTagTitleColor(String str) {
        this.tagTitleColor = str;
    }

    public final void setTagTitleColorDark(String str) {
        this.tagTitleColorDark = str;
    }
}
