package com.ss.android.ugc.aweme.ogc.news.sticker.common;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes30.dex */
public final class ArticleStickerConfigResponse {

    @C09CT("asset_config")
    public ArticleStickerAssetConfig assetConfig;

    @C09CT("is_enabled")
    public Boolean isEnable;

    @C09CT("status_code")
    public Integer statusCode;

    @C09CT("status_message")
    public String statusMessage;

    @C09CT("term_link")
    public String termLink;

    public static final class ArticleStickerAssetConfig implements Serializable {
        public static final int $stable = 8;

        @C09CT("asset_resource_id")
        public String assetResourceId;

        @C09CT("icon_uri")
        public String brandIconId;

        @C09CT("icon_cdn_url")
        public String brandIconUrl;

        @C09CT("url_expired_at")
        public Long brandIconUrlExpiredSeconds;

        @C09CT("domain_allowlist")
        public List<String> domainAllowList;

        @C09CT("domain_blocklist")
        public List<String> domainBlockList;

        @C09CT("theme_color_code")
        public String themeColorHex;

        public final void setAssetResourceId(String str) {
            this.assetResourceId = str;
        }

        public final void setBrandIconId(String str) {
            this.brandIconId = str;
        }

        public final void setBrandIconUrl(String str) {
            this.brandIconUrl = str;
        }

        public final void setBrandIconUrlExpiredSeconds(Long l) {
            this.brandIconUrlExpiredSeconds = l;
        }

        public final void setDomainAllowList(List<String> list) {
            this.domainAllowList = list;
        }

        public final void setDomainBlockList(List<String> list) {
            this.domainBlockList = list;
        }

        public final void setThemeColorHex(String str) {
            this.themeColorHex = str;
        }

        public ArticleStickerAssetConfig(String str, List<String> list, List<String> list2, String str2, String str3, Long l, String str4) {
            this.assetResourceId = str;
            this.domainAllowList = list;
            this.domainBlockList = list2;
            this.brandIconId = str2;
            this.brandIconUrl = str3;
            this.brandIconUrlExpiredSeconds = l;
            this.themeColorHex = str4;
        }
    }

    public ArticleStickerConfigResponse(Integer num, String str, Boolean bool, String str2, ArticleStickerAssetConfig articleStickerAssetConfig) {
        this.statusCode = num;
        this.statusMessage = str;
        this.isEnable = bool;
        this.termLink = str2;
        this.assetConfig = articleStickerAssetConfig;
    }
}
