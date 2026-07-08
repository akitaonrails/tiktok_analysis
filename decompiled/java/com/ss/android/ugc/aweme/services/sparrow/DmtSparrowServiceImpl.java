package com.ss.android.ugc.aweme.services.sparrow;

import X.C01GW;
import X.C0MZ6;
import X.C0MZ7;
import X.C0MZ8;
import X.C452501pT;
import X.InterfaceC570360MYo;
import kotlin.jvm.internal.AFwS194S0000000_8;

/* JADX INFO: loaded from: classes9.dex */
public final class DmtSparrowServiceImpl implements C0MZ6 {
    public final C01GW frameVerificationService$delegate = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(115));
    public final C01GW publishXService$delegate = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(116));
    public final C01GW draftMonitorService$delegate = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(114));

    @Override // X.C0MZ6
    public InterfaceC570360MYo getDraftMonitorService() {
        return (InterfaceC570360MYo) this.draftMonitorService$delegate.getValue();
    }

    @Override // X.C0MZ6
    public C0MZ8 getFrameVerificationService() {
        return (C0MZ8) this.frameVerificationService$delegate.getValue();
    }

    @Override // X.C0MZ6
    public C0MZ7 getPublishXService() {
        return (C0MZ7) this.publishXService$delegate.getValue();
    }
}
