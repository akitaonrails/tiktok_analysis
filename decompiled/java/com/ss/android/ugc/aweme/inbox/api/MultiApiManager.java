package com.ss.android.ugc.aweme.inbox.api;

import X.C01GW;
import X.C11NZ;
import X.C452501pT;
import X.InterfaceC1485705rj;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501120pAM;
import X.InterfaceC1501130pAN;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501200pAU;
import X.InterfaceC1501300pAe;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.SkylightDataResponse;
import com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.SkylightFriendPostResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.FollowPageResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.InboxEntranceResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeCombineResponse;
import java.util.Map;
import kotlin.jvm.internal.AFwS195S0000000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class MultiApiManager {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(131));

    /* JADX INFO: loaded from: classes29.dex */
    public interface API {
        @InterfaceC1501200pAU("/tiktok/notice/follow_page/v1/")
        C11NZ<FollowPageResponse> LIZ(@InterfaceC1501120pAM("need_follow_request") boolean z, @InterfaceC1501120pAM("is_mark_read") int i, @InterfaceC1501120pAM("count") int i2, @InterfaceC1501120pAM("notice_max_time") long j, @InterfaceC1501120pAM("notice_min_time") long j2, @InterfaceC1501120pAM("follow_req_offset") long j3, @InterfaceC1501120pAM("scenario") int i3, @InterfaceC1501120pAM("experiment_params") String str, @InterfaceC1501120pAM("first_read_time_in_session") long j4, @InterfaceC1501120pAM("cursor") String str2);

        @InterfaceC1501200pAU("/tiktok/notice/entrance/list/v1/")
        C11NZ<InboxEntranceResponse> LIZIZ(@InterfaceC1501120pAM("experiment_params") String str, @InterfaceC1501120pAM("additional_group_list") String str2, @InterfaceC1501120pAM("scenario") int i, @InterfaceC1501120pAM("need_mark_read") Boolean bool, @InterfaceC1501120pAM("need_latest_notice_time") Boolean bool2, @InterfaceC1501120pAM("need_latest_unread_notice_time") Boolean bool3, @InterfaceC1501120pAM("business_params") String str3);

        @InterfaceC1501200pAU("/tiktok/notice/skylight/v1/")
        C11NZ<SkylightDataResponse> LIZJ(@InterfaceC1501120pAM("group") String str, @InterfaceC1501120pAM("experiment_params") String str2, @InterfaceC1501120pAM("biz_params") String str3, @InterfaceC1501120pAM("fold_status") Integer num);

        @InterfaceC1501200pAU
        C11NZ<NoticeCombineResponse> fetchCombineNotice(@InterfaceC1485705rj String str, @InterfaceC1501120pAM("live_entrance") int i, @InterfaceC1501120pAM("req_from") String str2, @InterfaceC1501120pAM("is_draw") long j, @InterfaceC1501120pAM("content_type") int i2, @InterfaceC1501120pAM("channel_id") int i3, @InterfaceC1501120pAM("count") int i4, @InterfaceC1501130pAN Map<String, String> map, @InterfaceC1501120pAM("scenario") int i5, @InterfaceC1501120pAM("has_shown_following_popup") boolean z, @InterfaceC1501120pAM("clean_count_type") int i6, @InterfaceC1501120pAM("Ecommercemsgexpversion") Integer num, @InterfaceC1501120pAM("disable_live") String str3);

        @InterfaceC1501170pAR("/tiktok/v1/friend/post_list")
        C11NZ<SkylightFriendPostResponse> fetchSkylightFriendPost(@InterfaceC1501120pAM("cursor") Long l, @InterfaceC1501120pAM("count") Integer num, @InterfaceC1501120pAM("client_read_gids_all") String str, @InterfaceC1501120pAM("friend_status_list") String str2);

        @InterfaceC1501300pAe
        @InterfaceC1501170pAR("/tiktok/notice/entrance/update/v1/")
        C11NZ<BaseResponse> updateInboxEntrance(@InterfaceC1501050pAF("entrance_id") int i, @InterfaceC1501050pAF("action") int i2, @InterfaceC1501050pAF("group") int i3, @InterfaceC1501050pAF("list_type") int i4, @InterfaceC1501050pAF("sub_entrance_key") String str);
    }

    public static API LIZ() {
        return (API) LIZ.getValue();
    }
}
