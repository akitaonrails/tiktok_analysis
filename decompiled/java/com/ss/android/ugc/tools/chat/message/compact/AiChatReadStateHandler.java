package com.ss.android.ugc.tools.chat.message.compact;

import X.C01GW;
import X.C06Z6;
import X.C1509705vb;
import X.C1758306ub;
import X.C452501pT;
import X.C869590Y9l;
import X.InterfaceC1364105Vn;
import X.InterfaceC1755906uD;
import X.InterfaceC1891350zJl;
import X.InterfaceC892260YzQ;
import X.InterfaceC904740ZeS;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.IMessageEventProtocol;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.IMessagePowerAdapterProtocol;
import java.util.List;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class AiChatReadStateHandler implements IMessagePowerAdapterProtocol, IMessageEventProtocol {
    public final C01GW LL;
    public final C06Z6 LLILLJJLI;

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.IMessagePowerAdapterProtocol
    public final void Fj() {
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.IMessagePowerAdapterProtocol
    public final void YP2(List<? extends C869590Y9l> list, List<? extends InterfaceC904740ZeS> list2, List<? extends InterfaceC1891350zJl> list3) {
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.IMessagePowerAdapterProtocol
    public final void C() {
        InterfaceC892260YzQ interfaceC892260YzQ = (InterfaceC892260YzQ) this.LL.getValue();
        if (interfaceC892260YzQ != null) {
            interfaceC892260YzQ.C();
        }
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.IMessageEventProtocol
    public final C06Z6 mh1() {
        return this.LLILLJJLI;
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.IMessageEventProtocol
    public final void df1(InterfaceC904740ZeS interfaceC904740ZeS) {
        InterfaceC892260YzQ interfaceC892260YzQ;
        if (((interfaceC904740ZeS instanceof C1509705vb) || (interfaceC904740ZeS instanceof C1758306ub)) && (interfaceC892260YzQ = (InterfaceC892260YzQ) this.LL.getValue()) != null) {
            interfaceC892260YzQ.T20();
        }
    }

    public AiChatReadStateHandler(InterfaceC1755906uD interfaceC1755906uD, LifecycleOwner lifecycleOwner) {
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS558S0100000_14(interfaceC1755906uD, 1243));
        this.LL = c01gwLIZIZ;
        this.LLILLJJLI = C06Z6.MAIN;
        LifecycleObserver lifecycleObserver = (LifecycleObserver) c01gwLIZIZ.getValue();
        if (lifecycleObserver != null) {
            lifecycleOwner.getLifecycle().addObserver(lifecycleObserver);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.IMessageEventProtocol
    public final Object NX1(InterfaceC904740ZeS interfaceC904740ZeS, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return false;
    }
}
