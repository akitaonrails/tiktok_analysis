package com.ss.android.ugc.aweme.startup;

import X.C1BX4;
import X.C1BXE;
import X.C1BXG;
import com.ss.android.ugc.aweme.application.IStartupEngine;

/* JADX INFO: loaded from: classes3.dex */
public class StartupEngineService implements IStartupEngine {
    @Override // com.ss.android.ugc.aweme.application.IStartupEngine
    public final void LIZ() {
    }

    @Override // com.ss.android.ugc.aweme.application.IStartupEngine
    public final void LIZJ() {
    }

    @Override // com.ss.android.ugc.aweme.application.IStartupEngine
    public final void LIZLLL() {
    }

    @Override // com.ss.android.ugc.aweme.application.IStartupEngine
    public final void LJ() {
    }

    @Override // com.ss.android.ugc.aweme.application.IStartupEngine
    public final void LJFF() {
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.1BXG] */
    @Override // com.ss.android.ugc.aweme.application.IStartupEngine
    public final C1BXG LIZIZ() {
        return new C1BXE<C1BX4>() { // from class: X.1BXG
            @Override // X.C1BXE
            public final InterfaceC2206491BXj LIZIZ() {
                return InterfaceC2206491BXj.LIZ;
            }

            @Override // X.C1BXE
            public final C2206531BXn LIZJ() {
                int i = C1BXJ.LIZ;
                return new C2206531BXn("ColdStartup", 4);
            }

            @Override // X.C1BXE
            public final Class<C1BX4> LIZ() {
                return C1BX4.class;
            }
        };
    }
}
