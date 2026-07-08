package com.ss.android.ugc.aweme.christmas;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes30.dex */
public class ActivityStruct {

    @C09CT("activity_sticker_id_array")
    public ArrayList<String> activityStickerIdArray;

    @C09CT("comment_icon")
    public UrlModel commentIcon;

    @C09CT("digg_icon")
    public UrlModel diggIcon;

    @C09CT("hash_tags")
    public ArrayList<String> hashTags;

    @C09CT("in_activity")
    public boolean inActivity;

    @C09CT("activity_name")
    public String name;

    @C09CT("shot_icon")
    public UrlModel publishIcon;

    @C09CT("share_icon")
    public UrlModel shareIcon;

    @C09CT("share_tip_icon")
    public UrlModel shareTipIcon;

    @C09CT("watermark_struct")
    public WatermarkStruct struct;

    @C09CT("undigg_icon")
    public UrlModel undiggIcon;

    public class WatermarkStruct {

        @C09CT("end_watermark_string")
        public String endWatermarkString;

        @C09CT("end_watermark_substring")
        public String endWatermarkSubstring;

        @C09CT("fps")
        public String fps;

        @C09CT("md5")
        public String md5;

        @C09CT("resource_url")
        public UrlModel waterResource;

        public WatermarkStruct(ActivityStruct activityStruct) {
        }
    }
}
