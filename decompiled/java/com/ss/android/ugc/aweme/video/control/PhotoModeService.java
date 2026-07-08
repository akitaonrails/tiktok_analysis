package com.ss.android.ugc.aweme.video.control;

import X.C582980Mtk;
import X.C721220SQu;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: loaded from: classes10.dex */
public final class PhotoModeService implements IPhotoModeService {
    @Override // com.ss.android.ugc.aweme.video.control.IPhotoModeService
    public final Boolean LIZ(Aweme aweme) {
        if (aweme != null) {
            return Boolean.valueOf(C582980Mtk.LIZIZ(aweme));
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.video.control.IPhotoModeService
    public final Boolean LIZIZ(Aweme aweme) {
        if (aweme != null) {
            return Boolean.valueOf(C721220SQu.LIZLLL(aweme));
        }
        return null;
    }
}
