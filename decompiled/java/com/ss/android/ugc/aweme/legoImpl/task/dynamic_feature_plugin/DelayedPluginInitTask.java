package com.ss.android.ugc.aweme.legoImpl.task.dynamic_feature_plugin;

import X.C1514430pVp;
import X.EnumC799870VZh;
import android.content.Context;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.journey.INewUserJourneyService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class DelayedPluginInitTask extends AbstractPluginInitTask {
    public final Keva LLILLL = Keva.getRepo("RealtimeDecision");

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "DelayedPluginInitTask";
    }

    @Override // X.InterfaceC800080Va2
    public final int targetProcess() {
        return 1;
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        IAccountService iAccountService;
        AccountUserService accountUserServiceLJIIJ;
        if (this.LLILLL.getBoolean("should_terminate", false) || this.LLILLL.getString("forecast_group", "").length() <= 0) {
            IAccountService iAccountService2 = (IAccountService) PluggableExtentionKt.pluggableSpi$default(IAccountService.class, false, false, false, 14, null);
            if (!Intrinsics.LJFF(iAccountService2 != null ? iAccountService2.getStoreRegionUpperCase() : null, "BR") || (iAccountService = (IAccountService) PluggableExtentionKt.pluggableSpi$default(IAccountService.class, false, false, false, 14, null)) == null || (accountUserServiceLJIIJ = iAccountService.LJIIJ()) == null || accountUserServiceLJIIJ.isLogin()) {
                return EnumC799870VZh.BOOT_FINISH;
            }
        }
        return EnumC799870VZh.SPARSE;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        if (C1514430pVp.LIZLLL().booleanValue()) {
            return;
        }
        LIZ(true);
        ((INewUserJourneyService) ServiceManager.get().getService(INewUserJourneyService.class)).LJIIJ();
    }
}
