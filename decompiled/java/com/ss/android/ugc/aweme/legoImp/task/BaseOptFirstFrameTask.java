package com.ss.android.ugc.aweme.legoImp.task;

import X.C070Q;
import X.C0CBW;
import X.C0CCZ;
import X.C0VZ0;
import X.C104100aN;
import X.C1492110ovp;
import X.C18L3;
import X.C1BWL;
import X.C2206291BWp;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import Y.AObjectS81S0000000_34;
import android.content.Context;
import android.os.Looper;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.IAVInitializer;
import com.ss.android.ugc.aweme.services.PerformanceMainServiceImpl;
import java.util.List;

/* JADX INFO: loaded from: classes35.dex */
public class BaseOptFirstFrameTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "BaseOptFirstFrameTask";
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.C0CCZ
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ int targetProcess() {
        return C0VZ0.LIZ();
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        boolean zBooleanValue;
        if (C070Q.LIZ()) {
            C0CBW c0cbw = C0CBW.LIZ;
            zBooleanValue = C0CBW.LIZIZ() && C070Q.LIZ();
        } else {
            C2206291BWp.LIZ.getClass();
            zBooleanValue = ((Boolean) C2206291BWp.LJIL.getValue()).booleanValue();
        }
        return (EnumC799870VZh) C1492110ovp.LIZJ("BaseOptFirstFrameTask_use_bootfinish", new AObjectS81S0000000_34(1), new AObjectS81S0000000_34(2), zBooleanValue);
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        IAVInitializer iAVInitializer;
        if (Looper.myLooper() == null) {
            Looper.prepare();
        }
        PerformanceMainServiceImpl.createPerformanceMainServicebyMonsterPlugin(false).newAddWikiActivity();
        new C18L3(context);
        PerformanceMainServiceImpl.createPerformanceMainServicebyMonsterPlugin(false).preloadPushSettingsManager();
        ComplianceServiceProvider.LJI().LJIILJJIL();
        if (C104100aN.LIZ().isNewUser() && (iAVInitializer = (IAVInitializer) PluggableExtentionKt.pluggableSpi(IAVInitializer.class)) != null) {
            iAVInitializer.initAVEnv(C1BWL.LIZ());
        }
    }
}
