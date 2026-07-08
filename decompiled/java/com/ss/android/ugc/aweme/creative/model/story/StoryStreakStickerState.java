package com.ss.android.ugc.aweme.creative.model.story;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes30.dex */
public final class StoryStreakStickerState implements Serializable {

    @C09CT("friendship_days_sticker_uuid")
    public String friendshipDaysStickerUUID;

    @C09CT("is_friendship_days_sticker_added")
    public boolean isFriendshipDaysStickerAdded;

    @C09CT("is_message_sent_sticker_added")
    public boolean isMessageSentStickerAdded;

    @C09CT("is_ongoing_days_sticker_added")
    public boolean isOngoingDaysStickerAdded;

    @C09CT("is_streak_gif_sticker_added")
    public boolean isStreakGifStickerAdded;

    @C09CT("is_text_desc_sticker_added")
    public boolean isTextDescStickerAdded;

    @C09CT("is_text_mention_sticker_added")
    public boolean isTextMentionStickerAdded;

    @C09CT("message_sent_sticker_uuid")
    public String messageSentStickerUUID;

    @C09CT("ongoing_days_sticker_uuid")
    public String ongoingDaysStickerUUID;

    @C09CT("streak_gif_sticker_uuid")
    public String streakGifStickerUUID;

    @C09CT("text_desc_sticker_model")
    public StoryStreakTextStickerModel textDescStickerModel;

    @C09CT("text_mention_sticker_model")
    public StoryStreakTextStickerModel textMentionStickerModel;

    public StoryStreakStickerState() {
        this(false, false, null, null, false, null, false, null, false, null, false, null);
    }

    public String toString() {
        return "StoryStreakStickerState(isTextDescStickerAdded=" + this.isTextDescStickerAdded + ", isTextMentionStickerAdded=" + this.isTextMentionStickerAdded + ", textDescStickerModel=" + this.textDescStickerModel + ", textMentionStickerModel=" + this.textMentionStickerModel + ", isStreakGifStickerAdded=" + this.isStreakGifStickerAdded + ", streakGifStickerUUID=" + this.streakGifStickerUUID + ", isOngoingDaysStickerAdded=" + this.isOngoingDaysStickerAdded + ", ongoingDaysStickerUUID=" + this.ongoingDaysStickerUUID + ", isMessageSentStickerAdded=" + this.isMessageSentStickerAdded + ", messageSentStickerUUID=" + this.messageSentStickerUUID + ", isFriendshipDaysStickerAdded=" + this.isFriendshipDaysStickerAdded + ", friendshipDaysStickerUUID=" + this.friendshipDaysStickerUUID + ')';
    }

    public final boolean isFriendshipDaysStickerAdded() {
        return this.isFriendshipDaysStickerAdded;
    }

    public final boolean isMessageSentStickerAdded() {
        return this.isMessageSentStickerAdded;
    }

    public final boolean isOngoingDaysStickerAdded() {
        return this.isOngoingDaysStickerAdded;
    }

    public final boolean isStreakGifStickerAdded() {
        return this.isStreakGifStickerAdded;
    }

    public final boolean isTextDescStickerAdded() {
        return this.isTextDescStickerAdded;
    }

    public final boolean isTextMentionStickerAdded() {
        return this.isTextMentionStickerAdded;
    }

    public final void setFriendshipDaysStickerAdded(boolean z) {
        this.isFriendshipDaysStickerAdded = z;
    }

    public final void setFriendshipDaysStickerUUID(String str) {
        this.friendshipDaysStickerUUID = str;
    }

    public final void setMessageSentStickerAdded(boolean z) {
        this.isMessageSentStickerAdded = z;
    }

    public final void setMessageSentStickerUUID(String str) {
        this.messageSentStickerUUID = str;
    }

    public final void setOngoingDaysStickerAdded(boolean z) {
        this.isOngoingDaysStickerAdded = z;
    }

    public final void setOngoingDaysStickerUUID(String str) {
        this.ongoingDaysStickerUUID = str;
    }

    public final void setStreakGifStickerAdded(boolean z) {
        this.isStreakGifStickerAdded = z;
    }

    public final void setStreakGifStickerUUID(String str) {
        this.streakGifStickerUUID = str;
    }

    public final void setTextDescStickerAdded(boolean z) {
        this.isTextDescStickerAdded = z;
    }

    public final void setTextDescStickerModel(StoryStreakTextStickerModel storyStreakTextStickerModel) {
        this.textDescStickerModel = storyStreakTextStickerModel;
    }

    public final void setTextMentionStickerAdded(boolean z) {
        this.isTextMentionStickerAdded = z;
    }

    public final void setTextMentionStickerModel(StoryStreakTextStickerModel storyStreakTextStickerModel) {
        this.textMentionStickerModel = storyStreakTextStickerModel;
    }

    public StoryStreakStickerState(boolean z, boolean z2, StoryStreakTextStickerModel storyStreakTextStickerModel, StoryStreakTextStickerModel storyStreakTextStickerModel2, boolean z3, String str, boolean z4, String str2, boolean z5, String str3, boolean z6, String str4) {
        this.isTextDescStickerAdded = z;
        this.isTextMentionStickerAdded = z2;
        this.textDescStickerModel = storyStreakTextStickerModel;
        this.textMentionStickerModel = storyStreakTextStickerModel2;
        this.isStreakGifStickerAdded = z3;
        this.streakGifStickerUUID = str;
        this.isOngoingDaysStickerAdded = z4;
        this.ongoingDaysStickerUUID = str2;
        this.isMessageSentStickerAdded = z5;
        this.messageSentStickerUUID = str3;
        this.isFriendshipDaysStickerAdded = z6;
        this.friendshipDaysStickerUUID = str4;
    }
}
