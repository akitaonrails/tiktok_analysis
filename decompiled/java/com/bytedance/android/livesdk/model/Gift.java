package com.bytedance.android.livesdk.model;

import X.AnonymousClass0054;
import X.C09CT;
import X.C123100dR;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.gift.model.GiftColorInfo;
import com.bytedance.android.livesdk.gift.model.GiftPanelBeaconBubble;
import com.bytedance.android.livesdk.gift.model.GiftResource;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class Gift extends AnonymousClass0054 {

    @C09CT("batch_gift_info")
    public BatchGiftInfo batchGiftInfo;

    @C09CT("beacon_bubble")
    public GiftPanelBeaconBubble beaconBubble;

    @C09CT("can_put_in_gift_box")
    public boolean canPutInGiftBox;

    @C09CT("color_infos")
    public List<GiftColorInfo> colorInfos;

    @C09CT("color_picker_info")
    public ColorPickerInfo colorPickerInfo;

    @C09CT("combo")
    public boolean combo;

    @C09CT("cross_screen_effect_info")
    public CrossScreenEffectInfo crossScreenEffectInfo;

    @C09CT("describe")
    public String describe;

    @C09CT("diamond_count")
    public int diamondCount;

    @C09CT("disable_gallery_banner")
    public boolean disableGalleryBanner;

    @C09CT("duration")
    public int duration;

    @C09CT("expiration_timestamp")
    public long expirationTimestamp;

    @C09CT("for_linkmic")
    public boolean forLinkMic;

    @C09CT("gift_bottom_right_label_icon")
    public ImageModel giftBottomRightLabelIcon;

    @C09CT("gift_box_info")
    public GiftBoxInfo giftBoxInfo;

    @C09CT("gift_label_type")
    public int giftLabelType;

    @C09CT("gift_panel_banner")
    public GiftPanelBanner giftPanelBanner;

    @C09CT("gift_sponsor_info")
    public GiftSponsorInfo giftSponsorInfo;

    @C09CT("lock_info")
    public GiftLockInfo giftSubInfo;

    @C09CT("gift_sub_type")
    public int giftSubType;

    @C09CT("gift_vertical_scenarios")
    public List<Integer> giftVerticalScenarios;

    @C09CT("group_in_tab")
    public int groupInTab;

    @C09CT("icon")
    public ImageModel icon;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public long id;

    @C09CT("image")
    public ImageModel image;

    @C09CT("is_box_gift")
    public boolean isBoxGift;

    @C09CT("is_broadcast_gift")
    public boolean isBroadcastGift;

    @C09CT("is_displayed_on_panel")
    public boolean isDisplayedOnPanel;

    @C09CT("is_effect_befview")
    public boolean isEffectBEFView;

    @C09CT("is_gallery_gift")
    public boolean isGalleryGift;

    @C09CT("is_global_gift")
    public boolean isGlobalGift;

    @C09CT("is_random_gift")
    public boolean isRandomGift;

    @C09CT("gift_label_icon")
    public ImageModel leftLogo;

    @C09CT("gold_effect")
    public String liveUserPngInfo;

    @C09CT("lynx_cross_screen_effect_info")
    public LynxCrossScreenEffectInfo lynxCrossScreenEffectInfo;

    @C09CT("music_info")
    public MusicGiftInfo musicInfo;

    @C09CT("preview_image")
    public ImageModel previewImage;

    @C09CT("primary_effect_id")
    public long primaryEffectId;

    @C09CT("random_effect_info")
    public GiftRandomEffectInfo randomEffectInfo;

    @C09CT("resource_id")
    public long resourceId;

    @C09CT("scheme_info")
    public SchemeInfo schemeInfo;

    @C09CT("series_info")
    public GiftSeriesInfo seriesInfo;

    @C09CT("tracker_params")
    public Map<String, String> trackerParams;

    @C09CT("type")
    public int type;

    @C09CT("ug_gift_info")
    public UGGiftStructInfo ugGiftInfo;

    @C09CT("name")
    public String name = "";

    @C09CT("nameColor")
    public int nameColor = -1;

    @C09CT("describeColor")
    public int describeColor = -1711276033;

    @C09CT("gift_rank_recommend_info")
    public String recommendInfo = "";

    @C09CT("gift_skins")
    public List<GiftSkin> giftSkins = new ArrayList();

    @C09CT("gift_texts")
    public List<GiftText> giftTexts = new ArrayList();

    @C09CT("gift_skin_to_gift_texts_infos")
    public List<GiftSkinToGiftTextsInfo> giftSkinToGiftTextsInfos = new ArrayList();

    @C09CT("gift_resources")
    public Map<String, GiftResource> giftResources = new LinkedHashMap();

    @C09CT("biz_extra")
    public Map<Long, String> bizExtra = new LinkedHashMap();

    @C09CT("strategy_event")
    public String strategyEvent = "";

    @C09CT("gift_struct_hash")
    public String giftStructHash = "";

    public static final class BatchGiftInfo {

        @C09CT("available_counts")
        public List<Long> availableCounts = new ArrayList();

        @C09CT("can_batch_send")
        public boolean canBatchSend;
    }

    public static final class ColorGroup {

        @C09CT("group_name")
        public String groupName = "";

        @C09CT("color_infos")
        public List<GiftColorInfo> colorInfos = new ArrayList();
    }

    public static final class ColorPickerInfo {

        @C09CT("groups")
        public List<ColorGroup> groups = new ArrayList();
    }

    public static final class CrossScreenEffectInfo {

        @C09CT("single_action_effect_ids")
        public Map<Long, Integer> singleActionEffectIds = new LinkedHashMap();

        @C09CT("action_effect_ids")
        public Map<Long, Integer> actionEffectIds = new LinkedHashMap();

        @C09CT("reaction_effect_ids")
        public Map<Long, Integer> reactionEffectIds = new LinkedHashMap();
    }

    public static final class GiftSeriesInfo {

        @C09CT("container_background")
        public ImageModel containerBackground;

        @C09CT("enabled")
        public boolean enabled;

        @C09CT("end_time_sec")
        public long endTimeSec;

        @C09CT("series_name")
        public String seriesName = "";

        @C09CT("gift_ids")
        public List<Long> giftIds = new ArrayList();

        @C09CT("send_gift_button_color")
        public String sendGiftButtonColor = "";

        @C09CT("pointing_back_tri_color")
        public String pointingBackTriColor = "";

        @C09CT("series_name_color")
        public String seriesNameColor = "";
    }

    public static final class GiftSkin {

        @C09CT("animated_image")
        public ImageModel animatedImage;

        @C09CT("gift_skin_id")
        public long giftSkinId;

        @C09CT("gift_skin_name")
        public String giftSkinName = "";

        @C09CT("static_image")
        public ImageModel staticImage;
    }

    public static final class GiftSkinToGiftTextsInfo {

        @C09CT("gift_skin_id")
        public long giftSkinId;

        @C09CT("gift_text_ids")
        public List<Long> giftTextIds = new ArrayList();
    }

    public static final class GiftSponsorInfo {

        @C09CT("can_sponsor")
        public boolean canSponsor;

        @C09CT("current_count")
        public long currentCount;

        @C09CT("left_count_to_sponsor")
        public long leftCountToSponsor;

        @C09CT("sponsor_count")
        public long sponsorCount;

        @C09CT("sponsor_id")
        public long sponsorId;
    }

    public static final class GiftText {

        @C09CT("gift_text_id")
        public long giftTextId;

        @C09CT("gift_text_name")
        public String giftTextName = "";
    }

    public static final class LynxCrossScreenEffectInfo {

        @C09CT("effect_ids")
        public List<Long> effectIds = new ArrayList();
    }

    public static final class MusicGiftInfo {

        @C09CT("mood_id")
        public long moodId;

        @C09CT("resource")
        public AudioResource resource;

        @C09CT("song_id")
        public long songId;

        @C09CT("artist_name")
        public String artistName = "";

        @C09CT("song_name")
        public String songName = "";

        public static final class AudioResource {

            @C09CT("audio_url")
            public String audioUrl = "";

            @C09CT("lyrics_url")
            public String lyricsUrl = "";

            @C09CT("snippet_id")
            public long snippetId;
        }
    }

    public static final class SchemeInfo {

        @C09CT("scheme_gift_type")
        public int schemeGiftType;

        @C09CT("scheme_url")
        public String schemeUrl = "";

        @C09CT("scheme_describe")
        public String schemeDescribe = "";

        @C09CT("scheme_describe_color")
        public String schemeDescribeColor = "";
    }

    public static final class UGGiftStructInfo {

        @C09CT("is_ug_gift")
        public boolean isUgGift;

        @C09CT("ug_points_cost")
        public long ugPointsCost;
    }

    public final boolean LIZ() {
        GiftLockInfo giftLockInfo = this.giftSubInfo;
        return giftLockInfo != null && giftLockInfo.mLockType == 11;
    }

    public final boolean LIZIZ() {
        List<Integer> list = this.giftVerticalScenarios;
        if (list != null) {
            return list.contains(32);
        }
        return false;
    }

    public final boolean LIZJ() {
        List<Integer> list = this.giftVerticalScenarios;
        if (list != null) {
            return list.contains(35);
        }
        return false;
    }

    public final boolean LIZLLL() {
        List<Integer> list = this.giftVerticalScenarios;
        if (list != null) {
            return list.contains(33);
        }
        return false;
    }

    public final boolean LJ() {
        SchemeInfo schemeInfo = this.schemeInfo;
        return C123100dR.LIZ(schemeInfo != null ? schemeInfo.schemeUrl : null);
    }

    public final boolean LJFF() {
        SchemeInfo schemeInfo;
        SchemeInfo schemeInfo2 = this.schemeInfo;
        return C123100dR.LIZ(schemeInfo2 != null ? schemeInfo2.schemeUrl : null) && (schemeInfo = this.schemeInfo) != null && schemeInfo.schemeGiftType == 1;
    }

    public final boolean LJI() {
        SchemeInfo schemeInfo;
        SchemeInfo schemeInfo2 = this.schemeInfo;
        return C123100dR.LIZ(schemeInfo2 != null ? schemeInfo2.schemeUrl : null) && (schemeInfo = this.schemeInfo) != null && schemeInfo.schemeGiftType == 2;
    }

    public final boolean LJII() {
        SchemeInfo schemeInfo;
        SchemeInfo schemeInfo2 = this.schemeInfo;
        return C123100dR.LIZ(schemeInfo2 != null ? schemeInfo2.schemeUrl : null) && (schemeInfo = this.schemeInfo) != null && schemeInfo.schemeGiftType == 3;
    }

    public final boolean LJIIIIZZ() {
        List<Integer> list = this.giftVerticalScenarios;
        if (list != null) {
            return list.contains(38);
        }
        return false;
    }

    public final boolean LJIIIZ() {
        int i = this.type;
        return i == 2 || i == 4 || i == 21 || i == 22;
    }
}
