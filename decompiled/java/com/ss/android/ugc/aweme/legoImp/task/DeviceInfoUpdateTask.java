package com.ss.android.ugc.aweme.legoImp.task;

import X.C09GA;
import X.C0CCZ;
import X.C0CF8;
import X.C0VU1;
import X.C0VZ0;
import X.C104100aN;
import X.C1300610jwx;
import X.C212350188e;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC799590VYf;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class DeviceInfoUpdateTask implements C0CCZ, InterfaceC799590VYf {
    public static final DeviceInfoUpdateTask LL = new DeviceInfoUpdateTask();

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "DeviceInfoUpdateTask";
    }

    @Override // X.InterfaceC799590VYf
    public final /* synthetic */ int level() {
        return 1;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.InterfaceC799590VYf
    public final /* synthetic */ int priority() {
        return 1;
    }

    @Override // X.C0CCZ
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.InterfaceC800080Va2
    public final int targetProcess() {
        return 1;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    @Override // X.InterfaceC799590VYf
    public final C0VU1 threadType() {
        return C0VU1.IO;
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BOOT_FINISH;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        C0CF8.LIZ.getClass();
        C09GA c09gaLIZIZ = C212350188e.LIZJ().LIZIZ(C104100aN.LIZ().getAppId());
        Bundle bundle = new Bundle();
        C1300610jwx c1300610jwx = C1300610jwx.LIZJ;
        c09gaLIZIZ.LJIILJJIL(new C1300610jwx[]{c1300610jwx}, bundle);
        Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).storeFloat("lowend_device_key", bundle.getFloat(c1300610jwx.LIZ));
    }
}
