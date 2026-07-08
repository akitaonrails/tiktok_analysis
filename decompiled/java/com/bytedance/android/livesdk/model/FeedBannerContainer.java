package com.bytedance.android.livesdk.model;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class FeedBannerContainer {

    @C09CT("background")
    public ImageModel background;

    @C09CT("banners")
    public List<FeedBanner> bannerList;

    @C09CT("banners_type")
    public int bannersType;

    @C09CT("switch_type")
    public int switchType;

    @C09CT("title")
    public String title;

    @C09CT("total")
    public int total;
}
