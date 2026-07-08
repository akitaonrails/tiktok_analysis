package com.ss.android.ugc.aweme.tako.ccl.net;

import X.C1515820pY4;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501130pAN;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import X.InterfaceC1501310pAf;
import X.InterfaceC2174608fY;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.tako.ccl.model.api.MessageChunkResult;
import com.ss.android.ugc.aweme.tako.ccl.model.api.SearchLandingPageResponse;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoAdditonalPanelListResponse;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoBaseResponse;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoBotSettingResponse;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoNewActionBarListResponse;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoTopTitleConfigResponse;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes28.dex */
public interface TakoApi {
    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/aweme/v1/tako/op/delete/")
    Object batchDelete(@InterfaceC1501050pAF("msg_ids") String str, @InterfaceC1501050pAF("session_id") String str2, @InterfaceC1501050pAF("conversation_id") String str3, @InterfaceC1501050pAF("sub_conv_id") String str4, @InterfaceC1501050pAF("delete_sub_conv") boolean z, InterfaceC1364105Vn<? super BatchDeleteResponse> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/aweme/v1/tako/conversation/list/")
    Object batchFetchConversations(@InterfaceC1501070pAH("count") int i, InterfaceC1364105Vn<? super BatchFetchConversationsResponse> interfaceC1364105Vn);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/aweme/v1/tako/batch/update/")
    Object batchUpdateMessage(@InterfaceC1501050pAF("messages") String str, @InterfaceC1501050pAF("session_id") String str2, @InterfaceC1501050pAF("conversation_id") String str3, @InterfaceC1501050pAF("sub_conv_id") String str4, InterfaceC1364105Vn<? super BatchUpdateMessageResponse> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/aweme/v1/tako/bot/center/")
    Object botCenter(@InterfaceC1501070pAH("category") String str, InterfaceC1364105Vn<? super TakoBotCenterResponse> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/aweme/v1/tako/bot/setting/")
    Object botSetting(@InterfaceC1501070pAH("bot_setting_type") int i, @InterfaceC1501070pAH("bot_id") long j, @InterfaceC1501070pAH("enable_newbot") boolean z, InterfaceC1364105Vn<? super TakoBotSettingResponse> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/aweme/v1/tako/api/audio/auth/")
    @InterfaceC1501310pAf({"Content-Type: application/json"})
    Object fetchAudioAuthInfo(@InterfaceC1485405rg AudioAuthRequest audioAuthRequest, InterfaceC1364105Vn<? super AudioAuthResponse> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/aweme/v1/tako/new/conversation/")
    Object fetchConversation(@InterfaceC1501070pAH("bot_id") long j, @InterfaceC1501070pAH("bot_source") int i, @InterfaceC1501070pAH("hit_multi_conv") boolean z, InterfaceC1364105Vn<? super FetchConversationResponse> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/aweme/v1/tako/imagex/upload/auth/")
    Object fetchImageUploadAuthConfig(InterfaceC1364105Vn<? super TakoImageUploadAuthConfig> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/aweme/v1/tako/aweme/l8/")
    Object fetchLemon8Awemes(@InterfaceC1501070pAH("bot_id") long j, @InterfaceC1501070pAH("gid_list") List<String> list, InterfaceC1364105Vn<? super TakoLemon8AwemeResponse> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/aweme/v1/tako/sub_conv/list/")
    Object fetchSubConversationList(@InterfaceC1501070pAH("conversation_id") String str, @InterfaceC1501070pAH("cursor") long j, @InterfaceC1501070pAH("count") int i, InterfaceC1364105Vn<? super FetchSubConversationListResponse> interfaceC1364105Vn);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/aweme/v1/tako/template/list/")
    Object fetchTemplatesSquare(@InterfaceC1501050pAF("tab_id") String str, @InterfaceC1501050pAF("cursor") Integer num, InterfaceC1364105Vn<? super TemplateTabsResponse> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/aweme/v1/tako/user/feature/")
    Object fetchUserFeature(@InterfaceC1501070pAH("features") long j, @InterfaceC1501070pAH("conversation_id") String str, @InterfaceC1501070pAH("switch_status") String str2, @InterfaceC1501070pAH("nimble_version") String str3, @InterfaceC1501070pAH("nimble_tcc_key") String str4, @InterfaceC1501070pAH("full_nimble_version") String str5, InterfaceC1364105Vn<? super TakoUserFeatureResponse> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/aweme/v1/user/profile/other/")
    Object fetchUserOther(@InterfaceC1501070pAH("user_id") String str, @InterfaceC1501070pAH("sec_user_id") String str2, @InterfaceC1501070pAH("scene_id") Integer num, InterfaceC1364105Vn<? super TakoUserOtherResponse> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/aweme/v1/tako/plus_panel/list/")
    Object getAdditionalPanelList(@InterfaceC1501070pAH("aigc_version") Integer num, InterfaceC1364105Vn<? super TakoAdditonalPanelListResponse> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/aweme/v1/tako/action_bar/list/")
    Object getNewActionBarList(@InterfaceC1501070pAH("aigc_version") Integer num, InterfaceC1364105Vn<? super TakoNewActionBarListResponse> interfaceC1364105Vn);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/aweme/v1/search/tako/onboarding/")
    Object getOnboardingClickData(@InterfaceC1501050pAF("last_from_group_id") String str, @InterfaceC1501050pAF("last_feed_group_id") String str2, @InterfaceC1501050pAF("component_type") int i, InterfaceC1364105Vn<? super TakoOnBoardingResponse> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/aweme/v1/tako/nav_bar/config/")
    Object getTopTitleConfig(InterfaceC1364105Vn<? super TakoTopTitleConfigResponse> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/aweme/v1/tako/inbox/state/")
    Object inboxCursor(InterfaceC1364105Vn<? super GetUserInboxIndexResponse> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/aweme/v1/tako/inbox/message/list/")
    Object inboxPull(@InterfaceC1501070pAH("cursor") long j, @InterfaceC1501070pAH("count") long j2, @InterfaceC1501070pAH("trigger_event") int i, InterfaceC1364105Vn<? super GetIncrementalMsgResponse> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/aweme/v1/tako/conversation/message/list/")
    Object loadMoreMsgByConversation(@InterfaceC1501070pAH("conversation_id") String str, @InterfaceC1501070pAH("sub_conv_id") String str2, @InterfaceC1501070pAH("count") int i, @InterfaceC1501070pAH("cursor") long j, @InterfaceC1501070pAH("sort") int i2, InterfaceC1364105Vn<? super LoadMoreMsgByConversationResponse> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/aweme/v1/tako/message/read/")
    Object messageRead(@InterfaceC1501070pAH("conversation_id") String str, @InterfaceC1501070pAH("sub_conv_id") String str2, @InterfaceC1501070pAH("msg_seq_id") long j, @InterfaceC1501070pAH("msg_id") String str3, @InterfaceC1501070pAH("session_id") String str4, @InterfaceC1501070pAH("is_push_msg") Boolean bool, InterfaceC1364105Vn<? super TakoMessageReadResponse> interfaceC1364105Vn);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/aweme/v1/tako/questionnaire/show/")
    Object postQuestionnaireShow(@InterfaceC1501050pAF(FollowStatusChangeMethod.PARAM_UID) int i, @InterfaceC1501050pAF("session_id") String str, InterfaceC1364105Vn<? super TakoBaseResponse> interfaceC1364105Vn);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/aweme/v1/tako/questionnaire/submit/")
    Object postQuestionnaireSubmit(@InterfaceC1501050pAF(FollowStatusChangeMethod.PARAM_UID) int i, @InterfaceC1501050pAF("session_id") String str, @InterfaceC1501050pAF("select_star_num") int i2, @InterfaceC1501050pAF("select_options_index") String str2, @InterfaceC1501050pAF("input_content") String str3, InterfaceC1364105Vn<? super TakoBaseResponse> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/aweme/v1/tako/video/recall/")
    Object recallAwemeList(@InterfaceC1501070pAH("answer_msg_id") String str, @InterfaceC1501070pAH("answer_msg_server_seq") long j, @InterfaceC1501070pAH("bot_id") Long l, @InterfaceC1501070pAH("page") Integer num, @InterfaceC1501070pAH("page_size") int i, @InterfaceC1501070pAH("version_id") String str2, InterfaceC1364105Vn<? super TakoAwemeRecallResponse> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/aweme/v1/search/landing_page/")
    Object searchLandingPage(@InterfaceC1501130pAN Map<String, String> map, InterfaceC1364105Vn<? super SearchLandingPageResponse> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/aweme/v1/tako/gateway/report/data")
    Object sendSyncData(@InterfaceC1485405rg AgentCommandSyncData agentCommandSyncData, InterfaceC1364105Vn<? super TakoBaseResponse> interfaceC1364105Vn);

    @InterfaceC2174608fY
    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/aweme/v1/tako/op/stream/")
    Object takoOpChunk(@InterfaceC1501050pAF("op_type") int i, @InterfaceC1501050pAF("enter_source") String str, @InterfaceC1501050pAF("entry_time") long j, @InterfaceC1501050pAF("uuid") String str2, @InterfaceC1501050pAF("conversation_id") String str3, @InterfaceC1501050pAF("msg_id") String str4, @InterfaceC1501050pAF("msg_type") int i2, @InterfaceC1501050pAF("msg_content") String str5, @InterfaceC1501050pAF("session_id") String str6, @InterfaceC1501050pAF("sub_session_id") String str7, @InterfaceC1501050pAF("action_id") Long l, @InterfaceC1501050pAF("up_sync") String str8, @InterfaceC1501050pAF("request_time") long j2, @InterfaceC1501050pAF("ext") String str9, @InterfaceC1501050pAF("bot_id") long j3, @InterfaceC1501050pAF("bot_source") int i3, @InterfaceC1501050pAF("bot_type") Integer num, @InterfaceC1501050pAF("bot_mode") Integer num2, @InterfaceC1501050pAF("send_type") int i4, @InterfaceC1501050pAF("choice_id") String str10, @InterfaceC1501050pAF("is_peek") Boolean bool, @InterfaceC1501050pAF("search_card_summary") String str11, @InterfaceC1501050pAF("in_app_signal") String str12, @InterfaceC1501050pAF("enable_deep_search") boolean z, @InterfaceC1501050pAF("gen_style") int i5, @InterfaceC1501050pAF("version_seq") int i6, @InterfaceC1501050pAF("base_msg") String str13, @InterfaceC1501050pAF("active_action_bar") int i7, @InterfaceC1501050pAF("aigc_type") Integer num3, @InterfaceC1501050pAF("active_ai_image_sub_bar") Integer num4, @InterfaceC1501050pAF("op_retry_type") Integer num5, @InterfaceC1501050pAF("action_bar_unique_key") String str14, @InterfaceC1501050pAF("lang_style") int i8, @InterfaceC1501050pAF("aigc_version") int i9, @InterfaceC1501050pAF("inspiration_session_id") String str15, @InterfaceC1501050pAF("reference_info") String str16, @InterfaceC1501050pAF("edit_info") String str17, @InterfaceC1501050pAF("sub_conv_info") String str18, @InterfaceC1501050pAF("agent_client_env") String str19, @InterfaceC1501050pAF("video_sug_msg_id") Long l2, @InterfaceC1501050pAF("video_sug_query_msg_id") Long l3, @InterfaceC1501050pAF("from_video_sug") boolean z2, @InterfaceC1501050pAF("chat_id") String str20, InterfaceC1364105Vn<? super C1515820pY4<MessageChunkResult>> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/aweme/v1/tako/user/setting/")
    Object userSetting(@InterfaceC1501070pAH("setting_type") int i, @InterfaceC1501070pAH("conversation_id") String str, @InterfaceC1501070pAH("privacy_popup_type") int i2, @InterfaceC1501070pAH("switch_status") String str2, @InterfaceC1501070pAH("lang_style") int i3, InterfaceC1364105Vn<? super GetUserSettingSwitchStatusResponse> interfaceC1364105Vn);
}
