package ttpobfuscated;

import ttp.orbu.sdk.configuration.model.Config;
import ttp.orbu.sdk.configuration.model.ConfigType;
import ttp.orbu.sdk.configuration.model.OrbuCodeConfig;

/* JADX INFO: loaded from: classes24.dex */
public final class va implements n1 {
    public static final a a = new a();
    public static volatile OrbuCodeConfig b = (OrbuCodeConfig) x.a.a(ConfigType.OrbuCode.INSTANCE);
    public static volatile String c = b.getOrbuHash();

    public static final class a {
    }

    @Override // ttpobfuscated.n1
    public void a() {
        c = b.getOrbuHash();
    }

    @Override // ttpobfuscated.n1
    public void b() {
        b = (OrbuCodeConfig) x.a.a(ConfigType.OrbuCode.INSTANCE);
        c = b.getOrbuHash();
    }

    public OrbuCodeConfig c() {
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
        b = (OrbuCodeConfig) config;
    }
}
