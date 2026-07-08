package com.ss.android.ugc.aweme.legoImp.task.api;

import X.C09CT;
import X.C11NZ;
import X.InterfaceC1501170pAR;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: loaded from: classes29.dex */
public final class FirebaseReportApi {
    public static final IFirebaseReportApi LIZ = (IFirebaseReportApi) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).LIZ("https://ug-sg.byteoversea.com").create(IFirebaseReportApi.class);

    public static final class ForceLoginConfigResponse {
        public static final int $stable = 0;

        @C09CT("code")
        public final int code;

        @C09CT("data")
        public final ForceLoginConfig data;

        @C09CT("message")
        public final String message;

        public final boolean isSuccess() {
            return this.code == 200;
        }

        public ForceLoginConfigResponse(int i, String str, ForceLoginConfig forceLoginConfig) {
            this.code = i;
            this.message = str;
            this.data = forceLoginConfig;
        }
    }

    public interface IFirebaseReportApi {
        @InterfaceC1501170pAR("/user_in_force_login_country/check")
        C11NZ<ForceLoginConfigResponse> getUserForceLoginConfig();
    }

    public static final class ForceLoginConfig {
        public static final int $stable = 0;

        @C09CT("idc")
        public final String idc;

        @C09CT("region")
        public final String region;

        @C09CT("user_in_force_login_country")
        public final boolean userInForceLoginCountry;

        public ForceLoginConfig() {
            this(false, null, null);
        }

        public ForceLoginConfig(boolean z, String str, String str2) {
            this.userInForceLoginCountry = z;
            this.idc = str;
            this.region = str2;
        }
    }
}
