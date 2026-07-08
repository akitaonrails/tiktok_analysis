package com.ss.android.ugc.aweme.shortvideo.model;

import X.C09CT;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.poi.PoiData;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.ShopOrderShareStructInfo;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public class PublishExtensionModel {

    @C09CT("anchor_content")
    public String anchorContent;

    @C09CT("anchor_icon")
    public UrlModel anchorIcon;

    @C09CT("anchor_tag")
    public String anchorTag;

    @C09CT("anchor_title")
    public String anchorTitle;

    @C09CT("anchors")
    public List<CreateAnchorInfo> createAnchorInfos;
    public String dataType;

    @C09CT("is_from_commercial_sound_page")
    public boolean fromCommercialSoundPage;

    @C09CT("hash_tag")
    public List<String> hashtags;

    @C09CT("mp_url")
    public String mpUrl;

    @C09CT("open_url")
    public String openUrl;

    @C09CT("outer_star_atlas")
    public String outerStarAtlas;

    @C09CT("poi_data")
    public PoiData poiData;

    @C09CT("recommend_anchor")
    public List<AnchorPublishStruct> recommendAnchor;
    public String referSeedId;
    public String referSeedName;

    @C09CT("related_hot_sentence")
    public String relatedHotSentence;
    public String seedId;
    public String seedName;

    @C09CT("sentence_id")
    public String sentenceId;

    @C09CT("tt4d_anchor_params")
    public PublishServicePluginAnchorParams servicePluginAnchorParams;

    @C09CT("shop_order_share_structinfo")
    public ShopOrderShareStructInfo shopOrderShareStructInfo;

    @C09CT("source")
    public int source;

    @C09CT("web_url")
    public String webUrl;

    @C09CT("zip_uri")
    public String zipUri;

    @C09CT("anchor_id")
    public String anchorId = "";

    @C09CT("anchor_business_type")
    public int anchorBusinessType = -1;

    @C09CT("anchor_business_title")
    public String anchorBusinessTitle = "";

    @C09CT("subtype")
    public String anchorSubtype = "";

    public String getAnchorBusinessTitle() {
        return this.anchorBusinessTitle;
    }

    public int getAnchorBusinessType() {
        return this.anchorBusinessType;
    }

    public String getAnchorContent() {
        return this.anchorContent;
    }

    public UrlModel getAnchorIcon() {
        return this.anchorIcon;
    }

    public String getAnchorId() {
        return this.anchorId;
    }

    public String getAnchorTag() {
        return this.anchorTag;
    }

    public String getAnchorTitle() {
        return this.anchorTitle;
    }

    public List<String> getHashtags() {
        return this.hashtags;
    }

    public String getMpUrl() {
        return this.mpUrl;
    }

    public String getRelatedHotSentence() {
        return this.relatedHotSentence;
    }

    public String getSentenceId() {
        return this.sentenceId;
    }

    public ShopOrderShareStructInfo getShopOrderShareStructInfo() {
        return this.shopOrderShareStructInfo;
    }

    public int getSource() {
        return this.source;
    }

    public static PublishExtensionModel fromContext(BaseShortVideoContext baseShortVideoContext) {
        if (baseShortVideoContext != null && !TextUtils.isEmpty(baseShortVideoContext.commerceData)) {
            return (PublishExtensionModel) GsonProtectorUtils.fromJson(new Gson(), baseShortVideoContext.commerceData, PublishExtensionModel.class);
        }
        return new PublishExtensionModel();
    }

    public static PublishExtensionModel fromString(String str) {
        if (TextUtils.isEmpty(str)) {
            return new PublishExtensionModel();
        }
        return (PublishExtensionModel) GsonProtectorUtils.fromJson(new Gson(), str, PublishExtensionModel.class);
    }

    public static String toString(PublishExtensionModel publishExtensionModel) {
        if (publishExtensionModel == null) {
            return null;
        }
        return GsonProtectorUtils.toJson(new Gson(), publishExtensionModel);
    }

    public void setAnchorBusinessTitle(String str) {
        this.anchorBusinessTitle = str;
    }

    public void setAnchorBusinessType(int i) {
        this.anchorBusinessType = i;
    }

    public void setAnchorContent(String str) {
        this.anchorContent = str;
    }

    public void setAnchorIcon(UrlModel urlModel) {
        this.anchorIcon = urlModel;
    }

    public void setAnchorId(String str) {
        this.anchorId = str;
    }

    public void setAnchorTag(String str) {
        this.anchorTag = str;
    }

    public void setAnchorTitle(String str) {
        this.anchorTitle = str;
    }

    public void setHashtags(List<String> list) {
        this.hashtags = list;
    }

    public void setMpUrl(String str) {
        this.mpUrl = str;
    }

    public void setRelatedHotSentence(String str) {
        this.relatedHotSentence = str;
    }

    public void setSentenceId(String str) {
        this.sentenceId = str;
    }

    public void setShopOrderShareStructInfo(ShopOrderShareStructInfo shopOrderShareStructInfo) {
        this.shopOrderShareStructInfo = shopOrderShareStructInfo;
    }

    public void setSource(int i) {
        this.source = i;
    }
}
