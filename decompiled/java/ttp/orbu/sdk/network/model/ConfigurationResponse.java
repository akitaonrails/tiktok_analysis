package ttp.orbu.sdk.network.model;

/* JADX INFO: loaded from: classes24.dex */
public final class ConfigurationResponse {
    public final String keyId;
    public final String keyVersionId;
    public final String payload;
    public final String signature;
    public final String type;
    public final int version;

    public ConfigurationResponse(String str, String str2, int i, String str3, String str4, String str5) {
        this.payload = str;
        this.type = str2;
        this.version = i;
        this.signature = str3;
        this.keyId = str4;
        this.keyVersionId = str5;
    }
}
