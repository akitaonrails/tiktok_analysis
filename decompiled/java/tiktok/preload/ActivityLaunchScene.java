package tiktok.preload;

import X.C1576580r84;
import android.content.Intent;

/* JADX INFO: loaded from: classes25.dex */
public abstract class ActivityLaunchScene<EXTRA> extends C1576580r84<EXTRA> {
    public Intent LIZIZ;

    public abstract void LIZLLL();

    @Override // X.C1576580r84
    public final EXTRA LIZ() {
        if (this.LIZIZ == null) {
            return null;
        }
        LIZLLL();
        return null;
    }

    @Override // X.C1576580r84
    public final /* bridge */ /* synthetic */ Object LIZIZ() {
        return this.LIZIZ;
    }
}
