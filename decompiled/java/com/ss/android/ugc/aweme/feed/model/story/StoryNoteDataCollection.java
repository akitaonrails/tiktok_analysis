package com.ss.android.ugc.aweme.feed.model.story;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class StoryNoteDataCollection implements Serializable {
    public final String aid;
    public final UrlModel animatedAvatarUri;
    public final List<String> avatarPrimaryUrlList;
    public final List<String> avatarSecondaryUrlList;
    public final Integer avatarThoughtType;
    public final String backgroundResId;
    public final Integer publishPrivacySetting;
    public final List<RichTextInfo> richText;
    public final String text;
    public final List<StoryNoteTextExtra> textExtras;
    public final String uid;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoryNoteDataCollection)) {
            return false;
        }
        StoryNoteDataCollection storyNoteDataCollection = (StoryNoteDataCollection) obj;
        return Intrinsics.LJFF(this.text, storyNoteDataCollection.text) && Intrinsics.LJFF(this.aid, storyNoteDataCollection.aid) && Intrinsics.LJFF(this.uid, storyNoteDataCollection.uid) && Intrinsics.LJFF(this.animatedAvatarUri, storyNoteDataCollection.animatedAvatarUri) && Intrinsics.LJFF(this.richText, storyNoteDataCollection.richText) && Intrinsics.LJFF(this.publishPrivacySetting, storyNoteDataCollection.publishPrivacySetting) && Intrinsics.LJFF(this.avatarThoughtType, storyNoteDataCollection.avatarThoughtType) && Intrinsics.LJFF(this.avatarPrimaryUrlList, storyNoteDataCollection.avatarPrimaryUrlList) && Intrinsics.LJFF(this.avatarSecondaryUrlList, storyNoteDataCollection.avatarSecondaryUrlList) && Intrinsics.LJFF(this.backgroundResId, storyNoteDataCollection.backgroundResId) && Intrinsics.LJFF(this.textExtras, storyNoteDataCollection.textExtras);
    }

    public StoryNoteDataCollection(String str, String str2, String str3, UrlModel urlModel, List<RichTextInfo> list, Integer num, Integer num2, List<String> list2, List<String> list3, String str4, List<StoryNoteTextExtra> list4) {
        this.text = str;
        this.aid = str2;
        this.uid = str3;
        this.animatedAvatarUri = urlModel;
        this.richText = list;
        this.publishPrivacySetting = num;
        this.avatarThoughtType = num2;
        this.avatarPrimaryUrlList = list2;
        this.avatarSecondaryUrlList = list3;
        this.backgroundResId = str4;
        this.textExtras = list4;
    }
}
