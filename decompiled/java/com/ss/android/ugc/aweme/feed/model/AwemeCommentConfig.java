package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class AwemeCommentConfig implements Serializable {

    @C09CT("comment_panel_show_tab_config")
    public CommentPanelShowTabConfig commentPanelShowTabConfig;

    @C09CT("comment_top_bar_component")
    public List<CommentTopBarComponent> commentTopBarComponent;

    @C09CT("emoji_recommend_list")
    public List<CommentPersonalizedEmoji> emojiList;

    @C09CT("empty_list_text")
    public String emptyListText;

    @C09CT("has_author_comment")
    public Boolean hasCreatorComment;

    @C09CT("has_hot_comment")
    public Boolean hasHotComment;

    @C09CT("has_visual_comment")
    public Boolean hasMediaComment;

    @C09CT("non_zero_input_box_text")
    public String nonZeroInputBoxText;

    @C09CT("poll_background_url")
    public String pollBackgroundUrl;

    @C09CT("poll_id")
    public Long pollId;

    @C09CT("preload")
    public CommentPreloadInfo preload;

    @C09CT("long_press_recommend_list")
    public List<CommentPersonalizedEmoji> pressEmojiList;

    @C09CT("quick_comment")
    public QuickCommentConfig quickCommentConfig;

    @C09CT("quick_comment_emoji_recommend_list")
    public List<CommentPersonalizedEmoji> quickCommentEmojiList;

    @C09CT("quick_mention")
    public QuickMention quickMention;

    @C09CT("social_quick_comment")
    public SocialQuickCommentConfig socialQuickCommentConfig;

    @C09CT("surprise_preload_config")
    public SurprisePreloadConfig surprisePreloadConfig;

    @C09CT("zero_comment_button_config")
    public ZeroCommentConfig zeroCommentConfig;

    @C09CT("zero_comment_opt_config")
    public ZeroCommentOptConfig zeroCommentOpt;

    @C09CT("zero_icon_text")
    public String zeroIconText;

    @C09CT("zero_input_box_text")
    public String zeroInputBoxText;

    public AwemeCommentConfig() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Boolean.FALSE, Boolean.FALSE, null, null);
    }

    public final AwemeCommentConfig copy(String str, String str2, String str3, String str4, List<CommentPersonalizedEmoji> list, CommentPreloadInfo commentPreloadInfo, QuickCommentConfig quickCommentConfig, ZeroCommentConfig zeroCommentConfig, QuickMention quickMention, ZeroCommentOptConfig zeroCommentOptConfig, List<CommentPersonalizedEmoji> list2, List<CommentPersonalizedEmoji> list3, CommentPanelShowTabConfig commentPanelShowTabConfig, SurprisePreloadConfig surprisePreloadConfig, List<CommentTopBarComponent> list4, SocialQuickCommentConfig socialQuickCommentConfig, Boolean bool, Boolean bool2, Boolean bool3, Long l, String str5) {
        return new AwemeCommentConfig(str, str2, str3, str4, list, commentPreloadInfo, quickCommentConfig, zeroCommentConfig, quickMention, zeroCommentOptConfig, list2, list3, commentPanelShowTabConfig, surprisePreloadConfig, list4, socialQuickCommentConfig, bool, bool2, bool3, l, str5);
    }

    public final void setPollBackgroundUrl(String str) {
        this.pollBackgroundUrl = str;
    }

    public final void setPollId(Long l) {
        this.pollId = l;
    }

    public AwemeCommentConfig(String str, String str2, String str3, String str4, List<CommentPersonalizedEmoji> list, CommentPreloadInfo commentPreloadInfo, QuickCommentConfig quickCommentConfig, ZeroCommentConfig zeroCommentConfig, QuickMention quickMention, ZeroCommentOptConfig zeroCommentOptConfig, List<CommentPersonalizedEmoji> list2, List<CommentPersonalizedEmoji> list3, CommentPanelShowTabConfig commentPanelShowTabConfig, SurprisePreloadConfig surprisePreloadConfig, List<CommentTopBarComponent> list4, SocialQuickCommentConfig socialQuickCommentConfig, Boolean bool, Boolean bool2, Boolean bool3, Long l, String str5) {
        this.zeroIconText = str;
        this.zeroInputBoxText = str2;
        this.nonZeroInputBoxText = str3;
        this.emptyListText = str4;
        this.emojiList = list;
        this.preload = commentPreloadInfo;
        this.quickCommentConfig = quickCommentConfig;
        this.zeroCommentConfig = zeroCommentConfig;
        this.quickMention = quickMention;
        this.zeroCommentOpt = zeroCommentOptConfig;
        this.pressEmojiList = list2;
        this.quickCommentEmojiList = list3;
        this.commentPanelShowTabConfig = commentPanelShowTabConfig;
        this.surprisePreloadConfig = surprisePreloadConfig;
        this.commentTopBarComponent = list4;
        this.socialQuickCommentConfig = socialQuickCommentConfig;
        this.hasHotComment = bool;
        this.hasMediaComment = bool2;
        this.hasCreatorComment = bool3;
        this.pollId = l;
        this.pollBackgroundUrl = str5;
    }
}
