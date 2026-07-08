package com.bytedance.ies.ugc.statisticlogger.experiment;

import X.C01GW;
import X.C2210671Bfd;
import X.C452501pT;

/* JADX INFO: loaded from: classes35.dex */
public final class AppLogBlockListExp {
    public static final AppLogBlockListExp INSTANCE = new AppLogBlockListExp();
    public static final AppLogBlockListExpModel DEFAULT_GROUP = new AppLogBlockListExpModel(false, null, 3, null);
    public static final C01GW value$delegate = C452501pT.LIZIZ(new C2210671Bfd());

    public final AppLogBlockListExpModel getValue() {
        return (AppLogBlockListExpModel) value$delegate.getValue();
    }

    public final AppLogBlockListExpModel getDEFAULT_GROUP() {
        return DEFAULT_GROUP;
    }
}
