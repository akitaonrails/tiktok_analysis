package com.google.android.play.core.appupdate;

import X.AbstractC2462309kr;
import X.C2461909kn;
import android.content.Context;
import android.content.IntentFilter;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends AbstractC2462309kr {
    public g(Context context) {
        super(new C2461909kn("AppUpdateListenerRegistry"), new IntentFilter("com.google.android.play.core.install.ACTION_INSTALL_STATUS"), context);
    }
}
