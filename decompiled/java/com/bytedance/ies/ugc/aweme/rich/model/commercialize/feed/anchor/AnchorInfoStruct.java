package com.bytedance.ies.ugc.aweme.rich.model.commercialize.feed.anchor;

import X.C09CT;
import com.bytedance.ies.ugc.aweme.rich.model.commercialize.model.NativeSiteConfig;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class AnchorInfoStruct implements Serializable {

    @C09CT("native_site_ad_info")
    public final String nativeSiteAdInfo;

    @C09CT("native_site_config")
    public final NativeSiteConfig nativeSiteConfig;

    @C09CT("native_site_custom_data")
    public final String nativeSiteCustomData;

    @C09CT("open_system_browser")
    public final boolean openSystemBrowser;

    @C09CT("style_type")
    public final Integer styleType;

    @C09CT("web_style_type")
    public final int webStyleType;

    public AnchorInfoStruct() {
        this(null, null, null, 0, 0, false);
    }

    public final String getNativeSiteAdInfo() {
        return this.nativeSiteAdInfo;
    }

    public final NativeSiteConfig getNativeSiteConfig() {
        return this.nativeSiteConfig;
    }

    public final String getNativeSiteCustomData() {
        return this.nativeSiteCustomData;
    }

    public final boolean getOpenSystemBrowser() {
        return this.openSystemBrowser;
    }

    public final Integer getStyleType() {
        return this.styleType;
    }

    public final int getWebStyleType() {
        return this.webStyleType;
    }

    public AnchorInfoStruct(NativeSiteConfig nativeSiteConfig, String str, String str2, int i, Integer num, boolean z) {
        this.nativeSiteConfig = nativeSiteConfig;
        this.nativeSiteAdInfo = str;
        this.nativeSiteCustomData = str2;
        this.webStyleType = i;
        this.styleType = num;
        this.openSystemBrowser = z;
    }
}
