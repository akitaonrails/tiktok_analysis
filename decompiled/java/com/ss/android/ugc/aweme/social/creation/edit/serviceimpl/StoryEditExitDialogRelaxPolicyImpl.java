package com.ss.android.ugc.aweme.social.creation.edit.serviceimpl;

import X.C0CHQ;
import X.C1458320o3K;
import X.C263920AVy;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import com.ss.android.ugc.aweme.social.creation.api.IStoryEditExitDialogRelaxPolicy;

/* JADX INFO: loaded from: classes23.dex */
public final class StoryEditExitDialogRelaxPolicyImpl implements IStoryEditExitDialogRelaxPolicy {
    public static boolean LIZJ(VideoPublishEditModel videoPublishEditModel) {
        if (!u4.LJIILLIIL(videoPublishEditModel) || ((Number) C263920AVy.LIZ.getValue()).intValue() != 1) {
            return false;
        }
        C0CHQ.LIZ().LJJIJIIJI();
        if (!C1458320o3K.LIZIZ(videoPublishEditModel.getMusicOrigin())) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.social.creation.api.IStoryEditExitDialogRelaxPolicy
    public final boolean LIZ(VideoPublishEditModel videoPublishEditModel) {
        return LIZJ(videoPublishEditModel);
    }

    @Override // com.ss.android.ugc.aweme.social.creation.api.IStoryEditExitDialogRelaxPolicy
    public final boolean LIZIZ(VideoPublishEditModel videoPublishEditModel) {
        return LIZJ(videoPublishEditModel);
    }
}
