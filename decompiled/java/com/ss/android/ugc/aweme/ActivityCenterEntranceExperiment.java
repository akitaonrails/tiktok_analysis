package com.ss.android.ugc.aweme;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: loaded from: classes4.dex */
public final class ActivityCenterEntranceExperiment {
    public static final ActivityCenterSettingModel LIZ = new ActivityCenterSettingModel(false, null);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(349));

    public static final class ActivityCenterSettingModel {

        @C09CT("enable")
        public final boolean enable;

        @C09CT("url")
        public final String url;

        public ActivityCenterSettingModel() {
            this(false, null);
        }

        public ActivityCenterSettingModel(boolean z, String str) {
            this.enable = z;
            this.url = str;
        }
    }
}
