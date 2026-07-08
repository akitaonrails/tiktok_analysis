package ttp.orbu.sdk.configuration.model;

import X.C08FF;
import kotlin.text.u;

/* JADX INFO: loaded from: classes24.dex */
public enum GeckoValidation {
    NONE("none"),
    STRUCTURE("structure"),
    SIGNED("signed"),
    PRODUCTION("production");

    public static final Companion Companion = new Companion();
    public final String value;

    public static GeckoValidation valueOf(String str) {
        return (GeckoValidation) C08FF.LIZ(GeckoValidation.class, str);
    }

    public final String getValue() {
        return this.value;
    }

    public static final class Companion {
        public final GeckoValidation fromString(String str) {
            for (GeckoValidation geckoValidation : GeckoValidation.values()) {
                if (u.LJIJI(geckoValidation.getValue(), str, true)) {
                    return geckoValidation;
                }
            }
            return null;
        }
    }

    GeckoValidation(String str) {
        this.value = str;
    }
}
