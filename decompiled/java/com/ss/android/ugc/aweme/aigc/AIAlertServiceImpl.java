package com.ss.android.ugc.aweme.aigc;

import X.AbstractC1387200mCc;
import X.C01GW;
import X.C1388190mED;
import X.C1390380mHk;
import X.C1906580ziK;
import X.C2213981Bky;
import X.C452501pT;
import X.C547120Ld0;
import X.EnumC547830Le9;
import android.app.Activity;
import com.ss.android.ugc.aweme.aigc.asynctask.Source;
import com.ss.android.ugc.aweme.aikit.api.common.AIAlertService;
import com.ss.android.ugc.aweme.creative.model.aigc.AIGCCreationModel;
import com.ss.android.ugc.aweme.creative.model.aigc.AIGCGenerationModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.service.IAIGCKitOfflineService;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class AIAlertServiceImpl implements AIAlertService {
    public boolean LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(172));

    @Override // com.ss.android.ugc.aweme.aikit.api.common.AIAlertService
    public final void LIZ(String str) {
        IAIGCKitOfflineService iAIGCKitOfflineService;
        if (C2213981Bky.LIZIZ.isOffline() && (iAIGCKitOfflineService = (IAIGCKitOfflineService) PluggableExtentionKt.pluggableSpi$default(IAIGCKitOfflineService.class, false, false, false, 14, null)) != null) {
            iAIGCKitOfflineService.LIZIZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.aikit.api.common.AIAlertService
    public final void LIZLLL(AIGCCreationModel aIGCCreationModel) {
        if (C2213981Bky.LIZIZ.isOffline() && !this.LIZ) {
            AIGCGenerationModel aIGCGenerationModelZG = aIGCCreationModel.ZG();
            String step = aIGCGenerationModelZG.getStep();
            int errorCode = aIGCGenerationModelZG.getErrorCode();
            aIGCGenerationModelZG.getErrorMsg();
            aIGCGenerationModelZG.getErrorSource();
            aIGCGenerationModelZG.getClientTaskId();
            EnumC547830Le9 enumC547830Le9V7 = aIGCGenerationModelZG.v7();
            if ((!Intrinsics.LJFF(step, "QUOTA") || (errorCode != 5 && !C547120Ld0.LIZ.contains(Integer.valueOf(errorCode)))) && !C547120Ld0.LIZLLL.contains(Integer.valueOf(errorCode)) && !C547120Ld0.LJ.contains(Integer.valueOf(errorCode)) && !C547120Ld0.LIZJ.contains(Integer.valueOf(errorCode)) && errorCode != -47369) {
                C547120Ld0.LIZIZ.contains(Integer.valueOf(errorCode));
            }
            IAIGCKitOfflineService iAIGCKitOfflineService = (IAIGCKitOfflineService) PluggableExtentionKt.pluggableSpi$default(IAIGCKitOfflineService.class, false, false, false, 14, null);
            if (iAIGCKitOfflineService != null) {
                aIGCCreationModel.SN().getSource();
                enumC547830Le9V7.getScene();
                aIGCGenerationModelZG.getProgress();
                iAIGCKitOfflineService.LIZ();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.aikit.api.common.AIAlertService
    public final void LJ(boolean z) {
        this.LIZ = z;
    }

    @Override // com.ss.android.ugc.aweme.aikit.api.common.AIAlertService
    public final void LIZJ(int i, int i2) {
        Activity activityLIZIZ;
        Activity activityLIZ;
        AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
        if (abstractC1387200mCcLJ != null && (activityLIZIZ = abstractC1387200mCcLJ.LIZIZ()) != null && (activityLIZ = C1388190mED.LIZ(activityLIZIZ)) != null && !activityLIZ.isFinishing() && !activityLIZ.isDestroyed()) {
            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
            creativeToastBuilder.iconColorRes(R.attr.a1h);
            creativeToastBuilder.messageRes(i2);
            creativeToastBuilder.acrossActivities(true);
            C1390380mHk.LIZ(activityLIZ, i, creativeToastBuilder);
        }
    }

    @Override // com.ss.android.ugc.aweme.aikit.api.common.AIAlertService
    public final void LIZIZ(int i, String str, boolean z) {
        AbstractC1387200mCc abstractC1387200mCcLJ;
        Activity activityLIZIZ;
        Activity activityLIZ;
        Activity activityLIZIZ2;
        Activity activityLIZ2;
        if (!z && (abstractC1387200mCcLJ = C1906580ziK.LJ()) != null && (activityLIZIZ = abstractC1387200mCcLJ.LIZIZ()) != null && (activityLIZ = C1388190mED.LIZ(activityLIZIZ)) != null && !activityLIZ.isFinishing() && !activityLIZ.isDestroyed()) {
            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
            creativeToastBuilder.iconColorRes(R.attr.a1h);
            creativeToastBuilder.message(str);
            creativeToastBuilder.acrossActivities(true);
            AbstractC1387200mCc abstractC1387200mCcLJ2 = C1906580ziK.LJ();
            if (abstractC1387200mCcLJ2 != null && (activityLIZIZ2 = abstractC1387200mCcLJ2.LIZIZ()) != null && (activityLIZ2 = C1388190mED.LIZ(activityLIZIZ2)) != null) {
                C1390380mHk.LIZ(activityLIZ2, i, creativeToastBuilder);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.aikit.api.common.AIAlertService
    public final void LJFF(Source source, String str, Integer num, String str2, Function0<String> function0) {
        IAIGCKitOfflineService iAIGCKitOfflineService;
        if (C2213981Bky.LIZIZ.isOffline() && !this.LIZ && (iAIGCKitOfflineService = (IAIGCKitOfflineService) PluggableExtentionKt.pluggableSpi$default(IAIGCKitOfflineService.class, false, false, false, 14, null)) != null) {
            source.getSource();
            EnumC547830Le9.ID_INPUT.getScene();
            function0.invoke();
            iAIGCKitOfflineService.LIZ();
        }
    }
}
