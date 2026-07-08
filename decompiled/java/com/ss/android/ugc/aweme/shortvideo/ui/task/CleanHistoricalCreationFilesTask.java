package com.ss.android.ugc.aweme.shortvideo.ui.task;

import X.AbstractRunnableC21377818lM;
import X.C01GW;
import X.C0CHQ;
import X.C1C7U;
import X.C263100ASu;
import X.C452501pT;
import X.EnumC194317110p;
import X.InterfaceC1408530ml1;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.storage.impl.AVCreativeDraftStorage;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS266S0000000_25;

/* JADX INFO: loaded from: classes26.dex */
public final class CleanHistoricalCreationFilesTask extends AbstractRunnableC21377818lM implements InterfaceC1408530ml1, GenericLifecycleObserver {
    public final CreativeInfo LLILZLL;
    public final boolean LLIZ;
    public final C01GW LLIZLLLIL;

    @Override // X.InterfaceC1408530ml1
    public final /* synthetic */ boolean LIZ() {
        return false;
    }

    @Override // X.InterfaceC1408530ml1
    public final /* synthetic */ boolean LIZIZ() {
        return false;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // X.AbstractRunnableC21377818lM, java.lang.Runnable, X.InterfaceC1408530ml1
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("CleanHistoricalCreationFilesTask@6cc.run");
        try {
            LJIIIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CleanHistoricalCreationFilesTask@6cc.run");
    }

    public final void LJIIIZ() {
        if (System.currentTimeMillis() - ((Keva) this.LLIZLLLIL.getValue()).getLong("last_clean_time", 0L) >= ((Number) C263100ASu.LIZ.getValue()).longValue() || this.LLIZ) {
            ((Keva) this.LLIZLLLIL.getValue()).storeLong("last_clean_time", System.currentTimeMillis());
            C0CHQ.LIZ().LJJIIJZLJL().getAllowListService().LIZLLL(C0CHQ.LIZ().LJJIIJZLJL().getPathService().LJIIZILJ(this.LLILZLL));
            new AVCreativeDraftStorage().LJII(true);
        }
    }

    @Override // X.InterfaceC1408530ml1
    public final EnumC194317110p LIZJ() {
        return EnumC194317110p.P1;
    }

    public CleanHistoricalCreationFilesTask(CreativeInfo creativeInfo, Lifecycle lifecycle, boolean z) {
        this.LLILZLL = creativeInfo;
        this.LLIZ = z;
        LJ(AFwS266S0000000_25.get$arr$(173));
        lifecycle.addObserver(this);
        this.LLIZLLLIL = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(175));
    }
}
