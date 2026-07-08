package com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.mesagelist;

import X.AnonymousClass0951;
import X.C01GW;
import X.C05YD;
import X.C06PE;
import X.C09IC;
import X.C0Y8T;
import X.C0YSQ;
import X.C11NJ;
import X.C11RO;
import X.C1239300iM4;
import X.C13BV;
import X.C13LE;
import X.C1559260qg8;
import X.C1660506ep;
import X.C1701940uOG;
import X.C1BNE;
import X.C2217381BqS;
import X.C2252321DDq;
import X.C452501pT;
import X.C457780HxI;
import X.C723600SZy;
import X.C736820SvI;
import X.C869590Y9l;
import X.C903930Zd9;
import X.InterfaceC0148002o;
import X.InterfaceC1294060jmO;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC876950Yaj;
import X.InterfaceC905060Zey;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.im.b2c.actionbar.ActionBarButtonConfBusiness;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.messagelist.api.viewmodel.IIMessageListViewModel;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS581S0100000_2;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC1294060jmO
public final class MessageListViewModel extends IIMessageListViewModel {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public final C1559260qg8 LL = new C1559260qg8(new C723600SZy(this, C457780HxI.class, null), true);
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS546S0100000_2(this, 542));
    public final C11NJ LLILLL = new C11NJ();
    public final C11RO LLILZ = C1701940uOG.LIZIZ();
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 541));
    public final C2252321DDq LLILZLL;
    public final AnonymousClass0951 LLIZ;
    public final C2252321DDq LLIZLLLIL;
    public final AnonymousClass0951 LLJ;
    public final Set<String> LLJI;
    public volatile C903930Zd9 LLJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MessageListViewModel.class, "imConvoRepoProvider", "getImConvoRepoProvider()Lcom/ss/android/ugc/aweme/im/sdk/chat/data/repository/IMConversationRepositoryProvider;", 0);
        C13LE.LIZ.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        SessionInfo sessionInfoBQ2 = BQ2();
        if (sessionInfoBQ2 != null) {
            this.LLILLL.LIZ(C1239300iM4.LJ(((InterfaceC905060Zey) this.LLILZIL.getValue()).LIZ(sessionInfoBQ2.getConversationId()).LJJJLZIJ(this.LLILZ), C1239300iM4.LIZIZ, C1239300iM4.LIZJ, new C1660506ep(this)));
        }
        AssemViewModel.subscribeInternal$default(this, C736820SvI.LJ(), null, null, new AwS581S0100000_2(this, 50), 6, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean AQ2() {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.mesagelist.MessageListViewModel.AQ2():boolean");
    }

    public final SessionInfo BQ2() {
        return (SessionInfo) this.LLILLJJLI.getValue();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        SessionInfo sessionInfoBQ2 = BQ2();
        boolean zIsHighRiskConversation = sessionInfoBQ2 != null ? sessionInfoBQ2.isHighRiskConversation() : false;
        SessionInfo sessionInfoBQ22 = BQ2();
        boolean zIsMediaMsgMasking = sessionInfoBQ22 != null ? sessionInfoBQ22.isMediaMsgMasking() : false;
        boolean zAQ2 = AQ2();
        InterfaceC876950Yaj interfaceC876950YajLIZIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ);
        SessionInfo sessionInfoBQ23 = BQ2();
        C0Y8T c0y8tLIZ = interfaceC876950YajLIZIZ.LIZ(sessionInfoBQ23 != null ? sessionInfoBQ23.getConversationId() : null);
        boolean zHasMore = c0y8tLIZ != null ? c0y8tLIZ.hasMore() : true;
        C13BV c13bv = C13BV.INSTANCE;
        return new C06PE(zIsHighRiskConversation, zIsMediaMsgMasking, zAQ2, null, zHasMore, c13bv, c13bv, false);
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.viewmodel.IIMessageListViewModel
    public final void yQ2() {
        this.LLIZLLLIL.setValue(Boolean.TRUE);
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.viewmodel.IIMessageListViewModel
    public final void zQ2() {
        this.LLILZLL.setValue(Boolean.TRUE);
    }

    public MessageListViewModel() {
        Boolean bool = Boolean.FALSE;
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(bool);
        this.LLILZLL = c2252321DDqLIZ;
        this.LLIZ = C09IC.LIZIZ(c2252321DDqLIZ);
        C2252321DDq c2252321DDqLIZ2 = C1BNE.LIZ(bool);
        this.LLIZLLLIL = c2252321DDqLIZ2;
        this.LLJ = C09IC.LIZIZ(c2252321DDqLIZ2);
        this.LLJI = new LinkedHashSet();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.LLILLL.LJ();
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListHasRenderedProvider
    public final C05YD<Boolean> W42() {
        return this.LLIZ;
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListHasRenderedProvider
    public final C05YD<Boolean> dX() {
        return this.LLJ;
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.viewmodel.IIMessageListViewModel
    public final void wQ2(List<? extends InterfaceC1891350zJl> list) {
        setState(new AwS581S0100000_2((List) list, (List<ActionBarButtonConfBusiness>) 223));
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.viewmodel.IIMessageListViewModel
    @InterfaceC1294060jmO
    public final void xQ2(List<? extends C869590Y9l> list) {
        setState(new AwS581S0100000_2((List) list, (List<ActionBarButtonConfBusiness>) 224));
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.viewmodel.IIMessageListViewModel
    public final void vQ2(String str, boolean z) {
        if (z) {
            this.LLJI.remove(str);
        } else {
            this.LLJI.add(str);
        }
        setState(new AwS581S0100000_2(this, 49));
    }
}
