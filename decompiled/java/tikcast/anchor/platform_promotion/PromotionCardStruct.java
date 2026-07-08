package tikcast.anchor.platform_promotion;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class PromotionCardStruct {

    @C09CT("auth_time_begin")
    public long authTimeBegin;

    @C09CT("auth_time_end")
    public long authTimeEnd;

    @C09CT("crowd_filter")
    public int crowdFilter;

    @C09CT("end_time")
    public long endTime;

    @C09CT("freq_interval")
    public long freqInterval;

    @C09CT("freq_max")
    public long freqMax;

    @C09CT("gps_filter")
    public GPSFilterData gpsFilter;

    @C09CT("ignore_condition")
    public boolean ignoreCondition;

    @C09CT("immersive_main_img_config")
    public PromotionImmersiveMainImgConfig immersiveMainImgConfig;

    @C09CT("immersive_main_img_with_icon_config")
    public PromotionImmersiveMainImgWithIconConfig immersiveMainImgWithIconConfig;

    @C09CT("is_effective")
    public boolean isEffective;

    @C09CT("lynx_base_config")
    public PromotionLynxBaseConfig lynxBaseConfig;

    @C09CT("min_version")
    public long minVersion;

    @C09CT("one_img_config")
    public PromotionOneImgConfig oneImgConfig;

    @C09CT("priority")
    public int priority;

    @C09CT("region_filter")
    public int regionFilter;

    @C09CT("start_time")
    public long startTime;

    @C09CT("style")
    public int style;

    @C09CT("three_icon_config")
    public PromotionThreeIconConfig threeIconConfig;

    @C09CT("three_img_round_config")
    public PromotionThreeImgRoundConfig threeImgRoundConfig;

    @C09CT("type")
    public int type;

    @C09CT("union_freq_config")
    public PromotionUnionFreqConfig unionFreqConfig;

    @C09CT("video_config")
    public PromotionVideoConfig videoConfig;

    @C09CT("weight")
    public int weight;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public String id = "";

    @C09CT("name")
    public String name = "";

    @C09CT("title_starlingkey")
    public String titleStarlingkey = "";

    @C09CT("sub_title_starlingkey")
    public String subTitleStarlingkey = "";

    @C09CT("button_starlingkey")
    public String buttonStarlingkey = "";

    @C09CT("landing_schema")
    public String landingSchema = "";

    @C09CT("conditions")
    public List<PromotionTrecoCondition> conditions = new ArrayList();

    @C09CT("custom_regions")
    public List<String> customRegions = new ArrayList();

    @C09CT("uid_list_id")
    public String uidListId = "";

    @C09CT("display_landing_schema")
    public String displayLandingSchema = "";

    @C09CT("creator_email")
    public String creatorEmail = "";
}
