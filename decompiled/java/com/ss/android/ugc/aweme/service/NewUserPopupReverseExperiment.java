package com.ss.android.ugc.aweme.service;

import X.C01GW;
import X.C09CT;
import X.C452501pT;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS225S0000000_34;

/* JADX INFO: loaded from: classes35.dex */
public final class NewUserPopupReverseExperiment {
    public static final PopupReverseExperimentConfig LIZ = new PopupReverseExperimentConfig(false, 0, new ArrayList());
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(112));

    public static final class PopupReverseExperimentConfig {

        @C09CT("android_disabled_popup_list")
        public final List<String> disableList;

        @C09CT("max_enabled_duration_min")
        public final int duration;

        @C09CT("is_enable")
        public final boolean isEnable;

        public PopupReverseExperimentConfig() {
            this(false, 0, new ArrayList());
        }

        public PopupReverseExperimentConfig(boolean z, int i, List<String> list) {
            this.isEnable = z;
            this.duration = i;
            this.disableList = list;
        }
    }
}
