package com.ss.android.ugc.aweme.tools.integration.plugin.integration.api;

import X.C2188811AlT;
import X.C786410Ut5;

/* JADX INFO: loaded from: classes28.dex */
public abstract class CreativeToolsBizPluginState {

    public static final class Downloading extends CreativeToolsBizPluginState {
        public static final Downloading INSTANCE = new Downloading();
    }

    public static final class NotInstalled extends CreativeToolsBizPluginState {
        public static final NotInstalled INSTANCE = new NotInstalled();
    }

    public static final class Installed extends CreativeToolsBizPluginState {
        public final boolean initInstall;

        public final Installed copy(boolean z) {
            return new Installed(z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Installed) && this.initInstall == ((Installed) obj).initInstall;
        }

        public int hashCode() {
            return C786410Ut5.Z2(this.initInstall);
        }

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Installed(initInstall=");
            sbLIZ.append(this.initInstall);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public final boolean getInitInstall() {
            return this.initInstall;
        }

        public Installed(boolean z) {
            this.initInstall = z;
        }
    }
}
