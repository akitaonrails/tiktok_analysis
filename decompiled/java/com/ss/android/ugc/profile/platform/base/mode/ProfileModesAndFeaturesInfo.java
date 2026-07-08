package com.ss.android.ugc.profile.platform.base.mode;

import X.C09CT;
import X.C1253010iiB;
import X.C13LP;
import X.C1697810uHb;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes20.dex */
public final class ProfileModesAndFeaturesInfo {

    @C09CT("count")
    public final int count;

    @C09CT("modes")
    public final List<ProfileSingleModeAndFeaturesList> modes;

    public ProfileModesAndFeaturesInfo() {
        this(0, null, 3, null);
    }

    public ProfileModesAndFeaturesInfo(int i, List<ProfileSingleModeAndFeaturesList> list) {
        this.count = i;
        this.modes = list;
    }

    public ProfileModesAndFeaturesInfo(int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 2 : i, (i2 & 2) != 0 ? Collections.singletonList(new ProfileSingleModeAndFeaturesList("normal_mode", C13LP.LJLIL(C1253010iiB.LIZJ.LJJIII(), C1697810uHb.LJIIJJI("nav_bar", "nav_bar_start", "nav_bar_start_back", "nav_bar_start_find_friends", "nav_bar_start_tiktok_plus", "nav_bar_start_share_profile", "nav_bar_start_activity", "nav_bar_center", "nav_bar_center_nickname", "nav_bar_end", "nav_bar_end_live", "nav_bar_end_viewer_entrance", "nav_bar_end_settings", "nav_bar_end_profile_menu", "nav_bar_end_bell", "nav_bar_end_more", "nav_bar_base_item", "nav_bar_end_settings_and_privacy", "header", "content_section_cell_list_base_item", "content_section_cell_base_item", "content_section_cell_rich_base_item", "content_section_list", "content_section_cell_list", "content_section_cell_list_tools", "content_section_cell_list_management", "content_section_cell_list_contents", "content_section_cell_list_compliance", "content_section_cell", "content_section_cell_balance", "content_section_cell_my_qr_code", "content_section_cell_my_music", "content_section_cell_creator_tools", "content_section_cell_business_suit", "content_section_cell_watch_history", "content_section_cell_purchased_series", "content_section_cell_offline_videos", "content_section_cell_transparency_mstv", "search_section", "search_section_cell_input_box", "search_section_cell_settings_and_privacy", "bottom", "bottom_back_to_profile", "header_top_tips", "top_tips_private_info", "top_tips_memorialised_account", "top_tips_base_item", "header_avatar", "avatar_normal", "info", "user_basic_info", "user_info", "user_account_base_info", "user_account_user_name", "user_info_base_item", "user_account_base_item", "relation_info_base_item", "user_account_verify", "user_account_user_name_modify", "user_account_qr_code", "user_account_state_control_media", "user_account_honor_label", "user_account_rba_identifier", "user_account_org_identifier", "user_account_ags_warning", "user_account_name_info", "user_account_name_info_base_item", "user_info_nickname", "user_info_private_account", "user_info_memorialised_account", "user_account_pronouns", "user_info_manage", "user_info_manage_base_item", "user_info_manage_edit_profile", "user_relation_info", "relation_info_following", "relation_info_follower", "relation_info_like", "relation_info_posts", "cta", "cta_edit_profile", "cta_add_friends", "cta_share_profile", "cta_social_entrance", "cta_recommend_button", "cta_base_item", "cta_social_interaction", "cta_social_follow", "cta_social_message", "cta_creator_studio", "cta_settings_button", "recommend", "recommend_user_card", "bio", "bio_pronouns", "bio_signature", "bio_add_bio", "bio_tap_to_add_bio", "bio_school_name", "bio_add_school", "bio_mail_link", "bio_email", "bio_link", "bio_business_account", "bio_business_account_email", "bio_business_account_app_download", "bio_business_account_phone", "bio_business_account_address", "bio_business_account_coupon", "bio_base_item", "bio_relation_label", "bio_profile_link", "bio_structural_info_base_item", "bio_structural_info", "bio_structural_link", "bio_tto_collaboration", "advanced_feature", "advanced_feature_base_item", "advanced_feature_showcase", "advanced_feature_shop", "advanced_feature_order_center", "advanced_feature_tipping", "advanced_feature_supporting", "advanced_feature_qna_profile", "advanced_feature_social_entrance", "advanced_feature_leads_gen", "advanced_feature_paid_collections", "advanced_feature_live_events", "advanced_feature_live_subscription", "advanced_feature_bulletin_board", "advanced_feature_music_pre_save", "profile_tab", "profile_tab_music", "profile_tab_public_post", "profile_tab_ecommerce_store", "profile_tab_ecommerce_showcase", "profile_tab_business_page", "profile_tab_effect", "profile_tab_sticker_store", "profile_tab_private", "profile_tab_favorite", "profile_tab_repost", "profile_tab_like", "profile_tab_short_drama", "profile_tab_pine_drama_watch_history", "profile_tab_live_game_org_account", "pop_up", "pop_up_creator_fund_account_notice", "story_highlight", "story_highlight_collection_base_item", "story_highlight_banner_base_item", "story_highlight_banner_create", "story_highlight_collection_list")))) : list);
    }
}
