package ttp.orbu.sdk.configuration.model;

import android.util.Base64;
import ttpobfuscated.b7;

/* JADX INFO: loaded from: classes24.dex */
public final class OrbuCodeConfigKt {
    public static final byte[] getOrbuCode(OrbuCodeConfig orbuCodeConfig) {
        return Base64.decode(orbuCodeConfig.getContent(), 0);
    }

    public static final String getOrbuHashClientCalculated(OrbuCodeConfig orbuCodeConfig) {
        return b7.c(getOrbuCode(orbuCodeConfig)).substring(0, 8);
    }
}
