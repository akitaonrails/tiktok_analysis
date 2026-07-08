package com.ss.android.ugc.aweme.commercialize.measurement.mrc.experiment;

import X.C09CT;
import X.C1697810uHb;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class MRCImpressionEventAbModel {
    public static final List<String> LIZ = C1697810uHb.LJIIJJI("cover", "gradual_top", "gradual_bottom", "long_press_layout", "player_view", "title_shadow", "spark_container", "view_rootview", "statusBarBackground", "video_effective_area", "video_obstructed_area", "player_view_pager", "ad_native_product_tile_container", "product_tile_ad_lynx_root_layout", "product_tile_ad_native_root_layout", "ad_feed_card_container", "ad_feed_card_container_v2", "live_ad_card_container", "ad_live_product_banner_container", "native_ad_bottom_label_frame", "feed_ad_lynx_mask_container_spark", "feed_ad_lynx_mask_container_bullet", "spark_ad_sticker_view", "bullet_ad_sticker_view", "ad_hybrid_default_layout", "feed_ad_lynx_super_like_spark_container", "feed_ad_lynx_super_like_bullet_container", "feed_multi_tag_layout", "spark_center_view_container", "bullet_center_view_container", "spark_ad_sticker_view", "view_interaction_fe_container", "feed_shake_egg_container", "interaction_fe_full_container", "ad_play_fun_root");

    @C09CT("enable_cache_view_id")
    public final boolean enableCacheViewId;

    @C09CT("enable_mrc")
    public final boolean enableMRC;

    @C09CT("loop_interval")
    public final long loopInterval;

    @C09CT("view_id_white_list")
    public final List<String> viewIdWhiteList;

    public MRCImpressionEventAbModel() {
        this(180L, true, LIZ, false);
    }

    public MRCImpressionEventAbModel(long j, boolean z, List<String> list, boolean z2) {
        this.loopInterval = j;
        this.enableMRC = z;
        this.viewIdWhiteList = list;
        this.enableCacheViewId = z2;
    }
}
