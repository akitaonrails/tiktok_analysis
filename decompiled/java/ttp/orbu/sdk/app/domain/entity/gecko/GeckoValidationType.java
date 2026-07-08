package ttp.orbu.sdk.app.domain.entity.gecko;

import X.C08FF;
import kotlin.text.u;

/* JADX INFO: loaded from: classes24.dex */
public enum GeckoValidationType {
    None("none"),
    Structure("structure"),
    Signed("signed"),
    Production("production");

    public static final a Companion = new a();
    public final String value;

    public static GeckoValidationType valueOf(String str) {
        return (GeckoValidationType) C08FF.LIZ(GeckoValidationType.class, str);
    }

    public final String getValue() {
        return this.value;
    }

    public static final class a {
        public final GeckoValidationType a(String str) {
            for (GeckoValidationType geckoValidationType : GeckoValidationType.values()) {
                if (u.LJIJI(geckoValidationType.getValue(), str, true)) {
                    return geckoValidationType;
                }
            }
            return null;
        }
    }

    GeckoValidationType(String str) {
        this.value = str;
    }
}
