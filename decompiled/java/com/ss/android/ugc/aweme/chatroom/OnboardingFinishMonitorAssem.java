package com.ss.android.ugc.aweme.chatroom;

import X.AbstractC738140SxQ;
import X.AbstractC879060Ye8;
import X.C01GW;
import X.C0NZO;
import X.C0PEM;
import X.C0Y8T;
import X.C0YNP;
import X.C0YSQ;
import X.C1559260qg8;
import X.C2296808zG;
import X.C23250099c;
import X.C452501pT;
import X.C457780HxI;
import X.C723580SZw;
import X.C888330Yt5;
import X.InterfaceC866850XzX;
import X.InterfaceC876950Yaj;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public final class OnboardingFinishMonitorAssem extends AbstractC738140SxQ {
    public final C1559260qg8 LL = new C1559260qg8(new C723580SZw(this, C457780HxI.class, null), checkSupervisorPrepared());
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS558S0100000_14(this, 151));
    public final AtomicBoolean LLILLL = new AtomicBoolean(false);
    public final C888330Yt5 LLILZ = new InterfaceC866850XzX() { // from class: X.0Yt5
        @Override // X.InterfaceC866850XzX, X.InterfaceC868050Y3n
        public final void LJJJJJL(C0Y8T c0y8t) {
        }

        @Override // X.InterfaceC866850XzX, X.InterfaceC868050Y3n
        public final void LJJLIIIJ(C0Y8T c0y8t) {
        }

        @Override // X.InterfaceC866850XzX, X.InterfaceC868050Y3n
        public final void LJJLJLI(List<C0YAE> list) {
        }

        @Override // X.InterfaceC866850XzX, X.InterfaceC868050Y3n
        public final void LJJLL(List<C0YAE> list) {
        }

        @Override // X.InterfaceC866850XzX, X.InterfaceC868050Y3n
        public final void LJJZZI(List<C0YAE> list) {
        }

        @Override // X.InterfaceC866850XzX, X.InterfaceC868050Y3n
        public final void LJLI(String str, List<C0YAE> list) {
        }

        @Override // X.InterfaceC866850XzX, X.InterfaceC868050Y3n
        public final void LJLILLLLZI(C0Y8T c0y8t) {
        }

        @Override // X.InterfaceC866850XzX, X.InterfaceC868050Y3n
        public final void LJLL(C1711306n1 c1711306n1) {
        }

        @Override // X.InterfaceC866850XzX, X.InterfaceC868050Y3n
        public final void LJZI(C0Y8T c0y8t) {
        }

        @Override // X.InterfaceC866850XzX, X.InterfaceC868050Y3n
        public final void LLIIII(int i, String str) {
        }

        @Override // X.InterfaceC866850XzX, X.InterfaceC868050Y3n
        public final void LLIILZL(int i, String str, List list) {
        }

        @Override // X.InterfaceC868050Y3n
        public final int LLLIIII() {
            return 0;
        }

        @Override // X.InterfaceC866850XzX, X.InterfaceC868050Y3n
        public final void LJLJI(int i, C0Y8T c0y8t) {
            if (c0y8t == null) {
                return;
            }
            this.LL.m168do(c0y8t);
        }
    };

    public final String bo() {
        SessionInfo sessionInfo;
        C457780HxI c457780HxI = (C457780HxI) this.LL.getValue();
        if (c457780HxI == null || (sessionInfo = c457780HxI.LL) == null) {
            return null;
        }
        return sessionInfo.getConversationId();
    }

    @Override // X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        AbstractC879060Ye8 abstractC879060Ye8 = (AbstractC879060Ye8) this.LLILLJJLI.getValue();
        if (abstractC879060Ye8 != null) {
            abstractC879060Ye8.LJIIJJI(this.LLILZ);
        }
        C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(bo());
        if (c0y8tLIZ == null) {
            return;
        }
        m168do(c0y8tLIZ);
    }

    @Override // X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        AbstractC879060Ye8 abstractC879060Ye8 = (AbstractC879060Ye8) this.LLILLJJLI.getValue();
        if (abstractC879060Ye8 != null) {
            abstractC879060Ye8.LJIILLIIL(this.LLILZ);
        }
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public final void m168do(C0Y8T c0y8t) {
        String strBo = bo();
        if (strBo != null && Intrinsics.LJFF(C0YNP.LJFF(strBo, "onboarding_finish_notified"), "true")) {
            AbstractC879060Ye8 abstractC879060Ye8 = (AbstractC879060Ye8) this.LLILLJJLI.getValue();
            if (abstractC879060Ye8 != null) {
                abstractC879060Ye8.LJIILLIIL(this.LLILZ);
                return;
            }
            return;
        }
        if (c0y8t.getMemberCount() - 1 >= 2 && this.LLILLL.compareAndSet(false, true)) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C0NZO(this, null), 3);
        }
    }
}
