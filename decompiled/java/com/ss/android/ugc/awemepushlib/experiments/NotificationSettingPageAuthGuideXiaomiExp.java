package com.ss.android.ugc.awemepushlib.experiments;

import X.C01GW;
import X.C1720106oR;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C452501pT;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class NotificationSettingPageAuthGuideXiaomiExp {
    public static final int DEFAULT = 0;
    public static final String KEY = "notification_setting_page_auth_guide_config_version_xiaomi";
    public static final String TAG = "NotificationSettingPageAuthGuideXiaomiExp";
    public static final int V1 = 1;
    public static final int V2 = 2;
    public static final NotificationSettingPageAuthGuideXiaomiExp INSTANCE = new NotificationSettingPageAuthGuideXiaomiExp();
    public static final C01GW value$delegate = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(581));
    public static final int $stable = 8;

    private final int getValue() {
        return ((Number) value$delegate.getValue()).intValue();
    }

    public final boolean enabled() {
        return getValue() != 0;
    }

    public final boolean isV1() {
        return getValue() == 1;
    }

    public final boolean isV2() {
        return getValue() == 2;
    }

    public final boolean shouldShowXiaomiAuthGuide(String str) {
        boolean z;
        boolean zEnabled = enabled();
        boolean zLJFF = Intrinsics.LJFF(str, "xiaomi");
        if (zEnabled && zLJFF) {
            z = true;
        } else {
            z = false;
        }
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("manufacturer: ");
        sbLIZ.append(str);
        sbLIZ.append(", enabled: ");
        sbLIZ.append(zEnabled);
        sbLIZ.append(", isXiaomi: ");
        sbLIZ.append(zLJFF);
        sbLIZ.append(", res: ");
        sbLIZ.append(z);
        C1720106oR.LJI(TAG, C2188811AlT.LIZIZ(sbLIZ));
        return z;
    }
}
