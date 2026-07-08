package com.ss.android.ugc.aweme.feed.model;

/* JADX INFO: loaded from: classes2.dex */
public final class AwemeCommentConfigKt {
    public static final AwemeCommentConfig update(AwemeCommentConfig awemeCommentConfig, AwemeCommentConfig awemeCommentConfig2) {
        QuickMention quickMention;
        AwemeCommentConfig awemeCommentConfigCopy;
        if (awemeCommentConfig == null || (quickMention = awemeCommentConfig.quickMention) == null) {
            return awemeCommentConfig2;
        }
        if (awemeCommentConfig2 == null || (awemeCommentConfigCopy = awemeCommentConfig2.copy(awemeCommentConfig2.zeroIconText, awemeCommentConfig2.zeroInputBoxText, awemeCommentConfig2.nonZeroInputBoxText, awemeCommentConfig2.emptyListText, awemeCommentConfig2.emojiList, awemeCommentConfig2.preload, awemeCommentConfig2.quickCommentConfig, awemeCommentConfig2.zeroCommentConfig, quickMention, awemeCommentConfig2.zeroCommentOpt, awemeCommentConfig2.pressEmojiList, awemeCommentConfig2.quickCommentEmojiList, awemeCommentConfig2.commentPanelShowTabConfig, awemeCommentConfig2.surprisePreloadConfig, awemeCommentConfig2.commentTopBarComponent, awemeCommentConfig2.socialQuickCommentConfig, awemeCommentConfig2.hasHotComment, awemeCommentConfig2.hasMediaComment, awemeCommentConfig2.hasCreatorComment, awemeCommentConfig2.pollId, awemeCommentConfig2.pollBackgroundUrl)) == null) {
            return new AwemeCommentConfig(null, null, null, null, null, null, null, null, awemeCommentConfig.quickMention, null, null, null, null, null, null, null, null, Boolean.FALSE, Boolean.FALSE, null, null);
        }
        return awemeCommentConfigCopy;
    }
}
