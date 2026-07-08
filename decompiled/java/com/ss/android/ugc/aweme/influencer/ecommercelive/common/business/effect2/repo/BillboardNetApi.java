package com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.repo;

import X.C0X52;
import X.InterfaceC1364105Vn;
import X.InterfaceC1485405rg;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.BillboardListData;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.BillboardSettingsData;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.DeleteImageResponseData;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.DisplayResponse;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.DisplayResultRequestBody;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.GetByIdRequestBody;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.ImageListData;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.PreLiveBillboardInfo;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.ReviewTemplateRequestBody;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.SaveTemplateRequestBody;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.SaveTemplateResponse;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateByTypeData;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateListData;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.UploadConfigData;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.UploadImageRequestBody;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.UploadImageResponseData;

/* JADX INFO: loaded from: classes27.dex */
public interface BillboardNetApi {
    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/api/live_creator/v1/billboard/cancel_display")
    Object cancelDisplay(@InterfaceC1501050pAF("author_id") String str, @InterfaceC1501050pAF("billboard_id") String str2, @InterfaceC1501050pAF("billboard_type") int i, InterfaceC1364105Vn<? super C0X52<Response<Object>>> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/api/live_creator/v1/campaign_banner/cancel")
    Object cancelDisplayBanner(@InterfaceC1501070pAH("author_id") String str, @InterfaceC1501070pAH("room_id") String str2, InterfaceC1364105Vn<? super C0X52<Response<Object>>> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/api/live_creator/v1/billboard/upload_image")
    Object createImageTemplate(@InterfaceC1485405rg UploadImageRequestBody uploadImageRequestBody, InterfaceC1364105Vn<? super C0X52<Response<UploadImageResponseData>>> interfaceC1364105Vn);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/api/live_creator/v1/billboard/delete")
    Object deleteImage(@InterfaceC1501050pAF("author_id") String str, @InterfaceC1501050pAF("image_id") String str2, InterfaceC1364105Vn<? super C0X52<Response<DeleteImageResponseData>>> interfaceC1364105Vn);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/api/live_creator/v1/billboard/display")
    Object display(@InterfaceC1501050pAF("author_id") String str, @InterfaceC1501050pAF("billboard_id") String str2, @InterfaceC1501050pAF("is_changed") boolean z, @InterfaceC1501050pAF("billboard_type") int i, @InterfaceC1501050pAF("template_type") int i2, @InterfaceC1501050pAF("template_display_type") int i3, @InterfaceC1501050pAF("template_sub_type") Integer num, InterfaceC1364105Vn<? super C0X52<Response<DisplayResponse>>> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/api/live_creator/v1/campaign_banner/display")
    Object displayBanner(@InterfaceC1501070pAH("author_id") String str, @InterfaceC1501070pAH("room_id") String str2, InterfaceC1364105Vn<? super C0X52<Response<Object>>> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/api/live_creator/v1/billboard/get_by_id")
    Object getBillboardById(@InterfaceC1485405rg GetByIdRequestBody getByIdRequestBody, InterfaceC1364105Vn<? super C0X52<Response<BillboardListData>>> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/api/live_creator/v1/billboard/images_list")
    Object getBillboardImages(@InterfaceC1501070pAH("author_id") String str, @InterfaceC1501070pAH("page_size") int i, @InterfaceC1501070pAH("offset") int i2, @InterfaceC1501070pAH("is_showing") boolean z, InterfaceC1364105Vn<? super C0X52<Response<ImageListData>>> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/api/live_creator/v1/billboard/billboard_setting")
    Object getBillboardSettings(@InterfaceC1501070pAH("author_id") String str, InterfaceC1364105Vn<? super C0X52<Response<BillboardSettingsData>>> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/api/live_creator/v1/billboard/templates_list")
    Object getBillboardTemplates(@InterfaceC1501070pAH("room_id") String str, @InterfaceC1501070pAH("author_id") String str2, @InterfaceC1501070pAH("template_entry_type") int i, @InterfaceC1501070pAH("is_showing") boolean z, InterfaceC1364105Vn<? super C0X52<Response<TemplateListData>>> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/api/live_creator/v1/billboard/pre_live_info/get")
    Object getPreLiveBillboard(@InterfaceC1501070pAH("author_id") String str, InterfaceC1364105Vn<? super C0X52<Response<PreLiveBillboardInfo>>> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/api/live_creator/v1/billboard/get_template_by_type")
    Object getTemplateByType(@InterfaceC1501070pAH("room_id") String str, @InterfaceC1501070pAH("author_id") String str2, @InterfaceC1501070pAH("template_type") int i, @InterfaceC1501070pAH("template_sub_type") Integer num, @InterfaceC1501070pAH("fill_content") boolean z, @InterfaceC1501070pAH("giveaway_activity_id") String str3, InterfaceC1364105Vn<? super C0X52<Response<TemplateByTypeData>>> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/api/live_creator/v1/billboard/imagex_signature")
    Object getUploadConfig(InterfaceC1364105Vn<? super C0X52<Response<UploadConfigData>>> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/api/live_creator/v1/campaign_banner/pc_display_result/report")
    Object reportBannerDisplayResult(@InterfaceC1501070pAH("author_id") String str, @InterfaceC1501070pAH("display_result") int i, InterfaceC1364105Vn<? super C0X52<Response<Object>>> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/api/live_creator/v1/billboard/pc_display_result/report")
    Object reportDisplayResult(@InterfaceC1485405rg DisplayResultRequestBody displayResultRequestBody, InterfaceC1364105Vn<? super C0X52<Response<Object>>> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/api/live_creator/v1/billboard/review")
    Object reviewTemplate(@InterfaceC1485405rg ReviewTemplateRequestBody reviewTemplateRequestBody, InterfaceC1364105Vn<? super C0X52<Response<SaveTemplateResponse>>> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/api/live_creator/v1/billboard/save")
    Object saveTemplate(@InterfaceC1485405rg SaveTemplateRequestBody saveTemplateRequestBody, InterfaceC1364105Vn<? super C0X52<Response<SaveTemplateResponse>>> interfaceC1364105Vn);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/api/live_creator/v1/billboard/update_billboard_setting")
    Object updateBillboardSettings(@InterfaceC1501050pAF("author_id") String str, @InterfaceC1501050pAF("open_setting") boolean z, InterfaceC1364105Vn<? super C0X52<Response<Object>>> interfaceC1364105Vn);
}
