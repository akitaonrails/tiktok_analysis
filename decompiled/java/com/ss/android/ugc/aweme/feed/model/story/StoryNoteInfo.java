package com.ss.android.ugc.aweme.feed.model.story;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public final class StoryNoteInfo implements Serializable {
    public static final Companion Companion = new Companion();

    @C09CT("avatar_info")
    public AvatarThoughtInfo avatarInfo;

    @C09CT("background_info")
    public BackgroundModel backGroundInfo;

    @C09CT("bubble_background_color")
    public Integer bubbleBackgroundColor;
    public transient boolean isEnterFromProfileOrSkylight;
    public transient boolean isStoryNoteViewed;

    @C09CT("rich_text")
    public List<RichTextInfo> richText;

    @C09CT("sub_type")
    public int subType;

    @C09CT("text_content")
    public String text;

    @C09CT("text_extra")
    public List<StoryNoteTextExtra> textExtras;

    public static final class Companion {
    }

    public StoryNoteInfo() {
    }

    public final boolean isEnterFromProfileOrSkylight() {
        return this.isEnterFromProfileOrSkylight;
    }

    public final boolean isStoryNoteViewed() {
        return this.isStoryNoteViewed;
    }

    public final void setEnterFromProfileOrSkylight(boolean z) {
        this.isEnterFromProfileOrSkylight = z;
    }

    public final void setStoryNoteViewed(boolean z) {
        this.isStoryNoteViewed = z;
    }

    public StoryNoteInfo(String str, List<RichTextInfo> list, List<StoryNoteTextExtra> list2, BackgroundModel backgroundModel, int i, Integer num, AvatarThoughtInfo avatarThoughtInfo, boolean z, boolean z2) {
        this.text = str;
        this.richText = list;
        this.textExtras = list2;
        this.backGroundInfo = backgroundModel;
        this.subType = i;
        this.bubbleBackgroundColor = num;
        this.avatarInfo = avatarThoughtInfo;
        this.isStoryNoteViewed = z;
        this.isEnterFromProfileOrSkylight = z2;
    }
}
