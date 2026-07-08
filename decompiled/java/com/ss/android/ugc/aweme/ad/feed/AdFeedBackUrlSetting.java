package com.ss.android.ugc.aweme.ad.feed;

import X.C09CT;
import X.C1AF0;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes4.dex */
public final class AdFeedBackUrlSetting {
    public static final AdFeedBackUrlModel LIZ;

    static {
        new AdFeedBackUrlSetting();
        LIZ = new AdFeedBackUrlModel(new String[]{"https://inapp.tiktokv.com/ad/tetris/experience/feedback_list"});
    }

    public static final AdFeedBackUrlModel LIZ() {
        try {
            SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
            AdFeedBackUrlModel adFeedBackUrlModel = LIZ;
            AdFeedBackUrlModel adFeedBackUrlModel2 = (AdFeedBackUrlModel) settingsManagerLIZLLL.LJIIIIZZ("ad_feed_back_url", AdFeedBackUrlModel.class, adFeedBackUrlModel);
            return adFeedBackUrlModel2 != null ? adFeedBackUrlModel2 : adFeedBackUrlModel;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
            return LIZ;
        }
    }

    public static final class AdFeedBackUrlModel {

        @C09CT("url")
        public final String[] url;

        public AdFeedBackUrlModel(String[] strArr) {
            this.url = strArr;
        }
    }
}
