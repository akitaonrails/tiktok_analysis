package com.ss.android.ugc.aweme.comment.model;

import X.AbstractC2126608Uu;
import X.C09CT;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.feed.model.RelationDynamicLabel;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes22.dex */
public class Comment extends AbstractC2126608Uu implements Serializable, Cloneable {
    public static final long serialVersionUID = -8417684736500467488L;

    @C09CT("ad_flag")
    public int adFlag;

    @C09CT("alias_aweme")
    public Aweme aliasAweme;

    @C09CT("allow_download_photo")
    public Boolean allowDownloadPhoto;

    @C09CT("cmt_audio_struct")
    public CmtAudioStruct audioStruct;
    public boolean audioTextIsTranslated;

    @C09CT("author_pin")
    public boolean authorPin;

    @C09CT("aweme_id")
    public String awemeId;

    @C09CT("raw_ad_data")
    public AwemeRawAd awemeRawAd;

    @C09CT("bury_count")
    public int buryCount;

    @C09CT("can_add_as_post")
    public Boolean canAddAsPost;
    public transient Boolean canPreloadCommentReply;

    @C09CT("preload_control")
    public int canPreloadFromServerScore;

    @C09CT("cid")
    public String cid;

    @C09CT("collect_stat")
    public int collectStat;

    @C09CT("intention")
    public CommentIntentStruct commentIntentStruct;

    @C09CT("comment_language")
    public String commentLanguage;
    public String commentPostCreationId;

    @C09CT("comment_post_item_ids")
    public List<String> commentPostItemList;
    public float commentPostProgress;
    public int commentPostStatus;

    @C09CT("comment_type")
    public int commentStructType;

    @C09CT("commerce_info")
    public CommerceCommentStruct commerceInfo;

    @C09CT("create_time")
    public int createTime;
    public transient int curTextLimitedLines;
    public int curTextMaxLines;

    @C09CT("digg_count")
    public int diggCount;

    @C09CT("disable_share_to_dm_reason")
    public int disableShareToDmReason;
    public String editImageBitmap;
    public transient int expandCount;
    public transient long fakeGiftId;
    public transient boolean fakeIsFromGiftBag;
    public transient boolean fetchingAsrText;

    @C09CT("fold_status")
    public Integer foldStatus;

    @C09CT("forbid_reply_with_video")
    public boolean forbidVideoReply;

    @C09CT("forward_id")
    public String forwardId;

    @C09CT("gift")
    public CommentGiftStruct gift;

    @C09CT("is_first_visitor_cmt")
    public boolean hasFirstCommentTag;
    public transient Boolean hasPreTriggeredFirstCommentSurprise;
    public transient Boolean hasShownFirstCommentTagAnimation;
    public int highLightedWordCount;

    @C09CT("hot_comment_show_type")
    public Integer hotCommentShowType;
    public transient boolean ignoreToast;

    @C09CT("image_list")
    public List<CommentImageStruct> imageList;

    @C09CT("informational_comment_status")
    public String informationalCommentStatus;
    public transient boolean isAudioTextExpanded;

    @C09CT("is_author_digged")
    public boolean isAuthorDigged;
    public boolean isCommentPostChecked;

    @C09CT("is_comment_translatable")
    public Boolean isCommentTranslatable;
    public boolean isDefaultExpandComment;
    public boolean isExpand;
    public int isFakeByGuideReply;
    public transient boolean isFromCollect;
    public boolean isFromKeyboard;

    @C09CT("is_high_purchase_intent")
    public boolean isHighPurchaseIntent;
    public boolean isLastSplitItem;
    public transient boolean isStoryEmojiComment;

    @C09CT("is_tako_generated")
    public boolean isTakoGenerated;
    public boolean isTranslated;

    @C09CT("label_info")
    public String labelInfo;

    @C09CT("label_text")
    public String labelText;

    @C09CT("label_type")
    public int labelType;
    public LogPbBean logPb;
    public int mCommentType;

    @C09CT("label_list")
    public List<CommentLabel> mLabelList;
    public boolean mNeedHint;
    public String mTimeDesc;
    public String mUserNamePrefix;
    public boolean needCollapse;
    public boolean needHighlight;
    public boolean needRemoveOtherSpan;
    public transient Boolean needShowFirstCommentTagAnimation;
    public transient int offset;
    public transient String originalText;

    @C09CT("photo_sticker_convert_entry_status")
    public Integer photoConvertStickerEntry;
    public transient int publishScenario;

    @C09CT("qrec_virtual_enable")
    public String qrecVirtualEnable;

    @C09CT("relation_label")
    public RelationDynamicLabel relationLabel;

    @C09CT("reply_comment_total")
    public long replyCommentTotal;

    @C09CT("reply_comment")
    public List<Comment> replyComments;

    @C09CT("reply_count")
    public int replyCount;

    @C09CT("reply_to_nickname")
    public String replyToNickName;

    @C09CT("reply_to_reply_id")
    public String replyToReplyId;

    @C09CT("reply_to_tako")
    public boolean replyToTako;

    @C09CT("reply_to_userid")
    public String replyToUserId;

    @C09CT("reply_to_username")
    public String replyToUserName;
    public transient int rethinkPopType;

    @C09CT("reply_id")
    public String rootCommentId;

    @C09CT("seeking_help_model_type")
    public Integer seekingHelpModelType;

    @C09CT("semantic_label")
    public String semanticLabel;

    @C09CT("share_info")
    public CommentShareInfo shareInfo;
    public transient boolean shouldDisplayFakeComment;

    @C09CT("sort_extra_score")
    public Map<String, Double> sortExtraScoreMap;

    @C09CT("sort_tags")
    public String sortTags;

    @C09CT("stick_position")
    public int stickPosition;

    @C09CT("cmt_sticker_struct")
    public CommentStickerStruct stickerStruct;

    @C09CT("text")
    public String text;

    @C09CT("text_extra")
    public List<TextExtraStruct> textExtra;

    @C09CT("text_to_image_item_ids")
    public List<String> textImageCommentPostItemList;

    @C09CT("thread_has_more")
    public Boolean threadHasMore;

    @C09CT("thread_id")
    public Long threadId;

    @C09CT("reply_collapse_count")
    public Integer topCount;

    @C09CT("trans_btn_style")
    public int transBtnStyle;

    @C09CT("translated_text")
    public String translatedText;

    @C09CT("user")
    public User user;

    @C09CT("user_badge_info")
    public CmtUserBadgeInfoStruct userBadgeInfo;

    @C09CT("user_buried")
    public int userBuried;

    @C09CT("user_digged")
    public int userDigged;

    @C09CT("user_vote_info")
    public UserVoteInfo userVoteInfo;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status = -1;
    public String translateVariant = "";
    public transient String giftEffectPath = "";
    public int parentCommentType = 1;
    public String linkProductAnchorSchema = "";
    public transient String fakeId = "";
    public transient int postStatus = -1;
    public transient String timeFormat = "";
    public transient String noticeRepliedCid = "";

    public interface CommentTranslateBtnType {
    }

    public interface LabelType {
    }

    public void resetFirstCommentTag() {
        this.hasFirstCommentTag = false;
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public Comment m169clone() {
        Comment comment = new Comment();
        comment.cid = this.cid;
        comment.text = this.text;
        comment.awemeId = this.awemeId;
        comment.createTime = this.createTime;
        comment.diggCount = this.diggCount;
        comment.status = this.status;
        comment.user = this.user;
        comment.rootCommentId = this.rootCommentId;
        comment.userDigged = this.userDigged;
        comment.qrecVirtualEnable = this.qrecVirtualEnable;
        if (this.replyComments != null) {
            ArrayList arrayList = new ArrayList(this.replyComments.size());
            Iterator<Comment> it2 = this.replyComments.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().m169clone());
            }
            comment.replyComments = arrayList;
        }
        if (this.textExtra != null) {
            ArrayList arrayList2 = new ArrayList(this.textExtra.size());
            Iterator<TextExtraStruct> it3 = this.textExtra.iterator();
            while (it3.hasNext()) {
                arrayList2.add(it3.next().m271clone());
            }
            comment.textExtra = arrayList2;
        }
        comment.labelText = this.labelText;
        comment.labelType = this.labelType;
        comment.relationLabel = this.relationLabel == null ? null : new RelationDynamicLabel() { // from class: com.ss.android.ugc.aweme.comment.model.Comment.1
            {
                setNickname(Comment.this.relationLabel.getNickname());
                setLabelInfo(Comment.this.relationLabel.getLabelInfo());
                setUserId(Comment.this.relationLabel.getUserId());
                setCount(Comment.this.relationLabel.getCount());
            }
        };
        comment.forwardId = this.forwardId;
        comment.replyCommentTotal = this.replyCommentTotal;
        comment.replyToReplyId = this.replyToReplyId;
        comment.replyToUserName = this.replyToUserName;
        comment.replyToNickName = this.replyToNickName;
        comment.replyToUserId = this.replyToUserId;
        comment.mCommentType = this.mCommentType;
        comment.commentStructType = this.commentStructType;
        comment.stickPosition = this.stickPosition;
        comment.aliasAweme = this.aliasAweme;
        comment.mLabelList = this.mLabelList;
        comment.topCount = this.topCount;
        comment.commerceInfo = this.commerceInfo;
        comment.transBtnStyle = this.transBtnStyle;
        comment.translatedText = this.translatedText;
        comment.isTranslated = this.isTranslated;
        comment.isCommentTranslatable = this.isCommentTranslatable;
        comment.translateVariant = this.translateVariant;
        comment.imageList = this.imageList;
        comment.stickerStruct = this.stickerStruct;
        comment.commentPostItemList = this.commentPostItemList;
        comment.textImageCommentPostItemList = this.textImageCommentPostItemList;
        comment.collectStat = this.collectStat;
        comment.forbidVideoReply = this.forbidVideoReply;
        comment.disableShareToDmReason = this.disableShareToDmReason;
        comment.hasFirstCommentTag = this.hasFirstCommentTag;
        comment.userVoteInfo = this.userVoteInfo;
        comment.sortExtraScoreMap = this.sortExtraScoreMap;
        comment.sortTags = this.sortTags;
        comment.commentIntentStruct = this.commentIntentStruct;
        comment.isHighPurchaseIntent = this.isHighPurchaseIntent;
        comment.allowDownloadPhoto = this.allowDownloadPhoto;
        comment.foldStatus = this.foldStatus;
        comment.fakeId = this.fakeId;
        comment.hotCommentShowType = this.hotCommentShowType;
        CmtAudioStruct cmtAudioStruct = this.audioStruct;
        comment.audioStruct = cmtAudioStruct != null ? (CmtAudioStruct) cmtAudioStruct.clone() : null;
        comment.audioTextIsTranslated = this.audioTextIsTranslated;
        return comment;
    }

    public Boolean getCanPreloadFromServerScore() {
        return Boolean.valueOf(this.canPreloadFromServerScore > 0);
    }

    public int getCommentMediaType() {
        List<CommentImageStruct> list = this.imageList;
        if (list != null && !list.isEmpty()) {
            return 1;
        }
        if (this.stickerStruct != null) {
            return 4;
        }
        if (this.aliasAweme != null) {
            return 3;
        }
        return getIsAudioContained() == 1 ? 5 : 0;
    }

    public String getDirectReplyCid() {
        return (TextUtils.isEmpty(this.replyToReplyId) || CardStruct.IStatusCode.DEFAULT.equals(this.replyToReplyId)) ? (TextUtils.isEmpty(this.rootCommentId) || CardStruct.IStatusCode.DEFAULT.equals(this.rootCommentId)) ? "" : this.rootCommentId : this.replyToReplyId;
    }

    public String getFakeId() {
        String str = this.fakeId;
        return str == null ? "" : str;
    }

    public int getIsAudioContained() {
        CmtAudioStruct cmtAudioStruct = this.audioStruct;
        if (cmtAudioStruct != null) {
            return (TextUtils.isEmpty(cmtAudioStruct.getVid()) && TextUtils.isEmpty(this.audioStruct.getLocalPath())) ? 0 : 1;
        }
        return 0;
    }

    public int getIsPhotoContained() {
        List<CommentImageStruct> list = this.imageList;
        return (list == null || list.isEmpty()) ? 0 : 1;
    }

    public Double getReplyScore() {
        Map<String, Double> map = this.sortExtraScoreMap;
        if (map != null && map.containsKey("reply_score")) {
            return this.sortExtraScoreMap.get("reply_score");
        }
        return null;
    }

    public int hashCode() {
        String str = this.cid;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public boolean isCollected() {
        return this.collectStat == 1;
    }

    public boolean isUserBuried() {
        return this.userBuried == 1;
    }

    public boolean isUserDigged() {
        return this.userDigged == 1;
    }

    public Comment() {
        Boolean bool = Boolean.FALSE;
        this.canPreloadCommentReply = bool;
        this.needShowFirstCommentTagAnimation = bool;
        this.hasShownFirstCommentTagAnimation = bool;
        this.hasPreTriggeredFirstCommentSurprise = bool;
        this.editImageBitmap = null;
        this.curTextMaxLines = 6;
        this.curTextLimitedLines = 6;
        this.expandCount = 0;
        this.highLightedWordCount = 0;
        this.isLastSplitItem = false;
        this.isAudioTextExpanded = false;
        this.audioTextIsTranslated = false;
        this.rethinkPopType = 0;
        this.originalText = "";
        this.isFromCollect = false;
    }

    public boolean enableRemoveOtherSpan() {
        return this.needRemoveOtherSpan;
    }

    public int getAdFlag() {
        return this.adFlag;
    }

    public Aweme getAliasAweme() {
        return this.aliasAweme;
    }

    public Boolean getAllowDownloadPhoto() {
        return this.allowDownloadPhoto;
    }

    public CmtAudioStruct getAudioStruct() {
        return this.audioStruct;
    }

    public String getAwemeId() {
        return this.awemeId;
    }

    public AwemeRawAd getAwemeRawAd() {
        return this.awemeRawAd;
    }

    public int getBuryCount() {
        return this.buryCount;
    }

    public Boolean getCanAddAsPost() {
        return this.canAddAsPost;
    }

    public Boolean getCanPreloadCommentReply() {
        return this.canPreloadCommentReply;
    }

    public String getCid() {
        return this.cid;
    }

    public CmtUserBadgeInfoStruct getCmtUserBadgeInfoStruct() {
        return this.userBadgeInfo;
    }

    public String getCommentLanguage() {
        return this.commentLanguage;
    }

    public String getCommentPostCreationId() {
        return this.commentPostCreationId;
    }

    public List<String> getCommentPostItemList() {
        return this.commentPostItemList;
    }

    public float getCommentPostProgress() {
        return this.commentPostProgress;
    }

    public int getCommentPostStatus() {
        return this.commentPostStatus;
    }

    public int getCommentStructType() {
        return this.commentStructType;
    }

    public int getCommentType() {
        return this.mCommentType;
    }

    public CommerceCommentStruct getCommerceInfo() {
        return this.commerceInfo;
    }

    public int getCreateTime() {
        return this.createTime;
    }

    public int getCurTextLimitedLines() {
        return this.curTextLimitedLines;
    }

    public int getCurTextMaxLines() {
        return this.curTextMaxLines;
    }

    public int getDiggCount() {
        return this.diggCount;
    }

    public int getDisableShareToDmReason() {
        return this.disableShareToDmReason;
    }

    public String getEditImageBitmap() {
        return this.editImageBitmap;
    }

    public int getExpandCount() {
        return this.expandCount;
    }

    public long getFakeGiftId() {
        return this.fakeGiftId;
    }

    public boolean getFakeIsFromGiftBag() {
        return this.fakeIsFromGiftBag;
    }

    public Integer getFoldStatus() {
        return this.foldStatus;
    }

    public boolean getForbidVideoReply() {
        return this.forbidVideoReply;
    }

    public String getForwardId() {
        return this.forwardId;
    }

    public CommentGiftStruct getGift() {
        return this.gift;
    }

    public String getGiftEffectPath() {
        return this.giftEffectPath;
    }

    public Boolean getHasPreTriggeredFirstCommentSurprise() {
        return this.hasPreTriggeredFirstCommentSurprise;
    }

    public Boolean getHasShownFirstCommentTagAnimation() {
        return this.hasShownFirstCommentTagAnimation;
    }

    public int getHighLightedWordCount() {
        return this.highLightedWordCount;
    }

    public Integer getHotCommentShowType() {
        return this.hotCommentShowType;
    }

    public List<CommentImageStruct> getImageList() {
        return this.imageList;
    }

    public String getInformationCommentStatus() {
        return this.informationalCommentStatus;
    }

    public CommentIntentStruct getIntentStruct() {
        return this.commentIntentStruct;
    }

    public boolean getIsCommentPostChecked() {
        return this.isCommentPostChecked;
    }

    public boolean getIsFromCollect() {
        return this.isFromCollect;
    }

    public boolean getIsTakoGenerated() {
        return this.isTakoGenerated;
    }

    public String getLabelInfo() {
        return this.labelInfo;
    }

    public List<CommentLabel> getLabelList() {
        return this.mLabelList;
    }

    public String getLabelText() {
        return this.labelText;
    }

    public int getLabelType() {
        return this.labelType;
    }

    public String getLinkProductAnchorSchema() {
        return this.linkProductAnchorSchema;
    }

    public LogPbBean getLogPb() {
        return this.logPb;
    }

    public Boolean getNeedShowFirstCommentTagAnimation() {
        return this.needShowFirstCommentTagAnimation;
    }

    public String getNoticeRepliedCid() {
        return this.noticeRepliedCid;
    }

    public String getOriginalText() {
        return this.originalText;
    }

    public Integer getPhoto2StickerEntry() {
        return this.photoConvertStickerEntry;
    }

    public int getPostStatus() {
        return this.postStatus;
    }

    public int getPublishScenario() {
        return this.publishScenario;
    }

    public String getQrecVirtualEnable() {
        return this.qrecVirtualEnable;
    }

    public RelationDynamicLabel getRelationLabel() {
        return this.relationLabel;
    }

    public long getReplyCommentTotal() {
        return this.replyCommentTotal;
    }

    public List<Comment> getReplyComments() {
        return this.replyComments;
    }

    public int getReplyCount() {
        return this.replyCount;
    }

    public String getReplyToNickName() {
        return this.replyToNickName;
    }

    public String getReplyToReplyCommentId() {
        return this.replyToReplyId;
    }

    public boolean getReplyToTako() {
        return this.replyToTako;
    }

    public String getReplyToUserId() {
        return this.replyToUserId;
    }

    public String getReplyToUserName() {
        return this.replyToUserName;
    }

    public int getRethinkPopType() {
        return this.rethinkPopType;
    }

    public String getRootCommentId() {
        return this.rootCommentId;
    }

    public Integer getSeekingHelpModelType() {
        return this.seekingHelpModelType;
    }

    public String getSemanticLabel() {
        return this.semanticLabel;
    }

    public CommentShareInfo getShareInfo() {
        return this.shareInfo;
    }

    public boolean getShouldDisplayFakeComment() {
        return this.shouldDisplayFakeComment;
    }

    public String getSortTags() {
        return this.sortTags;
    }

    public int getStatus() {
        return this.status;
    }

    public int getStickPosition() {
        return this.stickPosition;
    }

    public CommentStickerStruct getStickerStruct() {
        return this.stickerStruct;
    }

    public String getText() {
        return this.text;
    }

    public List<TextExtraStruct> getTextExtra() {
        return this.textExtra;
    }

    public List<String> getTextImageCommentPostItemList() {
        return this.textImageCommentPostItemList;
    }

    public Boolean getThreadHasMore() {
        return this.threadHasMore;
    }

    public Long getThreadId() {
        return this.threadId;
    }

    public String getTimeFormat() {
        return this.timeFormat;
    }

    public Integer getTopCount() {
        return this.topCount;
    }

    public int getTransBtnStyle() {
        return this.transBtnStyle;
    }

    public String getTranslateVariant() {
        return this.translateVariant;
    }

    public String getTranslatedText() {
        return this.translatedText;
    }

    public User getUser() {
        return this.user;
    }

    public int getUserBuried() {
        return this.userBuried;
    }

    public int getUserDigged() {
        return this.userDigged;
    }

    public boolean isAudioTextExpanded() {
        return this.isAudioTextExpanded;
    }

    public boolean isAudioTextIsTranslated() {
        return this.audioTextIsTranslated;
    }

    public boolean isAuthorDigged() {
        return this.isAuthorDigged;
    }

    public boolean isAuthorPin() {
        return this.authorPin;
    }

    public Boolean isCommentTranslatable() {
        return this.isCommentTranslatable;
    }

    public boolean isFetchingAsrText() {
        return this.fetchingAsrText;
    }

    public boolean isIgnoreToast() {
        return this.ignoreToast;
    }

    public boolean isNeedHint() {
        return this.mNeedHint;
    }

    public boolean isStoryEmojiComment() {
        return this.isStoryEmojiComment;
    }

    public boolean isTranslated() {
        return this.isTranslated;
    }

    public static String getAuthorUid(Comment comment) {
        User user;
        if (comment == null || (user = comment.getUser()) == null) {
            return "";
        }
        return user.getUid();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return TextUtils.equals(this.cid, ((Comment) obj).cid);
        }
        return false;
    }

    public void setAliasAweme(Aweme aweme) {
        this.aliasAweme = aweme;
    }

    public void setAudioStruct(CmtAudioStruct cmtAudioStruct) {
        this.audioStruct = cmtAudioStruct;
    }

    public void setAudioTextExpanded(boolean z) {
        this.isAudioTextExpanded = z;
    }

    public void setAudioTextIsTranslated(boolean z) {
        this.audioTextIsTranslated = z;
    }

    public void setAuthorDigged(boolean z) {
        this.isAuthorDigged = z;
    }

    public void setAuthorPin(boolean z) {
        this.authorPin = z;
    }

    public void setAwemeId(String str) {
        this.awemeId = str;
    }

    public void setAwemeRawAd(AwemeRawAd awemeRawAd) {
        this.awemeRawAd = awemeRawAd;
    }

    public void setCanAddAsPost(Boolean bool) {
        this.canAddAsPost = bool;
    }

    public void setCanPreloadCommentReply(Boolean bool) {
        this.canPreloadCommentReply = bool;
    }

    public void setCid(String str) {
        this.cid = str;
    }

    public void setCmtUserBadgeInfoStruct(CmtUserBadgeInfoStruct cmtUserBadgeInfoStruct) {
        this.userBadgeInfo = cmtUserBadgeInfoStruct;
    }

    public void setCollectStatus(int i) {
        this.collectStat = i;
    }

    public void setCommentPostCreationId(String str) {
        this.commentPostCreationId = str;
    }

    public void setCommentPostItemList(List<String> list) {
        this.commentPostItemList = list;
    }

    public void setCommentPostProgress(float f) {
        this.commentPostProgress = f;
    }

    public void setCommentPostStatus(int i) {
        this.commentPostStatus = i;
    }

    public void setCommentStructType(int i) {
        this.commentStructType = i;
    }

    public void setCommentType(int i) {
        this.mCommentType = i;
    }

    public void setCommerceInfo(CommerceCommentStruct commerceCommentStruct) {
        this.commerceInfo = commerceCommentStruct;
    }

    public void setCreateTime(int i) {
        this.createTime = i;
    }

    public void setCurTextLimitedLines(int i) {
        this.curTextLimitedLines = i;
    }

    public void setCurTextMaxLines(int i) {
        this.curTextMaxLines = i;
    }

    public void setDiggCount(int i) {
        this.diggCount = i;
    }

    public void setEditImageBitmap(String str) {
        this.editImageBitmap = str;
    }

    public void setEnableRemoveOtherSpan(boolean z) {
        this.needRemoveOtherSpan = z;
    }

    public void setExpandCount(int i) {
        this.expandCount = i;
    }

    public void setFakeGiftId(long j) {
        this.fakeGiftId = j;
    }

    public void setFakeId(String str) {
        this.fakeId = str;
    }

    public void setFakeIsFromGiftBag(boolean z) {
        this.fakeIsFromGiftBag = z;
    }

    public void setFetchingAsrText(boolean z) {
        this.fetchingAsrText = z;
    }

    public void setFoldStatus(Integer num) {
        this.foldStatus = num;
    }

    public void setForwardId(String str) {
        this.forwardId = str;
    }

    public void setGift(CommentGiftStruct commentGiftStruct) {
        this.gift = commentGiftStruct;
    }

    public void setGiftEffectPath(String str) {
        this.giftEffectPath = str;
    }

    public void setHasPreTriggeredFirstCommentSurprise(Boolean bool) {
        this.hasPreTriggeredFirstCommentSurprise = bool;
    }

    public void setHasShownFirstCommentTagAnimation(Boolean bool) {
        this.hasShownFirstCommentTagAnimation = bool;
    }

    public void setHighLightedWordCount(int i) {
        this.highLightedWordCount = i;
    }

    public void setHotCommentShowType(Integer num) {
        this.hotCommentShowType = num;
    }

    public void setIgnoreToast(boolean z) {
        this.ignoreToast = z;
    }

    public void setImageList(List<CommentImageStruct> list) {
        this.imageList = list;
    }

    public void setInformationalCommentStatus(String str) {
        this.informationalCommentStatus = str;
    }

    public void setIsCommentPostChecked(boolean z) {
        this.isCommentPostChecked = z;
    }

    public void setIsFromCollect(boolean z) {
        this.isFromCollect = z;
    }

    public void setIsTakoGenerated(boolean z) {
        this.isTakoGenerated = z;
    }

    public void setLabelInfo(String str) {
        this.labelInfo = str;
    }

    public void setLabelList(List<CommentLabel> list) {
        this.mLabelList = list;
    }

    public void setLabelText(String str) {
        this.labelText = str;
    }

    public void setLabelType(int i) {
        this.labelType = i;
    }

    public void setLinkProductAnchorSchema(String str) {
        this.linkProductAnchorSchema = str;
    }

    public void setLogPb(LogPbBean logPbBean) {
        this.logPb = logPbBean;
    }

    public void setNeedHint(boolean z) {
        this.mNeedHint = z;
    }

    public void setNeedShowFirstCommentTagAnimation(Boolean bool) {
        this.needShowFirstCommentTagAnimation = bool;
    }

    public void setNoticeRepliedCid(String str) {
        this.noticeRepliedCid = str;
    }

    public void setOriginalText(String str) {
        this.originalText = str;
    }

    public void setPostStatus(int i) {
        this.postStatus = i;
    }

    public void setPublishScenario(int i) {
        this.publishScenario = i;
    }

    public void setRelationLabel(RelationDynamicLabel relationDynamicLabel) {
        this.relationLabel = relationDynamicLabel;
    }

    public void setReplyCommentTotal(long j) {
        this.replyCommentTotal = j;
    }

    public void setReplyComments(List<Comment> list) {
        this.replyComments = list;
    }

    public void setReplyToNickName(String str) {
        this.replyToNickName = str;
    }

    public void setReplyToReplyId(String str) {
        this.replyToReplyId = str;
    }

    public void setReplyToTako(boolean z) {
        this.replyToTako = z;
    }

    public void setReplyToUserId(String str) {
        this.replyToUserId = str;
    }

    public void setReplyToUserName(String str) {
        this.replyToUserName = str;
    }

    public void setRethinkPopType(int i) {
        this.rethinkPopType = i;
    }

    public void setRootCommentId(String str) {
        this.rootCommentId = str;
    }

    public void setSemanticLabel(String str) {
        this.semanticLabel = str;
    }

    public void setShareInfo(CommentShareInfo commentShareInfo) {
        this.shareInfo = commentShareInfo;
    }

    public void setShouldDisplayFakeComment(boolean z) {
        this.shouldDisplayFakeComment = z;
    }

    public void setStatus(int i) {
        this.status = i;
    }

    public void setStickPosition(int i) {
        this.stickPosition = i;
    }

    public void setStickerStruct(CommentStickerStruct commentStickerStruct) {
        this.stickerStruct = commentStickerStruct;
    }

    public void setStoryEmojiComment(boolean z) {
        this.isStoryEmojiComment = z;
    }

    public void setText(String str) {
        this.text = str;
    }

    public void setTextExtra(List<TextExtraStruct> list) {
        this.textExtra = list;
    }

    public void setTextImageCommentPostItemList(List<String> list) {
        this.textImageCommentPostItemList = list;
    }

    public void setThreadHasMore(Boolean bool) {
        this.threadHasMore = bool;
    }

    public void setThreadId(Long l) {
        this.threadId = l;
    }

    public void setTimeFormat(String str) {
        this.timeFormat = str;
    }

    public void setTransBtnStyle(int i) {
        this.transBtnStyle = i;
    }

    public void setTranslateVariant(String str) {
        this.translateVariant = str;
    }

    public void setTranslated(boolean z) {
        this.isTranslated = z;
    }

    public void setTranslatedText(String str) {
        this.translatedText = str;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setUserBuried(int i) {
        this.userBuried = i;
    }

    public void setUserDigged(int i) {
        this.userDigged = i;
    }
}
