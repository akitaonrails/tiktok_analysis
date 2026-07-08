package com.ss.android.ugc.aweme.upvote.api;

import X.AbstractC19484711Kz;
import X.C080U;
import X.C11NZ;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import X.InterfaceC2174808fa;
import X.InterfaceC2177008fw;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.upvote.detail.replypanel.pojo.RepostReplyListResponse;
import com.ss.android.ugc.aweme.upvote.detail.replypanel.pojo.RepostReplyPublishResponse;
import com.ss.android.ugc.aweme.upvote.model.RepostListResponse;
import com.ss.android.ugc.aweme.upvote.model.UpvoteBatchListResponse;
import com.ss.android.ugc.aweme.upvote.model.UpvoteBatchPublishResponse;
import com.ss.android.ugc.aweme.upvote.model.UpvoteDeleteResponse;
import com.ss.android.ugc.aweme.upvote.model.UpvotePublishResponse;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public interface IUpvoteApi {
    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/tiktok/v1/upvote/delete_comment")
    Object deleteReply(@InterfaceC1501050pAF("comment_id") String str, @InterfaceC1501050pAF("repost_id") String str2, @InterfaceC1501050pAF("item_id") String str3, @InterfaceC1501050pAF("repost_user_id") String str4, InterfaceC1364105Vn<? super BaseResponse> interfaceC1364105Vn);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("tiktok/v1/upvote/delete")
    AbstractC19484711Kz<UpvoteDeleteResponse> deleteUpvote(@InterfaceC1501050pAF("item_id") String str, @InterfaceC1501050pAF("carrier_type") Integer num, @InterfaceC1501050pAF("repost_id") String str2);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/tiktok/v1/upvote/comment_digg")
    AbstractC19484711Kz<BaseResponse> diggRepostReply(@InterfaceC1501050pAF("comment_id") String str, @InterfaceC1501050pAF("repost_id") String str2, @InterfaceC1501050pAF("digg_type") int i, @InterfaceC1501050pAF("item_id") String str3, @InterfaceC1501050pAF("item_author_uid") String str4, @InterfaceC1501050pAF("comment_author_uid") String str5);

    @InterfaceC1501160pAQ("/tiktok/v1/upvote/comment_list")
    Object getRepostReplyList(@InterfaceC1501070pAH("repost_id") String str, @InterfaceC1501070pAH("cursor") Long l, @InterfaceC1501070pAH("count") Integer num, @InterfaceC1501070pAH("top_ids") String str2, @InterfaceC1501070pAH("repost_relation_type") Integer num2, @InterfaceC1501070pAH("item_id") String str3, @InterfaceC1501070pAH("repost_user_id") String str4, InterfaceC1364105Vn<? super RepostReplyListResponse> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("tiktok/v1/upvote/item/list")
    C11NZ<RepostListResponse> getRepostVideoList(@InterfaceC1501070pAH("user_id") String str, @InterfaceC1501070pAH("offset") long j, @InterfaceC1501070pAH("count") int i, @InterfaceC1501070pAH(Scene.SCENE_SERVICE) Integer num, @InterfaceC1501070pAH("carrier_type") String str2, @InterfaceC2177008fw Object obj, @InterfaceC2174808fa List<C080U> list);

    @InterfaceC1501160pAQ("tiktok/v1/upvote/item/list")
    C11NZ<RepostListResponse> getRepostVideoListMerged(@InterfaceC1501070pAH("user_id") String str, @InterfaceC1501070pAH("offset") long j, @InterfaceC1501070pAH("count") int i, @InterfaceC1501070pAH(Scene.SCENE_SERVICE) Integer num, @InterfaceC1501070pAH("carrier_type") String str2, @InterfaceC2177008fw Object obj, @InterfaceC2174808fa List<C080U> list, @InterfaceC1501070pAH("upvote_scene") Integer num2, @InterfaceC1501070pAH("is_non_personalized") boolean z, @InterfaceC1501070pAH("experiment_map") String str3);

    @InterfaceC1501160pAQ("tiktok/v1/upvote/batch_list")
    C11NZ<UpvoteBatchListResponse> getUpvoteBatchList(@InterfaceC1501070pAH("item_ids") String str, @InterfaceC1501070pAH("upvote_reasons") String str2, @InterfaceC1501070pAH("upvote_scene") Integer num, @InterfaceC1501070pAH("insert_map") String str3, @InterfaceC1501070pAH("insert_map_uid") String str4, @InterfaceC1501070pAH("is_non_personalized") boolean z, @InterfaceC1501070pAH("cursor_map") String str5, @InterfaceC1501070pAH("experiment_map") String str6, @InterfaceC1501070pAH("friends_recall_info_map") String str7, @InterfaceC1501070pAH("reply_insert_map") String str8, @InterfaceC1501070pAH("carrier_type") String str9, @InterfaceC1501070pAH("carrier_id_map") String str10, @InterfaceC1501070pAH("carrier_insert_map") String str11);

    @InterfaceC1501160pAQ("tiktok/v1/upvote/list")
    C11NZ<Object> getUpvoteList(@InterfaceC1501070pAH("item_id") String str, @InterfaceC1501070pAH("cursor") long j, @InterfaceC1501070pAH("count") int i, @InterfaceC1501070pAH("insert_ids") String str2, @InterfaceC1501070pAH("upvote_reason") String str3, @InterfaceC1501070pAH(Scene.SCENE_SERVICE) Integer num);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/tiktok/v1/upvote/publish_comment")
    Object publishRepostReply(@InterfaceC1501050pAF("repost_id") String str, @InterfaceC1501050pAF("text") String str2, @InterfaceC1501050pAF("reply_id") String str3, @InterfaceC1501050pAF("item_id") String str4, @InterfaceC1501050pAF("repost_user_id") String str5, @InterfaceC1501050pAF("reply_to_user_id") String str6, @InterfaceC1501050pAF("item_author_user_id") String str7, @InterfaceC1501050pAF("text_extra") String str8, InterfaceC1364105Vn<? super RepostReplyPublishResponse> interfaceC1364105Vn);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("tiktok/v1/upvote/publish")
    AbstractC19484711Kz<UpvotePublishResponse> publishUpvote(@InterfaceC1501050pAF("item_id") String str, @InterfaceC1501050pAF("text") String str2, @InterfaceC1501050pAF("skip_rethink") Boolean bool, @InterfaceC1501050pAF("text_extra") String str3, @InterfaceC1501050pAF("image_extra") String str4, @InterfaceC1501050pAF("experiment_map") String str5, @InterfaceC1501050pAF("social_avatar_sticker_id") Long l, @InterfaceC1501050pAF("carrier_type") Integer num, @InterfaceC1501050pAF("carrier_id") String str6, @InterfaceC1501050pAF("repost_id") String str7, @InterfaceC1501050pAF("has_reposted") Boolean bool2);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("tiktok/v1/upvote/batch_publish")
    AbstractC19484711Kz<UpvoteBatchPublishResponse> publishUpvoteBatch(@InterfaceC1501050pAF("item_ids") String str, @InterfaceC1501050pAF("experiment_map") String str2);

    @InterfaceC1501170pAR("/tiktok/v1/upvote/digg")
    AbstractC19484711Kz<BaseResponse> requestRepostLike(@InterfaceC1501070pAH("from_user_id") String str, @InterfaceC1501070pAH("repost_id") String str2, @InterfaceC1501070pAH("aweme_id") String str3, @InterfaceC1501070pAH("repost_user_id") String str4, @InterfaceC1501070pAH("digg_type") int i);
}
