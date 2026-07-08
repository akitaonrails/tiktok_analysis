package com.ss.android.ugc.aweme.legoImp.task;

import X.C0CCZ;
import X.C0VRX;
import X.C0VZ0;
import X.C1593830rZt;
import X.C1595430rcT;
import X.C797820VRk;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.content.Context;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.friendstab.service.IFollowReadService;
import java.util.List;

/* JADX INFO: loaded from: classes25.dex */
public final class FriendsRedDotCleanupTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "FriendsRedDotCleanupTask";
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

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.APP_BACKGROUND;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        C1593830rZt.LIZIZ.LIZ();
        if (C1595430rcT.LIZIZ.LIZIZ().redDotLogic().LJIJJLI()) {
            C797820VRk.LIZIZ.LIZ();
        }
        C0VRX.LIZIZ.LIZ();
        IFollowReadService iFollowReadService = (IFollowReadService) PluggableExtentionKt.pluggableSpi$default(IFollowReadService.class, false, false, false, 14, null);
        if (iFollowReadService != null) {
            iFollowReadService.LIZ();
        }
    }
}
