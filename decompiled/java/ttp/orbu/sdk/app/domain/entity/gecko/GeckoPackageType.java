package ttp.orbu.sdk.app.domain.entity.gecko;

import X.C08FF;
import kotlin.text.u;

/* JADX INFO: loaded from: classes31.dex */
public enum GeckoPackageType {
    SPIDER("spider"),
    FRONTEND("frontend"),
    LYNX("lynx"),
    I18n("i18n"),
    PITAYA("pitaya"),
    EFFECT_HOUSE("effect"),
    STATIC("static"),
    MINIS("minis"),
    PLAYABLE("playable"),
    MINIGAMES("minigames");

    public static final a Companion = new Object() { // from class: ttp.orbu.sdk.app.domain.entity.gecko.GeckoPackageType.a
        public final GeckoPackageType a(String str) {
            for (GeckoPackageType geckoPackageType : GeckoPackageType.values()) {
                if (u.LJIJI(geckoPackageType.getValue(), str, true)) {
                    return geckoPackageType;
                }
            }
            return null;
        }
    };
    public final String value;

    public static GeckoPackageType valueOf(String str) {
        return (GeckoPackageType) C08FF.LIZ(GeckoPackageType.class, str);
    }

    public final String getValue() {
        return this.value;
    }

    GeckoPackageType(String str) {
        this.value = str;
    }
}
