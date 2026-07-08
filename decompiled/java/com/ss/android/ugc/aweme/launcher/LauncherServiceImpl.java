package com.ss.android.ugc.aweme.launcher;

import X.C04TD;

/* JADX INFO: loaded from: classes3.dex */
public class LauncherServiceImpl implements ILauncherService {
    @Override // com.ss.android.ugc.aweme.launcher.ILauncherService
    public final void LIZ() {
    }

    @Override // com.ss.android.ugc.aweme.launcher.ILauncherService
    public final void LIZIZ() {
    }

    @Override // com.ss.android.ugc.aweme.launcher.ILauncherService
    public final void LIZJ() {
    }

    @Override // com.ss.android.ugc.aweme.launcher.ILauncherService
    public final void isDebug() {
    }

    public static ILauncherService LIZLLL() {
        Object objLIZ = C04TD.LIZ(ILauncherService.class, false);
        if (objLIZ != null) {
            return (ILauncherService) objLIZ;
        }
        if (C04TD.C1 == null) {
            synchronized (ILauncherService.class) {
                if (C04TD.C1 == null) {
                    C04TD.C1 = new LauncherServiceImpl();
                }
            }
        }
        return C04TD.C1;
    }
}
