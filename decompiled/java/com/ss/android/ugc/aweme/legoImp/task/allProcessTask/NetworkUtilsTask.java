package com.ss.android.ugc.aweme.legoImp.task.allProcessTask;

import X.C0CCZ;
import X.C0VZ0;
import X.C2279461EKa;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.content.Context;
import com.ss.android.common.util.NetworkUtils;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public final class NetworkUtilsTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "NetworkUtilsTask";
    }

    @Override // X.C0CCZ
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.InterfaceC800080Va2
    public final int targetProcess() {
        return 16777215;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    @Override // X.InterfaceC800080Va2
    public final boolean meetTrigger() {
        return !((Boolean) C2279461EKa.LIZLLL.getValue()).booleanValue();
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.MAIN;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        NetworkUtils.getAppContext();
        NetworkUtils.getApiProcessHook();
        NetworkUtils.tryInitUserAgent();
    }
}
