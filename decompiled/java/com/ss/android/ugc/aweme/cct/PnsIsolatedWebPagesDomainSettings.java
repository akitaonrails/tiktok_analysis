package com.ss.android.ugc.aweme.cct;

import X.C01GW;
import X.C09CT;
import X.C13BV;
import X.C452501pT;
import java.util.List;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes29.dex */
public final class PnsIsolatedWebPagesDomainSettings {
    public static final ACTConfig LIZ = new ACTConfig(false, null, 3, null);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(97));

    public static final class ACTConfig {

        @C09CT("enable")
        public final boolean enable;

        @C09CT("pages")
        public final List<String> pages;

        public ACTConfig() {
            this(false, null, 3, null);
        }

        public ACTConfig(boolean z, List<String> list) {
            this.enable = z;
            this.pages = list;
        }

        public ACTConfig(boolean z, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? C13BV.INSTANCE : list);
        }
    }
}
