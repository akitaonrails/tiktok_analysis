package com.ss.android.ugc.aweme.commerce.tools.common.publish;

import X.AbstractC856620Xj2;
import X.C04TD;
import X.C086I;
import X.C0CHQ;
import X.C1429890nJT;
import X.C1446500nkG;
import X.C1446520nkI;
import X.C20508115Mp;
import X.C20508815Mw;
import X.EnumC1428480nHC;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.commerce.CommercialVideoInfo;
import com.ss.android.ugc.aweme.commerce.IBEInfo;
import com.ss.android.ugc.aweme.commerce.InteractiveBrandedEffectInfo;
import com.ss.android.ugc.aweme.commerce.tools.common.CommerceToolsModel;
import com.ss.android.ugc.aweme.commerce.tools.mission.Mission;
import com.ss.android.ugc.aweme.commerce.tools.sticker.service.ICommerceToolsStickerService;
import com.ss.android.ugc.aweme.commerce.tools.tcm.CommerceToolsTcmModel;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.InteractStickerTracksContext;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public final class CommerceToolsPublishService implements ICommerceToolsPublishService {
    public static ICommerceToolsPublishService LIZJ() {
        Object objLIZ = C04TD.LIZ(ICommerceToolsPublishService.class, false);
        if (objLIZ != null) {
            return (ICommerceToolsPublishService) objLIZ;
        }
        if (C04TD.LLJJIJIIJIL == null) {
            synchronized (ICommerceToolsPublishService.class) {
                if (C04TD.LLJJIJIIJIL == null) {
                    C04TD.LLJJIJIIJIL = new CommerceToolsPublishService();
                }
            }
        }
        return C04TD.LLJJIJIIJIL;
    }

    @Override // com.ss.android.ugc.aweme.commerce.tools.common.publish.ICommerceToolsPublishService
    public final C20508115Mp LIZ(AbstractC856620Xj2 abstractC856620Xj2) {
        return new C20508115Mp(abstractC856620Xj2);
    }

    @Override // com.ss.android.ugc.aweme.commerce.tools.common.publish.ICommerceToolsPublishService
    public final void LIZIZ(VideoPublishEditModel videoPublishEditModel, LinkedHashMap<String, String> linkedHashMap) {
        String str;
        String str2;
        InteractStickerTracksContext interactStickerTracksContext;
        String str3;
        CommerceToolsModel commerceToolsModel;
        Mission mission;
        CommerceToolsModel commerceToolsModel2;
        String commerceTrafficType;
        boolean z;
        C1446520nkI.LIZ.getClass();
        CommerceToolsModel commerceToolsModel3 = videoPublishEditModel.creativeModel.commerceModel;
        if (videoPublishEditModel.isDefaultProp) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_default_prop", str);
        InteractiveBrandedEffectInfo interactiveBrandedEffectInfo = null;
        String str4 = "2";
        if (commerceToolsModel3.getStickerContext().getHasCommerceStickerMetaData()) {
            str2 = "3";
        } else {
            C1429890nJT mainBusinessContext = videoPublishEditModel.getMainBusinessContext();
            EnumC1428480nHC[] enumC1428480nHCArr = {EnumC1428480nHC.TRACK_PAGE_RECORD};
            LinkedList linkedList = new LinkedList();
            if (mainBusinessContext != null && (interactStickerTracksContext = mainBusinessContext.mInteractStickerContext) != null && !interactStickerTracksContext.isEmpty(enumC1428480nHCArr)) {
                linkedList.addAll(interactStickerTracksContext.getStickerStructsByPage(enumC1428480nHCArr));
            } else {
                linkedList = null;
            }
            if (!C086I.LIZIZ(linkedList)) {
                str2 = "2";
            } else {
                C1429890nJT mainBusinessContext2 = videoPublishEditModel.getMainBusinessContext();
                if (mainBusinessContext2 != null && mainBusinessContext2.interactStickerCheckEffectSdk) {
                    str2 = "1";
                } else {
                    str2 = CardStruct.IStatusCode.DEFAULT;
                }
            }
        }
        linkedHashMap.put("interact_sticker_check", str2);
        if (commerceToolsModel3.getStickerContext().getHasIBEMetaData()) {
            str4 = "3";
        } else if (!((ICommerceToolsStickerService) ServiceManager.get().getService(ICommerceToolsStickerService.class)).LIZJ(videoPublishEditModel)) {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("ibe_status_monitor", str4);
        List<IBEInfo> ibeInfos = commerceToolsModel3.getIbeContext().getIbeInfos();
        if (!ibeInfos.isEmpty()) {
            Gson retrofitFactoryGson = C0CHQ.LIZ().getNetworkService().getRetrofitFactoryGson();
            CommercialVideoInfo commercialVideoInfo = new CommercialVideoInfo();
            commercialVideoInfo.setIbeInfos(ibeInfos);
            InteractiveBrandedEffectInfo metadata = commerceToolsModel3.getIbeContext().getMetadata();
            if (metadata != null && metadata.getEnableTap()) {
                z = true;
            } else {
                z = false;
            }
            if (Boolean.valueOf(!z).booleanValue()) {
                interactiveBrandedEffectInfo = metadata;
            }
            commercialVideoInfo.setIbeMetaInfo(interactiveBrandedEffectInfo);
            linkedHashMap.put("commercial_video_info", GsonProtectorUtils.toJson(retrofitFactoryGson, commercialVideoInfo));
        }
        if (C1446500nkG.LJFF) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_commercial_sound_page", str3);
        if (videoPublishEditModel.creativeModel.commerceModel.getMusicUsageConfirmation() != 0) {
            linkedHashMap.put("music_usage_confirmation", String.valueOf(videoPublishEditModel.creativeModel.commerceModel.getMusicUsageConfirmation()));
        }
        CreativeModel creativeModel = videoPublishEditModel.creativeModel;
        if (creativeModel != null && (commerceToolsModel2 = creativeModel.commerceModel) != null && (commerceTrafficType = commerceToolsModel2.getCommerceTrafficType()) != null) {
            linkedHashMap.put("commerce_traffic_type", commerceTrafficType);
        }
        CreativeModel creativeModel2 = videoPublishEditModel.creativeModel;
        if (creativeModel2 != null && (commerceToolsModel = creativeModel2.commerceModel) != null && (mission = commerceToolsModel.getMission()) != null) {
            String missionId = mission.getMissionId();
            String str5 = "";
            if (missionId == null) {
                missionId = "";
            }
            linkedHashMap.put("mission_id", missionId);
            String enterFrom = mission.getEnterFrom();
            if (enterFrom != null) {
                str5 = enterFrom;
            }
            linkedHashMap.put("mission_from", str5);
        }
        C20508815Mw.LIZ.getClass();
        CommerceToolsTcmModel tcmModel = videoPublishEditModel.creativeModel.commerceModel.getTcmModel();
        if (videoPublishEditModel.getTtStoryUploadModel() == null) {
            if (tcmModel.isTcmOrder()) {
                linkedHashMap.put("is_star_atlas", "1");
            } else {
                linkedHashMap.put("is_star_atlas", CardStruct.IStatusCode.DEFAULT);
            }
            if (!TextUtils.isEmpty(tcmModel.getTcmCampaignInfo())) {
                linkedHashMap.put("star_atlas_content", String.valueOf(tcmModel.getTcmCampaignInfo()));
            }
            if (!TextUtils.isEmpty(tcmModel.getTcmParams())) {
                linkedHashMap.put("tcm_params", String.valueOf(tcmModel.getTcmParams()));
            }
        }
        if (!TextUtils.isEmpty(tcmModel.getBrandedContentSwitch())) {
            linkedHashMap.put("branded_content_type", tcmModel.getBrandedContentSwitch());
        }
        String brandOrganicType = tcmModel.getBrandOrganicType();
        if (brandOrganicType != null) {
            linkedHashMap.put("brand_organic_type", brandOrganicType);
        }
    }
}
