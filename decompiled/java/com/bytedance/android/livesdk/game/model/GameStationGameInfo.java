package com.bytedance.android.livesdk.game.model;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class GameStationGameInfo {

    @C09CT("android_package_size")
    public long androidPackageSize;

    @C09CT("game_cta_info")
    public GameCTAInfo gameCtaInfo;

    @C09CT("game_source")
    public int gameSource;

    @C09CT("game_source_description")
    public GameSourceDescription gameSourceDescription;

    @C09CT("host_platform_info")
    public GameHostPlatformInfo hostPlatformInfo;

    @C09CT("icon")
    public ImageModel icon;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public long id;

    @C09CT("ios_package_size")
    public long iosPackageSize;

    @C09CT("show_translate")
    public boolean showTranslate;

    @C09CT("top_background_image")
    public ImageModel topBackgroundImage;

    @C09CT("id_str")
    public String idStr = "";

    @C09CT("name")
    public String name = "";

    @C09CT("android_age_limit")
    public String androidAgeLimit = "";

    @C09CT("ios_age_limit")
    public String iosAgeLimit = "";

    @C09CT("android_package")
    public String androidPackage = "";

    @C09CT("ios_bundle_id")
    public String iosBundleId = "";

    @C09CT("introduction_image")
    public List<ImageModel> introductionImage = new ArrayList();

    @C09CT("introduction")
    public String introduction = "";

    @C09CT("labels")
    public List<String> labels = new ArrayList();

    @C09CT("cp_name")
    public String cpName = "";

    @C09CT("introduction_video")
    public List<Video> introductionVideo = new ArrayList();

    @C09CT("ios_deep_link")
    public String iosDeepLink = "";

    @C09CT("android_deep_link")
    public String androidDeepLink = "";

    @C09CT("brief_introduction")
    public String briefIntroduction = "";

    @C09CT("game_tag_id")
    public String gameTagId = "";

    @C09CT("displayed_language")
    public String displayedLanguage = "";

    @C09CT("age_limit")
    public String ageLimit = "";

    @C09CT("support_platform_list")
    public List<GameStationSupportPlatformInfo> supportPlatformList = new ArrayList();

    @C09CT("game_tag_name")
    public String gameTagName = "";

    public static final class Video {

        @C09CT("cover")
        public ImageModel cover;

        @C09CT("duration")
        public double duration;

        @C09CT("vid")
        public String vid = "";

        @C09CT("url")
        public String url = "";
    }
}
