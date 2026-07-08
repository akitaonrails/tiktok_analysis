package com.ss.android.ugc.aweme.legoImp.task.publishtest;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import com.ss.android.ugc.aweme.experiment.publishtest.PublishTestSupportSetting$PublishTestSupportConfig;
import kotlin.jvm.internal.AFwS200S0000000_13;

/* JADX INFO: loaded from: classes14.dex */
public final class PublishTestSupportTCEApi {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(144));

    public static final class PublishTestSupportTCEResponse {

        @C09CT("data")
        public final PublishTestSupportSetting$PublishTestSupportConfig data;

        @C09CT("err_code")
        public final Integer errCode;

        public PublishTestSupportTCEResponse() {
            this(null, null);
        }

        public PublishTestSupportTCEResponse(Integer num, PublishTestSupportSetting$PublishTestSupportConfig publishTestSupportSetting$PublishTestSupportConfig) {
            this.errCode = num;
            this.data = publishTestSupportSetting$PublishTestSupportConfig;
        }
    }
}
