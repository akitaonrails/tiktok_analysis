package com.ss.android.ugc.aweme.upvote.detail.notice;

import X.C0XQ7;
import X.C1357810lRD;
import X.C1357870lRJ;
import X.C1359430lTp;
import X.C1359520lTy;
import X.C13LP;
import X.C1554610qYd;
import X.C1697810uHb;
import X.InterfaceC586170Myt;
import android.util.LruCache;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.bytedance.provider.impl.GScope;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.upvote.callback.IRepostInteractionSyncProtocol;
import com.ss.android.ugc.aweme.upvote.detail.notice.RepostQuickActionLikeRegistry;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes22.dex */
public final class RepostQuickActionLikeRegistry implements IRepostInteractionSyncProtocol {
    public static final RepostQuickActionLikeRegistry LL = new RepostQuickActionLikeRegistry();
    public static final LruCache<String, C1359430lTp> LLILLJJLI = new LruCache<>(200);
    public static final Set<Function2<String, C1359430lTp, Unit>> LLILLL = new LinkedHashSet();
    public static volatile boolean LLILZ;

    public final synchronized void LIZJ() {
        Lifecycle lifecycle;
        if (LLILZ) {
            return;
        }
        LLILZ = true;
        final GScope gScope = GScope.LL;
        LifecycleOwner lifecycleOwner = ProcessLifecycleOwner.Companion.get();
        C1554610qYd.LIZJ(gScope, IRepostInteractionSyncProtocol.class, C1697810uHb.LJIILJJIL(this));
        if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.upvote.detail.notice.RepostQuickActionLikeRegistry$ensureRegistered$$inlined$registerProtocol$1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        C1554610qYd.LIZLLL(gScope, IRepostInteractionSyncProtocol.class, this);
                    }
                }
            });
        }
        C0XQ7.LJ();
        C0XQ7.LIZ.LJIILL(new InterfaceC586170Myt() { // from class: X.0lTt
            @Override // X.InterfaceC586170Myt
            public final void onAccountResult(int i, boolean z, int i2, User user) {
                if (z) {
                    synchronized (RepostQuickActionLikeRegistry.LL) {
                        try {
                            RepostQuickActionLikeRegistry.LLILLJJLI.evictAll();
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                }
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.upvote.callback.IRepostInteractionSyncProtocol
    public final void PO(C1357870lRJ c1357870lRJ) {
    }

    @Override // com.ss.android.ugc.aweme.upvote.callback.IRepostInteractionSyncProtocol
    public final void Zc1(C1357810lRD c1357810lRD) {
    }

    @Override // com.ss.android.ugc.aweme.upvote.callback.IRepostInteractionSyncProtocol
    public final void E22(C1359520lTy c1359520lTy) {
        String str = c1359520lTy.LIZIZ;
        boolean z = true;
        if (str != null && str.length() != 0) {
            boolean z2 = c1359520lTy.LIZJ;
            int i = c1359520lTy.LIZLLL;
            if (i < 0) {
                i = 0;
            }
            C1359430lTp c1359430lTp = new C1359430lTp(z2, i);
            synchronized (this) {
                try {
                    LruCache<String, C1359430lTp> lruCache = LLILLJJLI;
                    C1359430lTp c1359430lTp2 = lruCache.get(str);
                    lruCache.put(str, c1359430lTp);
                    if (c1359430lTp2 != null && c1359430lTp2.LIZ == z2) {
                        if (c1359430lTp2.LIZIZ == i) {
                            z = false;
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            if (z) {
                LJFF(str, c1359430lTp);
            }
        }
    }

    public final synchronized void LIZ(Function2<? super String, ? super C1359430lTp, Unit> function2) {
        LIZJ();
        LLILLL.add(function2);
    }

    public final C1359430lTp LIZLLL(String str) {
        C1359430lTp c1359430lTp;
        if (str != null && str.length() != 0) {
            synchronized (this) {
                try {
                    c1359430lTp = LLILLJJLI.get(str);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            return c1359430lTp;
        }
        return null;
    }

    public final synchronized void LJI(Function2<? super String, ? super C1359430lTp, Unit> function2) {
        LLILLL.remove(function2);
    }

    public final void LJFF(String str, C1359430lTp c1359430lTp) {
        List listLLIIII;
        synchronized (this) {
            try {
                listLLIIII = C13LP.LLIIII(LLILLL);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        Iterator it2 = listLLIIII.iterator();
        while (it2.hasNext()) {
            ((Function2) it2.next()).invoke(str, c1359430lTp);
        }
    }

    public final void LJ(int i, String str, boolean z) {
        boolean z2 = true;
        if (str != null && str.length() != 0) {
            LIZJ();
            if (i < 0) {
                i = 0;
            }
            C1359430lTp c1359430lTp = new C1359430lTp(z, i);
            synchronized (this) {
                try {
                    LruCache<String, C1359430lTp> lruCache = LLILLJJLI;
                    C1359430lTp c1359430lTp2 = lruCache.get(str);
                    lruCache.put(str, c1359430lTp);
                    if (c1359430lTp2 != null && c1359430lTp2.LIZ == z) {
                        if (c1359430lTp2.LIZIZ == i) {
                            z2 = false;
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            if (z2) {
                LJFF(str, c1359430lTp);
                List listLIZIZ = C1554610qYd.LIZIZ(GScope.LL, IRepostInteractionSyncProtocol.class, false);
                if (listLIZIZ != null) {
                    for (IRepostInteractionSyncProtocol iRepostInteractionSyncProtocol : (ArrayList) listLIZIZ) {
                        if (iRepostInteractionSyncProtocol != LL) {
                            iRepostInteractionSyncProtocol.E22(new C1359520lTy(c1359430lTp.LIZIZ, "", str, z));
                        }
                    }
                }
            }
        }
    }
}
