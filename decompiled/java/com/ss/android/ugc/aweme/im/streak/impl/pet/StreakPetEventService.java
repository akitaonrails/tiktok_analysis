package com.ss.android.ugc.aweme.im.streak.impl.pet;

import X.AnonymousClass0950;
import X.C054G;
import X.C05E7;
import X.C09IC;
import X.C09IR;
import X.C13LE;
import X.C15531066f;
import X.C1598406Nq;
import X.C1807670x8n;
import X.C2217381BqS;
import X.C2252331DDr;
import X.C2296808zG;
import X.C23250099c;
import X.InterfaceC2217461Bqa;
import com.ss.android.ugc.aweme.im.streak.api.pet.IStreakPetEventService;

/* JADX INFO: loaded from: classes3.dex */
public final class StreakPetEventService implements IStreakPetEventService {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LJ;
    public final C2252331DDr LIZ;
    public final AnonymousClass0950 LIZIZ;
    public final C054G LIZJ;
    public volatile C1598406Nq LIZLLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(StreakPetEventService.class, "ttDispatchers", "getTtDispatchers()Lcom/ss/android/ugc/aweme/im/saas/host/api/utils/IMDispatchers;", 0);
        C13LE.LIZ.getClass();
        LJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public StreakPetEventService() {
        C2252331DDr c2252331DDrLIZIZ = C09IR.LIZIZ(0, 0, null, 6);
        this.LIZ = c2252331DDrLIZIZ;
        this.LIZIZ = C09IC.LIZ(c2252331DDrLIZIZ);
        C1598406Nq c1598406Nq = this.LIZLLL;
        if (c1598406Nq == null) {
            synchronized (this) {
                c1598406Nq = this.LIZLLL;
                if (c1598406Nq == null) {
                    c1598406Nq = (C1598406Nq) C1807670x8n.LLLLLJIL();
                    this.LIZLLL = c1598406Nq;
                }
            }
        }
        this.LIZJ = C2296808zG.LIZ(c1598406Nq.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.im.streak.api.pet.IStreakPetEventService
    public final AnonymousClass0950 getEvents() {
        return this.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.im.streak.api.pet.IStreakPetEventService
    public final void LIZ(C15531066f c15531066f) {
        C23250099c.LIZLLL(this.LIZJ, null, null, new C05E7(this, c15531066f, null), 3);
    }
}
