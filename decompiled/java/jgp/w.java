package jgp;

import X.C0FI2;
import X.C823050WQl;
import X.EnumC194317110p;
import X.InterfaceC1408530ml1;
import X.InterfaceC1658260tFo;
import Y.ARunnableS58S0300000_25;
import android.content.Context;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AFwS266S0000000_25;

/* JADX INFO: loaded from: classes26.dex */
public final class w extends g3a.a implements InterfaceC1408530ml1 {
    public final WeakReference<Context> LLIZLLLIL;

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
        Context context = this.LLIZLLLIL.get();
        if (context != null) {
            C823050WQl.LIZLLL().submit(new ARunnableS58S0300000_25(C0FI2.LJIJJ(), context, new InterfaceC1658260tFo() { // from class: X.0tFn
                @Override // X.InterfaceC1658260tFo
                public final void onComplete() {
                    this.LIZ.LJIIJ();
                }
            }, 9));
        }
    }

    @Override // X.InterfaceC1408530ml1
    public final EnumC194317110p LIZJ() {
        return EnumC194317110p.P2;
    }

    public w(Context context) {
        this.LLIZLLLIL = new WeakReference<>(context);
        LJ(AFwS266S0000000_25.get$arr$(458));
    }
}
