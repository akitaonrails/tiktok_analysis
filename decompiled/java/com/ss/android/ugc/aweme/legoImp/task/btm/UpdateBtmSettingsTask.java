package com.ss.android.ugc.aweme.legoImp.task.btm;

import X.C0CCZ;
import X.C0PEM;
import X.C0VZ0;
import X.C15WV;
import X.C15WW;
import X.C15WX;
import X.C23250099c;
import X.C260080AHe;
import X.C817503Hh;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.content.Context;
import com.bytedance.android.btm.api.BtmSDK;
import java.util.List;

/* JADX INFO: loaded from: classes32.dex */
public final class UpdateBtmSettingsTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "UpdateBtmSettingsTask";
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
        return EnumC799870VZh.BOOT_FINISH;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        long jLongValue = ((Number) C260080AHe.LIZ.getValue()).longValue();
        if (jLongValue > 0) {
            C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C15WV(jLongValue, this, null), 2);
        } else {
            BtmSDK.updateSDKSetting(C15WW.LIZLLL.LIZ());
            BtmSDK.updateHybridPatternSetting(C15WX.LIZLLL.LIZ());
        }
    }
}
