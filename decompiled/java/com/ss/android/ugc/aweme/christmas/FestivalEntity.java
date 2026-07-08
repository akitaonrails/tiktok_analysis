package com.ss.android.ugc.aweme.christmas;

import X.C09CT;
import com.ss.android.ugc.aweme.christmas.ActivityStruct;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes30.dex */
public class FestivalEntity {

    @C09CT("activity_homepage_url")
    public String activityHomePageUrl;

    @C09CT("activity_id")
    public String activityId;

    @C09CT("activity_name")
    public String activityName;

    @C09CT("activity_type")
    public int activityType;

    @C09CT("avatar_page_struct")
    public AvatarDetailEntity avatarDetailEntity;

    @C09CT("detail_page_info")
    public String detailPageInfo;

    @C09CT("hashtag_ids")
    public List<String> hashTagIds;

    @C09CT("hash_tags")
    public String hashTags;

    @C09CT("in_activity")
    public boolean inActivity;

    @C09CT("detail_banner")
    public BannerDetail mBannerDetail;

    @C09CT("bonus_shoot")
    public EggShellEntity mEggShellEntity;

    @C09CT("mv_ids")
    public List<String> mvIds;

    @C09CT("mv_decorator_resource")
    public String mvResource;

    @C09CT("attributes")
    public Map<String, Object> optionalAttributes;

    @C09CT("theme_resource_struct")
    public ResEntity resEntity;

    @C09CT("show_other_banner")
    public boolean showOtherBanner;

    @C09CT("star_videos")
    public List<String> starVideos;

    @C09CT("activity_sticker_id_array")
    public List<String> stickerList;

    @C09CT("activity_sticker_tab")
    public ActivityStickerTabEntity stickerTabConfig;

    @C09CT("watermark_struct")
    public ActivityStruct.WatermarkStruct waterMark;

    public class ActivityStickerTabEntity {

        @C09CT("show_seconds")
        public int showSeconds;

        public ActivityStickerTabEntity(FestivalEntity festivalEntity) {
        }
    }

    public class BannerDetail {

        @C09CT("banner_resource")
        public String bannerResource;

        @C09CT("h5_link")
        public String h5link;

        public BannerDetail(FestivalEntity festivalEntity) {
        }
    }

    /* JADX INFO: loaded from: classes14.dex */
    public class EggShellEntity {

        @C09CT("bonus_button")
        public String bonusButton;

        @C09CT("bonus_stickers")
        public List<Object> bonusStickers;

        @C09CT("bonus_text")
        public String bonusText;

        public EggShellEntity(FestivalEntity festivalEntity) {
        }
    }
}
