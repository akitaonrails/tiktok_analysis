package com.ss.android.ugc.aweme.perf;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C09QK;
import X.C1569770qx5;
import X.C1569790qx7;
import X.C1720106oR;
import X.C2187451AjH;
import X.C2188561Al4;
import X.C452501pT;
import X.C476250Ilz;
import X.InterfaceC1569780qx6;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class FollowingMemoryHandlerAssem extends AbstractC738140SxQ {
    public static final CopyOnWriteArrayList<InterfaceC1569780qx6> LLILLJJLI = new CopyOnWriteArrayList<>();
    public final C01GW LL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 831));

    @Override // X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI("FollowingMemoryHandlerAssem", "FollowingMemoryHandlerAssem onCreate");
        C2188561Al4 c2188561Al4 = C476250Ilz.LIZ;
        C1569770qx5 c1569770qx5 = (C1569770qx5) this.LL.getValue();
        c2188561Al4.getClass();
        C2188561Al4.LJII(c1569770qx5);
    }

    @Override // X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI("FollowingMemoryHandlerAssem", "FollowingMemoryHandlerAssem onDestroy");
        if (((FollowingMemoryOptimizeConfig) C1569790qx7.LIZIZ.getValue()).enable) {
            CopyOnWriteArrayList<InterfaceC1569780qx6> copyOnWriteArrayList = LLILLJJLI;
            if (!copyOnWriteArrayList.isEmpty()) {
                copyOnWriteArrayList.clear();
            }
        }
        C2188561Al4 c2188561Al4 = C476250Ilz.LIZ;
        C1569770qx5 c1569770qx5 = (C1569770qx5) this.LL.getValue();
        c2188561Al4.getClass();
        C09QK.LIZ(c1569770qx5);
    }
}
