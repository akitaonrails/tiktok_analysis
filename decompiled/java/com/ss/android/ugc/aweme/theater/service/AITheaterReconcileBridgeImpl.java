package com.ss.android.ugc.aweme.theater.service;

import X.C0LQ4;
import X.C546010LbD;
import X.C546030LbF;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.theater.model.AITheaterCreationModel;
import com.ss.android.ugc.aweme.theater.model.AITheaterGenerationModel;
import com.ss.android.ugc.aweme.theater.model.AITheaterModel;

/* JADX INFO: loaded from: classes9.dex */
public final class AITheaterReconcileBridgeImpl implements IAITheaterReconcileBridge {
    @Override // com.ss.android.ugc.aweme.theater.service.IAITheaterReconcileBridge
    public final void LIZ(CreativeModel creativeModel) {
        String serverTaskId;
        AITheaterGenerationModel aITheaterGenerationModel;
        AITheaterModel aITheaterModel = creativeModel.aigcBusinessModel.aiTheaterModel;
        if (aITheaterModel != null) {
            AITheaterCreationModel creationModel = aITheaterModel.getCreationModel();
            if (creationModel == null || (aITheaterGenerationModel = creationModel.generationModel) == null || (serverTaskId = aITheaterGenerationModel.getServerTaskId()) == null) {
                serverTaskId = "";
            }
            C546030LbF.LIZ(C0LQ4.DRAFT_BOX, serverTaskId, null, null, C546010LbD.LIZIZ(serverTaskId, creativeModel).LIZ, creativeModel);
        }
    }
}
