package com.ss.android.ugc.aweme.setting.serverpush.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;

/* JADX INFO: loaded from: classes36.dex */
public class PushSettings extends BaseResponse {

    @C09CT("acq_video_push")
    public int acqVideoPush;

    @C09CT("agree_video_store_view")
    public int agreeVideoStoreView;

    @C09CT("do_not_translate")
    public List<ContentLanguage> allDoNotTranslate;

    @C09CT("enable_audience_control")
    public boolean audienceControlEnabled;

    @C09CT("creator_care_mode_optimised")
    public boolean careModeStatus;

    @C09CT("chat_set")
    public int chatSet;

    @C09CT("chat_setting_open_everyone")
    public boolean chatSettingOpenEveryone;

    @C09CT("chat_settings_panel")
    public int chatSettingsPanel;

    @C09CT("chat_user_type")
    public int chatUserType;

    @C09CT("cla_combine_settings")
    public ClaCombineSettings claCombineSettings;

    @C09CT("comment")
    public int comment;

    @C09CT("author_review_all_comments")
    public boolean commentFilterAll;

    @C09CT("comment_filter_status")
    public int commentFilterStatus;

    @C09CT("is_show_comment_settings")
    public boolean commentManagerVisible;

    @C09CT("comment_offensive_filter")
    public int commentOffensiveFilter;

    @C09CT("comment_push")
    public int commentPush;

    @C09CT("contact_sync")
    public boolean contactStatus;

    @C09CT("content_languages")
    public List<ContentLanguage> contentLanguage;

    @C09CT("digg_push")
    public int diggPush;

    @C09CT("do_not_translate_setting_status")
    public int doNotTranslateSettingStatus;

    @C09CT("shake_camera")
    public int douDouPhoto;

    @C09CT("download_prompt")
    public int downloadPrompt;

    @C09CT("download_setting")
    public int downloadSetting;

    @C09CT("duet")
    public int duet;

    @C09CT("empty_profile_mission")
    public int emptyProfileMission;

    @C09CT("enable_friend_active")
    public int enableActiveStatus;

    @C09CT("enable_addyours_on_profile")
    public int enableAddYoursOnProfile;

    @C09CT("enable_tiktok_preupload")
    public int enablePreUpload;

    @C09CT("push_settings")
    public List<PushSettingSwitchModel> extraPushSettings;

    @C09CT("author_all_reviewed_comments_expire")
    public int filterAllExpired;

    @C09CT("mute_word_count")
    public int filteredWordsCount;

    @C09CT("mute_word_limit")
    public int filteredWordsLimit;

    @C09CT("follow_new_story_push")
    public int followNewStoryPush;

    @C09CT("follow_new_video_push")
    public int followNewVideoPush;

    @C09CT("follow_push")
    public int followPush;

    @C09CT("following_follower_permission")
    public int followingFollowerPermission;

    @C09CT("following_visibility")
    public int followingVisibility;

    @C09CT("force_private_account")
    public boolean forcePrivateAccount;

    @C09CT("friend_new_video_inapp_push")
    public int friendNewVideoInappPush;

    @C09CT("friend_suggestions")
    public int friendSuggestion;

    @C09CT("friend_upvote_push")
    public int friendUpvotePush;

    @C09CT("friends_only_push")
    public int friendsOnlyPush;

    @C09CT("group_chat")
    public int groupChat;

    @C09CT("im_push")
    public int imPush;

    @C09CT("in_app_live_push")
    public int inAppLivePush;

    @C09CT("in_app_push_setting")
    public InAppPushSetting inAppPushSetting;

    @C09CT("favorite_on_item_permission")
    public int isMyLikeVisibleInVideo;

    @C09CT("is_password_set")
    public int isPasswordSet;

    @C09CT("vulnerable_user")
    public int isVulnerable;

    @C09CT("join_beta_entrance")
    public JoinBetaEntrance joinBetaEntrance;

    @C09CT("live_inner_push")
    public int liveInnerPush;

    @C09CT("live_push")
    public int livePush;

    @C09CT("live_reward_push")
    public int liveRewardPush;

    @C09CT("mention_push")
    public int mentionPush;

    @C09CT("natural_disaster_forecasts_push")
    public int naturalDisasterForecastsPush;

    @C09CT("notice_inapp_push")
    public int noticeInappPush;

    @C09CT("notify_private_account")
    public int notifyPrivateAccount;

    @C09CT("now_comment_push")
    public int nowComment;

    @C09CT("now_like_push")
    public int nowLike;

    @C09CT("now_post_push")
    public int nowPost;

    @C09CT("tiktok_now_push")
    public int nowPush;

    @C09CT("now_viewers_push")
    public int nowViewer;

    @C09CT("other_channel")
    public int otherChannel;

    @C09CT("passive_chat_set")
    public int passiveChatSet;

    @C09CT("profile_viewer_push")
    public int profileViewerPush;

    @C09CT("im_push_preview_v2")
    public int pushMessagePreviewText;

    @C09CT("enable_qna_on_profile")
    public int qnaOnProfile;

    @C09CT("react")
    public int react;

    @C09CT("recommend_video_push")
    public int recommendVideoPush;

    @C09CT("photosensitive_videos_setting")
    public int removePhotosensitiveContent;

    @C09CT("screen_time_push")
    public int screenTimePush;

    @C09CT("selected_content_languages")
    public List<ContentLanguage> selectedContentLanguage;

    @C09CT("selected_do_not_translate")
    public List<ContentLanguage> selectedDoNotTranslate;

    @C09CT("selected_translation_language")
    public ContentLanguage selectedTranslationLanguage;

    @C09CT("own_mute_word_count")
    public int selfFilterWordsCount;

    @C09CT("settings_version")
    public String settingsVersion;

    @C09CT("shop_push_setting")
    public ShopPushSetting shopPushSetting;

    @C09CT("stitch")
    public int stitch;

    @C09CT("story_interaction_push")
    public int storyInteractionPush;

    @C09CT("story_reply_permission")
    public int storyReplyPermission;

    @C09CT("story_view_permission")
    public int storyViewPermission;

    @C09CT("sug_to_contacts")
    public int sugToContacts;

    @C09CT("sug_to_fb_friends")
    public int sugToFbFriends;

    @C09CT("sug_to_interested_users")
    public int sugToInterestedUsers;

    @C09CT("sug_to_mlbb_friends")
    public int sugToMLBBFriends;

    @C09CT("sug_to_mutual_connections")
    public int sugToMutualConnections;

    @C09CT("sug_to_who_share_link")
    public int sugToWhoShareLink;

    @C09CT("sync_duoshan")
    public int syncDuoshan;

    @C09CT("sync_toast")
    public int syncToast;

    @C09CT("translation_languages")
    public List<ContentLanguage> translationLanguage;

    @C09CT("unselected_content_languages")
    public List<ContentLanguage> unSelectedContentLanguage;

    @C09CT("general_upvote_push")
    public int upvoteVideoPush;

    @C09CT("visual_search_settings")
    public VisualSearchSettings visualSearchSettings;

    @C09CT("favorite_permission")
    public int whoCanSeeMyLikeList;

    public final int LJ() {
        for (PushSettingSwitchModel pushSettingSwitchModel : this.extraPushSettings) {
            if (pushSettingSwitchModel.itemId.equals("live_customized_update")) {
                return pushSettingSwitchModel.status;
            }
        }
        return -1;
    }

    public final int LJI() {
        for (PushSettingSwitchModel pushSettingSwitchModel : this.extraPushSettings) {
            if ("live_out_multi_guest_push".equals(pushSettingSwitchModel.itemId)) {
                return pushSettingSwitchModel.status;
            }
        }
        return -1;
    }

    public final int LJIILIIL() {
        for (PushSettingSwitchModel pushSettingSwitchModel : this.extraPushSettings) {
            if (pushSettingSwitchModel.itemId.equals("live_transaction_push")) {
                return pushSettingSwitchModel.status;
            }
        }
        return -1;
    }
}
