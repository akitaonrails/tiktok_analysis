package com.ss.android.ugc.aweme.creative.model.story;

import X.C09CT;
import X.C0MY0;
import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
public final class StreaksData implements Serializable {

    @C09CT("conversation_id")
    public String conversationId;

    @C09CT("info_desc_font_path")
    @C0MY0(blockCreative = true)
    public String infoDescFontPath;

    @C09CT("info_number_font_creative_path")
    @C0MY0(blockCreative = false)
    public String infoNumberFontCreativePath;

    @C09CT("info_number_font_path")
    public String infoNumberFontPath;

    @C09CT("is_fake_level")
    public boolean isFakeLevel;

    @C09CT("is_number_use_effect_font")
    public boolean isNumUseEffectFont;

    @C09CT("is_streaks_post")
    public boolean isStreaksPost;

    @C09CT("is_streaks_share_to_story")
    public boolean isStreaksShareToStory;

    @C09CT("message_sent_count")
    public int messageSentCount;

    @C09CT("muf_days_count")
    public int mufDaysCount;

    @C09CT("poster_bg_color")
    public int posterBgColor;

    @C09CT("shoot_enter_from")
    public String shootEnterFrom;

    @C09CT("shoot_enter_method")
    public String shootEnterMethod;

    @C09CT("sticker_add_state")
    public final StoryStreakStickerState stickerAddState;

    @C09CT("streak_gif_path")
    @C0MY0(blockCreative = true)
    public String streakGifPath;

    @C09CT("streak_user")
    public StoryStreakUser streakUser;

    @C09CT("streaks_level")
    public int streaksLevel;

    public StreaksData() {
        this("", "", false, false, -1, "", 0, 0, null, new StoryStreakStickerState(false, false, null, null, false, null, false, null, false, null, false, null), "", "", "", "", false, false, 0);
    }

    public String toString() {
        return "StreaksData(shootEnterFrom=" + this.shootEnterFrom + ", shootEnterMethod=" + this.shootEnterMethod + ", isStreaksPost=" + this.isStreaksPost + ", isStreaksShareToStory=" + this.isStreaksShareToStory + ", streaksLevel=" + this.streaksLevel + ", conversationId=" + this.conversationId + ", messageSentCount=" + this.messageSentCount + ", mufDaysCount=" + this.mufDaysCount + ", streakUser=" + this.streakUser + ", stickerAddState=" + this.stickerAddState + ", streakGifPath=" + this.streakGifPath + ", infoDescFontPath=" + this.infoDescFontPath + ", infoNumberFontCreativePath=" + this.infoNumberFontCreativePath + ", infoNumberFontPath=" + this.infoNumberFontPath + ", isNumUseEffectFont=" + this.isNumUseEffectFont + ", isFakeLevel=" + this.isFakeLevel + ", posterBgColor=" + this.posterBgColor + ')';
    }

    public final boolean isFakeLevel() {
        return this.isFakeLevel;
    }

    public final boolean isNumUseEffectFont() {
        return this.isNumUseEffectFont;
    }

    public final boolean isStreaksPost() {
        return this.isStreaksPost;
    }

    public final boolean isStreaksShareToStory() {
        return this.isStreaksShareToStory;
    }

    public final void setConversationId(String str) {
        this.conversationId = str;
    }

    public final void setFakeLevel(boolean z) {
        this.isFakeLevel = z;
    }

    public final void setInfoDescFontPath(String str) {
        this.infoDescFontPath = str;
    }

    public final void setInfoNumberFontCreativePath(String str) {
        this.infoNumberFontCreativePath = str;
    }

    public final void setInfoNumberFontPath(String str) {
        this.infoNumberFontPath = str;
    }

    public final void setMessageSentCount(int i) {
        this.messageSentCount = i;
    }

    public final void setMufDaysCount(int i) {
        this.mufDaysCount = i;
    }

    public final void setNumUseEffectFont(boolean z) {
        this.isNumUseEffectFont = z;
    }

    public final void setPosterBgColor(int i) {
        this.posterBgColor = i;
    }

    public final void setShootEnterFrom(String str) {
        this.shootEnterFrom = str;
    }

    public final void setShootEnterMethod(String str) {
        this.shootEnterMethod = str;
    }

    public final void setStreakGifPath(String str) {
        this.streakGifPath = str;
    }

    public final void setStreakUser(StoryStreakUser storyStreakUser) {
        this.streakUser = storyStreakUser;
    }

    public final void setStreaksLevel(int i) {
        this.streaksLevel = i;
    }

    public final void setStreaksPost(boolean z) {
        this.isStreaksPost = z;
    }

    public final void setStreaksShareToStory(boolean z) {
        this.isStreaksShareToStory = z;
    }

    public StreaksData(String str, String str2, boolean z, boolean z2, int i, String str3, int i2, int i3, StoryStreakUser storyStreakUser, StoryStreakStickerState storyStreakStickerState, String str4, String str5, String str6, String str7, boolean z3, boolean z4, int i4) {
        this.shootEnterFrom = str;
        this.shootEnterMethod = str2;
        this.isStreaksPost = z;
        this.isStreaksShareToStory = z2;
        this.streaksLevel = i;
        this.conversationId = str3;
        this.messageSentCount = i2;
        this.mufDaysCount = i3;
        this.streakUser = storyStreakUser;
        this.stickerAddState = storyStreakStickerState;
        this.streakGifPath = str4;
        this.infoDescFontPath = str5;
        this.infoNumberFontCreativePath = str6;
        this.infoNumberFontPath = str7;
        this.isNumUseEffectFont = z3;
        this.isFakeLevel = z4;
        this.posterBgColor = i4;
    }
}
