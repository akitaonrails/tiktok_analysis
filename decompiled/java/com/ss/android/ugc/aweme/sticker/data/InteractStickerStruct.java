package com.ss.android.ugc.aweme.sticker.data;

import X.C09CT;
import X.InterfaceC384940F7k;
import com.ss.android.ugc.aweme.addyours.model.AddYoursStickerStruct;
import com.ss.android.ugc.aweme.article.model.ArticleStickerStruct;
import com.ss.android.ugc.aweme.attributionlink.model.AttributionLinkStickerStruct;
import com.ss.android.ugc.aweme.attributionlink.model.AttributionLinkStoryAnchorStruct;
import com.ss.android.ugc.aweme.comment.model.CommentPostStickerStruct;
import com.ss.android.ugc.aweme.emojislider.model.EmojiSliderStickerStruct;
import com.ss.android.ugc.aweme.groupchat.DMGroupChatStickerStruct;
import com.ss.android.ugc.aweme.interactiveemoji.model.InteractiveEmojiStickerStruct;
import com.ss.android.ugc.aweme.live.model.LiveShareStickerStruct;
import com.ss.android.ugc.aweme.music.model.LyricStickerStruct;
import com.ss.android.ugc.aweme.music.model.MusicStickerStruct;
import com.ss.android.ugc.aweme.secretreplies.model.SecretRepliesResponseStickerStruct;
import com.ss.android.ugc.aweme.secretreplies.model.SecretRepliesStickerStruct;
import com.ss.android.ugc.aweme.socialavatar.model.SocialAvatarStickerStruct;
import com.ss.android.ugc.aweme.sticker.model.SharedCommentStickerStruct;
import com.ss.android.ugc.aweme.urllink.model.LinkStickerStruct;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes30.dex */
public class InteractStickerStruct implements Serializable, InterfaceC384940F7k {

    @C09CT("add_yours_sticker")
    public AddYoursStickerStruct addYoursStickerStruct;

    @C09CT("article_sticker")
    public ArticleStickerStruct articleSticker;
    public String attr;

    @C09CT("attribution_link_sticker")
    public AttributionLinkStickerStruct attributionLinkStickerStruct;

    @C09CT("attribution_link_story_anchor")
    public AttributionLinkStoryAnchorStruct attributionLinkStoryAnchorStruct;

    @C09CT("comment_post_sticker")
    public CommentPostStickerStruct commentPostStickerStruct;

    @C09CT("ecommerce_info")
    public EcommerceStickerStruct ecommerceStickerStruct;

    @C09CT("emoji_slider_sticker")
    public EmojiSliderStickerStruct emojiSliderStickerStruct;

    @C09CT("public_group_entry_sticker")
    public DMGroupChatStickerStruct groupChatStickerStruct;

    @C09CT("hashtag_info")
    public HashtagStruct hashtagInfo;
    public int index;

    @C09CT("interactive_emoji_sticker")
    public InteractiveEmojiStickerStruct interactiveEmojiStickerStruct;

    @C09CT("live_story_sticker")
    public LiveShareStickerStruct liveShareStickerStruct;

    @C09CT("lyric_sticker")
    public LyricStickerStruct lyricStickerStruct;

    @C09CT("auto_video_caption_info")
    public CaptionStruct mCaptionStruct;

    @C09CT("countdown_info")
    public CountDownStickerStruct mCountDownStickerStruct;

    @C09CT("question_info")
    public QaStruct mQaStruct;

    @C09CT("text_info")
    public String mTextStruct;

    @C09CT("material_index")
    public int materialIndex;

    @C09CT("mention_info")
    public MentionStruct mentionInfo;

    @C09CT("music_sticker")
    public MusicStickerStruct musicStickerStruct;

    @C09CT("is_non_global")
    public boolean noGlobal;

    @C09CT("is_non_global_v2")
    public boolean noGlobalV2;

    @C09CT("poi_info")
    public PoiStickerStruct poiStickerStruct;

    @C09CT("vote_info")
    public PollStruct pollStruct;

    @C09CT("secret_reply_response_sticker")
    public SecretRepliesResponseStickerStruct secretRepliesResponseStickerStruct;

    @C09CT("secret_reply_sticker")
    public SecretRepliesStickerStruct secretRepliesStickerStruct;

    @C09CT("shared_comment_sticker")
    public SharedCommentStickerStruct sharedCommentStickerStruct;

    @C09CT("social_avatar_sticker")
    public SocialAvatarStickerStruct socialAvatarStickerStruct;

    @C09CT("text_sticker_info")
    public TextStickerInfo textStickerInfo;

    @C09CT("track_info")
    public String trackList;
    public List<NormalTrackTimeStamp> trackTimeStampCache;
    public int type;

    @C09CT("link_sticker")
    public LinkStickerStruct urlLinkSticker;

    @C09CT("video_share_info")
    public VideoShareInfoStruct videoShareInfoStruct;

    public boolean getNoGlobal() {
        return this.noGlobal || this.noGlobalV2;
    }

    public int hashCode() {
        return this.index * 31;
    }

    public AddYoursStickerStruct getAddYoursStickerStruct() {
        return this.addYoursStickerStruct;
    }

    public ArticleStickerStruct getArticleSticker() {
        return this.articleSticker;
    }

    public String getAttr() {
        return this.attr;
    }

    public AttributionLinkStickerStruct getAttributionLinkStickerStruct() {
        return this.attributionLinkStickerStruct;
    }

    public AttributionLinkStoryAnchorStruct getAttributionLinkStoryAnchorStruct() {
        return this.attributionLinkStoryAnchorStruct;
    }

    public CaptionStruct getCaptionStruct() {
        return this.mCaptionStruct;
    }

    public CommentPostStickerStruct getCommentPostStickerStruct() {
        return this.commentPostStickerStruct;
    }

    public CountDownStickerStruct getCountDownStickerStruct() {
        return this.mCountDownStickerStruct;
    }

    public EcommerceStickerStruct getEcommerceStickerStruct() {
        return this.ecommerceStickerStruct;
    }

    public EmojiSliderStickerStruct getEmojiSliderStickerStruct() {
        return this.emojiSliderStickerStruct;
    }

    public DMGroupChatStickerStruct getGroupChatStickerStruct() {
        return this.groupChatStickerStruct;
    }

    public HashtagStruct getHashtagInfo() {
        return this.hashtagInfo;
    }

    public int getIndex() {
        return this.index;
    }

    public InteractiveEmojiStickerStruct getInteractiveEmojiStickerStruct() {
        return this.interactiveEmojiStickerStruct;
    }

    public LiveShareStickerStruct getLiveShareStickerStruct() {
        return this.liveShareStickerStruct;
    }

    public LyricStickerStruct getLyricStickerStruct() {
        return this.lyricStickerStruct;
    }

    public int getMaterialIndex() {
        return this.materialIndex;
    }

    public MentionStruct getMentionInfo() {
        return this.mentionInfo;
    }

    public MusicStickerStruct getMusicStickerStruct() {
        return this.musicStickerStruct;
    }

    public PoiStickerStruct getPoiStickerStruct() {
        return this.poiStickerStruct;
    }

    public PollStruct getPollStruct() {
        return this.pollStruct;
    }

    public QaStruct getQaStruct() {
        return this.mQaStruct;
    }

    public SecretRepliesResponseStickerStruct getSecretRepliesResponseStickerStruct() {
        return this.secretRepliesResponseStickerStruct;
    }

    public SecretRepliesStickerStruct getSecretRepliesStickerStruct() {
        return this.secretRepliesStickerStruct;
    }

    public SharedCommentStickerStruct getSharedCommentStickerStruct() {
        return this.sharedCommentStickerStruct;
    }

    public SocialAvatarStickerStruct getSocialAvatarStickerStruct() {
        return this.socialAvatarStickerStruct;
    }

    public TextStickerInfo getTextInfo() {
        return this.textStickerInfo;
    }

    public String getTextStruct() {
        return this.mTextStruct;
    }

    public String getTrackList() {
        return this.trackList;
    }

    public List<NormalTrackTimeStamp> getTrackTimeStampCache() {
        return this.trackTimeStampCache;
    }

    public int getType() {
        return this.type;
    }

    public LinkStickerStruct getUrlLinkSticker() {
        return this.urlLinkSticker;
    }

    public VideoShareInfoStruct getVideoShareInfoStruct() {
        return this.videoShareInfoStruct;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InteractStickerStruct interactStickerStruct = (InteractStickerStruct) obj;
        if (this.type != interactStickerStruct.type || this.index != interactStickerStruct.index) {
            return false;
        }
        String str = this.trackList;
        if (str != null) {
            if (!str.equals(interactStickerStruct.trackList)) {
                return false;
            }
        } else if (interactStickerStruct.trackList != null) {
            return false;
        }
        PollStruct pollStruct = this.pollStruct;
        if (pollStruct != null) {
            if (!pollStruct.equals(interactStickerStruct.pollStruct)) {
                return false;
            }
        } else if (interactStickerStruct.pollStruct != null) {
            return false;
        }
        HashtagStruct hashtagStruct = this.hashtagInfo;
        if (hashtagStruct != null) {
            if (!hashtagStruct.equals(interactStickerStruct.hashtagInfo)) {
                return false;
            }
        } else if (interactStickerStruct.hashtagInfo != null) {
            return false;
        }
        MentionStruct mentionStruct = this.mentionInfo;
        if (mentionStruct != null) {
            if (!mentionStruct.equals(interactStickerStruct.mentionInfo)) {
                return false;
            }
        } else if (interactStickerStruct.mentionInfo != null) {
            return false;
        }
        String str2 = this.mTextStruct;
        if (str2 != null) {
            if (!str2.equals(interactStickerStruct.mTextStruct)) {
                return false;
            }
        } else if (interactStickerStruct.mTextStruct != null) {
            return false;
        }
        CountDownStickerStruct countDownStickerStruct = this.mCountDownStickerStruct;
        if (countDownStickerStruct != null) {
            if (!countDownStickerStruct.equals(interactStickerStruct.mCountDownStickerStruct)) {
                return false;
            }
        } else if (interactStickerStruct.mCountDownStickerStruct != null) {
            return false;
        }
        QaStruct qaStruct = this.mQaStruct;
        if (qaStruct != null) {
            if (!qaStruct.equals(interactStickerStruct.mQaStruct)) {
                return false;
            }
        } else if (interactStickerStruct.mQaStruct != null) {
            return false;
        }
        VideoShareInfoStruct videoShareInfoStruct = this.videoShareInfoStruct;
        if (videoShareInfoStruct != null) {
            if (!videoShareInfoStruct.equals(interactStickerStruct.videoShareInfoStruct)) {
                return false;
            }
        } else if (interactStickerStruct.videoShareInfoStruct != null) {
            return false;
        }
        TextStickerInfo textStickerInfo = this.textStickerInfo;
        if (textStickerInfo != null) {
            if (!textStickerInfo.equals(interactStickerStruct.textStickerInfo)) {
                return false;
            }
        } else if (interactStickerStruct.textStickerInfo != null) {
            return false;
        }
        PoiStickerStruct poiStickerStruct = this.poiStickerStruct;
        if (poiStickerStruct != null) {
            if (!poiStickerStruct.equals(interactStickerStruct.poiStickerStruct)) {
                return false;
            }
        } else if (interactStickerStruct.poiStickerStruct != null) {
            return false;
        }
        AddYoursStickerStruct addYoursStickerStruct = this.addYoursStickerStruct;
        if (addYoursStickerStruct != null) {
            if (!addYoursStickerStruct.equals(interactStickerStruct.addYoursStickerStruct)) {
                return false;
            }
        } else if (interactStickerStruct.addYoursStickerStruct != null) {
            return false;
        }
        LiveShareStickerStruct liveShareStickerStruct = this.liveShareStickerStruct;
        if (liveShareStickerStruct != null) {
            if (!liveShareStickerStruct.equals(interactStickerStruct.liveShareStickerStruct)) {
                return false;
            }
        } else if (interactStickerStruct.liveShareStickerStruct != null) {
            return false;
        }
        CommentPostStickerStruct commentPostStickerStruct = this.commentPostStickerStruct;
        if (commentPostStickerStruct != null) {
            if (!commentPostStickerStruct.equals(interactStickerStruct.commentPostStickerStruct)) {
                return false;
            }
        } else if (interactStickerStruct.commentPostStickerStruct != null) {
            return false;
        }
        EmojiSliderStickerStruct emojiSliderStickerStruct = this.emojiSliderStickerStruct;
        if (emojiSliderStickerStruct != null) {
            if (!emojiSliderStickerStruct.equals(interactStickerStruct.emojiSliderStickerStruct)) {
                return false;
            }
        } else if (interactStickerStruct.emojiSliderStickerStruct != null) {
            return false;
        }
        InteractiveEmojiStickerStruct interactiveEmojiStickerStruct = this.interactiveEmojiStickerStruct;
        if (interactiveEmojiStickerStruct != null) {
            if (!interactiveEmojiStickerStruct.equals(interactStickerStruct.interactiveEmojiStickerStruct)) {
                return false;
            }
        } else if (interactStickerStruct.interactiveEmojiStickerStruct != null) {
            return false;
        }
        LinkStickerStruct linkStickerStruct = this.urlLinkSticker;
        if (linkStickerStruct != null) {
            if (!linkStickerStruct.equals(interactStickerStruct.urlLinkSticker)) {
                return false;
            }
        } else if (interactStickerStruct.urlLinkSticker != null) {
            return false;
        }
        ArticleStickerStruct articleStickerStruct = this.articleSticker;
        if (articleStickerStruct != null) {
            if (!articleStickerStruct.equals(interactStickerStruct.articleSticker)) {
                return false;
            }
        } else if (interactStickerStruct.articleSticker != null) {
            return false;
        }
        SocialAvatarStickerStruct socialAvatarStickerStruct = this.socialAvatarStickerStruct;
        if (socialAvatarStickerStruct != null) {
            if (!socialAvatarStickerStruct.equals(interactStickerStruct.socialAvatarStickerStruct)) {
                return false;
            }
        } else if (interactStickerStruct.socialAvatarStickerStruct != null) {
            return false;
        }
        AttributionLinkStickerStruct attributionLinkStickerStruct = this.attributionLinkStickerStruct;
        if (attributionLinkStickerStruct != null) {
            if (!attributionLinkStickerStruct.equals(interactStickerStruct.attributionLinkStickerStruct)) {
                return false;
            }
        } else if (interactStickerStruct.attributionLinkStickerStruct != null) {
            return false;
        }
        AttributionLinkStoryAnchorStruct attributionLinkStoryAnchorStruct = this.attributionLinkStoryAnchorStruct;
        if (attributionLinkStoryAnchorStruct != null) {
            if (!attributionLinkStoryAnchorStruct.equals(interactStickerStruct.attributionLinkStoryAnchorStruct)) {
                return false;
            }
        } else if (interactStickerStruct.attributionLinkStoryAnchorStruct != null) {
            return false;
        }
        SecretRepliesStickerStruct secretRepliesStickerStruct = this.secretRepliesStickerStruct;
        if (secretRepliesStickerStruct != null) {
            if (!secretRepliesStickerStruct.equals(interactStickerStruct.secretRepliesStickerStruct)) {
                return false;
            }
        } else if (interactStickerStruct.secretRepliesStickerStruct != null) {
            return false;
        }
        String str3 = this.attr;
        String str4 = interactStickerStruct.attr;
        if (str3 != null) {
            return str3.equals(str4);
        }
        if (str4 == null) {
            return true;
        }
        return false;
    }

    public void setAddYoursStickerStruct(AddYoursStickerStruct addYoursStickerStruct) {
        this.addYoursStickerStruct = addYoursStickerStruct;
    }

    public void setArticleSticker(ArticleStickerStruct articleStickerStruct) {
        this.articleSticker = articleStickerStruct;
    }

    public void setAttr(String str) {
        this.attr = str;
    }

    public void setAttributionLinkStickerStruct(AttributionLinkStickerStruct attributionLinkStickerStruct) {
        this.attributionLinkStickerStruct = attributionLinkStickerStruct;
    }

    public void setAttributionLinkStoryAnchorStruct(AttributionLinkStoryAnchorStruct attributionLinkStoryAnchorStruct) {
        this.attributionLinkStoryAnchorStruct = attributionLinkStoryAnchorStruct;
    }

    public void setCaptionStruct(CaptionStruct captionStruct) {
        this.mCaptionStruct = captionStruct;
    }

    public void setCommentPostStickerStruct(CommentPostStickerStruct commentPostStickerStruct) {
        this.commentPostStickerStruct = commentPostStickerStruct;
    }

    public void setCountDownStickerStruct(CountDownStickerStruct countDownStickerStruct) {
        this.mCountDownStickerStruct = countDownStickerStruct;
    }

    public void setEcommerceStickerStruct(EcommerceStickerStruct ecommerceStickerStruct) {
        this.ecommerceStickerStruct = ecommerceStickerStruct;
    }

    public void setEmojiSliderStickerStruct(EmojiSliderStickerStruct emojiSliderStickerStruct) {
        this.emojiSliderStickerStruct = emojiSliderStickerStruct;
    }

    public void setGroupChatStickerStruct(DMGroupChatStickerStruct dMGroupChatStickerStruct) {
        this.groupChatStickerStruct = dMGroupChatStickerStruct;
    }

    public void setHashtagInfo(HashtagStruct hashtagStruct) {
        this.hashtagInfo = hashtagStruct;
    }

    public void setIndex(int i) {
        this.index = i;
    }

    public void setInteractiveEmojiStickerStruct(InteractiveEmojiStickerStruct interactiveEmojiStickerStruct) {
        this.interactiveEmojiStickerStruct = interactiveEmojiStickerStruct;
    }

    public void setLiveShareStickerStruct(LiveShareStickerStruct liveShareStickerStruct) {
        this.liveShareStickerStruct = liveShareStickerStruct;
    }

    public void setLyricStickerStruct(LyricStickerStruct lyricStickerStruct) {
        this.lyricStickerStruct = lyricStickerStruct;
    }

    public void setMaterialIndex(int i) {
        this.materialIndex = i;
    }

    public void setMentionInfo(MentionStruct mentionStruct) {
        this.mentionInfo = mentionStruct;
    }

    public void setMusicStickerStruct(MusicStickerStruct musicStickerStruct) {
        this.musicStickerStruct = musicStickerStruct;
    }

    public void setNoGlobal(boolean z) {
        this.noGlobal = z;
    }

    public void setPoiStickerStruct(PoiStickerStruct poiStickerStruct) {
        this.poiStickerStruct = poiStickerStruct;
    }

    public void setPollStruct(PollStruct pollStruct) {
        this.pollStruct = pollStruct;
    }

    public void setQaStruct(QaStruct qaStruct) {
        this.mQaStruct = qaStruct;
    }

    public void setSecretRepliesResponseStickerStruct(SecretRepliesResponseStickerStruct secretRepliesResponseStickerStruct) {
        this.secretRepliesResponseStickerStruct = secretRepliesResponseStickerStruct;
    }

    public void setSecretRepliesStickerStruct(SecretRepliesStickerStruct secretRepliesStickerStruct) {
        this.secretRepliesStickerStruct = secretRepliesStickerStruct;
    }

    public void setSharedCommentStickerStruct(SharedCommentStickerStruct sharedCommentStickerStruct) {
        this.sharedCommentStickerStruct = sharedCommentStickerStruct;
    }

    public void setSocialAvatarStickerStruct(SocialAvatarStickerStruct socialAvatarStickerStruct) {
        this.socialAvatarStickerStruct = socialAvatarStickerStruct;
    }

    public void setTextInfo(TextStickerInfo textStickerInfo) {
        this.textStickerInfo = textStickerInfo;
    }

    public void setTextStruct(String str) {
        this.mTextStruct = str;
    }

    public void setTrackList(String str) {
        this.trackList = str;
    }

    public void setTrackTimeStampCache(List<NormalTrackTimeStamp> list) {
        this.trackTimeStampCache = list;
    }

    public void setType(int i) {
        this.type = i;
    }

    public void setUrlLinkSticker(LinkStickerStruct linkStickerStruct) {
        this.urlLinkSticker = linkStickerStruct;
    }

    public void setVideoShareInfoStruct(VideoShareInfoStruct videoShareInfoStruct) {
        this.videoShareInfoStruct = videoShareInfoStruct;
    }
}
