package com.ss.android.ugc.aweme.base.service;

import X.C10EU;
import X.C1605590rsr;
import X.C1605600rss;
import X.C1605610rst;
import X.EnumC1596540reG;
import X.InterfaceC1595240rcA;
import X.InterfaceC1891350zJl;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.service.ISkylightMafService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class SkylightMafServiceImpl implements ISkylightMafService {
    @Override // com.ss.android.ugc.aweme.service.ISkylightMafService
    public final void LJ() {
        if (C1605600rss.LIZ().enable) {
            C1605590rsr.LIZ.getClass();
            C1605610rst c1605610rstLIZIZ = C1605590rsr.LIZIZ();
            if (c1605610rstLIZIZ.LIZLLL) {
                return;
            }
            C1605590rsr.LIZJ();
            c1605610rstLIZIZ.LIZLLL = true;
            C1605590rsr.LIZJ.storeInt("interact_count", C1605590rsr.LIZJ.getInt("interact_count", 0) + 1);
        }
    }

    @Override // com.ss.android.ugc.aweme.service.ISkylightMafService
    public final boolean LIZ(int i) {
        if (!C1605600rss.LIZ().enable) {
            return false;
        }
        if (i != 3 && i != 0) {
            return false;
        }
        C1605590rsr.LIZ.getClass();
        return C1605590rsr.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.service.ISkylightMafService
    public final boolean LIZIZ(long j) {
        if (!C1605600rss.LIZ().enable) {
            return false;
        }
        if (j != EnumC1596540reG.FRIENDS_TAB.getValue() && j != EnumC1596540reG.INBOX_TAB.getValue()) {
            return false;
        }
        C1605590rsr.LIZ.getClass();
        return C1605590rsr.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.service.ISkylightMafService
    public final void LIZJ(PowerCell<?> powerCell) {
        InterfaceC1595240rcA interfaceC1595240rcA;
        if (!C1605600rss.LIZ().enable) {
            return;
        }
        InterfaceC1891350zJl item = null;
        if (powerCell != null) {
            item = powerCell.getItem();
        }
        if ((item instanceof InterfaceC1595240rcA) && (interfaceC1595240rcA = (InterfaceC1595240rcA) item) != null && Intrinsics.LJFF(interfaceC1595240rcA.getCellType(), "story") && C10EU.LJIILJJIL(interfaceC1595240rcA.getUser())) {
            C1605590rsr.LIZ.getClass();
            C1605590rsr.LIZJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.service.ISkylightMafService
    public final boolean LIZLLL(User user) {
        return C10EU.LJIILJJIL(user);
    }
}
