package com.ss.android.ugc.aweme.sticker.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.discover.model.ChallengeDisclaimer;
import com.ss.android.ugc.aweme.discover.model.HTCMissionModule;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public class CommerceSticker implements Serializable {

    @C09CT("ad_owner_commerce_level")
    public int adOwnerCommerceLevel;

    @C09CT("ad_owner_id")
    public String adOwnerId;

    @C09CT("ad_owner_name")
    public String adOwnerName;

    @C09CT("sponsor_ad_label")
    public String adTagText;

    @C09CT("challenge_id")
    public String challengeId;

    @C09CT("unlock_info")
    public CommerceStickerUnlockInfo commerceStickerUnlockInfo;

    @C09CT("contest_rule_desc")
    public String contestRuleDesc;

    @C09CT("contest_rule_url")
    public String contestRuleUrl;

    @C09CT("detail_desc")
    public String detailDesc;

    @C09CT("detail_letters")
    public String detailLetters;

    @C09CT("detail_open_url")
    public String detailOpenUrl;

    @C09CT("detail_web_url")
    public String detailWebUrl;

    @C09CT("detail_web_url_title")
    public String detailWebUrlTitle;

    @C09CT("disclaimer")
    public ChallengeDisclaimer disclaimer;

    @C09CT("expire_time")
    public long expireTime;

    @C09CT("mission_module")
    public HTCMissionModule htcMissionModule;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public String id;

    @C09CT("music_id")
    public String musicId;

    @C09CT("screen_desc")
    public String screenDesc;

    @C09CT("screen_icon")
    public UrlModel screenIcon;

    @C09CT("sec_ad_owner_id")
    public String secAdOwnerId;

    public int getAdOwnerCommerceLevel() {
        return this.adOwnerCommerceLevel;
    }

    public String getAdOwnerId() {
        return this.adOwnerId;
    }

    public String getAdOwnerName() {
        return this.adOwnerName;
    }

    public String getAdTagText() {
        return this.adTagText;
    }

    public String getChallengeId() {
        return this.challengeId;
    }

    public CommerceStickerUnlockInfo getCommerceStickerUnlockInfo() {
        return this.commerceStickerUnlockInfo;
    }

    public String getContestRuleDesc() {
        return this.contestRuleDesc;
    }

    public String getContestRuleUrl() {
        return this.contestRuleUrl;
    }

    public String getDetailDesc() {
        return this.detailDesc;
    }

    public String getDetailLetters() {
        return this.detailLetters;
    }

    public String getDetailOpenUrl() {
        return this.detailOpenUrl;
    }

    public String getDetailWebUrl() {
        return this.detailWebUrl;
    }

    public String getDetailWebUrlTitle() {
        return this.detailWebUrlTitle;
    }

    public ChallengeDisclaimer getDisclaimer() {
        return this.disclaimer;
    }

    public long getExpireTime() {
        return this.expireTime;
    }

    public HTCMissionModule getHtcMissionModule() {
        return this.htcMissionModule;
    }

    public String getId() {
        return this.id;
    }

    public String getMusicId() {
        return this.musicId;
    }

    public String getScreenDesc() {
        return this.screenDesc;
    }

    public UrlModel getScreenIcon() {
        return this.screenIcon;
    }

    public String getSecAdOwnerId() {
        return this.secAdOwnerId;
    }

    public void setAdOwnerId(String str) {
        this.adOwnerId = str;
    }

    public void setAdOwnerName(String str) {
        this.adOwnerName = str;
    }

    public void setChallengeId(String str) {
        this.challengeId = str;
    }

    public void setCommerceStickerUnlockInfo(CommerceStickerUnlockInfo commerceStickerUnlockInfo) {
        this.commerceStickerUnlockInfo = commerceStickerUnlockInfo;
    }

    public void setContestRuleDesc(String str) {
        this.contestRuleDesc = str;
    }

    public void setContestRuleUrl(String str) {
        this.contestRuleUrl = str;
    }

    public void setDetailDesc(String str) {
        this.detailDesc = str;
    }

    public void setDetailLetters(String str) {
        this.detailLetters = str;
    }

    public void setDetailOpenUrl(String str) {
        this.detailOpenUrl = str;
    }

    public void setDetailWebUrl(String str) {
        this.detailWebUrl = str;
    }

    public void setDetailWebUrlTitle(String str) {
        this.detailWebUrlTitle = str;
    }

    public void setDisclaimer(ChallengeDisclaimer challengeDisclaimer) {
        this.disclaimer = challengeDisclaimer;
    }

    public void setExpireTime(long j) {
        this.expireTime = j;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setMusicId(String str) {
        this.musicId = str;
    }

    public void setScreenDesc(String str) {
        this.screenDesc = str;
    }

    public void setScreenIcon(UrlModel urlModel) {
        this.screenIcon = urlModel;
    }

    public void setSecAdOwnerId(String str) {
        this.secAdOwnerId = str;
    }
}
