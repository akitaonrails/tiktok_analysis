package com.ss.android.ugc.aweme.task;

import X.C01GW;
import X.C0CCZ;
import X.C0VZ0;
import X.C1392350mKv;
import X.C452501pT;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public abstract class ExtendedPreloadTask implements C0CCZ {
    public final C01GW LL = C452501pT.LIZIZ(new C1392350mKv(this));

    public abstract String LIZ();

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.C0CCZ
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BOOT_FINISH;
    }
}
