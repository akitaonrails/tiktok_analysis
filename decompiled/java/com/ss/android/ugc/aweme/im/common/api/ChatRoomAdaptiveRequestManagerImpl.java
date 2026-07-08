package com.ss.android.ugc.aweme.im.common.api;

import X.C054G;
import X.C090F;
import X.C099F;
import X.C09A1;
import X.C0N35;
import X.C0PEM;
import X.C2296808zG;
import X.C2296908zH;
import X.C23250099c;
import X.C842710X4b;
import X.C859140Xn6;
import X.C859150Xn7;
import X.C859160Xn8;
import X.C859210XnD;
import X.C859500Xng;
import X.C883530YlL;
import X.InterfaceC1364105Vn;
import X.InterfaceC859170Xn9;
import com.ss.android.ugc.aweme.im.common.experiment.IMAdaptiveNetworkRequestExperiment;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes15.dex */
public final class ChatRoomAdaptiveRequestManagerImpl implements ChatRoomAdaptiveRequestManager {
    public final C859210XnD LIZIZ;
    public final Function0<Integer> LIZJ;
    public final Function0<Long> LIZLLL;
    public final InterfaceC859170Xn9 LJ;
    public volatile int LJFF;
    public volatile long LJI;
    public volatile long LJII;
    public final ConcurrentLinkedQueue<C859500Xng<?>> LJIIIIZZ;
    public final ConcurrentLinkedQueue<Function0<Unit>> LJIIIZ;
    public final AtomicBoolean LJIIJ;
    public final C054G LJIIJJI;

    public ChatRoomAdaptiveRequestManagerImpl() {
        this(null);
    }

    public final int LIZ() {
        long jLongValue = this.LIZLLL.invoke().longValue();
        if (jLongValue - this.LJI > this.LIZIZ.LIZJ) {
            this.LJFF = this.LIZJ.invoke().intValue();
            this.LJI = jLongValue;
        }
        return this.LJFF;
    }

    public final boolean LIZIZ() {
        return this.LJII > 0 && this.LIZLLL.invoke().longValue() - this.LJII < this.LIZIZ.LIZLLL;
    }

    public final void LIZJ() {
        if (!(this.LJIIIIZZ.isEmpty() && this.LJIIIZ.isEmpty()) && this.LJIIJ.compareAndSet(false, true)) {
            C23250099c.LIZLLL(this.LJIIJJI, null, null, new C859140Xn6(this, null), 3);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.common.api.ChatRoomAdaptiveRequestManager
    public final void LJLJJLL() {
        this.LJII = this.LIZLLL.invoke().longValue();
        this.LJ.start();
        if (this.LIZIZ.LJI) {
            C23250099c.LIZLLL(this.LJIIJJI, null, null, new C859150Xn7(this, null), 3);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.common.api.ChatRoomAdaptiveRequestManager
    public final void LJLJL() {
        this.LJII = -1L;
        C23250099c.LIZLLL(this.LJIIJJI, null, null, new C859160Xn8(this, null), 3);
        LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.im.common.api.ChatRoomAdaptiveRequestManager
    public final boolean LJLJLJ() {
        int iLIZ;
        return this.LIZIZ.LJFF && (iLIZ = LIZ()) != 0 && iLIZ < this.LIZIZ.LIZIZ && LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.im.common.api.ChatRoomAdaptiveRequestManager
    public final void LJLJLLL() {
        LIZJ();
    }

    public ChatRoomAdaptiveRequestManagerImpl(Object obj) {
        boolean z = IMAdaptiveNetworkRequestExperiment.LIZ().enableFeatureDelay;
        C859210XnD c859210XnD = new C859210XnD(IMAdaptiveNetworkRequestExperiment.LIZ().goodNetworkQualityThreshold, IMAdaptiveNetworkRequestExperiment.LIZ().goodDisableNetworkQualityThreshold, IMAdaptiveNetworkRequestExperiment.LIZ().enableSwitchOff, z, IMAdaptiveNetworkRequestExperiment.LIZ().networkLevelCacheExpiryTimeMs, IMAdaptiveNetworkRequestExperiment.LIZ().enterChatDelayTimeMs, IMAdaptiveNetworkRequestExperiment.LIZ().taskSparseIntervalMs);
        C883530YlL c883530YlL = new C883530YlL();
        C0N35 c0n35 = new C0N35();
        C842710X4b c842710X4b = new C842710X4b(0);
        this.LIZIZ = c859210XnD;
        this.LIZJ = c883530YlL;
        this.LIZLLL = c0n35;
        this.LJ = c842710X4b;
        this.LJI = -1L;
        this.LJII = -1L;
        this.LJIIIIZZ = new ConcurrentLinkedQueue<>();
        this.LJIIIZ = new ConcurrentLinkedQueue<>();
        this.LJIIJ = new AtomicBoolean(false);
        this.LJIIJJI = C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), C0PEM.LIZ));
    }

    @Override // com.ss.android.ugc.aweme.im.common.api.ChatRoomAdaptiveRequestManager
    public final void LJLL(Function0<Unit> function0) {
        int iLIZ;
        if (this.LIZIZ.LJI && LIZIZ() && (iLIZ = LIZ()) != 0 && iLIZ < this.LIZIZ.LIZ) {
            this.LJIIIZ.offer(function0);
        } else {
            function0.invoke();
        }
    }

    @Override // com.ss.android.ugc.aweme.im.common.api.ChatRoomAdaptiveRequestManager
    public final Object LJLLI(InterfaceC1364105Vn interfaceC1364105Vn, Function1 function1) {
        int iLIZ;
        if (this.LIZIZ.LJI && LIZIZ() && (iLIZ = LIZ()) != 0 && iLIZ < this.LIZIZ.LIZ) {
            C099F c099fLIZIZ = C090F.LIZIZ();
            this.LJIIIIZZ.offer(new C859500Xng<>(function1, c099fLIZIZ));
            return c099fLIZIZ.LJLIIIL(interfaceC1364105Vn);
        }
        return function1.invoke(interfaceC1364105Vn);
    }
}
