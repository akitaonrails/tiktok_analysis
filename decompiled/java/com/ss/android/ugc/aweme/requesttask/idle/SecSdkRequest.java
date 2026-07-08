package com.ss.android.ugc.aweme.requesttask.idle;

import X.C0CLW;
import X.C0CO3;
import X.C800010VZv;
import X.EnumC799980VZs;
import X.InterfaceC800130Va7;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.secapi.ISecApi;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class SecSdkRequest implements InterfaceC800130Va7 {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "SecSdkRequest";
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.InterfaceC308150C6b
    public final /* synthetic */ void run(Context context) {
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ int targetProcess() {
        return C800010VZv.LIZ();
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C800010VZv.LIZIZ(this);
    }

    @Override // X.InterfaceC800130Va7
    public final C0CO3 type() {
        try {
            if (C0CLW.LIZIZ.LIZ.getDisableDelaySecReport().booleanValue()) {
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return C0CO3.IDLE;
    }

    @Override // X.InterfaceC800130Va7
    public final void LJI(Context context, boolean z) {
        ((ISecApi) ServiceManager.get().getService(ISecApi.class)).setParams();
    }
}
