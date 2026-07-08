package com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.draft;

import X.AbstractC2252651DEx;
import X.C01GW;
import X.C0I35;
import X.C0PEM;
import X.C13LE;
import X.C1BNE;
import X.C2217381BqS;
import X.C2252321DDq;
import X.C452501pT;
import X.C463090IDz;
import X.InterfaceC0148002o;
import X.InterfaceC2217461Bqa;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class MessageDraftVM extends AssemViewModel<InterfaceC0148002o> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILLL;
    public final AbstractC2252651DEx LL = C0PEM.LIZJ;
    public final C2252321DDq LLILLJJLI;
    public final C2252321DDq LLILLL;
    public final C2252321DDq LLILZ;
    public final C2252321DDq LLILZIL;
    public final C2252321DDq LLILZLL;
    public final C2252321DDq LLIZ;
    public final C01GW LLIZLLLIL;
    public final C2252321DDq LLJ;
    public final C2252321DDq LLJI;
    public final C2252321DDq LLJIJIL;
    public final C2252321DDq LLJILJIL;
    public volatile C0I35 LLJILJILJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MessageDraftVM.class, "imChatRepositoryProvider", "getImChatRepositoryProvider()Lcom/ss/android/ugc/aweme/im/sdk/chat/data/repository/IMChatRepositoryProvider;", 0);
        C13LE.LIZ.getClass();
        LLJILLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public MessageDraftVM() {
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(null);
        this.LLILLJJLI = c2252321DDqLIZ;
        this.LLILLL = c2252321DDqLIZ;
        C2252321DDq c2252321DDqLIZ2 = C1BNE.LIZ(null);
        this.LLILZ = c2252321DDqLIZ2;
        this.LLILZIL = c2252321DDqLIZ2;
        Boolean bool = Boolean.FALSE;
        C2252321DDq c2252321DDqLIZ3 = C1BNE.LIZ(bool);
        this.LLILZLL = c2252321DDqLIZ3;
        this.LLIZ = c2252321DDqLIZ3;
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1537));
        C2252321DDq c2252321DDqLIZ4 = C1BNE.LIZ(bool);
        this.LLJ = c2252321DDqLIZ4;
        this.LLJI = c2252321DDqLIZ4;
        C2252321DDq c2252321DDqLIZ5 = C1BNE.LIZ(bool);
        this.LLJIJIL = c2252321DDqLIZ5;
        this.LLJILJIL = c2252321DDqLIZ5;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C463090IDz(10);
    }
}
