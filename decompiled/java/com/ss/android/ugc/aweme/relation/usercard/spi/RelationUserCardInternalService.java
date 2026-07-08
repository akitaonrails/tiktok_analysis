package com.ss.android.ugc.aweme.relation.usercard.spi;

import X.C1262250ix5;
import X.C1262300ixA;
import X.C1262600ixe;
import X.C1262970iyF;
import X.C1262980iyG;
import X.C1262990iyH;
import X.C1904040zeE;
import X.C1904050zeF;
import X.InterfaceC1262800ixy;
import com.ss.android.ugc.aweme.relation.usercard.IRelationUserCardInternalService;

/* JADX INFO: loaded from: classes20.dex */
public final class RelationUserCardInternalService implements IRelationUserCardInternalService {
    @Override // com.ss.android.ugc.aweme.relation.usercard.IRelationUserCardInternalService
    public final C1262970iyF LIZIZ(C1262300ixA c1262300ixA) {
        C1262980iyG.LLJILJIL.getClass();
        return new C1262970iyF(new C1262980iyG(c1262300ixA, false));
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.IRelationUserCardInternalService
    public final C1904050zeF LIZJ(C1262300ixA c1262300ixA) {
        C1262980iyG.LLJILJIL.getClass();
        return new C1904050zeF(new C1262980iyG(c1262300ixA, true));
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.IRelationUserCardInternalService
    public final C1904040zeE LIZLLL(C1262300ixA c1262300ixA) {
        C1262980iyG.LLJILJIL.getClass();
        return new C1904040zeE(new C1262980iyG(c1262300ixA, true));
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.IRelationUserCardInternalService
    public final C1262990iyH LJ(C1262300ixA c1262300ixA) {
        C1262980iyG.LLJILJIL.getClass();
        return new C1262990iyH(new C1262980iyG(c1262300ixA, false));
    }

    @Override // com.ss.android.ugc.aweme.relation.usercard.IRelationUserCardInternalService
    public final InterfaceC1262800ixy LIZ(C1262300ixA c1262300ixA, int i) {
        InterfaceC1262800ixy c1262600ixe;
        if (i == 1) {
            c1262600ixe = new C1262250ix5();
        } else {
            c1262600ixe = new C1262600ixe();
        }
        if (c1262300ixA != null) {
            c1262600ixe.setConfigInner(c1262300ixA);
        }
        return c1262600ixe;
    }
}
