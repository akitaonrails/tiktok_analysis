package com.ss.android.ugc.aweme.creatoredit;

import X.C0X52;
import X.C11NZ;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501150pAP;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class CreatorCaptionEditApi {
    public static ICreatorCaptionEditApi LIZ;

    public interface ICreatorCaptionEditApi {
        @InterfaceC1501160pAQ("/tiktok/cla/creator_edited_caption/get/v1/")
        C11NZ<CreatorCaptionEditModel> queryAwemeAndCaption(@InterfaceC1501070pAH("subtitle_id") Long l, @InterfaceC1501070pAH("item_id") String str);

        @InterfaceC1501160pAQ("/tiktok/cla/creator_edited_translation/list/v1")
        Object suspendGetEditedTranslatedCaptions(@InterfaceC1501070pAH("item_id") Long l, InterfaceC1364105Vn<? super C0X52<CreatorEditedTranslatedCaptions>> interfaceC1364105Vn);

        @InterfaceC1501160pAQ("/tiktok/cla/creator_edited_translation/get/v1/")
        Object suspendGetTranslatedCaption(@InterfaceC1501070pAH("original_subtitle_id") Long l, @InterfaceC1501070pAH("item_id") Long l2, @InterfaceC1501070pAH("target_lang") String str, InterfaceC1364105Vn<? super C0X52<CreatorCaptionEditTranslatedModel>> interfaceC1364105Vn);

        @InterfaceC1501160pAQ("/tiktok/cla/creator_edited_caption/get/v1/")
        Object suspendQueryAwemeAndCaption(@InterfaceC1501070pAH("subtitle_id") Long l, @InterfaceC1501070pAH("item_id") String str, InterfaceC1364105Vn<? super C0X52<CreatorCaptionEditModel>> interfaceC1364105Vn);

        @InterfaceC1501300pAe
        @InterfaceC1501170pAR("/tiktok/v1/caption/cla/")
        Object suspendToggleAutoCaptionSetting(@InterfaceC1501050pAF("aweme_id") String str, @InterfaceC1501050pAF("enable_auto_caption") boolean z, InterfaceC1364105Vn<? super C0X52<BaseResponse>> interfaceC1364105Vn);

        @InterfaceC1501300pAe
        @InterfaceC1501170pAR("/tiktok/cla/creator_edited_caption/create/v1/")
        Object suspendUpdateOriginalCaption(@InterfaceC1501150pAP LinkedHashMap<String, String> linkedHashMap, InterfaceC1364105Vn<? super C0X52<BaseResponse>> interfaceC1364105Vn);

        @InterfaceC1501300pAe
        @InterfaceC1501170pAR("/tiktok/cla/creator_edited_translation/save/v1")
        Object suspendUpdateTranslatedCaption(@InterfaceC1501150pAP LinkedHashMap<String, String> linkedHashMap, InterfaceC1364105Vn<? super C0X52<BaseResponse>> interfaceC1364105Vn);

        @InterfaceC1501300pAe
        @InterfaceC1501170pAR("/tiktok/v1/caption/cla/")
        C11NZ<BaseResponse> toggleAutoCaptionSetting(@InterfaceC1501050pAF("aweme_id") String str, @InterfaceC1501050pAF("enable_auto_caption") boolean z);

        @InterfaceC1501300pAe
        @InterfaceC1501170pAR("/tiktok/cla/creator_edited_caption/create/v1/")
        C11NZ<BaseResponse> updateOriginalCaption(@InterfaceC1501150pAP LinkedHashMap<String, String> linkedHashMap);
    }
}
