package com.bytedance.android.livesdk.model.message;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.BannerInRoom;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class BannerInRoomCollection {

    @C09CT("activity_top_right")
    public BannerInfo activityTopRightBanner;

    @C09CT("bottom_right")
    public BannerInfo bottomRightBanner;

    @C09CT("get_banner_success")
    public boolean getBannerSuccess;

    @C09CT("gift_panel")
    public BannerInfo giftPanelBanner;

    @C09CT("live_scene")
    public BannerInfo liveScene;

    @C09CT("middle")
    public BannerInfo middleBanner;

    @C09CT("top_left")
    public BannerInfo topLeft;

    @C09CT("top_right")
    public BannerInfo topRightBanner;

    public static final class BannerInfo {

        @C09CT("animation_image")
        public ImageModel animationImage;

        @C09CT("banner_list")
        public List<BannerInRoom> bannerList;

        @C09CT("collapse")
        public BannerCollapseInfo collapseInfo;

        @C09CT("container_type")
        public Long containerType;

        @C09CT("container_height")
        public int height;

        @C09CT("lynx_container_url")
        public String lynxContainerUrl;

        @C09CT("container_url")
        public String url;

        @C09CT("container_width")
        public int width;
    }
}
