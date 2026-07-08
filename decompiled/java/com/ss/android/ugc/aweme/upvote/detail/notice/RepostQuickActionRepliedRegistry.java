package com.ss.android.ugc.aweme.upvote.detail.notice;

import X.C0XQ7;
import X.C1357810lRD;
import X.C1357870lRJ;
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
import com.ss.android.ugc.aweme.feed.model.upvote.RepostReplyStruct;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteCacheState;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.upvote.callback.IRepostInteractionSyncProtocol;
import com.ss.android.ugc.aweme.upvote.detail.notice.RepostQuickActionRepliedRegistry;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class RepostQuickActionRepliedRegistry implements IRepostInteractionSyncProtocol {
    public static final RepostQuickActionRepliedRegistry LL = new RepostQuickActionRepliedRegistry();
    public static final LruCache<String, String> LLILLJJLI = new LruCache<>(200);
    public static final Set<Function2<String, Boolean, Unit>> LLILLL = new LinkedHashSet();
    public static volatile boolean LLILZ;

    @Override // com.ss.android.ugc.aweme.upvote.callback.IRepostInteractionSyncProtocol
    public final void E22(C1359520lTy c1359520lTy) {
    }

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
            lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.upvote.detail.notice.RepostQuickActionRepliedRegistry$ensureRegistered$$inlined$registerProtocol$1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        C1554610qYd.LIZLLL(gScope, IRepostInteractionSyncProtocol.class, this);
                    }
                }
            });
        }
        C0XQ7.LJ();
        C0XQ7.LIZ.LJIILL(new InterfaceC586170Myt() { // from class: X.0lRQ
            @Override // X.InterfaceC586170Myt
            public final void onAccountResult(int i, boolean z, int i2, User user) {
                if (z) {
                    synchronized (RepostQuickActionRepliedRegistry.LL) {
                        try {
                            RepostQuickActionRepliedRegistry.LLILLJJLI.evictAll();
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                }
            }
        });
    }

    public final void LIZ(String str) {
        boolean z = true;
        if (str.length() == 0) {
            return;
        }
        synchronized (this) {
            try {
                if (LLILLJJLI.remove(str) == null) {
                    z = false;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (z) {
            LJI(str, false);
        }
    }

    public final String LIZLLL(String str) {
        boolean z;
        String str2;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        synchronized (this) {
            try {
                str2 = LLILLJJLI.get(str);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return str2;
    }

    public final boolean LJ(String str) {
        boolean z = true;
        if (str == null || str.length() == 0) {
            return false;
        }
        synchronized (this) {
            try {
                if (LLILLJJLI.get(str) == null) {
                    z = false;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return z;
    }

    public final void LJII(String str) {
        String str2;
        Object next;
        if (str != null && str.length() != 0) {
            synchronized (this) {
                try {
                    Iterator<T> it2 = LLILLJJLI.snapshot().entrySet().iterator();
                    while (true) {
                        str2 = null;
                        if (it2.hasNext()) {
                            next = it2.next();
                            if (Intrinsics.LJFF(((Map.Entry) next).getValue(), str)) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    Map.Entry entry = (Map.Entry) next;
                    if (entry != null) {
                        str2 = (String) entry.getKey();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            if (str2 != null) {
                LIZ(str2);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.upvote.callback.IRepostInteractionSyncProtocol
    public final void PO(C1357870lRJ c1357870lRJ) {
        LJII(c1357870lRJ.LIZ.replyId);
    }

    @Override // com.ss.android.ugc.aweme.upvote.callback.IRepostInteractionSyncProtocol
    public final void Zc1(C1357810lRD c1357810lRD) {
        String str;
        if (c1357810lRD.LIZJ != UpvoteCacheState.PUBLISH_SUCCESS) {
            return;
        }
        RepostReplyStruct repostReplyStruct = c1357810lRD.LIZIZ;
        String str2 = null;
        if (repostReplyStruct != null) {
            str = repostReplyStruct.replyToCommentId;
            str2 = repostReplyStruct.replyId;
        } else {
            str = null;
        }
        LJFF(str, str2);
    }

    public final void LJFF(String str, String str2) {
        boolean z;
        boolean z2 = false;
        if (str != null && str.length() != 0) {
            LIZJ();
            synchronized (this) {
                try {
                    LruCache<String, String> lruCache = LLILLJJLI;
                    if (lruCache.get(str) != null) {
                        z2 = true;
                    }
                    if (str2 == null) {
                        str2 = "";
                    }
                    lruCache.put(str, str2);
                    z = !z2;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            if (z) {
                LJI(str, true);
            }
        }
    }

    public final void LJI(String str, boolean z) {
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
            ((Function2) it2.next()).invoke(str, Boolean.valueOf(z));
        }
    }
}
