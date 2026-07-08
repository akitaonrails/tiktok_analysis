package com.ss.android.ugc.aweme.commercialize.profile.impl.log;

import X.C1029400ctW;
import X.C1029420ctY;
import X.C1210304oP;
import X.EnumC1029460ctc;
import com.ss.android.ugc.aweme.commercialize.profile.api.logger.IFullScreenLandingPageLogger;
import com.ss.android.ugc.aweme.commercialize.profile.api.logger.IFullScreenLandingPageUnityLogger;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.Map;
import kotlin.jvm.internal.AwS130S1100000_16;

/* JADX INFO: loaded from: classes17.dex */
public final class FullScreenLandingPageLoggerImpl implements IFullScreenLandingPageLogger {
    @Override // com.ss.android.ugc.aweme.commercialize.profile.api.logger.IFullScreenLandingPageLogger
    public final void LIZ(Aweme aweme, String str) {
        LIZIZ(aweme, str, null);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.profile.api.logger.IFullScreenLandingPageLogger
    public final void LIZIZ(Aweme aweme, String str, Map<String, ? extends Object> map) {
        AwemeRawAd awemeRawAd;
        if (C1210304oP.LIZ()) {
            IFullScreenLandingPageUnityLogger iFullScreenLandingPageUnityLogger = (IFullScreenLandingPageUnityLogger) PluggableExtentionKt.pluggableSpi$default(IFullScreenLandingPageUnityLogger.class, false, false, false, 14, null);
            if (iFullScreenLandingPageUnityLogger == null) {
                return;
            }
            if (map != null) {
                EnumC1029460ctc enumC1029460ctc = EnumC1029460ctc.VERSION_4_0;
                if (aweme != null) {
                    awemeRawAd = aweme.getAwemeRawAd();
                } else {
                    awemeRawAd = null;
                }
                iFullScreenLandingPageUnityLogger.LIZ(enumC1029460ctc, awemeRawAd, str, map);
                return;
            }
            iFullScreenLandingPageUnityLogger.LIZIZ(EnumC1029460ctc.VERSION_4_0, aweme, str);
            return;
        }
        new C1029420ctY().logAd(C1029400ctW.LIZ, new AwS130S1100000_16(aweme, str, 4));
    }
}
