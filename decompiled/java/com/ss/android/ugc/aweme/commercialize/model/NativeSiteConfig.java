package com.ss.android.ugc.aweme.commercialize.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class NativeSiteConfig implements Serializable {

    @C09CT("android_page_data_hash")
    public final String androidPageDataHash;

    @C09CT("animation_type")
    public final String animationType;

    @C09CT("flutter_version")
    public final int flutterVersion;

    @C09CT("gecko_channel")
    public final List<String> geckoChannel;

    @C09CT("is_support_native_animation")
    public final boolean isSupportNativeAnimation;

    @C09CT("lynx_landing_style")
    public final int lynxLandingStyle;

    @C09CT("lynx_scheme")
    public final String lynxScheme;

    @C09CT("page_data_backup_url")
    public final String pageDataBackupUrl;

    @C09CT("page_data_url")
    public final String pageDataUrl;

    @C09CT("preload_net_type")
    public final int preloadNetType;

    @C09CT("render_type")
    public final String renderType;

    @C09CT("second_page_gecko_channel")
    public final List<String> secondPageGeckoChannel;

    @C09CT("site_type")
    public final String siteType;

    public final NativeSiteConfig copy(String str, int i, String str2, String str3, int i2, String str4, boolean z, String str5, List<String> list, List<String> list2, String str6, String str7, int i3) {
        return new NativeSiteConfig(str, i, str2, str3, i2, str4, z, str5, list, list2, str6, str7, i3);
    }

    public final boolean isSupportNativeAnimation() {
        return this.isSupportNativeAnimation;
    }

    public NativeSiteConfig(String str, int i, String str2, String str3, int i2, String str4, boolean z, String str5, List<String> list, List<String> list2, String str6, String str7, int i3) {
        this.renderType = str;
        this.flutterVersion = i;
        this.pageDataUrl = str2;
        this.pageDataBackupUrl = str3;
        this.preloadNetType = i2;
        this.androidPageDataHash = str4;
        this.isSupportNativeAnimation = z;
        this.animationType = str5;
        this.geckoChannel = list;
        this.secondPageGeckoChannel = list2;
        this.siteType = str6;
        this.lynxScheme = str7;
        this.lynxLandingStyle = i3;
    }
}
