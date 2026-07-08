package com.ss.android.ugc.aweme.shortvideo.ui.task;

import X.C1661800tLW;
import X.C19EG;
import X.EnumC194317110p;
import X.InterfaceC1408530ml1;
import Y.ARunnableS125S0100000_25;
import com.bytedance.scene.Scene;
import g3a.a;
import kotlin.jvm.internal.AFwS266S0000000_25;

/* JADX INFO: loaded from: classes26.dex */
public final class g extends a implements InterfaceC1408530ml1 {
    public final C19EG LLIZLLLIL;
    public final Scene LLJ;

    @Override // X.InterfaceC1408530ml1
    public final boolean LIZ() {
        return true;
    }

    @Override // X.InterfaceC1408530ml1
    public final /* synthetic */ boolean LIZIZ() {
        return false;
    }

    @Override // X.AbstractRunnableC21377818lM
    public final void LJII() {
        this.LLIZLLLIL.runOnUiThread(new ARunnableS125S0100000_25(this, 44));
    }

    @Override // X.InterfaceC1408530ml1
    public final EnumC194317110p LIZJ() {
        int iLIZ = C1661800tLW.LIZ();
        return iLIZ != 1 ? iLIZ != 2 ? EnumC194317110p.P1 : EnumC194317110p.P3 : EnumC194317110p.P1;
    }

    public g(C19EG c19eg, Scene scene) {
        this.LLIZLLLIL = c19eg;
        this.LLJ = scene;
        LJ(AFwS266S0000000_25.get$arr$(175));
    }
}
