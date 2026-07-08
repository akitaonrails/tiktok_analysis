package com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectparser;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class Config {

    @C09CT("bALG_BACH_CONFIG")
    public final Boolean bAlgBachConfig;

    @C09CT("effect")
    public final Effect effect;

    @C09CT("name")
    public final String name;

    @C09CT("TiktokEffectHouse")
    public final TiktokEffectHouse tiktokEffectHouse;

    @C09CT("version")
    public final String version;

    public Config() {
        this(null, null, null, null, null);
    }

    public Config(Boolean bool, Effect effect, String str, String str2, TiktokEffectHouse tiktokEffectHouse) {
        this.bAlgBachConfig = bool;
        this.effect = effect;
        this.name = str;
        this.version = str2;
        this.tiktokEffectHouse = tiktokEffectHouse;
    }
}
