package com.ss.android.ugc.aweme.legoImp;

import X.C09CT;
import X.C0C64;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* JADX INFO: loaded from: classes5.dex */
public final class ClientSLIDataUploader {

    public static class SLIDataConfig {

        @C09CT("enable")
        public boolean enable;

        @C09CT("use_app_log")
        public boolean useAppLog;
    }

    public static void LIZ() {
        SLIDataConfig sLIDataConfig = (SLIDataConfig) C0C64.LJIILLIIL().LJJII(SLIDataConfig.class, null, "tiktok_sli_data_AB", true);
        if (sLIDataConfig != null) {
            Keva repo = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME);
            repo.storeBoolean("is_sli_open", sLIDataConfig.enable);
            repo.storeBoolean("is_app_log_open", sLIDataConfig.useAppLog);
        }
    }
}
