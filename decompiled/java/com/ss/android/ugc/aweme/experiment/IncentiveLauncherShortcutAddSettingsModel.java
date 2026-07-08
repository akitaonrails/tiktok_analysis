package com.ss.android.ugc.aweme.experiment;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public final class IncentiveLauncherShortcutAddSettingsModel {

    @C09CT("config")
    public final List<IncentiveLauncherShortcutAddItem> config;

    public IncentiveLauncherShortcutAddSettingsModel() {
        this(new ArrayList());
    }

    public IncentiveLauncherShortcutAddSettingsModel(List<IncentiveLauncherShortcutAddItem> list) {
        this.config = list;
    }
}
