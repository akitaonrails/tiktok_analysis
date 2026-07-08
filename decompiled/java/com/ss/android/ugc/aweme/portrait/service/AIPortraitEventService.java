package com.ss.android.ugc.aweme.portrait.service;

import X.EnumC1419230n2H;
import X.EnumC550430LiL;
import X.EnumC570120MXq;
import com.ss.android.ugc.aweme.aigc.quality.mob.business.AIGCEntranceInfo;
import com.ss.android.ugc.aweme.portrait.model.RefImageType;
import com.ss.android.ugc.aweme.portrait.route.AIPortraitEnterParams;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes26.dex */
public interface AIPortraitEventService {
    Pair<String, Map<String, String>> buildGenerationStartMob(AIPortraitGeneration aIPortraitGeneration);

    void reportEditProfileEntranceClick(AIPortraitProfileParam aIPortraitProfileParam);

    void reportEditProfileEntranceShow(AIPortraitProfileParam aIPortraitProfileParam);

    void reportEntranceClick(AIPortraitEnterParams aIPortraitEnterParams);

    void reportEntranceShow(AIPortraitEnterParams aIPortraitEnterParams);

    void reportShoot(String str, AIGCEntranceInfo aIGCEntranceInfo);

    void reportTTCrtAIGenerationStart(AIPortraitGeneration aIPortraitGeneration);

    void reportTTCrtCreateVideoPage(AIPortraitGeneration aIPortraitGeneration);

    void reportTemplateDetailPageEnter(AIGCEntranceInfo aIGCEntranceInfo, String str, String str2, EnumC1419230n2H enumC1419230n2H, EnumC570120MXq enumC570120MXq, EnumC570120MXq enumC570120MXq2, RefImageType refImageType, EnumC550430LiL enumC550430LiL, Integer num, String str3);
}
