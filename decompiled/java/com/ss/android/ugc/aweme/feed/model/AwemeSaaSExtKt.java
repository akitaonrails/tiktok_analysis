package com.ss.android.ugc.aweme.feed.model;

import X.C2188811AlT;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes36.dex */
public final class AwemeSaaSExtKt {
    public static final void buildUniqueId(Aweme aweme) {
        if (!TextUtils.isEmpty(aweme.requestId)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(aweme.requestId);
            sbLIZ.append('|');
            sbLIZ.append(aweme.aid);
            aweme.uniqueId = C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    public static final boolean canUseUniqueId(Aweme aweme) {
        if (!isLive(aweme) && !aweme.forceUseUniqueId) {
            return false;
        }
        return true;
    }

    public static final String getUniqueId(Aweme aweme) {
        String str = aweme.uniqueId;
        if (str != null && str.length() != 0) {
            return aweme.uniqueId;
        }
        return aweme.aid;
    }

    public static final boolean isForwardAweme(Aweme aweme) {
        if (aweme.awemeType == 13) {
            return true;
        }
        return false;
    }

    public static final boolean isLive(Aweme aweme) {
        if (aweme.awemeType == 101) {
            return true;
        }
        return false;
    }
}
