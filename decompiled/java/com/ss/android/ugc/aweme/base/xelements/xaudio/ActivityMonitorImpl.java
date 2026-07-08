package com.ss.android.ugc.aweme.base.xelements.xaudio;

import X.C01GW;
import X.C0WZX;
import X.C1701330uNH;
import X.C18ZN;
import X.C1ARM;
import X.C1ARU;
import X.C1ARY;
import X.C2204961BRm;
import X.C452501pT;
import X.C786410Ut5;
import X.C844470XAv;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AFwS279S0000000_33;

/* JADX INFO: loaded from: classes34.dex */
public final class ActivityMonitorImpl implements C1ARM, C18ZN {
    public final C01GW mListeners$delegate = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(80));

    private final C1ARU<C1ARY> getMListeners() {
        return (C1ARU) this.mListeners$delegate.getValue();
    }

    @Override // X.C1ARM
    public void pullAppToForeground() {
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        ActivityManager activityManager = (ActivityManager) C786410Ut5.H2(contextLIZ, "activity");
        Activity topActivity = ActivityStack.getTopActivity();
        if (topActivity != null) {
            activityManager.moveTaskToFront(topActivity.getTaskId(), 0);
            return;
        }
        Intent launchIntentForPackage = contextLIZ.getPackageManager().getLaunchIntentForPackage(contextLIZ.getPackageName());
        if (launchIntentForPackage != null) {
            RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(contextLIZ, launchIntentForPackage, "Context_startActivity_1");
            C1701330uNH.LIZ(launchIntentForPackage, contextLIZ);
            C2204961BRm.LJJJJJL(contextLIZ, launchIntentForPackage, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOipcJqAxDfy9whPETbieeHRUtLy+VumgyNGexj3", null));
        }
    }

    public ActivityMonitorImpl() {
        ActivityStack.addAppBackGroundListener(this);
    }

    @Override // X.C1ARM
    public boolean isAppBackground() {
        return ActivityStack.isAppBackGround();
    }

    @Override // X.C18ZN
    public void onAppBackground() {
        getMListeners().LIZIZ(AFwS279S0000000_33.get$arr$(30));
    }

    @Override // X.C18ZN
    public void onAppForeground() {
        getMListeners().LIZIZ(AFwS279S0000000_33.get$arr$(31));
    }

    @Override // X.C1ARM
    public void addAppVisibilityChangeListener(C1ARY c1ary) {
        getMListeners().LIZ(c1ary);
    }

    @Override // X.C1ARM
    public void removeAppVisibilityChangeListener(C1ARY c1ary) {
        getMListeners().LIZ.remove(c1ary);
    }
}
