package com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.ui.assem;

import X.C019F;
import X.C01GW;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C300860Bqm;
import X.C452501pT;
import X.C687700QyG;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.InterfaceC1146704e9;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.InterfaceC737790Swr;
import X.InterfaceC885250Yo7;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.ui.scope.MessageRequestPageScope;
import com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.vm.MessageRequestLoadingAbilityVM;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AFwS292S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS623S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class MessageRequestLoadingAssem extends UIContentAssem implements InterfaceC737790Swr, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 163));
    public final AssemVMLazy LLJ;
    public final C01GW LLJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MessageRequestLoadingAssem.class, "loadingVM", "getLoadingVM()Lcom/ss/android/ugc/aweme/im/chatlist/impl/feature/messagerequest/vm/MessageRequestLoadingAbilityVM;", 0);
        C13LE.LIZ.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public MessageRequestLoadingAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MessageRequestLoadingAbilityVM.class);
        this.LLJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS553S0100000_9(c19719912DlLIZ, 165), AFwS240S0000000_9.get$arr$(110), null, true);
        this.LLJI = C452501pT.LIZIZ(new AwS553S0100000_9(this, 164));
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{MessageRequestPageScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(MessageRequestPageScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{MessageRequestPageScope.class}).unbindAbility(this.LLJI.getValue(), InterfaceC885250Yo7.class);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        if (C300860Bqm.LIZ()) {
            AssemVMLazy assemVMLazy = this.LLJ;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJIJIL;
            C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0OLI
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C0OLM) obj).LL;
                }
            }, C736820SvI.LIZLLL(), new AwS623S0100000_9(this, 33), 4);
            C736680Sv4.LJIIIIZZ(this, this.LLJ.getValue(), new C2217381BqS() { // from class: X.0OLK
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C0OLM) obj).LLILLJJLI;
                }
            }, C736820SvI.LIZLLL(), AFwS292S0000000_9.get$arr$(9), 4);
            return;
        }
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJI.getValue(), new C2217381BqS() { // from class: X.0OLJ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C887820YsG) obj).LLJI;
            }
        }, C736820SvI.LIZLLL(), new AwS623S0100000_9(this, 34), 4);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJI.getValue(), new C2217381BqS() { // from class: X.0OLL
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C887820YsG) obj).LLJIJIL;
            }
        }, C736820SvI.LIZLLL(), AFwS292S0000000_9.get$arr$(10), 4);
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{MessageRequestPageScope.class}).bindAbility(this.LLJI.getValue(), InterfaceC885250Yo7.class);
    }
}
