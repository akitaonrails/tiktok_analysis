package com.bytedance.hybrid.spark.roma.config;

import X.C09CT;
import X.C0X9S;
import X.C1550300qRg;
import X.C1550320qRi;
import X.C1550480qRy;
import X.C189200o6;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import com.bytedance.retrofit2.mime.TypedInput;

/* JADX INFO: loaded from: classes24.dex */
public final class FallbackServer {
    public static final FallbackServer LIZ;
    public static final API LIZIZ;
    public static final C1550480qRy<String, C189200o6<ShortLinkConfig>> LIZJ;

    /* JADX INFO: loaded from: classes5.dex */
    public interface API {
        @InterfaceC1501160pAQ("spark_config")
        C0X9S<TypedInput> getSparkConfig(@InterfaceC1501070pAH("__s_key") String str, @InterfaceC1501070pAH("app_id") String str2, @InterfaceC1501070pAH("device_id") String str3, @InterfaceC1501070pAH("client_version") long j, @InterfaceC1501070pAH("cpu_model") String str4, @InterfaceC1501070pAH("oid") int i, @InterfaceC1501070pAH("cdid") String str5, @InterfaceC1501070pAH("ab_extra_data") String str6, @InterfaceC1501070pAH("env_type") String str7, @InterfaceC1501070pAH("env_channel") String str8);
    }

    static {
        FallbackServer fallbackServer = new FallbackServer();
        LIZ = fallbackServer;
        LIZIZ = (API) C1550300qRg.LIZIZ.LJIILLIIL(API.class);
        LIZJ = new C1550480qRy<>(new C1550320qRi(fallbackServer), C1550300qRg.LIZIZ().platformApiConfigCacheTimeMs, 4);
    }

    public static final class ServerError extends Throwable {

        @C09CT("code")
        public final int code;

        @C09CT("message")
        public final String message;

        public final int getCode() {
            return this.code;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return this.message;
        }

        public ServerError(int i, String str, Throwable th) {
            super(th);
            this.code = i;
            this.message = str;
        }
    }

    public static final class SparkConfigResponse {

        @C09CT("config")
        public final ShortLinkConfig config;

        @C09CT("is_common_api_blocked")
        public final boolean isCommonApiBlocked;

        public SparkConfigResponse() {
            this(null, false);
        }

        public SparkConfigResponse(ShortLinkConfig shortLinkConfig, boolean z) {
            this.config = shortLinkConfig;
            this.isCommonApiBlocked = z;
        }
    }
}
