package com.ss.android.ugc.aweme.commentv2.commentlist;

import X.C080U;
import X.C11NZ;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485505rh;
import X.InterfaceC1501100pAK;
import X.InterfaceC1501120pAM;
import X.InterfaceC1501200pAU;
import X.InterfaceC1501240pAY;
import X.InterfaceC2174808fa;
import X.InterfaceC2177008fw;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.comment.audio.model.CommentASRResponse;
import com.ss.android.ugc.aweme.comment.easteregg.model.PhotoToStickerResponse;
import com.ss.android.ugc.aweme.comment.easteregg.model.SurpriseResourceResponse;
import com.ss.android.ugc.aweme.comment.model.BaseCommentResponse;
import com.ss.android.ugc.aweme.comment.model.CommentItemList;
import com.ss.android.ugc.aweme.comment.model.CommentResponse;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public interface ICommentApiV2 {
    @InterfaceC1501240pAY("/tiktok/v1/gift/send/")
    @InterfaceC1485505rh
    Object LIZ(@InterfaceC1501100pAK("gift_id") String str, @InterfaceC1501100pAK("aweme_id") String str2, @InterfaceC1501100pAK("comment_publish_request") String str3, @InterfaceC1501100pAK("is_from_gift_bag") boolean z, InterfaceC1364105Vn<? super CommentResponse> interfaceC1364105Vn);

    @InterfaceC1501200pAU("/aweme/v2/comment/audio/asr")
    Object LJIIL(@InterfaceC1501120pAM("cid") long j, InterfaceC1364105Vn<? super CommentASRResponse> interfaceC1364105Vn);

    @InterfaceC1501240pAY("/tiktok/v1/gift/send/")
    @InterfaceC1485505rh
    Object LJIIZILJ(@InterfaceC1501100pAK("gift_id") String str, @InterfaceC1501100pAK("aweme_id") String str2, @InterfaceC1501100pAK("is_from_gift_bag") boolean z, InterfaceC1364105Vn<? super CommentResponse> interfaceC1364105Vn);

    @InterfaceC1501240pAY("tiktok/v1/comment/preload/resource")
    @InterfaceC1485505rh
    Object LJIJ(@InterfaceC1501100pAK("surprise_resource_reqs") String str, InterfaceC1364105Vn<? super SurpriseResourceResponse> interfaceC1364105Vn);

    @InterfaceC1501240pAY("/aweme/v1/comment/delete/")
    @InterfaceC1485505rh
    Object LJIJI(@InterfaceC1501100pAK("cid") String str, @InterfaceC1501100pAK("channel_id") int i, @InterfaceC1501100pAK("scenario") int i2, InterfaceC1364105Vn<? super BaseCommentResponse> interfaceC1364105Vn);

    @InterfaceC1501240pAY("/tiktok/v2/im/sticker/comment/save/")
    @InterfaceC1485505rh
    Object LJIJJ(@InterfaceC1501100pAK("comment_id") long j, InterfaceC1364105Vn<? super PhotoToStickerResponse> interfaceC1364105Vn);

    @InterfaceC1501200pAU("/aweme/v1/comment/list/reply/")
    Object LJIJJLI(@InterfaceC1501120pAM("comment_id") String str, @InterfaceC1501120pAM("cursor") long j, @InterfaceC1501120pAM("count") int i, @InterfaceC1501120pAM("top_ids") String str2, @InterfaceC1501120pAM("item_id") String str3, @InterfaceC1501120pAM("insert_ids") String str4, @InterfaceC1501120pAM("channel_id") int i2, @InterfaceC1501120pAM("user_avatar_shrink") String str5, @InterfaceC1501120pAM("need_translation") boolean z, @InterfaceC1501120pAM("trg_lang") String str6, @InterfaceC1501120pAM("author_relation_type") int i3, @InterfaceC1501120pAM("enter_from") String str7, @InterfaceC1501120pAM("comment_entity_words") String str8, @InterfaceC1501120pAM("is_non_personalized") boolean z2, @InterfaceC1501120pAM("preload") Integer num, @InterfaceC1501120pAM("net_level") Integer num2, @InterfaceC1501120pAM("perf_score") Float f, @InterfaceC1501120pAM("shown_cnt") Long l, @InterfaceC1501120pAM("session_id") String str9, @InterfaceC1501120pAM("session_show_cids") String str10, @InterfaceC1501120pAM("source") Integer num3, @InterfaceC1501120pAM("author_id") String str11, InterfaceC1364105Vn<? super CommentItemList> interfaceC1364105Vn);

    @InterfaceC1501240pAY("/aweme/v1/comment/photo/event/")
    @InterfaceC1485505rh
    Object LJIL(@InterfaceC1501100pAK("comment_id") String str, @InterfaceC1501100pAK("user_id") String str2, @InterfaceC1501100pAK("item_id") String str3, @InterfaceC1501100pAK("status_code") int i, @InterfaceC1501100pAK("error_code") int i2, @InterfaceC1501100pAK("urls") String str4, @InterfaceC1501100pAK(Scene.SCENE_SERVICE) int i3, InterfaceC1364105Vn<? super BaseResponse> interfaceC1364105Vn);

    @InterfaceC1501240pAY("/aweme/v1/comment/publish/")
    @InterfaceC1485505rh
    Object LJJ(@InterfaceC1501100pAK("aweme_id") String str, @InterfaceC1501100pAK("text") String str2, @InterfaceC1501100pAK("reply_id") String str3, @InterfaceC1501100pAK("text_extra") String str4, @InterfaceC1501100pAK("image_extra") String str5, @InterfaceC1501100pAK("ai_photo_task_id") String str6, @InterfaceC1501100pAK("sticker_info") String str7, @InterfaceC1501100pAK("is_self_see") int i, @InterfaceC1501100pAK("reply_to_reply_id") String str8, @InterfaceC1501100pAK("channel_id") int i2, @InterfaceC1501100pAK("action_type") int i3, @InterfaceC1501100pAK("ad_info") String str9, @InterfaceC1501100pAK("audio_info") String str10, @InterfaceC1501100pAK("publish_scenario") int i4, @InterfaceC1501100pAK("skip_rethink") int i5, @InterfaceC1501100pAK("current_shown_count") String str11, @InterfaceC1501100pAK("ad_creative_id") Long l, @InterfaceC1501100pAK("shark_params") String str12, @InterfaceC1501100pAK("rit") Integer num, @InterfaceC1501100pAK("client_surprise_type") int i6, @InterfaceC1501100pAK("image_mode_stealth") Integer num2, @InterfaceC1501100pAK("replace_suc_xid_type_list") String str13, @InterfaceC1501100pAK("xid_results_str") String str14, @InterfaceC1501100pAK("product_id") String str15, @InterfaceC1501120pAM("enter_from") String str16, @InterfaceC1501100pAK("user_vote_info") String str17, InterfaceC1364105Vn<? super CommentResponse> interfaceC1364105Vn);

    @InterfaceC1501200pAU("/aweme/v2/comment/list/")
    C11NZ<CommentItemList> fetchCommentListV2(@InterfaceC1501120pAM("aweme_id") String str, @InterfaceC1501120pAM("cursor") long j, @InterfaceC1501120pAM("count") int i, @InterfaceC1501120pAM("insert_ids") String str2, @InterfaceC1501120pAM("forward_page_type") int i2, @InterfaceC1501120pAM("ad_creative_id") Long l, @InterfaceC1501120pAM("channel_id") int i3, @InterfaceC1501120pAM("user_avatar_shrink") String str3, @InterfaceC1501120pAM("ad_pricing_type") int i4, @InterfaceC1501120pAM("load_type") int i5, @InterfaceC1501120pAM("offline_pin_comment") int i6, @InterfaceC1501120pAM("author_relation_type") int i7, @InterfaceC2177008fw Object obj, @InterfaceC2174808fa List<C080U> list, @InterfaceC1501120pAM("scenario") int i8, @InterfaceC1501120pAM("enter_from") String str4, @InterfaceC1501120pAM("comment_entity_words") String str5, @InterfaceC1501120pAM("repost_insert_ids") String str6, @InterfaceC1501120pAM("is_non_personalized") boolean z, @InterfaceC1501120pAM("suggest_words") String str7, @InterfaceC1501120pAM("shown_cnt") long j2, @InterfaceC1501120pAM("comment_preload") int i9, @InterfaceC1501120pAM("enable_muf_maf") Integer num, @InterfaceC1501120pAM("author_id") String str8, @InterfaceC1501120pAM("aweme_type") Integer num2, @InterfaceC1501120pAM("query_times") Integer num3, @InterfaceC1501120pAM("query_times_since_last_ad") Integer num4, @InterfaceC1501120pAM("preload") Integer num5, @InterfaceC1501120pAM("net_level") Integer num6, @InterfaceC1501120pAM("perf_score") Float f, @InterfaceC1501120pAM("channel_name") String str9, @InterfaceC1501120pAM("zero_count_expire_time") Long l2, @InterfaceC1501120pAM("source") Integer num7, @InterfaceC1501120pAM("session_id") String str10, @InterfaceC1501120pAM("session_show_cids") String str11, @InterfaceC1501120pAM("surprise_type") Integer num8, @InterfaceC1501120pAM("last_viewed_photo_cid") String str12, @InterfaceC1501120pAM("comment_top_word") String str13, @InterfaceC1501120pAM("comment_top_word_id") String str14, @InterfaceC1501120pAM("poll_id") Long l3, @InterfaceC1501120pAM("comment_profiles") String str15);

    @InterfaceC1501200pAU("/aweme/v2/comment/list/")
    C11NZ<CommentItemList> fetchCommentPhotoListV2(@InterfaceC1501120pAM("aweme_id") String str, @InterfaceC1501120pAM("count") int i, @InterfaceC1501120pAM("author_relation_type") int i2, @InterfaceC1501120pAM("scenario") int i3, @InterfaceC1501120pAM("is_non_personalized") boolean z, @InterfaceC1501120pAM("shown_cnt") long j, @InterfaceC1501120pAM("enter_from") String str2, @InterfaceC1501120pAM("channel_name") String str3, @InterfaceC1501120pAM("session_id") String str4, @InterfaceC1501120pAM("viewed_photo_cids") String str5, @InterfaceC1501120pAM("author_id") String str6, @InterfaceC1501120pAM("comment_profiles") String str7, @InterfaceC2177008fw Object obj);

    @InterfaceC1501200pAU("/aweme/v1/comment/list/reply/")
    C11NZ<CommentItemList> fetchSecondaryPhotoComment(@InterfaceC1501120pAM("comment_id") String str, @InterfaceC1501120pAM("item_id") String str2, @InterfaceC1501120pAM("count") int i, @InterfaceC1501120pAM("author_relation_type") int i2, @InterfaceC1501120pAM("enter_from") String str3, @InterfaceC1501120pAM("is_non_personalized") boolean z, @InterfaceC1501120pAM("session_id") String str4, @InterfaceC1501120pAM("channel_name") String str5, @InterfaceC1501120pAM("viewed_photo_cids") String str6, @InterfaceC1501120pAM("author_id") String str7, @InterfaceC2177008fw Object obj);
}
