package com.ss.android.ugc.aweme.tools.draft.migratedraft.launch;

import X.C0CCZ;
import X.C0CRS;
import X.C0PEM;
import X.C0VZ0;
import X.C23250099c;
import X.C817503Hh;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.content.Context;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.performanceopt.api.IDowngradeApi;
import java.util.List;
import kotlin.jvm.internal.AwS548S0100000_4;

/* JADX INFO: loaded from: classes5.dex */
public final class MigrateDraftLegoTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "MigrateDraftLegoTask";
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
    public final int targetProcess() {
        return 1;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    public static void LIZ() {
        IUserService iUserService = (IUserService) PluggableExtentionKt.pluggableSpi$default(IUserService.class, false, false, false, 14, null);
        if (iUserService == null || iUserService.getCurrentUserID() == null) {
            return;
        }
        C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C0CRS(null), 2);
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BACKGROUND;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        IDowngradeApi iDowngradeApi = (IDowngradeApi) PluggableExtentionKt.pluggableSpi$default(IDowngradeApi.class, false, false, false, 14, null);
        if (iDowngradeApi != null) {
            iDowngradeApi.LJI(new AwS548S0100000_4(this, 295));
        }
    }
}
