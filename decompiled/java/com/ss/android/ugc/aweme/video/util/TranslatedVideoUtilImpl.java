package com.ss.android.ugc.aweme.video.util;

import X.C1479890oc7;
import X.C1483430ohp;
import com.ss.android.ugc.aweme.ITranslatedVideoUtil;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: loaded from: classes10.dex */
public final class TranslatedVideoUtilImpl implements ITranslatedVideoUtil {
    @Override // com.ss.android.ugc.aweme.ITranslatedVideoUtil
    public final C1479890oc7 LIZ(Aweme aweme) {
        if (aweme != null) {
            return C1483430ohp.LIZ(aweme, "buildVideoModel");
        }
        return null;
    }
}
