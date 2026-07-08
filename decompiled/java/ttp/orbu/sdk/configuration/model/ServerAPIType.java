package ttp.orbu.sdk.configuration.model;

import X.C08FF;

/* JADX INFO: loaded from: classes24.dex */
public enum ServerAPIType {
    LOGGING("logging", "https://proxy.telemetry.us-ashburn-1.oci.oraclecloud.com/", null, "v1"),
    SAMPLING("sampling", "https://proxy.telemetry.us-ashburn-1.oci.oraclecloud.com/", null, "v1"),
    CONFIGURATION("configuration", "https://config.mtp.sag.us-ashburn-1.oci.oraclecloud.com/", Integer.valueOf(ServerAPITypeKt.getDEFAULT_SERVICE_DEFER_INTERVAL_IN_SECONDS()), null),
    PKI("pki", "https://proxy.telemetry.us-ashburn-1.oci.oraclecloud.com/", null, null),
    CHALLENGE("challenge", "https://proxy.telemetry.us-ashburn-1.oci.oraclecloud.com/", null, "v1");

    public static final Companion Companion = new Companion();
    public final String baseUrl;
    public final String defaultApiVersionPathParameter;
    public final Integer defaultServiceDeferIntervalInSeconds;
    public final String key;

    public static ServerAPIType valueOf(String str) {
        return (ServerAPIType) C08FF.LIZ(ServerAPIType.class, str);
    }

    public final String getBaseUrl() {
        return this.baseUrl;
    }

    public final String getDefaultApiVersionPathParameter() {
        return this.defaultApiVersionPathParameter;
    }

    public final Integer getDefaultServiceDeferIntervalInSeconds() {
        return this.defaultServiceDeferIntervalInSeconds;
    }

    public final String getKey() {
        return this.key;
    }

    public static final class Companion {
        /* JADX WARN: Removed duplicated region for block: B:6:0x000b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final ttp.orbu.sdk.configuration.model.ServerAPIType safeValueOf(java.lang.String r4) {
            /*
                r3 = this;
                r2 = 0
                if (r4 == 0) goto Lb
                java.util.Locale r0 = java.util.Locale.US     // Catch: java.lang.Throwable -> L15
                java.lang.String r0 = r4.toUpperCase(r0)     // Catch: java.lang.Throwable -> L15
                if (r0 != 0) goto Ld
            Lb:
                java.lang.String r0 = ""
            Ld:
                ttp.orbu.sdk.configuration.model.ServerAPIType r1 = ttp.orbu.sdk.configuration.model.ServerAPIType.valueOf(r0)     // Catch: java.lang.Throwable -> L15
                X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L15
                goto L21
            L15:
                r0 = move-exception
                com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
                X.00Yq r1 = new X.00Yq
                r1.<init>(r0)
                X.C189200o6.m2constructorimpl(r1)
            L21:
                boolean r0 = X.C189200o6.m7isFailureimpl(r1)
                if (r0 != 0) goto L28
                r2 = r1
            L28:
                ttp.orbu.sdk.configuration.model.ServerAPIType r2 = (ttp.orbu.sdk.configuration.model.ServerAPIType) r2
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: ttp.orbu.sdk.configuration.model.ServerAPIType.Companion.safeValueOf(java.lang.String):ttp.orbu.sdk.configuration.model.ServerAPIType");
        }
    }

    ServerAPIType(String str, String str2, Integer num, String str3) {
        this.key = str;
        this.baseUrl = str2;
        this.defaultServiceDeferIntervalInSeconds = num;
        this.defaultApiVersionPathParameter = str3;
    }
}
