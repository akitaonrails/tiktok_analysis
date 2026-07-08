package com.ss.android.ugc.aweme.influencer.ecommercelive.sea.billboard.repo;

import X.C0X52;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.DisplayResponse;
import com.ss.android.ugc.aweme.influencer.ecommercelive.sea.billboard.model.SeaLiveBillboardListData;
import com.ss.android.ugc.aweme.influencer.ecommercelive.sea.billboard.model.SeaLiveDisplayResultRequestBody;
import com.ss.android.ugc.aweme.influencer.ecommercelive.sea.billboard.model.SeaLiveGetByIdRequestBody;

/* JADX INFO: loaded from: classes27.dex */
public interface SeaLiveEffectBillboardNetApi {
    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/api/live_creator/v1/billboard/cancel_display")
    Object cancelDisplay(@InterfaceC1501050pAF("author_id") String str, @InterfaceC1501050pAF("billboard_id") String str2, @InterfaceC1501050pAF("billboard_type") int i, InterfaceC1364105Vn<? super C0X52<Response<Object>>> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/api/live_creator/v1/campaign_banner/cancel")
    Object cancelDisplayBanner(@InterfaceC1501070pAH("author_id") String str, @InterfaceC1501070pAH("room_id") String str2, InterfaceC1364105Vn<? super C0X52<Response<Object>>> interfaceC1364105Vn);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/api/live_creator/v1/billboard/display")
    Object display(@InterfaceC1501050pAF("author_id") String str, @InterfaceC1501050pAF("billboard_id") String str2, @InterfaceC1501050pAF("is_changed") boolean z, @InterfaceC1501050pAF("billboard_type") int i, @InterfaceC1501050pAF("template_display_type") int i2, InterfaceC1364105Vn<? super C0X52<Response<DisplayResponse>>> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/api/live_creator/v1/campaign_banner/display")
    Object displayBanner(@InterfaceC1501070pAH("author_id") String str, @InterfaceC1501070pAH("room_id") String str2, InterfaceC1364105Vn<? super C0X52<Response<Object>>> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/api/live_creator/v1/billboard/get_by_id")
    Object getBillboardById(@InterfaceC1485405rg SeaLiveGetByIdRequestBody seaLiveGetByIdRequestBody, InterfaceC1364105Vn<? super C0X52<Response<SeaLiveBillboardListData>>> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/api/live_creator/v1/billboard/pre_live_info/get")
    Object getPreLiveBillboard(@InterfaceC1501070pAH("author_id") String str, InterfaceC1364105Vn<? super C0X52<Response<n>>> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/api/live_creator/v1/campaign_banner/pc_display_result/report")
    Object reportBannerDisplayResult(@InterfaceC1501070pAH("author_id") String str, @InterfaceC1501070pAH("display_result") int i, InterfaceC1364105Vn<? super C0X52<Response<Object>>> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/api/live_creator/v1/billboard/pc_display_result/report")
    Object reportDisplayResult(@InterfaceC1485405rg SeaLiveDisplayResultRequestBody seaLiveDisplayResultRequestBody, InterfaceC1364105Vn<? super C0X52<Response<Object>>> interfaceC1364105Vn);
}
