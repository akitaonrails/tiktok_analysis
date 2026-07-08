package com.ss.android.ugc.aweme.notification.api;

import X.C01GW;
import X.C040I;
import X.C11NZ;
import X.C452501pT;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485505rh;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501120pAM;
import X.InterfaceC1501130pAN;
import X.InterfaceC1501200pAU;
import X.InterfaceC1501240pAY;
import X.InterfaceC1501370pAl;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.friends.model.SummonFriendList;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinAccountCheckResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinAccountEditResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinAccountInfoResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinAccountInvitationResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinAccountMemberResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinAwemeIsShared;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinBaseAccountInfo;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinCloseResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinCreateItemResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinCreateMultiItemResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinEmojiActionResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinEmojiViewDetailResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinExposeResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinFetchEventResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinFirstlyCommentListResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinFunctionSettingUpdate;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinHybridResourceResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinListResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinNewsAllowlistResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinNewsContentCheckRequest;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinPollVoteDetailResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinPublishCommentResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinSecondlyCommentResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinSettingsInfoResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinShareMusicListResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinSimpleResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinSubscribeResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinUploadAuthKeyResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.IMSearchSuggestedResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.InboxAggregateListResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.InboxSearchResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeCombineResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeListsResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.SubmitSubscribeResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.SubscribeCombineSettingResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.SubscribeInfoResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.SystemNoticeResponse;
import com.ss.android.ugc.aweme.notification.aggregate.data.BulletinInviteListResponse;
import com.ss.android.ugc.aweme.notification.bean.NotificationSubscribeSettingsList;
import com.ss.android.ugc.aweme.notification.creator.model.response.CreatorNoticeResponse;
import com.ss.android.ugc.aweme.notification.followrequest.model.RejectResponse;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Map;
import kotlin.jvm.internal.AFwS195S0000000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class NotificationApi {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(263));
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(262));

    public interface Api {
        @InterfaceC1501200pAU("/aweme/v1/notice/multi/")
        C11NZ<NoticeListsResponse> LIZ(@InterfaceC1501120pAM("group_list") String str, @InterfaceC1501120pAM("scenario") int i);

        @InterfaceC1501200pAU("/tiktok/artist_api/bulletin/song/")
        Object LJIIIIZZ(@InterfaceC1501120pAM("cursor") int i, @InterfaceC1501120pAM("count") int i2, InterfaceC1364105Vn<? super BulletinShareMusicListResponse> interfaceC1364105Vn);

        @InterfaceC1501200pAU("/tiktok/v1/news/allowlist/get")
        Object LJIIJJI(@InterfaceC1501120pAM("publisher_id") String str, InterfaceC1364105Vn<? super BulletinNewsAllowlistResponse> interfaceC1364105Vn);

        @InterfaceC1501200pAU("/tiktok/bulletin/poll/vote_detail/")
        Object LJIILJJIL(@InterfaceC1501120pAM("identity_type") int i, @InterfaceC1501120pAM("channel_id") long j, @InterfaceC1501120pAM("item_id") long j2, @InterfaceC1501120pAM("poll_id") long j3, @InterfaceC1501120pAM("option_id") Long l, @InterfaceC1501120pAM("count") int i2, @InterfaceC1501120pAM("cursor") String str, InterfaceC1364105Vn<? super BulletinPollVoteDetailResponse> interfaceC1364105Vn);

        @InterfaceC1501240pAY("/aweme/v1/notice/del/")
        C11NZ<BaseResponse> LJIILL(@InterfaceC1501120pAM("notice_id") String str);

        @InterfaceC1501240pAY("/tiktok/bulletin/account/settings/update/")
        Object LJIILLIIL(@C040I BulletinFunctionSettingUpdate bulletinFunctionSettingUpdate, InterfaceC1364105Vn<? super BaseResponse> interfaceC1364105Vn);

        @InterfaceC1501200pAU("/tiktok/notice/subscribe_card/get/v1")
        Object LJIIZILJ(@InterfaceC1501120pAM("channel_id") String str, @InterfaceC1501120pAM("category_labels") String str2, @InterfaceC1501120pAM("client_key") String str3, @InterfaceC1501120pAM("category_source") Integer num, @InterfaceC1501120pAM("trigger_source") Integer num2, InterfaceC1364105Vn<? super SubscribeInfoResponse> interfaceC1364105Vn);

        @InterfaceC1501240pAY("/tiktok/bulletin/settings/get/")
        Object LJIJ(@C040I BulletinFetchSettingsInfoRequest bulletinFetchSettingsInfoRequest, InterfaceC1364105Vn<? super BulletinSettingsInfoResponse> interfaceC1364105Vn);

        @InterfaceC1501200pAU("/tiktok/notice/system_notice_box/v1/")
        Object LJIJI(@InterfaceC1501120pAM("group") String str, @InterfaceC1501120pAM("experiment_params") String str2, InterfaceC1364105Vn<? super SystemNoticeResponse> interfaceC1364105Vn);

        @InterfaceC1501240pAY("/tiktok/bulletin/event/report/")
        Object LJIJJ(@C040I BulletinEventReportRequest bulletinEventReportRequest, InterfaceC1364105Vn<? super BulletinSimpleResponse> interfaceC1364105Vn);

        @InterfaceC1501200pAU("/tiktok/bulletin/account/info/")
        Object LJIJJLI(@InterfaceC1501120pAM(FollowStatusChangeMethod.PARAM_UID) long j, @InterfaceC1501120pAM("load_type") int i, @InterfaceC1501120pAM("conversation_short_id") String str, @InterfaceC1501120pAM("server_message_id") String str2, @InterfaceC1501120pAM("experiment_params") String str3, InterfaceC1364105Vn<? super BulletinAccountInfoResponse> interfaceC1364105Vn);

        @InterfaceC1501200pAU("/tiktok/bulletin/item/fetch_list_events/")
        Object LJIL(@InterfaceC1501120pAM("channel_id") long j, @InterfaceC1501120pAM("event_begin_timestamp") Long l, InterfaceC1364105Vn<? super BulletinFetchEventResponse> interfaceC1364105Vn);

        @InterfaceC1501200pAU("/tiktok/bulletin/channel/invite_list/")
        Object LJJ(@InterfaceC1501120pAM("cursor") String str, @InterfaceC1501120pAM("page_size") int i, InterfaceC1364105Vn<? super BulletinInviteListResponse> interfaceC1364105Vn);

        @InterfaceC1501200pAU("/aweme/v1/inbox/agg_list/")
        Object LJJI(@InterfaceC1501120pAM("cursor") String str, @InterfaceC1501120pAM("count") int i, @InterfaceC1501120pAM("notice_id") long j, @InterfaceC1501120pAM("notice_type") long j2, InterfaceC1364105Vn<? super InboxAggregateListResponse> interfaceC1364105Vn);

        @InterfaceC1501200pAU("/tiktok/bulletin/item/list/")
        Object LJJIFFI(@InterfaceC1501120pAM("count") int i, @InterfaceC1501120pAM("cursor") String str, @InterfaceC1501120pAM("channel_id") String str2, @InterfaceC1501120pAM("first_read_time_in_session") Long l, @InterfaceC1501120pAM("extra_params") String str3, InterfaceC1364105Vn<? super BulletinListResponse> interfaceC1364105Vn);

        @InterfaceC1501200pAU("/tiktok/notice/creator_inbox/v1/")
        C11NZ<CreatorNoticeResponse> LJJII(@InterfaceC1501120pAM("tab_id") int i, @InterfaceC1501120pAM("experiment_params") String str, @InterfaceC1501120pAM("tab_to_sort_map") String str2, @InterfaceC1501120pAM("filter_option_ids") String str3, @InterfaceC1501120pAM("cursor") String str4, @InterfaceC1501120pAM("last_read_time") int i2, @InterfaceC1501120pAM("wall_time") int i3, @InterfaceC1501120pAM("need_mark_read") boolean z, @InterfaceC1501120pAM("need_mark_read_all") boolean z2);

        @InterfaceC1501200pAU("/tiktok/bulletin/account_base_info/")
        Object LJJIII(InterfaceC1364105Vn<? super BulletinBaseAccountInfo> interfaceC1364105Vn);

        @InterfaceC1501200pAU("/aweme/v2/comment/list/")
        Object LJJIIJ(@InterfaceC1501120pAM("aweme_id") String str, @InterfaceC1501120pAM("cursor") int i, @InterfaceC1501120pAM("count") int i2, @InterfaceC1501120pAM("scenario") int i3, @InterfaceC1501120pAM("service_id") int i4, @InterfaceC1501120pAM("source") int i5, @InterfaceC1501120pAM("channel_name") String str2, @InterfaceC1501120pAM("insert_ids") String str3, InterfaceC1364105Vn<? super BulletinFirstlyCommentListResponse> interfaceC1364105Vn);

        @InterfaceC1501200pAU("/tiktok/bulletin/account/check/")
        Object LJJIIJZLJL(@InterfaceC1501120pAM("name") String str, @InterfaceC1501120pAM("extra_params") String str2, InterfaceC1364105Vn<? super BulletinAccountCheckResponse> interfaceC1364105Vn);

        @InterfaceC1501240pAY("/tiktok/bulletin/settings/update/")
        Object LJJIIZ(@C040I BulletinUpdateSettingsInfoRequest bulletinUpdateSettingsInfoRequest, InterfaceC1364105Vn<? super BaseResponse> interfaceC1364105Vn);

        @InterfaceC1501200pAU("/tiktok/v1/im/search_suggested/")
        Object LJJIIZI(@InterfaceC1501120pAM("sort_type") int i, InterfaceC1364105Vn<? super IMSearchSuggestedResponse> interfaceC1364105Vn);

        @InterfaceC1501200pAU("/tiktok/bulletin/upload/authkey/")
        Object LJJIJ(@InterfaceC1501120pAM("channel_id") long j, @InterfaceC1501120pAM("upload_file_type") int i, InterfaceC1364105Vn<? super BulletinUploadAuthKeyResponse> interfaceC1364105Vn);

        @InterfaceC1501200pAU("/aweme/v1/discover/search/")
        Object LJJIJIIJI(@InterfaceC1501120pAM("keyword") String str, @InterfaceC1501120pAM("count") long j, @InterfaceC1501120pAM("cursor") long j2, @InterfaceC1501120pAM("type") int i, @InterfaceC1501120pAM("search_source") String str2, @InterfaceC1501120pAM("filter_block") int i2, @InterfaceC1501120pAM("search_id") String str3, InterfaceC1364105Vn<? super SummonFriendList> interfaceC1364105Vn);

        @InterfaceC1501200pAU("/aweme/v1/notice/multi/")
        Object LJJIJIIJIL(@InterfaceC1501120pAM("group_list") String str, @InterfaceC1501120pAM("scenario") int i, InterfaceC1364105Vn<? super NoticeListsResponse> interfaceC1364105Vn);

        @InterfaceC1501200pAU("/aweme/v1/comment/list/reply/")
        Object LJJIJIL(@InterfaceC1501120pAM("comment_id") String str, @InterfaceC1501120pAM("aweme_id") String str2, @InterfaceC1501120pAM("cursor") int i, @InterfaceC1501120pAM("count") int i2, @InterfaceC1501120pAM("service_id") int i3, @InterfaceC1501120pAM("source") int i4, @InterfaceC1501120pAM("channel_name") String str3, @InterfaceC1501120pAM("insert_ids") String str4, InterfaceC1364105Vn<? super BulletinSecondlyCommentResponse> interfaceC1364105Vn);

        @InterfaceC1501200pAU("/tiktok/notice/subscribe_combine_setting/get/v1/")
        Object LJJIJL(@InterfaceC1501120pAM("group") int i, InterfaceC1364105Vn<? super SubscribeCombineSettingResponse> interfaceC1364105Vn);

        @InterfaceC1501240pAY("/tiktok/v1/news/bulletin_board/content/check")
        Object LJJIJLIJ(@C040I BulletinNewsContentCheckRequest bulletinNewsContentCheckRequest, InterfaceC1364105Vn<? super BaseResponse> interfaceC1364105Vn);

        @InterfaceC1501200pAU("/tiktok/bulletin/account/resource_list/")
        Object LJJIL(@InterfaceC1501120pAM("channel_id") long j, @InterfaceC1501120pAM("extra_params") String str, InterfaceC1364105Vn<? super BulletinHybridResourceResponse> interfaceC1364105Vn);

        @InterfaceC1501200pAU("/tiktok/bulletin/emoji/view_detail/")
        Object LJJIZ(@InterfaceC1501120pAM("channel_id") long j, @InterfaceC1501120pAM("bulletin_item_id") long j2, @InterfaceC1501120pAM("emoji") String str, @InterfaceC1501120pAM("count") int i, @InterfaceC1501120pAM("cursor") String str2, @InterfaceC1501120pAM("wall_time") Long l, @InterfaceC1501120pAM("fall_back_type") Integer num, InterfaceC1364105Vn<? super BulletinEmojiViewDetailResponse> interfaceC1364105Vn);

        @InterfaceC1501200pAU("/tiktok/bulletin/account/invitation/")
        Object LJJJ(InterfaceC1364105Vn<? super BulletinAccountInvitationResponse> interfaceC1364105Vn);

        @InterfaceC1501240pAY("/tiktok/bulletin/emoji/action/")
        C11NZ<BulletinEmojiActionResponse> LJJJI(@InterfaceC1501120pAM("channel_id") long j, @InterfaceC1501120pAM("bulletin_item_id") long j2, @InterfaceC1501120pAM("emoji") String str, @InterfaceC1501120pAM("type") int i, @InterfaceC1501120pAM("identity_type") Integer num);

        @InterfaceC1501200pAU("/aweme/v1/user/set/settings/")
        C11NZ<BaseResponse> LJJJIL(@InterfaceC1501120pAM("field") String str, @InterfaceC1501120pAM("value") int i);

        @InterfaceC1501200pAU("/tiktok/notice/unsubscribe_setting/get/v1/")
        C11NZ<NotificationSubscribeSettingsList> LJJJJ(@InterfaceC1501120pAM("group") int i);

        @InterfaceC1501200pAU("/tiktok/notice/search/v1/")
        Object LJJJJI(@InterfaceC1501120pAM("group") int i, @InterfaceC1501120pAM(Scene.SCENE_SERVICE) int i2, @InterfaceC1501120pAM("from_user_id") Long l, @InterfaceC1501120pAM("search_text") String str, @InterfaceC1501120pAM("cursor") String str2, @InterfaceC1501120pAM("count") int i3, InterfaceC1364105Vn<? super InboxSearchResponse> interfaceC1364105Vn);

        @InterfaceC1501200pAU("/tiktok/bulletin/account/member/")
        Object LJJJJIZL(@InterfaceC1501120pAM("channel_id") long j, @InterfaceC1501120pAM("count") int i, @InterfaceC1501120pAM("cursor") String str, InterfaceC1364105Vn<? super BulletinAccountMemberResponse> interfaceC1364105Vn);

        @InterfaceC1501240pAY("/tiktok/bulletin/item/check/duplicate/")
        @InterfaceC1485505rh
        Object checkAwemeIsShared(@InterfaceC1501050pAF("video_item_id") String str, @InterfaceC1501050pAF("channel_id") long j, InterfaceC1364105Vn<? super BulletinAwemeIsShared> interfaceC1364105Vn);

        @InterfaceC1501240pAY("/aweme/v1/comment/delete/")
        @InterfaceC1485505rh
        Object deleteComment(@InterfaceC1501050pAF("cid") String str, InterfaceC1364105Vn<? super BaseResponse> interfaceC1364105Vn);

        @InterfaceC1501240pAY("/tiktok/notice/action/dispatch/")
        @InterfaceC1485505rh
        Object dispatchNoticeAction(@InterfaceC1501050pAF("disable_key") String str, @InterfaceC1501050pAF("disable") Boolean bool, InterfaceC1364105Vn<? super BaseResponse> interfaceC1364105Vn);

        @InterfaceC1501240pAY("/tiktok/bulletin/item/expose/")
        @InterfaceC1485505rh
        Object exposeBulletinItems(@InterfaceC1501050pAF("item_id_list") String str, InterfaceC1364105Vn<? super BulletinExposeResponse> interfaceC1364105Vn);

        @InterfaceC1501240pAY("/passport/collab/delete/confirm/")
        @InterfaceC1485505rh
        Object fetchBulletinClose(@InterfaceC1501050pAF("aid") int i, @InterfaceC1501050pAF("target_account_id") String str, @InterfaceC1501050pAF("delete_now") Boolean bool, @InterfaceC1501370pAl("x-tt-passport-csrf-token") String str2, InterfaceC1364105Vn<? super BulletinCloseResponse> interfaceC1364105Vn);

        @InterfaceC1501240pAY("/tiktok/bulletin/account/create/")
        @InterfaceC1485505rh
        Object fetchBulletinCreateAccount(@InterfaceC1501050pAF("name") String str, @InterfaceC1501050pAF("avatar_url") String str2, @InterfaceC1501050pAF("desc") String str3, @InterfaceC1501050pAF("show_channel_on_profile") Boolean bool, @InterfaceC1501050pAF("is_reply_enable") Boolean bool2, @InterfaceC1501050pAF("extra_params") String str4, InterfaceC1364105Vn<? super BulletinAccountEditResponse> interfaceC1364105Vn);

        @InterfaceC1501240pAY("/tiktok/bulletin/item/create/")
        @InterfaceC1485505rh
        Object fetchBulletinCreateItem(@InterfaceC1501050pAF("item_type") int i, @InterfaceC1501050pAF("channel_id") String str, @InterfaceC1501050pAF("text") String str2, @InterfaceC1501050pAF("images") String str3, @InterfaceC1501050pAF("links") String str4, @InterfaceC1501050pAF("video_item_id") Long l, @InterfaceC1501050pAF("poll") String str5, @InterfaceC1501050pAF("extra") String str6, @InterfaceC1501050pAF("source") int i2, @InterfaceC1501050pAF("voices") String str7, InterfaceC1364105Vn<? super BulletinCreateItemResponse> interfaceC1364105Vn);

        @InterfaceC1501240pAY("/tiktok/bulletin/multi_item/create/")
        @InterfaceC1485505rh
        Object fetchBulletinCreateMultiItem(@InterfaceC1501050pAF("item_create_requests_list") String str, @InterfaceC1501050pAF("need_quick_fail") boolean z, InterfaceC1364105Vn<? super BulletinCreateMultiItemResponse> interfaceC1364105Vn);

        @InterfaceC1501240pAY("/tiktok/bulletin/account/edit/")
        @InterfaceC1485505rh
        Object fetchBulletinEditAccount(@InterfaceC1501050pAF(FollowStatusChangeMethod.PARAM_UID) long j, @InterfaceC1501050pAF("name") String str, @InterfaceC1501050pAF("avatar_url") String str2, @InterfaceC1501050pAF("avatar_uri") String str3, @InterfaceC1501050pAF("desc") String str4, @InterfaceC1501050pAF("is_reply_enable") Boolean bool, @InterfaceC1501050pAF(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS) Integer num, @InterfaceC1501050pAF("conversation_short_id") String str5, @InterfaceC1501050pAF("server_message_id") String str6, @InterfaceC1501050pAF("biz_resource_entry_toggle") String str7, @InterfaceC1501050pAF("extra_params") String str8, InterfaceC1364105Vn<? super BulletinAccountEditResponse> interfaceC1364105Vn);

        @InterfaceC1501240pAY("/tiktok/bulletin/item/withdraw/")
        @InterfaceC1485505rh
        Object fetchBulletinWithDrawItem(@InterfaceC1501050pAF("item_id") long j, @InterfaceC1501050pAF("channel_id") long j2, InterfaceC1364105Vn<? super BulletinCreateItemResponse> interfaceC1364105Vn);

        @InterfaceC1501240pAY("/tiktok/v1/im/bulletin/clear/unread_count/")
        @InterfaceC1485505rh
        Object fetchClearUnreadCount(@InterfaceC1501050pAF("bulletin_board_id") long j, InterfaceC1364105Vn<? super BaseResponse> interfaceC1364105Vn);

        @InterfaceC1501200pAU("/aweme/janus/v1/notice/multi/")
        C11NZ<NoticeCombineResponse> fetchCombineNotice(@InterfaceC1501120pAM("live_entrance") int i, @InterfaceC1501120pAM("req_from") String str, @InterfaceC1501120pAM("is_draw") long j, @InterfaceC1501120pAM("content_type") int i2, @InterfaceC1501120pAM("channel_id") int i3, @InterfaceC1501120pAM("count") int i4, @InterfaceC1501130pAN Map<String, String> map, @InterfaceC1501120pAM("scenario") int i5);

        @InterfaceC1501240pAY("/tiktok/bulletin/account/subscribe/")
        @InterfaceC1485505rh
        Object fetchSubscribeBulletin(@InterfaceC1501050pAF("channel_id") long j, @InterfaceC1501050pAF("type") int i, @InterfaceC1501050pAF("conversation_short_id") String str, @InterfaceC1501050pAF("server_message_id") String str2, InterfaceC1364105Vn<? super BulletinSubscribeResponse> interfaceC1364105Vn);

        @InterfaceC1501240pAY("/tiktok/bulletin/poll/cast_vote/")
        @InterfaceC1485505rh
        Object pollVote(@InterfaceC1501050pAF("identity_type") int i, @InterfaceC1501050pAF("channel_id") long j, @InterfaceC1501050pAF("item_id") long j2, @InterfaceC1501050pAF("poll_id") long j3, @InterfaceC1501050pAF("voted_option_id") long j4, @InterfaceC1501050pAF("vote_type") int i2, InterfaceC1364105Vn<? super BaseResponse> interfaceC1364105Vn);

        @InterfaceC1501240pAY("/aweme/v1/comment/publish/")
        @InterfaceC1485505rh
        Object publishComment(@InterfaceC1501050pAF("aweme_id") String str, @InterfaceC1501050pAF("text") String str2, @InterfaceC1501050pAF("reply_id") String str3, @InterfaceC1501050pAF("reply_to_reply_id") String str4, @InterfaceC1501050pAF("skip_rethink") int i, @InterfaceC1501050pAF("action_type") String str5, @InterfaceC1501050pAF("comment_source") int i2, @InterfaceC1501050pAF("publish_scenario") int i3, @InterfaceC1501050pAF("service_id") int i4, @InterfaceC1501050pAF("current_shown_count") int i5, InterfaceC1364105Vn<? super BulletinPublishCommentResponse> interfaceC1364105Vn);

        @InterfaceC1501240pAY("/aweme/v1/commit/follow/request/reject/")
        @InterfaceC1485505rh
        C11NZ<RejectResponse> rejectRequest(@InterfaceC1501050pAF("from_user_id") String str);

        @InterfaceC1501240pAY("/tiktok/bulletin/action/report/")
        @InterfaceC1485505rh
        Object reportBulletinMsgAction(@InterfaceC1501050pAF("channel_id") long j, @InterfaceC1501050pAF("bulletin_item_id") long j2, @InterfaceC1501050pAF("action_type") int i, @InterfaceC1501050pAF("live_event_id") Long l, @InterfaceC1501050pAF("extra") String str, InterfaceC1364105Vn<? super BulletinSimpleResponse> interfaceC1364105Vn);

        @InterfaceC1501240pAY("/tiktok/notice/report/v1/")
        @InterfaceC1485505rh
        C11NZ<BaseResponse> reportNoticeAction(@InterfaceC1501050pAF("nid") long j, @InterfaceC1501050pAF("user_action") int i, @InterfaceC1501050pAF("action_meta") String str, @InterfaceC1501050pAF("report_list") String str2);

        @InterfaceC1501240pAY("/aweme/v1/promote/api/user/settings/")
        @InterfaceC1485505rh
        C11NZ<BaseResponse> setSubscribeMarketingStatus(@InterfaceC1501050pAF("marketing_notification") int i);

        @InterfaceC1501240pAY("/tiktok/notice/subscribe_card/sub/v1")
        @InterfaceC1485505rh
        Object submitSubscribeSelection(@InterfaceC1501050pAF("channel_id") String str, @InterfaceC1501050pAF("category_labels") String str2, @InterfaceC1501050pAF("channel_action") Integer num, InterfaceC1364105Vn<? super SubmitSubscribeResponse> interfaceC1364105Vn);

        @InterfaceC1501240pAY("/tiktok/event/auto_share/update/v1")
        @InterfaceC1485505rh
        Object updateAutoShareLiveEventToBulletin(@InterfaceC1501050pAF("enable") boolean z, InterfaceC1364105Vn<? super BaseResponse> interfaceC1364105Vn);

        @InterfaceC1501240pAY("/aweme/v1/comment/digg/")
        @InterfaceC1485505rh
        Object updateCommentDigg(@InterfaceC1501050pAF("cid") String str, @InterfaceC1501050pAF("digg_type") int i, InterfaceC1364105Vn<? super BaseResponse> interfaceC1364105Vn);

        @InterfaceC1501240pAY("/tiktok/notice/entrance/update/v1/")
        @InterfaceC1485505rh
        Object updateInboxEntrance(@InterfaceC1501050pAF("entrance_id") int i, @InterfaceC1501050pAF("action") int i2, @InterfaceC1501050pAF("sub_entrance_key") long j, InterfaceC1364105Vn<? super BaseResponse> interfaceC1364105Vn);

        @InterfaceC1501240pAY("/tiktok/notice/subscribe_combine_setting/update/v1")
        @InterfaceC1485505rh
        Object updateSubscribe(@InterfaceC1501050pAF("group") int i, @InterfaceC1501050pAF("label") Integer num, @InterfaceC1501050pAF("action") Integer num2, InterfaceC1364105Vn<? super BaseResponse> interfaceC1364105Vn);

        @InterfaceC1501240pAY("/tiktok/notice/subscribe_combine_setting/update/v1")
        @InterfaceC1485505rh
        C11NZ<BaseResponse> updateSubscribeInfo(@InterfaceC1501050pAF("group") int i, @InterfaceC1501050pAF("label") int i2, @InterfaceC1501050pAF("action") Integer num);

        @InterfaceC1501240pAY("/tiktok/notice/unsubscribe_setting/update/v1/")
        @InterfaceC1485505rh
        C11NZ<BaseResponse> updateSubscribeSettingsgStatus(@InterfaceC1501050pAF("group") int i, @InterfaceC1501050pAF("label") int i2, @InterfaceC1501050pAF("is_unsubscribe") boolean z);
    }

    public static Api LIZ() {
        return (Api) LIZ.getValue();
    }
}
