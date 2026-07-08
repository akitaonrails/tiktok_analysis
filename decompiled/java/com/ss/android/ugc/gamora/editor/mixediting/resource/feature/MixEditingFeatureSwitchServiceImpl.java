package com.ss.android.ugc.gamora.editor.mixediting.resource.feature;

import X.C1414930mvL;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.mixediting.IMixEditingFeatureSwitchService;

/* JADX INFO: loaded from: classes6.dex */
public final class MixEditingFeatureSwitchServiceImpl implements IMixEditingFeatureSwitchService {
    @Override // com.ss.android.ugc.gamora.mixediting.IMixEditingFeatureSwitchService
    public final boolean LIZ(VideoPublishEditModel videoPublishEditModel) {
        C1414930mvL.LIZ.getClass();
        if (!C1414930mvL.LIZ(videoPublishEditModel)) {
            return false;
        }
        CreativeModel creativeModel = videoPublishEditModel.creativeModel;
        if (creativeModel.videoImageSeparateSwitchModel != null && !creativeModel.draftInfoModel.isDraft) {
            return false;
        }
        return true;
    }
}
