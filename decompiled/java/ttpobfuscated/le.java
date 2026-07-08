package ttpobfuscated;

import ttp.orbu.sdk.configuration.model.ConfigType;

/* JADX INFO: loaded from: classes24.dex */
public final class le {
    public static final String a(ConfigType configType, String str) {
        return configType.getFileName() + ':' + str;
    }

    public static /* synthetic */ String a(ConfigType configType, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        return a(configType, str);
    }
}
