package com.ss.android.ugc.aweme.legoImpl.task;

import X.C0CCZ;
import X.C0VZ0;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC586170Myt;
import android.content.Context;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.experiment.ColdBootTasksDegradeExperiment;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.notice.api.ab.MultiAccountPopupPanelExp;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public final class AccountRegisterTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "AccountRegisterTask";
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
        return ColdBootTasksDegradeExperiment.LIZ().accountRegisterTask ? EnumC799870VZh.BOOT_FINISH : EnumC799870VZh.BACKGROUND;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIILL(new InterfaceC586170Myt() { // from class: X.0WVU
            @Override // X.InterfaceC586170Myt
            public final void onAccountResult(int i, boolean z, int i2, User user) {
                if (!z) {
                    return;
                }
                if (i != 1 && i != 2) {
                    return;
                }
                C2203431BLp.LIZIZ.LJ("account_change");
                MultiAccountPopupPanelExp.Meta meta = MultiAccountPopupPanelExp.LIZIZ;
                if (meta == null || meta.expValue <= 0) {
                    return;
                }
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1568106Bz(i, null), 3);
            }
        });
    }
}
