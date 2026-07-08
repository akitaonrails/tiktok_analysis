package ttpobfuscated;

import X.C08FF;

/* JADX INFO: loaded from: classes24.dex */
public enum m1 {
    failToRequestCloudConfig,
    failToDeserializeConfigJson,
    failToUpdateOrbucodeConfig;

    public static final /* synthetic */ m1[] a() {
        return new m1[]{failToRequestCloudConfig, failToDeserializeConfigJson, failToUpdateOrbucodeConfig};
    }

    public static m1 valueOf(String str) {
        return (m1) C08FF.LIZ(m1.class, str);
    }
}
