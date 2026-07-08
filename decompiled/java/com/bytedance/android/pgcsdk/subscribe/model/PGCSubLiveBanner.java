package com.bytedance.android.pgcsdk.subscribe.model;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class PGCSubLiveBanner {

    @C09CT("banner_background")
    public PGCBannerBackground bannerBackground;

    @C09CT("height")
    public long height;

    @C09CT("hide_navigation_bar")
    public boolean hideNavigationBar;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public long id;

    @C09CT("image")
    public ImageModel image;

    @C09CT("width")
    public long width;

    @C09CT("title")
    public String title = "";

    @C09CT("schema_url")
    public String schemaUrl = "";

    @C09CT("text")
    public String text = "";

    @C09CT("activity_name")
    public String activityName = "";

    @C09CT("text_color")
    public String textColor = "";

    @C09CT("banner_key")
    public String bannerKey = "";

    @C09CT("banner_events")
    public List<BannerEvent> bannerEvents = new ArrayList();

    @C09CT("cta_text")
    public String ctaText = "";
}
