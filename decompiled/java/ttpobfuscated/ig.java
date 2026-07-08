package ttpobfuscated;

import ttp.orbu.sdk.configuration.model.ServerAPIType;
import ttp.orbu.sdk.configuration.model.ServerConfig;

/* JADX INFO: loaded from: classes24.dex */
public final class ig implements zd {
    public final ServerAPIType a;
    public final yd b;

    @Override // ttpobfuscated.zd
    public String a() {
        return this.b.a(this.a).baseUrl;
    }

    @Override // ttpobfuscated.zd
    public int b() {
        return this.b.a(this.a).timeoutInMS;
    }

    public final ServerConfig c() {
        return this.b.a(this.a);
    }

    public ig(ServerAPIType serverAPIType, yd ydVar) {
        this.a = serverAPIType;
        this.b = ydVar;
    }
}
