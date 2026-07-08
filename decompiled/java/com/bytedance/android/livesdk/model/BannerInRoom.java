package com.bytedance.android.livesdk.model;

import X.AnonymousClass0054;
import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import webcast.data.BannerImageBackground;
import webcast.data.BannerImageContent;
import webcast.data.ExtendImage;

/* JADX INFO: loaded from: classes.dex */
public class BannerInRoom extends AnonymousClass0054 {

    @C09CT("action_type")
    public int actionType;

    @C09CT("appointment_end_timestamp")
    public Long appointmentEndTimestamp;

    @C09CT("appointment_id")
    public Long appointmentId;

    @C09CT("appointment_start_timestamp")
    public Long appointmentStartTimestamp;

    @C09CT("background")
    public BannerImageBackground background;

    @C09CT("banner_location")
    public int bannerLocation;

    @C09CT("display_style")
    public int displayStyle;

    @C09CT("dynamic_banner")
    public BannerContentDynamic dynamicBanner;

    @C09CT("extend_image")
    public ExtendImage extendImage;

    @C09CT("height")
    public int height;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public long id;

    @C09CT("image")
    public ImageModel image;

    @C09CT("image_content")
    public BannerImageContent imageContent;

    @C09CT("image_type")
    public int imageType;

    @C09CT("priority")
    public int priority;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public Long status;

    @C09CT("width")
    public int width;

    @C09CT("display_param")
    public String displayParam = "";

    @C09CT("tab_title")
    public String tabTitle = "";

    @C09CT("title")
    public String title = "";

    @C09CT("schema_url")
    public String schemaUrl = "";

    @C09CT("text")
    public String text = "";

    @C09CT("banner_type")
    public Long bannerType = 0L;

    @C09CT("frame_type")
    public Long frameType = 0L;

    @C09CT("extra")
    public String extra = "";

    @C09CT("uid")
    public Long uid = 0L;

    @C09CT("roomid")
    public Long roomid = 0L;

    @C09CT("business_type")
    public Long businessType = 0L;

    @C09CT("open_with_navigation_tag")
    public boolean openWithNavigationTag = false;

    @C09CT("business_source")
    public String businessSource = "";

    @C09CT("activity_id")
    public String activityId = "";
    public String LIZ = "";
    public String LIZIZ = "";

    public static class BannerContentDynamic {

        @C09CT("json_resource")
        public String jsonResource = "";
    }
}
