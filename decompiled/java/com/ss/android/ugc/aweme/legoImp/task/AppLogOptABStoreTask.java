package com.ss.android.ugc.aweme.legoImp.task;

import X.C08JS;
import X.C0CCZ;
import X.C0VZ0;
import X.C1488205s8;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.content.Context;
import com.ss.android.ugc.aweme.experiment.ApplogDegradeABData;
import com.ss.android.ugc.aweme.experiment.ApplogDegradeInfoList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class AppLogOptABStoreTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "AppLogOptABStoreTask";
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
        C1488205s8 c1488205s8 = C1488205s8.LIZJ;
        c1488205s8.getClass();
        ApplogDegradeABData applogDegradeABData = (ApplogDegradeABData) C1488205s8.LIZLLL.getValue();
        if (applogDegradeABData == null) {
            c1488205s8.LIZ().storeBoolean(C1488205s8.LJ, false);
            c1488205s8.LIZ().storeString(C1488205s8.LJFF, "");
            return;
        }
        c1488205s8.LIZ().storeBoolean(C1488205s8.LJ, applogDegradeABData.enable);
        List<ApplogDegradeInfoList> list = applogDegradeABData.degradeInfoList;
        if (list != null && !list.isEmpty()) {
            c1488205s8.LIZ().storeString(C1488205s8.LJFF, C08JS.LIZLLL(list));
        } else {
            c1488205s8.LIZ().storeString(C1488205s8.LJFF, "");
        }
    }
}
