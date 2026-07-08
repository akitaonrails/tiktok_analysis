package com.bytedance.android.livesdk.subscribe.model;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes8.dex */
public final class SubLiveBanner {

    @C09CT("banner_background")
    public BannerBackground bannerBackground;

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
}
