package com.ss.android.ugc.aweme.ad.service;

import X.C1035880d3y;
import X.C1038260d7o;
import X.C1038270d7p;
import android.content.Context;
import com.ss.android.ugc.aweme.commercialize.model.AdStyleActionModel;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.ad.AdExternalGuideConfig;
import com.ss.android.ugc.aweme.feed.model.ad.AdExternalGuideFormatConfig;
import com.ss.android.ugc.aweme.feed.model.ad.AdExternalGuideTriggerCondition;
import com.ss.android.ugc.aweme.landpage.externalguide.AdExternalGuideHandlerManager;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class AdExternalGuideServiceImpl implements IAdExternalGuideService {
    @Override // com.ss.android.ugc.aweme.ad.service.IAdExternalGuideService
    public final C1038270d7p getStatus() {
        return C1038270d7p.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.ad.service.IAdExternalGuideService
    public final boolean LIZ(C1035880d3y c1035880d3y, AdExternalGuideConfig.Format format) {
        AdStyleActionModel adStyleActionModel;
        AdExternalGuideConfig adExternalGuideConfig;
        AdExternalGuideFormatConfig bannerGuideFormat;
        List<AdExternalGuideTriggerCondition> triggerConditions;
        AwemeRawAd awemeRawAd = c1035880d3y.getAwemeRawAd();
        if (awemeRawAd != null && (adStyleActionModel = awemeRawAd.getAdStyleActionModel()) != null && (adExternalGuideConfig = adStyleActionModel.externalGuideConfig) != null) {
            int i = C1038260d7o.LIZ[format.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        bannerGuideFormat = adExternalGuideConfig.getDirectJumpGuideFormat();
                    }
                    return false;
                }
                bannerGuideFormat = adExternalGuideConfig.getDialogGuideFormat();
            } else {
                bannerGuideFormat = adExternalGuideConfig.getBannerGuideFormat();
            }
            if (bannerGuideFormat != null && (triggerConditions = bannerGuideFormat.getTriggerConditions()) != null && !triggerConditions.isEmpty()) {
                int iabType = c1035880d3y.getIabType();
                for (AdExternalGuideTriggerCondition adExternalGuideTriggerCondition : triggerConditions) {
                    Integer scene = adExternalGuideTriggerCondition.getScene();
                    int value = AdExternalGuideTriggerCondition.Scene.IAB.getValue();
                    if (scene != null && scene.intValue() == value && iabType != 1) {
                        return true;
                    }
                    Integer scene2 = adExternalGuideTriggerCondition.getScene();
                    int value2 = AdExternalGuideTriggerCondition.Scene.MIDDLE_PAGE.getValue();
                    if (scene2 != null && scene2.intValue() == value2 && iabType == 1) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ad.service.IAdExternalGuideService
    public final AdExternalGuideHandlerManager LIZIZ(Context context, AwemeRawAd awemeRawAd) {
        AdStyleActionModel adStyleActionModel;
        AdExternalGuideConfig adExternalGuideConfig;
        if (context == null || awemeRawAd == null || (adStyleActionModel = awemeRawAd.getAdStyleActionModel()) == null || (adExternalGuideConfig = adStyleActionModel.externalGuideConfig) == null) {
            return null;
        }
        return new AdExternalGuideHandlerManager(context, adExternalGuideConfig);
    }
}
