package com.ss.android.ugc.aweme.base.share;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class ShareInfo implements Serializable {

    @C09CT("bool_persist")
    public int boolPersist;

    @C09CT("button_display_stratege_source")
    public String buttonDisplayStrategySource;

    @C09CT("manage_goods_url")
    public String goodsManagerUrl;

    @C09CT("goods_rec_url")
    public String goodsRecUrl;

    @C09CT("share_image_url")
    public UrlModel imageUrls;

    @C09CT("now_invitation_card_image_urls")
    public List<String> nowInvitationCardImageUrls;

    @C09CT("share_qrcode_url")
    public UrlModel qrCodeUrls;

    @C09CT("quick_share_out_info")
    public QuickShareOutInfo quickShareOutInfo;

    @C09CT("share_button_display_mode")
    public int shareButtonDisplayMode;

    @C09CT("share_channel_ordering_extra_info")
    public String shareChannelOrderingExtraInfo;

    @C09CT("share_desc")
    public String shareDesc;

    @C09CT("share_desc_info")
    public String shareDescInfo;

    @C09CT("share_link_desc")
    public String shareLinkDesc;

    @C09CT("share_quote")
    public String shareQuote;

    @C09CT("share_signature_desc")
    public String shareSignatureDesc;

    @C09CT("share_signature_url")
    public String shareSignatureUrl;

    @C09CT("share_title")
    public String shareTitle;

    @C09CT("share_title_myself")
    public String shareTitleMyself;

    @C09CT("share_title_other")
    public String shareTitleOther;

    @C09CT("share_toutiao_desc")
    public String shareToutiaoDesc;

    @C09CT("share_url")
    public String shareUrl;

    @C09CT("whatsapp_desc")
    public String whatsappShareDesc;

    public int getBoolPersist() {
        return this.boolPersist;
    }

    public String getButtonDisplayStrategySource() {
        return this.buttonDisplayStrategySource;
    }

    public String getGoodsManagerUrl() {
        return this.goodsManagerUrl;
    }

    public String getGoodsRecUrl() {
        return this.goodsRecUrl;
    }

    public UrlModel getImageUrls() {
        return this.imageUrls;
    }

    public List<String> getNowInvitationCardImageUrls() {
        return this.nowInvitationCardImageUrls;
    }

    public UrlModel getQrCodeUrls() {
        return this.qrCodeUrls;
    }

    public QuickShareOutInfo getQuickShareOutInfo() {
        return this.quickShareOutInfo;
    }

    public int getShareButtonDisplayMode() {
        return this.shareButtonDisplayMode;
    }

    public String getShareChannelOrderingExtraInfo() {
        return this.shareChannelOrderingExtraInfo;
    }

    public String getShareDesc() {
        return this.shareDesc;
    }

    public String getShareDescInfo() {
        return this.shareDescInfo;
    }

    public String getShareLinkDesc() {
        return this.shareLinkDesc;
    }

    public String getShareQuote() {
        return this.shareQuote;
    }

    public String getShareSignatureDesc() {
        return this.shareSignatureDesc;
    }

    public String getShareSignatureUrl() {
        return this.shareSignatureUrl;
    }

    public String getShareTitle() {
        return this.shareTitle;
    }

    public String getShareTitleMyself() {
        return this.shareTitleMyself;
    }

    public String getShareTitleOther() {
        return this.shareTitleOther;
    }

    public String getShareToutiaoDesc() {
        return this.shareToutiaoDesc;
    }

    public String getShareUrl() {
        return this.shareUrl;
    }

    public String getWhatsappShareDesc() {
        return this.whatsappShareDesc;
    }

    public void setBoolPersist(int i) {
        this.boolPersist = i;
    }

    public void setButtonDisplayStrategySource(String str) {
        this.buttonDisplayStrategySource = str;
    }

    public void setGoodsManagerUrl(String str) {
        this.goodsManagerUrl = str;
    }

    public void setGoodsRecUrl(String str) {
        this.goodsRecUrl = str;
    }

    public void setImageUrls(UrlModel urlModel) {
        this.imageUrls = urlModel;
    }

    public void setNowInvitationCardImageUrls(List<String> list) {
        this.nowInvitationCardImageUrls = list;
    }

    public void setQrCodeUrls(UrlModel urlModel) {
        this.qrCodeUrls = urlModel;
    }

    public void setQuickShareOutInfo(QuickShareOutInfo quickShareOutInfo) {
        this.quickShareOutInfo = quickShareOutInfo;
    }

    public void setShareButtonDisplayMode(int i) {
        this.shareButtonDisplayMode = i;
    }

    public void setShareChannelOrderingExtraInfo(String str) {
        this.shareChannelOrderingExtraInfo = str;
    }

    public void setShareDesc(String str) {
        this.shareDesc = str;
    }

    public void setShareDescInfo(String str) {
        this.shareDescInfo = str;
    }

    public void setShareLinkDesc(String str) {
        this.shareLinkDesc = str;
    }

    public void setShareQuote(String str) {
        this.shareQuote = str;
    }

    public void setShareSignatureDesc(String str) {
        this.shareSignatureDesc = str;
    }

    public void setShareSignatureUrl(String str) {
        this.shareSignatureUrl = str;
    }

    public void setShareTitle(String str) {
        this.shareTitle = str;
    }

    public void setShareTitleMyself(String str) {
        this.shareTitleMyself = this.shareTitleMyself;
    }

    public void setShareTitleOther(String str) {
        this.shareTitleOther = str;
    }

    public void setShareToutiaoDesc(String str) {
        this.shareToutiaoDesc = str;
    }

    public void setShareUrl(String str) {
        this.shareUrl = str;
    }

    public void setWhatsappShareDesc(String str) {
        this.whatsappShareDesc = str;
    }
}
