package com.ss.android.ugc.aweme.autofill.settings;

import X.C09CT;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes17.dex */
public final class TtopAutoFillUserAgentSetting {
    public static final UaSettingsModel LIZ;

    static {
        new TtopAutoFillUserAgentSetting();
        LIZ = new UaSettingsModel(null, 1, null);
    }

    public static final class UaSettingsModel {

        @C09CT("Safari/604.1")
        public final List<String> allowedDomains;

        public UaSettingsModel() {
            this(null, 1, null);
        }

        public UaSettingsModel(List<String> list) {
            this.allowedDomains = list;
        }

        public UaSettingsModel(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? Collections.singletonList("^https?://([0-9A-Za-z_-]+.)?feverup.com") : list);
        }
    }
}
