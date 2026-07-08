package com.bytedance.android.livesdk.gift.base.platform.core.manager;

import X.C09SO;
import X.C11NZ;
import X.C470590Icr;
import X.EnumC1846380y9E;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501060pAG;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501150pAP;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.gift.model.CpcPromptResponse;
import com.bytedance.android.livesdk.gift.model.CreateMagicResultResponse;
import com.bytedance.android.livesdk.gift.model.CustomLibraResponse;
import com.bytedance.android.livesdk.gift.model.GiftCampaignProgressResponse;
import com.bytedance.android.livesdk.gift.model.GiftFavouriteSaveResponse;
import com.bytedance.android.livesdk.gift.model.GiftListAckResponse;
import com.bytedance.android.livesdk.gift.model.GiftListByCreatorResponse;
import com.bytedance.android.livesdk.gift.model.GiftListResult;
import com.bytedance.android.livesdk.gift.model.GiftRealTimeUpdateParams;
import com.bytedance.android.livesdk.gift.model.GiftRealTimeUpdateResponse;
import com.bytedance.android.livesdk.gift.model.GiftReceiveRecordsResponse;
import com.bytedance.android.livesdk.gift.model.GiftSendResponse;
import com.bytedance.android.livesdk.gift.model.SendGiftResult;
import com.bytedance.android.livesdk.guide.model.GuideReportResponse;
import com.bytedance.android.livesdk.service.model.GiftListExtra;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public interface GiftRetrofitApi {
    @InterfaceC1501160pAQ("/webcast/gift/receive_record/")
    @C09SO(EnumC1846380y9E.GIFT)
    C11NZ<C470590Icr<GiftReceiveRecordsResponse.Data>> fetchGiftRecords(@InterfaceC1501070pAH("to_user_id") long j, @InterfaceC1501070pAH("room_id") String str, @InterfaceC1501070pAH("ref_timestamp") Long l, @InterfaceC1501070pAH("offset") Long l2, @InterfaceC1501070pAH("limit") long j2);

    @InterfaceC1501160pAQ("/webcast/gift/cpc_prompt/")
    C11NZ<C470590Icr<CpcPromptResponse>> getCPCInfo();

    @InterfaceC1501160pAQ("/webcast/gift/campaign/progress/")
    Object getGiftCampaignProgress(@InterfaceC1501070pAH("room_id") long j, @InterfaceC1501070pAH("anchor_id") long j2, @InterfaceC1501070pAH("gift_ids") List<Long> list, @InterfaceC1501070pAH("force_refresh") boolean z, InterfaceC1364105Vn<? super C470590Icr<GiftCampaignProgressResponse.Data>> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/webcast/gift/x/custom_libra/")
    C11NZ<C470590Icr<CustomLibraResponse.Data>> getGiftCustomSetting(@InterfaceC1501070pAH("consume_layer") int i);

    @InterfaceC1501300pAe
    @C09SO(EnumC1846380y9E.GIFT)
    @InterfaceC1501170pAR("/webcast/gift/magic/result_create/")
    C11NZ<BaseResponse<CreateMagicResultResponse.Data, CreateMagicResultResponse.Extra>> magicGiftCreate(@InterfaceC1501070pAH("room_id") long j, @InterfaceC1501050pAF("magic_gift_id") long j2, @InterfaceC1501050pAF("idempotency_key") String str, @InterfaceC1501050pAF("ug_exchange") int i, @InterfaceC1501050pAF("sec_specific_magic_result_id") String str2, @InterfaceC1501050pAF("request_extra") String str3);

    @InterfaceC1501300pAe
    @C09SO(EnumC1846380y9E.GIFT)
    @InterfaceC1501170pAR("/webcast/guide/report/")
    C11NZ<C470590Icr<GuideReportResponse.Data>> reportGiftGuide(@InterfaceC1501050pAF("room_id") long j, @InterfaceC1501050pAF("guide_type") String str, @InterfaceC1501050pAF("report_type") int i, @InterfaceC1501050pAF("target_id") String str2, @InterfaceC1501050pAF("gift_id") String str3, @InterfaceC1501050pAF("period_id") String str4);

    @InterfaceC1501300pAe
    @C09SO(EnumC1846380y9E.GIFT)
    @InterfaceC1501170pAR("webcast/gift/favourite/save")
    C11NZ<C470590Icr<GiftFavouriteSaveResponse.Data>> saveFavoriteGift(@InterfaceC1501050pAF("user_id") long j, @InterfaceC1501050pAF("favourite_gift_ids") String str, @InterfaceC1501050pAF("page_type") int i);

    @InterfaceC1501300pAe
    @C09SO(EnumC1846380y9E.GIFT)
    @InterfaceC1501170pAR("/webcast/gift/list/ack/")
    C11NZ<C470590Icr<GiftListAckResponse>> sendGiftListAck(@InterfaceC1501050pAF("room_id") long j, @InterfaceC1501050pAF("sec_anchor_id") String str, @InterfaceC1501050pAF("gifts_ack_info_list") String str2, @InterfaceC1501050pAF("request_panel_id") String str3, @InterfaceC1501050pAF("client_trigger_feature") String str4, @InterfaceC1501050pAF("ack_req_for_strategy") String str5);

    @InterfaceC1501300pAe
    @C09SO(EnumC1846380y9E.GIFT)
    @InterfaceC1501170pAR("/webcast/gift/send/")
    C11NZ<BaseResponse<SendGiftResult, GiftSendResponse.GiftExtra>> sendGiftWithParams(@InterfaceC1501050pAF("gift_id") long j, @InterfaceC1501070pAH("room_id") long j2, @InterfaceC1501050pAF("to_user_id") long j3, @InterfaceC1501050pAF("to_member_id") Long l, @InterfaceC1501050pAF("count") int i, @InterfaceC1501050pAF("send_type") int i2, @InterfaceC1501050pAF("sec_to_user_id") String str, @InterfaceC1501050pAF("to_room_id") long j4, @InterfaceC1501050pAF("send_scene") int i3, @InterfaceC1501050pAF("enter_from") String str2, @InterfaceC1501050pAF("ug_exchange") int i4, @InterfaceC1501050pAF("send_gift_req_start_ms") long j5, @InterfaceC1501050pAF("color_id") long j6, @InterfaceC1501050pAF("color_reasons") String str3, @InterfaceC1501150pAP HashMap<String, String> map, @InterfaceC1501050pAF("poll_id") long j7, @InterfaceC1501050pAF("send_gift_start_client_local_ms") long j8, @InterfaceC1501050pAF("grade_mode") int i5, @InterfaceC1501050pAF("current_score") long j9, @InterfaceC1501050pAF("gift_enter_from") String str4, @InterfaceC1501050pAF("gift_extra") String str5, @InterfaceC1501050pAF("to_user_type") String str6, @InterfaceC1501050pAF("user_system_time") long j10, @InterfaceC1501050pAF("disable_gift_tracking") int i6, @InterfaceC1501050pAF("send_gift_request_id") String str7, @InterfaceC1501050pAF("retry_count") int i7, @InterfaceC1501050pAF("gift_gallery_click_sponsor") boolean z, @InterfaceC1501050pAF("gift_gallery_combo_sponsor") boolean z2, @InterfaceC1501050pAF("source") int i8, @InterfaceC1501050pAF("sub_source") int i9, @InterfaceC1501050pAF("should_return_assets") boolean z3, @InterfaceC1501050pAF("assets_order_list") String str8, @InterfaceC1501050pAF("gift_skin_id") long j11, @InterfaceC1501050pAF("gift_text_id") long j12, @InterfaceC1501050pAF("layout_setting") long j13, @InterfaceC1501050pAF("window_setting") long j14, @InterfaceC1501050pAF("from_user_type") long j15, @InterfaceC1501050pAF("to_link_id") String str9, @InterfaceC1501050pAF("mg_play_mode_and_tool") String str10, @InterfaceC1501150pAP(encode = true) Map<String, Object> map2, @InterfaceC1501050pAF("gallery_sponsor_count") Long l2, @InterfaceC1501050pAF("gallery_current_count") Long l3, @InterfaceC1501050pAF("gallery_left_count_to_sponsor") Long l4, @InterfaceC1501050pAF("gallery_can_sponsor") Boolean bool, @InterfaceC1501050pAF("in_gallery_combo") Boolean bool2, @InterfaceC1501050pAF("backpack_send_scene") Integer num, @InterfaceC1501050pAF("pre_reward_op") Integer num2, @InterfaceC1501050pAF("is_batch_gift") boolean z4, @InterfaceC1501050pAF("reward_task") Integer num3, @InterfaceC1501050pAF("ug_task_event_tracking") String str11, @InterfaceC1501050pAF("ug_points") long j16, @InterfaceC1501050pAF("is_incentive_task_pre_reward") Boolean bool3, @InterfaceC1501050pAF("linkmic_layout_id") String str12, @InterfaceC1501050pAF("linker_user_count") Integer num4, @InterfaceC1501050pAF("gift_resource_id") long j17, @InterfaceC1501050pAF("request_id") String str13, @InterfaceC1501050pAF("action_type") String str14, @InterfaceC1501050pAF("gift_magic_result_id") Long l5, @InterfaceC1501050pAF("gifts_in_outfit_set") String str15, @InterfaceC1501050pAF("gift_variant_id") Integer num5, @InterfaceC1501050pAF("guardian_gift_click_sponsor") Boolean bool4);

    @InterfaceC1501160pAQ("/webcast/gift/list/by_creator/")
    @C09SO(EnumC1846380y9E.GIFT)
    C11NZ<C470590Icr<GiftListByCreatorResponse.Data>> syncAnchorGiftList(@InterfaceC1501070pAH("room_id") String str, @InterfaceC1501070pAH("fetch_giftlist_from") int i, @InterfaceC1501070pAH("is_in_multi_guest_mode") boolean z, @InterfaceC1501070pAH("es_version") String str2);

    @C09SO(EnumC1846380y9E.GIFT)
    @InterfaceC1501170pAR("/webcast/gift/list/")
    C11NZ<BaseResponse<GiftListResult, GiftListExtra>> syncGiftListPostApplicationJson(@InterfaceC1485405rg GiftListRequestParams giftListRequestParams);

    @C09SO(EnumC1846380y9E.GIFT)
    @InterfaceC1501170pAR("/webcast/gift/list_priority/{priority}/")
    C11NZ<BaseResponse<GiftListResult, GiftListExtra>> syncGiftListPostApplicationJsonWithPriority(@InterfaceC1501060pAG("priority") int i, @InterfaceC1485405rg GiftListRequestParams giftListRequestParams);

    @InterfaceC1501170pAR("/webcast/gift/realtime_update/")
    C11NZ<C470590Icr<GiftRealTimeUpdateResponse.Data>> syncRealTimeUpdateWithParams(@InterfaceC1485405rg GiftRealTimeUpdateParams giftRealTimeUpdateParams);
}
