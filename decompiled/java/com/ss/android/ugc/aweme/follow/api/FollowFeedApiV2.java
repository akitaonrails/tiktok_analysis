package com.ss.android.ugc.aweme.follow.api;

import X.C040I;
import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501120pAM;
import X.InterfaceC1501200pAU;
import X.InterfaceC1501240pAY;
import X.InterfaceC2177008fw;
import com.bytedance.scene.Scene;
import com.google.common.util.concurrent.ListenableFuture;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.ss.android.ugc.aweme.follow.presenter.FollowFeedList;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public interface FollowFeedApiV2 {
    @InterfaceC1501240pAY("/aweme/v2/follow/feed/frequent/view/user")
    Object LIZ(@InterfaceC1501120pAM("source") String str, InterfaceC1364105Vn<? super FollowingFrequentUserResponse> interfaceC1364105Vn);

    @InterfaceC1501240pAY("/aweme/v2/follow/feed/check_items")
    Object LIZIZ(@C040I FollowingFeedCheckItems followingFeedCheckItems, InterfaceC1364105Vn<? super FollowingFeedCheckStatusResponse> interfaceC1364105Vn);

    @InterfaceC1501240pAY("/aweme/v2/follow/feed/red_dot")
    Object LIZJ(@C040I FollowFeedRedDotBody followFeedRedDotBody, InterfaceC1364105Vn<? super FollowFeedRedDotResponse> interfaceC1364105Vn);

    @InterfaceC1501200pAU("/aweme/v2/follow/feed/")
    ListenableFuture<FollowFeedList> followFeedGet(@InterfaceC1501120pAM("follow_req_index") int i, @InterfaceC1501120pAM("cursor") long j, @InterfaceC1501120pAM("level") int i2, @InterfaceC1501120pAM("count") int i3, @InterfaceC1501120pAM("pull_type") int i4, @InterfaceC1501120pAM("feed_style") int i5, @InterfaceC1501120pAM("enter_time") long j2, @InterfaceC1501120pAM("aweme_id") String str, @InterfaceC1501120pAM("aweme_ids") String str2, @InterfaceC1501120pAM("push_params") String str3, @InterfaceC1501120pAM("last_follow_uid") String str4, @InterfaceC1501120pAM("address_book_access") int i6, @InterfaceC1501120pAM("filter_strategy") int i7, @InterfaceC1501120pAM("notice_count_log_id") String str5, @InterfaceC1501120pAM("notice_item_count") Integer num, @InterfaceC1501120pAM("notice_live_count") Integer num2, @InterfaceC1501120pAM("notice_count_type") Integer num3, @InterfaceC1501120pAM("notice_link_author_id") Long l, @InterfaceC1501120pAM("notice_link_item_id") Long l2, @InterfaceC1501120pAM("notice_is_display_live") Integer num4, @InterfaceC1501120pAM("user_avatar_shrink") String str6, @InterfaceC1501120pAM("ad_user_agent") String str7, @InterfaceC1501120pAM("ad_personality_mode") Integer num5, @InterfaceC1501120pAM("cmpl_enc") String str8, @InterfaceC1501120pAM("gaid") String str9, @InterfaceC1501120pAM("last_show_lives") String str10, @InterfaceC1501120pAM("last_play_lives") String str11, @InterfaceC1501120pAM("session_info") String str12, @InterfaceC1501120pAM("is_non_personalized") int i8, @InterfaceC1501120pAM("card_insert") String str13, @InterfaceC1501120pAM("preload") Integer num6, @InterfaceC1501120pAM("screen_reader_enable") Boolean bool, @InterfaceC1501120pAM("red_dot_state") Integer num7, @InterfaceC2177008fw Object obj, @InterfaceC1501120pAM("client_cached_items") String str14);

    @InterfaceC1501240pAY("/aweme/v2/follow/feed/")
    ListenableFuture<FollowFeedList> followFeedPost(@InterfaceC1501120pAM("follow_req_index") int i, @InterfaceC1501120pAM("cursor") long j, @InterfaceC1501120pAM("level") int i2, @InterfaceC1501120pAM("count") int i3, @InterfaceC1501120pAM("pull_type") int i4, @InterfaceC1501120pAM("feed_style") int i5, @InterfaceC1501120pAM("enter_time") long j2, @InterfaceC1501120pAM("aweme_id") String str, @InterfaceC1501120pAM("aweme_ids") String str2, @InterfaceC1501120pAM("push_params") String str3, @InterfaceC1501120pAM("last_follow_uid") String str4, @InterfaceC1501120pAM("address_book_access") int i6, @InterfaceC1501120pAM("filter_strategy") int i7, @InterfaceC1501120pAM("notice_count_log_id") String str5, @InterfaceC1501120pAM("notice_item_count") Integer num, @InterfaceC1501120pAM("notice_live_count") Integer num2, @InterfaceC1501120pAM("notice_count_type") Integer num3, @InterfaceC1501120pAM("notice_link_author_id") Long l, @InterfaceC1501120pAM("notice_link_item_id") Long l2, @InterfaceC1501120pAM("notice_is_display_live") Integer num4, @InterfaceC1501120pAM("user_avatar_shrink") String str6, @InterfaceC1501120pAM("ad_user_agent") String str7, @InterfaceC1501120pAM("ad_personality_mode") Integer num5, @InterfaceC1501120pAM("cmpl_enc") String str8, @InterfaceC1501120pAM("gaid") String str9, @InterfaceC1501120pAM("last_show_lives") String str10, @InterfaceC1501120pAM("last_play_lives") String str11, @InterfaceC1501120pAM("session_info") String str12, @InterfaceC1501120pAM("is_non_personalized") int i8, @InterfaceC1501120pAM("card_insert") String str13, @InterfaceC1501120pAM("preload") Integer num6, @InterfaceC1501120pAM("screen_reader_enable") Boolean bool, @InterfaceC1501120pAM("red_dot_state") Integer num7, @InterfaceC2177008fw Object obj, @InterfaceC1501120pAM("client_cached_items") String str14, @C040I FollowFeedPostBody followFeedPostBody, @InterfaceC1501120pAM("drm_security_level") String str15);

    /* JADX INFO: loaded from: classes25.dex */
    public static final class FollowingFeedCheckModel {

        @C09CT("author_id")
        public final String authorId;

        @C09CT("is_preload")
        public boolean isPreload;

        @C09CT("item_id")
        public final String itemId;

        @C09CT("item_info")
        public String itemInfo;

        @C09CT("score")
        public Double score;

        public final boolean isPreload() {
            return this.isPreload;
        }

        public final void setItemInfo(String str) {
            this.itemInfo = str;
        }

        public final void setPreload(boolean z) {
            this.isPreload = z;
        }

        public final void setScore(Double d) {
            this.score = d;
        }

        public FollowingFeedCheckModel(String str, String str2) {
            this.itemId = str;
            this.authorId = str2;
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class FollowingFeedCheckStatusResponse extends BaseResponse {

        @C09CT("validated_items")
        public final List<FollowingFeedCheckModel> items;

        public final FollowingFeedCheckStatusResponse copy(List<FollowingFeedCheckModel> list) {
            return new FollowingFeedCheckStatusResponse(list);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FollowingFeedCheckStatusResponse) && Intrinsics.LJFF(this.items, ((FollowingFeedCheckStatusResponse) obj).items);
        }

        public int hashCode() {
            List<FollowingFeedCheckModel> list = this.items;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("FollowingFeedCheckStatusResponse(items=");
            sbLIZ.append(this.items);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public final List<FollowingFeedCheckModel> getItems() {
            return this.items;
        }

        public FollowingFeedCheckStatusResponse(List<FollowingFeedCheckModel> list) {
            this.items = list;
        }
    }

    public static final class FollowingFeedCheckItems {

        @C09CT("is_cold_launch")
        public final boolean isColdLaunch;

        @C09CT("items")
        public final List<FollowingFeedCheckModel> items;

        @C09CT("recent_read_item_ids")
        public final String recentReadItemIds;

        public final boolean isColdLaunch() {
            return this.isColdLaunch;
        }

        public FollowingFeedCheckItems(List<FollowingFeedCheckModel> list, boolean z, String str) {
            this.items = list;
            this.isColdLaunch = z;
            this.recentReadItemIds = str;
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class FollowFeedRedDotResponse extends BaseResponse {

        @C09CT("red_dot_status")
        public final Integer redDotStatus;

        public FollowFeedRedDotResponse() {
            this(0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FollowFeedRedDotResponse) && Intrinsics.LJFF(this.redDotStatus, ((FollowFeedRedDotResponse) obj).redDotStatus);
        }

        public final int hashCode() {
            Integer num = this.redDotStatus;
            if (num == null) {
                return 0;
            }
            return num.hashCode();
        }

        @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("FollowFeedRedDotResponse(redDotStatus=");
            sbLIZ.append(this.redDotStatus);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public FollowFeedRedDotResponse(Integer num) {
            this.redDotStatus = num;
        }
    }

    /* JADX INFO: loaded from: classes14.dex */
    public static final class FollowingFrequentUser {

        @C09CT("frequent_interact")
        public Boolean frequentInteract;

        @C09CT("frequent_watch")
        public Boolean frequentWatch;

        @C09CT("uid")
        public String uid;

        @C09CT("frequent_view_user")
        public User user;

        public FollowingFrequentUser() {
            this("", null, null, null);
        }

        public final void setFrequentInteract(Boolean bool) {
            this.frequentInteract = bool;
        }

        public final void setFrequentWatch(Boolean bool) {
            this.frequentWatch = bool;
        }

        public final void setUid(String str) {
            this.uid = str;
        }

        public final void setUser(User user) {
            this.user = user;
        }

        public FollowingFrequentUser(String str, User user, Boolean bool, Boolean bool2) {
            this.uid = str;
            this.user = user;
            this.frequentWatch = bool;
            this.frequentInteract = bool2;
        }
    }

    /* JADX INFO: loaded from: classes25.dex */
    public static final class FollowingFeedCheckModelItemInfo {

        @C09CT("statistics")
        public final AwemeStatistics statistics;

        @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
        public final AwemeStatus status;

        public FollowingFeedCheckModelItemInfo(AwemeStatistics awemeStatistics, AwemeStatus awemeStatus) {
            this.statistics = awemeStatistics;
            this.status = awemeStatus;
        }
    }

    public static final class FollowingFrequentUserResponse {

        @C09CT("frequent_view_users")
        public final List<FollowingFrequentUser> frequentViewUsers;

        @C09CT("hvr_users")
        public final List<FollowingFrequentUser> hvrUsers;

        public FollowingFrequentUserResponse() {
            this(null, null, 3, null);
        }

        public FollowingFrequentUserResponse(List<FollowingFrequentUser> list, List<FollowingFrequentUser> list2) {
            this.frequentViewUsers = list;
            this.hvrUsers = list2;
        }

        public FollowingFrequentUserResponse(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? C13BV.INSTANCE : list2);
        }
    }

    public static final class FollowFeedRedDotBody {

        @C09CT("author_uid")
        public final String authorUid;

        @C09CT("client_read_item_ids")
        public final String readAids;

        @C09CT(Scene.SCENE_SERVICE)
        public final Integer scene;

        public FollowFeedRedDotBody(String str, Integer num, String str2) {
            this.authorUid = str;
            this.scene = num;
            this.readAids = str2;
        }
    }

    public static final class FollowFeedPostBody {

        @C09CT("hvr_user_list")
        public final String hvrUserList;

        @C09CT("original_item_ids_for_indexing")
        public final String originalItemIdsForIndexing;

        @C09CT("recent_read_item_ids")
        public final String recentReadItemIds;

        @C09CT("recent_unread_item_ids")
        public final String recentUnreadItemIds;

        public FollowFeedPostBody() {
            this(null, null, null, null);
        }

        public FollowFeedPostBody(String str, String str2, String str3, String str4) {
            this.recentReadItemIds = str;
            this.recentUnreadItemIds = str2;
            this.originalItemIdsForIndexing = str3;
            this.hvrUserList = str4;
        }
    }
}
