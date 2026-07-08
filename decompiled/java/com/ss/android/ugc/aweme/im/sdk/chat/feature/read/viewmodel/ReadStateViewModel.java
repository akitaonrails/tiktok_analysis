package com.ss.android.ugc.aweme.im.sdk.chat.feature.read.viewmodel;

import X.AnonymousClass0956;
import X.C01GW;
import X.C0Y3I;
import X.C0Y7P;
import X.C0YA1;
import X.C0YA6;
import X.C0YC9;
import X.C0YI5;
import X.C0ZDR;
import X.C1559260qg8;
import X.C1DW6;
import X.C2171608f4;
import X.C356901a3;
import X.C452501pT;
import X.C457780HxI;
import X.C723600SZy;
import X.C869590Y9l;
import X.C876310YZh;
import X.C876340YZk;
import X.C892280YzS;
import X.C914160Zte;
import X.EnumC872590YKz;
import X.InterfaceC0148002o;
import X.InterfaceC1755906uD;
import X.InterfaceC1891350zJl;
import X.InterfaceC892260YzQ;
import X.InterfaceC904740ZeS;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.IMessagePowerAdapterProtocol;
import com.ss.android.ugc.aweme.im.saas.host.api.websocket.IMWebSocketBridgeApi;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class ReadStateViewModel extends AssemViewModel<InterfaceC0148002o> implements DefaultLifecycleObserver, C1DW6, IMessagePowerAdapterProtocol, GenericLifecycleObserver {
    public final C1559260qg8 LL = new C1559260qg8(new C723600SZy(this, C457780HxI.class, null), true);
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS558S0100000_14(this, 621));
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 620));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 619));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 622));
    public C892280YzS LLILZLL;

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.IMessagePowerAdapterProtocol
    public final void Fj() {
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void Ip(int i, C0YC9 c0yc9, C869590Y9l c869590Y9l) {
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void Jk(C869590Y9l c869590Y9l, int i) {
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void LLILZ(C869590Y9l c869590Y9l) {
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void Re(C869590Y9l c869590Y9l) {
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void Us(List<C869590Y9l> list, EnumC872590YKz enumC872590YKz) {
    }

    @Override // X.C1DW6
    public final void VD0(C1DW6 c1dw6) {
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void gb(C0Y3I c0y3i, List<? extends C869590Y9l> list, Map<String, Map<String, String>> map, int i) {
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void hk(C0Y3I c0y3i, int i, C0YA6 c0ya6) {
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void kl(List<? extends C869590Y9l> list, List<? extends C869590Y9l> list2) {
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void mf(C869590Y9l c869590Y9l) {
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void mp(C0Y3I c0y3i, C869590Y9l c869590Y9l, Map<String, List<C0YA1>> map, Map<String, List<C0YA1>> map2, Long l, Long l2) {
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void nc(List<? extends C869590Y9l> list) {
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void ns(String str) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZLLL(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        C356901a3.LJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        C356901a3.LJFF(this, lifecycleOwner);
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void su(C869590Y9l c869590Y9l, boolean z) {
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void u6(List<C869590Y9l> list, boolean z) {
    }

    @Override // X.C1DW6
    public final void yf1(C1DW6 c1dw6) {
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.IMessagePowerAdapterProtocol
    public final void C() {
        InterfaceC892260YzQ interfaceC892260YzQ = (InterfaceC892260YzQ) this.LLILZ.getValue();
        if (interfaceC892260YzQ != null) {
            interfaceC892260YzQ.C();
        }
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C914160Zte(15);
    }

    public final SessionInfo vQ2() {
        return (SessionInfo) this.LLILLJJLI.getValue();
    }

    public final void wQ2() {
        List<C869590Y9l> listLIZLLL = ((InterfaceC1755906uD) this.LLILLL.getValue()).LIZLLL();
        ArrayList arrayList = new ArrayList();
        for (C869590Y9l c869590Y9l : listLIZLLL) {
            if (C0ZDR.LIZ(c869590Y9l)) {
                arrayList.add(c869590Y9l);
            }
        }
        InterfaceC892260YzQ interfaceC892260YzQ = (InterfaceC892260YzQ) this.LLILZ.getValue();
        if (interfaceC892260YzQ != null) {
            interfaceC892260YzQ.PW0(arrayList);
        }
        InterfaceC892260YzQ interfaceC892260YzQ2 = (InterfaceC892260YzQ) this.LLILZIL.getValue();
        if (interfaceC892260YzQ2 != null) {
            interfaceC892260YzQ2.PW0(arrayList);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        C892280YzS c892280YzS = this.LLILZLL;
        if (c892280YzS != null) {
            IMWebSocketBridgeApi iMWebSocketBridgeApi = c892280YzS.LLILZ;
            if (iMWebSocketBridgeApi != null) {
                iMWebSocketBridgeApi.LIZIZ(c892280YzS);
            }
            C2171608f4 c2171608f4 = c892280YzS.LLILZIL;
            AnonymousClass0956 anonymousClass0956 = c2171608f4.LIZJ;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            c2171608f4.LIZJ = null;
        }
        C0YI5 c0yi5LIZ = C876340YZk.LIZ(C876340YZk.LIZ);
        ((C876310YZh) c0yi5LIZ).LIZ.LJIJI().LJII(vQ2().getConversationId(), this);
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.IMessagePowerAdapterProtocol
    public final void YP2(List<? extends C869590Y9l> list, List<? extends InterfaceC904740ZeS> list2, List<? extends InterfaceC1891350zJl> list3) {
        wQ2();
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void d5(List<C869590Y9l> list, int i, C0Y7P c0y7p) {
        InterfaceC892260YzQ interfaceC892260YzQ = (InterfaceC892260YzQ) this.LLILZ.getValue();
        if (interfaceC892260YzQ != null) {
            interfaceC892260YzQ.T20();
        }
        InterfaceC892260YzQ interfaceC892260YzQ2 = (InterfaceC892260YzQ) this.LLILZIL.getValue();
        if (interfaceC892260YzQ2 != null) {
            interfaceC892260YzQ2.T20();
        }
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void a(int i, String str, List list, Long l) {
        wQ2();
    }
}
