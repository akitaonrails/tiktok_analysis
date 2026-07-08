package com.ss.android.ugc.aweme.shortvideo.ui.task;

import X.AbstractRunnableC21377818lM;
import X.C01GW;
import X.C1C7U;
import X.C452501pT;
import X.EnumC194317110p;
import X.InterfaceC1408530ml1;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.storage.impl.AVEffectStorage;
import com.ss.android.ugc.aweme.storage.impl.AVMusicResStorage;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS266S0000000_25;

/* JADX INFO: loaded from: classes26.dex */
public final class d extends AbstractRunnableC21377818lM implements InterfaceC1408530ml1 {
    public final C01GW LLILZLL;

    @Override // X.InterfaceC1408530ml1
    public final /* synthetic */ boolean LIZ() {
        return false;
    }

    @Override // X.InterfaceC1408530ml1
    public final /* synthetic */ boolean LIZIZ() {
        return false;
    }

    @Override // X.AbstractRunnableC21377818lM, java.lang.Runnable, X.InterfaceC1408530ml1
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("EffectAndMusicStorageCleanTask@c3a6.run");
        try {
            new AVEffectStorage().LIZIZ(true);
            new AVMusicResStorage().LIZIZ(true);
            ((Keva) this.LLILZLL.getValue()).storeLong("last_clean_time", System.currentTimeMillis());
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EffectAndMusicStorageCleanTask@c3a6.run");
    }

    public d() {
        LJ(AFwS266S0000000_25.get$arr$(174));
        this.LLILZLL = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(176));
    }

    @Override // X.InterfaceC1408530ml1
    public final EnumC194317110p LIZJ() {
        return EnumC194317110p.P1;
    }
}
