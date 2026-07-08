package com.ss.android.ugc.aweme.im.service.viewmodel;

import X.C01GW;
import X.C054G;
import X.C06C8;
import X.C06F6;
import X.C06PY;
import X.C0Z53;
import X.C11NJ;
import X.C1239300iM4;
import X.C13LE;
import X.C1559260qg8;
import X.C1598406Nq;
import X.C1602206Pc;
import X.C1602406Pe;
import X.C1602906Pj;
import X.C1770006wU;
import X.C1807670x8n;
import X.C2217381BqS;
import X.C2296808zG;
import X.C2296908zH;
import X.C23250099c;
import X.C452501pT;
import X.C457780HxI;
import X.C823170WQx;
import X.C903930Zd9;
import X.InterfaceC0148002o;
import X.InterfaceC1602806Pi;
import X.InterfaceC2217461Bqa;
import X.InterfaceC905060Zey;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.im.saas.host.api.im.utils.IMALogApi;
import com.ss.android.ugc.aweme.im.streak.api.IStreakService;
import com.ss.android.ugc.aweme.im.streak.api.StreakData;
import com.ss.android.ugc.aweme.im.streak.api.pet.IStreakPetService;
import com.ss.android.ugc.aweme.im.streak.api.pet.StreakExtension;
import com.ss.android.ugc.aweme.im.streak.api.pet.StreakPetData;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AwS127S1200000_11;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: loaded from: classes3.dex */
public final class ChatRoomStreakViewModel extends AssemViewModel<C06PY> implements C06F6, C06C8 {
    public static final C1602906Pj LLJJ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJI;
    public final InterfaceC1602806Pi LL;
    public final C1559260qg8 LLILLJJLI = new C1559260qg8(new AwS127S1200000_11((AssemViewModel) this, (AssemViewModel<Object>) C457780HxI.class, (Class<Object>) null, (String) 13), true);
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 581));
    public final C11NJ LLILZ = new C11NJ();
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 582));
    public final C01GW LLILZLL;
    public final C01GW LLIZ;
    public final C823170WQx<String> LLIZLLLIL;
    public final C823170WQx<String> LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;
    public final C054G LLJILJIL;
    public volatile C903930Zd9 LLJILJILJ;
    public volatile C1598406Nq LLJILLL;

    /* JADX WARN: Type inference failed for: r0v5, types: [X.06Pj] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ChatRoomStreakViewModel.class, "imConvoRepoProvider", "getImConvoRepoProvider()Lcom/ss/android/ugc/aweme/im/sdk/chat/data/repository/IMConversationRepositoryProvider;", 0);
        C13LE.LIZ.getClass();
        LLJJI = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(ChatRoomStreakViewModel.class, "ttDispatchers", "getTtDispatchers()Lcom/ss/android/ugc/aweme/im/saas/host/api/utils/IMDispatchers;", 0)};
        LLJJ = new Object() { // from class: X.06Pj
        };
    }

    @Override // X.C06C8
    public final void Ro1(String str) {
    }

    @Override // X.C06C8
    public final void wK0(String str, StreakExtension streakExtension, StreakPetData streakPetData) {
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C06PY(null, null, null, null);
    }

    public final C457780HxI wQ2() {
        return (C457780HxI) this.LLILLJJLI.getValue();
    }

    public final String xQ2() {
        return (String) this.LLILLL.getValue();
    }

    public final IStreakService yQ2() {
        return (IStreakService) this.LLILZLL.getValue();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.LLILZ.LJ();
        this.LLIZLLLIL.clear();
        this.LLJ.clear();
        C2296808zG.LIZJ(this.LLJILJIL, null);
        yQ2().J(this);
        ((IStreakPetService) this.LLIZ.getValue()).LJJIJIIJIL(this);
        yQ2().Q(xQ2());
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        this.LLILZ.LIZ(C1239300iM4.LJ(((InterfaceC905060Zey) this.LLILZIL.getValue()).LIZ(xQ2()), C1239300iM4.LIZIZ, C1239300iM4.LIZJ, new C1602206Pc(this)));
        yQ2().x(this);
        ((IStreakPetService) this.LLIZ.getValue()).LJJIIJZLJL(this);
        yQ2().u(xQ2());
        yQ2().y();
    }

    public ChatRoomStreakViewModel(InterfaceC1602806Pi interfaceC1602806Pi) {
        this.LL = interfaceC1602806Pi;
        new C1770006wU(CoroutineExceptionHandler.LJJLIL, 2);
        this.LLILZLL = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(542));
        this.LLIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(541));
        this.LLIZLLLIL = new C823170WQx<>();
        this.LLJ = new C823170WQx<>();
        C1598406Nq c1598406Nq = this.LLJILLL;
        if (c1598406Nq == null) {
            synchronized (this) {
                c1598406Nq = this.LLJILLL;
                if (c1598406Nq == null) {
                    c1598406Nq = (C1598406Nq) C1807670x8n.LLLLLJIL();
                    this.LLJILLL = c1598406Nq;
                }
            }
        }
        this.LLJILJIL = C2296808zG.LIZ(c1598406Nq.LIZ.plus(C2296908zH.LIZ()));
    }

    public final void vQ2(Integer num) {
        if (wQ2().LLILLJJLI && !this.LLJI) {
            IMALogApi.LIZ.getClass();
            IMALogApi iMALogApiLIZ = C0Z53.LIZ();
            if (iMALogApiLIZ != null) {
                iMALogApiLIZ.LIZ(6, "Streak", "ChatRoomStreakViewModel: checkStreakUnlockAnimInnerV2: quick chat, skip");
                return;
            }
            return;
        }
        C23250099c.LIZLLL(this.LLJILJIL, null, null, new C1602406Pe(this, num, null), 3);
    }

    @Override // X.C06F6
    public final void r80(StreakData streakData, String str) {
        if (!Intrinsics.LJFF(str, xQ2())) {
            return;
        }
        setState(new AwS581S0100000_2(this, 708));
    }

    @Override // X.C06C8
    public final void SI2(String str, StreakPetData streakPetData, StreakPetData streakPetData2) {
        if (!Intrinsics.LJFF(str, xQ2())) {
            return;
        }
        setState(new AwS581S0100000_2(this, 229));
    }
}
