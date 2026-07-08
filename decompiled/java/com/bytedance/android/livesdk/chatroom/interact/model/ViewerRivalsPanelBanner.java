package com.bytedance.android.livesdk.chatroom.interact.model;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.chatroom.model.interact.CohostPanelBannerExtra;
import com.bytedance.android.livesdk.model.message.common.Text;

/* JADX INFO: loaded from: classes.dex */
public final class ViewerRivalsPanelBanner {

    @C09CT("angle")
    public long angle;

    @C09CT("arrow_image")
    public ImageModel arrowImage;

    @C09CT("background_image")
    public ImageModel backgroundImage;

    @C09CT("banner_style")
    public int bannerStyle;

    @C09CT("banner_title")
    public Text bannerTitle;

    @C09CT("countdown_info")
    public CountdownInfo countdownInfo;

    @C09CT("extra")
    public CohostPanelBannerExtra extra;

    @C09CT("right_image")
    public ImageModel rightImage;

    @C09CT("right_image_rtl")
    public ImageModel rightImageRtl;

    @C09CT("start_color")
    public String startColor = "";

    @C09CT("end_color")
    public String endColor = "";

    @C09CT("schema_jump_url")
    public String schemaJumpUrl = "";

    public static final class CountdownInfo {

        @C09CT("desc_text")
        public Text descText;

        @C09CT("end_timestamp_sec")
        public long endTimestampSec;
    }
}
