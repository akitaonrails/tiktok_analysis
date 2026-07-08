package com.ss.android.ugc.aweme.shortvideo.ui.task;

import X.AbstractC686880Qww;
import X.AbstractRunnableC21377818lM;
import X.C0ASH;
import X.C0ASZ;
import X.C0C64;
import X.C0MNJ;
import X.C1661800tLW;
import X.C1C7U;
import X.C1D7R;
import X.C2102208Lk;
import X.C2215011Bmd;
import X.C278290AvT;
import X.C280590AzB;
import X.C297760Blm;
import X.C297780Blo;
import X.C300110BpZ;
import X.C524870KiD;
import X.C529790Kq9;
import X.C686940Qx2;
import X.EnumC194317110p;
import X.InterfaceC1408530ml1;
import X.InterfaceC530790Krl;
import android.content.Context;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.AwS426S0200000_25;

/* JADX INFO: loaded from: classes26.dex */
public final class CacheChooseMediaViewHolderTask extends AbstractRunnableC21377818lM implements InterfaceC1408530ml1, GenericLifecycleObserver {
    public static final /* synthetic */ int LLJ = 0;
    public final Context LLILZLL;
    public final Lifecycle LLIZ;
    public final InterfaceC530790Krl LLIZLLLIL;

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
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        C529790Kq9.LIZ.clear();
    }

    @Override // X.AbstractRunnableC21377818lM, java.lang.Runnable, X.InterfaceC1408530ml1
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("CacheChooseMediaViewHolderTask@2835.run");
        try {
            LJIIIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CacheChooseMediaViewHolderTask@2835.run");
    }

    @Override // X.InterfaceC1408530ml1
    public final EnumC194317110p LIZJ() {
        if (C278290AvT.LIZ()) {
            return EnumC194317110p.P3;
        }
        int iLIZ = C1661800tLW.LIZ();
        return iLIZ != 1 ? iLIZ != 2 ? EnumC194317110p.P1 : EnumC194317110p.P3 : EnumC194317110p.P1;
    }

    public final void LJIIIZ() {
        InterfaceC530790Krl interfaceC530790Krl;
        C0MNJ.LIZ();
        int iLJIJ = 0;
        if (((Boolean) C280590AzB.LIZ.getValue()).booleanValue()) {
            float f = C0ASH.LIZ;
            boolean z = C2215011Bmd.LIZ() >= C0ASH.LIZIZ;
            boolean z2 = C1D7R.LIZ().LJ("publish_type_upload_rate") >= C0ASH.LIZ;
            if (z && z2) {
                iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, 0, "creative_tools_mt_album_optimization_v2_cache_viewholder", true);
            }
        } else {
            iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, 0, "creative_tools_mt_album_optimization_v2_cache_viewholder", true);
        }
        if (iLJIJ != 0) {
            if (C297780Blo.LIZ()) {
                C529790Kq9.LIZ(R.layout.csv, iLJIJ, this.LLILZLL);
            } else {
                C529790Kq9.LIZ(R.layout.csu, iLJIJ, this.LLILZLL);
            }
        }
        if (this.LLIZ.getCurrentState() == Lifecycle.State.DESTROYED) {
            return;
        }
        if (!C524870KiD.LIZ() || (interfaceC530790Krl = this.LLIZLLLIL) == null) {
            if (C297760Blm.LIZ() && C300110BpZ.LIZ()) {
                C0MNJ.LIZIZ(C297780Blo.LIZ());
                return;
            }
            return;
        }
        AbstractC686880Qww abstractC686880Qww = (AbstractC686880Qww) interfaceC530790Krl.getInflater();
        C686940Qx2 c686940Qx2 = new C686940Qx2(abstractC686880Qww);
        c686940Qx2.LIZ(R.layout.equ, 1);
        c686940Qx2.LIZ(R.layout.i8o, 2);
        c686940Qx2.LIZ(R.layout.css, 1);
        c686940Qx2.LIZ(R.layout.i_6, 3);
        c686940Qx2.LIZ(R.layout.d6w, 1);
        if (!((Boolean) C0ASZ.LIZ.getValue()).booleanValue()) {
            C686940Qx2.LIZIZ(c686940Qx2);
            return;
        }
        c686940Qx2.LIZ(R.layout.csu, 1);
        C686940Qx2.LIZIZ(c686940Qx2);
        C2102208Lk.LIZ(null, new AwS426S0200000_25(abstractC686880Qww, this, 62), 31);
    }

    public CacheChooseMediaViewHolderTask(Context context, Lifecycle lifecycle, InterfaceC530790Krl interfaceC530790Krl) {
        this.LLILZLL = context;
        this.LLIZ = lifecycle;
        this.LLIZLLLIL = interfaceC530790Krl;
        LJ(AFwS266S0000000_25.get$arr$(172));
        lifecycle.addObserver(this);
    }
}
