package ttpobfuscated;

import java.util.Map;
import ttp.orbu.sdk.configuration.model.SessionIdHeaderFrequency;

/* JADX INFO: loaded from: classes24.dex */
public final class be implements ae {
    public static final a a = new a();
    public static volatile SessionIdHeaderFrequency b = SessionIdHeaderFrequency.Never;
    public static volatile Map<String, String> c;

    public static final class a {
    }

    @Override // ttpobfuscated.ae
    public void clear() {
        b = SessionIdHeaderFrequency.Never;
        c = null;
    }

    @Override // ttpobfuscated.ae
    public d7 get() {
        return new d7(b, c);
    }

    @Override // ttpobfuscated.ae
    public void a(Map<String, String> map) {
        c = map;
    }

    @Override // ttpobfuscated.ae
    public void a(SessionIdHeaderFrequency sessionIdHeaderFrequency) {
        b = sessionIdHeaderFrequency;
    }
}
