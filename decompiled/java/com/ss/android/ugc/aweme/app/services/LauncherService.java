package com.ss.android.ugc.aweme.app.services;

import X.C13LE;
import X.C19719912Dl;
import X.C1BX2;
import com.ss.android.ugc.aweme.main.LauncherAssem;
import com.ss.android.ugc.aweme.router.RouterOpen;

/* JADX INFO: loaded from: classes33.dex */
public final class LauncherService implements ILauncherService {
    @Override // com.ss.android.ugc.aweme.app.services.ILauncherService
    public final C19719912Dl LIZJ() {
        return C13LE.LIZ(LauncherAssem.class);
    }

    @Override // com.ss.android.ugc.aweme.app.services.ILauncherService
    public final RouterOpen LIZ() {
        return new RouterOpen();
    }

    @Override // com.ss.android.ugc.aweme.app.services.ILauncherService
    public final void LIZIZ() {
        new Runnable() { // from class: X.17tN
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("NewUserSceneEnsureTaskRunnable@22a.run");
                try {
                    C1150504el.LIZ().LIZLLL("method_newuser_scene_ensure_duration", false);
                    new C1BX2(3).run();
                    C1150504el.LIZ().LJI("method_newuser_scene_ensure_duration", false);
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("NewUserSceneEnsureTaskRunnable@22a.run");
            }
        }.run();
    }

    @Override // com.ss.android.ugc.aweme.app.services.ILauncherService
    public final void LIZLLL() {
        new C1BX2(2).run();
    }
}
