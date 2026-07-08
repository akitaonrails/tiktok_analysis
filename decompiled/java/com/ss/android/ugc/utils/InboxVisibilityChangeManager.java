package com.ss.android.ugc.utils;

import X.C20619715mN;
import X.InterfaceC20619815mO;
import com.ss.android.ugc.aweme.im.service.service.IInboxVisibilityChangeManager;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes32.dex */
public final class InboxVisibilityChangeManager implements IInboxVisibilityChangeManager {
    public static final InboxVisibilityChangeManager LIZ = new InboxVisibilityChangeManager();
    public static final CopyOnWriteArrayList<InterfaceC20619815mO> LIZIZ = new CopyOnWriteArrayList<>();
    public static boolean LIZJ;
    public static boolean LIZLLL;

    public static final class Service implements IInboxVisibilityChangeManager {
        public final /* synthetic */ InboxVisibilityChangeManager LIZ = InboxVisibilityChangeManager.LIZ;

        @Override // com.ss.android.ugc.aweme.im.service.service.IInboxVisibilityChangeManager
        public final void LIZ(boolean z) {
            this.LIZ.LIZ(z);
        }

        @Override // com.ss.android.ugc.aweme.im.service.service.IInboxVisibilityChangeManager
        public final void LIZIZ(C20619715mN c20619715mN) {
            this.LIZ.LIZIZ(c20619715mN);
        }

        @Override // com.ss.android.ugc.aweme.im.service.service.IInboxVisibilityChangeManager
        public final void LIZJ(boolean z) {
            this.LIZ.LIZJ(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IInboxVisibilityChangeManager
    public final void LIZ(boolean z) {
        LIZLLL = z;
        Iterator<InterfaceC20619815mO> it2 = LIZIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ(LIZJ, z);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IInboxVisibilityChangeManager
    public final void LIZIZ(C20619715mN c20619715mN) {
        LIZIZ.add(c20619715mN);
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IInboxVisibilityChangeManager
    public final void LIZJ(boolean z) {
        LIZJ = z;
        Iterator<InterfaceC20619815mO> it2 = LIZIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ(z, LIZLLL);
        }
    }
}
