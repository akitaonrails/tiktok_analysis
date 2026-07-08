package com.bytedance.touchpoint.api.model;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class FeedBannerSpecialCardPicture {
    public String LIZ;

    @C09CT("animation")
    public Animation animation;

    @C09CT("background_image")
    public String backgroundImage;

    @C09CT("confirm_button")
    public FeedButton confirmButton;

    @C09CT("cover_bg_color")
    public String coverBgColor;

    @C09CT("cover_bottom")
    public CoverBottom coverBottom;

    @C09CT("description")
    public Title description;

    @C09CT("highlight_title")
    public Title highlightTitle;

    @C09CT("multi_show_count")
    public Integer multiShowCount;

    @C09CT("multiple_reward_config")
    public MultipleRewardConfig multipleRewardConfig;

    @C09CT("music_url")
    public final String music;

    @C09CT("not_interest_button")
    public FeedButton noInterestButton;

    @C09CT("reward_body")
    public RewardBody rewardBody;

    @C09CT("show_logo")
    public Boolean showLogo;

    @C09CT("subtitle")
    public SubTitle subTitle;

    @C09CT("task_key")
    public String taskKey;

    @C09CT("title")
    public Title title;

    public FeedBannerSpecialCardPicture(Animation animation, String str, String str2, CoverBottom coverBottom, Title title, FeedButton feedButton, Integer num, MultipleRewardConfig multipleRewardConfig, FeedButton feedButton2, Boolean bool, SubTitle subTitle, Title title2, String str3, String str4, RewardBody rewardBody, Title title3, String str5) {
        this.animation = animation;
        this.backgroundImage = str;
        this.coverBgColor = str2;
        this.coverBottom = coverBottom;
        this.highlightTitle = title;
        this.noInterestButton = feedButton;
        this.multiShowCount = num;
        this.multipleRewardConfig = multipleRewardConfig;
        this.confirmButton = feedButton2;
        this.showLogo = bool;
        this.subTitle = subTitle;
        this.title = title2;
        this.music = str3;
        this.taskKey = str4;
        this.rewardBody = rewardBody;
        this.description = title3;
        this.LIZ = str5;
    }
}
