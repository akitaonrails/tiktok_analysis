package com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.singlechat;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C06SA;
import X.C06Z6;
import X.C0NZW;
import X.C0PEM;
import X.C0QCK;
import X.C13LE;
import X.C1522605xg;
import X.C1554610qYd;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1697810uHb;
import X.C2217381BqS;
import X.C23250099c;
import X.C452501pT;
import X.C457780HxI;
import X.C687700QyG;
import X.C723590SZx;
import X.C869590Y9l;
import X.C903220Zc0;
import X.InterfaceC1146704e9;
import X.InterfaceC1364105Vn;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.InterfaceC904740ZeS;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.im.common.scope.ChatRoomScope;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.IMessageEventProtocol;
import com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.StrangerViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: loaded from: classes15.dex */
public final class StrangerConversationAssem extends AbstractC738140SxQ implements IMessageEventProtocol, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZIL;
    public final C1559260qg8 LL = new C1559260qg8(new C723590SZx(this, C457780HxI.class, null), checkSupervisorPrepared());
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS558S0100000_14(this, 780));
    public final C06Z6 LLILLL = C06Z6.IO;
    public final C0QCK LLILZ = new C0QCK(C0NZW.class);

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(StrangerConversationAssem.class, "chatConversationEventAbility", "getChatConversationEventAbility()Ltiktok/communication/LazyAbility;", 0);
        C13LE.LIZ.getClass();
        LLILZIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{ChatRoomScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ChatRoomScope.class);
        return arrayList;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() {
        super.onParentSet();
        final InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this);
        C1554610qYd.LIZJ(interfaceC665370Q7zLJIIL, IMessageEventProtocol.class, C1697810uHb.LJIILJJIL(this));
        Lifecycle lifecycle = getLifecycle();
        if (lifecycle != null) {
            lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.singlechat.StrangerConversationAssem$onParentSet$$inlined$registerProtocol$1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        C1554610qYd.LIZLLL(interfaceC665370Q7zLJIIL, IMessageEventProtocol.class, this);
                    }
                }
            });
        }
        this.LLILLJJLI.getValue();
        C0QCK c0qck = this.LLILZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILZIL;
        c0qck.LIZ(this).LIZIZ(this, new AwS588S0100000_9(this, 101));
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.IMessageEventProtocol
    public final C06Z6 mh1() {
        return this.LLILLL;
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.IMessageEventProtocol
    public final void df1(InterfaceC904740ZeS interfaceC904740ZeS) {
        StrangerViewModel strangerViewModel = (StrangerViewModel) this.LLILLJJLI.getValue();
        strangerViewModel.getClass();
        if (interfaceC904740ZeS instanceof C06SA) {
            C869590Y9l c869590Y9l = ((C06SA) interfaceC904740ZeS).LIZJ;
            if (strangerViewModel.LL.isMessageRequest() && c869590Y9l.getMsgStatus() == 2) {
                strangerViewModel.LLILLJJLI.d();
                C23250099c.LIZLLL(ViewModelKt.getViewModelScope(strangerViewModel), C0PEM.LIZJ.plus(new C903220Zc0(CoroutineExceptionHandler.LJJLIL, strangerViewModel)), null, new C1522605xg(strangerViewModel, null), 2);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.IMessageEventProtocol
    public final Object NX1(InterfaceC904740ZeS interfaceC904740ZeS, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return false;
    }
}
