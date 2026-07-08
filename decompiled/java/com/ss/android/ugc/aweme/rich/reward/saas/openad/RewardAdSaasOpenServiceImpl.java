package com.ss.android.ugc.aweme.rich.reward.saas.openad;

import X.AbstractC1033670d0P;
import X.C098200Yq;
import X.C1031810cxP;
import X.C1033650d0N;
import X.C1033680d0Q;
import X.C1033690d0R;
import X.C189200o6;
import X.C428270Gqn;
import X.InterfaceC1031500cwu;
import X.InterfaceC1032100cxs;
import X.InterfaceC1032940czE;
import android.content.Context;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IRewardAdAdapterFactory;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.rich.reward.saas.openad.RewardAdSaasOpenServiceImpl;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class RewardAdSaasOpenServiceImpl implements IRewardAdSaasOpenService {
    public final AtomicReference<InterfaceC1031500cwu> LIZ = new AtomicReference<>();
    public final ConcurrentHashMap<String, InterfaceC1031500cwu> LIZIZ = new ConcurrentHashMap<>();

    @Override // com.ss.android.ugc.aweme.rich.reward.saas.openad.IRewardAdSaasOpenService
    public final AbstractC1033670d0P LIZ(C1033650d0N c1033650d0N) {
        Object c098200Yq;
        IRewardAdAdapterFactory iRewardAdAdapterFactory;
        final AtomicReference atomicReference = new AtomicReference();
        try {
            iRewardAdAdapterFactory = (IRewardAdAdapterFactory) PluggableExtentionKt.pluggableSpi$default(IRewardAdAdapterFactory.class, false, false, false, 14, null);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (iRewardAdAdapterFactory == null) {
            return new C1033680d0Q("IRewardAdAdapterFactory is null");
        }
        C1031810cxP c1031810cxP = c1033650d0N.LIZ;
        final InterfaceC1032940czE interfaceC1032940czE = c1033650d0N.LIZIZ;
        final String str = c1033650d0N.LJII;
        InterfaceC1031500cwu interfaceC1031500cwuLIZ = iRewardAdAdapterFactory.LIZ(c1031810cxP, new InterfaceC1032940czE(this, str, atomicReference) { // from class: X.0cz5
            public final /* synthetic */ InterfaceC1032940czE LL;
            public final /* synthetic */ RewardAdSaasOpenServiceImpl LLILLL;
            public final /* synthetic */ String LLILZ;
            public final /* synthetic */ AtomicReference<InterfaceC1031500cwu> LLILZIL;

            @Override // X.InterfaceC1032940czE
            public final void distributeRewards() {
                this.LL.distributeRewards();
            }

            @Override // X.InterfaceC1032940czE
            public final void onRewardAdDataReady() {
                this.LL.onRewardAdDataReady();
            }

            @Override // X.InterfaceC1032940czE
            public final void onRewardAdPause(Integer num) {
                this.LL.onRewardAdPause(num);
            }

            @Override // X.InterfaceC1032940czE
            public final void onRewardAdResume(Integer num) {
                this.LL.onRewardAdResume(num);
            }

            @Override // X.InterfaceC1032940czE
            public final void onRewardAdShow(Integer num) {
                this.LL.onRewardAdShow(num);
            }

            @Override // X.InterfaceC1032940czE
            public final void onRewardCountdownFinished() {
                this.LL.onRewardCountdownFinished();
            }

            @Override // X.InterfaceC1032940czE
            public final void skipRewardAdWatchDuration(int i) {
                this.LL.skipRewardAdWatchDuration(i);
            }

            @Override // X.InterfaceC1032940czE
            public final void updateBubbleTip(String str2) {
                this.LL.updateBubbleTip(str2);
            }

            @Override // X.InterfaceC1032940czE
            public final void videoPlayStateDidChange(EnumC1031610cx5 enumC1031610cx5, int i) {
                this.LL.videoPlayStateDidChange(enumC1031610cx5, i);
            }

            @Override // X.InterfaceC1032940czE
            public final void viewDidLoad(ViewGroup viewGroup, Fragment fragment) {
                this.LL.viewDidLoad(viewGroup, fragment);
            }

            @Override // X.InterfaceC1032940czE
            public final void willExit(Context context) {
                this.LL.willExit(context);
            }

            @Override // X.InterfaceC1032940czE
            public final void didExit(C1033020czM c1033020czM) {
                try {
                    this.LLILLJJLI.didExit(c1033020czM);
                    this.LLILLL.LIZIZ(this.LLILZ, this.LLILZIL.get());
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    this.LLILLL.LIZIZ(this.LLILZ, this.LLILZIL.get());
                    throw th2;
                }
            }

            {
                this.LLILLL = this;
                this.LLILZ = str;
                this.LLILZIL = atomicReference;
                this.LL = this.LLILLJJLI;
            }
        }, str, new C428270Gqn(0));
        atomicReference.set(interfaceC1031500cwuLIZ);
        String str2 = c1033650d0N.LJII;
        if (str2 != null && str2.length() != 0) {
            this.LIZIZ.put(str2, interfaceC1031500cwuLIZ);
        } else {
            this.LIZ.set(interfaceC1031500cwuLIZ);
        }
        InterfaceC1032100cxs interfaceC1032100cxsLIZJ = interfaceC1031500cwuLIZ.LIZJ();
        if (interfaceC1032100cxsLIZJ == null) {
            LIZIZ(c1033650d0N.LJII, interfaceC1031500cwuLIZ);
            return new C1033680d0Q("rewardADManager is null");
        }
        interfaceC1032100cxsLIZJ.start(c1033650d0N.LIZJ, c1033650d0N.LIZLLL, c1033650d0N.LJ, c1033650d0N.LJFF, c1033650d0N.LJI);
        c098200Yq = C1033690d0R.LIZ;
        C189200o6.m2constructorimpl(c098200Yq);
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            InterfaceC1031500cwu interfaceC1031500cwu = (InterfaceC1031500cwu) atomicReference.get();
            if (interfaceC1031500cwu != null) {
                LIZIZ(c1033650d0N.LJII, interfaceC1031500cwu);
            }
            String message = thM5exceptionOrNullimpl.getMessage();
            if (message == null) {
                message = "rewardADManager start failed";
            }
            c098200Yq = new C1033680d0Q(message);
        }
        return (AbstractC1033670d0P) c098200Yq;
    }

    public final void LIZIZ(String str, InterfaceC1031500cwu interfaceC1031500cwu) {
        if (str != null && str.length() != 0) {
            if (interfaceC1031500cwu == null) {
                this.LIZIZ.remove(str);
                return;
            } else {
                if (!Intrinsics.LJFF(this.LIZIZ.get(str), interfaceC1031500cwu)) {
                    return;
                }
                this.LIZIZ.remove(str);
                return;
            }
        }
        if (interfaceC1031500cwu == null) {
            this.LIZ.set(null);
            return;
        }
        AtomicReference<InterfaceC1031500cwu> atomicReference = this.LIZ;
        while (!atomicReference.compareAndSet(interfaceC1031500cwu, null) && atomicReference.get() == interfaceC1031500cwu) {
        }
    }
}
