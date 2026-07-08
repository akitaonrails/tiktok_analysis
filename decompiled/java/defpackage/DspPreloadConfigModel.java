package defpackage;

import X.C09CT;

/* JADX INFO: loaded from: classes36.dex */
public final class DspPreloadConfigModel {

    @C09CT("free")
    public final Config freeUserConfig;

    @C09CT("vip")
    public final Config vipUserConfig;

    public DspPreloadConfigModel() {
        Config config = new Config();
        config.maxCount = 5;
        this.freeUserConfig = config;
        Config config2 = new Config();
        config2.maxCount = 10;
        this.vipUserConfig = config2;
    }
}
