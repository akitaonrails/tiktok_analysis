package com.ss.android.ugc.aweme.discover.model;

import X.AbstractC2126608Uu;
import X.C09CS;
import X.C09CT;
import X.InterfaceC2126708Uv;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.share.ShareInfo;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.HighlightInfo;
import com.ss.android.ugc.aweme.utils.JsonToStringAdapter;
import com.ss.android.ugc.aweme.utils.ReplaceLineEndAdapter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes30.dex */
public class Challenge extends AbstractC2126608Uu implements Serializable {

    @C09CT("activity_type")
    public int activityType;

    @C09CT("allow_upload_cover")
    public int allowUploadCover;

    @C09CT("cha_attrs")
    public List<String> attrs;

    @C09CT("author")
    public User author;

    @C09CT("av_music_id")
    public String avMusicId;

    @C09CT("background_image_url")
    public UrlModel backgroundImageUrl;

    @C09CT("announcement_info")
    public ChallengeAnnouncement challengeAnnouncement;

    @C09CT("cover_photo")
    public String challengeBgUrl;

    @C09CT("challenge_billboard")
    public ChallengeBillboard challengeBillboard;

    @C09CT("disclaimer")
    public ChallengeDisclaimer challengeDisclaimer;

    @C09CT("cha_name")
    public String challengeName;

    @C09CT("hashtag_profile")
    public String challengeProfileUrl;

    @C09CT("sticker_detail")
    @C09CS(JsonToStringAdapter.class)
    public String challengeStickerDetail;

    @C09CT("cid")
    @InterfaceC2126708Uv
    public String cid;

    @C09CT("collect_stat")
    public int collectStatus;

    @C09CT("banner_list")
    public List<CommerceChallengeBanner> commerceChallengeBannerList;

    @C09CT("connect_music")
    public List<Music> connectMusics;

    @C09CT("content_type")
    public int contentType;

    @C09CT("cover_item")
    public UrlModel coverItem;

    @C09CT("desc")
    @C09CS(ReplaceLineEndAdapter.class)
    public String desc;

    @C09CT("dynamic_list")
    public List<DynamicPatch> dynamicPatchList;

    @C09CT("end_color")
    public String endColor;

    @C09CT("extra_attr")
    public ChallengeExtraAttrStruct extraAttrStruct;

    @C09CT("mission_module")
    public HTCMissionModule htcMissionModule;

    @C09CT("inquiry")
    public InquiryStruct inquiryStruct;

    @C09CT("is_challenge")
    public int isChallenge;

    @C09CT("is_commerce")
    public boolean isCommerceAndValid;

    @C09CT("is_hot_search")
    public int isHotSearch;

    @C09CT("is_strong_music")
    public int isStrongMusic;

    @C09CT("link_action")
    public String linkAction;

    @C09CT("link_text")
    public String linkText;

    @C09CT("link_title")
    public String linkTitle;

    @C09CT("link_type")
    public int linkType;

    @C09CT("background_gradient")
    public BackGroundGradient mBackGroundGradient;

    @C09CT("search_highlight")
    public List<HighlightInfo> mHighlightInfoList;

    @C09CT("search_cha_name")
    public String mSearchChaName;

    @C09CT("is_status")
    public int mStatus;

    @C09CT("related_media_source")
    public RelatedMediaSourceStruct mediaSource;

    @C09CT("module_type")
    public int moduleType;

    @C09CT("mv_id")
    public String mvId;

    @C09CT("label_origin_author")
    public String originAuthor;

    @C09CT("is_pgcshow")
    public boolean pgcshow;

    @C09CT("profile_tag")
    public String profileTagUrl;
    public String requestId;

    @C09CT("rule_detail_desc")
    public String ruleDetailDesc;

    @C09CT("rule_detail_url")
    public String ruleDetailUrl;

    @C09CT("schema")
    public String schema;

    @C09CT("share_info")
    public ShareInfo shareInfo;

    @C09CT("show_items")
    public List<ShowItemsStruct> showItems;

    @C09CT("sponsor_ad_label")
    public String sponsorAdLabel;

    @C09CT("sponsor_label_text")
    public String sponsorLabelText;

    @C09CT("start_color")
    public String starColor;

    @C09CT("sticker_id")
    public String stickerId;

    @C09CT("sub_type")
    public int subType;

    @C09CT("tag")
    public int tag;

    @C09CT("button")
    public ChallengeTransform transfrom;

    @C09CT("type")
    public int type;

    @C09CT("user_count")
    public int userCount;

    @C09CT("use_count")
    public long useCount = -1;

    @C09CT("view_count")
    public long viewCount = -1;

    @C09CT("related_challenges")
    public List<Challenge> relatedChallenges = new ArrayList();

    @C09CT("commerce_sub_type")
    public int commerceSubType = 0;

    public interface ChallengeSubType {
    }

    public boolean allowUploadCover() {
        return this.allowUploadCover == 1;
    }

    public int hashCode() {
        String str = this.cid;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public boolean isChallenge() {
        return this.isChallenge == 1;
    }

    public boolean isCommerce() {
        return this.subType == 1;
    }

    public boolean isLinkActionAsOpenUrl() {
        return this.linkType == 7;
    }

    public boolean isStrongMusic() {
        return this.isStrongMusic == 1;
    }

    public boolean isTrending() {
        return this.isHotSearch == 1;
    }

    public boolean isVsChallenge() {
        return this.activityType == 1;
    }

    public long getDisplayCount() {
        long viewCount = getViewCount();
        return viewCount < 0 ? getUserCount() : viewCount;
    }

    public int getActivityType() {
        return this.activityType;
    }

    public List<String> getAttrs() {
        return this.attrs;
    }

    public User getAuthor() {
        return this.author;
    }

    public String getAvMusicId() {
        return this.avMusicId;
    }

    public BackGroundGradient getBackGroundGradient() {
        return this.mBackGroundGradient;
    }

    public UrlModel getBackgroundImageUrl() {
        return this.backgroundImageUrl;
    }

    public ChallengeAnnouncement getChallengeAnnouncement() {
        return this.challengeAnnouncement;
    }

    public String getChallengeBgUrl() {
        return this.challengeBgUrl;
    }

    public ChallengeDisclaimer getChallengeDisclaimer() {
        return this.challengeDisclaimer;
    }

    public String getChallengeName() {
        return this.challengeName;
    }

    public String getChallengeProfileUrl() {
        return this.challengeProfileUrl;
    }

    public String getChallengeStickerDetail() {
        return this.challengeStickerDetail;
    }

    public String getCid() {
        return this.cid;
    }

    public int getCollectStatus() {
        return this.collectStatus;
    }

    public List<Music> getConnectMusics() {
        return this.connectMusics;
    }

    public int getContentType() {
        return this.contentType;
    }

    public UrlModel getCoverItem() {
        return this.coverItem;
    }

    public String getDesc() {
        return this.desc;
    }

    public List<DynamicPatch> getDynamicPatchList() {
        return this.dynamicPatchList;
    }

    public String getEndColor() {
        return this.endColor;
    }

    public List<HighlightInfo> getHighlightInfoList() {
        return this.mHighlightInfoList;
    }

    public HTCMissionModule getHtcMissionModule() {
        return this.htcMissionModule;
    }

    public String getLinkAction() {
        return this.linkAction;
    }

    public String getLinkText() {
        return this.linkText;
    }

    public String getLinkTitle() {
        return this.linkTitle;
    }

    public RelatedMediaSourceStruct getMediaSource() {
        return this.mediaSource;
    }

    public int getModuleType() {
        return this.moduleType;
    }

    public String getMvId() {
        return this.mvId;
    }

    public String getProfileTagUrl() {
        return this.profileTagUrl;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public String getRuleDetailDesc() {
        return this.ruleDetailDesc;
    }

    public String getRuleDetailUrl() {
        return this.ruleDetailUrl;
    }

    public String getSchema() {
        return this.schema;
    }

    public String getSearchChaName() {
        return this.mSearchChaName;
    }

    public ShareInfo getShareInfo() {
        return this.shareInfo;
    }

    public String getSponsorAdLabel() {
        return this.sponsorAdLabel;
    }

    public String getSponsorLabelText() {
        return this.sponsorLabelText;
    }

    public String getStarColor() {
        return this.starColor;
    }

    public int getStatus() {
        return this.mStatus;
    }

    public String getStickerId() {
        return this.stickerId;
    }

    public int getSubType() {
        return this.subType;
    }

    public int getTag() {
        return this.tag;
    }

    public ChallengeTransform getTransfrom() {
        return this.transfrom;
    }

    public int getType() {
        return this.type;
    }

    public long getUseCount() {
        return this.useCount;
    }

    public int getUserCount() {
        return this.userCount;
    }

    public long getViewCount() {
        return this.viewCount;
    }

    public boolean isCommerceAndValid() {
        return this.isCommerceAndValid;
    }

    public boolean isPgcshow() {
        return this.pgcshow;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Challenge)) {
            return false;
        }
        return TextUtils.equals(this.cid, ((Challenge) obj).cid);
    }

    public void setActivityType(int i) {
        this.activityType = i;
    }

    public void setAuthor(User user) {
        this.author = user;
    }

    public void setAvMusicId(String str) {
        this.avMusicId = str;
    }

    public void setBackGroundGradient(BackGroundGradient backGroundGradient) {
        this.mBackGroundGradient = backGroundGradient;
    }

    public void setBackgroundImageUrl(UrlModel urlModel) {
        this.backgroundImageUrl = urlModel;
    }

    public void setChallengeAnnouncement(ChallengeAnnouncement challengeAnnouncement) {
        this.challengeAnnouncement = challengeAnnouncement;
    }

    public void setChallengeName(String str) {
        this.challengeName = str;
    }

    public void setCid(String str) {
        this.cid = str;
    }

    public void setCollectStatus(int i) {
        this.collectStatus = i;
    }

    public void setCommerce(boolean z) {
        this.isCommerceAndValid = z;
    }

    public void setConnectMusics(List<Music> list) {
        this.connectMusics = list;
    }

    public void setDesc(String str) {
        this.desc = str;
    }

    public Challenge setDynamicPatchList(List<DynamicPatch> list) {
        this.dynamicPatchList = list;
        return this;
    }

    public void setEndColor(String str) {
        this.endColor = str;
    }

    public void setHighlightInfoList(List<HighlightInfo> list) {
        this.mHighlightInfoList = list;
    }

    public void setLinkAction(String str) {
        this.linkAction = str;
    }

    public void setLinkText(String str) {
        this.linkText = str;
    }

    public void setLinkTitle(String str) {
        this.linkTitle = str;
    }

    public void setMediaSource(RelatedMediaSourceStruct relatedMediaSourceStruct) {
        this.mediaSource = relatedMediaSourceStruct;
    }

    public void setMvId(String str) {
        this.mvId = str;
    }

    public void setOriginAuthor(String str) {
        this.originAuthor = str;
    }

    public void setRelatedChallenges(List<Challenge> list) {
        this.relatedChallenges = list;
    }

    public void setRequestId(String str) {
        this.requestId = str;
    }

    public void setSchema(String str) {
        this.schema = str;
    }

    public void setSearchChaName(String str) {
        this.mSearchChaName = str;
    }

    public void setShareInfo(ShareInfo shareInfo) {
        this.shareInfo = shareInfo;
    }

    public void setSponsorAdLabel(String str) {
        this.sponsorAdLabel = str;
    }

    public void setStarColor(String str) {
        this.starColor = str;
    }

    public void setStickerId(String str) {
        this.stickerId = str;
    }

    public void setStrongMusic(int i) {
        this.isStrongMusic = i;
    }

    public void setSubType(int i) {
        this.subType = i;
    }

    public void setType(int i) {
        this.type = i;
    }

    public void setUserCount(int i) {
        this.userCount = i;
    }

    public void setViewCount(long j) {
        this.viewCount = j;
    }
}
