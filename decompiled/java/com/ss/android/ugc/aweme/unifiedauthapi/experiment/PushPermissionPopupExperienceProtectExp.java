package com.ss.android.ugc.aweme.unifiedauthapi.experiment;

import X.C0C64;

/* JADX INFO: loaded from: classes35.dex */
public final class PushPermissionPopupExperienceProtectExp {
    public static final int DEFAULT = 0;
    public static final PushPermissionPopupExperienceProtectExp INSTANCE = new PushPermissionPopupExperienceProtectExp();
    public static final int V1 = 1;
    public static final int V2 = 2;
    public static final int V3 = 3;
    public static final int V4 = 4;

    public final int getGroup() {
        return C0C64.LJIILLIIL().LJIIZILJ(31744, 0, 1, "push_permission_popup_experience_protection", false);
    }

    public final boolean inNotShowPopupInNujGroups() {
        int group = getGroup();
        return group == V2 || group == V3 || group == V4;
    }

    public final boolean isExperimentGroup() {
        return getGroup() > DEFAULT;
    }

    public final int getDEFAULT() {
        return DEFAULT;
    }

    public final int getV1() {
        return V1;
    }

    public final int getV2() {
        return V2;
    }

    public final int getV3() {
        return V3;
    }

    public final int getV4() {
        return V4;
    }
}
