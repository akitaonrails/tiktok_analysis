package com.ss.android.ugc.aweme.profile.story;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.story.RichTextInfo;
import com.ss.android.ugc.aweme.feed.model.story.StoryNoteTextExtra;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfileStoryNote {

    @C09CT("aweme_id")
    public final String aid;

    @C09CT("avatar_img_url")
    public final List<String> avatarImgUrl;

    @C09CT("avatar_thought_type")
    public final Integer avatarThoughtType;

    @C09CT("dynamic_avatar_url")
    public final UrlModel dynamicAvatarUrl;

    @C09CT("rich_text")
    public final List<RichTextInfo> richText;

    @C09CT("text_content")
    public final String text;

    @C09CT("text_extra")
    public final List<StoryNoteTextExtra> textExtras;

    public ProfileStoryNote(String str, String str2, UrlModel urlModel, List<RichTextInfo> list, Integer num, List<String> list2, List<StoryNoteTextExtra> list3) {
        this.text = str;
        this.aid = str2;
        this.dynamicAvatarUrl = urlModel;
        this.richText = list;
        this.avatarThoughtType = num;
        this.avatarImgUrl = list2;
        this.textExtras = list3;
    }
}
