package ttpobfuscated;

import ttp.orbu.sdk.configuration.model.Config;
import ttp.orbu.sdk.configuration.model.ConfigType;
import ttp.orbu.sdk.configuration.model.GeneralConfig;

/* JADX INFO: loaded from: classes24.dex */
public final class y5 implements n1 {
    public static final a a = new a();
    public static volatile GeneralConfig b = (GeneralConfig) x.a.a(ConfigType.General.INSTANCE);
    public static volatile String c = String.valueOf(b.getVersion());

    public static final class a {
    }

    @Override // ttpobfuscated.n1
    public void a() {
        c = String.valueOf(b.getVersion());
    }

    @Override // ttpobfuscated.n1
    public void b() {
        b = (GeneralConfig) x.a.a(ConfigType.General.INSTANCE);
        c = String.valueOf(b.getVersion());
    }

    public GeneralConfig c() {
        return b;
    }

    @Override // ttpobfuscated.n1
    public Config get() {
        return b;
    }

    @Override // ttpobfuscated.n1
    public String getVersion() {
        return c;
    }

    @Override // ttpobfuscated.n1
    public void a(Config config) {
        b = (GeneralConfig) config;
    }
}
