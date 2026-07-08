package ttp.orbu.sdk.configuration.model;

import ttpobfuscated.n0;

/* JADX INFO: loaded from: classes24.dex */
public final class ServerConfig {
    public final String apiVersionPathParameter;
    public final String baseUrl;
    public final Integer maxPayloadSizeInBytes;
    public final ServerAPIType name;
    public final Integer serviceDeferIntervalInSeconds;
    public final int timeoutInMS;

    public final ServerConfig copy(ServerAPIType serverAPIType, String str, int i, Integer num, Integer num2, String str2) {
        return new ServerConfig(serverAPIType, str, i, num, num2, str2);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ServerConfig(name=");
        sb.append(this.name);
        sb.append(", baseUrl=");
        sb.append(this.baseUrl);
        sb.append(", timeoutInMS=");
        sb.append(this.timeoutInMS);
        sb.append(", maxPayloadSizeInBytes=");
        sb.append(this.maxPayloadSizeInBytes);
        sb.append(", serviceDeferIntervalInSeconds=");
        sb.append(this.serviceDeferIntervalInSeconds);
        sb.append(", apiVersionPathParameter=");
        return n0.a(sb, this.apiVersionPathParameter, ')');
    }

    public ServerConfig(ServerAPIType serverAPIType, String str, int i, Integer num, Integer num2, String str2) {
        this.name = serverAPIType;
        this.baseUrl = str;
        this.timeoutInMS = i;
        this.maxPayloadSizeInBytes = num;
        this.serviceDeferIntervalInSeconds = num2;
        this.apiVersionPathParameter = str2;
    }
}
