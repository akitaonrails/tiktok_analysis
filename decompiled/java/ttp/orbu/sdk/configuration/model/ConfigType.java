package ttp.orbu.sdk.configuration.model;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes24.dex */
public abstract class ConfigType {
    public static final Companion Companion = new Companion();
    public final String fileName;
    public final String type;

    public static final class General extends ConfigType {
        public static final General INSTANCE = new General();

        public General() {
            super("General", "config-signed.json");
        }
    }

    public static final class OrbuCode extends ConfigType {
        public static final OrbuCode INSTANCE = new OrbuCode();

        public OrbuCode() {
            super("OrbuCode", "config-orbucode-signed.json");
        }
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final String getType() {
        return this.type;
    }

    public static final class Companion {
        public final ConfigType fromType(String str) {
            if (Intrinsics.LJFF(str, "General")) {
                return General.INSTANCE;
            }
            if (Intrinsics.LJFF(str, "OrbuCode")) {
                return OrbuCode.INSTANCE;
            }
            return null;
        }
    }

    public ConfigType(String str, String str2) {
        this.type = str;
        this.fileName = str2;
    }
}
