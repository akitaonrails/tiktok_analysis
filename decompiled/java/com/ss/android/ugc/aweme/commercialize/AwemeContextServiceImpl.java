package com.ss.android.ugc.aweme.commercialize;

import X.C04TD;
import com.ss.android.ugc.aweme.commercialize.service.IAwemeContextService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class AwemeContextServiceImpl implements IAwemeContextService {
    public WeakReference<Aweme> LIZ;
    public WeakReference<Aweme> LIZIZ;
    public WeakReference<Aweme> LIZJ;
    public WeakReference<Aweme> LIZLLL;

    public static IAwemeContextService LIZ() {
        Object objLIZ = C04TD.LIZ(IAwemeContextService.class, false);
        if (objLIZ != null) {
            return (IAwemeContextService) objLIZ;
        }
        if (C04TD.LLJJIJIL == null) {
            synchronized (IAwemeContextService.class) {
                if (C04TD.LLJJIJIL == null) {
                    C04TD.LLJJIJIL = new AwemeContextServiceImpl();
                }
            }
        }
        return C04TD.LLJJIJIL;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.IAwemeContextService
    public final Aweme LLLJ() {
        WeakReference<Aweme> weakReference = this.LIZJ;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.IAwemeContextService
    public final Aweme LLLJIL() {
        WeakReference<Aweme> weakReference = this.LIZIZ;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.IAwemeContextService
    public final Aweme LLLJL() {
        WeakReference<Aweme> weakReference = this.LIZLLL;
        Aweme aweme = weakReference != null ? weakReference.get() : null;
        WeakReference<Aweme> weakReference2 = this.LIZLLL;
        if (weakReference2 != null) {
            weakReference2.clear();
        }
        return aweme;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.IAwemeContextService
    public final boolean LLLLII(String str) {
        String aid;
        Aweme aweme;
        WeakReference<Aweme> weakReference = this.LIZ;
        if (weakReference != null && (aweme = weakReference.get()) != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        return Intrinsics.LJFF(aid, str);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.IAwemeContextService
    public final void LLLLIIIILLL(Aweme aweme, Aweme aweme2) {
        if (aweme2 != null && aweme2.isAd()) {
            this.LIZLLL = new WeakReference<>(aweme);
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.service.IAwemeContextService
    public final void LLLL(Aweme aweme, Aweme aweme2, Aweme aweme3) {
        this.LIZ = new WeakReference<>(aweme);
        this.LIZIZ = new WeakReference<>(aweme2);
        this.LIZJ = new WeakReference<>(aweme3);
    }
}
