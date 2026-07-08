package com.ss.android.ugc.aweme.music.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class ExternalMusicInfo implements Serializable {

    @C09CT("button_text")
    public String buttonText;

    @C09CT("external_app_link")
    public String externalAppLink;

    @C09CT("external_deep_link")
    public String externalDeepLink;

    @C09CT("external_label")
    public String externalLabel;

    @C09CT("external_preview_schema")
    public String externalPreviewSchema;

    @C09CT("external_schema")
    public String externalSchema;

    @C09CT("external_song_key")
    public String externalSongKey;

    @C09CT("hide_when_uninstall")
    public Boolean hideWhenUninstall;

    @C09CT("h5_url")
    public String jumpUrl;

    @C09CT("partner_name")
    public String partnerName;

    @C09CT("partner_song_id")
    public String partnerSongId;

    @C09CT("product_status")
    public int productStatus = 2;

    @C09CT("store_link")
    public TTMStoreLink storeLink;

    @C09CT("subscribed")
    public boolean subscribed;

    @C09CT("vip_verification_schema")
    public String vipVerificationSchema;

    public final String getButtonText() {
        return this.buttonText;
    }

    public final String getExternalAppLink() {
        return this.externalAppLink;
    }

    public final String getExternalDeepLink() {
        return this.externalDeepLink;
    }

    public final String getExternalLabel() {
        return this.externalLabel;
    }

    public final String getExternalPreviewSchema() {
        return this.externalPreviewSchema;
    }

    public final String getExternalSchema() {
        return this.externalSchema;
    }

    public final String getExternalSongKey() {
        return this.externalSongKey;
    }

    public final Boolean getHideWhenUninstall() {
        return this.hideWhenUninstall;
    }

    public final String getJumpUrl() {
        return this.jumpUrl;
    }

    public final String getPartnerName() {
        return this.partnerName;
    }

    public final String getPartnerSongId() {
        return this.partnerSongId;
    }

    public final int getProductStatus() {
        return this.productStatus;
    }

    public final TTMStoreLink getStoreLink() {
        return this.storeLink;
    }

    public final boolean getSubscribed() {
        return this.subscribed;
    }

    public final String getVipVerificationSchema() {
        return this.vipVerificationSchema;
    }

    public final void setButtonText(String str) {
        this.buttonText = str;
    }

    public final void setExternalAppLink(String str) {
        this.externalAppLink = str;
    }

    public final void setExternalDeepLink(String str) {
        this.externalDeepLink = str;
    }

    public final void setExternalLabel(String str) {
        this.externalLabel = str;
    }

    public final void setExternalPreviewSchema(String str) {
        this.externalPreviewSchema = str;
    }

    public final void setExternalSchema(String str) {
        this.externalSchema = str;
    }

    public final void setExternalSongKey(String str) {
        this.externalSongKey = str;
    }

    public final void setHideWhenUninstall(Boolean bool) {
        this.hideWhenUninstall = bool;
    }

    public final void setJumpUrl(String str) {
        this.jumpUrl = str;
    }

    public final void setPartnerName(String str) {
        this.partnerName = str;
    }

    public final void setPartnerSongId(String str) {
        this.partnerSongId = str;
    }

    public final void setProductStatus(int i) {
        this.productStatus = i;
    }

    public final void setStoreLink(TTMStoreLink tTMStoreLink) {
        this.storeLink = tTMStoreLink;
    }

    public final void setSubscribed(boolean z) {
        this.subscribed = z;
    }

    public final void setVipVerificationSchema(String str) {
        this.vipVerificationSchema = str;
    }
}
