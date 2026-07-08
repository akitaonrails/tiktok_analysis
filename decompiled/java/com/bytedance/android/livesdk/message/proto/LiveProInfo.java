package com.bytedance.android.livesdk.message.proto;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;

/* JADX INFO: loaded from: classes.dex */
public final class LiveProInfo {

    @C09CT("banner")
    public ImageModel banner;

    @C09CT("banner_starling_key")
    public String bannerStarlingKey = "";

    @C09CT("gamer_banner_starling_key")
    public String gamerBannerStarlingKey = "";

    @C09CT("gamer_label")
    public ImageModel gamerLabel;

    @C09CT("is_live_pro")
    public boolean isLivePro;

    @C09CT("label")
    public ImageModel label;

    @C09CT("live_pro_type")
    public int liveProType;

    @C09CT("show_banner")
    public boolean showBanner;
}
