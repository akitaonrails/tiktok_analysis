package com.ss.android.ugc.aweme.im.sdk.chat.viewmodel;

import X.C01GW;
import X.C11NJ;
import X.C11RK;
import X.C11RO;
import X.C11S5;
import X.C1239300iM4;
import X.C13LE;
import X.C2217381BqS;
import X.C452501pT;
import X.C903200Zby;
import X.C903250Zc3;
import X.C903930Zd9;
import X.InterfaceC2217461Bqa;
import X.InterfaceC903260Zc4;
import X.InterfaceC905060Zey;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS593S0100000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class StrangerViewModel extends ViewModel {
    public static final C903250Zc3 LLJ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public final SessionInfo LL;
    public final InterfaceC903260Zc4 LLILLJJLI;
    public final C11NJ LLILLL;
    public final C11RO LLILZ;
    public final C01GW LLILZIL;
    public final C11RK<Unit> LLILZLL;
    public final C01GW LLIZ;
    public volatile C903930Zd9 LLIZLLLIL;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0Zc3] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(StrangerViewModel.class, "imConvoRepoProvider", "getImConvoRepoProvider()Lcom/ss/android/ugc/aweme/im/sdk/chat/data/repository/IMConversationRepositoryProvider;", 0);
        C13LE.LIZ.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJ = new Object() { // from class: X.0Zc3
        };
    }

    public StrangerViewModel() {
        throw null;
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.LLILLL.LJ();
    }

    public StrangerViewModel(SessionInfo sessionInfo, C01GW c01gw) {
        C903200Zby c903200Zby = new C903200Zby("StrangerViewModel");
        C11NJ c11nj = new C11NJ();
        C11RO c11roLIZ = C11S5.LIZ();
        this.LL = sessionInfo;
        this.LLILLJJLI = c903200Zby;
        this.LLILLL = c11nj;
        this.LLILZ = c11roLIZ;
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1673));
        this.LLILZIL = c01gwLIZIZ;
        C11RK<Unit> c11rk = new C11RK<>();
        this.LLILZLL = c11rk;
        this.LLIZ = c01gw;
        c11nj.LIZ(C1239300iM4.LJ(((InterfaceC905060Zey) c01gwLIZIZ.getValue()).LIZ(sessionInfo.getConversationId()), C1239300iM4.LIZIZ, C1239300iM4.LIZJ, new AwS593S0100000_14(this, 362)));
        c11nj.LIZ(C1239300iM4.LJ(c11rk.LJJJLZIJ(c11roLIZ).LJIL(100L, TimeUnit.MILLISECONDS), C1239300iM4.LIZIZ, C1239300iM4.LIZJ, new AwS593S0100000_14(this, 363)));
    }
}
