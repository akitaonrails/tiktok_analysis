package com.ss.ugc.effectplatform.model.whitelist;

import X.C09CT;

/* JADX INFO: loaded from: classes26.dex */
public final class EffectWhiteListFeatureFlagStruct {

    @C09CT("duet")
    public final EffectWhitelistFeatureFlagSceneStruct duet;

    @C09CT("duet_greenscreen")
    public final EffectWhitelistFeatureFlagSceneStruct duetGreenScreen;

    @C09CT("layout")
    public final EffectWhitelistFeatureFlagSceneStruct layout;

    public EffectWhiteListFeatureFlagStruct() {
        this(new EffectWhitelistFeatureFlagSceneStruct(null, null, null, false, null, 31, null), new EffectWhitelistFeatureFlagSceneStruct(null, null, null, false, null, 31, null), new EffectWhitelistFeatureFlagSceneStruct(null, null, null, false, null, 31, null));
    }

    public EffectWhiteListFeatureFlagStruct(EffectWhitelistFeatureFlagSceneStruct effectWhitelistFeatureFlagSceneStruct, EffectWhitelistFeatureFlagSceneStruct effectWhitelistFeatureFlagSceneStruct2, EffectWhitelistFeatureFlagSceneStruct effectWhitelistFeatureFlagSceneStruct3) {
        this.layout = effectWhitelistFeatureFlagSceneStruct;
        this.duet = effectWhitelistFeatureFlagSceneStruct2;
        this.duetGreenScreen = effectWhitelistFeatureFlagSceneStruct3;
    }
}
