package ttpobfuscated;

import ttp.orbu.sdk.network.model.ConfigurationResponse;

/* JADX INFO: loaded from: classes24.dex */
public final class w1 {
    public static final se a(ConfigurationResponse configurationResponse) {
        return new se(configurationResponse.payload, configurationResponse.signature, re.valueOf(configurationResponse.type), configurationResponse.version, configurationResponse.keyId, configurationResponse.keyVersionId);
    }
}
