package com.ss.android.ugc.aweme.effectcreator.experiments;

import X.C09CT;

/* JADX INFO: loaded from: classes36.dex */
public final class AMEGreenPromotionOriginalConfigData {

    @C09CT("container")
    public final String container;

    @C09CT("container_parameters")
    public final String containerParameters;

    @C09CT("enable")
    public final boolean enable;

    @C09CT("url")
    public final String url;

    public AMEGreenPromotionOriginalConfigData() {
        this(false, "aweme://lynxview/?url=", "https://lf-main-gecko-source.tiktokcdn.com/obj/tiktok-teko-source-sg/10/gecko/resource/tiktok_effect_lynx/pages/ame-greenscreen-campaign/template.js", "&use_spark=1&hide_nav_bar=1&should_full_screen=1&trans_status_bar=1&channel=tiktok_effect_lynx&bundle=pages/ame-greenscreen-campaign/template.js&dynamic=2&bdhm_bid=ttep_lynx&bdhm_pid=ame-greenscreen-campaign");
    }

    public AMEGreenPromotionOriginalConfigData(boolean z, String str, String str2, String str3) {
        this.enable = z;
        this.container = str;
        this.url = str2;
        this.containerParameters = str3;
    }
}
