package com.ss.android.ugc.aweme.comment.model;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class CommentStickerStruct implements Serializable {

    @C09CT("ai_moji_status")
    public Integer aiMojiStatus;

    @C09CT("ai_moji_type")
    public Integer aiMojiType;

    @C09CT("animated_url")
    public StickerUrlStruct animatedUrl;

    @C09CT("created_time")
    public Long createdTime;

    @C09CT("creator_uid")
    public Long creatorUid;

    @C09CT("display_order")
    public Integer displayOrder;

    @C09CT("expressions")
    public List<String> expressions;
    public String giphyFormat;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public String id;

    @C09CT("name")
    public String name;

    @C09CT("origin_video_author_uid")
    public Long originVideoAuthorUid;

    @C09CT("origin_video_id")
    public Long originVideoId;

    @C09CT("recommend_sub_type")
    public Integer recommendSubType;

    @C09CT("review_msg")
    public String reviewMsg = "";

    @C09CT("review_status")
    public Integer reviewStatus;

    @C09CT("set_id")
    public Long setId;

    @C09CT("static_url")
    public StickerUrlStruct staticUrl;
    public String stickerEnterMethod;

    @C09CT("sticker_sub_type")
    public Integer stickerSubType;

    @C09CT("sticker_type")
    public Integer stickerType;

    @C09CT("tier_id")
    public String tierId;

    @C09CT("updated_time")
    public Long updatedTime;

    @C09CT("user_favorite")
    public Integer userFavorite;

    @C09CT("v2s_status")
    public Integer v2sStatus;

    public final Integer getAiMojiStatus() {
        return this.aiMojiStatus;
    }

    public final Integer getAiMojiType() {
        return this.aiMojiType;
    }

    public final StickerUrlStruct getAnimatedUrl() {
        return this.animatedUrl;
    }

    public final Long getCreatedTime() {
        return this.createdTime;
    }

    public final Long getCreatorUid() {
        return this.creatorUid;
    }

    public final Integer getDisplayOrder() {
        return this.displayOrder;
    }

    public final List<String> getExpressions() {
        return this.expressions;
    }

    public final String getGiphyFormat() {
        return this.giphyFormat;
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final Long getOriginVideoAuthorUid() {
        return this.originVideoAuthorUid;
    }

    public final Long getOriginVideoId() {
        return this.originVideoId;
    }

    public final Integer getRecommendSubType() {
        return this.recommendSubType;
    }

    public final String getReviewMsg() {
        return this.reviewMsg;
    }

    public final Integer getReviewStatus() {
        return this.reviewStatus;
    }

    public final Long getSetId() {
        return this.setId;
    }

    public final StickerUrlStruct getStaticUrl() {
        return this.staticUrl;
    }

    public final String getStickerEnterMethod() {
        return this.stickerEnterMethod;
    }

    public final Integer getStickerSubType() {
        return this.stickerSubType;
    }

    public final Integer getStickerType() {
        return this.stickerType;
    }

    public final String getTierId() {
        return this.tierId;
    }

    public final Long getUpdatedTime() {
        return this.updatedTime;
    }

    public final Integer getUserFavorite() {
        return this.userFavorite;
    }

    public final Integer getV2sStatus() {
        return this.v2sStatus;
    }

    public final void setAiMojiStatus(Integer num) {
        this.aiMojiStatus = num;
    }

    public final void setAiMojiType(Integer num) {
        this.aiMojiType = num;
    }

    public final void setAnimatedUrl(StickerUrlStruct stickerUrlStruct) {
        this.animatedUrl = stickerUrlStruct;
    }

    public final void setCreatedTime(Long l) {
        this.createdTime = l;
    }

    public final void setCreatorUid(Long l) {
        this.creatorUid = l;
    }

    public final void setDisplayOrder(Integer num) {
        this.displayOrder = num;
    }

    public final void setExpressions(List<String> list) {
        this.expressions = list;
    }

    public final void setGiphyFormat(String str) {
        this.giphyFormat = str;
    }

    public final void setId(String str) {
        this.id = str;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setOriginVideoAuthorUid(Long l) {
        this.originVideoAuthorUid = l;
    }

    public final void setOriginVideoId(Long l) {
        this.originVideoId = l;
    }

    public final void setRecommendSubType(Integer num) {
        this.recommendSubType = num;
    }

    public final void setReviewMsg(String str) {
        this.reviewMsg = str;
    }

    public final void setReviewStatus(Integer num) {
        this.reviewStatus = num;
    }

    public final void setSetId(Long l) {
        this.setId = l;
    }

    public final void setStaticUrl(StickerUrlStruct stickerUrlStruct) {
        this.staticUrl = stickerUrlStruct;
    }

    public final void setStickerEnterMethod(String str) {
        this.stickerEnterMethod = str;
    }

    public final void setStickerSubType(Integer num) {
        this.stickerSubType = num;
    }

    public final void setStickerType(Integer num) {
        this.stickerType = num;
    }

    public final void setTierId(String str) {
        this.tierId = str;
    }

    public final void setUpdatedTime(Long l) {
        this.updatedTime = l;
    }

    public final void setUserFavorite(Integer num) {
        this.userFavorite = num;
    }

    public final void setV2sStatus(Integer num) {
        this.v2sStatus = num;
    }
}
